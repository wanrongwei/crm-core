/**
 * SRegretOfferInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class SRegretOfferInfo  implements java.io.Serializable {
    private java.lang.Long upcOfferId;

    private java.lang.String offerName;

    private java.lang.Double charge;

    private java.lang.Integer measureId;

    private java.lang.String iMEI;

    public SRegretOfferInfo() {
    }

    public SRegretOfferInfo(
           java.lang.Long upcOfferId,
           java.lang.String offerName,
           java.lang.Double charge,
           java.lang.Integer measureId,
           java.lang.String iMEI) {
           this.upcOfferId = upcOfferId;
           this.offerName = offerName;
           this.charge = charge;
           this.measureId = measureId;
           this.iMEI = iMEI;
    }


    /**
     * Gets the upcOfferId value for this SRegretOfferInfo.
     * 
     * @return upcOfferId
     */
    public java.lang.Long getUpcOfferId() {
        return upcOfferId;
    }


    /**
     * Sets the upcOfferId value for this SRegretOfferInfo.
     * 
     * @param upcOfferId
     */
    public void setUpcOfferId(java.lang.Long upcOfferId) {
        this.upcOfferId = upcOfferId;
    }


    /**
     * Gets the offerName value for this SRegretOfferInfo.
     * 
     * @return offerName
     */
    public java.lang.String getOfferName() {
        return offerName;
    }


    /**
     * Sets the offerName value for this SRegretOfferInfo.
     * 
     * @param offerName
     */
    public void setOfferName(java.lang.String offerName) {
        this.offerName = offerName;
    }


    /**
     * Gets the charge value for this SRegretOfferInfo.
     * 
     * @return charge
     */
    public java.lang.Double getCharge() {
        return charge;
    }


    /**
     * Sets the charge value for this SRegretOfferInfo.
     * 
     * @param charge
     */
    public void setCharge(java.lang.Double charge) {
        this.charge = charge;
    }


    /**
     * Gets the measureId value for this SRegretOfferInfo.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this SRegretOfferInfo.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the iMEI value for this SRegretOfferInfo.
     * 
     * @return iMEI
     */
    public java.lang.String getIMEI() {
        return iMEI;
    }


    /**
     * Sets the iMEI value for this SRegretOfferInfo.
     * 
     * @param iMEI
     */
    public void setIMEI(java.lang.String iMEI) {
        this.iMEI = iMEI;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SRegretOfferInfo)) return false;
        SRegretOfferInfo other = (SRegretOfferInfo) obj;
        
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
            ((this.offerName==null && other.getOfferName()==null) || 
             (this.offerName!=null &&
              this.offerName.equals(other.getOfferName()))) &&
            ((this.charge==null && other.getCharge()==null) || 
             (this.charge!=null &&
              this.charge.equals(other.getCharge()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.iMEI==null && other.getIMEI()==null) || 
             (this.iMEI!=null &&
              this.iMEI.equals(other.getIMEI())));
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
        if (getOfferName() != null) {
            _hashCode += getOfferName().hashCode();
        }
        if (getCharge() != null) {
            _hashCode += getCharge().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getIMEI() != null) {
            _hashCode += getIMEI().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SRegretOfferInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sRegretOfferInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upcOfferId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "upcOfferId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "charge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measureId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measureId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
