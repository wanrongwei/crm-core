/**
 * STaxFee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class STaxFee  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CaBillTax[] caBillTaxList;

    private java.lang.Long acctId;

    private java.lang.Long sequenceId;

    private java.lang.Long amountExTax;

    private java.lang.Short taxFlag;

    private java.lang.Integer measureId;

    public STaxFee() {
    }

    public STaxFee(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CaBillTax[] caBillTaxList,
           java.lang.Long acctId,
           java.lang.Long sequenceId,
           java.lang.Long amountExTax,
           java.lang.Short taxFlag,
           java.lang.Integer measureId) {
           this.caBillTaxList = caBillTaxList;
           this.acctId = acctId;
           this.sequenceId = sequenceId;
           this.amountExTax = amountExTax;
           this.taxFlag = taxFlag;
           this.measureId = measureId;
    }


    /**
     * Gets the caBillTaxList value for this STaxFee.
     * 
     * @return caBillTaxList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CaBillTax[] getCaBillTaxList() {
        return caBillTaxList;
    }


    /**
     * Sets the caBillTaxList value for this STaxFee.
     * 
     * @param caBillTaxList
     */
    public void setCaBillTaxList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CaBillTax[] caBillTaxList) {
        this.caBillTaxList = caBillTaxList;
    }


    /**
     * Gets the acctId value for this STaxFee.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this STaxFee.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the sequenceId value for this STaxFee.
     * 
     * @return sequenceId
     */
    public java.lang.Long getSequenceId() {
        return sequenceId;
    }


    /**
     * Sets the sequenceId value for this STaxFee.
     * 
     * @param sequenceId
     */
    public void setSequenceId(java.lang.Long sequenceId) {
        this.sequenceId = sequenceId;
    }


    /**
     * Gets the amountExTax value for this STaxFee.
     * 
     * @return amountExTax
     */
    public java.lang.Long getAmountExTax() {
        return amountExTax;
    }


    /**
     * Sets the amountExTax value for this STaxFee.
     * 
     * @param amountExTax
     */
    public void setAmountExTax(java.lang.Long amountExTax) {
        this.amountExTax = amountExTax;
    }


    /**
     * Gets the taxFlag value for this STaxFee.
     * 
     * @return taxFlag
     */
    public java.lang.Short getTaxFlag() {
        return taxFlag;
    }


    /**
     * Sets the taxFlag value for this STaxFee.
     * 
     * @param taxFlag
     */
    public void setTaxFlag(java.lang.Short taxFlag) {
        this.taxFlag = taxFlag;
    }


    /**
     * Gets the measureId value for this STaxFee.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this STaxFee.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof STaxFee)) return false;
        STaxFee other = (STaxFee) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.caBillTaxList==null && other.getCaBillTaxList()==null) || 
             (this.caBillTaxList!=null &&
              java.util.Arrays.equals(this.caBillTaxList, other.getCaBillTaxList()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.sequenceId==null && other.getSequenceId()==null) || 
             (this.sequenceId!=null &&
              this.sequenceId.equals(other.getSequenceId()))) &&
            ((this.amountExTax==null && other.getAmountExTax()==null) || 
             (this.amountExTax!=null &&
              this.amountExTax.equals(other.getAmountExTax()))) &&
            ((this.taxFlag==null && other.getTaxFlag()==null) || 
             (this.taxFlag!=null &&
              this.taxFlag.equals(other.getTaxFlag()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId())));
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
        if (getCaBillTaxList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCaBillTaxList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCaBillTaxList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getSequenceId() != null) {
            _hashCode += getSequenceId().hashCode();
        }
        if (getAmountExTax() != null) {
            _hashCode += getAmountExTax().hashCode();
        }
        if (getTaxFlag() != null) {
            _hashCode += getTaxFlag().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(STaxFee.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sTaxFee"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caBillTaxList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "caBillTaxList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caBillTax"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "caBillTaxListItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("amountExTax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountExTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
