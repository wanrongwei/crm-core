package com.asiainfo.crm.cm.common.util.ws;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;


/**
 * Jaxb2工具类   
 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author yangjh
 * @date 2014-5-6 下午1:10:11
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2014-5-6     yangjh           v1.0.0               修改原因<br>
 */
public class JaxbUtil {
	
	private static final Log log = LogFactory.getLog(JaxbUtil.class);

	/** 
	 * JavaBean转换成xml 
	 * 默认编码UTF-8 
	 * @param obj 
	 * @param writer 
	 * @return  
	 */
	public static String convertToXml(Object obj) {
		return convertToXml(obj, "UTF-8");
	}

	/** 
	 * JavaBean转换成xml 
	 * @param obj 
	 * @param encoding  
	 * @return  
	 */
	public static String convertToXml(Object obj, String encoding) {
		String result = null;
		try {
			JAXBContext context = JAXBContext.newInstance(obj.getClass());
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.setProperty(Marshaller.JAXB_ENCODING, encoding);

			StringWriter writer = new StringWriter();
			marshaller.marshal(obj, writer);
			result = writer.toString();
		} catch (Exception e) {
			if(log.isErrorEnabled()){
				log.error(e);
			}
		}
		return result;
	}

	/** 
	 * xml转换成JavaBean 
	 * @param xml 
	 * @param c 
	 * @return 
	 */
	@SuppressWarnings("unchecked")
	public static <T> T converyToJavaBean(String xml, Class<T> c) {
		T t = null;
		try {
			//jdk1.8后，获取实现类不同，导致解析报错
			System.setProperty("javax.xml.parsers.SAXParserFactory","com.sun.org.apache.xerces.internal.jaxp.SAXParserFactoryImpl");
			JAXBContext context = JAXBContext.newInstance(c);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			t = (T) unmarshaller.unmarshal(new StringReader(xml));
		} catch (Exception e) {
			if(log.isErrorEnabled()){
				log.error(e);
			}
		}

		return t;
	}

}
