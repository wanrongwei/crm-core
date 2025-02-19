/**
 * BusiSpecId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class BusiSpecId  implements java.io.Serializable {
    private java.lang.Long busiSpecId;

    private java.lang.Long productId;

    private java.lang.Long productSequenceId;

    private java.lang.String channel;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    public BusiSpecId() {
    }

    public BusiSpecId(
           java.lang.Long busiSpecId,
           java.lang.Long productId,
           java.lang.Long productSequenceId,
           java.lang.String channel,
           java.util.Calendar startDate,
           java.util.Calendar endDate) {
           this.busiSpecId = busiSpecId;
           this.productId = productId;
           this.productSequenceId = productSequenceId;
           this.channel = channel;
           this.startDate = startDate;
           this.endDate = endDate;
    }


    /**
     * Gets the busiSpecId value for this BusiSpecId.
     * 
     * @return busiSpecId
     */
    public java.lang.Long getBusiSpecId() {
        return busiSpecId;
    }


    /**
     * Sets the busiSpecId value for this BusiSpecId.
     * 
     * @param busiSpecId
     */
    public void setBusiSpecId(java.lang.Long busiSpecId) {
        this.busiSpecId = busiSpecId;
    }


    /**
     * Gets the productId value for this BusiSpecId.
     * 
     * @return productId
     */
    public java.lang.Long getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this BusiSpecId.
     * 
     * @param productId
     */
    public void setProductId(java.lang.Long productId) {
        this.productId = productId;
    }


    /**
     * Gets the productSequenceId value for this BusiSpecId.
     * 
     * @return productSequenceId
     */
    public java.lang.Long getProductSequenceId() {
        return productSequenceId;
    }


    /**
     * Sets the productSequenceId value for this BusiSpecId.
     * 
     * @param productSequenceId
     */
    public void setProductSequenceId(java.lang.Long productSequenceId) {
        this.productSequenceId = productSequenceId;
    }


    /**
     * Gets the channel value for this BusiSpecId.
     * 
     * @return channel
     */
    public java.lang.String getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this BusiSpecId.
     * 
     * @param channel
     */
    public void setChannel(java.lang.String channel) {
        this.channel = channel;
    }


    /**
     * Gets the startDate value for this BusiSpecId.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this BusiSpecId.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this BusiSpecId.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this BusiSpecId.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusiSpecId)) return false;
        BusiSpecId other = (BusiSpecId) obj;
       
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.busiSpecId==null && other.getBusiSpecId()==null) || 
             (this.busiSpecId!=null &&
              this.busiSpecId.equals(other.getBusiSpecId()))) &&
            ((this.productId==null && other.getProductId()==null) || 
             (this.productId!=null &&
              this.productId.equals(other.getProductId()))) &&
            ((this.productSequenceId==null && other.getProductSequenceId()==null) || 
             (this.productSequenceId!=null &&
              this.productSequenceId.equals(other.getProductSequenceId()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate())));
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
        if (getBusiSpecId() != null) {
            _hashCode += getBusiSpecId().hashCode();
        }
        if (getProductId() != null) {
            _hashCode += getProductId().hashCode();
        }
        if (getProductSequenceId() != null) {
            _hashCode += getProductSequenceId().hashCode();
        }
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BusiSpecId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "busiSpecId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("busiSpecId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "busiSpecId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
