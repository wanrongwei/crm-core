/**
 * SUserLifecycle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsqueryservice;

public class SUserLifecycle  implements java.io.Serializable {
    private java.lang.Long userId;

    private java.lang.Integer sts;

    private java.lang.Integer osSts;

    private java.lang.Integer fraudFlag;

    private java.lang.Integer reratingFlag;

    private java.lang.Integer unbillingFlag;

    private java.lang.Integer userRequestFlag;

    private java.lang.String validDate;

    private java.lang.String expireDate;

    private java.lang.String createDate;

    public SUserLifecycle() {
    }

    public SUserLifecycle(
           java.lang.Long userId,
           java.lang.Integer sts,
           java.lang.Integer osSts,
           java.lang.Integer fraudFlag,
           java.lang.Integer reratingFlag,
           java.lang.Integer unbillingFlag,
           java.lang.Integer userRequestFlag,
           java.lang.String validDate,
           java.lang.String expireDate,
           java.lang.String createDate) {
           this.userId = userId;
           this.sts = sts;
           this.osSts = osSts;
           this.fraudFlag = fraudFlag;
           this.reratingFlag = reratingFlag;
           this.unbillingFlag = unbillingFlag;
           this.userRequestFlag = userRequestFlag;
           this.validDate = validDate;
           this.expireDate = expireDate;
           this.createDate = createDate;
    }


    /**
     * Gets the userId value for this SUserLifecycle.
     * 
     * @return userId
     */
    public java.lang.Long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this SUserLifecycle.
     * 
     * @param userId
     */
    public void setUserId(java.lang.Long userId) {
        this.userId = userId;
    }


    /**
     * Gets the sts value for this SUserLifecycle.
     * 
     * @return sts
     */
    public java.lang.Integer getSts() {
        return sts;
    }


    /**
     * Sets the sts value for this SUserLifecycle.
     * 
     * @param sts
     */
    public void setSts(java.lang.Integer sts) {
        this.sts = sts;
    }


    /**
     * Gets the osSts value for this SUserLifecycle.
     * 
     * @return osSts
     */
    public java.lang.Integer getOsSts() {
        return osSts;
    }


    /**
     * Sets the osSts value for this SUserLifecycle.
     * 
     * @param osSts
     */
    public void setOsSts(java.lang.Integer osSts) {
        this.osSts = osSts;
    }


    /**
     * Gets the fraudFlag value for this SUserLifecycle.
     * 
     * @return fraudFlag
     */
    public java.lang.Integer getFraudFlag() {
        return fraudFlag;
    }


    /**
     * Sets the fraudFlag value for this SUserLifecycle.
     * 
     * @param fraudFlag
     */
    public void setFraudFlag(java.lang.Integer fraudFlag) {
        this.fraudFlag = fraudFlag;
    }


    /**
     * Gets the reratingFlag value for this SUserLifecycle.
     * 
     * @return reratingFlag
     */
    public java.lang.Integer getReratingFlag() {
        return reratingFlag;
    }


    /**
     * Sets the reratingFlag value for this SUserLifecycle.
     * 
     * @param reratingFlag
     */
    public void setReratingFlag(java.lang.Integer reratingFlag) {
        this.reratingFlag = reratingFlag;
    }


    /**
     * Gets the unbillingFlag value for this SUserLifecycle.
     * 
     * @return unbillingFlag
     */
    public java.lang.Integer getUnbillingFlag() {
        return unbillingFlag;
    }


    /**
     * Sets the unbillingFlag value for this SUserLifecycle.
     * 
     * @param unbillingFlag
     */
    public void setUnbillingFlag(java.lang.Integer unbillingFlag) {
        this.unbillingFlag = unbillingFlag;
    }


    /**
     * Gets the userRequestFlag value for this SUserLifecycle.
     * 
     * @return userRequestFlag
     */
    public java.lang.Integer getUserRequestFlag() {
        return userRequestFlag;
    }


    /**
     * Sets the userRequestFlag value for this SUserLifecycle.
     * 
     * @param userRequestFlag
     */
    public void setUserRequestFlag(java.lang.Integer userRequestFlag) {
        this.userRequestFlag = userRequestFlag;
    }


    /**
     * Gets the validDate value for this SUserLifecycle.
     * 
     * @return validDate
     */
    public java.lang.String getValidDate() {
        return validDate;
    }


    /**
     * Sets the validDate value for this SUserLifecycle.
     * 
     * @param validDate
     */
    public void setValidDate(java.lang.String validDate) {
        this.validDate = validDate;
    }


    /**
     * Gets the expireDate value for this SUserLifecycle.
     * 
     * @return expireDate
     */
    public java.lang.String getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this SUserLifecycle.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.lang.String expireDate) {
        this.expireDate = expireDate;
    }


    /**
     * Gets the createDate value for this SUserLifecycle.
     * 
     * @return createDate
     */
    public java.lang.String getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this SUserLifecycle.
     * 
     * @param createDate
     */
    public void setCreateDate(java.lang.String createDate) {
        this.createDate = createDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SUserLifecycle)) return false;
        SUserLifecycle other = (SUserLifecycle) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.sts==null && other.getSts()==null) || 
             (this.sts!=null &&
              this.sts.equals(other.getSts()))) &&
            ((this.osSts==null && other.getOsSts()==null) || 
             (this.osSts!=null &&
              this.osSts.equals(other.getOsSts()))) &&
            ((this.fraudFlag==null && other.getFraudFlag()==null) || 
             (this.fraudFlag!=null &&
              this.fraudFlag.equals(other.getFraudFlag()))) &&
            ((this.reratingFlag==null && other.getReratingFlag()==null) || 
             (this.reratingFlag!=null &&
              this.reratingFlag.equals(other.getReratingFlag()))) &&
            ((this.unbillingFlag==null && other.getUnbillingFlag()==null) || 
             (this.unbillingFlag!=null &&
              this.unbillingFlag.equals(other.getUnbillingFlag()))) &&
            ((this.userRequestFlag==null && other.getUserRequestFlag()==null) || 
             (this.userRequestFlag!=null &&
              this.userRequestFlag.equals(other.getUserRequestFlag()))) &&
            ((this.validDate==null && other.getValidDate()==null) || 
             (this.validDate!=null &&
              this.validDate.equals(other.getValidDate()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate())));
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
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getSts() != null) {
            _hashCode += getSts().hashCode();
        }
        if (getOsSts() != null) {
            _hashCode += getOsSts().hashCode();
        }
        if (getFraudFlag() != null) {
            _hashCode += getFraudFlag().hashCode();
        }
        if (getReratingFlag() != null) {
            _hashCode += getReratingFlag().hashCode();
        }
        if (getUnbillingFlag() != null) {
            _hashCode += getUnbillingFlag().hashCode();
        }
        if (getUserRequestFlag() != null) {
            _hashCode += getUserRequestFlag().hashCode();
        }
        if (getValidDate() != null) {
            _hashCode += getValidDate().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SUserLifecycle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUserLifecycle"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("osSts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "osSts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fraudFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fraudFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reratingFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reratingFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unbillingFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unbillingFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userRequestFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userRequestFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createDate"));
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
