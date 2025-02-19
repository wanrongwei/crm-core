/**
 * DoCheckDepositAmountResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class DoCheckDepositAmountResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CrmBaseResponse  implements java.io.Serializable {
    private java.lang.Boolean resultFlag;

    private java.lang.Long minAmount;

    private java.lang.Long maxAmount;

    public DoCheckDepositAmountResponse() {
    }

    public DoCheckDepositAmountResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ResponseHead responseHead,
           java.lang.Boolean resultFlag,
           java.lang.Long minAmount,
           java.lang.Long maxAmount) {
        super(
            responseHead);
        this.resultFlag = resultFlag;
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
    }


    /**
     * Gets the resultFlag value for this DoCheckDepositAmountResponse.
     * 
     * @return resultFlag
     */
    public java.lang.Boolean getResultFlag() {
        return resultFlag;
    }


    /**
     * Sets the resultFlag value for this DoCheckDepositAmountResponse.
     * 
     * @param resultFlag
     */
    public void setResultFlag(java.lang.Boolean resultFlag) {
        this.resultFlag = resultFlag;
    }


    /**
     * Gets the minAmount value for this DoCheckDepositAmountResponse.
     * 
     * @return minAmount
     */
    public java.lang.Long getMinAmount() {
        return minAmount;
    }


    /**
     * Sets the minAmount value for this DoCheckDepositAmountResponse.
     * 
     * @param minAmount
     */
    public void setMinAmount(java.lang.Long minAmount) {
        this.minAmount = minAmount;
    }


    /**
     * Gets the maxAmount value for this DoCheckDepositAmountResponse.
     * 
     * @return maxAmount
     */
    public java.lang.Long getMaxAmount() {
        return maxAmount;
    }


    /**
     * Sets the maxAmount value for this DoCheckDepositAmountResponse.
     * 
     * @param maxAmount
     */
    public void setMaxAmount(java.lang.Long maxAmount) {
        this.maxAmount = maxAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoCheckDepositAmountResponse)) return false;
        DoCheckDepositAmountResponse other = (DoCheckDepositAmountResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.resultFlag==null && other.getResultFlag()==null) || 
             (this.resultFlag!=null &&
              this.resultFlag.equals(other.getResultFlag()))) &&
            ((this.minAmount==null && other.getMinAmount()==null) || 
             (this.minAmount!=null &&
              this.minAmount.equals(other.getMinAmount()))) &&
            ((this.maxAmount==null && other.getMaxAmount()==null) || 
             (this.maxAmount!=null &&
              this.maxAmount.equals(other.getMaxAmount())));
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
        if (getResultFlag() != null) {
            _hashCode += getResultFlag().hashCode();
        }
        if (getMinAmount() != null) {
            _hashCode += getMinAmount().hashCode();
        }
        if (getMaxAmount() != null) {
            _hashCode += getMaxAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoCheckDepositAmountResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doCheckDepositAmountResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxAmount"));
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
