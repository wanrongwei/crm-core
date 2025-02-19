/**
 * LongestCallingSecondsGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class LongestCallingSecondsGroup  implements java.io.Serializable {
    private java.lang.String[] destinationNumberList;

    private java.lang.Long seconds;

    public LongestCallingSecondsGroup() {
    }

    public LongestCallingSecondsGroup(
           java.lang.String[] destinationNumberList,
           java.lang.Long seconds) {
           this.destinationNumberList = destinationNumberList;
           this.seconds = seconds;
    }


    /**
     * Gets the destinationNumberList value for this LongestCallingSecondsGroup.
     * 
     * @return destinationNumberList
     */
    public java.lang.String[] getDestinationNumberList() {
        return destinationNumberList;
    }


    /**
     * Sets the destinationNumberList value for this LongestCallingSecondsGroup.
     * 
     * @param destinationNumberList
     */
    public void setDestinationNumberList(java.lang.String[] destinationNumberList) {
        this.destinationNumberList = destinationNumberList;
    }

    public java.lang.String getDestinationNumberList(int i) {
        return this.destinationNumberList[i];
    }

    public void setDestinationNumberList(int i, java.lang.String _value) {
        this.destinationNumberList[i] = _value;
    }


    /**
     * Gets the seconds value for this LongestCallingSecondsGroup.
     * 
     * @return seconds
     */
    public java.lang.Long getSeconds() {
        return seconds;
    }


    /**
     * Sets the seconds value for this LongestCallingSecondsGroup.
     * 
     * @param seconds
     */
    public void setSeconds(java.lang.Long seconds) {
        this.seconds = seconds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LongestCallingSecondsGroup)) return false;
        LongestCallingSecondsGroup other = (LongestCallingSecondsGroup) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.destinationNumberList==null && other.getDestinationNumberList()==null) || 
             (this.destinationNumberList!=null &&
              java.util.Arrays.equals(this.destinationNumberList, other.getDestinationNumberList()))) &&
            ((this.seconds==null && other.getSeconds()==null) || 
             (this.seconds!=null &&
              this.seconds.equals(other.getSeconds())));
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
        if (getDestinationNumberList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDestinationNumberList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDestinationNumberList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSeconds() != null) {
            _hashCode += getSeconds().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LongestCallingSecondsGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "longestCallingSecondsGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationNumberList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationNumberList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seconds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seconds"));
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
