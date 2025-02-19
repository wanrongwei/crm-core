package com.asiainfo.crm.cm.custgroup.teaminvoke.out.service.interfaces;

import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.pce.ivalues.IOfferGroupValue;
import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmCustomerGroupValue;
import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmGroupLogValue;
import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmInvitationInfoValue;

/**
 * 提供客户群操作对外的服务
 * @author Tan Yan
 *
 */
public interface ICustGroupOutSV {
	/**
	 * 查看客户群的所有全局参数配置
	 * @return
	 * @throws Exception
	 */
	public DataContainer[] getGroupGlobalParam()throws Exception;
	
	/**
	 * 
	 * @author huanglun
	 * @date 2018年11月7日 下午4:19:48
	 * @param params
	 * srcType 必传
	 * configType
	 * configCode
	 * value1
	 * value2
	 * value3
	 * value4
	 * value5
	 * state
	 * @return
	 * @throws Exception
	 */
	public DataContainer[] getGroupGlobalParam(Map params) throws Exception;
	/**
	 * 修改客户群的全局参数配置（eg：最大成员数）
	 * @param paramCode
	 * @param paramValue
	 * @return
	 * @throws Exception
	 */
	public boolean groupGlobalParamSetting(String paramCode,String paramValue)throws Exception;
	
	/**
	 * 创建客户群(Agent信息从session中获取)
	 * @param custId
	 * @param groupName
	 * @return
	 * @throws Exception
	 */
	public IBOCmCustomerGroupValue createGroup(long custId,String groupName)throws Exception;
	
	/**
	 * 修改群名称(Agent信息从session中获取)
	 * @param custId
	 * @param groupId
	 * @param groupName
	 * @return
	 * @throws Exception
	 */
	public boolean renameGroupName(long custId,long groupId,String groupName)throws Exception;
	
	/**
	 * 解散群
	 * @param custId
	 * @param groupId
	 * @return
	 * @throws Exception
	 */
	public boolean dissolveGroup(long custId,long groupId)throws Exception;
	
	/**
	 * 转让群
	 * @param oldOwnerCustId
	 * @param groupId
	 * @param newOwnerCustId
	 * @return
	 * @throws Exception
	 */
	public boolean assignGroupOwner(long oldOwnerCustId, long groupId, long newOwnerCustId)throws Exception;
	
	/**
	 * 出群
	 * @param custId
	 * @param groupId
	 * @param quitMode
	 * @return
	 * @throws Exception
	 */
	public boolean quitGroup(long groupId, long memberCustId, long quitMode, long groupOwnerCustId)throws Exception;
	
	/**
	 * 入群
	 * @param custId
	 * @param groupId
	 * @param joinMode
	 * @return
	 * @throws Exception
	 */
	public boolean joinGroup(long custId,long groupId,long joinMode,String joinCode)throws Exception;
	
	/**
	 * 查询客户群概要信息
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	public IBOCmCustomerGroupValue getGroupBasicInfo(long custId) throws Exception;
	
	/**
	 * 查询客户群全量信息
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	public DataContainer getGroupAdvanceInfo(long custId) throws Exception;
	/**
	 * 查看群成员详情
	 * @param custId
	 * @param groupId
	 * @param groupName
	 * @return
	 * @throws Exception
	 */
	public DataContainer[] getGroupAllMembersAdvanceInfo(long groupId,long custId) throws Exception;
	
	/**
	 * 查询客户群下的邀请
	 * modify:2018.12.12 from wangkun：返回inviter的客户名字
	 * @param groupId
	 * @return
	 * @throws Exception
	 */
	public DataContainer[] getGroupInvitationList(long groupId) throws Exception;
	/**
	 * 生成邀请码邀请入群
	 * 服务流：
	 * 1、checkGroupInvitationNumber 检查群邀请数限制
	 * 2、generateInvitationCode 生成邀请码
	 * 3、saveCmInvitationInfo 创建群邀请
	 * 4、RecordGroupLog 记录群日志
	 */
	public IBOCmInvitationInfoValue inviteByCode(long custId, long custGroupId) throws Exception ;

	/**
	 * 根据号码邀请入群
	 * 服务流：
	 * 1、checkGroupInvitationNumber 检查群邀请数限制
	 * 2、checkPhoneNumber 检查号码
	 * 3、CheckCustomerJoinGroupEligable 检查客户是否允许入群
	 * 4、saveCmInvitationInfo 创建群邀请
	 * 5、RecordGroupLog 记录群日志
	 */
	public Map inviteByPhone(long custId,String phoneNum, long custGroupId) throws Exception ;

	/**
	 * 输入邀请码入群
	 * 服务流：
	 * 1、checkInvitaion 根据Code来校验邀请的合法性
	 * 2、joinGroup 客户入群
	 * 3、saveCmInvitationInfo 更新邀请状态
	 * 4、RecordGroupLog 记录群日志
	 */
	public boolean acceptInvitationByCode(long custId,String invitationCode) throws Exception ;

	/**
	 * 接受邀请入群
	 * 服务流：
	 * 1、checkInvitaion 校验邀请的合法性
	 * 2、joinGroup 客户入群
	 * 3、saveCmInvitationInfo 更新邀请状态
	 * 4、RecordGroupLog 记录群日志
	 */
	public boolean acceptInvitationByPhone(long custId,long invitationId) throws Exception ;

	/**
	 * 成员拒绝邀请
	 * 服务流：
	 * 1、checkInvitaion 校验邀请的合法性
	 * 2、saveCmInvitationInfo 更新邀请状态
	 * 3、RecordGroupLog 记录群日志
	 */
	public boolean refuseInvitation(long custId,long invitationId) throws Exception ;

	/**
	 * 群主撤销邀请
	 * 服务流：
	 * 1、groupOwnerCheck 检查是否是群主
	 * 2、saveCmInvitationInfo 更新邀请状态
	 * 3、RecordGroupLog 记录群日志
	 */
	public boolean withdrawInvitation(long custId,long invitationId) throws Exception ;

	/**
	 * 查询当前客户 接收到的群邀请
	 * modify:2018.12.12 from wangkun：返回inviter的客户名字
	 */
	public DataContainer[] getGroupInvitations(long custId) throws Exception ;

	/**
	 * 收到邀请的通知/ 成员接受邀请入群时，其他群成员收到的入群通知
	 * inviteeRefId 被邀请的客户
	 * inviter 发起邀请者
	 * offerGroupId offer群ID
	 * orignalDiscount 原来的优惠百分比
	 * newDiscount 新的优惠百分比
	 * 对于被邀请的客户（即接受邀请的客户）得到的提示是：
	 * [inviter] 邀请你加入他的家庭群，你的[offerGroupId]的优惠折扣将由[orignalDiscount]变为[newDiscount]
	 * 当新成员接受邀请入群后，对于群下其他成员/群主得到的提示是：
	 * [inviteeRefId] 已同意加入你们的家庭群，你的[offerGroupId]的优惠折扣已由[orignalDiscount]变为[newDiscount]
	 */
	public DataContainer[] getInvitationNotice(long custId, long invitationId) throws Exception ;

	/**
	 * 查询客户下所有offerGroup的订购数(按客户群统计)
	 * 一次客户下可以有多个offerGroup
	 * 这个客户群下的offerGroup可能有M个，本客户相关的offerGroup可能有N个，N<=M，本接口返回N个offerGroup的群维度的订购数信息
	 * @param custId
	 * @param custGroupType (CR85 传 CmGroupConstants.GroupType.B2C)
	 * @param offerGroupType (CR85 传 CmGroupConstants.OfferGroupType.CUST_FMC)
	 * @return DataContainer[] key：OfferGroupId,ValidAmount
	 * @throws Exception
	 */
	public DataContainer[] getAllOfferGroupValidAmountByCustGroupLevel(long custId,long custGroupType, String offerGroupType) throws Exception;
	
	/**
	 * 查询客户下所有offerGroup的订购数(按单个客户统计)
	 * 一次客户下可以有多个offerGroup
	 * 这个客户群下的offerGroup可能有M个，本客户相关的offerGroup可能有N个，N<=M，本接口返回N个offerGroup的群维度的订购数信息
	 * @param custId
	 * @param custGroupType (CR85 传 CmGroupConstants.GroupType.B2C)
	 * @param offerGroupType (CR85 传 CmGroupConstants.OfferGroupType.CUST_FMC)
	 * @return DataContainer[] key：OfferGroupId,ValidAmount
	 * @throws Exception
	 */
	public DataContainer[] getAllOfferGroupValidAmountBySingleCustLevel(long custId,long custGroupType, String offerGroupType) throws Exception;
	
	/**
	 * 查询客户指定offerGroup下的订购数(按客户群统计)
	 * @param custId
	 * @param custGroupType (CR85 传 CmGroupConstants.GroupType.B2C)
	 * @param offerGroupType (CR85 传 CmGroupConstants.OfferGroupType.CUST_FMC)
	 * @param offerGroupId
	 * @return
	 * @throws Exception
	 */
	public int getSpecifiedOfferGroupValidAmountByCustGroupLevel(long custId,long custGroupType, String offerGroupType,String offerGroupId) throws Exception;
	
	/**
	 * 查询客户指定offerGroup下的订购数(按单个客户统计)
	 * @param custId
	 * @param custGroupType (CR85 传 CmGroupConstants.GroupType.B2C)
	 * @param offerGroupType (CR85 传 CmGroupConstants.OfferGroupType.CUST_FMC)
	 * @param offerGroupId
	 * @return
	 * @throws Exception
	 */
	public int getSpecifiedOfferGroupValidAmountBySingleCustLevel(long custId,long custGroupType, String offerGroupType,String offerGroupId) throws Exception;
	
	/**
	 * 群组成员销户
	 * 1.群成员销户的群处理  <br/>
	 *   查客户所在群信息 <br/>
	 *	    Owner <br/>
	 * 		      还有群成员    转让群 (给 入群时间最早的) <br/>
	 * 		       没有群成员    解散群    撤销群邀请  <br/>
	 * 	 	Member <br/>
	 * 		       出群 <br/>
	 * 2.群成员销户的邀请处理<br/>
	 * 	  撤销邀请<br/>
	 * @param custId  群成员 客户id
	 * @throws Exception
	 */
	public void groupMemberTerminate(long custId)throws Exception;
	
	
	/**
	 * 处理CR85 pushc事件的发送
	 * @param pushcType 枚举值为CmGroupConstants.pushcType
	 * @param receiverType 接收人类型枚举值为CmGroupConstants.receiver
	 * @param custId 接收通知的客户,邀请号码时可不传
	 * @param userId 邀请号码时才传
	 * @param billId 邀请号码时才传
	 * @param entityId 传custOrderId/custGroupId
	 * @param extMap 传事件参数
	 * @return
	 */
	public String handleFMCGroupPushc(String pushcType,String receiverType,long custId, long userId, String billId, long entityId,Map<String,Object> extMap);
	
	/**
	 * 判断两个客户是否在同一个客户群组
	 * @param custIdA
	 * @param custIdB
	 * @return
	 * @throws Exception
	 */
	public boolean isSameCustGroup(long custIdA,long custIdB)throws Exception;
	
	/**
	 * 
	 * @author huanglun
	 * @date 2018年11月2日 下午5:30:31
	 * @param params --参数如下
	 * @param customerGroupId 必填;群id
	 * @param logCreator 必填;客户id
	 * @param logType 非必填默认为0;日志类型：0=查询所有,1=客户群操作,2=邀请类,3=定单类操作,4=系统自动事件,5=其它;
	 * @param logEventType 非必填;日志事件类型:party.`cm_general_config`
	 * @param sortType 非必填默认为-1;排序类型:-1=不排序,0=升序,1=降序
	 * @param startDate 必填;开始时间2018-10-10 00:00:00
	 * @param endDate 必填;结束时间2018-10-10 23:59:59
	 * @param startNum 非必填默认为0
	 * @param endNum 非必填默认为100
	 * @return
	 * @throws Exception
	 */
	public IBOCmGroupLogValue[] getCustGroupLog(Map params) throws Exception;

	/**
	 * 根据invitation code查询invitation的接口
	 * （2018.11.09 wangkun email申请）
	 * modify:2018.12.12 from wangkun：返回inviter的客户名字
	 * @param invitationCode
	 * @return
	 * @throws Exception
	 */
	public DataContainer queryInvitationByCode(String invitationCode) throws Exception;
	
	/**
	 * 校验号码
	 * （2018.12.18 叶茂 确认）
	 * @param phoneNum
	 * @throws Exception
	 * CMS8900007 Phone number [{0}] is not a telenor active number.(在数据库找不到用户)
	 * CMS8900015 Subscription in other state than active or suspend. 
	 * CMS8900008 Phone number [{0}] is not a mobile number.(!OFFER_PLAN_GSM)
	 * CMS8900001 The customer [{0}] is a not individual customer.
	 * CMS8900002 The customer [{0}] is terminate/prospect.
	 */
	public boolean validatePhoneNumber(String phoneNum)throws Exception;

	/**
	 * 校验号码
	 * （2018.10.30 叶茂 email）
	 * @param custId
	 * @param phoneNum
	 * @param custGroupId
	 * @throws Exception
	 * CMS8900004 The customer [{0}] is not the group [{1}] owner.
	 * CMS8900012 You can no longer invite members because you have reached the maximum number of members in the group.
	 * CMS8900013 This phone has already been invited in this customer group.
	 * CMS8900007 Phone number [{0}] is not a telenor active number.(在数据库找不到用户)
	 * CMS8900015 Subscription in other state than active or suspend. 
	 * CMS8900008 Phone number [{0}] is not a mobile number.(!OFFER_PLAN_GSM)
	 * CMS8900014 Phone number of customer already member of admin’s group.
	 * CMS8900001 The customer [{0}] is a not individual customer.
	 * CMS8900002 The customer [{0}] is terminate/prospect.
	 */
	public boolean validatePhoneNumber(long custId, String phoneNum, long custGroupId)throws Exception;
	
	/**
	 * 更新邀请的阅读状态
	 * （2018.10.18 叶茂 email）
	 * @param invitationId
	 * @param isSeen （0 unSeen 1 Seen）
	 * @return
	 * @throws Exception
	 */
	public boolean updateInvitationIsSeenStatus(long invitationId,String isSeen) throws Exception;
	
	/**
	 * 获取offer group信息（from wangkun 2018.11.26 email）
	 * @param offerGroupId
	 * @param offerGroupType
	 * @return
	 * @throws Exception
	 */
	public IOfferGroupValue getOfferGroupByIdAndType(String offerGroupId, String offerGroupType)throws Exception;
}
