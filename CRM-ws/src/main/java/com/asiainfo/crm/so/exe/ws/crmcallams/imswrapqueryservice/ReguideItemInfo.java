/**
 * ReguideItemInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class ReguideItemInfo  implements java.io.Serializable {
    private java.lang.Long itemId;

    private java.lang.Long totalActualCharge;

    private java.lang.Long totalUsageCharge;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ReguideDtlInfo[] reguideDtlInfoList;

    private java.lang.String reguideMobileNo;

    private java.lang.Integer unit;

    private java.lang.Integer chargeUnit;

    private java.lang.Long totalActualUsage;

    public ReguideItemInfo() {
    }

    public ReguideItemInfo(
           java.lang.Long itemId,
           java.lang.Long totalActualCharge,
           java.lang.Long totalUsageCharge,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ReguideDtlInfo[] reguideDtlInfoList,
           java.lang.String reguideMobileNo,
           java.lang.Integer unit,
           java.lang.Integer chargeUnit,
           java.lang.Long totalActualUsage) {
           this.itemId = itemId;
           this.totalActualCharge = totalActualCharge;
           this.totalUsageCharge = totalUsageCharge;
           this.reguideDtlInfoList = reguideDtlInfoList;
           this.reguideMobileNo = reguideMobileNo;
           this.unit = unit;
           this.chargeUnit = chargeUnit;
           this.totalActualUsage = totalActualUsage;
    }


    /**
     * Gets the itemId value for this ReguideItemInfo.
     * 
     * @return itemId
     */
    public java.lang.Long getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this ReguideItemInfo.
     * 
     * @param itemId
     */
    public void setItemId(java.lang.Long itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the totalActualCharge value for this ReguideItemInfo.
     * 
     * @return totalActualCharge
     */
    public java.lang.Long getTotalActualCharge() {
        return totalActualCharge;
    }


    /**
     * Sets the totalActualCharge value for this ReguideItemInfo.
     * 
     * @param totalActualCharge
     */
    public void setTotalActualCharge(java.lang.Long totalActualCharge) {
        this.totalActualCharge = totalActualCharge;
    }


    /**
     * Gets the totalUsageCharge value for this ReguideItemInfo.
     * 
     * @return totalUsageCharge
     */
    public java.lang.Long getTotalUsageCharge() {
        return totalUsageCharge;
    }


    /**
     * Sets the totalUsageCharge value for this ReguideItemInfo.
     * 
     * @param totalUsageCharge
     */
    public void setTotalUsageCharge(java.lang.Long totalUsageCharge) {
        this.totalUsageCharge = totalUsageCharge;
    }


    /**
     * Gets the reguideDtlInfoList value for this ReguideItemInfo.
     * 
     * @return reguideDtlInfoList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ReguideDtlInfo[] getReguideDtlInfoList() {
        return reguideDtlInfoList;
    }


    /**
     * Sets the reguideDtlInfoList value for this ReguideItemInfo.
     * 
     * @param reguideDtlInfoList
     */
    public void setReguideDtlInfoList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ReguideDtlInfo[] reguideDtlInfoList) {
        this.reguideDtlInfoList = reguideDtlInfoList;
    }


    /**
     * Gets the reguideMobileNo value for this ReguideItemInfo.
     * 
     * @return reguideMobileNo
     */
    public java.lang.String getReguideMobileNo() {
        return reguideMobileNo;
    }


    /**
     * Sets the reguideMobileNo value for this ReguideItemInfo.
     * 
     * @param reguideMobileNo
     */
    public void setReguideMobileNo(java.lang.String reguideMobileNo) {
        this.reguideMobileNo = reguideMobileNo;
    }


    /**
     * Gets the unit value for this ReguideItemInfo.
     * 
     * @return unit
     */
    public java.lang.Integer getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this ReguideItemInfo.
     * 
     * @param unit
     */
    public void setUnit(java.lang.Integer unit) {
        this.unit = unit;
    }


    /**
     * Gets the chargeUnit value for this ReguideItemInfo.
     * 
     * @return chargeUnit
     */
    public java.lang.Integer getChargeUnit() {
        return chargeUnit;
    }


    /**
     * Sets the chargeUnit value for this ReguideItemInfo.
     * 
     * @param chargeUnit
     */
    public void setChargeUnit(java.lang.Integer chargeUnit) {
        this.chargeUnit = chargeUnit;
    }


    /**
     * Gets the totalActualUsage value for this ReguideItemInfo.
     * 
     * @return totalActualUsage
     */
    public java.lang.Long getTotalActualUsage() {
        return totalActualUsage;
    }


    /**
     * Sets the totalActualUsage value for this ReguideItemInfo.
     * 
     * @param totalActualUsage
     */
    public void setTotalActualUsage(java.lang.Long totalActualUsage) {
        this.totalActualUsage = totalActualUsage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReguideItemInfo)) return false;
        ReguideItemInfo other = (ReguideItemInfo) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemId==null && other.getItemId()==null) || 
             (this.itemId!=null &&
              this.itemId.equals(other.getItemId()))) &&
            ((this.totalActualCharge==null && other.getTotalActualCharge()==null) || 
             (this.totalActualCharge!=null &&
              this.totalActualCharge.equals(other.getTotalActualCharge()))) &&
            ((this.totalUsageCharge==null && other.getTotalUsageCharge()==null) || 
             (this.totalUsageCharge!=null &&
              this.totalUsageCharge.equals(other.getTotalUsageCharge()))) &&
            ((this.reguideDtlInfoList==null && other.getReguideDtlInfoList()==null) || 
             (this.reguideDtlInfoList!=null &&
              java.util.Arrays.equals(this.reguideDtlInfoList, other.getReguideDtlInfoList()))) &&
            ((this.reguideMobileNo==null && other.getReguideMobileNo()==null) || 
             (this.reguideMobileNo!=null &&
              this.reguideMobileNo.equals(other.getReguideMobileNo()))) &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit()))) &&
            ((this.chargeUnit==null && other.getChargeUnit()==null) || 
             (this.chargeUnit!=null &&
              this.chargeUnit.equals(other.getChargeUnit()))) &&
            ((this.totalActualUsage==null && other.getTotalActualUsage()==null) || 
             (this.totalActualUsage!=null &&
              this.totalActualUsage.equals(other.getTotalActualUsage())));
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
        if (getItemId() != null) {
            _hashCode += getItemId().hashCode();
        }
        if (getTotalActualCharge() != null) {
            _hashCode += getTotalActualCharge().hashCode();
        }
        if (getTotalUsageCharge() != null) {
            _hashCode += getTotalUsageCharge().hashCode();
        }
        if (getReguideDtlInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReguideDtlInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReguideDtlInfoList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReguideMobileNo() != null) {
            _hashCode += getReguideMobileNo().hashCode();
        }
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        if (getChargeUnit() != null) {
            _hashCode += getChargeUnit().hashCode();
        }
        if (getTotalActualUsage() != null) {
            _hashCode += getTotalActualUsage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReguideItemInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "reguideItemInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("reguideDtlInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reguideDtlInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "reguideDtlInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "reguideDtlInfoList_Item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reguideMobileNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reguideMobileNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("chargeUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargeUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalActualUsage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalActualUsage"));
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
