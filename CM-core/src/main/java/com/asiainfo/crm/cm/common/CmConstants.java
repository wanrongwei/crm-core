package com.asiainfo.crm.cm.common;

import com.ai.bce.util.BceUtil;
import com.ai.common.i18n.CrmLocaleFactory;

/**
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 *
 * @ClassName: CmConstants.java
 * @Description: 客户管理域枚举值定义
 * @version: v1.0.0
 * @author: huzq2
 * @date: Mar 17, 2011 4:00:29 PM
 * <p/>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * Mar 17, 2011		huzq2           v1.0.0               修改原因
 */
public class CmConstants {

	public static final String ACTION_RETURN_SUCCESS = "SUCCESS";// action中的方法执行成功

	/**
	 * 基础数据定义
	 */
	public interface CommonData {

		/**通用短信模板定义*/
		public static long COMMON_SMS_TEMPLATE_ID = 18000001L;
	}

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-9 上午10:22:39
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2012-4-9     huzq2           v1.0.0               修改原因<br>
	 */
	public interface AccountType {

		/**账户类型:预付费账户*/
		public static final int PREPAY = 1;

		/**账户类型:后付费帐户*/
		public static final int POSTPAY = 0;
	}

	/**   
	 * 账户的支付方式定义
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-11 下午3:22:26
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2012-4-11     huzq2           v1.0.0               修改原因<br>
	 */
	public interface AccountPayMethod {

		/**支付方式:预付费*/
		public static final int PREPAY = 1;

		/**支付方式:现金*/
		public static final int CASH = 2;

		/**支付方式:信用卡代扣*/
		public static final int CREDIT_CARD = 3;

		/**支付方式:银行托收*/
		public static final int BANK_COLLECTION = 21;

		/**支付方式:邮政代扣,银行代扣*/
		public static final int POSTAL_COLLECTION = 26;

		// 新的分期账户Payment Method – BankFinance
		public static final int BANKFINANCE = 40;

		/**支付方式:银行卡绑定充值
		public static final int BANK_BIND = 5;
		*/

		/**支付方式:手机支付自动交话费
		public static final int MOBILE_PAY = 6;
		*/

		/**支付账户类型：银行账户**/
		public static final int ACCT_PAYMENT_BANK = 1;

		/**支付账户类型：非银行账户**/
		public static final int ACCT_PAYMENT_NOT_BANK = 0;
	}

	/**   
	 * 
	 * 账户状态
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-13 上午12:15:43
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2012-4-13     huzq2           v1.0.0               修改原因<br>
	 */

	public interface AccountStatus {

		/**账户状态:催缴停机 */
		public static final int DUNING = 2;

		/**账户状态:预销户 */
		public static final int PRE_TERM = 3;

		/**账户状态:正常*/
		public static final int NORMAL = 1;

		/**账户状态:账户已不出账 */
		public static final int INACTIVE = 4;

		/**账户状态:未缴清 */
		public static final int CA_FLAG = 5;

		/**账户状态:呆坏账  */
		public static final int WIRITEOFF_FLAG = 6;
	}

	/**   
	 * 免催免停标志
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-13 上午12:24:07
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2012-4-13     huzq2           v1.0.0               修改原因<br>
	 */
	public interface AccountUrgeStopFlag {

		/**免催免停标志:催停*/
		public static final String URGE_STOP_FLAG_URGE_STOP = "00";

		/**免催免停标志:可摧免停*/
		public static final String URGE_STOP_FLAG_URGE_NONSTOP = "01";

		/**免催免停标志:免催可停*/
		public static final String URGE_STOP_FLAG_NONURGE_STOP = "10";

		/**免催免停标志:免催免停*/
		public static final String URGE_STOP_FLAG_NONURGE_NONSTOP = "11";
	}

	/**   
	 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
	 * 
	 * @ClassName: CmConstants.java
	 * @Description: 账户相关的常量定义
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Mar 7, 2011 5:07:14 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 7, 2011		huzq2           v1.0.0               修改原因
	 */
	public interface AccountConstants {

		/**账户类型:预付费账户*/
		public static final int ACCOUNT_TYPE_PREPAY = AccountType.PREPAY;

		/**账户类型:后付费帐户*/
		public static final int ACCOUNT_TYPE_POSTPAY = AccountType.POSTPAY;

		/**自有帐户*/
		public static final int SELF_ACCT = 1;

		/**关联帐户*/
		public static final int REAL_ACCT = 2;

		public static final String SEQ_CONTRACT_NO = "CM_ACCT_CONTRACT_NO";

		/**账户与银行的合同编号前缀*/
		public static final String ACCT_BANK_RELATION_PREFIX = "29001321492370050803000000000";

		public static final int PAY_METHOD_COLLECTION = 21;	// 托收
		public static final int PAY_METHOD_CASH = 2;	// 现金
	}

	/**
	 * 
	 * 帐单定制
	 * @author shitian
	 * @version 1.0, Mar 22, 2011
	 */
	public interface BillCutomize {

		/**
		 * 帐单格式
		 */
		public static final String BILL_FORMAT = "CM_ACCT_BILL_PATTERN";

		/**
		 * 帐单类型
		 */
		public static final String BILL_TYPE = "CM_CUSTOMIZE_BILL_TYPE";

		/**账单投递方式 add by  yandong2 2012-04-23 am 11:32**/
		public static final String Bill_MAIL_TYPE = "CM_BILL_CUSTOMIZE_MAIL_TYPE";
		/**账单投递方式 只邮寄发票**/
		public static final int BILL_MAIL_TYPE_1 = 1;
		/**账单投递方式 电子邮件**/
		public static final int BILL_MAIL_TYPE_2 = 2;
		/**账单投递方式 不投递**/
		public static final int BILL_MAIL_TYPE_3 = 3;
		/**账单投递方式 只邮寄账单明细**/
		public static final int BILL_MAIL_TYPE_4 = 4;
		/**账单投递方式 邮寄发票和账单明细**/
		public static final int BILL_MAIL_TYPE_5 = 5;
		/**账单投递方式 账单明细不套封**/
		public static final int BILL_MAIL_TYPE_6 = 6;
		/**账单投递方式 家庭类专用账单**/
		public static final int BILL_MAIL_TYPE_7 = 7;
		/**账单投递方式 客户自行去营业厅补单**/
		public static final int BILL_MAIL_TYPE_10 = 10;

		/**
		 * 全球通
		 */
		public static final String BILL_BRAND_EARTH = "1";

		public static final int BILL_FORMAT_2 = 2; // 标准帐单打印模板

		public static final int BILL_FORMAT_1 = 1; // 无

		public static final int BILL_TYPE_2 = 2; // EMAIL账单定制

		public static final int BILL_TYPE_1 = 1; // 短信账单定制

		public static final int BILL_TYPE_3 = 3;// 短信、EMAIL账单定制

		/**
		 * 短信帐单
		 */
		public static final int BILL_SEND_METHOD_1 = 1; // 短信帐单

		/**
		 * 彩信帐单
		 */
		public static final int BILL_SEND_METHOD_2 = 2; // 彩信帐单

		/**
		 * email帐单
		 */
		public static final int BILL_SEND_METHOD_3 = 3; // email帐单

		/**
		 * 纸质帐单
		 */
		public static final int BILL_SEND_METHOD_4 = 4; // 纸质帐单

		public static final int FIRST_CONT_METHOD_1 = 1; // 移动电话

		public static final int FIRST_CONT_METHOD_2 = 2; // 固定电话

		public static final int FIRST_CONT_METHOD_3 = 3; // 传真

		public static final int FIRST_CONT_METHOD_4 = 4; // email

		public static final int BILL_OPER_NAME_1 = 1; // 批量修改帐单寄送地址，新增

		public static final int BILL_OPER_NAME_2 = 2; // 批量修改帐单寄送地址，修改

		public static final int BILL_OPER_NAME_3 = 3; // 批量修改帐单寄送地址，删除

	}

	/**
	 * 账户账期
	 */
	public interface BillCycle {

		/**
		 * 出账日
		 */
		public static final String BILL_DAY = "CM_ACCOUNT_BILL_DAY";

	}

	/**   
	 * @Copyright Copyright (c) 2011 Asiainfo-Linkage
	 * 
	 * @ClassName RecordState
	 * @Description 记录状态枚举值定义。
	 * 具体的静态数据维护将base.bs_static_data表。code_type='CM_STATE';
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-14 上午10:56:54
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 * ---------------------------------------------------------*
	 * 2011-12-14     huzq2           v1.0.0               修改原因
	 */
	public interface RecordState {

		/**
		 * 在用
		 */
		public static final String USE = "U";

		/**
		 * 临时状态
		 */
		public static final String TEMP = "T";

		/**
		 * 失效（擦除）
		 */
		public static final String ERASE = "E";
	}

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 实名制枚举值
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-4-24 下午3:12:30
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2012-4-24     zhangyin           v1.0.0               修改原因<br>
	 */
	public interface realNameFlag {

		/**
		 *	未登记
		 */
		public static final int NOT_REAL_NAME = 0;

		/**
		 *	预登记
		 */
		public static final int READY_REAL_NAME = 1;

		/**
		 * 已登记
		 */
		public static final int ALREADY_REAL_NAME = 2;

		/**
		 *	普通实名制
		 */
		public static final int NORMAL_REAL_NAME = 3;

		/**
		 *	高级实名制
		 */
		public static final int ADVANCE_REAL_NAME = 4;

	}

	/**
	 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
	 *
	 * @ClassName: CmConstants.java
	 * @Description: 中心类型
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Mar 15, 2011 2:26:19 PM
	 * <p/>
	 * Modification History:
	 * Date         Author          Version            Description
	 * ---------------------------------------------------------*
	 * Mar 15, 2011		huzq2           v1.0.0               修改原因
	 */
	public interface CenterType {

		/**
		 * 计费号（手机号码）
		 */
		public static final String BILL_ID = "BillId";

		/**
		 * 客户编号
		 */
		public static final String CUST_ID = "CustId";

		/**
		 * 地市
		 */
		public static final String REGION_ID = "RegionId";

		/**
		 * 帐户
		 */
		public static final String ACCT_ID = "AcctId";

		/**
		 * 用户ID
		 */
		public static final String USER_ID = "UserId";

	}

	/**
	 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
	 * <p/>
	 * 具体的静态数据维护将base.bs_static_data表。code_type='CM_CERT_TYPE';
	 * 证件类型常量定义
	 *
	 * @ClassName: CmConstants.java
	 * @Description:
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Mar 8, 2011 11:59:45 AM
	 * <p/>
	 * Modification History:
	 * Date         Author          Version            Description
	 * ---------------------------------------------------------*
	 * Mar 8, 2011		huzq2           v1.0.0               修改原因
	 */
	public interface CertificateType {

		/**
		 * 0 无证件
		 */
		public static final int NO_CERTIFY = 0;

		/**
		 * 1身份证
		 */
		public static final int IDENTITY_CARD = 1;

		/**
		 * 2 护照
		 */
		public static final int PASSPORT_OLD = 2;

		/**
		 * 3 驾驶证
		 */
		public static final int DRIVE_CERTIFY = 3;

		/**
		 * 4 军官证
		 */
		public static final int OFFICER_CERTIFY = 4;

		/**
		 * 5 警官证
		 */
		public static final int POLICE_CARD = 5;

		/**
		 * 6 社会保险号
		 */
		public static final int SOCIETY_ENSURE = 6;

		/**
		 * 7 其他
		 */
		public static final int OTHER_CERTIFICATE = 7;
		/**
		 * 8 介绍信
		 */
		public static final int CPR = 8;
		/**
		 * 8 介绍信
		 */
		public static final int INTRODUCTION_LETTER = 8;

		/**
		 * 9 户口本
		 */
		public static final int RESIDENCE_BOOK = 9;

		/**
		 * 10 银行帐号
		 */
		public static final int BANK_ACCOUNT = 10;

		/**
		 * 11 集团编号
		 */
		public static final int GROUP_ID = 11;

		/**
		 * 12 临时客户
		 */
		public static final int TEMPORARY_CUST = 12;

		/**
		 * KOB编码，仅集团客户
		 */
		public static final int KOB_NUMBER = 17;

		public static final String CODE_TYPE_CERT_TYPE = "CM_CERT_TYPE";
	}

	/**
	 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
	 *
	 * @ClassName: CmConstants.java
	 * @Description: 客户管理域中的公用页面参数名称定义
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Mar 17, 2011 3:04:51 PM
	 * <p/>
	 * Modification History:
	 * Date         Author          Version            Description
	 * ---------------------------------------------------------*
	 * Mar 17, 2011		huzq2           v1.0.0               修改原因
	 */
	public interface CommonPageParamName {

		/**
		 * 联系人类型
		 */
		public static final String CONT_TYPE = "contType";

		/**
		 * 联系人类型
		 */
		public static final String CERT_TYPE = "certType";

		/**
		 * 联系人类型
		 */
		public static final String CERT_CODE = "certCode";

		/**
		 * 账户编号
		 */
		public static final String ACCT_ID = "acctId";

		/**
		 * 账户类型
		 */
		public static final String ACCT_TYPE = "acctType";

		/**
		 * 动作【一般用在使用BCE配置的页面时，同一类业务使用一个BUSIOPER_ID，通过指定动作来区分一下。】
		 */
		public static final String BCE_ACTION = "action";

		/**
		 * 业务框架编号【BCE】
		 */
		public static final String BCE_FRAME_ID = BceUtil.BCE_FRAME_ID_KEY;

		/**
		 * 手机号码
		 */
		public static final String BILL_ID = "billId";

		/**
		 * 业务操作编号【BCE】
		 */
		public static final String BUSIOPER_ID = BceUtil.BUSIOPER_ID_KEY;

		/**
		 * 中心类型
		 */
		public static final String CENTER_TYPE = "CenterType";

		/**
		 * 中心信息
		 */
		public static final String CENTER_VALUE = "CenterValue";

		/**
		 * 客户名称
		 */
		public static final String CUST_NAME = "custName";

		/**
		 * 客户类型
		 */
		public static final String CUST_TYPE = "custType";

		/**
		 * 客户编号
		 */
		public static final String CUST_ID = "custId";

		/**
		 * 地市编码
		 */
		public static final String REGION_ID = "regionId";

		/**
		 * 县市编码
		 */
		public static final String COUNTY_ID = "countyId";

		/**
		 * 用户编号
		 */
		public static final String USER_ID = "userId";

		/**
		 * 归属组织结构编号
		 */
		public static final String DEPT_ID = "deptId";

		/**
		 * 客户群编号
		 */
		public static final String CROWD_ID = "crowdId";

		/**
		 * 操作员id
		 */
		public static final String OP_ID = "opId";

		/**
		 * 联系人操作类型
		 */
		public static final String CONT_OP_TYPE = "contOpType";

		/**
		 * 参与人联系标识
		 */
		public static final String CONT_ID = "contId";

		/**
		 * 俱乐部联系标识
		 */
		public static final String CLUB_ID = "clubId";

		/**
		 * 俱乐部活动标识
		 */
		public static final String ACTION_ID = "actionId";

		/**
		 * 俱乐部会员编号
		 */
		public static final String MEMBER_ID = "memeberId";

		/**
		 * 特殊名单编号
		 */
		public static final String SPEC_LIST_ID = "specListId";

		/**
		 * 会员卡记录编号
		 */
		public static final String RECORD_ID = "recordId";

		/**
		 * 渠道类型
		 */
		public static final String CHANNEL_TYPE = "channelType";

		/**
		 * 参与人编号
		 */
		public static final String PARTY_ID = "partyId";

		/**
		 * 客户服务编号
		 */
		public static final String CUST_SERVICE_ID = "custServiceId";

		/**
		 * 账户联系人编号
		 */
		public static final String ACCT_CONT_ID = "acctContId";

		/**
		 * 支付方式
		 */
		public static final String ACCT_PAY_METHOD = "acctPayMethod";

		/**
		 * 参与人角色编号
		 */
		public static final String PARTY_ROLE_ID = "partyRoleId";

		/**
		 * 参与人类型
		 */
		public static final String PARTY_TYPE = "partyType";

		/**
		 * action返回前台处理结果成功与否的标志位
		 */
		public static final String ACTION_FALG = "FLAG";

		/**
		 * 跨中心服务标识
		 */
		public static final String CROSS_CENTER = "CrossCenter";

		/**
		 * 下拉列表显示值封装标识
		 */
		public static final String DB_LIST_BOX_WRAP_FLAG = "DB_LIST_BOX_WRAP_FLAG";

		/** 
		 * 系统时间
		 */
		public static final String SYS_DATE = "SysDate";

		/**
		 * 业务编码
		 */
		String BUSINESS_ID = "businessId";

		/**
		 * 联系人（关系）编号
		 */
		String CUST_CONT_ID = "custContId";

		/**
		 * 集团联系人类别
		 */
		String CONT_CLASS = "contClass";

		/**
		 * 集团成员编号
		 */
		String CUST_REL_ID = "custRelId";

		/**
		 * 是否查询VIP
		 */
		int IS_VIP_TRUE = 1;

		/**
		 * 是否查询VIP
		 */
		int IS_VIP_flase = 2;

		String IS_VIP = "1,2,3";
	}

	/**
	 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
	 *
	 * @ClassName: CmConstants.java
	 * @Description: 客户状态定义
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Mar 16, 2011 5:49:15 PM
	 * <p/>
	 * Modification History:
	 * Date         Author          Version            Description
	 * ---------------------------------------------------------*
	 * Mar 16, 2011		huzq2           v1.0.0               修改原因
	 */
	public interface CustomerStatus {

		/**
		 * 个人：潜在
		 */
		public static final int INDIV_POTENTIAL = 0;

		/**
		 * 个人：在网
		 */
		public static final int INDIV_ACTIVE = 1;

		/**
		 * 个人：离网
		 */
		public static final int INDIV_INACTIVE = 2;

		/**
		 * 个人：暂停
		 */
		public static final int INDIV_PAUSE = 3;

		/**
		 * 个人：销户
		 */
		public static final int INDIV_TERMINATED = 4;

		/**
		 * 集团：潜在
		 */
		public static final int GROUP_POTENTIAL = 0;

		/**
		 * 集团：在网
		 */
		public static final int GROUP_ACTIVE = 1;

		/**
		 * 集团：离网
		 */
		public static final int GROUP_INACTIVE = 2;

		/**
		 * 集团：暂停
		 */
		public static final int GROUP_PAUSE = 3;

		/**
		 * 集团：销户
		 */
		public static final int GROUP_TERMINATED = 4;

	}

	/**
	 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
	 *
	 * @ClassName: CmConstants.java
	 * @Description: 客户类型定义
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Mar 16, 2011 5:26:35 PM
	 * <p/>
	 * Modification History:
	 * Date         Author          Version            Description
	 * ---------------------------------------------------------*
	 * Mar 16, 2011		huzq2           v1.0.0               修改原因
	 */
	public interface CustomerType {

		/**
		 * 客户类型：个人客户
		 */
		public static final int INDIVIDUAL = 1;

		/**
		 * 客户类型：家庭客户
		 */
		public static final int FAMILY = 2;

		/**
		 * 客户类型：集团客户
		 */
		public static final int GROUP = 3;

		/**
		 * 客户类型：虚拟客户
		 */
		public static final int VPMN = 4;

		/**
		 * 客户类型：虚拟客户
		 */
		public static final int VIRTUAL = 4;

		/**
		 * 客户类型静态数据Code_type
		 */
		String CODE_TYPE_CUST_TYPE = "CM_CUST_TYPE";

	}

	/**
	 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
	 *
	 * @ClassName: CmConstants.java
	 * @Description: 客户特殊名单类型枚举值定义
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Mar 19, 2011 4:30:53 PM
	 * <p/>
	 * Modification History:
	 * Date         Author          Version            Description
	 * ---------------------------------------------------------*
	 * Mar 19, 2011		huzq2           v1.0.0               修改原因
	 */
	public interface CustSpecialListType {

		/**
		 * 黑名单
		 */
		public static final int BLACK_LIST = 0;

		/**
		 * 白名单
		 */
		public static final int WHITE_LIST = 1;

		/**
		 * 红名单
		 */
		public static final int RED_LIST = 2;
	}

	/**
	 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
	 *
	 * @ClassName: CmConstants.java
	 * @Description: 家庭客户成员角色
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Mar 24, 2011 8:20:39 PM
	 * <p/>
	 * Modification History:
	 * Date         Author          Version            Description
	 * ---------------------------------------------------------*
	 * Mar 24, 2011		huzq2           v1.0.0               修改原因
	 */
	public interface FamilyMemberRole {

		/**
		 * 家长
		 */
		public static final int GENEARCH = 1;

		/**
		 * 成员
		 */
		public static final int MEMBER = 2;
	}

	/**
	 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
	 *
	 * @ClassName: CmConstants.java
	 * @Description: 性别枚举值
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Mar 24, 2011 8:03:12 PM
	 * <p/>
	 * Modification History:
	 * Date         Author          Version            Description
	 * ---------------------------------------------------------*
	 * Mar 24, 2011		huzq2           v1.0.0               修改原因
	 */
	public interface GenderType {

		/**
		 * 男
		 */
		public static final int MALE = 1;

		/**
		 * 女
		 */
		public static final int FEMALE = 2;

		/**
		 * 未知
		 */
		public static final int UNKNOWN = 0;
	}

	/**
	 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
	 *
	 * @ClassName: CmConstants.java
	 * @Description: 参与人类型
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Mar 17, 2011 3:53:21 PM
	 * <p/>
	 * Modification History:
	 * Date         Author          Version            Description
	 * ---------------------------------------------------------*
	 * Mar 17, 2011		huzq2           v1.0.0               修改原因
	 */
	public interface PartyType {

		/**
		 * 个人参与人
		 */
		public static final int INDIVIDUAL = 1;

		/**
		 * 组织参与人
		 */
		public static final int ORGANIZE = 3;

	}

	/**
	 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
	 *
	 * @ClassName: CmConstants.java
	 * @Description: 开关类型的参数的常量定义
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Mar 7, 2011 5:08:38 PM
	 * <p/>
	 * Modification History:
	 * Date         Author          Version            Description
	 * ---------------------------------------------------------*
	 * Mar 7, 2011		huzq2           v1.0.0               修改原因
	 */
	public interface SWITCH {

		/**
		 * 客户历史的记录个数
		 */
		public static final int CUST_HIS_NUM = 6;
	}

	// add by huanghui 2012-07-09
	public static final String REGION_ID = "REGION_ID";

	public interface BatchOper {

		/**
		 * 一次批量处理的行数
		 */
		int BATCH_NUMS = 1000;

		/**
		 * 集团成员批量操作最大数量限制
		 */
		int GROUP_MEMBER_BATCH_NUMS = 80;
	}

	/**
	 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
	 *
	 * @ClassName: CmConstants.java
	 * @Description: 操作类型（日志）
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: 2011-6-30 下午2:12:47
	 * <p/>
	 * Modification History:
	 * Date         Author          Version            Description
	 * ---------------------------------------------------------*
	 * 2011-6-30		huzq2           v1.0.0               修改原因
	 */
	public interface BusiLogOperType {

		/**
		 * 查询
		 */
		int QUERY = 1;

		/**
		 * 添加
		 */
		int ADD = 2;

		/**
		 * 修改
		 */
		int MODIFY = 3;

		/**
		 * 删除
		 */
		int DELETE = 4;
	}

	/**   
	 * @Copyright Copyright (c) 2015 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 业务的businessId
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-2-4 下午5:00:13
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2015-2-4     shitian           v1.0.0               修改原因<br>
	 */
	public interface BusiLogId {

		/**
		 * 新增个人客户
		 */
		long INDIV_CUST_ADD = 191000000001L;
		/*
		 * 修改个人客户
		 */
		long INDIV_CUST_MODIFY = 2210001100L;
		/*
		 * 删除个人客户
		 */
		long INDIV_CUST_DELETE = 2400000003L;
		/**
		 * 客户联系媒介（包含地址和联系信息）
		 */
		long CUST_MEDIUM = 2500000001L;

		/**
		 * 客户资料查询（包含集团和个人）
		 */
		long CUST_QRY = 2500000002L;

		/**
		 * 集团部门信息维护
		 */
		long GROUP_ORG_OPER = 2500000003L;

		/**
		 * 集团部门号码分配
		 */
		long GROUP_ORG_PHONE_ASSIGN = 2510000001L;

		/**
		 * 新增集团客户
		 */
		long GROUP_CREATE = 2500000004L;

		/**
		 * 修改集团客户
		 */
		long GROUP_MODIFY = 2500000005L;

		/**
		 * 集团客户离网
		 */
		long GROUP_OFFLINE = 2500000006L;

		/**
		 * 集团客户注销
		 */
		long GROUP_DELETE = 2500000007L;

		/**
		 * 集团层级新增
		 */
		long GROUP_HIERARCHY_CREATE = 2500000008L;

		/**
		 * 集团层级拆分
		 */
		long GROUP_HIERARCHY_SPLIT = 2500000009L;

		/**
		 * 集团层级修改
		 */
		long GROUP_HIERARCHY_MODIFY = 2500000010L;

		/**
		 * 集团联系人查询
		 */
		long GROUP_CONTACT_PERSON_QRY = 2500000011L;

		/**
		 * 集团联系人新增
		 */
		long GROUP_CONTACT_PERSON_CREATE = 2500000012L;

		/**
		 * 集团联系人修改
		 */
		long GROUP_CONTACT_PERSON_MODIFY = 2500000013L;

		/**
		 * 集团联系人删除
		 */
		long GROUP_CONTACT_PERSON_DELETE = 2500000014L;

		/**
		 * 账户查询
		 */
		long BILLING_ACCT_QRY = 2510000002L;

		/**
		 * 账户信息维护
		 */
		long BILLING_ACCT_OPER = 2510000003L;

		/**
		 * 修改请求cpr工单
		 */
		long CPR_REQ_TASK = 2700000001L;
		/**
		 * cpr交互日志查询
		 */
		long CPR_LOG_QRY = 2700000002L;
		/**
		 * 集团关系信息维护
		 */
		long GRP_REL = 2700000003L;

		/**
		 * 客户偏好信息
		 */
		long CUST_PREFER = 2400000016L;
		/**
		 * 客户经理审批
		 */
		long MANAGER_APPROVAL = 2400000017L;

		/**
		 * payer
		 * 
		 */
		long PAYER = 2700000004L;

		/**
		 * 新增permission条款
		 */
		long PERMISSION_CLUASE_ADD = 2400000018L;
		/**
		 * 修改permission条款
		 */
		long PERMISSION_CLUASE_EDIT = 2400000019L;
		/**
		 * 删除permission条款
		 */
		long PERMISSION_CLUASE_DELETE = 2400000020L;
		/**
		 * 新增客户经理
		 */
		long CUST_MGR_ADD = 780000001L;

		/**
		 * 删除客户经理
		 */
		long CUST_MGR_DELETE = 780000002L;

		/**
		 * 客户经理查询
		 */
		long CUST_MGR_QRY = 780000003L;

		/**
		 * 替换主要客户经理
		 */
		long CUST_MGR_MODIFY = 780000004L;
		/**
		 * 删除使用者
		 */
		long USER_DELETE = 900015101005L;
		/**
		 * 查找使用者
		 */
		long USER_SEARCH = 900015101006L;
		/**
		 * 保存使用者
		 */
		long USER_SAVE = 900015101007L;
		/**
		 * 新增使用者
		 */
		long USER_ADD = 900015101008L;
		/**
		 * 修改使用者信息
		 */
		long USER_MODIFY = 900015101009L;
		/**
		 * 账户查询
		 */
		long ACCOUNT_QRY = 2300001400L;
		/**
		 * 集团成员操作
		 */
		long GROUP_MEMBER = 2700000005L;

	}

	/**
	 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
	 *
	 * @ClassName: CmConstants.java
	 * @Description: 查询条件的匹配方式的定义。目前已定义的有精确查询、左端匹配和两端匹配三种方式。
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: 2011-7-2 下午9:00:14
	 * <p/>
	 * Modification History:
	 * Date         Author          Version            Description
	 * ---------------------------------------------------------*
	 * 2011-7-2		huzq2           v1.0.0               修改原因
	 */
	public interface MatchType {

		/**
		 * 精确匹配(default match type)
		 */
		int EXACT_MATCH = 0;

		/**
		 * 右端匹配
		 */
		int RIGHT_MATCH = 1;

		/**
		 * 两端匹配
		 */
		int BOTH_MATCH = 2;

		/**
		 * 无查询条件的字符串匹配符
		 */
		String NO_CONDITION = "1 *= *1";

		/**
		 * 查询条件的匹配方式的属性编码
		 */
		String ATTR_CODE_MATCH_TYPE = "MATCH_TYPE";
	}

	/**
	 * 运营商名称简写
	 */
	public interface TelecomOperatorName {

		/**
		 * 中国移动通信集团
		 */
		String CMCC = "CMCC";

		/**
		 * 中国联通
		 */
		String CUCC = "CUCC";

		/**
		 * 中国电信
		 */
		String CTCC = "CTCC";
	}

	/**   
	 * @Copyright Copyright (c) 2011 Asiainfo-Linkage
	 * 
	 * @ClassName PartyRoleType
	 * @Description 参与人角色类型定义
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-13 下午2:03:02
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 * ---------------------------------------------------------*
	 * 2011-12-13     huzq2           v1.0.0               修改原因
	 */
	public interface PartyRoleType {

		/**
		 * 客户
		 */
		int CUSTOMER = 1;
		/**
		 * 使用者
		 */
		int USER = 2;
		/**
		 * 员工
		 */
		int EMPLOYEE = 3;
		/**
		 * 联系人
		 */
		int CONTACT = 4;
		/**
		 * 支付者
		 */
		int PAYER = 5;

	}

	/**   
	 * @Copyright Copyright (c) 2011 Asiainfo-Linkage
	 * 
	 * @ClassName CommonBatchType
	 * @Description  批量枚举常量
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-13 下午4:15:25
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 * ---------------------------------------------------------*
	 * 2011-12-13     huzq2           v1.0.0               修改原因
	 */
	public interface CommonBatchType {

		/**
		 * 处理成功
		 */
		public static final int BATCH_RESULT_TYPE_SUCCESS = 1;

		/**
		 * 处理失败
		 */
		public static final int BATCH_RESULT_TYPE_ERROR = 2;

	}

	/**
	 * 
	 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
	 * 
	 * @ClassName: ContOpType
	 * @Description: 联系人操作类型
	 *
	 * @version: v1.0.0
	 * @author: zhaofei3
	 * @email: zhaofei3@asiainfo-linkage.com
	 * @date: Dec 23, 2011 10:39:12 AM 
	 *
	 * Modification History:
	 * Date                  Author        Version        Description
	 * --------------------------------------------------------------
	 * Dec 23, 2011         zhaofei3       v1.0.0           修改原因
	 */
	public interface ContOpType {

		/**
		 * 个人客户联系人
		 */
		public static final int CONT_INDIV_CUST_TYPE = 1;

		/**
		 * 集团客户联系人
		 */
		public static final int CONT_GROUP_CUST_TYPE = 2;

		/**
		 * 账户联系人
		 */
		public static final int CONT_ACCT_TYPE = 3;

	}

	/**   
	 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
	 * 
	 * @ClassName: CmConstants.java
	 * @Description: 客户管理常用静态数据code type定义
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Mar 8, 2011 5:13:45 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 8, 2011		huzq2           v1.0.0               修改原因
	 */
	public interface CmStaticDataCodeType {

		/**
		 * 客户管理域静态数据编码
		 */
		public static final String CM_STATIC_DATA_CODE_TYPE = "CM_STATIC_DATA_CODE_TYPE";

		/**
		 * 账户信用等级
		 */
		public static final String ACCT_CREDIT_ID = "CM_ACCT_CREDIT_ID";

		/**
		 * 账户支付方式静态数据编码
		 */
		public static final String ACCOUNT_PAY_METHOD = "CM_ACCOUNT_PAY_METHOD";

		/**
		 * 账户状态静态数据编码
		 */
		public static final String ACCOUNT_STATUS = "CM_ACCOUNT_STATUS";

		/**
		 * 账户类型静态数据编码
		 */
		public static final String ACCOUNT_TYPE = "CM_ACCOUNT_TYPE";

		/**
		 * 证件类型静态数据编码
		 */
		public static final String CUST_CERT_TYPE = "CM_CUST_CERT_TYPE";

		/**
		 * 客户状态静态数据编码
		 */
		public static final String CUST_STATUS = "CM_CUST_STATUS";

		/**
		 * 客户类型静态数据编码
		 */
		public static final String CUST_TYPE = "CM_CUST_TYPE";

		/**
		 * 客户级别静态数据编码
		 */
		public static final String CUST_LEVEL = "CM_INDIV_CUST_LEVEL";

		/**
		 * 性别静态数据编码
		 */
		public static final String GENDER = "CM_GENDER";

		/**
		 * 企业类型静态数据编码
		 */
		public static final String GROUP_ORGAN_TYPE = "CM_GROUP_ORGAN_TYPE";

		/**
		 * 集团客户行业类别1静态数据编码
		 */
		public static final String GROUP_VOCATION1 = "CM_GROUP_VOCATION";

		/**
		 * 集团类别
		 */
		public static final String GROUP_CUST_LEVEL = "CM_GROUP_CUST_SERVICE_LEVEL";

		/**
		 * GROUP_TYPE
		 */
		public static final String GROUP_TYPE = "CM_GROUP_TYPE";

		/**
		 * 集团区域特点
		 */
		public static final String GROUP_REGION_TYPE = "CM_GROUP_REGION_TYPE";

		/**
		 * 集团状态
		 */
		public static final String GROUP_STATUS = "CM_GROUP_CUST_GROUP_STATUS";

		/**
		 * 集团区域子类型
		 */
		public static final String GROUP_SUB_REGION_TYPE = "CM_SUB_GROUP_REGION_TYPE";

		/**
		 * 个人客户所属行业静态数据编码
		 */
		public static final String INDIV_CUST_OCCUPATION = "CM_INDIV_CUST_OCCUPATION";

		/**
		 * 记录状态静态数据编码
		 */
		public static final String RECORD_STATE = "CM_STATE";

		/**
		 * 全球国家静态数据编码
		 */
		public static final String BS_COUNTRY = "BS_COUNTRY";

		/**
		 * 全国省份静态数据编码
		 */
		public static final String BS_PROVINCE = "BS_PROVINCE";

		/**
		 * 全国城市静态数据编码
		 */
		public static final String BS_CITY = "BS_CITY";

		/**
		 * 预付费支付方式
		 */
		public static final String PAY_METHOD_PRE_CODE_TYPE = "CM_ACCOUNT_TYPE_1";

		/**
		 * 后付费
		 */
		public static final String PAY_METHOD_POST_CODE_TYPE = "CM_ACCOUNT_TYPE_2";

		/**
		 * 铁通收费账户
		 */
		public static final String PAY_METHOD_CRNET_CHARGE_CODE_TYPE = "CM_ACCOUNT_TYPE_4";

		/**
		 * 公免帐户
		 */
		public static final String PAY_METHOD_EXEMPTION_CODE_TYPE = "CM_ACCOUNT_TYPE_3";

		/**
		 * 客户管理对象编号生成器配置codeType
		 */
		public static final String OBJECT_ID_GENERATOR = "CM_OBJECT_ID_GENERATOR";
		/**
		 * 需要进行校验的证件类型
		 */
		public static final String CM_VALIDATE_CERT = "CM_VALIDATE_CERT_NUM";
		/**
		 * 成员级别
		 */
		String GROUP_CUST_MEMBER_LEVEL = "CM_GROUP_CUST_MEMBER_LEVEL";

		/**
		 * 其他成员类别
		 */
		String GROUP_CUST_MEMBER_APP_TYPE = "CM_GROUP_CUST_MEMBER_APP_TYPE";

		/**
		 * ESOP相关路径
		 */
		String ESOP_PATH = "CM_ESOP_PATH";

		/**
		 * YES_NO
		 */
		String YES_NO = "CM_YES_NO";

		/**
		 * 商业大客户级别
		 */
		String BUSI_CUST_LEVEL = "CM_INDIVVIP_CUST_LEVEL";

		/**
		 * VIP大客户级别
		 */
		String VIP_CUST_LEVEL = "CM_INDIV_VIP_LEVEL";

		/**
		 * 手机号码号头配置
		 */
		String CM_COMMON_BILLID_HEAD = "CM_COMMON_BILLID_HEAD";

		/**
		 * 关键信息模糊化处理时需要排除的特殊的角色编号
		 */
		String CM_BOMASK_SPEC_SEC_ROLE_ID = "CM_BOMASK_SPEC_SEC_ROLE_ID";

		/**
		 * 集团联系人类型
		 */
		String GROUP_CONTACT_TYPE = "CM_GROUP_CUST_CONT_TYPE";

		/**
		 * 个人联系人类型
		 */
		String INDIV_CONTACT_TYPE = "CM_INDIV_CUST_CONT_TYPE";

		/**
		 * 参与人类型
		 */
		String PARTY_TYPE = "CM_PARTY_TYPE";

		/**免催免停标识**/
		String CM_ACCOUNT_URGE_STOP_FLAG = "CM_ACCOUNT_URGE_STOP_FLAG";
		/** 系统开关参数**/
		String SYSTEM_SWITCH = "CM_SYSTEM_SWITCH";
		/**客户管理中账户支付方案的生效类型:1,表示下周期；0表示立即生效*/
		String ACCT_PAYMENT_VALID_TYPE_CONTROL = "CM_PAYMENT_VALID_TYPE";
		String ACCT_PAYMENT_VALID_TYPE_1 = "1";
		String ACCT_PAYMENT_VALID_TYPE_0 = "0";
		/**客户管理中账户账单投递方式生效类型：1，下周期生效；0，立即生效*/
		String ACCT_BILL_MAIL_VALID_TYPE_CONTROL = "CM_BILL_MAIL_VALID_TYPE";
		String ACCT_BILL_MAIL_VALID_TYPE_1 = "1";
		String ACCT_BILL_MAIL_VALID_TYPE_0 = "0";
		/**集团信用等级*/
		public static String GROUP_CREDIT_LEVEL_TYPE = "CM_GROUP_CREDIT_DEGREE";
		/**客户经理调配限制开关*/
		public static String CHANGE_CUSTMANAGER_SPEC = "CM_CHANGE_CUSTMANAGER_SPEC";
		public static String CHANGE_CUSTMANAGER_SPEC_0 = "0";

		/**
		 * VIP发卡属性
		 */
		String VIP_CARD_ATTR = "110100";
		/**
		 * 未发卡原因
		 */
		String VIP_CARD_FAIL_TYPE = "110060";

		/**
		 * 客户管理域静态数据编码
		 */
		public static final String CM_ENCODE_FIELDS = "CM_ENCODE_FIELDS";

		/**
		 * 个人修改页面不可编辑字段静态数据编码
		 */
		public static final String CM_UNEDIT_CODE = "CM_UNEDIT_CODE";

		/**
		 * 集成billing账户页面url
		 */
		public static final String CM_BILLING_ACCT_URL = "CM_BILLING_ACCT_URL";
		/**
		 * user界面不可编辑字段
		 */
		public static final String CM_UNEDIT_CODE_FOR_USER = "CM_UNEDIT_CODE_FOR_USER";
	}

	/**   
	 * 静态数据特殊的枚举值
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-22 下午10:48:31
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2012-4-22     huzq2           v1.0.0               修改原因<br>
	 */
	public interface CmStaticDataCodeValue {

		/**
		 * 验证参与人的唯一性
		 */
		String VALIDATE_UNIQUE_PARTY = "VALIDATE_UNIQUE_PARTY";

	}

	/**   
	 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
	 * 
	 * @ClassName: CmConstants.java
	 * @Description: 客户管理常用静态数据组织是否含有节点定义
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Mar 8, 2011 5:13:45 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 8, 2011		huzq2           v1.0.0               修改原因
	 */
	public interface Leaf {

		/**
		 * 含有节点信息
		 */
		public static final int HAS_LEAF = 1;

		/**
		 * 不含有节点
		 */
		public static final int HAS_NOT_LEAF = 0;

	}

	/**
	 * 客户与客户经理
	 */
	public interface ObjectKey {

		// 客户化账单key
		public static final String BILL_CUSTOMIZE_KEY = "BillCustomizeKey";
		// 客户经理类型，区分集团客户经理和个人客户经理
		public static final int MANAGER_TYPE_INDIV = 1;
		// 客户经理类型，区分集团客户经理和个人客户经理
		public static final int MANAGER_TYPE_GROUP = 2;
		// 客户经理类型，区分集团客户经理和个人客户经理
		public static final String MANAGER_TYPE_KEY = "managerTypeKey";
		// 客户经理key
		public static final String MANAGER_KEY = "custManagerKey";
		// 操作类型
		public static final String MANAGER_TOPE_TYPE = "custManagerTopeType";
		// 电话经理key
		public static final String CM_USER_MANAGER_KEY = "cmUserManagerKey";
	}

	/**
	 * 大客户与电话客户经理
	 */
	public interface CmUserManager {

		// 电话经理操作类型 查询 0
		public static final int USER_MANAGER_OPER_TYPE_Q = 0;
		// 电话经理操作类型 查询与修改 1
		public static final int USER_MANAGER_OPER_TYPE_Q_AND_M = 1;

	}

	/**
	 * VIP客户级别定义
	 */
	public interface CmIndivVipLevel {

		/**
		 * 无级别
		 */
		public static final String NO_LEVEL = "0";

		/**
		 * 钻卡
		 */
		public static final String DIAMOND_LEVEL = "1";

		/**
		 * 金卡
		 */
		public static final String GOLDEN_LEVEL = "2";

		/**
		 * 银卡
		 */
		public static final String SILVER_LEVEL = "3";

		/**
		 * 白玉兰卡
		 */
		public static final String WHITE_YULAN_LEVEL = "7";

		/**
		 * 贵宾卡
		 */
		public static final String HONOURED_GUEST_LEVEL = "4";
		/**
		 * 重要客户
		 */
		public static final String IMPORTANT_CUST_LEVEL = "5";
		/**
		 * FORMVIP
		 */
		public static final String FORMVIP_LEVEL = "6";
		/**
		 * 其他
		 */
		public static final String OTHER_LEVEL = "8";
		/**
		 * 金牌服务套餐
		 */
		public static final String GOLDEN_SERVICE_LEVEL = "9";

		/**
		 * 非VIP客户
		 */
		public static final String NOT_VIP = "-1";
	}

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 俱乐部会员服务计算周期类型
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-16 下午2:09:22
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2012-2-16     huzq2           v1.0.0               修改原因<br>
	 */
	public interface ClubServiceCycleType {

		/**
		 * 年
		 */
		int YEAR = 1;
		/**
		 * 季度
		 */
		int QUARTER = 2;
		/**
		 * 月份
		 */
		int MONTH = 3;
		/**
		 * 星期
		 */
		int WEEK = 4;
		/**
		 * 天
		 */
		int DAY = 5;
	}

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 俱乐部会员服务来源定义
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-16 下午2:12:46
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2012-2-16     huzq2           v1.0.0               修改原因<br>
	 */
	public interface ClubServiceSource {

		/**
		 * 默认的免费服务
		 */
		int DEFAULT_FREE_SERVICE = 1;

		/**
		 * 临时调整服务
		 */
		int ADJSUT_SERVICE = 2;

		/**
		 * 收费服务
		 */
		int CHARGED_SERVICE = 3;
	}

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 俱乐部服务纬度类型定义
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-16 下午3:09:57
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2012-2-16     huzq2           v1.0.0               修改原因<br>
	 */
	public interface ClubServiceDimensionType {

		/**
		 * 会员级别
		 */
		int FREE_DIMENSION_LEVEL = 1;
		/**
		 * 信用等级
		 */
		int FREE_DIMENSION_CREDIT = 2;
		/**
		 * 地市
		 */
		int FREE_DIMENSION_REGION = 3;
		/**
		 * 用户品牌
		 */
		int FREE_DIMENSION_BRAND = 4;
		/**
		 * 用户品牌
		 */
		int FREE_DIMENSION_GLOBAL = 2;
		/**
		 * 集团贵宾卡
		 */
		int FREE_DIMENSION_GB_CARD = 3;
	}

	/**   
	 * 关联的对象类型
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-15 下午8:54:56
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2012-3-15     huzq2           v1.0.0               修改原因<br>
	 */
	public interface PsRelateObjectType {

		/**
		 * 客户
		 */
		String CUSTOMER = "CUSTOMER";

		/**
		 * 账户
		 */
		String ACCOUNT = "ACCOUNT";

		/**
		 * 参与人
		 */
		String PARTY = "PARTY";

		/**
		 * 用户
		 */
		String USER = "USER";
	}

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 日志业务类型
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-4-7 下午3:04:16
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2012-4-7     zhangyin           v1.0.0               修改原因<br>
	 */
	public interface BusiLogType {

		/**
		 * 参与人
		 */
		int PARTY_LOG = 1;

		/**
		 * 客户类
		 */
		int CUSTOMER_LOG = 2;

		/**
		 * 账户类
		 */
		int ACCOUNT_LOG = 3;

		/**
		 * 联系人类
		 */
		int CONTACT_LOG = 4;

		/**
		 * 俱乐部类
		 */
		int CLUB_LOG = 5;

		/**
		 * 客户评价类
		 */
		int CUSTOMER_EVALUATION_LOG = 6;
	}

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-21 上午10:26:27
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2012-3-21     huzq2           v1.0.0               修改原因<br>
	 */
	public interface BusiLogKeys {

		/**
		 * 业务日志创建者
		 */
		String LOG_CREATOR = "CM_BUSI_LOG_CREATOR";
	}

	/**   
	 * 公共业务编号定义
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-29 上午9:48:21
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2012-3-29     huzq2           v1.0.0               修改原因<br>
	 */
	public interface CommonBusinessId {

		/**
		 * 接口：用户状态变更通知
		 */
		long INTER_USER_STATE_CHENGE_NOTICE = 2000003000L;

		/**
		 * 接口：用户品牌变更通知
		 */
		long INTER_USER_BRAND_CHENGE_NOTICE = 2000003001L;

		long VIP_CLUB_ID = 1L;

	}

	/**
	 * VIP大客户级别定义
	 * 
	 * @author caiyu
	 *
	 */
	public interface ClubMemberLevel {

		public static final int MEMBER_LEVEL_1 = 1;// 钻石
		public static final int MEMBER_LEVEL_2 = 2;// 金
		public static final int MEMBER_LEVEL_3 = 3;// 银
		public static final int MEMBER_LEVEL_4 = 4;// 大客户
		public static final int MEMBER_LEVEL_5 = 5;// 个人贵宾卡
		public static final int MEMBER_LEVEL_6 = 6;// 集团贵宾卡
	}

	public interface Club {

		String MEMBER_LEVEL = "CM_CLUB_MEMBER_LEVEL";
		/**
		 * 接口:俱乐部类型
		 */
		/**
		 * VIP俱乐部编码
		 */
		long VIP_CLUB_ID = 1000000000;
		/**
		 * VIP俱乐部编码
		 */
		long MOBILE_CLUB_ID = 2;
		/**
		 * VIP俱乐部编码
		 */
		long GOFL_CLUB_ID = 3;
		/**
		 * 动感俱乐部编码
		 */
		long MZONE_CLUB_ID = 4;
		/**
		 * 实体倶乐 部
		 */
		int CLUB_TYPE_ENTITY = 1;

		/**
		 * 虚拟倶乐 部
		 */
		int CLUB_TYPE_VIRTUAL = 2;

		/**
		 * 机场服务
		 */
		int SERVICE_TYPE_PLANE = 1;

		/**
		 * 火车站服务
		 */
		int SERVICE_TYPE_TRAIN = 2;

		/**
		 * 就医直通车服务
		 */
		int SERVICE_TYPE_DOCTOR = 3;

		/**
		 * 全球通VIP车主俱乐部入会和续会
		 */
		int SERVICE_TYPE_CAR_OWNER = 4;

		/**
		 * 手机俱乐部默认服务
		 */
		int SERVICE_TYPE_MOBILE_DEFAULT = 0;

		/**
		 * 是大客户标识
		 */
		int INDIV_IS_VIP_YES = 1;

		/**
		 * 不是大客户
		 */
		int INDIV_IS_VIP_NO = 0;

		/**
		 * 个人大客户,是vip不是集团成员
		 */
		String INDIV_VIP_CUST_NO_GROUP_MEMBER = "1";

		/**
		 * 集团客户，是vip且为集团成员且成员的级别为空
		 */
		String VIP_CUST_GROUP_MEMBER_NO_MEMBER_LEVEL = "2";

		/**
		 * 集团大客户，是vip且为集团成员且成员的级别不为空
		 */
		String VIP_CUST_GROUP_MEMBER_HAVE_MEMBER_LEVEL = "3";

		/**
		 * 俱乐部大客户级别，在表CM_CLUB_MEMBER中
		 */
		String VIP_CLUB_MEMBER_MEMBER_LEVEL = "4";
		/**
		 * A1类成员
		 */
		int GROUP_MEMBER_LEVEL_A1 = 1;

		/**
		 * A2类成员
		 */
		int GROUP_MEMBER_LEVEL_A2 = 2;

		/**
		 * 普通类成员
		 */
		int GROUP_MEMBER_LEVEL_GENERIC = 3;

		/**
		 * 俱乐部活动业务编码
		 */
		long CLUB_ACTION_BUSINESSID = 100000000L;
	}

	public interface ClubCode {

		/**
		 * 俱乐部编码
		 */
		/**
		 * vip俱乐部
		 */
		String VIP_CLUB = "VIP_CLUB";
		/**
		 * 手机俱乐部
		 */
		String MOBILE_CLUB = "MOBILE_CLUB";
		/**
		 * 高尔夫俱乐部
		 */
		String GOLF_CLUB = "GOLF_CLUB";

		/**
		 * 动感地带音乐俱乐部会员
		 */
		String MZONE_CLUB = "MZONE_CLUB";
	}

	public interface ClubService {

		/**
		 * 俱乐部服务编码
		 */
		/**
		 *机场国际航班第一类服务
		 */
		long INTERNATIONAL_AIRPORT_SERVICE_FIRST = 1000000000L;
		/**
		 *机场国际航班第二类服务
		 */
		long INTERNATIONAL_AIRPORT_SERVICE_SECOND = 1000000005L;
		/**
		 *机场国内航班第一类服务
		 */
		long DOMESTIC_AIRPORT_SERVICE_FIRST = 1000000004L;
		/**
		 *机场国内航班第二类服务
		 */
		long DOMESTIC_AIRPORT_SERVICE_SECOND = 1000000001L;
		/**
		 *火车站第一类服务
		 */
		long RAILWAY_STATION_SERVICE_FIRST = 1000000002L;
		/**
		 *火车站第二类服务
		 */
		long RAILWAY_STATION_SERVICE_SECOND = 1000000003L;
		/**
		 * 就医直通车服务
		 */
		long VIP_DOCTOR_SERVICE = 1000000006L;
	}

	public interface ScoreConstant {

		// 积分类型枚举
		public static final String SCORE_TYPE_SCORE = "1"; // 积分
		public static final String SCORE_TYPE_POINT = "2"; // 积点

		// 接口返回key值定义
		public static final String SCORE_USABLE_BALANCE = "USABLE_BALANCE"; // 当前可用积分/积点
		public static final String SCORE_SUM_REDUCE = "SUM_REDUCE"; // 已使用的积分/积点
	}

	public interface RBossConst {

		// 用户状态
		public static final String USER_STATE_NORMAL = "1"; // 正常
		public static final String USER_STATE_PRE_OPEN = "4";// 预开户
		public static final String USER_STATE_PRE_DESTROY = "3";// 预销户
		public static final String USER_STATE_CANCEL = "99";// 注销
		public static final String USER_STATE_TK_DESTROY = "7";// 套卡销户
		public static final String USER_STATE_DESTROY = "5";// 销户
	}

	public interface ClubAction {

		/**
		 * 活动目录
		 */
		int ACTIVITY_MENU = 1;
		/**
		 * 子活动
		 */
		int SUB_ACTIVITY = 0;
	}

	public interface CustRelationShip {

		/**
		 * 接口: 客户关系类型
		 */
		/**
		 * 集团父子关系
		 */
		int CUST_REL_TYPE_GROUP_FATHER = 1;
		/**
		 * 集团客户成员关系
		 */
		int CUST_REL_TYPE_GROUP_MEMBER = 2;
		/**
		 * 家庭客户成员关系
		 */
		int CUST_REL_TYPE_FAMILY = 3;
	}

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 通用状态
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-4-16 下午4:48:14
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2012-4-16     zhangyin           v1.0.0               修改原因<br>
	 */
	public interface Status {

		/**
		 * 取消
		 */
		public static final int CANCEL = 0;

		/**
		 * 正常
		 */
		public static final int NORMAL = 1;

		/**
		 * 申请
		 */
		public static final int APPLY = 2;
	}

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 通用状态
	 *
	 * @version v1.0.0
	 * @author liaosc
	 * @date 2012-4-24 下午4:48:14
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2012-4-24     liaosc           v1.0.0               修改原因<br>
	 */
	public interface ClubServiceStaticData {

		// vip机场、火车站服务证件类型
		/**
		 * 身份证
		 */
		public static final String VIP_CARD_TYPE_00 = "00";
		/**
		 * VIP卡
		 */
		public static final String VIP_CARD_TYPE_01 = "01";

		// 机场鉴权应答编码（归属方拒绝服务理由）
		/**
		 * 鉴权成功
		 */
		public static final String REJECT_REASON_00 = "00";
		/**
		 * 客户积分不够。（返回客户资料）
		 */
		public static final String REJECT_REASON_01 = "01";
		/**
		 * 客户级别不够。（返回客户资料）
		 */
		public static final String REJECT_REASON_02 = "02";
		/**
		 * 客户密码错误。（不返回客户资料）
		 */
		public static final String REJECT_REASON_03 = "03";
		/**
		 * 客户身份证号码或vip卡号错误。（不返回客户资料）
		 */
		public static final String REJECT_REASON_04 = "04";
		/**
		 * 无此用户。（不返回客户资料）
		 */
		public static final String REJECT_REASON_05 = "05";
		/**
		 * 客户状态不正常，无法提供服务。（返回客户资料）
		 */
		public static final String REJECT_REASON_06 = "06";
		/**
		 * 集团客户，无个人身份信息，请用VIP卡号确认。（不返回客户资料）
		 */
		public static final String REJECT_REASON_07 = "07";
		/**
		 * 其它错误，由省公司自行解释。
		 */
		public static final String REJECT_REASON_99 = "99";

		/**
		 * vip机场服务记账接口 VipServiceDiscData  svcCode 06代表随员人数
		 */
		public static final String VIP_SERVICE_SVC_CODE = "06";
	}

	public interface defaultLanguage {

		/**
		 * 客户默认语言
		 */
		/**
		 * 中文
		 */
		public static final int CHINESE = 1;
		/**
		 * 英文
		 */
		public static final int ENGLISH = 2;
		/**
		 * 日语
		 */
		public static final int JAPANESE = 3;
		/**
		 * 德语
		 */
		public static final int GERMAN = 4;
		/**
		 * 法语
		 */
		public static final int FRENCH = 5;
		/**
		 * 韩语
		 */
		public static final int KOREAN = 6;

	}

	/**   
	 * 业务规则校验返回编码枚举值定义
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-5-10 下午02:56:07
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2012-5-10     zhangyin           v1.0.0               修改原因<br>
	 */
	public interface BusiRuleResultCode {

		/**
		 * 允许操作
		 */
		public static final int CODE_YES = BceUtil.JAVA_RULE_RETURN_CODE_YES;

		/**
		 * 允许但有警告
		 */
		public static final int CODE_WARNNING = BceUtil.JAVA_RULE_RETURN_CODE_WARNNING;

		/**
		 * 不允许
		 */
		public static final int CODE_NO = BceUtil.JAVA_RULE_RETURN_CODE_NO;
	}

	/**
	 * 
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 集团联系人 类型
	 *
	 * @version v1.0.0
	 * @author huaiduo
	 * @date 2012-6-4 下午7:37:08
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2012-6-4     huaiduo           v1.0.0               修改原因<br>
	 */
	public interface GroupContType {

		/**
		 * 普通联系人  1.Economic/administraton responsible
					 2.Decision maker
					 18.purchase responsible
					 19.Sales resposble
					 20.Telephony responsible
					 21.IT responsible
					 22.CEO
					 23.Owner/Co-owner
					 24.Other
		 */
		public static final int[] NORMAL_CONTACT = new int[] { 1, 18, 19, 2, 20, 21, 22, 23, 24, 25, 26, 27 };

		/**
		 * 决策人
		 */
		public static final int DECISION_CONTACT = 2;

		/**
		 * AO联系人   修改为17与数据库配置一致
		 */
		public static final int AO_CONTACT = 17;

		/**
		 * 法人
		 */
		public static final int LEGAL_CONTACT = 5;

	}

	/**   
	 * 账户的账期类型枚举值
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-13 上午11:34:33
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2012-6-13     huzq           v1.0.0               修改原因<br>
	 */
	public interface AcctBillCycleType {

		/**
		 * 年
		 */
		int YEAR = 1;
		/**
		 * 月
		 */
		int MONTH = 2;
		/**
		 * 日
		 */
		int DAY = 3;
	}

	public interface AcctBillCycleDay {

		/**
		 * 默认账期日
		 */
		int DEFAULT_DAY = 1;

	}

	/**   
	 * 客户服务编号序列名称
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-15 下午11:43:05
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2012-6-15     huzq           v1.0.0               修改原因<br>
	 */
	public interface CustServiceIdSequence {

		/**
		 * 个人客户客户服务编号序列
		 */
		public static final String CM_INDIV_CUST_SERVICE_ID = "CM_INDIV_CUST_SERVICE_ID";

		/**
		 * 家庭客户客户服务编号序列
		 */
		public static final String CM_FAMILY_CUST_SERVICE_ID = "CM_FAMILY_CUST_SERVICE_ID";

		/**
		 * 集团客户客户服务编号序列
		 */
		public static final String CM_GROUP_CUST_SERVICE_ID = "CM_GROUP_CUST_SERVICE_ID";

		/**
		 * 虚拟客户客户服务编号序列
		 */
		public static final String CM_VIRTUAL_CUST_SERVICE_ID = "CM_VIRTUAL_CUST_SERVICE_ID";
	}

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description task相关信息
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 10, 2012 3:17:29 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Oct 10, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public interface TASK_INFO {

		/**
		 * 批处理数量
		 */
		public static final int BATCH_SIZE = 1000;
	}

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 页面相关信息
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Oct 10, 2012 3:17:29 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Oct 10, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface CONT_TYPE {

		public static final int CONT_TYPE_1 = 1;// 第一联系人

		public static final int CONT_TYPE_2 = 2;// 决策人

		public static final int CONT_TYPE_3 = 3;// 副决策人

		public static final int CONT_TYPE_4 = 4;// 担保人

	}

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 付费方式
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Oct 10, 2012 3:17:29 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Oct 10, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface CmAccountPayMethod {

		public static final int CM_ACCOUNT_PAY_METHOD_1 = 1;// 预付费

		public static final int CM_ACCOUNT_PAY_METHOD_2 = 2;// 现金

		public static final int CM_ACCOUNT_PAY_METHOD_21 = 21;// 银行托收

		public static final int CM_ACCOUNT_PAY_METHOD_26 = 26;// 银行代扣

		public static final int CM_ACCOUNT_PAY_METHOD_3 = 3;// 信用卡代扣
	}

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 联系人级别
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Oct 10, 2012 3:17:29 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Oct 10, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface CONT_LEVEL {

		public static final int CONT_LEVEL_1 = 1;// 主要

		public static final int CONT_LEVEL_2 = 2;// 非主要
	}

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 用户品牌
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 18, 2012 7:09:20 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Oct 18, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public interface USER_BRAND {

		/**
		 * 全球通
		 */
		public static final long USER_BRAND_GLOBAL = 161000000001L;

		public static final String USER_BRAND_GLOBAL_NAME = CrmLocaleFactory.getResource("CMS1100227");
	}

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description VIP等级评定因子
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 18, 2012 7:37:54 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Oct 18, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public interface VIP_ELEMENT_TYPE {

		/**
		 * 关键人
		 */
		public static final int VIP_ELEMENT_KEYMAN = 8;// 8 关键人
		public static final int VIP_ELEMENT_KEYMAN_1 = 1;// 1 积分评定
		public static final int VIP_ELEMENT_KEYMAN_2 = 2;// 2 地市调整
		public static final int VIP_ELEMENT_KEYMAN_3 = 3;// 3 特殊套餐
		public static final int VIP_ELEMENT_KEYMAN_4 = 4;// 4 跨区入网
		public static final int VIP_ELEMENT_KEYMAN_5 = 5;// 5 中高端评定
		public static final int VIP_ELEMENT_KEYMAN_6 = 6;// 6 前台新增大客户
		public static final int VIP_ELEMENT_KEYMAN_7 = 7;// 7 跨省改号

	}

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 账户修改的类型
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 19, 2012 11:37:44 AM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Oct 19, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public interface MODIFY_ACCT_MODEL {

		/**
		 * 账户新增
		 */
		public static final String ACCT_OPER_TYPE_NEW = "new";

		/**
		 * 账户修改
		 */
		public static final String ACCT_OPER_TYPE_MODIFY = "modify";

		/**
		 * 账户新增
		 */
		public static final long ACCT_NEW = 1000000001;

		/**
		 * 账户修改
		 */
		public static final long ACCT_MOD = 1000000002;

		/**
		 * 账户删除
		 */
		public static final long ACCT_DEL = 1000000003;

		/**
		 * 客管内部修改账户
		 */
		public static final String MODIFY_ACCT_KEY = "modifyKey";

		/**
		 * 客管内部修改账户
		 */
		public static final String INNER_MODIFY = "inner";
	}

	/**   
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 客户相关静态数据
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 22, 2012 2:36:54 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Oct 22, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public interface CUSTOMER_CONSTANTS {

		/**
		 * 集团客户默认密码
		 */
		// public static final String GROUP_DEFAULT_PASSWORD = "654321";
	}

	/**   
	 * 
	 * 
	 * @ClassName CmConstants
	 * @Description 银行交易类型
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Oct 10, 2012 3:17:29 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Oct 10, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface CM_BUSI_TYPE {

		public static final long BUSI_CODE_03 = 2330001003L;// 浦发银行签约的类型为2330001003

		public static final long BUSI_CODE_04 = 2330001004L;// 手机支付的类型为2330001004

	}

	/**   
	 * 
	 * 
	 * @ClassName CmConstants
	 * @Description 信誉度等级
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Oct 10, 2012 3:17:29 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Oct 10, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public interface CM_CREDIT_LEVEL {

		public static final long CM_CREDIT_LEVEL_50 = 50;// 0级
		public static final long CM_CREDIT_LEVEL_51 = 51;// 1级
		public static final long CM_CREDIT_LEVEL_52 = 52;// 2级
		public static final long CM_CREDIT_LEVEL_53 = 53;// 3级
		public static final long CM_CREDIT_LEVEL_54 = 54;// 4级
		public static final long CM_CREDIT_LEVEL_55 = 55;// 5级
		public static final long CM_CREDIT_LEVEL_56 = 56;// 6级
		public static final long CM_CREDIT_LEVEL_57 = 57;// 7级
		public static final long CM_CREDIT_LEVEL_58 = 58;// 8级
		public static final long CM_CREDIT_LEVEL_59 = 59;// 9级
		public static final long CM_CREDIT_LEVEL_60 = 60;// 10级
		public static final long CM_CREDIT_LEVEL_61 = 61;// 11级
		public static final long CM_CREDIT_LEVEL_62 = 62;// 12级
		public static final long CM_CREDIT_LEVEL_63 = 63;// 13级
		public static final long CM_CREDIT_LEVEL_64 = 64;// 14级
		public static final long CM_CREDIT_LEVEL_65 = 65;// 15级
	}

	public interface HisRecordType {

		public static final int INDIVIDUAL = 1;

		public static final int GROUP = 2;

		public static final int ACCOUNT = 3;

		public static final int SEGMENT = 4;

		public static final int ADDRESS = 5;

		public static final int CONTACT_MEDIUM = 6;

		public static final int PERMISSION = 7;

		public static final int INDUSTRY = 8;
		public static final int CUSTMANAGER = 9;
	}

	public interface WrapperType {

		// 转换枚举值
		public static final int LIST_DATA_SOURCE = 1;

		// 获取字段名称
		public static final int FIELD_NAME = 2;
	}

	/**   
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 纵表扩展属性
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Feb 11, 2014 9:37:07 AM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Feb 11, 2014     Administrator           v1.0.0               修改原因<br>
	 */
	public interface AttrituteAttr {

		// 集团客户细分扩展字段
		public static final String GROUP_CUST_SEGMENT = "GROUP_CUST_SEGMENT";
	}

	/**   
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 客户联系媒介关系类型
	 *
	 * @version v1.0.0
	 * @author zhuyy
	 * @date Feb 112014 9:37:07 AM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Feb 11, 2014     Administrator           v1.0.0               修改原因<br>
	 */
	public interface MediumType {

		public static final int CUST_CONT_MED_TYPE_EMAIL = 12;
	}

	/**   
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description  集团联系人类型
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 6 252014 9:37:07 AM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 6 25, 2014     Administrator           v1.0.0               修改原因<br>
	 */
	public interface CmGroupContactType {

		// 联系人
		public static final int CONTACT_PERSON = 1;
		// 决策人
		public static final int DECISION_PERSON = 2;
		// 担保人
		public static final int GUARANTOR = 4;
		// 法人
		public static final int LEGAL_OWNER = 5;
		// 集团客户自服务管理员
		public static final int ADMIN_PERSON = 20;

		// 集团OTT管理员
		public static final int OTT_MANAGER = 28;
	}

	/**
	 * 
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-6-27 上午10:15:29
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-6-27     mael           v1.0.0               修改原因<br>
	 */
	public interface RequestType {

		// 新增
		public static final int ADD = 4;
		// 删除
		public static final int DELETE = 1;

		// 上发billing操作新增
		public static final int BILLING_ADD = 1;

		// 上发billing操作刪除
		public static final int BILLING_DELETE = 3;
	}

	/**
	 * 
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-7-7 下午2:54:38
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-7-7     mael           v1.0.0               修改原因<br>
	 */
	public interface AddressId {

		// 法律地址
		public static final int legalAddress = 11;
		// 邮寄地址
		public static final int mailingAddress = 12;
		// 送货地址
		public static final int deliveryAddress = 14;
		// 农场地址
		public static final int farmAddress = 15;
		// 联系地址
		public static final int contatctAddress = 16;

		// EMAIL
		public static final int EMAIL = 21;
		// 联系电话
		public static final int CONTACT_NUMBER = 31;
		// 传真
		public static final int FAX = 32;
		// 短信
		public static final int SMS = 33;
		// 紧急联系
		public static final int EMERGENCY_NUMBER = 35;
		// 平信
		public static final int LETTER = 36;
		// 彩信
		public static final int MMS = 37;

		// 主要邮箱
		public static final int MAIN_EMAIL = 201;
		// 次要邮箱
		public static final int SECOND_EMAIL = 202;
		// 主要联系电话
		public static final int MAIN_PHONE = 301;
		// 次要联系电话
		public static final int SECOND_PHONE = 302;
		// 短信
		public static final int CONT_SMS = 303;
		
		// 短信
		public static final int CONT_LEGAL_ADDRESS = 101;
	}

	/**
	 * 
	 * @Copyright Copyright (c) 2014 Asiainfo
	 * 
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 * 组织结构
	 * @version v1.0.0
	 * @author zhuyy
	 * @date 2014-7-24 下午2:54:38
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-7-24     zhuyy           v1.0.0               修改原因<br>
	 */
	public interface CustomerOrg {

		// 子公司
		public static final int SUB_COMPANY = 0;

		// 部门
		public static final int DEPARTMENT = 1;
	}

	/**
	 * 
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-7-25 下午4:35:34
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-7-25     mael           v1.0.0               修改原因<br>
	 */
	public interface RequestStatus {

		// 待处理前的临时状态
		public static final String temporaryState = "T";
		// 待处理
		public static final String pending = "C";
		// 处理中
		public static final String processing = "P";
		// 处理完成
		public static final String dealDone = "F";
	}

	/**
	 * 
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-8-19 下午4:35:34
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-8-19     huangqun           v1.0.0               修改原因<br>
	 */
	public interface InstallmentFlag {

		// 分期
		public static final int YES = 1;
		// 不分期
		public static final int NO = 0;
		// 普通账户
		public static final int Ordinary_Account = 0;
		// 分期账户
		public static final int Installment_Account = 1;
		// 津贴账户
		public static final int Allowance_Account = 2;
		// 津贴账户
		public static final int Hardware_Account = 3;
		// New Installment account of Financing Partner
		public static final int New_Installment_Account = 16;

	}

	/**
	 * 
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 定义客管的实体类型；
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-8-25 下午4:35:34
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-8-25     huangqun           v1.0.0               修改原因<br>
	 */
	public interface EntityType {

		/**
		 * 客户
		 */
		public static final int CUSTOMER = 1;
		/**
		 * 使用者
		 */
		public static final int USER = 2;
		/**
		 * 员工
		 */
		public static final int EMPLOYEE = 3;
		/**
		 * 联系人
		 */
		public static final int CONTACT_PERSON = 4;
		
		/**
		 * payer
		 */
		public static final int PAYER = 4;
	}

	/**
	 * 
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-8-29 上午10:26:23
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-8-29     mael           v1.0.0               修改原因<br>
	 */
	public interface PersonState {

		// 移民
		public static final String emigrated = "80";
		// 死亡
		public static final String deceased = "90";
	}

	/**
	 * 
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-9-2 上午10:01:12
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-9-2     mael           v1.0.0               修改原因<br>
	 */
	public interface PreferType {

		// 偏好座席
		public static final int preferredPosition = 3;
		// 偏好营业厅
		public static final int preferredOffice = 2;
		// 偏好媒介
		public static final int preferredMedium = 1;
	}

	/**
	 * 
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-9-5 上午10:01:12
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-9-5     huangqun           v1.0.0               修改原因<br>
	 */
	public interface AksAction {

		// 订购
		public static final int SUBSCRIBE = 2;
		// 退订
		public static final int UNSUBSCRIBE = 3;
		// AKS同步成功
		public static final int AKSSUCCESS = 4;
	}

	/**
	 * 
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-9-5 上午10:01:12
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-9-5     huangqun           v1.0.0               修改原因<br>
	 */
	public interface UpdateFlag {

		// 订购
		public static final int SUBSCRIBE = 1;
		// 退订
		public static final int UNSUBSCRIBE = 2;
	}

	/**
	 * 
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-9-4 下午4:11:29
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-9-4     mael           v1.0.0               修改原因<br>
	 */
	public interface CustPreferTimeType {

		// 工作日
		public static final String workDay = "1";
		// 休息日
		public static final String offDay = "2";
		// 时段
		public static final String timeInterval = "3";
	}

	/**
	 * 
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-9-5 下午4:27:04
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-9-5     mael           v1.0.0               修改原因<br>
	 */
	public interface UseType {

		// 适用所有
		public static final int allUse = 0;
		// 客户联系媒介使用
		public static final int contactMediumUse = 1;
		// 客户偏好媒介使用
		public static final int preferMediumUse = 2;

		public static final String preferenceMedia = "PREFERENCE_MEDIA";
	}

	/**
	 * 
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-9-8 上午10:01:12
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-9-8    huangqun           v1.0.0               修改原因<br>
	 */
	public interface YesOrNo {

		// 是
		public static final int YES = 1;
		// 否
		public static final int NO = 0;
	}

	/**
	 * 
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-9-9 上午10:01:12
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-9-9    huangqun           v1.0.0               修改原因<br>
	 */
	public interface RelaType {

		// 使用者
		public static final int USER = 1;
		// 归属者
		public static final int OWNER = 2;
	}

	/**
	 * 
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-9-9 上午10:01:12
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-9-9    huangqun           v1.0.0               修改原因<br>
	 */
	public interface ContMedium {

		// 实体地址
		public static final int ENTITY_ADDR = 1;

		// 电子地址
		public static final int ELECTRON_ADDR = 2;

		// 联系电话
		public static final int CONT_NUMBER = 3;

		// 客户使用媒介
		public static final int CUSTOMER_MED_TYPE = 0;

		// 联系人使用媒介
		public static final int CONTACT_MED_TYPE = 1;

		// 偏好使用媒介
		public static final int PREFERENCE_MED_TYPE = 2;

		// 偏好使用媒介
		public static final int MAIN_EMAIL = 201;
		// 偏好使用媒介
		public static final int SECOND_EMAIL = 202;
		// 偏好使用媒介
		public static final int MAIN_CONT_NUMBER = 301;
		// 偏好使用媒介
		public static final int SECOND_CONT_NUMBER = 302;
		// 偏好使用媒介
		public static final int SMS = 303;
	}

	/**   
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 客户子类型
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-10 下午2:39:09
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-9-10     shitian           v1.0.0               修改原因<br>
	 */
	public interface CustSubType {

		// 客户
		public static final int INDIV_CUSTOMER = 1;

		// 使用者
		public static final int INDIV_USER = 2;

		// 员工
		public static final int INDIV_EMPLOYEE = 3;
	}

	/**   
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 客户子类型
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-10 下午2:39:09
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-9-10     shitian           v1.0.0               修改原因<br>
	 */
	public interface GroupType {

		// MVNO
		public static final int MVNO = 1;

		// NORMAL
		public static final int NORMAL = 2;

		// SUPPLIER
		public static final int SUPPLIER = 3;

		// PARTNER
		public static final int PARTNER = 4;

		// COMPETITOR
		public static final int COMPETITOR = 12;

		// BROKER
		public static final int BROKER = 6;

		// TELENOR_GROUP
		public static final int TELENOR_GROUP = 7;
		
		// DUMMY
		public static final int DUMMY = 9;
	}

	/**
	 * 
	 * @Copyright Copyright (c) 2014 Asiainfo
	 * 
	 * @ClassName CmConstants
	 * @Description 定义集团行业类型级别；
	 *
	 * @version v1.0.0
	 * @author zhuyy
	 * @date 2014-9-03 下午4:35:34
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-9-03     zhuyy           v1.0.0               修改原因<br>
	 */
	public interface IndustryLevel {

		/**
		 * 一级
		 */
		public static final int LEVEL_1 = 1;
		/**
		 * 二级
		 */
		public static final int LEVEL_2 = 2;
		/**
		 * 三级
		 */
		public static final int LEVEL_3 = 3;
		/**
		 * 四级
		 */
		public static final int LEVEL_4 = 4;
		/**
		 * 五级
		 */
		public static final int LEVEL_5 = 5;
	}

	/**
	 * 
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-9-10 上午9:46:35
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-9-10     mael           v1.0.0               修改原因<br>
	 */
	public interface roleType {

		// 客户
		public static final int customer = 1;
		// 使用者
		public static final int user = 2;
		// 员工
		public static final int employee = 3;
		// 联系人
		public static final int contacter = 4;
		// 支付者
		public static final int payer = 5;
	}

	/**
	 * 
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-9-9 上午10:01:12
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-9-9    huangqun           v1.0.0               修改原因<br>
	 */
	public interface Address {

		// districtId
		public static final String DISTRICTID = "1000000";
		// addressType
		public static final String ADDRESSTYPE = "CPR_ADDRESS";
	}

	/**   
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 客管后台task静态常量
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-12 下午3:34:11
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-9-12     shitian           v1.0.0               修改原因<br>
	 */
	public interface TaskStaticParam {

		// 细分计算操作
		public static final long NO_APPROVE = 1;

		// 细分计算操作
		public static final long ROOT_APPROVE = 2;

		// 细分计算操作
		public static final long ROOT_LEAF_APPROVE = 3;

		// 细分计算操作
		public static final long NO_APPROVE_INHERIT = 4;

		// 待审批
		public static final int APPROVE_STATUS_WAIT = 1;

		// 审批结束
		public static final int APPROVE_STATUS_FINISH = 2;
	}

	/**
	 * 
	 * @Copyright Copyright (c) 2014 Asiainfo
	 * 
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author zhuyy
	 * @date 2014-9-11 上午9:46:35
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-9-11     zhuyy           v1.0.0               修改原因<br>
	 */
	public interface segment {

		public static final String NO_SEGMENT = "200000000000";
		public static final String PA = "200000000001";
		public static final String KA = "200000000002";
		public static final String LA = "200000000003";
		public static final String MA = "200000000004";
		public static final String SA = "200000000005";
		public static final String NEW = "100000000001";
	}

	/**
	 * 
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-9-16 上午10:01:12
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-9-16    huangqun           v1.0.0               修改原因<br>
	 */
	public interface ApprovalStatus {

		// 待审批
		public static final int WaitForApproval = 1;
		// 审批通过
		public static final int ApprovalCompleted = 2;
	}

	/**
	 * 
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-9-16 上午10:01:12
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-9-16    huangqun           v1.0.0               修改原因<br>
	 */
	public interface PhysiologicalState {

		// 正常人
		public static final int NormalPerson = 0;
		// 眼盲人士
		public static final int BlindPerson = 1;
		// 耳聋人士
		public static final int DeafProson = 2;
		// 眼盲耳聋人士
		public static final int BlindAndDeafPerson = 3;

	}

	/**   
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 根据地址编号查询地址时候传入的规定地市编号
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-17 下午4:36:30
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-9-17     shitian           v1.0.0               修改原因<br>
	 */
	public interface AddressDistrictId {

		// districtId
		public static final String DISTRICT_ID = "012002002";

		public static final int DISTRICT_TYPE_COUNTRY = 1;
	}

	/**   
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 客户多认证
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-17 下午4:37:12
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-9-17     shitian           v1.0.0               修改原因<br>
	 */
	public interface CustIdenType {

		// FACEBOOK
		public static final int FACEBOOK = 1;

		// TWITTER
		public static final int TWITTER = 2;

		// GOOGLE
		public static final int GOOGLE = 3;
		
		// GOOGLE
		public static final int APPLE_DEPT_ID = 5;

		// CPR
		public static final int CPR = 8;

		// KOB
		public static final int KOB = 17;
		
		public static final int PRIMARY_ID_TYPE = 5;
		
		public static final int SECONDARY_ID_TYPE = 6;

	}

	/**   
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-22 上午10:35:29
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-9-22     shitian           v1.0.0               修改原因<br>
	 */
	public interface IsAssigned {

		// 分配
		public static final int ASSIGNED = 1;

		// 未分配
		public static final int NOT_ASSIGNED = 2;

	}

	/**
	 * 
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-9-23 上午10:49:44
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-9-23     mael           v1.0.0               修改原因<br>
	 */
	public interface PsResource {

		// 1:前台人工操作
		public static final int forward = 1;
		// 2:后台计算进程
		public static final int back = 2;
		// 3:前台修改
		public static final int forwardModify = 3;
	}

	/**
	 * 
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-9-23 上午10:51:16
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-9-23     mael           v1.0.0               修改原因<br>
	 */
	public interface PsType {

		// 1:细分变更
		public static final int segementChange = 1;
		// 2.客户经理变更
		public static final int custManagerChange = 2;
		// 3.KOB变更
		public static final int custKobChange = 3;
		// 4.TSM 触发
		public static final int custTSMChange = 4;
	}

	/**
	 * 
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-9-25 上午10:47:49
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-9-25     mael           v1.0.0               修改原因<br>
	 */
	public interface requestOrderStatus {

		// 准备送CPR订购
		public static final String preparedToCPR = "5";
		// 送CPR订购
		public static final String sendCPROrder = "1";
		// 订购成功
		public static final String CPROrderSuccess = "2";
		// 订购失败
		public static final String CPROrderFail = "3";
		// 退订成功
		public static final String CPROutOrder = "4";
		// 准备送CPR退订
		public static final String preparedToCPRForUnsub = "6";
		// 送cpr退订
		public static final String SendCPRUnsub = "7";
		// 退订失败
		public static final String CPRUnsubFail = "8";
		// 没有请求记录
		public static final String MissingRecord = "0";
		// 临时状态T
		public static final String Initial = "9";
		// 除了处理中的其他状态
		public static final String ExceptInProgress = "10";
		// 所有状态
		public static final String AllStatus = "-1";
	}

	/**
	 * 
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 客户经理-关系类型REL_TYPE
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author zhuyy
	 * @date 2014-9-30 上午10:47:49
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-9-30     zhuyy           v1.0.0               修改原因<br>
	 */
	public interface relType {

		// 主要服务
		public static final long REL_TYPE_MAIN = 1;
		// 辅助服务
		public static final long REL_TYPE_OTHER = 2;
		// 行业客户经理
		public static final long REL_TYPE_MANAGER = 3;
	}

	public interface PsPublicAction {

		// 1.公共信息同步。
		public static final int PUBLIC_INFO_SYS = 1;

		// 2.AKS订购
		public static final int SUBSCRIBE_AKS = 2;

		// 3.AKS退订
		public static final int UNSUBSCRIBE_AKS = 3;

		// 4.AKS同步成功
		public static final int AKS_SYS_SUCCESS = 4;

		// 5.受保护客户处理
		public static final int PROTECT_CUSTOMER = 5;

		// 6.号码隐藏
		public static final int PHONE_NUM_HIDE = 6;

		// 7.营销免打扰送外系统
		public static final int COMMERCIAL_PROTECTION = 7;

		// 8.反向同步账户状态
		public static final int UPDATE_ACCT_STATUS = 8;

		// 9.同步账户缴费期
		public static final int UPDATE_ACCT_PAYMENT = 9;

		// 10.同步账户免托收费标识
		public static final int UPDATE_ACCT_STOP_PAYMENT_FEE = 10;

		// 11.同步账户PBS,ean
		
		public static final int UPDATE_ACCT_PBS_EAN = 11;
	}

	/**
	 * 
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-10-11 上午10:47:49
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-10-11     huangqun           v1.0.0               修改原因<br>
	 */
	public interface CmInsRela {

		// 销户
		public static final int TERMINATED = 0;
		// 正常
		public static final int NORMAL = 1;
	}

	/**
	 * 
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-10-13 上午10:47:49
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-10-13     huangqun           v1.0.0               修改原因<br>
	 */
	public interface AksStatus {

		// 订购成功
		public static final String SUBSCRIPTION_SUCCESS = "1";
		// 退订成功
		public static final String UNSUBSCRIPTION_SUCCESS = "2";
		// 待处理
		//public static final String WAIT_FOR_DEAL = "3";
		// 失败
		//public static final String FAILED = "4";
		
		//订购待处理cm
		public static final String SUBSCRIPTION_PEND="3";
		//退订待处理
		public static final String UNSUBSCRIPTION_PEND="4";
		//订购失败
		public static final String SUBSCRIPTION_FAIL="5";
		//退订失败
		public static final String UNSUBSCRIPTION_FAIL="6";
	}

	/**
	 * 
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-11-05 上午10:47:49
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-11-05     huangqun           v1.0.0               修改原因<br>
	 */
	public interface upSegmentId {

		// 个人细分
		public static final int INDIV_SEGMNET = 1;
		// 集团细分
		public static final int GROUP_SEGMENT = 2;
	}

	/**
	 * 
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 用于cpr_number的权限控制
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-11-18 上午10:47:49
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-11-18     huangqun           v1.0.0               修改原因<br>
	 */
	public interface controlCprNumber {

		// entity_id
		public static final long ent_id = 30000024;
		// priv_id
		public static final long priv_id = 30000000;

	}

	public interface controlCprInfo {

		// entity_id
		public static final long ent_id = 10056516;
		// priv_id
		public static final long priv_id = 30000000;

	}

	public interface controlOperateB2B {

		// entity_id
		public static final long ent_id = 30000025;
		// priv_id
		public static final long priv_id = 30000000;

	}

	public interface controlAccount {

		// entity_id
		public static final long ent_id = 30000027;
		// priv_id
		public static final long priv_id = 30000000;
	}

	public interface controlOnlyCanViewOperator {

		// entity_id
		public static final long ent_id = 30000028;
		// priv_id
		public static final long priv_id = 30000000;
	}

	public interface controlViewAndModifyOperator {

		// entity_id
		public static final long ent_id = 30000029;
		// priv_id
		public static final long priv_id = 30000000;
	}
	

	public interface controlAksRequest {

		// entity_id  
		public static final long ent_id = 30000062;
		// priv_id
		public static final long priv_id = 30000000;
	}

	public interface controlAddressAddOperator {

		// entity_id
		public static final long ent_id = 30000030;
		// priv_id
		public static final long priv_id = 30000000;
	}
	
	public interface controlQueryALLWholeCustomer {

		// entity_id
		public static final long ent_id = 40000001;
		// priv_id
		public static final long priv_id = 40000000;
	}
	
	public interface controlAks{
		// entity_id
		public static final long ent_id = 30000031;
		// priv_id
		public static final long priv_id = 30000000;
	}

	public interface controlCloudPBXPlatform {
		// entity_id
		long ent_id = 10056316;
		// priv_id
		long priv_id = 10056316;
	}

	/**
	 * 
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 送C3的action
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-11-20 上午10:47:49
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-11-20     huangqun           v1.0.0               修改原因<br>
	 */
	public interface sendToC3Action {

		// 新增
		public static final int ADD = 1;
		// 删除
		public static final int DELETE = 2;
	}

	/**
	 * 
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description role_status
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-11-25 上午10:47:49
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-11-25     huangqun           v1.0.0               修改原因<br>
	 */
	public interface roleStatus {

		// active
		public static final int ACTIVE = 1;
		// in_active
		public static final int IN_ACTIVE = 2;
	}

	/**
	 * 
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description role_status
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-12-11 上午10:47:49
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-12-11     huangqun           v1.0.0               修改原因<br>
	 */
	public interface billingAcctLog {

		// 查询缴费记录
		public static final short PAYMENT_LOG = 4;
		// 查询充值记录
		public static final short RECHARGE_LOG = 1;
		// 查询调账记录
		public static final short ADJUST_LOG = 2;
	}

	/**
	 * 
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description orderType
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-12-15 上午10:47:49
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2014-12-15     huangqun           v1.0.0               修改原因<br>
	 */
	public interface orderType {

		// 订购聋哑人的offer
		public static final String UNORMALPERSON_OFFER = "CM_OFFERID_UNORMAL";
		// 订购phonebook的offer
		public static final String PHONEBOOK_OFFER = "CM_OFFERID_PHONEBOOK";
	}

	/**
	 * 客户经理角色定义
	 * 
	 * @author Administrator
	 * 
	 */
	public interface custMgrRole {

		public static long ACCOUNT_MANAGER = 1;// Primary
		public static long IMPLEMENTERINGS_MANAGER = 2;
		public static long KEY_ACCOUNT_SERVICE = 3;
		public static long FORETRUKNE_BUTIK = 4;
		public static long FORETRUKNE_BUTIKSKONSULENT = 5;
		public static long SOLUTION_DESIGNER_MOBIL = 6;
		public static long SOLUTION_DESIGNER_DATA = 7;
		public static long SOLUTION_DESIGNER_WAN = 8;

	}

	public interface action {

		public static long ADD = 1;
		public static long DELETE = 2;
	}

	/**
	 * 
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description commercialProtection(针对集团的营销免打扰和个人的人工营销免打扰)
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2015-03-16 上午10:47:49
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2015-03-16     huangqun           v1.0.0               修改原因<br>
	 */
	public interface commercialProtection {

		public static int YES = 0;
		public static int N0 = 1;
	}

	/**
	 * 
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 文件同步错误日志表
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2015-04-07 上午10:47:49
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2015-04-07     huangqun           v1.0.0               修改原因<br>
	 */
	public interface errFileType {

		// kob
		public static int KOB = 1;
		// cpr
		public static int CPR = 2;
		// aks
		public static int AKS = 3;
		// segment
		public static int SEGMNET = 4;
		// prospect to former
		public static int FORMER_TO_PROSPECT = 5;
		// sync segment/manager
		public static int SYNC_SEGMENT_MANAGER = 6;
		// aks订购失败
		public static int AKS_SUBSCRIBE_FAILED = 7;
		// aks退订失败
		public static int AKS_UNSUBSCRIBE_FAILED = 8;
	}

	/**
	 * 
	 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description billing侧针对cvr,cpr的numbertype的枚举值
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2015-04-26 上午10:47:49
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2015-04-26     huangqun           v1.0.0               修改原因<br>
	 */
	public interface billingNumberType {

		// cpr
		public static int BILL_CPR = 1;
		// cvr
		public static int BILL_CVR = 2;
	}

	/**   
	 * @Copyright Copyright (c) 2015 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 租户id
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-1 下午3:53:20
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2015-9-1     shitian           v1.0.0               修改原因<br>
	 */
	public interface TenantId {

		public static String TENANT_21 = "21";
		public static String TENANT_91 = "91";
		public static String TENANT_22 = "22";
	}

	/**   
	 * @Copyright Copyright (c) 2015 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description taskType
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-10 下午3:53:20
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2015-9-10     huangqun           v1.0.0               修改原因<br>
	 */
	public interface TaskType {

		public static long PRE_SUSPEND_ADDRESS = 1L;

		public static long PRE_TERMINATED_ADDRESS = 2L;

		public static long USE_TYPE = 3L;

		public static long ERASE_TYPE = 4L;

		public static int MONITORING_CYCLE = 14;
	}
	/**   
	 * @Copyright Copyright (c) 2015 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description MultThreadTaskStatus
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-10 下午3:53:20
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2015-10-27     huangqun           v1.0.0               修改原因<br>
	 */
	public interface MultThreadTaskStatus{
		//处理中
		public static int DEALING = 1;
		//处理完成
		public static int DEAL_DONE = 2;
	}
	
	/**   
	 * @Copyright Copyright (c) 2016 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 是否送cpr
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2016-7-26 下午12:02:11
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2016-7-26     shitian           v1.0.0               修改原因<br>
	 */
	public interface SendCPR{
		//送
		public static int SEND_TRUE = 1;
		
		//不送
		public static int SEND_FALSE = 2;
		
		public static String SEND_CPR_KEY = "SEND_CPR_KEY";
	}
	
	public interface controlTaxFalg {

		// entity_id
		public static final long ent_id = 30000034;
		// priv_id
		public static final long priv_id = 30000003;
	}
	
	public interface controlStopPaymentFee {
		
		// entity_id
		public static final long ent_id = 30000035;
		// priv_id
		public static final long priv_id = 30000004;
	}
	
	public interface controlModifyParty {
		
		// entity_id
		public static final long ent_id = 10054316;
		// priv_id
		public static final long priv_id = 10054316;
	}

	public interface companyStatus {
		// 正常
		String AKT = "AKT";
		// 停业或已破产
		String INA = "INA";
		// 注销
		String OPH = "OPH";
	}

	/**
	 * 匿名客户CUST_ID
	 */
	public static final long ANONYMOUS_CUST_ID = 21210088888888L;

	/**
	 * BMRT-4683层级变更新加的CI属性
	 */
	public interface kobCiAttrName {
		String KIERARCHY_CHANGE_TYPE = "KOB Hierarchy Change:";
		String OLD_PM = "Old Hierarchy PM:";
		String NEW_PM = "New Hierarchy PM:";
		String KIERARCHY_CHANGE_REASON = "Hierarchy Change Reason:";
	}

	public interface kobCiAttrValue {
		String TYPE_ADD = "Added to hierarchy";
		String TYPE_REMOVE = "Removed from hierarchy";
		String TYPE_CHANGE = "Changed to another hierarchy";

		String REASON_NEW = "New or update when AKT";
		String REASON_REVIVED = "Revived from OPH/INA";
		String REASON_CLOSED = "Closed due to OPH/INA";
	}

	public interface cprGuiType {
		String CUSTOMER_VIEW = "CUSTOMER_VIEW";
		String PARTY_VIEW_USER = "PARTY_VIEW_USER";
		String PARTY_VIEW_PAYER = "PARTY_VIEW_PAYER";
		String CHOOSE_PAYER = "CHOOSE_PAYER";
	}

	public interface cprRegisterType {
		String CPR_NUMBER = "CPR_NUMBER";
		String CPR_PROFILE = "CPR_PROFILE";
	}

	public static final String CPR_CONFIG_MATRIX = "CPR_CONFIG_MATRIX";
	public static final String EDIT_CPR_NUMBER = "EDIT_CPR_NUMBER";
	public static final String EDIT_CPR_PROFILE = "EDIT_CPR_PROFILE";
	public static final String YES = "Y";
	public static final String NO = "N";
	public static final String OTHER_ERROR = "OTHER_ERROR";
}
