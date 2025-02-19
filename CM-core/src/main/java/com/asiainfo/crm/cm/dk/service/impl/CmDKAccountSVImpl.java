package com.asiainfo.crm.cm.dk.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.StaticDataUtil;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.dk.bo.BOCmBillingAcctBean;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmBillingAcctValue;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmDKAccountSV;
import com.asiainfo.crm.cm.dk.ws.ImsHisQueryServiceClient;
import com.asiainfo.crm.cm.dk.ws.ImsWrapQueryServiceClient;
import com.asiainfo.crm.cm.dk.ws.imshisqueryservice.CaBill;
import com.asiainfo.crm.cm.dk.ws.imshisqueryservice.DoQueryUnPayFeeResponse;
import com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.AdjustLog;
import com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryWorkLogResponse;
import com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.PaymentLog;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.service.interfaces.ICmAccountSV;

public class CmDKAccountSVImpl implements ICmDKAccountSV {

	public boolean queryIfDunningAcct(long custId) throws Exception {
		ICmAccountSV acctSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		IAccountValue[] acctValues = acctSV.queryAcctsById(-1, custId, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(acctValues)) {
			for (IAccountValue value : acctValues) {
				int acctStatus = value.getAcctStatus();
				if (acctStatus == CmConstants.AccountStatus.DUNING || acctStatus == CmConstants.AccountStatus.CA_FLAG) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean queryIfPayAcct(long custId) throws Exception {
		ImsWrapQueryServiceClient client = ImsWrapQueryServiceClient.getInstance();
		// QueryType=4查缴费记录,QueryType=1查充值记录,QueryType=2查调账记录
		ICmAccountSV acctSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		IAccountValue[] acctValues = acctSV.queryAcctsById(-1, custId, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(acctValues)) {
			for (IAccountValue value : acctValues) {
				long acctId = value.getAcctId();
				// 查缴费记录
				DoQueryWorkLogResponse response = client.getAccountInfo(acctId, CmConstants.billingAcctLog.PAYMENT_LOG);
				if (null != response) {
					PaymentLog[] payLogs = response.getPaymentLogList();
					if (null != payLogs && payLogs.length > 0) {
						return true;
					}
				}
				// 查充值记录
				DoQueryWorkLogResponse rechargeResponse = client.getAccountInfo(acctId, CmConstants.billingAcctLog.RECHARGE_LOG);
				if (null != rechargeResponse) {
					PaymentLog[] payLogs = rechargeResponse.getPaymentLogList();
					if (null != payLogs && payLogs.length > 0) {
						return true;
					}
				}
				// 查调账记录
				DoQueryWorkLogResponse adjustResponse = client.getAccountInfo(acctId, CmConstants.billingAcctLog.ADJUST_LOG);
				if (null != adjustResponse) {
					AdjustLog[] adjustLogs = adjustResponse.getAdjustLogList();
					if (null != adjustLogs && adjustLogs.length > 0) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public boolean queryIfUnPayFeeAcct(long custId) throws Exception {
		// 查询账户信息
		ICmAccountSV acctSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		IAccountValue[] acctValues = acctSV.queryAcctsById(-1, custId, -1, -1);
		for (IAccountValue acctValue : acctValues) {
			long acctId = acctValue.getAcctId();
			// 调用服务查询未缴费账单
			ImsHisQueryServiceClient client = ImsHisQueryServiceClient.getInstance();
			DoQueryUnPayFeeResponse unPayFeeResponse = client.queryUnPayFee(acctId);
			CaBill[] cbills = unPayFeeResponse.getBillList();
			if (null != cbills && cbills.length > 0) {
				return true;
			}
		}
		return false;
	}

	/*
	 * 判断该创建日期是否在规定时间内
	 */
	private boolean whetherHasUnPayAcct(String createDate) throws Exception {
		IBOBsStaticDataValue[] staticValues = StaticDataUtil.getStaticData("CM_VALIDATE_DATE");
		if (CmCommonUtil.isNotEmptyObject(staticValues)) {
			String day = staticValues[0].getCodeValue();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date createTime = sdf.parse(createDate);
			long createTimes = createTime.getTime();
			long nowTimes = new Date().getTime();
			long betweenTimes = Long.parseLong(day) * 24 * 60 * 60 * 1000L;
			if (nowTimes - createTimes < betweenTimes) {
				return true;
			}
		}
		return false;
	}

	public boolean queryIfCanChangeState(long custId) throws Exception {
		if (queryIfDunningAcct(custId) || queryIfPayAcct(custId) || queryIfUnPayFeeAcct(custId)) {
			return false;
		}
		return true;
	}

	public void saveBillingAcct(IBOCmBillingAcctValue[] billingAcctValues) throws Exception {
		if (billingAcctValues != null && billingAcctValues.length > 0) {
			BOCmBillingAcctBean[] results = new BOCmBillingAcctBean[billingAcctValues.length];
			for (int i = 0; i < billingAcctValues.length; i++) {
				if (billingAcctValues[i].getSeqId() <= 0) {
					billingAcctValues[i].setSeqId(CmCommonUtil.getNewSequence(BOCmBillingAcctBean.class));
					billingAcctValues[i].setState(CmConstants.RecordState.USE);
					billingAcctValues[i].setStsToNew();
				}
				results[i] = new BOCmBillingAcctBean();
				results[i].copy(billingAcctValues[i]);
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBeans(results);
		}

	}

	public IBOCmBillingAcctValue[] queryBillingAcct(long acctId, String pbs, String ean) throws Exception {
		if (acctId <= 0 && StringUtils.isBlank(pbs) && StringUtils.isBlank(ean)) {
			ExceptionUtil.throwBusinessException("CMS5000085");
		}
		StringBuilder sql = new StringBuilder();
		Map paraMap = new HashMap();
		sql.append(" 1=1");
		if (StringUtils.isNotBlank(pbs)) {
			sql.append(" AND ").append(IBOCmBillingAcctValue.S_ExpireDate).append(" >= now() ");
			sql.append(" AND ").append(IBOCmBillingAcctValue.S_EffectiveDate).append(" < now()");
			sql.append(" AND ").append(IBOCmBillingAcctValue.S_PbsNumber).append(" = :pbs");
			paraMap.put("pbs", pbs);
		}
		if (StringUtils.isNotBlank(ean)) {
			sql.append(" AND ").append(IBOCmBillingAcctValue.S_Ext10).append(" >= now() ");
			sql.append(" AND ").append(IBOCmBillingAcctValue.S_Ext9).append(" < now()");
			sql.append(" AND ").append(IBOCmBillingAcctValue.S_Ean).append(" = :ean");
			paraMap.put("ean", ean);
		}
		if (acctId > 0) {
			sql.append(" AND ").append(IBOCmBillingAcctValue.S_AcctId).append(" = :acctId");
			paraMap.put("acctId", acctId);
		}
		String StringSql = CmCommonUtil.getDynamicSqlByConds(BOCmBillingAcctBean.class, sql.toString(), paraMap, -1, -1);
		IBOCmBillingAcctValue[] results = (IBOCmBillingAcctValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmBillingAcctBean.class, StringSql, paraMap);
		if (results != null && results.length > 0) {
			return results;
		}
		return new IBOCmBillingAcctValue[0];
	}

	public IBOCmBillingAcctValue[] queryBillingAcct(String addressId) throws Exception {
		if (StringUtils.isNotBlank(addressId)) {
			StringBuilder sql = new StringBuilder();
			Map paraMap = new HashMap();
			sql.append(" 1=1");
			if (StringUtils.isNotBlank(addressId)) {
				sql.append(" AND ").append(IBOCmBillingAcctValue.S_Ext1).append(" = :addressId");
				paraMap.put("addressId", addressId);
			}
			String StringSql = CmCommonUtil.getDynamicSqlByConds(BOCmBillingAcctBean.class, sql.toString(), paraMap, -1, -1);
			IBOCmBillingAcctValue[] results = (IBOCmBillingAcctValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmBillingAcctBean.class, StringSql, paraMap);
			if (results != null && results.length > 0) {
				return results;
			}
		}
		return new IBOCmBillingAcctValue[0];
	}
}
