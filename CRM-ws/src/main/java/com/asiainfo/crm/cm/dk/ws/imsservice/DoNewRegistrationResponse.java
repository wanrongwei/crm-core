/**
 * DoNewRegistrationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class DoNewRegistrationResponse  extends com.asiainfo.crm.cm.dk.ws.imsservice.CrmBaseResponse  implements java.io.Serializable {
    private java.lang.String outerCustId;

    private java.lang.Long custId;

    private long[] acctIds;

    private com.asiainfo.crm.cm.dk.ws.imsservice.SUserResult[] userResultList;

    private com.asiainfo.crm.cm.dk.ws.imsservice.SProductOrderResult[] prodResultList;

    public DoNewRegistrationResponse() {
    }

    public DoNewRegistrationResponse(
           com.asiainfo.crm.cm.dk.ws.imsservice.ResponseHead responseHead,
           java.lang.String outerCustId,
           java.lang.Long custId,
           long[] acctIds,
           com.asiainfo.crm.cm.dk.ws.imsservice.SUserResult[] userResultList,
           com.asiainfo.crm.cm.dk.ws.imsservice.SProductOrderResult[] prodResultList) {
        super(
            responseHead);
        this.outerCustId = outerCustId;
        this.custId = custId;
        this.acctIds = acctIds;
        this.userResultList = userResultList;
        this.prodResultList = prodResultList;
    }


    /**
     * Gets the outerCustId value for this DoNewRegistrationResponse.
     * 
     * @return outerCustId
     */
    public java.lang.String getOuterCustId() {
        return outerCustId;
    }


    /**
     * Sets the outerCustId value for this DoNewRegistrationResponse.
     * 
     * @param outerCustId
     */
    public void setOuterCustId(java.lang.String outerCustId) {
        this.outerCustId = outerCustId;
    }


    /**
     * Gets the custId value for this DoNewRegistrationResponse.
     * 
     * @return custId
     */
    public java.lang.Long getCustId() {
        return custId;
    }


    /**
     * Sets the custId value for this DoNewRegistrationResponse.
     * 
     * @param custId
     */
    public void setCustId(java.lang.Long custId) {
        this.custId = custId;
    }


    /**
     * Gets the acctIds value for this DoNewRegistrationResponse.
     * 
     * @return acctIds
     */
    public long[] getAcctIds() {
        return acctIds;
    }


    /**
     * Sets the acctIds value for this DoNewRegistrationResponse.
     * 
     * @param acctIds
     */
    public void setAcctIds(long[] acctIds) {
        this.acctIds = acctIds;
    }


    /**
     * Gets the userResultList value for this DoNewRegistrationResponse.
     * 
     * @return userResultList
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.SUserResult[] getUserResultList() {
        return userResultList;
    }


    /**
     * Sets the userResultList value for this DoNewRegistrationResponse.
     * 
     * @param userResultList
     */
    public void setUserResultList(com.asiainfo.crm.cm.dk.ws.imsservice.SUserResult[] userResultList) {
        this.userResultList = userResultList;
    }


    /**
     * Gets the prodResultList value for this DoNewRegistrationResponse.
     * 
     * @return prodResultList
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.SProductOrderResult[] getProdResultList() {
        return prodResultList;
    }


    /**
     * Sets the prodResultList value for this DoNewRegistrationResponse.
     * 
     * @param prodResultList
     */
    public void setProdResultList(com.asiainfo.crm.cm.dk.ws.imsservice.SProductOrderResult[] prodResultList) {
        this.prodResultList = prodResultList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoNewRegistrationResponse)) return false;
        DoNewRegistrationResponse other = (DoNewRegistrationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.outerCustId==null && other.getOuterCustId()==null) || 
             (this.outerCustId!=null &&
              this.outerCustId.equals(other.getOuterCustId()))) &&
            ((this.custId==null && other.getCustId()==null) || 
             (this.custId!=null &&
              this.custId.equals(other.getCustId()))) &&
            ((this.acctIds==null && other.getAcctIds()==null) || 
             (this.acctIds!=null &&
              java.util.Arrays.equals(this.acctIds, other.getAcctIds()))) &&
            ((this.userResultList==null && other.getUserResultList()==null) || 
             (this.userResultList!=null &&
              java.util.Arrays.equals(this.userResultList, other.getUserResultList()))) &&
            ((this.prodResultList==null && other.getProdResultList()==null) || 
             (this.prodResultList!=null &&
              java.util.Arrays.equals(this.prodResultList, other.getProdResultList())));
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
        if (getOuterCustId() != null) {
            _hashCode += getOuterCustId().hashCode();
        }
        if (getCustId() != null) {
            _hashCode += getCustId().hashCode();
        }
        if (getAcctIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAcctIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAcctIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserResultList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserResultList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserResultList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProdResultList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProdResultList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProdResultList(), i);
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
        new org.apache.axis.description.TypeDesc(DoNewRegistrationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doNewRegistrationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outerCustId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerCustId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "custId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "longList_Item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userResultList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userResultList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUserResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "sUserResultList_Item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prodResultList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prodResultList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrderResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "sProductOrderResultListItem"));
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
