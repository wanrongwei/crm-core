package com.asiainfo.crm.cm.ln.exe.fp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.common.util.ExceptionUtil;
import com.asiainfo.appframe.ext.exeframe.fp.FpFrameWork;
import com.asiainfo.appframe.ext.exeframe.fp.process.AbstractFpProcessImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmConnUtil;
import com.asiainfo.crm.cm.common.util.FtpFileNamingUtil;

public class CustManagerTeam extends AbstractFpProcessImpl{
    
    private static transient Log log = LogFactory.getLog(GroupContactBrithdayRemind.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.asiainfo.appframe.ext.exeframe.fp.process.AbstractFpProcessImpl#getFileName() 生成文件名称和格式
	 */
	public String getFileName() throws Exception {
		String fileName = FtpFileNamingUtil.getTodayFileName("cust_manager_team", ".txt", "yyyyMMdd");
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
			sql.append("SELECT T.TEAM_ID, ");
			sql.append("T.TEAM_NAME, ");
			sql.append("T.PROVINCE_ID, ");
			sql.append("T.REGION_CODE, ");
			sql.append("T.COUNTY_CODE, ");
			sql.append("T.REGION_DETAIL, ");
			sql.append("T.PARENT_TEAM_ID, ");
			sql.append("T.REMARKS, ");
			sql.append("T.REGION_ID, ");
			sql.append("T.EXPIRE_DATE, ");
			sql.append("T.EFFECTIVE_DATE, ");
			sql.append("T.DONE_DATE, ");
			sql.append("T.CREATE_DATE, ");
			sql.append("T.DONE_CODE, ");
			sql.append("T.ORG_ID, ");
			sql.append("T.OP_ID, ");
			sql.append("T.CREATE_ORG_ID, ");
			sql.append("T.CREATE_OP_ID, ");
			sql.append("T.STATE ");
			
			sql.append("FROM CM_CUST_MANAGER_TEAM T ");
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
				sBuilder.append(rs.getString(7) == null ? "" : rs.getString(7));
				sBuilder.append("|");
				sBuilder.append(rs.getString(8) == null ? "" : rs.getString(8));
				sBuilder.append("|");
				sBuilder.append(rs.getString(9) == null ? "" : rs.getString(9));
				sBuilder.append("|");
				sBuilder.append(rs.getString(10) == null ? "" : rs.getString(10));
				sBuilder.append("|");
				sBuilder.append(rs.getString(11) == null ? "" : rs.getString(11));
				sBuilder.append("|");
				sBuilder.append(rs.getString(12) == null ? "" : rs.getString(12));
				sBuilder.append("|");
				sBuilder.append(rs.getString(13) == null ? "" : rs.getString(13));
				sBuilder.append("|");
				sBuilder.append(rs.getString(14) == null ? "" : rs.getString(14));
				sBuilder.append("|");
				sBuilder.append(rs.getString(15) == null ? "" : rs.getString(15));
				sBuilder.append("|");
				sBuilder.append(rs.getString(16) == null ? "" : rs.getString(16));
				sBuilder.append("|");
				sBuilder.append(rs.getString(17) == null ? "" : rs.getString(17));
				sBuilder.append("|");
				sBuilder.append(rs.getString(18) == null ? "" : rs.getString(18));
				sBuilder.append("|");
				sBuilder.append(rs.getString(19) == null ? "" : rs.getString(19)).append("\n");
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
