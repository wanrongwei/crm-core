package com.asiainfo.crm.cm.support.bce.service.impl;

import java.lang.reflect.Method;
import java.rmi.RemoteException;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.bce.ivalues.IBceData;
import com.ai.bce.ivalues.IBceDealReturnData;
import com.ai.bce.util.BceUtil;
import com.ai.bce.valuebean.BceDealReturnDataBean;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.CenterUtil;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.StaticDataUtil;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.account.bo.BOCmCmxAcctPaymentAttrBean;
import com.asiainfo.crm.cm.ln.account.bo.BOCmCmxAcctPaymentAttrEngine;
import com.asiainfo.crm.cm.ln.account.ivalues.IBOCmCmxAcctPaymentAttrValue;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.model.bean.VOAccountBean;
import com.asiainfo.crm.cm.model.bo.AccountBean;
import com.asiainfo.crm.cm.model.bo.AcctBillCustomizeBean;
import com.asiainfo.crm.cm.model.bo.AcctBillCycleBean;
import com.asiainfo.crm.cm.model.bo.AcctPaymentBean;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCustomizeValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCycleValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctPaymentValue;
import com.asiainfo.crm.cm.model.ivalues.IVOAccountValue;
import com.asiainfo.crm.cm.service.interfaces.ICmAccountSV;
import com.asiainfo.crm.cm.support.bce.service.interfaces.ICmAccountBceDealSV;
import com.asiainfo.crm.cm.support.bce.util.CmBceSupportConstants;

public class CmAccountBceDealSVImpl implements ICmAccountBceDealSV {

	public IBceDealReturnData dealCreateAccount(IVOAccountValue voAccountValue, Long bceFrameId, String businessId) throws Exception {
		IBceDealReturnData returnData = new BceDealReturnDataBean();
		String success = BceUtil.STR_YES;
		String successMsg = "";
		// // 封装账期对象
		
		if (voAccountValue.hasBillCycle()) {
			IAcctBillCycleValue[] billCycleValues = voAccountValue.getBillCycles();
			for (int i = 0; i < billCycleValues.length; i++) {
				if (billCycleValues[i].getBillDueDate() == 0) {
					billCycleValues[i].setBillDueDate(0);
				}
			}
		}
		// 设置账户状态
		voAccountValue.setUserObject("OPER_TYPE", CmConstants.MODIFY_ACCT_MODEL.ACCT_OPER_TYPE_NEW);
		voAccountValue.setUserObject(CmConstants.MODIFY_ACCT_MODEL.MODIFY_ACCT_KEY, CmConstants.MODIFY_ACCT_MODEL.INNER_MODIFY);
		// 保存客户信息

		if (voAccountValue.getAccount() != null && voAccountValue.getAccount().getRegionId() != null) {
			//CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.REGION_ID, voAccountValue.getAccount().getRegionId());
		}

		CmServiceFactory.getAccountSV().saveAccount(voAccountValue);
		dealBankBehalfPhone(voAccountValue.getPayments());
		returnData.setIsSuccess(success);
		if (success.equals(BceUtil.STR_YES)) {
			if (voAccountValue.getAccount() != null) {
				// 新增账户成功，账户编号[{0}]。
				successMsg = CrmLocaleFactory.getResource("CMS0020097", String.valueOf(voAccountValue.getAccount().getAcctId()));
			}
			returnData.setSuccessMsg(successMsg);
		} else {
			returnData.setErrorMsg(successMsg);
		}
		return returnData;
	}

	public IBceDealReturnData dealModifyAccount(IVOAccountValue voAccountValue, Long bceFrameId, String businessId) throws Exception {
		IBceDealReturnData returnData = new BceDealReturnDataBean();
		String success = BceUtil.STR_YES;
		String successMsg = "";
		if (voAccountValue.hasBillCycle()) {// 修改账户的时候，如果账期类型是按日出账，必须给出账日设置默认值，否则会强转出错
			IAcctBillCycleValue[] billCycleValues = voAccountValue.getBillCycles();
			for (int i = 0; i < billCycleValues.length; i++) {
				if (billCycleValues[i].getCycleType() == 1) {
					billCycleValues[i].setBillDay(CmConstants.AcctBillCycleDay.DEFAULT_DAY);
				}
				if (billCycleValues[i].getBillDueDate() == 0) {
					billCycleValues[i].setBillDueDate(0);
				}
			}
		}
		if (null != voAccountValue.getAccount()) {

			// 设置账户状态
			voAccountValue.setUserObject("OPER_TYPE", CmConstants.MODIFY_ACCT_MODEL.ACCT_OPER_TYPE_MODIFY);
			voAccountValue.setUserObject(CmConstants.MODIFY_ACCT_MODEL.MODIFY_ACCT_KEY, CmConstants.MODIFY_ACCT_MODEL.INNER_MODIFY);
			if (voAccountValue.getAccount() != null && voAccountValue.getAccount().getRegionId() != null) {
				//CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.REGION_ID, voAccountValue.getAccount().getRegionId());
			}

			// 保存账户信息
			CmServiceFactory.getAccountSV().saveAccount(voAccountValue);
			dealBankBehalfPhone(voAccountValue.getPayments());
			returnData.setIsSuccess(success);
			if (success.equals(BceUtil.STR_YES)) {
				if (voAccountValue.getAccount() != null) {
					// 修改账户成功，账户编号[{0}]。
					successMsg = CrmLocaleFactory.getResource("CMS0020095", String.valueOf(voAccountValue.getAccount().getAcctId()));
				}
				returnData.setSuccessMsg(successMsg);
			} else {
				returnData.setErrorMsg(successMsg);
			}

		} else {
			ICmAccountSV sv = (ICmAccountSV) ServiceFactory.getService(ICmAccountSV.class);
			IAccountValue acctValue = sv.queryAccountById(voAccountValue.getBillCycles()[0].getAcctId());
			voAccountValue.setAccount(acctValue);

			// 设置账户状态
			voAccountValue.setUserObject("OPER_TYPE", CmConstants.MODIFY_ACCT_MODEL.ACCT_OPER_TYPE_MODIFY);
			voAccountValue.setUserObject(CmConstants.MODIFY_ACCT_MODEL.MODIFY_ACCT_KEY, CmConstants.MODIFY_ACCT_MODEL.INNER_MODIFY);
			if (null != acctValue && null != acctValue.getRegionId()) {
				//CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.REGION_ID, acctValue.getRegionId());
			}

			// 保存账户信息
			CmServiceFactory.getAccountSV().saveAccount(voAccountValue);
			dealBankBehalfPhone(voAccountValue.getPayments());
			returnData.setIsSuccess(success);
			if (success.equals(BceUtil.STR_YES)) {
				if (acctValue != null) {
					// 修改账户成功，账户编号[{0}]。
					successMsg = CrmLocaleFactory.getResource("CMS0020095", String.valueOf(acctValue.getAcctId()));
				}
				returnData.setSuccessMsg(successMsg);
			} else {
				returnData.setErrorMsg(successMsg);
			}

		}
		return returnData;
	}

	public IBceDealReturnData createCustomProperty(IBceData bceData, IBceDealReturnData bceDealReturnData) throws Exception, RemoteException {
		String[][] msg = new String[6][2];
		String aPreMsg = "";
		String busiName = "";
		aPreMsg += "[" + busiName + "].\n";
		String aIsSucc = bceDealReturnData.getIsSuccess();
		msg[0][0] = "IS_SUCCESS";
		msg[0][1] = "Y";

		if (BceUtil.STR_YES.equalsIgnoreCase(aIsSucc)) {
			msg[1][0] = "FLAG";
			msg[1][1] = "SUCCESS";
			msg[2][0] = "custId";
			msg[2][1] = bceData.getUserData(CmConstants.CommonPageParamName.CUST_ID);
			msg[4][0] = "MESSAGE";
			msg[4][1] = bceDealReturnData.getSuccessMsg();
			msg[5][0] = "isUseGo";
			msg[5][1] = BceUtil.STR_YES;
		} else {
			msg[1][0] = "FLAG";
			msg[1][1] = "ERROR";
			msg[4][0] = "MESSAGE";
			msg[4][1] = aPreMsg + bceDealReturnData.getErrorMsg();
		}
		bceDealReturnData.setCustomProperty(msg);
		return bceDealReturnData;
	}

	public IBceDealReturnData deal(IBceData bceData, long bceFrameId) throws Exception, RemoteException {
		// 获取业务编码
		String businessId = DataType.getAsString(bceData.getUserData(BceUtil.BUSIOPER_ID_KEY));
		if (StringUtils.isBlank(businessId)) {
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		// 从静态数据配置中获取业务编码与业务实现方法的映射关系的配置
		IBOBsStaticDataValue staticDataValue = StaticDataUtil.getStaticData(CmBceSupportConstants.CmStaticDataCodeType.CM_BCE_BUSINESSID_METHOD_MAPPING_KEY, businessId);
		if (staticDataValue == null) {
			// 系统没有配置业务编码与业务实现方法的映射关系
			ExceptionUtil.throwBusinessException("CMS0010047");
		}
		String methodName = staticDataValue.getCodeName();
		// 通过反射的机制动态执行对应的方法
		Method method = getClass().getMethod(methodName, new Class[] { IVOAccountValue.class, Long.class, String.class });
		if (method == null) {
			// 没有找到对应的方法
			ExceptionUtil.throwBusinessException("CMS0010048");
		}
		// 将前台传入的数据集转换成客户大对象
		IVOAccountValue voAccountValue = getCustValueFromBceData(bceData, bceFrameId, businessId);
		// 调用具体的方法处理业务
		IBceDealReturnData returnData = (IBceDealReturnData) method.invoke(this, new Object[] { voAccountValue, bceFrameId, businessId });
		bceData.addUserData(CmConstants.CommonPageParamName.CUST_ID, String.valueOf(voAccountValue.getAcctId()));
		return returnData;
	}

	public void dealBankBehalfPhone(IAcctPaymentValue[] values) throws Exception, RemoteException {
		for (IAcctPaymentValue value : values) {
			Object phone = value.getExtAttr("BANK_BEHALF_PHONE");
			BOCmCmxAcctPaymentAttrBean acctPaymentAttr = new BOCmCmxAcctPaymentAttrBean();
			if (value.isNew()) {
				if (phone == null || "".equals(phone.toString()))
					continue;
				acctPaymentAttr.set(IBOCmCmxAcctPaymentAttrValue.S_AttrValue, phone.toString());
				acctPaymentAttr.set(IBOCmCmxAcctPaymentAttrValue.S_State, CmConstants.RecordState.USE);
				acctPaymentAttr.set(IBOCmCmxAcctPaymentAttrValue.S_PaymentId, value.getPaymentId());
				acctPaymentAttr.set(IBOCmCmxAcctPaymentAttrValue.S_AttrCode, CmLnConstants.PaymentAttr.BankBehalfPhone);
				CmInnerServiceFactory.getCommonInnerSV().saveBean(acctPaymentAttr);
			} else if (value.isDeleted()) {
				acctPaymentAttr.initProperty(IBOCmCmxAcctPaymentAttrValue.S_PaymentId, value.getPaymentId());
				acctPaymentAttr.initProperty(IBOCmCmxAcctPaymentAttrValue.S_AttrCode, CmLnConstants.PaymentAttr.BankBehalfPhone);
				acctPaymentAttr.delete();
				CmInnerServiceFactory.getCommonInnerSV().saveBean(acctPaymentAttr);
				continue;
			} else if (value.isModified()) {
				if (phone == null || "".equals(phone.toString())) {
					acctPaymentAttr.initProperty(IBOCmCmxAcctPaymentAttrValue.S_PaymentId, value.getPaymentId());
					acctPaymentAttr.initProperty(IBOCmCmxAcctPaymentAttrValue.S_AttrCode, CmLnConstants.PaymentAttr.BankBehalfPhone);
					acctPaymentAttr.delete();
					CmInnerServiceFactory.getCommonInnerSV().saveBean(acctPaymentAttr);
					continue;
				}
				acctPaymentAttr = BOCmCmxAcctPaymentAttrEngine.getBean(CmLnConstants.PaymentAttr.BankBehalfPhone, value.getPaymentId());
				acctPaymentAttr.set(IBOCmCmxAcctPaymentAttrValue.S_AttrValue, phone.toString());
				acctPaymentAttr.set(IBOCmCmxAcctPaymentAttrValue.S_State, CmConstants.RecordState.USE);
				CmInnerServiceFactory.getCommonInnerSV().saveBean(acctPaymentAttr);
			} else {
				if (phone == null || "".equals(phone.toString())) {
					acctPaymentAttr.initProperty(IBOCmCmxAcctPaymentAttrValue.S_PaymentId, value.getPaymentId());
					acctPaymentAttr.initProperty(IBOCmCmxAcctPaymentAttrValue.S_AttrCode, CmLnConstants.PaymentAttr.BankBehalfPhone);
					acctPaymentAttr.delete();
					CmInnerServiceFactory.getCommonInnerSV().saveBean(acctPaymentAttr);
				} else {
					acctPaymentAttr = BOCmCmxAcctPaymentAttrEngine.getBean(CmLnConstants.PaymentAttr.BankBehalfPhone, value.getPaymentId());
					acctPaymentAttr.set(IBOCmCmxAcctPaymentAttrValue.S_AttrValue, phone.toString());
					acctPaymentAttr.set(IBOCmCmxAcctPaymentAttrValue.S_State, CmConstants.RecordState.USE);
					CmInnerServiceFactory.getCommonInnerSV().saveBean(acctPaymentAttr);
				}
			}
		}
	}

	/**   
	 * 从前台传入的数据集中获取客户对象
	 * @Function getCustValueFromBceData
	 * @Description 
	 *
	 * @param bceData
	 * @param bceFrameId
	 * @param businessId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-11 下午10:54:50
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-11     huzq2           v1.0.0               修改原因<br>
	 */
	private IVOAccountValue getCustValueFromBceData(IBceData bceData, long bceFrameId, String businessId) throws Exception {
		String codeType = CmBceSupportConstants.CmStaticDataCodeType.CM_BCE_DEAL_SERVICE_KEY_TMPL_STR.replace("{BUSINESS_ID}", businessId);
		String codeValueAccount = CmBceSupportConstants.CmDefaultCodeValue.codeValueAccount;
		String codeValueAcctPayment = CmBceSupportConstants.CmDefaultCodeValue.codeValueAcctPayment;
		String codeValueAcctBillCycle = CmBceSupportConstants.CmDefaultCodeValue.codeValueAcctBillCycle;
		String codeValueAcctBillCustomize = CmBceSupportConstants.CmDefaultCodeValue.codeValueBillCustomzie;
		IBOBsStaticDataValue[] staticDataValues = StaticDataUtil.getStaticData(codeType);
		if (CmCommonUtil.isNotEmptyObject(staticDataValues)) {
			for (int i = 0; i < staticDataValues.length; i++) {
				if (CmBceSupportConstants.VOAccountStruct.ACCOUNT.equals(staticDataValues[i].getCodeValue())) {
					codeValueAccount = staticDataValues[i].getCodeName();
				} else if (CmBceSupportConstants.VOAccountStruct.PAYMENT.equals(staticDataValues[i].getCodeValue())) {
					codeValueAcctPayment = staticDataValues[i].getCodeName();
				} else if (CmBceSupportConstants.VOAccountStruct.BILL_CUSTOMIZE.equals(staticDataValues[i].getCodeValue())) {
					codeValueAcctBillCustomize = staticDataValues[i].getCodeName();
				} else if (CmBceSupportConstants.VOAccountStruct.BILL_CYCLE.equals(staticDataValues[i].getCodeValue())) {
					codeValueAcctBillCycle = staticDataValues[i].getCodeName();
				}
			}
		}
		IVOAccountValue voAccountValue = new VOAccountBean();
		//将payerId传入后台
		
		// 将businessId传入后台处理
		voAccountValue.setBusinessId(Long.parseLong(businessId));
		/*
		 * 如果前台传入了账户信息，则创建客户对象
		 */
		DataContainerInterface[] dcs = bceData.getNormalRowsetInfo(codeValueAccount);
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			IAccountValue accountValue = new AccountBean();
			// 将客户的基本信息拷贝到客户对象中
			accountValue.copy(dcs[0]);
			// System.out.println("\n\nacctAliasName:"+dcs[0].getExtAttr("ACCT_ALIAS_NAME")+"\n\n");
			accountValue.setAcctAliasName((String) dcs[0].getExtAttr("ACCT_ALIAS_NAME"));
			//获取支付类型
			int payMethod=dcs[0].getAsInt("PAY_METHOD");
			voAccountValue.setPayMethod(payMethod);
			//代付类型
			if(payMethod==2){
				String PartyId=(String)dcs[0].getExtAttr("PARTY_ID");
				if(!StringUtils.isBlank(PartyId)){
					voAccountValue.setPayerId(Long.parseLong(PartyId));
				}
			}
			//将oldpartyId传入后台
			Long oldPartyId=(Long)dcs[0].getExtAttr("OLD_PARTY_ID");
			if(oldPartyId!=null&&oldPartyId>0){
				voAccountValue.setOldPayerId(oldPartyId);
			}
			
			
			voAccountValue.setAccount(accountValue);
			// 将客户的扩展信息拷贝到客户对象中
			voAccountValue.setUserObject(codeValueAccount, dcs[0]);

			IAcctPaymentValue acctPaymentValue = new AcctPaymentBean();
			// 将客户的基本信息拷贝到客户对象中
			acctPaymentValue.copy(dcs[0]);

			// System.out.println("\n\n\next:"+dcs[0].getExtAttr("BANK_BEHALF_PHONE")+"\n\n");

			acctPaymentValue.setExtAttr("BANK_BEHALF_PHONE", dcs[0].getExtAttr("BANK_BEHALF_PHONE"));

			voAccountValue.addPayment(acctPaymentValue);
		}
		/*
		 * 如果前台传入了支付方案信息，则创建客户对象
		 */
		dcs = bceData.getNormalRowsetInfo(codeValueAcctPayment);
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			IAcctPaymentValue acctPaymentValue = new AcctPaymentBean();
			// 将客户的基本信息拷贝到客户对象中
			acctPaymentValue.copy(dcs[0]);
			voAccountValue.setPayment(acctPaymentValue);
			// 将客户的扩展信息拷贝到客户对象中
			voAccountValue.setUserObject(codeValueAcctPayment, dcs[0]);
		}
		/*
		 * 如果前台传入了账单信息，则创建客户对象
		 */
		dcs = bceData.getNormalRowsetInfo(codeValueAcctBillCustomize);
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			IAcctBillCustomizeValue acctBillCustomizeValue = new AcctBillCustomizeBean();
			// 将客户的基本信息拷贝到客户对象中
			acctBillCustomizeValue.copy(dcs[0]);
			voAccountValue.addBillCustomize(acctBillCustomizeValue);
			// 将客户的扩展信息拷贝到客户对象中
			voAccountValue.setUserObject(codeValueAcctBillCustomize, dcs[0]);
		}
		/*
		 * 如果前台传入了账期信息，则创建客户对象
		 */
		dcs = bceData.getNormalRowsetInfo(codeValueAcctBillCycle);
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			IAcctBillCycleValue acctBillCycleValue = new AcctBillCycleBean();
			// 将客户的基本信息拷贝到客户对象中
			acctBillCycleValue.copy(dcs[0]);
			voAccountValue.setBillCycle(acctBillCycleValue);
			// 将客户的扩展信息拷贝到客户对象中
			voAccountValue.setUserObject(codeValueAcctBillCycle, dcs[0]);
		}
		return voAccountValue;
	}

}
