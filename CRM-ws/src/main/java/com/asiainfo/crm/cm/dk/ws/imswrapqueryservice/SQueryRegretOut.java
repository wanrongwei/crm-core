/**
 * SQueryRegretOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class SQueryRegretOut  implements java.io.Serializable {
    private java.lang.Integer regretFlag;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SRegretErrorInfo[] regretErrorInfo;

    public SQueryRegretOut() {
    }

    public SQueryRegretOut(
           java.lang.Integer regretFlag,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SRegretErrorInfo[] regretErrorInfo) {
           this.regretFlag = regretFlag;
           this.regretErrorInfo = regretErrorInfo;
    }


    /**
     * Gets the regretFlag value for this SQueryRegretOut.
     * 
     * @return regretFlag
     */
    public java.lang.Integer getRegretFlag() {
        return regretFlag;
    }


    /**
     * Sets the regretFlag value for this SQueryRegretOut.
     * 
     * @param regretFlag
     */
    public void setRegretFlag(java.lang.Integer regretFlag) {
        this.regretFlag = regretFlag;
    }


    /**
     * Gets the regretErrorInfo value for this SQueryRegretOut.
     * 
     * @return regretErrorInfo
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SRegretErrorInfo[] getRegretErrorInfo() {
        return regretErrorInfo;
    }


    /**
     * Sets the regretErrorInfo value for this SQueryRegretOut.
     * 
     * @param regretErrorInfo
     */
    public void setRegretErrorInfo(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SRegretErrorInfo[] regretErrorInfo) {
        this.regretErrorInfo = regretErrorInfo;
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SRegretErrorInfo getRegretErrorInfo(int i) {
        return this.regretErrorInfo[i];
    }

    public void setRegretErrorInfo(int i, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SRegretErrorInfo _value) {
        this.regretErrorInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SQueryRegretOut)) return false;
        SQueryRegretOut other = (SQueryRegretOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.regretFlag==null && other.getRegretFlag()==null) || 
             (this.regretFlag!=null &&
              this.regretFlag.equals(other.getRegretFlag()))) &&
            ((this.regretErrorInfo==null && other.getRegretErrorInfo()==null) || 
             (this.regretErrorInfo!=null &&
              java.util.Arrays.equals(this.regretErrorInfo, other.getRegretErrorInfo())));
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
        if (getRegretFlag() != null) {
            _hashCode += getRegretFlag().hashCode();
        }
        if (getRegretErrorInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegretErrorInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegretErrorInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SQueryRegretOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryRegretOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regretFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regretFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regretErrorInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regretErrorInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sRegretErrorInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
