/**
 * SCaBusiRecDeduct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class SCaBusiRecDeduct  implements java.io.Serializable {
    private java.lang.Integer deductType;

    private java.lang.Long amont;

    public SCaBusiRecDeduct() {
    }

    public SCaBusiRecDeduct(
           java.lang.Integer deductType,
           java.lang.Long amont) {
           this.deductType = deductType;
           this.amont = amont;
    }


    /**
     * Gets the deductType value for this SCaBusiRecDeduct.
     * 
     * @return deductType
     */
    public java.lang.Integer getDeductType() {
        return deductType;
    }


    /**
     * Sets the deductType value for this SCaBusiRecDeduct.
     * 
     * @param deductType
     */
    public void setDeductType(java.lang.Integer deductType) {
        this.deductType = deductType;
    }


    /**
     * Gets the amont value for this SCaBusiRecDeduct.
     * 
     * @return amont
     */
    public java.lang.Long getAmont() {
        return amont;
    }


    /**
     * Sets the amont value for this SCaBusiRecDeduct.
     * 
     * @param amont
     */
    public void setAmont(java.lang.Long amont) {
        this.amont = amont;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SCaBusiRecDeduct)) return false;
        SCaBusiRecDeduct other = (SCaBusiRecDeduct) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deductType==null && other.getDeductType()==null) || 
             (this.deductType!=null &&
              this.deductType.equals(other.getDeductType()))) &&
            ((this.amont==null && other.getAmont()==null) || 
             (this.amont!=null &&
              this.amont.equals(other.getAmont())));
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
        if (getDeductType() != null) {
            _hashCode += getDeductType().hashCode();
        }
        if (getAmont() != null) {
            _hashCode += getAmont().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SCaBusiRecDeduct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCaBusiRecDeduct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deductType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deductType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amont");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amont"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
