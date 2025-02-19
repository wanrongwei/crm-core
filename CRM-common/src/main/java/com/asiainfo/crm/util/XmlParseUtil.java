package com.asiainfo.crm.util;

import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.vo.ServiceParam;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * 用于解析Xml报文, 转化为ServiceParam
 * @author zhaiwg
 *
 */
public class XmlParseUtil {
	
	private static transient Log log = LogFactory.getLog(XmlParseUtil.class);
	
	/**
	 * 将Xml报文转化成Map对象
	 * Xml报文基本格式
	 * <AICRMService>
	 * 	<PubInfo>
	 * 		<TransactionId>AX20111220000018</TransactionId>
	 * 		.......
	 * 		<InterfaceId>1000</InterfaceId>
	 * 		<InterfaceType>0</InterfaceType>
	 * 		.......
	 * 	</PubInfo>
	 * 	<Request>
	 * 		<BusiCode>100000</BusiCode >
	 * 		<BusiParams>
	 * 			.......
	 * 		</BusiParams>
	 * 	</Request>
	 * </AICRMService>
	 */
	public static Map getMapFromXml(String xmlString) throws Exception{
		if(StringUtils.isBlank(xmlString)){
			ExceptionUtil.throwBusinessException("INS000000000001"); //传入报文为空！
		}
//		// 获取 Xml 根节点
		Element aiCrmService = getRootElement(xmlString);
		
		return getXmlMap(aiCrmService);
	}
	
	private static Map getXmlMap(Element e) {  
	    Map map = new ServiceParam();
	    List list = e.elements();  
	    if (list.size() > 0) {  
	        for (int i = 0; i < list.size(); i++) {  
	            Element iter = (Element) list.get(i);  
	            List mapList = new ArrayList();  
	  
	            if (iter.elements().size() > 0) {  
	                Map m = getXmlMap(iter);  
	                if (map.get(iter.getName()) != null) {  
	                    Object obj = map.get(iter.getName());  
	                    if (! (obj instanceof List)) {  
	                        mapList = new ArrayList();  
	                        mapList.add(obj);  
	                        mapList.add(m);  
	                    }  
	                    if (obj instanceof List ) {  
	                        mapList = (List) obj;  
	                        mapList.add(m);  
	                    }  
	                    map.put(iter.getName(), mapList);  
	                } else  
	                    map.put(iter.getName(), m);  
	            } else {  
	                if (map.get(iter.getName()) != null) {  
	                    Object obj = map.get(iter.getName());  
	                    if (! (obj instanceof List)) {  
	                        mapList = new ArrayList();  
	                        mapList.add(obj);  
	                        mapList.add(iter.getText().trim());  
	                    }  
	                    if ( obj instanceof List ) {  
	                        mapList = (List) obj;  
	                        mapList.add(iter.getText().trim());  
	                    }  
	                    map.put(iter.getName(), mapList);  
	                } else  
	                    map.put(iter.getName(), iter.getText().trim());  
	            }  
	        }  
	    } else  
	        map.put(e.getName(), e.getText().trim());  
	    return map;  
	}
	
	/**
	 * 获取报文根节点  
	 */
	private static Element getRootElement(String xmlString) throws Exception{
		// 获取 Document 对象
		Document document = DocumentHelper.parseText(xmlString);
		//获取 Xml 根节点
		Element element = document.getRootElement();
		return element;
	}
}
