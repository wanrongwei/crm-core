/**
 * SNegativeBalance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.imswrapservice;

public class SNegativeBalance  implements java.io.Serializable {
    private java.lang.Integer bookItem;

    private java.lang.String acctId;

    private java.lang.Long userId;

    private java.lang.String phoneId;

    private java.lang.Long negativeBalance;

    private java.lang.Long remainNegativeBalance;

    private java.lang.String negativeValidDate;

    private java.lang.String negativeExpireDate;

    private java.lang.String bookItemType;

    public SNegativeBalance() {
    }

    public SNegativeBalance(
           java.lang.Integer bookItem,
           java.lang.String acctId,
           java.lang.Long userId,
           java.lang.String phoneId,
           java.lang.Long negativeBalance,
           java.lang.Long remainNegativeBalance,
           java.lang.String negativeValidDate,
           java.lang.String negativeExpireDate,
           java.lang.String bookItemType) {
           this.bookItem = bookItem;
           this.acctId = acctId;
           this.userId = userId;
           this.phoneId = phoneId;
           this.negativeBalance = negativeBalance;
           this.remainNegativeBalance = remainNegativeBalance;
           this.negativeValidDate = negativeValidDate;
           this.negativeExpireDate = negativeExpireDate;
           this.bookItemType = bookItemType;
    }


    /**
     * Gets the bookItem value for this SNegativeBalance.
     * 
     * @return bookItem
     */
    public java.lang.Integer getBookItem() {
        return bookItem;
    }


    /**
     * Sets the bookItem value for this SNegativeBalance.
     * 
     * @param bookItem
     */
    public void setBookItem(java.lang.Integer bookItem) {
        this.bookItem = bookItem;
    }


    /**
     * Gets the acctId value for this SNegativeBalance.
     * 
     * @return acctId
     */
    public java.lang.String getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SNegativeBalance.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.String acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the userId value for this SNegativeBalance.
     * 
     * @return userId
     */
    public java.lang.Long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this SNegativeBalance.
     * 
     * @param userId
     */
    public void setUserId(java.lang.Long userId) {
        this.userId = userId;
    }


    /**
     * Gets the phoneId value for this SNegativeBalance.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this SNegativeBalance.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the negativeBalance value for this SNegativeBalance.
     * 
     * @return negativeBalance
     */
    public java.lang.Long getNegativeBalance() {
        return negativeBalance;
    }


    /**
     * Sets the negativeBalance value for this SNegativeBalance.
     * 
     * @param negativeBalance
     */
    public void setNegativeBalance(java.lang.Long negativeBalance) {
        this.negativeBalance = negativeBalance;
    }


    /**
     * Gets the remainNegativeBalance value for this SNegativeBalance.
     * 
     * @return remainNegativeBalance
     */
    public java.lang.Long getRemainNegativeBalance() {
        return remainNegativeBalance;
    }


    /**
     * Sets the remainNegativeBalance value for this SNegativeBalance.
     * 
     * @param remainNegativeBalance
     */
    public void setRemainNegativeBalance(java.lang.Long remainNegativeBalance) {
        this.remainNegativeBalance = remainNegativeBalance;
    }


    /**
     * Gets the negativeValidDate value for this SNegativeBalance.
     * 
     * @return negativeValidDate
     */
    public java.lang.String getNegativeValidDate() {
        return negativeValidDate;
    }


    /**
     * Sets the negativeValidDate value for this SNegativeBalance.
     * 
     * @param negativeValidDate
     */
    public void setNegativeValidDate(java.lang.String negativeValidDate) {
        this.negativeValidDate = negativeValidDate;
    }


    /**
     * Gets the negativeExpireDate value for this SNegativeBalance.
     * 
     * @return negativeExpireDate
     */
    public java.lang.String getNegativeExpireDate() {
        return negativeExpireDate;
    }


    /**
     * Sets the negativeExpireDate value for this SNegativeBalance.
     * 
     * @param negativeExpireDate
     */
    public void setNegativeExpireDate(java.lang.String negativeExpireDate) {
        this.negativeExpireDate = negativeExpireDate;
    }


    /**
     * Gets the bookItemType value for this SNegativeBalance.
     * 
     * @return bookItemType
     */
    public java.lang.String getBookItemType() {
        return bookItemType;
    }


    /**
     * Sets the bookItemType value for this SNegativeBalance.
     * 
     * @param bookItemType
     */
    public void setBookItemType(java.lang.String bookItemType) {
        this.bookItemType = bookItemType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SNegativeBalance)) return false;
        SNegativeBalance other = (SNegativeBalance) obj;
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
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.phoneId==null && other.getPhoneId()==null) || 
             (this.phoneId!=null &&
              this.phoneId.equals(other.getPhoneId()))) &&
            ((this.negativeBalance==null && other.getNegativeBalance()==null) || 
             (this.negativeBalance!=null &&
              this.negativeBalance.equals(other.getNegativeBalance()))) &&
            ((this.remainNegativeBalance==null && other.getRemainNegativeBalance()==null) || 
             (this.remainNegativeBalance!=null &&
              this.remainNegativeBalance.equals(other.getRemainNegativeBalance()))) &&
            ((this.negativeValidDate==null && other.getNegativeValidDate()==null) || 
             (this.negativeValidDate!=null &&
              this.negativeValidDate.equals(other.getNegativeValidDate()))) &&
            ((this.negativeExpireDate==null && other.getNegativeExpireDate()==null) || 
             (this.negativeExpireDate!=null &&
              this.negativeExpireDate.equals(other.getNegativeExpireDate()))) &&
            ((this.bookItemType==null && other.getBookItemType()==null) || 
             (this.bookItemType!=null &&
              this.bookItemType.equals(other.getBookItemType())));
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
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getPhoneId() != null) {
            _hashCode += getPhoneId().hashCode();
        }
        if (getNegativeBalance() != null) {
            _hashCode += getNegativeBalance().hashCode();
        }
        if (getRemainNegativeBalance() != null) {
            _hashCode += getRemainNegativeBalance().hashCode();
        }
        if (getNegativeValidDate() != null) {
            _hashCode += getNegativeValidDate().hashCode();
        }
        if (getNegativeExpireDate() != null) {
            _hashCode += getNegativeExpireDate().hashCode();
        }
        if (getBookItemType() != null) {
            _hashCode += getBookItemType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SNegativeBalance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sNegativeBalance"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookItem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bookItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negativeBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "negativeBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainNegativeBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remainNegativeBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negativeValidDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "negativeValidDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negativeExpireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "negativeExpireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookItemType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bookItemType"));
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
