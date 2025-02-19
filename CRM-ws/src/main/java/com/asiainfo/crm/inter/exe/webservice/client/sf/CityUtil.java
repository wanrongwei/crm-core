package com.asiainfo.crm.inter.exe.webservice.client.sf;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer;
import com.thoughtworks.xstream.security.AnyTypePermission;

public class CityUtil {

	public static CityRoot xml2Root(String xml) {
		XStream xStream = new XStream(new DomDriver("UTF-8", new XmlFriendlyReplacer("$", "_")));
		xStream.alias("root", CityRoot.class);
		xStream.alias("city", City.class);
		xStream.registerConverter(new CityRootConverter());
		xStream.addPermission(AnyTypePermission.ANY);
		return (CityRoot) xStream.fromXML(xml);
	}

	public static ArrayList citys2List(ArrayList<City> citys) {
		ArrayList citysList = new ArrayList();
		for (City city : citys) {
			citysList.add(city2Map(city));
		}
		return citysList;
	}

	public static Map city2Map(City city) {
		Map map = new HashMap();
		try {
			Class<City> clz = City.class;
			Field[] fields = clz.getDeclaredFields();
			for (Field field : fields) {
				String methodName = getMethodName(field.getName());
				Method method = (Method) clz.getMethod("get" + methodName);
				if (String.class.getName().equals(field.getType().getName())) {
					String value = (String) method.invoke(city);
					if (value != null && !"".equals(value)) {
						map.put(methodName, value);
					}
				}
			}
			return map;
		} catch (Exception e) {
			return new HashMap();
		}
	}

	private static String getMethodName(String fildeName) throws Exception {
		byte[] items = fildeName.getBytes();
		items[0] = (byte) ((char) items[0] - 'a' + 'A');
		return new String(items);
	}

	private static class CityRootConverter implements Converter {

		@Override
		public boolean canConvert(Class clz) {
			return CityRoot.class == clz;
		}

		@Override
		public void marshal(Object obj, HierarchicalStreamWriter writer, MarshallingContext context) {
			CityRoot root = (CityRoot) obj;
			if (root.getCitys() != null && root.getCitys().size() > 0) {
				writer.startNode("city_list");
				for (City city : root.getCitys()) {
					writer.startNode("city");
					context.convertAnother(city, new CityConverter());
					writer.endNode();
				}
				writer.endNode();
			}
		}

		@Override
		public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
			CityRoot root = new CityRoot();
			while (reader.hasMoreChildren()) {
				reader.moveDown();
				if ("city_list".equals(reader.getNodeName())) {
					while (reader.hasMoreChildren()) {
						reader.moveDown();
						City city = (City) context.convertAnother(root, City.class, new CityConverter());
						root.getCitys().add(city);
						reader.moveUp();
					}
				}
				reader.moveUp();
			}
			return root;
		}

	}

	private static class CityConverter implements Converter {

		@Override
		public boolean canConvert(Class clz) {
			return City.class == clz;
		}

		@Override
		public void marshal(Object obj, HierarchicalStreamWriter writer, MarshallingContext context) {
			City city = (City) obj;

			String cityId = city.getCityId();
			if (cityId != null && !"".equals(cityId)) {
				writer.startNode("city_id");
				writer.setValue(cityId);
				writer.endNode();
			}

			String cityName = city.getCityName();
			if (cityName != null && !"".equals(cityName)) {
				writer.startNode("city_name");
				writer.setValue(cityName);
				writer.endNode();
			}

		}

		@Override
		public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
			City city = new City();
			while (reader.hasMoreChildren()) {
				reader.moveDown();
				String nodeName = reader.getNodeName();
				String nodeValue = reader.getValue();

				if (nodeValue == null || nodeValue.length() <= 0) {
					reader.moveUp();
					continue;
				}
				if ("city_id".equals(nodeName)) {
					city.setCityId(nodeValue);
				} else if ("city_name".equals(nodeName)) {
					city.setCityName(nodeValue);
				}
				reader.moveUp();
			}
			return city;
		}

	}

}
