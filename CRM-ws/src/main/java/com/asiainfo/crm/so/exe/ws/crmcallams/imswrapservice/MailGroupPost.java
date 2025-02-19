/**
 * MailGroupPost.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class MailGroupPost  implements java.io.Serializable {
    private java.lang.String outer_mail_group_id;

    private java.lang.Long mail_group_id;

    private java.lang.Integer post_code;

    private java.lang.Integer country_id;

    private java.lang.String receiver_name;

    private java.lang.String address1;

    private java.lang.String address2;

    private java.lang.String address3;

    private java.lang.String address4;

    private java.lang.String address5;

    public MailGroupPost() {
    }

    public MailGroupPost(
           java.lang.String outer_mail_group_id,
           java.lang.Long mail_group_id,
           java.lang.Integer post_code,
           java.lang.Integer country_id,
           java.lang.String receiver_name,
           java.lang.String address1,
           java.lang.String address2,
           java.lang.String address3,
           java.lang.String address4,
           java.lang.String address5) {
           this.outer_mail_group_id = outer_mail_group_id;
           this.mail_group_id = mail_group_id;
           this.post_code = post_code;
           this.country_id = country_id;
           this.receiver_name = receiver_name;
           this.address1 = address1;
           this.address2 = address2;
           this.address3 = address3;
           this.address4 = address4;
           this.address5 = address5;
    }


    /**
     * Gets the outer_mail_group_id value for this MailGroupPost.
     * 
     * @return outer_mail_group_id
     */
    public java.lang.String getOuter_mail_group_id() {
        return outer_mail_group_id;
    }


    /**
     * Sets the outer_mail_group_id value for this MailGroupPost.
     * 
     * @param outer_mail_group_id
     */
    public void setOuter_mail_group_id(java.lang.String outer_mail_group_id) {
        this.outer_mail_group_id = outer_mail_group_id;
    }


    /**
     * Gets the mail_group_id value for this MailGroupPost.
     * 
     * @return mail_group_id
     */
    public java.lang.Long getMail_group_id() {
        return mail_group_id;
    }


    /**
     * Sets the mail_group_id value for this MailGroupPost.
     * 
     * @param mail_group_id
     */
    public void setMail_group_id(java.lang.Long mail_group_id) {
        this.mail_group_id = mail_group_id;
    }


    /**
     * Gets the post_code value for this MailGroupPost.
     * 
     * @return post_code
     */
    public java.lang.Integer getPost_code() {
        return post_code;
    }


    /**
     * Sets the post_code value for this MailGroupPost.
     * 
     * @param post_code
     */
    public void setPost_code(java.lang.Integer post_code) {
        this.post_code = post_code;
    }


    /**
     * Gets the country_id value for this MailGroupPost.
     * 
     * @return country_id
     */
    public java.lang.Integer getCountry_id() {
        return country_id;
    }


    /**
     * Sets the country_id value for this MailGroupPost.
     * 
     * @param country_id
     */
    public void setCountry_id(java.lang.Integer country_id) {
        this.country_id = country_id;
    }


    /**
     * Gets the receiver_name value for this MailGroupPost.
     * 
     * @return receiver_name
     */
    public java.lang.String getReceiver_name() {
        return receiver_name;
    }


    /**
     * Sets the receiver_name value for this MailGroupPost.
     * 
     * @param receiver_name
     */
    public void setReceiver_name(java.lang.String receiver_name) {
        this.receiver_name = receiver_name;
    }


    /**
     * Gets the address1 value for this MailGroupPost.
     * 
     * @return address1
     */
    public java.lang.String getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this MailGroupPost.
     * 
     * @param address1
     */
    public void setAddress1(java.lang.String address1) {
        this.address1 = address1;
    }


    /**
     * Gets the address2 value for this MailGroupPost.
     * 
     * @return address2
     */
    public java.lang.String getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this MailGroupPost.
     * 
     * @param address2
     */
    public void setAddress2(java.lang.String address2) {
        this.address2 = address2;
    }


    /**
     * Gets the address3 value for this MailGroupPost.
     * 
     * @return address3
     */
    public java.lang.String getAddress3() {
        return address3;
    }


    /**
     * Sets the address3 value for this MailGroupPost.
     * 
     * @param address3
     */
    public void setAddress3(java.lang.String address3) {
        this.address3 = address3;
    }


    /**
     * Gets the address4 value for this MailGroupPost.
     * 
     * @return address4
     */
    public java.lang.String getAddress4() {
        return address4;
    }


    /**
     * Sets the address4 value for this MailGroupPost.
     * 
     * @param address4
     */
    public void setAddress4(java.lang.String address4) {
        this.address4 = address4;
    }


    /**
     * Gets the address5 value for this MailGroupPost.
     * 
     * @return address5
     */
    public java.lang.String getAddress5() {
        return address5;
    }


    /**
     * Sets the address5 value for this MailGroupPost.
     * 
     * @param address5
     */
    public void setAddress5(java.lang.String address5) {
        this.address5 = address5;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MailGroupPost)) return false;
        MailGroupPost other = (MailGroupPost) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.outer_mail_group_id==null && other.getOuter_mail_group_id()==null) || 
             (this.outer_mail_group_id!=null &&
              this.outer_mail_group_id.equals(other.getOuter_mail_group_id()))) &&
            ((this.mail_group_id==null && other.getMail_group_id()==null) || 
             (this.mail_group_id!=null &&
              this.mail_group_id.equals(other.getMail_group_id()))) &&
            ((this.post_code==null && other.getPost_code()==null) || 
             (this.post_code!=null &&
              this.post_code.equals(other.getPost_code()))) &&
            ((this.country_id==null && other.getCountry_id()==null) || 
             (this.country_id!=null &&
              this.country_id.equals(other.getCountry_id()))) &&
            ((this.receiver_name==null && other.getReceiver_name()==null) || 
             (this.receiver_name!=null &&
              this.receiver_name.equals(other.getReceiver_name()))) &&
            ((this.address1==null && other.getAddress1()==null) || 
             (this.address1!=null &&
              this.address1.equals(other.getAddress1()))) &&
            ((this.address2==null && other.getAddress2()==null) || 
             (this.address2!=null &&
              this.address2.equals(other.getAddress2()))) &&
            ((this.address3==null && other.getAddress3()==null) || 
             (this.address3!=null &&
              this.address3.equals(other.getAddress3()))) &&
            ((this.address4==null && other.getAddress4()==null) || 
             (this.address4!=null &&
              this.address4.equals(other.getAddress4()))) &&
            ((this.address5==null && other.getAddress5()==null) || 
             (this.address5!=null &&
              this.address5.equals(other.getAddress5())));
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
        if (getOuter_mail_group_id() != null) {
            _hashCode += getOuter_mail_group_id().hashCode();
        }
        if (getMail_group_id() != null) {
            _hashCode += getMail_group_id().hashCode();
        }
        if (getPost_code() != null) {
            _hashCode += getPost_code().hashCode();
        }
        if (getCountry_id() != null) {
            _hashCode += getCountry_id().hashCode();
        }
        if (getReceiver_name() != null) {
            _hashCode += getReceiver_name().hashCode();
        }
        if (getAddress1() != null) {
            _hashCode += getAddress1().hashCode();
        }
        if (getAddress2() != null) {
            _hashCode += getAddress2().hashCode();
        }
        if (getAddress3() != null) {
            _hashCode += getAddress3().hashCode();
        }
        if (getAddress4() != null) {
            _hashCode += getAddress4().hashCode();
        }
        if (getAddress5() != null) {
            _hashCode += getAddress5().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MailGroupPost.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "mailGroupPost"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("post_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "post_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiver_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiver_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address5"));
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
