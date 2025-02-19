/**
 * QueryAutoTopUpReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.imswrapservice;

public class QueryAutoTopUpReq  implements java.io.Serializable {
    private java.lang.String outer_pay_acct_id;

    private java.lang.Long pay_acct_id;

    private java.lang.Long pay_user_id;

    private java.lang.String pay_phone_id;

    private java.lang.Long trans_id;

    private java.lang.Short topup_type;

    private java.lang.String outer_target_acct_id;

    private java.lang.Long target_acct_id;

    private java.lang.Long target_user_id;

    private java.lang.String target_phone_id;

    private java.lang.Short auto_type;

    public QueryAutoTopUpReq() {
    }

    public QueryAutoTopUpReq(
           java.lang.String outer_pay_acct_id,
           java.lang.Long pay_acct_id,
           java.lang.Long pay_user_id,
           java.lang.String pay_phone_id,
           java.lang.Long trans_id,
           java.lang.Short topup_type,
           java.lang.String outer_target_acct_id,
           java.lang.Long target_acct_id,
           java.lang.Long target_user_id,
           java.lang.String target_phone_id,
           java.lang.Short auto_type) {
           this.outer_pay_acct_id = outer_pay_acct_id;
           this.pay_acct_id = pay_acct_id;
           this.pay_user_id = pay_user_id;
           this.pay_phone_id = pay_phone_id;
           this.trans_id = trans_id;
           this.topup_type = topup_type;
           this.outer_target_acct_id = outer_target_acct_id;
           this.target_acct_id = target_acct_id;
           this.target_user_id = target_user_id;
           this.target_phone_id = target_phone_id;
           this.auto_type = auto_type;
    }


    /**
     * Gets the outer_pay_acct_id value for this QueryAutoTopUpReq.
     * 
     * @return outer_pay_acct_id
     */
    public java.lang.String getOuter_pay_acct_id() {
        return outer_pay_acct_id;
    }


    /**
     * Sets the outer_pay_acct_id value for this QueryAutoTopUpReq.
     * 
     * @param outer_pay_acct_id
     */
    public void setOuter_pay_acct_id(java.lang.String outer_pay_acct_id) {
        this.outer_pay_acct_id = outer_pay_acct_id;
    }


    /**
     * Gets the pay_acct_id value for this QueryAutoTopUpReq.
     * 
     * @return pay_acct_id
     */
    public java.lang.Long getPay_acct_id() {
        return pay_acct_id;
    }


    /**
     * Sets the pay_acct_id value for this QueryAutoTopUpReq.
     * 
     * @param pay_acct_id
     */
    public void setPay_acct_id(java.lang.Long pay_acct_id) {
        this.pay_acct_id = pay_acct_id;
    }


    /**
     * Gets the pay_user_id value for this QueryAutoTopUpReq.
     * 
     * @return pay_user_id
     */
    public java.lang.Long getPay_user_id() {
        return pay_user_id;
    }


    /**
     * Sets the pay_user_id value for this QueryAutoTopUpReq.
     * 
     * @param pay_user_id
     */
    public void setPay_user_id(java.lang.Long pay_user_id) {
        this.pay_user_id = pay_user_id;
    }


    /**
     * Gets the pay_phone_id value for this QueryAutoTopUpReq.
     * 
     * @return pay_phone_id
     */
    public java.lang.String getPay_phone_id() {
        return pay_phone_id;
    }


    /**
     * Sets the pay_phone_id value for this QueryAutoTopUpReq.
     * 
     * @param pay_phone_id
     */
    public void setPay_phone_id(java.lang.String pay_phone_id) {
        this.pay_phone_id = pay_phone_id;
    }


    /**
     * Gets the trans_id value for this QueryAutoTopUpReq.
     * 
     * @return trans_id
     */
    public java.lang.Long getTrans_id() {
        return trans_id;
    }


    /**
     * Sets the trans_id value for this QueryAutoTopUpReq.
     * 
     * @param trans_id
     */
    public void setTrans_id(java.lang.Long trans_id) {
        this.trans_id = trans_id;
    }


    /**
     * Gets the topup_type value for this QueryAutoTopUpReq.
     * 
     * @return topup_type
     */
    public java.lang.Short getTopup_type() {
        return topup_type;
    }


    /**
     * Sets the topup_type value for this QueryAutoTopUpReq.
     * 
     * @param topup_type
     */
    public void setTopup_type(java.lang.Short topup_type) {
        this.topup_type = topup_type;
    }


    /**
     * Gets the outer_target_acct_id value for this QueryAutoTopUpReq.
     * 
     * @return outer_target_acct_id
     */
    public java.lang.String getOuter_target_acct_id() {
        return outer_target_acct_id;
    }


    /**
     * Sets the outer_target_acct_id value for this QueryAutoTopUpReq.
     * 
     * @param outer_target_acct_id
     */
    public void setOuter_target_acct_id(java.lang.String outer_target_acct_id) {
        this.outer_target_acct_id = outer_target_acct_id;
    }


    /**
     * Gets the target_acct_id value for this QueryAutoTopUpReq.
     * 
     * @return target_acct_id
     */
    public java.lang.Long getTarget_acct_id() {
        return target_acct_id;
    }


    /**
     * Sets the target_acct_id value for this QueryAutoTopUpReq.
     * 
     * @param target_acct_id
     */
    public void setTarget_acct_id(java.lang.Long target_acct_id) {
        this.target_acct_id = target_acct_id;
    }


    /**
     * Gets the target_user_id value for this QueryAutoTopUpReq.
     * 
     * @return target_user_id
     */
    public java.lang.Long getTarget_user_id() {
        return target_user_id;
    }


    /**
     * Sets the target_user_id value for this QueryAutoTopUpReq.
     * 
     * @param target_user_id
     */
    public void setTarget_user_id(java.lang.Long target_user_id) {
        this.target_user_id = target_user_id;
    }


    /**
     * Gets the target_phone_id value for this QueryAutoTopUpReq.
     * 
     * @return target_phone_id
     */
    public java.lang.String getTarget_phone_id() {
        return target_phone_id;
    }


    /**
     * Sets the target_phone_id value for this QueryAutoTopUpReq.
     * 
     * @param target_phone_id
     */
    public void setTarget_phone_id(java.lang.String target_phone_id) {
        this.target_phone_id = target_phone_id;
    }


    /**
     * Gets the auto_type value for this QueryAutoTopUpReq.
     * 
     * @return auto_type
     */
    public java.lang.Short getAuto_type() {
        return auto_type;
    }


    /**
     * Sets the auto_type value for this QueryAutoTopUpReq.
     * 
     * @param auto_type
     */
    public void setAuto_type(java.lang.Short auto_type) {
        this.auto_type = auto_type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryAutoTopUpReq)) return false;
        QueryAutoTopUpReq other = (QueryAutoTopUpReq) obj;
        if (obj == null) return false;
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
            ((this.pay_user_id==null && other.getPay_user_id()==null) || 
             (this.pay_user_id!=null &&
              this.pay_user_id.equals(other.getPay_user_id()))) &&
            ((this.pay_phone_id==null && other.getPay_phone_id()==null) || 
             (this.pay_phone_id!=null &&
              this.pay_phone_id.equals(other.getPay_phone_id()))) &&
            ((this.trans_id==null && other.getTrans_id()==null) || 
             (this.trans_id!=null &&
              this.trans_id.equals(other.getTrans_id()))) &&
            ((this.topup_type==null && other.getTopup_type()==null) || 
             (this.topup_type!=null &&
              this.topup_type.equals(other.getTopup_type()))) &&
            ((this.outer_target_acct_id==null && other.getOuter_target_acct_id()==null) || 
             (this.outer_target_acct_id!=null &&
              this.outer_target_acct_id.equals(other.getOuter_target_acct_id()))) &&
            ((this.target_acct_id==null && other.getTarget_acct_id()==null) || 
             (this.target_acct_id!=null &&
              this.target_acct_id.equals(other.getTarget_acct_id()))) &&
            ((this.target_user_id==null && other.getTarget_user_id()==null) || 
             (this.target_user_id!=null &&
              this.target_user_id.equals(other.getTarget_user_id()))) &&
            ((this.target_phone_id==null && other.getTarget_phone_id()==null) || 
             (this.target_phone_id!=null &&
              this.target_phone_id.equals(other.getTarget_phone_id()))) &&
            ((this.auto_type==null && other.getAuto_type()==null) || 
             (this.auto_type!=null &&
              this.auto_type.equals(other.getAuto_type())));
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
        if (getPay_user_id() != null) {
            _hashCode += getPay_user_id().hashCode();
        }
        if (getPay_phone_id() != null) {
            _hashCode += getPay_phone_id().hashCode();
        }
        if (getTrans_id() != null) {
            _hashCode += getTrans_id().hashCode();
        }
        if (getTopup_type() != null) {
            _hashCode += getTopup_type().hashCode();
        }
        if (getOuter_target_acct_id() != null) {
            _hashCode += getOuter_target_acct_id().hashCode();
        }
        if (getTarget_acct_id() != null) {
            _hashCode += getTarget_acct_id().hashCode();
        }
        if (getTarget_user_id() != null) {
            _hashCode += getTarget_user_id().hashCode();
        }
        if (getTarget_phone_id() != null) {
            _hashCode += getTarget_phone_id().hashCode();
        }
        if (getAuto_type() != null) {
            _hashCode += getAuto_type().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryAutoTopUpReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryAutoTopUpReq"));
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
        elemField.setFieldName("pay_user_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay_user_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pay_phone_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay_phone_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trans_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trans_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topup_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "topup_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outer_target_acct_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outer_target_acct_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target_acct_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "target_acct_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target_user_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "target_user_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target_phone_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "target_phone_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auto_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auto_type"));
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
