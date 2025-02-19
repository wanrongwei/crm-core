/**
 * SAdjustFinesReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class SAdjustFinesReq  implements java.io.Serializable {
    private java.lang.Long resourceId;

    private java.lang.Long acctId;

    private com.asiainfo.crm.cm.dk.ws.imswrapservice.SAmountDetailInfo[] sAmountDetailInfo;

    public SAdjustFinesReq() {
    }

    public SAdjustFinesReq(
           java.lang.Long resourceId,
           java.lang.Long acctId,
           com.asiainfo.crm.cm.dk.ws.imswrapservice.SAmountDetailInfo[] sAmountDetailInfo) {
           this.resourceId = resourceId;
           this.acctId = acctId;
           this.sAmountDetailInfo = sAmountDetailInfo;
    }


    /**
     * Gets the resourceId value for this SAdjustFinesReq.
     * 
     * @return resourceId
     */
    public java.lang.Long getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this SAdjustFinesReq.
     * 
     * @param resourceId
     */
    public void setResourceId(java.lang.Long resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * Gets the acctId value for this SAdjustFinesReq.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SAdjustFinesReq.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the sAmountDetailInfo value for this SAdjustFinesReq.
     * 
     * @return sAmountDetailInfo
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapservice.SAmountDetailInfo[] getSAmountDetailInfo() {
        return sAmountDetailInfo;
    }


    /**
     * Sets the sAmountDetailInfo value for this SAdjustFinesReq.
     * 
     * @param sAmountDetailInfo
     */
    public void setSAmountDetailInfo(com.asiainfo.crm.cm.dk.ws.imswrapservice.SAmountDetailInfo[] sAmountDetailInfo) {
        this.sAmountDetailInfo = sAmountDetailInfo;
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapservice.SAmountDetailInfo getSAmountDetailInfo(int i) {
        return this.sAmountDetailInfo[i];
    }

    public void setSAmountDetailInfo(int i, com.asiainfo.crm.cm.dk.ws.imswrapservice.SAmountDetailInfo _value) {
        this.sAmountDetailInfo[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SAdjustFinesReq)) return false;
        SAdjustFinesReq other = (SAdjustFinesReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resourceId==null && other.getResourceId()==null) || 
             (this.resourceId!=null &&
              this.resourceId.equals(other.getResourceId()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.sAmountDetailInfo==null && other.getSAmountDetailInfo()==null) || 
             (this.sAmountDetailInfo!=null &&
              java.util.Arrays.equals(this.sAmountDetailInfo, other.getSAmountDetailInfo())));
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
        if (getResourceId() != null) {
            _hashCode += getResourceId().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getSAmountDetailInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSAmountDetailInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSAmountDetailInfo(), i);
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
        new org.apache.axis.description.TypeDesc(SAdjustFinesReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAdjustFinesReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("SAmountDetailInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sAmountDetailInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAmountDetailInfo"));
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
