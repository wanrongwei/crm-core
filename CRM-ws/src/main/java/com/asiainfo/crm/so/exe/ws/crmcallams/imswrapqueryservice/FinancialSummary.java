/**
 * FinancialSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class FinancialSummary  implements java.io.Serializable {
    private java.lang.String amountCaptured;

    private java.lang.String amountCredited;

    private java.lang.Boolean annulled;

    private java.lang.String authorizationId;

    private java.lang.Boolean authorized;

    public FinancialSummary() {
    }

    public FinancialSummary(
           java.lang.String amountCaptured,
           java.lang.String amountCredited,
           java.lang.Boolean annulled,
           java.lang.String authorizationId,
           java.lang.Boolean authorized) {
           this.amountCaptured = amountCaptured;
           this.amountCredited = amountCredited;
           this.annulled = annulled;
           this.authorizationId = authorizationId;
           this.authorized = authorized;
    }


    /**
     * Gets the amountCaptured value for this FinancialSummary.
     * 
     * @return amountCaptured
     */
    public java.lang.String getAmountCaptured() {
        return amountCaptured;
    }


    /**
     * Sets the amountCaptured value for this FinancialSummary.
     * 
     * @param amountCaptured
     */
    public void setAmountCaptured(java.lang.String amountCaptured) {
        this.amountCaptured = amountCaptured;
    }


    /**
     * Gets the amountCredited value for this FinancialSummary.
     * 
     * @return amountCredited
     */
    public java.lang.String getAmountCredited() {
        return amountCredited;
    }


    /**
     * Sets the amountCredited value for this FinancialSummary.
     * 
     * @param amountCredited
     */
    public void setAmountCredited(java.lang.String amountCredited) {
        this.amountCredited = amountCredited;
    }


    /**
     * Gets the annulled value for this FinancialSummary.
     * 
     * @return annulled
     */
    public java.lang.Boolean getAnnulled() {
        return annulled;
    }


    /**
     * Sets the annulled value for this FinancialSummary.
     * 
     * @param annulled
     */
    public void setAnnulled(java.lang.Boolean annulled) {
        this.annulled = annulled;
    }


    /**
     * Gets the authorizationId value for this FinancialSummary.
     * 
     * @return authorizationId
     */
    public java.lang.String getAuthorizationId() {
        return authorizationId;
    }


    /**
     * Sets the authorizationId value for this FinancialSummary.
     * 
     * @param authorizationId
     */
    public void setAuthorizationId(java.lang.String authorizationId) {
        this.authorizationId = authorizationId;
    }


    /**
     * Gets the authorized value for this FinancialSummary.
     * 
     * @return authorized
     */
    public java.lang.Boolean getAuthorized() {
        return authorized;
    }


    /**
     * Sets the authorized value for this FinancialSummary.
     * 
     * @param authorized
     */
    public void setAuthorized(java.lang.Boolean authorized) {
        this.authorized = authorized;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FinancialSummary)) return false;
        FinancialSummary other = (FinancialSummary) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amountCaptured==null && other.getAmountCaptured()==null) || 
             (this.amountCaptured!=null &&
              this.amountCaptured.equals(other.getAmountCaptured()))) &&
            ((this.amountCredited==null && other.getAmountCredited()==null) || 
             (this.amountCredited!=null &&
              this.amountCredited.equals(other.getAmountCredited()))) &&
            ((this.annulled==null && other.getAnnulled()==null) || 
             (this.annulled!=null &&
              this.annulled.equals(other.getAnnulled()))) &&
            ((this.authorizationId==null && other.getAuthorizationId()==null) || 
             (this.authorizationId!=null &&
              this.authorizationId.equals(other.getAuthorizationId()))) &&
            ((this.authorized==null && other.getAuthorized()==null) || 
             (this.authorized!=null &&
              this.authorized.equals(other.getAuthorized())));
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
        if (getAmountCaptured() != null) {
            _hashCode += getAmountCaptured().hashCode();
        }
        if (getAmountCredited() != null) {
            _hashCode += getAmountCredited().hashCode();
        }
        if (getAnnulled() != null) {
            _hashCode += getAnnulled().hashCode();
        }
        if (getAuthorizationId() != null) {
            _hashCode += getAuthorizationId().hashCode();
        }
        if (getAuthorized() != null) {
            _hashCode += getAuthorized().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FinancialSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "financialSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountCaptured");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AmountCaptured"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountCredited");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AmountCredited"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("annulled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Annulled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AuthorizationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorized");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Authorized"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
