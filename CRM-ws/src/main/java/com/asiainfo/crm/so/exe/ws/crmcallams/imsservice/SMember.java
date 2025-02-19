/**
 * SMember.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsservice;

public class SMember  implements java.io.Serializable {
    private java.lang.String phone_id;

    private java.lang.String short_phone_id;

    private java.lang.Integer role;

    private java.lang.String valid_date;

    private java.lang.String expire_date;

    private java.lang.Integer number_type;

    private java.lang.Integer clip_flag;

    private java.lang.String display_number;

    private java.lang.Integer espace_flag;

    private java.lang.Integer status;

    private java.lang.Integer inGroupOutgoingCall;

    private java.lang.Integer inGroupIncomingCall;

    private java.lang.Integer crossGroupOutgoingCall;

    private java.lang.Integer crossGroupIncomingCall;

    private java.lang.Integer specOutgoingCall;

    private java.lang.Integer specIncomingCall;

    private java.lang.Integer outGroupOutgingCall;

    private java.lang.Integer outGroupIncomingCall;

    private java.lang.Long group_id;

    public SMember() {
    }

    public SMember(
           java.lang.String phone_id,
           java.lang.String short_phone_id,
           java.lang.Integer role,
           java.lang.String valid_date,
           java.lang.String expire_date,
           java.lang.Integer number_type,
           java.lang.Integer clip_flag,
           java.lang.String display_number,
           java.lang.Integer espace_flag,
           java.lang.Integer status,
           java.lang.Integer inGroupOutgoingCall,
           java.lang.Integer inGroupIncomingCall,
           java.lang.Integer crossGroupOutgoingCall,
           java.lang.Integer crossGroupIncomingCall,
           java.lang.Integer specOutgoingCall,
           java.lang.Integer specIncomingCall,
           java.lang.Integer outGroupOutgingCall,
           java.lang.Integer outGroupIncomingCall,
           java.lang.Long group_id) {
           this.phone_id = phone_id;
           this.short_phone_id = short_phone_id;
           this.role = role;
           this.valid_date = valid_date;
           this.expire_date = expire_date;
           this.number_type = number_type;
           this.clip_flag = clip_flag;
           this.display_number = display_number;
           this.espace_flag = espace_flag;
           this.status = status;
           this.inGroupOutgoingCall = inGroupOutgoingCall;
           this.inGroupIncomingCall = inGroupIncomingCall;
           this.crossGroupOutgoingCall = crossGroupOutgoingCall;
           this.crossGroupIncomingCall = crossGroupIncomingCall;
           this.specOutgoingCall = specOutgoingCall;
           this.specIncomingCall = specIncomingCall;
           this.outGroupOutgingCall = outGroupOutgingCall;
           this.outGroupIncomingCall = outGroupIncomingCall;
           this.group_id = group_id;
    }


    /**
     * Gets the phone_id value for this SMember.
     * 
     * @return phone_id
     */
    public java.lang.String getPhone_id() {
        return phone_id;
    }


    /**
     * Sets the phone_id value for this SMember.
     * 
     * @param phone_id
     */
    public void setPhone_id(java.lang.String phone_id) {
        this.phone_id = phone_id;
    }


    /**
     * Gets the short_phone_id value for this SMember.
     * 
     * @return short_phone_id
     */
    public java.lang.String getShort_phone_id() {
        return short_phone_id;
    }


    /**
     * Sets the short_phone_id value for this SMember.
     * 
     * @param short_phone_id
     */
    public void setShort_phone_id(java.lang.String short_phone_id) {
        this.short_phone_id = short_phone_id;
    }


    /**
     * Gets the role value for this SMember.
     * 
     * @return role
     */
    public java.lang.Integer getRole() {
        return role;
    }


    /**
     * Sets the role value for this SMember.
     * 
     * @param role
     */
    public void setRole(java.lang.Integer role) {
        this.role = role;
    }


    /**
     * Gets the valid_date value for this SMember.
     * 
     * @return valid_date
     */
    public java.lang.String getValid_date() {
        return valid_date;
    }


    /**
     * Sets the valid_date value for this SMember.
     * 
     * @param valid_date
     */
    public void setValid_date(java.lang.String valid_date) {
        this.valid_date = valid_date;
    }


    /**
     * Gets the expire_date value for this SMember.
     * 
     * @return expire_date
     */
    public java.lang.String getExpire_date() {
        return expire_date;
    }


    /**
     * Sets the expire_date value for this SMember.
     * 
     * @param expire_date
     */
    public void setExpire_date(java.lang.String expire_date) {
        this.expire_date = expire_date;
    }


    /**
     * Gets the number_type value for this SMember.
     * 
     * @return number_type
     */
    public java.lang.Integer getNumber_type() {
        return number_type;
    }


    /**
     * Sets the number_type value for this SMember.
     * 
     * @param number_type
     */
    public void setNumber_type(java.lang.Integer number_type) {
        this.number_type = number_type;
    }


    /**
     * Gets the clip_flag value for this SMember.
     * 
     * @return clip_flag
     */
    public java.lang.Integer getClip_flag() {
        return clip_flag;
    }


    /**
     * Sets the clip_flag value for this SMember.
     * 
     * @param clip_flag
     */
    public void setClip_flag(java.lang.Integer clip_flag) {
        this.clip_flag = clip_flag;
    }


    /**
     * Gets the display_number value for this SMember.
     * 
     * @return display_number
     */
    public java.lang.String getDisplay_number() {
        return display_number;
    }


    /**
     * Sets the display_number value for this SMember.
     * 
     * @param display_number
     */
    public void setDisplay_number(java.lang.String display_number) {
        this.display_number = display_number;
    }


    /**
     * Gets the espace_flag value for this SMember.
     * 
     * @return espace_flag
     */
    public java.lang.Integer getEspace_flag() {
        return espace_flag;
    }


    /**
     * Sets the espace_flag value for this SMember.
     * 
     * @param espace_flag
     */
    public void setEspace_flag(java.lang.Integer espace_flag) {
        this.espace_flag = espace_flag;
    }


    /**
     * Gets the status value for this SMember.
     * 
     * @return status
     */
    public java.lang.Integer getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SMember.
     * 
     * @param status
     */
    public void setStatus(java.lang.Integer status) {
        this.status = status;
    }


    /**
     * Gets the inGroupOutgoingCall value for this SMember.
     * 
     * @return inGroupOutgoingCall
     */
    public java.lang.Integer getInGroupOutgoingCall() {
        return inGroupOutgoingCall;
    }


    /**
     * Sets the inGroupOutgoingCall value for this SMember.
     * 
     * @param inGroupOutgoingCall
     */
    public void setInGroupOutgoingCall(java.lang.Integer inGroupOutgoingCall) {
        this.inGroupOutgoingCall = inGroupOutgoingCall;
    }


    /**
     * Gets the inGroupIncomingCall value for this SMember.
     * 
     * @return inGroupIncomingCall
     */
    public java.lang.Integer getInGroupIncomingCall() {
        return inGroupIncomingCall;
    }


    /**
     * Sets the inGroupIncomingCall value for this SMember.
     * 
     * @param inGroupIncomingCall
     */
    public void setInGroupIncomingCall(java.lang.Integer inGroupIncomingCall) {
        this.inGroupIncomingCall = inGroupIncomingCall;
    }


    /**
     * Gets the crossGroupOutgoingCall value for this SMember.
     * 
     * @return crossGroupOutgoingCall
     */
    public java.lang.Integer getCrossGroupOutgoingCall() {
        return crossGroupOutgoingCall;
    }


    /**
     * Sets the crossGroupOutgoingCall value for this SMember.
     * 
     * @param crossGroupOutgoingCall
     */
    public void setCrossGroupOutgoingCall(java.lang.Integer crossGroupOutgoingCall) {
        this.crossGroupOutgoingCall = crossGroupOutgoingCall;
    }


    /**
     * Gets the crossGroupIncomingCall value for this SMember.
     * 
     * @return crossGroupIncomingCall
     */
    public java.lang.Integer getCrossGroupIncomingCall() {
        return crossGroupIncomingCall;
    }


    /**
     * Sets the crossGroupIncomingCall value for this SMember.
     * 
     * @param crossGroupIncomingCall
     */
    public void setCrossGroupIncomingCall(java.lang.Integer crossGroupIncomingCall) {
        this.crossGroupIncomingCall = crossGroupIncomingCall;
    }


    /**
     * Gets the specOutgoingCall value for this SMember.
     * 
     * @return specOutgoingCall
     */
    public java.lang.Integer getSpecOutgoingCall() {
        return specOutgoingCall;
    }


    /**
     * Sets the specOutgoingCall value for this SMember.
     * 
     * @param specOutgoingCall
     */
    public void setSpecOutgoingCall(java.lang.Integer specOutgoingCall) {
        this.specOutgoingCall = specOutgoingCall;
    }


    /**
     * Gets the specIncomingCall value for this SMember.
     * 
     * @return specIncomingCall
     */
    public java.lang.Integer getSpecIncomingCall() {
        return specIncomingCall;
    }


    /**
     * Sets the specIncomingCall value for this SMember.
     * 
     * @param specIncomingCall
     */
    public void setSpecIncomingCall(java.lang.Integer specIncomingCall) {
        this.specIncomingCall = specIncomingCall;
    }


    /**
     * Gets the outGroupOutgingCall value for this SMember.
     * 
     * @return outGroupOutgingCall
     */
    public java.lang.Integer getOutGroupOutgingCall() {
        return outGroupOutgingCall;
    }


    /**
     * Sets the outGroupOutgingCall value for this SMember.
     * 
     * @param outGroupOutgingCall
     */
    public void setOutGroupOutgingCall(java.lang.Integer outGroupOutgingCall) {
        this.outGroupOutgingCall = outGroupOutgingCall;
    }


    /**
     * Gets the outGroupIncomingCall value for this SMember.
     * 
     * @return outGroupIncomingCall
     */
    public java.lang.Integer getOutGroupIncomingCall() {
        return outGroupIncomingCall;
    }


    /**
     * Sets the outGroupIncomingCall value for this SMember.
     * 
     * @param outGroupIncomingCall
     */
    public void setOutGroupIncomingCall(java.lang.Integer outGroupIncomingCall) {
        this.outGroupIncomingCall = outGroupIncomingCall;
    }


    /**
     * Gets the group_id value for this SMember.
     * 
     * @return group_id
     */
    public java.lang.Long getGroup_id() {
        return group_id;
    }


    /**
     * Sets the group_id value for this SMember.
     * 
     * @param group_id
     */
    public void setGroup_id(java.lang.Long group_id) {
        this.group_id = group_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SMember)) return false;
        SMember other = (SMember) obj;
       
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.phone_id==null && other.getPhone_id()==null) || 
             (this.phone_id!=null &&
              this.phone_id.equals(other.getPhone_id()))) &&
            ((this.short_phone_id==null && other.getShort_phone_id()==null) || 
             (this.short_phone_id!=null &&
              this.short_phone_id.equals(other.getShort_phone_id()))) &&
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              this.role.equals(other.getRole()))) &&
            ((this.valid_date==null && other.getValid_date()==null) || 
             (this.valid_date!=null &&
              this.valid_date.equals(other.getValid_date()))) &&
            ((this.expire_date==null && other.getExpire_date()==null) || 
             (this.expire_date!=null &&
              this.expire_date.equals(other.getExpire_date()))) &&
            ((this.number_type==null && other.getNumber_type()==null) || 
             (this.number_type!=null &&
              this.number_type.equals(other.getNumber_type()))) &&
            ((this.clip_flag==null && other.getClip_flag()==null) || 
             (this.clip_flag!=null &&
              this.clip_flag.equals(other.getClip_flag()))) &&
            ((this.display_number==null && other.getDisplay_number()==null) || 
             (this.display_number!=null &&
              this.display_number.equals(other.getDisplay_number()))) &&
            ((this.espace_flag==null && other.getEspace_flag()==null) || 
             (this.espace_flag!=null &&
              this.espace_flag.equals(other.getEspace_flag()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
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
            ((this.group_id==null && other.getGroup_id()==null) || 
             (this.group_id!=null &&
              this.group_id.equals(other.getGroup_id())));
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
        if (getPhone_id() != null) {
            _hashCode += getPhone_id().hashCode();
        }
        if (getShort_phone_id() != null) {
            _hashCode += getShort_phone_id().hashCode();
        }
        if (getRole() != null) {
            _hashCode += getRole().hashCode();
        }
        if (getValid_date() != null) {
            _hashCode += getValid_date().hashCode();
        }
        if (getExpire_date() != null) {
            _hashCode += getExpire_date().hashCode();
        }
        if (getNumber_type() != null) {
            _hashCode += getNumber_type().hashCode();
        }
        if (getClip_flag() != null) {
            _hashCode += getClip_flag().hashCode();
        }
        if (getDisplay_number() != null) {
            _hashCode += getDisplay_number().hashCode();
        }
        if (getEspace_flag() != null) {
            _hashCode += getEspace_flag().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
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
        if (getGroup_id() != null) {
            _hashCode += getGroup_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SMember.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sMember"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phone_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("short_phone_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "short_phone_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("", "role"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("number_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "number_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("display_number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "display_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
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
        elemField.setFieldName("group_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "group_id"));
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
