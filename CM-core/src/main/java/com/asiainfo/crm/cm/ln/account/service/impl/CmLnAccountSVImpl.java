package com.asiainfo.crm.cm.ln.account.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.complex.tab.split.SplitTableFactory;
import com.ai.appframe2.complex.tab.split.TableVars;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.StaticDataUtil;
import com.ai.omframe.instance.ivalues.IInsUserValue;
import com.ai.omframe.util.InsServiceFactory;
import com.asiainfo.crm.agreement.agreement.ivalues.IBOAgrAgreementHValue;
import com.asiainfo.crm.agreement.teaminvoke.out.service.interfaces.IAgreementFSV;
import com.asiainfo.crm.cm.busimodel.impl.account.AbstractAcctAndPaymentQueryDealModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.account.AbstractLnAccountProfileQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.ivalues.IBOCmPartyRoleValue;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.account.bo.QBOCmAcctPayMentEngine;
import com.asiainfo.crm.cm.inner.account.ivalues.IQBOCmAcctPayMentValue;
import com.asiainfo.crm.cm.inner.party.bo.BOCmPartyBean;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmPartyValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.account.bo.BOCmAccBusiCreditBean;
import com.asiainfo.crm.cm.ln.account.bo.BOCmCmxAcctPaymentAttrEngine;
import com.asiainfo.crm.cm.ln.account.bo.BOCmIAcctCreditBean;
import com.asiainfo.crm.cm.ln.account.bo.BOCmInsAccrelBean;
import com.asiainfo.crm.cm.ln.account.bo.BOCmRaccOperBean;
import com.asiainfo.crm.cm.ln.account.bo.BOCmxAcctBankRelBean;
import com.asiainfo.crm.cm.ln.account.ivalues.IBOCmCmxAcctPaymentAttrValue;
import com.asiainfo.crm.cm.ln.account.ivalues.IBOCmInsAccrelValue;
import com.asiainfo.crm.cm.ln.account.ivalues.IBOCmxAcctBankRelValue;
import com.asiainfo.crm.cm.ln.account.service.interfaces.ICmLnAccountSV;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.ln.common.util.CmLnSmsSend;
import com.asiainfo.crm.cm.ln.customer.group.ivalues.IBOLnCmxGroupCustValue;
import com.asiainfo.crm.cm.ln.customer.group.service.interfaces.ICmLnGroupSV;
import com.asiainfo.crm.cm.model.bean.VOAccountBean;
import com.asiainfo.crm.cm.model.bo.AccountProfileBean;
import com.asiainfo.crm.cm.model.bo.AcctPaymentBean;
import com.asiainfo.crm.cm.model.ivalues.IAccountProfileValue;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctPaymentValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.ISoAccrelValue;
import com.asiainfo.crm.cm.model.ivalues.IVOAccountValue;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPartyRoleSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ICmTeamInvokeSV;
import com.asiainfo.crm.common.mask.BOMaskHelper;
import com.asiainfo.crm.constant.RBossConst;

public class CmLnAccountSVImpl implements ICmLnAccountSV {

	private transient Log log = LogFactory.getLog(CmLnAccountSVImpl.class);

	public IAccountProfileValue[] queryAccountProfiles(DataContainer criteria, int startNum, int endNum) throws Exception {
		if (criteria.get("queryType") == null || "".equals(criteria.get("queryType")))
			criteria.set("queryType", 1);// 默认查询有效的账户信息
		AbstractLnAccountProfileQueryBusiModelImpl busiModelImpl = (AbstractLnAccountProfileQueryBusiModelImpl) CmServiceFactory
				.getBusiMode(AbstractLnAccountProfileQueryBusiModelImpl.class);
		IAccountProfileValue[] values = (IAccountProfileValue[]) busiModelImpl.queryData(new DataContainer[] { criteria }, startNum, endNum);
		return values;
	}

	public int queryAccountProfilesCount(DataContainer criteria) throws Exception {
		if (criteria.get("queryType") == null || "".equals(criteria.get("queryType")))
			criteria.set("queryType", 1);// 默认查询有效的账户信息
		AbstractLnAccountProfileQueryBusiModelImpl busiModelImpl = (AbstractLnAccountProfileQueryBusiModelImpl) CmServiceFactory
				.getBusiMode(AbstractLnAccountProfileQueryBusiModelImpl.class);
		return busiModelImpl.queryCount(new DataContainer[] { criteria });
	}

	public IAccountProfileValue[] queryAccountProfilesByCustId(long custId, int payMethod, int queryType, int startNum, int endNum) throws Exception {
		if (custId <= 0) {
			// 输入参数不合法！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		DataContainer criteria = new DataContainer();
		criteria.set(IAccountProfileValue.S_CustId, custId);
		if (StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.ACCOUNT_PAY_METHOD, String.valueOf(payMethod)) != null) {
			criteria.set(IAccountProfileValue.S_PayMethod, payMethod);
		}
		criteria.set("queryType", queryType);
		// CenterUtil.getRegionIdByCustId(custId);
		return queryAccountProfiles(criteria, startNum, endNum);
	}

	public IAccountProfileValue queryAccountProfileByAcctId(long acctId) throws Exception {
		if (acctId <= 0) {
			// 输入参数不合法！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		DataContainer criteria = new DataContainer();
		criteria.set(IAccountProfileValue.S_AcctId, acctId);
		// criteria.set(IAccountProfileValue.S_RegionId,
		// CenterUtil.getRegionIdByAcctId(acctId));
		criteria.set("queryType", 1);
		IAccountProfileValue[] values = queryAccountProfiles(criteria, -1, -1);
		if (values.length > 0) {
			IAccountProfileValue value = values[0];
			long custId = value.getCustId();
			long useType = value.getPayMethod();
			long custType = CmCommonUtil.getCustType(custId);

			if (useType == 1) {
				// 支付类型为自有类型
				// 根据custId查找firstName与lastName
				ICmCustomerSV sv = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
				ICustomerValue custVal = sv.queryCustomerByCustId(custId);
				value.setFirstName(custVal.getFirstName());
				value.setLastName(custVal.getLastName());
				// 设置客户名称为客户名称
				value.setCustName(custVal.getCustName());
				// 设置证件号码
				value.setCustCredCode(custVal.getCustCertCode());
				// 客户为集团客户查询税号
				if (custType == 3) {
					ICmLnGroupSV gsv = (ICmLnGroupSV) ServiceFactory.getService(ICmLnGroupSV.class);
					IBOLnCmxGroupCustValue gvalue = gsv.queryGroupCustExtById(custId);
					if (gvalue != null) {
						value.setTaxId(gvalue.getTaxId());
					}
				}
			} else {
				// 支付类型为代付根据accId获取party表
				IBOCmPartyValue[] val = getPayerByAcctId(acctId);
				// 设置客户名称为参与人名称
				if (val != null && val.length > 0) {
					value.setCustName(val[0].getPartyName());
					value.setFirstName(val[0].getFirstName());
					value.setLastName(val[0].getLastName());
					// 设置证件号码
					value.setCustCredCode(val[0].getCertCode());
					value.setPartyId(val[0].getPartyId());
					// 客户为集团客户查询税号
					if (custType == 3) {
						// 根据partyId和角色类型查找partyRole
						ICmPartyRoleSV partyRoleService = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
						IBOCmPartyRoleValue[] partyValue = partyRoleService.queryPartyRole(val[0].getPartyId(), 1, -1, -1);
						// 根据ENTITY_ID查找税号
						if (partyValue.length > 0 && partyValue != null) {
							ICmLnGroupSV gsv = (ICmLnGroupSV) ServiceFactory.getService(ICmLnGroupSV.class);
							IBOLnCmxGroupCustValue gvalue = gsv.queryGroupCustExtById(partyValue[0].getEntityId());
							if (gvalue != null) {
								value.setTaxId(gvalue.getTaxId());
							}
						}
					}
				}
			}
			CmCommonUtil.initDcProperties((DataContainer) value);
			return value;
		}
		return null;
	}

	public int queryAccountProfileCountByCustId(long custId, int payMethod, int queryType) throws Exception {
		if (custId <= 0) {
			// 输入参数不合法！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		DataContainer criteria = new DataContainer();
		criteria.set(IAccountProfileValue.S_CustId, custId);
		if (StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.ACCOUNT_PAY_METHOD, String.valueOf(payMethod)) != null) {
			criteria.set(IAccountProfileValue.S_PayMethod, payMethod);
		}
		criteria.set("queryType", queryType);
		// criteria.set(IAccountProfileValue.S_RegionId,CenterUtil.getRegionIdByCustId(custId));
		return queryAccountProfilesCount(criteria);
	}

	public void saveAcctBankRels(IBOCmxAcctBankRelValue[] acctBankRelValues) throws Exception {
		int len = acctBankRelValues.length;
		BOCmxAcctBankRelBean[] acctBankRelBeans = new BOCmxAcctBankRelBean[len];
		for (int i = 0; i < len; i++) {
			acctBankRelBeans[i] = new BOCmxAcctBankRelBean();
			acctBankRelBeans[i].copy(acctBankRelValues[i]);
			if (StringUtils.isBlank(acctBankRelBeans[i].getState())) {
				acctBankRelBeans[i].setState(CmConstants.RecordState.USE);
			}
			if (acctBankRelBeans[i].getRelId() <= 0) {
				acctBankRelBeans[i].setRelId(CmCommonUtil.getNewSequence(BOCmxAcctBankRelBean.class));
			}
		}
		CmInnerServiceFactory.getCommonInnerSV().saveBeans(acctBankRelBeans);

	}

	public String fireBank(String billId, long acctId) throws Exception {
		if (StringUtils.isBlank(billId) || acctId <= 0) {
			// 输入参数不合法！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		IBOCmxAcctBankRelValue[] acctBankRelValues = this.queryAcctBankRel(billId, acctId);
		if (CmCommonUtil.isNotEmptyObject(acctBankRelValues)) {
			IBOCmxAcctBankRelValue acctBankRelValue = new BOCmxAcctBankRelBean();
			acctBankRelValue.copy(acctBankRelValues[0]);
			acctBankRelValue.delete();
			this.saveAcctBankRels(new IBOCmxAcctBankRelValue[] { acctBankRelValue });

			// 将支付方式改为现金
			IAcctPaymentValue paymentValue = new AcctPaymentBean();
			IAcctPaymentValue[] paymentValues = CmServiceFactory.getAccountSV().queryAcctPaymentsByAcctId(acctId, CmConstants.RecordState.USE, -1, -1);
			if (CmCommonUtil.isEmptyObject(paymentValues)) {
				// 根据账户编号[{0}]没有查询到账户支付方案信息！
				ExceptionUtil.throwBusinessException("CMS5000156", String.valueOf(acctId));
			}
			paymentValue = paymentValues[0];
			paymentValue.setStsToOld();
			paymentValue.setPayMethod(CmConstants.AccountPayMethod.PREPAY);
			paymentValue.setPaymentBankCode("");
			paymentValue.setPaymentAccount("");
			paymentValue.setPaymentAccountType(CmConstants.AccountPayMethod.ACCT_PAYMENT_NOT_BANK);
			IVOAccountValue voAccountValue = new VOAccountBean();
			voAccountValue.addPayment(paymentValue);
			CmServiceFactory.getAccountSV().saveAccount(voAccountValue);
		}
		// 尊敬的客户，银行卡代扣话费服务已取消。
		CmLnSmsSend.sendSms(billId, CrmLocaleFactory.getResource("CMS5000147"));
		return null;
	}

	public String fireMobile(String billId) throws Exception {
		// 输入参数不合法！
		if (StringUtils.isBlank(billId)) {
			ExceptionUtil.throwBusinessException("CMS0000073");
		}

		/* 查询默认付费账户 */
		ICmTeamInvokeSV teamInvokeSV = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
		ISoAccrelValue[] accrelValues = teamInvokeSV.getSoAccrelsByBillId(billId, 1, -1, -1);

		if (CmCommonUtil.isEmptyObject(accrelValues)) {
			ExceptionUtil.throwBusinessException("CMS5000149", billId);// 根据手机号码[{0}]没有找到对应的默认付费账户！
		} else if (accrelValues.length > 1) {
			ExceptionUtil.throwBusinessException("CMS5000150", billId);// 根据手机号码[{0}]查询到多个默认付费账户！
		}
		long acctId = accrelValues[0].getAcctId();

		IBOCmxAcctBankRelValue[] acctBankRelValues = this.queryAcctBankRel(billId, acctId);

		for (IBOCmxAcctBankRelValue value : acctBankRelValues) {
			if (value.getBusiCode() == CmConstants.CM_BUSI_TYPE.BUSI_CODE_04) {
				IBOCmxAcctBankRelValue acctBankRelValue = new BOCmxAcctBankRelBean();
				acctBankRelValue.copy(value);
				acctBankRelValue.delete();
				this.saveAcctBankRels(new IBOCmxAcctBankRelValue[] { acctBankRelValue });
				// 尊敬的客户，银行卡代扣话费服务已取消。
				// CmLnCommonUtil.sendSms(billId,
				// CrmLocaleFactory.getResource("CMS5000147"));
				return String.valueOf(acctBankRelValue.getDoneCode());
			}
		}
		return "";
	}

	public String signMobile(String billId) throws Exception {
		// 输入参数不合法！
		if (StringUtils.isBlank(billId)) {
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		ICmTeamInvokeSV teamInvokeSV = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);

		// 查询用户
		IInsUserValue userValue = teamInvokeSV.getInsUser(-1, billId);
		if (userValue == null) {
			ExceptionUtil.throwBusinessException("CMS5000154", billId);// 根据手机号码[{0}]没有查询到用户信息！
		} else if (!RBossConst.USER_STATE_NORMAL.equals(userValue.getState())) {
			ExceptionUtil.throwBusinessException("CMS5000155");// 非正常状态用户不能呢签约！
		}

		// 默认账户查询
		ISoAccrelValue[] accrelValues = teamInvokeSV.getSoAccrelsByBillId(billId, 1, -1, -1);
		if (CmCommonUtil.isEmptyObject(accrelValues)) {
			ExceptionUtil.throwBusinessException("CMS5000149", billId);// 根据手机号码[{0}]没有找到对应的默认付费账户！
		} else if (accrelValues.length > 1) {
			ExceptionUtil.throwBusinessException("CMS5000150", billId);// 根据手机号码[{0}]查询到多个默认付费账户！
		}

		long acctId = accrelValues[0].getAcctId();

		// 查询账户
		IAccountValue accountValue = CmServiceFactory.getAccountSV().queryAccountById(acctId);
		if (CmCommonUtil.isEmptyObject(accountValue)) {
			ExceptionUtil.throwBusinessException("CMS5000151", String.valueOf(acctId));// 根据账户编号[{0}]没有查询到账户信息！
		}

		// 查询支付方案
		IAcctPaymentValue paymentValue = new AcctPaymentBean();
		IAcctPaymentValue[] paymentValues = CmServiceFactory.getAccountSV().queryAcctPaymentsByAcctId(acctId, CmConstants.RecordState.USE, -1, -1);
		if (CmCommonUtil.isEmptyObject(paymentValues)) {
			ExceptionUtil.throwBusinessException("CMS5000156", String.valueOf(acctId));// 根据账户编号[{0}]没有查询到账户支付方案信息！
		}
		paymentValue = paymentValues[0];
		if (paymentValue.getPayMethod() != CmConstants.AccountPayMethod.CASH) {
			ExceptionUtil.throwBusinessException("CMS1100177", String.valueOf(acctId));// 账户{0}的支付方式不是现金,不能办理浦发银行签约!
		}

		// 查询是否已经签约
		IBOCmxAcctBankRelValue[] acctBankRelValues = this.queryAcctBankRel(billId, acctId);
		if (CmCommonUtil.isNotEmptyObject(acctBankRelValues)) {
			ExceptionUtil.throwBusinessException("CMS5000153", String.valueOf(acctId));// 该账户[{0}]已经签约过，不能再次签约！
		}

		// 保存签约关系表
		IBOCmxAcctBankRelValue acctBankRelValue = new BOCmxAcctBankRelBean();
		acctBankRelValue.setAcctId(acctId);
		acctBankRelValue.setBillId(billId);
		// acctBankRelValue.setPfSeq(tradeSeq);
		// acctBankRelValue.setActiondate(actionDate);
		acctBankRelValue.setBusiCode(CmConstants.CM_BUSI_TYPE.BUSI_CODE_04);
		this.saveAcctBankRels(new IBOCmxAcctBankRelValue[] { acctBankRelValue });

		// 尊敬的客户，本号码已绑定银行卡，自本月账单起将通过银行卡自动代扣账单费用。
		// CmLnCommonUtil.sendSms(billId,
		// CrmLocaleFactory.getResource("CMS5000148"));

		return String.valueOf(acctBankRelValue.getDoneCode());
	}

	public String signBank(String tradeSeq, String billId, String bankCode, String actionDate) throws Exception {
		if (StringUtils.isBlank(tradeSeq) || StringUtils.isBlank(billId) || StringUtils.isBlank(bankCode) || StringUtils.isBlank(actionDate)) {
			// 输入参数不合法！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}

		// 业务校验
		ICmTeamInvokeSV teamInvokeSV = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
		ISoAccrelValue[] accrelValues = teamInvokeSV.getSoAccrelsByBillId(billId, 1, -1, -1);
		if (CmCommonUtil.isEmptyObject(accrelValues)) {
			// 根据手机号码[{0}]没有找到对应的默认付费账户！
			ExceptionUtil.throwBusinessException("CMS5000149", billId);
		} else if (accrelValues.length > 1) {
			// 根据手机号码[{0}]查询到多个默认付费账户！
			ExceptionUtil.throwBusinessException("CMS5000150", billId);
		}
		long acctId = accrelValues[0].getAcctId();
		IAccountValue accountValue = CmServiceFactory.getAccountSV().queryAccountById(acctId);
		if (CmCommonUtil.isEmptyObject(accountValue)) {
			// 根据账户编号[{0}]没有查询到账户信息！
			ExceptionUtil.throwBusinessException("CMS5000151", String.valueOf(acctId));
		}
		if (accountValue.getAcctType() == CmConstants.AccountType.PREPAY) {
			// 预付费账户不允许签约！
			ExceptionUtil.throwBusinessException("CMS5000152");
		}
		IBOCmxAcctBankRelValue[] acctBankRelValues = this.queryAcctBankRel(null, acctId);
		if (CmCommonUtil.isNotEmptyObject(acctBankRelValues)) {
			// 该账户[{0}]已经签约过，不能再次签约！
			ExceptionUtil.throwBusinessException("CMS5000153", String.valueOf(acctId));
		}
		IInsUserValue userValue = teamInvokeSV.getInsUser(-1, billId);
		if (userValue == null) {
			// 根据手机号码[{0}]没有查询到用户信息！
			ExceptionUtil.throwBusinessException("CMS5000154", billId);
		} else if (!userValue.getState().equals(RBossConst.USER_STATE_NORMAL)) {
			// 非正常状态用户不能呢签约！
			ExceptionUtil.throwBusinessException("CMS5000155");
		}

		// 支付方式改为银行代扣
		IAcctPaymentValue paymentValue = new AcctPaymentBean();
		IAcctPaymentValue[] paymentValues = CmServiceFactory.getAccountSV().queryAcctPaymentsByAcctId(acctId, CmConstants.RecordState.USE, -1, -1);
		if (CmCommonUtil.isEmptyObject(paymentValues)) {
			// 根据账户编号[{0}]没有查询到账户支付方案信息！
			ExceptionUtil.throwBusinessException("CMS5000156", String.valueOf(acctId));
		}
		paymentValue = paymentValues[0];
		if (paymentValue.getPayMethod() == CmConstants.AccountPayMethod.CASH) {
			paymentValue.setStsToOld();
			paymentValue.setPayMethod(CmConstants.AccountPayMethod.POSTAL_COLLECTION);
			paymentValue.setPaymentBankCode(bankCode);
			paymentValue.setPaymentAccountType(CmConstants.AccountPayMethod.ACCT_PAYMENT_BANK);
			IVOAccountValue voAccountValue = new VOAccountBean();
			voAccountValue.addPayment(paymentValue);
			CmServiceFactory.getAccountSV().saveAccount(voAccountValue);

			// 保存签约关系表
			IBOCmxAcctBankRelValue acctBankRelValue = new BOCmxAcctBankRelBean();
			acctBankRelValue.setAcctId(acctId);
			acctBankRelValue.setBillId(billId);
			acctBankRelValue.setBankCode(bankCode);
			acctBankRelValue.setPfSeq(tradeSeq);
			acctBankRelValue.setActiondate(actionDate);
			acctBankRelValue.setBankAccountType(CmConstants.AccountPayMethod.ACCT_PAYMENT_BANK);
			acctBankRelValue.setBankAccount(paymentValue.getPaymentAccount());
			acctBankRelValue.setPayMethod(paymentValue.getPayMethod());
			acctBankRelValue.setBusiCode(CmConstants.CM_BUSI_TYPE.BUSI_CODE_03);
			this.saveAcctBankRels(new IBOCmxAcctBankRelValue[] { acctBankRelValue });

			// 尊敬的客户，本号码已绑定银行卡，自本月账单起将通过银行卡自动代扣账单费用。
			CmLnSmsSend.sendSms(billId, CrmLocaleFactory.getResource("CMS5000148"));
		} else {
			ExceptionUtil.throwBusinessException("CMS1100177", String.valueOf(acctId));// 账户{0}的支付方式不是现金,不能办理浦发银行签约!
		}
		return null;
	}

	public IBOCmxAcctBankRelValue[] queryAcctBankRel(String billId, long acctId) throws Exception {
		HashMap map = new HashMap();
		StringBuffer sql = new StringBuffer();
		sql.append(" 1 = 1 ");
		if (StringUtils.isNotBlank(billId)) {
			sql.append(" AND ").append(IBOCmxAcctBankRelValue.S_BillId).append(" = :billId ");
			map.put("billId", billId);
		}
		if (acctId > 0) {
			sql.append(" AND ").append(IBOCmxAcctBankRelValue.S_AcctId).append(" = :acctId ");
			map.put("acctId", Long.valueOf(acctId));
		}
		return (IBOCmxAcctBankRelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmxAcctBankRelBean.class, sql.toString(), map, -1, -1);
	}

	public IAccountProfileValue[] queryAcctAndPayments(String bankAccount, String regionId, long payMethod) throws Exception {
		if (StringUtils.isBlank(bankAccount)) {
			// 银行账号不能为空！
			ExceptionUtil.throwBusinessException("CMS5000157");
		}
		DataContainer criteria = new DataContainer();
		criteria.set(IQBOCmAcctPayMentValue.S_PaymentAccount, bankAccount);
		criteria.set(IQBOCmAcctPayMentValue.S_RegionId, regionId);
		criteria.set(IQBOCmAcctPayMentValue.S_PayMethod, Long.valueOf(payMethod));
		AbstractAcctAndPaymentQueryDealModelImpl busiModelImpl = (AbstractAcctAndPaymentQueryDealModelImpl) CmServiceFactory
				.getBusiMode(AbstractAcctAndPaymentQueryDealModelImpl.class);
		IQBOCmAcctPayMentValue[] values = (IQBOCmAcctPayMentValue[]) busiModelImpl.queryData(new DataContainer[] { criteria }, -1, -1);
		if (CmCommonUtil.isEmptyObject(values)) {
			return new IAccountProfileValue[0];
		}
		int len = values.length;
		IAccountProfileValue[] resultValues = new IAccountProfileValue[len];
		for (int i = 0; i < len; i++) {
			resultValues[i] = new AccountProfileBean();
			resultValues[i].copy(values[i]);
			IBOCmCmxAcctPaymentAttrValue paymentAttrValue = BOCmCmxAcctPaymentAttrEngine.getBean(CmLnConstants.PaymentAttr.BankBehalfPhone, values[i].getPaymentId());
			resultValues[i].setBankBehalfPhone(paymentAttrValue.getAttrValue());
		}
		return resultValues;
	}

	// 手机支付签约/解约
	public Map singOrFireMobile(Map parameter) throws Exception {
		Map resultMap = new HashMap();
		resultMap.put("result", CmLnConstants.BankSign.DEAL_SUCCESS);
		resultMap.put("resultDesc", "ok");

		if (parameter == null) {
			resultMap.put("result", CmLnConstants.BankSign.DEAL_FAIL);
			resultMap.put("resultDesc", "Map parameters passed parameter is null!");
			return resultMap;
		}
		String flag = (String) parameter.get("flag");
		String billId = (String) parameter.get("idValue");
		// String actionTime = (String) parameter.get("actionTime");
		// String seq = (String) parameter.get("seq");

		if (StringUtils.isBlank(flag)) {
			resultMap.put("result", CmLnConstants.BankSign.DEAL_FAIL);
			resultMap.put("resultDesc", "Did not get to sign / termination flag !");
			return resultMap;
		}
		try {
			String doneCode = "";
			if (flag.equals(CmLnConstants.BankSign.SIGN_BANK))
				doneCode = this.signMobile(billId);
			else if (flag.equals(CmLnConstants.BankSign.FIRE_BANK))
				doneCode = this.fireMobile(billId);

			resultMap.put("seq", doneCode);
		} catch (Exception e) {
			log.error(e);
			resultMap.put("result", CmLnConstants.BankSign.DEAL_FAIL);
			resultMap.put("resultDesc", e.getMessage());
			return resultMap;
		}

		return resultMap;
	}

	public Map singOrFireBank(Map paraMap) throws Exception {
		Map resultMap = new HashMap();
		if (paraMap == null) {
			resultMap.put("result", CmLnConstants.BankSign.DEAL_FAIL);
			resultMap.put("resultDesc", "Map parameters passed parameter is null!");
			return resultMap;
		}
		String flag = (String) paraMap.get("flag");
		String billId = (String) paraMap.get("idValue");
		String bankName = (String) paraMap.get("bankName");
		String actionDate = (String) paraMap.get("actionDate");
		String seq = (String) paraMap.get("seq");
		if (StringUtils.isBlank(flag)) {
			resultMap.put("result", CmLnConstants.BankSign.DEAL_FAIL);
			resultMap.put("resultDesc", "Did not get to sign / termination flag !");
			return resultMap;
		}
		try {
			if (flag.equals(CmLnConstants.BankSign.SIGN_BANK)) {
				this.signBank(seq, billId, bankName, actionDate);
			} else if (flag.equals(CmLnConstants.BankSign.FIRE_BANK)) {
				ICmTeamInvokeSV teamInvokeSV = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
				ISoAccrelValue[] accrelValues = teamInvokeSV.getSoAccrelsByBillId(billId, 1, -1, -1);
				if (CmCommonUtil.isEmptyObject(accrelValues)) {
					// 根据手机号码[{0}]没有找到对应的默认付费账户！
					ExceptionUtil.throwBusinessException("CMS5000149", billId);
				} else if (accrelValues.length > 1) {
					// 根据手机号码[{0}]查询到多个默认付费账户！
					ExceptionUtil.throwBusinessException("CMS5000150", billId);
				}
				long acctId = accrelValues[0].getAcctId();
				this.fireBank(billId, acctId);
			}
		} catch (Exception e) {
			log.info(e.getMessage(), e);
			resultMap.put("result", CmLnConstants.BankSign.DEAL_FAIL);
			resultMap.put("resultDesc", e.getMessage());
			return resultMap;
		}
		resultMap.put("result", CmLnConstants.BankSign.DEAL_SUCCESS);
		return resultMap;
	}

	public IAccountProfileValue[] queryAcctAndPayments(String bankAccount, String regionId, long payMethod, int start, int end) throws Exception {
		if (StringUtils.isBlank(bankAccount)) {
			// 银行账号不能为空！
			ExceptionUtil.throwBusinessException("CMS5000157");
		}
		DataContainer criteria = new DataContainer();
		criteria.set(IQBOCmAcctPayMentValue.S_PaymentAccount, bankAccount);
		criteria.set(IQBOCmAcctPayMentValue.S_RegionId, regionId);
		criteria.set(IQBOCmAcctPayMentValue.S_PayMethod, Long.valueOf(payMethod));
		AbstractAcctAndPaymentQueryDealModelImpl busiModelImpl = (AbstractAcctAndPaymentQueryDealModelImpl) CmServiceFactory
				.getBusiMode(AbstractAcctAndPaymentQueryDealModelImpl.class);
		IQBOCmAcctPayMentValue[] values = (IQBOCmAcctPayMentValue[]) busiModelImpl.queryData(new DataContainer[] { criteria }, start, end);
		if (CmCommonUtil.isEmptyObject(values)) {
			return new IAccountProfileValue[0];
		}
		int len = values.length;
		IAccountProfileValue[] resultValues = new IAccountProfileValue[len];
		for (int i = 0; i < len; i++) {
			resultValues[i] = new AccountProfileBean();
			resultValues[i].copy(values[i]);
			IBOCmCmxAcctPaymentAttrValue paymentAttrValue = BOCmCmxAcctPaymentAttrEngine.getBean(CmLnConstants.PaymentAttr.BankBehalfPhone, values[i].getPaymentId());
			resultValues[i].setBankBehalfPhone(paymentAttrValue.getAttrValue());
		}
		return resultValues;
	}

	public int queryAcctAndPaymentsCount(String bankAccount, String regionId, long payMethod) throws Exception {
		return queryAcctAndPayments(bankAccount, regionId, payMethod, -1, -1).length;
	}

	public IAccountProfileValue[] queryAcctAndPayments(String bankAccount, String regionId, long payMethod, String bankCode, int start, int end) throws Exception {
		if (StringUtils.isBlank(regionId)) {
			// 输入参数不合法！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		DataContainer criteria = new DataContainer();
		criteria.set(IQBOCmAcctPayMentValue.S_PaymentAccount, bankAccount);
		criteria.set(IQBOCmAcctPayMentValue.S_PaymentBankCode, bankCode);
		criteria.set(IQBOCmAcctPayMentValue.S_RegionId, regionId);
		criteria.set(IQBOCmAcctPayMentValue.S_PayMethod, Long.valueOf(payMethod));
		AbstractAcctAndPaymentQueryDealModelImpl busiModelImpl = (AbstractAcctAndPaymentQueryDealModelImpl) CmServiceFactory
				.getBusiMode(AbstractAcctAndPaymentQueryDealModelImpl.class);
		IQBOCmAcctPayMentValue[] values = (IQBOCmAcctPayMentValue[]) busiModelImpl.queryData(new DataContainer[] { criteria }, start, end);
		if (CmCommonUtil.isEmptyObject(values)) {
			return new IAccountProfileValue[0];
		}
		int len = values.length;
		IAccountProfileValue[] resultValues = new IAccountProfileValue[len];
		for (int i = 0; i < len; i++) {
			resultValues[i] = new AccountProfileBean();
			resultValues[i].copy(values[i]);
			IBOCmCmxAcctPaymentAttrValue paymentAttrValue = BOCmCmxAcctPaymentAttrEngine.getBean(CmLnConstants.PaymentAttr.BankBehalfPhone, values[i].getPaymentId());
			resultValues[i].setBankBehalfPhone(paymentAttrValue.getAttrValue());
		}
		return resultValues;
	}

	public int queryAcctAndPaymentsCount(String bankAccount, String regionId, long payMethod, String bankCode) throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append("SELECT COUNT(1) AS DONE_CODE FROM {CM_ACCOUNT} T,{CM_ACCT_PAYMENT} T1 WHERE T.ACCT_ID = T1.ACCT_ID ");
		if (StringUtils.isNotBlank(bankAccount)) {
			condition.append(" AND T1.").append(IQBOCmAcctPayMentValue.S_PaymentAccount).append(" = :bankAccount ");
			paraMap.put("bankAccount", bankAccount);
		}
		if (StringUtils.isNotBlank(regionId)) {
			condition.append(" AND T1.").append(IQBOCmAcctPayMentValue.S_RegionId).append(" = :regionId ");
			paraMap.put("regionId", regionId);
		}
		if (payMethod > 0) {
			condition.append(" AND T1.").append(IQBOCmAcctPayMentValue.S_PayMethod).append(" = :payMethod ");
			paraMap.put("payMethod", Long.valueOf(payMethod));
		}
		if (StringUtils.isNotBlank(bankCode)) {
			condition.append(" AND T1.").append(IQBOCmAcctPayMentValue.S_PaymentBankCode).append(" = :bankCode ");
			paraMap.put("bankCode", bankCode);
		}
		TableVars tableVar = new TableVars();
		tableVar.add("CM_ACCOUNT", "REGION_ID", regionId);
		tableVar.add("CM_ACCT_PAYMENT", "REGION_ID", regionId);

		String sql = SplitTableFactory.createQuerySQL(condition.toString(), tableVar);
		int count = 0;
		IQBOCmAcctPayMentValue[] retValues = QBOCmAcctPayMentEngine.getBeansFromSql(sql, paraMap);
		if (retValues != null && retValues.length > 0) {
			count = (int) retValues[0].getDoneCode();
		}
		return count;
	}

	public void saveCmAccBusiCredit(BOCmAccBusiCreditBean accBusiCreditBean) throws Exception {
		CmInnerServiceFactory.getCommonInnerSV().saveBean(accBusiCreditBean);

	}

	public void saveCmRaccOper(BOCmRaccOperBean raccOperBean) throws Exception {
		CmInnerServiceFactory.getCommonInnerSV().saveBean(raccOperBean);
	}

	public void saveAcctCredit(IAccountValue accountValue) throws Exception {
		long acctId = accountValue.getAcctId();
		long creditValue = accountValue.getCreditValue();
		long creditLevel = accountValue.getCreditLevel();
		String regionId = accountValue.getRegionId();
		long sid = CmCommonUtil.getNewSequence(BOCmIAcctCreditBean.class);
		// 1.新增账户信用度上发表
		BOCmIAcctCreditBean accBusiCreditBean = new BOCmIAcctCreditBean();
		accBusiCreditBean.setSoNbr(sid);
		accBusiCreditBean.setSid(sid);
		accBusiCreditBean.setBusiCode(CmLnConstants.acctCredit.ACCT_CREDIT_BUSI_CODE);
		accBusiCreditBean.setCountyCode(Integer.parseInt(regionId));
		accBusiCreditBean.setRegionCode(Integer.parseInt(regionId));
		accBusiCreditBean.setOrgId(accountValue.getOrgId());
		accBusiCreditBean.setServId(0);
		accBusiCreditBean.setCustId(accountValue.getCustId());
		accBusiCreditBean.setAcctId(acctId);
		accBusiCreditBean.setCommitDate(accountValue.getDoneDate() == null ? ServiceManager.getIdGenerator().getSysDate() : accountValue.getDoneDate());
		accBusiCreditBean.setUpField("00000000000000000000010000000000");
		accBusiCreditBean.setCreditLevel(creditLevel);
		accBusiCreditBean.setBusiCredit(creditValue);
		accBusiCreditBean.setUpDate(accountValue.getDoneDate() == null ? ServiceManager.getIdGenerator().getSysDate() : accountValue.getDoneDate());
		CmInnerServiceFactory.getCommonInnerSV().saveBean(accBusiCreditBean);
	}

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.ln.account.service.interfaces.ICmLnAccountSV#getInsAccrelsByAcct(long,
	 * int, int)
	 */
	public IBOCmInsAccrelValue[] getInsAccrelsByAcct(long acctId, long payType, int startIdx, int endIdx) throws Exception {
		IBOCmInsAccrelValue[] insAccrels = null;
		if (acctId < 0) {
			ExceptionUtil.throwBusinessException("CMC0010004");
		}
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(IBOCmInsAccrelValue.S_AcctId).append(" =:ACCT_ID ");
		paraMap.put("ACCT_ID", acctId);
		if (payType > 0) {
			condition.append(" AND ").append(IBOCmInsAccrelValue.S_PayType).append(" =:payType");
			paraMap.put("payType", payType);
		}
		condition.append(" AND ").append(IBOCmInsAccrelValue.S_EffectiveDate).append(" <= NOW()");
		condition.append(" AND ").append(IBOCmInsAccrelValue.S_ExpireDate).append(" >= NOW()");
		insAccrels = (IBOCmInsAccrelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmInsAccrelBean.class, condition.toString(), paraMap, startIdx, endIdx);

		if ((null != insAccrels) && (insAccrels.length > 0)) {
			IBOBsStaticDataValue[] accrelType = StaticDataUtil.getStaticData("SO_ACCTREL_TYPE");
			for (int i = 0; i < insAccrels.length; ++i) {
				if ((accrelType != null) && (accrelType.length > 0)) {
					for (int a = 0; a < accrelType.length; ++a)
						if (String.valueOf(insAccrels[i].getPayType()).equals(accrelType[a].getCodeValue())) {
							insAccrels[i].setRemarks(accrelType[a].getCodeName());
							break;
						}

				}
			}
			return insAccrels;
		}
		return new IBOCmInsAccrelValue[0];
	}

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.ln.account.service.interfaces.ICmLnAccountSV#getInsAccrelsCountByAcct(long)
	 */
	public int getInsAccrelsCountByAcct(long acctId, long payType) throws Exception {
		if (acctId < 0) {
			ExceptionUtil.throwBusinessException("CMC0010004");
		}
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(IBOCmInsAccrelValue.S_AcctId).append(" =:ACCT_ID ");
		paraMap.put("ACCT_ID", acctId);
		if (payType > 0) {
			condition.append(" AND ").append(IBOCmInsAccrelValue.S_PayType).append(" =:payType");
			paraMap.put("payType", payType);
		}
		condition.append(" AND ").append(IBOCmInsAccrelValue.S_EffectiveDate).append(" <= NOW()");
		condition.append(" AND ").append(IBOCmInsAccrelValue.S_ExpireDate).append(" >= NOW()");
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmInsAccrelBean.class, condition.toString(), paraMap);
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.asiainfo.crm.cm.ln.account.service.interfaces.ICmLnAccountSV#saveInsAccrel(com.asiainfo.crm.cm.ln.account
	 * .ivalues.IBOCmInsAccrelValue,
	 * long)
	 */
	public void saveInsAccrel(IBOCmInsAccrelValue val, long operation) throws Exception {
		BOCmInsAccrelBean bean = new BOCmInsAccrelBean();
		if (operation == 1) {// 新增
			bean.copy(val);
		} else if (operation == 2) {// 修改
			long acctId = val.getAcctId();
			long acctRelaId = val.getAcctRelaId();
			if (acctId > 0 && acctRelaId > 0) {
				// 按倒序查询出所有的数据
				IBOCmInsAccrelValue[] values = queryCmInsAccrelInfo(acctId, acctRelaId);
				if (CmCommonUtil.isNotEmptyObject(values)) {
					IBOCmInsAccrelValue value = values[0];
					String[] props = val.getPropertyNames();
					if (props != null) {
						for (int i = 0, len = props.length; i < len; i++) {
							value.set(props[i], val.get(props[i]));
						}
					}
					bean.copy(value);
				} else {
					// 查询不到数据
					return;
				}
			}
		} else if (operation == 3) {// 删除
			bean.copy(val);
			CmCommonUtil.initDcProperties(bean);
			bean.delete();
		} else {// do nothing

		}
		CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);
	}

	@Override
	public IBOCmInsAccrelValue[] getInsAccrelsByAcctFor360(long acctId, long payType, int startIdx, int endIdx) throws Exception {
		IBOCmInsAccrelValue[] insAccrels = null;
		if (acctId < 0) {
			ExceptionUtil.throwBusinessException("CMC0010004");
		}
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(IBOCmInsAccrelValue.S_AcctId).append(" =:ACCT_ID ");
		paraMap.put("ACCT_ID", acctId);
		if (payType > 0) {
			condition.append(" AND ").append(IBOCmInsAccrelValue.S_PayType).append(" =:payType");
			paraMap.put("payType", payType);
		}

		insAccrels = (IBOCmInsAccrelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmInsAccrelBean.class, condition.toString(), paraMap, startIdx, endIdx);

		if ((null != insAccrels) && (insAccrels.length > 0)) {
			IBOBsStaticDataValue[] accrelType = StaticDataUtil.getStaticData("SO_ACCTREL_TYPE");
			for (int i = 0; i < insAccrels.length; ++i) {
				CenterFactory.setCenterInfoByTypeAndValue("UserId", String.valueOf(insAccrels[i].getUserId()));
				IInsUserValue aInsUserValue = InsServiceFactory.getInstanceQueryService().getInstUserByUserId(insAccrels[i].getUserId());
				insAccrels[i].setDiaplayAttr("USER_ID", "USER_ID", aInsUserValue.getBillId());

				if ((accrelType != null) && (accrelType.length > 0)) {
					for (int a = 0; a < accrelType.length; ++a)
						if (String.valueOf(insAccrels[i].getPayType()).equals(accrelType[a].getCodeValue())) {
							insAccrels[i].setRemarks(accrelType[a].getCodeName());
							break;
						}

				}

				if (insAccrels[i].getItemId() > 0) {
					insAccrels[i].setDiaplayAttr("ITEM_ID", "ITEM_ID", new Long(insAccrels[i].getItemId()));
				}
			}
			return insAccrels;
		}
		return new IBOCmInsAccrelValue[0];
	}

	@Override
	public int getInsAccrelsCountByAcctFor360(long acctId, long payType) throws Exception {
		if (acctId < 0) {
			ExceptionUtil.throwBusinessException("CMC0010004");
		}
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(IBOCmInsAccrelValue.S_AcctId).append(" =:ACCT_ID ");
		paraMap.put("ACCT_ID", acctId);
		if (payType > 0) {
			condition.append(" AND ").append(IBOCmInsAccrelValue.S_PayType).append(" =:payType");
			paraMap.put("payType", payType);
		}
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmInsAccrelBean.class, condition.toString(), paraMap);
	}

	@Override
	public IBOCmPartyValue[] getPayerByAcctId(long accId) throws Exception {

		/**
		 * 1根据accId查找CM_PARTY_ACCT_REL得到partId
		 * 2根据partId查找CM_PARTY的到firstName和lastName
		 * 
		 */
		StringBuffer condition1 = new StringBuffer("");
		// 关联查询CM_PARTY_ACCT_REL,CM_PARTY
		condition1.append("SELECT A.PARTY_TYPE,A.FIRST_NAME,A.LAST_NAME,A.PARTY_NAME,A.CERT_CODE,A.PARTY_ID "
				+ "FROM {CM_PARTY} A,{CM_PARTY_ACCT_REL} B WHERE A.PARTY_ID=B.PARTY_ID AND B.ACCT_ID=" + accId);
		String sql = SplitTableFactory.createQuerySQL(condition1.toString(), new HashMap());
		IBOCmPartyValue[] val = (IBOCmPartyValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmPartyBean.class, sql, null);
		return val;

	}

	/*
	 * 查询账户用户关系
	 */
	private IBOCmInsAccrelValue[] queryCmInsAccrelInfo(long acctId, long acctRelaId) throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOCmInsAccrelValue.S_AcctId).append(" =:ACCT_ID ");
		parameter.put("ACCT_ID", acctId);
		condition.append(" AND ").append(IBOCmInsAccrelValue.S_AcctRelaId).append(" =:acctRelsId ");
		parameter.put("acctRelsId", acctRelaId);
		condition.append(" ORDER BY CREATE_DATE DESC");
		return (IBOCmInsAccrelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmInsAccrelBean.class, condition.toString(), parameter, -1, -1);
	}

	public IAccountProfileValue queryMaskAccountProfileByAcctId(long acctId) throws Exception {
		// 记录业务日志
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		Map paraMap = new HashMap();
		paraMap.put("acctId", acctId);
		commonSV.saveCommonQryBusiLog(CmConstants.BusiLogId.ACCOUNT_QRY, "", paraMap, CmConstants.BusiLogType.ACCOUNT_LOG);
		if (acctId <= 0) {
			// 输入参数不合法！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		DataContainer criteria = new DataContainer();
		criteria.set(IAccountProfileValue.S_AcctId, acctId);
		// criteria.set(IAccountProfileValue.S_RegionId,
		// CenterUtil.getRegionIdByAcctId(acctId));
		criteria.set("queryType", 1);
		IAccountProfileValue[] values = queryAccountProfiles(criteria, -1, -1);
		IAgreementFSV gareeSV = (IAgreementFSV) ServiceFactory.getService(IAgreementFSV.class);
		if (values.length > 0) {
			IAccountProfileValue value = values[0];
			value.setEffectiveDate(value.getAcctEffectiveDate());
			long custId = value.getCustId();
			// agreementId转化成agreeCode展示
			if(StringUtils.isNotBlank(values[0].getAcctPassword())){
				if(!StringUtils.isNumeric(values[0].getAcctPassword())){
					throw new Exception("agreement Id:["+values[0].getAcctPassword()+"] is not numeric");
				}
				IBOAgrAgreementHValue dc = gareeSV.getAgreementValueByCust(custId, DataType.getAsLong(values[0].getAcctPassword()));
				if (dc != null) {
					value.setAcctAliasName(dc.getAgreementCode());
				}
			}
			long useType = value.getPayMethod();
			long custType = CmCommonUtil.getCustType(custId);
			long payerType = -1;// payer类型
			if (useType == 1) {
				// 支付类型为自有类型
				// 根据custId查找firstName与lastName
				ICmCustomerSV sv = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
				ICustomerValue custVal = sv.queryCustomerByCustId(custId);
				value.setFirstName(custVal.getFirstName());
				value.setLastName(custVal.getLastName());
				// 设置客户名称为客户名称
				value.setCustName(custVal.getCustName());
				// 设置证件号码
				value.setCustCredCode(custVal.getCustCertCode());
				// 客户为集团客户查询税号
				if (custType == 3) {
					ICmLnGroupSV gsv = (ICmLnGroupSV) ServiceFactory.getService(ICmLnGroupSV.class);
					IBOLnCmxGroupCustValue gvalue = gsv.queryGroupCustExtById(custId);
					if (gvalue != null) {
						value.setTaxId(gvalue.getTaxId());
					}
				}

				payerType = custType;
			} else {
				// 支付类型为代付根据accId获取party表
				IBOCmPartyValue[] val = getPayerByAcctId(acctId);
				// 设置客户名称为参与人名称
				if (val != null && val.length > 0) {
					payerType = val[0].getPartyType();
					value.setCustName(val[0].getPartyName());
					value.setFirstName(val[0].getFirstName());
					value.setLastName(val[0].getLastName());
					// 设置证件号码
					value.setCustCredCode(val[0].getCertCode());
					value.setPartyId(val[0].getPartyId());
					// 客户为集团客户查询税号
					if (payerType == 3) {
						// 根据partyId和角色类型查找partyRole
						ICmPartyRoleSV partyRoleService = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
						IBOCmPartyRoleValue[] partyValue = partyRoleService.queryPartyRole(val[0].getPartyId(), 1, -1, -1);
						// 根据ENTITY_ID查找税号
						if (partyValue.length > 0 && partyValue != null) {
							ICmLnGroupSV gsv = (ICmLnGroupSV) ServiceFactory.getService(ICmLnGroupSV.class);
							IBOLnCmxGroupCustValue gvalue = gsv.queryGroupCustExtById(partyValue[0].getEntityId());
							if (gvalue != null) {
								value.setTaxId(gvalue.getTaxId());
							}
						}
					}
				}
			}
			CmCommonUtil.initDcProperties((DataContainer) value);
			AccountProfileBean bean = new AccountProfileBean();
			bean.copy(value);
			// 添加模糊化标识
			bean.clearProperty("CUST_CRED_CODE");
			bean.initCustCredCode(value.getCustCredCode());
			BOMaskHelper.setOperateMaskFlag();
			BOMaskHelper.mask(bean);
			// 清除模糊化标识
			BOMaskHelper.setOperateNotMaskFlag();
			BOMaskHelper.clearOperateMaskFlag();
			if (payerType == 3) {// 如果payer是集团
				String kobNumber = bean.getCustCredCode();
				if (StringUtils.isNotBlank(kobNumber)) {
					// 判断是否为外国集团
					if (kobNumber.indexOf("K") < 0) {
						long kobNumberLocal = DataType.getAsLong(kobNumber);
						bean.setDiaplayAttr("CUST_CRED_CODE", "CUST_CERT_CODE_NAME", kobNumberLocal);
					} else {
						bean.setDiaplayAttr("CUST_CRED_CODE", "CUST_CERT_CODE_NAME", "");
					}
				}
			}
			return bean;
		}
		return new AccountProfileBean();
	}
	
	
	public IBOCmInsAccrelValue[] getInsAccrelsByAcct(long acctId, long payType, int state, int startIdx, int endIdx) throws Exception {
		IBOCmInsAccrelValue[] insAccrels = null;
		if (acctId < 0) {
			ExceptionUtil.throwBusinessException("CMC0010004");
		}
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(IBOCmInsAccrelValue.S_AcctId).append(" =:ACCT_ID ");
		paraMap.put("ACCT_ID", acctId);
		if (payType > 0) {
			condition.append(" AND ").append(IBOCmInsAccrelValue.S_PayType).append(" =:payType");
			paraMap.put("payType", payType);
		}
		if (state >=0){
			condition.append(" AND ").append(IBOCmInsAccrelValue.S_State).append(" =:state");
			paraMap.put("state", state);
		}
		condition.append(" AND ").append(IBOCmInsAccrelValue.S_EffectiveDate).append(" <= NOW()");
		condition.append(" AND ").append(IBOCmInsAccrelValue.S_ExpireDate).append(" >= NOW()");
		insAccrels = (IBOCmInsAccrelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmInsAccrelBean.class, condition.toString(), paraMap, startIdx, endIdx);

		if ((null != insAccrels) && (insAccrels.length > 0)) {
			IBOBsStaticDataValue[] accrelType = StaticDataUtil.getStaticData("SO_ACCTREL_TYPE");
			for (int i = 0; i < insAccrels.length; ++i) {
				if ((accrelType != null) && (accrelType.length > 0)) {
					for (int a = 0; a < accrelType.length; ++a)
						if (String.valueOf(insAccrels[i].getPayType()).equals(accrelType[a].getCodeValue())) {
							insAccrels[i].setRemarks(accrelType[a].getCodeName());
							break;
						}

				}
			}
			return insAccrels;
		}
		return new IBOCmInsAccrelValue[0];
	}
}
