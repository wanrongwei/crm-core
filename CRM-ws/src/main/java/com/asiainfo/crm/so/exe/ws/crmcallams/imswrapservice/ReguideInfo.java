/**
 * ReguideInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class ReguideInfo  implements java.io.Serializable {
    private java.lang.String reguidedMobileNo;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ReguideItemInfo[] reguideItemInfoList;

    private java.lang.String reguideMobileNo;

    private java.lang.Long reguideAcct;

    public ReguideInfo() {
    }

    public ReguideInfo(
           java.lang.String reguidedMobileNo,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ReguideItemInfo[] reguideItemInfoList,
           java.lang.String reguideMobileNo,
           java.lang.Long reguideAcct) {
           this.reguidedMobileNo = reguidedMobileNo;
           this.reguideItemInfoList = reguideItemInfoList;
           this.reguideMobileNo = reguideMobileNo;
           this.reguideAcct = reguideAcct;
    }


    /**
     * Gets the reguidedMobileNo value for this ReguideInfo.
     * 
     * @return reguidedMobileNo
     */
    public java.lang.String getReguidedMobileNo() {
        return reguidedMobileNo;
    }


    /**
     * Sets the reguidedMobileNo value for this ReguideInfo.
     * 
     * @param reguidedMobileNo
     */
    public void setReguidedMobileNo(java.lang.String reguidedMobileNo) {
        this.reguidedMobileNo = reguidedMobileNo;
    }


    /**
     * Gets the reguideItemInfoList value for this ReguideInfo.
     * 
     * @return reguideItemInfoList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ReguideItemInfo[] getReguideItemInfoList() {
        return reguideItemInfoList;
    }


    /**
     * Sets the reguideItemInfoList value for this ReguideInfo.
     * 
     * @param reguideItemInfoList
     */
    public void setReguideItemInfoList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ReguideItemInfo[] reguideItemInfoList) {
        this.reguideItemInfoList = reguideItemInfoList;
    }


    /**
     * Gets the reguideMobileNo value for this ReguideInfo.
     * 
     * @return reguideMobileNo
     */
    public java.lang.String getReguideMobileNo() {
        return reguideMobileNo;
    }


    /**
     * Sets the reguideMobileNo value for this ReguideInfo.
     * 
     * @param reguideMobileNo
     */
    public void setReguideMobileNo(java.lang.String reguideMobileNo) {
        this.reguideMobileNo = reguideMobileNo;
    }


    /**
     * Gets the reguideAcct value for this ReguideInfo.
     * 
     * @return reguideAcct
     */
    public java.lang.Long getReguideAcct() {
        return reguideAcct;
    }


    /**
     * Sets the reguideAcct value for this ReguideInfo.
     * 
     * @param reguideAcct
     */
    public void setReguideAcct(java.lang.Long reguideAcct) {
        this.reguideAcct = reguideAcct;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReguideInfo)) return false;
        ReguideInfo other = (ReguideInfo) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reguidedMobileNo==null && other.getReguidedMobileNo()==null) || 
             (this.reguidedMobileNo!=null &&
              this.reguidedMobileNo.equals(other.getReguidedMobileNo()))) &&
            ((this.reguideItemInfoList==null && other.getReguideItemInfoList()==null) || 
             (this.reguideItemInfoList!=null &&
              java.util.Arrays.equals(this.reguideItemInfoList, other.getReguideItemInfoList()))) &&
            ((this.reguideMobileNo==null && other.getReguideMobileNo()==null) || 
             (this.reguideMobileNo!=null &&
              this.reguideMobileNo.equals(other.getReguideMobileNo()))) &&
            ((this.reguideAcct==null && other.getReguideAcct()==null) || 
             (this.reguideAcct!=null &&
              this.reguideAcct.equals(other.getReguideAcct())));
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
        if (getReguidedMobileNo() != null) {
            _hashCode += getReguidedMobileNo().hashCode();
        }
        if (getReguideItemInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReguideItemInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReguideItemInfoList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReguideMobileNo() != null) {
            _hashCode += getReguideMobileNo().hashCode();
        }
        if (getReguideAcct() != null) {
            _hashCode += getReguideAcct().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReguideInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "reguideInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reguidedMobileNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reguidedMobileNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reguideItemInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reguideItemInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "reguideItemInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "reguideItemInfoList_Item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reguideMobileNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reguideMobileNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reguideAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reguideAcct"));
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
