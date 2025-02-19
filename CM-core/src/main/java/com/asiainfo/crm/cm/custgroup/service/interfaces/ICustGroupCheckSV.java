package com.asiainfo.crm.cm.custgroup.service.interfaces;

import com.ai.omframe.instance.ivalues.IInsUserValue;


public interface ICustGroupCheckSV {
	
	/**
	 * 检查客户是否满足建群业务规则
	 * 	1、是B2C客户
	 * 	2、非Terminate状态
	 * 	3、非其他客户群群主/群成员
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	public void checkCustomerJoinGroupEligable(long custId) throws Exception;
	
	/**
	 * 一个客户不能在多个客户群
	 * 检查客户是否是其他客户群群主/群成员
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	public void checkCustomerAlreadyInGroup(long custId) throws Exception;
	/**
	 * 检查客户是否是群主
	 * @param custId
	 * @param groupId
	 * @throws Exception
	 * CMS8900004 The customer [{0}] is not the group [{1}] owner.
	 */
	public void groupOwnerCheck(long custId, long groupId)throws Exception;
	
	/**
	 * 检查客户是否是群成员
	 * @param custId
	 * @param groupId
	 * @throws Exception
	 * CMS6000001 The customer xx is not this group member.
	 */
	public void groupMemberCheck(long custId, long groupId)throws Exception;
	
	/**
	 * 检查客户群是否还有普通成员，解散群时
	 * @param custId
	 * @param groupId
	 * @throws Exception
	 * CMS6000002 There are some other members in this customer group, so this customer group not allowed to dissolved.
	 */
	public void memberCheckForGroupDissolve(long groupId)throws Exception;
	
	/**
	 * 检查号码是否符合条件：
	 * 1 Telenor的有效的主号/副号
	 * 2 Mobile号码
	 * @param phoneNum
	 * @return custId
	 * @throws Exception
	 */
	public IInsUserValue checkPhoneNumber(String phoneNum) throws Exception;

	/**
	 * 检查邀请是否为Pending状态，是否在有效期内
	 * @param invitationId
	 * @param invitationCode
	 * @throws Exception
	 */
	public void checkInvitaion(long custId,long invitationId,String invitationCode)throws Exception;
	
	/**
	 * 检查该群是否已邀请这个号码，并且邀请有效
	 * @param groupId
	 * @param phoneNum
	 * @throws Exception
	 */
	public void checkInvitaionByPhone(long groupId,String phoneNum)throws Exception;

	/**
	 * 校验 群组的可邀请数量
	 * 
	 * @param custGroupId
	 * @return
	 * @throws Exception
	 */
	public void checkGroupInvitationNumber(long custGroupId)throws Exception;

	public void checkCustomerAlreadyInGroup(long custId,long custGroupId) throws Exception;
	
	public void checkHasAvailableInvitationCode()throws Exception;
}
