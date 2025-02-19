/**
 * UionChargeReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class UionChargeReq  implements java.io.Serializable {
    private java.lang.Long acctId;

    private java.lang.Long amount;

    private java.lang.Integer measureId;

    private java.lang.String phoneId;

    private java.lang.Long soNbr;

    private java.lang.String soDate;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ReceiptInfo[] receiptInfoList;

    public UionChargeReq() {
    }

    public UionChargeReq(
           java.lang.Long acctId,
           java.lang.Long amount,
           java.lang.Integer measureId,
           java.lang.String phoneId,
           java.lang.Long soNbr,
           java.lang.String soDate,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ReceiptInfo[] receiptInfoList) {
           this.acctId = acctId;
           this.amount = amount;
           this.measureId = measureId;
           this.phoneId = phoneId;
           this.soNbr = soNbr;
           this.soDate = soDate;
           this.receiptInfoList = receiptInfoList;
    }


    /**
     * Gets the acctId value for this UionChargeReq.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this UionChargeReq.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the amount value for this UionChargeReq.
     * 
     * @return amount
     */
    public java.lang.Long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this UionChargeReq.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }


    /**
     * Gets the measureId value for this UionChargeReq.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this UionChargeReq.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the phoneId value for this UionChargeReq.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this UionChargeReq.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the soNbr value for this UionChargeReq.
     * 
     * @return soNbr
     */
    public java.lang.Long getSoNbr() {
        return soNbr;
    }


    /**
     * Sets the soNbr value for this UionChargeReq.
     * 
     * @param soNbr
     */
    public void setSoNbr(java.lang.Long soNbr) {
        this.soNbr = soNbr;
    }


    /**
     * Gets the soDate value for this UionChargeReq.
     * 
     * @return soDate
     */
    public java.lang.String getSoDate() {
        return soDate;
    }


    /**
     * Sets the soDate value for this UionChargeReq.
     * 
     * @param soDate
     */
    public void setSoDate(java.lang.String soDate) {
        this.soDate = soDate;
    }


    /**
     * Gets the receiptInfoList value for this UionChargeReq.
     * 
     * @return receiptInfoList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ReceiptInfo[] getReceiptInfoList() {
        return receiptInfoList;
    }


    /**
     * Sets the receiptInfoList value for this UionChargeReq.
     * 
     * @param receiptInfoList
     */
    public void setReceiptInfoList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ReceiptInfo[] receiptInfoList) {
        this.receiptInfoList = receiptInfoList;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ReceiptInfo getReceiptInfoList(int i) {
        return this.receiptInfoList[i];
    }

    public void setReceiptInfoList(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ReceiptInfo _value) {
        this.receiptInfoList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UionChargeReq)) return false;
        UionChargeReq other = (UionChargeReq) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.phoneId==null && other.getPhoneId()==null) || 
             (this.phoneId!=null &&
              this.phoneId.equals(other.getPhoneId()))) &&
            ((this.soNbr==null && other.getSoNbr()==null) || 
             (this.soNbr!=null &&
              this.soNbr.equals(other.getSoNbr()))) &&
            ((this.soDate==null && other.getSoDate()==null) || 
             (this.soDate!=null &&
              this.soDate.equals(other.getSoDate()))) &&
            ((this.receiptInfoList==null && other.getReceiptInfoList()==null) || 
             (this.receiptInfoList!=null &&
              java.util.Arrays.equals(this.receiptInfoList, other.getReceiptInfoList())));
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
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getPhoneId() != null) {
            _hashCode += getPhoneId().hashCode();
        }
        if (getSoNbr() != null) {
            _hashCode += getSoNbr().hashCode();
        }
        if (getSoDate() != null) {
            _hashCode += getSoDate().hashCode();
        }
        if (getReceiptInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReceiptInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReceiptInfoList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UionChargeReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "uionChargeReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("measureId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measureId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("soNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "soNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "soDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiptInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "receiptInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
