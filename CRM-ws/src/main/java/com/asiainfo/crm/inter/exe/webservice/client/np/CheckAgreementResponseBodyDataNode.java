/**
 * CheckAgreementResponseBodyDataNode.java
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

public class CheckAgreementResponseBodyDataNode  implements Serializable {
    /* 节点名称 */
    private String nodeName;

    /* 是否必须 1必须；空或者 0 不是必须 */
    private String isNeed;

    /* 符合的正则表达式 */
    private String ruleExpr;

    public CheckAgreementResponseBodyDataNode() {
    }

    /**
     * Gets the nodeName value for this CheckAgreementResponseBodyDataNode.
     * 
     * @return nodeName   * 节点名称
     */
    public String getNodeName() {
        return nodeName;
    }


    /**
     * Sets the nodeName value for this CheckAgreementResponseBodyDataNode.
     * 
     * @param nodeName   * 节点名称
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }


    /**
     * Gets the isNeed value for this CheckAgreementResponseBodyDataNode.
     * 
     * @return isNeed   * 是否必须 1必须；空或者 0 不是必须
     */
    public String getIsNeed() {
        return isNeed;
    }


    /**
     * Sets the isNeed value for this CheckAgreementResponseBodyDataNode.
     * 
     * @param isNeed   * 是否必须 1必须；空或者 0 不是必须
     */
    public void setIsNeed(String isNeed) {
        this.isNeed = isNeed;
    }


    /**
     * Gets the ruleExpr value for this CheckAgreementResponseBodyDataNode.
     * 
     * @return ruleExpr   * 符合的正则表达式
     */
    public String getRuleExpr() {
        return ruleExpr;
    }


    /**
     * Sets the ruleExpr value for this CheckAgreementResponseBodyDataNode.
     * 
     * @param ruleExpr   * 符合的正则表达式
     */
    public void setRuleExpr(String ruleExpr) {
        this.ruleExpr = ruleExpr;
    }

    // Type metadata
    private static TypeDesc typeDesc =
        new TypeDesc(CheckAgreementResponseBodyDataNode.class, true);

    static {
        typeDesc.setXmlType(new QName("http://soa.ailk.telenor.com/wsdl/soa", ">>checkAgreementResponseBody>Data>Node"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("nodeName");
        elemField.setXmlName(new QName("", "NodeName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isNeed");
        elemField.setXmlName(new QName("", "IsNeed"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ruleExpr");
        elemField.setXmlName(new QName("", "RuleExpr"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
