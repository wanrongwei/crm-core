package com.asiainfo.crm.so.teaminvoke.in.ivalue;

import java.util.ArrayList;
import java.util.List;

import com.ai.appframe2.bo.DataContainer;

/**
 * @Author xuecy
 * @Date: 2015/3/11
 * @RealUser:Chunyang Xue
 * @Time: 11:37
 * @Package:com.asiainfo.crm.so.teaminvoke.in.ivalue
 * @Email:xuecy@asiainfo-linkage.com
 */
public class Crm2ContractDC extends DataContainer {
	
	private long channelType;//2021/03/09 add by tanyan 
	
	private String mainOfferEffectiveDate;//AI-7563
	
	private String salesChannel;//SALES_CHANNEL
	

    
	public String getMainOfferEffectiveDate() {
		return mainOfferEffectiveDate;
	}
	public void setMainOfferEffectiveDate(String mainOfferEffectiveDate) {
		this.mainOfferEffectiveDate = mainOfferEffectiveDate;
	}
	public long getChannelType() {
		return channelType;
	}
	public void setChannelType(long channelType) {
		this.channelType = channelType;
	}

	private String presentIdType;//PRESENT_ID_TYPE
	private String presentIdNumber;//PRESENT_ID_NUMBER
	
	public String getSalesChannel(){
		return salesChannel;
	}
	public void setSalesChannel(String salesChannel){
		this.salesChannel = salesChannel;
	}
	public String getPresentIdType(){
		return presentIdType;
	}
	public void setPresentIdType(String presentIdType){
		this.presentIdType = presentIdType;
	}
	public String getPresentIdNumber(){
		return presentIdNumber;
	}
	public void setPresentIdNumber(String presentIdNumber){
		this.presentIdNumber = presentIdNumber;
	}
	
	private String switchEligible;//for CR38
	
	public String getSwitchEligible() {
		return switchEligible;
	}
	public void setSwitchEligible(String switchEligible) {
		this.switchEligible = switchEligible;
	}

	//billId 即 serviceNumber chenrui 16-01-22
	private String billID;
	
    private CustomerDC toCustomerDC;
    private CustomerDC customerDC;
    private OfferDC mainOfferDC;
    private OfferDC oldMainOfferDC;
    private List<OfferDC> addOnOfferDC = new ArrayList<OfferDC>();
    private PayerDC payerDC;
    private DealerDC dealerDC;
    private InstallationDC installationDC;
    private List<OtcDC> otcDCs = new ArrayList<OtcDC>();
    private List<NPDC> npDCs = new ArrayList<NPDC>();
    public List<NPDC> getNpDCs() {
		return npDCs;
	}

	public void setNpDCs(List<NPDC> npDCs) {
		this.npDCs = npDCs;
	}

	private NPDC npdc;
    private long businessId;
    private long customerOrderId;
    private boolean instalmentFlag;
    private SubscriptionDC subscriptionDC;

    private MinimumPricesDC minimumPricesDC;

    private InsuranceDC insuranceDC;
    private boolean isChangeMainoffer;

    
    public boolean isChangeMainoffer() {
		return isChangeMainoffer;
	}

	public void setChangeMainoffer(boolean isChangeMainoffer) {
		this.isChangeMainoffer = isChangeMainoffer;
	}

	private int isNeedSign ;
	
	private boolean upLive = false;//OSE的订购合同，switch合同是否上传livelink
    
    public boolean isUpLive() {
		return upLive;
	}
	public void setUpLive(boolean upLive) {
		this.upLive = upLive;
	}

	//chenrui
    private long agreementId;
    private UserInfoDC userInfoDC;
    
    public class UserInfoDC{
    	
    	private String userName;
    	private String userAddress;
    	private String userPostCode;
    	private String userCity;
    	private String userEmail;
    	
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getUserAddress() {
			return userAddress;
		}
		public void setUserAddress(String userAddress) {
			this.userAddress = userAddress;
		}
		public String getUserPostCode() {
			return userPostCode;
		}
		public void setUserPostCode(String userPostCode) {
			this.userPostCode = userPostCode;
		}
		public String getUserCity() {
			return userCity;
		}
		public void setUserCity(String userCity) {
			this.userCity = userCity;
		}
		public String getUserEmail() {
			return userEmail;
		}
		public void setUserEmail(String userEmail) {
			this.userEmail = userEmail;
		} 	
    }
    
    public class MinimumPricesDC{
    	
	    private List<MinimumPrice> minimumPrices;   
	    private long minimumSixMonth;
	    
	    public class MinimumPrice {
	    	private String yourOrder;               // offer
	    	private long lumpSum;                   // OTC 单位：分
	    	private long pricePerMonth;             // RC 单位：分
	    	
			public String getYourOrder() {
				return yourOrder;
			}
			public void setYourOrder(String yourOrder) {
				this.yourOrder = yourOrder;
			}
			public long getLumpSum() {
				return lumpSum;
			}
			public void setLumpSum(long lumpSum) {
				this.lumpSum = lumpSum;
			}
			public long getPricePerMonth() {
				return pricePerMonth;
			}
			public void setPricePerMonth(long pricePerMonth) {
				this.pricePerMonth = pricePerMonth;
			}    	
	    };    
	    
	    public List<MinimumPrice> getMinimumPrices() {
			return minimumPrices;
		}
	
		public void setMinimumPrices(List<MinimumPrice> minimumPrices) {
			this.minimumPrices = minimumPrices;
		}
	
		public long getMinimumSixMonth() {
			return minimumSixMonth;
		}
	
		public void setMinimumSixMonth(long minimumSixMonth) {
			this.minimumSixMonth = minimumSixMonth;
		}
    };
    
	public UserInfoDC getUserInfoDC() {
		return userInfoDC;
	}

	public OfferDC getOldMainOfferDC() {
		return oldMainOfferDC;
	}

	public void setOldMainOfferDC(OfferDC oldMainOfferDC) {
		this.oldMainOfferDC = oldMainOfferDC;
	}

	public void setUserInfoDC(UserInfoDC userInfoDC) {
		this.userInfoDC = userInfoDC;
	}

	public long getAgreementId() {
		return agreementId;
	}

	public void setAgreementId(long agreementId) {
		this.agreementId = agreementId;
	}

	public MinimumPricesDC getMinimumPricesDC() {
		return minimumPricesDC;
	}

	public void setMinimumPricesDC(MinimumPricesDC minimumPricesDC) {
		this.minimumPricesDC = minimumPricesDC;
	}
    
    
//    //是否同时生成POA
//    public boolean isPOA;
//    
//    //POA所需参数说明(isPOA为true时值必填)
//    public Map POAMap;
//    
//    public boolean isPOA() {
//		return isPOA;
//	}
//
//	public void setPOA(boolean isPOA) {
//		this.isPOA = isPOA;
//	}
//
//	public Map getPOAMap() {
//		return POAMap;
//	}
//
//	public void setPOAMap(Map pOAMap) {
//		POAMap = pOAMap;
//	}

	public SubscriptionDC getSubscriptionDC() {
		return subscriptionDC;
	}

	public void setSubscriptionDC(SubscriptionDC subscriptionDC) {
		this.subscriptionDC = subscriptionDC;
	}

	public boolean isInstalmentFlag() {
		return instalmentFlag;
	}

	public void setInstalmentFlag(boolean instalmentFlag) {
		this.instalmentFlag = instalmentFlag;
	}

	public long getCustomerOrderId() {
		return customerOrderId;
	}

	public void setCustomerOrderId(long customerOrderId) {
		this.customerOrderId = customerOrderId;
	}

	public long getBusinessId() {
		return businessId;
	}

	public void setBusinessId(long businessId) {
		this.businessId = businessId;
	}

	public OfferDC getMainOfferDC() {
        return mainOfferDC;
    }

    public void setMainOfferDC(OfferDC mainOfferDC) {
        this.mainOfferDC = mainOfferDC;
    }

    public List<OfferDC> getAddOnOfferDC() {
        return addOnOfferDC;
    }

    public void setAddOnOfferDC(List<OfferDC> addOnOfferDC) {
        this.addOnOfferDC = addOnOfferDC;
    }

    public PayerDC getPayerDC() {
        return payerDC;
    }

    public void setPayerDC(PayerDC payerDC) {
        this.payerDC = payerDC;
    }

    public DealerDC getDealerDC() {
        return dealerDC;
    }

    public void setDealerDC(DealerDC dealerDC) {
        this.dealerDC = dealerDC;
    }

    public InstallationDC getInstallationDC() {
        return installationDC;
    }

    public void setInstallationDC(InstallationDC installationDC) {
        this.installationDC = installationDC;
    }

    public List<OtcDC> getOtcDCs() {
        return otcDCs;
    }

    public void setOtcDCs(List<OtcDC> otcDCs) {
        this.otcDCs = otcDCs;
    }

    public NPDC getNpdc() {
        return npdc;
    }

    public void setNpdc(NPDC npdc) {
        this.npdc = npdc;
    }

    public CustomerDC getCustomerDC() {
        return customerDC;
    }

    public void setCustomerDC(CustomerDC customerDC) {
        this.customerDC = customerDC;
    }


    public CustomerDC getToCustomerDC() {
        return toCustomerDC;
    }

    public void setToCustomerDC(CustomerDC toCustomerDC) {
        this.toCustomerDC = toCustomerDC;
    }
    
    public int getIsNeedSign() {
		return isNeedSign;
	}

	public void setIsNeedSign(int isNeedSign) {
		this.isNeedSign = isNeedSign;
	}

	public void setInsuranceDC(InsuranceDC insuranceDC){
		this.insuranceDC = insuranceDC;
	}
	
	public InsuranceDC getInsuranceDC(){
		return insuranceDC;
	}

    public String getBillID() {
		return billID;
	}

	public void setBillID(String billID) {
		this.billID = billID;
	}

	public class NPDC {
    	private long poaId;
        private String npPhoneNo;
        private String npOperator;
        private String npSimCardNo;
        private String confirmationDate;
        private String portingDate;
        public String getNpPhoneNo() {
            return npPhoneNo;
        }

        public void setNpPhoneNo(String npPhoneNo) {
            this.npPhoneNo = npPhoneNo;
        }

        public String getNpOperator() {
            return npOperator;
        }

        public long getPoaId() {
			return poaId;
		}

		public void setPoaId(long poaId) {
			this.poaId = poaId;
		}

		public void setNpOperator(String npOperator) {
            this.npOperator = npOperator;
        }

        public String getNpSimCardNo() {
            return npSimCardNo;
        }

        public void setNpSimCardNo(String npSimCardNo) {
            this.npSimCardNo = npSimCardNo;
        }

		public String getConfirmationDate() {
			return confirmationDate;
		}

		public void setConfirmationDate(String confirmationDate) {
			this.confirmationDate = confirmationDate;
		}

		public String getPortingDate() {
			return portingDate;
		}

		public void setPortingDate(String portingDate) {
			this.portingDate = portingDate;
		}
        
    }

    public class OtcDC {
        private long offerId;
        
        
        private String otcPricePlanId;
        private String otcPriceItemId;
        private String otcFee;
        private String priceName;

		

        public String getOtcPriceItemId() {
			return otcPriceItemId;
		}
		public void setOtcPriceItemId(String otcPriceItemId) {
			this.otcPriceItemId = otcPriceItemId;
		}
		public long getOfferId() {
            return offerId;
        }
        public void setOfferId(long offerId) {
            this.offerId = offerId;
        }

        public String getOtcPricePlanId() {
            return otcPricePlanId;
        }

        public void setOtcPricePlanId(String otcPricePlanId) {
            this.otcPricePlanId = otcPricePlanId;
        }

        public String getOtcFee() {
            return otcFee;
        }

        public void setOtcFee(String otcFee) {
            this.otcFee = otcFee;
        }

		public String getPriceName() {
			return priceName;
		}

		public void setPriceName(String priceName) {
			this.priceName = priceName;
		}
        
    }

    public class InstallationDC {
        private long installationId;
        private String installationName;
        private String installationAddress;
        private String installationPostCode;
        private String installationCity;
        private String installationEmail;
        private String installationPhone;

        public long getInstallationId() {
            return installationId;
        }

        public void setInstallationId(long installationId) {
            this.installationId = installationId;
        }

        public String getInstallationName() {
            return installationName;
        }

        public void setInstallationName(String installationName) {
            this.installationName = installationName;
        }

        public String getInstallationAddress() {
            return installationAddress;
        }

        public void setInstallationAddress(String installationAddress) {
            this.installationAddress = installationAddress;
        }

        public String getInstallationPostCode() {
            return installationPostCode;
        }

        public void setInstallationPostCode(String installationPostCode) {
            this.installationPostCode = installationPostCode;
        }

        public String getInstallationCity() {
            return installationCity;
        }

        public void setInstallationCity(String installationCity) {
            this.installationCity = installationCity;
        }

        public String getInstallationEmail() {
            return installationEmail;
        }

        public void setInstallationEmail(String installationEmail) {
            this.installationEmail = installationEmail;
        }

        public String getInstallationPhone() {
            return installationPhone;
        }

        public void setInstallationPhone(String installationPhone) {
            this.installationPhone = installationPhone;
        }
    }

    public class PayerDC {
        private String payerName;
        private String payerAddress;
        private String payerPostCode;
        private String payerCity;
        private String payerEmail;
        private String payerPhone;
        private String paymentMethod;
        private String paymentPrompt;
        private String paymentAcctId;

        public String getPayerName() {
            return payerName;
        }

        public void setPayerName(String payerName) {
            this.payerName = payerName;
        }

        public String getPayerAddress() {
            return payerAddress;
        }

        public void setPayerAddress(String payerAddress) {
            this.payerAddress = payerAddress;
        }

        public String getPayerPostCode() {
            return payerPostCode;
        }

        public void setPayerPostCode(String payerPostCode) {
            this.payerPostCode = payerPostCode;
        }

        public String getPayerCity() {
            return payerCity;
        }

        public void setPayerCity(String payerCity) {
            this.payerCity = payerCity;
        }

        public String getPayerEmail() {
            return payerEmail;
        }

        public void setPayerEmail(String payerEmail) {
            this.payerEmail = payerEmail;
        }

        public String getPayerPhone() {
            return payerPhone;
        }

        public void setPayerPhone(String payerPhone) {
            this.payerPhone = payerPhone;
        }

        public String getPaymentMethod() {
            return paymentMethod;
        }

        public void setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
        }

        public String getPaymentPrompt() {
            return paymentPrompt;
        }

        public void setPaymentPrompt(String paymentPrompt) {
            this.paymentPrompt = paymentPrompt;
        }

        public String getPaymentAcctId() {
            return paymentAcctId;
        }

        public void setPaymentAcctId(String paymentAcctId) {
            this.paymentAcctId = paymentAcctId;
        }
    }

    public class SubscriptionDC{
    	private boolean isTerminal;
    	private long accountId;
    	private int accountType;
    	private String telephoneNo;
    	private String imei;
    	private String simCardNo;
    	private String InstallmentAgrNo;
    	private String voiceMailNo;
    	private String dslNo;
    	private String dslHardWare;
		private String subscriptionCommitmentPeriod;
		
		
    	
		public String getSubscriptionCommitmentPeriod() {
			return subscriptionCommitmentPeriod;
		}
		public void setSubscriptionCommitmentPeriod(String subscriptionCommitmentPeriod) {
			this.subscriptionCommitmentPeriod = subscriptionCommitmentPeriod;
		}
		public boolean isTerminal() {
			return isTerminal;
		}
		public void setTerminal(boolean isTerminal) {
			this.isTerminal = isTerminal;
		}
		public long getAccountId() {
			return accountId;
		}
		public void setAccountId(long accountId) {
			this.accountId = accountId;
		}
		public int getAccountType() {
			return accountType;
		}
		public void setAccountType(int accountType) {
			this.accountType = accountType;
		}
		public String getImei() {
			return imei;
		}
		public void setImei(String imei) {
			this.imei = imei;
		}
		public String getSimCardNo() {
			return simCardNo;
		}
		public void setSimCardNo(String simCardNo) {
			this.simCardNo = simCardNo;
		}
		public String getInstallmentAgrNo() {
			return InstallmentAgrNo;
		}
		public void setInstallmentAgrNo(String installmentAgrNo) {
			InstallmentAgrNo = installmentAgrNo;
		}
		public String getVoiceMailNo() {
			return voiceMailNo;
		}
		public void setVoiceMailNo(String voiceMailNo) {
			this.voiceMailNo = voiceMailNo;
		}
		public String getTelephoneNo() {
			return telephoneNo;
		}
		public void setTelephoneNo(String telephoneNo) {
			this.telephoneNo = telephoneNo;
		}
		public String getDslNo() {
			return dslNo;
		}
		public void setDslNo(String dslNo) {
			this.dslNo = dslNo;
		}
		public String getDslHardWare() {
			return dslHardWare;
		}
		public void setDslHardWare(String dslHardWare) {
			this.dslHardWare = dslHardWare;
		}
		
    }
    public class OfferDC {
        private long offerId;
        private String offerName;
        private double offerRecurringPrice;
        private double offerRecurringNetPrice;
        private String offerType;
        private String upcOfferRecurringPrice;
        private String upcOfferRecurringNetPrice;
        private String upcOfferRecurringTaxPrice;
        
		//chenrui
        private String addonNumber; 
        private boolean isMainRel;
        private int operStatus;		//0:modify, 1:add, 2:delete 3:nochange
        
        //add by tanyan 20180408 FMC info for subscription contract
        private int offerCount;//how many offers in current fmc group
        private String fmcGroupId;
        private String fmcGroupType;
		private double newPercentage;//eg：5%
        private double offerGrossPrice;
        private String fmcCountFlag;
        private double oldPercentage;//eg: 10%
        
        //CR376 add offer discount and promotion info
        private String discountFlag;
        private String discountType;
        private String discountValidDate;
        private String discountExpireDate;
        private String discountFeeExcludeTax;
        private String discountTaxFee;
        private String discountFeeIncludeTax;
        
        private String promotionFlag;
        private String promotionType;
        private String promotionValidDate;
        private String promotionExpireDate;
        private String promotionFeeExcludeTax;
        private String promotionTaxFee;
        private String promotionFeeIncludeTax;
        
//        private String promotionAddOnOfferId;
//        private String promotionAddOnOfferName;
//        private String promotionAddOnRecurringPrice;
//        private String promotionAddOnGrossPrice;
//        private String promotionAddOnRecurringNetPrice;
//        private String promotionAddOnValidDate;
//        private String promotionAddOnExpireDate;
//        private String promotionAddOnFeeExcludeTax;
//        private String promotionAddOnFeeTaxFee;
//        private String promotionAddOnFeeIncludeTax;
        
        
        
        
        public String getDiscountFlag() {
			return discountFlag;
		}

		

		public String getUpcOfferRecurringPrice() {
			return upcOfferRecurringPrice;
		}



		public void setUpcOfferRecurringPrice(String upcOfferRecurringPrice) {
			this.upcOfferRecurringPrice = upcOfferRecurringPrice;
		}



		public String getUpcOfferRecurringNetPrice() {
			return upcOfferRecurringNetPrice;
		}



		public void setUpcOfferRecurringNetPrice(String upcOfferRecurringNetPrice) {
			this.upcOfferRecurringNetPrice = upcOfferRecurringNetPrice;
		}



		public String getUpcOfferRecurringTaxPrice() {
			return upcOfferRecurringTaxPrice;
		}



		public void setUpcOfferRecurringTaxPrice(String upcOfferRecurringTaxPrice) {
			this.upcOfferRecurringTaxPrice = upcOfferRecurringTaxPrice;
		}



		public void setDiscountFlag(String discountFlag) {
			this.discountFlag = discountFlag;
		}

		public String getDiscountType() {
			return discountType;
		}

		public void setDiscountType(String discountType) {
			this.discountType = discountType;
		}

		public String getDiscountValidDate() {
			return discountValidDate;
		}

		public void setDiscountValidDate(String discountValidDate) {
			this.discountValidDate = discountValidDate;
		}

		public String getDiscountExpireDate() {
			return discountExpireDate;
		}

		public void setDiscountExpireDate(String discountExpireDate) {
			this.discountExpireDate = discountExpireDate;
		}

		public String getDiscountFeeExcludeTax() {
			return discountFeeExcludeTax;
		}

		public void setDiscountFeeExcludeTax(String discountFeeExcludeTax) {
			this.discountFeeExcludeTax = discountFeeExcludeTax;
		}

		public String getDiscountTaxFee() {
			return discountTaxFee;
		}

		public void setDiscountTaxFee(String discountTaxFee) {
			this.discountTaxFee = discountTaxFee;
		}

		public String getDiscountFeeIncludeTax() {
			return discountFeeIncludeTax;
		}

		public void setDiscountFeeIncludeTax(String discountFeeIncludeTax) {
			this.discountFeeIncludeTax = discountFeeIncludeTax;
		}

		public String getPromotionFlag() {
			return promotionFlag;
		}

		public void setPromotionFlag(String promotionFlag) {
			this.promotionFlag = promotionFlag;
		}

		public String getPromotionType() {
			return promotionType;
		}

		public void setPromotionType(String promotionType) {
			this.promotionType = promotionType;
		}

		public String getPromotionValidDate() {
			return promotionValidDate;
		}

		public void setPromotionValidDate(String promotionValidDate) {
			this.promotionValidDate = promotionValidDate;
		}

		public String getPromotionExpireDate() {
			return promotionExpireDate;
		}

		public void setPromotionExpireDate(String promotionExpireDate) {
			this.promotionExpireDate = promotionExpireDate;
		}

		public String getPromotionFeeExcludeTax() {
			return promotionFeeExcludeTax;
		}

		public void setPromotionFeeExcludeTax(String promotionFeeExcludeTax) {
			this.promotionFeeExcludeTax = promotionFeeExcludeTax;
		}

		public String getPromotionTaxFee() {
			return promotionTaxFee;
		}

		public void setPromotionTaxFee(String promotionTaxFee) {
			this.promotionTaxFee = promotionTaxFee;
		}

		public String getPromotionFeeIncludeTax() {
			return promotionFeeIncludeTax;
		}

		public void setPromotionFeeIncludeTax(String promotionFeeIncludeTax) {
			this.promotionFeeIncludeTax = promotionFeeIncludeTax;
		}

		public String getFmcGroupType() {
			return fmcGroupType;
		}

		public void setFmcGroupType(String fmcGroupType) {
			this.fmcGroupType = fmcGroupType;
		}
        public double getOfferGrossPrice() {
			return offerGrossPrice;
		}

		public void setOfferGrossPrice(double offerGrossPrice) {
			this.offerGrossPrice = offerGrossPrice;
		}

		public String getFmcCountFlag() {
			return fmcCountFlag;
		}

		public void setFmcCountFlag(String fmcCountFlag) {
			this.fmcCountFlag = fmcCountFlag;
		}

		public String getFmcGroupId() {
			return fmcGroupId;
		}

		public void setFmcGroupId(String fmcGroupId) {
			this.fmcGroupId = fmcGroupId;
		}

		public double getOldPercentage() {
			return oldPercentage;
		}

		public void setOldPercentage(double oldPercentage) {
			this.oldPercentage = oldPercentage;
		}

		public int getOfferCount() {
			return offerCount;
		}

		public void setOfferCount(int offerCount) {
			this.offerCount = offerCount;
		}

		public double getNewPercentage() {
			return newPercentage;
		}

		public void setNewPercentage(double newPercentage) {
			this.newPercentage = newPercentage;
		}

		private boolean isTerminal;
        
        public boolean isTerminal() {
			return isTerminal;
		}

		public void setTerminal(boolean isTerminal) {
			this.isTerminal = isTerminal;
		}

		public int getOperStatus() {
			return operStatus;
		}

		public void setOperStatus(int operStatus) {
			this.operStatus = operStatus;
		}

		public boolean isMainRel() {
			return isMainRel;
		}

		public void setMainRel(boolean isMainRel) {
			this.isMainRel = isMainRel;
		}

		public String getAddonNumber() {
			return addonNumber;
		}

		public void setAddonNumber(String addonNumber) {
			this.addonNumber = addonNumber;
		}

		public String getOfferType() {
			return offerType;
		}

		public void setOfferType(String offerType) {
			this.offerType = offerType;
		}

		private List<ProductDC> productDCs = new ArrayList<ProductDC>();

        public long getOfferId() {
            return offerId;
        }

        public void setOfferId(long offerId) {
            this.offerId = offerId;
        }

        public String getOfferName() {
            return offerName;
        }

        public void setOfferName(String offerName) {
            this.offerName = offerName;
        }

        public double getOfferRecurringPrice() {
			return offerRecurringPrice;
		}

		public void setOfferRecurringPrice(double offerRecurringPrice) {
			this.offerRecurringPrice = offerRecurringPrice;
		}

		public double getOfferRecurringNetPrice() {
			return offerRecurringNetPrice;
		}

		public void setOfferRecurringNetPrice(double offerRecurringNetPrice) {
			this.offerRecurringNetPrice = offerRecurringNetPrice;
		}

        public List<ProductDC> getProductDCs() {
            return productDCs;
        }

        public void setProductDCs(List<ProductDC> productDCs) {
            this.productDCs = productDCs;
        }
    }

    public class ProductDC {
        private long productId;
        private String productName;
        private List<ServiceDC> serviceDCs = new ArrayList<ServiceDC>();

        public long getProductId() {
            return productId;
        }

        public void setProductId(long productId) {
            this.productId = productId;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public List<ServiceDC> getServiceDCs() {
            return serviceDCs;
        }

        public void setServiceDCs(List<ServiceDC> serviceDCs) {
            this.serviceDCs = serviceDCs;
        }
    }

    public class ServiceDC {
        private long serviceId;
        private String serviceName;
        private List<AttributeDC> attributeDCs = new ArrayList<AttributeDC>();

        public long getServiceId() {
            return serviceId;
        }

        public void setServiceId(long serviceId) {
            this.serviceId = serviceId;
        }

        public String getServiceName() {
            return serviceName;
        }

        public void setServiceName(String serviceName) {
            this.serviceName = serviceName;
        }

        public List<AttributeDC> getAttributeDCs() {
            return attributeDCs;
        }

        public void setAttributeDCs(List<AttributeDC> attributeDCs) {
            this.attributeDCs = attributeDCs;
        }
    }

    public class AttributeDC {
        private long attributeId;
        private String attributeName;
        private String attributeText;
        private String attributeValue;

        public long getAttributeId() {
            return attributeId;
        }

        public void setAttributeId(long attributeId) {
            this.attributeId = attributeId;
        }

        public String getAttributeName() {
            return attributeName;
        }

        public void setAttributeName(String attributeName) {
            this.attributeName = attributeName;
        }

        public String getAttributeText() {
            return attributeText;
        }

        public void setAttributeText(String attributeText) {
            this.attributeText = attributeText;
        }

        public String getAttributeValue() {
            return attributeValue;
        }

        public void setAttributeValue(String attributeValue) {
            this.attributeValue = attributeValue;
        }
    }

    public class DealerDC {
        private String dealerId;
        private String dealerCode;
        private String dealerName;
        private String dealerAddress;
        private String dealerPostCode;
        private String dealerCity;
        private String dealerSellerCode;
        private String dealerSellerName;

        public String getDealerId() {
            return dealerId;
        }

        public void setDealerId(String dealerId) {
            this.dealerId = dealerId;
        }

        public String getDealerCode() {
            return dealerCode;
        }

        public void setDealerCode(String dealerCode) {
            this.dealerCode = dealerCode;
        }

        public String getDealerName() {
            return dealerName;
        }

        public void setDealerName(String dealerName) {
            this.dealerName = dealerName;
        }

        public String getDealerAddress() {
            return dealerAddress;
        }

        public void setDealerAddress(String dealerAddress) {
            this.dealerAddress = dealerAddress;
        }

        public String getDealerPostCode() {
            return dealerPostCode;
        }

        public void setDealerPostCode(String dealerPostCode) {
            this.dealerPostCode = dealerPostCode;
        }

        public String getDealerCity() {
            return dealerCity;
        }

        public void setDealerCity(String dealerCity) {
            this.dealerCity = dealerCity;
        }

        public String getDealerSellerCode() {
            return dealerSellerCode;
        }

        public void setDealerSellerCode(String dealerSellerCode) {
            this.dealerSellerCode = dealerSellerCode;
        }

        public String getDealerSellerName() {
            return dealerSellerName;
        }

        public void setDealerSellerName(String dealerSellerName) {
            this.dealerSellerName = dealerSellerName;
        }
    }

    public class CustomerDC {
    	private long custId;
        private String code;
        private String name;
        private String addressId;
        private String address;
        private String postCode;
        private String city;
        private String email;
        // 证件类型
        private String certType;
        // 证件号码
        private String certCode;
       
		public long getCustId() {
			return custId;
		}

		public void setCustId(long custId) {
			this.custId = custId;
		}

		public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddressId() {
            return addressId;
        }

        public void setAddressId(String addressId) {
            this.addressId = addressId;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPostCode() {
            return postCode;
        }

        public void setPostCode(String postCode) {
            this.postCode = postCode;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getCertType() {
            return certType;
        }

        public void setCertType(String certType) {
            this.certType = certType;
        }

        public String getCertCode() {
            return certCode;
        }

        public void setCertCode(String certCode) {
            this.certCode = certCode;
        }
    }
    
    public class InsuranceDC {
    	private String policyNum;
    	private String imei;
    	private String email;
    	private String monthlyFee;
    	private String offerName;
    	private String excess;
    	private String insuranceType;
    	private String isCampaign;
    	private String isQuarantine;
    	private String insuranceOfferName;

    	public String getInsuranceOfferName() {
			return insuranceOfferName;
		}
		public void setInsuranceOfferName(String insuranceOfferName) {
			this.insuranceOfferName = insuranceOfferName;
		}
		public String getIsQuarantine() {
			return isQuarantine;
		}
		public void setIsQuarantine(String isQuarantine) {
			this.isQuarantine = isQuarantine;
		}
		public String getInsuranceType() {
			return insuranceType;
		}
		public void setInsuranceType(String insuranceType) {
			this.insuranceType = insuranceType;
		}
		public String getIsCampaign() {
			return isCampaign;
		}
		public void setIsCampaign(String isCampaign) {
			this.isCampaign = isCampaign;
		}
		public String getPolicyNum() {
			return policyNum;
		}
		public void setPolicyNum(String policyNum) {
			this.policyNum = policyNum;
		}
		public String getImei() {
			return imei;
		}
		public void setImei(String imei) {
			this.imei = imei;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getMonthlyFee() {
			return monthlyFee;
		}
		public void setMonthlyFee(String monthlyFee) {
			this.monthlyFee = monthlyFee;
		}
		public String getOfferName() {
			return offerName;
		}
		public void setOfferName(String offerName) {
			this.offerName = offerName;
		}
		public String getExcess() {
			return excess;
		}
		public void setExcess(String excess) {
			this.excess = excess;
		}
    	
    }
}
