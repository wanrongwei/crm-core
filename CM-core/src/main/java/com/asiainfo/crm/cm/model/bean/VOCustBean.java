package com.asiainfo.crm.cm.model.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.common.ivalues.IBOIdentificationValue;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.customer.group.ivalues.IBoCmGroupAccountingValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.ICustManagerValue;
import com.asiainfo.crm.cm.model.ivalues.ICustOrganizeValue;
import com.asiainfo.crm.cm.model.ivalues.ICustRelationshipValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IVOAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustAddressValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.model.ivalues.IVOPartyValue;

/**
 * Created by IntelliJ IDEA.
 * User: huzhengquan
 * Date: 11-9-6
 * Time: 下午5:11
 */
public class VOCustBean extends ValueObjectBean implements IVOCustValue {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2262346435817435358L;

	/**
	 * 账户列表
	 */
	private List<IVOAccountValue> accountList = new ArrayList<IVOAccountValue>();

	/**
	 * 客户联系人列表
	 */
	private List<IContactValue> contactList = new ArrayList<IContactValue>();

	/**
	 * 客户关系列表
	 */
	private List<ICustRelationshipValue> custRelList = new ArrayList<ICustRelationshipValue>();

	/**
	 * 客户经理
	 */
	private List<ICustManagerValue> custManagerList = new ArrayList<ICustManagerValue>();

	/**
	 * 会计信息
	 */
	private List<IBoCmGroupAccountingValue> custAcctList = new ArrayList<IBoCmGroupAccountingValue>();

	/**
	 * 客户组织结构
	 */
	private List<ICustOrganizeValue> custOrganizeValues = new ArrayList<ICustOrganizeValue>();

	/**
	 * 客户地址结构
	 */
	private List<IVOCustAddressValue> custAddressValues = new ArrayList<IVOCustAddressValue>();

	/**
	 * 客户联系媒介
	 */
	private List<IBOCmCustContactMediumValue> custContMediums = new ArrayList<IBOCmCustContactMediumValue>();

	/**
	 * 客户多认证
	 */
	private List<IBOIdentificationValue> custIdentification = new ArrayList<IBOIdentificationValue>();

	/**
	 * 客户基本信息对象
	 */
	private ICustomerValue customer;

	/**
	 * 参与人对象
	 */
	private IVOPartyValue party;

	public VOCustBean() {
		super();
	}

	public VOCustBean(IContactValue[] contactValues) {
		super();
		if (contactValues != null && contactValues.length > 0) {
			for (int i = 0, length = contactValues.length; i < length; i++) {
				this.contactList.add(contactValues[i]);
			}
		}
	}

	public VOCustBean(ICustomerValue customer) {
		super();
		this.customer = customer;
	}

	public VOCustBean(ICustomerValue customer, IContactValue[] contactValues) {
		super();
		this.customer = customer;
		if (contactValues != null && contactValues.length > 0) {
			for (int i = 0, length = contactValues.length; i < length; i++) {
				this.contactList.add(contactValues[i]);
			}
		}
	}

	public VOCustBean(ICustomerValue customer, IVOAccountValue[] accountValues) {
		super();
		this.customer = customer;
		if (accountValues != null && accountValues.length > 0) {
			for (int i = 0, length = accountValues.length; i < length; i++) {
				this.accountList.add(accountValues[i]);
			}
		}
	}

	public VOCustBean(IVOPartyValue party) {
		super();
		this.party = party;
	}

	public VOCustBean(IVOPartyValue party, ICustomerValue customer) {
		super();
		this.party = party;
		this.customer = customer;
	}

	public VOCustBean(IVOPartyValue party, ICustomerValue customer, IVOAccountValue[] accountValues, IContactValue[] contactValues) {
		super();
		this.party = party;
		this.customer = customer;
		if (accountValues != null && accountValues.length > 0) {
			for (int i = 0, length = accountValues.length; i < length; i++) {
				this.accountList.add(accountValues[i]);
			}
		}
		if (contactValues != null && contactValues.length > 0) {
			for (int i = 0, length = contactValues.length; i < length; i++) {
				this.contactList.add(contactValues[i]);
			}
		}
	}

	public VOCustBean(IVOAccountValue[] accountValues) {
		super();
		if (accountValues != null && accountValues.length > 0) {
			for (int i = 0, length = accountValues.length; i < length; i++) {
				this.accountList.add(accountValues[i]);
			}
		}
	}

	public long addAccount(IVOAccountValue accountValue) throws Exception {
		this.accountList.add(accountValue);
		if (accountValue == null) {
			return 0;
		}
		return accountValue.getAcctId();
	}

	public void addContact(IContactValue contactValue) {
		this.contactList.add(contactValue);
	}

	public long addCustManager(ICustManagerValue custManagerValue) throws Exception {
		if (custManagerValue == null) {
			// 如果参数为null，抛出业务异常：传入的数据对象错误。
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.custManagerList.add(custManagerValue);
		return custManagerValue.getManagerId();
	}

	public IVOAccountValue[] getAccounts() {
		return (IVOAccountValue[]) this.accountList.toArray(new IVOAccountValue[0]);
	}

	public IContactValue[] getContacts() {
		return (IContactValue[]) this.contactList.toArray(new IContactValue[0]);
	}

	public long getCustId() {
		if (this.customer == null) {
			return -1;
		}
		return this.customer.getCustId();
	}

	public ICustManagerValue[] getCustManagers() throws Exception {
		return this.custManagerList.toArray(new ICustManagerValue[0]);
	}

	public ICustomerValue getCustomer() {
		return customer;
	}

	public int getCustType() {
		if (this.customer == null) {
			return -1;
		}
		return this.customer.getCustType();
	}

	public IVOPartyValue getParty() {
		return party;
	}

	public boolean hasAccounts() throws Exception {
		return CmCommonUtil.isNotEmptyObject(this.accountList);
	}

	public boolean hasContacts() throws Exception {
		return CmCommonUtil.isNotEmptyObject(this.contactList);
	}

	public boolean hasCustManagers() throws Exception {
		return CmCommonUtil.isNotEmptyObject(this.custManagerList);
	}

	public IVOAccountValue removeAccount(IVOAccountValue accountValue) throws Exception {
		if (accountValue == null) {
			// 如果参数为null，抛出业务异常：传入的数据对象错误。
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.accountList.remove(accountValue);
		return accountValue;
	}

	public IContactValue removeContact(IContactValue contactValue) throws Exception {
		if (contactValue == null) {
			// 如果参数为null，抛出业务异常：传入的数据对象错误。
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.contactList.remove(contactValue);
		return contactValue;
	}

	public ICustManagerValue removeCustManager(ICustManagerValue managerValue) throws Exception {
		if (managerValue == null) {
			// 如果参数为null，抛出业务异常：传入的数据对象错误。
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.custManagerList.remove(managerValue);
		return managerValue;
	}

	public long setCustomer(ICustomerValue customer) {
		this.customer = customer;
		if (this.customer == null) {
			return 0;
		}
		return this.customer.getPartyId();
	}

	public long setParty(IVOPartyValue party) throws Exception {
		this.party = party;
		if (this.party == null) {
			return 0;
		}
		return this.party.getParty().getPartyId();
	}

	public long addCustOrganize(ICustOrganizeValue custOrganizeValue) throws Exception {
		if (custOrganizeValue == null) {
			// 如果参数为null，抛出业务异常：传入的数据对象错误。
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.custOrganizeValues.add(custOrganizeValue);
		return custOrganizeValue.getDeptId();
	}

	public ICustOrganizeValue removeCustOrganize(ICustOrganizeValue custOrganizeValue) throws Exception {
		if (custOrganizeValue == null) {
			// 如果参数为null，抛出业务异常：传入的数据对象错误。
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.custOrganizeValues.remove(custOrganizeValue);
		return custOrganizeValue;
	}

	public ICustOrganizeValue[] getCustOrganizes() throws Exception {
		return this.custOrganizeValues.toArray(new ICustOrganizeValue[0]);
	}

	public boolean hasCustOrganize() throws Exception {
		return CmCommonUtil.isNotEmptyObject(this.custOrganizeValues);
	}

	public long addCustRel(ICustRelationshipValue custRelValue) throws Exception {
		if (custRelValue == null) {
			// 如果参数为null，抛出业务异常：传入的数据对象错误。
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.custRelList.add(custRelValue);
		return custRelValue.getMemberCustId();
	}

	public ICustRelationshipValue[] getCustRels() throws Exception {

		return this.custRelList.toArray(new ICustRelationshipValue[0]);
	}

	public boolean hasCustRel() throws Exception {
		return CmCommonUtil.isNotEmptyObject(this.custRelList);
	}

	public ICustRelationshipValue removeCustRel(ICustRelationshipValue custRelvalue) throws Exception {
		if (custRelvalue == null) {
			// 如果参数为null，抛出业务异常：传入的数据对象错误。
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.custRelList.remove(custRelvalue);
		return custRelvalue;
	}

	public void addCustRels(ICustRelationshipValue[] custRelValues) throws Exception {
		this.custRelList.addAll(Arrays.asList(custRelValues));
	}

	public long getId() {
		return getCustId();
	}

	public void addCustAddress(IVOCustAddressValue[] addresses) throws Exception {
		this.custAddressValues.addAll(Arrays.asList(addresses));

	}

	public boolean hasCustAddress() throws Exception {
		return CmCommonUtil.isNotEmptyObject(this.custAddressValues);
	}

	public IVOCustAddressValue[] getCustAddress() throws Exception {
		if (hasCustAddress()) {
			return this.custAddressValues.toArray(new IVOCustAddressValue[0]);
		}
		return null;
	}

	public boolean hasCustContMedium() throws Exception {
		return CmCommonUtil.isNotEmptyObject(this.custContMediums);
	}

	public IBOCmCustContactMediumValue[] getCustContMedium() throws Exception {
		if (hasCustContMedium()) {
			return this.custContMediums.toArray(new IBOCmCustContactMediumValue[0]);
		}
		return null;
	}

	public void addCustContMedium(IBOCmCustContactMediumValue[] custContMediums) throws Exception {
		this.custContMediums.addAll(Arrays.asList(custContMediums));
	}

	public boolean hasCustAccounting() throws Exception {
		return CmCommonUtil.isNotEmptyObject(this.custAcctList);
	}

	public IBoCmGroupAccountingValue[] getCustAccounting() throws Exception {
		return this.custAcctList.toArray(new IBoCmGroupAccountingValue[0]);
	}

	public void addCustAccounting(IBoCmGroupAccountingValue custAcctValue) throws Exception {
		this.custAcctList.add(custAcctValue);
	}

	public void addCustIdentification(IBOIdentificationValue[] identificationValues) throws Exception {
		this.custIdentification.addAll(Arrays.asList(identificationValues));
	}

	public IBOIdentificationValue[] getCustIdentification() throws Exception {
		return this.custIdentification.toArray(new IBOIdentificationValue[0]);
	}

	public boolean hasCustIdentification() throws Exception {
		return CmCommonUtil.isNotEmptyObject(this.custIdentification);
	}

}
