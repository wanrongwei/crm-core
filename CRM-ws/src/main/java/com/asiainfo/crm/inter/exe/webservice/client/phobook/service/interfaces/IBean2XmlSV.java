package com.asiainfo.crm.inter.exe.webservice.client.phobook.service.interfaces;

import org.dom4j.Element;


import com.asiainfo.crm.inter.exe.webservice.client.phobook.bo.QBOResAddressBean;

public interface IBean2XmlSV {

	public String getXmlHead(boolean isFully, String sequence)  throws Exception;

	public Element createXml(QBOResAddressBean beanPhon);
	

	public String getXmlEnd();

}
