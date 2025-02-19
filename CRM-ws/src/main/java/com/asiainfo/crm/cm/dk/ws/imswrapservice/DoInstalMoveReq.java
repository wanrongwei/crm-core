/**
 * DoInstalMoveReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class DoInstalMoveReq  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imswrapservice.SCancelInstal[] cancelInstals;

    private java.lang.Long targetAcctId;

    public DoInstalMoveReq() {
    }

    public DoInstalMoveReq(
           com.asiainfo.crm.cm.dk.ws.imswrapservice.SCancelInstal[] cancelInstals,
           java.lang.Long targetAcctId) {
           this.cancelInstals = cancelInstals;
           this.targetAcctId = targetAcctId;
    }


    /**
     * Gets the cancelInstals value for this DoInstalMoveReq.
     * 
     * @return cancelInstals
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapservice.SCancelInstal[] getCancelInstals() {
        return cancelInstals;
    }


    /**
     * Sets the cancelInstals value for this DoInstalMoveReq.
     * 
     * @param cancelInstals
     */
    public void setCancelInstals(com.asiainfo.crm.cm.dk.ws.imswrapservice.SCancelInstal[] cancelInstals) {
        this.cancelInstals = cancelInstals;
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapservice.SCancelInstal getCancelInstals(int i) {
        return this.cancelInstals[i];
    }

    public void setCancelInstals(int i, com.asiainfo.crm.cm.dk.ws.imswrapservice.SCancelInstal _value) {
        this.cancelInstals[i] = _value;
    }


    /**
     * Gets the targetAcctId value for this DoInstalMoveReq.
     * 
     * @return targetAcctId
     */
    public java.lang.Long getTargetAcctId() {
        return targetAcctId;
    }


    /**
     * Sets the targetAcctId value for this DoInstalMoveReq.
     * 
     * @param targetAcctId
     */
    public void setTargetAcctId(java.lang.Long targetAcctId) {
        this.targetAcctId = targetAcctId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoInstalMoveReq)) return false;
        DoInstalMoveReq other = (DoInstalMoveReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cancelInstals==null && other.getCancelInstals()==null) || 
             (this.cancelInstals!=null &&
              java.util.Arrays.equals(this.cancelInstals, other.getCancelInstals()))) &&
            ((this.targetAcctId==null && other.getTargetAcctId()==null) || 
             (this.targetAcctId!=null &&
              this.targetAcctId.equals(other.getTargetAcctId())));
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
        if (getCancelInstals() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCancelInstals());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCancelInstals(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTargetAcctId() != null) {
            _hashCode += getTargetAcctId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoInstalMoveReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doInstalMoveReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelInstals");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cancelInstals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCancelInstal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetAcctId"));
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
