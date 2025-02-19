/**
 * CallDetailRecordList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class CallDetailRecordList  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CallDetailRecord[] detailList;

    private java.lang.Integer totalRec;

    public CallDetailRecordList() {
    }

    public CallDetailRecordList(
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CallDetailRecord[] detailList,
           java.lang.Integer totalRec) {
           this.detailList = detailList;
           this.totalRec = totalRec;
    }


    /**
     * Gets the detailList value for this CallDetailRecordList.
     * 
     * @return detailList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CallDetailRecord[] getDetailList() {
        return detailList;
    }


    /**
     * Sets the detailList value for this CallDetailRecordList.
     * 
     * @param detailList
     */
    public void setDetailList(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CallDetailRecord[] detailList) {
        this.detailList = detailList;
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CallDetailRecord getDetailList(int i) {
        return this.detailList[i];
    }

    public void setDetailList(int i, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CallDetailRecord _value) {
        this.detailList[i] = _value;
    }


    /**
     * Gets the totalRec value for this CallDetailRecordList.
     * 
     * @return totalRec
     */
    public java.lang.Integer getTotalRec() {
        return totalRec;
    }


    /**
     * Sets the totalRec value for this CallDetailRecordList.
     * 
     * @param totalRec
     */
    public void setTotalRec(java.lang.Integer totalRec) {
        this.totalRec = totalRec;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CallDetailRecordList)) return false;
        CallDetailRecordList other = (CallDetailRecordList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.detailList==null && other.getDetailList()==null) || 
             (this.detailList!=null &&
              java.util.Arrays.equals(this.detailList, other.getDetailList()))) &&
            ((this.totalRec==null && other.getTotalRec()==null) || 
             (this.totalRec!=null &&
              this.totalRec.equals(other.getTotalRec())));
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
        if (getDetailList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetailList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetailList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalRec() != null) {
            _hashCode += getTotalRec().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CallDetailRecordList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "callDetailRecordList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "detailList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "callDetailRecord"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRec");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalRec"));
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
