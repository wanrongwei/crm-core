/**
 * QueryProductChargeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class QueryProductChargeResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SProdCharge[] prodChargeListOut;

    private java.lang.Long resCharge;

    public QueryProductChargeResponse() {
    }

    public QueryProductChargeResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SProdCharge[] prodChargeListOut,
           java.lang.Long resCharge) {
        super(
            responseHead);
        this.prodChargeListOut = prodChargeListOut;
        this.resCharge = resCharge;
    }


    /**
     * Gets the prodChargeListOut value for this QueryProductChargeResponse.
     * 
     * @return prodChargeListOut
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SProdCharge[] getProdChargeListOut() {
        return prodChargeListOut;
    }


    /**
     * Sets the prodChargeListOut value for this QueryProductChargeResponse.
     * 
     * @param prodChargeListOut
     */
    public void setProdChargeListOut(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SProdCharge[] prodChargeListOut) {
        this.prodChargeListOut = prodChargeListOut;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SProdCharge getProdChargeListOut(int i) {
        return this.prodChargeListOut[i];
    }

    public void setProdChargeListOut(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SProdCharge _value) {
        this.prodChargeListOut[i] = _value;
    }


    /**
     * Gets the resCharge value for this QueryProductChargeResponse.
     * 
     * @return resCharge
     */
    public java.lang.Long getResCharge() {
        return resCharge;
    }


    /**
     * Sets the resCharge value for this QueryProductChargeResponse.
     * 
     * @param resCharge
     */
    public void setResCharge(java.lang.Long resCharge) {
        this.resCharge = resCharge;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryProductChargeResponse)) return false;
        QueryProductChargeResponse other = (QueryProductChargeResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.prodChargeListOut==null && other.getProdChargeListOut()==null) || 
             (this.prodChargeListOut!=null &&
              java.util.Arrays.equals(this.prodChargeListOut, other.getProdChargeListOut()))) &&
            ((this.resCharge==null && other.getResCharge()==null) || 
             (this.resCharge!=null &&
              this.resCharge.equals(other.getResCharge())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getProdChargeListOut() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProdChargeListOut());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProdChargeListOut(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResCharge() != null) {
            _hashCode += getResCharge().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryProductChargeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryProductChargeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prodChargeListOut");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prodChargeListOut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProdCharge"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resCharge"));
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
