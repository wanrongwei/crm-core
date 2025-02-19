/**
 * YwsFutureStock.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.sap;

public class YwsFutureStock  implements java.io.Serializable {
    private java.lang.String arrivingDate;

    private java.math.BigDecimal futureStock;

    private java.lang.String unit;

    public YwsFutureStock() {
    }

    public YwsFutureStock(
           java.lang.String arrivingDate,
           java.math.BigDecimal futureStock,
           java.lang.String unit) {
           this.arrivingDate = arrivingDate;
           this.futureStock = futureStock;
           this.unit = unit;
    }


    /**
     * Gets the arrivingDate value for this YwsFutureStock.
     * 
     * @return arrivingDate
     */
    public java.lang.String getArrivingDate() {
        return arrivingDate;
    }


    /**
     * Sets the arrivingDate value for this YwsFutureStock.
     * 
     * @param arrivingDate
     */
    public void setArrivingDate(java.lang.String arrivingDate) {
        this.arrivingDate = arrivingDate;
    }


    /**
     * Gets the futureStock value for this YwsFutureStock.
     * 
     * @return futureStock
     */
    public java.math.BigDecimal getFutureStock() {
        return futureStock;
    }


    /**
     * Sets the futureStock value for this YwsFutureStock.
     * 
     * @param futureStock
     */
    public void setFutureStock(java.math.BigDecimal futureStock) {
        this.futureStock = futureStock;
    }


    /**
     * Gets the unit value for this YwsFutureStock.
     * 
     * @return unit
     */
    public java.lang.String getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this YwsFutureStock.
     * 
     * @param unit
     */
    public void setUnit(java.lang.String unit) {
        this.unit = unit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof YwsFutureStock)) return false;
        YwsFutureStock other = (YwsFutureStock) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.arrivingDate==null && other.getArrivingDate()==null) || 
             (this.arrivingDate!=null &&
              this.arrivingDate.equals(other.getArrivingDate()))) &&
            ((this.futureStock==null && other.getFutureStock()==null) || 
             (this.futureStock!=null &&
              this.futureStock.equals(other.getFutureStock()))) &&
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
        if (getArrivingDate() != null) {
            _hashCode += getArrivingDate().hashCode();
        }
        if (getFutureStock() != null) {
            _hashCode += getFutureStock().hashCode();
        }
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(YwsFutureStock.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsFutureStock"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ArrivingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("futureStock");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FutureStock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Unit"));
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
