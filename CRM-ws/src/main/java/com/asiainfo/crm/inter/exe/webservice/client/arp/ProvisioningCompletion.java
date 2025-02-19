/**
 * ProvisioningCompletion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.arp;


/**
 * Provisioning completion
 */
public class ProvisioningCompletion  implements java.io.Serializable {
    private java.lang.String sender;

    private java.lang.String receiver;

    private java.lang.String subscriptionId;

    private java.lang.String transactionId;

    private java.lang.String provisioningStartTimestamp;

    private java.lang.String provisioningEndTimestamp;

    private com.asiainfo.crm.inter.exe.webservice.client.arp.CompletionCode notificationCode;

    private java.lang.String notificationDescription;

    private java.lang.String bilateralInformation;

    public ProvisioningCompletion() {
    }

    public ProvisioningCompletion(
           java.lang.String sender,
           java.lang.String receiver,
           java.lang.String subscriptionId,
           java.lang.String transactionId,
           java.lang.String provisioningStartTimestamp,
           java.lang.String provisioningEndTimestamp,
           com.asiainfo.crm.inter.exe.webservice.client.arp.CompletionCode notificationCode,
           java.lang.String notificationDescription,
           java.lang.String bilateralInformation) {
           this.sender = sender;
           this.receiver = receiver;
           this.subscriptionId = subscriptionId;
           this.transactionId = transactionId;
           this.provisioningStartTimestamp = provisioningStartTimestamp;
           this.provisioningEndTimestamp = provisioningEndTimestamp;
           this.notificationCode = notificationCode;
           this.notificationDescription = notificationDescription;
           this.bilateralInformation = bilateralInformation;
    }


    /**
     * Gets the sender value for this ProvisioningCompletion.
     * 
     * @return sender
     */
    public java.lang.String getSender() {
        return sender;
    }


    /**
     * Sets the sender value for this ProvisioningCompletion.
     * 
     * @param sender
     */
    public void setSender(java.lang.String sender) {
        this.sender = sender;
    }


    /**
     * Gets the receiver value for this ProvisioningCompletion.
     * 
     * @return receiver
     */
    public java.lang.String getReceiver() {
        return receiver;
    }


    /**
     * Sets the receiver value for this ProvisioningCompletion.
     * 
     * @param receiver
     */
    public void setReceiver(java.lang.String receiver) {
        this.receiver = receiver;
    }


    /**
     * Gets the subscriptionId value for this ProvisioningCompletion.
     * 
     * @return subscriptionId
     */
    public java.lang.String getSubscriptionId() {
        return subscriptionId;
    }


    /**
     * Sets the subscriptionId value for this ProvisioningCompletion.
     * 
     * @param subscriptionId
     */
    public void setSubscriptionId(java.lang.String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }


    /**
     * Gets the transactionId value for this ProvisioningCompletion.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this ProvisioningCompletion.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the provisioningStartTimestamp value for this ProvisioningCompletion.
     * 
     * @return provisioningStartTimestamp
     */
    public java.lang.String getProvisioningStartTimestamp() {
        return provisioningStartTimestamp;
    }


    /**
     * Sets the provisioningStartTimestamp value for this ProvisioningCompletion.
     * 
     * @param provisioningStartTimestamp
     */
    public void setProvisioningStartTimestamp(java.lang.String provisioningStartTimestamp) {
        this.provisioningStartTimestamp = provisioningStartTimestamp;
    }


    /**
     * Gets the provisioningEndTimestamp value for this ProvisioningCompletion.
     * 
     * @return provisioningEndTimestamp
     */
    public java.lang.String getProvisioningEndTimestamp() {
        return provisioningEndTimestamp;
    }


    /**
     * Sets the provisioningEndTimestamp value for this ProvisioningCompletion.
     * 
     * @param provisioningEndTimestamp
     */
    public void setProvisioningEndTimestamp(java.lang.String provisioningEndTimestamp) {
        this.provisioningEndTimestamp = provisioningEndTimestamp;
    }


    /**
     * Gets the notificationCode value for this ProvisioningCompletion.
     * 
     * @return notificationCode
     */
    public com.asiainfo.crm.inter.exe.webservice.client.arp.CompletionCode getNotificationCode() {
        return notificationCode;
    }


    /**
     * Sets the notificationCode value for this ProvisioningCompletion.
     * 
     * @param notificationCode
     */
    public void setNotificationCode(com.asiainfo.crm.inter.exe.webservice.client.arp.CompletionCode notificationCode) {
        this.notificationCode = notificationCode;
    }


    /**
     * Gets the notificationDescription value for this ProvisioningCompletion.
     * 
     * @return notificationDescription
     */
    public java.lang.String getNotificationDescription() {
        return notificationDescription;
    }


    /**
     * Sets the notificationDescription value for this ProvisioningCompletion.
     * 
     * @param notificationDescription
     */
    public void setNotificationDescription(java.lang.String notificationDescription) {
        this.notificationDescription = notificationDescription;
    }


    /**
     * Gets the bilateralInformation value for this ProvisioningCompletion.
     * 
     * @return bilateralInformation
     */
    public java.lang.String getBilateralInformation() {
        return bilateralInformation;
    }


    /**
     * Sets the bilateralInformation value for this ProvisioningCompletion.
     * 
     * @param bilateralInformation
     */
    public void setBilateralInformation(java.lang.String bilateralInformation) {
        this.bilateralInformation = bilateralInformation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProvisioningCompletion)) return false;
        ProvisioningCompletion other = (ProvisioningCompletion) obj;
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
            ((this.subscriptionId==null && other.getSubscriptionId()==null) || 
             (this.subscriptionId!=null &&
              this.subscriptionId.equals(other.getSubscriptionId()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.provisioningStartTimestamp==null && other.getProvisioningStartTimestamp()==null) || 
             (this.provisioningStartTimestamp!=null &&
              this.provisioningStartTimestamp.equals(other.getProvisioningStartTimestamp()))) &&
            ((this.provisioningEndTimestamp==null && other.getProvisioningEndTimestamp()==null) || 
             (this.provisioningEndTimestamp!=null &&
              this.provisioningEndTimestamp.equals(other.getProvisioningEndTimestamp()))) &&
            ((this.notificationCode==null && other.getNotificationCode()==null) || 
             (this.notificationCode!=null &&
              this.notificationCode.equals(other.getNotificationCode()))) &&
            ((this.notificationDescription==null && other.getNotificationDescription()==null) || 
             (this.notificationDescription!=null &&
              this.notificationDescription.equals(other.getNotificationDescription()))) &&
            ((this.bilateralInformation==null && other.getBilateralInformation()==null) || 
             (this.bilateralInformation!=null &&
              this.bilateralInformation.equals(other.getBilateralInformation())));
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
        if (getSubscriptionId() != null) {
            _hashCode += getSubscriptionId().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getProvisioningStartTimestamp() != null) {
            _hashCode += getProvisioningStartTimestamp().hashCode();
        }
        if (getProvisioningEndTimestamp() != null) {
            _hashCode += getProvisioningEndTimestamp().hashCode();
        }
        if (getNotificationCode() != null) {
            _hashCode += getNotificationCode().hashCode();
        }
        if (getNotificationDescription() != null) {
            _hashCode += getNotificationDescription().hashCode();
        }
        if (getBilateralInformation() != null) {
            _hashCode += getBilateralInformation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProvisioningCompletion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "ProvisioningCompletion"));
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
        elemField.setFieldName("subscriptionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "subscriptionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provisioningStartTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "provisioningStartTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provisioningEndTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "provisioningEndTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "notificationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "CompletionCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "notificationDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bilateralInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "bilateralInformation"));
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
