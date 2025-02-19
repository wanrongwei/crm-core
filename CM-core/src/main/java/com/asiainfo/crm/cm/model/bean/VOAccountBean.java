/**
 * 
 */
package com.asiainfo.crm.cm.model.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctAgreemnetRelValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCustomizeValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCycleValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctPaymentValue;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.IVOAccountValue;

/**   
 * @Copyright Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName VOAccountBean
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2011-12-30 下午3:54:01
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2011-12-30     Xiaohu           v1.0.0               修改原因<br>
 */
public class VOAccountBean extends ValueObjectBean implements IVOAccountValue {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7225508361886358918L;
	/**
	 * 账户基本信息
	 */
	private IAccountValue accountValue = null;
	/**
	 * 合同和账户的关系
	 */
	private List<IAcctAgreemnetRelValue> acctAgrRelValue=new ArrayList<IAcctAgreemnetRelValue>();
	/**
	 * 联系人的数据容器，这里使用Map来存放
	 */
	private List<IContactValue> contactList = new ArrayList<IContactValue>();
	/**
	 * 支付方案的数据容器
	 */
	private List<IAcctPaymentValue> paymentList = new ArrayList<IAcctPaymentValue>();

	/**
	 * 账期信息数据容器
	 */
	private List<IAcctBillCycleValue> billCycleList = new ArrayList<IAcctBillCycleValue>();
	/**
	 * 个性化账单定制信息数据容器
	 */
	private List<IAcctBillCustomizeValue> billCustomizeValues = new ArrayList<IAcctBillCustomizeValue>();
	/**
	 * 旧的payerId，换payer和同步地址使用
	 */
	private long oldPayerId ;
	private long payerId = -1;//代付人信息
	private int payMethod=-1;
	private int effectiveType=0;//生效类型
	public VOAccountBean() {
		super();
	}

	public VOAccountBean(IAccountValue accountValue) {
		this(accountValue, null, null);
	}

	public VOAccountBean(IAccountValue accountValue, IAcctPaymentValue[] acctPaymentValues) {
		this(accountValue, acctPaymentValues, null);
	}

	public VOAccountBean(IAccountValue accountValue, IAcctPaymentValue[] paymentValues, IContactValue[] contactValues) {
		super();
		this.accountValue = accountValue;
		if (CmCommonUtil.isNotEmptyObject(paymentValues)) {
			for (int i = 0; i < paymentValues.length; i++) {
				this.paymentList.add(paymentValues[i]);
			}
		}
		if (CmCommonUtil.isNotEmptyObject(contactValues)) {
			for (int i = 0; i < contactValues.length; i++) {
				this.contactList.add(contactValues[i]);
			}
		}
	}

	

	public IAccountValue getAccount() {
		return this.accountValue;
	}

	public long getAcctId() {
		if (this.accountValue != null) {
			return this.accountValue.getAcctId();
		}
		return 0;
	}

	public long getCustId() {
		if (this.accountValue != null) {
			return this.accountValue.getCustId();
		}
		return 0;
	}

	public IContactValue[] getContacts() throws Exception {
		return (IContactValue[]) this.contactList.toArray(new IContactValue[0]);
	}

	public IAcctPaymentValue[] getPayments() throws Exception {
		return (IAcctPaymentValue[]) this.paymentList.toArray(new IAcctPaymentValue[0]);
	}

	public long setAccount(IAccountValue accountValue) throws Exception {
		this.accountValue = accountValue;
		if (this.accountValue != null) {
			return this.accountValue.getAcctId();
		}
		return 0;
	}

	public long addContact(IContactValue contactValue) throws Exception {
		// 如果参数为null，抛出业务异常：传入的数据对象错误。
		if (contactValue == null) {
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.contactList.add(contactValue);
		return contactValue.getAcctContId();
	}

	/* (non-Javadoc)
	 * @see com.asiainfo.crm.cm.model.ivalues.IVOAccountValue#setPayment(com.asiainfo.crm.cm.model.ivalues.IAcctPaymentValue)
	 */
	public long setPayment(IAcctPaymentValue paymentValue) throws Exception {
		return this.addPayment(paymentValue);
	}
	public long addPayment(IAcctPaymentValue paymentValue) throws Exception {
		// 如果参数为null，抛出业务异常：传入的数据对象错误。
		if (paymentValue == null) {
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.paymentList.add(paymentValue);
		return paymentValue.getPaymentId();
	}

	public IAcctBillCycleValue[] getBillCycles() throws Exception {
		return this.billCycleList.toArray(new IAcctBillCycleValue[0]);
	}

	public long setBillCycle(IAcctBillCycleValue acctPeriodValue) throws Exception {
		// 如果参数为null，抛出业务异常：传入的数据对象错误。
		if (acctPeriodValue == null) {
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.billCycleList.add(acctPeriodValue);
		return acctPeriodValue.getCycleId();
	}

	public boolean hasBillCycle() throws Exception {
		return CmCommonUtil.isNotEmptyObject(this.billCycleList);
	}

	public boolean hasContacts() throws Exception {
		return CmCommonUtil.isNotEmptyObject(this.contactList);
	}

	public IAcctBillCustomizeValue[] getBillCustomizes() throws Exception {
		return this.billCustomizeValues.toArray(new IAcctBillCustomizeValue[0]);
	}

	public long setBillCustomize(IAcctBillCustomizeValue billCustomizeValue) throws Exception {
		return this.addBillCustomize(billCustomizeValue);
	}
	public long addBillCustomize(IAcctBillCustomizeValue billCustomizeValue) throws Exception {
		if (billCustomizeValue == null) {
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.billCustomizeValues.add(billCustomizeValue);
		return billCustomizeValue.getCustomizeId();
	}

	public boolean hasBillCustomizes() throws Exception {
		return CmCommonUtil.isNotEmptyObject(this.billCustomizeValues);
	}

	public boolean hasPayments() throws Exception {
		return CmCommonUtil.isNotEmptyObject(paymentList);
	}

	public long getId() {
		return getAcctId();
	}
	
	public void addPayments(IAcctPaymentValue[] acctPaymentValues) throws Exception {
		if (acctPaymentValues != null && acctPaymentValues.length > 0) {
			this.paymentList.addAll(Arrays.asList(acctPaymentValues));
		}
	}

	@Override
	public long getPayerId() throws Exception {
		
		return this.payerId;
	}

	@Override
	public void setPayerId(long payerId) throws Exception {
		this.payerId = payerId;
		
	}

	@Override
	public int getPayMethod() throws Exception {
		return this.payMethod;
	}

	@Override
	public void setPayMethod(int payMethod) throws Exception {
		this.payMethod=payMethod;
	}

	@Override
	public long getOldPayerId() throws Exception {
		return this.oldPayerId;
	}

	@Override
	public void setOldPayerId(long payerId) throws Exception {
		this.oldPayerId=payerId;
		
	}

	@Override
	public int getEffectiveType() throws Exception {
		return this.effectiveType;
	}

	@Override
	public int setEffectiveType(int effectiveType) throws Exception {
		return this.effectiveType = effectiveType;
	}

	@Override
	public void addAcctAgrRelValue(IAcctAgreemnetRelValue acctAgrRelValue)
			throws Exception {
			if (this.acctAgrRelValue == null||acctAgrRelValue==null) {
				ExceptionUtil.throwBusinessException("CMS0030015");
			}
			this.acctAgrRelValue.add(acctAgrRelValue);
	}

	@Override
	public IAcctAgreemnetRelValue[]getAcctAgrRelValue()
			throws Exception {
		if (acctAgrRelValue == null) {
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		return this.acctAgrRelValue.toArray(new IAcctAgreemnetRelValue[0] );
		
	}




}
