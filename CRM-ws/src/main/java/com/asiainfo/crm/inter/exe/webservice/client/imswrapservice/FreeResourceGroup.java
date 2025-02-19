/**
 * FreeResourceGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.imswrapservice;

public class FreeResourceGroup  implements java.io.Serializable {
    private java.lang.Integer resourceGroupId;

    private java.lang.String name;

    private java.lang.Long amount;

    private java.lang.Long remaining;

    private java.lang.Integer unit;

    private java.lang.Integer mode;

    private java.lang.String validDate;

    private java.lang.String expiredDate;

    private com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.FreeResource[] freeResourceListItem;

    private java.lang.Long usedValue;

    public FreeResourceGroup() {
    }

    public FreeResourceGroup(
           java.lang.Integer resourceGroupId,
           java.lang.String name,
           java.lang.Long amount,
           java.lang.Long remaining,
           java.lang.Integer unit,
           java.lang.Integer mode,
           java.lang.String validDate,
           java.lang.String expiredDate,
           com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.FreeResource[] freeResourceListItem,
           java.lang.Long usedValue) {
           this.resourceGroupId = resourceGroupId;
           this.name = name;
           this.amount = amount;
           this.remaining = remaining;
           this.unit = unit;
           this.mode = mode;
           this.validDate = validDate;
           this.expiredDate = expiredDate;
           this.freeResourceListItem = freeResourceListItem;
           this.usedValue = usedValue;
    }


    /**
     * Gets the resourceGroupId value for this FreeResourceGroup.
     * 
     * @return resourceGroupId
     */
    public java.lang.Integer getResourceGroupId() {
        return resourceGroupId;
    }


    /**
     * Sets the resourceGroupId value for this FreeResourceGroup.
     * 
     * @param resourceGroupId
     */
    public void setResourceGroupId(java.lang.Integer resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }


    /**
     * Gets the name value for this FreeResourceGroup.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this FreeResourceGroup.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the amount value for this FreeResourceGroup.
     * 
     * @return amount
     */
    public java.lang.Long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this FreeResourceGroup.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }


    /**
     * Gets the remaining value for this FreeResourceGroup.
     * 
     * @return remaining
     */
    public java.lang.Long getRemaining() {
        return remaining;
    }


    /**
     * Sets the remaining value for this FreeResourceGroup.
     * 
     * @param remaining
     */
    public void setRemaining(java.lang.Long remaining) {
        this.remaining = remaining;
    }


    /**
     * Gets the unit value for this FreeResourceGroup.
     * 
     * @return unit
     */
    public java.lang.Integer getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this FreeResourceGroup.
     * 
     * @param unit
     */
    public void setUnit(java.lang.Integer unit) {
        this.unit = unit;
    }


    /**
     * Gets the mode value for this FreeResourceGroup.
     * 
     * @return mode
     */
    public java.lang.Integer getMode() {
        return mode;
    }


    /**
     * Sets the mode value for this FreeResourceGroup.
     * 
     * @param mode
     */
    public void setMode(java.lang.Integer mode) {
        this.mode = mode;
    }


    /**
     * Gets the validDate value for this FreeResourceGroup.
     * 
     * @return validDate
     */
    public java.lang.String getValidDate() {
        return validDate;
    }


    /**
     * Sets the validDate value for this FreeResourceGroup.
     * 
     * @param validDate
     */
    public void setValidDate(java.lang.String validDate) {
        this.validDate = validDate;
    }


    /**
     * Gets the expiredDate value for this FreeResourceGroup.
     * 
     * @return expiredDate
     */
    public java.lang.String getExpiredDate() {
        return expiredDate;
    }


    /**
     * Sets the expiredDate value for this FreeResourceGroup.
     * 
     * @param expiredDate
     */
    public void setExpiredDate(java.lang.String expiredDate) {
        this.expiredDate = expiredDate;
    }


    /**
     * Gets the freeResourceListItem value for this FreeResourceGroup.
     * 
     * @return freeResourceListItem
     */
    public com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.FreeResource[] getFreeResourceListItem() {
        return freeResourceListItem;
    }


    /**
     * Sets the freeResourceListItem value for this FreeResourceGroup.
     * 
     * @param freeResourceListItem
     */
    public void setFreeResourceListItem(com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.FreeResource[] freeResourceListItem) {
        this.freeResourceListItem = freeResourceListItem;
    }


    /**
     * Gets the usedValue value for this FreeResourceGroup.
     * 
     * @return usedValue
     */
    public java.lang.Long getUsedValue() {
        return usedValue;
    }


    /**
     * Sets the usedValue value for this FreeResourceGroup.
     * 
     * @param usedValue
     */
    public void setUsedValue(java.lang.Long usedValue) {
        this.usedValue = usedValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FreeResourceGroup)) return false;
        FreeResourceGroup other = (FreeResourceGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resourceGroupId==null && other.getResourceGroupId()==null) || 
             (this.resourceGroupId!=null &&
              this.resourceGroupId.equals(other.getResourceGroupId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.remaining==null && other.getRemaining()==null) || 
             (this.remaining!=null &&
              this.remaining.equals(other.getRemaining()))) &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit()))) &&
            ((this.mode==null && other.getMode()==null) || 
             (this.mode!=null &&
              this.mode.equals(other.getMode()))) &&
            ((this.validDate==null && other.getValidDate()==null) || 
             (this.validDate!=null &&
              this.validDate.equals(other.getValidDate()))) &&
            ((this.expiredDate==null && other.getExpiredDate()==null) || 
             (this.expiredDate!=null &&
              this.expiredDate.equals(other.getExpiredDate()))) &&
            ((this.freeResourceListItem==null && other.getFreeResourceListItem()==null) || 
             (this.freeResourceListItem!=null &&
              java.util.Arrays.equals(this.freeResourceListItem, other.getFreeResourceListItem()))) &&
            ((this.usedValue==null && other.getUsedValue()==null) || 
             (this.usedValue!=null &&
              this.usedValue.equals(other.getUsedValue())));
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
        if (getResourceGroupId() != null) {
            _hashCode += getResourceGroupId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getRemaining() != null) {
            _hashCode += getRemaining().hashCode();
        }
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        if (getMode() != null) {
            _hashCode += getMode().hashCode();
        }
        if (getValidDate() != null) {
            _hashCode += getValidDate().hashCode();
        }
        if (getExpiredDate() != null) {
            _hashCode += getExpiredDate().hashCode();
        }
        if (getFreeResourceListItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFreeResourceListItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFreeResourceListItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUsedValue() != null) {
            _hashCode += getUsedValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FreeResourceGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResourceGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remaining");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remaining"));
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
        elemField.setFieldName("mode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiredDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expiredDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeResourceListItem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freeResourceListItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "freeResourceListItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usedValue"));
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
