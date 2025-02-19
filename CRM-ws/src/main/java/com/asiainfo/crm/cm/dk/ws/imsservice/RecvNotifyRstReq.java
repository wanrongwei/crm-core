/**
 * RecvNotifyRstReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class RecvNotifyRstReq  implements java.io.Serializable {
    private java.lang.Long busiModuleId;

    private java.lang.String busiSerialNo;

    private java.lang.String resultCode;

    private java.lang.Integer mediaType;

    private java.lang.String errorMsg;

    public RecvNotifyRstReq() {
    }

    public RecvNotifyRstReq(
           java.lang.Long busiModuleId,
           java.lang.String busiSerialNo,
           java.lang.String resultCode,
           java.lang.Integer mediaType,
           java.lang.String errorMsg) {
           this.busiModuleId = busiModuleId;
           this.busiSerialNo = busiSerialNo;
           this.resultCode = resultCode;
           this.mediaType = mediaType;
           this.errorMsg = errorMsg;
    }


    /**
     * Gets the busiModuleId value for this RecvNotifyRstReq.
     * 
     * @return busiModuleId
     */
    public java.lang.Long getBusiModuleId() {
        return busiModuleId;
    }


    /**
     * Sets the busiModuleId value for this RecvNotifyRstReq.
     * 
     * @param busiModuleId
     */
    public void setBusiModuleId(java.lang.Long busiModuleId) {
        this.busiModuleId = busiModuleId;
    }


    /**
     * Gets the busiSerialNo value for this RecvNotifyRstReq.
     * 
     * @return busiSerialNo
     */
    public java.lang.String getBusiSerialNo() {
        return busiSerialNo;
    }


    /**
     * Sets the busiSerialNo value for this RecvNotifyRstReq.
     * 
     * @param busiSerialNo
     */
    public void setBusiSerialNo(java.lang.String busiSerialNo) {
        this.busiSerialNo = busiSerialNo;
    }


    /**
     * Gets the resultCode value for this RecvNotifyRstReq.
     * 
     * @return resultCode
     */
    public java.lang.String getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this RecvNotifyRstReq.
     * 
     * @param resultCode
     */
    public void setResultCode(java.lang.String resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the mediaType value for this RecvNotifyRstReq.
     * 
     * @return mediaType
     */
    public java.lang.Integer getMediaType() {
        return mediaType;
    }


    /**
     * Sets the mediaType value for this RecvNotifyRstReq.
     * 
     * @param mediaType
     */
    public void setMediaType(java.lang.Integer mediaType) {
        this.mediaType = mediaType;
    }


    /**
     * Gets the errorMsg value for this RecvNotifyRstReq.
     * 
     * @return errorMsg
     */
    public java.lang.String getErrorMsg() {
        return errorMsg;
    }


    /**
     * Sets the errorMsg value for this RecvNotifyRstReq.
     * 
     * @param errorMsg
     */
    public void setErrorMsg(java.lang.String errorMsg) {
        this.errorMsg = errorMsg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecvNotifyRstReq)) return false;
        RecvNotifyRstReq other = (RecvNotifyRstReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.busiModuleId==null && other.getBusiModuleId()==null) || 
             (this.busiModuleId!=null &&
              this.busiModuleId.equals(other.getBusiModuleId()))) &&
            ((this.busiSerialNo==null && other.getBusiSerialNo()==null) || 
             (this.busiSerialNo!=null &&
              this.busiSerialNo.equals(other.getBusiSerialNo()))) &&
            ((this.resultCode==null && other.getResultCode()==null) || 
             (this.resultCode!=null &&
              this.resultCode.equals(other.getResultCode()))) &&
            ((this.mediaType==null && other.getMediaType()==null) || 
             (this.mediaType!=null &&
              this.mediaType.equals(other.getMediaType()))) &&
            ((this.errorMsg==null && other.getErrorMsg()==null) || 
             (this.errorMsg!=null &&
              this.errorMsg.equals(other.getErrorMsg())));
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
        if (getBusiModuleId() != null) {
            _hashCode += getBusiModuleId().hashCode();
        }
        if (getBusiSerialNo() != null) {
            _hashCode += getBusiSerialNo().hashCode();
        }
        if (getResultCode() != null) {
            _hashCode += getResultCode().hashCode();
        }
        if (getMediaType() != null) {
            _hashCode += getMediaType().hashCode();
        }
        if (getErrorMsg() != null) {
            _hashCode += getErrorMsg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecvNotifyRstReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "recvNotifyRstReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("busiModuleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "busiModuleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("busiSerialNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "busiSerialNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mediaType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorMsg"));
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
