package com.asiainfo.crm.inter.exe.webservice.client.cpa.task;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.ivalues.IBOBsFtpPathValue;
import com.ai.common.util.FtpUtil;
import com.ai.common.util.TimeUtil;

public class CpaTaskHelper {

/*	public enum TASK_TYPE {
		CPA_OFFER("INS_CPA_FTP_OL_PATH", "OFFERIDLIST") {

			@Override
			public String dealLocaleFile(String name) throws Exception {
				log.debug("Start to deal local file: " + name);
				ICpaServiceSV cpaSv = (ICpaServiceSV) ServiceFactory.getService(ICpaServiceSV.class);
				Timestamp timestamp = cpaSv.getCpaOfferSysDate();
				
				 * 注释了 log.debug("Delete All Cpa Offers");
				 * cpaSv.deleteCpaOffer(timestamp);
				 
				BufferedReader br = null;
				FileReader fileReader = null;
				try {
					String url = this.getFtpPath().getLocalPath() + "/" + name;
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
//					e.printStackTrace();
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

			@Override
			public void doAfterSync(Timestamp timestamp) throws Exception {
				// Do Nothing .
			}

		},
		CPA_USER("INS_CPA_FTP_FSI_PATH", "VERISFULLECHO") {
			@Override
			public String dealLocaleFile(String name) throws Exception {
				ICpaServiceSV cpaSv = (ICpaServiceSV) ServiceFactory.getService(ICpaServiceSV.class);
				Timestamp timestamp = cpaSv.getCpaOfferSysDate();
//				BOCpaUserBean[] syncCpaUsers = cpaSv.getSyncCpaUsers(timestamp);
				// 全量的时候同步所有有用数据
				BOCpaUserBean[] syncCpaUsers = cpaSv.getSyncCpaAllUsers();

//				BOCpaOfferBean[] cpaOffers = cpaSv.getCpaOffers();
				// 过滤不在offerList 里面的用户
//				HashMap<String, BOCpaOfferBean> offerMap = getOfferMap(cpaOffers);
//				ArrayList<BOCpaUserBean> userList = new ArrayList<BOCpaUserBean>();
//				if(syncCpaUsers.length > 0 ){
//					for(BOCpaUserBean user : syncCpaUsers){
//						String offerId = user.getExt1();
//						if(offerMap.containsKey(offerId)){
//							userList.add(user);
//						}
//					}
//				}
//				List<BOCpaUserBean> mergeUserList = mergeUser(userList);
				if (syncCpaUsers.length > 0) {
					String finalName = "";
					CpaFileName newFileName = null;
					FileOutputStream outputStream = null;
					try {
						newFileName = new CpaFileName();
						newFileName.setCreateTime(FILE_SDF.format(timestamp));//20150914045759000
						newFileName.setFileType(this.getFileType());//VERISFULLECHO
						newFileName.setPrefix("AI01");
						newFileName.setSeqNum(cpaSv.getFileSeq());//UID100021
						newFileName.setSystemType(SYSTEM_TYPE);//CRM
						String tmpFileName = newFileName.getTmpFileName();//AI01_CRM_VERISFULLECHO_UID100021_20150914045759000.dat.ing
						String localUrl = this.getFtpPath().getLocalPath() + "/" + tmpFileName;
						File file = new File(localUrl);
						long fileSize = 0L;
						long recordSize = 0L;
						outputStream = new FileOutputStream(file, true);
						byte[] header = getFileHeader(timestamp).getBytes(UTF_8);
						outputStream.write(header);
						fileSize += header.length;
						for (BOCpaUserBean bean : syncCpaUsers) {
							byte[] recode = getCpaUserRecord(bean).getBytes(UTF_8);
							outputStream.write(recode);
							fileSize += recode.length;
						}
						recordSize = syncCpaUsers.length;
						byte[] footer = getFileFooter(recordSize).getBytes(UTF_8);
						outputStream.write(footer);
						fileSize += footer.length;
						newFileName.setFileSize(fileSize);
						finalName = newFileName.getFinalFileName();
					} catch (Exception e) {
						if(log.isDebugEnabled()){
							log.debug("", e);
						}
//						e.printStackTrace();
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
				sb.append(bean.getSubcriberNo()).append(SEPERATOR).append(bean.getCustomerId()).append(SEPERATOR);
				sb.append(bean.getSubscriberId()).append(SEPERATOR).append(bean.getSubStatus()).append(SEPERATOR);
				sb.append(bean.getImsi()).append(SEPERATOR).append(bean.getBan()).append(SEPERATOR);
				sb.append(bean.getCustomerSegment()).append(SEPERATOR).append(bean.getTenantId()).append(SEPERATOR);
				sb.append(bean.getSubscriberCompany()).append(SEPERATOR).append(bean.getTestSimFlag());
				sb.append(SEPERATOR);
				sb.append(bean.getMvnoBrand()).append(SEPERATOR).append(bean.getEquipmentNo()).append(SEPERATOR);
				sb.append(bean.getCycleType()).append(SEPERATOR).append(bean.getCycleUnit()).append(SEPERATOR);
				sb.append(bean.getFirstBillDate()).append(SEPERATOR).append(SDF.format(bean.getOriginalInitDate()));
				sb.append(SEPERATOR).append(bean.getProducts()).append(SEPERATOR);
				sb.append(bean.getExt1()).append(SEPERATOR);
				sb.append(bean.getExt2()).append(SEPERATOR);
				sb.append(bean.getExt3()).append(SEPERATOR);
				sb.append(bean.getExt4()).append(SEPERATOR);
				sb.append(bean.getSuspensionReasonCode()).append(CRLF);
				return sb.toString();
			}

			@Override
			public void doAfterSync(Timestamp timestamp) throws Exception {
				ICpaServiceSV cpaSv = (ICpaServiceSV) ServiceFactory.getService(ICpaServiceSV.class);
				cpaSv.changeState4SyncCpaUsers(timestamp);
			}
		},
		CPA_INC_USER("INS_CPA_FTP_FSI_INC_PATH", "VERISINCRECHO") {
			@Override
			public String dealLocaleFile(String name) throws Exception {
				ICpaServiceSV cpaSv = (ICpaServiceSV) ServiceFactory.getService(ICpaServiceSV.class);
				Timestamp timestamp = cpaSv.getCpaOfferSysDate();
				BOCpaUserBean[] syncCpaUsers = cpaSv.getSyncCpaIncUsers(getBeforeTime(timestamp),timestamp);
				if (syncCpaUsers.length > 0) {
					String finalName = "";
					CpaFileName newFileName = null;
					FileOutputStream outputStream = null;
					try {
						newFileName = new CpaFileName();
						newFileName.setCreateTime(FILE_SDF.format(timestamp));
						newFileName.setFileType(this.getFileType());
						newFileName.setPrefix("AI01");
						newFileName.setSeqNum(cpaSv.getIncFileSeq());
						newFileName.setSystemType(SYSTEM_TYPE);
						String tmpFileName = newFileName.getTmpFileName();
						String localUrl = this.getFtpPath().getLocalPath() + "/" + tmpFileName;
						File file = new File(localUrl);
						long fileSize = 0L;
						long recordSize = 0L;
						outputStream = new FileOutputStream(file, true);
						byte[] header = getFileHeader(timestamp).getBytes(UTF_8);
						outputStream.write(header);
						fileSize += header.length;
						for (BOCpaUserBean bean : syncCpaUsers) {
							byte[] recode = getCpaUserRecord(bean).getBytes(UTF_8);
							outputStream.write(recode);
							fileSize += recode.length;
						}
						recordSize = syncCpaUsers.length;
						byte[] footer = getFileFooter(recordSize).getBytes(UTF_8);
						outputStream.write(footer);
						fileSize += footer.length;
						newFileName.setFileSize(fileSize);
						finalName = newFileName.getFinalFileName();
					} catch (Exception e) {
						if(log.isDebugEnabled()){
							log.debug("", e);
						}
//						e.printStackTrace();
					} finally {
						if (outputStream != null) {
							outputStream.close();
						}
					}
					return finalName;
				}
				return null;
			}

			private Timestamp getBeforeTime(Timestamp current){
				Date beforeDate = TimeUtil.addOrMinusMinutes(current.getTime(),BEFORE);
				return new Timestamp(beforeDate.getTime());
			}
			private String getCpaUserRecord(BOCpaUserBean bean) {
				StringBuilder sb = new StringBuilder();
				sb.append(bean.getSubcriberNo()).append(SEPERATOR).append(bean.getCustomerId()).append(SEPERATOR);
				sb.append(bean.getSubscriberId()).append(SEPERATOR).append(bean.getSubStatus()).append(SEPERATOR);
				sb.append(bean.getImsi()).append(SEPERATOR).append(bean.getBan()).append(SEPERATOR);
				sb.append(bean.getCustomerSegment()).append(SEPERATOR).append(bean.getTenantId()).append(SEPERATOR);
				sb.append(bean.getSubscriberCompany()).append(SEPERATOR).append(bean.getTestSimFlag());
				sb.append(SEPERATOR);
				sb.append(bean.getMvnoBrand()).append(SEPERATOR).append(bean.getEquipmentNo()).append(SEPERATOR);
				sb.append(bean.getCycleType()).append(SEPERATOR).append(bean.getCycleUnit()).append(SEPERATOR);
				sb.append(bean.getFirstBillDate()).append(SEPERATOR).append(SDF.format(bean.getOriginalInitDate()));
				sb.append(SEPERATOR);
				sb.append(bean.getProducts()).append(SEPERATOR);
				sb.append(bean.getExt1()).append(SEPERATOR);
				sb.append(bean.getExt2()).append(SEPERATOR);
				sb.append(bean.getExt3()).append(SEPERATOR);
				sb.append(bean.getExt4()).append(SEPERATOR);
				sb.append(bean.getSuspensionReasonCode()).append(SEPERATOR);
				sb.append(bean.getDmlAction()).append(CRLF);
				return sb.toString();
			}

			@Override
			public void doAfterSync(Timestamp timestamp) throws Exception {
				ICpaServiceSV cpaSv = (ICpaServiceSV) ServiceFactory.getService(ICpaServiceSV.class);
				cpaSv.changeState4SyncCpaUsers(timestamp);
			}
		};

		private String ftpPathCode;
		private String fileType;
		private FtpUtil ftpUtil = null;
		private IBOBsFtpPathValue bsFtpPath = null;

		private TASK_TYPE(String ftpPathCode, String fileType) {
			this.ftpPathCode = ftpPathCode;
			this.fileType = fileType;
			try {
				this.initial();
			} catch (Exception e) {
				throw new IllegalArgumentException("FtpPathCode cannot initial FtpUtil" , e);
			}
		}

		public IBOBsFtpPathValue getFtpPath() {
			return this.bsFtpPath;
		}

		public FtpUtil getFtp() throws Exception {
			return this.ftpUtil;
		}

		public String getFileType() {
			return fileType;
		}

		private void initial() throws Exception {
			ftpUtil = new FtpUtil(this.ftpPathCode);
			bsFtpPath = ftpUtil.getBsFtpPath();
			this.validateRemotePath();
		}

		private void validateRemotePath() throws Exception {
			if (bsFtpPath == null) {
				throw new Exception("bsFtpPath is null");
			}
			String remotePath = bsFtpPath.getRemotePath();
			if (remotePath == null || remotePath.trim().length() < 0) {
				throw new Exception("remote path is null or empty");
			}
		}

		public List<String> getFilterNames() throws Exception {
			String[] names = this.getFtp().list();
			List<String> list = new ArrayList<String>();
			for (String name : names) {
				CpaFileName fileName = new CpaFileName(name);
				if (fileName.isValid() && fileName.isDATEnding() && fileName.isTodayFile() && this.fileType.equals(fileName.getFileType())) {
					list.add(name);
				}
			}
			if (list.isEmpty()) {
				log.debug("There is not files need to be synchronous");
			}
			return list;
		}

		public void moveLocalFileToHis(String fileName, String finalFileName) throws Exception {
			String filePath = bsFtpPath.getLocalPath() + "/" + fileName;
			String hisFilePath = bsFtpPath.getLocalPathHis() + "/" + ((finalFileName != null && finalFileName.trim().length() > 0) ? finalFileName : fileName);
			BufferedReader br = null;
			PrintStream ps = null;
			FileOutputStream fos = null;

			try {
				File srcFile = new File(filePath);
				File destFile = new File(hisFilePath);
				fos = new FileOutputStream(destFile);

				br = new BufferedReader(new FileReader(srcFile));
				ps = new PrintStream(fos, true, "UTF-8");
				String line = null;
				while ((line = br.readLine()) != null) {
					if (line.length() == 0) {
						continue;
					}

					ps.println(line);
				}
				ps.flush();
//				br.close();
//				ps.close();
//				ps = null;
//				fos.close();
//				fos = null;
				srcFile.delete();
				srcFile = null;
			} catch (Exception e) {
				log.error(CrmLocaleFactory.getResource("RSS0008172", fileName, e.getMessage(), FLAG_BR), e);
				throw e;
			} finally {
				if (br != null) {
					try {
						br.close();
					} catch (Exception e) {
						log.error("Close the stream errors!", e);
					}
				}
				if (ps != null) {
					try {
						ps.close();
					} catch (Exception e) {
						log.error("Close the stream errors!", e);
					}
				}
				if (fos != null) {
					try {
						fos.close();
					} catch (Exception e) {
						log.error("Close the stream errors!", e);
					}
				}
			}
		}

		protected String getFileHeader(Timestamp time) {
			StringBuilder sb = new StringBuilder(wrapSpace(HEADER, 10));
			sb.append(wrapSpace(VERSION, 10)).append(wrapSpace(TimeUtil.getYYYYMMDDHHMMSS(time), 14));
			sb.append(wrapSpace(SYSTEM_TYPE, 15)).append(wrapSpace(this.fileType, 15)).append(CRLF);
			return sb.toString();
		}

		protected String getFileFooter(long recordSize) {
			StringBuilder sb = new StringBuilder(wrapSpace(FOOTER, 10));
			sb.append(wrapSpace(String.valueOf(recordSize), 11));
			return sb.toString();
		}

		private String wrapSpace(String str, int length) {
			int strLen = str.length();
			if (strLen >= length) {
				return str;
			} else {
				StringBuilder sb = new StringBuilder(str);
				for (int i = strLen; i < length; i++) {
					sb.append(" ");
				}
				return sb.toString();
			}
		}

		protected HashMap<String,BOCpaOfferBean> getOfferMap(BOCpaOfferBean[] offerArr){
			HashMap<String, BOCpaOfferBean> map = null ;
			if(offerArr != null && offerArr.length > 0) {
				map = new HashMap<String,BOCpaOfferBean>();
				for(BOCpaOfferBean offer : offerArr){
					map.put(offer.getOfferId(), offer);
				}
			}
			return map;
		}
		
		*//**
		 * 将一个用户订购多个offer合并
		 * @param userList
		 * @return
		 *//*
		protected List<BOCpaUserBean> mergeUser(List<BOCpaUserBean> userList){
			HashMap<String, BOCpaUserBean> map = new HashMap<String,BOCpaUserBean>();
			if(userList.size() > 0 ){
				for(BOCpaUserBean user : userList){
					String subscriberId = user.getSubscriberId();
					if(map.containsKey(subscriberId)){
						String products = user.getProducts();
						BOCpaUserBean userBean = map.get(subscriberId);
						String syncProducts = userBean.getProducts();
						userBean.setProducts(syncProducts + "&" + products); 
					}else{
						map.put(subscriberId, user);
					}
				}
			}
			ArrayList<BOCpaUserBean> mergeUserList = new ArrayList<BOCpaUserBean>();
			if(!map.isEmpty()){
				for(String key : map.keySet()){
					mergeUserList.add(map.get(key));
				}
			}
			return mergeUserList;
		}
		public abstract String dealLocaleFile(String name) throws Exception;

		public abstract void doAfterSync(Timestamp timestamp) throws Exception;

		

	}*/
	protected static void moveLocalFileToHis(String fileName, String finalFileName,IBOBsFtpPathValue bsFtpPath) throws Exception {
		String filePath = bsFtpPath.getLocalPath() + "/" + fileName;
		String hisFilePath = bsFtpPath.getLocalPathHis() + "/" + ((finalFileName != null && finalFileName.trim().length() > 0) ? finalFileName : fileName);
		BufferedReader br = null;
		PrintStream ps = null;
		FileOutputStream fos = null;
		File srcFile=null;
		try {
			srcFile = new File(filePath);
			File destFile = new File(hisFilePath);
			fos = new FileOutputStream(destFile);

			br = new BufferedReader(new FileReader(srcFile));
			ps = new PrintStream(fos, true, "UTF-8");
			String line = null;
			while ((line = br.readLine()) != null) {
				if (line.length() == 0) {
					continue;
				}

				ps.println(line);
			}
			ps.flush();
//			br.close();
//			ps.close();
//			ps = null;
//			fos.close();
//			fos = null;
//			srcFile.delete();
		} catch (Exception e) {
			log.error(CrmLocaleFactory.getResource("RSS0008172", fileName, e.getMessage(), FLAG_BR), e);
			throw e;
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (Exception e) {
					log.error("Close the stream errors!", e);
				}
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (Exception e) {
					log.error("Close the stream errors!", e);
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (Exception e) {
					log.error("Close the stream errors!", e);
				}
			}
			srcFile.delete();
			srcFile = null;
		}
	}
	
	protected static String getFileHeader(Timestamp time,String fileType) {
		StringBuilder sb = new StringBuilder(wrapSpace(HEADER, 10));
		sb.append(wrapSpace(VERSION, 10)).append(wrapSpace(TimeUtil.getYYYYMMDDHHMMSS(time), 14));
		sb.append(wrapSpace(SYSTEM_TYPE, 15)).append(wrapSpace(fileType, 15)).append(CRLF);
		return sb.toString();
	}
	
	private static String wrapSpace(String str, int length) {
		int strLen = str.length();
		if (strLen >= length) {
			return str;
		} else {
			StringBuilder sb = new StringBuilder(str);
			for (int i = strLen; i < length; i++) {
				sb.append(" ");
			}
			return sb.toString();
		}
	}
	
	protected static String getFileFooter(long recordSize) {
		StringBuilder sb = new StringBuilder(wrapSpace(FOOTER, 10));
		sb.append(wrapSpace(String.valueOf(recordSize), 11));
		return sb.toString();
	}
	
	protected static void validateRemotePath(IBOBsFtpPathValue bsFtpPath) throws Exception {
		if (bsFtpPath == null) {
			throw new Exception("bsFtpPath is null");
		}
		String remotePath = bsFtpPath.getRemotePath();
		if (remotePath == null || remotePath.trim().length() < 0) {
			throw new Exception("remote path is null or empty");
		}
	}
	 
	protected static List<String> getFilterNames(FtpUtil ftp,String fileType) throws Exception {
		String[] names = ftp.list();
		List<String> list = new ArrayList<String>();
		for (String name : names) {
			CpaFileName fileName = new CpaFileName(name);
			if (fileName.isValid() && fileName.isDATEnding() && fileName.isTodayFile() && fileType.equals(fileName.getFileType())) {
				list.add(name);
			}
		}
		if (list.isEmpty()) {
			log.error("There is not files need to be synchronous");
		}
		return list;
	}
	
	public static void clearHisFile(String localPathHis, long beforeTime,long currentTime){
		if(localPathHis==null)
			return;
		File hisDir = new File(localPathHis);
		if (hisDir == null || !hisDir.exists()) {
			log.error( "his directory doesn't exist!" + " LocalHisPath:" +localPathHis);
			return;
		}
		File[] files = hisDir.listFiles();
		if(files==null||files.length==0)
			return;
		for (File file : files) {
			log.error("Deal File: " + file.getName());
			long lastModified = file.lastModified();
			long lastTime=lastModified+beforeTime;
			if (lastTime>currentTime) {
				continue;
			} else {
				log.error("Delete File: " + file.getName());
				delete(file);
			}
		}
	}
	
	private static void delete(File file) {
		if (file != null && file.isFile()) {
			file.delete();
		} else {
			for (File f : file.listFiles()) {
				delete(f);
			}
			file.delete();
		}
	}


	public static Object getdisNullValue(Object param){
			return param==null?"":param;
		}
	
	public final static SimpleDateFormat SDF = new SimpleDateFormat("yyyyMMddHHmmss");
	public final static SimpleDateFormat INITDATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
	public final static SimpleDateFormat FILE_SDF = new SimpleDateFormat("yyyyMMddHHmmssSSS");
	private static final String HEADER = "HEADER";
	private static final String FOOTER = "FOOTER";
	private static final String VERSION = "v1.0";
	public static final String SYSTEM_TYPE = "CRM";
	public static final String UTF_8 = "UTF-8";//
	public static final String FLAG_BR = "\n";
	public static final String CRLF = "\r\n";
	public static final String SEPERATOR = "|";
	private static transient Log log = LogFactory.getLog(CpaTaskHelper.class);
	
	protected static final int BEFORE = -10;
}
