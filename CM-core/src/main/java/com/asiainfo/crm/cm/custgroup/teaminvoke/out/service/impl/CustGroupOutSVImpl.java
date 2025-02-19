package com.asiainfo.crm.cm.custgroup.teaminvoke.out.service.impl;

import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.codehaus.jackson.map.ObjectMapper;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.CenterUtil;
import com.ai.omframe.instance.ivalues.IInsCmRelValue;
import com.ai.omframe.instance.ivalues.IInsUserValue;
import com.ai.omframe.order.valuebean.OrderConst;
import com.ai.pce.ivalues.IOfferGroupValue;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmTimeUtil;
import com.asiainfo.crm.cm.custgroup.bo.BOCmCustomerGroupBean;
import com.asiainfo.crm.cm.custgroup.bo.BOCmGroupMemberInfoBean;
import com.asiainfo.crm.cm.custgroup.bo.BOCmInvitationInfoBean;
import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmCustomerGroupValue;
import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmGeneralConfigValue;
import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmGroupLogValue;
import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmGroupMemberInfoValue;
import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmInvitationInfoValue;
import com.asiainfo.crm.cm.custgroup.service.interfaces.ICustGroupLogSV;
import com.asiainfo.crm.cm.custgroup.teaminvoke.out.service.interfaces.ICustGroupOutSV;
import com.asiainfo.crm.cm.custgroup.utils.CmFmcCustGroupUtils;
import com.asiainfo.crm.cm.custgroup.utils.CmGroupConstants;
import com.asiainfo.crm.cm.custgroup.utils.InnerServiceFactory;
import com.asiainfo.crm.cm.custgroup.utils.PushCEventThreadUtils;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.pushc.bean.CustomerGroup;
import com.asiainfo.crm.cm.pushc.service.interfaces.ICustomerGroupPushcSV;
import com.asiainfo.crm.cm.pushc.utils.PushcSwitchUtil;
import com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.inter.exe.webservice.client.cmp.CheckMarketingPermissionUsingRequest;
import com.asiainfo.crm.inter.exe.webservice.client.cmp.CheckMarketingPermissionUsingRequestBody;
import com.asiainfo.crm.inter.exe.webservice.client.cmp.CheckMarketingPermissionUsingResponse;
import com.asiainfo.crm.inter.exe.webservice.client.cmp.CmpServiceFactory;
import com.asiainfo.crm.inter.exe.webservice.client.cmp.Ids;
import com.asiainfo.crm.inter.exe.webservice.client.cmp.Resultinfo;
import com.asiainfo.crm.constant.RBossConst;
import com.asiainfo.crm.so.instance.rboss.service.interfaces.IInsCmRelSV;
import com.asiainfo.crm.so.order.rboss.ivalues.IBOOrdCustValidAmountValue;
import com.asiainfo.crm.so.order.rboss.service.interfaces.IRecordLogSV;
import com.asiainfo.push.inter.client.PushClient;
import com.asiainfo.push.inter.service.ivalues.Event;
import com.asiainfo.push.inter.service.ivalues.PushInterConstants;
import com.asiainfo.push.inter.service.ivalues.Receiver;
import com.asiainfo.push.inter.service.ivalues.StructParamEvent;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


public class CustGroupOutSVImpl implements ICustGroupOutSV {
	private final static SimpleDateFormat TIME_SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	/**
	 * 查询客户群全局参数
	 */
	public DataContainer[] getGroupGlobalParam() throws Exception {
		IBOCmGeneralConfigValue[] groupGlobalParams = InnerServiceFactory.getCmGeneralConfigSV()
				.getGeneralConfigs(CmGroupConstants.srcType.groupParam, CmGroupConstants.srcType.groupParam, null, CmGroupConstants.configStatus.effective);
		if(groupGlobalParams != null && groupGlobalParams.length > 0){
			DataContainer[] groupGlobalParamArr = new DataContainer[groupGlobalParams.length];
			for(int i = 0 ; i <  groupGlobalParams.length ; i++){
				DataContainer data = new DataContainer();
				data.copy(groupGlobalParams[i]);
				groupGlobalParamArr[i] = data;
			}
			return groupGlobalParamArr;
		}else{
			return null;
		}	
	}
	
	public DataContainer[] getGroupGlobalParam(Map params) throws Exception {
		IBOCmGeneralConfigValue[] groupGlobalParams = InnerServiceFactory.getCmGeneralConfigSV().getGeneralConfigs(params);
		if(groupGlobalParams != null && groupGlobalParams.length > 0){
			DataContainer[] groupGlobalParamArr = new DataContainer[groupGlobalParams.length];
			for(int i = 0 ; i <  groupGlobalParams.length ; i++){
				DataContainer data = new DataContainer();
				data.copy(groupGlobalParams[i]);
				groupGlobalParamArr[i] = data;
			}
			return groupGlobalParamArr;
		}else{
			return null;
		}	
	}

	/**
	 * 修改客户群全局参数
	 */
	public boolean groupGlobalParamSetting(String paramCode, String paramValue)
			throws Exception {
		IBOCmGeneralConfigValue[] groupGlobalParams = InnerServiceFactory.getCmGeneralConfigSV()
				.getGeneralConfigs(CmGroupConstants.srcType.groupParam, CmGroupConstants.srcType.groupParam, paramCode, CmGroupConstants.configStatus.effective);
		if(groupGlobalParams != null && groupGlobalParams.length > 0){
			IBOCmGeneralConfigValue value = groupGlobalParams[0];
			value.setValue1(paramValue);
			InnerServiceFactory.getCmGeneralConfigSV().saveCmGeneralConfigValue(value);
			return true;
		}else{
			return false;
		}
	}

	/**
	 * 创建客户群
	 * 服务流：
	 * 1、CheckCustomerJoinGroupEligable 检查客户是否允许创群
	 * 2、CreateCustomerGroup 新增客户群
	 * 3、CreateGroupMember 新增客户群成员
	 * 4、RecordGroupLog 记录群日志
	 */
	public IBOCmCustomerGroupValue createGroup(long custId, String groupName) throws Exception {
		
		//CheckCustomerJoinGroupEligable检查客户是具备创群基本资格
		InnerServiceFactory.getCustGroupCheckSV().checkCustomerJoinGroupEligable(custId);
		
		//checkCustomerAlreadyInGroup检查客户是否允许创群
		InnerServiceFactory.getCustGroupCheckSV().checkCustomerAlreadyInGroup(custId);
		
		// 没有指定 groupName时  设置默认值  Customer Name + ’s Group
		// 叶茂确认  没有指定 groupName 默认名称为  Family Group
		if ( StringUtils.isBlank(groupName) ){
			// ICustomerValue customer = InnerServiceFactory.getCustomerSV().getCustomerById(custId);
			// if ( customer!=null && StringUtils.isNotBlank(customer.getCustName()) ){
			//	groupName = customer.getCustName() + "'s group";
			// }
			groupName = "Family Group";
		}
		
		IBOCmCustomerGroupValue custGroup = new BOCmCustomerGroupBean();
		custGroup.setGroupName(groupName);
		custGroup.setStsToNew();
		custGroup = InnerServiceFactory.getCustGroupSV().saveCustomerGroup(custGroup);
		
		IBOCmGroupMemberInfoValue groupMember = new BOCmGroupMemberInfoBean();
		groupMember.setMemberRefId(custId);
		groupMember.setGroupId(custGroup.getGroupId());
		groupMember.setGroupRole(CmGroupConstants.GroupRole.Owner);
		groupMember.setJoinMode(CmGroupConstants.JoinMode.CreateGroup);//建群
		groupMember.setStsToNew();
		groupMember = InnerServiceFactory.getCustGroupMemberSV().saveGroupMemberInfo(groupMember);
		
		//创群日志 RecordGroupLog
		Map<String, Object> groupLogMap = new HashMap<String, Object>();
		groupLogMap.put("custGroupId", custGroup.getGroupId());
		groupLogMap.put("custId", custId);
		groupLogMap.put("logEventType", CmGroupConstants.GroupLogSrcEventType.createGroup);
		if (ServiceManager.getUser()!=null){
			groupLogMap.put("createOpId", ServiceManager.getUser().getID() );
			groupLogMap.put("createOrgId",  ServiceManager.getUser().getOrgId() );
		}
		groupLogMap.put("operatorObjectId", custGroup.getGroupId());
		groupLogMap.put("eventCreateDate", ServiceManager.getOpDateTime());
		
		groupLogMap.put(CmGroupConstants.GroupLogParam.Creator, custId);
		groupLogMap.put(CmGroupConstants.GroupLogParam.Group_Name, groupName);
		
		IBOCmGroupLogValue groupLog = InnerServiceFactory.getCustGroupLogSV().addGroupLog(groupLogMap);
		
		//AddGroupEvent
		DataContainerInterface inDataContainer = new DataContainer();
		inDataContainer.set("CUST_ID", custId);
		inDataContainer.set("CUST_TYPE", CmGroupConstants.rawEventCustType.B2C);//b2b：3  b2c:1
		inDataContainer.set("CUST_GROUP_ID", custGroup.getGroupId());
		inDataContainer.set("EVENT_TYPE", CmGroupConstants.GroupLogSrcEventType.joinTheGroup);//存  CM_GROUP_LOG表的 LOG_EVENT_TYPE
		inDataContainer.set("STATE", CmGroupConstants.rawEventState.initState);
		inDataContainer.set("LOG_ID", groupLog == null ? "-1" : groupLog.getLogId());//FMCS客户群日志：请传：日志表主键id
		inDataContainer.set("BUSINESS_ID", CmGroupConstants.RAW_EVENT_FMCS_BUSINESS_ID);//FMCS 客户群，请传：410000000001
		InnerServiceFactory.getFmcBusiSV().addRawEventForGroupLog(inDataContainer);
		
		return custGroup;
	}

	/**
	 * 修改群名称
	 * 服务流：
	 * 1、GroupOwnerCheck 检查客户是否是群主
	 * 2、UpdateCustomerGroup 修改客户群
	 * 3、RecordGroupLog 记录群日志
	 */
	public boolean renameGroupName(long custId, long groupId, String groupName)
			throws Exception {

		//GroupOwnerCheck
		InnerServiceFactory.getCustGroupCheckSV().groupOwnerCheck(custId, groupId);
		
		IBOCmCustomerGroupValue[] custGroupArr = InnerServiceFactory.getCustGroupSV().queryCmCustomerGroupByCondition(groupId, -1, -1);
		if(custGroupArr != null && custGroupArr.length == 1){
			IBOCmCustomerGroupValue custGroup = custGroupArr[0];
			custGroup.setStsToOld();
			custGroup.setGroupName(groupName);
			custGroup = InnerServiceFactory.getCustGroupSV().saveCustomerGroup(custGroup);
			
			//群 改名日志  RecordGroupLog
			Map<String, Object> groupLogMap = new HashMap<String, Object>();
			groupLogMap.put("custGroupId", groupId);
			groupLogMap.put("custId", custId);
			groupLogMap.put("logEventType", CmGroupConstants.GroupLogSrcEventType.renameGroupName);
			if (ServiceManager.getUser()!=null){
				groupLogMap.put("createOpId", ServiceManager.getUser().getID() );
				groupLogMap.put("createOrgId",  ServiceManager.getUser().getOrgId() );
			}
			groupLogMap.put("operatorObjectId", groupId);
			groupLogMap.put("eventCreateDate", ServiceManager.getOpDateTime());
			
			groupLogMap.put(CmGroupConstants.GroupLogParam.Admin, custId);
			groupLogMap.put(CmGroupConstants.GroupLogParam.Group_Name_New, groupName);
			
			InnerServiceFactory.getCustGroupLogSV().addGroupLog(groupLogMap);
			
			return true;
		}
		return false;
	}

	/**
	 * 解散客户群
	 * 服务流：
	 * 1、GroupOwnerCheck 检查客户是否是群主
	 * 2、AnyOtherMemberCheck 检查客户群下是否还有其他成员
	 * 3、UpdateCustomerGroup 修改客户群为注销/解散状态
	 * 4、UpdateGroupMember 群主成员置失效
	 * 5、UpdateInvitations 群下的邀请withdraw
	 * 6、RecordGroupLog 记录群日志
	 */
	public boolean dissolveGroup(long custId, long groupId)throws Exception {

		//GroupOwnerCheck
		InnerServiceFactory.getCustGroupCheckSV().groupOwnerCheck(custId, groupId);
		
		//AnyOtherMemberCheck
		InnerServiceFactory.getCustGroupCheckSV().memberCheckForGroupDissolve(groupId);
		
		String groupName = "";
		IBOCmCustomerGroupValue[] custGroupArr = InnerServiceFactory.getCustGroupSV().queryCmCustomerGroupByCondition(groupId, -1, -1);
		if(custGroupArr != null && custGroupArr.length > 0){
			groupName = custGroupArr[0].getGroupName();
			// 修改群组状态  存历史
			for(IBOCmCustomerGroupValue custGroup:custGroupArr){
				IBOCmCustomerGroupValue delObj = new BOCmCustomerGroupBean();
				if ( custGroup.getGroupStatus()!=CmGroupConstants.GroupStatus.Terminate ){
					custGroup.setGroupStatus(CmGroupConstants.GroupStatus.Terminate);
					custGroup.setExpireDate(CmTimeUtil.getDefaultSysDate());
					delObj.copy(custGroup);
					
					InnerServiceFactory.getCustGroupSV().saveCustomerGroup(custGroup);
				}else{
					delObj.copy(custGroup);
				}
				delObj.setStsToOld();
				delObj.delete();
				InnerServiceFactory.getCustGroupSV().saveCustomerGroup(delObj);
			}
		}
		
		IBOCmGroupMemberInfoValue[] groupMemberArr = InnerServiceFactory.getCustGroupMemberSV().queryCmGroupMemberInfoByCondition(-1, groupId, -1, -1, -1, -1);
		if(groupMemberArr != null && groupMemberArr.length > 0){
			// 修改成员状态 存历史
			for(IBOCmGroupMemberInfoValue groupMember:groupMemberArr){
				IBOCmGroupMemberInfoValue delObj = new BOCmGroupMemberInfoBean();
				if ( groupMember.getMemberStatus() == CmGroupConstants.MemberStatus.Valid ){
					groupMember.setMemberStatus(CmGroupConstants.MemberStatus.Invalid);
					groupMember.setQuitMode(CmGroupConstants.QuitMode.DissolveGroup);
					groupMember.setExpireDate(CmTimeUtil.getDefaultSysDate());
					delObj.copy(groupMember);

					InnerServiceFactory.getCustGroupMemberSV().saveGroupMemberInfo(groupMember);
				}else{
					delObj.copy(groupMember);
				}
				delObj.setStsToOld();
				delObj.delete();
				InnerServiceFactory.getCustGroupMemberSV().saveGroupMemberInfo(delObj);
			}
		}
		
		//UpdateInvitations
		IBOCmInvitationInfoValue invitation = new BOCmInvitationInfoBean();
		invitation.setGroupId(groupId);
		IBOCmInvitationInfoValue[] groupInvitationList =  InnerServiceFactory.getCustGroupInvitationSV().getInvitationByCondition(invitation, CmGroupConstants.invitationExpireStatus.All, -1, -1);
		if(groupInvitationList != null && groupInvitationList.length > 0){
			// 修改邀请状态 存历史
			for(IBOCmInvitationInfoValue groupInvitation:groupInvitationList){
				IBOCmInvitationInfoValue delObj = new BOCmInvitationInfoBean();
				if ( groupInvitation.getStatus()==CmGroupConstants.invitationStatus.Pending ){
					groupInvitation.setStatus(CmGroupConstants.invitationStatus.Recall);//withdraw
					groupInvitation.setExpireDate(CmTimeUtil.getDefaultSysDate());
					delObj.copy(groupInvitation);
					
					InnerServiceFactory.getCustGroupInvitationSV().saveCmInvitationInfo(groupInvitation);
				}else{
					delObj.copy(groupInvitation);
				}
				delObj.setStsToOld();
				delObj.delete();
				InnerServiceFactory.getCustGroupInvitationSV().saveCmInvitationInfo(delObj);
			}
		}
		
		//解散群日志  RecordGroupLog
		Map<String, Object> groupLogMap = new HashMap<String, Object>();
		groupLogMap.put("custGroupId", groupId);
		groupLogMap.put("custId", custId);
		groupLogMap.put("logEventType", CmGroupConstants.GroupLogSrcEventType.dissolveTheGroup);
		if (ServiceManager.getUser()!=null){
			groupLogMap.put("createOpId", ServiceManager.getUser().getID() );
			groupLogMap.put("createOrgId",  ServiceManager.getUser().getOrgId() );
		}
		groupLogMap.put("operatorObjectId", groupId);
		groupLogMap.put("eventCreateDate", ServiceManager.getOpDateTime());
		groupLogMap.put(CmGroupConstants.GroupLogParam.Admin, custId);
		groupLogMap.put(CmGroupConstants.GroupLogParam.Group_Name, groupName);
		IBOCmGroupLogValue groupLog = InnerServiceFactory.getCustGroupLogSV().addGroupLog(groupLogMap);
		
		//AddGroupEvent
		DataContainerInterface inDataContainer = new DataContainer();
		inDataContainer.set("CUST_ID", custId);
		inDataContainer.set("CUST_TYPE", CmGroupConstants.rawEventCustType.B2C);//b2b：3  b2c:1
		inDataContainer.set("CUST_GROUP_ID", groupId);
		inDataContainer.set("EVENT_TYPE", CmGroupConstants.GroupLogSrcEventType.quitTheGroup);//存  CM_GROUP_LOG表的 LOG_EVENT_TYPE
		inDataContainer.set("STATE", CmGroupConstants.rawEventState.initState);
		inDataContainer.set("LOG_ID", groupLog == null ? "-1" : groupLog.getLogId());//FMCS客户群日志：请传：日志表主键id
		inDataContainer.set("BUSINESS_ID", CmGroupConstants.RAW_EVENT_FMCS_BUSINESS_ID);//FMCS 客户群，请传：410000000001
		InnerServiceFactory.getFmcBusiSV().addRawEventForGroupLog(inDataContainer);
		
		return true;
	}

	/**
	 * 转让客户群
	 * 服务流：
	 * 1、GroupOwnerCheck 检查客户是否是群主
	 * 2、GroupMemberCheck 检查新群主是否是此群的成员
	 * 3、OwnerToMember  群主变成成员
	 * 4、MemberToOwner  成员变成群主
	 * 5、RecordGroupLog 记录群日志
	 */
	public boolean assignGroupOwner(long oldOwnerCustId, long groupId, long newOwnerCustId) throws Exception {

		//GroupOwnerCheck
		InnerServiceFactory.getCustGroupCheckSV().groupOwnerCheck(oldOwnerCustId, groupId);
		
		//GroupMemberCheck
		InnerServiceFactory.getCustGroupCheckSV().groupMemberCheck(newOwnerCustId, groupId);
		
		//群主 变成 普通成员
		IBOCmGroupMemberInfoValue[] oldGroupOwnerArr = InnerServiceFactory.getCustGroupMemberSV().queryCmGroupMemberInfoByCondition(oldOwnerCustId, groupId, -1, CmGroupConstants.MemberStatus.Valid, -1, -1);
		if(oldGroupOwnerArr != null && oldGroupOwnerArr.length > 0){
			for(IBOCmGroupMemberInfoValue  oldGroupOwner:oldGroupOwnerArr){
				oldGroupOwner.setStsToOld();
				oldGroupOwner.setGroupRole(CmGroupConstants.GroupRole.Member);
				oldGroupOwner = InnerServiceFactory.getCustGroupMemberSV().saveGroupMemberInfo(oldGroupOwner);
			}
		}	
		
		//普通成员变成群主
		IBOCmGroupMemberInfoValue[] newGroupOwnerArr = InnerServiceFactory.getCustGroupMemberSV().queryCmGroupMemberInfoByCondition(newOwnerCustId, groupId, -1, CmGroupConstants.MemberStatus.Valid, -1, -1);
		if(newGroupOwnerArr != null && newGroupOwnerArr.length > 0){
			for(IBOCmGroupMemberInfoValue  newGroupOwner:newGroupOwnerArr){
				newGroupOwner.setStsToOld();
				newGroupOwner.setGroupRole(CmGroupConstants.GroupRole.Owner);
				newGroupOwner = InnerServiceFactory.getCustGroupMemberSV().saveGroupMemberInfo(newGroupOwner);
			}
		}

		Timestamp eventTime = ServiceManager.getOpDateTime();
		
		//转让群日志  RecordGroupLog
		Map<String, Object> groupLogMap = new HashMap<String, Object>();
		groupLogMap.put("custGroupId", groupId);
		groupLogMap.put("custId", oldOwnerCustId);
		groupLogMap.put("logEventType", CmGroupConstants.GroupLogSrcEventType.assignNewAdmin);
		if (ServiceManager.getUser()!=null){
			groupLogMap.put("createOpId", ServiceManager.getUser().getID() );
			groupLogMap.put("createOrgId",  ServiceManager.getUser().getOrgId() );
		}
		groupLogMap.put("operatorObjectId", groupId);
		groupLogMap.put("eventCreateDate", eventTime);

		groupLogMap.put(CmGroupConstants.GroupLogParam.New_Admin, newOwnerCustId);
		groupLogMap.put(CmGroupConstants.GroupLogParam.Old_Admin, oldOwnerCustId);
		
		InnerServiceFactory.getCustGroupLogSV().addGroupLog(groupLogMap);
		
		//PUSHC
		Map<String, Object> extMap = new HashMap<String, Object>();
		extMap.put(CmGroupConstants.GroupPushcParam.Event_Time, eventTime);
		extMap.put(CmGroupConstants.GroupPushcParam.Old_Admin, oldOwnerCustId);
		extMap.put(CmGroupConstants.GroupPushcParam.New_Admin, newOwnerCustId);
		this.handleFMCGroupPushc(CmGroupConstants.GroupLogSrcEventType.assignNewAdmin, CmGroupConstants.receiver.theNewAdmin,newOwnerCustId, -1, "", groupId, extMap);
		
		return true;
	}

	/**
	 * 客户出群
	 * 服务流：
	 * 1、GroupOwnerCheck 群主校验
	 * 2、GroupMemberCheck 群成员校验（群主不能自己出群，只能解散的时候出）
	 * 1、UpdateGroupMember 成员置为失效 
	 * 2、RecordGroupLog 记录群日志
	 * 3、AddGroupEvent 增加客户群事件
	 */
	public boolean quitGroup(long groupId, long memberCustId, long quitMode, long groupOwnerCustId) throws Exception {
		if(CmGroupConstants.QuitMode.RemovedByOwner == quitMode){
			//GroupOwnerCheck
			InnerServiceFactory.getCustGroupCheckSV().groupOwnerCheck(groupOwnerCustId, groupId);
		}
		
		//GroupMemberCheck
		InnerServiceFactory.getCustGroupCheckSV().groupMemberCheck(memberCustId, groupId);
		
		Timestamp eventTime = ServiceManager.getOpDateTime();

		IBOCmGroupMemberInfoValue[] groupMemberArr = InnerServiceFactory.getCustGroupMemberSV().queryCmGroupMemberInfoByCondition(memberCustId, groupId, CmGroupConstants.GroupRole.Member, CmGroupConstants.MemberStatus.Valid, -1, -1);
		if(groupMemberArr != null && groupMemberArr.length == 1){
			// 删除对象
			IBOCmGroupMemberInfoValue delObj = new BOCmGroupMemberInfoBean();

			// 更新完状态
			IBOCmGroupMemberInfoValue groupMember = groupMemberArr[0];
			groupMember.setStsToOld();
			groupMember.setQuitMode(quitMode);
			groupMember.setMemberStatus(CmGroupConstants.MemberStatus.Invalid);
			groupMember.setExpireDate(CmTimeUtil.getDefaultSysDate());
			delObj.copy(groupMember);
			groupMember = InnerServiceFactory.getCustGroupMemberSV().saveGroupMemberInfo(groupMember);
			
			delObj.setStsToOld();
			delObj.delete();
			InnerServiceFactory.getCustGroupMemberSV().saveGroupMemberInfo(delObj);
			
			
			//出群日志  RecordGroupLog
			Map<String, Object> groupLogMap = new HashMap<String, Object>();
			groupLogMap.put("custGroupId", groupId);
			if(CmGroupConstants.QuitMode.RemovedByOwner == quitMode){
				groupLogMap.put("logEventType", CmGroupConstants.GroupLogSrcEventType.removeMember);
				groupLogMap.put("custId", groupOwnerCustId);
				groupLogMap.put(CmGroupConstants.GroupLogParam.Admin, groupOwnerCustId);
			}else{
				groupLogMap.put("logEventType", CmGroupConstants.GroupLogSrcEventType.quitTheGroup);
				groupLogMap.put("custId", memberCustId);
			}
			groupLogMap.put(CmGroupConstants.GroupLogParam.Invitee, memberCustId);
			
			if (ServiceManager.getUser()!=null){
				groupLogMap.put("createOpId", ServiceManager.getUser().getID() );
				groupLogMap.put("createOrgId",  ServiceManager.getUser().getOrgId() );
			}
			groupLogMap.put("operatorObjectId", groupId);
			groupLogMap.put("eventCreateDate", eventTime);
			
			IBOCmGroupLogValue groupLog = InnerServiceFactory.getCustGroupLogSV().addGroupLog(groupLogMap);
			
			//AddGroupEvent
			DataContainerInterface inDataContainer = new DataContainer();
			inDataContainer.set("CUST_ID", memberCustId);
			inDataContainer.set("CUST_TYPE", CmGroupConstants.rawEventCustType.B2C);//b2b：3  b2c:1
			inDataContainer.set("CUST_GROUP_ID", groupId);
			inDataContainer.set("EVENT_TYPE", CmGroupConstants.GroupLogSrcEventType.quitTheGroup);//存  CM_GROUP_LOG表的 LOG_EVENT_TYPE
			inDataContainer.set("STATE", CmGroupConstants.rawEventState.initState);
			inDataContainer.set("LOG_ID", groupLog == null ? "-1" : groupLog.getLogId());//FMCS客户群日志：请传：日志表主键id
			inDataContainer.set("BUSINESS_ID", CmGroupConstants.RAW_EVENT_FMCS_BUSINESS_ID);//FMCS 客户群，请传：410000000001
			InnerServiceFactory.getFmcBusiSV().addRawEventForGroupLog(inDataContainer);

			//PUSHC参数组装
			long ownerCustId = 0l;
			IBOCmGroupMemberInfoValue[] groupOwnerArr = InnerServiceFactory.getCustGroupMemberSV().queryCmGroupMemberInfoByCondition(-1, groupId, CmGroupConstants.GroupRole.Owner, CmGroupConstants.MemberStatus.Valid, -1, -1);
			if(groupOwnerArr != null && groupOwnerArr.length == 1){
				IBOCmGroupMemberInfoValue groupOwner = groupOwnerArr[0];
				ownerCustId = groupOwner.getMemberRefId();
			}
			JSONArray groupDiscountMember = this.getQuitDiscountList(memberCustId, groupId, ownerCustId);
			//客户出群后，群的折扣情况
			JSONArray groupDiscount = this.getGroupDiscountListAfterQuitMember(memberCustId, groupId, ownerCustId);

			Map<String, Object> extMap = new HashMap<String, Object>();
			extMap.put(CmGroupConstants.GroupPushcParam.Event_Time, eventTime);
			extMap.put(CmGroupConstants.GroupPushcParam.Invitee, memberCustId);
			extMap.put(CmGroupConstants.GroupPushcParam.Admin, ownerCustId);
			extMap.put(CmGroupConstants.GroupPushcParam.InviteeDiscountList, groupDiscountMember);
			Map<String, Object> adminExtMap = new HashMap<String, Object>();
			adminExtMap.put(CmGroupConstants.GroupPushcParam.Event_Time, eventTime);
			adminExtMap.put(CmGroupConstants.GroupPushcParam.Invitee, memberCustId);
			adminExtMap.put(CmGroupConstants.GroupPushcParam.Admin, ownerCustId);
			adminExtMap.put(CmGroupConstants.GroupPushcParam.InviteeDiscountList, groupDiscount);
			//PUSHC发送
			if(CmGroupConstants.QuitMode.RemovedByOwner == quitMode){
				this.handleFMCGroupPushc(CmGroupConstants.GroupLogSrcEventType.removeMember,CmGroupConstants.receiver.member,memberCustId, -1, "", groupId, extMap);
				this.handleFMCGroupPushc(CmGroupConstants.GroupLogSrcEventType.removeMember,CmGroupConstants.receiver.admin,ownerCustId, -1, "", groupId, adminExtMap);
			}else{
				this.handleFMCGroupPushc(CmGroupConstants.GroupLogSrcEventType.quitTheGroup,CmGroupConstants.receiver.member,memberCustId, -1, "", groupId, extMap);
				this.handleFMCGroupPushc(CmGroupConstants.GroupLogSrcEventType.quitTheGroup,CmGroupConstants.receiver.admin,ownerCustId, -1, "", groupId, adminExtMap);
			}
		}else{
			//TODO throw new Exception();
		}
		
		return true;
	}

	/**
	 * 客户入群
	 * 服务流：
	 * 1、CheckCustomerJoinGroupEligable 检查客户是否允许入群
	 * 2、CreateGroupMember 增加群成员
	 * 3、RecordGroupLog 记录群日志
	 * 4、AddGroupEvent 增加客户群事件
	 */
	public boolean joinGroup(long custId,long groupId,long joinMode,String joinCode)throws Exception {

		//CheckCustomerJoinGroupEligable检查客户是具备创群基本资格
		//InnerServiceFactory.getCustGroupCheckSV().checkCustomerJoinGroupEligable(custId);
		
		//checkCustomerAlreadyInGroup检查客户是否允许创群
		//InnerServiceFactory.getCustGroupCheckSV().checkCustomerAlreadyInGroup(custId);
		
		Timestamp eventTime = ServiceManager.getOpDateTime();
		
		IBOCmGroupMemberInfoValue groupMember = new BOCmGroupMemberInfoBean();
		groupMember.setMemberRefId(custId);
		groupMember.setGroupId(groupId);
		groupMember.setGroupRole(CmGroupConstants.GroupRole.Member);
		groupMember.setJoinMode(joinMode);
		groupMember.setJoinCode(joinCode);
		groupMember.setStsToNew();
		groupMember = InnerServiceFactory.getCustGroupMemberSV().saveGroupMemberInfo(groupMember);
		
		//入群日志  RecordGroupLog
		Map<String, Object> groupLogMap = new HashMap<String, Object>();
		groupLogMap.put("custGroupId", groupId);
		groupLogMap.put("custId", custId);
		groupLogMap.put("logEventType", CmGroupConstants.GroupLogSrcEventType.joinTheGroup);
		if (ServiceManager.getUser()!=null){
			groupLogMap.put("createOpId", ServiceManager.getUser().getID() );
			groupLogMap.put("createOrgId",  ServiceManager.getUser().getOrgId() );
		}
		groupLogMap.put("operatorObjectId", groupId);
		groupLogMap.put("eventCreateDate", eventTime);
		groupLogMap.put(CmGroupConstants.GroupLogParam.Invitee, custId);
		groupLogMap.put(CmGroupConstants.GroupLogParam.Invitee_Identity, joinCode);
		IBOCmGroupLogValue groupLog = InnerServiceFactory.getCustGroupLogSV().addGroupLog(groupLogMap);
		
		//AddGroupEvent
		DataContainerInterface inDataContainer = new DataContainer();
		inDataContainer.set("CUST_ID", custId);
		inDataContainer.set("CUST_TYPE", CmGroupConstants.rawEventCustType.B2C);//b2b：3  b2c:1
		inDataContainer.set("CUST_GROUP_ID", groupId);
		inDataContainer.set("EVENT_TYPE", CmGroupConstants.GroupLogSrcEventType.joinTheGroup);//存  CM_GROUP_LOG表的 LOG_EVENT_TYPE
		inDataContainer.set("STATE", CmGroupConstants.rawEventState.initState);
		inDataContainer.set("LOG_ID", groupLog == null ? "-1" : groupLog.getLogId() );//FMCS客户群日志：请传：日志表主键id
		inDataContainer.set("BUSINESS_ID", CmGroupConstants.RAW_EVENT_FMCS_BUSINESS_ID);//FMCS 客户群，请传：410000000001
		InnerServiceFactory.getFmcBusiSV().addRawEventForGroupLog(inDataContainer);
		
		//PUSHC发送
		Map<String, Object> extMap = new HashMap<String, Object>();
		Map<String, Object> adminExtMap = new HashMap<String, Object>();
		JSONArray inviteeDiscountList = null;
		JSONArray groupDiscount = null;
		long ownerCustId = 0l;
		IBOCmGroupMemberInfoValue[] groupOwnerArr = InnerServiceFactory.getCustGroupMemberSV().queryCmGroupMemberInfoByCondition(-1, groupId, CmGroupConstants.GroupRole.Owner, CmGroupConstants.MemberStatus.Valid, -1, -1);
		if(groupOwnerArr != null && groupOwnerArr.length == 1){
			IBOCmGroupMemberInfoValue groupOwner = groupOwnerArr[0];
			ownerCustId = groupOwner.getMemberRefId();
			inviteeDiscountList = this.getInviteeDiscountList(custId, groupId, ownerCustId);
			groupDiscount = this.getGroupDiscountListAfterAddMember(custId, groupId, ownerCustId);
			
			extMap.put(CmGroupConstants.GroupPushcParam.Admin, ownerCustId);
			extMap.put(CmGroupConstants.GroupPushcParam.InviteeDiscountList, inviteeDiscountList);
			adminExtMap.put(CmGroupConstants.GroupPushcParam.Admin, ownerCustId);
			adminExtMap.put(CmGroupConstants.GroupPushcParam.InviteeDiscountList, groupDiscount);
		}
		this.handleFMCGroupPushc(CmGroupConstants.GroupLogSrcEventType.joinTheGroup,CmGroupConstants.receiver.member,custId, -1, "", groupId, extMap);
		this.handleFMCGroupPushc(CmGroupConstants.GroupLogSrcEventType.joinTheGroup,CmGroupConstants.receiver.admin,ownerCustId, -1, "", groupId, adminExtMap);

		return true;
	}

	/**
	 * 查询客户群概要信息
	 */
	public IBOCmCustomerGroupValue getGroupBasicInfo(long custId) throws Exception {
		IBOCmGroupMemberInfoValue[] groupMemberArr = InnerServiceFactory.getCustGroupMemberSV().queryCmGroupMemberInfoByCondition(custId, -1, -1, CmGroupConstants.MemberStatus.Valid, -1, -1);
		if(groupMemberArr != null && groupMemberArr.length == 1){
			
			IBOCmGroupMemberInfoValue groupMember = groupMemberArr[0];
			IBOCmCustomerGroupValue[] customerGroup = InnerServiceFactory.getCustGroupSV().queryCmCustomerGroupByCondition(groupMember.getGroupId(), -1, -1);
			return customerGroup[0];
		}else{
			return null;
		}
	}
	
	/**
	 * 查询客户群全量信息
	 */
	public DataContainer getGroupAdvanceInfo(long custId) throws Exception {
		IBOCmGroupMemberInfoValue[] groupMemberArr = InnerServiceFactory.getCustGroupMemberSV().queryCmGroupMemberInfoByCondition(custId, -1, -1, CmGroupConstants.MemberStatus.Valid, -1, -1);
		if(groupMemberArr != null && groupMemberArr.length == 1){
			
			IBOCmGroupMemberInfoValue groupMember = groupMemberArr[0];
			IBOCmCustomerGroupValue[] customerGroup = InnerServiceFactory.getCustGroupSV().queryCmCustomerGroupByCondition(groupMember.getGroupId(), -1, -1);
			DataContainer[] groupMemberList = this.getGroupAllMembersAdvanceInfo(groupMember.getGroupId(),-1);
			
			IBOCmInvitationInfoValue invitation = new BOCmInvitationInfoBean();
			invitation.setGroupId(groupMember.getGroupId());
			IBOCmInvitationInfoValue[] groupInvitationList = InnerServiceFactory.getCustGroupInvitationSV().getPendingValidInvitationByConditions(invitation, -1, -1);
			
			DataContainer groupSummaryInfo = new DataContainer();
			
			
			int maxMemberAmount = CmGroupConstants.maxMemberAmount;
			IBOCmGeneralConfigValue[] maxMemberAmountValue = InnerServiceFactory.getCmGeneralConfigSV()
					.getGeneralConfigs(CmGroupConstants.srcType.groupParam, CmGroupConstants.srcType.groupParam, CmGroupConstants.configCode.maxMemberAmount, CmGroupConstants.configStatus.effective);
			if(maxMemberAmountValue != null && maxMemberAmountValue.length > 0){
				maxMemberAmount = Integer.parseInt(maxMemberAmountValue[0].getValue1());
			}
			
			int availableInviteCount = maxMemberAmount - groupInvitationList.length - groupMemberList.length;
			
			groupSummaryInfo.set("customerGroupInfo", customerGroup[0]);//群基本信息
			
			groupSummaryInfo.set("groupMemberList", groupMemberList);//群成员列表
			groupSummaryInfo.set("groupInvitationList", groupInvitationList);//群邀请列表
			
			//群下 各个offerGroup的总订购数
			DataContainer[] offerGroupValidAmountList = this.getAllOfferGroupValidAmountByCustGroupLevel(custId, CmGroupConstants.GroupType.B2C, CmGroupConstants.OfferGroupType.FMC_GROUP);
			groupSummaryInfo.set("offerGroupValidAmountList", offerGroupValidAmountList);
			
			groupSummaryInfo.set("groupMemberCount", groupMemberList.length);//群成员个数
			groupSummaryInfo.set("groupInvitationCount", groupInvitationList.length);//群邀请个数
			groupSummaryInfo.set("groupMemberMaxCount", maxMemberAmount);//群全局参数：最大成员数
			groupSummaryInfo.set("groupAvailableInviteCount", availableInviteCount);//还可以邀请的成员个数
			return groupSummaryInfo;
		}else{
			return null;
		}
	}

	/**
	 * 查询客户群下的成员
	 * @param groupId 必填
	 * @param custId 非必填
	 * @return
	 * @throws Exception
	 */
	public DataContainer[] getGroupAllMembersAdvanceInfo(long groupId,long custId) throws Exception {
		IBOCmGroupMemberInfoValue[] groupMemberList = InnerServiceFactory.getCustGroupMemberSV().queryCmGroupMemberInfoByCondition(custId, groupId, -1, CmGroupConstants.MemberStatus.Valid, -1, -1);
		if(groupMemberList != null && groupMemberList.length > 0){
			List<DataContainer> memberList = new ArrayList<DataContainer>();
			for(IBOCmGroupMemberInfoValue groupMember:groupMemberList){
				DataContainer member = new DataContainer();
				member.copy(groupMember); 
				member.set("customerName", InnerServiceFactory.getCustGroupLogSV().transferCustId2CustName(groupMember.getMemberRefId()));
				DataContainer[] offerGroupValidAmountList = this.getAllOfferGroupValidAmountBySingleCustLevel(groupMember.getMemberRefId(), CmGroupConstants.GroupType.B2C, CmGroupConstants.OfferGroupType.FMC_GROUP);
				member.set("offerGroupValidAmountList", offerGroupValidAmountList);
				memberList.add(member);
			}
			return memberList.toArray(new DataContainer[0]);
		}else{
			return null;
		}
	}
	
	/**
	 * 查询客户群下的邀请
	 * modify:2018.12.12 from wangkun：返回inviter的客户名字
	 */
	public DataContainer[] getGroupInvitationList(long groupId) throws Exception {
		IBOCmInvitationInfoValue invitation = new BOCmInvitationInfoBean();
		invitation.setGroupId(groupId);
		IBOCmInvitationInfoValue[] groupInvitationList = InnerServiceFactory.getCustGroupInvitationSV().getPendingValidInvitationByConditions(invitation, -1, -1);
		if(groupInvitationList != null && groupInvitationList.length > 0){
			List<DataContainer> invitationList = new ArrayList<DataContainer>();
			for(IBOCmInvitationInfoValue groupInvitation:groupInvitationList){
				DataContainer invitationTemp = new DataContainer();
				invitationTemp.copy(groupInvitation); 
				invitationTemp.set("customerName", InnerServiceFactory.getCustGroupLogSV().transferCustId2CustName(groupInvitation.getInviter()));
				invitationList.add(invitationTemp);
			}
			return invitationList.toArray(new DataContainer[0]);
		}else{
			return null;
		}
	}
	
	

	/**
	 * 生成邀请码邀请入群
	 * 服务流：
	 * 1、GroupOwnerCheck 群主校验
	 * 2、checkGroupInvitationNumber 检查群邀请数限制
	 * 3、generateInvitationCode 生成邀请码
	 * 4、saveCmInvitationInfo 创建群邀请
	 * 5、RecordGroupLog 记录群日志
	 */
	public IBOCmInvitationInfoValue inviteByCode(long custId, long custGroupId) throws Exception {
		//GroupOwnerCheck
		InnerServiceFactory.getCustGroupCheckSV().groupOwnerCheck(custId, custGroupId);
				
		//检查群邀请数限制
		InnerServiceFactory.getCustGroupCheckSV().checkGroupInvitationNumber(custGroupId);
		
		//生成邀请码
		String invitationCode = InnerServiceFactory.getCustGroupInvitationSV().generateInvitationCode();
		
		//创建邀请
		IBOCmInvitationInfoValue invitation = new BOCmInvitationInfoBean();
		invitation.setGroupId(custGroupId);
		invitation.setInviter(custId);
		invitation.setInviteMode(CmGroupConstants.invitationMode.InvitationCode);
		invitation.setInviteeIdentity(invitationCode);
		invitation = InnerServiceFactory.getCustGroupInvitationSV().saveCmInvitationInfo(invitation);

		//生成邀请码日志  RecordGroupLog
		/*Map<String, Object> groupLogMap = new HashMap<String, Object>();
		groupLogMap.put("custGroupId", custGroupId);
		groupLogMap.put("custId", custId);
		groupLogMap.put("logEventType", CmGroupConstants.GroupLogSrcEventType.inviteMemberByCode);
		groupLogMap.put("createOpId", ServiceManager.getUser().getID() );
		groupLogMap.put("createOrgId",  ServiceManager.getUser().getOrgId() );
		groupLogMap.put("operatorObjectId", invitation.getInvitationId() );
		groupLogMap.put("eventCreateDate", ServiceManager.getOpDateTime());
		InnerServiceFactory.getCustGroupLogSV().addGroupLog(groupLogMap);*/

		Timestamp eventTime = ServiceManager.getOpDateTime();
		
		//群日志  RecordGroupLog
		Map<String, Object> groupLogMap = new HashMap<String, Object>();
		groupLogMap.put("custGroupId", custGroupId);
		groupLogMap.put("custId", custId);
		groupLogMap.put("logEventType", CmGroupConstants.GroupLogSrcEventType.inviteMemberByCode);
		if (ServiceManager.getUser()!=null){
			groupLogMap.put("createOpId", ServiceManager.getUser().getID() );
			groupLogMap.put("createOrgId",  ServiceManager.getUser().getOrgId() );
		}
		groupLogMap.put("operatorObjectId", invitation.getInvitationId());
		groupLogMap.put("eventCreateDate", eventTime);

		groupLogMap.put(CmGroupConstants.GroupLogParam.Invitation_Id, invitation.getInvitationId());
		groupLogMap.put(CmGroupConstants.GroupLogParam.Expiration_date_of_this_invitation, invitation.getExpireDate());
		groupLogMap.put(CmGroupConstants.GroupLogParam.Invitation_Code, invitationCode);
		
		InnerServiceFactory.getCustGroupLogSV().addGroupLog(groupLogMap);
		
		//PUSHC
		Map<String, Object> extMap = new HashMap<String, Object>();
		extMap.put(CmGroupConstants.GroupPushcParam.Event_Time, eventTime);
		extMap.put(CmGroupConstants.GroupPushcParam.Invitation_Code, invitationCode);
		extMap.put(CmGroupConstants.GroupPushcParam.Expiration_Date, invitation.getExpireDate());
		this.handleFMCGroupPushc(CmGroupConstants.GroupLogSrcEventType.inviteMemberByCode, CmGroupConstants.receiver.admin,custId, -1, "", invitation.getGroupId(), extMap);

		return invitation;
	}
	
	/**
	 * 根据号码邀请入群
	 * 服务流：
	 * 1、GroupOwnerCheck 群主校验
	 * 2、checkGroupInvitationNumber 检查群邀请数限制
	 * 3、checkPhoneNumber 检查号码
	 * 4、CheckCustomerJoinGroupEligable 检查客户是否允许入群
	 * 5、saveCmInvitationInfo 创建群邀请
	 * 6、RecordGroupLog 记录群日志
	 */
	public Map inviteByPhone(long custId, String phoneNum, long custGroupId) throws Exception {
		Map map = new HashMap();
		//GroupOwnerCheck
		InnerServiceFactory.getCustGroupCheckSV().groupOwnerCheck(custId, custGroupId);
		
		//检查群邀请数限制
		InnerServiceFactory.getCustGroupCheckSV().checkGroupInvitationNumber(custGroupId);
		
		//检查该号码是否已经被该群邀请了，且邀请还有效
		InnerServiceFactory.getCustGroupCheckSV().checkInvitaionByPhone(custGroupId,phoneNum);
		
		
		IInsUserValue insUser = InnerServiceFactory.getCustGroupCheckSV().checkPhoneNumber(phoneNum);
		long inviteeRefCustId = insUser.getCustId();
		long userId = insUser.getUserId();
		
		//Phone number of customer already member of admin’s group
		InnerServiceFactory.getCustGroupCheckSV().checkCustomerAlreadyInGroup(inviteeRefCustId, custGroupId);
		
		//CheckCustomerJoinGroupEligable检查客户是否允许入群(已经在群下的客户也可以被邀请)
		InnerServiceFactory.getCustGroupCheckSV().checkCustomerJoinGroupEligable(inviteeRefCustId);
		
		//创建邀请
		IBOCmInvitationInfoValue invitation = new BOCmInvitationInfoBean();
		invitation.setGroupId(custGroupId);
		invitation.setInviter(custId);
		invitation.setInviteMode(CmGroupConstants.invitationMode.PhoneNumber);
		invitation.setInviteeIdentity(phoneNum);
		invitation.setInviteeRefId(inviteeRefCustId);
		invitation = InnerServiceFactory.getCustGroupInvitationSV().saveCmInvitationInfo(invitation);
		
		Timestamp eventTime = ServiceManager.getOpDateTime();
		
		//群日志  RecordGroupLog
		Map<String, Object> groupLogMap = new HashMap<String, Object>();
		groupLogMap.put("custGroupId", custGroupId);
		groupLogMap.put("custId", custId);
		groupLogMap.put("logEventType", CmGroupConstants.GroupLogSrcEventType.inviteMemberByPhone);
		if (ServiceManager.getUser()!=null){
			groupLogMap.put("createOpId", ServiceManager.getUser().getID() );
			groupLogMap.put("createOrgId",  ServiceManager.getUser().getOrgId() );
		}
		groupLogMap.put("operatorObjectId", invitation.getInvitationId());
		groupLogMap.put("eventCreateDate", eventTime);

		groupLogMap.put(CmGroupConstants.GroupLogParam.Invitation_Id, invitation.getInvitationId());
		groupLogMap.put(CmGroupConstants.GroupLogParam.Expiration_date_of_this_invitation, invitation.getExpireDate());
		groupLogMap.put(CmGroupConstants.GroupLogParam.Phone_Number, phoneNum);
		
		InnerServiceFactory.getCustGroupLogSV().addGroupLog(groupLogMap);

		JSONArray offerGroupDiscountList = this.getInviteeDiscountList(inviteeRefCustId, custGroupId, custId);
		//PUSHC
		Map<String, Object> extMap = new HashMap<String, Object>();
		extMap.put(CmGroupConstants.GroupPushcParam.Event_Time, eventTime);
		extMap.put(CmGroupConstants.GroupPushcParam.Admin, custId);
		IBOCmCustomerGroupValue[] custGroupArr = InnerServiceFactory.getCustGroupSV().queryCmCustomerGroupByCondition(custGroupId, -1, -1);
		if(custGroupArr != null && custGroupArr.length == 1){
			IBOCmCustomerGroupValue custGroup = custGroupArr[0];
			extMap.put(CmGroupConstants.GroupPushcParam.Group_Name, custGroup.getGroupName());
		}
		
		extMap.put(CmGroupConstants.GroupPushcParam.InviteeDiscountList, offerGroupDiscountList);

		String code = this.handleFMCGroupPushc(CmGroupConstants.GroupLogSrcEventType.inviteMemberByPhone,CmGroupConstants.receiver.theUserAndOwnerOfMobileNumber, -1, userId, phoneNum, custGroupId, extMap);
		map.put("code", code);
		map.put("invitation", invitation);
		return map;
	}
	
	
	/**
	 * 获取客户接受邀请前后的折扣变化信息
	 * @param inviteeCustId
	 * @param groupId
	 * @param ownerCustId
	 * @return
	 */
	public JSONArray getGroupDiscountListAfterQuitMember(long quitCustId, long groupId, long ownerCustId) {
		JSONArray inviteeDiscountList = new JSONArray();
		try{
			//根据客户找到所属的客户群ID 以及 该客户群下所有成员
			IBOCmGroupMemberInfoValue[] allGroupMember = InnerServiceFactory.getCustGroupMemberSV().queryCmGroupMemberInfoByCondition(0, groupId, 0, CmGroupConstants.MemberStatus.Valid, -1, -1);
			
			// 收集 客户群组下的 offerGroupId
			Set<String> offerGroupIdSet = new  HashSet<String>();
			for ( int i=0; allGroupMember!=null && i<allGroupMember.length; i++ ){
				long memberCustId = allGroupMember[i].getMemberRefId();
				IBOOrdCustValidAmountValue[] offerGroupValidAmountArr = InnerServiceFactory.getSo2CustGroupSV().queryOrdCustValidAmounts(memberCustId, CmGroupConstants.GroupType.B2C, CmGroupConstants.OfferGroupType.FMC_GROUP, null);
				for ( int j=0; offerGroupValidAmountArr!=null && j<offerGroupValidAmountArr.length; j++ ){
					String offerGroupId = offerGroupValidAmountArr[j].getFeature02();
					if ( !offerGroupIdSet.contains(offerGroupId) ){
						offerGroupIdSet.add(offerGroupValidAmountArr[j].getFeature02());
					}
				}
			}
			
			//收集被邀请客户的offer group
			IBOOrdCustValidAmountValue[] offerGroupValidAmountArr = InnerServiceFactory.getSo2CustGroupSV().queryOrdCustValidAmounts(quitCustId, CmGroupConstants.GroupType.B2C, CmGroupConstants.OfferGroupType.FMC_GROUP, null);
			for ( int j=0; offerGroupValidAmountArr!=null && j<offerGroupValidAmountArr.length; j++ ){
				String offerGroupId = offerGroupValidAmountArr[j].getFeature02();
				if ( !offerGroupIdSet.contains(offerGroupId) ){
					offerGroupIdSet.add(offerGroupValidAmountArr[j].getFeature02());
				}
			}
			
			// 获取每个offerGroupId 对应的数量
			for (String offerGroupId:offerGroupIdSet){
				IOfferGroupValue groupFormulaInfo = InnerServiceFactory.getProductSV().getOfferGroupByIdAndType(offerGroupId, CmGroupConstants.OfferGroupType.FMC_GROUP);
				if (groupFormulaInfo != null){
					//客户群下原有订购数
					int beforeCustGroupValidAmount = this.getSpecifiedOfferGroupValidAmountByCustGroupLevel(ownerCustId, CmGroupConstants.GroupType.B2C, CmGroupConstants.OfferGroupType.FMC_GROUP,offerGroupId);
					//出群成员的订购数
					int quitMemberValidAmount = this.getSpecifiedOfferGroupValidAmountBySingleCustLevel(quitCustId, CmGroupConstants.GroupType.B2C, CmGroupConstants.OfferGroupType.FMC_GROUP,offerGroupId);
					//客户出群后 群下的订购数
					int afterValidAmount = beforeCustGroupValidAmount - quitMemberValidAmount;
					//根据新老订购数得到新老折扣信息
					JSONObject fmcParam = this.getDiscountJsonObj(offerGroupId, beforeCustGroupValidAmount, afterValidAmount);
					
					inviteeDiscountList.put(fmcParam);
				}
			}	
		}catch(Exception e){
			e.printStackTrace();
		}
		return inviteeDiscountList;
	}
	
	/**
	 * 获取客户接受邀请前后的折扣变化信息
	 * @param inviteeCustId
	 * @param groupId
	 * @param ownerCustId
	 * @return
	 */
	public JSONArray getQuitDiscountList(long quitCustId, long groupId, long ownerCustId) {
		JSONArray inviteeDiscountList = new JSONArray();
		try{
			//根据客户找到所属的客户群ID 以及 该客户群下所有成员
			IBOCmGroupMemberInfoValue[] allGroupMember = InnerServiceFactory.getCustGroupMemberSV().queryCmGroupMemberInfoByCondition(0, groupId, 0, CmGroupConstants.MemberStatus.Valid, -1, -1);
			
			// 收集 客户群组下的 offerGroupId
			Set<String> offerGroupIdSet = new  HashSet<String>();
			for ( int i=0; allGroupMember!=null && i<allGroupMember.length; i++ ){
				long memberCustId = allGroupMember[i].getMemberRefId();
				IBOOrdCustValidAmountValue[] offerGroupValidAmountArr = InnerServiceFactory.getSo2CustGroupSV().queryOrdCustValidAmounts(memberCustId, CmGroupConstants.GroupType.B2C, CmGroupConstants.OfferGroupType.FMC_GROUP, null);
				for ( int j=0; offerGroupValidAmountArr!=null && j<offerGroupValidAmountArr.length; j++ ){
					String offerGroupId = offerGroupValidAmountArr[j].getFeature02();
					if ( !offerGroupIdSet.contains(offerGroupId) ){
						offerGroupIdSet.add(offerGroupValidAmountArr[j].getFeature02());
					}
				}
			}
			
			//收集被邀请客户的offer group
			IBOOrdCustValidAmountValue[] offerGroupValidAmountArr = InnerServiceFactory.getSo2CustGroupSV().queryOrdCustValidAmounts(quitCustId, CmGroupConstants.GroupType.B2C, CmGroupConstants.OfferGroupType.FMC_GROUP, null);
			for ( int j=0; offerGroupValidAmountArr!=null && j<offerGroupValidAmountArr.length; j++ ){
				String offerGroupId = offerGroupValidAmountArr[j].getFeature02();
				if ( !offerGroupIdSet.contains(offerGroupId) ){
					offerGroupIdSet.add(offerGroupValidAmountArr[j].getFeature02());
				}
			}
			
			// 获取每个offerGroupId 对应的数量
			for (String offerGroupId:offerGroupIdSet){
				IOfferGroupValue groupFormulaInfo = InnerServiceFactory.getProductSV().getOfferGroupByIdAndType(offerGroupId, CmGroupConstants.OfferGroupType.FMC_GROUP);
				if (groupFormulaInfo != null){
					//客户群下原有订购数
					int beforeCustGroupValidAmount = this.getSpecifiedOfferGroupValidAmountByCustGroupLevel(ownerCustId, CmGroupConstants.GroupType.B2C, CmGroupConstants.OfferGroupType.FMC_GROUP,offerGroupId);
					//客户出群后的订购数
					int afterValidAmount = this.getSpecifiedOfferGroupValidAmountBySingleCustLevel(quitCustId, CmGroupConstants.GroupType.B2C, CmGroupConstants.OfferGroupType.FMC_GROUP,offerGroupId);
					//根据新老订购数得到新老折扣信息
					JSONObject fmcParam = this.getDiscountJsonObj(offerGroupId, beforeCustGroupValidAmount, afterValidAmount);
					
					inviteeDiscountList.put(fmcParam);
				}
			}	
		}catch(Exception e){
			e.printStackTrace();
		}
		return inviteeDiscountList;
	}
	
	public JSONArray getGroupDiscountListAfterAddMember(long inviteeCustId, long groupId, long ownerCustId) {
		JSONArray inviteeDiscountList = new JSONArray();
		try{
			//根据客户找到所属的客户群ID 以及 该客户群下所有成员
			IBOCmGroupMemberInfoValue[] allGroupMember = InnerServiceFactory.getCustGroupMemberSV().queryCmGroupMemberInfoByCondition(0, groupId, 0, CmGroupConstants.MemberStatus.Valid, -1, -1);
			
			// 收集 客户群组下的 offerGroupId
			Set<String> offerGroupIdSet = new  HashSet<String>();
			for ( int i=0; allGroupMember!=null && i<allGroupMember.length; i++ ){
				long memberCustId = allGroupMember[i].getMemberRefId();
				IBOOrdCustValidAmountValue[] offerGroupValidAmountArr = InnerServiceFactory.getSo2CustGroupSV().queryOrdCustValidAmounts(memberCustId, CmGroupConstants.GroupType.B2C, CmGroupConstants.OfferGroupType.FMC_GROUP, null);
				for ( int j=0; offerGroupValidAmountArr!=null && j<offerGroupValidAmountArr.length; j++ ){
					String offerGroupId = offerGroupValidAmountArr[j].getFeature02();
					if ( !offerGroupIdSet.contains(offerGroupId) ){
						offerGroupIdSet.add(offerGroupValidAmountArr[j].getFeature02());
					}
				}
			}
			
			//收集被邀请客户的offer group
			IBOOrdCustValidAmountValue[] offerGroupValidAmountArr = InnerServiceFactory.getSo2CustGroupSV().queryOrdCustValidAmounts(inviteeCustId, CmGroupConstants.GroupType.B2C, CmGroupConstants.OfferGroupType.FMC_GROUP, null);
			for ( int j=0; offerGroupValidAmountArr!=null && j<offerGroupValidAmountArr.length; j++ ){
				String offerGroupId = offerGroupValidAmountArr[j].getFeature02();
				if ( !offerGroupIdSet.contains(offerGroupId) ){
					offerGroupIdSet.add(offerGroupValidAmountArr[j].getFeature02());
				}
			}
			
			// 获取每个offerGroupId 对应的数量
			for (String offerGroupId:offerGroupIdSet){
				IOfferGroupValue groupFormulaInfo = InnerServiceFactory.getProductSV().getOfferGroupByIdAndType(offerGroupId, CmGroupConstants.OfferGroupType.FMC_GROUP);
				if (groupFormulaInfo != null){
					//客户群下原有订购数
					int custGroupValidAmount = this.getSpecifiedOfferGroupValidAmountByCustGroupLevel(ownerCustId, CmGroupConstants.GroupType.B2C, CmGroupConstants.OfferGroupType.FMC_GROUP,offerGroupId);
					//受邀者原有订购数
					int oldValidAmount = this.getSpecifiedOfferGroupValidAmountByCustGroupLevel(inviteeCustId, CmGroupConstants.GroupType.B2C, CmGroupConstants.OfferGroupType.FMC_GROUP,offerGroupId);
					//受邀者接受邀请后 的订购数
					int validAmount = oldValidAmount + custGroupValidAmount;
					
					//根据新老订购数得到新老折扣信息
					JSONObject fmcParam = this.getDiscountJsonObj(offerGroupId, custGroupValidAmount, validAmount);
					
					inviteeDiscountList.put(fmcParam);
				}
			}	
		}catch(Exception e){
			e.printStackTrace();
		}
		return inviteeDiscountList;
	}
	/**
	 * 获取客户接受邀请前后的折扣变化信息
	 * @param inviteeCustId
	 * @param groupId
	 * @param ownerCustId
	 * @return
	 */
	public JSONArray getInviteeDiscountList(long inviteeCustId, long groupId, long ownerCustId) {
		JSONArray inviteeDiscountList = new JSONArray();
		try{
			//根据客户找到所属的客户群ID 以及 该客户群下所有成员
			IBOCmGroupMemberInfoValue[] allGroupMember = InnerServiceFactory.getCustGroupMemberSV().queryCmGroupMemberInfoByCondition(0, groupId, 0, CmGroupConstants.MemberStatus.Valid, -1, -1);
			
			// 收集 客户群组下的 offerGroupId
			Set<String> offerGroupIdSet = new  HashSet<String>();
			for ( int i=0; allGroupMember!=null && i<allGroupMember.length; i++ ){
				long memberCustId = allGroupMember[i].getMemberRefId();
				IBOOrdCustValidAmountValue[] offerGroupValidAmountArr = InnerServiceFactory.getSo2CustGroupSV().queryOrdCustValidAmounts(memberCustId, CmGroupConstants.GroupType.B2C, CmGroupConstants.OfferGroupType.FMC_GROUP, null);
				for ( int j=0; offerGroupValidAmountArr!=null && j<offerGroupValidAmountArr.length; j++ ){
					String offerGroupId = offerGroupValidAmountArr[j].getFeature02();
					if ( !offerGroupIdSet.contains(offerGroupId) ){
						offerGroupIdSet.add(offerGroupValidAmountArr[j].getFeature02());
					}
				}
			}
			
			//收集被邀请客户的offer group
			IBOOrdCustValidAmountValue[] offerGroupValidAmountArr = InnerServiceFactory.getSo2CustGroupSV().queryOrdCustValidAmounts(inviteeCustId, CmGroupConstants.GroupType.B2C, CmGroupConstants.OfferGroupType.FMC_GROUP, null);
			for ( int j=0; offerGroupValidAmountArr!=null && j<offerGroupValidAmountArr.length; j++ ){
				String offerGroupId = offerGroupValidAmountArr[j].getFeature02();
				if ( !offerGroupIdSet.contains(offerGroupId) ){
					offerGroupIdSet.add(offerGroupValidAmountArr[j].getFeature02());
				}
			}
			
			// 获取每个offerGroupId 对应的数量
			for (String offerGroupId:offerGroupIdSet){
				IOfferGroupValue groupFormulaInfo = InnerServiceFactory.getProductSV().getOfferGroupByIdAndType(offerGroupId, CmGroupConstants.OfferGroupType.FMC_GROUP);
				if (groupFormulaInfo != null){
					//客户群下原有订购数
					int custGroupValidAmount = this.getSpecifiedOfferGroupValidAmountByCustGroupLevel(ownerCustId, CmGroupConstants.GroupType.B2C, CmGroupConstants.OfferGroupType.FMC_GROUP,offerGroupId);
					//受邀者原有订购数
					int oldValidAmount = this.getSpecifiedOfferGroupValidAmountByCustGroupLevel(inviteeCustId, CmGroupConstants.GroupType.B2C, CmGroupConstants.OfferGroupType.FMC_GROUP,offerGroupId);
					//受邀者接受邀请后 的订购数
					int validAmount = oldValidAmount + custGroupValidAmount;
					
					//根据新老订购数得到新老折扣信息
					JSONObject fmcParam = this.getDiscountJsonObj(offerGroupId, oldValidAmount, validAmount);
					
					inviteeDiscountList.put(fmcParam);
				}
			}	
		}catch(Exception e){
			e.printStackTrace();
		}
		return inviteeDiscountList;
	}
	
	/**
	 * 根据新老订购数得到新老折扣信息
	 * @param offerGroupId
	 * @param oldValidCount
	 * @param validCount
	 * @return
	 */
	public JSONObject getDiscountJsonObj(String offerGroupId, int oldValidCount, int validCount){
		JSONObject discount = new JSONObject();
		discount.put(CmGroupConstants.GroupPushcParam.Offer_Group_Id, offerGroupId);
		discount.put(CmGroupConstants.GroupPushcParam.Offer_Group_Type, CmGroupConstants.OfferGroupType.FMC_GROUP);
		try{
			IOfferGroupValue groupFormulaInfo = InnerServiceFactory.getProductSV().getOfferGroupByIdAndType(offerGroupId, CmGroupConstants.OfferGroupType.FMC_GROUP);
			if (groupFormulaInfo != null){
				Map map = CmFmcCustGroupUtils.calculationOfPreferential(groupFormulaInfo.getFormula(), oldValidCount);
				discount.put(CmGroupConstants.GroupPushcParam.Old_Tier, (String)map.get("LEV"));
				discount.put(CmGroupConstants.GroupPushcParam.Old_Discount_Percentage, (String)map.get("PERCENTAGE"));
				
				Map map2 = CmFmcCustGroupUtils.calculationOfPreferential(groupFormulaInfo.getFormula(), validCount);
				discount.put(CmGroupConstants.GroupPushcParam.New_Tier, (String)map2.get("LEV"));
				discount.put(CmGroupConstants.GroupPushcParam.New_Discount_Percentage, (String)map2.get("PERCENTAGE"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return discount;
	} 

	/**
	 * 输入邀请码入群
	 * 服务流：
	 * 1、checkInvitaion 根据Code来校验邀请的合法性
	 * 2、joinGroup 客户入群
	 * 3、saveCmInvitationInfo 更新邀请状态
	 * 4、RecordGroupLog 记录群日志
	 */
	public boolean acceptInvitationByCode(long custId,String invitationCode) throws Exception {		
		InnerServiceFactory.getCustGroupCheckSV().checkInvitaion(-1,-1,invitationCode);
		
		//CheckCustomerJoinGroupEligable检查客户是具备创群基本资格
		InnerServiceFactory.getCustGroupCheckSV().checkCustomerJoinGroupEligable(custId);
		
		//checkCustomerAlreadyInGroup检查客户是否允许创群
		InnerServiceFactory.getCustGroupCheckSV().checkCustomerAlreadyInGroup(custId);
		
		IBOCmInvitationInfoValue invitation = new BOCmInvitationInfoBean();
		invitation.setInviteMode(CmGroupConstants.invitationMode.InvitationCode);
		invitation.setInviteeIdentity(invitationCode);
		IBOCmInvitationInfoValue[] invitationArr = InnerServiceFactory.getCustGroupInvitationSV().getPendingValidInvitationByConditions(invitation, -1, -1);
		if(invitationArr != null && invitationArr.length > 0){
			invitation = invitationArr[0];
		}else{
			return false;
		}
		
		invitation.setStatus(CmGroupConstants.invitationStatus.Accepted);
		invitation.setInviteeRefId(custId);
		invitation.setExpireDate(CmTimeUtil.getDefaultSysDate());
		InnerServiceFactory.getCustGroupInvitationSV().saveCmInvitationInfo(invitation);
		
		this.joinGroup(custId, invitation.getGroupId(), CmGroupConstants.JoinMode.InvitationCode,invitationCode+"");
		
		//接受邀请 (code)  RecordGroupLog
		/*Map<String, Object> groupLogMap = new HashMap<String, Object>();
		groupLogMap.put("custGroupId", invitation.getGroupId());
		groupLogMap.put("custId", custId);
		groupLogMap.put("logEventType", CmGroupConstants.GroupLogSrcEventType.acceptInviteByCode);
		groupLogMap.put("createOpId", ServiceManager.getUser().getID() );
		groupLogMap.put("createOrgId",  ServiceManager.getUser().getOrgId() );
		groupLogMap.put("operatorObjectId", invitation.getInvitationId() );
		groupLogMap.put("eventCreateDate", ServiceManager.getOpDateTime());
		InnerServiceFactory.getCustGroupLogSV().addGroupLog(groupLogMap);*/
		return true;
	}

	/**
	 * 接受邀请入群
	 * 服务流：
	 * 1、checkInvitaion 校验邀请的合法性
	 * 2、joinGroup 客户入群
	 * 3、saveCmInvitationInfo 更新邀请状态
	 * 4、RecordGroupLog 记录群日志
	 */
	public boolean acceptInvitationByPhone(long custId,long invitationId) throws Exception {
		InnerServiceFactory.getCustGroupCheckSV().checkInvitaion(custId,invitationId,"");
		
		//CheckCustomerJoinGroupEligable检查客户是具备创群基本资格
		InnerServiceFactory.getCustGroupCheckSV().checkCustomerJoinGroupEligable(custId);
		
		//checkCustomerAlreadyInGroup检查客户是否允许创群
		InnerServiceFactory.getCustGroupCheckSV().checkCustomerAlreadyInGroup(custId);
		
		IBOCmInvitationInfoValue invitation = new BOCmInvitationInfoBean();
		invitation.setInvitationId(invitationId);
		IBOCmInvitationInfoValue[] invitationArr = InnerServiceFactory.getCustGroupInvitationSV().getPendingValidInvitationByConditions(invitation, -1, -1);
		if(invitationArr != null && invitationArr.length > 0){
			invitation = invitationArr[0];
		}else{
			return false;
		}
		invitation.setStatus(CmGroupConstants.invitationStatus.Accepted);
		invitation.setExpireDate(CmTimeUtil.getDefaultSysDate());
		InnerServiceFactory.getCustGroupInvitationSV().saveCmInvitationInfo(invitation);
		
		this.joinGroup(invitation.getInviteeRefId(), invitation.getGroupId(), CmGroupConstants.JoinMode.PhoneNumber,invitation.getInviteeIdentity()+"");
			
		//接受邀请 (phone)  RecordGroupLog
		/*Map<String, Object> groupLogMap = new HashMap<String, Object>();
		groupLogMap.put("custGroupId", invitation.getGroupId());
		groupLogMap.put("custId", custId);
		groupLogMap.put("logEventType", CmGroupConstants.GroupLogSrcEventType.acceptInviteByPhone);
		groupLogMap.put("createOpId", ServiceManager.getUser().getID() );
		groupLogMap.put("createOrgId",  ServiceManager.getUser().getOrgId() );
		groupLogMap.put("operatorObjectId", invitation.getInvitationId() );
		groupLogMap.put("eventCreateDate", ServiceManager.getOpDateTime());
		InnerServiceFactory.getCustGroupLogSV().addGroupLog(groupLogMap);*/
		
		return true;
	}

	/**
	 * 成员拒绝邀请
	 * 服务流：
	 * 1、checkInvitaion 校验邀请的合法性
	 * 2、saveCmInvitationInfo 更新邀请状态
	 * 3、RecordGroupLog 记录群日志
	 */
	public boolean refuseInvitation(long custId,long invitationId) throws Exception {
		InnerServiceFactory.getCustGroupCheckSV().checkInvitaion(custId,invitationId,"");
		
		IBOCmInvitationInfoValue invitation = new BOCmInvitationInfoBean();
		invitation.setInvitationId(invitationId);
		IBOCmInvitationInfoValue[] invitationArr = InnerServiceFactory.getCustGroupInvitationSV().getPendingValidInvitationByConditions(invitation, -1, -1);
		if(invitationArr != null && invitationArr.length > 0){
			invitation = invitationArr[0];
		}else{
			return false;
		}
		
		invitation.setStatus(CmGroupConstants.invitationStatus.Rejected);
		invitation.setExpireDate(CmTimeUtil.getDefaultSysDate());
		InnerServiceFactory.getCustGroupInvitationSV().saveCmInvitationInfo(invitation);
			
		//拒绝邀请   RecordGroupLog
		Timestamp eventTime = ServiceManager.getOpDateTime();
		Map<String, Object> groupLogMap = new HashMap<String, Object>();
		groupLogMap.put("custGroupId", invitation.getGroupId());
		groupLogMap.put("custId", custId);
		groupLogMap.put("logEventType", CmGroupConstants.GroupLogSrcEventType.declineTheInvitation);
		if (ServiceManager.getUser()!=null){
			groupLogMap.put("createOpId", ServiceManager.getUser().getID() );
			groupLogMap.put("createOrgId",  ServiceManager.getUser().getOrgId() );
		}
		groupLogMap.put("operatorObjectId", invitation.getInvitationId() );
		groupLogMap.put("eventCreateDate", eventTime);
		groupLogMap.put(CmGroupConstants.GroupLogParam.Invitee, custId);
		groupLogMap.put(CmGroupConstants.GroupLogParam.Invitation_Id, invitation.getInvitationId());
		groupLogMap.put(CmGroupConstants.GroupLogParam.Invitee_Identity, invitation.getInviteeIdentity());
		InnerServiceFactory.getCustGroupLogSV().addGroupLog(groupLogMap);

		long ownerCustId = 0L;
		IBOCmGroupMemberInfoValue[] groupOwnerArr = InnerServiceFactory.getCustGroupMemberSV().queryCmGroupMemberInfoByCondition(-1, invitation.getGroupId(), CmGroupConstants.GroupRole.Owner, CmGroupConstants.MemberStatus.Valid, -1, -1);
		if(groupOwnerArr != null && groupOwnerArr.length == 1){
			IBOCmGroupMemberInfoValue groupOwner = groupOwnerArr[0];
		}
		
		if (ownerCustId>0) {
			//PUSHC
			Map<String, Object> extMap = new HashMap<String, Object>();
			extMap.put(CmGroupConstants.GroupPushcParam.Event_Time, eventTime);
			extMap.put(CmGroupConstants.GroupPushcParam.Invitee, custId);
			this.handleFMCGroupPushc(CmGroupConstants.GroupLogSrcEventType.declineTheInvitation, CmGroupConstants.receiver.admin,ownerCustId, -1, "", invitation.getGroupId(), extMap);
		}
		
		return true;
	}
	
	
	/**
	 * 更新邀请的阅读状态（0 unSeen 1 Seen）
	 */
	public boolean updateInvitationIsSeenStatus(long invitationId,String isSeen) throws Exception {
		IBOCmInvitationInfoValue invitation = new BOCmInvitationInfoBean();
		invitation.setInvitationId(invitationId);
		IBOCmInvitationInfoValue[] invitationArr = InnerServiceFactory.getCustGroupInvitationSV().getPendingValidInvitationByConditions(invitation, -1, -1);
		if(invitationArr != null && invitationArr.length > 0){
			invitation = invitationArr[0];
			invitation.setStsToOld();
			invitation.setIsSeen(isSeen);
			InnerServiceFactory.getCustGroupInvitationSV().saveCmInvitationInfo(invitation);
			return true;
		}
		return false;
	}

	/**
	 * 群主撤销邀请
	 * 服务流：
	 * 1、groupOwnerCheck 检查是否是群主
	 * 2、saveCmInvitationInfo 更新邀请状态
	 * 3、RecordGroupLog 记录群日志
	 */
	public boolean withdrawInvitation(long custId,long invitationId) throws Exception {
		InnerServiceFactory.getCustGroupCheckSV().checkInvitaion(-1,invitationId,"");
		
		IBOCmInvitationInfoValue invitation = new BOCmInvitationInfoBean();
		invitation.setInvitationId(invitationId);
		IBOCmInvitationInfoValue[] invitationArr = InnerServiceFactory.getCustGroupInvitationSV().getPendingValidInvitationByConditions(invitation, -1, -1);
		if(invitationArr != null && invitationArr.length > 0){
			invitation = invitationArr[0];
			InnerServiceFactory.getCustGroupCheckSV().groupOwnerCheck(custId, invitation.getGroupId());
			
			invitation.setStatus(CmGroupConstants.invitationStatus.Recall);
			invitation.setExpireDate(CmTimeUtil.getDefaultSysDate());
			InnerServiceFactory.getCustGroupInvitationSV().saveCmInvitationInfo(invitation);
			
			Timestamp eventTime = ServiceManager.getOpDateTime();
			
			//群日志  RecordGroupLog
			Map<String, Object> groupLogMap = new HashMap<String, Object>();
			groupLogMap.put("custGroupId", invitation.getGroupId());
			groupLogMap.put("custId", custId);
			groupLogMap.put("logEventType", CmGroupConstants.GroupLogSrcEventType.withdrawInvitation);
			if (ServiceManager.getUser()!=null){
				groupLogMap.put("createOpId", ServiceManager.getUser().getID() );
				groupLogMap.put("createOrgId",  ServiceManager.getUser().getOrgId() );
			}
			groupLogMap.put("operatorObjectId", invitation.getInvitationId());
			groupLogMap.put("eventCreateDate", eventTime);

			groupLogMap.put(CmGroupConstants.GroupLogParam.Invitation_Id, invitation.getInvitationId());
			groupLogMap.put(CmGroupConstants.GroupLogParam.Invitee_Identity, invitation.getInviteeIdentity());
			
			InnerServiceFactory.getCustGroupLogSV().addGroupLog(groupLogMap);
			
			return true;
		}
		
		return false;
	}

	/**
	 * 查询当前客户 接收到的群邀请
	 * modify:2018.12.12 from wangkun：返回inviter的客户名字
	 */
	public DataContainer[] getGroupInvitations(long custId) throws Exception {
		IBOCmInvitationInfoValue value = new BOCmInvitationInfoBean();
		value.setInviteMode(CmGroupConstants.invitationMode.PhoneNumber);
		value.setInviteeRefId(custId);
		IBOCmInvitationInfoValue[] groupInvitationList = InnerServiceFactory.getCustGroupInvitationSV().getPendingValidInvitationByConditions(value, -1, -1);
		if(groupInvitationList != null && groupInvitationList.length > 0){
			List<DataContainer> invitationList = new ArrayList<DataContainer>();
			for(IBOCmInvitationInfoValue groupInvitation:groupInvitationList){
				DataContainer invitationTemp = new DataContainer();
				invitationTemp.copy(groupInvitation); 
				invitationTemp.set("customerName", InnerServiceFactory.getCustGroupLogSV().transferCustId2CustName(groupInvitation.getInviter()));
				invitationList.add(invitationTemp);
			}
			return invitationList.toArray(new DataContainer[0]);
		}else{
			return null;
		}
		
	}

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
	public DataContainer[] getInvitationNotice(long custId, long invitationId) throws Exception {
		List<DataContainer> noticeList = new ArrayList<DataContainer>();
		IBOCmInvitationInfoValue invitation = InnerServiceFactory.getCustGroupInvitationSV().getInvitationById(invitationId);
		if(invitation != null){
			long groupId = invitation.getGroupId();
			long status = invitation.getStatus();
			long inviteeRefId = invitation.getInviteeRefId();
			long inviter = invitation.getInviter();
			
			if(CmGroupConstants.invitationStatus.Pending == status && inviteeRefId == custId){//邀请为Pending时，表示接受邀请者
				JSONArray discountArr = this.getInviteeDiscountList(inviteeRefId, groupId, inviter);
				if(discountArr != null && discountArr.length() > 0){
					for(int i = 0 ; i < discountArr.length() ; i++){
						JSONObject fmcParam = discountArr.getJSONObject(i);
						DataContainer noticeInfo = new DataContainer();
						noticeInfo.set("inviteeRefId", inviteeRefId);
						noticeInfo.set("inviter", inviter);
						
						String offerGroupId = (String)fmcParam.get(CmGroupConstants.GroupPushcParam.Offer_Group_Id);
						String orignalDiscount = (String)fmcParam.get(CmGroupConstants.GroupPushcParam.Old_Discount_Percentage);
						String newDiscount = (String)fmcParam.get(CmGroupConstants.GroupPushcParam.New_Discount_Percentage);
						
						noticeInfo.set("offerGroupId", offerGroupId);
						noticeInfo.set("orignalDiscount", orignalDiscount);
						noticeInfo.set("newDiscount", newDiscount);
						noticeInfo.set("noticeInfo", "["+inviter+"] invite you join his family group, and your ["+offerGroupId+"] discount change from ["+orignalDiscount+"] to ["+newDiscount+"]");
						noticeList.add(noticeInfo);
					}
				}
				return noticeList.toArray(new DataContainer[0]);
			}
			return new DataContainer[0];
		}
		return null;
	}

	/**
	 * 查询客户下所有offerGroup的订购数(按客户群统计)
	 * 查询A客户所有offerGroup的订购数
	 * 场景1：A客户在客户群中，客户群下有A,B,C客户。A客户有offerGroup 1001,1002。B客户有offerGroup 1002,1003。C客户有offerGroup 1004。
	 * 		    则返回1001，1002，1003，1004.
	 * 场景2：A客户在客户群中，客户群下有A,B,C客户。A客户没有offerGroup。B客户有offerGroup 1002,1003。C客户有offerGroup 1004。
	 * 		    则返回1002，1003，1004.
	 * 场景3：A客户不在客户群中。A客户有offerGroup 1001。 
	 * 		    返回1001。
	 * 场景4：A客户不在客户群中。A客户没有offerGroup。返回空.
	 * @param custId
	 * @param custGroupType (CR85 传 CmGroupConstants.GroupType.B2C)
	 * @param offerGroupType (CR85 传 CmGroupConstants.OfferGroupType.FMC_GROUP)
	 * @return DataContainer[] key：OfferGroupId,ValidAmount
	 * @throws Exception
	 */
	public DataContainer[] getAllOfferGroupValidAmountByCustGroupLevel(long custId,long custGroupType, String offerGroupType) throws Exception{
		List<DataContainer> offerGroupList = new ArrayList<DataContainer>();
		// 收集 客户群组下的 offerGroupId
		Set<String> offerGroupIdSet = new  HashSet<String>();
		
		//根据客户找到所属的客户群ID 以及 该客户群下所有成员
		IBOCmGroupMemberInfoValue[] currentMemberArr = InnerServiceFactory.getCustGroupMemberSV().queryCmGroupMemberInfoByCondition(custId, -1, -1, CmGroupConstants.MemberStatus.Valid, -1, -1);
		IBOCmGroupMemberInfoValue[] allGroupMember = null;
		if ( currentMemberArr!=null && currentMemberArr.length>0 ){//如果客户在群中，则需要查其他群成员该offerGroupId的订购数，然后累加
			long groupId = currentMemberArr[0].getGroupId();
			//根据客户群ID查询群下所有成员/客户
			allGroupMember = InnerServiceFactory.getCustGroupMemberSV().queryCmGroupMemberInfoByCondition(0, groupId, 0, CmGroupConstants.MemberStatus.Valid, -1, -1);
			for ( int i=0; allGroupMember!=null && i<allGroupMember.length; i++ ){
				long memberCustId = allGroupMember[i].getMemberRefId();
				//查询客户成员 offerGroup订购数
				IBOOrdCustValidAmountValue[] offerGroupValidAmountArr = InnerServiceFactory.getSo2CustGroupSV().queryOrdCustValidAmounts(memberCustId, custGroupType, offerGroupType, null);
				for ( int j=0; offerGroupValidAmountArr!=null && j<offerGroupValidAmountArr.length; j++ ){
					String offerGroupId = offerGroupValidAmountArr[j].getFeature02();
					if ( !offerGroupIdSet.contains(offerGroupId) ){
						offerGroupIdSet.add(offerGroupValidAmountArr[j].getFeature02());
					}
				}
			}
		}else{//客户不在客户群中,则收集当前客户的offer group
			IBOOrdCustValidAmountValue[] offerGroupValidAmountArr = InnerServiceFactory.getSo2CustGroupSV().queryOrdCustValidAmounts(custId, custGroupType, offerGroupType, null);
			for ( int j=0; offerGroupValidAmountArr!=null && j<offerGroupValidAmountArr.length; j++ ){
				String offerGroupId = offerGroupValidAmountArr[j].getFeature02();
				if ( !offerGroupIdSet.contains(offerGroupId) ){
					offerGroupIdSet.add(offerGroupValidAmountArr[j].getFeature02());
				}
			}
		}
		
		// 获取每个offerGroupId 对应的数量
		for (String offerGroupId:offerGroupIdSet){
			int validAmount = this.getSpecifiedOfferGroupValidAmountByCustGroupLevel(custId, custGroupType, offerGroupType, offerGroupId);
			DataContainer offerGroupInfo = new DataContainer();
			offerGroupInfo.set("offerGroupId", offerGroupId);
			offerGroupInfo.set("validAmount", validAmount);
			offerGroupList.add(offerGroupInfo);
		}

		return offerGroupList.toArray(new DataContainer[0]);
	}
	
	/**
	 * 查询客户指定offerGroup下的订购数(按客户群统计)
	 * 查询A客户offerGroup 1001的订购数
	 * 场景1：A客户在客户群中，客户群下有A,B,C客户。A客户有offerGroup 1001的用户。则查询出A + B,C下offerGroup 1001的订购数之和 。
	 * 场景2：A客户在客户群中，客户群下有A,B,C客户。A客户没有offerGroup 1001的用户。则查询出B,C下offerGroup 1001的订购数之和 。
	 * 场景3：A客户不在客户群中。A客户有offerGroup 1001的用户。 返回A的offerGroup 1001的订购数。
	 * 场景4：A客户不在客户群中。A客户没有offerGroup 1001的用户。返回0.
	 * @param custId
	 * @param custGroupType (CR85 传 CmGroupConstants.GroupType.B2C)
	 * @param offerGroupType (CR85 传 CmGroupConstants.OfferGroupType.CUST_FMC)
	 * @param offerGroupId
	 * @return
	 * @throws Exception
	 */
	public int getSpecifiedOfferGroupValidAmountByCustGroupLevel(long custId,long custGroupType, String offerGroupType,String offerGroupId) throws Exception{
		long validAmount = 0;
		
		//根据客户查询出客户和offerGroupId查询出本客户下的有效订购数
		IBOOrdCustValidAmountValue[] custValidAmountArr = InnerServiceFactory.getSo2CustGroupSV().queryOrdCustValidAmounts(custId, custGroupType, offerGroupType, offerGroupId);
		if(custValidAmountArr != null && custValidAmountArr.length > 0){
			validAmount = custValidAmountArr[0].getValidAmount();//本客户offerGroupId下的订购数
		}
		
		//根据客户找到所属的客户群ID 以及 该客户群下所有成员
		IBOCmGroupMemberInfoValue[] currentMemberArr = InnerServiceFactory.getCustGroupMemberSV().queryCmGroupMemberInfoByCondition(custId, -1, -1, CmGroupConstants.MemberStatus.Valid, -1, -1);
		IBOCmGroupMemberInfoValue[] allGroupMember = null;
		if ( currentMemberArr!=null && currentMemberArr.length>0 ){//如果客户在群中，则需要查其他群成员该offerGroupId的订购数，然后累加
			long groupId = currentMemberArr[0].getGroupId();
			//根据客户群ID查询群下所有成员/客户
			allGroupMember = InnerServiceFactory.getCustGroupMemberSV().queryCmGroupMemberInfoByCondition(0, groupId, 0, CmGroupConstants.MemberStatus.Valid, -1, -1);
			if(allGroupMember!=null && allGroupMember.length>0){
				for (IBOCmGroupMemberInfoValue member:allGroupMember){
					long memberCustId = member.getMemberRefId();
					if(memberCustId != custId){//累加 其他群成员 该offerGroupId的订购数
						IBOOrdCustValidAmountValue[] otherMemberValidAmountInfo = InnerServiceFactory.getSo2CustGroupSV().queryOrdCustValidAmounts(memberCustId, custGroupType, offerGroupType, offerGroupId);
						if ( otherMemberValidAmountInfo!=null && otherMemberValidAmountInfo.length>0 ){
							long otherMemberValidAmount = otherMemberValidAmountInfo[0].getValidAmount();//其他群成员 offerGroupId下的订购数
							validAmount += otherMemberValidAmount;
						}
					}
				}
			}
		}
		
		return new Long(validAmount).intValue();
	}
	
	/**
	 * 查询客户下所有offerGroup的订购数(按单个客户统计)
	 * @param custId
	 * @param custGroupType (CR85 传 CmGroupConstants.GroupType.B2C)
	 * @param offerGroupType (CR85 传 CmGroupConstants.OfferGroupType.CUST_FMC)
	 * @return DataContainer[] key：OfferGroupId,ValidAmount
	 * @throws Exception
	 */
	public DataContainer[] getAllOfferGroupValidAmountBySingleCustLevel(long custId,long custGroupType, String offerGroupType) throws Exception{
		List<DataContainer> offerGroupList = new ArrayList<DataContainer>();
		//查询出当前客户所有offerGroup订购数
		IBOOrdCustValidAmountValue[] offerGroupValidAmountArr = InnerServiceFactory.getSo2CustGroupSV().queryOrdCustValidAmounts(custId, custGroupType, offerGroupType, null);
		
		if(offerGroupValidAmountArr != null && offerGroupValidAmountArr.length > 0){
			//遍历每个offerGroup订购数
			for(IBOOrdCustValidAmountValue offerGroupValidAmount:offerGroupValidAmountArr){
				DataContainer offerGroupInfo = new DataContainer();
				long validAmount = offerGroupValidAmount.getValidAmount();//本客户offerGroupId下的订购数
				String offerGroupId = offerGroupValidAmount.getFeature02();//本客户offerGroupId下的订购数
				
				offerGroupInfo.set("offerGroupId", offerGroupId);
				offerGroupInfo.set("validAmount", validAmount);
				offerGroupList.add(offerGroupInfo);
			}
		}
		return offerGroupList.toArray(new DataContainer[0]);
	}
	
	/**
	 * 查询客户指定offerGroup下的订购数(按单个客户统计)
	 * @param custId
	 * @param custGroupType (CR85 传 CmGroupConstants.GroupType.B2C)
	 * @param offerGroupType (CR85 传 CmGroupConstants.OfferGroupType.CUST_FMC)
	 * @param offerGroupId
	 * @return
	 * @throws Exception
	 */
	public int getSpecifiedOfferGroupValidAmountBySingleCustLevel(long custId,long custGroupType, String offerGroupType,String offerGroupId) throws Exception{
		long validAmount = 0;
		
		//根据客户查询出客户和offerGroupId查询出本客户下的有效订购数
		IBOOrdCustValidAmountValue[] custValidAmountArr = InnerServiceFactory.getSo2CustGroupSV().queryOrdCustValidAmounts(custId, custGroupType, offerGroupType, offerGroupId);
		
		if(custValidAmountArr != null && custValidAmountArr.length > 0){
			validAmount = custValidAmountArr[0].getValidAmount();//本客户offerGroupId下的订购数
		}
		return new Long(validAmount).intValue();
	}
	
	/**
	 * 群组成员销户
	 * 1.群成员销户的群处理  <br/>
	 *   查客户所在群信息 <br/>
	 *	    Owner <br/>
	 * 		      还有群成员    转让群 (给 入群时间最早的),自己并出群 <br/>
	 * 		       没有群成员    解散群    撤销群邀请  <br/>
	 * 	 	Member <br/>
	 * 		       出群 <br/>
	 * 2.群成员销户的邀请处理<br/>
	 * 	  撤销邀请<br/>
	 * @param custId  群成员 客户id
	 * @throws Exception
	 */
	public void groupMemberTerminate(long custId)throws Exception{
		IBOCmGroupMemberInfoValue[] custMemberArr = InnerServiceFactory.getCustGroupMemberSV().queryCmGroupMemberInfoByCondition(custId, -1, -1, CmGroupConstants.MemberStatus.Valid, -1, -1);
		if ( custMemberArr==null && custMemberArr.length<=0 ){
			// 不在群组
			return;
		}
		// 1.群成员销户的群处理
		// 遍历客户所在的群
		for ( IBOCmGroupMemberInfoValue custMember:custMemberArr ){
			long groupId = custMember.getGroupId();		//群组id
			long groupRole = custMember.getGroupRole();	//成员在群组中角色
			// 判断客户在群中的角色
			if ( groupRole==CmGroupConstants.GroupRole.Owner ){
				// Owner
				// 统计群组中成员的数量
				IBOCmGroupMemberInfoValue[] memberArr = InnerServiceFactory.getCustGroupMemberSV().queryCmGroupMemberInfoByCondition(0, groupId, CmGroupConstants.GroupRole.Member, CmGroupConstants.MemberStatus.Valid, -1, -1);
				if ( memberArr!=null && memberArr.length>0 ){
					// 群组还有  成员角色 的 成员
					// 转让群 ( 给 入群时间最早的客户 )
					IBOCmGroupMemberInfoValue earliestMember = null; // 入群最早的客户
					for (IBOCmGroupMemberInfoValue member:memberArr){
						if ( earliestMember==null || earliestMember.getEffectiveDate().compareTo( member.getEffectiveDate() )>0 ){
							earliestMember = member;
						}
					}
					assignGroupOwner(custId, groupId, earliestMember.getMemberRefId());
					quitGroup(groupId, custId, CmGroupConstants.QuitMode.CustomerTerminate, 0);
				}else{
					// 群组 只有 owner
					// 解散群
					dissolveGroup(custId, groupId);
				}
			}else if ( groupRole==CmGroupConstants.GroupRole.Member ){
				// Member
				// 出群
				quitGroup(groupId, custId, CmGroupConstants.QuitMode.CustomerTerminate, 0);
			}
		}
		
		// 2.群成员销户的邀请处理
		IBOCmInvitationInfoValue condition = new BOCmInvitationInfoBean();
		condition.setInviteMode(CmGroupConstants.invitationMode.PhoneNumber);
		condition.setInviteeRefId(custId);
		IBOCmInvitationInfoValue[] invitationArr = InnerServiceFactory.getCustGroupInvitationSV().getPendingValidInvitationByConditions(condition, -1, -1);
		if ( invitationArr!=null && invitationArr.length>0 ){
			for ( IBOCmInvitationInfoValue invitation:invitationArr ){
				invitation.setStatus(CmGroupConstants.invitationStatus.Recall);//withdraw
				invitation.setExpireDate(CmTimeUtil.getDefaultSysDate());
			}
			InnerServiceFactory.getCustGroupInvitationSV().saveBatchCmInvitationInfo(invitationArr);
		}
	}
	
	/**
	 * 处理CR85 pushc事件的发送
	 * @param pushcType 枚举值为CmGroupConstants.pushcType
	 * @param custId 接收通知的客户,邀请号码时可不传
	 * @param userId 邀请号码时才传
	 * @param billId 邀请号码时才传
	 * @param entityId 传custOrderId/custGroupId
	 * @param extMap 传事件参数
	 * @return
	 */
	public String handleFMCGroupPushc(String pushcType,String receiverType,long custId, long userId, String billId, long entityId,Map<String,Object> extMap){
		String code = "";
		try{
			IBOCmGeneralConfigValue[] custGroupLogEventCfgs = InnerServiceFactory.getCmGeneralConfigSV().getGeneralConfigs(CmGroupConstants.srcType.fmcCustGroup, CmGroupConstants.configType.pushcType, pushcType, "U");
			if(custGroupLogEventCfgs != null && custGroupLogEventCfgs.length > 0){
				for(IBOCmGeneralConfigValue eventCfg:custGroupLogEventCfgs){
					//------开关的设置----------------//
					String eventNotificationSwitch = eventCfg.getValue2();//0不发送，其他发送
					String eventCode = eventCfg.getValue1();
					String receiverTypeConfig = eventCfg.getValue3();
					if(CmGroupConstants.eventPushcOff.equals(eventNotificationSwitch)){
						System.out.print(pushcType + " Event Notification Switch Off.");
					}else{
						if(receiverTypeConfig.equals(receiverType)){
							List<Receiver> receiverList=new ArrayList<Receiver>();
							if(CmGroupConstants.receiver.admin.equals(receiverType) 
									||CmGroupConstants.receiver.orderOwner.equals(receiverType)
									||CmGroupConstants.receiver.theNewAdmin.equals(receiverType)
									||CmGroupConstants.receiver.member.equals(receiverType)){
								handleCustomerReceiver(custId, receiverList);
							}else{
								if(userId > 0 && !"".equals(billId)){
									IInsCmRelSV insCmRel = (IInsCmRelSV) ServiceFactory.getService(IInsCmRelSV.class);
									IInsCmRelValue[] cmRels =  insCmRel.queryInsCmRels(userId, -1, -1, OrderConst.INST_STATE_INUSE);
									long ownerCustId = 0;//拥有者
									long userCustId = 0;//使用者
									for(int i = 0 ; i < cmRels.length;i++){
										if(cmRels[i].getRelaType()== CmConstants.RelaType.OWNER){
											ownerCustId = cmRels[i].getCustId();
										}else if(cmRels[i].getRelaType()== CmConstants.RelaType.USER){
											userCustId = cmRels[i].getCustId();
										}
									}
									if(CmGroupConstants.receiver.theUserAndOwnerOfMobileNumber.equals(receiverType)){
										code = handleCustomerReceiverForInvitePhone(userCustId,ownerCustId, receiverList,billId);
									}
								}
							}
							
							if (PushcSwitchUtil.isSendEvent(eventCode)) {
								// cr286方式发邮件待后续有需求才进行修改，暂注释这段逻辑，让老的邮件正常发送
								// if (PushcSwitchUtil.isSaveJsonParamInStructParamEvent()) {
								// 	// 保存cr286的参数信息， 做数据比对
								// 	String jsonParam = getStructParam(eventCode, pushcType, custId, billId, entityId, extMap, receiverList);
								// 	saveRecordLogOfStructParam(eventCode, custId, entityId, billId, userId, jsonParam);
								// }
								//extMap参数特殊转换
								if(extMap != null){
									Set skey = extMap.keySet();
									for (Iterator it = skey.iterator(); it.hasNext();) {
										String paramName = String.valueOf(it.next());
										if(CmGroupConstants.GroupPushcParam.Admin.equals(paramName) 
												|| CmGroupConstants.GroupPushcParam.Old_Admin.equals(paramName)
												|| CmGroupConstants.GroupPushcParam.New_Admin.equals(paramName)
												|| CmGroupConstants.GroupPushcParam.Invitee.equals(paramName)){
											long custIdParam = 0L;
											try{
												custIdParam = (Long)extMap.get(paramName);
											}catch(Exception e){
												e.printStackTrace();
											}
											if(custIdParam > 0){
												String custName = transferCustId2CustName(custIdParam);
												extMap.put(paramName, custName);
											}
										}else if(CmGroupConstants.GroupPushcParam.Event_Time.equals(paramName)){
											try{
												SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
												extMap.put(paramName, sdf.format(extMap.get(paramName)));
											}catch(Exception e){
												e.printStackTrace();
											}
										}
									}
								}
								// 老的方式发邮件
								sendPushc(eventCode, pushcType, custId, billId, entityId, extMap,receiverList);
							} else if (PushcSwitchUtil.isSendStructParamEvent(eventCode)) {
								String jsonParam = getStructParam(eventCode, pushcType, custId, billId, entityId, extMap, receiverList);
								if (PushcSwitchUtil.isSaveJsonParamInStructParamEvent()) {
									// 保存cr286的参数信息， 做数据比对
									saveRecordLogOfStructParam(eventCode, custId, entityId, billId, userId, jsonParam);
								}
								// cr286方式发邮件
								sendPushc(eventCode, pushcType, custId, billId, entityId, jsonParam,receiverList);
							}
							return code;
						}
					}
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return code;
	}
	
	private String getStructParam(String eventCode,String pushcType, long custId, String billId, long entityId, Map<String, Object> extMap, List<Receiver> receiverList) throws Exception {
		ICustomerGroupPushcSV customerGroupSV = (ICustomerGroupPushcSV) ServiceFactory.getService(ICustomerGroupPushcSV.class);
		String rtn = "";
		
		// customer group
		CustomerGroup customerGroup = null;
		if ("CM_CUSTGROUP_ASSIGN_NEW_ADMIN".equals(eventCode)) {
			customerGroup = customerGroupSV.handleStructEventParamOfAssignNewAdmin(entityId, (Long)extMap.get(CmGroupConstants.GroupPushcParam.Old_Admin), (Long)extMap.get(CmGroupConstants.GroupPushcParam.New_Admin));
		} else if ("CM_CUSTGROUP_DECLINE_INVITATION".equals(eventCode)) {
			customerGroup = customerGroupSV.handleStructEventParamOfDeclineInvitation(entityId, (Long)extMap.get(CmGroupConstants.GroupPushcParam.Invitee)) ;
		} else if ("CM_CUSTGROUP_INVITE_BY_CODE".equals(eventCode)) {
			customerGroup = customerGroupSV.handleStructEventParamOfInviteByCode(entityId, (String)extMap.get(CmGroupConstants.GroupPushcParam.Invitation_Code), (Date)extMap.get(CmGroupConstants.GroupPushcParam.Expiration_Date)) ;
		} else if ("CM_CUSTGROUP_INVITE_BY_PHONE".equals(eventCode)) {
			IInsUserValue insUser = InnerServiceFactory.getCustGroupCheckSV().checkPhoneNumber(billId);
			long inviteeRefCustId = insUser.getCustId();
			customerGroup = customerGroupSV.handleStructEventParamOfInviteByPhone(entityId, (Long)extMap.get(CmGroupConstants.GroupPushcParam.Admin), inviteeRefCustId, (JSONArray)extMap.get(CmGroupConstants.GroupPushcParam.InviteeDiscountList)) ;
		} else if ("CM_CUSTGROUP_JOIN_GROUP".equals(eventCode)) {
			customerGroup = customerGroupSV.handleStructEventParamOfJoinGroup(entityId, (Long)extMap.get(CmGroupConstants.GroupPushcParam.Admin), custId, (JSONArray)extMap.get(CmGroupConstants.GroupPushcParam.InviteeDiscountList), null) ;
		} else if ("CM_CUSTGROUP_JOIN_GROUP_TO_MEMBER".equals(eventCode)) {
			customerGroup = customerGroupSV.handleStructEventParamOfJoinGroup(entityId, (Long)extMap.get(CmGroupConstants.GroupPushcParam.Admin), custId, null, (JSONArray)extMap.get(CmGroupConstants.GroupPushcParam.InviteeDiscountList)) ;
		} else if ("CM_CUSTGROUP_QUIT_GROUP".equals(eventCode)) {
			customerGroup = customerGroupSV.handleStructEventParamOfQuitGroup(entityId, (Long)extMap.get(CmGroupConstants.GroupPushcParam.Admin), (Long)extMap.get(CmGroupConstants.GroupPushcParam.Invitee), (JSONArray)extMap.get(CmGroupConstants.GroupPushcParam.InviteeDiscountList), null) ;
		} else if ("CM_CUSTGROUP_QUIT_GROUP_TO_MEMBER".equals(eventCode)) {
			customerGroup = customerGroupSV.handleStructEventParamOfQuitGroup(entityId, (Long)extMap.get(CmGroupConstants.GroupPushcParam.Admin), (Long)extMap.get(CmGroupConstants.GroupPushcParam.Invitee), null, (JSONArray)extMap.get(CmGroupConstants.GroupPushcParam.InviteeDiscountList)) ;
		} else if ("CM_CUSTGROUP_REMOVE_MEMBER".equals(eventCode)) {
			customerGroup = customerGroupSV.handleStructEventParamOfRemoveMember(entityId, (Long)extMap.get(CmGroupConstants.GroupPushcParam.Admin), (Long)extMap.get(CmGroupConstants.GroupPushcParam.Invitee), null, (JSONArray)extMap.get(CmGroupConstants.GroupPushcParam.InviteeDiscountList)) ;
		} else if ("CM_CUSTGROUP_REMOVE_MEMBER_TO_ADMIN".equals(eventCode)) {
			customerGroup = customerGroupSV.handleStructEventParamOfRemoveMember(entityId, (Long)extMap.get(CmGroupConstants.GroupPushcParam.Admin), (Long)extMap.get(CmGroupConstants.GroupPushcParam.Invitee), (JSONArray)extMap.get(CmGroupConstants.GroupPushcParam.InviteeDiscountList), null) ;
		} else if ("SO_CHANGE_NEGOTIATION".equals(eventCode)) {
			customerGroup = customerGroupSV.handleStructEventParamOfChangeNegotiation(custId, (JSONArray)extMap.get(CmGroupConstants.GroupPushcParam.DiscountList));
		}
		// event time
		if ( extMap.containsKey(CmGroupConstants.GroupPushcParam.Event_Time) ) {
			customerGroup.setEventTime(extMap.get(CmGroupConstants.GroupPushcParam.Event_Time).toString());
		}
		
		// 对象 转json串
		ObjectMapper objectMapper = new ObjectMapper();
        rtn = objectMapper.writeValueAsString(customerGroup);
		return rtn;
	}
	
	private void saveRecordLogOfStructParam(String eventCode, long custId, long entityId, String billId, long userId, String structParam) throws RemoteException, Exception {
        String logInfo = eventCode + " parameter(StructParamEvent): " + structParam;
		IRecordLogSV  recordSV = (IRecordLogSV) ServiceFactory.getService(IRecordLogSV.class);
		recordSV.saveLog(custId, entityId,  0L, billId, userId, RBossConst.PUSHC_INTERFACE, logInfo, RBossConst.CRM_CALL_OUT, "Customer Group PushC Struct Json Parameter");
	}

	/**
	 * 将客户ID转换成客户名称
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("finally")
	private String transferCustId2CustName(Long custId){
		String custName = "";
		ICmCustomerSV customerSV = (ICmCustomerSV)ServiceFactory.getService(ICmCustomerSV.class);
		try{
			ICustomerValue customerVal = customerSV.queryCustomerByCustId(custId);
			if(customerVal!=null && customerVal.getCustType() == CmConstants.CustomerType.INDIVIDUAL){
				custName = customerVal.getFirstName() + " " + customerVal.getLastName();
			}else if(customerVal!=null && customerVal.getCustType() == CmConstants.CustomerType.GROUP){
				custName = customerVal.getCustName();
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			return custName;
		}
	}
	/**
	 * 发送Pushc并记录日志
	 * @param eventCode
	 * @param pushcType
	 * @param custId
	 * @param billId
	 * @param entityId 可能是customerOrderId,或是custGroupId
	 * @param extMap
	 * @param receiverList
	 * @throws Exception
	 * @throws RemoteException
	 */
	private void sendPushc(String eventCode,String pushcType, long custId, String billId, long entityId, Map<String, Object> extMap, List<Receiver> receiverList) throws Exception, RemoteException {
		if(receiverList.size() > 0){
			Event event = new Event();
			event.setEventCode(eventCode);
			event.setEventInitBusiType(pushcType);
			event.setEventInitChannel(pushcType);
			event.setEventInitEntityId(custId+"");
			event.setEventArgs(extMap);
			event.setReceiverList(receiverList);
			event.setBizSerialNo(String.valueOf(entityId > 0 ? entityId : custId));
			PushCEventThreadUtils.triggerEventAsynchronize(eventCode, event, custId, billId, entityId);
		}
	}
	
	/**
	 * 发送Pushc并记录日志
	 * @param eventCode
	 * @param pushcType
	 * @param custId
	 * @param billId
	 * @param entityId 可能是customerOrderId,或是custGroupId
	 * @param extMap
	 * @param receiverList
	 * @throws Exception
	 * @throws RemoteException
	 */
	private void sendPushc(String eventCode,String pushcType, long custId, String billId, long entityId, String jsonParam, List<Receiver> receiverList) throws Exception, RemoteException {
		if(receiverList.size() > 0){
			StructParamEvent event = new StructParamEvent();
			event.setEventCode(eventCode);
			event.setEventInitBusiType(pushcType);
			event.setEventInitChannel(pushcType);
			event.setEventInitEntityId(custId+"");
			event.setJsonParam(jsonParam);
			event.setReceiverList(receiverList);
			event.setBizSerialNo(String.valueOf(entityId > 0 ? entityId : custId));
			PushCEventThreadUtils.triggerStructParamEventAsynchronize(eventCode, event, custId, billId, entityId);
		}
	}
	
	/**
	 * 异步调用Pushc
	 * @param eventCode
	 * @param event
	 * @param custId
	 * @param billId
	 * @param entityId
	 */
	@Deprecated
	public void triggerEventAsynchronize(final String eventCode,final Event event,final long custId,final String billId,final long entityId) {
		new Thread(){
			public void run(){
				long result = -1;
				String loginfo = "";
				try{
					loginfo=transEvent2String(event);//pushc调用报文日志信息
					result = PushClient.triggerEvent(event);
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try{
						IRecordLogSV  recordSV = (IRecordLogSV) ServiceFactory.getService(IRecordLogSV.class);
						if (-1 == result) {
							recordSV.saveLog(custId, entityId,  0L, billId, 0L, RBossConst.PUSHC_INTERFACE,
					        		eventCode+":{ Invoke Result: Invoke PushClient.triggerEvent Fail, result == -1; },{ Log Info: "+ loginfo+" }", RBossConst.CRM_CALL_OUT, "PUSHC");
						}else if(result>=0) {
							recordSV.saveLog(custId, entityId,  0L, billId, 0L, RBossConst.PUSHC_INTERFACE,
					        		eventCode+":{ Invoke Result: Invoke Sucess },{ Log Info: "+ loginfo+" }", RBossConst.CRM_CALL_OUT, "PUSHC");
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
	}
	
	
	private int getManualCommercialProtection(Long partyID) throws RemoteException, Exception {
		System.out.println("===============getManualCommercialProtection partyID:="+partyID);
		CheckMarketingPermissionUsingRequest request = new CheckMarketingPermissionUsingRequest();
		CheckMarketingPermissionUsingRequestBody requestBody = new CheckMarketingPermissionUsingRequestBody();
		Ids id = new Ids();
		id.setId(partyID.toString());
		Ids[] ids= new Ids[1];
		ids[0]=id;
		requestBody.setId(ids);
		requestBody.setIdType("2");
		request.setRequestBody(requestBody);
		
		CheckMarketingPermissionUsingResponse  rsp = CmpServiceFactory.getService().getCheckMarketingPermissionUsingPort().checkMarketingPermissionUsing(request);
		Resultinfo[] result = rsp.getResponseBody().getResults();
		System.out.println("===============getManualCommercialProtection result:="+result[0].getAgreed());
		if(result[0].getAgreed().equals("true")){
			return 0;
		}else{
			return 1;
		}


		
	}

	/**
	 * 构造接收人结构对象
	 * @param custId
	 * @param receiverList
	 * @return
	 * @throws Exception
	 */
	private String handleCustomerReceiverForInvitePhone(long userCustId,long ownerCustId, List<Receiver> receiverList,String billId) throws Exception {
		boolean sendUser = true;
		boolean sendOwner = true;
		String code = "1000";
		ICmCustomerSV customerSV = (ICmCustomerSV)ServiceFactory.getService(ICmCustomerSV.class);
		ICustomerValue custVal = null;
		if(userCustId>0){
			custVal = customerSV.queryCustomerByCustId(userCustId);
			if(null != custVal){
				//获取客户Additional Information中的Permission for Marketing，如果为No,则不发送Pushc. Yes / N/A 则发送Pushc. 
				int customerNotificationSwitch = getManualCommercialProtection(custVal.getPartyId());
				if(CmConstants.commercialProtection.YES  == customerNotificationSwitch){
					Receiver owner = new Receiver();
					owner.setMediaType(null);
					owner.setReceiverType(Receiver.RECEIVER_TYPE_PERSONAL_CUSTOMER);
					owner.setRoleCode("user");
					Map<String, String> ownercontactAddress = new HashMap<String, String>();
					ownercontactAddress.put(PushInterConstants.MEDIA_TYPE_SMS, billId);
					owner.setContactAddress(ownercontactAddress);
					owner.setEnabled(true);
					owner.setReceiverId(custVal.getCustId());
					owner.setReceiverName(custVal.getCustName());
					owner.setExtAttributes(new HashMap<String,Object>());
					receiverList.add(owner);
				}else{
					sendUser = false;//XXX1:SMS not send
				}
			}
		}
		
		if(ownerCustId>0){
			custVal = customerSV.queryCustomerByCustId(ownerCustId);
			if(null != custVal){
				//获取客户Additional Information中的Permission for Marketing，如果为No,则不发送Pushc. Yes / N/A 则发送Pushc. 
				int customerNotificationSwitch = getManualCommercialProtection(custVal.getPartyId());
				if(CmConstants.commercialProtection.YES  == customerNotificationSwitch){
					String email = this.getConnectionInfo(custVal.getCustId(),CmConstants.AddressId.EMAIL, "EMAIL");
					if("".equals(email)){
						sendOwner = false;//XXX2:Email not send
					}else{
						Receiver owner = new Receiver();
						owner.setMediaType(null);
						owner.setReceiverType(Receiver.RECEIVER_TYPE_PERSONAL_CUSTOMER);
						owner.setRoleCode("owner");
						Map<String, String> ownercontactAddress = new HashMap<String, String>();
						ownercontactAddress.put(PushInterConstants.MEDIA_TYPE_EMAIL, email);
						owner.setContactAddress(ownercontactAddress);
						owner.setEnabled(true);
						owner.setReceiverId(custVal.getCustId());
						owner.setReceiverName(custVal.getCustName());
						owner.setExtAttributes(new HashMap<String,Object>());
						receiverList.add(owner);
					}
					
				}else{
					sendOwner = false;//XXX2:Email not send
				}
			}
		}
		
		if(!sendOwner && !sendUser){
			code = "1003";//Both not send
		}else if(!sendUser){
			code = "1001";//SMS not send
		}else if(!sendOwner){
			code = "1002";//Email not send
		}
		return code;
	}
	
	
	
	private void handleCustomerReceiver(long custId,List<Receiver> receiverList) throws Exception {
		ICmCustomerSV customerSV = (ICmCustomerSV)ServiceFactory.getService(ICmCustomerSV.class);
		ICustomerValue custVal = null;
		if(custId>0){
			custVal = customerSV.queryCustomerByCustId(custId);
			if(null != custVal){
//				//获取客户Additional Information中的Permission for Marketing，如果为No,则不发送Pushc. Yes / N/A 则发送Pushc. 
//				int customerNotificationSwitch = custVal.getManualCommercialProtection();
//				if(CmConstants.commercialProtection.N0  == customerNotificationSwitch){
//					System.out.print(custId + " Customer Commercial Protection No.");
//				}else{
					Receiver owner = new Receiver();
					owner.setMediaType(null);
					owner.setReceiverType(Receiver.RECEIVER_TYPE_PERSONAL_CUSTOMER);
					owner.setRoleCode("customer");
					Map<String, String> ownercontactAddress = new HashMap<String, String>();
					ownercontactAddress.put(PushInterConstants.MEDIA_TYPE_SMS, this.getConnectionInfo(custVal.getCustId(),CmConstants.AddressId.CONTACT_NUMBER, "PHONE"));
					ownercontactAddress.put(PushInterConstants.MEDIA_TYPE_EMAIL, this.getConnectionInfo(custVal.getCustId(),CmConstants.AddressId.EMAIL, "EMAIL"));
					owner.setContactAddress(ownercontactAddress);
					owner.setEnabled(true);
					owner.setReceiverId(custVal.getCustId());
					owner.setReceiverName(custVal.getCustName());
					owner.setExtAttributes(new HashMap<String,Object>());
					receiverList.add(owner);
//				}
			}
		}
	}
	
	public String transEvent2String(Event event) throws  Exception{
		StringBuffer Receivers=new StringBuffer();
		String eventCode = event.getEventCode();
		String busiType = event.getEventInitBusiType();
		String channel = event.getEventInitChannel();
		String entityId = event.getEventInitEntityId();
		Map eventArgs = event.getEventArgs();
		String serialNo = event.getBizSerialNo();
		List<Receiver> receiverList = event.getReceiverList();
		
		if (receiverList!=null && !receiverList.isEmpty()) {
			for (Receiver r:receiverList) {
				Receivers.append("<Receiver>");
				Receivers.append("<").append(r.getRoleCode()).append(">");
				Receivers.append("<ReceiverName>").append(r.getReceiverName()).append("</ReceiverName>");
				Receivers.append("<ReceiverType>").append(r.getReceiverType()).append("</ReceiverType>");
				Receivers.append("<ReceiverId>").append(r.getReceiverId()).append("</ReceiverId>");
				Receivers.append("<IsEnabled>").append(r.isEnabled()).append("</IsEnabled>");
				Receivers.append("<MediaType>").append(r.getMediaType()).append("</MediaType>");
				Receivers.append("<ContactAddress>").append(r.getContactAddress()).append("</ContactAddress>");
				Receivers.append("<ExtAttributes>").append(r.getExtAttributes().toString()).append("</ExtAttributes>");
				Receivers.append("</").append(r.getRoleCode()).append(">");
				Receivers.append("</Receiver>");
			}
		}
		StringBuffer sb=new StringBuffer("<logInfo>");
		sb.append("<EventCod>").append(eventCode).append("</EventCod>");
		sb.append("<EventInitBusiType>").append(busiType).append("</EventInitBusiType>");
		sb.append("<EventInitChannel>").append(channel).append("</EventInitChannel>");
		sb.append("<EventInitEntityId>").append(entityId).append("</EventInitEntityId>");
		sb.append("<EventArgs>").append(eventArgs.toString()).append("</EventArgs>");
		sb.append("<ReceiverList>").append(Receivers).append("</ReceiverList>");
		sb.append("<BizSerialNo>").append(serialNo).append("</BizSerialNo>");
		sb.append("</logInfo>");
		return sb.toString();
	}
	
	private String getConnectionInfo(long custId ,long mediaType ,String type) throws Exception{
		String ret="";
		//如果获取不到信息就返回空,影响不大,不抛异常
		if(custId <=0)
			return ret;
		ICmCustomerSV cmCustomerSV = (ICmCustomerSV)ServiceFactory.getService(ICmCustomerSV.class);
		IBOCmCustContactMediumValue[] medias = cmCustomerSV.queryCustContactMediumByCustId(custId);
		if(null == medias){
			return ret;
		}
		//目前只解析这2种,将来可能会改变
		for(int i = 0 ; i < medias.length;i++){
			if(medias[i].getContMedTypeId() == mediaType){
				if("EMAIL".equals(type)){
					ret = medias[i].getEmailAddress();
					return ret;
				}else if("PHONE".equals(type)){
					ret = medias[i].getContNumber();
					return ret;
				}
			}
		}
		return ret;
	}
	
	/**
	 * 判断两个客户是否在同一个客户群组
	 * @param custIdA
	 * @param custIdB
	 * @return
	 * @throws Exception
	 */
	public boolean isSameCustGroup(long custIdA,long custIdB)throws Exception{
		IBOCmGroupMemberInfoValue[] memberAArr = InnerServiceFactory.getCustGroupMemberSV().queryCmGroupMemberInfoByCondition(custIdA, -1, -1, CmGroupConstants.MemberStatus.Valid, -1, -1);
		if(memberAArr != null && memberAArr.length == 1){
			
			IBOCmGroupMemberInfoValue memberA = memberAArr[0];
			long aGroupId = memberA.getGroupId();
			
			IBOCmGroupMemberInfoValue[] memberBArr = InnerServiceFactory.getCustGroupMemberSV().queryCmGroupMemberInfoByCondition(custIdB, -1, -1, CmGroupConstants.MemberStatus.Valid, -1, -1);
			if(memberBArr != null && memberBArr.length == 1){
				
				IBOCmGroupMemberInfoValue memberB = memberBArr[0];
				long bGroupId = memberB.getGroupId();
				
				if(aGroupId == bGroupId){
					return true;
				}else{
					return false;
				}
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
	
	public IBOCmGroupLogValue[] getCustGroupLog(Map params) throws Exception {
		try {
			if(params!=null && params.size()>0){
				long custId = (Long)params.get("custId");
				long groupId = (Long)params.get("groupId");
				
				int logType = 0;
				if(params.get("logType")!=null){
					logType = (Integer)params.get("logType");
				}
				String logEventType = null;
				if(params.get("logEventType")!=null){
					logEventType = (String)params.get("logEventType");
				}
				int sortType = -1;
				if(params.get("sortType")!=null){
					sortType = (Integer)params.get("sortType");
				}
				String startDate = null;
				if(params.get("startDate")!=null){
					startDate = (String)params.get("startDate");
				}
				String endDate = null;
				if(params.get("endDate")!=null){
					endDate = (String)params.get("endDate");
				}
				int startNum = 0;
				if(params.get("startNum")!=null){
					startNum = (Integer)params.get("startNum");
				}
				int endNum = 100;
				if(params.get("endNum")!=null){
					endNum = (Integer)params.get("endNum");
				}
				ICustGroupLogSV logSV = (ICustGroupLogSV)ServiceFactory.getService(ICustGroupLogSV.class);
				return logSV.getGroupLogs(groupId, custId, logType, logEventType, sortType,startDate,endDate, startNum, endNum);		
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 根据invitation code查询invitation的接口
	 * （2018.11.09 wangkun email申请）
	 * @param invitationCode
	 * @return
	 * @throws Exception
	 */
	public DataContainer queryInvitationByCode(String invitationCode) throws Exception {
		IBOCmInvitationInfoValue invitation = new BOCmInvitationInfoBean();
		invitation.setInviteMode(CmGroupConstants.invitationMode.InvitationCode);
		invitation.setInviteeIdentity(invitationCode);
		IBOCmInvitationInfoValue[] invitationArr = InnerServiceFactory.getCustGroupInvitationSV().getPendingValidInvitationByConditions(invitation, -1, -1);
		if(invitationArr != null && invitationArr.length > 0){
			DataContainer invitationTemp = new DataContainer();
			invitation = invitationArr[0];
			invitationTemp.copy(invitation); 
			invitationTemp.set("customerName", InnerServiceFactory.getCustGroupLogSV().transferCustId2CustName(invitation.getInviter()));
			return invitationTemp;
		}
		return null;
	}
	
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
	public boolean validatePhoneNumber(String phoneNum)throws Exception{
		IInsUserValue insUser = InnerServiceFactory.getCustGroupCheckSV().checkPhoneNumber(phoneNum);
		long inviteeRefCustId = insUser.getCustId();
		
		//CheckCustomerJoinGroupEligable检查客户是否允许入群(已经在群下的客户也可以被邀请)
		InnerServiceFactory.getCustGroupCheckSV().checkCustomerJoinGroupEligable(inviteeRefCustId);
		
		return true;
	}

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
	public boolean validatePhoneNumber(long custId, String phoneNum, long custGroupId)throws Exception{
		//GroupOwnerCheck
		InnerServiceFactory.getCustGroupCheckSV().groupOwnerCheck(custId, custGroupId);
		
		//检查群邀请数限制
		InnerServiceFactory.getCustGroupCheckSV().checkGroupInvitationNumber(custGroupId);
		
		//检查该号码是否已经被该群邀请了，且邀请还有效
		InnerServiceFactory.getCustGroupCheckSV().checkInvitaionByPhone(custGroupId,phoneNum);
		
		IInsUserValue insUser = InnerServiceFactory.getCustGroupCheckSV().checkPhoneNumber(phoneNum);
		long inviteeRefCustId = insUser.getCustId();
		
		//Phone number of customer already member of admin’s group
		InnerServiceFactory.getCustGroupCheckSV().checkCustomerAlreadyInGroup(inviteeRefCustId, custGroupId);
		
		//CheckCustomerJoinGroupEligable检查客户是否允许入群(已经在群下的客户也可以被邀请)
		InnerServiceFactory.getCustGroupCheckSV().checkCustomerJoinGroupEligable(inviteeRefCustId);
		
		return true;
	}
	
	/**
	 * 获取offer group信息（from wangkun 2018.11.26 email）
	 * @param offerGroupId
	 * @param offerGroupType
	 * @return
	 * @throws Exception
	 */
	public IOfferGroupValue getOfferGroupByIdAndType(String offerGroupId, String offerGroupType)throws Exception{
		return InnerServiceFactory.getProductSV().getOfferGroupByIdAndType(offerGroupId, offerGroupType);
	}

}
