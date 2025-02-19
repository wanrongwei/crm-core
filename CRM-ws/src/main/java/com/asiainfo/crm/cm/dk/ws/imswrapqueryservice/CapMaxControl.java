/**
 * CapMaxControl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class CapMaxControl  implements java.io.Serializable {
    private java.lang.String capMaxService;

    private java.lang.Long amount;

    private java.lang.Long remainValue;

    private java.lang.String action;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.Threshold[] thresholdList;

    private java.lang.String itemName;

    private java.lang.Integer itemCode;

    public CapMaxControl() {
    }

    public CapMaxControl(
           java.lang.String capMaxService,
           java.lang.Long amount,
           java.lang.Long remainValue,
           java.lang.String action,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.Threshold[] thresholdList,
           java.lang.String itemName,
           java.lang.Integer itemCode) {
           this.capMaxService = capMaxService;
           this.amount = amount;
           this.remainValue = remainValue;
           this.action = action;
           this.thresholdList = thresholdList;
           this.itemName = itemName;
           this.itemCode = itemCode;
    }


    /**
     * Gets the capMaxService value for this CapMaxControl.
     * 
     * @return capMaxService
     */
    public java.lang.String getCapMaxService() {
        return capMaxService;
    }


    /**
     * Sets the capMaxService value for this CapMaxControl.
     * 
     * @param capMaxService
     */
    public void setCapMaxService(java.lang.String capMaxService) {
        this.capMaxService = capMaxService;
    }


    /**
     * Gets the amount value for this CapMaxControl.
     * 
     * @return amount
     */
    public java.lang.Long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this CapMaxControl.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }


    /**
     * Gets the remainValue value for this CapMaxControl.
     * 
     * @return remainValue
     */
    public java.lang.Long getRemainValue() {
        return remainValue;
    }


    /**
     * Sets the remainValue value for this CapMaxControl.
     * 
     * @param remainValue
     */
    public void setRemainValue(java.lang.Long remainValue) {
        this.remainValue = remainValue;
    }


    /**
     * Gets the action value for this CapMaxControl.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this CapMaxControl.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the thresholdList value for this CapMaxControl.
     * 
     * @return thresholdList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.Threshold[] getThresholdList() {
        return thresholdList;
    }


    /**
     * Sets the thresholdList value for this CapMaxControl.
     * 
     * @param thresholdList
     */
    public void setThresholdList(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.Threshold[] thresholdList) {
        this.thresholdList = thresholdList;
    }


    /**
     * Gets the itemName value for this CapMaxControl.
     * 
     * @return itemName
     */
    public java.lang.String getItemName() {
        return itemName;
    }


    /**
     * Sets the itemName value for this CapMaxControl.
     * 
     * @param itemName
     */
    public void setItemName(java.lang.String itemName) {
        this.itemName = itemName;
    }


    /**
     * Gets the itemCode value for this CapMaxControl.
     * 
     * @return itemCode
     */
    public java.lang.Integer getItemCode() {
        return itemCode;
    }


    /**
     * Sets the itemCode value for this CapMaxControl.
     * 
     * @param itemCode
     */
    public void setItemCode(java.lang.Integer itemCode) {
        this.itemCode = itemCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CapMaxControl)) return false;
        CapMaxControl other = (CapMaxControl) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.capMaxService==null && other.getCapMaxService()==null) || 
             (this.capMaxService!=null &&
              this.capMaxService.equals(other.getCapMaxService()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.remainValue==null && other.getRemainValue()==null) || 
             (this.remainValue!=null &&
              this.remainValue.equals(other.getRemainValue()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.thresholdList==null && other.getThresholdList()==null) || 
             (this.thresholdList!=null &&
              java.util.Arrays.equals(this.thresholdList, other.getThresholdList()))) &&
            ((this.itemName==null && other.getItemName()==null) || 
             (this.itemName!=null &&
              this.itemName.equals(other.getItemName()))) &&
            ((this.itemCode==null && other.getItemCode()==null) || 
             (this.itemCode!=null &&
              this.itemCode.equals(other.getItemCode())));
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
        if (getCapMaxService() != null) {
            _hashCode += getCapMaxService().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getRemainValue() != null) {
            _hashCode += getRemainValue().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
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
        if (getItemName() != null) {
            _hashCode += getItemName().hashCode();
        }
        if (getItemCode() != null) {
            _hashCode += getItemCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CapMaxControl.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "capMaxControl"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMaxService");
        elemField.setXmlName(new javax.xml.namespace.QName("", "capMaxService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("remainValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remainValue"));
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
        elemField.setFieldName("thresholdList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "thresholdList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "threshold"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "thresholdListItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemCode"));
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
