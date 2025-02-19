/**
 * CapMaxAccumulate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.imswrapservice;

public class CapMaxAccumulate  implements java.io.Serializable {
    private java.lang.Integer busi_service_id;

    private java.lang.Long amount;

    private java.lang.Long remain_value;

    private java.lang.String action;

    private java.lang.String status;

    private java.lang.String status_date;

    private com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.Threshold[] thresholdList;

    public CapMaxAccumulate() {
    }

    public CapMaxAccumulate(
           java.lang.Integer busi_service_id,
           java.lang.Long amount,
           java.lang.Long remain_value,
           java.lang.String action,
           java.lang.String status,
           java.lang.String status_date,
           com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.Threshold[] thresholdList) {
           this.busi_service_id = busi_service_id;
           this.amount = amount;
           this.remain_value = remain_value;
           this.action = action;
           this.status = status;
           this.status_date = status_date;
           this.thresholdList = thresholdList;
    }


    /**
     * Gets the busi_service_id value for this CapMaxAccumulate.
     * 
     * @return busi_service_id
     */
    public java.lang.Integer getBusi_service_id() {
        return busi_service_id;
    }


    /**
     * Sets the busi_service_id value for this CapMaxAccumulate.
     * 
     * @param busi_service_id
     */
    public void setBusi_service_id(java.lang.Integer busi_service_id) {
        this.busi_service_id = busi_service_id;
    }


    /**
     * Gets the amount value for this CapMaxAccumulate.
     * 
     * @return amount
     */
    public java.lang.Long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this CapMaxAccumulate.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }


    /**
     * Gets the remain_value value for this CapMaxAccumulate.
     * 
     * @return remain_value
     */
    public java.lang.Long getRemain_value() {
        return remain_value;
    }


    /**
     * Sets the remain_value value for this CapMaxAccumulate.
     * 
     * @param remain_value
     */
    public void setRemain_value(java.lang.Long remain_value) {
        this.remain_value = remain_value;
    }


    /**
     * Gets the action value for this CapMaxAccumulate.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this CapMaxAccumulate.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the status value for this CapMaxAccumulate.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CapMaxAccumulate.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the status_date value for this CapMaxAccumulate.
     * 
     * @return status_date
     */
    public java.lang.String getStatus_date() {
        return status_date;
    }


    /**
     * Sets the status_date value for this CapMaxAccumulate.
     * 
     * @param status_date
     */
    public void setStatus_date(java.lang.String status_date) {
        this.status_date = status_date;
    }


    /**
     * Gets the thresholdList value for this CapMaxAccumulate.
     * 
     * @return thresholdList
     */
    public com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.Threshold[] getThresholdList() {
        return thresholdList;
    }


    /**
     * Sets the thresholdList value for this CapMaxAccumulate.
     * 
     * @param thresholdList
     */
    public void setThresholdList(com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.Threshold[] thresholdList) {
        this.thresholdList = thresholdList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CapMaxAccumulate)) return false;
        CapMaxAccumulate other = (CapMaxAccumulate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.busi_service_id==null && other.getBusi_service_id()==null) || 
             (this.busi_service_id!=null &&
              this.busi_service_id.equals(other.getBusi_service_id()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.remain_value==null && other.getRemain_value()==null) || 
             (this.remain_value!=null &&
              this.remain_value.equals(other.getRemain_value()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.status_date==null && other.getStatus_date()==null) || 
             (this.status_date!=null &&
              this.status_date.equals(other.getStatus_date()))) &&
            ((this.thresholdList==null && other.getThresholdList()==null) || 
             (this.thresholdList!=null &&
              java.util.Arrays.equals(this.thresholdList, other.getThresholdList())));
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
        if (getBusi_service_id() != null) {
            _hashCode += getBusi_service_id().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getRemain_value() != null) {
            _hashCode += getRemain_value().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStatus_date() != null) {
            _hashCode += getStatus_date().hashCode();
        }
        if (getThresholdList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThresholdList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getThresholdList(), i);
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
        new org.apache.axis.description.TypeDesc(CapMaxAccumulate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "capMaxAccumulate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("busi_service_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "busi_service_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remain_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remain_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("", "action"));
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
        elemField.setFieldName("status_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thresholdList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "thresholdList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "threshold"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "thresholdListItem"));
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
