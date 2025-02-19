/**
 * SQueryTaxFee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.imswrapservice;

public class SQueryTaxFee  implements java.io.Serializable {
    private java.lang.Long acctId;

    private java.lang.String outerAcctId;

    private java.lang.Long resourceId;

    private java.lang.Long custId;

    private java.lang.Integer amount;

    private java.lang.Integer busiType;

    private java.lang.Integer measureId;

    private java.lang.Integer itemId;

    private java.lang.Long sequenceId;

    private java.lang.Integer pricePlanId;

    private java.lang.Short taxIncluded;

    public SQueryTaxFee() {
    }

    public SQueryTaxFee(
           java.lang.Long acctId,
           java.lang.String outerAcctId,
           java.lang.Long resourceId,
           java.lang.Long custId,
           java.lang.Integer amount,
           java.lang.Integer busiType,
           java.lang.Integer measureId,
           java.lang.Integer itemId,
           java.lang.Long sequenceId,
           java.lang.Integer pricePlanId,
           java.lang.Short taxIncluded) {
           this.acctId = acctId;
           this.outerAcctId = outerAcctId;
           this.resourceId = resourceId;
           this.custId = custId;
           this.amount = amount;
           this.busiType = busiType;
           this.measureId = measureId;
           this.itemId = itemId;
           this.sequenceId = sequenceId;
           this.pricePlanId = pricePlanId;
           this.taxIncluded = taxIncluded;
    }


    /**
     * Gets the acctId value for this SQueryTaxFee.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SQueryTaxFee.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the outerAcctId value for this SQueryTaxFee.
     * 
     * @return outerAcctId
     */
    public java.lang.String getOuterAcctId() {
        return outerAcctId;
    }


    /**
     * Sets the outerAcctId value for this SQueryTaxFee.
     * 
     * @param outerAcctId
     */
    public void setOuterAcctId(java.lang.String outerAcctId) {
        this.outerAcctId = outerAcctId;
    }


    /**
     * Gets the resourceId value for this SQueryTaxFee.
     * 
     * @return resourceId
     */
    public java.lang.Long getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this SQueryTaxFee.
     * 
     * @param resourceId
     */
    public void setResourceId(java.lang.Long resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * Gets the custId value for this SQueryTaxFee.
     * 
     * @return custId
     */
    public java.lang.Long getCustId() {
        return custId;
    }


    /**
     * Sets the custId value for this SQueryTaxFee.
     * 
     * @param custId
     */
    public void setCustId(java.lang.Long custId) {
        this.custId = custId;
    }


    /**
     * Gets the amount value for this SQueryTaxFee.
     * 
     * @return amount
     */
    public java.lang.Integer getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this SQueryTaxFee.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Integer amount) {
        this.amount = amount;
    }


    /**
     * Gets the busiType value for this SQueryTaxFee.
     * 
     * @return busiType
     */
    public java.lang.Integer getBusiType() {
        return busiType;
    }


    /**
     * Sets the busiType value for this SQueryTaxFee.
     * 
     * @param busiType
     */
    public void setBusiType(java.lang.Integer busiType) {
        this.busiType = busiType;
    }


    /**
     * Gets the measureId value for this SQueryTaxFee.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this SQueryTaxFee.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the itemId value for this SQueryTaxFee.
     * 
     * @return itemId
     */
    public java.lang.Integer getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this SQueryTaxFee.
     * 
     * @param itemId
     */
    public void setItemId(java.lang.Integer itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the sequenceId value for this SQueryTaxFee.
     * 
     * @return sequenceId
     */
    public java.lang.Long getSequenceId() {
        return sequenceId;
    }


    /**
     * Sets the sequenceId value for this SQueryTaxFee.
     * 
     * @param sequenceId
     */
    public void setSequenceId(java.lang.Long sequenceId) {
        this.sequenceId = sequenceId;
    }


    /**
     * Gets the pricePlanId value for this SQueryTaxFee.
     * 
     * @return pricePlanId
     */
    public java.lang.Integer getPricePlanId() {
        return pricePlanId;
    }


    /**
     * Sets the pricePlanId value for this SQueryTaxFee.
     * 
     * @param pricePlanId
     */
    public void setPricePlanId(java.lang.Integer pricePlanId) {
        this.pricePlanId = pricePlanId;
    }


    /**
     * Gets the taxIncluded value for this SQueryTaxFee.
     * 
     * @return taxIncluded
     */
    public java.lang.Short getTaxIncluded() {
        return taxIncluded;
    }


    /**
     * Sets the taxIncluded value for this SQueryTaxFee.
     * 
     * @param taxIncluded
     */
    public void setTaxIncluded(java.lang.Short taxIncluded) {
        this.taxIncluded = taxIncluded;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SQueryTaxFee)) return false;
        SQueryTaxFee other = (SQueryTaxFee) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.outerAcctId==null && other.getOuterAcctId()==null) || 
             (this.outerAcctId!=null &&
              this.outerAcctId.equals(other.getOuterAcctId()))) &&
            ((this.resourceId==null && other.getResourceId()==null) || 
             (this.resourceId!=null &&
              this.resourceId.equals(other.getResourceId()))) &&
            ((this.custId==null && other.getCustId()==null) || 
             (this.custId!=null &&
              this.custId.equals(other.getCustId()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.busiType==null && other.getBusiType()==null) || 
             (this.busiType!=null &&
              this.busiType.equals(other.getBusiType()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.itemId==null && other.getItemId()==null) || 
             (this.itemId!=null &&
              this.itemId.equals(other.getItemId()))) &&
            ((this.sequenceId==null && other.getSequenceId()==null) || 
             (this.sequenceId!=null &&
              this.sequenceId.equals(other.getSequenceId()))) &&
            ((this.pricePlanId==null && other.getPricePlanId()==null) || 
             (this.pricePlanId!=null &&
              this.pricePlanId.equals(other.getPricePlanId()))) &&
            ((this.taxIncluded==null && other.getTaxIncluded()==null) || 
             (this.taxIncluded!=null &&
              this.taxIncluded.equals(other.getTaxIncluded())));
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
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getOuterAcctId() != null) {
            _hashCode += getOuterAcctId().hashCode();
        }
        if (getResourceId() != null) {
            _hashCode += getResourceId().hashCode();
        }
        if (getCustId() != null) {
            _hashCode += getCustId().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getBusiType() != null) {
            _hashCode += getBusiType().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getItemId() != null) {
            _hashCode += getItemId().hashCode();
        }
        if (getSequenceId() != null) {
            _hashCode += getSequenceId().hashCode();
        }
        if (getPricePlanId() != null) {
            _hashCode += getPricePlanId().hashCode();
        }
        if (getTaxIncluded() != null) {
            _hashCode += getTaxIncluded().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SQueryTaxFee.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryTaxFee"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outerAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("custId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "custId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("busiType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "busiType"));
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
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sequenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricePlanId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pricePlanId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxIncluded");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxIncluded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
