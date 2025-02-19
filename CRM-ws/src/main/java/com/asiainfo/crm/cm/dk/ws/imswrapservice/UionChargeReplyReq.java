/**
 * UionChargeReplyReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class UionChargeReplyReq  implements java.io.Serializable {
    private java.lang.Long acctId;

    private java.lang.String phoneId;

    private java.lang.Long totalAmount;

    private java.lang.Integer measureId;

    private java.lang.Long soNbr;

    private java.lang.String soDate;

    private com.asiainfo.crm.cm.dk.ws.imswrapservice.PayInfo[] payInfoList;

    public UionChargeReplyReq() {
    }

    public UionChargeReplyReq(
           java.lang.Long acctId,
           java.lang.String phoneId,
           java.lang.Long totalAmount,
           java.lang.Integer measureId,
           java.lang.Long soNbr,
           java.lang.String soDate,
           com.asiainfo.crm.cm.dk.ws.imswrapservice.PayInfo[] payInfoList) {
           this.acctId = acctId;
           this.phoneId = phoneId;
           this.totalAmount = totalAmount;
           this.measureId = measureId;
           this.soNbr = soNbr;
           this.soDate = soDate;
           this.payInfoList = payInfoList;
    }


    /**
     * Gets the acctId value for this UionChargeReplyReq.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this UionChargeReplyReq.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the phoneId value for this UionChargeReplyReq.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this UionChargeReplyReq.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the totalAmount value for this UionChargeReplyReq.
     * 
     * @return totalAmount
     */
    public java.lang.Long getTotalAmount() {
        return totalAmount;
    }


    /**
     * Sets the totalAmount value for this UionChargeReplyReq.
     * 
     * @param totalAmount
     */
    public void setTotalAmount(java.lang.Long totalAmount) {
        this.totalAmount = totalAmount;
    }


    /**
     * Gets the measureId value for this UionChargeReplyReq.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this UionChargeReplyReq.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the soNbr value for this UionChargeReplyReq.
     * 
     * @return soNbr
     */
    public java.lang.Long getSoNbr() {
        return soNbr;
    }


    /**
     * Sets the soNbr value for this UionChargeReplyReq.
     * 
     * @param soNbr
     */
    public void setSoNbr(java.lang.Long soNbr) {
        this.soNbr = soNbr;
    }


    /**
     * Gets the soDate value for this UionChargeReplyReq.
     * 
     * @return soDate
     */
    public java.lang.String getSoDate() {
        return soDate;
    }


    /**
     * Sets the soDate value for this UionChargeReplyReq.
     * 
     * @param soDate
     */
    public void setSoDate(java.lang.String soDate) {
        this.soDate = soDate;
    }


    /**
     * Gets the payInfoList value for this UionChargeReplyReq.
     * 
     * @return payInfoList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapservice.PayInfo[] getPayInfoList() {
        return payInfoList;
    }


    /**
     * Sets the payInfoList value for this UionChargeReplyReq.
     * 
     * @param payInfoList
     */
    public void setPayInfoList(com.asiainfo.crm.cm.dk.ws.imswrapservice.PayInfo[] payInfoList) {
        this.payInfoList = payInfoList;
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapservice.PayInfo getPayInfoList(int i) {
        return this.payInfoList[i];
    }

    public void setPayInfoList(int i, com.asiainfo.crm.cm.dk.ws.imswrapservice.PayInfo _value) {
        this.payInfoList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UionChargeReplyReq)) return false;
        UionChargeReplyReq other = (UionChargeReplyReq) obj;
        if (obj == null) return false;
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
            ((this.phoneId==null && other.getPhoneId()==null) || 
             (this.phoneId!=null &&
              this.phoneId.equals(other.getPhoneId()))) &&
            ((this.totalAmount==null && other.getTotalAmount()==null) || 
             (this.totalAmount!=null &&
              this.totalAmount.equals(other.getTotalAmount()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.soNbr==null && other.getSoNbr()==null) || 
             (this.soNbr!=null &&
              this.soNbr.equals(other.getSoNbr()))) &&
            ((this.soDate==null && other.getSoDate()==null) || 
             (this.soDate!=null &&
              this.soDate.equals(other.getSoDate()))) &&
            ((this.payInfoList==null && other.getPayInfoList()==null) || 
             (this.payInfoList!=null &&
              java.util.Arrays.equals(this.payInfoList, other.getPayInfoList())));
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
        if (getPhoneId() != null) {
            _hashCode += getPhoneId().hashCode();
        }
        if (getTotalAmount() != null) {
            _hashCode += getTotalAmount().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getSoNbr() != null) {
            _hashCode += getSoNbr().hashCode();
        }
        if (getSoDate() != null) {
            _hashCode += getSoDate().hashCode();
        }
        if (getPayInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayInfoList(), i);
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
        new org.apache.axis.description.TypeDesc(UionChargeReplyReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "uionChargeReplyReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("totalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalAmount"));
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
        elemField.setFieldName("payInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "payInfo"));
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
