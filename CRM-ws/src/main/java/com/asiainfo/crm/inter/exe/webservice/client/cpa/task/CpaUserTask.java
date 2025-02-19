package com.asiainfo.crm.inter.exe.webservice.client.cpa.task;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.complex.tab.split.TenantIDFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.ivalues.IBOBsFtpPathValue;
import com.ai.common.util.FtpUtil;
import com.asiainfo.appframe.ext.exeframe.task.interfaces.ITask;
import com.asiainfo.appframe.ext.exeframe.task.query.ivalues.IBOCfgTaskParamValueValue;
import com.asiainfo.appframe.ext.exeframe.task.query.service.interfaces.ITaskSV;
import com.asiainfo.crm.inter.exe.webservice.client.cpa.bo.BOCpaUserBean;
import com.asiainfo.crm.inter.exe.webservice.client.cpa.service.interfaces.ICpaServiceSV;

public class CpaUserTask implements ITask {
	
	private  static Log log = LogFactory.getLog(CpaUserTask.class);
	
	private String ftpPath =null;
	private FtpUtil ftp = null;
	private static final String fileType="VERISFULLECHO";
	private IBOBsFtpPathValue bsFtpPath = null;
	private static long beforetime=259200000L;//三天     单位：ms
	private static String tableName="UIP_CPA_FILE_";
//	private static long beforetime=600000L;
	
	@Override
	public String doTask(long cfgTaskId) throws Exception {
		try {
			execute(cfgTaskId);
		} catch (Exception e) {
			throw e;
		}finally {
			if(ftp!=null) {
				ftp.close();
			}
		}
		return cfgTaskId + this.getClass().getSimpleName() + " doTask successed!";
	}

	private void execute(long cfgTaskId) throws Exception {
//		FtpUtil ftp = type.getFtp();
		String tenantId = TenantIDFactory.getTenantId();
		if(StringUtils.isEmpty(tenantId))
			throw new Exception("tenantId is null or empty");
		ITaskSV taskSV = (ITaskSV) ServiceFactory.getService(ITaskSV.class);
		IBOCfgTaskParamValueValue[] taskParams = taskSV.getCfgTaskParamValueByTaskId(cfgTaskId);

		Map<Long, String> params = new HashMap<Long, String>();
		for (IBOCfgTaskParamValueValue taskParam : taskParams) {
			params.put(taskParam.getParamId(), taskParam.getParamValue());
		}
		ftpPath = params.get(1001L);
		initFtp();
		String fileName =dealLocaleFile(tenantId);
		if (fileName != null && fileName.trim().length() > 0) {
			CpaFileName cpaFileName = new CpaFileName(fileName);
			String tmpFileName = cpaFileName.getTmpFileName();
			ftp.upload(tmpFileName, tmpFileName);
			ftp.rename(tmpFileName, fileName);
			//注释了
			ftp.close();

			CpaTaskHelper.moveLocalFileToHis(tmpFileName, fileName,bsFtpPath);
//			type.doAfterSync(new Timestamp(TASK_TYPE.SDF.parse(cpaFileName.getCreateTime()).getTime()));
		}
	}

	/**
	 * 初始化FTP
	 * 
	 * @throws Exception
	 */
	public void initFtp(){
		try {
			ftp = new FtpUtil(ftpPath);
			bsFtpPath=ftp.getBsFtpPath();
			CpaTaskHelper.validateRemotePath(bsFtpPath);
		} catch (Exception e) {
//			e.printStackTrace();
			log.error(e);
		}

	}
	
	
	public String dealLocaleFile(String tenantId) throws Exception {
		ICpaServiceSV cpaSv = (ICpaServiceSV) ServiceFactory.getService(ICpaServiceSV.class);
		Timestamp timestamp = cpaSv.getCpaOfferSysDate();
//		BOCpaUserBean[] syncCpaUsers = cpaSv.getSyncCpaUsers(timestamp);
		// 全量的时候同步所有有用数据
		BOCpaUserBean[] syncCpaUsers = cpaSv.getSyncCpaAllUsers();
		String localPathHis = ftp.getBsFtpPath().getLocalPathHis();
		//清理三天前的his文件
		try{
			CpaTaskHelper.clearHisFile(localPathHis, beforetime, new Date().getTime());
		}catch(Exception e){
			log.info("Clear hisfile fail!", e);
		}
//		BOCpaOfferBean[] cpaOffers = cpaSv.getCpaOffers();
		// 过滤不在offerList 里面的用户
//		HashMap<String, BOCpaOfferBean> offerMap = getOfferMap(cpaOffers);
//		ArrayList<BOCpaUserBean> userList = new ArrayList<BOCpaUserBean>();
//		if(syncCpaUsers.length > 0 ){
//			for(BOCpaUserBean user : syncCpaUsers){
//				String offerId = user.getExt1();
//				if(offerMap.containsKey(offerId)){
//					userList.add(user);
//				}
//			}
//		}
//		List<BOCpaUserBean> mergeUserList = mergeUser(userList);
		if (syncCpaUsers.length > 0) {
			String finalName = "";
			CpaFileName newFileName = null;
			FileOutputStream outputStream = null;
			try {
				newFileName = new CpaFileName();
				newFileName.setCreateTime(CpaTaskHelper.FILE_SDF.format(timestamp));
				newFileName.setFileType(fileType);
				newFileName.setPrefix("AI"+tenantId);
				newFileName.setSeqNum(cpaSv.getFileSeq(tableName+tenantId));
				newFileName.setSystemType(CpaTaskHelper.SYSTEM_TYPE);
				String tmpFileName = newFileName.getTmpFileName();
				String localUrl = bsFtpPath.getLocalPath() + "/" + tmpFileName;
				File file = new File(localUrl);
				long fileSize = 0L;
				long recordSize = 0L;
				outputStream = new FileOutputStream(file, true);
				byte[] header = CpaTaskHelper.getFileHeader(timestamp,fileType).getBytes(CpaTaskHelper.UTF_8);
				outputStream.write(header);
				fileSize += header.length;
				for (BOCpaUserBean bean : syncCpaUsers) {
					if(StringUtils.isNotEmpty(bean.getSubscriberCompany()) && bean.getSubscriberCompany().contains("|")) {
						bean.setSubscriberCompany(bean.getSubscriberCompany().replace("|", " "));
					}
					byte[] recode = getCpaUserRecord(bean).getBytes(CpaTaskHelper.UTF_8);
					outputStream.write(recode);
					fileSize += recode.length;
				}
				recordSize = syncCpaUsers.length;
				byte[] footer = CpaTaskHelper.getFileFooter(recordSize).getBytes(CpaTaskHelper.UTF_8);
				outputStream.write(footer);
				fileSize += footer.length;
				newFileName.setFileSize(fileSize);
				finalName = newFileName.getFinalFileName();
			} catch (Exception e) {
				if(log.isDebugEnabled()){
					log.debug("", e);
				}
//				e.printStackTrace();
			} finally {
				if (outputStream != null) {
					outputStream.close();
				}
			}
			return finalName;
		}
		return null;
	}
	
	private String getCpaUserRecord(BOCpaUserBean bean) {
			StringBuilder sb = new StringBuilder();
			sb.append(CpaTaskHelper.getdisNullValue(bean.getSubcriberNo())).append(CpaTaskHelper.SEPERATOR).append(CpaTaskHelper.getdisNullValue(bean.getCustomerId())).append(CpaTaskHelper.SEPERATOR);
			sb.append(CpaTaskHelper.getdisNullValue(bean.getSubscriberId())).append(CpaTaskHelper.SEPERATOR).append(CpaTaskHelper.getdisNullValue(bean.getSubStatus())).append(CpaTaskHelper.SEPERATOR);
			sb.append(CpaTaskHelper.getdisNullValue(bean.getImsi())).append(CpaTaskHelper.SEPERATOR).append(CpaTaskHelper.getdisNullValue(bean.getBan())).append(CpaTaskHelper.SEPERATOR);
			sb.append(CpaTaskHelper.getdisNullValue(bean.getCustomerSegment())).append(CpaTaskHelper.SEPERATOR).append(CpaTaskHelper.getdisNullValue(bean.getTenantId())).append(CpaTaskHelper.SEPERATOR);
			sb.append(CpaTaskHelper.getdisNullValue(bean.getSubscriberCompany())).append(CpaTaskHelper.SEPERATOR).append(CpaTaskHelper.getdisNullValue(bean.getTestSimFlag()));
			sb.append(CpaTaskHelper.SEPERATOR);
			sb.append(CpaTaskHelper.getdisNullValue(bean.getMvnoBrand())).append(CpaTaskHelper.SEPERATOR).append(CpaTaskHelper.getdisNullValue(bean.getEquipmentNo())).append(CpaTaskHelper.SEPERATOR);
			sb.append(CpaTaskHelper.getdisNullValue(bean.getCycleType())).append(CpaTaskHelper.SEPERATOR).append(CpaTaskHelper.getdisNullValue(bean.getCycleUnit())).append(CpaTaskHelper.SEPERATOR);
			sb.append(CpaTaskHelper.getdisNullValue(bean.getFirstBillDate())).append(CpaTaskHelper.SEPERATOR).append(CpaTaskHelper.getdisNullValue(CpaTaskHelper.SDF.format(bean.getOriginalInitDate())));
			sb.append(CpaTaskHelper.SEPERATOR).append(CpaTaskHelper.getdisNullValue(bean.getProducts())).append(CpaTaskHelper.SEPERATOR);
			sb.append(CpaTaskHelper.getdisNullValue(bean.getExt4())).append(CpaTaskHelper.SEPERATOR);
			sb.append(CpaTaskHelper.getdisNullValue(bean.getExt3())).append(CpaTaskHelper.SEPERATOR);
			sb.append(CpaTaskHelper.getdisNullValue(bean.getExt1())).append(CpaTaskHelper.SEPERATOR);
			sb.append(CpaTaskHelper.getdisNullValue(bean.getExt2())).append(CpaTaskHelper.SEPERATOR);
			sb.append(CpaTaskHelper.getdisNullValue(bean.getSuspensionReasonCode())).append(CpaTaskHelper.CRLF);
			return sb.toString();
	}
	public static void main(String[] args) throws Exception {
		System.setProperty("tenant.id", "21");
		new CpaUserTask().doTask(10050006L);
		new CpaUserTask().doTask(10050006L);
//		TaskFrameWork.main(new String[]{"CRM_INS_CPA_USER_TASK_21","1","0"});
//		new CpaUserTask().doTask(10050018L);
	}

}
