package com.asiainfo.crm.constant;

import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.util.TimeUtil;

import java.util.Date;

/**
 * Copyright: Asiainfo-Linkage
 * 
 * @desc: 资源静态数据定义
 * @version: v1.0
 * @author: res_team
 * @date: 2010.12.10
 */
public class ResConst
{

	// 换行符
	public static final String FLAG_BR = "\n";

	// 集团产品规格
	public static final long BBOSS_KIND_SYSTEM = 103600000002L;
//	public static final Date INVALID_DATE = ResCommonUtil.getDate(1950, 1, 1, 0, 0);
//	public static final Date FOREVER_DATE = ResCommonUtil.getDate(2099, 1, 1, 0, 0);

	// ----------------------组织相关静态配置数据 后面配置在数据库里面-------------------------------
	public static final boolean PROJECT_FOR_SWITCH = false; // 开关：中国项目特殊情况
	public static final String COUNTRY_CODE_FOR_DK = "45"; // 丹麦国家代码
	public static final String COUNTRY_CODE_FOR_HU = "36"; // 匈牙利国家代码
	
	public static final String TENANTID_FOR_DK_RETAIL = "21"; // 丹麦RETAIL租户代码
	public static final String TENANTID_FOR_DK_WHOLESALE = "91"; // 丹麦WHOLESALE租户代码
	public static final String TENANTID_FOR_HU = "22"; // 匈牙利租户代码

	public static final String LN_ORGID = "1"; // 省总组织
	public static final String LN_ORG_NAME = "SysOperator"; // 省总组织
	public static final String LN_STORE = "10"; // 省总仓库
	public static final String LN_SIM_STORE = "12";// 省SIM卡仓库
	public static final String PROVINCE_REGION = "400";// 省地市编码

	//----------------------归属组织-------------------------------
	public static final long PARENT_ORG_ID = 21000000;// DK归属组织
	public static final long HU_ORG_ID = 22000000;// HU归属组织

	public static final String MAX_Expire_DATE = String.valueOf(TimeUtil.getMaxExpire());

	public static final String POSTFIX_TXT = ".txt"; // TXT文件的后缀
	public static final String POSTFIX_XLS = ".xls"; // Excel文件的后缀
	public static final String POSTFIX_XLSX = ".xlsx"; // Excel文件的后缀
	public static final String POSTFIX_RAR = ".rar"; // RAR 文件的后缀
	public static final String POSTFIX_CSV = ".csv"; // CSV文件的后缀
	// ----------------------组织相关静态配置数据-------------------------------

	// --------------------------------- 数据缓存类型 BEG ---------------------------------
	public static final String RES_ALLRULE_GROUP_DEF_CACHE = "RES_ALLRULE_GROUP_DEF_CACHE"; // 全省规则分组，按照优先级排序
	public static final String RES_BUSI_CACHE = "RES_BUSI_CACHE"; // 日志中busiId的缓存
	public static final String RES_STATIC_CACHE = "RES_STATIC_CACHE"; // 资源静态值 缓存
	public static final String RES_SEL_PRICE_CACHE = "RES_SEL_PRICE"; // 全省规则
	public static final String RES_ALL_RULE_CACHE = "RES_ALL_RULE"; // 全省规则
	public static final String RES_RULE_CACHE = "RES_RULE"; // 地市规则
	public static final String RES_TYPE_CATCH = "RES_TYPE"; // 资源类型
	// public static final String RES_STORE_CATCH = "RES_STORE"; // 资源仓库 ---Telenor 不需要
	public static final String RES_SPEC_TENANT_CATCH = "RES_SPEC_TENANT_CATCH"; // 资源规格（按照租户）
	public static final String RES_SPEC_CATCH = "RES_SPEC"; // 资源规格
	public static final String RES_PRICE_CATCH = "RES_PRICE"; // 资源价格
	public static final String RES_PHONE_LEVEL = "RES_PHONE_LEVEL"; // 号码档次
	public static final String RES_LOCK_TIME_CATCH = "RES_LOCK_TIME"; // 资源锁定时间
	public static final String RES_SUPPLIER = "RES_SUPPLIER"; // 积分实物供应商信息
	public static final String RES_REGION_SUPPLIER = "RES_REGION_SUPPLIER"; // 按地区区分的积分实物供应商信息
	public static final String RES_PATTERN_CLASS = "RES_PATTERN_CLASS"; // 号码模式与类型
	public static final String RES_PATTERN_TYPE_DEF = "RES_PATTERN_TYPE_DEF"; // 号码模式分类定义信息
	public static final String RES_PATTERN_SEG = "RES_PATTERN_SEG"; // 号码模式号段信息
	public static final String RES_SPEC = "RES_SPEC"; // 资源型号
	public static final String RES_SPEC_SCORE = "RES_SPEC_SCORE"; // 积分资源型号
	public static final String RES_CUST_SERVICE_LEVEL = "CM_INDIV_CUST_SERVICE_LEVEL";// 客户服务级别
	public static final String RES_CUST_CLUB_LEVEL = "CM_CLUB_MEMBER_LEVEL";// 俱乐部会员服务级别
	public static final String RES_PAYCARD_CUSTOMER_TYPE = "RES_PAYCARD_CUSTOMER_TYPE";// 不记名卡客户类型
	public static final String REQUEST_ORDER_INVOICE_TYPE = "REQUEST_ORDER_INVOICE_TYPE";
	public static final String REQUEST_ORDER_REQUIRE_INVOICE_STATE = "REQUEST_ORDER_REQUIRE_INVOICE_STATE";// 需求申请单状态类型
	public static final String REQUEST_ORDER_RETURN_INVOICE_STATE = "REQUEST_ORDER_RETURN_INVOICE_STATE";// 退货申请单状态类型
	public static final String REQUEST_ORDER_STORE_CHANGE_INVOICE_STATE = "REQUEST_ORDER_STORE_CHANGE_INVOICE_STATE";// 库存调整申请单状态类型
	public static final String REQUEST_ORDER_PERSON_REQUIRE = "REQUEST_ORDER_PERSON_REQUIRE";// 个人实物领用申请单状态类型
	public static final String REQUEST_ORDER_ORGANIZE_REQUIRE = "REQUEST_ORDER_ORGANIZE_REQUIRE";// 组织实物领用申请单状态类型
	public static final String REQUEST_ORDER_DTL_FEA_STATE = "REQUEST_ORDER_DTL_FEA_STATE";// 申请单实物审批状态
	public static final String REQUEST_ORDER_DTL_STATE = "REQUEST_ORDER_DTL_STATE";// 申请单实物发货状态
	public static final String REQUEST_ORDER_PERSON_INST_ORDER_TYPE = "REQUEST_ORDER_PERSON_INST_ORDER_TYPE";// 个人实物申请单主被动类型
	public static final String RES_OPER_ORDER_EVENT_TYPE = "RES_OPER_ORDER_EVENT_TYPE";// 操作工单配送类型
	public static final String OPER_ORDER_ALLOCATION_INVOICE_STATE = "OPER_ORDER_ALLOCATION_INVOICE_STATE";// 调拨通知单状态类型
	public static final String RES_USED_RECORD_TARGET_TYPE_ID = "RES_USED_RECORD_TARGET_TYPE_ID";// 证件类型
	public static final String OPER_ORDER_ORG_RETURN_INVOICE_STATE = "OPER_ORDER_ORG_RETURN_INVOICE_STATE";// 退货单状态
	public static final String SALES_OFFICE_RANK = "SALES_OFFICE_RANK";// 营业厅级别
	public static final String IO_TYPE = "IO_TYPE";// 出入库类型
	public static final String URGENT_LEVEL = "URGENT_LEVEL";// 发货紧急程度
	public static final String DISTR_METHOD = "DISTR_METHOD";// 配送方式
	public static final String REQUEST_ORDER_PERSON_RETURN = "REQUEST_ORDER_PERSON_RETURN";// 个人实物退货申请单状态类型
	public static final String REQUEST_ORDER_PERSON_RETURN_TYPE = "REQUEST_ORDER_PERSON_RETURN_TYPE";// 个人实物退货单主被动类型
	public static final String OPER_ORDER_NOTIFY_INVOICE_STATE = "OPER_ORDER_NOTIFY_INVOICE_STATE";// 配送通知单状态类型
	public static final String OPER_ORDER_RETURN_NOTIFY_INVOICE_STATE = "OPER_ORDER_RETURN_NOTIFY_INVOICE_STATE";// 配送通知单状态类型
	public static final String LOCAL_MAT = "LOCAL_MAT";// 本地、非本地库
	public static final String RES_BUSINESS_ID = "RES_BUSINESS_ID";// 资源操作 业务记录
	public static final String RES_ITEM_ID = "RES_ITEM_ID";// 发票打印RES_ITEM_ID值
	public static final String OPER_ORDER_CHANNEL_ORDER_INVOICE_STATE = "OPER_ORDER_CHANNEL_ORDER_INVOICE_STATE";// 渠道商订购单状态
	public static final String OPER_ORDER_CHANNEL_PAYFEE_INVOICE_STATE = "OPER_ORDER_CHANNEL_PAYFEE_INVOICE_STATE";// 渠道商订购单付费状态
	public static final String RES_SIM_REC_STATE = "RES_SIM_REC_STATE";// imsi生成状态
	public static final String RES_RICI_IS_CONFIRM = "RES_RICI_IS_CONFIRM"; // 号码NP状态，是否将RI、CI发送给NP
	public static final String RES_LIFECYCLE_STATUS_PHONE = "RES_LIFECYCLE_STATUS_PHONE"; // 号码生命周期
	public static final String RES_LIFECYCLE_STATUS_SIM = "RES_LIFECYCLE_STATUS_SIM"; // SIM卡生命周期
	public static final String RES_LIFECYCLE_STATUS_DEVICE = "RES_LIFECYCLE_STATUS_DEVICE"; // 终端生命周期
	public static final String RES_LIFECYCLE_STATUS_INVOICE = "RES_LIFECYCLE_STATUS_INVOICE"; // 发票生命周期
	public static final String RES_LIFECYCLE_STATUS_PAYCARD = "RES_LIFECYCLE_STATUS_PAYCARD"; // 有价卡生命周期
	public static final String RES_LIFECYCLE_STATUS_VOUCHER = "RES_LIFECYCLE_STATUS_VOUCHER"; // Voucher生命周期
	public static final String RES_LIFECYCLE_STATUS_COUPON = "RES_LIFECYCLE_STATUS_COUPON"; // COUPON生命周期
	public static final String RES_LIFECYCLE_STATUC_VIAPLAY_VOUCHER = "RES_LIFECYCLE_STATUC_VIAPLAY_VOUCHER";//VIAPLAY_VOUCHER生命周期
	public static final String RES_CENTER_OULET = "RES_CENTER_OULET"; // SAP中心库存 niucy
	public static final String RES_NUMBER_RICI = "RES_NUMBER_RICI"; // RICI gaoxd
	public static final String RES_STATIC_DATA_LIST = "RES_STATIC_DATA_LIST";// 获取资源静态数据下拉值 yezhi
	public static final String RES_EXPORT_STATE = "RES_EXPORT_STATE";// 资源导出下拉选项
	public static final String RES_EXPORT_DOCUMENT_FORMAT = "RES_EXPORT_DOCUMENT_FORMAT";// 资源导出文件的格式:1.TXT ，2.EXCEL
	public static final String RES_PHONE_MANAGE_CHANGE = "RES_PHONE_MANAGE_CHANGE";// 号码状态扭转规则
	public static final String RES_PHONE_PORT_STATUS = "RES_PHONE_PORT_STATUS";// 号码携转状态说明

	// ---------------------------------数据缓存类型 END ---------------------------------
	// 资源文件类型
	public static final String CFPC_SIM_ENTITY_CARD_FILES = "SIM_ENTITY_CARD_FILES";// SIM卡实体卡
	public static final String CFPC_SIM_REMOTE_CARD_FILES = "SIM_REMOTE_CARD_FILES";// SIM卡远程写卡
	public static final String RES_GSM_NUM = "GSM";// GSM手机号码
	public static final String RES_FIXED_NUM = "FIXED";// GSM手机号码

	// 资源大类
	public static final String RES_TYPE_PHONE = "10"; // 号码
	public static final String RES_TYPE_SIM = "11"; // SIM
	public static final String RES_TYPE_PAYCARD = "12"; // 有价卡
	public static final String RES_TYPE_INVOICE = "13"; // 票据
	public static final String RES_TYPE_SCORE = "14"; // 积分实物
	public static final String RES_TYPE_TRADEINST = "15"; // 营销实物
	public static final String RES_TYPE_RERMINAL = "16"; // 终端
	public static final String RES_TYPE_VOUCHER = "17"; // Voucher
	public static final String RES_TYPE_COUPON = "18"; // Coupon
	public static final String RES_TYPE_CHANNEL = "3"; // 渠道
	public static final String RES_TYPE_SAP = "90"; // RES_OPER_ORDER 专门给SAP接口用的，暂时存储SAP数据
	public static final String RES_TYPE_TASK = "91"; // RES_OPER_ORDER 专门给资源后台立即执行TASK用的，暂时存储TASK信息

	// ------------------------资源类别定义-------------------------------------
	public static final String RES_TYPE_GSM_NUM = "1000"; // GSM手机号码 ************ for Telenor
	public static final String RES_TYPE_FIX_NUM = "1001"; // FIXED号码 ************ for Telenor
	public static final String RES_TYPE_SERVICE_NUM = "1008"; // 服务号码：类似80 号码 ************ for Telenor
	public static final String RES_TYPE_RAILCOM_NUM = ""; // 铁通号码
	public static final String RES_TYPE_WIRELESS_NUM = ""; // 铁通号码 --请不要用这个变量！
	public static final String RES_TYPE_IOT_NUM = "1003"; // 物联网号码
	public static final String RES_TYPE_INDUSTRY_NUM = "1004"; // 行业应用号码
	public static final String RES_TYPE_ACCESS_NUM = "1005"; // 接入号码
	public static final String RES_TYPE_EARTH_NUM = "1006"; // 全球呼号码
	public static final String RES_TYPE_GROUP_NUM = ""; //
	public static final String RES_TYPE_PARTERN_NUM = "1007"; // 副卡号码
	public static final String RES_TYPE_IMS_NUM = "1009"; // IMS号码

	// ------------------------资源规格定义-------------------------------------
	public static final String RES_SPEC_GSM_NUM = "100001"; // Normal GSM手机号码 ---For Telenor
	public static final String RES_SPEC_FIXED_NUM = "100105"; // Normal Fixed号码 ---For Telenor
	public static final String RES_SPEC_RESOLD_NUM = "100107"; // Resold 号码 (开PSTN业务，但是没有真正携入系统)---For Telenor
	public static final String RES_SPEC_PRESELECT_NUM = "100108"; // Preselect 号码---For Telenor
	public static final String RES_SPEC_OST_NUM = "100008"; // 批开OTS GSM号码 ---For Telenor
	public static final String RES_SPEC_188_NUM = "100002"; // 188手机号码
	public static final String RES_SPEC_IOT_NUM = "100301"; // 物联网
	public static final String RES_SPEC_IMS_NUM = "100901"; // IMS
	public static final String RES_SPEC_WIRELESS_NUM = "100007"; // 无线铁通号码（无线固话号码）
	public static final String RES_SPEC_FIX_NUM = "100009"; // 有线铁通固话号码 （家庭固话卡号码）
	public static final String RES_SPEC_INDUSTRY_NUM = "100401"; // 行业应用号码
	public static final String RES_SPEC_ACCESS_NUM = "100501"; // 接入号码
	public static final String RES_NO_PHONE_TYPE_ROLE = "RES_NO_PHONE_TYPE_ROLE"; // 接入号码
	public static final String RES_SPEC_GROUP_NUM_41 = "100841"; // DID号码（外乎铁通号）
	public static final String RES_SPEC_RANDOM_CHANGE_SIM = "200030"; // 号码随意换
	public static final String RES_SPEC_VIRTUAL_SIM_CARD = "3000000"; // 号码随意换
	public static final String RES_SPEC_VOICE_MAIL_NUM = "100021"; // Voice Mail number
	public static final String RES_SPEC_MULTI_SIM_NUM = "100090"; // Double SIM number
	public static final String RES_SPEC_GSM_NUM_12_DIGITS = "100020"; // Mobile Numbers 12 Digits
	
	public static final String RES_SPEC_HU_SIM_CARD = "1300100"; // HU OTS批开号码规格

	public static final String VOICE_SIM_TYPE_ID = "2000"; // 普通SIM卡：Ordinary SIM Card
	public static final String DATA_SIM_TYPE_ID = "2001"; // 数据SIM卡
	public static final String PREPAID_SIM_TYPE_ID = "2002";// 预付费SIM卡 :Prepaid Card
	public static final String M2M1_SIM_TYPE_ID = "2003";// M2M1 SIM卡: M2M Card
	public static final String M2M2_SIM_TYPE_ID = "2004";// M2M2 SIM卡
	public static final String M2M3_SIM_TYPE_ID = "2005";// M2M3 SIM卡

	// ------------------------资源模块业务模块类型编码----------------------------------
	public static final String CODE_TYPE_RES_CFG = "85010"; // 资源配置管理模块
	public static final String CODE_TYPE_NUM_MGR = "85001"; // 号码管理模块
	public static final String CODE_TYPE_SIM_MGR = "85003"; // SIM卡管理模块
	public static final String CODE_TYPE_REGION_SMSP = "85009"; // RES_REGION_SMSP

	// 渠道订购资源状态
	public static final int CHANNEL_REC_STATUS_1 = 1; // 批发
	public static final int CHANNEL_REC_STATUS_2 = 2; // 实占
	public static final int CHANNEL_REC_STATUS_3 = 3; // 已激活
	public static final int CHANNEL_REC_STATUS_4 = 4; // 备用
	public static final int CHANNEL_REC_STATUS_5 = 5; // 已退货
	// 渠道标记
	public static final String RES_CHANNEL_NORMAL = "1"; // 营业前台
	public static final String RES_CHANNEL_NET = "4"; // 网厅
	public static final String RES_CHANNEL_SELF_SERV = "26"; // 自助终端
	public static final String RES_CHANNEL_SKY_SEL = "51"; // 空中选号

	// 仓库归属类型
	public static final String STORE_ATTACH_TYPE_0 = "0"; // 组织仓库
	public static final String STORE_ATTACH_TYPE_2 = "2"; // 个人仓库

	// 共享仓库权限类型
	public static final String STORE_OPER_RULE_VIEW = "1"; // 可查看
	public static final String STORE_OPER_RULE_USE = "2"; // 可使用（预占、实占）
	public static final String STORE_OPER_RULE_OPERATE = "3"; // 可操作（调配、下发、收回）

	// 仓库类型
	public static final String STORE_TYPE_BASE = "0"; // 总仓库
	public static final String STORE_TYPE_PHONE = "1"; // 号码仓库
	public static final String STORE_TYPE_SIMCARD = "2"; // sim卡仓库
	public static final String STORE_TYPE_VIRTUAL = "3"; // 虚拟仓库
	public static final String STORE_TYPE_SHARE = "4"; // 共享仓库

	// 资源订单管理
	public static final String OPER_ORDER_MANAGE_0 = "0"; // 初始
	public static final String OPER_ORDER_MANAGE_1 = "1"; // 不可取消
	public static final String OPER_ORDER_MANAGE_2 = "2"; // 已经取消

	// ---------------------仓库状态----------------------------------
	public static final String STORE_STATE_U = "U"; // 仓库可用
	public static final String STORE_STATE_N = "N"; // 仓库未用

	// ---------------------资源通用状态----------------------------------
	public static final String RES_STATE_EXPIRE = "0"; // 无效
	public static final String RES_STATE_EFFECTIVE = "1"; // 有效

	// ---------------------资源类型状态----------------------------------
	public static final String RES_STATE_U = "U"; // 有效
	public static final String RES_STATE_E = "E"; // 无效

	// ---------------------库存类型----------------------------------
	public static final String LOCAL_MAT_0 = "0"; // 本地库
	public static final String LOCAL_MAT_1 = "1"; // 非本地库

	// ---------------------目标库类型----------------------------------
	public static final String TARGET_STORE_TYPE_0 = "0"; // 【0】可用库
	public static final String TARGET_STORE_TYPE_1 = "1"; // 【1】在途库

	// ---------------------出入库类型----------------------------------
	public static final String IO_TYPE_0 = "0"; // 【0】出库
	public static final String IO_TYPE_1 = "1"; // 【1】入库

	/**************************************** SIM卡管理 BEG **************************************************/
	// SIM卡管理状态
	public static final String SIM_MANAGE_STATUS_1 = "1"; // 1 初始 Open
	public static final String SIM_MANAGE_STATUS_2 = "2"; // 2 开放 Released
	public static final String SIM_MANAGE_STATUS_3 = "3"; // 3 选中 Selected
	public static final String SIM_MANAGE_STATUS_4 = "4"; // 4 Telenor 项目暂未使用
	public static final String SIM_MANAGE_STATUS_5 = "5"; // 5 占用 Occupied
	public static final String SIM_MANAGE_STATUS_6 = "6"; // 6 冷冻 Deactivated
	public static final String SIM_MANAGE_STATUS_7 = "7"; // 7 报废 Wasted
	public static final String SIM_MANAGE_STATUS_8 = "8"; // 8 Telenor 项目暂未使用
	public static final String SIM_MANAGE_STATUS_9 = "9"; // 9 出库 Stock-Out
	public static final String SIM_MANAGE_STATUS_11 = "11"; // 11待制卡 Preparing Manufacturing
	public static final String SIM_MANAGE_STATUS_12 = "12"; // 12 空闲 free
	public static final String SIM_MANAGE_STATUS_13 = "13"; // 13 已制卡 Manufactured

	/***************************** 丹麦制卡流程 相关静态值 *************************************/
	public static final String RES_OPERATOR_CODE = "RES_OPERATOR_CODE"; // 从RES_STATIC_DATA表中获取 运营商编码
	public static final String RES_IMSI_TYPE = "RES_IMSI_TYPE"; // 根据IMSI_TYPE获取对应哪一个运营商
	public static final String RES_IMSI_RANGE = "RES_IMSI_RANGE"; // 这个数字配置在 RES_STATIC_DATA_XX 中，目前只有一个值 99
	public static final String RES_OPERATOR_INFO = "RES_OPERATOR_INFO"; // 同步虚拟运营商的编号
	public static final String RES_OPERATOR_FOR_GENERATION = "RES_OPERATOR_FOR_GENERATION"; // 号码生成页面用来选择OP CPS

	public static final String ICC_HEAD_DK = "89450201"; // 丹麦ICC号头
//	public static final String ICC_TAIL_DK = "0F"; // 丹麦ICC 的尾巴
	public static final String IMSI_HEAD_DK = "23802"; // 丹麦IMSI号头

	//ICC和IMSI的状态：涉及RES_SIM_ICCID、RES_SIM_IMSI 
	public static final String RES_SIM_DEAL_STATUS_AVA = "0"; // 0 OPEN   ICC\IMSI刚刚生成时的状态
	public static final String RES_SIM_DEAL_STATUS_BOUND = "1"; // 1 AVA    ICCID、IMSI相互绑定后的状态
	public static final String RES_SIM_DEAL_STATUS_IN_USED = "2"; // 2 IN_USED   已经生成input文件后的状态
	
	/***************************** 丹麦PO File 格式 *************************************/
	public static final String DENMARK_PO_FILE_BATCH_ID = "BATCH_ID";
	public static final String DENMARK_PO_FILE_PO_NUMBER = "PO_NUMBER";
	public static final String DENMARK_PO_FILE_PO_ITEM_NUMBER = "PO_ITEM_NUMBER";
	public static final String DENMARK_PO_FILE_ARTICLE_NUMBER = "ARTICLE_NUMBER"; // 物料号
	public static final String DENMARK_PO_FILE_REQUIRED_QUANTITY = "REQUIRED_QUANTITY";
	public static final String DENMARK_PO_FILE_BIND_FLAG = "BIND_FLAG";
	public static final String DENMARK_PO_FILE_COUNTRY_CODE = "COUNTRY_CODE";
	public static final String DENMARK_PO_FILE_SIM_PROFILE = "SIM_PROFILE";
	public static final String DENMARK_PO_FILE_ARTWORK = "ARTWORK";
	public static final String DENMARK_PO_FILE_IMSI_TYPE = "IMSI_TYPE";
	public static final String DENMARK_PO_FILE_SIM_TYPE = "SIM_TYPE";
	public static final String DENMARK_PO_FILE_SUPPLIER_ID = "SUPPLIER_ID";
	public static final String DENMARK_PO_FILE_APPLICATION_ID = "APPLICATION_ID";
	public static final String DENMARK_PO_FILE_IMSI_HLR_CODE = "IMSI_HLR_CODE";
	public static final String DENMARK_PO_FILE_SPECIAL_INDICATOR = "SPECIAL_INDICATOR";
	
	// 丹麦PO File新字段
	public static final String DENMARK_PO_FILE_CPS_CODE = "CPS_CODE";
	public static final String DENMARK_PO_FILE_KDB_ID = "KDB_ID";
	public static final String DENMARK_PO_FILE_ALGO_ID = "ALGO_ID";
	public static final String DENMARK_PO_FILE_AB = "AB";  //Only for HU

	/***************************** 丹麦Output File 格式 *************************************/
	public static final String OUTPUT_FILE_HEADER_ID = "HEADER_ID";
	public static final String OUTPUT_FILE_COUNTRY_CODE = "COUNTRY_CODE";
	public static final String OUTPUT_FILE_ARTICLE_NUMBER = "ARTICLE_NUMBER";// 物料号
	public static final String OUTPUT_FILE_DELIVERED_QTY = "DELIVERED_QTY";
	public static final String OUTPUT_FILE_PO_NUMBER = "PO_NUMBER";
	public static final String OUTPUT_FILE_PO_ITEM_NUMBER = "PO_ITEM_NUMBER";
	public static final String OUTPUT_FILE_ITEM_ID = "ITEM_ID";
	public static final String OUTPUT_FILE_ITEM_NUMBER = "ITEM_NUMBER";
	public static final String OUTPUT_FILE_EQUIPMENT_NUMBERS = "EQUIPMENT_NUMBERS"; // 就是ICC_ID
	public static final String OUTPUT_FILE_ACTIVATION_TYPE = "ACTIVATION_TYPE";
	public static final String OUTPUT_FILE_IMSI = "IMSI";
	public static final String OUTPUT_FILE_ACCESS_CONTROL = "ACCESS_CONTROL";
	public static final String OUTPUT_FILE_PIN1 = "PIN1";
	public static final String OUTPUT_FILE_PUK1 = "PUK1";
	public static final String OUTPUT_FILE_PIN2 = "PIN2";
	public static final String OUTPUT_FILE_PUK2 = "PUK2";
	public static final String OUTPUT_FILE_CODE_ADM = "CODE_ADM";
	public static final String OUTPUT_FILE_KI = "KI";

	public static final String SAP_FILE_TYPE_PO = "1"; // RES_SIM_BATCH.FILE_TYPE 表示PO file
	public static final String SAP_FILE_TYPE_OUTPUT = "2"; // RES_SIM_BATCH.FILE_TYPE 表示Output file
	public static final String SAP_FILE_TYPE_ORDER = "3"; // SAP_FILE_TYPE_ORDER 表示订单批开文件
	public static final String COUPON_FILE_TYPE_ORDER = "4"; // Coupon更新文件
	public static final String Viaplay_Voucher_Type = "6";//Viaplay Voucher文件
    public static final String  RES_NUMBER_DEFINE ="7";//portin号码上传
	// PO file 文件操作状态
	public static final String PO_FILE_STATUS_INITIAL = "0"; // 文件录入数据库，文件状态为：Initial
	public static final String PO_FILE_STATUS_ANALYSED = "1"; // Task获取Init状态的文件，解析文件内容，将头文件字段录入属性表。文件状态为：Analysed
	public static final String PO_FILE_STATUS_BINDED = "2"; // Task获取Generated的数据，生成ICCID和IMSI数据，绑定ICCID、IMSI或MSISDN。文件状态为：Binded
	public static final String PO_FILE_STATUS_SUCCSEE = "3"; // Task获取Binded状态的文件，生成Input file。文件状态为：Success
	public static final String PO_FILE_STATUS_FAILED = "9"; // 若过程有失败，则状态为失败：Fail 。 需要自动触发流程，通知SAP侧人员PO文件错误

	// Output file 文件操作状态
	public static final String OUTPUT_FILE_STATUS_INITIAL = "0"; // 文件录入数据库， 文件状态为：Initial
	public static final String OUTPUT_FILE_STATUS_SUCCSEE = "3"; // Task获取Binded状态的文件，生成Input file。文件状态为：Success
	public static final String OUTPUT_FILE_STATUS_FAILED = "9"; // 若过程有失败，则状态为失败：Fail 。 需要自动触发流程，通知SAP侧人员PO文件错误

	public static final String ACTIVATION_TYPE_W = "W"; // W’ - wait with the activation
	public static final String ACTIVATION_TYPE_1 = "1"; // 1’ – universal
	public static final String ACTIVATION_TYPE_2 = "2"; // 2’ – off-the shelf
	public static final String ACTIVATION_TYPE_3 = "3"; // 3’ – pre-activated
	
	// SIM卡WRITE_TYPE状态
	public static final String SIM_RES_STATUS_1 = "1"; // 1 未写卡
	public static final String SIM_RES_STATUS_2 = "2"; // 2 正写卡
	public static final String SIM_RES_STATUS_3 = "3"; // 3 写卡成功
	public static final String SIM_RES_STATUS_4 = "4"; // 4 写卡失败
	public static final String SIM_RES_STATUS_5 = "5"; // 5 已开通
	public static final String SIM_RES_STATUS_6 = "6"; // 6 换卡回收

	// SIM卡是否为备卡
	public static final String SIM_IS_BAK_CARD_1 = "1"; // 1 不是备卡
	public static final String SIM_IS_BAK_CARD_2 = "2"; // 2 是备卡

	// SIM卡批次管理状态
	public static final String SIM_BATCH_MANAGE_STATUS_1 = "1"; // 1 未送鉴权
	public static final String SIM_BATCH_MANAGE_STATUS_2 = "2"; // 2 已送鉴权

	// SIM卡KI登录状态 IS_KI_LOGIN
	public static final String SIM_IS_KI_LOGIN_0 = "0"; // 0 未登录
	public static final String SIM_IS_KI_LOGIN_1 = "1"; // 1 已登录

	// SIM卡鉴权状态
	public static final String SIM_PS_STATUS_1 = "1"; // 1 未鉴权
	public static final String SIM_PS_STATUS_2 = "2"; // 2 鉴权成功
	public static final String SIM_PS_STATUS_3 = "3"; // 3 鉴权失败

	// SIM卡数据类型
	public static final String SIM_CARD_DATA_TYPE_1 = "1"; // 1 批量制卡
	public static final String SIM_CARD_DATA_TYPE_2 = "2"; // 2 远程写卡

	// SIM卡使用类型
	public static final int SIM_CARD_USE_TYPE_1 = 1; // 1 营业用
	public static final int SIM_CARD_USE_TYPE_2 = 2; // 2 代销用

	// SIM卡制卡类型
	public static final String SIM_CARD_MAKE_TYPE_1 = "1"; // 1 普通SIM卡
	public static final String SIM_CARD_MAKE_TYPE_2 = "2"; // 2 TD USIM卡

	// SIM卡归属域类型
	public static final String SIM_DOMAIN_TYPE_1 = "1"; // 1 集团公司
	public static final String SIM_DOMAIN_TYPE_2 = "2"; // 2 省公司

	// ------------------------SIM卡管理业务操作代码-------------------------------------
	public static final String SIM_MGR_BUSI_ID_1 = "900016"; // SIM卡入库
	public static final String SIM_MGR_BUSI_ID_2 = "900017"; // SIM卡地市间发放
	public static final String SIM_MGR_BUSI_ID_3 = "900018"; // SIM卡接收\SIM卡调配
	public static final String SIM_MGR_BUSI_ID_4 = "900019"; // SIM卡收回
	public static final String SIM_MGR_BUSI_ID_5 = "900020"; // SIM卡删除
	public static final String SIM_MGR_BUSI_ID_6 = "900021"; // SIM卡修改
	public static final String SIM_MGR_BUSI_ID_7 = "900022"; // SIM卡返库
	public static final String SIM_MGR_BUSI_ID_8 = "900023"; // SIM卡批量送鉴权
	public static final String SIM_MGR_BUSI_ID_9 = "900024"; // SIM卡回收
	public static final String SIM_MGR_BUSI_ID_10 = "900027";// SIM卡销售、营业开户占用
	public static final String SIM_MGR_BUSI_ID_11 = "900028"; // SIM卡省库-地市发放
	public static final String SIM_MGR_BUSI_ID_12 = "900029"; // SIM卡 冷冻
	public static final String SIM_MGR_BUSI_ID_13 = "900030"; // 空白卡下发
	public static final String SIM_MGR_BUSI_ID_14 = "900031"; // SIM卡丢失赔偿
	public static final String SIM_MGR_BUSI_ID_15 = "900032"; // 手动绑定ICCID、IMSI、MSISDN
	public static final String SIM_MGR_BUSI_ID_16 = "900033"; // SIM卡配送，调用SAP接口发送SIM卡数据
	public static final String SIM_MGR_BUSI_ID_17 = "900034"; // SIM卡预占取消
	public static final String SIM_MGR_BUSI_ID_18 = "900035"; // SIM卡实占取消
	public static final String SIM_MGR_BUSI_ID_19 = "900036"; // SIM卡预销户重入网
	public static final String SIM_MGR_BUSI_ID_20 = "900037"; // SIM卡预占
	public static final String SIM_MGR_BUSI_ID_21 = "900038"; // SIM卡预销户冷冻
	public static final String SIM_MGR_BUSI_ID_22 = "900039"; // SIM卡换卡(旧卡释放)
	public static final String SIM_MGR_BUSI_ID_23 = "900040"; // SIM卡换卡(新卡实占)
	public static final String SIM_MGR_BUSI_ID_24 = "900041"; // SIM卡换卡

	// 资源 FTP 配置
	public static final String FTP_PATH_CODE_0 = ""; // ************ for Telenor
	public static final String FTP_PATH_CODE_1 = "RES_PO_DOWNLOAD";// 从SAP服务器上获取PO fileFTP配置 ************ for Telenor
	public static final String FTP_PATH_CODE_2 = "RES_OUTPUT_DOWNLOAD";// 从SAP服务器上获取Output fileFTP配置 ************ for Telenor
	public static final String FTP_PATH_CODE_3 = "RES_PO_ANALYSIS";// PO文件分析************ for Telenor
	public static final String FTP_PATH_CODE_4 = "RES_OUTPUT_ANALYSIS";// Output文件分析************ for Telenor
	public static final String FTP_PATH_CODE_5 = "RES_INPUT_UPLOAD";// Input文件上传************ for Telenor
	public static final String FTP_PATH_CODE_6 = "RES_ACTIVATION_STATUS";// ActivationStatus 文件上传
	public static final String FTP_PATH_CODE_7 = "RES_SIM_UPLOAD_PO_PATH";// 页面上传PO文件待解析 ************ for Telenor
	public static final String FTP_PATH_CODE_8 = "RES_SIM_UPLOAD_OUTPUT_PATH";// 页面上传Output文件待解析 ************ for Telenor
	public static final String FTP_PATH_CODE_20 = "SAP_SIM_FILE_TYPE_ORDER";// 页面上传订单批开文件 ************ for HU
	public static final String FTP_PATH_CODE_21 = "RES_COUPON_GEN_FTP_PATH";// Coupon生成文件 ************ for HU
	public static final String FTP_PATH_CODE_22 = "RES_COUPON_ANALYSIS_FTP_PATH";// Coupon解析文件 ************ for HU
	public static final String FTP_PATH_CODE_23 = "RES_VIAPLAY_DOWNLOAD";// ViaPlay voucher文件下载 ************ for DK
	public static final String FTP_PATH_CODE_24 = "RES_VIAPLAY_ANALYSIS";// ViaPlay voucher文件解析 ************ for DK
	public static final String FTP_PATH_CODE_25 = "RES_NUMBER_DEFINE";// 离散号码文件解析 ************ for DK
	// 资源91环境 FTP 配置  -- 专门为 2015年11月份上线使用
	public static final String FTP_PATH_CODE_91_1 = "RES_WS_PO_DOWNLOAD";// 从SAP服务器上获取PO fileFTP配置 ************ for Telenor
	public static final String FTP_PATH_CODE_91_2 = "RES_WS_OUTPUT_DOWNLOAD";// 从SAP服务器上获取Output fileFTP配置 ************ for Telenor
	public static final String FTP_PATH_CODE_91_3 = "RES_WS_PO_ANALYSIS";// PO文件分析************ for Telenor
	public static final String FTP_PATH_CODE_91_4 = "RES_WS_OUTPUT_ANALYSIS";// Output文件分析************ for Telenor
	public static final String FTP_PATH_CODE_91_5 = "RES_WS_INPUT_UPLOAD";// Input文件上传************ for Telenor
	public static final String FTP_PATH_CODE_91_6 = "RES_WS_ACTIVATION_STATUS";// ActivationStatus 文件上传
	public static final String FTP_PATH_CODE_91_7 = "RES_WS_SIM_UPLOAD_PO_PATH";// 页面上传PO文件待解析 ************ for Telenor
	public static final String FTP_PATH_CODE_91_8 = "RES_WS_SIM_UPLOAD_OUTPUT_PATH";// 页面上传Output文件待解析 ************ for Telenor
	
	public static final String FTP_PATH_CODE_D7 = "RES_GROUP_CARD_UPLOAD";// 集团实物营销卡FTP上传配置
	public static final String FTP_PATH_CODE_D8 = "RES_GROUP_CARD_HISFILE_UPLOAD";// 集团实物营销卡FTP上传配置
	public static final String FTP_PATH_CODE_9 = "RES_GROUP_WLAN_CARD_PATH"; // 集团WLanCard信息FTP下载配置
	public static final String FTP_PATH_CODE_10 = "RES_PHONE_NUM_CALLBACK"; // 号码回收FTP路径
	public static final String FTP_PATH_CODE_11 = "RES_SIM_SALE_PATH"; // SIM卡销售信息FTP路径
	public static final String FTP_PATH_CODE_12 = "RES_PHONE_NUM_MODE"; // 号码选号费模式信息FTP下载更新
	public static final String FTP_PATH_CODE_15 = "RES_SIM_CARD_WHOLESALE";// wholesale生成SIM卡数据文件，用于转移至91系统 ************ for Telenor
	public static final String FTP_PATH_CODE_16 = "RES_VOUCHER_GENERATION";// voucher生成 ************ for Telenor
	public static final String FTP_PATH_CODE_17 = "RES_EXPORT_EXCEL_FTP_PATH";// 导出Excel的TASK使用 ************ for Telenor
	public static final String FTP_PATH_CODE_18 = "RES_EXPORT_EXCEL_FTP_PATH_91";// 导出report Excel的TASK使用 ************ for Telenor
	public static final String FTP_PATH_CODE_19 = "RES_WS_CUSTINFO_FTP_PATH";// wholesale客户信息报表下载使用 ************ for Telenor
	
	// USIM卡文件类型
	public static final String USIM_FILE_TYPE_1 = CrmLocaleFactory.getResource("RSS0008304"); // 业务文件
	public static final String USIM_FILE_TYPE_2 = CrmLocaleFactory.getResource("RSS0008305"); // 鉴权文件

	// SIM卡数据类型
	public static final String SIM_CARD_DATA_TYPE_NAME_1 = CrmLocaleFactory.getResource("RSS0008306"); // 1 批量制卡
	public static final String SIM_CARD_DATA_TYPE_NAME_2 = CrmLocaleFactory.getResource("RSS0008307"); // 2 远程写卡

	// base.bp_template表中TEMPLATE_CODE字段给资源用的。用于上传批开文件
	public static final String BP_RES_TEMPLATE_CODE_01 = "BATCH_RES_CONNECTION_"; // niucy
	public static final String BP_RES_TEMPLATE_CODE_02 = "BATCH_RES_CONNECTION_"; // niucy

	/**************************************** SIM卡管理 END **************************************************/
	
	/**************************************** 内部需求：号码重新预占/预留到指定客户使用 BEG **************************************************/
	public static final String AGEING_NUMBER_RECYCLE_START_BUSI_CODE = "900350";	//冷号回收发起
	public static final String AGEING_NUMBER_RECYCLE_SUCCESS_BUSI_CODE = "900351";	//冷号回收成功
	
	public static final String AGEING_NUMBER_RECYCLE_START_BUSI_CODE_NAME = "Ageing Number Recycle Begin";
	public static final String AGEING_NUMBER_RECYCLE_SUCCESS_BUSI_CODE_NAME = "Ageing Number Recycle Success";
	
	public static final String PAGE_FLAG_CORRECT_DATA_PAGE = "correctDataPage";//correct data page页面
	public static final String PAGE_FLAG_RESERVE_AGEING_NUMBER_TO_CUSTOMER = "ReserveAgeingNumberToCustomer";//Reserve Ageing Number To Customer页面
	/**************************************** 内部需求：号码重新预占/预留到指定客户使用 END **************************************************/

	/**************************************** 号码管理 BEG **************************************************/
	// -------------------------------------号码管理状态-----------------------------------------------
	public static final String PHONE_MANAGE_STATUS_OPEN = "1"; // 1 Open [OPE]空号
	public static final String PHONE_MANAGE_STATUS_ACTIVE = "2"; // 2 Available [AVA]可售
	public static final String PHONE_MANAGE_STATUS_PREOCCUPY = "3"; // 3 预占 普通预占（页面正常预占包括B2C、B2B） Temporarily Reserved
	public static final String PHONE_MANAGE_STATUS_RESERVE = "4"; // 4 预留 B2B预占 Reserved
	public static final String PHONE_MANAGE_STATUS_OCCUPY = "5"; // 5 实占 In-Used
	public static final String PHONE_MANAGE_STATUS_AGEING = "6"; // 6 冷冻 Ageing
	public static final String PHONE_MANAGE_STATUS_ABOLISH = "7"; // 7 作废 Deserted [DES] PSTN号码销户后状态
	public static final String PHONE_MANAGE_STATUS_LOCKED = "8"; // 8 号码查询锁定状态 Locked
	public static final String PHONE_MANAGE_STATUS_IN_TRANSIT = "9"; // 9 出库 Stock-Out
	public static final String PHONE_MANAGE_STATUS_BOL = "10"; // 10 Block [BOL]号码回收后：阻塞
	public static final String PHONE_MANAGE_STATUS_INITIAL = "20"; // 20 Selected [SEL]号码生成初始状态
	public static final String PHONE_MANAGE_STATUS_UAS = "21"; // 21 Under Assignment [UAS]待分配
	public static final String PHONE_MANAGE_STATUS_UCA = "22"; // 22 Under Cancel Assignment [UCA]待取消分配
	public static final String PHONE_MANAGE_STATUS_CAS = "23"; // 23 Canceled Assignment [CAS]已取消分配
	public static final String PHONE_MANAGE_STATUS_BIN = "24"; // 24 Binded [BIN]手机号码已经和SIM卡绑定等待SIM卡发给制卡商
	public static final String PHONE_MANAGE_STATUS_PAC = "25"; // 25 Pre-activated [PAC]预激活的后付费卡
	public static final String PHONE_MANAGE_STATUS_UDE = "26"; // 26 Under Delete 待删除

	// ---------------------号码规格适用范围，用来标识B2C、B2B号码段-------------------------------
//	public static final String PHNOE_USE_RANGE_BOTH = "0";// 同时for B2C、B2B的号码
	public static final String PHNOE_USE_RANGE_B2C = "1";// 非号段号码
	public static final String PHONE_USE_RANGE_B2B = "2";// 号段号码

	public static final String NP_NUMBER = "NP";// PSTN 号码携入 时候号码头 标识

	// 携号转网状态 号码表：PORT_STATUS
	public static final String PORT_STATUS_INTERNAL_INIT = "10"; // 10本网号码：初始 INIT
	public static final String PORT_STATUS_INTERNAL_UPO = "11"; // 11本网号码：待携出 Under Port Out [UPO]
	public static final String PORT_STATUS_INTERNAL_POU = "12"; // 12本网号码：已经携出 Ported Out [POU]
	public static final String PORT_STATUS_INTERNAL_UPI = "13"; // 13本网号码：待携入 Under Port In [UPI]
	public static final String PORT_STATUS_INTERNAL_ERROR_OUT = "14"; // 14本网号码：错误携出 Error Port Out
	public static final String PORT_STATUS_INTERNAL_PRE_PIN = "15"; // 15本网号码：预携入 Pre Port In [UPI]

	public static final String PORT_STATUS_EXTERNAL_INIT = "20"; // 20他网号码：初始 External INIT
	public static final String PORT_STATUS_EXTERNAL_UPO = "21"; // 21他网号码：待携出 External Under Port Out [UPO]
	public static final String PORT_STATUS_EXTERNAL_POU = "22"; // 22他网号码：已经携出 External Ported Out [POU]
	public static final String PORT_STATUS_EXTERNAL_UPI = "23"; // 23他网号码：待携入 External Under Port In [UPI]
	public static final String PORT_STATUS_EXTERNAL_PIN = "24"; // 24他网号码：已经携入 External Ported In [PIN]
	public static final String PORT_STATUS_EXTERNAL_ERROR = "25"; // 25他网号码：携转入错误 External Error Ported In （中间状态）
	public static final String PORT_STATUS_EXTERNAL_REGRET = "26"; // 26他网号码：携转入反悔 External REGRET Ported In（中间状态）
	public static final String PORT_STATUS_EXTERNAL_RESOLD = "27"; // 27他网号码：转售业务 External Resold （中间状态）
	public static final String PORT_STATUS_EXTERNAL_RETURN = "28"; // 28他网号码：返回 External Returned
	public static final String PORT_STATUS_EXTERNAL_PRESEL = "29"; // 29他网号码：专门 External Preselect的号码
	public static final String PORT_STATUS_EXTERNAL_ERROR_OUT = "30"; // 30他网号码：错误携出 External Error Port Out
	public static final String PORT_STATUS_EXTERNAL_RETURN_UNDER = "31"; // 携入号码Return初始 External Under Return
	public static final String PORT_STATUS_EXTERNAL_RETURN_ERROR = "32"; // 携入号码Return失败 External Return Error

	public static final String PORT_STATUS_IN = "1"; // 1他网号码：场景说明：携转入

	public static final String PORT_STATUS_INTERNAL = "1"; // 1*本网号码.携转状态头
	public static final String PORT_STATUS_EXTERNAL = "2"; // 2*他网号码.携转状态头

	// ------------------------- 选号记录表，号码归属关系 -------------------------
	public static final long PHONE_RELA_TYPE_USER = 1; // user 1.使用者
	public static final long PHONE_RELA_TYPE_OWNER = 2; // owner 2.拥有者
	public static final long PHONE_RELA_TYPE_ALL = 3; // all 3.既是使用者也是拥有者

	// ------------------------- 选号记录表状态 -------------------------
	public static final int SEL_CUST_LOG_CANCEL = 0; // 0已取消
	public static final int SEL_CUST_LOG_RESERVE = 1; // 1初始
	public static final int SEL_CUST_LOG_HANDLED = 2; // 2已经受理提交待实占--Telenor项目，预占号码受理提交后，尚未真正实占时候的状态（中间状态）
	public static final int SEL_CUST_LOG_REENTRY_RESERVE = 3; // 3重入网预占
	public static final int SEL_CUST_LOG_OCCPUY = 4; // 4 已开通(实占)
	public static final int SEL_CUST_LOG_SELECT = 5; // 5 号码选中

	// ---------------------号码回收规则状态位-------------------------------
	public static final int PHONE_RECYCLE_INVALID = 0; // 回收规则无效
	public static final int PHONE_RECYCLE_VALID = 1; // 回收规则有效

	// 号码发送NP 告知RICI信息情况 号码表 IS_CONFIRM 字段
	public static final int PHONE_RICI_INIT = 0; // 尚未发送NP
	public static final int PHONE_RICI_SENDING = 1; // 正在发送NP
	public static final int PHONE_RICI_SUCCESS = 2; // 发送NP成功
	public static final int PHONE_RICI_FAILED = 3; // 发送NP失败

	// ---------------------号码资源状态-------------------------------
	public static final String PHONE_RES_STATUS_0 = "0"; // 0-未匹配未开通（号码实销后，也是这个状态）
	public static final String PHONE_RES_STATUS_1 = "1"; // 1-已匹配未开通
	public static final String PHONE_RES_STATUS_2 = "2"; // 2-已匹配已开通
	public static final String PHONE_RES_STATUS_3 = "3"; // 3-预销户状态

	// ------------------------资源预占类型--------------------------------------
	public static final String RES_LOCK_TYPE_0 = "0"; // 0——营业厅普通开户预占  *******（for Telenor）
	public static final String RES_LOCK_TYPE_1 = "1"; // 1——网上选号--15天  *******（for Telenor OSE）
	public static final String RES_LOCK_TYPE_2 = "2"; // 2——自助选号预占-- 1天
	public static final String RES_LOCK_TYPE_3 = "3"; // 3——电子商务选号预占----4天
	public static final String RES_LOCK_TYPE_4 = "4"; // 4——重入网预占
	public static final String RES_LOCK_TYPE_5 = "5"; // 5——号码查询预占  *******（for Telenor）
	public static final String RES_LOCK_TYPE_6 = "6"; // 6——手机终端预占
	public static final String RES_LOCK_TYPE_7 = "7"; // 7——有价卡预占
	public static final String RES_LOCK_TYPE_8 = "8"; // 8——物品预占
	public static final String RES_LOCK_TYPE_9 = "9"; // 9——吉祥号码审批预占 8天
	public static final String RES_LOCK_TYPE_10 = "10"; // 10——集团扩展码预占时长
	public static final String RES_LOCK_TYPE_11 = "11"; // 11——免费资源预占
	public static final String RES_LOCK_TYPE_12 = "12"; // 12——SIM卡预占
	public static final String RES_LOCK_TYPE_13 = "13"; // 13——退号封存
	public static final String RES_LOCK_TYPE_14 = "14"; // 14——预提号批发预占时长
	public static final String RES_LOCK_TYPE_15 = "15"; // 15——有线固话号码新装普通预占时长
	public static final String RES_LOCK_TYPE_16 = "16"; // 16——批量有线固话号码新装预占时长
	public static final String RES_LOCK_TYPE_17 = "17"; // 17——渠道号码包预约预占时长
	public static final String RES_LOCK_TYPE_18 = "18"; // 18——营业厅长流程开户预占时长
	public static final String RES_LOCK_TYPE_19 = "19"; // 19——有线固话号码新装长流程预占时长
	public static final String RES_LOCK_TYPE_20 = "20"; // 20——行业应用号码开户预占时长
	public static final String RES_TRADE_TYPE_FAXNUMBER = "21"; // 21——传真号码实占类型
	public static final String RES_LOCK_TYPE_22 = "22"; // 22——携号转入号码预占时长   *******（for Telenor）
	public static final String RES_LOCK_TYPE_90 = "90"; // 90—— B2B购买号码，客户在网预占到期2099，潜在变成三个月后  *******（for Telenor）
	public static final String RES_LOCK_TYPE_91 = "91"; // 91—— B2B前台预占，根据前台传入的时间判断预占时长   *******（for Telenor）

	// ------------------------资源预占时长记录状态---------------------------------
	public static final String RES_LOCK_TIME_STATUS_VALID = "1"; // 1——有效
	public static final String RES_LOCK_TIME_STATUS_INVALID = "0"; // 0——无效

	// ---------------------回收失败状态位-------------------------------
	public static final long PHONE_RECYCLE_FAIL = 1; // 回收失败
	public static final long PHONE_RECYCLE_NORMAL = 0; // 正常标志位

	// ---------------------选号参数静态值-------------------------------
	public static final long PHONE_SEL_CHOOSETYPE_RANDOM = 1; // 随机
	public static final long PHONE_SEL_CHOOSETYPE_CONDITIONAL = 2; // 按查询条件来

	public static final long PHONE_SEL_CHOOSELEVEL_SPEC = 1; // 优选号码
	public static final long PHONE_SEL_CHOOSELEVEL_NORMAL = 0; // 普通号码

	public static final long PHONE_SEL_MODETYPE_NUMPATTERN = 0; // 号码模式
	public static final long PHONE_SEL_MODETYPE_QRYPATTERN = 1; // 号码查询条件

	// ---------------------国际租机一卡多号-------------------------------
	public static final long PHONE_ONECARD_N_NUMBER = 40100L; // 正常标志位

	// ------------------------有线固话号段标示----------------------------------------
	public static final String FIXED_LINE_NUM = "YXGH"; // 有线固话号段标示

	// --------------------------移动号段类型--------------------------------------------
	public static final String NET_ID_CODE_TYPE = "4_BOSS_HEAD"; // 移动号段类型编码

	// --------------------------集团号码规格对应长度--------------------------------------------
	public static final String SPEC_LENGTH = "RS_SPEC_LENGTH"; // 移动号段类型编码

	// --------------------------移动可用号段集合--------------------------------------------
//	public static final String[] NET_ID_ARRAY = new String[]
//	{ "134", "135", "136", "137", "138", "139", "147", "150", "151", "152", "157", "158", "159", "182", "183", "187" };
//	public static final String[] NET_ID_ARRAY_188 = new String[]
//	{ "188" };

	// --------------------------移动可铁通号段集合--------------------------------------------
//	public static final String[] NET_ID_ARRAY_ALL = new String[]
//	{ "134", "135", "136", "137", "138", "139", "147", "150", "151", "152", "157", "158", "159", "182", "183", "187", "188", "570", "571", "572", "573", "574", "575", "576", "577", "579", "580" };
	
	// ------------------------资源配置管理业务操作代码----------------------------------
	public static final String RES_CFG_BUSI_ID_1 = "900063"; // 网号局向新增
	public static final String RES_CFG_BUSI_ID_2 = "900064"; // 网号局向修改
	public static final String RES_CFG_BUSI_ID_3 = "900065"; // 网号局向删除
	public static final String RES_CFG_BUSI_ID_4 = "900066"; // HLR新增
	public static final String RES_CFG_BUSI_ID_5 = "900067"; // HLR修改
	public static final String RES_CFG_BUSI_ID_6 = "900068"; // HLR删除
	public static final String RES_CFG_BUSI_ID_7 = "900075"; // 资源型号新增
	public static final String RES_CFG_BUSI_ID_8 = "900076"; // 资源型号修改
	public static final String RES_CFG_BUSI_ID_9 = "900077"; // 资源型号删除
	public static final String RES_CFG_BUSI_ID_10 = "900078"; // 资源价格新增
	public static final String RES_CFG_BUSI_ID_11 = "900079"; // 资源价格修改
	public static final String RES_CFG_BUSI_ID_12 = "900080"; // 资源价格删除
	public static final String RES_CFG_BUSI_ID_13 = "900072"; // 选号费模式新增
	public static final String RES_CFG_BUSI_ID_14 = "900073"; // 选号费模式修改
	public static final String RES_CFG_BUSI_ID_15 = "900074"; // 选号费模式删除
	public static final String RES_CFG_BUSI_ID_16 = "900084"; // 号码模式号段信息新增
	public static final String RES_CFG_BUSI_ID_17 = "900085"; // 号码模式号段信息修改
	public static final String RES_CFG_BUSI_ID_54 = "900119"; // 号码模式号段定义del
	public static final String RES_CFG_BUSI_ID_18 = "900086"; // 号码模式分类定义新增
	public static final String RES_CFG_BUSI_ID_19 = "900087"; // 号码模式分类定义修改
	public static final String RES_CFG_BUSI_ID_53 = "900118"; // 号码模式分类定义del
	public static final String RES_CFG_BUSI_ID_20 = "900088"; // 短信通知配置新增
	public static final String RES_CFG_BUSI_ID_21 = "900089"; // 短信通知配置修改
	public static final String RES_CFG_BUSI_ID_22 = "900090"; // 短信通知配置删除
	public static final String RES_CFG_BUSI_ID_23 = "900081"; // 移动固话IMSI号段新增
	public static final String RES_CFG_BUSI_ID_24 = "900082"; // 移动固话IMSI号段修改
	public static final String RES_CFG_BUSI_ID_25 = "900083"; // 移动固话IMSI号段删除
	public static final String RES_CFG_BUSI_ID_26 = "900091"; // 号码模式与类型对应关系新增
	public static final String RES_CFG_BUSI_ID_27 = "900092"; // 号码模式与类型对应关系删除
	public static final String RES_CFG_BUSI_ID_28 = "900093"; // 号码档次与类型对应关系新增
	public static final String RES_CFG_BUSI_ID_29 = "900094"; // 号码档次与类型对应关系删除
	public static final String RES_CFG_BUSI_ID_30 = "900095"; // 地市号码模式规则新增
	public static final String RES_CFG_BUSI_ID_31 = "900096"; // 地市号码模式规则删除
	public static final String RES_CFG_BUSI_ID_32 = "900097"; // 档次新增
	public static final String RES_CFG_BUSI_ID_33 = "900098"; // 档次修改
	public static final String RES_CFG_BUSI_ID_34 = "900099"; // 档次删除
	public static final String RES_CFG_BUSI_ID_35 = "900100"; // 资源库存预警参数新增
	public static final String RES_CFG_BUSI_ID_36 = "900101"; // 资源库存预警参数修改
	public static final String RES_CFG_BUSI_ID_37 = "900102"; // 资源库存预警参数删除
	public static final String RES_CFG_BUSI_ID_38 = "900103"; // 共享区号码库存参数新增
	public static final String RES_CFG_BUSI_ID_39 = "900104"; // 共享区号码库存参数修改
	public static final String RES_CFG_BUSI_ID_40 = "900105"; // 共享区号码库存参数删除
	public static final String RES_CFG_BUSI_ID_41 = "900106"; // 号码模式审批配置信息新增
	public static final String RES_CFG_BUSI_ID_42 = "900107"; // 号码模式审批配置信息修改
	public static final String RES_CFG_BUSI_ID_43 = "900108"; // 号码模式审批配置信息删除
	public static final String RES_CFG_BUSI_ID_44 = "900109"; // 有线固话号段新增
	public static final String RES_CFG_BUSI_ID_45 = "900110"; // 有线固话号段修改
	public static final String RES_CFG_BUSI_ID_46 = "900111"; // 有线固话号段删除
	public static final String RES_CFG_BUSI_ID_47 = "900112"; // 短信通知明细新增
	public static final String RES_CFG_BUSI_ID_48 = "900113"; // 短信通知明细修改
	public static final String RES_CFG_BUSI_ID_49 = "900114"; // 短信通知明细删除
	public static final String RES_CFG_BUSI_ID_50 = "900115"; // 行业应用号码号段新增
	public static final String RES_CFG_BUSI_ID_51 = "900116"; // 行业应用号码号段修改
	public static final String RES_CFG_BUSI_ID_52 = "900117"; // 行业应用号码号段删除

	// ------------------------号码管理业务操作代码-------------------------------------
	public static final String NUM_MGR_BUSI_ID_1 = "900000"; // 号码生成
	public static final String NUM_MGR_BUSI_ID_2 = "900001"; // 号码发放
	public static final String NUM_MGR_BUSI_ID_3 = "900002"; // 号码调配
	public static final String NUM_MGR_BUSI_ID_4 = "900003"; // 号码收回
	public static final String NUM_MGR_BUSI_ID_5 = "900006"; // 号码修改
	public static final String NUM_MGR_BUSI_ID_6 = "900007"; // 选号费匹配
	public static final String NUM_MGR_BUSI_ID_7 = "900008"; // 号码审批
	public static final String NUM_MGR_BUSI_ID_8 = "900009"; // 号码预占取消
	public static final String NUM_MGR_BUSI_ID_9 = "900010"; // 号码冷冻（预销户）
	public static final String NUM_MGR_BUSI_ID_10 = "900011"; // 号码实占取消
	public static final String NUM_MGR_BUSI_ID_12 = "900400"; // 号码回收（实销）
	public static final String NUM_MGR_BUSI_ID_13 = "900401"; // 号码查询
	public static final String NUM_MGR_BUSI_ID_14 = "900407"; // 号码预占
	public static final String NUM_MGR_BUSI_ID_15 = "900409"; // 号码规格修改
	public static final String NUM_MGR_BUSI_AUTO_RECYCLING = "900402"; // 号码自动回收
	public static final String NUM_MGR_BUSI_MANUAL_RECYCLING = "900403"; // 号码手动回收
	public static final String NUM_MGR_BUSI_ID_BIND = "900404"; // 号码绑定
	public static final String NUM_MGR_BUSI_ID_UNBIND = "900405"; // 号码去绑定
	public static final String NUM_MGR_BUSI_ID_DEL = "900406"; // 号码删除
	public static final String NUM_MGR_BUSI_ID_INUSED = "900408"; // 号码实占
	public static final String NUM_BUSI_ID_APPLY_PORT_IN = "900410"; // 900410号码携入申请
	public static final String NUM_BUSI_ID_CANCEL_PORT_IN = "900411"; // 900411号码携入取消
	public static final String NUM_BUSI_ID_CONFIRM_PORT_IN = "900412"; // 900412号码携入确认
	public static final String NUM_BUSI_ID_RETURN_PORT_IN = "900413"; // 900413回收携入号码
	public static final String NUM_BUSI_ID_APPLY_PORT_OUT = "900414"; // 900414号码携出申请
	public static final String NUM_BUSI_ID_CANCEL_PORT_OUT = "900415"; // 900415号码携出取消
	public static final String NUM_BUSI_ID_CONFIRM_PORT_OUT = "900416"; // 900416号码携出确认
	public static final String NUM_BUSI_ID_RETURN_PORT_OUT = "900417"; // 900417返回携出号码
	public static final String NUM_BUSI_ID_CHANGE_PREDATE = "900418"; // 900418修改预占时间
	public static final String NUM_BUSI_ID_CHANGE_PHONE = "900419"; // 900419 换号业务 -- 注意！走资源冷号回收流程
	public static final String NUM_BUSI_ID_TRANSFER_OWNERSHIP = "900420"; // 900420 号码过户 transfer Owership
	public static final String NUM_BUSI_ID_21 = "900421"; // 已受理未实占
	public static final String NUM_BUSI_ID_22 = "900422"; // 号码受理回退
	public static final String NUM_BUSI_ID_23 = "900423"; // 新增、号码信息给NPGW：Insert Number to NPGW
	public static final String NUM_BUSI_ID_24 = "900424"; // 修改、号码信息给NPGW：Update Number to NPGW
	public static final String NUM_BUSI_ID_25 = "900425"; // 删除、号码信息给NPGW：Delete Number to NPGW
	public static final String NUM_BUSI_ID_26 = "900426"; // 判断号码是否可以携转
	public static final String NUM_BUSI_ID_27 = "900427"; // 修正数据 -- 修数据页面使用
	public static final String NUM_BUSI_ID_28 = "900428"; // 900428 Add-on副号退订 -- 注意！走资源冷号回收流程
	public static final String NUM_BUSI_ID_29 = "900429"; // 900429 Number Range Split 号码分段
	public static final String NUM_BUSI_ID_30 = "900430"; // 仅告知NP删除号段，CRM是该状态从 1 ==》 22
	public static final String NUM_BUSI_ID_31 = "900431"; // 资源号码冷冻 -- 注意！走资源冷号回收流程
	public static final String NUM_BUSI_ID_32 = "900432"; // 号段号码merge
	public static final String NUM_BUSI_ID_33 = "900433"; // 号码回滚 Number force Cancel
	public static final String NUM_BUSI_ID_RETURN_UNDER = "900434"; // 携入号码Return初始
	public static final String NUM_BUSI_ID_RETURN_ERROR = "900435"; // 携入号码Return失败
	
	
	// ------------------------号码资源状态-------------------------------
	public static final String PHONE_RES_STATUS_CODE_TYPE = "80038"; // 资源开通状态

	// ------------------------number Range 操作类型-------------------------------
	public static final String Port_In_Number = "1"; // 携入号码：携转批量号码生成页面、接口
	public static final String Resold_Number = "2"; // 转售号码：携转批量号码生成页面

	// ------------------------号码档次编号定义---------------------------------
	public static final String PHONE_LEVEL_1 = "1"; // 1档
	public static final String PHONE_LEVEL_2 = "2"; // 2档
	public static final String PHONE_LEVEL_3 = "3"; // 3档
	public static final String PHONE_LEVEL_4 = "4"; // 4档
	public static final String PHONE_LEVEL_5 = "5"; // 5档
	public static final String PHONE_LEVEL_6 = "6"; // 6档

	/**************************************** 号码管理 END **************************************************/

	/**************************************** Voucher BEG **************************************************/

	// ------------------------Voucher管理状态-------------------------------------
	public static final String VOUCHER_MANAGE_STATUS_OPEN = "1"; // 1 Open
	public static final String VOUCHER_MANAGE_STATUS_ACTIVE = "2"; // 2 Available
	public static final String VOUCHER_MANAGE_STATUS_RESERVE = "3"; // 3 Reserved
	public static final String VOUCHER_MANAGE_STATUS_OCCUPY = "5"; // 5 在用\实占 In-Used
	public static final String VOUCHER_MANAGE_STATUS_ABOLISH = "7"; // 7 作废

	// ------------------------Voucher业务操作代码-------------------------------------
	public static final String VOUCHER_BUSINESS_ID_1 = "900501"; // 占用 Occupy
	public static final String VOUCHER_BUSINESS_ID_2 = "900502"; // 页面逻辑删除
	public static final String VOUCHER_BUSINESS_ID_3 = "900503"; // 页面新增
	public static final String VOUCHER_BUSINESS_ID_4 = "900504"; // 页面修改
	public static final String VOUCHER_BUSINESS_ID_5 = "900505"; // 文件生成
	public static final String VOUCHER_BUSINESS_ID_6 = "900506"; // 预占Reserve
	public static final String VOUCHER_BUSINESS_ID_7 = "900507"; // 释放预占过的Voucher
	
	/**************************************** Voucher END **************************************************/

	/**************************************** VIAPLAY Voucher BEG **************************************************/
	// ------------------------VIAPLAY Voucher管理状态-------------------------------------
	public static final String VIAPLAY_VOUCHER_MANAGE_STATUS_CREATED = "1"; // 1 Created 生成
	public static final String VIAPLAY_VOUCHER_MANAGE_STATUS_SENT = "2"; // 2 Sent 发送
	public static final String VIAPLAY_VOUCHER_MANAGE_STATUS_ACTIVATED = "5"; // 5 Activated 在用
	public static final String VIAPLAY_VOUCHER_MANAGE_STATUS_EXPIRED = "9"; // 9 Expired 过期
	public static final String VIAPLAY_VOUCHER_MANAGE_STATUS_DEACTIVATED = "6"; // 6 Deactivated 作废

	// ------------------------Voucher业务操作代码-------------------------------------
	public static final String VIAPLAY_VOUCHER_BUSINESS_ID_1 = "900701"; // 文件生成VIAPLAY
	public static final String VIAPLAY_VOUCHER_BUSINESS_ID_2 = "900702"; // 过期VIAPLAY
	public static final String VIAPLAY_VOUCHER_BUSINESS_ID_3 = "900703"; // sent VIAPLAY
	public static final String VIAPLAY_VOUCHER_BUSINESS_ID_4 = "900704"; // 使用 VIAPLAY
	public static final String VIAPLAY_VOUCHER_BUSINESS_ID_5 = "900705"; // 作废 VIAPLAY
	public static final String VIAPLAY_VOUCHER_BUSINESS_ID_6 = "900706";//修改 modify
	public static final String VIAPLAY_VOUCHER_BUSINESS_ID_7 = "900707";//删除delete
	
	// ------------------------VIAPLAY ID-------------------------------------
	public static final String VIAPLAY_VOUCHER_ID = "19"; 
	
	// ------------------------VIAPLAY SPEC ID-------------------------------------
	public static final String VIAPLAY_VOUCHER_SPEC_ID_3M = "190001"; 
	public static final String VIAPLAY_VOUCHER_SPEC_ID_12M = "190002";
	
	/**************************************** VIAPLAY Voucher END **************************************************/
	
	/**************************************** COUPON BEG **************************************************/

	// ------------------------COUPON管理状态-------------------------------------
	public static final String COUPON_MANAGE_STATUS_GEN = "1"; // 1 生成 Generated
	public static final String COUPON_MANAGE_STATUS_AVA = "2"; // 2 可售 Available
	public static final String COUPON_MANAGE_STATUS_ASS = "3"; // 3 已分配 Assign
	public static final String COUPON_MANAGE_STATUS_INU = "5"; // 5 实占 Used
	public static final String COUPON_MANAGE_STATUS_CAN = "7"; // 7 作废 Cancelled
	public static final String COUPON_MANAGE_STATUS_BOL = "10"; // 10 作废 Blocked

	// 用 RES_SPEC 表的 IS_NEED_CONFIRM 字段维护
	public static final String COUPON_NOT_TIED_CTN = "0"; // 0 不绑定 CTN
	public static final String COUPON_TIED_CTN = "1"; // 1 Tied to CTN

	// 用 RES_SPEC 表的 IS_REAL_STOCK 字段维护： 1 单次使用、 2 多次使用
	public static final String COUPON_USE_TIME_1 = "1"; // 1 单次使用
	public static final String COUPON_USE_TIME_2 = "2"; // 2 多次使用

	// ------------------------COUPON业务操作代码-------------------------------------
	public static final String COUPON_BUSINESS_ID_1 = "900601"; // 900601 Coupon Occupation  -- Coupon生成
	public static final String COUPON_BUSINESS_ID_2 = "900602"; // 900602 Delete Coupon  -- Coupon删除
	public static final String COUPON_BUSINESS_ID_3 = "900603"; // 900603 Coupon Generation By Range  -- Coupon页面生成
	public static final String COUPON_BUSINESS_ID_4 = "900604"; // 900604 Coupon Modification  -- Coupon修改
	public static final String COUPON_BUSINESS_ID_5 = "900605"; // 900605 Coupon Generation By File  -- Coupon文件生成
	public static final String COUPON_BUSINESS_ID_6 = "900606"; // 900606 Coupon Reservation  -- Coupon预占
	public static final String COUPON_BUSINESS_ID_7 = "900607"; // 900607 Release Coupon From Assigen  -- 释放预占的Coupon
	public static final String COUPON_BUSINESS_ID_8 = "900608"; // 900608 Release Coupon From Used  -- 实占取消Coupon

	/**************************************** COUPON END **************************************************/
	
	
	// 工单状态
	public static final String RES_OPER_ORDER_CODE_1 = "1"; // 1 全部入库
	public static final String RES_OPER_ORDER_CODE_2 = "2"; // 1 部分入库

	// CRM系统中电子商务号码同步到FTP
	public static final String RES_EC_NUM_FTP = "RES_EC_NUM_FTP";// FTP服务器配置信息
	public static final String RES_EC_NUM_PATH = "RES_EC_NUM_PATH";// FTP客户端本地配置信息
	public static final String RES_PHONE_ADD_FTP_PATH = "RES_PHONE_ADD_FTP_PATH";// FTP
	public static final String RES_GROUP_PHONE_ADD_FTP_PATH = "RES_GROUP_PHONE_ADD_FTP_PATH";// FTP
	public static final String FTP_PAY_CARD_ADD_FTP_PATH = "FTP_PAY_CARD_ADD_FTP_PATH";// 资源有价卡写入下载文件
	public static final String RES_CHANNEL_ORDER_ACCOUNT = "RES_CHANNEL_ORDER_ACCOUNT";// 资源有价卡写入下载文件
	public static final String RES_CHANNEL_PRE_OPEN = "RES_CHANNEL_PRE_OPEN";// 资源有价卡写入下载文件

	// ------------------------资源属性编码-------------------------------------
	public static final String RS_MANAGE_STATUS = "1"; // 管理状态

	// ------------------------渠道批卡业务操作代码-------------------------------------
	public static final String CHANNEL_MGR_BUSI_ID_01 = "910038";// 渠道产品订购操作
	public static final String CHANNEL_MGR_BUSI_ID_02 = "910039";// 渠道产品订购退货
	public static final String CHANNEL_MGR_BUSI_ID_03 = "910040";// 渠道产品订购操作
	public static final int RPT_FEE_ORD_DATA_FROM = 3;// 1-营业 2-帐管 3-资源 4-CBOSS 5-渠道
	public static final int RES_PAY_TYPE_0 = 0;// 付费类型 0-其他
	public static final int RES_PAY_TYPE_1 = 1;// 付费类型 1-现金
	public static final int RES_PAY_TYPE_2 = 2;// 付费类型 2-支票
	public static final int RES_PAY_TYPE_3 = 3;// 付费类型 3-信用卡
	public static final int IS_UNDO_ORDER_0 = 0;// 是否是撤单 0-不是撤单
	public static final int IS_UNDO_ORDER_1 = 1;// 是否是撤单 1-是撤单
	public static final long PRE_PAY_NORMAL = 24000032;// 是否是撤单 1-是撤单
	// ------------------------渠道批卡业务订单状态-------------------------------------
	public static final String CHANNEL_ORDER_STATUS_1 = "1"; // 1 初始
	public static final String CHANNEL_ORDER_STATUS_4 = "4"; // 4 部分分配
	public static final String CHANNEL_ORDER_STATUS_5 = "5"; // 5 分配完毕
	public static final String CHANNEL_ORDER_STATUS_8 = "8"; // 8 选定
	public static final String CHANNEL_ORDER_STATUS_9 = "9"; // 9 注销
	public static final String CHANNEL_ORDER_STATUS_7 = "7"; // 7 已退货
	// ------------------------渠道批卡业务订单付费状态-------------------------------------
	public static final String CHANNEL_PAY_STATUS_1 = "1"; // 1 未付款
	public static final String CHANNEL_PAY_STATUS_2 = "2"; // 2 已付款
	public static final String CHANNEL_PAY_STATUS_3 = "3"; // 3 无需付款
	public static final String CHANNEL_PAY_STATUS_4 = "4"; // 4 已退款
	public static final String CHANNEL_ORDER_AMOUNT = "1000";
	public static final int CHANNEL_PROD_STATUS_0 = 0; // 渠道商品状态 失效
	public static final int CHANNEL_PROD_STATUS_1 = 1; // 渠道商品状态 有效
	public static final String CHANNEL_TYPE_STATUS_0 = "0"; // 渠道商品状态 失效
	public static final String CHANNEL_TYPE_STATUS_1 = "1"; // 渠道商品状态 有效
	public static final String CHANNEL_REGION_LEVEL_1 = "1"; // 渠道商品状态 失效
	public static final String CHANNEL_REGION_LEVEL_2 = "2"; // 渠道商品状态 有效

	public static final int PRE_PAY_STS_0 = 0; // 渠道商品状态 失效
	public static final int PRE_PAY_STS_1 = 1; // 渠道商品状态 有效
	public static final int CHANNEL_SEL_PHONE_NUM_RANDOM_AMOUNT = 5; // 渠道批号，随机选定号码倍数（5:5个中选1个）
	// ------------------------实物业务操作代码-------------------------------------
	public static final String GOODS_MET_MGR_BUSI_ID_1 = "910020";// 配送需求申请单操作
	public static final String GOODS_MET_MGR_BUSI_ID_2 = "910021";// 配送通知单操作
	public static final String GOODS_MET_MGR_BUSI_ID_3 = "910022";// 调拨通知单操作
	public static final String GOODS_MET_MGR_BUSI_ID_4 = "910023";// 个人实物领用操作
	public static final String GOODS_MET_MGR_BUSI_ID_5 = "910025";// 个人实物退货操作
	public static final String GOODS_MET_MGR_BUSI_ID_6 = "910030";// 实物其他出库操作
	public static final String GOODS_MET_MGR_BUSI_ID_7 = "910031";// 实物其他入库操作
	public static final String GOODS_MET_MGR_BUSI_ID_8 = "910032";// 实物入库操作
	public static final String GOODS_MET_MGR_BUSI_ID_9 = "910033";// 返库通知单操作
	public static final String GOODS_MET_MGR_BUSI_ID_10 = "910034";// 盘点入库操作
	public static final String GOODS_MET_MGR_BUSI_ID_11 = "910035";// 盘点出库操作
	public static final String GOODS_MET_MGR_BUSI_ID_12 = "910036";// 报废单录入操作
	public static final String GOODS_MET_MGR_BUSI_ID_13 = "910037";// 退货单录入操作
	public static final String GOODS_MET_MGR_BUSI_ID_14 = "910024";// 组织实物领用操作
	// ------------------------电子卡销售-----------------
	public static final String PAYCARD_E_MGR_BUSI_ID_2 = "900300";// 电子卡销售(代理商)

	// 出入库日志查询 操作类型的状态
	// SELECT T.*, T.ROWID FROM RES.RES_USE_TYPE T
	// 请增加此字段时对照数据库表
	/** Add for Report zhangyuanzhu zhangyz2 13793 2011-07-01 begain */
	public static final String BUSI_CODE_RES_USED_RECORD_USEDTYPE_0 = "900310";// 返库出库
	public static final String BUSI_CODE_RES_USED_RECORD_USEDTYPE_1 = "900311";// 个人领用入库
	public static final String BUSI_CODE_RES_USED_RECORD_USEDTYPE_2 = "900312";// 上级手工出库
	public static final String BUSI_CODE_RES_USED_RECORD_USEDTYPE_3 = "900313";// 配送入库
	public static final String BUSI_CODE_RES_USED_RECORD_USEDTYPE_4 = "900314";// 调拨入库
	public static final String BUSI_CODE_RES_USED_RECORD_USEDTYPE_5 = "900315";// 退货出库
	public static final String BUSI_CODE_RES_USED_RECORD_USEDTYPE_6 = "900316";// 用户退货
	public static final String BUSI_CODE_RES_USED_RECORD_USEDTYPE_7 = "900317";// 用户换货
	public static final String BUSI_CODE_RES_USED_RECORD_USEDTYPE_8 = "900318";// 手动入库
	public static final String BUSI_CODE_RES_USED_RECORD_USEDTYPE_9 = "900319";// 上级手工入库
	public static final String BUSI_CODE_RES_USED_RECORD_USEDTYPE_10 = "900320";// 盘点调整出库
	public static final String BUSI_CODE_RES_USED_RECORD_USEDTYPE_11 = "900321";// 盘点调整入库
	public static final String BUSI_CODE_RES_USED_RECORD_USEDTYPE_12 = "900322";// 配送单终止库存返回
	public static final String BUSI_CODE_RES_USED_RECORD_USEDTYPE_13 = "900323";// 销售
	// public static final String BUSI_CODE_RES_USED_RECORD_USEDTYPE_18 = "900338";// 下发出库
	// public static final String BUSI_CODE_RES_USED_RECORD_USEDTYPE_19 = "900339";// 下发入库
	// public static final String BUSI_CODE_RES_USED_RECORD_USEDTYPE_20 = "900340";// 返库出库
	// public static final String BUSI_CODE_RES_USED_RECORD_USEDTYPE_21 = "900341";// 返库入库
	// public static final String BUSI_CODE_RES_USED_RECORD_USEDTYPE_14 = "900324";// 有价卡销售
	// ------------------------有价卡销售-----------------
	// public static final String PAYCARD_MGR_BUSI_ID_1 = "900200"; // 有价卡销售(个人)
	// public static final String PAYCARD_MGR_BUSI_ID_2 = "900201"; // 有价卡销售(代销商)

	public static final String BUSI_CODE_RES_USED_RECORD_USEDTYPE_15 = "900325";// ATMI电子商务出库
	public static final String BUSI_CODE_RES_USED_RECORD_USEDTYPE_16 = "900326";// ATMI电子商务入库
	public static final String BUSI_CODE_RES_USED_RECORD_USEDTYPE_17 = "900327";// 赠送
	// public static final String BUSI_CODE_RES_USED_RECORD_USEDTYPE_18 = "900328";// 有价卡导入
	// public static final String BUSI_CODE_RES_USED_RECORD_USEDTYPE_19 = "900329";// 有价卡入库
	public static final String BUSI_CODE_RES_USED_RECORD_USEDTYPE_STORAGE_LIST_REC = "900330";// 入库单录入
	public static final String BUSI_CODE_RES_USED_RECORD_USEDTYPE_RETURN_SINGLE_REC = "900331";// 返库入库
	public static final String BUSI_CODE_RES_USED_RECORD_USEDTYPE_USABLE_SINGLE_REC = "900324";// 报废单录入
	public static final String BUSI_CODE_RES_USED_RECORD_USEDTYPE_ONE_OTHER_OUT_OF_STORAGE_REC = "900332";// 其他出入库单录入
	public static final String BUSI_CODE_RES_USED_RECORD_USEDTYPE_ALLOCATION_OUT_STORE = "900333";// 调拨出库
	public static final String BUSI_CODE_RES_USED_RECORD_USEDTYPE_MANUAL_OUT = "900334";// 手动出库
	public static final String BUSI_CODE_RES_USED_RECORD_USEDTYPE_GOODS_EXCH = "900335";// 实物兑换
	public static final String BUSI_CODE_RES_USED_RECORD_USEDTYPE_NOITFY_OUT = "900336";// 配送出库
	public static final String BUSI_CODE_RES_USED_RECORD_USEDTYPE_ORG_TO_PER = "900337";// 组织发放到个人
	/** Add for Report zhangyuanzhu zhangyz2 13793 2011-07-01 end */

	/** Add for Report zhangyuanzhu zhangyz2 13793 2011-07-07 begain */
	public static final String RES_OPER_ORDER_ALLOCATION_TYPE_ORDER = "1";// 订单流程
	public static final String RES_OPER_ORDER_ALLOCATION_TYPE_REQ = "2";// 申请流程
	public static final String RES_OPER_ORDER_ALLOCATION_TYPE_SELF = "3";// 主动流程
	/** Add for Report zhangyuanzhu zhangyz2 13793 2011-07-07 end */

	// ---------------------号码管理模块组织树普通组织和共享区类型标示----------------------------------
	public static final String TREE_ORG_0 = "0";// 0-组织
	public static final String TREE_ORG_1 = "1";// 1-共享区

	// ---------------------号段位数----------------------------------
	public static final int HEAD_NUM_7 = 7;// headnum为前7位
	public static final int HEAD_NUM_8 = 8;// headnum为前8位
	// ----------sim卡管理operOrder orderStat状态
	public static final String ORDER_STATUS_WAIT = "0"; // 待执行
	public static final String ORDER_STATUS_FAIL = "1"; // 执行失败
	public static final String ORDER_STATUS_SUCC = "2"; // 执行成功
	// ----------sim卡管理operOrder stat状态
	public static final String SIM_MNG_DTL_ONWAY_WAIT = "0"; // 在途待执行
	public static final String SIM_MNG_ONWAY_WAIT = "0"; // 在途待执行
	public static final String SIM_MNG_ONWAY_SUCCC = "1"; // 待确认
	public static final String SIM_MNG_ONWAY_FAIL = "2"; // 在途操作执行失败
	public static final String SIM_MNG_DTL_ONWAY_FAIL = "2"; // 在途操作执行失败
	public static final String SIM_MNG_DTL_CONFIRM_WAIT = "3"; // 确认待执行
	public static final String SIM_MNG_CONFIRM_WAIT = "3"; // 确认待执行
	public static final String SIM_MNG_CONFIRM_FIN = "2"; // 确认完成
	public static final String SIM_MNG_CONFIRM_SUCC = "4"; // 确认执行成功
	public static final String SIM_MNG_CONFIRM_FAIL = "5"; // 确认执行失败
	public static final String SIM_MNG_DTL_CONFIRM_FAIL = "5"; // 确认执行失败
	public static final String SIM_MNG_REJECT_WAIT = "6"; // 返销待执行
	public static final String SIM_MNG_DTL_REJECT_WAIT = "6"; // 返销待执行
	public static final String SIM_MNG_REJECT_SUCC = "7"; // 返销执行成功
	public static final String SIM_MNG_DTL_REJECT_SUCC = "7"; // 返销执行成功
	public static final String SIM_MNG_REJECT_FAIL = "8"; // 返销执行失败
	public static final String SIM_MNG_DTL_REJECT_FAIL = "8"; // 返销执行失败
	public static final String SIM_MNG_DELETE_SUCC = "9"; // 删除成功
	public static final String SIM_MNG_DTL_ONWAY_SUCCC = "1"; // 待确认
	public static final String SIM_MNG_DTL_CONFIRM_SUCC = "4"; // 确认执行成功

	/**************************** 策划参数 **********************************/
	public static final String OFFER_PARAM_01 = "10000020"; // 预存款
	public static final String OFFER_PARAM_02 = "10000021"; // 反充周期
	public static final String OFFER_PARAM_03 = "10000022"; // 保底金额
	public static final String OFFER_PARAM_04 = "10000023"; // 保底周期
	public static final String OFFER_PARAM_05 = "10000024"; // 承诺在网年限
	/******************************* 策划 ******************************/

	// ----------------------集团号码管理状态(上海)--------------------------------
	public static final int G_PHONE_MANAGE_STATUS_1 = 1; // 1初始资源
	public static final int G_PHONE_MANAGE_STATUS_2 = 2; // 2普通
	public static final int G_PHONE_MANAGE_STATUS_3 = 3; // 3选中
	public static final int G_PHONE_MANAGE_STATUS_4 = 4; // 4占用
	public static final int G_PHONE_MANAGE_STATUS_5 = 5; // 5冷冻
	public static final int G_PHONE_MANAGE_STATUS_9 = 9; // 9 个人预留
	public static final int G_PHONE_MANAGE_STATUS_10 = 10; // 10部门预留

	// ---------------------证件类型------------------------------------------------
	public static final String CM_CERT_TYPE_0 = "0"; // 身份证
	public static final String CM_CERT_TYPE_1 = "1"; // 工商登记证
	public static final String CM_CERT_TYPE_2 = "2"; // 护照（旧）
	public static final String CM_CERT_TYPE_3 = "3"; // 军人证
	public static final String CM_CERT_TYPE_4 = "4"; // 社保卡(旧)
	public static final String CM_CERT_TYPE_5 = "5"; // 企业代码证
	public static final String CM_CERT_TYPE_6 = "6"; // 蓝印户口（旧）
	public static final String CM_CERT_TYPE_9 = "9"; // 单位证明
	public static final String CM_CERT_TYPE_10 = "10"; // 港澳居民来往内地通行证
	public static final String CM_CERT_TYPE_11 = "11"; // 台胞
	public static final String CM_CERT_TYPE_12 = "12"; // 外籍人士
	public static final String CM_CERT_TYPE_29 = "29"; // 29 CPI number
	public static final String OSE_CERT_TYPE_30 = "30"; // OSE basketId购物车ID类型 ----- only for Telenor
	public static final String OSE_CERT_TYPE_31 = "31"; // 暂未使用
	public static final String CM_CERT_TYPE_99 = "98"; // 其它证件
	public static final String CM_CERT_TYPE_1000 = "1000"; // 客户编号类型 ----- only for Telenor
	public static final String CM_CERT_TYPE_1001 = "1001"; // 用户编号类型 ----- only for Telenor （OSE的VOIP选号）

	// ---------------------号码使用类型定义-------------------------------
	public static final int PHONE_USE_TYPE_SO = 1; // 营业用
	public static final int PHONE_USE_TYPE_CHANNEL_SEL = 2; // 2-代销用
	public static final int PHONE_USE_TYPE_3 = 3; // 3-租机租卡用
	public static final int PHONE_USE_TYPE_TEST = 7; // 测试用
	public static final int PHONE_USE_NORMAL = 99;// 营业前台，同时查询营业用和代销用

	// ------------------------资源对外业务代码---------------------------------
	public static final String OPEN_BUSI_CODE_1 = "YZ"; // 预占
	public static final String OPEN_BUSI_CODE_2 = "YZCX"; // 预占撤销
	public static final String OPEN_BUSI_CODE_3 = "SZ"; // 实占
	public static final String OPEN_BUSI_CODE_4 = "SZHG"; // 实占回滚

	// ------------------------资源类型----------------------------------------
	public static final String OPEN_RES_TYPE_1 = "1"; // 号码
	public static final String OPEN_RES_TYPE_2 = "2"; // SIM卡

	// ------------------------号码模式规则状态-------------------------------
	public static final String RES_PATTERN_STATUS_CODE_TYPE = "80039";
	public static final String RES_PATTERN_STATUS_0 = "0"; // 0-失效
	public static final String RES_PATTERN_STATUS_1 = "1"; // 1-有效

	// ------------------------全省名称定义-------------------------------
	public static final String RES_PROVINCE_CODE_TYPE = "80040";
	public static final String RES_PROVINCE_CODE_VALUE = "0"; // 0-全省

	// ------------------------预警类型定义-------------------------------
	public static final String RES_STOCK_BUSI_TYPE_1 = "1"; // 号码库存预警
	public static final String RES_STOCK_BUSI_TYPE_2 = "2"; // sim卡库存预警
	public static final String RES_STOCK_BUSI_TYPE_3 = "3"; // 终端销售数量预警

	public static final String RES_2_INTER_RETURN_CODE = "returnCode";// 接口返回编码
	public static final String RES_2_INTER_RETURN_MSG = "returnMsg";// 接口返回信息
	public static final String RES_2_INTER_RETURN_LIST = "returnList";// 如果是查询列表：List
	// returnList=new
	// ArrayList();
	// returnList.add(Map);一个对象为一个Map
	public static final String RES_2_INTER_RETURN_MAP = "returnMap";// 如果是一个对象，直接以Map存放返回
	public static final String RES_2_INTER_COUNT = "count";// 返回的对象总数
	public static final String RES_2_INTER_RETURN_ERROR_CODE = "INS1";// 处理失败代码
	public static final String RES_2_INTER_RETURN_SUCCESS_CODE = "INS0";// 处理成功代码
	public static final String RES_2_INTER_RETURN_SUCCESS_MSG = "SUCCESS";// 返回成功信息

	// ------------------------选号系统业务记录定义-------------------------------------
	public static final String Res_Sel_Num_OptCode_1 = "HMTF";// 号码投放
	public static final String Res_Sel_Num_OptCode_2 = "ZDYZ";// 终端预占
	public static final String Res_Sel_Num_OptCode_3 = "CXXH";// 彩信选号
	public static final String Res_Sel_Num_OptCode_4 = "WSYZ";// 网上预占
	public static final String Res_Sel_Num_OptCode_5 = "ZDKH";// 终端开户
	public static final String Res_Sel_Num_OptCode_6 = "DXXH";// 短信选号
	public static final String Res_Sel_Num_OptCode_7 = "WSXH";// 网上选号
	public static final String Res_Sel_Num_OptCode_8 = "DXYZ";// 短信预占
	public static final String Res_Sel_Num_OptCode_9 = "CXYZ";// 彩信预占
	public static final String Res_Sel_Num_OptCode_10 = "CBYZ";// CBOSS预占
	public static final String Res_Sel_Num_OptCode_11 = "CBKH";// CBOSS开户
	public static final String Res_Sel_Num_OptCode_12 = "YYXH";// 营业选号
	public static final String Res_Sel_Num_OptCode_13 = "YYYZ";// 营业预占
	public static final String Res_Sel_Num_OptCode_14 = "YYKH";// 营业开户
	public static final String Res_Sel_Num_OptCode_15 = "TPYZ";// 特批预占
	public static final String Res_Sel_Num_OptCode_16 = "QDYZ";// 渠道预占
	public static final String Res_Sel_Num_OptCode_17 = "SCYZ";// 商城预占
	public static final String Res_Sel_Num_OptCode_18 = "WS188YZ";// 网上188预约预占

	// ------------------------品牌静态数据定义----------------------------------
	// public static final String TRADE_CODE_TYPE = "RS80036"; // 品牌
	public static final String TRADE_CODE_TYPE = "SO_BRAND_TYPE"; // 品牌 取营业缓存数据
	public static final String TRADE_CODE_VALUE_0 = "0"; // 【0】无
	public static final String TRADE_CODE_VALUE_1 = "161000000001"; // 【1】全球通
	public static final String TRADE_CODE_VALUE_4 = "161000000002"; // 【4】动感地带
	public static final String TRADE_CODE_VALUE_5 = "161000000003"; // 【5】神州行

	public static final String FIX_NUM_TRADE_CODE_TYPE = "80037"; // 有线固话铁通号码产品规格
	public static final String FIX_NUM_TRADE_VALUE_101 = "101"; // 【101】政企IMS固话
	public static final String FIX_NUM_TRADE_VALUE_601 = "601"; // 【601】个人IMS固话

	// ------------------------无线铁通号码模式号段定义-------------------------------------
	public static final String WIRELESS_NUM_PATTERN_SEG_ID = "10000011"; // 无线铁通号码模式号段编号
	public static final String WIRELESS_NUM_PATTERN_SEG_EXP = "$contain($substr(@bill_id,0,1),'5')==true"; // 无线铁通号码模式号段表达式
	public static final String FIX_NUM_PATTERN_SEG_ID = "10000015"; // 有线铁通固话号码模式号段编号
	public static final String FIX_NUM_PATTERN_SEG_EXP = "$contain($substr(@bill_id,0,1),'0')==true"; // 有线铁通固话号码模式号段表达式

	// ------------------------文件导入号码临时数据存放供前台展示，用扩展字段EXT1标示号码，每晚空闲时间需清理掉此数据-------------------------
	public static final String RES_BAT_DEAL_ERR_EXT_1 = "1000";

	// ------------------------号码管理模块导出Excel默认最大数量-------------------------------------
	public static final String RES_EXPORT_EXCEL_MAX_NUM = "5000"; // 默认最大数量为5千
	public static final String RES_PHONE_QRY_MAX_NUM = "10000"; // 默认最大数量为5千
	public static final String RES_SELECT_MAX_NUM = "20"; // 默认最大数量为5千

	// ------------------------有价卡类别定义-------------------------------------
	public static final String RES_BASE_TYPE_PAY_CARD = "5000"; // 有价卡

	// ------------------------积分实物类别定义-------------------------------------

	public static final String RES_SCORE_TYPE = "14"; // 积分实物

	/** 实物管理 BEGIN */
	// 申请单类型

	// ResRequestOrder 字段 INVOICE_TYPE 属性
	public static final String REQUEST_ORDER_INVOICE_TYPE_AMOUNT_REQUIRE = "0"; // 配送需求申请单(数量级：同质数据)
	public static final String REQUEST_ORDER_INVOICE_TYPE_RETURE = "1"; // 退货需求申请单
	public static final String REQUEST_ORDER_INVOICE_TYPE_STORE_CHANGE = "2"; // 库存调整申请单(库存盘点)
	public static final String REQUEST_ORDER_INVOICE_TYPE_PERSON_REQUIRE = "3"; // 个人库存申请单
	public static final String REQUEST_ORDER_INVOICE_TYPE_PERSON_RETURE = "4"; // 个人退货申请单
	public static final String REQUEST_ORDER_INVOICE_TYPE_DATA_REQUIRE = "5"; // 配送需求申请单(数据级：异构数据)

	// 配送需求申请单几种状态
	public static final String REQUEST_ORDER_REQUIRE_INVOICE_STATE_NEW = "0"; // 新建
	public static final String REQUEST_ORDER_REQUIRE_INVOICE_STATE_AWAITVERIFY = "1"; // 提交待审批
	public static final String REQUEST_ORDER_REQUIRE_INVOICE_STATE_VERIFING = "2"; // 审批中
	public static final String REQUEST_ORDER_REQUIRE_INVOICE_STATE_VERIFIED = "3"; // 完全通过审批
	public static final String REQUEST_ORDER_REQUIRE_INVOICE_STATE_SOMEVERIFIED = "4"; // 部分通过审批
	public static final String REQUEST_ORDER_REQUIRE_INVOICE_STATE_RESUME = "5"; // 审批拒绝
	public static final String REQUEST_ORDER_REQUIRE_INVOICE_STATE_SENDING = "6"; // 部分配送
	public static final String REQUEST_ORDER_REQUIRE_INVOICE_STATE_SOMESEND = "7"; // 完全配送
	public static final String REQUEST_ORDER_REQUIRE_INVOICE_STATE_GARBAGE = "8"; // 废弃

	// 退货申请单几种状态
	public static final String REQUEST_ORDER_RETURN_INVOICE_STATE_NEW = "0"; // 新建
	public static final String REQUEST_ORDER_RETURN_INVOICE_STATE_AWAITVERIFY = "1"; // 提交
	public static final String REQUEST_ORDER_RETURN_INVOICE_STATE_VERIFING = "2"; // 审批中
	public static final String REQUEST_ORDER_RETURN_INVOICE_STATE_VERIFIED = "3"; // 审批通过(本公司)
	public static final String REQUEST_ORDER_RETURN_INVOICE_STATE_SOMEVERIFIED = "4"; // 部分审批通过(本公司)
	public static final String REQUEST_ORDER_RETURN_INVOICE_STATE_SEND = "5"; // 完全退货(本公司)
	public static final String REQUEST_ORDER_RETURN_INVOICE_STATE_SOME_SEND = "6"; // 部分退货(本公司)
	public static final String REQUEST_ORDER_RETURN_INVOICE_STATE_RESUME = "7"; // 审批拒绝
	public static final String REQUEST_ORDER_RETURN_INVOICE_STATE_GARBAGE = "8"; // 废弃
	public static final String REQUEST_ORDER_RETURN_INVOICE_STATE_RETURN_SUPPLIER = "9"; // 完全退供应商
	public static final String REQUEST_ORDER_RETURN_INVOICE_SUPPERORG = "999999"; // 推供应商

	// 库存调整申请单几种状态 INVOICE_TYPE=2：库存调整申请单(库存盘点)
	public static final String REQUEST_ORDER_STORE_CHANGE_INVOICE_STATE_NEW = "1";// 新建
	public static final String REQUEST_ORDER_STORE_CHANGE_INVOICE_STATE_AWIATVERIFY = "2";// 提交待审批
	public static final String REQUEST_ORDER_STORE_CHANGE_INVOICE_STATE_VERIFING = "3";// 审批中
	public static final String REQUEST_ORDER_STORE_CHANGE_INVOICE_STATE_ALLVERIFYPASS = "4";// 审批通过
	public static final String REQUEST_ORDER_STORE_CHANGE_INVOICE_STATE_SOMEVERIFYPASS = "5";// 部分审批通过
	public static final String REQUEST_ORDER_STORE_CHANGE_INVOICE_STATE_VERIFYRESUME = "6";// 审批拒绝
	public static final String REQUEST_ORDER_STORE_CHANGE_INVOICE_STATE_GARBAGE = "7";// 废弃

	// 个人库存实物申请工单几种状态 INVOICE_TYPE=3：个人库存申请单
	public static final String REQUEST_ORDER_PERSON_REQUIRE_NEW = "1"; // 新建
	public static final String REQUEST_ORDER_PERSON_REQUIRE_AWAITVERIFY = "2"; // 提交待审批
	public static final String REQUEST_ORDER_PERSON_REQUIRE_VERIFING = "3"; // 审批中
	public static final String REQUEST_ORDER_PERSON_REQUIRE_APPLY = "4"; // 审批通过出库
	public static final String REQUEST_ORDER_PERSON_REQUIRE_SOMEVERIFED = "5"; // 部分审批通过出库
	public static final String REQUEST_ORDER_PERSON_REQUIRE_RECIEVED = "6"; // 领用人入库完成
	public static final String REQUEST_ORDER_PERSON_REQUIRE_SOMERECIEVED = "7"; // 领用人部分领用
	public static final String REQUEST_ORDER_PERSON_REQUIRE_RESUME = "8"; // 审批拒绝
	public static final String REQUEST_ORDER_PERSON_REQUIRE_GARBAGE = "9"; // 废弃

	// 组织库存实物申请工单几种状态 INVOICE_TYPE=5：配送需求申请单(数据级：异构数据)
	public static final String REQUEST_ORDER_ORGANIZE_REQUIRE_NEW = "1"; // 新建
	public static final String REQUEST_ORDER_ORGANIZE_REQUIRE_AWAITVERIFY = "2"; // 提交待审批
	public static final String REQUEST_ORDER_ORGANIZE_REQUIRE_VERIFING = "3"; // 审批中
	public static final String REQUEST_ORDER_ORGANIZE_REQUIRE_APPLY = "4"; // 审批通过出库
	public static final String REQUEST_ORDER_ORGANIZE_REQUIRE_SOMEVERIFED = "5"; // 部分审批通过出库
	public static final String REQUEST_ORDER_ORGANIZE_REQUIRE_RECIEVED = "6"; // 组织入库完成
	public static final String REQUEST_ORDER_ORGANIZE_REQUIRE_SOMERECIEVED = "7"; // 组织部分领用
	public static final String REQUEST_ORDER_ORGANIZE_REQUIRE_RESUME = "8"; // 审批拒绝
	public static final String REQUEST_ORDER_ORGANIZE_REQUIRE_GARBAGE = "9"; // 废弃

	// 申请工单明细表中实物审批状态
	public static final String REQUEST_ORDER_DTL_FEA_STATE_AWAITVERIFY = "0"; // 待审批
	public static final String REQUEST_ORDER_DTL_FEA_STATE_APPLY = "1"; // 审批通过
	public static final String REQUEST_ORDER_DTL_FEA_STATE_RESUME = "2"; // 审批拒绝
	public static final String REQUEST_ORDER_DTL_FEA_STATE_SUPPER_VERIFY = "99"; // 实物继续提交上级审批

	public static final String REQUEST_ORDER_DTL_RETURN_STORE_TYPE_RETURN_CORP = "1"; // 退本公司
	public static final String REQUEST_ORDER_DTL_RETURN_STORE_TYPE_RETURN_SUPPLIER = "2"; // 退供应商

	// 申请工单明细表中实物审批状态
	public static final String REQUEST_ORDER_DTL_STATE_AWAITSEND = "0"; // 未发货
	public static final String REQUEST_ORDER_DTL_STATE_SENDED = "1"; // 已发货
	public static final String REQUEST_ORDER_DTL_STATE_RECIEVED = "2"; // 已接收

	// 个人申请单触发主动性
	public static final String REQUEST_ORDER_PERSON_INST_ORDER_TYPE_REQUIRE_REQ = "1"; // 实物领用申请单
	public static final String REQUEST_ORDER_PERSON_INST_ORDER_TYPE_DISPATCH = "2"; // 个人库存实物分配单

	// 个人申请单触发主动性
	public static final String OPER_ORDER_PERSON_INST_ORDER_TYPE_REQUIRE_REQ = "1"; // 实物领用申请单
	public static final String OPER_ORDER_PERSON_INST_ORDER_TYPE_DISPATCH = "2"; // 个人库存实物分配单

	public static final String OPER_ORDER_ALLOCATION_BILL = "1"; // 调拨通知单
	public static final String OPER_ORDER_DELIVERY_BILL = "2"; // 需求配送通知单
	public static final String SCORE_INST_RETURN_BILL = "3"; // 返库通知单
	public static final String SCORE_INST_WAREH_BILL = "4"; // 入库单录入
	public static final String OTHER_INST_WAREH_BILL = "5"; // 积分实物其他出入库单录入
	public static final String OPER_ORDER_PERSON_INST_ORDER_REQUER = "6"; // 个人库存配送
	public static final String OPER_ORDER_PERSON_INST_ORDER_RETURE = "7"; // 个人库存退货单
	public static final String OPER_ORDER_NOTIFY_TYPE_ORG_RETURN = "8"; // 组织库存退货操作工单
	public static final String OPER_ORDER_SUPPER_ORG_IN = "9"; // 上级组织操作下级组织入库
	public static final String OPER_ORDER_SUPPER_ORG_OUT = "10"; // 上级组织操作下级组织出库
	public static final String OPER_ORDER_ORG_IN = "11"; // 盘点入库
	public static final String OPER_ORDER_ORG_OUT = "12"; // 盘点出库
	public static final String OPER_ORDER_USABLE_OUT = "13"; // 报废单录入出库
	public static final String OPER_ORDER_RETURN_OUT = "14";// 退货单录入

	/** 实物管理张远瞩 13793 END */

	/** 库存类型* */
	public static final String STOCK_TYPE = "1"; // 全部库存

	/** 叶知 leaf BEGIN */
	public static final String RES_CBOSS_UPLOAD_PATH = "RES_CBOSS_UPLOAD_PATH";// CBOSS上传
	public static final String RES_CBOSS_DOWNLOAD_PATH = "RES_CBOSS_DOWNLOAD_PATH";// CBOSS上传
	public static final String RES_CBOSS_TEMP_PATH = "RES_CBOSS_TEMP_PATH";// 终端临时文件使用FTP

	// 资源发票管理 上发地税FTP
	public static final String RES_INVOICE_FTP = "RES_INVOICE_FTP";// 资源发票管理上发地税FTP
	public static final String RES_INVOICE_PATH = "RES_INVOICE_PATH";// 资源发票管理上发地税FTP
	// 电子商务 上传全省开发号码FTP
	public static final String RES_PHONE_PATH = "RES_PHONE_PATH";// 资源发票管理上发地税FTP

	// 本地地址
	public static final String RES_INVOICE_FIX_FTP = "RES_INVOICE_FIX_FTP";// 资源发票管理上发地税FTP（铁通）
	public static final String RES_INVOICE_FIX_PATH = "RES_INVOICE_FIX_PATH";// 资源发票管理上发地税FTP本地地址（铁通）

	// 个人实物退货申请 INVOICE_STATE
	public static final String REQUEST_ORDER_PERSON_RETURN_STATE_1 = "1"; // 新建
	public static final String REQUEST_ORDER_PERSON_RETURN_STATE_2 = "2"; // 提交待审批
	public static final String REQUEST_ORDER_PERSON_RETURN_STATE_3 = "3"; // 审批通过入库
	public static final String REQUEST_ORDER_PERSON_RETURN_STATE_4 = "4"; // 部分审批通过入库
	public static final String REQUEST_ORDER_PERSON_RETURN_STATE_5 = "5"; // 审批拒绝
	public static final String REQUEST_ORDER_PERSON_RETURN_STATE_6 = "6"; // 废弃
	public static final String REQUEST_ORDER_PERSON_RETURN_STATE_7 = "7"; // 强制回收完成

	// 个人退货申请单触发主动性
	public static final String REQUEST_ORDER_PERSON_RETURN_TYPE_1 = "1"; // 【1】个人退货申请单
	public static final String REQUEST_ORDER_PERSON_RETURN_TYPE_2 = "2"; // 【2】个人库存强制回收单

	public static final String RES_OPER_ORDER_STATE_ZERO = "0"; // 已发货
	public static final String RES_OPER_ORDER_STATE_ONE = "1"; // 完全接收
	public static final String RES_OPER_ORDER_STATE_TWO = "2"; // 部分接收
	public static final String RES_OPER_ORDER_STATE_THREE = "3"; // 废弃

	public static final String RES_OPER_ORDER_EVENT_TYPE_ZERO = "0"; // 配送通知单
	public static final String RES_OPER_ORDER_EVENT_TYPE_ONE = "1"; // 调拨通知单
	public static final String RES_OPER_ORDER_EVENT_TYPE_TWO = "2"; // ？？？

	// 个人实物退货申请 INVOICE_STATE
	public static final String REQUEST_ORDER_REQUIRE_INVOICE_STATE_1 = "1"; // 新建
	public static final String REQUEST_ORDER_REQUIRE_INVOICE_STATE_2 = "2"; // 提交待审批
	public static final String REQUEST_ORDER_REQUIRE_INVOICE_STATE_3 = "3"; // 审批通过入库
	public static final String REQUEST_ORDER_REQUIRE_INVOICE_STATE_4 = "4"; // 部分审批通过入库
	public static final String REQUEST_ORDER_REQUIRE_INVOICE_STATE_5 = "5"; // 审批拒绝
	public static final String REQUEST_ORDER_REQUIRE_INVOICE_STATE_6 = "6"; // 废弃
	public static final String REQUEST_ORDER_REQUIRE_INVOICE_STATE_7 = "7"; // 强制回收完成

	public static final String RES_INSTANCE_MANAGESTATUS_CLOSE = "1"; // 关闭
	public static final String RES_INSTANCE_MANAGESTATUS_OPEN = "2"; // 开放

	// 资源调拨单的几种状态
	public static final String OPER_ORDER_ALLOCATION_INVOICE_STATE_NEW = "0"; // 新建
	public static final String OPER_ORDER_ALLOCATION_INVOICE_STATE_AWAIT_SEND = "1"; // 待发货
	public static final String OPER_ORDER_ALLOCATION_INVOICE_STATE_AREADY_SEND = "2"; // 已发货
	public static final String OPER_ORDER_ALLOCATION_INVOICE_STATE_ALL_RECIEVED = "3"; // 全部接收
	public static final String OPER_ORDER_ALLOCATION_INVOICE_STATE_SOME_RECIEVED = "4"; // 部分接收
	public static final String OPER_ORDER_ALLOCATION_INVOICE_STATE_GARBAGE = "5"; // 废弃

	// 资源配送通知单的几种状态 NotifyState
	public static final String OPER_ORDER_LOGISTICS_NOTIFY_STATE_NEW = "0"; // 新建
	public static final String OPER_ORDER_LOGISTICS_NOTIFY_STATE_AWAIT_SEND = "1"; // 待发货
	public static final String OPER_ORDER_LOGISTICS_NOTIFY_STATE_AREADY_SEND = "2"; // 已发货
	public static final String OPER_ORDER_LOGISTICS_NOTIFY_STATE_ALL_RECIEVED = "3"; // 全部接收
	public static final String OPER_ORDER_LOGISTICS_NOTIFY_STATE_SOME_RECIEVED = "4"; // 部分接收
	public static final String OPER_ORDER_LOGISTICS_NOTIFY_STATE_GARBAGE = "5"; // 废弃

	// 退货单的几种状态
	public static final String OPER_ORDER_ORG_RETURN_INVOICE_STATE_NEW = "0"; // 新建
	public static final String OPER_ORDER_ORG_RETURN_INVOICE_STATE_AWAIT_SEND = "1"; // 待发货
	public static final String OPER_ORDER_ORG_RETURN_INVOICE_STATE_AREADY_SEND = "2"; // 已发货
	public static final String OPER_ORDER_ORG_RETURN_INVOICE_STATE_ALL_RECIEVED = "3"; // 全部接收
	public static final String OPER_ORDER_ORG_RETURN_INVOICE_STATE_SOME_RECIEVED = "4"; // 部分接收
	public static final String OPER_ORDER_ORG_RETURN_INVOICE_STATE_GARBAGE = "5"; // 废弃

	// 资源调拨单的几种状态TARGET_TYPE_ID：
	// 证件类型：1手机号 2身份证号 3客户编号 4申请单号 5操作工单号 6领用操作员工号
	public static final String RES_USED_RECORD_TARGET_TYPE_ID_PHONE = "1";
	public static final String RES_USED_RECORD_TARGET_TYPE_ID_IDENT = "2";
	public static final String RES_USED_RECORD_TARGET_TYPE_ID_CUSTID = "3";
	public static final String RES_USED_RECORD_TARGET_TYPE_ID_REQID = "4";
	public static final String RES_USED_RECORD_TARGET_TYPE_ID_OPERID = "5";
	public static final String RES_USED_RECORD_TARGET_TYPE_ID_OP_ID = "6";

	// 回收单工单状态ORDER_STATUS
	public static final String RES_ORDER_STATUS_1 = "1"; // 1.初始
	public static final String RES_ORDER_STATUS_2 = "2"; // 2.待处理
	public static final String RES_ORDER_STATUS_3 = "3"; // 3.延期申请
	public static final String RES_ORDER_STATUS_4 = "4"; // 4.延期审批通过 --执行task 延期数据
	public static final String RES_ORDER_STATUS_5 = "5"; // 5.延期审批不通过 --执行task 回收数据
	public static final String RES_ORDER_STATUS_6 = "6"; // 6.同意收回--执行task 回收数据
	public static final String RES_ORDER_STATUS_7 = "7"; // 7.收回完成
	public static final String RES_ORDER_STATUS_8 = "8"; // 8.单据撤销

	// 实物管理 END

	/************************************** 有价卡管理 BEGIN **************************************/

	public static final String RES_PAY_CARD_COUNTRY = "5001";// 数据库查询用，res_spec表中
	// 充值卡 标识
	public static final String RES_PAY_CARD_LOCAL = "5000";// 数据库查询用，res_spec表中
	// 缴费卡 标识

	public static final String RES_PAY_CARD_VALUE_5000 = "01";// 有价卡面值，单位为分。面值对应表中的值
	public static final String RES_PAY_CARD_VALUE_10000 = "02";
	public static final String RES_PAY_CARD_VALUE_2000 = "03";
	public static final String RES_PAY_CARD_VALUE_30000 = "04";
	public static final String RES_PAY_CARD_VALUE_50000 = "05";
	public static final String RES_PAY_CARD_VALUE_3000 = "06";
	public static final String RES_PAY_CARD_VALUE_20000 = "07";
	public static final String RES_PAY_CARD_VALUE_100000 = "08";
	public static final String RES_PAY_CARD_VALUE_200000 = "09";
	public static final String RES_PAY_CARD_VALUE_1000 = "10";

	public static final String RES_PAY_CARD_5000 = "5000";// 有价卡面值，单位为分
	public static final String RES_PAY_CARD_10000 = "10000";
	public static final String RES_PAY_CARD_2000 = "2000";
	public static final String RES_PAY_CARD_30000 = "30000";
	public static final String RES_PAY_CARD_50000 = "50000";
	public static final String RES_PAY_CARD_3000 = "3000";
	public static final String RES_PAY_CARD_20000 = "20000";
	public static final String RES_PAY_CARD_100000 = "100000";
	public static final String RES_PAY_CARD_200000 = "200000";
	public static final String RES_PAY_CARD_1000 = "1000";

	public static final String RES_CARD_VALUE = "12";// 卡的大类（有价卡）
	public static final String RES_WLANCARD_VALUE = "1201";// 配置WLAN卡的种类
	public static final String RES_WLANCARD_IMPORT_REGION = "000";// 入库时候设置
	// 地区编号为省公司
	public static final String RES_WLANCARD_IMPORT_COUNTY = "0000";// 有价卡导入时县市编码

	public static final String RES_PAYCARD_VALUE = "RES_PAYCARD_VALUE";// 有价卡面值DS查询条件
	public static final String RES_PAYCARD_TYPE = "85103";// 有价卡类型DS查询条件
	public static final String RES_PAYCARD_OP_NAME = "85101";// 有价卡操作名称
	public static final String RES_PAYCARD_STATUS = "RES_PAYCARD_STATUS";// 有价卡状态

	// public static final String RES_PAYCARD_STATE_IMPORT = "1";// 已录入
	// public static final String RES_PAYCARD_STATE_ACTIVE = "2";// 可销售
	// public static final String RES_PAYCARD_STATE_CANCEL = "4";// 已注销
	// public static final String RES_PAYCARD_STATE_REACH = "5";// 已到货
	// public static final String RES_PAYCARD_STATE_SOTRAGE = "6";// 已入库
	// public static final String RES_PAYCARD_STATE_SALED = "11";// 已销售
	// public static final String RES_PAYCARD_STATE_USED = "12";// 已充值

	/**************** 辽宁有价卡状态 **********************/
	// LN：1.未生成;2.生成;3.待激活;4.激活;5.销售;6.锁定;7.挂失;8.废弃;9.已使用;10.在途;11.更换；
	public static final String RES_PAYCARD_STATE_1 = "1"; // 1未生成
	public static final String RES_PAYCARD_STATE_2 = "2"; // 2生成
	public static final String RES_PAYCARD_STATE_3 = "3"; // 3待激活 （各渠道在领取有价卡的时候，所有有价卡即进入待激活状态）
	public static final String RES_PAYCARD_STATE_4 = "4"; // 4激活 （在此状态下，用户可以通过拨打充值业务接入码或经由CRM系统进行充值） 此状态暂时不用
	public static final String RES_PAYCARD_STATE_5 = "5"; // 5占用 （当本省有价卡为本省用户充值后，该有价卡进入充值占用状态）
	public static final String RES_PAYCARD_STATE_6 = "6"; // 6 锁定
	public static final String RES_PAYCARD_STATE_7 = "7"; // 7挂失（清退）
	public static final String RES_PAYCARD_STATE_8 = "8"; // 8废弃
	public static final String RES_PAYCARD_STATE_9 = "9"; // 9已使用 （该状态说明有价卡已经充值成功）
	public static final String RES_PAYCARD_STATE_10 = "10"; // 10在途（一个中间变量，有价卡调配时候使用）
	public static final String RES_PAYCARD_STATE_11 = "11"; // 11更换

	// 有价卡卡资源类型
	public static final String RES_PAYCARD_CARDTYPE_COUNTRY = "80";// 全国卡
	public static final String RES_PAYCARD_CARDTYPE_LOCAL = "81"; // 本地卡
	public static final String RES_PAYCARD_CARDTYPE_EGBOSS = "83"; // EGBOSS卡
	public static final long RES_PAYCARD_IN_ORG = 101; // 表示制卡班
	public static final int VC_LS_AMOUNT = 100; // 表示VC平台最大500条离散卡号
	public static final int VC_LX_AMOUNT = 500; // 表示VC平台最大500条连续卡号

	public static final String RES_PAYCARD_LOCK = "1";// 加锁
	public static final String RES_PAYCARD_UNLOCK = "0";// 解锁
	public static final String RES_PAYCARD_BROKEN = "1";// 1坏卡
	public static final String RES_PAYCARD_RETURN = "2";// 2退卡

	public static final String RES_PAYCARD_IMPORT_REGION = "000";// 有价卡导入时地市编码
	public static final String RES_PAYCARD_IMPORT_COUNTY = "0000";// 有价卡导入时县市编码
	public static final String RES_PAYCARD_IMPORT_MARK = "900";// 设置有价卡标识，存到错误表中显示用。
	public static final String RES_PAYCARD_IMPORT_HAVESAME = "0";// 存入临时表后的状态，有相同的话状态更改为“1”
	public static final String FTP_PATH_CODE_PAYCARD = "RES_PAY_CARD";// 有价卡FTP配置

	public static final String RES_PAYCARD_SYN_PHONEHEAD = "86";// 号码头
	public static final String RES_PAYCARD_SYN_COL_CHARGE_DATE = "CHARGE_DATE";// 字段名：充值时间
	public static final String RES_PAYCARD_SYN_COL_CARD_STATE = "CARD_STATE";// 字段名：卡状态
	public static final String RES_PAYCARD_SYN_COL_BILL_ID = "BILL_ID";// 字段名：
	public static final String RES_PAYCARD_SYN_COL_REGION_ID_ID = "REGION_ID";// 字段名：
	public static final String RES_PAYCARD_SYN_COL_COUNTY_ID_ID = "COUNTY_ID";// 字段名：
	// 充值卡号
	public static final String RES_PAYCARD_SYN_DONE_STATE = "1";// 同步文件中充值成功标志

	public static final String RES_PAYCARD_CHARGE_DONOTFOUNDCARD = "10";// 不存在该充值卡
	public static final String RES_PAYCARD_CHARGE_PWDERROR = "3";// 充值密码错误
	public static final String RES_PAYCARD_CHARGE_CARDEXPIRED = "8";// 充值卡已过期
	public static final String RES_PAYCARD_CHARGE_CARDUSED = "1";// 充值卡已充值
	public static final String RES_PAYCARD_CHARGE_CARDDONOTSALE = "5";// 充值卡未销售
	public static final String RES_PAYCARD_CHARGE_CARDCANCEL = "7";// 充值卡已注销
	public static final String RES_PAYCARD_CHARGE_SUCCESS = "0";// 正常
	public static final String IO_RESULT_SUCCESS = "0";// 0表示出入库成功
	public static final String IO_RESULT_ERROR = "1";// 1表示出入库失败

	public static final String RES_PAYCARD_CHECK_STATUS_0 = "0";// 初始
	public static final String RES_PAYCARD_CHECK_STATUS_1 = "1";
	public static final String RES_PAYCARD_CHECK_STATUS_2 = "2";// 对账成功
	public static final String RES_PAYCARD_CHECK_STATUS_3 = "3";// 对账失败

	/************************************** 有价卡管理 张阳 END **************************************/

	/** 接入号码管理 张阳 BEGIN */
	public static final String RES_ACCESSNUM_DELETE = "10";// 接入号码 删除状态
	public static final String RES_ACCESSNUM_NUM_ORIGIN_SPEC_ID = "100501";// 接入号的specId

	/** 接入号码管理 张阳 END */

	/** 短信通知配置 张阳 BEGIN */
	public static final String RES_DONESMS_DELETE = "4";// 接入号码 删除状态
	/** 短信通知配置 张阳 END */

	/** 行业应用号码号段管理 张阳 BEGIN */
	public static final String RES_PHONE_SEGMENT_INDUSTRY_DELETE = "4";// 接入号码
	// 删除状态
	/** 行业应用号码号段管理 张阳 END */

	/** 疑似窜货 白敏 BEGIN */
	public static final String COL_NAME = "COL_NAME";// 疑似窜货
	/** 疑似窜货 张阳 END */

	// 宽带包月卡状态
	public static final String CARD_STATE_LOCK_WAITCHECK = "L";// 锁卡、待稽核状态
	public static final String CARD_STATE_WAITACTIVE = "W";// 当进行解锁后，状态修改成待激活状态
	public static final String CARD_STATE_ACTIVE = "A";// 激活状态
	public static final String CARD_STATE_USE = "U";// 使用状态
	public static final String CARD_STATE_INVA = "I";// 到期失效状态，不一定要移到备份表中
	public static final String CARD_STATE_DEL = "E";// 无效状态，可以移到备份文件中

	/**************************** 有价卡业务代码 ***************************************/

	public static final String PAYCARD_MGR_BUSI_ID_1 = "900212";// 有价卡下发
	public static final String PAYCARD_MGR_BUSI_ID_2 = "900211";// 有价卡返库
	public static final String PAYCARD_MGR_BUSI_ID_3 = "900213";// 有价卡废弃
	public static final String PAYCARD_MGR_BUSI_ID_4 = "900214";// 有价卡延期
	public static final String PAYCARD_MGR_BUSI_ID_5 = "900218";// 有价卡接收
	public static final String PAYCARD_MGR_BUSI_ID_6 = "900219";// 有价卡收回
	public static final String PAYCARD_MGR_BUSI_ID_7 = "900220";// 有价卡生成
	public static final String PAYCARD_MGR_BUSI_ID_8 = "900217";// 有价卡换卡
	public static final String PAYCARD_MGR_BUSI_ID_9 = "900221";// 有价卡废弃审核
	public static final String PAYCARD_MGR_BUSI_ID_10 = "900222";// 有价卡批量销售
	public static final String PAYCARD_MGR_BUSI_ID_11 = "900215";// 有价卡销售
	public static final String PAYCARD_MGR_BUSI_ID_12 = "900230";// 有价卡返销
	public static final String PAYCARD_MGR_BUSI_ID_13 = "900231";// SIM卡返销
	public static final String PAYCARD_MGR_BUSI_ID_14 = "900232";// 有价卡赔偿返销

	public static final String PAYCARD_BUSI_CODE_1 = "9001201"; // 促销品有价卡赠卡回退
	public static final String PAYCARD_BUSI_CODE_2 = "9001202"; // 订单有价卡分配
	public static final String PAYCARD_BUSI_CODE_3 = "9001203"; // 返销有价卡入库
	public static final String PAYCARD_BUSI_CODE_4 = "9001204"; // 分配有价卡入库
	public static final String PAYCARD_BUSI_CODE_5 = "9001205"; // 回退有价卡入库
	public static final String PAYCARD_BUSI_CODE_6 = "9001206"; // 领用有价卡入库
	public static final String PAYCARD_BUSI_CODE_7 = "9001207"; // 迁移有价卡入库
	public static final String PAYCARD_BUSI_CODE_8 = "9001208"; // 删除有价卡入库
	public static final String PAYCARD_BUSI_CODE_9 = "9001209"; // 修改有价卡入库
	public static final String PAYCARD_BUSI_CODE_10 = "9001210"; // 有价卡批量注销删除
	public static final String PAYCARD_BUSI_CODE_11 = "9001211"; // 有价卡批量注销删除(老卡)
	public static final String PAYCARD_BUSI_CODE_12 = "9001212"; // 有价卡补激活
	public static final String PAYCARD_BUSI_CODE_13 = "9001213"; // 有价卡补激活预激活
	public static final String PAYCARD_BUSI_CODE_14 = "9001214"; // 有价卡单店批量促销赠送
	public static final String PAYCARD_BUSI_CODE_15 = "9001215"; // 有价卡单店批量促销赠送预激活
	public static final String PAYCARD_BUSI_CODE_16 = "9001216"; // 有价卡单店批量销售
	public static final String PAYCARD_BUSI_CODE_17 = "9001217"; // 有价卡单店批量销售预激活
	public static final String PAYCARD_BUSI_CODE_18 = "9001218"; // 有价卡单店销售
	public static final String PAYCARD_BUSI_CODE_19 = "9001219"; // 有价卡刮卡换卡
	public static final String PAYCARD_BUSI_CODE_20 = "9001220"; // 有价卡划拨调出
	public static final String PAYCARD_BUSI_CODE_21 = "9001221"; // 有价卡划拨调入
	public static final String PAYCARD_BUSI_CODE_22 = "9001222"; // 有价卡加载
	public static final String PAYCARD_BUSI_CODE_23 = "9001223"; // 有价卡批量销售（批量）
	public static final String PAYCARD_BUSI_CODE_24 = "9001224"; // 有价卡批量销售预激活 ？？
	public static final String PAYCARD_BUSI_CODE_25 = "9001225"; // 有价卡批量预售
	public static final String PAYCARD_BUSI_CODE_26 = "9001226"; // 有价卡入库
	public static final String PAYCARD_BUSI_CODE_28 = "9001228"; // 有价卡销售（单张）
	public static final String PAYCARD_BUSI_CODE_29 = "9001229"; // 有价卡预激活批量激活方式1（暂时没用到）
	public static final String PAYCARD_BUSI_CODE_30 = "9001230"; // 有价卡预激活批量激活方式2（暂时没用到）
	public static final String PAYCARD_BUSI_CODE_31 = "9001231"; // 有价卡预售
	public static final String PAYCARD_BUSI_CODE_32 = "9001232"; // 有价卡预售激活
	public static final String PAYCARD_BUSI_CODE_33 = "9001233"; // 有价卡预祛激活
	public static final String PAYCARD_BUSI_CODE_34 = "9001234"; // 有价卡赠卡
	public static final String PAYCARD_BUSI_CODE_35 = "9001235"; // 有价卡重置有效期
	public static final String PAYCARD_BUSI_CODE_36 = "9001236"; // 有价卡资源录入
	public static final String PAYCARD_BUSI_CODE_37 = "9001237"; // 有价卡库存回收
	public static final String PAYCARD_BUSI_CODE_38 = "9001238"; // 有价卡资源退库老卡
	public static final String PAYCARD_BUSI_CODE_39 = "9001239"; // 自动分配有价卡入库
	public static final String PAYCARD_BUSI_CODE_40 = "9001240"; // 自动迁移有价卡
	public static final String PAYCARD_BUSI_CODE_41 = "9001241"; // 售不记名卡
	public static final String PAYCARD_BUSI_CODE_42 = "9001242"; // 有价卡生成
	public static final String PAYCARD_BUSI_CODE_27 = "9001227"; // 有价卡退卡(坏卡-实物退库)
	public static final String PAYCARD_BUSI_CODE_43 = "9001243"; // 有价卡退卡(退卡-资源退库)
	public static final String PAYCARD_BUSI_CODE_44 = "9001244"; // 有价卡信息变更（号段模式）
	public static final String PAYCARD_BUSI_CODE_45 = "9001245"; // 有价卡信息变更（文件方式）
	public static final String PAYCARD_BUSI_CODE_46 = "9001246"; // 有价卡调配（号段模式）
	public static final String PAYCARD_BUSI_CODE_47 = "9001247"; // 有价卡调配（文件方式）
	public static final String PAYCARD_BUSI_CODE_48 = "9001248"; // 有价卡库存回收（老卡回收）

	public static final String POSTDEFCARD_BUSI_CODE_01 = "9012101"; // 后定义卡销售
	public static final String POSTDEFCARD_BUSI_CODE_02 = "9012102"; // 后定义卡销售回退
	public static final String POSTDEFCARD_BUSI_CODE_03 = "9012103"; // 后定义卡激活(实时赋值)
	public static final String POSTDEFCARD_BUSI_CODE_04 = "9012104"; // 后定义卡反激活(实时赋值)
	public static final String POSTDEFCARD_BUSI_CODE_05 = "9012105"; // 后定义卡BOSS侧业务登记
	public static final String POSTDEFCARD_BUSI_CODE_06 = "9012106"; // 后定义卡BOSS侧业务登记(坏卡补打)
	public static final String POSTDEFCARD_BUSI_CODE_07 = "9012107"; // 后定义卡BOSS侧业务回退登记
	public static final String POSTDEFCARD_BUSI_CODE_08 = "9012108"; //
	public static final String POSTDEFCARD_BUSI_CODE_09 = "9012109"; // 实时赋值后定义卡营业厅冲正

	public static final String REUSE_FLAG_FEE_ENABLE = "1";// 费用不可修改（由号码实例信息决定费用）
	public static final String REUSE_FLAG_FEE_DISABLE = "0";// 费用可修改（由开户决定费用，号码生成默认这个）
	public static final String ENTITY_BUSI_CODE_01 = "9054001"; // 实体卡生成
	public static final String ENTITY_BUSI_CODE_02 = "9054002"; // 实体卡入库
	public static final String ENTITY_BUSI_CODE_03 = "9054003"; // 实体卡激活
	public static final String ENTITY_BUSI_CODE_04 = "9054004"; // 实体卡锁定
	public static final String ENTITY_BUSI_CODE_05 = "9054005"; // 实体卡退订

	// 有价卡接口类型定义 "1";有价卡废弃 "2";有价卡实占 "3";有价卡返销 "4";有价卡充值
	public static final String INTF_PAYCARD_OPERTYPE_1 = "1";// 有价卡废弃
	public static final String INTF_PAYCARD_OPERTYPE_2 = "2";// 有价卡实占
	public static final String INTF_PAYCARD_OPERTYPE_3 = "3";// 有价卡返销
	public static final String INTF_PAYCARD_OPERTYPE_4 = "4";// 有价卡充值

	/**************************** 有价卡业务代码 ***************************************/

	/********************************************** 终端管理 16 BEGIN **********************************************/
	// ----------------------------------------------终端订单成功 失败标识 -------------------------------------------------
	public static final String RES_TEMI_STATUS_0 = "0";// 待确认
	public static final String RES_TEMI_STATUS_1 = "1";// 调拨初始
	public static final String RES_TEMI_STATUS_2 = "2";// 成功
	public static final String RES_TEMI_STATUS_3 = "3";// 取消
	// ----------------------------------------------终端业务操作编码-------------------------------------------------
	public static final String RES_TEMI_BUSI_0 = "9016000";// 终端采购预入库删除
	public static final String RES_TEMI_BUSI_1 = "9016001";// 预入库
	public static final String RES_TEMI_BUSI_2 = "9016002";// 在途下发
	public static final String RES_TEMI_BUSI_3 = "9016003";// 预入库
	public static final String RES_TEMI_BUSI_4 = "9016004";// 强制入库
	public static final String RES_TEMI_BUSI_5 = "9016005";// 调拨通知单
	public static final String RES_TEMI_BUSI_6 = "9016006";// 终端信息修改
	public static final String RES_TEMI_BUSI_7 = "9016007";// 在途返库
	public static final String RES_TEMI_BUSI_8 = "9016008";// 终端出库
	public static final String RES_TEMI_BUSI_9 = "9016009";// 终端换货出库

	public static final String RES_TEMI_BUSI_10 = "9016010";// 终端换货入库
	public static final String RES_TEMI_BUSI_11 = "9016011";// 终端退货入库
	public static final String RES_TEMI_BUSI_12 = "9016012";// 调拨通知单
	public static final String RES_TEMI_BUSI_13 = "9016013";// 调拨通知单入库

	public static final String RES_TEMI_BUSI_20 = "9016020";// 终端裸机销售
	public static final String RES_TEMI_BUSI_21 = "9016021";// 终端退机 --销售退机请用26
	public static final String RES_TEMI_BUSI_22 = "9016022";// 终端配件销售
	public static final String RES_TEMI_BUSI_23 = "9016023";// 终端积分兑换销售
	public static final String RES_TEMI_BUSI_24 = "9016024";// 终端积分兑换销售退机
	public static final String RES_TEMI_BUSI_25 = "9016025";// 终端裸机销售换机
	public static final String RES_TEMI_BUSI_26 = "9016026";// 终端裸机销售退机
	public static final String RES_TEMI_BUSI_27 = "9016027";// 终端捆绑销售
	public static final String RES_TEMI_BUSI_28 = "9016028";// 终端租机
	public static final String RES_TEMI_BUSI_29 = "9016029";// 积分换手机IMEI补入
	public static final String RES_TEMI_BUSI_30 = "9016030";// 特价终端销售换机
	public static final String RES_TEMI_BUSI_31 = "9016031";// 特价终端销售
	public static final String RES_TEMI_BUSI_32 = "9016032";// 特价终端销售退机
	public static final String RES_TEMI_BUSI_33 = "9016033";// 代理商G3手机零售
	public static final String RES_TEMI_BUSI_34 = "9016034";// 疑似串货数据上报
	public static final String RES_TEMI_BUSI_35 = "9016035";// 代理商活动换机
	public static final String RES_TEMI_BUSI_36 = "9016036";// 终端配件换货
	public static final String RES_TEMI_BUSI_37 = "9016037";// 终端调拨入库

	// public static final String RES_TEMI_RES_STATUS_0 = "0";// 0初始
	public static final String RES_TEMI_RES_STATUS_1 = "1";// 1完好
	public static final String RES_TEMI_RES_STATUS_2 = "2";// 2报废
	public static final String RES_TEMI_RES_STATUS_3 = "3";// 3维修
	public static final String RES_TEMI_RES_STATUS_4 = "4";// 4退机
	public static final String RES_TEMI_RES_STATUS_5 = "5";// 5换机
	public static final String RES_TEMI_RES_STATUS_9 = "6";// 6坏机

	// SH:1.预入库，2入库，3待售，4选中，5占用，6在途，7预留，8预出库，9出库,10.调拨 （可能没有2，6，8）

	public static final String RES_TEMI_MANAGE_STATUS_1 = "1";// 预入库
	public static final String RES_TEMI_MANAGE_STATUS_2 = "2";// 入库
	public static final String RES_TEMI_MANAGE_STATUS_3 = "3";// 待售
	public static final String RES_TEMI_MANAGE_STATUS_4 = "4";// 选中
	public static final String RES_TEMI_MANAGE_STATUS_5 = "5";// 占用
	public static final String RES_TEMI_MANAGE_STATUS_6 = "6";// 在途
	public static final String RES_TEMI_MANAGE_STATUS_7 = "7";// 预留
	public static final String RES_TEMI_MANAGE_STATUS_8 = "8";// 预出库
	public static final String RES_TEMI_MANAGE_STATUS_9 = "9";// 出库
	public static final String RES_TEMI_MANAGE_STATUS_10 = "10";// 调拨在途

	// ----------------------------------------------终端类型编码-------------------------------------------------------
	public static final String RES_TEMI_TYPE_1 = "1";// 2G手机
	public static final String RES_TEMI_TYPE_2 = "2";// 3G上网版
	public static final String RES_TEMI_TYPE_3 = "3";// 3G手机
	public static final String RES_TEMI_TYPE_4 = "4";// 3G数据卡
	public static final String RES_TEMI_TYPE_5 = "5";// 3G无线固话

	// 终端来源 1601.本地 1602.集团
	public static final String TEMI_USE_RANGE_BASE = "1601";// 本地
	public static final String TEMI_USE_RANGE_GROUP = "1602";// 集团

	// 销售渠道 1营业厅、2代理商
	public static final String TEMI_SALES_RBOSS = "1";// 1营业厅
	public static final String TEMI_SALES_CHANNEL = "2";// 2代理商

	// 终端供应商用地区类型
	public static final String RS_COUNTRY = "RS_COUNTRY";
	public static final String RS_PROVINCE = "RS_PROVINCE";
	public static final String RS_CITY = "RS_CITY";

	public static final String RES_TEMI_STATUS = "RES_TEMI_STATUS";// 终端状态
	public static final String RES_TEMI_CONFIG_ID = "RES_TEMI_CONFIG_ID";// 终端配置
	public static final String RES_TEMI_COLOR_ID = "RES_TEMI_COLOR_ID";// 终端颜色
	public static final String USE_RANGE = "USE_RANGE"; // 终端来源 DS
	public static final String SALES_CHANNEL = "SALES_CHANNEL"; // 销售渠道 DS

	/********************************************** 终端管理 16 END **********************************************/

	/** Add for SMS by zhangyuanzhu zhangyz2 13793 2011-06-28 begain */
	// 申请单审批短信模板号
	// 您好：${CODE}已经对您提交的单号为$REQ_INVOICE_ID的$INVOICE_TYPE进行审核，单据当前状态为$INVOICE_STATE，详细请登录系统查询。
	public static final String SMS_TEMPLATE_ID_REQ_APPROVE = "2010300100005";

	// 申请单新建 您好：您已经成功新建一条$INVOICE_TYPE，单号为：$REQ_INVOICE_ID，详细请登录系统查询。
	public static final String SMS_TEMPLATE_ID_REQ_CREATE = "2010300100006";

	// 申请单废弃 您好：您已经成功废弃一条$INVOICE_TYPE，单号为：$REQ_INVOICE_ID，详细请登录系统查询。
	public static final String SMS_TEMPLATE_ID_REQ_DISCARD = "2010300100008";

	// 申请单提交待审批 您好：您已经成功提交一条$INVOICE_TYPE，单号为：$REQ_INVOICE_ID，详细请登录系统查询。
	public static final String SMS_TEMPLATE_ID_REQ_SUBMIT = "2010300100009";

	// 配送需求申请单生成调拨通知单
	// 你好：您所提交单号为$REQ_INVOICE_ID的配送需求申请单已经生成调拨单,对应通知单号为$RES_EVENT_ID，该单将从$CREATE_ORG_ID处进行调拨一批实物，届时，$REQ_INVOICE_ID的状态变更为$INVOICE_STATE，详情请登录系统查询。
	public static final String SMS_TEMPLATE_ID_REQ_TO_ALLOCATE = "2010300100007";

	// 配送需求申请单生成配送通知单
	// 你好：您所提交单号为$REQ_INVOICE_ID的配送需求申请单已经生成配送通知单,对应通知单号为$RES_EVENT_ID，该单将从$CREATE_ORG_ID处进行配送一批实物，届时，$REQ_INVOICE_ID的状态变更为$INVOICE_STATE，详情请登录系统查询。
	public static final String SMS_TEMPLATE_ID_REQ_TO_NOTIFY = "2010300100010";
	/** Add for SMS by zhangyuanzhu zhangyz2 13793 2011-06-28 end */

	/** 全国充值卡状态批量修改 短信通知模板号 * */
	// 您好：全国充值卡状态批量修改，成功修改卡状态$RES_CARDSTATE_NUM条，成功加解锁$RES_CARDMANAGE_NUM条，成功修改有效期$RES_VALIDATE_NUM条，详细请登录系统查询。
	public static final String SMS_TEMPLATE_ID_PAYCARD_MODIFY = "2010300100101";

	/** 全国充值到货确认 短信通知模板号 * */
	// 您好：全国充值卡到货确认，成功到货确认$RES_PAYCARD_REACH_NUM条，详细请登录系统查询。
	public static final String SMS_TEMPLATE_ID_PAYCARD_REACH = "2010300100102";

	/** 全国充值入库确认 短信通知模板号 * */
	// 您好：全国充值卡入库确认，成功入库确认${RES_PAYCARD_STORE_NUM}条，详细请登录系统查询。
	public static final String SMS_TEMPLATE_ID_PAYCARD_STORE = "2010300100103";

	/** 全国充值批量导入 短信通知模板号 * */
	// 您好：全国充值卡批量导入，成功导入${RES_PAYCARD_IMPORT_NUM}条，详细请登录系统查询。
	public static final String SMS_TEMPLATE_ID_PAYCARD_IMPORT = "2010300100104";

	/** 全国充值批量加锁，短信通知模板号 * */
	// 您好：全国充值卡批量加解锁，成功加锁${RES_PAYCARD_BATCH_LOCK_NUM}条，详细请登录系统查询。
	public static final String SMS_TEMPLATE_ID_BATCH_LOCK = "2010300100105";

	/** 全国充值批量解锁，短信通知模板号 * */
	// 您好：全国充值卡批量加解锁，成功解锁${RES_PAYCARD_BATCH_UNLOCK_NUM}条，详细请登录系统查询。
	public static final String SMS_TEMPLATE_ID_BATCH_UNLOCK = "2010300100106";

	// 自备SIM，不涉及出入库操作
	public static final String RES_SPEC_ID_SELF = "0";

	// SIM卡归属域类型 默认为 2（省公司）
	public static final String DOMAIN_TYPE = "2";

	// 实物管理无区域营销中心县市列表
	public static final String RES_ORG_TYPE = "40005"; // 40005
	// 电子商务组织渠道类型
	public static final String RES_ORG_CHANNEL_TYPE = "40006"; // 40006

	// 全球通品牌的号码,销户期为90天
	public static final long TRADE_LIMIT_DAY = 90;
	// 其他品牌30天
	public static final long OTHER_TRADE_LIMIT_DAY = 30;
	// 集团号码90天
	public static final long GROUP_PHONE_NUM_LIMIT_DAY = 90;

	// 营销资源关系类型
	public static final int RELAT_TYPE_1 = 1;

	// 号码分类模式
	public static final String RS_SORT_TYPE_1 = "RS_CHARGING_INFO";
	public static final String RS_SORT_TYPE_2 = "RS_CHOOSE_LEVEL";
	public static final String RS_SORT_TYPE_3 = "RS_IFEE_TYPE";
	public static final String RS_SORT_TYPE_4 = "RS_AGENT_LEVEL";

	// 仓库编码
	public static final String RS_STORE_CODE = "RS_STORE_CODE_";

	public static final String RS_CHARGING_INFO_1 = "30000199"; // 末尾带4
	public static final String RS_CHARGING_INFO_2 = "30000198"; // 其他位带4（末尾不带4）
	public static final String RS_CHARGING_INFO_3 = "30000197"; // 所有位都不带四
	public static final String RS_CHARGING_INFO_4 = "0"; // 任意位带4

	// 终端需求单状态
	public static final String RS_APPLY_ORDER_0 = "0";// 初始
	public static final String RS_APPLY_ORDER_1 = "1";// 已汇总
	public static final String RS_APPLY_ORDER_2 = "2";// 已审核
	public static final String RS_APPLY_ORDER_3 = "3";// 已确认
	public static final String RS_APPLY_ORDER_4 = "4";// 回退
	public static final String RS_APPLY_ORDER_5 = "5";// 回退（省公司）

	// 终端需求单类型
	public static final int RS_ORDER_TYPE_0 = 0;// 营业厅申请
	public static final int RS_ORDER_TYPE_1 = 1;// 平台上汇总

	// 票据类型
	public static final String RS_INVOICE_SPEC_INVOICE = "100000010001";// 发票
	public static final String RS_INVOICE_SPEC_RECEIPT = "100000010002";// 收据
	public static final String RS_INVOICE_SPEC_TERMINAL = "100000010003";// 终端打印凭证
	public static final String RS_INVOICE_SPEC_OTHER = "100000010004";// 其他票据

	// 获取发票号码方式
	public static final String RS_INVOICE_GETWAY_ASC = "1";// 升序
	public static final String RS_INVOICE_GETWAY_DESC = "2";// 降序
	/******************************************** AND BY QIDB 202-05-23 ************************************************************************/
	// 二维码资源状态
	public static final String BARCODE_RES_STATUS_1 = "1"; // 1 初始
	public static final String BARCODE_RES_STATUS_2 = "2"; // 2 预售
	public static final String BARCODE_RES_STATUS_3 = "3"; // 3 选中
	public static final String BARCODE_RES_STATUS_4 = "4"; // 4 占用
	public static final String BARCODE_RES_STATUS_5 = "5"; // 5.冷冻
	public static final String BARCODE_RES_STATUS_6 = "6"; // 6 空闲
	public static final String BARCODE_RES_STATUS_7 = "7"; // 7 废弃
	// 二维码库存状态
	public static final String BARCODE_MANAGE_STATUS_1 = "1"; // 1 入库
	public static final String BARCODE_MANAGE_STATUS_2 = "2"; // 2 在途
	public static final String BARCODE_MANAGE_STATUS_3 = "3"; // 3 出库

	// 二维码订单类型
	public static final String BARCODE_ORDER_INSTORE = "100086"; // 1 入库
	public static final String BARCODE_ORDER_OUTSTORE = "100087"; // 2 在途

	// 二维码大类
	public static final String RES_TYPE_BARCODE = "1509";

	/** 资源大类 */
	public static final long TASK_PARAM_ID_1001 = 1001;
	/** 地市 */
	public static final long TASK_PARAM_ID_4000 = 4000;

	/** 起始IMSI */
	public static final long TASK_PARAM_ID_2001 = 2001;
	/** 结束IMSI */
	public static final long TASK_PARAM_ID_2002 = 2002;

	// 有价卡税率的科目
	public static final long RES_VOUCHER_TAX_1 = 500000000001L;
	public static final long RES_VOUCHER_TAX_2 = 500000000002L;

	// 终端税率的科目
	public static final long RES_VDEVICE_TAX_1 = 500000000003L;
	public static final long RES_VDEVICE_TAX_2 = 500000000004L;

	public static final String GET_IMSI_NUM_SEG_FLAG = "TRUE"; // 判断是否取 RES_IMSI_NUM_SEGMENT 表中的数据

	// prodIds 为offerId数组，当是在查询sim卡类型时，featureId取值200008，当是在查询号码段时featureId取值200024
	// 业务说明，根据offer+device 获取SIM卡规格， 或者，根据offer获取号码规格
	public static final long UPC_SIM_SPEC_QRY = 200008L;
	public static final long UPC_PHONE_SPEC_QRY = 200024L;
	public static final long FEATURE_ID_FOR_BATCH_CONN = 200064L; // 通过SIM卡物料号查询，对应的offer_id： SIM卡批开使用

	// 号码属性编码,号码生成时使用
	public static final String ATTR_PHONE_LENGTH = "PHONE_LENGTH"; // 号码长度
	public static final String ATTR_PHONE_DNC = "PHONE_DNC"; // NDC(National Destination Code)国内目的编码 ，MSISDN的组成部分

	/********************* 上线之后需要配置的静态数据 Begin *********************/

	// niucy
	public static final String RES_TENANT_FOR_ALLOCATION = "RES_TENANT_FOR_ALLOCATION"; // 存储用于号码分配的分表编号目前是从21表复制至91表
	public static final String RES_STATIC_SEGMENT_OF_ICCID_IMSI = "RES_STATIC_SEGMENT_OF_ICCID_IMSI"; // 存储ICCID和IMSI的Fix部分。
	public static final String ACTIVATION_STATUS_FILE_SWITCH = "ACTIVATION_STATUS_FILE_SWITCH"; // SIM卡制卡流程激活返回文件开关，1用批开、预激活的返回结果生成文件，2用假的数据模拟生成文件。
	public static final String RES_OTS_BATCH_ACTIVE_OFFERID = "RS_BATCH_ACTIVATION"; // OTS(off-the-shelf)卡批开使用的offerId
	public static final String RES_PHONE_SPEC_FOR_BIND = "RES_PHONE_SPEC_FOR_BIND"; // SIM卡制卡流程，绑定用的号码规格 100001
	public static final String RS_SIM_MANAGE_STATUS_ORIGIN = "RS_SIM_MANAGE_STATUS_ORIGIN"; // SIM卡未用状态
	public static final String RS_SIM_MANAGE_STATUS_USED = "RS_SIM_MANAGE_STATUS_USED"; // SIM卡已用状态
	public static final String RES_DEFAULT_CUST_MANAGER_ID = "RES_DEFAULT_CUST_MANAGER_ID"; // 默认客户经理ID。 base.BS_STATIC_DATE code
	public static final String RES_DEFAULT_CUST_MANAGER_PHONE = "RES_DEFAULT_CUST_MANAGER_PHONE"; // 默认客户经理PHONE。 base.BS_STATIC_DATE code
	public static final String RES_B2B_NUMBER_EXPIRATION_ALARM_DAYS = "RES_B2B_NUMBER_EXPIRATION_ALARM_DAYS"; // B2B号码预占过期预警天数 base.BS_STATIC_DATE code
	public static final String RES_DEFUALT_FEE_FOR_VOIP = "RES_DEFUALT_FEE_FOR_VOIP"; // VOIP号码的选号费
	public static final String RES_STATIC_SEGMENT_OF_ICCID_START_FOR_UH = "RES_STATIC_SEGMENT_OF_ICCID_START_FOR_UH"; // 存储ICCID号头。   TO 匈牙利
	public static final String RES_STATIC_SEGMENT_OF_ICCID_END_FOR_UH = "RES_STATIC_SEGMENT_OF_ICCID_END_FOR_UH"; // 存储ICCID号尾。   TO 匈牙利
	public static final String RES_STATIC_SEGMENT_OF_IMSI_FOR_UH = "RES_STATIC_SEGMENT_OF_IMSI_FOR_UH"; // 存储Imsi号头。   TO 匈牙利

	// 资源开关-- DK
	public static final String RES_SWITCH_LOCK_NUM = "RES_SWITCH_LOCK_NUM"; // 选号时 是否锁定号码开关
	public static final String RES_SWITCH_SEND_NP_RICI = "RES_SWITCH_SEND_NP_RICI"; // 开关：发送RICI给NP。 0关闭：直接默认号码发送成功，号码变成可售 ； 1开启：需要等待NP返回，将号码状态改成可售
	public static final String RES_SWITCH_OTHER_OPERATOR = "RES_SWITCH_OTHER_OPERATOR"; // 开关：判断发NP接口中OtherOp的取值。0：取RangeHolder的值，1：取固定01015
	public static final String RES_SWITCH_USE_LUHN = "RES_SWITCH_USE_LUHN"; // 开关：ICCID第19位是否使用Luhn算法获得 ,0不使用、1使用
	public static final String RES_SWITCH_USE_F = "RES_SWITCH_USE_F"; // 开关：丹麦ICCID生成第20位是否使用F
	public static final String RES_SWITCH_SAP_APPEND_F = "RES_SWITCH_SAP_APPEND_F"; // 开关：丹麦 input 文件需要使用F
	public static final String RES_SWITCH_ORG_FROM_NP = "RES_SWITCH_ORG_FROM_NP"; // 开关：通过号码去NP获得号码归属运营商信息
	public static final String RES_SWITCH_SHOW_RANGE_SPEC = "RES_SWITCH_SHOW_RANGE_SPEC"; // 开关：B2B选号页面，移网号码是否展示range的号码规格 。 0关闭（不展示）、1开启(展示Range的规格)
	public static final String RES_SWITCH_OSE_SEL_NUM = "RES_SWITCH_OSE_SEL_NUM"; // 开关：OSE选号，0先查询后预占，1先预占后查询
	public static final String RES_SWITCH_FOR_NUM_RETURN = "RES_SWITCH_FOR_NUM_RETURN"; // 开关：他网return回来号码，0关闭：不去NP查询号码信息，1开启：从NP获取号码信息

	// 资源开关-- HU
	public static final String RES_SWITCH_USE_LUHN_HU = "RES_SWITCH_USE_LUHN_HU"; // 开关：匈牙利ICCID第19位是否使用Luhn算法获得
	public static final String RES_SWITCH_USE_F_HU = "RES_SWITCH_USE_F_HU"; // 开关：匈牙利ICCID生成第20位是否使用F ,0不使用、1使用
	public static final String RES_SWITCH_SAP_APPEND_F_HU = "RES_SWITCH_SAP_APPEND_F_HU"; // 开关：匈牙利 input 文件需要使用F ,0不使用、1使用
	
	public static final String RECORD_OPER_ORDER_SWITCH = "RECORD_OPER_ORDER_SWITCH"; // 开关：是否记录 操作日志 0关闭、1开启
	public static final String RES_NUMBER_SPEC_FOR_PO = "RES_NUMBER_SPEC_FOR_PO"; // SIM卡制卡PO文件中，给SIM卡流程用的号码规格。
	public static final String RES_PORTIN_GSM_NUMBER_SPEC = "RES_PORTIN_GSM_NUMBER_SPEC"; // GSM携入号码规格，默认规格100006
	public static final String RES_PORTIN_FIXEDNUMBER_SPEC = "RES_PORTIN_FIXEDNUMBER_SPEC"; // FIXED携入号码规格，默认规格100106
	public static final String RES_PHONE_MARKETING_POOL = "RES_PHONE_MARKETING_POOL"; // 号码生成时默认放在市场部组织下
	public static final String RES_PHONE_SPEC_FOR_VOIP_OFFER = "RES_PHONE_SPEC_FOR_VOIP_OFFER"; // 提供给 VOIP 号码
	public static final String RES_PHONE_SPEC_FOR_PSTN = "RES_PHONE_SPEC_FOR_PSTN"; // 提供给新增转售PSTN号码 --wangbing 需要 2015-01-08
	// 提供给多卡多号，获取副号：号码规格的Double/Multiple SIM Offer --xuecy 需要
	public static final String RES_PHONE_SPEC_FOR_MULTIPLE_OFFER = "RES_PHONE_SPEC_FOR_MULTIPLE_OFFER";
	// 提供给多卡多号，获取副卡：SIM卡规格的 --xuecy 需要
	public static final String RES_SIM_SPEC_FOR_MULTIPLE_OFFER = "RES_SIM_SPEC_FOR_MULTIPLE_OFFER";
	public static final String RES_NUMBER_RANGE_EXPIRE_ALARM = "RES_NUMBER_RANGE_EXPIRE_ALARM"; // 获取B2B预留号码到期提醒天数
	public static final String RES_LOCK_SIM_HOUR = "RES_LOCK_SIM_HOUR"; // 获取SIM查询锁定时长
	public static final String RES_SELECT_PHONE_HOUR = "RES_SELECT_PHONE_HOUR"; // 获取号码选中时长
	public static final String RES_FIX_SINGLE_NUMBER = "RES_FIX_SINGLE_NUMBER"; // 默认固网单个号码合并规格100105
	public static final String RES_GSM_SINGLE_NUMBER = "RES_GSM_SINGLE_NUMBER"; // 默认移网单个号码合并规格100001

	/********************* 上线之后需要配置的静态数据 End *********************/

}
