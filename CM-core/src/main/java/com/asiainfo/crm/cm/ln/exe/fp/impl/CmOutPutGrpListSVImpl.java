package com.asiainfo.crm.cm.ln.exe.fp.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataStructInterface;
import com.ai.appframe2.complex.cache.CacheFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.bo.BOBsFtpPathBean;
import com.ai.common.cache.BsFtpCacheImpl;
import com.ai.common.cache.BsFtpPathCacheImpl;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.ivalues.IBOBsFtpPathValue;
import com.ai.common.ivalues.IBOBsFtpValue;
import com.ai.common.util.FtpUtil;
import com.asiainfo.crm.cm.common.bo.BOCmAttachBean;
import com.asiainfo.crm.cm.common.service.interfaces.ICmAttachSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupCustomerBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupCustomerValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.common.util.CmLnCommonUtil;
import com.asiainfo.crm.cm.ln.common.util.CmLnFTPPath;
import com.asiainfo.crm.cm.ln.exe.fp.interfaces.ICmOutPutGrpListSV;

public class CmOutPutGrpListSVImpl implements ICmOutPutGrpListSV {

	private static final Log log = LogFactory.getLog(CmOutPutGrpListSVImpl.class);

	public Map outPutGrpCustList(Map map) throws Exception {
		DataStructInterface da = (DataStructInterface) map.get("custGrp");
		String msg = "";
		Map returnMap = new HashMap();
		String custId = "";
		IBOCmGroupCustomerValue cmGrpCust = (IBOCmGroupCustomerValue) da;
		custId = String.valueOf(cmGrpCust.getCustId());
		// 上传ftp服务器
		// 查询上级集团客户
		DataContainerInterface[] valuesUp = qryGrpCustomerListUp(custId);

		// 查询下级客户
		DataContainerInterface[] values = qryGrpCustomerListDown(custId);
		BOBsFtpPathBean bsFtpPathValue = (BOBsFtpPathBean) CacheFactory.get(BsFtpPathCacheImpl.class, CmLnFTPPath.CMLNFTPCODE.ESOP_FILE_UPLOAD_CODE);

		// 对象转换将对象写入本地 上传的文件名称
		String newFileName = String.valueOf(cmGrpCust.getCustId()) + "(" + new Date().getTime() + ")" + ".csv";

		if (log.isDebugEnabled()) {
			log.debug("test---The new file name is :" + newFileName);
		}

		String clFileName = bsFtpPathValue.getLocalPath() + File.separator + newFileName;
		ipurtGrpCustList(values, clFileName, valuesUp);

		// 保存对象
		saveAttachValues(cmGrpCust, newFileName);

		FtpUtil ftp = null;
		File file = null;
		try {
			file = new File(bsFtpPathValue.getLocalPath() + File.separator + newFileName);
			ftp = getFtpUtil(CmLnFTPPath.CMLNFTPCODE.ESOP_FILE_UPLOAD_CODE);
			outPutSendSmsFile(ftp, bsFtpPathValue.getLocalPath(), bsFtpPathValue.getRemotePath(), newFileName);
			returnMap.put("returnObj", msg);
			return returnMap;
		} catch (Exception ex) {
			msg = CrmLocaleFactory.getResource("BAS6000075");// 文件上传失败：
			if (log.isErrorEnabled()) {
				log.error(ex.getMessage(), ex);
			}
			returnMap.put("returnObj", msg);
			return returnMap;
		} finally {
			if (ftp != null) {
				ftp.close();
			}
			if (file.isFile()) {
				log.error("Delete the local files!" + file.getPath());
				file.delete();
			}
		}
	}

	/**
	 * 
	 * @Function: setSendSmsValue
	 * @Description: 封装下发短信对象
	 * 
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 * 
	 * @version: v1.0.0
	 * @author: kangzk
	 * @date: 2012-10-10 上午11:01:24
	 * 
	 * Modification History: Date Author Version Description
	 * ---------------------------------------------------------* 2011-5-1
	 * kangzk v1.0.0 修改原因
	 */
	public void setSendSmsValue(List list, String fileName) throws Exception {
		int len = list.size();
		FileWriter write = null;
		BufferedWriter w = null;
		try {
			write = new FileWriter(fileName, true);
			w = new BufferedWriter(write);
			for (int i = 0; i < len; i++) {
				Map sendMap = (Map) list.get(i);
				w.write(sendMap.get("billId") + ":" + sendMap.get("sendSmsValue"));
				w.newLine();
			}
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			e.printStackTrace();
		} finally {
			if (w != null) {
				try {
					w.flush();
					w.close();
				} catch (Exception e) {
					log.error(e.getMessage(), e);
					e.printStackTrace();
				}
			}
			if (write != null) {
				try {
					write.flush();
					write.close();
				} catch (Exception e) {
					log.error(e.getMessage(), e);
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * 将批量短信上传值服务器
	 */
	public void outPutSendSmsFile(FtpUtil ftp, String localPath, String remotePath, String fileName) throws Exception {
		FileInputStream fis = null;
		try {
			if (ftp != null) {
				if (StringUtils.isNotBlank(remotePath)) {
					String localPathFileName = localPath + "/" + fileName;
					fis = new FileInputStream(localPathFileName);
					ftp.mkdir(remotePath);
					// 服务器上的文件名称
					if (log.isDebugEnabled()) {
						log.debug("outPutSendSmsFile---The new file name is :" + fileName);
					}
					// 上传文件至fTP服务器
					ftp.upload(remotePath + "/" + fileName, fis, FtpUtil.BIN);// file流为空对象 请注意
				}
			}
		} catch (Exception ex) {
			if (log.isErrorEnabled()) {
				log.error("File upload error:", ex);
			}
		} finally {
			if (fis != null) {
				fis.close();
			}
		}
	}

	/**
	 * 查询下级集团客户信息
	 */
	public DataContainerInterface[] qryGrpCustomerListDown(String custId) throws Exception {
		StringBuilder sql = new StringBuilder("select cust_id,level," + " CASE level " + " WHEN 1 THEN " + " ' ' || cust_name " + " WHEN 2 THEN " + " '   ' || cust_name "
				+ " when 3 THEN " + " '     ' || cust_name " + " when 4 then " + " '       ' || cust_name " + " when 5 then" + " '         ' || cust_name " + " else "
				+ " '           ' || cust_name " + " END cust_name, " + " CASE t.cust_status  WHEN 0 THEN '[ 0 ] in the network group customers'" + " WHEN 1 THEN '[1] potential corporate customers'"
				+ " WHEN 2 THEN '[2] competitors, customers of the Group' end CUST_STATUS " + " from cm_group_customer t start with t.parent_cust_id= :custId ");
		HashMap parameter = new HashMap();
		parameter.put("custId", custId);
		StringBuilder condition = new StringBuilder(" connect BY prior t.cust_id =  t.parent_cust_id and t.state='U' order by level desc ");
		DataContainerInterface[] values = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
				CmLnCommonUtil.getQueryResult(sql.append(condition).toString(), null, -1, -1, parameter), parameter);
		return values;
	}

	/**
	 * 查询上级集团客户信息
	 */
	public DataContainerInterface[] qryGrpCustomerListUp(String custId) throws Exception {
		StringBuilder sql = new StringBuilder("select cust_id,level, " + " CASE level " + " WHEN 1 THEN " + " ' ' || cust_name " + " WHEN 2 THEN " + " '   ' || cust_name "
				+ " when 3 THEN " + " '     ' || cust_name " + " when 4 then " + " '       ' || cust_name " + " when 5 then" + " '         ' || cust_name " + " else "
				+ " '           ' || cust_name " + " END cust_name, " + " CASE t.cust_status  WHEN 0 THEN '[ 0 ] in the network group customers'" + " WHEN 1 THEN '[1] potential corporate customers'"
				+ " WHEN 2 THEN '[2] competitors, customers of the Group' end CUST_STATUS " + " from cm_group_customer t start with t.cust_id= :custId ");
		HashMap parameter = new HashMap();
		parameter.put("custId", custId);
		StringBuilder condition = new StringBuilder(" connect BY prior t.parent_cust_id =  t.cust_id and t.state='U' order by level desc ");
		DataContainerInterface[] values = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class,
				CmLnCommonUtil.getQueryResult(sql.append(condition).toString(), null, -1, -1, parameter), parameter);

		return values;
	}

	/**
	 * 
	 * @Function: saveAttachValues
	 * @Description: 保存附件管理对象
	 * 
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 * 
	 * @version: v1.0.0
	 * @author: kangzk
	 * @date: 2012-10-10 上午11:01:24
	 * 
	 * Modification History: Date Author Version Description
	 * ---------------------------------------------------------* 2011-5-1
	 * kangzk v1.0.0 修改原因
	 */
	private static void saveAttachValues(IBOCmGroupCustomerValue cmGrpCust, String newFileName) throws Exception {
		// 保存至附件管理表中
		ICmAttachSV sv = (ICmAttachSV) ServiceFactory.getService(ICmAttachSV.class);
		BOCmAttachBean boCmAttachBean = new BOCmAttachBean();
		boCmAttachBean.setStsToNew();
		boCmAttachBean.setBusiTypeCode(CmLnFTPPath.CMLNFTPCODE.ESOP_FILE_UPLOAD_CODE);
		boCmAttachBean.setBusiSheetId(String.valueOf(cmGrpCust.getCustId()));
		boCmAttachBean.setAttachName("The tree structure of the file group");
		boCmAttachBean.setFileName(newFileName);
		// 传递过来的操作员对象
		boCmAttachBean.setCreateOpId(cmGrpCust.getOpId());
		boCmAttachBean.setOpId(cmGrpCust.getOpId());
		boCmAttachBean.setOrgId(cmGrpCust.getOrgId());
		boCmAttachBean.setCreateOrgId(cmGrpCust.getOpId());
		boCmAttachBean.setRegionId(cmGrpCust.getRegionId());
		sv.saveAttachValues(new BOCmAttachBean[] { boCmAttachBean });
	}

	/**
	 * 
	 * @Function: ipurtGrpCustList
	 * @Description: 封装上传对象
	 * 
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 * 
	 * @version: v1.0.0
	 * @author: kangzk
	 * @date: 2012-10-10 上午11:01:24
	 * 
	 * Modification History: Date Author Version Description
	 * ---------------------------------------------------------* 2011-5-1
	 * kangzk v1.0.0 修改原因
	 */
	private static void ipurtGrpCustList(DataStructInterface[] values, String fileName, DataContainerInterface[] valuesUp) throws Exception {
		IBOCmGroupCustomerValue iboCmGroupCustomerValues = null;
		int len = 0;
		int start = 0;
		List list = new ArrayList();
		if (CmCommonUtil.isNotEmptyObject(valuesUp)) {
			len = valuesUp.length;
			if (len > 0) {
				for (int i = 0; i < len; i++) {
					iboCmGroupCustomerValues = new BOCmGroupCustomerBean();
					iboCmGroupCustomerValues.copy(valuesUp[i]);
					String custName = String.valueOf(valuesUp[i].get("CUST_NAME")).trim();
					if (i == 1) {
						custName = " " + custName;
					} else if (i == 2) {
						custName = "  " + custName;
					} else if (i == 3) {
						custName = "   " + custName;
					} else if (i == 4) {
						custName = "    " + custName;
					} else if (i == 5) {
						custName = "     " + custName;
					}
					iboCmGroupCustomerValues.set(IBOCmGroupCustomerValue.S_CustName, custName);
					list.add(iboCmGroupCustomerValues);
					start++;
				}
			}
		}
		if (CmCommonUtil.isNotEmptyObject(values)) {
			len = values.length;
			for (int innerI = 0; innerI < len; innerI++) {
				iboCmGroupCustomerValues = new BOCmGroupCustomerBean();
				iboCmGroupCustomerValues.copy(values[innerI]);
				String custName = "     " + String.valueOf(values[innerI].get("CUST_NAME"));
				iboCmGroupCustomerValues.set(IBOCmGroupCustomerValue.S_CustName, custName);
				list.add(iboCmGroupCustomerValues);
			}
		}
		File file = new File(fileName);
		BufferedWriter w = null;
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		try {
			fos = new FileOutputStream(file);
			osw = new OutputStreamWriter(fos, "GBK");
			w = new BufferedWriter(osw);
			w.write("Group ID,\tStatus,\tGroup Name");
			w.newLine();
			len = list.size();
			for (int i = 0; i < len; i++) {
				BOCmGroupCustomerBean iboCmGrpcustValues = (BOCmGroupCustomerBean) list.get(i);
				w.write(iboCmGrpcustValues.getCustId() + ",\t" + iboCmGrpcustValues.get("CUST_STATUS") + ",\t" + iboCmGrpcustValues.getCustName());
				w.newLine();
			}
		} catch (Exception e) {
			log.info(e.getMessage(), e);
			e.printStackTrace();
		} finally {
			if (osw != null) {
				try {
					osw.close();
				} catch (Exception e) {
					log.error(e.getMessage(), e);
					e.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (Exception e) {
					log.error(e.getMessage(), e);
					e.printStackTrace();
				}
			}
			if (w != null) {
				try {
					w.close();
				} catch (Exception e) {
					log.error(e.getMessage(), e);
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * 
	 * @Function: getFtpUtil
	 * @Description: 构造新的文件上传工具类对象
	 * 
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 * 
	 * @version: v1.0.0
	 * @author: kangzk
	 * @date: 2012-10-10 上午11:01:24
	 * 
	 * Modification History: Date Author Version Description
	 * ---------------------------------------------------------* 2011-5-1
	 * kangzk v1.0.0 修改原因
	 */
	public static FtpUtil getFtpUtil(String ftpPathCode) throws Exception {
		if (StringUtils.isEmpty(ftpPathCode)) {
			ftpPathCode = CmLnFTPPath.CMLNFTPCODE.ESOP_FILE_UPLOAD_CODE;
		}
		IBOBsFtpPathValue objIBsFtpPathValue = (IBOBsFtpPathValue) CacheFactory.get(BsFtpPathCacheImpl.class, ftpPathCode);
		if (objIBsFtpPathValue == null || objIBsFtpPathValue.isNew()) {
			return null;
		}
		IBOBsFtpValue objIBsFtpValue = (IBOBsFtpValue) CacheFactory.get(BsFtpCacheImpl.class, objIBsFtpPathValue.getFtpCode());
		if (objIBsFtpValue == null || objIBsFtpValue.isNew()) {
			ftpPathCode = CmLnFTPPath.CMLNFTPCODE.ESOP_FILE_UPLOAD_CODE;
		}
		return new FtpUtil(ftpPathCode);
	}

}
