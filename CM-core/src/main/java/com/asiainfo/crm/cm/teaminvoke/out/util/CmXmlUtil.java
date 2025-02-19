	/**   
	* Copyright: Copyright (c) 2012 Asiainfo-Linkage
	* 
	* @ClassName: CmXmlUtil.java
	* @Description: 有关键值对生成参数报文的类
	*
	* @version: v1.0.0
	* @author: yandong2
	* @date: 2012-3-27 下午01:44:51 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-3-27     yandong2           v1.0.0               修改原因
	*/
package com.asiainfo.crm.cm.teaminvoke.out.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.dom4j.Element;

import com.ai.appframe2.util.XmlUtil;


/**
 * @version: v1.0.0
 * @author: yandong2
 * @date: 2012-3-27 下午01:44:51 
 *
 */
public class CmXmlUtil {
	
	public static String XML_HEAD="<?xml version='1.0' encoding='gb2312'?>";
	
	public static String ROOT_NAME="Params";
	
	/**
	 * 生成以Params为根节点的报文
	 * @param paramMap 参数列表（键值对）
	 * @return
	 * @version: v1.0.0
	 * @author: yandong2
	 * @date: 2012-3-27 下午02:05:16
	 */
	public static String getXmlString(HashMap paramMap){
		if(paramMap.isEmpty()){
			return null;
		}
		StringBuilder result=new StringBuilder();
		result.append(createStartXml()).append(createContent(paramMap)).append(createEndXml());
		
		return result.toString();
	}
	
	/**
	 * 报文抬头
	 * @return
	 * @version: v1.0.0
	 * @author: yandong2
	 * @date: 2012-3-27 下午02:05:26
	 */
	private static String createStartXml(){
		StringBuilder sb=new StringBuilder();
		sb.append(XML_HEAD);
		sb.append("<").append(ROOT_NAME).append(">");
		return sb.toString();
	}
	/**
	 * 报文结尾
	 * @return
	 * @version: v1.0.0
	 * @author: yandong2
	 * @date: 2012-3-27 下午02:05:44
	 */
	private static String createEndXml(){
		StringBuilder sb=new StringBuilder();
		sb.append("</").append(ROOT_NAME).append(">");
		return sb.toString();
	}
	
	/**
	 * 参数内容
	 * 例如：key:value
	 * <key>value</key>
	 * @param paramMap
	 * @return
	 * @version: v1.0.0
	 * @author: yandong2
	 * @date: 2012-3-27 下午02:06:01
	 */
	private static String createContent(HashMap paramMap){
		StringBuilder sb=new StringBuilder();
		for (Iterator iterator = paramMap.entrySet().iterator(); iterator.hasNext();) {
			Map.Entry entry= (Map.Entry) iterator.next();
			String key=entry.getKey().toString().toUpperCase();
			Object o=entry.getValue();
			if(o!=null){
				sb.append("<").append(key).append(">");
				sb.append(o.toString());
				sb.append("</").append(key).append(">");
			}
			
		}
		return sb.toString();
		
	}
	
	/**
	 * 将参数列表转换到HashMap中key-value
	 * @param xmlResult
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: yandong2
	 * @date: 2012-3-27 下午02:21:25
	 */
	public static HashMap transfer2Map(String xmlResult)throws Exception{
		HashMap paramMap=new HashMap();
		if (StringUtils.isNotBlank(xmlResult)) {
			Element params = XmlUtil.parseXmlOfString(xmlResult);
			for (Iterator i = params.elementIterator(); i.hasNext();) {
				Element param = (Element) i.next();
			    paramMap.put(param.getName(), param.getText());
			}
		}
		return paramMap;
	}
	

	/**
	 * 测试说明
	 * @param args
	 * @version: v1.0.0
	 * @author: yandong2
	 * @throws Exception 
	 * @date: 2012-3-27 下午01:44:51 
	 */
//	public static void main(String[] args) throws Exception {
//		HashMap paramMap=new HashMap();
//		paramMap.put("asdf", "1222");
//		paramMap.put("eddd", "343");
//		String result=getXmlString(paramMap);
//		System.out.println(result);
//		HashMap resultMap=transfer2Map(result);
//		for (Iterator iterator = resultMap.entrySet().iterator(); iterator.hasNext();) {
//			Map.Entry type = (Map.Entry) iterator.next();
//			System.out.println(type.getKey()+":"+type.getValue());
//		}
//	}

}
