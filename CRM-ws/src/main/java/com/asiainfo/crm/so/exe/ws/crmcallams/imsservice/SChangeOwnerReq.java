/**
 * SChangeOwnerReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsservice;

public class SChangeOwnerReq  implements java.io.Serializable {
    private java.lang.Long user_id;

    private java.lang.String phone_id;

    private java.lang.Short change_type;

    private java.lang.String outer_old_acct_id;

    private java.lang.Long old_acct_id;

    private java.lang.String outer_billable_acct_id;

    private java.lang.Long billable_acct_id;

    private java.lang.Short convert_flag;

    private java.lang.Short last_term_flag;

    private java.lang.String outer_new_acct_id;

    private java.lang.Long new_acct_id;

    private java.lang.Short reset_flag;

    private java.lang.Short change_promotion_flag;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SProductOrderOper[] prod_list;

    private java.lang.Long days;

    private java.lang.Short user_segment;

    private java.lang.String user_valid_date;

    private java.lang.Short accumulation_reset_flag;

    public SChangeOwnerReq() {
    }

    public SChangeOwnerReq(
           java.lang.Long user_id,
           java.lang.String phone_id,
           java.lang.Short change_type,
           java.lang.String outer_old_acct_id,
           java.lang.Long old_acct_id,
           java.lang.String outer_billable_acct_id,
           java.lang.Long billable_acct_id,
           java.lang.Short convert_flag,
           java.lang.Short last_term_flag,
           java.lang.String outer_new_acct_id,
           java.lang.Long new_acct_id,
           java.lang.Short reset_flag,
           java.lang.Short change_promotion_flag,
           com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SProductOrderOper[] prod_list,
           java.lang.Long days,
           java.lang.Short user_segment,
           java.lang.String user_valid_date,
           java.lang.Short accumulation_reset_flag) {
           this.user_id = user_id;
           this.phone_id = phone_id;
           this.change_type = change_type;
           this.outer_old_acct_id = outer_old_acct_id;
           this.old_acct_id = old_acct_id;
           this.outer_billable_acct_id = outer_billable_acct_id;
           this.billable_acct_id = billable_acct_id;
           this.convert_flag = convert_flag;
           this.last_term_flag = last_term_flag;
           this.outer_new_acct_id = outer_new_acct_id;
           this.new_acct_id = new_acct_id;
           this.reset_flag = reset_flag;
           this.change_promotion_flag = change_promotion_flag;
           this.prod_list = prod_list;
           this.days = days;
           this.user_segment = user_segment;
           this.user_valid_date = user_valid_date;
           this.accumulation_reset_flag = accumulation_reset_flag;
    }


    /**
     * Gets the user_id value for this SChangeOwnerReq.
     * 
     * @return user_id
     */
    public java.lang.Long getUser_id() {
        return user_id;
    }


    /**
     * Sets the user_id value for this SChangeOwnerReq.
     * 
     * @param user_id
     */
    public void setUser_id(java.lang.Long user_id) {
        this.user_id = user_id;
    }


    /**
     * Gets the phone_id value for this SChangeOwnerReq.
     * 
     * @return phone_id
     */
    public java.lang.String getPhone_id() {
        return phone_id;
    }


    /**
     * Sets the phone_id value for this SChangeOwnerReq.
     * 
     * @param phone_id
     */
    public void setPhone_id(java.lang.String phone_id) {
        this.phone_id = phone_id;
    }


    /**
     * Gets the change_type value for this SChangeOwnerReq.
     * 
     * @return change_type
     */
    public java.lang.Short getChange_type() {
        return change_type;
    }


    /**
     * Sets the change_type value for this SChangeOwnerReq.
     * 
     * @param change_type
     */
    public void setChange_type(java.lang.Short change_type) {
        this.change_type = change_type;
    }


    /**
     * Gets the outer_old_acct_id value for this SChangeOwnerReq.
     * 
     * @return outer_old_acct_id
     */
    public java.lang.String getOuter_old_acct_id() {
        return outer_old_acct_id;
    }


    /**
     * Sets the outer_old_acct_id value for this SChangeOwnerReq.
     * 
     * @param outer_old_acct_id
     */
    public void setOuter_old_acct_id(java.lang.String outer_old_acct_id) {
        this.outer_old_acct_id = outer_old_acct_id;
    }


    /**
     * Gets the old_acct_id value for this SChangeOwnerReq.
     * 
     * @return old_acct_id
     */
    public java.lang.Long getOld_acct_id() {
        return old_acct_id;
    }


    /**
     * Sets the old_acct_id value for this SChangeOwnerReq.
     * 
     * @param old_acct_id
     */
    public void setOld_acct_id(java.lang.Long old_acct_id) {
        this.old_acct_id = old_acct_id;
    }


    /**
     * Gets the outer_billable_acct_id value for this SChangeOwnerReq.
     * 
     * @return outer_billable_acct_id
     */
    public java.lang.String getOuter_billable_acct_id() {
        return outer_billable_acct_id;
    }


    /**
     * Sets the outer_billable_acct_id value for this SChangeOwnerReq.
     * 
     * @param outer_billable_acct_id
     */
    public void setOuter_billable_acct_id(java.lang.String outer_billable_acct_id) {
        this.outer_billable_acct_id = outer_billable_acct_id;
    }


    /**
     * Gets the billable_acct_id value for this SChangeOwnerReq.
     * 
     * @return billable_acct_id
     */
    public java.lang.Long getBillable_acct_id() {
        return billable_acct_id;
    }


    /**
     * Sets the billable_acct_id value for this SChangeOwnerReq.
     * 
     * @param billable_acct_id
     */
    public void setBillable_acct_id(java.lang.Long billable_acct_id) {
        this.billable_acct_id = billable_acct_id;
    }


    /**
     * Gets the convert_flag value for this SChangeOwnerReq.
     * 
     * @return convert_flag
     */
    public java.lang.Short getConvert_flag() {
        return convert_flag;
    }


    /**
     * Sets the convert_flag value for this SChangeOwnerReq.
     * 
     * @param convert_flag
     */
    public void setConvert_flag(java.lang.Short convert_flag) {
        this.convert_flag = convert_flag;
    }


    /**
     * Gets the last_term_flag value for this SChangeOwnerReq.
     * 
     * @return last_term_flag
     */
    public java.lang.Short getLast_term_flag() {
        return last_term_flag;
    }


    /**
     * Sets the last_term_flag value for this SChangeOwnerReq.
     * 
     * @param last_term_flag
     */
    public void setLast_term_flag(java.lang.Short last_term_flag) {
        this.last_term_flag = last_term_flag;
    }


    /**
     * Gets the outer_new_acct_id value for this SChangeOwnerReq.
     * 
     * @return outer_new_acct_id
     */
    public java.lang.String getOuter_new_acct_id() {
        return outer_new_acct_id;
    }


    /**
     * Sets the outer_new_acct_id value for this SChangeOwnerReq.
     * 
     * @param outer_new_acct_id
     */
    public void setOuter_new_acct_id(java.lang.String outer_new_acct_id) {
        this.outer_new_acct_id = outer_new_acct_id;
    }


    /**
     * Gets the new_acct_id value for this SChangeOwnerReq.
     * 
     * @return new_acct_id
     */
    public java.lang.Long getNew_acct_id() {
        return new_acct_id;
    }


    /**
     * Sets the new_acct_id value for this SChangeOwnerReq.
     * 
     * @param new_acct_id
     */
    public void setNew_acct_id(java.lang.Long new_acct_id) {
        this.new_acct_id = new_acct_id;
    }


    /**
     * Gets the reset_flag value for this SChangeOwnerReq.
     * 
     * @return reset_flag
     */
    public java.lang.Short getReset_flag() {
        return reset_flag;
    }


    /**
     * Sets the reset_flag value for this SChangeOwnerReq.
     * 
     * @param reset_flag
     */
    public void setReset_flag(java.lang.Short reset_flag) {
        this.reset_flag = reset_flag;
    }


    /**
     * Gets the change_promotion_flag value for this SChangeOwnerReq.
     * 
     * @return change_promotion_flag
     */
    public java.lang.Short getChange_promotion_flag() {
        return change_promotion_flag;
    }


    /**
     * Sets the change_promotion_flag value for this SChangeOwnerReq.
     * 
     * @param change_promotion_flag
     */
    public void setChange_promotion_flag(java.lang.Short change_promotion_flag) {
        this.change_promotion_flag = change_promotion_flag;
    }


    /**
     * Gets the prod_list value for this SChangeOwnerReq.
     * 
     * @return prod_list
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SProductOrderOper[] getProd_list() {
        return prod_list;
    }


    /**
     * Sets the prod_list value for this SChangeOwnerReq.
     * 
     * @param prod_list
     */
    public void setProd_list(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SProductOrderOper[] prod_list) {
        this.prod_list = prod_list;
    }


    /**
     * Gets the days value for this SChangeOwnerReq.
     * 
     * @return days
     */
    public java.lang.Long getDays() {
        return days;
    }


    /**
     * Sets the days value for this SChangeOwnerReq.
     * 
     * @param days
     */
    public void setDays(java.lang.Long days) {
        this.days = days;
    }


    /**
     * Gets the user_segment value for this SChangeOwnerReq.
     * 
     * @return user_segment
     */
    public java.lang.Short getUser_segment() {
        return user_segment;
    }


    /**
     * Sets the user_segment value for this SChangeOwnerReq.
     * 
     * @param user_segment
     */
    public void setUser_segment(java.lang.Short user_segment) {
        this.user_segment = user_segment;
    }


    /**
     * Gets the user_valid_date value for this SChangeOwnerReq.
     * 
     * @return user_valid_date
     */
    public java.lang.String getUser_valid_date() {
        return user_valid_date;
    }


    /**
     * Sets the user_valid_date value for this SChangeOwnerReq.
     * 
     * @param user_valid_date
     */
    public void setUser_valid_date(java.lang.String user_valid_date) {
        this.user_valid_date = user_valid_date;
    }


    /**
     * Gets the accumulation_reset_flag value for this SChangeOwnerReq.
     * 
     * @return accumulation_reset_flag
     */
    public java.lang.Short getAccumulation_reset_flag() {
        return accumulation_reset_flag;
    }


    /**
     * Sets the accumulation_reset_flag value for this SChangeOwnerReq.
     * 
     * @param accumulation_reset_flag
     */
    public void setAccumulation_reset_flag(java.lang.Short accumulation_reset_flag) {
        this.accumulation_reset_flag = accumulation_reset_flag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SChangeOwnerReq)) return false;
        SChangeOwnerReq other = (SChangeOwnerReq) obj;
       
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
            ((this.change_type==null && other.getChange_type()==null) || 
             (this.change_type!=null &&
              this.change_type.equals(other.getChange_type()))) &&
            ((this.outer_old_acct_id==null && other.getOuter_old_acct_id()==null) || 
             (this.outer_old_acct_id!=null &&
              this.outer_old_acct_id.equals(other.getOuter_old_acct_id()))) &&
            ((this.old_acct_id==null && other.getOld_acct_id()==null) || 
             (this.old_acct_id!=null &&
              this.old_acct_id.equals(other.getOld_acct_id()))) &&
            ((this.outer_billable_acct_id==null && other.getOuter_billable_acct_id()==null) || 
             (this.outer_billable_acct_id!=null &&
              this.outer_billable_acct_id.equals(other.getOuter_billable_acct_id()))) &&
            ((this.billable_acct_id==null && other.getBillable_acct_id()==null) || 
             (this.billable_acct_id!=null &&
              this.billable_acct_id.equals(other.getBillable_acct_id()))) &&
            ((this.convert_flag==null && other.getConvert_flag()==null) || 
             (this.convert_flag!=null &&
              this.convert_flag.equals(other.getConvert_flag()))) &&
            ((this.last_term_flag==null && other.getLast_term_flag()==null) || 
             (this.last_term_flag!=null &&
              this.last_term_flag.equals(other.getLast_term_flag()))) &&
            ((this.outer_new_acct_id==null && other.getOuter_new_acct_id()==null) || 
             (this.outer_new_acct_id!=null &&
              this.outer_new_acct_id.equals(other.getOuter_new_acct_id()))) &&
            ((this.new_acct_id==null && other.getNew_acct_id()==null) || 
             (this.new_acct_id!=null &&
              this.new_acct_id.equals(other.getNew_acct_id()))) &&
            ((this.reset_flag==null && other.getReset_flag()==null) || 
             (this.reset_flag!=null &&
              this.reset_flag.equals(other.getReset_flag()))) &&
            ((this.change_promotion_flag==null && other.getChange_promotion_flag()==null) || 
             (this.change_promotion_flag!=null &&
              this.change_promotion_flag.equals(other.getChange_promotion_flag()))) &&
            ((this.prod_list==null && other.getProd_list()==null) || 
             (this.prod_list!=null &&
              java.util.Arrays.equals(this.prod_list, other.getProd_list()))) &&
            ((this.days==null && other.getDays()==null) || 
             (this.days!=null &&
              this.days.equals(other.getDays()))) &&
            ((this.user_segment==null && other.getUser_segment()==null) || 
             (this.user_segment!=null &&
              this.user_segment.equals(other.getUser_segment()))) &&
            ((this.user_valid_date==null && other.getUser_valid_date()==null) || 
             (this.user_valid_date!=null &&
              this.user_valid_date.equals(other.getUser_valid_date()))) &&
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
        if (getUser_id() != null) {
            _hashCode += getUser_id().hashCode();
        }
        if (getPhone_id() != null) {
            _hashCode += getPhone_id().hashCode();
        }
        if (getChange_type() != null) {
            _hashCode += getChange_type().hashCode();
        }
        if (getOuter_old_acct_id() != null) {
            _hashCode += getOuter_old_acct_id().hashCode();
        }
        if (getOld_acct_id() != null) {
            _hashCode += getOld_acct_id().hashCode();
        }
        if (getOuter_billable_acct_id() != null) {
            _hashCode += getOuter_billable_acct_id().hashCode();
        }
        if (getBillable_acct_id() != null) {
            _hashCode += getBillable_acct_id().hashCode();
        }
        if (getConvert_flag() != null) {
            _hashCode += getConvert_flag().hashCode();
        }
        if (getLast_term_flag() != null) {
            _hashCode += getLast_term_flag().hashCode();
        }
        if (getOuter_new_acct_id() != null) {
            _hashCode += getOuter_new_acct_id().hashCode();
        }
        if (getNew_acct_id() != null) {
            _hashCode += getNew_acct_id().hashCode();
        }
        if (getReset_flag() != null) {
            _hashCode += getReset_flag().hashCode();
        }
        if (getChange_promotion_flag() != null) {
            _hashCode += getChange_promotion_flag().hashCode();
        }
        if (getProd_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProd_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProd_list(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDays() != null) {
            _hashCode += getDays().hashCode();
        }
        if (getUser_segment() != null) {
            _hashCode += getUser_segment().hashCode();
        }
        if (getUser_valid_date() != null) {
            _hashCode += getUser_valid_date().hashCode();
        }
        if (getAccumulation_reset_flag() != null) {
            _hashCode += getAccumulation_reset_flag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SChangeOwnerReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sChangeOwnerReq"));
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
        elemField.setFieldName("change_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "change_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outer_old_acct_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outer_old_acct_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("old_acct_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "old_acct_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outer_billable_acct_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outer_billable_acct_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billable_acct_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billable_acct_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("last_term_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "last_term_flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("reset_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reset_flag"));
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
        elemField.setFieldName("prod_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prod_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrderOper"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "sProductOrderOperList_Item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("days");
        elemField.setXmlName(new javax.xml.namespace.QName("", "days"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_segment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_segment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_valid_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_valid_date"));
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
