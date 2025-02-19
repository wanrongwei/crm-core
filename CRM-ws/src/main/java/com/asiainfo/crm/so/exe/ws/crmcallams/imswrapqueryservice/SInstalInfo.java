/**
 * SInstalInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class SInstalInfo  implements java.io.Serializable {
    private java.lang.Short instalType;

    private java.lang.Long downPayment;

    private java.lang.Long instalAmount;

    private java.lang.Integer cycleCount;

    private java.lang.Long cycleAmount;

    private java.lang.Short roundingType;

    private java.lang.Long handlingCharge;

    private java.lang.Short chargeType;

    private java.lang.Integer measureId;

    private java.lang.Short needLetter;

    private java.lang.Long resourceId;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SInstalOffer[] instalOfferList;

    private java.lang.String agreementId;

    private java.lang.Boolean generateAgrmnt;

    public SInstalInfo() {
    }

    public SInstalInfo(
           java.lang.Short instalType,
           java.lang.Long downPayment,
           java.lang.Long instalAmount,
           java.lang.Integer cycleCount,
           java.lang.Long cycleAmount,
           java.lang.Short roundingType,
           java.lang.Long handlingCharge,
           java.lang.Short chargeType,
           java.lang.Integer measureId,
           java.lang.Short needLetter,
           java.lang.Long resourceId,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SInstalOffer[] instalOfferList,
           java.lang.String agreementId,
           java.lang.Boolean generateAgrmnt) {
           this.instalType = instalType;
           this.downPayment = downPayment;
           this.instalAmount = instalAmount;
           this.cycleCount = cycleCount;
           this.cycleAmount = cycleAmount;
           this.roundingType = roundingType;
           this.handlingCharge = handlingCharge;
           this.chargeType = chargeType;
           this.measureId = measureId;
           this.needLetter = needLetter;
           this.resourceId = resourceId;
           this.instalOfferList = instalOfferList;
           this.agreementId = agreementId;
           this.generateAgrmnt = generateAgrmnt;
    }


    /**
     * Gets the instalType value for this SInstalInfo.
     * 
     * @return instalType
     */
    public java.lang.Short getInstalType() {
        return instalType;
    }


    /**
     * Sets the instalType value for this SInstalInfo.
     * 
     * @param instalType
     */
    public void setInstalType(java.lang.Short instalType) {
        this.instalType = instalType;
    }


    /**
     * Gets the downPayment value for this SInstalInfo.
     * 
     * @return downPayment
     */
    public java.lang.Long getDownPayment() {
        return downPayment;
    }


    /**
     * Sets the downPayment value for this SInstalInfo.
     * 
     * @param downPayment
     */
    public void setDownPayment(java.lang.Long downPayment) {
        this.downPayment = downPayment;
    }


    /**
     * Gets the instalAmount value for this SInstalInfo.
     * 
     * @return instalAmount
     */
    public java.lang.Long getInstalAmount() {
        return instalAmount;
    }


    /**
     * Sets the instalAmount value for this SInstalInfo.
     * 
     * @param instalAmount
     */
    public void setInstalAmount(java.lang.Long instalAmount) {
        this.instalAmount = instalAmount;
    }


    /**
     * Gets the cycleCount value for this SInstalInfo.
     * 
     * @return cycleCount
     */
    public java.lang.Integer getCycleCount() {
        return cycleCount;
    }


    /**
     * Sets the cycleCount value for this SInstalInfo.
     * 
     * @param cycleCount
     */
    public void setCycleCount(java.lang.Integer cycleCount) {
        this.cycleCount = cycleCount;
    }


    /**
     * Gets the cycleAmount value for this SInstalInfo.
     * 
     * @return cycleAmount
     */
    public java.lang.Long getCycleAmount() {
        return cycleAmount;
    }


    /**
     * Sets the cycleAmount value for this SInstalInfo.
     * 
     * @param cycleAmount
     */
    public void setCycleAmount(java.lang.Long cycleAmount) {
        this.cycleAmount = cycleAmount;
    }


    /**
     * Gets the roundingType value for this SInstalInfo.
     * 
     * @return roundingType
     */
    public java.lang.Short getRoundingType() {
        return roundingType;
    }


    /**
     * Sets the roundingType value for this SInstalInfo.
     * 
     * @param roundingType
     */
    public void setRoundingType(java.lang.Short roundingType) {
        this.roundingType = roundingType;
    }


    /**
     * Gets the handlingCharge value for this SInstalInfo.
     * 
     * @return handlingCharge
     */
    public java.lang.Long getHandlingCharge() {
        return handlingCharge;
    }


    /**
     * Sets the handlingCharge value for this SInstalInfo.
     * 
     * @param handlingCharge
     */
    public void setHandlingCharge(java.lang.Long handlingCharge) {
        this.handlingCharge = handlingCharge;
    }


    /**
     * Gets the chargeType value for this SInstalInfo.
     * 
     * @return chargeType
     */
    public java.lang.Short getChargeType() {
        return chargeType;
    }


    /**
     * Sets the chargeType value for this SInstalInfo.
     * 
     * @param chargeType
     */
    public void setChargeType(java.lang.Short chargeType) {
        this.chargeType = chargeType;
    }


    /**
     * Gets the measureId value for this SInstalInfo.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this SInstalInfo.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the needLetter value for this SInstalInfo.
     * 
     * @return needLetter
     */
    public java.lang.Short getNeedLetter() {
        return needLetter;
    }


    /**
     * Sets the needLetter value for this SInstalInfo.
     * 
     * @param needLetter
     */
    public void setNeedLetter(java.lang.Short needLetter) {
        this.needLetter = needLetter;
    }


    /**
     * Gets the resourceId value for this SInstalInfo.
     * 
     * @return resourceId
     */
    public java.lang.Long getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this SInstalInfo.
     * 
     * @param resourceId
     */
    public void setResourceId(java.lang.Long resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * Gets the instalOfferList value for this SInstalInfo.
     * 
     * @return instalOfferList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SInstalOffer[] getInstalOfferList() {
        return instalOfferList;
    }


    /**
     * Sets the instalOfferList value for this SInstalInfo.
     * 
     * @param instalOfferList
     */
    public void setInstalOfferList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SInstalOffer[] instalOfferList) {
        this.instalOfferList = instalOfferList;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SInstalOffer getInstalOfferList(int i) {
        return this.instalOfferList[i];
    }

    public void setInstalOfferList(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SInstalOffer _value) {
        this.instalOfferList[i] = _value;
    }


    /**
     * Gets the agreementId value for this SInstalInfo.
     * 
     * @return agreementId
     */
    public java.lang.String getAgreementId() {
        return agreementId;
    }


    /**
     * Sets the agreementId value for this SInstalInfo.
     * 
     * @param agreementId
     */
    public void setAgreementId(java.lang.String agreementId) {
        this.agreementId = agreementId;
    }


    /**
     * Gets the generateAgrmnt value for this SInstalInfo.
     * 
     * @return generateAgrmnt
     */
    public java.lang.Boolean getGenerateAgrmnt() {
        return generateAgrmnt;
    }


    /**
     * Sets the generateAgrmnt value for this SInstalInfo.
     * 
     * @param generateAgrmnt
     */
    public void setGenerateAgrmnt(java.lang.Boolean generateAgrmnt) {
        this.generateAgrmnt = generateAgrmnt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SInstalInfo)) return false;
        SInstalInfo other = (SInstalInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.instalType==null && other.getInstalType()==null) || 
             (this.instalType!=null &&
              this.instalType.equals(other.getInstalType()))) &&
            ((this.downPayment==null && other.getDownPayment()==null) || 
             (this.downPayment!=null &&
              this.downPayment.equals(other.getDownPayment()))) &&
            ((this.instalAmount==null && other.getInstalAmount()==null) || 
             (this.instalAmount!=null &&
              this.instalAmount.equals(other.getInstalAmount()))) &&
            ((this.cycleCount==null && other.getCycleCount()==null) || 
             (this.cycleCount!=null &&
              this.cycleCount.equals(other.getCycleCount()))) &&
            ((this.cycleAmount==null && other.getCycleAmount()==null) || 
             (this.cycleAmount!=null &&
              this.cycleAmount.equals(other.getCycleAmount()))) &&
            ((this.roundingType==null && other.getRoundingType()==null) || 
             (this.roundingType!=null &&
              this.roundingType.equals(other.getRoundingType()))) &&
            ((this.handlingCharge==null && other.getHandlingCharge()==null) || 
             (this.handlingCharge!=null &&
              this.handlingCharge.equals(other.getHandlingCharge()))) &&
            ((this.chargeType==null && other.getChargeType()==null) || 
             (this.chargeType!=null &&
              this.chargeType.equals(other.getChargeType()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.needLetter==null && other.getNeedLetter()==null) || 
             (this.needLetter!=null &&
              this.needLetter.equals(other.getNeedLetter()))) &&
            ((this.resourceId==null && other.getResourceId()==null) || 
             (this.resourceId!=null &&
              this.resourceId.equals(other.getResourceId()))) &&
            ((this.instalOfferList==null && other.getInstalOfferList()==null) || 
             (this.instalOfferList!=null &&
              java.util.Arrays.equals(this.instalOfferList, other.getInstalOfferList()))) &&
            ((this.agreementId==null && other.getAgreementId()==null) || 
             (this.agreementId!=null &&
              this.agreementId.equals(other.getAgreementId()))) &&
            ((this.generateAgrmnt==null && other.getGenerateAgrmnt()==null) || 
             (this.generateAgrmnt!=null &&
              this.generateAgrmnt.equals(other.getGenerateAgrmnt())));
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
        if (getInstalType() != null) {
            _hashCode += getInstalType().hashCode();
        }
        if (getDownPayment() != null) {
            _hashCode += getDownPayment().hashCode();
        }
        if (getInstalAmount() != null) {
            _hashCode += getInstalAmount().hashCode();
        }
        if (getCycleCount() != null) {
            _hashCode += getCycleCount().hashCode();
        }
        if (getCycleAmount() != null) {
            _hashCode += getCycleAmount().hashCode();
        }
        if (getRoundingType() != null) {
            _hashCode += getRoundingType().hashCode();
        }
        if (getHandlingCharge() != null) {
            _hashCode += getHandlingCharge().hashCode();
        }
        if (getChargeType() != null) {
            _hashCode += getChargeType().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getNeedLetter() != null) {
            _hashCode += getNeedLetter().hashCode();
        }
        if (getResourceId() != null) {
            _hashCode += getResourceId().hashCode();
        }
        if (getInstalOfferList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInstalOfferList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInstalOfferList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAgreementId() != null) {
            _hashCode += getAgreementId().hashCode();
        }
        if (getGenerateAgrmnt() != null) {
            _hashCode += getGenerateAgrmnt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SInstalInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sInstalInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instalType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instalType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "downPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cycleCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cycleCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cycleAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cycleAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roundingType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "roundingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "handlingCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chargeType"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("needLetter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "needLetter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
        elemField.setFieldName("instalOfferList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instalOfferList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sInstalOffer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agreementId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agreementId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generateAgrmnt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "generateAgrmnt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
