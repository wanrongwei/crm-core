/**
 * CheckCreditResponseBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.noitso;

public class CheckCreditResponseBody  implements java.io.Serializable {
    private java.lang.String transactionId;

    private java.lang.String applicationId;

    private java.lang.String created;

    private java.lang.String systemDecision;

    private java.lang.String finalDecision;

    private java.lang.String statusMessage;

    private java.lang.Long upfrontPayment;

    private java.lang.Long upfrontPaymentManualDecision;

    private java.lang.Long depositManualDecision;

    private java.lang.Boolean retailInvoiceSystemDecision;

    private java.lang.Boolean retailInvoiceManualDecision;

    public CheckCreditResponseBody() {
    }

    public CheckCreditResponseBody(
           java.lang.String transactionId,
           java.lang.String applicationId,
           java.lang.String created,
           java.lang.String systemDecision,
           java.lang.String finalDecision,
           java.lang.String statusMessage,
           java.lang.Long upfrontPayment,
           java.lang.Long upfrontPaymentManualDecision,
           java.lang.Long depositManualDecision,
           java.lang.Boolean retailInvoiceSystemDecision,
           java.lang.Boolean retailInvoiceManualDecision) {
           this.transactionId = transactionId;
           this.applicationId = applicationId;
           this.created = created;
           this.systemDecision = systemDecision;
           this.finalDecision = finalDecision;
           this.statusMessage = statusMessage;
           this.upfrontPayment = upfrontPayment;
           this.upfrontPaymentManualDecision = upfrontPaymentManualDecision;
           this.depositManualDecision = depositManualDecision;
           this.retailInvoiceSystemDecision = retailInvoiceSystemDecision;
           this.retailInvoiceManualDecision = retailInvoiceManualDecision;
    }


    /**
     * Gets the transactionId value for this CheckCreditResponseBody.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this CheckCreditResponseBody.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the applicationId value for this CheckCreditResponseBody.
     * 
     * @return applicationId
     */
    public java.lang.String getApplicationId() {
        return applicationId;
    }


    /**
     * Sets the applicationId value for this CheckCreditResponseBody.
     * 
     * @param applicationId
     */
    public void setApplicationId(java.lang.String applicationId) {
        this.applicationId = applicationId;
    }


    /**
     * Gets the created value for this CheckCreditResponseBody.
     * 
     * @return created
     */
    public java.lang.String getCreated() {
        return created;
    }


    /**
     * Sets the created value for this CheckCreditResponseBody.
     * 
     * @param created
     */
    public void setCreated(java.lang.String created) {
        this.created = created;
    }


    /**
     * Gets the systemDecision value for this CheckCreditResponseBody.
     * 
     * @return systemDecision
     */
    public java.lang.String getSystemDecision() {
        return systemDecision;
    }


    /**
     * Sets the systemDecision value for this CheckCreditResponseBody.
     * 
     * @param systemDecision
     */
    public void setSystemDecision(java.lang.String systemDecision) {
        this.systemDecision = systemDecision;
    }


    /**
     * Gets the finalDecision value for this CheckCreditResponseBody.
     * 
     * @return finalDecision
     */
    public java.lang.String getFinalDecision() {
        return finalDecision;
    }


    /**
     * Sets the finalDecision value for this CheckCreditResponseBody.
     * 
     * @param finalDecision
     */
    public void setFinalDecision(java.lang.String finalDecision) {
        this.finalDecision = finalDecision;
    }


    /**
     * Gets the statusMessage value for this CheckCreditResponseBody.
     * 
     * @return statusMessage
     */
    public java.lang.String getStatusMessage() {
        return statusMessage;
    }


    /**
     * Sets the statusMessage value for this CheckCreditResponseBody.
     * 
     * @param statusMessage
     */
    public void setStatusMessage(java.lang.String statusMessage) {
        this.statusMessage = statusMessage;
    }


    /**
     * Gets the upfrontPayment value for this CheckCreditResponseBody.
     * 
     * @return upfrontPayment
     */
    public java.lang.Long getUpfrontPayment() {
        return upfrontPayment;
    }


    /**
     * Sets the upfrontPayment value for this CheckCreditResponseBody.
     * 
     * @param upfrontPayment
     */
    public void setUpfrontPayment(java.lang.Long upfrontPayment) {
        this.upfrontPayment = upfrontPayment;
    }


    /**
     * Gets the upfrontPaymentManualDecision value for this CheckCreditResponseBody.
     * 
     * @return upfrontPaymentManualDecision
     */
    public java.lang.Long getUpfrontPaymentManualDecision() {
        return upfrontPaymentManualDecision;
    }


    /**
     * Sets the upfrontPaymentManualDecision value for this CheckCreditResponseBody.
     * 
     * @param upfrontPaymentManualDecision
     */
    public void setUpfrontPaymentManualDecision(java.lang.Long upfrontPaymentManualDecision) {
        this.upfrontPaymentManualDecision = upfrontPaymentManualDecision;
    }


    /**
     * Gets the depositManualDecision value for this CheckCreditResponseBody.
     * 
     * @return depositManualDecision
     */
    public java.lang.Long getDepositManualDecision() {
        return depositManualDecision;
    }


    /**
     * Sets the depositManualDecision value for this CheckCreditResponseBody.
     * 
     * @param depositManualDecision
     */
    public void setDepositManualDecision(java.lang.Long depositManualDecision) {
        this.depositManualDecision = depositManualDecision;
    }


    /**
     * Gets the retailInvoiceSystemDecision value for this CheckCreditResponseBody.
     * 
     * @return retailInvoiceSystemDecision
     */
    public java.lang.Boolean getRetailInvoiceSystemDecision() {
        return retailInvoiceSystemDecision;
    }


    /**
     * Sets the retailInvoiceSystemDecision value for this CheckCreditResponseBody.
     * 
     * @param retailInvoiceSystemDecision
     */
    public void setRetailInvoiceSystemDecision(java.lang.Boolean retailInvoiceSystemDecision) {
        this.retailInvoiceSystemDecision = retailInvoiceSystemDecision;
    }


    /**
     * Gets the retailInvoiceManualDecision value for this CheckCreditResponseBody.
     * 
     * @return retailInvoiceManualDecision
     */
    public java.lang.Boolean getRetailInvoiceManualDecision() {
        return retailInvoiceManualDecision;
    }


    /**
     * Sets the retailInvoiceManualDecision value for this CheckCreditResponseBody.
     * 
     * @param retailInvoiceManualDecision
     */
    public void setRetailInvoiceManualDecision(java.lang.Boolean retailInvoiceManualDecision) {
        this.retailInvoiceManualDecision = retailInvoiceManualDecision;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckCreditResponseBody)) return false;
        CheckCreditResponseBody other = (CheckCreditResponseBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.applicationId==null && other.getApplicationId()==null) || 
             (this.applicationId!=null &&
              this.applicationId.equals(other.getApplicationId()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.systemDecision==null && other.getSystemDecision()==null) || 
             (this.systemDecision!=null &&
              this.systemDecision.equals(other.getSystemDecision()))) &&
            ((this.finalDecision==null && other.getFinalDecision()==null) || 
             (this.finalDecision!=null &&
              this.finalDecision.equals(other.getFinalDecision()))) &&
            ((this.statusMessage==null && other.getStatusMessage()==null) || 
             (this.statusMessage!=null &&
              this.statusMessage.equals(other.getStatusMessage()))) &&
            ((this.upfrontPayment==null && other.getUpfrontPayment()==null) || 
             (this.upfrontPayment!=null &&
              this.upfrontPayment.equals(other.getUpfrontPayment()))) &&
            ((this.upfrontPaymentManualDecision==null && other.getUpfrontPaymentManualDecision()==null) || 
             (this.upfrontPaymentManualDecision!=null &&
              this.upfrontPaymentManualDecision.equals(other.getUpfrontPaymentManualDecision()))) &&
            ((this.depositManualDecision==null && other.getDepositManualDecision()==null) || 
             (this.depositManualDecision!=null &&
              this.depositManualDecision.equals(other.getDepositManualDecision()))) &&
            ((this.retailInvoiceSystemDecision==null && other.getRetailInvoiceSystemDecision()==null) || 
             (this.retailInvoiceSystemDecision!=null &&
              this.retailInvoiceSystemDecision.equals(other.getRetailInvoiceSystemDecision()))) &&
            ((this.retailInvoiceManualDecision==null && other.getRetailInvoiceManualDecision()==null) || 
             (this.retailInvoiceManualDecision!=null &&
              this.retailInvoiceManualDecision.equals(other.getRetailInvoiceManualDecision())));
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
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getApplicationId() != null) {
            _hashCode += getApplicationId().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getSystemDecision() != null) {
            _hashCode += getSystemDecision().hashCode();
        }
        if (getFinalDecision() != null) {
            _hashCode += getFinalDecision().hashCode();
        }
        if (getStatusMessage() != null) {
            _hashCode += getStatusMessage().hashCode();
        }
        if (getUpfrontPayment() != null) {
            _hashCode += getUpfrontPayment().hashCode();
        }
        if (getUpfrontPaymentManualDecision() != null) {
            _hashCode += getUpfrontPaymentManualDecision().hashCode();
        }
        if (getDepositManualDecision() != null) {
            _hashCode += getDepositManualDecision().hashCode();
        }
        if (getRetailInvoiceSystemDecision() != null) {
            _hashCode += getRetailInvoiceSystemDecision().hashCode();
        }
        if (getRetailInvoiceManualDecision() != null) {
            _hashCode += getRetailInvoiceManualDecision().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckCreditResponseBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "checkCreditResponseBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemDecision");
        elemField.setXmlName(new javax.xml.namespace.QName("", "systemDecision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalDecision");
        elemField.setXmlName(new javax.xml.namespace.QName("", "finalDecision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upfrontPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "upfrontPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upfrontPaymentManualDecision");
        elemField.setXmlName(new javax.xml.namespace.QName("", "upfrontPaymentManualDecision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositManualDecision");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositManualDecision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retailInvoiceSystemDecision");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retailInvoiceSystemDecision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retailInvoiceManualDecision");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retailInvoiceManualDecision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
