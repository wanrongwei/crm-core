/**
 * RenewRegistration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class RenewRegistration  implements java.io.Serializable {
    private java.lang.Long user_id;

    private java.lang.String phone_id;

    private java.lang.Short change_account;

    private java.lang.Short change_promotion_flag;

    private com.asiainfo.crm.cm.dk.ws.imsservice.SProductOrder[] productList;

    private com.asiainfo.crm.cm.dk.ws.imsservice.SAccount account;

    private com.asiainfo.crm.cm.dk.ws.imsservice.SContact[] contactList;

    private com.asiainfo.crm.cm.dk.ws.imsservice.SBalance[] balanceList;

    public RenewRegistration() {
    }

    public RenewRegistration(
           java.lang.Long user_id,
           java.lang.String phone_id,
           java.lang.Short change_account,
           java.lang.Short change_promotion_flag,
           com.asiainfo.crm.cm.dk.ws.imsservice.SProductOrder[] productList,
           com.asiainfo.crm.cm.dk.ws.imsservice.SAccount account,
           com.asiainfo.crm.cm.dk.ws.imsservice.SContact[] contactList,
           com.asiainfo.crm.cm.dk.ws.imsservice.SBalance[] balanceList) {
           this.user_id = user_id;
           this.phone_id = phone_id;
           this.change_account = change_account;
           this.change_promotion_flag = change_promotion_flag;
           this.productList = productList;
           this.account = account;
           this.contactList = contactList;
           this.balanceList = balanceList;
    }


    /**
     * Gets the user_id value for this RenewRegistration.
     * 
     * @return user_id
     */
    public java.lang.Long getUser_id() {
        return user_id;
    }


    /**
     * Sets the user_id value for this RenewRegistration.
     * 
     * @param user_id
     */
    public void setUser_id(java.lang.Long user_id) {
        this.user_id = user_id;
    }


    /**
     * Gets the phone_id value for this RenewRegistration.
     * 
     * @return phone_id
     */
    public java.lang.String getPhone_id() {
        return phone_id;
    }


    /**
     * Sets the phone_id value for this RenewRegistration.
     * 
     * @param phone_id
     */
    public void setPhone_id(java.lang.String phone_id) {
        this.phone_id = phone_id;
    }


    /**
     * Gets the change_account value for this RenewRegistration.
     * 
     * @return change_account
     */
    public java.lang.Short getChange_account() {
        return change_account;
    }


    /**
     * Sets the change_account value for this RenewRegistration.
     * 
     * @param change_account
     */
    public void setChange_account(java.lang.Short change_account) {
        this.change_account = change_account;
    }


    /**
     * Gets the change_promotion_flag value for this RenewRegistration.
     * 
     * @return change_promotion_flag
     */
    public java.lang.Short getChange_promotion_flag() {
        return change_promotion_flag;
    }


    /**
     * Sets the change_promotion_flag value for this RenewRegistration.
     * 
     * @param change_promotion_flag
     */
    public void setChange_promotion_flag(java.lang.Short change_promotion_flag) {
        this.change_promotion_flag = change_promotion_flag;
    }


    /**
     * Gets the productList value for this RenewRegistration.
     * 
     * @return productList
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.SProductOrder[] getProductList() {
        return productList;
    }


    /**
     * Sets the productList value for this RenewRegistration.
     * 
     * @param productList
     */
    public void setProductList(com.asiainfo.crm.cm.dk.ws.imsservice.SProductOrder[] productList) {
        this.productList = productList;
    }


    /**
     * Gets the account value for this RenewRegistration.
     * 
     * @return account
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.SAccount getAccount() {
        return account;
    }


    /**
     * Sets the account value for this RenewRegistration.
     * 
     * @param account
     */
    public void setAccount(com.asiainfo.crm.cm.dk.ws.imsservice.SAccount account) {
        this.account = account;
    }


    /**
     * Gets the contactList value for this RenewRegistration.
     * 
     * @return contactList
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.SContact[] getContactList() {
        return contactList;
    }


    /**
     * Sets the contactList value for this RenewRegistration.
     * 
     * @param contactList
     */
    public void setContactList(com.asiainfo.crm.cm.dk.ws.imsservice.SContact[] contactList) {
        this.contactList = contactList;
    }


    /**
     * Gets the balanceList value for this RenewRegistration.
     * 
     * @return balanceList
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.SBalance[] getBalanceList() {
        return balanceList;
    }


    /**
     * Sets the balanceList value for this RenewRegistration.
     * 
     * @param balanceList
     */
    public void setBalanceList(com.asiainfo.crm.cm.dk.ws.imsservice.SBalance[] balanceList) {
        this.balanceList = balanceList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RenewRegistration)) return false;
        RenewRegistration other = (RenewRegistration) obj;
        if (obj == null) return false;
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
            ((this.change_account==null && other.getChange_account()==null) || 
             (this.change_account!=null &&
              this.change_account.equals(other.getChange_account()))) &&
            ((this.change_promotion_flag==null && other.getChange_promotion_flag()==null) || 
             (this.change_promotion_flag!=null &&
              this.change_promotion_flag.equals(other.getChange_promotion_flag()))) &&
            ((this.productList==null && other.getProductList()==null) || 
             (this.productList!=null &&
              java.util.Arrays.equals(this.productList, other.getProductList()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.contactList==null && other.getContactList()==null) || 
             (this.contactList!=null &&
              java.util.Arrays.equals(this.contactList, other.getContactList()))) &&
            ((this.balanceList==null && other.getBalanceList()==null) || 
             (this.balanceList!=null &&
              java.util.Arrays.equals(this.balanceList, other.getBalanceList())));
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
        if (getChange_account() != null) {
            _hashCode += getChange_account().hashCode();
        }
        if (getChange_promotion_flag() != null) {
            _hashCode += getChange_promotion_flag().hashCode();
        }
        if (getProductList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getContactList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContactList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContactList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBalanceList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBalanceList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBalanceList(), i);
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
        new org.apache.axis.description.TypeDesc(RenewRegistration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "renewRegistration"));
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
        elemField.setFieldName("change_account");
        elemField.setXmlName(new javax.xml.namespace.QName("", "change_account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("change_promotion_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "change_promotion_flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAccount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contactList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sContact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "sContactListItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balanceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBalance"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "sBalanceListItem"));
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
