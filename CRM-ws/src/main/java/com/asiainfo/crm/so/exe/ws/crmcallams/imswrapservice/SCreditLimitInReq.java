/**
 * SCreditLimitInReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SCreditLimitInReq  implements java.io.Serializable {
    private java.lang.Long acctId;

    private int creditItem;

    private java.lang.Long credit;

    private java.lang.Integer mesureId;

    public SCreditLimitInReq() {
    }

    public SCreditLimitInReq(
           java.lang.Long acctId,
           int creditItem,
           java.lang.Long credit,
           java.lang.Integer mesureId) {
           this.acctId = acctId;
           this.creditItem = creditItem;
           this.credit = credit;
           this.mesureId = mesureId;
    }


    /**
     * Gets the acctId value for this SCreditLimitInReq.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SCreditLimitInReq.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the creditItem value for this SCreditLimitInReq.
     * 
     * @return creditItem
     */
    public int getCreditItem() {
        return creditItem;
    }


    /**
     * Sets the creditItem value for this SCreditLimitInReq.
     * 
     * @param creditItem
     */
    public void setCreditItem(int creditItem) {
        this.creditItem = creditItem;
    }


    /**
     * Gets the credit value for this SCreditLimitInReq.
     * 
     * @return credit
     */
    public java.lang.Long getCredit() {
        return credit;
    }


    /**
     * Sets the credit value for this SCreditLimitInReq.
     * 
     * @param credit
     */
    public void setCredit(java.lang.Long credit) {
        this.credit = credit;
    }


    /**
     * Gets the mesureId value for this SCreditLimitInReq.
     * 
     * @return mesureId
     */
    public java.lang.Integer getMesureId() {
        return mesureId;
    }


    /**
     * Sets the mesureId value for this SCreditLimitInReq.
     * 
     * @param mesureId
     */
    public void setMesureId(java.lang.Integer mesureId) {
        this.mesureId = mesureId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SCreditLimitInReq)) return false;
        SCreditLimitInReq other = (SCreditLimitInReq) obj;
        
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
            this.creditItem == other.getCreditItem() &&
            ((this.credit==null && other.getCredit()==null) || 
             (this.credit!=null &&
              this.credit.equals(other.getCredit()))) &&
            ((this.mesureId==null && other.getMesureId()==null) || 
             (this.mesureId!=null &&
              this.mesureId.equals(other.getMesureId())));
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
        _hashCode += getCreditItem();
        if (getCredit() != null) {
            _hashCode += getCredit().hashCode();
        }
        if (getMesureId() != null) {
            _hashCode += getMesureId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SCreditLimitInReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCreditLimitInReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditItem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "credit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mesureId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mesureId"));
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
