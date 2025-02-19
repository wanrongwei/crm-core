package com.asiainfo.crm.cm.custgroup.service.impl;

import com.ai.common.util.ExceptionUtil;
import com.ai.omframe.instance.ivalues.IInsUserValue;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.custgroup.bo.BOCmInvitationInfoBean;
import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmCustomerGroupValue;
import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmGroupMemberInfoValue;
import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmInvitationInfoValue;
import com.asiainfo.crm.cm.custgroup.service.interfaces.ICustGroupCheckSV;
import com.asiainfo.crm.cm.custgroup.utils.CmGroupConstants;
import com.asiainfo.crm.cm.custgroup.utils.InnerServiceFactory;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.constant.RBossConst;

/**
 * 客户群管理各类校验汇总
 */
public class CustGroupCheckSVImpl implements ICustGroupCheckSV {
	/**
	 * 检查客户是否具备建群/入群基本资格
	 * 	1、是B2C客户
	 * 	2、非Terminate状态
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	public void checkCustomerJoinGroupEligable(long custId) throws Exception {
		ICustomerValue customer = InnerServiceFactory.getCustomerSV().getCustomerById(custId);
		
		if ( customer.getCustType()!=CmConstants.CustomerType.INDIVIDUAL ){
			//The customer [{0}] is a not individual customer.
			ExceptionUtil.throwBusinessException("CMS8900001",custId+""); 
		}
		if ( customer.getCustStatus()==CmConstants.CustomerStatus.INDIV_TERMINATED /*|| customer.getCustStatus()==CmConstants.CustomerStatus.INDIV_POTENTIAL*/ ){
			//The customer [{0}] is terminate.
			ExceptionUtil.throwBusinessException("CMS8900002",custId+"");
		}
	}
	
	/**
	 * 一个客户不能在多个客户群
	 * 检查客户是否是其他客户群群主/群成员
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	public void checkCustomerAlreadyInGroup(long custId) throws Exception {
		IBOCmGroupMemberInfoValue[] groupMembers =  InnerServiceFactory.getCustGroupMemberSV().queryCmGroupMemberInfoByCondition(custId, -1, -1, CmGroupConstants.MemberStatus.Valid, -1, -1);
		if ( groupMembers!=null && groupMembers.length>0 ){
			//The customer [{0}] have already in other customer group.
			ExceptionUtil.throwBusinessException("CMS8900003",custId+"");
		}
	}
	
	/**
	 * 检查客户是否是群主
	 * @param custId
	 * @param groupId
	 * @throws Exception
	 */
	public void groupOwnerCheck(long custId, long groupId)throws Exception{
		IBOCmCustomerGroupValue[] custGroupArr = InnerServiceFactory.getCustGroupSV().queryCmCustomerGroupByCondition(groupId, -1, -1);
		if(custGroupArr == null || custGroupArr.length <= 0){
			//The group [{0}] have been dissolved.
			ExceptionUtil.throwBusinessException("CMS8900017", groupId+"");
		}
		IBOCmGroupMemberInfoValue[] groupOwnerArr = InnerServiceFactory.getCustGroupMemberSV().queryCmGroupMemberInfoByCondition(custId, groupId, CmGroupConstants.GroupRole.Owner, CmGroupConstants.MemberStatus.Valid, -1, -1);
		if(groupOwnerArr == null || groupOwnerArr.length <= 0){
			//The customer [{0}] is not the group [{1}] owner.
			ExceptionUtil.throwBusinessException("CMS8900004", custId+"", groupId+"");
		}
	}
	
	/**
	 * 检查客户是否是群成员
	 * @param custId
	 * @param groupId
	 * @throws Exception
	 * CMS6000001 The customer xx is not this group member.
	 */
	public void groupMemberCheck(long custId, long groupId)throws Exception{
		IBOCmGroupMemberInfoValue[] groupOwnerArr = InnerServiceFactory.getCustGroupMemberSV().queryCmGroupMemberInfoByCondition(custId, groupId, CmGroupConstants.GroupRole.Member, CmGroupConstants.MemberStatus.Valid, -1, -1);
		if(groupOwnerArr == null || groupOwnerArr.length <= 0){
			//The customer [{0}] is not the group [{1}] member.
			ExceptionUtil.throwBusinessException("CMS8900005", custId+"", groupId+"");
		}
	}
	
	/**
	 * 检查客户群是否还有普通成员，解散群时
	 * @param custId
	 * @param groupId
	 * @throws Exception
	 * CMS6000002 There are some other members in this customer group, so this customer group not allowed to dissolved.
	 */
	public void memberCheckForGroupDissolve(long groupId)throws Exception{
		IBOCmGroupMemberInfoValue[] groupOwnerArr = InnerServiceFactory.getCustGroupMemberSV().queryCmGroupMemberInfoByCondition(-1, groupId, CmGroupConstants.GroupRole.Member, CmGroupConstants.MemberStatus.Valid, -1, -1);
		if(groupOwnerArr == null || groupOwnerArr.length > 0){
			//It not allowed to dissolve group [{0}] because there are some other members.
			ExceptionUtil.throwBusinessException("CMS8900006", groupId+"");
		}
	}
	
	/**
	 * 检查号码是否符合条件：
	 * 1 Telenor的有效的主号/副号
	 * 2 Mobile号码
	 */
	public IInsUserValue checkPhoneNumber(String phoneNum) throws Exception {
		long custId = 0;
		//根据主号/副号查询有效的用户
		IInsUserValue insUser = InnerServiceFactory.getSo2CustGroupSV().getActiveUserByBillId(phoneNum);
		if(insUser == null){
			//Phone number [{0}] is not a telenor active number.
			ExceptionUtil.throwBusinessException("CMS8900007", phoneNum);
		}else{
			String state = insUser.getState();
			if(!"1".equals(state)){
				//Subscription in other state than active or suspend. 
				ExceptionUtil.throwBusinessException("CMS8900015", phoneNum);
			}
			if( insUser.getProdCatalogId()!=RBossConst.PROD_CATALOG_GSM ){
				//Phone number [{0}] is not a mobile number.
				ExceptionUtil.throwBusinessException("CMS8900008", phoneNum);
			}
		}
		return insUser;
	}

	/**
	 * 检查邀请是否为Pending状态，是否在有效期内
	 */
	public void checkInvitaion(long custId,long invitationId,String invitationCode)throws Exception{
		BOCmInvitationInfoBean value = new BOCmInvitationInfoBean();
		if(invitationId > 0){
			value.setInvitationId(invitationId);
		}else if(!"".equals(invitationCode)){
			value.setInviteMode(CmGroupConstants.invitationMode.InvitationCode);
			value.setInviteeIdentity(invitationCode);
		}else{
			//Parameter invalid.
			ExceptionUtil.throwBusinessException("CMS8900000");
		}
		value.setStatus(CmGroupConstants.invitationStatus.Pending);
		IBOCmInvitationInfoValue[] invitationArr = InnerServiceFactory.getCustGroupInvitationSV().getPendingValidInvitationByConditions(value, -1, -1);
		if (invitationArr == null || invitationArr.length <= 0){
			//This invitation have been expired or done. 邀请已失效或已被处理
			ExceptionUtil.throwBusinessException("CMS8900010");
		}else{
			IBOCmInvitationInfoValue invitation = invitationArr[0];
			if(invitation.getInviteMode() == CmGroupConstants.invitationMode.PhoneNumber && invitation.getInviteeRefId() > 0 ){//phone number邀请的方式时，这个字段存被邀请的客户，code邀请时，这个字段是接受邀请后回填
				if(custId > 0 && custId != invitation.getInviteeRefId()){//被邀请的客户与接受邀请的客户不符合
					//You can not use other customer's invitation.
					ExceptionUtil.throwBusinessException("CMS8900011");
				}
			}
		}
		
	}
	
	public void checkInvitaionByPhone(long groupId,String phoneNum)throws Exception{
		IBOCmInvitationInfoValue invitation = new BOCmInvitationInfoBean();
		invitation.setGroupId(groupId);
		invitation.setInviteMode(CmGroupConstants.invitationMode.PhoneNumber);
		invitation.setInviteeIdentity(phoneNum);
		IBOCmInvitationInfoValue[] existInvitationList = InnerServiceFactory.getCustGroupInvitationSV().getInvitationByCondition(invitation, CmGroupConstants.invitationExpireStatus.Valid, -1, -1);
		if(existInvitationList != null && existInvitationList.length > 0){
			//This phone has already been invited in this customer group.
			ExceptionUtil.throwBusinessException("CMS8900013");
		}
	}
	
	public void checkGroupInvitationNumber(long custGroupId)throws Exception{
		int remainingCount = InnerServiceFactory.getCustGroupSV().getGroupAvailableMemberCount(custGroupId);
		if ( remainingCount<=0 ){
			//You can no longer invite members because you have reached the maximum number of members in the group.
			ExceptionUtil.throwBusinessException("CMS8900012");
		}
	}
	
	public void checkCustomerAlreadyInGroup(long custId,long custGroupId) throws Exception {
		IBOCmGroupMemberInfoValue[] groupMembers =  InnerServiceFactory.getCustGroupMemberSV().queryCmGroupMemberInfoByCondition(custId, custGroupId, -1, CmGroupConstants.MemberStatus.Valid, -1, -1);
		if ( groupMembers!=null && groupMembers.length>0 ){
			//Phone number of customer already member of admin’s group.
			ExceptionUtil.throwBusinessException("CMS8900014",custId+"");
		}
	}

	public void checkHasAvailableInvitationCode() throws Exception {
		long abailableCount = InnerServiceFactory.getInvitationCodeSV().getInvitationCodeValuesCountByConditions(0, "", CmGroupConstants.invitationCodeManageStatus.INIT);
		if ( abailableCount<0 ){
			// No avalibale invitation code.
			ExceptionUtil.throwBusinessException("CMS8900016");
		}
	}
}
