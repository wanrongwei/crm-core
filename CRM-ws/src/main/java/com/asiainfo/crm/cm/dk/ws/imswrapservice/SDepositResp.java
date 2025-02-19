/**
 * SDepositResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class SDepositResp  implements java.io.Serializable {
    private java.lang.Integer bookItem;

    private java.lang.Double operAmount;

    private java.lang.Double remainAmount;

    private java.lang.String validDate;

    private java.lang.String expireDate;

    private java.lang.Integer measureId;

    public SDepositResp() {
    }

    public SDepositResp(
           java.lang.Integer bookItem,
           java.lang.Double operAmount,
           java.lang.Double remainAmount,
           java.lang.String validDate,
           java.lang.String expireDate,
           java.lang.Integer measureId) {
           this.bookItem = bookItem;
           this.operAmount = operAmount;
           this.remainAmount = remainAmount;
           this.validDate = validDate;
           this.expireDate = expireDate;
           this.measureId = measureId;
    }


    /**
     * Gets the bookItem value for this SDepositResp.
     * 
     * @return bookItem
     */
    public java.lang.Integer getBookItem() {
        return bookItem;
    }


    /**
     * Sets the bookItem value for this SDepositResp.
     * 
     * @param bookItem
     */
    public void setBookItem(java.lang.Integer bookItem) {
        this.bookItem = bookItem;
    }


    /**
     * Gets the operAmount value for this SDepositResp.
     * 
     * @return operAmount
     */
    public java.lang.Double getOperAmount() {
        return operAmount;
    }


    /**
     * Sets the operAmount value for this SDepositResp.
     * 
     * @param operAmount
     */
    public void setOperAmount(java.lang.Double operAmount) {
        this.operAmount = operAmount;
    }


    /**
     * Gets the remainAmount value for this SDepositResp.
     * 
     * @return remainAmount
     */
    public java.lang.Double getRemainAmount() {
        return remainAmount;
    }


    /**
     * Sets the remainAmount value for this SDepositResp.
     * 
     * @param remainAmount
     */
    public void setRemainAmount(java.lang.Double remainAmount) {
        this.remainAmount = remainAmount;
    }


    /**
     * Gets the validDate value for this SDepositResp.
     * 
     * @return validDate
     */
    public java.lang.String getValidDate() {
        return validDate;
    }


    /**
     * Sets the validDate value for this SDepositResp.
     * 
     * @param validDate
     */
    public void setValidDate(java.lang.String validDate) {
        this.validDate = validDate;
    }


    /**
     * Gets the expireDate value for this SDepositResp.
     * 
     * @return expireDate
     */
    public java.lang.String getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this SDepositResp.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.lang.String expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the measureId value for this SDepositResp.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this SDepositResp.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SDepositResp)) return false;
        SDepositResp other = (SDepositResp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bookItem==null && other.getBookItem()==null) || 
             (this.bookItem!=null &&
              this.bookItem.equals(other.getBookItem()))) &&
            ((this.operAmount==null && other.getOperAmount()==null) || 
             (this.operAmount!=null &&
              this.operAmount.equals(other.getOperAmount()))) &&
            ((this.remainAmount==null && other.getRemainAmount()==null) || 
             (this.remainAmount!=null &&
              this.remainAmount.equals(other.getRemainAmount()))) &&
            ((this.validDate==null && other.getValidDate()==null) || 
             (this.validDate!=null &&
              this.validDate.equals(other.getValidDate()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId())));
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
        if (getBookItem() != null) {
            _hashCode += getBookItem().hashCode();
        }
        if (getOperAmount() != null) {
            _hashCode += getOperAmount().hashCode();
        }
        if (getRemainAmount() != null) {
            _hashCode += getRemainAmount().hashCode();
        }
        if (getValidDate() != null) {
            _hashCode += getValidDate().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SDepositResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sDepositResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookItem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bookItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remainAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measureId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measureId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
