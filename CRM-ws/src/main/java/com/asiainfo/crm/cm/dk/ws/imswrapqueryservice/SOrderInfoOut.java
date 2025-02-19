/**
 * SOrderInfoOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class SOrderInfoOut  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SOfferInfo[] offerList;

    private java.lang.Long acctId;

    private java.lang.Long userId;

    private java.lang.String phoneId;

    private java.lang.String orderId;

    private java.util.Calendar orderDate;

    private java.lang.String titleName;

    private java.lang.Long opId;

    private java.lang.String contractNum;

    private java.lang.String agreementId;

    private java.lang.Integer paySts;

    private java.lang.Long soNbr;

    private java.lang.Long amount;

    private java.lang.Integer channel;

    private java.lang.Integer measureId;

    private java.lang.Long payAcctId;

    private java.util.Calendar payDate;

    private java.lang.Long paySoNbr;

    public SOrderInfoOut() {
    }

    public SOrderInfoOut(
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SOfferInfo[] offerList,
           java.lang.Long acctId,
           java.lang.Long userId,
           java.lang.String phoneId,
           java.lang.String orderId,
           java.util.Calendar orderDate,
           java.lang.String titleName,
           java.lang.Long opId,
           java.lang.String contractNum,
           java.lang.String agreementId,
           java.lang.Integer paySts,
           java.lang.Long soNbr,
           java.lang.Long amount,
           java.lang.Integer channel,
           java.lang.Integer measureId,
           java.lang.Long payAcctId,
           java.util.Calendar payDate,
           java.lang.Long paySoNbr) {
           this.offerList = offerList;
           this.acctId = acctId;
           this.userId = userId;
           this.phoneId = phoneId;
           this.orderId = orderId;
           this.orderDate = orderDate;
           this.titleName = titleName;
           this.opId = opId;
           this.contractNum = contractNum;
           this.agreementId = agreementId;
           this.paySts = paySts;
           this.soNbr = soNbr;
           this.amount = amount;
           this.channel = channel;
           this.measureId = measureId;
           this.payAcctId = payAcctId;
           this.payDate = payDate;
           this.paySoNbr = paySoNbr;
    }


    /**
     * Gets the offerList value for this SOrderInfoOut.
     * 
     * @return offerList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SOfferInfo[] getOfferList() {
        return offerList;
    }


    /**
     * Sets the offerList value for this SOrderInfoOut.
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


    /**
     * Gets the acctId value for this SOrderInfoOut.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SOrderInfoOut.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the userId value for this SOrderInfoOut.
     * 
     * @return userId
     */
    public java.lang.Long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this SOrderInfoOut.
     * 
     * @param userId
     */
    public void setUserId(java.lang.Long userId) {
        this.userId = userId;
    }


    /**
     * Gets the phoneId value for this SOrderInfoOut.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this SOrderInfoOut.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the orderId value for this SOrderInfoOut.
     * 
     * @return orderId
     */
    public java.lang.String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this SOrderInfoOut.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the orderDate value for this SOrderInfoOut.
     * 
     * @return orderDate
     */
    public java.util.Calendar getOrderDate() {
        return orderDate;
    }


    /**
     * Sets the orderDate value for this SOrderInfoOut.
     * 
     * @param orderDate
     */
    public void setOrderDate(java.util.Calendar orderDate) {
        this.orderDate = orderDate;
    }


    /**
     * Gets the titleName value for this SOrderInfoOut.
     * 
     * @return titleName
     */
    public java.lang.String getTitleName() {
        return titleName;
    }


    /**
     * Sets the titleName value for this SOrderInfoOut.
     * 
     * @param titleName
     */
    public void setTitleName(java.lang.String titleName) {
        this.titleName = titleName;
    }


    /**
     * Gets the opId value for this SOrderInfoOut.
     * 
     * @return opId
     */
    public java.lang.Long getOpId() {
        return opId;
    }


    /**
     * Sets the opId value for this SOrderInfoOut.
     * 
     * @param opId
     */
    public void setOpId(java.lang.Long opId) {
        this.opId = opId;
    }


    /**
     * Gets the contractNum value for this SOrderInfoOut.
     * 
     * @return contractNum
     */
    public java.lang.String getContractNum() {
        return contractNum;
    }


    /**
     * Sets the contractNum value for this SOrderInfoOut.
     * 
     * @param contractNum
     */
    public void setContractNum(java.lang.String contractNum) {
        this.contractNum = contractNum;
    }


    /**
     * Gets the agreementId value for this SOrderInfoOut.
     * 
     * @return agreementId
     */
    public java.lang.String getAgreementId() {
        return agreementId;
    }


    /**
     * Sets the agreementId value for this SOrderInfoOut.
     * 
     * @param agreementId
     */
    public void setAgreementId(java.lang.String agreementId) {
        this.agreementId = agreementId;
    }


    /**
     * Gets the paySts value for this SOrderInfoOut.
     * 
     * @return paySts
     */
    public java.lang.Integer getPaySts() {
        return paySts;
    }


    /**
     * Sets the paySts value for this SOrderInfoOut.
     * 
     * @param paySts
     */
    public void setPaySts(java.lang.Integer paySts) {
        this.paySts = paySts;
    }


    /**
     * Gets the soNbr value for this SOrderInfoOut.
     * 
     * @return soNbr
     */
    public java.lang.Long getSoNbr() {
        return soNbr;
    }


    /**
     * Sets the soNbr value for this SOrderInfoOut.
     * 
     * @param soNbr
     */
    public void setSoNbr(java.lang.Long soNbr) {
        this.soNbr = soNbr;
    }


    /**
     * Gets the amount value for this SOrderInfoOut.
     * 
     * @return amount
     */
    public java.lang.Long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this SOrderInfoOut.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }


    /**
     * Gets the channel value for this SOrderInfoOut.
     * 
     * @return channel
     */
    public java.lang.Integer getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this SOrderInfoOut.
     * 
     * @param channel
     */
    public void setChannel(java.lang.Integer channel) {
        this.channel = channel;
    }


    /**
     * Gets the measureId value for this SOrderInfoOut.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this SOrderInfoOut.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the payAcctId value for this SOrderInfoOut.
     * 
     * @return payAcctId
     */
    public java.lang.Long getPayAcctId() {
        return payAcctId;
    }


    /**
     * Sets the payAcctId value for this SOrderInfoOut.
     * 
     * @param payAcctId
     */
    public void setPayAcctId(java.lang.Long payAcctId) {
        this.payAcctId = payAcctId;
    }


    /**
     * Gets the payDate value for this SOrderInfoOut.
     * 
     * @return payDate
     */
    public java.util.Calendar getPayDate() {
        return payDate;
    }


    /**
     * Sets the payDate value for this SOrderInfoOut.
     * 
     * @param payDate
     */
    public void setPayDate(java.util.Calendar payDate) {
        this.payDate = payDate;
    }


    /**
     * Gets the paySoNbr value for this SOrderInfoOut.
     * 
     * @return paySoNbr
     */
    public java.lang.Long getPaySoNbr() {
        return paySoNbr;
    }


    /**
     * Sets the paySoNbr value for this SOrderInfoOut.
     * 
     * @param paySoNbr
     */
    public void setPaySoNbr(java.lang.Long paySoNbr) {
        this.paySoNbr = paySoNbr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SOrderInfoOut)) return false;
        SOrderInfoOut other = (SOrderInfoOut) obj;
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
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
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
            ((this.paySts==null && other.getPaySts()==null) || 
             (this.paySts!=null &&
              this.paySts.equals(other.getPaySts()))) &&
            ((this.soNbr==null && other.getSoNbr()==null) || 
             (this.soNbr!=null &&
              this.soNbr.equals(other.getSoNbr()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.payAcctId==null && other.getPayAcctId()==null) || 
             (this.payAcctId!=null &&
              this.payAcctId.equals(other.getPayAcctId()))) &&
            ((this.payDate==null && other.getPayDate()==null) || 
             (this.payDate!=null &&
              this.payDate.equals(other.getPayDate()))) &&
            ((this.paySoNbr==null && other.getPaySoNbr()==null) || 
             (this.paySoNbr!=null &&
              this.paySoNbr.equals(other.getPaySoNbr())));
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
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
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
        if (getPaySts() != null) {
            _hashCode += getPaySts().hashCode();
        }
        if (getSoNbr() != null) {
            _hashCode += getSoNbr().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getPayAcctId() != null) {
            _hashCode += getPayAcctId().hashCode();
        }
        if (getPayDate() != null) {
            _hashCode += getPayDate().hashCode();
        }
        if (getPaySoNbr() != null) {
            _hashCode += getPaySoNbr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SOrderInfoOut.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sOrderInfoOut"));
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
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
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
        elemField.setFieldName("paySts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paySts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("measureId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measureId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("payDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
