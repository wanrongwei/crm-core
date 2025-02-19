package com.asiainfo.crm.inter.exe.webservice.client.sf;

import java.io.StringReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;

import com.asiainfo.crm.cm.common.util.ws.address;
import com.asiainfo.crm.so.order.fixedline.dto.AddressInfoVo;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer;
import com.thoughtworks.xstream.security.AnyTypePermission;

public class AddressUtil {
	
	private static Log log = LogFactory.getLog(AddressUtil.class);

	private static final String[] ignoreFields = {"serialVersionUID"};
	public static void main(String[] args) throws Exception {

		Map addrMap = new HashMap();
		addrMap.put("Zipcode", "adfasdfasd");
		addrMap.put("DistrictId", "0");
//		Address map2Address = map2Address(addrMap);
//		System.out.println(map2Address);

		Address addr = new Address();
		addr.setAddressId("123");
		addr.setDistrictId(0);
//		Map map = address2Map(addr);
//		System.out.println(map.size());

//		String xmlStr = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><root> <addresses> <address> <ADDRESS_TYPE>CPR_ADDRESS</ADDRESS_TYPE> <DISTRICT_ID>012002002</DISTRICT_ID> <ZIPCODE></ZIPCODE> <CITY>test city1</CITY> <COUNTY>test county1</COUNTY> <STREET_NAME>street name 1</STREET_NAME> <APARTMENT>apartment 1</APARTMENT> <FLOOR>22</FLOOR> <HOUSE_LETTER>house letter1</HOUSE_LETTER> <HOUSE_NUMBER>house number1</HOUSE_NUMBER> <MAIN_DOOR>main door1</MAIN_DOOR> <DOOR_NUMBER>door number1</DOOR_NUMBER> <DELIVERY_STATE>Y</DELIVERY_STATE> <BLACK_STATE>N</BLACK_STATE> <ADDR_DESC>test address description</ADDR_DESC> <MUNICIPALITY>0000</MUNICIPALITY> </address> </addresses> </root> ";
//		String xmlStr2 = "<root>   <addressids>     <addressid>5100075</addressid>   </addressids> </root> ";
//		String xmlStr3 = "<root>  <addressids>   <addressid>5100150</addressid>   <addressid>999999</addressid>  </addressids> </root> ";
//		String xmlStr4 = "<root><addresses><address> <ADDRESS_ID>5335930</ADDRESS_ID> <MAIN_DOOR/> <DOOR_NUMBER/><DIRECTION/><FLOOR/> <HOUSE_LETTER/><HOUSE_NUMBER>1</HOUSE_NUMBER> <STREET_NAME>adc</STREET_NAME><COUNTY/><CITY>Aakirkeby</CITY><PO_BOX/><C_O/><STREET_CODE/><KVHX/> <CREATE_TYPE>A</CREATE_TYPE><ZIPCODE>3433</ZIPCODE> <ADDRESS_TYPE>TDC_ADDRESS</ADDRESS_TYPE><DISTRICT_ID>1000000</DISTRICT_ID><ADDR_DESC>adc 1\n3433 Aakirkeby</ADDR_DESC><COUNTRY>Denmark</COUNTRY><COUNTRY_CODE>DK</COUNTRY_CODE> </address> </addresses></root>";

//		Root xmlRoot = xml2Root(xmlStr);
//		Root xmlRoot2 = xml2Root(xmlStr2);
//		Root xmlRoot3 = xml2Root(xmlStr3);
//		Root xmlRoot4 = xml2Root(xmlStr4);

//		System.out.println(root2Xml(xmlRoot));
//		System.out.println(root2Xml(xmlRoot2));
//		System.out.println(root2Xml(xmlRoot3));
//		System.out.println(root2Xml(xmlRoot4));

	}

	public static ArrayList addresses2List(ArrayList<Address> addresses) {
		ArrayList addressesList = new ArrayList();
		for (Address addr : addresses) {
			addressesList.add(address2Map(addr));
		}
		return addressesList;
	}

	public static Map address2Map(Address address) {
		Map map = new HashMap();
		try {
			Class<Address> clz = Address.class;
			Field[] fields = clz.getDeclaredFields();
			for (Field field : fields) {
				String methodName = getMethodName(field.getName());
				Method method = (Method) clz.getMethod("get" + methodName);
				if (String.class.getName().equals(field.getType().getName())) {
					String value = (String) method.invoke(address);
					if (value != null && !"".equals(value)) {
						map.put(methodName, value);
					}
				}
				if (Integer.class.getName().equals(field.getType().getName())
						|| int.class.getName().equals(field.getType().getName())) {
					int value = (Integer) method.invoke(address);
					if (value != 0) {
						map.put(methodName, value);
					}
				}
				if (Long.class.getName().equals(field.getType().getName())
						|| long.class.getName().equals(field.getType().getName())) {
					long value = (Long) method.invoke(address);
					if (value != 0) {
						map.put(methodName, value);
					}
				}
			}
			return map;
		} catch (Exception e) {
			if(log.isDebugEnabled()){
				log.debug("", e);
			}
			return new HashMap();
		}
	}

	public static Address map2Address(Map addrMap) {
		Address address = new Address();
		try {
			Class<Address> clz = Address.class;
			Field[] fields = clz.getDeclaredFields();
			for (Field field : fields) {
				String methodName = getMethodName(field.getName());
				if (String.class.getName().equals(field.getType().getName())) {
					Method method = (Method) clz.getMethod("set" + methodName, String.class);
					String value = (String) addrMap.get(methodName);
					if (value != null && !"".equals(value)) {
						method.invoke(address, value);
					}
				}
				if (Integer.class.getName().equals(field.getType().getName())
						|| int.class.getName().equals(field.getType().getName())) {
					Method method = (Method) clz.getMethod("set" + methodName, int.class);
					String value = (String) addrMap.get(methodName);
					if (value != null && !"".equals(value)) {
						method.invoke(address, Integer.parseInt(value));
					}
				}
				if (Long.class.getName().equals(field.getType().getName())
						|| long.class.getName().equals(field.getType().getName())) {
					Method method = (Method) clz.getMethod("set" + methodName, long.class);
					String value = (String) addrMap.get(methodName);
					if (value != null && !"".equals(value)) {
						method.invoke(address, Long.parseLong(value));
					}
				}
			}
			return address;
		} catch (Exception e) {
			if(log.isDebugEnabled()){
				log.debug("", e);
			}
			return null;
		}
	}
	
	
	public static address map2AddressNew(Map addrMap) {
		address address = new address();
		try {
			Class<address> clz = address.class;
			Field[] fields = clz.getDeclaredFields();
			for (Field field : fields) {
				boolean ignoreFlag = false;
				for(int i = 0 ; i < ignoreFields.length ; i ++){
					if(field.getName().equals(ignoreFields[i])){
						ignoreFlag = true;
						break ;
					}
				}
				if(ignoreFlag){
					continue;
				}
				String methodName = getMethodName(field.getName());
				if (String.class.getName().equals(field.getType().getName())) {
					Method method = (Method) clz.getMethod("set" + methodName, String.class);
					String value = (String) addrMap.get(methodName);
					if (value != null && !"".equals(value)) {
						method.invoke(address, value);
					}
				}
				if (Integer.class.getName().equals(field.getType().getName())
						|| int.class.getName().equals(field.getType().getName())) {
					Method method = (Method) clz.getMethod("set" + methodName, int.class);
					String value = (String) addrMap.get(methodName);
					if (value != null && !"".equals(value)) {
						method.invoke(address, Integer.parseInt(value));
					}
				}
				if (Long.class.getName().equals(field.getType().getName())
						|| long.class.getName().equals(field.getType().getName())) {
					Method method = (Method) clz.getMethod("set" + methodName, long.class);
					String value = (String) addrMap.get(methodName);
					if (value != null && !"".equals(value)) {
						method.invoke(address, Long.parseLong(value));
					}
				}
			}
			return address;
		} catch (Exception e) {
			if(log.isDebugEnabled()){
				log.debug("", e);
			}
			return null;
		}
	}

	public static Map addressInfoVo2Map(AddressInfoVo address) {
		Map map = new HashMap();
		try {
			Class<AddressInfoVo> clz = AddressInfoVo.class;
			Field[] fields = clz.getDeclaredFields();
			for (Field field : fields) {
				String methodName = getMethodName(field.getName());
				if("SerialVersionUID".equalsIgnoreCase(methodName)){
					continue;
				}
				Method method = (Method) clz.getMethod("get" + methodName);
				if (String.class.getName().equals(field.getType().getName())) {
					String value = (String) method.invoke(address);
					if (value != null && !"".equals(value)) {
						map.put(methodName, value);
					}
				}
				if (Integer.class.getName().equals(field.getType().getName())
						|| int.class.getName().equals(field.getType().getName())) {
					int value = (Integer) method.invoke(address);
					if (value != 0) {
						map.put(methodName, value);
					}
				}
				if (Long.class.getName().equals(field.getType().getName())
						|| long.class.getName().equals(field.getType().getName())) {
					long value = (Long) method.invoke(address);
					if (value != 0) {
						map.put(methodName, value);
					}
				}
			}
			return map;
		} catch (Exception e) {
			if(log.isDebugEnabled()){
				log.debug("", e);
			}
			return new HashMap();
		}
	}
	
	public static AddressInfoVo map2AddressInfoVo(Map addrMap) {
		AddressInfoVo address = new AddressInfoVo();
		try {
			Class<AddressInfoVo> clz = AddressInfoVo.class;
			Field[] fields = clz.getDeclaredFields();
			for (Field field : fields) {
				boolean ignoreFlag = false;
				for(int i = 0 ; i < ignoreFields.length ; i ++){
					if(field.getName().equals(ignoreFields[i])){
						ignoreFlag = true;
						break ;
					}
				}
				if(ignoreFlag){
					continue;
				}
				String methodName = getMethodName(field.getName());
				if (String.class.getName().equals(field.getType().getName())) {
					Method method = (Method) clz.getMethod("set" + methodName, String.class);
					String value = (String) addrMap.get(methodName);
					if (value != null && !"".equals(value)) {
						method.invoke(address, value);
					}
				}
				if (Integer.class.getName().equals(field.getType().getName())
						|| int.class.getName().equals(field.getType().getName())) {
					Method method = (Method) clz.getMethod("set" + methodName, int.class);
					String value = (String) addrMap.get(methodName);
					if (value != null && !"".equals(value)) {
						method.invoke(address, Integer.parseInt(value));
					}
				}
				if (Long.class.getName().equals(field.getType().getName())
						|| long.class.getName().equals(field.getType().getName())) {
					Method method = (Method) clz.getMethod("set" + methodName, long.class);
					String value = (String) addrMap.get(methodName);
					if (value != null && !"".equals(value)) {
						method.invoke(address, Long.parseLong(value));
					}
				}
			}
			return address;
		} catch (Exception e) {
			if(log.isDebugEnabled()){
				log.debug("", e);
			}
			return null;
		}
	}
	
	private static String getMethodName(String fildeName) throws Exception {
		byte[] items = fildeName.getBytes();
		items[0] = (byte) ((char) items[0] - 'a' + 'A');
		return new String(items);
	}

	public static String root2Xml(Root root) {
		XStream xStream = new XStream(new DomDriver("UTF-8", new XmlFriendlyReplacer("$", "_")));
		xStream.alias("root", Root.class);
		xStream.alias("address", Address.class);
		xStream.registerConverter(new RootConverter());
		xStream.registerConverter(new AddressIdConverter());
		return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + xStream.toXML(root);
	}

	public static Root xml2Root(String xml) {
		XStream xStream = new XStream(new DomDriver("UTF-8", new XmlFriendlyReplacer("$", "_")));
		xStream.alias("root", Root.class);
		xStream.alias("address", Address.class);
		xStream.registerConverter(new RootConverter());
		xStream.registerConverter(new AddressIdConverter());
		xStream.addPermission(AnyTypePermission.ANY);
		return (Root) xStream.fromXML(xml);
	}

	protected static class RootConverter implements Converter {

		@Override
		public boolean canConvert(Class clz) {
			return Root.class == clz;
		}

		@Override
		public void marshal(Object obj, HierarchicalStreamWriter writer, MarshallingContext context) {
			Root root = (Root) obj;
			if (root.getAddresses() != null && !root.getAddresses().isEmpty()) {
				writer.startNode("addresses");
				for (Address addr : root.getAddresses()) {
					writer.startNode("address");
					context.convertAnother(addr, new AddressConverter());
					writer.endNode();
				}
				writer.endNode();
			}
			if (root.getAddressIds() != null && !root.getAddressIds().isEmpty()) {
				writer.startNode("addressids");
				for (String addressId : root.getAddressIds()) {
					writer.startNode("addressid");
					context.convertAnother(addressId);
					writer.endNode();
				}
				writer.endNode();
			}
		}

		@Override
		public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
			Root root = new Root();
			while (reader.hasMoreChildren()) {
				reader.moveDown();
				if ("addresses".equals(reader.getNodeName())) {
					while (reader.hasMoreChildren()) {
						reader.moveDown();
						Address address = (Address) context.convertAnother(root, Address.class, new AddressConverter());
						root.getAddresses().add(address);
						reader.moveUp();
					}
				}
				if ("addressids".equals(reader.getNodeName())) {
					while (reader.hasMoreChildren()) {
						reader.moveDown();
						String addressId = (String) context.convertAnother(root, String.class);
						root.getAddressIds().add(addressId);
						reader.moveUp();
					}
				}
				reader.moveUp();
			}
			return root;
		}

	}

	protected static class AddressIdConverter extends AbstractSingleValueConverter {

		@Override
		public boolean canConvert(Class clz) {
			return String.class == clz;
		}

		@Override
		public Object fromString(String addressId) {
			return addressId;
		}

	}

	protected static class AddressConverter implements Converter {

		@Override
		public boolean canConvert(Class clz) {
			return Address.class == clz;
		}

		@Override
		public void marshal(Object obj, HierarchicalStreamWriter writer, MarshallingContext context) {
			Address address = (Address) obj;

			String addressId = address.getAddressId();
			if (addressId != null && !"".equals(addressId)) {
				writer.startNode("ADDRESS_ID");
				writer.setValue(addressId);
				writer.endNode();
			}

			writer.startNode("ADDRESS_TYPE");
			writer.setValue(address.getAddressType());
			writer.endNode();

			writer.startNode("DISTRICT_ID");
			writer.setValue(String.valueOf(address.getDistrictId()));
			writer.endNode();

			writer.startNode("ZIPCODE");
			writer.setValue(address.getZipcode());
			writer.endNode();

			writer.startNode("CITY");
			writer.setValue(address.getCity());
			writer.endNode();

			writer.startNode("COUNTY");
			writer.setValue(address.getCounty());
			writer.endNode();

			writer.startNode("STREET_NAME");
			writer.setValue(address.getStreetName());
			writer.endNode();

			writer.startNode("DIRECTION");
			writer.setValue(address.getApartment());
			writer.endNode();

			writer.startNode("FLOOR");
			writer.setValue(address.getFloor());
			writer.endNode();

			writer.startNode("HOUSE_LETTER");
			writer.setValue(address.getHouseLetter());
			writer.endNode();

			writer.startNode("HOUSE_NUMBER");
			writer.setValue(address.getHouseNumber());
			writer.endNode();

			writer.startNode("MAIN_DOOR");
			writer.setValue(address.getMainDoor());
			writer.endNode();

			writer.startNode("DOOR_NUMBER");
			writer.setValue(address.getDoorNumber());
			writer.endNode();

			writer.startNode("ADDR_DESC");
			writer.setValue(address.getAddrDesc());
			writer.endNode();

			writer.startNode("BLACK_STATE");
			writer.setValue(address.getBlackState());
			writer.endNode();

			writer.startNode("DELIVERY_STATE");
			writer.setValue(address.getDeliveryState());
			writer.endNode();

			writer.startNode("MUNICIPALITY");
			writer.setValue(address.getMunicipality());
			writer.endNode();

			//add 2017-4-24
			writer.startNode("COUNTRY");
			writer.setValue(address.getCounty());
			writer.endNode();
			
			//add 2018-4-14
			writer.startNode("C_O");
			writer.setValue(address.getCoName());
			writer.endNode();
			
			writer.startNode("PO_BOX");
			writer.setValue(address.getPoBox());
			writer.endNode();
			
			writer.startNode("STREET_NAME2");
			writer.setValue(address.getStreetName2());
			writer.endNode();
			
			writer.startNode("STREET_NAME3");
			writer.setValue(address.getStreetName3());
			writer.endNode();
			//end
			
			writer.startNode("COUNTRY_CODE");
			writer.setValue(address.getCountryCode());
			writer.endNode();
			
			String createType = address.getCreateType();
			if (createType != null && "".equals(createType)) {
				writer.startNode("CREATE_TYPE");
				writer.setValue(createType);
				writer.endNode();
			}
		}

		@Override
		public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
			Address address = new Address();
			while (reader.hasMoreChildren()) {
				reader.moveDown();
				String nodeName = reader.getNodeName();
				String nodeValue = reader.getValue();
				if (nodeValue == null || nodeValue.length() <= 0) {
					reader.moveUp();
					continue;
				}

				if ("ADDRESS_ID".equals(nodeName)) {
					address.setAddressId(nodeValue);
				}

				if ("ADDRESS_TYPE".equals(nodeName)) {
					address.setAddressType(nodeValue);
				} else if ("DISTRICT_ID".equals(nodeName)) {
					address.setDistrictId(Long.parseLong(nodeValue));
				} else if ("ZIPCODE".equals(nodeName)) {
					address.setZipcode(nodeValue);
				} else if ("CITY".equals(nodeName)) {
					address.setCity(nodeValue);
				} else if ("COUNTY".equals(nodeName)) {
					address.setCounty(nodeValue);
				} else if ("STREET_NAME".equals(nodeName)) {
					address.setStreetName(nodeValue);
				} else if ("DIRECTION".equals(nodeName)) {
					address.setApartment(nodeValue);
				} else if ("FLOOR".equals(nodeName)) {
					address.setFloor(nodeValue);
				} else if ("HOUSE_LETTER".equals(nodeName)) {
					address.setHouseLetter(nodeValue);
				} else if ("HOUSE_NUMBER".equals(nodeName)) {
					address.setHouseNumber(nodeValue);
				} else if ("MAIN_DOOR".equals(nodeName)) {
					address.setMainDoor(nodeValue);
				} else if ("DOOR_NUMBER".equals(nodeName)) {
					address.setDoorNumber(nodeValue);
				} else if ("ADDR_DESC".equals(nodeName)) {
					address.setAddrDesc(nodeValue);
				} else if ("BLACK_STATE".equals(nodeName)) {
					address.setBlackState(nodeValue);
				} else if ("DELIVERY_STATE".equals(nodeName)) {
					address.setDeliveryState(nodeValue);
				} else if ("MUNICIPALITY".equals(nodeName)) {
					address.setMunicipality(nodeValue);
				} else if ("CREATE_TYPE".equals(nodeName)) {
					address.setCreateType(nodeValue);
				}else if ("COUNTRY".equals(nodeName)) {
					address.setCountry(nodeValue);
				}else if ("COUNTRY_CODE".equals(nodeName)) {
					address.setCountryCode(nodeValue);
				}else if ("C_O".equals(nodeName)) {
					address.setCoName(nodeValue);
				}else if ("PO_BOX".equals(nodeName)) {
					address.setPoBox(nodeValue);
				}else if ("STREET_NAME2".equals(nodeName)) {
					address.setAddrDesc(nodeValue);
				}else if ("STREET_NAME3".equals(nodeName)) {
					address.setAddrDesc(nodeValue);
				}
				reader.moveUp();
			}
			return address;
		}
	}

	public static Map readdrMap(Map map){
		Map addrMap=new HashMap();
		if(map.containsKey("StreetName")){
			addrMap.put("street-name", map.get("StreetName").toString());
		}
		if(map.containsKey("HouseNo")){
			addrMap.put("house-no", map.get("HouseNo").toString());
		}
		if(map.containsKey("DoorNo")){
			addrMap.put("door-no", map.get("DoorNo").toString());
		}
		if(map.containsKey("ZipCode")){
			addrMap.put("zip-code", map.get("ZipCode").toString());
		}
		if(map.containsKey("MainDoor")){
			addrMap.put("main-door", map.get("MainDoor").toString());
		}
		if(map.containsKey("Floor")){
			addrMap.put("floor", map.get("Floor").toString());
		}
		if(map.containsKey("City")){
			addrMap.put("city", map.get("City").toString());
		}
		if(map.containsKey("County")){
			addrMap.put("county", map.get("County").toString());
		}
		if(map.containsKey("Kvhx")){
			addrMap.put("kvhx", map.get("Kvhx").toString());
		}
		return addrMap;
	}
	
	 public static void map2Xml(Map map,StringBuffer sb){
		 Set set=map.keySet();
		 Iterator it=set.iterator();
		 while(it.hasNext()){
			String key=(String)it.next();
			Object value=map.get(key);
			if(null == value){
				value="";
			}
			if(value instanceof List){
				ArrayList list=(ArrayList)map.get(key);
				sb.append("<"+key+">");
				for(int i=0;i<list.size();i++){
					map2Xml((HashMap)list.get(i),sb);
				}
				sb.append("<"+key+">");
			}else{
				if (value instanceof HashMap){
					HashMap mapKey=(HashMap)map.get(key);
					sb.append("<"+key+">");
					map2Xml(mapKey,sb);
					sb.append("</"+key+">");
				}else{
					sb.append("<"+key+">"+ value +"</"+key+">");
				}
			}
		}
	 }
	 
	 public static Map XmlToMap(String xml) throws DocumentException {
			SAXReader reader = new SAXReader();
			StringReader sr = new StringReader(xml);
			Document document = reader.read(sr);
			OutputFormat format = OutputFormat.createPrettyPrint();
			format.setEncoding("UTF-8");
			Element root = document.getRootElement();
			return Dom2Map(root);
		}

		private static Map Dom2Map(Element e) {
			Map map = new HashMap();
			List list = e.elements();
			if (!list.isEmpty()) {
				for (int i = 0; i < list.size(); i++) {
					Element iter = (Element) list.get(i);
					List mapList = new ArrayList();
					if (!iter.elements().isEmpty()) {
						Map m = Dom2Map(iter);
						if (map.get(iter.getName()) != null) {
							Object obj = map.get(iter.getName());
							if (!obj.getClass().getName().equals("java.util.ArrayList")) {
								mapList = new ArrayList();
								mapList.add(obj);
								mapList.add(m);
							}
							if (obj.getClass().getName().equals("java.util.ArrayList")) {
								mapList = (List) obj;
								mapList.add(m);
							}
							map.put(iter.getName(), mapList);
						} else
							map.put(iter.getName(), m);
					} else {
						if (map.get(iter.getName()) != null) {
							Object obj = map.get(iter.getName());
							if (!obj.getClass().getName().equals("java.util.ArrayList")) {
								mapList = new ArrayList();
								mapList.add(obj);
								mapList.add(iter.getText());
							}
							if (obj.getClass().getName().equals("java.util.ArrayList")) {
								mapList = (List) obj;
								mapList.add(iter.getText());
							}
							map.put(iter.getName(), mapList);
						} else
							map.put(iter.getName(), iter.getText());
					}
				}
			} else
				map.put(e.getName(), e.getText());
			return map;
		}
}
