/**
 * DoOrderProductAuthResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class DoOrderProductAuthResponse  extends com.asiainfo.crm.cm.dk.ws.imsservice.CrmBaseResponse  implements java.io.Serializable {
    private java.lang.Boolean resultFlag;

    private java.lang.Long balanceAccount;

    private java.lang.Boolean exemptFlag;

    private java.lang.Long oneTimeFee;

    private java.lang.Long creditLimit;

    private java.lang.Integer measureId;

    private com.asiainfo.crm.cm.dk.ws.imsservice.SRecurFeeResult[] recurFeeItems;

    public DoOrderProductAuthResponse() {
    }

    public DoOrderProductAuthResponse(
           com.asiainfo.crm.cm.dk.ws.imsservice.ResponseHead responseHead,
           java.lang.Boolean resultFlag,
           java.lang.Long balanceAccount,
           java.lang.Boolean exemptFlag,
           java.lang.Long oneTimeFee,
           java.lang.Long creditLimit,
           java.lang.Integer measureId,
           com.asiainfo.crm.cm.dk.ws.imsservice.SRecurFeeResult[] recurFeeItems) {
        super(
            responseHead);
        this.resultFlag = resultFlag;
        this.balanceAccount = balanceAccount;
        this.exemptFlag = exemptFlag;
        this.oneTimeFee = oneTimeFee;
        this.creditLimit = creditLimit;
        this.measureId = measureId;
        this.recurFeeItems = recurFeeItems;
    }


    /**
     * Gets the resultFlag value for this DoOrderProductAuthResponse.
     * 
     * @return resultFlag
     */
    public java.lang.Boolean getResultFlag() {
        return resultFlag;
    }


    /**
     * Sets the resultFlag value for this DoOrderProductAuthResponse.
     * 
     * @param resultFlag
     */
    public void setResultFlag(java.lang.Boolean resultFlag) {
        this.resultFlag = resultFlag;
    }


    /**
     * Gets the balanceAccount value for this DoOrderProductAuthResponse.
     * 
     * @return balanceAccount
     */
    public java.lang.Long getBalanceAccount() {
        return balanceAccount;
    }


    /**
     * Sets the balanceAccount value for this DoOrderProductAuthResponse.
     * 
     * @param balanceAccount
     */
    public void setBalanceAccount(java.lang.Long balanceAccount) {
        this.balanceAccount = balanceAccount;
    }


    /**
     * Gets the exemptFlag value for this DoOrderProductAuthResponse.
     * 
     * @return exemptFlag
     */
    public java.lang.Boolean getExemptFlag() {
        return exemptFlag;
    }


    /**
     * Sets the exemptFlag value for this DoOrderProductAuthResponse.
     * 
     * @param exemptFlag
     */
    public void setExemptFlag(java.lang.Boolean exemptFlag) {
        this.exemptFlag = exemptFlag;
    }


    /**
     * Gets the oneTimeFee value for this DoOrderProductAuthResponse.
     * 
     * @return oneTimeFee
     */
    public java.lang.Long getOneTimeFee() {
        return oneTimeFee;
    }


    /**
     * Sets the oneTimeFee value for this DoOrderProductAuthResponse.
     * 
     * @param oneTimeFee
     */
    public void setOneTimeFee(java.lang.Long oneTimeFee) {
        this.oneTimeFee = oneTimeFee;
    }


    /**
     * Gets the creditLimit value for this DoOrderProductAuthResponse.
     * 
     * @return creditLimit
     */
    public java.lang.Long getCreditLimit() {
        return creditLimit;
    }


    /**
     * Sets the creditLimit value for this DoOrderProductAuthResponse.
     * 
     * @param creditLimit
     */
    public void setCreditLimit(java.lang.Long creditLimit) {
        this.creditLimit = creditLimit;
    }


    /**
     * Gets the measureId value for this DoOrderProductAuthResponse.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this DoOrderProductAuthResponse.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the recurFeeItems value for this DoOrderProductAuthResponse.
     * 
     * @return recurFeeItems
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.SRecurFeeResult[] getRecurFeeItems() {
        return recurFeeItems;
    }


    /**
     * Sets the recurFeeItems value for this DoOrderProductAuthResponse.
     * 
     * @param recurFeeItems
     */
    public void setRecurFeeItems(com.asiainfo.crm.cm.dk.ws.imsservice.SRecurFeeResult[] recurFeeItems) {
        this.recurFeeItems = recurFeeItems;
    }

    public com.asiainfo.crm.cm.dk.ws.imsservice.SRecurFeeResult getRecurFeeItems(int i) {
        return this.recurFeeItems[i];
    }

    public void setRecurFeeItems(int i, com.asiainfo.crm.cm.dk.ws.imsservice.SRecurFeeResult _value) {
        this.recurFeeItems[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoOrderProductAuthResponse)) return false;
        DoOrderProductAuthResponse other = (DoOrderProductAuthResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.resultFlag==null && other.getResultFlag()==null) || 
             (this.resultFlag!=null &&
              this.resultFlag.equals(other.getResultFlag()))) &&
            ((this.balanceAccount==null && other.getBalanceAccount()==null) || 
             (this.balanceAccount!=null &&
              this.balanceAccount.equals(other.getBalanceAccount()))) &&
            ((this.exemptFlag==null && other.getExemptFlag()==null) || 
             (this.exemptFlag!=null &&
              this.exemptFlag.equals(other.getExemptFlag()))) &&
            ((this.oneTimeFee==null && other.getOneTimeFee()==null) || 
             (this.oneTimeFee!=null &&
              this.oneTimeFee.equals(other.getOneTimeFee()))) &&
            ((this.creditLimit==null && other.getCreditLimit()==null) || 
             (this.creditLimit!=null &&
              this.creditLimit.equals(other.getCreditLimit()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.recurFeeItems==null && other.getRecurFeeItems()==null) || 
             (this.recurFeeItems!=null &&
              java.util.Arrays.equals(this.recurFeeItems, other.getRecurFeeItems())));
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
        if (getResultFlag() != null) {
            _hashCode += getResultFlag().hashCode();
        }
        if (getBalanceAccount() != null) {
            _hashCode += getBalanceAccount().hashCode();
        }
        if (getExemptFlag() != null) {
            _hashCode += getExemptFlag().hashCode();
        }
        if (getOneTimeFee() != null) {
            _hashCode += getOneTimeFee().hashCode();
        }
        if (getCreditLimit() != null) {
            _hashCode += getCreditLimit().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getRecurFeeItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecurFeeItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecurFeeItems(), i);
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
        new org.apache.axis.description.TypeDesc(DoOrderProductAuthResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doOrderProductAuthResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balanceAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exemptFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oneTimeFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oneTimeFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measureId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measureId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurFeeItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recurFeeItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sRecurFeeResult"));
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
