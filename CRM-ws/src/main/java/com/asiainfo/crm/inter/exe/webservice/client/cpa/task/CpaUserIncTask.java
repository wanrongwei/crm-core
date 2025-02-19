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
import com.ai.common.util.TimeUtil;
import com.asiainfo.appframe.ext.exeframe.task.interfaces.ITask;
import com.asiainfo.appframe.ext.exeframe.task.query.ivalues.IBOCfgTaskParamValueValue;
import com.asiainfo.appframe.ext.exeframe.task.query.service.interfaces.ITaskSV;
import com.asiainfo.crm.inter.exe.webservice.client.cpa.bo.BOCpaUserBean;
import com.asiainfo.crm.inter.exe.webservice.client.cpa.service.interfaces.ICpaServiceSV;

/**
 * 增量同步用户信息
 * 
 * @author zoudj
 *
 */
public class CpaUserIncTask implements ITask {

	private static Log log = LogFactory.getLog(CpaUserIncTask.class);
	private String ftpPath = null;
	private FtpUtil ftp;

	private static final String fileType = "VERISINCRECHO";
	private IBOBsFtpPathValue bsFtpPath = null;
	private static long beforetime = 259200000L;// 三天 单位：ms
	private static String tableName = "UIP_CPA_INC_FILE_";

	@Override
	public String doTask(long cfgTaskId) throws Exception {
		try {
			execute(cfgTaskId);
		} catch (Exception e) {
			throw e;
		}finally{
			if(ftp!=null)
				ftp.close();
		}
		return cfgTaskId + this.getClass().getSimpleName()
				+ " doTask successed!";
	}

	private void execute(long cfgTaskId) throws Exception {
		// FtpUtil ftp = type.getFtp();
		String tenantId = TenantIDFactory.getTenantId();
		if (StringUtils.isEmpty(tenantId))
			throw new Exception("tenantId is null or empty");
		ITaskSV taskSV = (ITaskSV) ServiceFactory.getService(ITaskSV.class);
		IBOCfgTaskParamValueValue[] taskParams = taskSV
				.getCfgTaskParamValueByTaskId(cfgTaskId);

		Map<Long, String> params = new HashMap<Long, String>();
		for (IBOCfgTaskParamValueValue taskParam : taskParams) {
			params.put(taskParam.getParamId(), taskParam.getParamValue());
		}
		ftpPath = params.get(1001L);
		initFtp();
		String fileName = dealLocaleFile(tenantId);
		if (fileName != null && fileName.trim().length() > 0) {
			CpaFileName cpaFileName = new CpaFileName(fileName);
			String tmpFileName = cpaFileName.getTmpFileName();
			ftp.upload(tmpFileName, tmpFileName);
			ftp.rename(tmpFileName, fileName);
			ftp.close();

			CpaTaskHelper.moveLocalFileToHis(tmpFileName, fileName, bsFtpPath);
			// type.doAfterSync(new
			// Timestamp(TASK_TYPE.SDF.parse(cpaFileName.getCreateTime()).getTime()));
		}
	}

	/**
	 * 初始化FTP
	 * 
	 * @throws Exception
	 */
	public void initFtp() {
		try {
			ftp = new FtpUtil(ftpPath);
			bsFtpPath = ftp.getBsFtpPath();
			CpaTaskHelper.validateRemotePath(bsFtpPath);
		} catch (Exception e) {
			// e.printStackTrace();
			log.error(e);
		}

	}

	public String dealLocaleFile(String tenantId) throws Exception {
		ICpaServiceSV cpaSv = (ICpaServiceSV) ServiceFactory
				.getService(ICpaServiceSV.class);
		Timestamp taskTime = cpaSv.getCpaOfferSysDate();
		Timestamp startTime = getBeforeTime(taskTime);
		BOCpaUserBean[] syncCpaUsers = cpaSv.getSyncCpaIncUsers(startTime, taskTime);
		String localPathHis = ftp.getBsFtpPath().getLocalPathHis();
		// 清理三天前的his文件
		try {
			CpaTaskHelper.clearHisFile(localPathHis, beforetime,
					new Date().getTime());
		} catch (Exception e) {
			log.error("Clear hisfile fail!", e);
		}
		String finalName = "";
		CpaFileName newFileName = null;
		FileOutputStream outputStream = null;
		try {

			newFileName = new CpaFileName();
			newFileName.setCreateTime(CpaTaskHelper.FILE_SDF.format(taskTime));
			newFileName.setFileType(fileType);
			newFileName.setPrefix("AI" + tenantId);
			newFileName.setSeqNum(cpaSv.getIncFileSeq(tableName + tenantId));
			newFileName.setSystemType(CpaTaskHelper.SYSTEM_TYPE);
			String tmpFileName = newFileName.getTmpFileName();
			String localUrl = bsFtpPath.getLocalPath() + "/" + tmpFileName;
			File file = new File(localUrl);
			long fileSize = 0L;
			long recordSize = 0L;
			outputStream = new FileOutputStream(file, true);
			byte[] header = CpaTaskHelper.getFileHeader(taskTime, fileType)
					.getBytes(CpaTaskHelper.UTF_8);
			outputStream.write(header);
			fileSize += header.length;
			if (syncCpaUsers.length > 0) {
				for (BOCpaUserBean bean : syncCpaUsers) {
					resetCpaUserState(bean, startTime);
					dealSubsriberCompany(bean);
					byte[] recode = getCpaUserRecord(bean).getBytes(
							CpaTaskHelper.UTF_8);
					outputStream.write(recode);
					fileSize += recode.length;
				}
				recordSize = syncCpaUsers.length;
				byte[] footer = CpaTaskHelper.getFileFooter(recordSize)
						.getBytes(CpaTaskHelper.UTF_8);
				outputStream.write(footer);
				fileSize += footer.length;
				newFileName.setFileSize(fileSize);
				finalName = newFileName.getFinalFileName();
				return finalName;
			} else {
				byte[] footer = CpaTaskHelper.getFileFooter(recordSize)
						.getBytes(CpaTaskHelper.UTF_8);
				outputStream.write(footer);
				fileSize += footer.length;
				newFileName.setFileSize(fileSize);
				finalName = newFileName.getFinalFileName();
				return finalName;
			}
		} catch (Exception e) {
			if (log.isErrorEnabled()) {
				log.error("", e);
			}
			// e.printStackTrace();
		} finally {
			if (outputStream != null) {
				outputStream.close();
			}
		}
		return finalName;
	}

	/**
	 * 	AI-14425,
	 * 	如果SUBSCRIBER_COMPANY包含有“|”，则以空格代替
	 * @param bean
	 */
	private void dealSubsriberCompany(BOCpaUserBean bean) {
		String subscriberCompany = bean.getSubscriberCompany();
		if(StringUtils.isNotEmpty(subscriberCompany) && subscriberCompany.contains("|")) {
			bean.setSubscriberCompany(subscriberCompany.replace("|", " "));
		}
	}

	private Timestamp getBeforeTime(Timestamp current) {
		Date beforeDate = TimeUtil.addOrMinusMinutes(current.getTime(),
				CpaTaskHelper.BEFORE);
		return new Timestamp(beforeDate.getTime());
	}
	
	// In 10 minutes, insert first and update then, it would overrides the insert state.
	// if(dmlaction = update && create_date after startTime && create_date before stateTime )  set dmlaction = insert
	private void resetCpaUserState(BOCpaUserBean bean, Timestamp startTime) {
		if("UPDATE".equalsIgnoreCase(bean.getDmlAction()) && bean.getCreateDate().after(startTime) 
				&& bean.getCreateDate().before(bean.getStateDate())) {
			bean.setDmlAction("INSERT");
		}
	}

	private String getCpaUserRecord(BOCpaUserBean bean) {
		StringBuilder sb = new StringBuilder();
		sb.append(CpaTaskHelper.getdisNullValue(bean.getSubcriberNo()))
				.append(CpaTaskHelper.SEPERATOR)
				.append(CpaTaskHelper.getdisNullValue(bean.getCustomerId()))
				.append(CpaTaskHelper.SEPERATOR);
		sb.append(CpaTaskHelper.getdisNullValue(bean.getSubscriberId()))
				.append(CpaTaskHelper.SEPERATOR)
				.append(CpaTaskHelper.getdisNullValue(bean.getSubStatus()))
				.append(CpaTaskHelper.SEPERATOR);
		sb.append(CpaTaskHelper.getdisNullValue(bean.getImsi()))
				.append(CpaTaskHelper.SEPERATOR)
				.append(CpaTaskHelper.getdisNullValue(bean.getBan()))
				.append(CpaTaskHelper.SEPERATOR);
		sb.append(CpaTaskHelper.getdisNullValue(bean.getCustomerSegment()))
				.append(CpaTaskHelper.SEPERATOR)
				.append(CpaTaskHelper.getdisNullValue(bean.getTenantId()))
				.append(CpaTaskHelper.SEPERATOR);
		sb.append(CpaTaskHelper.getdisNullValue(bean.getSubscriberCompany()))
				.append(CpaTaskHelper.SEPERATOR)
				.append(CpaTaskHelper.getdisNullValue(bean.getTestSimFlag()));
		sb.append(CpaTaskHelper.SEPERATOR);
		sb.append(CpaTaskHelper.getdisNullValue(bean.getMvnoBrand()))
				.append(CpaTaskHelper.SEPERATOR)
				.append(CpaTaskHelper.getdisNullValue(bean.getEquipmentNo()))
				.append(CpaTaskHelper.SEPERATOR);
		sb.append(CpaTaskHelper.getdisNullValue(bean.getCycleType()))
				.append(CpaTaskHelper.SEPERATOR)
				.append(CpaTaskHelper.getdisNullValue(bean.getCycleUnit()))
				.append(CpaTaskHelper.SEPERATOR);
		sb.append(CpaTaskHelper.getdisNullValue(bean.getFirstBillDate()))
				.append(CpaTaskHelper.SEPERATOR)
				.append(CpaTaskHelper.getdisNullValue(CpaTaskHelper.INITDATE_FORMAT
						.format(bean.getOriginalInitDate())));
		sb.append(CpaTaskHelper.SEPERATOR);
		sb.append(CpaTaskHelper.getdisNullValue(bean.getProducts())).append(
				CpaTaskHelper.SEPERATOR);
		sb.append(CpaTaskHelper.getdisNullValue(bean.getExt4())).append(
				CpaTaskHelper.SEPERATOR);
		sb.append(CpaTaskHelper.getdisNullValue(bean.getExt3())).append(
				CpaTaskHelper.SEPERATOR);
		sb.append(CpaTaskHelper.getdisNullValue(bean.getExt1())).append(
				CpaTaskHelper.SEPERATOR);
		sb.append(CpaTaskHelper.getdisNullValue(bean.getExt2())).append(
				CpaTaskHelper.SEPERATOR);
		sb.append(CpaTaskHelper.getdisNullValue(bean.getSuspensionReasonCode()))
				.append(CpaTaskHelper.SEPERATOR);
		sb.append(CpaTaskHelper.getdisNullValue(bean.getDmlAction())).append(
				CpaTaskHelper.CRLF);
		return sb.toString();
	}

	public static void main(String[] args) throws Exception {
		System.setProperty("tenant.id", "21");
		new CpaUserIncTask().doTask(10050007L);
		// TaskFrameWork.main(new String[] { "CRM_INS_CPA_USER_INC_TASK_21",
		// "6","1" });
	}

}
