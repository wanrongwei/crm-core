package com.asiainfo.crm.cm.custgroup.utils;

import java.util.Date;



/**
 * 客户群管理域枚举值定义
 * @author Tan Yan
 *
 */
public class CmGroupConstants {

	public static final int maxMemberAmount = 5;//客户群最大成员个数
	public static final int inviteEffectDay = 7;//邀请有效期

	/**
	 * 客户群类型
	 */
	public interface GroupType {
		public static final long B2C = 1;
		public static final long B2B = 2;
		public static final long ALL = 3;
	}

	/**
	 * 客户群状态
	 */
	public interface GroupStatus {
		public static final int Active = 1;//在网
		public static final int Suspended = 2;//暂停
		public static final int Terminate = 3;//注销/解散
	}
	
	/**
	 * 客户群级别
	 */
	public interface GroupLevel {
		public static final int MEMBER = 1;
		public static final int INITIATOR = 2;
		public static final int ADMIN = 3;
	}
	
	/**
	 * 客户群 生失效 状态 
	 */
	public interface GroupEffExpStatus {
		public static final int VALID_TYPE_NOW = 1;
	    public static final int VALID_TYPE_NEXT = 2;
	    public static final int VALID_TYPE_EXPIRED = 4;
	    public static final int VALID_TYPE_ALL = -1;
	}
	
	/**
	 * 客户群加群验证方式
	 */
	public interface ValidType {
		public static final int INVITATION = 1;
		public static final int CUSTOMER = 2;
	}
	
	/**
	 * 客户群成员角色
	 */
	public interface GroupRole {
		public static final int Owner = 1;
		public static final int Member = 2;
	}
	
	/**
	 * 客户群成员状态
	 */
	public interface MemberStatus {
		public static final int Valid = 1;//有效
		public static final int Invalid = 0;//无效
	}
	
	/**
	 * 客户群成员入群方式
	 */
	public interface JoinMode {
		public static final int PhoneNumber = 1;
		public static final int InvitationCode = 2;
		public static final int CreateGroup = 3;
		public static final int Others = 4;
	}
	
	/**
	 * 客户群成员出群方式
	 */
	public interface QuitMode {
		public static final int DissolveGroup = 1;
		public static final int QuitBySelf = 2;
		public static final int RemovedByOwner = 3;
		public static final int CustomerTerminate = 4;
		public static final int Others = 5;
	}
	
	/**
	 * 邀请  状态
	 */
	public interface invitationStatus{
		public static final int Pending = 1;   // 待处理
		public static final int Recall = 2;    // 撤销
		public static final int Accepted = 3;  // 接受
		public static final int Rejected = 4;  // 拒绝
		public static final int Expired = 5;   // 失效
	}
	
	/**
	 *	邀请 失效时间 状态
	 */
	public interface invitationExpireStatus{
		public static final int Valid = 1;    //有效  		> now
		public static final int Invalid = 4;  //无效 		< now
	    public static final int All = -1;
	}
	
	/**
	 *	邀请方式
	 */
	public interface invitationMode{
		public static final int PhoneNumber = 1;
		public static final int InvitationCode = 2;
		public static final int Others = 4;
	}
	
	/**
	 * 邀请是否已读
	 */
	public interface invitationIsSeen{
		public static final String UN_SEEN = "0";//未读
		public static final String SEEN = "1";//已读
	}
	
	/**
	 *	邀请码的状态
	 */
	public interface invitationCodeManageStatus{
		public static final String INIT = "0";
		public static final String USE = "1";
	}
	
	/**
	 * 源类型
	 */
	public interface srcType{
		public static final String fmcCustGroup = "CUST_GROUP";
		public static final String fmcSingleCust = "FMC";
		public static final String groupParam = "GLOBAL_PARAM";
	}
	
	/**
	 * 配置类型
	 */
	public interface configType{
		public static final String groupParam = "GLOBAL_PARAM";
		public static final String logType = "CUST_GROUP_LOG_EVENT_TYPE";
		public static final String pushcType = "CUST_GROUP_PUSHC_EVENT_TYPE";
		public static final String logParams = "CUST_GROUP_LOG_EVENT_PARAMS";
	}
	
	/**
	 * 参数编码
	 */
	public interface configCode{
		public static final String maxMemberAmount = "MAX_MEMBER_AMOUNT";
		public static final String inviteEffectDay = "INVITE_EFFECT_DAY";
		public static final String inviteCodeExpression = "INVITE_CODE_EXPRESSION";
	}
	
	/**
	 * 有效状态
	 */
	public interface configStatus{
		public static final String effective = "U";
		public static final String expire = "E";
	}
	
	/**
	 * 日志对应的操作事件
	 */
	public interface GroupLogSrcEventType{
		public static final String createGroup = "CREATE_GROUP";//创建群
		public static final String renameGroupName = "RENAME_GORUP_NAME";//修改群名称
		public static final String dissolveTheGroup = "DISSOLVE_THE_GROUP";//解散群
		public static final String assignNewAdmin = "ASSIGN_NEW_ADMIN";//转让群主
		public static final String inviteMemberByPhone = "INVITE_MEMBER_BY_PHONE";//通过号码邀请成员
		public static final String inviteMemberByCode = "INVITE_MEMBER_BY_CODE";//通过邀请码邀请成员
		public static final String acceptInviteByPhone = "ACCEPT_INVITE_BY_PHONE";//接受号码的邀请
		public static final String acceptInviteByCode = "ACCEPT_INVITE_BY_CODE";//接受邀请码的邀请
		public static final String withdrawInvitation = "WITHDRAW_INVITATION";//撤销邀请
		public static final String declineTheInvitation = "DECLINE_THE_INVITATION";//拒绝入群邀请
		public static final String joinTheGroup = "JOIN_THE_GROUP";//加入群
		public static final String quitTheGroup = "QUIT_THE_GROUP";//退出群
		public static final String removeMember = "REMOVE_MEMBER";//移除群成员
		public static final String newConnection = "NEW_CONNECTION";//新开户
		public static final String changeOffer = "CHANGE_OFFER";//换offer
		public static final String transferOwnership = "TRANSFER_OWNERSHIP";//过户
		public static final String preRecreat = "PRE_RECREAT";//重入网
		public static final String pretermination = "PRETERMINATION";//预销户
		public static final String termination = "TERMINATION";//销户
		public static final String showPreference = "SHOW_PREFERENCE";//重新议价计算
		public static final String custTerminate = "CUST_TERMINATE";//将客户销户
	}
	
	/**
	 * 日志对应的操作事件
	 */
	public interface pushcType{
		public static final String assignNewAdmin = "ASSIGN_NEW_ADMIN";//转让群主
		public static final String inviteMemberByPhone = "INVITE_MEMBER_BY_PHONE";//通过号码邀请成员
		public static final String declineTheInvitation = "DECLINE_THE_INVITATION";//拒绝入群邀请
		public static final String joinTheGroup = "JOIN_THE_GROUP";//加入群
		public static final String quitTheGroup = "QUIT_THE_GROUP";//退出群
		public static final String removeMember = "REMOVE_MEMBER";//移除群成员
		public static final String changeNegotiation = "CHANGE_NEGOTIATION";
	}
	
	public static final String eventPushcOff = "OFF";//开关为关闭，不发送Pushc
	
	public interface receiver{
		public static final String theNewAdmin = "theNewAdmin";
		public static final String admin = "admin";
		public static final String member = "member";
		public static final String orderOwner = "orderOwner";
		public static final String theUserAndOwnerOfMobileNumber = "theUserAndOwnerOfMobileNumber";
	}
	
	
	public interface GroupLogParam{
		public static final String Event_Time = "Event Time";
		public static final String Creator = "Customer Name (Creator)";
		public static final String Group_Name = "Group Name";
		public static final String Admin = "Customer Name (Admin)";
		public static final String Group_Name_New = "Group Name (New)";
		public static final String Old_Admin = "Customer Name (Old Admin)";
		public static final String New_Admin = "Customer Name (New Admin)";
		public static final String Invitee = "Customer Name (Invitee)";
		
		public static final String Invitation_Id = "Invitation ID";
		public static final String Expiration_date_of_this_invitation = "Expiration date of this invitation";
		public static final String Phone_Number = "Mobile Number used for Invitation";
		public static final String Invitation_Code = "Invitation Code";
		public static final String Invitee_Identity = "Mobile Number or Code used for invitation";
	
		public static final String Cust_Group_Id = "Customer_Group_ID";
		public static final String Old_Cust_Group_Id = "Old_Customer_Group_ID";
		public static final String Group_Member_Count = "Group_Member_Count";
		public static final String DiscountList = "DiscountList";
		
		public static final String Offer_Group_Id = "Offer_Group_Id";
		public static final String Offer_Group_Type = "Offer_Group_Type";
		public static final String Old_Tier = "Old_Discount_Tier";
		public static final String Old_Discount_Percentage = "Old_Discount_Percentage";
		public static final String New_Tier = "New_Discount_Tier";
		public static final String New_Discount_Percentage = "New_Discount_Percentage";
		public static final String Remark = "Remark";
		public static final String Offer_Group_Valid_Amount = "Offer_Group_Valid_Amount";
	}
	
	/**
	 * pushc事件参数，不能有空格，不能有括号等
	 */
	public interface GroupPushcParam{
		public static final String Event_Time = "EventTime";
		public static final String Group_Name = "GroupName";
		public static final String Admin = "CustomerNameAdmin";
		public static final String Old_Admin = "CustomerNameOldAdmin";
		public static final String New_Admin = "CustomerNameNewAdmin";
		public static final String Invitee = "CustomerNameInvitee";
		public static final String Invitation_Code = "InvitationCode";
		public static final String Expiration_Date = "ExpirationDate";
		
		public static final String InviteeDiscountList = "DiscountListInvitee";//for inviteMemberByPhone
		public static final String DiscountList = "DiscountList";//for changeNegotiation
		
		public static final String Offer_Group_Id = "Offer_Group_Id";
		public static final String Offer_Group_Type = "Offer_Group_Type";
		public static final String Old_Tier = "Old_Discount_Tier";
		public static final String Old_Discount_Percentage = "Old_Discount_Percentage";
		public static final String New_Tier = "New_Discount_Tier";
		public static final String New_Discount_Percentage = "New_Discount_Percentage";
		public static final String Remark = "Remark";
	}
	
	public interface CustGroupLogType{
		public static final int custGroup = 1;//客户群操作
		public static final int invitation = 2;//邀请类
		public static final int order = 3;//订单类
		public static final int backendJob = 4;//后台backendJob类
		public static final int other = 5;//其它
	}
	
	public interface CustGroupLogLevel{
		public static final int member = 1;//所有群成员可见
		public static final int initiator_and_admin = 2;//群主和事件发起人
		public static final int admin = 3;//仅群主可见
		public static final int initiator = 4;//仅事件发起人可见
	}
	
	/**
	 * FMCS作为原始事件的business id
	 */
	public static final long RAW_EVENT_FMCS_BUSINESS_ID = 410000000001L;
	/**
	 * 未来订单回插原始事件的business id
	 */
	public static final long RAW_EVENT_FUTURE_BACK_FILL = 411000000001L;
	/**
	 * 未来订单回插原始事件的business id ,用来计算有效订购数
	 */
	public static final long RAW_EVENT_FUTURE_BACK_FILL_B2CVALIDAMOUNT = 411000000005L;
	
	/**
	 * FMCS原始事件的状态
	 */
	public interface rawEventState{
		public static final String initState = "1";//待处理/新增
	}
	
	/**
	 * 客户类型
	 */
	public interface rawEventCustType{
		public static final String B2C = "1";
		public static final String B2B = "3";
	}
	
	/**
	 * offer 群组类型
	 */
	public interface OfferGroupType{
		public static final String FMC = "FMC";
		public static final String FMC_GROUP = "FMC_GROUP";
		public static final String FAMILY = "Family"; //new Family Offer
		public static final String INSURANCE = "TERMINATE_INSURANCE"; //new Family Offer
		
	}
	
	public static final long VALIDEVENT_EVENTID_CUSTGROUP = 411000000002l; //job3 中客户群事件 回填订单记录（用于记录事件的产生基本信息）
	public static final long VALIDEVENT_EVENTID_CUSTGROUP_RECOMPUTER = 411000000003l; //立即生效 job3 中客户群事件 回填订单记录（用于记录事件的产生基本信息）
	public static final long VALIDEVENT_EVENTID_CUSTGROUP_RECOMPUTER_NOW = 411000000004l; //预约生效 job3 中客户群事件 回填订单记录（用于记录事件的产生基本信息）

	public static final long VALID_EVENT_BUSINESS_ID = 420000000000L; //JOB3 分发类型420000000000L
	
}