/**
 * DoOrderProductAuthReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsservice;

public class DoOrderProductAuthReq  implements java.io.Serializable {
    private java.lang.String phoneId;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.PreOrderOffer[] offerListItem;

    private java.lang.Long oneTimeFee;

    private java.lang.Integer measureId;

    public DoOrderProductAuthReq() {
    }

    public DoOrderProductAuthReq(
           java.lang.String phoneId,
           com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.PreOrderOffer[] offerListItem,
           java.lang.Long oneTimeFee,
           java.lang.Integer measureId) {
           this.phoneId = phoneId;
           this.offerListItem = offerListItem;
           this.oneTimeFee = oneTimeFee;
           this.measureId = measureId;
    }


    /**
     * Gets the phoneId value for this DoOrderProductAuthReq.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this DoOrderProductAuthReq.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the offerListItem value for this DoOrderProductAuthReq.
     * 
     * @return offerListItem
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.PreOrderOffer[] getOfferListItem() {
        return offerListItem;
    }


    /**
     * Sets the offerListItem value for this DoOrderProductAuthReq.
     * 
     * @param offerListItem
     */
    public void setOfferListItem(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.PreOrderOffer[] offerListItem) {
        this.offerListItem = offerListItem;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.PreOrderOffer getOfferListItem(int i) {
        return this.offerListItem[i];
    }

    public void setOfferListItem(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.PreOrderOffer _value) {
        this.offerListItem[i] = _value;
    }


    /**
     * Gets the oneTimeFee value for this DoOrderProductAuthReq.
     * 
     * @return oneTimeFee
     */
    public java.lang.Long getOneTimeFee() {
        return oneTimeFee;
    }


    /**
     * Sets the oneTimeFee value for this DoOrderProductAuthReq.
     * 
     * @param oneTimeFee
     */
    public void setOneTimeFee(java.lang.Long oneTimeFee) {
        this.oneTimeFee = oneTimeFee;
    }


    /**
     * Gets the measureId value for this DoOrderProductAuthReq.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this DoOrderProductAuthReq.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
    	if (obj == null) return false;
        if (!(obj instanceof DoOrderProductAuthReq)) return false;
        DoOrderProductAuthReq other = (DoOrderProductAuthReq) obj;
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
            ((this.offerListItem==null && other.getOfferListItem()==null) || 
             (this.offerListItem!=null &&
              java.util.Arrays.equals(this.offerListItem, other.getOfferListItem()))) &&
            ((this.oneTimeFee==null && other.getOneTimeFee()==null) || 
             (this.oneTimeFee!=null &&
              this.oneTimeFee.equals(other.getOneTimeFee()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId())));
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
        if (getOfferListItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOfferListItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOfferListItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOneTimeFee() != null) {
            _hashCode += getOneTimeFee().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoOrderProductAuthReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doOrderProductAuthReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerListItem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offerListItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "preOrderOffer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oneTimeFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oneTimeFee"));
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
