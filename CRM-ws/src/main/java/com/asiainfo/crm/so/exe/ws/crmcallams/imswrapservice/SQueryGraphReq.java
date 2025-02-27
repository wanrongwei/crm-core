/**
 * SQueryGraphReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SQueryGraphReq  implements java.io.Serializable {
    private java.lang.String phoneId;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.Integer topX;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SQueryGraphQueryTypeList[] queryTypeList;

    public SQueryGraphReq() {
    }

    public SQueryGraphReq(
           java.lang.String phoneId,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.Integer topX,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SQueryGraphQueryTypeList[] queryTypeList) {
           this.phoneId = phoneId;
           this.startDate = startDate;
           this.endDate = endDate;
           this.topX = topX;
           this.queryTypeList = queryTypeList;
    }


    /**
     * Gets the phoneId value for this SQueryGraphReq.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this SQueryGraphReq.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the startDate value for this SQueryGraphReq.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this SQueryGraphReq.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this SQueryGraphReq.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this SQueryGraphReq.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the topX value for this SQueryGraphReq.
     * 
     * @return topX
     */
    public java.lang.Integer getTopX() {
        return topX;
    }


    /**
     * Sets the topX value for this SQueryGraphReq.
     * 
     * @param topX
     */
    public void setTopX(java.lang.Integer topX) {
        this.topX = topX;
    }


    /**
     * Gets the queryTypeList value for this SQueryGraphReq.
     * 
     * @return queryTypeList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SQueryGraphQueryTypeList[] getQueryTypeList() {
        return queryTypeList;
    }


    /**
     * Sets the queryTypeList value for this SQueryGraphReq.
     * 
     * @param queryTypeList
     */
    public void setQueryTypeList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SQueryGraphQueryTypeList[] queryTypeList) {
        this.queryTypeList = queryTypeList;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SQueryGraphQueryTypeList getQueryTypeList(int i) {
        return this.queryTypeList[i];
    }

    public void setQueryTypeList(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SQueryGraphQueryTypeList _value) {
        this.queryTypeList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SQueryGraphReq)) return false;
        SQueryGraphReq other = (SQueryGraphReq) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.phoneId==null && other.getPhoneId()==null) || 
             (this.phoneId!=null &&
              this.phoneId.equals(other.getPhoneId()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.topX==null && other.getTopX()==null) || 
             (this.topX!=null &&
              this.topX.equals(other.getTopX()))) &&
            ((this.queryTypeList==null && other.getQueryTypeList()==null) || 
             (this.queryTypeList!=null &&
              java.util.Arrays.equals(this.queryTypeList, other.getQueryTypeList())));
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
        if (getPhoneId() != null) {
            _hashCode += getPhoneId().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getTopX() != null) {
            _hashCode += getTopX().hashCode();
        }
        if (getQueryTypeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQueryTypeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQueryTypeList(), i);
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
        new org.apache.axis.description.TypeDesc(SQueryGraphReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryGraphReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topX");
        elemField.setXmlName(new javax.xml.namespace.QName("", "topX"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryTypeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "queryTypeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryGraphQueryTypeList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
