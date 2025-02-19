/**
 * SReplyInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class SReplyInfo  implements java.io.Serializable {
    private java.lang.Integer service_id;

    private java.lang.String[] fieldNameList;

    private java.lang.String[][] cdrDisplayList;

    public SReplyInfo() {
    }

    public SReplyInfo(
           java.lang.Integer service_id,
           java.lang.String[] fieldNameList,
           java.lang.String[][] cdrDisplayList) {
           this.service_id = service_id;
           this.fieldNameList = fieldNameList;
           this.cdrDisplayList = cdrDisplayList;
    }


    /**
     * Gets the service_id value for this SReplyInfo.
     * 
     * @return service_id
     */
    public java.lang.Integer getService_id() {
        return service_id;
    }


    /**
     * Sets the service_id value for this SReplyInfo.
     * 
     * @param service_id
     */
    public void setService_id(java.lang.Integer service_id) {
        this.service_id = service_id;
    }


    /**
     * Gets the fieldNameList value for this SReplyInfo.
     * 
     * @return fieldNameList
     */
    public java.lang.String[] getFieldNameList() {
        return fieldNameList;
    }


    /**
     * Sets the fieldNameList value for this SReplyInfo.
     * 
     * @param fieldNameList
     */
    public void setFieldNameList(java.lang.String[] fieldNameList) {
        this.fieldNameList = fieldNameList;
    }

    public java.lang.String getFieldNameList(int i) {
        return this.fieldNameList[i];
    }

    public void setFieldNameList(int i, java.lang.String _value) {
        this.fieldNameList[i] = _value;
    }


    /**
     * Gets the cdrDisplayList value for this SReplyInfo.
     * 
     * @return cdrDisplayList
     */
    public java.lang.String[][] getCdrDisplayList() {
        return cdrDisplayList;
    }


    /**
     * Sets the cdrDisplayList value for this SReplyInfo.
     * 
     * @param cdrDisplayList
     */
    public void setCdrDisplayList(java.lang.String[][] cdrDisplayList) {
        this.cdrDisplayList = cdrDisplayList;
    }

    public java.lang.String[] getCdrDisplayList(int i) {
        return this.cdrDisplayList[i];
    }

    public void setCdrDisplayList(int i, java.lang.String[] _value) {
        this.cdrDisplayList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SReplyInfo)) return false;
        SReplyInfo other = (SReplyInfo) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.service_id==null && other.getService_id()==null) || 
             (this.service_id!=null &&
              this.service_id.equals(other.getService_id()))) &&
            ((this.fieldNameList==null && other.getFieldNameList()==null) || 
             (this.fieldNameList!=null &&
              java.util.Arrays.equals(this.fieldNameList, other.getFieldNameList()))) &&
            ((this.cdrDisplayList==null && other.getCdrDisplayList()==null) || 
             (this.cdrDisplayList!=null &&
              java.util.Arrays.equals(this.cdrDisplayList, other.getCdrDisplayList())));
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
        if (getService_id() != null) {
            _hashCode += getService_id().hashCode();
        }
        if (getFieldNameList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldNameList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldNameList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCdrDisplayList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCdrDisplayList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCdrDisplayList(), i);
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
        new org.apache.axis.description.TypeDesc(SReplyInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sReplyInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "service_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldNameList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fieldNameList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdrDisplayList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdrDisplayList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "cdrDisplay"));
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
