/**
 * YwsSdSoControlData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.sap;

public class YwsSdSoControlData  implements java.io.Serializable {
    private java.lang.String simulate;

    private java.lang.String createdBy;

    private java.lang.String withoutSernumCheck;

    public YwsSdSoControlData() {
    }

    public YwsSdSoControlData(
           java.lang.String simulate,
           java.lang.String createdBy,
           java.lang.String withoutSernumCheck) {
           this.simulate = simulate;
           this.createdBy = createdBy;
           this.withoutSernumCheck = withoutSernumCheck;
    }


    /**
     * Gets the simulate value for this YwsSdSoControlData.
     * 
     * @return simulate
     */
    public java.lang.String getSimulate() {
        return simulate;
    }


    /**
     * Sets the simulate value for this YwsSdSoControlData.
     * 
     * @param simulate
     */
    public void setSimulate(java.lang.String simulate) {
        this.simulate = simulate;
    }


    /**
     * Gets the createdBy value for this YwsSdSoControlData.
     * 
     * @return createdBy
     */
    public java.lang.String getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this YwsSdSoControlData.
     * 
     * @param createdBy
     */
    public void setCreatedBy(java.lang.String createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the withoutSernumCheck value for this YwsSdSoControlData.
     * 
     * @return withoutSernumCheck
     */
    public java.lang.String getWithoutSernumCheck() {
        return withoutSernumCheck;
    }


    /**
     * Sets the withoutSernumCheck value for this YwsSdSoControlData.
     * 
     * @param withoutSernumCheck
     */
    public void setWithoutSernumCheck(java.lang.String withoutSernumCheck) {
        this.withoutSernumCheck = withoutSernumCheck;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof YwsSdSoControlData)) return false;
        YwsSdSoControlData other = (YwsSdSoControlData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.simulate==null && other.getSimulate()==null) || 
             (this.simulate!=null &&
              this.simulate.equals(other.getSimulate()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.withoutSernumCheck==null && other.getWithoutSernumCheck()==null) || 
             (this.withoutSernumCheck!=null &&
              this.withoutSernumCheck.equals(other.getWithoutSernumCheck())));
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
        if (getSimulate() != null) {
            _hashCode += getSimulate().hashCode();
        }
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getWithoutSernumCheck() != null) {
            _hashCode += getWithoutSernumCheck().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(YwsSdSoControlData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSdSoControlData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simulate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Simulate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("withoutSernumCheck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WithoutSernumCheck"));
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
