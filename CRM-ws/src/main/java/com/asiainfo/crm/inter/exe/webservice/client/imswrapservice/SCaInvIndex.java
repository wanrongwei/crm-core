/**
 * SCaInvIndex.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.imswrapservice;

public class SCaInvIndex  implements java.io.Serializable {
    private java.lang.Long invseq;

    private java.lang.Long seqid;

    private java.lang.Long acctId;

    private java.util.Calendar createDate;

    private java.lang.Integer billDate;

    private java.lang.String invoiceNo;

    private java.lang.Integer billMonth;

    private java.lang.Long bilingPlanId;

    private java.lang.Integer sts;

    private java.lang.Long tenantId;

    public SCaInvIndex() {
    }

    public SCaInvIndex(
           java.lang.Long invseq,
           java.lang.Long seqid,
           java.lang.Long acctId,
           java.util.Calendar createDate,
           java.lang.Integer billDate,
           java.lang.String invoiceNo,
           java.lang.Integer billMonth,
           java.lang.Long bilingPlanId,
           java.lang.Integer sts,
           java.lang.Long tenantId) {
           this.invseq = invseq;
           this.seqid = seqid;
           this.acctId = acctId;
           this.createDate = createDate;
           this.billDate = billDate;
           this.invoiceNo = invoiceNo;
           this.billMonth = billMonth;
           this.bilingPlanId = bilingPlanId;
           this.sts = sts;
           this.tenantId = tenantId;
    }


    /**
     * Gets the invseq value for this SCaInvIndex.
     * 
     * @return invseq
     */
    public java.lang.Long getInvseq() {
        return invseq;
    }


    /**
     * Sets the invseq value for this SCaInvIndex.
     * 
     * @param invseq
     */
    public void setInvseq(java.lang.Long invseq) {
        this.invseq = invseq;
    }


    /**
     * Gets the seqid value for this SCaInvIndex.
     * 
     * @return seqid
     */
    public java.lang.Long getSeqid() {
        return seqid;
    }


    /**
     * Sets the seqid value for this SCaInvIndex.
     * 
     * @param seqid
     */
    public void setSeqid(java.lang.Long seqid) {
        this.seqid = seqid;
    }


    /**
     * Gets the acctId value for this SCaInvIndex.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SCaInvIndex.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the createDate value for this SCaInvIndex.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this SCaInvIndex.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the billDate value for this SCaInvIndex.
     * 
     * @return billDate
     */
    public java.lang.Integer getBillDate() {
        return billDate;
    }


    /**
     * Sets the billDate value for this SCaInvIndex.
     * 
     * @param billDate
     */
    public void setBillDate(java.lang.Integer billDate) {
        this.billDate = billDate;
    }


    /**
     * Gets the invoiceNo value for this SCaInvIndex.
     * 
     * @return invoiceNo
     */
    public java.lang.String getInvoiceNo() {
        return invoiceNo;
    }


    /**
     * Sets the invoiceNo value for this SCaInvIndex.
     * 
     * @param invoiceNo
     */
    public void setInvoiceNo(java.lang.String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }


    /**
     * Gets the billMonth value for this SCaInvIndex.
     * 
     * @return billMonth
     */
    public java.lang.Integer getBillMonth() {
        return billMonth;
    }


    /**
     * Sets the billMonth value for this SCaInvIndex.
     * 
     * @param billMonth
     */
    public void setBillMonth(java.lang.Integer billMonth) {
        this.billMonth = billMonth;
    }


    /**
     * Gets the bilingPlanId value for this SCaInvIndex.
     * 
     * @return bilingPlanId
     */
    public java.lang.Long getBilingPlanId() {
        return bilingPlanId;
    }


    /**
     * Sets the bilingPlanId value for this SCaInvIndex.
     * 
     * @param bilingPlanId
     */
    public void setBilingPlanId(java.lang.Long bilingPlanId) {
        this.bilingPlanId = bilingPlanId;
    }


    /**
     * Gets the sts value for this SCaInvIndex.
     * 
     * @return sts
     */
    public java.lang.Integer getSts() {
        return sts;
    }


    /**
     * Sets the sts value for this SCaInvIndex.
     * 
     * @param sts
     */
    public void setSts(java.lang.Integer sts) {
        this.sts = sts;
    }


    /**
     * Gets the tenantId value for this SCaInvIndex.
     * 
     * @return tenantId
     */
    public java.lang.Long getTenantId() {
        return tenantId;
    }


    /**
     * Sets the tenantId value for this SCaInvIndex.
     * 
     * @param tenantId
     */
    public void setTenantId(java.lang.Long tenantId) {
        this.tenantId = tenantId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SCaInvIndex)) return false;
        SCaInvIndex other = (SCaInvIndex) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.invseq==null && other.getInvseq()==null) || 
             (this.invseq!=null &&
              this.invseq.equals(other.getInvseq()))) &&
            ((this.seqid==null && other.getSeqid()==null) || 
             (this.seqid!=null &&
              this.seqid.equals(other.getSeqid()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.billDate==null && other.getBillDate()==null) || 
             (this.billDate!=null &&
              this.billDate.equals(other.getBillDate()))) &&
            ((this.invoiceNo==null && other.getInvoiceNo()==null) || 
             (this.invoiceNo!=null &&
              this.invoiceNo.equals(other.getInvoiceNo()))) &&
            ((this.billMonth==null && other.getBillMonth()==null) || 
             (this.billMonth!=null &&
              this.billMonth.equals(other.getBillMonth()))) &&
            ((this.bilingPlanId==null && other.getBilingPlanId()==null) || 
             (this.bilingPlanId!=null &&
              this.bilingPlanId.equals(other.getBilingPlanId()))) &&
            ((this.sts==null && other.getSts()==null) || 
             (this.sts!=null &&
              this.sts.equals(other.getSts()))) &&
            ((this.tenantId==null && other.getTenantId()==null) || 
             (this.tenantId!=null &&
              this.tenantId.equals(other.getTenantId())));
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
        if (getInvseq() != null) {
            _hashCode += getInvseq().hashCode();
        }
        if (getSeqid() != null) {
            _hashCode += getSeqid().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getBillDate() != null) {
            _hashCode += getBillDate().hashCode();
        }
        if (getInvoiceNo() != null) {
            _hashCode += getInvoiceNo().hashCode();
        }
        if (getBillMonth() != null) {
            _hashCode += getBillMonth().hashCode();
        }
        if (getBilingPlanId() != null) {
            _hashCode += getBilingPlanId().hashCode();
        }
        if (getSts() != null) {
            _hashCode += getSts().hashCode();
        }
        if (getTenantId() != null) {
            _hashCode += getTenantId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SCaInvIndex.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCaInvIndex"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invseq");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invseq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seqid"));
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
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bilingPlanId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bilingPlanId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sts"));
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
