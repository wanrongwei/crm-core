/**
 * SUserPaySplitRel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsservice;

public class SUserPaySplitRel  implements java.io.Serializable {
    private java.lang.Long user_id;

    private java.lang.String phone_id;

    private java.lang.String outer_cust_id;

    private java.lang.Long cust_id;

    private java.lang.String outer_acct_id;

    private java.lang.Long acct_id;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SPaySplitInfo[] sPaySplitInfoList;

    private java.lang.Long product_sequence_id;

    private java.lang.Short oper_type;

    private java.lang.Short split_type;

    private java.lang.Long price_rule_id;

    public SUserPaySplitRel() {
    }

    public SUserPaySplitRel(
           java.lang.Long user_id,
           java.lang.String phone_id,
           java.lang.String outer_cust_id,
           java.lang.Long cust_id,
           java.lang.String outer_acct_id,
           java.lang.Long acct_id,
           com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SPaySplitInfo[] sPaySplitInfoList,
           java.lang.Long product_sequence_id,
           java.lang.Short oper_type,
           java.lang.Short split_type,
           java.lang.Long price_rule_id) {
           this.user_id = user_id;
           this.phone_id = phone_id;
           this.outer_cust_id = outer_cust_id;
           this.cust_id = cust_id;
           this.outer_acct_id = outer_acct_id;
           this.acct_id = acct_id;
           this.sPaySplitInfoList = sPaySplitInfoList;
           this.product_sequence_id = product_sequence_id;
           this.oper_type = oper_type;
           this.split_type = split_type;
           this.price_rule_id = price_rule_id;
    }


    /**
     * Gets the user_id value for this SUserPaySplitRel.
     * 
     * @return user_id
     */
    public java.lang.Long getUser_id() {
        return user_id;
    }


    /**
     * Sets the user_id value for this SUserPaySplitRel.
     * 
     * @param user_id
     */
    public void setUser_id(java.lang.Long user_id) {
        this.user_id = user_id;
    }


    /**
     * Gets the phone_id value for this SUserPaySplitRel.
     * 
     * @return phone_id
     */
    public java.lang.String getPhone_id() {
        return phone_id;
    }


    /**
     * Sets the phone_id value for this SUserPaySplitRel.
     * 
     * @param phone_id
     */
    public void setPhone_id(java.lang.String phone_id) {
        this.phone_id = phone_id;
    }


    /**
     * Gets the outer_cust_id value for this SUserPaySplitRel.
     * 
     * @return outer_cust_id
     */
    public java.lang.String getOuter_cust_id() {
        return outer_cust_id;
    }


    /**
     * Sets the outer_cust_id value for this SUserPaySplitRel.
     * 
     * @param outer_cust_id
     */
    public void setOuter_cust_id(java.lang.String outer_cust_id) {
        this.outer_cust_id = outer_cust_id;
    }


    /**
     * Gets the cust_id value for this SUserPaySplitRel.
     * 
     * @return cust_id
     */
    public java.lang.Long getCust_id() {
        return cust_id;
    }


    /**
     * Sets the cust_id value for this SUserPaySplitRel.
     * 
     * @param cust_id
     */
    public void setCust_id(java.lang.Long cust_id) {
        this.cust_id = cust_id;
    }


    /**
     * Gets the outer_acct_id value for this SUserPaySplitRel.
     * 
     * @return outer_acct_id
     */
    public java.lang.String getOuter_acct_id() {
        return outer_acct_id;
    }


    /**
     * Sets the outer_acct_id value for this SUserPaySplitRel.
     * 
     * @param outer_acct_id
     */
    public void setOuter_acct_id(java.lang.String outer_acct_id) {
        this.outer_acct_id = outer_acct_id;
    }


    /**
     * Gets the acct_id value for this SUserPaySplitRel.
     * 
     * @return acct_id
     */
    public java.lang.Long getAcct_id() {
        return acct_id;
    }


    /**
     * Sets the acct_id value for this SUserPaySplitRel.
     * 
     * @param acct_id
     */
    public void setAcct_id(java.lang.Long acct_id) {
        this.acct_id = acct_id;
    }


    /**
     * Gets the sPaySplitInfoList value for this SUserPaySplitRel.
     * 
     * @return sPaySplitInfoList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SPaySplitInfo[] getSPaySplitInfoList() {
        return sPaySplitInfoList;
    }


    /**
     * Sets the sPaySplitInfoList value for this SUserPaySplitRel.
     * 
     * @param sPaySplitInfoList
     */
    public void setSPaySplitInfoList(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SPaySplitInfo[] sPaySplitInfoList) {
        this.sPaySplitInfoList = sPaySplitInfoList;
    }


    /**
     * Gets the product_sequence_id value for this SUserPaySplitRel.
     * 
     * @return product_sequence_id
     */
    public java.lang.Long getProduct_sequence_id() {
        return product_sequence_id;
    }


    /**
     * Sets the product_sequence_id value for this SUserPaySplitRel.
     * 
     * @param product_sequence_id
     */
    public void setProduct_sequence_id(java.lang.Long product_sequence_id) {
        this.product_sequence_id = product_sequence_id;
    }


    /**
     * Gets the oper_type value for this SUserPaySplitRel.
     * 
     * @return oper_type
     */
    public java.lang.Short getOper_type() {
        return oper_type;
    }


    /**
     * Sets the oper_type value for this SUserPaySplitRel.
     * 
     * @param oper_type
     */
    public void setOper_type(java.lang.Short oper_type) {
        this.oper_type = oper_type;
    }


    /**
     * Gets the split_type value for this SUserPaySplitRel.
     * 
     * @return split_type
     */
    public java.lang.Short getSplit_type() {
        return split_type;
    }


    /**
     * Sets the split_type value for this SUserPaySplitRel.
     * 
     * @param split_type
     */
    public void setSplit_type(java.lang.Short split_type) {
        this.split_type = split_type;
    }


    /**
     * Gets the price_rule_id value for this SUserPaySplitRel.
     * 
     * @return price_rule_id
     */
    public java.lang.Long getPrice_rule_id() {
        return price_rule_id;
    }


    /**
     * Sets the price_rule_id value for this SUserPaySplitRel.
     * 
     * @param price_rule_id
     */
    public void setPrice_rule_id(java.lang.Long price_rule_id) {
        this.price_rule_id = price_rule_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SUserPaySplitRel)) return false;
        SUserPaySplitRel other = (SUserPaySplitRel) obj;
       
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.user_id==null && other.getUser_id()==null) || 
             (this.user_id!=null &&
              this.user_id.equals(other.getUser_id()))) &&
            ((this.phone_id==null && other.getPhone_id()==null) || 
             (this.phone_id!=null &&
              this.phone_id.equals(other.getPhone_id()))) &&
            ((this.outer_cust_id==null && other.getOuter_cust_id()==null) || 
             (this.outer_cust_id!=null &&
              this.outer_cust_id.equals(other.getOuter_cust_id()))) &&
            ((this.cust_id==null && other.getCust_id()==null) || 
             (this.cust_id!=null &&
              this.cust_id.equals(other.getCust_id()))) &&
            ((this.outer_acct_id==null && other.getOuter_acct_id()==null) || 
             (this.outer_acct_id!=null &&
              this.outer_acct_id.equals(other.getOuter_acct_id()))) &&
            ((this.acct_id==null && other.getAcct_id()==null) || 
             (this.acct_id!=null &&
              this.acct_id.equals(other.getAcct_id()))) &&
            ((this.sPaySplitInfoList==null && other.getSPaySplitInfoList()==null) || 
             (this.sPaySplitInfoList!=null &&
              java.util.Arrays.equals(this.sPaySplitInfoList, other.getSPaySplitInfoList()))) &&
            ((this.product_sequence_id==null && other.getProduct_sequence_id()==null) || 
             (this.product_sequence_id!=null &&
              this.product_sequence_id.equals(other.getProduct_sequence_id()))) &&
            ((this.oper_type==null && other.getOper_type()==null) || 
             (this.oper_type!=null &&
              this.oper_type.equals(other.getOper_type()))) &&
            ((this.split_type==null && other.getSplit_type()==null) || 
             (this.split_type!=null &&
              this.split_type.equals(other.getSplit_type()))) &&
            ((this.price_rule_id==null && other.getPrice_rule_id()==null) || 
             (this.price_rule_id!=null &&
              this.price_rule_id.equals(other.getPrice_rule_id())));
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
        if (getUser_id() != null) {
            _hashCode += getUser_id().hashCode();
        }
        if (getPhone_id() != null) {
            _hashCode += getPhone_id().hashCode();
        }
        if (getOuter_cust_id() != null) {
            _hashCode += getOuter_cust_id().hashCode();
        }
        if (getCust_id() != null) {
            _hashCode += getCust_id().hashCode();
        }
        if (getOuter_acct_id() != null) {
            _hashCode += getOuter_acct_id().hashCode();
        }
        if (getAcct_id() != null) {
            _hashCode += getAcct_id().hashCode();
        }
        if (getSPaySplitInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSPaySplitInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSPaySplitInfoList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProduct_sequence_id() != null) {
            _hashCode += getProduct_sequence_id().hashCode();
        }
        if (getOper_type() != null) {
            _hashCode += getOper_type().hashCode();
        }
        if (getSplit_type() != null) {
            _hashCode += getSplit_type().hashCode();
        }
        if (getPrice_rule_id() != null) {
            _hashCode += getPrice_rule_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SUserPaySplitRel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUserPaySplitRel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_id"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outer_cust_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outer_cust_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cust_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cust_id"));
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
        elemField.setFieldName("SPaySplitInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sPaySplitInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPaySplitInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "splitInfoList_item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product_sequence_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product_sequence_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oper_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oper_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("split_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "split_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price_rule_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "price_rule_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
