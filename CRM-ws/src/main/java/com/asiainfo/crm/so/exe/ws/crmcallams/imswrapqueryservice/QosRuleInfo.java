/**
 * QosRuleInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class QosRuleInfo implements java.io.Serializable {
    private String qosRuleName;

    private String qosRuleDescription;

    public QosRuleInfo() {
    }

    public QosRuleInfo(
           String qosRuleName,
           String qosRuleDescription) {
           this.qosRuleName = qosRuleName;
           this.qosRuleDescription = qosRuleDescription;
    }


    /**
     * Gets the qosRuleName value for this QosRuleInfo.
     * 
     * @return qosRuleName
     */
    public String getQosRuleName() {
        return qosRuleName;
    }


    /**
     * Sets the qosRuleName value for this QosRuleInfo.
     * 
     * @param qosRuleName
     */
    public void setQosRuleName(String qosRuleName) {
        this.qosRuleName = qosRuleName;
    }


    /**
     * Gets the qosRuleDescription value for this QosRuleInfo.
     * 
     * @return qosRuleDescription
     */
    public String getQosRuleDescription() {
        return qosRuleDescription;
    }


    /**
     * Sets the qosRuleDescription value for this QosRuleInfo.
     * 
     * @param qosRuleDescription
     */
    public void setQosRuleDescription(String qosRuleDescription) {
        this.qosRuleDescription = qosRuleDescription;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof QosRuleInfo)) return false;
        QosRuleInfo other = (QosRuleInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.qosRuleName==null && other.getQosRuleName()==null) || 
             (this.qosRuleName!=null &&
              this.qosRuleName.equals(other.getQosRuleName()))) &&
            ((this.qosRuleDescription==null && other.getQosRuleDescription()==null) || 
             (this.qosRuleDescription!=null &&
              this.qosRuleDescription.equals(other.getQosRuleDescription())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getQosRuleName() != null) {
            _hashCode += getQosRuleName().hashCode();
        }
        if (getQosRuleDescription() != null) {
            _hashCode += getQosRuleDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QosRuleInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "qosRuleInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qosRuleName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qosRuleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qosRuleDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qosRuleDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
