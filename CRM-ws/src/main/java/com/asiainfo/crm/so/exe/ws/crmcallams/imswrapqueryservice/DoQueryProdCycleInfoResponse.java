/**
 * DoQueryProdCycleInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class DoQueryProdCycleInfoResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private java.lang.Integer curProdCycleRestDates;

    private java.lang.Integer curProdCycleTotalDates;

    private java.lang.Integer lastProdCycleRestDates;

    private java.lang.Integer lastProdCycleTotalDates;

    private java.lang.Integer restProdCycleAmount;

    public DoQueryProdCycleInfoResponse() {
    }

    public DoQueryProdCycleInfoResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ResponseHead responseHead,
           java.lang.Integer curProdCycleRestDates,
           java.lang.Integer curProdCycleTotalDates,
           java.lang.Integer lastProdCycleRestDates,
           java.lang.Integer lastProdCycleTotalDates,
           java.lang.Integer restProdCycleAmount) {
        super(
            responseHead);
        this.curProdCycleRestDates = curProdCycleRestDates;
        this.curProdCycleTotalDates = curProdCycleTotalDates;
        this.lastProdCycleRestDates = lastProdCycleRestDates;
        this.lastProdCycleTotalDates = lastProdCycleTotalDates;
        this.restProdCycleAmount = restProdCycleAmount;
    }


    /**
     * Gets the curProdCycleRestDates value for this DoQueryProdCycleInfoResponse.
     * 
     * @return curProdCycleRestDates
     */
    public java.lang.Integer getCurProdCycleRestDates() {
        return curProdCycleRestDates;
    }


    /**
     * Sets the curProdCycleRestDates value for this DoQueryProdCycleInfoResponse.
     * 
     * @param curProdCycleRestDates
     */
    public void setCurProdCycleRestDates(java.lang.Integer curProdCycleRestDates) {
        this.curProdCycleRestDates = curProdCycleRestDates;
    }


    /**
     * Gets the curProdCycleTotalDates value for this DoQueryProdCycleInfoResponse.
     * 
     * @return curProdCycleTotalDates
     */
    public java.lang.Integer getCurProdCycleTotalDates() {
        return curProdCycleTotalDates;
    }


    /**
     * Sets the curProdCycleTotalDates value for this DoQueryProdCycleInfoResponse.
     * 
     * @param curProdCycleTotalDates
     */
    public void setCurProdCycleTotalDates(java.lang.Integer curProdCycleTotalDates) {
        this.curProdCycleTotalDates = curProdCycleTotalDates;
    }


    /**
     * Gets the lastProdCycleRestDates value for this DoQueryProdCycleInfoResponse.
     * 
     * @return lastProdCycleRestDates
     */
    public java.lang.Integer getLastProdCycleRestDates() {
        return lastProdCycleRestDates;
    }


    /**
     * Sets the lastProdCycleRestDates value for this DoQueryProdCycleInfoResponse.
     * 
     * @param lastProdCycleRestDates
     */
    public void setLastProdCycleRestDates(java.lang.Integer lastProdCycleRestDates) {
        this.lastProdCycleRestDates = lastProdCycleRestDates;
    }


    /**
     * Gets the lastProdCycleTotalDates value for this DoQueryProdCycleInfoResponse.
     * 
     * @return lastProdCycleTotalDates
     */
    public java.lang.Integer getLastProdCycleTotalDates() {
        return lastProdCycleTotalDates;
    }


    /**
     * Sets the lastProdCycleTotalDates value for this DoQueryProdCycleInfoResponse.
     * 
     * @param lastProdCycleTotalDates
     */
    public void setLastProdCycleTotalDates(java.lang.Integer lastProdCycleTotalDates) {
        this.lastProdCycleTotalDates = lastProdCycleTotalDates;
    }


    /**
     * Gets the restProdCycleAmount value for this DoQueryProdCycleInfoResponse.
     * 
     * @return restProdCycleAmount
     */
    public java.lang.Integer getRestProdCycleAmount() {
        return restProdCycleAmount;
    }


    /**
     * Sets the restProdCycleAmount value for this DoQueryProdCycleInfoResponse.
     * 
     * @param restProdCycleAmount
     */
    public void setRestProdCycleAmount(java.lang.Integer restProdCycleAmount) {
        this.restProdCycleAmount = restProdCycleAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryProdCycleInfoResponse)) return false;
        DoQueryProdCycleInfoResponse other = (DoQueryProdCycleInfoResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.curProdCycleRestDates==null && other.getCurProdCycleRestDates()==null) || 
             (this.curProdCycleRestDates!=null &&
              this.curProdCycleRestDates.equals(other.getCurProdCycleRestDates()))) &&
            ((this.curProdCycleTotalDates==null && other.getCurProdCycleTotalDates()==null) || 
             (this.curProdCycleTotalDates!=null &&
              this.curProdCycleTotalDates.equals(other.getCurProdCycleTotalDates()))) &&
            ((this.lastProdCycleRestDates==null && other.getLastProdCycleRestDates()==null) || 
             (this.lastProdCycleRestDates!=null &&
              this.lastProdCycleRestDates.equals(other.getLastProdCycleRestDates()))) &&
            ((this.lastProdCycleTotalDates==null && other.getLastProdCycleTotalDates()==null) || 
             (this.lastProdCycleTotalDates!=null &&
              this.lastProdCycleTotalDates.equals(other.getLastProdCycleTotalDates()))) &&
            ((this.restProdCycleAmount==null && other.getRestProdCycleAmount()==null) || 
             (this.restProdCycleAmount!=null &&
              this.restProdCycleAmount.equals(other.getRestProdCycleAmount())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCurProdCycleRestDates() != null) {
            _hashCode += getCurProdCycleRestDates().hashCode();
        }
        if (getCurProdCycleTotalDates() != null) {
            _hashCode += getCurProdCycleTotalDates().hashCode();
        }
        if (getLastProdCycleRestDates() != null) {
            _hashCode += getLastProdCycleRestDates().hashCode();
        }
        if (getLastProdCycleTotalDates() != null) {
            _hashCode += getLastProdCycleTotalDates().hashCode();
        }
        if (getRestProdCycleAmount() != null) {
            _hashCode += getRestProdCycleAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoQueryProdCycleInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryProdCycleInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curProdCycleRestDates");
        elemField.setXmlName(new javax.xml.namespace.QName("", "curProdCycleRestDates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curProdCycleTotalDates");
        elemField.setXmlName(new javax.xml.namespace.QName("", "curProdCycleTotalDates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastProdCycleRestDates");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastProdCycleRestDates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastProdCycleTotalDates");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastProdCycleTotalDates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restProdCycleAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "restProdCycleAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
