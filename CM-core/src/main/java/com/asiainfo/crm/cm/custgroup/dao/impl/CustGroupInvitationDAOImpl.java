package com.asiainfo.crm.cm.custgroup.dao.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.ai.omframe.util.SoDBUtils;
import com.asiainfo.crm.cm.custgroup.bo.BOCmInvitationInfoBean;
import com.asiainfo.crm.cm.custgroup.bo.BOCmInvitationInfoEngine;
import com.asiainfo.crm.cm.custgroup.dao.interfaces.ICustGroupInvitationDAO;
import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmInvitationInfoValue;
import com.asiainfo.crm.cm.custgroup.utils.CmGroupConstants;

public class CustGroupInvitationDAOImpl implements ICustGroupInvitationDAO {

	public IBOCmInvitationInfoValue[] getCmInvitationInfoByConditions(IBOCmInvitationInfoValue value, int expireStatus, int start, int end) throws Exception {
		StringBuffer conditions = new StringBuffer(" 1 = 1 ");
		Map<String,Object> paramMap = new HashMap<String,Object>();
		if ( value.getInvitationId()>0 ){
			conditions.append(" AND ").append(IBOCmInvitationInfoValue.S_InvitationId).append(" =:").append(IBOCmInvitationInfoValue.S_InvitationId);
			paramMap.put(IBOCmInvitationInfoValue.S_InvitationId, value.getInvitationId());
		}
		if ( value.getGroupId()>0 ){
			conditions.append(" AND ").append(IBOCmInvitationInfoValue.S_GroupId).append(" =:").append(IBOCmInvitationInfoValue.S_GroupId);
			paramMap.put(IBOCmInvitationInfoValue.S_GroupId, value.getGroupId());
		}
		if ( value.getInviter()>0 ){
			conditions.append(" AND ").append(IBOCmInvitationInfoValue.S_Inviter).append(" =:").append(IBOCmInvitationInfoValue.S_Inviter);
			paramMap.put(IBOCmInvitationInfoValue.S_Inviter, value.getInviter());
		}
		if ( value.getInviteMode()>0 ){
			conditions.append(" AND ").append(IBOCmInvitationInfoValue.S_InviteMode).append(" =:").append(IBOCmInvitationInfoValue.S_InviteMode);
			paramMap.put(IBOCmInvitationInfoValue.S_InviteMode, value.getInviteMode());
		}
		if ( StringUtils.isNotBlank(value.getInviteeIdentity()) ){
			conditions.append(" AND ").append(IBOCmInvitationInfoValue.S_InviteeIdentity).append(" =:").append(IBOCmInvitationInfoValue.S_InviteeIdentity);
			paramMap.put(IBOCmInvitationInfoValue.S_InviteeIdentity, value.getInviteeIdentity());
		}
		if ( value.getStatus()>0 ){
			conditions.append(" AND ").append(IBOCmInvitationInfoValue.S_Status).append(" =:").append(IBOCmInvitationInfoValue.S_Status);
			paramMap.put(IBOCmInvitationInfoValue.S_Status, value.getStatus());
		}
		if ( value.getInviteeRefId()>0 ){
			conditions.append(" AND ").append(IBOCmInvitationInfoValue.S_InviteeRefId).append(" =:").append(IBOCmInvitationInfoValue.S_InviteeRefId);
			paramMap.put(IBOCmInvitationInfoValue.S_InviteeRefId, value.getInviteeRefId());
		}
		// 失效时间
		if ( expireStatus == CmGroupConstants.invitationExpireStatus.Valid ){
			// 未失效的
			conditions.append(" AND ").append(IBOCmInvitationInfoValue.S_ExpireDate).append(" > ").append(SoDBUtils.getSqlSysDateStr());
		}else if ( expireStatus == CmGroupConstants.invitationExpireStatus.Invalid ){
			// 已失效的
			conditions.append(" AND ").append(IBOCmInvitationInfoValue.S_ExpireDate).append(" < ").append(SoDBUtils.getSqlSysDateStr());
		}
		
		return BOCmInvitationInfoEngine.getBeans(null, conditions.toString(), paramMap, start, end, false);
	}

	public int getCmInvitationInfoCountByConditions(IBOCmInvitationInfoValue value, int expireStatus) throws Exception {
		StringBuffer conditions = new StringBuffer(" 1 = 1 ");
		Map<String,Object> paramMap = new HashMap<String,Object>();
		if ( value.getInvitationId()>0 ){
			conditions.append(" AND ").append(IBOCmInvitationInfoValue.S_InvitationId).append(" =:").append(IBOCmInvitationInfoValue.S_InvitationId);
			paramMap.put(IBOCmInvitationInfoValue.S_InvitationId, value.getInvitationId());
		}
		if ( value.getGroupId()>0 ){
			conditions.append(" AND ").append(IBOCmInvitationInfoValue.S_GroupId).append(" =:").append(IBOCmInvitationInfoValue.S_GroupId);
			paramMap.put(IBOCmInvitationInfoValue.S_GroupId, value.getGroupId());
		}
		if ( value.getInviter()>0 ){
			conditions.append(" AND ").append(IBOCmInvitationInfoValue.S_Inviter).append(" =:").append(IBOCmInvitationInfoValue.S_Inviter);
			paramMap.put(IBOCmInvitationInfoValue.S_Inviter, value.getInviter());
		}
		if ( value.getInviteMode()>0 ){
			conditions.append(" AND ").append(IBOCmInvitationInfoValue.S_InviteMode).append(" =:").append(IBOCmInvitationInfoValue.S_InviteMode);
			paramMap.put(IBOCmInvitationInfoValue.S_InviteMode, value.getInviteMode());
		}
		if ( StringUtils.isNotBlank(value.getInviteeIdentity()) ){
			conditions.append(" AND ").append(IBOCmInvitationInfoValue.S_InviteeIdentity).append(" =:").append(IBOCmInvitationInfoValue.S_InviteeIdentity);
			paramMap.put(IBOCmInvitationInfoValue.S_InviteeIdentity, value.getInviteeIdentity());
		}
		if ( value.getStatus()>0 ){
			conditions.append(" AND ").append(IBOCmInvitationInfoValue.S_Status).append(" =:").append(IBOCmInvitationInfoValue.S_Status);
			paramMap.put(IBOCmInvitationInfoValue.S_Status, value.getStatus());
		}
		if ( value.getInviteeRefId()>0 ){
			conditions.append(" AND ").append(IBOCmInvitationInfoValue.S_InviteeRefId).append(" =:").append(IBOCmInvitationInfoValue.S_InviteeRefId);
			paramMap.put(IBOCmInvitationInfoValue.S_InviteeRefId, value.getInviteeRefId());
		}
		// 失效时间
		if ( expireStatus == CmGroupConstants.invitationExpireStatus.Valid ){
			// 未失效的
			conditions.append(" AND ").append(IBOCmInvitationInfoValue.S_ExpireDate).append(" > ").append(SoDBUtils.getSqlSysDateStr());
		}else if ( expireStatus == CmGroupConstants.invitationExpireStatus.Invalid ){
			// 已失效的
			conditions.append(" AND ").append(IBOCmInvitationInfoValue.S_ExpireDate).append(" < ").append(SoDBUtils.getSqlSysDateStr());
		}
		return BOCmInvitationInfoEngine.getBeansCount(conditions.toString(), paramMap);
	}
	
	public void saveCmInvitationInfo(IBOCmInvitationInfoValue value) throws Exception {
		if(value == null)
			return;
		if(value.isNew() || value.getInvitationId()==0l){
			if(value.getInvitationId() <= 0){
				value.setStsToNew();
				value.setInvitationId(BOCmInvitationInfoEngine.getNewId().longValue());
			}
				
		}
		BOCmInvitationInfoEngine.save(value);
	}

	public void saveBatchCmInvitationInfo(IBOCmInvitationInfoValue[] values) throws Exception {
		if(values == null)
			return;
		for (IBOCmInvitationInfoValue value:values){
			if(value.isNew() || value.getInvitationId()==0l){
				if(value.getInvitationId() <= 0){
					value.setStsToNew();
					value.setInvitationId(BOCmInvitationInfoEngine.getNewId().longValue());
				}
			}
		}
		BOCmInvitationInfoEngine.saveBatch(values);
	}

}
