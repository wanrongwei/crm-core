/**
 * Notify.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsqueryservice;

public class Notify  implements java.io.Serializable {
    private java.lang.Short notify_type;

    private java.lang.Short notify_channel;

    private java.lang.Integer service_id;

    private java.lang.Long notification_id;

    private java.lang.String notification_name;

    private java.lang.String notification_desc;

    private java.lang.String notify_type_name;

    private java.lang.String notify_channel_name;

    public Notify() {
    }

    public Notify(
           java.lang.Short notify_type,
           java.lang.Short notify_channel,
           java.lang.Integer service_id,
           java.lang.Long notification_id,
           java.lang.String notification_name,
           java.lang.String notification_desc,
           java.lang.String notify_type_name,
           java.lang.String notify_channel_name) {
           this.notify_type = notify_type;
           this.notify_channel = notify_channel;
           this.service_id = service_id;
           this.notification_id = notification_id;
           this.notification_name = notification_name;
           this.notification_desc = notification_desc;
           this.notify_type_name = notify_type_name;
           this.notify_channel_name = notify_channel_name;
    }


    /**
     * Gets the notify_type value for this Notify.
     * 
     * @return notify_type
     */
    public java.lang.Short getNotify_type() {
        return notify_type;
    }


    /**
     * Sets the notify_type value for this Notify.
     * 
     * @param notify_type
     */
    public void setNotify_type(java.lang.Short notify_type) {
        this.notify_type = notify_type;
    }


    /**
     * Gets the notify_channel value for this Notify.
     * 
     * @return notify_channel
     */
    public java.lang.Short getNotify_channel() {
        return notify_channel;
    }


    /**
     * Sets the notify_channel value for this Notify.
     * 
     * @param notify_channel
     */
    public void setNotify_channel(java.lang.Short notify_channel) {
        this.notify_channel = notify_channel;
    }


    /**
     * Gets the service_id value for this Notify.
     * 
     * @return service_id
     */
    public java.lang.Integer getService_id() {
        return service_id;
    }


    /**
     * Sets the service_id value for this Notify.
     * 
     * @param service_id
     */
    public void setService_id(java.lang.Integer service_id) {
        this.service_id = service_id;
    }


    /**
     * Gets the notification_id value for this Notify.
     * 
     * @return notification_id
     */
    public java.lang.Long getNotification_id() {
        return notification_id;
    }


    /**
     * Sets the notification_id value for this Notify.
     * 
     * @param notification_id
     */
    public void setNotification_id(java.lang.Long notification_id) {
        this.notification_id = notification_id;
    }


    /**
     * Gets the notification_name value for this Notify.
     * 
     * @return notification_name
     */
    public java.lang.String getNotification_name() {
        return notification_name;
    }


    /**
     * Sets the notification_name value for this Notify.
     * 
     * @param notification_name
     */
    public void setNotification_name(java.lang.String notification_name) {
        this.notification_name = notification_name;
    }


    /**
     * Gets the notification_desc value for this Notify.
     * 
     * @return notification_desc
     */
    public java.lang.String getNotification_desc() {
        return notification_desc;
    }


    /**
     * Sets the notification_desc value for this Notify.
     * 
     * @param notification_desc
     */
    public void setNotification_desc(java.lang.String notification_desc) {
        this.notification_desc = notification_desc;
    }


    /**
     * Gets the notify_type_name value for this Notify.
     * 
     * @return notify_type_name
     */
    public java.lang.String getNotify_type_name() {
        return notify_type_name;
    }


    /**
     * Sets the notify_type_name value for this Notify.
     * 
     * @param notify_type_name
     */
    public void setNotify_type_name(java.lang.String notify_type_name) {
        this.notify_type_name = notify_type_name;
    }


    /**
     * Gets the notify_channel_name value for this Notify.
     * 
     * @return notify_channel_name
     */
    public java.lang.String getNotify_channel_name() {
        return notify_channel_name;
    }


    /**
     * Sets the notify_channel_name value for this Notify.
     * 
     * @param notify_channel_name
     */
    public void setNotify_channel_name(java.lang.String notify_channel_name) {
        this.notify_channel_name = notify_channel_name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Notify)) return false;
        Notify other = (Notify) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.notify_type==null && other.getNotify_type()==null) || 
             (this.notify_type!=null &&
              this.notify_type.equals(other.getNotify_type()))) &&
            ((this.notify_channel==null && other.getNotify_channel()==null) || 
             (this.notify_channel!=null &&
              this.notify_channel.equals(other.getNotify_channel()))) &&
            ((this.service_id==null && other.getService_id()==null) || 
             (this.service_id!=null &&
              this.service_id.equals(other.getService_id()))) &&
            ((this.notification_id==null && other.getNotification_id()==null) || 
             (this.notification_id!=null &&
              this.notification_id.equals(other.getNotification_id()))) &&
            ((this.notification_name==null && other.getNotification_name()==null) || 
             (this.notification_name!=null &&
              this.notification_name.equals(other.getNotification_name()))) &&
            ((this.notification_desc==null && other.getNotification_desc()==null) || 
             (this.notification_desc!=null &&
              this.notification_desc.equals(other.getNotification_desc()))) &&
            ((this.notify_type_name==null && other.getNotify_type_name()==null) || 
             (this.notify_type_name!=null &&
              this.notify_type_name.equals(other.getNotify_type_name()))) &&
            ((this.notify_channel_name==null && other.getNotify_channel_name()==null) || 
             (this.notify_channel_name!=null &&
              this.notify_channel_name.equals(other.getNotify_channel_name())));
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
        if (getNotify_type() != null) {
            _hashCode += getNotify_type().hashCode();
        }
        if (getNotify_channel() != null) {
            _hashCode += getNotify_channel().hashCode();
        }
        if (getService_id() != null) {
            _hashCode += getService_id().hashCode();
        }
        if (getNotification_id() != null) {
            _hashCode += getNotification_id().hashCode();
        }
        if (getNotification_name() != null) {
            _hashCode += getNotification_name().hashCode();
        }
        if (getNotification_desc() != null) {
            _hashCode += getNotification_desc().hashCode();
        }
        if (getNotify_type_name() != null) {
            _hashCode += getNotify_type_name().hashCode();
        }
        if (getNotify_channel_name() != null) {
            _hashCode += getNotify_channel_name().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Notify.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "notify"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notify_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notify_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notify_channel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notify_channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "service_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notification_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notification_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notification_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notification_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notification_desc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notification_desc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notify_type_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notify_type_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notify_channel_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notify_channel_name"));
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
