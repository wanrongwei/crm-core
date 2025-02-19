package com.asiainfo.crm.cm.busimodel.impl.defaults;

import java.util.ArrayList;
import java.util.List;

import com.ai.appframe2.bo.DataContainerFactory;
import com.ai.appframe2.common.DataStructInterface;
import com.ai.appframe2.complex.tab.split.TenantIDFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.busimodel.impl.account.AbstractAccountDealModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmConstants.TenantId;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.account.bo.BOCmCustAcctRelBean;
import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmCustAcctRelValue;
import com.asiainfo.crm.cm.inner.log.bo.BOCmHisRecordBean;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCycleValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctPaymentValue;
import com.asiainfo.crm.cm.model.ivalues.IVOAccountValue;
import com.asiainfo.crm.cm.service.interfaces.ICmBusiLogSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ICmTeamInvokeSV;
import com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICm2SoSV;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 账户处理的默认继承类，提供创建类对象使用
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author zhangyin
 * @date 2012-4-11 下午1:16:29
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-4-11     zhangyin           v1.0.0               修改原因<br>
 */
public class DefaultAccountDealModelImpl extends AbstractAccountDealModelImpl {

	public void processAfterDeal(IVOAccountValue acctValue) throws Exception {
		List valueList = new ArrayList();
		IAccountValue accountValue = acctValue.getAccount();
		if (accountValue != null && !accountValue.isNew()) {
			accountValue.setCreditValue(accountValue.getCreditValue() / 100);
			valueList.add(accountValue);
			if (acctValue.hasBillCustomizes()) {
				for (int i = 0; i < acctValue.getBillCustomizes().length; i++) {
					valueList.add(acctValue.getBillCustomizes()[i]);
				}
			}
			if (acctValue.hasBillCycle()) {
				for (int i = 0; i < acctValue.getBillCycles().length; i++) {
					valueList.add(acctValue.getBillCycles()[i]);
				}
			}
			if (acctValue.hasPayments()) {
				for (int i = 0; i < acctValue.getPayments().length; i++) {
					valueList.add(acctValue.getPayments()[i]);
				}
			}

			ICmBusiLogSV sv = (ICmBusiLogSV) ServiceFactory.getService(ICmBusiLogSV.class);
			BOCmHisRecordBean recordBean = sv.convertHisRecord((DataStructInterface[]) valueList.toArray(new DataStructInterface[0]), CmConstants.HisRecordType.ACCOUNT,
					accountValue.getAcctName(), accountValue.getAcctId());
			sv.saveHisRecord(recordBean);
		}
	}

	public void dealOtherThings(IVOAccountValue acctValue) throws Exception {
		// 更改账期将对象同步给 acctId，用户编号，必传 oldZhangqi，用户老账期，必传 newZhangqi，新账期
		// * validType，生效类型，1-立即生效，2-下月生效
		Object object = acctValue.getUserObject(CmLnConstants.EffectTyp.EFFTYPE);
		if (acctValue.hasBillCycle()) {
			if (object != null) {
				IAcctBillCycleValue[] billCycleValues = acctValue.getBillCycles();
				if (billCycleValues != null && billCycleValues.length > 1) {
					ICmTeamInvokeSV icmTeam = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
					icmTeam.updateInsDataForAcctZQChg(billCycleValues[billCycleValues.length - 1].getAcctId(), Integer.valueOf(billCycleValues[1].getBillDay()),
							Integer.valueOf(billCycleValues[0].getBillDay()), Integer.valueOf(acctValue.getUserObject(CmLnConstants.EffectTyp.EFFTYPE).toString()));
				}
			}

		}

		IAccountValue accountValue = acctValue.getAccount();
		long custId = -1;
		long acctId = -1;
		if (CmCommonUtil.isNotEmptyObject(accountValue)) {
			custId = accountValue.getCustId();
			acctId = accountValue.getAcctId();
			ICm2SoSV cm2SoSV = (ICm2SoSV) ServiceFactory.getService(ICm2SoSV.class);
			IBOCmCustAcctRelValue[] qryAcctRelValues = cm2SoSV.queryCsutAcctRel(-1, acctId, null, -1, -1, -1, null, -1, -1);
			// 不存在客户账户关系信息才新增
			if (CmCommonUtil.isEmptyObject(qryAcctRelValues)) {
				// 保存客户账户关系表
				IBOCmCustAcctRelValue custAcctRelValue = new BOCmCustAcctRelBean();
				custAcctRelValue.setAcctAliasName(accountValue.getAcctAliasName());
				custAcctRelValue.setCustType(CmCommonUtil.getCustType(custId));
				custAcctRelValue.setRelCustId(custId);
				custAcctRelValue.setAcctId(acctId);
				custAcctRelValue.setState(CmConstants.RecordState.TEMP);
				if (TenantIDFactory.getTenantId().equalsIgnoreCase(TenantId.TENANT_91)) {
					custAcctRelValue.setState(CmConstants.RecordState.USE);
				}
				custAcctRelValue.setRelType(CmConstants.AccountConstants.SELF_ACCT);
				custAcctRelValue.setRegionId(acctValue.getAccount().getRegionId());
				custAcctRelValue.setInstallmentFlag(acctValue.getAccount().getInstallmentFlag());
				custAcctRelValue.setAcctName(acctValue.getAccount().getAcctName());
				custAcctRelValue.setPayMethod(acctValue.getPayMethod());
				if (acctValue.getBillCycles() != null && acctValue.getBillCycles().length > 0) {
					custAcctRelValue.setBillDay(acctValue.getBillCycles()[0].getBillDay());
					custAcctRelValue.setBillDueDate(acctValue.getBillCycles()[0].getBillDueDate());
					custAcctRelValue.setCycleType(acctValue.getBillCycles()[0].getCycleType());
				}

				// 设置账户状态到ext1
				custAcctRelValue.setExt1(Integer.toString(acctValue.getAccount().getAcctStatus()));
				//设置合同号到ext3
				custAcctRelValue.setExt3(acctValue.getAccount().getAcctPassword());
				//effective_date
				custAcctRelValue.setEffectiveDate(acctValue.getAccount().getEffectiveDate());
				CmServiceFactory.getAccountSV().saveCustAcctRels(custAcctRelValue);
			} else {
				IBOCmCustAcctRelValue custAcctRelValue = new BOCmCustAcctRelBean();
				DataContainerFactory.copyNoClearData(qryAcctRelValues[0], custAcctRelValue);
				DataContainerFactory.copyNoClearData(accountValue, custAcctRelValue);
				custAcctRelValue.setRelCustId(accountValue.getCustId());
				custAcctRelValue.setExt1(Integer.toString(acctValue.getAccount().getAcctStatus()));
				custAcctRelValue.setExt3(acctValue.getAccount().getAcctPassword());
				if(acctValue.getPayMethod()!=-1){
					custAcctRelValue.setPayMethod(acctValue.getPayMethod());
				}
				
				if (acctValue.getBillCycles() != null && acctValue.getBillCycles().length > 0) {
					custAcctRelValue.setBillDueDate(acctValue.getBillCycles()[0].getBillDueDate());
					custAcctRelValue.setCycleType(acctValue.getBillCycles()[0].getCycleType());
					custAcctRelValue.setBillDay(acctValue.getBillCycles()[0].getBillDay());
				}
				custAcctRelValue.set(custAcctRelValue.S_CreateDate, custAcctRelValue.getOldObj(custAcctRelValue.S_CreateDate));
				CmServiceFactory.getAccountSV().saveCustAcctRels(custAcctRelValue);
			}
		}

	}

	@Override
	protected void processBeforeDeal(IVOAccountValue acctValue) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	protected void setPayMethod(IAcctPaymentValue acctPaymentValue, IVOAccountValue acctValue) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	protected void validateOther(IVOAccountValue acctValue) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	protected void validatePayMethod(IAcctPaymentValue iAcctPaymentValue, IVOAccountValue acctValue) throws Exception {
		// TODO Auto-generated method stub

	}

}
