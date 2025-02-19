/**
 * SQueryProductBillAttrReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class SQueryProductBillAttrReq  implements java.io.Serializable {
    private java.lang.Integer billFormatId;

    private java.lang.Long mailCode;

    private java.lang.Integer copyBillAddressCount;

    public SQueryProductBillAttrReq() {
    }

    public SQueryProductBillAttrReq(
           java.lang.Integer billFormatId,
           java.lang.Long mailCode,
           java.lang.Integer copyBillAddressCount) {
           this.billFormatId = billFormatId;
           this.mailCode = mailCode;
           this.copyBillAddressCount = copyBillAddressCount;
    }


    /**
     * Gets the billFormatId value for this SQueryProductBillAttrReq.
     * 
     * @return billFormatId
     */
    public java.lang.Integer getBillFormatId() {
        return billFormatId;
    }


    /**
     * Sets the billFormatId value for this SQueryProductBillAttrReq.
     * 
     * @param billFormatId
     */
    public void setBillFormatId(java.lang.Integer billFormatId) {
        this.billFormatId = billFormatId;
    }


    /**
     * Gets the mailCode value for this SQueryProductBillAttrReq.
     * 
     * @return mailCode
     */
    public java.lang.Long getMailCode() {
        return mailCode;
    }


    /**
     * Sets the mailCode value for this SQueryProductBillAttrReq.
     * 
     * @param mailCode
     */
    public void setMailCode(java.lang.Long mailCode) {
        this.mailCode = mailCode;
    }


    /**
     * Gets the copyBillAddressCount value for this SQueryProductBillAttrReq.
     * 
     * @return copyBillAddressCount
     */
    public java.lang.Integer getCopyBillAddressCount() {
        return copyBillAddressCount;
    }


    /**
     * Sets the copyBillAddressCount value for this SQueryProductBillAttrReq.
     * 
     * @param copyBillAddressCount
     */
    public void setCopyBillAddressCount(java.lang.Integer copyBillAddressCount) {
        this.copyBillAddressCount = copyBillAddressCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SQueryProductBillAttrReq)) return false;
        SQueryProductBillAttrReq other = (SQueryProductBillAttrReq) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billFormatId==null && other.getBillFormatId()==null) || 
             (this.billFormatId!=null &&
              this.billFormatId.equals(other.getBillFormatId()))) &&
            ((this.mailCode==null && other.getMailCode()==null) || 
             (this.mailCode!=null &&
              this.mailCode.equals(other.getMailCode()))) &&
            ((this.copyBillAddressCount==null && other.getCopyBillAddressCount()==null) || 
             (this.copyBillAddressCount!=null &&
              this.copyBillAddressCount.equals(other.getCopyBillAddressCount())));
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
        if (getBillFormatId() != null) {
            _hashCode += getBillFormatId().hashCode();
        }
        if (getMailCode() != null) {
            _hashCode += getMailCode().hashCode();
        }
        if (getCopyBillAddressCount() != null) {
            _hashCode += getCopyBillAddressCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SQueryProductBillAttrReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryProductBillAttrReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billFormatId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billFormatId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mailCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copyBillAddressCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "copyBillAddressCount"));
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
