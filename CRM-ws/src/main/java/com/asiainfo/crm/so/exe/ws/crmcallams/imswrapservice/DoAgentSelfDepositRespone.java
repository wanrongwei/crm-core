/**
 * DoAgentSelfDepositRespone.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class DoAgentSelfDepositRespone  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CrmBaseResponse  implements java.io.Serializable {
    private java.lang.Long soNbr;

    private java.util.Calendar soDate;

    private java.lang.Long balance;

    private java.lang.Integer measureId;

    public DoAgentSelfDepositRespone() {
    }

    public DoAgentSelfDepositRespone(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ResponseHead responseHead,
           java.lang.Long soNbr,
           java.util.Calendar soDate,
           java.lang.Long balance,
           java.lang.Integer measureId) {
        super(
            responseHead);
        this.soNbr = soNbr;
        this.soDate = soDate;
        this.balance = balance;
        this.measureId = measureId;
    }


    /**
     * Gets the soNbr value for this DoAgentSelfDepositRespone.
     * 
     * @return soNbr
     */
    public java.lang.Long getSoNbr() {
        return soNbr;
    }


    /**
     * Sets the soNbr value for this DoAgentSelfDepositRespone.
     * 
     * @param soNbr
     */
    public void setSoNbr(java.lang.Long soNbr) {
        this.soNbr = soNbr;
    }


    /**
     * Gets the soDate value for this DoAgentSelfDepositRespone.
     * 
     * @return soDate
     */
    public java.util.Calendar getSoDate() {
        return soDate;
    }


    /**
     * Sets the soDate value for this DoAgentSelfDepositRespone.
     * 
     * @param soDate
     */
    public void setSoDate(java.util.Calendar soDate) {
        this.soDate = soDate;
    }


    /**
     * Gets the balance value for this DoAgentSelfDepositRespone.
     * 
     * @return balance
     */
    public java.lang.Long getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this DoAgentSelfDepositRespone.
     * 
     * @param balance
     */
    public void setBalance(java.lang.Long balance) {
        this.balance = balance;
    }


    /**
     * Gets the measureId value for this DoAgentSelfDepositRespone.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this DoAgentSelfDepositRespone.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoAgentSelfDepositRespone)) return false;
        DoAgentSelfDepositRespone other = (DoAgentSelfDepositRespone) obj;
        
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
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
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
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoAgentSelfDepositRespone.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAgentSelfDepositRespone"));
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
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
