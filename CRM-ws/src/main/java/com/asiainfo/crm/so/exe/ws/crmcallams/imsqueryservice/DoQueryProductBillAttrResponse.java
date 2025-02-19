/**
 * DoQueryProductBillAttrResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice;

public class DoQueryProductBillAttrResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private java.lang.Integer productOfferingId;

    private java.lang.String productOfferingName;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.SProductRecurringFee[] feeList;

    public DoQueryProductBillAttrResponse() {
    }

    public DoQueryProductBillAttrResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.ResponseHead responseHead,
           java.lang.Integer productOfferingId,
           java.lang.String productOfferingName,
           com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.SProductRecurringFee[] feeList) {
        super(
            responseHead);
        this.productOfferingId = productOfferingId;
        this.productOfferingName = productOfferingName;
        this.feeList = feeList;
    }


    /**
     * Gets the productOfferingId value for this DoQueryProductBillAttrResponse.
     * 
     * @return productOfferingId
     */
    public java.lang.Integer getProductOfferingId() {
        return productOfferingId;
    }


    /**
     * Sets the productOfferingId value for this DoQueryProductBillAttrResponse.
     * 
     * @param productOfferingId
     */
    public void setProductOfferingId(java.lang.Integer productOfferingId) {
        this.productOfferingId = productOfferingId;
    }


    /**
     * Gets the productOfferingName value for this DoQueryProductBillAttrResponse.
     * 
     * @return productOfferingName
     */
    public java.lang.String getProductOfferingName() {
        return productOfferingName;
    }


    /**
     * Sets the productOfferingName value for this DoQueryProductBillAttrResponse.
     * 
     * @param productOfferingName
     */
    public void setProductOfferingName(java.lang.String productOfferingName) {
        this.productOfferingName = productOfferingName;
    }


    /**
     * Gets the feeList value for this DoQueryProductBillAttrResponse.
     * 
     * @return feeList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.SProductRecurringFee[] getFeeList() {
        return feeList;
    }


    /**
     * Sets the feeList value for this DoQueryProductBillAttrResponse.
     * 
     * @param feeList
     */
    public void setFeeList(com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.SProductRecurringFee[] feeList) {
        this.feeList = feeList;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.SProductRecurringFee getFeeList(int i) {
        return this.feeList[i];
    }

    public void setFeeList(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice.SProductRecurringFee _value) {
        this.feeList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
    	if (obj == null) return false;
        if (!(obj instanceof DoQueryProductBillAttrResponse)) return false;
        DoQueryProductBillAttrResponse other = (DoQueryProductBillAttrResponse) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.productOfferingId==null && other.getProductOfferingId()==null) || 
             (this.productOfferingId!=null &&
              this.productOfferingId.equals(other.getProductOfferingId()))) &&
            ((this.productOfferingName==null && other.getProductOfferingName()==null) || 
             (this.productOfferingName!=null &&
              this.productOfferingName.equals(other.getProductOfferingName()))) &&
            ((this.feeList==null && other.getFeeList()==null) || 
             (this.feeList!=null &&
              java.util.Arrays.equals(this.feeList, other.getFeeList())));
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
        if (getProductOfferingId() != null) {
            _hashCode += getProductOfferingId().hashCode();
        }
        if (getProductOfferingName() != null) {
            _hashCode += getProductOfferingName().hashCode();
        }
        if (getFeeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeeList(), i);
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
        new org.apache.axis.description.TypeDesc(DoQueryProductBillAttrResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryProductBillAttrResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productOfferingId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productOfferingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productOfferingName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productOfferingName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductRecurringFee"));
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
