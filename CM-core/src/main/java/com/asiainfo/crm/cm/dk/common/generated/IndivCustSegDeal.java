package com.asiainfo.crm.cm.dk.common.generated;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.zip.GZIPInputStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.FtpUtil;
import com.ai.common.util.TimeUtil;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustSegmentRelaBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmFileSyncErrLogBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustSegmentRelaValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmFileSyncErrLogValue;
import com.asiainfo.crm.cm.inner.customer.service.interfaces.ICmCustSegmentRelaSV;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;

public class IndivCustSegDeal {

	private static transient Log log = LogFactory.getLog(IndivCustSegDeal.class);
	private String ftpPathCode;
	private static final String commonHead = "MF_0101001_";
	private static final String dataFileEnd = ".DAT.gz";
	private static final String checkFileEnd = ".CHK";
	private static final String commonMiddle = "_000001_";
	private String tenantId;
	private static final int FT_CHECK = 1;
	private static final int FT_DATA = 2;

	public IndivCustSegDeal(String ftpPathCode, String tenantId) {
		this.ftpPathCode = ftpPathCode;
		this.tenantId = tenantId;
	}

	/**
	 * 根据文件类型生成文件名
	 * @param fileType 文件类型: 1.check文件 2.数据文件
	 * @return 文件名
	 * @throws Exception 
	 */
	public String gernateFileName(int fileType) throws Exception {
		Date monthDate = TimeUtil.addOrMinusMonth(System.currentTimeMillis(), -1);
		String billingCycle = TimeUtil.getYYYYMM(monthDate);
		String currentDate = TimeUtil.getYYYYMMDD(new Date());
		if (fileType == FT_CHECK) {
			return commonHead + billingCycle + commonMiddle + currentDate + "_" + tenantId + checkFileEnd;
		} else {
			return commonHead + billingCycle + commonMiddle + currentDate + "_" + tenantId + dataFileEnd;
		}

	}

	/**
	 * 下载FTP服务器上需要解析的文件的文件
	 * @throws Exception 
	 */
	public String getRemoteFile() throws Exception {
		// 获取check文件名
		String checkFileName = gernateFileName(IndivCustSegDeal.FT_CHECK);
		String dataFileName = gernateFileName(IndivCustSegDeal.FT_DATA);
		String loaclPath = null;
		FtpUtil ftp = null;
		try {
			ftp = new FtpUtil(ftpPathCode);
			ftp.bin();
			// 列出文件名
			String fileNames[] = ftp.listNames();
			if (null != fileNames) {
				for (int i = 0; i < fileNames.length; i++) {
					if (fileNames[i].equals(checkFileName)) {
						ftp.download(dataFileName, dataFileName);
						loaclPath = ftp.getBsFtpPath().getLocalPath() + File.separator + dataFileName;
						ftp.moveFileToRemoteHisDir(dataFileName);
						ftp.moveFileToRemoteHisDir(checkFileName);
						break;
					}
				}
			}
			// 返回本地文件路径
			return loaclPath;
		} catch (Exception e) {
			log.info(e.getMessage(), e);
			return null;
		} finally {
			if (null != ftp) {
				try {
					ftp.close();
				} catch (Exception e) {
					log.error("FtpUtil.close() Fail.", e);
				}
			}
		}

	}

	/**
	 * 解析下载好的本地文件
	 * @param fileName 本地文件路径
	 * @throws Exception
	 */
	public void resolveLocaleFile(String fileName) throws Exception {
		if (null != fileName && !"".equals(fileName)) {
			FileInputStream fis = null;
			GZIPInputStream gis = null;
			BufferedReader br = null;
			try {
				fis = new FileInputStream(fileName);
				gis = new GZIPInputStream(fis);
				br = new BufferedReader(new InputStreamReader(gis, "UTF-8"));
				String tempData = null;
				String custId = null;
				String segmentId = null;
				ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
				ICmCustSegmentRelaSV custSegmentSV = ((ICmCustSegmentRelaSV) ServiceFactory.getService(ICmCustSegmentRelaSV.class));
				while ((tempData = br.readLine()) != null) {
					try {
						// 解析得到custId
						custId = tempData.substring(0, tempData.indexOf((char) 5));
						// 解析得到segmentId
						segmentId = tempData.substring(tempData.indexOf((char) 5) + 1, tempData.length() - 1);
						IBOCmCustSegmentRelaValue value = custSegmentSV.querySegmentRelaByCustId(Long.parseLong(custId));
						if (value == null) {
							value = new BOCmCustSegmentRelaBean();
							value.setCustId(Long.parseLong(custId));
							value.setSegmentId(Long.parseLong(segmentId));
							value.setState(CmConstants.RecordState.USE);
						} else {
							value.setSegmentId(Long.parseLong(segmentId));
						}
						custSegmentSV.saveSegmentRela(value);
					} catch (Exception e) {
						log.info(e.getMessage(), e);
						IBOCmFileSyncErrLogValue value = new BOCmFileSyncErrLogBean();
						value.setFileType(CmConstants.errFileType.SEGMNET);// 个人客户细分同步
						value.setErrMsg(e.getMessage());
						value.setFileName(fileName);
						service.saveCmFileSyncErrLog(value);
						continue;
					}

				}
			} catch (Exception e1) {
				log.error(e1.getMessage(), e1);
			} finally {
				if (br != null) {
					br.close();
				}
				if (gis != null) {
					gis.close();
				}
				if (fis != null) {
					fis.close();
				}
			}
		} else {
			throw new Exception("File Name Is Illegal");
		}

	}

	/**
	 * 核心处理函数
	 * @throws Exception
	 */
	public void deal() throws Exception {
		String fname = getRemoteFile();
		resolveLocaleFile(fname);
	}

	public static void main(String[] args) throws Exception {
		// UserInfoInterface user = CmCommonUtil.getDefaultUser();
		// ServiceManager.setServiceUserInfo(user);
		// IndivCustSegDeal icsd = new IndivCustSegDeal("CM_INDIV_CUSTOMER_SEGMENT_FTP", TenantIDFactory.getTenant());
		// icsd.deal();
		System.out.println((char) 5);
	}

}
