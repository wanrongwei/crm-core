/**
 * Vejpunkt.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.dawa;

public class Vejpunkt  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String kilde;

    private java.lang.String nøjagtighed;

    private java.lang.String tekniskstandard;

    private java.lang.String[] koordinater;

    public Vejpunkt() {
    }

    public Vejpunkt(
           java.lang.String id,
           java.lang.String kilde,
           java.lang.String nøjagtighed,
           java.lang.String tekniskstandard,
           java.lang.String[] koordinater) {
           this.id = id;
           this.kilde = kilde;
           this.nøjagtighed = nøjagtighed;
           this.tekniskstandard = tekniskstandard;
           this.koordinater = koordinater;
    }


    /**
     * Gets the id value for this Vejpunkt.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Vejpunkt.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the kilde value for this Vejpunkt.
     * 
     * @return kilde
     */
    public java.lang.String getKilde() {
        return kilde;
    }


    /**
     * Sets the kilde value for this Vejpunkt.
     * 
     * @param kilde
     */
    public void setKilde(java.lang.String kilde) {
        this.kilde = kilde;
    }


    /**
     * Gets the nøjagtighed value for this Vejpunkt.
     * 
     * @return nøjagtighed
     */
    public java.lang.String getNøjagtighed() {
        return nøjagtighed;
    }


    /**
     * Sets the nøjagtighed value for this Vejpunkt.
     * 
     * @param nøjagtighed
     */
    public void setNøjagtighed(java.lang.String nøjagtighed) {
        this.nøjagtighed = nøjagtighed;
    }


    /**
     * Gets the tekniskstandard value for this Vejpunkt.
     * 
     * @return tekniskstandard
     */
    public java.lang.String getTekniskstandard() {
        return tekniskstandard;
    }


    /**
     * Sets the tekniskstandard value for this Vejpunkt.
     * 
     * @param tekniskstandard
     */
    public void setTekniskstandard(java.lang.String tekniskstandard) {
        this.tekniskstandard = tekniskstandard;
    }


    /**
     * Gets the koordinater value for this Vejpunkt.
     * 
     * @return koordinater
     */
    public java.lang.String[] getKoordinater() {
        return koordinater;
    }


    /**
     * Sets the koordinater value for this Vejpunkt.
     * 
     * @param koordinater
     */
    public void setKoordinater(java.lang.String[] koordinater) {
        this.koordinater = koordinater;
    }

    public java.lang.String getKoordinater(int i) {
        return this.koordinater[i];
    }

    public void setKoordinater(int i, java.lang.String _value) {
        this.koordinater[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Vejpunkt)) return false;
        Vejpunkt other = (Vejpunkt) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.kilde==null && other.getKilde()==null) || 
             (this.kilde!=null &&
              this.kilde.equals(other.getKilde()))) &&
            ((this.nøjagtighed==null && other.getNøjagtighed()==null) || 
             (this.nøjagtighed!=null &&
              this.nøjagtighed.equals(other.getNøjagtighed()))) &&
            ((this.tekniskstandard==null && other.getTekniskstandard()==null) || 
             (this.tekniskstandard!=null &&
              this.tekniskstandard.equals(other.getTekniskstandard()))) &&
            ((this.koordinater==null && other.getKoordinater()==null) || 
             (this.koordinater!=null &&
              java.util.Arrays.equals(this.koordinater, other.getKoordinater())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getKilde() != null) {
            _hashCode += getKilde().hashCode();
        }
        if (getNøjagtighed() != null) {
            _hashCode += getNøjagtighed().hashCode();
        }
        if (getTekniskstandard() != null) {
            _hashCode += getTekniskstandard().hashCode();
        }
        if (getKoordinater() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKoordinater());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKoordinater(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Vejpunkt.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "vejpunkt"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kilde");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kilde"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nøjagtighed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nøjagtighed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tekniskstandard");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tekniskstandard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("koordinater");
        elemField.setXmlName(new javax.xml.namespace.QName("", "koordinater"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
