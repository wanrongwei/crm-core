/**
 * ImsDeductFeeOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class ImsDeductFeeOut  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsTaxFeeDetail[] taxDetailList;

    private java.lang.Integer orgamount;

    private java.lang.Integer totalTaxFee;

    private java.lang.Integer newAmount;

    public ImsDeductFeeOut() {
    }

    public ImsDeductFeeOut(
           com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsTaxFeeDetail[] taxDetailList,
           java.lang.Integer orgamount,
           java.lang.Integer totalTaxFee,
           java.lang.Integer newAmount) {
           this.taxDetailList = taxDetailList;
           this.orgamount = orgamount;
           this.totalTaxFee = totalTaxFee;
           this.newAmount = newAmount;
    }


    /**
     * Gets the taxDetailList value for this ImsDeductFeeOut.
     * 
     * @return taxDetailList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsTaxFeeDetail[] getTaxDetailList() {
        return taxDetailList;
    }


    /**
     * Sets the taxDetailList value for this ImsDeductFeeOut.
     * 
     * @param taxDetailList
     */
    public void setTaxDetailList(com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsTaxFeeDetail[] taxDetailList) {
        this.taxDetailList = taxDetailList;
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsTaxFeeDetail getTaxDetailList(int i) {
        return this.taxDetailList[i];
    }

    public void setTaxDetailList(int i, com.asiainfo.crm.cm.dk.ws.imswrapservice.ImsTaxFeeDetail _value) {
        this.taxDetailList[i] = _value;
    }


    /**
     * Gets the orgamount value for this ImsDeductFeeOut.
     * 
     * @return orgamount
     */
    public java.lang.Integer getOrgamount() {
        return orgamount;
    }


    /**
     * Sets the orgamount value for this ImsDeductFeeOut.
     * 
     * @param orgamount
     */
    public void setOrgamount(java.lang.Integer orgamount) {
        this.orgamount = orgamount;
    }


    /**
     * Gets the totalTaxFee value for this ImsDeductFeeOut.
     * 
     * @return totalTaxFee
     */
    public java.lang.Integer getTotalTaxFee() {
        return totalTaxFee;
    }


    /**
     * Sets the totalTaxFee value for this ImsDeductFeeOut.
     * 
     * @param totalTaxFee
     */
    public void setTotalTaxFee(java.lang.Integer totalTaxFee) {
        this.totalTaxFee = totalTaxFee;
    }


    /**
     * Gets the newAmount value for this ImsDeductFeeOut.
     * 
     * @return newAmount
     */
    public java.lang.Integer getNewAmount() {
        return newAmount;
    }


    /**
     * Sets the newAmount value for this ImsDeductFeeOut.
     * 
     * @param newAmount
     */
    public void setNewAmount(java.lang.Integer newAmount) {
        this.newAmount = newAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImsDeductFeeOut)) return false;
        ImsDeductFeeOut other = (ImsDeductFeeOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taxDetailList==null && other.getTaxDetailList()==null) || 
             (this.taxDetailList!=null &&
              java.util.Arrays.equals(this.taxDetailList, other.getTaxDetailList()))) &&
            ((this.orgamount==null && other.getOrgamount()==null) || 
             (this.orgamount!=null &&
              this.orgamount.equals(other.getOrgamount()))) &&
            ((this.totalTaxFee==null && other.getTotalTaxFee()==null) || 
             (this.totalTaxFee!=null &&
              this.totalTaxFee.equals(other.getTotalTaxFee()))) &&
            ((this.newAmount==null && other.getNewAmount()==null) || 
             (this.newAmount!=null &&
              this.newAmount.equals(other.getNewAmount())));
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
        if (getTaxDetailList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxDetailList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxDetailList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrgamount() != null) {
            _hashCode += getOrgamount().hashCode();
        }
        if (getTotalTaxFee() != null) {
            _hashCode += getTotalTaxFee().hashCode();
        }
        if (getNewAmount() != null) {
            _hashCode += getNewAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImsDeductFeeOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "imsDeductFeeOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxDetailList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxDetailList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "imsTaxFeeDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgamount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgamount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalTaxFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalTaxFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
