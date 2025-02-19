/**
 * SRecOrderInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class SRecOrderInfo  implements java.io.Serializable {
    private java.lang.Integer measureId;

    private java.lang.String orderId;

    private java.util.Calendar orderDate;

    private java.lang.Long cash;

    private java.lang.Long pos;

    private java.lang.Long nets;

    private java.lang.Long balance;

    private java.lang.Long downPayment;

    private java.lang.Integer paidSts;

    private java.lang.String bankCode;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SCaBusiRecOffer[] caBusiRecOfferList;

    private java.lang.Long allowanceAcctId;

    private java.lang.Integer allowanceAcctSts;

    private java.lang.Long remainRetail;

    private java.lang.Long regretAllowance;

    private java.lang.Long remainAllowance;

    private java.lang.String netErrorCode;

    private java.lang.Long acctId;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SRegretOfferInfo[] regretOfferList;

    public SRecOrderInfo() {
    }

    public SRecOrderInfo(
           java.lang.Integer measureId,
           java.lang.String orderId,
           java.util.Calendar orderDate,
           java.lang.Long cash,
           java.lang.Long pos,
           java.lang.Long nets,
           java.lang.Long balance,
           java.lang.Long downPayment,
           java.lang.Integer paidSts,
           java.lang.String bankCode,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SCaBusiRecOffer[] caBusiRecOfferList,
           java.lang.Long allowanceAcctId,
           java.lang.Integer allowanceAcctSts,
           java.lang.Long remainRetail,
           java.lang.Long regretAllowance,
           java.lang.Long remainAllowance,
           java.lang.String netErrorCode,
           java.lang.Long acctId,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SRegretOfferInfo[] regretOfferList) {
           this.measureId = measureId;
           this.orderId = orderId;
           this.orderDate = orderDate;
           this.cash = cash;
           this.pos = pos;
           this.nets = nets;
           this.balance = balance;
           this.downPayment = downPayment;
           this.paidSts = paidSts;
           this.bankCode = bankCode;
           this.caBusiRecOfferList = caBusiRecOfferList;
           this.allowanceAcctId = allowanceAcctId;
           this.allowanceAcctSts = allowanceAcctSts;
           this.remainRetail = remainRetail;
           this.regretAllowance = regretAllowance;
           this.remainAllowance = remainAllowance;
           this.netErrorCode = netErrorCode;
           this.acctId = acctId;
           this.regretOfferList = regretOfferList;
    }


    /**
     * Gets the measureId value for this SRecOrderInfo.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this SRecOrderInfo.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the orderId value for this SRecOrderInfo.
     * 
     * @return orderId
     */
    public java.lang.String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this SRecOrderInfo.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the orderDate value for this SRecOrderInfo.
     * 
     * @return orderDate
     */
    public java.util.Calendar getOrderDate() {
        return orderDate;
    }


    /**
     * Sets the orderDate value for this SRecOrderInfo.
     * 
     * @param orderDate
     */
    public void setOrderDate(java.util.Calendar orderDate) {
        this.orderDate = orderDate;
    }


    /**
     * Gets the cash value for this SRecOrderInfo.
     * 
     * @return cash
     */
    public java.lang.Long getCash() {
        return cash;
    }


    /**
     * Sets the cash value for this SRecOrderInfo.
     * 
     * @param cash
     */
    public void setCash(java.lang.Long cash) {
        this.cash = cash;
    }


    /**
     * Gets the pos value for this SRecOrderInfo.
     * 
     * @return pos
     */
    public java.lang.Long getPos() {
        return pos;
    }


    /**
     * Sets the pos value for this SRecOrderInfo.
     * 
     * @param pos
     */
    public void setPos(java.lang.Long pos) {
        this.pos = pos;
    }


    /**
     * Gets the nets value for this SRecOrderInfo.
     * 
     * @return nets
     */
    public java.lang.Long getNets() {
        return nets;
    }


    /**
     * Sets the nets value for this SRecOrderInfo.
     * 
     * @param nets
     */
    public void setNets(java.lang.Long nets) {
        this.nets = nets;
    }


    /**
     * Gets the balance value for this SRecOrderInfo.
     * 
     * @return balance
     */
    public java.lang.Long getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this SRecOrderInfo.
     * 
     * @param balance
     */
    public void setBalance(java.lang.Long balance) {
        this.balance = balance;
    }


    /**
     * Gets the downPayment value for this SRecOrderInfo.
     * 
     * @return downPayment
     */
    public java.lang.Long getDownPayment() {
        return downPayment;
    }


    /**
     * Sets the downPayment value for this SRecOrderInfo.
     * 
     * @param downPayment
     */
    public void setDownPayment(java.lang.Long downPayment) {
        this.downPayment = downPayment;
    }


    /**
     * Gets the paidSts value for this SRecOrderInfo.
     * 
     * @return paidSts
     */
    public java.lang.Integer getPaidSts() {
        return paidSts;
    }


    /**
     * Sets the paidSts value for this SRecOrderInfo.
     * 
     * @param paidSts
     */
    public void setPaidSts(java.lang.Integer paidSts) {
        this.paidSts = paidSts;
    }


    /**
     * Gets the bankCode value for this SRecOrderInfo.
     * 
     * @return bankCode
     */
    public java.lang.String getBankCode() {
        return bankCode;
    }


    /**
     * Sets the bankCode value for this SRecOrderInfo.
     * 
     * @param bankCode
     */
    public void setBankCode(java.lang.String bankCode) {
        this.bankCode = bankCode;
    }


    /**
     * Gets the caBusiRecOfferList value for this SRecOrderInfo.
     * 
     * @return caBusiRecOfferList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SCaBusiRecOffer[] getCaBusiRecOfferList() {
        return caBusiRecOfferList;
    }


    /**
     * Sets the caBusiRecOfferList value for this SRecOrderInfo.
     * 
     * @param caBusiRecOfferList
     */
    public void setCaBusiRecOfferList(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SCaBusiRecOffer[] caBusiRecOfferList) {
        this.caBusiRecOfferList = caBusiRecOfferList;
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SCaBusiRecOffer getCaBusiRecOfferList(int i) {
        return this.caBusiRecOfferList[i];
    }

    public void setCaBusiRecOfferList(int i, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SCaBusiRecOffer _value) {
        this.caBusiRecOfferList[i] = _value;
    }


    /**
     * Gets the allowanceAcctId value for this SRecOrderInfo.
     * 
     * @return allowanceAcctId
     */
    public java.lang.Long getAllowanceAcctId() {
        return allowanceAcctId;
    }


    /**
     * Sets the allowanceAcctId value for this SRecOrderInfo.
     * 
     * @param allowanceAcctId
     */
    public void setAllowanceAcctId(java.lang.Long allowanceAcctId) {
        this.allowanceAcctId = allowanceAcctId;
    }


    /**
     * Gets the allowanceAcctSts value for this SRecOrderInfo.
     * 
     * @return allowanceAcctSts
     */
    public java.lang.Integer getAllowanceAcctSts() {
        return allowanceAcctSts;
    }


    /**
     * Sets the allowanceAcctSts value for this SRecOrderInfo.
     * 
     * @param allowanceAcctSts
     */
    public void setAllowanceAcctSts(java.lang.Integer allowanceAcctSts) {
        this.allowanceAcctSts = allowanceAcctSts;
    }


    /**
     * Gets the remainRetail value for this SRecOrderInfo.
     * 
     * @return remainRetail
     */
    public java.lang.Long getRemainRetail() {
        return remainRetail;
    }


    /**
     * Sets the remainRetail value for this SRecOrderInfo.
     * 
     * @param remainRetail
     */
    public void setRemainRetail(java.lang.Long remainRetail) {
        this.remainRetail = remainRetail;
    }


    /**
     * Gets the regretAllowance value for this SRecOrderInfo.
     * 
     * @return regretAllowance
     */
    public java.lang.Long getRegretAllowance() {
        return regretAllowance;
    }


    /**
     * Sets the regretAllowance value for this SRecOrderInfo.
     * 
     * @param regretAllowance
     */
    public void setRegretAllowance(java.lang.Long regretAllowance) {
        this.regretAllowance = regretAllowance;
    }


    /**
     * Gets the remainAllowance value for this SRecOrderInfo.
     * 
     * @return remainAllowance
     */
    public java.lang.Long getRemainAllowance() {
        return remainAllowance;
    }


    /**
     * Sets the remainAllowance value for this SRecOrderInfo.
     * 
     * @param remainAllowance
     */
    public void setRemainAllowance(java.lang.Long remainAllowance) {
        this.remainAllowance = remainAllowance;
    }


    /**
     * Gets the netErrorCode value for this SRecOrderInfo.
     * 
     * @return netErrorCode
     */
    public java.lang.String getNetErrorCode() {
        return netErrorCode;
    }


    /**
     * Sets the netErrorCode value for this SRecOrderInfo.
     * 
     * @param netErrorCode
     */
    public void setNetErrorCode(java.lang.String netErrorCode) {
        this.netErrorCode = netErrorCode;
    }


    /**
     * Gets the acctId value for this SRecOrderInfo.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SRecOrderInfo.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the regretOfferList value for this SRecOrderInfo.
     * 
     * @return regretOfferList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SRegretOfferInfo[] getRegretOfferList() {
        return regretOfferList;
    }


    /**
     * Sets the regretOfferList value for this SRecOrderInfo.
     * 
     * @param regretOfferList
     */
    public void setRegretOfferList(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SRegretOfferInfo[] regretOfferList) {
        this.regretOfferList = regretOfferList;
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SRegretOfferInfo getRegretOfferList(int i) {
        return this.regretOfferList[i];
    }

    public void setRegretOfferList(int i, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SRegretOfferInfo _value) {
        this.regretOfferList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SRecOrderInfo)) return false;
        SRecOrderInfo other = (SRecOrderInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.orderDate==null && other.getOrderDate()==null) || 
             (this.orderDate!=null &&
              this.orderDate.equals(other.getOrderDate()))) &&
            ((this.cash==null && other.getCash()==null) || 
             (this.cash!=null &&
              this.cash.equals(other.getCash()))) &&
            ((this.pos==null && other.getPos()==null) || 
             (this.pos!=null &&
              this.pos.equals(other.getPos()))) &&
            ((this.nets==null && other.getNets()==null) || 
             (this.nets!=null &&
              this.nets.equals(other.getNets()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            ((this.downPayment==null && other.getDownPayment()==null) || 
             (this.downPayment!=null &&
              this.downPayment.equals(other.getDownPayment()))) &&
            ((this.paidSts==null && other.getPaidSts()==null) || 
             (this.paidSts!=null &&
              this.paidSts.equals(other.getPaidSts()))) &&
            ((this.bankCode==null && other.getBankCode()==null) || 
             (this.bankCode!=null &&
              this.bankCode.equals(other.getBankCode()))) &&
            ((this.caBusiRecOfferList==null && other.getCaBusiRecOfferList()==null) || 
             (this.caBusiRecOfferList!=null &&
              java.util.Arrays.equals(this.caBusiRecOfferList, other.getCaBusiRecOfferList()))) &&
            ((this.allowanceAcctId==null && other.getAllowanceAcctId()==null) || 
             (this.allowanceAcctId!=null &&
              this.allowanceAcctId.equals(other.getAllowanceAcctId()))) &&
            ((this.allowanceAcctSts==null && other.getAllowanceAcctSts()==null) || 
             (this.allowanceAcctSts!=null &&
              this.allowanceAcctSts.equals(other.getAllowanceAcctSts()))) &&
            ((this.remainRetail==null && other.getRemainRetail()==null) || 
             (this.remainRetail!=null &&
              this.remainRetail.equals(other.getRemainRetail()))) &&
            ((this.regretAllowance==null && other.getRegretAllowance()==null) || 
             (this.regretAllowance!=null &&
              this.regretAllowance.equals(other.getRegretAllowance()))) &&
            ((this.remainAllowance==null && other.getRemainAllowance()==null) || 
             (this.remainAllowance!=null &&
              this.remainAllowance.equals(other.getRemainAllowance()))) &&
            ((this.netErrorCode==null && other.getNetErrorCode()==null) || 
             (this.netErrorCode!=null &&
              this.netErrorCode.equals(other.getNetErrorCode()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.regretOfferList==null && other.getRegretOfferList()==null) || 
             (this.regretOfferList!=null &&
              java.util.Arrays.equals(this.regretOfferList, other.getRegretOfferList())));
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
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getOrderDate() != null) {
            _hashCode += getOrderDate().hashCode();
        }
        if (getCash() != null) {
            _hashCode += getCash().hashCode();
        }
        if (getPos() != null) {
            _hashCode += getPos().hashCode();
        }
        if (getNets() != null) {
            _hashCode += getNets().hashCode();
        }
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        if (getDownPayment() != null) {
            _hashCode += getDownPayment().hashCode();
        }
        if (getPaidSts() != null) {
            _hashCode += getPaidSts().hashCode();
        }
        if (getBankCode() != null) {
            _hashCode += getBankCode().hashCode();
        }
        if (getCaBusiRecOfferList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCaBusiRecOfferList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCaBusiRecOfferList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAllowanceAcctId() != null) {
            _hashCode += getAllowanceAcctId().hashCode();
        }
        if (getAllowanceAcctSts() != null) {
            _hashCode += getAllowanceAcctSts().hashCode();
        }
        if (getRemainRetail() != null) {
            _hashCode += getRemainRetail().hashCode();
        }
        if (getRegretAllowance() != null) {
            _hashCode += getRegretAllowance().hashCode();
        }
        if (getRemainAllowance() != null) {
            _hashCode += getRemainAllowance().hashCode();
        }
        if (getNetErrorCode() != null) {
            _hashCode += getNetErrorCode().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getRegretOfferList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegretOfferList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegretOfferList(), i);
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
        new org.apache.axis.description.TypeDesc(SRecOrderInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sRecOrderInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measureId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measureId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("cash");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cash"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "downPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidSts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paidSts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caBusiRecOfferList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "caBusiRecOfferList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCaBusiRecOffer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowanceAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allowanceAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowanceAcctSts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allowanceAcctSts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainRetail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remainRetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regretAllowance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regretAllowance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainAllowance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remainAllowance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netErrorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "netErrorCode"));
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
        elemField.setFieldName("regretOfferList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regretOfferList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sRegretOfferInfo"));
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
