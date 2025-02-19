/**
 * PhoneItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class PhoneItem  implements java.io.Serializable {
    private java.lang.Long userId;

    private java.lang.String phoneId;

    private java.lang.Short flag;

    private com.asiainfo.crm.cm.dk.ws.imsservice.ProductSeqItem[] productSeqItemList;

    private java.lang.Short operType;

    public PhoneItem() {
    }

    public PhoneItem(
           java.lang.Long userId,
           java.lang.String phoneId,
           java.lang.Short flag,
           com.asiainfo.crm.cm.dk.ws.imsservice.ProductSeqItem[] productSeqItemList,
           java.lang.Short operType) {
           this.userId = userId;
           this.phoneId = phoneId;
           this.flag = flag;
           this.productSeqItemList = productSeqItemList;
           this.operType = operType;
    }


    /**
     * Gets the userId value for this PhoneItem.
     * 
     * @return userId
     */
    public java.lang.Long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this PhoneItem.
     * 
     * @param userId
     */
    public void setUserId(java.lang.Long userId) {
        this.userId = userId;
    }


    /**
     * Gets the phoneId value for this PhoneItem.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this PhoneItem.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the flag value for this PhoneItem.
     * 
     * @return flag
     */
    public java.lang.Short getFlag() {
        return flag;
    }


    /**
     * Sets the flag value for this PhoneItem.
     * 
     * @param flag
     */
    public void setFlag(java.lang.Short flag) {
        this.flag = flag;
    }


    /**
     * Gets the productSeqItemList value for this PhoneItem.
     * 
     * @return productSeqItemList
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.ProductSeqItem[] getProductSeqItemList() {
        return productSeqItemList;
    }


    /**
     * Sets the productSeqItemList value for this PhoneItem.
     * 
     * @param productSeqItemList
     */
    public void setProductSeqItemList(com.asiainfo.crm.cm.dk.ws.imsservice.ProductSeqItem[] productSeqItemList) {
        this.productSeqItemList = productSeqItemList;
    }


    /**
     * Gets the operType value for this PhoneItem.
     * 
     * @return operType
     */
    public java.lang.Short getOperType() {
        return operType;
    }


    /**
     * Sets the operType value for this PhoneItem.
     * 
     * @param operType
     */
    public void setOperType(java.lang.Short operType) {
        this.operType = operType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PhoneItem)) return false;
        PhoneItem other = (PhoneItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.phoneId==null && other.getPhoneId()==null) || 
             (this.phoneId!=null &&
              this.phoneId.equals(other.getPhoneId()))) &&
            ((this.flag==null && other.getFlag()==null) || 
             (this.flag!=null &&
              this.flag.equals(other.getFlag()))) &&
            ((this.productSeqItemList==null && other.getProductSeqItemList()==null) || 
             (this.productSeqItemList!=null &&
              java.util.Arrays.equals(this.productSeqItemList, other.getProductSeqItemList()))) &&
            ((this.operType==null && other.getOperType()==null) || 
             (this.operType!=null &&
              this.operType.equals(other.getOperType())));
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
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getPhoneId() != null) {
            _hashCode += getPhoneId().hashCode();
        }
        if (getFlag() != null) {
            _hashCode += getFlag().hashCode();
        }
        if (getProductSeqItemList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductSeqItemList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductSeqItemList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOperType() != null) {
            _hashCode += getOperType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PhoneItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "phoneItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productSeqItemList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productSeqItemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "productSeqItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "productSeqItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
