/**
 * XmlError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

public class XmlError  implements java.io.Serializable {
    private int code;

    private java.lang.String codeMoniker;

    private java.lang.String text;

    private java.lang.String detailed;

    private java.lang.String trace;

    public XmlError() {
    }

    public XmlError(
           int code,
           java.lang.String codeMoniker,
           java.lang.String text,
           java.lang.String detailed,
           java.lang.String trace) {
           this.code = code;
           this.codeMoniker = codeMoniker;
           this.text = text;
           this.detailed = detailed;
           this.trace = trace;
    }


    /**
     * Gets the code value for this XmlError.
     * 
     * @return code
     */
    public int getCode() {
        return code;
    }


    /**
     * Sets the code value for this XmlError.
     * 
     * @param code
     */
    public void setCode(int code) {
        this.code = code;
    }


    /**
     * Gets the codeMoniker value for this XmlError.
     * 
     * @return codeMoniker
     */
    public java.lang.String getCodeMoniker() {
        return codeMoniker;
    }


    /**
     * Sets the codeMoniker value for this XmlError.
     * 
     * @param codeMoniker
     */
    public void setCodeMoniker(java.lang.String codeMoniker) {
        this.codeMoniker = codeMoniker;
    }


    /**
     * Gets the text value for this XmlError.
     * 
     * @return text
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this XmlError.
     * 
     * @param text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }


    /**
     * Gets the detailed value for this XmlError.
     * 
     * @return detailed
     */
    public java.lang.String getDetailed() {
        return detailed;
    }


    /**
     * Sets the detailed value for this XmlError.
     * 
     * @param detailed
     */
    public void setDetailed(java.lang.String detailed) {
        this.detailed = detailed;
    }


    /**
     * Gets the trace value for this XmlError.
     * 
     * @return trace
     */
    public java.lang.String getTrace() {
        return trace;
    }


    /**
     * Sets the trace value for this XmlError.
     * 
     * @param trace
     */
    public void setTrace(java.lang.String trace) {
        this.trace = trace;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof XmlError)) return false;
        XmlError other = (XmlError) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.code == other.getCode() &&
            ((this.codeMoniker==null && other.getCodeMoniker()==null) || 
             (this.codeMoniker!=null &&
              this.codeMoniker.equals(other.getCodeMoniker()))) &&
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText()))) &&
            ((this.detailed==null && other.getDetailed()==null) || 
             (this.detailed!=null &&
              this.detailed.equals(other.getDetailed()))) &&
            ((this.trace==null && other.getTrace()==null) || 
             (this.trace!=null &&
              this.trace.equals(other.getTrace())));
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
        _hashCode += getCode();
        if (getCodeMoniker() != null) {
            _hashCode += getCodeMoniker().hashCode();
        }
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        if (getDetailed() != null) {
            _hashCode += getDetailed().hashCode();
        }
        if (getTrace() != null) {
            _hashCode += getTrace().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(XmlError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ws.rki.dk", "XmlError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeMoniker");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "CodeMoniker"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailed");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Detailed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trace");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ws.rki.dk", "Trace"));
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
