/**
 * DoQueryAllowanceReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.imswrapservice;

public class DoQueryAllowanceReq  implements java.io.Serializable {
    private java.lang.Long acctId;

    private java.lang.String outerAcctId;

    private java.lang.Long userId;

    private java.lang.Integer allowanceType;

    private java.lang.Integer validType;

    private java.lang.Integer usedLogType;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    public DoQueryAllowanceReq() {
    }

    public DoQueryAllowanceReq(
           java.lang.Long acctId,
           java.lang.String outerAcctId,
           java.lang.Long userId,
           java.lang.Integer allowanceType,
           java.lang.Integer validType,
           java.lang.Integer usedLogType,
           java.util.Calendar startDate,
           java.util.Calendar endDate) {
           this.acctId = acctId;
           this.outerAcctId = outerAcctId;
           this.userId = userId;
           this.allowanceType = allowanceType;
           this.validType = validType;
           this.usedLogType = usedLogType;
           this.startDate = startDate;
           this.endDate = endDate;
    }


    /**
     * Gets the acctId value for this DoQueryAllowanceReq.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this DoQueryAllowanceReq.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the outerAcctId value for this DoQueryAllowanceReq.
     * 
     * @return outerAcctId
     */
    public java.lang.String getOuterAcctId() {
        return outerAcctId;
    }


    /**
     * Sets the outerAcctId value for this DoQueryAllowanceReq.
     * 
     * @param outerAcctId
     */
    public void setOuterAcctId(java.lang.String outerAcctId) {
        this.outerAcctId = outerAcctId;
    }


    /**
     * Gets the userId value for this DoQueryAllowanceReq.
     * 
     * @return userId
     */
    public java.lang.Long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this DoQueryAllowanceReq.
     * 
     * @param userId
     */
    public void setUserId(java.lang.Long userId) {
        this.userId = userId;
    }


    /**
     * Gets the allowanceType value for this DoQueryAllowanceReq.
     * 
     * @return allowanceType
     */
    public java.lang.Integer getAllowanceType() {
        return allowanceType;
    }


    /**
     * Sets the allowanceType value for this DoQueryAllowanceReq.
     * 
     * @param allowanceType
     */
    public void setAllowanceType(java.lang.Integer allowanceType) {
        this.allowanceType = allowanceType;
    }


    /**
     * Gets the validType value for this DoQueryAllowanceReq.
     * 
     * @return validType
     */
    public java.lang.Integer getValidType() {
        return validType;
    }


    /**
     * Sets the validType value for this DoQueryAllowanceReq.
     * 
     * @param validType
     */
    public void setValidType(java.lang.Integer validType) {
        this.validType = validType;
    }


    /**
     * Gets the usedLogType value for this DoQueryAllowanceReq.
     * 
     * @return usedLogType
     */
    public java.lang.Integer getUsedLogType() {
        return usedLogType;
    }


    /**
     * Sets the usedLogType value for this DoQueryAllowanceReq.
     * 
     * @param usedLogType
     */
    public void setUsedLogType(java.lang.Integer usedLogType) {
        this.usedLogType = usedLogType;
    }


    /**
     * Gets the startDate value for this DoQueryAllowanceReq.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this DoQueryAllowanceReq.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this DoQueryAllowanceReq.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this DoQueryAllowanceReq.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryAllowanceReq)) return false;
        DoQueryAllowanceReq other = (DoQueryAllowanceReq) obj;
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
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.allowanceType==null && other.getAllowanceType()==null) || 
             (this.allowanceType!=null &&
              this.allowanceType.equals(other.getAllowanceType()))) &&
            ((this.validType==null && other.getValidType()==null) || 
             (this.validType!=null &&
              this.validType.equals(other.getValidType()))) &&
            ((this.usedLogType==null && other.getUsedLogType()==null) || 
             (this.usedLogType!=null &&
              this.usedLogType.equals(other.getUsedLogType()))) &&
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
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getOuterAcctId() != null) {
            _hashCode += getOuterAcctId().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getAllowanceType() != null) {
            _hashCode += getAllowanceType().hashCode();
        }
        if (getValidType() != null) {
            _hashCode += getValidType().hashCode();
        }
        if (getUsedLogType() != null) {
            _hashCode += getUsedLogType().hashCode();
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
        new org.apache.axis.description.TypeDesc(DoQueryAllowanceReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryAllowanceReq"));
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
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowanceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allowanceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedLogType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usedLogType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
