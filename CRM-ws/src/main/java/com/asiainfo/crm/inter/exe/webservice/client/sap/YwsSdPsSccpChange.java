/**
 * YwsSdPsSccpChange.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.sap;

public class YwsSdPsSccpChange  implements java.io.Serializable {
    private java.lang.String domTaxNoSc;

    private java.lang.String euTaxNoSc;

    private java.lang.String currencySc;

    private java.lang.String CPmntTermsSc;

    private java.lang.String VPmntTermsSc;

    private java.lang.String CTaxClassSc;

    public YwsSdPsSccpChange() {
    }

    public YwsSdPsSccpChange(
           java.lang.String domTaxNoSc,
           java.lang.String euTaxNoSc,
           java.lang.String currencySc,
           java.lang.String CPmntTermsSc,
           java.lang.String VPmntTermsSc,
           java.lang.String CTaxClassSc) {
           this.domTaxNoSc = domTaxNoSc;
           this.euTaxNoSc = euTaxNoSc;
           this.currencySc = currencySc;
           this.CPmntTermsSc = CPmntTermsSc;
           this.VPmntTermsSc = VPmntTermsSc;
           this.CTaxClassSc = CTaxClassSc;
    }


    /**
     * Gets the domTaxNoSc value for this YwsSdPsSccpChange.
     * 
     * @return domTaxNoSc
     */
    public java.lang.String getDomTaxNoSc() {
        return domTaxNoSc;
    }


    /**
     * Sets the domTaxNoSc value for this YwsSdPsSccpChange.
     * 
     * @param domTaxNoSc
     */
    public void setDomTaxNoSc(java.lang.String domTaxNoSc) {
        this.domTaxNoSc = domTaxNoSc;
    }


    /**
     * Gets the euTaxNoSc value for this YwsSdPsSccpChange.
     * 
     * @return euTaxNoSc
     */
    public java.lang.String getEuTaxNoSc() {
        return euTaxNoSc;
    }


    /**
     * Sets the euTaxNoSc value for this YwsSdPsSccpChange.
     * 
     * @param euTaxNoSc
     */
    public void setEuTaxNoSc(java.lang.String euTaxNoSc) {
        this.euTaxNoSc = euTaxNoSc;
    }


    /**
     * Gets the currencySc value for this YwsSdPsSccpChange.
     * 
     * @return currencySc
     */
    public java.lang.String getCurrencySc() {
        return currencySc;
    }


    /**
     * Sets the currencySc value for this YwsSdPsSccpChange.
     * 
     * @param currencySc
     */
    public void setCurrencySc(java.lang.String currencySc) {
        this.currencySc = currencySc;
    }


    /**
     * Gets the CPmntTermsSc value for this YwsSdPsSccpChange.
     * 
     * @return CPmntTermsSc
     */
    public java.lang.String getCPmntTermsSc() {
        return CPmntTermsSc;
    }


    /**
     * Sets the CPmntTermsSc value for this YwsSdPsSccpChange.
     * 
     * @param CPmntTermsSc
     */
    public void setCPmntTermsSc(java.lang.String CPmntTermsSc) {
        this.CPmntTermsSc = CPmntTermsSc;
    }


    /**
     * Gets the VPmntTermsSc value for this YwsSdPsSccpChange.
     * 
     * @return VPmntTermsSc
     */
    public java.lang.String getVPmntTermsSc() {
        return VPmntTermsSc;
    }


    /**
     * Sets the VPmntTermsSc value for this YwsSdPsSccpChange.
     * 
     * @param VPmntTermsSc
     */
    public void setVPmntTermsSc(java.lang.String VPmntTermsSc) {
        this.VPmntTermsSc = VPmntTermsSc;
    }


    /**
     * Gets the CTaxClassSc value for this YwsSdPsSccpChange.
     * 
     * @return CTaxClassSc
     */
    public java.lang.String getCTaxClassSc() {
        return CTaxClassSc;
    }


    /**
     * Sets the CTaxClassSc value for this YwsSdPsSccpChange.
     * 
     * @param CTaxClassSc
     */
    public void setCTaxClassSc(java.lang.String CTaxClassSc) {
        this.CTaxClassSc = CTaxClassSc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof YwsSdPsSccpChange)) return false;
        YwsSdPsSccpChange other = (YwsSdPsSccpChange) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.domTaxNoSc==null && other.getDomTaxNoSc()==null) || 
             (this.domTaxNoSc!=null &&
              this.domTaxNoSc.equals(other.getDomTaxNoSc()))) &&
            ((this.euTaxNoSc==null && other.getEuTaxNoSc()==null) || 
             (this.euTaxNoSc!=null &&
              this.euTaxNoSc.equals(other.getEuTaxNoSc()))) &&
            ((this.currencySc==null && other.getCurrencySc()==null) || 
             (this.currencySc!=null &&
              this.currencySc.equals(other.getCurrencySc()))) &&
            ((this.CPmntTermsSc==null && other.getCPmntTermsSc()==null) || 
             (this.CPmntTermsSc!=null &&
              this.CPmntTermsSc.equals(other.getCPmntTermsSc()))) &&
            ((this.VPmntTermsSc==null && other.getVPmntTermsSc()==null) || 
             (this.VPmntTermsSc!=null &&
              this.VPmntTermsSc.equals(other.getVPmntTermsSc()))) &&
            ((this.CTaxClassSc==null && other.getCTaxClassSc()==null) || 
             (this.CTaxClassSc!=null &&
              this.CTaxClassSc.equals(other.getCTaxClassSc())));
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
        if (getDomTaxNoSc() != null) {
            _hashCode += getDomTaxNoSc().hashCode();
        }
        if (getEuTaxNoSc() != null) {
            _hashCode += getEuTaxNoSc().hashCode();
        }
        if (getCurrencySc() != null) {
            _hashCode += getCurrencySc().hashCode();
        }
        if (getCPmntTermsSc() != null) {
            _hashCode += getCPmntTermsSc().hashCode();
        }
        if (getVPmntTermsSc() != null) {
            _hashCode += getVPmntTermsSc().hashCode();
        }
        if (getCTaxClassSc() != null) {
            _hashCode += getCTaxClassSc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(YwsSdPsSccpChange.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSdPsSccpChange"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domTaxNoSc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DomTaxNoSc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("euTaxNoSc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EuTaxNoSc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencySc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CurrencySc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CPmntTermsSc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CPmntTermsSc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VPmntTermsSc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VPmntTermsSc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CTaxClassSc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CTaxClassSc"));
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
