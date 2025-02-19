package com.asiainfo.crm.cm.custgroup.dao.impl;

import java.util.HashMap;

import com.asiainfo.crm.cm.custgroup.bo.BOCmGroupMemberInfoEngine;
import com.asiainfo.crm.cm.custgroup.dao.interfaces.ICustGroupMemberDAO;
import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmGroupMemberInfoValue;
import com.asiainfo.crm.cm.custgroup.utils.CmGroupConstants;


public class CustGroupMemberDAOImpl implements ICustGroupMemberDAO{

	public void saveCmGroupMemberInfoValue(IBOCmGroupMemberInfoValue value)throws Exception {
		if(value == null)
			return;
		if(value.isNew() || value.getMemberId()==0l){
			if(value.getMemberId() <= 0){
				value.setStsToNew();
				value.setMemberId(BOCmGroupMemberInfoEngine.getNewId().longValue());
			}
				
		}
		BOCmGroupMemberInfoEngine.save(value);
	}
	
	public void saveBatchCmGroupMemberInfoValue(IBOCmGroupMemberInfoValue[] values)throws Exception {
		if(values == null || values.length<=0)
			return;
		for (IBOCmGroupMemberInfoValue value:values){
			if(value.isNew() || value.getMemberId()==0l){
				if(value.getMemberId() <= 0){
					value.setStsToNew();
					value.setMemberId(BOCmGroupMemberInfoEngine.getNewId().longValue());
				}
				
			}
		}
		BOCmGroupMemberInfoEngine.saveBatch(values);
	}

	public IBOCmGroupMemberInfoValue[] queryCmGroupMemberInfoByCondition(long memberRefId, long groupId, long groupRole, int memberStatus, int start, int end) throws Exception {
		StringBuilder condition = new StringBuilder(" 1 = 1 ");
		HashMap paraMap = new HashMap();
		if(memberRefId > 0){
			condition.append(" AND ").append(IBOCmGroupMemberInfoValue.S_MemberRefId).append(" = :").append(IBOCmGroupMemberInfoValue.S_MemberRefId);
			paraMap.put(IBOCmGroupMemberInfoValue.S_MemberRefId, memberRefId);
		}
		if(groupId > 0){
			condition.append(" AND ").append(IBOCmGroupMemberInfoValue.S_GroupId).append(" = :").append(IBOCmGroupMemberInfoValue.S_GroupId);
			paraMap.put(IBOCmGroupMemberInfoValue.S_GroupId, groupId); 
		}
		
		if(groupRole > 0){
			condition.append(" AND ").append(IBOCmGroupMemberInfoValue.S_GroupRole).append(" = :").append(IBOCmGroupMemberInfoValue.S_GroupRole);
			paraMap.put(IBOCmGroupMemberInfoValue.S_GroupRole, groupRole); 
		}
		if (memberStatus > -1){
			condition.append(" AND ").append(IBOCmGroupMemberInfoValue.S_MemberStatus).append(" = :").append(IBOCmGroupMemberInfoValue.S_MemberStatus);
			paraMap.put(IBOCmGroupMemberInfoValue.S_MemberStatus, memberStatus); 
		}
		
		return BOCmGroupMemberInfoEngine.getBeans(null, condition.toString(), paraMap, start, end, false);
	}

	public int queryCmGroupMemberInfoCountByCondition(long memberRefId, long groupId, long groupRole, int memberStatus) throws Exception {
		StringBuilder condition = new StringBuilder(" 1 = 1 ");
		HashMap paraMap = new HashMap();
		
		if(memberRefId > 0){
			condition.append(" AND ").append(IBOCmGroupMemberInfoValue.S_MemberRefId).append(" = :").append(IBOCmGroupMemberInfoValue.S_MemberRefId);
			paraMap.put(IBOCmGroupMemberInfoValue.S_MemberRefId, memberRefId);
		}
		if(groupId > 0){
			condition.append(" AND ").append(IBOCmGroupMemberInfoValue.S_GroupId).append(" = :").append(IBOCmGroupMemberInfoValue.S_GroupId);
			paraMap.put(IBOCmGroupMemberInfoValue.S_GroupId, groupId); 
		}
		
		if(groupRole > 0){
			condition.append(" AND ").append(IBOCmGroupMemberInfoValue.S_GroupRole).append(" = :").append(IBOCmGroupMemberInfoValue.S_GroupRole);
			paraMap.put(IBOCmGroupMemberInfoValue.S_GroupRole, groupRole); 
		}
		if (memberStatus > -1){
			condition.append(" AND ").append(IBOCmGroupMemberInfoValue.S_MemberStatus).append(" = :").append(IBOCmGroupMemberInfoValue.S_MemberStatus);
			paraMap.put(IBOCmGroupMemberInfoValue.S_MemberStatus, memberStatus); 
		}
		
		return BOCmGroupMemberInfoEngine.getBeansCount(condition.toString(), paraMap);
	}

}
