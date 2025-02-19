/**
 * DoQueryCallScreenResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class DoQueryCallScreenResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private java.lang.Short cLIR_flag;

    private java.lang.Short call_screen_no_type;

    private java.lang.Long product_id;

    private java.lang.Short routing_method;

    private java.lang.String iCSSendSMSFlag;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SCallScreenNo[] callscreen_list;

    public DoQueryCallScreenResponse() {
    }

    public DoQueryCallScreenResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ResponseHead responseHead,
           java.lang.Short cLIR_flag,
           java.lang.Short call_screen_no_type,
           java.lang.Long product_id,
           java.lang.Short routing_method,
           java.lang.String iCSSendSMSFlag,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SCallScreenNo[] callscreen_list) {
        super(
            responseHead);
        this.cLIR_flag = cLIR_flag;
        this.call_screen_no_type = call_screen_no_type;
        this.product_id = product_id;
        this.routing_method = routing_method;
        this.iCSSendSMSFlag = iCSSendSMSFlag;
        this.callscreen_list = callscreen_list;
    }


    /**
     * Gets the cLIR_flag value for this DoQueryCallScreenResponse.
     * 
     * @return cLIR_flag
     */
    public java.lang.Short getCLIR_flag() {
        return cLIR_flag;
    }


    /**
     * Sets the cLIR_flag value for this DoQueryCallScreenResponse.
     * 
     * @param cLIR_flag
     */
    public void setCLIR_flag(java.lang.Short cLIR_flag) {
        this.cLIR_flag = cLIR_flag;
    }


    /**
     * Gets the call_screen_no_type value for this DoQueryCallScreenResponse.
     * 
     * @return call_screen_no_type
     */
    public java.lang.Short getCall_screen_no_type() {
        return call_screen_no_type;
    }


    /**
     * Sets the call_screen_no_type value for this DoQueryCallScreenResponse.
     * 
     * @param call_screen_no_type
     */
    public void setCall_screen_no_type(java.lang.Short call_screen_no_type) {
        this.call_screen_no_type = call_screen_no_type;
    }


    /**
     * Gets the product_id value for this DoQueryCallScreenResponse.
     * 
     * @return product_id
     */
    public java.lang.Long getProduct_id() {
        return product_id;
    }


    /**
     * Sets the product_id value for this DoQueryCallScreenResponse.
     * 
     * @param product_id
     */
    public void setProduct_id(java.lang.Long product_id) {
        this.product_id = product_id;
    }


    /**
     * Gets the routing_method value for this DoQueryCallScreenResponse.
     * 
     * @return routing_method
     */
    public java.lang.Short getRouting_method() {
        return routing_method;
    }


    /**
     * Sets the routing_method value for this DoQueryCallScreenResponse.
     * 
     * @param routing_method
     */
    public void setRouting_method(java.lang.Short routing_method) {
        this.routing_method = routing_method;
    }


    /**
     * Gets the iCSSendSMSFlag value for this DoQueryCallScreenResponse.
     * 
     * @return iCSSendSMSFlag
     */
    public java.lang.String getICSSendSMSFlag() {
        return iCSSendSMSFlag;
    }


    /**
     * Sets the iCSSendSMSFlag value for this DoQueryCallScreenResponse.
     * 
     * @param iCSSendSMSFlag
     */
    public void setICSSendSMSFlag(java.lang.String iCSSendSMSFlag) {
        this.iCSSendSMSFlag = iCSSendSMSFlag;
    }


    /**
     * Gets the callscreen_list value for this DoQueryCallScreenResponse.
     * 
     * @return callscreen_list
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SCallScreenNo[] getCallscreen_list() {
        return callscreen_list;
    }


    /**
     * Sets the callscreen_list value for this DoQueryCallScreenResponse.
     * 
     * @param callscreen_list
     */
    public void setCallscreen_list(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SCallScreenNo[] callscreen_list) {
        this.callscreen_list = callscreen_list;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryCallScreenResponse)) return false;
        DoQueryCallScreenResponse other = (DoQueryCallScreenResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cLIR_flag==null && other.getCLIR_flag()==null) || 
             (this.cLIR_flag!=null &&
              this.cLIR_flag.equals(other.getCLIR_flag()))) &&
            ((this.call_screen_no_type==null && other.getCall_screen_no_type()==null) || 
             (this.call_screen_no_type!=null &&
              this.call_screen_no_type.equals(other.getCall_screen_no_type()))) &&
            ((this.product_id==null && other.getProduct_id()==null) || 
             (this.product_id!=null &&
              this.product_id.equals(other.getProduct_id()))) &&
            ((this.routing_method==null && other.getRouting_method()==null) || 
             (this.routing_method!=null &&
              this.routing_method.equals(other.getRouting_method()))) &&
            ((this.iCSSendSMSFlag==null && other.getICSSendSMSFlag()==null) || 
             (this.iCSSendSMSFlag!=null &&
              this.iCSSendSMSFlag.equals(other.getICSSendSMSFlag()))) &&
            ((this.callscreen_list==null && other.getCallscreen_list()==null) || 
             (this.callscreen_list!=null &&
              java.util.Arrays.equals(this.callscreen_list, other.getCallscreen_list())));
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
        if (getCLIR_flag() != null) {
            _hashCode += getCLIR_flag().hashCode();
        }
        if (getCall_screen_no_type() != null) {
            _hashCode += getCall_screen_no_type().hashCode();
        }
        if (getProduct_id() != null) {
            _hashCode += getProduct_id().hashCode();
        }
        if (getRouting_method() != null) {
            _hashCode += getRouting_method().hashCode();
        }
        if (getICSSendSMSFlag() != null) {
            _hashCode += getICSSendSMSFlag().hashCode();
        }
        if (getCallscreen_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCallscreen_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCallscreen_list(), i);
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
        new org.apache.axis.description.TypeDesc(DoQueryCallScreenResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryCallScreenResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CLIR_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cLIR_flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("call_screen_no_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "call_screen_no_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routing_method");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routing_method"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ICSSendSMSFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iCSSendSMSFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callscreen_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callscreen_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCallScreenNo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "sCallScreenNoList_Item"));
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
