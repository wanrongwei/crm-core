/**
 * SQueryCDRBusiReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class SQueryCDRBusiReq  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SPageInfo pageInfo;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ScdrBusiInfo sCDRBusiInfo;

    public SQueryCDRBusiReq() {
    }

    public SQueryCDRBusiReq(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SPageInfo pageInfo,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ScdrBusiInfo sCDRBusiInfo) {
           this.pageInfo = pageInfo;
           this.sCDRBusiInfo = sCDRBusiInfo;
    }


    /**
     * Gets the pageInfo value for this SQueryCDRBusiReq.
     * 
     * @return pageInfo
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SPageInfo getPageInfo() {
        return pageInfo;
    }


    /**
     * Sets the pageInfo value for this SQueryCDRBusiReq.
     * 
     * @param pageInfo
     */
    public void setPageInfo(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SPageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }


    /**
     * Gets the sCDRBusiInfo value for this SQueryCDRBusiReq.
     * 
     * @return sCDRBusiInfo
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ScdrBusiInfo getSCDRBusiInfo() {
        return sCDRBusiInfo;
    }


    /**
     * Sets the sCDRBusiInfo value for this SQueryCDRBusiReq.
     * 
     * @param sCDRBusiInfo
     */
    public void setSCDRBusiInfo(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ScdrBusiInfo sCDRBusiInfo) {
        this.sCDRBusiInfo = sCDRBusiInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SQueryCDRBusiReq)) return false;
        SQueryCDRBusiReq other = (SQueryCDRBusiReq) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pageInfo==null && other.getPageInfo()==null) || 
             (this.pageInfo!=null &&
              this.pageInfo.equals(other.getPageInfo()))) &&
            ((this.sCDRBusiInfo==null && other.getSCDRBusiInfo()==null) || 
             (this.sCDRBusiInfo!=null &&
              this.sCDRBusiInfo.equals(other.getSCDRBusiInfo())));
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
        if (getPageInfo() != null) {
            _hashCode += getPageInfo().hashCode();
        }
        if (getSCDRBusiInfo() != null) {
            _hashCode += getSCDRBusiInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SQueryCDRBusiReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryCDRBusiReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pageInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPageInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCDRBusiInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sCDRBusiInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "scdrBusiInfo"));
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
