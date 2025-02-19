/**
 * AcctStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class AcctStatus  implements java.io.Serializable {
    private java.lang.Integer displaySts;

    private java.lang.Integer billSts;

    private java.lang.Integer acctSts;

    private java.lang.Integer caFlag;

    private java.lang.Integer writeoffFlag;

    private java.lang.Long limitAmount;

    private java.lang.Integer disableLimit;

    private java.lang.Integer cycleSts;

    private java.lang.Long acctId;

    private java.lang.Integer guaranteeFlag;

    public AcctStatus() {
    }

    public AcctStatus(
           java.lang.Integer displaySts,
           java.lang.Integer billSts,
           java.lang.Integer acctSts,
           java.lang.Integer caFlag,
           java.lang.Integer writeoffFlag,
           java.lang.Long limitAmount,
           java.lang.Integer disableLimit,
           java.lang.Integer cycleSts,
           java.lang.Long acctId,
           java.lang.Integer guaranteeFlag) {
           this.displaySts = displaySts;
           this.billSts = billSts;
           this.acctSts = acctSts;
           this.caFlag = caFlag;
           this.writeoffFlag = writeoffFlag;
           this.limitAmount = limitAmount;
           this.disableLimit = disableLimit;
           this.cycleSts = cycleSts;
           this.acctId = acctId;
           this.guaranteeFlag = guaranteeFlag;
    }


    /**
     * Gets the displaySts value for this AcctStatus.
     * 
     * @return displaySts
     */
    public java.lang.Integer getDisplaySts() {
        return displaySts;
    }


    /**
     * Sets the displaySts value for this AcctStatus.
     * 
     * @param displaySts
     */
    public void setDisplaySts(java.lang.Integer displaySts) {
        this.displaySts = displaySts;
    }


    /**
     * Gets the billSts value for this AcctStatus.
     * 
     * @return billSts
     */
    public java.lang.Integer getBillSts() {
        return billSts;
    }


    /**
     * Sets the billSts value for this AcctStatus.
     * 
     * @param billSts
     */
    public void setBillSts(java.lang.Integer billSts) {
        this.billSts = billSts;
    }


    /**
     * Gets the acctSts value for this AcctStatus.
     * 
     * @return acctSts
     */
    public java.lang.Integer getAcctSts() {
        return acctSts;
    }


    /**
     * Sets the acctSts value for this AcctStatus.
     * 
     * @param acctSts
     */
    public void setAcctSts(java.lang.Integer acctSts) {
        this.acctSts = acctSts;
    }


    /**
     * Gets the caFlag value for this AcctStatus.
     * 
     * @return caFlag
     */
    public java.lang.Integer getCaFlag() {
        return caFlag;
    }


    /**
     * Sets the caFlag value for this AcctStatus.
     * 
     * @param caFlag
     */
    public void setCaFlag(java.lang.Integer caFlag) {
        this.caFlag = caFlag;
    }


    /**
     * Gets the writeoffFlag value for this AcctStatus.
     * 
     * @return writeoffFlag
     */
    public java.lang.Integer getWriteoffFlag() {
        return writeoffFlag;
    }


    /**
     * Sets the writeoffFlag value for this AcctStatus.
     * 
     * @param writeoffFlag
     */
    public void setWriteoffFlag(java.lang.Integer writeoffFlag) {
        this.writeoffFlag = writeoffFlag;
    }


    /**
     * Gets the limitAmount value for this AcctStatus.
     * 
     * @return limitAmount
     */
    public java.lang.Long getLimitAmount() {
        return limitAmount;
    }


    /**
     * Sets the limitAmount value for this AcctStatus.
     * 
     * @param limitAmount
     */
    public void setLimitAmount(java.lang.Long limitAmount) {
        this.limitAmount = limitAmount;
    }


    /**
     * Gets the disableLimit value for this AcctStatus.
     * 
     * @return disableLimit
     */
    public java.lang.Integer getDisableLimit() {
        return disableLimit;
    }


    /**
     * Sets the disableLimit value for this AcctStatus.
     * 
     * @param disableLimit
     */
    public void setDisableLimit(java.lang.Integer disableLimit) {
        this.disableLimit = disableLimit;
    }


    /**
     * Gets the cycleSts value for this AcctStatus.
     * 
     * @return cycleSts
     */
    public java.lang.Integer getCycleSts() {
        return cycleSts;
    }


    /**
     * Sets the cycleSts value for this AcctStatus.
     * 
     * @param cycleSts
     */
    public void setCycleSts(java.lang.Integer cycleSts) {
        this.cycleSts = cycleSts;
    }


    /**
     * Gets the acctId value for this AcctStatus.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this AcctStatus.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the guaranteeFlag value for this AcctStatus.
     * 
     * @return guaranteeFlag
     */
    public java.lang.Integer getGuaranteeFlag() {
        return guaranteeFlag;
    }


    /**
     * Sets the guaranteeFlag value for this AcctStatus.
     * 
     * @param guaranteeFlag
     */
    public void setGuaranteeFlag(java.lang.Integer guaranteeFlag) {
        this.guaranteeFlag = guaranteeFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AcctStatus)) return false;
        AcctStatus other = (AcctStatus) obj;
       
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.displaySts==null && other.getDisplaySts()==null) || 
             (this.displaySts!=null &&
              this.displaySts.equals(other.getDisplaySts()))) &&
            ((this.billSts==null && other.getBillSts()==null) || 
             (this.billSts!=null &&
              this.billSts.equals(other.getBillSts()))) &&
            ((this.acctSts==null && other.getAcctSts()==null) || 
             (this.acctSts!=null &&
              this.acctSts.equals(other.getAcctSts()))) &&
            ((this.caFlag==null && other.getCaFlag()==null) || 
             (this.caFlag!=null &&
              this.caFlag.equals(other.getCaFlag()))) &&
            ((this.writeoffFlag==null && other.getWriteoffFlag()==null) || 
             (this.writeoffFlag!=null &&
              this.writeoffFlag.equals(other.getWriteoffFlag()))) &&
            ((this.limitAmount==null && other.getLimitAmount()==null) || 
             (this.limitAmount!=null &&
              this.limitAmount.equals(other.getLimitAmount()))) &&
            ((this.disableLimit==null && other.getDisableLimit()==null) || 
             (this.disableLimit!=null &&
              this.disableLimit.equals(other.getDisableLimit()))) &&
            ((this.cycleSts==null && other.getCycleSts()==null) || 
             (this.cycleSts!=null &&
              this.cycleSts.equals(other.getCycleSts()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.guaranteeFlag==null && other.getGuaranteeFlag()==null) || 
             (this.guaranteeFlag!=null &&
              this.guaranteeFlag.equals(other.getGuaranteeFlag())));
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
        if (getDisplaySts() != null) {
            _hashCode += getDisplaySts().hashCode();
        }
        if (getBillSts() != null) {
            _hashCode += getBillSts().hashCode();
        }
        if (getAcctSts() != null) {
            _hashCode += getAcctSts().hashCode();
        }
        if (getCaFlag() != null) {
            _hashCode += getCaFlag().hashCode();
        }
        if (getWriteoffFlag() != null) {
            _hashCode += getWriteoffFlag().hashCode();
        }
        if (getLimitAmount() != null) {
            _hashCode += getLimitAmount().hashCode();
        }
        if (getDisableLimit() != null) {
            _hashCode += getDisableLimit().hashCode();
        }
        if (getCycleSts() != null) {
            _hashCode += getCycleSts().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getGuaranteeFlag() != null) {
            _hashCode += getGuaranteeFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AcctStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "acctStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displaySts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "displaySts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billSts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billSts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctSts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctSts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "caFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("writeoffFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "writeoffFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "limitAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disableLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disableLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cycleSts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cycleSts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("guaranteeFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "guaranteeFlag"));
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
