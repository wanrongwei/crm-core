/**
 * PcrfInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsqueryservice;

public class PcrfInfo  implements java.io.Serializable {
    private java.lang.Long subscriberId;

    private java.lang.String imsi;

    private java.lang.String msisdn;

    private java.lang.Integer subscribeStatus;

    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.PccRule[] pccRules;

    public PcrfInfo() {
    }

    public PcrfInfo(
           java.lang.Long subscriberId,
           java.lang.String imsi,
           java.lang.String msisdn,
           java.lang.Integer subscribeStatus,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.PccRule[] pccRules) {
           this.subscriberId = subscriberId;
           this.imsi = imsi;
           this.msisdn = msisdn;
           this.subscribeStatus = subscribeStatus;
           this.pccRules = pccRules;
    }


    /**
     * Gets the subscriberId value for this PcrfInfo.
     * 
     * @return subscriberId
     */
    public java.lang.Long getSubscriberId() {
        return subscriberId;
    }


    /**
     * Sets the subscriberId value for this PcrfInfo.
     * 
     * @param subscriberId
     */
    public void setSubscriberId(java.lang.Long subscriberId) {
        this.subscriberId = subscriberId;
    }


    /**
     * Gets the imsi value for this PcrfInfo.
     * 
     * @return imsi
     */
    public java.lang.String getImsi() {
        return imsi;
    }


    /**
     * Sets the imsi value for this PcrfInfo.
     * 
     * @param imsi
     */
    public void setImsi(java.lang.String imsi) {
        this.imsi = imsi;
    }


    /**
     * Gets the msisdn value for this PcrfInfo.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this PcrfInfo.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the subscribeStatus value for this PcrfInfo.
     * 
     * @return subscribeStatus
     */
    public java.lang.Integer getSubscribeStatus() {
        return subscribeStatus;
    }


    /**
     * Sets the subscribeStatus value for this PcrfInfo.
     * 
     * @param subscribeStatus
     */
    public void setSubscribeStatus(java.lang.Integer subscribeStatus) {
        this.subscribeStatus = subscribeStatus;
    }


    /**
     * Gets the pccRules value for this PcrfInfo.
     * 
     * @return pccRules
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.PccRule[] getPccRules() {
        return pccRules;
    }


    /**
     * Sets the pccRules value for this PcrfInfo.
     * 
     * @param pccRules
     */
    public void setPccRules(com.asiainfo.crm.cm.dk.ws.imsqueryservice.PccRule[] pccRules) {
        this.pccRules = pccRules;
    }

    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.PccRule getPccRules(int i) {
        return this.pccRules[i];
    }

    public void setPccRules(int i, com.asiainfo.crm.cm.dk.ws.imsqueryservice.PccRule _value) {
        this.pccRules[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PcrfInfo)) return false;
        PcrfInfo other = (PcrfInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscriberId==null && other.getSubscriberId()==null) || 
             (this.subscriberId!=null &&
              this.subscriberId.equals(other.getSubscriberId()))) &&
            ((this.imsi==null && other.getImsi()==null) || 
             (this.imsi!=null &&
              this.imsi.equals(other.getImsi()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.subscribeStatus==null && other.getSubscribeStatus()==null) || 
             (this.subscribeStatus!=null &&
              this.subscribeStatus.equals(other.getSubscribeStatus()))) &&
            ((this.pccRules==null && other.getPccRules()==null) || 
             (this.pccRules!=null &&
              java.util.Arrays.equals(this.pccRules, other.getPccRules())));
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
        if (getSubscriberId() != null) {
            _hashCode += getSubscriberId().hashCode();
        }
        if (getImsi() != null) {
            _hashCode += getImsi().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getSubscribeStatus() != null) {
            _hashCode += getSubscribeStatus().hashCode();
        }
        if (getPccRules() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPccRules());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPccRules(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PcrfInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "pcrfInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriberId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imsi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imsi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscribeStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscribeStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pccRules");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pccRules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "pccRule"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
