/**
 * DoAdjBetweenAcctInReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class DoAdjBetweenAcctInReq  implements java.io.Serializable {
    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    private java.lang.Long debitAcctId;

    private java.lang.Long creditAcctId;

    private java.lang.Long custId;

    private java.lang.Double amount;

    private java.lang.Integer measureId;

    private java.lang.String reason;

    private java.lang.Long acctId;

    private java.lang.Long tagAcctId;

    private java.lang.Integer ownType;

    private java.lang.String ownId;

    private java.lang.Integer targetType;

    private java.lang.String targetId;

    private java.lang.Long soNbr;

    private java.util.Calendar soDate;

    public DoAdjBetweenAcctInReq() {
    }

    public DoAdjBetweenAcctInReq(
           java.util.Calendar startDate,
           java.util.Calendar endDate,
           java.lang.Long debitAcctId,
           java.lang.Long creditAcctId,
           java.lang.Long custId,
           java.lang.Double amount,
           java.lang.Integer measureId,
           java.lang.String reason,
           java.lang.Long acctId,
           java.lang.Long tagAcctId,
           java.lang.Integer ownType,
           java.lang.String ownId,
           java.lang.Integer targetType,
           java.lang.String targetId,
           java.lang.Long soNbr,
           java.util.Calendar soDate) {
           this.startDate = startDate;
           this.endDate = endDate;
           this.debitAcctId = debitAcctId;
           this.creditAcctId = creditAcctId;
           this.custId = custId;
           this.amount = amount;
           this.measureId = measureId;
           this.reason = reason;
           this.acctId = acctId;
           this.tagAcctId = tagAcctId;
           this.ownType = ownType;
           this.ownId = ownId;
           this.targetType = targetType;
           this.targetId = targetId;
           this.soNbr = soNbr;
           this.soDate = soDate;
    }


    /**
     * Gets the startDate value for this DoAdjBetweenAcctInReq.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this DoAdjBetweenAcctInReq.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this DoAdjBetweenAcctInReq.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this DoAdjBetweenAcctInReq.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the debitAcctId value for this DoAdjBetweenAcctInReq.
     * 
     * @return debitAcctId
     */
    public java.lang.Long getDebitAcctId() {
        return debitAcctId;
    }


    /**
     * Sets the debitAcctId value for this DoAdjBetweenAcctInReq.
     * 
     * @param debitAcctId
     */
    public void setDebitAcctId(java.lang.Long debitAcctId) {
        this.debitAcctId = debitAcctId;
    }


    /**
     * Gets the creditAcctId value for this DoAdjBetweenAcctInReq.
     * 
     * @return creditAcctId
     */
    public java.lang.Long getCreditAcctId() {
        return creditAcctId;
    }


    /**
     * Sets the creditAcctId value for this DoAdjBetweenAcctInReq.
     * 
     * @param creditAcctId
     */
    public void setCreditAcctId(java.lang.Long creditAcctId) {
        this.creditAcctId = creditAcctId;
    }


    /**
     * Gets the custId value for this DoAdjBetweenAcctInReq.
     * 
     * @return custId
     */
    public java.lang.Long getCustId() {
        return custId;
    }


    /**
     * Sets the custId value for this DoAdjBetweenAcctInReq.
     * 
     * @param custId
     */
    public void setCustId(java.lang.Long custId) {
        this.custId = custId;
    }


    /**
     * Gets the amount value for this DoAdjBetweenAcctInReq.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this DoAdjBetweenAcctInReq.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }


    /**
     * Gets the measureId value for this DoAdjBetweenAcctInReq.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this DoAdjBetweenAcctInReq.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the reason value for this DoAdjBetweenAcctInReq.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this DoAdjBetweenAcctInReq.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }


    /**
     * Gets the acctId value for this DoAdjBetweenAcctInReq.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this DoAdjBetweenAcctInReq.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the tagAcctId value for this DoAdjBetweenAcctInReq.
     * 
     * @return tagAcctId
     */
    public java.lang.Long getTagAcctId() {
        return tagAcctId;
    }


    /**
     * Sets the tagAcctId value for this DoAdjBetweenAcctInReq.
     * 
     * @param tagAcctId
     */
    public void setTagAcctId(java.lang.Long tagAcctId) {
        this.tagAcctId = tagAcctId;
    }


    /**
     * Gets the ownType value for this DoAdjBetweenAcctInReq.
     * 
     * @return ownType
     */
    public java.lang.Integer getOwnType() {
        return ownType;
    }


    /**
     * Sets the ownType value for this DoAdjBetweenAcctInReq.
     * 
     * @param ownType
     */
    public void setOwnType(java.lang.Integer ownType) {
        this.ownType = ownType;
    }


    /**
     * Gets the ownId value for this DoAdjBetweenAcctInReq.
     * 
     * @return ownId
     */
    public java.lang.String getOwnId() {
        return ownId;
    }


    /**
     * Sets the ownId value for this DoAdjBetweenAcctInReq.
     * 
     * @param ownId
     */
    public void setOwnId(java.lang.String ownId) {
        this.ownId = ownId;
    }


    /**
     * Gets the targetType value for this DoAdjBetweenAcctInReq.
     * 
     * @return targetType
     */
    public java.lang.Integer getTargetType() {
        return targetType;
    }


    /**
     * Sets the targetType value for this DoAdjBetweenAcctInReq.
     * 
     * @param targetType
     */
    public void setTargetType(java.lang.Integer targetType) {
        this.targetType = targetType;
    }


    /**
     * Gets the targetId value for this DoAdjBetweenAcctInReq.
     * 
     * @return targetId
     */
    public java.lang.String getTargetId() {
        return targetId;
    }


    /**
     * Sets the targetId value for this DoAdjBetweenAcctInReq.
     * 
     * @param targetId
     */
    public void setTargetId(java.lang.String targetId) {
        this.targetId = targetId;
    }


    /**
     * Gets the soNbr value for this DoAdjBetweenAcctInReq.
     * 
     * @return soNbr
     */
    public java.lang.Long getSoNbr() {
        return soNbr;
    }


    /**
     * Sets the soNbr value for this DoAdjBetweenAcctInReq.
     * 
     * @param soNbr
     */
    public void setSoNbr(java.lang.Long soNbr) {
        this.soNbr = soNbr;
    }


    /**
     * Gets the soDate value for this DoAdjBetweenAcctInReq.
     * 
     * @return soDate
     */
    public java.util.Calendar getSoDate() {
        return soDate;
    }


    /**
     * Sets the soDate value for this DoAdjBetweenAcctInReq.
     * 
     * @param soDate
     */
    public void setSoDate(java.util.Calendar soDate) {
        this.soDate = soDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoAdjBetweenAcctInReq)) return false;
        DoAdjBetweenAcctInReq other = (DoAdjBetweenAcctInReq) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.debitAcctId==null && other.getDebitAcctId()==null) || 
             (this.debitAcctId!=null &&
              this.debitAcctId.equals(other.getDebitAcctId()))) &&
            ((this.creditAcctId==null && other.getCreditAcctId()==null) || 
             (this.creditAcctId!=null &&
              this.creditAcctId.equals(other.getCreditAcctId()))) &&
            ((this.custId==null && other.getCustId()==null) || 
             (this.custId!=null &&
              this.custId.equals(other.getCustId()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.tagAcctId==null && other.getTagAcctId()==null) || 
             (this.tagAcctId!=null &&
              this.tagAcctId.equals(other.getTagAcctId()))) &&
            ((this.ownType==null && other.getOwnType()==null) || 
             (this.ownType!=null &&
              this.ownType.equals(other.getOwnType()))) &&
            ((this.ownId==null && other.getOwnId()==null) || 
             (this.ownId!=null &&
              this.ownId.equals(other.getOwnId()))) &&
            ((this.targetType==null && other.getTargetType()==null) || 
             (this.targetType!=null &&
              this.targetType.equals(other.getTargetType()))) &&
            ((this.targetId==null && other.getTargetId()==null) || 
             (this.targetId!=null &&
              this.targetId.equals(other.getTargetId()))) &&
            ((this.soNbr==null && other.getSoNbr()==null) || 
             (this.soNbr!=null &&
              this.soNbr.equals(other.getSoNbr()))) &&
            ((this.soDate==null && other.getSoDate()==null) || 
             (this.soDate!=null &&
              this.soDate.equals(other.getSoDate())));
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
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getDebitAcctId() != null) {
            _hashCode += getDebitAcctId().hashCode();
        }
        if (getCreditAcctId() != null) {
            _hashCode += getCreditAcctId().hashCode();
        }
        if (getCustId() != null) {
            _hashCode += getCustId().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getTagAcctId() != null) {
            _hashCode += getTagAcctId().hashCode();
        }
        if (getOwnType() != null) {
            _hashCode += getOwnType().hashCode();
        }
        if (getOwnId() != null) {
            _hashCode += getOwnId().hashCode();
        }
        if (getTargetType() != null) {
            _hashCode += getTargetType().hashCode();
        }
        if (getTargetId() != null) {
            _hashCode += getTargetId().hashCode();
        }
        if (getSoNbr() != null) {
            _hashCode += getSoNbr().hashCode();
        }
        if (getSoDate() != null) {
            _hashCode += getSoDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoAdjBetweenAcctInReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAdjBetweenAcctInReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "debitAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditAcctId"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("tagAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tagAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
