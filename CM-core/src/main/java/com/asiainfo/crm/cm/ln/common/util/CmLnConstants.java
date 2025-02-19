package com.asiainfo.crm.cm.ln.common.util;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 辽宁静态枚举值定义类
 *
 * @version v1.0.0
 * @author shitian
 * @date Aug 25, 2012 2:57:12 PM
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * Aug 25, 2012     shitian           v1.0.0               修改原因<br>
 */
public class CmLnConstants {

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmLnConstants
	 * @Description 辽宁扩展资料key
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Aug 25, 2012 3:00:16 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Aug 25, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public interface DealCustInfo {

		/**操作状态,状态*/
		public static String OP_STATE = "state";

		/**操作状态,新增*/
		public static String OP_NEW = "new";

		/**操作状态,修改*/
		public static String OP_MODIFY = "modify";

		/**操作状态,删除*/
		public static String OP_DEL = "del";

		/**扩展联系人信息*/
		public static String DEAL_CONTACT = "contactExt";

		/**扩展个人客户信息*/
		public static String DEAL_INDIV_CUST = "indivCustExt";

		/**扩展集团客户信息*/
		public static String DEAL_GRP_CUST = "grpCustExt";

		/**扩展集团成员信息*/
		public static String DEAL_GROUP_MEMBER = "groupMemberExt";

	}

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmLnConstants
	 * @Description 集团联系人类型
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Aug 31, 2012 3:44:55 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Aug 31, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public interface GroupContType {

		/**
		 * 集团网内成员
		 */
		public static int GROUP_MEMBER_INNER = 1;

		/**
		 * 集团网外成员
		 */
		public static int GROUP_MEMBER_OUTTER = 2;

		/**
		 * 集团联系人
		 */
		public static int GROUP_CONTACT = 1;

		/**
		 * 集团联系人优先级，主要
		 */
		public static int GROUP_CONTACT_FIRST = 1;

		/**
		 * 集团联系人优先级，非主要
		 */
		public static int GROUP_CONTACT_SECONDE = 2;

		/**
		 * 集团关键人
		 */
		public static int GROUP_KEY_PERSON = 2;

		/**
		 * 集团家属
		 */
		public static int GROUP_FAMILY = 3;
	}

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmLnConstants
	 * @Description 集团客户与客户经理关系表 关系类型
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Aug 31, 2012 3:44:55 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Aug 31, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface CmRelType {

		// [1]主要服务
		public static int RELTYPE1 = 1;
		// [2]辅助服务
		public static int RELTYPE2 = 2;
		// [3]首席客户经理
		public static int RELTYPE3 = 3;
		// [4]电话经理组
		public static int RELTYPE4 = 4;
		// [5]电话经理
		public static int RELTYPE5 = 5;

	}

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmLnConstants
	 * @Description 集团客户与客户经理关系表 操作类型
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Aug 31, 2012 3:44:55 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Aug 31, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface CmOpType {

		// [0]查询
		public static int OPYPE0 = 0;
		// [1]查询更改
		public static int OPTYPE1 = 1;

	}

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmLnConstants
	 * @Description 对象名称配置
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Aug 31, 2012 3:44:55 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Aug 31, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface MainMeth {

		public static String CM_MAIN_TYPE = "CmMainType";
		// 信誉等级
		public static String CM_USER_SPEUSERMAIN = "CmUserSpeuserMain";
		// 集团成员信息
		public static String CM_GROUP_MEMBER = "CmGrpMember";
		// 集团客户信息审核表
		public static String CM_GROUP_CUSTOMER_AUDIT_TYPE = "CmGrpCustomerAudit";
		public static String CM_GROUP_CUSTOMER_AUDIT = "CmGrpCustomerAudit";

	}

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmLnConstants
	 * @Description 集团客户与客户经理关系表 状态配置
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Aug 31, 2012 3:44:55 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Aug 31, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface GroupManagerState {

		// 正常状态
		public static String State_U = "U";
		// 失败状态
		public static String State_E = "E";
	}

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmLnConstants
	 * @Description 客户类型 
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Aug 31, 2012 3:44:55 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Aug 31, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface CustType {

		public static int CUST_TYPE_INDIVE = 1;// 1 个人客户

		public static int CUST_TYPE_FAMILY = 2;// 2 家庭客户

		public static int CUST_TYPE_GROUP = 3;// 3 集团客户

		public static int CUST_TYPE_VIRTUAL = 4;// 4 虚拟客户
	}

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmLnConstants
	 * @Description 成员状态
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Aug 31, 2012 3:44:55 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Aug 31, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface MemberStatus {

		public static int MEMBER_STATUS_NETWORK_IN = 1;// 网内成员

		public static int MEMBER_STATUS_NETWORK_OUT = 2; // 网外成员

		public static int NUMBER_MEMBER = 3; // 用户成员
	}

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmLnConstants
	 * @Description 成员状态
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Aug 31, 2012 3:44:55 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Aug 31, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface GroupCustManagerFlag {

		public static int CUST_MANAGER_FLAG_YES = 1;// 存在集团经理

		public static int CUST_MANAGER_FLAG_NO = 2; // 不存在集团经理
	}

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmLnConstants
	 * @Description 开通信用等级操作 类型 0—开通，1—取消
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Aug 31, 2012 3:44:55 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Aug 31, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface DredgeCredirEnter {

		public static int ACT_TYPE_OPEN = 0;// 开通

		public static int ACT_TYPE_CLOSE = 1; // 取消
	}

	// 对应支付方案属性表的attr_code
	public interface PaymentAttr {

		public static String OnceFee = "OnceFee";// 每次扣款金额

		public static String MinFee = "MinFee";// 最小扣款余额

		public static String BankBehalfPhone = "BankBehalfPhone";// 银行账号代表号码
	}

	public interface GroupAuditSts {

		public static String success = "2";

		public static String failed = "3";
	}

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmLnConstants
	 * @Description 分散账期标识 
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Aug 31, 2012 3:44:55 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Aug 31, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface BillCycleFlag {

		public static int BillCycleFlagOn = 1;// 1 开通

		public static int BillCycleFlagOff = 0;// 0 不开通
	}

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmLnConstants
	 * @Description 免催免停标志 
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Aug 31, 2012 3:44:55 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Aug 31, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface UrgeStopFlag {

		public static int UrgeStopFlag_0 = 0;// 0 账户要催欠

		public static int UrgeStopFlag_1 = 1;// 1 免催级别:免催缴

		public static int UrgeStopFlag_2 = 2;// 2 可摧免停

		public static int UrgeStopFlag_3 = 3;// 3 免催级别:免全部欠费处理
	}

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmLnConstants
	 * @Description 关系类型 
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Aug 31, 2012 3:44:55 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Aug 31, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface RelType {

		public static int REL_TYPE_OWNER = 1;// 0 自有

		public static int REL_TYPE_REL = 2;// 1 关联
	}

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmLnConstants
	 * @Description 黑名单监控子类型
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Aug 31, 2012 3:44:55 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Aug 31, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface SubMonType {

		public static int OweSpe = 1;// 1 欠费黑名单

	}

	public interface UserState {

		/**
		 * 销户用户
		 */
		public static int USER_DES = 0;

		public static int USER_NORMAL = 1;

	}

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmLnConstants
	 * @Description 银行签约
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 5, 2012 4:49:40 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Oct 5, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public interface BankSign {

		/**签约成功*/
		public static String DEAL_SUCCESS = "00";

		/**签约失败*/
		public static String DEAL_FAIL = "99";

		/**浦发银行 bankCode*/
		public static String PF_BANK_CODE = "99";

		/**
		 * 签约
		 */
		public static String SIGN_BANK = "QY";

		/**
		 * 解约
		 */
		public static String FIRE_BANK = "JY";
	}

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmLnConstants
	 * @Description 账户信用级别
	 *
	 * @version v1.0.0
	 * @author zouty
	 * @date Oct 5, 2012 4:49:40 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Oct 5, 2012     zouty           v1.0.0               修改原因<br>
	 */
	public interface CmCustLevel {

		public static int CREDIT_LEVEL_50 = 50;  // 0级
	}

	/**   
	 * @Copyright 
	 * 
	 * @ClassName CmLnConstants
	 * @Description集团级别审批状态
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Aug 31, 2012 3:44:55 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Aug 31, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface AudisSts {

		public static String STS_0 = "0";// 所有
		public static String STS_1 = "1";// 待审核
		public static String STS_2 = "2";// 审核成功
		public static String STS_3 = "3";// 审核失败
	}

	/**
	 * @ClassName CmLnConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Feb 17, 2012 11:28:06 AM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Feb 17, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface vipCardType {

		// 电子卡
		public static final int CARD1 = 2;
		// 实体卡
		public static final int CARD2 = 1;
	}

	/**
	 * @ClassName CmLnConstants
	 * @Description 电子卡下发状态
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Feb 17, 2012 11:28:06 AM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Feb 17, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface CardFlag {

		// 未下发
		public static final int CARD_FLAG0 = 0;
		// 已下发
		public static final int CARD_FLAG1 = 1;
	}

	/**
	 * @ClassName CmLnConstants
	 * @Description账期生效日期
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Feb 17, 2012 11:28:06 AM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Feb 17, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface EffectTyp {

		public static final String EFFTYPE = "EFF_TYPE";

		public static final int TYPE_MONTY_0 = 0;// 次月生效

		public static final int TYPE_MONTY_1 = 1;// 本月生效
	}

	/**
	 * @ClassName CmLnConstants
	 * @Descriptiona地市信息
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Feb 17, 2012 11:28:06 AM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Feb 17, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface Region {

		public static final String REGIONID_240 = "240";// 辽宁地市
	}

	/**
	 * @ClassName CmLnConstants
	 * @Descriptiona task 中的opid和ogrid取值
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Feb 17, 2012 11:28:06 AM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Feb 17, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface TaskOpAndOgr {

		public static final int OPID = 1000000743;// 操作员
		public static final int ORGID = 18011001;// 辽宁地市
	}

	public interface BbossOpAndOgr {

		public static final int OPID = 5001;
		public static final int ORGID = 24011002;
	}

	// 省编码
	public static final String Orig = "240";
	// 品牌对象
	public static final String BRANDID = "AM_OWE_BRAND";

	/**
		 * @ClassName CmLnConstants
		 * @Descriptiona 审核类型
		 *
		 * @version v1.0.0
		 * @author kangzk
		 * @date Feb 17, 2012 11:28:06 AM
		 * <br>
		 * Modification History:<br>
		 * Date         Author          Version            Description<br>
		 * ---------------------------------------------------------*<br>
		 * Feb 17, 2012     kangzk           v1.0.0               修改原因<br>
		 */
	public interface AuditTypeGrp {

		public static final String AuditTypeContact = "1";// 关键人审核申请
		public static final String AuditTypeCreReq_2 = "2";// 加分项申请
		public static final String AuditTypeCreReq_3 = "3";// 特殊信誉等级申请
		public static final String AuditTypeCreReq_4 = "4";// 指定危险信誉等级
		public static final String AuditTypeCreReq_5 = "5";// 第三方认定加分
	}

	/**
	 * @ClassName CmLnConstants
	 * @Descriptiona 审核定义层级
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Feb 17, 2012 11:28:06 AM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Feb 17, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface AuditClass {

		public static final String AuditClass_1 = "1";// 1级审核
		public static final String AuditClass_2 = "2";// 2级审核
	}

	/**
	 * @ClassName CmLnConstants
	 * @Descriptiona 集团加分项状态
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Feb 17, 2012 11:28:06 AM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Feb 17, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface CreditReqSts {

		public static final String CreditReqSts_0 = "0";// 所有
		public static final String CreditReqSts_1 = "1";// 审批中
		public static final String CreditReqSts_2 = "2";// 审批完成，待生效
		public static final String CreditReqSts_3 = "3";// 审批失败
		public static final String CreditReqSts_4 = "4";// 处理完成
	}

	/**
	 * @ClassName CmLnConstants
	 * @Descriptiona 集团加分项生效模式
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Feb 17, 2012 11:28:06 AM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Feb 17, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface ValidMode {

		public static final String ValidMode_1 = "1";// 立即生效
		public static final String ValidMode_2 = "2";// 下周期生效
	}

	/**
	 * @ClassName CmLnConstants
	 * @Descriptiona 集团信用等级
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Feb 17, 2012 11:28:06 AM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Feb 17, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface GrpCreditLevel {

		public static final String GrpCreditLevel_0 = "0";// 危险信息等级
		public static final String GrpCreditLevel_4 = "4";// 特殊信用等级
	}

	/**
	 * @ClassName CmLnConstants
	 * @Descriptiona 加分项申请类型
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Feb 17, 2012 11:28:06 AM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Feb 17, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface ReqRequestType {

		public static final String ReqRequestType_1 = "1";// [1]加分项申请
		public static final String ReqRequestType_2 = "2";// [2]申请为特殊信用等级
		public static final String ReqRequestType_3 = "3";// [3]特殊信用等级取消
		public static final String ReqRequestType_4 = "4";// [4]指定为危险信用等级
		public static final String ReqRequestType_5 = "5";// [5]第三方认定加分
	}

	/**
	 * @ClassName CmLnConstants
	 * @Descriptiona 审核类型
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Feb 17, 2012 11:28:06 AM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Feb 17, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface auditType {

		public static final int AUDIT_TYPE_CUSTOMER = 1;// 1：集团客户
		public static final int AUDIT_TYPE_MEMBER = 2;// 2：集团成员
	}

	/**
	 * @ClassName ClubTempState
	 * @Descriptiona VIP临时表处理状态
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Feb 17, 2012 11:28:06 AM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Feb 17, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface ClubTempState {

		public static final String ClubTempState_0 = "0";// 0未处理
		public static final String ClubTempState_1 = "1";// 1已处理
	}

	/**
	 * @ClassName ClubVipLevel
	 * @Descriptiona VIP级别
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Feb 17, 2012 11:28:06 AM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Feb 17, 2012     zouty           v1.0.0               修改原因<br>
	 */
	public interface ClubVipLevel {

		public static final int ClubVipLevel_0 = 0;// 0普通用户

	}

	/**
	 * @ClassName VipElement
	 * @Descriptiona VIP因  因子类型   1 积分评定
									2 地市调整
									3 特殊套餐
									4 跨区入网
									5 中高端评定
									6 前台新增大客户
									7 跨省改号 
									8 关键人
	 * 
	 * @version v1.0.0
	 * @author kangzk
	 * @date Feb 17, 2012 11:28:06 AM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Feb 17, 2012     kangz           v1.0.0               修改原因<br>
	 */
	public interface VipElement {

		public static final int VipElement_1 = 1;// 积分评定
		public static final int VipElement_2 = 2;// 地市调整
		public static final int VipElement_3 = 3;// 特殊套餐
		public static final int VipElement_4 = 4;// 跨区入网
		public static final int VipElement_5 = 5;// 中高端评定
		public static final int VipElement_6 = 6;// 前台新增大客户
		public static final int VipElement_7 = 7;// 跨省改号
		public static final int VipElement_8 = 8;// 关键人

	}

	/**
	 * @ClassName CmLnConstants  数据源定义
	 * @Descriptiona 
	 * 
	 * @version v1.0.0
	 * @author kangzk
	 * @date Feb 17, 2012 11:28:06 AM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Feb 17, 2012     kangz           v1.0.0               修改原因<br>
	 */
	public interface Handler {

		public static final String SEC = "sec";// 积分评定

	}

	/**
	 * @ClassName ClubCardCode
	 * @Descriptiona 
	 * 
	 * @version v1.0.0
	 * @author kangzk
	 * @date Feb 17, 2012 11:28:06 AM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Feb 17, 2012     zouty           v1.0.0               修改原因<br>
	 */
	public interface ClubCardCode {

		public static final int ClubCardCode_0 = 0;// 电子卡
		public static final int ClubCardCode_1 = 1;// 实体卡

	}

	/**
	 * @ClassName ClubCardFlag
	 * @Descriptiona 发卡标志
	 * 
	 * @version v1.0.0
	 * @author kangzk
	 * @date Feb 17, 2012 11:28:06 AM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Feb 17, 2012     zouty           v1.0.0               修改原因<br>
	 */
	public interface ClubCardFlag {

		public static final int ClubCardFlag_0 = 0;// 未发卡
		public static final int ClubCardFlag_1 = 1;// 已发卡

	}

	/**
	 * @ClassName MemberLevel
	 * @Descriptiona 会员级别
	 * 
	 * @version v1.0.0
	 * @author kangzk
	 * @date Feb 17, 2012 11:28:06 AM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Feb 17, 2012     zouty           v1.0.0               修改原因<br>
	 */
	public interface MemberLevel {

		public static final int MemberLevel_1 = 1;// 钻卡
		public static final int MemberLevel_2 = 2;// 金卡
		public static final int MemberLevel_3 = 3;// 银卡

	}

	/**
	 * @ClassName CmLnConstants
	 * @Descriptiona 付费类型
	 * 
	 * @version v1.0.0
	 * @author kangzk
	 * @date Feb 17, 2012 11:28:06 AM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Feb 17, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface PAY_METHOD {

		public static final int METHOD_1 = 1;// 预付费
		public static final int METHOD_2 = 2;// 现金
		public static final int METHOD_21 = 21;// 银行托收
		public static final int METHOD_26 = 26;// 银行代扣
	}

	/**
	 * @ClassName CmLnConstants
	 * @Descriptiona 付费类型
	 * 
	 * @version v1.0.0
	 * @author kangzk
	 * @date Feb 17, 2012 11:28:06 AM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Feb 17, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface CREDIT_LEVEL {

		public static final int LEVEL_0 = 50;// 50 0级
		public static final int LEVEL_1 = 51;// 51 1级
		public static final int LEVEL_2 = 52;// 52 2级
		public static final int LEVEL_3 = 53;// 53 3级
		public static final int LEVEL_4 = 54;// 54 4级
		public static final int LEVEL_5 = 55;// 55 5级
		public static final int LEVEL_6 = 56;// 56 6级
		public static final int LEVEL_7 = 57;// 57 7级
		public static final int LEVEL_8 = 58;// 58 8级
		public static final int LEVEL_9 = 59;// 59 9级
		public static final int LEVEL_10 = 60;// 60 10级
		public static final int LEVEL_11 = 61;// 61 11级
		public static final int LEVEL_12 = 62;// 62 12级
		public static final int LEVEL_13 = 63;// 63 13级
		public static final int LEVEL_14 = 64;// 64 14级
		public static final int LEVEL_15 = 65;// 65 15级
	}

	/**
	 * @ClassName CmLnConstants
	 * @Descriptiona 策划编号
	 * 
	 * @version v1.0.0
	 * @author kangzk
	 * @date Feb 17, 2012 11:28:06 AM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Feb 17, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface CM_OFFER {

		public static final String OFFER_ID = "CM_GROUP_CUST_PLAN";// 策划编号 数据配置 SELECT * FROM base_dev.bs_static_data t
																	// WHERE t.code_type LIKE 'CM_GROUP_CUST_PLAN';
																	// --策划编号定义
	}

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmLnConstants
	 * @Description 账户信用度上发计费
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Nov 8, 2012 2:56:31 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Nov 8, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public interface acctCredit {

		/**
		 * 信用度上发业务流水号
		 */
		public static final long ACCT_CREDIT_BUSI_ID = 10000000L;

		/**
		 * 信用度上发通知表业务流水号
		 */
		public static final int ACCT_CREDIT_BUSI_CODE = 100000;
	}

	/**
	 * @ClassName CmLnConstants
	 * @Descriptiona 审核类型
	 * 
	 * @version v1.0.0
	 * @author kangzk
	 * @date Feb 17, 2012 11:28:06 AM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Feb 17, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface CM_AUDIT {

		public static final int AUDIT_TYPE_GRP_CUSTOMER = 1;// 1：集团客户
		public static final int AUDIT_TYPE_GRP_MEMBER = 2;// 2：集团成员
	}

	/**
	 * @ClassName CmLnConstants
	 * @Descriptiona 操作类型
	 * 
	 * @version v1.0.0
	 * @author kangzk
	 * @date Feb 17, 2012 11:28:06 AM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Feb 17, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface CM_OPTY_TYPE {

		public static final int ADD = 1;// 1：新增
		public static final int UPDATE = 2;// 2：修改
		public static final int DEL = 3;// 3：删除
		public static final int QUERY = 4;// 4：查询
	}

	/**   
	 * @Copyright 
	 * 
	 * @ClassName CmLnConstants
	 * @Description集团客户信息审核状态
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Aug 31, 2012 3:44:55 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Aug 31, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface AUDIT_STATUS {

		public static int STS_0 = 0;// 待审核
		public static int STS_1 = 1;// 审核成功
		public static int STS_2 = 2;// 审核失败
	}

	/**   
	 * @Copyright 
	 * 
	 * @ClassName CmLnConstants
	 * @Description查询客户经理类型
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Aug 31, 2012 3:44:55 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Aug 31, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface CM_MANAGER_TYPE {

		public static int TYPE_1 = 1;//TSM
		public static int TYPE_3 = 3;// 客户经理
		public static int STS_5 = 5;// 电话经理
	}

	/**   
	 * @Copyright 
	 * 
	 * @ClassName CmLnConstants
	 * @Description下发短信编码
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Aug 31, 2012 3:44:55 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Aug 31, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface CM_SEND_TYPE {

		public static int CODE_18000001 = 18000001;// 自定义模板
		public static int CODE_18000003 = 18000003;// 预存款信用度升级
		public static int CODE_18000004 = 18000004;// 预存款信用度降级
		public static int CODE_18000005 = 18000005;// 预存款信用度初始：
		public static int CODE_18000006 = 18000006;// 托收信用度升级：
		public static int CODE_18000007 = 18000007;// 托收信用度升级：
		public static int CODE_18000008 = 18000008;// 托收信用度降级
		public static int CODE_18000009 = 18000009;// 托收信用度降级
		public static int CODE_18000010 = 18000010;// 托收信用度初始
		public static int CODE_18000011 = 18000011;// 托收信用度初始
		public static int CODE_18000012 = 18000012;// 无欠费账单
		public static int CODE_18000013 = 18000013;// 有欠费账单
		public static int CODE_18000014 = 18000014;// 大客户生日提醒
	}

	/**   
	 * @Copyright 
	 * 
	 * @ClassName CmLnConstants
	 * @Description下发短信参数定义
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Aug 31, 2012 3:44:55 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Aug 31, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface CM_SEND_CODE {

		public static String BRAND = "BRAND";// 品牌
		public static String CREDIT_CLASS = "CREDIT_CLASS";// 等级
		public static String CREDIT_FEE = "CREDIT_FEE";// 透支额度
		public static String OLD_CREDIT_CLASS = "OLD_CREDIT_CLASS";// 老级别
		public static String NEW_CREDIT_CLASS = "NEW_CREDIT_CLASS";// 新级别
		public static String BILLID = "BILLID";// 手机号码
		public static String NAME = "USER_NAME";// 姓名
		public static String MONTH = "MONTH";// 月
		public static String DAY = "DAY";// 日
		public static String SMS_TXT = "SMS_TXT";// 自定义模板
	}

	/**   
	 * @Copyright 
	 * 
	 * @ClassName CmLnConstants
	 * @Description客户状态
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Aug 31, 2012 3:44:55 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Aug 31, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface CM_STATUS {

		// 集团客户状态
		public static int GRP_STATUS_0 = 0;// 0 在网集团客户

		public static int GRP_STATUS_1 = 1;// 1 潜在集团客户

		public static int GRP_STATUS_2 = 2;// 2 竞争对手集团客户

		// 个人客户状态 客户状态
		public static int INDIV_STATUS_1 = 1;// 1 潜在

		public static int INDIV_STATUS_2 = 2;// 2 在网

		public static int INDIV_STATUS_3 = 3;// 3 离网
	}

	/**   
	 * @Copyright 
	 * 
	 * @ClassName CmLnConstants
	 * @Description客户状态
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Aug 31, 2012 3:44:55 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Aug 31, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface CM_MEMBER_STATUS {

		public static int STATUS_3 = 3;// 普通成员

		public static int STATUS_9 = 9;// 产品管理
	}

	/**   
	 * @Copyright 
	 * 
	 * @ClassName CmLnConstants
	 * @Description集团关键人级别
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Aug 31, 2012 3:44:55 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Aug 31, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface GroupKeyPeop {

		// 1 无 2 A+ 3 A 4 B 5 C
		public static int LEVEL_1 = 0;// 无
		public static int LEVEL_2 = 10;// A+
		public static int LEVEL_3 = 20;// A
		public static int LEVEL_4 = 30;// B
		public static int LEVEL_5 = 40;// C
	}

	/**   
	 * @Copyright 
	 * 
	 * @ClassName CmLnConstants
	 * @Description集团客户级别
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Aug 31, 2012 3:44:55 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Aug 31, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface GroupLevel {

		// 0 未定级别//11 A1-高值客户//12 A2-战略客户//21 B1-示范客户//22 B2-潜力客户//30 C -规模客户//40 D级//70 I级
		public static String LEVEL_0 = "0";
		public static String LEVEL_l1 = "11";
		public static String LEVEL_l2 = "12";
		public static String LEVEL_21 = "21";
		public static String LEVEL_22 = "22";
		public static String LEVEL_30 = "30";
		public static String LEVEL_40 = "40";
		public static String LEVEL_70 = "70";

		public static int LEVEL_INT_0 = 0;
		public static int LEVEL_INT_l1 = 11;
		public static int LEVEL_INT_l2 = 12;
		public static int LEVEL_INT_21 = 21;
		public static int LEVEL_INT_22 = 22;
		public static int LEVEL_INT_30 = 30;
		public static int LEVEL_INT_40 = 40;
		public static int LEVEL_INT_70 = 70;
	}

	/**   
	 * @Copyright 
	 * 
	 * @ClassName CmLnConstants
	 * @Description客户服务等级
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Aug 31, 2012 3:44:55 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Aug 31, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface CM_SERVICE_LEVEL {

		public static int GOLD_LEVEL = 1;// 金牌级

		public static int SILVER_LEVEL = 2;// 银牌级

		public static int COPPER_LEVEL = 3;// 铜牌级

		public static int NORM_LEVEL = 4;// 标准级
	}

	/**   
	 * @ClassName CmLnConstants
	 * @Description 用户欠费状态
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Aug 31, 2012 3:44:55 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Aug 31, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface CM_ACCT_OWE_STATUS {
		// 无欠费
		// public static int USER_NO = 0;
		// 欠费
		// public static int USER_OPEN = 1;

	}

	public interface CM_LN_TRANSACTION {

		public static String CHECK_PASS = "checkPass";
		public static String MODIFY_PASS = "modifyPass";
	}

}
