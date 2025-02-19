/**
 * SQryBalance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class SQryBalance  implements java.io.Serializable {
    private java.lang.Long acctId;

    private java.lang.Long resourceId;

    private java.lang.Short tableFlag;

    private java.lang.Integer assetItemId;

    private java.lang.Short itemType;

    private java.lang.Long productId;

    private java.lang.Short calculFeeFlag;

    private java.util.Calendar startTime;

    private java.lang.Long groupId;

    private java.lang.Boolean isInner;

    public SQryBalance() {
    }

    public SQryBalance(
           java.lang.Long acctId,
           java.lang.Long resourceId,
           java.lang.Short tableFlag,
           java.lang.Integer assetItemId,
           java.lang.Short itemType,
           java.lang.Long productId,
           java.lang.Short calculFeeFlag,
           java.util.Calendar startTime,
           java.lang.Long groupId,
           java.lang.Boolean isInner) {
           this.acctId = acctId;
           this.resourceId = resourceId;
           this.tableFlag = tableFlag;
           this.assetItemId = assetItemId;
           this.itemType = itemType;
           this.productId = productId;
           this.calculFeeFlag = calculFeeFlag;
           this.startTime = startTime;
           this.groupId = groupId;
           this.isInner = isInner;
    }


    /**
     * Gets the acctId value for this SQryBalance.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SQryBalance.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the resourceId value for this SQryBalance.
     * 
     * @return resourceId
     */
    public java.lang.Long getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this SQryBalance.
     * 
     * @param resourceId
     */
    public void setResourceId(java.lang.Long resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * Gets the tableFlag value for this SQryBalance.
     * 
     * @return tableFlag
     */
    public java.lang.Short getTableFlag() {
        return tableFlag;
    }


    /**
     * Sets the tableFlag value for this SQryBalance.
     * 
     * @param tableFlag
     */
    public void setTableFlag(java.lang.Short tableFlag) {
        this.tableFlag = tableFlag;
    }


    /**
     * Gets the assetItemId value for this SQryBalance.
     * 
     * @return assetItemId
     */
    public java.lang.Integer getAssetItemId() {
        return assetItemId;
    }


    /**
     * Sets the assetItemId value for this SQryBalance.
     * 
     * @param assetItemId
     */
    public void setAssetItemId(java.lang.Integer assetItemId) {
        this.assetItemId = assetItemId;
    }


    /**
     * Gets the itemType value for this SQryBalance.
     * 
     * @return itemType
     */
    public java.lang.Short getItemType() {
        return itemType;
    }


    /**
     * Sets the itemType value for this SQryBalance.
     * 
     * @param itemType
     */
    public void setItemType(java.lang.Short itemType) {
        this.itemType = itemType;
    }


    /**
     * Gets the productId value for this SQryBalance.
     * 
     * @return productId
     */
    public java.lang.Long getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this SQryBalance.
     * 
     * @param productId
     */
    public void setProductId(java.lang.Long productId) {
        this.productId = productId;
    }


    /**
     * Gets the calculFeeFlag value for this SQryBalance.
     * 
     * @return calculFeeFlag
     */
    public java.lang.Short getCalculFeeFlag() {
        return calculFeeFlag;
    }


    /**
     * Sets the calculFeeFlag value for this SQryBalance.
     * 
     * @param calculFeeFlag
     */
    public void setCalculFeeFlag(java.lang.Short calculFeeFlag) {
        this.calculFeeFlag = calculFeeFlag;
    }


    /**
     * Gets the startTime value for this SQryBalance.
     * 
     * @return startTime
     */
    public java.util.Calendar getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this SQryBalance.
     * 
     * @param startTime
     */
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the groupId value for this SQryBalance.
     * 
     * @return groupId
     */
    public java.lang.Long getGroupId() {
        return groupId;
    }


    /**
     * Sets the groupId value for this SQryBalance.
     * 
     * @param groupId
     */
    public void setGroupId(java.lang.Long groupId) {
        this.groupId = groupId;
    }


    /**
     * Gets the isInner value for this SQryBalance.
     * 
     * @return isInner
     */
    public java.lang.Boolean getIsInner() {
        return isInner;
    }


    /**
     * Sets the isInner value for this SQryBalance.
     * 
     * @param isInner
     */
    public void setIsInner(java.lang.Boolean isInner) {
        this.isInner = isInner;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SQryBalance)) return false;
        SQryBalance other = (SQryBalance) obj;
        
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
            ((this.resourceId==null && other.getResourceId()==null) || 
             (this.resourceId!=null &&
              this.resourceId.equals(other.getResourceId()))) &&
            ((this.tableFlag==null && other.getTableFlag()==null) || 
             (this.tableFlag!=null &&
              this.tableFlag.equals(other.getTableFlag()))) &&
            ((this.assetItemId==null && other.getAssetItemId()==null) || 
             (this.assetItemId!=null &&
              this.assetItemId.equals(other.getAssetItemId()))) &&
            ((this.itemType==null && other.getItemType()==null) || 
             (this.itemType!=null &&
              this.itemType.equals(other.getItemType()))) &&
            ((this.productId==null && other.getProductId()==null) || 
             (this.productId!=null &&
              this.productId.equals(other.getProductId()))) &&
            ((this.calculFeeFlag==null && other.getCalculFeeFlag()==null) || 
             (this.calculFeeFlag!=null &&
              this.calculFeeFlag.equals(other.getCalculFeeFlag()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.groupId==null && other.getGroupId()==null) || 
             (this.groupId!=null &&
              this.groupId.equals(other.getGroupId()))) &&
            ((this.isInner==null && other.getIsInner()==null) || 
             (this.isInner!=null &&
              this.isInner.equals(other.getIsInner())));
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
        if (getResourceId() != null) {
            _hashCode += getResourceId().hashCode();
        }
        if (getTableFlag() != null) {
            _hashCode += getTableFlag().hashCode();
        }
        if (getAssetItemId() != null) {
            _hashCode += getAssetItemId().hashCode();
        }
        if (getItemType() != null) {
            _hashCode += getItemType().hashCode();
        }
        if (getProductId() != null) {
            _hashCode += getProductId().hashCode();
        }
        if (getCalculFeeFlag() != null) {
            _hashCode += getCalculFeeFlag().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getGroupId() != null) {
            _hashCode += getGroupId().hashCode();
        }
        if (getIsInner() != null) {
            _hashCode += getIsInner().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SQryBalance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQryBalance"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("tableFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tableFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assetItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calculFeeFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calculFeeFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isInner"));
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
