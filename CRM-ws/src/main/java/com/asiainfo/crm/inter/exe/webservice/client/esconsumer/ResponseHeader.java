/**
 * ResponseHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.esconsumer;

public class ResponseHeader  implements java.io.Serializable {
    private java.lang.String transactionID;

    private java.lang.String rspTransactionID;

    private java.lang.String rspTime;

    private java.lang.String rspCode;

    private java.lang.String rspDesc;

    private java.lang.String rspType;

    public ResponseHeader() {
    }

    public ResponseHeader(
           java.lang.String transactionID,
           java.lang.String rspTransactionID,
           java.lang.String rspTime,
           java.lang.String rspCode,
           java.lang.String rspDesc,
           java.lang.String rspType) {
           this.transactionID = transactionID;
           this.rspTransactionID = rspTransactionID;
           this.rspTime = rspTime;
           this.rspCode = rspCode;
           this.rspDesc = rspDesc;
           this.rspType = rspType;
    }


    /**
     * Gets the transactionID value for this ResponseHeader.
     * 
     * @return transactionID
     */
    public java.lang.String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this ResponseHeader.
     * 
     * @param transactionID
     */
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the rspTransactionID value for this ResponseHeader.
     * 
     * @return rspTransactionID
     */
    public java.lang.String getRspTransactionID() {
        return rspTransactionID;
    }


    /**
     * Sets the rspTransactionID value for this ResponseHeader.
     * 
     * @param rspTransactionID
     */
    public void setRspTransactionID(java.lang.String rspTransactionID) {
        this.rspTransactionID = rspTransactionID;
    }


    /**
     * Gets the rspTime value for this ResponseHeader.
     * 
     * @return rspTime
     */
    public java.lang.String getRspTime() {
        return rspTime;
    }


    /**
     * Sets the rspTime value for this ResponseHeader.
     * 
     * @param rspTime
     */
    public void setRspTime(java.lang.String rspTime) {
        this.rspTime = rspTime;
    }


    /**
     * Gets the rspCode value for this ResponseHeader.
     * 
     * @return rspCode
     */
    public java.lang.String getRspCode() {
        return rspCode;
    }


    /**
     * Sets the rspCode value for this ResponseHeader.
     * 
     * @param rspCode
     */
    public void setRspCode(java.lang.String rspCode) {
        this.rspCode = rspCode;
    }


    /**
     * Gets the rspDesc value for this ResponseHeader.
     * 
     * @return rspDesc
     */
    public java.lang.String getRspDesc() {
        return rspDesc;
    }


    /**
     * Sets the rspDesc value for this ResponseHeader.
     * 
     * @param rspDesc
     */
    public void setRspDesc(java.lang.String rspDesc) {
        this.rspDesc = rspDesc;
    }


    /**
     * Gets the rspType value for this ResponseHeader.
     * 
     * @return rspType
     */
    public java.lang.String getRspType() {
        return rspType;
    }


    /**
     * Sets the rspType value for this ResponseHeader.
     * 
     * @param rspType
     */
    public void setRspType(java.lang.String rspType) {
        this.rspType = rspType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseHeader)) return false;
        ResponseHeader other = (ResponseHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID()))) &&
            ((this.rspTransactionID==null && other.getRspTransactionID()==null) || 
             (this.rspTransactionID!=null &&
              this.rspTransactionID.equals(other.getRspTransactionID()))) &&
            ((this.rspTime==null && other.getRspTime()==null) || 
             (this.rspTime!=null &&
              this.rspTime.equals(other.getRspTime()))) &&
            ((this.rspCode==null && other.getRspCode()==null) || 
             (this.rspCode!=null &&
              this.rspCode.equals(other.getRspCode()))) &&
            ((this.rspDesc==null && other.getRspDesc()==null) || 
             (this.rspDesc!=null &&
              this.rspDesc.equals(other.getRspDesc()))) &&
            ((this.rspType==null && other.getRspType()==null) || 
             (this.rspType!=null &&
              this.rspType.equals(other.getRspType())));
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
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        if (getRspTransactionID() != null) {
            _hashCode += getRspTransactionID().hashCode();
        }
        if (getRspTime() != null) {
            _hashCode += getRspTime().hashCode();
        }
        if (getRspCode() != null) {
            _hashCode += getRspCode().hashCode();
        }
        if (getRspDesc() != null) {
            _hashCode += getRspDesc().hashCode();
        }
        if (getRspType() != null) {
            _hashCode += getRspType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/common", "ResponseHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rspTransactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RspTransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rspTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RspTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rspCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RspCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rspDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RspDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rspType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RspType"));
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
