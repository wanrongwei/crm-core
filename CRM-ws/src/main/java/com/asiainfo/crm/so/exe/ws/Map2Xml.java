package com.asiainfo.crm.so.exe.ws;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class Map2Xml {
	 
	public static String MapToXml(Map map,String rootNode) throws DocumentException {
		Set set = map.keySet();
		Iterator it = set.iterator();
		Element catalogElement = null;
		Document document = DocumentHelper.createDocument();
		document.setName("xml");
		catalogElement = document.addElement(rootNode);
		while (it.hasNext()) {
			Object obj = it.next();
			Map2Dom(catalogElement,obj.toString(),map.get(obj));
		}
		return document.asXML();
	}
	
	private static void Map2Dom(Element catalogElement,String key,Object obj){
		if(obj instanceof Map){
			Set set = ((Map)obj).keySet();
			Iterator it = set.iterator();
			while(it.hasNext()){
				Object objTmp = it.next();
				Element child = catalogElement.addElement(key);
				Map2Dom(child,objTmp.toString(),((Map)obj).get(objTmp));
			}
		}else if(obj instanceof List){
			List list = (List)obj;
			for (int i = 0; i < list.size(); i++) {
				Map2Dom(catalogElement,key,list.get(i));
			}
		}else{
			Element child = catalogElement.addElement(key);
			child.addText(obj.toString());
		}
		
	}

//	public static void main(String[] args) throws Exception{
//		Map aa = new HashMap();
////		Map aa1 = new HashMap();
////		Map aa2 = new HashMap();
////		Map aa11 = new HashMap();
////		Map aa12 = new HashMap();
////		Map aa21 = new HashMap();
////		Map aa22 = new HashMap();
//
////		List list = new ArrayList();
////		List listaa1 = new ArrayList();
////		List listaa2 = new ArrayList();
////
////		aa11.put("ConfigItem","com.ai.appframe2.complex.tab.id.AdvanceIdGeneratorImpl");
////		aa12.put("ConfigItem","N");
////		listaa1.add(aa11);
////		listaa1.add(aa12);
////		
////		aa21.put("ConfigItem","Y");
////		aa22.put("ConfigItem","com.ai.secframe.sysmgr.service.interfaces.ISecFrameMoSecuritySV");
////		listaa2.add(aa21);
////		listaa2.add(aa22);
////
////		aa.put("ConfigKind",listaa1);
////		aa.put("ConfigKind1",listaa2);
//		aa.put("aa","bb");	
//		System.out.println(Map2Xml.MapToXml(aa,"AICONFIG"));
//	}
	
	 public static String map2Xml(Map map,StringBuffer sb){
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
				sb.append("</"+key+">");
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
		 return sb.toString();
	 }
/*	 public static void main(String[] args) {

		 String xmlStr="";
		 Map serialMap=new HashMap();
		 serialMap.put("so_co_serial", "8200");
		 serialMap.put("so_order_id", "RBOSS^11^0000000000061220");
		 Map addrMap=new HashMap();
		 addrMap.put("street-name", "St. Fuchunjiang");
		 addrMap.put("zip-code", "1000");
		 addrMap.put("house-no", "111");
		 addrMap.put("main-door", "A");
		 addrMap.put("floor", "11");
		 addrMap.put("door-no", "11");
		 addrMap.put("city", "Nanjing");
		 addrMap.put("county", "DK");
		 Map address=new HashMap();
		 serialMap.put("address", addrMap);
		 StringBuffer xmlSb=new StringBuffer();
		 xmlSb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?><request>"); 
		 xmlStr=map2Xml(serialMap,xmlSb);
		 xmlSb.append("</request>");
		 System.out.println(xmlSb);		 
	 
	}*/
}

