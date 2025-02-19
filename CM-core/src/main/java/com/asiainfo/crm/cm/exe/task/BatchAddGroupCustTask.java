package com.asiainfo.crm.cm.exe.task;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.FtpUtil;
import com.asiainfo.appframe.ext.exeframe.task.interfaces.ITask;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;

/**
 * 
 * 
 * Copyright: Copyright (c) 2014 Asiainfo-Linkage
 * 
 * @ClassName: BatchAddGroupCustTask 
 * @Description: 批量新增集团客户
 * 
 * @version: v1.0.0
 * @author: chenxq
 * @date:  2014-2-12 上午10:04:08
 * 
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2014-2-12     chenxq          v1.0.0             修改原因
 */
public class BatchAddGroupCustTask implements ITask {

	private static final Log log = LogFactory.getLog(BatchAddGroupCustTask.class);

	public String doTask(long taskId) throws Exception {
		String retMsg = "";
		StringBuffer prefixName = new StringBuffer();// 文件前缀名
		String suffixName = "xls";// 文件后缀名

		FtpUtil ftpUtil = new FtpUtil("CM_BATCH_ADD_GROUP_CUST");// 配置ftp路径

		prefixName = prefixName.append("Corporate");

		String[] allFiles = ftpUtil.list(ftpUtil.getBsFtpPath().getRemotePath().trim());// 获取FTP服务器上该路径内的所有文件名

		List list = new ArrayList();
		// 判断ftp上的文件命名是否符合约定
		try {
			if (null != allFiles && allFiles.length > 0) {
				for (int j = 0; j < allFiles.length; j++) {
					if (allFiles[j].startsWith(prefixName.toString()) && allFiles[j].endsWith(suffixName)) {
						// 文件符合约定的标准，则把文件下载到配置好的本地路径
						ftpUtil.download(allFiles[j], allFiles[j]);
						// 记录下载的文件名
						list.add(allFiles[j]);
					}
				}
			}
		} catch (Exception e) {
			log.error("Download file error:" + e.getMessage(), e);
			retMsg = e.getMessage();
			return taskId + retMsg;
		} finally {
			if (null != ftpUtil) {
				ftpUtil.close();
			}
		}

		// 下载完成后，开始处理读取解析下载的文件
		String[] downloadFiles = (String[]) list.toArray(new String[0]);
		List fileInfo = new ArrayList();
		InputStream is = null;
		try {
			if (null != downloadFiles && downloadFiles.length > 0) {
				for (int i = 0; i < downloadFiles.length; i++) {
					File file = new File(ftpUtil.getBsFtpPath().getLocalPath() + "/" + downloadFiles[i]);
					try {
						is = new FileInputStream(file);
						fileInfo.addAll(CmCommonUtil.parseExcel(is));
					} catch (Exception e) {
						log.error(e.getMessage(), e);
						e.printStackTrace();
					} finally {
						if (is != null) {
							try {
								is.close();
							} catch (Exception e) {
								log.error(e.getMessage(), e);
								e.printStackTrace();
							}
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			log.error("Error reading from file :" + e.getMessage(), e);
			retMsg = e.getMessage();
			return taskId + retMsg;
		}
		// 解析fileInfo，把值设到groupValue对象中，然后入库
		ICmCustomerSV sv = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		List groupList = new ArrayList();
		if (!fileInfo.isEmpty()) {
			for (int i = 0; i < fileInfo.size(); i++) {
				List oneFile = (List) fileInfo.get(i);// 一个文件
				if (!oneFile.isEmpty()) {
					for (int j = 0; j < oneFile.size(); j++) {

						// set......
						// set......
						groupList.add("XXXXX");
					}
				}
			}
		}
		IVOCustValue val = null;
		sv.saveCustomer(val);// 这边提供一个批量保存的接口

		return taskId + retMsg;
	}

	public static void main(String[] args) throws Exception {
		BatchAddGroupCustTask task = new BatchAddGroupCustTask();
		task.doTask(999999999999L);
	}
}
