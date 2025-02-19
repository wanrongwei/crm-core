package com.asiainfo.crm.cm.bi2oneframe.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.asiainfo.crm.cm.bi2oneframe.service.interfaces.ICmCommonServiceSV;
import com.asiainfo.crm.cm.common.util.ConnUtil;

public class CmCommonServiceSVImpl implements ICmCommonServiceSV {

	private static transient Log log = LogFactory.getLog(CmCommonServiceSVImpl.class);

	public void trunkTable(String tableName) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = ConnUtil.getWriteAblePartyConn();
			String sql = "TRUNCATE TABLE " + tableName;
			pstmt = conn.prepareStatement(sql);
			pstmt.executeQuery();
		} catch (Exception e) {
			log.info(e.getMessage(), e);
			log.error(e.getCause() == null ? e.getMessage() : e.getCause().getMessage());
		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
	}
	public void trunkTable(String tableName,String regionId) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = ConnUtil.getWriteAblePartyConn();
			String sql = "DELETE FROM " + tableName +" WHERE REGION_ID= "+regionId ;
			log.error("Execute sql:"+sql);
			pstmt = conn.prepareStatement(sql);
			pstmt.executeQuery();
			conn.commit();
		} catch (Exception e) {
			log.error(tableName+"Table delete failed :",e);
		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
	}
	/*public static void main(String[] args) {
		ICmCommonServiceSV iCmCommonServiceSV=(ICmCommonServiceSV)ServiceFactory.getService(ICmCommonServiceSV.class);
		try {
			iCmCommonServiceSV.trunkTable("CM_USER_CREDIT_LEVEL_TEMP", "418");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
}
