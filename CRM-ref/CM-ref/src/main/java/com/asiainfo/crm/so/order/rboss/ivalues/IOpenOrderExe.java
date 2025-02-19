/**
 * 
 */
package com.asiainfo.crm.so.order.rboss.ivalues;

import com.ai.omframe.order.data.ivalues.ISoCommitmentData;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

/**
 * @author sunhaitao
 *
 */
public interface IOpenOrderExe extends ISoOfferExe, Serializable{

	//add by zouling 2018.11.16
	public String getSingleOrderType();
	public void setSingleOrderType(String singleOrderType);
	//add end
	
	
	//add start 
	public String getPresentIdType();
	
	public void setPresentIdType(String presentIdType);
	
	public String getPresentIdNumber();
	
	public void setPresentIdNumber(String presentIdNumber);
	//add end
	
	public long getUserId();
	
	public void setUserId(long userId);
	
	public long getUserType();
	
	public void setUserType(long userType);
	
	public String getUserPassword();
	
	public void setUserPassword(String userPassword);
	
	public long getChannelType();
	
	public void setChannelType(long channelType);
	
	public long getCustId();
	
	public void setCustId(long custId);
	
	public long getAcctId();
	
	public void setAcctId(long acctId);
	
	public int getCycleType();
	
	public void setCycleType(int cycleType);
	
	public int getBillCycle();
	
	public void setBillCycle(int billCycle);
	
	public String getIccidCode();
	
	public void setIccidCode(String iccidCode);
	
	public long getCartId() ;
	
	public void setCartId(int cartId);
	
	public long getCustomerOrderId() ;
	
	public void setCustomerOrderId(long customerOrderId);
	
	public int getDeliveryType() ;
	
	public void setDeliveryType(int deliveryType);
	
	public String getRegionId() ;
	
	public void setRegionId(String regionID);
	
	public long getMainOfferId() ;
	
	public void setMainOfferId(long mainOfferId);
	
	public boolean getIsBatchOrder();
	
	public void setIsBatchOrder(boolean isBatchOrder);
	
	public boolean getIsNeedRuleCheck();
	
	public void setIsNeedRuleCheck(boolean isNeedRuleCheck);
	
	public long getCustType();
	
	public void setCustType(long custType);
	
	public String getAcctName();
	
	public void setAcctName(String acctName);
	
	public String getVpnId();

	public void setVpnId(String vpnId);

	public String getShortNum();

	public void setShortNum(String shortNum);

	public String getVpnMemFee();

	public void setVpnMemFee(String vpnMemFee);

	public String getBusiId();

	public void setBusiId(String busiId);

	public String getRoleId();

	public void setRoleId(String roleId);

	public String getMemBillId();

	public void setMemBillId(String memBillId);
	
	
	public String getDeliveryAddress();

	public void setDeliveryAddress(String deliveryAddress);

	public String getDocType();

	public void setDocType(String docType);

	public String getItemInfo();

	public void setItemInfo(String itemInfo);

	public String getOutletCode();

	public void setOutletCode(String outletCode);

	public Timestamp getDeliveryDate();

	public void setDeliveryDate(Timestamp deliveryDate);

	public long getDeptId();

	public void setDeptId(long deptId);

	public long getUserCustId();

	public void setUserCustId(long userCustId);

	public boolean isNewAccount();

	public void setNewAccount(boolean isNewAccount);

	public List<Map> getPaymentList();

	public void setPaymentList(List<Map> paymentList);
	
	public String getStreet();

	public void setStreet(String street);

	public String getHouseNo();

	public void setHouseNo(String houseNo);
	
	public String getZipCode();

	public void setZipCode(String zipCode);

	public String getCity();

	public void setCity(String city);

	public ILineProductInfoForDSLValue[] getLineProductInfo();

	public void setLineProductInfo(ILineProductInfoForDSLValue[] lineProductInfo);

	public String getVisitService();

	public void setVisitService(String visitService);

	public String getReferenceId();

	public void setReferenceId(String referenceId);

	public String getContactBeforeArrival();

	public void setContactBeforeArrival(String contactBeforeArrival);

	public ICoInfoForDSLValue[] getCoInfo();

	public void setCoInfo(ICoInfoForDSLValue[] coInfo);

	public String getPstnNo();

	public void setPstnNo(String pstnNo);

	public String getOnlineDate();

	public void setOnlineDate(String onlineDate);

	public String getPassword();

	public void setPassword(String password);

	public ICaptureInfoForDSLValue[] getCaptureInfo();

	public void setCaptureInfo(ICaptureInfoForDSLValue[] captureInfo);

	public String getHasPstn();

	public void setHasPstn(String hasPstn);

	public String getContactNumber();

	public void setContactNumber(String contactNumber);

	public ICoInfoForDSLValue[] getSelCo();

	public void setSelCo(ICoInfoForDSLValue[] selCo);

	public String getMainDoor();

	public void setMainDoor(String mainDoor);

	public String getFloor();

	public void setFloor(String floor);

	public String getDoorNo();

	public void setDoorNo(String doorNo);

	public String getCounty();

	public void setCounty(String county);
	
	public String getProdCataLogId();

	public void setProdCataLogId(String prodCataLogId);
	
	public int getDeliveryState();

	public void setDeliveryState(int deliveryState);
	
	public String getSapFlag();

	public void setSapFlag(String sapFlag);
	
	public long getBatchOrderId();

	public void setBatchOrderId(long batchOrderId);
	

	public long getPoaId();

	public void setPoaId(long poaId);

	public String getPoaNumberType();

	public void setPoaNumberType(String poaNumberType);

	public String getPoaCpr();

	public void setPoaCpr(String poaCpr);

	public String getPoaCustType();

	public void setPoaCustType(String poaCustType);

	public String getPoaBillId();

	public void setPoaBillId(String poaBillId);

	public String getPoaAccountId();

	public void setPoaAccountId(String poaAccountId);

	public String getPoaIccId();

	public void setPoaIccId(String poaIccId);
	
	public String getPoaCustId();

	public void setPoaCustId(String poaCustId);

	public String getPoaCustName();

	public void setPoaCustName(String poaCustName);

	public String getPoaCurrentSp();

	public void setPoaCurrentSp(String poaCurrentSp);

	public long getPoaPostCode();

	public void setPoaPostCode(long poaPostCode);

	public Timestamp getPoaPortingDate();

	public void setPoaPortingDate(Timestamp poaPortingDate);

	public String getPoaIpAddress();

	public void setPoaIpAddress(String poaIpAddress);

	public String getPoaEmail();

	public void setPoaEmail(String poaEmail);

	public String getPoaAddress();

	public void setPoaAddress(String poaAddress);

	public String getNpFlag();

	public void setNpFlag(String npFlag);
	
	public int getIsNeedSupplementPoa();

	public void setIsNeedSupplementPoa(int isNeedSupplementPoa);
	
	public String getCpeSn();

	public void setCpeSn(String cpeSn);

	public String getDeliveryAddressType();

	public void setDeliveryAddressType(String deliveryAddressType);

	public String getDeliveryCounty();

	public void setDeliveryCounty(String deliveryCounty);

	public String getDeliveryCity();

	public void setDeliveryCity(String deliveryCity);
	
	public String getDeliveryStreet();

	public void setDeliveryStreet(String deliveryStreet);

	public String getDeliveryHouseNo();

	public void setDeliveryHouseNo(String deliveryHouseNo);

	public String getDeliveryHouseLetter();

	public void setDeliveryHouseLetter(String deliveryHouseLetter);

	public String getDeliveryApartment();

	public void setDeliveryApartment(String deliveryApartment);

	public String getDeliveryFloor();

	public void setDeliveryFloor(String deliveryFloor);

	public String getDeliveryMainDoor();

	public void setDeliveryMainDoor(String deliveryMainDoor);

	public String getDeliveryDoorNo();

	public void setDeliveryDoorNo(String deliveryDoorNo);

	public String getDeliveryZipCode();

	public void setDeliveryZipCode(String deliveryZipCode);
	
	public String getReturnSapOrderId();

	public void setReturnSapOrderId(String returnSapOrderId);
	
	public String getPreQorderId();

	public void setPreQorderId(String preQorderId);
	
	public boolean getReceiveFlag();

	public void setReceiveFlag(boolean receiveFlag);
	
	public String getCprNum();

	public void setCprNum(String cprNum);
	
	public String getNpAgreementInfo();
	
	public void setNpAgreementInfo(String npAgreementInfo);
	
	public long getBasketId();

	public void setBasketId(long basketId);
	
	public long getCustCertType();

	public void setCustCertType(long custCertType);
	
	public String getItemNum();
	
	public void setItemNum(String itemNum);
	
	public void setPoaNumberSeries(String poaNumberSeries);
	public String getPoaNumberSeries();
	
	public void setPoaPoaState(String poaPoaState);
	public String getPoaPoaState();
	
	public void setPoaCity(String poaCity);
	public String getPoaCity();
	
	public void setPoaContactEmail(String poaContactEmail);
	public String getPoaContactEmail();
	
	public void setPoaSubCustId(String poaSubCustId);
	public String getPoaSubCustId();
	
	public void setPoaNpState(String poaNpState);
	public String getPoaNpState();
	
	public void setPoaIsAgree(String poaIsAgree);
	public String getPoaIsAgree();
	
	public void setOseOccupyId(String oseOccupyId);
	public String getOseOccupyId();
	

	public void setCommitmentCount(int commitmentCount);
	public int getCommitmentCount();
	
	public void setCommitType(int commitType);
	public int getCommitType();
	
	public void setCommitValue(int commitValue);
	public int getCommitValue();
	
	public void setCommitmentOfferId(long commitmentOfferId);
	public long getCommitmentOfferId();
	
	public void setCommitmentStartDate(Timestamp commitmentStartDate);
	public Timestamp getCommitmentStartDate();
	
	public void setCommitmentEndDate(Timestamp commitmentEndDate);
	public Timestamp getCommitmentEndDate();
	
	public void setCommitmentOfferInsId(long commitmentOfferInsId);
	public long getCommitmentOfferInsId();
	
	public void setCommitmentInfo(ISoCommitmentData[] commitmentInfo);
	public ISoCommitmentData[] getCommitmentInfo();
	
	public void setIsNeedSign(int isNeedSign);
	public int getIsNeedSign(); 
	
	public int getUpLive();
	public void setUpLive(int upLive);
	
	public String getInvoiceName();
	public void setInvoiceName(String invoiceName);
	
	public void setTransactId(String transactId);
	public String getTransactId();

	public void setAllowanceCustId(String allowanceCustId);
	public String getAllowanceCustId();
	
	public void setAllowanceAccountId(String hardwareAccount);
	public String getAllowanceAccountId();
	
	public void setHardwareAllowanceCount(String hardwareAllowanceCount);
	public String getHardwareAllowanceCount();
	public int getRetailInvoiceType();
	public void setRetailInvoiceType(int retailInvoiceType);
	public long getOfferIndexId();
	public void setOfferIndexId(long offerIndexId) ;
	public long getInstalAcctId();
	public void setInstalAcctId(long instalAcctId);
	
	public long getAgreementId();

	public void setAgreementId(long agreementId);
	
	public void setAllowanceAgreementId(long allowanceAgreementId);
	
	public long getAllowanceAgreementId();
	public void setAttentionPeople(String attentionPeople);
	
	public String getAttentionPeople();
	public String getOseDetailId();
	public void setOseDetailId(String oseDetailId);
	
	public void setPoNumber(String poNumber);
	public String getPoNumber();
	public void setCustomerRef(String customerRef);
	public String getCustomerRef();	
	public void setOtherInfo(String otherInfo);
	public String getOtherInfo();	
	public String getIsTAF();	
	public String getPreTechType();	
	public String getTechType();	
	public String getCMTSID();	
	public void setIsTAF(String isTAF);	
	public void setPreTechType(String preTechType);	
	public void setTechType(String techType);	
	public void setCMTSID(String cmtsID);	
	public String getFirstName();
	public void setFirstName(String firstName);
	public String getLastName();
	public void setLastName(String lastName);
	public String getCompanyName();
	public void setCompanyName(String companyName);
	public String getLegalFirstName();
	public void setLegalFirstName(String legalFirstName);
	public String getLegalLastName();
	public void setLegalLastName(String legalLastName);
	public String getLegalCompanyName();
	public void setLegalCompanyName(String legalCompanyName);
	public String getSwitchOfferInstId();
	public void setSwitchOfferInstId(String switchOfferInstId);
	public String getInstallmentValue();
	public void setInstallmentValue(String installmentValue);
	
	public void setShipViaCode(String shipViaCode);
	public String getShipViaCode();
	public String getShopId();
	public void setShopId(String shopId);
	public String getCarrierName();
	public void setCarrierName(String carrierName);
	public String getContactEmail();
	public void setContactEmail(String contactEmail);
	public String getContactPhone();
	public void setContactPhone(String contactPhone);
	public String getAttr1();
	public void setAttr1(String attr1);
	public String getAttr2();
	public void setAttr2(String attr2);
	public String getAttr3();
	public void setAttr3(String attr3);
	public String getAttr4();
	public void setAttr4(String attr4);
	
	
	public String getLegalAddr();
	public void setLegalAddr(String attr4);
	
	//增加BBR_UUID的get和set方法
	public String getBbrUuid();
	public void setBbrUuid(String bbruid);
	
	public String getActualPlatform();
	public void setActualPlatform(String actualPlatform);
}
