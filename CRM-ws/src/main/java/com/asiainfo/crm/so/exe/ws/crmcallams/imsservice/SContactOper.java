/**
 * SContactOper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsservice;

public class SContactOper  implements java.io.Serializable {
    private java.lang.Short operType;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SContact[] contactList;

    public SContactOper() {
    }

    public SContactOper(
           java.lang.Short operType,
           com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SContact[] contactList) {
           this.operType = operType;
           this.contactList = contactList;
    }


    /**
     * Gets the operType value for this SContactOper.
     * 
     * @return operType
     */
    public java.lang.Short getOperType() {
        return operType;
    }


    /**
     * Sets the operType value for this SContactOper.
     * 
     * @param operType
     */
    public void setOperType(java.lang.Short operType) {
        this.operType = operType;
    }


    /**
     * Gets the contactList value for this SContactOper.
     * 
     * @return contactList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SContact[] getContactList() {
        return contactList;
    }


    /**
     * Sets the contactList value for this SContactOper.
     * 
     * @param contactList
     */
    public void setContactList(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SContact[] contactList) {
        this.contactList = contactList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SContactOper)) return false;
        SContactOper other = (SContactOper) obj;
       
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
            ((this.contactList==null && other.getContactList()==null) || 
             (this.contactList!=null &&
              java.util.Arrays.equals(this.contactList, other.getContactList())));
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
        if (getContactList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContactList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContactList(), i);
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
        new org.apache.axis.description.TypeDesc(SContactOper.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sContactOper"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contactList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sContact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "sContactListItem"));
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
