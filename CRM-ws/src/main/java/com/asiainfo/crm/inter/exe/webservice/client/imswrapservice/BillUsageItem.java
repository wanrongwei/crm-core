/**
 * BillUsageItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.imswrapservice;

public class BillUsageItem  implements java.io.Serializable {
    private java.lang.Integer billItem;

    private long unpayFee;

    private java.lang.Long discountFee;

    private java.lang.Long adjustFee;

    private java.lang.Long primFee;

    private java.lang.Long usage;

    private java.lang.Integer unit;

    public BillUsageItem() {
    }

    public BillUsageItem(
           java.lang.Integer billItem,
           long unpayFee,
           java.lang.Long discountFee,
           java.lang.Long adjustFee,
           java.lang.Long primFee,
           java.lang.Long usage,
           java.lang.Integer unit) {
           this.billItem = billItem;
           this.unpayFee = unpayFee;
           this.discountFee = discountFee;
           this.adjustFee = adjustFee;
           this.primFee = primFee;
           this.usage = usage;
           this.unit = unit;
    }


    /**
     * Gets the billItem value for this BillUsageItem.
     * 
     * @return billItem
     */
    public java.lang.Integer getBillItem() {
        return billItem;
    }


    /**
     * Sets the billItem value for this BillUsageItem.
     * 
     * @param billItem
     */
    public void setBillItem(java.lang.Integer billItem) {
        this.billItem = billItem;
    }


    /**
     * Gets the unpayFee value for this BillUsageItem.
     * 
     * @return unpayFee
     */
    public long getUnpayFee() {
        return unpayFee;
    }


    /**
     * Sets the unpayFee value for this BillUsageItem.
     * 
     * @param unpayFee
     */
    public void setUnpayFee(long unpayFee) {
        this.unpayFee = unpayFee;
    }


    /**
     * Gets the discountFee value for this BillUsageItem.
     * 
     * @return discountFee
     */
    public java.lang.Long getDiscountFee() {
        return discountFee;
    }


    /**
     * Sets the discountFee value for this BillUsageItem.
     * 
     * @param discountFee
     */
    public void setDiscountFee(java.lang.Long discountFee) {
        this.discountFee = discountFee;
    }


    /**
     * Gets the adjustFee value for this BillUsageItem.
     * 
     * @return adjustFee
     */
    public java.lang.Long getAdjustFee() {
        return adjustFee;
    }


    /**
     * Sets the adjustFee value for this BillUsageItem.
     * 
     * @param adjustFee
     */
    public void setAdjustFee(java.lang.Long adjustFee) {
        this.adjustFee = adjustFee;
    }


    /**
     * Gets the primFee value for this BillUsageItem.
     * 
     * @return primFee
     */
    public java.lang.Long getPrimFee() {
        return primFee;
    }


    /**
     * Sets the primFee value for this BillUsageItem.
     * 
     * @param primFee
     */
    public void setPrimFee(java.lang.Long primFee) {
        this.primFee = primFee;
    }


    /**
     * Gets the usage value for this BillUsageItem.
     * 
     * @return usage
     */
    public java.lang.Long getUsage() {
        return usage;
    }


    /**
     * Sets the usage value for this BillUsageItem.
     * 
     * @param usage
     */
    public void setUsage(java.lang.Long usage) {
        this.usage = usage;
    }


    /**
     * Gets the unit value for this BillUsageItem.
     * 
     * @return unit
     */
    public java.lang.Integer getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this BillUsageItem.
     * 
     * @param unit
     */
    public void setUnit(java.lang.Integer unit) {
        this.unit = unit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillUsageItem)) return false;
        BillUsageItem other = (BillUsageItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billItem==null && other.getBillItem()==null) || 
             (this.billItem!=null &&
              this.billItem.equals(other.getBillItem()))) &&
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
            ((this.usage==null && other.getUsage()==null) || 
             (this.usage!=null &&
              this.usage.equals(other.getUsage()))) &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit())));
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
        if (getBillItem() != null) {
            _hashCode += getBillItem().hashCode();
        }
        _hashCode += new Long(getUnpayFee()).hashCode();
        if (getDiscountFee() != null) {
            _hashCode += getDiscountFee().hashCode();
        }
        if (getAdjustFee() != null) {
            _hashCode += getAdjustFee().hashCode();
        }
        if (getPrimFee() != null) {
            _hashCode += getPrimFee().hashCode();
        }
        if (getUsage() != null) {
            _hashCode += getUsage().hashCode();
        }
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillUsageItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billUsageItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billItem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unpayFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unpayFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "discountFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adjustFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unit"));
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
