/**  
* <p>Title: AddressInfoVo.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.asiainfo.com</p>  
* @author YJ  
* @date 2019年8月13日  
* @version SR 0.83  
*/  
package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**  
* <p>Title: AddressInfoVo</p>  
* <p>Description: </p>  
* @author YJ  
* @date 2019年8月13日  
*/

public class AddressInfoVo implements Serializable {
	private static final long serialVersionUID = 15292909842262500L;
	   private String zipCode;
	    private int routeNumberFiber;
	    private String city;
	    private String county;
	    private int allRouteNumberFiber;
	    private String kvhx;
	    private String isCui216;
	    private String addressId;
	    private String street;
	    private String houseNo;
	    private String doorNo;
	    private String floor;
	    private String municipalCode;
	    private String mainDoor;
	    private String installAddressId;
	    private String bbrUuid;
	    private String addressUid;
	    public void setZipCode(String zipCode) {
	         this.zipCode = zipCode;
	     }
	     public String getZipCode() {
	         return zipCode;
	     }

	    public void setRouteNumberFiber(int routeNumberFiber) {
	         this.routeNumberFiber = routeNumberFiber;
	     }
	     public int getRouteNumberFiber() {
	         return routeNumberFiber;
	     }

	    public void setCity(String city) {
	         this.city = city;
	     }
	     public String getCity() {
	         return city;
	     }

	    public void setCounty(String county) {
	         this.county = county;
	     }
	     public String getCounty() {
	         return county;
	     }

	    public void setAllRouteNumberFiber(int allRouteNumberFiber) {
	         this.allRouteNumberFiber = allRouteNumberFiber;
	     }
	     public int getAllRouteNumberFiber() {
	         return allRouteNumberFiber;
	     }

	    public void setKvhx(String kvhx) {
	         this.kvhx = kvhx;
	     }
	     public String getKvhx() {
	         return kvhx;
	     }

	    public void setIsCui216(String isCui216) {
	         this.isCui216 = isCui216;
	     }
	     public String getIsCui216() {
	         return isCui216;
	     }

	    public void setAddressId(String addressId) {
	         this.addressId = addressId;
	     }
	     public String getAddressId() {
	         return addressId;
	     }

	    public void setStreet(String street) {
	         this.street = street;
	     }
	     public String getStreet() {
	         return street;
	     }

	    public void setHouseNo(String houseNo) {
	         this.houseNo = houseNo;
	     }
	     public String getHouseNo() {
	         return houseNo;
	     }

	    public void setDoorNo(String doorNo) {
	         this.doorNo = doorNo;
	     }
	     public String getDoorNo() {
	         return doorNo;
	     }

	    public void setFloor(String floor) {
	         this.floor = floor;
	     }
	     public String getFloor() {
	         return floor;
	     }

	    public void setMunicipalCode(String municipalCode) {
	         this.municipalCode = municipalCode;
	     }
	     public String getMunicipalCode() {
	         return municipalCode;
	     }

	    public void setMainDoor(String mainDoor) {
	         this.mainDoor = mainDoor;
	     }
	     public String getMainDoor() {
	         return mainDoor;
	     }

	    public void setInstallAddressId(String installAddressId) {
	         this.installAddressId = installAddressId;
	     }
	     public String getInstallAddressId() {
	         return installAddressId;
	     }
	     
	     public String getBbrUuid() {
			return bbrUuid;
		}
		public void setBbrUuid(String bbrUuid) {
			this.bbrUuid = bbrUuid;
		}
		public String getAddressUid() {
			return addressUid;
		}
		public void setAddressUid(String addressUid) {
			this.addressUid = addressUid;
		}
		public Map<String,Object> convertThis2Map() {
	 		Map<String,Object> map = new HashMap<String,Object>();
	 		Field[] fields = this.getClass().getDeclaredFields();
	 		for (int i = 0; i < fields.length; i++) {
	 			String filedName = fields[i].getName();
	 			if("serialVersionUID".equals(filedName)){
	 				continue;
	 			}
	 			StringBuilder sb = new StringBuilder("get");
	 			sb.append(filedName.substring(0, 1).toUpperCase());
	 			sb.append(filedName.substring(1, filedName.length()));
	 			try {
	 				Method method = this.getClass().getMethod(sb.toString());
	 				Object object = method.invoke(this);
	 				if(object != null){
	 					map.put(filedName, object);
	 				}
	 			} catch (Exception e) {
	 				e.printStackTrace();
	 			} 
	 		}
 	 		return map;
	     }

	 
}
