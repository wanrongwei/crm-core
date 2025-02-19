/**
 * ActualUsage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class ActualUsage  implements java.io.Serializable {
    private java.lang.String groupName;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SubActualUsage[] subActualUsageList;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    public ActualUsage() {
    }

    public ActualUsage(
           java.lang.String groupName,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SubActualUsage[] subActualUsageList,
           java.util.Calendar startDate,
           java.util.Calendar endDate) {
           this.groupName = groupName;
           this.subActualUsageList = subActualUsageList;
           this.startDate = startDate;
           this.endDate = endDate;
    }


    /**
     * Gets the groupName value for this ActualUsage.
     * 
     * @return groupName
     */
    public java.lang.String getGroupName() {
        return groupName;
    }


    /**
     * Sets the groupName value for this ActualUsage.
     * 
     * @param groupName
     */
    public void setGroupName(java.lang.String groupName) {
        this.groupName = groupName;
    }


    /**
     * Gets the subActualUsageList value for this ActualUsage.
     * 
     * @return subActualUsageList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SubActualUsage[] getSubActualUsageList() {
        return subActualUsageList;
    }


    /**
     * Sets the subActualUsageList value for this ActualUsage.
     * 
     * @param subActualUsageList
     */
    public void setSubActualUsageList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SubActualUsage[] subActualUsageList) {
        this.subActualUsageList = subActualUsageList;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SubActualUsage getSubActualUsageList(int i) {
        return this.subActualUsageList[i];
    }

    public void setSubActualUsageList(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SubActualUsage _value) {
        this.subActualUsageList[i] = _value;
    }


    /**
     * Gets the startDate value for this ActualUsage.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this ActualUsage.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this ActualUsage.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ActualUsage.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActualUsage)) return false;
        ActualUsage other = (ActualUsage) obj;
       
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.groupName==null && other.getGroupName()==null) || 
             (this.groupName!=null &&
              this.groupName.equals(other.getGroupName()))) &&
            ((this.subActualUsageList==null && other.getSubActualUsageList()==null) || 
             (this.subActualUsageList!=null &&
              java.util.Arrays.equals(this.subActualUsageList, other.getSubActualUsageList()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate())));
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
        if (getGroupName() != null) {
            _hashCode += getGroupName().hashCode();
        }
        if (getSubActualUsageList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubActualUsageList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubActualUsageList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ActualUsage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "actualUsage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subActualUsageList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subActualUsageList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "subActualUsage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
