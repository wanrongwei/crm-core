/**
 * SQueryHisBillReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imshisqueryservice;

public class SQueryHisBillReq  implements java.io.Serializable {
    private java.lang.String outerAcctId;

    private java.lang.Long acctId;

    private java.lang.Long userId;

    private java.lang.String phoneId;

    private java.lang.Long productId;

    private java.lang.String invoiceNo;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.Short invoiceNoType;

    private java.lang.Long billlingPlanId;

    private java.lang.Integer formatType;

    private java.lang.Short taxType;

    private java.lang.Short prodType;

    private java.lang.Short carryOverType;

    private java.lang.Short retType;

    private java.lang.Long billNo;

    public SQueryHisBillReq() {
    }

    public SQueryHisBillReq(
           java.lang.String outerAcctId,
           java.lang.Long acctId,
           java.lang.Long userId,
           java.lang.String phoneId,
           java.lang.Long productId,
           java.lang.String invoiceNo,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.Short invoiceNoType,
           java.lang.Long billlingPlanId,
           java.lang.Integer formatType,
           java.lang.Short taxType,
           java.lang.Short prodType,
           java.lang.Short carryOverType,
           java.lang.Short retType,
           java.lang.Long billNo) {
           this.outerAcctId = outerAcctId;
           this.acctId = acctId;
           this.userId = userId;
           this.phoneId = phoneId;
           this.productId = productId;
           this.invoiceNo = invoiceNo;
           this.startDate = startDate;
           this.endDate = endDate;
           this.invoiceNoType = invoiceNoType;
           this.billlingPlanId = billlingPlanId;
           this.formatType = formatType;
           this.taxType = taxType;
           this.prodType = prodType;
           this.carryOverType = carryOverType;
           this.retType = retType;
           this.billNo = billNo;
    }


    /**
     * Gets the outerAcctId value for this SQueryHisBillReq.
     * 
     * @return outerAcctId
     */
    public java.lang.String getOuterAcctId() {
        return outerAcctId;
    }


    /**
     * Sets the outerAcctId value for this SQueryHisBillReq.
     * 
     * @param outerAcctId
     */
    public void setOuterAcctId(java.lang.String outerAcctId) {
        this.outerAcctId = outerAcctId;
    }


    /**
     * Gets the acctId value for this SQueryHisBillReq.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SQueryHisBillReq.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the userId value for this SQueryHisBillReq.
     * 
     * @return userId
     */
    public java.lang.Long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this SQueryHisBillReq.
     * 
     * @param userId
     */
    public void setUserId(java.lang.Long userId) {
        this.userId = userId;
    }


    /**
     * Gets the phoneId value for this SQueryHisBillReq.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this SQueryHisBillReq.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the productId value for this SQueryHisBillReq.
     * 
     * @return productId
     */
    public java.lang.Long getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this SQueryHisBillReq.
     * 
     * @param productId
     */
    public void setProductId(java.lang.Long productId) {
        this.productId = productId;
    }


    /**
     * Gets the invoiceNo value for this SQueryHisBillReq.
     * 
     * @return invoiceNo
     */
    public java.lang.String getInvoiceNo() {
        return invoiceNo;
    }


    /**
     * Sets the invoiceNo value for this SQueryHisBillReq.
     * 
     * @param invoiceNo
     */
    public void setInvoiceNo(java.lang.String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }


    /**
     * Gets the startDate value for this SQueryHisBillReq.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this SQueryHisBillReq.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this SQueryHisBillReq.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this SQueryHisBillReq.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the invoiceNoType value for this SQueryHisBillReq.
     * 
     * @return invoiceNoType
     */
    public java.lang.Short getInvoiceNoType() {
        return invoiceNoType;
    }


    /**
     * Sets the invoiceNoType value for this SQueryHisBillReq.
     * 
     * @param invoiceNoType
     */
    public void setInvoiceNoType(java.lang.Short invoiceNoType) {
        this.invoiceNoType = invoiceNoType;
    }


    /**
     * Gets the billlingPlanId value for this SQueryHisBillReq.
     * 
     * @return billlingPlanId
     */
    public java.lang.Long getBilllingPlanId() {
        return billlingPlanId;
    }


    /**
     * Sets the billlingPlanId value for this SQueryHisBillReq.
     * 
     * @param billlingPlanId
     */
    public void setBilllingPlanId(java.lang.Long billlingPlanId) {
        this.billlingPlanId = billlingPlanId;
    }


    /**
     * Gets the formatType value for this SQueryHisBillReq.
     * 
     * @return formatType
     */
    public java.lang.Integer getFormatType() {
        return formatType;
    }


    /**
     * Sets the formatType value for this SQueryHisBillReq.
     * 
     * @param formatType
     */
    public void setFormatType(java.lang.Integer formatType) {
        this.formatType = formatType;
    }


    /**
     * Gets the taxType value for this SQueryHisBillReq.
     * 
     * @return taxType
     */
    public java.lang.Short getTaxType() {
        return taxType;
    }


    /**
     * Sets the taxType value for this SQueryHisBillReq.
     * 
     * @param taxType
     */
    public void setTaxType(java.lang.Short taxType) {
        this.taxType = taxType;
    }


    /**
     * Gets the prodType value for this SQueryHisBillReq.
     * 
     * @return prodType
     */
    public java.lang.Short getProdType() {
        return prodType;
    }


    /**
     * Sets the prodType value for this SQueryHisBillReq.
     * 
     * @param prodType
     */
    public void setProdType(java.lang.Short prodType) {
        this.prodType = prodType;
    }


    /**
     * Gets the carryOverType value for this SQueryHisBillReq.
     * 
     * @return carryOverType
     */
    public java.lang.Short getCarryOverType() {
        return carryOverType;
    }


    /**
     * Sets the carryOverType value for this SQueryHisBillReq.
     * 
     * @param carryOverType
     */
    public void setCarryOverType(java.lang.Short carryOverType) {
        this.carryOverType = carryOverType;
    }


    /**
     * Gets the retType value for this SQueryHisBillReq.
     * 
     * @return retType
     */
    public java.lang.Short getRetType() {
        return retType;
    }


    /**
     * Sets the retType value for this SQueryHisBillReq.
     * 
     * @param retType
     */
    public void setRetType(java.lang.Short retType) {
        this.retType = retType;
    }


    /**
     * Gets the billNo value for this SQueryHisBillReq.
     * 
     * @return billNo
     */
    public java.lang.Long getBillNo() {
        return billNo;
    }


    /**
     * Sets the billNo value for this SQueryHisBillReq.
     * 
     * @param billNo
     */
    public void setBillNo(java.lang.Long billNo) {
        this.billNo = billNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SQueryHisBillReq)) return false;
        SQueryHisBillReq other = (SQueryHisBillReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.outerAcctId==null && other.getOuterAcctId()==null) || 
             (this.outerAcctId!=null &&
              this.outerAcctId.equals(other.getOuterAcctId()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.phoneId==null && other.getPhoneId()==null) || 
             (this.phoneId!=null &&
              this.phoneId.equals(other.getPhoneId()))) &&
            ((this.productId==null && other.getProductId()==null) || 
             (this.productId!=null &&
              this.productId.equals(other.getProductId()))) &&
            ((this.invoiceNo==null && other.getInvoiceNo()==null) || 
             (this.invoiceNo!=null &&
              this.invoiceNo.equals(other.getInvoiceNo()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.invoiceNoType==null && other.getInvoiceNoType()==null) || 
             (this.invoiceNoType!=null &&
              this.invoiceNoType.equals(other.getInvoiceNoType()))) &&
            ((this.billlingPlanId==null && other.getBilllingPlanId()==null) || 
             (this.billlingPlanId!=null &&
              this.billlingPlanId.equals(other.getBilllingPlanId()))) &&
            ((this.formatType==null && other.getFormatType()==null) || 
             (this.formatType!=null &&
              this.formatType.equals(other.getFormatType()))) &&
            ((this.taxType==null && other.getTaxType()==null) || 
             (this.taxType!=null &&
              this.taxType.equals(other.getTaxType()))) &&
            ((this.prodType==null && other.getProdType()==null) || 
             (this.prodType!=null &&
              this.prodType.equals(other.getProdType()))) &&
            ((this.carryOverType==null && other.getCarryOverType()==null) || 
             (this.carryOverType!=null &&
              this.carryOverType.equals(other.getCarryOverType()))) &&
            ((this.retType==null && other.getRetType()==null) || 
             (this.retType!=null &&
              this.retType.equals(other.getRetType()))) &&
            ((this.billNo==null && other.getBillNo()==null) || 
             (this.billNo!=null &&
              this.billNo.equals(other.getBillNo())));
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
        if (getOuterAcctId() != null) {
            _hashCode += getOuterAcctId().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getPhoneId() != null) {
            _hashCode += getPhoneId().hashCode();
        }
        if (getProductId() != null) {
            _hashCode += getProductId().hashCode();
        }
        if (getInvoiceNo() != null) {
            _hashCode += getInvoiceNo().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getInvoiceNoType() != null) {
            _hashCode += getInvoiceNoType().hashCode();
        }
        if (getBilllingPlanId() != null) {
            _hashCode += getBilllingPlanId().hashCode();
        }
        if (getFormatType() != null) {
            _hashCode += getFormatType().hashCode();
        }
        if (getTaxType() != null) {
            _hashCode += getTaxType().hashCode();
        }
        if (getProdType() != null) {
            _hashCode += getProdType().hashCode();
        }
        if (getCarryOverType() != null) {
            _hashCode += getCarryOverType().hashCode();
        }
        if (getRetType() != null) {
            _hashCode += getRetType().hashCode();
        }
        if (getBillNo() != null) {
            _hashCode += getBillNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SQueryHisBillReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryHisBillReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outerAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerAcctId"));
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
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceNoType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceNoType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billlingPlanId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billlingPlanId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formatType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "formatType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prodType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prodType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carryOverType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carryOverType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billNo"));
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
