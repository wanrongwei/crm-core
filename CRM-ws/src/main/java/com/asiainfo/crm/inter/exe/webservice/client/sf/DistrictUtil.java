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

public class DistrictUtil {

	public static DistrictRoot xml2Root(String xml) {
		XStream xStream = new XStream(new DomDriver("UTF-8", new XmlFriendlyReplacer("$", "_")));
		xStream.alias("root", DistrictRoot.class);
		xStream.alias("district", District.class);
		xStream.registerConverter(new DistrictRootConverter());
		xStream.addPermission(AnyTypePermission.ANY);
		return (DistrictRoot) xStream.fromXML(xml);
	}

	public static ArrayList districts2List(ArrayList<District> districts) {
		ArrayList districtsList = new ArrayList();
		for (District district : districts) {
			districtsList.add(district2Map(district));
		}
		return districtsList;
	}

	public static Map district2Map(District district) {
		Map map = new HashMap();
		try {
			Class<District> clz = District.class;
			Field[] fields = clz.getDeclaredFields();
			for (Field field : fields) {
				String methodName = getMethodName(field.getName());
				Method method = (Method) clz.getMethod("get" + methodName);
				if (String.class.getName().equals(field.getType().getName())) {
					String value = (String) method.invoke(district);
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

	private static class DistrictRootConverter implements Converter {

		@Override
		public boolean canConvert(Class clz) {
			return DistrictRoot.class == clz;
		}

		@Override
		public void marshal(Object obj, HierarchicalStreamWriter writer, MarshallingContext context) {
			DistrictRoot root = (DistrictRoot) obj;
			if (root.getDistricts() != null && root.getDistricts().size() > 0) {
				writer.startNode("district-list");
				for (District district : root.getDistricts()) {
					writer.startNode("district");
					context.convertAnother(district, new DistrictConverter());
					writer.endNode();
				}
				writer.endNode();
			}
		}

		@Override
		public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
			DistrictRoot root = new DistrictRoot();
			while (reader.hasMoreChildren()) {
				reader.moveDown();
				if ("district-list".equals(reader.getNodeName())) {
					while (reader.hasMoreChildren()) {
						reader.moveDown();
						District district = (District) context.convertAnother(root, District.class,
								new DistrictConverter());
						root.getDistricts().add(district);
						reader.moveUp();
					}
				}
				reader.moveUp();
			}
			return root;
		}

	}

	private static class DistrictConverter implements Converter {

		@Override
		public boolean canConvert(Class clz) {
			return District.class == clz;
		}

		@Override
		public void marshal(Object obj, HierarchicalStreamWriter writer, MarshallingContext context) {
			District district = (District) obj;

			String districtId = district.getDistrictId();
			if (districtId != null && !"".equals(districtId)) {
				writer.startNode("district_id");
				writer.setValue(districtId);
				writer.endNode();
			}

			String districtName = district.getDistrictName();
			if (districtName != null && !"".equals(districtName)) {
				writer.startNode("district_name");
				writer.setValue(districtName);
				writer.endNode();
			}

			String districtParentId = district.getDistrictParentId();
			if (districtParentId != null && !"".equals(districtParentId)) {
				writer.startNode("district_parent_id");
				writer.setValue(districtParentId);
				writer.endNode();
			}

		}

		@Override
		public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
			District district = new District();
			while (reader.hasMoreChildren()) {
				reader.moveDown();
				String nodeName = reader.getNodeName();
				String nodeValue = reader.getValue();

				if (nodeValue == null || nodeValue.length() <= 0) {
					reader.moveUp();
					continue;
				}
				if ("district_id".equals(nodeName)) {
					district.setDistrictId(nodeValue);
				} else if ("district_name".equals(nodeName)) {
					district.setDistrictName(nodeValue);
				} else if ("district_parent_id".equals(nodeName)) {
					district.setDistrictParentId(nodeValue);
				}
				reader.moveUp();
			}
			return district;
		}

	}

}
