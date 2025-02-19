/**
 * DoAgentDepositResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class DoAgentDepositResponse  extends com.asiainfo.crm.cm.dk.ws.imswrapservice.CrmBaseResponse  implements java.io.Serializable {
    private java.lang.Long soNbr;

    private java.util.Calendar soDate;

    private java.lang.Long orgBalance;

    private java.lang.Long targetBalance;

    private com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsDepositResult depositResult;

    private java.lang.Integer measureId;

    public DoAgentDepositResponse() {
    }

    public DoAgentDepositResponse(
           com.asiainfo.crm.cm.dk.ws.imswrapservice.ResponseHead responseHead,
           java.lang.Long soNbr,
           java.util.Calendar soDate,
           java.lang.Long orgBalance,
           java.lang.Long targetBalance,
           com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsDepositResult depositResult,
           java.lang.Integer measureId) {
        super(
            responseHead);
        this.soNbr = soNbr;
        this.soDate = soDate;
        this.orgBalance = orgBalance;
        this.targetBalance = targetBalance;
        this.depositResult = depositResult;
        this.measureId = measureId;
    }


    /**
     * Gets the soNbr value for this DoAgentDepositResponse.
     * 
     * @return soNbr
     */
    public java.lang.Long getSoNbr() {
        return soNbr;
    }


    /**
     * Sets the soNbr value for this DoAgentDepositResponse.
     * 
     * @param soNbr
     */
    public void setSoNbr(java.lang.Long soNbr) {
        this.soNbr = soNbr;
    }


    /**
     * Gets the soDate value for this DoAgentDepositResponse.
     * 
     * @return soDate
     */
    public java.util.Calendar getSoDate() {
        return soDate;
    }


    /**
     * Sets the soDate value for this DoAgentDepositResponse.
     * 
     * @param soDate
     */
    public void setSoDate(java.util.Calendar soDate) {
        this.soDate = soDate;
    }


    /**
     * Gets the orgBalance value for this DoAgentDepositResponse.
     * 
     * @return orgBalance
     */
    public java.lang.Long getOrgBalance() {
        return orgBalance;
    }


    /**
     * Sets the orgBalance value for this DoAgentDepositResponse.
     * 
     * @param orgBalance
     */
    public void setOrgBalance(java.lang.Long orgBalance) {
        this.orgBalance = orgBalance;
    }


    /**
     * Gets the targetBalance value for this DoAgentDepositResponse.
     * 
     * @return targetBalance
     */
    public java.lang.Long getTargetBalance() {
        return targetBalance;
    }


    /**
     * Sets the targetBalance value for this DoAgentDepositResponse.
     * 
     * @param targetBalance
     */
    public void setTargetBalance(java.lang.Long targetBalance) {
        this.targetBalance = targetBalance;
    }


    /**
     * Gets the depositResult value for this DoAgentDepositResponse.
     * 
     * @return depositResult
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsDepositResult getDepositResult() {
        return depositResult;
    }


    /**
     * Sets the depositResult value for this DoAgentDepositResponse.
     * 
     * @param depositResult
     */
    public void setDepositResult(com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsDepositResult depositResult) {
        this.depositResult = depositResult;
    }


    /**
     * Gets the measureId value for this DoAgentDepositResponse.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this DoAgentDepositResponse.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoAgentDepositResponse)) return false;
        DoAgentDepositResponse other = (DoAgentDepositResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.soNbr==null && other.getSoNbr()==null) || 
             (this.soNbr!=null &&
              this.soNbr.equals(other.getSoNbr()))) &&
            ((this.soDate==null && other.getSoDate()==null) || 
             (this.soDate!=null &&
              this.soDate.equals(other.getSoDate()))) &&
            ((this.orgBalance==null && other.getOrgBalance()==null) || 
             (this.orgBalance!=null &&
              this.orgBalance.equals(other.getOrgBalance()))) &&
            ((this.targetBalance==null && other.getTargetBalance()==null) || 
             (this.targetBalance!=null &&
              this.targetBalance.equals(other.getTargetBalance()))) &&
            ((this.depositResult==null && other.getDepositResult()==null) || 
             (this.depositResult!=null &&
              this.depositResult.equals(other.getDepositResult()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getSoNbr() != null) {
            _hashCode += getSoNbr().hashCode();
        }
        if (getSoDate() != null) {
            _hashCode += getSoDate().hashCode();
        }
        if (getOrgBalance() != null) {
            _hashCode += getOrgBalance().hashCode();
        }
        if (getTargetBalance() != null) {
            _hashCode += getTargetBalance().hashCode();
        }
        if (getDepositResult() != null) {
            _hashCode += getDepositResult().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoAgentDepositResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAgentDepositResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "soNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "soDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "imsDepositResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measureId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measureId"));
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
