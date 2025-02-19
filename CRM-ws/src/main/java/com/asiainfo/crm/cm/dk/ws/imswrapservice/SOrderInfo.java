/**
 * SOrderInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class SOrderInfo  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imswrapservice.SOfferInfo[] offerList;

    private java.lang.Long acctId;

    private java.lang.Long resourceId;

    private java.lang.String phoneId;

    private java.lang.String orderId;

    private java.util.Calendar orderDate;

    private java.lang.String titleName;

    private java.lang.Long opId;

    private java.lang.String contractNum;

    private java.lang.String agreementId;

    private java.lang.String outerAcctId;

    private java.lang.String busiParam;

    private java.lang.String shoppingId;

    private java.util.Calendar shoppingDate;

    private java.lang.Integer isUseAllwnc;

    private java.lang.Long instalAcctId;

    private java.lang.Long allowanceCustId;

    public SOrderInfo() {
    }

    public SOrderInfo(
           com.asiainfo.crm.cm.dk.ws.imswrapservice.SOfferInfo[] offerList,
           java.lang.Long acctId,
           java.lang.Long resourceId,
           java.lang.String phoneId,
           java.lang.String orderId,
           java.util.Calendar orderDate,
           java.lang.String titleName,
           java.lang.Long opId,
           java.lang.String contractNum,
           java.lang.String agreementId,
           java.lang.String outerAcctId,
           java.lang.String busiParam,
           java.lang.String shoppingId,
           java.util.Calendar shoppingDate,
           java.lang.Integer isUseAllwnc,
           java.lang.Long instalAcctId,
           java.lang.Long allowanceCustId) {
           this.offerList = offerList;
           this.acctId = acctId;
           this.resourceId = resourceId;
           this.phoneId = phoneId;
           this.orderId = orderId;
           this.orderDate = orderDate;
           this.titleName = titleName;
           this.opId = opId;
           this.contractNum = contractNum;
           this.agreementId = agreementId;
           this.outerAcctId = outerAcctId;
           this.busiParam = busiParam;
           this.shoppingId = shoppingId;
           this.shoppingDate = shoppingDate;
           this.isUseAllwnc = isUseAllwnc;
           this.instalAcctId = instalAcctId;
           this.allowanceCustId = allowanceCustId;
    }


    /**
     * Gets the offerList value for this SOrderInfo.
     * 
     * @return offerList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapservice.SOfferInfo[] getOfferList() {
        return offerList;
    }


    /**
     * Sets the offerList value for this SOrderInfo.
     * 
     * @param offerList
     */
    public void setOfferList(com.asiainfo.crm.cm.dk.ws.imswrapservice.SOfferInfo[] offerList) {
        this.offerList = offerList;
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapservice.SOfferInfo getOfferList(int i) {
        return this.offerList[i];
    }

    public void setOfferList(int i, com.asiainfo.crm.cm.dk.ws.imswrapservice.SOfferInfo _value) {
        this.offerList[i] = _value;
    }


    /**
     * Gets the acctId value for this SOrderInfo.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SOrderInfo.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the resourceId value for this SOrderInfo.
     * 
     * @return resourceId
     */
    public java.lang.Long getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this SOrderInfo.
     * 
     * @param resourceId
     */
    public void setResourceId(java.lang.Long resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * Gets the phoneId value for this SOrderInfo.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this SOrderInfo.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the orderId value for this SOrderInfo.
     * 
     * @return orderId
     */
    public java.lang.String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this SOrderInfo.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the orderDate value for this SOrderInfo.
     * 
     * @return orderDate
     */
    public java.util.Calendar getOrderDate() {
        return orderDate;
    }


    /**
     * Sets the orderDate value for this SOrderInfo.
     * 
     * @param orderDate
     */
    public void setOrderDate(java.util.Calendar orderDate) {
        this.orderDate = orderDate;
    }


    /**
     * Gets the titleName value for this SOrderInfo.
     * 
     * @return titleName
     */
    public java.lang.String getTitleName() {
        return titleName;
    }


    /**
     * Sets the titleName value for this SOrderInfo.
     * 
     * @param titleName
     */
    public void setTitleName(java.lang.String titleName) {
        this.titleName = titleName;
    }


    /**
     * Gets the opId value for this SOrderInfo.
     * 
     * @return opId
     */
    public java.lang.Long getOpId() {
        return opId;
    }


    /**
     * Sets the opId value for this SOrderInfo.
     * 
     * @param opId
     */
    public void setOpId(java.lang.Long opId) {
        this.opId = opId;
    }


    /**
     * Gets the contractNum value for this SOrderInfo.
     * 
     * @return contractNum
     */
    public java.lang.String getContractNum() {
        return contractNum;
    }


    /**
     * Sets the contractNum value for this SOrderInfo.
     * 
     * @param contractNum
     */
    public void setContractNum(java.lang.String contractNum) {
        this.contractNum = contractNum;
    }


    /**
     * Gets the agreementId value for this SOrderInfo.
     * 
     * @return agreementId
     */
    public java.lang.String getAgreementId() {
        return agreementId;
    }


    /**
     * Sets the agreementId value for this SOrderInfo.
     * 
     * @param agreementId
     */
    public void setAgreementId(java.lang.String agreementId) {
        this.agreementId = agreementId;
    }


    /**
     * Gets the outerAcctId value for this SOrderInfo.
     * 
     * @return outerAcctId
     */
    public java.lang.String getOuterAcctId() {
        return outerAcctId;
    }


    /**
     * Sets the outerAcctId value for this SOrderInfo.
     * 
     * @param outerAcctId
     */
    public void setOuterAcctId(java.lang.String outerAcctId) {
        this.outerAcctId = outerAcctId;
    }


    /**
     * Gets the busiParam value for this SOrderInfo.
     * 
     * @return busiParam
     */
    public java.lang.String getBusiParam() {
        return busiParam;
    }


    /**
     * Sets the busiParam value for this SOrderInfo.
     * 
     * @param busiParam
     */
    public void setBusiParam(java.lang.String busiParam) {
        this.busiParam = busiParam;
    }


    /**
     * Gets the shoppingId value for this SOrderInfo.
     * 
     * @return shoppingId
     */
    public java.lang.String getShoppingId() {
        return shoppingId;
    }


    /**
     * Sets the shoppingId value for this SOrderInfo.
     * 
     * @param shoppingId
     */
    public void setShoppingId(java.lang.String shoppingId) {
        this.shoppingId = shoppingId;
    }


    /**
     * Gets the shoppingDate value for this SOrderInfo.
     * 
     * @return shoppingDate
     */
    public java.util.Calendar getShoppingDate() {
        return shoppingDate;
    }


    /**
     * Sets the shoppingDate value for this SOrderInfo.
     * 
     * @param shoppingDate
     */
    public void setShoppingDate(java.util.Calendar shoppingDate) {
        this.shoppingDate = shoppingDate;
    }


    /**
     * Gets the isUseAllwnc value for this SOrderInfo.
     * 
     * @return isUseAllwnc
     */
    public java.lang.Integer getIsUseAllwnc() {
        return isUseAllwnc;
    }


    /**
     * Sets the isUseAllwnc value for this SOrderInfo.
     * 
     * @param isUseAllwnc
     */
    public void setIsUseAllwnc(java.lang.Integer isUseAllwnc) {
        this.isUseAllwnc = isUseAllwnc;
    }


    /**
     * Gets the instalAcctId value for this SOrderInfo.
     * 
     * @return instalAcctId
     */
    public java.lang.Long getInstalAcctId() {
        return instalAcctId;
    }


    /**
     * Sets the instalAcctId value for this SOrderInfo.
     * 
     * @param instalAcctId
     */
    public void setInstalAcctId(java.lang.Long instalAcctId) {
        this.instalAcctId = instalAcctId;
    }


    /**
     * Gets the allowanceCustId value for this SOrderInfo.
     * 
     * @return allowanceCustId
     */
    public java.lang.Long getAllowanceCustId() {
        return allowanceCustId;
    }


    /**
     * Sets the allowanceCustId value for this SOrderInfo.
     * 
     * @param allowanceCustId
     */
    public void setAllowanceCustId(java.lang.Long allowanceCustId) {
        this.allowanceCustId = allowanceCustId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SOrderInfo)) return false;
        SOrderInfo other = (SOrderInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.offerList==null && other.getOfferList()==null) || 
             (this.offerList!=null &&
              java.util.Arrays.equals(this.offerList, other.getOfferList()))) &&
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
            ((this.titleName==null && other.getTitleName()==null) || 
             (this.titleName!=null &&
              this.titleName.equals(other.getTitleName()))) &&
            ((this.opId==null && other.getOpId()==null) || 
             (this.opId!=null &&
              this.opId.equals(other.getOpId()))) &&
            ((this.contractNum==null && other.getContractNum()==null) || 
             (this.contractNum!=null &&
              this.contractNum.equals(other.getContractNum()))) &&
            ((this.agreementId==null && other.getAgreementId()==null) || 
             (this.agreementId!=null &&
              this.agreementId.equals(other.getAgreementId()))) &&
            ((this.outerAcctId==null && other.getOuterAcctId()==null) || 
             (this.outerAcctId!=null &&
              this.outerAcctId.equals(other.getOuterAcctId()))) &&
            ((this.busiParam==null && other.getBusiParam()==null) || 
             (this.busiParam!=null &&
              this.busiParam.equals(other.getBusiParam()))) &&
            ((this.shoppingId==null && other.getShoppingId()==null) || 
             (this.shoppingId!=null &&
              this.shoppingId.equals(other.getShoppingId()))) &&
            ((this.shoppingDate==null && other.getShoppingDate()==null) || 
             (this.shoppingDate!=null &&
              this.shoppingDate.equals(other.getShoppingDate()))) &&
            ((this.isUseAllwnc==null && other.getIsUseAllwnc()==null) || 
             (this.isUseAllwnc!=null &&
              this.isUseAllwnc.equals(other.getIsUseAllwnc()))) &&
            ((this.instalAcctId==null && other.getInstalAcctId()==null) || 
             (this.instalAcctId!=null &&
              this.instalAcctId.equals(other.getInstalAcctId()))) &&
            ((this.allowanceCustId==null && other.getAllowanceCustId()==null) || 
             (this.allowanceCustId!=null &&
              this.allowanceCustId.equals(other.getAllowanceCustId())));
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
        if (getOfferList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOfferList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOfferList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getTitleName() != null) {
            _hashCode += getTitleName().hashCode();
        }
        if (getOpId() != null) {
            _hashCode += getOpId().hashCode();
        }
        if (getContractNum() != null) {
            _hashCode += getContractNum().hashCode();
        }
        if (getAgreementId() != null) {
            _hashCode += getAgreementId().hashCode();
        }
        if (getOuterAcctId() != null) {
            _hashCode += getOuterAcctId().hashCode();
        }
        if (getBusiParam() != null) {
            _hashCode += getBusiParam().hashCode();
        }
        if (getShoppingId() != null) {
            _hashCode += getShoppingId().hashCode();
        }
        if (getShoppingDate() != null) {
            _hashCode += getShoppingDate().hashCode();
        }
        if (getIsUseAllwnc() != null) {
            _hashCode += getIsUseAllwnc().hashCode();
        }
        if (getInstalAcctId() != null) {
            _hashCode += getInstalAcctId().hashCode();
        }
        if (getAllowanceCustId() != null) {
            _hashCode += getAllowanceCustId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SOrderInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sOrderInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offerList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sOfferInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titleName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "titleName"));
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
        elemField.setFieldName("contractNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contractNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agreementId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agreementId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outerAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("busiParam");
        elemField.setXmlName(new javax.xml.namespace.QName("", "busiParam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shoppingId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shoppingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shoppingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shoppingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isUseAllwnc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isUseAllwnc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instalAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instalAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowanceCustId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allowanceCustId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
