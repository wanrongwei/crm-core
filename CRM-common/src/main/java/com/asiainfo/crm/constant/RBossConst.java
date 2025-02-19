package com.asiainfo.crm.constant;


import com.ai.pce.common.EffEnum;
import com.ai.pce.common.OfferTypeEnum;
import com.asiainfo.crm.util.SoConstUtil;

import java.util.HashMap;

public class RBossConst {
	/*********************BS_STATIC_DATA表中 CODE_TYPE值 静态常量**********************/
	public static String CHANNEL_TYPE = "SO_CHANNEL_TYPE";	//渠道类型
	public static final String SO_USER_STATE = "SO_USER_STATE";//用户状态
    public static final String SO_USER_TYPE = "SO_USER_TYPE";//用户类型
	public static final String SO_BRAND_TYPE = "SO_BRAND_TYPE";//品牌
	public static final String SO_ACC_DEDUCT_BOOK_LIST="SO_ACC_DEDUCT_BOOK_LIST";//预付费用抵扣对应账本ID信息
	public static final String SO_PAY_TYPE="SO_PAY_TYPE";//支付类型
	public static final String SO_YHGX_TALKLEVEL ="SO_YHGX_TALKLEVEL";//通话级别
    public static final String SO_YHGX_ACCTSTS ="SO_YHGX_ACCTSTS";//帐户状态
	public static final String SO_CHANGE_SLOT_TYPE = "CHANGE_SLOT_TYPE";
	public static final String CRM_CALL_BILLING_WEBSERVICE = "CRM_CALL_BILLING_WEBSERVICE";

	/*********************BS_PARA_DETAIL表中 PARA_TYPE值 静态常量**********************/
	public static final String ONE_CARD_MORE_NUM_LIST_PARAM ="X_0_SO_ONE_CARD_MORE_NUM";
	public static final String SO_CHANG_TERMINAL_COUNT="SO_CHANG_TERMINAL_COUNT";//每月允许换机的次数
	public static final String ELEC_PAPER_CREATE_CFG_URL = "ELEC_PAPER_CREATE_CFG_URL";//创建电子免填单地址
	public static final String ELEC_PAPER_GENERAL_CONTENT_CFG = "ELEC_PAPER_GENERAL_CONTENT_CFG";//电子免填单内容配置
	public static final String REAL_PAPER_PRINT_MARGIN_OF_DIF_REGION = "REAL_PAPER_PRINT_MARGIN_OF_DIF_REGION";//纸质免填单分地市打印控制
	public static final String ELEC_PAPER_CFG_BUSIID_2_TEMPTYPE = "ELEC_PAPER_CFG_BUSIID_2_TEMPTYPE";//CRM业务对应电子免填单模板
	public static final String ELEC_PAPER_CFG_TRAMK_2_BRAND = "ELEC_PAPER_CFG_TRAMK_2_BRAND";//CRM品牌和电子免填单品牌对应关系
	public static final String ELEC_PAPER_READ_ADUIT_CFG_URL = "ELEC_PAPER_READ_ADUIT_CFG_URL";//稽核查阅电子免填单地址
	public static final String BUSI_ID_CHECK_CONFIG = "BUSI_ID_CHECK_CONFIG";//配置能做用户业务校验的businessId
	public static final String SO_COAX_SPEED = "SO_COAX_SPEED";//报文中plugType所对应的速度

	// 改撤单权限控制
	public static final String SO_TASK_OPERATE_START_FLAG = "SO_TASK_OPERATE_";
	public static final String SO_TASK_OPERATE_NEW_CONNECTION = SO_TASK_OPERATE_START_FLAG + String.valueOf(RBossConst.BUSINESS_ID_KD_XZ);
	public static final String SO_TASK_OPERATE_TERMINATION = SO_TASK_OPERATE_START_FLAG + String.valueOf(RBossConst.BUSINESS_ID_KD_CJ);
	public static final String SO_TASK_OPERATE_RELOCATION = SO_TASK_OPERATE_START_FLAG + String.valueOf(RBossConst.BUSINESS_ID_KD_YJ);
	public static final String SO_TASK_OPERATE_CHANGE_OFFER = SO_TASK_OPERATE_START_FLAG + String.valueOf(RBossConst.BUSI_ID_OFFER_UPDATE_ENTER_BROADBAND);
	public static final String SO_TASK_OPERATE_CHANGE_VOIP_NUMBER = SO_TASK_OPERATE_START_FLAG + String.valueOf(RBossConst.BUSINESS_ID_KD_CHANGE_VOIP_NUM);
	//ord_batsingle_order表移历史   天数配置
	public static final String SO_SINGLE_ORDER_TOHIS_CONFIG_DAY = "SO_SINGLE_ORDER_TOHIS_CONFIG_DAY";
	/*********************用户资料相关 （如用户类型、状态）静态常量**********************/
	//用户状态
	public static final String USER_STATE_NORMAL="1"; //在用
	public static final String USER_STATE_ACCT_PRE_DESTROY="2";//帐务预销
	public static final String USER_STATE_SO_PRE_DESTROY="3";//营业预销
	public static final String USER_STATE_PRE_OPEN="4";//预开户
	public static final String USER_STATE_SO_DESTROY ="5";//营业销户
	public static final String USER_STATE_ACCT_DESTROY="6";//帐务销户
	public static final String USER_STATE_TK_DESTROY="7";//套卡销户
	public static final String INS_USER_STATE_INUSE = "1";
	public static final String INS_USER_STATE_PREOPER = "4";
	public static final long USER_STATE_NOR = 1L; //在用
	public static final long USER_STATE_PREOPEN = 4L;//预开
	public static final String USER_STATE_KEEP_NUM_TIME = "8" ;//保号期

	public static final String SO_PUSHC_STOCK_DELAY = "SO_MOBILE_DELAY_NOTIFICATION_001";
	public static final String SO_PUSHC_PRE_ORDER_COMFIRMATION = "SO_MOBILE_PRE_ORDER_COMFIRMATION_001";
	public static final String SO_PUSHC_NORMAL_ORDER_COMFIRMATION = "SO_MOBILE_NORMAL_ORDER_COMFIRMATION_001";
	public static final String SO_PUSHC_TRACK_AND_TRACE = "SO_PUSHC_TRACK_AND_TRACE";
	public static final String SO_PUSHC_ESIM_SMS = "SO_PUSHC_ESIM_SMS";
	public static final String SO_PUSHC_SMARTNO_EMAIL = "SO_PUSHC_SMARTNO_EMAIL";

	public static final String SO_PUSHC_DELIVERY_INFO = "SO_MOBILE_DELIVERY_001";
	public static final String SO_PUSHC_BACK_ORDER_INFO = "SO_BACK_ORDER_NOTIFYCATION_001";
	public static final String SO_PUSHC_BACK_ORDER_STOCK_READY = "SO_BACK_ORDER_STOCK_READY_001";
	public static final String SO_PUSHC_STOCK_MODIFY = "SO_MOBILE_MODIFY_NOTIFICATION_001";
	public static final String SO_PUSHC_IOT_SIM = "SO_IOT_SIMCARD_FILE";
	public static final String SO_PUSHC_ESIM_ONECLICK = "SO_PUSHC_ESIM_ONECLICK";
	//CVS-52
	public static final String SO_PUSHC_ESIM_CONFIRMEDDATE_SMS = "SO_PUSHC_ESIM_CONFIRMEDDATE_SMS";
	public static final String SO_PUSHC_ESIM_B2B_CONFIRMEDDATE_SMS = "SO_B2B_ESIM_SMS";
	public static final String SO_PUSHC_ESIM_QR_EMAIL = "SO_PUSHC_ESIM_QR_EMAIL";
	public static final String SO_B2B_SINGLE_ESIM = "SO_B2B_SINGLE_ESIM";


	//iot sim file email state
	public static final String IOT_EMAIL_INIT = "0";
	public static final String IOT_EMAIL_WAIT = "1";
	public static final String IOT_EMAIL_SENT = "2";
	public static final String IOT_EMAIL_FAIL = "3";

	public static final String IOT_EMAIL_UNDO = "4";
	public static final String IOT_EMAIL_DEFAULT_LANG = "da";
	public static final String CUST_EXT_IOT_SIMFILE_EMAIL = "SIM_FILE_EMAIL";
	public static final String CUST_EXT_IOT_SIMFILE_BATCHID = "SIM_FILE_BATCH_ID";
	public static final String CUST_EXT_IOT_SIMFILE_URL = "SIM_FILE_URL";
	public static final String CUST_EXT_IOT_SIMFILE_LANGUAGE = "SIM_FILE_LANGUAGE";
	public static final String CUST_EXT_IOT_SIMFILE_BATCHES = "SIM_FILE_BATCHES";
	public static final String CUST_EXT_IOT_TEMPLATE_INFO_ID = "TEMPLATE_INFO_ID";

	 // 用户类型
	public static final int USER_TYPE_NORMAL = 1;//普通用户
	public static final int USER_TYPE_UNMONITOR = 2;//公免用户
	public static final int USER_TYPE_TEST = 3;//测试用户
	public static final int USER_TYPE_PREOPEN = 4;//预开通用户
	public static final int USER_TYPE_VIRTUAL = 6;//虚拟用户类型
	public static final int USER_TYPE_GROUP = 8;//集团用户类型
	public static final int USER_TYPE_TTKB = 12;//铁通捆绑用户
	//是否网外号码
    public static final int USER_IS_OUT_NET_0 = 0;//网内号码
    public static final int USER_IS_OUT_NET_1 = 1;//网外号码
	//用户催停标志
	public static final int USER_CT_NOTICE_FLAG_0 = 0;//可催可停
	public static final int USER_CT_NOTICE_FLAG_1 = 1;//不可催，可停
	public static final int USER_CT_NOTICE_FLAG_2 = 2;//可催，不可停
	public static final int USER_CT_NOTICE_FLAG_3 = 3;//不可催，不可停
	public static final int USER_CT_NOTICE_FLAG_4 = 4;//红名单
	public static final int USER_CT_NOTICE_FLAG_5 = 5;//公务机
	public static final int USER_CT_NOTICE_FLAG_6 = 6;//测试号

	public static final String SO_BUSI_OS_STATUS = "0000000000000000000000000000000000000000000000000000000000000000";//开机状态OSSTATUS

	//丢失被盗停机attr_id
	public static final int SO_LOST_STOLEAN_TYPE =880740;

	//dunning免催免停类型exemptionType  免催缴 107
	public static final int SO_EXEMPTION_TYPE = 107;

	//调用过billing提供的查询税费接口，表示已经算过税费SOfferFee.taxInclude=2
	public static final int SO_TAX_INCLUDE = 2;
	public static final int SO_TAX_NOT_INCLUDE = 1;

	/*********************业务操作businessId静态常量**********************/
//	public static final long BUSI_ID_AUTH_DEL_OFFER = 900000000001L;//活动强制授权终止操作id  guoxg
	public static final long BUSI_ID_NEW_INC_OFFER = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_NEW_INC_OFFER");//订购增值策划
	public static final long BUSI_ID_REPLACE_BASIC_OFFER = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_REPLACE_BASIC_OFFER");//换基本策划
	public static final long BUSI_ID_REPLACE_BASIC_OFFER_CURMONTH = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_REPLACE_BASIC_OFFER_CURMONTH");//换基本策划
	public static final long BUSI_ID_REPLACE_INC_OFFER = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_REPLACE_INC_OFFER");//换增值策划
//	public static final long BUSI_ID_DEL_BASIC_OFFER = 500000020107L;//退订基本策划       guoxg
	public static final long BUSI_ID_DEL_INC_OFFER = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_DEL_INC_OFFER");//退订增值策划
	public static final long BUSI_ID_UPD_INC_OFFER = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_UPD_INC_OFFER");//修改增值策划
	public static final long BUSI_ID_MODIFY_USER_PROD = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_MODIFY_USER_PROD");//产品变更
	public static final long BUSI_ID_M2M_UPDATE_PROD = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_M2M_UPDATE_PROD");//M2M产品变更
	public static final long BUSI_ID_MODIFY_COMB_OFFER = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_MODIFY_COMB_OFFER");//产品包变更
	public static final long BUSI_ID_DEL_RET_TERMINAL = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_DEL_RET_TERMINAL");//捆绑销售退机
	public static final long BUSI_ID_TRANS_TRACK = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_TRANS_TRACK");//省内携号
	public static final long BUSI_ID_CHANGE_MAIN_OFFER_VIR = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_CHANGE_MAIN_OFFER_VIR");  //老基本策划 换套餐执行前项限制的操作       --暂时不需要处理的zzh
	public static final long BUSI_ID_OS_UNION = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_UNION");//停开机融合
	public static final long BUSI_ID_OS_OPEN = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_OPEN");//停开机融合
	public static final long BUSI_ID_OS_STOP = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_STOP");//停开机融合
	public static final long BUSI_ID_OS_PROD_STOP = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_PROD_STOP");//产品暂停
	public static final long BUSI_ID_OS_PROD_OPEN = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_PROD_OPEN");//产品恢复
	public static final long BUSI_ID_CANCEL_FUT_EFF_PACKAGE = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_CANCEL_FUT_EFF_PACKAGE");//取消未来生效套餐
	public static final long BUSI_ID_HANDSET_SALES = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_HANDSET_SALES");//裸机销售
	public static final long BUSI_ID_REGRET_ORDER = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_REGRET_ORDER");//反悔订单
	public static final long BUSI_ID_REGRET_ORDER_NEW = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_REGRET_ORDER_NEW");//反悔订单NEW
	public static final long BUSI_ID_REGRET_ONGOING_ORDER = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_REGRET_ONGOING_ORDER");//反悔在途单
	public static final long BUSI_ID_REGRET_DEL_INC_OFFER = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_REGRET_DEL_INC_OFFER");//反悔退定
	public static final long BUSI_ID_REGRET_QUIT_USER = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_REGRET_QUIT_USER");//反悔预销户
	public static final long BUSI_ID_PSTN_QUIT_USER = SoConstUtil.getParaDetailValue4BusiId("PSTN_BUSI_ID_DELETE");//pstn销户
	public static final long BUSI_ID_REGRET_ORDER_DSL = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_REGRET_ORDER_DSL");//反悔dsl


	public static final long BUSI_ID_OS_APPOINT_BUSIOPEN = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_APPOINT_BUSIOPEN");//预约个人复机
	public static final long BUSI_ID_OS_APPOINT_BUSISTOP = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_APPOINT_BUSISTOP");//预约个人停机


	public static final long BUSI_ID_OS_BUSISTOP = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_BUSISTOP");//个人停机（自愿单停）
	public static final long BUSI_ID_OS_BUSISTOP_BOTH = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_BUSISTOP_BOTH");//自愿双停
	public static final long BUSI_ID_OS_BUSIOPEN = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_BUSIOPEN");//个人复机

	public static final long BUSI_ID_BATCH_OSE = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_BATCH_OSE");//OSE Batch
	public static final long BUSI_ID_B2B_ESHOP_OSE = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_B2B_ESHOP_OSE");//OSE B2B ESHOP

	public static final long BUSI_ID_OS_MGROPEN = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_MGROPEN");//管理复机
	public static final long BUSI_ID_OS_MGRSTOP = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_MGRSTOP");//管理停机（管理单停）
	public static final long BUSI_ID_OS_MGRSTOP_BOTH = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_MGRSTOP_BOTH");//管理双停

	public static final long BUSI_ID_OS_DUNNINGSTOP = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_DUNNINGSTOP");//催缴单停
	public static final long BUSI_ID_OS_DUNNINGSTOP_BOTH = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_DUNNINGSTOP_BOTH");//催缴双停
	public static final long BUSI_ID_OS_DUNNINGOPEN = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_DUNNINGOPEN");//催缴复机

	public static final long BUSI_ID_OS_CREDIT_LIMIT_STOP = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_CREDIT_LIMIT_STOP");//信用度单停
	public static final long BUSI_ID_OS_CREDIT_LIMIT_BOTHSTOP = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_CREDIT_LIMIT_BOTHSTOP");//信用度双停
	public static final long BUSI_ID_OS_CREDIT_LIMIT_OPEN  = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_CREDIT_LIMIT_OPEN");//信用度复机

	public static final long BUSI_ID_OS_PAYMENT_PLAN_STOP = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_PAYMENT_PLAN_STOP");//支付计划单停
	public static final long BUSI_ID_OS_PAYMENT_PLAN_BOTHSTOP = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_PAYMENT_PLAN_BOTHSTOP");//支付计划双停
	public static final long BUSI_ID_OS_PAYMENT_PLAN_OPEN = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_PAYMENT_PLAN_OPEN");//支付计划复机

	public static final long BUSI_ID_OS_HIGH_USAG_STOP= SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_HIGH_USAG_STOP");//高消费单停
	public static final long BUSI_ID_OS_HIGH_USAG_BOTHSTOP = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_HIGH_USAG_BOTHSTOP");//高消费双停
	public static final long BUSI_ID_OS_HIGH_USAG_OPEN = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_HIGH_USAG_OPEN");//高消费复机

	public static final long BUSI_ID_OS_FRAND_STOP = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_FRAND_STOP");//欺诈单停
	public static final long BUSI_ID_OS_FRAND_BOTHSTOP = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_FRAND_BOTHSTOP");//欺诈双停
	public static final long BUSI_ID_OS_FRAND_OPEN = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_FRAND_OPEN");//欺诈复机

	public static final long BUSI_ID_OS_INSOLVENCY_STOP = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_INSOLVENCY_STOP");//破产单停
	public static final long BUSI_ID_OS_INSOLVENCY_BOTHSTOP = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_INSOLVENCY_BOTHSTOP");//破产双停
	public static final long BUSI_ID_OS_INSOLVENCY_OPEN = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_INSOLVENCY_OPEN");//破产复机

	public static final long BUSI_ID_OS_CREDIT_STOP= SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_CREDIT_STOP");//信贷单停
	public static final long BUSI_ID_OS_CREDIT_BOTHSTOP = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_CREDIT_BOTHSTOP");//信贷双停
	public static final long BUSI_ID_OS_CREDIT_OPEN = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_CREDIT_OPEN");//信贷复机

	public static final long BUSI_ID_OS_ADDRESS_STOP = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_ADDRESS_STOP");//地址单停
	public static final long BUSI_ID_OS_ADDRESS_BOTHSTOP = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_ADDRESS_BOTHSTOP");//地址双停
	public static final long BUSI_ID_OS_ADDRESS_OPEN = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_ADDRESS_OPEN");//地址复机

	public static final long BUSI_ID_OS_USAGR_CONTROL_STOP = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_USAGR_CONTROL_STOP");//消费额度单停
	public static final long BUSI_ID_OS_USAGR_CONTROL_BOTHSTOP = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_USAGR_CONTROL_BOTHSTOP");//消费额度双停
	public static final long  BUSI_ID_OS_USAGR_CONTROL_OPEN = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_USAGR_CONTROL_OPEN");//消费额度复机

	public static final long BUSI_ID_OS_CHANGE_CARD_OPEN = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_CHANGE_CARD_OPEN");//换卡开机

	public static final long BUSI_ID_OS_ACCTSTOP = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_ACCTSTOP");//帐务停机（账务单停）
	public static final long BUSI_ID_OS_ACCTSTOP_BOTH = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_ACCTSTOP_BOTH");//账务双停
	public static final long BUSI_ID_OS_ACCTOPEN = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_ACCTOPEN");//帐务复机

	public static final long BUSI_ID_OS_DUNNINGSTOP_BACK = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_DUNNINGSTOP_BACK");//账务催缴单停（后台）
	public static final long BUSI_ID_OS_DUNNINGSTOP_BOTH_BACK = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_DUNNINGSTOP_BOTH_BACK");//账务催缴双停（后台）
	public static final long BUSI_ID_OS_DUNNINGOPEN_BACK = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_DUNNINGOPEN_BACK");//账务催缴复机（后台）

	//zhangxy13
	public static final long BUSI_ID_OS_SPLIT_STOP_BACK = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_SPLIT_STOP_BACK");//分账单停（后台）
	public static final long BUSI_ID_OS_SPLIT_BOTHSTOP_BACK = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_SPLIT_BOTHSTOP_BACK");//分账双停（后台）
	public static final long BUSI_ID_OS_DEFAULT_ACCOUNT_DUNNING_OPEN_BACK = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_DEFAULT_ACCOUNT_DUNNING_OPEN_BACK");//默认账户催缴复机(后台)
	public static final long BUSI_ID_OS_SPLIT_OPEN_BACK = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_SPLIT_OPEN_BACK");//分账复机（后台）

	public static final long BUSI_ID_OS_CREDIT_LIMIT_STOP_BACK = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_CREDIT_LIMIT_STOP_BACK");//账务信用度单停（后台）
	public static final long BUSI_ID_OS_CREDIT_LIMIT_BOTHSTOP_BACK = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_CREDIT_LIMIT_BOTHSTOP_BACK");//账务信用度双停（后台）
	public static final long BUSI_ID_OS_CREDIT_LIMIT_OPEN_BACK  = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_CREDIT_LIMIT_OPEN_BACK");//账务信用度复机(后台)

	public static final long BUSI_ID_OS_USAGR_CONTROL_STOP_BACK = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_USAGR_CONTROL_STOP_BACK");//账务消费额度单停（后台）
	public static final long BUSI_ID_OS_USAGR_CONTROL_BOTHSTOP_BACK = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_USAGR_CONTROL_BOTHSTOP_BACK");//账务消费额度双停（后台）
	public static final long  BUSI_ID_OS_USAGR_CONTROL_OPEN_BACK = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_USAGR_CONTROL_OPEN_BACK");//消费额度复机(后台)

	public static final long  BUSI_ID_OS_VALID_STOP_BACK = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_VALID_STOP_BACK");//有效期双停(后台)

	public static final long BUSI_ID_OS_ACCTSTOP_BACK = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_ACCTSTOP_BACK");//账务单停  后台
	public static final long BUSI_ID_OS_ACCTSTOP_BOTH_BACK = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_ACCTSTOP_BOTH_BACK");//账务双停 后台

	public static final long BUSI_ID_OS_UNREGIST_BACK = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_UNREGIST_BACK"); //反向未注册单停(后台)
	public static final long BUSI_ID_OS_FRAUD_BACK = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_FRAUD_BACK"); //反向欺诈单停(后台)
	public static final long BUSI_ID_OS_UNREGIST_FRAUD_BACK = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_UNREGIST_FRAUD_BACK"); //反向未注册+欺诈单停
	public static final long BUSI_ID_M2M_NEW_CONNECTION = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_M2M_NEW_CONNECTION"); //M2M New Connection


	public static final long BUSI_ID_OS_CREDIT_LIMIT_STOP_REL = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_CREDIT_LIMIT_STOP_REL");//信用度连带单停
	public static final long BUSI_ID_OS_CREDIT_LIMIT_OPEN_REL  = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_CREDIT_LIMIT_OPEN_REL");//信用度连带复机

	public static final long BUSI_ID_OS_ACCTSTOP_REL = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_ACCTSTOP_REL");//帐务连带停机（单停）
	public static final long BUSI_ID_OS_ACCTOPEN_REL = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_ACCTOPEN_REL");//帐务连带开机

	public static final long BUSI_ID_OS_ACCTSTOP_BOTH_REL = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_ACCTSTOP_BOTH_REL");//帐务连带停机（双停）


	public static final long BUSI_ID_OS_CALLOPEN = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_CALLOPEN");//取消呼出限制
	public static final long BUSI_ID_OS_CALLSTOP = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_CALLSTOP");//呼出限制
	public static final long BUSI_ID_OS_INCALLOPEN = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_INCALLOPEN");//取消呼入限制
	public static final long BUSI_ID_OS_INCALLSTOP = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_INCALLSTOP");//呼入限制
	public static final long BUSI_ID_OS_ACCTOPEN_BACK = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_ACCTOPEN_BACK");//帐务复机_后台
	public static final long BUSI_ID_OS_CALLOPEN_BACK = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_CALLOPEN_BACK");//呼叫限制取消_后台
	public static final long BUSI_ID_OS_CALLSTOP_BACK = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_CALLSTOP_BACK");//呼叫限制_后台
	public static final long BUSI_ID_OS_BUSISTOP_REL = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_BUSISTOP_REL");//营业连带停机
	public static final long BUSI_ID_OS_BUSIOPEN_REL = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_BUSIOPEN_REL");//营业连带开机

	public static final long BUSI_ID_OS_MGRSTOP_REL = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_MGRSTOP_REL");//管理连带停机
	public static final long BUSI_ID_OS_MGROPEN_REL = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_MGROPEN_REL");//管理连带开机
	public static final long BUSI_ID_OS_CALLOPEN_REL = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_CALLOPEN_REL");//呼叫限制连带取消
	public static final long BUSI_ID_OS_CALLSTOP_REL = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_CALLSTOP_REL");//呼叫限制连带
	public static final long BUSI_ID_OS_TEMPOPEN = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_TEMPOPEN");//临时开机
	public static final long BUSI_ID_OS_KEEPNUMSTOP = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_KEEPNUMSTOP");//停机保号
	public static final long BUSI_ID_OS_KEEPNUMOPEN = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_KEEPNUMOPEN");//取消停机保号
	public static final long BUSI_ID_OS_ASSUREOPEN = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_ASSUREOPEN");//担保开机
//	public static final long BUSI_ID_OS_PPS_KEEPNUMOPEN = 191001004022L;//神州行停机保号  guoxg
	public static final long BUSI_ID_OS_SO_PRE_DESTROY = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_SO_PRE_DESTROY");//营业预销
	public static final long BUSI_ID_OS_ACCT_PRE_DESTROY = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_ACCT_PRE_DESTROY");//账务预销
	public static final long BUSI_ID_OS_STOLEN_STOP = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_STOLEN_STOP");//被盗停机
	public static final long BUSI_ID_OS_STOLEN_OPEN = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_STOLEN_OPEN");//被盗复机
	public static final long BUSI_ID_CHG_USER_BAL_ORG_ID = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_CHG_USER_BAL_ORG_ID");//修改用户归属结算区域
	public static final long BUSI_ID_CHG_USER_CHG_ORG_ID = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_CHG_USER_CHG_ORG_ID");//营业移入移出
	public static final long BUSI_ID_USER_BOSS_TO_HLR = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_USER_BOSS_TO_HLR");//用户HLR信息查询(修复)
	public static final long BUSICODE_TERMINAL_OBTAIN = SoConstUtil.getParaDetailValue4BusiId("BUSICODE_TERMINAL_OBTAIN");//终端领取
	public static final long BUSI_ID_OS_STOP_OPEN = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_STOP_OPEN");//停复机统一发送帐处计费的BUSINESS_ID
    public static final long BUSI_ID_TRANSFER = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_TRANSFER_RBOSS");//过户
    public static final long BUSI_ID_TRANSFER_BACKDATE = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_TRANSFER_RBOSS_BACKDATE");//过户BackDate

//	public static final long USER_MONITOR_BUSI_ID = 8000100125L;// guoxg
	public static final long BUSI_ID_NEW_RBOSS_USER_BYCH = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_NEW_RBOSS_USER_BYCH");//渠道开户
	public static final long BUSI_ID_CHANGE_SIM_BK = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_CHANGE_SIM_BK");//补卡
	public static final long BUSI_ID_CHANGE_SIM_HK = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_CHANGE_SIM_HK");//换卡
	public static final long BUSI_ID_CHANGE_ACTIVE_SIM = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_CHANGE_ACTIVE_SIM");//激活卡补换卡
	public static final long BUSI_ID_NEW_RBOSS_USER = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_NEW_RBOSS_USER");//入网 GSM开户
	public static final long BUSI_ID_NEW_RBOSS_USER_XK = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_NEW_RBOSS_USER_XK");//携卡入网
    public static final long BUSI_ID_NEW_RBOSS_USER_NET = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_NEW_RBOSS_USER_NET");//入网 GSM网上开户
    public static final long BUSI_ID_BACK_CHANGE_OFFER = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_BACK_CHANGE_OFFER");//过去时间换套餐
    public static final long BUSI_ID_ROLL_BACK_USER_NET = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_ROLL_BACK_USER_NET");//网上开户退费撤单

	public static final long BUSI_ID_MULTI_NP_NO_ACTIVE = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_MULTI_NP_NO_ACTIVE");//MULTI NP只NP不开户

	public static final long BUSI_ID_COMMON_RECREATE_USER = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_COMMON_RECREATE_USER");//普通销户重入网业务id
	public static final long BUSI_ID_TK_RECREATE_USER = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_TK_RECREATE_USER");//套卡销户重入网业务id
	public static final long BUSI_ID_CHANGEPASSWORD = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_CHANGEPASSWORD");//密码修改id
	public static final long BUSI_ID_RESETPASSWORD = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_RESETPASSWORD");	//密码重置
	public static final long BUSI_ID_UNLOCKPASSWORD = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_UNLOCKPASSWORD");//密码解锁
	public static final long BUSI_ID_QQW_NEW =SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_QQW_NEW"); //家庭亲情网组网
	public static final long BUSI_ID_USER_BILLCYCLE_CHANGE =SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_USER_BILLCYCLE_CHANGE"); //用户账期变更[操作]

    public static final long BUSI_TYPE_DXYHGX = 23L;//单向用户关系busi_type
    public static final long BUSI_YHGX_ACCEPT = SoConstUtil.getParaDetailValue4BusiId("BUSI_YHGX_ACCEPT");//用户关系受理[操作]
    public static final long BUSI_YHGX_ADD_MEMBER = SoConstUtil.getParaDetailValue4BusiId("BUSI_YHGX_ADD_MEMBER");//用户关系受理添加成员[操作]
	public static final long BUSI_ID_NEW_BROADBAND = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_NEW_BROADBAND");//有线宽带开户
	public static final long BUSI_ID_CHANGE_PHONE = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_CHANGE_PHONE");//换卡换号  //modify by huanghui 20121113
	public static final long BUSI_ID_UNIFY_ENTER = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_UNIFY_ENTER");//家庭统一支付受理入口                 --暂时不需要处理的zzh
	public static final long BUSI_ID_UNFIYCREATE = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_UNFIYCREATE");//家庭统一支付户主指定                 --暂时不需要处理的zzh
	public static final long BUSI_ID_UNIFYCANCEL = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_UNIFYCANCEL");//家庭统一支付户主取消                 --暂时不需要处理的zzh
	public static final long BUSI_ID_UNIFYADD = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_UNIFYADD");//家庭统一支付成员增加                       --暂时不需要处理的zzh
	public static final long BUSI_ID_UNIFYDEL = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_UNIFYDEL");//家庭统一支付成员删除                       --暂时不需要处理的zzh
	public static final long BUSI_ID_UNIFYMODIFY = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_UNIFYMODIFY");//家庭统一支付成员修改                 --暂时不需要处理的zzh
    //public static final long BUSI_JTTC_BGQX = 800015100007L;//家庭套餐变更取消                              delete by zhengzh     --暂时不需要处理的zzh
    //public static final long BUSI_JTTC_CW = 800015100002L; //家庭套餐拆网                              delete by zhengzh             --暂时不需要处理的zzh
    public static final long BUSI_JTTC_CYBG = SoConstUtil.getParaDetailValue4BusiId("BUSI_JTTC_CYBG"); //家庭套餐成员变更                                --暂时不需要处理的zzh
    public static final long BUSI_JTTC_TCBG = SoConstUtil.getParaDetailValue4BusiId("BUSI_JTTC_TCBG"); //家庭套餐套餐变更                                --暂时不需要处理的zzh
    public static final long BUSI_JTTC_ZW = SoConstUtil.getParaDetailValue4BusiId("BUSI_JTTC_ZW"); //家庭套餐组网                                           --暂时不需要处理的zzh
    //public static final long BUSI_JTTC_CWQX = 800015100008L; //家庭套餐拆网取消             delete by zhengzh                   --暂时不需要处理的zzh
	public static final long BUSI_ID_OFFER_UPDATE_ENTER =SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OFFER_UPDATE_ENTER");//套餐变更入口的操作ID
	public static final long BUSI_ID_OFFER_UPDATE_ENTER_TELEPHONE =SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OFFER_UPDATE_ENTER_TELEPHONE");//固话套餐变更入口的操作ID
	public static final long BUSI_ID_OFFER_UPDATE_ENTER_BROADBAND =SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OFFER_UPDATE_ENTER_BROADBAND");//宽带套餐变更入口的操作ID

	public static final long BUSI_ID_NEW_OFFER_VAS = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_NEW_OFFER_VAS");//订购增值策划
	public static final long BUSI_ID_CANCEL_OFFER_VAS =  SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_CANCEL_OFFER_VAS");//撤消增值策划
	public static final long BUSI_ID_CHANGE_BASIC_OFFER = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_CHANGE_BASIC_OFFER");//换基本策划
	//public static final long BUSI_ID_CHANGE_PREOPEN_OFFER = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_CHANGE_PREOPEN_OFFER");	  delete by zhengzh        //白卡改套餐
	public static final long BUSI_FAMILY_MEMBER_CHANGE = SoConstUtil.getParaDetailValue4BusiId("BUSI_FAMILY_MEMBER_CHANGE");//家庭套餐成员变更                         --暂时不需要处理的zzh
	//public static final long BUSI_ID_AUDIT_PROD_DEL = 500000020337L;//数据稽核产品删除	         delete by zhengzh             --暂时不需要处理的zzh
	//public static final long BUSI_ID_AUDIT_OFFER_DEL = 500000020338L;//数据稽核策划删除                    delete by zhengzh             --暂时不需要处理的zzh
	public static final long BUSI_ID_QUIT_RBOSS_USER = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_QUIT_RBOSS_USER");//营业预销户
	public static final long BUSI_ID_CLOSE_ACCOUNT = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_CLOSE_ACCOUNT");//营业销户
	public static final long BUSI_ID_PSTN_CLOSE_ACCOUNT = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_PSTN_CLOSE_ACCOUNT");//PSTN营业预销户
	public static final long VPN_BUSI_ID_CREATE = SoConstUtil.getParaDetailValue4BusiId("VPN_BUSI_ID_CREATE");//BBossConstVPN/mutiplan create操作
	public static final long VPN_BUSI_ID_DELETE = SoConstUtil.getParaDetailValue4BusiId("VPN_BUSI_ID_DELETE");//BBossConstVPN/mutiplan delete操作
	public static final long BBOSS_CHG_OFF_BUSI_OPER_ID = SoConstUtil.getParaDetailValue4BusiId("BBOSS_CHG_OFF_BUSI_OPER_ID");//集团业务变更
	public static final long NC_OPEN_BUSI = SoConstUtil.getParaDetailValue4BusiId("NC_OPEN_BUSI");//Nodic新开
	public static final long BUSI_ID_Nodic_Connect_Cancel = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_Nodic_Connect_Cancel");//BBossConstNodic_Connect_Cancel
	public static final long INSURANCE_PRE = SoConstUtil.getParaDetailValue4BusiId("INSURANCE_PRE");//保险销户
	public static final long BUSI_ID_INSURANCE_CLAIM = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_INSURANCE_CLAIM");//保险索赔
	public static final long BUSI_ID_TERMINAL_CLAIM = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_TERMINAL_CLAIM");//终端维修
	public static final long BUSI_ID_ACCT_PREDESTROY = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_ACCT_PREDESTROY");//账务预销户
	public static final long BUSI_ID_ACCT_DESTROY = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_ACCT_DESTROY");//账务销户
	public static final long BUSI_ID_QUIT_BroadBand_USER = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_QUIT_BroadBand_USER");//宽带拆机
	public static final long BUSI_ID_PRE_RECREAT_USER = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_PRE_RECREAT_USER");//预销户重入网操做ID
	public static final long BUSI_ID_PSTN_PRE_RECREAT_USER = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_PSTN_PRE_RECREAT_USER");//PSTN预销户重入网操做ID
	public static final long BUSI_ID_BATCH_PRE_RECREAT_USER = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_BATCH_PRE_RECREAT_USER");//批量预销户重入网ID
	//public static final long BUSI_ID_QUIT_RBOSS_USER_B2B = 500000020013L;//电子商务快速销户       delete by zhengzh               --暂时不需要处理的zzh
	public static final long BUSI_ID_BAK_ACTIEVE = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_BAK_ACTIEVE"); //备卡激活
	public static final long BUSI_ID_BAK_ACCEPT = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_BAK_ACCEPT"); //备卡申请
	public static final long BUSI_ID_BAK_RESTORE = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_BAK_RESTORE"); //备卡补卡
	public static final long BUSI_ID_BAK_DEL = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_BAK_DEL");//备卡 删除
	//ADD BY HUANGHUI 20120924
	public static final long BUSI_ID_BAK_LOSS = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_BAK_LOSS");//备卡挂失
	public static final long BUSI_ID_BAK_UNLOSS = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_BAK_UNLOSS");//备卡解挂
	public static final long BUSI_ID_ORDER_ROLL_BACK = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_ORDER_ROLL_BACK");//营业撤单
	//public static final long BUSI_ID_TRANSS_REGION_WITHNUM = 470424L;//携号转网                 --暂时不需要处理的zzh//del by tuhc
	public static final long ROLLBACK_BUSINESS_ID = SoConstUtil.getParaDetailValue4BusiId("ROLLBACK_BUSINESS_ID");//业务回滚操做ID
	//public static final long BUSI_ID_CHANGE_CUST_NOROWNER = 191001007002L;//非户主过户                --暂时不需要处理的zzh//del by tuhc
	public static final long BUSI_ID_CHANGE_CUST_OWNER = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_CHANGE_CUST_OWNER");//户主过户
	public static final String BP_BUSINESS_ID = "8000000011";//营业批量业务编号
	public static final long BUSI_ID_BATCH_OPEN = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_BATCH_OPEN"); //批量开户
	public static final long BUSI_ID_BATCH_OPEN_FOR_M2M = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_BATCH_OPEN_FOR_M2M"); //M2M批量开户
	public static final long BUSI_ID_BATCH_OPEN_FOR_DDN = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_BATCH_OPEN_FOR_DDN"); //批量开户
	public static final long BUSI_ID_USERINFO_AUDIT = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_USERINFO_AUDIT"); //用户信息审核
	public static final long BUSI_ID_RECORDCARD_ACTIVE = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_RECORDCARD_ACTIVE"); //套卡激活
	public static final long BUSI_ID_B2B_CHANGENUMBER = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_B2B_ChangeNumber"); //B2B换号

	public static final long NC_BUSI_ID_QUIT_USER = SoConstUtil.getParaDetailValue4BusiId("NC_BUSI_ID_QUIT_USER"); //北欧专线预销户
	public static final long NC_BUSI_ID_RECREATE_USER = SoConstUtil.getParaDetailValue4BusiId("NC_BUSI_ID_RECREATE_USER"); //北欧专线重入网
	public static final long MULTIPLAN_BUSI_ID_QUIT_USER = SoConstUtil.getParaDetailValue4BusiId("MULTIPLAN_BUSI_ID_QUIT_USER"); //multplan预销户
	public static final long MULTIPLAN_BUSI_ID_RECREATE_USER = SoConstUtil.getParaDetailValue4BusiId("MULTIPLAN_BUSI_ID_RECREATE_USER"); //multplan重入网

	public static final long BUSI_ID_GENERIC_OTT_NEW_CONNECTION = 191000002001L;//generic ott开户
	public static final long BUSI_ID_GENERIC_OTT_CHANGE_OFFER = 191000002006L;//generic ott change offer
	public static final long BUSI_ID_GENERIC_OTT_TRANSFRE_OWNERSHIP = 191000002007L;//generic ott过户
	public static final long BUSI_ID_GENERIC_OTT_PRE_TERMINATION = 191000002003L;//generic ott预销户
	public static final long BUSI_ID_GENERIC_OTT_PRE_TERMINATION_RE_ACCESS = 191000002008L;//generic ott预销户重入网
	public static final long BUSI_ID_GENERIC_OTT_SUSPENSION = 191000002009L;//generic ott用户级停复机
	public static final long BUSI_ID_GENERIC_OTT_TERMINATION = 191000002010L;//generic ott销户
	public static final long BUSI_ID_GENERIC_OTT_REGRET = 191000002011L;//generic ott反悔

	public static final long BUSI_ID_GENERIC_OTT_OFFER_PAUSE = 191002011004L;//generic ott offer级停机
	public static final long BUSI_ID_GENERIC_OTT_OFFER_RESUMPTION = 191002011005L;//generic ott offer级复机
	public static final long BUSI_ID_GENERIC_OTT_ADDON_CHANGE_OFFER = 191001011001L;//generic ott addon互斥可换,change_offer(所有类型的addon offer，互斥可换都用这个)
	public static final long BUSI_ID_GENERIC_OTT_ADDON_SUBSCRIBE = 191000002004L;//generic ott addon订购
	public static final long BUSI_ID_GENERIC_OTT_ADDON_UNSUBSCRIBE = 191000002005L;//generic ott addon退订
	public static final long BUSI_ID_GENERIC_OTT_PRODUCT_CHANGE = 191000002002L;//generic ott产品变更


	//用户关系受理成员变更 add by lijm3
    public static final long USER_RELATE_UP_BUSID = 191001009016L; //  （页面引用的）
    public static final long USER_RELATE_ACCTSTS_ATTR = 151005000911L;//帐户状态
    public static final long USER_RELATE_TALKLEVEL_ATTR =151005000921L;//通话级别
    public static final long USER_RELATE_PWD_ATTR =151005000922L;//密码

    public static final long BUSI_FAMILY_CREATE = SoConstUtil.getParaDetailValue4BusiId("BUSI_FAMILY_CREATE");//群组组网[操作]
	public static final long BUSI_FAMILY_DELETE = SoConstUtil.getParaDetailValue4BusiId("BUSI_FAMILY_DELETE");//群组拆网[操作]
	public static final long BUSI_FAMILY_CHANGE = SoConstUtil.getParaDetailValue4BusiId("BUSI_FAMILY_CHANGE");//群组成员变更[操作]
	public static final long BUSI_FAMILY_MEM_ADD = SoConstUtil.getParaDetailValue4BusiId("BUSI_FAMILY_MEM_ADD");//群组成员添加[操作]
	public static final long BUSI_FAMILY_MEM_DEL = SoConstUtil.getParaDetailValue4BusiId("BUSI_FAMILY_MEM_DEL");//群组成员添加[操作]
    //public static final long BUSI_FAMILY_OFFER_CHG = SoConstUtil.getParaDetailValue4BusiId("BUSI_FAMILY_OFFER_CHG");//群组套餐变更[操作]    delete by zhengzh



	public static final long BUSI_BROADBAND_CREATE = SoConstUtil.getParaDetailValue4BusiId("BUSI_BROADBAND_CREATE");//家庭宽带开户[操作]
	public static final long BUSI_BROADBAND_CHANGE = SoConstUtil.getParaDetailValue4BusiId("BUSI_BROADBAND_CHANGE");//家庭宽带移机[操作]
	public static final long BUSI_BROADBAND_DELETE = SoConstUtil.getParaDetailValue4BusiId("BUSI_BROADBAND_DELETE");//家庭宽带拆机[操作]
	public static final long BUSI_BROADBAND_LONGER = SoConstUtil.getParaDetailValue4BusiId("BUSI_BROADBAND_LONGER");//家庭宽带续包[操作]
	public static final long BUSI_BROADBAND_RESERT = SoConstUtil.getParaDetailValue4BusiId("BUSI_BROADBAND_RESERT");//家庭宽带密码重置[操作]
    //public static final long BUSI_CHG_WLAN_PASSWORD = SoConstUtil.getParaDetailValue4BusiId("BUSI_CHG_WLAN_PASSWORD");//修改WLAN密码  tuhc
    //public static final long BUSI_RESET_WLAN_PASSWORD = SoConstUtil.getParaDetailValue4BusiId("BUSI_RESET_WLAN_PASSWORD"); //重置WLAN密码 tuhc

    //public static final long BUSI_CHANGE_TERIMINAL_KUCUN =SoConstUtil.getParaDetailValue4BusiId("BUSI_CHANGE_TERIMINAL_KUCUN");//库存换机操作ID tuhc
    //public static final long BUSI_CHANGE_TERIMINAL_ZIGOU =SoConstUtil.getParaDetailValue4BusiId("BUSI_CHANGE_TERIMINAL_ZIGOU");//自购换机操作ID tuhc

	/*********************策划角色ID静态常量******************************************/
    public static final long ROLE_ID_YHGX_MAINROLE = 181000000011L;	//用户关系主角色
	public static final long ROLE_ID_YHGX_SUBROLE = 181000000012L;	//用户关系副角色

	/*********************价格计划ID静态常量******************************************/
	public static final long PRICE_ID_PREPAY_AMOUNT = 100000010003L;	//预存
	public static final long PRICE_ID_TERM_SALE_AMOUNT = 100000010011L;//终端销售价格
	public static final long PRICE_ID_BAND_CYCLE_FEE = 100000010019L;//宽带包时长费用
	public static final long PRICE_ID_BAND_BACK_FEE = 100000010010L;//宽带退费
	public static final long PRICE_ID_FEE_BACK_AMOUNT = 100000010012L;//话费返冲金额 价格计划ID
	public static final long PRICE_ID_GUARANTEE_AMOUNT = 100000010013L;	//担保金额 价格计划ID
	public static final long PRICE_ID_PHONE_RETURN_AMOUNT = 100000010014L;//退机返冲金额  价格计划ID
	public static final long PRICE_ID_PREPAY_MONEY = 100000010015L;//渠道预缴金额  价格计划ID
	public static final long PRICE_ID_PRESENT_AMOUNT = 100000010002L;//馈赠金价格计划ID
	public static final long PRICE_ID_CORPUS_AMOUNT = 100000010001L;//本金价格计划ID
	public static final long PRICE_ID_DEPOSIT_LONG = 100000010006L;	//国际长途押金
	public static final long PRICE_ID_CARD_AMOUNT = 100000010004L;//卡费
	public static final long PRICE_ID_CARD_DISCOUNT_AMOUNT = 131000011001L;//卡费折扣费用
	public static final long PRICE_ID_CREATER_MONEY = 100000010016L;	//初装费	默认188	初装费	100000010016
	public static final long PRICE_ID_MOVE_MONEY = 100000010017L;//移机费	默认0	移机费	100000010017
	public static final long PRICE_ID_TERMINAL_MONEY = 100000010018L;//终端设备费	默认100	终端设备费	100000010018
	public static final long PRICE_ID_TERM_ADD_AMOUNT = 132100000000L;//终端差价
	public static final long PRICE_ID_OLD_TERM_AMOUNT = 100000010007L;//旧机抵扣
	public static final long PRICE_ID_SCORE_AMOUNT = 132200000000L;//积分抵扣
	public static final long PRICE_ID_DEPOSIT_ROAM = 100000010005L;	//国际漫游押金
	public static final long PRICE_ID_CARD_COMMUNICATION_FEE =131000011000L;//sim卡中的通信费用
	public static final long PRICE_PLAN_DEPOSIT_ACC_CODE = 5040011;	//押金的科目编号
	public static final long PRICE_PLAN_COMMON_PREYPAY_CODE = 135009999998L;//通用预存款价格计划ID
	public static final long PRICE_PLAN_COMMON_CARDFEE_CODE = 135009999999L;//通用SIM卡卡费价格计划ID
	public static final long PRICE_ID_BUSI_PREPAY_RETURN =132321000102L;//预存退费价格计划ID 活动退费（退预存）
	public static final long PRICE_ID_AWARD_PREPAY_RETURN =132321000104L;//赠送费用退费价格计划ID 活动退费（退赠送款）
	public static final long PRICE_ID_RES_TERMINAL_RETURN =132321000106L;//购机款退费价格计划ID  活动退费（退购机款）
	public static final long PRICE_PLAN_COMMON_PREPAY_SELF = 135009999988L;//通用用户自缴预存款
	public static final long PRICE_ACCT_CODE_GJJGATCT = 99709393L;//国际及港澳台长途预存费用项ID
	public static final long PRICE_ACCT_CODE_GJJGATMY = 99709394L;//国际及港澳台漫游预存费用项ID

	/*********************价格计划类型 静态常量******************************************/
	/**价格计划的类型 .start add by lizy5 后续需要使用产品侧定义的枚举值**/
	public static final String PRICE_TYPE_BUSI_PREPAY = "PRICE_PLAN_BUSI_PREPAY";//预存(立即划拨，不存在分摊规则)
	public static final String PRICE_TYPE_BUSI_APPORT_PREPAY = "PRICE_PLAN_BUSI_APPORT_PREPAY";//预存(存在分摊规则)
	public static final String PRICE_TYPE_AWARD_PREPAY = "PRICE_PLAN_AWARD_PREPAY";// 赠送(一次性立即赠送，不存在分摊规则)
	public static final String PRICE_TYPE_AWARD_APPORT_PREPAY = "PRICE_PLAN_AWARD_APPORT_PREPAY";// 赠送(存在分摊规则)
	public static final String PRICE_TYPE_RES_TERMINAL = "PRICE_PLAN_BUSI_RES";;//终端资源资费
	public static final String PRICE_TYPE_BUSI_DEPOSIT = "PRICE_PLAN_BUSI_DEPOSIT";//押金
	public static final String PRICE_TYPE_DEDUCT_SCORE = "PRICE_PLAN_DEDUCT_SCORE";//积分扣减
	public static final String PRICE_TYPE_AWARD_SCORE = "PRICE_PLAN_AWARD_SCORE";//积分赠送
	public static final String PRICE_TYPE_AWARD_APPORT_SCORE = "PRICE_PLAN_AWARD_APPORT_SCORE";//赠送分摊积分
	public static final String PRICE_TYPE_BUSI_RENT = "PRICE_PLAN_BUSI_RENT";//租金费用类型
	public static final String PRICE_TYPE_BUSI_CARD = "PRICE_PLAN_BUSI_CARD";//卡费
	public static final String PRICE_TYPE_BUSI_CARD_DISCOUNT = "PRICE_PLAN_CARD_DISCOUNT";//卡费优惠（如全球通免卡费）
	public static final String PRICE_TYPE_BUSI_CARD_RETURN = "PRICE_PLAN_BUSI_RETURN";//退款(终端类营销活动提前终止退机时退现金给用户)
	public static final String PRICE_TYPE_PLAN_BUSI_TRANS = "PRICE_PLAN_BUSI_TRANS";//预存转移（主要针对预存转副账户类的，冻结后分月返还）
	public static final String PRICE_TYPE_PLAN_BUSI_NORMAL = "PRICE_PLAN_BUSI_NORMAL";//普通营业资费(含手续费、便利卡费)不送帐管
    public static final String PRICE_TYPE_BUSI_PENALTY = "PRICE_PLAN_BUSI_PENALTY";//违约金
    public static final String PRICE_TYPE_BUSI_RES = "PRICE_PLAN_BUSI_RES";//资源类（含终端费用，终端补偿款）
    public static final String PRICE_TYPE_BUSI_COMMITMENT = "PRICE_PLAN_BUSI_COMMITMENT";//合约优惠
    public static final String PRICE_TYPE_BUSI_PAYALL = "PRICE_PLAN_BUSI_PAYALL";//全额付款优惠

	//下面2种没有使用到
	public static final String PRICE_TYPE_DEDUCT_SCORE_ROLLBACK  = "PRICE_PLAN_DEDUCT_SCORE_ROLLBACK";//扣减积分(回滚)(取消或回滚时需要将抵扣积分回滚)
	public static final String SCORE_PRICE_PLAN_TYPE = "PRICE_PLAN_BUSI_SCORE";//积分的价格计划类型

	public static final long PRICE_ID_GOLDEN_NUMBER=132321102L;//号码费用价格计划
	public static final long OTC_DUMMY_OFFER = 2001806;//OTC Dummy Offer
	public static final long PHONEBOOK_OFFER_ID=SoConstUtil.getParaDetailValue4OfferId("PHONEBOOK_OFFER_ID");//phonebook的offerId

	public static final String PRE_TERMINATION_PROMPT_OFFER_ID = String.valueOf(SoConstUtil.getParaDetailValue4OfferId("PRE_TERMINATION_PROMPT_OFFER_ID")); //"20031611"

	//referral type   262100000222 PCE没有枚举，OM控制并展示Standard or Chose Number;0-Standard 1-Chose Number
	//referral number 262100000223 当选择Chose Number类型时，需要填写一个号码（不清楚是否校验）
	//extend period   262100000224 PCE没有枚举，OM控制并展示选择额外的提示自然月份;月份为int型
	public static final long PRETER_PROMPT_ATTR_REFERRAL_TYPE = 262100000222L;
	public static final long PRETER_PROMPT_ATTR_REFERRAL_NUM = 262100000223L;
	public static final long PRETER_PROMPT_ATTR_EXTEND_PERIOD = 262100000224L;

	//20032709     Referral with reference(Standard)-GSM
	public static final String PRE_TERMINATION_PROMPT_OFFER_STANDARD = String.valueOf(SoConstUtil.getParaDetailValue4OfferId("PRE_TERMINATION_PROMPT_OFFER_STANDARD"));
	//20032708    Referral with reference(Chosen Number)-GSM
	public static final String PRE_TERMINATION_PROMPT_OFFER_CHOSEN_NUMBER = String.valueOf(SoConstUtil.getParaDetailValue4OfferId("PRE_TERMINATION_PROMPT_OFFER_CHOSEN_NUMBER"));

	//public static final long F2M_OFFER_ID = 20031590L;
	public static final long F2M_FEATURE_ID = 2700026L;
	public static final long MUTEXT_AUTO_REMOVE_FEATURE_ID = 27000040L;
	public static final String MUTEXT_AUTO_REMOVE_YES="1";

	public static final long NODIC_CONNECT_PROD_SPEC_ID = 172000000021L;  // Nodic Connect规格

	/******************************定义费用项编辑方式*********************/
	public interface SoCustExtType {
		/**是否调账**/
		public static final String NEED_TURN_ACCT = "5";
		public static final String NEED_TURN_YUYING = "50001"; //语音服务
		public static final String NEED_TURN_DUANXIN = "50005"; //点对点短信
		public static final String NEED_TURN_GPRS = "53001"; //GPRS服务
		public static final String NEED_TURN_MMS = "50014"; //MMS服务
	}

    /***定义违约金参数解析实现类***************/
    public interface ParaDetailPenalTy{
        /**违约金业务编码：REGIONID*/
        public static final String PARA_REGION_X = "X";
        /**违约金表达式：PARA_TYPE*/
        public static final String PARA_TYPE_PENALTY_CALCULATE_EXP = "PENALTY_CALCULATE_EXP";

        /**赔付折扣率：PARA_CODE*/
        public static final String PARA_CODE_UP_PENALRATE = "$UP_PENALRATE$";
        /**赔付金额：PARA_CODE*/
        public static final String PARA_CODE_UP_PENALTY = "$UP_PENALTY$";
        /**优惠金额/赠送金额：PARA_CODE*/
        public static final String PARA_CODE_UP_AWARD = "$UP_AWARD$";

    }

	/******************************定义费用项编辑方式*********************/
	public interface PriceEditType {
		/**输入折扣率**/
		public static final String PRICE_EDIT_TYPE_RATE = "1";
		/**修改金额**/
		public static final String PRICE_EDIT_TYPE_NUM = "2";
		/**不可修改**/
		public static final String PRICE_EDIT_TYPE_NOT = "3";
		/**修改预存款 即该预存的应收和实收同时修改**/
		public static final String PRICE_EDIT_TYPE_MODALL = "4";
	}

	/***********************************定义付费方式*********************/
	public interface PayTypeCfg {
		public static final int CFG_SO_PAY_TYPE_1 = 1;//现金缴款
		public static final int CFG_SO_PAY_TYPE_2 = 2;//支票
		public static final int CFG_SO_PAY_TYPE_3 = 3;//转账单
		public static final int CFG_SO_PAY_TYPE_4 = 4;//扣本金账本
		public static final int CFG_SO_PAY_TYPE_5 = 5;//POS机收费
	}

	public interface PayType{
		public static final int CFG_SO_PAY_TYPE_1 = 1;//现金缴款
		public static final int CFG_SO_PAY_TYPE_2 = 2;//支票
		public static final int CFG_SO_PAY_TYPE_3 = 3;//转账单bill
		public static final int CFG_SO_PAY_TYPE_4 = 4;//分期
		public static final int CFG_SO_PAY_TYPE_5 = 5;//津贴
		public static final int CFG_SO_PAY_TYPE_6 = 6;//nets
		public static final int CFG_SO_PAY_TYPE_7 = 7;//retail Invoice
		public static final int CFG_SO_PAY_TYPE_8 = 8;//pos
	}

	/*********************品牌ID静态常量********************************************/
	public static final long USER_BRAND_ID_MZONE = 161000000004L;//动感地带
	public static final long USER_BRAND_ID_GOTONE = 161000000001L;//全球通
	public static final long USER_BRAND_ID_EASYOWN_PUBLIC = 161000000005L;//普通神州行
	public static final long USER_BRAND_ID_STANDARD_EASYOWN = 161000000007L;//标准神州行,神州行（智能网）
	public static final String USER_BRAND_ID_EASYOWN_STANDARD = "161000000007";//标准神州行 add by xinjl

	/*********************规格ID静态常量（如区分是GSM、宽带、固话的产品规格）********************************************/
	public static final long PROD_CATALOG_GSM = 171000000001L;//普通GSM规格
	public static final long PROD_CATALOG_BROADBAND = 171000000003L;//宽带规格
	public static final long PROD_CATALOG_FIXEDPHONE = 171000000002L;//固话规格
	public static final long PROD_CATALOG_MULTIPLAN = 172000000001L;
	public static final long PROD_CATALOG_NODICCONNECT = 172000000021L;
	public static final long PROD_CATALOG_OTHER = 171000000051L;
	public static final long PROD_CATALOG_BROADBAND_3A =22L;//宽带规格，发给3A的是22，木有为什么
	public static final long PROD_CATALOG_FIXEDLINE = 4L;	//固话规格
	public static final long PROD_CATALOG_VIRTUAL_USER=171000000021L;//家庭网规格
	public static final long PROD_CATALOG_IMS=171000000004L;//IMS规格
	public static final long PROD_CATALOG_TTGH = 171000000002L;//铁通规格
	public static final long PROD_CATALOG_BOSS_VPMN =172000000002L;	//BOSS VPMN规格
    public static final long PROD_CATALOG_FAMILY_VIRT_USER=10L;//虚用户产品规格
    public static final long PROD_CATALOG_ACCOUNT_PRIVILEGE=171000000032L;//客户账户级优惠产品规格
    public static final long PROD_CATALOG_THIRD_PARTY_PRODUCT=171000000031L;//非电信业务产品规格
	public static final long PROD_CATALOG_RESOURCE_PRODUCT = 171000000033L;//裸机销售产品规格
	public static final long PROD_CATALOG_OTT = 172000000025L;//OTT
	public static final long PROD_CATALOG_GENERIC_OTT = 172000000027l;//generic ott

	public static final int SO_OSS_PROD_CODE_BROADBAND = 1;//SFF宽带产品
	public static final int SO_OSS_PROD_CODE_FIXEDPHONE = 4;//SFF固话产品

	/**************************角色ID 静态常量（策划下的角色ID）**************************************/
	public static final long PROD_ROLE_GSM = 181000000001L;//普通GSM角色
    public static final long PROD_ROLE_BROADBAND = 181000000003L; //有线宽带角色
    public static final long PROD_ROLE_FIXEDLINE = 181000001001L;//有线固话角色

	public static final long FAMILY_NET_VIRTUAL_ROLE_ID = 181000000021L; //家庭网虚用户角色
	public static final long FAMILY_NET_MAIN_ROLE_ID = 181000000022L;//家庭网主号角色
	public static final long FAMILY_NET_SUB_ROLE_ID = 181000000023L;//家庭网副号角色



	/*********************策划ID静态常量********************************************/
	public static final long FAMILY_NET_OFFER_ID = SoConstUtil.getParaDetailValue4OfferId("FAMILY_NET_OFFER_ID");//家庭亲情网策划 111000006386L
	//public static final long FAMILY_SON_OFFER_ID = 500000100004L;//新子通策划
	//public static final long IP_ZHITONGHAOMA_OFFER_ID = 111000000275L; //IP直通号码策划
	//public static final long ONE_CARD_MANY_NUMBERS_OFFER_ID = 111000026121L;//本地一卡多号策划
	public static final long USER_MONITOR_OFFER_ID = SoConstUtil.getParaDetailValue4OfferId("USER_MONITOR_OFFER_ID");//小余额监控策划(非全球通)  500300000212L
	public static final long USER_MONITOR_OFFER_ID_GONETO = SoConstUtil.getParaDetailValue4OfferId("USER_MONITOR_OFFER_ID_GONETO");//小余额监控策划(全球通)   500300010774L
	//public static final long SJMMJQKG_OFFER_ID = 111150001204L;//随机密码鉴权开关策划

	//public static final long MOBILE_MAIL_0_OFFER_ID =111300142980L;	//免费版139邮箱策划编号
	//public static final long MOBILE_MAIL_5_OFFER_ID =111300118535L;	//5元版139邮箱策划编号
	//public static final long MOBILE_MAIL_20_OFFER_ID =111300118536L;//20元版139邮箱策划编号
	//public static final long PUSHEMAIL_5_OFFER_ID =111300118541L;	//5元档位PUSHEMAIL策划编号
	//public static final long PUSHEMAIL_20_OFFER_ID =111300118542L;	//20元档位PUSHEMAIL策划编号

	//public static final long CAMPUS_WLAN_OFFER_ID =111140074181L;	//普通校园WLAN策划编号
	public static final long MOBILE_PAY_OFFER_ID =SoConstUtil.getParaDetailValue4OfferId("MOBILE_PAY_OFFER_ID");	//手机支付策划编号  111300148958L
	public static final long GPRS_5_OFFER_ID =SoConstUtil.getParaDetailValue4OfferId("GPRS_5_OFFER_ID");	//无线上网5元套餐策划编号    111130502500L

	public static final long OFFER_ID_GJJGATMY = SoConstUtil.getParaDetailValue4OfferId("OFFER_ID_GJJGATMY");	//国际及港澳台漫游   111130500400L
	public static final long OFFER_ID_GJJGATCT = SoConstUtil.getParaDetailValue4OfferId("OFFER_ID_GJJGATCT");	//国际及港澳台长途   111130500300L
	public static final long OFFER_ID_GJZJ = SoConstUtil.getParaDetailValue4OfferId("OFFER_ID_GJZJ");	//国际租机     111150001201L
	public static final long OFFER_ID_GEXFBTX = SoConstUtil.getParaDetailValue4OfferId("OFFER_ID_GEXFBTX");	//高额消费提醒不提醒产品    111153001743L
	public static final long OFFER_ID_GJYETX = 111140071044L;	//国际及港澳台业务话费提醒促销       //策划编号入静态表 jsp编译报错回退
	//public static final long OFFER_ID_SJLCYJ_BJ = 111140062061L; //省际两城一家(北京100)
	//public static final long OFFER_ID_SNLCYJ_BJ = 111140062091L; //省内两城一家(沈阳024)
	public static final long KIND_ID_SJLCYJ = 200000100056L;//省际两城一家
	public static final long KIND_ID_SNLCYJ = 200000100057L;//省内两城一家
	public static final String OFFER_ID_VPMN ="112000000001,112000000002";	//VPMN策划编号
	public static final long OFFER_ID_TEST_CARD = SoConstUtil.getParaDetailValue4OfferId("OFFER_ID_TEST_CARD");	//辽宁测试卡指定offer_id   111150001200L


	/*********************产品ID静态常量********************************************/
	public static final long IP_ZHITONGHAOMA_PROD_ID = 122004600003L;//IP直通号码产品
	public static final long GPRS_DATA_PROD_ID = 105053901001L;//GPRS数据产品ID
	public static final long GPRS_DATA_SERVICE_ID = 102000053901L;//GPRS数据服务ID
	public static final long HUZHUAN_PROD_ID = 121000000019L;//呼叫转移产品ID

	/*********************服务ID静态常量********************************************/
	public static final long FAMILY_NET_SERVICE_ID = 102000090173L;	//家庭亲情网服务id
    public static final long CLOSE_SHORT_MSG_SERVICE_ID = 141000305017L; //关闭短消息服务ID
    public static final long GPRS_SERVICE_ID = 141000305025L; //无线上网功能ID

	/*********************属性ID静态常量********************************************/
    public static final long PROD_ATTR_ID_MUL_NUM = 2200023L;//号码
    public static final long PROD_ATTR_ID_MUL_CARD = 2200031L;//卡号
    public static final long PROD_ATTR_ID_IMEINUM = 151400000111L;//卡号
    public static final long PROD_ATTR_ID_SUB_NUM = 151000001101L;//成员号码属性
	public static final long PROD_ATTR_ID_IMEI = 151400000001L;//IMEI号
	public static final long PROD_ATTR_TER_SPEC = 151400000002L;//终端型号
	public static final long PROD_ATTR_ID_RES = 151400000003L;//实物编号
	public static final long PROD_ATTR_ID_CRAD = 151400000006L;//有价卡卡号
	public static final long PROD_ATTR_ID_BIND_BILL =151400000007L;//活动防拆包号码属性ID
	public static final long PROD_ATTR_ID_RES_CODE=151400000009L;//终端资源编码
	public static final long PROD_ATTR_ID_CHG_REASON=151400000010L;//换机原因
	public static final long PROD_ATTR_ID_CHG_REASON_REMARKS=151400000011L;//换机原因备注
	public static final long PROD_ATTR_ID_CHG_TEST_DEPARTYMENT=151400000012L;//退机检测单单位名称
	public static final long PROD_ATTR_ID_CHG_TEST_NO=151400000013L;//退机检测单编号
	public static final long PROD_ATTR_ID_GROUP_ACCT =151400000014L;//集团成员活动返充集团账户ID
	public static final long PROD_ATTR_ID_PTWLAN_DN =151000001813L; //普通高校WLAN热点属性
	public static final long PROD_ATTR_ID_GXWLAN_DN =151000001843L; //高校专用WLAN热点属性
	public static final long PROD_ATTR_ID_PTWLAN_USER_NAME=151000001811L;//普通WLAN用户名
	public static final long PROD_ATTR_ID_GXWLAN_USER_NAME=151000001841L;//高校WLAN用户名
	public static final long PROD_ATTR_ID_NCWLAN_USER_NAME=151000001821L;//农村WLAN用户名
	public static final long PROD_ATTR_ID_NCWLAN_AP=151000001825L;//农村WLANAP
	public static final long PROD_ATTR_ID_EQPT_SOURCE =151400000008L;//活动终端来源 --自购 --存库
	public static final long PROD_ATTR_ID_SCORE = 500000030251L;//积分
	public static final long PROD_ATTR_ID_RECEIPT = 500000030252L;//兑换单
	public static final long WORLD_ROAM_SERVICE_ID= 102000090117L; //国际漫游服务ID
	public static final long WORLD_CALL_SERVICE_ID= 102000090114L;//国际长途服务ID
	public static final long IP_ZHITONGHAOMA_AUTH_ATTR_ID = 152004600008L;//IP直通号码IDD权限属性ID
	public static final long IP_ZHITONGHAOMA_DIAL_METHOD_ATTR_ID = 152004600009L;//IP直通号码拨叫方式
	public static final long IP_ZHITONGHAOMA_TELE_ATTR_ID = 152004600010L;	//IP直通号码固定电话号码
	public static final long IP_ZHITONGHAOMA_PASSWORD_ATTR_ID = 152004600011L;//IP直通号码密码
	public static final long IP_ZHITONGHAOMA_HUCHUXIANZHI_ATTR_ID = 152004600012L;//IP直通号码呼出限制
	public static final long CROSS_PROVINCE_QINQING_PROD_ID = 111000000754L;//亲情省长途漫游优惠省代码属性
	public static final long BIRTHDAY_MIANDAN_ATTR_ID = 1L;//生日免单服务属性ID
	public static final long CROSS_PROVINCE_QINQING_PROVINCE_CODE_ATTR_ID = 1L;//亲情省长途漫游优惠省代码属性
	public static final long AMERI_KOREAN_QINQING_NUMBER_ATTR_ID = 1L;//美加韩长途亲情号码属性
	public static final long SECRETARY_PASSWORD_ATTR_ID = 1L; //移动秘书密码属性ID
	public static final long SMSTRANSFER_NUMBER_ATTR_ID = 1L;//短信转移号码属性ID
	public static final long EASYOWN_QINQING_NUMBER_ATTR_ID = 1L;//神州行亲情号码属性ID
	public static final long TWO_CITY_ONE_HOME_AREA_ATTR_ID = 1L;//两城一家漫游申请地区号
	public static final long LONGDISTANCE_FAVORABLE_PACKAGE_TYPE_ATTR_ID = 1L;//取消国际及台港澳长途定向优惠套餐套餐类型
	public static final int FAMILY_NET_SHORT_NUM = 661;//短号起始值,用于家庭亲情网组网默认值
	public static final long PROD_ATTR_ID_PRESENT_CARD = 151000001470L;//0507预存返话费9实体卡信息
	public static final long PROD_ATTR_ID_HEALTH_EXAMINATION = 151000001737L;//	健康体验[属性]
	public static final long PROD_ATTR_ID_3G_PHONE_IMEI = 151000000018L; //3g手机IMEI属性
	public static final long PROD_ATTR_ID_3G_OPEN_TYPE = 151000000017L; //3g手机入网类型
	public static final long PROD_ATTR_ID_3G_PHONE_SPEC = 151000000019L; //3g手机手机型号
	public static final long PROD_ATTR_ID_RETURN_CARD = 151000001738L;//	返还充值卡（元）[属性]
  	public static final String OFFER_TALK_TIME = "151000000077";//长漫通话时长（分钟）[属性]
  	public static final String FREE_CIVIL_TALK_TIME = "151000000036";//免费赠送国内时长（新套餐可用） 属性ID：151000000036
  	public static final long PROD_ATTR_ID_MONTH_NUM = 151000002195L;//收取月费数  --集团套餐年包
    public static final long INT_NUM_INST_SRV_ATTR = 151000000081L;//香港一卡多号属性编码
    public static final long PROD_ATTR_ID_GJMYDQ = 151000020101L;//漫游国家和地区
    public static final long PROD_ATTR_ID_GJIMEI = 151000020102L;//国际租机IMEI号
    public static final long PROD_ATTR_ID_GJQJFS = 151000020103L;//取机方式
    public static final long PROD_ATTR_ID_GJZJGJ = 151000020104L;//租金规则
    public static final long PROD_ATTR_ID_GJKSSJ = 151000020105L;//租机开始时间
    public static final long PROD_ATTR_ID_GJJSSJ = 151000020106L;//租机结束时间
    public static final long PROD_ATTR_ID_GJYJZJTS = 151000020107L;//预计租机天数
    public static final long PROD_ATTR_ID_GJSJZJTS = 151000020108L;//实际租机天数
    public static final long PROD_ATTR_ID_GJSHJB = 151000020109L;//设备损坏级别
    public static final long PROD_ATTR_ID_GJREMARK = 151000020110L;//备注
    public static final long PROD_ATTR_ID_GJCKJG = 151000020113L;//设备参考价格(元)
    public static final long TELAUTOGRAM_NUM = 151000305020L;//传真副号码
    public static final long PROD_ATTR_ID_GJPCJ = 151000020112L;//国际租机赔偿金属性
    public static final long PROD_ATTR_ID_GJPCREASON = 151000020111L;//国际租机赔偿原因
    public static final long PROD_ATTR_ID_ASSURE = 151003050030L;//担保类型
    public static final long PROD_ATTR_ID_YZTYPE = 151000000031L;//阈值分类
    public static final long PROD_ATTR_ID_TXTYPE = 151000000032L;//提醒类型
    public static final long PROD_ATTR_ID_TXLIMIT = 151000000033L;//提醒阀值
    public static final long PROD_ATTR_ID_RES_TERMINAL = 200060L;// 裸机价格
	public static final long PROD_ATTR_ID_BUSI_COMMITMENT = 200061L;// 合约优惠价格
	public static final long PROD_ATTR_ID_BUSI_PAYALL = 200062L;// 全额购机优惠价格
	public static final long PROD_ATTR_ID_HANDSET_PLOY = 151400000211L;// 终端offer的保险号
	public static final long PROD_ATTR_ID_INSUR_NUM = 24301L;// 保险offer的保险号
	public static final long PROD_ATTR_ID_INSUR_OFFERID = 151400000212L;// 保险offer的保险号
	public static final long PROD_ATTR_ID_USER_PLATFORM = 152000000320L;//用户当前平台

	public static final long PROD_ATTR_ID_BANK_FINANCE_VENDOR = 2001L;//新分期的第三方
	public static final long PROD_ATTR_ID_TRANSACTION_ID = 2002L;//新分期的交互ID

	public static final long PROD_ATTR_ID_FMC_NUMERATOR = 820625L;//FMC优惠分子
	public static final long PROD_ATTR_ID_FMC_DENOMINATOR = 820626L;//FMC优惠分母

	public static final long PROD_ATTR_ID_REPLACE_REASON = 200052L;// 换套餐原因

	public static final long PROD_ATTR_ID_FRI_VALUE = 820605L;//FRI排序
	public static final long FEE_ATTR_ID_FRI_VALUE = 840001L;//FRI费用

	public static final long PROD_ATTR_ID_GLOBAL_DISCOUNT = 820633L;

    public static final long FAMILY_NET_MAIN_SHORT_ATTR_ID = 151000000021L;//家庭网主号短号属性
	public static final long FAMILY_NET_SUB_SHORT_ATTR_ID = 151000000022L;//家庭网副号短号属性
	public static final long FAMILY_NET_SCORE_ATTR_ID = 151000000023L;//家庭网副卡积分合并属性
	public static final long FAMILY_NET_GROUP_MODE_ATTR_ID = 10002005L;//家庭类型：1:本地集团,2:省内集团

	public static final long FAMILY_NET_SHORT_NUM_BEGIN =551;	//家庭网短号开始值
	public static final long FAMILY_NET_SHORT_NUM_END =559;		//家庭网短号结束值

	public static final long CAMPUS_WLAN_PASSWORD_ATTR_ID =151000001812L;	//普通校园WLAN密码属性
	public static final long CAMPUS_SPECIAL_WLAN_PASSWORD_ATTR_ID =151000001842L;	//专有校园WLAN密码属性
	public static final long COUNTRY_WLAN_PASSWORD_ATTR_ID =151000001822L;	//农村WLAN密码属性
	public static final long ALL_NET_WLAN_PASSWORD_ATTR_ID =151000100001L;	//全网WLAN密码属性

	public static final long OFFER_PLOY_PRODOCT_TYPE_FEATURE_ID =10004010L;	//活动产品类型
	public static final long OFFER_PLOY_PAY_TYPE_FEATURE_ID =10004011L;	//活动付费方式

	public static final long BOSS_VPMN_ATTR_ID =152000000034L;	//BOSS VPMN属性ID

    public static final long FENSHIFENQU_ATTR_ID = 151000000004L;//分时分区编码

    public static final long PHONE_BOOK_ATTR_ID = 262100000208L;//号码簿属性ID
    public static final long PHONE_BOOK_ATTR_ID1 = 152088888880L;//号码簿属性ID,mainoffer特俗服务类型
    public static final long PHONE_BOOK_ATTR_ID2 = 152088888881L;//号码簿属性ID，addon上挂的

    // xuecy终端参数化信息
    public static final long TERMINAL_TYPE = 151400000104L;
    public static final long TERMINAL_FEE = 151400000105L;
	/**********************************产品侧FEATURE_ID 静态常量*************************/
	public static final long FEATURE_ID_BUSI_TRANS = 10002021L; //预存转移价格计划区分
	public static final long FEATURE_ID_BS_NAME = 10000108L; //营销活动 业务名称   --终端出库
	public static final long FEATURE_ID_BS_TYPE = 10000109L; //营销活动 业务包名称 --终端出库
	public static final long FEATURE_ID_PRICE_PLAN_EXP = 10000400L; //违约金表达式 ，终端补差款表达式
	public static final long FEATURE_ID_PENAL_EDITTYPE = 10000401L; //违约金展现方式 1: 输入折扣率  2: 修改金额  3: 不可修改
	public static final long FEATURE_ID_MIN_VALUE = 10002006L; //策划或者策划组的最小权值
	public static final long FEATURE_ID_MAX_VALUE = 10002007L; //策划或者策划组的最大权值
	public static final long FEATURE_ID_PLOY_IS_LOGOUT = 10004007L;//活动是否可删除featureId
	public static final long FEATURE_ID_ALLOW_BIND_IMEI = 10004000L;//活动是否防拆包featureId
	public static final long FEATURE_ID_UNBIND_IMEI_MONTH = 10004001L;//活动绑定IMEI时间
	public static final long FEATURE_ID_BASE_STATION =10002004L;	//分时分区基站
	public static final long FEATURE_ID_PLOY_RELAT_OFFER_MONTH=10004006L;//活动连带促销最小使用月份
	public static final long FEATURE_ID_PLOY_SEND_SMS=10040019L;//活动是否发送短信
	public static final long FEATURE_ID_PLOY_CHANNEL_BUDGET=10040072L;//代销商分期付款配置
	public static final long FEATURE_ID_PLOY_SEND_TWO_DEMENSION=10040041L;//活动是否发送二维码 two-dimension code
	public static final long FEATURE_ID_PLOY_CAN_CHG_BILL=10040039L;//活动是否能够设置防拆包号码
	public static final long FEATURE_ID_PLOY_CAN_PREPAY_DEDUCT=10040061L;//活动是否能够是预付费抵扣
	public static final long FEATURE_ID_PLOY_DEDUCT_ONLY_BOOK=10040038L;//活动是否代销商专款专用的账本类活动标志
	public static final long FEATURE_ID_PLOY_SYSTEM_PAY=10040070L;//活动是否系统充值标识，为1是系统充值
	public static final long FEATURE_ID_PLOY_RES_HOLD_MONTH=10004008L;//活动在网月分限制 没有限制则填0
	public static final long FEATURE_ID_PLOY_STOP_MONTH=10004009L;//活动允许执行停机保号的月份,0 代表没有限制
	public static final long FEATURE_ID_PLOY_CAN_APPOINT=10004013L;//活动是否可以预约
	public static final long FEATURE_ID_OLD_PROMO_AND_COND_ID = 10040042L;//活动新老系统映射 feature_value: promo_id, feature_text: cond_id
	public static final long FEATURE_ID_PLOY_CONTRACT_TYPE = 10004020L;//客户捆绑合约类型      01：全网统一预存购机 02：全网统一购机送费 03：本地购机优惠
	public static final long FREAURE_ID_PROD_KIND_SP = 10002018L;//营业撤单判断产品是否为中心业务
    public static final long FREAURE_ID_PLOY_IS_DES = 10040073L;//营业判断用户销户的时候营销按是否可以一起退订策划.
    public static final long FREAURE_ID_LINE_SPEED_TYPE = 2700002L;//ProfileId ,Line Speed Type
	public static final long FREAURE_ID_IS_ARP = 27000035L;
	public static final long FREAURE_ID_COUPON_GIVE = 2700003511L;//Offer送的ＣＯＵＰＯＮ
	public static final long FREAURE_ID_COUPON_USE = 2700003511L;//Offer使用ＣＯＵＰＯＮ
	public static final long FREAURE_ID_CPE_SEND_SFF = 2700206L;//CPE是否需要发SFF
	public static final long FREAURE_ID_FAMILY = 200065L;//是否family offer
    public static final long FEATURE_ID_IO_PRICE_CATAGORY_EXPRESSION = 2700349L;

    public static final long FREAURE_ID_PROBATION_OPERATION = 100043L;//试用期到期处理方式
    public static final long FREAURE_ID_PROBATION_TARGET = 100044L;//目标offer_ID

    public static final long FRETURE_ID_UNIT_TOSAP = 990100000005L;//送SAP的单位

	//积分兑换比例
	public static final long FEATURE_ID_RATE_MONEY = 10000200L; //积分兑换比例 积分抵扣分母(金额)
	public static final long FEATURE_ID_RATE_SCORE = 10000201L; //积分兑换比例 积分抵扣分子(积分)
	public static final long FEATURE_ID_RATE_MAX = 10000202L; //积分兑换比例 积分抵扣分子(积分)
	public static final long FEATURE_ID_SCORE_BRAND_LIMIT = 10000202L; //积分品牌限制
	public static final long FEATURE_ID_PLOY_MONEY = 10000103L; //营销活动 支付金额
	public static final long FEATURE_ID_BACK_MONEY = 10000105L; //营销活动 返回话费金额
	public static final long FEATURE_ID_OTT = 10000000L; //ott公用feature
	public static final long FEATURE_ID_CHECK_SURF_CONTROL_LIMIT = 2700074L; //是否校验surf control消费额度
	public static final long FEATURE_ID_VPN = 2700017L;
	public static final long FEATURE_ID_TIME_TRIGGER_MODE = 2700371L;
	public static String MOBILE_VOICE_FEATURE_VALUE = "1";
	public static String MBB_FEATURE_VALUE = "2";
	public static String Mobile_FAX_FEATURE_VALUE = "3";
	public static String FAMILY_FEATURE_VALUE = "4";
	public static String O365_OTT_FEATURE_VALUE = "20";
	public static String MDM_OTT_FEATURE_VALUE = "21";
	public static String WIMP_OTT_FEATURE_VALUE = "22";
	public static String M2M_OTT_FEATURE_VALUE = "5";//M2M
	public static String IOT_OTT_FEATURE_VALUE = "26";//IOT
	public static final long FEATURE_ID_WIMP_TYPE=2700058L;//PAYGO  or BUNDLE
	//积分兑换比例.end
	//基本策划信用度
	public static final long FEATURE_ID_CREDIT_VALUE = 10002001L; //信用度
	public static final long FEATURE_ID_CREDIT_LEVEL = 10002002L; //信用度等级
	//基本策划信用度.end
	public static final long FEATURE_ID_FENSHIFENQU = 10002027L;//套餐变更里的分时分区编码

    //群组家庭套餐 有家长统一付费 or 成员各自付费标记
    public static final long FEATURE_ID_UPAY_FLAG = 200012L;//群组家庭套餐 有家长统一付费 or 成员各自付费标记

    //账户级订购 主定价计划
    public static final long FEATURE_ID_MAIN_ACCOUNT_PRICE = 200083L;

    //SWITCH offer相关特征值
    public static final long FEATURE_ID_SWITCH_VOICE = 2700075;// YES/NO GSM_MAIN offer上的switch标识
    public static final long FEATURE_ID_SWITCH_HANDWARE = 2700076;//0/24 手机分期月数
    public static final long FEATURE_ID_SWITCH_ELIGIBLE = 2700077;//12 最小出账期数
    public static final long FEATURE_ID_SWITCH_HANDWARE_FLAG = 2700078;// YES/NO GSM_TER offer上的可换标识
    public static final long FEATURE_ID_SWITCH_HARDWARE_RESALE_PRICE = 2700079;//表达式算值
    public static final String NUM_OF_INSTALLMENT ="24";//分期次数

    public static final int SWITCH_DELETE = 0;//SWITCH记录业务失效（逻辑删除）
    public static final int SWITCH_CREATE = 1;//新建SWITCH记录
    public static final int SWITCH_MEANWHILE_SUCC = 2;//订购新手机同时SWITCH 成功
    public static final int SWITCH_WAIT = 3;//订购新手机后等待SWITCH
    public static final int SWITCH_LATER_SUCC = 4;//订购新手机延迟SWITCH 成功

    //SWITCH业务操作businessid
    public static final long BUSI_ID_SWITCH = 191001002902L;

    //Switch list price
    public static final long FEATURE_ID_SWITCH_LIST_PRICE = 990100000101L;

    //订单扩展信息
    public static final String SO_CUST_EXT_SWITCH_OFFERINST_ID = "switchOfferInstId";
    public static final String SO_CUST_EXT_INSTALLMENT_VALUE = "installmentValue";

    public static final String OSE_EGCampaignCode = "EGCampaignCode";
    public static final String SO_CUST_EXT_EGCampaignCode = "EG_CAMPAIGN_CODE";

	public static final String OSE_WaiveTheOrderSummary = "WaiveTheOrderSummary";
	public static final String SO_CUST_EXT_WaiveTheOrderSummary = "waiveTheOrderSummary";

	public static final String OSE_SubscriptionCommitment = "SubscriptionCommitment";
	public static final String SO_CUST_EXT_CommitmentPeriodLongerThan24Month = "commitmentPeriodLongerThan24Month";

    public static final String SO_CUST_EXT_INSTALLATIONS_STATUS = "INSTALLATIONS_STATUS";
	public static final String SO_CUST_EXT_TECHNICIAN_NEEDED = "TECHNICIAN_NEEDED";
    public static final String SO_CUST_EXT_MANUAL_MODIFY_TECH = "MANUAL_MODIFY_TECH";

    public static final String SO_CUST_EXT_BBR_UUID = "BBR_UUID";
    //物流公司信息
    public static final String SO_CUST_EXT_DELIVERY_GSM = "GSM";
    public static final String SO_CUST_EXT_DELIVERY_EMAIL = "EMAIL";
    public static final String SO_CUST_EXT_DELIVERY_SHIP_VIA_CODE = "SHIP_VIA_CODE";
    public static final String SO_CUST_EXT_DELIVERY_SHOP_ID = "SHOP_ID";

    //cr169
    public static final String SO_CUST_EXT_DELIVERY_CARRRIER_NAME = "CARRIER_NAME";
    public static final String SO_CUST_EXT_DELIVERY_ATTR1 = "ATTR1";
    public static final String SO_CUST_EXT_DELIVERY_ATTR2 = "ATTR2";
    public static final String SO_CUST_EXT_DELIVERY_ATTR3 = "ATTR3";
    public static final String SO_CUST_EXT_DELIVERY_ATTR4 = "ATTR4";
    public static final String SO_CUST_EXT_DELIVERY_LEGAL_ADDRESS_ID = "LEGAL_ADDRESS_ID";
    public static final String SO_CUST_EXT_DELIVERY_LEGAL_ADDRESS = "LEGAL_ADDRESS";
    public static final String SO_CUST_EXT_FE_DELIVERY_LEGAL_ADDRESS = "FE_LEGAL_ADDRESS";


    //switch damage fee price item
    public static final long SWITCH_SCREEN_DAMAGE_PRICE_ITEM=810000000;
    public static final long SWITCH_BACK_COVER_DAMAGE_PRICE_ITEM=810000001;
    public static final long SWITCH_BUTTONS_DAMAGE_PRICE_ITEM=810000002;
    public static final long SWITCH_CAMERA_DAMAGE_PRICE_ITEM=810000003;

    public static final String PARA_TYPE_SWITCH_INFO = "SO_SWITCH_INFO";
    public static final String PARA_CODE_SWITCH_RETAIN_TIME = "SWITCH_RETAIN_TIME";




    //群组、家庭套餐家长统一付费 or 各自付费
    public static final String GROUP_MANAGER_UNIPAY = "1";//群组、家庭套餐家长统一付费
    public static final String GROUP_MEMBER_SELF_PAY = "2";//群组、家庭套餐成员各自付费

	/**********************************产品表其他一些元素ID  静态常量*************************/
	public static final long WIRELESS_MUSIC_NORMAL_MEMBER_KIND_LEVEL = 201001000050L;//无线音乐普通会员liaozj
	public static final long WIRELESS_MUSIC_SENIOR_MEMBER_KIND_LEVEL = 201001000049L;//无线音乐高级会员liaozj
	public static final long WIRELESS_MUSIC_TASTE_SENIOR_MEMBER_KIND_LEVEL =  201001000051L;//无线音乐俱乐部体验型高级会员liaozj
  	//public static final long OFFER_COLOR_RING_ID = 201001000004L;	//彩铃用户组ID


	/**********************************规则集ID 静态常量********************************/
	public static final long RULESET_BACK_OFFER_CREATE = 103645L;//订购策划规则集
	public static final long RULESET_BACK_OFFER_LOGOUT = 103646L;//删除策划规则集
	public static final long RULESET_BACK_OFFER_CHANGER = 103647L;	//策划变更规则集
	public static final long RULESET_BACK_UNIPAY_CREATE = 103666L;//统一支付组网
	public static final long RULESET_BACK_UNIPAY_CANCEL = 103661L;//统一支付拆网
	public static final long RULESET_BACK_UNIPAY_MEMBER_ADD = 103687L;	//统一支付成员增加
	public static final long RULESET_BACK_UNIPAY_MEMBER_DEL = 103681L;	//统一支付成员删除
	public static final long RULESET_BACK_UNIPAY_MEMBER_INV = 103702L;	//统一支付成员邀请
	public static final long RULESET_BACK_FAMILY_PLAN_CREATE = 103906L;//家庭套餐组网
	public static final long RULESET_BACK_FAMILY_PLAN_MEMBER_ADD = 103907L;//家庭套餐成员增加

	/***********************************渠道ID 静态常量***********************************/
	public static String CHANNEL_TYPE_BUSINESSHALL ="1";//营业厅
	public static final int SO_CHANNEL_TYPE2=2;//渠道类型-客服
	public static final int CHANNEL_TYPE7=7;//后台自动处理渠道类型
	public static String CHANNEL_TYPE_CHANNEL ="3";//渠道  //add by yxd 2012-7-25 宽带
	public static final int CHANNEL_TYPE15=25; //营业批量渠道类型//add by majun 2012-7-28  批量订购增值策划
	public static String CHANNEL_TYPE_SMS ="23";//短厅
	public static final int CHANNEL_TYPE_OSE = 23;//短厅
	public static String CHANNEL_TYPE_KZXH ="51";//空中选号
	public static String OSE_ONLINE_CHANNEL = "OSE_ONLINE_CHANNEL";
	public static String OSE_OFFLINE_CHANNEL = "OSE_OFFLINE_CHANNEL";

	public static String SO_CHANNEL_CFG = "SO_CHANNEL_CFG";
	public static String TASK_INTER_FLAG = "TASK_INTER_FLAG";//后台进程和接口标识，"Y"表示是
	public static String SO_CHANNEL_TYPE_OSE = SoConstUtil.getChannelIdByChannelName("OSE");
	public static String SO_CHANNEL_TYPE_POINT_OF_SALES = SoConstUtil.getChannelIdByChannelName("POINT_OF_SALES");
	public static String SO_CHANNEL_TYPE_ESHOP = SoConstUtil.getChannelIdByChannelName("ESHOP");
	public static String SO_CHANNEL_TYPE_SELFCARE = SoConstUtil.getChannelIdByChannelName("SELFCARE");
	public static String SO_CHANNEL_TYPE_SELFCARE_APP = SoConstUtil.getChannelIdByChannelName("SELFCARE_APP");
	public static String SO_CHANNEL_TYPE_CALL_CENTER = SoConstUtil.getChannelIdByChannelName("CALL_CENTER");
	public static String SO_CHANNEL_TYPE_EXTERNAL_DEALER = SoConstUtil.getChannelIdByChannelName("EXTERNAL_DEALER");
	public static String SO_CHANNEL_TYPE_BACK_OFFICE = SoConstUtil.getChannelIdByChannelName("BACK_OFFICE");
	public static String SO_CHANNEL_TYPE_TELEMARKETING = SoConstUtil.getChannelIdByChannelName("TELEMARKETING");
	public static String SO_CHANNEL_TYPE_WHOLE_SALE = SoConstUtil.getChannelIdByChannelName("WHOLE_SALE");
	public static String SO_CHANNEL_TYPE_CUSTOMER_OWNED_PROTAL = SoConstUtil.getChannelIdByChannelName("CUSTOMER_OWNED_PROTAL");
	public static String SO_CHANNEL_TYPE_SMS = SoConstUtil.getChannelIdByChannelName("SMS");
	public static String SO_CHANNEL_TYPE_IRV = SoConstUtil.getChannelIdByChannelName("IRV");
	public static String SO_CHANNEL_TYPE_KEY_ACCOUNT_MANAGER = SoConstUtil.getChannelIdByChannelName("KEY_ACCOUNT_MANAGER");
	public static String SO_CHANNEL_TYPE_USSD = SoConstUtil.getChannelIdByChannelName("USSD");


	/*********************************短信模板参数 静态常量*************************************/
  	public static final String SMS_OFFER_ID ="OFFER_ID";
  	public static final String SMS_INST_OFFER_ID ="INST_OFFER_ID";
  	public static final String SMS_USER_ID ="USER_ID";
  	public static final String SMS_OFFER_TYPE ="OFFER_TYPE";
  	public static final String SMS_PRODUCT_ID ="PRODUCT_ID";
  	public static final String SMS_EXT_1 ="EXT_1";
  	public static final String SMS_EXT_2 ="EXT_2";
  	public static final String SMS_TAMPLATE_ID ="TAMPLATE_ID";
  	public static final String SMS_X_REGION_ID ="X_REGION_ID";
  	public static final String SMS_SYSTEM_TEMPLATE_ID ="SMS_SYSTEM_TEMPLATE_ID";//外部系统模板编号
  	public static final String SMS_PARAM_MAP ="param_map";
  	public static final String SMS_IS_NEED_FUZZY ="IS_NEED_FUZZY";//是否需要模糊处理
	public static final String SMS_SEND_FLAG ="SEND_FLAG";//是否需要模糊处理
  	public static final String SMS_DESTNUM = "DESTNUM";
  	public static final String SMS_OPTCODE ="OPTCODE";
  	public static final String SMS_REGION_ID = "REGION_ID";
  	public static final String SMS_PORT = "PORT";
  	public static final String SMS_SENDDATE = "SENDDATE";


  	/******* ************小余额监控 静态常量START***********************************/
	//类型
	public static final int USER_MONITOR_TYPE1= 0;//新用户
	public static final int USER_MONITOR_TYPE2= 1;//全球通国际长途
	public static final int USER_MONITOR_TYPE3= 2;//非全球通国际长途
	public static final int USER_MONITOR_TYPE4= 3;//梦网短彩信
	//小余额监控状态
	public static final int USER_MONITOR_STATE_DO= 1;//
	public static final int USER_MONITOR_STATE_CANEL= 3;//

	/**************策划类型*****************************************************/
	public static final String OFFER_VAS_YHGX = "OFFER_VAS_YHGX";
	public static final String OFFER_VAS_PLOY = "OFFER_VAS_PLOY";
	public static final String OFFER_PLAN_JTW = "OFFER_PLAN_JTW";
	public static final String OFFER_PLAN_GSM = "OFFER_PLAN_GSM";
	public static final String OFFER_VAS_OTHER = "OFFER_VAS_OTHER";
	public static final String OFFER_VAS_COMB = "OFFER_VAS_COMB";
	public static final String OFFER_VAS_INSURANCE = "OFFER_VAS_INSURANCE";
//	public static final String OFFER_VAS_EXTERNAL = "OFFER_VAS_EXTERNAL";
	public static final String OFFER_PLAN_INSURANCE = "OFFER_PLAN_INSURANCE";
	public static final String OFFER_PLAN_RESOURCE = "OFFER_PLAN_RESOURCE";
	public static final String OFFER_PLAN_CUSTOMER = "OFFER_PLAN_CUSTOMER";
	public static final long BUSI_ID_SUBSCRIBE_INSURANCE=192200000011L;
	public static final long INSURANCE_OFFER_ID = 80000022L;
	public static final long INSURANCE_ATTR_CONTACT = 152088888882L;
	public static final long INSURANCE_ATTR_EMAIL = 152088888883L;
	public static final long INSURANCE_ATTR_UPDATE_SERIAL = 152088888884L;
	public static final long INSURANCE_ATTR_POLICY_NO = 24301L;
	public static final long INSURANCE_ATTR_ORIG_SERIVAL = 152088888886L;
	public static final long INSURANCE_ATTR_EXTERNAL_EANCODE = 262100001030L;
	public static final long INSURANCE_ATTR_EXTERNAL_MEMORY = 262100001031L;
	public static final long INSURANCE_ATTR_EXTERNAL_COLOR = 262100001032L;
	public static final long INSURANCE_ATTR_EXTERNAL_BRAND = 262100001033L;
	public static final long INSURANCE_ATTR_EXTERNAL_DESCRIPTION = 262100001034L;
	public static final long INSURANCE_ATTR_EXTERNAL_MODEL = 262100001035L;
	public static final long INSURANCE_ATTR_EXTERNAL_IMEI = 151400000111L;
	public static final long INSURANCE_ATTR_EXTERNAL_DEVICEPRICE = 262100001037L;
	public static final long INSURANCE_ATTR_DEVICE_NAME = 24304L;
	public static final long INSURANCE_ATTR_CLAIM_QUARANTINE_END_DATE = 262100001038L;
	public static final long INSURANCE_ATTR_CLAIM_QUARANTINE = 2700367L;

	public static final String INSX_USER_INSURANCE_REL_EXT_DEVICE_NAME = "DEVICE_NAME";
	public static final String INSX_USER_INSURANCE_REL_EXT_TAX_MONEY = "TAX_MONEY";

	//tanyan 2018/5/24 fmc special handle
	public static final long INSURANCE_ATTR_FMCGROUPTYPE =  151400000301L;
	public static final long INSURANCE_ATTR_FMCGROUPID =  151400000302L;
	public static final long INSURANCE_ATTR_FMCCOUNTFLAG =  151400000303L;
	public static final long INSURANCE_ATTR_FMCRULE =  151400000304L;
	public static final long INSURANCE_ATTR_NUMERATOR = 820625L;
	public static final long INSURANCE_ATTR_DENOMINATOR = 820626L;

	public static final long INSURANCE_PROD_SPEC_ID = 172000000024L;
	public static final long INSURANCE_CATALOG_ID = 211100000011L;
	public static final long INSURANCE_TIMES_ATTR = 30093L;
	public static final long INSURANCE_TYPE_ATTR = 2700054L;
	public static final long HANDSET_MODEL = 990200000008L;
	public static final long HANDSET_COLOR = 990200000001L;
	public static final long HANDSET_MEMORY = 990200000004L;
	public static final long HANDSET_PARTY_NUM = 990100000007L;
	public static final long HANDSET_CARRIER = 990200000008L;
	public static final long HANDSET_MANUFACTURER = 990200000003L;
	public static final long HANDSET_DESCRIPTION = 990100000003L;
	public static final long HANDSET_TYPE =990200000009L;
	public static final String HANDSET_CODE = "101";
	public static final String TABLET_CODE = "105";
	public static final long HANDSET_RESALE_FEATURE_ID=2700060L;
	public static final long INSURANCE_MERCHANT_ID=2700362L;
	public static final long TABLET_RESALE_FEATURE_ID=2700061L;
	public static final long CLAIM_FEE_FEATURE_ID =2700062L;
	public static final String INSURANCE_CLAIM = "INSURANCE_CLAIM";
	public static final String INSURANCE_CREATE = "INSURANCE_CREATE";
	public static final String FREE_INSURANCE_ORDER_TYPE = "FREE_INSURANCE_ORDER_TYPE";
	public static final String SWAP_IMEI_TEMPLATE_CODE="110070";
	public static final String CANCEL_INSUR_TEMPLATE_CODE="110060";
	public static final String BATCH_PREQ_TEMPLATE_CODE="10101";

	// 合约机类型
    public static final String OFFER_VAS_HANDSET = "OFFER_VAS_HANDSET";
    public static final String OFFER_VAS_EXTERNAL = "OFFER_VAS_EXTERNAL";
    public static final String OFFER_VAS_RESOURCE = "OFFER_VAS_RESOURCE";
    public static final String OFFER_VAS_CUSTOMER = "OFFER_VAS_CUSTOMER";
    public static final String OFFER_VAS_ACCOUNT = "OFFER_VAS_ACCOUNT";

    public static final String SRVC_SINGLE_RES = "SRVC_SINGLE_RES";
    public static final String OFFER_VAS_HARDWARE = "OFFER_VAS_HARDWARE";
	/***************策划类型****************************************************/

	/**************策划关系类型*****************************************************/
	public static final String OFFER_PLAN_INCLUDED_OFFER_KIND = "OFFER_PLAN_INCLUDED_OFFER_KIND";//用户关系受理可重复订购的，策划与组关系
	public static final String OFFER_YHGX_KIND_GENERAL_OFFER_PLAN = "OFFER_YHGX_KIND_GENERAL_OFFER_PLAN";//用户关系最大成员数，每月充许修改次，充许网外号码 组
	public static final String OFFER_PLAN_INCLUDE_OFFER_KIND = "OFFER_PLAN_INCLUDE_OFFER_KIND";
	public static final String OFFER_KIND_INCLUDE_OFFER_PLAN = "OFFER_KIND_INCLUDE_OFFER_PLAN";
	public static final String OFFER_PLAN_GENERAL_SPEC_ROLE ="OFFER_PLAN_GENERAL_SPEC_ROLE";	//策划关联规格角色
	public static final String SRVC_SINGLE_INCLUDED_SRVC_KIND = "SRVC_SINGLE_INCLUDED_SRVC_KIND"; //产品与组关系
	public static final String OFFER_PLAN_FRIEND_OFFER_YHGX = "OFFER_PLAN_FRIEND_OFFER_YHGX";//用户关系受理时校验父子号码基本策划相容关系
	public static final String OFFER_PLAN_MAIN_GENERAL_OFFER_PLAN_SUB = "OFFER_PLAN_MAIN_GENERAL_OFFER_PLAN_SUB";
	public static final String OFFER_KIND_INCLUDED_OFFER_KIND="OFFER_KIND_INCLUDED_OFFER_KIND";//目录包含的策划
	/***************策划关系类型****************************************************/

	/**************策划组类型*****************************************************/
	public static final String KIND_INNER_COMB_OFFER = "KIND_INNER_COMB_OFFER";
	/***************策划组类型****************************************************/

	public static final long EASYOWN_PUBLIC_OFFER_KIND_ID =200000000094L;	//神州行大众卡组编号
	public static final long CAMPUS_WLAN_PUBLIC_KIND_ID =200000110181L;	//校园WLAN普通版组编号
	public static final long CAMPUS_WLAN_SPECIAL_KIND_ID =200000110184L;	//校园WLAN专有版组编号
	public static final long ALL_NET_WLAN_KIND_ID =200000300006L;	//全网WLAN组编号
	public static final long COUNTRY_WLAN_KIND_ID =200000110182L;	//农村WLAN组编号
	public static final long CHANNEL_OFFER_KIND_ID=200000201011L;//合作类终端组ID

	/**************策划操作显示*****************************************************/
	public static final String OFFER_STATE_ADD = "OFFER_STATE_ADD";//订购
	public static final String OFFER_STATE_OLD = "OFFER_STATE_OLD";//不变
	public static final String OFFER_STATE_DEL = "OFFER_STATE_DEL";//退订


	/******************************策划策划关系常量*********************/
	public interface OfferRelatType {
		/**产品包**/
		public static final String OFFER_COMB_ZD = "97"; //主动连带
		public static final String OFFER_COMB_BD = "98"; //被动连带

		/**活动连带促销**/
		public static final String OFFER_PLOY_ZD = "87"; //主动连带
		public static final String OFFER_PLOY_BD = "88"; //被动连带

		/**基本策划连带增值策划**/
		public static final String OFFER_PLAN_ZD = "77"; //主动连带
		public static final String OFFER_PLAN_BD = "78"; //被动连带

		/**增值策划连带增值策划**/
		public static final String OFFER_VAS_ZD = "67"; //主动连带
		public static final String OFFER_VAS_BD = "68"; //被动连带


		public static final String INS_OFFER_RELAT_TYPE_PLOY = "9"; //活动连带出来的策划连带类型
		public static final String INS_OFFER_RELAT_TYPE_LCYJ = "8";//两城一家连带的策划连带类型
	}

	/********************宽带业务常用静态常量********************************************/

	// * 宽带账号和密码属性CODE,存储在ins_user_ext_XXX表里
	public static final long EXT_BROADBAND_ACCOUNT = 100001L;//宽带帐号
	public static final long EXT_BROADBAND_PASSWORD = 100002L;//宽带密码
	public static final long EXT_BROADBAND_ONU = 100003L;//宽带新装ONU
	public static final long EXT_BROADBAND_ONU_NEW = 100004L;//宽带移机ONU
	public static final String EXT_BROADBAND_EXTEND_NAME = "@net";//宽带账号的后缀名
	public static final String BROADBAND_DEFAULT_PWD = "111111";//宽带默认密码
	public static final int SO_EXPIRE_DEAL_TYPE_BROADBAND_YEAR_TO_MONTH = 5;//宽带到期转包月（到期处理表的处理类型）

	// Order Processing Progress - Process Type
	public static final String SO_PROCESS_NEW_CONNECTION = "SO_PROCESS_NEW_CONNECTION";
	public static final String SO_PROCESS_CHANGE_LINE_SPEED = "SO_PROCESS_CHANGE_LINE_SPEED";
	public static final String SO_PROCESS_CHANGE_OWNER_SHIP = "SO_PROCESS_CHANGE_OWNER_SHIP";
	public static final String SO_PROCESS_CHANGE_SERICES_ADDRESS = "SO_PROCESS_CHANGE_SERICES_ADDRESS";

	// Order Processing Progress - Process Code
	public static final String SO_PROCESS_CODE_SUBMIT_ORDER = "SUBMIT_ORDER";
	public static final String SO_PROCESS_CODE_CHECK_COMPLETNESS = "CHECK_COMPLETNESS";
	public static final String SO_PROCESS_CODE_TECHNICIAN_CONFIRM = "TECHNICIAN_CONFIRM";
	public static final String SO_PROCESS_CODE_ELECTORNIC_CONFIRM = "ELECTORNIC_CONFIRM";
	public static final String SO_PROCESS_CODE_CPE_DELIVERY = "CPE_DELIVERY";
	public static final String SO_PROCESS_CODE_ONLINE_DATE_CONFIRM = "ONLINE_DATE_CONFIRM";
	public static final String SO_PROCESS_CODE_CPE_PLUG_IN = "CPE_PLUG_IN";
	public static final String SO_PROCESS_CODE_FINISHED = "FINISHED";
	public static final String SO_PROCESS_CODE_TRANSFER_OWNERSHIP = "TRANSFER_OWNERSHIP";

	// Order Processing Progress - Process Status
	public static final String SO_PROCESS_STATUS_SUBMIT_ORDER = "Order is processing";
	public static final String SO_PROCESS_STATUS_CHECK_COMPLETNESS_FAIL = "Order is awaiting missing information";
	public static final String SO_PROCESS_STATUS_CHECK_COMPLETNESS_SUCC = "All missing information captured. Order is being processed";
	public static final String SO_PROCESS_STATUS_TECHNICIAN_CONFIRM_WITHOUT_TECHNICIAN = "Online date {0} confirmed without technician";
	public static final String SO_PROCESS_STATUS_TECHNICIAN_CONFIRM_WITH_TECHNICIAN = "Online date {0} confirmed with technician";
	public static final String SO_PROCESS_STATUS_CPE_DELIVERY_SUCC = "CPE send from warehouse";
	public static final String SO_PROCESS_STATUS_ONLINE_DATE_CONFIRM_CONNECTION_ESTABLISHED = "Connection established";
	public static final String SO_PROCESS_STATUS_ONLINE_DATE_CONFIRM_AGAIN = "Order has been rescheduled. New online date {0}";
	public static final String SO_PROCESS_STATUS_ONLINE_DATE_CONFIRM_AWAITING = "Order has been rescheduled. Awaiting new online date";
	public static final String SO_PROCESS_STATUS_ONLINE_DATE_CONFIRM_SUCC = "Online date confirmed";
	public static final String SO_PROCESS_STATUS_CPE_SETUP_WAITING = "Waiting for the router to be pluged in";
	public static final String SO_PROCESS_STATUS_CPE_SETUP_PLUGED_IN = "Router has been pluged in. Awaiting online date for change";
	public static final String SO_PROCESS_STATUS_CHANGE_OFFER_COMPLETED = "Change has been completed";
	public static final String SO_PROCESS_STATUS_TRANSFER_CONFIRM_WAITING = "Order wait for customer to confirm transfer ownership";
	public static final String SO_PROCESS_STATUS_TRANSFER_CONFIRM_SUCC = "Transfer ownership confirmed. Order is processing";
	public static final String SO_PROCESS_STATUS_CANCEL = "Order is cancelled";
	public static final String SO_PROCESS_FIBIA_XDSLMANUAL_COMPLETNESS_FAIL = "Order is waiting for termination of current broadband connection to be handled. After that the order will continue";
	public static final String SO_PROCESS_FIBIA_XDSLMANUAL_COMPLETNESS_SUCC = "A termination is now registered on the current connection and the order is now processing";
	public static final String SO_PROCESS_FIBIA_CONTACT_IN_VAIN_A ="Technician has tried to contact the customer in order to settle on a confirmed online date but could not reach the customer. Order is awaiting action from Telenor";
	public static final String SO_PROCESS_FIBIA_CONTACT_IN_VAIN_B ="Fiberconsultant has tried to contact the customer in vain. Order is awaiting action from Telenor";
	public static final String SO_PROCESS_SBBU_WAITING_SIGN_POA ="Order is waiting for customer to sign POA";
	public static final String SO_PROCESS_SBBU_WAITING_ACCEPT_POA ="Order is waiting for current operator to accept the SBBU request";
	public static final String SO_PROCESS_SBBU_REJECT ="SBBU requet is rejected from other operator";
	public static final String SO_PROCESS_SBBU_ACCEPTED ="Current operator have accepted the SBBU request";
	public static final String SO_PROCESS_ONLINEDATE_CONFIRM_WITH_DIGGING="Online date {0} confirmed with ";
	public static final String SO_PROCESS_ONLINEDATE_CONFIRM_WITH_DIGGING_PROJECT_TECH=" and technician";
	public static final long FIRST_MONTH_FREE = 500002000050L;//宽带首月免费FIRST_MONTH_FREE

	// * 宽带接入方式、带宽属性ID
    public static final long BROADBAND_EXPIRE_METHOD = 500000030140L;//到期处理方式
    public static final String BROADBAND_EXPIRE_METHOD_STOP = "1";//到期停机

	// * 到期处理静态常量
    public static final int SO_EXPIRE_DEAL_TYPE_BROADBAND_EXPIRE_STOP = 1;//宽带到期停（到期处理表的处理类型）
    public static final int SO_EXPIRE_DEAL_TYPE_BROADBAND_EXPIRE_REMIND = 2;//宽带到期提醒（到期处理表的处理类型）
    public static final int SO_EXPIRE_DEAL_TYPE_CONVENIENT_USER_DESTROY = 7;//一次性卡到期销户（到期处理表的处理类型）
    public static final int SO_EXPIRE_DEAL_TYPE_AUTO_ACTIVE = 3;//预开通用户自动激活（到期处理表的处理类型）
    public static final int SO_EXPIRE_DEAL_TYPE_BROADBAND_PREBOOKING_STOP = 28;//宽带预约停机（到期处理表的处理类型）
    public static final int SO_EXPIRE_DEAL_TYPE_WLAN_BROADBAND_PREBOOKING_STOP = 55;//WLAN预约停机（到期处理表的处理类型）
    public static final int SO_EXPIRE_DEAL_TYPE_WLAN_BROADBAND_PREBOOKING_RESTART = 85;//WLAN恢复开机（到期处理表的处理类型）
    public static final int SO_EXPIRE_DEAL_TYPE_BROADBAND_CANCEL_REMIND = 29;//宽带取消拆机提醒（到期处理表的处理类型）
    public static final int SO_EXPIRE_DEAL_TYPE_MULTIPLE_SIM_FREEZE = 20;//多卡多号回收号码（到期处理表的处理类型）
    public static final int SO_EXPIRE_DEAL_TYPE_PROTATION = 10;//试用期产品到期处理（到期处理表的处理类型）
    public static final int SO_EXPIRE_DEAL_TYPE_CHANGE_OFFER_FUTURE_ACTIVE = 12;//换套餐未来生效（到期处理表的处理类型）
    public static final int SO_EXPIRE_DEAL_TYPE_CHANGE_OFFER_FUTURE_ACTIVE_DEAL_VPMN = 1117;//换套餐未来生效处理VPMN（到期处理表的处理类型）
	public static final int SO_EXPIRE_DEAL_TYPE_CONTRACT_ORDER = 66;//合同转订单未来生效offer
	public static final int SO_EXPIRE_DEAL_TYPE_PHONEBOOK_ADD_ON = 88;//退订addOn，未来生效处理phoneBook
	public static final int SO_EXPIRE_DEAL_TYPE_PHONEBOOK_CHANGE_OFFER = 89;//退订addOn，未来生效处理phoneBook
	public static final int SO_EXPIRE_DEAL_TYPE_ESIM_OFFER_UNSUBSCRIBE_FUTURE = 50;//未来退订eSim offer

    // * 用户扩展表属性(ATTR_CODE)常量
    public static final long USER_EXT_PRE_STOP_TIME = 101384L; //预约停机时间属性ID
    //public static final long One_Card_Side_Number_Offer_ID = 111004035826L;//一卡双号副号策划ID
    public static final String SO_WF_LABEL_TerminationWorkFlow = "TerminationWorkFlow";
    public static final String SO_WF_LABEL_TAFTerminationWorkFlow = "TAFTerminationWorkFlow";
    public static final String SO_WF_LABEL_BBTerminationWorkFlow = "BBTerminationWorkFlow";

    // CRM与SFF接口类型
    public static final String BROADBAND_INTF_TYPE_SEND = "SEND";
    public static final String BROADBAND_INTF_TYPE_RECV = "RECV";
    // CRM与OpenNet接口类型
    public static final String BROADBAND_INTF_TYPE_RESP = "RESP";
    // CRM与SFF接口ID定义
    //add addr validate
    public static final String BROADBAND_INTF_ID_VALIDATE_ADDR = "VALIDATE_ADDR";
    public static final String BROADBAND_INTF_ID_OFFLINE_PRE_Q = "OFFLINE_PRE_Q";


    public static final String OPENNET_INTF_ID_OFFLINE_PRE_Q = "openNet_offlinePreQ";
    public static final String OPENNET_INTF_ID_ONLINE_PRE_Q = "openNet_onlinePreQ";
    public static final String OPENNET_INTF_ID_APPOINTMENT = "openNet_appiontMent";
    public static final String OPENNET_INTF_ID_PRESUBMIT = "openNet_preSubmit";
    public static final String OPENNET_INTF_ID_PRESUBMIT_SUMMARY = "openNet_preSubmit_summary";
    public static final String OPENNET_INTF_ID_SUBMIT_CHANGE = "openNet_submit_change";
    public static final String OPENNET_INTF_ID_CANCEL_SUBMIT = "openNet_cancelOrder";
    public static final String OPENNET_INTF_ID_RESCHEDULE = "openNet_reschedule";
    public static final String OPENNET_INTF_ID_SUMMARY = "openNet_summary";
    public static final String OPENNET_INTF_ID_FUL_STATUS = "openNet_FulfillmentStatus";
    public static final String OPENNET_INTF_ID_CEASESERVICE = "openNet_ceaseService";
    public static final String OPENNET_ERROR_NOT_EXIST_BASKET_ID = "NOT_EXIST_BASKET_ID";
    public static final String OPENNET_ERROR_NOT_EXIST_TIME_SLOT = "NOT_EXIST_TIME_SLOT";
    public static final String OPENNET_ERROR_SUBMIT_FAILURE = "SUBMIT_FAILURE";
    public static final String OPENNET_ERROR_NOT_EXIST_BASKET_ID_MSG = SoConstUtil.getParaDetailValueByCondition("SO_OPENNET_ERROR_MSG", "NOT_EXIST_BASKET_ID");
    public static final String OPENNET_ERROR_NOT_EXIST_TIME_SLOT_MSG = SoConstUtil.getParaDetailValueByCondition("SO_OPENNET_ERROR_MSG", "NOT_EXIST_TIME_SLOT");
    public static final String OPENNET_ERROR_NOT_EXIST_TIME_SLOT_MSG1 = SoConstUtil.getParaDetailValueByCondition("SO_OPENNET_ERROR_MSG", "NOT_EXIST_TIME_SLOT1");
    public static final String OPENNET_ERROR_NOT_EXIST_GDS_MSG = SoConstUtil.getParaDetailValueByCondition("SO_OPENNET_ERROR_MSG", "NOT_EXIST_GDS_BASKET_ID");
    public static final String VISIT_SERVICE_GDS_DIGGING = "GDS+Digging";
    public static final String VISIT_SERVICE_GIG_DIGGING = "GIG+Digging";
    public static final String VISIT_SERVICE_DIGGING_PROJECT = "Digging-project";
    public static final String VISIT_SERVICE_DIGGING = "Digging";
    public static final String VISIT_SERVICE_GDS = "GDS";
    public static final String VISIT_SERVICE_GIG = "GIG";
    public static final String TDC_FIBER_DIGGING_FLAG = SoConstUtil.getParaDetailValueByCondition("SO_TDC_DIGGING_FLAG", "FIBER");
    public static final String SO_CUST_EXT_DESELECTION_REASON_DATE = "DESELECTION_REASON_DATE";
    public static final String SO_CUST_EXT_DESELECTION_REASON_TEKST = "DESELECTION_REASON_TEKST";



    public static final long OPENNET_PRODUCT_TYPE= 2700356l;
    public static final long OPENNET_PRODUCT_IO= 2700352l;
    public static final long OPENNET_PRODUCT_CODE= 2700353l;
    public static final long OPENNET_PRODUCT_GROUP= 2700354l;
    public static final long OPENNET_PRODUCT_OPTION_CODE= 2700355l;
    public static final String OPENNET_TECHTYPE_FIBER= "FIBRE";

    public static final String OPENNET_INTF_ID_CONFIRM = "openNet_confirm";
    public static final String OPENNET_INTF_ID_STATUS = "openNet_getStatus";
    public static final String FIBIA_INTF_ID_STATUS = "fibia_getStatus";
    public static final String FIBIA_INTF_ID_PREQ="fb_getPreqResult";
    public static final String BROADBAND_INTF_ID_PRE_Q = "PRE_Q";
    public static final String BROADBAND_INTF_ID_PRE_Q_DM002 = "PRE_Q_DM002";
    public static final String BROADBAND_INTF_ID_PRE_V = "PRE_V";
    public static final String BROADBAND_INTF_ID_PLACE_ORDER = "PL_ORD";
    public static final String BROADBAND_INTF_ID_xDSL = "xDSL";
    public static final String BROADBAND_INTF_ID_REFERRAL_TERMINATION = "VOIP_REF";
    public static final String BROADBAND_INTF_ID_ORDER_TICKET = "ORDER_TICKET";
    public static final String BROADBAND_INTF_ID_PSTN_CHANGE = "PSTN_CHANGE";
    public static final String BROADBAND_INTF_ID_PL_VOIP = "PL_VOIP";
    public static final String BROADBAND_INTF_ID_CANCEL_REQ = "CANCEL_REQ";
    public static final String BROADBAND_INTF_ID_CANCEL = "CANCEL";
    public static final String BROADBAND_INTF_ID_CHANGE_REQ = "CHANGE_REQ";
    public static final String BROADBAND_INTF_ID_CHANGE = "CHANGE";
    public static final String BROADBAND_INTF_ID_RESCHEDULE = "RESCHEDULE";
    public static final String BROADBAND_INTF_ID_OPEN_STOP = "OPEN_STOP";
    public static final String BROADBAND_INTF_ID_CHANGE_TECK_PARAM = "CHANGE_TECK_PARAM";
    public static final String BROADBAND_INTF_ID_BILLING_SUSPEND = "BILLING_SUSPEND";
    public static final String BROADBAND_INTF_ID_BILLING_REFUND = "BILLING_REFUND";
    // CRM与SFF接口表状态定义
    public static final String BROADBAND_INTF_STATE_CREATE = "C";
    public static final String BROADBAND_INTF_STATE_PROCESS = "R";
    public static final String BROADBAND_INTF_STATE_FINISH = "O";
    public static final String BROADBAND_INTF_STATE_ERROR = "E";
    // CRM与SFF接口业务订单类型
    public static final String BROADBAND_INTF_ORDER_KIND_BUSI = "1";
    public static final String BROADBAND_INTF_ORDER_KIND_PRE_Q = "2";
    public static final String BROADBAND_INTF_ORDER_KIND_PRE_NEW_Q = "4";//cr82&84
    public static final String BROADBAND_INTF_ORDER_KIND_PRE_V = "3";
    public static final String BROADBAND_INTF_ORDER_KIND_xDSL = "4";//xDSL
    public static final String BROADBAND_INTF_ORDER_KIND_REFERRAL_TERMINATION = "5";
    public static final String BROADBAND_INTF_ORDER_KIND_ORDER_TICKET = "6";
    public static final String BROADBAND_INTF_ORDER_KIND_PSTN_CHANGE = "7";
    // CRM与SFF接口业务订单回复类型
    /**1-正常回复[包括PRE_Q有正常结果、PRE_V校验通过、PLACE_ORDER竣工完成]；**/
    public static final long BROADBAND_INTF_ORDER_RESPONSE_SUCCESS = 1;
    /**2-异常回复[PRE_Q校验失败、PRE_V异常、PLACE_ORDER异常]**/
    public static final long BROADBAND_INTF_ORDER_RESPONSE_EXCEPTION = 2;
    /**3-阶段性回复[用于PLACE_ORDER未竣工之前的属性回复]**/
    public static final long BROADBAND_INTF_ORDER_RESPONSE_PROCESS = 3;
    /**改单类型编码。改单为CHANGE，改onlinedate为RESCHEDULE**/
    public static final String SO_OPER_REASON_CANCEL = "CANCEL";
    public static final String SO_OPER_REASON_CHANGE = "CHANGE";
    public static final String SO_OPER_REASON_CHANGE_OFFLINE_DATE = "CHANGE_OFFLINE_DATE";
    public static final String SO_OPER_REASON_RESCHEDULE = "RESCHEDULE";

    /**集团客户批量PreQ模板下载FTP配置**/
    public static final String SO_B2B_DSL_PREQ_TEMPLATE = "SO_B2B_DSL_PREQ_TEMPLATE";

    /*********************************权限实体常量***********************************************/
    public static final long PLOY_STOP_ENTID  =20000012L;//活动退订业务按钮实体权限
    public static final long PLOY_QZ_STOP_ENTID  =20000013L;//活动强制中止按钮实体权限
    public static final long PLOY_RET_TERMINAL_ENTID  =20000014L;//活动捆绑销售退机实体权限
    public static final long PLOY_KUNCUN_CHANGE_ENTID  =20000015L;//活动库存换机实体权限
    public static final long PLOY_ZIGOU_CANGE_ENTID  =20000016L;//活动自购换机实体权限
    public static final long CHANGE_OFFER_ENTID = 20000017L;//换套餐实体权限
    public static final long CHANGE_OFFER_CURMONTH_ENTID = 20000018L;//换套餐实体权限
    public static final long SKIP_GOLD_BANK_ENTID =20000019L;	//跳过金库认证权限
    public static final long PREPAY_FEE_DISCOUNT_ENTID=20000020L;//营业算费窗口中的预付费优惠权限
    public static final long SO_FEE_DISCOUNT_ENTID=20000021L;//营业算费窗口中的受理费用优惠权限
    public static final long USER_COIN_IN_PUT_ENTID=20000022L;//兑换积分可输入权限[即是否有权限扣减为负积分]
    public static final long ELEC_PAPER_CREATE_ENTID=20000023L;//操作员打印电子免填单权限
    public static final long ELEC_PAPER_CANCEL_ENTID=20000024L;//操作员打印电子免填单撤单权限
    public static final long ELEC_PAPER_ADUIT_ENTID=20000025L;//稽核电子免填单
    public static final long ELEC_PAPER_LOOK_ENTID=20000026L;//查看电子免填单
    public static final long SKIP_VERIFY_ENTID=20000027L;//免身份校验
    public static final long CHANGE_GJZJ_ENTID=20000028L;//国际租机变更权限
    public static final long CARD_THIRD_SALE=20000029L;//后定义有价卡销售减免权限

    public static final long PERSONAL_BUSI_PRIV_ID = 20000000L;// 个人业务-操作行为
    public static final long OS_BUSI_STOP = 20000000L;//	营业停机
    public static final long OS_BUSI_OPEN = 20000001L;//	营业复机
    public static final long OS_MGR_STOP = 20000002L;//	管理停机
    public static final long OS_MGR_OPEN = 20000003L;//	管理复机
    public static final long OS_ACCT_STOP = 20000004L;//	帐务停机
    public static final long OS_ACCT_OPEN = 20000005L;//	帐务复机
    public static final long OS_KPNM_STOP = 17020009L;//	停机保号
    public static final long OS_KPNM_OPEN = 17020010L;//	取消停机保号
    public static final long OS_TEMP_OPEN = 20000006L;//	临时开机
    public static final long OS_ASSURE_OPEN = 20000007L;//	担保开机
    public static final long CHANGE_OFFER_BLACKLIST_ENTID = 20000032L;//黑名单用户换套餐实体权限
	// Add VPN Mobile Member按钮展示权限
    public static final long ADD_VPN_MEMBER_ENTID = 10056517L;

	/*********************其他静态常量 比较杂 无法分类********************************************/

	//客户视图功能配置表编号
	public static final int BS_SO_CUST_VIEW_FUNC_CFG = 1;
	public static final int BS_SO_TEMPLATE_STRUCT_FUN = 2;

	// 密码类型
	public static final int PASSWORD_TYPE_SYSTEM = 0;//系统自动生成
	public static final int PASSWORD_TYPE_CUSTOMIZE = 1;//用户指定
	//接口公共信息常量
	public static final String PUBINFO_REGION_ID = "REGION_ID";
	public static final String PUBINFO_COUNTY_CODE = "COUNTY_CODE";
	public static final String PUBINFO_CHANNEL_TYPE = "CHANNEL_TYPE";
	public static final String PUBINFO_OP_PASSWORD = SoConstUtil.getParaDetailValueByCondition("PUBINFO_OP_PASSWORD");
	public static final String PUBINFO_OP_LOGIN_ORG_ID = "OP_LOGIN_ORG_ID";
	public static final String PUBINFO_SOURCE = "SOURCE";//渠道编号

	//停开指令
	public static final String OS_OPEN = "0";//开
	public static final String OS_STOP = "1";//停

	/*********************** 状态位常量定义******************************/
	public static final int OS_STATE_BUSI_BIT = 1;//营业停机
	public static final int OS_STATE_BUSI_REL_BIT = 2;//营业连带停机
	public static final int OS_STATE_MGR_BIT = 3;//管理停机
	public static final int OS_STATE_MGR_REL_BIT = 4;//管理连带停机
	public static final int OS_STATE_CALL_BIT = 5;//呼出限制
	public static final int OS_STATE_CALL_REL_BIT = 6;//呼叫限制连带
	public static final int OS_STATE_ACCT_BIT = 7;//帐务停机
	public static final int OS_STATE_ACCT_REL_BIT = 8;//帐务连带停机
	public static final int OS_STATE_SO_PRE_DESTROY_BIT = 9;//营业预销
	public static final int OS_STATE_ACCT_PRE_DESTROY_BIT = 10;//账务预销
	public static final int OS_STATE_INCALL_BIT = 11;//呼入限制
	public static final int OS_STATE_STOLEN_BIT = 12;//被盗停机
	public static final int OS_STATE_KEEPNUM_BIT = 20;//停机保号
	public static final int OS_STATE_PPS_KEEPNUM_BIT = 60;//标准神州行停机保号
	public static final int OS_STATE_IPBUS_LOCK_ACCT = 61;//ipbus账户封锁




	/**************************状态位常量定义**********************************/
	public static final int OS_STATE_VOLUNTARY_BIT = 1;//自愿单停
	public static final int OS_STATE_VOLUNTARY_BOTH_BIT = 2;//自愿双停

	public static final int OS_STATE_MANAGE_BIT = 3;//管理单停
	public static final int OS_STATE_MANAGE_BOTH_BIT = 4;//管理双停

	public static final int OS_STATE_PAYMENT_PLAN_BIT =5;//支付计划单停
	public static final int OS_STATE_PAYMENT_PLAN_BOTH_BIT =6;//支付计划双停

	public static final int OS_STATE_HIGH_USAG_BIT =7;//高消费单停
	public static final int OS_STATE_HIGH_USAG_BOTH_BIT =8;//高消费双停

	public static final int OS_STATE_FRAUD_BIT =9;//欺诈单停
	public static final int OS_STATE_FRAUD_BOTH_BIT =10;//欺诈双停

	public static final int OS_STATE_INSOLVENCY_BIT =11;//破产单停
	public static final int OS_STATE_INSOLVENCY_BOTH_BIT =12;//破产双停

	public static final int OS_STATE_CREDIT_DEP_BIT =13;//信贷单停
	public static final int OS_STATE_CREDIT_DEP_BOTH_BIT =14;//信贷双停

	public static final int OS_STATE_ADDRESS_BIT =15;//地址单停
	public static final int OS_STATE_ADDRESS_BOTH_BIT =16;//地址双停

	public static final int OS_STATE_LOST_BIT =17;//丢失被盗停机

	public static final int OS_STATE_DUNING_BIT = 18;//催缴单停（后付费）
	public static final int OS_STATE_DUNING_BOTH_BIT =19;//催缴双停（后付费）

	public static final int OS_STATE_CREDIT_LIMIT_BIT =20;//信用度单停（后付费）
	public static final int OS_STATE_CREDIT_LIMIT_BOTH_BIT =21;//信用度双停（后付费）

	public static final int OS_STATE_USAGR_CONTROL_BIT =22;//消费控制单停
	public static final int OS_STATE_USAGR_CONTROL_BOTH_BIT =23;//消费控制双停

	public static final int OS_STATE_ACC_BIT =24;//账务单停（预付费 余额）
	public static final int OS_STATE_ACC_BOTH_BIT =25;//账务双停（预付费  余额）


	public static final int OS_STATE_VALID_BIT =27;//有效期双停(预付费)

	public static final int OS_STATE_PRE_DESTORY_BIT =29;//预销户（默认双停）
	public static final int OS_STATE_DESTORY_BIT =31;//销户（默认双停）

	public static final int OS_STATE_SPLIT_BIT = 34;//分账单停
	public static final int OS_STATE_SPLIT_BOTH_BIT = 35;//分账双停

	public static final String PRE_TERMINATE_GTC_CHANGE_FLAG = "10020";//预销户判定GTC变更标识

	public static final String  HAS_LBO_ORDER_INFO = "1";//该用户存在LBO订购信息

	public static final String CODE_BRACKET_LEFT = "【"; // 显示代码编号和名称用符合
	public static final String CODE_BRACKET_RIGHT = "】";

	//实物价格单位
	public static final String RES_LIMIT_STRING = "RES_LIMIT_STRING";//无限制

	public static final String BS_SO_SECOND_CONFIRM_NEED = "1";// 需要二次确认
  	public static final String BS_SO_SECOND_CONFIRM_NO_NEED = "0";// 不需要二次确认

	//备卡状态
	public static final int STATAS_INIT = 1; // 初始的可用状态
	public static final int STATAS_ACTIVE = 2; //备卡激活后的状态
	public static final int STATAS_FILL = 3; //备卡补卡状态
	public static final int STATAS_EXPIRE = 4; //备卡过期自动失效状态
	public static final int STATAS_DELETE = 5; // 备卡丢失后强制删除的状态
	//ADD BY HUANGHUI 20120924
	public static final int STATAS_LOSS = 6; //备卡挂失状态
	public static final int STATAS_UNLOSS = 7; //备卡解挂状态

	//允许用户服务密码错误的最大次数
	public static final int MAX_NUM_PWD_ERRTIMES = 5;

	//家庭网副卡
	public static final String VICE_MEMBER = "VICE_MEMBER";
	//家庭网主卡
	public static final String MAIN_MEMBER = "MAIN_MEMBER";
	//是否跨区业务
	public static final String IS_CROSS_BUSI = "IS_CROSS_BUSI";

	 //用户变更通知单静态数据
    public static final int CHANGE_TYPE_1 = 1;//状态变更（停开机状态，调用集团提供的接口进行白名单相应的增加中删除）；
    public static final int CHANGE_TYPE_2 = 2;//品牌变更（下周期的，需要修改用户的信用度并调用客户管理和计费接口提供的接口进行信用度变化通知，看看晁岳欣是否有现成的接口）；
    public static final int CHANGE_TYPE_3 = 3;//过户（调用集团提供的接口进行白名单解除）；
    public static final int CHANGE_TYPE_4 = 4;//换号（调用集团提供的接口进行白名单解除）；
    public static final int CHANGE_TYPE_5 = 5;//预销（调用集团提供的接口进行白名单解除）；
    public static final int CHANGE_TYPE_6 = 6;//帐务关系变更（需要调用客户管理和计费接口提供的接口进行信用度变化通知）；
    public static final int CHANGE_TYPE_7 = 7;//重入网（调用集团提供的接口进行白名单增加）；
    public static final int CHANGE_TYPE_8 = 8;//套餐变更（重新计算有效期）

    //外围系统用的用户状态代码
    public static final String  USER_STATUS_00 = "00";//正常
    public static final String  USER_STATUS_01 = "01";//单向停机
    public static final String  USER_STATUS_02 = "02";//停机
    public static final String  USER_STATUS_03 = "03";//预销户
    public static final String  USER_STATUS_04 = "04";//销户
    public static final String  USER_STATUS_05 = "05";//过户
    public static final String  USER_STATUS_06 = "06";//改号

	//预缴在渠道配置的生效方式
	public static final int CHNL_CFG_PAY_TYPE_1 = 1;//扣本金账本
	public static final int CHNL_CFG_PAY_TYPE_2 = 2;//先扣本金账本
	public static final int CHNL_CFG_PAY_TYPE_3 = 3;//现金缴款
	public static final int CHNL_CFG_PAY_TYPE_ALL = -1;//全部

	//账户的支付方式:1	移动充值       	2	专用卡（预付）3	储蓄卡4	信用卡（日控）5	信用卡帐户6	托收帐户9	一户通
	public static final int ACC_PAY_METHD_CHARGE= 1;//移动充值
	public static final int ACC_PAY_METHD_SPECIAL_CARD= 2;//专用卡（预付）
	public static final int ACC_PAY_METHD_SAVINGS_CARD= 3;//储蓄卡
	public static final int ACC_PAY_METHD_CREDIT_CARD_F_DATE_CONTRL= 4;//信用卡（日控）
	public static final int ACC_PAY_METHD_CREDIT_CARD_ACCOUNT= 5;//信用卡帐户
	public static final int ACC_PAY_METHD_TRUST_ACCOUNT= 6;//托收帐户
	public static final int ACC_PAY_METHD_HOUSEHOLD= 9;//一户通

	//外围处理表INSX_USER_CHG_NTFY字段CHANGE_TYPE状态值
	public static final int INS_USER_CHG_NTFY_CHANGETYPE_1 =1;//状态变更
	public static final int INS_USER_CHG_NTFY_CHANGETYPE_2 =2;//品牌变更
	public static final int INS_USER_CHG_NTFY_CHANGETYPE_3 =3;//过户
	public static final int INS_USER_CHG_NTFY_CHANGETYPE_4 =4;//换号
	public static final int INS_USER_CHG_NTFY_CHANGETYPE_5 =5;//预销
	public static final int INS_USER_CHG_NTFY_CHANGETYPE_6 =6;//账务变更
	public static final int INS_USER_CHG_NTFY_CHANGETYPE_7 =7;//重入网

	//个人接口后台扩展ID
	public static final String EXT_BUSINESS_ID = "EXT_BUSINESS_ID";//操作ID key
	public static final String EXT_OFFER_COUNT = "EXT_OFFER_COUNT";//策划订购份数
	public static final String EXT_IS_BATCH_ORDER = "EXT_IS_BATCH_ORDER";//是否批量订单key
	public static final String EXT_IS_RUN_RULE = "EXT_IS_RUN_RULE";//是否需要规则校验
	public static final String EXT_IS_SUBMIT_DATA = "EXT_IS_SUBMIT_DATA";//是否提交数据,通常校验时用
	public static final String EXT_CHANNEL_TYPE= "EXT_CHANNEL_TYPE";//受理渠道
	public static final String EXT_GROUPMEM_SRVPKG_DATA = "EXT_GROUPMEM_SRVPKG_DATA";//集团成员产品变更列表
	public static final String EXT_ORDER_REMARK = "EXT_ORDER_REMARK";//订单备注
	public static final String EXT_IS_MUTEXDEPEDN = "EXT_IS_MUTEXDEPEDN";//是否互斥依赖校验(目前只有集团订购时用)
	public static final String EXT_IS_PRE_SO_FLAG = "EXT_IS_PRE_SO_FLAG";//是否预约受理
	public static final String EXT_IS_BATCH_CTRL = "EXT_IS_BATCH_CTRL";//批量任务是否进行并发控制
	public static final String EXT_DONE_CODE = "EXT_DONE_CODE";//外部流水号
	public static final String EXT_DONE_CODE_TYPE = "EXT_DONE_CODE_TYPE";//外部流水号类型
    public static final String EXT_OFFER_DONE_CODE_MAP = "EXT_OFFER_DONE_CODE_MAP";//策划订单外部流水号
    public static final String EXT_PRESENT_OBJ_USER_MAP = "EXT_PRESENT_OBJ_USER_MAP";//策划产品上的presentObjUser
	public static final String EXT_OUT_SO_ORDER_DATA = "EXT_OUT_SO_ORDER_DATA";//订购返回的soOrderData
	public static final String EXT_IS_UPDATE_OFFER = "EXT_IS_UPDATE_OFFER";//是否变更offer的时间
	public static final String EXT_OFFER_INST_ID = "EXT_OFFER_INST_ID";		//策划实例ID
	public static final String EXT_MUL_ACCEPT = "EXT_MUL_ACCEPT";	//是否可以重复订购
	public static final String EXT_IS_ATMI_ENTER= "EXT_IS_ATMI_ENTER";//是否ATMI入口
	public static final String EXT_AFFECT_TYPE= "EXT_AFFECT_TYPE";//生效类型
	public static final String EXT_PROM_MONTH= "EXT_PROM_MONTH";//促销月份
	public static final String EXT_PREPAY_PAY_TYPE = "EXT_PREPAY_PAY_TYPE";	//预缴缴费方式
	public static final String EXT_COPY_OLD_PLAN_PROD="EXT_COPY_OLD_PLAN_PROD";//换套餐是否继承老的基本套餐的产品
	public static final String EXT_OFFER_RELATE_ID = "EXT_OFFER_RELATE_ID";//策划关联ID
	public static final String EXT_INST_OFFER_RELATE_ID = "EXT_INST_OFFER_RELATE_ID";	//策划关联实例ID
	public static final String EXT_IS_USE_PREPAY_BUSIFEE_PARAM = "EXT_IS_USE_PREPAY_BUSIFEE_PARAM";//预缴受理时,是否使用外部传入的费用参数
	public static final String EXT_WL_EFFECTIVE_TYPE = "EXT_LAN_EFFECTIVE_TYPE";  //固网受理生效类型
	public static final String EXT_WL_EXPIRE_TYPE = "EXT_LAN_EXPIRE_TYPE";//固网受理失效类型
	public static final String EXT_DONE_TYPE5="5";//外部流水类型（EXT_DONE_TYPE）： 批量任务
	public static final String EXT_IS_VPMN_OFFER = "EXT_IS_VPMN_OFFER";//B2B业务变更选的offer是否包含VPMN属性
	public static final String EXT_NEW_PROVISION_PLATFORM = "EXT_NEW_PROVISION_PLATFORM";//batch功能，前端传入的平台标志
    //父订单编号
    public static final String EXT_PRE_ORDER_ID = "EXT_PRE_ORDER_ID";
    public static final String EXT_IS_CHECK_NOSEE_KIND ="EXT_IS_CHECK_NOSEE_KIND";	//是否校验不可见策划组


	public static final String CRM_2_INTER_RETURN_CODE = "returnCode";// 接口返回编码
	public static final String CRM_2_INTER_RETURN_MSG = "returnMsg";// 接口返回信息
	public static final String CRM_2_INTER_RETURN_LIST = "returnList";//如果是查询列表：List returnList=new ArrayList(); returnList.add(Map);一个对象为一个Map
	public static final String CRM_2_INTER_RETURN_MAP = "returnMap";// 如果是一个对象，直接以Map存放返回
	public static final String CRM_2_INTER_COUNT = "count";// 返回的对象总数
	public static final String CRM_2_INTER_RETURN_ERROR_CODE = "INS1";// 处理失败代码
	public static final String CRM_2_INTER_RETURN_SUCCESS_CODE = "INS0";// 处理成功代码
	public static final String CRM_2_INTER_RETURN_IS_ORDER = "isOrderProduct";// 是否订购
	public static final String CRM_2_INTER_RETURN_XML = "returnXML";// 是否订购
	public static final String CRM_2_INTER_RETURN_SUCCESS_MSG = "SUCCESS";// 返回成功信息
	public static final String CRM_2_INTER_ERROR_CODE = "ErrorCode";//错误编号
	public static final String CRM_2_INTER_ERROR_DESC = "ErrorDesc"; //错误描述
	public static final String CRM_2_INTER_RESULT = "Result"; //返回结果XML报文
	public static final String CRM_2_INTER_ORDER_ID = "OrderId"; //订单编号
	public static final String CRM_2_INTER_INVOICE_NO = "Invoice_No"; // 发票号
	public static final String NOT_FAMILY_MEMBER_ERRCODE = "2001"; //不是家庭计划成员返回码
	public static final String NOT_FAMILY_MEMBER_ERRMSG = "NOT_FAMILY_MEMBER_ERRMSG";//尊敬的客户，您不是家庭计划成员，没有主卡，感谢您的使用
	public static final String CRM_2_INTER_SUCCESS_CODE = "0"; //调用CRM接口返回成功结果
	public static final String NOT_OPEN_FAMILY_OFFER = "1008"; //未开通家庭网套餐
	public static final String HAVE_NO_VICE_MEMBER = "2001"; // 没有副卡
	public static final String CRM_2_INTER_COMMON_ERROR_CODE = "99";

	public static final int PREPAY_PAY_TYPE_BLANCE = 1;//扣本金账本
	public static final int PREPAY_PAY_TYPE_BLANCE_FIRST = 2;//先扣本金账本
	public static final int PREPAY_PAY_TYPE_CASH = 3;//现金缴款

	//促销最大月份
	public static final int PROM_MAX_MONTH = 12;

	//产品包程控变更操作类型
	public static final String COMB_UPDATE_OPER_TYPE = "COMB_UPDATE";

	//预缴
	public static final String OFFER_TYPE_PREPAY = OfferTypeEnum.OFFER_PREPAY.getName();
	//捆绑
	public static final String OFFER_TYPE_TERMINAL = OfferTypeEnum.OFFER_TERMINAL.getName();
	//促销
	public static final String OFFER_TYPE_PROMOTION = OfferTypeEnum.OFFER_PROMOTION.getName();
	//DSMP
	public static final String OFFER_TYPE_DSMP = OfferTypeEnum.OFFER_DSMP.getName();
	//CBOSS
	public static final String OFFER_TYPE_CBOSS = OfferTypeEnum.OFFER_VAS_CBOSS.getName();

	public static final String BUSI_UNSUBSCRIBE_FLAG ="1";//取消退订标志

	//信用管理常量
	public static final String NET_YEAR_LEVLE = "SO_NET_YEAR_LEVEL";//在网年限等级划分
	public static final String YEAR_TO_LEVEL = "SO_YEAR_2_LEVEL";//在网年限与信用档次匹配
	public static final long IS_VIP_FLAG = 1;//是否vip用户标识


	public static final String RES_UNIT_STRING = "元";	//实物价格单位
	public static final int OUT_WARE_TYPE_EXTERNAL = 1;	//外围库
	public static int NEGATIVE_TYPE_IS = 1;//可负兑换类型

	//营业实物相关值
	public static final int RESEXCHG_STATE_NOEXCHG = 0;//未兑状态
	public static final int RESEXCHG_STATE_EXCHANGED = 1;//已兑换状态
	public static final int RESEXCHG_STATE_EXPIRE = 2;//已作状态
	public static final int RESEXCHG_STATE_ALLBACK = 4;//完全退货状态
	public static final int RESEXCHG_STATE_PARTBACK = 5;//部分退货状态
	public static final int RESEXCHG_STATE_REVOCATION = 7;//撤销状态

	public static final String RES_OUTSTORED_YES = "1";	//实物已领取
	public static final String RES_OUTSTORED_NO = "0";//实物未领取

	//实物兑换
	public static final String RES_EXCHANGE_TYPE_RULE = "1";

	public static final int RES_OPERTYPE_EXCHG = 0;//实物兑换
	public static final int RES_OPERTYPE_RECEDE = 1;//实物退货
	public static final int RES_OPERTYPE_TRADE = 2;//实物换货

	//实物兑换相关操作类型
	public static final String RES_USED_RECORD_USEDTYPE_GOODS_EXCH =  "900335";// 实物兑换

  	//开通取消标志
  	public static final String FUNCTION_COMMOND_OPEN = "C";
   	public static final String FUNCTION_COMMOND_CLOSE = "E";

	//家庭计划策划类型
	public static final String FAMILY_PLAN_OFFER_TYPE = "OFFER_PLAN_FAMILY";
	//家庭畅想计划策划类型
	public static final String FAMILY_POOL_OFFER_TYPE = "OFFER_PLAN_POOL";
	//家庭网策划类型
	public static final String OFFER_PLAN_JTW_OFFER_TYPE = "OFFER_PLAN_JTW";

	// OTT
	public static final String OFFER_PLAN_OTT = "OFFER_PLAN_OTT";
	public static final String OFFER_VAS_OTT = "OFFER_VAS_OTT";
	public static final long ATTR_PRODUCT_QUANTITY = 820334L;	//OTT_ADDON 的属性,变化时需要发PUSHC

	//Generic OTT
	public static final String OFFER_PLAN_OTTX = "OFFER_PLAN_OTTX";//Generic OTT main offer
	public static final String OFFER_VAS_OTTX = "OFFER_VAS_OTTX";//Generic OTT addon offer

	//bce_workflow,param_data = "bss_flag=OTTX"
	public static final String BCE_WORKFLOW_PARADATA_VALUE_OTTX = "OTTX";

	public static final long PROD_ATTR_ID_LICENSE_NUM = 820334L;// MDM Number of License属性

	//new OTT销户
	public static final long BUSI_ID_NEW_OTT_TERMINATE = 192800040001L;
	public static final long BUSI_ID_NEW_OTT_STOP_OPEN = 192800030001L;

	//用户关系受理策划类型
	public static final String USERRELAT_POOL_OFFER_TYPE = "OFFER_VAS_YHGX";

	public static final String CM_USER_OS_STATUS = "0";//客管用用户停开机状态


	/**
	 * 动感地带AB客户标识 A：A类  B：B类
	 */
	public static final long MOZONE_CUST_TYPE = 191006L;

	//add by yal.fang 2012-07-20
	public static final long BP_TAMPLATE_ID = 11010030L;//通用模板ID
	public static final String CUST_INFO_FORM_NAME ="cmCustFrmCustInfo"; //客户信息formId
    public static final String CUST_CONT_FORM_NAME ="cmCustFrmContInfo"; //客户拥有者信息formId
    public static final String ACCT_INFO_FORM_NAME="cmAcctFrmAccount"; //账户信息formId
    public static final String ACCT_CONT_FORM_NAME="cmAcctFrmAcctCont"; //担保人信息formId
    public static final String CUST_ORDER_DC_NAME = "cmCustomerOrderDC";
    public static final String INS_ACCT_INFO_FORM_NAME="frmNormal_cmInsAcctForm"; //分期账户信息formId


	public static final String UNACTIVE_USER_PREORDER = "UNACTIVE_USER_PREORDER";
	public static final long PREORDER_PREPAY_MAX_MONTH = 12;//预约预缴默认最大月份
	public static final String PREORDER_PREPAY_MAX_MONTH_CONF = "PREORDER_PREPAY_DEFAULT_MAX_MONTHS";//预约预缴默认最大月份配置

	public static final int CANNOT_MUL_ACCEPT = 1;//不可以重复订购
	public static final int CAN_MUL_ACCEPT = 2;//可以重复订购

	//add by majun 2012-08-02  批量套餐变更
	public static final String MOBILE_REG = "^((((13[5-9]{1})|(15[0,1,2,7,8,9]{1})|(18[2,7,8]{1})){1}\\d{1})|((134[0-8]{1}){1})){1}\\d{7}$";

	//add by zhuyu 68777 20120725 begin
	//资费属性订单类型
  	public static final int PRICE_STTR_ORDER_TYPE_PRODUCT= 1;
  	public static final int PRICE_STTR_ORDER_TYPE_OFFER= 2;

  	public static final long SOS_ROLLBACK_OPERATE_TYPE =4;//订单回退注销SIM卡

	public static final int INVC_FLAG_ONE = 1;//注销原发票
	public static final int INVC_FLAG_TWO = 2;//开负发票

	//名单类型 add by yal.fang
	public static final int MONTYPE_IS_BLACK =0;	//黑名单
	public static final int MONTYPE_IS_WHITE =1;	//白名单
	public static final int MONTYPE_IS_RED =2;		//红名单

	public static final String SPECIAL_LIST_TYPE_QUERY ="query";
	public static final String SPECIAL_LIST_TYPE_CHECK ="check";
	//add by yal.fang @2012-08-09
	public static final String OFFER_PLAN_TYPE_IS_FAMILY ="OFFER_PLAN_JTW";	//家庭网套餐类型
	public static final long SOS_ROLLBACK_OPERATE_TYPE_NEW =5;//订单回退注销SIM卡
    public static final long   PRODUCT_ID_FAMILY_POOL_PRO =121000000268L;//家庭畅想计划主号共享话费池产品ID

	//生效方式
	public static final String LI_JI =  EffEnum.LI_JI_SHENG_XIAO.getName();//立即
	public static final String CI_YUE =  EffEnum.CI_YUE_SHENG_XIAO.getName();//次月
	public static final String LIJI_OR_CIYUE =  EffEnum.LI_JI_OR_CI_YUE_SHENG_XIAO.getName();//立即或次月
	public static final String SHOU_GONG_ZHI_DING =  EffEnum.SHOU_GONG_ZHI_DING_SHENG_XIAO.getName();//手工指定

	public static final String CHG_CUST_SETPWD_PARA ="X_SETPWD_SO_CHANGE_CUST";	//过户时密码重置参数 add by fangyl @2012-08-25
	//群组套餐类型
	public static final String SO_GROUP_OFFER_TYPE = "SO_GROUP_OFFER_TYPE";

	//亲情礼包激活关联用户关系策划
	public static final String SO_PROMO_RELATE_SPROM = "PROMO_RELATE_SPROM";

	//用户关系区号对应地州
	public static final String SO_USER_RELAT_COUNTY_CODE = "SO_USER_RELAT_COUNTY_CODE";

	//购物车打印配置
	public static final String BCC_SHOPCART_PRINT = "BCC_SHOPCART_PRINT";

	//店员编码
    public static final String EXT_CLERK_NO = "EXT_CLERK_NO";
    //发票抬头
    public static final String EXT_INVOICE_TITLE = "EXT_INVOICE_TITLE";
    //cboss批次号
    public static final String EXT_TO_CBOSS_BATCH_ID = "EXT_TO_CBOSS_BATCH_ID";
    //属性Map传入
    public static final String EXT_SO_ATTR_MAP = "EXT_SO_ATTR_MAP";
    //客户扩展属性类型信息
    public static final String SO_CUST_EXT_TYPE = "SO_CUST_EXT_TYPE";


    //家庭网积分属性ID
    public static final long SO_JTW_SCORE = 151000000023L;
    //铁通捆绑策划类型
    public static final String VAS_TTKB_OFFER_TYPE = "OFFER_VAS_TTKB";
    //铁通捆绑操作ID
//    public static final long TTKB_BUSINESS_id = 191002000041L;
    //铁通解捆绑操作ID
//    public static final long TTJKB_BUSINESS_id = 191002000042L;
    //铁通捆绑成员变更操作ID
//    public static final long TTKBCYBG_BUSINESS_id = 191002000043L;
    //铁通捆绑成员添加操作ID
//    public static final long TTKBCYTJ_BUSINESS_id = 191002000044L;
    //铁通捆绑成员删除操作ID
//    public static final long TTKBCYSC_BUSINESS_id = 191002000045L;
    //铁通捆绑用户类型
//    public static final int TTKB__USER_TYPE = 12;
    //铁通捆绑主号角色ID
//    public static final long TTKB_MGR_ROLE_ID = 181000000041L;
    //铁通捆绑副号角色ID
//    public static final long TTKB_MEM_ROLE_ID = 181000000042L;
    //铁通捆绑副号EXT中的ATTR_CODE
//    public static final int TTKB_EXT_ATTR_CODE = 111111;
    // 铁通捆绑策划ID
//    public static final long TTKB_OFFER_ID = 111140070000L;

    //public static final long BUSI_FAMILY_PACKS_ACTIVATE = 191001009020L;//亲情礼包激活[操作]  del by tuhc

    //国际租机资源分类编号
    public static final long GJZJ_RES_SPEC_ID = 160301L;

    /*********************用户信息审核功能  --- 用户审核错误类型静态常量**********************/
    public static final String SO_USERINFO_AUDIT_ERR_TYPE1 = "1";  //用户名称不符
    public static final String SO_USERINFO_AUDIT_ERR_TYPE2 = "2";  //证件号码不符
    public static final String SO_USERINFO_AUDIT_ERR_TYPE3 = "3";  //证件地址不符
    public static final String SO_USERINFO_AUDIT_ERR_TYPE4 = "4";  //联系电话不符
    public static final String SO_USERINFO_AUDIT_ERR_TYPE5 = "5";  //联系人资料不符
    public static final String SO_USERINFO_AUDIT_ERR_TYPE6 = "6";  //担保信息不符

    public static final long XIANGGANG_ONE_CARD_MANY_NUMS_OFFER_ID = 111140060296L;//香港一卡多号月套餐策划ID   //策划编号入静态表CustServiceSVImpl编译报错暂时回退zhengzh

    public static final String DEFAULT_PASSWORD = SoConstUtil.getParaDetailValueByCondition("DEFAULT_PASSWORD");//开户默认初始密码

    public static final long FREE_139EMAIL = 111300142980L;//免费版139邮箱
    public static final long NORMAL_139EMAIL = 111300142981L;//5元版139邮箱
    public static final long VIP_139EMAIL = 111300142982L;//20元版139邮箱

    //public static final long FEIXIN_OFFER = 111300137704L;//飞信基础策划

    //终端来源
    public static final String EQPT_SOURCE_KUCUN ="1";//库存设备
    public static final String EQPT_SOURCE_ZIGOU ="2";//自购设备

    //科目
    public static final long CASH_ACC_CODE = 21000007L;//现金科目

    //一次性卡策划第8、9位的值
    public static final String CONVENIENT_OFFERID_RULE = "94";//便利卡策划第8、9位的值

    //国政通相关
    public static final String GZT_VERIFY_RLT_FAIL = "00";//国政通调用失败
    public static final String GZT_VERIFY_RLT_NO_CODE = "01";//库中无此号
    public static final String GZT_VERIFY_RLT_ATYPISM = "02";//不一致
    public static final String GZT_VERIFY_RLT_FIT = "03";//一致
    public static final String GZT_VERIFY_RLT_NAME_RULE_ERROR = "04";//姓名不合规则
    public static final String GZT_VERIFY_RLT_CODE_RULE_ERROR = "05";//身份证不合规则
    public static final String GZT_VERIFY_RLT_NAME_AND_CODE_RULE_ERROR = "06";//姓名和身份证均不合规则

    public static final String GZT_INVOKE_SUCC = "SUCC";//国政通调用成功
    public static final String GZT_INVOKE_FAIL = "FAILD";//国政通调用失败
    //国政通相关END

    //远程写卡传送给大唐接口的operType，0为开户 1为换卡业务
    public static final String WRITE_CARD_OPERTYPE_FOR_NEW_USERS = "0";
    public static final String WRITE_CARD_OPERTYPE_FOR_CHANGECARD = "1";
    //远程写卡传送给大唐接口的结果RESULT，0为成功1为失败
    public static final String WRITE_CARD_RESULT_SUCCES = "0";
    public static final String WRITE_CARD_RESULT_ERROR = "1";

    //国际漫游短信脚本
    public static final long ROAM_GPRS_SMS_DAILY_OFFER=111300118658L;//国际数据流量日套餐[策划]
    public static final long ROAM_GPRS_SMS_TEN_OFFER=111153001745L;//国际漫游提醒10M提醒产品
    public static final long ROAM_GPRS_SMS_FIFTEEN_OFFER=111153001746L;//国际漫游提醒15M提醒产品
    public static final long ROAM_GPRS_SMS_NOREMIND_OFFER=111153001744L;//国际漫游流量提醒不提醒产品
    public static final String ROAM_GPRS_SMS_DAILY_REGION="0";//bs_para_detail,中para_type=BA_ROAM_GPRS_SMS,para_code=0存储了免费地区的个数
    public static final int ROAM_GPRS_SMS_FIRST_REMIND=0;//首次提醒
    public static final int ROAM_GPRS_SMS_NOT_FIRST_REMIND=1;//非首次提醒
    //有套餐流量定时提醒
    public static final String GPRS_REMIND_TYPE_GRNERAL="GENERAL";//普通套餐
    public static final String GPRS_REMIND_TYPE_G3="G3";//G3上网套餐
    public static final String GPRS_REMIND_TYPE_FETION="FETION";//飞信

    //一卡多号服务ID
    public static final long SERVICE_ID_ONECARDSOMEPHONE = 141000000008L;


  //客户满意度调查相关 add by zhouwu
    /****营业厅短信评价*****/
	public static final String BMCC_EVAL_SYS_TYPE = "BMCC_EVAL_SYS_TYPE";//短信营业厅评价系统配置
	public static final String BMCC_SMS_EVAL_MOBILE = "BMCC_SMS_EVAL_MOBILE";//禁发手机
	public static final String BMCC_EVAL_HALL_TYPE = "BMCC_EVAL_HALL_TYPE";//禁发营业厅
	public static final String BMCC_EVAL_ORDER_SOURCE = "BMCC_EVAL_ORDER_SOURCE";//禁发订单来源
	public static final String BMCC_EVAL_ORDER_TYPE = "BMCC_EVAL_ORDER_TYPE";//禁发订单类型
	public static final String BMCC_EVAL_PRODUCT = "BMCC_EVAL_PRODUCT";//禁止下发的受理产品
	public static final String BMCC_EVAL_SMS_SUFIX = "BMCC_EVAL_SMS_SUFIX";//不同业务的附加短信内容
	public static final String BMCC_SMS_EVAL_CAN_SENT_END = "BMCC_SMS_EVAL_CAN_SENT_END";//允许发送时间（结束时间）19:00:00
	public static final String BMCC_SMS_EVAL_CAN_SENT_START = "BMCC_SMS_EVAL_CAN_SENT_START";//允许发送时间（起始时间）09:00:00
	public static final String BMCC_SMS_EVAL_SWITCH = "BMCC_SMS_EVAL_SWITCH";//短信评价开关
	public static final String BMCC_SMS_EVAL_TOTAL_SEND_PERDAY = "BMCC_SMS_EVAL_TOTAL_SEND_PERDAY";//每个客户每天发送的评价短信总数1
	public static final String BMCC_SMS_EVAL_TOTAL_SEND_PERMONTH = "BMCC_SMS_EVAL_TOTAL_SEND_PERMONTH";//每个客户每月发送的评价短信总数
	public static final String BMCC_EVAL_OPERATOR = "BMCC_EVAL_OPERATOR";//禁止下发的操作员

	//营业厅短信评价
//	public static final long SATISFY_SMS_BUSI_ID = 191002000007L; //del guoxg

	//打印相关 add by zhouwu ----------开始-------------
	//后付费品牌集合  后付费现在只有  全球通 和 随e行 ，随e行礼品卡为预付费
   	public static final String AFTER_BRAND="161000000001,161000000010";
    //保存证件信息的数据来源
    public static final int CERT_INFO_SOURCE_CUST =1; //客户资料
    public static final int CERT_INFO_SOURCE_WAR =2;  //担保人资料
    public static final int CERT_INFO_SOURCE_AGENCY =3; //经办人资料
    public static final int CERT_INFO_SOURCE_VALID =4; //系统身份认证资料
    //付费类型
  	public static final String PAY_TYPE_AFTER = "0"; //后付费
  	public static final String PAY_TYPE_BEFORE = "1";//预付费
    //家庭统一支付账务变更
	public static final long BUSI_ID_UNIFYCHANGE = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_UNIFYCHANGE");
	//基本账务关系变更
	public static final long BUSI_ID_ACCREL_CHANGE = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_ACCREL_CHANGE");
	//家庭计划成员变更
	//public static final long BUSI_ID_FAMILY_MEMBER_UPDATE = 191001009006L; //del by tuhc


	//转品牌过户
	//public static final long BUSI_ID_CHANGE_CUST_BRAND = 191001007006L; del by tuhc

	//所有品牌
   	public static final long BRAND_GOTONE =161000000001L;//全球通品牌

    //用户类型
   	public static final long USER_BRAND_ID_EASYOWN_CROWD = 161000000004L; //神州行大众卡
   	public static final long USER_BRAND_ID_EASYOWN_B = 161000000003L;//神州行B

   	//所有品牌
   	public static final long BRAND_SZXCTK =161000000005L;//神州行畅听卡品牌

    //0507赠卡属性
	public static final long DEPOSIT_RETURN_CALL_0507_CARD_ATTR_ID = 151000001470L;
	//IP直通号码属性
	public static final long IP_ZHITONG_NUMBER_ATTR_ID = 151100000015L;

	//一卡双号补卡
	//public static final long BUSI_ID_CHANGE_SIM_ONECARDTWONUM_BK = 191001011023L; /del by tuhc
	//一卡双号换卡
	//public static final long BUSI_ID_CHANGE_SIM_ONECARDTWONUM_HK = 191001011024L; //del by tuhc

    //add by zhouwu ----------结束-------------
    public static final String CM_ACCOUNT_PAY_METHOD ="CM_ACCOUNT_PAY_METHOD";//系统身份认证资料

    //ADD BY HUANGHUI 20121016 调用资源接口入参，查询资源respecID类型静态数据，11为查询卡，10为查询号码
    public static final long RES_TYPE_SIMCARD = 11L;
    public static final long RES_TYPE_PHONE_NUM = 10L;

    public static final String OFFER_PLAN_INCLUDE_OFFER_PLAN ="OFFER_PLAN_INCLUDE_OFFER_PLAN"; //连带关系KINDID

    public static final int CONVENIENT_FREE_VALUE_STATE_NEW = 1;//新增
    public static final int CONVENIENT_FREE_VALUE_STATE_UPDATE = 2;//修改
    public static final int CONVENIENT_FREE_VALUE_STATE_DEL = 3;//新增

    public static final String CITY_CODE_PREFIX = "CA_LIAONING_CITY_CODE_"; //静态数据前缀名   例如： 前缀+REGION/沈阳/SY

    public static final long SUB_ORG_ROLE_TYPE_ID_DAIBAN = 95108;//代办管理中心渠道类型

    public static final long FAMILY_PACKS_ACTIVITY_ATTR = 151400000001L;

    public static final long CAN_CHANGE_NET_GROUP_ID = 200000120002L;

    public static final long FV_NUMBER = 200000110025L;//亲情组id

	public static final long LN_IP_ZHITONGHAOMA_GR_OFFER_ID = SoConstUtil.getParaDetailValue4OfferId("LN_IP_ZHITONGHAOMA_GR_OFFER_ID"); //IP直通号码策划组    111150009010L

    public static final HashMap<String, Long> ACC_CODE_PRICE_MAP = new HashMap<String, Long>();//accCode与通用价格计划ID的对应关系

    public static final String SATISFY_INVESTIGATE_OPER_CODE = "SATISFY_INVESTIGATE";//客户满意度调查短信模板配置的业务操作编码 add by zhouwu
    public static final String SATISFY_INVESTIGATE_BACK_OPER_CODE = "SATISFY_INVESTIGATE_BACK";
    public static final String SATISFY_INVESTIGATE_RANDOM_CODE = "100";//客户满意度调查短信端口号 add by zhouwu
    public static final String SATISFY_INVESTIGATE_BACK_CODE = "700";//客户满意度调查短信反馈评价端口号
    public static final long SATISFY_INVESTIGATE_VERYGOOD_CODE = 1;
    public static final String SATISFY_INVESTIGATE_VERYGOOD_MSG = "Very satisfied with";//非常满意
    public static final long SATISFY_INVESTIGATE_GOOD_CODE = 2;
    public static final String SATISFY_INVESTIGATE_GOOD_MSG = "satisfied with";//满意
    public static final long SATISFY_INVESTIGATE_SOSO_CODE = 3;
    public static final String SATISFY_INVESTIGATE_SOSO_MSG = "general ";//一般
    public static final long SATISFY_INVESTIGATE_NOTGOOD_CODE = 4;
    public static final String SATISFY_INVESTIGATE_NOTGOOD_MSG = "Not satisfied with ";//不满意
    public static final long SATISFY_INVESTIGATE_NOTVERYGOOD_CODE = 5;
    public static final String SATISFY_INVESTIGATE_NOTVERYGOOD_MSG = "Very dissatisfied with ";//非常不满意

    //ADD BY HUANGHUI 20121129 BEGIN
    public static final String INTERNET_USER_INIT_PASSWORD = SoConstUtil.getParaDetailValueByCondition("DEFAULT_PASSWORD"); //互联网用户初始密码
    public static final String SERVICE_OPEN_STAUS = "1"; //用户订购服务开通状态：1
    public static final String SERVICE_UNOPEN_STAUS = "0"; //用户订购服务未开通状态：0
    public static final String INTERNET_PASSWORD_TYPE = SoConstUtil.getParaDetailValueByCondition("INTERNET_PASSWORD_TYPE"); //用户订购服务开通状态：1
    public static final String USER_PASSWORD_TYPE = SoConstUtil.getParaDetailValueByCondition("USER_PASSWORD_TYPE"); //用户订购服务未开通状态：0
    //ADD BY HUANGHUI 20121129 END


    static {
    	ACC_CODE_PRICE_MAP.put("21000017", 135009999997L);
    	ACC_CODE_PRICE_MAP.put("21000019", 135009999996L);
    	ACC_CODE_PRICE_MAP.put("21000012", 135009999995L);
    	ACC_CODE_PRICE_MAP.put("21000020", 135009999994L);
    	ACC_CODE_PRICE_MAP.put("21000018", 135009999993L);
    	ACC_CODE_PRICE_MAP.put("21000010", 135009999992L);
    	ACC_CODE_PRICE_MAP.put("24000032", 135009999991L);
    	ACC_CODE_PRICE_MAP.put("21000016", 135009999990L);
    	ACC_CODE_PRICE_MAP.put("21000011", 135009999989L);
    	ACC_CODE_PRICE_MAP.put("21000013", 135009999988L);
    }

    //发票、收据打印相关 add by zhouwu start
    public static final String INVOICE_PIRNT_TYPE = "0";//发票打印类型
    public static final String RECEIVE_PIRNT_TYPE = "1";//收据打印类型
    public static final String DEPOSIT_PIRNT_TYPE = "0";//押金打印类型
    public static final String NOT_DEPOSIT_PIRNT_TYPE = "1";//非押金打印类型
    public static final String OTHER_ACTIVE_BUSINESS_NAME = "预存优惠活动";//其它活动业务名称
    //发票、收据打印相关 add by zhouwu end

    /*********************电子免填单相关配置 静态常量**********************/
	public static final String REAL_PAPER_CONTENT_NEWLINE_N =  "\n";//纸质免填单新行
	public static final String REAL_PAPER_CONTENT_NEWLINE_R =  "\r";//纸质免填单新行
	public static final String ELEC_PAPER_CONTENT_NEWLINE =  "|";//电子免填单新行
	public static final String REAL_PAPER_CONTENT_SPACE =  " ";//纸质免填单空格
	public static final String ELEC_PAPER_CONTENT_SPACE =  "@";//电子免填单空格
	public static final String REAL_PAPER_CONTENT_FENHAO_YUANJIAO =  ";";//电子免填单空格
	public static final String REAL_PAPER_CONTENT_FENHAO_BANJIAO =  "；";//电子免填单空格

	//后定义有价卡售卡和换卡business_id和调资源的卡类型 add by zhouwu
	//public static final long Card_OF_THIRD_SALE_BUSINESS_ID = 191001020018L;//售卡business_id //del by tuhc
	//public static final long Card_OF_THIRD_SWAP_BUSINESS_ID = 191001020019L;//换卡business_id //del by tuhc
	public static final String CARD_OF_THIRD_RES_CARDTYPE = "5006001";//资源后定义有价卡卡类型

	public static final long PASSWORD_VERIFY_ENTID = 99220L;//显示服务密码权限
	public static final long CARD_VERIFY_ENTID = 99221L;//显示证件号码权限

	public static final long  IPBUS_OPEN = 888800000001L;//IP直通车帐户开户
	public static final long  IPBUS_CNANGE = 888800000005L;//IP直通车更改帐户信息
	public static final long  IPBUS_ACCT_LOCK = 888800000006L;//IP直通车使用帐户封锁
	public static final long  IPBUS_ACCT_UNLOCK = 888800000007L;//IP直通车使用帐户解锁
	public static final int   IPBUS_ACCT_LOCK_FLAG = 1;//封锁
	public static final int   IPBUS_ACCT_UNLOCK_FLAG = 0;//解锁
	public static final long  IPBUS_PAYACCT_LOCK=888800000003L;//IP直通车付费帐户上锁
	public static final long  IPBUS_PAYACCT_UNLOCK=888800000004L;//IP直通车付费帐户解锁
	public static final long  IPBUS_DESTROY=888800000008L;//IP直通车使用帐户销户
	public static final long  IPBUS_PAYMENT_DESTROY=888800000002L;//IP直通车付费帐户销户
	//public static final long  IPBUS_BUSINESS_ID=192000001204L;//IP直通车操作  del by tuhc
	public static final long  USER_RELAT_LJ_EXPIRE=200000000019L;//删除成员用户关系立即失效组
	/*
	 *  111400400020		家庭网包月统付(本地版)
		111400400021		家庭网包月统付(省内版)
		111400400022		家庭网包月分付(本地版)
		111400400023		家庭网包月分付(省内版)
	 */
	//public static final long OFFER_ID_JTW_TFBD  =111400400020L;
	//public static final long OFFER_ID_JTW_TFSN  =111400400021L;
	//public static final long OFFER_ID_JTW_FFBD  =111400400022L;
	//public static final long OFFER_ID_JTW_FFSN  =111400400023L;

	//分割符号
   	public static final String FIXEDLINE_STRING_SPLIT = "|";//固网分割符
	//用户分类编码
   	public static final String USER_KIND_Broadband = "Broadband";//宽带业务
   	public static final String USER_KIND_FixedPhone = "FixedPhone";//固话业务
   	//
   	public static final String SO_isFixedLine = "isFixedLine";
   	public static final String SO_pstnUserId = "pstnUserId";
   	public static final String SO_pstnBillId = "pstnBillId";


   	//流程label
   	public static final String SO_WF_LABEL_InstallationWorkFlow = "InstallationWorkFlow";
   	public static final String SO_WF_LABEL_TAFInstallationWorkFlow = "TAFInstallationWorkFlow";
   	public static final String SO_WF_LABEL_DeliverySub = "DeliverySub";
   	public static final String SO_WF_LABEL_PortInSub = "PortInSub";
   	public static final String SO_WF_LABEL_ReturnCPESub = "ReturnCPESub";
   	public static final String SO_WF_LABEL_ReturnHarWareSub = "TAFReturnHardWareSub";
   	public static final String SO_WF_LABEL_SuspendBillingSub = "SuspendBillingSub";
   	public static final String SO_WF_LABEL_ReceiveResultSub = "ReceiveResultSub";
   	public static final String SO_WF_LABEL_TAFReceiveResultSub = "TAFReceiveResultSub";
  	public static final String SO_WF_LABEL_ElectronicConfrimSub = "ElectronicConfrimSub";
 	public static final String SO_WF_LABEL_SendNPRequestSub = "SendNPRequest";
 	public static final String SO_WF_LABEL_TAFCheckCompletenessSub = "TAFCheckCompletenessSub";
	public static final String SO_WF_LABEL_HandSetWF = "HandSetWF";
	public static final String SO_WF_LABEL_OpenNetSub = "OpenNetSub";
	public static final String SO_WF_LABEL_FibiaSub = "FibiaSub";
	public static final String SO_WF_LABEL_RescheduleOnlineDate = "RescheduleOnlineDate";

   	//节点Tag
   	public static final String SO_TASK_TAG_TagCompletenessRemind1 = "TagCompletenessRemind1";
   	public static final String SO_TASK_TAG_TagCompletenessRemind2 = "TagCompletenessRemind2";
   	public static final String SO_TASK_TAG_TagCompletenessRemind3 = "TagCompletenessRemind3";
   	public static final String SO_TASK_TAG_TagCompletenessRemindFixManually = "TagCompletenessRemindFixManually";
   	public static final String SO_TASK_TAG_TagCheckBBPOARemind1 = "TagCheckBBPOARemind1";
   	public static final String SO_TASK_TAG_TagCheckBBPOARemind2 = "TagCheckBBPOARemind2";
   	public static final String SO_TASK_TAG_TagCheckBBPOARemind3 = "TagCheckBBPOARemind3";
   	public static final String SO_TASK_TAG_TagCheckBBPOARemindFixManually = "remindFixManual4completeness";
   	public static final String SO_TASK_TAG_TagCompletenessFixManually = "TagCompletenessFixManually";
   	public static final String SO_TASK_TAG_TagReceiveResult = "TagReceiveResult";
   	public static final String SO_TASK_TAG_TagReceiveFixManually = "TagReceiveFixManually";
   	public static final String SO_TASK_TAG_TagCheckPOARemind1 = "TagCheckPOARemind1";
   	public static final String SO_TASK_TAG_TagCheckPOARemind2 = "TagCheckPOARemind2";
   	public static final String SO_TASK_TAG_TagCheckPOARemind3 = "TagCheckPOARemind3";
   	public static final String SO_TASK_TAG_TagCheckPOAManual = "TagCheckPOAManual";
   	public static final String SO_TASK_TAG_TagReceiveNPResult = "TagReceiveNPResult";
   	public static final String SO_TASK_TAG_TagManualDecision = "TagManualDecision";
  	public static final String SO_TASK_TAG_TagWaitForConfirmation = "TagWaitForConfirmation";
  	public static final String SO_TASK_TAG_TagWaitDSLComplete = "TagWaitDSLComplete";
  	public static final String SO_TASK_TAG_TagSendVoIPtoSFF = "TagSendVoIPtoSFF";
  	public static final String SO_TASK_TAG_TagDeliveryDate = "TagDeliveryDate";//DeliverySub工作流中，DeliveryDate任务节点
   	public static final String SO_TASK_TAG_Update_CPR = "update CPR";
 	public static final String SO_TASK_TAG_CheckPortIn = "TagCheckPortIn";
 	public static final String SO_TASK_TAG_STOCK_READY = "TagWaitingStore";

 	public static final String SO_TASK_TAG_TagReceiveOpenNet = "TagReceiveOpenNet";
 	public static final String SO_TASK_TAG_TagRescheduleRemind1 = "TagRescheduleRemind1";
 	public static final String SO_TASK_TAG_TagRescheduleRemind2 = "TagRescheduleRemind2";
 	public static final String SO_TASK_TAG_TagRescheduleRemind3 = "TagRescheduleRemind3";
 	public static final String SO_TASK_TAG_TagReceiveFibia = "TagReceiveFB";

	public static final String SO_TASK_TAG_TagSbbuNotifyCustomer = "TagSbbuNotifyCustomer";
	public static final String SO_TASK_TAG_TagWaitSbbuPortin = "TagWaitSbbuPortin";
	public static final String SO_TASK_TAG_TagSbbuTT = "TagSbbuTT";

    // 等待SFF回复节点结束结果
   	public static final String SO_TASK_RESULT_DEFAULT = "default";//同finish
   	public static final String SO_TASK_RESULT_FINISH = "finish";//正常回复无需处理，直接结束；
   	public static final String SO_TASK_RESULT_FAIL = "fail";//返回异常编码，需要处理
   	public static final String SO_TASK_RESULT_NOTIFY = "notify";//通知客户OnlineDate修改
   	public static final String SO_TASK_RESULT_NOTICE = "notice";//其他需要通知客户的信息，除了OnlineDate之外
   	public static final String SO_TASK_RESULT_REBOOK = "rebook";//修改OnlineDate；
   	public static final String SO_TASK_RESULT_MODIFY = "modify";//需要改单
   	public static final String SO_TASK_RESULT_CONFIRM = "confirm";//TDC收单确认
	public static final String SO_TASK_RESULT_PROVISIONING = "provisioning";//
	public static final String SO_TASK_RESULT_DELAY = "delay";//
	public static final String SO_TASK_RESULT_CONSULTANT = "consultant";//
	public static final String SO_TASK_RESULT_CONFIRM_TECHNICIAN_DATE = "confirm_technician_date";
	public static final String SO_TASK_RESULT_REBOOK_TECHNICIAN_DATE = "rebook_technician_date";
    //offertype
   	public static final String SO_OFFER_TYPE_OFFER_PLAN_BROADBAND = "OFFER_PLAN_BROADBAND";
   	public static final String SO_OFFER_TYPE_OFFER_VAS_BROADBAND = "OFFER_VAS_BROADBAND";
   	public static final String SO_OFFER_TYPE_OFFER_VAS_CPE = "OFFER_VAS_CPE";
   	public static final String SO_OFFER_TYPE_OFFER_VAS_REPEATER = "OFFER_VAS_REPEATER";
   	public static final String SO_OFFER_TYPE_OFFER_VAS_CPE_ACCESSORIES = "OFFER_VAS_CPE_ACCESSORIES";
   	public static final String SO_OFFER_TYPE_OFFER_VAS_VoIP = "OFFER_VAS_VoIP";
   	public static final String SO_OFFER_TYPE_OFFER_VAS_VoIP_VAS = "OFFER_VAS_VoIP_VAS";
   	public static final String SO_OFFER_TYPE_OFFER_PLAN_TELEPHONE = "OFFER_PLAN_TELEPHONE";
   	// 宽带拆机原因 , add by fangjie
   	public static final String SO_FIXEDLINE_TERMINATION_REASON = "SO_FIXEDLINE_TERMINATION_REASON";
   	// Manual
   	public static final String SO_TERMINATION_REASON_NORMAL = "NORMAL";
//   	public static final String SO_TERMINATION_REASON_WITHDRAWAL = "WITHDRAWAL";
   	public static final String SO_TERMINATION_REASON_CUST_DEATH = "CUST_DEATH";
   	public static final String SO_TERMINATION_REASON_TRY_BUY = "TRY_BUY";
   	public static final String SO_TERMINATION_REASON_GTC_CHANGE = "GTC_CHANGE";
   	public static final String SO_TERMINATION_REASON_TECH_REASON = "TECH_REASON";
   	public static final String SO_TERMINATION_REASON_FRAUD = "FRAUD";
   	public static final String SO_TERMINATION_REASON_WITHDRAWAL_DUE_PRICE = "WITHDRAWAL_DUE_PRICE";
   	public static final String SO_TERMINATION_REASON_WITHDRAWAL_DUE_TECH = "WITHDRAWAL_DUE_TECH";
   	public static final String SO_TERMINATION_REASON_WITHDRAWAL_DUE_LACK_TN = "WITHDRAWAL_DUE_LACK_TN";
   	public static final String SO_TERMINATION_REASON_WITHDRAWAL_DUE_ANYWAY = "WITHDRAWAL_DUE_ANYWAY";

   	// Automatic
   	public static final String SO_TERMINATION_REASON_DUNNING = "DUNNING";
   	public static final String SO_TERMINATION_REASON_PORT_OUT = "PORT_OUT";
   	public static final String SO_TERMINATION_REASON_XDSL = "XDSL";
   	public static final String SO_CANCEL_ON_GOING_ORDER_REASON_CONFLICTING = "Conflicting";

   	// 退还费用还是收取罚金
   	public static final String SO_TERMINATION_PENALTY = "PENALTY";
   	public static final String SO_TERMINATION_CREDIT = "CREDIT";

   	//
   	public static final String SO_Yes = "Y";
   	public static final String SO_No = "N";
   	public static final String SO_On = "On";
   	public static final String SO_Off = "Off";

   	// NOTIFY_OPTION 扩展属性值
   	public static final String SO_NOTIFICATION_SWITCH_ON = "0";
   	public static final String SO_NOTIFICATION_SWITCH_OFF_ORDER = "1";
   	public static final String SO_NOTIFICATION_SWITCH_OFF_ALL = "2";
   	public static final String SO_NOTIFICATION_SWITCH_ON_ORDER_OFF_WORKFLOW = "3";
   	//订单扩展属性
	public static final String SO_CUST_EXT_OPENNET = "OPENNET";
   	public static final String SO_CUST_EXT_NOTIFICATION_SWITCH = "NOTIFICATION_SWITCH";
   	public static final String SO_CUST_EXT_REFERENCE_ID = "REFERENCE_ID";
   	public static final String SO_CUST_EXT_MANUAL_ORDER = "MANUAL_ORDER";
   	public static final String SO_CUST_EXT_MANUAL_SEL_CO = "MANUAL_SEL_CO";
   	public static final String SO_CUST_EXT_ACT_CODE = "ACT_CODE";
   	public static final String SO_CUST_EXT_ONLINE_DATE = "ONLINE_DATE";
   	public static final String SO_CUST_EXT_REQUESTED_DATE = "REQUESTED_DATE";
   	public static final String SO_CUST_EXT_CONFIRMED_DATE = "CONFIRMED_DATE";
   	public static final String SO_CUST_EXT_TIME_SLOT_TYPE = "TIME_SLOT_TYPE";
	public static final String SO_CUST_EXT_TIME_SLOT_FROM = "TIME_SLOT_FROM";
	public static final String SO_CUST_EXT_TIME_SLOT_TO = "TIME_SLOT_TO";
   	public static final String SO_CUST_EXT_OFFLINE_DATE = "OFFLINE_DATE";
   	public static final String SO_CUST_EXT_TANSACT_ID = "TRANSACTIONID";
   	public static final String SO_CUST_EXT_OFFLINE_DATE_TYPE = "OFFLINE_DATE_TYPE";
   	public static final String SO_CUST_EXT_VOIP_NUM = "VOIP_NUM";//待确认
   	public static final String SO_CUST_EXT_PSTN_NO = "PSTN_NO";
   	public static final String SO_CUST_EXT_PSTN_CHECK = "PSTN_CHECK";
   	public static final String SO_CUST_EXT_VISIT_SERVICE = "VISIT_SERVICE";//待删除
   	public static final String SO_CUST_EXT_CONTACT_BEFORE_ARRIVAL = "CONTACT_BEFORE_ARRIVAL";
   	public static final String SO_CUST_EXT_CONTACT_NUMBER = "CONTACT_NUMBER";//待删除
   	public static final String SO_CUST_EXT_CONTACT_NAME = "CONTACT_NAME";//待删除
 	public static final String SO_CUST_EXT_CONTACT_EMAIL = "CONTACT_EMAIL";//待删除
   	public static final String SO_CUST_EXT_OPERATOR = "OPERATOR";
   	public static final String SO_CUST_EXT_CUSTOMER_NO = "CUSTOMER_NO";
   	public static final String SO_CUST_EXT_CIRCUIT_NO = "CIRCUIT_NO";
   	public static final String SO_CUST_EXT_PREQ_RESULT = "PREQ_RESULT";
   	public static final String SO_CUST_EXT_LOCK_SPEED = "LOCK_SPEED";
   	public static final String SO_CUST_EXT_PREV_AUTO = "PREV_AUTO";
   	public static final String SO_CUST_EXT_PREV_MANUAL = "PREV_MANUAL";
   	public static final String SO_CUST_EXT_PREV_MSG = "PREV_MSG";
   	public static final String SO_CUST_EXT_DELIVERY_SAP_ORDER_ID = "DELIVERY_SAP_ORDER_ID";
   	public static final String SO_CUST_EXT_DELIVERY_SAP_ITEMNUM = "DELIVERY_SAP_ITEM_NUM";
   	public static final String SO_CUST_EXT_DELIVERY_STATE = "DELIVERY_STATE";
   	public static final String SO_CUST_EXT_RETURN_SAP_ORDER_ID = "RETURN_SAP_ORDER_ID";
   	public static final String SO_CUST_EXT_RETURN_STATE = "RETURN_STATE";
   	public static final String SO_CUST_EXT_SELECT_NUMBER_TYPE = "SELECT_NUMBER_TYPE";
   	public static final String SO_CUST_EXT_SAP_CPEOFERRID = "CEP_OFFER_ID";
   	public static final String SO_CUST_EXT_CANCEL_RETURN = "CANCEL_RETURN";//撤单returnCPE标志
	public static final String SO_CUST_EXT_INSTALL_ADDRESS_ID = "INSTALL_ADDRESS_ID";//撤单INSTALL_ADDRESS
	public static final String SO_CUST_EXT_COMMITMENT_TYPE = "DEAL_COMMITMENT_TYPE";//固网过户协议期处理方式
	public static final String SO_CUST_EXT_IS_SAMECUST_TYPE = "IS_SAMECUST_TYPE";//固网过户客户类型是否相同
	public static final String SO_CUST_EXT_NEW_CUST_TYPE = "NEW_CUST_TYPE";//固网过户新客户类型
	public static final String SO_CUST_EXT_IS_CHANGE_MAIN_OFFER = "IS_CHANGE_MAIN_OFFER";//固网过户是否换主Offer
	public static final String SO_CUST_EXT_ELECTRONIC_SING_TYPE = "ELECTRONIC_SIGN_TYPE";//固网过户电子合同类型
	public static final String SO_CUST_EXT_OFFER_CHANGE_TYPE = "OFFER_CHANGE_TYPE";
	public static final String SO_CUST_EXT_SAP_TRACE_NO = "SAP_TRACE_NO";//sap回调CRM的tarceNo
	public static final String SO_CUST_EXT_SAP_SHIPMENT_DATE = "SAP_SHIPMENT_DATE";//sap回调CRM的 shipmentDate
	public static final String SO_CUST_EXT_OVERRIDE_CPE_PENALTY = "OVERRIDE_CPE_PENALTY";//批量预销户是否收取CPE罚金
	public static final String SO_CUST_EXT_ADDRESS_KVHX = "KVHX";//kvhx地址
	public static final String SO_CUST_EXT_CHANGE_LINESPEED_FLAG = "CHANGE_LINESPEED_FLAG";


   	public static final String SO_CUST_EXT_TERMINATION_KIND = "TERMINATION_KIND";
   	public static final String SO_CUST_EXT_TERMINATION_REASON = "SO_QUIT_REASON";
   	public static final String SO_CUST_EXT_CPE_NO_RETURN = "CPE_NO_RETURN";//待删除
   	public static final String SO_CUST_EXT_CPE_RETURN_IN_SHOP = "CPE_RETURN_IN_SHOP";//待删除

   	public static final String SO_CUST_EXT_INSIST_OFFLINE_DATE = "INSIST_OFFLINE_DATE";
   	public static final String SO_CUST_EXT_RELOCATION_WITH_PSTN_NO = "RELOCATION_WITH_PSTN_NO";
   	public static final String SO_CUST_EXT_CPEINFO = "CPEINFO";
    public static final String SO_CUST_EXT_EFFECTIVE_DATE = "EFFECTIVE_DATE";
    public static final String SO_CUST_EXT_VOIP_NP_DATE = "VOIP_NP_DATE";//NP的销户时间字段（voip_np_date）
    public static final String SO_CUST_EXT_WAIT_DSL_COMPLETE = "WAIT_DSL_COMPLETE";//port in Wait DSL Complete节点等待DSL是否finish标志
    public static final String SO_CUST_EXT_PRE_ACCT_ID = "PRE_ACCT_ID";//过户时上家的账户ID(return CPE用)
    public static final String SO_CUST_EXT_PRE_BUSINESS_ID = "PRE_BUSINESS_ID";//return cpe流程的，父订单的BUSINESS_ID(return CPE用)
    public static final String SO_CUST_EXT_TECHNOLOGY_TYPE = "TECHNOLOGY_TYPE";//当前技术类型
    public static final String SO_CUST_EXT_PRE_TECHNOLOGY_TYPE = "PRE_TECHNOLOGY_TYPE";//前技术类型
	public static final String SO_CUST_EXT_OFFLINE_PRE_Q_SPEED = "OFFLINE_PRE_Q_SPEED";//当前地址支持此种技术的最大速率
   	public static final String SO_CUST_EXT_CMTS_ID = "CMTS_ID";
   	public static final String SO_CUST_EXT_FIRST_NAME = "FIRST_NAME";
   	public static final String SO_CUST_EXT_LAST_NAME = "LAST_NAME";
   	public static final String SO_CUST_EXT_COMPANY_NAME = "COMPANY_NAME";
   	public static final String SO_CUST_EXT_ATTENTION_PEOPLE = "ATTENTION_PEOPLE";
	public static final String SO_CUST_EXT_DELIVERY_ORD_ID = "DELIVERY_ORD_ID";
	public static final String SO_CUST_EXT_STORE_ORD_ID = "STORE_ORD_ID";
	public static final String SO_CUST_EXT_LEGAL_FIRST_NAME = "LEGAL_FIRST_NAME";
   	public static final String SO_CUST_EXT_LEGAL_LAST_NAME = "LEGAL_LAST_NAME";
   	public static final String SO_CUST_EXT_LEGAL_COMPANY_NAME = "LEGAL_COMPANY_NAME";
   	public static final String SO_CUST_EXT_STOCK_TYPE = "STOCK_TYPE";//库存类型
    public static final String SO_STOCK_TYPE_FUTURE_ORDER  = "FUTURE_ORDER";
    public static final String SO_STOCK_TYPE_PRE_ORDER = "PRE_ORDER";
    public static final String SO_STOCK_TYPE_BACK_ORDER = "BACK_ORDER";
    public static final String SO_STOCK_TYPE_ON_STOCK = "ON_STOCK";
    public static final String SO_CUST_EXT_EXP_DELIVERY_DATE = "EXP_DELIVERY_DATE";
    public static final String SO_CUST_EXT_PRICING = "PRICING_OFFER_ID";

    public static final String SO_CUST_EXT_INSURANCE_OPERATE_TYPE = "SO_INSURANCE_OPERATE_TYPE";

   	public static final String STOCK_TYPE_FUTURE_SALES  = "FutureSales";
    public static final String STOCK_TYPE_PRE_SALES = "PreSales";
    public static final String STOCK_TYPE_BEFORE_PRE_SALES = "BeforePreSales";
    public static final String STOCK_TYPE_ON_STOCK = "OnStock";
    public static final String STOCK_TYPE_OUT_OF_STOCK = "OutOfStock";

   	//xdsl生成POA时页面填入信息
   	public static final String SO_CUST_EXT_XDSL_CUSTOMER_NAME = "XDSL_CUSTOMER_NAME";
   	public static final String SO_CUST_EXT_XDSL_BIRTHDAY  = "XDSL_XDSL_BIRTHDAY";
   	public static final String SO_CUST_EXT_XDSL_CVR = "XDSL_CVR";//税号
   	public static final String SO_CUST_EXT_XDSL_POA_STATUS = "XDSL_POA_STATUS";

	public static final String SO_TECHNOLOGY_TYPE_FIBER = "FIBER";
	public static final String SO_TECHNOLOGY_TYPE_COAX = "COAX";
	public static final String SO_TECHNOLOGY_TYPE_PB = "PB";
	public static final String SO_TECHNOLOGY_TYPE_DSL = "DSL";
	public static final String SO_CO_TYPE_COLOCATION = "Colocation";
	public static final String SO_TECHNOLOGY_TYPE_FWA = "FWA";



	public static final String SO_CUST_EXT_IS_RED_ORDER = "IS_RED_ORDER";
	public static final String SO_CUST_EXT_RED_EOC_STATE = "RED_EOC_STATE";
	public static final String SO_CUST_EXT_RED_EOC_CTRLID = "RED_EOC_CTRLID";

    public static final String SO_SAP_ITEM_MATERIAL = "Material";
    public static final String SO_SAP_ITEM_QUANTITY = "Quantity";
    public static final String SO_SAP_ITEM_SALEUNIT = "SalesUnit";
    public static final String SO_SAP_ITEM_NETPRICE = "NetPrice";
    public static final String SO_SAP_ITEM_TAX = "VatAmount";
    public static final String SO_SAP_ITEM_RESTYPE = "ResType";
    public static final String SO_SAP_ITEM_SERIALNO = "SerialNo";

   	//订单扩展属性值
   	public static final String SO_CUST_EXT_ACT_CODE_VALUE_Create = "Create";
   	public static final String SO_CUST_EXT_ACT_CODE_VALUE_Additional = "Additional";
   	public static final String SO_CUST_EXT_ACT_CODE_VALUE_Establish = "Establish";
   	public static final String SO_CUST_EXT_ACT_CODE_VALUE_Remove = "Remove";
   	public static final String SO_CUST_EXT_ACT_CODE_VALUE_xDSL = "xDSL";
   	public static final String SO_CUST_EXT_ACT_CODE_VALUE_TNTerminate = "TNTerminate";
   	public static final String SO_CUST_EXT_ACT_CODE_VALUE_xDSLManual = "xDSLManual";
   	public static final String SO_CUST_EXT_ACT_CODE_VALUE_DSLFromOther = "DSLFromOther";
   	public static final String SO_CUST_EXT_ACT_CODE_VALUE_PREQ_ADDRESS_FAIL = "1";
   	public static final String SO_CUST_EXT_ACT_CODE_VALUE_PREQ_RESOURCE_FAIL = "2";
   	public static final String SO_CUST_EXT_TASK_ID_NEW = "TASK_ID_NEW";
   	public static final String SO_CUST_EXT_TASK_ID_MODIFY = "TASK_ID_MODIFY";
   	public static final String SO_CUST_EXT_TERMINATION_KIND_DSL_VOIP = "DSL_AND_VOIP";
   	public static final String SO_CUST_EXT_TERMINATION_KIND_DSL = "DSL";
   	public static final String SO_CUST_EXT_TERMINATION_KIND_VOIP = "VOIP";
   	public static final String SO_CUST_EXT_SELECT_NUMBER_TYPE_NORMAL = "1";
   	public static final String SO_CUST_EXT_SELECT_NUMBER_TYPE_RESERVED = "2";
   	public static final String SO_CUST_EXT_SELECT_NUMBER_TYPE_PORTIN = "3";
   	public static final String SO_CUST_EXT_SELECT_NUMBER_TYPE_PSTN = "4";
   	public static final String SO_CUST_EXT_SELECT_NUMBER_TYPE_PreTermination = "5";
   	public static final String SO_CUST_EXT_DELIVERY_STATE_preOccupy = "1";
   	public static final String SO_CUST_EXT_DELIVERY_STATE_requested = "2";
   	public static final String SO_CUST_EXT_DELIVERY_STATE_responsed = "3";
   	public static final String SO_CUST_EXT_COMMITMENT_TYPE_KEEP = "1";
   	public static final String SO_CUST_EXT_COMMITMENT_TYPE_TERMIN = "2";
   	public static final String SO_CUST_EXT_TDC_ORDER_ID = "tdc_order_id";
   	public static final String SO_CUST_EXT_TDC_RESCHEDULE = "RESCHEDULE";//改单类型是否是改onlinedate,Y/N
   	public static final String SO_CUST_EXT_ELECSIGN_DONOR = "2";
   	public static final String SO_CUST_EXT_ELECSIGN_RECEIVE = "3";
   	public static final String SO_CUST_EXT_ELECSIGN_NONE = "1";
   	public static final String SO_CUST_EXT_ELECSIGN_BOTH = "4";
   	public static final String SO_CUST_EXT_IS_TO_TDC = "IS_TO_TDC";//固网销户时是否发送TDC
   	public static final String SO_CUST_EXT_TO_TERMIN_TDC = "TO_TDC_termination";//固网移机时是否发送TDC
   	public static final String SO_CUST_EXT_SO_NBR = "SO_NBR";//调用Billing.DoAdjustFines接口 返回的流水号
   	public static final String SO_CUST_EXT_ADJUST_AMOUNT = "ADJUST_AMOUNT";//调用Billing.DoAdjustFines接口调价金额
	public static final String SO_CUST_EXT_RECEIVE_SFF_ORDER_KIND = "ORDER_KIND";//place_ord接口SFF回调是，orderKind参数
   	public static final String SO_CUST_EXT_RECEIVE_SFF_NOPER_TYPE = "NOPER_TYPE";//place_ord接口SFF回调是，nOperType参数
   	public static final String SO_CUST_EXT_XDSL_NP_CHECK = "XDSL_NP_CHECK_COMPLESS";//1:xdsl，2 NP,3 XDSl_NP

	public static final String SO_ORDER_STATUS_ETABLERINGSAFTALE="etableringsaftale";

   	//add by zc
   	public static final String SO_CUST_EXT_TECH_PARAMER = "TECHPARAMER_SEND_TO_TDC";
    //add by pengwz
   	public static final String SO_CUST_EXT_PLACE_ORDER_COMFIRM = "PLACE_ORDER_COMFIRM";

   	//用户扩展属性
   	public static final long SO_USER_EXT_CONTACT_NAME = 600011L;
   	public static final long SO_USER_EXT_CONTACT_NUMBER = 600012L;
	public static final long SO_USER_EXT_HAS_PSTN = 600001L;
   	public static final long SO_USER_EXT_PSTN_NO = 600002L;
   	public static final long SO_USER_EXT_VISIT_SERVICE = 600003L;
   	public static final long SO_USER_EXT_TERMINATION_REASON = 600012L;
   	public static final long SO_USER_EXT_USER_NAME = 134010L;
   	public static final long SO_USER_EXT_NP_STOP_FLAG = 9100012L;
   	public static final long SO_USER_EXT_OFFLINE_CONTRACT_DATE = 110000L;
   	public static final long SO_USER_EXT_DEALER_CODE = 800030L;
	public static final long SO_USER_EXT_AGENT_CODE = 800040L;
	public static final long SO_USER_EXT_CUSTOMER_IDENTIFICATION_TYPE = 800050L;
	public static final long SO_USER_EXT_ID_NUMBER = 800060L;
	public static final long SO_USER_EXT_CONTRACT_NUMBER = 800070L;
	public static final long SO_USER_EXT_SHOP_ID = 800080L;
	public static final long SO_USER_EXT_OFFLINE_CONTRACT_NEW_ORGANIZE_ID = 800090L;
	public static final long SO_USER_EXT_PURCHASE_ORDER_ID = 800091L;
	public static final long SO_USER_EXT_INVOICE_NUMBER = 150000L;

	//DM002
	public static final long SO_USER_EXT_COAX_PASSWORD = 200201L;
	public static final long SO_USER_EXT_COAX_USERNAME = 200202L;
	public static final long SO_USER_EXT_PROFILE_ID = 200203L;
	public static final long SO_USER_EXT_PROFILE_NAME = 200204L;
	public static final long SO_USER_EXT_TECHNOLOGY_TYPE = 2700315L;
	public static final long SO_USER_EXT_CMTS_ID = 200207L;
	// OpenNet
	public static final long SO_USER_EXT_CHANGE_PRICE_PLAN_OFFER = 200407L;
	public static final long SO_USER_EXT_OPENNET_PORT = 201406L;
	public static final long SO_USER_EXT_OPENNET_TVLAN = 201407L;
	public static final long SO_USER_EXT_OPENNET_SVLAN = 201408L;
	public static final long SO_USER_EXT_OPENNET_POIID = 201409L;
	public static final int SO_OPENNET_SPECIAL_CONFiG_ID = 20721;


	// OpenNet
	public static final long PROD_FEATURE_ID_IO = 2700352L;
	public static final long PROD_FEATURE_ID_PLATFORM_NAME = 2700351L;
 	public static final long PROD_ATTR_ID_IO = 262100000022L;
	public static final long PROD_ATTR_ID_PLATFORM_NAME = 262100000023L;


   	//
   	public static final String SO_CHANGE_TYPE_PSTN_NUMBER = "PSTN_NUMBER";
   	public static final String SO_CHANGE_TYPE_DELIVERY = "DELIVERY";
   	public static final String SO_CHANGE_TYPE_VISIT_SERVICE = "VISIT_SERVICE";
   	public static final String SO_CHANGE_TYPE_ONLINE_DATE = "ONLINE_DATE";
   	public static final String SO_CHANGE_TYPE_ONLINE_DATE_TIME = "ONLINE_DATE_TIME";
   	public static final String SO_CHANGE_TYPE_OFFLINE_DATE = "OFFLINE_DATE";
   	public static final String SO_CHANGE_TYPE_PHONE_BOOK = "PHONE_BOOK";
   	public static final String SO_CHANGE_TYPE_VOIP_NUMBER = "VOIP_NUMBER";
   	public static final String SO_CHANGE_TYPE_GLOBAL_IP_PLUS = "GLOBAL_IP_PLUS";
   	public static final String SO_CHANGE_TYPE_MANUAL_ORDER = "MANUAL_ORDER";
   	public static final String SO_CHANGE_TYPE_xDSL_INFO = "xDSL_INFO";
   	public static final String SO_CHANGE_TYPE_ORDER_CHANGE = "ORDER_CHANGE";
   	public static final String SO_CHANGE_TYPE_CO_INFO = "CO_INFO";
  	public static final String SO_CHANGE_TYPE_CONTACT_INFO = "CONTACT_INFO";
	public static final String SO_CHANGE_TYPE_ORDER_CANCEL = "ORDER_CANCEL";
	public static final String SO_CHANGE_TYPE_CRM_XDSL = "CRM_XDSL";
	public static final String SO_TYPE_MOBILE_CANCEL = "ORDER_MOILE_CANCEL";

   	//
   	public static final String SO_CANCEL_TYPE_DSL = "DSL";
   	public static final String SO_CANCEL_TYPE_VOIP = "VOIP";
   	//
   	public static final String SO_OPER_CONTENT_CANCEL_TYPE_DSL = "Cancel DSL";
   	public static final String SO_OPER_CONTENT_CANCEL_TYPE_VOIP = "Cancel VoIP";
   	public static final String SO_OPER_CONTENT_CHANGE_TYPE_PSTN_NUMBER = "Modify PSTN Number";
   	public static final String SO_OPER_CONTENT_CHANGE_TYPE_DELIVERY = "Modify Delivery";
   	public static final String SO_OPER_CONTENT_CHANGE_TYPE_VISIT_SERVICE = "Modify Visit Service";
   	public static final String SO_OPER_CONTENT_CHANGE_TYPE_ONLINE_DATE = "Modify Online Date";
   	public static final String SO_OPER_CONTENT_CHANGE_TYPE_ONLINE_DATE_TIME = "Modify Online Date Time";
   	public static final String SO_OPER_CONTENT_CHANGE_TYPE_OFFLINE_DATE = "Modify Offline Date";
   	public static final String SO_OPER_CONTENT_CHANGE_TYPE_PHONE_BOOK = "Modify Phone Book";
   	public static final String SO_OPER_CONTENT_CHANGE_TYPE_VOIP_NUMBER = "Modify VoIP Number";
   	public static final String SO_OPER_CONTENT_CHANGE_TYPE_GLOBAL_IP_PLUS = "Modify Global Ip Plus";
   	public static final String SO_OPER_CONTENT_CHANGE_TYPE_MANUAL_ORDER = "Modify Manual Order";
   	public static final String SO_OPER_CONTENT_CHANGE_TYPE_xDSL_INFO = "Modify xDsl Info";
 	public static final String SO_OPER_CONTENT_CHANGE_TYPE_MUNICIPALITY_INFO = "Modify Municipality Info";
   	public static final String SO_OPER_CONTENT_CHANGE_ORDER = "Modify Order";


	public static final String OPER_TYPE_LOGOUT = "LOGOUT";

   	//属性
   	public static final long SO_SRV_ATTR_RATE = 262100000004L;
   	public static final long SO_SRV_ATTR_CO_NAME = 262100000011L;
	public static final long SO_SRV_ATTR_FIBER_ACCESS_TECHNOLOGY = 262100000226L;
   	public static final long SO_SRV_ATTR_CO_KIND = 262100000012L;
   	public static final long SO_SRV_ATTR_CO_TYPE = 262100000006L;
   	public static final long SO_SRV_ATTR_ACCESS_TYPE = 262100000007L;
	public static final long SO_SRV_ATTR_PROFILE_ID = 2700322; //profile_id
   	public static final long SO_SRV_ATTR_IP = 262100000008L;
   	public static final long SO_SRV_ATTR_CIRCUIT_NO = 262100000013L;
   	public static final long SO_SRV_ATTR_TDC_PRODUCT_ID = 262100000021L;
   	public static final long SO_SRV_ATTR_VOIP_ID = 262100000203L;
   	public static final long SO_SRV_ATTR_VOIP_PASSWORD = 262100000221L;
   	public static final long SO_SRV_ATTR_VOIP_NO = 262100000204L;
   	public static final long SO_SRV_ATTR_USAGE_CONTROL_PASSWORD = 262100000207L;
   	public static final long SO_SRV_ATTR_CONFIRM_CONTROL_PASSWORD = 262100000225L;
   	public static final long SO_SRV_ATTR_CPE_SN = 262100000201L;
   	public static final long SO_SRV_ATTR_ESIM_IMIS = 262100000014L;
   	public static final long SO_ESIM_SERVICE_ID = 2210037L;
   	public static final long SO_SRV_ATTR_ESIM_EID = 262100000017l;
   	public static final long SO_SRV_ATTR_ESIM_MSISDN = 262100000015l;
   	public static final long SO_SRV_ATTR_ESIM_PAIR_STATUS = 262100000016L;
   	public static final String SO_RAISE_EVENT_RELEASE = "multi-sim-profile-released";
   	public static final String SO_RAISE_EVENT_DELETE = "multi-sim-signup-changed";
   	public static final long SO_ESIM_CARD_TYPE = 1102714L;
   	public static final String SO_ESIM_RES_TYPE = "2006";
   	public static final long SO_ESIM_RES_TYPE_ID = 2006L;
   	public static final long SO_SRV_ATTR_CPE_MAC_ADDRESS = 262100000218L;
   	public static final long SO_SRV_ATTR_CPE_TYPE = 262100000219L;
   	public static final long SO_SRV_ATTR_CPE_STATE = 262100000212L;
   	public static final long SO_SRV_ATTR_CPE_RETURN_ORDER_ID = 262100000213L;
   	public static final long SO_SRV_ATTR_CPE_RETURN_FINISH_DATE = 262100000214L;
   	public static final long SO_SRV_ATTR_CPE_SHIPMENT_DATE = 262100000215L;
   	public static final long SO_SRV_ATTR_CPE_TRACE_NO = 262100000216L;
   	public static final long SO_SRV_ATTR_CPE_RECEPTION_DATE = 262100000217L;
   	public static final long SO_SRV_ATTR_CPE_IS_NEED_SPLITTER = 262100000226L;
   	public static final long SO_SRV_ATTR_PHONEBOOK_STATUS = 262100000208L;//Phonebook status
   	public static final long SO_SRV_ATTR_PHONEBOOK_STATUS1 = 152088888880L;//Phonebook status1
   	public static final long SO_SRV_ATTR_PHONEBOOK_STATUS2 = 152088888881L;//Phonebook status2
   	public static final long SO_SRV_ATTR_MUNICIPALITY_CODE = 262100000205L;//municipality Code
   	public static final long SO_SRV_ATTR_GLOBAL_IP_PLUS_IP = 262100000211L;
   	public static final long SO_SRV_ATTR_GLOBAL_IP_PLUS_BLOCKSIZE = 262100000209L;
   	public static final long SO_SRV_ATTR_LU_NUMBER = 262100000010L;
  	public static final long SO_SRV_ATTR_CPE_SAP_ORDER_ID = 26123123123123L;
  	public static final long SO_SRV_ATTR_CPE_SAP_ITEMNUM = 26123123123124L;
   	public static final long SO_SRV_ATTR_TECHNOLOGY_TYPE = 2700315L;//技术类型
	public static final long SO_SRV_ATTR_ACTUAL_SPEED = 262100000005L;//真实速率
	public static final long SO_SRV_ATTR_ACTUAL_UPLOAD_SPEED = 262100001006L;//真实上传速率
	public static final long SO_SRV_ATTR_REPEATER_SN = 220100000012L;//真实速率
    public static final long SO_SRV_ATTR_REPEATER_MAC_ADDRESS = 220100000013L;
   	public static final long SO_SRV_ATTR_REPEATER_TYPE = 220100000014L;
   	public static final long SO_SRV_ATTR_REPEATER_STATE = 220100000015L;
	public static final long SO_SRV_ATTR_CPE_SEND_SFF = 262100001007L;// 是否发SFF
	public static final long SO_SRV_ATTR_EID = 262100000017L;// esim eid
	public static final long SO_SRV_ATTR_IMSI = 262100000014L;// esim IMSI
	public static final long SO_SRV_ATTR_IO = 262100000022L;

	public static final long SO_SRV_ATTR_FWA_MSISDN = 262100000019L;// FWA eid
	public static final long SO_SRV_ATTR_FWA_IMSI = 262100000018L;// FWA IMSI
	public static final long SO_SRV_ATTR_FWA_CARD_TYPE = 262180000020L;// FWA CARD TYPE
	public static final long SO_SRV_ATTR_FWA_KI = 262180000021L;// FWA KI
	public static final long SO_SRV_ATTR_FWA_ICCID = 262180000022L;// FWA KI



   	// fangjie
   	public static final long SO_SRV_ATTR_TERMINATION_REASON_DSL = 262100000020L;
   	public static final long SO_SRV_ATTR_TERMINATION_REASON_VOIP = 262100000220L;
   	public static final long SO_SRV_ATTR_REFERRAL_TYPE = 262100000222L;
   	public static final long SO_SRV_ATTR_REFERRAL_NUMBER = 262100000223L;
   	public static final long SO_SRV_ATTR_EXTEND_PERIOD = 262100000224L;

   	// 拆机提示音属性值 fangjie
   	public static final String SO_SRV_ATTR_REFERRAL_TYPE_STANDARD = "STANDARD";
   	public static final String SO_SRV_ATTR_REFERRAL_TYPE_CHOSEN_NUMBER = "CHOSEN_NUMBER";
   	//属性值
   	public static final String SO_SRV_ATTR_VALUE_CPE_IN_USE = "inUse";
   	public static final String SO_SRV_ATTR_VALUE_CPE_REQUESTED_RETURN = "requestedReturn";
   	public static final String SO_SRV_ATTR_VALUE_CPE_SOLD = "sold";
   	public static final String SO_SRV_ATTR_VALUE_CPE_RETURNED = "returned";
   	public static final String SO_SRV_ATTR_VALUE_CPE_RETURNED_INSHOP = "returnedInShop";
   	public static final String SO_SRV_ATTR_VALUE_CPE_BROKEN = "broken";
   	public static final String SO_SRV_ATTR_VALUE_CPE_OUTDATED = "outdated";
   	//CPE Return Accpet
   	public static final String SO_CPE_RETURN_REQUEST = "request";
   	public static final String SO_CPE_RETURN_IN_SHOP = "returnInShop";
   	public static final String SO_CPE_RETURN_IN_SAP = "returnInSAP";
   	// NP拆分订单类型
   	public static final String SO_NP_SEPARATE_DSL = "DSL";
   	public static final String SO_NP_SEPARATE_VOIP = "VOIP";
   	//处理类型
   	public static final String SO_HANDLE_TYPE_BLOCK = "-1";
   	public static final String SO_HANDLE_TYPE_AUTO = "1";
   	public static final String SO_HANDLE_TYPE_REMIND = "2";
   	public static final String SO_HANDLE_TYPE_MANUAL = "3";
   	public static final String SO_HANDLE_TYPE_REMIND_BBAndPOA = "4";
   	//通知类型
   	public static final String SO_PUSHC_TYPE_SUBMIT = "submit";
   	//通知客户编码
   	public static final String SO_NOTIFY_CUSTOMER_Completeness_Remind_1 = "Completeness_Remind_1";
   	public static final String SO_NOTIFY_CUSTOMER_Completeness_Remind_2 = "Completeness_Remind_2";
   	public static final String SO_NOTIFY_CUSTOMER_Completeness_Remind_3 = "Completeness_Remind_3";
   	//通知员工编码
   	public static final String SO_NOTIFY_STAFF_Delivery_Send_Telenor_Staff = "Delivery_Send_Telenor_Staff";
   	public static final String SO_NOTIFY_STAFF_Delivery_Send_Delivery_Note = "Delivery_Send_Delivery_Note";
   	//定时器
	public static final String SO_TIMER_Change_Co_Effective_Date = "Change_Co_Effective_Date";
   	public static final String SO_TIMER_Open_Delivery_Date = "Open_Delivery_Date";
   	public static final String SO_TIMER_Completeness_Remind_1 = "Completeness_Remind_1";
   	public static final String SO_TIMER_Completeness_Remind_2 = "Completeness_Remind_2";
   	public static final String SO_TIMER_Completeness_Remind_3 = "Completeness_Remind_3";
   	public static final String SO_TIMER_Completeness_Remind_XDSLAndNP_1 = "Completeness_Remind_XDSLAndNP_1";//固网开户，xdsl+np场景完整性校验超时时间配置
   	public static final String SO_TIMER_Completeness_Remind_XDSLAndNP_2 = "Completeness_Remind_XDSLAndNP_2";
   	public static final String SO_TIMER_Completeness_Remind_XDSLAndNP_3 = "Completeness_Remind_XDSLAndNP_3";
   	public static final String SO_TIMER_CONTRACT_Remind_1 = "CHECK_CONTRACT_SEND_1";
   	public static final String SO_TIMER_CONTRACT_Remind_2 = "CHECK_CONTRACT_SEND_2";
   	public static final String SO_TIMER_CONTRACT_Remind_3 = "CHECK_CONTRACT_SEND_3";
   	public static final String SO_TIMER_TirdPart_CONTRACT_Remind_1 = "CHECK_TirdPart_CONTRACT_SEND_1";
   	public static final String SO_TIMER_TirdPart_CONTRACT_Remind_2 = "CHECK_TirdPart_CONTRACT_SEND_2";
   	public static final String SO_TIMER_TirdPart_CONTRACT_Remind_3 = "CHECK_TirdPart_CONTRACT_SEND_3";
   	public static final String SO_TIMER_Delivery_FeedBack_OverTime = "Delivery_FeedBack_OverTime";
   	public static final String SO_TIMER_OnlineDate_xDSL_Default = "OnlineDate_xDSL_Default";
   	public static final String SO_TIMER_OnlineDate_Relocate_Default = "OnlineDate_Relocate_Default";
   	public static final String SO_TIMER_OnlineDate_xDSL_Limit = "OnlineDate_xDSL_Limit";
   	public static final String SO_TIMER_OnlineDate_COAX_Limit = "OnlineDate_COAX_Limit";
   	public static final String SO_TIMER_OnlineDate_Limit = "OnlineDate_Limit";
   	public static final String SO_TIMER_OnlineDate_Limit_Fibia_ChangeOffer = "OnlineDate_Limit_Fibia_ChangeOffer";
   	public static final String SO_TIMER_OnlineDate_Limit_DM002 = "OnlineDate_Limit_DM002";
   	public static final String SO_TIMER_OnlineDate_Limit_DM002_Change_Offer = "OnlineDate_Limit_DM002_Change_Offer";
   	public static final String SO_TIMER_No_Penaty_Days_Withdraw = "No_Penaty_Days_Withdraw";
   	public static final String SO_TIMER_PING_IP_DATE = "PING_IP_DATE";
   	public static final String SO_TIMER_NOTIFY_TECHNICIAN_DATE="Days_For_Notify_TechnicianDate";
	public static final String SO_TIMER_OnlineDate_FWA_Limit="OnlineDate_FWA_Limit";

   	public static final String SO_TIMER_OnlineDate_Relocate_Limit = "OnlineDate_Relocate_Limit";
   	public static final String SO_TIMER_OnlineDate_Relocate_MaxLimit = "OnlineDate_Relocate_MaxLimit";
   	public static final String SO_TIMER_OnlineDate_SBBU_MaxLimit = "OnlineDate_Sbbu_MaxLimit";

   	public static final String SO_TIMER_Return_FeedBack_OverTime_1 = "Return_FeedBack_OverTime_1";
   	public static final String SO_TIMER_Return_FeedBack_OverTime_2 = "Return_FeedBack_OverTime_2";

   	public static final String SO_TIMER_CPE_BROKEN_deProvisioningTime = "CPE_BROKEN_deProvisioningTime";
   	public static final String SO_TIMER_CPE_RETURNED_deProvisioningTime = "CPE_RETURNED_deProvisioningTime";

 	public static final String SO_TIMER_Trans_Sign_Remind_OverTime_1 = "Tran_ElecSign_Remind_OverTime_1";
 	public static final String SO_TIMER_Trans_Sign_Remind_OverTime_2 = "Tran_ElecSign_Remind_OverTime_2";

	public static final long SO_TASK_TEMPLATE_ID_SEND_RETURN_TO_SAP =63L;
   	//时间单位
   	public static final String SO_TIME_UNIT_second = "second";
   	public static final String SO_TIME_UNIT_minute = "minute";
   	public static final String SO_TIME_UNIT_hour = "hour";
   	public static final String SO_TIME_UNIT_day = "day";
   	public static final String SO_TIME_UNIT_week = "week";
   	public static final String SO_TIME_UNIT_month = "month";
   	public static final String SO_TIME_UNIT_year = "year";
   	//
   	public static final String SO_ORDER_DATE = "ORDER_DATE";
   	public static final String SO_REJECT_BLOCK_NUMBER = "REJECT_BLOCK_NUMBER";
   	public static final String SO_EXCEPTION_CODE = "EXCEPTION_CODE";
   	public static final String SO_EXCEPTION_MSG = "EXCEPTION_MSG";
   	public static final String SO_EOC_MSG_ID = "EOC_MSG_ID";
   	public static final String SO_TASK_ID = "TASK_ID";
   	public static final String SO_IS_MANUAL = "IS_MANUAL";
   	public static final String SO_REMARD_MSG = "REMARD_MSG";
   	public static final String SO_URL = "URL";
   	public static final String SO_MISSING_XDSL_POA_URL = "MISSING_XDSL_POA_URL";
   	public static final String SO_RE_CHECK = "RE_CHECK";
   	//
   	public static final String SO_TT_CODE = "TT_CODE";
   	public static final String SO_TT_CODE_Common = "TT001";
   	public static final String SO_TT_CODE_Missing_xDSL_Info = "TT101";
   	public static final String SO_TT_CODE_Missing_NP_Info = "TT102";
   	public static final String SO_TT_CODE_Missing_PSTN_No = "TT103";
   	public static final String SO_TT_CODE_Missing_GPlus_IP = "TT104";
   	public static final String SO_TT_CODE_Missing_GPlus_OnlineDate = "TT105";
   	public static final String SO_TT_CODE_Subscription_Service_pack_Pro = "TT106";
   	public static final String SO_TT_CODE_Subscription_Reversed_DNS = "TT107";
   	public static final String SO_TT_CODE_Missing_Municipality_Code = "TT108";
   	public static final String SO_TT_CODE_Missing_CoInfo = "TT109";
   	public static final String SO_TT_CODE_LockSpeed = "TT110";
   	public static final String SO_TT_CODE_RemoveISDN = "TT111";
   	public static final String SO_TT_CODE_xDSLManual = "TT112";
   	public static final String SO_TT_CODE_Establish = "TT113";
   	public static final String SO_TT_CODE_DSLFromOther = "TT114";
   	public static final String SO_TT_CODE_SFF_Reject = "TT115";
   	public static final String SO_TT_CODE_Ping_Check = "TT116";
   	public static final String SO_TT_CODE_Delivery_Not_Response = "TT117";
   	public static final String SO_TT_CODE_Cancel_Delivery_Requested = "TT118";
   	public static final String SO_TT_CODE_Cancel_NP_Confirmed = "TT119";
   	public static final String SO_TT_CODE_Withdraw_Manual_Refund = "TT120";
   	public static final String SO_TT_CODE_SlowSpeed_Notice = "TT121";
   	public static final String SO_TT_CODE_Concurrent_xDSL = "TT122";
   	public static final String SO_TT_CODE_NP_Open_Fail = "TT123";
   	public static final String SO_TT_CODE_IP_Reservation_Fails = "TT124";
   	public static final String SO_TT_CODE_EOC_Reject = "TT125";
   	public static final String SO_TT_CODE_Reallocate_PSTN = "TT126";
   	public static final String SO_TT_CODE_DSL_Dunning_Cancel = "TT127";
   	public static final String SO_TT_CODE_PSTN_Dunning_Cancel = "TT128";
   	public static final String SO_TT_CODE_NewCommon = "TT129";
   	public static final String SO_TT_CODE_Missing_Contract = "TT133";
   	public static final String SO_TT_CODE_Refund_Regret = "TT134";
   	public static final String SO_TT_CODE_NP_Export = "TT138";
   	public static final String SO_TT_CODE_Sff_Internal_Error = "TT137";
   	public static final String SO_TT_CODE_Create_Regret = "TT139";
   	public static final String SO_TT_CODE_NP_Export_NEW = "TT140";
   	public static final String SO_TT_CODE_Exists_BroadBand = "TT141";//dm002,开户地址已存在其他宽带时创建TT
   	public static final String SO_TT_CODE_Future_confirmdate = "TT145";
   	public static final String SO_TT_CODE_Hardware_Refund_Regret = "TT151";
	public static final String SO_TT_CODE_OpenNet_reschedule_date = "TT152";
	public static final String SO_TT_CODE_OpenNet_termination_fail = "TT153";
	public static final String SO_TT_CODE_OpenNet_unkonw_information = "TT154";
	public static final String SO_TT_CODE_OpenNet_REQFRE = "TT155";
	public static final String SO_TT_CODE_OpenNet_CONFIRMED_FAIL = "TT156";
	public static final String SO_TT_CODE_Fibia_xDSLManual = "TT158";
	public static final String SO_TT_CODE_Fibia_COMMON = "TT158";
	public static final String SO_TT_CODE_SBBU_NORESPONSE_OR_REJECT = "TT159";
	public static final String SO_TT_CODE_SBBU_EMAIL_RECORD = "TT160";
	public static final String SO_TT_CODE_SBBU_CANCEL_AND_MODIFY = "TT161";


   	public static final String SO_TT_STATE_ARCHIVE = "2"; //归档
   	public static final String SO_TT_STATE_ACTIVE = "3"; //活动
   	public static final String SO_TT_STATE_SLEEP = "4"; //休眠
   	public static final String SO_TT_STATE_SAVE = "5"; //保存
   	//异常类型
   	public static final String SO_FAIL_TYPE_Send_Order_to_SFF = "Send_Order_to_SFF";
   	public static final String SO_FAIL_TYPE_Receive_Confirmation = "Receive_Confirmation";
   	//权限实体
   	public static final long SO_SecEnt_Select_CO_Manual = 21000000L;
   	public static final long SO_SecEnt_Override_CO = 21000001L;
   	public static final long SO_SecEnt_Override_Return_CPE = 21000002L;
   	public static final long SO_SecEnt_Override_OTC = 21000003L;
   	public static final long SO_SecEnt_Circuit_No = 21000004L;
   	public static final long SO_SecEnt_Change_Ongoing_Order = 21000005L;
   	public static final long SO_SecEnt_Cancel_Ongoing_Order = 21000006L;
   	public static final long SO_SecEnt_Force_Cancel_Ongoing_Order = 21000007L;
   	public static final long SO_SecEnt_Resheduel_OnGoing_Order = 21000019L;
   	public static final long SO_SecEnt_Manual_Place_Order = 21000008L;
   	public static final long SO_SecEnt_Change_Delivery_Date = 21000009L;//
   	public static final long SO_SecEnt_LU_Number = 21000010L;
   	public static final long SO_SecEnt_CPE_SN = 21000011L;
   	public static final long SO_SecEnt_CPE_Status = 21000012L;
   	public static final long SO_SecEnt_Notification_Option = 21000013L;
   	public static final long SO_SecEnt_Unsubscribe_CPE = 21000014L;
   	public static final long SO_SecEnt_Return_in_Shop = 21000015L;
   	public static final long SO_SecEnt_Modify_Bargain_Parameter = 21000016L;
   	public static final long SO_SecEnt_Supper_Modify = 21000017L;
   	public static final long SO_SecEnt_TO_TDC = 21000018L;
	public static final long SO_SecEnt_TO_CPE_RESEND = 21000025L;
	public static final long SO_SecEnt_FIBIA_CHANGE_ONLINEDATE = 25000016L;
	public static final long SO_SecEnt_FIBIA_CANCEL = 10054916L;
    public static final long SO_SecEnt_SBBU_MODIFY_POA = 10055916L;
    public static final long SO_SecEnt_SBBU_CHANGE_LINEOPTION = 10055717L;
	public static final long SO_SecPriv_FIBIA_CANCEL = 10054916L;
   	public static final long SO_SecPriv_Common = 20000000L;
	public static final long SO_SecPriv_newOM_Common = 25000016L;

   	public static final long SO_SecEnt_NEW_OM_CHANGE_PRICE_PLAN = 25000014L;
   	public static final long SO_SecPriv_NEW_OM_CHANGE_PRICE_PLAN = 25000014L;
   	/**
     * 策划类型
     */
   	public static final String OFFER_TYPE_BASE = "OFFER_PLAN";// 基本策划
   	public static final String OFFER_TYPE_VAS = "OFFER_VAS";//增值策划
	//业务操作ID
   	public static final long SO_BUSI_ID_FMC_CHANGE = 191000000031L;//
   	public static final long SO_BUSI_ID_SUBSCRIBE = SoConstUtil.getParaDetailValue4BusiId("SO_BUSI_ID_SUBSCRIBE");//订购
   	public static final long SO_BUSI_ID_UNSUBSCRIBE = SoConstUtil.getParaDetailValue4BusiId("SO_BUSI_ID_UNSUBSCRIBE");//退订
   	public static final long BUSINESS_ID_KD_XZ = SoConstUtil.getParaDetailValue4BusiId("BUSINESS_ID_KD_XZ");//宽带新装
   	public static final long BUSINESS_ID_KD_CJ = SoConstUtil.getParaDetailValue4BusiId("BUSINESS_ID_KD_CJ");//宽带拆机
   	public static final long BUSINESS_ID_KD_YJ = SoConstUtil.getParaDetailValue4BusiId("BUSINESS_ID_KD_YJ");//宽带移机
   	public static final long BUSINESS_ID_KD_CHANGE_VOIP_NUM= SoConstUtil.getParaDetailValue4BusiId("BUSINESS_ID_KD_CHANGE_VOIP_NUM");//VOIP号码变更
 	public static final long BUSINESS_ID_KD_CHANGE_TECH_PARAM= SoConstUtil.getParaDetailValue4BusiId("BUSINESS_ID_KD_CHANGE_TECH_PARAM");//技术参数变更
 	public static final long BUSINESS_ID_KD_CHANGE_OWNER_SHIP= SoConstUtil.getParaDetailValue4BusiId("BUSINESS_ID_KD_CHANGE_OWNER_SHIP");//宽带过户
   	public static final long SO_BUSI_ID_KD_CPE_RETURN = SoConstUtil.getParaDetailValue4BusiId("SO_BUSI_ID_KD_CPE_RETURN");
   	public static final long SO_BUSI_ID_KD_CPE_MANAGE = SoConstUtil.getParaDetailValue4BusiId("SO_BUSI_ID_KD_CPE_MANAGE");
   	public static final long SO_BUSI_ID_KD_CPE_RETURN_PENALTY = SoConstUtil.getParaDetailValue4BusiId("SO_BUSI_ID_KD_CPE_RETURN_PENALTY");
   	public static final long SO_BUSI_ID_KD_CPE_RETURN_TAXFREE = SoConstUtil.getParaDetailValue4BusiId("SO_BUSI_ID_KD_CPE_RETURN_TAXFREE");
   	public static final long SO_BUSI_ID_KD_VISIT_IN_VAIN = SoConstUtil.getParaDetailValue4BusiId("SO_BUSI_ID_KD_VISIT_IN_VAIN");
   	public static final long SO_BUSI_ID_KD_VISIT_GIG = SoConstUtil.getParaDetailValue4BusiId("SO_BUSI_ID_KD_VISIT_GIG");
   	public static final long SO_BUSI_ID_CHANGE_OFFER_WAIT_TERMINATE = SoConstUtil.getParaDetailValue4BusiId("SO_BUSI_ID_CHANGE_OFFER_WAIT_TERMINATE");
 	public static final long BUSINESS_ID_CPE_RESEND = SoConstUtil.getParaDetailValue4BusiId("BUSINESS_ID_CPE_RESEND");//重发CPE

   	//public static final long BUSINESS_ID_JTHDZW = SoConstUtil.getParaDetailValue4BusiId("BUSINESS_ID_JTHDZW");//家庭活动组网//del by tuhc
   	public static final long BUSINESS_ID_GH_XZ = SoConstUtil.getParaDetailValue4BusiId("BUSINESS_ID_GH_XZ");//固话新装
   	public static final long BUSINESS_ID_GH_CJ = SoConstUtil.getParaDetailValue4BusiId("BUSINESS_ID_GH_CJ");//固话拆机
   	public static final long BUSINESS_ID_GH_YJ = SoConstUtil.getParaDetailValue4BusiId("BUSINESS_ID_GH_YJ");//固话移机改号
   	public static final long BUSINESS_ID_GH_YJBGH = SoConstUtil.getParaDetailValue4BusiId("BUSINESS_ID_GH_YJBGH");//固话移机不改号
   	public static final long BUSINESS_ID_DETAIL = SoConstUtil.getParaDetailValue4BusiId("BUSINESS_ID_DETAIL");//详情
   	public static final long BUSINESS_ID_KD_HTC = SoConstUtil.getParaDetailValue4BusiId("BUSINESS_ID_KD_HTC");//宽带换套餐
   	public static final long BUSINESS_ID_GH_HTC = SoConstUtil.getParaDetailValue4BusiId("BUSINESS_ID_GH_HTC");//固话换套餐
   	public static final long BUSINESS_ID_KD_CPBG = SoConstUtil.getParaDetailValue4BusiId("BUSINESS_ID_KD_CPBG");//宽带产品变更
   	public static final long BUSINESS_ID_GH_CPBG = SoConstUtil.getParaDetailValue4BusiId("BUSINESS_ID_GH_CPBG");//固话产品变更
   	public static final long BUSINESS_ID_KD_XB = SoConstUtil.getParaDetailValue4BusiId("BUSINESS_ID_KD_XB");//宽带续包
   	public static final long BUSINESS_ID_KD_QX = SoConstUtil.getParaDetailValue4BusiId("BUSINESS_ID_KD_QX");//宽带取消
   	public static final long BUSINESS_ID_KD_SS = SoConstUtil.getParaDetailValue4BusiId("BUSINESS_ID_KD_SS");//宽带升速
   	public static final long BUSINESS_ID_KD_SSQX = SoConstUtil.getParaDetailValue4BusiId("BUSINESS_ID_KD_SSQX");//宽带升速取消
   	public static final long BUSINESS_ID_KD_MMXG = SoConstUtil.getParaDetailValue4BusiId("BUSINESS_ID_KD_MMXG");//宽带接入密码修改
   	public static final long BUSINESS_ID_KD_REPRO = SoConstUtil.getParaDetailValue4BusiId("BUSINESS_ID_KD_REPRO"); //固网重开

   	public static final long BROAD_BUSINESS_ID_KDZHCZ = SoConstUtil.getParaDetailValue4BusiId("BROAD_BUSINESS_ID_KDZHCZ");//宽带账号重置businessId
   	public static final long BROAD_BUSINESS_ID_GUHSXBG = SoConstUtil.getParaDetailValue4BusiId("BROAD_BUSINESS_ID_GUHSXBG");//固话变更下属性变更businessId
   	public static final long BROAD_BUSINESS_ID_HTC = SoConstUtil.getParaDetailValue4BusiId("BROAD_BUSINESS_ID_HTC");//宽带(固话)换套餐businessId
   	public static final long BROAD_BUSINESS_ID_KDTS = SoConstUtil.getParaDetailValue4BusiId("BROAD_BUSINESS_ID_KDTS");//宽带提速businessId
   	public static final long BROAD_BUSINESS_ID_KDSXBG = SoConstUtil.getParaDetailValue4BusiId("BROAD_BUSINESS_ID_KDSXBG");//宽带属性变更（产品变更）businessId
   	//用户扩展属性
   	public static final long UserExtContactName = 880730L;//联系人
   	public static final long UserExtContactNumber = 880731L;//联系电话
   	//宽带属性Commitment
   	public static final long SO_FEATURE_MONTH_CHARGE = 200005L;
   	public static final long SO_FEATURE_COMMITMENT_PERIOD = 50001L;
   	public static final long SO_FEATURE_NOTICE_PERIOD = 2700004L;
   	public static final long SO_FEATURE_NOTICE_PERIOD_PARTIALCHARGING = 2700326L;//Notice Period for Partial Charging // FVS-598
   	public static final long SO_FEATURE_ACCESS_TYPE = 30001L;
   	public static final long SO_FEATURE_CO_Tpye = 2700001L;
   	public static final long SO_FEATURE_GUARANTEED_SPEED = 2700009L;
   	public static final long SO_FEATURE_RATE = 2700003L;//最大速率特征ID，也是最大下行速率
   	public static final long SO_FEATURE_MAX_UP_RATE = 2700028L;//最大上行速率特征ID
   	public static final long SO_FEATURE_MIN_UP_RATE = 2700316L;//最小上行速率特征ID
   	public static final long SO_FEATURE_CPE_RETURN = 2700005L;
   	public static final long SO_FEATURE_CPE_COST = 2700025L;
   	public static final long SO_FEATURE_PENALTY_TYPE = 2701347L;
   	public static final long SO_FEATURE_VOIP_OFFER_TYPE = 2700040L;
   	public static final long SO_FEATURE_PSTN_PHONEBOOK = 2700042L;//phoneBook是否发送feature，名字取得有点不好，不仅pstn
   	public static final long SO_FEATURE_OFFER_TYPE = 10000000L;
   	public static final long SO_FEATURE_SUPPORT_TECH = 2700313L;
   	public static final long SO_FEATURE_TECH_PRIOTY = 2700314L;

   	public static final long SO_FEATURE_M2MANDIOT_EXPIREDATE_CONFIG = 2700368L;

   	public static final long SO_FEATURE_DISCOUNT_PERIOD_LENGTH = 820616L;
   	public static final long SO_FEATURE_DISCOUNT_PERIOD_COMPANY = 820617L;
   	public static final long SO_FEATURE_DISCOUNT_PERIOD_START_TIME = 820618L;
   	public static final long SO_FEATURE_DISCOUNT_PERIOD_END_TIME = 820619L;
   	public static final long SO_FEATURE_DISCOUNT_PERIOD_USE = 95042318L;
   	//宽带属性
   	public static final long BROADBAND_SRV_ATTR_ACCOUNT = 262100000001L;//上网账号
   	public static final long BROADBAND_SRV_ATTR_PASSWORD = 262100000002L;//上网密码
   	public static final long BROADBAND_SRV_ATTR_RATE = 262100000004L;//宽带速率
   	public static final long BROADBAND_SRV_ATTR_ACCESS_TYPE = 262100000007L;//接入方式
   	public static final long BROADBAND_SRV_ATTR_CO_TYPE = 262100000006L;//CO类型
   	public static final long BROADBAND_SRV_ATTR_TEST_USER = 262100000025L;//测试用户
   	public static final long BROADBAND_SRV_ATTR_TURN_NUM = 262100000077L;//呼转号码
   	public static final long BROADBAND_SRV_ATTR_EXPIRE_METHOD = 262100000085L;//到期处理方式
   	public static final long BROADBAND_SRV_ATTR_USER_CARD_TYPE = 262100000020L; //机顶盒类型
   	public static final long BROADBAND_SRV_ATTR_USER_CARD_NUM = 262100000021L; //东方有线用户证号
   	public static final long BROADBAND_SRV_ATTR_DAY_FEE = 262100000118L; //日租费用
   	public static final long BROADBAND_SRV_ATTR_EFF_DATE = 262100000120L; //生效时间
   	public static final long BROADBAND_SRV_ATTR_CO_NAME = 262100000011L; //CO Name
   	public static final long BROADBAND_SRV_ATTR_IS_CURRENT = 262100000012L; //co kind:current,optimal
   	public static final long BROADBAND_SRV_ATTR_LINE_SPEED_TYPE = 262100000009L; //profile
   	public static final long BROADBAND_SRV_ATTR_DSL_IP = 262100000008L;//DSL - IP
   	public static final long BROADBAND_SRV_ATTR_GLOBAL_IP = 262100000210L;//Global IP - IP
   	public static final long BROADBAND_SRV_ATTR_GLOBAL_IP_BLOCKSIZE = 262100000202L;//GLOBAL IP - Blocksize
   	public static final long BROADBAND_SRV_ATTR_GLOBAL_IP2 = 262100000211L;//Global IP+ - IP
   	public static final long BROADBAND_SRV_ATTR_GLOBAL_IP2_BLOCKSIZE = 262100000209L;//GLOBAL IP+ - Blocksize
//   	public static final long BROADBAND_SRV_ATTR_STATIC_IP = 262100001003L; // Static IP  - IP
//   	public static final long BROADBAND_SRV_ATTR_STATIC_IP_BLOCKSIZE = 262100001004L; // Static IP  - Blocksize

   	public static final long BROADBAND_SRV_ATTR_ACTUAL_SPEED = 262100000005L;  //Actual Speed

   	//固话属性
   	public static final long FIXPHONE_SRV_ATTR_ACCESS_TYPE = 262100000076L;//固话接入方式
    //固话产品
   	public static final long FIXPHONE_SRV_PKG_GJCH = 310080186001L;//国际长话产品
   	//上网账号重复属性值
   	public static final String BROADBAND_SRV_ATTR_VALUE_ACCOUNT = "1111111111";//铁通虚拟号重复固定值
   	//用户付费类型
   	public static final String USER_PAY_TYPE_Afterpaid = "0";//后付费
   	public static final String USER_PAY_TYPE_Prepaid = "1";//预付费
   	public static final String USER_PAY_TYPE_Other = "9";//其它
   	//宽带套餐选择目录
   	public static final long SO_BROADBAND_CATALOGID_BASE= 950641000602L;//宽带标准套餐目录
   	public static final long SO_BROADBAND_CATALOGID_GROUP= 950641000603L;//宽带活动套餐目录
   	//宽带套餐选择类型
   	public static final String SO_SELECT_OFFER_TYPE_NEW= "NEW";//普通新装
   	public static final String SO_SELECT_OFFER_TYPE_CHANGE= "CHANGE";//普通换套餐
   	public static final String SO_SELECT_OFFER_TYPE_GROUP= "GROUP";//群组新装
   	public static final String SO_SELECT_OFFER_TYPE_ADDVAS= "ADDVAS";//订购增值
   	public static final String SO_SELECT_OFFER_TYPE_ADDPLOY= "ADDPLOY";//优惠活动
   	//宽带套餐选择参数KEY
   	public static final String SO_ProdParamConsts_CHANNEL= "CHANNEL";//地区
   	public static final String SO_ProdParamConsts_DOMAIN= "DOMAIN";//行政区域
   	public static final String SO_ProdParamConsts_COMMUNITY= "COMMUNITY";//小区
   	public static final String SO_ProdParamConsts_ACCESSTYPE= "ACCESSTYPE";//接入方式
   	public static final String SO_ProdParamConsts_BROADSPEED= "BROADSPEED";//宽带速率
   	public static final String SO_ProdParamConsts_PROMCOMM= "PROMCOMM";//优惠小区
   	//策划操作Key
   	public static final String SO_INS_OFFER_OPER_DETAIL= "DETAIL";//详情
   	public static final String SO_INS_OFFER_OPER_CHANGE= "CHANGE";//换套餐
   	public static final String SO_INS_OFFER_OPER_CHANGEPROD= "CHANGEPROD";//产品变更
   	//public static final String SO_INS_OFFER_OPER_SUBSCRIBLE= "SUBSCRIBLE";//订购主策划
   	//public static final String SO_INS_OFFER_OPER_UNSUBSCRIBLE= "UNSUBSCRIBLE";//退订主策划
   	public static final String SO_INS_OFFER_OPER_CANCEL= "CANCEL";//取消
   	public static final String SO_INS_OFFER_OPER_SUBSCRIBLEVAS= "SUBSCRIBLEVAS";//订购增值
   	public static final String SO_INS_OFFER_OPER_UNSUBSCRIBLEVAS= "UNSUBSCRIBLEVAS";//退订增值
   	//不根据生失效时间查
   	public static final int VALID_TYPE_NOCHECK_EXPIRE = -2;//不根据生失效时间查
   	//数据状态
   	public static final String SO_INSX_STATE_ALL= "";//不区分状态
   	public static final String SO_INSX_STATE_0= "0";//在途
   	public static final String SO_INSX_STATE_1= "1";//正常
   	public static final String SO_INSX_STATE_3= "3";//销户
   	//固网业务费用类型
   	public static final String FIXEDLINE_TYPE_PRICE_PLAN_PKG_PREPAY = "PRICE_PLAN_PKG_PREPAY";//预存
   	public static final String FIXEDLINE_TYPE_PRICE_PLAN_PKG_BACK = "PRICE_PLAN_PKG_BACK";//退费
   	public static final String FIXEDLINE_TYPE_PRICE_PLAN_PKG_PUNISH = "PRICE_PLAN_PKG_PUNISH";//违约金
   	//付费方式
   	public static final int SO_PAY_TYPE_TURN_BILL = 6;//转账单收取
   	public static final int SO_PAY_TYPE_CASH = 3;//现金缴费
   	//固网费用类型
   	public static final int SO_FIXEDLINE_FEE_FLAG_ONCE = 1;//一次性出账
   	public static final int SO_FIXEDLINE_FEE_FLAG_MONTH = 2;//按月出账
   	//是否老系统标记
   	public static final int FIXEDLINE_OLD_SYSTEM_YES = 1;//是老系统生成业务
   	public static final int FIXEDLINE_OLD_SYSTEM_NO = 0;//是新系统生成业务

    //家庭套餐预约邀请表状态ordx_pre_sale.pre_order_type
    public static final int FAMILY_OFFER_PRE_SATE_TYPE_8=8;//家庭套餐成员预约增加
    public static final int FAMILY_OFFER_PRE_SATE_TYPE_9=9;//家庭套餐成员邀请
    //家庭套餐业务操作
    //public static final long FAMILY_OFFER_BUSI_MEMBER_INVITE=500000021048L;//成员邀请//del by tuhc

    public static String FAMILY_TYPE_NOMAL = "1"; //普通家庭套餐
    public static String FAMILY_TYPE_PLAN_A = "2"; //A计划
    public static String GROUP_TYPE_NOMAL = "3"; //普通群组套餐
    public static String GROUP_TYPE_PLAN_B = "4"; //B计划

    //家庭套餐拆网
    //public static final long BUSI_FAMILY_QUIT = SoConstUtil.getParaDetailValue4BusiId("BUSI_FAMILY_QUIT");//del by tuhc
    //其他群组组网
    //public static final long BUSI_GROUP_CREATE = SoConstUtil.getParaDetailValue4BusiId("BUSI_GROUP_CREATE");// del by tuhc
    //其他群组成员变更
    //public static final long BUSI_GROUP_MEMBER_CHANGE = SoConstUtil.getParaDetailValue4BusiId("BUSI_GROUP_MEMBER_CHANGE");//del by tuhc
    //其他群组拆网
    //public static final long BUSI_GROUP_QUIT = SoConstUtil.getParaDetailValue4BusiId("BUSI_GROUP_QUIT");//del by tuhc

    //有线固话开户
    //public static final long BUSI_ID_NEW_FIXEDLINE = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_NEW_FIXEDLINE");//del by tuhc


    //个人客户查询方式
    public static final int INDIVI_CUST_QUERY_TYPE_CERT = 1;//按证件查询
    public static final int INDIVI_CUST_QUERY_TYPE_NAME = 2;//根据客户名称查询
    public static final int INDIVI_CUST_QUERY_TYPE_BILLID = 3;//根据手机号码查询
    public static final int INDIVI_CUST_QUERY_TYPE_BANKACCT = 4;//根据银行账号查询
    public static final int INDIVI_CUST_QUERY_TYPE_ACCTID = 5;//根据账户编号查询

    //货币符号
    public static String CURRENCY_NAME="";
    public static String CURRENCY_SYMBOL="";

  //20002:资源编码20003:资源最小数量20004:资源最大数量20005:资源价格20006:优惠价格
   	public static final long RES_CODE=20002L ;
   	public static final long MIN_NUM=20003L ;
   	public static final long MAX_NUM=20004L ;
   	public static final long RES_PRICE=20005L ;
   	public static final long PROM_PRICE=20006L ;

    // 协议期feature
    public static final long NEW_PHONE_COMMITMENT_WITH_HANDSET_FEATURE_ID = 200028L;
    public static final long NEW_PHONE_COMMITMENT_WITHOUT_HANDSET_FEATURE_ID = 200027L;
    public static final long SUBSCRIPTION_COMMITMENT_FEATURE_ID = 50001L;
	public static final long SUBSCRIPTION_COMMITMENT_CONVERT_IN_FEATURE_ID = 2700031L;
	public static final long NEW_PHONE_COMMITMENT_CONVERT_IN_WITHOUT_HANDSET_FEATURE_ID = 2700033L;
	public static final long SERVICE_COMMITMENT_FEATURE_ID = 50002L;


	//租户（丹麦）
    public static final String DENMARK_TENANTID = "01";
    public static final String TEST_DENMARK_TENANTID = "21";

    //jtw产品规格类型
    public static final String SO_GROUP_OFFER_ITEM_TYPE = "SO_GROUP_OFFER_ITEM_TYPE";

    //等待节点
    public static final String SO_TASK_TAG_TagWaitCreateVPNGroup = "TagWaitCreateVPNGroup";
    public static final String SO_TASK_TAG_TagWaitCreateInsUser = "TagWaitCreateInsUser";
  	public static final String SO_TASK_TAG_TagWaitAddVPNMem = "TagWaitAddVPNMem";
  	public static final String SO_TASK_TAG_TagWaitMainFlow = "TagWaitMainFlow";
  	public static final String SO_TASK_TAG_TagWaitAddOTTMem = "TagWaitAddOTTMem";
  	public static final String SO_TASK_TAG_TagWaitAddOnNP = "TagWaitAddOnNP";
  	public static final String SO_TASK_TAG_TagWaitPSTNTermination = "TagWaitPSTNTermination";

   // 等待节点分支对应的结果
   	public static final String SO_TASK_WAIT_RESULT_COMMON = "Common";
   	public static final String SO_TASK_WAIT_RESULT_OTT = "OTT";
   	public static final String SO_TASK_WAIT_RESULT_VPN = "VPN";
   	public static final String SO_TASK_WAIT_RESULT_SUB = "SUB";
   	public static final String SO_TASK_WAIT_RESULT_AddOnNP = "AddOnNP";
   	public static final String SO_TASK_WAIT_RESULT_PSTNRESOLD = "PSTNRESOLD";


    // NP Port In
    //checkAgreement
    public static final String COUNTRY_CODE_DK = "DK";//DK
    public static final String COUNTRY_CODE_HU = "HU";//HU
    public static final String RESULT_CODE_SUC ="1000";//Success
    public static final String RESULT_CODE_ERR ="0000";//Error
    public static final String NODE_NAME_ICC_AGREEMENT="I";//ICC_AGREEMENT
    public static final String NODE_NAME_ACCOUNT_ID_AGREMENT="C";//ACCOUNT_ID_agrement
    public static final String NODE_NAME_DIGITAL_POA="D";//Digital  POA
    public static final String NODE_NAME_WRITTEN_POA="W";//written  POA
    public static final String IS_NEDD_Y="1";//Need
    public static final String IS_NEDD_N="0";//Not Need

    //portInRequestForDK


    public static final String CUSTOMER_TYPE_INDIVIDUAL ="M";//Individual subscribers
    public static final String CUSTOMER_TYPE_NOINDIVIDUAL ="G";//noindividual subscribers
    public static final String NUMBER_TYPE_FIXED="FIXED";//FIXED
    public static final String NUMBER_TYPE_GSM="GSM";//GSM
    public static final String POINT_OF_CONNECTION_DONOR="DONOR";//Donor
    public static final String POINT_OF_CONNECTION_RECIPIENT="RECIPIENT";//Recipient
    public static final String MSISDN_DATA = "A";//data
    public static final String MSISDN_FAX = "F";//fax
    public static final String M_OKM_TIP_ID_CARD="S";//ID card
    public static final String M_OKM_TIP_PASSPORT="U";//Passport
    public static final String M_OKM_TIP_DRIVING_LICENSE="J";//Driving license
    public static final String M_OKM_TIP_RESIDENCE_PERMIT ="T" ;//Residence permit
    public static final long ORD_PORTIN_POA_STATE_0=0;//失效
    public static final long ORD_PORTIN_POA_STATE_1=1;//有效
    public static final String ORD_PORTIN_POA_POA_STATE_0="0";//
    public static final String ORD_PORTIN_POA_POA_STATE_1="0";//
    public static final String REMAINING_DAYS = "$Remaining_days$";


    //NP Port In 人工回单节点静态数据的codeType
    public static final String HandlePortInRequest_Remind_Customer_To_Provide_Poa="com.asiainfo.crm.so.vm.common.HandlePortInRequest.33";
    public static final String HandlePortInRequest_Remind_Customer_TO_Provide_Poa_Again="com.asiainfo.crm.so.vm.common.HandlePortInRequest.21";
    public static final String HandlePortInRequest_Generate_Letter_TO_Remind_Poa="com.asiainfo.crm.so.vm.common.HandlePortInRequest.22";
    public static final String HandlePortInRequest_Receive_Port_In_Order="com.asiainfo.crm.so.vm.common.NPSubFlow.32";

    public static final String HandleReturnNumberToOtherOperator_Np_Result_Response="com.asiainfo.crm.so.vm.common.HandleReturnNumberToOtherOperator.3";

    public static final String HandlePortInRequestConfirm_Wait_For_Open_1="com.asiainfo.crm.so.vm.common.HandlePortInRequestConfirm.9";//confirm时候，等待超时开户节点1
    public static final String HandlePortInRequestConfirm_Whether_Accept = "com.asiainfo.crm.so.vm.common.HandlePortInRequestConfirm.4";//confirm时候，让用户确认是否接收当前时间
    public static final String HandlePortInRequestConfirm_Wait_For_Open_2="com.asiainfo.crm.so.vm.common.HandlePortInRequestConfirm.11";//confirm时候，等待超时开户节点2
    public static final String HandlePortInRequest_Waiting_Contract = "com.asiainfo.crm.so.vm.common.HandlePortInRequest.69";
    public static final String HandlePortInRequest_Waiting_Contract01 = "com.asiainfo.crm.so.vm.common.HandlePortInRequest.70";

    public static final String portinSub_Waiting_Contract = "com.asiainfo.crm.so.vm.rboss.fixedline.PortInSub.60";
    public static final String portinSub_Waiting_Contract01 = "com.asiainfo.crm.so.vm.rboss.fixedline.PortInSub.61";
    public static final String HandlePortOutRequest_NPnotify = "com.asiainfo.crm.so.vm.common.HandlePortOutRequest.22";


    //列举出来的人工节点处理结果,只是前台回单的处理结果
    public static final String SendNPRequest_Receive_NP_Result = "com.asiainfo.crm.so.vm.common.SendNPRequest.3";
    public static final String SendNPRequest_Receive_NP_Result_CancelAndSelect = "CancelAndSelect";
    public static final String SendNPRequest_Receive_NP_Result_CancelAndTrigger = "CancelAndTrigger";
    public static final String SendNPRequest_Waiting_For = "com.asiainfo.crm.so.vm.common.SendNPRequest.68";
    public static final String SendNPRequest_Send_To_Donor = "com.asiainfo.crm.so.vm.common.SendNPRequest.78";
    public static final String HandlePortInRequestReject_Manual_Collection_Information_from_Customer = "com.asiainfo.crm.so.vm.common.HandlePortInRequestReject.21";

    //WHOLESALE NP
    public static final String SendNPRequest_Receive_NP_Result_WS = "com.asiainfo.crm.so.vm.wholesale.np.HandlePortInRequest4WS.3";
    public static final String HandlePortInRequest_Receive_Port_In_Order_WS="com.asiainfo.crm.so.vm.wholesale.np.HandlePortInRequest4WS.67";
    public static final String HandlePortOutRequest_NPnotify_WS = "com.asiainfo.crm.so.vm.wholesale.np.HandlePortOutRequest4WS.22";
    public static final String HandlePortInRequest_Wait_For_Effective_Date_WS="com.asiainfo.crm.so.vm.wholesale.np.HandlePortInRequest4WS.59";

    public static final String SendNPRequest_Waiting_WS = "com.asiainfo.crm.so.vm.wholesale.np.HandlePortInRequest4WS.59";
    //end

    public static final String SO_NP_IS_AGREE_Y="1";//同意
    public static final String SO_NP_IS_AGREE_N="0";//不同意
    public static final String HandlePortInRequestConfirm_Contact_Customer_Accept="com.asiainfo.crm.so.vm.common.HandlePortInRequestConfirm.4";
    public static final String HandlePortInRequestConfirm_Contact_Customer_Accept_True="yes";
    public static final String HandlePortInRequestConfirm_Manual_Decisoin_Request="request";
    public static final String HandlePortInRequestConfirm_Manual_Decisoin_Cancel="cancel";


    public static final String HandlePortInRequestConfirm_Manual_Decisoin_Waiting="com.asiainfo.crm.so.vm.common.HandlePortInRequestConfirm.9";
    public static final String HandlePortInRequestConfirm_Manual_Decisoin_Waiting_Request="request";
    public static final String HandlePortInRequestConfirm_Manual_Decisoin_Waiting_Cancel="cancel";


    public static final String HandlePortInRequestNoConfirm_Send_Reminder_TO_Donor ="com.asiainfo.crm.so.vm.common.HandlePortInRequestNoConfirm.2";
    public static final String HandlePortInRequestNoConfirm_Manual_Decision  ="com.asiainfo.crm.so.vm.common.HandlePortInRequestNoConfirm.5";

    public static final String HandlePortInRequestReject_Correct_NP_Internally = "com.asiainfo.crm.so.vm.common.HandlePortInRequestReject.14";
    public static final String HandlePortInRequestReject_Contact_Donor_AND_Collect_Information = "com.asiainfo.crm.so.vm.common.HandlePortInRequestReject.9";

    public static final String HandlePortInRequestReject_Manual_Decision_May_Be_With_Contact_Donor_And_Collect_Information="com.asiainfo.crm.so.vm.common.HandlePortInRequestReject.28";

    public static final String SAP_OrderRequestToSAP_Receive_IMEI_OR_ICC = "com.asiainfo.crm.so.vm.common.OrderRequestToSAP.23";
    public static final String SAP_OrderRequestToSAP_Wait_IMEI_OR_ICC = "com.asiainfo.crm.so.vm.common.OrderRequestToSAP.29";

    public static final String HandlePortOutRequest = "com.asiainfo.crm.so.vm.common.HandlePortOutRequest.22";

    public static final String NP_RESULT_RESPONSE_BUSINESS_TYPE_1="1";//crm发起port in流程，och完成后(包括成功失败），np通知crm已经竣工。
    public static final String NP_RESULT_RESPONSE_BUSINESS_TYPE_2="2";//crm发起rangeChangeRequest流程，och完成后(包括成功失败），np通知crm已经竣工。
    public static final String NP_RESULT_RESPONSE_BUSINESS_TYPE_3="3";//crm发起returnNumber流程，och完成后(包括成功失败），np通知crm已经竣工。
    public static final String NP_RESULT_RESPONSE_RESPONSE_TYPE_SUC="1";//success
    public static final String NP_RESULT_RESPONSE_RESPONSE_TYPE_FAIL="2";//	fail

    public static final String PORT_IN_RESPONSE_RESPONSE_TYPE_CONFIRM="1";//confirm
    public static final String PORT_IN_RESPONSE_RESPONSE_TYPE_REJECT="2";//reject
    public static final String PORT_IN_RESPONSE_REJECT_CODE_100="100";//不知道的电话号码 Unknown MSISDN
    public static final String PORT_IN_RESPONSE_REJECT_CODE_110="110";//电话号码已经在其他正在携转流程里面   The MSISDN is already in other porting process
    public static final String PORT_IN_RESPONSE_REJECT_CODE_130="130";//Rejected, expired debit
    public static final String PORT_IN_RESPONSE_REJECT_CODE_160="160";//准备不通过   Rejected, no arrangement
    public static final String PORT_IN_RESPONSE_REJECT_CODE_200="200";//不能确定用户  Subscriber cannot be identified

    // 标注 not In use 的没有枚举出来
//    public static final String PORT_IN_RESPONSE_REJECT_REASON_300="300";//Semicolon is missing from line.
//    public static final String PORT_IN_RESPONSE_REJECT_REASON_301="301";//Field is missing.
//    public static final String PORT_IN_RESPONSE_REJECT_REASON_302="302";//Field is present more than once.
//    public static final String PORT_IN_RESPONSE_REJECT_REASON_303="303";//Field content is illegal.
//    public static final String PORT_IN_RESPONSE_REJECT_REASON_306="306";//The telephone number is not within a range in the number database.
//    public static final String PORT_IN_RESPONSE_REJECT_REASON_307="307";//Field content is too long.
//    public static final String PORT_IN_RESPONSE_REJECT_REASON_308="308";//Index value is illegal
//    public static final String PORT_IN_RESPONSE_REJECT_REASON_309="309";//The TelephoneNumber is present in another active flow.

    public static final String PORT_IN_RESPONSE_CONTACT="PORT_IN_RESPONSE_CONTACT";//PORT_IN_RESPONSE走Contact分支的code_type
    public static final String PORT_IN_RESPONSE_AUTO="PORT_IN_RESPONSE_AUTO";//PORT_IN_RESPONSE走auto分支的code_type

    public static final String PORT_IN_RESPONSE_REJECT_REASON_330="330";//The number type II configuration does not match donor’s registration.
    public static final String PORT_IN_RESPONSE_REJECT_REASON_338="338";//Telephone number not located at donor operator
    public static final String PORT_IN_RESPONSE_REJECT_REASON_339="339";//The Customer ID does not match the telephone number
    public static final String PORT_IN_RESPONSE_REJECT_REASON_349="349";//The telephone number is not in use at the donor operator
    public static final String PORT_IN_RESPONSE_REJECT_REASON_350="350";//The FIXED telephone number address is undefined.
    public static final String PORT_IN_RESPONSE_REJECT_REASON_351="351";//Rejected due to pending change of telephone number
    public static final String PORT_IN_RESPONSE_REJECT_REASON_352="352";//The telephone has a pending reactivate order
    public static final String PORT_IN_RESPONSE_REJECT_REASON_353="353";//Rejected due to pending change of customer
    public static final String PORT_IN_RESPONSE_REJECT_REASON_355="355";//The customer rejects porting
    public static final String PORT_IN_RESPONSE_REJECT_REASON_356="356";//Rejected, donor operator is the customer
    public static final String PORT_IN_RESPONSE_REJECT_REASON_376="376";//Written termination not received by Donor within timeframe.
    public static final String PORT_IN_RESPONSE_REJECT_REASON_378="378";//Network Operator rejects porting Request. Contact Network Operator for reason.
    public static final String PORT_IN_RESPONSE_REJECT_REASON_379="379";//Range has ported numbers
    public static final String PORT_IN_RESPONSE_REJECT_REASON_380="380";//Wrong name and CVR number
    public static final String PORT_IN_RESPONSE_REJECT_REASON_382="382";//ICC number does not match telephone number.
    public static final String PORT_IN_RESPONSE_REJECT_REASON_383="383";//Illegal CVR number used in written termination.
    public static final String PORT_IN_RESPONSE_REJECT_REASON_348="348";//Internal porting in progress to [Recipient Operator] due [the porting due date]

    public static final String NPRejectCode="NPRejectCode";//np port in 前台回单页面，需要往流程里回填值
	public static final long npPortInDefTaskStaffId = 19999999L;//np port in流程默认TaskStaffId
	public static final long npPortInDefTaskOrgId = 29999999L;//np port in流程默认TaskOrgId
	public static final String CRM_ORDER_FINISHED_NUMBER_PORTED_Y = "Y";//已经转入

	public static final String PORT_OUT_REQUEST_POINT_OF_CONNECTION_DONOR = "Donor";// Donor
	public static final String PORT_OUT_REQUEST_POINT_OF_CONNECTION_RECIPIENT = "Recipient";// Recipient
	public static final String HandlePortInRequestReject_Trigger_New_NP_Request = "trigger";
	public static final String PORT_OPERATOR_TELETOR = "PORT_OPERATOR_TELETOR"; // NP接口交互np运营商编码 ; // "01099";

    public static final String SYNC_NP_ERROR_ERROR_CODE_="";//Recipient


    public static final String REQUEST_NPGW_RESPONSE_SUCC = "0000";//请求NPGW响应成功
    public static final String REQUEST_NPGW_RESPONSE_FAIL = "6000";//请求NPGW响应失败

    /***************SAP接口常量定义***********************************/
    public static final String SAP_DISTRC_CHAN = "01";//‘01’ DK	 ‘05’ THU
    public static final String SAP_DEALER_ID = "D1";////Owner code of the Shop  (in case of TDK it will be a fix Dealer code)
    public static final String SAP_SOURCE_SYSTEM_ID = "Veris";
    public static final String SAP_CUST_TYPE = "01"; ////01 vip 02 non
    public static final String SAP_DOMAIN_TYPE = "street"; ////01 vip 02 non
    public static final String SAP_CURRENCY = "DKK";
	public static final long SAP_BACK_ORDER_CFG_BUSI_TYPE = 800000L; // SAP流程backOrder,到货通知
	public static final String SAP_MANAGE_STATUS_0 = "0"; //初始
	public static final String SAP_MANAGE_STATUS_1 = "1"; //比对成功
	public static final String SAP_MANAGE_STATUS_2 = "2"; //比对失败
	public static final String SAP_MANAGE_STATUS_3 = "3"; //实占
	public static final String SAP_MANAGE_STATUS_4 = "4"; //取消
	public static final String SAP_MANAGE_STATUS_5 = "5"; //已经通知SAP实占
	public static final String SAP_NORMAL = "frmNormal_sapNormal";
	public static final String DELIVERY_NORMAL ="frmNormal_Delivery";//物流信息
	public static final String SAP_ORDER_ID = "sapOrderId";
	public static final String NP_PORT_OUT_ORDERFINISHED_TASK_ID= "22";//port out里面，在port in方往npgw发送请求后，他们会走portOutRequest接口。然后在npgw没有通知telenor orderFinished之前，那port in方就可以取消port out方的单子
	public static final String SAP_DOC_TYPE_RETURN= "Z108";
	public static final String SAP_DOC_TYPE_CONFIRM= "Z101";
   /********************************** NP   **************************/
	public static final String NP_PART_DATA = "PortData";
	public static final long BUSI_ID_NP_OUT = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_NP_OUT");//携出
	public static final String BUSI_TYPE_NP_OUT = "CREATE";//携出
	public static final int SO_PORT_OUT_TYPE =880750;//号码携出标志
	public static final int SO_PORT_IN_TYPE =880751;//号码携入标志
	public static final int SO_PORT_OPERATION_TYPE =880752;//operation标志
	public static final int SO_PORT_INET_TYPE =880753;//入网标志
	//public static final int SO_PORT_GSM_TYPE =880753;//以网标志
	//public static final int SO_PORT_FIXED_TYPE =880754;//固网标志
	public static final String SO_PROT_OUT_CHECK_NORMAL = "Check_init";
	public static final String SO_PROT_OUT_CHECK_UPDATERESSTATU = "Check_updateResStatu";
	public static final String SO_PROT_OUT_CHECK_ERROR = "Check_error";

	public static final String SO_PORT_OUT_VALUE_0 ="0";//号码携出标志(0正常)
	public static final String SO_PORT_OUT_WF = "com.asiainfo.crm.so.vm.common.HandlePortOutRequest";
	//WHOLESALE
	public static final String SO_PORT_OUT_WF_WS = "com.asiainfo.crm.so.vm.wholesale.np.HandlePortOutRequest4WS";
	//end

	public static final String RETURN_NUMBER_TO_OTHER_OPERATOR = "com.asiainfo.crm.so.vm.common.HandleReturnNumberToOtherOperator";

	public static final String SO_HANDSET_OFFER_SPLIT_PROCESS = "com.asiainfo.crm.so.vm.rboss.handSet.HandSetOfferSplit";


	//begin mod by tuhc 从静态表中读取
	//public static final String NP_INIT_STAFF_ID = "3333555";//NP 流程默认操作员
	public static final String NP_INIT_STAFF_ID = SoConstUtil.getParaDetailValueByCondition("NP_INIT_STAFF_ID");
	//end mod by tuhc

	public static final String DELIVERY_TYPE_SAP = "1";//走物流
	public static final String DELIVERY_TYPE_BUSI_HALL = "0";//走营业厅
	public static final String DELIVERY_TYPE_NO_DELIVERY = "2"; //No delivery类型
	public static final String SO_NUM_TYPE_IS_NP = "3";
	public static final String NP_IS_SEND_PORTIN_REQUEST_Y = "1";//请求已发
	public static final String NP_IS_SEND_PORTIN_REQUEST_N = "0";//请求未发，或者已经取消掉
	public static final String NP_IS_SEND_PORTIN_REQUEST_SEND_OK = "2";//已经通知npgw 竣工了
	public static final String NP_IS_CANCEL_LEADING_NUMBER_NP_REQUEST = "1";//是否是leading number with number range 取消np 订单的

	public static final String NP_IS_RETURN_CONFIRMDATE_Y = "1";//号码port in过程中已经得到confirmDate了
	public static final String NP_IS_RETURN_CONFIRMDATE_N = "0";//号码port in过程中没有得到confirmDate了

	public static final String SAP_IS_LOCK_Y="1";//sap已经锁定
	public static final String SAP_IS_LOCK_N="0";//sap没有锁定

	public static final String SAP_INFO_SEND_CREATEDOC="1";//sap发预占
	public static final String SAP_INTO_SAP_WORKFLOW="2";//crm工作流中sap流程已经走过
	public static final String SAP_INTO_GET_INFO="3";//crm已经sap得到sap信息



	/*********************PUSH 静态常量**********************/
	public interface FixedLinePushC {
		public static final String SO_PUSHC_SUBMIT_NEW = "SO_FIXEDLINE_SUBNEW01"; //订单提交通知EventCode根据BusinessId从静态表读取
		public static final String SO_PUSHC_SUBMIT_CHANGEOFFER = "SO_FIXEDLINE_SUBCHANGEOFFER01";//包含changeRouter,change addOn,change Line Speed
		public static final String SO_PUSHC_SUBMIT_RELOCATION = "SO_FIXEDLINE_SUBRELOCATION01";
		public static final String SO_PUSHC_SUBMIT_TERMINATION = "SO_FIXEDLINE_SUBTERMINATION01";
		public static final String SO_PUSHC_SUBMIT_CHANGEVOIPNUM = "SO_FIXEDLINE_SUBCHANGEVOIPNUM01";
		public static final String SO_PUSHC_SUBMIT_TRANSHIPNEW = "SO_FIXEDLINE_SUBTRANSHIPNEW01";//过户订单发给新客户
		public static final String SO_PUSHC_SUBMIT_TRANOWNOLD = "SO_FIXEDLINE_SUBTRANSHIPOLD01";//过户订单发给老客户


		public static final String SO_PUSHC_COMPLETE_REMIND01 = "SO_FIXEDLINE_COMPLETENESSREMIND01"; //完整性第一次提醒消息
		public static final String SO_PUSHC_COMPLETE_REMIND02 = "SO_FIXEDLINE_COMPLETENESSREMIND02"; //完整性第二次提醒消息
		public static final String SO_PUSHC_COMPLETE_REMIND03 = "SO_FIXEDLINE_COMPLETENESSREMIND03"; //完整性第三次提醒消息
		public static final String SO_PUSHC_OTHER_INFO = "SO_FIXEDLINE_OTHERINFO01"; //通过客户其他信息
		public static final String SO_PUSHC_ONLINE_DATE = "SO_FIXEDLINE_ONLINEDATE01"; //通知客户OnlineDate
		public static final String SO_PUSHC_CHANGE_ONLINE_DATE = "SO_FIXEDLINE_CHANGEONLINEDATE01"; //通知客户修改OnlineDate
		public static final String SO_PUSHC_CHANGED_CONFIRMED_ONLINEDATE = "SO_FIXEDLINE_CHANGED_CONFIRMED_ONLINEDATE"; //通知客户修改OnlineDate
		public static final String SO_PUSHC_DELIVERY_CPE = "SO_FIXEDLINE_CPEDELIVERY01"; //通过客户CPE delivery
		public static final String SO_PUSHC_RETURN_CPE = "SO_FIXEDLINE_CPERETURN01"; //通过客户CPE return
		public static final String SO_PUSHC_GLOBAL_IP = "SO_FIXEDLINE_GLOBALIP01"; //通知客户Global IP+占用的IP
		public static final String SO_PUSHC_CANCEL_ORDER = "SO_FIXEDLINE_CANCEL_ORDER01";//撤单
		public static final String SO_PUSHC_PHONE_STATUS = "SO_PHONEBOOK_STATUS";//phone status
		public static final String SO_FIXEDLINE_NP_CHANGENUM ="SO_FIXEDLINE_NP_CHANGENUM";//固网port in 三次poacheck失败后，系统选择tn号码，此时要通知客户

		public static final String SO_PUSHC_CHG_RESHEDULE = "SO_FIXEDLINE_CHGRESHEDULE01";//改单reshedule
		public static final String SO_PUSHC_CHG_VOIPNUM = "SO_FIXEDLINE_CHGVOIPNUM01";//改单改VOIPNum
		public static final String SO_PUSHC_CHG_DELIVERY= "SO_FIXEDLINE_CHGDELIVERY01";//改单改投递地址
		public static final String SO_PUSHC_CHG_VISITSRV = "SO_FIXEDLINE_CHGVISITSRV01";//改单改服务方式
		public static final String SO_PUSHC_SIGN_TRANSNEW01 = "SO_FIXEDLINE_SIGNTRANSNEW01";//过户发送电子合同给新客户
		public static final String SO_PUSHC_SIGN_TRANSOLD01 = "SO_FIXEDLINE_SIGNTRANSOLD01";//过户发送电子合同给老客户
		public static final String SO_PUSHC_SUCCESS_TRANSNEW01 = "SO_FIXEDLINE_SUCCESSTRANSNEW01";//过户成功发送给新客户
		public static final String SO_PUSHC_SUCCESS_TRANSOLD01 = "SO_FIXEDLINE_SUCCESSTRANSOLD01";//过户成功发送给老客户
		public static final String SO_PUSHC_CREDIT_TRANFAIL01 = "SO_FIXEDLINE_CREDITTRANFAIL01";//过户校验信用度失败发给上家
		public static final String SO_PUSHC_CREDIT_TRANFAIL02 = "SO_FIXEDLINE_CREDITTRANFAIL02";//过户校验信用度失败发给下家
		public static final String SO_PUSHC_MODIFY_ORDER= "SO_FIXEDLINE_MODIFY_ORDER";//改单发邮件
		public static final String SO_PUSHC_CHG_OFFLINEDATE01= "SO_FIXEDLINE_CHG_OFFLINEDATE01";//改单发邮件

		public static final String SO_PUSHC_PROVIDE_NP_REMIND01 = "SO_FIXEDLINE_PROVIDE_NP_REMIND01";//NP完整性第一次提醒
		public static final String SO_PUSHC_PROVIDE_NP_REMIND02 = "SO_FIXEDLINE_PROVIDE_NP_REMIND02";//NP完整性第二次提醒
		public static final String SO_PUSHC_PROVIDE_NP_REMIND03 = "SO_FIXEDLINE_PROVIDE_NP_REMIND03";//NP完整性第三次提醒
		public static final String SO_PUSHC_PROVIDE_XDSL_REMIND01 = "SO_FIXEDLINE_PROVIDE_XDSL_REMIND01";//XDSL完整性第一次提醒
		public static final String SO_PUSHC_PROVIDE_XDSL_REMIND02 = "SO_FIXEDLINE_PROVIDE_XDSL_REMIND02";//XDSL完整性第二次提醒
		public static final String SO_PUSHC_PROVIDE_XDSL_REMIND03 = "SO_FIXEDLINE_PROVIDE_XDSL_REMIND03";//XDSL完整性第三次提醒
		public static final String SO_PUSHC_PROVIDE_SBBU_REMIND01 = "SO_FIXEDLINE_PROVIDE_SBBU_REMIND_01";//收到sp的reject后，通知客户修改sbbu poa信息
		public static final String SO_PUSHC_CPE_RETURN_TERMINATION_DATE = "SO_FIXEDLINE_CPE_RETURN_TERMINATION_DATE";//'CPE归还，预销户时间提醒
		public static final String SO_PUSHC_GLOBALIP_ONLINE_DATE = "SO_FIXEDLINE_GLOBALIP_ONLINE_DATE";//GLOBAL IP + Online Date通知
		public static final String SO_PUSHC_PLUGIN_CPE01 = "SO_FIXEDLINE_PLUGIN_CPE01";//PLUGIN CPE第一次提醒
		public static final String SO_PUSHC_PLUGIN_CPE02 = "SO_FIXEDLINE_PLUGIN_CPE02";//PLUGIN CPE第二次提醒
		public static final String SO_PUSHC_PLUGIN_CPE03 = "SO_FIXEDLINE_PLUGIN_CPE03";//PLUGIN CPE第三次提醒
		public static final String SO_PUSHC_VISITSERVICE_CHANGE= "SO_FIXEDLINE_VISITSERVICE_CHANGE";//改visitService
		public static final String SO_PUSHC_SBBU_POA =  "SO_FIXEDLINE_SBBU_POA_01";
		public static final String SO_PUSHC_TDC_ETABLERINGSAFTALE = "SO_FIXEDLINE_TDC_ETABLERINGSAFTALE 01";


		public static final String SO_PUSHC_PARA = "SO_PUSHC_PARA";
		public static final String SO_PC_EVENT_CODE = "PC_EVENT_CODE";
		public static final String SO_PUSHC_EVENT_START = "SO_EVENT_";
		public static final String TELENOR_PHONE_NUMBER_PRIVATE_CUSTOMER = SoConstUtil.getParaDetailValueByCondition4PushC("PRIVATE");
		public static final String TELENOR_PHONE_NUMBER_BUSINESS_CUSTOMER = SoConstUtil.getParaDetailValueByCondition4PushC("BUSINESS");
		public static final String SO_PUSHC_PARA_SOORDERDATA= "soOrderData";
		public static final String SO_PUSHC_PARA_OFFER_NAME= "OFFER_NAME";
		public static final String SO_PUSHC_PARA_RTC_FEE= "RTC_FEE";
		public static final String SO_PUSHC_PARA_OTC_FEE= "OTC_FEE";
		public static final String SO_PUSHC_PARA_SUM_RTC_FEE= "SUM_RTC_FEE";
		public static final String SO_PUSHC_PARA_SUM_OTC_FEE= "SUM_OTC_FEE";
		public static final String SO_PUSHC_PARA_TRANSHIP_SUM_RTC_FEE= "TRANSHIP_SUM_RTC_FEE";
		public static final String SO_PUSHC_PARA_EKSKL_MOMS= "";
		public static final String SO_PUSHC_PARA_KR= " kr. ";

		public static final String SO_PUSC_BUSI_CODE_NEW_CONNECTION="NEW_CONNECTION";//新装
		public static final String SO_PUSC_BUSI_CODE_CHANGE_LINESPEED="CHANGE_LINESPEED";//换速率
		public static final String SO_PUSC_BUSI_CODE_CHANGE_SERVICE_ADDRESS="CHANGE_SERVICE_ADDRESS";//移机
		public static final String SO_PUSC_BUSI_CODE_VOIP_SUBSCRIPTION="VOIP_SUBSCRIPTION";//订购VOIP
		public static final String SO_PUSC_BUSI_CODE_TERMINATION_DSL="TERMINATION_DSL";//销DSL
		public static final String SO_PUSC_BUSI_CODE_TERMINATION_VOIP="TERMINATION_VOIP";//销VOIP
		public static final String SO_PUSC_BUSI_CODE_TERMINATION_DSL_VOIP="TERMINATION_DSL_VOIP";//销DSL&VOIP
		public static final String SO_PUSC_BUSI_CODE_CHANGE_DSL_MAIN_OFFER="CHANGE_DSL_MAIN_OFFER";//换主Offer
		public static final String SO_PUSC_BUSI_CODE_CHANGE_VOIP_OFFER="CHANGE_VOIP_OFFER";//换VOIP Offer
		public static final String SO_PUSC_BUSI_CODE_CHANGE_VOIP_NUMBER="CHANGE_VOIP_NUMBER";//换VOIP号码
		public static final String SO_PUSC_BUSI_CODE_CHANGE_PHONEBOOK_STATUS="CHANGE_PHONEBOOK_STATUS";//换PHONEBOOK STATUS
		public static final String SO_PUSC_BUSI_CODE_CHANGE_ROUTER="CHANGE_ROUTER";//换CPE
		public static final String SO_PUSC_BUSI_CODE_ADD_DSL_ADD_ON="ADD_DSL_ADD_ON";//订购 DSL ADD-ON
		public static final String SO_PUSC_BUSI_CODE_ADD_VOIP_ADD_ON="ADD_VOIP_ADD_ON";//订购 VOIP ADD-ON
		public static final String SO_PUSC_BUSI_CODE_DELETE_DSL_ADD_ON="DELETE_DSL_ADD_ON";//退订 DSL ADD-ON
		public static final String SO_PUSC_BUSI_CODE_DELETE_VOIP_ADD_ON="DELETE_VOIP_ADD_ON";//退订 VOIP ADD-ON
		public static final String SO_PUSC_BUSI_CODE_CHANGE_OWNER_SHIP="TRANSFER_OWNERSHIP";//过户
		public static final String SO_PUSC_BUSI_CODE_VOIP_SUBSTRIPTION_WITHOUTNP="VOIP_SUBSTRIPTION_WITHOUTNP";//过户


		public static final String SO_PUSC_BUSI_NAME_CHANGE_LINESPEED="båndbredde";
		public static final String SO_PUSC_BUSI_NAME_CHANGE_DSL_MAIN_OFFER="dit Bredbånds abonnement";
		public static final String SO_PUSC_BUSI_NAME_CHANGE_VOIP_OFFER="dit telefoni abonnement";
		public static final String SO_PUSC_BUSI_NAME_CHANGE_VOIP_NUMBER="dit telefonnnummer";
		public static final String SO_PUSC_BUSI_NAME_CHANGE_PHONEBOOK_STATUS="din telefonbogsstatus";
		public static final String SO_HARDWARE_RETURN="SO_HARDWARE_RETURN";



		public static final String SO_PUSHC_FTP_PATH = "SO_PUSHC_FTP_PATH"; // PUSHC的附件配置路径

		public static final String SO_PUSHC_TECHNICIAN_NOTIFY_01="SO_FIXEDLINE_TECHNICIAN_NOTIFY_01";
	}

	/********************************** TRANSACT  **************************/
	public static final long TRANSACT_APP_SOURCE = 400;



    /************************Comframe**********************************/
	public static final String COMFRAME_WORKFLOW_OBJECT_TYPE = "RBOSS_CUSTOMER_ORDER";
	public static final String COMFRAME_QUEUE_ID = "RBOSS";
	/**匿名客户CUST_ID**/
	public static final long  ANONYMOUS_CUST_ID = 21210088888888L;//21218888888888L;客管分表规则已改
	public static final long  ANONYMOUS_ACCT_ID = 32100888888888L;//32188888888888L;客管分表规则已改

	public static final int  BILLID_STATE_USING = 1;  //当前正在使用
	public static final int  BILLID_STATE_TRANSFERD = 2; // 被过户失效
	public static final int  BILLID_STATE_PRE_DESTROY = 3; //预销户失效

	/**是否需要合同信息**/
	public static final int NEED_NULL = 0;//不需要合同
	public static final int NEED_ALL = 1;//需要合同
	public static final int NEED_POA = 2;//需要POA
	public static final int NEED_INSUR = 3;//需要保险合同
	public static final int NEED_SWITCH = 4;//需要保险合同
	public static final int NEED_SINGN = 5;//OSE裸机分期需要签分期合同但不需要生成其它合同

	/**群组父群属性**/
	public static final long SO_SRV_ATTR_PARENT_GROUP = 262110000101L;

	/**M2M目录ID**/
	public static final long M2M_CATALOG_ID = 960000000009L;

	public static final long PROD_ATTR_ID_MULTI_NUM_ATTR1 = 2700008L;//Multi SIM MSISDN
	public static final long PROD_ATTR_ID_MULTI_NUM_ATTR2 = 2700010L;//Favorite Number
	public static final long PROD_ATTR_ID_MULTI_NUM_ATTR3 = 2700011L;//Prestige Voice Mail
	public static final long PROD_ATTR_ID_MULTI_NUM_ATTR4 = 2700012L;//Mobile Fax

	public static final long PROD_ATTR_ID_MULTI_SIM_ATTR = 2700007L;//Multi SIM card
	public static final long PROD_ATTR_ID_KI_SIM_ATTR = 2700052L;//KI
	public static final long PROD_ATTR_ID_SIM_SPEC_ATTR=262100001005L;//卡类型
	public static final String LOGOUT_SIM_INSTOFFERID = "LOGOUT_SIM_INSTOFFERID";

	/**
	 * PSTN改号
	 */
	public static final long TMP_BUSI_ID_4_ON_GOING_ORDER = 4000000L;
	//批开待处理状态  np number range with leading number 第一批开户时使用
	public static final String ORD_BATCH_USER_STATE_WAIT4DEAL="3";
	//add-on 副号码 属性attrCode静态数据codeType
	public static final String SO_ADD_ON_ATTR_CODE ="SO_ADD_ON_ATTR_CODE";
	public static final String SO_ADD_ON_NOT_DEAL_ATTR_CODE ="SO_ADD_ON_NOT_DEAL_ATTR_CODE";


	/***********************************销户原因*********************/
	public interface QuitReason {
		public static final String REGRET = "10";//反悔
	}

	public static final String CUST_EXTEND_CODE = "CUST_EXTEND_CODE";
	public static final String NP_FLAG = "NP_FLAG";
	public static final String NP_FLAG_YES = "0";//是NP
	public static final String NP_FLAG_NO = "1";//不是NP
	public static final String SAP_FLAG = "SAP_FLAG";
	public static final String SAP_FLAG_YES = "0";//是SAP
	public static final String SAP_FLAG_NO = "1";//不是SAP
	public static final String CUST_ORDER_EXT_ROWSET_ID = "tblNormal_customer_order_ext_info";
	public static final long DOUBLE_SIM_TYPE2_SERVICE_ID1 = 2200029L;
	public static final long CPE_SERVICE_ID = 2200003L;
	public static final long DOUBLE_SIM_TYPE2_SERVICE_ID2 = 2200087L;
	public static final long PRICE_ID_BUSI_CONTRACT = 132100000001L;
	public static final String REMAINING_DAY_CYCLE = "$REMAINING_DAY_CYCLE$";
	public static final String ACTUAL_DAYS_CYCLE = "$ACTUAL_DAYS_CYCLE$";
	public static final String REMAINING_CYCLE = "$REMAINING_CYCLE$";
	public static final String REMAINING_DAYS_LAST_CYCLE = "$REMAINING_DAYS_LAST_CYCLE$";
	public static final String ACTUAL_DAYS_LAST_CYCLE = "$ACTUAL_DAYS_LAST_CYCLE$";
	public static final String FIXED_AMOUNT = "$FIXED_AMOUNT$";
	public static final String SORT_NUM = "$SORT_NUM$";
	public static final String MONTH_FEE = "$MONTH_FEE$";
	public static final String STANDARD_RC = "$STANDARD_RC$";
	public static final String QUARTERLY_ACCOUNT_CYCLE = "$QUARTERLY_ACCOUNT_CYCLE$";
	public static final long IS_NOTICE_PERIOD_INOUT_FEATURE_ID = 2701347L;
	public static final String IS_NOTICE_PERIOD_IN = "1";//表示notice在协议期内
	public static final String IS_NOTICE_PERIOD_OUT = "2";//表示notice在协议期外
	public static final long PRICE_ID_BUSI_TRANSFER_OWERSHIP = 132100000002L;
	public static final String CUST_EXT_CODE_INSTAL_ACCT_ID = "INSTAL_ACCT_ID";
	public static final String TERMINATE_DATE ="$TERMINATE_DATE$";
	public static final String NO_PENALTY_DATE ="$NO_PENALTY_DATE$";
	public static final String REMAIN_CYCLE_MONTHLY ="$getRemainCycleMonthly$";


	/***********************************沉淀的终端状态*********************/
	public interface InsxUserSeriRelState {
		public static final int STATE_ERASE = 0;//失效
	    public static final int STATE_USER = 1;//有效
	    public static final int STATE_ERASE_REGRET = 2;//反悔失效
	}

	/****************反悔操作类型 regretBusiOper***********************/
	public interface regretBusiOper{
		public static final String REGRET_TERMINATE = "Terminate";//销户
		public static final String REGRET_NO_TERMINATE = "NoTerminate";//不销户
		public static final String REGRET_CHANGEOFFER = "ChangeOffer";//换主套餐
		public static final String REGRET_NO_CHANGEOFFER = "NoChangeOffer";//不换主套餐
	}

	/****************BCEFRAME ID***********************/
	public interface BceFrameId{
		public static final long CHANGE_OFFER = 50102L;//业务变更
		public static final long REGRET = 72258L;//反悔
		public static final long CHANGE_OFFER_WF = 10000050006L;
		public static final long NEWCONNECTION_CPE_RESEND = 100048021L;


	}
	/***********************************反悔相关设置*********************/
	public interface Regret {
		public static final long defaultTaskStaffId = 19999998L;//反悔流程默认TaskStaffId
		public static final long defaultTaskOrgId = 29999998L;//反悔流程默认TaskOrgId
		public static final String WAIT_RESELL_TASKID ="WAIT_RESELL_TASKID";
		public static final long regretUserFlag = 113060L;//是否可以反悔用户标志
		public static final long depositCustOrdId = 200060L;//新开户沉淀订单号
		public static final long depositOrdDoneDate =200070L;//新开户沉淀订单竣工时间
		public static final long BEFORE_ORDER_TERMINAL_SC=200080L;//订购合约机之前的协议期
		public static final long BEFORE_ORDER_TERMINAL_NPC=200090L;//订购合约机之前的协议期
		public static final long REGRET_IMEI = 200100L;//订购合约机最新的IMEI
		public static final String REGRET_REFUND_FINISH_STATE = "1";//退费完成
		public static final String REGRET_REFUND_WAIT_STATE = "2";//等待状态
		public static final String REGRET_PRE_TERMINATION_TYPE = "2";//反悔订单预终止类型-未来预销户
	}
	/***********************************分期标示*********************/
	public interface InstalmentFlag {
		public static final String IS_INSTALMENT = "1";//是
		public static final String IS_NOT_INSTALMENT = "0";//否
	}

	/***********************************OTT需求相关定义*********************/
	public interface OTT {
		public static final String STATE_USE = "1";//生效
		public static final String STATE_TO_OPEN = "2";//O365待开虚用户
		public static final String STATE_TO_SUBSCRIBE= "3";//待订购onedrive
		public static final String STATE_TO_UNSUBSCRIBE = "4";//待退订onedrive
		public static final String STATE_TO_TERMINATE = "5";//O365待销户
//		public static final String STATE_EXCEPTION= "7"; //异常状态
		public static final String STATE_CREATE_EXCEPTION= "6"; //新开O365虚用户异常状态
		public static final String STATE_TERMINATE_EXCEPTION= "7"; //O365虚用户销户异常状态
		public static final String STATE_SUBSCRIBE_EXCEPTION= "8"; //订购onedrive异常状态
		public static final String STATE_UNSUBSCRIBE_EXCEPTION= "9"; //退订onedrive异常状态
		public static final String STATE_TO_ACTIVE= "0"; //Viaplay等待激活

		public static final long DEAL_STATE_UNDEAL_PRESENT = 0;//未处理赠送push
		public static final long DEAL_STATE_UNDEAL_RENEW_PRESENT = 1;//未处理续定push
		public static final long DEAL_STATE_NOTIFY_PRESENT = 2;//已发送赠送push
		public static final long DEAL_STATE_NOTIFY_RENEW_PRESENT = 3;//已发送续送push
		public static final long DEAL_STATE_ON_ORDER = 4;//客户确认订购
		public static final long DEAL_STATE_EXCEPTION = 7;//pushc异常

		public static final String OTT_BUSI_TYPE_O365 = "1";//O365
		public static final String OTT_BUSI_TYPE_ONE_DRIVE = "2";//One Drive
		public static final String OTT_BUSI_TYPE_VIAPLAY_3 = "3";//Viaplay 3 months free
		public static final String OTT_BUSI_TYPE_VIAPLAY_12 = "12";//Viaplay 12 months free

		public static final long MOBILE_OFFER_BUSI_TYPE = 2L;


        /**OTT：PARA_TYPE*/
        public static final String PARA_TYPE_OTT_INFO = "SO_OTT_INFO";
        /**O365：PARA_CODE*/
        public static final String PARA_CODE_O365 = "O365";
        /**One Drive：PARA_CODE*/
        public static final String PARA_CODE_ONE_DRIVE = "ONE_DRIVE";
        public static final String PARA_CODE_VIAPLAY_3 = "VIAPLAY_3";
        public static final String PARA_CODE_VIAPLAY_12 = "VIAPLAY_12";


		public static final String SO_PUSHC_PRESENT_O365 = "SO_PUSHC_PRESENT_O365";
		public static final String SO_PUSHC_PRESENT_O365_AGAIN = "SO_PUSHC_PRESENT_O365_AGAIN";
		public static final String SO_PUSHC_PRESENT_ONE_DRIVE = "SO_PUSHC_PRESENT_ONE_DRIVE";
		public static final String SO_PUSHC_PRESENT_ONE_DRIVE_AGAIN = "SO_PUSHC_PRESENT_ONE_DRIVE_AGAIN";
		public static final String SO_Promote_Viaplay = "SO_Promote_Viaplay";

		public static final String RES_SPEC_ID_ONE_DRIVE = "170001";
		public static final String RES_SPEC_ID_O365 = "170002";
		/* ott viaplay */
		public static final long OFFER_FEATURE_VOUCHER_TYPE = 2700200L; // viaplay的voucher类型 (3个月,12个月)
		public static final long OFFER_FEATURE_PROMOTE_TYPE = 2700201L; // viaplay的赠送类型(前台页面,后台赠送)
		public static final String OFFER_FEATURE_PROMOTE_TYPE_VALUE_PAGE = "PAGE_GIVING"; // viaplay的赠送类型(前台页面,客服无条件赠送)
		public static final String OFFER_FEATURE_PROMOTE_TYPE_VALUE_BUSINESS = "BUSINESS_GIVING"; // viaplay的赠送类型(后台赠送,后天满足条件赠送)

        public static final long OFFER_ATTR_PACKAGE_VERSION = 262100001000L;  // 产品版本
        public static final long OFFER_ATTR_VOUCHER_CODE = 262100001001L;  // Voucher Code
		public static final long OFFER_ATTR_ACTIVATIONS_STATUS = 262100001002L;  // Activations Status

		public static final String RES_VIAPLAY_STATE_ACTIVATED = "1";
		public static final String RES_VIAPLAY_STATE_DEACTIVATED = "2";

		public static final String VIAPLAY_FILE_RECORD_STATE_INIT = "0";       //viaplay 文件插入表的状态 （待处理）
		public static final String VIAPLAY_FILE_RECORD_STATE_TO_ACTIVED = "1";    //待激活
		public static final String VIAPLAY_FILE_RECORD_STATE_ACTIVED = "2";  //已激活
		public static final String VIAPLAY_FILE_RECORD_STATE_TO_DEACTIVED = "3";    //待去激活
		public static final String VIAPLAY_FILE_RECORD_STATE_DEACTIVED = "4";  //已去激活

		public static final String VIAPLAY_FILE_RECORD_DEAL_STATE_INIT = "0";     //viaplay 记录处理的初始状态
		public static final String VIAPLAY_FILE_RECORD_DEAL_STATE_FAIL = "1";     //viaplay 处理状态  （失败）
		//public static final String VIAPLAY_FILE_RECORD_DEAL_STATE_SUCCESS = "2";  //成功

		public static final String VIAPLAY_FILE_RECORD_IS_FREE = "FREE";        //空闲记录 可以处理
		public static final String VIAPLAY_FILE_RECORD_IS_RUNNING = "RUNNING";     //正在处理的记录
	}

	public static final long FEATURE_ID_NEW_OTT = 2700330L; //ott公用feature

	public static final long BUSI_ID_OTT_NEW_PROD = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OTT_NEW_PROD");//OTT开户
	public static final long BUSI_ID_OTT_CHANGE_BASIC_OFFER = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OTT_CHANGE_BASIC_OFFER");//OTT变更主套餐
	public static final long BUSI_ID_OTT_NEW_OFFER_VAS = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OTT_NEW_OFFER_VAS");//OTT订购增值套餐
	public static final long BUSI_ID_OTT_CANCEL_OFFER_VAS = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OTT_CANCEL_OFFER_VAS");//OTT退订增值套餐
	public static final long BUSI_ID_OTT_QUIT_PROD = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OTT_QUIT_PROD");//OTT销户
	public static final long BUSI_ID_OTT_USER_STOP_OPEN = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OTT_USER_STOP_OPEN");//OTT停复机
	public static final long BUSI_ID_OTT_OFFER_UPDATE_ENTER = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OTT_OFFER_UPDATE_ENTER");//OTT业务变更主入口

	/***********************************APPLE DEP相关设置*********************/
	public interface AppleDep {
	    public static final long FREAURE_ID_APPLE_DEP = 35000001L;//Offer需要发APPLE DEP注册
	    public static final String FREAURE_VALUE_APPLE_DEP = "APPLE_DEP";//Offer需要发APPLE DEP注册
	    public static final String TIMEZONE_CET = "-60";//时区 Central European Time
	    public static final String APPLE_DEP_RESELLER_ID =SoConstUtil.getParaDetailValueByCondition4AppleDep("APPLE_DEP_RESELLER_ID");
	    public static final String APPLE_DEP_SHIPTO =SoConstUtil.getParaDetailValueByCondition4AppleDep("APPLE_DEP_SHIPTO");
		public static final String INSURANCE_OFFER =  "INSURANCE_OFFER";
	}

	//===================================WHOLESALE=======================================================================
	public static final long BUSI_ID_NEW_RBOSS_USER_WS = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_NEW_RBOSS_USER_WS");//入网 GSM开户
	public static final long BUSI_ID_OFFER_UPDATE_ENTER_WS =SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OFFER_UPDATE_ENTER_WS");//套餐变更入口的操作ID
	public static final long BUSI_ID_QUIT_RBOSS_USER_WS = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_QUIT_RBOSS_USER_WS");//营业预销户
	public static final long BUSI_ID_OS_UNION_WS = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OS_UNION_WS");//停开机融合
	public static final long BUSI_ID_CHANGE_PHONE_WS = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_CHANGE_PHONE_WS");//换卡换号
	public static final long BUSI_ID_CHANGE_SIM_HK_WS = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_CHANGE_SIM_HK_WS");//换卡
	public static final long BUSI_ID_PRE_RECREAT_USER_WS = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_PRE_RECREAT_USER_WS");//预销户重入网操做ID
	public static final long BUSI_ID_CLOSE_ACCOUNT_WS = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_CLOSE_ACCOUNT_WS");//销户

	public static final String WHOLESALE_NP_STATUS_BEFORE_SEND_REQUEST = "BEFORE_REQUEST";//before send np request
	public static final String WHOLESALE_NP_STATUS_WAIT_RESPONSE = "WAIT_RESPONSE";//wait for np response(after send np request)
	public static final String WHOLESALE_NP_STATUS_CONFIRMED = "CONFIRMED";//confirmed by np-gw
	public static final String WHOLESALE_NP_STATUS_REJECTED = "REJECTED";//rejected by np-gw
	public static final String WHOLESALE_NP_STATUS_CANCELED = "CANCELED";//canceled by customer
	public static final String WHOLESALE_NP_STATUS_SUCCESS = "SUCCESS";//finished sucessfully

	// add by fangjie
	public static final Long WS_USER_EXT_IMEI = 9100011L;

	//add by tuhc for SP portout modify resource state
	public static final Long SP_PORTOUT_EXT_MODIFY_RS_STATES = 910000012L;

	//===================================================================================================================


	//===================================日志保存接口名称定义=======================================================================
	public static final String SAP_INTERFACE = "SAP_INTERFACE";//SAP接口
	public static final String NP_INTERFACE = "NP_INTERFACE";//NP接口
	public static final String BILLING_INTERFACE = "BILLING_INTERFACE";//billing实时接口
	public static final String PUSHC_INTERFACE = "PUSHC_INTERFACE";//PUSHC接口
	public static final String CI_INTERFACE = "CI_INTERFACE";//客户接触
	public static final String ARP_INTERFACE = "ARP_INTERFACE";//ARP接口
	public static final String TT_INTERFACE = "TT_INTERFACE";//TT接口
	public static final String CRM_TRANSACT = "CRM_TRANSACT";//信用度接口
	public static final String CRM_CALTAXINFO = "CRM_CALTAXINFO";//算税接口
	public static final String CRM_STPTOUCM = "CRM_STPTOUCM";//STP接口
	public static final String CRM_SENDOPEN = "CRM_SENDOPEN";//送开通参数
	public static final String AGR_INTERFACE = "AGR_INTERFACE";//合同接口
	public static final String CRM_SENDSFF = "CRM_SENDSFF";//合同接口
	public static final String UAPI_INTERFACE = "UAPI_INTERFACE";//UAPI接口
	public static final int CRM_CALL_OUT = 1;//CRM 主动调用
	public static final int CRM_CALL_IN = 0;//CRM 被调用
	public static final String CRM_SENDCONTRACT = "CRM_SENDCONTRACT";//送开通参数
	public static final String EXPIRE_EGCampaignCode = "EXPIRE_EGCampaignCode";//EXPIRE_EGCampaignCode接口
	public static final String FORCE_CANCEL_SHOW_LOG = "FORCE_CANCEL_SHOW_LOG";//提供给Force cancel功能使用
	//===================================================================================================================

	public static final int  HAVE_SEND_SUCCESSFULLY = 1;
	public static final int  HAVE_SEND_ERROR = 2;
	/***********************SR0.3.1渠道类型*********************/
	public static final String SO_CHANNEL_RETAILER_OSE = "10001";
	public static final String SO_CHANNEL_POINT_OF_SALES = "10002";
	public static final String SO_CHANNEL_ESHOP = "10003";
	public static final String SO_CHANNEL_SELFCARE = "10004";
	public static final String SO_CHANNEL_SELFCARE_APP = "10005";
	public static final String SO_CHANNEL_CALL_CENTER = "10006";
	public static final String SO_CHANNEL_EXTERNAL_DEALER = "10007";
	public static final String SO_CHANNEL_BACK_OFFICE = "10008";
	public static final String SO_CHANNEL_TELEMARKETING = "10009";
	public static final String SO_CHANNEL_WHOLESALE_MVNOSE = "10010";
	public static final String SO_CHANNEL_CUSTOMER_OWNED_PORTAL = "10011";
	public static final String SO_CHANNEL_SMS = "10012";
	public static final String SO_CHANNEL_IVR = "10013";
	public static final String SO_CHANNEL_KEY_ACCOUNT_MANAGER = "10014";
	public static final String SO_CHANNEL_USSD = "10015";
	public static final String SO_CHANNEL_BACK_PROCESS = "10016";
	/***********************SR0.3.1渠道类型*********************/

	/***********************SR0.3.1 业务操作bs_para_detail配置*********************/
	public static final String SO_BUSIID_CFG_REGID = "X";
	public static final String SO_BUSIID_CFG = "SO_BUSIID_CFG";
	public static final long BUSI_ID_ORDER_PROCESS = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_ORDER_PROCESS");//BatchOrderProcessSVImpl.startBatchWorkFlow
	public static final long BUSI_ID_DZ_UMAPY = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_DZ_UMAPY");//网上开户对账
	public static final long BUSI_ID_OUT_WLAN = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_OUT_WLAN");//异网WLAN业务
	public static final long BUSI_ID_VERIFYPWD = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_VERIFYPWD");//密码确认
	public static final long BUSI_ID_VPMN_GROUP = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_VPMN_GROUP");//VPMNGROUP沉淀

	/***********************SR0.3.2 策划编号bs_para_detail配置*********************/
	public static final String SO_OFFERID_CFG_REGID = "X";
	public static final String SO_OFFERID_CFG = "SO_OFFERID_CFG";
	public static final String SO_PRODID_CFG = "SO_PRODID_CFG";

	/***********************SR0.3.2 PushC bs_para_detail配置*********************/
	public static final String SO_PUSHC_CFG_REGID = "X";
	public static final String SO_PUSHC_CFG = "SO_PUSHC_CFG";

   	// add by pengwz
   	public static final long BUSINESS_ID_KD_YJ_VOIPANDDSL = 191000001305L; //voip&dsl销户
   	public static final long BUSINESS_ID_KD_YJ_VOIP = 191000001306L; //voip销户
   	public static final long BUSINESS_ID_KD_YJ_DSL = 191000001307L;  //dsl销户
   	public static final long BUSINESS_ID_KD_CHG_LINESPEED = 191000001308L; //宽带换速率
   	public static final long BUSINESS_ID_KD_CHG_ROUTER = 191000001309L; // 宽带换CPE
   	public static final long SO_NEGTIATION_FEE_ATTR = 820001L; //议价费用
   	public static final long SO_NEGTIATION_MEASUREMENT_FEE_ATTR = 820002L; // 议价单位
   	public static final long SO_NEGTIATION_GROUP_ID_ATTR = 820003L; //议价费用
   	public static final String SO_EXCEPTION_CODE_FIST33 = "FIST33"; //自动申请的异常类型
   	public static final String SO_EXCEPTION_CODE_CUI032 = "CUI032"; //同上
   	public static final String SO_EXCEPTION_CODE_CUI249 = "CUI249"; //同上
   	public static final String SO_EXCEPTION_CODE_C17203 = "C17203"; //同上
   	public static final String SO_DEAL_AUTOMATIC = "DEAL_AUTOMATIC";
   	public static final String SO_RETURN_MSG = "returnMsg";// 返回信息
   	public static final String SO_NEED_RETURN = "NEED_RETURN";// 创建TT需要返回标识
   	public static final String SO_STATE_PENDING = "Pending"; // Ticket状态---pending
   	public static final String SO_NEED_FILTE = "NEED_FILTE"; // 完整性校验码实施动作
   	public static final String SO_NEED_CREATE = "NEED_CREATE"; // 同上
   	public static final String SO_NEED_CLOSE = "NEED_CLOSE"; // 同上


   	//CPR类型
   	public static final String CUST_CERT_TYPE_CPR = "8";
   	//Global ip的产品code
   	public static final String GLOBAL_IP_PLUS_CODE = "41";
   	public static final String GLOBAL_IP_CODE = "40";

   	public static final String OFFER_STATUS_TERMINATE = "Delete";
   	public static final String CPE_STATUS_TERMINATE = "OutDate";

		/***********************SR0.3.2 Municipality Code配置*********************/
	 public static final String SO_MUNICIPALITY_CODE = "MUNICIPALITY_CODE";
	 public static final String SO_MUNICIPALITY_CODE_TYPE = "SO_MUNICIPALITY_CODE";
   	//add by lilong  过户电子确认单发送类型
   	public static final int TRANSFER_OWERSHIP_ELEC_TYPE_NONE = 1;//不发送
   	public static final int TRANSFER_OWERSHIP_ELEC_TYPE_DONOR = 2;//发送上家
   	public static final int TRANSFER_OWERSHIP_ELEC_TYPE_RECEIVER = 3;//发送下家
   	public static final int TRANSFER_OWERSHIP_ELEC_TYPE_BOTH = 4;//发送上家和下家

   	//过户电子确认单是否同意过户
	public static final int TRANSFER_OWERSHIP_CONFIRM = 1;//同意过户
	public static final int TRANSFER_OWERSHIP_NOT_CONFIRM = 2;//同意过户

	//日志添加CPE VOIP类型
	public static final String NP_VOIP = "NP_VOIP";
	public static final String PROV_CPE = "PROV_CPE";

	//m2m
	public static final long M2M_TRIAL_FEATURE_ID = 2700043L;
	public static final String M2M_TRIAL_FEATURE_VALUE = "Yes";

	public static final long M2M_STANDARD_FEATURE_ID = 2700045L;
	public static final String M2M_STANDARD_FEATURE_VALUE = "Yes";

	public static final long M2M_ADD_ON_CUSTOMIZATION_ID = 2700047L;
	public static final String M2M_ADD_ON_CUSTOMIZATION_VALUE = "Yes";


	//ResponseType类型
	public static final String PORT_OUT_RESPONSE_TYPE = "1";
	public static final String PORTOUT_RESPONSE_TYPE = "PORTOUT_RESPONSE_TYPE";

	public interface BSSConst4BSSWorkFlow{
		public static final String OTT = "OTT";
		public static final String SWITCH = "SWITCH";
		public static final String DEFAULT = "DEFAULT";
		public static final String ESIMCARD = "ESIMCARD";
	}

	public static final String IS_NEED_SO_ORDER_DATA = "IS_NEED_SO_ORDER_DATA";

	public static final String POA_FILE_PDF_FIX = ".pdf";

	public static final long PROD_ATTR_ID_YIJIA = 820001l;

	public static final long SO_FEATURE_MOBILE_OFFER_TYPE = 2700040L;

	public static final long PROD_ATTR_ID_QUOTA_TEMP_OFFER =  10702L;// 临时offer
	public static final long PROD_ATTR_ID_QUOTA_PRRMANANT_OFFER =  10702L;// 永久offer

	//add by wangyt
	public static final long FEATURE_ID_SURF_CONTROL = 2700048L; //feature_ID for Surf_Control
	public static final long FEATURE_ID_BLOCK = 2700046L; //feature_ID for block_offer
	public static final long FEATURE_ID_USAGE_CONTROL = 2700049L; //feature_ID for usage_control

	public static final long INVOICE_NAME_CODE = 150000L;

	public static final long MNP_FLAG_VALUE = 880751L;
	public static final long OPERATOR_CODE_VALUE = 880752L;
	public static final long DEVICE_TYPE_VALUE = 880753L;
	//add by zc
	public static final String WHOLESALE_QUERY_TYPE_PORTIN_ALL = "All";

	//miniPrice
	public static final long SEND_BILLING_ATTR_ID = 10000017L;
	//vpnID
	public static final long VPNID_ATTR_ID = 152088888889L;
	public static final long DOUBLE_NUMBER_ATTR = 2700008L;
	public static final long VOICE_MAIL_NUMBER_ATTR = 2700011L;
	public static final long PROD_ATTR_ID_PIN_CODE =  10750L;// pinCode

	//add by zc
	public static final String TELENOR_RETAIL_SYS_TENANTID = "21";
	public static final String WHOLE_RETAIL_SYS_TENANTID = "91";
	public static final long WHOLESALE_CHECK_PRIV_ID = 40000000;
	public static final long WHOLESALE_CHECK_END_ID = 40000001;
	public static final long TELENOR_EMPLOYEE_ORG_ID = 91000000;
	public static final String SUCCESS_BATSINGLE_INFO =  "success";
	public static final String FAILED_BATSINGLE_INFO = "failed";
	public static final String BATCH_FILE_SUCCESS_NAME = "Batch business success result.xls";
	public static final String BATCH_FILE_FAILED_NAME = "Batch business failed result.xls";
	//order pushc code
	public static final String PUSHC_ORDER_SUBMIT = "PUSHC_ORDER_SUBMIT";
	public static final String PUSHC_OS_ORDER_SUCCEED = "PUSHC_OS_ORDER_SUCCEED";
	public static final String PUSHC_TRANSFER_SUCCEED = "PUSHC_TRANSFER_SUCCEED";
	public static final String PUSHC_OSE_REGRET_SUBMIT = "PUSHC_OSE_REGRET_SUBMIT";

	public static final String VOLUNTARY_ONEWAY_SUSPENSION = "101";
	public static final String VOLUNTARY_TWOWAY_SUSPENSION = "102";
	public static final String VOLUNTARY_RESUMPTION = "001";
	//portIn State
	public static final String PORT_IN_NO_RESPONSE_STATE="No Response";

	public static final String STOLEN_SUSPENSION = "114";
	public static final String STOLEN_RESUMPTION = "008";
	//end pushc


	public static final String OFFER_PLAN_CONTRACT = "OFFER_PLAN_CONTRACT";
	public static final String OFFER_VAS_CONTRACT = "OFFER_VAS_CONTRACT";

	//HANDSET ORDER TYPE
	public static final String HANDSET_PRE_ORDER = "PreOrder";
	public static final String HANDSET_FUTURE_ORDER = "FutureOrder";
	public static final String HANDSET_ONSTOCK_ORDER = "OnStockOrder";
	public static final String HANDSET_ORDER_TYPE = "HANDSET_ORDER_TYPE";
	public static final String CART_ORDER_TYPE = "CartStockType";
	public static final String SAP_ORDER_TYPE = "SAP_ORDER_TYPE";
	public static final String FUTURE_CONFIRM_FLAG = "FUTURE_CONFIRM_FLAG";
	public static final String VUE_HANDWARE_FLAG = "VUE_HANDWARE_FLAG";
	public static final String NEW_OM_FLAG = "NEW_OM_FLAG";
	public static final String NEW_OM_MULTIDELIVERY = "NEW_OM_MULTIDELIVERY";
	//ots
	public static final long BUSI_ID_OTS_REGISTRATION = 191001071016L;
	public static final long BUSI_ID_OTS_VERIFICATION = 191001071017L;
	public static final int VALID_DAYS_OTS_REGIST = 3;
	public static final int VALID_DAYS_OTS_VERIFY = 5;

	public static final long OTS_STATE_PRE_OPEN = 1;
	public static final long OTS_STATE_REGIST = 2;
	public static final long OTS_STATE_NO_NEED_VERIFY = 3;
	public static final long OTS_STATE_WAIT_VERIFY = 4;
	public static final long OTS_STATE_WAIT_X_DAY = 5;
	public static final long OTS_STATE_WAIT_XX_DAY = 6;
	public static final long OTS_STATE_PRETERMINATION = 7;
	public static final long OTS_STATE_VERIFY_SUCCEED = 8;
	public static final long OTS_STATE_VERIFY_FAILED = 9;

	public static final String SO_OTS_PUSH_VERIFYCODE = "SO_OTS_PUSH_VERIFYCODE";
	public static final String SO_OTS_PUSH_REGIST = "SO_OTS_PUSH_REGIST";
	public static final String SO_OTS_PUSH_X = "SO_OTS_PUSH_X";
	public static final String SO_OTS_PUSH_XX = "SO_OTS_PUSH_XX";
	public static final String SO_OTS_PUSH_Y = "SO_OTS_PUSH_Y";
	//ots end
	public static final long UP_FEATURE_NUMBER_TYPE = 2700013;

	public static final String UP_FEATURE_MOBILE_NUMBER = "1";
	public static final String UP_FEATURE_FIXED_NUMBER = "2";
	public static final String UP_FEATURE_MOBILE_OR_FIXED_NUMBER = "3";
	public static final String UP_FEATURE_VIRTUAL_NUMBER = "4";
	public static final String UP_FEATURE_MANUALLY_NUMBER = "5";
	public static final String UP_FEATURE_80XXXXX_NUMBER = "6";
	public static final String UP_FEATURE_ISDN_NUMBER = "7";
	public static final String UP_FEATURE_ISDN_OR_MANUALLY_NUMBER = "8";
	public static final String UP_FEATURE_OTT_NUMBER = "9";
	public static final String UP_FEATURE_ESIM_MOBILE_NUMBER = "100020";
	public static final String UP_FEATURE_VOICE_MAIL_NUMBER = "100021";
	public static final String UP_FEATURE_DOUBLE_SIM_NUMBER = "100090";

	/**
	 * vpn info start
	 */
	public static final int USER_TYPE_STATE_NORMAL = 1;
	/**
	 * 停开机状态
	 */
	public static final long OS_STATE_RESUM=191002011005l;

	public static final long OS_STATE_PAUSE=191002011004l;

	public static final String PLATFORM_INTERFACETYPE="30";//INTERFACETYPE

	public static final long SEQ_OF_ORDER_OFFER = 820605;

	public static final String GROUP_CUSTOMER_SP_FALG = "1";

	public static final String GROUP_CUSTOMER_ISP_FALG = "2";

	public static final String NP_INTERFACE_PARAMTER = "NP_INTERFACE_PARAMTER";//NP接口
	public static final long FREE_RESOUCE_FEATURE_ID = 200025;	//免费资源featureID
	public static final String FREE_RESOUCE_VOICE = "10005";
	public static final String FREE_RESOUCE_SMS = "5600159";
	public static final String FREE_RESOUCE_MMS = "5600265";
	public static final String FREE_RESOUCE_DATA = "5600029";
	public static final String FREE_RESOUCE_EURO = "7000988";
	public static final String FREE_RESOUCE_NCROAM = "7000989";

	public static final long TRANSFER_OWERSHIP_CHANGE_OFFER_ID = 191000000003l;//过户换套餐

	public static final long SLA_FEATURE_ID = 2700024;

	public interface CancelWorkFlowConst{
		public static final String CHECK_TYPE_ONGOING_ORDER = "1";
		public static final String CHECK_TYPE_FUTURE_ORDER = "2";
		public static final String CHECK_TYPE_BATCH_ORDER = "3";

		public static final String EXECUTE_TYPE_WORKFLOW = "WORKFLOW";
		public static final String EXECUTE_TYPE_PROCESS = "PROCESS";
		public static final String EXECUTE_TYPE_SERVICE = "SERVICE";
	}

	//add by zhouyongchao
	//for B2B SIM CARD REVERSE WORKFLOW
	public static final long BUSI_ID_B2B_SIM_CARD_REVERSE = SoConstUtil.getParaDetailValue4BusiId("BUSI_ID_B2B_SIM_CARD_REVERSE");//集团客户预留SIM卡
	public static final String BUSI_TYPE_B2B_SIM_CARD_REVERSE = "B2B_SIM_CARD_REVERSE";
	public static final String B2B_OrderRequestToSAP_Receive_IMEI_OR_ICC = "com.asiainfo.crm.res.VM.B2BSimCardReserve.5";

	public static final String STATIC_IP_SWITCH = "STATIC_IP_SWITCH";
	//DM002 移机校验地址是否有其他用户开关
	public static final String SO_RELOCATION_CHECK_OTHER_USER_DM002 = "SO_RELOCATION_CHECK_OTHER_USER_DM002";
	public static final int SO_TF_RETURNCPE_PUSHC_PENDING = 11;//return cpe超时发pushc
	public static final int SO_TF_RETURNCPE_PUSHC_COMPLETED = 12;//
	public static final int SO_TF_RETURNCPE_PUSHC_ERROR = 10;
	public static final int SO_TF_RETURNCPE_PUSHC_PENDING_KDCJ = 13;//return cpe发pushc,宽带拆机场景


	//Fmc feature id/attr id
	public static final long FMC_GROUP_TYPE_FEATURE_ID = 2700319L;
	public static final long FMC_GROUP_ID_FEATURE_ID  = 2700320L;
	public static final long FMC_COUNT_FLAG_FEATURE_ID  = 2700321L;
	public static final long FMC_FORMULA_FEATURE_ID  = 10040073L;

	public static final long FMC_GROUP_TYPE_ATTR_ID = 151400000301L;
	public static final long FMC_GROUP_ID_ATTR_ID  = 151400000302L;
	public static final long FMC_COUNT_FLAG_ATTR_ID  = 151400000303L;
	public static final long FMC_FORMULA_ATTR_ID  = 151400000304L;
	public static final long FMC_NUMERATOR_ATTR_ID  = 820625L;
	public static final long FMC_DENOMINATOR_ATTR_ID  = 820626L;

	public static final long FMC_MOBILE_NEW_BUSINESS_ID  = 191000000001L;
	public static final long FMC_BB_NEW_BUSINESS_ID  = 191000001004L;
	public static final long FMC_OTT_NEW_BUSINESS_ID  = 192600000001L;
	public static final long FMC_ADDON_NEW_BUSINESS_ID  = 191000000004L;
	public static final long FMC_CHANGEMAINOFFER_BUSINESS_ID = 191000000003L;
	public static final long FMC_BB_CHGOFFER_BUSINESS_ID = 305378L;
	public static final long FMC_AGR_TERMINATE_BUSINESS_ID = 192400000002L;

	public static final long FMC_PORTOUT_BUSINESS_ID = 200000000000L;

	public static final long FMC_MOBILE_CHANGEOFFER_BUSINESS_ID  = 191001002001L;
	public static final long FMC_BB_CHANGEOFFER_BUSINESS_ID  = 900015101004L;
	public static final long FMC_OTT_CHANGEOFFER_BUSINESS_ID  = 191001002001L;

	public static final long FMC_MOBILE_TRANSFEROWNER_BUSINESS_ID  = 191001007001L;
	public static final long FMC_BB_TRANSFEROWNER_BUSINESS_ID  = 191000002204L;
	public static final long FMC_OTT_TRANSFEROWNER_BUSINESS_ID  = 191001007001L;

	public static final long FMC_MOBILE_REACCESS_BUSINESS_ID  = 191001001002L;
	public static final long FMC_OTT_REACCESS_BUSINESS_ID  = 191001001002L;

	public static final long FMC_MOBILE_PRETERMINATE_BUSINESS_ID  = 191001005001L;
	public static final long FMC_BB_PRETERMINATE_BUSINESS_ID  = 191000001006L;
	public static final long FMC_OTT_PRETERMINATE_BUSINESS_ID  = 191001005001L;

	public static final long FMC_REGRET_BUSINESS_ID  = 191000003003L;
	public static final long FMC_BB_MIDIFY_BUSINESS_ID  = 191000001018L;

	public static final long FMC_CPE_BUSINESS_ID  = 191000003007L;
	public static final long FMC_REGRETORDER_BUSINESS_ID  = 191000001203L;

	//CR81 feature id/attr id add by tanyan 20181224
	public static final long SUB_TYPE_FEATURE_ID = 2700331L;
	public static final long PRICING_OFFER_ID_FEATURE_ID  = 2700332L;
	public static final long MEASURE_FEATURE_ID  = 820629L;

	public static final long SUB_TYPE_ATTR_ID = 151400000305L;
	public static final long PRICING_OFFER_ID_ATTR_ID  = 151400000306L;
	public static final long MEASURE_ATTR_ID  = 820629L;

	/**
	 *cr81的未来回插记录
	 */
	public static final long NEW_OFFER_BACKINPUT_FUTURE_TAG  = 481000000001L;
	public static final String SUB_TYPE_FEATURE_VALUE_NEW_OFFER = "New_Offer";
	public static final String SUB_TYPE_FEATURE_VALUE_SEAT_OFFER = "Seat_Offer";
	public static final String SUB_TYPE_FEATURE_VALUE_PRICING_OFFER = "Pricing_Offer";

	/**
	 * cr81 valid_event type
	 */
	public static final String VALID_EVENT_TYPE_MULTIPLAN = "MULTIPLAN";

	public static final String VALID_EVENT_TYPE_COMPANY = "COMPANY";

	public static final long SEAT_RC_ATTR_ID  = 820628L;//席位费用
	public static final long SEAT_NUM_ATTR_ID  = 820630L;//席位数量

	public static final String TASK_SERVICEPATH_TYPE  = "SO_TASK_CFG";
	public static final String TASK_SERVICEPATH_CODE  = "SO_SERVICE_CODE_TASK";
	public static final String TF_SERVICEPATH_TYPE  = "SO_TF_CFG";
	public static final String TF_SERVICEPATH_CODE  = "SO_SERVICE_CODE_TF";

	public static final String BUSI_ID_PRICINGUSER_SUBSCIRBER = "192000000103";//pricingUser开户
	public static final String BUSI_ID_PRICINGUSER_TERMINATE = "192000000104";//pricingUser开户

	//CR33 new notice period offer
	public static final long SO_FEATURE_NEW_NOTICE_PERIOD = 2700326L;
	public static final long SO_FEATURE_NEW_NOTICE_PERIOD_TYPE = 2700325L;


	public static final long SO_FEATURE_MAIN_CAMPAIGN = 2700365L;
	public static final long SO_FEATURE_HANDSET_SUPPORT_INSURANCE = 2700366L;
	public static final long SO_FEATURE_INSURANCE_QUARANTINE = 2700367L;
	public static final long SO_FEATURE_INSURANCE_TYPE = 2700361L;
	public static final long SO_FEATURE_INSURANCE_CAMPAIGN = 2700360L;

	public static final long SO_FEATURE_EXTERNAL_FEATURE = 2700383L;
	public static final String SO_FEATURE_EXTERNAL_TYPE = "1";

	public static final String BACKEND_JOB_OPERTION_TYPE_RESTART  = "1";//重启
	public static final String BACKEND_JOB_OPERTION_TYPE_STOP  = "2";//停止
	public static final String BACKEND_JOB_OPERTION_TYPE_START  = "3";//启动
	public static final String BACKEND_JOB_OPERTION_TYPE_MODIFY_SCHEDULE  = "4";//修改下周期生效
	public static final String BACKEND_JOB_OPERTION_TYPE_MODIFY_IMMEDIATELY  = "5";//修改立即生效
	public static final String BACKEND_JOB_OPERTION_TYPE_ROLLBACK  = "6";//回退立即生效

	//CR57 email地址校验，neverbouns返回校验结果
	public static final String EMAIL_WHITELISTS_NEVERBOUNS_RESULT_VALID = "valid";
	public static final String EMAIL_WHITELISTS_NEVERBOUNS_RESULT_CATCHALL = "catchall";

	//B2B Eshop 复杂addon属性校验接口 add by tanyan 20180822
	public interface ComplexAddonsAttributes{
		public static final String Additional_Number = "2700011";
		public static final String Multi_SIM_MSISDN = "2700008";
		public static final String VOIP_Number = "262100000204";
		public static final String Multi_SIM_Card = "2700007";

		public static final String BUDGET_THRESHOLD = "10702";
		public static final String BUDGET_MEASURE = "10706";
		public static final String PIN_CODE = "10750";
		public static final String PHONEBOOK_STATUS_1 = "152088888880";
		public static final String PHONEBOOK_STATUS_2 = "152088888881";
		public static final String PHONEBOOK_STATUS_3 = "262100000208";
		public static final String CONTACT_NUMBER = "152088888882";
		public static final String EMAIL = "152088888883";
		public static final String BLOCK_SIZE_IP = "262100000202";
		public static final String BLOCK_SIZE_GLOBAL_PLUS_IP = "262100000209";
		public static final String USER_NAME = "3301";
		public static final String REGISTRATION_TYPE = "3305";
	}

	public static final long SUBSCRIBE_ADDON_BUSINESS_ID = 191000000004l;//addon订购
	public static final String IS_REQUIRED = "1";//必填
	public static final String NOT_REQUIRED = "0";//非必填
	public static final String HOME_DELIVERY = "1";//寄送

	/*public static final String FMC_GROUP_TYPE_FMC = "FMC";//FMC优惠类型
	public static final String FMC_GROUP_TYPE_CUSTGROUP = "CUST_GROUP";//客户群优惠类型
	 */
	public static final String EXT_CODE_FMCGROUPINFO = "FMC_GROUP_INFO";//单个客户的fmc优惠信息
	public static final String EXT_CODE_FMCCUSTGROUPINFO = "FMC_CUST_GROUP_INFO";//客户群客户fmc优惠信息

	//ESimCardOffer
	public static final long ESIM_CARD_OFFER_FEATURE_ID = 2700328L;

	// PSTN&ISDN、Nodic
	//B2B_MULTI
	public static final long B2B_MULTI_BUSINESS_ID  = 191000001001L;
	//业务变更--策划产品变更子框架
	public static final long BUSINESS_CHANGE_BUSINESS_ID  = 191000000002L;
	//PSTN预销户
	public static final long PSTN_PRE_DESTORY_BUSINESS_ID  = 191001005010L;
	//B2B_MULTI_SINGLE
	public static final long B2B_MULTI_SINGLE_BUSINESS_ID  = 192200000001L;
	//集团业务变更综合视图
	public static final long GROUP_BUSINESS_CHANGE_BUSINESS_ID  = 192200000004L;
	//SIP产品销户
	public static final long SIP_TEMINATE_BUSINESS_ID  = 192200000002L;
	//OTT Teminate
	public static final long OTT_TEMINATE_BUSINESS_ID  = 192600000002L;

	public interface LiveLinkContract{
		//OSE对应veris系统未做业务的订单数量
		public static final String SO_CUST_EXT_VERIS_ORDER_COUNT = "VERIS_ORDER_COUNT";
		public static final String SO_CUST_EXT_LIVELINK_CONTRAT_SEND = "LIVELINK_CONTRAT_SEND";
		public static final String SO_TASK_TAG_TagDownLoadSendManually = "TagDownLoadSendManually";
		public static final String SO_TASK_TAG_TagUpLoadSendManually = "TagUpLoadSendManually";
		public static final String SO_PUSHC_CONTRACT_LIVELINK = "SO_PUSHC_CONTRACT_LIVELINK";

	}

	//191001005015 重入网
	public static final long BACKONLINE_BUSINESS_ID  = 191001005015L;


	//new ott业务offer属性id：externalInstanceId
	public static final long PROD_ATTR_ID_EXTERNALINSTANCEID = 262100001018l;

	public static final long FEATURE_ID_GENERICOTT_OFFER_ISPUSHC = 2700340L;//generic ott offer判断是否发pushc的开关

	public static final long BUSI_ID_OTTX_NEW_CONNECTION = 191000002001l;
	public static final long BUSI_ID_OTTX_CHANGE_OFFER = 191000002006l;
	public static final long BUSI_ID_OTTX_PRE_TERMINATE = 191000002003l;
	public static final long BUSI_ID_OTTX_TRANSFER_OWNSHIP = 191000002007l;
	public static final long BUSI_ID_OTTX_USER_SUSPEND_RESUME = 191000002009l;
	public static final long BUSI_ID_OTTX_PRE_TERMINATE_REACCESS = 191000002008l;

	//kids offer 配置
	public static final long KIDS_OFFER_TYPE_FEATURE_ID = 2700344L;
	public static final long KIDS_OFFER_MINAGE_FEATURE_ID = 2700345L;
	public static final long KIDS_OFFER_MAXAGE_FEATURE_ID = 2700346L;
	//OpenNet
	public interface OpenNet{
		public static final String SO_CUST_EXT_INFRASTRUCTURE_OWNER = "INFRASTRUCTURE_OWNER";
		public static final String SO_CUST_EXT_SERVICE_SUBSCRIPTION_ID = "SERVICE_SUBSCRIPTION_ID";
		public static final String SO_CUST_EXT_SERVICE_INSTALLATION_ID = "INSTALLATION_ID";
		public static final String SO_CUST_EXT_OPENNET_ORDER_ID = "OPENNET_BASKET_ID";
		public static final String SO_CUST_EXT_CEASE_OPENNET_ORDER_ID = "CEASE_OPENNET_BASKET_ID";
		public static final String SO_CUST_EXT_OPENNET_STATUS = "OPENNET_STATUS";
		public static final String SO_CUST_EXT_CEASE_OPENNET_STATUS = "CEASE_OPENNET_STATUS";
		public static final String SO_CUST_EXT_ADDRESS_UID = "ADDRESS_UID";
		public static final String SO_CUST_EXT_RESCHEDULE_COUNT="RESCHEDULE_COUNT";
		public static final String SO_CUST_EXT_RESCHEDULE_STATUS="RESCHEDULE_STATUS";
		public static final String SO_CUST_EXT_BUSI_TYPE_INFO="BUSI_TYPE_INFO";
		public static final String SO_CUST_EXT_MY_ORDER_PAGE="MY_ORDER_PAGE";

		public static final long  SO_SRV_ATTR_Opennet_subscriptionId = 262100000013L;
		public static final long  SO_SRV_ATTR_Opennet_Port = 262100001025L;
		public static final long PROD_ATTR_ID_priceCategoryCode = 262100001021L;
		public static final long  SO_SRV_ATTR_Opennet_INSTALLATION_ID = 262100001024L;
		public static final String SO_FIXED_SERVICE_URL = SoConstUtil.getParaDetailValueByCondition("SO_RESTFUL_URL", "FIXED_SERVICE");
		public static final String OPENNET_UDF_CVLAN_ID = SoConstUtil.getParaDetailValueByCondition("SO_OPENNET_UDF", "CVLAN_ID");
		public static final String SO_ORDER_STATUS_ODRCOM="ODRCOM";
		public static final String SO_ORDER_STATUS_PROVSP="PROVSP";
		public static final String SO_ORDER_STATUS_REQRES="REQRES";
		public static final String SO_ORDER_STATUS_REQFRE="REQFRE";
		public static final String SO_ORDER_STATUS_STACH="STACH";
		public static final String SO_ORDER_BUSI_TYPE_OPENNET2TDC="OpeNet2TDC";
		public static final String SO_ORDER_BUSI_TYPE_OPENNET="OpenNet";
		public static final String SO_ORDER_BUSI_TYPE_TDC2OPENNET="TDC2OpenNet";
		public static final String SO_ORDER_BUSI_TYPE_TDC="TDC";
		public static final String SO_ORDER_BUSI_TYPE_FWA="Telenor";
		public static final String SO_ORDER_BUSI_TYPE_OPENNET_MODIFY="OpenNetModify";
		public static final String SO_ORDER_BUSI_TYPE_TDC2FIBIA="TDC2Fibia";
		public static final String SO_ORDER_BUSI_TYPE_OPENNET2FIBIA="OpenNet2Fibia";
		public static final String SO_ORDER_BUSI_TYPE_FIBIA2TDC="Fibia2TDC";
		public static final String SO_ORDER_BUSI_TYPE_FIBIA2OPENNET="Fibia2OpenNet";
		public static final String SO_ORDER_BUSI_TYPE_FIBIA="Fibia";
		public static final String SO_PUSHC_OPENNET_NEW_ONLINEDATE_FREE = "SO_FIXEDLINE_OPENNET_NEW_ONLINEDATE_FREE_001";//opennet onlinedate free eventCode
		public static final String SO_PUSHC_OPENNET_NEW_ONLINEDATE = "SO_FIXEDLINE_OPENNET_NEW_ONLINEDATE_001";//opennet onlinedate  eventCode
		public static final String SO_PUSHC_OPENNET_NEW_ONLINEDATE_REMINDER01 = "SO_FIXEDLINE_OPENNET_NEW_ONLINEDATE_REMINDER01";//opennet 上门 提醒
		public static final String SO_PUSHC_OPENNET_NEW_ONLINEDATE_REMINDER02 = "SO_FIXEDLINE_OPENNET_NEW_ONLINEDATE_REMINDER02";//opennet 上门 提醒
		public static final String SO_PUSHC_OPENNET_NEW_ONLINEDATE_REMINDER03 = "SO_FIXEDLINE_OPENNET_NEW_ONLINEDATE_REMINDER03";//opennet 上门 提醒
		public static final String SO_PUSHC_OPENNET_ORDER_STATUS_UPDATE_001 = "SO_FIXEDLINE_OPENNET_ORDER_STATUS_UPDATE_001";//opennet 订单状态变更
		public static final String SO_PUSHC_OPENNET_ORDER_STATUS_UPDATE_002 = "SO_FIXEDLINE_OPENNET_ORDER_STATUS_UPDATE_002";//opennet 订单状态变更
		public static final String SO_PUSHC_OPENNET_ORDER_STATUS_UPDATE_003 = "SO_FIXEDLINE_OPENNET_ORDER_STATUS_UPDATE_003";//opennet 订单状态变更
		public static final String SO_PUSHC_OPENNET_ORDER_STATUS_UPDATE_004 = "SO_FIXEDLINE_OPENNET_ORDER_STATUS_UPDATE_004";//opennet 订单状态变更
		public static final String SO_PUSHC_OPENNET_ORDER_STATUS_UPDATE_005 = "SO_FIXEDLINE_OPENNET_ORDER_STATUS_UPDATE_005";//opennet 订单状态变更
		public static final String SO_PUSHC_OPENNET_ORDER_STATUS_UPDATE_006 = "SO_FIXEDLINE_OPENNET_ORDER_STATUS_UPDATE_006";//opennet 订单状态变更
		public static final String SO_PUSHC_OPENNET_ORDER_STATUS_UPDATE_007 = "SO_FIXEDLINE_OPENNET_ORDER_STATUS_UPDATE_007";//opennet 订单状态变更
		public static final String SO_PUSHC_OPENNET_ORDER_STATUS_UPDATE_008 = "SO_FIXEDLINE_OPENNET_ORDER_STATUS_UPDATE_008";//opennet 订单状态变更
		public static final String SO_PUSHC_OPENNET_ORDER_STATUS_UPDATE_009 = "SO_FIXEDLINE_OPENNET_ORDER_STATUS_UPDATE_009";//opennet 订单状态变更
		public static final String SO_PUSHC_OPENNET_ORDER_STATUS_UPDATE = "SO_FIXEDLINE_OPENNET_ORDER_STATUS_UPDATE";//opennet 订单状态变更
		public static final String SO_FIXEDLINE_OPENNET_CHANGE_CONTACT_INFO = "SO_FIXEDLINE_OPENNET_CHANGE_CONTACT_INFO_001";//opennet
		//		public static final String SO_CUST_EXT_OPENNET_ORDER_ID = "OPENNET_BASKET_ID";
		public static final String SO_TMF_FIXED_SERVICE_URL = SoConstUtil.getParaDetailValueByCondition("SO_RESTFUL_URL", "TMF_FIXED_SERVICE");

	}
	public static final String SO_PLATFORM_NAME_CONSTANT="platForm";
	public static final String SO_PLATFORM_NAME_TELENOR="Telenor";
	public static final String SO_IO_TELENOR="Telenor";
	public interface Fibia{
		public static final String SO_PLATFORM_NAME_FIBIA="Fibia";
		public static final String SO_FIBIA_IO_STATIC_TYPE="CS_SR_PROBLEM_PROCESS@IO_ID_FIBIA";

		public static final String SO_CUST_EXT_PRODUCT_OFFERING_QUALIFIACATION ="PRODUCT_OFFERING_QUALIFIACATION";
		public static final String SO_CUST_EXT_PRODUCT_ORDER_ID ="EXTERNAL_PRODUCT_ORDER_ID";
		public static final String SO_CUST_EXT_CUST_ID ="FIBIA_CUST_ID";
		public static final String SO_CUST_EXT_SERVICE_ORDER_ID ="EXTERNAL_SERVICE_ORDER_ID";
		public static final String SO_CUST_EXT_ATTR_VALUE_QUALIFIACATION ="QUALIFIED";
		public static final String SO_CUST_EXT_ATTR_VALUE_UNQUALIFIACATION ="UNQUALIFIED";
		public static final String SO_CUST_EXT_TECHNICIAN_NUMBER ="TECHNICIAN_NUMBER";
		public static final String SO_CUST_EXT_TECHNICIAN_EMAIL ="TECHNICIAN_EMAIL";
		public static final String SO_CUST_EXT_TECHNICIAN_DATE="TECHNICIAN_DATE";
		public static final String SO_CUST_EXT_TECHNICIAN_OPENING_HOURS_END ="TECHNICIAN_OPENING_HOURS_END";
		public static final String SO_CUST_EXT_TECHNICIAN_OPENING_HOURS_START ="TECHNICIAN_OPENING_HOURS_START";
		public static final String SO_CUST_EXT_ONLINEDTE_CONFIRMED_TIMES ="SO_CUST_EXT_ONLINEDTE_CONFIRMED_TIMES";
		public static final String SO_CUST_EXT_CALL_API_TIMES ="SO_CUST_EXT_CALL_API_TIMES";
		public static final String SO_CUST_EXT_CALL_API_DATE ="SO_CUST_EXT_CALL_API_DATE";
		public static final String SO_CUST_EXT_TECHNICIAN_NAME ="TECHNICIAN_NAME";
		public static final String SO_CUST_EXT_IS_SAPA_DATE_SELECTED="IS_SAPA_DATE_SELECTED";
		public static final String SO_CUST_EXT_X_WEEKS="X_WEEKS";


		public static final String SO_CHECK_COMPLETNESS_Fibia_XDSLMANUAL ="N100016";
		public static final String SO_CHECK_COMPLETNESS_Fibia_UNQUALIFIED ="B100016";

		public static final long  SO_SRV_ATTR_FIBIA_CUST_ID = 262100001026L;

		public static final long  FEATURE_ID_FIBIA_OFFER_NAME = 2700357L;

		public static final String SO_FIBIA_EVENT_TYPE="FIBIA_EVENT_TYPE";

		public static final String FIBIA_ONLINE_DATE_X="FIBIA_ONLINE_DATE_";
		public static final String DELIVERY_DATE_M="FIBIA_Delivery_Date_M";
		public static final String DELIVERY_DATE_X="FIBIA_Delivery_Date_X";
		public static final String DELIVERY_DATE_Y="FIBIA_Delivery_Date_Y";
		public static final String DELIVERY_DATE_Z="FIBIA_Delivery_Date_Z";
		public static final String DELIVERY_DATE_T="FIBIA_Delivery_Date_T";
		public static final String PROVISIONING_TIME="openNet_ProvisioningTime";
		public static final String FIBIA_SERVICE_ORDER_EVENT_TYPE = "FibiaServiceOrderNotification";

		public static final String DIGGING_PROJECT_DELIVERY_DATE="Digging_Project_Delivery_Date";

		public static final String SO_ORDER_STATUS_EVENTTYPE_CREATE = "SERVICE_CREATE_EVENT";
		public static final String SO_ORDER_STATUS_EVENTTYPE_STATE_CHANGE = "SERVICE_ORDER_ITEM_STATE_CHANGE_EVENT";
		public static final String SO_CUST_EXT_EARLIEST_AVAILABILITY_DATE="EARLIEST_AVAILABILITY_DATE";
		public static final String PRODUCT_ORDER_STATE_CHANGE_EVENT = "PRODUCT_ORDER_STATE_CHANGE_EVENT";

		public static final String SO_INSTALLTION_STATUS_IN_PROGRESS = "ADDRESS_INSTALLATION_IN_PROGRESS";

		public static final String  SO_SRV_ATTR_IO_EF = "eum107";

  	}

	//fixed service
	public static final String SO_FIXED_APP_KEY = SoConstUtil.getParaDetailValueByCondition("SO_FIXED_APP", "KEY");
	public static final String SO_FIXED_APP_AUTHORIZATION = SoConstUtil.getParaDetailValueByCondition("SO_FIXED_APP", "AUTHORIZATION");

	public static final String SO_FIXBOX_APP_KEY = SoConstUtil.getParaDetailValueByCondition("SO_FIXBOX_APP", "KEY");
	public static final String SO_FIXBOX_APP_AUTHORIZATION = SoConstUtil.getParaDetailValueByCondition("SO_FIXBOX_APP", "AUTHORIZATION");
	public static final String SO_FIXBOX_APP_APIKEY = SoConstUtil.getParaDetailValueByCondition("SO_FIXBOX_APP", "APIKEY");


	public static final String CAN_SUBSCRIBE_PRIVATE_OFFER_CONFIG = "CAN_SUBSCRIBE_PRIVATE_OFFER";
	public static final String CAN_SUBSCRIBE_PRIVATE_OFFER_VALUE_YES = "0";
	public static final String CAN_SUBSCRIBE_PRIVATE_OFFER_VALUE_NO = "1";

	public static final String SO_CUST_EXT_VISIBLE_IN_OSE = "VISIBLE_IN_OSE";
	public static final String SO_CUST_EXT_EXTERNAL_CODE_IN_OSE = "EXTERNAL_CODE_IN_OSE";

	public static final String SO_CUST_EXT_SMS_SWITCH = "SMS_SWITCH";
	public static final String SO_CUST_EXT_CHANNEL_FROM = "CHANNEL_FROM";

	public static final String SO_BUSINESS_NAME_CHANGE_VOIP_NUM = "changeVoipNum";
	public static final String SO_BUSINESS_NAME_CHANGE_TECH_PARAM = "changeTechParam";
	public static final String SO_BUSINESS_NAME_CHANGE_PSTN_NUM = "modifyPstnNum";
	public static final String SO_BUSINESS_NAME_RE_PROVISION = "modifyAddress";
	public static final String SO_BUSINESS_NAME_MODIFY_ADDRESS = "reProvision";

	public static final String ORDER_PUSHC_TASK_STATUS_WAITING_DATA = "1";//等待数据
	public static final String ORDER_PUSHC_TASK_STATUS_WAITING_PROCESS = "2";//等待处理
	public static final String ORDER_PUSHC_TASK_STATUS_SUCCESS = "3";//处理成功
	public static final String ORDER_PUSHC_TASK_STATUS_FAILURE = "4";//处理失败
	public static final String ORDER_PUSHC_TASK_STATUS_COMPARE = "5";//参数比对
	public static final String ORDER_PUSHC_TASK_STATUS_FUTURE = "6";//预订发送
	public static final String BATCH_ORDER_PUSHC_TASK_STATUS_COMPARE = "15";//批量参数比对
	public static final String BATCH_ORDER_PUSHC_TASK_STATUS_SUCCESS = "13";//批量处理成功
	public static final String BATCH_ORDER_PUSHC_TASK_STATUS_WAITING_PROCESS = "12";//等待处理
	public static final String BATCH_ORDER_PUSHC_TASK_GROUP_COUNT = "SO_PUSHC_GROUP_COUNT";//等待处理

	public static final String PUSHC_PARAM_COMPARE_RESULT_SAME = "1";//完全相同
	public static final String PUSHC_PARAM_COMPARE_RESULT_DIFFERENCE = "2";//有差异
	public static final String PUSHC_PARAM_COMPARE_RESULT_EXCEPTION = "3";//异常

	public static final long ORDER_NOTIFICATION_DATA_STATE_NEW_LOGIC = 1l;//标识是新逻辑产生的数据
	public static final long ORDER_NOTIFICATION_DATA_STATE_OLD_LOGIC = 99l;//标识是老逻辑产生的数据
	public interface  notificationNode {
		public static final String ORD_SUBMIT = "order stubmit";
		public static final String WORKFLOW = "workflow";
		public static final String INTERFACE = "interface";
		public static final String TASK = "task";
		public static final String ORD_TRANS_HIS = "orderTransHis";
		public static final String BATCH_SUBMIT = "batch_submit";
		public static final String PUSHCPARAMCOMPARETASK = "PushcParamCompareTask";
	}

	public static final String B2B_ESHOP_CONSTANT_MIAN_OFFER_PREFIX = "OFFER_PLAN";
	public static final String B2B_ESHOP_CONSTANT_RELATION_SHIP_TYPE_ADDON = "DependsOn";
	public static final String B2B_ESHOP_CONSTANT_RELATION_SHIP_TYPE_RELY_ADDON = "ReliesOn";
	public static final String B2B_ESHOP_CONSTANT_RELATION_SHIP_TYPE_INCLUDE = "Includes";
	public static final String B2B_ESHOP_CONSTANT_RELATION_SHIP_TYPE_RELATE = "Relates";
	public static final String B2B_ESHOP_CONSTANT_DELIVERY_TYPE_HOME_DELIVERY = "Dlivery";
	public static final String B2B_ESHOP_CONSTANT_PRODUCT_CHARACTERISTIC_MSISDN = "MSISDN";
	public static final String B2B_ESHOP_CONSTANT_PRODUCT_CHARACTERISTIC_SHOR_NUMBER = "ShortNumber";

	public static final String BATCH_PREQ_ERRORMESSGE_TDC_OFFLINE = "TDC offline pre-Q fails";
	public static final String BATCH_PREQ_ERRORMESSGE_OPENNET_OFFLINE = "OpenNet offline pre-Q fails";
	public static final String BATCH_PREQ_ERRORMESSGE_OPENNET_ONLINE = "OpenNet online pre-Q fails";
	public static final String BATCH_PREQ_ERRORMESSGE_WRONG_FORMAT = "Wrong format of input parameter";
	public static final String BATCH_PREQ_ERRORMESSGE_TDC_CHOICEADRESS = "TDC returns alternative address";
	public static final String BATCH_PREQ_ERRORMESSGE_NO_OFFER = "No offers available due to selected filter";
	public static final String BATCH_PREQ_ERRORMESSGE_OTHER = "Validation failed";
	public static final String BATCH_PREQ_ERRORMESSGE_UNKNOWN_ADDRESS = "No offers available or unknown address";
	public static final String BATCH_PREQ_ERRORMESSGE_FIBIA_NO_OFFER = "No offers available through Fibia";
	public static final String BATCH_PREQ_ERRORMESSGE_TDC_NO_OFFER = "No offers available through TDC";
	public static final String BATCH_PREQ_ERRORMESSGE_OPENNET_NO_OFFER = "No offers available through OpenNet";
	public static final String BATCH_PREQ_ALL_PLATFORM = "OpenNet,Fibia,TDC";

	public static final String ANONIMOUS_DAY_LIMIT = "ANONIMOUS_DAY_LIMIT";
	public static final String NORMAL_DAY_LIMIT = "NORMAL_DAY_LIMIT";

	public static final String INSDATA_DAY_LIMIT = "INSDATA_DAY_LIMIT";

	//Ai-8289
	public static final String BUSINESSVALUETAG_FAMILY = "FAMILY";
	public static final String BUSINESSVALUETAG_PUREMOBILE = "PUREMOBILE";

	//增加朋友变量
	public interface platForm {
		public static final String SO_PLATFORM_NAME_OSE = "OSE";
		public static final String SO_PLATFORM_NAME_CRM = "CRM";

	}

	public interface B2BEshopErrCode{
		public static final String EXIST_ONGOING = "8011";
		public static final String NO_USER_EXIST = "8025";
		public static final String OFFER_NOT_CHANGE = "8026";
		public static final String ACCOUNT_NOT_EXIST = "8007";
		public static final String ILLEGAL_ACCOUNT = "8027";
		public static final String COMMIT_EXIST_NOT_SUBSCRIBE_HANDSET = "8027";//存在有效的new phone commit ,不能订购合约机
		public static final String INSURANCE_EXIST_NOT_SUBSCRIBE_NEW_INSURANCE = "8028";//手机上如果存在保险，不能再订购新的保险
		public static final String NEWADDON_MUTEX_OLDMAINOFFER = "8029";//新订购的add on offer和老的main offer互斥
		public static final String ICCID_IS_NOT_NULL = "8030";//ICCID不能为空
		public static final String PO_NUMBER_NOT_NULL = "8031";//ICCID不能为空
		public static final String AGREEMENT_ID_IS_NOT_NULL = "8032";//合同id不能为空
		public static final String EFFECTIVE_DATE_IS_NOT_NULL = "8033";//生效时间不能为空
		public static final String INCORRECT_OS_TYPE = "8034";//生效时间不能为空
		public static final String USER_ALREADY_DONE = "8035";//生效时间不能为空
		public static final String INCORRECT_REQUEST_TIME = "8036";//INVALID REQUEST DATE
		public static final String INCORRECT_REQUEST_REASON = "8037";//INVALID SUSPEND/RESUMPTION REASON
		public static final String INVALID_USER = "8038";//invalid user
		public static final String INCORRECT_ACCOUNT = "8039";//invalid user
		public static final String INCORRECT_TERMINATET_REASON = "8040";//INVALID termination REASON
		public static final String MISSING_TRANSIT_INFO = "8041";//INVALID termination REASON
		public static final String BUSI_NOT_ALLOWN = "8042";//INVALID termination REASON
		public static final String ILLEGAL_BILLID = "8043";//BILLID ILLEGAL
		public static final String MODIFY_ORDER_ERR = "7080";//BILLID ILLEGAL
		public static final String MODIFY_ONLINEDATE_ERR = "8044";//MODIFY_ONLINEDATE_ERR
		public static final String MODIFY_ONLINEDATETIME_ERR = "8045";//MODIFY_ONLINEDATETIME_ERR
		public static final String MODIFY_VISITSERVICE_ERR = "8046";//MODIFY_VISITSERVICE_ERR
		public static final String MODIFY_CONTACTINFO_ERR = "8047";//MODIFY_CONTACTINFO_ERR
		public static final String HARDWARE_BUSINESS_EXCEPTION = "8044";//OFFER_VAS_HANDSET  BUSINESS CODE
		public static final String MULTISIM_BUSINESS_EXCEPTION = "8045";//OFFER_VAS_HANDSET  BUSINESS CODE
	}

	public static final long DISCOUNT_MOLECULES = 820614L;//FRI费用
	public static final String B2BESHOP_ACTION_TYPE_NOCHANGE = "NoChange";
	public static final String B2BESHOP_ACTION_TYPE_MODIFY = "Modify";
	public static final String B2BESHOP_ACTION_TYPE_DELETE = "Delete";
	public static final String B2BESHOP_ACTION_TYPE_ADD = "Add";
	public static final String B2BESHOP_ACTION_TYPE_SUSPEND = "Suspend";
	public static final String B2BESHOP_ACTION_TYPE_RESUME = "Resume";
	public static final String B2BESHOP_ACTION_TYPE_RELOCATE = "Relocate";
	public static final String B2BESHOP_ACTION_TYPE_ACTIVESIM = "ActivateSimCard";
	public static final String B2BESHOP_ACTION_TYPE_CHANGESIM = "ChangeSimCard";
	public static final String B2BESHOP_ACTION_TYPE_MODIFY_ORDER = "ModifyOrder";
	public static final String B2BESHOP_ACTION_TYPE_CANCEL_ORDER	 = "CancelOrder";
	public static final String B2BESHOP_ACTION_TYPE_CHANGE_ACCOUNT	 = "ChangeAccount";

	public static final String B2BESHOP_HANDSETSALES_BUSINESS = "HandsetSales";
	public static final String B2BESHOP_MULTIPLAN_BUSINESS = "multiplanBusiness";
	public static final String B2BESHOP_MULTIPLAN_CHANGE_BUSINESS = "multiplanChangeOffer";
	public static final String B2BESHOP_NORDIC_BUSINESS = "nordicBusiness";
	public static final String B2BESHOP_NORDIC_CHANGE_BUSINESS = "nordicChangeOffer";
	public static final String B2BESHOP_CHANGE_ACCOUNT_BUSINESS = "changeAccount";
	public static final String B2BESHOP_RELATION_INCLUDE = "Includes";
	public static final String B2BESHOP_RELATION_RELATE = "Relates";
	public static final String B2BESHOP_BATCH = "B2BE_SHOP_BATCH";

	public static final String BATCH_NEW_ADDRESS_TYPE_NEW = "Other";
	public interface batchErrorCode {
		String BATCH_NEW_ERRORMESSGE_MISSING_INFORMATION = "Missing mandatory information in ";
		String BATCH_NEW_ERRORMESSGE_WRONG_FORMAT = "Wrong format in the input information in ";
		String BATCH_NEW_ERRORMESSGE_CUSTOMER_ID = "CustomerID does not exist or is invalid";
		String BATCH_NEW_ERRORMESSGE_INSTALLNATION_ADDRESS = "Installation address cannot be found";
		String BATCH_NEW_ERRORMESSGE_TDC_ADDRESS = "TDC returns list with alternative addresses, that you must select from";
		String BATCH_NEW_ERRORMESSGE_AGREEMENT_ID = "AgreementID does not exist or is invalid";
		String BATCH_NEW_ERRORMESSGE_MAIN_OFFER = "Main offer not available";
		String BATCH_NEW_ERRORMESSGE_ADD_ON_NOT_AVAILABLE = "Addon offer not available to add";
		String BATCH_NEW_ERRORMESSGE_ADD_ON_NOT_EXIT_SUBSCRIPTION = "Addon offer to delete does not exist on subscription";
		String BATCH_NEW_ERRORMESSGE_ADD_ON_NOT_ALLOW = "Addon offer to delete is not allowed";
		String BATCH_NEW_ERRORMESSGE_LINEOPTION_ERROR = "Cannot select chosen lineoption";
		String BATCH_NEW_ERRORMESSGE_INSTALLNATION_METHOD = "Installation method not possible";
		String BATCH_NEW_ERRORMESSGE_INSTALLNATION_ID = "InstallationID needed";
		String BATCH_NEW_ERRORMESSGE_ACCOUNT_ID = "AccountID does not exist or is invalid";
		String BATCH_NEW_ERRORMESSGE_PARTY_ID = "User’s PartyID does not exist or is invalid";
		String BATCH_NEW_ERRORMESSGE_SYSTEM_ERROR = "System/API error";
		String BATCH_NEW_ERRORMESSGE_USER_EXIT = "User already exist, input PartyID";
		String BATCH_NEW_ERRORMESSGE_FILE_CONFICLT = "Conflicting input in the file";
		String BATCH_NEW_ERRORMESSGE_PSTN_ADDON_MISSING = "Splitter addon missing for PSTN";
		String BATCH_NEW_ERRORMESSGE_AGENT_MISSING = "Agent missing permission to place order";
		String BATCH_NEW_ERRORMESSGE_ROUTER_OUT = "Router is out of stock";
		String BATCH_NEW_ERRORMESSGE_Other = "Fail to submit order";
	}
	public interface queryBatchError{
		public static final String BATCH_QUERY_ORD_NOT_CORRECT=" Single Order ID is incorrect,please re-input the Single Order ID!";
		public static final String BARCH_QUERY_ORD_EXIT_BATCHORDER="This order is already within a bulk order. It cannot be combined again!";
		public static final String BARCH_QUERY_ORD_IS_PROCESSING="This order is being processed, please try again later!";
	}

	public static final String INSURANCE_BUSINESS_TYPE = "CM_FMC_INSURANCE_BUSINESS_ID";
	public static final String FMC_INSURANCE_OFFER_TYPE = "CM_INSURANCE_OFFER_ID";
	public static final String EXCLUDE_VIRTUAL_OFFER = "CM_EXCLUDE_VIRTUAL_OFFER";

	public static final String REASON_NO_ACTIVE_SUBSCRIPTION = "No active subscription";
	public static final String REASON_BUY_NEW_PHONE = "Buy New Phone";
	public static final String REASON_TRANSFER_OWNERSHIP = "Transfer Ownership";

	public static final String SO_COUNTRY_CFG = "SO_COUNTRY_CFG";
	public static final String INSURANCE = "TERMINATE_INSURANCE"; //new Family Offer

	public static final Long SUMMARY_TASK_INIT_OSE = 0L;//老方案 ose batch init状态
	public static final Long SUMMARY_TASK_SUCCESS = 2L;//成功
	public static final Long SUMMARY_TASK_FAILURE = 3L;//失败
	public static final Long SUMMARY_TASK_CRM_INIT = 5L;//新方案 crm batch init状态
	public static final Long SUMMARY_TASK_NOTIFICATION_SWITCH = 6L;//batch notification switch off

	public static final Long SUMMARY_DETAIL_INIT = 0L;//初始
	public static final Long SUMMARY_DETAIL_SUCCESS = 2L;//成功
	public static final Long SUMMARY_DETAIL_FAILURE = 3L;//失败
	public static final Long SUMMARY_DETAIL_MAINOFFER_UPCSWITCHOFF = 4L;//main offer upc switch off
	public static final Long SUMMARY_DETAIL_NOCREATEMAINOFFER = 5L;//no create main offer
	public static final Long SUMMARY_DETAIL_CANCEL = 6L;//single Order Cancelled


	public static final String RELATE_BUDINESS_ID="RELATE_BUSINESS_ID";
	public static final String ASAP_DATE_YES="Yes";
	public static final String ASAP_DATE_No="No";

	public static final String MOBILE_5G_SERVICE_ID = "2200197";
	public static final long FREE_RESOURCE_FEATURE_ID = 10003000L;
	public static final String FREE_RESOURCE_FEATURE_VALUE = "1";
	public static final int LOW_SPEED_GROUP_ID = 4999999;
	public static final String OFFER_RC_LISTPRICE_FEATURE_ID = "200005";
	public static final String OFFER_NOTICEPERIOD_FEATURE_ID = "2700004";
	public static final String ACTIVATION_FEE_PRICECATALOG = "Creation Fee";
	public static final String ORD_EXT_ATTRCODE_COMMITMENT_PERIOD = "commitmentPeriod";
	public static final String PARA_TYPE_ORDER_SUMMARY = "ORDER_SUMMARY_EVENT_CODE";
	public static final String SO_ORDER_SUMMARY_SINGLE_EVENTCODE = "SO_ORDER_SUMMARY_SINGLE";
	public static final String SO_ORDER_SUMMARY_BATCH_EVENTCODE = "SO_ORDER_SUMMARY_BATCH";

	public static final String SO_B2B_ORDER_SUMMARY_SINGLE_EVENT = "SO_B2B_ORDER_SUMMARY_SINGLE_EVENT";

	public static final String SO_B2B_ORDER_SUMMARY_BATCH_EVENT = "SO_B2B_ORDER_SUMMARY_BATCH_EVENT";
	//45dkk Blank Media Fee
	public static final String ACC_CODE_BLANK_MEDIA_FEE = "810000007";

	//OSE eshop&selfcare
	public static final String ORDER_SUMMARY_MVP1 = "SO_ORDER_SUMMARY_SWITCH";
	//MVP1 + CRM new connection & change main offer, batch order & single order
	public static final String ORDER_SUMMARY_DROP1 = "SO_ORDER_SUMMARY_MVP2_SWITCH";
	//DROP1 + CRM transfer ownership & relocation, batch order & single order +  modify ongoing order
	public static final String ORDER_SUMMARY_DROP3 = "SO_ORDER_SUMMARY_DROP3_SWITCH";

	// eshop 是否记录 batSingleOrder 开关
	public static final String ESHOP_SAVE_BATCH_SINGLE_ORDER_SWITCH = "ESHOP_SAVE_BATCH_SINGLE_ORDER_SWITCH";

	public static final String BATCH_NP_CR = "BATCH_NP_CR_SWITCH";

	public static final String CVS700_SWITCH = "CVS700_SWITCH";

	public static final String CVS1149_SWITCH = "CVS1149_SWITCH";

	public static final String SO_RECEIVE_EMAIL_INFO = "RECEIVE_EMAIL_INFO";
	public static final String SO_RECEIVE_EMAIL_CONTENT = "RECEIVE_EMAIL_CONTENT";

	//CVS-52 总开关
	public static final String CVS_52_SWITCH = "CVS52_SWITCH";

	public static final String PUCHC_NEED_BULID_EMAIL_FILE="PUCHC_NEED_BULID_EMAIL_FILE";


	public interface SBBU {
		public static final String BUSINESS_SBUU = "SBBU";
		public static final String SO_CUST_EXT_IS_SBBU_FLAG = "IS_SBBU";
		public static final String SO_TIMER_FIBIA_UNQUALIFIED_TT = "FIBIA_UNQUALIFIED_TT_DATE";
		public static final String SO_TIMER_SBBU_NO_RESPONSE = "SBBU_NO_RESPONSE_DATE";
		public static final String SO_TASK_MODIFY = "modify";//修改POA之后pushc流程
		public static final String SO_TASK_CHANGE_LINE_OPTION = "changeLineOption";//修改POA之后pushc流程
		public static final String SO_TASK_SUCCESS = "success";//修改POA之后pushc流程
		public static final String SO_TASK_NOTIFY = "notify";//修改POA之后push流程
		public static final String SO_CUST_EXT_IS_CAPACITY_FLAG = "IS_CAPACITY";
		public static final String SO_CUST_EXT_FILL_POA = "FILL_POA";
		public static final String SO_CHECK_COMPLETNESS_SBBU ="B10001";
		public static final String SO_CHECK_COMPLETNESS_SBBU_NP ="B20011";
		public static final String SEND_EMAIL_TO_CUST_OR_SP = "isSendCustEmail";

		public static final String POA_ATTR_OPERATOR = "Operator";
		public static final String POA_ATTR_CUSTOMER_NO = "CustomerNo";
		public static final String POA_ATTR_CIRCUIT_NO = "CircuitNo";
		public static final String POA_ATTR_CUSTOMER_NAME = "CustomerName";
		public static final String POA_ATTR_CVR = "CVR";
		public static final String POA_ATTR_ONLINE_DATE = "OnlineDate";
		public static final String POA_ATTR_CONTACT_CUSTOMER_FLAG = "ContactCustomerFlag";
		public static final String POA_ATTR_ACCEPT_TERMS_FLAG = "AcceptTermsFlag";
		public static final String POA_ATTR_LEGAL_ADDRESS = "LegalAddress";
		public static final String POA_ATTR_INSTALLL_ADDRESS = "InstallAddress";
		public static final String POA_ATTR_REJECT_CODE = "RejectCode";
		public static final String POA_ATTR_REJECT_REASON = "RejectReason";
		public static final String POA_ATTR_STATE = "PoaState";
		public static final String POA_ATTR_ADDRESS_IDENTIFIER = "AddressIdentifier";
		public static final String POA_ATTR_AGREEMENT_ID = "AgreementId";
		public static final String POA_ATTR_SIGN_NAME = "SignName";

		public static final String EMAIL_ATTR_SP_ID = "EMAIL_MARK_ID";
		public static final String EMAIL_ATTR_SBBU_TYPE = "MAIL_SUBJECT";
		public static final String EMAIL_ATTR_CUSTOMER_NAME = "CUSTOMER_NAME";
		public static final String EMAIL_ATTR_CUSTOMER_NO = "CUSTOMER_NO";
		public static final String EMAIL_ATTR_ONLINE_DATE = "ONLINE_DATE";
		public static final String EMAIL_ATTR_OLD_ONLINE_DATE = "OLD_ONLINE_DATE";
		public static final String EMAIL_ATTR_CHANGE_ONLINE_DATE = "CHANGE_ONLINE_DATE";
		public static final String EMAIL_ATTR_CURRENT_SP = "CURRENT_SP";
		public static final String EMAIL_ATTR_PREVIOUS_SP = "PREVIOUS_SP";
		public static final String EMAIL_ATTR_CVR = "CVR";
		public static final String EMAIL_ATTR_ADDRESS_IDENTIFIER = "ADDRESS_IDENTIFIER";
		public static final String EMAIL_ATTR_INSTALL_ADDRESS = "INSTALL_ADDRESS";
		public static final String EMAIL_ATTR_INSTALL_ZIPCODE = "INSTALL_ZIPCODE";
		public static final String EMAIL_ATTR_INSTALL_CITY = "INSTALL_CITY";
		public static final String EMAIL_ATTR_LEGAL_ADDRESS = "LEGAL_ADDRESS";
		public static final String EMAIL_ATTR_LEGAL_ZIPCODE = "LEGAL_ZIPCODE";
		public static final String EMAIL_ATTR_LEGAL_CITY = "LEGAL_CITY";
		public static final String EMAIL_ATTR_ACCEPT_TERMS_FLAG = "ACCEPT_TERMS_FLAG";
		public static final String EMAIL_ATTR_CONTACT_CUSTOMER_FLAG = "CONTACT_CUSTOMER_FLAG";
		public static final String EMAIL_ATTR_POA_PDF_CONTENT = "POA_PDF_CONTENT";//poa邮件pdf附件的内容
		public static final String EMAIL_ATTR_POA_DATE = "POA_DATE";
		public static final String EMAIL_ATTR_POA_DATE_DDMMYYYY = "POA_DATE_2";
		public static final String PUSHC_ATTR_NEED_PDF = "NEED_PDF";
		public static final String EMAIL_ATTR_SIGN_NAME = "SIGN_NAME";

		public static final String SEND_CHANG_EDATE_EVENT_CODE = "SO_FIXEDLINE_SBBU_CHANGE_DATE_01";//sbbu向sp发送change onlineDate date邮件的eventCode
		public static final String SEND_POA_EVENT_CODE = "SO_FIXEDLINE_SBBU_POA_01";//sbbu向sp发送邮件eventCode
		public static final String REPLAY_SP_EVENT_CODE = "SO_FIXEDLINE_SBBU_REPLY_email";//回sp邮件的eventCode
		public static final String POA_EMAIL_SUBJECT_TDC = "SBBU_CREATE_DSL";//TDC场景的特殊主题
		public static final String POA_EMAIL_SUBJECT_MULTI = "SBBU_CREATE_MULTI";//B2B客户填了agreementID
		public static final String POA_EMAIL_SUBJECT = "SBBU_CREATE";//其他场景主题
		public static final String POA_EMAIL_CONFIRM_CREATE = "SBBU_CONFIRM_CREATE";//第三方运营商确认通过
		public static final String POA_EMAIL_REJECT = "SBBU_REJECT";//第三方运营商拒绝
		public static final String POA_EMAIL_CHANGE_DATE_CONFIRM = "SBBU_CHANGE_DATE_CONFIRM";
		public static final String POA_EMAIL_SBBU_CHANGE_DATE = "SBBU_CHANGE_DATE";
		public static final String POA_EMAIL_SBBU_CANCEL_CONFIRM = "SBBU_CANCEL_CONFIRM";
		public static final String POA_EMAIL_SBBU_CANCEL = "SBBU_CANCEL";

		public static final String EMAIL_REJECT_CODE_CUSTID = "CUSTID";
		public static final String EMAIL_REJECT_CODE_CUSTNAMESPL = "CUSTNAMESPL";
		public static final String EMAIL_REJECT_CODE_CUSTNAME = "CUSTNAME";
		public static final String EMAIL_REJECT_CODE_CUSTADD = "CUSTADD";
		public static final String EMAIL_REJECT_CODE_INSADD = "INSADD";
		public static final String EMAIL_REJECT_CODE_CVRNO = "CVRNO";
		public static final String EMAIL_REJECT_CODE_REQDAT = "REQDAT";
		public static final String EMAIL_REJECT_CODE_TERM = "TERM";
		public static final String EMAIL_REJECT_CODE_SIGNNO = "SIGNNO";
		public static final String EMAIL_REJECT_CODE_NREQDAT = "NREQDAT";
		public static final String EMAIL_REJECT_CODE_POAMIS = "POAMIS";
		public static final String EMAIL_REJECT_CODE_POACOM = "POACOM";
		public static final String EMAIL_REJECT_CODE_KEYMIS = "KEYMIS";
		public static final String EMAIL_REJECT_CODE_TYPMIS = "TYPMIS";
		public static final String EMAIL_REJECT_CODE_CUSTUNKN="CUSTUNKN";
		public static final String EMAIL_REJECT_CODE_CUSTETAB="CUSTETAB";

		public static final String POA_STATUS_PENDING = "Pending";
		public static final String POA_STATUS_COMPLETE = "Complete";
		public static final String POA_STATUS_REJECTED = "Rejected";

		public static final String SBBUTYPE_PORT_IN = "PORT_IN";
		public static final String SBBUTYPE_PORT_OUT = "PORT_OUT";

		public static final String SBBU_OPERATOR_TELENOR = "Telenor";
	}

	/**
	 * ORD_SBBU_POA.POA_STATE枚举
	 * 0 初始状态
	 * 1 POA信息完整
	 * 2 complete 归档
	 */
	public static final long POA_ORIGIN = 0;
	public static final long POA_WHOLE = 1L;
	public static final long POA_ARCHIVE = 2L;

	/**
	 * ORD_SBBU_TASK.NP_STATUS枚举
	 * "REQUEST";  before send np request
	 * "REJECTED"; rejected by np-gw
	 * "SUCCESS";  finished sucessfully
	 * "CHANGELINE"
	 */
	public static final String SBBU_REQUEST = "REQUEST";
	public static final String SBBU_REJECTED = "REJECTED";
	public static final String SBBU_SUCCESS = "SUCCESS";
	public static final String SBBU_CHANGELINE = "CHANGELINE";

	public static final String SO_FEATURE_OFFER_TYPE_SECURE = "130";
	public static final long SO_SERVICE_ID_SECURE = 2220058L;

	public static final String BatchUserDtlToHisTask_CONFIG = "BatchUserDtlToHisTask_CONFIG";
	public static final String BatchUserDtlToHisTask_CONFIG_COUNT = "COUNT";
	public static final String BatchUserDtlToHisTask_CONFIG_DONE_DATE_AGO = "DONE_DATE_AGO";
	public static final String BatchUserDtlToHisTask_CONFIG_STATE = "STATE";
	public static final String BatchUserDtlToHisTask_CONFIG_DELAY_TIME = "DELAY_TIME";

	public static final String BATCH_USER_STATE_0 = "0";// 订单处理失败
	public static final String BATCH_USER_STATE_1 = "1";// 初始
	public static final String BATCH_USER_STATE_2 = "2";// 订单处理成功
	public static final String BATCH_USER_STATE_4 = "4";// 删除NP号码

	public static final String BATCH_USER_DTL_TO_HIS_1 = "1";// BATCH_USER_DTL表数据挪到了其历史表
	public static final String BATCH_USER_DTL_TO_HIS_2 = "2";// BATCH_USER_DTL表数据挪历史失败

	public static final String EVENT_FUTURE2_FUTUREEFFECTIVE_UPDATE_EXT3 = "futureEffective_updateExt3";

	//CPBX Multiplan Business Type
	public static final long CPBX_MULTIPLAN_BUSINESS_TYPE_FEATURE_ID = 2700386L;
	public static final long FEATURE_ID_COMPANY_OFFER_ID = 2700387L;//这个是 Mainnumber offer或者Wallboard offer映射到Company offer的特征
	public static final String FEATURE_VALUE_MAINNUMBER_OFFER = "1";
	public static final String FEATURE_VALUE_WALLBOARD_OFFER = "2";
	public static final String FEATURE_VALUE_COMPANY_OFFER = "3";

	public static final String APPLY_GLOBAL_DISDOUNT="APPLY_GLOBAL_DISDOUNT";
}

