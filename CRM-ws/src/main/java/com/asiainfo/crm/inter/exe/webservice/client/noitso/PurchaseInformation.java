/**
 * PurchaseInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.noitso;

public class PurchaseInformation  implements java.io.Serializable {
    private int noOfSubscriptions;

    private java.lang.Boolean isHighRiskDevice;

    private boolean isNumberPorting;

    private long amount;

    private java.lang.Long switchAmount;

    private java.lang.Long hardwareListPrice;

    private java.lang.Long hardwareAskingPrice;

    public PurchaseInformation() {
    }

    public PurchaseInformation(
           int noOfSubscriptions,
           java.lang.Boolean isHighRiskDevice,
           boolean isNumberPorting,
           long amount,
           java.lang.Long switchAmount,
           java.lang.Long hardwareListPrice,
           java.lang.Long hardwareAskingPrice) {
           this.noOfSubscriptions = noOfSubscriptions;
           this.isHighRiskDevice = isHighRiskDevice;
           this.isNumberPorting = isNumberPorting;
           this.amount = amount;
           this.switchAmount = switchAmount;
           this.hardwareListPrice = hardwareListPrice;
           this.hardwareAskingPrice = hardwareAskingPrice;
    }


    /**
     * Gets the noOfSubscriptions value for this PurchaseInformation.
     * 
     * @return noOfSubscriptions
     */
    public int getNoOfSubscriptions() {
        return noOfSubscriptions;
    }


    /**
     * Sets the noOfSubscriptions value for this PurchaseInformation.
     * 
     * @param noOfSubscriptions
     */
    public void setNoOfSubscriptions(int noOfSubscriptions) {
        this.noOfSubscriptions = noOfSubscriptions;
    }


    /**
     * Gets the isHighRiskDevice value for this PurchaseInformation.
     * 
     * @return isHighRiskDevice
     */
    public java.lang.Boolean getIsHighRiskDevice() {
        return isHighRiskDevice;
    }


    /**
     * Sets the isHighRiskDevice value for this PurchaseInformation.
     * 
     * @param isHighRiskDevice
     */
    public void setIsHighRiskDevice(java.lang.Boolean isHighRiskDevice) {
        this.isHighRiskDevice = isHighRiskDevice;
    }


    /**
     * Gets the isNumberPorting value for this PurchaseInformation.
     * 
     * @return isNumberPorting
     */
    public boolean isIsNumberPorting() {
        return isNumberPorting;
    }


    /**
     * Sets the isNumberPorting value for this PurchaseInformation.
     * 
     * @param isNumberPorting
     */
    public void setIsNumberPorting(boolean isNumberPorting) {
        this.isNumberPorting = isNumberPorting;
    }


    /**
     * Gets the amount value for this PurchaseInformation.
     * 
     * @return amount
     */
    public long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this PurchaseInformation.
     * 
     * @param amount
     */
    public void setAmount(long amount) {
        this.amount = amount;
    }


    /**
     * Gets the switchAmount value for this PurchaseInformation.
     * 
     * @return switchAmount
     */
    public java.lang.Long getSwitchAmount() {
        return switchAmount;
    }


    /**
     * Sets the switchAmount value for this PurchaseInformation.
     * 
     * @param switchAmount
     */
    public void setSwitchAmount(java.lang.Long switchAmount) {
        this.switchAmount = switchAmount;
    }


    /**
     * Gets the hardwareListPrice value for this PurchaseInformation.
     * 
     * @return hardwareListPrice
     */
    public java.lang.Long getHardwareListPrice() {
        return hardwareListPrice;
    }


    /**
     * Sets the hardwareListPrice value for this PurchaseInformation.
     * 
     * @param hardwareListPrice
     */
    public void setHardwareListPrice(java.lang.Long hardwareListPrice) {
        this.hardwareListPrice = hardwareListPrice;
    }


    /**
     * Gets the hardwareAskingPrice value for this PurchaseInformation.
     * 
     * @return hardwareAskingPrice
     */
    public java.lang.Long getHardwareAskingPrice() {
        return hardwareAskingPrice;
    }


    /**
     * Sets the hardwareAskingPrice value for this PurchaseInformation.
     * 
     * @param hardwareAskingPrice
     */
    public void setHardwareAskingPrice(java.lang.Long hardwareAskingPrice) {
        this.hardwareAskingPrice = hardwareAskingPrice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseInformation)) return false;
        PurchaseInformation other = (PurchaseInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.noOfSubscriptions == other.getNoOfSubscriptions() &&
            ((this.isHighRiskDevice==null && other.getIsHighRiskDevice()==null) || 
             (this.isHighRiskDevice!=null &&
              this.isHighRiskDevice.equals(other.getIsHighRiskDevice()))) &&
            this.isNumberPorting == other.isIsNumberPorting() &&
            this.amount == other.getAmount() &&
            ((this.switchAmount==null && other.getSwitchAmount()==null) || 
             (this.switchAmount!=null &&
              this.switchAmount.equals(other.getSwitchAmount()))) &&
            ((this.hardwareListPrice==null && other.getHardwareListPrice()==null) || 
             (this.hardwareListPrice!=null &&
              this.hardwareListPrice.equals(other.getHardwareListPrice()))) &&
            ((this.hardwareAskingPrice==null && other.getHardwareAskingPrice()==null) || 
             (this.hardwareAskingPrice!=null &&
              this.hardwareAskingPrice.equals(other.getHardwareAskingPrice())));
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
        _hashCode += getNoOfSubscriptions();
        if (getIsHighRiskDevice() != null) {
            _hashCode += getIsHighRiskDevice().hashCode();
        }
        _hashCode += (isIsNumberPorting() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getAmount()).hashCode();
        if (getSwitchAmount() != null) {
            _hashCode += getSwitchAmount().hashCode();
        }
        if (getHardwareListPrice() != null) {
            _hashCode += getHardwareListPrice().hashCode();
        }
        if (getHardwareAskingPrice() != null) {
            _hashCode += getHardwareAskingPrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchaseInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "PurchaseInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noOfSubscriptions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noOfSubscriptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isHighRiskDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isHighRiskDevice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNumberPorting");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isNumberPorting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("switchAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "switchAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hardwareListPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hardwareListPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hardwareAskingPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hardwareAskingPrice"));
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
