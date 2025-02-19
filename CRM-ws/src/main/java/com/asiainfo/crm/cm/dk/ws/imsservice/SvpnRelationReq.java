/**
 * SvpnRelationReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class SvpnRelationReq  implements java.io.Serializable {
    private java.lang.String outer_orgin_group_id;

    private java.lang.Long orgin_group_id;

    private com.asiainfo.crm.cm.dk.ws.imsservice.SubGroup[] subGroupList;

    public SvpnRelationReq() {
    }

    public SvpnRelationReq(
           java.lang.String outer_orgin_group_id,
           java.lang.Long orgin_group_id,
           com.asiainfo.crm.cm.dk.ws.imsservice.SubGroup[] subGroupList) {
           this.outer_orgin_group_id = outer_orgin_group_id;
           this.orgin_group_id = orgin_group_id;
           this.subGroupList = subGroupList;
    }


    /**
     * Gets the outer_orgin_group_id value for this SvpnRelationReq.
     * 
     * @return outer_orgin_group_id
     */
    public java.lang.String getOuter_orgin_group_id() {
        return outer_orgin_group_id;
    }


    /**
     * Sets the outer_orgin_group_id value for this SvpnRelationReq.
     * 
     * @param outer_orgin_group_id
     */
    public void setOuter_orgin_group_id(java.lang.String outer_orgin_group_id) {
        this.outer_orgin_group_id = outer_orgin_group_id;
    }


    /**
     * Gets the orgin_group_id value for this SvpnRelationReq.
     * 
     * @return orgin_group_id
     */
    public java.lang.Long getOrgin_group_id() {
        return orgin_group_id;
    }


    /**
     * Sets the orgin_group_id value for this SvpnRelationReq.
     * 
     * @param orgin_group_id
     */
    public void setOrgin_group_id(java.lang.Long orgin_group_id) {
        this.orgin_group_id = orgin_group_id;
    }


    /**
     * Gets the subGroupList value for this SvpnRelationReq.
     * 
     * @return subGroupList
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.SubGroup[] getSubGroupList() {
        return subGroupList;
    }


    /**
     * Sets the subGroupList value for this SvpnRelationReq.
     * 
     * @param subGroupList
     */
    public void setSubGroupList(com.asiainfo.crm.cm.dk.ws.imsservice.SubGroup[] subGroupList) {
        this.subGroupList = subGroupList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SvpnRelationReq)) return false;
        SvpnRelationReq other = (SvpnRelationReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.outer_orgin_group_id==null && other.getOuter_orgin_group_id()==null) || 
             (this.outer_orgin_group_id!=null &&
              this.outer_orgin_group_id.equals(other.getOuter_orgin_group_id()))) &&
            ((this.orgin_group_id==null && other.getOrgin_group_id()==null) || 
             (this.orgin_group_id!=null &&
              this.orgin_group_id.equals(other.getOrgin_group_id()))) &&
            ((this.subGroupList==null && other.getSubGroupList()==null) || 
             (this.subGroupList!=null &&
              java.util.Arrays.equals(this.subGroupList, other.getSubGroupList())));
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
        if (getOuter_orgin_group_id() != null) {
            _hashCode += getOuter_orgin_group_id().hashCode();
        }
        if (getOrgin_group_id() != null) {
            _hashCode += getOrgin_group_id().hashCode();
        }
        if (getSubGroupList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubGroupList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubGroupList(), i);
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
        new org.apache.axis.description.TypeDesc(SvpnRelationReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "svpnRelationReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outer_orgin_group_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outer_orgin_group_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgin_group_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgin_group_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGroupList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subGroupList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "subGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "subGroup_Item"));
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
