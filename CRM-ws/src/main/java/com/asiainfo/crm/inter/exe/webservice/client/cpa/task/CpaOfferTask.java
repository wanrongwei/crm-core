package com.asiainfo.crm.inter.exe.webservice.client.cpa.task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.ivalues.IBOBsFtpPathValue;
import com.ai.common.util.FtpUtil;
import com.asiainfo.appframe.ext.exeframe.task.TaskFrameWork;
import com.asiainfo.appframe.ext.exeframe.task.interfaces.ITask;
import com.asiainfo.appframe.ext.exeframe.task.query.ivalues.IBOCfgTaskParamValueValue;
import com.asiainfo.appframe.ext.exeframe.task.query.service.interfaces.ITaskSV;
import com.asiainfo.crm.inter.exe.webservice.client.cpa.bo.BOCpaOfferBean;
import com.asiainfo.crm.inter.exe.webservice.client.cpa.bo.IBOCpaOfferValue;
import com.asiainfo.crm.inter.exe.webservice.client.cpa.service.interfaces.ICpaServiceSV;

public class CpaOfferTask implements ITask {
	
	private static transient Log log = LogFactory.getLog(CpaOfferTask.class);

//	private static final TASK_TYPE type = TASK_TYPE.CPA_OFFER;
	private static final String fileType="OFFERIDLIST";
	private FtpUtil ftp = null; 
	private  String ftpPath = null;
	private IBOBsFtpPathValue bsFtpPath = null;
	
	@Override
	public String doTask(long cfgTaskId) throws Exception {
		try {
			execute(cfgTaskId);
		} catch (Exception e) {
			throw e;
		}
		return cfgTaskId + this.getClass().getSimpleName() + "doTask successed!";
	}

	private void execute(long cfgTaskId) throws Exception {
		
		ITaskSV taskSV = (ITaskSV) ServiceFactory.getService(ITaskSV.class);
		IBOCfgTaskParamValueValue[] taskParams = taskSV.getCfgTaskParamValueByTaskId(cfgTaskId);

		Map<Long, String> params = new HashMap<Long, String>();
		for (IBOCfgTaskParamValueValue taskParam : taskParams) {
			params.put(taskParam.getParamId(), taskParam.getParamValue());
		}
		ftpPath = params.get(1001L);
		initFtp(ftpPath);
//		FtpUtil ftp = type.getFtp();
		List<String> filterFiles = CpaTaskHelper.getFilterNames(ftp,fileType);
		
		/*
		 * 把改修改offer状态挪到这里，避免一次同步多个文件导致前面修改的状态被后面改回去了
		 * 把 dealLocaleFile 里面注释起来了
		*/
		if(!filterFiles.isEmpty()){
			ICpaServiceSV cpaSv = (ICpaServiceSV) ServiceFactory.getService(ICpaServiceSV.class);
			Timestamp timestamp = cpaSv.getCpaOfferSysDate();
			log.debug("Delete All Cpa Offers");
			cpaSv.deleteCpaOffer(timestamp);
		}
		for (String name : filterFiles) {
			log.debug("Ready to download file from ftp: " + name);
			ftp.download(name, name);
			log.debug("Success to download file from ftp: " + name);
			log.debug("Ready to move file to remote ftp history directory: " + name);
			ftp.moveFileToRemoteHisDir(name);
			log.debug("Success to move file to remote ftp history directory: " + name);
			// 注释了
//			ftp.close();
			dealLocaleFile(name);
			log.debug("Ready to move file to local history directory: " + name);
			CpaTaskHelper.moveLocalFileToHis(name, null,bsFtpPath);
			log.debug("Success to move file to local history directory: " + name);
		}
		// 这里加也不行
		ftp.close();
	}
	
	private void initFtp(String ftpPath){
		try {
			ftp = new FtpUtil(ftpPath);
			bsFtpPath=ftp.getBsFtpPath();
			CpaTaskHelper.validateRemotePath(bsFtpPath);
		} catch (Exception e) {
//			e.printStackTrace();
			log.error(e);
		}
	}
	
	private String dealLocaleFile(String name) throws Exception {
		log.debug("Start to deal local file: " + name);
		ICpaServiceSV cpaSv = (ICpaServiceSV) ServiceFactory.getService(ICpaServiceSV.class);
		Timestamp timestamp = cpaSv.getCpaOfferSysDate();
		/*
		 * 注释了 log.debug("Delete All Cpa Offers");
		 * cpaSv.deleteCpaOffer(timestamp);
		 */
		BufferedReader br = null;
		FileReader fileReader = null;
		try {
			String url = bsFtpPath.getLocalPath() + "/" + name;
			fileReader = new FileReader(url);
			br = new BufferedReader(fileReader);
			String line = "";
			List<IBOCpaOfferValue> list = new ArrayList<IBOCpaOfferValue>();
			while ((line = br.readLine()) != null) {
				if (line.length() == 0) {
					continue;
				}
				String[] item = line.split("\\|");
				if (item.length != 2) {
					continue;
				}
				BOCpaOfferBean value = new BOCpaOfferBean();
				value.setOfferSeq(cpaSv.getCpaOfferNewId());
				value.setOfferId(item[0]);
				value.setOfferName(item[1]);
				value.setCreateDate(timestamp);
				value.setStateDate(timestamp);
				value.setState("U");
				list.add(value);
				if (list.size() % 2000 == 0) {
					log.debug("List size is larger than 2000, do save progress and clear list");
					cpaSv.saveCpaOffer(list.toArray(new BOCpaOfferBean[list.size()]));
					list.clear();
				}
			}
			log.debug("Do save progress to save " + list.size() + " cpa offers");
			cpaSv.saveCpaOffer(list.toArray(new BOCpaOfferBean[list.size()]));
		} catch (Exception e) {
			if(log.isDebugEnabled()){
				log.debug("", e);
			}
//			e.printStackTrace();
		} finally {
			if (fileReader != null) {
				fileReader.close();
			}
			if (br != null) {
				br.close();
			}
		}
		// br.close();
		return name;
	}

	public static void main(String[] args) throws Exception {
		System.setProperty("tenant.id", "21");
//		new CpaOfferTask().doTask(10050004L);
		TaskFrameWork.main(new String[]{"CRM_INS_CPA_OFFER_TASK_21","1","0"});

	}
}
