/**
 * Accumulate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class Accumulate  implements java.io.Serializable {
    private java.lang.Long productId;

    private java.lang.Long offerId;

    private int accumulateItem;

    private java.lang.String accumulateName;

    private double accumulateAmount;

    private java.lang.Short accumulatePayMode;

    private java.lang.Long measureId;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    public Accumulate() {
    }

    public Accumulate(
           java.lang.Long productId,
           java.lang.Long offerId,
           int accumulateItem,
           java.lang.String accumulateName,
           double accumulateAmount,
           java.lang.Short accumulatePayMode,
           java.lang.Long measureId,
           java.util.Calendar startDate,
           java.util.Calendar endDate) {
           this.productId = productId;
           this.offerId = offerId;
           this.accumulateItem = accumulateItem;
           this.accumulateName = accumulateName;
           this.accumulateAmount = accumulateAmount;
           this.accumulatePayMode = accumulatePayMode;
           this.measureId = measureId;
           this.startDate = startDate;
           this.endDate = endDate;
    }


    /**
     * Gets the productId value for this Accumulate.
     * 
     * @return productId
     */
    public java.lang.Long getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this Accumulate.
     * 
     * @param productId
     */
    public void setProductId(java.lang.Long productId) {
        this.productId = productId;
    }


    /**
     * Gets the offerId value for this Accumulate.
     * 
     * @return offerId
     */
    public java.lang.Long getOfferId() {
        return offerId;
    }


    /**
     * Sets the offerId value for this Accumulate.
     * 
     * @param offerId
     */
    public void setOfferId(java.lang.Long offerId) {
        this.offerId = offerId;
    }


    /**
     * Gets the accumulateItem value for this Accumulate.
     * 
     * @return accumulateItem
     */
    public int getAccumulateItem() {
        return accumulateItem;
    }


    /**
     * Sets the accumulateItem value for this Accumulate.
     * 
     * @param accumulateItem
     */
    public void setAccumulateItem(int accumulateItem) {
        this.accumulateItem = accumulateItem;
    }


    /**
     * Gets the accumulateName value for this Accumulate.
     * 
     * @return accumulateName
     */
    public java.lang.String getAccumulateName() {
        return accumulateName;
    }


    /**
     * Sets the accumulateName value for this Accumulate.
     * 
     * @param accumulateName
     */
    public void setAccumulateName(java.lang.String accumulateName) {
        this.accumulateName = accumulateName;
    }


    /**
     * Gets the accumulateAmount value for this Accumulate.
     * 
     * @return accumulateAmount
     */
    public double getAccumulateAmount() {
        return accumulateAmount;
    }


    /**
     * Sets the accumulateAmount value for this Accumulate.
     * 
     * @param accumulateAmount
     */
    public void setAccumulateAmount(double accumulateAmount) {
        this.accumulateAmount = accumulateAmount;
    }


    /**
     * Gets the accumulatePayMode value for this Accumulate.
     * 
     * @return accumulatePayMode
     */
    public java.lang.Short getAccumulatePayMode() {
        return accumulatePayMode;
    }


    /**
     * Sets the accumulatePayMode value for this Accumulate.
     * 
     * @param accumulatePayMode
     */
    public void setAccumulatePayMode(java.lang.Short accumulatePayMode) {
        this.accumulatePayMode = accumulatePayMode;
    }


    /**
     * Gets the measureId value for this Accumulate.
     * 
     * @return measureId
     */
    public java.lang.Long getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this Accumulate.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Long measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the startDate value for this Accumulate.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this Accumulate.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this Accumulate.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this Accumulate.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Accumulate)) return false;
        Accumulate other = (Accumulate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.productId==null && other.getProductId()==null) || 
             (this.productId!=null &&
              this.productId.equals(other.getProductId()))) &&
            ((this.offerId==null && other.getOfferId()==null) || 
             (this.offerId!=null &&
              this.offerId.equals(other.getOfferId()))) &&
            this.accumulateItem == other.getAccumulateItem() &&
            ((this.accumulateName==null && other.getAccumulateName()==null) || 
             (this.accumulateName!=null &&
              this.accumulateName.equals(other.getAccumulateName()))) &&
            this.accumulateAmount == other.getAccumulateAmount() &&
            ((this.accumulatePayMode==null && other.getAccumulatePayMode()==null) || 
             (this.accumulatePayMode!=null &&
              this.accumulatePayMode.equals(other.getAccumulatePayMode()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate())));
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
        if (getProductId() != null) {
            _hashCode += getProductId().hashCode();
        }
        if (getOfferId() != null) {
            _hashCode += getOfferId().hashCode();
        }
        _hashCode += getAccumulateItem();
        if (getAccumulateName() != null) {
            _hashCode += getAccumulateName().hashCode();
        }
        _hashCode += new Double(getAccumulateAmount()).hashCode();
        if (getAccumulatePayMode() != null) {
            _hashCode += getAccumulatePayMode().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Accumulate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "accumulate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accumulateItem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accumulateItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accumulateName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accumulateName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accumulateAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accumulateAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accumulatePayMode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accumulatePayMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measureId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measureId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
