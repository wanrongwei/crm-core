package com.asiainfo.crm.cm.custgroup.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.asiainfo.crm.cm.custgroup.bo.BOCmInvitationCodeEngine;
import com.asiainfo.crm.cm.custgroup.dao.interfaces.IInvitationCodeDAO;
import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmInvitationCodeValue;

public class InvitationCodeDAOImpl implements IInvitationCodeDAO {

	public void save(IBOCmInvitationCodeValue value)throws Exception{
		if(value == null)
			return;
		if(value.isNew() && value.getInvitationCodeId()<=0L){
			if(value.getInvitationCodeId() <= 0){
				value.setStsToNew();
				value.setInvitationCodeId(BOCmInvitationCodeEngine.getNewId().longValue());
			}
				
		}
		BOCmInvitationCodeEngine.save(value);
	}

	public void saveBatch(IBOCmInvitationCodeValue[] values)throws Exception{
		if(values == null || values.length<=0)
			return;
		for (IBOCmInvitationCodeValue value:values){
			if(value.isNew() && value.getInvitationCodeId()<=0L){
				if(value.getInvitationCodeId() <= 0){
					value.setStsToNew();
					value.setInvitationCodeId(BOCmInvitationCodeEngine.getNewId().longValue());
				}
				
			}
		}
		BOCmInvitationCodeEngine.saveBatch(values);
	}
	
	public IBOCmInvitationCodeValue[] getInvitationCodeValuesByConditions(IBOCmInvitationCodeValue condition, int startNum, int endNum)throws Exception{
		StringBuffer sql = new StringBuffer(" 1 = 1 ");
		Map<String,Object> paramMap = new HashMap<String,Object>();

		// 主键
		if ( condition.getInvitationCodeId()>0 ){
			sql.append(" AND ").append(IBOCmInvitationCodeValue.S_InvitationCodeId).append(" =:").append(IBOCmInvitationCodeValue.S_InvitationCodeId);
			paramMap.put(IBOCmInvitationCodeValue.S_InvitationCodeId, condition.getInvitationCodeId());
		}
		// 邀请码
		if ( StringUtils.isNotBlank(condition.getInvitationCode()) ){
			sql.append(" AND ").append(IBOCmInvitationCodeValue.S_InvitationCode).append(" =:").append(IBOCmInvitationCodeValue.S_InvitationCode);
			paramMap.put(IBOCmInvitationCodeValue.S_InvitationCode, condition.getInvitationCode());
		}
		// 邀请码的管理状态
		if ( StringUtils.isNotBlank(condition.getManageStatus()) ){
			sql.append(" AND ").append(IBOCmInvitationCodeValue.S_ManageStatus).append(" =:").append(IBOCmInvitationCodeValue.S_ManageStatus);
			paramMap.put(IBOCmInvitationCodeValue.S_ManageStatus, condition.getManageStatus());
		}
		// 记录的状态 U/E
		if ( StringUtils.isNotBlank(condition.getState()) ){
			sql.append(" AND ").append(IBOCmInvitationCodeValue.S_State).append(" =:").append(IBOCmInvitationCodeValue.S_State);
			paramMap.put(IBOCmInvitationCodeValue.S_State, condition.getState());
		}
		return BOCmInvitationCodeEngine.getBeans(null, sql.toString(), paramMap, startNum, endNum, false);
	}
	
	public long getInvitationCodeValuesCountByConditions(IBOCmInvitationCodeValue condition)throws Exception{
		StringBuffer sql = new StringBuffer(" 1 = 1 ");
		Map<String,Object> paramMap = new HashMap<String,Object>();

		// 主键
		if ( condition.getInvitationCodeId()>0 ){
			sql.append(" AND ").append(IBOCmInvitationCodeValue.S_InvitationCodeId).append(" =:").append(IBOCmInvitationCodeValue.S_InvitationCodeId);
			paramMap.put(IBOCmInvitationCodeValue.S_InvitationCodeId, condition.getInvitationCodeId());
		}
		// 邀请码
		if ( StringUtils.isNotBlank(condition.getInvitationCode()) ){
			sql.append(" AND ").append(IBOCmInvitationCodeValue.S_InvitationCode).append(" =:").append(IBOCmInvitationCodeValue.S_InvitationCode);
			paramMap.put(IBOCmInvitationCodeValue.S_InvitationCode, condition.getInvitationCode());
		}
		// 邀请码的管理状态
		if ( StringUtils.isNotBlank(condition.getManageStatus()) ){
			sql.append(" AND ").append(IBOCmInvitationCodeValue.S_ManageStatus).append(" =:").append(IBOCmInvitationCodeValue.S_ManageStatus);
			paramMap.put(IBOCmInvitationCodeValue.S_ManageStatus, condition.getManageStatus());
		}
		// 记录的状态 U/E
		if ( StringUtils.isNotBlank(condition.getState()) ){
			sql.append(" AND ").append(IBOCmInvitationCodeValue.S_State).append(" =:").append(IBOCmInvitationCodeValue.S_State);
			paramMap.put(IBOCmInvitationCodeValue.S_State, condition.getState());
		}
		return BOCmInvitationCodeEngine.getBeansCount(sql.toString(), paramMap);
	}
}
