/**
 * ReguideDtlInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class ReguideDtlInfo  implements java.io.Serializable {
    private java.lang.String startTime;

    private java.lang.String oppNumber;

    private java.lang.Long totalUsage;

    private java.lang.Integer unit;

    private java.lang.Long totalActualCharge;

    private java.lang.Long totalUsageCharge;

    private java.lang.Integer chargeUnit;

    private java.lang.Long totalOwnerPaid;

    private java.lang.Long totalPayerPaid;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ReguideAcctInfo[] reguideAcctInfoList;

    public ReguideDtlInfo() {
    }

    public ReguideDtlInfo(
           java.lang.String startTime,
           java.lang.String oppNumber,
           java.lang.Long totalUsage,
           java.lang.Integer unit,
           java.lang.Long totalActualCharge,
           java.lang.Long totalUsageCharge,
           java.lang.Integer chargeUnit,
           java.lang.Long totalOwnerPaid,
           java.lang.Long totalPayerPaid,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ReguideAcctInfo[] reguideAcctInfoList) {
           this.startTime = startTime;
           this.oppNumber = oppNumber;
           this.totalUsage = totalUsage;
           this.unit = unit;
           this.totalActualCharge = totalActualCharge;
           this.totalUsageCharge = totalUsageCharge;
           this.chargeUnit = chargeUnit;
           this.totalOwnerPaid = totalOwnerPaid;
           this.totalPayerPaid = totalPayerPaid;
           this.reguideAcctInfoList = reguideAcctInfoList;
    }


    /**
     * Gets the startTime value for this ReguideDtlInfo.
     * 
     * @return startTime
     */
    public java.lang.String getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this ReguideDtlInfo.
     * 
     * @param startTime
     */
    public void setStartTime(java.lang.String startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the oppNumber value for this ReguideDtlInfo.
     * 
     * @return oppNumber
     */
    public java.lang.String getOppNumber() {
        return oppNumber;
    }


    /**
     * Sets the oppNumber value for this ReguideDtlInfo.
     * 
     * @param oppNumber
     */
    public void setOppNumber(java.lang.String oppNumber) {
        this.oppNumber = oppNumber;
    }


    /**
     * Gets the totalUsage value for this ReguideDtlInfo.
     * 
     * @return totalUsage
     */
    public java.lang.Long getTotalUsage() {
        return totalUsage;
    }


    /**
     * Sets the totalUsage value for this ReguideDtlInfo.
     * 
     * @param totalUsage
     */
    public void setTotalUsage(java.lang.Long totalUsage) {
        this.totalUsage = totalUsage;
    }


    /**
     * Gets the unit value for this ReguideDtlInfo.
     * 
     * @return unit
     */
    public java.lang.Integer getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this ReguideDtlInfo.
     * 
     * @param unit
     */
    public void setUnit(java.lang.Integer unit) {
        this.unit = unit;
    }


    /**
     * Gets the totalActualCharge value for this ReguideDtlInfo.
     * 
     * @return totalActualCharge
     */
    public java.lang.Long getTotalActualCharge() {
        return totalActualCharge;
    }


    /**
     * Sets the totalActualCharge value for this ReguideDtlInfo.
     * 
     * @param totalActualCharge
     */
    public void setTotalActualCharge(java.lang.Long totalActualCharge) {
        this.totalActualCharge = totalActualCharge;
    }


    /**
     * Gets the totalUsageCharge value for this ReguideDtlInfo.
     * 
     * @return totalUsageCharge
     */
    public java.lang.Long getTotalUsageCharge() {
        return totalUsageCharge;
    }


    /**
     * Sets the totalUsageCharge value for this ReguideDtlInfo.
     * 
     * @param totalUsageCharge
     */
    public void setTotalUsageCharge(java.lang.Long totalUsageCharge) {
        this.totalUsageCharge = totalUsageCharge;
    }


    /**
     * Gets the chargeUnit value for this ReguideDtlInfo.
     * 
     * @return chargeUnit
     */
    public java.lang.Integer getChargeUnit() {
        return chargeUnit;
    }


    /**
     * Sets the chargeUnit value for this ReguideDtlInfo.
     * 
     * @param chargeUnit
     */
    public void setChargeUnit(java.lang.Integer chargeUnit) {
        this.chargeUnit = chargeUnit;
    }


    /**
     * Gets the totalOwnerPaid value for this ReguideDtlInfo.
     * 
     * @return totalOwnerPaid
     */
    public java.lang.Long getTotalOwnerPaid() {
        return totalOwnerPaid;
    }


    /**
     * Sets the totalOwnerPaid value for this ReguideDtlInfo.
     * 
     * @param totalOwnerPaid
     */
    public void setTotalOwnerPaid(java.lang.Long totalOwnerPaid) {
        this.totalOwnerPaid = totalOwnerPaid;
    }


    /**
     * Gets the totalPayerPaid value for this ReguideDtlInfo.
     * 
     * @return totalPayerPaid
     */
    public java.lang.Long getTotalPayerPaid() {
        return totalPayerPaid;
    }


    /**
     * Sets the totalPayerPaid value for this ReguideDtlInfo.
     * 
     * @param totalPayerPaid
     */
    public void setTotalPayerPaid(java.lang.Long totalPayerPaid) {
        this.totalPayerPaid = totalPayerPaid;
    }


    /**
     * Gets the reguideAcctInfoList value for this ReguideDtlInfo.
     * 
     * @return reguideAcctInfoList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ReguideAcctInfo[] getReguideAcctInfoList() {
        return reguideAcctInfoList;
    }


    /**
     * Sets the reguideAcctInfoList value for this ReguideDtlInfo.
     * 
     * @param reguideAcctInfoList
     */
    public void setReguideAcctInfoList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ReguideAcctInfo[] reguideAcctInfoList) {
        this.reguideAcctInfoList = reguideAcctInfoList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReguideDtlInfo)) return false;
        ReguideDtlInfo other = (ReguideDtlInfo) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.oppNumber==null && other.getOppNumber()==null) || 
             (this.oppNumber!=null &&
              this.oppNumber.equals(other.getOppNumber()))) &&
            ((this.totalUsage==null && other.getTotalUsage()==null) || 
             (this.totalUsage!=null &&
              this.totalUsage.equals(other.getTotalUsage()))) &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit()))) &&
            ((this.totalActualCharge==null && other.getTotalActualCharge()==null) || 
             (this.totalActualCharge!=null &&
              this.totalActualCharge.equals(other.getTotalActualCharge()))) &&
            ((this.totalUsageCharge==null && other.getTotalUsageCharge()==null) || 
             (this.totalUsageCharge!=null &&
              this.totalUsageCharge.equals(other.getTotalUsageCharge()))) &&
            ((this.chargeUnit==null && other.getChargeUnit()==null) || 
             (this.chargeUnit!=null &&
              this.chargeUnit.equals(other.getChargeUnit()))) &&
            ((this.totalOwnerPaid==null && other.getTotalOwnerPaid()==null) || 
             (this.totalOwnerPaid!=null &&
              this.totalOwnerPaid.equals(other.getTotalOwnerPaid()))) &&
            ((this.totalPayerPaid==null && other.getTotalPayerPaid()==null) || 
             (this.totalPayerPaid!=null &&
              this.totalPayerPaid.equals(other.getTotalPayerPaid()))) &&
            ((this.reguideAcctInfoList==null && other.getReguideAcctInfoList()==null) || 
             (this.reguideAcctInfoList!=null &&
              java.util.Arrays.equals(this.reguideAcctInfoList, other.getReguideAcctInfoList())));
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
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getOppNumber() != null) {
            _hashCode += getOppNumber().hashCode();
        }
        if (getTotalUsage() != null) {
            _hashCode += getTotalUsage().hashCode();
        }
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        if (getTotalActualCharge() != null) {
            _hashCode += getTotalActualCharge().hashCode();
        }
        if (getTotalUsageCharge() != null) {
            _hashCode += getTotalUsageCharge().hashCode();
        }
        if (getChargeUnit() != null) {
            _hashCode += getChargeUnit().hashCode();
        }
        if (getTotalOwnerPaid() != null) {
            _hashCode += getTotalOwnerPaid().hashCode();
        }
        if (getTotalPayerPaid() != null) {
            _hashCode += getTotalPayerPaid().hashCode();
        }
        if (getReguideAcctInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReguideAcctInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReguideAcctInfoList(), i);
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
        new org.apache.axis.description.TypeDesc(ReguideDtlInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "reguideDtlInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oppNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oppNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalUsage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalUsage"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalActualCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalActualCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalUsageCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalUsageCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargeUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalOwnerPaid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalOwnerPaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPayerPaid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalPayerPaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reguideAcctInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reguideAcctInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "reguideAcctInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "reguideAcctInfoList_Item"));
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
