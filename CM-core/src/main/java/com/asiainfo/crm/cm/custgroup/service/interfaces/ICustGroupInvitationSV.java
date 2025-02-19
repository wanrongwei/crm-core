package com.asiainfo.crm.cm.custgroup.service.interfaces;

import com.asiainfo.crm.cm.custgroup.bo.BOCmInvitationInfoBean;
import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmInvitationInfoValue;


/**
 * 邀请码的 行为库
 *
 */
public interface ICustGroupInvitationSV {

	/**
	 * 生成邀请码
	 * @return
	 * @throws Exception
	 */
	public String generateInvitationCode() throws Exception ;

	/**
	 * 根据邀请ID获取邀请
	 * @param invitationId
	 * @return
	 * @throws Exception
	 */
	public IBOCmInvitationInfoValue getInvitationById(long invitationId) throws Exception;
	/**
	 * 根据条件获取 Pending 的有效的邀请
	 * @param value
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 */
	public IBOCmInvitationInfoValue[] getPendingValidInvitationByConditions(IBOCmInvitationInfoValue value,int start,int end) throws Exception;

	/**
	 * 根据条件获取 Pending 的有效的邀请数
	 * @param value
	 * @return
	 * @throws Exception
	 */
	public int getPendingValidInvitationCount(IBOCmInvitationInfoValue value) throws Exception ;
	
	/**
	 * 根据条件查询 邀请
	 * @param value
	 * @param invitationExpireStatus
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 */
	public IBOCmInvitationInfoValue[] getInvitationByCondition(IBOCmInvitationInfoValue value, int expireStatus,int start,int end) throws Exception;
	
	/**
	 * 根据条件获取 邀请
	 * @param groupId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 */
	public IBOCmInvitationInfoValue[] getInvitationByGroupId(long groupId,int start,int end) throws Exception;

	/**
	 * 新增/修改邀请
	 * @param value
	 * @return
	 * @throws Exception
	 */
	public IBOCmInvitationInfoValue saveCmInvitationInfo(IBOCmInvitationInfoValue value)throws Exception;
	
	/**
	 * 新增/修改邀请
	 * @param values
	 * @return
	 * @throws Exception
	 */
	public IBOCmInvitationInfoValue[] saveBatchCmInvitationInfo(IBOCmInvitationInfoValue[] values)throws Exception;
	
}
