package com.asiainfo.crm.cm.custgroup.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.ai.omframe.util.SoDBUtils;
import com.asiainfo.crm.cm.custgroup.bo.BOCmCustomerGroupEngine;
import com.asiainfo.crm.cm.custgroup.dao.interfaces.ICustGroupDAO;
import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmCustomerGroupValue;
import com.asiainfo.crm.cm.custgroup.utils.CmGroupConstants;


public class CustGroupDAOImpl implements ICustGroupDAO{

	public void saveCmCustomerGroupValue(IBOCmCustomerGroupValue value)throws Exception {
		if(value == null)
			return;
		if(value.isNew() || value.getGroupId()==0l){
			if(value.getGroupId() <= 0){
				value.setStsToNew();
				value.setGroupId(BOCmCustomerGroupEngine.getNewId().longValue());
			}
				
		}
		BOCmCustomerGroupEngine.save(value);
	}

	public IBOCmCustomerGroupValue[] queryCmCustomerGroupByCondition(long groupId,int start, int end) throws Exception {
		StringBuilder condition = new StringBuilder(" 1 = 1 ");
		HashMap paraMap = new HashMap();
		if(groupId > 0){
			condition.append(" AND ").append(IBOCmCustomerGroupValue.S_GroupId).append(" = :").append(IBOCmCustomerGroupValue.S_GroupId);
			paraMap.put(IBOCmCustomerGroupValue.S_GroupId, groupId);
		}
		
		condition.append(" AND ").append(IBOCmCustomerGroupValue.S_GroupStatus).append(" = :").append(IBOCmCustomerGroupValue.S_GroupStatus);
		paraMap.put(IBOCmCustomerGroupValue.S_GroupStatus, CmGroupConstants.GroupStatus.Active); 
		
		return BOCmCustomerGroupEngine.getBeans(null, condition.toString(), paraMap, start, end, false);
	}

	public IBOCmCustomerGroupValue[] queryCmCustomerGroupByCondition(IBOCmCustomerGroupValue value, int groupEffExpStatus, int startNum, int endNum)throws Exception {
		StringBuffer condition = new StringBuffer(" 1 = 1 ");
		Map<String,Object> parameter = new HashMap<String, Object>();
		
		if ( value.getGroupId()>0 ){
			condition.append(" AND ").append(IBOCmCustomerGroupValue.S_GroupId).append(" =:").append(IBOCmCustomerGroupValue.S_GroupId);
			parameter.put(IBOCmCustomerGroupValue.S_GroupId, value.getGroupId());
		}
		if ( StringUtils.isNotBlank( value.getGroupName() ) ){
			condition.append(" AND ").append(IBOCmCustomerGroupValue.S_GroupName).append(" like ").append("'%"+ value.getGroupName() +"%'");
		}
		if ( value.getGroupType()>0 ){
			condition.append(" AND ").append(IBOCmCustomerGroupValue.S_GroupType).append(" =:").append(IBOCmCustomerGroupValue.S_GroupType);
			parameter.put(IBOCmCustomerGroupValue.S_GroupType, value.getGroupType());
		}
		if ( value.getGroupStatus()>0 ){
			condition.append(" AND ").append(IBOCmCustomerGroupValue.S_GroupStatus).append(" =:").append(IBOCmCustomerGroupValue.S_GroupStatus);
			parameter.put(IBOCmCustomerGroupValue.S_GroupStatus, value.getGroupStatus());
		}
		if ( value.getGroupLevel()>0 ){
			condition.append(" AND ").append(IBOCmCustomerGroupValue.S_GroupLevel).append(" =:").append(IBOCmCustomerGroupValue.S_GroupLevel);
			parameter.put(IBOCmCustomerGroupValue.S_GroupLevel, value.getGroupLevel());
		}
		if ( value.getValidType()>0 ){
			condition.append(" AND ").append(IBOCmCustomerGroupValue.S_ValidType).append(" =:").append(IBOCmCustomerGroupValue.S_ValidType);
			parameter.put(IBOCmCustomerGroupValue.S_ValidType, value.getValidType());
		}
		if ( groupEffExpStatus==CmGroupConstants.GroupEffExpStatus.VALID_TYPE_EXPIRED ){
			// 失效
			condition.append(" AND ").append(IBOCmCustomerGroupValue.S_EffectiveDate).append(" < ").append(IBOCmCustomerGroupValue.S_ExpireDate);
			condition.append(" AND ").append(IBOCmCustomerGroupValue.S_ExpireDate).append(" < ").append(SoDBUtils.getSqlSysDateStr());
		}else if ( groupEffExpStatus==CmGroupConstants.GroupEffExpStatus.VALID_TYPE_NOW ){
			// 生效
			condition.append(" AND ").append(IBOCmCustomerGroupValue.S_EffectiveDate).append(" < ").append(SoDBUtils.getSqlSysDateStr());
			condition.append(" AND ").append(IBOCmCustomerGroupValue.S_ExpireDate).append(" > ").append(SoDBUtils.getSqlSysDateStr());
		}else if ( groupEffExpStatus==CmGroupConstants.GroupEffExpStatus.VALID_TYPE_NEXT ){
			// 未来生效
			condition.append(" AND ").append(IBOCmCustomerGroupValue.S_EffectiveDate).append(" < ").append(IBOCmCustomerGroupValue.S_ExpireDate);
			condition.append(" AND ").append(IBOCmCustomerGroupValue.S_EffectiveDate).append(" < ").append(SoDBUtils.getSqlSysDateStr());
		}
		
		return BOCmCustomerGroupEngine.getBeans(null, condition.toString(), parameter, startNum, endNum, false);
	}
	
	public int queryCmCustomerGroupCountByCondition(IBOCmCustomerGroupValue value, int groupEffExpStatus)throws Exception {
		StringBuffer condition = new StringBuffer(" 1 = 1 ");
		Map<String,Object> parameter = new HashMap<String, Object>();
		
		if ( value.getGroupId()>0 ){
			condition.append(" AND ").append(IBOCmCustomerGroupValue.S_GroupId).append(" =:").append(IBOCmCustomerGroupValue.S_GroupId);
			parameter.put(IBOCmCustomerGroupValue.S_GroupId, value.getGroupId());
		}
		if ( StringUtils.isNotBlank( value.getGroupName() ) ){
			condition.append(" AND ").append(IBOCmCustomerGroupValue.S_GroupName).append(" like ").append("'%"+ value.getGroupName() +"%'");
		}
		if ( value.getGroupType()>0 ){
			condition.append(" AND ").append(IBOCmCustomerGroupValue.S_GroupType).append(" =:").append(IBOCmCustomerGroupValue.S_GroupType);
			parameter.put(IBOCmCustomerGroupValue.S_GroupType, value.getGroupType());
		}
		if ( value.getGroupStatus()>0 ){
			condition.append(" AND ").append(IBOCmCustomerGroupValue.S_GroupStatus).append(" =:").append(IBOCmCustomerGroupValue.S_GroupStatus);
			parameter.put(IBOCmCustomerGroupValue.S_GroupStatus, value.getGroupStatus());
		}
		if ( value.getGroupLevel()>0 ){
			condition.append(" AND ").append(IBOCmCustomerGroupValue.S_GroupLevel).append(" =:").append(IBOCmCustomerGroupValue.S_GroupLevel);
			parameter.put(IBOCmCustomerGroupValue.S_GroupLevel, value.getGroupLevel());
		}
		if ( value.getValidType()>0 ){
			condition.append(" AND ").append(IBOCmCustomerGroupValue.S_ValidType).append(" =:").append(IBOCmCustomerGroupValue.S_ValidType);
			parameter.put(IBOCmCustomerGroupValue.S_ValidType, value.getValidType());
		}
		if ( groupEffExpStatus==CmGroupConstants.GroupEffExpStatus.VALID_TYPE_EXPIRED ){
			// 失效
			condition.append(" AND ").append(IBOCmCustomerGroupValue.S_EffectiveDate).append(" < ").append(IBOCmCustomerGroupValue.S_ExpireDate);
			condition.append(" AND ").append(IBOCmCustomerGroupValue.S_ExpireDate).append(" < ").append(SoDBUtils.getSqlSysDateStr());
		}else if ( groupEffExpStatus==CmGroupConstants.GroupEffExpStatus.VALID_TYPE_NOW ){
			// 生效
			condition.append(" AND ").append(IBOCmCustomerGroupValue.S_EffectiveDate).append(" < ").append(SoDBUtils.getSqlSysDateStr());
			condition.append(" AND ").append(IBOCmCustomerGroupValue.S_ExpireDate).append(" > ").append(SoDBUtils.getSqlSysDateStr());
		}else if ( groupEffExpStatus==CmGroupConstants.GroupEffExpStatus.VALID_TYPE_NEXT ){
			// 未来生效
			condition.append(" AND ").append(IBOCmCustomerGroupValue.S_EffectiveDate).append(" < ").append(IBOCmCustomerGroupValue.S_ExpireDate);
			condition.append(" AND ").append(IBOCmCustomerGroupValue.S_EffectiveDate).append(" < ").append(SoDBUtils.getSqlSysDateStr());
		}
		
		return BOCmCustomerGroupEngine.getBeansCount(condition.toString(), parameter);
	}
}
