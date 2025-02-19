/**
 * MnpReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class MnpReq  implements java.io.Serializable {
    private java.lang.String numberBegin;

    private java.lang.String numberEnd;

    private java.lang.Integer deviceType;

    private java.lang.String currentServiceOperator;

    private java.lang.String currentNetWorkOperator;

    private java.lang.Short regionCode;

    private java.util.Calendar validDate;

    private java.lang.Integer mnpFlag;

    private java.lang.String chargingInfo;

    public MnpReq() {
    }

    public MnpReq(
           java.lang.String numberBegin,
           java.lang.String numberEnd,
           java.lang.Integer deviceType,
           java.lang.String currentServiceOperator,
           java.lang.String currentNetWorkOperator,
           java.lang.Short regionCode,
           java.util.Calendar validDate,
           java.lang.Integer mnpFlag,
           java.lang.String chargingInfo) {
           this.numberBegin = numberBegin;
           this.numberEnd = numberEnd;
           this.deviceType = deviceType;
           this.currentServiceOperator = currentServiceOperator;
           this.currentNetWorkOperator = currentNetWorkOperator;
           this.regionCode = regionCode;
           this.validDate = validDate;
           this.mnpFlag = mnpFlag;
           this.chargingInfo = chargingInfo;
    }


    /**
     * Gets the numberBegin value for this MnpReq.
     * 
     * @return numberBegin
     */
    public java.lang.String getNumberBegin() {
        return numberBegin;
    }


    /**
     * Sets the numberBegin value for this MnpReq.
     * 
     * @param numberBegin
     */
    public void setNumberBegin(java.lang.String numberBegin) {
        this.numberBegin = numberBegin;
    }


    /**
     * Gets the numberEnd value for this MnpReq.
     * 
     * @return numberEnd
     */
    public java.lang.String getNumberEnd() {
        return numberEnd;
    }


    /**
     * Sets the numberEnd value for this MnpReq.
     * 
     * @param numberEnd
     */
    public void setNumberEnd(java.lang.String numberEnd) {
        this.numberEnd = numberEnd;
    }


    /**
     * Gets the deviceType value for this MnpReq.
     * 
     * @return deviceType
     */
    public java.lang.Integer getDeviceType() {
        return deviceType;
    }


    /**
     * Sets the deviceType value for this MnpReq.
     * 
     * @param deviceType
     */
    public void setDeviceType(java.lang.Integer deviceType) {
        this.deviceType = deviceType;
    }


    /**
     * Gets the currentServiceOperator value for this MnpReq.
     * 
     * @return currentServiceOperator
     */
    public java.lang.String getCurrentServiceOperator() {
        return currentServiceOperator;
    }


    /**
     * Sets the currentServiceOperator value for this MnpReq.
     * 
     * @param currentServiceOperator
     */
    public void setCurrentServiceOperator(java.lang.String currentServiceOperator) {
        this.currentServiceOperator = currentServiceOperator;
    }


    /**
     * Gets the currentNetWorkOperator value for this MnpReq.
     * 
     * @return currentNetWorkOperator
     */
    public java.lang.String getCurrentNetWorkOperator() {
        return currentNetWorkOperator;
    }


    /**
     * Sets the currentNetWorkOperator value for this MnpReq.
     * 
     * @param currentNetWorkOperator
     */
    public void setCurrentNetWorkOperator(java.lang.String currentNetWorkOperator) {
        this.currentNetWorkOperator = currentNetWorkOperator;
    }


    /**
     * Gets the regionCode value for this MnpReq.
     * 
     * @return regionCode
     */
    public java.lang.Short getRegionCode() {
        return regionCode;
    }


    /**
     * Sets the regionCode value for this MnpReq.
     * 
     * @param regionCode
     */
    public void setRegionCode(java.lang.Short regionCode) {
        this.regionCode = regionCode;
    }


    /**
     * Gets the validDate value for this MnpReq.
     * 
     * @return validDate
     */
    public java.util.Calendar getValidDate() {
        return validDate;
    }


    /**
     * Sets the validDate value for this MnpReq.
     * 
     * @param validDate
     */
    public void setValidDate(java.util.Calendar validDate) {
        this.validDate = validDate;
    }


    /**
     * Gets the mnpFlag value for this MnpReq.
     * 
     * @return mnpFlag
     */
    public java.lang.Integer getMnpFlag() {
        return mnpFlag;
    }


    /**
     * Sets the mnpFlag value for this MnpReq.
     * 
     * @param mnpFlag
     */
    public void setMnpFlag(java.lang.Integer mnpFlag) {
        this.mnpFlag = mnpFlag;
    }


    /**
     * Gets the chargingInfo value for this MnpReq.
     * 
     * @return chargingInfo
     */
    public java.lang.String getChargingInfo() {
        return chargingInfo;
    }


    /**
     * Sets the chargingInfo value for this MnpReq.
     * 
     * @param chargingInfo
     */
    public void setChargingInfo(java.lang.String chargingInfo) {
        this.chargingInfo = chargingInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MnpReq)) return false;
        MnpReq other = (MnpReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numberBegin==null && other.getNumberBegin()==null) || 
             (this.numberBegin!=null &&
              this.numberBegin.equals(other.getNumberBegin()))) &&
            ((this.numberEnd==null && other.getNumberEnd()==null) || 
             (this.numberEnd!=null &&
              this.numberEnd.equals(other.getNumberEnd()))) &&
            ((this.deviceType==null && other.getDeviceType()==null) || 
             (this.deviceType!=null &&
              this.deviceType.equals(other.getDeviceType()))) &&
            ((this.currentServiceOperator==null && other.getCurrentServiceOperator()==null) || 
             (this.currentServiceOperator!=null &&
              this.currentServiceOperator.equals(other.getCurrentServiceOperator()))) &&
            ((this.currentNetWorkOperator==null && other.getCurrentNetWorkOperator()==null) || 
             (this.currentNetWorkOperator!=null &&
              this.currentNetWorkOperator.equals(other.getCurrentNetWorkOperator()))) &&
            ((this.regionCode==null && other.getRegionCode()==null) || 
             (this.regionCode!=null &&
              this.regionCode.equals(other.getRegionCode()))) &&
            ((this.validDate==null && other.getValidDate()==null) || 
             (this.validDate!=null &&
              this.validDate.equals(other.getValidDate()))) &&
            ((this.mnpFlag==null && other.getMnpFlag()==null) || 
             (this.mnpFlag!=null &&
              this.mnpFlag.equals(other.getMnpFlag()))) &&
            ((this.chargingInfo==null && other.getChargingInfo()==null) || 
             (this.chargingInfo!=null &&
              this.chargingInfo.equals(other.getChargingInfo())));
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
        if (getNumberBegin() != null) {
            _hashCode += getNumberBegin().hashCode();
        }
        if (getNumberEnd() != null) {
            _hashCode += getNumberEnd().hashCode();
        }
        if (getDeviceType() != null) {
            _hashCode += getDeviceType().hashCode();
        }
        if (getCurrentServiceOperator() != null) {
            _hashCode += getCurrentServiceOperator().hashCode();
        }
        if (getCurrentNetWorkOperator() != null) {
            _hashCode += getCurrentNetWorkOperator().hashCode();
        }
        if (getRegionCode() != null) {
            _hashCode += getRegionCode().hashCode();
        }
        if (getValidDate() != null) {
            _hashCode += getValidDate().hashCode();
        }
        if (getMnpFlag() != null) {
            _hashCode += getMnpFlag().hashCode();
        }
        if (getChargingInfo() != null) {
            _hashCode += getChargingInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MnpReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "mnpReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberBegin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberBegin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentServiceOperator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currentServiceOperator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentNetWorkOperator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currentNetWorkOperator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mnpFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mnpFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargingInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargingInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
