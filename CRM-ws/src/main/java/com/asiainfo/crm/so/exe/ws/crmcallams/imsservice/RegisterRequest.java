/**
 * RegisterRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsservice;

public class RegisterRequest  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.AvtaleGiro avtaleGiro;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.CardInfo cardInfo;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.Customer customer;

    private java.lang.String description;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DnBNorDirectPayment dnBNorDirectPayment;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.Environment environment;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.Order order;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.Recurring recurring;

    private java.lang.String serviceType;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.Terminal terminal;

    private java.lang.String transactionId;

    private java.lang.String transactionReconRef;

    public RegisterRequest() {
    }

    public RegisterRequest(
           com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.AvtaleGiro avtaleGiro,
           com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.CardInfo cardInfo,
           com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.Customer customer,
           java.lang.String description,
           com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DnBNorDirectPayment dnBNorDirectPayment,
           com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.Environment environment,
           com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.Order order,
           com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.Recurring recurring,
           java.lang.String serviceType,
           com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.Terminal terminal,
           java.lang.String transactionId,
           java.lang.String transactionReconRef) {
           this.avtaleGiro = avtaleGiro;
           this.cardInfo = cardInfo;
           this.customer = customer;
           this.description = description;
           this.dnBNorDirectPayment = dnBNorDirectPayment;
           this.environment = environment;
           this.order = order;
           this.recurring = recurring;
           this.serviceType = serviceType;
           this.terminal = terminal;
           this.transactionId = transactionId;
           this.transactionReconRef = transactionReconRef;
    }


    /**
     * Gets the avtaleGiro value for this RegisterRequest.
     * 
     * @return avtaleGiro
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.AvtaleGiro getAvtaleGiro() {
        return avtaleGiro;
    }


    /**
     * Sets the avtaleGiro value for this RegisterRequest.
     * 
     * @param avtaleGiro
     */
    public void setAvtaleGiro(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.AvtaleGiro avtaleGiro) {
        this.avtaleGiro = avtaleGiro;
    }


    /**
     * Gets the cardInfo value for this RegisterRequest.
     * 
     * @return cardInfo
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.CardInfo getCardInfo() {
        return cardInfo;
    }


    /**
     * Sets the cardInfo value for this RegisterRequest.
     * 
     * @param cardInfo
     */
    public void setCardInfo(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.CardInfo cardInfo) {
        this.cardInfo = cardInfo;
    }


    /**
     * Gets the customer value for this RegisterRequest.
     * 
     * @return customer
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.Customer getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this RegisterRequest.
     * 
     * @param customer
     */
    public void setCustomer(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.Customer customer) {
        this.customer = customer;
    }


    /**
     * Gets the description value for this RegisterRequest.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this RegisterRequest.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the dnBNorDirectPayment value for this RegisterRequest.
     * 
     * @return dnBNorDirectPayment
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DnBNorDirectPayment getDnBNorDirectPayment() {
        return dnBNorDirectPayment;
    }


    /**
     * Sets the dnBNorDirectPayment value for this RegisterRequest.
     * 
     * @param dnBNorDirectPayment
     */
    public void setDnBNorDirectPayment(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DnBNorDirectPayment dnBNorDirectPayment) {
        this.dnBNorDirectPayment = dnBNorDirectPayment;
    }


    /**
     * Gets the environment value for this RegisterRequest.
     * 
     * @return environment
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.Environment getEnvironment() {
        return environment;
    }


    /**
     * Sets the environment value for this RegisterRequest.
     * 
     * @param environment
     */
    public void setEnvironment(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.Environment environment) {
        this.environment = environment;
    }


    /**
     * Gets the order value for this RegisterRequest.
     * 
     * @return order
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.Order getOrder() {
        return order;
    }


    /**
     * Sets the order value for this RegisterRequest.
     * 
     * @param order
     */
    public void setOrder(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.Order order) {
        this.order = order;
    }


    /**
     * Gets the recurring value for this RegisterRequest.
     * 
     * @return recurring
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.Recurring getRecurring() {
        return recurring;
    }


    /**
     * Sets the recurring value for this RegisterRequest.
     * 
     * @param recurring
     */
    public void setRecurring(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.Recurring recurring) {
        this.recurring = recurring;
    }


    /**
     * Gets the serviceType value for this RegisterRequest.
     * 
     * @return serviceType
     */
    public java.lang.String getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this RegisterRequest.
     * 
     * @param serviceType
     */
    public void setServiceType(java.lang.String serviceType) {
        this.serviceType = serviceType;
    }


    /**
     * Gets the terminal value for this RegisterRequest.
     * 
     * @return terminal
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.Terminal getTerminal() {
        return terminal;
    }


    /**
     * Sets the terminal value for this RegisterRequest.
     * 
     * @param terminal
     */
    public void setTerminal(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.Terminal terminal) {
        this.terminal = terminal;
    }


    /**
     * Gets the transactionId value for this RegisterRequest.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this RegisterRequest.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the transactionReconRef value for this RegisterRequest.
     * 
     * @return transactionReconRef
     */
    public java.lang.String getTransactionReconRef() {
        return transactionReconRef;
    }


    /**
     * Sets the transactionReconRef value for this RegisterRequest.
     * 
     * @param transactionReconRef
     */
    public void setTransactionReconRef(java.lang.String transactionReconRef) {
        this.transactionReconRef = transactionReconRef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RegisterRequest)) return false;
        RegisterRequest other = (RegisterRequest) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.avtaleGiro==null && other.getAvtaleGiro()==null) || 
             (this.avtaleGiro!=null &&
              this.avtaleGiro.equals(other.getAvtaleGiro()))) &&
            ((this.cardInfo==null && other.getCardInfo()==null) || 
             (this.cardInfo!=null &&
              this.cardInfo.equals(other.getCardInfo()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.dnBNorDirectPayment==null && other.getDnBNorDirectPayment()==null) || 
             (this.dnBNorDirectPayment!=null &&
              this.dnBNorDirectPayment.equals(other.getDnBNorDirectPayment()))) &&
            ((this.environment==null && other.getEnvironment()==null) || 
             (this.environment!=null &&
              this.environment.equals(other.getEnvironment()))) &&
            ((this.order==null && other.getOrder()==null) || 
             (this.order!=null &&
              this.order.equals(other.getOrder()))) &&
            ((this.recurring==null && other.getRecurring()==null) || 
             (this.recurring!=null &&
              this.recurring.equals(other.getRecurring()))) &&
            ((this.serviceType==null && other.getServiceType()==null) || 
             (this.serviceType!=null &&
              this.serviceType.equals(other.getServiceType()))) &&
            ((this.terminal==null && other.getTerminal()==null) || 
             (this.terminal!=null &&
              this.terminal.equals(other.getTerminal()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.transactionReconRef==null && other.getTransactionReconRef()==null) || 
             (this.transactionReconRef!=null &&
              this.transactionReconRef.equals(other.getTransactionReconRef())));
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
        if (getAvtaleGiro() != null) {
            _hashCode += getAvtaleGiro().hashCode();
        }
        if (getCardInfo() != null) {
            _hashCode += getCardInfo().hashCode();
        }
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDnBNorDirectPayment() != null) {
            _hashCode += getDnBNorDirectPayment().hashCode();
        }
        if (getEnvironment() != null) {
            _hashCode += getEnvironment().hashCode();
        }
        if (getOrder() != null) {
            _hashCode += getOrder().hashCode();
        }
        if (getRecurring() != null) {
            _hashCode += getRecurring().hashCode();
        }
        if (getServiceType() != null) {
            _hashCode += getServiceType().hashCode();
        }
        if (getTerminal() != null) {
            _hashCode += getTerminal().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getTransactionReconRef() != null) {
            _hashCode += getTransactionReconRef().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegisterRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "registerRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avtaleGiro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AvtaleGiro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "avtaleGiro"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CardInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "cardInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "customer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnBNorDirectPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DnBNorDirectPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "dnBNorDirectPayment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Environment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "environment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Order"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "order"));
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
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ServiceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Terminal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "terminal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionReconRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TransactionReconRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
