/**
 * TariffResInfoReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class TariffResInfoReq  implements java.io.Serializable {
    private Long offeringId;

    private long[] listItemId;

    public TariffResInfoReq() {
    }

    public TariffResInfoReq(
           Long offeringId,
           long[] listItemId) {
           this.offeringId = offeringId;
           this.listItemId = listItemId;
    }


    /**
     * Gets the offeringId value for this TariffResInfoReq.
     * 
     * @return offeringId
     */
    public Long getOfferingId() {
        return offeringId;
    }


    /**
     * Sets the offeringId value for this TariffResInfoReq.
     * 
     * @param offeringId
     */
    public void setOfferingId(Long offeringId) {
        this.offeringId = offeringId;
    }


    /**
     * Gets the listItemId value for this TariffResInfoReq.
     * 
     * @return listItemId
     */
    public long[] getListItemId() {
        return listItemId;
    }


    /**
     * Sets the listItemId value for this TariffResInfoReq.
     * 
     * @param listItemId
     */
    public void setListItemId(long[] listItemId) {
        this.listItemId = listItemId;
    }

    public long getListItemId(int i) {
        return this.listItemId[i];
    }

    public void setListItemId(int i, long _value) {
        this.listItemId[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TariffResInfoReq)) return false;
        TariffResInfoReq other = (TariffResInfoReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.offeringId==null && other.getOfferingId()==null) || 
             (this.offeringId!=null &&
              this.offeringId.equals(other.getOfferingId()))) &&
            ((this.listItemId==null && other.getListItemId()==null) || 
             (this.listItemId!=null &&
              java.util.Arrays.equals(this.listItemId, other.getListItemId())));
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
        if (getOfferingId() != null) {
            _hashCode += getOfferingId().hashCode();
        }
        if (getListItemId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListItemId());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getListItemId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TariffResInfoReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "tariffResInfoReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offeringId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
