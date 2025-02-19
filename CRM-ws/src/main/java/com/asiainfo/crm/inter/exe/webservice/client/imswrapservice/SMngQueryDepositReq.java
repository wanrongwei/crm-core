/**
 * SMngQueryDepositReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.imswrapservice;

public class SMngQueryDepositReq  implements java.io.Serializable {
    private java.lang.String outer_acct_id;

    private java.lang.Long acct_id;

    private java.lang.Long resource_id;

    private java.lang.Integer pocket_item;

    private java.lang.Integer owner_type;

    public SMngQueryDepositReq() {
    }

    public SMngQueryDepositReq(
           java.lang.String outer_acct_id,
           java.lang.Long acct_id,
           java.lang.Long resource_id,
           java.lang.Integer pocket_item,
           java.lang.Integer owner_type) {
           this.outer_acct_id = outer_acct_id;
           this.acct_id = acct_id;
           this.resource_id = resource_id;
           this.pocket_item = pocket_item;
           this.owner_type = owner_type;
    }


    /**
     * Gets the outer_acct_id value for this SMngQueryDepositReq.
     * 
     * @return outer_acct_id
     */
    public java.lang.String getOuter_acct_id() {
        return outer_acct_id;
    }


    /**
     * Sets the outer_acct_id value for this SMngQueryDepositReq.
     * 
     * @param outer_acct_id
     */
    public void setOuter_acct_id(java.lang.String outer_acct_id) {
        this.outer_acct_id = outer_acct_id;
    }


    /**
     * Gets the acct_id value for this SMngQueryDepositReq.
     * 
     * @return acct_id
     */
    public java.lang.Long getAcct_id() {
        return acct_id;
    }


    /**
     * Sets the acct_id value for this SMngQueryDepositReq.
     * 
     * @param acct_id
     */
    public void setAcct_id(java.lang.Long acct_id) {
        this.acct_id = acct_id;
    }


    /**
     * Gets the resource_id value for this SMngQueryDepositReq.
     * 
     * @return resource_id
     */
    public java.lang.Long getResource_id() {
        return resource_id;
    }


    /**
     * Sets the resource_id value for this SMngQueryDepositReq.
     * 
     * @param resource_id
     */
    public void setResource_id(java.lang.Long resource_id) {
        this.resource_id = resource_id;
    }


    /**
     * Gets the pocket_item value for this SMngQueryDepositReq.
     * 
     * @return pocket_item
     */
    public java.lang.Integer getPocket_item() {
        return pocket_item;
    }


    /**
     * Sets the pocket_item value for this SMngQueryDepositReq.
     * 
     * @param pocket_item
     */
    public void setPocket_item(java.lang.Integer pocket_item) {
        this.pocket_item = pocket_item;
    }


    /**
     * Gets the owner_type value for this SMngQueryDepositReq.
     * 
     * @return owner_type
     */
    public java.lang.Integer getOwner_type() {
        return owner_type;
    }


    /**
     * Sets the owner_type value for this SMngQueryDepositReq.
     * 
     * @param owner_type
     */
    public void setOwner_type(java.lang.Integer owner_type) {
        this.owner_type = owner_type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SMngQueryDepositReq)) return false;
        SMngQueryDepositReq other = (SMngQueryDepositReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.outer_acct_id==null && other.getOuter_acct_id()==null) || 
             (this.outer_acct_id!=null &&
              this.outer_acct_id.equals(other.getOuter_acct_id()))) &&
            ((this.acct_id==null && other.getAcct_id()==null) || 
             (this.acct_id!=null &&
              this.acct_id.equals(other.getAcct_id()))) &&
            ((this.resource_id==null && other.getResource_id()==null) || 
             (this.resource_id!=null &&
              this.resource_id.equals(other.getResource_id()))) &&
            ((this.pocket_item==null && other.getPocket_item()==null) || 
             (this.pocket_item!=null &&
              this.pocket_item.equals(other.getPocket_item()))) &&
            ((this.owner_type==null && other.getOwner_type()==null) || 
             (this.owner_type!=null &&
              this.owner_type.equals(other.getOwner_type())));
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
        if (getOuter_acct_id() != null) {
            _hashCode += getOuter_acct_id().hashCode();
        }
        if (getAcct_id() != null) {
            _hashCode += getAcct_id().hashCode();
        }
        if (getResource_id() != null) {
            _hashCode += getResource_id().hashCode();
        }
        if (getPocket_item() != null) {
            _hashCode += getPocket_item().hashCode();
        }
        if (getOwner_type() != null) {
            _hashCode += getOwner_type().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SMngQueryDepositReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sMngQueryDepositReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outer_acct_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outer_acct_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acct_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acct_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resource_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resource_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pocket_item");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pocket_item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "owner_type"));
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
