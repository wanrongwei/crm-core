package com.asiainfo.crm.inter.exe.webservice.client.wimp.task;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.ivalues.IBOBsFtpPathValue;
import com.ai.common.util.FtpUtil;
import com.asiainfo.appframe.ext.exeframe.task.interfaces.ITask;
import com.asiainfo.crm.inter.exe.webservice.client.wimp.service.interfaces.ISubscriberSV;

/**
 * downloadActivatedWIMPSubscribers
 * 
 * @author laizq 解析检验文件，存数据库 2014-12-23
 */
public class SubscriberTask implements ITask {

	private static Log log = LogFactory.getLog(SubscriberTask.class);

	private String backDirectory = null;// 备份目录 参数配置在cfg_task_param_value里
										// --10011

	private String wimpDirectory = null;// 本地wimp要解析的目录 -- 10010

	private String[] fileNames = null;// 要解析的文件名称数组

	private FtpUtil ftpUtil = null;// ftp配置工具

	/**
	 * 从本地文件目录读取文件解析
	 */
	@Override
	public String doTask(long taskId) throws Exception {
		System.setProperty("tenant.id", "21");//设置租户
		long startTime = System.currentTimeMillis();
		if (log.isErrorEnabled()) {
			log.error("downloadActivatedWIMPSubscribers(taskId=" + taskId
					+ ") is begin,the time is:" + startTime);
		}

		initFtp();
		getFtpFiles();// 将文件从FTP上取下来，保存在本地
		// 解析文件
		doJobs(wimpDirectory);

		long endTime = System.currentTimeMillis();
		if (log.isErrorEnabled()) {
			log.error("downloadActivatedWIMPSubscribers(taskId=" + taskId
					+ ")  is end;total cost times: " + (endTime - startTime));
		}
		return taskId + this.getClass().getSimpleName() + " doTask finish!";
	}

	/**
	 * 检查目录的有效性
	 */
	public boolean checkDirectory(String dirctory) {
		File dirFile = new File(dirctory);
		if (!(dirFile.exists() && dirFile.isDirectory())) {
			return false;
		}
		return true;

	}

	public void initFtp() throws Exception {
		try {
			ftpUtil = new FtpUtil("UIP_WIMP_FTP");
		} catch (Exception e) {
			throw e;
		}

	}

	public void doJobs(String directory) throws Exception {
		File wimpDirFile = new File(directory);
		fileNames = wimpDirFile.list(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {

				SubscriberFileName subscriberFileName = new SubscriberFileName(
						name);
				if (subscriberFileName.isValid()) {
					return true;
				}
				return false;
			}
		});

		if (fileNames != null && fileNames.length > 0) {
			if (log.isErrorEnabled()) {
				log.error("The current task can handle file list");   // 当前task可以处理的文件列表
				for (String fileName : fileNames) {
					log.error(wimpDirectory + File.separator + fileName);
				}
			}
		} else {
			if (log.isErrorEnabled()) {
				log.error("The current task without can handle file");  // 当前task没有可以处理的文件
			}
			return;
		}

		for (String fileName : fileNames) {
			if (log.isErrorEnabled()) {
				log.error("Start processing the file " + fileName);  // 开始处理文件
			}
			parseFile(fileName);
			if (log.isErrorEnabled()) {
				log.error(fileName + "To deal with end  ");  //处理结束
			}
		}
	}

	/**
	 * 
	 * @param directory
	 * @param fileName
	 */
	public void parseFile(String fileName) {
		BufferedReader reader = null;
		File subscriberFile = new File(wimpDirectory + File.separator
				+ fileName);
		ISubscriberSV subscriberSV = (ISubscriberSV) ServiceFactory
				.getService(ISubscriberSV.class);
		// 先备份再解析
		if (log.isErrorEnabled()) {
			log.error(fileName + "To start backup");  // 开始备份
		}
		if (!backFile(subscriberFile, backDirectory)) {// 文件备份失败不解析
			if (log.isErrorEnabled()) {
				log.error(fileName + "Backup fails, skip the parsing, the backup directory :" + backDirectory);  // 备份失败，跳过解析，备份目录
			}
			return;
		} else {
			if (log.isErrorEnabled()) {
				log.error(fileName + "The backup successful ");  // 备份成功
			}
		}
         SubscriberFileName subscriName = null;
		try {
			subscriName = new SubscriberFileName(fileName);
			// 解析文件数据
			reader = new BufferedReader(new FileReader(subscriberFile));
			subscriberSV.parseData(reader, subscriName.getCreateTime());

		} catch (Exception e) {
			if (log.isErrorEnabled()) {
				log.error(e);
			}
		} finally {
			try {
				if(null != reader){
					reader.close();
				}
			} catch (IOException e) {
				if (log.isErrorEnabled()) {
					log.error(e);

				}
			}
		}
           
		// 解析完再删除文件
		subscriberFile.delete();
		if (log.isErrorEnabled()) {
			log.error(fileName + "File deletion to complete");  // 文件删除完成
		}
		
		if(log.isErrorEnabled()){
			log.error("Began to update state , the batch is: "+subscriName.getCreateTime() );  // 开始更新批次为: 的状态
		}
		//数据入库后，更新wimp状态
        try {
			subscriberSV.updateWimpActiveState(subscriName.getCreateTime());
		} catch (Exception e) {
			if(log.isErrorEnabled()){
				log.error(e);
			}
		}
        if(log.isErrorEnabled()){
			log.error("Status updates to complete.  Batch is: "+subscriName.getCreateTime() +"");   // 批次为:   的状态更新完毕
		}
        
	}

	/**
	 * 获取FTP上的文件,将符合要尔的文件下载到本地
	 */
	public void getFtpFiles() throws Exception {
		//
		IBOBsFtpPathValue bsFtpPathValue = ftpUtil.getBsFtpPath();
		if (bsFtpPathValue == null) {
			throw new Exception("No configuration ftp_path_value");
		}

		backDirectory = bsFtpPathValue.getLocalPathHis();
		wimpDirectory = bsFtpPathValue.getLocalPath();
		if (backDirectory == null || wimpDirectory == null) {
			throw new Exception("Local WIMP, no configuration backup directory in bs_ftp_path table");  //本地WIMP目录和备份目录没有配置 在bs_ftp_path 表
		}

		if (!checkDirectory(wimpDirectory)) {
			throw new Exception("Local wimp directory is invalid:" + wimpDirectory);  // 本地wimp目录无效:
		}

		if (!checkDirectory(backDirectory)) {
			throw new Exception("Invalid WIMP backup directory:" + backDirectory);  // WIMP备份目录无效：
		}

		if (log.isErrorEnabled()) {
			log.error("Local WIMP directory as follows:" + wimpDirectory);
			log.error("The backup directory:" + backDirectory);
		}

		ftpUtil.changeWorkingDirectory(bsFtpPathValue.getRemotePath());
		String[] remoteFileName = ftpUtil.list();

		for (String fileName : remoteFileName) {
			SubscriberFileName remoteSubscriberFileName = new SubscriberFileName(
					fileName);
			if (remoteSubscriberFileName.isValid()) {
				if (log.isErrorEnabled()) {
					log.error("Download files from the FTP(" + fileName + "),Local storage path is:"
							+ bsFtpPathValue.getLocalPath());
				}
				// 下载文件到本地
				try {
					ftpUtil.download(fileName, fileName);
					ftpUtil.moveFileToRemoteHisDir(fileName);
				} catch (Exception e) {
					throw e;
				}
				if (log.isErrorEnabled()) {
					log.error("Download the file successfully:" + fileName);
				}
			}
		}
	}

	/**
	 * 备份数据文件，备份失败不解析
	 * 
	 * @param source
	 * @param dirctory
	 * @return
	 */
	public boolean backFile(File source, String dirctory) {
		File backupFile = new File(dirctory + File.separator + source.getName());
		BufferedWriter writer = null;
		BufferedReader reader = null;
		try {
			writer = new BufferedWriter(new FileWriter(
					backupFile));
			reader = new BufferedReader(new FileReader(source));
			String data = null;
			String lineSeparator = System.getProperty("line.separator");
			while ((data = reader.readLine()) != null) {
				writer.write(data + lineSeparator);
			}

			writer.close();
			reader.close();
		} catch (IOException e) {
			if (log.isErrorEnabled()) {
				log.error("" , e);
			}
			return false;
		}finally{
			if(null != reader){
				try {
					reader.close();
				} catch (IOException e) {
					if (log.isErrorEnabled()) {
						log.error("BufferedReader Close :" , e);
					}
				}
			}
			if(null != writer){
				try {
					writer.close();
				} catch (IOException e) {
					if (log.isErrorEnabled()) {
						log.error("BufferedWriter Close :" ,e);
					}
				}
			}
		}

		return true;

	}

	public static void main(String[] args) throws Exception {

		// System.setProperty("tenant.id", "21");
		// String lineSeparator = System.getProperty("line.separator");
		new SubscriberTask().doTask(50000010017L);

	}

}
