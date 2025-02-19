/**
 * OwnershipItemData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

public class OwnershipItemData  extends com.asiainfo.crm.inter.exe.webservice.client.rki.XmlData  implements java.io.Serializable {
    private java.lang.String type;  // attribute

    private java.lang.String navn;  // attribute

    private java.lang.String cvrnummer;  // attribute

    private java.lang.String relation;  // attribute

    private java.lang.String ejerandel;  // attribute

    public OwnershipItemData() {
    }

    public OwnershipItemData(
           com.asiainfo.crm.inter.exe.webservice.client.rki.XmlError error,
           java.lang.String type,
           java.lang.String navn,
           java.lang.String cvrnummer,
           java.lang.String relation,
           java.lang.String ejerandel) {
        super(
            error);
        this.type = type;
        this.navn = navn;
        this.cvrnummer = cvrnummer;
        this.relation = relation;
        this.ejerandel = ejerandel;
    }


    /**
     * Gets the type value for this OwnershipItemData.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this OwnershipItemData.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the navn value for this OwnershipItemData.
     * 
     * @return navn
     */
    public java.lang.String getNavn() {
        return navn;
    }


    /**
     * Sets the navn value for this OwnershipItemData.
     * 
     * @param navn
     */
    public void setNavn(java.lang.String navn) {
        this.navn = navn;
    }


    /**
     * Gets the cvrnummer value for this OwnershipItemData.
     * 
     * @return cvrnummer
     */
    public java.lang.String getCvrnummer() {
        return cvrnummer;
    }


    /**
     * Sets the cvrnummer value for this OwnershipItemData.
     * 
     * @param cvrnummer
     */
    public void setCvrnummer(java.lang.String cvrnummer) {
        this.cvrnummer = cvrnummer;
    }


    /**
     * Gets the relation value for this OwnershipItemData.
     * 
     * @return relation
     */
    public java.lang.String getRelation() {
        return relation;
    }


    /**
     * Sets the relation value for this OwnershipItemData.
     * 
     * @param relation
     */
    public void setRelation(java.lang.String relation) {
        this.relation = relation;
    }


    /**
     * Gets the ejerandel value for this OwnershipItemData.
     * 
     * @return ejerandel
     */
    public java.lang.String getEjerandel() {
        return ejerandel;
    }


    /**
     * Sets the ejerandel value for this OwnershipItemData.
     * 
     * @param ejerandel
     */
    public void setEjerandel(java.lang.String ejerandel) {
        this.ejerandel = ejerandel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OwnershipItemData)) return false;
        OwnershipItemData other = (OwnershipItemData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.navn==null && other.getNavn()==null) || 
             (this.navn!=null &&
              this.navn.equals(other.getNavn()))) &&
            ((this.cvrnummer==null && other.getCvrnummer()==null) || 
             (this.cvrnummer!=null &&
              this.cvrnummer.equals(other.getCvrnummer()))) &&
            ((this.relation==null && other.getRelation()==null) || 
             (this.relation!=null &&
              this.relation.equals(other.getRelation()))) &&
            ((this.ejerandel==null && other.getEjerandel()==null) || 
             (this.ejerandel!=null &&
              this.ejerandel.equals(other.getEjerandel())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getNavn() != null) {
            _hashCode += getNavn().hashCode();
        }
        if (getCvrnummer() != null) {
            _hashCode += getCvrnummer().hashCode();
        }
        if (getRelation() != null) {
            _hashCode += getRelation().hashCode();
        }
        if (getEjerandel() != null) {
            _hashCode += getEjerandel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OwnershipItemData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "OwnershipItemData"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("type");
        attrField.setXmlName(new javax.xml.namespace.QName("", "type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("navn");
        attrField.setXmlName(new javax.xml.namespace.QName("", "navn"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("cvrnummer");
        attrField.setXmlName(new javax.xml.namespace.QName("", "cvrnummer"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("relation");
        attrField.setXmlName(new javax.xml.namespace.QName("", "relation"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ejerandel");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ejerandel"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
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
