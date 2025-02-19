/**
 * Copyright (C) 2013 Asiainfo-Linkage
 *
 *
 * @className:com.asiainfo.crm.so.exe.ws.crmcallams.CrmCallAmsWsConstants
 * @description:webservice常量定义
 * 
 * @version:${id} 
 * @author:cxy22xueyi
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2013-10-30    cxy22xueyi     v1.0.0   webservice常量定义
 *
 *
 */
package com.asiainfo.crm.so.exe.ws.crmcallams;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;

import com.ai.appframe2.complex.tab.split.TenantIDFactory;
import com.ai.common.provider.ProviderLoader;
import com.ailk.common.bo.BsCurrencyMeasure;

public class CrmCallAmsWsConstants {
	private static transient final Log log = org.apache.commons.logging.LogFactory.getLog(CrmCallAmsWsConstants.class);
	//免费资源查询
	public static String QUERY_FREERESOURCEINFO_BUSI_CODE = "6071";
	//offer tariff查询
	public static String QUERY_TARIFFINFO_BUSI_CODE = "6072";
	//押金查询
	public static String QUERY_DEPOSIT_BUSI_CODE = "1069";
	//查询
	public static String QUERY_BUSI_CODE = "6023";
	//用户信息
	public static Short QUERY_USER_INFO = 1;
	//余额
	public static Short QUERY_BALANCE = 2;
	//信用度
	public static Short QUERY_CREDIT = 3;
	//预算
	public static Short QUERY_BUDGET = 4;
	//免费资源
	public static Short QUERY_FREE_RESOURCE = 5;
	//历史账单
	public static Short QUERY_HISTORY_BILL = 7;
	//未结清账单
	public static String QUERY_UNPAYFEE_BUSI_CODE = "6041";
	//逾期未缴费账单
	public static String QUERY_PASTFEE_BUSI_CODE = "1171";
	//逾期未缴费账单
	public static String QUERY_PASTFEE_BY_TYPE_BUSI_CODE = "6071";
	//收费结果查询
	public static String QUERY_PAYRESULT_BUSI_CODE = "6046";
	//积分查询
	public static String QUERY_POINT_BUSI_CODE = "6047";
	//请求发起方系统ID:CRM  8000000001
	public static String SYSTEM_ID = "8000000001";
	//收据信息导入
	public static String INSERT_RECEIPT_BUSI_CODE = "7157";
	//订单信息修改接口
	public static String DO_CHANGE_ORDER_INFO_BUSI_CODE = "3056";

	//撤销订单
	public static String DO_CANCEL_ORDER_BUSI_CODE = "1074";
	//修改未来订单接口
	public static String DO_CHANGE_FUTURE_ORDER_BUSI_CODE = "3203";
	//未来订单实扣确认接口
	public static String DO_CONFIRM_ORDER_BUSI_CODE = "3204";
	//取消分期接口
	public static String DO_CANCEL_INSTALMENT_BUSI_CODE = "3055";
	//积分转移转换
	public static String TRANSFER_BUSI_CODE = "3010";
	//积分调整
	public static String ADJUST_POINT_BUSI_CODE = "7158";
	//积分调整
	public static String ROLL_BACK_PAYMENT_BUSI_CODE = "7159";
	//免催免停
	public static String DO_SET_EXEMPT_CREDIT_LIMIT_BUSI_CODE = "1059";
	//时间格式
	public static String TIME_FORMATE_STR = "yyyyMMddHHmmss";
	public static String DATE_FORMATE_STR = "yyyyMMdd";
	//时间格式
	public static String TIME_FORMATE_STR2 = "yyyy-MM-dd HH:mm:ss";
	//时间格式3
	public static String TIME_FORMATE_STR3 = "yyyy-MM-dd";
	//受理渠道
	public static String ACCEPT_CHANNEL_TYPE = "1";
	//受理CODE
	public static String ACCEP_CHANNEL_CODE = "1";
	//默认tenantId1
	public static String DEFAULT_TENANT_ID = getTenantId();
	//默认tenantId1
//	private static String DEFAULT_TENANT = "1";
	//DEFAULT_MEASURE_ID
//	public static int DEFAULT_MEASURE_ID = getMeasureId();
	//同步IMEIS
	public static String INSTAL_CHANGE_BUSI_CODE = "1067";
		
	//ON HOLD BILL受理接口
	public static String LIFE_CYCLE_MGNT_BUSI_CODE = "1046";
	
	//多账期调账 接口
	public static String ADJUST_MUTIL_BILL_BUSI_CODE = "6049";
	
	//billing新的调账接口
	public static String ADJUST_FINES_BILL_BUSI_CODE = "3201";
	
	//反悔期退费接口
	public static String BUSI_CODE_REGRET_REFUND = "1080";
	
	//产品周期查询接口
	public static final String QUERY_PRODCYC_BUSI_CODE = "1153";
	
	//未订购产品费用查询接口 Busi_code = 9155
	public static final String Query_No_Subscription_Fee_BUSI_CODE = "9155";
	
	//Busi_code = 9155 Busi_code = 9196
	public static final String Query_Subscription_Fee_BUSI_CODE = "9196";
	//算税接口
	public static final String CAL_TAXMONEY_BUSI_CODE = "1087";
	//修改分期订购用户ID接口
	public static final String Update_OrderUserID_BUSI_CODE = "5910";
	//反悔退费接口
	public static final String Regret_fee_BUSI_CODE = "3059";
	//反悔订单支付的查询接口
	public static final String Query_Regret_Deduct_BUSI_CODE = "6065";
	//反悔订单的查询检验接口
	public static final String Query_Regret_Sts_BUSI_CODE = "6066";
	//查询津贴账户详情
	public static final String Query_Allowance_BUSI_CODE = "6067";
	//查询分期账户详情
	public static final String Query_Installment_BUSI_CODE = "6040";
	
	public static final String Query_Unified_Pay = "6070";
	
	public static final String Query_Account_Status = "9179";

	// 从表中拿
	public static String getTenantId() {
		String tenantId = "01";
		try {
			if(StringUtils.isNotBlank(TenantIDFactory.getTenant())){
				tenantId = TenantIDFactory.getTenant();
			}
		} catch (Exception e) {
			log.error(e);
		}
		return tenantId;
	}
	
	public static int getMeasureId()throws Exception {
		int measureId = 10403;
		try {
			BsCurrencyMeasure bsCurrencyMeasure = ProviderLoader.getTenantUtilInstance().getBsCurrencyMeasureByUserInfo();
			long currencyTypeId = bsCurrencyMeasure.getCurrencyType().getCurrencyTypeId();
			measureId = Integer.parseInt(String.valueOf(currencyTypeId));
		} catch (Exception e) {
			log.error("get currencytypeId error:"+e.getMessage());
			throw new RuntimeException("get currencytypeId error:"+e.getMessage(),e);
		}
		return measureId;
	}
}
