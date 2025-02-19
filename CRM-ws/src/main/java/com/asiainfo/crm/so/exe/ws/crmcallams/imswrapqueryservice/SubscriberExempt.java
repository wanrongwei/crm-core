/**
 * SubscriberExempt.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class SubscriberExempt  implements java.io.Serializable {
    private java.lang.String phoneId;

    private java.lang.Short subExemptCreditFlag;

    private java.lang.String subExemptValidDate;

    private java.lang.String subExemptExpireDate;

    public SubscriberExempt() {
    }

    public SubscriberExempt(
           java.lang.String phoneId,
           java.lang.Short subExemptCreditFlag,
           java.lang.String subExemptValidDate,
           java.lang.String subExemptExpireDate) {
           this.phoneId = phoneId;
           this.subExemptCreditFlag = subExemptCreditFlag;
           this.subExemptValidDate = subExemptValidDate;
           this.subExemptExpireDate = subExemptExpireDate;
    }


    /**
     * Gets the phoneId value for this SubscriberExempt.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this SubscriberExempt.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the subExemptCreditFlag value for this SubscriberExempt.
     * 
     * @return subExemptCreditFlag
     */
    public java.lang.Short getSubExemptCreditFlag() {
        return subExemptCreditFlag;
    }


    /**
     * Sets the subExemptCreditFlag value for this SubscriberExempt.
     * 
     * @param subExemptCreditFlag
     */
    public void setSubExemptCreditFlag(java.lang.Short subExemptCreditFlag) {
        this.subExemptCreditFlag = subExemptCreditFlag;
    }


    /**
     * Gets the subExemptValidDate value for this SubscriberExempt.
     * 
     * @return subExemptValidDate
     */
    public java.lang.String getSubExemptValidDate() {
        return subExemptValidDate;
    }


    /**
     * Sets the subExemptValidDate value for this SubscriberExempt.
     * 
     * @param subExemptValidDate
     */
    public void setSubExemptValidDate(java.lang.String subExemptValidDate) {
        this.subExemptValidDate = subExemptValidDate;
    }


    /**
     * Gets the subExemptExpireDate value for this SubscriberExempt.
     * 
     * @return subExemptExpireDate
     */
    public java.lang.String getSubExemptExpireDate() {
        return subExemptExpireDate;
    }


    /**
     * Sets the subExemptExpireDate value for this SubscriberExempt.
     * 
     * @param subExemptExpireDate
     */
    public void setSubExemptExpireDate(java.lang.String subExemptExpireDate) {
        this.subExemptExpireDate = subExemptExpireDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubscriberExempt)) return false;
        SubscriberExempt other = (SubscriberExempt) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.phoneId==null && other.getPhoneId()==null) || 
             (this.phoneId!=null &&
              this.phoneId.equals(other.getPhoneId()))) &&
            ((this.subExemptCreditFlag==null && other.getSubExemptCreditFlag()==null) || 
             (this.subExemptCreditFlag!=null &&
              this.subExemptCreditFlag.equals(other.getSubExemptCreditFlag()))) &&
            ((this.subExemptValidDate==null && other.getSubExemptValidDate()==null) || 
             (this.subExemptValidDate!=null &&
              this.subExemptValidDate.equals(other.getSubExemptValidDate()))) &&
            ((this.subExemptExpireDate==null && other.getSubExemptExpireDate()==null) || 
             (this.subExemptExpireDate!=null &&
              this.subExemptExpireDate.equals(other.getSubExemptExpireDate())));
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
        if (getPhoneId() != null) {
            _hashCode += getPhoneId().hashCode();
        }
        if (getSubExemptCreditFlag() != null) {
            _hashCode += getSubExemptCreditFlag().hashCode();
        }
        if (getSubExemptValidDate() != null) {
            _hashCode += getSubExemptValidDate().hashCode();
        }
        if (getSubExemptExpireDate() != null) {
            _hashCode += getSubExemptExpireDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscriberExempt.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "subscriberExempt"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subExemptCreditFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subExemptCreditFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subExemptValidDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subExemptValidDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subExemptExpireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subExemptExpireDate"));
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
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
