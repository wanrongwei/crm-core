package com.asiainfo.crm.cm.custgroup.dao.interfaces;

import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmInvitationInfoValue;

public interface ICustGroupInvitationDAO {
	/**
	 * 根据条件查询邀请
	 * @param value
	 * @param expireStatus
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 */
	public IBOCmInvitationInfoValue[] getCmInvitationInfoByConditions(IBOCmInvitationInfoValue value, int expireStatus, int start, int end) throws Exception ;

	/**
	 * 根据条件查询邀请个数
	 * @param value
	 * @param expireStatus
	 * @return
	 * @throws Exception
	 */
	public int getCmInvitationInfoCountByConditions(IBOCmInvitationInfoValue value, int expireStatus) throws Exception ;
	
	/**
	 * 保存邀请
	 * @param value
	 * @throws Exception
	 */
	public void saveCmInvitationInfo(IBOCmInvitationInfoValue value) throws Exception;
	
	/**
	 * 保存邀请
	 * @param values
	 * @throws Exception
	 */
	public void saveBatchCmInvitationInfo(IBOCmInvitationInfoValue[] values) throws Exception ;

}
