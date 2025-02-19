package com.asiainfo.crm.cm.teaminvoke.out.service.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.SessionManager;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.appframe2.util.StringUtils;
import com.asiainfo.crm.cm.busimodel.impl.customer.AbstractCustManagerQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.ivalues.IBOCmInsCmrelValue;
import com.asiainfo.crm.cm.common.ivalues.IQBOCmGroupPartyValue;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmDkCustomerSV;
import com.asiainfo.crm.cm.inner.account.bo.BOCmAccountBean;
import com.asiainfo.crm.cm.inner.account.bo.BOCmAcctBillCycleBean;
import com.asiainfo.crm.cm.inner.account.bo.BOCmAcctPaymentBean;
import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmAccountValue;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustContactMediumBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmxIndivCustomerBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxIndivCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmCustContMediumAndTypeValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.customer.group.ivalues.IBOLnCmxGroupCustValue;
import com.asiainfo.crm.cm.ln.customer.group.service.interfaces.ICmLnGroupSV;
import com.asiainfo.crm.cm.model.bean.VOAccountBean;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.bo.AccountBean;
import com.asiainfo.crm.cm.model.bo.AcctBillCycleBean;
import com.asiainfo.crm.cm.model.bo.AcctPaymentBean;
import com.asiainfo.crm.cm.model.bo.CustomerBean;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCycleValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctPaymentValue;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.ICustManagerValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IVOAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.service.interfaces.ICmAccountSV;
import com.asiainfo.crm.cm.service.interfaces.ICmContactSV;
import com.asiainfo.crm.cm.support.bce.util.CmBceSupportConstants;
import com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICm2InterFSV;
import com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.constant.RBossConst;
import com.asiainfo.crm.so.common.party.ivalues.IBOBsWholesaleRouterCfgValue;
import com.asiainfo.crm.so.common.party.service.interfaces.IWholesaleRouterSV;

public class CmCustomerSVImpl implements ICmCustomerSV {

	private static final Log log = LogFactory.getLog(CmCustomerSVImpl.class);

	public ICustomerValue queryCustomerByCustId(long custId) throws Exception {
		com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV service = (com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV) ServiceFactory
				.getService(com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV.class);
		return service.queryCustomerByCustId(custId);
	}

	public void changeStateToOnline(long custId) throws Exception {
		com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV service = (com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV) ServiceFactory
				.getService(com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV.class);
		ICustomerValue value = service.queryCustomerByCustId(custId);
		value.setCustStatus(1);
		service.saveCustomer(value);
	}

	public void changeStateToOffline(long custId) throws Exception {
		com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV service = (com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV) ServiceFactory
				.getService(com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV.class);
		ICustomerValue value = service.queryCustomerByCustId(custId);
		value.setCustStatus(2);
		service.saveCustomer(value);
	}

	public void saveAccount(IBOCmAccountValue value) throws Exception {
		BOCmAccountBean bean = new BOCmAccountBean();
		bean.copy(value);
		CmInnerServiceFactory.getCommonInnerSV().saveBean(bean);
	}

	public void saveCmLifeCycle(long userId, long custId, long oldCustId, int action) throws Exception {
		ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		commonSV.saveCmLifeCycle(userId, custId, oldCustId, action);
	}

	public IBOCmCustContactMediumValue[] queryCustContactMediumByCustId(long custId) throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 ");
		HashMap parameter = new HashMap();
		condition.append(" AND ").append(IBOCmCustContactMediumValue.S_CustId).append(" =:custId ");
		parameter.put("custId", custId);
		condition.append(" ORDER BY ").append(IQBOCmCustContMediumAndTypeValue.S_Priority);
		return (IBOCmCustContactMediumValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmCustContactMediumBean.class, condition.toString(), parameter, -1, -1);
	}

	public void dealCreateCustomer(long custId, boolean flag) throws Exception {
		if (custId > 0 && CmCommonUtil.getCustType(custId) == CmConstants.CustomerType.INDIVIDUAL) {
			com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV service = (com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV) ServiceFactory
					.getService(com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV.class);
			ICustomerValue value = service.queryCustomerByCustId(custId);
			if (flag == false) {
				if (CmCommonUtil.isNotEmptyObject(value)) {
					value.delete();
					service.saveCustomer(value);
				}
				IBOCmxIndivCustomerValue value1 = service.queryCmxIndivCustomerValue(custId);
				if (CmCommonUtil.isNotEmptyObject(value1)) {
					value1.delete();
					service.saveCmxIndivCustomer(value1);
				}
			} 
			/**
			 * AI-8388  
			 * else {
				if (!StringUtils.isEmptyString(value.getCustCertCode())) {
					value.setCustCertCode(null);
					service.saveCustomer(value);
				}
			} */
		}
	}

	public IBOCmxIndivCustomerValue queryCmxIndivCustomerByCustId(long custId) throws Exception {
		StringBuffer condition = new StringBuffer(" 1=1 ");
		Map parameter = new HashMap();
		condition.append(" AND ").append(IBOCmxIndivCustomerValue.S_CustId).append(" =:custId ");
		parameter.put("custId", custId);
		IBOCmxIndivCustomerValue[] values = (IBOCmxIndivCustomerValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmxIndivCustomerBean.class, condition.toString(),
				parameter, -1, -1);
		if (null != values && values.length > 0) {
			return values[0];
		}
		return null;
	}

	public void modifyAccountValueForOSE(IAccountValue acct,String paymentAccountName,Map extMap) throws Exception {
		ICmAccountSV service = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		long acctId = acct.getAcctId();
		if (acctId > 0) {
			IAccountValue value = service.queryAccountById(acctId);
			if(value == null){
				return;
			}
			IVOAccountValue value1 = new VOAccountBean();
			if (CmCommonUtil.isNotEmptyObject(value)) {
				Map map = acct.getProperties();
				Iterator it = map.keySet().iterator();
				while (it.hasNext()) {
					String key = (String) it.next();
					value.set(key, map.get(key));
				}			
				value1.setAccount(value);
			}		
			if(!StringUtils.isEmptyString(paymentAccountName)){
				IAcctPaymentValue[] paymentValues = service.queryAcctPaymentsByAcctId(acctId, CmConstants.RecordState.USE, -1, -1);
				if(null != paymentValues && paymentValues.length > 0){
					for(int i = 0;i<paymentValues.length;i++){
						//应王鲲要求，为-1时，塞空串。TELENOR_DEFECT_20180611_0003
						if("-1".equals(paymentAccountName)){
							paymentValues[i].setPaymentAccountName("");
						}else{
							paymentValues[i].setPaymentAccountName(paymentAccountName);
						}						
					}
					value1.addPayments(paymentValues);
				}
			}
			
			CmServiceFactory.getAccountSV().saveAccount(value1);
		}
	}

	public void modifyAccountValue(IAccountValue acct) throws Exception {
		ICmAccountSV service = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		long acctId = acct.getAcctId();
		if (acctId > 0) {
			IAccountValue value = service.queryAccountById(acctId);
			if (CmCommonUtil.isNotEmptyObject(value)) {
				Map map = acct.getProperties();
				Iterator it = map.keySet().iterator();
				while (it.hasNext()) {
					String key = (String) it.next();
					value.set(key, map.get(key));
				}
				IVOAccountValue value1 = new VOAccountBean();
				value1.setAccount(value);
				CmServiceFactory.getAccountSV().saveAccount(value1);
			}
		}
	}

	public IQBOCmGroupPartyValue[] queryGroupContact(long custId, int contType, String billId, String partyName) throws Exception {
		ICmContactSV service = (ICmContactSV) ServiceFactory.getService(ICmContactSV.class);
		return service.queryGroupContact(custId, contType, billId, partyName);

	}

	public void saveCustCreditValue(long custId, int creditLevel, int creditValue) throws Exception {
		// com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV service =
		// (com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV) ServiceFactory
		// .getService(com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV.class);
		// ICustomerValue value=service.queryCustomerByCustId(custId);
		// //是否允许修改信用�?
		// if(value.getIsRevisable() == 1){
		// value.setCreditLevel(creditLevel);
		// value.setCreditValue(creditValue);
		// service.saveCustomer(value);
		// }
	}

	public long queryAnonymousCustInfo() throws Exception {
		long orgId = SessionManager.getUser().getOrgId();
		String tenantId = SessionManager.getUser().getTenantId();
		long custId = 21210088888888L;
		long acctId = 32100888888888L;
		if ("22".equals(tenantId)) {
			acctId = 32200888888888L;
		}
		if (StringUtils.equals(tenantId, "91")) {
			IWholesaleRouterSV routerSV = (IWholesaleRouterSV) ServiceFactory.getService(IWholesaleRouterSV.class);
			IBOBsWholesaleRouterCfgValue[] values = routerSV.getAllWsRouterCfg();
			for (IBOBsWholesaleRouterCfgValue item : values) {
				if (orgId == item.getOrgId()) {
					custId = item.getWsCustId();
					break;
				}
			}
		}

		if (StringUtils.equals(tenantId, "91")) {
			return custId;
		} else {
			com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV service = (com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV) ServiceFactory
					.getService(com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV.class);
			IBOCmIndivCustomerValue value = service.queryIndivCustomerInfo(custId);
			if (CmCommonUtil.isNotEmptyObject(value)) {
				return custId;
			}
			// 创建VO大对象
			IVOCustValue voCustValue = new VOCustBean();
			// 创建customer对象
			ICustomerValue custValue = new CustomerBean();
			// 创建个人扩展信息对象
			IBOCmxIndivCustomerValue cmxCustValue = new BOCmxIndivCustomerBean();
			// 默认塞上custId(必填)
			custValue.setCustId(custId);
			// 默认塞上1，是匿名客户
			custValue.setAnonymousFlag(1);
			// 默认塞上custName（必填）
			custValue.setCustName("anonymouscust test");
			// custStatus(必填)
			custValue.setCustStatus(CmConstants.CustomerStatus.GROUP_POTENTIAL);
			// realNameFlag(必填)
			custValue.setRealNameFlag(0);
			// customerType(系统会校验)
			custValue.setCustType(CmConstants.CustomerType.INDIVIDUAL);
			// firstName,lastName 会校验
			custValue.setFirstName("anonymouscust");
			custValue.setLastName("test");
			cmxCustValue.setCustId(custId);
			cmxCustValue.setExt4("0");
			cmxCustValue.setExt6("0");
			cmxCustValue.setExt7("0");
			cmxCustValue.setExt8("0");
			cmxCustValue.setExt9("0");
			voCustValue.setCustomer(custValue);
			voCustValue.setUserObject(CmBceSupportConstants.CmDefaultCodeValue.codeValueCmxIndivCustomer, cmxCustValue);
			CmServiceFactory.getCustomerSV().saveCustomer(voCustValue);

			// 创建ivoaccount大对象
			IVOAccountValue voAcctValue = new VOAccountBean();
			IAccountValue accountValue = new AccountBean();
			accountValue.setCustId(custId);
			accountValue.setAcctId(acctId);
			voAcctValue.setAccount(accountValue);
			ICm2InterFSV interFSV = (ICm2InterFSV) ServiceFactory.getService(ICm2InterFSV.class);
			interFSV.dealAccount(voAcctValue);
			return custId;
		}
	}

	public ICustomerValue queryTerminateCustomerInfo(long custId) throws Exception {
		com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV service = (com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV) ServiceFactory
				.getService(com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV.class);
		DataContainer dc = new DataContainer();
		if (custId > 0) {
			dc.set("CUST_ID", custId);
			dc.set("STATE", CmConstants.RecordState.ERASE);
			dc.set("CUST_STATUS", CmConstants.CustomerStatus.GROUP_TERMINATED);
			ICustomerValue[] values = service.queryCustomers(dc, -1, -1);
			if (CmCommonUtil.isNotEmptyObject(values)) {
				return values[0];
			}
		}
		return null;
	}

	public IBOCmInsCmrelValue[] queryCmInsCmrel(long custId, int startIndex, int endIndex) throws Exception {
		return CmServiceFactory.getCustomerSV().queryCmInsCmrel(custId, startIndex, endIndex);
	}

	public long getIndivCustomer(String firstName, String lastName) throws Exception {
		ICmCommonSV service = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
		long custId = service.getCustId(CmConstants.CustomerType.INDIVIDUAL);
		long acctId = service.getAcctId(new BOCmAccountBean());
		long cycleId = CmCommonUtil.getNewSequence(BOCmAcctBillCycleBean.class);
		long payId = CmCommonUtil.getNewSequence(BOCmAcctPaymentBean.class);
		// 创建VO大对�?
		IVOCustValue voCustValue = new VOCustBean();
		// 创建customer对象
		ICustomerValue custValue = new CustomerBean();
		// 创建个人扩展信息对象
		IBOCmxIndivCustomerValue cmxCustValue = new BOCmxIndivCustomerBean();
		// 默认塞上custId(必填)
		custValue.setCustId(custId);
		// 默认塞上1，是匿名客户
		custValue.setAnonymousFlag(1);
		// 默认塞上custName（必填）
		custValue.setCustName(firstName + " " + lastName);
		// custStatus(必填)
		custValue.setCustStatus(CmConstants.CustomerStatus.GROUP_POTENTIAL);
		// realNameFlag(必填)
		custValue.setRealNameFlag(0);
		// customerType(系统会校�?
		custValue.setCustType(CmConstants.CustomerType.INDIVIDUAL);
		// firstName,lastName 会校�?
		custValue.setFirstName(firstName);
		custValue.setLastName(lastName);
		cmxCustValue.setCustId(custId);
		cmxCustValue.setExt4("0");
		cmxCustValue.setExt6("0");
		cmxCustValue.setExt7("0");
		cmxCustValue.setExt8("0");
		cmxCustValue.setExt9("0");
		voCustValue.setCustomer(custValue);
		voCustValue.setUserObject(CmBceSupportConstants.CmDefaultCodeValue.codeValueCmxIndivCustomer, cmxCustValue);
		CmServiceFactory.getCustomerSV().saveCustomer(voCustValue);

		// 创建ivoaccount大对�?
		IVOAccountValue voAcctValue = new VOAccountBean();
		// 创建账户对象
		IAccountValue acctValue = new AccountBean();
		// 创建账期对象
		IAcctBillCycleValue cycleValue = new AcctBillCycleBean();
		// 创建支付方式对象
		IAcctPaymentValue payValue = new AcctPaymentBean();
		// 默认塞上custId
		acctValue.setCustId(custId);
		// 默认塞上acctId
		acctValue.setAcctId(acctId);
		// 默认塞上custName
		acctValue.setAcctName(firstName + " " + lastName);
		// 默认塞上账期ID
		cycleValue.setCycleId(cycleId);
		// 默认塞上acctId
		cycleValue.setAcctId(acctId);
		// 默认塞上账期
		cycleValue.setCycleType(5);
		// 默认塞上出账�?
		cycleValue.setBillDay(16);
		// 默认塞上支付方式主键
		payValue.setPaymentId(payId);
		payValue.setAcctId(acctId);
		// 默认塞上支付方式
		payValue.setPayMethod(1);// 默认为自有；
		voAcctValue.setAccount(acctValue);
		voAcctValue.setBillCycle(cycleValue);
		voAcctValue.setPayment(payValue);
		CmServiceFactory.getAccountSV().saveAccount(voAcctValue);
		return custId;
	}

	public ICustManagerValue[] queryCustManagersByCustId(long custId, int startNum, int endNum) throws Exception {
		AbstractCustManagerQueryBusiModelImpl busiModelImpl = (AbstractCustManagerQueryBusiModelImpl) CmServiceFactory.getBusiMode(AbstractCustManagerQueryBusiModelImpl.class);
		return (ICustManagerValue[]) busiModelImpl.queryCustManagerByCustId(custId, CmConstants.RecordState.USE, startNum, endNum);
	}

	public IContactValue[] queryGroupCustomerContacts(long custId, int contType) throws Exception {
		ICmDkCustomerSV dkCustomerSV = (ICmDkCustomerSV) ServiceFactory.getService(ICmDkCustomerSV.class);
		return dkCustomerSV.queryGroupCustomerContacts(custId, contType);
	}
}
