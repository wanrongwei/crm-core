/**
 * SReceiptInfoReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SReceiptInfoReq  implements java.io.Serializable {
    private java.lang.String outerAcctId;

    private java.lang.Long acctId;

    private java.lang.Long resourceId;

    private java.lang.String phoneId;

    private java.lang.String orderId;

    private java.lang.String orderDate;

    private java.lang.String crmBusiMode;

    private java.lang.String acctName;

    private java.lang.Long opId;

    private java.lang.String opName;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SFeeItem[] feeItemList;

    public SReceiptInfoReq() {
    }

    public SReceiptInfoReq(
           java.lang.String outerAcctId,
           java.lang.Long acctId,
           java.lang.Long resourceId,
           java.lang.String phoneId,
           java.lang.String orderId,
           java.lang.String orderDate,
           java.lang.String crmBusiMode,
           java.lang.String acctName,
           java.lang.Long opId,
           java.lang.String opName,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SFeeItem[] feeItemList) {
           this.outerAcctId = outerAcctId;
           this.acctId = acctId;
           this.resourceId = resourceId;
           this.phoneId = phoneId;
           this.orderId = orderId;
           this.orderDate = orderDate;
           this.crmBusiMode = crmBusiMode;
           this.acctName = acctName;
           this.opId = opId;
           this.opName = opName;
           this.feeItemList = feeItemList;
    }


    /**
     * Gets the outerAcctId value for this SReceiptInfoReq.
     * 
     * @return outerAcctId
     */
    public java.lang.String getOuterAcctId() {
        return outerAcctId;
    }


    /**
     * Sets the outerAcctId value for this SReceiptInfoReq.
     * 
     * @param outerAcctId
     */
    public void setOuterAcctId(java.lang.String outerAcctId) {
        this.outerAcctId = outerAcctId;
    }


    /**
     * Gets the acctId value for this SReceiptInfoReq.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SReceiptInfoReq.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the resourceId value for this SReceiptInfoReq.
     * 
     * @return resourceId
     */
    public java.lang.Long getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this SReceiptInfoReq.
     * 
     * @param resourceId
     */
    public void setResourceId(java.lang.Long resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * Gets the phoneId value for this SReceiptInfoReq.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this SReceiptInfoReq.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the orderId value for this SReceiptInfoReq.
     * 
     * @return orderId
     */
    public java.lang.String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this SReceiptInfoReq.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the orderDate value for this SReceiptInfoReq.
     * 
     * @return orderDate
     */
    public java.lang.String getOrderDate() {
        return orderDate;
    }


    /**
     * Sets the orderDate value for this SReceiptInfoReq.
     * 
     * @param orderDate
     */
    public void setOrderDate(java.lang.String orderDate) {
        this.orderDate = orderDate;
    }


    /**
     * Gets the crmBusiMode value for this SReceiptInfoReq.
     * 
     * @return crmBusiMode
     */
    public java.lang.String getCrmBusiMode() {
        return crmBusiMode;
    }


    /**
     * Sets the crmBusiMode value for this SReceiptInfoReq.
     * 
     * @param crmBusiMode
     */
    public void setCrmBusiMode(java.lang.String crmBusiMode) {
        this.crmBusiMode = crmBusiMode;
    }


    /**
     * Gets the acctName value for this SReceiptInfoReq.
     * 
     * @return acctName
     */
    public java.lang.String getAcctName() {
        return acctName;
    }


    /**
     * Sets the acctName value for this SReceiptInfoReq.
     * 
     * @param acctName
     */
    public void setAcctName(java.lang.String acctName) {
        this.acctName = acctName;
    }


    /**
     * Gets the opId value for this SReceiptInfoReq.
     * 
     * @return opId
     */
    public java.lang.Long getOpId() {
        return opId;
    }


    /**
     * Sets the opId value for this SReceiptInfoReq.
     * 
     * @param opId
     */
    public void setOpId(java.lang.Long opId) {
        this.opId = opId;
    }


    /**
     * Gets the opName value for this SReceiptInfoReq.
     * 
     * @return opName
     */
    public java.lang.String getOpName() {
        return opName;
    }


    /**
     * Sets the opName value for this SReceiptInfoReq.
     * 
     * @param opName
     */
    public void setOpName(java.lang.String opName) {
        this.opName = opName;
    }


    /**
     * Gets the feeItemList value for this SReceiptInfoReq.
     * 
     * @return feeItemList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SFeeItem[] getFeeItemList() {
        return feeItemList;
    }


    /**
     * Sets the feeItemList value for this SReceiptInfoReq.
     * 
     * @param feeItemList
     */
    public void setFeeItemList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SFeeItem[] feeItemList) {
        this.feeItemList = feeItemList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SReceiptInfoReq)) return false;
        SReceiptInfoReq other = (SReceiptInfoReq) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.outerAcctId==null && other.getOuterAcctId()==null) || 
             (this.outerAcctId!=null &&
              this.outerAcctId.equals(other.getOuterAcctId()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.resourceId==null && other.getResourceId()==null) || 
             (this.resourceId!=null &&
              this.resourceId.equals(other.getResourceId()))) &&
            ((this.phoneId==null && other.getPhoneId()==null) || 
             (this.phoneId!=null &&
              this.phoneId.equals(other.getPhoneId()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.orderDate==null && other.getOrderDate()==null) || 
             (this.orderDate!=null &&
              this.orderDate.equals(other.getOrderDate()))) &&
            ((this.crmBusiMode==null && other.getCrmBusiMode()==null) || 
             (this.crmBusiMode!=null &&
              this.crmBusiMode.equals(other.getCrmBusiMode()))) &&
            ((this.acctName==null && other.getAcctName()==null) || 
             (this.acctName!=null &&
              this.acctName.equals(other.getAcctName()))) &&
            ((this.opId==null && other.getOpId()==null) || 
             (this.opId!=null &&
              this.opId.equals(other.getOpId()))) &&
            ((this.opName==null && other.getOpName()==null) || 
             (this.opName!=null &&
              this.opName.equals(other.getOpName()))) &&
            ((this.feeItemList==null && other.getFeeItemList()==null) || 
             (this.feeItemList!=null &&
              java.util.Arrays.equals(this.feeItemList, other.getFeeItemList())));
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
        if (getOuterAcctId() != null) {
            _hashCode += getOuterAcctId().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getResourceId() != null) {
            _hashCode += getResourceId().hashCode();
        }
        if (getPhoneId() != null) {
            _hashCode += getPhoneId().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getOrderDate() != null) {
            _hashCode += getOrderDate().hashCode();
        }
        if (getCrmBusiMode() != null) {
            _hashCode += getCrmBusiMode().hashCode();
        }
        if (getAcctName() != null) {
            _hashCode += getAcctName().hashCode();
        }
        if (getOpId() != null) {
            _hashCode += getOpId().hashCode();
        }
        if (getOpName() != null) {
            _hashCode += getOpName().hashCode();
        }
        if (getFeeItemList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeeItemList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeeItemList(), i);
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
        new org.apache.axis.description.TypeDesc(SReceiptInfoReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sReceiptInfoReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outerAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crmBusiMode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crmBusiMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "opId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "opName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeItemList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feeItemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sFeeItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "feeItemList"));
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
