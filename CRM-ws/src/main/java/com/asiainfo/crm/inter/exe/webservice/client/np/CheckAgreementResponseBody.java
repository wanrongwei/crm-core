/**
 * CheckAgreementResponseBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.np;

import java.io.Serializable;

import javax.xml.namespace.QName;

import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CheckAgreementResponseBody  implements Serializable {
    /* 1:成功；0：失败 */
    private String resultCode;

    private String resultMsg;
    

    private CheckAgreementResponseBodyData data;

    public CheckAgreementResponseBody() {
    }



    /**
     * Gets the resultCode value for this CheckAgreementResponseBody.
     * 
     * @return resultCode   * 1:成功；0：失败
     */
    public String getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this CheckAgreementResponseBody.
     * 
     * @param resultCode   * 1:成功；0：失败
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the resultMsg value for this CheckAgreementResponseBody.
     * 
     * @return resultMsg
     */
    public String getResultMsg() {
        return resultMsg;
    }


    /**
     * Sets the resultMsg value for this CheckAgreementResponseBody.
     * 
     * @param resultMsg
     */
    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }


    /**
     * Gets the data value for this CheckAgreementResponseBody.
     * 
     * @return data
     */
    public CheckAgreementResponseBodyData getData() {
        return data;
    }


    /**
     * Sets the data value for this CheckAgreementResponseBody.
     * 
     * @param data
     */
    public void setData(CheckAgreementResponseBodyData data) {
        this.data = data;
    }

    // Type metadata
    private static TypeDesc typeDesc =
        new TypeDesc(CheckAgreementResponseBody.class, true);

    static {
        typeDesc.setXmlType(new QName("http://soa.ailk.telenor.com/wsdl/soa", "checkAgreementResponseBody"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("resultCode");
        elemField.setXmlName(new QName("", "ResultCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("resultMsg");
        elemField.setXmlName(new QName("", "ResultMsg"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new QName("", "Data"));
        elemField.setXmlType(new QName("http://soa.ailk.telenor.com/wsdl/soa", ">checkAgreementResponseBody>Data"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

	/**
	 * Return type metadata object
	 */
	public static TypeDesc getTypeDesc() {
		return typeDesc;
	}

	/**
	 * Get Custom Serializer
	 */
	public static Serializer getSerializer(String mechType, Class javaType,
			QName xmlType) {
		return new BeanSerializer(javaType, xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static Deserializer getDeserializer(String mechType, Class javaType,
			QName xmlType) {
		return new BeanDeserializer(javaType, xmlType, typeDesc);
	}

}
