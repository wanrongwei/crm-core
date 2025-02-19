/**
 * SProductRecurringFee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice;

public class SProductRecurringFee  implements java.io.Serializable {
    private java.lang.Long baseVal;

    private java.lang.Integer measureId;

    private java.lang.String measureName;

    private java.lang.Integer itemId;

    private java.lang.String itemName;

    public SProductRecurringFee() {
    }

    public SProductRecurringFee(
           java.lang.Long baseVal,
           java.lang.Integer measureId,
           java.lang.String measureName,
           java.lang.Integer itemId,
           java.lang.String itemName) {
           this.baseVal = baseVal;
           this.measureId = measureId;
           this.measureName = measureName;
           this.itemId = itemId;
           this.itemName = itemName;
    }


    /**
     * Gets the baseVal value for this SProductRecurringFee.
     * 
     * @return baseVal
     */
    public java.lang.Long getBaseVal() {
        return baseVal;
    }


    /**
     * Sets the baseVal value for this SProductRecurringFee.
     * 
     * @param baseVal
     */
    public void setBaseVal(java.lang.Long baseVal) {
        this.baseVal = baseVal;
    }


    /**
     * Gets the measureId value for this SProductRecurringFee.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this SProductRecurringFee.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the measureName value for this SProductRecurringFee.
     * 
     * @return measureName
     */
    public java.lang.String getMeasureName() {
        return measureName;
    }


    /**
     * Sets the measureName value for this SProductRecurringFee.
     * 
     * @param measureName
     */
    public void setMeasureName(java.lang.String measureName) {
        this.measureName = measureName;
    }


    /**
     * Gets the itemId value for this SProductRecurringFee.
     * 
     * @return itemId
     */
    public java.lang.Integer getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this SProductRecurringFee.
     * 
     * @param itemId
     */
    public void setItemId(java.lang.Integer itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the itemName value for this SProductRecurringFee.
     * 
     * @return itemName
     */
    public java.lang.String getItemName() {
        return itemName;
    }


    /**
     * Sets the itemName value for this SProductRecurringFee.
     * 
     * @param itemName
     */
    public void setItemName(java.lang.String itemName) {
        this.itemName = itemName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
    	if (obj == null) return false;
        if (!(obj instanceof SProductRecurringFee)) return false;
        SProductRecurringFee other = (SProductRecurringFee) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.baseVal==null && other.getBaseVal()==null) || 
             (this.baseVal!=null &&
              this.baseVal.equals(other.getBaseVal()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.measureName==null && other.getMeasureName()==null) || 
             (this.measureName!=null &&
              this.measureName.equals(other.getMeasureName()))) &&
            ((this.itemId==null && other.getItemId()==null) || 
             (this.itemId!=null &&
              this.itemId.equals(other.getItemId()))) &&
            ((this.itemName==null && other.getItemName()==null) || 
             (this.itemName!=null &&
              this.itemName.equals(other.getItemName())));
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
        if (getBaseVal() != null) {
            _hashCode += getBaseVal().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getMeasureName() != null) {
            _hashCode += getMeasureName().hashCode();
        }
        if (getItemId() != null) {
            _hashCode += getItemId().hashCode();
        }
        if (getItemName() != null) {
            _hashCode += getItemName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SProductRecurringFee.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductRecurringFee"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseVal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "baseVal"));
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
        elemField.setFieldName("measureName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measureName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
