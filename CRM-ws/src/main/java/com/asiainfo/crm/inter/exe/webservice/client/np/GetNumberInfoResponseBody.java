/**
 * GetNumberInfoResponseBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.np;

public class GetNumberInfoResponseBody  implements java.io.Serializable {
    private java.lang.String SO;

    private java.lang.String NO;

    private java.lang.String RH;

    private java.lang.String RI;

    private java.lang.String CI;

    private java.lang.String numberType;

    public GetNumberInfoResponseBody() {
    }

    public GetNumberInfoResponseBody(
           java.lang.String SO,
           java.lang.String NO,
           java.lang.String RH,
           java.lang.String RI,
           java.lang.String CI,
           java.lang.String numberType) {
           this.SO = SO;
           this.NO = NO;
           this.RH = RH;
           this.RI = RI;
           this.CI = CI;
           this.numberType = numberType;
    }


    /**
     * Gets the SO value for this GetNumberInfoResponseBody.
     * 
     * @return SO
     */
    public java.lang.String getSO() {
        return SO;
    }


    /**
     * Sets the SO value for this GetNumberInfoResponseBody.
     * 
     * @param SO
     */
    public void setSO(java.lang.String SO) {
        this.SO = SO;
    }


    /**
     * Gets the NO value for this GetNumberInfoResponseBody.
     * 
     * @return NO
     */
    public java.lang.String getNO() {
        return NO;
    }


    /**
     * Sets the NO value for this GetNumberInfoResponseBody.
     * 
     * @param NO
     */
    public void setNO(java.lang.String NO) {
        this.NO = NO;
    }


    /**
     * Gets the RH value for this GetNumberInfoResponseBody.
     * 
     * @return RH
     */
    public java.lang.String getRH() {
        return RH;
    }


    /**
     * Sets the RH value for this GetNumberInfoResponseBody.
     * 
     * @param RH
     */
    public void setRH(java.lang.String RH) {
        this.RH = RH;
    }


    /**
     * Gets the RI value for this GetNumberInfoResponseBody.
     * 
     * @return RI
     */
    public java.lang.String getRI() {
        return RI;
    }


    /**
     * Sets the RI value for this GetNumberInfoResponseBody.
     * 
     * @param RI
     */
    public void setRI(java.lang.String RI) {
        this.RI = RI;
    }


    /**
     * Gets the CI value for this GetNumberInfoResponseBody.
     * 
     * @return CI
     */
    public java.lang.String getCI() {
        return CI;
    }


    /**
     * Sets the CI value for this GetNumberInfoResponseBody.
     * 
     * @param CI
     */
    public void setCI(java.lang.String CI) {
        this.CI = CI;
    }


    /**
     * Gets the numberType value for this GetNumberInfoResponseBody.
     * 
     * @return numberType
     */
    public java.lang.String getNumberType() {
        return numberType;
    }


    /**
     * Sets the numberType value for this GetNumberInfoResponseBody.
     * 
     * @param numberType
     */
    public void setNumberType(java.lang.String numberType) {
        this.numberType = numberType;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetNumberInfoResponseBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "getNumberInfoResponseBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RH");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumberType"));
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
