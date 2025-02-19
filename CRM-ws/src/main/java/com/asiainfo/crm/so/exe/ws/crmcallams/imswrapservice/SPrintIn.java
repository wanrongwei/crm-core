/**
 * SPrintIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SPrintIn  implements java.io.Serializable {
    private java.lang.Long billSoNbr;

    private java.lang.String billSoDate;

    private java.lang.Long acctId;

    private java.lang.String outerAcctId;

    private java.lang.Integer specId;

    private java.lang.Long outSoNbr;

    public SPrintIn() {
    }

    public SPrintIn(
           java.lang.Long billSoNbr,
           java.lang.String billSoDate,
           java.lang.Long acctId,
           java.lang.String outerAcctId,
           java.lang.Integer specId,
           java.lang.Long outSoNbr) {
           this.billSoNbr = billSoNbr;
           this.billSoDate = billSoDate;
           this.acctId = acctId;
           this.outerAcctId = outerAcctId;
           this.specId = specId;
           this.outSoNbr = outSoNbr;
    }


    /**
     * Gets the billSoNbr value for this SPrintIn.
     * 
     * @return billSoNbr
     */
    public java.lang.Long getBillSoNbr() {
        return billSoNbr;
    }


    /**
     * Sets the billSoNbr value for this SPrintIn.
     * 
     * @param billSoNbr
     */
    public void setBillSoNbr(java.lang.Long billSoNbr) {
        this.billSoNbr = billSoNbr;
    }


    /**
     * Gets the billSoDate value for this SPrintIn.
     * 
     * @return billSoDate
     */
    public java.lang.String getBillSoDate() {
        return billSoDate;
    }


    /**
     * Sets the billSoDate value for this SPrintIn.
     * 
     * @param billSoDate
     */
    public void setBillSoDate(java.lang.String billSoDate) {
        this.billSoDate = billSoDate;
    }


    /**
     * Gets the acctId value for this SPrintIn.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SPrintIn.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the outerAcctId value for this SPrintIn.
     * 
     * @return outerAcctId
     */
    public java.lang.String getOuterAcctId() {
        return outerAcctId;
    }


    /**
     * Sets the outerAcctId value for this SPrintIn.
     * 
     * @param outerAcctId
     */
    public void setOuterAcctId(java.lang.String outerAcctId) {
        this.outerAcctId = outerAcctId;
    }


    /**
     * Gets the specId value for this SPrintIn.
     * 
     * @return specId
     */
    public java.lang.Integer getSpecId() {
        return specId;
    }


    /**
     * Sets the specId value for this SPrintIn.
     * 
     * @param specId
     */
    public void setSpecId(java.lang.Integer specId) {
        this.specId = specId;
    }


    /**
     * Gets the outSoNbr value for this SPrintIn.
     * 
     * @return outSoNbr
     */
    public java.lang.Long getOutSoNbr() {
        return outSoNbr;
    }


    /**
     * Sets the outSoNbr value for this SPrintIn.
     * 
     * @param outSoNbr
     */
    public void setOutSoNbr(java.lang.Long outSoNbr) {
        this.outSoNbr = outSoNbr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SPrintIn)) return false;
        SPrintIn other = (SPrintIn) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billSoNbr==null && other.getBillSoNbr()==null) || 
             (this.billSoNbr!=null &&
              this.billSoNbr.equals(other.getBillSoNbr()))) &&
            ((this.billSoDate==null && other.getBillSoDate()==null) || 
             (this.billSoDate!=null &&
              this.billSoDate.equals(other.getBillSoDate()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.outerAcctId==null && other.getOuterAcctId()==null) || 
             (this.outerAcctId!=null &&
              this.outerAcctId.equals(other.getOuterAcctId()))) &&
            ((this.specId==null && other.getSpecId()==null) || 
             (this.specId!=null &&
              this.specId.equals(other.getSpecId()))) &&
            ((this.outSoNbr==null && other.getOutSoNbr()==null) || 
             (this.outSoNbr!=null &&
              this.outSoNbr.equals(other.getOutSoNbr())));
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
        if (getBillSoNbr() != null) {
            _hashCode += getBillSoNbr().hashCode();
        }
        if (getBillSoDate() != null) {
            _hashCode += getBillSoDate().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getOuterAcctId() != null) {
            _hashCode += getOuterAcctId().hashCode();
        }
        if (getSpecId() != null) {
            _hashCode += getSpecId().hashCode();
        }
        if (getOutSoNbr() != null) {
            _hashCode += getOutSoNbr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SPrintIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPrintIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billSoNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billSoNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billSoDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billSoDate"));
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
        elemField.setFieldName("outerAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "specId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outSoNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outSoNbr"));
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
