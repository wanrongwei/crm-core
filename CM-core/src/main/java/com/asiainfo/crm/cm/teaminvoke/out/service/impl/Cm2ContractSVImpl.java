package com.asiainfo.crm.cm.teaminvoke.out.service.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.TimeUtil;
import com.asiainfo.crm.agreement.teaminvoke.out.service.interfaces.IAgreementFSV;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.bo.BOCmPsTaskDealBean;
import com.asiainfo.crm.cm.common.ivalues.IBOCmPsTaskDealValue;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.customer.group.ivalues.IBoCmCustSegmentValue;
import com.asiainfo.crm.cm.customer.group.service.interfaces.ICmCustSegmentSV;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmDkCustomerSV;
import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmCustAcctRelValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmCustContMediumAndTypeValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.bean.VOAccountBean;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.bo.AcctAgreemnetRelBean;
import com.asiainfo.crm.cm.model.bo.AcctBillCycleBean;
import com.asiainfo.crm.cm.model.ivalues.IAccountProfileValue;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctAgreemnetRelValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCycleValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctPaymentValue;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IVOAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.service.interfaces.ICmAccountSV;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPsTaskSV;
import com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICm2ContractSV;

public class Cm2ContractSVImpl implements ICm2ContractSV {

	private transient static Log log = LogFactory.getLog(Cm2ContractSVImpl.class);

	public IBoCmCustSegmentValue[] getCustSegment4DK(int CustType) throws Exception {
		List<IBoCmCustSegmentValue> list = new ArrayList<IBoCmCustSegmentValue>();
		ICmCustSegmentSV sv = (ICmCustSegmentSV) ServiceFactory.getService(ICmCustSegmentSV.class);
		IBoCmCustSegmentValue[] valSegmentValues = null;
		if (CustType == CmConstants.CustomerType.INDIVIDUAL) {// 个人客户细分
			valSegmentValues = sv.querySegmentByParentIdfromCache(-1, null, 1, null);
			if (valSegmentValues != null && valSegmentValues.length > 0) {
				for (int i = 0; i < valSegmentValues.length; i++) {
					list.add(valSegmentValues[i]);
				}
			}
		} else if (CustType == CmConstants.CustomerType.GROUP) {// 集团客户细分
			valSegmentValues = sv.querySegmentByParentIdfromCache(-1, null, 2, null);
			if (valSegmentValues != null && valSegmentValues.length > 0) {
				for (int i = 0; i < valSegmentValues.length; i++) {
					list.add(valSegmentValues[i]);
				}
			}
		} else {// 所有细分
			long[] vals = new long[] { 1, 2 };
			for (int x = 0; x < vals.length; x++) {
				valSegmentValues = sv.querySegmentByParentIdfromCache(-1, null, vals[x], null);
				if (valSegmentValues != null && valSegmentValues.length > 0) {
					for (int i = 0; i < valSegmentValues.length; i++) {
						list.add(valSegmentValues[i]);
					}
				}
			}
		}
		if (!list.isEmpty()) {
			return list.toArray(new IBoCmCustSegmentValue[0]);
		}

		return null;
	}

	@Override
	public ICustomerValue getCustByCertCode4DK(String cprNumber, String kobNumber, int custType) throws Exception {
		ICmCustomerSV sv = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		DataContainer dContainer = new DataContainer();
		if (custType == 1) {// 查询个人客户信息
			if (StringUtils.isBlank(cprNumber)) {
				ExceptionUtil.throwBusinessException("CMS95000021");
			}
			dContainer.set("CUST_TYPE", 1);
			dContainer.set("CUST_CERT_TYPE", 8);
			dContainer.set("CUST_CERT_CODE", cprNumber);

		} else if (custType == 3) {// 查询集团客户信息
			if (StringUtils.isBlank(kobNumber)) {
				ExceptionUtil.throwBusinessException("CMS95000021");
			}
			dContainer.set("CUST_TYPE", 3);
			dContainer.set("CUST_CERT_TYPE", 17);
			dContainer.set("CUST_CERT_CODE", kobNumber);
		} else {
			return null;
		}
		ICustomerValue[] vaCustomerValues = sv.queryCustomers(dContainer, -1, -1);
		if (vaCustomerValues != null && vaCustomerValues.length > 0) {
			return vaCustomerValues[0];
		}
		return null;
	}

	public IQBOCmCustContMediumAndTypeValue[] queryCustContactMediums(long custId) throws Exception {
		ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		IQBOCmCustContMediumAndTypeValue[] custContMediums = customerSV.queryCustElectronicMediumForPage(custId, -1, -1);
		if (custContMediums != null && custContMediums.length > 0) {
			return custContMediums;
		}
		return new IQBOCmCustContMediumAndTypeValue[0];
	}

	public IAccountValue[] queryAcctsById(long custId) throws Exception {
		return CmServiceFactory.getAccountSV().queryAcctsById(-1, custId, -1, -1);
	}

	public IAcctBillCycleValue queryCurrAcctBillCyclesByAcctId(long acctId) throws Exception {
		return CmServiceFactory.getAccountSV().queryCurrAcctBillCyclesByAcctId(acctId);
	}

	public IContactValue[] queryCustomerContacts(long custId) throws Exception {
		ICmDkCustomerSV dkCustomerSV = (ICmDkCustomerSV) ServiceFactory.getService(ICmDkCustomerSV.class);
		int[] contType = CmConstants.GroupContType.NORMAL_CONTACT;
		IContactValue[] contactVals = null;
		List<IContactValue> ContactList = new ArrayList<IContactValue>();
		for (int i = 0; i < contType.length; i++) {
			contactVals = dkCustomerSV.queryCustomerContacts(custId, contType[i]);
			if (contactVals != null && contactVals.length > 0) {
				for (int m = 0; m < contactVals.length; m++) {
					ContactList.add(contactVals[m]);
				}
			}
		}
		if (!ContactList.isEmpty()) {
			return (IContactValue[]) ContactList.toArray(new IContactValue[0]);
		}
		return contactVals;
	}

	public ICustomerValue queryGroupCompanyStatus(long custId) throws Exception {
		ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
		DataContainer conditionDC = new DataContainer();
		conditionDC.set(ICustomerValue.S_CustId, custId);
		ICustomerValue[] customerValues = customerSV.queryCustomers(conditionDC, -1, -1);
		if (customerValues != null && customerValues.length > 0) {
			return customerValues[0];
		}
		return null;
	}

	@Override
	public IAccountProfileValue getAccountById(long acctId, String reginId) throws Exception {
		if (reginId == null) {
			reginId = CmCommonUtil.getDefaultRegionId();
		}
		ICmAccountSV sv = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		IAccountProfileValue[] vals = sv.queryAcctDtsByIds(new long[] { acctId }, reginId);
		if (vals != null && vals.length > 0) {
			return vals[0];
		}
		return null;
	}

	public ICustomerValue[] queryCompetitorCustomer() throws Exception {
		ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
		DataContainer conditionDC = new DataContainer();
		conditionDC.set(ICustomerValue.S_CustType, CmConstants.CustomerType.GROUP);
		conditionDC.set(ICustomerValue.S_GroupType, CmConstants.GroupType.COMPETITOR);
		ICustomerValue[] customerValues = customerSV.queryCustomers(conditionDC, -1, -1);
		if (customerValues != null && customerValues.length > 0) {
			return customerValues;
		}
		return null;
	}

	@Override
	public void changeBillCycleFromAgr(long agreementId, String billCycle) throws Exception {
		ICmAccountSV acctSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		// 通知billing插入工单
		IVOAccountValue accountValue = new VOAccountBean();
		accountValue.setEffectiveType(1);
		IBOCmCustAcctRelValue[] custAcctRelValue = queryAccountByAgreementId(agreementId);
		if (!CmCommonUtil.isNotEmptyObject(custAcctRelValue)) {
			log.error("Can not Find Account Information By Aggremment ID !");
			return;
			// throw new Exception("Can not Find Account Information By Aggremment ID !");
		}

		for (int i = 0; i < custAcctRelValue.length; i++) {
			//TELENOR_DEFECT_20170922_0002 When correct billing cycle base on agreement, it only correct the billing cycle for acct with active and dunning status
			IAccountValue acct = acctSV.queryAccountById(custAcctRelValue[i].getAcctId());
			if(acct == null){
				continue;
			}
			if(!CmConstants.RecordState.USE.equals(acct.getState()) || (acct.getAcctStatus()!=CmConstants.AccountStatus.NORMAL && acct.getAcctStatus()!=CmConstants.AccountStatus.DUNING)){
				continue;
			}
			IAcctBillCycleValue cycleValue = new AcctBillCycleBean();
			cycleValue.copy(custAcctRelValue[i]);
			cycleValue.setCycleType(DataType.getAsInt(billCycle) == 1 ? 5 : 6);
			if ("3".equals(billCycle)) {
				cycleValue.setBillDay(1);
			} else {
				cycleValue.setBillDay(11);
			}

			// 计算生效时间和失效时间
			// 账期类型5是月6是季度
			long date;
			if (custAcctRelValue[i].getCycleType() == 5) {
				date = CmCommonUtil.getLastDayOfQuarterOrMonth(2, new Date()).getTime();
			} else if (custAcctRelValue[i].getBillDay() == 1) {
				date = CmCommonUtil.getLastDayOfQuarterOrMonth(1, new Date()).getTime();
			} else {
				date = CmCommonUtil.getLastDayOfQuarterOrMonth(3, new Date()).getTime();
			}

			Timestamp effDate = new Timestamp(TimeUtil.getTruncDate(TimeUtil.addOrMinusDays(date, DataType.getAsInt(custAcctRelValue[i].getBillDay()))).getTime());
			cycleValue.setEffectiveDate(effDate);
			cycleValue.setExpireDate(TimeUtil.getMaxExpire());
			accountValue.setBillCycle(cycleValue);
			// 插入请求工单

			ICmPsTaskSV taskSV = (ICmPsTaskSV) ServiceFactory.getService(ICmPsTaskSV.class);
			IBOCmPsTaskDealValue[] taskValue = taskSV.queryTask(5, custAcctRelValue[i].getAcctId(), "U", null);
			if (CmCommonUtil.isNotEmptyObject(taskValue)) {
				// 修改工单
				StringBuilder sb = new StringBuilder();
				sb.append("MODIFY,");
				sb.append(cycleValue.getCycleType()).append(",");
				sb.append(cycleValue.getBillDay()).append(",");
				taskValue[0].setTaskParam(sb.toString());
				taskValue[0].setEffectiveDate(cycleValue.getEffectiveDate());
				taskValue[0].initProperty(IBOCmPsTaskDealValue.S_RegionId, CmCommonUtil.getDefaultRegionId());
				CmInnerServiceFactory.getCommonInnerSV().saveBean((DataContainerInterface) taskValue[0]);

			} else {
				// 插入新数据
				BOCmPsTaskDealBean value = new BOCmPsTaskDealBean();
				value.setTaskId(CmCommonUtil.getNewSequence(BOCmPsTaskDealBean.class));
				value.setTaskType(5);
				value.setEntityId(custAcctRelValue[i].getAcctId());
				value.setEffectiveDate(cycleValue.getEffectiveDate());
				value.setState("U");
				StringBuilder sb = new StringBuilder();
				sb.append("MODIFY,");
				sb.append(cycleValue.getCycleType()).append(",");
				sb.append(cycleValue.getBillDay());
				value.setTaskParam(sb.toString());
				CmInnerServiceFactory.getCommonInnerSV().saveBean(value);

			}
		}
		// 通知计费接口
		updateAccountSend(accountValue);

	}
	
	public void changeBillCycleFromAgrAndAcctId(long agreementId,long acctId, String billCycle) throws Exception {
		ICmAccountSV acctSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		// 通知billing插入工单
		IVOAccountValue accountValue = new VOAccountBean();
		accountValue.setEffectiveType(1);
		IBOCmCustAcctRelValue[] custAcctRelValue = queryAccountByAgreementIdAndAcctId(agreementId, acctId);
		if (!CmCommonUtil.isNotEmptyObject(custAcctRelValue)) {
			log.error("Can not Find Account Information By Aggremment ID !");
			return;
			// throw new Exception("Can not Find Account Information By Aggremment ID !");
		}
		
		for (int i = 0; i < custAcctRelValue.length; i++) {
			//TELENOR_DEFECT_20170922_0002 When correct billing cycle base on agreement, it only correct the billing cycle for acct with active and dunning status
			IAccountValue acct = acctSV.queryAccountById(custAcctRelValue[i].getAcctId());
			if(acct == null){
				continue;
			}
			if(!CmConstants.RecordState.USE.equals(acct.getState()) || (acct.getAcctStatus()!=CmConstants.AccountStatus.NORMAL && acct.getAcctStatus()!=CmConstants.AccountStatus.DUNING)){
				continue;
			}
			IAcctBillCycleValue cycleValue = new AcctBillCycleBean();
			cycleValue.copy(custAcctRelValue[i]);
			cycleValue.setCycleType(DataType.getAsInt(billCycle) == 1 ? 5 : 6);
			if ("3".equals(billCycle)) {
				cycleValue.setBillDay(1);
			} else {
				cycleValue.setBillDay(11);
			}
			
			// 计算生效时间和失效时间
			// 账期类型5是月6是季度
			long date;
			if (custAcctRelValue[i].getCycleType() == 5) {
				date = CmCommonUtil.getLastDayOfQuarterOrMonth(2, new Date()).getTime();
			} else if (custAcctRelValue[i].getBillDay() == 1) {
				date = CmCommonUtil.getLastDayOfQuarterOrMonth(1, new Date()).getTime();
			} else {
				date = CmCommonUtil.getLastDayOfQuarterOrMonth(3, new Date()).getTime();
			}
			
			Timestamp effDate = new Timestamp(TimeUtil.getTruncDate(TimeUtil.addOrMinusDays(date, DataType.getAsInt(custAcctRelValue[i].getBillDay()))).getTime());
			cycleValue.setEffectiveDate(effDate);
			cycleValue.setExpireDate(TimeUtil.getMaxExpire());
			accountValue.setBillCycle(cycleValue);
			// 插入请求工单
			
			ICmPsTaskSV taskSV = (ICmPsTaskSV) ServiceFactory.getService(ICmPsTaskSV.class);
			IBOCmPsTaskDealValue[] taskValue = taskSV.queryTask(5, custAcctRelValue[i].getAcctId(), "U", null);
			if (CmCommonUtil.isNotEmptyObject(taskValue)) {
				// 修改工单
				StringBuilder sb = new StringBuilder();
				sb.append("MODIFY,");
				sb.append(cycleValue.getCycleType()).append(",");
				sb.append(cycleValue.getBillDay()).append(",");
				taskValue[0].setTaskParam(sb.toString());
				taskValue[0].setEffectiveDate(cycleValue.getEffectiveDate());
				taskValue[0].initProperty(IBOCmPsTaskDealValue.S_RegionId, CmCommonUtil.getDefaultRegionId());
				CmInnerServiceFactory.getCommonInnerSV().saveBean((DataContainerInterface) taskValue[0]);
				
			} else {
				// 插入新数据
				BOCmPsTaskDealBean value = new BOCmPsTaskDealBean();
				value.setTaskId(CmCommonUtil.getNewSequence(BOCmPsTaskDealBean.class));
				value.setTaskType(5);
				value.setEntityId(custAcctRelValue[i].getAcctId());
				value.setEffectiveDate(cycleValue.getEffectiveDate());
				value.setState("U");
				StringBuilder sb = new StringBuilder();
				sb.append("MODIFY,");
				sb.append(cycleValue.getCycleType()).append(",");
				sb.append(cycleValue.getBillDay());
				value.setTaskParam(sb.toString());
				CmInnerServiceFactory.getCommonInnerSV().saveBean(value);
				
			}
		}
		// 通知计费接口
		updateAccountSend(accountValue);
		
	}

	@Override
	public IBOCmCustAcctRelValue[] queryAccountByAgreementId(long agreementId) throws Exception {
		ICmAccountSV acctSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		return acctSV.queryCustAcctRel(-1, -1, null, -1, -1, -1, null, -1, -1, null, String.valueOf(agreementId));

	}
	
	public IBOCmCustAcctRelValue[] queryAccountByAgreementIdAndAcctId(long agreementId,long acctId) throws Exception {
		ICmAccountSV acctSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		return acctSV.queryCustAcctRel(-1, acctId, null, -1, -1, -1, null, -1, -1, null, String.valueOf(agreementId));
		
	}
	
	@Override
	public IBOCmCustAcctRelValue[] queryAccountByAgreementId(long agreementId, int start, int end) throws Exception {
		ICmAccountSV acctSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		return acctSV.queryCustAcctRel(-1, -1, null, -1, -1, -1, null, start, end, null, String.valueOf(agreementId));

	}
	
	@Override
	public int queryAccountByAgreementIdCount(long agreementId) throws Exception {
		ICmAccountSV acctSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		return acctSV.queryCustAcctRelCount(-1, -1, null, -1, -1, -1, null,null, String.valueOf(agreementId));

	}

	@Override
	public void deleteAccountRelaByAgreementId(long agreementId) throws Exception {
		// 通知billing插入工单
		IVOAccountValue accountValue = new VOAccountBean();
		accountValue.setEffectiveType(1);
		ICmAccountSV acctSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		IBOCmCustAcctRelValue[] custAcctRelValue = queryAccountByAgreementId(agreementId);

		if (!CmCommonUtil.isNotEmptyObject(custAcctRelValue)) {
			log.error("Can not Find Account Information By Agreement ID !");
			return;
		}

		for (int i = 0; i < custAcctRelValue.length; i++) {
			//TELENOR_DEFECT_20170922_0002 When correct billing cycle base on agreement, it only correct the billing cycle for acct with active and dunning status
			IAccountValue acct = acctSV.queryAccountById(custAcctRelValue[i].getAcctId());
			if(acct == null){
				continue;
			}
			//AI-11906 fix by tanyan 20220414
			if(!CmConstants.RecordState.USE.equals(acct.getState()) || (acct.getAcctStatus()!=CmConstants.AccountStatus.NORMAL && acct.getAcctStatus()!=CmConstants.AccountStatus.DUNING)){
				log.error("no need send to billing. acctId:"+acct.getAcctId());
				continue;
			}
			
			IVOAccountValue Voacct = new VOAccountBean();
			IAcctBillCycleValue[] billCycleValue = acctSV.queryAcctBillCyclesByAcctId(custAcctRelValue[i].getAcctId());
			if (CmCommonUtil.isNotEmptyObject(billCycleValue)) {
				// 修改账期
				billCycleValue[0].setBillDueDate(0);
				Voacct.setBillCycle(billCycleValue[0]);
			}
			// 账户信息
			IAccountValue acctValue = acctSV.queryAccountById(custAcctRelValue[i].getAcctId());
			// 清空合同号
			acctValue.setAcctPassword(null);
			Voacct.setAccount(acctValue);
			acctSV.saveAccount(Voacct);
			
			// 计算生效时间和失效时间
			// 账期类型5是月6是季度
			long date;
			if (custAcctRelValue[i].getCycleType() == 5) {
				date = CmCommonUtil.getLastDayOfQuarterOrMonth(2, new Date()).getTime();
			} else if (custAcctRelValue[i].getBillDay() == 1) {
				date = CmCommonUtil.getLastDayOfQuarterOrMonth(1, new Date()).getTime();
			} else {
				date = CmCommonUtil.getLastDayOfQuarterOrMonth(3, new Date()).getTime();
			}
			Timestamp effDate = new Timestamp(TimeUtil.getTruncDate(TimeUtil.addOrMinusDays(date, DataType.getAsInt(custAcctRelValue[i].getBillDay()))).getTime());

			// 同步合同和账户的关系
			IAcctAgreemnetRelValue acctAgrRel = new AcctAgreemnetRelBean();
			acctAgrRel.setAgreementId(agreementId);
			acctAgrRel.setAcctId(custAcctRelValue[i].getAcctId());
			acctAgrRel.setTenantId(ServiceManager.getUser().getTenantId());
			acctAgrRel.setCommitDate(custAcctRelValue[i].getDoneDate());
			acctAgrRel.setValidDate(custAcctRelValue[i].getEffectiveDate());
			acctAgrRel.setExtAttr("EXPIRE_DATE", effDate);
			// 删除
			acctAgrRel.setOperType(AcctAgreemnetRelBean.DELETE);
			accountValue.addAcctAgrRelValue(acctAgrRel);
			log.error("need send to billing. acctId:"+acct.getAcctId());
			// 账期默认按月11号
			IAcctBillCycleValue cycleValue = new AcctBillCycleBean();
			cycleValue.copy(custAcctRelValue[i]);
			cycleValue.setCycleType(5);
			cycleValue.setBillDay(11);
			cycleValue.setEffectiveDate(effDate);
			// 出账日设为空
			cycleValue.setBillDueDate(0);
			cycleValue.setExpireDate(TimeUtil.getMaxExpire());
			accountValue.setBillCycle(cycleValue);
			// 插入请求工单

			ICmPsTaskSV taskSV = (ICmPsTaskSV) ServiceFactory.getService(ICmPsTaskSV.class);
			IBOCmPsTaskDealValue[] taskValue = taskSV.queryTask(5, custAcctRelValue[i].getAcctId(), "U", null);
			if (CmCommonUtil.isNotEmptyObject(taskValue)) {
				// 修改工单,删除总是回复默认账期
				StringBuilder sb = new StringBuilder();
				sb.append("DELETE,5,11");
				taskValue[0].setTaskParam(sb.toString());
				taskValue[0].setEffectiveDate(cycleValue.getEffectiveDate());
				taskValue[0].initProperty(IBOCmPsTaskDealValue.S_RegionId, CmCommonUtil.getDefaultRegionId());
				CmInnerServiceFactory.getCommonInnerSV().saveBean((DataContainerInterface) taskValue[0]);

			} else {
				// 插入新数据
				BOCmPsTaskDealBean value = new BOCmPsTaskDealBean();
				value.setTaskId(CmCommonUtil.getNewSequence(BOCmPsTaskDealBean.class));
				value.setTaskType(5);
				value.setEntityId(custAcctRelValue[i].getAcctId());
				value.setEffectiveDate(cycleValue.getEffectiveDate());
				value.setState("U");
				StringBuilder sb = new StringBuilder();
				sb.append("DELETE,5,11");
				value.setTaskParam(sb.toString());
				CmInnerServiceFactory.getCommonInnerSV().saveBean(value);

			}
		}
		// 通知计费接口
		updateAccountSend(accountValue);

	}

	public static void main(String[] args) throws Exception {
		ServiceManager.setServiceUserInfo(CmCommonUtil.getDefaultUser());
		Cm2ContractSVImpl a = new Cm2ContractSVImpl();
		a.deleteAccountRelaByAgreementId(3000598670L, -1);
	}

	/**
	 * 只有客管内部修改账户才上发
	 * @throws Exception
	 */
	private void updateAccountSend(IVOAccountValue accountValue) throws Exception {
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

	@Override
	public void changeB2BLifeCycle(long custId, long agreementId, long agreementStatus) throws Exception {
		com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICmCustomerSV cmCustomerSV = (com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICmCustomerSV) ServiceFactory
				.getService(com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICmCustomerSV.class);
		if (agreementStatus == 1) {
			// 合同签字,激活集团客户为在网
			cmCustomerSV.saveCmLifeCycle(-1, custId, -1, 2);
		} else if (agreementStatus == 2) {
			// 删除账户与合同的关系，并变更账户的账期为(Month 11)
			ICm2ContractSV cm2ContractSV = (ICm2ContractSV) ServiceFactory.getService(ICm2ContractSV.class);
			cm2ContractSV.deleteAccountRelaByAgreementId(agreementId);

			// 判断当前客户下是否还有有效的合同
			IAgreementFSV fservice = (IAgreementFSV) ServiceFactory.getService(IAgreementFSV.class);
			DataContainer[] dc = fservice.getB2BAgreementListForOSByCond(custId, "", "", 0L, null, null);
			if (null == dc || dc.length == 0) {
				// 过期或终止,变更集团为离网
				try{
					cmCustomerSV.saveCmLifeCycle(-1, custId, -1, 8);
				}catch(Exception e){
					e.printStackTrace();
					log.error(e);
				}
				
			}
		} else {
			// do nothing
		}

	}

	@Override
	public IBOCmCustAcctRelValue[] queryAccountByAgreementId(long agreementId, int acctType) throws Exception {
		ICmAccountSV acctSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		return acctSV.queryCustAcctRel(-1, -1, null, acctType, -1, -1, null, -1, -1, null, String.valueOf(agreementId));
	}

	@Override
	public void deleteAccountRelaByAgreementId(long agreementId, long custId) throws Exception {
		// 通知billing插入工单
		IVOAccountValue accountValue = new VOAccountBean();
		accountValue.setEffectiveType(1);
		ICmAccountSV acctSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		IBOCmCustAcctRelValue[] custAcctRelValue = acctSV.queryCustAcctRel(custId, -1, null, -1, -1, -1, null, -1, -1, null, String.valueOf(agreementId));
		
		if (!CmCommonUtil.isNotEmptyObject(custAcctRelValue)) {
			log.error("Can not Find Account Information By custId And Aggremment ID !");
			return;
		}

		for (int i = 0; i < custAcctRelValue.length; i++) {
			//TELENOR_DEFECT_20170922_0002 When correct billing cycle base on agreement, it only correct the billing cycle for acct with active and dunning status
			IAccountValue acct = acctSV.queryAccountById(custAcctRelValue[i].getAcctId());
			if(acct == null){
				continue;
			}
			//AI-11906 fix by tanyan 20220414
			if(!CmConstants.RecordState.USE.equals(acct.getState()) || (acct.getAcctStatus()!=CmConstants.AccountStatus.NORMAL && acct.getAcctStatus()!=CmConstants.AccountStatus.DUNING)){
				log.error("no need send to billing. acctId:"+acct.getAcctId());
				continue;
			}
			IVOAccountValue Voacct = new VOAccountBean();
			IAcctBillCycleValue[] billCycleValue = acctSV.queryAcctBillCyclesByAcctId(custAcctRelValue[i].getAcctId());
			if (CmCommonUtil.isNotEmptyObject(billCycleValue)) {
				// 修改账期
				billCycleValue[0].setBillDueDate(0);
				Voacct.setBillCycle(billCycleValue[0]);
			}
			// 账户信息
			IAccountValue acctValue = acctSV.queryAccountById(custAcctRelValue[i].getAcctId());
			Voacct.setAccount(acctValue);
			acctSV.saveAccount(Voacct);
			
			// 账期默认按月11号
			IAcctBillCycleValue cycleValue = new AcctBillCycleBean();
			cycleValue.copy(custAcctRelValue[i]);
			cycleValue.setCycleType(5);
			cycleValue.setBillDay(11);
			cycleValue.setBillDueDate(0);// 默认缴费日
			// 计算生效时间和失效时间
			// 账期类型5是月6是季度
			long date;
			if (custAcctRelValue[i].getCycleType() == 5) {
				date = CmCommonUtil.getLastDayOfQuarterOrMonth(2, new Date()).getTime();
			} else if (custAcctRelValue[i].getBillDay() == 1) {
				date = CmCommonUtil.getLastDayOfQuarterOrMonth(1, new Date()).getTime();
			} else {
				date = CmCommonUtil.getLastDayOfQuarterOrMonth(3, new Date()).getTime();
			}
			Timestamp effDate = new Timestamp(TimeUtil.getTruncDate(TimeUtil.addOrMinusDays(date, DataType.getAsInt(custAcctRelValue[i].getBillDay()))).getTime());
			cycleValue.setEffectiveDate(effDate);
			cycleValue.setExpireDate(TimeUtil.getMaxExpire());
			accountValue.setBillCycle(cycleValue);

			// 同步合同和账户的关系
			IAcctAgreemnetRelValue acctAgrRel = new AcctAgreemnetRelBean();
			acctAgrRel.setAgreementId(agreementId);
			acctAgrRel.setAcctId(custAcctRelValue[i].getAcctId());
			acctAgrRel.setTenantId(ServiceManager.getUser().getTenantId());
			acctAgrRel.setCommitDate(custAcctRelValue[i].getDoneDate());
			acctAgrRel.setValidDate(custAcctRelValue[i].getEffectiveDate());
			acctAgrRel.setExtAttr("EXPIRE_DATE", effDate);
			// 删除
			acctAgrRel.setOperType(AcctAgreemnetRelBean.DELETE);
			accountValue.addAcctAgrRelValue(acctAgrRel);

			// 插入请求工单

			ICmPsTaskSV taskSV = (ICmPsTaskSV) ServiceFactory.getService(ICmPsTaskSV.class);
			IBOCmPsTaskDealValue[] taskValue = taskSV.queryTask(5, custAcctRelValue[i].getAcctId(), "U", null);
			if (CmCommonUtil.isNotEmptyObject(taskValue)) {
				// 修改工单,删除总是回复默认账期
				StringBuilder sb = new StringBuilder();
				sb.append("DELETE,5,11");
				taskValue[0].setTaskParam(sb.toString());
				taskValue[0].setEffectiveDate(cycleValue.getEffectiveDate());
				taskValue[0].initProperty(IBOCmPsTaskDealValue.S_RegionId, CmCommonUtil.getDefaultRegionId());
				CmInnerServiceFactory.getCommonInnerSV().saveBean((DataContainerInterface) taskValue[0]);

			} else {
				// 插入新数据
				BOCmPsTaskDealBean value = new BOCmPsTaskDealBean();
				value.setTaskId(CmCommonUtil.getNewSequence(BOCmPsTaskDealBean.class));
				value.setTaskType(5);
				value.setEntityId(custAcctRelValue[i].getAcctId());
				value.setEffectiveDate(cycleValue.getEffectiveDate());
				value.setState("U");
				StringBuilder sb = new StringBuilder();
				sb.append("DELETE,5,11");
				value.setTaskParam(sb.toString());
				CmInnerServiceFactory.getCommonInnerSV().saveBean(value);

			}
		}
		// 通知计费接口
		updateAccountSend(accountValue);

	}

	@Override
	public void changePaymentTermsFromAgr(long agreementId, long paymentTerms) throws Exception {
		ICmAccountSV acctSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		IBOCmCustAcctRelValue[] custAcctRelValue = acctSV.queryCustAcctRel(-1, -1, null, -1, -1, -1, null, -1, -1, null, String.valueOf(agreementId));
		if (CmCommonUtil.isNotEmptyObject(custAcctRelValue)) {
			for (int i = 0; i < custAcctRelValue.length; i++) {
				//TELENOR_DEFECT_20170922_0002 When correct billing cycle base on agreement, it only correct the billing cycle for acct with active and dunning status
				IAccountValue acct = acctSV.queryAccountById(custAcctRelValue[i].getAcctId());
				if(acct == null){
					continue;
				}
				if(!CmConstants.RecordState.USE.equals(acct.getState()) || (acct.getAcctStatus()!=CmConstants.AccountStatus.NORMAL && acct.getAcctStatus()!=CmConstants.AccountStatus.DUNING)){
					continue;
				}
				IVOAccountValue Voacct = new VOAccountBean();
				IAcctBillCycleValue[] billCycleValue = acctSV.queryAcctBillCyclesByAcctId(custAcctRelValue[i].getAcctId());
				if (CmCommonUtil.isNotEmptyObject(billCycleValue)) {
					// 修改账期
					billCycleValue[0].setBillDueDate(paymentTerms);
					Voacct.setBillCycle(billCycleValue[0]);
				}
				// 账户信息
				IAccountValue acctValue = acctSV.queryAccountById(custAcctRelValue[i].getAcctId());
				Voacct.setAccount(acctValue);
				acctSV.saveAccount(Voacct);
			}
		}
	}
	
	/**
	 * 合同变更paymentTerms
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2019-1-23
	* ICm2ContractSV
	 */
	public void changePaymentTermsFromAgrAndAcctId(long agreementId,long acctId, long paymentTerms) throws Exception {
		ICmAccountSV acctSV = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
		IBOCmCustAcctRelValue[] custAcctRelValue = acctSV.queryCustAcctRel(-1, acctId, null, -1, -1, -1, null, -1, -1, null, String.valueOf(agreementId));
		if (CmCommonUtil.isNotEmptyObject(custAcctRelValue)) {
			for (int i = 0; i < custAcctRelValue.length; i++) {
				//TELENOR_DEFECT_20170922_0002 When correct billing cycle base on agreement, it only correct the billing cycle for acct with active and dunning status
				IAccountValue acct = acctSV.queryAccountById(custAcctRelValue[i].getAcctId());
				if(acct == null){
					continue;
				}
				if(!CmConstants.RecordState.USE.equals(acct.getState()) || (acct.getAcctStatus()!=CmConstants.AccountStatus.NORMAL && acct.getAcctStatus()!=CmConstants.AccountStatus.DUNING)){
					continue;
				}
				IVOAccountValue Voacct = new VOAccountBean();
				IAcctBillCycleValue[] billCycleValue = acctSV.queryAcctBillCyclesByAcctId(custAcctRelValue[i].getAcctId());
				if (CmCommonUtil.isNotEmptyObject(billCycleValue)) {
					// 修改账期
					billCycleValue[0].setBillDueDate(paymentTerms);
					Voacct.setBillCycle(billCycleValue[0]);
				}
				// 账户信息
				IAccountValue acctValue = acctSV.queryAccountById(custAcctRelValue[i].getAcctId());
				Voacct.setAccount(acctValue);
				acctSV.saveAccount(Voacct);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICm2ContractSV#maskCustomerInfo(com.ai.appframe2.common
	 * .DataContainerInterface)
	 */
	public DataContainerInterface maskCustomerInfo(DataContainerInterface dc) throws Exception {
		try {
			if (dc != null) {
				String certType = dc.getAsString("CUST_CERT_TYPE");
				if (StringUtils.isNotBlank(certType)) {
					if (String.valueOf(CmConstants.CustIdenType.CPR).equalsIgnoreCase(certType)) {
						// 单独对CPRNumber进行模糊化
						String certValue = dc.getAsString("CUST_CERT_CODE");
						int valueLength = certValue.length();
						if (valueLength > 6) {
							StringBuilder sb = new StringBuilder(valueLength);
							sb.append(certValue.substring(0, 6));
							for (int i = 0; i < valueLength - 6; i++) {
								sb.append("*");
							}
							dc.set("CUST_CERT_CODE", sb.toString());
						}
					}
				}
			}
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return dc;
	}

}
