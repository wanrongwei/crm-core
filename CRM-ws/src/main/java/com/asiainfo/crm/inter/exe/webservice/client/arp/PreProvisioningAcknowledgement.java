/**
 * PreProvisioningAcknowledgement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.arp;


/**
 * Pre-provisioning request acknowledgement
 */
public class PreProvisioningAcknowledgement  implements java.io.Serializable {
    private java.lang.String sender;

    private java.lang.String receiver;

    private java.lang.String requestArrivalTimestamp;

    private java.lang.String subscriptionId;

    private java.lang.String bilateralInformation;

    private java.lang.String transactionId;

    public PreProvisioningAcknowledgement() {
    }

    public PreProvisioningAcknowledgement(
           java.lang.String sender,
           java.lang.String receiver,
           java.lang.String requestArrivalTimestamp,
           java.lang.String subscriptionId,
           java.lang.String bilateralInformation,
           java.lang.String transactionId) {
           this.sender = sender;
           this.receiver = receiver;
           this.requestArrivalTimestamp = requestArrivalTimestamp;
           this.subscriptionId = subscriptionId;
           this.bilateralInformation = bilateralInformation;
           this.transactionId = transactionId;
    }


    /**
     * Gets the sender value for this PreProvisioningAcknowledgement.
     * 
     * @return sender
     */
    public java.lang.String getSender() {
        return sender;
    }


    /**
     * Sets the sender value for this PreProvisioningAcknowledgement.
     * 
     * @param sender
     */
    public void setSender(java.lang.String sender) {
        this.sender = sender;
    }


    /**
     * Gets the receiver value for this PreProvisioningAcknowledgement.
     * 
     * @return receiver
     */
    public java.lang.String getReceiver() {
        return receiver;
    }


    /**
     * Sets the receiver value for this PreProvisioningAcknowledgement.
     * 
     * @param receiver
     */
    public void setReceiver(java.lang.String receiver) {
        this.receiver = receiver;
    }


    /**
     * Gets the requestArrivalTimestamp value for this PreProvisioningAcknowledgement.
     * 
     * @return requestArrivalTimestamp
     */
    public java.lang.String getRequestArrivalTimestamp() {
        return requestArrivalTimestamp;
    }


    /**
     * Sets the requestArrivalTimestamp value for this PreProvisioningAcknowledgement.
     * 
     * @param requestArrivalTimestamp
     */
    public void setRequestArrivalTimestamp(java.lang.String requestArrivalTimestamp) {
        this.requestArrivalTimestamp = requestArrivalTimestamp;
    }


    /**
     * Gets the subscriptionId value for this PreProvisioningAcknowledgement.
     * 
     * @return subscriptionId
     */
    public java.lang.String getSubscriptionId() {
        return subscriptionId;
    }


    /**
     * Sets the subscriptionId value for this PreProvisioningAcknowledgement.
     * 
     * @param subscriptionId
     */
    public void setSubscriptionId(java.lang.String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }


    /**
     * Gets the bilateralInformation value for this PreProvisioningAcknowledgement.
     * 
     * @return bilateralInformation
     */
    public java.lang.String getBilateralInformation() {
        return bilateralInformation;
    }


    /**
     * Sets the bilateralInformation value for this PreProvisioningAcknowledgement.
     * 
     * @param bilateralInformation
     */
    public void setBilateralInformation(java.lang.String bilateralInformation) {
        this.bilateralInformation = bilateralInformation;
    }


    /**
     * Gets the transactionId value for this PreProvisioningAcknowledgement.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this PreProvisioningAcknowledgement.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PreProvisioningAcknowledgement)) return false;
        PreProvisioningAcknowledgement other = (PreProvisioningAcknowledgement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sender==null && other.getSender()==null) || 
             (this.sender!=null &&
              this.sender.equals(other.getSender()))) &&
            ((this.receiver==null && other.getReceiver()==null) || 
             (this.receiver!=null &&
              this.receiver.equals(other.getReceiver()))) &&
            ((this.requestArrivalTimestamp==null && other.getRequestArrivalTimestamp()==null) || 
             (this.requestArrivalTimestamp!=null &&
              this.requestArrivalTimestamp.equals(other.getRequestArrivalTimestamp()))) &&
            ((this.subscriptionId==null && other.getSubscriptionId()==null) || 
             (this.subscriptionId!=null &&
              this.subscriptionId.equals(other.getSubscriptionId()))) &&
            ((this.bilateralInformation==null && other.getBilateralInformation()==null) || 
             (this.bilateralInformation!=null &&
              this.bilateralInformation.equals(other.getBilateralInformation()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId())));
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
        if (getSender() != null) {
            _hashCode += getSender().hashCode();
        }
        if (getReceiver() != null) {
            _hashCode += getReceiver().hashCode();
        }
        if (getRequestArrivalTimestamp() != null) {
            _hashCode += getRequestArrivalTimestamp().hashCode();
        }
        if (getSubscriptionId() != null) {
            _hashCode += getSubscriptionId().hashCode();
        }
        if (getBilateralInformation() != null) {
            _hashCode += getBilateralInformation().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PreProvisioningAcknowledgement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "PreProvisioningAcknowledgement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sender");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "sender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiver");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "receiver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestArrivalTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "requestArrivalTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "subscriptionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bilateralInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "bilateralInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
