package com.asiainfo.crm.util;

import com.asiainfo.crm.constant.Constant;
import com.asiainfo.crm.vo.MapConverter;
import com.asiainfo.crm.vo.ServiceParam;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer;
import com.thoughtworks.xstream.io.xml.XppDriver;
import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 将XML报文转换为Map对象，暂不支持节点属性
 * @author xialing
 *
 */
public class XmlMapTransformUtil {
	private static transient Log log = LogFactory.getLog(XmlMapTransformUtil.class);
	
	public static Map xml2Map(String xml) {
		Map result = null;
		Document document = getXmlDocument(xml);
		if(document != null) {
			Element root = document.getRootElement();
			Map innerMap = dom2Map(root);
			if(innerMap != null) {
				result = new ServiceParam();
				result.put(root.getName(), innerMap);
			}
		}
		return result;
	}
	
	public static String map2Xml(Map map) {
		StringBuilder result = null;
		if(map != null) {
			//首先处理：1.顶层key值不唯一 2.顶层key值唯一但为空 3.顶层key值唯一但对应数据为List或数组
			if(map.size() != 1) {
				if(log.isInfoEnabled()) {
					log.info("At the top of the map structure must have the only key values and only as an XML root node, the current key values are not the only, use the default root node.");
				}
				Map tmpMap = new ServiceParam();
				tmpMap.put(Constant.Common.DEFAULT_ROOT, map);
				map = tmpMap;
			}else {
				for(Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); ) {
					Entry entry = (Entry)iterator.next();
					String key = entry.getKey().toString();
					if(StringUtils.isBlank(key)) {
						if(log.isInfoEnabled()) {
							log.info("At the top of the map structure must have the only key values and only as an XML root node, the current key value is empty, use the default root node.");
						}
						Map tmpMap = new ServiceParam();
						tmpMap.put(Constant.Common.DEFAULT_ROOT, map.get(key));
						map = tmpMap;
						break;
					}else {
						Object value = entry.getValue();
						if(value != null) {
							Class clazz = value.getClass();
							if(ClassUtils.isAssignable(clazz, List.class) || clazz.isArray() || !Constant.Common.DEFAULT_ROOT.equalsIgnoreCase(key)) {
								if(log.isInfoEnabled()) {
									log.info("Map must be in the top of the structure and only the only key values as the XML root node, the current key values corresponding to the data for the List/array, using the default root node.");
								}
								Map tmpMap = new ServiceParam();
								tmpMap.put(Constant.Common.DEFAULT_ROOT, map);
								map = tmpMap;
								break;
							}
						}
					}
				}
			}
			//如果根节点为空，设置为默认根节点
			result = new StringBuilder(Constant.Common.XML_HEAD);
			XStream xstream = new XStream(new XppDriver(new XmlFriendlyReplacer("$", "_")));
	        xstream.registerConverter(new MapConverter());
	        //由于生成的XML根节点是对象的Class全路径名，所以需要处理掉
	        String className = map.getClass().getName();
	        String start = new StringBuilder().append(Constant.Common.LEFT_POINT_BRACES).append(className)
	        	.append(Constant.Common.RIGHT_POINT_BRACES).toString();
	        String end = new StringBuilder().append(Constant.Common.LEFT_POINT_BRACES).append(Constant.Common.SLASH).append(className)
        		.append(Constant.Common.RIGHT_POINT_BRACES).toString();
	        String tmpXml = xstream.toXML(map).replace(start, Constant.Common.EMPTY).replace(end, Constant.Common.EMPTY);
			result.append(tmpXml);
		}
		return result == null ? null : result.toString();
	}
	
	/**
	 * 根据xml生成对应的Document文档
	 * @param xml
	 * @return
	 */
	public static Document getXmlDocument(String xml) {
		Document document = null;
		if(StringUtils.isNotBlank(xml)) {
			byte[] xmlBytes = null;
			try {
				xmlBytes = xml.getBytes(Constant.getProperty(Constant.ConfigKey.XML_ENCODING));
			}catch (UnsupportedEncodingException e) {
				if(log.isErrorEnabled()) {
					log.error("Generate XML corresponding data out of wrong, don't support coding formats:" + Constant.getProperty(Constant.ConfigKey.XML_ENCODING), e);
				}
			}
			if(xmlBytes != null) {
				InputStream is = new BufferedInputStream(new ByteArrayInputStream(xmlBytes));
				SAXReader saxReader = new SAXReader();
				try {
					document = saxReader.read(is);
				}catch (DocumentException e) {
					if(log.isInfoEnabled()) {
						log.info("An error occurred when generate XML corresponding document object!\n" + xml, e);
					}
				}finally {
					if(is != null) {
						try {
							is.close();
						}catch (IOException e) {
							if(log.isErrorEnabled()) {
								log.error("Close the XML data flow out the wrong message, do not affect normal operation!", e);
							}
						}
					}
				}
			}
		}
		return document;
	}

	private static Map dom2Map(Element e) {
		Map result = null;
		if(e != null) {
			result = new ServiceParam();
			List children = e.elements();
			if(!children.isEmpty()) {
				Element child = null;
				List childList = null;
				for(int i=0,size=children.size(); i<size; i++) {
					child = (Element)children.get(i);
					if(!child.elements().isEmpty()) {	//如果子节点还有子节点
						Map nextMap = dom2Map(child);
						Object obj = null;	//当前结果中是否已经有该节点数据
						if ((obj = result.get(child.getName())) != null) {
							if(obj instanceof List) {
								childList = (List)obj;
								childList.add(nextMap);
							}else {
								childList = new ArrayList();
								childList.add(obj);
								childList.add(nextMap);
							}
							result.put(child.getName(), childList);
						}else {
							result.put(child.getName(), nextMap);
						}
					}else {
						Object obj = null;
						if((obj = result.get(child.getName())) != null) {
							if(obj instanceof List) {
								childList = (List)obj;
								childList.add(child.getText());
							}else {
								childList = new ArrayList();
								childList.add(obj);
								childList.add(child.getText());
							}
							result.put(child.getName(), childList);
						}else {
							result.put(child.getName(), child.getText());
						}
					}
				}
			}else {
				result.put(e.getName(), e.getText());
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Map param = new ServiceParam();
		param.put("REQUEST.BUSIPARAMS.WORKFLOW$OBIECT_ID", "1009872");
		param.put("REQUEST.BUSICODE", "N012");
//		System.out.println(XmlMapTransformUtil.map2Xml(param));
	}
}
