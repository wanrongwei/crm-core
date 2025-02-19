/**
 * YwsSdPsIcCreate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.sap;

public class YwsSdPsIcCreate  implements java.io.Serializable {
    private java.lang.String domTaxNoIc;

    private java.lang.String euTaxNoIc;

    private java.lang.String currencyIc;

    private java.lang.String CPmntTermsIc;

    private java.lang.String VPmntTermsIc;

    private java.lang.String CTaxClassIc;

    public YwsSdPsIcCreate() {
    }

    public YwsSdPsIcCreate(
           java.lang.String domTaxNoIc,
           java.lang.String euTaxNoIc,
           java.lang.String currencyIc,
           java.lang.String CPmntTermsIc,
           java.lang.String VPmntTermsIc,
           java.lang.String CTaxClassIc) {
           this.domTaxNoIc = domTaxNoIc;
           this.euTaxNoIc = euTaxNoIc;
           this.currencyIc = currencyIc;
           this.CPmntTermsIc = CPmntTermsIc;
           this.VPmntTermsIc = VPmntTermsIc;
           this.CTaxClassIc = CTaxClassIc;
    }


    /**
     * Gets the domTaxNoIc value for this YwsSdPsIcCreate.
     * 
     * @return domTaxNoIc
     */
    public java.lang.String getDomTaxNoIc() {
        return domTaxNoIc;
    }


    /**
     * Sets the domTaxNoIc value for this YwsSdPsIcCreate.
     * 
     * @param domTaxNoIc
     */
    public void setDomTaxNoIc(java.lang.String domTaxNoIc) {
        this.domTaxNoIc = domTaxNoIc;
    }


    /**
     * Gets the euTaxNoIc value for this YwsSdPsIcCreate.
     * 
     * @return euTaxNoIc
     */
    public java.lang.String getEuTaxNoIc() {
        return euTaxNoIc;
    }


    /**
     * Sets the euTaxNoIc value for this YwsSdPsIcCreate.
     * 
     * @param euTaxNoIc
     */
    public void setEuTaxNoIc(java.lang.String euTaxNoIc) {
        this.euTaxNoIc = euTaxNoIc;
    }


    /**
     * Gets the currencyIc value for this YwsSdPsIcCreate.
     * 
     * @return currencyIc
     */
    public java.lang.String getCurrencyIc() {
        return currencyIc;
    }


    /**
     * Sets the currencyIc value for this YwsSdPsIcCreate.
     * 
     * @param currencyIc
     */
    public void setCurrencyIc(java.lang.String currencyIc) {
        this.currencyIc = currencyIc;
    }


    /**
     * Gets the CPmntTermsIc value for this YwsSdPsIcCreate.
     * 
     * @return CPmntTermsIc
     */
    public java.lang.String getCPmntTermsIc() {
        return CPmntTermsIc;
    }


    /**
     * Sets the CPmntTermsIc value for this YwsSdPsIcCreate.
     * 
     * @param CPmntTermsIc
     */
    public void setCPmntTermsIc(java.lang.String CPmntTermsIc) {
        this.CPmntTermsIc = CPmntTermsIc;
    }


    /**
     * Gets the VPmntTermsIc value for this YwsSdPsIcCreate.
     * 
     * @return VPmntTermsIc
     */
    public java.lang.String getVPmntTermsIc() {
        return VPmntTermsIc;
    }


    /**
     * Sets the VPmntTermsIc value for this YwsSdPsIcCreate.
     * 
     * @param VPmntTermsIc
     */
    public void setVPmntTermsIc(java.lang.String VPmntTermsIc) {
        this.VPmntTermsIc = VPmntTermsIc;
    }


    /**
     * Gets the CTaxClassIc value for this YwsSdPsIcCreate.
     * 
     * @return CTaxClassIc
     */
    public java.lang.String getCTaxClassIc() {
        return CTaxClassIc;
    }


    /**
     * Sets the CTaxClassIc value for this YwsSdPsIcCreate.
     * 
     * @param CTaxClassIc
     */
    public void setCTaxClassIc(java.lang.String CTaxClassIc) {
        this.CTaxClassIc = CTaxClassIc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof YwsSdPsIcCreate)) return false;
        YwsSdPsIcCreate other = (YwsSdPsIcCreate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.domTaxNoIc==null && other.getDomTaxNoIc()==null) || 
             (this.domTaxNoIc!=null &&
              this.domTaxNoIc.equals(other.getDomTaxNoIc()))) &&
            ((this.euTaxNoIc==null && other.getEuTaxNoIc()==null) || 
             (this.euTaxNoIc!=null &&
              this.euTaxNoIc.equals(other.getEuTaxNoIc()))) &&
            ((this.currencyIc==null && other.getCurrencyIc()==null) || 
             (this.currencyIc!=null &&
              this.currencyIc.equals(other.getCurrencyIc()))) &&
            ((this.CPmntTermsIc==null && other.getCPmntTermsIc()==null) || 
             (this.CPmntTermsIc!=null &&
              this.CPmntTermsIc.equals(other.getCPmntTermsIc()))) &&
            ((this.VPmntTermsIc==null && other.getVPmntTermsIc()==null) || 
             (this.VPmntTermsIc!=null &&
              this.VPmntTermsIc.equals(other.getVPmntTermsIc()))) &&
            ((this.CTaxClassIc==null && other.getCTaxClassIc()==null) || 
             (this.CTaxClassIc!=null &&
              this.CTaxClassIc.equals(other.getCTaxClassIc())));
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
        if (getDomTaxNoIc() != null) {
            _hashCode += getDomTaxNoIc().hashCode();
        }
        if (getEuTaxNoIc() != null) {
            _hashCode += getEuTaxNoIc().hashCode();
        }
        if (getCurrencyIc() != null) {
            _hashCode += getCurrencyIc().hashCode();
        }
        if (getCPmntTermsIc() != null) {
            _hashCode += getCPmntTermsIc().hashCode();
        }
        if (getVPmntTermsIc() != null) {
            _hashCode += getVPmntTermsIc().hashCode();
        }
        if (getCTaxClassIc() != null) {
            _hashCode += getCTaxClassIc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(YwsSdPsIcCreate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSdPsIcCreate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domTaxNoIc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DomTaxNoIc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("euTaxNoIc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EuTaxNoIc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyIc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CurrencyIc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CPmntTermsIc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CPmntTermsIc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VPmntTermsIc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VPmntTermsIc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CTaxClassIc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CTaxClassIc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
