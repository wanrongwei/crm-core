/**
 * SValidity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SValidity  implements java.io.Serializable {
    private java.lang.String phone_id;

    private java.lang.Long acct_id;

    private java.lang.Long resource_id;

    private java.lang.Integer owner_type;

    private java.util.Calendar valid_date;

    private java.util.Calendar expire_date;

    private java.lang.Long book_item;

    private java.lang.Long times;

    private java.lang.Long trans_value;

    public SValidity() {
    }

    public SValidity(
           java.lang.String phone_id,
           java.lang.Long acct_id,
           java.lang.Long resource_id,
           java.lang.Integer owner_type,
           java.util.Calendar valid_date,
           java.util.Calendar expire_date,
           java.lang.Long book_item,
           java.lang.Long times,
           java.lang.Long trans_value) {
           this.phone_id = phone_id;
           this.acct_id = acct_id;
           this.resource_id = resource_id;
           this.owner_type = owner_type;
           this.valid_date = valid_date;
           this.expire_date = expire_date;
           this.book_item = book_item;
           this.times = times;
           this.trans_value = trans_value;
    }


    /**
     * Gets the phone_id value for this SValidity.
     * 
     * @return phone_id
     */
    public java.lang.String getPhone_id() {
        return phone_id;
    }


    /**
     * Sets the phone_id value for this SValidity.
     * 
     * @param phone_id
     */
    public void setPhone_id(java.lang.String phone_id) {
        this.phone_id = phone_id;
    }


    /**
     * Gets the acct_id value for this SValidity.
     * 
     * @return acct_id
     */
    public java.lang.Long getAcct_id() {
        return acct_id;
    }


    /**
     * Sets the acct_id value for this SValidity.
     * 
     * @param acct_id
     */
    public void setAcct_id(java.lang.Long acct_id) {
        this.acct_id = acct_id;
    }


    /**
     * Gets the resource_id value for this SValidity.
     * 
     * @return resource_id
     */
    public java.lang.Long getResource_id() {
        return resource_id;
    }


    /**
     * Sets the resource_id value for this SValidity.
     * 
     * @param resource_id
     */
    public void setResource_id(java.lang.Long resource_id) {
        this.resource_id = resource_id;
    }


    /**
     * Gets the owner_type value for this SValidity.
     * 
     * @return owner_type
     */
    public java.lang.Integer getOwner_type() {
        return owner_type;
    }


    /**
     * Sets the owner_type value for this SValidity.
     * 
     * @param owner_type
     */
    public void setOwner_type(java.lang.Integer owner_type) {
        this.owner_type = owner_type;
    }


    /**
     * Gets the valid_date value for this SValidity.
     * 
     * @return valid_date
     */
    public java.util.Calendar getValid_date() {
        return valid_date;
    }


    /**
     * Sets the valid_date value for this SValidity.
     * 
     * @param valid_date
     */
    public void setValid_date(java.util.Calendar valid_date) {
        this.valid_date = valid_date;
    }


    /**
     * Gets the expire_date value for this SValidity.
     * 
     * @return expire_date
     */
    public java.util.Calendar getExpire_date() {
        return expire_date;
    }


    /**
     * Sets the expire_date value for this SValidity.
     * 
     * @param expire_date
     */
    public void setExpire_date(java.util.Calendar expire_date) {
        this.expire_date = expire_date;
    }


    /**
     * Gets the book_item value for this SValidity.
     * 
     * @return book_item
     */
    public java.lang.Long getBook_item() {
        return book_item;
    }


    /**
     * Sets the book_item value for this SValidity.
     * 
     * @param book_item
     */
    public void setBook_item(java.lang.Long book_item) {
        this.book_item = book_item;
    }


    /**
     * Gets the times value for this SValidity.
     * 
     * @return times
     */
    public java.lang.Long getTimes() {
        return times;
    }


    /**
     * Sets the times value for this SValidity.
     * 
     * @param times
     */
    public void setTimes(java.lang.Long times) {
        this.times = times;
    }


    /**
     * Gets the trans_value value for this SValidity.
     * 
     * @return trans_value
     */
    public java.lang.Long getTrans_value() {
        return trans_value;
    }


    /**
     * Sets the trans_value value for this SValidity.
     * 
     * @param trans_value
     */
    public void setTrans_value(java.lang.Long trans_value) {
        this.trans_value = trans_value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SValidity)) return false;
        SValidity other = (SValidity) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.phone_id==null && other.getPhone_id()==null) || 
             (this.phone_id!=null &&
              this.phone_id.equals(other.getPhone_id()))) &&
            ((this.acct_id==null && other.getAcct_id()==null) || 
             (this.acct_id!=null &&
              this.acct_id.equals(other.getAcct_id()))) &&
            ((this.resource_id==null && other.getResource_id()==null) || 
             (this.resource_id!=null &&
              this.resource_id.equals(other.getResource_id()))) &&
            ((this.owner_type==null && other.getOwner_type()==null) || 
             (this.owner_type!=null &&
              this.owner_type.equals(other.getOwner_type()))) &&
            ((this.valid_date==null && other.getValid_date()==null) || 
             (this.valid_date!=null &&
              this.valid_date.equals(other.getValid_date()))) &&
            ((this.expire_date==null && other.getExpire_date()==null) || 
             (this.expire_date!=null &&
              this.expire_date.equals(other.getExpire_date()))) &&
            ((this.book_item==null && other.getBook_item()==null) || 
             (this.book_item!=null &&
              this.book_item.equals(other.getBook_item()))) &&
            ((this.times==null && other.getTimes()==null) || 
             (this.times!=null &&
              this.times.equals(other.getTimes()))) &&
            ((this.trans_value==null && other.getTrans_value()==null) || 
             (this.trans_value!=null &&
              this.trans_value.equals(other.getTrans_value())));
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
        if (getPhone_id() != null) {
            _hashCode += getPhone_id().hashCode();
        }
        if (getAcct_id() != null) {
            _hashCode += getAcct_id().hashCode();
        }
        if (getResource_id() != null) {
            _hashCode += getResource_id().hashCode();
        }
        if (getOwner_type() != null) {
            _hashCode += getOwner_type().hashCode();
        }
        if (getValid_date() != null) {
            _hashCode += getValid_date().hashCode();
        }
        if (getExpire_date() != null) {
            _hashCode += getExpire_date().hashCode();
        }
        if (getBook_item() != null) {
            _hashCode += getBook_item().hashCode();
        }
        if (getTimes() != null) {
            _hashCode += getTimes().hashCode();
        }
        if (getTrans_value() != null) {
            _hashCode += getTrans_value().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SValidity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sValidity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phone_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acct_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acct_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resource_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resource_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "owner_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valid_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valid_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expire_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expire_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("book_item");
        elemField.setXmlName(new javax.xml.namespace.QName("", "book_item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("times");
        elemField.setXmlName(new javax.xml.namespace.QName("", "times"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trans_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trans_value"));
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
