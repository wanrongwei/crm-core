/**
 * AcctNotify.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class AcctNotify  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.Notify[] notifyList_item;

    private java.lang.String accnt_id;

    public AcctNotify() {
    }

    public AcctNotify(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.Notify[] notifyList_item,
           java.lang.String accnt_id) {
           this.notifyList_item = notifyList_item;
           this.accnt_id = accnt_id;
    }


    /**
     * Gets the notifyList_item value for this AcctNotify.
     * 
     * @return notifyList_item
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.Notify[] getNotifyList_item() {
        return notifyList_item;
    }


    /**
     * Sets the notifyList_item value for this AcctNotify.
     * 
     * @param notifyList_item
     */
    public void setNotifyList_item(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.Notify[] notifyList_item) {
        this.notifyList_item = notifyList_item;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.Notify getNotifyList_item(int i) {
        return this.notifyList_item[i];
    }

    public void setNotifyList_item(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.Notify _value) {
        this.notifyList_item[i] = _value;
    }


    /**
     * Gets the accnt_id value for this AcctNotify.
     * 
     * @return accnt_id
     */
    public java.lang.String getAccnt_id() {
        return accnt_id;
    }


    /**
     * Sets the accnt_id value for this AcctNotify.
     * 
     * @param accnt_id
     */
    public void setAccnt_id(java.lang.String accnt_id) {
        this.accnt_id = accnt_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AcctNotify)) return false;
        AcctNotify other = (AcctNotify) obj;
       
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.notifyList_item==null && other.getNotifyList_item()==null) || 
             (this.notifyList_item!=null &&
              java.util.Arrays.equals(this.notifyList_item, other.getNotifyList_item()))) &&
            ((this.accnt_id==null && other.getAccnt_id()==null) || 
             (this.accnt_id!=null &&
              this.accnt_id.equals(other.getAccnt_id())));
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
        if (getNotifyList_item() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotifyList_item());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotifyList_item(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccnt_id() != null) {
            _hashCode += getAccnt_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AcctNotify.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "acctNotify"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifyList_item");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notifyList_item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "notify"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accnt_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accnt_id"));
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
