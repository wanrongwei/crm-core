/**
 * NewRegistration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class NewRegistration  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imsservice.SCustomer customer;

    private com.asiainfo.crm.cm.dk.ws.imsservice.SAccount[] accountList;

    private com.asiainfo.crm.cm.dk.ws.imsservice.SUser[] userList;

    private com.asiainfo.crm.cm.dk.ws.imsservice.SProductOrder[] productOrderList;

    private com.asiainfo.crm.cm.dk.ws.imsservice.SContact[] contactList;

    private com.asiainfo.crm.cm.dk.ws.imsservice.SUserAuth[] userAuthList;

    private com.asiainfo.crm.cm.dk.ws.imsservice.SBalance[] balanceList;

    public NewRegistration() {
    }

    public NewRegistration(
           com.asiainfo.crm.cm.dk.ws.imsservice.SCustomer customer,
           com.asiainfo.crm.cm.dk.ws.imsservice.SAccount[] accountList,
           com.asiainfo.crm.cm.dk.ws.imsservice.SUser[] userList,
           com.asiainfo.crm.cm.dk.ws.imsservice.SProductOrder[] productOrderList,
           com.asiainfo.crm.cm.dk.ws.imsservice.SContact[] contactList,
           com.asiainfo.crm.cm.dk.ws.imsservice.SUserAuth[] userAuthList,
           com.asiainfo.crm.cm.dk.ws.imsservice.SBalance[] balanceList) {
           this.customer = customer;
           this.accountList = accountList;
           this.userList = userList;
           this.productOrderList = productOrderList;
           this.contactList = contactList;
           this.userAuthList = userAuthList;
           this.balanceList = balanceList;
    }


    /**
     * Gets the customer value for this NewRegistration.
     * 
     * @return customer
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.SCustomer getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this NewRegistration.
     * 
     * @param customer
     */
    public void setCustomer(com.asiainfo.crm.cm.dk.ws.imsservice.SCustomer customer) {
        this.customer = customer;
    }


    /**
     * Gets the accountList value for this NewRegistration.
     * 
     * @return accountList
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.SAccount[] getAccountList() {
        return accountList;
    }


    /**
     * Sets the accountList value for this NewRegistration.
     * 
     * @param accountList
     */
    public void setAccountList(com.asiainfo.crm.cm.dk.ws.imsservice.SAccount[] accountList) {
        this.accountList = accountList;
    }


    /**
     * Gets the userList value for this NewRegistration.
     * 
     * @return userList
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.SUser[] getUserList() {
        return userList;
    }


    /**
     * Sets the userList value for this NewRegistration.
     * 
     * @param userList
     */
    public void setUserList(com.asiainfo.crm.cm.dk.ws.imsservice.SUser[] userList) {
        this.userList = userList;
    }


    /**
     * Gets the productOrderList value for this NewRegistration.
     * 
     * @return productOrderList
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.SProductOrder[] getProductOrderList() {
        return productOrderList;
    }


    /**
     * Sets the productOrderList value for this NewRegistration.
     * 
     * @param productOrderList
     */
    public void setProductOrderList(com.asiainfo.crm.cm.dk.ws.imsservice.SProductOrder[] productOrderList) {
        this.productOrderList = productOrderList;
    }


    /**
     * Gets the contactList value for this NewRegistration.
     * 
     * @return contactList
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.SContact[] getContactList() {
        return contactList;
    }


    /**
     * Sets the contactList value for this NewRegistration.
     * 
     * @param contactList
     */
    public void setContactList(com.asiainfo.crm.cm.dk.ws.imsservice.SContact[] contactList) {
        this.contactList = contactList;
    }


    /**
     * Gets the userAuthList value for this NewRegistration.
     * 
     * @return userAuthList
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.SUserAuth[] getUserAuthList() {
        return userAuthList;
    }


    /**
     * Sets the userAuthList value for this NewRegistration.
     * 
     * @param userAuthList
     */
    public void setUserAuthList(com.asiainfo.crm.cm.dk.ws.imsservice.SUserAuth[] userAuthList) {
        this.userAuthList = userAuthList;
    }


    /**
     * Gets the balanceList value for this NewRegistration.
     * 
     * @return balanceList
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.SBalance[] getBalanceList() {
        return balanceList;
    }


    /**
     * Sets the balanceList value for this NewRegistration.
     * 
     * @param balanceList
     */
    public void setBalanceList(com.asiainfo.crm.cm.dk.ws.imsservice.SBalance[] balanceList) {
        this.balanceList = balanceList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NewRegistration)) return false;
        NewRegistration other = (NewRegistration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.accountList==null && other.getAccountList()==null) || 
             (this.accountList!=null &&
              java.util.Arrays.equals(this.accountList, other.getAccountList()))) &&
            ((this.userList==null && other.getUserList()==null) || 
             (this.userList!=null &&
              java.util.Arrays.equals(this.userList, other.getUserList()))) &&
            ((this.productOrderList==null && other.getProductOrderList()==null) || 
             (this.productOrderList!=null &&
              java.util.Arrays.equals(this.productOrderList, other.getProductOrderList()))) &&
            ((this.contactList==null && other.getContactList()==null) || 
             (this.contactList!=null &&
              java.util.Arrays.equals(this.contactList, other.getContactList()))) &&
            ((this.userAuthList==null && other.getUserAuthList()==null) || 
             (this.userAuthList!=null &&
              java.util.Arrays.equals(this.userAuthList, other.getUserAuthList()))) &&
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
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getAccountList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProductOrderList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductOrderList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductOrderList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getUserAuthList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserAuthList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserAuthList(), i);
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
        new org.apache.axis.description.TypeDesc(NewRegistration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "newRegistration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCustomer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAccount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "sAccountList_Item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUser"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "sUserList_Item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productOrderList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productOrderList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
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
        elemField.setFieldName("userAuthList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userAuthList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUserAuth"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "sUserAuthListItem"));
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
