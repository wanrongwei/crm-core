/**
 * QueryPbsManualResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsqueryservice;

public class QueryPbsManualResponse  extends com.asiainfo.crm.cm.dk.ws.imsqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private java.lang.Integer totalCount;

    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.ProblemData[] problemDataList;

    public QueryPbsManualResponse() {
    }

    public QueryPbsManualResponse(
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.ResponseHead responseHead,
           java.lang.Integer totalCount,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.ProblemData[] problemDataList) {
        super(
            responseHead);
        this.totalCount = totalCount;
        this.problemDataList = problemDataList;
    }


    /**
     * Gets the totalCount value for this QueryPbsManualResponse.
     * 
     * @return totalCount
     */
    public java.lang.Integer getTotalCount() {
        return totalCount;
    }


    /**
     * Sets the totalCount value for this QueryPbsManualResponse.
     * 
     * @param totalCount
     */
    public void setTotalCount(java.lang.Integer totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * Gets the problemDataList value for this QueryPbsManualResponse.
     * 
     * @return problemDataList
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.ProblemData[] getProblemDataList() {
        return problemDataList;
    }


    /**
     * Sets the problemDataList value for this QueryPbsManualResponse.
     * 
     * @param problemDataList
     */
    public void setProblemDataList(com.asiainfo.crm.cm.dk.ws.imsqueryservice.ProblemData[] problemDataList) {
        this.problemDataList = problemDataList;
    }

    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.ProblemData getProblemDataList(int i) {
        return this.problemDataList[i];
    }

    public void setProblemDataList(int i, com.asiainfo.crm.cm.dk.ws.imsqueryservice.ProblemData _value) {
        this.problemDataList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryPbsManualResponse)) return false;
        QueryPbsManualResponse other = (QueryPbsManualResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.totalCount==null && other.getTotalCount()==null) || 
             (this.totalCount!=null &&
              this.totalCount.equals(other.getTotalCount()))) &&
            ((this.problemDataList==null && other.getProblemDataList()==null) || 
             (this.problemDataList!=null &&
              java.util.Arrays.equals(this.problemDataList, other.getProblemDataList())));
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
        if (getTotalCount() != null) {
            _hashCode += getTotalCount().hashCode();
        }
        if (getProblemDataList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProblemDataList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProblemDataList(), i);
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
        new org.apache.axis.description.TypeDesc(QueryPbsManualResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryPbsManualResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("problemDataList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "problemDataList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "problemData"));
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
