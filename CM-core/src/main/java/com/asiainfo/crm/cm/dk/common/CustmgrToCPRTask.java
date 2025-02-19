package com.asiainfo.crm.cm.dk.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import com.ai.appframe2.complex.tab.split.TenantIDFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.FtpUtil;
import com.ai.common.util.TimeUtil;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.service.interfaces.IAddressSV;
import com.asiainfo.crm.cm.common.util.ConnUtil;
import com.asiainfo.crm.cm.common.util.ws.address;
import com.asiainfo.crm.cm.custgroup.service.impl.CustGroupLogSVImpl;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmFileSyncErrLogBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmFileSyncErrLogValue;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CustmgrToCPRTask {
	public static transient Log log = (Log) LogFactory.getLog(CustGroupLogSVImpl.class);

	public void doCustToCPR() throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		FileInputStream fis = null;
		try {
			String tenantId = TenantIDFactory.getTenant();
			File file = new File("custToCpr.txt");
			file.createNewFile();
			StringBuilder sql = new StringBuilder();
			sql.append(" SELECT A.CUST_ID,A.REQUEST_TYPE,C.ADDRESS_ID,B.FIRST_NAME,B.MIDDLE_NAME,B.LAST_NAME,B.CUST_ZIPCODE,A.TASK_ID,B.BIRTHDAY ");
			sql.append(" FROM PARTY.CM_CUST_REQUEST_TASK_").append(tenantId).append(" A,PARTY.CM_INDIV_CUSTOMER_").append(tenantId).append(" B,PARTY.CM_CUST_CONTACT_MEDIUM_")
					.append(tenantId).append(" C,PARTY.CMX_INDIV_CUSTOMER_").append(tenantId).append(" D ");
			sql.append(" WHERE A.CUST_ID = D.PNR AND B.CUST_ID=D.CUST_ID AND B.CUST_ID=C.CUST_ID AND A.REQUEST_STATUS =? AND C.CONT_MED_TYPE_ID =? ");
			// UserInfoInterface userInfo = ServiceManager.getNewBlankUserInfo();
			// userInfo.setTenantId(tenantId);
			// userInfo.set("REGION_ID",regionId);
			// ServiceManager.setServiceUserInfo(userInfo);
			conn = ConnUtil.getWriteAblePartyConn();
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, CmConstants.RequestStatus.pending);
			pstmt.setInt(2, CmConstants.AddressId.legalAddress);
			// pstmt.setString(2, regionId);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				try {
					// 默认为10
					String Inddatatyp = "10";
					// 默认为2109
					String Kundenr = "2109";
					// 客户custId
					String Kunderefnr = String.valueOf(rs.getLong(1));
					// 默认取得addressType
					String Sortbyte = String.valueOf(rs.getInt(2));
					// 根据sortbyte生成
					String Matchtyp = "";
					if (Sortbyte.equalsIgnoreCase("1")) {
						Matchtyp = "S";
					} else {
						Matchtyp = "T";
					}
					// 不需要默认塞"P"
					String Pnrsenrmrk = "P";
					String Matchnvn = "";
					String Suplnvn = "";
					String firstName = rs.getString(4);
					String middleName = rs.getString(5);
					String middle = middleName == null ? "" : middleName;
					// firstName+middleName
					String Formelnvn = "" + firstName + middle;
					String lastName = rs.getString(6);
					// lastName
					String Efternvn = lastName;
					// 不需要
					String Komkod = "";
					// 根据addressId查询address
					String addressId = String.valueOf(rs.getLong(3));
					IAddressSV service = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
					// DistrictID当前为012002002
					address ss = service.getAddress(Integer.valueOf(addressId), "012002002");
					String postCode = ss.getZipcode();
					String Postnr = postCode == null ? "" : postCode;
					// street code 不需要
					String Vejkod = "";
					// street name
					String Vejnvn = ss.getStreetName() == null ? "" : ss.getStreetName();
					String Klaradr = "";
					String Husnr = "";
					if (ss.getHouseNumber() != null && ss.getHouseNumber().length() > 0) {
						if (ss.getHouseNumber().length() >= 3) {
							Husnr += ss.getHouseNumber().substring(0, 3);
						} else {
							Husnr += ss.getHouseNumber();
							Husnr = convert(Husnr, 3);
						}
					}
					if (ss.getHouseLetter() != null && ss.getHouseLetter().length() > 0) {
						Husnr += ss.getHouseLetter().substring(ss.getHouseLetter().length() - 1);
					}
					String Etage = ss.getFloor() == null ? "" : ss.getFloor();
					String Sidedoer = ss.getApartment() == null ? "" : ss.getApartment();
					String Bynvn = "";
					String Koen = "";
					// 记录客户的生日
					Date date = rs.getDate(9);
					String birth = TimeUtil.getYYYYMMDD(date);
					String Foeddto = birth == null ? "" : birth;
					String taskId = rs.getString(8);
					StringBuilder sb = new StringBuilder();
					sb.append(Inddatatyp).append(Kundenr).append(convert(Kunderefnr, 15)).append(Sortbyte).append(Matchtyp).append(Pnrsenrmrk).append(convert(Matchnvn, 50))
							.append(convert(Suplnvn, 50)).append(convert(Formelnvn, 50)).append(convert(Efternvn, 40)).append(convert(Komkod, 4)).append(convert(Postnr, 4))
							.append(convert(Vejkod, 4)).append(convert(Vejnvn, 40)).append(convert(Klaradr, 68)).append(convert(Husnr, 4)).append(convert(Etage, 2))
							.append(convert(Sidedoer, 4)).append(convert(Bynvn, 34)).append(convert(Koen,1)).append(convert(Foeddto, 8));
					// 调用服务使requestStatus为"P"

					ICmCustomerSV service2 = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
					service2.changeRequestStatus(Long.valueOf(taskId));
					String str = sb.toString();
					FileOutputStream fos = new FileOutputStream(file, true);
					OutputStreamWriter osw = null;
					try {
						osw = new OutputStreamWriter(fos, "ISO-8859-1");
						osw.write(str + "\r\n");
						osw.flush();
					} catch (Exception e) {
						log.error(e.getMessage(),e);
						
					} finally {
						if (osw != null) {
							try {
								osw.close();
							} catch (Exception e) {
								log.error(e.getMessage(),e);
								
							}
						}
					}
				} catch (Exception e) {
					log.error(e.getMessage(),e);
					// 保存错误信息
					IBOCmFileSyncErrLogValue value = new BOCmFileSyncErrLogBean();
					ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
					StringBuffer name = new StringBuffer();
					name.append("d").append(TimeUtil.getYYYYMMDD(new Date())).append(".am210901").append(".txt").toString();
					value.setFileType(2);
					value.setErrMsg(e.getMessage());
					value.setFileName(name.toString());
					service.saveCmFileSyncErrLog(value);
					continue;
				}

			}
			FtpUtil fp = new FtpUtil("CM_CPR_FTP");
			fis = new FileInputStream(file);
			StringBuffer name = new StringBuffer();
			name.append("d").append((TimeUtil.getYYYYMMDD(new Date())).substring(2, 8)).append(".am210901").toString();
			fp.upload(name.toString(), fis, FtpUtil.BIN);
			file.delete();
		} catch (Exception ex) {
			ex.printStackTrace();
			log.error(ex.getMessage(),ex);
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					log.error(e.getMessage(),e);
					
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					log.error(e.getMessage(),e);
					
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					log.error(e.getMessage(),e);
					
				}
			}
			if (fis != null) {
				try {
					fis.close();
				} catch (Exception e) {
					log.error(e.getMessage(),e);
					
				}
			}
		}
	}

	public String convert(String str, int num) {
		if (str == null) {
			return convert("", num);
		}
		StringBuffer sb = new StringBuffer(str);
		for (int i = str.length(); i < num; i++) {
			sb.append(" ");
		}
		return sb.toString();
	}
}
