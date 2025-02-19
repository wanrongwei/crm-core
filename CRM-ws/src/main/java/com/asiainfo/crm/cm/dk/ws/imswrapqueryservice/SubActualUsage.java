/**
 * SubActualUsage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class SubActualUsage  implements java.io.Serializable {
    private java.lang.String subGroupName;

    private java.lang.Long afterDiscountCharge;

    private java.lang.Short unit;

    private java.lang.Long usage;

    private java.lang.String peakTime;

    private java.lang.Long beforeDiscountCharge;

    public SubActualUsage() {
    }

    public SubActualUsage(
           java.lang.String subGroupName,
           java.lang.Long afterDiscountCharge,
           java.lang.Short unit,
           java.lang.Long usage,
           java.lang.String peakTime,
           java.lang.Long beforeDiscountCharge) {
           this.subGroupName = subGroupName;
           this.afterDiscountCharge = afterDiscountCharge;
           this.unit = unit;
           this.usage = usage;
           this.peakTime = peakTime;
           this.beforeDiscountCharge = beforeDiscountCharge;
    }


    /**
     * Gets the subGroupName value for this SubActualUsage.
     * 
     * @return subGroupName
     */
    public java.lang.String getSubGroupName() {
        return subGroupName;
    }


    /**
     * Sets the subGroupName value for this SubActualUsage.
     * 
     * @param subGroupName
     */
    public void setSubGroupName(java.lang.String subGroupName) {
        this.subGroupName = subGroupName;
    }


    /**
     * Gets the afterDiscountCharge value for this SubActualUsage.
     * 
     * @return afterDiscountCharge
     */
    public java.lang.Long getAfterDiscountCharge() {
        return afterDiscountCharge;
    }


    /**
     * Sets the afterDiscountCharge value for this SubActualUsage.
     * 
     * @param afterDiscountCharge
     */
    public void setAfterDiscountCharge(java.lang.Long afterDiscountCharge) {
        this.afterDiscountCharge = afterDiscountCharge;
    }


    /**
     * Gets the unit value for this SubActualUsage.
     * 
     * @return unit
     */
    public java.lang.Short getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this SubActualUsage.
     * 
     * @param unit
     */
    public void setUnit(java.lang.Short unit) {
        this.unit = unit;
    }


    /**
     * Gets the usage value for this SubActualUsage.
     * 
     * @return usage
     */
    public java.lang.Long getUsage() {
        return usage;
    }


    /**
     * Sets the usage value for this SubActualUsage.
     * 
     * @param usage
     */
    public void setUsage(java.lang.Long usage) {
        this.usage = usage;
    }


    /**
     * Gets the peakTime value for this SubActualUsage.
     * 
     * @return peakTime
     */
    public java.lang.String getPeakTime() {
        return peakTime;
    }


    /**
     * Sets the peakTime value for this SubActualUsage.
     * 
     * @param peakTime
     */
    public void setPeakTime(java.lang.String peakTime) {
        this.peakTime = peakTime;
    }


    /**
     * Gets the beforeDiscountCharge value for this SubActualUsage.
     * 
     * @return beforeDiscountCharge
     */
    public java.lang.Long getBeforeDiscountCharge() {
        return beforeDiscountCharge;
    }


    /**
     * Sets the beforeDiscountCharge value for this SubActualUsage.
     * 
     * @param beforeDiscountCharge
     */
    public void setBeforeDiscountCharge(java.lang.Long beforeDiscountCharge) {
        this.beforeDiscountCharge = beforeDiscountCharge;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubActualUsage)) return false;
        SubActualUsage other = (SubActualUsage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subGroupName==null && other.getSubGroupName()==null) || 
             (this.subGroupName!=null &&
              this.subGroupName.equals(other.getSubGroupName()))) &&
            ((this.afterDiscountCharge==null && other.getAfterDiscountCharge()==null) || 
             (this.afterDiscountCharge!=null &&
              this.afterDiscountCharge.equals(other.getAfterDiscountCharge()))) &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit()))) &&
            ((this.usage==null && other.getUsage()==null) || 
             (this.usage!=null &&
              this.usage.equals(other.getUsage()))) &&
            ((this.peakTime==null && other.getPeakTime()==null) || 
             (this.peakTime!=null &&
              this.peakTime.equals(other.getPeakTime()))) &&
            ((this.beforeDiscountCharge==null && other.getBeforeDiscountCharge()==null) || 
             (this.beforeDiscountCharge!=null &&
              this.beforeDiscountCharge.equals(other.getBeforeDiscountCharge())));
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
        if (getSubGroupName() != null) {
            _hashCode += getSubGroupName().hashCode();
        }
        if (getAfterDiscountCharge() != null) {
            _hashCode += getAfterDiscountCharge().hashCode();
        }
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        if (getUsage() != null) {
            _hashCode += getUsage().hashCode();
        }
        if (getPeakTime() != null) {
            _hashCode += getPeakTime().hashCode();
        }
        if (getBeforeDiscountCharge() != null) {
            _hashCode += getBeforeDiscountCharge().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubActualUsage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "subActualUsage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subGroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("afterDiscountCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "afterDiscountCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
        elemField.setFieldName("peakTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "peakTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beforeDiscountCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "beforeDiscountCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
