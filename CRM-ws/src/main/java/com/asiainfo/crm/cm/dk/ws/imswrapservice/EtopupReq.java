/**
 * EtopupReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class EtopupReq  implements java.io.Serializable {
    private java.lang.String phone_id;

    private java.lang.String batchno;

    private java.lang.String serialno;

    private java.lang.String cardpin;

    private java.lang.Short charge_type;

    public EtopupReq() {
    }

    public EtopupReq(
           java.lang.String phone_id,
           java.lang.String batchno,
           java.lang.String serialno,
           java.lang.String cardpin,
           java.lang.Short charge_type) {
           this.phone_id = phone_id;
           this.batchno = batchno;
           this.serialno = serialno;
           this.cardpin = cardpin;
           this.charge_type = charge_type;
    }


    /**
     * Gets the phone_id value for this EtopupReq.
     * 
     * @return phone_id
     */
    public java.lang.String getPhone_id() {
        return phone_id;
    }


    /**
     * Sets the phone_id value for this EtopupReq.
     * 
     * @param phone_id
     */
    public void setPhone_id(java.lang.String phone_id) {
        this.phone_id = phone_id;
    }


    /**
     * Gets the batchno value for this EtopupReq.
     * 
     * @return batchno
     */
    public java.lang.String getBatchno() {
        return batchno;
    }


    /**
     * Sets the batchno value for this EtopupReq.
     * 
     * @param batchno
     */
    public void setBatchno(java.lang.String batchno) {
        this.batchno = batchno;
    }


    /**
     * Gets the serialno value for this EtopupReq.
     * 
     * @return serialno
     */
    public java.lang.String getSerialno() {
        return serialno;
    }


    /**
     * Sets the serialno value for this EtopupReq.
     * 
     * @param serialno
     */
    public void setSerialno(java.lang.String serialno) {
        this.serialno = serialno;
    }


    /**
     * Gets the cardpin value for this EtopupReq.
     * 
     * @return cardpin
     */
    public java.lang.String getCardpin() {
        return cardpin;
    }


    /**
     * Sets the cardpin value for this EtopupReq.
     * 
     * @param cardpin
     */
    public void setCardpin(java.lang.String cardpin) {
        this.cardpin = cardpin;
    }


    /**
     * Gets the charge_type value for this EtopupReq.
     * 
     * @return charge_type
     */
    public java.lang.Short getCharge_type() {
        return charge_type;
    }


    /**
     * Sets the charge_type value for this EtopupReq.
     * 
     * @param charge_type
     */
    public void setCharge_type(java.lang.Short charge_type) {
        this.charge_type = charge_type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EtopupReq)) return false;
        EtopupReq other = (EtopupReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.phone_id==null && other.getPhone_id()==null) || 
             (this.phone_id!=null &&
              this.phone_id.equals(other.getPhone_id()))) &&
            ((this.batchno==null && other.getBatchno()==null) || 
             (this.batchno!=null &&
              this.batchno.equals(other.getBatchno()))) &&
            ((this.serialno==null && other.getSerialno()==null) || 
             (this.serialno!=null &&
              this.serialno.equals(other.getSerialno()))) &&
            ((this.cardpin==null && other.getCardpin()==null) || 
             (this.cardpin!=null &&
              this.cardpin.equals(other.getCardpin()))) &&
            ((this.charge_type==null && other.getCharge_type()==null) || 
             (this.charge_type!=null &&
              this.charge_type.equals(other.getCharge_type())));
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
        if (getPhone_id() != null) {
            _hashCode += getPhone_id().hashCode();
        }
        if (getBatchno() != null) {
            _hashCode += getBatchno().hashCode();
        }
        if (getSerialno() != null) {
            _hashCode += getSerialno().hashCode();
        }
        if (getCardpin() != null) {
            _hashCode += getCardpin().hashCode();
        }
        if (getCharge_type() != null) {
            _hashCode += getCharge_type().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EtopupReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "etopupReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phone_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "batchno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serialno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardpin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardpin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charge_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "charge_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
