/**
 * SBillCycle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class SBillCycle  implements java.io.Serializable {
    private java.lang.Integer cycleType;

    private java.lang.Integer cycleUnit;

    private java.lang.Integer firstBillDay;

    private java.lang.Integer seasonFlag;

    private java.util.Calendar currCycleBeginDate;

    private java.util.Calendar currCycleEndDate;

    public SBillCycle() {
    }

    public SBillCycle(
           java.lang.Integer cycleType,
           java.lang.Integer cycleUnit,
           java.lang.Integer firstBillDay,
           java.lang.Integer seasonFlag,
           java.util.Calendar currCycleBeginDate,
           java.util.Calendar currCycleEndDate) {
           this.cycleType = cycleType;
           this.cycleUnit = cycleUnit;
           this.firstBillDay = firstBillDay;
           this.seasonFlag = seasonFlag;
           this.currCycleBeginDate = currCycleBeginDate;
           this.currCycleEndDate = currCycleEndDate;
    }


    /**
     * Gets the cycleType value for this SBillCycle.
     * 
     * @return cycleType
     */
    public java.lang.Integer getCycleType() {
        return cycleType;
    }


    /**
     * Sets the cycleType value for this SBillCycle.
     * 
     * @param cycleType
     */
    public void setCycleType(java.lang.Integer cycleType) {
        this.cycleType = cycleType;
    }


    /**
     * Gets the cycleUnit value for this SBillCycle.
     * 
     * @return cycleUnit
     */
    public java.lang.Integer getCycleUnit() {
        return cycleUnit;
    }


    /**
     * Sets the cycleUnit value for this SBillCycle.
     * 
     * @param cycleUnit
     */
    public void setCycleUnit(java.lang.Integer cycleUnit) {
        this.cycleUnit = cycleUnit;
    }


    /**
     * Gets the firstBillDay value for this SBillCycle.
     * 
     * @return firstBillDay
     */
    public java.lang.Integer getFirstBillDay() {
        return firstBillDay;
    }


    /**
     * Sets the firstBillDay value for this SBillCycle.
     * 
     * @param firstBillDay
     */
    public void setFirstBillDay(java.lang.Integer firstBillDay) {
        this.firstBillDay = firstBillDay;
    }


    /**
     * Gets the seasonFlag value for this SBillCycle.
     * 
     * @return seasonFlag
     */
    public java.lang.Integer getSeasonFlag() {
        return seasonFlag;
    }


    /**
     * Sets the seasonFlag value for this SBillCycle.
     * 
     * @param seasonFlag
     */
    public void setSeasonFlag(java.lang.Integer seasonFlag) {
        this.seasonFlag = seasonFlag;
    }


    /**
     * Gets the currCycleBeginDate value for this SBillCycle.
     * 
     * @return currCycleBeginDate
     */
    public java.util.Calendar getCurrCycleBeginDate() {
        return currCycleBeginDate;
    }


    /**
     * Sets the currCycleBeginDate value for this SBillCycle.
     * 
     * @param currCycleBeginDate
     */
    public void setCurrCycleBeginDate(java.util.Calendar currCycleBeginDate) {
        this.currCycleBeginDate = currCycleBeginDate;
    }


    /**
     * Gets the currCycleEndDate value for this SBillCycle.
     * 
     * @return currCycleEndDate
     */
    public java.util.Calendar getCurrCycleEndDate() {
        return currCycleEndDate;
    }


    /**
     * Sets the currCycleEndDate value for this SBillCycle.
     * 
     * @param currCycleEndDate
     */
    public void setCurrCycleEndDate(java.util.Calendar currCycleEndDate) {
        this.currCycleEndDate = currCycleEndDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SBillCycle)) return false;
        SBillCycle other = (SBillCycle) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cycleType==null && other.getCycleType()==null) || 
             (this.cycleType!=null &&
              this.cycleType.equals(other.getCycleType()))) &&
            ((this.cycleUnit==null && other.getCycleUnit()==null) || 
             (this.cycleUnit!=null &&
              this.cycleUnit.equals(other.getCycleUnit()))) &&
            ((this.firstBillDay==null && other.getFirstBillDay()==null) || 
             (this.firstBillDay!=null &&
              this.firstBillDay.equals(other.getFirstBillDay()))) &&
            ((this.seasonFlag==null && other.getSeasonFlag()==null) || 
             (this.seasonFlag!=null &&
              this.seasonFlag.equals(other.getSeasonFlag()))) &&
            ((this.currCycleBeginDate==null && other.getCurrCycleBeginDate()==null) || 
             (this.currCycleBeginDate!=null &&
              this.currCycleBeginDate.equals(other.getCurrCycleBeginDate()))) &&
            ((this.currCycleEndDate==null && other.getCurrCycleEndDate()==null) || 
             (this.currCycleEndDate!=null &&
              this.currCycleEndDate.equals(other.getCurrCycleEndDate())));
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
        if (getCycleType() != null) {
            _hashCode += getCycleType().hashCode();
        }
        if (getCycleUnit() != null) {
            _hashCode += getCycleUnit().hashCode();
        }
        if (getFirstBillDay() != null) {
            _hashCode += getFirstBillDay().hashCode();
        }
        if (getSeasonFlag() != null) {
            _hashCode += getSeasonFlag().hashCode();
        }
        if (getCurrCycleBeginDate() != null) {
            _hashCode += getCurrCycleBeginDate().hashCode();
        }
        if (getCurrCycleEndDate() != null) {
            _hashCode += getCurrCycleEndDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SBillCycle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBillCycle"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cycleType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cycleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cycleUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cycleUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstBillDay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstBillDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seasonFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seasonFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currCycleBeginDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currCycleBeginDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currCycleEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currCycleEndDate"));
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
