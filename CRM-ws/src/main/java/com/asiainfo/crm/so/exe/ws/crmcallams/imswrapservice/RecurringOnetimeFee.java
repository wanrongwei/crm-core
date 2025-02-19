/**
 * RecurringOnetimeFee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class RecurringOnetimeFee  implements java.io.Serializable {
    private java.lang.Long productSequenceId;

    private java.lang.Long productOfferId;

    private java.lang.String productName;

    private java.lang.Integer productLevel;

    private java.lang.String chargeDate;

    private java.lang.Long recurringFee;

    private java.lang.String feeItemDescription;

    private java.lang.Long amount;

    public RecurringOnetimeFee() {
    }

    public RecurringOnetimeFee(
           java.lang.Long productSequenceId,
           java.lang.Long productOfferId,
           java.lang.String productName,
           java.lang.Integer productLevel,
           java.lang.String chargeDate,
           java.lang.Long recurringFee,
           java.lang.String feeItemDescription,
           java.lang.Long amount) {
           this.productSequenceId = productSequenceId;
           this.productOfferId = productOfferId;
           this.productName = productName;
           this.productLevel = productLevel;
           this.chargeDate = chargeDate;
           this.recurringFee = recurringFee;
           this.feeItemDescription = feeItemDescription;
           this.amount = amount;
    }


    /**
     * Gets the productSequenceId value for this RecurringOnetimeFee.
     * 
     * @return productSequenceId
     */
    public java.lang.Long getProductSequenceId() {
        return productSequenceId;
    }


    /**
     * Sets the productSequenceId value for this RecurringOnetimeFee.
     * 
     * @param productSequenceId
     */
    public void setProductSequenceId(java.lang.Long productSequenceId) {
        this.productSequenceId = productSequenceId;
    }


    /**
     * Gets the productOfferId value for this RecurringOnetimeFee.
     * 
     * @return productOfferId
     */
    public java.lang.Long getProductOfferId() {
        return productOfferId;
    }


    /**
     * Sets the productOfferId value for this RecurringOnetimeFee.
     * 
     * @param productOfferId
     */
    public void setProductOfferId(java.lang.Long productOfferId) {
        this.productOfferId = productOfferId;
    }


    /**
     * Gets the productName value for this RecurringOnetimeFee.
     * 
     * @return productName
     */
    public java.lang.String getProductName() {
        return productName;
    }


    /**
     * Sets the productName value for this RecurringOnetimeFee.
     * 
     * @param productName
     */
    public void setProductName(java.lang.String productName) {
        this.productName = productName;
    }


    /**
     * Gets the productLevel value for this RecurringOnetimeFee.
     * 
     * @return productLevel
     */
    public java.lang.Integer getProductLevel() {
        return productLevel;
    }


    /**
     * Sets the productLevel value for this RecurringOnetimeFee.
     * 
     * @param productLevel
     */
    public void setProductLevel(java.lang.Integer productLevel) {
        this.productLevel = productLevel;
    }


    /**
     * Gets the chargeDate value for this RecurringOnetimeFee.
     * 
     * @return chargeDate
     */
    public java.lang.String getChargeDate() {
        return chargeDate;
    }


    /**
     * Sets the chargeDate value for this RecurringOnetimeFee.
     * 
     * @param chargeDate
     */
    public void setChargeDate(java.lang.String chargeDate) {
        this.chargeDate = chargeDate;
    }


    /**
     * Gets the recurringFee value for this RecurringOnetimeFee.
     * 
     * @return recurringFee
     */
    public java.lang.Long getRecurringFee() {
        return recurringFee;
    }


    /**
     * Sets the recurringFee value for this RecurringOnetimeFee.
     * 
     * @param recurringFee
     */
    public void setRecurringFee(java.lang.Long recurringFee) {
        this.recurringFee = recurringFee;
    }


    /**
     * Gets the feeItemDescription value for this RecurringOnetimeFee.
     * 
     * @return feeItemDescription
     */
    public java.lang.String getFeeItemDescription() {
        return feeItemDescription;
    }


    /**
     * Sets the feeItemDescription value for this RecurringOnetimeFee.
     * 
     * @param feeItemDescription
     */
    public void setFeeItemDescription(java.lang.String feeItemDescription) {
        this.feeItemDescription = feeItemDescription;
    }


    /**
     * Gets the amount value for this RecurringOnetimeFee.
     * 
     * @return amount
     */
    public java.lang.Long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this RecurringOnetimeFee.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecurringOnetimeFee)) return false;
        RecurringOnetimeFee other = (RecurringOnetimeFee) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.productSequenceId==null && other.getProductSequenceId()==null) || 
             (this.productSequenceId!=null &&
              this.productSequenceId.equals(other.getProductSequenceId()))) &&
            ((this.productOfferId==null && other.getProductOfferId()==null) || 
             (this.productOfferId!=null &&
              this.productOfferId.equals(other.getProductOfferId()))) &&
            ((this.productName==null && other.getProductName()==null) || 
             (this.productName!=null &&
              this.productName.equals(other.getProductName()))) &&
            ((this.productLevel==null && other.getProductLevel()==null) || 
             (this.productLevel!=null &&
              this.productLevel.equals(other.getProductLevel()))) &&
            ((this.chargeDate==null && other.getChargeDate()==null) || 
             (this.chargeDate!=null &&
              this.chargeDate.equals(other.getChargeDate()))) &&
            ((this.recurringFee==null && other.getRecurringFee()==null) || 
             (this.recurringFee!=null &&
              this.recurringFee.equals(other.getRecurringFee()))) &&
            ((this.feeItemDescription==null && other.getFeeItemDescription()==null) || 
             (this.feeItemDescription!=null &&
              this.feeItemDescription.equals(other.getFeeItemDescription()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount())));
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
        if (getProductSequenceId() != null) {
            _hashCode += getProductSequenceId().hashCode();
        }
        if (getProductOfferId() != null) {
            _hashCode += getProductOfferId().hashCode();
        }
        if (getProductName() != null) {
            _hashCode += getProductName().hashCode();
        }
        if (getProductLevel() != null) {
            _hashCode += getProductLevel().hashCode();
        }
        if (getChargeDate() != null) {
            _hashCode += getChargeDate().hashCode();
        }
        if (getRecurringFee() != null) {
            _hashCode += getRecurringFee().hashCode();
        }
        if (getFeeItemDescription() != null) {
            _hashCode += getFeeItemDescription().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecurringOnetimeFee.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "recurringOnetimeFee"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productSequenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productSequenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productOfferId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productOfferId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurringFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recurringFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeItemDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feeItemDescription"));
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
