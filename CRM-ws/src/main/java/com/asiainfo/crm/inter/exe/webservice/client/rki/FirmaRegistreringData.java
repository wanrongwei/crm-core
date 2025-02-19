/**
 * FirmaRegistreringData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

public class FirmaRegistreringData  extends com.asiainfo.crm.inter.exe.webservice.client.rki.XmlData  implements java.io.Serializable {
    private com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaData firma;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.RegistreringListe registreringer;

    private com.asiainfo.crm.inter.exe.webservice.client.rki.AdvarselsListe advarsler;

    public FirmaRegistreringData() {
    }

    public FirmaRegistreringData(
           com.asiainfo.crm.inter.exe.webservice.client.rki.XmlError error,
           com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaData firma,
           com.asiainfo.crm.inter.exe.webservice.client.rki.RegistreringListe registreringer,
           com.asiainfo.crm.inter.exe.webservice.client.rki.AdvarselsListe advarsler) {
        super(
            error);
        this.firma = firma;
        this.registreringer = registreringer;
        this.advarsler = advarsler;
    }


    /**
     * Gets the firma value for this FirmaRegistreringData.
     * 
     * @return firma
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaData getFirma() {
        return firma;
    }


    /**
     * Sets the firma value for this FirmaRegistreringData.
     * 
     * @param firma
     */
    public void setFirma(com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaData firma) {
        this.firma = firma;
    }


    /**
     * Gets the registreringer value for this FirmaRegistreringData.
     * 
     * @return registreringer
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.RegistreringListe getRegistreringer() {
        return registreringer;
    }


    /**
     * Sets the registreringer value for this FirmaRegistreringData.
     * 
     * @param registreringer
     */
    public void setRegistreringer(com.asiainfo.crm.inter.exe.webservice.client.rki.RegistreringListe registreringer) {
        this.registreringer = registreringer;
    }


    /**
     * Gets the advarsler value for this FirmaRegistreringData.
     * 
     * @return advarsler
     */
    public com.asiainfo.crm.inter.exe.webservice.client.rki.AdvarselsListe getAdvarsler() {
        return advarsler;
    }


    /**
     * Sets the advarsler value for this FirmaRegistreringData.
     * 
     * @param advarsler
     */
    public void setAdvarsler(com.asiainfo.crm.inter.exe.webservice.client.rki.AdvarselsListe advarsler) {
        this.advarsler = advarsler;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FirmaRegistreringData)) return false;
        FirmaRegistreringData other = (FirmaRegistreringData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.firma==null && other.getFirma()==null) || 
             (this.firma!=null &&
              this.firma.equals(other.getFirma()))) &&
            ((this.registreringer==null && other.getRegistreringer()==null) || 
             (this.registreringer!=null &&
              this.registreringer.equals(other.getRegistreringer()))) &&
            ((this.advarsler==null && other.getAdvarsler()==null) || 
             (this.advarsler!=null &&
              this.advarsler.equals(other.getAdvarsler())));
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
        if (getFirma() != null) {
            _hashCode += getFirma().hashCode();
        }
        if (getRegistreringer() != null) {
            _hashCode += getRegistreringer().hashCode();
        }
        if (getAdvarsler() != null) {
            _hashCode += getAdvarsler().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FirmaRegistreringData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "FirmaRegistreringData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firma");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Firma"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "FirmaData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registreringer");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Registreringer"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "RegistreringListe"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advarsler");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Advarsler"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "AdvarselsListe"));
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
