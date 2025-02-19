/**
 * AccountMail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class AccountMail  implements java.io.Serializable {
    private java.lang.String outer_acct_id;

    private java.lang.Long acct_id;

    private java.lang.String outer_mail_group_id;

    private java.lang.Long mail_group_id;

    public AccountMail() {
    }

    public AccountMail(
           java.lang.String outer_acct_id,
           java.lang.Long acct_id,
           java.lang.String outer_mail_group_id,
           java.lang.Long mail_group_id) {
           this.outer_acct_id = outer_acct_id;
           this.acct_id = acct_id;
           this.outer_mail_group_id = outer_mail_group_id;
           this.mail_group_id = mail_group_id;
    }


    /**
     * Gets the outer_acct_id value for this AccountMail.
     * 
     * @return outer_acct_id
     */
    public java.lang.String getOuter_acct_id() {
        return outer_acct_id;
    }


    /**
     * Sets the outer_acct_id value for this AccountMail.
     * 
     * @param outer_acct_id
     */
    public void setOuter_acct_id(java.lang.String outer_acct_id) {
        this.outer_acct_id = outer_acct_id;
    }


    /**
     * Gets the acct_id value for this AccountMail.
     * 
     * @return acct_id
     */
    public java.lang.Long getAcct_id() {
        return acct_id;
    }


    /**
     * Sets the acct_id value for this AccountMail.
     * 
     * @param acct_id
     */
    public void setAcct_id(java.lang.Long acct_id) {
        this.acct_id = acct_id;
    }


    /**
     * Gets the outer_mail_group_id value for this AccountMail.
     * 
     * @return outer_mail_group_id
     */
    public java.lang.String getOuter_mail_group_id() {
        return outer_mail_group_id;
    }


    /**
     * Sets the outer_mail_group_id value for this AccountMail.
     * 
     * @param outer_mail_group_id
     */
    public void setOuter_mail_group_id(java.lang.String outer_mail_group_id) {
        this.outer_mail_group_id = outer_mail_group_id;
    }


    /**
     * Gets the mail_group_id value for this AccountMail.
     * 
     * @return mail_group_id
     */
    public java.lang.Long getMail_group_id() {
        return mail_group_id;
    }


    /**
     * Sets the mail_group_id value for this AccountMail.
     * 
     * @param mail_group_id
     */
    public void setMail_group_id(java.lang.Long mail_group_id) {
        this.mail_group_id = mail_group_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountMail)) return false;
        AccountMail other = (AccountMail) obj;
        if (obj == null) return false;
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
            ((this.outer_mail_group_id==null && other.getOuter_mail_group_id()==null) || 
             (this.outer_mail_group_id!=null &&
              this.outer_mail_group_id.equals(other.getOuter_mail_group_id()))) &&
            ((this.mail_group_id==null && other.getMail_group_id()==null) || 
             (this.mail_group_id!=null &&
              this.mail_group_id.equals(other.getMail_group_id())));
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
        if (getOuter_mail_group_id() != null) {
            _hashCode += getOuter_mail_group_id().hashCode();
        }
        if (getMail_group_id() != null) {
            _hashCode += getMail_group_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountMail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "accountMail"));
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
        elemField.setFieldName("outer_mail_group_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outer_mail_group_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mail_group_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mail_group_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
