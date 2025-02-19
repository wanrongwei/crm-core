/**
 * GetEsimQRbyIccIDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.esimqueryqrservice;

public class GetEsimQRbyIccIDResponse  implements java.io.Serializable {
    private GetEsimQRbyIccIDResponseBody responseBody;

    public GetEsimQRbyIccIDResponse() {
    }

    public GetEsimQRbyIccIDResponse(
           GetEsimQRbyIccIDResponseBody responseBody) {
           this.responseBody = responseBody;
    }


    /**
     * Gets the responseBody value for this GetEsimQRbyIccIDResponse.
     * 
     * @return responseBody
     */
    public GetEsimQRbyIccIDResponseBody getResponseBody() {
        return responseBody;
    }


    /**
     * Sets the responseBody value for this GetEsimQRbyIccIDResponse.
     * 
     * @param responseBody
     */
    public void setResponseBody(GetEsimQRbyIccIDResponseBody responseBody) {
        this.responseBody = responseBody;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetEsimQRbyIccIDResponse)) return false;
        GetEsimQRbyIccIDResponse other = (GetEsimQRbyIccIDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.responseBody==null && other.getResponseBody()==null) || 
             (this.responseBody!=null &&
              this.responseBody.equals(other.getResponseBody())));
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
        if (getResponseBody() != null) {
            _hashCode += getResponseBody().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetEsimQRbyIccIDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "GetEsimQRbyIccIDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseBody");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResponseBody"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "GetEsimQRbyIccIDResponseBody"));
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

}
