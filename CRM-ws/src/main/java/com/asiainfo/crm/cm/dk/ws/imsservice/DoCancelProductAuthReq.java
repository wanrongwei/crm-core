/**
 * DoCancelProductAuthReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class DoCancelProductAuthReq  implements java.io.Serializable {
    private java.lang.String phoneId;

    private java.lang.String orgOutSoNbr;

    private java.lang.String orgOutSoDate;

    public DoCancelProductAuthReq() {
    }

    public DoCancelProductAuthReq(
           java.lang.String phoneId,
           java.lang.String orgOutSoNbr,
           java.lang.String orgOutSoDate) {
           this.phoneId = phoneId;
           this.orgOutSoNbr = orgOutSoNbr;
           this.orgOutSoDate = orgOutSoDate;
    }


    /**
     * Gets the phoneId value for this DoCancelProductAuthReq.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this DoCancelProductAuthReq.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the orgOutSoNbr value for this DoCancelProductAuthReq.
     * 
     * @return orgOutSoNbr
     */
    public java.lang.String getOrgOutSoNbr() {
        return orgOutSoNbr;
    }


    /**
     * Sets the orgOutSoNbr value for this DoCancelProductAuthReq.
     * 
     * @param orgOutSoNbr
     */
    public void setOrgOutSoNbr(java.lang.String orgOutSoNbr) {
        this.orgOutSoNbr = orgOutSoNbr;
    }


    /**
     * Gets the orgOutSoDate value for this DoCancelProductAuthReq.
     * 
     * @return orgOutSoDate
     */
    public java.lang.String getOrgOutSoDate() {
        return orgOutSoDate;
    }


    /**
     * Sets the orgOutSoDate value for this DoCancelProductAuthReq.
     * 
     * @param orgOutSoDate
     */
    public void setOrgOutSoDate(java.lang.String orgOutSoDate) {
        this.orgOutSoDate = orgOutSoDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoCancelProductAuthReq)) return false;
        DoCancelProductAuthReq other = (DoCancelProductAuthReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.phoneId==null && other.getPhoneId()==null) || 
             (this.phoneId!=null &&
              this.phoneId.equals(other.getPhoneId()))) &&
            ((this.orgOutSoNbr==null && other.getOrgOutSoNbr()==null) || 
             (this.orgOutSoNbr!=null &&
              this.orgOutSoNbr.equals(other.getOrgOutSoNbr()))) &&
            ((this.orgOutSoDate==null && other.getOrgOutSoDate()==null) || 
             (this.orgOutSoDate!=null &&
              this.orgOutSoDate.equals(other.getOrgOutSoDate())));
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
        if (getPhoneId() != null) {
            _hashCode += getPhoneId().hashCode();
        }
        if (getOrgOutSoNbr() != null) {
            _hashCode += getOrgOutSoNbr().hashCode();
        }
        if (getOrgOutSoDate() != null) {
            _hashCode += getOrgOutSoDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoCancelProductAuthReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doCancelProductAuthReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgOutSoNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgOutSoNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgOutSoDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgOutSoDate"));
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
