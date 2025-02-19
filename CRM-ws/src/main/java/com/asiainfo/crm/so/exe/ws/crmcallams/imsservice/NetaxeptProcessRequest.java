/**
 * NetaxeptProcessRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsservice;

public class NetaxeptProcessRequest  implements java.io.Serializable {
    private java.lang.String description;

    private java.lang.String operation;

    private java.lang.String subTransactionId;

    private java.lang.String transactionAmount;

    private java.lang.String transactionId;

    private java.lang.String transactionReconRef;

    public NetaxeptProcessRequest() {
    }

    public NetaxeptProcessRequest(
           java.lang.String description,
           java.lang.String operation,
           java.lang.String subTransactionId,
           java.lang.String transactionAmount,
           java.lang.String transactionId,
           java.lang.String transactionReconRef) {
           this.description = description;
           this.operation = operation;
           this.subTransactionId = subTransactionId;
           this.transactionAmount = transactionAmount;
           this.transactionId = transactionId;
           this.transactionReconRef = transactionReconRef;
    }


    /**
     * Gets the description value for this NetaxeptProcessRequest.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this NetaxeptProcessRequest.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the operation value for this NetaxeptProcessRequest.
     * 
     * @return operation
     */
    public java.lang.String getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this NetaxeptProcessRequest.
     * 
     * @param operation
     */
    public void setOperation(java.lang.String operation) {
        this.operation = operation;
    }


    /**
     * Gets the subTransactionId value for this NetaxeptProcessRequest.
     * 
     * @return subTransactionId
     */
    public java.lang.String getSubTransactionId() {
        return subTransactionId;
    }


    /**
     * Sets the subTransactionId value for this NetaxeptProcessRequest.
     * 
     * @param subTransactionId
     */
    public void setSubTransactionId(java.lang.String subTransactionId) {
        this.subTransactionId = subTransactionId;
    }


    /**
     * Gets the transactionAmount value for this NetaxeptProcessRequest.
     * 
     * @return transactionAmount
     */
    public java.lang.String getTransactionAmount() {
        return transactionAmount;
    }


    /**
     * Sets the transactionAmount value for this NetaxeptProcessRequest.
     * 
     * @param transactionAmount
     */
    public void setTransactionAmount(java.lang.String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }


    /**
     * Gets the transactionId value for this NetaxeptProcessRequest.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this NetaxeptProcessRequest.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the transactionReconRef value for this NetaxeptProcessRequest.
     * 
     * @return transactionReconRef
     */
    public java.lang.String getTransactionReconRef() {
        return transactionReconRef;
    }


    /**
     * Sets the transactionReconRef value for this NetaxeptProcessRequest.
     * 
     * @param transactionReconRef
     */
    public void setTransactionReconRef(java.lang.String transactionReconRef) {
        this.transactionReconRef = transactionReconRef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
    	if (obj == null) return false;
        if (!(obj instanceof NetaxeptProcessRequest)) return false;
        NetaxeptProcessRequest other = (NetaxeptProcessRequest) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.operation==null && other.getOperation()==null) || 
             (this.operation!=null &&
              this.operation.equals(other.getOperation()))) &&
            ((this.subTransactionId==null && other.getSubTransactionId()==null) || 
             (this.subTransactionId!=null &&
              this.subTransactionId.equals(other.getSubTransactionId()))) &&
            ((this.transactionAmount==null && other.getTransactionAmount()==null) || 
             (this.transactionAmount!=null &&
              this.transactionAmount.equals(other.getTransactionAmount()))) &&
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getOperation() != null) {
            _hashCode += getOperation().hashCode();
        }
        if (getSubTransactionId() != null) {
            _hashCode += getSubTransactionId().hashCode();
        }
        if (getTransactionAmount() != null) {
            _hashCode += getTransactionAmount().hashCode();
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
        new org.apache.axis.description.TypeDesc(NetaxeptProcessRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "netaxeptProcessRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("transactionAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TransactionAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
