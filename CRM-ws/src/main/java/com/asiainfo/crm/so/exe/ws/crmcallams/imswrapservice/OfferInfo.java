/**
 * OfferInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class OfferInfo  implements java.io.Serializable {
    private java.lang.Long upcOfferId;

    private java.lang.String iMEI;

    private java.lang.Long tempIMEI;

    public OfferInfo() {
    }

    public OfferInfo(
           java.lang.Long upcOfferId,
           java.lang.String iMEI,
           java.lang.Long tempIMEI) {
           this.upcOfferId = upcOfferId;
           this.iMEI = iMEI;
           this.tempIMEI = tempIMEI;
    }


    /**
     * Gets the upcOfferId value for this OfferInfo.
     * 
     * @return upcOfferId
     */
    public java.lang.Long getUpcOfferId() {
        return upcOfferId;
    }


    /**
     * Sets the upcOfferId value for this OfferInfo.
     * 
     * @param upcOfferId
     */
    public void setUpcOfferId(java.lang.Long upcOfferId) {
        this.upcOfferId = upcOfferId;
    }


    /**
     * Gets the iMEI value for this OfferInfo.
     * 
     * @return iMEI
     */
    public java.lang.String getIMEI() {
        return iMEI;
    }


    /**
     * Sets the iMEI value for this OfferInfo.
     * 
     * @param iMEI
     */
    public void setIMEI(java.lang.String iMEI) {
        this.iMEI = iMEI;
    }


    /**
     * Gets the tempIMEI value for this OfferInfo.
     * 
     * @return tempIMEI
     */
    public java.lang.Long getTempIMEI() {
        return tempIMEI;
    }


    /**
     * Sets the tempIMEI value for this OfferInfo.
     * 
     * @param tempIMEI
     */
    public void setTempIMEI(java.lang.Long tempIMEI) {
        this.tempIMEI = tempIMEI;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OfferInfo)) return false;
        OfferInfo other = (OfferInfo) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.upcOfferId==null && other.getUpcOfferId()==null) || 
             (this.upcOfferId!=null &&
              this.upcOfferId.equals(other.getUpcOfferId()))) &&
            ((this.iMEI==null && other.getIMEI()==null) || 
             (this.iMEI!=null &&
              this.iMEI.equals(other.getIMEI()))) &&
            ((this.tempIMEI==null && other.getTempIMEI()==null) || 
             (this.tempIMEI!=null &&
              this.tempIMEI.equals(other.getTempIMEI())));
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
        if (getUpcOfferId() != null) {
            _hashCode += getUpcOfferId().hashCode();
        }
        if (getIMEI() != null) {
            _hashCode += getIMEI().hashCode();
        }
        if (getTempIMEI() != null) {
            _hashCode += getTempIMEI().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OfferInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "offerInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upcOfferId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "upcOfferId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMEI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iMEI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tempIMEI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tempIMEI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
