/**
 * TransactionLogLine.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsqueryservice;

public class TransactionLogLine  implements java.io.Serializable {
    private java.lang.String amount;

    private java.lang.String batchNumber;

    private java.lang.String creditedAmount;

    private java.util.Calendar dateTime;

    private java.lang.String description;

    private java.lang.String operation;

    private java.lang.String subTransactionId;

    private java.lang.String transactionReconRef;

    public TransactionLogLine() {
    }

    public TransactionLogLine(
           java.lang.String amount,
           java.lang.String batchNumber,
           java.lang.String creditedAmount,
           java.util.Calendar dateTime,
           java.lang.String description,
           java.lang.String operation,
           java.lang.String subTransactionId,
           java.lang.String transactionReconRef) {
           this.amount = amount;
           this.batchNumber = batchNumber;
           this.creditedAmount = creditedAmount;
           this.dateTime = dateTime;
           this.description = description;
           this.operation = operation;
           this.subTransactionId = subTransactionId;
           this.transactionReconRef = transactionReconRef;
    }


    /**
     * Gets the amount value for this TransactionLogLine.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this TransactionLogLine.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the batchNumber value for this TransactionLogLine.
     * 
     * @return batchNumber
     */
    public java.lang.String getBatchNumber() {
        return batchNumber;
    }


    /**
     * Sets the batchNumber value for this TransactionLogLine.
     * 
     * @param batchNumber
     */
    public void setBatchNumber(java.lang.String batchNumber) {
        this.batchNumber = batchNumber;
    }


    /**
     * Gets the creditedAmount value for this TransactionLogLine.
     * 
     * @return creditedAmount
     */
    public java.lang.String getCreditedAmount() {
        return creditedAmount;
    }


    /**
     * Sets the creditedAmount value for this TransactionLogLine.
     * 
     * @param creditedAmount
     */
    public void setCreditedAmount(java.lang.String creditedAmount) {
        this.creditedAmount = creditedAmount;
    }


    /**
     * Gets the dateTime value for this TransactionLogLine.
     * 
     * @return dateTime
     */
    public java.util.Calendar getDateTime() {
        return dateTime;
    }


    /**
     * Sets the dateTime value for this TransactionLogLine.
     * 
     * @param dateTime
     */
    public void setDateTime(java.util.Calendar dateTime) {
        this.dateTime = dateTime;
    }


    /**
     * Gets the description value for this TransactionLogLine.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TransactionLogLine.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the operation value for this TransactionLogLine.
     * 
     * @return operation
     */
    public java.lang.String getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this TransactionLogLine.
     * 
     * @param operation
     */
    public void setOperation(java.lang.String operation) {
        this.operation = operation;
    }


    /**
     * Gets the subTransactionId value for this TransactionLogLine.
     * 
     * @return subTransactionId
     */
    public java.lang.String getSubTransactionId() {
        return subTransactionId;
    }


    /**
     * Sets the subTransactionId value for this TransactionLogLine.
     * 
     * @param subTransactionId
     */
    public void setSubTransactionId(java.lang.String subTransactionId) {
        this.subTransactionId = subTransactionId;
    }


    /**
     * Gets the transactionReconRef value for this TransactionLogLine.
     * 
     * @return transactionReconRef
     */
    public java.lang.String getTransactionReconRef() {
        return transactionReconRef;
    }


    /**
     * Sets the transactionReconRef value for this TransactionLogLine.
     * 
     * @param transactionReconRef
     */
    public void setTransactionReconRef(java.lang.String transactionReconRef) {
        this.transactionReconRef = transactionReconRef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionLogLine)) return false;
        TransactionLogLine other = (TransactionLogLine) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.batchNumber==null && other.getBatchNumber()==null) || 
             (this.batchNumber!=null &&
              this.batchNumber.equals(other.getBatchNumber()))) &&
            ((this.creditedAmount==null && other.getCreditedAmount()==null) || 
             (this.creditedAmount!=null &&
              this.creditedAmount.equals(other.getCreditedAmount()))) &&
            ((this.dateTime==null && other.getDateTime()==null) || 
             (this.dateTime!=null &&
              this.dateTime.equals(other.getDateTime()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.operation==null && other.getOperation()==null) || 
             (this.operation!=null &&
              this.operation.equals(other.getOperation()))) &&
            ((this.subTransactionId==null && other.getSubTransactionId()==null) || 
             (this.subTransactionId!=null &&
              this.subTransactionId.equals(other.getSubTransactionId()))) &&
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getBatchNumber() != null) {
            _hashCode += getBatchNumber().hashCode();
        }
        if (getCreditedAmount() != null) {
            _hashCode += getCreditedAmount().hashCode();
        }
        if (getDateTime() != null) {
            _hashCode += getDateTime().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getOperation() != null) {
            _hashCode += getOperation().hashCode();
        }
        if (getSubTransactionId() != null) {
            _hashCode += getSubTransactionId().hashCode();
        }
        if (getTransactionReconRef() != null) {
            _hashCode += getTransactionReconRef().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionLogLine.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "transactionLogLine"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BatchNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreditedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubTransactionId"));
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
