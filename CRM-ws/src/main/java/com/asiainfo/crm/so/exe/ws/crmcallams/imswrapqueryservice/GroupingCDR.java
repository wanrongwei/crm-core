/**
 * GroupingCDR.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class GroupingCDR  implements java.io.Serializable {
    private java.lang.String grouping_name;

    private java.lang.Long summary_usage;

    private java.lang.Long summary_preDiscount;

    private java.lang.Long summary_totalCharge;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CallDetailRecord[] callDetailRecordList;

    public GroupingCDR() {
    }

    public GroupingCDR(
           java.lang.String grouping_name,
           java.lang.Long summary_usage,
           java.lang.Long summary_preDiscount,
           java.lang.Long summary_totalCharge,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CallDetailRecord[] callDetailRecordList) {
           this.grouping_name = grouping_name;
           this.summary_usage = summary_usage;
           this.summary_preDiscount = summary_preDiscount;
           this.summary_totalCharge = summary_totalCharge;
           this.callDetailRecordList = callDetailRecordList;
    }


    /**
     * Gets the grouping_name value for this GroupingCDR.
     * 
     * @return grouping_name
     */
    public java.lang.String getGrouping_name() {
        return grouping_name;
    }


    /**
     * Sets the grouping_name value for this GroupingCDR.
     * 
     * @param grouping_name
     */
    public void setGrouping_name(java.lang.String grouping_name) {
        this.grouping_name = grouping_name;
    }


    /**
     * Gets the summary_usage value for this GroupingCDR.
     * 
     * @return summary_usage
     */
    public java.lang.Long getSummary_usage() {
        return summary_usage;
    }


    /**
     * Sets the summary_usage value for this GroupingCDR.
     * 
     * @param summary_usage
     */
    public void setSummary_usage(java.lang.Long summary_usage) {
        this.summary_usage = summary_usage;
    }


    /**
     * Gets the summary_preDiscount value for this GroupingCDR.
     * 
     * @return summary_preDiscount
     */
    public java.lang.Long getSummary_preDiscount() {
        return summary_preDiscount;
    }


    /**
     * Sets the summary_preDiscount value for this GroupingCDR.
     * 
     * @param summary_preDiscount
     */
    public void setSummary_preDiscount(java.lang.Long summary_preDiscount) {
        this.summary_preDiscount = summary_preDiscount;
    }


    /**
     * Gets the summary_totalCharge value for this GroupingCDR.
     * 
     * @return summary_totalCharge
     */
    public java.lang.Long getSummary_totalCharge() {
        return summary_totalCharge;
    }


    /**
     * Sets the summary_totalCharge value for this GroupingCDR.
     * 
     * @param summary_totalCharge
     */
    public void setSummary_totalCharge(java.lang.Long summary_totalCharge) {
        this.summary_totalCharge = summary_totalCharge;
    }


    /**
     * Gets the callDetailRecordList value for this GroupingCDR.
     * 
     * @return callDetailRecordList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CallDetailRecord[] getCallDetailRecordList() {
        return callDetailRecordList;
    }


    /**
     * Sets the callDetailRecordList value for this GroupingCDR.
     * 
     * @param callDetailRecordList
     */
    public void setCallDetailRecordList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CallDetailRecord[] callDetailRecordList) {
        this.callDetailRecordList = callDetailRecordList;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CallDetailRecord getCallDetailRecordList(int i) {
        return this.callDetailRecordList[i];
    }

    public void setCallDetailRecordList(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CallDetailRecord _value) {
        this.callDetailRecordList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GroupingCDR)) return false;
        GroupingCDR other = (GroupingCDR) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.grouping_name==null && other.getGrouping_name()==null) || 
             (this.grouping_name!=null &&
              this.grouping_name.equals(other.getGrouping_name()))) &&
            ((this.summary_usage==null && other.getSummary_usage()==null) || 
             (this.summary_usage!=null &&
              this.summary_usage.equals(other.getSummary_usage()))) &&
            ((this.summary_preDiscount==null && other.getSummary_preDiscount()==null) || 
             (this.summary_preDiscount!=null &&
              this.summary_preDiscount.equals(other.getSummary_preDiscount()))) &&
            ((this.summary_totalCharge==null && other.getSummary_totalCharge()==null) || 
             (this.summary_totalCharge!=null &&
              this.summary_totalCharge.equals(other.getSummary_totalCharge()))) &&
            ((this.callDetailRecordList==null && other.getCallDetailRecordList()==null) || 
             (this.callDetailRecordList!=null &&
              java.util.Arrays.equals(this.callDetailRecordList, other.getCallDetailRecordList())));
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
        if (getGrouping_name() != null) {
            _hashCode += getGrouping_name().hashCode();
        }
        if (getSummary_usage() != null) {
            _hashCode += getSummary_usage().hashCode();
        }
        if (getSummary_preDiscount() != null) {
            _hashCode += getSummary_preDiscount().hashCode();
        }
        if (getSummary_totalCharge() != null) {
            _hashCode += getSummary_totalCharge().hashCode();
        }
        if (getCallDetailRecordList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCallDetailRecordList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCallDetailRecordList(), i);
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
        new org.apache.axis.description.TypeDesc(GroupingCDR.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "groupingCDR"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grouping_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "grouping_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summary_usage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "summary_usage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summary_preDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "summary_preDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summary_totalCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "summary_totalCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callDetailRecordList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callDetailRecordList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "callDetailRecord"));
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
