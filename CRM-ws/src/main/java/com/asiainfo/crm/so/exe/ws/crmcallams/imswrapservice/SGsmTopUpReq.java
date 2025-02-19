/**
 * SGsmTopUpReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SGsmTopUpReq  implements java.io.Serializable {
    private java.lang.String outer_acct_id;

    private java.lang.Long acct_id;

    private java.lang.String phone_id;

    private java.lang.Short service_type;

    private java.lang.Long amount;

    private java.lang.String prepaid_phone;

    private java.lang.Long user_id;

    private java.lang.Integer owner_type;

    private java.lang.Integer bill_type;

    private java.lang.String etopup_session_id;

    public SGsmTopUpReq() {
    }

    public SGsmTopUpReq(
           java.lang.String outer_acct_id,
           java.lang.Long acct_id,
           java.lang.String phone_id,
           java.lang.Short service_type,
           java.lang.Long amount,
           java.lang.String prepaid_phone,
           java.lang.Long user_id,
           java.lang.Integer owner_type,
           java.lang.Integer bill_type,
           java.lang.String etopup_session_id) {
           this.outer_acct_id = outer_acct_id;
           this.acct_id = acct_id;
           this.phone_id = phone_id;
           this.service_type = service_type;
           this.amount = amount;
           this.prepaid_phone = prepaid_phone;
           this.user_id = user_id;
           this.owner_type = owner_type;
           this.bill_type = bill_type;
           this.etopup_session_id = etopup_session_id;
    }


    /**
     * Gets the outer_acct_id value for this SGsmTopUpReq.
     * 
     * @return outer_acct_id
     */
    public java.lang.String getOuter_acct_id() {
        return outer_acct_id;
    }


    /**
     * Sets the outer_acct_id value for this SGsmTopUpReq.
     * 
     * @param outer_acct_id
     */
    public void setOuter_acct_id(java.lang.String outer_acct_id) {
        this.outer_acct_id = outer_acct_id;
    }


    /**
     * Gets the acct_id value for this SGsmTopUpReq.
     * 
     * @return acct_id
     */
    public java.lang.Long getAcct_id() {
        return acct_id;
    }


    /**
     * Sets the acct_id value for this SGsmTopUpReq.
     * 
     * @param acct_id
     */
    public void setAcct_id(java.lang.Long acct_id) {
        this.acct_id = acct_id;
    }


    /**
     * Gets the phone_id value for this SGsmTopUpReq.
     * 
     * @return phone_id
     */
    public java.lang.String getPhone_id() {
        return phone_id;
    }


    /**
     * Sets the phone_id value for this SGsmTopUpReq.
     * 
     * @param phone_id
     */
    public void setPhone_id(java.lang.String phone_id) {
        this.phone_id = phone_id;
    }


    /**
     * Gets the service_type value for this SGsmTopUpReq.
     * 
     * @return service_type
     */
    public java.lang.Short getService_type() {
        return service_type;
    }


    /**
     * Sets the service_type value for this SGsmTopUpReq.
     * 
     * @param service_type
     */
    public void setService_type(java.lang.Short service_type) {
        this.service_type = service_type;
    }


    /**
     * Gets the amount value for this SGsmTopUpReq.
     * 
     * @return amount
     */
    public java.lang.Long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this SGsmTopUpReq.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }


    /**
     * Gets the prepaid_phone value for this SGsmTopUpReq.
     * 
     * @return prepaid_phone
     */
    public java.lang.String getPrepaid_phone() {
        return prepaid_phone;
    }


    /**
     * Sets the prepaid_phone value for this SGsmTopUpReq.
     * 
     * @param prepaid_phone
     */
    public void setPrepaid_phone(java.lang.String prepaid_phone) {
        this.prepaid_phone = prepaid_phone;
    }


    /**
     * Gets the user_id value for this SGsmTopUpReq.
     * 
     * @return user_id
     */
    public java.lang.Long getUser_id() {
        return user_id;
    }


    /**
     * Sets the user_id value for this SGsmTopUpReq.
     * 
     * @param user_id
     */
    public void setUser_id(java.lang.Long user_id) {
        this.user_id = user_id;
    }


    /**
     * Gets the owner_type value for this SGsmTopUpReq.
     * 
     * @return owner_type
     */
    public java.lang.Integer getOwner_type() {
        return owner_type;
    }


    /**
     * Sets the owner_type value for this SGsmTopUpReq.
     * 
     * @param owner_type
     */
    public void setOwner_type(java.lang.Integer owner_type) {
        this.owner_type = owner_type;
    }


    /**
     * Gets the bill_type value for this SGsmTopUpReq.
     * 
     * @return bill_type
     */
    public java.lang.Integer getBill_type() {
        return bill_type;
    }


    /**
     * Sets the bill_type value for this SGsmTopUpReq.
     * 
     * @param bill_type
     */
    public void setBill_type(java.lang.Integer bill_type) {
        this.bill_type = bill_type;
    }


    /**
     * Gets the etopup_session_id value for this SGsmTopUpReq.
     * 
     * @return etopup_session_id
     */
    public java.lang.String getEtopup_session_id() {
        return etopup_session_id;
    }


    /**
     * Sets the etopup_session_id value for this SGsmTopUpReq.
     * 
     * @param etopup_session_id
     */
    public void setEtopup_session_id(java.lang.String etopup_session_id) {
        this.etopup_session_id = etopup_session_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SGsmTopUpReq)) return false;
        SGsmTopUpReq other = (SGsmTopUpReq) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.outer_acct_id==null && other.getOuter_acct_id()==null) || 
             (this.outer_acct_id!=null &&
              this.outer_acct_id.equals(other.getOuter_acct_id()))) &&
            ((this.acct_id==null && other.getAcct_id()==null) || 
             (this.acct_id!=null &&
              this.acct_id.equals(other.getAcct_id()))) &&
            ((this.phone_id==null && other.getPhone_id()==null) || 
             (this.phone_id!=null &&
              this.phone_id.equals(other.getPhone_id()))) &&
            ((this.service_type==null && other.getService_type()==null) || 
             (this.service_type!=null &&
              this.service_type.equals(other.getService_type()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.prepaid_phone==null && other.getPrepaid_phone()==null) || 
             (this.prepaid_phone!=null &&
              this.prepaid_phone.equals(other.getPrepaid_phone()))) &&
            ((this.user_id==null && other.getUser_id()==null) || 
             (this.user_id!=null &&
              this.user_id.equals(other.getUser_id()))) &&
            ((this.owner_type==null && other.getOwner_type()==null) || 
             (this.owner_type!=null &&
              this.owner_type.equals(other.getOwner_type()))) &&
            ((this.bill_type==null && other.getBill_type()==null) || 
             (this.bill_type!=null &&
              this.bill_type.equals(other.getBill_type()))) &&
            ((this.etopup_session_id==null && other.getEtopup_session_id()==null) || 
             (this.etopup_session_id!=null &&
              this.etopup_session_id.equals(other.getEtopup_session_id())));
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
        if (getOuter_acct_id() != null) {
            _hashCode += getOuter_acct_id().hashCode();
        }
        if (getAcct_id() != null) {
            _hashCode += getAcct_id().hashCode();
        }
        if (getPhone_id() != null) {
            _hashCode += getPhone_id().hashCode();
        }
        if (getService_type() != null) {
            _hashCode += getService_type().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getPrepaid_phone() != null) {
            _hashCode += getPrepaid_phone().hashCode();
        }
        if (getUser_id() != null) {
            _hashCode += getUser_id().hashCode();
        }
        if (getOwner_type() != null) {
            _hashCode += getOwner_type().hashCode();
        }
        if (getBill_type() != null) {
            _hashCode += getBill_type().hashCode();
        }
        if (getEtopup_session_id() != null) {
            _hashCode += getEtopup_session_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SGsmTopUpReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sGsmTopUpReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outer_acct_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outer_acct_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acct_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acct_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phone_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "service_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prepaid_phone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prepaid_phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "owner_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bill_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bill_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("etopup_session_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "etopup_session_id"));
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
