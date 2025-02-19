/**
 * CreditSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class CreditSummary  implements java.io.Serializable {
    private java.lang.Integer measureId;

    private java.lang.Long amount;

    private java.lang.Long tempAmount;

    private java.lang.Long usableAmount;

    public CreditSummary() {
    }

    public CreditSummary(
           java.lang.Integer measureId,
           java.lang.Long amount,
           java.lang.Long tempAmount,
           java.lang.Long usableAmount) {
           this.measureId = measureId;
           this.amount = amount;
           this.tempAmount = tempAmount;
           this.usableAmount = usableAmount;
    }


    /**
     * Gets the measureId value for this CreditSummary.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this CreditSummary.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the amount value for this CreditSummary.
     * 
     * @return amount
     */
    public java.lang.Long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this CreditSummary.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }


    /**
     * Gets the tempAmount value for this CreditSummary.
     * 
     * @return tempAmount
     */
    public java.lang.Long getTempAmount() {
        return tempAmount;
    }


    /**
     * Sets the tempAmount value for this CreditSummary.
     * 
     * @param tempAmount
     */
    public void setTempAmount(java.lang.Long tempAmount) {
        this.tempAmount = tempAmount;
    }


    /**
     * Gets the usableAmount value for this CreditSummary.
     * 
     * @return usableAmount
     */
    public java.lang.Long getUsableAmount() {
        return usableAmount;
    }


    /**
     * Sets the usableAmount value for this CreditSummary.
     * 
     * @param usableAmount
     */
    public void setUsableAmount(java.lang.Long usableAmount) {
        this.usableAmount = usableAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditSummary)) return false;
        CreditSummary other = (CreditSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.tempAmount==null && other.getTempAmount()==null) || 
             (this.tempAmount!=null &&
              this.tempAmount.equals(other.getTempAmount()))) &&
            ((this.usableAmount==null && other.getUsableAmount()==null) || 
             (this.usableAmount!=null &&
              this.usableAmount.equals(other.getUsableAmount())));
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
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getTempAmount() != null) {
            _hashCode += getTempAmount().hashCode();
        }
        if (getUsableAmount() != null) {
            _hashCode += getUsableAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "creditSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measureId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measureId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tempAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tempAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usableAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usableAmount"));
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
