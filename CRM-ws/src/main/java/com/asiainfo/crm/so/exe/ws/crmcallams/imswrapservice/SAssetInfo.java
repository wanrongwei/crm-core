/**
 * SAssetInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SAssetInfo  implements java.io.Serializable {
    private java.lang.Long asset_id;

    private java.lang.Integer asset_item_id;

    private java.util.Calendar valid_date;

    private java.util.Calendar expire_date;

    private java.lang.Long amount;

    private java.lang.Integer status;

    private java.lang.Integer measure_id;

    private java.lang.Integer pocket_type;

    private java.lang.Integer billing_type;

    private java.lang.Long org_amount;

    private java.util.Calendar org_valid_date;

    private java.util.Calendar org_expire_date;

    public SAssetInfo() {
    }

    public SAssetInfo(
           java.lang.Long asset_id,
           java.lang.Integer asset_item_id,
           java.util.Calendar valid_date,
           java.util.Calendar expire_date,
           java.lang.Long amount,
           java.lang.Integer status,
           java.lang.Integer measure_id,
           java.lang.Integer pocket_type,
           java.lang.Integer billing_type,
           java.lang.Long org_amount,
           java.util.Calendar org_valid_date,
           java.util.Calendar org_expire_date) {
           this.asset_id = asset_id;
           this.asset_item_id = asset_item_id;
           this.valid_date = valid_date;
           this.expire_date = expire_date;
           this.amount = amount;
           this.status = status;
           this.measure_id = measure_id;
           this.pocket_type = pocket_type;
           this.billing_type = billing_type;
           this.org_amount = org_amount;
           this.org_valid_date = org_valid_date;
           this.org_expire_date = org_expire_date;
    }


    /**
     * Gets the asset_id value for this SAssetInfo.
     * 
     * @return asset_id
     */
    public java.lang.Long getAsset_id() {
        return asset_id;
    }


    /**
     * Sets the asset_id value for this SAssetInfo.
     * 
     * @param asset_id
     */
    public void setAsset_id(java.lang.Long asset_id) {
        this.asset_id = asset_id;
    }


    /**
     * Gets the asset_item_id value for this SAssetInfo.
     * 
     * @return asset_item_id
     */
    public java.lang.Integer getAsset_item_id() {
        return asset_item_id;
    }


    /**
     * Sets the asset_item_id value for this SAssetInfo.
     * 
     * @param asset_item_id
     */
    public void setAsset_item_id(java.lang.Integer asset_item_id) {
        this.asset_item_id = asset_item_id;
    }


    /**
     * Gets the valid_date value for this SAssetInfo.
     * 
     * @return valid_date
     */
    public java.util.Calendar getValid_date() {
        return valid_date;
    }


    /**
     * Sets the valid_date value for this SAssetInfo.
     * 
     * @param valid_date
     */
    public void setValid_date(java.util.Calendar valid_date) {
        this.valid_date = valid_date;
    }


    /**
     * Gets the expire_date value for this SAssetInfo.
     * 
     * @return expire_date
     */
    public java.util.Calendar getExpire_date() {
        return expire_date;
    }


    /**
     * Sets the expire_date value for this SAssetInfo.
     * 
     * @param expire_date
     */
    public void setExpire_date(java.util.Calendar expire_date) {
        this.expire_date = expire_date;
    }


    /**
     * Gets the amount value for this SAssetInfo.
     * 
     * @return amount
     */
    public java.lang.Long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this SAssetInfo.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }


    /**
     * Gets the status value for this SAssetInfo.
     * 
     * @return status
     */
    public java.lang.Integer getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SAssetInfo.
     * 
     * @param status
     */
    public void setStatus(java.lang.Integer status) {
        this.status = status;
    }


    /**
     * Gets the measure_id value for this SAssetInfo.
     * 
     * @return measure_id
     */
    public java.lang.Integer getMeasure_id() {
        return measure_id;
    }


    /**
     * Sets the measure_id value for this SAssetInfo.
     * 
     * @param measure_id
     */
    public void setMeasure_id(java.lang.Integer measure_id) {
        this.measure_id = measure_id;
    }


    /**
     * Gets the pocket_type value for this SAssetInfo.
     * 
     * @return pocket_type
     */
    public java.lang.Integer getPocket_type() {
        return pocket_type;
    }


    /**
     * Sets the pocket_type value for this SAssetInfo.
     * 
     * @param pocket_type
     */
    public void setPocket_type(java.lang.Integer pocket_type) {
        this.pocket_type = pocket_type;
    }


    /**
     * Gets the billing_type value for this SAssetInfo.
     * 
     * @return billing_type
     */
    public java.lang.Integer getBilling_type() {
        return billing_type;
    }


    /**
     * Sets the billing_type value for this SAssetInfo.
     * 
     * @param billing_type
     */
    public void setBilling_type(java.lang.Integer billing_type) {
        this.billing_type = billing_type;
    }


    /**
     * Gets the org_amount value for this SAssetInfo.
     * 
     * @return org_amount
     */
    public java.lang.Long getOrg_amount() {
        return org_amount;
    }


    /**
     * Sets the org_amount value for this SAssetInfo.
     * 
     * @param org_amount
     */
    public void setOrg_amount(java.lang.Long org_amount) {
        this.org_amount = org_amount;
    }


    /**
     * Gets the org_valid_date value for this SAssetInfo.
     * 
     * @return org_valid_date
     */
    public java.util.Calendar getOrg_valid_date() {
        return org_valid_date;
    }


    /**
     * Sets the org_valid_date value for this SAssetInfo.
     * 
     * @param org_valid_date
     */
    public void setOrg_valid_date(java.util.Calendar org_valid_date) {
        this.org_valid_date = org_valid_date;
    }


    /**
     * Gets the org_expire_date value for this SAssetInfo.
     * 
     * @return org_expire_date
     */
    public java.util.Calendar getOrg_expire_date() {
        return org_expire_date;
    }


    /**
     * Sets the org_expire_date value for this SAssetInfo.
     * 
     * @param org_expire_date
     */
    public void setOrg_expire_date(java.util.Calendar org_expire_date) {
        this.org_expire_date = org_expire_date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SAssetInfo)) return false;
        SAssetInfo other = (SAssetInfo) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.asset_id==null && other.getAsset_id()==null) || 
             (this.asset_id!=null &&
              this.asset_id.equals(other.getAsset_id()))) &&
            ((this.asset_item_id==null && other.getAsset_item_id()==null) || 
             (this.asset_item_id!=null &&
              this.asset_item_id.equals(other.getAsset_item_id()))) &&
            ((this.valid_date==null && other.getValid_date()==null) || 
             (this.valid_date!=null &&
              this.valid_date.equals(other.getValid_date()))) &&
            ((this.expire_date==null && other.getExpire_date()==null) || 
             (this.expire_date!=null &&
              this.expire_date.equals(other.getExpire_date()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.measure_id==null && other.getMeasure_id()==null) || 
             (this.measure_id!=null &&
              this.measure_id.equals(other.getMeasure_id()))) &&
            ((this.pocket_type==null && other.getPocket_type()==null) || 
             (this.pocket_type!=null &&
              this.pocket_type.equals(other.getPocket_type()))) &&
            ((this.billing_type==null && other.getBilling_type()==null) || 
             (this.billing_type!=null &&
              this.billing_type.equals(other.getBilling_type()))) &&
            ((this.org_amount==null && other.getOrg_amount()==null) || 
             (this.org_amount!=null &&
              this.org_amount.equals(other.getOrg_amount()))) &&
            ((this.org_valid_date==null && other.getOrg_valid_date()==null) || 
             (this.org_valid_date!=null &&
              this.org_valid_date.equals(other.getOrg_valid_date()))) &&
            ((this.org_expire_date==null && other.getOrg_expire_date()==null) || 
             (this.org_expire_date!=null &&
              this.org_expire_date.equals(other.getOrg_expire_date())));
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
        if (getAsset_id() != null) {
            _hashCode += getAsset_id().hashCode();
        }
        if (getAsset_item_id() != null) {
            _hashCode += getAsset_item_id().hashCode();
        }
        if (getValid_date() != null) {
            _hashCode += getValid_date().hashCode();
        }
        if (getExpire_date() != null) {
            _hashCode += getExpire_date().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getMeasure_id() != null) {
            _hashCode += getMeasure_id().hashCode();
        }
        if (getPocket_type() != null) {
            _hashCode += getPocket_type().hashCode();
        }
        if (getBilling_type() != null) {
            _hashCode += getBilling_type().hashCode();
        }
        if (getOrg_amount() != null) {
            _hashCode += getOrg_amount().hashCode();
        }
        if (getOrg_valid_date() != null) {
            _hashCode += getOrg_valid_date().hashCode();
        }
        if (getOrg_expire_date() != null) {
            _hashCode += getOrg_expire_date().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SAssetInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAssetInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asset_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "asset_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asset_item_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "asset_item_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valid_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valid_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expire_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expire_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measure_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measure_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pocket_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pocket_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billing_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("org_amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "org_amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("org_valid_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "org_valid_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("org_expire_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "org_expire_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
