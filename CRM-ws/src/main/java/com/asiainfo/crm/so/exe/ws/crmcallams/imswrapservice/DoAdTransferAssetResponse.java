/**
 * DoAdTransferAssetResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class DoAdTransferAssetResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CrmBaseResponse  implements java.io.Serializable {
    private java.lang.Long org_acct_id;

    private java.lang.String outer_org_acct_id;

    private java.lang.String org_phone_id;

    private java.lang.Integer org_user_id;

    private java.lang.String outer_org_user_id;

    public DoAdTransferAssetResponse() {
    }

    public DoAdTransferAssetResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ResponseHead responseHead,
           java.lang.Long org_acct_id,
           java.lang.String outer_org_acct_id,
           java.lang.String org_phone_id,
           java.lang.Integer org_user_id,
           java.lang.String outer_org_user_id) {
        super(
            responseHead);
        this.org_acct_id = org_acct_id;
        this.outer_org_acct_id = outer_org_acct_id;
        this.org_phone_id = org_phone_id;
        this.org_user_id = org_user_id;
        this.outer_org_user_id = outer_org_user_id;
    }


    /**
     * Gets the org_acct_id value for this DoAdTransferAssetResponse.
     * 
     * @return org_acct_id
     */
    public java.lang.Long getOrg_acct_id() {
        return org_acct_id;
    }


    /**
     * Sets the org_acct_id value for this DoAdTransferAssetResponse.
     * 
     * @param org_acct_id
     */
    public void setOrg_acct_id(java.lang.Long org_acct_id) {
        this.org_acct_id = org_acct_id;
    }


    /**
     * Gets the outer_org_acct_id value for this DoAdTransferAssetResponse.
     * 
     * @return outer_org_acct_id
     */
    public java.lang.String getOuter_org_acct_id() {
        return outer_org_acct_id;
    }


    /**
     * Sets the outer_org_acct_id value for this DoAdTransferAssetResponse.
     * 
     * @param outer_org_acct_id
     */
    public void setOuter_org_acct_id(java.lang.String outer_org_acct_id) {
        this.outer_org_acct_id = outer_org_acct_id;
    }


    /**
     * Gets the org_phone_id value for this DoAdTransferAssetResponse.
     * 
     * @return org_phone_id
     */
    public java.lang.String getOrg_phone_id() {
        return org_phone_id;
    }


    /**
     * Sets the org_phone_id value for this DoAdTransferAssetResponse.
     * 
     * @param org_phone_id
     */
    public void setOrg_phone_id(java.lang.String org_phone_id) {
        this.org_phone_id = org_phone_id;
    }


    /**
     * Gets the org_user_id value for this DoAdTransferAssetResponse.
     * 
     * @return org_user_id
     */
    public java.lang.Integer getOrg_user_id() {
        return org_user_id;
    }


    /**
     * Sets the org_user_id value for this DoAdTransferAssetResponse.
     * 
     * @param org_user_id
     */
    public void setOrg_user_id(java.lang.Integer org_user_id) {
        this.org_user_id = org_user_id;
    }


    /**
     * Gets the outer_org_user_id value for this DoAdTransferAssetResponse.
     * 
     * @return outer_org_user_id
     */
    public java.lang.String getOuter_org_user_id() {
        return outer_org_user_id;
    }


    /**
     * Sets the outer_org_user_id value for this DoAdTransferAssetResponse.
     * 
     * @param outer_org_user_id
     */
    public void setOuter_org_user_id(java.lang.String outer_org_user_id) {
        this.outer_org_user_id = outer_org_user_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoAdTransferAssetResponse)) return false;
        DoAdTransferAssetResponse other = (DoAdTransferAssetResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.org_acct_id==null && other.getOrg_acct_id()==null) || 
             (this.org_acct_id!=null &&
              this.org_acct_id.equals(other.getOrg_acct_id()))) &&
            ((this.outer_org_acct_id==null && other.getOuter_org_acct_id()==null) || 
             (this.outer_org_acct_id!=null &&
              this.outer_org_acct_id.equals(other.getOuter_org_acct_id()))) &&
            ((this.org_phone_id==null && other.getOrg_phone_id()==null) || 
             (this.org_phone_id!=null &&
              this.org_phone_id.equals(other.getOrg_phone_id()))) &&
            ((this.org_user_id==null && other.getOrg_user_id()==null) || 
             (this.org_user_id!=null &&
              this.org_user_id.equals(other.getOrg_user_id()))) &&
            ((this.outer_org_user_id==null && other.getOuter_org_user_id()==null) || 
             (this.outer_org_user_id!=null &&
              this.outer_org_user_id.equals(other.getOuter_org_user_id())));
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
        if (getOrg_acct_id() != null) {
            _hashCode += getOrg_acct_id().hashCode();
        }
        if (getOuter_org_acct_id() != null) {
            _hashCode += getOuter_org_acct_id().hashCode();
        }
        if (getOrg_phone_id() != null) {
            _hashCode += getOrg_phone_id().hashCode();
        }
        if (getOrg_user_id() != null) {
            _hashCode += getOrg_user_id().hashCode();
        }
        if (getOuter_org_user_id() != null) {
            _hashCode += getOuter_org_user_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoAdTransferAssetResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAdTransferAssetResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("org_acct_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "org_acct_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outer_org_acct_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outer_org_acct_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("org_phone_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "org_phone_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("org_user_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "org_user_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outer_org_user_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outer_org_user_id"));
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
