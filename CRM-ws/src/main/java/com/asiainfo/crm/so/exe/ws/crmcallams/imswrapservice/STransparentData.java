/**
 * STransparentData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class STransparentData  implements java.io.Serializable {
    private java.lang.String transparentData1;

    private java.lang.String transparentData2;

    private java.lang.String transparentData3;

    public STransparentData() {
    }

    public STransparentData(
           java.lang.String transparentData1,
           java.lang.String transparentData2,
           java.lang.String transparentData3) {
           this.transparentData1 = transparentData1;
           this.transparentData2 = transparentData2;
           this.transparentData3 = transparentData3;
    }


    /**
     * Gets the transparentData1 value for this STransparentData.
     * 
     * @return transparentData1
     */
    public java.lang.String getTransparentData1() {
        return transparentData1;
    }


    /**
     * Sets the transparentData1 value for this STransparentData.
     * 
     * @param transparentData1
     */
    public void setTransparentData1(java.lang.String transparentData1) {
        this.transparentData1 = transparentData1;
    }


    /**
     * Gets the transparentData2 value for this STransparentData.
     * 
     * @return transparentData2
     */
    public java.lang.String getTransparentData2() {
        return transparentData2;
    }


    /**
     * Sets the transparentData2 value for this STransparentData.
     * 
     * @param transparentData2
     */
    public void setTransparentData2(java.lang.String transparentData2) {
        this.transparentData2 = transparentData2;
    }


    /**
     * Gets the transparentData3 value for this STransparentData.
     * 
     * @return transparentData3
     */
    public java.lang.String getTransparentData3() {
        return transparentData3;
    }


    /**
     * Sets the transparentData3 value for this STransparentData.
     * 
     * @param transparentData3
     */
    public void setTransparentData3(java.lang.String transparentData3) {
        this.transparentData3 = transparentData3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof STransparentData)) return false;
        STransparentData other = (STransparentData) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transparentData1==null && other.getTransparentData1()==null) || 
             (this.transparentData1!=null &&
              this.transparentData1.equals(other.getTransparentData1()))) &&
            ((this.transparentData2==null && other.getTransparentData2()==null) || 
             (this.transparentData2!=null &&
              this.transparentData2.equals(other.getTransparentData2()))) &&
            ((this.transparentData3==null && other.getTransparentData3()==null) || 
             (this.transparentData3!=null &&
              this.transparentData3.equals(other.getTransparentData3())));
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
        if (getTransparentData1() != null) {
            _hashCode += getTransparentData1().hashCode();
        }
        if (getTransparentData2() != null) {
            _hashCode += getTransparentData2().hashCode();
        }
        if (getTransparentData3() != null) {
            _hashCode += getTransparentData3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(STransparentData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sTransparentData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transparentData1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transparentData1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transparentData2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transparentData2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transparentData3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transparentData3"));
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
