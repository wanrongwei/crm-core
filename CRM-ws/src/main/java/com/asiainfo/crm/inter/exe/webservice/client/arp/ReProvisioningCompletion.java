/**
 * ReProvisioningCompletion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.arp;


/**
 * ReProvisioning completion
 */
public class ReProvisioningCompletion  implements java.io.Serializable {
    private java.lang.String sender;

    private java.lang.String receiver;

    private com.asiainfo.crm.inter.exe.webservice.client.arp._interface[] interfaceProvider;

    private java.lang.String subscriptionId;

    private java.lang.String changeStartTimestamp;

    private java.lang.String changeEndTimestamp;

    private com.asiainfo.crm.inter.exe.webservice.client.arp.ArpSignalling arpSignallingStatus;

    private java.lang.String bilateralInformation;

    private java.lang.String transactionId;

    private com.asiainfo.crm.inter.exe.webservice.client.arp.ActivationNotificationCode notificationCode;

    private java.lang.String notificationDescription;

    public ReProvisioningCompletion() {
    }

    public ReProvisioningCompletion(
           java.lang.String sender,
           java.lang.String receiver,
           com.asiainfo.crm.inter.exe.webservice.client.arp._interface[] interfaceProvider,
           java.lang.String subscriptionId,
           java.lang.String changeStartTimestamp,
           java.lang.String changeEndTimestamp,
           com.asiainfo.crm.inter.exe.webservice.client.arp.ArpSignalling arpSignallingStatus,
           java.lang.String bilateralInformation,
           java.lang.String transactionId,
           com.asiainfo.crm.inter.exe.webservice.client.arp.ActivationNotificationCode notificationCode,
           java.lang.String notificationDescription) {
           this.sender = sender;
           this.receiver = receiver;
           this.interfaceProvider = interfaceProvider;
           this.subscriptionId = subscriptionId;
           this.changeStartTimestamp = changeStartTimestamp;
           this.changeEndTimestamp = changeEndTimestamp;
           this.arpSignallingStatus = arpSignallingStatus;
           this.bilateralInformation = bilateralInformation;
           this.transactionId = transactionId;
           this.notificationCode = notificationCode;
           this.notificationDescription = notificationDescription;
    }


    /**
     * Gets the sender value for this ReProvisioningCompletion.
     * 
     * @return sender
     */
    public java.lang.String getSender() {
        return sender;
    }


    /**
     * Sets the sender value for this ReProvisioningCompletion.
     * 
     * @param sender
     */
    public void setSender(java.lang.String sender) {
        this.sender = sender;
    }


    /**
     * Gets the receiver value for this ReProvisioningCompletion.
     * 
     * @return receiver
     */
    public java.lang.String getReceiver() {
        return receiver;
    }


    /**
     * Sets the receiver value for this ReProvisioningCompletion.
     * 
     * @param receiver
     */
    public void setReceiver(java.lang.String receiver) {
        this.receiver = receiver;
    }


    /**
     * Gets the interfaceProvider value for this ReProvisioningCompletion.
     * 
     * @return interfaceProvider
     */
    public com.asiainfo.crm.inter.exe.webservice.client.arp._interface[] getInterfaceProvider() {
        return interfaceProvider;
    }


    /**
     * Sets the interfaceProvider value for this ReProvisioningCompletion.
     * 
     * @param interfaceProvider
     */
    public void setInterfaceProvider(com.asiainfo.crm.inter.exe.webservice.client.arp._interface[] interfaceProvider) {
        this.interfaceProvider = interfaceProvider;
    }


    /**
     * Gets the subscriptionId value for this ReProvisioningCompletion.
     * 
     * @return subscriptionId
     */
    public java.lang.String getSubscriptionId() {
        return subscriptionId;
    }


    /**
     * Sets the subscriptionId value for this ReProvisioningCompletion.
     * 
     * @param subscriptionId
     */
    public void setSubscriptionId(java.lang.String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }


    /**
     * Gets the changeStartTimestamp value for this ReProvisioningCompletion.
     * 
     * @return changeStartTimestamp
     */
    public java.lang.String getChangeStartTimestamp() {
        return changeStartTimestamp;
    }


    /**
     * Sets the changeStartTimestamp value for this ReProvisioningCompletion.
     * 
     * @param changeStartTimestamp
     */
    public void setChangeStartTimestamp(java.lang.String changeStartTimestamp) {
        this.changeStartTimestamp = changeStartTimestamp;
    }


    /**
     * Gets the changeEndTimestamp value for this ReProvisioningCompletion.
     * 
     * @return changeEndTimestamp
     */
    public java.lang.String getChangeEndTimestamp() {
        return changeEndTimestamp;
    }


    /**
     * Sets the changeEndTimestamp value for this ReProvisioningCompletion.
     * 
     * @param changeEndTimestamp
     */
    public void setChangeEndTimestamp(java.lang.String changeEndTimestamp) {
        this.changeEndTimestamp = changeEndTimestamp;
    }


    /**
     * Gets the arpSignallingStatus value for this ReProvisioningCompletion.
     * 
     * @return arpSignallingStatus
     */
    public com.asiainfo.crm.inter.exe.webservice.client.arp.ArpSignalling getArpSignallingStatus() {
        return arpSignallingStatus;
    }


    /**
     * Sets the arpSignallingStatus value for this ReProvisioningCompletion.
     * 
     * @param arpSignallingStatus
     */
    public void setArpSignallingStatus(com.asiainfo.crm.inter.exe.webservice.client.arp.ArpSignalling arpSignallingStatus) {
        this.arpSignallingStatus = arpSignallingStatus;
    }


    /**
     * Gets the bilateralInformation value for this ReProvisioningCompletion.
     * 
     * @return bilateralInformation
     */
    public java.lang.String getBilateralInformation() {
        return bilateralInformation;
    }


    /**
     * Sets the bilateralInformation value for this ReProvisioningCompletion.
     * 
     * @param bilateralInformation
     */
    public void setBilateralInformation(java.lang.String bilateralInformation) {
        this.bilateralInformation = bilateralInformation;
    }


    /**
     * Gets the transactionId value for this ReProvisioningCompletion.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this ReProvisioningCompletion.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the notificationCode value for this ReProvisioningCompletion.
     * 
     * @return notificationCode
     */
    public com.asiainfo.crm.inter.exe.webservice.client.arp.ActivationNotificationCode getNotificationCode() {
        return notificationCode;
    }


    /**
     * Sets the notificationCode value for this ReProvisioningCompletion.
     * 
     * @param notificationCode
     */
    public void setNotificationCode(com.asiainfo.crm.inter.exe.webservice.client.arp.ActivationNotificationCode notificationCode) {
        this.notificationCode = notificationCode;
    }


    /**
     * Gets the notificationDescription value for this ReProvisioningCompletion.
     * 
     * @return notificationDescription
     */
    public java.lang.String getNotificationDescription() {
        return notificationDescription;
    }


    /**
     * Sets the notificationDescription value for this ReProvisioningCompletion.
     * 
     * @param notificationDescription
     */
    public void setNotificationDescription(java.lang.String notificationDescription) {
        this.notificationDescription = notificationDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReProvisioningCompletion)) return false;
        ReProvisioningCompletion other = (ReProvisioningCompletion) obj;
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
            ((this.interfaceProvider==null && other.getInterfaceProvider()==null) || 
             (this.interfaceProvider!=null &&
              java.util.Arrays.equals(this.interfaceProvider, other.getInterfaceProvider()))) &&
            ((this.subscriptionId==null && other.getSubscriptionId()==null) || 
             (this.subscriptionId!=null &&
              this.subscriptionId.equals(other.getSubscriptionId()))) &&
            ((this.changeStartTimestamp==null && other.getChangeStartTimestamp()==null) || 
             (this.changeStartTimestamp!=null &&
              this.changeStartTimestamp.equals(other.getChangeStartTimestamp()))) &&
            ((this.changeEndTimestamp==null && other.getChangeEndTimestamp()==null) || 
             (this.changeEndTimestamp!=null &&
              this.changeEndTimestamp.equals(other.getChangeEndTimestamp()))) &&
            ((this.arpSignallingStatus==null && other.getArpSignallingStatus()==null) || 
             (this.arpSignallingStatus!=null &&
              this.arpSignallingStatus.equals(other.getArpSignallingStatus()))) &&
            ((this.bilateralInformation==null && other.getBilateralInformation()==null) || 
             (this.bilateralInformation!=null &&
              this.bilateralInformation.equals(other.getBilateralInformation()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.notificationCode==null && other.getNotificationCode()==null) || 
             (this.notificationCode!=null &&
              this.notificationCode.equals(other.getNotificationCode()))) &&
            ((this.notificationDescription==null && other.getNotificationDescription()==null) || 
             (this.notificationDescription!=null &&
              this.notificationDescription.equals(other.getNotificationDescription())));
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
        if (getInterfaceProvider() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInterfaceProvider());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInterfaceProvider(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubscriptionId() != null) {
            _hashCode += getSubscriptionId().hashCode();
        }
        if (getChangeStartTimestamp() != null) {
            _hashCode += getChangeStartTimestamp().hashCode();
        }
        if (getChangeEndTimestamp() != null) {
            _hashCode += getChangeEndTimestamp().hashCode();
        }
        if (getArpSignallingStatus() != null) {
            _hashCode += getArpSignallingStatus().hashCode();
        }
        if (getBilateralInformation() != null) {
            _hashCode += getBilateralInformation().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getNotificationCode() != null) {
            _hashCode += getNotificationCode().hashCode();
        }
        if (getNotificationDescription() != null) {
            _hashCode += getNotificationDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReProvisioningCompletion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "ReProvisioningCompletion"));
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
        elemField.setFieldName("interfaceProvider");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "interfaceProvider"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "Interface"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "interface"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "subscriptionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeStartTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "changeStartTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeEndTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "changeEndTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arpSignallingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "arpSignallingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "ArpSignalling"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "notificationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "ActivationNotificationCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oma:wsdl:roamingprovisioning:1", "notificationDescription"));
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
