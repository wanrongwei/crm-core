/**
 * SQueryRecurringAndOnetimeFeeReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class SQueryRecurringAndOnetimeFeeReq  implements java.io.Serializable {
    private java.lang.String phoneId;

    private java.lang.Long productSequenceId;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.Integer feeItem;

    public SQueryRecurringAndOnetimeFeeReq() {
    }

    public SQueryRecurringAndOnetimeFeeReq(
           java.lang.String phoneId,
           java.lang.Long productSequenceId,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.Integer feeItem) {
           this.phoneId = phoneId;
           this.productSequenceId = productSequenceId;
           this.startDate = startDate;
           this.endDate = endDate;
           this.feeItem = feeItem;
    }


    /**
     * Gets the phoneId value for this SQueryRecurringAndOnetimeFeeReq.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this SQueryRecurringAndOnetimeFeeReq.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the productSequenceId value for this SQueryRecurringAndOnetimeFeeReq.
     * 
     * @return productSequenceId
     */
    public java.lang.Long getProductSequenceId() {
        return productSequenceId;
    }


    /**
     * Sets the productSequenceId value for this SQueryRecurringAndOnetimeFeeReq.
     * 
     * @param productSequenceId
     */
    public void setProductSequenceId(java.lang.Long productSequenceId) {
        this.productSequenceId = productSequenceId;
    }


    /**
     * Gets the startDate value for this SQueryRecurringAndOnetimeFeeReq.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this SQueryRecurringAndOnetimeFeeReq.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this SQueryRecurringAndOnetimeFeeReq.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this SQueryRecurringAndOnetimeFeeReq.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the feeItem value for this SQueryRecurringAndOnetimeFeeReq.
     * 
     * @return feeItem
     */
    public java.lang.Integer getFeeItem() {
        return feeItem;
    }


    /**
     * Sets the feeItem value for this SQueryRecurringAndOnetimeFeeReq.
     * 
     * @param feeItem
     */
    public void setFeeItem(java.lang.Integer feeItem) {
        this.feeItem = feeItem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SQueryRecurringAndOnetimeFeeReq)) return false;
        SQueryRecurringAndOnetimeFeeReq other = (SQueryRecurringAndOnetimeFeeReq) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.phoneId==null && other.getPhoneId()==null) || 
             (this.phoneId!=null &&
              this.phoneId.equals(other.getPhoneId()))) &&
            ((this.productSequenceId==null && other.getProductSequenceId()==null) || 
             (this.productSequenceId!=null &&
              this.productSequenceId.equals(other.getProductSequenceId()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.feeItem==null && other.getFeeItem()==null) || 
             (this.feeItem!=null &&
              this.feeItem.equals(other.getFeeItem())));
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
        if (getPhoneId() != null) {
            _hashCode += getPhoneId().hashCode();
        }
        if (getProductSequenceId() != null) {
            _hashCode += getProductSequenceId().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getFeeItem() != null) {
            _hashCode += getFeeItem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SQueryRecurringAndOnetimeFeeReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryRecurringAndOnetimeFeeReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productSequenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productSequenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeItem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feeItem"));
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
