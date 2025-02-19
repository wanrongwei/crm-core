/**
 * DoEtopupResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class DoEtopupResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CrmBaseResponse  implements java.io.Serializable {
    private java.lang.String balance;

    private java.lang.String activestop;

    private java.lang.Long value;

    private java.lang.Long valueadd;

    private java.lang.String validity;

    private java.lang.Long validityadd;

    public DoEtopupResponse() {
    }

    public DoEtopupResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ResponseHead responseHead,
           java.lang.String balance,
           java.lang.String activestop,
           java.lang.Long value,
           java.lang.Long valueadd,
           java.lang.String validity,
           java.lang.Long validityadd) {
        super(
            responseHead);
        this.balance = balance;
        this.activestop = activestop;
        this.value = value;
        this.valueadd = valueadd;
        this.validity = validity;
        this.validityadd = validityadd;
    }


    /**
     * Gets the balance value for this DoEtopupResponse.
     * 
     * @return balance
     */
    public java.lang.String getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this DoEtopupResponse.
     * 
     * @param balance
     */
    public void setBalance(java.lang.String balance) {
        this.balance = balance;
    }


    /**
     * Gets the activestop value for this DoEtopupResponse.
     * 
     * @return activestop
     */
    public java.lang.String getActivestop() {
        return activestop;
    }


    /**
     * Sets the activestop value for this DoEtopupResponse.
     * 
     * @param activestop
     */
    public void setActivestop(java.lang.String activestop) {
        this.activestop = activestop;
    }


    /**
     * Gets the value value for this DoEtopupResponse.
     * 
     * @return value
     */
    public java.lang.Long getValue() {
        return value;
    }


    /**
     * Sets the value value for this DoEtopupResponse.
     * 
     * @param value
     */
    public void setValue(java.lang.Long value) {
        this.value = value;
    }


    /**
     * Gets the valueadd value for this DoEtopupResponse.
     * 
     * @return valueadd
     */
    public java.lang.Long getValueadd() {
        return valueadd;
    }


    /**
     * Sets the valueadd value for this DoEtopupResponse.
     * 
     * @param valueadd
     */
    public void setValueadd(java.lang.Long valueadd) {
        this.valueadd = valueadd;
    }


    /**
     * Gets the validity value for this DoEtopupResponse.
     * 
     * @return validity
     */
    public java.lang.String getValidity() {
        return validity;
    }


    /**
     * Sets the validity value for this DoEtopupResponse.
     * 
     * @param validity
     */
    public void setValidity(java.lang.String validity) {
        this.validity = validity;
    }


    /**
     * Gets the validityadd value for this DoEtopupResponse.
     * 
     * @return validityadd
     */
    public java.lang.Long getValidityadd() {
        return validityadd;
    }


    /**
     * Sets the validityadd value for this DoEtopupResponse.
     * 
     * @param validityadd
     */
    public void setValidityadd(java.lang.Long validityadd) {
        this.validityadd = validityadd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoEtopupResponse)) return false;
        DoEtopupResponse other = (DoEtopupResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            ((this.activestop==null && other.getActivestop()==null) || 
             (this.activestop!=null &&
              this.activestop.equals(other.getActivestop()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.valueadd==null && other.getValueadd()==null) || 
             (this.valueadd!=null &&
              this.valueadd.equals(other.getValueadd()))) &&
            ((this.validity==null && other.getValidity()==null) || 
             (this.validity!=null &&
              this.validity.equals(other.getValidity()))) &&
            ((this.validityadd==null && other.getValidityadd()==null) || 
             (this.validityadd!=null &&
              this.validityadd.equals(other.getValidityadd())));
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
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        if (getActivestop() != null) {
            _hashCode += getActivestop().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getValueadd() != null) {
            _hashCode += getValueadd().hashCode();
        }
        if (getValidity() != null) {
            _hashCode += getValidity().hashCode();
        }
        if (getValidityadd() != null) {
            _hashCode += getValidityadd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoEtopupResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doEtopupResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activestop");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activestop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueadd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valueadd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validityadd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validityadd"));
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
