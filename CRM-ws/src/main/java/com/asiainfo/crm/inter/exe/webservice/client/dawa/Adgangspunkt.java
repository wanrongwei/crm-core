/**
 * Adgangspunkt.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.dawa;

public class Adgangspunkt  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String[] koordinater;

    private java.lang.String højde;

    private java.lang.String nøjagtighed;

    private java.lang.String kilde;

    private java.lang.String tekniskstandard;

    private java.lang.String tekstretning;

    private java.lang.String ændret;

    public Adgangspunkt() {
    }

    public Adgangspunkt(
           java.lang.String id,
           java.lang.String[] koordinater,
           java.lang.String højde,
           java.lang.String nøjagtighed,
           java.lang.String kilde,
           java.lang.String tekniskstandard,
           java.lang.String tekstretning,
           java.lang.String ændret) {
           this.id = id;
           this.koordinater = koordinater;
           this.højde = højde;
           this.nøjagtighed = nøjagtighed;
           this.kilde = kilde;
           this.tekniskstandard = tekniskstandard;
           this.tekstretning = tekstretning;
           this.ændret = ændret;
    }


    /**
     * Gets the id value for this Adgangspunkt.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Adgangspunkt.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the koordinater value for this Adgangspunkt.
     * 
     * @return koordinater
     */
    public java.lang.String[] getKoordinater() {
        return koordinater;
    }


    /**
     * Sets the koordinater value for this Adgangspunkt.
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


    /**
     * Gets the højde value for this Adgangspunkt.
     * 
     * @return højde
     */
    public java.lang.String getHøjde() {
        return højde;
    }


    /**
     * Sets the højde value for this Adgangspunkt.
     * 
     * @param højde
     */
    public void setHøjde(java.lang.String højde) {
        this.højde = højde;
    }


    /**
     * Gets the nøjagtighed value for this Adgangspunkt.
     * 
     * @return nøjagtighed
     */
    public java.lang.String getNøjagtighed() {
        return nøjagtighed;
    }


    /**
     * Sets the nøjagtighed value for this Adgangspunkt.
     * 
     * @param nøjagtighed
     */
    public void setNøjagtighed(java.lang.String nøjagtighed) {
        this.nøjagtighed = nøjagtighed;
    }


    /**
     * Gets the kilde value for this Adgangspunkt.
     * 
     * @return kilde
     */
    public java.lang.String getKilde() {
        return kilde;
    }


    /**
     * Sets the kilde value for this Adgangspunkt.
     * 
     * @param kilde
     */
    public void setKilde(java.lang.String kilde) {
        this.kilde = kilde;
    }


    /**
     * Gets the tekniskstandard value for this Adgangspunkt.
     * 
     * @return tekniskstandard
     */
    public java.lang.String getTekniskstandard() {
        return tekniskstandard;
    }


    /**
     * Sets the tekniskstandard value for this Adgangspunkt.
     * 
     * @param tekniskstandard
     */
    public void setTekniskstandard(java.lang.String tekniskstandard) {
        this.tekniskstandard = tekniskstandard;
    }


    /**
     * Gets the tekstretning value for this Adgangspunkt.
     * 
     * @return tekstretning
     */
    public java.lang.String getTekstretning() {
        return tekstretning;
    }


    /**
     * Sets the tekstretning value for this Adgangspunkt.
     * 
     * @param tekstretning
     */
    public void setTekstretning(java.lang.String tekstretning) {
        this.tekstretning = tekstretning;
    }


    /**
     * Gets the ændret value for this Adgangspunkt.
     * 
     * @return ændret
     */
    public java.lang.String getÆndret() {
        return ændret;
    }


    /**
     * Sets the ændret value for this Adgangspunkt.
     * 
     * @param ændret
     */
    public void setÆndret(java.lang.String ændret) {
        this.ændret = ændret;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Adgangspunkt)) return false;
        Adgangspunkt other = (Adgangspunkt) obj;
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
            ((this.koordinater==null && other.getKoordinater()==null) || 
             (this.koordinater!=null &&
              java.util.Arrays.equals(this.koordinater, other.getKoordinater()))) &&
            ((this.højde==null && other.getHøjde()==null) || 
             (this.højde!=null &&
              this.højde.equals(other.getHøjde()))) &&
            ((this.nøjagtighed==null && other.getNøjagtighed()==null) || 
             (this.nøjagtighed!=null &&
              this.nøjagtighed.equals(other.getNøjagtighed()))) &&
            ((this.kilde==null && other.getKilde()==null) || 
             (this.kilde!=null &&
              this.kilde.equals(other.getKilde()))) &&
            ((this.tekniskstandard==null && other.getTekniskstandard()==null) || 
             (this.tekniskstandard!=null &&
              this.tekniskstandard.equals(other.getTekniskstandard()))) &&
            ((this.tekstretning==null && other.getTekstretning()==null) || 
             (this.tekstretning!=null &&
              this.tekstretning.equals(other.getTekstretning()))) &&
            ((this.ændret==null && other.getÆndret()==null) || 
             (this.ændret!=null &&
              this.ændret.equals(other.getÆndret())));
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
        if (getHøjde() != null) {
            _hashCode += getHøjde().hashCode();
        }
        if (getNøjagtighed() != null) {
            _hashCode += getNøjagtighed().hashCode();
        }
        if (getKilde() != null) {
            _hashCode += getKilde().hashCode();
        }
        if (getTekniskstandard() != null) {
            _hashCode += getTekniskstandard().hashCode();
        }
        if (getTekstretning() != null) {
            _hashCode += getTekstretning().hashCode();
        }
        if (getÆndret() != null) {
            _hashCode += getÆndret().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Adgangspunkt.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "adgangspunkt"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("højde");
        elemField.setXmlName(new javax.xml.namespace.QName("", "højde"));
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
        elemField.setFieldName("kilde");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kilde"));
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
        elemField.setFieldName("tekstretning");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tekstretning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ændret");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ændret"));
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
