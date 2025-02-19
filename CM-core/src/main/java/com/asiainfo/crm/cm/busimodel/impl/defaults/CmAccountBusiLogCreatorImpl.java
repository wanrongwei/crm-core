package com.asiainfo.crm.cm.busimodel.impl.defaults;

import java.util.ArrayList;
import java.util.List;

import com.ai.appframe2.common.DataType;
import com.asiainfo.crm.cm.busimodel.ICmBusiLogCreator;
import com.asiainfo.crm.cm.busimodel.impl.log.AbstractBusiLogCreatorImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCustomizeValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCycleValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctPaymentValue;
import com.asiainfo.crm.cm.model.ivalues.ICmBusiLogValue;
import com.asiainfo.crm.cm.model.ivalues.IValueObject;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.IVOAccountValue;

/** 
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * @ClassName 
 * @Description 该类的功能描述
 * @version v1.0.0
 * @author huzq
 * @date 2012-7-16 下午1:16:09
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-7-16     huzq           v1.0.0               修改原因<br>
 */
public class CmAccountBusiLogCreatorImpl extends AbstractBusiLogCreatorImpl implements ICmBusiLogCreator {

	protected int getBusiLogType() {
		return CmConstants.BusiLogType.ACCOUNT_LOG;
	}

	protected ICmBusiLogValue createMainBusiLog(IValueObject valueObject) throws Exception {
		if (DataType.getAsBoolean(valueObject.getUserObject("S_HAS_LOGGED"))) {
			return null;
		}
		return super.createMainBusiLog(valueObject);
	}

	protected ICmBusiLogValue[] createBusiLogDetails(IValueObject valueObject, ICmBusiLogValue mainBusiLogValue) throws Exception {
		if (DataType.getAsBoolean(valueObject.getUserObject("S_HAS_LOGGED"))) {
			return new ICmBusiLogValue[0];
		}
		IVOAccountValue accountValue = (IVOAccountValue) valueObject;
		List<ICmBusiLogValue> busiLogValues = new ArrayList<ICmBusiLogValue>();
		// 本次业务的主业务日志记录，后续的所有的操作都将与之关联，便于日志的分析、关联展示等
		// 处理账户信息日志
		createAccountBusiLog(busiLogValues, mainBusiLogValue, accountValue);
		// 生成账户支付方案业务日志
		createAcctPaymentBusiLog(busiLogValues, mainBusiLogValue, accountValue);
		// 生成账期信息业务日志
		createBillCycleBusiLog(busiLogValues, mainBusiLogValue, accountValue);
		// 生成个性化账单定制业务日志
		createBillCustomizeBusiLog(busiLogValues, mainBusiLogValue, accountValue);
		// 生成联系人信息日志
		createContactBusiLog(busiLogValues, mainBusiLogValue, accountValue);
		// 生成其他业务日志
		createOtherBusiLog(busiLogValues, mainBusiLogValue, accountValue);
		// 返回结果
		return busiLogValues.toArray(new ICmBusiLogValue[0]);
	}

	/**   
	 * 生成账户联系人业务日志
	 * 
	 * @Function createContactBusiLog
	 * @Description 
	 *
	 * @param busiLogValues
	 * @param mainBusiLogValue
	 * @param accountValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-17 下午1:20:43
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-17     huzq           v1.0.0               修改原因<br>
	 */
	protected void createContactBusiLog(List<ICmBusiLogValue> busiLogValues, ICmBusiLogValue mainBusiLogValue, IVOAccountValue accountValue) throws Exception {
		if (accountValue.hasContacts()) {
			IContactValue[] contactValues = accountValue.getContacts();
			for (IContactValue contactValue : contactValues) {
				ICmBusiLogValue busiLogValue = createBusiLogFromDC(contactValue, mainBusiLogValue, contactValue.getAcctId());
				if (CmCommonUtil.isNotEmptyObject(busiLogValue)) {
					busiLogValues.add(busiLogValue);
				}
			}
		}
	}

	/**   
	 * 账户账单定制信息业务日志
	 * 
	 * @Function createBillCustomizeBusiLog
	 * @Description 
	 *
	 * @param busiLogValues
	 * @param mainBusiLogValue
	 * @param accountValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-17 下午12:46:02
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-17     huzq           v1.0.0               修改原因<br>
	 */
	protected void createBillCustomizeBusiLog(List<ICmBusiLogValue> busiLogValues, ICmBusiLogValue mainBusiLogValue, IVOAccountValue accountValue) throws Exception {
		if (accountValue.hasBillCustomizes()) {
			IAcctBillCustomizeValue[] customizeValues = accountValue.getBillCustomizes();
			for (IAcctBillCustomizeValue customizeValue : customizeValues) {
				ICmBusiLogValue busiLogValue = createBusiLogFromDC(customizeValue, mainBusiLogValue, customizeValue.getAcctId());
				if (CmCommonUtil.isNotEmptyObject(busiLogValue)) {
					busiLogValues.add(busiLogValue);
				}
			}
		}
	}

	/**   
	 * 生成账期信息业务日志
	 * 
	 * @Function createBillCycleBusiLog
	 * @Description 
	 *
	 * @param busiLogValues
	 * @param mainBusiLogValue
	 * @param accountValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-17 下午12:44:28
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-17     huzq           v1.0.0               修改原因<br>
	 */
	protected void createBillCycleBusiLog(List<ICmBusiLogValue> busiLogValues, ICmBusiLogValue mainBusiLogValue, IVOAccountValue accountValue) throws Exception {
		if (accountValue.hasBillCycle()) {
			IAcctBillCycleValue[] cycleValues = accountValue.getBillCycles();
			for (IAcctBillCycleValue cycleValue : cycleValues) {
				ICmBusiLogValue busiLogValue = createBusiLogFromDC(cycleValue, mainBusiLogValue, cycleValue.getAcctId());
				if (CmCommonUtil.isNotEmptyObject(busiLogValue)) {
					busiLogValues.add(busiLogValue);
				}
			}
		}
	}

	/**   
	 * 生成账户支付方案业务日志
	 * 
	 * @Function createAcctPaymentBusiLog
	 * @Description 
	 *
	 * @param busiLogValues
	 * @param mainBusiLogValue
	 * @param accountValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-17 下午12:43:58
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-17     huzq           v1.0.0               修改原因<br>
	 */
	protected void createAcctPaymentBusiLog(List<ICmBusiLogValue> busiLogValues, ICmBusiLogValue mainBusiLogValue, IVOAccountValue accountValue) throws Exception {
		if (accountValue.hasPayments()) {
			IAcctPaymentValue[] paymentValues = accountValue.getPayments();
			for (IAcctPaymentValue paymentValue : paymentValues) {
				ICmBusiLogValue busiLogValue = createBusiLogFromDC(paymentValue, mainBusiLogValue, paymentValue.getAcctId());
				if (CmCommonUtil.isNotEmptyObject(busiLogValue)) {
					busiLogValues.add(busiLogValue);
				}
			}
		}
	}

	/**   
	 * 生成账户基本资料变更业务日志
	 * 
	 * @Function createAccountBusiLog
	 * @Description 
	 *
	 * @param busiLogValues
	 * @param mainBusiLogValue
	 * @param acctValue
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @throws Exception 
	 * @date 2012-7-16 下午10:04:59
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-16     huzq           v1.0.0               修改原因<br>
	 */
	protected void createAccountBusiLog(List<ICmBusiLogValue> busiLogValues, ICmBusiLogValue mainBusiLogValue, IVOAccountValue acctValue) throws Exception {
		IAccountValue accountValue = acctValue.getAccount();
		if (CmCommonUtil.isNotEmptyObject(accountValue)) {
			// 如果对象状态没有改变则不需要记录日志
			ICmBusiLogValue busiLogValue = createBusiLogFromDC(accountValue, mainBusiLogValue, accountValue.getAcctId());
			if (CmCommonUtil.isNotEmptyObject(busiLogValue)) {
				busiLogValues.add(busiLogValue);
			}
		}
	}

	/**   
	 * 生成其他的业务日志
	 * 
	 * @Function createOtherBusiLog
	 * @Description 
	 *
	 * @param busiLogValues
	 * @param mainBusiLogValue
	 * @param acctValue
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-17 下午1:47:59
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-17     huzq           v1.0.0               修改原因<br>
	 */
	protected void createOtherBusiLog(List<ICmBusiLogValue> busiLogValues, ICmBusiLogValue mainBusiLogValue, IVOAccountValue acctValue) {
		//创建其他日志
	}
}
