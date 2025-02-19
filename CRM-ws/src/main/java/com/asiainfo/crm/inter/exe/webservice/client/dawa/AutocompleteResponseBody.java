/**
 * AutocompleteResponseBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.dawa;

public class AutocompleteResponseBody  implements java.io.Serializable {
    private com.asiainfo.crm.inter.exe.webservice.client.dawa.Adresser[] adresserList;

    public AutocompleteResponseBody() {
    }

    public AutocompleteResponseBody(
           com.asiainfo.crm.inter.exe.webservice.client.dawa.Adresser[] adresserList) {
           this.adresserList = adresserList;
    }


    /**
     * Gets the adresserList value for this AutocompleteResponseBody.
     * 
     * @return adresserList
     */
    public com.asiainfo.crm.inter.exe.webservice.client.dawa.Adresser[] getAdresserList() {
        return adresserList;
    }


    /**
     * Sets the adresserList value for this AutocompleteResponseBody.
     * 
     * @param adresserList
     */
    public void setAdresserList(com.asiainfo.crm.inter.exe.webservice.client.dawa.Adresser[] adresserList) {
        this.adresserList = adresserList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AutocompleteResponseBody)) return false;
        AutocompleteResponseBody other = (AutocompleteResponseBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adresserList==null && other.getAdresserList()==null) || 
             (this.adresserList!=null &&
              java.util.Arrays.equals(this.adresserList, other.getAdresserList())));
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
        if (getAdresserList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdresserList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdresserList(), i);
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
        new org.apache.axis.description.TypeDesc(AutocompleteResponseBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "autocompleteResponseBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adresserList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adresserList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "adresser"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "adresser"));
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
