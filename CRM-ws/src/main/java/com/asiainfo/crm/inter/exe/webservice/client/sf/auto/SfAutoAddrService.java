package com.asiainfo.crm.inter.exe.webservice.client.sf.auto;

public interface SfAutoAddrService extends java.rmi.Remote {

	public String queryAddressList(String cO, String pOBox, String city, String county, String streetName,
			String houseNo, String houseLetter, String floor, String apartment, String doorNo, String mainDoor,
			String municipality, String zipCode, String country, String startIndex, String pageSize)
			throws java.rmi.RemoteException;

}
