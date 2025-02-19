/**
 * SQueryFreeTimes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.imswrapservice;

public class SQueryFreeTimes  implements java.io.Serializable {
    private java.lang.Integer maxFreeTime;

    private java.lang.Integer usedFreeTime;

    private java.lang.Integer remainingFreeTime;

    private java.lang.String freeFlag;

    private java.lang.Integer feeAmount;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    private java.lang.Long busiSpecId;

    public SQueryFreeTimes() {
    }

    public SQueryFreeTimes(
           java.lang.Integer maxFreeTime,
           java.lang.Integer usedFreeTime,
           java.lang.Integer remainingFreeTime,
           java.lang.String freeFlag,
           java.lang.Integer feeAmount,
           java.util.Calendar startDate,
           java.util.Calendar endDate,
           java.lang.Long busiSpecId) {
           this.maxFreeTime = maxFreeTime;
           this.usedFreeTime = usedFreeTime;
           this.remainingFreeTime = remainingFreeTime;
           this.freeFlag = freeFlag;
           this.feeAmount = feeAmount;
           this.startDate = startDate;
           this.endDate = endDate;
           this.busiSpecId = busiSpecId;
    }


    /**
     * Gets the maxFreeTime value for this SQueryFreeTimes.
     * 
     * @return maxFreeTime
     */
    public java.lang.Integer getMaxFreeTime() {
        return maxFreeTime;
    }


    /**
     * Sets the maxFreeTime value for this SQueryFreeTimes.
     * 
     * @param maxFreeTime
     */
    public void setMaxFreeTime(java.lang.Integer maxFreeTime) {
        this.maxFreeTime = maxFreeTime;
    }


    /**
     * Gets the usedFreeTime value for this SQueryFreeTimes.
     * 
     * @return usedFreeTime
     */
    public java.lang.Integer getUsedFreeTime() {
        return usedFreeTime;
    }


    /**
     * Sets the usedFreeTime value for this SQueryFreeTimes.
     * 
     * @param usedFreeTime
     */
    public void setUsedFreeTime(java.lang.Integer usedFreeTime) {
        this.usedFreeTime = usedFreeTime;
    }


    /**
     * Gets the remainingFreeTime value for this SQueryFreeTimes.
     * 
     * @return remainingFreeTime
     */
    public java.lang.Integer getRemainingFreeTime() {
        return remainingFreeTime;
    }


    /**
     * Sets the remainingFreeTime value for this SQueryFreeTimes.
     * 
     * @param remainingFreeTime
     */
    public void setRemainingFreeTime(java.lang.Integer remainingFreeTime) {
        this.remainingFreeTime = remainingFreeTime;
    }


    /**
     * Gets the freeFlag value for this SQueryFreeTimes.
     * 
     * @return freeFlag
     */
    public java.lang.String getFreeFlag() {
        return freeFlag;
    }


    /**
     * Sets the freeFlag value for this SQueryFreeTimes.
     * 
     * @param freeFlag
     */
    public void setFreeFlag(java.lang.String freeFlag) {
        this.freeFlag = freeFlag;
    }


    /**
     * Gets the feeAmount value for this SQueryFreeTimes.
     * 
     * @return feeAmount
     */
    public java.lang.Integer getFeeAmount() {
        return feeAmount;
    }


    /**
     * Sets the feeAmount value for this SQueryFreeTimes.
     * 
     * @param feeAmount
     */
    public void setFeeAmount(java.lang.Integer feeAmount) {
        this.feeAmount = feeAmount;
    }


    /**
     * Gets the startDate value for this SQueryFreeTimes.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this SQueryFreeTimes.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this SQueryFreeTimes.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this SQueryFreeTimes.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the busiSpecId value for this SQueryFreeTimes.
     * 
     * @return busiSpecId
     */
    public java.lang.Long getBusiSpecId() {
        return busiSpecId;
    }


    /**
     * Sets the busiSpecId value for this SQueryFreeTimes.
     * 
     * @param busiSpecId
     */
    public void setBusiSpecId(java.lang.Long busiSpecId) {
        this.busiSpecId = busiSpecId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SQueryFreeTimes)) return false;
        SQueryFreeTimes other = (SQueryFreeTimes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.maxFreeTime==null && other.getMaxFreeTime()==null) || 
             (this.maxFreeTime!=null &&
              this.maxFreeTime.equals(other.getMaxFreeTime()))) &&
            ((this.usedFreeTime==null && other.getUsedFreeTime()==null) || 
             (this.usedFreeTime!=null &&
              this.usedFreeTime.equals(other.getUsedFreeTime()))) &&
            ((this.remainingFreeTime==null && other.getRemainingFreeTime()==null) || 
             (this.remainingFreeTime!=null &&
              this.remainingFreeTime.equals(other.getRemainingFreeTime()))) &&
            ((this.freeFlag==null && other.getFreeFlag()==null) || 
             (this.freeFlag!=null &&
              this.freeFlag.equals(other.getFreeFlag()))) &&
            ((this.feeAmount==null && other.getFeeAmount()==null) || 
             (this.feeAmount!=null &&
              this.feeAmount.equals(other.getFeeAmount()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.busiSpecId==null && other.getBusiSpecId()==null) || 
             (this.busiSpecId!=null &&
              this.busiSpecId.equals(other.getBusiSpecId())));
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
        if (getMaxFreeTime() != null) {
            _hashCode += getMaxFreeTime().hashCode();
        }
        if (getUsedFreeTime() != null) {
            _hashCode += getUsedFreeTime().hashCode();
        }
        if (getRemainingFreeTime() != null) {
            _hashCode += getRemainingFreeTime().hashCode();
        }
        if (getFreeFlag() != null) {
            _hashCode += getFreeFlag().hashCode();
        }
        if (getFeeAmount() != null) {
            _hashCode += getFeeAmount().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getBusiSpecId() != null) {
            _hashCode += getBusiSpecId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SQueryFreeTimes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryFreeTimes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxFreeTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxFreeTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedFreeTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usedFreeTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainingFreeTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remainingFreeTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freeFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feeAmount"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("busiSpecId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "busiSpecId"));
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
