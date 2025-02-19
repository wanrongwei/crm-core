/**
 * SGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsqueryservice;

public class SGroup  implements java.io.Serializable {
    private java.lang.String outer_group_id;

    private java.lang.Long group_id;

    private java.lang.String outer_parent_group_id;

    private java.lang.Long parent_group_id;

    private java.lang.String main_phone_id;

    private java.lang.Integer max_group_number;

    private java.lang.Short group_type;

    private java.lang.String group_name;

    private java.lang.String contact_phone;

    private java.lang.Integer status;

    private java.lang.String outer_billable_acct_id;

    private java.lang.Long billable_acct_id;

    private java.lang.String outer_cust_id;

    private java.lang.Long cust_id;

    private java.lang.String valid_date;

    private java.lang.String expire_date;

    private java.lang.Integer cLIP_flag;

    private java.lang.Integer outGoing_cs_flag;

    private java.lang.Integer ocs_routing_flag;

    private java.lang.Integer espace_flag;

    private com.asiainfo.crm.cm.dk.ws.imsqueryservice.SpecialNumber[] specail_number_list;

    private java.lang.Integer inGroupOutgoingCall;

    private java.lang.Integer inGroupIncomingCall;

    private java.lang.Integer crossGroupOutgoingCall;

    private java.lang.Integer crossGroupIncomingCall;

    private java.lang.Integer outGroupOutgingCall;

    private java.lang.Integer outGroupIncomingCall;

    private java.lang.Integer specOutgoingCall;

    private java.lang.Integer specIncomingCall;

    private java.lang.Long main_resource_id;

    public SGroup() {
    }

    public SGroup(
           java.lang.String outer_group_id,
           java.lang.Long group_id,
           java.lang.String outer_parent_group_id,
           java.lang.Long parent_group_id,
           java.lang.String main_phone_id,
           java.lang.Integer max_group_number,
           java.lang.Short group_type,
           java.lang.String group_name,
           java.lang.String contact_phone,
           java.lang.Integer status,
           java.lang.String outer_billable_acct_id,
           java.lang.Long billable_acct_id,
           java.lang.String outer_cust_id,
           java.lang.Long cust_id,
           java.lang.String valid_date,
           java.lang.String expire_date,
           java.lang.Integer cLIP_flag,
           java.lang.Integer outGoing_cs_flag,
           java.lang.Integer ocs_routing_flag,
           java.lang.Integer espace_flag,
           com.asiainfo.crm.cm.dk.ws.imsqueryservice.SpecialNumber[] specail_number_list,
           java.lang.Integer inGroupOutgoingCall,
           java.lang.Integer inGroupIncomingCall,
           java.lang.Integer crossGroupOutgoingCall,
           java.lang.Integer crossGroupIncomingCall,
           java.lang.Integer outGroupOutgingCall,
           java.lang.Integer outGroupIncomingCall,
           java.lang.Integer specOutgoingCall,
           java.lang.Integer specIncomingCall,
           java.lang.Long main_resource_id) {
           this.outer_group_id = outer_group_id;
           this.group_id = group_id;
           this.outer_parent_group_id = outer_parent_group_id;
           this.parent_group_id = parent_group_id;
           this.main_phone_id = main_phone_id;
           this.max_group_number = max_group_number;
           this.group_type = group_type;
           this.group_name = group_name;
           this.contact_phone = contact_phone;
           this.status = status;
           this.outer_billable_acct_id = outer_billable_acct_id;
           this.billable_acct_id = billable_acct_id;
           this.outer_cust_id = outer_cust_id;
           this.cust_id = cust_id;
           this.valid_date = valid_date;
           this.expire_date = expire_date;
           this.cLIP_flag = cLIP_flag;
           this.outGoing_cs_flag = outGoing_cs_flag;
           this.ocs_routing_flag = ocs_routing_flag;
           this.espace_flag = espace_flag;
           this.specail_number_list = specail_number_list;
           this.inGroupOutgoingCall = inGroupOutgoingCall;
           this.inGroupIncomingCall = inGroupIncomingCall;
           this.crossGroupOutgoingCall = crossGroupOutgoingCall;
           this.crossGroupIncomingCall = crossGroupIncomingCall;
           this.outGroupOutgingCall = outGroupOutgingCall;
           this.outGroupIncomingCall = outGroupIncomingCall;
           this.specOutgoingCall = specOutgoingCall;
           this.specIncomingCall = specIncomingCall;
           this.main_resource_id = main_resource_id;
    }


    /**
     * Gets the outer_group_id value for this SGroup.
     * 
     * @return outer_group_id
     */
    public java.lang.String getOuter_group_id() {
        return outer_group_id;
    }


    /**
     * Sets the outer_group_id value for this SGroup.
     * 
     * @param outer_group_id
     */
    public void setOuter_group_id(java.lang.String outer_group_id) {
        this.outer_group_id = outer_group_id;
    }


    /**
     * Gets the group_id value for this SGroup.
     * 
     * @return group_id
     */
    public java.lang.Long getGroup_id() {
        return group_id;
    }


    /**
     * Sets the group_id value for this SGroup.
     * 
     * @param group_id
     */
    public void setGroup_id(java.lang.Long group_id) {
        this.group_id = group_id;
    }


    /**
     * Gets the outer_parent_group_id value for this SGroup.
     * 
     * @return outer_parent_group_id
     */
    public java.lang.String getOuter_parent_group_id() {
        return outer_parent_group_id;
    }


    /**
     * Sets the outer_parent_group_id value for this SGroup.
     * 
     * @param outer_parent_group_id
     */
    public void setOuter_parent_group_id(java.lang.String outer_parent_group_id) {
        this.outer_parent_group_id = outer_parent_group_id;
    }


    /**
     * Gets the parent_group_id value for this SGroup.
     * 
     * @return parent_group_id
     */
    public java.lang.Long getParent_group_id() {
        return parent_group_id;
    }


    /**
     * Sets the parent_group_id value for this SGroup.
     * 
     * @param parent_group_id
     */
    public void setParent_group_id(java.lang.Long parent_group_id) {
        this.parent_group_id = parent_group_id;
    }


    /**
     * Gets the main_phone_id value for this SGroup.
     * 
     * @return main_phone_id
     */
    public java.lang.String getMain_phone_id() {
        return main_phone_id;
    }


    /**
     * Sets the main_phone_id value for this SGroup.
     * 
     * @param main_phone_id
     */
    public void setMain_phone_id(java.lang.String main_phone_id) {
        this.main_phone_id = main_phone_id;
    }


    /**
     * Gets the max_group_number value for this SGroup.
     * 
     * @return max_group_number
     */
    public java.lang.Integer getMax_group_number() {
        return max_group_number;
    }


    /**
     * Sets the max_group_number value for this SGroup.
     * 
     * @param max_group_number
     */
    public void setMax_group_number(java.lang.Integer max_group_number) {
        this.max_group_number = max_group_number;
    }


    /**
     * Gets the group_type value for this SGroup.
     * 
     * @return group_type
     */
    public java.lang.Short getGroup_type() {
        return group_type;
    }


    /**
     * Sets the group_type value for this SGroup.
     * 
     * @param group_type
     */
    public void setGroup_type(java.lang.Short group_type) {
        this.group_type = group_type;
    }


    /**
     * Gets the group_name value for this SGroup.
     * 
     * @return group_name
     */
    public java.lang.String getGroup_name() {
        return group_name;
    }


    /**
     * Sets the group_name value for this SGroup.
     * 
     * @param group_name
     */
    public void setGroup_name(java.lang.String group_name) {
        this.group_name = group_name;
    }


    /**
     * Gets the contact_phone value for this SGroup.
     * 
     * @return contact_phone
     */
    public java.lang.String getContact_phone() {
        return contact_phone;
    }


    /**
     * Sets the contact_phone value for this SGroup.
     * 
     * @param contact_phone
     */
    public void setContact_phone(java.lang.String contact_phone) {
        this.contact_phone = contact_phone;
    }


    /**
     * Gets the status value for this SGroup.
     * 
     * @return status
     */
    public java.lang.Integer getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SGroup.
     * 
     * @param status
     */
    public void setStatus(java.lang.Integer status) {
        this.status = status;
    }


    /**
     * Gets the outer_billable_acct_id value for this SGroup.
     * 
     * @return outer_billable_acct_id
     */
    public java.lang.String getOuter_billable_acct_id() {
        return outer_billable_acct_id;
    }


    /**
     * Sets the outer_billable_acct_id value for this SGroup.
     * 
     * @param outer_billable_acct_id
     */
    public void setOuter_billable_acct_id(java.lang.String outer_billable_acct_id) {
        this.outer_billable_acct_id = outer_billable_acct_id;
    }


    /**
     * Gets the billable_acct_id value for this SGroup.
     * 
     * @return billable_acct_id
     */
    public java.lang.Long getBillable_acct_id() {
        return billable_acct_id;
    }


    /**
     * Sets the billable_acct_id value for this SGroup.
     * 
     * @param billable_acct_id
     */
    public void setBillable_acct_id(java.lang.Long billable_acct_id) {
        this.billable_acct_id = billable_acct_id;
    }


    /**
     * Gets the outer_cust_id value for this SGroup.
     * 
     * @return outer_cust_id
     */
    public java.lang.String getOuter_cust_id() {
        return outer_cust_id;
    }


    /**
     * Sets the outer_cust_id value for this SGroup.
     * 
     * @param outer_cust_id
     */
    public void setOuter_cust_id(java.lang.String outer_cust_id) {
        this.outer_cust_id = outer_cust_id;
    }


    /**
     * Gets the cust_id value for this SGroup.
     * 
     * @return cust_id
     */
    public java.lang.Long getCust_id() {
        return cust_id;
    }


    /**
     * Sets the cust_id value for this SGroup.
     * 
     * @param cust_id
     */
    public void setCust_id(java.lang.Long cust_id) {
        this.cust_id = cust_id;
    }


    /**
     * Gets the valid_date value for this SGroup.
     * 
     * @return valid_date
     */
    public java.lang.String getValid_date() {
        return valid_date;
    }


    /**
     * Sets the valid_date value for this SGroup.
     * 
     * @param valid_date
     */
    public void setValid_date(java.lang.String valid_date) {
        this.valid_date = valid_date;
    }


    /**
     * Gets the expire_date value for this SGroup.
     * 
     * @return expire_date
     */
    public java.lang.String getExpire_date() {
        return expire_date;
    }


    /**
     * Sets the expire_date value for this SGroup.
     * 
     * @param expire_date
     */
    public void setExpire_date(java.lang.String expire_date) {
        this.expire_date = expire_date;
    }


    /**
     * Gets the cLIP_flag value for this SGroup.
     * 
     * @return cLIP_flag
     */
    public java.lang.Integer getCLIP_flag() {
        return cLIP_flag;
    }


    /**
     * Sets the cLIP_flag value for this SGroup.
     * 
     * @param cLIP_flag
     */
    public void setCLIP_flag(java.lang.Integer cLIP_flag) {
        this.cLIP_flag = cLIP_flag;
    }


    /**
     * Gets the outGoing_cs_flag value for this SGroup.
     * 
     * @return outGoing_cs_flag
     */
    public java.lang.Integer getOutGoing_cs_flag() {
        return outGoing_cs_flag;
    }


    /**
     * Sets the outGoing_cs_flag value for this SGroup.
     * 
     * @param outGoing_cs_flag
     */
    public void setOutGoing_cs_flag(java.lang.Integer outGoing_cs_flag) {
        this.outGoing_cs_flag = outGoing_cs_flag;
    }


    /**
     * Gets the ocs_routing_flag value for this SGroup.
     * 
     * @return ocs_routing_flag
     */
    public java.lang.Integer getOcs_routing_flag() {
        return ocs_routing_flag;
    }


    /**
     * Sets the ocs_routing_flag value for this SGroup.
     * 
     * @param ocs_routing_flag
     */
    public void setOcs_routing_flag(java.lang.Integer ocs_routing_flag) {
        this.ocs_routing_flag = ocs_routing_flag;
    }


    /**
     * Gets the espace_flag value for this SGroup.
     * 
     * @return espace_flag
     */
    public java.lang.Integer getEspace_flag() {
        return espace_flag;
    }


    /**
     * Sets the espace_flag value for this SGroup.
     * 
     * @param espace_flag
     */
    public void setEspace_flag(java.lang.Integer espace_flag) {
        this.espace_flag = espace_flag;
    }


    /**
     * Gets the specail_number_list value for this SGroup.
     * 
     * @return specail_number_list
     */
    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.SpecialNumber[] getSpecail_number_list() {
        return specail_number_list;
    }


    /**
     * Sets the specail_number_list value for this SGroup.
     * 
     * @param specail_number_list
     */
    public void setSpecail_number_list(com.asiainfo.crm.cm.dk.ws.imsqueryservice.SpecialNumber[] specail_number_list) {
        this.specail_number_list = specail_number_list;
    }


    /**
     * Gets the inGroupOutgoingCall value for this SGroup.
     * 
     * @return inGroupOutgoingCall
     */
    public java.lang.Integer getInGroupOutgoingCall() {
        return inGroupOutgoingCall;
    }


    /**
     * Sets the inGroupOutgoingCall value for this SGroup.
     * 
     * @param inGroupOutgoingCall
     */
    public void setInGroupOutgoingCall(java.lang.Integer inGroupOutgoingCall) {
        this.inGroupOutgoingCall = inGroupOutgoingCall;
    }


    /**
     * Gets the inGroupIncomingCall value for this SGroup.
     * 
     * @return inGroupIncomingCall
     */
    public java.lang.Integer getInGroupIncomingCall() {
        return inGroupIncomingCall;
    }


    /**
     * Sets the inGroupIncomingCall value for this SGroup.
     * 
     * @param inGroupIncomingCall
     */
    public void setInGroupIncomingCall(java.lang.Integer inGroupIncomingCall) {
        this.inGroupIncomingCall = inGroupIncomingCall;
    }


    /**
     * Gets the crossGroupOutgoingCall value for this SGroup.
     * 
     * @return crossGroupOutgoingCall
     */
    public java.lang.Integer getCrossGroupOutgoingCall() {
        return crossGroupOutgoingCall;
    }


    /**
     * Sets the crossGroupOutgoingCall value for this SGroup.
     * 
     * @param crossGroupOutgoingCall
     */
    public void setCrossGroupOutgoingCall(java.lang.Integer crossGroupOutgoingCall) {
        this.crossGroupOutgoingCall = crossGroupOutgoingCall;
    }


    /**
     * Gets the crossGroupIncomingCall value for this SGroup.
     * 
     * @return crossGroupIncomingCall
     */
    public java.lang.Integer getCrossGroupIncomingCall() {
        return crossGroupIncomingCall;
    }


    /**
     * Sets the crossGroupIncomingCall value for this SGroup.
     * 
     * @param crossGroupIncomingCall
     */
    public void setCrossGroupIncomingCall(java.lang.Integer crossGroupIncomingCall) {
        this.crossGroupIncomingCall = crossGroupIncomingCall;
    }


    /**
     * Gets the outGroupOutgingCall value for this SGroup.
     * 
     * @return outGroupOutgingCall
     */
    public java.lang.Integer getOutGroupOutgingCall() {
        return outGroupOutgingCall;
    }


    /**
     * Sets the outGroupOutgingCall value for this SGroup.
     * 
     * @param outGroupOutgingCall
     */
    public void setOutGroupOutgingCall(java.lang.Integer outGroupOutgingCall) {
        this.outGroupOutgingCall = outGroupOutgingCall;
    }


    /**
     * Gets the outGroupIncomingCall value for this SGroup.
     * 
     * @return outGroupIncomingCall
     */
    public java.lang.Integer getOutGroupIncomingCall() {
        return outGroupIncomingCall;
    }


    /**
     * Sets the outGroupIncomingCall value for this SGroup.
     * 
     * @param outGroupIncomingCall
     */
    public void setOutGroupIncomingCall(java.lang.Integer outGroupIncomingCall) {
        this.outGroupIncomingCall = outGroupIncomingCall;
    }


    /**
     * Gets the specOutgoingCall value for this SGroup.
     * 
     * @return specOutgoingCall
     */
    public java.lang.Integer getSpecOutgoingCall() {
        return specOutgoingCall;
    }


    /**
     * Sets the specOutgoingCall value for this SGroup.
     * 
     * @param specOutgoingCall
     */
    public void setSpecOutgoingCall(java.lang.Integer specOutgoingCall) {
        this.specOutgoingCall = specOutgoingCall;
    }


    /**
     * Gets the specIncomingCall value for this SGroup.
     * 
     * @return specIncomingCall
     */
    public java.lang.Integer getSpecIncomingCall() {
        return specIncomingCall;
    }


    /**
     * Sets the specIncomingCall value for this SGroup.
     * 
     * @param specIncomingCall
     */
    public void setSpecIncomingCall(java.lang.Integer specIncomingCall) {
        this.specIncomingCall = specIncomingCall;
    }


    /**
     * Gets the main_resource_id value for this SGroup.
     * 
     * @return main_resource_id
     */
    public java.lang.Long getMain_resource_id() {
        return main_resource_id;
    }


    /**
     * Sets the main_resource_id value for this SGroup.
     * 
     * @param main_resource_id
     */
    public void setMain_resource_id(java.lang.Long main_resource_id) {
        this.main_resource_id = main_resource_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SGroup)) return false;
        SGroup other = (SGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.outer_group_id==null && other.getOuter_group_id()==null) || 
             (this.outer_group_id!=null &&
              this.outer_group_id.equals(other.getOuter_group_id()))) &&
            ((this.group_id==null && other.getGroup_id()==null) || 
             (this.group_id!=null &&
              this.group_id.equals(other.getGroup_id()))) &&
            ((this.outer_parent_group_id==null && other.getOuter_parent_group_id()==null) || 
             (this.outer_parent_group_id!=null &&
              this.outer_parent_group_id.equals(other.getOuter_parent_group_id()))) &&
            ((this.parent_group_id==null && other.getParent_group_id()==null) || 
             (this.parent_group_id!=null &&
              this.parent_group_id.equals(other.getParent_group_id()))) &&
            ((this.main_phone_id==null && other.getMain_phone_id()==null) || 
             (this.main_phone_id!=null &&
              this.main_phone_id.equals(other.getMain_phone_id()))) &&
            ((this.max_group_number==null && other.getMax_group_number()==null) || 
             (this.max_group_number!=null &&
              this.max_group_number.equals(other.getMax_group_number()))) &&
            ((this.group_type==null && other.getGroup_type()==null) || 
             (this.group_type!=null &&
              this.group_type.equals(other.getGroup_type()))) &&
            ((this.group_name==null && other.getGroup_name()==null) || 
             (this.group_name!=null &&
              this.group_name.equals(other.getGroup_name()))) &&
            ((this.contact_phone==null && other.getContact_phone()==null) || 
             (this.contact_phone!=null &&
              this.contact_phone.equals(other.getContact_phone()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.outer_billable_acct_id==null && other.getOuter_billable_acct_id()==null) || 
             (this.outer_billable_acct_id!=null &&
              this.outer_billable_acct_id.equals(other.getOuter_billable_acct_id()))) &&
            ((this.billable_acct_id==null && other.getBillable_acct_id()==null) || 
             (this.billable_acct_id!=null &&
              this.billable_acct_id.equals(other.getBillable_acct_id()))) &&
            ((this.outer_cust_id==null && other.getOuter_cust_id()==null) || 
             (this.outer_cust_id!=null &&
              this.outer_cust_id.equals(other.getOuter_cust_id()))) &&
            ((this.cust_id==null && other.getCust_id()==null) || 
             (this.cust_id!=null &&
              this.cust_id.equals(other.getCust_id()))) &&
            ((this.valid_date==null && other.getValid_date()==null) || 
             (this.valid_date!=null &&
              this.valid_date.equals(other.getValid_date()))) &&
            ((this.expire_date==null && other.getExpire_date()==null) || 
             (this.expire_date!=null &&
              this.expire_date.equals(other.getExpire_date()))) &&
            ((this.cLIP_flag==null && other.getCLIP_flag()==null) || 
             (this.cLIP_flag!=null &&
              this.cLIP_flag.equals(other.getCLIP_flag()))) &&
            ((this.outGoing_cs_flag==null && other.getOutGoing_cs_flag()==null) || 
             (this.outGoing_cs_flag!=null &&
              this.outGoing_cs_flag.equals(other.getOutGoing_cs_flag()))) &&
            ((this.ocs_routing_flag==null && other.getOcs_routing_flag()==null) || 
             (this.ocs_routing_flag!=null &&
              this.ocs_routing_flag.equals(other.getOcs_routing_flag()))) &&
            ((this.espace_flag==null && other.getEspace_flag()==null) || 
             (this.espace_flag!=null &&
              this.espace_flag.equals(other.getEspace_flag()))) &&
            ((this.specail_number_list==null && other.getSpecail_number_list()==null) || 
             (this.specail_number_list!=null &&
              java.util.Arrays.equals(this.specail_number_list, other.getSpecail_number_list()))) &&
            ((this.inGroupOutgoingCall==null && other.getInGroupOutgoingCall()==null) || 
             (this.inGroupOutgoingCall!=null &&
              this.inGroupOutgoingCall.equals(other.getInGroupOutgoingCall()))) &&
            ((this.inGroupIncomingCall==null && other.getInGroupIncomingCall()==null) || 
             (this.inGroupIncomingCall!=null &&
              this.inGroupIncomingCall.equals(other.getInGroupIncomingCall()))) &&
            ((this.crossGroupOutgoingCall==null && other.getCrossGroupOutgoingCall()==null) || 
             (this.crossGroupOutgoingCall!=null &&
              this.crossGroupOutgoingCall.equals(other.getCrossGroupOutgoingCall()))) &&
            ((this.crossGroupIncomingCall==null && other.getCrossGroupIncomingCall()==null) || 
             (this.crossGroupIncomingCall!=null &&
              this.crossGroupIncomingCall.equals(other.getCrossGroupIncomingCall()))) &&
            ((this.outGroupOutgingCall==null && other.getOutGroupOutgingCall()==null) || 
             (this.outGroupOutgingCall!=null &&
              this.outGroupOutgingCall.equals(other.getOutGroupOutgingCall()))) &&
            ((this.outGroupIncomingCall==null && other.getOutGroupIncomingCall()==null) || 
             (this.outGroupIncomingCall!=null &&
              this.outGroupIncomingCall.equals(other.getOutGroupIncomingCall()))) &&
            ((this.specOutgoingCall==null && other.getSpecOutgoingCall()==null) || 
             (this.specOutgoingCall!=null &&
              this.specOutgoingCall.equals(other.getSpecOutgoingCall()))) &&
            ((this.specIncomingCall==null && other.getSpecIncomingCall()==null) || 
             (this.specIncomingCall!=null &&
              this.specIncomingCall.equals(other.getSpecIncomingCall()))) &&
            ((this.main_resource_id==null && other.getMain_resource_id()==null) || 
             (this.main_resource_id!=null &&
              this.main_resource_id.equals(other.getMain_resource_id())));
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
        if (getOuter_group_id() != null) {
            _hashCode += getOuter_group_id().hashCode();
        }
        if (getGroup_id() != null) {
            _hashCode += getGroup_id().hashCode();
        }
        if (getOuter_parent_group_id() != null) {
            _hashCode += getOuter_parent_group_id().hashCode();
        }
        if (getParent_group_id() != null) {
            _hashCode += getParent_group_id().hashCode();
        }
        if (getMain_phone_id() != null) {
            _hashCode += getMain_phone_id().hashCode();
        }
        if (getMax_group_number() != null) {
            _hashCode += getMax_group_number().hashCode();
        }
        if (getGroup_type() != null) {
            _hashCode += getGroup_type().hashCode();
        }
        if (getGroup_name() != null) {
            _hashCode += getGroup_name().hashCode();
        }
        if (getContact_phone() != null) {
            _hashCode += getContact_phone().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getOuter_billable_acct_id() != null) {
            _hashCode += getOuter_billable_acct_id().hashCode();
        }
        if (getBillable_acct_id() != null) {
            _hashCode += getBillable_acct_id().hashCode();
        }
        if (getOuter_cust_id() != null) {
            _hashCode += getOuter_cust_id().hashCode();
        }
        if (getCust_id() != null) {
            _hashCode += getCust_id().hashCode();
        }
        if (getValid_date() != null) {
            _hashCode += getValid_date().hashCode();
        }
        if (getExpire_date() != null) {
            _hashCode += getExpire_date().hashCode();
        }
        if (getCLIP_flag() != null) {
            _hashCode += getCLIP_flag().hashCode();
        }
        if (getOutGoing_cs_flag() != null) {
            _hashCode += getOutGoing_cs_flag().hashCode();
        }
        if (getOcs_routing_flag() != null) {
            _hashCode += getOcs_routing_flag().hashCode();
        }
        if (getEspace_flag() != null) {
            _hashCode += getEspace_flag().hashCode();
        }
        if (getSpecail_number_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpecail_number_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpecail_number_list(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInGroupOutgoingCall() != null) {
            _hashCode += getInGroupOutgoingCall().hashCode();
        }
        if (getInGroupIncomingCall() != null) {
            _hashCode += getInGroupIncomingCall().hashCode();
        }
        if (getCrossGroupOutgoingCall() != null) {
            _hashCode += getCrossGroupOutgoingCall().hashCode();
        }
        if (getCrossGroupIncomingCall() != null) {
            _hashCode += getCrossGroupIncomingCall().hashCode();
        }
        if (getOutGroupOutgingCall() != null) {
            _hashCode += getOutGroupOutgingCall().hashCode();
        }
        if (getOutGroupIncomingCall() != null) {
            _hashCode += getOutGroupIncomingCall().hashCode();
        }
        if (getSpecOutgoingCall() != null) {
            _hashCode += getSpecOutgoingCall().hashCode();
        }
        if (getSpecIncomingCall() != null) {
            _hashCode += getSpecIncomingCall().hashCode();
        }
        if (getMain_resource_id() != null) {
            _hashCode += getMain_resource_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outer_group_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outer_group_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "group_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outer_parent_group_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outer_parent_group_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent_group_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parent_group_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("main_phone_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "main_phone_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("max_group_number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "max_group_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "group_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "group_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact_phone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contact_phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("valid_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valid_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expire_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expire_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CLIP_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cLIP_flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outGoing_cs_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outGoing_cs_flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ocs_routing_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ocs_routing_flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("espace_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "espace_flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specail_number_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "specail_number_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "specialNumber"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "specialNumberList_Item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inGroupOutgoingCall");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inGroupOutgoingCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inGroupIncomingCall");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inGroupIncomingCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crossGroupOutgoingCall");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crossGroupOutgoingCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crossGroupIncomingCall");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crossGroupIncomingCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outGroupOutgingCall");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outGroupOutgingCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outGroupIncomingCall");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outGroupIncomingCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specOutgoingCall");
        elemField.setXmlName(new javax.xml.namespace.QName("", "specOutgoingCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specIncomingCall");
        elemField.setXmlName(new javax.xml.namespace.QName("", "specIncomingCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("main_resource_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "main_resource_id"));
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
