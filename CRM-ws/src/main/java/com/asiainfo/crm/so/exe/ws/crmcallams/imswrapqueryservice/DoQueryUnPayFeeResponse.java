/**
 * DoQueryUnPayFeeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class DoQueryUnPayFeeResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private java.lang.Long acctId;

    private java.lang.String outerAcctId;

    private java.lang.Long unpayFee;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CaBill[] billList;

    public DoQueryUnPayFeeResponse() {
    }

    public DoQueryUnPayFeeResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ResponseHead responseHead,
           java.lang.Long acctId,
           java.lang.String outerAcctId,
           java.lang.Long unpayFee,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CaBill[] billList) {
        super(
            responseHead);
        this.acctId = acctId;
        this.outerAcctId = outerAcctId;
        this.unpayFee = unpayFee;
        this.billList = billList;
    }


    /**
     * Gets the acctId value for this DoQueryUnPayFeeResponse.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this DoQueryUnPayFeeResponse.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the outerAcctId value for this DoQueryUnPayFeeResponse.
     * 
     * @return outerAcctId
     */
    public java.lang.String getOuterAcctId() {
        return outerAcctId;
    }


    /**
     * Sets the outerAcctId value for this DoQueryUnPayFeeResponse.
     * 
     * @param outerAcctId
     */
    public void setOuterAcctId(java.lang.String outerAcctId) {
        this.outerAcctId = outerAcctId;
    }


    /**
     * Gets the unpayFee value for this DoQueryUnPayFeeResponse.
     * 
     * @return unpayFee
     */
    public java.lang.Long getUnpayFee() {
        return unpayFee;
    }


    /**
     * Sets the unpayFee value for this DoQueryUnPayFeeResponse.
     * 
     * @param unpayFee
     */
    public void setUnpayFee(java.lang.Long unpayFee) {
        this.unpayFee = unpayFee;
    }


    /**
     * Gets the billList value for this DoQueryUnPayFeeResponse.
     * 
     * @return billList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CaBill[] getBillList() {
        return billList;
    }


    /**
     * Sets the billList value for this DoQueryUnPayFeeResponse.
     * 
     * @param billList
     */
    public void setBillList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CaBill[] billList) {
        this.billList = billList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryUnPayFeeResponse)) return false;
        DoQueryUnPayFeeResponse other = (DoQueryUnPayFeeResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.outerAcctId==null && other.getOuterAcctId()==null) || 
             (this.outerAcctId!=null &&
              this.outerAcctId.equals(other.getOuterAcctId()))) &&
            ((this.unpayFee==null && other.getUnpayFee()==null) || 
             (this.unpayFee!=null &&
              this.unpayFee.equals(other.getUnpayFee()))) &&
            ((this.billList==null && other.getBillList()==null) || 
             (this.billList!=null &&
              java.util.Arrays.equals(this.billList, other.getBillList())));
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
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getOuterAcctId() != null) {
            _hashCode += getOuterAcctId().hashCode();
        }
        if (getUnpayFee() != null) {
            _hashCode += getUnpayFee().hashCode();
        }
        if (getBillList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillList(), i);
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
        new org.apache.axis.description.TypeDesc(DoQueryUnPayFeeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryUnPayFeeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("unpayFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unpayFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caBill"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "billListItem"));
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
