/**
 * SCustomInvDtl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.imswrapservice;

public class SCustomInvDtl  implements java.io.Serializable {
    private java.lang.Long dtlNo;

    private java.lang.Long acctId;

    private java.lang.String billFormatName;

    private java.lang.Integer billFormatId;

    private java.lang.Long mailCode;

    private java.lang.Integer billingType;

    private java.lang.Integer isCharge;

    private java.lang.Integer isPrimary;

    private java.lang.Long tenantId;

    private java.lang.Integer validType;

    private java.lang.Integer operType;

    public SCustomInvDtl() {
    }

    public SCustomInvDtl(
           java.lang.Long dtlNo,
           java.lang.Long acctId,
           java.lang.String billFormatName,
           java.lang.Integer billFormatId,
           java.lang.Long mailCode,
           java.lang.Integer billingType,
           java.lang.Integer isCharge,
           java.lang.Integer isPrimary,
           java.lang.Long tenantId,
           java.lang.Integer validType,
           java.lang.Integer operType) {
           this.dtlNo = dtlNo;
           this.acctId = acctId;
           this.billFormatName = billFormatName;
           this.billFormatId = billFormatId;
           this.mailCode = mailCode;
           this.billingType = billingType;
           this.isCharge = isCharge;
           this.isPrimary = isPrimary;
           this.tenantId = tenantId;
           this.validType = validType;
           this.operType = operType;
    }


    /**
     * Gets the dtlNo value for this SCustomInvDtl.
     * 
     * @return dtlNo
     */
    public java.lang.Long getDtlNo() {
        return dtlNo;
    }


    /**
     * Sets the dtlNo value for this SCustomInvDtl.
     * 
     * @param dtlNo
     */
    public void setDtlNo(java.lang.Long dtlNo) {
        this.dtlNo = dtlNo;
    }


    /**
     * Gets the acctId value for this SCustomInvDtl.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SCustomInvDtl.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the billFormatName value for this SCustomInvDtl.
     * 
     * @return billFormatName
     */
    public java.lang.String getBillFormatName() {
        return billFormatName;
    }


    /**
     * Sets the billFormatName value for this SCustomInvDtl.
     * 
     * @param billFormatName
     */
    public void setBillFormatName(java.lang.String billFormatName) {
        this.billFormatName = billFormatName;
    }


    /**
     * Gets the billFormatId value for this SCustomInvDtl.
     * 
     * @return billFormatId
     */
    public java.lang.Integer getBillFormatId() {
        return billFormatId;
    }


    /**
     * Sets the billFormatId value for this SCustomInvDtl.
     * 
     * @param billFormatId
     */
    public void setBillFormatId(java.lang.Integer billFormatId) {
        this.billFormatId = billFormatId;
    }


    /**
     * Gets the mailCode value for this SCustomInvDtl.
     * 
     * @return mailCode
     */
    public java.lang.Long getMailCode() {
        return mailCode;
    }


    /**
     * Sets the mailCode value for this SCustomInvDtl.
     * 
     * @param mailCode
     */
    public void setMailCode(java.lang.Long mailCode) {
        this.mailCode = mailCode;
    }


    /**
     * Gets the billingType value for this SCustomInvDtl.
     * 
     * @return billingType
     */
    public java.lang.Integer getBillingType() {
        return billingType;
    }


    /**
     * Sets the billingType value for this SCustomInvDtl.
     * 
     * @param billingType
     */
    public void setBillingType(java.lang.Integer billingType) {
        this.billingType = billingType;
    }


    /**
     * Gets the isCharge value for this SCustomInvDtl.
     * 
     * @return isCharge
     */
    public java.lang.Integer getIsCharge() {
        return isCharge;
    }


    /**
     * Sets the isCharge value for this SCustomInvDtl.
     * 
     * @param isCharge
     */
    public void setIsCharge(java.lang.Integer isCharge) {
        this.isCharge = isCharge;
    }


    /**
     * Gets the isPrimary value for this SCustomInvDtl.
     * 
     * @return isPrimary
     */
    public java.lang.Integer getIsPrimary() {
        return isPrimary;
    }


    /**
     * Sets the isPrimary value for this SCustomInvDtl.
     * 
     * @param isPrimary
     */
    public void setIsPrimary(java.lang.Integer isPrimary) {
        this.isPrimary = isPrimary;
    }


    /**
     * Gets the tenantId value for this SCustomInvDtl.
     * 
     * @return tenantId
     */
    public java.lang.Long getTenantId() {
        return tenantId;
    }


    /**
     * Sets the tenantId value for this SCustomInvDtl.
     * 
     * @param tenantId
     */
    public void setTenantId(java.lang.Long tenantId) {
        this.tenantId = tenantId;
    }


    /**
     * Gets the validType value for this SCustomInvDtl.
     * 
     * @return validType
     */
    public java.lang.Integer getValidType() {
        return validType;
    }


    /**
     * Sets the validType value for this SCustomInvDtl.
     * 
     * @param validType
     */
    public void setValidType(java.lang.Integer validType) {
        this.validType = validType;
    }


    /**
     * Gets the operType value for this SCustomInvDtl.
     * 
     * @return operType
     */
    public java.lang.Integer getOperType() {
        return operType;
    }


    /**
     * Sets the operType value for this SCustomInvDtl.
     * 
     * @param operType
     */
    public void setOperType(java.lang.Integer operType) {
        this.operType = operType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SCustomInvDtl)) return false;
        SCustomInvDtl other = (SCustomInvDtl) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dtlNo==null && other.getDtlNo()==null) || 
             (this.dtlNo!=null &&
              this.dtlNo.equals(other.getDtlNo()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.billFormatName==null && other.getBillFormatName()==null) || 
             (this.billFormatName!=null &&
              this.billFormatName.equals(other.getBillFormatName()))) &&
            ((this.billFormatId==null && other.getBillFormatId()==null) || 
             (this.billFormatId!=null &&
              this.billFormatId.equals(other.getBillFormatId()))) &&
            ((this.mailCode==null && other.getMailCode()==null) || 
             (this.mailCode!=null &&
              this.mailCode.equals(other.getMailCode()))) &&
            ((this.billingType==null && other.getBillingType()==null) || 
             (this.billingType!=null &&
              this.billingType.equals(other.getBillingType()))) &&
            ((this.isCharge==null && other.getIsCharge()==null) || 
             (this.isCharge!=null &&
              this.isCharge.equals(other.getIsCharge()))) &&
            ((this.isPrimary==null && other.getIsPrimary()==null) || 
             (this.isPrimary!=null &&
              this.isPrimary.equals(other.getIsPrimary()))) &&
            ((this.tenantId==null && other.getTenantId()==null) || 
             (this.tenantId!=null &&
              this.tenantId.equals(other.getTenantId()))) &&
            ((this.validType==null && other.getValidType()==null) || 
             (this.validType!=null &&
              this.validType.equals(other.getValidType()))) &&
            ((this.operType==null && other.getOperType()==null) || 
             (this.operType!=null &&
              this.operType.equals(other.getOperType())));
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
        if (getDtlNo() != null) {
            _hashCode += getDtlNo().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getBillFormatName() != null) {
            _hashCode += getBillFormatName().hashCode();
        }
        if (getBillFormatId() != null) {
            _hashCode += getBillFormatId().hashCode();
        }
        if (getMailCode() != null) {
            _hashCode += getMailCode().hashCode();
        }
        if (getBillingType() != null) {
            _hashCode += getBillingType().hashCode();
        }
        if (getIsCharge() != null) {
            _hashCode += getIsCharge().hashCode();
        }
        if (getIsPrimary() != null) {
            _hashCode += getIsPrimary().hashCode();
        }
        if (getTenantId() != null) {
            _hashCode += getTenantId().hashCode();
        }
        if (getValidType() != null) {
            _hashCode += getValidType().hashCode();
        }
        if (getOperType() != null) {
            _hashCode += getOperType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SCustomInvDtl.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCustomInvDtl"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtlNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dtlNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billFormatName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billFormatName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billFormatId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billFormatId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mailCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPrimary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isPrimary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenantId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tenantId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
