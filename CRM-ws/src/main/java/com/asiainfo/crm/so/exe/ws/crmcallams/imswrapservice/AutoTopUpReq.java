/**
 * AutoTopUpReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class AutoTopUpReq  implements java.io.Serializable {
    private java.lang.Short oper_type;

    private java.lang.String outer_pay_acct_id;

    private java.lang.Long pay_acct_id;

    private java.lang.Long pay_user_id;

    private java.lang.String pay_phone_id;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AutoTopUpRel[] autoTopUpRelList;

    public AutoTopUpReq() {
    }

    public AutoTopUpReq(
           java.lang.Short oper_type,
           java.lang.String outer_pay_acct_id,
           java.lang.Long pay_acct_id,
           java.lang.Long pay_user_id,
           java.lang.String pay_phone_id,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AutoTopUpRel[] autoTopUpRelList) {
           this.oper_type = oper_type;
           this.outer_pay_acct_id = outer_pay_acct_id;
           this.pay_acct_id = pay_acct_id;
           this.pay_user_id = pay_user_id;
           this.pay_phone_id = pay_phone_id;
           this.autoTopUpRelList = autoTopUpRelList;
    }


    /**
     * Gets the oper_type value for this AutoTopUpReq.
     * 
     * @return oper_type
     */
    public java.lang.Short getOper_type() {
        return oper_type;
    }


    /**
     * Sets the oper_type value for this AutoTopUpReq.
     * 
     * @param oper_type
     */
    public void setOper_type(java.lang.Short oper_type) {
        this.oper_type = oper_type;
    }


    /**
     * Gets the outer_pay_acct_id value for this AutoTopUpReq.
     * 
     * @return outer_pay_acct_id
     */
    public java.lang.String getOuter_pay_acct_id() {
        return outer_pay_acct_id;
    }


    /**
     * Sets the outer_pay_acct_id value for this AutoTopUpReq.
     * 
     * @param outer_pay_acct_id
     */
    public void setOuter_pay_acct_id(java.lang.String outer_pay_acct_id) {
        this.outer_pay_acct_id = outer_pay_acct_id;
    }


    /**
     * Gets the pay_acct_id value for this AutoTopUpReq.
     * 
     * @return pay_acct_id
     */
    public java.lang.Long getPay_acct_id() {
        return pay_acct_id;
    }


    /**
     * Sets the pay_acct_id value for this AutoTopUpReq.
     * 
     * @param pay_acct_id
     */
    public void setPay_acct_id(java.lang.Long pay_acct_id) {
        this.pay_acct_id = pay_acct_id;
    }


    /**
     * Gets the pay_user_id value for this AutoTopUpReq.
     * 
     * @return pay_user_id
     */
    public java.lang.Long getPay_user_id() {
        return pay_user_id;
    }


    /**
     * Sets the pay_user_id value for this AutoTopUpReq.
     * 
     * @param pay_user_id
     */
    public void setPay_user_id(java.lang.Long pay_user_id) {
        this.pay_user_id = pay_user_id;
    }


    /**
     * Gets the pay_phone_id value for this AutoTopUpReq.
     * 
     * @return pay_phone_id
     */
    public java.lang.String getPay_phone_id() {
        return pay_phone_id;
    }


    /**
     * Sets the pay_phone_id value for this AutoTopUpReq.
     * 
     * @param pay_phone_id
     */
    public void setPay_phone_id(java.lang.String pay_phone_id) {
        this.pay_phone_id = pay_phone_id;
    }


    /**
     * Gets the autoTopUpRelList value for this AutoTopUpReq.
     * 
     * @return autoTopUpRelList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AutoTopUpRel[] getAutoTopUpRelList() {
        return autoTopUpRelList;
    }


    /**
     * Sets the autoTopUpRelList value for this AutoTopUpReq.
     * 
     * @param autoTopUpRelList
     */
    public void setAutoTopUpRelList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AutoTopUpRel[] autoTopUpRelList) {
        this.autoTopUpRelList = autoTopUpRelList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AutoTopUpReq)) return false;
        AutoTopUpReq other = (AutoTopUpReq) obj;
        
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
            ((this.autoTopUpRelList==null && other.getAutoTopUpRelList()==null) || 
             (this.autoTopUpRelList!=null &&
              java.util.Arrays.equals(this.autoTopUpRelList, other.getAutoTopUpRelList())));
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
        if (getAutoTopUpRelList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAutoTopUpRelList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAutoTopUpRelList(), i);
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
        new org.apache.axis.description.TypeDesc(AutoTopUpReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "autoTopUpReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oper_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oper_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("autoTopUpRelList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autoTopUpRelList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "autoTopUpRel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "autoTopUpRelList_Item"));
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
