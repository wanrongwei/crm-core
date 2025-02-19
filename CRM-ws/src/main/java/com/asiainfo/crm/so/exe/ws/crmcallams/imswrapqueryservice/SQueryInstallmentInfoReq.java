/**
 * SQueryInstallmentInfoReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class SQueryInstallmentInfoReq  implements java.io.Serializable {
    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    private java.lang.Long billingNo;

    private java.lang.Integer instalType;

    private java.lang.String businessId;

    private java.lang.String busiessType;

    private java.lang.Long acctId;

    private java.lang.Integer instalStatus;

    private java.lang.Boolean qryBillInfoFlag;

    public SQueryInstallmentInfoReq() {
    }

    public SQueryInstallmentInfoReq(
           java.util.Calendar startDate,
           java.util.Calendar endDate,
           java.lang.Long billingNo,
           java.lang.Integer instalType,
           java.lang.String businessId,
           java.lang.String busiessType,
           java.lang.Long acctId,
           java.lang.Integer instalStatus,
           java.lang.Boolean qryBillInfoFlag) {
           this.startDate = startDate;
           this.endDate = endDate;
           this.billingNo = billingNo;
           this.instalType = instalType;
           this.businessId = businessId;
           this.busiessType = busiessType;
           this.acctId = acctId;
           this.instalStatus = instalStatus;
           this.qryBillInfoFlag = qryBillInfoFlag;
    }


    /**
     * Gets the startDate value for this SQueryInstallmentInfoReq.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this SQueryInstallmentInfoReq.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this SQueryInstallmentInfoReq.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this SQueryInstallmentInfoReq.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the billingNo value for this SQueryInstallmentInfoReq.
     * 
     * @return billingNo
     */
    public java.lang.Long getBillingNo() {
        return billingNo;
    }


    /**
     * Sets the billingNo value for this SQueryInstallmentInfoReq.
     * 
     * @param billingNo
     */
    public void setBillingNo(java.lang.Long billingNo) {
        this.billingNo = billingNo;
    }


    /**
     * Gets the instalType value for this SQueryInstallmentInfoReq.
     * 
     * @return instalType
     */
    public java.lang.Integer getInstalType() {
        return instalType;
    }


    /**
     * Sets the instalType value for this SQueryInstallmentInfoReq.
     * 
     * @param instalType
     */
    public void setInstalType(java.lang.Integer instalType) {
        this.instalType = instalType;
    }


    /**
     * Gets the businessId value for this SQueryInstallmentInfoReq.
     * 
     * @return businessId
     */
    public java.lang.String getBusinessId() {
        return businessId;
    }


    /**
     * Sets the businessId value for this SQueryInstallmentInfoReq.
     * 
     * @param businessId
     */
    public void setBusinessId(java.lang.String businessId) {
        this.businessId = businessId;
    }


    /**
     * Gets the busiessType value for this SQueryInstallmentInfoReq.
     * 
     * @return busiessType
     */
    public java.lang.String getBusiessType() {
        return busiessType;
    }


    /**
     * Sets the busiessType value for this SQueryInstallmentInfoReq.
     * 
     * @param busiessType
     */
    public void setBusiessType(java.lang.String busiessType) {
        this.busiessType = busiessType;
    }


    /**
     * Gets the acctId value for this SQueryInstallmentInfoReq.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SQueryInstallmentInfoReq.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the instalStatus value for this SQueryInstallmentInfoReq.
     * 
     * @return instalStatus
     */
    public java.lang.Integer getInstalStatus() {
        return instalStatus;
    }


    /**
     * Sets the instalStatus value for this SQueryInstallmentInfoReq.
     * 
     * @param instalStatus
     */
    public void setInstalStatus(java.lang.Integer instalStatus) {
        this.instalStatus = instalStatus;
    }


    /**
     * Gets the qryBillInfoFlag value for this SQueryInstallmentInfoReq.
     * 
     * @return qryBillInfoFlag
     */
    public java.lang.Boolean getQryBillInfoFlag() {
        return qryBillInfoFlag;
    }


    /**
     * Sets the qryBillInfoFlag value for this SQueryInstallmentInfoReq.
     * 
     * @param qryBillInfoFlag
     */
    public void setQryBillInfoFlag(java.lang.Boolean qryBillInfoFlag) {
        this.qryBillInfoFlag = qryBillInfoFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SQueryInstallmentInfoReq)) return false;
        SQueryInstallmentInfoReq other = (SQueryInstallmentInfoReq) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.billingNo==null && other.getBillingNo()==null) || 
             (this.billingNo!=null &&
              this.billingNo.equals(other.getBillingNo()))) &&
            ((this.instalType==null && other.getInstalType()==null) || 
             (this.instalType!=null &&
              this.instalType.equals(other.getInstalType()))) &&
            ((this.businessId==null && other.getBusinessId()==null) || 
             (this.businessId!=null &&
              this.businessId.equals(other.getBusinessId()))) &&
            ((this.busiessType==null && other.getBusiessType()==null) || 
             (this.busiessType!=null &&
              this.busiessType.equals(other.getBusiessType()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.instalStatus==null && other.getInstalStatus()==null) || 
             (this.instalStatus!=null &&
              this.instalStatus.equals(other.getInstalStatus()))) &&
            ((this.qryBillInfoFlag==null && other.getQryBillInfoFlag()==null) || 
             (this.qryBillInfoFlag!=null &&
              this.qryBillInfoFlag.equals(other.getQryBillInfoFlag())));
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
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getBillingNo() != null) {
            _hashCode += getBillingNo().hashCode();
        }
        if (getInstalType() != null) {
            _hashCode += getInstalType().hashCode();
        }
        if (getBusinessId() != null) {
            _hashCode += getBusinessId().hashCode();
        }
        if (getBusiessType() != null) {
            _hashCode += getBusiessType().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getInstalStatus() != null) {
            _hashCode += getInstalStatus().hashCode();
        }
        if (getQryBillInfoFlag() != null) {
            _hashCode += getQryBillInfoFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SQueryInstallmentInfoReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryInstallmentInfoReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instalType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instalType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("busiessType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "busiessType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("instalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qryBillInfoFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qryBillInfoFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
