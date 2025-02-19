/**
 * AssetChangeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class AssetChangeInfo  implements java.io.Serializable {
    private java.lang.Double remain_amount;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SAssetInfo[] changeTraces;

    private java.lang.Long base_asset_id;

    private java.lang.Integer field_num;

    private java.util.Calendar so_date;

    private java.lang.Long sonbr;

    private java.lang.String outer_acct_id;

    private java.lang.Long acct_id;

    private java.lang.String phone_id;

    public AssetChangeInfo() {
    }

    public AssetChangeInfo(
           java.lang.Double remain_amount,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SAssetInfo[] changeTraces,
           java.lang.Long base_asset_id,
           java.lang.Integer field_num,
           java.util.Calendar so_date,
           java.lang.Long sonbr,
           java.lang.String outer_acct_id,
           java.lang.Long acct_id,
           java.lang.String phone_id) {
           this.remain_amount = remain_amount;
           this.changeTraces = changeTraces;
           this.base_asset_id = base_asset_id;
           this.field_num = field_num;
           this.so_date = so_date;
           this.sonbr = sonbr;
           this.outer_acct_id = outer_acct_id;
           this.acct_id = acct_id;
           this.phone_id = phone_id;
    }


    /**
     * Gets the remain_amount value for this AssetChangeInfo.
     * 
     * @return remain_amount
     */
    public java.lang.Double getRemain_amount() {
        return remain_amount;
    }


    /**
     * Sets the remain_amount value for this AssetChangeInfo.
     * 
     * @param remain_amount
     */
    public void setRemain_amount(java.lang.Double remain_amount) {
        this.remain_amount = remain_amount;
    }


    /**
     * Gets the changeTraces value for this AssetChangeInfo.
     * 
     * @return changeTraces
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SAssetInfo[] getChangeTraces() {
        return changeTraces;
    }


    /**
     * Sets the changeTraces value for this AssetChangeInfo.
     * 
     * @param changeTraces
     */
    public void setChangeTraces(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SAssetInfo[] changeTraces) {
        this.changeTraces = changeTraces;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SAssetInfo getChangeTraces(int i) {
        return this.changeTraces[i];
    }

    public void setChangeTraces(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SAssetInfo _value) {
        this.changeTraces[i] = _value;
    }


    /**
     * Gets the base_asset_id value for this AssetChangeInfo.
     * 
     * @return base_asset_id
     */
    public java.lang.Long getBase_asset_id() {
        return base_asset_id;
    }


    /**
     * Sets the base_asset_id value for this AssetChangeInfo.
     * 
     * @param base_asset_id
     */
    public void setBase_asset_id(java.lang.Long base_asset_id) {
        this.base_asset_id = base_asset_id;
    }


    /**
     * Gets the field_num value for this AssetChangeInfo.
     * 
     * @return field_num
     */
    public java.lang.Integer getField_num() {
        return field_num;
    }


    /**
     * Sets the field_num value for this AssetChangeInfo.
     * 
     * @param field_num
     */
    public void setField_num(java.lang.Integer field_num) {
        this.field_num = field_num;
    }


    /**
     * Gets the so_date value for this AssetChangeInfo.
     * 
     * @return so_date
     */
    public java.util.Calendar getSo_date() {
        return so_date;
    }


    /**
     * Sets the so_date value for this AssetChangeInfo.
     * 
     * @param so_date
     */
    public void setSo_date(java.util.Calendar so_date) {
        this.so_date = so_date;
    }


    /**
     * Gets the sonbr value for this AssetChangeInfo.
     * 
     * @return sonbr
     */
    public java.lang.Long getSonbr() {
        return sonbr;
    }


    /**
     * Sets the sonbr value for this AssetChangeInfo.
     * 
     * @param sonbr
     */
    public void setSonbr(java.lang.Long sonbr) {
        this.sonbr = sonbr;
    }


    /**
     * Gets the outer_acct_id value for this AssetChangeInfo.
     * 
     * @return outer_acct_id
     */
    public java.lang.String getOuter_acct_id() {
        return outer_acct_id;
    }


    /**
     * Sets the outer_acct_id value for this AssetChangeInfo.
     * 
     * @param outer_acct_id
     */
    public void setOuter_acct_id(java.lang.String outer_acct_id) {
        this.outer_acct_id = outer_acct_id;
    }


    /**
     * Gets the acct_id value for this AssetChangeInfo.
     * 
     * @return acct_id
     */
    public java.lang.Long getAcct_id() {
        return acct_id;
    }


    /**
     * Sets the acct_id value for this AssetChangeInfo.
     * 
     * @param acct_id
     */
    public void setAcct_id(java.lang.Long acct_id) {
        this.acct_id = acct_id;
    }


    /**
     * Gets the phone_id value for this AssetChangeInfo.
     * 
     * @return phone_id
     */
    public java.lang.String getPhone_id() {
        return phone_id;
    }


    /**
     * Sets the phone_id value for this AssetChangeInfo.
     * 
     * @param phone_id
     */
    public void setPhone_id(java.lang.String phone_id) {
        this.phone_id = phone_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AssetChangeInfo)) return false;
        AssetChangeInfo other = (AssetChangeInfo) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.remain_amount==null && other.getRemain_amount()==null) || 
             (this.remain_amount!=null &&
              this.remain_amount.equals(other.getRemain_amount()))) &&
            ((this.changeTraces==null && other.getChangeTraces()==null) || 
             (this.changeTraces!=null &&
              java.util.Arrays.equals(this.changeTraces, other.getChangeTraces()))) &&
            ((this.base_asset_id==null && other.getBase_asset_id()==null) || 
             (this.base_asset_id!=null &&
              this.base_asset_id.equals(other.getBase_asset_id()))) &&
            ((this.field_num==null && other.getField_num()==null) || 
             (this.field_num!=null &&
              this.field_num.equals(other.getField_num()))) &&
            ((this.so_date==null && other.getSo_date()==null) || 
             (this.so_date!=null &&
              this.so_date.equals(other.getSo_date()))) &&
            ((this.sonbr==null && other.getSonbr()==null) || 
             (this.sonbr!=null &&
              this.sonbr.equals(other.getSonbr()))) &&
            ((this.outer_acct_id==null && other.getOuter_acct_id()==null) || 
             (this.outer_acct_id!=null &&
              this.outer_acct_id.equals(other.getOuter_acct_id()))) &&
            ((this.acct_id==null && other.getAcct_id()==null) || 
             (this.acct_id!=null &&
              this.acct_id.equals(other.getAcct_id()))) &&
            ((this.phone_id==null && other.getPhone_id()==null) || 
             (this.phone_id!=null &&
              this.phone_id.equals(other.getPhone_id())));
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
        if (getRemain_amount() != null) {
            _hashCode += getRemain_amount().hashCode();
        }
        if (getChangeTraces() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChangeTraces());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChangeTraces(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBase_asset_id() != null) {
            _hashCode += getBase_asset_id().hashCode();
        }
        if (getField_num() != null) {
            _hashCode += getField_num().hashCode();
        }
        if (getSo_date() != null) {
            _hashCode += getSo_date().hashCode();
        }
        if (getSonbr() != null) {
            _hashCode += getSonbr().hashCode();
        }
        if (getOuter_acct_id() != null) {
            _hashCode += getOuter_acct_id().hashCode();
        }
        if (getAcct_id() != null) {
            _hashCode += getAcct_id().hashCode();
        }
        if (getPhone_id() != null) {
            _hashCode += getPhone_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AssetChangeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "assetChangeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remain_amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remain_amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeTraces");
        elemField.setXmlName(new javax.xml.namespace.QName("", "changeTraces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAssetInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("base_asset_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "base_asset_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("field_num");
        elemField.setXmlName(new javax.xml.namespace.QName("", "field_num"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("so_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "so_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sonbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sonbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outer_acct_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outer_acct_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acct_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acct_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phone_id"));
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
