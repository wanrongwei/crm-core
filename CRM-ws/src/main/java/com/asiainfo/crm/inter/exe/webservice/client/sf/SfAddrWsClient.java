package com.asiainfo.crm.inter.exe.webservice.client.sf;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.complex.tab.split.TenantIDFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.appframe2.util.StringUtils;
import com.asiainfo.appframe.ext.exeframe.ws.client.WsClient;
import com.asiainfo.crm.cm.common.service.interfaces.IAddressSV;
import com.asiainfo.crm.cm.common.util.ws.JaxbUtil;
import com.asiainfo.crm.cm.common.util.ws.address;
import com.asiainfo.crm.cm.common.util.ws.addresses4Qry;
import com.asiainfo.crm.cm.common.util.ws.addressids;
import com.asiainfo.crm.cm.common.util.ws.root;
import com.asiainfo.crm.so.exe.ws.Map2Xml;

public class SfAddrWsClient extends WsClient {

	private static final String SAVE_ADDRESS = "saveAddress";
	private static final String GET_ADDRESS = "getAddress";
	private static final String QUERY_ADDRESS_LIST = "queryAddressList";
	private static final String QUERY_CITY_LIST_BY_DISTRICT_ID = "queryCityListByDistrictId";
	private static final String QUERY_DISTRICT_TREE_HIERARCHY = "queryDistrictTreeHierarchy";
	private static final String QUERY_ADDRESS_LIST_COUNT = "queryAddressListCount";
	private static final String QUERY_ADDRESS_LIST_BY_ADDRESS_TYPE = "queryAddressListByAddressType";
	private static final String GET_OFFLINE_PREQ_RESULT = "getOfflinePreQResult";

	private static final String requestFormat = "XML";
	private transient Log log = LogFactory.getLog(SfAddrWsClient.class);

	private static SfAddrWsClient client;

	private static final String SF_ADDR_WS_CLIENT_CODE = "SFF2CustMgr";

	private SfAddrWsClient(String cfgWsClientCode) throws Exception {
		super(cfgWsClientCode);
	}

	public static synchronized  SfAddrWsClient getSfAddrWsClient() throws Exception {
		if (null == client) {
			client = new SfAddrWsClient(SF_ADDR_WS_CLIENT_CODE);
		}
		return client;
	}

	@SuppressWarnings("all")
	public String saveAddress(String addrInfo, String districtId) throws RemoteException, Exception {
//		return this.invodeInterFunc(SAVE_ADDRESS, new Object[] { addrInfo, districtId });
		IAddressSV addressSV=(IAddressSV)ServiceFactory.getService(IAddressSV.class);
		root root = JaxbUtil.converyToJavaBean(addrInfo, root.class);
		address address = root.getAddresses().getAddress();
		long addressId = addressSV.saveAddress(address);
		root retRoot = new root();
		addressids addressids = new addressids();
		addressids.setAddressid(addressId);
		retRoot.setAddressids(addressids);
		return JaxbUtil.convertToXml(retRoot);
//		return this.invodeInterFunc(SAVE_ADDRESS, new Object[] { addrInfo, requestFormat,TenantIDFactory.getTenantId() });
	}

	/*private address transAddress(Address inputAddress){
		address address = new address();
		if(inputAddress == null){
			return null;
		}else{
			address.setAddrDesc(inputAddress.getAddrDesc());
			address.setAddressId(inputAddress.getAddressId());
			address.setAddressType(inputAddress.getAddressType());
			address.setApartment(inputAddress.getApartment());
			address.setBlackState(inputAddress.getBlackState());
			address.setCity(inputAddress.getCity());
//			address.setCoName(inputAddress.getCo)
			address.setCountry(inputAddress.getCountry());
			address.setCounty(inputAddress.getCounty());
			address.setDeliveryState(inputAddress.getDeliveryState());
			address.setDistrictId(String.valueOf(inputAddress.getDistrictId()));
			address.setDoorNumber(inputAddress.getDoorNumber());
			address.setFloor(inputAddress.getFloor());
			address.setHouseLetter(inputAddress.getHouseLetter());
			address.setHouseNumber(inputAddress.getHouseNumber());
			address.setMainDoor(inputAddress.getMainDoor());
			address.setMunicipality(inputAddress.getMunicipality());
//			address.setPoBox(inputAddress.getP)
			address.setStreetName(inputAddress.getStreetName());
			address.setZipcode(inputAddress.getStreetName());
		}
		return address;
	}*/
	public String getAddress(String addrIdInfo, String districtId) throws RemoteException, Exception {
		return this.invodeInterFunc(GET_ADDRESS, new Object[] { addrIdInfo, requestFormat,TenantIDFactory.getTenantId()});
//		return this.invodeInterFunc(GET_ADDRESS, new Object[] { addrIdInfo, districtId });
	}
	
//	public String getAddress(String addrIdInfo, String sRequestFormat, String sTenantId) throws RemoteException, Exception {
//		if(StringUtils.isEmptyString(sRequestFormat)){
//			sRequestFormat = "XML";
//		}
//		if(StringUtils.isEmptyString(sTenantId)){
//			sTenantId = "21";
//		}
//		return this.invodeInterFunc(GET_ADDRESS, new Object[] { addrIdInfo, sRequestFormat,sTenantId });
//	}

	public String queryAddressList(String districtId, String streetName, String zipCode, String city, String county,
			String startIndex, String pageSize) throws RemoteException, Exception {
		return this.invodeInterFunc(QUERY_ADDRESS_LIST, new Object[] { districtId, streetName, zipCode, city, county,
				startIndex, pageSize});
	}

	public String queryCityListByDistrictId(String districtId) throws RemoteException, Exception {
		return this.invodeInterFunc(QUERY_CITY_LIST_BY_DISTRICT_ID, new Object[] { districtId });
	}

	public String queryDistrictTreeHierarchy(String districtId) throws RemoteException, Exception {
		return this.invodeInterFunc(QUERY_DISTRICT_TREE_HIERARCHY, new Object[] { districtId });
	}

	public int queryAddressListCount(String districtId, String streetName, String zipCode, String city, String county,
			String addressType, int suggestionType, int soundexVal) throws RemoteException, Exception {
		String retMsg = this.invodeInterFunc(QUERY_ADDRESS_LIST_COUNT, new Object[] { districtId, streetName, zipCode,
				city, county, addressType, suggestionType, soundexVal });
		return retMsg == null ? 0 : Integer.parseInt(retMsg);
	}

	public String queryAddressListByAddressType(String districtId, String streetName, String zipCode, String city,
			String county, String addressType, int suggestionType, int soundexVal, int startIndex, int pageSize)
			throws RemoteException, Exception {
		return this.invodeInterFunc(QUERY_ADDRESS_LIST_BY_ADDRESS_TYPE, new Object[] { districtId, streetName, zipCode,
				city, county, addressType, suggestionType, soundexVal, startIndex, pageSize });
	}

	@SuppressWarnings("deprecation")
	protected String invodeInterFunc(String funcName, Object params[]) throws Exception {
		String tmpResStr = null;
		if (funcName != null && !StringUtils.isEmptyString(funcName)) {
			long beginTime = System.currentTimeMillis();
			try {
				String startParams = "";
				for (int i = 0; i < params.length; i++) {
					if (i > 0) {
						startParams += ",";
					}
					if (params[i] != null) {
						startParams += params[i].toString();
					}
				}
				logInfo(funcName, "Start:params[" + startParams + "]");
				Object tmp = this.invoke(funcName, params);
				if (tmp == null) {
					return "";
				}
				if (tmp instanceof String) {
					tmpResStr = (String) tmp;
				} else if (tmp instanceof Long) {
					if ((Long) tmp == 0) {
						tmpResStr = null;
					} else {
						tmpResStr = String.valueOf(tmp);
					}
				} else if (tmp instanceof Integer) {
					if ((Integer) tmp == 0) {
						tmpResStr = null;
					} else {
						tmpResStr = String.valueOf(tmp);
					}
				} else if (tmp.getClass().isArray()) {
					String[] obj = (String[]) tmp;
					Map map = new HashMap();
					map.put("returnCode", String.valueOf(obj[0]));
					map.put("returnMsg", String.valueOf(obj[1]));
					tmpResStr = Map2Xml.MapToXml(map, "outParam");
				}
				long endTime = System.currentTimeMillis();
				logInfo(funcName, "End:total time[" + String.valueOf(endTime - beginTime) + "],return[" + tmpResStr
						+ "]");
			} catch (Exception E) {
				long endTime = System.currentTimeMillis();
				logInfo(funcName,
						"Error:total time[" + String.valueOf(endTime - beginTime) + "],error[" + E.getMessage() + "]");
				throw E;
			}
		}
		return tmpResStr;
	}
	
	// DM002
	public String getOfflinePreQResult(String xmlStrInfo, String sRequestFormat, String sTenantId) throws Exception{
		return this.invodeInterFunc(GET_OFFLINE_PREQ_RESULT, new Object[]{xmlStrInfo, sRequestFormat, sTenantId});
	}

	protected void logInfo(String funcName, String logStr) {
		log.debug("SfAddrWsClient invoke funcName:" + funcName + "	" + logStr);
	}

}
