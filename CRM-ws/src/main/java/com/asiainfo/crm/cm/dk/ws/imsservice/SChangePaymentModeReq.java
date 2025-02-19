/**
 * SChangePaymentModeReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class SChangePaymentModeReq  implements java.io.Serializable {
    private java.lang.String outer_new_acct_id;

    private java.lang.Long new_acct_id;

    private java.lang.Long user_id;

    private java.lang.String phone_id;

    private java.lang.Short convert_flag;

    private java.lang.Short reset_flag;

    private java.lang.Short last_term_flag;

    private java.lang.Short hybrid_rule;

    private java.lang.Short old_payment_mode;

    private java.lang.Short new_payment_mode;

    private java.lang.Short drop_flag;

    private com.asiainfo.crm.cm.dk.ws.imsservice.SCustomer sCustomer;

    private com.asiainfo.crm.cm.dk.ws.imsservice.SAccount sAccount;

    private com.asiainfo.crm.cm.dk.ws.imsservice.SProductOrderOper[] productOrderOperList;

    private com.asiainfo.crm.cm.dk.ws.imsservice.SBusiServiceOper[] busiServiceOperList;

    private java.lang.Long billalbe_acct_id;

    private java.lang.String outer_billalbe_acct_id;

    private java.lang.Short accumulation_reset_flag;

    public SChangePaymentModeReq() {
    }

    public SChangePaymentModeReq(
           java.lang.String outer_new_acct_id,
           java.lang.Long new_acct_id,
           java.lang.Long user_id,
           java.lang.String phone_id,
           java.lang.Short convert_flag,
           java.lang.Short reset_flag,
           java.lang.Short last_term_flag,
           java.lang.Short hybrid_rule,
           java.lang.Short old_payment_mode,
           java.lang.Short new_payment_mode,
           java.lang.Short drop_flag,
           com.asiainfo.crm.cm.dk.ws.imsservice.SCustomer sCustomer,
           com.asiainfo.crm.cm.dk.ws.imsservice.SAccount sAccount,
           com.asiainfo.crm.cm.dk.ws.imsservice.SProductOrderOper[] productOrderOperList,
           com.asiainfo.crm.cm.dk.ws.imsservice.SBusiServiceOper[] busiServiceOperList,
           java.lang.Long billalbe_acct_id,
           java.lang.String outer_billalbe_acct_id,
           java.lang.Short accumulation_reset_flag) {
           this.outer_new_acct_id = outer_new_acct_id;
           this.new_acct_id = new_acct_id;
           this.user_id = user_id;
           this.phone_id = phone_id;
           this.convert_flag = convert_flag;
           this.reset_flag = reset_flag;
           this.last_term_flag = last_term_flag;
           this.hybrid_rule = hybrid_rule;
           this.old_payment_mode = old_payment_mode;
           this.new_payment_mode = new_payment_mode;
           this.drop_flag = drop_flag;
           this.sCustomer = sCustomer;
           this.sAccount = sAccount;
           this.productOrderOperList = productOrderOperList;
           this.busiServiceOperList = busiServiceOperList;
           this.billalbe_acct_id = billalbe_acct_id;
           this.outer_billalbe_acct_id = outer_billalbe_acct_id;
           this.accumulation_reset_flag = accumulation_reset_flag;
    }


    /**
     * Gets the outer_new_acct_id value for this SChangePaymentModeReq.
     * 
     * @return outer_new_acct_id
     */
    public java.lang.String getOuter_new_acct_id() {
        return outer_new_acct_id;
    }


    /**
     * Sets the outer_new_acct_id value for this SChangePaymentModeReq.
     * 
     * @param outer_new_acct_id
     */
    public void setOuter_new_acct_id(java.lang.String outer_new_acct_id) {
        this.outer_new_acct_id = outer_new_acct_id;
    }


    /**
     * Gets the new_acct_id value for this SChangePaymentModeReq.
     * 
     * @return new_acct_id
     */
    public java.lang.Long getNew_acct_id() {
        return new_acct_id;
    }


    /**
     * Sets the new_acct_id value for this SChangePaymentModeReq.
     * 
     * @param new_acct_id
     */
    public void setNew_acct_id(java.lang.Long new_acct_id) {
        this.new_acct_id = new_acct_id;
    }


    /**
     * Gets the user_id value for this SChangePaymentModeReq.
     * 
     * @return user_id
     */
    public java.lang.Long getUser_id() {
        return user_id;
    }


    /**
     * Sets the user_id value for this SChangePaymentModeReq.
     * 
     * @param user_id
     */
    public void setUser_id(java.lang.Long user_id) {
        this.user_id = user_id;
    }


    /**
     * Gets the phone_id value for this SChangePaymentModeReq.
     * 
     * @return phone_id
     */
    public java.lang.String getPhone_id() {
        return phone_id;
    }


    /**
     * Sets the phone_id value for this SChangePaymentModeReq.
     * 
     * @param phone_id
     */
    public void setPhone_id(java.lang.String phone_id) {
        this.phone_id = phone_id;
    }


    /**
     * Gets the convert_flag value for this SChangePaymentModeReq.
     * 
     * @return convert_flag
     */
    public java.lang.Short getConvert_flag() {
        return convert_flag;
    }


    /**
     * Sets the convert_flag value for this SChangePaymentModeReq.
     * 
     * @param convert_flag
     */
    public void setConvert_flag(java.lang.Short convert_flag) {
        this.convert_flag = convert_flag;
    }


    /**
     * Gets the reset_flag value for this SChangePaymentModeReq.
     * 
     * @return reset_flag
     */
    public java.lang.Short getReset_flag() {
        return reset_flag;
    }


    /**
     * Sets the reset_flag value for this SChangePaymentModeReq.
     * 
     * @param reset_flag
     */
    public void setReset_flag(java.lang.Short reset_flag) {
        this.reset_flag = reset_flag;
    }


    /**
     * Gets the last_term_flag value for this SChangePaymentModeReq.
     * 
     * @return last_term_flag
     */
    public java.lang.Short getLast_term_flag() {
        return last_term_flag;
    }


    /**
     * Sets the last_term_flag value for this SChangePaymentModeReq.
     * 
     * @param last_term_flag
     */
    public void setLast_term_flag(java.lang.Short last_term_flag) {
        this.last_term_flag = last_term_flag;
    }


    /**
     * Gets the hybrid_rule value for this SChangePaymentModeReq.
     * 
     * @return hybrid_rule
     */
    public java.lang.Short getHybrid_rule() {
        return hybrid_rule;
    }


    /**
     * Sets the hybrid_rule value for this SChangePaymentModeReq.
     * 
     * @param hybrid_rule
     */
    public void setHybrid_rule(java.lang.Short hybrid_rule) {
        this.hybrid_rule = hybrid_rule;
    }


    /**
     * Gets the old_payment_mode value for this SChangePaymentModeReq.
     * 
     * @return old_payment_mode
     */
    public java.lang.Short getOld_payment_mode() {
        return old_payment_mode;
    }


    /**
     * Sets the old_payment_mode value for this SChangePaymentModeReq.
     * 
     * @param old_payment_mode
     */
    public void setOld_payment_mode(java.lang.Short old_payment_mode) {
        this.old_payment_mode = old_payment_mode;
    }


    /**
     * Gets the new_payment_mode value for this SChangePaymentModeReq.
     * 
     * @return new_payment_mode
     */
    public java.lang.Short getNew_payment_mode() {
        return new_payment_mode;
    }


    /**
     * Sets the new_payment_mode value for this SChangePaymentModeReq.
     * 
     * @param new_payment_mode
     */
    public void setNew_payment_mode(java.lang.Short new_payment_mode) {
        this.new_payment_mode = new_payment_mode;
    }


    /**
     * Gets the drop_flag value for this SChangePaymentModeReq.
     * 
     * @return drop_flag
     */
    public java.lang.Short getDrop_flag() {
        return drop_flag;
    }


    /**
     * Sets the drop_flag value for this SChangePaymentModeReq.
     * 
     * @param drop_flag
     */
    public void setDrop_flag(java.lang.Short drop_flag) {
        this.drop_flag = drop_flag;
    }


    /**
     * Gets the sCustomer value for this SChangePaymentModeReq.
     * 
     * @return sCustomer
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.SCustomer getSCustomer() {
        return sCustomer;
    }


    /**
     * Sets the sCustomer value for this SChangePaymentModeReq.
     * 
     * @param sCustomer
     */
    public void setSCustomer(com.asiainfo.crm.cm.dk.ws.imsservice.SCustomer sCustomer) {
        this.sCustomer = sCustomer;
    }


    /**
     * Gets the sAccount value for this SChangePaymentModeReq.
     * 
     * @return sAccount
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.SAccount getSAccount() {
        return sAccount;
    }


    /**
     * Sets the sAccount value for this SChangePaymentModeReq.
     * 
     * @param sAccount
     */
    public void setSAccount(com.asiainfo.crm.cm.dk.ws.imsservice.SAccount sAccount) {
        this.sAccount = sAccount;
    }


    /**
     * Gets the productOrderOperList value for this SChangePaymentModeReq.
     * 
     * @return productOrderOperList
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.SProductOrderOper[] getProductOrderOperList() {
        return productOrderOperList;
    }


    /**
     * Sets the productOrderOperList value for this SChangePaymentModeReq.
     * 
     * @param productOrderOperList
     */
    public void setProductOrderOperList(com.asiainfo.crm.cm.dk.ws.imsservice.SProductOrderOper[] productOrderOperList) {
        this.productOrderOperList = productOrderOperList;
    }


    /**
     * Gets the busiServiceOperList value for this SChangePaymentModeReq.
     * 
     * @return busiServiceOperList
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.SBusiServiceOper[] getBusiServiceOperList() {
        return busiServiceOperList;
    }


    /**
     * Sets the busiServiceOperList value for this SChangePaymentModeReq.
     * 
     * @param busiServiceOperList
     */
    public void setBusiServiceOperList(com.asiainfo.crm.cm.dk.ws.imsservice.SBusiServiceOper[] busiServiceOperList) {
        this.busiServiceOperList = busiServiceOperList;
    }


    /**
     * Gets the billalbe_acct_id value for this SChangePaymentModeReq.
     * 
     * @return billalbe_acct_id
     */
    public java.lang.Long getBillalbe_acct_id() {
        return billalbe_acct_id;
    }


    /**
     * Sets the billalbe_acct_id value for this SChangePaymentModeReq.
     * 
     * @param billalbe_acct_id
     */
    public void setBillalbe_acct_id(java.lang.Long billalbe_acct_id) {
        this.billalbe_acct_id = billalbe_acct_id;
    }


    /**
     * Gets the outer_billalbe_acct_id value for this SChangePaymentModeReq.
     * 
     * @return outer_billalbe_acct_id
     */
    public java.lang.String getOuter_billalbe_acct_id() {
        return outer_billalbe_acct_id;
    }


    /**
     * Sets the outer_billalbe_acct_id value for this SChangePaymentModeReq.
     * 
     * @param outer_billalbe_acct_id
     */
    public void setOuter_billalbe_acct_id(java.lang.String outer_billalbe_acct_id) {
        this.outer_billalbe_acct_id = outer_billalbe_acct_id;
    }


    /**
     * Gets the accumulation_reset_flag value for this SChangePaymentModeReq.
     * 
     * @return accumulation_reset_flag
     */
    public java.lang.Short getAccumulation_reset_flag() {
        return accumulation_reset_flag;
    }


    /**
     * Sets the accumulation_reset_flag value for this SChangePaymentModeReq.
     * 
     * @param accumulation_reset_flag
     */
    public void setAccumulation_reset_flag(java.lang.Short accumulation_reset_flag) {
        this.accumulation_reset_flag = accumulation_reset_flag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SChangePaymentModeReq)) return false;
        SChangePaymentModeReq other = (SChangePaymentModeReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.outer_new_acct_id==null && other.getOuter_new_acct_id()==null) || 
             (this.outer_new_acct_id!=null &&
              this.outer_new_acct_id.equals(other.getOuter_new_acct_id()))) &&
            ((this.new_acct_id==null && other.getNew_acct_id()==null) || 
             (this.new_acct_id!=null &&
              this.new_acct_id.equals(other.getNew_acct_id()))) &&
            ((this.user_id==null && other.getUser_id()==null) || 
             (this.user_id!=null &&
              this.user_id.equals(other.getUser_id()))) &&
            ((this.phone_id==null && other.getPhone_id()==null) || 
             (this.phone_id!=null &&
              this.phone_id.equals(other.getPhone_id()))) &&
            ((this.convert_flag==null && other.getConvert_flag()==null) || 
             (this.convert_flag!=null &&
              this.convert_flag.equals(other.getConvert_flag()))) &&
            ((this.reset_flag==null && other.getReset_flag()==null) || 
             (this.reset_flag!=null &&
              this.reset_flag.equals(other.getReset_flag()))) &&
            ((this.last_term_flag==null && other.getLast_term_flag()==null) || 
             (this.last_term_flag!=null &&
              this.last_term_flag.equals(other.getLast_term_flag()))) &&
            ((this.hybrid_rule==null && other.getHybrid_rule()==null) || 
             (this.hybrid_rule!=null &&
              this.hybrid_rule.equals(other.getHybrid_rule()))) &&
            ((this.old_payment_mode==null && other.getOld_payment_mode()==null) || 
             (this.old_payment_mode!=null &&
              this.old_payment_mode.equals(other.getOld_payment_mode()))) &&
            ((this.new_payment_mode==null && other.getNew_payment_mode()==null) || 
             (this.new_payment_mode!=null &&
              this.new_payment_mode.equals(other.getNew_payment_mode()))) &&
            ((this.drop_flag==null && other.getDrop_flag()==null) || 
             (this.drop_flag!=null &&
              this.drop_flag.equals(other.getDrop_flag()))) &&
            ((this.sCustomer==null && other.getSCustomer()==null) || 
             (this.sCustomer!=null &&
              this.sCustomer.equals(other.getSCustomer()))) &&
            ((this.sAccount==null && other.getSAccount()==null) || 
             (this.sAccount!=null &&
              this.sAccount.equals(other.getSAccount()))) &&
            ((this.productOrderOperList==null && other.getProductOrderOperList()==null) || 
             (this.productOrderOperList!=null &&
              java.util.Arrays.equals(this.productOrderOperList, other.getProductOrderOperList()))) &&
            ((this.busiServiceOperList==null && other.getBusiServiceOperList()==null) || 
             (this.busiServiceOperList!=null &&
              java.util.Arrays.equals(this.busiServiceOperList, other.getBusiServiceOperList()))) &&
            ((this.billalbe_acct_id==null && other.getBillalbe_acct_id()==null) || 
             (this.billalbe_acct_id!=null &&
              this.billalbe_acct_id.equals(other.getBillalbe_acct_id()))) &&
            ((this.outer_billalbe_acct_id==null && other.getOuter_billalbe_acct_id()==null) || 
             (this.outer_billalbe_acct_id!=null &&
              this.outer_billalbe_acct_id.equals(other.getOuter_billalbe_acct_id()))) &&
            ((this.accumulation_reset_flag==null && other.getAccumulation_reset_flag()==null) || 
             (this.accumulation_reset_flag!=null &&
              this.accumulation_reset_flag.equals(other.getAccumulation_reset_flag())));
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
        if (getOuter_new_acct_id() != null) {
            _hashCode += getOuter_new_acct_id().hashCode();
        }
        if (getNew_acct_id() != null) {
            _hashCode += getNew_acct_id().hashCode();
        }
        if (getUser_id() != null) {
            _hashCode += getUser_id().hashCode();
        }
        if (getPhone_id() != null) {
            _hashCode += getPhone_id().hashCode();
        }
        if (getConvert_flag() != null) {
            _hashCode += getConvert_flag().hashCode();
        }
        if (getReset_flag() != null) {
            _hashCode += getReset_flag().hashCode();
        }
        if (getLast_term_flag() != null) {
            _hashCode += getLast_term_flag().hashCode();
        }
        if (getHybrid_rule() != null) {
            _hashCode += getHybrid_rule().hashCode();
        }
        if (getOld_payment_mode() != null) {
            _hashCode += getOld_payment_mode().hashCode();
        }
        if (getNew_payment_mode() != null) {
            _hashCode += getNew_payment_mode().hashCode();
        }
        if (getDrop_flag() != null) {
            _hashCode += getDrop_flag().hashCode();
        }
        if (getSCustomer() != null) {
            _hashCode += getSCustomer().hashCode();
        }
        if (getSAccount() != null) {
            _hashCode += getSAccount().hashCode();
        }
        if (getProductOrderOperList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductOrderOperList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductOrderOperList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBusiServiceOperList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBusiServiceOperList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBusiServiceOperList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillalbe_acct_id() != null) {
            _hashCode += getBillalbe_acct_id().hashCode();
        }
        if (getOuter_billalbe_acct_id() != null) {
            _hashCode += getOuter_billalbe_acct_id().hashCode();
        }
        if (getAccumulation_reset_flag() != null) {
            _hashCode += getAccumulation_reset_flag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SChangePaymentModeReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sChangePaymentModeReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outer_new_acct_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outer_new_acct_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("new_acct_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "new_acct_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("convert_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "convert_flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reset_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reset_flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last_term_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "last_term_flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hybrid_rule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hybrid_rule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("old_payment_mode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "old_payment_mode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("new_payment_mode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "new_payment_mode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drop_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "drop_flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sCustomer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCustomer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAccount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productOrderOperList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productOrderOperList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrderOper"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "sProductOrderOperList_Item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("busiServiceOperList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "busiServiceOperList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBusiServiceOper"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "busiServiceOperArr"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billalbe_acct_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billalbe_acct_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outer_billalbe_acct_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outer_billalbe_acct_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accumulation_reset_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accumulation_reset_flag"));
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
