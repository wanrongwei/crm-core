/**
 * SPaySplitInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsservice;

public class SPaySplitInfo  implements java.io.Serializable {
    private java.lang.String outer_pay_acct_id;

    private java.lang.Long pay_acct_id;

    private java.lang.String outer_pay_cust_id;

    private java.lang.Long pay_cust_id;

    private java.lang.Short priority;

    private java.lang.String valid_date;

    private java.lang.String expire_date;

    private java.lang.Short part_type;

    private java.lang.Double part_value;

    private java.lang.Integer measure_id;

    private java.lang.Short split_method;

    public SPaySplitInfo() {
    }

    public SPaySplitInfo(
           java.lang.String outer_pay_acct_id,
           java.lang.Long pay_acct_id,
           java.lang.String outer_pay_cust_id,
           java.lang.Long pay_cust_id,
           java.lang.Short priority,
           java.lang.String valid_date,
           java.lang.String expire_date,
           java.lang.Short part_type,
           java.lang.Double part_value,
           java.lang.Integer measure_id,
           java.lang.Short split_method) {
           this.outer_pay_acct_id = outer_pay_acct_id;
           this.pay_acct_id = pay_acct_id;
           this.outer_pay_cust_id = outer_pay_cust_id;
           this.pay_cust_id = pay_cust_id;
           this.priority = priority;
           this.valid_date = valid_date;
           this.expire_date = expire_date;
           this.part_type = part_type;
           this.part_value = part_value;
           this.measure_id = measure_id;
           this.split_method = split_method;
    }


    /**
     * Gets the outer_pay_acct_id value for this SPaySplitInfo.
     * 
     * @return outer_pay_acct_id
     */
    public java.lang.String getOuter_pay_acct_id() {
        return outer_pay_acct_id;
    }


    /**
     * Sets the outer_pay_acct_id value for this SPaySplitInfo.
     * 
     * @param outer_pay_acct_id
     */
    public void setOuter_pay_acct_id(java.lang.String outer_pay_acct_id) {
        this.outer_pay_acct_id = outer_pay_acct_id;
    }


    /**
     * Gets the pay_acct_id value for this SPaySplitInfo.
     * 
     * @return pay_acct_id
     */
    public java.lang.Long getPay_acct_id() {
        return pay_acct_id;
    }


    /**
     * Sets the pay_acct_id value for this SPaySplitInfo.
     * 
     * @param pay_acct_id
     */
    public void setPay_acct_id(java.lang.Long pay_acct_id) {
        this.pay_acct_id = pay_acct_id;
    }


    /**
     * Gets the outer_pay_cust_id value for this SPaySplitInfo.
     * 
     * @return outer_pay_cust_id
     */
    public java.lang.String getOuter_pay_cust_id() {
        return outer_pay_cust_id;
    }


    /**
     * Sets the outer_pay_cust_id value for this SPaySplitInfo.
     * 
     * @param outer_pay_cust_id
     */
    public void setOuter_pay_cust_id(java.lang.String outer_pay_cust_id) {
        this.outer_pay_cust_id = outer_pay_cust_id;
    }


    /**
     * Gets the pay_cust_id value for this SPaySplitInfo.
     * 
     * @return pay_cust_id
     */
    public java.lang.Long getPay_cust_id() {
        return pay_cust_id;
    }


    /**
     * Sets the pay_cust_id value for this SPaySplitInfo.
     * 
     * @param pay_cust_id
     */
    public void setPay_cust_id(java.lang.Long pay_cust_id) {
        this.pay_cust_id = pay_cust_id;
    }


    /**
     * Gets the priority value for this SPaySplitInfo.
     * 
     * @return priority
     */
    public java.lang.Short getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this SPaySplitInfo.
     * 
     * @param priority
     */
    public void setPriority(java.lang.Short priority) {
        this.priority = priority;
    }


    /**
     * Gets the valid_date value for this SPaySplitInfo.
     * 
     * @return valid_date
     */
    public java.lang.String getValid_date() {
        return valid_date;
    }


    /**
     * Sets the valid_date value for this SPaySplitInfo.
     * 
     * @param valid_date
     */
    public void setValid_date(java.lang.String valid_date) {
        this.valid_date = valid_date;
    }


    /**
     * Gets the expire_date value for this SPaySplitInfo.
     * 
     * @return expire_date
     */
    public java.lang.String getExpire_date() {
        return expire_date;
    }


    /**
     * Sets the expire_date value for this SPaySplitInfo.
     * 
     * @param expire_date
     */
    public void setExpire_date(java.lang.String expire_date) {
        this.expire_date = expire_date;
    }


    /**
     * Gets the part_type value for this SPaySplitInfo.
     * 
     * @return part_type
     */
    public java.lang.Short getPart_type() {
        return part_type;
    }


    /**
     * Sets the part_type value for this SPaySplitInfo.
     * 
     * @param part_type
     */
    public void setPart_type(java.lang.Short part_type) {
        this.part_type = part_type;
    }


    /**
     * Gets the part_value value for this SPaySplitInfo.
     * 
     * @return part_value
     */
    public java.lang.Double getPart_value() {
        return part_value;
    }


    /**
     * Sets the part_value value for this SPaySplitInfo.
     * 
     * @param part_value
     */
    public void setPart_value(java.lang.Double part_value) {
        this.part_value = part_value;
    }


    /**
     * Gets the measure_id value for this SPaySplitInfo.
     * 
     * @return measure_id
     */
    public java.lang.Integer getMeasure_id() {
        return measure_id;
    }


    /**
     * Sets the measure_id value for this SPaySplitInfo.
     * 
     * @param measure_id
     */
    public void setMeasure_id(java.lang.Integer measure_id) {
        this.measure_id = measure_id;
    }


    /**
     * Gets the split_method value for this SPaySplitInfo.
     * 
     * @return split_method
     */
    public java.lang.Short getSplit_method() {
        return split_method;
    }


    /**
     * Sets the split_method value for this SPaySplitInfo.
     * 
     * @param split_method
     */
    public void setSplit_method(java.lang.Short split_method) {
        this.split_method = split_method;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SPaySplitInfo)) return false;
        SPaySplitInfo other = (SPaySplitInfo) obj;
       
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.outer_pay_acct_id==null && other.getOuter_pay_acct_id()==null) || 
             (this.outer_pay_acct_id!=null &&
              this.outer_pay_acct_id.equals(other.getOuter_pay_acct_id()))) &&
            ((this.pay_acct_id==null && other.getPay_acct_id()==null) || 
             (this.pay_acct_id!=null &&
              this.pay_acct_id.equals(other.getPay_acct_id()))) &&
            ((this.outer_pay_cust_id==null && other.getOuter_pay_cust_id()==null) || 
             (this.outer_pay_cust_id!=null &&
              this.outer_pay_cust_id.equals(other.getOuter_pay_cust_id()))) &&
            ((this.pay_cust_id==null && other.getPay_cust_id()==null) || 
             (this.pay_cust_id!=null &&
              this.pay_cust_id.equals(other.getPay_cust_id()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.valid_date==null && other.getValid_date()==null) || 
             (this.valid_date!=null &&
              this.valid_date.equals(other.getValid_date()))) &&
            ((this.expire_date==null && other.getExpire_date()==null) || 
             (this.expire_date!=null &&
              this.expire_date.equals(other.getExpire_date()))) &&
            ((this.part_type==null && other.getPart_type()==null) || 
             (this.part_type!=null &&
              this.part_type.equals(other.getPart_type()))) &&
            ((this.part_value==null && other.getPart_value()==null) || 
             (this.part_value!=null &&
              this.part_value.equals(other.getPart_value()))) &&
            ((this.measure_id==null && other.getMeasure_id()==null) || 
             (this.measure_id!=null &&
              this.measure_id.equals(other.getMeasure_id()))) &&
            ((this.split_method==null && other.getSplit_method()==null) || 
             (this.split_method!=null &&
              this.split_method.equals(other.getSplit_method())));
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
        if (getOuter_pay_acct_id() != null) {
            _hashCode += getOuter_pay_acct_id().hashCode();
        }
        if (getPay_acct_id() != null) {
            _hashCode += getPay_acct_id().hashCode();
        }
        if (getOuter_pay_cust_id() != null) {
            _hashCode += getOuter_pay_cust_id().hashCode();
        }
        if (getPay_cust_id() != null) {
            _hashCode += getPay_cust_id().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getValid_date() != null) {
            _hashCode += getValid_date().hashCode();
        }
        if (getExpire_date() != null) {
            _hashCode += getExpire_date().hashCode();
        }
        if (getPart_type() != null) {
            _hashCode += getPart_type().hashCode();
        }
        if (getPart_value() != null) {
            _hashCode += getPart_value().hashCode();
        }
        if (getMeasure_id() != null) {
            _hashCode += getMeasure_id().hashCode();
        }
        if (getSplit_method() != null) {
            _hashCode += getSplit_method().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SPaySplitInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPaySplitInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outer_pay_acct_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outer_pay_acct_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pay_acct_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay_acct_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outer_pay_cust_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outer_pay_cust_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pay_cust_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay_cust_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
        elemField.setFieldName("part_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "part_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("part_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "part_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measure_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measure_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("split_method");
        elemField.setXmlName(new javax.xml.namespace.QName("", "split_method"));
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
