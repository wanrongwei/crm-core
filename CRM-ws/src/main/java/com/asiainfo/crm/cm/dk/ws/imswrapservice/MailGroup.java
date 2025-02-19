/**
 * MailGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class MailGroup  implements java.io.Serializable {
    private java.lang.Short oper_type;

    private java.lang.String outer_mail_group_id;

    private java.lang.Long mail_group_id;

    private java.lang.String name;

    private java.lang.String description;

    private java.lang.Short bill_format_id;

    private java.lang.Short file_type;

    private java.lang.Long summaryBillHandlingCode;

    private java.lang.Integer summaryBillLanguage;

    private java.lang.Integer summaryCurrency;

    private java.lang.Integer summaryStyleId;

    private java.lang.String valid_date;

    private java.lang.String expire_date;

    public MailGroup() {
    }

    public MailGroup(
           java.lang.Short oper_type,
           java.lang.String outer_mail_group_id,
           java.lang.Long mail_group_id,
           java.lang.String name,
           java.lang.String description,
           java.lang.Short bill_format_id,
           java.lang.Short file_type,
           java.lang.Long summaryBillHandlingCode,
           java.lang.Integer summaryBillLanguage,
           java.lang.Integer summaryCurrency,
           java.lang.Integer summaryStyleId,
           java.lang.String valid_date,
           java.lang.String expire_date) {
           this.oper_type = oper_type;
           this.outer_mail_group_id = outer_mail_group_id;
           this.mail_group_id = mail_group_id;
           this.name = name;
           this.description = description;
           this.bill_format_id = bill_format_id;
           this.file_type = file_type;
           this.summaryBillHandlingCode = summaryBillHandlingCode;
           this.summaryBillLanguage = summaryBillLanguage;
           this.summaryCurrency = summaryCurrency;
           this.summaryStyleId = summaryStyleId;
           this.valid_date = valid_date;
           this.expire_date = expire_date;
    }


    /**
     * Gets the oper_type value for this MailGroup.
     * 
     * @return oper_type
     */
    public java.lang.Short getOper_type() {
        return oper_type;
    }


    /**
     * Sets the oper_type value for this MailGroup.
     * 
     * @param oper_type
     */
    public void setOper_type(java.lang.Short oper_type) {
        this.oper_type = oper_type;
    }


    /**
     * Gets the outer_mail_group_id value for this MailGroup.
     * 
     * @return outer_mail_group_id
     */
    public java.lang.String getOuter_mail_group_id() {
        return outer_mail_group_id;
    }


    /**
     * Sets the outer_mail_group_id value for this MailGroup.
     * 
     * @param outer_mail_group_id
     */
    public void setOuter_mail_group_id(java.lang.String outer_mail_group_id) {
        this.outer_mail_group_id = outer_mail_group_id;
    }


    /**
     * Gets the mail_group_id value for this MailGroup.
     * 
     * @return mail_group_id
     */
    public java.lang.Long getMail_group_id() {
        return mail_group_id;
    }


    /**
     * Sets the mail_group_id value for this MailGroup.
     * 
     * @param mail_group_id
     */
    public void setMail_group_id(java.lang.Long mail_group_id) {
        this.mail_group_id = mail_group_id;
    }


    /**
     * Gets the name value for this MailGroup.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this MailGroup.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this MailGroup.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this MailGroup.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the bill_format_id value for this MailGroup.
     * 
     * @return bill_format_id
     */
    public java.lang.Short getBill_format_id() {
        return bill_format_id;
    }


    /**
     * Sets the bill_format_id value for this MailGroup.
     * 
     * @param bill_format_id
     */
    public void setBill_format_id(java.lang.Short bill_format_id) {
        this.bill_format_id = bill_format_id;
    }


    /**
     * Gets the file_type value for this MailGroup.
     * 
     * @return file_type
     */
    public java.lang.Short getFile_type() {
        return file_type;
    }


    /**
     * Sets the file_type value for this MailGroup.
     * 
     * @param file_type
     */
    public void setFile_type(java.lang.Short file_type) {
        this.file_type = file_type;
    }


    /**
     * Gets the summaryBillHandlingCode value for this MailGroup.
     * 
     * @return summaryBillHandlingCode
     */
    public java.lang.Long getSummaryBillHandlingCode() {
        return summaryBillHandlingCode;
    }


    /**
     * Sets the summaryBillHandlingCode value for this MailGroup.
     * 
     * @param summaryBillHandlingCode
     */
    public void setSummaryBillHandlingCode(java.lang.Long summaryBillHandlingCode) {
        this.summaryBillHandlingCode = summaryBillHandlingCode;
    }


    /**
     * Gets the summaryBillLanguage value for this MailGroup.
     * 
     * @return summaryBillLanguage
     */
    public java.lang.Integer getSummaryBillLanguage() {
        return summaryBillLanguage;
    }


    /**
     * Sets the summaryBillLanguage value for this MailGroup.
     * 
     * @param summaryBillLanguage
     */
    public void setSummaryBillLanguage(java.lang.Integer summaryBillLanguage) {
        this.summaryBillLanguage = summaryBillLanguage;
    }


    /**
     * Gets the summaryCurrency value for this MailGroup.
     * 
     * @return summaryCurrency
     */
    public java.lang.Integer getSummaryCurrency() {
        return summaryCurrency;
    }


    /**
     * Sets the summaryCurrency value for this MailGroup.
     * 
     * @param summaryCurrency
     */
    public void setSummaryCurrency(java.lang.Integer summaryCurrency) {
        this.summaryCurrency = summaryCurrency;
    }


    /**
     * Gets the summaryStyleId value for this MailGroup.
     * 
     * @return summaryStyleId
     */
    public java.lang.Integer getSummaryStyleId() {
        return summaryStyleId;
    }


    /**
     * Sets the summaryStyleId value for this MailGroup.
     * 
     * @param summaryStyleId
     */
    public void setSummaryStyleId(java.lang.Integer summaryStyleId) {
        this.summaryStyleId = summaryStyleId;
    }


    /**
     * Gets the valid_date value for this MailGroup.
     * 
     * @return valid_date
     */
    public java.lang.String getValid_date() {
        return valid_date;
    }


    /**
     * Sets the valid_date value for this MailGroup.
     * 
     * @param valid_date
     */
    public void setValid_date(java.lang.String valid_date) {
        this.valid_date = valid_date;
    }


    /**
     * Gets the expire_date value for this MailGroup.
     * 
     * @return expire_date
     */
    public java.lang.String getExpire_date() {
        return expire_date;
    }


    /**
     * Sets the expire_date value for this MailGroup.
     * 
     * @param expire_date
     */
    public void setExpire_date(java.lang.String expire_date) {
        this.expire_date = expire_date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MailGroup)) return false;
        MailGroup other = (MailGroup) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.bill_format_id==null && other.getBill_format_id()==null) || 
             (this.bill_format_id!=null &&
              this.bill_format_id.equals(other.getBill_format_id()))) &&
            ((this.file_type==null && other.getFile_type()==null) || 
             (this.file_type!=null &&
              this.file_type.equals(other.getFile_type()))) &&
            ((this.summaryBillHandlingCode==null && other.getSummaryBillHandlingCode()==null) || 
             (this.summaryBillHandlingCode!=null &&
              this.summaryBillHandlingCode.equals(other.getSummaryBillHandlingCode()))) &&
            ((this.summaryBillLanguage==null && other.getSummaryBillLanguage()==null) || 
             (this.summaryBillLanguage!=null &&
              this.summaryBillLanguage.equals(other.getSummaryBillLanguage()))) &&
            ((this.summaryCurrency==null && other.getSummaryCurrency()==null) || 
             (this.summaryCurrency!=null &&
              this.summaryCurrency.equals(other.getSummaryCurrency()))) &&
            ((this.summaryStyleId==null && other.getSummaryStyleId()==null) || 
             (this.summaryStyleId!=null &&
              this.summaryStyleId.equals(other.getSummaryStyleId()))) &&
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getBill_format_id() != null) {
            _hashCode += getBill_format_id().hashCode();
        }
        if (getFile_type() != null) {
            _hashCode += getFile_type().hashCode();
        }
        if (getSummaryBillHandlingCode() != null) {
            _hashCode += getSummaryBillHandlingCode().hashCode();
        }
        if (getSummaryBillLanguage() != null) {
            _hashCode += getSummaryBillLanguage().hashCode();
        }
        if (getSummaryCurrency() != null) {
            _hashCode += getSummaryCurrency().hashCode();
        }
        if (getSummaryStyleId() != null) {
            _hashCode += getSummaryStyleId().hashCode();
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
        new org.apache.axis.description.TypeDesc(MailGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "mailGroup"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bill_format_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bill_format_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("file_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "file_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summaryBillHandlingCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "summaryBillHandlingCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summaryBillLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "summaryBillLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summaryCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "summaryCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summaryStyleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "summaryStyleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
