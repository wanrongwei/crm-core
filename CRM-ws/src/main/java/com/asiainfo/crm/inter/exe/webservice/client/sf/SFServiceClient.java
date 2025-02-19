package com.asiainfo.crm.inter.exe.webservice.client.sf;

import java.rmi.RemoteException;
import java.util.Map;

import org.apache.commons.io.EndianUtils;

import com.ai.appframe2.service.ServiceFactory;
import com.ai.appframe2.util.StringUtils;
import com.asiainfo.crm.cm.common.service.interfaces.IAddressSV;
import com.asiainfo.crm.cm.common.util.ws.JaxbUtil;
import com.asiainfo.crm.cm.common.util.ws.address4QryContion;
import com.asiainfo.crm.cm.common.util.ws.addresses4Qry;
import com.asiainfo.crm.cm.common.util.ws.root4Qry;
import com.asiainfo.crm.inter.exe.webservice.client.sf.auto.SfAddrSeverSVImplServiceLocator;
import com.asiainfo.crm.inter.exe.webservice.client.sf.auto.SfServerSVImplServiceLocator;
import com.asiainfo.crm.so.exe.ws.Xml2Map;
import com.asiainfo.crm.so.exe.ws.oss.ResultInfo;

public class SFServiceClient {

	public static ResultInfo parserResultXml(String resultXml) throws Exception {
		ResultInfo rtn = new ResultInfo();
		Map ocnRtn = Xml2Map.XmlToMap(resultXml);
		// 只存在两种返回码：000000代表成功，000001代表失败
		rtn.setResult_code(String.valueOf(ocnRtn.get("result_code")));
		rtn.setResult_msg(StringUtils.nullToEmptyString(String.valueOf(ocnRtn.get("result_msg"))));
		return rtn;
	}

	public static String orderReceive(String receiveMsg, String regionId) throws RemoteException, Exception {
		return SfWsClient.getSfWsClient().orderReceive(receiveMsg, regionId);
	}

	public static String qryOnlinedate(String receiveMsg, String regionId) throws RemoteException, Exception {
		return SfWsClient.getSfWsClient().qryOnlinedate(receiveMsg, regionId);
	}

	public static long checkOrder(long customerOrderId, String crmTaskId, String regionId) throws RemoteException, Exception {
		return SfWsClient.getSfWsClient().checkOrder(customerOrderId, crmTaskId, regionId);
	}

	public static int queryCoListCount(String districtID, String coName) throws RemoteException, Exception {
		return SfWsClient.getSfWsClient().queryCoListCount(districtID, coName);
	}

	public static String queryCoList(String districtID, String coName, int startIndex, int endIndex) throws RemoteException, Exception {
		return SfWsClient.getSfWsClient().queryCoList(districtID, coName, startIndex, endIndex);
	}

	public static String queryCoInfoDetail(String coName, String coType) throws RemoteException, Exception {
		return SfWsClient.getSfWsClient().queryCoInfoDetail(coName, coType);
	}

	public static String deprovEstablish(String receiveMsg, String regionId) throws RemoteException, Exception {
		return SfWsClient.getSfWsClient().deprovEstablish(receiveMsg, regionId);
	}

	public static String saveAddress(String addrInfo, String districtId) throws RemoteException, Exception {
		return SfAddrWsClient.getSfAddrWsClient().saveAddress(addrInfo, districtId);
	}

	public static String getAddress(String addrIdInfo, String districtId) throws RemoteException, Exception {
		return SfAddrWsClient.getSfAddrWsClient().getAddress(addrIdInfo, districtId);
	}
	
//	public static String getAddress(String addrIdInfo, String sRequestFormat, String sTenantId) throws RemoteException, Exception {
//		return SfAddrWsClient.getSfAddrWsClient().getAddress(addrIdInfo, sRequestFormat, sTenantId);
//	}

	public static String queryAddressList(String districtId, String streetName, String zipCode, String city, String county, String startIndex, String pageSize)
			throws RemoteException, Exception {
		return SfAddrWsClient.getSfAddrWsClient().queryAddressList(districtId, streetName, zipCode, city, county, startIndex, pageSize);
	}

	public static String queryCityListByDistrictId(String districtId) throws RemoteException, Exception {
		return SfAddrWsClient.getSfAddrWsClient().queryCityListByDistrictId(districtId);
	}

	public static String queryDistrictTreeHierarchy(String districtId) throws RemoteException, Exception {
		return SfAddrWsClient.getSfAddrWsClient().queryDistrictTreeHierarchy(districtId);
	}

	public static String resume(String dslId, String prodInsId, String sRegionId) throws RemoteException, Exception {
		return SfWsClient.getSfWsClient().resume(dslId, prodInsId, sRegionId);
	}

	public static String suspend(String dslId, String prodInsId, String operReason, String sRegionId) throws RemoteException, Exception {
		return SfWsClient.getSfWsClient().suspend(dslId, prodInsId, operReason, sRegionId);
	}

	public static String orderCancelRequest(String receiveMsg, String regionId) throws RemoteException, Exception {
		return SfWsClient.getSfWsClient().orderCancelRequest(receiveMsg, regionId);
	}

	public static String orderCancel(String receiveMsg, String regionId) throws RemoteException, Exception {
		return SfWsClient.getSfWsClient().orderCancel(receiveMsg, regionId);
	}

	public static String orderChangeRequest(String receiveMsg, String regionId) throws RemoteException, Exception {
		return SfWsClient.getSfWsClient().orderChangeRequest(receiveMsg, regionId);
	}

	public static String orderChange(String receiveMsg, String regionId) throws RemoteException, Exception {
		return SfWsClient.getSfWsClient().orderChange(receiveMsg, regionId);
	}

	public static String deprovCpe(String dslId, String prodInsId, String cpeSerial, String cpeType, String sRegionId) throws RemoteException, Exception {
		return SfWsClient.getSfWsClient().deprovCpe(dslId, prodInsId, cpeSerial, cpeType, sRegionId);
	}

	public static int queryAddressListCount(String districtId, String streetName, String zipCode, String city, String county, String addressType,
			int suggestionType, int soundexVal) throws RemoteException, Exception {
		return SfAddrWsClient.getSfAddrWsClient().queryAddressListCount(districtId, streetName, zipCode, city, county, addressType, suggestionType, soundexVal);
	}

	public static String queryAddressListByAddressType(String districtId, String streetName, String zipCode, String city, String county, String addressType,
			int suggestionType, int soundexVal, int startIndex, int pageSize) throws RemoteException, Exception {
		return SfAddrWsClient.getSfAddrWsClient().queryAddressListByAddressType(districtId, streetName, zipCode, city, county, addressType, suggestionType,
				soundexVal, startIndex, pageSize);
	}

	public static int queryCoListCount(String districtID, String coName, String longName) throws RemoteException, Exception {
		return (new SfServerSVImplServiceLocator()).getSF4CRM().queryCoListCount(districtID, coName, longName);
	}

	public static String queryCoList(String districtID, String coName, String longName, int startIndex, int endIndex) throws RemoteException, Exception {
		return (new SfServerSVImplServiceLocator()).getSF4CRM().queryCoList(districtID, coName, longName, startIndex, endIndex);
	}

	public static String getCustomerDslInfo(String dslId) throws RemoteException, Exception {
		return SfWsClient.getSfWsClient().getCustomerDslInfo(dslId);
	}

	public static String reprove(String dslId, String prodInsId, String sRegionId) throws RemoteException, Exception {
		return SfWsClient.getSfWsClient().reprove(dslId, prodInsId, sRegionId);
	}

	public static String queryAddressList(String cO, String pOBox, String city, String county, String streetName, String houseNo, String houseLetter,
			String floor, String apartment, String doorNo, String mainDoor, String municipality, String zipCode, String country, String startIndex,
			String pageSize) throws RemoteException, Exception {
		IAddressSV addressSV=(IAddressSV)ServiceFactory.getService(IAddressSV.class);
		address4QryContion address = new address4QryContion();
		address.setCoName(cO);
		address.setPoBox(pOBox);
		address.setCity(city);
		address.setCounty(county);
		address.setStreetName(streetName);
		address.setHouseNumber(houseNo);
		address.setHouseLetter(houseLetter);
		address.setFloor(floor);
		address.setApartment(apartment);
		address.setDoorNumber(doorNo);
		address.setMainDoor(mainDoor);
		address.setMunicipality(municipality);
		address.setZipcode(zipCode);
		address.setCountry(country);
		int sIndex = -1, eIndex = -1;
		if(!StringUtils.isEmptyString(startIndex) && !StringUtils.isEmptyString(pageSize)){
			if(Integer.parseInt(startIndex) < 0){
				sIndex = 1;
				eIndex = 1000000;
			}else{
				sIndex = Integer.parseInt(startIndex);
				eIndex = Integer.parseInt(pageSize) + Integer.parseInt(startIndex) -1;
			}
			

		}
		com.asiainfo.crm.cm.common.util.ws.address[] addressList = addressSV.queryAddressList(address, null, null, sIndex, eIndex);
		root4Qry root = new root4Qry();
		root.setAddresses(new addresses4Qry());
		root.getAddresses().setAddress(addressList);
		return JaxbUtil.convertToXml(root);
//		String queryAddressList = (new SfAddrSeverSVImplServiceLocator()).getRESaddr4CRM().queryAddressList(cO, pOBox, city, county, streetName, houseNo, houseLetter, floor,
//				apartment, doorNo, mainDoor, municipality, zipCode, country, startIndex, pageSize);
//		return queryAddressList;
	}
	
	public static String suspendResume(String soCoSerial, String soOrderId, String dslId,String prodInsId,String operReason,String sRegionId,boolean isStop)throws RemoteException, Exception{
		return SfWsClient.getSfWsClient().suspendResume(soCoSerial, soOrderId, dslId, prodInsId, operReason, sRegionId, isStop);
	}
	
	public static String provNPVoip(String soCoSerial, String soOrderId, String voipNumber, String sRegionId) throws Exception{
		return SfWsClient.getSfWsClient().provNPVoip(soCoSerial, soOrderId, voipNumber, sRegionId);
	}
	
	public static String provCpe(String dslId, String prodInsId, String cpeSerial,String cpeType, String sRegionId) throws Exception{
		return SfWsClient.getSfWsClient().provCpe(dslId, prodInsId, cpeSerial,cpeType,sRegionId);
	}
	
	//DM002 for OSE,2017-4-18
	public static String validateAddressForDM002(String addrXml, String sRegionId) throws RemoteException, Exception {
		return SfWsClient.getSfWsClient().validateAddress(addrXml, sRegionId);
	}

	public static String getOfflinePreQResultForDM002(String xmlStrInfo, String sRequestFormat, String sTenantId) throws RemoteException, Exception {
		return  SfAddrWsClient.getSfAddrWsClient().getOfflinePreQResult(xmlStrInfo, sRequestFormat, sTenantId);
	}
	
}
