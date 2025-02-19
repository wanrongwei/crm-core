	/**   
	* Copyright: Copyright (c) 2012 Asiainfo-Linkage
	* 
	* @ClassName: CmxConstants.java
	* @Description: 该类的功能描述
	*
	* @version: v1.0.0
	* @author: yandong2
	* @date: Apr 14, 2012 1:48:42 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Apr 14, 2012     yandong2           v1.0.0               修改原因
	*/
package com.asiainfo.crm.cm.common;

import com.ai.common.i18n.CrmLocaleFactory;


/**
 * @author yandong2
 *
 */
public class CmxConstants {
	/**扩展通用属性*/
	public interface Common{
		/**通用短信模板定义*/
		public static long COMMON_SMS_TEMPLATE_ID=18000001L;
	}
    
	/**集团账户：账户编号作为查询条件*/
	public static  int	CM_ACCOUNT_PAY_METHOD_ACCT_ID=1;
	/**集团账户：计费号码作为查询条件*/
	public static int	CM_ACCOUNT_PAY_METHOD_BILL_ID=2;
	/**“QY”--签约 “JY”--解约*/
	public static String PF_QY="QY";
	public static String PF_JY="JY";
	/**签约成功*/
	public static String PF_DEAL_SUCCESS="1";
	/**签约失败*/
	public static String PF_DEAL_FAIL="0";
	/**浦发银行 bankCode*/
	public static String PF_BANK_CODE="99";
	/**账户地址校验通过*/
	public static int ACCT_ADDR_CHECK_PASS_SUCCESS=1;
	/**账户地址校验不通过*/
	public static int ACCT_ADDR_CHECK_PASS_FAIL=0;
	/**业务数据记录 有效 1*/
	public static int BUSI_RECORD_VALID=1;
	/**业务数据记录 失效 0*/
	public static int BUSI_RECORD_INVALID=0;
	/**招商银行 bankCode*/
	public static String ZHAOS_BANK_CODE="50";
	/**农业银行 bankCode*/
	public static String AB_BANK_CODE="3";
	/**浦发银行  简写*/
	public static String PF_BANK_NAME_SHORT="SPDB";
	/**非浦发银行  简写*/
	public static String NON_PF_BANK_NAME_SHORT="OTHE";
	/*绑定类型：
	支付方式为信用卡代扣，BIND_TYPE
	可填写：2330001003  信用卡代扣申请
	      2330001004  信用卡担保入网
	其中 浦发银行签约的类型为2330001003  信用卡代扣申请

	支付方式为银行卡绑定充值：BIND_TYPE
	可填写：1：预付费的充值绑定
	                2：后付费的付账单绑定*/
	/**信用卡代扣申请  2330001003*/
	public static long CREDIT_CARD_APPLY= 2330001003L; 
	/** 信用卡担保入网 2330001004*/
	public static long CREDIT_CARD_DANB= 2330001004L; 
	/**申请Email帐单 */
	public static long EMAIL_BILL_APPLY=2350001003L;
	/**取消Email帐单 */
	public static long EMAIL_BILL_CANCEL=2350001004L;
	/**申请短信帐单 */
	public static long SMS_BILL_APPLY=2350001001L;
	/**取消短信帐单 */
	public static long SMS_BILL_CANCEL=2350001002L;
	/** 外地入网 2*/
	public static int SPECIAL_INNET_MODE=2;
	/**预付费的充值绑定 1*/
	public static int BANK_BIND_PREPAY=1;
	/**后付费的付账单绑定 2*/
	public static int BANK_BIND_POSTPAY=2;
	/**户籍信息 本地 1*/
	public static int BIRTH_PLACE_TYPE_IN=1;
	/**户籍信息 外地 2*/
	public static int BIRTH_PLACE_TYPE_OUT=2;
	/**信用卡鉴权以及代扣申请 用户鉴权 0*/
	public static int DEDUCT_APPLY_OPER_TYPE_0=0;
	/**信用卡鉴权以及代扣申请  信用卡代扣申请  1*/
	public static int DEDUCT_APPLY_OPER_TYPE_1=1;
	/**信用卡鉴权以及代扣申请 卡号变更  2*/
	public static int DEDUCT_APPLY_OPER_TYPE_2=2;
	
	/**银行卡类型 0 贷记卡 1 准贷记卡 2 借记卡 */
	public static int CARD_TYPE_0=0;
	public static int CARD_TYPE_2=2;
	public static int CARD_TYPE_1=1;
	
	/**用户状态 营业测定义的code_type*/
	public static String USER_STATE_CODE_TYPE="SO_USER_STATE";
	/**神州行的品牌编号串*/
	public static final  String SZX_BAND_STR="161000000015,161000000016,161000000017,161000000018,161000000019";
	/**家庭类的套餐*/
	public static final String FAMILY_OFFER_PLAN="314308051661,314308051666,314308051670,314308051674,314308051682,314308374851,314308374856,314308374880,314308374885,314308052259,314308052261,314308052263,314308052265";
	
	/**最近一次业务操作类型,0：新录入资料*/
	public static int CMX_CLUB_REC_TYPE_NEW = 0;
	/**最近一次业务操作类型,1：用户更新资料*/
	public static int CMX_CLUB_REC_TYPE_UPDATE= 1;
	
	public static final String RECORD_STATE_ALL = "ALL"; // 查询所有的记录，包括U,E

	public static final String RECORD_STATE_DEL = "E"; // 删除状态

	public static final String RECORD_STATE_USE = "U"; // 使用状态
	
	/**
	 * 
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstants
	 * @Description 集团外网成员类型
	 *
	 * @version v1.0.0
	 * @author huaiduo
	 * @date 2012-4-27 上午11:12:51
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2012-4-27     huaiduo          v1.0.0               修改原因<br>
	 */
	public interface spType{
		int CUCC = 1;
		int XLT = 2;
		int GDDH = 3;
	}
	 /**页面传递参数名称定义*/
	 public interface CommonPageParamName {
		/** 集团外网成员编号 */
		public static String OUT_MEMBER_ID = "outMemberId";
		/**账户地址校验标记*/
		public static String ACCT_ADDR_CHECK_FLAG="checkflag";
		/**电子账单定制标记*/
		public static String ACCT_ELECTRONIC_BILL_FLAG="billCustomizeType";
		/**电子账单定制 业务备注*/
		public static String ACCT_ELECTRONIC_BILL_BUSINOTE="billTypeNotes";
	}
	/**集团查询常量定义*/
	public interface GroupQuery{
		 /**集团编号作为查询条件*/
		public  long CM_GROUP_CUST_QUERY_TYPE_1=1;
		 /**订购标识号作为查询条件*/
		public  long CM_GROUP_CUST_QUERY_TYPE_2=2;
		 /**账号作为查询条件*/
		public  long CM_GROUP_CUST_QUERY_TYPE_3=3;
		 /**集团名称作为查询条件*/
		public  long CM_GROUP_CUST_QUERY_TYPE_4=4;
		 /**集团地址作为查询条件*/
		public  long CM_GROUP_CUST_QUERY_TYPE_5=5;
		 /**联系人姓名作为查询条件*/
		public  long CM_GROUP_CUST_QUERY_TYPE_6=6;
		 /**网内成员手机号码作为查询条件*/
		public  long CM_GROUP_CUST_QUERY_TYPE_7=7;
		 /**重要成员姓名作为查询条件*/
		public  long CM_GROUP_CUST_QUERY_TYPE_8=8;
		/**账务VPMN手机号码作为查询条件*/
		public  long CM_GROUP_CUST_QUERY_TYPE_9=9;
		/**集团彩铃手机号码作为查询条件*/
		public  long CM_GROUP_CUST_QUERY_TYPE_10=10;
		 /**短号VPMN手机号码作为查询条件*/
		public  long CM_GROUP_CUST_QUERY_TYPE_11=11;
		 /**移动总机-总机手机号作为查询条件*/
		public  long CM_GROUP_CUST_QUERY_TYPE_12=12;
		 /**移动总机-分机手机号作为查询条件*/
		public  long CM_GROUP_CUST_QUERY_TYPE_13=13;
		 /**集群业务－调度号作为查询条件*/
		public  long CM_GROUP_CUST_QUERY_TYPE_14=14;
		 /**集群业务－成员号作为查询条件*/
		public  long CM_GROUP_CUST_QUERY_TYPE_15=15;
		 /**手机邮箱成员号作为查询条件*/
		public  long CM_GROUP_CUST_QUERY_TYPE_16=16;
		 /**BlackBerry成员号作为查询条件*/
		public  long CM_GROUP_CUST_QUERY_TYPE_17=17;
		 /**融合通信-V网手机号码作为查询条件*/
		public  long CM_GROUP_CUST_QUERY_TYPE_18=18;
		/**融合通信-DID号码作为查询条件*/
		public  long CM_GROUP_CUST_QUERY_TYPE_19=19;
		/**融合通信-融合总机号码作为查询条件*/
		public  long CM_GROUP_CUST_QUERY_TYPE_20=20;
		/**融合通信-特服号码作为查询条件*/
		public  long CM_GROUP_CUST_QUERY_TYPE_21=21;
		/** 1：精确查询；2：模糊查询*/
		public  int GROUP_CUST_QRY_VERACITY_1=1;
		public  int GROUP_CUST_QRY_VERACITY_2=2;
		public String CM_GROUP_CUST_QUERY_TYPE="CM_GROUP_CUST_QUERY_TYPE";
	}
	
	/**特殊名单常量定义*/
	public interface SpecialList{
		/**证件黑名单*/
		public int CM_CFG_SPEC_LIST_TYPE_TYPE_ID_1=1;
		/**满意度调查灰名单*/
		public int CM_CFG_SPEC_LIST_TYPE_TYPE_ID_2=2;
		/**黑白名单*/
		public int CM_CFG_SPEC_LIST_TYPE_TYPE_ID_3=3;
		/**灰名单*/
		public int CM_CFG_SPEC_LIST_TYPE_TYPE_ID_4=4;
		/**客服黑名单*/
		public int CM_CFG_SPEC_LIST_TYPE_TYPE_ID_5=5;
		/**高频次投诉客户*/
		public int CM_CFG_SPEC_LIST_TYPE_TYPE_ID_6=6;
		/**蓝黄黑名单*/
		public int CM_CFG_SPEC_LIST_TYPE_TYPE_ID_7=7;
		/**重要客户*/
		public int CM_CFG_SPEC_LIST_TYPE_TYPE_ID_9=9;
		/**证件黑名单*/
		public int CM_CFG_SPEC_LIST_TYPE_TYPE_ID_11=11;
		/**满意度调查灰名单*/
		public int CM_CFG_SPEC_LIST_TYPE_TYPE_ID_21=21;
		/**黑名单*/
		public int CM_CFG_SPEC_LIST_TYPE_TYPE_ID_31=31;
		/**白名单*/
		public int CM_CFG_SPEC_LIST_TYPE_TYPE_ID_32=32;
		/**灰名单*/
		public int CM_CFG_SPEC_LIST_TYPE_TYPE_ID_41=41;
		/**黑名单*/
		public int CM_CFG_SPEC_LIST_TYPE_TYPE_ID_51=51;
		/**高频次投诉客户*/
		public int CM_CFG_SPEC_LIST_TYPE_TYPE_ID_61=61;
		/**黄名单用户*/
		public int CM_CFG_SPEC_LIST_TYPE_TYPE_ID_71=71;
		/**蓝名单用户*/
		public int CM_CFG_SPEC_LIST_TYPE_TYPE_ID_72=72;
		/**重要客户*/
		public int CM_CFG_SPEC_LIST_TYPE_TYPE_ID_91=91;
	}
	
	/**统一视图，经分查询相关*/
	public interface Aiview{
		/**统一视图图表路径*/
		public final static String AIVIEW_CHART_PATH = "/sh/cm/customer/individual/";
		/**多月话费图表*/
		public final static String AIVIEW_MULTI_CHART = "multiChart.png";
		/**单月话费图表*/
		public final static String AIVIEW_SINGLE_CHART = "singleChart.png";
	}
	
	/** 客户来源 */
	public interface ActivateChannelType{
		/**正常用户*/
		public final static int NORMAL_SELL = 1;
		/**零售末梢*/
		public final static int RETAIL_SELL = 2;
		/**电子商务中心*/
		public final static int ELECTRON_SELL = 3;
		/**热线直销*/
		public final static int HOT_SELL = 4;
		/**其他直销渠道*/
		public final static int OTHER_SELL = 5;
	}
	public interface Club{
		/**
		 * 未发卡原因
		 */
		/**
		 * 不符合制卡条件
		 */
		public final static String NOT_ACCORD_CONDITION="110061";
		/**
		 * 无法联系
		 */
		public final static String CAN_NOT_CONTACT="110062";
		/**
		 * 客户拒绝
		 */
		public final static String CUSTOMER_REFUSE="110063";
		/**
		 * 其他
		 */
		public final static String OTHER_REASON="110064";
		/**
		 * 自动失效
		 */
		public final static String AUTO_EXPIRE="110065";
		
		/**VIP就医直通车卡状态*/
		public final static int VIP_DOCTOR_CARD_PRE  = 0;//初始
		public final static int VIP_DOCTOR_CARD_USED = 1;//已分配
	}
	/**
	 * 
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmxConstants
	 * @Description 客户默认语言类型
	 *
	 * @version v1.0.0
	 * @author huaiduo
	 * @date 2012-5-24 下午2:17:56
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2012-5-24     huaiduo           v1.0.0               修改原因<br>
	 */
	public interface CustLanguageType{
		/**客户默认语言*/
		public final static int CUSTOMER_LANGUAGE = 1;
		/**用户默认语言*/
		public final static int USER_LANGUAGE = 2;
	}
	
	/**   
	 * 大客户扩展信息
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmxConstants
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-5-28 上午11:13:27
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2012-5-28     zhangyin          v1.0.0               修改原因<br>
	 */
	public interface ClubMemberExtType{
		/**手机费用报销方式：全额报销*/
		public final static int ALL_PAY = 1;
		/**手机费用报销方式：定额报销*/
		public final static int PARTY_PAY = 2;
		/**手机费用报销方式：通信补贴*/
		public final static int COMM_SUBSIDY = 3;
		/**手机费用报销方式：个人承担*/
		public final static int INDIV_PAY = 4;
		
		/**婚姻状况：已婚*/
		public final static int MARRY = 1;
		/**婚姻状况：未婚*/
		public final static int UNMARRY = 2;
		
		/**子女情况：无*/
		public final static int NOCHILD = 1;
		/**子女情况：儿子*/
		public final static int SON = 2;
		/**子女情况：女儿*/
		public final static int DAUGHTER = 3;
		/**子女情况：儿子和女儿*/
		public final static int SON_AND_AUGHTER = 4;
	}
	
	public interface FivePlusTwoType{
		/**5+2规则：预登记后付费*/
		public final static String READY_POSTPAY = "10";
		/**5+2规则：预登记预付费*/
		public final static String READY_PREPAY = "11";
		/**5+2规则：实名制后付费*/
		public final static String REAL_POSTPAY = "20";
		/**5+2规则：实名制预付费*/
		public final static String REAL_PREPAY = "21";
	}
	
	/**
	 * 集团联系人
	 */
	public interface GroupContactType{
		/**主要联系人*/
		public final static int MAIN_CONTACT = 1;
		/**非主要联系人*/
		public final static int NOT_MAIN_CONTACT = 2;
		
	}
	
	/**
	 * 相关策划
	 */
	public interface UserOffer{
		/**神州行爱心卡(AD版)*/
		public final static long SZXAXKADB = 340000000936L;
		
		/** GPRS_WAP(20元套餐)*/
		public final static long GPRS_WAP  = 350353001080L;
		
		/**新入网购机优惠活动（代理） 12月[终端活动]607[活动编号]新入网购机优惠活动（代理）0[月租费]12[月数]0[补贴][存款][计划名称]*/
		public final static long XRWGJYHHDDL12607 = 321004271001L;

		/**新入网购机优惠活动（自营） 12月[终端活动]606[活动编号]新入网购机优惠活动（自营）0[月租费]12[月数]0[补贴][存款][计划名称]*/
		public final static long XRWGJYHHDZY12606 = 321004270001L;

		/**G3无线上网套餐终端捆绑80元档18月-零首付[终端活动]187[活动编号]零首付80[月租费]18[月数]80000[补贴][存款][计划名称]*/
		public final static long G3WXSWTCZDKB80YD18YLSF187= 321000821001L;
		
		/**BlackBerry业务资费折扣营销活动398元-零首付[终端活动]330[活动编号]零首付199[月租费]12[月数]0[补贴][存款][计划名称]*/
		public final static long BlackBerryYWZFZKYXHD398YLSF330= 321002322300L;
		
		/**农信机捆绑活动[终端活动]170[活动编号]零首付0[月租费]24[月数]99999[补贴][存款]农信通30元套餐[计划名称]*/
		public final static long NXJKBHD170LSF02499999= 321000715100L;
		
	}
	/**
	 * 基础数据定义
	 */
	public interface CommonData{
		public static final String CITY_ID_SH="30000210";
		public static final String REGION_NAME_SH=CrmLocaleFactory.getResource("CMS0030163");//上海市
	}
	
	/**
	 * 
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CmxConstants
	 * @Description 渠道分类定义
	 *
	 * @version v1.0.0
	 * @author huaiduo
	 * @date 2012-6-14 下午5:06:03
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2012-6-14     huaiduo           v1.0.0               修改原因<br>
	 */
	public interface ChannelType{
		public static final String KEFU_CHANNEL = "20010";
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
	 * Modification History: Date Author Version Description
	 * ---------------------------------------------------------* Mar 7, 2011
	 * huzq2 v1.0.0 修改原因
	 */
	public interface AccountConstants {
		/** 支付方式:移动充值 */
		public static final int PAY_METHOD_CMCC_CHARGE = 1;

		/** 支付方式:信用卡 */
		public static final int PAY_METHOD_CREDIT_CARD = 5;

		/** 支付方式:托收 */
		public static final int PAY_METHOD_COLLECTION = 6;

		/** 支付方式:一户通 */
		public static final int PAY_METHOD_ONE_PASS = 9;

		/** 支付方式:铁通收费 */
		public static final int PAY_METHOD_CRNET_CHARGE = 10;

		/** 支付方式:公免 */
		public static final int PAY_METHOD_EXEMPTION = 8;

		/** 支付方式:专用卡（预付） */
		public static final int PAY_METHOD_SPECIAL_CARD = 2;

		/** 支付方式:储蓄卡 */
		public static final int PAY_METHOD_GELDKARTE = 3;

		/** 支付方式:信用卡（日控） */
		public static final int PAY_METHOD_CREDIT_CARD_DAILY = 4;

		/** 支付方式:现金 */
		public static final int PAY_METHOD_CASH = 0;

		/**
		 * 预付费
		 */
		public static final int PAY_METHOD_PREPAY = 7;

		/** 账户状态:预销 */
		public static final int ACCOUNT_STATUS_PRE_CANCEL = 2;

		/** 账户状态:注销 */
		public static final int ACCOUNT_STATUS_CANCEL = 3;

		/** 账户状态:正常 */
		public static final int ACCOUNT_STATUS_NORMAL = 1;

		/** 账户类型:预付费账户 */
		public static final int ACCOUNT_TYPE_PREPAY = 1;

		/** 账户类型:后付费帐户 */
		public static final int ACCOUNT_TYPE_POSTPAY = 2;

		/** 账户类型:公免帐户 */
		public static final int ACCOUNT_TYPE_EXEMPTION = 3;

		/** 账户类型:铁通收费账户 */
		public static final int ACCOUNT_TYPE_CRNET_CHARGE = 4;

		/** 免催免停标志:催停 */
		//public static final int URGE_STOP_FLAG_URGE_STOP = 00;

		/** 免催免停标志:可摧免停 */
		//public static final int URGE_STOP_FLAG_URGE_NONSTOP = 01;

		/** 免催免停标志:免催可停 */
		public static final int URGE_STOP_FLAG_NONURGE_STOP = 10;

		/** 免催免停标志:免催免停 */
		public static final int URGE_STOP_FLAG_NONURGE_NONSTOP = 11;

		/** 自有帐户 */
		public static final int SELF_ACCT = 1;

		/** 关联帐户 */
		public static final int REAL_ACCT = 2;

		/** 是集团预付费 */
		public static final int PRE_PAY = 1;

		/** 不是集团预付费 */
		public static final int NOT_PRE_PAY = 0;

		/** 是E管家 */
		public static final int E_MANAGER = 1;

		/** 不是是E管家 */
		public static final int NOT_E_MANAGER = 0;

		/** 按帐户编号 */
		public static final int SEARCH_TYPE_ACCTID = 1;

		/** 手机号码 */
		public static final int SEARCH_TYPE_BILLID = 2;

		/** 银行帐号 */
		public static final int SEARCH_TYPE_BANKID = 3;

		/** 默认帐户 */
		public static final int ACCOUNT_TYPE_DEFAULT = 1;

		/** 需要填写帐户编号的支付方式 */
		public static final String NEED_BANK_ACCOUNT = "2,3,4,5,6,9";

		/** 新开户的支付方式 */
		public static final String PAY_METHOD_IN_OPEN = "1,5,6,9";

		/** 新开户的支付方式 */
		public static final String PAY_METHOD_NEED_BANK = "2,3,4,5,6,9";

		public static final String SEQ_CONTRACT_NO = "CM_ACCT_CONTRACT_NO";
	}
	
	/**
	 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
	 * 
	 * 证件类型常量定义 <table>
	 * <tr>
	 * <td>1</td>
	 * <td>居民身份证</td>
	 * </tr>
	 * <tr>
	 * <td>2</td>
	 * <td>护照</td>
	 * </tr>
	 * <tr>
	 * <td>3</td>
	 * <td>军官证</td>
	 * </tr>
	 * <tr>
	 * <td>4</td>
	 * <td>武装警察身份证</td>
	 * </tr>
	 * <tr>
	 * <td>5</td>
	 * <td>港澳居民往来内地通行证</td>
	 * </tr>
	 * <tr>
	 * <td>6</td>
	 * <td>台湾居民往来大陆通行证</td>
	 * </tr>
	 * <tr>
	 * <td>7</td>
	 * <td>户口薄（未满16周岁客户）</td>
	 * </tr>
	 * <tr>
	 * <td>8</td>
	 * <td>文职官员证</td>
	 * </tr>
	 * <tr>
	 * <td>9</td>
	 * <td>士兵证</td>
	 * </tr>
	 * <tr>
	 * <td>10</td>
	 * <td>人民警察证</td>
	 * </tr>
	 * <tr>
	 * <td>11</td>
	 * <td>营业执照</td>
	 * </tr>
	 * <tr>
	 * <td>99</td>
	 * <td>其他证件</td>
	 * </tr>
	 * </table>
	 * 
	 * @ClassName: CmConstants.java
	 * @Description:
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Mar 8, 2011 11:59:45 AM
	 * 
	 * Modification History: Date Author Version Description
	 * ---------------------------------------------------------* Mar 8, 2011
	 * huzq2 v1.0.0 修改原因
	 */
	public interface CertificateType {
		/**
		 * 1 身份证
		 */
		public static final int IDENTITY_CARD = 1;

		/**
		 * 2 护照
		 */
		public static final int PASSPORT = 2;

		/** 3 军官证 */
		public static final int MILITARY_ID = 3;

		/**
		 * 4 武装警察身份证
		 */
		public static final int ARMED_POLICE_IDCARD = 4;

		/**
		 * 5 港澳居民往来内地通行证
		 */
		public static final int HK_MACAO_PASSPORT = 5;

		/**
		 * 6 台湾居民往来大陆通行证
		 */
		public static final int TAIWAN_PASSPORT = 6;

		/**
		 * 7 户口薄（未满16周岁客户）
		 */
		public static final int RESIDENCE_BOOKLET = 7;

		/**
		 * 8 文职官员证
		 */
		public static final int CIVILIAN_OFFICIALS_CARD = 8;

		/**
		 * 9 士兵证
		 */
		public static final int SOLDIERS_CERTIFICATES = 9;

		/**
		 * 10 人民警察证
		 */
		public static final int POLICE_CARD = 10;

		/**
		 * 11 营业执照
		 */
		public static final int BUSINESS_LICENSE = 11;

		/**
		 * 99 其他证件
		 */
		public static final int OTHER_CERTIFICATE = 99;

		public static final String CODE_TYPE_CERT_TYPE = "CM_CUST_CERT_TYPE";
	}
	
	/**
	 * 
	 * @Description: 集团客户相关的静态数据
	 * 
	 * 
	 * @version: v1.0.0
	 * @author: shitian
	 * @date: Jul 6, 2011 8:42:26 PM
	 * 
	 * Modification History: Date Author Version Description
	 * ------------------------------------------------------------------- Jul
	 * 6, 2011 shitian v1.0.0 修改原因
	 */
	public interface GroupCustStaticData {
		/**
		 * A+类客户
		 */
		int CUST_LEVEL_A = 0;

		/**
		 * 机关
		 */
		String GRGAN_TYPE_1 = "1.1";
	}
}
