/**
 * NetaxeptPaymentInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsqueryservice;

public class NetaxeptPaymentInfo  extends com.asiainfo.crm.cm.dk.ws.imsqueryservice.QueryResponse  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.AuthenticationInformation authenticationInformation;

    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.AvtaleGiroInformation avtaleGiroInformation;

    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.CardInformation cardInformation;

    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.CustomerInformation customerInformation;

    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.DnBNorDirectPaymentInformation dnBNorDirectPaymentInformation;

    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.PaymentError error;

    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.PaymentError[] errorLog;

    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.TransactionLogLine[] history;

    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.InvoiceInformation invoiceInformation;

    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.OrderInformation orderInformation;

    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.Recurring recurring;

    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.SecurityInformation securityInformation;

    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.FinancialSummary summary;

    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.TerminalInformation terminalInformation;

    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.FraudAnalysis fraudAnalysis;

    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.MobileInformation mobile;

    public NetaxeptPaymentInfo() {
    }

    public NetaxeptPaymentInfo(
           java.lang.String merchantId,
           java.util.Calendar queryFinished,
           java.lang.String transactionId,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.AuthenticationInformation authenticationInformation,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.AvtaleGiroInformation avtaleGiroInformation,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.CardInformation cardInformation,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.CustomerInformation customerInformation,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.DnBNorDirectPaymentInformation dnBNorDirectPaymentInformation,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.PaymentError error,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.PaymentError[] errorLog,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.TransactionLogLine[] history,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.InvoiceInformation invoiceInformation,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.OrderInformation orderInformation,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.Recurring recurring,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.SecurityInformation securityInformation,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.FinancialSummary summary,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.TerminalInformation terminalInformation,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.FraudAnalysis fraudAnalysis,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.MobileInformation mobile) {
        super(
            merchantId,
            queryFinished,
            transactionId);
        this.authenticationInformation = authenticationInformation;
        this.avtaleGiroInformation = avtaleGiroInformation;
        this.cardInformation = cardInformation;
        this.customerInformation = customerInformation;
        this.dnBNorDirectPaymentInformation = dnBNorDirectPaymentInformation;
        this.error = error;
        this.errorLog = errorLog;
        this.history = history;
        this.invoiceInformation = invoiceInformation;
        this.orderInformation = orderInformation;
        this.recurring = recurring;
        this.securityInformation = securityInformation;
        this.summary = summary;
        this.terminalInformation = terminalInformation;
        this.fraudAnalysis = fraudAnalysis;
        this.mobile = mobile;
    }


    /**
     * Gets the authenticationInformation value for this NetaxeptPaymentInfo.
     * 
     * @return authenticationInformation
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.AuthenticationInformation getAuthenticationInformation() {
        return authenticationInformation;
    }


    /**
     * Sets the authenticationInformation value for this NetaxeptPaymentInfo.
     * 
     * @param authenticationInformation
     */
    public void setAuthenticationInformation(com.asiainfo.crm.cm.dk.ws.imsqueryservice.AuthenticationInformation authenticationInformation) {
        this.authenticationInformation = authenticationInformation;
    }


    /**
     * Gets the avtaleGiroInformation value for this NetaxeptPaymentInfo.
     * 
     * @return avtaleGiroInformation
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.AvtaleGiroInformation getAvtaleGiroInformation() {
        return avtaleGiroInformation;
    }


    /**
     * Sets the avtaleGiroInformation value for this NetaxeptPaymentInfo.
     * 
     * @param avtaleGiroInformation
     */
    public void setAvtaleGiroInformation(com.asiainfo.crm.cm.dk.ws.imsqueryservice.AvtaleGiroInformation avtaleGiroInformation) {
        this.avtaleGiroInformation = avtaleGiroInformation;
    }


    /**
     * Gets the cardInformation value for this NetaxeptPaymentInfo.
     * 
     * @return cardInformation
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.CardInformation getCardInformation() {
        return cardInformation;
    }


    /**
     * Sets the cardInformation value for this NetaxeptPaymentInfo.
     * 
     * @param cardInformation
     */
    public void setCardInformation(com.asiainfo.crm.cm.dk.ws.imsqueryservice.CardInformation cardInformation) {
        this.cardInformation = cardInformation;
    }


    /**
     * Gets the customerInformation value for this NetaxeptPaymentInfo.
     * 
     * @return customerInformation
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.CustomerInformation getCustomerInformation() {
        return customerInformation;
    }


    /**
     * Sets the customerInformation value for this NetaxeptPaymentInfo.
     * 
     * @param customerInformation
     */
    public void setCustomerInformation(com.asiainfo.crm.cm.dk.ws.imsqueryservice.CustomerInformation customerInformation) {
        this.customerInformation = customerInformation;
    }


    /**
     * Gets the dnBNorDirectPaymentInformation value for this NetaxeptPaymentInfo.
     * 
     * @return dnBNorDirectPaymentInformation
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.DnBNorDirectPaymentInformation getDnBNorDirectPaymentInformation() {
        return dnBNorDirectPaymentInformation;
    }


    /**
     * Sets the dnBNorDirectPaymentInformation value for this NetaxeptPaymentInfo.
     * 
     * @param dnBNorDirectPaymentInformation
     */
    public void setDnBNorDirectPaymentInformation(com.asiainfo.crm.cm.dk.ws.imsqueryservice.DnBNorDirectPaymentInformation dnBNorDirectPaymentInformation) {
        this.dnBNorDirectPaymentInformation = dnBNorDirectPaymentInformation;
    }


    /**
     * Gets the error value for this NetaxeptPaymentInfo.
     * 
     * @return error
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.PaymentError getError() {
        return error;
    }


    /**
     * Sets the error value for this NetaxeptPaymentInfo.
     * 
     * @param error
     */
    public void setError(com.asiainfo.crm.cm.dk.ws.imsqueryservice.PaymentError error) {
        this.error = error;
    }


    /**
     * Gets the errorLog value for this NetaxeptPaymentInfo.
     * 
     * @return errorLog
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.PaymentError[] getErrorLog() {
        return errorLog;
    }


    /**
     * Sets the errorLog value for this NetaxeptPaymentInfo.
     * 
     * @param errorLog
     */
    public void setErrorLog(com.asiainfo.crm.cm.dk.ws.imsqueryservice.PaymentError[] errorLog) {
        this.errorLog = errorLog;
    }


    /**
     * Gets the history value for this NetaxeptPaymentInfo.
     * 
     * @return history
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.TransactionLogLine[] getHistory() {
        return history;
    }


    /**
     * Sets the history value for this NetaxeptPaymentInfo.
     * 
     * @param history
     */
    public void setHistory(com.asiainfo.crm.cm.dk.ws.imsqueryservice.TransactionLogLine[] history) {
        this.history = history;
    }


    /**
     * Gets the invoiceInformation value for this NetaxeptPaymentInfo.
     * 
     * @return invoiceInformation
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.InvoiceInformation getInvoiceInformation() {
        return invoiceInformation;
    }


    /**
     * Sets the invoiceInformation value for this NetaxeptPaymentInfo.
     * 
     * @param invoiceInformation
     */
    public void setInvoiceInformation(com.asiainfo.crm.cm.dk.ws.imsqueryservice.InvoiceInformation invoiceInformation) {
        this.invoiceInformation = invoiceInformation;
    }


    /**
     * Gets the orderInformation value for this NetaxeptPaymentInfo.
     * 
     * @return orderInformation
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.OrderInformation getOrderInformation() {
        return orderInformation;
    }


    /**
     * Sets the orderInformation value for this NetaxeptPaymentInfo.
     * 
     * @param orderInformation
     */
    public void setOrderInformation(com.asiainfo.crm.cm.dk.ws.imsqueryservice.OrderInformation orderInformation) {
        this.orderInformation = orderInformation;
    }


    /**
     * Gets the recurring value for this NetaxeptPaymentInfo.
     * 
     * @return recurring
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.Recurring getRecurring() {
        return recurring;
    }


    /**
     * Sets the recurring value for this NetaxeptPaymentInfo.
     * 
     * @param recurring
     */
    public void setRecurring(com.asiainfo.crm.cm.dk.ws.imsqueryservice.Recurring recurring) {
        this.recurring = recurring;
    }


    /**
     * Gets the securityInformation value for this NetaxeptPaymentInfo.
     * 
     * @return securityInformation
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.SecurityInformation getSecurityInformation() {
        return securityInformation;
    }


    /**
     * Sets the securityInformation value for this NetaxeptPaymentInfo.
     * 
     * @param securityInformation
     */
    public void setSecurityInformation(com.asiainfo.crm.cm.dk.ws.imsqueryservice.SecurityInformation securityInformation) {
        this.securityInformation = securityInformation;
    }


    /**
     * Gets the summary value for this NetaxeptPaymentInfo.
     * 
     * @return summary
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.FinancialSummary getSummary() {
        return summary;
    }


    /**
     * Sets the summary value for this NetaxeptPaymentInfo.
     * 
     * @param summary
     */
    public void setSummary(com.asiainfo.crm.cm.dk.ws.imsqueryservice.FinancialSummary summary) {
        this.summary = summary;
    }


    /**
     * Gets the terminalInformation value for this NetaxeptPaymentInfo.
     * 
     * @return terminalInformation
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.TerminalInformation getTerminalInformation() {
        return terminalInformation;
    }


    /**
     * Sets the terminalInformation value for this NetaxeptPaymentInfo.
     * 
     * @param terminalInformation
     */
    public void setTerminalInformation(com.asiainfo.crm.cm.dk.ws.imsqueryservice.TerminalInformation terminalInformation) {
        this.terminalInformation = terminalInformation;
    }


    /**
     * Gets the fraudAnalysis value for this NetaxeptPaymentInfo.
     * 
     * @return fraudAnalysis
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.FraudAnalysis getFraudAnalysis() {
        return fraudAnalysis;
    }


    /**
     * Sets the fraudAnalysis value for this NetaxeptPaymentInfo.
     * 
     * @param fraudAnalysis
     */
    public void setFraudAnalysis(com.asiainfo.crm.cm.dk.ws.imsqueryservice.FraudAnalysis fraudAnalysis) {
        this.fraudAnalysis = fraudAnalysis;
    }


    /**
     * Gets the mobile value for this NetaxeptPaymentInfo.
     * 
     * @return mobile
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.MobileInformation getMobile() {
        return mobile;
    }


    /**
     * Sets the mobile value for this NetaxeptPaymentInfo.
     * 
     * @param mobile
     */
    public void setMobile(com.asiainfo.crm.cm.dk.ws.imsqueryservice.MobileInformation mobile) {
        this.mobile = mobile;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetaxeptPaymentInfo)) return false;
        NetaxeptPaymentInfo other = (NetaxeptPaymentInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.authenticationInformation==null && other.getAuthenticationInformation()==null) || 
             (this.authenticationInformation!=null &&
              this.authenticationInformation.equals(other.getAuthenticationInformation()))) &&
            ((this.avtaleGiroInformation==null && other.getAvtaleGiroInformation()==null) || 
             (this.avtaleGiroInformation!=null &&
              this.avtaleGiroInformation.equals(other.getAvtaleGiroInformation()))) &&
            ((this.cardInformation==null && other.getCardInformation()==null) || 
             (this.cardInformation!=null &&
              this.cardInformation.equals(other.getCardInformation()))) &&
            ((this.customerInformation==null && other.getCustomerInformation()==null) || 
             (this.customerInformation!=null &&
              this.customerInformation.equals(other.getCustomerInformation()))) &&
            ((this.dnBNorDirectPaymentInformation==null && other.getDnBNorDirectPaymentInformation()==null) || 
             (this.dnBNorDirectPaymentInformation!=null &&
              this.dnBNorDirectPaymentInformation.equals(other.getDnBNorDirectPaymentInformation()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError()))) &&
            ((this.errorLog==null && other.getErrorLog()==null) || 
             (this.errorLog!=null &&
              java.util.Arrays.equals(this.errorLog, other.getErrorLog()))) &&
            ((this.history==null && other.getHistory()==null) || 
             (this.history!=null &&
              java.util.Arrays.equals(this.history, other.getHistory()))) &&
            ((this.invoiceInformation==null && other.getInvoiceInformation()==null) || 
             (this.invoiceInformation!=null &&
              this.invoiceInformation.equals(other.getInvoiceInformation()))) &&
            ((this.orderInformation==null && other.getOrderInformation()==null) || 
             (this.orderInformation!=null &&
              this.orderInformation.equals(other.getOrderInformation()))) &&
            ((this.recurring==null && other.getRecurring()==null) || 
             (this.recurring!=null &&
              this.recurring.equals(other.getRecurring()))) &&
            ((this.securityInformation==null && other.getSecurityInformation()==null) || 
             (this.securityInformation!=null &&
              this.securityInformation.equals(other.getSecurityInformation()))) &&
            ((this.summary==null && other.getSummary()==null) || 
             (this.summary!=null &&
              this.summary.equals(other.getSummary()))) &&
            ((this.terminalInformation==null && other.getTerminalInformation()==null) || 
             (this.terminalInformation!=null &&
              this.terminalInformation.equals(other.getTerminalInformation()))) &&
            ((this.fraudAnalysis==null && other.getFraudAnalysis()==null) || 
             (this.fraudAnalysis!=null &&
              this.fraudAnalysis.equals(other.getFraudAnalysis()))) &&
            ((this.mobile==null && other.getMobile()==null) || 
             (this.mobile!=null &&
              this.mobile.equals(other.getMobile())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAuthenticationInformation() != null) {
            _hashCode += getAuthenticationInformation().hashCode();
        }
        if (getAvtaleGiroInformation() != null) {
            _hashCode += getAvtaleGiroInformation().hashCode();
        }
        if (getCardInformation() != null) {
            _hashCode += getCardInformation().hashCode();
        }
        if (getCustomerInformation() != null) {
            _hashCode += getCustomerInformation().hashCode();
        }
        if (getDnBNorDirectPaymentInformation() != null) {
            _hashCode += getDnBNorDirectPaymentInformation().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        if (getErrorLog() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrorLog());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrorLog(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHistory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHistory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHistory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInvoiceInformation() != null) {
            _hashCode += getInvoiceInformation().hashCode();
        }
        if (getOrderInformation() != null) {
            _hashCode += getOrderInformation().hashCode();
        }
        if (getRecurring() != null) {
            _hashCode += getRecurring().hashCode();
        }
        if (getSecurityInformation() != null) {
            _hashCode += getSecurityInformation().hashCode();
        }
        if (getSummary() != null) {
            _hashCode += getSummary().hashCode();
        }
        if (getTerminalInformation() != null) {
            _hashCode += getTerminalInformation().hashCode();
        }
        if (getFraudAnalysis() != null) {
            _hashCode += getFraudAnalysis().hashCode();
        }
        if (getMobile() != null) {
            _hashCode += getMobile().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetaxeptPaymentInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "netaxeptPaymentInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authenticationInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AuthenticationInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "authenticationInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avtaleGiroInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AvtaleGiroInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "avtaleGiroInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CardInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "cardInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CustomerInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "customerInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnBNorDirectPaymentInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DnBNorDirectPaymentInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "dnBNorDirectPaymentInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "paymentError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorLog");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ErrorLog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "paymentError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "PaymentError"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("history");
        elemField.setXmlName(new javax.xml.namespace.QName("", "History"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "transactionLogLine"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "TransactionLogLine"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InvoiceInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "invoiceInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OrderInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "orderInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurring");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Recurring"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "recurring"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SecurityInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "securityInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Summary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "financialSummary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminalInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TerminalInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "terminalInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fraudAnalysis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FraudAnalysis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "fraudAnalysis"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Mobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "mobileInformation"));
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
