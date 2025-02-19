/**
 * SOioublInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SOioublInfo  implements java.io.Serializable {
    private java.lang.String eAN;

    private java.lang.Integer eANQualificator;

    private java.lang.String oIOContactName;

    private java.lang.String oIOAcctCode;

    private java.lang.String oIOUBLProfile;

    private java.lang.String oIOUtsProfile;

    private java.lang.String oIOOrderCode;

    public SOioublInfo() {
    }

    public SOioublInfo(
           java.lang.String eAN,
           java.lang.Integer eANQualificator,
           java.lang.String oIOContactName,
           java.lang.String oIOAcctCode,
           java.lang.String oIOUBLProfile,
           java.lang.String oIOUtsProfile,
           java.lang.String oIOOrderCode) {
           this.eAN = eAN;
           this.eANQualificator = eANQualificator;
           this.oIOContactName = oIOContactName;
           this.oIOAcctCode = oIOAcctCode;
           this.oIOUBLProfile = oIOUBLProfile;
           this.oIOUtsProfile = oIOUtsProfile;
           this.oIOOrderCode = oIOOrderCode;
    }


    /**
     * Gets the eAN value for this SOioublInfo.
     * 
     * @return eAN
     */
    public java.lang.String getEAN() {
        return eAN;
    }


    /**
     * Sets the eAN value for this SOioublInfo.
     * 
     * @param eAN
     */
    public void setEAN(java.lang.String eAN) {
        this.eAN = eAN;
    }


    /**
     * Gets the eANQualificator value for this SOioublInfo.
     * 
     * @return eANQualificator
     */
    public java.lang.Integer getEANQualificator() {
        return eANQualificator;
    }


    /**
     * Sets the eANQualificator value for this SOioublInfo.
     * 
     * @param eANQualificator
     */
    public void setEANQualificator(java.lang.Integer eANQualificator) {
        this.eANQualificator = eANQualificator;
    }


    /**
     * Gets the oIOContactName value for this SOioublInfo.
     * 
     * @return oIOContactName
     */
    public java.lang.String getOIOContactName() {
        return oIOContactName;
    }


    /**
     * Sets the oIOContactName value for this SOioublInfo.
     * 
     * @param oIOContactName
     */
    public void setOIOContactName(java.lang.String oIOContactName) {
        this.oIOContactName = oIOContactName;
    }


    /**
     * Gets the oIOAcctCode value for this SOioublInfo.
     * 
     * @return oIOAcctCode
     */
    public java.lang.String getOIOAcctCode() {
        return oIOAcctCode;
    }


    /**
     * Sets the oIOAcctCode value for this SOioublInfo.
     * 
     * @param oIOAcctCode
     */
    public void setOIOAcctCode(java.lang.String oIOAcctCode) {
        this.oIOAcctCode = oIOAcctCode;
    }


    /**
     * Gets the oIOUBLProfile value for this SOioublInfo.
     * 
     * @return oIOUBLProfile
     */
    public java.lang.String getOIOUBLProfile() {
        return oIOUBLProfile;
    }


    /**
     * Sets the oIOUBLProfile value for this SOioublInfo.
     * 
     * @param oIOUBLProfile
     */
    public void setOIOUBLProfile(java.lang.String oIOUBLProfile) {
        this.oIOUBLProfile = oIOUBLProfile;
    }


    /**
     * Gets the oIOUtsProfile value for this SOioublInfo.
     * 
     * @return oIOUtsProfile
     */
    public java.lang.String getOIOUtsProfile() {
        return oIOUtsProfile;
    }


    /**
     * Sets the oIOUtsProfile value for this SOioublInfo.
     * 
     * @param oIOUtsProfile
     */
    public void setOIOUtsProfile(java.lang.String oIOUtsProfile) {
        this.oIOUtsProfile = oIOUtsProfile;
    }


    /**
     * Gets the oIOOrderCode value for this SOioublInfo.
     * 
     * @return oIOOrderCode
     */
    public java.lang.String getOIOOrderCode() {
        return oIOOrderCode;
    }


    /**
     * Sets the oIOOrderCode value for this SOioublInfo.
     * 
     * @param oIOOrderCode
     */
    public void setOIOOrderCode(java.lang.String oIOOrderCode) {
        this.oIOOrderCode = oIOOrderCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SOioublInfo)) return false;
        SOioublInfo other = (SOioublInfo) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eAN==null && other.getEAN()==null) || 
             (this.eAN!=null &&
              this.eAN.equals(other.getEAN()))) &&
            ((this.eANQualificator==null && other.getEANQualificator()==null) || 
             (this.eANQualificator!=null &&
              this.eANQualificator.equals(other.getEANQualificator()))) &&
            ((this.oIOContactName==null && other.getOIOContactName()==null) || 
             (this.oIOContactName!=null &&
              this.oIOContactName.equals(other.getOIOContactName()))) &&
            ((this.oIOAcctCode==null && other.getOIOAcctCode()==null) || 
             (this.oIOAcctCode!=null &&
              this.oIOAcctCode.equals(other.getOIOAcctCode()))) &&
            ((this.oIOUBLProfile==null && other.getOIOUBLProfile()==null) || 
             (this.oIOUBLProfile!=null &&
              this.oIOUBLProfile.equals(other.getOIOUBLProfile()))) &&
            ((this.oIOUtsProfile==null && other.getOIOUtsProfile()==null) || 
             (this.oIOUtsProfile!=null &&
              this.oIOUtsProfile.equals(other.getOIOUtsProfile()))) &&
            ((this.oIOOrderCode==null && other.getOIOOrderCode()==null) || 
             (this.oIOOrderCode!=null &&
              this.oIOOrderCode.equals(other.getOIOOrderCode())));
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
        if (getEAN() != null) {
            _hashCode += getEAN().hashCode();
        }
        if (getEANQualificator() != null) {
            _hashCode += getEANQualificator().hashCode();
        }
        if (getOIOContactName() != null) {
            _hashCode += getOIOContactName().hashCode();
        }
        if (getOIOAcctCode() != null) {
            _hashCode += getOIOAcctCode().hashCode();
        }
        if (getOIOUBLProfile() != null) {
            _hashCode += getOIOUBLProfile().hashCode();
        }
        if (getOIOUtsProfile() != null) {
            _hashCode += getOIOUtsProfile().hashCode();
        }
        if (getOIOOrderCode() != null) {
            _hashCode += getOIOOrderCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SOioublInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sOioublInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EAN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eAN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EANQualificator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eANQualificator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OIOContactName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oIOContactName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OIOAcctCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oIOAcctCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OIOUBLProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oIOUBLProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OIOUtsProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oIOUtsProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OIOOrderCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oIOOrderCode"));
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
