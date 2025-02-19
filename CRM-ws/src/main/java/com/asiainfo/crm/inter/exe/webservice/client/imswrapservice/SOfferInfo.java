/**
 * SOfferInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.imswrapservice;

public class SOfferInfo  implements java.io.Serializable {
    private com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SOfferFee[] offerFeeList;

    private java.lang.Long upcOfferId;

    private java.lang.String upcOfferName;

    private java.lang.String materialCode;

    private java.lang.String iMEI;

    private java.lang.Integer quantity;

    private java.lang.Integer installType;

    private java.lang.Long installOfferId;

    public SOfferInfo() {
    }

    public SOfferInfo(
           com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SOfferFee[] offerFeeList,
           java.lang.Long upcOfferId,
           java.lang.String upcOfferName,
           java.lang.String materialCode,
           java.lang.String iMEI,
           java.lang.Integer quantity,
           java.lang.Integer installType,
           java.lang.Long installOfferId) {
           this.offerFeeList = offerFeeList;
           this.upcOfferId = upcOfferId;
           this.upcOfferName = upcOfferName;
           this.materialCode = materialCode;
           this.iMEI = iMEI;
           this.quantity = quantity;
           this.installType = installType;
           this.installOfferId = installOfferId;
    }


    /**
     * Gets the offerFeeList value for this SOfferInfo.
     * 
     * @return offerFeeList
     */
    public com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SOfferFee[] getOfferFeeList() {
        return offerFeeList;
    }


    /**
     * Sets the offerFeeList value for this SOfferInfo.
     * 
     * @param offerFeeList
     */
    public void setOfferFeeList(com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SOfferFee[] offerFeeList) {
        this.offerFeeList = offerFeeList;
    }

    public com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SOfferFee getOfferFeeList(int i) {
        return this.offerFeeList[i];
    }

    public void setOfferFeeList(int i, com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SOfferFee _value) {
        this.offerFeeList[i] = _value;
    }


    /**
     * Gets the upcOfferId value for this SOfferInfo.
     * 
     * @return upcOfferId
     */
    public java.lang.Long getUpcOfferId() {
        return upcOfferId;
    }


    /**
     * Sets the upcOfferId value for this SOfferInfo.
     * 
     * @param upcOfferId
     */
    public void setUpcOfferId(java.lang.Long upcOfferId) {
        this.upcOfferId = upcOfferId;
    }


    /**
     * Gets the upcOfferName value for this SOfferInfo.
     * 
     * @return upcOfferName
     */
    public java.lang.String getUpcOfferName() {
        return upcOfferName;
    }


    /**
     * Sets the upcOfferName value for this SOfferInfo.
     * 
     * @param upcOfferName
     */
    public void setUpcOfferName(java.lang.String upcOfferName) {
        this.upcOfferName = upcOfferName;
    }


    /**
     * Gets the materialCode value for this SOfferInfo.
     * 
     * @return materialCode
     */
    public java.lang.String getMaterialCode() {
        return materialCode;
    }


    /**
     * Sets the materialCode value for this SOfferInfo.
     * 
     * @param materialCode
     */
    public void setMaterialCode(java.lang.String materialCode) {
        this.materialCode = materialCode;
    }


    /**
     * Gets the iMEI value for this SOfferInfo.
     * 
     * @return iMEI
     */
    public java.lang.String getIMEI() {
        return iMEI;
    }


    /**
     * Sets the iMEI value for this SOfferInfo.
     * 
     * @param iMEI
     */
    public void setIMEI(java.lang.String iMEI) {
        this.iMEI = iMEI;
    }


    /**
     * Gets the quantity value for this SOfferInfo.
     * 
     * @return quantity
     */
    public java.lang.Integer getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this SOfferInfo.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.Integer quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the installType value for this SOfferInfo.
     * 
     * @return installType
     */
    public java.lang.Integer getInstallType() {
        return installType;
    }


    /**
     * Sets the installType value for this SOfferInfo.
     * 
     * @param installType
     */
    public void setInstallType(java.lang.Integer installType) {
        this.installType = installType;
    }


    /**
     * Gets the installOfferId value for this SOfferInfo.
     * 
     * @return installOfferId
     */
    public java.lang.Long getInstallOfferId() {
        return installOfferId;
    }


    /**
     * Sets the installOfferId value for this SOfferInfo.
     * 
     * @param installOfferId
     */
    public void setInstallOfferId(java.lang.Long installOfferId) {
        this.installOfferId = installOfferId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SOfferInfo)) return false;
        SOfferInfo other = (SOfferInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.offerFeeList==null && other.getOfferFeeList()==null) || 
             (this.offerFeeList!=null &&
              java.util.Arrays.equals(this.offerFeeList, other.getOfferFeeList()))) &&
            ((this.upcOfferId==null && other.getUpcOfferId()==null) || 
             (this.upcOfferId!=null &&
              this.upcOfferId.equals(other.getUpcOfferId()))) &&
            ((this.upcOfferName==null && other.getUpcOfferName()==null) || 
             (this.upcOfferName!=null &&
              this.upcOfferName.equals(other.getUpcOfferName()))) &&
            ((this.materialCode==null && other.getMaterialCode()==null) || 
             (this.materialCode!=null &&
              this.materialCode.equals(other.getMaterialCode()))) &&
            ((this.iMEI==null && other.getIMEI()==null) || 
             (this.iMEI!=null &&
              this.iMEI.equals(other.getIMEI()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.installType==null && other.getInstallType()==null) || 
             (this.installType!=null &&
              this.installType.equals(other.getInstallType()))) &&
            ((this.installOfferId==null && other.getInstallOfferId()==null) || 
             (this.installOfferId!=null &&
              this.installOfferId.equals(other.getInstallOfferId())));
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
        if (getOfferFeeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOfferFeeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOfferFeeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUpcOfferId() != null) {
            _hashCode += getUpcOfferId().hashCode();
        }
        if (getUpcOfferName() != null) {
            _hashCode += getUpcOfferName().hashCode();
        }
        if (getMaterialCode() != null) {
            _hashCode += getMaterialCode().hashCode();
        }
        if (getIMEI() != null) {
            _hashCode += getIMEI().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getInstallType() != null) {
            _hashCode += getInstallType().hashCode();
        }
        if (getInstallOfferId() != null) {
            _hashCode += getInstallOfferId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SOfferInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sOfferInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerFeeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offerFeeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sOfferFee"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upcOfferId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "upcOfferId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upcOfferName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "upcOfferName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("materialCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "materialCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMEI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iMEI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("installOfferId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "installOfferId"));
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
