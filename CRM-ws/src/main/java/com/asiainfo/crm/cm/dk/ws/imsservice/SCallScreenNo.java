/**
 * SCallScreenNo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class SCallScreenNo  implements java.io.Serializable {
    private java.lang.String phone_id;

    private java.lang.String valid_date;

    private java.lang.String expire_date;

    private java.lang.String effect_time;

    private java.lang.String expire_time;

    private java.lang.Short week_start;

    private java.lang.Short week_stop;

    private java.lang.String route_number;

    private java.lang.Short ir_route_flag;

    private java.lang.Short routing_method;

    private java.lang.Short list_type;

    public SCallScreenNo() {
    }

    public SCallScreenNo(
           java.lang.String phone_id,
           java.lang.String valid_date,
           java.lang.String expire_date,
           java.lang.String effect_time,
           java.lang.String expire_time,
           java.lang.Short week_start,
           java.lang.Short week_stop,
           java.lang.String route_number,
           java.lang.Short ir_route_flag,
           java.lang.Short routing_method,
           java.lang.Short list_type) {
           this.phone_id = phone_id;
           this.valid_date = valid_date;
           this.expire_date = expire_date;
           this.effect_time = effect_time;
           this.expire_time = expire_time;
           this.week_start = week_start;
           this.week_stop = week_stop;
           this.route_number = route_number;
           this.ir_route_flag = ir_route_flag;
           this.routing_method = routing_method;
           this.list_type = list_type;
    }


    /**
     * Gets the phone_id value for this SCallScreenNo.
     * 
     * @return phone_id
     */
    public java.lang.String getPhone_id() {
        return phone_id;
    }


    /**
     * Sets the phone_id value for this SCallScreenNo.
     * 
     * @param phone_id
     */
    public void setPhone_id(java.lang.String phone_id) {
        this.phone_id = phone_id;
    }


    /**
     * Gets the valid_date value for this SCallScreenNo.
     * 
     * @return valid_date
     */
    public java.lang.String getValid_date() {
        return valid_date;
    }


    /**
     * Sets the valid_date value for this SCallScreenNo.
     * 
     * @param valid_date
     */
    public void setValid_date(java.lang.String valid_date) {
        this.valid_date = valid_date;
    }


    /**
     * Gets the expire_date value for this SCallScreenNo.
     * 
     * @return expire_date
     */
    public java.lang.String getExpire_date() {
        return expire_date;
    }


    /**
     * Sets the expire_date value for this SCallScreenNo.
     * 
     * @param expire_date
     */
    public void setExpire_date(java.lang.String expire_date) {
        this.expire_date = expire_date;
    }


    /**
     * Gets the effect_time value for this SCallScreenNo.
     * 
     * @return effect_time
     */
    public java.lang.String getEffect_time() {
        return effect_time;
    }


    /**
     * Sets the effect_time value for this SCallScreenNo.
     * 
     * @param effect_time
     */
    public void setEffect_time(java.lang.String effect_time) {
        this.effect_time = effect_time;
    }


    /**
     * Gets the expire_time value for this SCallScreenNo.
     * 
     * @return expire_time
     */
    public java.lang.String getExpire_time() {
        return expire_time;
    }


    /**
     * Sets the expire_time value for this SCallScreenNo.
     * 
     * @param expire_time
     */
    public void setExpire_time(java.lang.String expire_time) {
        this.expire_time = expire_time;
    }


    /**
     * Gets the week_start value for this SCallScreenNo.
     * 
     * @return week_start
     */
    public java.lang.Short getWeek_start() {
        return week_start;
    }


    /**
     * Sets the week_start value for this SCallScreenNo.
     * 
     * @param week_start
     */
    public void setWeek_start(java.lang.Short week_start) {
        this.week_start = week_start;
    }


    /**
     * Gets the week_stop value for this SCallScreenNo.
     * 
     * @return week_stop
     */
    public java.lang.Short getWeek_stop() {
        return week_stop;
    }


    /**
     * Sets the week_stop value for this SCallScreenNo.
     * 
     * @param week_stop
     */
    public void setWeek_stop(java.lang.Short week_stop) {
        this.week_stop = week_stop;
    }


    /**
     * Gets the route_number value for this SCallScreenNo.
     * 
     * @return route_number
     */
    public java.lang.String getRoute_number() {
        return route_number;
    }


    /**
     * Sets the route_number value for this SCallScreenNo.
     * 
     * @param route_number
     */
    public void setRoute_number(java.lang.String route_number) {
        this.route_number = route_number;
    }


    /**
     * Gets the ir_route_flag value for this SCallScreenNo.
     * 
     * @return ir_route_flag
     */
    public java.lang.Short getIr_route_flag() {
        return ir_route_flag;
    }


    /**
     * Sets the ir_route_flag value for this SCallScreenNo.
     * 
     * @param ir_route_flag
     */
    public void setIr_route_flag(java.lang.Short ir_route_flag) {
        this.ir_route_flag = ir_route_flag;
    }


    /**
     * Gets the routing_method value for this SCallScreenNo.
     * 
     * @return routing_method
     */
    public java.lang.Short getRouting_method() {
        return routing_method;
    }


    /**
     * Sets the routing_method value for this SCallScreenNo.
     * 
     * @param routing_method
     */
    public void setRouting_method(java.lang.Short routing_method) {
        this.routing_method = routing_method;
    }


    /**
     * Gets the list_type value for this SCallScreenNo.
     * 
     * @return list_type
     */
    public java.lang.Short getList_type() {
        return list_type;
    }


    /**
     * Sets the list_type value for this SCallScreenNo.
     * 
     * @param list_type
     */
    public void setList_type(java.lang.Short list_type) {
        this.list_type = list_type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SCallScreenNo)) return false;
        SCallScreenNo other = (SCallScreenNo) obj;
        if (obj == null) return false;
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
            ((this.valid_date==null && other.getValid_date()==null) || 
             (this.valid_date!=null &&
              this.valid_date.equals(other.getValid_date()))) &&
            ((this.expire_date==null && other.getExpire_date()==null) || 
             (this.expire_date!=null &&
              this.expire_date.equals(other.getExpire_date()))) &&
            ((this.effect_time==null && other.getEffect_time()==null) || 
             (this.effect_time!=null &&
              this.effect_time.equals(other.getEffect_time()))) &&
            ((this.expire_time==null && other.getExpire_time()==null) || 
             (this.expire_time!=null &&
              this.expire_time.equals(other.getExpire_time()))) &&
            ((this.week_start==null && other.getWeek_start()==null) || 
             (this.week_start!=null &&
              this.week_start.equals(other.getWeek_start()))) &&
            ((this.week_stop==null && other.getWeek_stop()==null) || 
             (this.week_stop!=null &&
              this.week_stop.equals(other.getWeek_stop()))) &&
            ((this.route_number==null && other.getRoute_number()==null) || 
             (this.route_number!=null &&
              this.route_number.equals(other.getRoute_number()))) &&
            ((this.ir_route_flag==null && other.getIr_route_flag()==null) || 
             (this.ir_route_flag!=null &&
              this.ir_route_flag.equals(other.getIr_route_flag()))) &&
            ((this.routing_method==null && other.getRouting_method()==null) || 
             (this.routing_method!=null &&
              this.routing_method.equals(other.getRouting_method()))) &&
            ((this.list_type==null && other.getList_type()==null) || 
             (this.list_type!=null &&
              this.list_type.equals(other.getList_type())));
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
        if (getValid_date() != null) {
            _hashCode += getValid_date().hashCode();
        }
        if (getExpire_date() != null) {
            _hashCode += getExpire_date().hashCode();
        }
        if (getEffect_time() != null) {
            _hashCode += getEffect_time().hashCode();
        }
        if (getExpire_time() != null) {
            _hashCode += getExpire_time().hashCode();
        }
        if (getWeek_start() != null) {
            _hashCode += getWeek_start().hashCode();
        }
        if (getWeek_stop() != null) {
            _hashCode += getWeek_stop().hashCode();
        }
        if (getRoute_number() != null) {
            _hashCode += getRoute_number().hashCode();
        }
        if (getIr_route_flag() != null) {
            _hashCode += getIr_route_flag().hashCode();
        }
        if (getRouting_method() != null) {
            _hashCode += getRouting_method().hashCode();
        }
        if (getList_type() != null) {
            _hashCode += getList_type().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SCallScreenNo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCallScreenNo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phone_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valid_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valid_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expire_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expire_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effect_time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "effect_time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expire_time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expire_time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("week_start");
        elemField.setXmlName(new javax.xml.namespace.QName("", "week_start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("week_stop");
        elemField.setXmlName(new javax.xml.namespace.QName("", "week_stop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("route_number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "route_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ir_route_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ir_route_flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routing_method");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routing_method"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("list_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "list_type"));
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
