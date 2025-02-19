/**
 * RequestHead.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class RequestHead  implements java.io.Serializable {
    private java.lang.String appKey;

    private java.lang.String busiCode;

    private java.lang.String transactionID;

    private java.lang.String reqTime;

    private java.lang.String format;

    private java.lang.String sign;

    private java.lang.String accessToken;

    private java.lang.String version;

    private java.lang.String tenantId;

    private java.lang.String acceptProvCode;

    private java.lang.String acceptRegionCode;

    private java.lang.String acceptChannelType;

    private java.lang.String acceptChannelCode;

    private java.lang.String acceptOrgId;

    private java.lang.Integer operatorCode;

    private java.lang.String acceptStaffId;

    private java.lang.String acceptOpId;

    private java.lang.String chargeFlag;

    private java.lang.String notifyFlag;

    public RequestHead() {
    }

    public RequestHead(
           java.lang.String appKey,
           java.lang.String busiCode,
           java.lang.String transactionID,
           java.lang.String reqTime,
           java.lang.String format,
           java.lang.String sign,
           java.lang.String accessToken,
           java.lang.String version,
           java.lang.String tenantId,
           java.lang.String acceptProvCode,
           java.lang.String acceptRegionCode,
           java.lang.String acceptChannelType,
           java.lang.String acceptChannelCode,
           java.lang.String acceptOrgId,
           java.lang.Integer operatorCode,
           java.lang.String acceptStaffId,
           java.lang.String acceptOpId,
           java.lang.String chargeFlag,
           java.lang.String notifyFlag) {
           this.appKey = appKey;
           this.busiCode = busiCode;
           this.transactionID = transactionID;
           this.reqTime = reqTime;
           this.format = format;
           this.sign = sign;
           this.accessToken = accessToken;
           this.version = version;
           this.tenantId = tenantId;
           this.acceptProvCode = acceptProvCode;
           this.acceptRegionCode = acceptRegionCode;
           this.acceptChannelType = acceptChannelType;
           this.acceptChannelCode = acceptChannelCode;
           this.acceptOrgId = acceptOrgId;
           this.operatorCode = operatorCode;
           this.acceptStaffId = acceptStaffId;
           this.acceptOpId = acceptOpId;
           this.chargeFlag = chargeFlag;
           this.notifyFlag = notifyFlag;
    }


    /**
     * Gets the appKey value for this RequestHead.
     * 
     * @return appKey
     */
    public java.lang.String getAppKey() {
        return appKey;
    }


    /**
     * Sets the appKey value for this RequestHead.
     * 
     * @param appKey
     */
    public void setAppKey(java.lang.String appKey) {
        this.appKey = appKey;
    }


    /**
     * Gets the busiCode value for this RequestHead.
     * 
     * @return busiCode
     */
    public java.lang.String getBusiCode() {
        return busiCode;
    }


    /**
     * Sets the busiCode value for this RequestHead.
     * 
     * @param busiCode
     */
    public void setBusiCode(java.lang.String busiCode) {
        this.busiCode = busiCode;
    }


    /**
     * Gets the transactionID value for this RequestHead.
     * 
     * @return transactionID
     */
    public java.lang.String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this RequestHead.
     * 
     * @param transactionID
     */
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the reqTime value for this RequestHead.
     * 
     * @return reqTime
     */
    public java.lang.String getReqTime() {
        return reqTime;
    }


    /**
     * Sets the reqTime value for this RequestHead.
     * 
     * @param reqTime
     */
    public void setReqTime(java.lang.String reqTime) {
        this.reqTime = reqTime;
    }


    /**
     * Gets the format value for this RequestHead.
     * 
     * @return format
     */
    public java.lang.String getFormat() {
        return format;
    }


    /**
     * Sets the format value for this RequestHead.
     * 
     * @param format
     */
    public void setFormat(java.lang.String format) {
        this.format = format;
    }


    /**
     * Gets the sign value for this RequestHead.
     * 
     * @return sign
     */
    public java.lang.String getSign() {
        return sign;
    }


    /**
     * Sets the sign value for this RequestHead.
     * 
     * @param sign
     */
    public void setSign(java.lang.String sign) {
        this.sign = sign;
    }


    /**
     * Gets the accessToken value for this RequestHead.
     * 
     * @return accessToken
     */
    public java.lang.String getAccessToken() {
        return accessToken;
    }


    /**
     * Sets the accessToken value for this RequestHead.
     * 
     * @param accessToken
     */
    public void setAccessToken(java.lang.String accessToken) {
        this.accessToken = accessToken;
    }


    /**
     * Gets the version value for this RequestHead.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this RequestHead.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the tenantId value for this RequestHead.
     * 
     * @return tenantId
     */
    public java.lang.String getTenantId() {
        return tenantId;
    }


    /**
     * Sets the tenantId value for this RequestHead.
     * 
     * @param tenantId
     */
    public void setTenantId(java.lang.String tenantId) {
        this.tenantId = tenantId;
    }


    /**
     * Gets the acceptProvCode value for this RequestHead.
     * 
     * @return acceptProvCode
     */
    public java.lang.String getAcceptProvCode() {
        return acceptProvCode;
    }


    /**
     * Sets the acceptProvCode value for this RequestHead.
     * 
     * @param acceptProvCode
     */
    public void setAcceptProvCode(java.lang.String acceptProvCode) {
        this.acceptProvCode = acceptProvCode;
    }


    /**
     * Gets the acceptRegionCode value for this RequestHead.
     * 
     * @return acceptRegionCode
     */
    public java.lang.String getAcceptRegionCode() {
        return acceptRegionCode;
    }


    /**
     * Sets the acceptRegionCode value for this RequestHead.
     * 
     * @param acceptRegionCode
     */
    public void setAcceptRegionCode(java.lang.String acceptRegionCode) {
        this.acceptRegionCode = acceptRegionCode;
    }


    /**
     * Gets the acceptChannelType value for this RequestHead.
     * 
     * @return acceptChannelType
     */
    public java.lang.String getAcceptChannelType() {
        return acceptChannelType;
    }


    /**
     * Sets the acceptChannelType value for this RequestHead.
     * 
     * @param acceptChannelType
     */
    public void setAcceptChannelType(java.lang.String acceptChannelType) {
        this.acceptChannelType = acceptChannelType;
    }


    /**
     * Gets the acceptChannelCode value for this RequestHead.
     * 
     * @return acceptChannelCode
     */
    public java.lang.String getAcceptChannelCode() {
        return acceptChannelCode;
    }


    /**
     * Sets the acceptChannelCode value for this RequestHead.
     * 
     * @param acceptChannelCode
     */
    public void setAcceptChannelCode(java.lang.String acceptChannelCode) {
        this.acceptChannelCode = acceptChannelCode;
    }


    /**
     * Gets the acceptOrgId value for this RequestHead.
     * 
     * @return acceptOrgId
     */
    public java.lang.String getAcceptOrgId() {
        return acceptOrgId;
    }


    /**
     * Sets the acceptOrgId value for this RequestHead.
     * 
     * @param acceptOrgId
     */
    public void setAcceptOrgId(java.lang.String acceptOrgId) {
        this.acceptOrgId = acceptOrgId;
    }


    /**
     * Gets the operatorCode value for this RequestHead.
     * 
     * @return operatorCode
     */
    public java.lang.Integer getOperatorCode() {
        return operatorCode;
    }


    /**
     * Sets the operatorCode value for this RequestHead.
     * 
     * @param operatorCode
     */
    public void setOperatorCode(java.lang.Integer operatorCode) {
        this.operatorCode = operatorCode;
    }


    /**
     * Gets the acceptStaffId value for this RequestHead.
     * 
     * @return acceptStaffId
     */
    public java.lang.String getAcceptStaffId() {
        return acceptStaffId;
    }


    /**
     * Sets the acceptStaffId value for this RequestHead.
     * 
     * @param acceptStaffId
     */
    public void setAcceptStaffId(java.lang.String acceptStaffId) {
        this.acceptStaffId = acceptStaffId;
    }


    /**
     * Gets the acceptOpId value for this RequestHead.
     * 
     * @return acceptOpId
     */
    public java.lang.String getAcceptOpId() {
        return acceptOpId;
    }


    /**
     * Sets the acceptOpId value for this RequestHead.
     * 
     * @param acceptOpId
     */
    public void setAcceptOpId(java.lang.String acceptOpId) {
        this.acceptOpId = acceptOpId;
    }


    /**
     * Gets the chargeFlag value for this RequestHead.
     * 
     * @return chargeFlag
     */
    public java.lang.String getChargeFlag() {
        return chargeFlag;
    }


    /**
     * Sets the chargeFlag value for this RequestHead.
     * 
     * @param chargeFlag
     */
    public void setChargeFlag(java.lang.String chargeFlag) {
        this.chargeFlag = chargeFlag;
    }


    /**
     * Gets the notifyFlag value for this RequestHead.
     * 
     * @return notifyFlag
     */
    public java.lang.String getNotifyFlag() {
        return notifyFlag;
    }


    /**
     * Sets the notifyFlag value for this RequestHead.
     * 
     * @param notifyFlag
     */
    public void setNotifyFlag(java.lang.String notifyFlag) {
        this.notifyFlag = notifyFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestHead)) return false;
        RequestHead other = (RequestHead) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.appKey==null && other.getAppKey()==null) || 
             (this.appKey!=null &&
              this.appKey.equals(other.getAppKey()))) &&
            ((this.busiCode==null && other.getBusiCode()==null) || 
             (this.busiCode!=null &&
              this.busiCode.equals(other.getBusiCode()))) &&
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID()))) &&
            ((this.reqTime==null && other.getReqTime()==null) || 
             (this.reqTime!=null &&
              this.reqTime.equals(other.getReqTime()))) &&
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            ((this.sign==null && other.getSign()==null) || 
             (this.sign!=null &&
              this.sign.equals(other.getSign()))) &&
            ((this.accessToken==null && other.getAccessToken()==null) || 
             (this.accessToken!=null &&
              this.accessToken.equals(other.getAccessToken()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.tenantId==null && other.getTenantId()==null) || 
             (this.tenantId!=null &&
              this.tenantId.equals(other.getTenantId()))) &&
            ((this.acceptProvCode==null && other.getAcceptProvCode()==null) || 
             (this.acceptProvCode!=null &&
              this.acceptProvCode.equals(other.getAcceptProvCode()))) &&
            ((this.acceptRegionCode==null && other.getAcceptRegionCode()==null) || 
             (this.acceptRegionCode!=null &&
              this.acceptRegionCode.equals(other.getAcceptRegionCode()))) &&
            ((this.acceptChannelType==null && other.getAcceptChannelType()==null) || 
             (this.acceptChannelType!=null &&
              this.acceptChannelType.equals(other.getAcceptChannelType()))) &&
            ((this.acceptChannelCode==null && other.getAcceptChannelCode()==null) || 
             (this.acceptChannelCode!=null &&
              this.acceptChannelCode.equals(other.getAcceptChannelCode()))) &&
            ((this.acceptOrgId==null && other.getAcceptOrgId()==null) || 
             (this.acceptOrgId!=null &&
              this.acceptOrgId.equals(other.getAcceptOrgId()))) &&
            ((this.operatorCode==null && other.getOperatorCode()==null) || 
             (this.operatorCode!=null &&
              this.operatorCode.equals(other.getOperatorCode()))) &&
            ((this.acceptStaffId==null && other.getAcceptStaffId()==null) || 
             (this.acceptStaffId!=null &&
              this.acceptStaffId.equals(other.getAcceptStaffId()))) &&
            ((this.acceptOpId==null && other.getAcceptOpId()==null) || 
             (this.acceptOpId!=null &&
              this.acceptOpId.equals(other.getAcceptOpId()))) &&
            ((this.chargeFlag==null && other.getChargeFlag()==null) || 
             (this.chargeFlag!=null &&
              this.chargeFlag.equals(other.getChargeFlag()))) &&
            ((this.notifyFlag==null && other.getNotifyFlag()==null) || 
             (this.notifyFlag!=null &&
              this.notifyFlag.equals(other.getNotifyFlag())));
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
        if (getAppKey() != null) {
            _hashCode += getAppKey().hashCode();
        }
        if (getBusiCode() != null) {
            _hashCode += getBusiCode().hashCode();
        }
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        if (getReqTime() != null) {
            _hashCode += getReqTime().hashCode();
        }
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        if (getSign() != null) {
            _hashCode += getSign().hashCode();
        }
        if (getAccessToken() != null) {
            _hashCode += getAccessToken().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getTenantId() != null) {
            _hashCode += getTenantId().hashCode();
        }
        if (getAcceptProvCode() != null) {
            _hashCode += getAcceptProvCode().hashCode();
        }
        if (getAcceptRegionCode() != null) {
            _hashCode += getAcceptRegionCode().hashCode();
        }
        if (getAcceptChannelType() != null) {
            _hashCode += getAcceptChannelType().hashCode();
        }
        if (getAcceptChannelCode() != null) {
            _hashCode += getAcceptChannelCode().hashCode();
        }
        if (getAcceptOrgId() != null) {
            _hashCode += getAcceptOrgId().hashCode();
        }
        if (getOperatorCode() != null) {
            _hashCode += getOperatorCode().hashCode();
        }
        if (getAcceptStaffId() != null) {
            _hashCode += getAcceptStaffId().hashCode();
        }
        if (getAcceptOpId() != null) {
            _hashCode += getAcceptOpId().hashCode();
        }
        if (getChargeFlag() != null) {
            _hashCode += getChargeFlag().hashCode();
        }
        if (getNotifyFlag() != null) {
            _hashCode += getNotifyFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestHead.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AppKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("busiCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BusiCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reqTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReqTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Sign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessToken");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AccessToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenantId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TenantId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acceptProvCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AcceptProvCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acceptRegionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AcceptRegionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acceptChannelType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AcceptChannelType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acceptChannelCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AcceptChannelCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acceptOrgId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AcceptOrgId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OperatorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acceptStaffId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AcceptStaffId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acceptOpId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AcceptOpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ChargeFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifyFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NotifyFlag"));
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
