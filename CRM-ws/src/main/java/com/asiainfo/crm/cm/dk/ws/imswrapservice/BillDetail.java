/**
 * BillDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class BillDetail  implements java.io.Serializable {
    private java.lang.Integer feeItem;

    private double unpayFee;

    private java.lang.Double discountFee;

    private java.lang.Double adjustFee;

    private java.lang.Double primFee;

    private java.lang.String phoneId;

    private java.lang.Integer measureId;

    public BillDetail() {
    }

    public BillDetail(
           java.lang.Integer feeItem,
           double unpayFee,
           java.lang.Double discountFee,
           java.lang.Double adjustFee,
           java.lang.Double primFee,
           java.lang.String phoneId,
           java.lang.Integer measureId) {
           this.feeItem = feeItem;
           this.unpayFee = unpayFee;
           this.discountFee = discountFee;
           this.adjustFee = adjustFee;
           this.primFee = primFee;
           this.phoneId = phoneId;
           this.measureId = measureId;
    }


    /**
     * Gets the feeItem value for this BillDetail.
     * 
     * @return feeItem
     */
    public java.lang.Integer getFeeItem() {
        return feeItem;
    }


    /**
     * Sets the feeItem value for this BillDetail.
     * 
     * @param feeItem
     */
    public void setFeeItem(java.lang.Integer feeItem) {
        this.feeItem = feeItem;
    }


    /**
     * Gets the unpayFee value for this BillDetail.
     * 
     * @return unpayFee
     */
    public double getUnpayFee() {
        return unpayFee;
    }


    /**
     * Sets the unpayFee value for this BillDetail.
     * 
     * @param unpayFee
     */
    public void setUnpayFee(double unpayFee) {
        this.unpayFee = unpayFee;
    }


    /**
     * Gets the discountFee value for this BillDetail.
     * 
     * @return discountFee
     */
    public java.lang.Double getDiscountFee() {
        return discountFee;
    }


    /**
     * Sets the discountFee value for this BillDetail.
     * 
     * @param discountFee
     */
    public void setDiscountFee(java.lang.Double discountFee) {
        this.discountFee = discountFee;
    }


    /**
     * Gets the adjustFee value for this BillDetail.
     * 
     * @return adjustFee
     */
    public java.lang.Double getAdjustFee() {
        return adjustFee;
    }


    /**
     * Sets the adjustFee value for this BillDetail.
     * 
     * @param adjustFee
     */
    public void setAdjustFee(java.lang.Double adjustFee) {
        this.adjustFee = adjustFee;
    }


    /**
     * Gets the primFee value for this BillDetail.
     * 
     * @return primFee
     */
    public java.lang.Double getPrimFee() {
        return primFee;
    }


    /**
     * Sets the primFee value for this BillDetail.
     * 
     * @param primFee
     */
    public void setPrimFee(java.lang.Double primFee) {
        this.primFee = primFee;
    }


    /**
     * Gets the phoneId value for this BillDetail.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this BillDetail.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the measureId value for this BillDetail.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this BillDetail.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillDetail)) return false;
        BillDetail other = (BillDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.feeItem==null && other.getFeeItem()==null) || 
             (this.feeItem!=null &&
              this.feeItem.equals(other.getFeeItem()))) &&
            this.unpayFee == other.getUnpayFee() &&
            ((this.discountFee==null && other.getDiscountFee()==null) || 
             (this.discountFee!=null &&
              this.discountFee.equals(other.getDiscountFee()))) &&
            ((this.adjustFee==null && other.getAdjustFee()==null) || 
             (this.adjustFee!=null &&
              this.adjustFee.equals(other.getAdjustFee()))) &&
            ((this.primFee==null && other.getPrimFee()==null) || 
             (this.primFee!=null &&
              this.primFee.equals(other.getPrimFee()))) &&
            ((this.phoneId==null && other.getPhoneId()==null) || 
             (this.phoneId!=null &&
              this.phoneId.equals(other.getPhoneId()))) &&
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
        if (getFeeItem() != null) {
            _hashCode += getFeeItem().hashCode();
        }
        _hashCode += new Double(getUnpayFee()).hashCode();
        if (getDiscountFee() != null) {
            _hashCode += getDiscountFee().hashCode();
        }
        if (getAdjustFee() != null) {
            _hashCode += getAdjustFee().hashCode();
        }
        if (getPrimFee() != null) {
            _hashCode += getPrimFee().hashCode();
        }
        if (getPhoneId() != null) {
            _hashCode += getPhoneId().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeItem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feeItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unpayFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unpayFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "discountFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adjustFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
