package com.asiainfo.crm.cm.customer.group.dao.impl;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.SessionManager;
import com.ai.appframe2.complex.tab.split.SplitTableFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.common.util.CommonTool;
import com.asiainfo.crm.cm.customer.group.dao.interfaces.ICmCalGroupSegmentDAO;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustSegmentRelaBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupOrgDifferBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupOrgDifferEngine;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustSegmentRelaValue;
import com.asiainfo.crm.cm.inner.customer.service.interfaces.ICmCustSegmentRelaSV;

public class CmCalGroupSegmentDAOImpl implements ICmCalGroupSegmentDAO{
	
	/**
	 *  查询所有集团组织层级变更差异表数据
	 */
	public DataContainer[] queryGroupDifferData(String tenantId,String regionId) throws Exception {
		StringBuffer condition = new StringBuffer();
		condition.append("SELECT A.DIFFER_ID, A.CUST_ID, A.IMPORT_PARENT_CUST_ID, A.PARENT_CUST_ID FROM");
		condition.append(" {CM_GROUP_ORG_DIFFER} A,");
		condition.append(" {CM_GROUP_ORG_STRUCT} B");
		condition.append(" WHERE A.CUST_ID=B.REL_CUST_ID");
		//condition.append(" AND A.IMPORT_PARENT_CUST_ID=B.CUST_ID");
		condition.append(" AND A.PARENT_CUST_ID>0");
		condition.append(" AND A.PROCESS_STATUS<>'3' ");
		condition.append(" AND DATE_FORMAT(A.DONE_DATE, '%Y%m%d') =  DATE_FORMAT(NOW(), '%Y%m%d') ");
		condition.append(" AND A.STATE='U'");
		condition.append(" AND B.STATE='U'");
		condition.append(" ORDER BY A.CUST_ID ");
		String sql = SplitTableFactory.createQuerySQL(condition.toString(), new HashMap<Object, Object>());
		return CommonTool.queryBeansFromSql(sql, null, -1, -1);
	}

	/**
	 * 查询新增集团客户数据   
	 */
	public DataContainer[] queryNewGroupCustomerData(String tenantId,String regionId) throws Exception {
		StringBuffer condition = new StringBuffer();
		condition.append("SELECT");
		condition.append(" B.CUST_ID,");
		condition.append(" B.VOCATION,");
		condition.append(" B.SUB_VOCATION,");
		condition.append(" C.ENT_TOTAL_EMPLOYEES,");
		condition.append(" C.LEGAL_FORM ");
		condition.append(" FROM ");
		condition.append(" {CM_GROUP_ORG_STRUCT} A, ");
		condition.append(" {CM_GROUP_CUSTOMER} B, ");
		condition.append(" {CMX_GROUP_CUSTOMER} C ");
		condition.append(" WHERE B.CUST_ID=A.CUST_ID ");
		condition.append(" AND B.CUST_ID=C.CUST_ID");
		condition.append(" AND A.PARENT_DEPT_ID=A.CUST_ID ");
		condition.append(" AND (A.HAS_LEAF<>1 OR A.HAS_LEAF IS NULL)");
		condition.append(" AND DATE_FORMAT(B.CREATE_DATE, '%Y%m%d') =  DATE_FORMAT(NOW(), '%Y%m%d') ");
		condition.append(" AND B.CUST_CERT_TYPE='17'");//17代表证件类型为KOB
		condition.append(" AND LENGTH(B.CUST_CERT_CODE)=10 ");
		condition.append(" AND A.STATE='U'");
		condition.append(" AND B.STATE='U'");
		condition.append(" AND C.STATE='U'");
		String sql = SplitTableFactory.createQuerySQL(condition.toString(), new HashMap());
		return CommonTool.queryBeansFromSql(sql, null, -1, -1);
	}

	/**
	 * 更新重新计算后的差异数据状态
	 * @param differBean
	 * @throws Exception
	 */
	public void saveDifferData(BOCmGroupOrgDifferBean differBean) throws Exception {
		differBean.setDoneDate(new Timestamp(System.currentTimeMillis()));
		differBean.setOpId(SessionManager.getUser().getID());
		differBean.setOrgId(SessionManager.getUser().getOrgId());
		BOCmGroupOrgDifferEngine.save(differBean);
	}
	
	/**
	 * 更新保存集团以及子集团的客户细分
	 * @param parentCustId
	 * @param segmentId
	 * @throws Exception
	 */
	public void saveGroupSegmentRela(long parentCustId, long segmentId, String tenantId) throws Exception {
		//查询集团的细分
		IBOCmCustSegmentRelaValue segmentRelaBean =  ((ICmCustSegmentRelaSV) ServiceFactory.getService(ICmCustSegmentRelaSV.class)).querySegmentRelaByCustId(parentCustId);
		//集团细分存在，判断是否可修改
		if(segmentRelaBean != null){
			if(segmentRelaBean.getIsRevisable() == 1){//允许修改
				updateSegment(segmentRelaBean, segmentId);
				//查询出该集团下的子级
				StringBuffer condition = new StringBuffer();
				String structTabName = "CM_GROUP_ORG_STRUCT_" + tenantId;
				condition.append("SELECT CUST_ID FROM " + structTabName + " WHERE REL_CUST_ID = :parentCustId ");
				Map map = new HashMap();
				map.put("parentCustId", parentCustId);
				DataContainer[] data = CommonTool.queryBeansFromSql(condition.toString(), map, -1, -1);
				if(data != null && data.length > 0){
					for(int i=0; i<data.length; i++){
						IBOCmCustSegmentRelaValue subGroupSegmentRelaBean =  ((ICmCustSegmentRelaSV) ServiceFactory.getService(ICmCustSegmentRelaSV.class)).querySegmentRelaByCustId(data[i].getAsLong("CUST_ID"));
						if(subGroupSegmentRelaBean != null){
							if(subGroupSegmentRelaBean.getIsRevisable() == 1){//允许修改
								updateSegment(subGroupSegmentRelaBean, segmentId);
							} else {
								continue;
							}
						} else {//不存在，新增一条子级细分	
							saveNewSegment(data[i].getAsLong("CUST_ID"), segmentId);
						}
					}
				}
			}
		} else {//不存在，新增一条细分				
			saveNewSegment(parentCustId, segmentId);
		}		
	}
	
	/**
	 *  新增集团客户细分
	 * @param custId
	 * @param segmentId
	 * @throws Exception
	 */
	public void saveNewSegment(long custId, long segmentId) throws Exception {
		IBOCmCustSegmentRelaValue subGroupSegmentRelaBean = new BOCmCustSegmentRelaBean();
		subGroupSegmentRelaBean.setCustId(custId);//取得集团客户ID
		subGroupSegmentRelaBean.setSegmentId(segmentId);
		subGroupSegmentRelaBean.setIsInheritable(1);
		subGroupSegmentRelaBean.setIsRevisable(1);
		subGroupSegmentRelaBean.setIsCreditCalculated(1);
		subGroupSegmentRelaBean.setIsApprovable(1);
		((ICmCustSegmentRelaSV) ServiceFactory.getService(ICmCustSegmentRelaSV.class)).saveSegmentRela(subGroupSegmentRelaBean);
	}
	
	/**
	 * 更新集团客户细分
	 * @param segmentRelaBean
	 * @param segmentId
	 */
	public void updateSegment(IBOCmCustSegmentRelaValue segmentRelaBean, long segmentId) throws Exception {
		segmentRelaBean.setSegmentId(segmentId);
		((ICmCustSegmentRelaSV) ServiceFactory.getService(ICmCustSegmentRelaSV.class)).saveSegmentRela(segmentRelaBean);
	}
	
	/**
	 * 查询当天新增的集团客户
	 * @param tenantId
	 * @return
	 * @throws Exception
	 */
	public DataContainer[] queryNewGroup(String tenantId) throws Exception {
		String sql = "";
		String condition = "SELECT CUST_ID FROM {CM_GROUP_CUSTOMER}  WHERE GROUP_TYPE = 2 AND DATE_FORMAT(CREATE_DATE, '%Y-%m-%d') = DATE_FORMAT(NOW(), '%Y-%m-%d') AND CUST_CERT_TYPE = '17' AND LENGTH(CUST_CERT_CODE) = 10 AND STATE = 'U'" ;
		if(null!=tenantId && !"".equals(tenantId)){
			sql = SplitTableFactory.createQuerySQL(condition.toString(),new HashMap());
		}else{
			ExceptionUtil.throwBusinessException("Dtenant.id not found!!");
		}
		return CommonTool.queryBeansFromSql(sql, null, -1, -1);
	}
	
	/**
	 * 查询已经存在的集团加入某个层级
	 * @param tenantId
	 * @return
	 * @throws Exception
	 */
	public DataContainer[] queryGroupAddStructData(String tenantId) throws Exception {
		String sql = "";
		StringBuffer condition = new StringBuffer();
		condition.append(" SELECT  B.DIFFER_ID, A.CUST_ID, B.PARENT_CUST_ID, B.IMPORT_PARENT_CUST_ID FROM {CM_GROUP_CUSTOMER} A, {CM_GROUP_ORG_DIFFER} B ,{CM_CUST_SEGMENT_RELA} C ");
		condition.append(" WHERE DATE_FORMAT(A.CREATE_DATE, '%Y%m%d') <=  DATE_FORMAT(NOW(), '%Y%m%d') AND A.CUST_ID=B.CUST_ID AND A.CUST_ID = C.CUST_ID  ");
		condition.append(" AND CUST_CERT_TYPE='17' AND LENGTH(CUST_CERT_CODE)=10 ");
		condition.append(" AND DATE_FORMAT(B.DONE_DATE, '%Y%m%d') =  DATE_FORMAT(NOW(), '%Y%m%d') ");
		condition.append(" AND B.PROCESS_STATUS<>'3' AND B.PARENT_CUST_ID>0 AND A.STATE='U' AND C.STATE = 'U' ");
		if(null!=tenantId && !"".equals(tenantId)){
			sql = SplitTableFactory.createQuerySQL(condition.toString(),new HashMap());
		}else{
			ExceptionUtil.throwBusinessException("Dtenant.id not found!!");
		}
		return CommonTool.queryBeansFromSql(sql, null, -1, -1);
	}
	
	/**
	 * 根据cust_ID查询对应的细分
	 * @param tenantId
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	public DataContainer[] querySegmentByCustId(String tenantId, String custId) throws Exception {
		String sql = "";
		StringBuffer condition = new StringBuffer();
		condition.append("SELECT A.CUST_ID, A.SEGMENT_ID FROM {CM_CUST_SEGMENT_RELA} A, {CM_GROUP_ORG_STRUCT} B ");
		condition.append("WHERE B.CUST_ID=:custId AND A.CUST_ID=B.REL_CUST_ID AND A.SEGMENT_ID >0 ORDER BY A.IS_REVISABLE DESC");		
		if(null!=tenantId && !"".equals(tenantId)){
			sql = SplitTableFactory.createQuerySQL(condition.toString(),new HashMap());
		}else{
			ExceptionUtil.throwBusinessException("Dtenant.id not found!!");
		}
		Map map = new HashMap();
		map.put("custId", custId);
		return CommonTool.queryBeansFromSql(sql, map, -1, -1);
	}

	@Override
	public long queryGroupDifferDataByCustId(long custId) throws Exception {
		long count = 0;
		if (custId > 0) {
			StringBuffer condition = new StringBuffer();
			Map map = new HashMap();
			condition.append("SELECT COUNT(1) AS CNT FROM");
			condition.append(" {CM_GROUP_ORG_STRUCT} A ");
			condition.append(" WHERE A.CUST_ID = :custId ");
			condition.append(" AND A.STATE='U' AND A.DEPT_TYPE = 0");
			map.put("custId", custId);
			String sql = SplitTableFactory.createQuerySQL(condition.toString(), new HashMap<Object, Object>());
			DataContainer[] dc = CommonTool.queryBeansFromSql(sql, map, -1, -1);
			if (dc.length > 0) {
				count = dc[0].getAsLong("CNT");
			}
		}
		return count;
	}
}
