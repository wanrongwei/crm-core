/**
 * DoQueryAgentBalanceReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class DoQueryAgentBalanceReq  implements java.io.Serializable {
    private java.lang.String outerAcctId;

    private java.lang.Long acctId;

    private java.lang.String pocketItems;

    private java.lang.Long resourceId;

    private java.lang.Integer ownerType;

    private java.lang.Short calFeeFlag;

    private java.lang.Short negativeFlag;

    private java.lang.Short billType;

    private java.lang.Short statusFlag;

    public DoQueryAgentBalanceReq() {
    }

    public DoQueryAgentBalanceReq(
           java.lang.String outerAcctId,
           java.lang.Long acctId,
           java.lang.String pocketItems,
           java.lang.Long resourceId,
           java.lang.Integer ownerType,
           java.lang.Short calFeeFlag,
           java.lang.Short negativeFlag,
           java.lang.Short billType,
           java.lang.Short statusFlag) {
           this.outerAcctId = outerAcctId;
           this.acctId = acctId;
           this.pocketItems = pocketItems;
           this.resourceId = resourceId;
           this.ownerType = ownerType;
           this.calFeeFlag = calFeeFlag;
           this.negativeFlag = negativeFlag;
           this.billType = billType;
           this.statusFlag = statusFlag;
    }


    /**
     * Gets the outerAcctId value for this DoQueryAgentBalanceReq.
     * 
     * @return outerAcctId
     */
    public java.lang.String getOuterAcctId() {
        return outerAcctId;
    }


    /**
     * Sets the outerAcctId value for this DoQueryAgentBalanceReq.
     * 
     * @param outerAcctId
     */
    public void setOuterAcctId(java.lang.String outerAcctId) {
        this.outerAcctId = outerAcctId;
    }


    /**
     * Gets the acctId value for this DoQueryAgentBalanceReq.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this DoQueryAgentBalanceReq.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the pocketItems value for this DoQueryAgentBalanceReq.
     * 
     * @return pocketItems
     */
    public java.lang.String getPocketItems() {
        return pocketItems;
    }


    /**
     * Sets the pocketItems value for this DoQueryAgentBalanceReq.
     * 
     * @param pocketItems
     */
    public void setPocketItems(java.lang.String pocketItems) {
        this.pocketItems = pocketItems;
    }


    /**
     * Gets the resourceId value for this DoQueryAgentBalanceReq.
     * 
     * @return resourceId
     */
    public java.lang.Long getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this DoQueryAgentBalanceReq.
     * 
     * @param resourceId
     */
    public void setResourceId(java.lang.Long resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * Gets the ownerType value for this DoQueryAgentBalanceReq.
     * 
     * @return ownerType
     */
    public java.lang.Integer getOwnerType() {
        return ownerType;
    }


    /**
     * Sets the ownerType value for this DoQueryAgentBalanceReq.
     * 
     * @param ownerType
     */
    public void setOwnerType(java.lang.Integer ownerType) {
        this.ownerType = ownerType;
    }


    /**
     * Gets the calFeeFlag value for this DoQueryAgentBalanceReq.
     * 
     * @return calFeeFlag
     */
    public java.lang.Short getCalFeeFlag() {
        return calFeeFlag;
    }


    /**
     * Sets the calFeeFlag value for this DoQueryAgentBalanceReq.
     * 
     * @param calFeeFlag
     */
    public void setCalFeeFlag(java.lang.Short calFeeFlag) {
        this.calFeeFlag = calFeeFlag;
    }


    /**
     * Gets the negativeFlag value for this DoQueryAgentBalanceReq.
     * 
     * @return negativeFlag
     */
    public java.lang.Short getNegativeFlag() {
        return negativeFlag;
    }


    /**
     * Sets the negativeFlag value for this DoQueryAgentBalanceReq.
     * 
     * @param negativeFlag
     */
    public void setNegativeFlag(java.lang.Short negativeFlag) {
        this.negativeFlag = negativeFlag;
    }


    /**
     * Gets the billType value for this DoQueryAgentBalanceReq.
     * 
     * @return billType
     */
    public java.lang.Short getBillType() {
        return billType;
    }


    /**
     * Sets the billType value for this DoQueryAgentBalanceReq.
     * 
     * @param billType
     */
    public void setBillType(java.lang.Short billType) {
        this.billType = billType;
    }


    /**
     * Gets the statusFlag value for this DoQueryAgentBalanceReq.
     * 
     * @return statusFlag
     */
    public java.lang.Short getStatusFlag() {
        return statusFlag;
    }


    /**
     * Sets the statusFlag value for this DoQueryAgentBalanceReq.
     * 
     * @param statusFlag
     */
    public void setStatusFlag(java.lang.Short statusFlag) {
        this.statusFlag = statusFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryAgentBalanceReq)) return false;
        DoQueryAgentBalanceReq other = (DoQueryAgentBalanceReq) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.outerAcctId==null && other.getOuterAcctId()==null) || 
             (this.outerAcctId!=null &&
              this.outerAcctId.equals(other.getOuterAcctId()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.pocketItems==null && other.getPocketItems()==null) || 
             (this.pocketItems!=null &&
              this.pocketItems.equals(other.getPocketItems()))) &&
            ((this.resourceId==null && other.getResourceId()==null) || 
             (this.resourceId!=null &&
              this.resourceId.equals(other.getResourceId()))) &&
            ((this.ownerType==null && other.getOwnerType()==null) || 
             (this.ownerType!=null &&
              this.ownerType.equals(other.getOwnerType()))) &&
            ((this.calFeeFlag==null && other.getCalFeeFlag()==null) || 
             (this.calFeeFlag!=null &&
              this.calFeeFlag.equals(other.getCalFeeFlag()))) &&
            ((this.negativeFlag==null && other.getNegativeFlag()==null) || 
             (this.negativeFlag!=null &&
              this.negativeFlag.equals(other.getNegativeFlag()))) &&
            ((this.billType==null && other.getBillType()==null) || 
             (this.billType!=null &&
              this.billType.equals(other.getBillType()))) &&
            ((this.statusFlag==null && other.getStatusFlag()==null) || 
             (this.statusFlag!=null &&
              this.statusFlag.equals(other.getStatusFlag())));
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
        if (getOuterAcctId() != null) {
            _hashCode += getOuterAcctId().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getPocketItems() != null) {
            _hashCode += getPocketItems().hashCode();
        }
        if (getResourceId() != null) {
            _hashCode += getResourceId().hashCode();
        }
        if (getOwnerType() != null) {
            _hashCode += getOwnerType().hashCode();
        }
        if (getCalFeeFlag() != null) {
            _hashCode += getCalFeeFlag().hashCode();
        }
        if (getNegativeFlag() != null) {
            _hashCode += getNegativeFlag().hashCode();
        }
        if (getBillType() != null) {
            _hashCode += getBillType().hashCode();
        }
        if (getStatusFlag() != null) {
            _hashCode += getStatusFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoQueryAgentBalanceReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryAgentBalanceReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outerAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pocketItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pocketItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calFeeFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calFeeFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negativeFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "negativeFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
