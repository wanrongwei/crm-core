package com.asiainfo.crm.cm.customer.group.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.tab.split.TenantIDFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.customer.group.dao.interfaces.ICmGroupOrgDifferDAO;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupOrgDifferBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupOrgDifferEngine;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupOrgStructBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupOrgStructEngine;
import com.asiainfo.crm.cm.inner.customer.bo.QBOCmGroupOrgDifferBean;
import com.asiainfo.crm.cm.inner.customer.bo.QBOCmGroupOrgDifferEngine;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmGroupOrgDifferValue;


public class CmGroupOrgDifferDAOImpl implements ICmGroupOrgDifferDAO {

	@Override
	public IQBOCmGroupOrgDifferValue[] queryGroupOrgDiffers(long custId, int startNum, int endNum) throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 ");
		Map parameter = new HashMap();
		if (custId > 0) {
			condition.append(" AND ").append(IQBOCmGroupOrgDifferValue.S_CustId).append(" = :custId");
			parameter.put("custId", custId);
		}
		condition.append(" AND ");
		condition.append(IQBOCmGroupOrgDifferValue.S_ImportSource).append(" = :importSource");
		parameter.put("importSource", "KOB");
//		condition.append(" AND ");
//		condition.append(IQBOCmGroupOrgDifferValue.S_IsAlert).append(" = :isAlert");
//		parameter.put("isAlert", "1");
//		condition.append(" AND ");
//		condition.append(IQBOCmGroupOrgDifferValue.S_ProcessStatus).append(" = :processStatus");
//		parameter.put("processStatus", "1");		
		condition.append(" AND ");
		condition.append(IQBOCmGroupOrgDifferValue.S_State).append(" = :state");
		parameter.put("state", "U");
		IQBOCmGroupOrgDifferValue[] value = QBOCmGroupOrgDifferEngine.getBeans(null, condition.toString(), parameter, startNum, endNum, false);
		return value;
	}
	
	public IQBOCmGroupOrgDifferValue[] queryGroupOrgDiffersByCustId(long custId, int startNum, int endNum) throws Exception {
		 //对CustId 进行组装
		 Connection conn = null;
		 PreparedStatement ps = null;
		 ResultSet rs = null;
		 List<QBOCmGroupOrgDifferBean> cmGroupOrgDifferValueList = new ArrayList<QBOCmGroupOrgDifferBean>();
		 try {
			 conn = ServiceManager.getSession().getConnection();
			 //CM_GROUP_ORG_DIFFER_21
			 String tablename_CM_GROUP_ORG_DIFFER = "CM_GROUP_ORG_DIFFER_"+TenantIDFactory.getTenantId();
			 //CM_GROUP_CUSTOMER_21
			 String tablename_CM_GROUP_CUSTOMER = "CM_GROUP_CUSTOMER_"+TenantIDFactory.getTenantId();
			 //CM_GROUP_ORG_STRUCT_21
			 String tablename_CM_GROUP_ORG_STRUCT = "CM_GROUP_ORG_STRUCT_"+TenantIDFactory.getTenantId();
			 
			 StringBuffer sqlString = new StringBuffer();
			 sqlString.append(" select * from (");
			 sqlString.append(" SELECT BB.DIFFER_ID,BB.DEPT_ID,BB.PARENT_DEPT_ID,BB.IMPORT_PARENT_DEPT_ID,BB.CUST_ID,BB.PARENT_CUST_ID,BB.IMPORT_PARENT_CUST_ID,BB.CUST_SERVICE_ID,BB.PARENT_CUSTSERV_ID,BB.IMPORT_PARENT_CUSTSERV_ID,BB.IMPORT_SOURCE,BB.IMPORT_DATE,BB.IS_ALERT,BB.PROCESS_STATUS,BB.STATE,BB.CREATE_OP_ID,BB.CREATE_ORG_ID,BB.OP_ID,BB.ORG_ID,BB.DONE_CODE,BB.CREATE_DATE,BB.DONE_DATE,BB.EFFECTIVE_DATE,BB.EXPIRE_DATE,BB.REGION_ID,BB.REMARKS,BB.PARTY_ID,BB.CUST_NAME,BB.DEPT_NAME, BB.PARENT_DEPT_NAME_OLD PARENT_DEPT_NAME_OLD , B2.DEPT_NAME PARENT_DEPT_NAME_NEW FROM (");
			 sqlString.append(" SELECT AA.DIFFER_ID,AA.DEPT_ID,AA.PARENT_DEPT_ID,AA.IMPORT_PARENT_DEPT_ID,AA.CUST_ID,AA.PARENT_CUST_ID,AA.IMPORT_PARENT_CUST_ID,AA.CUST_SERVICE_ID,AA.PARENT_CUSTSERV_ID,AA.IMPORT_PARENT_CUSTSERV_ID,AA.IMPORT_SOURCE,AA.IMPORT_DATE,AA.IS_ALERT,AA.PROCESS_STATUS,AA.STATE,AA.CREATE_OP_ID,AA.CREATE_ORG_ID,AA.OP_ID,AA.ORG_ID,AA.DONE_CODE,AA.CREATE_DATE,AA.DONE_DATE,AA.EFFECTIVE_DATE,AA.EXPIRE_DATE,AA.REGION_ID,AA.REMARKS,AA.PARTY_ID,AA.CUST_NAME,AA.DEPT_NAME, B1.DEPT_NAME PARENT_DEPT_NAME_OLD  FROM (");
			 sqlString.append(" SELECT A.DIFFER_ID,A.DEPT_ID,A.PARENT_DEPT_ID,A.IMPORT_PARENT_DEPT_ID,A.CUST_ID,A.PARENT_CUST_ID,A.IMPORT_PARENT_CUST_ID,A.CUST_SERVICE_ID,A.PARENT_CUSTSERV_ID,A.IMPORT_PARENT_CUSTSERV_ID,A.IMPORT_SOURCE,A.IMPORT_DATE,A.IS_ALERT,A.PROCESS_STATUS,A.STATE,A.CREATE_OP_ID,A.CREATE_ORG_ID,A.OP_ID,A.ORG_ID,A.DONE_CODE,A.CREATE_DATE,A.DONE_DATE,A.EFFECTIVE_DATE,A.EXPIRE_DATE,A.REGION_ID,A.REMARKS,B.PARTY_ID,B.CUST_NAME,C.DEPT_NAME FROM  ");
			 sqlString.append(tablename_CM_GROUP_ORG_DIFFER);
			 sqlString.append("  A LEFT JOIN ");
			 sqlString.append(tablename_CM_GROUP_CUSTOMER);
			 sqlString.append("  B ON A.CUST_ID=B.CUST_ID LEFT JOIN ");
			 sqlString.append(tablename_CM_GROUP_ORG_STRUCT);
			 sqlString.append("  C ON A.DEPT_ID=C.DEPT_ID ");
			 if (custId > 0) {
				 sqlString.append(" Where A.Cust_id = ? ");
			 }
			 sqlString.append(" ) AA LEFT JOIN ");
			 sqlString.append(tablename_CM_GROUP_ORG_STRUCT);
			 sqlString.append(" B1 ON AA.PARENT_DEPT_ID = B1.DEPT_ID) BB LEFT JOIN ");
			 sqlString.append(tablename_CM_GROUP_ORG_STRUCT);
			 sqlString.append(" B2 ON BB.IMPORT_PARENT_DEPT_ID = B2.DEPT_ID ");
			 sqlString.append(" ) __MS where  1=1 ");
			 if (custId > 0) {
				 sqlString.append(" AND CUST_ID = ? ");
			 }
			 sqlString.append(" AND IMPORT_SOURCE = 'KOB' AND STATE ='U' ");
			 if(startNum>0&&endNum>0){
				 sqlString.append(" limit ?,? ");
			 }
			 
			 ps = conn.prepareStatement(sqlString.toString());
			 if (custId > 0) {
				 ps.setObject(1,  custId ); 
				 ps.setObject(2,  custId ); 
				 if(startNum>0&&endNum>0){
					 ps.setObject(3,  startNum ); 
					 ps.setObject(4,  endNum ); 
				 }
			 }else{
				 if(startNum>0&&endNum>0){
					 ps.setObject(1,  startNum ); 
					 ps.setObject(2,  endNum ); 
				 }
			 }
			 
			 rs = ps.executeQuery();
			 
			 while (rs.next()) {
				 QBOCmGroupOrgDifferBean cmGroupOrgDiffer = new QBOCmGroupOrgDifferBean();
				 cmGroupOrgDiffer.setDifferId(rs.getLong("DIFFER_ID"));
				 cmGroupOrgDiffer.setDeptId(rs.getLong("DEPT_ID"));
				 cmGroupOrgDiffer.setParentDeptId(rs.getLong("PARENT_DEPT_ID"));
				 cmGroupOrgDiffer.setImportParentDeptId(rs.getLong("IMPORT_PARENT_DEPT_ID"));
				 cmGroupOrgDiffer.setCustId(rs.getLong("CUST_ID"));
				 cmGroupOrgDiffer.setParentCustId(rs.getLong("PARENT_CUST_ID"));
				 cmGroupOrgDiffer.setImportParentCustId(rs.getLong("IMPORT_PARENT_CUST_ID"));
				 cmGroupOrgDiffer.setCustServiceId(rs.getString("CUST_SERVICE_ID"));
				 cmGroupOrgDiffer.setParentCustservId(rs.getString("PARENT_CUSTSERV_ID"));
				 cmGroupOrgDiffer.setImportParentCustservId(rs.getString("IMPORT_PARENT_CUSTSERV_ID"));
				 cmGroupOrgDiffer.setImportSource(rs.getString("IMPORT_SOURCE"));
				 cmGroupOrgDiffer.setImportDate(rs.getTimestamp("IMPORT_DATE"));
				 cmGroupOrgDiffer.setIsAlert(rs.getInt("IS_ALERT"));
				 cmGroupOrgDiffer.setProcessStatus(rs.getInt("PROCESS_STATUS"));
				 cmGroupOrgDiffer.setState(rs.getString("STATE"));
				 cmGroupOrgDiffer.setCreateOpId(rs.getLong("CREATE_OP_ID"));
				 cmGroupOrgDiffer.setCreateOrgId(rs.getLong("CREATE_ORG_ID"));
				 cmGroupOrgDiffer.setOpId(rs.getLong("OP_ID"));
				 cmGroupOrgDiffer.setOrgId(rs.getLong("ORG_ID"));
				 cmGroupOrgDiffer.setDoneCode(rs.getLong("DONE_CODE"));
				 cmGroupOrgDiffer.setCreateDate(rs.getTimestamp("CREATE_DATE"));
				 cmGroupOrgDiffer.setDoneDate(rs.getTimestamp("DONE_DATE"));
				 cmGroupOrgDiffer.setEffectiveDate(rs.getTimestamp("EFFECTIVE_DATE"));
				 cmGroupOrgDiffer.setExpireDate(rs.getTimestamp("EXPIRE_DATE"));
				 cmGroupOrgDiffer.setRegionId(rs.getString("REGION_ID"));
				 cmGroupOrgDiffer.setRemarks(rs.getString("REMARKS"));
				 cmGroupOrgDiffer.setPartyId(rs.getLong("PARTY_ID"));
				 cmGroupOrgDiffer.setCustName(rs.getString("CUST_NAME"));
				 cmGroupOrgDiffer.setDeptName(rs.getString("DEPT_NAME"));
				 cmGroupOrgDiffer.setParentDeptNameOld(rs.getString("PARENT_DEPT_NAME_OLD"));
				 cmGroupOrgDiffer.setParentDeptNameNew(rs.getString("PARENT_DEPT_NAME_NEW"));
				 cmGroupOrgDifferValueList.add(cmGroupOrgDiffer);
			 }
		 }catch(Exception e){
			 e.printStackTrace();
			 throw e;
		 }
		 finally {
			 CmCommonUtil.closeJDBC(conn, ps, null);
		 }
		 
		return cmGroupOrgDifferValueList.toArray(new QBOCmGroupOrgDifferBean[0]);
	}
	
	public void saveOrgDiffer(BOCmGroupOrgStructBean[] orgStruct, BOCmGroupOrgDifferBean[] orgDiffer) throws Exception {
		BOCmGroupOrgStructEngine.save(orgStruct);
		BOCmGroupOrgDifferEngine.save(orgDiffer);
	}
}
