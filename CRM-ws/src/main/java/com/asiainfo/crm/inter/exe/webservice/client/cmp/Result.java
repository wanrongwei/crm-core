/**
 * Result.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.cmp;

public class Result  implements java.io.Serializable {
    private java.lang.String userId;

    private java.lang.String idTypeId;

    private java.lang.String agreed;

    public Result() {
    }

    public Result(
           java.lang.String userId,
           java.lang.String idTypeId,
           java.lang.String agreed) {
           this.userId = userId;
           this.idTypeId = idTypeId;
           this.agreed = agreed;
    }


    /**
     * Gets the userId value for this Result.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this Result.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the idTypeId value for this Result.
     * 
     * @return idTypeId
     */
    public java.lang.String getIdTypeId() {
        return idTypeId;
    }


    /**
     * Sets the idTypeId value for this Result.
     * 
     * @param idTypeId
     */
    public void setIdTypeId(java.lang.String idTypeId) {
        this.idTypeId = idTypeId;
    }


    /**
     * Gets the agreed value for this Result.
     * 
     * @return agreed
     */
    public java.lang.String getAgreed() {
        return agreed;
    }


    /**
     * Sets the agreed value for this Result.
     * 
     * @param agreed
     */
    public void setAgreed(java.lang.String agreed) {
        this.agreed = agreed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Result)) return false;
        Result other = (Result) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.idTypeId==null && other.getIdTypeId()==null) || 
             (this.idTypeId!=null &&
              this.idTypeId.equals(other.getIdTypeId()))) &&
            ((this.agreed==null && other.getAgreed()==null) || 
             (this.agreed!=null &&
              this.agreed.equals(other.getAgreed())));
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
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getIdTypeId() != null) {
            _hashCode += getIdTypeId().hashCode();
        }
        if (getAgreed() != null) {
            _hashCode += getAgreed().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Result.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "result"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agreed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agreed"));
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
