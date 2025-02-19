package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;
import java.util.List;


public class BaseOrderVo implements Serializable{
	private static final long serialVersionUID = -2539190984220463500L;
	
	private OrderVo order;
	private CustomerVo customer;
	private UserVo user;
	private ServiceInfoVo serviceInfo;
	private List<OfferVo> offerList;
	private List<PriceVo> priceList;
	private DeliveryInfoVo deliveryInfo;
	private AccountInfoVo accountInfo;
	private DepartmentUserVo departmentUser;
	private AdditionalInfoVo additionalInfo;
	private SettingVo setting;
	private PreqInfoVo preqInfo;
	private LineOptionVo lineOption;
	private AgreementVo agreement;
	private List<OrderExtVo> orderExt;
	private SuspensionResumeInfoVo suspensionResumeInfo;
	private List<ReturnInfoVo> returnInfo;
    private TerminationInfoVo terminationInfo;
    private ReceiverVo receiver;
    private ElectronicConfirmationVo electronicConfirmation;
    private InheritCommitVo inheritCommit;
    private VoipNumInfoVo voipNumInfo;
    private ChangeTechParamInfoVo technicalParameter;
    
	public ChangeTechParamInfoVo getTechnicalParameter() {
		return technicalParameter;
	}
	public void setTechnicalParameter(ChangeTechParamInfoVo technicalParameter) {
		this.technicalParameter = technicalParameter;
	}
	public VoipNumInfoVo getVoipNumInfo() {
		return voipNumInfo;
	}
	public void setVoipNumInfo(VoipNumInfoVo voipNumInfo) {
		this.voipNumInfo = voipNumInfo;
	}
	public ReceiverVo getReceiver() {
		return receiver;
	}
	public void setReceiver(ReceiverVo receiver) {
		this.receiver = receiver;
	}
	public ElectronicConfirmationVo getElectronicConfirmation() {
		return electronicConfirmation;
	}
	public void setElectronicConfirmation(ElectronicConfirmationVo electronicConfirmation) {
		this.electronicConfirmation = electronicConfirmation;
	}
	public InheritCommitVo getInheritCommit() {
		return inheritCommit;
	}
	public void setInheritCommit(InheritCommitVo inheritCommit) {
		this.inheritCommit = inheritCommit;
	}
	public List<ReturnInfoVo> getReturnInfo() {
		return returnInfo;
	}
	public void setReturnInfo(List<ReturnInfoVo> returnInfo) {
		this.returnInfo = returnInfo;
	}
	public TerminationInfoVo getTerminationInfo() {
		return terminationInfo;
	}
	public void setTerminationInfo(TerminationInfoVo terminationInfo) {
		this.terminationInfo = terminationInfo;
	}
	public SuspensionResumeInfoVo getSuspensionResumeInfo() {
		return suspensionResumeInfo;
	}
	public void setSuspensionResumeInfo(SuspensionResumeInfoVo suspensionResumeInfo) {
		this.suspensionResumeInfo = suspensionResumeInfo;
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
	public ServiceInfoVo getServiceInfo() {
		return serviceInfo;
	}
	public void setServiceInfo(ServiceInfoVo serviceInfo) {
		this.serviceInfo = serviceInfo;
	}
	public List<OfferVo> getOfferList() {
		return offerList;
	}
	public void setOfferList(List<OfferVo> offerList) {
		this.offerList = offerList;
	}
	public List<PriceVo> getPriceList() {
		return priceList;
	}
	public void setPriceList(List<PriceVo> priceList) {
		this.priceList = priceList;
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
	public AdditionalInfoVo getAdditionalInfo() {
		return additionalInfo;
	}
	public void setAdditionalInfo(AdditionalInfoVo additionalInfo) {
		this.additionalInfo = additionalInfo;
	}
	public PreqInfoVo getPreqInfo() {
		return preqInfo;
	}
	public void setPreqInfo(PreqInfoVo preqInfo) {
		this.preqInfo = preqInfo;
	}
	public LineOptionVo getLineOption() {
		return lineOption;
	}
	public void setLineOption(LineOptionVo lineOption) {
		this.lineOption = lineOption;
	}
	public AgreementVo getAgreement() {
		return agreement;
	}
	public void setAgreement(AgreementVo agreement) {
		this.agreement = agreement;
	}
	public List<OrderExtVo> getOrderExt() {
		return orderExt;
	}
	public void setOrderExt(List<OrderExtVo> orderExt) {
		this.orderExt = orderExt;
	}
	public SettingVo getSetting() {
		return setting;
	}
	public void setSetting(SettingVo setting) {
		this.setting = setting;
	}
	
	
}
