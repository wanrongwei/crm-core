/**
 * DoQueryAgentDepositReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class DoQueryAgentDepositReq  implements java.io.Serializable {
    private java.lang.Long acctId;

    private java.lang.String outerAcctId;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    private java.lang.Boolean hasSelfDeposit;

    private java.lang.Boolean hasTransferIn;

    private java.lang.Boolean hasTransferOutToAgent;

    private java.lang.Boolean hasTransferOutToUser;

    public DoQueryAgentDepositReq() {
    }

    public DoQueryAgentDepositReq(
           java.lang.Long acctId,
           java.lang.String outerAcctId,
           java.util.Calendar startDate,
           java.util.Calendar endDate,
           java.lang.Boolean hasSelfDeposit,
           java.lang.Boolean hasTransferIn,
           java.lang.Boolean hasTransferOutToAgent,
           java.lang.Boolean hasTransferOutToUser) {
           this.acctId = acctId;
           this.outerAcctId = outerAcctId;
           this.startDate = startDate;
           this.endDate = endDate;
           this.hasSelfDeposit = hasSelfDeposit;
           this.hasTransferIn = hasTransferIn;
           this.hasTransferOutToAgent = hasTransferOutToAgent;
           this.hasTransferOutToUser = hasTransferOutToUser;
    }


    /**
     * Gets the acctId value for this DoQueryAgentDepositReq.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this DoQueryAgentDepositReq.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the outerAcctId value for this DoQueryAgentDepositReq.
     * 
     * @return outerAcctId
     */
    public java.lang.String getOuterAcctId() {
        return outerAcctId;
    }


    /**
     * Sets the outerAcctId value for this DoQueryAgentDepositReq.
     * 
     * @param outerAcctId
     */
    public void setOuterAcctId(java.lang.String outerAcctId) {
        this.outerAcctId = outerAcctId;
    }


    /**
     * Gets the startDate value for this DoQueryAgentDepositReq.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this DoQueryAgentDepositReq.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this DoQueryAgentDepositReq.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this DoQueryAgentDepositReq.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the hasSelfDeposit value for this DoQueryAgentDepositReq.
     * 
     * @return hasSelfDeposit
     */
    public java.lang.Boolean getHasSelfDeposit() {
        return hasSelfDeposit;
    }


    /**
     * Sets the hasSelfDeposit value for this DoQueryAgentDepositReq.
     * 
     * @param hasSelfDeposit
     */
    public void setHasSelfDeposit(java.lang.Boolean hasSelfDeposit) {
        this.hasSelfDeposit = hasSelfDeposit;
    }


    /**
     * Gets the hasTransferIn value for this DoQueryAgentDepositReq.
     * 
     * @return hasTransferIn
     */
    public java.lang.Boolean getHasTransferIn() {
        return hasTransferIn;
    }


    /**
     * Sets the hasTransferIn value for this DoQueryAgentDepositReq.
     * 
     * @param hasTransferIn
     */
    public void setHasTransferIn(java.lang.Boolean hasTransferIn) {
        this.hasTransferIn = hasTransferIn;
    }


    /**
     * Gets the hasTransferOutToAgent value for this DoQueryAgentDepositReq.
     * 
     * @return hasTransferOutToAgent
     */
    public java.lang.Boolean getHasTransferOutToAgent() {
        return hasTransferOutToAgent;
    }


    /**
     * Sets the hasTransferOutToAgent value for this DoQueryAgentDepositReq.
     * 
     * @param hasTransferOutToAgent
     */
    public void setHasTransferOutToAgent(java.lang.Boolean hasTransferOutToAgent) {
        this.hasTransferOutToAgent = hasTransferOutToAgent;
    }


    /**
     * Gets the hasTransferOutToUser value for this DoQueryAgentDepositReq.
     * 
     * @return hasTransferOutToUser
     */
    public java.lang.Boolean getHasTransferOutToUser() {
        return hasTransferOutToUser;
    }


    /**
     * Sets the hasTransferOutToUser value for this DoQueryAgentDepositReq.
     * 
     * @param hasTransferOutToUser
     */
    public void setHasTransferOutToUser(java.lang.Boolean hasTransferOutToUser) {
        this.hasTransferOutToUser = hasTransferOutToUser;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryAgentDepositReq)) return false;
        DoQueryAgentDepositReq other = (DoQueryAgentDepositReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.outerAcctId==null && other.getOuterAcctId()==null) || 
             (this.outerAcctId!=null &&
              this.outerAcctId.equals(other.getOuterAcctId()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.hasSelfDeposit==null && other.getHasSelfDeposit()==null) || 
             (this.hasSelfDeposit!=null &&
              this.hasSelfDeposit.equals(other.getHasSelfDeposit()))) &&
            ((this.hasTransferIn==null && other.getHasTransferIn()==null) || 
             (this.hasTransferIn!=null &&
              this.hasTransferIn.equals(other.getHasTransferIn()))) &&
            ((this.hasTransferOutToAgent==null && other.getHasTransferOutToAgent()==null) || 
             (this.hasTransferOutToAgent!=null &&
              this.hasTransferOutToAgent.equals(other.getHasTransferOutToAgent()))) &&
            ((this.hasTransferOutToUser==null && other.getHasTransferOutToUser()==null) || 
             (this.hasTransferOutToUser!=null &&
              this.hasTransferOutToUser.equals(other.getHasTransferOutToUser())));
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
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getOuterAcctId() != null) {
            _hashCode += getOuterAcctId().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getHasSelfDeposit() != null) {
            _hashCode += getHasSelfDeposit().hashCode();
        }
        if (getHasTransferIn() != null) {
            _hashCode += getHasTransferIn().hashCode();
        }
        if (getHasTransferOutToAgent() != null) {
            _hashCode += getHasTransferOutToAgent().hashCode();
        }
        if (getHasTransferOutToUser() != null) {
            _hashCode += getHasTransferOutToUser().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoQueryAgentDepositReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryAgentDepositReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outerAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasSelfDeposit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasSelfDeposit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasTransferIn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasTransferIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasTransferOutToAgent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasTransferOutToAgent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasTransferOutToUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasTransferOutToUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
