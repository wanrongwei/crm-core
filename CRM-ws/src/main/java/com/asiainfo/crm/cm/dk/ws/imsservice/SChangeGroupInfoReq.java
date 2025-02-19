/**
 * SChangeGroupInfoReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class SChangeGroupInfoReq  implements java.io.Serializable {
    private java.lang.String outer_group_id;

    private java.lang.Long group_id;

    private java.lang.Integer max_group_number;

    private java.lang.String main_phone_id;

    private java.lang.String valid_date;

    private java.lang.String expire_date;

    private java.lang.String outer_billable_acct_id;

    private java.lang.Long billable_acct_id;

    private java.lang.String contact_phone;

    private java.lang.Integer clip_flag;

    private java.lang.Integer outgoing_cs_flag;

    private java.lang.Integer ocs_routing_flag;

    private java.lang.Integer espace_flag;

    private java.lang.Integer inGroupOutgoingCall;

    private java.lang.Integer inGroupIncomingCall;

    private java.lang.Integer crossGroupOutgoingCall;

    private java.lang.Integer crossGroupIncomingCall;

    private java.lang.Integer specOutgoingCall;

    private java.lang.Integer specIncomingCall;

    private java.lang.Integer outGroupOutgingCall;

    private java.lang.Integer outGroupIncomingCall;

    private java.lang.Short group_type;

    public SChangeGroupInfoReq() {
    }

    public SChangeGroupInfoReq(
           java.lang.String outer_group_id,
           java.lang.Long group_id,
           java.lang.Integer max_group_number,
           java.lang.String main_phone_id,
           java.lang.String valid_date,
           java.lang.String expire_date,
           java.lang.String outer_billable_acct_id,
           java.lang.Long billable_acct_id,
           java.lang.String contact_phone,
           java.lang.Integer clip_flag,
           java.lang.Integer outgoing_cs_flag,
           java.lang.Integer ocs_routing_flag,
           java.lang.Integer espace_flag,
           java.lang.Integer inGroupOutgoingCall,
           java.lang.Integer inGroupIncomingCall,
           java.lang.Integer crossGroupOutgoingCall,
           java.lang.Integer crossGroupIncomingCall,
           java.lang.Integer specOutgoingCall,
           java.lang.Integer specIncomingCall,
           java.lang.Integer outGroupOutgingCall,
           java.lang.Integer outGroupIncomingCall,
           java.lang.Short group_type) {
           this.outer_group_id = outer_group_id;
           this.group_id = group_id;
           this.max_group_number = max_group_number;
           this.main_phone_id = main_phone_id;
           this.valid_date = valid_date;
           this.expire_date = expire_date;
           this.outer_billable_acct_id = outer_billable_acct_id;
           this.billable_acct_id = billable_acct_id;
           this.contact_phone = contact_phone;
           this.clip_flag = clip_flag;
           this.outgoing_cs_flag = outgoing_cs_flag;
           this.ocs_routing_flag = ocs_routing_flag;
           this.espace_flag = espace_flag;
           this.inGroupOutgoingCall = inGroupOutgoingCall;
           this.inGroupIncomingCall = inGroupIncomingCall;
           this.crossGroupOutgoingCall = crossGroupOutgoingCall;
           this.crossGroupIncomingCall = crossGroupIncomingCall;
           this.specOutgoingCall = specOutgoingCall;
           this.specIncomingCall = specIncomingCall;
           this.outGroupOutgingCall = outGroupOutgingCall;
           this.outGroupIncomingCall = outGroupIncomingCall;
           this.group_type = group_type;
    }


    /**
     * Gets the outer_group_id value for this SChangeGroupInfoReq.
     * 
     * @return outer_group_id
     */
    public java.lang.String getOuter_group_id() {
        return outer_group_id;
    }


    /**
     * Sets the outer_group_id value for this SChangeGroupInfoReq.
     * 
     * @param outer_group_id
     */
    public void setOuter_group_id(java.lang.String outer_group_id) {
        this.outer_group_id = outer_group_id;
    }


    /**
     * Gets the group_id value for this SChangeGroupInfoReq.
     * 
     * @return group_id
     */
    public java.lang.Long getGroup_id() {
        return group_id;
    }


    /**
     * Sets the group_id value for this SChangeGroupInfoReq.
     * 
     * @param group_id
     */
    public void setGroup_id(java.lang.Long group_id) {
        this.group_id = group_id;
    }


    /**
     * Gets the max_group_number value for this SChangeGroupInfoReq.
     * 
     * @return max_group_number
     */
    public java.lang.Integer getMax_group_number() {
        return max_group_number;
    }


    /**
     * Sets the max_group_number value for this SChangeGroupInfoReq.
     * 
     * @param max_group_number
     */
    public void setMax_group_number(java.lang.Integer max_group_number) {
        this.max_group_number = max_group_number;
    }


    /**
     * Gets the main_phone_id value for this SChangeGroupInfoReq.
     * 
     * @return main_phone_id
     */
    public java.lang.String getMain_phone_id() {
        return main_phone_id;
    }


    /**
     * Sets the main_phone_id value for this SChangeGroupInfoReq.
     * 
     * @param main_phone_id
     */
    public void setMain_phone_id(java.lang.String main_phone_id) {
        this.main_phone_id = main_phone_id;
    }


    /**
     * Gets the valid_date value for this SChangeGroupInfoReq.
     * 
     * @return valid_date
     */
    public java.lang.String getValid_date() {
        return valid_date;
    }


    /**
     * Sets the valid_date value for this SChangeGroupInfoReq.
     * 
     * @param valid_date
     */
    public void setValid_date(java.lang.String valid_date) {
        this.valid_date = valid_date;
    }


    /**
     * Gets the expire_date value for this SChangeGroupInfoReq.
     * 
     * @return expire_date
     */
    public java.lang.String getExpire_date() {
        return expire_date;
    }


    /**
     * Sets the expire_date value for this SChangeGroupInfoReq.
     * 
     * @param expire_date
     */
    public void setExpire_date(java.lang.String expire_date) {
        this.expire_date = expire_date;
    }


    /**
     * Gets the outer_billable_acct_id value for this SChangeGroupInfoReq.
     * 
     * @return outer_billable_acct_id
     */
    public java.lang.String getOuter_billable_acct_id() {
        return outer_billable_acct_id;
    }


    /**
     * Sets the outer_billable_acct_id value for this SChangeGroupInfoReq.
     * 
     * @param outer_billable_acct_id
     */
    public void setOuter_billable_acct_id(java.lang.String outer_billable_acct_id) {
        this.outer_billable_acct_id = outer_billable_acct_id;
    }


    /**
     * Gets the billable_acct_id value for this SChangeGroupInfoReq.
     * 
     * @return billable_acct_id
     */
    public java.lang.Long getBillable_acct_id() {
        return billable_acct_id;
    }


    /**
     * Sets the billable_acct_id value for this SChangeGroupInfoReq.
     * 
     * @param billable_acct_id
     */
    public void setBillable_acct_id(java.lang.Long billable_acct_id) {
        this.billable_acct_id = billable_acct_id;
    }


    /**
     * Gets the contact_phone value for this SChangeGroupInfoReq.
     * 
     * @return contact_phone
     */
    public java.lang.String getContact_phone() {
        return contact_phone;
    }


    /**
     * Sets the contact_phone value for this SChangeGroupInfoReq.
     * 
     * @param contact_phone
     */
    public void setContact_phone(java.lang.String contact_phone) {
        this.contact_phone = contact_phone;
    }


    /**
     * Gets the clip_flag value for this SChangeGroupInfoReq.
     * 
     * @return clip_flag
     */
    public java.lang.Integer getClip_flag() {
        return clip_flag;
    }


    /**
     * Sets the clip_flag value for this SChangeGroupInfoReq.
     * 
     * @param clip_flag
     */
    public void setClip_flag(java.lang.Integer clip_flag) {
        this.clip_flag = clip_flag;
    }


    /**
     * Gets the outgoing_cs_flag value for this SChangeGroupInfoReq.
     * 
     * @return outgoing_cs_flag
     */
    public java.lang.Integer getOutgoing_cs_flag() {
        return outgoing_cs_flag;
    }


    /**
     * Sets the outgoing_cs_flag value for this SChangeGroupInfoReq.
     * 
     * @param outgoing_cs_flag
     */
    public void setOutgoing_cs_flag(java.lang.Integer outgoing_cs_flag) {
        this.outgoing_cs_flag = outgoing_cs_flag;
    }


    /**
     * Gets the ocs_routing_flag value for this SChangeGroupInfoReq.
     * 
     * @return ocs_routing_flag
     */
    public java.lang.Integer getOcs_routing_flag() {
        return ocs_routing_flag;
    }


    /**
     * Sets the ocs_routing_flag value for this SChangeGroupInfoReq.
     * 
     * @param ocs_routing_flag
     */
    public void setOcs_routing_flag(java.lang.Integer ocs_routing_flag) {
        this.ocs_routing_flag = ocs_routing_flag;
    }


    /**
     * Gets the espace_flag value for this SChangeGroupInfoReq.
     * 
     * @return espace_flag
     */
    public java.lang.Integer getEspace_flag() {
        return espace_flag;
    }


    /**
     * Sets the espace_flag value for this SChangeGroupInfoReq.
     * 
     * @param espace_flag
     */
    public void setEspace_flag(java.lang.Integer espace_flag) {
        this.espace_flag = espace_flag;
    }


    /**
     * Gets the inGroupOutgoingCall value for this SChangeGroupInfoReq.
     * 
     * @return inGroupOutgoingCall
     */
    public java.lang.Integer getInGroupOutgoingCall() {
        return inGroupOutgoingCall;
    }


    /**
     * Sets the inGroupOutgoingCall value for this SChangeGroupInfoReq.
     * 
     * @param inGroupOutgoingCall
     */
    public void setInGroupOutgoingCall(java.lang.Integer inGroupOutgoingCall) {
        this.inGroupOutgoingCall = inGroupOutgoingCall;
    }


    /**
     * Gets the inGroupIncomingCall value for this SChangeGroupInfoReq.
     * 
     * @return inGroupIncomingCall
     */
    public java.lang.Integer getInGroupIncomingCall() {
        return inGroupIncomingCall;
    }


    /**
     * Sets the inGroupIncomingCall value for this SChangeGroupInfoReq.
     * 
     * @param inGroupIncomingCall
     */
    public void setInGroupIncomingCall(java.lang.Integer inGroupIncomingCall) {
        this.inGroupIncomingCall = inGroupIncomingCall;
    }


    /**
     * Gets the crossGroupOutgoingCall value for this SChangeGroupInfoReq.
     * 
     * @return crossGroupOutgoingCall
     */
    public java.lang.Integer getCrossGroupOutgoingCall() {
        return crossGroupOutgoingCall;
    }


    /**
     * Sets the crossGroupOutgoingCall value for this SChangeGroupInfoReq.
     * 
     * @param crossGroupOutgoingCall
     */
    public void setCrossGroupOutgoingCall(java.lang.Integer crossGroupOutgoingCall) {
        this.crossGroupOutgoingCall = crossGroupOutgoingCall;
    }


    /**
     * Gets the crossGroupIncomingCall value for this SChangeGroupInfoReq.
     * 
     * @return crossGroupIncomingCall
     */
    public java.lang.Integer getCrossGroupIncomingCall() {
        return crossGroupIncomingCall;
    }


    /**
     * Sets the crossGroupIncomingCall value for this SChangeGroupInfoReq.
     * 
     * @param crossGroupIncomingCall
     */
    public void setCrossGroupIncomingCall(java.lang.Integer crossGroupIncomingCall) {
        this.crossGroupIncomingCall = crossGroupIncomingCall;
    }


    /**
     * Gets the specOutgoingCall value for this SChangeGroupInfoReq.
     * 
     * @return specOutgoingCall
     */
    public java.lang.Integer getSpecOutgoingCall() {
        return specOutgoingCall;
    }


    /**
     * Sets the specOutgoingCall value for this SChangeGroupInfoReq.
     * 
     * @param specOutgoingCall
     */
    public void setSpecOutgoingCall(java.lang.Integer specOutgoingCall) {
        this.specOutgoingCall = specOutgoingCall;
    }


    /**
     * Gets the specIncomingCall value for this SChangeGroupInfoReq.
     * 
     * @return specIncomingCall
     */
    public java.lang.Integer getSpecIncomingCall() {
        return specIncomingCall;
    }


    /**
     * Sets the specIncomingCall value for this SChangeGroupInfoReq.
     * 
     * @param specIncomingCall
     */
    public void setSpecIncomingCall(java.lang.Integer specIncomingCall) {
        this.specIncomingCall = specIncomingCall;
    }


    /**
     * Gets the outGroupOutgingCall value for this SChangeGroupInfoReq.
     * 
     * @return outGroupOutgingCall
     */
    public java.lang.Integer getOutGroupOutgingCall() {
        return outGroupOutgingCall;
    }


    /**
     * Sets the outGroupOutgingCall value for this SChangeGroupInfoReq.
     * 
     * @param outGroupOutgingCall
     */
    public void setOutGroupOutgingCall(java.lang.Integer outGroupOutgingCall) {
        this.outGroupOutgingCall = outGroupOutgingCall;
    }


    /**
     * Gets the outGroupIncomingCall value for this SChangeGroupInfoReq.
     * 
     * @return outGroupIncomingCall
     */
    public java.lang.Integer getOutGroupIncomingCall() {
        return outGroupIncomingCall;
    }


    /**
     * Sets the outGroupIncomingCall value for this SChangeGroupInfoReq.
     * 
     * @param outGroupIncomingCall
     */
    public void setOutGroupIncomingCall(java.lang.Integer outGroupIncomingCall) {
        this.outGroupIncomingCall = outGroupIncomingCall;
    }


    /**
     * Gets the group_type value for this SChangeGroupInfoReq.
     * 
     * @return group_type
     */
    public java.lang.Short getGroup_type() {
        return group_type;
    }


    /**
     * Sets the group_type value for this SChangeGroupInfoReq.
     * 
     * @param group_type
     */
    public void setGroup_type(java.lang.Short group_type) {
        this.group_type = group_type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SChangeGroupInfoReq)) return false;
        SChangeGroupInfoReq other = (SChangeGroupInfoReq) obj;
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
            ((this.max_group_number==null && other.getMax_group_number()==null) || 
             (this.max_group_number!=null &&
              this.max_group_number.equals(other.getMax_group_number()))) &&
            ((this.main_phone_id==null && other.getMain_phone_id()==null) || 
             (this.main_phone_id!=null &&
              this.main_phone_id.equals(other.getMain_phone_id()))) &&
            ((this.valid_date==null && other.getValid_date()==null) || 
             (this.valid_date!=null &&
              this.valid_date.equals(other.getValid_date()))) &&
            ((this.expire_date==null && other.getExpire_date()==null) || 
             (this.expire_date!=null &&
              this.expire_date.equals(other.getExpire_date()))) &&
            ((this.outer_billable_acct_id==null && other.getOuter_billable_acct_id()==null) || 
             (this.outer_billable_acct_id!=null &&
              this.outer_billable_acct_id.equals(other.getOuter_billable_acct_id()))) &&
            ((this.billable_acct_id==null && other.getBillable_acct_id()==null) || 
             (this.billable_acct_id!=null &&
              this.billable_acct_id.equals(other.getBillable_acct_id()))) &&
            ((this.contact_phone==null && other.getContact_phone()==null) || 
             (this.contact_phone!=null &&
              this.contact_phone.equals(other.getContact_phone()))) &&
            ((this.clip_flag==null && other.getClip_flag()==null) || 
             (this.clip_flag!=null &&
              this.clip_flag.equals(other.getClip_flag()))) &&
            ((this.outgoing_cs_flag==null && other.getOutgoing_cs_flag()==null) || 
             (this.outgoing_cs_flag!=null &&
              this.outgoing_cs_flag.equals(other.getOutgoing_cs_flag()))) &&
            ((this.ocs_routing_flag==null && other.getOcs_routing_flag()==null) || 
             (this.ocs_routing_flag!=null &&
              this.ocs_routing_flag.equals(other.getOcs_routing_flag()))) &&
            ((this.espace_flag==null && other.getEspace_flag()==null) || 
             (this.espace_flag!=null &&
              this.espace_flag.equals(other.getEspace_flag()))) &&
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
            ((this.specOutgoingCall==null && other.getSpecOutgoingCall()==null) || 
             (this.specOutgoingCall!=null &&
              this.specOutgoingCall.equals(other.getSpecOutgoingCall()))) &&
            ((this.specIncomingCall==null && other.getSpecIncomingCall()==null) || 
             (this.specIncomingCall!=null &&
              this.specIncomingCall.equals(other.getSpecIncomingCall()))) &&
            ((this.outGroupOutgingCall==null && other.getOutGroupOutgingCall()==null) || 
             (this.outGroupOutgingCall!=null &&
              this.outGroupOutgingCall.equals(other.getOutGroupOutgingCall()))) &&
            ((this.outGroupIncomingCall==null && other.getOutGroupIncomingCall()==null) || 
             (this.outGroupIncomingCall!=null &&
              this.outGroupIncomingCall.equals(other.getOutGroupIncomingCall()))) &&
            ((this.group_type==null && other.getGroup_type()==null) || 
             (this.group_type!=null &&
              this.group_type.equals(other.getGroup_type())));
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
        if (getMax_group_number() != null) {
            _hashCode += getMax_group_number().hashCode();
        }
        if (getMain_phone_id() != null) {
            _hashCode += getMain_phone_id().hashCode();
        }
        if (getValid_date() != null) {
            _hashCode += getValid_date().hashCode();
        }
        if (getExpire_date() != null) {
            _hashCode += getExpire_date().hashCode();
        }
        if (getOuter_billable_acct_id() != null) {
            _hashCode += getOuter_billable_acct_id().hashCode();
        }
        if (getBillable_acct_id() != null) {
            _hashCode += getBillable_acct_id().hashCode();
        }
        if (getContact_phone() != null) {
            _hashCode += getContact_phone().hashCode();
        }
        if (getClip_flag() != null) {
            _hashCode += getClip_flag().hashCode();
        }
        if (getOutgoing_cs_flag() != null) {
            _hashCode += getOutgoing_cs_flag().hashCode();
        }
        if (getOcs_routing_flag() != null) {
            _hashCode += getOcs_routing_flag().hashCode();
        }
        if (getEspace_flag() != null) {
            _hashCode += getEspace_flag().hashCode();
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
        if (getSpecOutgoingCall() != null) {
            _hashCode += getSpecOutgoingCall().hashCode();
        }
        if (getSpecIncomingCall() != null) {
            _hashCode += getSpecIncomingCall().hashCode();
        }
        if (getOutGroupOutgingCall() != null) {
            _hashCode += getOutGroupOutgingCall().hashCode();
        }
        if (getOutGroupIncomingCall() != null) {
            _hashCode += getOutGroupIncomingCall().hashCode();
        }
        if (getGroup_type() != null) {
            _hashCode += getGroup_type().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SChangeGroupInfoReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sChangeGroupInfoReq"));
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
        elemField.setFieldName("max_group_number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "max_group_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("contact_phone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contact_phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clip_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clip_flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outgoing_cs_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outgoing_cs_flag"));
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
        elemField.setFieldName("group_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "group_type"));
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
