/**
 * SOrderRepairFee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SOrderRepairFee  implements java.io.Serializable {
    private java.lang.Integer feeItemId;

    private java.lang.String feeItemName;

    private java.lang.Long charge;

    private java.lang.Long taxAmount;

    private java.lang.Integer taxCode;

    private java.lang.Integer measureId;

    private java.lang.Integer taxInclude;

    private java.lang.Long quatity;

    private java.lang.Long discountAmount;

    public SOrderRepairFee() {
    }

    public SOrderRepairFee(
           java.lang.Integer feeItemId,
           java.lang.String feeItemName,
           java.lang.Long charge,
           java.lang.Long taxAmount,
           java.lang.Integer taxCode,
           java.lang.Integer measureId,
           java.lang.Integer taxInclude,
           java.lang.Long quatity,
           java.lang.Long discountAmount) {
           this.feeItemId = feeItemId;
           this.feeItemName = feeItemName;
           this.charge = charge;
           this.taxAmount = taxAmount;
           this.taxCode = taxCode;
           this.measureId = measureId;
           this.taxInclude = taxInclude;
           this.quatity = quatity;
           this.discountAmount = discountAmount;
    }


    /**
     * Gets the feeItemId value for this SOrderRepairFee.
     * 
     * @return feeItemId
     */
    public java.lang.Integer getFeeItemId() {
        return feeItemId;
    }


    /**
     * Sets the feeItemId value for this SOrderRepairFee.
     * 
     * @param feeItemId
     */
    public void setFeeItemId(java.lang.Integer feeItemId) {
        this.feeItemId = feeItemId;
    }


    /**
     * Gets the feeItemName value for this SOrderRepairFee.
     * 
     * @return feeItemName
     */
    public java.lang.String getFeeItemName() {
        return feeItemName;
    }


    /**
     * Sets the feeItemName value for this SOrderRepairFee.
     * 
     * @param feeItemName
     */
    public void setFeeItemName(java.lang.String feeItemName) {
        this.feeItemName = feeItemName;
    }


    /**
     * Gets the charge value for this SOrderRepairFee.
     * 
     * @return charge
     */
    public java.lang.Long getCharge() {
        return charge;
    }


    /**
     * Sets the charge value for this SOrderRepairFee.
     * 
     * @param charge
     */
    public void setCharge(java.lang.Long charge) {
        this.charge = charge;
    }


    /**
     * Gets the taxAmount value for this SOrderRepairFee.
     * 
     * @return taxAmount
     */
    public java.lang.Long getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this SOrderRepairFee.
     * 
     * @param taxAmount
     */
    public void setTaxAmount(java.lang.Long taxAmount) {
        this.taxAmount = taxAmount;
    }


    /**
     * Gets the taxCode value for this SOrderRepairFee.
     * 
     * @return taxCode
     */
    public java.lang.Integer getTaxCode() {
        return taxCode;
    }


    /**
     * Sets the taxCode value for this SOrderRepairFee.
     * 
     * @param taxCode
     */
    public void setTaxCode(java.lang.Integer taxCode) {
        this.taxCode = taxCode;
    }


    /**
     * Gets the measureId value for this SOrderRepairFee.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this SOrderRepairFee.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the taxInclude value for this SOrderRepairFee.
     * 
     * @return taxInclude
     */
    public java.lang.Integer getTaxInclude() {
        return taxInclude;
    }


    /**
     * Sets the taxInclude value for this SOrderRepairFee.
     * 
     * @param taxInclude
     */
    public void setTaxInclude(java.lang.Integer taxInclude) {
        this.taxInclude = taxInclude;
    }


    /**
     * Gets the quatity value for this SOrderRepairFee.
     * 
     * @return quatity
     */
    public java.lang.Long getQuatity() {
        return quatity;
    }


    /**
     * Sets the quatity value for this SOrderRepairFee.
     * 
     * @param quatity
     */
    public void setQuatity(java.lang.Long quatity) {
        this.quatity = quatity;
    }


    /**
     * Gets the discountAmount value for this SOrderRepairFee.
     * 
     * @return discountAmount
     */
    public java.lang.Long getDiscountAmount() {
        return discountAmount;
    }


    /**
     * Sets the discountAmount value for this SOrderRepairFee.
     * 
     * @param discountAmount
     */
    public void setDiscountAmount(java.lang.Long discountAmount) {
        this.discountAmount = discountAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SOrderRepairFee)) return false;
        SOrderRepairFee other = (SOrderRepairFee) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.feeItemId==null && other.getFeeItemId()==null) || 
             (this.feeItemId!=null &&
              this.feeItemId.equals(other.getFeeItemId()))) &&
            ((this.feeItemName==null && other.getFeeItemName()==null) || 
             (this.feeItemName!=null &&
              this.feeItemName.equals(other.getFeeItemName()))) &&
            ((this.charge==null && other.getCharge()==null) || 
             (this.charge!=null &&
              this.charge.equals(other.getCharge()))) &&
            ((this.taxAmount==null && other.getTaxAmount()==null) || 
             (this.taxAmount!=null &&
              this.taxAmount.equals(other.getTaxAmount()))) &&
            ((this.taxCode==null && other.getTaxCode()==null) || 
             (this.taxCode!=null &&
              this.taxCode.equals(other.getTaxCode()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.taxInclude==null && other.getTaxInclude()==null) || 
             (this.taxInclude!=null &&
              this.taxInclude.equals(other.getTaxInclude()))) &&
            ((this.quatity==null && other.getQuatity()==null) || 
             (this.quatity!=null &&
              this.quatity.equals(other.getQuatity()))) &&
            ((this.discountAmount==null && other.getDiscountAmount()==null) || 
             (this.discountAmount!=null &&
              this.discountAmount.equals(other.getDiscountAmount())));
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
        if (getFeeItemId() != null) {
            _hashCode += getFeeItemId().hashCode();
        }
        if (getFeeItemName() != null) {
            _hashCode += getFeeItemName().hashCode();
        }
        if (getCharge() != null) {
            _hashCode += getCharge().hashCode();
        }
        if (getTaxAmount() != null) {
            _hashCode += getTaxAmount().hashCode();
        }
        if (getTaxCode() != null) {
            _hashCode += getTaxCode().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getTaxInclude() != null) {
            _hashCode += getTaxInclude().hashCode();
        }
        if (getQuatity() != null) {
            _hashCode += getQuatity().hashCode();
        }
        if (getDiscountAmount() != null) {
            _hashCode += getDiscountAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SOrderRepairFee.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sOrderRepairFee"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feeItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeItemName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feeItemName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "charge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("taxInclude");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxInclude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quatity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quatity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "discountAmount"));
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
