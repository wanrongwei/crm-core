/**
 * SRefundBalance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SRefundBalance  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRefundItemTypeDetail[] refundBalanceDtls;

    private java.lang.Long soNbr;

    private java.util.Calendar soDate;

    private java.lang.Long acctId;

    private java.lang.Long resourceId;

    private java.lang.Integer ownnerType;

    private java.lang.Long refundAmount;

    private java.lang.Integer measureId;

    public SRefundBalance() {
    }

    public SRefundBalance(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRefundItemTypeDetail[] refundBalanceDtls,
           java.lang.Long soNbr,
           java.util.Calendar soDate,
           java.lang.Long acctId,
           java.lang.Long resourceId,
           java.lang.Integer ownnerType,
           java.lang.Long refundAmount,
           java.lang.Integer measureId) {
           this.refundBalanceDtls = refundBalanceDtls;
           this.soNbr = soNbr;
           this.soDate = soDate;
           this.acctId = acctId;
           this.resourceId = resourceId;
           this.ownnerType = ownnerType;
           this.refundAmount = refundAmount;
           this.measureId = measureId;
    }


    /**
     * Gets the refundBalanceDtls value for this SRefundBalance.
     * 
     * @return refundBalanceDtls
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRefundItemTypeDetail[] getRefundBalanceDtls() {
        return refundBalanceDtls;
    }


    /**
     * Sets the refundBalanceDtls value for this SRefundBalance.
     * 
     * @param refundBalanceDtls
     */
    public void setRefundBalanceDtls(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRefundItemTypeDetail[] refundBalanceDtls) {
        this.refundBalanceDtls = refundBalanceDtls;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRefundItemTypeDetail getRefundBalanceDtls(int i) {
        return this.refundBalanceDtls[i];
    }

    public void setRefundBalanceDtls(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRefundItemTypeDetail _value) {
        this.refundBalanceDtls[i] = _value;
    }


    /**
     * Gets the soNbr value for this SRefundBalance.
     * 
     * @return soNbr
     */
    public java.lang.Long getSoNbr() {
        return soNbr;
    }


    /**
     * Sets the soNbr value for this SRefundBalance.
     * 
     * @param soNbr
     */
    public void setSoNbr(java.lang.Long soNbr) {
        this.soNbr = soNbr;
    }


    /**
     * Gets the soDate value for this SRefundBalance.
     * 
     * @return soDate
     */
    public java.util.Calendar getSoDate() {
        return soDate;
    }


    /**
     * Sets the soDate value for this SRefundBalance.
     * 
     * @param soDate
     */
    public void setSoDate(java.util.Calendar soDate) {
        this.soDate = soDate;
    }


    /**
     * Gets the acctId value for this SRefundBalance.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SRefundBalance.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the resourceId value for this SRefundBalance.
     * 
     * @return resourceId
     */
    public java.lang.Long getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this SRefundBalance.
     * 
     * @param resourceId
     */
    public void setResourceId(java.lang.Long resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * Gets the ownnerType value for this SRefundBalance.
     * 
     * @return ownnerType
     */
    public java.lang.Integer getOwnnerType() {
        return ownnerType;
    }


    /**
     * Sets the ownnerType value for this SRefundBalance.
     * 
     * @param ownnerType
     */
    public void setOwnnerType(java.lang.Integer ownnerType) {
        this.ownnerType = ownnerType;
    }


    /**
     * Gets the refundAmount value for this SRefundBalance.
     * 
     * @return refundAmount
     */
    public java.lang.Long getRefundAmount() {
        return refundAmount;
    }


    /**
     * Sets the refundAmount value for this SRefundBalance.
     * 
     * @param refundAmount
     */
    public void setRefundAmount(java.lang.Long refundAmount) {
        this.refundAmount = refundAmount;
    }


    /**
     * Gets the measureId value for this SRefundBalance.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this SRefundBalance.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SRefundBalance)) return false;
        SRefundBalance other = (SRefundBalance) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.refundBalanceDtls==null && other.getRefundBalanceDtls()==null) || 
             (this.refundBalanceDtls!=null &&
              java.util.Arrays.equals(this.refundBalanceDtls, other.getRefundBalanceDtls()))) &&
            ((this.soNbr==null && other.getSoNbr()==null) || 
             (this.soNbr!=null &&
              this.soNbr.equals(other.getSoNbr()))) &&
            ((this.soDate==null && other.getSoDate()==null) || 
             (this.soDate!=null &&
              this.soDate.equals(other.getSoDate()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.resourceId==null && other.getResourceId()==null) || 
             (this.resourceId!=null &&
              this.resourceId.equals(other.getResourceId()))) &&
            ((this.ownnerType==null && other.getOwnnerType()==null) || 
             (this.ownnerType!=null &&
              this.ownnerType.equals(other.getOwnnerType()))) &&
            ((this.refundAmount==null && other.getRefundAmount()==null) || 
             (this.refundAmount!=null &&
              this.refundAmount.equals(other.getRefundAmount()))) &&
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
        if (getRefundBalanceDtls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRefundBalanceDtls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRefundBalanceDtls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSoNbr() != null) {
            _hashCode += getSoNbr().hashCode();
        }
        if (getSoDate() != null) {
            _hashCode += getSoDate().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getResourceId() != null) {
            _hashCode += getResourceId().hashCode();
        }
        if (getOwnnerType() != null) {
            _hashCode += getOwnnerType().hashCode();
        }
        if (getRefundAmount() != null) {
            _hashCode += getRefundAmount().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SRefundBalance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sRefundBalance"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundBalanceDtls");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refundBalanceDtls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sRefundItemTypeDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "soNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "soDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("ownnerType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownnerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refundAmount"));
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
