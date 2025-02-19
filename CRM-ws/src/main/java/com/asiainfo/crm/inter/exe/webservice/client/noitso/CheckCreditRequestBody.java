/**
 * CheckCreditRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.noitso;

public class CheckCreditRequestBody  implements java.io.Serializable {
    private java.lang.String applicationId;

    private java.lang.String systemId;

    private java.lang.String cpr;

    private java.lang.String cvr;

    private java.lang.String kob;

    private java.lang.Boolean isBlackMailing;

    private java.lang.String b2CCustomerId;

    private java.lang.String b2BCustomerId;

    private java.lang.Integer orderType;

    private com.asiainfo.crm.inter.exe.webservice.client.noitso.PurchaseInformation purchaseInformation;

    private java.lang.String storeId;

    private java.lang.String agent;

    private com.asiainfo.crm.inter.exe.webservice.client.noitso.DeliveryAddress deliveryAddress;

    public CheckCreditRequestBody() {
    }

    public CheckCreditRequestBody(
           java.lang.String applicationId,
           java.lang.String systemId,
           java.lang.String cpr,
           java.lang.String cvr,
           java.lang.String kob,
           java.lang.Boolean isBlackMailing,
           java.lang.String b2CCustomerId,
           java.lang.String b2BCustomerId,
           java.lang.Integer orderType,
           com.asiainfo.crm.inter.exe.webservice.client.noitso.PurchaseInformation purchaseInformation,
           java.lang.String storeId,
           java.lang.String agent,
           com.asiainfo.crm.inter.exe.webservice.client.noitso.DeliveryAddress deliveryAddress) {
           this.applicationId = applicationId;
           this.systemId = systemId;
           this.cpr = cpr;
           this.cvr = cvr;
           this.kob = kob;
           this.isBlackMailing = isBlackMailing;
           this.b2CCustomerId = b2CCustomerId;
           this.b2BCustomerId = b2BCustomerId;
           this.orderType = orderType;
           this.purchaseInformation = purchaseInformation;
           this.storeId = storeId;
           this.agent = agent;
           this.deliveryAddress = deliveryAddress;
    }


    /**
     * Gets the applicationId value for this CheckCreditRequestBody.
     * 
     * @return applicationId
     */
    public java.lang.String getApplicationId() {
        return applicationId;
    }


    /**
     * Sets the applicationId value for this CheckCreditRequestBody.
     * 
     * @param applicationId
     */
    public void setApplicationId(java.lang.String applicationId) {
        this.applicationId = applicationId;
    }


    /**
     * Gets the systemId value for this CheckCreditRequestBody.
     * 
     * @return systemId
     */
    public java.lang.String getSystemId() {
        return systemId;
    }


    /**
     * Sets the systemId value for this CheckCreditRequestBody.
     * 
     * @param systemId
     */
    public void setSystemId(java.lang.String systemId) {
        this.systemId = systemId;
    }


    /**
     * Gets the cpr value for this CheckCreditRequestBody.
     * 
     * @return cpr
     */
    public java.lang.String getCpr() {
        return cpr;
    }


    /**
     * Sets the cpr value for this CheckCreditRequestBody.
     * 
     * @param cpr
     */
    public void setCpr(java.lang.String cpr) {
        this.cpr = cpr;
    }


    /**
     * Gets the cvr value for this CheckCreditRequestBody.
     * 
     * @return cvr
     */
    public java.lang.String getCvr() {
        return cvr;
    }


    /**
     * Sets the cvr value for this CheckCreditRequestBody.
     * 
     * @param cvr
     */
    public void setCvr(java.lang.String cvr) {
        this.cvr = cvr;
    }


    /**
     * Gets the kob value for this CheckCreditRequestBody.
     * 
     * @return kob
     */
    public java.lang.String getKob() {
        return kob;
    }


    /**
     * Sets the kob value for this CheckCreditRequestBody.
     * 
     * @param kob
     */
    public void setKob(java.lang.String kob) {
        this.kob = kob;
    }


    /**
     * Gets the isBlackMailing value for this CheckCreditRequestBody.
     * 
     * @return isBlackMailing
     */
    public java.lang.Boolean getIsBlackMailing() {
        return isBlackMailing;
    }


    /**
     * Sets the isBlackMailing value for this CheckCreditRequestBody.
     * 
     * @param isBlackMailing
     */
    public void setIsBlackMailing(java.lang.Boolean isBlackMailing) {
        this.isBlackMailing = isBlackMailing;
    }


    /**
     * Gets the b2CCustomerId value for this CheckCreditRequestBody.
     * 
     * @return b2CCustomerId
     */
    public java.lang.String getB2CCustomerId() {
        return b2CCustomerId;
    }


    /**
     * Sets the b2CCustomerId value for this CheckCreditRequestBody.
     * 
     * @param b2CCustomerId
     */
    public void setB2CCustomerId(java.lang.String b2CCustomerId) {
        this.b2CCustomerId = b2CCustomerId;
    }


    /**
     * Gets the b2BCustomerId value for this CheckCreditRequestBody.
     * 
     * @return b2BCustomerId
     */
    public java.lang.String getB2BCustomerId() {
        return b2BCustomerId;
    }


    /**
     * Sets the b2BCustomerId value for this CheckCreditRequestBody.
     * 
     * @param b2BCustomerId
     */
    public void setB2BCustomerId(java.lang.String b2BCustomerId) {
        this.b2BCustomerId = b2BCustomerId;
    }


    /**
     * Gets the orderType value for this CheckCreditRequestBody.
     * 
     * @return orderType
     */
    public java.lang.Integer getOrderType() {
        return orderType;
    }


    /**
     * Sets the orderType value for this CheckCreditRequestBody.
     * 
     * @param orderType
     */
    public void setOrderType(java.lang.Integer orderType) {
        this.orderType = orderType;
    }


    /**
     * Gets the purchaseInformation value for this CheckCreditRequestBody.
     * 
     * @return purchaseInformation
     */
    public com.asiainfo.crm.inter.exe.webservice.client.noitso.PurchaseInformation getPurchaseInformation() {
        return purchaseInformation;
    }


    /**
     * Sets the purchaseInformation value for this CheckCreditRequestBody.
     * 
     * @param purchaseInformation
     */
    public void setPurchaseInformation(com.asiainfo.crm.inter.exe.webservice.client.noitso.PurchaseInformation purchaseInformation) {
        this.purchaseInformation = purchaseInformation;
    }


    /**
     * Gets the storeId value for this CheckCreditRequestBody.
     * 
     * @return storeId
     */
    public java.lang.String getStoreId() {
        return storeId;
    }


    /**
     * Sets the storeId value for this CheckCreditRequestBody.
     * 
     * @param storeId
     */
    public void setStoreId(java.lang.String storeId) {
        this.storeId = storeId;
    }


    /**
     * Gets the agent value for this CheckCreditRequestBody.
     * 
     * @return agent
     */
    public java.lang.String getAgent() {
        return agent;
    }


    /**
     * Sets the agent value for this CheckCreditRequestBody.
     * 
     * @param agent
     */
    public void setAgent(java.lang.String agent) {
        this.agent = agent;
    }


    /**
     * Gets the deliveryAddress value for this CheckCreditRequestBody.
     * 
     * @return deliveryAddress
     */
    public com.asiainfo.crm.inter.exe.webservice.client.noitso.DeliveryAddress getDeliveryAddress() {
        return deliveryAddress;
    }


    /**
     * Sets the deliveryAddress value for this CheckCreditRequestBody.
     * 
     * @param deliveryAddress
     */
    public void setDeliveryAddress(com.asiainfo.crm.inter.exe.webservice.client.noitso.DeliveryAddress deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckCreditRequestBody)) return false;
        CheckCreditRequestBody other = (CheckCreditRequestBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.applicationId==null && other.getApplicationId()==null) || 
             (this.applicationId!=null &&
              this.applicationId.equals(other.getApplicationId()))) &&
            ((this.systemId==null && other.getSystemId()==null) || 
             (this.systemId!=null &&
              this.systemId.equals(other.getSystemId()))) &&
            ((this.cpr==null && other.getCpr()==null) || 
             (this.cpr!=null &&
              this.cpr.equals(other.getCpr()))) &&
            ((this.cvr==null && other.getCvr()==null) || 
             (this.cvr!=null &&
              this.cvr.equals(other.getCvr()))) &&
            ((this.kob==null && other.getKob()==null) || 
             (this.kob!=null &&
              this.kob.equals(other.getKob()))) &&
            ((this.isBlackMailing==null && other.getIsBlackMailing()==null) || 
             (this.isBlackMailing!=null &&
              this.isBlackMailing.equals(other.getIsBlackMailing()))) &&
            ((this.b2CCustomerId==null && other.getB2CCustomerId()==null) || 
             (this.b2CCustomerId!=null &&
              this.b2CCustomerId.equals(other.getB2CCustomerId()))) &&
            ((this.b2BCustomerId==null && other.getB2BCustomerId()==null) || 
             (this.b2BCustomerId!=null &&
              this.b2BCustomerId.equals(other.getB2BCustomerId()))) &&
            ((this.orderType==null && other.getOrderType()==null) || 
             (this.orderType!=null &&
              this.orderType.equals(other.getOrderType()))) &&
            ((this.purchaseInformation==null && other.getPurchaseInformation()==null) || 
             (this.purchaseInformation!=null &&
              this.purchaseInformation.equals(other.getPurchaseInformation()))) &&
            ((this.storeId==null && other.getStoreId()==null) || 
             (this.storeId!=null &&
              this.storeId.equals(other.getStoreId()))) &&
            ((this.agent==null && other.getAgent()==null) || 
             (this.agent!=null &&
              this.agent.equals(other.getAgent()))) &&
            ((this.deliveryAddress==null && other.getDeliveryAddress()==null) || 
             (this.deliveryAddress!=null &&
              this.deliveryAddress.equals(other.getDeliveryAddress())));
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
        if (getApplicationId() != null) {
            _hashCode += getApplicationId().hashCode();
        }
        if (getSystemId() != null) {
            _hashCode += getSystemId().hashCode();
        }
        if (getCpr() != null) {
            _hashCode += getCpr().hashCode();
        }
        if (getCvr() != null) {
            _hashCode += getCvr().hashCode();
        }
        if (getKob() != null) {
            _hashCode += getKob().hashCode();
        }
        if (getIsBlackMailing() != null) {
            _hashCode += getIsBlackMailing().hashCode();
        }
        if (getB2CCustomerId() != null) {
            _hashCode += getB2CCustomerId().hashCode();
        }
        if (getB2BCustomerId() != null) {
            _hashCode += getB2BCustomerId().hashCode();
        }
        if (getOrderType() != null) {
            _hashCode += getOrderType().hashCode();
        }
        if (getPurchaseInformation() != null) {
            _hashCode += getPurchaseInformation().hashCode();
        }
        if (getStoreId() != null) {
            _hashCode += getStoreId().hashCode();
        }
        if (getAgent() != null) {
            _hashCode += getAgent().hashCode();
        }
        if (getDeliveryAddress() != null) {
            _hashCode += getDeliveryAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckCreditRequestBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "checkCreditRequestBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "systemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cvr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cvr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kob");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kob"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isBlackMailing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isBlackMailing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("b2CCustomerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "b2cCustomerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("b2BCustomerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "b2bCustomerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "purchaseInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "PurchaseInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "storeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliveryAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "DeliveryAddress"));
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
