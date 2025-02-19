/**
 * PbxNumberRange.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class PbxNumberRange  implements java.io.Serializable {
    private java.lang.String mainNumber;

    private java.lang.String viceNumberStart;

    private java.lang.String viceNumberEnd;

    private java.util.Calendar validDate;

    private java.util.Calendar expireDate;

    public PbxNumberRange() {
    }

    public PbxNumberRange(
           java.lang.String mainNumber,
           java.lang.String viceNumberStart,
           java.lang.String viceNumberEnd,
           java.util.Calendar validDate,
           java.util.Calendar expireDate) {
           this.mainNumber = mainNumber;
           this.viceNumberStart = viceNumberStart;
           this.viceNumberEnd = viceNumberEnd;
           this.validDate = validDate;
           this.expireDate = expireDate;
    }


    /**
     * Gets the mainNumber value for this PbxNumberRange.
     * 
     * @return mainNumber
     */
    public java.lang.String getMainNumber() {
        return mainNumber;
    }


    /**
     * Sets the mainNumber value for this PbxNumberRange.
     * 
     * @param mainNumber
     */
    public void setMainNumber(java.lang.String mainNumber) {
        this.mainNumber = mainNumber;
    }


    /**
     * Gets the viceNumberStart value for this PbxNumberRange.
     * 
     * @return viceNumberStart
     */
    public java.lang.String getViceNumberStart() {
        return viceNumberStart;
    }


    /**
     * Sets the viceNumberStart value for this PbxNumberRange.
     * 
     * @param viceNumberStart
     */
    public void setViceNumberStart(java.lang.String viceNumberStart) {
        this.viceNumberStart = viceNumberStart;
    }


    /**
     * Gets the viceNumberEnd value for this PbxNumberRange.
     * 
     * @return viceNumberEnd
     */
    public java.lang.String getViceNumberEnd() {
        return viceNumberEnd;
    }


    /**
     * Sets the viceNumberEnd value for this PbxNumberRange.
     * 
     * @param viceNumberEnd
     */
    public void setViceNumberEnd(java.lang.String viceNumberEnd) {
        this.viceNumberEnd = viceNumberEnd;
    }


    /**
     * Gets the validDate value for this PbxNumberRange.
     * 
     * @return validDate
     */
    public java.util.Calendar getValidDate() {
        return validDate;
    }


    /**
     * Sets the validDate value for this PbxNumberRange.
     * 
     * @param validDate
     */
    public void setValidDate(java.util.Calendar validDate) {
        this.validDate = validDate;
    }


    /**
     * Gets the expireDate value for this PbxNumberRange.
     * 
     * @return expireDate
     */
    public java.util.Calendar getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this PbxNumberRange.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.util.Calendar expireDate) {
        this.expireDate = expireDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PbxNumberRange)) return false;
        PbxNumberRange other = (PbxNumberRange) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mainNumber==null && other.getMainNumber()==null) || 
             (this.mainNumber!=null &&
              this.mainNumber.equals(other.getMainNumber()))) &&
            ((this.viceNumberStart==null && other.getViceNumberStart()==null) || 
             (this.viceNumberStart!=null &&
              this.viceNumberStart.equals(other.getViceNumberStart()))) &&
            ((this.viceNumberEnd==null && other.getViceNumberEnd()==null) || 
             (this.viceNumberEnd!=null &&
              this.viceNumberEnd.equals(other.getViceNumberEnd()))) &&
            ((this.validDate==null && other.getValidDate()==null) || 
             (this.validDate!=null &&
              this.validDate.equals(other.getValidDate()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate())));
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
        if (getMainNumber() != null) {
            _hashCode += getMainNumber().hashCode();
        }
        if (getViceNumberStart() != null) {
            _hashCode += getViceNumberStart().hashCode();
        }
        if (getViceNumberEnd() != null) {
            _hashCode += getViceNumberEnd().hashCode();
        }
        if (getValidDate() != null) {
            _hashCode += getValidDate().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PbxNumberRange.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "pbxNumberRange"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mainNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viceNumberStart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "viceNumberStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viceNumberEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "viceNumberEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
