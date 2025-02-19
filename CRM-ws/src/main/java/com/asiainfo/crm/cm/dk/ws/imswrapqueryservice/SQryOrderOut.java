/**
 * SQryOrderOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class SQryOrderOut  implements java.io.Serializable {
    private java.lang.Long soAcctId;

    private java.lang.Long resourceId;

    private java.lang.String phoneId;

    private java.lang.String orderId;

    private java.util.Calendar orderDate;

    private java.lang.String titleName;

    private java.lang.Long opId;

    private java.lang.String contractNum;

    private java.lang.String agreementId;

    private java.lang.Long paySoNbr;

    private java.util.Calendar payDate;

    private java.lang.Long payAcctId;

    private java.lang.Integer measureId;

    private java.lang.Integer channel;

    private java.lang.Long amount;

    private java.lang.Long soNbr;

    private java.lang.Integer paySts;

    private java.lang.String shoppingId;

    private java.util.Calendar shoppingDate;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SOfferInfo[] offerList;

    public SQryOrderOut() {
    }

    public SQryOrderOut(
           java.lang.Long soAcctId,
           java.lang.Long resourceId,
           java.lang.String phoneId,
           java.lang.String orderId,
           java.util.Calendar orderDate,
           java.lang.String titleName,
           java.lang.Long opId,
           java.lang.String contractNum,
           java.lang.String agreementId,
           java.lang.Long paySoNbr,
           java.util.Calendar payDate,
           java.lang.Long payAcctId,
           java.lang.Integer measureId,
           java.lang.Integer channel,
           java.lang.Long amount,
           java.lang.Long soNbr,
           java.lang.Integer paySts,
           java.lang.String shoppingId,
           java.util.Calendar shoppingDate,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SOfferInfo[] offerList) {
           this.soAcctId = soAcctId;
           this.resourceId = resourceId;
           this.phoneId = phoneId;
           this.orderId = orderId;
           this.orderDate = orderDate;
           this.titleName = titleName;
           this.opId = opId;
           this.contractNum = contractNum;
           this.agreementId = agreementId;
           this.paySoNbr = paySoNbr;
           this.payDate = payDate;
           this.payAcctId = payAcctId;
           this.measureId = measureId;
           this.channel = channel;
           this.amount = amount;
           this.soNbr = soNbr;
           this.paySts = paySts;
           this.shoppingId = shoppingId;
           this.shoppingDate = shoppingDate;
           this.offerList = offerList;
    }


    /**
     * Gets the soAcctId value for this SQryOrderOut.
     * 
     * @return soAcctId
     */
    public java.lang.Long getSoAcctId() {
        return soAcctId;
    }


    /**
     * Sets the soAcctId value for this SQryOrderOut.
     * 
     * @param soAcctId
     */
    public void setSoAcctId(java.lang.Long soAcctId) {
        this.soAcctId = soAcctId;
    }


    /**
     * Gets the resourceId value for this SQryOrderOut.
     * 
     * @return resourceId
     */
    public java.lang.Long getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this SQryOrderOut.
     * 
     * @param resourceId
     */
    public void setResourceId(java.lang.Long resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * Gets the phoneId value for this SQryOrderOut.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this SQryOrderOut.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the orderId value for this SQryOrderOut.
     * 
     * @return orderId
     */
    public java.lang.String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this SQryOrderOut.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the orderDate value for this SQryOrderOut.
     * 
     * @return orderDate
     */
    public java.util.Calendar getOrderDate() {
        return orderDate;
    }


    /**
     * Sets the orderDate value for this SQryOrderOut.
     * 
     * @param orderDate
     */
    public void setOrderDate(java.util.Calendar orderDate) {
        this.orderDate = orderDate;
    }


    /**
     * Gets the titleName value for this SQryOrderOut.
     * 
     * @return titleName
     */
    public java.lang.String getTitleName() {
        return titleName;
    }


    /**
     * Sets the titleName value for this SQryOrderOut.
     * 
     * @param titleName
     */
    public void setTitleName(java.lang.String titleName) {
        this.titleName = titleName;
    }


    /**
     * Gets the opId value for this SQryOrderOut.
     * 
     * @return opId
     */
    public java.lang.Long getOpId() {
        return opId;
    }


    /**
     * Sets the opId value for this SQryOrderOut.
     * 
     * @param opId
     */
    public void setOpId(java.lang.Long opId) {
        this.opId = opId;
    }


    /**
     * Gets the contractNum value for this SQryOrderOut.
     * 
     * @return contractNum
     */
    public java.lang.String getContractNum() {
        return contractNum;
    }


    /**
     * Sets the contractNum value for this SQryOrderOut.
     * 
     * @param contractNum
     */
    public void setContractNum(java.lang.String contractNum) {
        this.contractNum = contractNum;
    }


    /**
     * Gets the agreementId value for this SQryOrderOut.
     * 
     * @return agreementId
     */
    public java.lang.String getAgreementId() {
        return agreementId;
    }


    /**
     * Sets the agreementId value for this SQryOrderOut.
     * 
     * @param agreementId
     */
    public void setAgreementId(java.lang.String agreementId) {
        this.agreementId = agreementId;
    }


    /**
     * Gets the paySoNbr value for this SQryOrderOut.
     * 
     * @return paySoNbr
     */
    public java.lang.Long getPaySoNbr() {
        return paySoNbr;
    }


    /**
     * Sets the paySoNbr value for this SQryOrderOut.
     * 
     * @param paySoNbr
     */
    public void setPaySoNbr(java.lang.Long paySoNbr) {
        this.paySoNbr = paySoNbr;
    }


    /**
     * Gets the payDate value for this SQryOrderOut.
     * 
     * @return payDate
     */
    public java.util.Calendar getPayDate() {
        return payDate;
    }


    /**
     * Sets the payDate value for this SQryOrderOut.
     * 
     * @param payDate
     */
    public void setPayDate(java.util.Calendar payDate) {
        this.payDate = payDate;
    }


    /**
     * Gets the payAcctId value for this SQryOrderOut.
     * 
     * @return payAcctId
     */
    public java.lang.Long getPayAcctId() {
        return payAcctId;
    }


    /**
     * Sets the payAcctId value for this SQryOrderOut.
     * 
     * @param payAcctId
     */
    public void setPayAcctId(java.lang.Long payAcctId) {
        this.payAcctId = payAcctId;
    }


    /**
     * Gets the measureId value for this SQryOrderOut.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this SQryOrderOut.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the channel value for this SQryOrderOut.
     * 
     * @return channel
     */
    public java.lang.Integer getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this SQryOrderOut.
     * 
     * @param channel
     */
    public void setChannel(java.lang.Integer channel) {
        this.channel = channel;
    }


    /**
     * Gets the amount value for this SQryOrderOut.
     * 
     * @return amount
     */
    public java.lang.Long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this SQryOrderOut.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }


    /**
     * Gets the soNbr value for this SQryOrderOut.
     * 
     * @return soNbr
     */
    public java.lang.Long getSoNbr() {
        return soNbr;
    }


    /**
     * Sets the soNbr value for this SQryOrderOut.
     * 
     * @param soNbr
     */
    public void setSoNbr(java.lang.Long soNbr) {
        this.soNbr = soNbr;
    }


    /**
     * Gets the paySts value for this SQryOrderOut.
     * 
     * @return paySts
     */
    public java.lang.Integer getPaySts() {
        return paySts;
    }


    /**
     * Sets the paySts value for this SQryOrderOut.
     * 
     * @param paySts
     */
    public void setPaySts(java.lang.Integer paySts) {
        this.paySts = paySts;
    }


    /**
     * Gets the shoppingId value for this SQryOrderOut.
     * 
     * @return shoppingId
     */
    public java.lang.String getShoppingId() {
        return shoppingId;
    }


    /**
     * Sets the shoppingId value for this SQryOrderOut.
     * 
     * @param shoppingId
     */
    public void setShoppingId(java.lang.String shoppingId) {
        this.shoppingId = shoppingId;
    }


    /**
     * Gets the shoppingDate value for this SQryOrderOut.
     * 
     * @return shoppingDate
     */
    public java.util.Calendar getShoppingDate() {
        return shoppingDate;
    }


    /**
     * Sets the shoppingDate value for this SQryOrderOut.
     * 
     * @param shoppingDate
     */
    public void setShoppingDate(java.util.Calendar shoppingDate) {
        this.shoppingDate = shoppingDate;
    }


    /**
     * Gets the offerList value for this SQryOrderOut.
     * 
     * @return offerList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SOfferInfo[] getOfferList() {
        return offerList;
    }


    /**
     * Sets the offerList value for this SQryOrderOut.
     * 
     * @param offerList
     */
    public void setOfferList(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SOfferInfo[] offerList) {
        this.offerList = offerList;
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SOfferInfo getOfferList(int i) {
        return this.offerList[i];
    }

    public void setOfferList(int i, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SOfferInfo _value) {
        this.offerList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SQryOrderOut)) return false;
        SQryOrderOut other = (SQryOrderOut) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.soAcctId==null && other.getSoAcctId()==null) || 
             (this.soAcctId!=null &&
              this.soAcctId.equals(other.getSoAcctId()))) &&
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
            ((this.paySoNbr==null && other.getPaySoNbr()==null) || 
             (this.paySoNbr!=null &&
              this.paySoNbr.equals(other.getPaySoNbr()))) &&
            ((this.payDate==null && other.getPayDate()==null) || 
             (this.payDate!=null &&
              this.payDate.equals(other.getPayDate()))) &&
            ((this.payAcctId==null && other.getPayAcctId()==null) || 
             (this.payAcctId!=null &&
              this.payAcctId.equals(other.getPayAcctId()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.soNbr==null && other.getSoNbr()==null) || 
             (this.soNbr!=null &&
              this.soNbr.equals(other.getSoNbr()))) &&
            ((this.paySts==null && other.getPaySts()==null) || 
             (this.paySts!=null &&
              this.paySts.equals(other.getPaySts()))) &&
            ((this.shoppingId==null && other.getShoppingId()==null) || 
             (this.shoppingId!=null &&
              this.shoppingId.equals(other.getShoppingId()))) &&
            ((this.shoppingDate==null && other.getShoppingDate()==null) || 
             (this.shoppingDate!=null &&
              this.shoppingDate.equals(other.getShoppingDate()))) &&
            ((this.offerList==null && other.getOfferList()==null) || 
             (this.offerList!=null &&
              java.util.Arrays.equals(this.offerList, other.getOfferList())));
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
        if (getSoAcctId() != null) {
            _hashCode += getSoAcctId().hashCode();
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
        if (getPaySoNbr() != null) {
            _hashCode += getPaySoNbr().hashCode();
        }
        if (getPayDate() != null) {
            _hashCode += getPayDate().hashCode();
        }
        if (getPayAcctId() != null) {
            _hashCode += getPayAcctId().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getSoNbr() != null) {
            _hashCode += getSoNbr().hashCode();
        }
        if (getPaySts() != null) {
            _hashCode += getPaySts().hashCode();
        }
        if (getShoppingId() != null) {
            _hashCode += getShoppingId().hashCode();
        }
        if (getShoppingDate() != null) {
            _hashCode += getShoppingDate().hashCode();
        }
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SQryOrderOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQryOrderOut"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "soAcctId"));
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
        elemField.setFieldName("paySoNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paySoNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measureId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measureId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "channel"));
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
        elemField.setFieldName("soNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "soNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paySts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paySts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("offerList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offerList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sOfferInfo"));
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
