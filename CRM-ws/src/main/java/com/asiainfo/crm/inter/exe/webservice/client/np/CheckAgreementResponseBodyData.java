/**
 * CheckAgreementResponseBodyData.java
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

public class CheckAgreementResponseBodyData  implements Serializable {
    /* 运营商 */
    private String operator;
    
    private String operatorName;

    public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}


	/* 运营商联系方式 */
    private CheckAgreementResponseBodyDataOperatorConract operatorConract;

    private CheckAgreementResponseBodyDataNode[] node;

    public CheckAgreementResponseBodyData() {
    }

    /**
     * Gets the operator value for this CheckAgreementResponseBodyData.
     * 
     * @return operator   * 运营商
     */
    public String getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this CheckAgreementResponseBodyData.
     * 
     * @param operator   * 运营商
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }


    /**
     * Gets the operatorConract value for this CheckAgreementResponseBodyData.
     * 
     * @return operatorConract   * 运营商联系方式
     */
    public CheckAgreementResponseBodyDataOperatorConract getOperatorConract() {
        return operatorConract;
    }


    /**
     * Sets the operatorConract value for this CheckAgreementResponseBodyData.
     * 
     * @param operatorConract   * 运营商联系方式
     */
    public void setOperatorConract(CheckAgreementResponseBodyDataOperatorConract operatorConract) {
        this.operatorConract = operatorConract;
    }


    /**
     * Gets the node value for this CheckAgreementResponseBodyData.
     * 
     * @return node
     */
    public CheckAgreementResponseBodyDataNode[] getNode() {
        return node;
    }


    /**
     * Sets the node value for this CheckAgreementResponseBodyData.
     * 
     * @param node
     */
    public void setNode(CheckAgreementResponseBodyDataNode[] node) {
        this.node = node;
    }


    // Type metadata
    private static TypeDesc typeDesc =
        new TypeDesc(CheckAgreementResponseBodyData.class, true);

    static {
        typeDesc.setXmlType(new QName("http://soa.ailk.telenor.com/wsdl/soa", ">checkAgreementResponseBody>Data"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new QName("", "Operator"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("operatorName");
        elemField.setXmlName(new QName("", "OperatorName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("operatorConract");
        elemField.setXmlName(new QName("", "OperatorConract"));
        elemField.setXmlType(new QName("http://soa.ailk.telenor.com/wsdl/soa", ">>checkAgreementResponseBody>Data>OperatorConract"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("node");
        elemField.setXmlName(new QName("", "Node"));
        elemField.setXmlType(new QName("http://soa.ailk.telenor.com/wsdl/soa", ">>checkAgreementResponseBody>Data>Node"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
    public static Serializer getSerializer(
           String mechType, 
           Class javaType,  
           QName xmlType) {
        return 
          new  BeanSerializer(
            javaType, xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static Deserializer getDeserializer(
           String mechType, 
           Class javaType,  
           QName xmlType) {
        return 
          new  BeanDeserializer(
            javaType, xmlType, typeDesc);
    }

}
