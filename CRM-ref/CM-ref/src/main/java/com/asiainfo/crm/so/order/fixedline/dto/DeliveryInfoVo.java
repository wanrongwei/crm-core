package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;

public class DeliveryInfoVo implements Serializable {
	private static final long serialVersionUID = -11539190220263501L;
    private int deliveryType;
    private String deliveryDate;
    private String addressId;
    private String attentionPeople;
    private String companyName;
    private String firstName;
    private String lastName;
    private String deliveryState;
    
    private String shipViaCode;
    private String carrierName;
    private String shopId;
    private String contactEmail;
    private String contactPhone;
    private String art1;
    private String art2;
    private String art3;
    private String art4;
    
    public String getShipViaCode() {
		return shipViaCode;
	}
	public void setShipViaCode(String shipViaCode) {
		this.shipViaCode = shipViaCode;
	}
	public String getCarrierName() {
		return carrierName;
	}
	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}
	public String getShopId() {
		return shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getContactPhone() {
		return contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	public String getArt1() {
		return art1;
	}
	public void setArt1(String art1) {
		this.art1 = art1;
	}
	public String getArt2() {
		return art2;
	}
	public void setArt2(String art2) {
		this.art2 = art2;
	}
	public String getArt3() {
		return art3;
	}
	public void setArt3(String art3) {
		this.art3 = art3;
	}
	public String getArt4() {
		return art4;
	}
	public void setArt4(String art4) {
		this.art4 = art4;
	}
	public void setDeliveryType(int deliveryType) {
         this.deliveryType = deliveryType;
     }
     public int getDeliveryType() {
         return deliveryType;
     }

    public void setDeliveryDate(String deliveryDate) {
         this.deliveryDate = deliveryDate;
     }
     public String getDeliveryDate() {
         return deliveryDate;
     }

    public void setAddressId(String addressId) {
         this.addressId = addressId;
     }
     public String getAddressId() {
         return addressId;
     }

    public void setAttentionPeople(String attentionPeople) {
         this.attentionPeople = attentionPeople;
     }
     public String getAttentionPeople() {
         return attentionPeople;
     }

    public void setCompanyName(String companyName) {
         this.companyName = companyName;
     }
     public String getCompanyName() {
         return companyName;
     }

    public void setFirstName(String firstName) {
         this.firstName = firstName;
     }
     public String getFirstName() {
         return firstName;
     }

    public void setLastName(String lastName) {
         this.lastName = lastName;
     }
     public String getLastName() {
         return lastName;
     }
	public String getDeliveryState() {
		return deliveryState;
	}
	public void setDeliveryState(String deliveryState) {
		this.deliveryState = deliveryState;
	}
     
}

