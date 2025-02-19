/**
 * QueryWorkLogReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class QueryWorkLogReq  implements java.io.Serializable {
    private java.lang.String outerAcctId;

    private java.lang.Long acctId;

    private java.lang.Long userId;

    private java.lang.String phoneId;

    private java.lang.String targetPhoneId;

    private java.lang.Short queryType;

    private java.lang.Short rechargeChannel;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String productSequenceId;

    public QueryWorkLogReq() {
    }

    public QueryWorkLogReq(
           java.lang.String outerAcctId,
           java.lang.Long acctId,
           java.lang.Long userId,
           java.lang.String phoneId,
           java.lang.String targetPhoneId,
           java.lang.Short queryType,
           java.lang.Short rechargeChannel,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String productSequenceId) {
           this.outerAcctId = outerAcctId;
           this.acctId = acctId;
           this.userId = userId;
           this.phoneId = phoneId;
           this.targetPhoneId = targetPhoneId;
           this.queryType = queryType;
           this.rechargeChannel = rechargeChannel;
           this.startDate = startDate;
           this.endDate = endDate;
           this.productSequenceId = productSequenceId;
    }


    /**
     * Gets the outerAcctId value for this QueryWorkLogReq.
     * 
     * @return outerAcctId
     */
    public java.lang.String getOuterAcctId() {
        return outerAcctId;
    }


    /**
     * Sets the outerAcctId value for this QueryWorkLogReq.
     * 
     * @param outerAcctId
     */
    public void setOuterAcctId(java.lang.String outerAcctId) {
        this.outerAcctId = outerAcctId;
    }


    /**
     * Gets the acctId value for this QueryWorkLogReq.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this QueryWorkLogReq.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the userId value for this QueryWorkLogReq.
     * 
     * @return userId
     */
    public java.lang.Long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this QueryWorkLogReq.
     * 
     * @param userId
     */
    public void setUserId(java.lang.Long userId) {
        this.userId = userId;
    }


    /**
     * Gets the phoneId value for this QueryWorkLogReq.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this QueryWorkLogReq.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the targetPhoneId value for this QueryWorkLogReq.
     * 
     * @return targetPhoneId
     */
    public java.lang.String getTargetPhoneId() {
        return targetPhoneId;
    }


    /**
     * Sets the targetPhoneId value for this QueryWorkLogReq.
     * 
     * @param targetPhoneId
     */
    public void setTargetPhoneId(java.lang.String targetPhoneId) {
        this.targetPhoneId = targetPhoneId;
    }


    /**
     * Gets the queryType value for this QueryWorkLogReq.
     * 
     * @return queryType
     */
    public java.lang.Short getQueryType() {
        return queryType;
    }


    /**
     * Sets the queryType value for this QueryWorkLogReq.
     * 
     * @param queryType
     */
    public void setQueryType(java.lang.Short queryType) {
        this.queryType = queryType;
    }


    /**
     * Gets the rechargeChannel value for this QueryWorkLogReq.
     * 
     * @return rechargeChannel
     */
    public java.lang.Short getRechargeChannel() {
        return rechargeChannel;
    }


    /**
     * Sets the rechargeChannel value for this QueryWorkLogReq.
     * 
     * @param rechargeChannel
     */
    public void setRechargeChannel(java.lang.Short rechargeChannel) {
        this.rechargeChannel = rechargeChannel;
    }


    /**
     * Gets the startDate value for this QueryWorkLogReq.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this QueryWorkLogReq.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this QueryWorkLogReq.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this QueryWorkLogReq.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the productSequenceId value for this QueryWorkLogReq.
     * 
     * @return productSequenceId
     */
    public java.lang.String getProductSequenceId() {
        return productSequenceId;
    }


    /**
     * Sets the productSequenceId value for this QueryWorkLogReq.
     * 
     * @param productSequenceId
     */
    public void setProductSequenceId(java.lang.String productSequenceId) {
        this.productSequenceId = productSequenceId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryWorkLogReq)) return false;
        QueryWorkLogReq other = (QueryWorkLogReq) obj;
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
            ((this.targetPhoneId==null && other.getTargetPhoneId()==null) || 
             (this.targetPhoneId!=null &&
              this.targetPhoneId.equals(other.getTargetPhoneId()))) &&
            ((this.queryType==null && other.getQueryType()==null) || 
             (this.queryType!=null &&
              this.queryType.equals(other.getQueryType()))) &&
            ((this.rechargeChannel==null && other.getRechargeChannel()==null) || 
             (this.rechargeChannel!=null &&
              this.rechargeChannel.equals(other.getRechargeChannel()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.productSequenceId==null && other.getProductSequenceId()==null) || 
             (this.productSequenceId!=null &&
              this.productSequenceId.equals(other.getProductSequenceId())));
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
        if (getTargetPhoneId() != null) {
            _hashCode += getTargetPhoneId().hashCode();
        }
        if (getQueryType() != null) {
            _hashCode += getQueryType().hashCode();
        }
        if (getRechargeChannel() != null) {
            _hashCode += getRechargeChannel().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getProductSequenceId() != null) {
            _hashCode += getProductSequenceId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryWorkLogReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryWorkLogReq"));
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
        elemField.setFieldName("targetPhoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetPhoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "queryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechargeChannel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechargeChannel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
        elemField.setFieldName("productSequenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productSequenceId"));
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
