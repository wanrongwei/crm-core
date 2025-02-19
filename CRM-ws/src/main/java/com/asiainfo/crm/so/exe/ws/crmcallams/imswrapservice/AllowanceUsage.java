/**
 * AllowanceUsage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class AllowanceUsage  implements java.io.Serializable {
    private java.lang.Long allwnceOfferId;

    private java.lang.Long allwnceProdId;

    private java.lang.Integer assetItem;

    private java.lang.Long maxEachTime;

    private java.lang.Integer measureId;

    private java.lang.Long acctId;

    private java.lang.Long resourceId;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AllowanceOfferUsage[] offerLimits;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AssetChgIn[] assetChgs;

    public AllowanceUsage() {
    }

    public AllowanceUsage(
           java.lang.Long allwnceOfferId,
           java.lang.Long allwnceProdId,
           java.lang.Integer assetItem,
           java.lang.Long maxEachTime,
           java.lang.Integer measureId,
           java.lang.Long acctId,
           java.lang.Long resourceId,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AllowanceOfferUsage[] offerLimits,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AssetChgIn[] assetChgs) {
           this.allwnceOfferId = allwnceOfferId;
           this.allwnceProdId = allwnceProdId;
           this.assetItem = assetItem;
           this.maxEachTime = maxEachTime;
           this.measureId = measureId;
           this.acctId = acctId;
           this.resourceId = resourceId;
           this.offerLimits = offerLimits;
           this.assetChgs = assetChgs;
    }


    /**
     * Gets the allwnceOfferId value for this AllowanceUsage.
     * 
     * @return allwnceOfferId
     */
    public java.lang.Long getAllwnceOfferId() {
        return allwnceOfferId;
    }


    /**
     * Sets the allwnceOfferId value for this AllowanceUsage.
     * 
     * @param allwnceOfferId
     */
    public void setAllwnceOfferId(java.lang.Long allwnceOfferId) {
        this.allwnceOfferId = allwnceOfferId;
    }


    /**
     * Gets the allwnceProdId value for this AllowanceUsage.
     * 
     * @return allwnceProdId
     */
    public java.lang.Long getAllwnceProdId() {
        return allwnceProdId;
    }


    /**
     * Sets the allwnceProdId value for this AllowanceUsage.
     * 
     * @param allwnceProdId
     */
    public void setAllwnceProdId(java.lang.Long allwnceProdId) {
        this.allwnceProdId = allwnceProdId;
    }


    /**
     * Gets the assetItem value for this AllowanceUsage.
     * 
     * @return assetItem
     */
    public java.lang.Integer getAssetItem() {
        return assetItem;
    }


    /**
     * Sets the assetItem value for this AllowanceUsage.
     * 
     * @param assetItem
     */
    public void setAssetItem(java.lang.Integer assetItem) {
        this.assetItem = assetItem;
    }


    /**
     * Gets the maxEachTime value for this AllowanceUsage.
     * 
     * @return maxEachTime
     */
    public java.lang.Long getMaxEachTime() {
        return maxEachTime;
    }


    /**
     * Sets the maxEachTime value for this AllowanceUsage.
     * 
     * @param maxEachTime
     */
    public void setMaxEachTime(java.lang.Long maxEachTime) {
        this.maxEachTime = maxEachTime;
    }


    /**
     * Gets the measureId value for this AllowanceUsage.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this AllowanceUsage.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the acctId value for this AllowanceUsage.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this AllowanceUsage.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the resourceId value for this AllowanceUsage.
     * 
     * @return resourceId
     */
    public java.lang.Long getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this AllowanceUsage.
     * 
     * @param resourceId
     */
    public void setResourceId(java.lang.Long resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * Gets the offerLimits value for this AllowanceUsage.
     * 
     * @return offerLimits
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AllowanceOfferUsage[] getOfferLimits() {
        return offerLimits;
    }


    /**
     * Sets the offerLimits value for this AllowanceUsage.
     * 
     * @param offerLimits
     */
    public void setOfferLimits(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AllowanceOfferUsage[] offerLimits) {
        this.offerLimits = offerLimits;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AllowanceOfferUsage getOfferLimits(int i) {
        return this.offerLimits[i];
    }

    public void setOfferLimits(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AllowanceOfferUsage _value) {
        this.offerLimits[i] = _value;
    }


    /**
     * Gets the assetChgs value for this AllowanceUsage.
     * 
     * @return assetChgs
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AssetChgIn[] getAssetChgs() {
        return assetChgs;
    }


    /**
     * Sets the assetChgs value for this AllowanceUsage.
     * 
     * @param assetChgs
     */
    public void setAssetChgs(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AssetChgIn[] assetChgs) {
        this.assetChgs = assetChgs;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AssetChgIn getAssetChgs(int i) {
        return this.assetChgs[i];
    }

    public void setAssetChgs(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AssetChgIn _value) {
        this.assetChgs[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AllowanceUsage)) return false;
        AllowanceUsage other = (AllowanceUsage) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.allwnceOfferId==null && other.getAllwnceOfferId()==null) || 
             (this.allwnceOfferId!=null &&
              this.allwnceOfferId.equals(other.getAllwnceOfferId()))) &&
            ((this.allwnceProdId==null && other.getAllwnceProdId()==null) || 
             (this.allwnceProdId!=null &&
              this.allwnceProdId.equals(other.getAllwnceProdId()))) &&
            ((this.assetItem==null && other.getAssetItem()==null) || 
             (this.assetItem!=null &&
              this.assetItem.equals(other.getAssetItem()))) &&
            ((this.maxEachTime==null && other.getMaxEachTime()==null) || 
             (this.maxEachTime!=null &&
              this.maxEachTime.equals(other.getMaxEachTime()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.resourceId==null && other.getResourceId()==null) || 
             (this.resourceId!=null &&
              this.resourceId.equals(other.getResourceId()))) &&
            ((this.offerLimits==null && other.getOfferLimits()==null) || 
             (this.offerLimits!=null &&
              java.util.Arrays.equals(this.offerLimits, other.getOfferLimits()))) &&
            ((this.assetChgs==null && other.getAssetChgs()==null) || 
             (this.assetChgs!=null &&
              java.util.Arrays.equals(this.assetChgs, other.getAssetChgs())));
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
        if (getAllwnceOfferId() != null) {
            _hashCode += getAllwnceOfferId().hashCode();
        }
        if (getAllwnceProdId() != null) {
            _hashCode += getAllwnceProdId().hashCode();
        }
        if (getAssetItem() != null) {
            _hashCode += getAssetItem().hashCode();
        }
        if (getMaxEachTime() != null) {
            _hashCode += getMaxEachTime().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getResourceId() != null) {
            _hashCode += getResourceId().hashCode();
        }
        if (getOfferLimits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOfferLimits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOfferLimits(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAssetChgs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssetChgs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssetChgs(), i);
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
        new org.apache.axis.description.TypeDesc(AllowanceUsage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "allowanceUsage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allwnceOfferId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allwnceOfferId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allwnceProdId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allwnceProdId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetItem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assetItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxEachTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxEachTime"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerLimits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offerLimits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "allowanceOfferUsage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetChgs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assetChgs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "assetChgIn"));
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
