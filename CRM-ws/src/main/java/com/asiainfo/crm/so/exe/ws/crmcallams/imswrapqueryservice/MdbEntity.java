/**
 * MdbEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class MdbEntity  implements java.io.Serializable {
    private java.lang.String[] fieldValue;

    private java.lang.String name;

    private java.lang.Integer recordNum;

    public MdbEntity() {
    }

    public MdbEntity(
           java.lang.String[] fieldValue,
           java.lang.String name,
           java.lang.Integer recordNum) {
           this.fieldValue = fieldValue;
           this.name = name;
           this.recordNum = recordNum;
    }


    /**
     * Gets the fieldValue value for this MdbEntity.
     * 
     * @return fieldValue
     */
    public java.lang.String[] getFieldValue() {
        return fieldValue;
    }


    /**
     * Sets the fieldValue value for this MdbEntity.
     * 
     * @param fieldValue
     */
    public void setFieldValue(java.lang.String[] fieldValue) {
        this.fieldValue = fieldValue;
    }

    public java.lang.String getFieldValue(int i) {
        return this.fieldValue[i];
    }

    public void setFieldValue(int i, java.lang.String _value) {
        this.fieldValue[i] = _value;
    }


    /**
     * Gets the name value for this MdbEntity.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this MdbEntity.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the recordNum value for this MdbEntity.
     * 
     * @return recordNum
     */
    public java.lang.Integer getRecordNum() {
        return recordNum;
    }


    /**
     * Sets the recordNum value for this MdbEntity.
     * 
     * @param recordNum
     */
    public void setRecordNum(java.lang.Integer recordNum) {
        this.recordNum = recordNum;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MdbEntity)) return false;
        MdbEntity other = (MdbEntity) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fieldValue==null && other.getFieldValue()==null) || 
             (this.fieldValue!=null &&
              java.util.Arrays.equals(this.fieldValue, other.getFieldValue()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.recordNum==null && other.getRecordNum()==null) || 
             (this.recordNum!=null &&
              this.recordNum.equals(other.getRecordNum())));
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
        if (getFieldValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldValue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getRecordNum() != null) {
            _hashCode += getRecordNum().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MdbEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "mdbEntity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fieldValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recordNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
