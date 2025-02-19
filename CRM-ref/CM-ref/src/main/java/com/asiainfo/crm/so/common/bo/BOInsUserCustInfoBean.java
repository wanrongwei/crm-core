package com.asiainfo.crm.so.common.bo;

import java.io.Serializable;
import java.sql.Timestamp;

import com.ai.omframe.instance.ivalues.IInsUserValue;

public class BOInsUserCustInfoBean implements Serializable {

	/**
	 * 
	 */

	private static final long serialVersionUID = -13181218786662L;
	private long custId; // 客户id
	private String billId; // 计费号码
	private long prodSpecId; // 产品规格id
	private String prodSpecName; // 产品规格名称
	private String simCard; // 卡号信息
	private int userStatus; // 用户状态
	private long userId;// 用户id
	private IInsUserValue insUserValue;
	private String payType;// 付费类型
	private Timestamp firstTime;
	private String brandName;// 品牌
	private long brandId;// 品牌
	private String offerType; // 策划类型
	private String offerName; // 基本策划名称
	private long offerId; // 基本策划id
	private long offerInstId;//基本策划实例id
	private long baseAcctId;//基本帐户id
    private int userType;//用户类型
    private String iccdId;
    // Telenor_BUG_20141119_0017 modify by pengwz
    private Timestamp expireTime; //失效时间
    private String puk1;  //add by lufm 20160203
    private String puk2;
    public String getPuk1() {
        return puk1;
    }
    public void setPuk1(String puk1) {
        this.puk1 = puk1;
    }
    public String getPuk2() {
        return puk2;
    }
    public void setPuk2(String puk2) {
        this.puk2 = puk2;
    }

    public String getIccdId() {
        return iccdId;
    }

    public void setIccdId(String iccdId) {
        this.iccdId = iccdId;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public long getBaseAcctId() {
		return baseAcctId;
	}

	public void setBaseAcctId(long baseAcctId) {
		this.baseAcctId = baseAcctId;
	}

	public long getOfferInstId() {
		return offerInstId;
	}

	public void setOfferInstId(long offerInstId) {
		this.offerInstId = offerInstId;
	}

	private String offerCharge; // 基本策划的费用
	private String offerDesc; // 基本策划描述
	private String regionId;//地市ID

	public String getRegionId() {
		return regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public Timestamp getFirstTime() {
		return firstTime;
	}

	public void setFirstTime(Timestamp firstTime) {
		this.firstTime = firstTime;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public long getBrandId() {
		return brandId;
	}

	public void setBrandId(long brandId) {
		this.brandId = brandId;
	}
	public IInsUserValue getInsUserValue() {
		return insUserValue;
	}

	public void setInsUserValue(IInsUserValue insUserValue) {
		this.insUserValue = insUserValue;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getCustId() {
		return custId;
	}

	public void setCustId(long custId) {
		this.custId = custId;
	}

	public String getBillId() {
		return billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public long getProdSpecId() {
		return prodSpecId;
	}

	public void setProdSpecId(long prodSpecId) {
		this.prodSpecId = prodSpecId;
	}

	public String getProdSpecName() {
		return prodSpecName;
	}

	public void setProdSpecName(String prodSpecName) {
		this.prodSpecName = prodSpecName;
	}

	public String getSimCard() {
		return simCard;
	}

	public void setSimCard(String simCard) {
		this.simCard = simCard;
	}

	public int getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}

	public String getOfferType() {
		return offerType;
	}

	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}

	public String getOfferName() {
		return offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	public long getOfferId() {
		return offerId;
	}

	public void setOfferId(long offerId) {
		this.offerId = offerId;
	}

	public String getOfferCharge() {
		return offerCharge;
	}

	public void setOfferCharge(String offerCharge) {
		this.offerCharge = offerCharge;
	}

	public String getOfferDesc() {
		return offerDesc;
	}

	public void setOfferDesc(String offerDesc) {
		this.offerDesc = offerDesc;
	}

	public Timestamp getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(Timestamp expireTime) {
		this.expireTime = expireTime;
	}
	
	

}
