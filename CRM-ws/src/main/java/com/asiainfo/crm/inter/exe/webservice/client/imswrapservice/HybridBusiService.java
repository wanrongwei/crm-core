/**
 * HybridBusiService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.imswrapservice;

public class HybridBusiService  implements java.io.Serializable {
    private java.lang.String hybridrule;

    private java.lang.String status;

    private com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SBusiService[] sBusiServiceList;

    public HybridBusiService() {
    }

    public HybridBusiService(
           java.lang.String hybridrule,
           java.lang.String status,
           com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SBusiService[] sBusiServiceList) {
           this.hybridrule = hybridrule;
           this.status = status;
           this.sBusiServiceList = sBusiServiceList;
    }


    /**
     * Gets the hybridrule value for this HybridBusiService.
     * 
     * @return hybridrule
     */
    public java.lang.String getHybridrule() {
        return hybridrule;
    }


    /**
     * Sets the hybridrule value for this HybridBusiService.
     * 
     * @param hybridrule
     */
    public void setHybridrule(java.lang.String hybridrule) {
        this.hybridrule = hybridrule;
    }


    /**
     * Gets the status value for this HybridBusiService.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this HybridBusiService.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the sBusiServiceList value for this HybridBusiService.
     * 
     * @return sBusiServiceList
     */
    public com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SBusiService[] getSBusiServiceList() {
        return sBusiServiceList;
    }


    /**
     * Sets the sBusiServiceList value for this HybridBusiService.
     * 
     * @param sBusiServiceList
     */
    public void setSBusiServiceList(com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.SBusiService[] sBusiServiceList) {
        this.sBusiServiceList = sBusiServiceList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HybridBusiService)) return false;
        HybridBusiService other = (HybridBusiService) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hybridrule==null && other.getHybridrule()==null) || 
             (this.hybridrule!=null &&
              this.hybridrule.equals(other.getHybridrule()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.sBusiServiceList==null && other.getSBusiServiceList()==null) || 
             (this.sBusiServiceList!=null &&
              java.util.Arrays.equals(this.sBusiServiceList, other.getSBusiServiceList())));
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
        if (getHybridrule() != null) {
            _hashCode += getHybridrule().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSBusiServiceList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSBusiServiceList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSBusiServiceList(), i);
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
        new org.apache.axis.description.TypeDesc(HybridBusiService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "hybridBusiService"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hybridrule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hybridrule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SBusiServiceList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sBusiServiceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBusiService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "busiServiceList"));
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
