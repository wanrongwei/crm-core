/**
 * NotifyOper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class NotifyOper  implements java.io.Serializable {
    private java.lang.Short oper_type;

    private com.asiainfo.crm.cm.dk.ws.imsservice.Notify[][] notifyList;

    public NotifyOper() {
    }

    public NotifyOper(
           java.lang.Short oper_type,
           com.asiainfo.crm.cm.dk.ws.imsservice.Notify[][] notifyList) {
           this.oper_type = oper_type;
           this.notifyList = notifyList;
    }


    /**
     * Gets the oper_type value for this NotifyOper.
     * 
     * @return oper_type
     */
    public java.lang.Short getOper_type() {
        return oper_type;
    }


    /**
     * Sets the oper_type value for this NotifyOper.
     * 
     * @param oper_type
     */
    public void setOper_type(java.lang.Short oper_type) {
        this.oper_type = oper_type;
    }


    /**
     * Gets the notifyList value for this NotifyOper.
     * 
     * @return notifyList
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.Notify[][] getNotifyList() {
        return notifyList;
    }


    /**
     * Sets the notifyList value for this NotifyOper.
     * 
     * @param notifyList
     */
    public void setNotifyList(com.asiainfo.crm.cm.dk.ws.imsservice.Notify[][] notifyList) {
        this.notifyList = notifyList;
    }

    public com.asiainfo.crm.cm.dk.ws.imsservice.Notify[] getNotifyList(int i) {
        return this.notifyList[i];
    }

    public void setNotifyList(int i, com.asiainfo.crm.cm.dk.ws.imsservice.Notify[] _value) {
        this.notifyList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotifyOper)) return false;
        NotifyOper other = (NotifyOper) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.oper_type==null && other.getOper_type()==null) || 
             (this.oper_type!=null &&
              this.oper_type.equals(other.getOper_type()))) &&
            ((this.notifyList==null && other.getNotifyList()==null) || 
             (this.notifyList!=null &&
              java.util.Arrays.equals(this.notifyList, other.getNotifyList())));
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
        if (getOper_type() != null) {
            _hashCode += getOper_type().hashCode();
        }
        if (getNotifyList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotifyList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotifyList(), i);
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
        new org.apache.axis.description.TypeDesc(NotifyOper.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "notifyOper"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oper_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oper_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifyList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notifyList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "notifyList"));
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
