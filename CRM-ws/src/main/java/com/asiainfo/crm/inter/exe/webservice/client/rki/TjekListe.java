/**
 * TjekListe.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

public class TjekListe  extends com.asiainfo.crm.inter.exe.webservice.client.rki.XmlData  implements java.io.Serializable {
    private com.asiainfo.crm.inter.exe.webservice.client.rki.TjekData[] tjekListe;

    private java.lang.String tjekOk;  // attribute

    private java.lang.String transactionId;  // attribute

    public TjekListe() {
    }

    public TjekListe(
           com.asiainfo.crm.inter.exe.webservice.client.rki.XmlError error,
           java.lang.String tjekOk,
           java.lang.String transactionId,
           com.asiainfo.crm.inter.exe.webservice.client.rki.TjekData[] tjekListe) {
        super(
            error);
        this.tjekOk = tjekOk;
        this.transactionId = transactionId;
        this.tjekListe = tjekListe;
    }


    /**
     * Gets the tjekListe value for this TjekListe.
     * 
     * @return tjekListe
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.TjekData[] getTjekListe() {
        return tjekListe;
    }


    /**
     * Sets the tjekListe value for this TjekListe.
     * 
     * @param tjekListe
     */
    public void setTjekListe(com.asiainfo.crm.inter.exe.webservice.client.rki.TjekData[] tjekListe) {
        this.tjekListe = tjekListe;
    }


    /**
     * Gets the tjekOk value for this TjekListe.
     * 
     * @return tjekOk
     */
    public java.lang.String getTjekOk() {
        return tjekOk;
    }


    /**
     * Sets the tjekOk value for this TjekListe.
     * 
     * @param tjekOk
     */
    public void setTjekOk(java.lang.String tjekOk) {
        this.tjekOk = tjekOk;
    }


    /**
     * Gets the transactionId value for this TjekListe.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this TjekListe.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TjekListe)) return false;
        TjekListe other = (TjekListe) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.tjekListe==null && other.getTjekListe()==null) || 
             (this.tjekListe!=null &&
              java.util.Arrays.equals(this.tjekListe, other.getTjekListe()))) &&
            ((this.tjekOk==null && other.getTjekOk()==null) || 
             (this.tjekOk!=null &&
              this.tjekOk.equals(other.getTjekOk()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId())));
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
        if (getTjekListe() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTjekListe());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTjekListe(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTjekOk() != null) {
            _hashCode += getTjekOk().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TjekListe.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "TjekListe"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("tjekOk");
        attrField.setXmlName(new javax.xml.namespace.QName("", "tjekOk"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("transactionId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "transactionId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tjekListe");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "TjekListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "TjekData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("https://ws.rki.dk", "TjekData"));
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
