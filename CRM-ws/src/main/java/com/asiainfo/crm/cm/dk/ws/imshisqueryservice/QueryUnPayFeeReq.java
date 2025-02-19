/**
 * QueryUnPayFeeReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imshisqueryservice;

public class QueryUnPayFeeReq  implements java.io.Serializable {
    private java.lang.String invoiceNo;

    private java.lang.Long resourceId;

    private java.lang.Long acctId;

    private java.lang.String outerAcctId;

    private java.lang.String startMonth;

    private java.lang.String endMonth;

    private java.lang.Integer bigAcctFlag;

    private java.lang.Boolean merger;

    private java.lang.String queryType;

    public QueryUnPayFeeReq() {
    }

    public QueryUnPayFeeReq(
           java.lang.String invoiceNo,
           java.lang.Long resourceId,
           java.lang.Long acctId,
           java.lang.String outerAcctId,
           java.lang.String startMonth,
           java.lang.String endMonth,
           java.lang.Integer bigAcctFlag,
           java.lang.Boolean merger,
           java.lang.String queryType) {
           this.invoiceNo = invoiceNo;
           this.resourceId = resourceId;
           this.acctId = acctId;
           this.outerAcctId = outerAcctId;
           this.startMonth = startMonth;
           this.endMonth = endMonth;
           this.bigAcctFlag = bigAcctFlag;
           this.merger = merger;
           this.queryType = queryType;
    }


    /**
     * Gets the invoiceNo value for this QueryUnPayFeeReq.
     * 
     * @return invoiceNo
     */
    public java.lang.String getInvoiceNo() {
        return invoiceNo;
    }


    /**
     * Sets the invoiceNo value for this QueryUnPayFeeReq.
     * 
     * @param invoiceNo
     */
    public void setInvoiceNo(java.lang.String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }


    /**
     * Gets the resourceId value for this QueryUnPayFeeReq.
     * 
     * @return resourceId
     */
    public java.lang.Long getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this QueryUnPayFeeReq.
     * 
     * @param resourceId
     */
    public void setResourceId(java.lang.Long resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * Gets the acctId value for this QueryUnPayFeeReq.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this QueryUnPayFeeReq.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the outerAcctId value for this QueryUnPayFeeReq.
     * 
     * @return outerAcctId
     */
    public java.lang.String getOuterAcctId() {
        return outerAcctId;
    }


    /**
     * Sets the outerAcctId value for this QueryUnPayFeeReq.
     * 
     * @param outerAcctId
     */
    public void setOuterAcctId(java.lang.String outerAcctId) {
        this.outerAcctId = outerAcctId;
    }


    /**
     * Gets the startMonth value for this QueryUnPayFeeReq.
     * 
     * @return startMonth
     */
    public java.lang.String getStartMonth() {
        return startMonth;
    }


    /**
     * Sets the startMonth value for this QueryUnPayFeeReq.
     * 
     * @param startMonth
     */
    public void setStartMonth(java.lang.String startMonth) {
        this.startMonth = startMonth;
    }


    /**
     * Gets the endMonth value for this QueryUnPayFeeReq.
     * 
     * @return endMonth
     */
    public java.lang.String getEndMonth() {
        return endMonth;
    }


    /**
     * Sets the endMonth value for this QueryUnPayFeeReq.
     * 
     * @param endMonth
     */
    public void setEndMonth(java.lang.String endMonth) {
        this.endMonth = endMonth;
    }


    /**
     * Gets the bigAcctFlag value for this QueryUnPayFeeReq.
     * 
     * @return bigAcctFlag
     */
    public java.lang.Integer getBigAcctFlag() {
        return bigAcctFlag;
    }


    /**
     * Sets the bigAcctFlag value for this QueryUnPayFeeReq.
     * 
     * @param bigAcctFlag
     */
    public void setBigAcctFlag(java.lang.Integer bigAcctFlag) {
        this.bigAcctFlag = bigAcctFlag;
    }


    /**
     * Gets the merger value for this QueryUnPayFeeReq.
     * 
     * @return merger
     */
    public java.lang.Boolean getMerger() {
        return merger;
    }


    /**
     * Sets the merger value for this QueryUnPayFeeReq.
     * 
     * @param merger
     */
    public void setMerger(java.lang.Boolean merger) {
        this.merger = merger;
    }


    /**
     * Gets the queryType value for this QueryUnPayFeeReq.
     * 
     * @return queryType
     */
    public java.lang.String getQueryType() {
        return queryType;
    }


    /**
     * Sets the queryType value for this QueryUnPayFeeReq.
     * 
     * @param queryType
     */
    public void setQueryType(java.lang.String queryType) {
        this.queryType = queryType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryUnPayFeeReq)) return false;
        QueryUnPayFeeReq other = (QueryUnPayFeeReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.invoiceNo==null && other.getInvoiceNo()==null) || 
             (this.invoiceNo!=null &&
              this.invoiceNo.equals(other.getInvoiceNo()))) &&
            ((this.resourceId==null && other.getResourceId()==null) || 
             (this.resourceId!=null &&
              this.resourceId.equals(other.getResourceId()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.outerAcctId==null && other.getOuterAcctId()==null) || 
             (this.outerAcctId!=null &&
              this.outerAcctId.equals(other.getOuterAcctId()))) &&
            ((this.startMonth==null && other.getStartMonth()==null) || 
             (this.startMonth!=null &&
              this.startMonth.equals(other.getStartMonth()))) &&
            ((this.endMonth==null && other.getEndMonth()==null) || 
             (this.endMonth!=null &&
              this.endMonth.equals(other.getEndMonth()))) &&
            ((this.bigAcctFlag==null && other.getBigAcctFlag()==null) || 
             (this.bigAcctFlag!=null &&
              this.bigAcctFlag.equals(other.getBigAcctFlag()))) &&
            ((this.merger==null && other.getMerger()==null) || 
             (this.merger!=null &&
              this.merger.equals(other.getMerger()))) &&
            ((this.queryType==null && other.getQueryType()==null) || 
             (this.queryType!=null &&
              this.queryType.equals(other.getQueryType())));
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
        if (getInvoiceNo() != null) {
            _hashCode += getInvoiceNo().hashCode();
        }
        if (getResourceId() != null) {
            _hashCode += getResourceId().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getOuterAcctId() != null) {
            _hashCode += getOuterAcctId().hashCode();
        }
        if (getStartMonth() != null) {
            _hashCode += getStartMonth().hashCode();
        }
        if (getEndMonth() != null) {
            _hashCode += getEndMonth().hashCode();
        }
        if (getBigAcctFlag() != null) {
            _hashCode += getBigAcctFlag().hashCode();
        }
        if (getMerger() != null) {
            _hashCode += getMerger().hashCode();
        }
        if (getQueryType() != null) {
            _hashCode += getQueryType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryUnPayFeeReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryUnPayFeeReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceId"));
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
        elemField.setFieldName("outerAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bigAcctFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bigAcctFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merger");
        elemField.setXmlName(new javax.xml.namespace.QName("", "merger"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "queryType"));
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
