/**
 * GetEsimQRbyIccIDRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.esimqueryqrservice;

public class GetEsimQRbyIccIDRequestBody  implements java.io.Serializable {
    private String iccId;

    private String format;

    public GetEsimQRbyIccIDRequestBody() {
    }

    public GetEsimQRbyIccIDRequestBody(
           String iccId,
           String format) {
           this.iccId = iccId;
           this.format = format;
    }


    /**
     * Gets the iccId value for this GetEsimQRbyIccIDRequestBody.
     * 
     * @return iccId
     */
    public String getIccId() {
        return iccId;
    }


    /**
     * Sets the iccId value for this GetEsimQRbyIccIDRequestBody.
     * 
     * @param iccId
     */
    public void setIccId(String iccId) {
        this.iccId = iccId;
    }


    /**
     * Gets the format value for this GetEsimQRbyIccIDRequestBody.
     * 
     * @return format
     */
    public String getFormat() {
        return format;
    }


    /**
     * Sets the format value for this GetEsimQRbyIccIDRequestBody.
     * 
     * @param format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetEsimQRbyIccIDRequestBody)) return false;
        GetEsimQRbyIccIDRequestBody other = (GetEsimQRbyIccIDRequestBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.iccId==null && other.getIccId()==null) || 
             (this.iccId!=null &&
              this.iccId.equals(other.getIccId()))) &&
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat())));
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
        if (getIccId() != null) {
            _hashCode += getIccId().hashCode();
        }
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetEsimQRbyIccIDRequestBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "GetEsimQRbyIccIDRequestBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iccId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iccId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("", "format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

    @Override
    public String toString() {
        return "GetEsimQRbyIccIDRequestBody{" +
                "iccId='" + iccId + '\'' +
                ", format='" + format + '\'' +
                '}';
    }
}
