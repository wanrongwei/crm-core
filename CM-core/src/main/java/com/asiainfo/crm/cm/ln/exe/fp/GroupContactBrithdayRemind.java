package com.asiainfo.crm.cm.ln.exe.fp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.common.util.ExceptionUtil;
import com.ai.omframe.util.SoDBUtils;
import com.ai.omframe.util.SoUtil;
import com.asiainfo.appframe.ext.exeframe.fp.FpFrameWork;
import com.asiainfo.appframe.ext.exeframe.fp.process.AbstractFpProcessImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmConnUtil;
import com.asiainfo.crm.cm.common.util.FtpFileNamingUtil;

public class GroupContactBrithdayRemind extends AbstractFpProcessImpl {

	private static transient Log log = LogFactory.getLog(GroupContactBrithdayRemind.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.asiainfo.appframe.ext.exeframe.fp.process.AbstractFpProcessImpl#getFileName() 生成文件名称和格式
	 */
	public String getFileName() throws Exception {
		String fileName = FtpFileNamingUtil.getTodayFileName("group_cont_birth_remind", ".dat", "yyyyMMdd");
		return fileName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.asiainfo.appframe.ext.exeframe.fp.process.AbstractFpProcessImpl#getRowSplit() 获取写入文件的数据，以什么换行
	 */
	public String getRowSplit() throws Exception {
		return "\n";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.asiainfo.appframe.ext.exeframe.fp.process.AbstractFpProcessImpl#process() 具体的业务处理进程
	 */
	public void process() throws Exception {
		PreparedStatement pstmt = null;
		Connection conn = CmConnUtil.getWriteAblePartyConn();
		ResultSet rs = null;
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT T2.CUST_ID, ");
			sql.append("T2.CUST_NAME, ");
			sql.append("CASE ");
			sql.append("WHEN T1.CONT_TYPE = 1 THEN ");
			sql.append("'Contacts' ");
			sql.append("ELSE ");
			sql.append("'Key people' ");
			sql.append("END CASE, ");
			sql.append("T1.BILL_ID, ");
			sql.append("T.BIRTHDAY, ");
			sql.append("T.CUST_NAME, ");
			sql.append("T3.MANAGER_ID ");
			sql.append("FROM CM_INDIV_CUSTOMER T, ");
			sql.append("CM_GROUP_CONTACT  T1, ");
			sql.append("CM_GROUP_CUSTOMER T2, ");
			sql.append("(SELECT CUST_ID, MANAGER_ID ");
			sql.append("FROM CM_GROUP_MANAGER ");
			sql.append("WHERE REL_TYPE = 1) T3 ");
			sql.append("WHERE T.PARTY_ID = T1.PARTY_ID ");
			sql.append("AND T.LUNAR = 0 ");
			sql.append("AND T.CUST_STATUS <> 0 ");
			sql.append("AND T1.CUST_ID = T2.CUST_ID ");
			sql.append("AND T2.CUST_ID = T3.CUST_ID(+) ");
			sql.append("AND T1.CONT_TYPE IN (1, 2) ");
			sql.append("AND date_format(T.BIRTHDAY, '%m%d') > date_format("+SoDBUtils.getSqlSysDateStr()+", '%m%d') ");
			sql.append("AND date_format(T.BIRTHDAY, '%m%d') <= date_format(date_add("+SoDBUtils.getSqlSysDateStr()+", interval 7 day), '%m%d') ");
			pstmt = conn.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			rs.setFetchSize(CmConstants.TASK_INFO.BATCH_SIZE);
			StringBuilder sBuilder = null;
			while (rs.next()) {
				sBuilder = new StringBuilder();
				sBuilder.append(rs.getString(1) == null ? "" : rs.getString(1));
				sBuilder.append("|");
				sBuilder.append(rs.getString(2) == null ? "" : rs.getString(2));
				sBuilder.append("|");
				sBuilder.append(rs.getString(3) == null ? "" : rs.getString(3));
				sBuilder.append("|");
				sBuilder.append(rs.getString(4) == null ? "" : rs.getString(4));
				sBuilder.append("|");
				sBuilder.append(rs.getString(5) == null ? "" : rs.getString(5));
				sBuilder.append("|");
				sBuilder.append(rs.getString(6) == null ? "" : rs.getString(6));
				sBuilder.append("|");
				sBuilder.append(rs.getString(7) == null ? "" : rs.getString(7)).append("\n");
				super.writeOneRow(sBuilder.toString());
			}
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			ExceptionUtil.throwBusinessException(e.getMessage());
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

	public static void main(String[] args) throws Exception {
		FpFrameWork.main(new String[] { "-process", "CM_FP", "1", "0" });

	}

}
