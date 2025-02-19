/**
 * SAllowanceRec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.imswrapservice;

public class SAllowanceRec  implements java.io.Serializable {
    private java.lang.Long acctId;

    private java.lang.Long resourceId;

    private java.lang.String phoneId;

    private java.lang.Long amount;

    private java.lang.Integer measureId;

    private java.util.Calendar soDate;

    private java.lang.Integer orgId;

    private java.lang.Long opId;

    private com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SAllowanceRecDetail[] detailList;

    public SAllowanceRec() {
    }

    public SAllowanceRec(
           java.lang.Long acctId,
           java.lang.Long resourceId,
           java.lang.String phoneId,
           java.lang.Long amount,
           java.lang.Integer measureId,
           java.util.Calendar soDate,
           java.lang.Integer orgId,
           java.lang.Long opId,
           com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SAllowanceRecDetail[] detailList) {
           this.acctId = acctId;
           this.resourceId = resourceId;
           this.phoneId = phoneId;
           this.amount = amount;
           this.measureId = measureId;
           this.soDate = soDate;
           this.orgId = orgId;
           this.opId = opId;
           this.detailList = detailList;
    }


    /**
     * Gets the acctId value for this SAllowanceRec.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SAllowanceRec.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the resourceId value for this SAllowanceRec.
     * 
     * @return resourceId
     */
    public java.lang.Long getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this SAllowanceRec.
     * 
     * @param resourceId
     */
    public void setResourceId(java.lang.Long resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * Gets the phoneId value for this SAllowanceRec.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this SAllowanceRec.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the amount value for this SAllowanceRec.
     * 
     * @return amount
     */
    public java.lang.Long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this SAllowanceRec.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }


    /**
     * Gets the measureId value for this SAllowanceRec.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this SAllowanceRec.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the soDate value for this SAllowanceRec.
     * 
     * @return soDate
     */
    public java.util.Calendar getSoDate() {
        return soDate;
    }


    /**
     * Sets the soDate value for this SAllowanceRec.
     * 
     * @param soDate
     */
    public void setSoDate(java.util.Calendar soDate) {
        this.soDate = soDate;
    }


    /**
     * Gets the orgId value for this SAllowanceRec.
     * 
     * @return orgId
     */
    public java.lang.Integer getOrgId() {
        return orgId;
    }


    /**
     * Sets the orgId value for this SAllowanceRec.
     * 
     * @param orgId
     */
    public void setOrgId(java.lang.Integer orgId) {
        this.orgId = orgId;
    }


    /**
     * Gets the opId value for this SAllowanceRec.
     * 
     * @return opId
     */
    public java.lang.Long getOpId() {
        return opId;
    }


    /**
     * Sets the opId value for this SAllowanceRec.
     * 
     * @param opId
     */
    public void setOpId(java.lang.Long opId) {
        this.opId = opId;
    }


    /**
     * Gets the detailList value for this SAllowanceRec.
     * 
     * @return detailList
     */
    public com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SAllowanceRecDetail[] getDetailList() {
        return detailList;
    }


    /**
     * Sets the detailList value for this SAllowanceRec.
     * 
     * @param detailList
     */
    public void setDetailList(com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SAllowanceRecDetail[] detailList) {
        this.detailList = detailList;
    }

    public com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SAllowanceRecDetail getDetailList(int i) {
        return this.detailList[i];
    }

    public void setDetailList(int i, com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SAllowanceRecDetail _value) {
        this.detailList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SAllowanceRec)) return false;
        SAllowanceRec other = (SAllowanceRec) obj;
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
            ((this.resourceId==null && other.getResourceId()==null) || 
             (this.resourceId!=null &&
              this.resourceId.equals(other.getResourceId()))) &&
            ((this.phoneId==null && other.getPhoneId()==null) || 
             (this.phoneId!=null &&
              this.phoneId.equals(other.getPhoneId()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.soDate==null && other.getSoDate()==null) || 
             (this.soDate!=null &&
              this.soDate.equals(other.getSoDate()))) &&
            ((this.orgId==null && other.getOrgId()==null) || 
             (this.orgId!=null &&
              this.orgId.equals(other.getOrgId()))) &&
            ((this.opId==null && other.getOpId()==null) || 
             (this.opId!=null &&
              this.opId.equals(other.getOpId()))) &&
            ((this.detailList==null && other.getDetailList()==null) || 
             (this.detailList!=null &&
              java.util.Arrays.equals(this.detailList, other.getDetailList())));
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
        if (getResourceId() != null) {
            _hashCode += getResourceId().hashCode();
        }
        if (getPhoneId() != null) {
            _hashCode += getPhoneId().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getSoDate() != null) {
            _hashCode += getSoDate().hashCode();
        }
        if (getOrgId() != null) {
            _hashCode += getOrgId().hashCode();
        }
        if (getOpId() != null) {
            _hashCode += getOpId().hashCode();
        }
        if (getDetailList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetailList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetailList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SAllowanceRec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAllowanceRec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("phoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneId"));
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
        elemField.setFieldName("measureId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measureId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("orgId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "opId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "detailList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAllowanceRecDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
