/**
 * RequestHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.paymentNets;

import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class RequestHeader  implements java.io.Serializable {
    private String appKey;

    private String transactionID;

    private String reqTime;

    private String format;

    private String sign;

    private String accessToken;

    private String version;

    private String tenantId;

    private String acceptProvCode;

    private String acceptRegionCode;

    private String acceptChannelType;

    private String acceptChannelCode;

    private String acceptOrgId;

    private Integer operatorCode;

    private String acceptStaffId;

    private String acceptOpId;

    private String chargeFlag;

    private String notifyFlag;

    private String dstSysID;

    public RequestHeader() {
    }

    public RequestHeader(
           String appKey,
           String transactionID,
           String reqTime,
           String format,
           String sign,
           String accessToken,
           String version,
           String tenantId,
           String acceptProvCode,
           String acceptRegionCode,
           String acceptChannelType,
           String acceptChannelCode,
           String acceptOrgId,
           Integer operatorCode,
           String acceptStaffId,
           String acceptOpId,
           String chargeFlag,
           String notifyFlag,
           String dstSysID) {
           this.appKey = appKey;
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
           this.dstSysID = dstSysID;
    }


    /**
     * Gets the appKey value for this RequestHeader.
     * 
     * @return appKey
     */
    public String getAppKey() {
        return appKey;
    }


    /**
     * Sets the appKey value for this RequestHeader.
     * 
     * @param appKey
     */
    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }


    /**
     * Gets the transactionID value for this RequestHeader.
     * 
     * @return transactionID
     */
    public String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this RequestHeader.
     * 
     * @param transactionID
     */
    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the reqTime value for this RequestHeader.
     * 
     * @return reqTime
     */
    public String getReqTime() {
        return reqTime;
    }


    /**
     * Sets the reqTime value for this RequestHeader.
     * 
     * @param reqTime
     */
    public void setReqTime(String reqTime) {
        this.reqTime = reqTime;
    }


    /**
     * Gets the format value for this RequestHeader.
     * 
     * @return format
     */
    public String getFormat() {
        return format;
    }


    /**
     * Sets the format value for this RequestHeader.
     * 
     * @param format
     */
    public void setFormat(String format) {
        this.format = format;
    }


    /**
     * Gets the sign value for this RequestHeader.
     * 
     * @return sign
     */
    public String getSign() {
        return sign;
    }


    /**
     * Sets the sign value for this RequestHeader.
     * 
     * @param sign
     */
    public void setSign(String sign) {
        this.sign = sign;
    }


    /**
     * Gets the accessToken value for this RequestHeader.
     * 
     * @return accessToken
     */
    public String getAccessToken() {
        return accessToken;
    }


    /**
     * Sets the accessToken value for this RequestHeader.
     * 
     * @param accessToken
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }


    /**
     * Gets the version value for this RequestHeader.
     * 
     * @return version
     */
    public String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this RequestHeader.
     * 
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }


    /**
     * Gets the tenantId value for this RequestHeader.
     * 
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }


    /**
     * Sets the tenantId value for this RequestHeader.
     * 
     * @param tenantId
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }


    /**
     * Gets the acceptProvCode value for this RequestHeader.
     * 
     * @return acceptProvCode
     */
    public String getAcceptProvCode() {
        return acceptProvCode;
    }


    /**
     * Sets the acceptProvCode value for this RequestHeader.
     * 
     * @param acceptProvCode
     */
    public void setAcceptProvCode(String acceptProvCode) {
        this.acceptProvCode = acceptProvCode;
    }


    /**
     * Gets the acceptRegionCode value for this RequestHeader.
     * 
     * @return acceptRegionCode
     */
    public String getAcceptRegionCode() {
        return acceptRegionCode;
    }


    /**
     * Sets the acceptRegionCode value for this RequestHeader.
     * 
     * @param acceptRegionCode
     */
    public void setAcceptRegionCode(String acceptRegionCode) {
        this.acceptRegionCode = acceptRegionCode;
    }


    /**
     * Gets the acceptChannelType value for this RequestHeader.
     * 
     * @return acceptChannelType
     */
    public String getAcceptChannelType() {
        return acceptChannelType;
    }


    /**
     * Sets the acceptChannelType value for this RequestHeader.
     * 
     * @param acceptChannelType
     */
    public void setAcceptChannelType(String acceptChannelType) {
        this.acceptChannelType = acceptChannelType;
    }


    /**
     * Gets the acceptChannelCode value for this RequestHeader.
     * 
     * @return acceptChannelCode
     */
    public String getAcceptChannelCode() {
        return acceptChannelCode;
    }


    /**
     * Sets the acceptChannelCode value for this RequestHeader.
     * 
     * @param acceptChannelCode
     */
    public void setAcceptChannelCode(String acceptChannelCode) {
        this.acceptChannelCode = acceptChannelCode;
    }


    /**
     * Gets the acceptOrgId value for this RequestHeader.
     * 
     * @return acceptOrgId
     */
    public String getAcceptOrgId() {
        return acceptOrgId;
    }


    /**
     * Sets the acceptOrgId value for this RequestHeader.
     * 
     * @param acceptOrgId
     */
    public void setAcceptOrgId(String acceptOrgId) {
        this.acceptOrgId = acceptOrgId;
    }


    /**
     * Gets the operatorCode value for this RequestHeader.
     * 
     * @return operatorCode
     */
    public Integer getOperatorCode() {
        return operatorCode;
    }


    /**
     * Sets the operatorCode value for this RequestHeader.
     * 
     * @param operatorCode
     */
    public void setOperatorCode(Integer operatorCode) {
        this.operatorCode = operatorCode;
    }


    /**
     * Gets the acceptStaffId value for this RequestHeader.
     * 
     * @return acceptStaffId
     */
    public String getAcceptStaffId() {
        return acceptStaffId;
    }


    /**
     * Sets the acceptStaffId value for this RequestHeader.
     * 
     * @param acceptStaffId
     */
    public void setAcceptStaffId(String acceptStaffId) {
        this.acceptStaffId = acceptStaffId;
    }


    /**
     * Gets the acceptOpId value for this RequestHeader.
     * 
     * @return acceptOpId
     */
    public String getAcceptOpId() {
        return acceptOpId;
    }


    /**
     * Sets the acceptOpId value for this RequestHeader.
     * 
     * @param acceptOpId
     */
    public void setAcceptOpId(String acceptOpId) {
        this.acceptOpId = acceptOpId;
    }


    /**
     * Gets the chargeFlag value for this RequestHeader.
     * 
     * @return chargeFlag
     */
    public String getChargeFlag() {
        return chargeFlag;
    }


    /**
     * Sets the chargeFlag value for this RequestHeader.
     * 
     * @param chargeFlag
     */
    public void setChargeFlag(String chargeFlag) {
        this.chargeFlag = chargeFlag;
    }


    /**
     * Gets the notifyFlag value for this RequestHeader.
     * 
     * @return notifyFlag
     */
    public String getNotifyFlag() {
        return notifyFlag;
    }


    /**
     * Sets the notifyFlag value for this RequestHeader.
     * 
     * @param notifyFlag
     */
    public void setNotifyFlag(String notifyFlag) {
        this.notifyFlag = notifyFlag;
    }


    /**
     * Gets the dstSysID value for this RequestHeader.
     * 
     * @return dstSysID
     */
    public String getDstSysID() {
        return dstSysID;
    }


    /**
     * Sets the dstSysID value for this RequestHeader.
     * 
     * @param dstSysID
     */
    public void setDstSysID(String dstSysID) {
        this.dstSysID = dstSysID;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RequestHeader)) return false;
        RequestHeader other = (RequestHeader) obj;
        if (obj == null) return false;
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
              this.notifyFlag.equals(other.getNotifyFlag()))) &&
            ((this.dstSysID==null && other.getDstSysID()==null) || 
             (this.dstSysID!=null &&
              this.dstSysID.equals(other.getDstSysID())));
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
        if (getDstSysID() != null) {
            _hashCode += getDstSysID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/common", "RequestHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AppKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reqTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReqTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dstSysID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DstSysID"));
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
    public static Serializer getSerializer(
           String mechType, 
           Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static Deserializer getDeserializer(
           String mechType, 
           Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
