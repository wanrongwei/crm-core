package com.asiainfo.crm.cm.common.service.impl;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.complex.tab.split.TenantIDFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.ivalues.IBOBsDistrictValue;
import com.ai.common.util.DistrictUtil;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.service.interfaces.IAddressSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.common.util.CmDistrictUtil;
import com.asiainfo.crm.cm.common.util.ws.JaxbUtil;
import com.asiainfo.crm.cm.common.util.ws.WebServiceClient;
import com.asiainfo.crm.cm.common.util.ws.address;
import com.asiainfo.crm.cm.common.util.ws.address4QryContion;
import com.asiainfo.crm.cm.common.util.ws.addresses;
import com.asiainfo.crm.cm.common.util.ws.addressids;
import com.asiainfo.crm.cm.common.util.ws.root;
import com.asiainfo.crm.cm.common.util.ws.root4Qry;
import com.asiainfo.crm.cm.common.util.ws.hu.AddressResult;
import com.asiainfo.crm.cm.common.util.ws.hu.AddressResult.Addresses;
import com.asiainfo.crm.cm.common.util.ws.hu.AddressResult.Addresses.Address;
import com.asiainfo.crm.cm.common.util.ws.hu.Root;
import com.asiainfo.crm.cm.common.util.ws.hu.address4Hu;
import com.asiainfo.crm.cm.common.util.ws.hu.root4Hu;

public class AddressSVImpl implements IAddressSV {

	public static final String GET_ADDRESS = "getAddress";// cfg_ws_client_method表METHOD_NAME
	public static final String SAVE_ADDRESS = "saveAddress";// cfg_ws_client_method表METHOD_NAME
	public static final String SFF2_CUST_MGR = "SFF2CustMgr";// cfg_ws_client表CFG_WS_CLIENT_CODE
	public static final String SFF2_CUST_MGR_NEW = "SFF2CustMgrNew";// cfg_ws_client表CFG_WS_CLIENT_CODE
	public static final String QUERY_ADDRESSLIST_COUNT = "queryAddressListCount";// cfg_ws_client_method表METHOD_NAME
	public static final String QUERY_ADDRESSLIST = "queryAddressList";// cfg_ws_client_method表METHOD_NAME
	public static final String GET_ADDRESS_FROM_DB = "getAddressFromDB";// cfg_ws_client_method表METHOD_NAME
	private static final Log log = LogFactory.getLog(AddressSVImpl.class);
	/*
	 * (non-Javadoc)
	 * @see
	 * com.asiainfo.crm.cm.common.service.interfaces.IAddressSV#saveAddress(com.asiainfo.crm.cm.common.util.ws.address)
	 */
	public long saveAddress(address address) throws Exception {
		/*
		 * // 校验地址参数
		 * vaildAddress(address);
		 * // 构造xml层级对象
		 * addresses addresses = new addresses();
		 * addresses.setAddress(address);
		 * root root = new root();
		 * root.setAddresses(addresses);
		 * String addrInfo = JaxbUtil.convertToXml(root);
		 * String districtId = address.getDistrictId();
		 * Object[] obj = new Object[] { addrInfo, districtId };
		 * WebServiceClient client = new WebServiceClient();
		 * Object rtObj = client.WebServiceCall(SFF2_CUST_MGR, SAVE_ADDRESS, obj);
		 * long addressId = -1;
		 * if (rtObj != null) {
		 * root rtroot = (root) JaxbUtil.converyToJavaBean(rtObj.toString(), root.class);
		 * addressId = rtroot.getAddressids().getAddressid();
		 * if (addressId <= 0) {
		 * // 输入的地址不合法或不是丹麦地址！
		 * ExceptionUtil.throwBusinessException("CMS0000167");
		 * }
		 * }
		 * return addressId;
		 */
		return saveAddress(address, null, null);
	}

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.common.service.interfaces.IAddressSV#getAddress(long)
	 */
	public address getAddress(long addressId, String districtId) throws Exception {
		address returnAddress = null;
		if (addressId < 0) {
			ExceptionUtil.throwBusinessException("CMS0000360", "addressId");
		} else {
			addressids addressids = new addressids();
			addressids.setAddressid(addressId);
			root root = new root();
			root.setAddressids(addressids);
			String addrInfo = JaxbUtil.convertToXml(root);
			/*
			 * // districtId已经修改为最新
			 * districtId = getDefaultDistrictId();// 查询地址时，districtId默认为国家的
			 */Object[] obj = new Object[] { addrInfo, "XML", TenantIDFactory.getTenantId() };
			WebServiceClient client = new WebServiceClient();
			Object rtObj = client.WebServiceCall(SFF2_CUST_MGR_NEW, GET_ADDRESS_FROM_DB, obj);
			if (rtObj != null) {
				root rtroot = (root) JaxbUtil.converyToJavaBean(rtObj.toString(), root.class);
				returnAddress = rtroot.getAddresses().getAddress();
			}
		}
		if (null != returnAddress && null != returnAddress.getAddrDesc()) {
			String addressDesc = CmCommonUtil.getStandAddressDesc(returnAddress);
			returnAddress.setAddrDesc(addressDesc);
		}
		return returnAddress;
	}

	private void vaildAddress(address address) throws Exception {
		if (StringUtils.isBlank(address.getAddressType())) {
			ExceptionUtil.throwBusinessException("CMS0000360", "ADDRESS_TYPE");
		} else {
			if (address.getAddressType().equals("MANUAL_ADDRESS")) {
				// 人工创建地址
				String districtId = address.getDistrictId();
				String city = address.getCity();
				if (StringUtils.isNotBlank(city)) {
					address.setCity(city);
				} else {
					if("Y".equals(address.getIsForeign()) && StringUtils.isBlank(districtId) ){
						return;
					}
					if (StringUtils.isBlank(districtId)) {
						throw new Exception(" districtId is not allowed empty ");
					} else {
						IBOBsDistrictValue distictVal = DistrictUtil.getDistrictByDistrictId(Long.parseLong(districtId));
						if (distictVal == null) {
							throw new Exception(" districtId:[" + districtId + "] is not valid ");
						}
						address.setCity(distictVal.getDistrictName());
						if (StringUtils.isBlank(address.getStreetName())) {
							throw new Exception(" streetname is not allowed empty ");
						}
					}
				}
			} else {
				// 后台创建地址
				String cityName = address.getCity();
				if (StringUtils.isNotBlank(cityName)) {// 标准地址，根据city获取districtId
					IBOBsDistrictValue val = CmDistrictUtil.getDistrictByCityname(cityName);
					if (val != null) {
						address.setDistrictId(String.valueOf(val.getDistrictId()));
					} else {
						address.setDistrictId(getDefaultDistrictId());
						address.setAddressType("FOREIGN_ADDRESS");
					}
				} else {// 非标准地址，默认传入国家对应的districtId
					if (StringUtils.isBlank(address.getAddrDesc())) {
						ExceptionUtil.throwBusinessException("CMS9998758");
					}
					address.setDistrictId(getDefaultDistrictId());
					address.setAddressType("NON_STANDARD_ADDRESS");
				}
			}
			if (StringUtils.isEmpty(address.getCountry())) {
				address.setCountry("Denmark");
			}
		}
	}

	/**
	 * 根据租户获取对应国家的districtId
	 * @Function getDefaultDistrictId
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-9-18 上午11:33:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-18     yangjh           v1.0.0               修改原因<br>
	 */
	public String getDefaultDistrictId() throws Exception {
		String districtid = null;
		int districtTypeId = -1;
		// 获取当前租户的地区信息
		IBOBsDistrictValue[] vals = DistrictUtil.getAllDistrictByCurrentTenantId();
		if (vals != null && vals.length > 0) {
			for (int i = 0; i < vals.length; i++) {
				districtTypeId = vals[i].getDistrictTypeId();
				if (districtTypeId == CmConstants.AddressDistrictId.DISTRICT_TYPE_COUNTRY) {
					if (vals[i].getDistrictId() > 0) {
						districtid = String.valueOf(vals[i].getDistrictId());
						break;
					}
				}
			}
		}
		return districtid;
	}

	public address getAddressInfo(long addressId, String districtId) throws Exception {
		address returnAddress = null;
		if (addressId < 0) {
			ExceptionUtil.throwBusinessException("CMS0000360", "addressId");
		} else {
			addressids addressids = new addressids();
			addressids.setAddressid(addressId);
			root root = new root();
			root.setAddressids(addressids);
			String addrInfo = JaxbUtil.convertToXml(root);
			/*
			 * // districtId已经修改为最新
			 * districtId = getDefaultDistrictId();// 查询地址时，districtId默认为国家的
			 */Object[] obj = new Object[] { addrInfo, "XML", TenantIDFactory.getTenantId() };
			WebServiceClient client = new WebServiceClient();
			Object rtObj = client.WebServiceCall(SFF2_CUST_MGR_NEW, GET_ADDRESS_FROM_DB, obj);
			if (rtObj != null) {
				root rtroot = (root) JaxbUtil.converyToJavaBean(rtObj.toString(), root.class);
				returnAddress = rtroot.getAddresses().getAddress();
			}
		}
		if (null != returnAddress && null != returnAddress.getAddrDesc()) {
			String addressDesc = returnAddress.getAddrDesc();
			if (addressDesc.indexOf("\\n") != -1) {
				addressDesc = returnAddress.getAddrDesc().split("\\\\n")[0].trim();
			}
			returnAddress.setAddrDesc(addressDesc);
		}
		return returnAddress;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.asiainfo.crm.cm.common.service.interfaces.IAddressSV#saveAddress(com.asiainfo.crm.cm.common.util.ws.address,
	 * java.lang.String, java.lang.String)
	 */
	public long saveAddress(address address, String sRequestFormat, String sTenantId) throws Exception {

		// 校验地址参数
		vaildAddress(address);
		if(!"Y".equals(address.getIsForeign())){
			splitHouseNumber(address);
		}
		
		if(null!=address.getStreetName2()&&address.getStreetName2().length()>0){
			// 如果有值不做处理
		}else{
			// 设置默认值给SFF
			address.setStreetName2("");
		}
		if(null!=address.getStreetName3()&&address.getStreetName3().length()>0){
			// 如果有值不做处理
		}else{
			// 设置默认值给SFF
			address.setStreetName3("");
		}
		
		
		if (StringUtils.isNotBlank(address.getFloor()) && StringUtils.isNumeric(address.getFloor())) {
			address.setFloor(String.valueOf(DataType.getAsInt(address.getFloor())));
		}
		// 构造xml层级对象
		addresses addresses = new addresses();
		addresses.setAddress(address);
		root root = new root();
		root.setAddresses(addresses);
		root.setDistrictId(address.getDistrictId());
		String addrInfo = JaxbUtil.convertToXml(root);
		if (StringUtils.isBlank(sRequestFormat)) {
			sRequestFormat = "XML";
		}
		if (StringUtils.isBlank(sTenantId)) {
			sTenantId = TenantIDFactory.getTenantId();
		}
		
		log.debug("=====saveAddress=="+addrInfo);
		Object[] obj = new Object[] { addrInfo, sRequestFormat, sTenantId };
		WebServiceClient client = new WebServiceClient();
		Object rtObj = client.WebServiceCall(SFF2_CUST_MGR_NEW, SAVE_ADDRESS, obj);
		long addressId = -1;
		if (rtObj != null) {
			root rtroot = (root) JaxbUtil.converyToJavaBean(rtObj.toString(), root.class);
			addressId = rtroot.getAddressids().getAddressid();
			if (addressId <= 0) {
				// 输入的地址不合法或不是丹麦地址！
				ExceptionUtil.throwBusinessException("CMS0000167");
			}
		}
		return addressId;
	}

	/**
	 * AI-13218
	 * GetIndividualInfo when parameter houseNumber not all numbers,should spite house number and house letter
	 * @param address
	 */
	private void splitHouseNumber(address address) {
		try {
			String houseNo = address.getHouseNumber();
			String houseLetter = address.getHouseLetter();
			if (StringUtils.isNotBlank(houseNo)) {
				int length = houseNo.length();
				if (Character.isLetter(houseNo.charAt(length - 1))) {
					houseLetter = houseNo.substring(length - 1, length);
					houseNo = houseNo.substring(0, length - 1);
				}
			}
			address.setHouseNumber(houseNo);
			address.setHouseLetter(houseLetter);
		} catch (Exception e) {
			log.error("splitHouseNumber occur exception.", e);
		}
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.asiainfo.crm.cm.common.service.interfaces.IAddressSV#queryAddressListCount(com.asiainfo.crm.cm.common.util
	 * .ws.address4Qry, java.lang.String, java.lang.String)
	 */
	public int queryAddressListCount(address4QryContion address, String sRequestFormat, String sTenantId) throws Exception {
		int count = 0;
		if (address == null) {
			throw new Exception(" query  condtions is empty ");
		} else {
			address.setSuggestiontype(1);// 默认支持模糊查询
			String addrInfo = JaxbUtil.convertToXml(address);
			if (StringUtils.isBlank(sRequestFormat)) {
				sRequestFormat = "XML";
			}
			if (StringUtils.isBlank(sTenantId)) {
				sTenantId = TenantIDFactory.getTenantId();
			}
			Object[] obj = new Object[] { addrInfo, sRequestFormat, sTenantId };
			WebServiceClient client = new WebServiceClient();
			Object rtObj = client.WebServiceCall(SFF2_CUST_MGR_NEW, QUERY_ADDRESSLIST_COUNT, obj);
			if (rtObj != null) {
				count = Integer.valueOf(String.valueOf(rtObj));

			}

		}
		return count;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.asiainfo.crm.cm.common.service.interfaces.IAddressSV#queryAddressList(com.asiainfo.crm.cm.common.util.ws.
	 * address4Qry, java.lang.String, java.lang.String, int, int)
	 */
	public address[] queryAddressList(address4QryContion address, String sRequestFormat, String sTenantId, int strIdx, int endIdx) throws Exception {
		address[] listAddress = null;
		if (address == null) {
			throw new Exception(" query  condtions is empty ");
		} else {
			if (strIdx < 0 && endIdx < 0) {
				address.setStartIndex(1);
				address.setPageSize(9);
			} else {
				address.setStartIndex(strIdx / 9 + 1);
				address.setPageSize(endIdx - strIdx + 1);
			}
			address.setSuggestiontype(1);// 默认支持模糊查询
			String addrInfo = JaxbUtil.convertToXml(address);
			if (StringUtils.isBlank(sRequestFormat)) {
				sRequestFormat = "XML";
			}
			if (StringUtils.isBlank(sTenantId)) {
				sTenantId = TenantIDFactory.getTenantId();
			}
			Object[] obj = new Object[] { addrInfo, sRequestFormat, sTenantId };
			WebServiceClient client = new WebServiceClient();
			Object rtObj = client.WebServiceCall(SFF2_CUST_MGR_NEW, QUERY_ADDRESSLIST, obj);
			if (rtObj != null) {
				root4Qry root = (root4Qry) JaxbUtil.converyToJavaBean(rtObj.toString(), root4Qry.class);
				listAddress = root.getAddresses().getAddress();
			}
			if (listAddress != null && listAddress.length > 0) {
				// 拼接pob和co
				for (int i = 0, len = listAddress.length; i < len; i++) {
					listAddress[i].setAddrDesc(CmCommonUtil.getStandAddressDesc(listAddress[i]));
				}
			}
		}
		return listAddress;
	}

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.common.service.interfaces.IAddressSV#getAllDistrictByDistrictType(int)
	 */
	public IBOBsDistrictValue[] getAllDistrictByDistrictType(int districtType) throws Exception {
		IBOBsDistrictValue[] vals = DistrictUtil.getAllDistrictByCurrentTenantId();
		if (vals != null && vals.length > 0) {
			List<IBOBsDistrictValue> list = new ArrayList<IBOBsDistrictValue>();
			for (int i = 0; i < vals.length; i++) {
				if (vals[i].getDistrictTypeId() == districtType) {
					list.add(vals[i]);
				}
			}
			if (list.size() > 0) {
				return (IBOBsDistrictValue[]) list.toArray(new IBOBsDistrictValue[0]);
			}
		}
		return null;
	}

	@Override
	public int queryAddressListCount(String xmlCondition) throws Exception {
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(xmlCondition);
		IAddressSV addressSV = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
		address4QryContion condition = new address4QryContion();
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			condition.setZipcode(dcs[0].getAsString("ZIPCODE"));
			condition.setMunicipality(dcs[0].getAsString("MUNICIPALITY"));
			if (dcs[0].getAsLong("EXT9") > 0) {
				IBOBsDistrictValue distictVal = DistrictUtil.getDistrictByDistrictId(dcs[0].getAsLong("EXT9"));
				condition.setCity(distictVal.getDistrictName());
			} else {
				condition.setCity(dcs[0].getAsString("EXT20"));
			}

			condition.setStreetName(dcs[0].getAsString("EXT7"));
			condition.setHouseNumber(dcs[0].getAsString("EXT6"));
			condition.setHouseLetter(dcs[0].getAsString("EXT5"));

			condition.setFloor(dcs[0].getAsString("EXT4"));
			condition.setApartment(dcs[0].getAsString("EXT3"));
			condition.setDoorNumber((dcs[0].getAsString("EXT2")));

			condition.setMainDoor(dcs[0].getAsString("EXT1"));
			condition.setCounty(dcs[0].getAsString("EXT8"));
			condition.setPoBox((dcs[0].getAsString("EXT10")));

			condition.setCoName((dcs[0].getAsString("EXT11")));

			condition.setCountry(dcs[0].getAsString("COUNTRY"));
			
			String streetName2 = dcs[0].getAsString("EXT12");
			if(null!=streetName2&&streetName2.length()>0&&!"null".equalsIgnoreCase(streetName2)){
				condition.setStreetName2(streetName2);
			}
			
			String streetName3 = dcs[0].getAsString("EXT13");
			if(null!=streetName3&&streetName3.length()>0&&!"null".equalsIgnoreCase(streetName3)){
				condition.setStreetName3(streetName3);
			}
			return addressSV.queryAddressListCount(condition, null, null);

		}
		return 0;
	}

	@Override
	public DataContainer[] queryAddressList(String xmlCondition, int strIdx, int endIdx) throws Exception {
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(xmlCondition);
		IAddressSV addressSV = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
		address4QryContion condition = new address4QryContion();
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			condition.setZipcode(dcs[0].getAsString("ZIPCODE"));
			condition.setMunicipality(dcs[0].getAsString("MUNICIPALITY"));
			if (dcs[0].getAsLong("EXT9") > 0) {
				IBOBsDistrictValue distictVal = DistrictUtil.getDistrictByDistrictId(dcs[0].getAsLong("EXT9"));
				condition.setCity(distictVal.getDistrictName());
			} else {
				condition.setCity(dcs[0].getAsString("EXT20"));
			}
			condition.setStreetName(dcs[0].getAsString("EXT7"));
			condition.setHouseNumber(dcs[0].getAsString("EXT6"));
			condition.setHouseLetter(dcs[0].getAsString("EXT5"));

			condition.setFloor(dcs[0].getAsString("EXT4"));
			condition.setApartment(dcs[0].getAsString("EXT3"));
			condition.setDoorNumber((dcs[0].getAsString("EXT2")));

			condition.setMainDoor(dcs[0].getAsString("EXT1"));
			condition.setCounty(dcs[0].getAsString("EXT8"));
			condition.setPoBox((dcs[0].getAsString("EXT10")));

			condition.setCoName((dcs[0].getAsString("EXT11")));
			condition.setCountry(dcs[0].getAsString("COUNTRY"));
			
			String streetName2 = dcs[0].getAsString("EXT12");
			if(null!=streetName2&&streetName2.length()>0&&!"null".equalsIgnoreCase(streetName2)){
				condition.setStreetName2(streetName2);
			}
			
			String streetName3 = dcs[0].getAsString("EXT13");
			if(null!=streetName3&&streetName3.length()>0&&!"null".equalsIgnoreCase(streetName3)){
				condition.setStreetName3(streetName3);
			}
			

		}
		com.asiainfo.crm.cm.common.util.ws.address address[] = addressSV.queryAddressList(condition, null, null, strIdx, endIdx);
		if (CmCommonUtil.isNotEmptyObject(address)) {
			DataContainer result[] = new DataContainer[address.length];
			for (int i = 0; i < address.length; i++) {
				result[i] = new DataContainer();
				result[i].set("ADDRESS_ID", address[i].getAddressId());
				result[i].set("ZIPCODE", address[i].getZipcode());
				result[i].set("MUNICIPALITY", address[i].getMunicipality());
				result[i].set("EXT9", address[i].getCity());
				result[i].set("EXT7", address[i].getStreetName());
				result[i].set("EXT6", address[i].getHouseNumber());
				result[i].set("EXT5", address[i].getHouseLetter());
				result[i].set("EXT4", address[i].getFloor());
				result[i].set("EXT3", address[i].getApartment());
				result[i].set("EXT2", address[i].getDoorNumber());
				result[i].set("EXT1", address[i].getMainDoor());
				result[i].set("EXT8", address[i].getCounty());
				result[i].set("EXT10", address[i].getPoBox());
				result[i].set("EXT11", address[i].getCoName());
				result[i].set("EXT12", address[i].getStreetName2());
				result[i].set("EXT13", address[i].getStreetName3());
				result[i].set("COUNTRY", address[i].getCountry());
				result[i].set("ADDRESS_TYPE", address[i].getAddressType());
				result[i].set("ADDR_DESC", CmCommonUtil.getStandAddressDesc(address[i]));

			}
			return result;
		}
		return new DataContainer[0];
	}

	@Override
	public int queryAddressListCount4hu(String XML) throws Exception {
		List<DataContainer> resultList = new ArrayList<DataContainer>();
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(XML);
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			Root root = new Root();
			List<Root.Address> listAddress = root.getAddress();
			Root.Address address = new Root.Address();
			address.setSUGGESTIONTYPE("1");
			address.setSOUNDEXVAL("0");
			address.setZIPCODE(dcs[0].getAsString("ZIPCODE"));
			address.setADDITIONALHOUSENUMBER(dcs[0].getAsString("ADDITION"));
			address.setISBLACKLIST(dcs[0].getAsString("IS_BLACKLIST"));
			address.setCOUNTRY(dcs[0].getAsString("COUNTRY"));
			String city = dcs[0].getAsString("CITY");
			if (StringUtils.isNotBlank(city)) {
				IBOBsDistrictValue distictVal = DistrictUtil.getDistrictByDistrictId(Long.parseLong(city));
				address.setCITY(distictVal.getDistrictName());
			}
			address.setISVALIDATED(dcs[0].getAsString("IS_VALIDATE"));
			address.setSTREETNAME(dcs[0].getAsString("STREETNAME"));
			address.setDISTRICTID(dcs[0].getAsString(""));
			address.setSOURCE(dcs[0].getAsString("SOURCE"));
			address.setHOUSENUMBER(dcs[0].getAsString("HOUSRNUMBER"));
			address.setSTREETTYPE(dcs[0].getAsString("STREETTYPE"));
			listAddress.add(address);
			JAXBContext context = JAXBContext.newInstance(Root.class);
			Marshaller marshaller = context.createMarshaller();
			StringWriter writer = new StringWriter();
			marshaller.marshal(root, writer);
			String addrInfo = writer.toString();
			String sRequestFormat = "XML";
			String sTenantId = TenantIDFactory.getTenantId();
			Object[] obj = new Object[] { addrInfo, sRequestFormat, sTenantId };
			WebServiceClient client = new WebServiceClient();
			Object rtObj = client.WebServiceCall(SFF2_CUST_MGR_NEW, QUERY_ADDRESSLIST_COUNT, obj);
			return DataType.getAsInt(rtObj);
		}
		return 0;
	}

	@Override
	public DataContainer[] queryAddressList4hu(String XML, int strIdx, int endIdx) throws Exception {
		List<DataContainer> resultList = new ArrayList<DataContainer>();
		DataContainer[] dcs = ParamUtil.parseXmlCriteria(XML);
		if (CmCommonUtil.isNotEmptyObject(dcs)) {
			Root root = new Root();
			List<Root.Address> listAddress = root.getAddress();
			Root.Address address = new Root.Address();
			/*
			 * address.setSTARTINDEX(String.valueOf(strIdx));
			 * address.setPAGESIZE(String.valueOf(endIdx-strIdx));
			 */
			if (strIdx < 0 && endIdx < 0) {
				address.setSTARTINDEX("1");
				address.setPAGESIZE("9");
			} else {
				address.setSTARTINDEX(String.valueOf(strIdx / 9 + 1));
				address.setPAGESIZE(String.valueOf(endIdx - strIdx + 1));
			}
			address.setSUGGESTIONTYPE("1");
			address.setSOUNDEXVAL("0");
			address.setZIPCODE(dcs[0].getAsString("ZIPCODE"));
			address.setADDITIONALHOUSENUMBER(dcs[0].getAsString("ADDITION"));
			address.setISBLACKLIST(dcs[0].getAsString("IS_BLACKLIST"));
			address.setCOUNTRY(dcs[0].getAsString("COUNTRY"));
			String city = dcs[0].getAsString("CITY");
			if (StringUtils.isNotBlank(city)) {
				IBOBsDistrictValue distictVal = DistrictUtil.getDistrictByDistrictId(Long.parseLong(city));
				address.setCITY(distictVal.getDistrictName());
			}
			address.setISVALIDATED(dcs[0].getAsString("IS_VALIDATE"));
			address.setSTREETNAME(dcs[0].getAsString("STREETNAME"));
			address.setDISTRICTID(dcs[0].getAsString(" "));
			address.setSOURCE(dcs[0].getAsString("SOURCE"));
			address.setHOUSENUMBER(dcs[0].getAsString("HOUSRNUMBER"));
			address.setSTREETTYPE(dcs[0].getAsString("STREETTYPE"));
			listAddress.add(address);
			JAXBContext context = JAXBContext.newInstance(Root.class);
			Marshaller marshaller = context.createMarshaller();
			StringWriter writer = new StringWriter();
			marshaller.marshal(root, writer);
			String addrInfo = writer.toString();
			String sRequestFormat = "XML";
			String sTenantId = TenantIDFactory.getTenantId();
			Object[] obj = new Object[] { addrInfo, sRequestFormat, sTenantId };
			WebServiceClient client = new WebServiceClient();
			Object rtObj = client.WebServiceCall(SFF2_CUST_MGR_NEW, QUERY_ADDRESSLIST, obj);
			if (rtObj != null) {
				context = JAXBContext.newInstance(AddressResult.class);
				Unmarshaller unmarshaller = context.createUnmarshaller();
				AddressResult result = (AddressResult) unmarshaller.unmarshal(new StringReader(rtObj.toString()));
				List<Addresses> addressesList = result.getAddresses();
				List<Address> addressList = addressesList.get(0).getAddress();
				Iterator<Address> iterator = addressList.iterator();
				while (iterator.hasNext()) {
					Address addr = iterator.next();
					DataContainer dc = new DataContainer();
					dc.set("ADDITION", addr.getADDITIONALHOUSENUMBER());
					dc.set("ADDRDESC", addr.getADDRDESC());
					dc.set("ADDRESSID", addr.getADDRESSID());
					dc.set("CITY", addr.getCITY());
					dc.set("COUNTRY", addr.getCOUNTRY());
					dc.set("DISTRICTID", addr.getDISTRICTID());
					dc.set("HOUSRNUMBER", addr.getHOUSENUMBER());
					dc.set("IS_BLACKLIST", addr.getISBLACKLIST());
					dc.set("IS_VALIDATE", addr.getISVALIDATED());
					dc.set("SOURCE", addr.getSOURCE());
					dc.set("STREETNAME", addr.getSTREETNAME());
					dc.set("STREETTYPE", addr.getSTREETTYPE());
					dc.set("ZIPCODE", addr.getZIPCODE());
					resultList.add(dc);
				}
			}
			return resultList.toArray(new DataContainer[0]);
		} else {
			return new DataContainer[0];
		}

	}

	public long saveAddress4hu(AddressResult addressInfo) throws Exception {
		long addressId = -1;
		if (addressInfo != null) {
			Address address = addressInfo.getAddresses().get(0).getAddress().get(0);
			// 校验地址
			vaildAddress4Hu(address);
			AddressResult addressResult = new AddressResult();
			List<Addresses> addressesList = addressResult.getAddresses();
			if (addressesList.isEmpty()) {
				Addresses addresses = new Addresses();
				addresses.addAddress(address);
				addressesList.add(addresses);
			} else {
				addressesList.get(0).addAddress(address);
			}

			JAXBContext context = JAXBContext.newInstance(AddressResult.class);
			Marshaller marshaller = context.createMarshaller();
			StringWriter writer = new StringWriter();
			marshaller.marshal(addressResult, writer);
			String addrInfo = writer.toString();
			String sRequestFormat = "XML";
			String sTenantId = TenantIDFactory.getTenantId();
			Object[] obj = new Object[] { addrInfo, sRequestFormat, sTenantId };
			WebServiceClient client = new WebServiceClient();
			Object rtObj = client.WebServiceCall(SFF2_CUST_MGR_NEW, SAVE_ADDRESS, obj);
			if (rtObj != null) {
				root rtroot = (root) JaxbUtil.converyToJavaBean(rtObj.toString(), root.class);
				addressId = rtroot.getAddressids().getAddressid();
				if (addressId <= 0) {
					// 输入的地址不合法或不是丹麦地址！
					throw new Exception("The address is invalid or is not a Denmark address");
				}
			}
		}
		return addressId;
	}

	/**
	 * 地址校验
	 * @Function vaildAddress4Hu
	 * @Description 
	 *
	 * @param address
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2015-12-27 下午4:51:50
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-12-27     yangjh           v1.0.0               修改原因<br>
	 */
	private void vaildAddress4Hu(Address address) throws Exception {
		String getAddressType = address.getSOURCE();
		String streetName = address.getSTREETNAME();
		if (StringUtils.isBlank(getAddressType)) {
			ExceptionUtil.throwBusinessException("CMS0000360", "source");
		} else {
			String cityName = address.getCITY();
			if (StringUtils.isNotBlank(cityName)) {// 标准地址，根据city获取districtId
				IBOBsDistrictValue val = CmDistrictUtil.getDistrictByCityname(cityName);
				if (val != null) {
					address.setDISTRICTID(String.valueOf(val.getDistrictId()));
				} else {
					address.setDISTRICTID(getDefaultDistrictId());
					address.setSOURCE("FOREIGN");
				}
				if (StringUtils.isBlank(address.getZIPCODE())) {
					throw new Exception(" zipCode is not allowed empty ");
				}
				if (StringUtils.isBlank(address.getSTREETTYPE())) {
					throw new Exception(" streetType is not allowed empty ");
				}
				if (StringUtils.isBlank(streetName)) {
					throw new Exception(" streetname is not allowed empty ");
				}
			} else {// 非标准地址，默认传入国家对应的districtId
				if (StringUtils.isBlank(address.getADDRDESC())) {
					ExceptionUtil.throwBusinessException("CMS9998758");
				}
				address.setDISTRICTID(getDefaultDistrictId());
				address.setSOURCE("FOREIGN");
			}

		}
	}

	@Override
	public long saveAddress4Hu(address4Hu addressInfo) throws Exception {
		long addressId = 0;
		AddressResult addressResult = new AddressResult();
		AddressResult.Addresses.Address address = new AddressResult.Addresses.Address();
		address.setADDITIONALHOUSENUMBER(addressInfo.getAdditionalhousenumber());
		address.setCITY(addressInfo.getCity());
		address.setHOUSENUMBER(addressInfo.getHousenumber());
		address.setSOURCE(addressInfo.getSource());
		address.setSTREETNAME(addressInfo.getStreetname());
		address.setSTREETTYPE(addressInfo.getStreettype());
		address.setZIPCODE(addressInfo.getZipcode());
		address.setADDRDESC(addressInfo.getAddrdesc());
		List<Addresses> addressesList = addressResult.getAddresses();
		IAddressSV addressSV = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
		if (addressesList.isEmpty()) {
			Addresses addresses = new Addresses();
			addresses.addAddress(address);
			addressesList.add(addresses);
			addressId = addressSV.saveAddress4hu(addressResult);
		} else {
			addressesList.get(0).addAddress(address);
			addressId = addressSV.saveAddress4hu(addressResult);
		}
		return addressId;
	}

	public address4Hu getAddressById4Hu(long addressId) throws Exception {
		address4Hu returnAddress = null;
		if (addressId < 0) {
			ExceptionUtil.throwBusinessException("CMS0000360", "addressId");
		} else {

		}
		addressids addressids = new addressids();
		addressids.setAddressid(addressId);
		root root = new root();
		root.setAddressids(addressids);
		String addrInfo = JaxbUtil.convertToXml(root);
		Object[] obj = new Object[] { addrInfo, "XML", TenantIDFactory.getTenantId() };
		WebServiceClient client = new WebServiceClient();
		Object rtObj = client.WebServiceCall(SFF2_CUST_MGR_NEW, GET_ADDRESS_FROM_DB, obj);
		if (rtObj != null) {
			root4Hu rtroot = (root4Hu) JaxbUtil.converyToJavaBean(rtObj.toString(), root4Hu.class);
			returnAddress = rtroot.getAddresses().getAddress();
		}

		if (null != returnAddress && null != returnAddress.getAddrdesc()) {
			String addressDesc = returnAddress.getAddrdesc().replaceAll("\\\\n", " ");
			returnAddress.setAddrdesc(addressDesc);
		}
		return returnAddress;
	}

}
