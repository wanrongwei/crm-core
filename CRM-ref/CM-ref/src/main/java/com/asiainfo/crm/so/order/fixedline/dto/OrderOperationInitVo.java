package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;
/**
 * 改单初始化订单对象
 */
public class OrderOperationInitVo implements Serializable{
	private static final long serialVersionUID = 5950762937302783697L;
	
	private OrderVo order;
	private AgreementVo agreement;
	private CustomerVo customer;
	private UserVo user;
	private AddressInfoVo addressInfo;
	private ServiceInfoVo serviceInfo;
	private DeliveryInfoVo deliveryInfo;
	private AccountInfoVo accountInfo;
	private DepartmentUserVo departmentUser;
	private SettingVo setting;
	private ReceiverVo receiver;
	
	
	public AgreementVo getAgreement() {
		return agreement;
	}
	public void setAgreement(AgreementVo agreement) {
		this.agreement = agreement;
	}
	public OrderVo getOrder() {
		return order;
	}
	public void setOrder(OrderVo order) {
		this.order = order;
	}
	public CustomerVo getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerVo customer) {
		this.customer = customer;
	}
	public UserVo getUser() {
		return user;
	}
	public void setUser(UserVo user) {
		this.user = user;
	}
	public AddressInfoVo getAddressInfo() {
		return addressInfo;
	}
	public void setAddressInfo(AddressInfoVo addressInfo) {
		this.addressInfo = addressInfo;
	}
	public ServiceInfoVo getServiceInfo() {
		return serviceInfo;
	}
	public void setServiceInfo(ServiceInfoVo serviceInfo) {
		this.serviceInfo = serviceInfo;
	}
	public DeliveryInfoVo getDeliveryInfo() {
		return deliveryInfo;
	}
	public void setDeliveryInfo(DeliveryInfoVo deliveryInfo) {
		this.deliveryInfo = deliveryInfo;
	}
	public AccountInfoVo getAccountInfo() {
		return accountInfo;
	}
	public void setAccountInfo(AccountInfoVo accountInfo) {
		this.accountInfo = accountInfo;
	}
	public DepartmentUserVo getDepartmentUser() {
		return departmentUser;
	}
	public void setDepartmentUser(DepartmentUserVo departmentUser) {
		this.departmentUser = departmentUser;
	}
	public SettingVo getSetting() {
		return setting;
	}
	public void setSetting(SettingVo setting) {
		this.setting = setting;
	}
	public ReceiverVo getReceiver() {
		return receiver;
	}
	public void setReceiver(ReceiverVo receiver) {
		this.receiver = receiver;
	}

	
}
