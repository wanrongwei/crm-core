/**
 * SPrintOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class SPrintOut  implements java.io.Serializable {
    private java.lang.String receiptNbr;

    private java.lang.String receiptDate;

    private java.lang.String receiptTxt;

    private java.lang.Long acctId;

    private java.lang.String outerAcctId;

    public SPrintOut() {
    }

    public SPrintOut(
           java.lang.String receiptNbr,
           java.lang.String receiptDate,
           java.lang.String receiptTxt,
           java.lang.Long acctId,
           java.lang.String outerAcctId) {
           this.receiptNbr = receiptNbr;
           this.receiptDate = receiptDate;
           this.receiptTxt = receiptTxt;
           this.acctId = acctId;
           this.outerAcctId = outerAcctId;
    }


    /**
     * Gets the receiptNbr value for this SPrintOut.
     * 
     * @return receiptNbr
     */
    public java.lang.String getReceiptNbr() {
        return receiptNbr;
    }


    /**
     * Sets the receiptNbr value for this SPrintOut.
     * 
     * @param receiptNbr
     */
    public void setReceiptNbr(java.lang.String receiptNbr) {
        this.receiptNbr = receiptNbr;
    }


    /**
     * Gets the receiptDate value for this SPrintOut.
     * 
     * @return receiptDate
     */
    public java.lang.String getReceiptDate() {
        return receiptDate;
    }


    /**
     * Sets the receiptDate value for this SPrintOut.
     * 
     * @param receiptDate
     */
    public void setReceiptDate(java.lang.String receiptDate) {
        this.receiptDate = receiptDate;
    }


    /**
     * Gets the receiptTxt value for this SPrintOut.
     * 
     * @return receiptTxt
     */
    public java.lang.String getReceiptTxt() {
        return receiptTxt;
    }


    /**
     * Sets the receiptTxt value for this SPrintOut.
     * 
     * @param receiptTxt
     */
    public void setReceiptTxt(java.lang.String receiptTxt) {
        this.receiptTxt = receiptTxt;
    }


    /**
     * Gets the acctId value for this SPrintOut.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SPrintOut.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the outerAcctId value for this SPrintOut.
     * 
     * @return outerAcctId
     */
    public java.lang.String getOuterAcctId() {
        return outerAcctId;
    }


    /**
     * Sets the outerAcctId value for this SPrintOut.
     * 
     * @param outerAcctId
     */
    public void setOuterAcctId(java.lang.String outerAcctId) {
        this.outerAcctId = outerAcctId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SPrintOut)) return false;
        SPrintOut other = (SPrintOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.receiptNbr==null && other.getReceiptNbr()==null) || 
             (this.receiptNbr!=null &&
              this.receiptNbr.equals(other.getReceiptNbr()))) &&
            ((this.receiptDate==null && other.getReceiptDate()==null) || 
             (this.receiptDate!=null &&
              this.receiptDate.equals(other.getReceiptDate()))) &&
            ((this.receiptTxt==null && other.getReceiptTxt()==null) || 
             (this.receiptTxt!=null &&
              this.receiptTxt.equals(other.getReceiptTxt()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.outerAcctId==null && other.getOuterAcctId()==null) || 
             (this.outerAcctId!=null &&
              this.outerAcctId.equals(other.getOuterAcctId())));
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
        if (getReceiptNbr() != null) {
            _hashCode += getReceiptNbr().hashCode();
        }
        if (getReceiptDate() != null) {
            _hashCode += getReceiptDate().hashCode();
        }
        if (getReceiptTxt() != null) {
            _hashCode += getReceiptTxt().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getOuterAcctId() != null) {
            _hashCode += getOuterAcctId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SPrintOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPrintOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiptNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiptDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptTxt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiptTxt"));
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
