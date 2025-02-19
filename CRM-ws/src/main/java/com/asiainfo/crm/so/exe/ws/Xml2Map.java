package com.asiainfo.crm.so.exe.ws;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;

public class Xml2Map {
	
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
		if (list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				Element iter = (Element) list.get(i);
				List mapList = new ArrayList();
				if (iter.elements().size() > 0) {
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

	
//	public static void main(String[] args) throws Exception {
//		StringBuffer str = new StringBuffer();
//		str.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
//		str.append("<root><msg_content>");
//		str.append("<is_address_right>N</is_address_right>");
//		str.append("<is_have_choice_list>Y</is_have_choice_list>");
//		str.append("<address-choice-list><address><street-name>Guldblommevej</street-name><zip-code>8800</zip-code>	<house-no>7</house-no><main-door>A</main-door><floor>ST</floor><door-no>0004</door-no><city>VIBORG</city><address-key>450039937</address-key>");
//		str.append("</address><address>");
//		str.append("<street-name>Guldblommevej</street-name> <zip-code>8800</zip-code> <house-no>7</house-no> <main-door>A</main-door> <floor>1</floor> <door-no>0004</door-no> <city>VIBORG</city> <address-key>450039937</address-key>");
//		str.append("</address>");
//		str.append("<product_list><product_id>ALARM</product_id><product_id>BB</product_id></product_list>");
//		str.append("</address-choice-list>");
//		str.append("</msg_content></root>");
//		
//		Map map = Xml2Map.XmlToMap(str.toString());
//		
//		System.out.println(map.size());
//		
//		Map msgContentMap = (Map)map.get("msg_content");
//		Map choiceAddrMap = (Map)msgContentMap.get("address-choice-list");
//		Map prodMap = (Map)choiceAddrMap.get("product_list");
//		List prods = (List)prodMap.get("product_id");
//		
//		for(int i=0;i<prods.size();i++){
//			System.out.println(prods.get(i));
//			
//		}
//		
////	String aaaa = Map2Xml.Map2Xml(map,"AIConfig");
//	//System.out.println(aaaa);
//		   
//	}
}

