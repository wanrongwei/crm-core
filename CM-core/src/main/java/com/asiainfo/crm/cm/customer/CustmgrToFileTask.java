package com.asiainfo.crm.cm.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.TimeUtil;
import com.asiainfo.appframe.ext.exeframe.fp.FpFrameWork;
import com.asiainfo.appframe.ext.exeframe.fp.process.AbstractFpProcessImpl;
import com.asiainfo.crm.cm.common.service.interfaces.IAddressSV;
import com.asiainfo.crm.cm.common.util.ConnUtil;
import com.asiainfo.crm.cm.common.util.ws.address;

public class CustmgrToFileTask extends AbstractFpProcessImpl {

	private transient static final Log log = LogFactory.getLog(CustmgrToFileTask.class);

	@Override
	public String getFileName() throws Exception {
		// 2014-04-03
		String fileName = new StringBuilder().append("d").append(TimeUtil.getYYYYMMDD(TimeUtil.addOrMinusMonth(new Date().getTime(), -1))).append(".am210901").append(".txt")
				.toString();
		return fileName;
	}

	@Override
	public String getRowSplit() throws Exception {

		return "\n";
	}

	@Override
	public void process() throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			StringBuilder sql = new StringBuilder();
			sql.append(" SELECT A.CUST_ID,A.REQUEST_TYPE,C.ADDRESS_ID,B.FIRST_NAME,B.MIDDLE_NAME,B.LAST_NAME,B.CUST_ZIPCODE ");
			sql.append(" FROM PARTY.CM_CUST_REQUEST_TASK_01 A,PARTY.CM_INDIV_CUSTOMER_01 B,PARTY.CM_CUST_CONTACT_MEDIUM_01 C ");
			sql.append(" WHERE A.CUST_ID = B.CUST_ID AND B.CUST_ID=C.CUST_ID AND A.REQUEST_STATUS = 'C' ");
			conn = ConnUtil.getWriteAblePartyConn();
			pstmt = conn.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String Inddatatyp = "10";
				String Kundenr = "2109";
				String Kunderefnr = String.valueOf(rs.getLong(1));
				String Sortbyte = String.valueOf(rs.getInt(2));
				String Matchtyp = "";
				if (Sortbyte.equalsIgnoreCase("1")) {
					Matchtyp = "S";
				} else {
					Matchtyp = "T";
				}
				String Pnrsenrmrk = "P";
				String Matchnvn = "";
				String Suplnvn = "";
				String firstName = rs.getString(4);
				String middleName = rs.getString(5);
				String Formelnvn = "" + firstName + middleName;
				String lastName = rs.getString(6);
				String Efternvn = lastName;
				String Komkod = "";
				String Postnr = rs.getString(7);
				String Vejkod = "";
				String addressId = String.valueOf(rs.getLong(3));
				IAddressSV service = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
				address ss = service.getAddress(Integer.valueOf(addressId), "012");
				String Vejnvn = ss.getStreetName();
				String Klaradr = "";
				String Husnr = "" + convert(ss.getHouseNumber(), 3) + ss.getHouseLetter();
				String Etage = String.valueOf(ss.getFloor());
				String Sidedoer = ss.getApartment();
				String Bynvn = "";
				String Koen = "";
				String Foeddto = "";
				try {
					StringBuilder sb = new StringBuilder();
					sb.append(Inddatatyp).append(Kundenr).append(convert(Kunderefnr, 15)).append(Sortbyte).append(Matchtyp).append(Pnrsenrmrk).append(convert(Matchnvn, 50))
							.append(convert(Suplnvn, 50)).append(convert(Formelnvn, 50)).append(convert(Efternvn, 40)).append(convert(Komkod, 4)).append(convert(Postnr, 4))
							.append(convert(Vejkod, 4)).append(convert(Vejnvn, 40)).append(convert(Klaradr, 68)).append(Husnr).append(convert(Etage, 2))
							.append(convert(Sidedoer, 4)).append(convert(Bynvn, 34)).append(Koen).append(convert(Foeddto, 8));
					// 调用服务使requestStatus为"P"
					super.writeOneRow(sb.toString());
				} catch (Exception e) {
					log.info(e.getMessage(), e);
					e.getMessage();
				}

			}
		} catch (Exception ex) {
			log.error(ex);
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
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

	public static void main(String[] args) throws Exception {
		FpFrameWork.main(new String[] { "-process", "CRM_INC_RPT_FP_01", "1", "0" });
		// System.out.print(TimeUtil.getYYYYMM(TimeUtil.addOrMinusMonth(new Date().getTime(), -1)));
	}
}
