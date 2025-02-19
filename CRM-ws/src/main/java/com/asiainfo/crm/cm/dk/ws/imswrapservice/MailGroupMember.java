/**
 * MailGroupMember.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class MailGroupMember  implements java.io.Serializable {
    private java.lang.Short oper_type;

    private java.lang.String outer_mail_group_id;

    private java.lang.Long mail_group_id;

    private java.lang.String outer_cust_id;

    private java.lang.Long cust_id;

    private java.lang.String outer_acct_id;

    private java.lang.Long acct_id;

    private java.lang.String valid_date;

    private java.lang.String expire_date;

    public MailGroupMember() {
    }

    public MailGroupMember(
           java.lang.Short oper_type,
           java.lang.String outer_mail_group_id,
           java.lang.Long mail_group_id,
           java.lang.String outer_cust_id,
           java.lang.Long cust_id,
           java.lang.String outer_acct_id,
           java.lang.Long acct_id,
           java.lang.String valid_date,
           java.lang.String expire_date) {
           this.oper_type = oper_type;
           this.outer_mail_group_id = outer_mail_group_id;
           this.mail_group_id = mail_group_id;
           this.outer_cust_id = outer_cust_id;
           this.cust_id = cust_id;
           this.outer_acct_id = outer_acct_id;
           this.acct_id = acct_id;
           this.valid_date = valid_date;
           this.expire_date = expire_date;
    }


    /**
     * Gets the oper_type value for this MailGroupMember.
     * 
     * @return oper_type
     */
    public java.lang.Short getOper_type() {
        return oper_type;
    }


    /**
     * Sets the oper_type value for this MailGroupMember.
     * 
     * @param oper_type
     */
    public void setOper_type(java.lang.Short oper_type) {
        this.oper_type = oper_type;
    }


    /**
     * Gets the outer_mail_group_id value for this MailGroupMember.
     * 
     * @return outer_mail_group_id
     */
    public java.lang.String getOuter_mail_group_id() {
        return outer_mail_group_id;
    }


    /**
     * Sets the outer_mail_group_id value for this MailGroupMember.
     * 
     * @param outer_mail_group_id
     */
    public void setOuter_mail_group_id(java.lang.String outer_mail_group_id) {
        this.outer_mail_group_id = outer_mail_group_id;
    }


    /**
     * Gets the mail_group_id value for this MailGroupMember.
     * 
     * @return mail_group_id
     */
    public java.lang.Long getMail_group_id() {
        return mail_group_id;
    }


    /**
     * Sets the mail_group_id value for this MailGroupMember.
     * 
     * @param mail_group_id
     */
    public void setMail_group_id(java.lang.Long mail_group_id) {
        this.mail_group_id = mail_group_id;
    }


    /**
     * Gets the outer_cust_id value for this MailGroupMember.
     * 
     * @return outer_cust_id
     */
    public java.lang.String getOuter_cust_id() {
        return outer_cust_id;
    }


    /**
     * Sets the outer_cust_id value for this MailGroupMember.
     * 
     * @param outer_cust_id
     */
    public void setOuter_cust_id(java.lang.String outer_cust_id) {
        this.outer_cust_id = outer_cust_id;
    }


    /**
     * Gets the cust_id value for this MailGroupMember.
     * 
     * @return cust_id
     */
    public java.lang.Long getCust_id() {
        return cust_id;
    }


    /**
     * Sets the cust_id value for this MailGroupMember.
     * 
     * @param cust_id
     */
    public void setCust_id(java.lang.Long cust_id) {
        this.cust_id = cust_id;
    }


    /**
     * Gets the outer_acct_id value for this MailGroupMember.
     * 
     * @return outer_acct_id
     */
    public java.lang.String getOuter_acct_id() {
        return outer_acct_id;
    }


    /**
     * Sets the outer_acct_id value for this MailGroupMember.
     * 
     * @param outer_acct_id
     */
    public void setOuter_acct_id(java.lang.String outer_acct_id) {
        this.outer_acct_id = outer_acct_id;
    }


    /**
     * Gets the acct_id value for this MailGroupMember.
     * 
     * @return acct_id
     */
    public java.lang.Long getAcct_id() {
        return acct_id;
    }


    /**
     * Sets the acct_id value for this MailGroupMember.
     * 
     * @param acct_id
     */
    public void setAcct_id(java.lang.Long acct_id) {
        this.acct_id = acct_id;
    }


    /**
     * Gets the valid_date value for this MailGroupMember.
     * 
     * @return valid_date
     */
    public java.lang.String getValid_date() {
        return valid_date;
    }


    /**
     * Sets the valid_date value for this MailGroupMember.
     * 
     * @param valid_date
     */
    public void setValid_date(java.lang.String valid_date) {
        this.valid_date = valid_date;
    }


    /**
     * Gets the expire_date value for this MailGroupMember.
     * 
     * @return expire_date
     */
    public java.lang.String getExpire_date() {
        return expire_date;
    }


    /**
     * Sets the expire_date value for this MailGroupMember.
     * 
     * @param expire_date
     */
    public void setExpire_date(java.lang.String expire_date) {
        this.expire_date = expire_date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MailGroupMember)) return false;
        MailGroupMember other = (MailGroupMember) obj;
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
            ((this.outer_mail_group_id==null && other.getOuter_mail_group_id()==null) || 
             (this.outer_mail_group_id!=null &&
              this.outer_mail_group_id.equals(other.getOuter_mail_group_id()))) &&
            ((this.mail_group_id==null && other.getMail_group_id()==null) || 
             (this.mail_group_id!=null &&
              this.mail_group_id.equals(other.getMail_group_id()))) &&
            ((this.outer_cust_id==null && other.getOuter_cust_id()==null) || 
             (this.outer_cust_id!=null &&
              this.outer_cust_id.equals(other.getOuter_cust_id()))) &&
            ((this.cust_id==null && other.getCust_id()==null) || 
             (this.cust_id!=null &&
              this.cust_id.equals(other.getCust_id()))) &&
            ((this.outer_acct_id==null && other.getOuter_acct_id()==null) || 
             (this.outer_acct_id!=null &&
              this.outer_acct_id.equals(other.getOuter_acct_id()))) &&
            ((this.acct_id==null && other.getAcct_id()==null) || 
             (this.acct_id!=null &&
              this.acct_id.equals(other.getAcct_id()))) &&
            ((this.valid_date==null && other.getValid_date()==null) || 
             (this.valid_date!=null &&
              this.valid_date.equals(other.getValid_date()))) &&
            ((this.expire_date==null && other.getExpire_date()==null) || 
             (this.expire_date!=null &&
              this.expire_date.equals(other.getExpire_date())));
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
        if (getOuter_mail_group_id() != null) {
            _hashCode += getOuter_mail_group_id().hashCode();
        }
        if (getMail_group_id() != null) {
            _hashCode += getMail_group_id().hashCode();
        }
        if (getOuter_cust_id() != null) {
            _hashCode += getOuter_cust_id().hashCode();
        }
        if (getCust_id() != null) {
            _hashCode += getCust_id().hashCode();
        }
        if (getOuter_acct_id() != null) {
            _hashCode += getOuter_acct_id().hashCode();
        }
        if (getAcct_id() != null) {
            _hashCode += getAcct_id().hashCode();
        }
        if (getValid_date() != null) {
            _hashCode += getValid_date().hashCode();
        }
        if (getExpire_date() != null) {
            _hashCode += getExpire_date().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MailGroupMember.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "mailGroupMember"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oper_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oper_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outer_cust_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outer_cust_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cust_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cust_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
