/**
 * YwsSdPsOutletChange.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.sap;

public class YwsSdPsOutletChange  implements java.io.Serializable {
    private java.lang.String outletGroup;

    private java.lang.String owner;

    private java.lang.String salesChannel;

    private java.lang.String region;

    private java.lang.String regionManager;

    private java.lang.String validFrom;

    private java.lang.String validTo;

    public YwsSdPsOutletChange() {
    }

    public YwsSdPsOutletChange(
           java.lang.String outletGroup,
           java.lang.String owner,
           java.lang.String salesChannel,
           java.lang.String region,
           java.lang.String regionManager,
           java.lang.String validFrom,
           java.lang.String validTo) {
           this.outletGroup = outletGroup;
           this.owner = owner;
           this.salesChannel = salesChannel;
           this.region = region;
           this.regionManager = regionManager;
           this.validFrom = validFrom;
           this.validTo = validTo;
    }


    /**
     * Gets the outletGroup value for this YwsSdPsOutletChange.
     * 
     * @return outletGroup
     */
    public java.lang.String getOutletGroup() {
        return outletGroup;
    }


    /**
     * Sets the outletGroup value for this YwsSdPsOutletChange.
     * 
     * @param outletGroup
     */
    public void setOutletGroup(java.lang.String outletGroup) {
        this.outletGroup = outletGroup;
    }


    /**
     * Gets the owner value for this YwsSdPsOutletChange.
     * 
     * @return owner
     */
    public java.lang.String getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this YwsSdPsOutletChange.
     * 
     * @param owner
     */
    public void setOwner(java.lang.String owner) {
        this.owner = owner;
    }


    /**
     * Gets the salesChannel value for this YwsSdPsOutletChange.
     * 
     * @return salesChannel
     */
    public java.lang.String getSalesChannel() {
        return salesChannel;
    }


    /**
     * Sets the salesChannel value for this YwsSdPsOutletChange.
     * 
     * @param salesChannel
     */
    public void setSalesChannel(java.lang.String salesChannel) {
        this.salesChannel = salesChannel;
    }


    /**
     * Gets the region value for this YwsSdPsOutletChange.
     * 
     * @return region
     */
    public java.lang.String getRegion() {
        return region;
    }


    /**
     * Sets the region value for this YwsSdPsOutletChange.
     * 
     * @param region
     */
    public void setRegion(java.lang.String region) {
        this.region = region;
    }


    /**
     * Gets the regionManager value for this YwsSdPsOutletChange.
     * 
     * @return regionManager
     */
    public java.lang.String getRegionManager() {
        return regionManager;
    }


    /**
     * Sets the regionManager value for this YwsSdPsOutletChange.
     * 
     * @param regionManager
     */
    public void setRegionManager(java.lang.String regionManager) {
        this.regionManager = regionManager;
    }


    /**
     * Gets the validFrom value for this YwsSdPsOutletChange.
     * 
     * @return validFrom
     */
    public java.lang.String getValidFrom() {
        return validFrom;
    }


    /**
     * Sets the validFrom value for this YwsSdPsOutletChange.
     * 
     * @param validFrom
     */
    public void setValidFrom(java.lang.String validFrom) {
        this.validFrom = validFrom;
    }


    /**
     * Gets the validTo value for this YwsSdPsOutletChange.
     * 
     * @return validTo
     */
    public java.lang.String getValidTo() {
        return validTo;
    }


    /**
     * Sets the validTo value for this YwsSdPsOutletChange.
     * 
     * @param validTo
     */
    public void setValidTo(java.lang.String validTo) {
        this.validTo = validTo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof YwsSdPsOutletChange)) return false;
        YwsSdPsOutletChange other = (YwsSdPsOutletChange) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.outletGroup==null && other.getOutletGroup()==null) || 
             (this.outletGroup!=null &&
              this.outletGroup.equals(other.getOutletGroup()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.salesChannel==null && other.getSalesChannel()==null) || 
             (this.salesChannel!=null &&
              this.salesChannel.equals(other.getSalesChannel()))) &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion()))) &&
            ((this.regionManager==null && other.getRegionManager()==null) || 
             (this.regionManager!=null &&
              this.regionManager.equals(other.getRegionManager()))) &&
            ((this.validFrom==null && other.getValidFrom()==null) || 
             (this.validFrom!=null &&
              this.validFrom.equals(other.getValidFrom()))) &&
            ((this.validTo==null && other.getValidTo()==null) || 
             (this.validTo!=null &&
              this.validTo.equals(other.getValidTo())));
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
        if (getOutletGroup() != null) {
            _hashCode += getOutletGroup().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getSalesChannel() != null) {
            _hashCode += getSalesChannel().hashCode();
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        if (getRegionManager() != null) {
            _hashCode += getRegionManager().hashCode();
        }
        if (getValidFrom() != null) {
            _hashCode += getValidFrom().hashCode();
        }
        if (getValidTo() != null) {
            _hashCode += getValidTo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(YwsSdPsOutletChange.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSdPsOutletChange"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outletGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OutletGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesChannel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SalesChannel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Region"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionManager");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RegionManager"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ValidFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ValidTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
