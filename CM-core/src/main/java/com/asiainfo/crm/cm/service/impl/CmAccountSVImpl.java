package com.asiainfo.crm.cm.service.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.ai.omframe.util.SoSessionCachedFactory;
import com.ai.omframe.util.SoUtil;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.complex.tab.split.SplitTableFactory;
import com.ai.appframe2.complex.tab.split.TableVars;
import com.ai.appframe2.complex.tab.split.TenantIDFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.util.CenterUtil;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.StaticDataUtil;
import com.ai.common.util.TimeUtil;
import com.ai.omframe.instance.ivalues.IInsAccrelValue;
import com.ai.omframe.order.valuebean.OrderConst;
import com.asiainfo.crm.agreement.teaminvoke.out.service.interfaces.IAgreementFSV;
import com.asiainfo.crm.cm.busimodel.impl.account.AbstractAccountDealModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.account.AbstractAccountProfileQueryBusiModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.account.AbstractAccountQueryModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.account.AbstractAcctAndPaymentQueryDealModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.account.AbstractAcctBillCustmizeQueryModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.account.AbstractAcctHisQueryDealModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.account.AbstractAcctPaymentQueryModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.bo.BOCMPartyAcctRelBean;
import com.asiainfo.crm.cm.common.bo.BOCMPartyAcctRelEngine;
import com.asiainfo.crm.cm.common.ivalues.IBOCMPartyAcctRelValue;
import com.asiainfo.crm.cm.common.ivalues.IQBOCmPartyValue;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.common.util.CmStaticDataUtil;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmBillingAcctValue;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmDKAccountSV;
import com.asiainfo.crm.cm.inner.account.bo.BOCmAccountAttrBean;
import com.asiainfo.crm.cm.inner.account.bo.BOCmAccountBean;
import com.asiainfo.crm.cm.inner.account.bo.BOCmAccountHisBean;
import com.asiainfo.crm.cm.inner.account.bo.BOCmAccountHisEngine;
import com.asiainfo.crm.cm.inner.account.bo.BOCmAcctBillCycleBean;
import com.asiainfo.crm.cm.inner.account.bo.BOCmAcctPaymentBean;
import com.asiainfo.crm.cm.inner.account.bo.BOCmAcctTransTrackBean;
import com.asiainfo.crm.cm.inner.account.bo.BOCmBillCustomizeBean;
import com.asiainfo.crm.cm.inner.account.bo.BOCmCustAcctRelBean;
import com.asiainfo.crm.cm.inner.account.bo.QBOCmAccountProfileBean;
import com.asiainfo.crm.cm.inner.account.bo.QBOCmAcctPayMentBean;
import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmAccountAttrValue;
import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmAccountHisValue;
import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmAccountValue;
import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmAcctBillCycleValue;
import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmAcctPaymentValue;
import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmBillCustomizeValue;
import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmCustAcctRelValue;
import com.asiainfo.crm.cm.inner.account.ivalues.IQBOCmAccountProfileValue;
import com.asiainfo.crm.cm.inner.account.ivalues.IQBOCmAcctPayMentValue;
import com.asiainfo.crm.cm.inner.common.service.interfaces.ICmCommonInnerSV;
import com.asiainfo.crm.cm.inner.party.bo.BOCmPartyBean;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmPartyValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.account.bo.BOCmCmxAcctPaymentAttrBean;
import com.asiainfo.crm.cm.ln.account.ivalues.IBOCmCmxAcctPaymentAttrValue;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.model.bean.VOAccountBean;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.bo.AccountBean;
import com.asiainfo.crm.cm.model.bo.AccountProfileBean;
import com.asiainfo.crm.cm.model.bo.AcctBillCustomizeBean;
import com.asiainfo.crm.cm.model.bo.AcctBillCycleBean;
import com.asiainfo.crm.cm.model.bo.AcctPaymentBean;
import com.asiainfo.crm.cm.model.ivalues.IAccountProfileValue;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCustomizeValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCycleValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctPaymentValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyValue;
import com.asiainfo.crm.cm.model.ivalues.ISoAccrelValue;
import com.asiainfo.crm.cm.model.ivalues.IVOAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.service.interfaces.ICmAccountSV;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPartySV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ICmTeamInvokeSV;
import com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICm2SoSV;
import com.asiainfo.crm.common.ivalues.IBOBsBankValue;
import com.asiainfo.crm.so.query.ivalues.IQUserBaseInfoValue;
import com.asiainfo.crm.so.teaminvoke.out.service.interfaces.ICrmFSV;

/**
 * @Copyright Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName CmAccountSVImpl
 * @Description 账户的相关实现类
 * 
 * @version v1.0.0
 * @author huzq2
 * @date 2011-12-16 下午2:31:45
 * 
 * Modification History: Date Author Version Description
 * ---------------------------------------------------------* 2011-12-16 huzq2
 * v1.0.0 修改原因
 */
public class CmAccountSVImpl implements ICmAccountSV {

	public int queryAccountsCount(String xmlComdition) throws Exception {
		return ((AbstractAccountQueryModelImpl) CmServiceFactory.getBusiMode(AbstractAccountQueryModelImpl.class)).queryCount(xmlComdition);
	}

	public int queryAccountsCount(DataContainer conditionDC) throws Exception {
		return ((AbstractAccountQueryModelImpl) CmServiceFactory.getBusiMode(AbstractAccountQueryModelImpl.class)).queryCount(new DataContainer[] { conditionDC });
	}

	public DataContainer[] queryAccounts(String xmlComdition, int startNum, int endNum) throws Exception {
		return (DataContainer[]) ((AbstractAccountQueryModelImpl) CmServiceFactory.getBusiMode(AbstractAccountQueryModelImpl.class)).queryData(xmlComdition, startNum, endNum);
	}

	public IAccountValue queryAccountById(long acctId) throws Exception {
		return ((AbstractAccountQueryModelImpl) CmServiceFactory.getBusiMode(AbstractAccountQueryModelImpl.class)).queryAccountById(acctId, -1, -1);
	}

	public IAcctPaymentValue queryAcctPaymentById(long acctPaymentId) throws Exception {
		return ((AbstractAcctPaymentQueryModelImpl) CmServiceFactory.getBusiMode(AbstractAcctPaymentQueryModelImpl.class)).queryAcctPaymentById(acctPaymentId, -1, -1);
	}

	public IAcctBillCustomizeValue queryBillCustomizeById(long customizeId) throws Exception {
		return ((AbstractAcctBillCustmizeQueryModelImpl) CmServiceFactory.getBusiMode(AbstractAcctBillCustmizeQueryModelImpl.class))
				.queryAcctBillCustomizeById(customizeId, -1, -1);
	}

	public long saveAccount(IVOAccountValue acctValue) throws Exception {
		AbstractAccountDealModelImpl dealModel = (AbstractAccountDealModelImpl) CmServiceFactory.getBusiMode(AbstractAccountDealModelImpl.class);
		dealModel.deal(acctValue);
		return acctValue.getAcctId();
	}

	public DataContainer[] queryAccountHis(String xmlComdition, int startNum, int endNum) throws Exception {
		return (DataContainer[]) ((AbstractAcctHisQueryDealModelImpl) CmServiceFactory.getBusiMode(AbstractAcctHisQueryDealModelImpl.class)).queryData(xmlComdition, startNum,
				endNum);
	}

	public int queryAccountHisCount(String xmlComdition) throws Exception {
		return ((AbstractAcctHisQueryDealModelImpl) CmServiceFactory.getBusiMode(AbstractAcctHisQueryDealModelImpl.class)).queryCount(xmlComdition);
	}

	public IAcctPaymentValue[] queryAcctPaymentByCondition(long acctId, int startNum, int endNum) throws Exception {
		DataContainer dc = new DataContainer();
		dc.set(IAcctPaymentValue.S_AcctId, acctId);
		DataContainerInterface[] paymentValues = ((AbstractAcctPaymentQueryModelImpl) CmServiceFactory.getBusiMode(AbstractAcctPaymentQueryModelImpl.class)).queryData(
				new DataContainer[] { dc }, startNum, endNum);
		if (CmCommonUtil.isNotEmptyObject(paymentValues)) {
			AcctPaymentBean[] iAcctPaymentValues = new AcctPaymentBean[paymentValues.length];
			for (int i = 0; i < paymentValues.length; i++) {
				iAcctPaymentValues[i] = new AcctPaymentBean();
				iAcctPaymentValues[i].copy(paymentValues[i]);
			}
			return iAcctPaymentValues;
		}
		return new AcctPaymentBean[0];
	}

	public int queryAcctPaymentCountByAcctId(long acctId, String state) throws Exception {
		AbstractAcctPaymentQueryModelImpl queryModel = (AbstractAcctPaymentQueryModelImpl) CmServiceFactory.getBusiMode(AbstractAcctPaymentQueryModelImpl.class);
		DataContainer dc = new DataContainer();
		dc.set(IAcctPaymentValue.S_AcctId, acctId);
		if (StringUtils.equals(state, CmConstants.RecordState.USE) || StringUtils.equals(state, CmConstants.RecordState.ERASE)) {
			dc.set(IAcctPaymentValue.S_State, state);
		}
		return queryModel.queryCount(new DataContainer[] { dc });
	}

	public IAcctPaymentValue[] queryAcctPayments(DataContainer dc, int startNum, int endNum) throws Exception {
		AbstractAcctPaymentQueryModelImpl queryModel = (AbstractAcctPaymentQueryModelImpl) CmServiceFactory.getBusiMode(AbstractAcctPaymentQueryModelImpl.class);
		DataContainerInterface[] results = queryModel.queryData(new DataContainer[] { dc }, startNum, endNum);
		return (IAcctPaymentValue[]) results;
	}

	public IAcctPaymentValue[] queryAcctPaymentsByAcctId(long acctId, String state, int startNum, int endNum) throws Exception {
		AbstractAcctPaymentQueryModelImpl queryModel = (AbstractAcctPaymentQueryModelImpl) CmServiceFactory.getBusiMode(AbstractAcctPaymentQueryModelImpl.class);
		DataContainer dc = new DataContainer();
		dc.set(IAcctPaymentValue.S_AcctId, acctId);
		if (StringUtils.equals(state, CmConstants.RecordState.USE) || StringUtils.equals(state, CmConstants.RecordState.ERASE)) {
			dc.set(IAcctPaymentValue.S_State, state);
		}
		return (IAcctPaymentValue[]) queryModel.queryData(new DataContainer[] { dc }, -1, -1);
	}

	public int queryAcctPaymentCountByCondition(long acctId) throws Exception {
		DataContainer dc = new DataContainer();
		dc.set(IAcctPaymentValue.S_AcctId, acctId);
		return ((AbstractAcctPaymentQueryModelImpl) CmServiceFactory.getBusiMode(AbstractAcctPaymentQueryModelImpl.class)).queryCount(new DataContainer[] { dc });
	}

	public IAcctBillCustomizeValue[] queryBillCustomizeByCondition(long acctId, int startNum, int endNum) throws Exception {
		DataContainer dc = new DataContainer();
		dc.set(IAcctPaymentValue.S_AcctId, acctId);
		DataContainerInterface[] billCustomizeValues = ((AbstractAcctBillCustmizeQueryModelImpl) CmServiceFactory.getBusiMode(AbstractAcctBillCustmizeQueryModelImpl.class))
				.queryData(new DataContainer[] { dc }, startNum, endNum);
		if (CmCommonUtil.isNotEmptyObject(billCustomizeValues)) {
			AcctBillCustomizeBean[] acctBillCustomizeValues = new AcctBillCustomizeBean[billCustomizeValues.length];
			for (int i = 0; i < billCustomizeValues.length; i++) {
				acctBillCustomizeValues[i] = new AcctBillCustomizeBean();
				acctBillCustomizeValues[i].copy(billCustomizeValues[i]);
			}
			return acctBillCustomizeValues;
		}
		return new AcctBillCustomizeBean[0];
	}

	public int queryBillCustomizeCountByCondition(long acctId) throws Exception {
		DataContainer dc = new DataContainer();
		dc.set(IAcctBillCustomizeValue.S_AcctId, acctId);
		return ((AbstractAcctBillCustmizeQueryModelImpl) CmServiceFactory.getBusiMode(AbstractAcctBillCustmizeQueryModelImpl.class)).queryCount(new DataContainer[] { dc });
	}

	public int queryAccountCountByCondition(long custId) throws Exception {
		DataContainer dc = new DataContainer();
		dc.set(IAccountValue.S_CustId, custId);
		return ((AbstractAccountQueryModelImpl) CmServiceFactory.getBusiMode(AbstractAccountQueryModelImpl.class)).queryCount(new DataContainer[] { dc });
	}

	public IAccountValue[] queryAccountByCondition(long custId, int startNum, int endNum) throws Exception {
		DataContainer dc = new DataContainer();
		dc.set(IAccountValue.S_CustId, custId);
		DataContainerInterface[] acctValues = ((AbstractAccountQueryModelImpl) CmServiceFactory.getBusiMode(AbstractAccountQueryModelImpl.class)).queryData(
				new DataContainer[] { dc }, startNum, endNum);
		if (CmCommonUtil.isNotEmptyObject(acctValues)) {
			AccountBean[] accountValues = new AccountBean[acctValues.length];
			for (int i = 0; i < acctValues.length; i++) {
				accountValues[i] = new AccountBean();
				accountValues[i].copy(acctValues[i]);
			}
			return accountValues;
		}
		return new AccountBean[0];
	}

	public DataContainer queryAcct(long acctId) throws Exception {
		IAccountProfileValue accountProfileValue = null;
		if (acctId > 0) {
			accountProfileValue = CmServiceFactory.getAccountSV().queryAccountProfileByAcctId(acctId);
		}
		if (accountProfileValue != null) {
			DataContainer containerDC = new DataContainer();
			containerDC.copy(accountProfileValue);
			BOCmAccountAttrBean acctAccountAttrBean = new BOCmAccountAttrBean();
			acctAccountAttrBean.setAcctId(acctId);
			DataContainerInterface[] attrValues = CmServiceFactory.getEntityAttrSV().getEntityAttrValues(acctAccountAttrBean, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(attrValues)) {
				for (int i = 0; i < attrValues.length; i++) {
					String attrCode = attrValues[i].getAsString(IBOCmAccountAttrValue.S_AttrCode);
					if (!containerDC.hasProperty(attrCode)) {
						containerDC.initProperty(attrCode, attrValues[i].getAsString(IBOCmAccountAttrValue.S_AttrValue));
					}
				}
			}
			return containerDC;
		}
		return null;
	}

	public DataContainer[] qryUnUsedCmAcctPaymentInfo(long acctId, int payMethod) throws Exception {
		DataContainer condition = new DataContainer();
		if (acctId <= 0) {
			// 输入参数不合法！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		condition.set(IBOCmAcctPaymentValue.S_AcctId, Long.valueOf(acctId));
		if (payMethod > 0) {
			condition.set(IBOCmAcctPaymentValue.S_PayMethod, Integer.valueOf(payMethod));
		}
		StringBuilder otherCond = new StringBuilder();
		DataContainer[] results = (DataContainer[]) CmInnerServiceFactory.getAccountInnerSV().qryCmAcctPaymentInfos(condition, otherCond.toString(), BOCmAcctPaymentBean.class, -1,
				-1);
		return results;
	}

	public DataContainer[] queryCustAcctRels(long acctId, long custId, Class beanClass, int startIndex, int endIndex) throws Exception {
		DataContainer[] results = (DataContainer[]) CmInnerServiceFactory.getAccountInnerSV().queryCustAcctRelsByAcctIdOrCustId(acctId, custId, beanClass, startIndex, endIndex);
		return results;
	}
	
	public int queryCustAcctRelsCount(long acctId, long custId, Class beanClass) throws Exception {
		int result =  CmInnerServiceFactory.getAccountInnerSV().queryCustAcctRelsByAcctIdOrCustIdCount(acctId, custId, beanClass);
		return result;
	}
	
	public DataContainer[] queryCustAcctRelsByInstallmentFlag(long acctId, long custId, long installmentFlag, Class beanClass, int startIndex, int endIndex) throws Exception {
		DataContainer[] results = (DataContainer[]) CmInnerServiceFactory.getAccountInnerSV().queryCustAcctRelsByAcctIdOrCustIdOrInstallmentFlag(acctId, custId, installmentFlag, beanClass, startIndex, endIndex);
		return results;
	}

	public int queryCustAcctRels(long acctId, long custId, Class beanClass) throws Exception {
		return CmInnerServiceFactory.getAccountInnerSV().queryCustAcctRelsByAcctIdOrCustIdCount(acctId, custId, beanClass);
	}

	public void saveCustAcctRels(IBOCmCustAcctRelValue acctRelValue) throws Exception {
		BOCmCustAcctRelBean acctRelBean = new BOCmCustAcctRelBean();
		acctRelBean.copy(acctRelValue);
		if (acctRelValue.isDeleted() || acctRelValue.isModified() || acctRelValue.isNew()) {
			CmInnerServiceFactory.getCommonInnerSV().saveBean(acctRelBean);
		}
	}

	public IAccountProfileValue[] queryAccountProfiles(DataContainer criteria, int startNum, int endNum) throws Exception {
		if (criteria.get("queryType") == null || "".equals(criteria.get("queryType")))
			criteria.set("queryType", 1);// 默认查询有效的账户信息
		AbstractAccountProfileQueryBusiModelImpl busiModelImpl = (AbstractAccountProfileQueryBusiModelImpl) CmServiceFactory
				.getBusiMode(AbstractAccountProfileQueryBusiModelImpl.class);
		return (IAccountProfileValue[]) busiModelImpl.queryData(new DataContainer[] { criteria }, startNum, endNum);
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
		AbstractAccountProfileQueryBusiModelImpl busiModelImpl = (AbstractAccountProfileQueryBusiModelImpl) CmServiceFactory
				.getBusiMode(AbstractAccountProfileQueryBusiModelImpl.class);
		return (IAccountProfileValue[]) busiModelImpl.queryData(new DataContainer[] { criteria }, startNum, endNum);
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
		AbstractAccountProfileQueryBusiModelImpl busiModelImpl = (AbstractAccountProfileQueryBusiModelImpl) CmServiceFactory
				.getBusiMode(AbstractAccountProfileQueryBusiModelImpl.class);
		return busiModelImpl.queryCount(new DataContainer[] { criteria });
	}

	public IAccountProfileValue queryAccountProfileByAcctId(long acctId) throws Exception {
		if (acctId <= 0) {
			// 输入参数不合法！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		DataContainer criteria = new DataContainer();
		criteria.set(IAccountProfileValue.S_AcctId, acctId);
		criteria.set("queryType", 1);
		AbstractAccountProfileQueryBusiModelImpl busiModelImpl = (AbstractAccountProfileQueryBusiModelImpl) CmServiceFactory
				.getBusiMode(AbstractAccountProfileQueryBusiModelImpl.class);
		IAccountProfileValue[] accountProfileValues = (IAccountProfileValue[]) busiModelImpl.queryData(new DataContainer[] { criteria }, -1, -1);
		return accountProfileValues[0];
	}

	public IAccountProfileValue[] queryAccountProfilesByRelCustId(long relCustId, int payMethod, int queryType, int startNum, int endNum) throws Exception {
		if (relCustId <= 0) {
			// 输入参数不合法！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		DataContainer criteria = new DataContainer();
		criteria.set(IAccountProfileValue.S_RelCustId, relCustId);
		if (StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.ACCOUNT_PAY_METHOD, String.valueOf(payMethod)) != null) {
			criteria.set(IAccountProfileValue.S_PayMethod, payMethod);
		}
		criteria.set("queryType", queryType);
		AbstractAccountProfileQueryBusiModelImpl busiModelImpl = (AbstractAccountProfileQueryBusiModelImpl) CmServiceFactory
				.getBusiMode(AbstractAccountProfileQueryBusiModelImpl.class);
		return (IAccountProfileValue[]) busiModelImpl.queryData(new DataContainer[] { criteria }, startNum, endNum);
	}

	public int queryAccountProfileCountByRelCustId(long relCustId, int payMethod, int queryType) throws Exception {
		if (relCustId <= 0) {
			// 输入参数不合法！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		DataContainer criteria = new DataContainer();
		criteria.set(IAccountProfileValue.S_RelCustId, relCustId);
		if (StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.ACCOUNT_PAY_METHOD, String.valueOf(payMethod)) != null) {
			criteria.set(IAccountProfileValue.S_PayMethod, payMethod);
		}
		criteria.set("queryType", queryType);
		AbstractAccountProfileQueryBusiModelImpl busiModelImpl = (AbstractAccountProfileQueryBusiModelImpl) CmServiceFactory
				.getBusiMode(AbstractAccountProfileQueryBusiModelImpl.class);
		return busiModelImpl.queryCount(new DataContainer[] { criteria });
	}

	public IAcctBillCycleValue[] queryNextAcctBillCyclesByAcctId(long acctId) throws Exception {
		StringBuilder condition = new StringBuilder();
		IAcctBillCycleValue[] billCycleValues = null;
		Map parameter = new HashMap();
		condition.append(IBOCmAcctBillCycleValue.S_AcctId).append("  =:ACCT_ID ");
		parameter.put("ACCT_ID", acctId);
		condition.append(" AND ").append(IBOCmAcctBillCycleValue.S_State).append(" = :state ");
		parameter.put("state", CmConstants.RecordState.USE);

		// 只查询有效期大于当前时间的数据，
		// 因为多账期变更，在账期表可能存在2条账期数据，当前有效，和将来有效的数据。
		condition.append(" AND ").append(IBOCmAcctBillCycleValue.S_ExpireDate).append(" > now() ORDER BY EFFECTIVE_DATE DESC");
		IBOCmAcctBillCycleValue[] acctBillCycleValues = (IBOCmAcctBillCycleValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmAcctBillCycleBean.class,
				condition.toString(), parameter, -1, -1);

		if (CmCommonUtil.isNotEmptyObject(acctBillCycleValues)) {
			if (acctBillCycleValues.length > 2)
				ExceptionUtil.throwBusinessException("The current account has more than two non- entry into force of the account period !");
			else {
				billCycleValues = new IAcctBillCycleValue[acctBillCycleValues.length];
				for (int i = 0; i < acctBillCycleValues.length; i++) {
					billCycleValues[i] = new AcctBillCycleBean();
					billCycleValues[i].copy(acctBillCycleValues[i]);
				}
			}
		} else {
			ExceptionUtil.throwBusinessException("The current account is not set up effective account!");
		}
		return billCycleValues;

	}

	public IAcctBillCycleValue queryCurrAcctBillCyclesByAcctId(long acctId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmAcctBillCycleValue.S_AcctId).append("  =:acctId ");
		parameter.put("acctId", acctId);
		parameter.put(IBOCmAcctBillCycleValue.S_AcctId, acctId);
		condition.append(" AND ").append(IBOCmAcctBillCycleValue.S_State).append(" = :state ");
		parameter.put("state", CmConstants.RecordState.USE);
		condition.append(" AND ").append(IBOCmAcctBillCycleValue.S_EffectiveDate).append(" < now() ");
		condition.append(" AND ").append(IBOCmAcctBillCycleValue.S_ExpireDate).append(" > now() ");
		IBOCmAcctBillCycleValue[] acctBillCycleValues = (IBOCmAcctBillCycleValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmAcctBillCycleBean.class,
				condition.toString(), parameter, -1, -1);
		IAcctBillCycleValue billCycleValue = new AcctBillCycleBean();
		if (CmCommonUtil.isNotEmptyObject(acctBillCycleValues)) {
			billCycleValue.copy(acctBillCycleValues[0]);
		} else { // 如果当前账户没有设置账期日，则默认为自然月账期，即账期日为1号。
			return null;
		}
		return billCycleValue;
	}

	public IAcctBillCycleValue[] queryAcctBillCyclesByAcctId(long acctId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmAcctBillCycleValue.S_AcctId).append("  =:acctId ");
		parameter.put("acctId", acctId);
		parameter.put(IBOCmAcctBillCycleValue.S_AcctId, acctId);
		IBOCmAcctBillCycleValue[] acctBillCycleValues = (IBOCmAcctBillCycleValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmAcctBillCycleBean.class,
				condition.toString(), parameter, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(acctBillCycleValues)) {
			IAcctBillCycleValue[] billCycleValues = new IAcctBillCycleValue[acctBillCycleValues.length];
			for (int i = 0; i < acctBillCycleValues.length; i++) {
				billCycleValues[i] = new AcctBillCycleBean();
				billCycleValues[i].copy(acctBillCycleValues[i]);
			}
			return billCycleValues;
		}
		return new IAcctBillCycleValue[0];
	}

	public DataContainer[] queryAcctAndPayments(String xmlComdition, int startNum, int endNum) throws Exception {
		return (DataContainer[]) ((AbstractAcctAndPaymentQueryDealModelImpl) CmServiceFactory.getBusiMode(AbstractAcctAndPaymentQueryDealModelImpl.class)).queryData(xmlComdition,
				startNum, endNum);
	}

	public int queryAcctAndPaymentsCount(String xmlComdition) throws Exception {
		return ((AbstractAcctAndPaymentQueryDealModelImpl) CmServiceFactory.getBusiMode(AbstractAcctAndPaymentQueryDealModelImpl.class)).queryCount(xmlComdition);
	}

	public IQBOCmAcctPayMentValue queryAcctAndPaymentById(long acctId, long acctPaymentId) throws Exception {
		DataContainer dc = new DataContainer();
		if (acctId > 0) {
			dc.set(IQBOCmAcctPayMentValue.S_AcctId, acctId);
		}
		if (acctPaymentId > 0) {
			dc.set(IQBOCmAcctPayMentValue.S_PaymentId, acctPaymentId);
		}
		dc.set(IQBOCmAcctPayMentValue.S_State, CmConstants.RecordState.USE);
		DataContainerInterface[] acctAndPayment = ((AbstractAcctAndPaymentQueryDealModelImpl) CmServiceFactory.getBusiMode(AbstractAcctAndPaymentQueryDealModelImpl.class))
				.queryData(new DataContainer[] { dc }, -1, -1);
		QBOCmAcctPayMentBean acctAndPaymentValue = null;
		if (CmCommonUtil.isNotEmptyObject(acctAndPayment)) {
			acctAndPaymentValue = new QBOCmAcctPayMentBean();
			acctAndPaymentValue.copy(acctAndPayment[0]);
		}
		return acctAndPaymentValue;
	}

	public IAcctBillCustomizeValue queryCurrAcctBillCustomizesByAcctId(long acctId) throws Exception {
		AcctBillCustomizeBean sample = new AcctBillCustomizeBean();
		sample.setAcctId(acctId);
		sample.setState(CmConstants.RecordState.USE);
		sample.initProperty("queryType", 1);
		AbstractAcctBillCustmizeQueryModelImpl busiModelImpl = (AbstractAcctBillCustmizeQueryModelImpl) CmServiceFactory.getBusiMode(AbstractAcctBillCustmizeQueryModelImpl.class);
		IAcctBillCustomizeValue[] customizeValues = (IAcctBillCustomizeValue[]) busiModelImpl.queryData(new DataContainer[] { sample }, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(customizeValues)) {
			return customizeValues[0];
		}
		return null;
	}

	public IAccountProfileValue[] queryAccountProfilesByRegionId(String regionId, int payMethod, int queryType, int startNum, int endNum) throws Exception {
		if (StringUtils.isBlank(regionId) || !CmStaticDataUtil.isLegalStaticData(CmConstants.CmStaticDataCodeType.ACCOUNT_PAY_METHOD, String.valueOf(payMethod))) {
			// 输入参数不合法！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		DataContainer criteria = new DataContainer();
		criteria.set(IAccountProfileValue.S_RegionId, regionId);
		if (StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.ACCOUNT_PAY_METHOD, String.valueOf(payMethod)) != null) {
			criteria.set(IAccountProfileValue.S_PayMethod, payMethod);
		}
		criteria.set("queryType", queryType);
		AbstractAccountProfileQueryBusiModelImpl busiModelImpl = (AbstractAccountProfileQueryBusiModelImpl) CmServiceFactory
				.getBusiMode(AbstractAccountProfileQueryBusiModelImpl.class);
		return (IAccountProfileValue[]) busiModelImpl.queryData(new DataContainer[] { criteria }, startNum, endNum);
	}

	public int queryAccountProfileCountByRegionId(String regionId, int payMethod, int queryType) throws Exception {
		if (StringUtils.isBlank(regionId) || !CmStaticDataUtil.isLegalStaticData(CmConstants.CmStaticDataCodeType.ACCOUNT_PAY_METHOD, String.valueOf(payMethod))) {
			// 输入参数不合法！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		DataContainer criteria = new DataContainer();
		criteria.set(IAccountProfileValue.S_RegionId, regionId);
		if (StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.ACCOUNT_PAY_METHOD, String.valueOf(payMethod)) != null) {
			criteria.set(IAccountProfileValue.S_PayMethod, payMethod);
		}
		criteria.set("queryType", queryType);
		AbstractAccountProfileQueryBusiModelImpl busiModelImpl = (AbstractAccountProfileQueryBusiModelImpl) CmServiceFactory
				.getBusiMode(AbstractAccountProfileQueryBusiModelImpl.class);
		return busiModelImpl.queryCount(new DataContainer[] { criteria });
	}

	public IAcctPaymentValue queryCurrAcctPaymentsByAcctId(long acctId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IAcctPaymentValue.S_AcctId).append("  =:acctId ");
		parameter.put("acctId", acctId);
		parameter.put(IAcctPaymentValue.S_AcctId, acctId);
		condition.append(" AND ").append(IAcctPaymentValue.S_State).append(" = :state ");
		parameter.put("state", CmConstants.RecordState.USE);
		condition.append(" AND ").append(IAcctPaymentValue.S_EffectiveDate).append(" < now() ");
		condition.append(" AND ").append(IAcctPaymentValue.S_ExpireDate).append(" > now() ");
		DataContainerInterface[] paymentValues = CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmAcctPaymentBean.class, condition.toString(), parameter, -1, -1);
//		if (CmCommonUtil.isNotEmptyObject(paymentValues)) {
//			IAcctPaymentValue paymentValue = new AcctPaymentBean();
//			paymentValue.copy(paymentValues[0]);
//			if (StringUtils.isNotBlank(paymentValue.getPaymentBankCode())) {
//				IBOBsBankValue bankValue = BankUtil.getBankByBankCode(paymentValue.getPaymentBankCode());
//				if (CmCommonUtil.isNotEmptyObject(bankValue))
//					paymentValue.set("PAYMENT_BANK_NAME", bankValue.getBankName());
//			}
//			return paymentValue;
//		}
		return null;
	}

	public IAcctBillCycleValue[] queryAcctBillCyclesByDoneDate(Timestamp doneDate, int startNum, int endNum) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		// BETWEEN AND ：闭区间。
		condition.append(IAcctBillCycleValue.S_DoneDate).append(" BETWEEN TO_DATE(:startDoneDate , 'YYYY-MM-DD HH24:MI:SS') AND  TO_DATE(:endDoneDate , 'YYYY-MM-DD HH24:MI:SS') ");
		parameter.put("startDoneDate", TimeUtil.getYYYY_MM_DD(doneDate) + " 00:00:00");
		parameter.put("endDoneDate", TimeUtil.getYYYY_MM_DD(doneDate) + " 23:59:59");
		DataContainerInterface[] beans = CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmAcctBillCycleBean.class, condition.toString(), parameter, startNum, endNum);
		if (CmCommonUtil.isNotEmptyObject(beans)) {
			AcctBillCycleBean[] results = new AcctBillCycleBean[beans.length];
			for (int i = 0; i < results.length; i++) {
				results[i] = new AcctBillCycleBean();
				results[i].copy(beans[i]);
			}
			return results;
		}
		return new AcctBillCycleBean[0];
	}

	public int queryBillCustomizeCountByCustId(long custId) throws Exception {
		if (custId <= 0) {
			// 输入参数不合法！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		DataContainer criteria = new DataContainer();
		criteria.set(IAcctBillCustomizeValue.S_CustId, custId);
		criteria.set(IAcctBillCustomizeValue.S_RegionId, CenterUtil.getRegionIdByCustId(custId));
		AbstractAcctBillCustmizeQueryModelImpl busiModelImpl = (AbstractAcctBillCustmizeQueryModelImpl) CmServiceFactory.getBusiMode(AbstractAcctBillCustmizeQueryModelImpl.class);
		return busiModelImpl.queryCount(new DataContainer[] { criteria });
	}

	public IAcctBillCustomizeValue[] queryBillCustomizesByCustId(long custId, int startNum, int endNum) throws Exception {
		if (custId <= 0) {
			// 输入参数不合法！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		DataContainer criteria = new DataContainer();
		criteria.set(IAcctBillCustomizeValue.S_CustId, custId);
		criteria.set(IAcctBillCustomizeValue.S_RegionId, CenterUtil.getRegionIdByCustId(custId));
		AbstractAcctBillCustmizeQueryModelImpl busiModelImpl = (AbstractAcctBillCustmizeQueryModelImpl) CmServiceFactory.getBusiMode(AbstractAcctBillCustmizeQueryModelImpl.class);
		return (IAcctBillCustomizeValue[]) busiModelImpl.queryData(new DataContainer[] { criteria }, startNum, endNum);
	}

	public IBOCmBillCustomizeValue queryCmBillCustomizeByUserId(long userId, int startNum, int endNum) throws Exception {
		// 输入参数不合法！
		return null;
	}

	public IBOCmBillCustomizeValue queryCmBillCustomizeByUserId(long acctId, long userId, int startNum, int endNum) throws Exception {
		return null;
	}

	public IBOCmBillCustomizeValue queryCmBillCustomizeByUserId(long userId) throws Exception {
		// 输入参数不合法！
		if (userId <= 0) {
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmBillCustomizeValue.S_UserId).append("  = :userId ");
		parameter.put("userId", userId);
		condition.append(" AND ").append(IBOCmBillCustomizeValue.S_State).append(" = :state ");
		parameter.put("state", CmConstants.RecordState.USE);
		parameter.put(IBOCmBillCustomizeValue.S_RegionId, CenterUtil.getRegionIdByUserId(userId));
		DataContainerInterface[] Values = CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmBillCustomizeBean.class, condition.toString(), parameter, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(Values)) {
			IBOCmBillCustomizeValue value = new BOCmBillCustomizeBean();
			value.copy(Values[0]);
			return value;
		}
		return null;
	}

	public IAccountValue[] queryAccountByRelCustId(long relCustId, int payMethod, int queryType, int startNum, int endNum) throws Exception {
		if (relCustId <= 0) {
			// 输入参数不合法！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		DataContainer criteria = new DataContainer();
		criteria.set(IAccountValue.S_CustId, relCustId);
		if (StaticDataUtil.getStaticData(CmConstants.CmStaticDataCodeType.ACCOUNT_PAY_METHOD, String.valueOf(payMethod)) != null) {
			criteria.set(IAccountProfileValue.S_PayMethod, payMethod);
		}
		criteria.set("queryType", queryType);
		AbstractAccountQueryModelImpl busiModelImpl = (AbstractAccountQueryModelImpl) CmServiceFactory.getBusiMode(AbstractAccountQueryModelImpl.class);

		return (IAccountValue[]) busiModelImpl.queryData(new DataContainer[] { criteria }, startNum, endNum);
	}

	public int queryAccountCountByRelCustId(long relCustId, int payMethod, int queryType) throws Exception {
		if (relCustId <= 0) {
			// 输入参数不合法！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		DataContainer criteria = new DataContainer();
		criteria.set(IAccountValue.S_CustId, relCustId);
		criteria.set("queryType", queryType);
		AbstractAccountQueryModelImpl busiModelImpl = (AbstractAccountQueryModelImpl) CmServiceFactory.getBusiMode(AbstractAccountQueryModelImpl.class);
		return busiModelImpl.queryCount(new DataContainer[] { criteria });

	}

	public IBOCmAccountHisValue[] queryAccountHis(long acctId, String acctName, String doneDate, String startDate, String endDate, int startNum, int endNum) throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1=1 AND ");
		if ("".equals(doneDate)) {
			condition.append(IBOCmAccountHisValue.S_DoneDate).append(" BETWEEN ").append(" to_date('").append(startDate).append(" ','yyyy-MM-dd hh24:mi:ss'").append(") ")
					.append(" AND ").append(" to_date('").append(endDate).append("','yyyy-MM-dd hh24:mi:ss'").append(") +1 ");
		} else {
			condition.append(IBOCmAccountHisValue.S_DoneDate).append(" = to_date( :doneDate , 'yyyy-MM-dd hh24:mi:ss')");
			paraMap.put("doneDate", doneDate);
		}
		if (acctId > 0) {
			condition.append(" AND ").append(IBOCmAccountHisValue.S_AcctId).append(" = :acctId ");
			paraMap.put("acctId", Long.valueOf(acctId));
		}
		String[] billingCycles = CmCommonUtil.getCycleYY(startDate, endDate);
		return CmServiceFactory.getAccountSV().queryAccountHis(condition.toString(), paraMap, billingCycles, startNum, endNum);
	}

	public IBOCmAccountHisValue[] queryAccountHis(String condition, Map paraMap, String[] billingCycles, int startNum, int endNum) throws Exception {
		if (billingCycles == null || billingCycles.length == 0) {
			// 查询失败，传入的帐期列表为空！
			ExceptionUtil.throwBusinessException("CMS0022003");
		}

		TableVars[] tableVars = new TableVars[billingCycles.length];
		for (int i = 0; i < billingCycles.length; i++) {
			tableVars[i] = new TableVars();
			tableVars[i].add("CM_ACCOUNT_H", "DONE_DATE", billingCycles[i]);
		}
		StringBuilder orderBy = new StringBuilder().append(IBOCmAccountHisValue.S_DoneDate);
		String querySql = CmCommonUtil.createUnionSql(BOCmAccountHisBean.class, new StringBuilder(condition), orderBy, tableVars);
		StringBuilder finalSql = new StringBuilder();
		if (startNum != -1 && endNum != -1) {
			finalSql.append("SELECT * FROM (");
			finalSql.append("SELECT * FROM (");
		}

		finalSql.append("SELECT M.* FROM (");
		finalSql.append("SELECT * FROM (").append(querySql).append(") ");
		finalSql.append(") M ");

		if (startNum != -1 && endNum != -1) {
			finalSql.append(" LIMIT :startNum,:endNum ");
			paraMap.put("startNum", Integer.valueOf(startNum));
			paraMap.put("endNum", Integer.valueOf(endNum));
		}

		return BOCmAccountHisEngine.getBeansFromSql(finalSql.toString(), paraMap);
	}

	public int queryAccountHisCount(long acctId, String acctName, String doneDate, String startDate, String endDate) throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1=1 AND ");
		condition.append(IBOCmAccountHisValue.S_DoneDate).append(" BETWEEN ").append(" to_date('").append(startDate).append(" ','yyyy-MM-dd hh24:mi:ss'").append(") ")
				.append(" AND ").append(" to_date('").append(endDate).append("','yyyy-MM-dd hh24:mi:ss'").append(") +1");
		String[] billingCycles = CmCommonUtil.getCycleYY(startDate, endDate);
		if (acctId > 0) {
			condition.append(" AND ").append(IBOCmAccountHisValue.S_AcctId).append(" = :acctId ");
			paraMap.put("acctId", Long.valueOf(acctId));
		}
		TableVars[] tableVars = new TableVars[billingCycles.length];
		for (int i = 0; i < billingCycles.length; i++) {
			tableVars[i] = new TableVars();
			tableVars[i].add("CM_ACCOUNT_H", "DONE_DATE", billingCycles[i]);
		}
		String querySql = "";
		int count = 0;
		IBOCmAccountHisValue[] retValues = BOCmAccountHisEngine.getBeansFromSql(querySql.toString(), paraMap);
		if (retValues != null && retValues.length > 0) {
			count = retValues.length;
		}
		return count;
	}

	public IBOCmCmxAcctPaymentAttrValue queryCmxAcctPaymentAttrById(long payment_id, String attr_code) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmCmxAcctPaymentAttrValue.S_PaymentId).append("  =:paymentid ");
		condition.append(" AND ").append(IBOCmCmxAcctPaymentAttrValue.S_AttrCode).append(" = :attrcode ");
		condition.append(" AND ").append(IBOCmCmxAcctPaymentAttrValue.S_State).append(" = :state ");

		parameter.put("paymentid", payment_id);
		parameter.put("attrcode", attr_code);
		parameter.put("state", CmConstants.RecordState.USE);

		IBOCmCmxAcctPaymentAttrValue[] Values = (IBOCmCmxAcctPaymentAttrValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCmxAcctPaymentAttrBean.class,
				condition.toString(), parameter, -1, -1);

		if (CmCommonUtil.isNotEmptyObject(Values)) {
			IBOCmCmxAcctPaymentAttrValue value = new BOCmCmxAcctPaymentAttrBean();
			value.copy(Values[0]);
			return value;
		}
		return null;
	}

	// 保存账户账期信息
	public void saveAccountValue(IBOCmAcctBillCycleValue[] acctValue) throws Exception {
		ICmCommonInnerSV cmCommon = (ICmCommonInnerSV) ServiceFactory.getService(ICmCommonInnerSV.class);
		BOCmAcctBillCycleBean[] acctBeanVal = new BOCmAcctBillCycleBean[acctValue.length];
		for (int i = 0; i < acctValue.length; i++) {
			acctBeanVal[i] = new BOCmAcctBillCycleBean();
			acctBeanVal[i].copy(acctValue[i]);
		}
		cmCommon.saveBeans(acctBeanVal);
	}

	public IBOCmAcctBillCycleValue[] qryCurrAcctBillCyclesByAcctId(long acctId, String regionId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IBOCmAcctBillCycleValue.S_AcctId).append("  =:acctId ");
		parameter.put("acctId", acctId);
		condition.append(" AND ").append(IBOCmAcctBillCycleValue.S_State).append(" = :state ");
		parameter.put("state", CmConstants.RecordState.USE);
		condition.append(" AND ").append(IBOCmAcctBillCycleValue.S_RegionId).append(" = :regionId ");
		parameter.put("regionId", regionId);
		condition.append(" AND ").append(IBOCmAcctBillCycleValue.S_ExpireDate).append(" > now() ");
		CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.REGION_ID, regionId);
		IBOCmAcctBillCycleValue[] acctBillCycleValues = (IBOCmAcctBillCycleValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmAcctBillCycleBean.class,
				condition.toString(), parameter, -1, -1);

		return acctBillCycleValues;
	}

	public IAccountValue[] queryAcctsByIds(long[] acctIds, String regionId) throws Exception {
		if (acctIds == null || acctIds.length < 1 || StringUtils.isBlank(regionId)) {
			// 输入参数不合法！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IAccountValue.S_AcctId).append(" IN ( ");
		for (int i = 0, len = acctIds.length; i < len; i++) {
			condition.append(":acctId").append(i).append(" ");
			parameter.put("acctId" + i, Long.valueOf(acctIds[i]));
			if (i != len - 1) {
				condition.append(",");
			}
		}
		condition.append(")");
		parameter.put(IBOCmAccountValue.S_RegionId, regionId);
		// 设置账户分表
		parameter.put(IBOCmAccountValue.S_AcctId, acctIds[0]);
		condition.append(" AND ").append(IBOCmAccountValue.S_State).append(" =:state ");
		parameter.put("state", "U");
		IBOCmAccountValue[] accountValues = (IBOCmAccountValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmAccountBean.class, condition.toString(), parameter, -1, -1);
		if (CmCommonUtil.isEmptyObject(accountValues)) {
			return new IAccountValue[0];
		}

		ICmAccountSV accountSV = CmServiceFactory.getAccountSV();
		ICmCustomerSV sv = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		IAccountValue[] result = new IAccountValue[accountValues.length];
		for (int i = 0, len = accountValues.length; i < len; i++) {
			result[i] = new AccountBean();
			result[i].copy(accountValues[i]);
			// 获取custid
			long custId = result[i].getCustId();
			// 获取accid
			long accId = result[i].getAcctId();
			// 根据accid获取支付方式
			IAcctPaymentValue apvalue = accountSV.queryCurrAcctPaymentsByAcctId(accId);
			int payMethod = apvalue.getPayMethod();
			result[i].setAcctType(payMethod);
			if (payMethod == CmConstants.AccountConstants.SELF_ACCT) {
				// 支付类型为自有类型
				// 根据custId查找firstName与lastName
				ICustomerValue custVal = sv.queryCustomerByCustId(custId);
				result[i].setFirstName(custVal.getFirstName());
				result[i].setLastName(custVal.getLastName());
				result[i].setCustName(custVal.getCustName());
				result[i].setCustCertCode(custVal.getCustCertCode());
			} else {
				// 支付类型为代付根据accId获取party表
				IBOCmPartyValue[] val = getPayerByAcctId(accId);
				// 设置客户名称为参与人名称
				if (val.length > 0 && val != null) {
					result[i].setFirstName(val[0].getFirstName());
					result[i].setLastName(val[0].getLastName());
					result[i].setCustName(val[0].getPartyName());
					result[i].setCustCertCode(val[0].getCertCode());
				}
			}
		}
		return result;
	}
	/**
	 * 针对OSE getAccountSimpleListByCustId 接口，去掉first name second name的或者，减少查询
	 */
	public IAccountValue[] queryAcctsByIdsForOSE(long[] acctIds, String regionId) throws Exception {
		if (acctIds == null || acctIds.length < 1 || StringUtils.isBlank(regionId)) {
			// 输入参数不合法！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IAccountValue.S_AcctId).append(" IN ( ");
		for (int i = 0, len = acctIds.length; i < len; i++) {
			condition.append(":acctId").append(i).append(" ");
			parameter.put("acctId" + i, Long.valueOf(acctIds[i]));
			if (i != len - 1) {
				condition.append(",");
			}
		}
		condition.append(")");
		parameter.put(IBOCmAccountValue.S_RegionId, regionId);
		// 设置账户分表
		parameter.put(IBOCmAccountValue.S_AcctId, acctIds[0]);
		condition.append(" AND ").append(IBOCmAccountValue.S_State).append(" =:state ");
		parameter.put("state", "U");
		IBOCmAccountValue[] accountValues = (IBOCmAccountValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmAccountBean.class, condition.toString(), parameter, -1, -1);
		if (CmCommonUtil.isEmptyObject(accountValues)) {
			return new IAccountValue[0];
		}
		
		ICmAccountSV accountSV = CmServiceFactory.getAccountSV();
		ICmCustomerSV sv = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		IAccountValue[] result = new IAccountValue[accountValues.length];
		for (int i = 0, len = accountValues.length; i < len; i++) {
			result[i] = new AccountBean();
			result[i].copy(accountValues[i]);
			// 获取custid
			long custId = result[i].getCustId();
			// 获取accid
			long accId = result[i].getAcctId();
			// 根据accid获取支付方式
			IAcctPaymentValue apvalue = accountSV.queryCurrAcctPaymentsByAcctId(accId);
			int payMethod = apvalue.getPayMethod();
			result[i].setAcctType(payMethod);
		}
		return result;
	}

	public IAccountValue[] queryAcctsById(long acctId, long custId, int startIndex, int endIndex) throws Exception {
		IBOCmCustAcctRelValue[] acctRelValues = (IBOCmCustAcctRelValue[]) queryCustAcctRels(acctId, custId, BOCmCustAcctRelBean.class, startIndex, endIndex);
		if (CmCommonUtil.isEmptyObject(acctRelValues)) {
			return new IAccountValue[0];
		}
		Map temp = new HashMap();
		String regionId = "";
		for (int i = 0, len = acctRelValues.length; i < len; i++) {
			// 修改为按账户ID，第3-6位(regionId)分组
			regionId = CenterUtil.getRegionIdByAcctId(acctRelValues[i].getAcctId());
			if (temp.containsKey(regionId)) {
				((List) temp.get(regionId)).add(acctRelValues[i].getAcctId());
			} else {
				List acctList = new ArrayList();
				acctList.add(acctRelValues[i].getAcctId());
				temp.put(regionId, acctList);
			}
		}
		List result = new ArrayList();
		List tempList = null;
		for (Iterator it = temp.entrySet().iterator(); it.hasNext();) {
			Entry entry = (Entry) it.next();
			tempList = (List) entry.getValue();
			Long[] ids = (Long[]) tempList.toArray(new Long[0]);
			long[] longIds = ArrayUtils.toPrimitive(ids);
			IAccountValue[] tempValues = CmServiceFactory.getAccountSV().queryAcctsByIds(longIds, (String) entry.getKey());
			CollectionUtils.addAll(result, tempValues);
		}
		if (CmCommonUtil.isEmptyObject(result)) {
			return new IAccountValue[0];
		}
		return (IAccountValue[]) result.toArray(new IAccountValue[0]);
	}
	
	/**
	 * 为OSE接口专提供
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2019-9-9
	* CmAccountSVImpl
	 */
	public IAccountValue[] queryAcctsByIdForOSE(long acctId, long custId, int startIndex, int endIndex) throws Exception {
		IBOCmCustAcctRelValue[] acctRelValues = (IBOCmCustAcctRelValue[]) queryCustAcctRels(acctId, custId, BOCmCustAcctRelBean.class, startIndex, endIndex);
		if (CmCommonUtil.isEmptyObject(acctRelValues)) {
			return new IAccountValue[0];
		}
		Map temp = new HashMap();
		String regionId = "";
		for (int i = 0, len = acctRelValues.length; i < len; i++) {
			// 修改为按账户ID，第3-6位(regionId)分组
			regionId = CenterUtil.getRegionIdByAcctId(acctRelValues[i].getAcctId());
			if (temp.containsKey(regionId)) {
				((List) temp.get(regionId)).add(acctRelValues[i].getAcctId());
			} else {
				List acctList = new ArrayList();
				acctList.add(acctRelValues[i].getAcctId());
				temp.put(regionId, acctList);
			}
		}
		List result = new ArrayList();
		List tempList = null;
		for (Iterator it = temp.entrySet().iterator(); it.hasNext();) {
			Entry entry = (Entry) it.next();
			tempList = (List) entry.getValue();
			Long[] ids = (Long[]) tempList.toArray(new Long[0]);
			long[] longIds = ArrayUtils.toPrimitive(ids);
			IAccountValue[] tempValues = CmServiceFactory.getAccountSV().queryAcctsByIdsForOSE(longIds, (String) entry.getKey());
			CollectionUtils.addAll(result, tempValues);
		}
		if (CmCommonUtil.isEmptyObject(result)) {
			return new IAccountValue[0];
		}
		return (IAccountValue[]) result.toArray(new IAccountValue[0]);
	}

	public int queryAcctsCountById(long acctId, long custId) throws Exception {
		return queryAcctsById(acctId, custId, -1, -1).length;
	}

	public IAccountProfileValue[] queryAcctDtsByIds(long[] acctIds, String regionId) throws Exception {
		if (acctIds == null || acctIds.length < 1 || StringUtils.isBlank(regionId)) {
			// 输入参数不合法！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IAccountValue.S_AcctId).append(" IN ( ");
		for (int i = 0, len = acctIds.length; i < len; i++) {
			condition.append(":ACCTID").append(i).append(" ");
			parameter.put("ACCTID" + i, Long.valueOf(acctIds[i]));
			if (i != len - 1) {
				condition.append(",");
			}
		}
		if (acctIds.length > 0) {
			parameter.put(IBOCmAccountValue.S_AcctId, acctIds[0]);
		}
		condition.append(")");
		parameter.put(IBOCmAccountValue.S_RegionId, regionId);
		condition.append(" AND (").append(IAccountProfileValue.S_CycleExpireDate).append(" >= now() OR ");
		condition.append(IAccountProfileValue.S_CycleExpireDate).append(" is null )");
		condition.append(" AND (").append(IAccountProfileValue.S_CycleEffectiveDate).append(" <= :CURDATE OR ");
		parameter.put("CURDATE", ServiceManager.getIdGenerator().getSysDate());
		condition.append(IAccountProfileValue.S_CycleEffectiveDate).append(" is null )");
		String sql = CmCommonUtil.getDynamicSqlByCondsForAcct(QBOCmAccountProfileBean.class, condition.toString(), parameter, -1, -1);
		IQBOCmAccountProfileValue[] accountValues = (IQBOCmAccountProfileValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(QBOCmAccountProfileBean.class, sql,
				parameter);
		if (CmCommonUtil.isEmptyObject(accountValues)) {
			return new IAccountProfileValue[0];
		}
		IAccountProfileValue[] result = new IAccountProfileValue[accountValues.length];
		for (int i = 0, len = accountValues.length; i < len; i++) {
			result[i] = new AccountProfileBean();
			// 只查出可用的账户
			result[i].copy(accountValues[i]);
			// 获取账户归属的payer信息，结果存入result;
			getAcctOwnerInfo(result[i]);
		}
		return result;
	}

	public IAccountProfileValue[] queryAllAcctDtsByIds(long[] acctIds, String regionId) throws Exception {
		if (acctIds == null || acctIds.length < 1 || StringUtils.isBlank(regionId)) {
			// 输入参数不合法！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IAccountValue.S_AcctId).append(" IN ( ");
		for (int i = 0, len = acctIds.length; i < len; i++) {
			condition.append(":acctId").append(i).append(" ");
			parameter.put("acctId" + i, Long.valueOf(acctIds[i]));
			if (i != len - 1) {
				condition.append(",");
			}
		}
		if (acctIds.length > 0) {
			parameter.put(IBOCmAccountValue.S_AcctId, acctIds[0]);
		}
		condition.append(")");
		IQBOCmAccountProfileValue[] accountValues = (IQBOCmAccountProfileValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(QBOCmAccountProfileBean.class,
				condition.toString(), parameter, -1, -1);
		if (CmCommonUtil.isEmptyObject(accountValues)) {
			return new IAccountProfileValue[0];
		}
		IAccountProfileValue[] result = new IAccountProfileValue[accountValues.length];
		for (int i = 0, len = accountValues.length; i < len; i++) {
			result[i] = new AccountProfileBean();
			result[i].copy(accountValues[i]);
			// 获取账户归属的payer信息，结果存入result;
			getAcctOwnerInfo(result[i]);
		}
		return result;
	}

	private void getAcctOwnerInfo(IAccountProfileValue result) throws Exception {
		// 得到custid
		long custId = result.getCustId();
		// 得到accountId
		long accId = result.getAcctId();
		if (result.getPayMethod() == 1) {
			// 支付类型为自有类型
			// 根据custId查找firstName与lastName
			ICmCustomerSV sv = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			ICustomerValue custVal = sv.queryCustomerByCustId(custId);
			result.setFirstName(custVal.getFirstName());
			result.setLastName(custVal.getLastName());
			// 设置账户名称为客户名称
			result.setCustName(custVal.getCustName());
			result.setCustCredCode(custVal.getCustCertCode());
		} else {
			// 支付类型为代付
			IBOCmPartyValue[] val = getPayerByAcctId(accId);
			// 设置客户名称为参与人名称
			if (val != null && val.length > 0) {
				result.setCustName(val[0].getPartyName());
				result.setFirstName(val[0].getFirstName());
				result.setLastName(val[0].getLastName());
				result.setCustCredCode(val[0].getCertCode());
			}
		}
	}

	private IBOCmPartyValue[] getPayerByAcctId(long accId) throws Exception {
		/**
		 * 1根据accId查找CM_PARTY_ACCT_REL得到partId
		 * 2根据partId查找CM_PARTY的到firstName和lastName
		 * 
		 */
		StringBuffer condition1 = new StringBuffer("");
		// 关联查询CM_PARTY_ACCT_REL,CM_PARTY
		condition1.append("SELECT A.FIRST_NAME,A.LAST_NAME,A.PARTY_NAME,A.CERT_CODE " + "FROM {CM_PARTY} A,{CM_PARTY_ACCT_REL} B WHERE A.PARTY_ID=B.PARTY_ID AND B.ACCT_ID="
				+ accId);
		String sql = SplitTableFactory.createQuerySQL(condition1.toString(), new HashMap());
		IBOCmPartyValue[] val = (IBOCmPartyValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmPartyBean.class, sql, null);
		return val;
	}

	public IAccountProfileValue[] queryAcctDtsById(long acctId, long custId, int start, int end) throws Exception {
		IBOCmCustAcctRelValue[] acctRelValues = (IBOCmCustAcctRelValue[]) queryCustAcctRels(acctId, custId, BOCmCustAcctRelBean.class, start, end);
		if (CmCommonUtil.isEmptyObject(acctRelValues)) {
			return new IAccountProfileValue[0];
		}
		Map temp = new HashMap();
		String regionId = "";
		String paymentTeams = "";
		String reason = "";
		for (int i = 0, len = acctRelValues.length; i < len; i++) {
			// 修改为按账户ID，第3-6位(regionId)分组
			regionId = CenterUtil.getRegionIdByAcctId(acctRelValues[i].getAcctId());
			reason = acctRelValues[i].getRemarks();
			paymentTeams = String.valueOf(acctRelValues[i].getBillDueDate());
			if (temp.containsKey(regionId)) {
				((List) temp.get(regionId)).add(acctRelValues[i].getAcctId());
			} else {
				List acctList = new ArrayList();
				acctList.add(acctRelValues[i].getAcctId());
				temp.put(regionId, acctList);
			}
		}
		List result = new ArrayList();
		List tempList = null;
		for (Iterator it = temp.entrySet().iterator(); it.hasNext();) {
			Entry entry = (Entry) it.next();
			tempList = (List) entry.getValue();
			Long[] ids = (Long[]) tempList.toArray(new Long[0]);
			long[] longIds = ArrayUtils.toPrimitive(ids);
			IAccountProfileValue[] tempValues = CmServiceFactory.getAccountSV().queryAcctDtsByIds(longIds, (String) entry.getKey());
			CollectionUtils.addAll(result, tempValues);
		}
		if (CmCommonUtil.isEmptyObject(result)) {
			return new IAccountProfileValue[0];
		}
		IAccountProfileValue[] resultValue = (IAccountProfileValue[]) result.toArray(new IAccountProfileValue[0]);

		// 给账户别名赋值
		for (int i = 0, len = resultValue.length; i < len; i++) {
			for (int j = 0, len_j = acctRelValues.length; j < len_j; j++) {
				if (resultValue[i].getAcctId() == acctRelValues[j].getAcctId()) {
					resultValue[i].setAcctAliasName(acctRelValues[j].getAcctAliasName());
					break;
				}
			}
		}
		return resultValue;
	}

	public int queryAcctDtsCountById(long acctId, long custId) throws Exception {
		return queryAcctDtsById(acctId, custId, -1, -1).length;
	}
	
	@Override
	public IAccountProfileValue[] queryAcctDtsByIdAndInstallmentFlag(long acctId, long custId, long installmentFlag,int start, int end) throws Exception {
		IBOCmCustAcctRelValue[] acctRelValues = (IBOCmCustAcctRelValue[]) queryCustAcctRelsByInstallmentFlag(acctId, custId, installmentFlag, BOCmCustAcctRelBean.class, start, end);
		if (CmCommonUtil.isEmptyObject(acctRelValues)) {
			return new IAccountProfileValue[0];
		}
		Map temp = new HashMap();
		String regionId = "";
		String paymentTeams = "";
		String reason = "";
		for (int i = 0, len = acctRelValues.length; i < len; i++) {
			// 修改为按账户ID，第3-6位(regionId)分组
			regionId = CenterUtil.getRegionIdByAcctId(acctRelValues[i].getAcctId());
			reason = acctRelValues[i].getRemarks();
			paymentTeams = String.valueOf(acctRelValues[i].getBillDueDate());
			if (temp.containsKey(regionId)) {
				((List) temp.get(regionId)).add(acctRelValues[i].getAcctId());
			} else {
				List acctList = new ArrayList();
				acctList.add(acctRelValues[i].getAcctId());
				temp.put(regionId, acctList);
			}
		}
		List result = new ArrayList();
		List tempList = null;
		for (Iterator it = temp.entrySet().iterator(); it.hasNext();) {
			Entry entry = (Entry) it.next();
			tempList = (List) entry.getValue();
			Long[] ids = (Long[]) tempList.toArray(new Long[0]);
			long[] longIds = ArrayUtils.toPrimitive(ids);
			IAccountProfileValue[] tempValues = CmServiceFactory.getAccountSV().queryAcctDtsByIds(longIds, (String) entry.getKey());
			CollectionUtils.addAll(result, tempValues);
		}
		if (CmCommonUtil.isEmptyObject(result)) {
			return new IAccountProfileValue[0];
		}
		IAccountProfileValue[] resultValue = (IAccountProfileValue[]) result.toArray(new IAccountProfileValue[0]);

		// 给账户别名赋值
		for (int i = 0, len = resultValue.length; i < len; i++) {
			for (int j = 0, len_j = acctRelValues.length; j < len_j; j++) {
				if (resultValue[i].getAcctId() == acctRelValues[j].getAcctId()) {
					resultValue[i].setAcctAliasName(acctRelValues[j].getAcctAliasName());
					break;
				}
			}
		}
		return resultValue;
	}

	public IAcctBillCustomizeValue queryBillCustomizeByAcctId(long acctId) throws Exception {
		IAcctBillCustomizeValue[] billCustomizeValues = this.queryBillCustomizeByCondition(acctId, -1, -1);
		if (CmCommonUtil.isEmptyObject(billCustomizeValues)) {
			return null;
		}
		return billCustomizeValues[0];
	}

	public IAcctBillCustomizeValue[] queryBillCustomizesByAcctIds(long[] acctIds, String regionId) throws Exception {
		if (acctIds == null || acctIds.length < 1 || StringUtils.isBlank(regionId)) {
			// 输入参数不合法！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(IAccountValue.S_AcctId).append(" IN ( ");
		for (int i = 0, len = acctIds.length; i < len; i++) {
			condition.append(":acctId").append(i).append(" ");
			parameter.put("acctId" + i, Long.valueOf(acctIds[i]));
			if (i != len - 1) {
				condition.append(",");
			}
		}
		condition.append(")");
		parameter.put(IBOCmAccountValue.S_RegionId, regionId);
		IBOCmBillCustomizeValue[] billCustomizeValues = (IBOCmBillCustomizeValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmBillCustomizeBean.class,
				condition.toString(), parameter, -1, -1);
		if (CmCommonUtil.isEmptyObject(billCustomizeValues)) {
			return new IAcctBillCustomizeValue[0];
		}
		IAcctBillCustomizeValue[] result = new IAcctBillCustomizeValue[billCustomizeValues.length];
		for (int i = 0, len = billCustomizeValues.length; i < len; i++) {
			result[i] = new AcctBillCustomizeBean();
			result[i].copy(billCustomizeValues[i]);
		}
		return result;
	}

	public IAcctBillCustomizeValue[] queryBillCustomizesByCustId(long custId) throws Exception {
		IBOCmCustAcctRelValue[] acctRelValues = (IBOCmCustAcctRelValue[]) queryCustAcctRels(-1, custId, BOCmCustAcctRelBean.class, -1, -1);
		if (CmCommonUtil.isEmptyObject(acctRelValues)) {
			return new IAcctBillCustomizeValue[0];
		}
		Map temp = new HashMap();
		String regionId = "";
		for (int i = 0, len = acctRelValues.length; i < len; i++) {
			// 修改为按账户ID，第3-6位(regionId)分组
			regionId = CenterUtil.getRegionIdByAcctId(acctRelValues[i].getAcctId());
			if (temp.containsKey(regionId)) {
				((List) temp.get(regionId)).add(acctRelValues[i].getAcctId());
			} else {
				List acctList = new ArrayList();
				acctList.add(acctRelValues[i].getAcctId());
				temp.put(regionId, acctList);
			}
		}
		List result = new ArrayList();
		List tempList = null;
		for (Iterator it = temp.entrySet().iterator(); it.hasNext();) {
			Entry entry = (Entry) it.next();
			tempList = (List) entry.getValue();
			Long[] ids = (Long[]) tempList.toArray(new Long[0]);
			long[] longIds = ArrayUtils.toPrimitive(ids);
			IAcctBillCustomizeValue[] tempValues = CmServiceFactory.getAccountSV().queryBillCustomizesByAcctIds(longIds, (String) entry.getKey());
			CollectionUtils.addAll(result, tempValues);
		}
		if (CmCommonUtil.isEmptyObject(result)) {
			return new IAcctBillCustomizeValue[0];
		}
		return (IAcctBillCustomizeValue[]) result.toArray(new IAcctBillCustomizeValue[0]);
	}

	public void acctTransTrack(long acctId, String outRegionId, String inRegionId) throws Exception {
		if (acctId <= 0 || StringUtils.isBlank(inRegionId)) {
			// 输入参数不合法！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		IAccountValue accountValue = this.queryAccountById(acctId);
		if (accountValue == null) {
			// 根据账户编号[{0}]没有查询到账户信息！
			ExceptionUtil.throwBusinessException("CMS5000151");
		}
		IAccountValue accountNew = new AccountBean();
		accountNew.copy(accountValue);

		// 删除源地市分表中的账户
		accountValue.delete();
		IVOAccountValue voAccountValue = new VOAccountBean();
		voAccountValue.setAccount(accountValue);
		saveAccount(voAccountValue);

		// 在新地市中新增账户信息
		accountNew.setRegionId(inRegionId);
		accountNew.setStsToNew();
		IVOAccountValue voAccountValueNew = new VOAccountBean();
		voAccountValueNew.setAccount(accountNew);
		saveAccount(voAccountValueNew);

		// 保存账户轨迹表
		BOCmAcctTransTrackBean acctTransTrackValue = new BOCmAcctTransTrackBean();
		acctTransTrackValue.setAcctTransId(CmCommonUtil.getNewSequence(BOCmAcctTransTrackBean.class));
		acctTransTrackValue.setAcctId(acctId);
		acctTransTrackValue.setInRegionId(inRegionId);
		acctTransTrackValue.setRegionId(inRegionId);
		acctTransTrackValue.setOutRegionId(outRegionId);
		acctTransTrackValue.setState(CmConstants.RecordState.USE);
		CmInnerServiceFactory.getCommonInnerSV().saveBean(acctTransTrackValue);
	}

	public IAccountProfileValue[] queryAcctDtsByCdn(long custId, String billId, int start, int end) throws Exception {
		if (custId <= 0 && StringUtils.isBlank(billId)) {
			// 输入参数不合法！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		long acctId = -1;
		if (StringUtils.isNotBlank(billId)) {
			ICmTeamInvokeSV teamInvokeSV = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
			ISoAccrelValue[] accrels = teamInvokeSV.getSoAccrelsByBillId(billId, OrderConst.ACCT_BASE_PAY_TYPE, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(accrels)) {
				acctId = accrels[0].getAcctId();
			}
		}
		return this.queryAcctDtsById(acctId, custId, start, end);
	}

	public int queryAcctDtsCountByCdn(long custId, String billId) throws Exception {
		return this.queryAcctDtsByCdn(custId, billId, -1, -1).length;
	}

	public int queryAcctDtsCountByCustIdAndBillId(long custId, String regionId, String billId, String payMethod, int insFlag) throws Exception {
		int pm = -1;
		if (payMethod != null && !payMethod.equals("")) {
			pm = Integer.valueOf(payMethod);
		}
		// 根据billId查询accountId
		ISoAccrelValue[] accrelValues = null;
		long[] acctIds = null;
		if (billId != null && !"".equals(billId.trim())) {
			CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.BILL_ID, String.valueOf(billId));
			IQUserBaseInfoValue userInfo = CmServiceFactory.getTeamInvokeSV().getUserBaseInfoByBillId(billId);
			if (userInfo == null)
				return 0;

			accrelValues = CmServiceFactory.getTeamInvokeSV().getSoAccrelsByUserId(userInfo.getUserId(), 1, -1, -1);

			if (accrelValues == null || accrelValues.length <= 0)
				return 0;
			if (accrelValues != null && accrelValues.length > 0) {
				acctIds = new long[accrelValues.length];
				for (int i = 0; i < accrelValues.length; i++) {
					acctIds[i] = accrelValues[i].getAcctId();
				}
			}

		}
		return ((ICm2SoSV) ServiceFactory.getService(ICm2SoSV.class)).queryCustAcctRelCountByCnd(custId, acctIds, null, insFlag, pm, -1, null);
	}

	public IAccountProfileValue[] queryAcctDtsByCustIdAndBillId(long custId, String regionId, String billId, String payMethod, int start, int end) throws Exception {
		IBOCmCustAcctRelValue[] acctRelValues = (IBOCmCustAcctRelValue[]) queryCustAcctRels(-1, custId, BOCmCustAcctRelBean.class, start, end);
		if (CmCommonUtil.isEmptyObject(acctRelValues)) {
			return new AccountProfileBean[0];
		}

		ISoAccrelValue[] accrelValues = null;
		if (billId != null && !"".equals(billId.trim())) {
			IQUserBaseInfoValue userInfo = CmServiceFactory.getTeamInvokeSV().getUserBaseInfoByBillId(billId);
			if (userInfo == null)
				return new AccountProfileBean[0];

			accrelValues = CmServiceFactory.getTeamInvokeSV().getSoAccrelsByUserId(userInfo.getUserId(), 1, -1, -1);

			if (accrelValues == null || accrelValues.length <= 0)
				return new AccountProfileBean[0];
		}

		List acctList = new ArrayList();
		for (int i = 0, len = acctRelValues.length; i < len; i++) {
			acctList.add(acctRelValues[i].getAcctId());
		}

		// add by zhuyy@2014-6-4
		if (payMethod != null && !StringUtils.isBlank(payMethod)) {
			List acctPaymentList = new ArrayList();
			for (int i = 0; i < acctList.size(); i++) {
				IAcctPaymentValue[] acctPayments = queryAcctPaymentsByAcctIdAndPayMethod((Long) acctList.get(i), payMethod);
				if (acctPayments != null && acctPayments.length > 0) {
					acctPaymentList.add(acctList.get(i));
				}
			}
			acctList = acctPaymentList;
		}

		if (acctList.isEmpty())
			return new AccountProfileBean[0];
		// 过滤后的acctId
		Long[] ids = (Long[]) acctList.toArray(new Long[0]);
		long[] longIds = ArrayUtils.toPrimitive(ids);
		// acctId按位数分组
		Map temp = new HashMap();
		String inneregionId = "";
		for (int i = 0, len = longIds.length; i < len; i++) {
			// 修改为按账户ID，第3-6位(regionId)分组
			inneregionId = CenterUtil.getRegionIdByAcctId(acctRelValues[i].getAcctId());
			if (temp.containsKey(inneregionId)) {
				((List) temp.get(inneregionId)).add(longIds[i]);
			} else {
				List innerAcctList = new ArrayList();
				innerAcctList.add(longIds[i]);
				temp.put(inneregionId, innerAcctList);
			}
		}
		List result = new ArrayList();
		List tempList = null;
		// 按组查询账户信息
		for (Iterator it = temp.entrySet().iterator(); it.hasNext();) {
			Entry entry = (Entry) it.next();
			tempList = (List) entry.getValue();
			Long[] innerIds = (Long[]) tempList.toArray(new Long[0]);
			long[] innerlongIds = ArrayUtils.toPrimitive(innerIds);
			IAccountProfileValue[] tempValues = CmServiceFactory.getAccountSV().queryAcctDtsByIds(innerlongIds, (String) entry.getKey());
			CollectionUtils.addAll(result, tempValues);
		}
		if (CmCommonUtil.isEmptyObject(result)) {
			return new IAccountProfileValue[0];
		}
		return (IAccountProfileValue[]) result.toArray(new IAccountProfileValue[0]);
	}

	// add by zhuyy@2014-6-4
	public IAcctPaymentValue[] queryAcctPaymentsByAcctIdAndPayMethod(long acctId, String payMethod) throws Exception {
		AbstractAcctPaymentQueryModelImpl queryModel = (AbstractAcctPaymentQueryModelImpl) CmServiceFactory.getBusiMode(AbstractAcctPaymentQueryModelImpl.class);
		DataContainer dc = new DataContainer();
		dc.set(IAcctPaymentValue.S_AcctId, acctId);
		dc.set(IAcctPaymentValue.S_PayMethod, payMethod);
		DataContainerInterface[] results = queryModel.queryData(new DataContainer[] { dc }, -1, -1);
		return (IAcctPaymentValue[]) results;
	}

	public IAccountProfileValue[] queryAcctDtsByCustId(long custId, String regionId, int start, int end) throws Exception {
		IBOCmCustAcctRelValue[] acctRelValues = (IBOCmCustAcctRelValue[]) queryCustAcctRels(-1, custId, BOCmCustAcctRelBean.class, start, end);
		if (CmCommonUtil.isEmptyObject(acctRelValues)) {
			return new IAccountProfileValue[0];
		}
		List acctList = new ArrayList();
		for (int i = 0, len = acctRelValues.length; i < len; i++) {
			acctList.add(acctRelValues[i].getAcctId());
		}

		Long[] ids = (Long[]) acctList.toArray(new Long[0]);
		long[] longIds = ArrayUtils.toPrimitive(ids);
		IAccountProfileValue[] result = CmServiceFactory.getAccountSV().queryAcctDtsByIds(longIds, regionId);

		if (CmCommonUtil.isEmptyObject(result)) {
			return new IAccountProfileValue[0];
		}
		return result;
	}

	public int queryAcctDtsCountByCustId(long custId, String regionId) throws Exception {
		return this.queryAcctDtsByCustId(custId, regionId, -1, -1).length;
	}

	public void updateAcctBehalfPhone(long acctId, String acctBehalfPhone) throws Exception {
		if (acctId <= 0) {
			// 输入参数不合法！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		IAccountValue accountValue = this.queryAccountById(acctId);
		if (accountValue == null) {
			// 根据账户编号[{0}]没有查询到账户信息！
			ExceptionUtil.throwBusinessException("CMS5000151");
		}

		IVOAccountValue voAccountValue = new VOAccountBean();
		accountValue.setAcctBehalfPhone(acctBehalfPhone);
		voAccountValue.setAccount(accountValue);
		saveAccount(voAccountValue);

	}

	public Map queryBankAcctsByCustId(Map paraMap) throws Exception {
		long custId = CmCommonUtil.isEmptyObj(paraMap.get("GroupId")) ? -1 : Long.parseLong(paraMap.get("GroupId").toString());
		if (custId < 0) {
			// 输入参数不合法！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		// 查询客户名称
		ICustomerValue customerValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(custId);
		if (customerValue == null) {
			// 根据编号{0}没有查询到唯一的客户信息记录，请检查查询条件是否正确或数据是否正确！
			ExceptionUtil.throwBusinessException("CMS0000112");
		}
		String custName = customerValue.getCustName();
		IAccountProfileValue[] acctValues = queryAcctDtsById(-1, custId, -1, -1);

		// 拼装返回参数
		List acctList = new ArrayList();
		Map acctMap = null;
		for (int i = 0, len = acctValues.length; i < len; i++) {
			if (acctValues[i].getPayMethod() == CmConstants.AccountPayMethod.BANK_COLLECTION) {
				acctMap = new HashMap();
				acctMap.put("CustName", custName);
				acctMap.put("AcctId", Long.valueOf(acctValues[i].getAcctId()));
				acctMap.put("AcctName", acctValues[i].getAcctName());
				acctMap.put("CreateDate", acctValues[i].getAcctCreateDate());
				acctMap.put("MonthBill", "");
				acctList.add(acctMap);
			}
		}

		Map result = new HashMap();
		result.put("CommonUserInfo", acctList);
		return result;
	}

	public void delCustAndAcct(long custId, long acctId) throws Exception {
		if (custId > 0) {
			ICustomerValue customerValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(custId);
			if (customerValue != null) {
				customerValue.delete();
				IVOCustValue voCustValue = new VOCustBean();
				voCustValue.setCustomer(customerValue);

				CmServiceFactory.getCustomerSV().saveCustomer(customerValue);
			}
		}

		if (acctId > 0) {
			String regionId = CenterUtil.getRegionIdByAcctId(acctId);
			IVOAccountValue voAccountValue = new VOAccountBean();

			// 账户
			IAccountValue accountValue = this.queryAccountById(acctId);
			if (accountValue != null) {
				accountValue.setRegionId(regionId);
				accountValue.delete();
				voAccountValue.setAccount(accountValue);
			}

			// 个性化账单
			IAcctBillCustomizeValue customizeValue = this.queryBillCustomizeByAcctId(acctId);
			if (customizeValue != null) {
				customizeValue.setRegionId(regionId);
				customizeValue.delete();
				voAccountValue.addBillCustomize(customizeValue);
			}

			IAcctPaymentValue[] paymentValues = this.queryAcctPaymentByCondition(acctId, -1, -1);
			if (!CmCommonUtil.isEmptyObject(paymentValues)) {
				// 支付方案
				IAcctPaymentValue paymentValue = paymentValues[0];
				paymentValue.delete();
				voAccountValue.addPayment(paymentValue);

				// 支付方案扩展表
				long acctPaymentId = paymentValues[0].getPaymentId();
				BOCmCmxAcctPaymentAttrBean[] acctPaymentAttrs = new BOCmCmxAcctPaymentAttrBean[3];
				acctPaymentAttrs[0] = new BOCmCmxAcctPaymentAttrBean();
				acctPaymentAttrs[0].setPaymentId(acctPaymentId);
				acctPaymentAttrs[0].setAttrCode(CmLnConstants.PaymentAttr.BankBehalfPhone);
				acctPaymentAttrs[0].initProperty(BOCmCmxAcctPaymentAttrBean.S_PaymentId, Long.valueOf(acctPaymentId));
				acctPaymentAttrs[0].initProperty(BOCmCmxAcctPaymentAttrBean.S_AttrCode, CmLnConstants.PaymentAttr.BankBehalfPhone);
				acctPaymentAttrs[0].delete();

				acctPaymentAttrs[1] = new BOCmCmxAcctPaymentAttrBean();
				acctPaymentAttrs[1].setPaymentId(acctPaymentId);
				acctPaymentAttrs[1].setAttrCode(CmLnConstants.PaymentAttr.MinFee);
				acctPaymentAttrs[1].initProperty(BOCmCmxAcctPaymentAttrBean.S_PaymentId, Long.valueOf(acctPaymentId));
				acctPaymentAttrs[1].initProperty(BOCmCmxAcctPaymentAttrBean.S_AttrCode, CmLnConstants.PaymentAttr.MinFee);
				acctPaymentAttrs[1].delete();

				acctPaymentAttrs[2] = new BOCmCmxAcctPaymentAttrBean();
				acctPaymentAttrs[2].setPaymentId(acctPaymentId);
				acctPaymentAttrs[2].setAttrCode(CmLnConstants.PaymentAttr.OnceFee);
				acctPaymentAttrs[2].initProperty(BOCmCmxAcctPaymentAttrBean.S_PaymentId, Long.valueOf(acctPaymentId));
				acctPaymentAttrs[2].initProperty(BOCmCmxAcctPaymentAttrBean.S_AttrCode, CmLnConstants.PaymentAttr.OnceFee);
				acctPaymentAttrs[2].delete();
				CmInnerServiceFactory.getCommonInnerSV().saveBeans(acctPaymentAttrs);

			}

			// 账期
			IAcctBillCycleValue billCycleValue = this.queryCurrAcctBillCyclesByAcctId(acctId);
			if (billCycleValue != null) {
				billCycleValue.setRegionId(regionId);
				billCycleValue.delete();
				voAccountValue.setBillCycle(billCycleValue);
			}

			this.saveAccount(voAccountValue);

			// 删除账户客户关系表
			if (acctId > 0 && custId > 0) {
				IBOCmCustAcctRelValue[] qryAcctRelValues = (IBOCmCustAcctRelValue[]) this.queryCustAcctRels(acctId, custId, BOCmCustAcctRelBean.class, -1, -1);
				if (CmCommonUtil.isNotEmptyObject(qryAcctRelValues)) {
					IBOCmCustAcctRelValue custAcctRelValue = new BOCmCustAcctRelBean();
					custAcctRelValue.copy(qryAcctRelValues[0]);
					custAcctRelValue.delete();
					this.saveCustAcctRels(custAcctRelValue);
				}
			}
		}

	}

	public void delAcctInfo(long acctId) throws Exception {
		if (acctId > 0) {
			String regionId = CenterUtil.getRegionIdByAcctId(acctId);
			IVOAccountValue voAccountValue = new VOAccountBean();

			// 账户
			IAccountValue accountValue = this.queryAccountById(acctId);
			if (accountValue != null) {
				accountValue.setRegionId(regionId);
				accountValue.delete();
				voAccountValue.setAccount(accountValue);
			}

			// 个性化账单
			IAcctBillCustomizeValue customizeValue = this.queryBillCustomizeByAcctId(acctId);
			if (customizeValue != null) {
				customizeValue.setRegionId(regionId);
				customizeValue.delete();
				voAccountValue.addBillCustomize(customizeValue);
			}

			IAcctPaymentValue[] paymentValues = this.queryAcctPaymentByCondition(acctId, -1, -1);
			if (!CmCommonUtil.isEmptyObject(paymentValues)) {
				// 支付方案
				IAcctPaymentValue paymentValue = paymentValues[0];
				paymentValue.delete();
				voAccountValue.addPayment(paymentValue);

				// 支付方案扩展表
				long acctPaymentId = paymentValues[0].getPaymentId();
				BOCmCmxAcctPaymentAttrBean[] acctPaymentAttrs = new BOCmCmxAcctPaymentAttrBean[3];
				acctPaymentAttrs[0] = new BOCmCmxAcctPaymentAttrBean();
				acctPaymentAttrs[0].setPaymentId(acctPaymentId);
				acctPaymentAttrs[0].setAttrCode(CmLnConstants.PaymentAttr.BankBehalfPhone);
				acctPaymentAttrs[0].initProperty(BOCmCmxAcctPaymentAttrBean.S_PaymentId, Long.valueOf(acctPaymentId));
				acctPaymentAttrs[0].initProperty(BOCmCmxAcctPaymentAttrBean.S_AttrCode, CmLnConstants.PaymentAttr.BankBehalfPhone);
				acctPaymentAttrs[0].delete();

				acctPaymentAttrs[1] = new BOCmCmxAcctPaymentAttrBean();
				acctPaymentAttrs[1].setPaymentId(acctPaymentId);
				acctPaymentAttrs[1].setAttrCode(CmLnConstants.PaymentAttr.MinFee);
				acctPaymentAttrs[1].initProperty(BOCmCmxAcctPaymentAttrBean.S_PaymentId, Long.valueOf(acctPaymentId));
				acctPaymentAttrs[1].initProperty(BOCmCmxAcctPaymentAttrBean.S_AttrCode, CmLnConstants.PaymentAttr.MinFee);
				acctPaymentAttrs[1].delete();

				acctPaymentAttrs[2] = new BOCmCmxAcctPaymentAttrBean();
				acctPaymentAttrs[2].setPaymentId(acctPaymentId);
				acctPaymentAttrs[2].setAttrCode(CmLnConstants.PaymentAttr.OnceFee);
				acctPaymentAttrs[2].initProperty(BOCmCmxAcctPaymentAttrBean.S_PaymentId, Long.valueOf(acctPaymentId));
				acctPaymentAttrs[2].initProperty(BOCmCmxAcctPaymentAttrBean.S_AttrCode, CmLnConstants.PaymentAttr.OnceFee);
				acctPaymentAttrs[2].delete();
				CmInnerServiceFactory.getCommonInnerSV().saveBeans(acctPaymentAttrs);

			}

			// 账期
			IAcctBillCycleValue billCycleValue = this.queryCurrAcctBillCyclesByAcctId(acctId);
			if (billCycleValue != null) {
				billCycleValue.setRegionId(regionId);
				billCycleValue.delete();
				voAccountValue.setBillCycle(billCycleValue);
			}

			this.saveAccount(voAccountValue);

			// 删除账户客户关系表
			IBOCmCustAcctRelValue[] qryAcctRelValues = (IBOCmCustAcctRelValue[]) this.queryCustAcctRels(acctId, accountValue.getCustId(), BOCmCustAcctRelBean.class, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(qryAcctRelValues)) {
				IBOCmCustAcctRelValue custAcctRelValue = new BOCmCustAcctRelBean();
				custAcctRelValue.copy(qryAcctRelValues[0]);
				custAcctRelValue.delete();
				this.saveCustAcctRels(custAcctRelValue);
			}
		}
	}

	@Override
	public void addPartyAcctRel(long acctId, long partyId, Timestamp date) throws Exception {
		// 验证关系是否存在
		Map parameter = new HashMap();
		StringBuffer condition = new StringBuffer(" 1=1 ");

		condition.append(" AND ").append(IBOCMPartyAcctRelValue.S_AcctId).append("=:acctId");
		parameter.put("acctId", acctId);
		IBOCMPartyAcctRelValue[] value = BOCMPartyAcctRelEngine.getBeans(condition.toString(), parameter);
		if (value == null || value.length == 0) {
			BOCMPartyAcctRelBean bean = new BOCMPartyAcctRelBean();
			bean.setAcctId(acctId);
			bean.setPartyId(partyId);
			bean.setRelId(CmCommonUtil.getNewSequence(BOCMPartyAcctRelBean.class));
			bean.setState("U");
			bean.setCreateOpId(ServiceManager.getUser().getID());
			bean.setCreateOrgId(ServiceManager.getUser().getOrgId());
			bean.setCreateDate(ServiceManager.getOpDateTime());
			bean.setEffectiveDate(date);
			CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);
		} else {
			BOCMPartyAcctRelBean bean = new BOCMPartyAcctRelBean();
			bean.copy(value[0]);
			bean.initProperty("REGION_ID", CmCommonUtil.getDefaultRegionId());
			bean.setPartyId(partyId);
			bean.setState("U");
			bean.setOpId(ServiceManager.getUser().getID());
			bean.setOrgId(ServiceManager.getUser().getOrgId());
			bean.setDoneDate(ServiceManager.getOpDateTime());
			bean.setEffectiveDate(date);
			CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);
		}

	}

	public IQBOCmPartyValue querPayerByAcctId(long acctId) throws Exception {
		if (acctId <= 0) {
			ExceptionUtil.throwBusinessException("CMS0010043");
		}
		ICmAccountSV acctSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		IBOCMPartyAcctRelValue[] partyAccRelValue = acctSV.queryPartyAccRel(acctId, -1);
		if (partyAccRelValue != null && partyAccRelValue.length > 0) {
			ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
			return partySV.queryPayerByPartyId(partyAccRelValue[0].getPartyId());
		} else {
			return null;
		}

	}

	public IBOCMPartyAcctRelValue[] queryPartyAccRel(long acctId, long partyId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append("1=1").append(" and ").append(BOCMPartyAcctRelBean.S_State).append("='U'");

		if (acctId > 0) {
			condition.append(" and ");
			condition.append(BOCMPartyAcctRelBean.S_AcctId).append("=:acctId");
			parameter.put("acctId", acctId);
		}
		if (partyId > 0) {
			condition.append(" and ");
			condition.append(BOCMPartyAcctRelBean.S_PartyId).append("=:partyId");
			parameter.put("partyId", partyId);
		}
		return (IBOCMPartyAcctRelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCMPartyAcctRelBean.class, condition.toString(), parameter, -1, -1);

	}

	public IAccountProfileValue[] queryAcctDtsByCustIdAndBillId(long custId, String regionId, String billId, String payMethod, int insFlag, int start, int end) throws Exception {
		int pm = -1;
		if (payMethod != null && !payMethod.equals("")) {
			pm = Integer.valueOf(payMethod);
		}
		// 根据billId查询accountId
		ISoAccrelValue[] accrelValues = null;
		long[] acctIds = null;
		if (billId != null && !"".equals(billId.trim())) {
			CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.BILL_ID, String.valueOf(billId));
			IQUserBaseInfoValue userInfo = CmServiceFactory.getTeamInvokeSV().getUserBaseInfoByBillId(billId);
			if (userInfo == null)
				return new AccountProfileBean[0];

			accrelValues = CmServiceFactory.getTeamInvokeSV().getSoAccrelsByUserId(userInfo.getUserId(), 1, -1, -1);

			if (accrelValues == null || accrelValues.length <= 0)
				return new AccountProfileBean[0];
			if (accrelValues != null && accrelValues.length > 0) {
				acctIds = new long[accrelValues.length];
				for (int i = 0; i < accrelValues.length; i++) {
					acctIds[i] = accrelValues[i].getAcctId();
				}
			}

		}
		// 查询custAcctrel
		IBOCmCustAcctRelValue[] result = ((ICm2SoSV) ServiceFactory.getService(ICm2SoSV.class)).queryCustAcctRelByCnd(custId, acctIds, null, insFlag, pm, -1, null, start, end);
		if (result != null && result.length > 0) {
			// 根据custId查询客户信息
			ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			ICustomerValue custValue = custSV.queryCustomerByCustId(custId);
			String fitstName = "";
			String lastName = "";
			String CustName = "";
			if (custValue != null) {
				fitstName = custValue.getFirstName();
				lastName = custValue.getLastName();
				CustName = custValue.getCustName();
			}
			IAccountProfileValue returnResult[] = new AccountProfileBean[result.length];
			for (int i = 0; i < returnResult.length; i++) {
				returnResult[i] = new AccountProfileBean();
				returnResult[i].copy(result[i]);
				returnResult[i].setAcctStatus(Integer.parseInt(result[i].getExt1()));
				returnResult[i].setCustId(result[i].getRelCustId());
				if (custValue != null) {
					returnResult[i].setFirstName(fitstName);
					returnResult[i].setLastName(lastName);
					returnResult[i].setCustName(CustName);
				}
			}
			return returnResult;
		}
		return new IAccountProfileValue[0];

	}

	public DataContainer[] queryAllAccountInHierarchy(long relCustId, long acctId, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus,
			int start, int end) throws Exception {
		String sql = "SELECT m.ext1 ACCT_STATUS,m.* FROM   CM_CUST_ACCT_REL_" + TenantIDFactory.getTenant() + " m WHERE m.`REL_CUST_ID` " + "IN "
				+ "(SELECT a.rel_cust_id  FROM CM_GROUP_ORG_STRUCT_" + TenantIDFactory.getTenant() + " a, CM_GROUP_ORG_STRUCT_" + TenantIDFactory.getTenant()
				+ " b WHERE a.cust_id = b.cust_id AND b.rel_cust_id =" + relCustId + ")";
		if (start > 0 && end > 0) {
			sql = "SELECT f.ext1 ACCT_STATUS,f.* FROM (" + sql + ") f limit " + (start - 1) + "," + (end - start + 1);
		}

		Map parameter = new HashMap();
		return (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, parameter);

	}

	public int queryAllAccountInHierarchyCount(long relCustId, long acctId, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus) throws Exception {
		String sql = "SELECT * FROM   CM_CUST_ACCT_REL_" + TenantIDFactory.getTenant() + " m WHERE m.`REL_CUST_ID` " + "IN " + "(SELECT a.rel_cust_id  FROM CM_GROUP_ORG_STRUCT_"
				+ TenantIDFactory.getTenant() + " a, CM_GROUP_ORG_STRUCT_" + TenantIDFactory.getTenant() + " b WHERE a.cust_id = b.cust_id AND b.rel_cust_id =" + relCustId + ")";
		sql = "SELECT COUNT(*) count FROM (" + sql + ") f";
		Map parameter = new HashMap();
		DataContainer[] DC = (DataContainer[]) CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(DataContainer.class, sql, parameter);
		return DC[0].getAsInt("count");
	}

	public IBOCmCustAcctRelValue[] queryCustAcctRel(long relCustd, long acctId, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus, int start,
			int end) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(" 1=1 ").append(" and ").append(IBOCmCustAcctRelValue.S_State).append("='U'");
		if (relCustd > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_RelCustId).append("=:relCustd");
			parameter.put("relCustd", relCustd);
		}
		if (acctId > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctId).append("=:acctId");
			parameter.put("acctId", acctId);
		}
		if (StringUtils.isNotBlank(acctName) && !acctName.equals("null")) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctName).append("=:acctName");
			parameter.put("acctName", acctName);
		}
		if (StringUtils.isNotBlank(custStatus) && !custStatus.equals("null")) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_Ext1).append("=:custStatus");
			parameter.put("custStatus", custStatus);
		}
		if (installmentFalg >= 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_InstallmentFlag).append("=:installmentFalg");
			parameter.put("installmentFalg", installmentFalg);
		}
		if (paymethod > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_PayMethod).append("=:paymethod");
			parameter.put("paymethod", paymethod);
		}
		if (cycleType > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_CycleType).append("=:cycleType");
			parameter.put("cycleType", cycleType);
		}
		// 记录业务日志
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		Map paraMap = new HashMap();
		paraMap.put("acctId", acctId);
		commonSV.saveCommonQryBusiLog(CmConstants.BusiLogId.ACCOUNT_QRY, condition.toString(), parameter, CmConstants.BusiLogType.ACCOUNT_LOG);
		IBOCmCustAcctRelValue[] result = (IBOCmCustAcctRelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustAcctRelBean.class, condition.toString(), parameter,
				start, end);

		return result;
	}

	public int queryCustAcctRelCount(long relCustd, long acctId, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(" 1=1 ").append(" and ").append(IBOCmCustAcctRelValue.S_State).append("='U'");
		if (relCustd > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_RelCustId).append("=:relCustd");
			parameter.put("relCustd", relCustd);
		}
		if (acctId > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctId).append("=:acctId");
			parameter.put("acctId", acctId);
		}
		if (StringUtils.isNotBlank(acctName) && !acctName.equals("null")) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctName).append("=:acctName");
			parameter.put("acctName", acctName);
		}
		if (StringUtils.isNotBlank(custStatus) && !custStatus.equals("null")) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_Ext1).append("=:custStatus");
			parameter.put("custStatus", custStatus);
		}
		if (installmentFalg >= 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_InstallmentFlag).append("=:installmentFalg");
			parameter.put("installmentFalg", installmentFalg);
		}
		if (paymethod > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_PayMethod).append("=:paymethod");
			parameter.put("paymethod", paymethod);
		}
		if (cycleType > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_CycleType).append("=:cycleType");
			parameter.put("cycleType", cycleType);
		}
		int count = CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmCustAcctRelBean.class, condition.toString(), parameter);
		return count;
	}

	@Override
	public IBOCmCustAcctRelValue[] queryCustAcctRel(long relCustd, long acctId, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus, int start,
			int end, String state) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(" 1=1 ");
		if (relCustd > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_RelCustId).append("=:relCustd");
			parameter.put("relCustd", relCustd);
		}
		if (acctId > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctId).append("=:acctId");
			parameter.put("acctId", acctId);
		}
		if (StringUtils.isNotBlank(acctName) && !acctName.equals("null")) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctName).append("=:acctName");
			parameter.put("acctName", acctName);
		}
		if (StringUtils.isNotBlank(custStatus) && !custStatus.equals("null")) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_Ext1).append("=:custStatus");
			parameter.put("custStatus", custStatus);
		}
		if (installmentFalg >= 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_InstallmentFlag).append("=:installmentFalg");
			parameter.put("installmentFalg", installmentFalg);
		}
		if (paymethod > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_PayMethod).append("=:paymethod");
			parameter.put("paymethod", paymethod);
		}
		if (cycleType > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_CycleType).append("=:cycleType");
			parameter.put("cycleType", cycleType);
		}
		if (StringUtils.isNotBlank(state) && !state.equals("null")) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_State).append("=:state");
			parameter.put("state", state);
		}

		// 记录业务日志
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		Map paraMap = new HashMap();
		paraMap.put("acctId", acctId);
		commonSV.saveCommonQryBusiLog(CmConstants.BusiLogId.ACCOUNT_QRY, condition.toString(), parameter, CmConstants.BusiLogType.ACCOUNT_LOG);
		IBOCmCustAcctRelValue[] result = (IBOCmCustAcctRelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustAcctRelBean.class, condition.toString(), parameter,
				start, end);
		// 提供给360视图账户界面使用
		if (result != null && result.length > 0) {
			for (int i = 0; i < result.length; i++) {
				String edit = CrmLocaleFactory.getResource("SOS8802050");
				// String delete = CrmLocaleFactory.getResource("OFS2000254");
				String operation = CrmLocaleFactory.getResource("OFS2000243");

				String[] icons = new String[3];
				icons[0] = "<a href='javascript:void(0)' class='cellpath' onclick='modifyAccount(\"" + String.valueOf(result[i].getAcctId())
						+ "\")' style='color:blue;margin-left:5px;text-decoration:underline'>" + edit + "</a>";
				// icons[1] = "<a href='javascript:void(0)' class='cellpath' onclick='deleteAccount(\"" +
				// String.valueOf(accountValues[i].getAcctId())
				// + "\")' style='color:blue;margin-left:5px;text-decoration:underline'>"+delete+"</a>";
				icons[1] = "<a href='javascript:void(0)' class='cellpath' onclick='showAccount(\"" + String.valueOf(result[i].getAcctId())
						+ "\")' style='color:blue;margin-left:5px;text-decoration:underline'>" + operation + "</a>";

				result[i].setAction(icons[0] + icons[1]);
			}
		}
		return result;
	}

	public IBOCmCustAcctRelValue[] queryCustAcctRelFor360(long relCustd, long acctId, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus,
			String acctServiceId, int start, int end) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(" 1=1 ").append(" and ").append(IBOCmCustAcctRelValue.S_State).append("='U'");
		if (relCustd > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_RelCustId).append("=:relCustd");
			parameter.put("relCustd", relCustd);
		}
		if (acctId > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctId).append("=:acctId");
			parameter.put("acctId", acctId);
		}
		if (StringUtils.isNotBlank(acctName) && !acctName.equals("null")) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctName).append("=:acctName");
			parameter.put("acctName", acctName);
		}
		if (StringUtils.isNotBlank(custStatus) && !custStatus.equals("null")) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_Ext1).append("=:custStatus");
			parameter.put("custStatus", custStatus);
		}
		if (installmentFalg >= 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_InstallmentFlag).append("=:installmentFalg");
			parameter.put("installmentFalg", installmentFalg);
		}
		if (paymethod > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_PayMethod).append("=:paymethod");
			parameter.put("paymethod", paymethod);
		}
		if (cycleType > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_CycleType).append("=:cycleType");
			parameter.put("cycleType", cycleType);
		}
		if (StringUtils.isNotBlank(acctServiceId)) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_Ext2).append("=:ext2");
			parameter.put("ext2", acctServiceId);
		}
		// 记录业务日志
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		Map paraMap = new HashMap();
		paraMap.put("acctId", acctId);
		commonSV.saveCommonQryBusiLog(CmConstants.BusiLogId.ACCOUNT_QRY, condition.toString(), parameter, CmConstants.BusiLogType.ACCOUNT_LOG);
		IBOCmCustAcctRelValue[] result = (IBOCmCustAcctRelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustAcctRelBean.class, condition.toString(), parameter,
				start, end);
		ICm2SoSV cm2soSV = (ICm2SoSV) ServiceFactory.getService(ICm2SoSV.class);
		// 提供给360视图账户界面使用
		if (result != null && result.length > 0) {
			for (int i = 0; i < result.length; i++) {
				String edit = CrmLocaleFactory.getResource("SOS8802050");
				// String delete = CrmLocaleFactory.getResource("OFS2000254");
				String operation = CrmLocaleFactory.getResource("OFS2000243");

				String[] icons = new String[3];
				icons[0] = "<a href='javascript:void(0)' class='cellpath' onclick='modifyAccount(\"" + String.valueOf(result[i].getAcctId())
						+ "\")' style='color:blue;margin-left:5px;text-decoration:underline'>" + edit + "</a>";
				// icons[1] = "<a href='javascript:void(0)' class='cellpath' onclick='deleteAccount(\"" +
				// String.valueOf(accountValues[i].getAcctId())
				long acctountId = result[i].getAcctId();
				String reginId = CenterUtil.getRegionIdByAcctId(acctountId);
				String param = acctountId + "&regionId=" + reginId;
				icons[1] = "<a href='javascript:void(0)' class='cellpath' onclick='showAccount(\"" + acctountId + "\"" + "," + "\"" + reginId
						+ "\")' style='color:blue;margin-left:5px;text-decoration:underline'>" + operation + "</a>";

				result[i].setAction(icons[0] + icons[1]);
				// 查出payername
				DataContainer dc = cm2soSV.queryPayerByAcctId(result[i].getAcctId());
				if (dc != null) {
					result[i].setExt5(dc.getAsString("PAYER_NAME"));
				}

			}
		}

		return result;
	}

	public int queryCustAcctRelCountFor360(long relCustd, long acctId, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus, String acctServiceId)
			throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(" 1=1 ").append(" and ").append(IBOCmCustAcctRelValue.S_State).append("='U'");
		if (relCustd > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_RelCustId).append("=:relCustd");
			parameter.put("relCustd", relCustd);
		}
		if (acctId > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctId).append("=:acctId");
			parameter.put("acctId", acctId);
		}
		if (StringUtils.isNotBlank(acctName) && !acctName.equals("null")) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctName).append("=:acctName");
			parameter.put("acctName", acctName);
		}
		if (StringUtils.isNotBlank(custStatus) && !custStatus.equals("null")) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_Ext1).append("=:custStatus");
			parameter.put("custStatus", custStatus);
		}
		if (installmentFalg >= 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_InstallmentFlag).append("=:installmentFalg");
			parameter.put("installmentFalg", installmentFalg);
		}
		if (paymethod > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_PayMethod).append("=:paymethod");
			parameter.put("paymethod", paymethod);
		}
		if (cycleType > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_CycleType).append("=:cycleType");
			parameter.put("cycleType", cycleType);
		}
		if (StringUtils.isNotBlank(acctServiceId)) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_Ext2).append("=:ext2");
			parameter.put("ext2", acctServiceId);
		}
		int count = CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmCustAcctRelBean.class, condition.toString(), parameter);
		return count;
	}

	public void savePaymentAndReason(long acctId, long custId, String paymentTeams, String reason) throws Exception {
		ICmAccountSV accountSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		IAccountProfileValue[] iAccountProfileValue = accountSV.queryAcctDtsById(-1, custId, -1, -1);
		// IBOCmCustAcctRelValue[] iAccountProfileValue = (IBOCmCustAcctRelValue[])
		// accountSV.queryCustAcctRel(custId,-1,null,-1,-1,-1,null,-1,-1);
		for (int i = 0; i < iAccountProfileValue.length; i++) {
			if (CmCommonUtil.isNotEmptyObject(iAccountProfileValue)) {
				IVOAccountValue acctValue = new VOAccountBean();
				IAcctBillCycleValue billValue = new AcctBillCycleBean();
				billValue.copy(iAccountProfileValue[i]);
				// 从前台页面上获取的PaymentTeams以及Reason设置给Account帐户
				if (paymentTeams != null) {
					billValue.setBillDueDate(Long.parseLong(paymentTeams));
				}
				billValue.setRemarks(reason);
				// 为当前账户设置一个出账账期
				acctValue.setBillCycle(billValue);
				// 设置账户基本信息
				IAccountValue accountValue = new AccountBean();
				accountValue.copy(iAccountProfileValue[i]);
				acctValue.setAccount(accountValue);
				// 保存
				accountSV.saveAccount(acctValue);
			}
		}
	}

	public void synchronizeAcctInfo(long custId, Map param) throws Exception {

		if (custId > 0 && param != null) {
			IVOAccountValue VoacctValue = new VOAccountBean();
			IAccountValue accountValue = new AccountBean();
			IAcctBillCycleValue billValue = new AcctBillCycleBean();
			ICmAccountSV acctSv = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
			IBOCmCustAcctRelValue[] custAcctRelValue = acctSv.queryCustAcctRel(custId, -1, null, -1, -1, -1, null, -1, -1, null);
			if (custAcctRelValue != null && custAcctRelValue.length > 0) {
				for (int i = 0; i < custAcctRelValue.length; i++) {
					// accountValue必须传入如果没有accountValue只有IAcctBillCycleValue会有问题
					accountValue.copy(custAcctRelValue[i]);
					accountValue.setCustId(custAcctRelValue[i].getRelCustId());
					accountValue.setAcctBehalfPhone(DataType.getAsString(param.get("ACCT_BEHALF_PHONE")));
					if (!param.containsKey("ACCT_BEHALF_PHONE")) {
						// 账户信息没有被修改
						accountValue.setStsToOld();
					}
					VoacctValue.setAccount(accountValue);
					if (param.containsKey("BILL_DUE_DATE")) {
						Object billDueDate = param.get("BILL_DUE_DATE");
						billValue = acctSv.queryCurrAcctBillCyclesByAcctId(custAcctRelValue[i].getAcctId());
						billValue.setBillDueDate(DataType.getAsLong(billDueDate));
					}

					if (billValue.getAcctId() > 0) {
						VoacctValue.setBillCycle(billValue);
					}
					acctSv.saveAccount(VoacctValue);
				}

			}
		}

	}

	public IBOCmCustAcctRelValue[] queryCustAcctRelFor360(long relCustd, long acctId, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus,
			String acctServiceId, String serviceNumber, String pbs, String ean, int start, int end) throws Exception {
		long[] acctIds = null;
		if (acctId > 0) {//如果传入账户ID，则其余条件都不考虑
			acctIds = new long[1];
			acctIds[0] = acctId;
		} else if (StringUtils.isNotBlank(pbs) || StringUtils.isNotBlank(ean)) {
			ICmDKAccountSV accountSV = (ICmDKAccountSV) ServiceFactory.getService(ICmDKAccountSV.class);
			IBOCmBillingAcctValue[] billingAcctValues = accountSV.queryBillingAcct(-1, pbs, ean);
			if (billingAcctValues != null && billingAcctValues.length > 0) {
				acctIds = new long[billingAcctValues.length];
				for (int i = 0; i < billingAcctValues.length; i++) {
					acctIds[i] = billingAcctValues[i].getAcctId();
				}
			}
		} else if (StringUtils.isNotBlank(serviceNumber)) {
			ICrmFSV crmFSV = (ICrmFSV) ServiceFactory.getService(ICrmFSV.class);
			IInsAccrelValue[] accrelValues = crmFSV.getInstAccrel(-1, serviceNumber);
			if (accrelValues != null && accrelValues.length > 0) {
				acctIds = new long[accrelValues.length];
				for (int i = 0; i < accrelValues.length; i++) {
					acctIds[i] = accrelValues[i].getAcctId();
				}
			}
		}
		return queryCustAcctRel4MoreAcctIds(relCustd, acctIds, acctName, installmentFalg, paymethod, cycleType, custStatus, acctServiceId, start, end);

	}

	public int queryCustAcctRelCountFor360(long relCustd, long acctId, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus, String acctServiceId,
			String serviceNumber, String pbs, String ean) throws Exception {
		long[] acctIds = null;
		if (acctId > 0) {//如果传入账户ID，则其余条件都不考虑
			acctIds = new long[1];
			acctIds[0] = acctId;
		} else if (StringUtils.isNotBlank(pbs) || StringUtils.isNotBlank(ean)) {
			ICmDKAccountSV accountSV = (ICmDKAccountSV) ServiceFactory.getService(ICmDKAccountSV.class);
			IBOCmBillingAcctValue[] billingAcctValues = accountSV.queryBillingAcct(-1, pbs, ean);
			if (billingAcctValues != null && billingAcctValues.length > 0) {
				acctIds = new long[billingAcctValues.length];
				for (int i = 0; i < billingAcctValues.length; i++) {
					acctIds[i] = billingAcctValues[i].getAcctId();
				}
			}
		} else if (StringUtils.isNotBlank(serviceNumber)) {
			ICrmFSV crmFSV = (ICrmFSV) ServiceFactory.getService(ICrmFSV.class);
			IInsAccrelValue[] accrelValues = crmFSV.getInstAccrel(-1, serviceNumber);
			if (accrelValues != null && accrelValues.length > 0) {
				acctIds = new long[accrelValues.length];
				for (int i = 0; i < accrelValues.length; i++) {
					acctIds[i] = accrelValues[i].getAcctId();
				}
			}
		} else {

		}
		return queryCustAcctRelCount4MoreAcctIds(relCustd, acctIds, acctName, installmentFalg, paymethod, cycleType, custStatus, acctServiceId);

	}

	public IBOCMPartyAcctRelValue[] queryPartyAccRel(long acctId, long partyId, String State) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append("1=1");
		if (StringUtils.isNotBlank(State)) {
			condition.append(" and ").append(BOCMPartyAcctRelBean.S_State).append("=:state");
			parameter.put("state", State);
		}
		if (acctId > 0) {
			condition.append(" and ");
			condition.append(BOCMPartyAcctRelBean.S_AcctId).append("=:acctId");
			parameter.put("acctId", acctId);
		}
		if (partyId > 0) {
			condition.append(" and ");
			condition.append(BOCMPartyAcctRelBean.S_PartyId).append("=:partyId");
			parameter.put("partyId", partyId);
		}
		return (IBOCMPartyAcctRelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCMPartyAcctRelBean.class, condition.toString(), parameter, -1, -1);

	}

	public Map getBillDayAndBillCycle(long custId, Map param) throws Exception {
		Map result = new HashMap();
		int custType = CmCommonUtil.getCustType(custId);
		long agreementId = param.get("AGREEMENT_ID") == null ? -1 : Long.valueOf(param.get("AGREEMENT_ID").toString());
		String agreementCode = param.get("AGREEMENT_CODE") == null ? "" : param.get("AGREEMENT_CODE").toString();
		long acctId = param.get("ACCT_ID") == null ? -1 : Long.valueOf(param.get("ACCT_ID").toString());
		long userId = param.get("USER_ID") == null ? -1 : Long.valueOf(param.get("USER_ID").toString());
		// 个人客户
		if (custType == CmConstants.CustomerType.INDIVIDUAL) {
			// 1.个人账户，账期默认是按月出账，出账日固定为16号，不可以修改
			result.put("CYCLE_TYPE", "5");
			result.put("BILL_DAY", "16");
			return result;
		} else if (custType == CmConstants.CustomerType.GROUP) {// 集团客户
			if (agreementId > 0 || StringUtils.isNotBlank(agreementCode)) {
				IAgreementFSV agreementFSV = (IAgreementFSV) ServiceFactory.getService(IAgreementFSV.class);
				DataContainer dc = agreementFSV.queryAgreementBillCycle(agreementId, agreementCode, custId);
				if(dc == null){
					dc = agreementFSV.queryCurrentAgreementBillCycle(agreementId, agreementCode, custId);
				}
				if (dc != null) {
					// 1: Monthly：按月， 出账日11号。
					// 2: Quarterly：按季度，出账日：11号。
					// 3: PA quarterly：按季度，出账日：1号。
					int cycleType = dc.getAsInt("BILL_CYCLE");
					if (cycleType == 1) {
						result.put("CYCLE_TYPE", "5");
						result.put("BILL_DAY", "11");
					} else if (cycleType == 2) {
						result.put("CYCLE_TYPE", "6");
						result.put("BILL_DAY", "11");
					} else if (cycleType == 3) {
						result.put("CYCLE_TYPE", "6");
						result.put("BILL_DAY", "1");
					} else {
						result.put("CYCLE_TYPE", "5");
						result.put("BILL_DAY", "11");
					}
					result.put("AGREEMENT_ID", dc.getAsLong("AGREEMENT_ID"));
					result.put("PAYMENT_TERMS", dc.getAsLong("PAYMENT_TERMS"));
					return result;
				}
			}else if (acctId > 0 || userId > 0){
				Map cycleInfoMap = SoUtil.getBillCycleInfo(acctId,userId);
				if(null != cycleInfoMap){
					result.put("CYCLE_TYPE", DataType.getAsString(cycleInfoMap.get(SoSessionCachedFactory.USER_CYCLE_TYPE)));
					result.put("BILL_DAY", DataType.getAsString(cycleInfoMap.get(SoSessionCachedFactory.USER_ZHANGQI_KEY)));
					return result;
				}
			}
			result.put("CYCLE_TYPE", "5");
			result.put("BILL_DAY", "11");
			return result;
		}
		return result;
	}

	public DataContainerInterface[] queryPayerAccts(long partyId, int startIndex, int endIndex) throws Exception {
		IBOCMPartyAcctRelValue[] partyAcctRelValues = queryPartyAccRel(-1, partyId, null);
		if (CmCommonUtil.isEmptyObject(partyAcctRelValues)) {
			return new DataContainerInterface[0];
		}
		Map temp = new HashMap();
		String regionId = "";
		for (int i = 0, len = partyAcctRelValues.length; i < len; i++) {
			// 修改为按账户ID，第3-6位(regionId)分组
			regionId = CenterUtil.getRegionIdByAcctId(partyAcctRelValues[i].getAcctId());
			if (temp.containsKey(regionId)) {
				((List) temp.get(regionId)).add(partyAcctRelValues[i].getAcctId());
			} else {
				List acctList = new ArrayList();
				acctList.add(partyAcctRelValues[i].getAcctId());
				temp.put(regionId, acctList);
			}
		}
		List result = new ArrayList();
		List tempList = null;
		for (Iterator it = temp.entrySet().iterator(); it.hasNext();) {
			Entry entry = (Entry) it.next();
			tempList = (List) entry.getValue();
			Long[] ids = (Long[]) tempList.toArray(new Long[0]);
			long[] longIds = ArrayUtils.toPrimitive(ids);
			IAccountValue[] tempValues = CmServiceFactory.getAccountSV().queryAcctsByIds(longIds, (String) entry.getKey());
			CollectionUtils.addAll(result, tempValues);
		}
		if (CmCommonUtil.isNotEmptyObject(result)) {
			ICmPartySV partySV = (ICmPartySV) ServiceFactory.getService(ICmPartySV.class);
			IAccountValue[] temps = (IAccountValue[]) result.toArray(new IAccountValue[0]);
			int len = temps.length;
			DataContainerInterface[] dcs = new DataContainerInterface[len];
			for (int i = 0; i < len; i++) {
				dcs[i] = new DataContainer();
				dcs[i].copy(temps[i]);

				String edit = "<a href='javascript:void(0)' class='cellpath' onclick='viewAcct(\"" + temps[i].getAcctId() + "\"" + ",\"" + temps[i].getCustId() + "\""
						+ ")' style='color:blue;text-decoration:underline'>View</a>";
				dcs[i].set("ACTION", edit);

				// 设置payer名称
				IPartyValue partyValue = partySV.queryPartyById(partyId);
				if (partyValue != null) {
					dcs[i].set("PAYER", partyValue.getPartyName());
				}

				// 设置payer开始结束时间
				for (int j = 0; j < partyAcctRelValues.length; j++) {
					if (temps[i].getAcctId() == partyAcctRelValues[j].getAcctId()) {
						dcs[i].set(IAccountValue.S_EffectiveDate, partyAcctRelValues[j].getEffectiveDate());
						dcs[i].set(IAccountValue.S_ExpireDate, partyAcctRelValues[j].getExpireDate());
						if (partyAcctRelValues[j].getState().equalsIgnoreCase(CmConstants.RecordState.ERASE)) {
							dcs[i].set(IAccountValue.S_ExpireDate, partyAcctRelValues[j].getDoneDate());
						}
					}
				}
			}
			return dcs;
		}
		return new DataContainerInterface[0];
	}

	public int queryPayerAcctsCount(long partyId) throws Exception {
		return queryPayerAccts(partyId, -1, -1).length;
	}

	@Override
	public IBOCmCustAcctRelValue[] queryCustAcctRel(long relCustd, long acctId, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus, int start,
			int end, String state, String agrId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(" 1=1 ");
		if (relCustd > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_RelCustId).append("=:relCustd");
			parameter.put("relCustd", relCustd);
		}
		if (acctId > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctId).append("=:acctId");
			parameter.put("acctId", acctId);
		}
		if (StringUtils.isNotBlank(acctName) && !acctName.equals("null")) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctName).append("=:acctName");
			parameter.put("acctName", acctName);
		}
		if (StringUtils.isNotBlank(custStatus) && !custStatus.equals("null")) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_Ext1).append("=:custStatus");
			parameter.put("custStatus", custStatus);
		}
		if (installmentFalg >= 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_InstallmentFlag).append("=:installmentFalg");
			parameter.put("installmentFalg", installmentFalg);
		}
		if (paymethod > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_PayMethod).append("=:paymethod");
			parameter.put("paymethod", paymethod);
		}
		if (cycleType > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_CycleType).append("=:cycleType");
			parameter.put("cycleType", cycleType);
		}
		if (StringUtils.isNotBlank(state) && !state.equals("null")) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_State).append("=:state");
			parameter.put("state", state);
		}
		if (StringUtils.isNotBlank(agrId) && !agrId.equals("null")) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_Ext3).append("=:agrCode");
			parameter.put("agrCode", agrId);
		}

		// 记录业务日志
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		Map paraMap = new HashMap();
		paraMap.put("acctId", acctId);
		commonSV.saveCommonQryBusiLog(CmConstants.BusiLogId.ACCOUNT_QRY, condition.toString(), parameter, CmConstants.BusiLogType.ACCOUNT_LOG);
		IBOCmCustAcctRelValue[] result = (IBOCmCustAcctRelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustAcctRelBean.class, condition.toString(), parameter,
				start, end);

		return result;
	}
	
	@Override
	public int queryCustAcctRelCount(long relCustd, long acctId, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus,String state, String agrId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(" 1=1 ");
		if (relCustd > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_RelCustId).append("=:relCustd");
			parameter.put("relCustd", relCustd);
		}
		if (acctId > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctId).append("=:acctId");
			parameter.put("acctId", acctId);
		}
		if (StringUtils.isNotBlank(acctName) && !acctName.equals("null")) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctName).append("=:acctName");
			parameter.put("acctName", acctName);
		}
		if (StringUtils.isNotBlank(custStatus) && !custStatus.equals("null")) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_Ext1).append("=:custStatus");
			parameter.put("custStatus", custStatus);
		}
		if (installmentFalg >= 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_InstallmentFlag).append("=:installmentFalg");
			parameter.put("installmentFalg", installmentFalg);
		}
		if (paymethod > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_PayMethod).append("=:paymethod");
			parameter.put("paymethod", paymethod);
		}
		if (cycleType > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_CycleType).append("=:cycleType");
			parameter.put("cycleType", cycleType);
		}
		if (StringUtils.isNotBlank(state) && !state.equals("null")) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_State).append("=:state");
			parameter.put("state", state);
		}
		if (StringUtils.isNotBlank(agrId) && !agrId.equals("null")) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_Ext3).append("=:agrCode");
			parameter.put("agrCode", agrId);
		}

		// 记录业务日志
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		Map paraMap = new HashMap();
		paraMap.put("acctId", acctId);
		commonSV.saveCommonQryBusiLog(CmConstants.BusiLogId.ACCOUNT_QRY, condition.toString(), parameter, CmConstants.BusiLogType.ACCOUNT_LOG);
		int result = CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmCustAcctRelBean.class, condition.toString(), parameter);
		return result;
	}

	@Override
	public void updateAccountSend(IVOAccountValue accountValue) throws Exception {
		IVOCustValue custValue = new VOCustBean();
		IAccountValue acctVa = accountValue.getAccount();
		// 删除的时候做了逻辑删除，提交计费的时候需要该为删除状态
		if (null != acctVa) {
			if (StringUtils.isNotBlank(acctVa.getState()) && acctVa.getState().equalsIgnoreCase(CmConstants.RecordState.ERASE)) {
				acctVa.delete();
			}
		}

		IAcctBillCycleValue[] vals = accountValue.getBillCycles();
		if (vals != null && vals.length > 0) {
			if (StringUtils.isNotBlank(vals[0].getState()) && vals[0].getState().equalsIgnoreCase(CmConstants.RecordState.ERASE)) {
				vals[0].delete();
			}
		}
		IAcctPaymentValue[] values = accountValue.getPayments();
		if (values != null && values.length > 0) {
			if (StringUtils.isNotBlank(values[0].getState()) && values[0].getState().equalsIgnoreCase(CmConstants.RecordState.ERASE)) {
				values[0].delete();
			}
		}
		custValue.addAccount(accountValue);
		// 只有客管内部修改账户才上发
		// if (accountValue.getUserObject(CmConstants.MODIFY_ACCT_MODEL.MODIFY_ACCT_KEY) != null
		// &&
		// CmConstants.MODIFY_ACCT_MODEL.INNER_MODIFY.equals(accountValue.getUserObject(CmConstants.MODIFY_ACCT_MODEL.MODIFY_ACCT_KEY).toString()))
		// {
		// 处理同步客户资料给Billing
		CmServiceFactory.getTeamInvokeSV().sendCustInfo2Billing(custValue, null);
		// }

	}

	public IAccountProfileValue[] queryAcctDtsByCustIdAndBillId(long custId, String regionId, String billId, String payMethod, int insFlag, long agrId, String acctName,
			long acctId, int start, int end) throws Exception {
		int pm = -1;
		if (payMethod != null && !payMethod.equals("")) {
			pm = Integer.valueOf(payMethod);
		}
		// 根据billId查询accountId
		ISoAccrelValue[] accrelValues = null;
		long[] acctIds = null;
		if (billId != null && !"".equals(billId.trim())) {
			CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.BILL_ID, String.valueOf(billId));
			IQUserBaseInfoValue userInfo = CmServiceFactory.getTeamInvokeSV().getUserBaseInfoByBillId(billId);
			if (userInfo == null)
				return new AccountProfileBean[0];

			accrelValues = CmServiceFactory.getTeamInvokeSV().getSoAccrelsByUserId(userInfo.getUserId(), 1, -1, -1);

			if (accrelValues == null || accrelValues.length <= 0)
				return new AccountProfileBean[0];
			if (accrelValues != null && accrelValues.length > 0) {
				acctIds = new long[accrelValues.length];
				for (int i = 0; i < accrelValues.length; i++) {
					acctIds[i] = accrelValues[i].getAcctId();
				}
			}

		}
		// 如果传了acctId就用acctId去查询
		if (acctId > 0) {
			acctIds = new long[] { acctId };
		}
		// 查询custAcctrel
		IBOCmCustAcctRelValue[] result = ((ICm2SoSV) ServiceFactory.getService(ICm2SoSV.class)).queryCustAcctRelByCnd(custId, acctIds, acctName, insFlag, pm, -1, null, agrId,
				start, end);
		if (result != null && result.length > 0) {
			// 根据custId查询客户信息
			ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			ICustomerValue custValue = custSV.queryCustomerByCustId(custId);
			String fitstName = "";
			String lastName = "";
			String CustName = "";
			if (custValue != null) {
				fitstName = custValue.getFirstName();
				lastName = custValue.getLastName();
				CustName = custValue.getCustName();
			}
			IAccountProfileValue returnResult[] = new AccountProfileBean[result.length];
			for (int i = 0; i < returnResult.length; i++) {
				returnResult[i] = new AccountProfileBean();
				returnResult[i].copy(result[i]);
				returnResult[i].setAcctStatus(Integer.parseInt(result[i].getExt1()));
				returnResult[i].setCustId(result[i].getRelCustId());
				if (custValue != null) {
					returnResult[i].setFirstName(fitstName);
					returnResult[i].setLastName(lastName);
					returnResult[i].setCustName(CustName);
				}
			}
			return returnResult;
		}
		return new IAccountProfileValue[0];
	}

	public IAccountProfileValue[] queryAcctDtsByCustIdAndBillId(long custId, String regionId, String billId, String payMethod, int insFlag, String agrId, String acctName,
			long acctId, int start, int end) throws Exception {
		int pm = -1;
		if (payMethod != null && !payMethod.equals("")) {
			pm = Integer.valueOf(payMethod);
		}
		if (StringUtils.isEmpty(agrId)) {
			agrId = "0";
		}
		// 根据billId查询accountId
		ISoAccrelValue[] accrelValues = null;
		long[] acctIds = null;
		if (billId != null && !"".equals(billId.trim())) {
			CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.BILL_ID, String.valueOf(billId));
			IQUserBaseInfoValue userInfo = CmServiceFactory.getTeamInvokeSV().getUserBaseInfoByBillId(billId);
			if (userInfo == null)
				return new AccountProfileBean[0];

			accrelValues = CmServiceFactory.getTeamInvokeSV().getSoAccrelsByUserId(userInfo.getUserId(), 1, -1, -1);

			if (accrelValues == null || accrelValues.length <= 0)
				return new AccountProfileBean[0];
			if (accrelValues != null && accrelValues.length > 0) {
				acctIds = new long[accrelValues.length];
				for (int i = 0; i < accrelValues.length; i++) {
					acctIds[i] = accrelValues[i].getAcctId();
				}
			}

		}
		// 如果传了acctId就用acctId去查询
		if (acctId > 0) {
			acctIds = new long[] { acctId };
		}
		// 查询custAcctrel
		IBOCmCustAcctRelValue[] result = ((ICm2SoSV) ServiceFactory.getService(ICm2SoSV.class)).queryCustAcctRelByCnd(custId, acctIds, acctName,
				insFlag, pm, -1, null, Long.parseLong(agrId), start, end);
		if (result != null && result.length > 0) {
			// 根据custId查询客户信息
			ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			ICustomerValue custValue = custSV.queryCustomerByCustId(custId);
			String fitstName = "";
			String lastName = "";
			String CustName = "";
			if (custValue != null) {
				fitstName = custValue.getFirstName();
				lastName = custValue.getLastName();
				CustName = custValue.getCustName();
			}
			IAccountProfileValue returnResult[] = new AccountProfileBean[result.length];
			for (int i = 0; i < returnResult.length; i++) {
				returnResult[i] = new AccountProfileBean();
				returnResult[i].copy(result[i]);
				returnResult[i].setAcctStatus(Integer.parseInt(result[i].getExt1()));
				returnResult[i].setCustId(result[i].getRelCustId());
				if (custValue != null) {
					returnResult[i].setFirstName(fitstName);
					returnResult[i].setLastName(lastName);
					returnResult[i].setCustName(CustName);
				}
			}
			return returnResult;
		}
		return new IAccountProfileValue[0];
	}
	
	@Override
	public int queryAcctDtsCountByCustIdAndBillId(long custId, String regionId, String billId, String payMethod, int insFlag, long agrId, String acctName, long acctId)
			throws Exception {
		int count = 0;
		int pm = -1;
		if (payMethod != null && !payMethod.equals("")) {
			pm = Integer.valueOf(payMethod);
		}
		// 根据billId查询accountId
		ISoAccrelValue[] accrelValues = null;
		long[] acctIds = null;
		if (billId != null && !"".equals(billId.trim())) {
			CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.BILL_ID, String.valueOf(billId));
			IQUserBaseInfoValue userInfo = CmServiceFactory.getTeamInvokeSV().getUserBaseInfoByBillId(billId);
			if (userInfo == null)
				return count;

			accrelValues = CmServiceFactory.getTeamInvokeSV().getSoAccrelsByUserId(userInfo.getUserId(), 1, -1, -1);

			if (accrelValues == null || accrelValues.length <= 0)
				return count;
			if (accrelValues != null && accrelValues.length > 0) {
				acctIds = new long[accrelValues.length];
				for (int i = 0; i < accrelValues.length; i++) {
					acctIds[i] = accrelValues[i].getAcctId();
				}
			}

		}
		// 如果传了acctId就用acctId去查询
		if (acctId > 0) {
			acctIds = new long[] { acctId };
		}
		// 查询custAcctrel
		count = ((ICm2SoSV) ServiceFactory.getService(ICm2SoSV.class)).queryCustAcctRelCountByCnd(custId, acctIds, acctName, insFlag, pm, -1, null, agrId);

		return count;
	}

	@Override
	public int queryAcctDtsCountByCustIdAndBillId(long custId, String regionId, String billId, String payMethod, int insFlag, String agrId, String acctName, long acctId)
			throws Exception {
		int count = 0;
		int pm = -1;
		if (payMethod != null && !payMethod.equals("")) {
			pm = Integer.valueOf(payMethod);
		}
		// 根据billId查询accountId
		ISoAccrelValue[] accrelValues = null;
		long[] acctIds = null;
		if (billId != null && !"".equals(billId.trim())) {
			CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.BILL_ID, String.valueOf(billId));
			IQUserBaseInfoValue userInfo = CmServiceFactory.getTeamInvokeSV().getUserBaseInfoByBillId(billId);
			if (userInfo == null)
				return count;

			accrelValues = CmServiceFactory.getTeamInvokeSV().getSoAccrelsByUserId(userInfo.getUserId(), 1, -1, -1);

			if (accrelValues == null || accrelValues.length <= 0)
				return count;
			if (accrelValues != null && accrelValues.length > 0) {
				acctIds = new long[accrelValues.length];
				for (int i = 0; i < accrelValues.length; i++) {
					acctIds[i] = accrelValues[i].getAcctId();
				}
			}

		}
		// 如果传了acctId就用acctId去查询
		if (acctId > 0) {
			acctIds = new long[] { acctId };
		}
		// 查询custAcctrel
		count = ((ICm2SoSV) ServiceFactory.getService(ICm2SoSV.class)).queryCustAcctRelCountByCnd(custId, acctIds, acctName, insFlag, pm, -1, null, agrId);

		return count;
	}
	
	@Override
	public IBOCmCustAcctRelValue[] queryCustAcctRel4MoreAcctIds(long relCustd, long[] acctId, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus,
			String acctServiceId, int start, int end) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(" 1=1 ").append(" and ").append(IBOCmCustAcctRelValue.S_State).append("='U'");
		if (relCustd > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_RelCustId).append("=:relCustd");
			parameter.put("relCustd", relCustd);
		}
		if (acctId != null && acctId.length > 0) {
			StringBuilder acctIds = new StringBuilder();
			if (acctId.length == 1) {
				condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctId).append("=:acctId");
				parameter.put("acctId", acctId[0]);
			} else {
				for (int x = 0; x < acctId.length; x++) {
					acctIds.append(acctId[x]).append(",");
				}
				if (acctIds.length() > 0) {
					acctIds = acctIds.deleteCharAt(acctIds.length() - 1);
				}
				condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctId).append(" IN (").append(acctIds.toString()).append(")");
			}
		}
		if (StringUtils.isNotBlank(acctName) && !"null".equals(acctName)) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctName).append("=:acctName");
			parameter.put("acctName", acctName);
		}
		if (StringUtils.isNotBlank(custStatus) && !"null".equals(custStatus)) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_Ext1).append("=:custStatus");
			parameter.put("custStatus", custStatus);
		}
		if (installmentFalg >= 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_InstallmentFlag).append("=:installmentFalg");
			parameter.put("installmentFalg", installmentFalg);
		}
		if (paymethod > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_PayMethod).append("=:paymethod");
			parameter.put("paymethod", paymethod);
		}
		if (cycleType > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_CycleType).append("=:cycleType");
			parameter.put("cycleType", cycleType);
		}
		if (StringUtils.isNotBlank(acctServiceId)) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_Ext2).append("=:ext2");
			parameter.put("ext2", acctServiceId);
		}
		// 记录业务日志
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		Map paraMap = new HashMap();
		paraMap.put("acctId", acctId);
		commonSV.saveCommonQryBusiLog(CmConstants.BusiLogId.ACCOUNT_QRY, condition.toString(), parameter, CmConstants.BusiLogType.ACCOUNT_LOG);
		IBOCmCustAcctRelValue[] result = (IBOCmCustAcctRelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustAcctRelBean.class, condition.toString(), parameter,
				start, end);
		ICm2SoSV cm2soSV = (ICm2SoSV) ServiceFactory.getService(ICm2SoSV.class);
		// 提供给360视图账户界面使用
		if (result != null && result.length > 0) {
			for (int i = 0; i < result.length; i++) {
				String edit = CrmLocaleFactory.getResource("SOS8802050");
				// String delete = CrmLocaleFactory.getResource("OFS2000254");
				String operation = CrmLocaleFactory.getResource("OFS2000243");

				String[] icons = new String[3];
				icons[0] = "<a href='javascript:void(0)' class='cellpath' onclick='modifyAccount(\"" + result[i].getAcctId()
						+ "\")' style='color:blue;margin-left:5px;text-decoration:underline'>" + edit + "</a>";
				// icons[1] = "<a href='javascript:void(0)' class='cellpath' onclick='deleteAccount(\"" +
				// String.valueOf(accountValues[i].getAcctId())
				long acctountId = result[i].getAcctId();
				String reginId = CenterUtil.getRegionIdByAcctId(acctountId);
				icons[1] = "<a href='javascript:void(0)' class='cellpath' onclick='showAccount(\"" + acctountId + "\"" + "," + "\"" + reginId
						+ "\")' style='color:blue;margin-left:5px;text-decoration:underline'>" + operation + "</a>";

				result[i].setAction(icons[0] + icons[1]);
				// 查出payername
				DataContainer dc = cm2soSV.queryPayerNameByAcctId(result[i].getAcctId());
				if (dc != null) {
					result[i].setExt5(dc.getAsString("PAYER_NAME"));
				}
			}
		}
		return result;
	}

	@Override
	public int queryCustAcctRelCount4MoreAcctIds(long relCustd, long[] acctId, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus,
			String acctServiceId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(" 1=1 ").append(" and ").append(IBOCmCustAcctRelValue.S_State).append("='U'");
		if (relCustd > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_RelCustId).append("=:relCustd");
			parameter.put("relCustd", relCustd);
		}
		if (acctId != null && acctId.length > 0) {
			StringBuilder acctIds = new StringBuilder();
			if (acctId.length == 1) {
				condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctId).append("=:acctId");
				parameter.put("acctId", acctId[0]);
			} else {
				for (int x = 0; x < acctId.length; x++) {
					acctIds.append(acctId[x]).append(",");
				}
				if (acctIds.length() > 0) {
					acctIds = acctIds.deleteCharAt(acctIds.length() - 1);
				}
				condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctId).append(" IN (").append(acctIds.toString()).append(")");
			}
		}
		if (StringUtils.isNotBlank(acctName) && !"null".equals(acctName)) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctName).append("=:acctName");
			parameter.put("acctName", acctName);
		}
		if (StringUtils.isNotBlank(custStatus) && !"null".equals(custStatus)) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_Ext1).append("=:custStatus");
			parameter.put("custStatus", custStatus);
		}
		if (installmentFalg >= 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_InstallmentFlag).append("=:installmentFalg");
			parameter.put("installmentFalg", installmentFalg);
		}
		if (paymethod > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_PayMethod).append("=:paymethod");
			parameter.put("paymethod", paymethod);
		}
		if (cycleType > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_CycleType).append("=:cycleType");
			parameter.put("cycleType", cycleType);
		}
		if (StringUtils.isNotBlank(acctServiceId)) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_Ext2).append("=:ext2");
			parameter.put("ext2", acctServiceId);
		}
		int count = CmInnerServiceFactory.getCommonInnerSV().getBeanCount(BOCmCustAcctRelBean.class, condition.toString(), parameter);
		return count;
	}

	public DataContainer[] queryCustAcctRelsAll(long acctId, long custId, Class beanClass, int startIndex, int endIndex) throws Exception {
		DataContainer[] results = (DataContainer[]) CmInnerServiceFactory.getAccountInnerSV().queryCustAcctRelsAllByAcctIdOrCustId(acctId, custId, beanClass, startIndex, endIndex);
		return results;
	}
	
	public int queryCustAcctRelsAllCount(long acctId, long custId, Class beanClass) throws Exception {
		int result =  CmInnerServiceFactory.getAccountInnerSV().queryCustAcctRelsAllByAcctIdOrCustIdCount(acctId, custId, beanClass);
		return result;
	}

	@Override
	public IBOCmCustAcctRelValue[] queryCustAcctRel4CR128(long relCustd, long acctId, String acctName,
			int installmentFalg, int paymethod, int cycleType, String custStatus, int start, int end) throws Exception {

		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(" 1=1 ").append(" and ").append("(STATE='U' or STATE='T')");
		if (relCustd > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_RelCustId).append("=:relCustd");
			parameter.put("relCustd", relCustd);
		}
		if (acctId > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctId).append("=:acctId");
			parameter.put("acctId", acctId);
		}
		if (StringUtils.isNotBlank(acctName) && !"null".equals(acctName)) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctName).append("=:acctName");
			parameter.put("acctName", acctName);
		}
		if (StringUtils.isNotBlank(custStatus) && !"null".equals(custStatus)) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_Ext1).append("=:custStatus");
			parameter.put("custStatus", custStatus);
		}
		if (installmentFalg >= 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_InstallmentFlag).append("=:installmentFalg");
			parameter.put("installmentFalg", installmentFalg);
		}
		if (paymethod > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_PayMethod).append("=:paymethod");
			parameter.put("paymethod", paymethod);
		}
		if (cycleType > 0) {
			condition.append(" and ").append(IBOCmCustAcctRelValue.S_CycleType).append("=:cycleType");
			parameter.put("cycleType", cycleType);
		}
		// 记录业务日志
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		Map paraMap = new HashMap();
		paraMap.put("acctId", acctId);
		commonSV.saveCommonQryBusiLog(CmConstants.BusiLogId.ACCOUNT_QRY, condition.toString(), parameter, CmConstants.BusiLogType.ACCOUNT_LOG);
		IBOCmCustAcctRelValue[] result = (IBOCmCustAcctRelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustAcctRelBean.class, condition.toString(), parameter,
				start, end);

		return result;
	}

	@Override
	public IBOCmCustAcctRelValue queryCustAcctRelForCVS833(long custId, long acctId) throws Exception {
		StringBuilder condition = new StringBuilder();
		Map parameter = new HashMap();
		condition.append(" 1=1 ").append(" and ").append("(STATE='U' or STATE='T')");
		condition.append(" and ").append(IBOCmCustAcctRelValue.S_RelCustId).append("=:custId");
		parameter.put("custId", custId);
		condition.append(" and ").append(IBOCmCustAcctRelValue.S_AcctId).append("=:acctId");
		parameter.put("acctId", acctId);
		IBOCmCustAcctRelValue[] result = (IBOCmCustAcctRelValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustAcctRelBean.class, condition.toString(), parameter,
				-1, -1);
		if (CmCommonUtil.isNotEmptyObject(result)) {
			return result[0];
		}
		return null;
	}
}