/**
 * DoQueryGroupInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsqueryservice;

public class DoQueryGroupInfoResponse  extends com.asiainfo.crm.cm.dk.ws.imsqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private java.lang.Integer number_of_sub;

    private java.lang.Integer number_of_cug;

    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.SProductOrder[] productOrderList;

    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.SGroup[] groupInfoList;

    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.SubGroup[] subGroupList;

    public DoQueryGroupInfoResponse() {
    }

    public DoQueryGroupInfoResponse(
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.ResponseHead responseHead,
           java.lang.Integer number_of_sub,
           java.lang.Integer number_of_cug,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.SProductOrder[] productOrderList,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.SGroup[] groupInfoList,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.SubGroup[] subGroupList) {
        super(
            responseHead);
        this.number_of_sub = number_of_sub;
        this.number_of_cug = number_of_cug;
        this.productOrderList = productOrderList;
        this.groupInfoList = groupInfoList;
        this.subGroupList = subGroupList;
    }


    /**
     * Gets the number_of_sub value for this DoQueryGroupInfoResponse.
     * 
     * @return number_of_sub
     */
    public java.lang.Integer getNumber_of_sub() {
        return number_of_sub;
    }


    /**
     * Sets the number_of_sub value for this DoQueryGroupInfoResponse.
     * 
     * @param number_of_sub
     */
    public void setNumber_of_sub(java.lang.Integer number_of_sub) {
        this.number_of_sub = number_of_sub;
    }


    /**
     * Gets the number_of_cug value for this DoQueryGroupInfoResponse.
     * 
     * @return number_of_cug
     */
    public java.lang.Integer getNumber_of_cug() {
        return number_of_cug;
    }


    /**
     * Sets the number_of_cug value for this DoQueryGroupInfoResponse.
     * 
     * @param number_of_cug
     */
    public void setNumber_of_cug(java.lang.Integer number_of_cug) {
        this.number_of_cug = number_of_cug;
    }


    /**
     * Gets the productOrderList value for this DoQueryGroupInfoResponse.
     * 
     * @return productOrderList
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.SProductOrder[] getProductOrderList() {
        return productOrderList;
    }


    /**
     * Sets the productOrderList value for this DoQueryGroupInfoResponse.
     * 
     * @param productOrderList
     */
    public void setProductOrderList(com.asiainfo.crm.cm.dk.ws.imsqueryservice.SProductOrder[] productOrderList) {
        this.productOrderList = productOrderList;
    }


    /**
     * Gets the groupInfoList value for this DoQueryGroupInfoResponse.
     * 
     * @return groupInfoList
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.SGroup[] getGroupInfoList() {
        return groupInfoList;
    }


    /**
     * Sets the groupInfoList value for this DoQueryGroupInfoResponse.
     * 
     * @param groupInfoList
     */
    public void setGroupInfoList(com.asiainfo.crm.cm.dk.ws.imsqueryservice.SGroup[] groupInfoList) {
        this.groupInfoList = groupInfoList;
    }


    /**
     * Gets the subGroupList value for this DoQueryGroupInfoResponse.
     * 
     * @return subGroupList
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.SubGroup[] getSubGroupList() {
        return subGroupList;
    }


    /**
     * Sets the subGroupList value for this DoQueryGroupInfoResponse.
     * 
     * @param subGroupList
     */
    public void setSubGroupList(com.asiainfo.crm.cm.dk.ws.imsqueryservice.SubGroup[] subGroupList) {
        this.subGroupList = subGroupList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryGroupInfoResponse)) return false;
        DoQueryGroupInfoResponse other = (DoQueryGroupInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.number_of_sub==null && other.getNumber_of_sub()==null) || 
             (this.number_of_sub!=null &&
              this.number_of_sub.equals(other.getNumber_of_sub()))) &&
            ((this.number_of_cug==null && other.getNumber_of_cug()==null) || 
             (this.number_of_cug!=null &&
              this.number_of_cug.equals(other.getNumber_of_cug()))) &&
            ((this.productOrderList==null && other.getProductOrderList()==null) || 
             (this.productOrderList!=null &&
              java.util.Arrays.equals(this.productOrderList, other.getProductOrderList()))) &&
            ((this.groupInfoList==null && other.getGroupInfoList()==null) || 
             (this.groupInfoList!=null &&
              java.util.Arrays.equals(this.groupInfoList, other.getGroupInfoList()))) &&
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
        int _hashCode = super.hashCode();
        if (getNumber_of_sub() != null) {
            _hashCode += getNumber_of_sub().hashCode();
        }
        if (getNumber_of_cug() != null) {
            _hashCode += getNumber_of_cug().hashCode();
        }
        if (getProductOrderList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductOrderList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductOrderList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGroupInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroupInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroupInfoList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(DoQueryGroupInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryGroupInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number_of_sub");
        elemField.setXmlName(new javax.xml.namespace.QName("", "number_of_sub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number_of_cug");
        elemField.setXmlName(new javax.xml.namespace.QName("", "number_of_cug"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productOrderList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productOrderList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "group_items"));
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
