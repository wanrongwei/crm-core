/**
 * Resultinfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.dawa;

public class Resultinfo  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String kvhx;

    private java.lang.String status;

    private java.lang.String href;

    private java.lang.String etage;

    private java.lang.String dør;

    private java.lang.String adressebetegnelse;

    public Resultinfo() {
    }

    public Resultinfo(
           java.lang.String id,
           java.lang.String kvhx,
           java.lang.String status,
           java.lang.String href,
           java.lang.String etage,
           java.lang.String dør,
           java.lang.String adressebetegnelse) {
           this.id = id;
           this.kvhx = kvhx;
           this.status = status;
           this.href = href;
           this.etage = etage;
           this.dør = dør;
           this.adressebetegnelse = adressebetegnelse;
    }


    /**
     * Gets the id value for this Resultinfo.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Resultinfo.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the kvhx value for this Resultinfo.
     * 
     * @return kvhx
     */
    public java.lang.String getKvhx() {
        return kvhx;
    }


    /**
     * Sets the kvhx value for this Resultinfo.
     * 
     * @param kvhx
     */
    public void setKvhx(java.lang.String kvhx) {
        this.kvhx = kvhx;
    }


    /**
     * Gets the status value for this Resultinfo.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Resultinfo.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the href value for this Resultinfo.
     * 
     * @return href
     */
    public java.lang.String getHref() {
        return href;
    }


    /**
     * Sets the href value for this Resultinfo.
     * 
     * @param href
     */
    public void setHref(java.lang.String href) {
        this.href = href;
    }


    /**
     * Gets the etage value for this Resultinfo.
     * 
     * @return etage
     */
    public java.lang.String getEtage() {
        return etage;
    }


    /**
     * Sets the etage value for this Resultinfo.
     * 
     * @param etage
     */
    public void setEtage(java.lang.String etage) {
        this.etage = etage;
    }


    /**
     * Gets the dør value for this Resultinfo.
     * 
     * @return dør
     */
    public java.lang.String getDør() {
        return dør;
    }


    /**
     * Sets the dør value for this Resultinfo.
     * 
     * @param dør
     */
    public void setDør(java.lang.String dør) {
        this.dør = dør;
    }


    /**
     * Gets the adressebetegnelse value for this Resultinfo.
     * 
     * @return adressebetegnelse
     */
    public java.lang.String getAdressebetegnelse() {
        return adressebetegnelse;
    }


    /**
     * Sets the adressebetegnelse value for this Resultinfo.
     * 
     * @param adressebetegnelse
     */
    public void setAdressebetegnelse(java.lang.String adressebetegnelse) {
        this.adressebetegnelse = adressebetegnelse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Resultinfo)) return false;
        Resultinfo other = (Resultinfo) obj;
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
            ((this.kvhx==null && other.getKvhx()==null) || 
             (this.kvhx!=null &&
              this.kvhx.equals(other.getKvhx()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.href==null && other.getHref()==null) || 
             (this.href!=null &&
              this.href.equals(other.getHref()))) &&
            ((this.etage==null && other.getEtage()==null) || 
             (this.etage!=null &&
              this.etage.equals(other.getEtage()))) &&
            ((this.dør==null && other.getDør()==null) || 
             (this.dør!=null &&
              this.dør.equals(other.getDør()))) &&
            ((this.adressebetegnelse==null && other.getAdressebetegnelse()==null) || 
             (this.adressebetegnelse!=null &&
              this.adressebetegnelse.equals(other.getAdressebetegnelse())));
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
        if (getKvhx() != null) {
            _hashCode += getKvhx().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getHref() != null) {
            _hashCode += getHref().hashCode();
        }
        if (getEtage() != null) {
            _hashCode += getEtage().hashCode();
        }
        if (getDør() != null) {
            _hashCode += getDør().hashCode();
        }
        if (getAdressebetegnelse() != null) {
            _hashCode += getAdressebetegnelse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Resultinfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "resultinfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kvhx");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kvhx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("href");
        elemField.setXmlName(new javax.xml.namespace.QName("", "href"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("etage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "etage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dør");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dør"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adressebetegnelse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adressebetegnelse"));
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
