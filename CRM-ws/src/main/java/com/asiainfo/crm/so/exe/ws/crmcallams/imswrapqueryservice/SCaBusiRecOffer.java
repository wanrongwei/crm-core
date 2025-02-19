/**
 * SCaBusiRecOffer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class SCaBusiRecOffer  implements java.io.Serializable {
    private java.lang.Long offerId;

    private java.lang.String imei;

    private java.lang.Integer installType;

    private java.lang.Integer retailType;

    private java.lang.Long allowanceAmount;

    private java.lang.Integer isRegret;

    public SCaBusiRecOffer() {
    }

    public SCaBusiRecOffer(
           java.lang.Long offerId,
           java.lang.String imei,
           java.lang.Integer installType,
           java.lang.Integer retailType,
           java.lang.Long allowanceAmount,
           java.lang.Integer isRegret) {
           this.offerId = offerId;
           this.imei = imei;
           this.installType = installType;
           this.retailType = retailType;
           this.allowanceAmount = allowanceAmount;
           this.isRegret = isRegret;
    }


    /**
     * Gets the offerId value for this SCaBusiRecOffer.
     * 
     * @return offerId
     */
    public java.lang.Long getOfferId() {
        return offerId;
    }


    /**
     * Sets the offerId value for this SCaBusiRecOffer.
     * 
     * @param offerId
     */
    public void setOfferId(java.lang.Long offerId) {
        this.offerId = offerId;
    }


    /**
     * Gets the imei value for this SCaBusiRecOffer.
     * 
     * @return imei
     */
    public java.lang.String getImei() {
        return imei;
    }


    /**
     * Sets the imei value for this SCaBusiRecOffer.
     * 
     * @param imei
     */
    public void setImei(java.lang.String imei) {
        this.imei = imei;
    }


    /**
     * Gets the installType value for this SCaBusiRecOffer.
     * 
     * @return installType
     */
    public java.lang.Integer getInstallType() {
        return installType;
    }


    /**
     * Sets the installType value for this SCaBusiRecOffer.
     * 
     * @param installType
     */
    public void setInstallType(java.lang.Integer installType) {
        this.installType = installType;
    }


    /**
     * Gets the retailType value for this SCaBusiRecOffer.
     * 
     * @return retailType
     */
    public java.lang.Integer getRetailType() {
        return retailType;
    }


    /**
     * Sets the retailType value for this SCaBusiRecOffer.
     * 
     * @param retailType
     */
    public void setRetailType(java.lang.Integer retailType) {
        this.retailType = retailType;
    }


    /**
     * Gets the allowanceAmount value for this SCaBusiRecOffer.
     * 
     * @return allowanceAmount
     */
    public java.lang.Long getAllowanceAmount() {
        return allowanceAmount;
    }


    /**
     * Sets the allowanceAmount value for this SCaBusiRecOffer.
     * 
     * @param allowanceAmount
     */
    public void setAllowanceAmount(java.lang.Long allowanceAmount) {
        this.allowanceAmount = allowanceAmount;
    }


    /**
     * Gets the isRegret value for this SCaBusiRecOffer.
     * 
     * @return isRegret
     */
    public java.lang.Integer getIsRegret() {
        return isRegret;
    }


    /**
     * Sets the isRegret value for this SCaBusiRecOffer.
     * 
     * @param isRegret
     */
    public void setIsRegret(java.lang.Integer isRegret) {
        this.isRegret = isRegret;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SCaBusiRecOffer)) return false;
        SCaBusiRecOffer other = (SCaBusiRecOffer) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.offerId==null && other.getOfferId()==null) || 
             (this.offerId!=null &&
              this.offerId.equals(other.getOfferId()))) &&
            ((this.imei==null && other.getImei()==null) || 
             (this.imei!=null &&
              this.imei.equals(other.getImei()))) &&
            ((this.installType==null && other.getInstallType()==null) || 
             (this.installType!=null &&
              this.installType.equals(other.getInstallType()))) &&
            ((this.retailType==null && other.getRetailType()==null) || 
             (this.retailType!=null &&
              this.retailType.equals(other.getRetailType()))) &&
            ((this.allowanceAmount==null && other.getAllowanceAmount()==null) || 
             (this.allowanceAmount!=null &&
              this.allowanceAmount.equals(other.getAllowanceAmount()))) &&
            ((this.isRegret==null && other.getIsRegret()==null) || 
             (this.isRegret!=null &&
              this.isRegret.equals(other.getIsRegret())));
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
        if (getOfferId() != null) {
            _hashCode += getOfferId().hashCode();
        }
        if (getImei() != null) {
            _hashCode += getImei().hashCode();
        }
        if (getInstallType() != null) {
            _hashCode += getInstallType().hashCode();
        }
        if (getRetailType() != null) {
            _hashCode += getRetailType().hashCode();
        }
        if (getAllowanceAmount() != null) {
            _hashCode += getAllowanceAmount().hashCode();
        }
        if (getIsRegret() != null) {
            _hashCode += getIsRegret().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SCaBusiRecOffer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCaBusiRecOffer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imei");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imei"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("installType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "installType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retailType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retailType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowanceAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allowanceAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRegret");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isRegret"));
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
