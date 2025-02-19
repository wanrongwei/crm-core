/**
 * SMemberOperList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class SMemberOperList  implements java.io.Serializable {
    private java.lang.Short operType;

    private com.asiainfo.crm.cm.dk.ws.imsservice.SMember[] sMemberList_Item;

    public SMemberOperList() {
    }

    public SMemberOperList(
           java.lang.Short operType,
           com.asiainfo.crm.cm.dk.ws.imsservice.SMember[] sMemberList_Item) {
           this.operType = operType;
           this.sMemberList_Item = sMemberList_Item;
    }


    /**
     * Gets the operType value for this SMemberOperList.
     * 
     * @return operType
     */
    public java.lang.Short getOperType() {
        return operType;
    }


    /**
     * Sets the operType value for this SMemberOperList.
     * 
     * @param operType
     */
    public void setOperType(java.lang.Short operType) {
        this.operType = operType;
    }


    /**
     * Gets the sMemberList_Item value for this SMemberOperList.
     * 
     * @return sMemberList_Item
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.SMember[] getSMemberList_Item() {
        return sMemberList_Item;
    }


    /**
     * Sets the sMemberList_Item value for this SMemberOperList.
     * 
     * @param sMemberList_Item
     */
    public void setSMemberList_Item(com.asiainfo.crm.cm.dk.ws.imsservice.SMember[] sMemberList_Item) {
        this.sMemberList_Item = sMemberList_Item;
    }

    public com.asiainfo.crm.cm.dk.ws.imsservice.SMember getSMemberList_Item(int i) {
        return this.sMemberList_Item[i];
    }

    public void setSMemberList_Item(int i, com.asiainfo.crm.cm.dk.ws.imsservice.SMember _value) {
        this.sMemberList_Item[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SMemberOperList)) return false;
        SMemberOperList other = (SMemberOperList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operType==null && other.getOperType()==null) || 
             (this.operType!=null &&
              this.operType.equals(other.getOperType()))) &&
            ((this.sMemberList_Item==null && other.getSMemberList_Item()==null) || 
             (this.sMemberList_Item!=null &&
              java.util.Arrays.equals(this.sMemberList_Item, other.getSMemberList_Item())));
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
        if (getOperType() != null) {
            _hashCode += getOperType().hashCode();
        }
        if (getSMemberList_Item() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSMemberList_Item());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSMemberList_Item(), i);
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
        new org.apache.axis.description.TypeDesc(SMemberOperList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sMemberOperList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SMemberList_Item");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sMemberList_Item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sMember"));
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
