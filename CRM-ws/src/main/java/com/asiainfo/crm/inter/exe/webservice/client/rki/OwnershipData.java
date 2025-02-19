/**
 * OwnershipData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

public class OwnershipData  extends com.asiainfo.crm.inter.exe.webservice.client.rki.XmlData  implements java.io.Serializable {
    private com.asiainfo.crm.inter.exe.webservice.client.rki.OwnershipItemData[] ejerforholdsliste;

    private java.lang.String beskedId;  // attribute

    private java.lang.String beskedType;  // attribute

    public OwnershipData() {
    }

    public OwnershipData(
           com.asiainfo.crm.inter.exe.webservice.client.rki.XmlError error,
           java.lang.String beskedId,
           java.lang.String beskedType,
           com.asiainfo.crm.inter.exe.webservice.client.rki.OwnershipItemData[] ejerforholdsliste) {
        super(
            error);
        this.beskedId = beskedId;
        this.beskedType = beskedType;
        this.ejerforholdsliste = ejerforholdsliste;
    }


    /**
     * Gets the ejerforholdsliste value for this OwnershipData.
     * 
     * @return ejerforholdsliste
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.OwnershipItemData[] getEjerforholdsliste() {
        return ejerforholdsliste;
    }


    /**
     * Sets the ejerforholdsliste value for this OwnershipData.
     * 
     * @param ejerforholdsliste
     */
    public void setEjerforholdsliste(com.asiainfo.crm.inter.exe.webservice.client.rki.OwnershipItemData[] ejerforholdsliste) {
        this.ejerforholdsliste = ejerforholdsliste;
    }


    /**
     * Gets the beskedId value for this OwnershipData.
     * 
     * @return beskedId
     */
    public java.lang.String getBeskedId() {
        return beskedId;
    }


    /**
     * Sets the beskedId value for this OwnershipData.
     * 
     * @param beskedId
     */
    public void setBeskedId(java.lang.String beskedId) {
        this.beskedId = beskedId;
    }


    /**
     * Gets the beskedType value for this OwnershipData.
     * 
     * @return beskedType
     */
    public java.lang.String getBeskedType() {
        return beskedType;
    }


    /**
     * Sets the beskedType value for this OwnershipData.
     * 
     * @param beskedType
     */
    public void setBeskedType(java.lang.String beskedType) {
        this.beskedType = beskedType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OwnershipData)) return false;
        OwnershipData other = (OwnershipData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ejerforholdsliste==null && other.getEjerforholdsliste()==null) || 
             (this.ejerforholdsliste!=null &&
              java.util.Arrays.equals(this.ejerforholdsliste, other.getEjerforholdsliste()))) &&
            ((this.beskedId==null && other.getBeskedId()==null) || 
             (this.beskedId!=null &&
              this.beskedId.equals(other.getBeskedId()))) &&
            ((this.beskedType==null && other.getBeskedType()==null) || 
             (this.beskedType!=null &&
              this.beskedType.equals(other.getBeskedType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getEjerforholdsliste() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEjerforholdsliste());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEjerforholdsliste(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBeskedId() != null) {
            _hashCode += getBeskedId().hashCode();
        }
        if (getBeskedType() != null) {
            _hashCode += getBeskedType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OwnershipData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "OwnershipData"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("beskedId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "beskedId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("beskedType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "beskedType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ejerforholdsliste");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Ejerforholdsliste"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "OwnershipItemData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.rki.dk", "ejerskab"));
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
