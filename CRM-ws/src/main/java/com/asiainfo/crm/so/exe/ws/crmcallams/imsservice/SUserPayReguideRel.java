/**
 * SUserPayReguideRel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsservice;

public class SUserPayReguideRel  implements java.io.Serializable {
    private java.lang.Long user_id;

    private java.lang.String phone_id;

    private java.lang.String outer_cust_id;

    private java.lang.Long cust_id;

    private java.lang.String outer_acct_id;

    private java.lang.Long acct_id;

    private java.lang.Short reguide_type;

    private java.lang.Long busi_service_id;

    private java.lang.String time_segment;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SPayReguideInfo[] sPayReguideInfoList;

    private java.lang.Short oper_type;

    public SUserPayReguideRel() {
    }

    public SUserPayReguideRel(
           java.lang.Long user_id,
           java.lang.String phone_id,
           java.lang.String outer_cust_id,
           java.lang.Long cust_id,
           java.lang.String outer_acct_id,
           java.lang.Long acct_id,
           java.lang.Short reguide_type,
           java.lang.Long busi_service_id,
           java.lang.String time_segment,
           com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SPayReguideInfo[] sPayReguideInfoList,
           java.lang.Short oper_type) {
           this.user_id = user_id;
           this.phone_id = phone_id;
           this.outer_cust_id = outer_cust_id;
           this.cust_id = cust_id;
           this.outer_acct_id = outer_acct_id;
           this.acct_id = acct_id;
           this.reguide_type = reguide_type;
           this.busi_service_id = busi_service_id;
           this.time_segment = time_segment;
           this.sPayReguideInfoList = sPayReguideInfoList;
           this.oper_type = oper_type;
    }


    /**
     * Gets the user_id value for this SUserPayReguideRel.
     * 
     * @return user_id
     */
    public java.lang.Long getUser_id() {
        return user_id;
    }


    /**
     * Sets the user_id value for this SUserPayReguideRel.
     * 
     * @param user_id
     */
    public void setUser_id(java.lang.Long user_id) {
        this.user_id = user_id;
    }


    /**
     * Gets the phone_id value for this SUserPayReguideRel.
     * 
     * @return phone_id
     */
    public java.lang.String getPhone_id() {
        return phone_id;
    }


    /**
     * Sets the phone_id value for this SUserPayReguideRel.
     * 
     * @param phone_id
     */
    public void setPhone_id(java.lang.String phone_id) {
        this.phone_id = phone_id;
    }


    /**
     * Gets the outer_cust_id value for this SUserPayReguideRel.
     * 
     * @return outer_cust_id
     */
    public java.lang.String getOuter_cust_id() {
        return outer_cust_id;
    }


    /**
     * Sets the outer_cust_id value for this SUserPayReguideRel.
     * 
     * @param outer_cust_id
     */
    public void setOuter_cust_id(java.lang.String outer_cust_id) {
        this.outer_cust_id = outer_cust_id;
    }


    /**
     * Gets the cust_id value for this SUserPayReguideRel.
     * 
     * @return cust_id
     */
    public java.lang.Long getCust_id() {
        return cust_id;
    }


    /**
     * Sets the cust_id value for this SUserPayReguideRel.
     * 
     * @param cust_id
     */
    public void setCust_id(java.lang.Long cust_id) {
        this.cust_id = cust_id;
    }


    /**
     * Gets the outer_acct_id value for this SUserPayReguideRel.
     * 
     * @return outer_acct_id
     */
    public java.lang.String getOuter_acct_id() {
        return outer_acct_id;
    }


    /**
     * Sets the outer_acct_id value for this SUserPayReguideRel.
     * 
     * @param outer_acct_id
     */
    public void setOuter_acct_id(java.lang.String outer_acct_id) {
        this.outer_acct_id = outer_acct_id;
    }


    /**
     * Gets the acct_id value for this SUserPayReguideRel.
     * 
     * @return acct_id
     */
    public java.lang.Long getAcct_id() {
        return acct_id;
    }


    /**
     * Sets the acct_id value for this SUserPayReguideRel.
     * 
     * @param acct_id
     */
    public void setAcct_id(java.lang.Long acct_id) {
        this.acct_id = acct_id;
    }


    /**
     * Gets the reguide_type value for this SUserPayReguideRel.
     * 
     * @return reguide_type
     */
    public java.lang.Short getReguide_type() {
        return reguide_type;
    }


    /**
     * Sets the reguide_type value for this SUserPayReguideRel.
     * 
     * @param reguide_type
     */
    public void setReguide_type(java.lang.Short reguide_type) {
        this.reguide_type = reguide_type;
    }


    /**
     * Gets the busi_service_id value for this SUserPayReguideRel.
     * 
     * @return busi_service_id
     */
    public java.lang.Long getBusi_service_id() {
        return busi_service_id;
    }


    /**
     * Sets the busi_service_id value for this SUserPayReguideRel.
     * 
     * @param busi_service_id
     */
    public void setBusi_service_id(java.lang.Long busi_service_id) {
        this.busi_service_id = busi_service_id;
    }


    /**
     * Gets the time_segment value for this SUserPayReguideRel.
     * 
     * @return time_segment
     */
    public java.lang.String getTime_segment() {
        return time_segment;
    }


    /**
     * Sets the time_segment value for this SUserPayReguideRel.
     * 
     * @param time_segment
     */
    public void setTime_segment(java.lang.String time_segment) {
        this.time_segment = time_segment;
    }


    /**
     * Gets the sPayReguideInfoList value for this SUserPayReguideRel.
     * 
     * @return sPayReguideInfoList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SPayReguideInfo[] getSPayReguideInfoList() {
        return sPayReguideInfoList;
    }


    /**
     * Sets the sPayReguideInfoList value for this SUserPayReguideRel.
     * 
     * @param sPayReguideInfoList
     */
    public void setSPayReguideInfoList(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SPayReguideInfo[] sPayReguideInfoList) {
        this.sPayReguideInfoList = sPayReguideInfoList;
    }


    /**
     * Gets the oper_type value for this SUserPayReguideRel.
     * 
     * @return oper_type
     */
    public java.lang.Short getOper_type() {
        return oper_type;
    }


    /**
     * Sets the oper_type value for this SUserPayReguideRel.
     * 
     * @param oper_type
     */
    public void setOper_type(java.lang.Short oper_type) {
        this.oper_type = oper_type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SUserPayReguideRel)) return false;
        SUserPayReguideRel other = (SUserPayReguideRel) obj;
       
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
            ((this.reguide_type==null && other.getReguide_type()==null) || 
             (this.reguide_type!=null &&
              this.reguide_type.equals(other.getReguide_type()))) &&
            ((this.busi_service_id==null && other.getBusi_service_id()==null) || 
             (this.busi_service_id!=null &&
              this.busi_service_id.equals(other.getBusi_service_id()))) &&
            ((this.time_segment==null && other.getTime_segment()==null) || 
             (this.time_segment!=null &&
              this.time_segment.equals(other.getTime_segment()))) &&
            ((this.sPayReguideInfoList==null && other.getSPayReguideInfoList()==null) || 
             (this.sPayReguideInfoList!=null &&
              java.util.Arrays.equals(this.sPayReguideInfoList, other.getSPayReguideInfoList()))) &&
            ((this.oper_type==null && other.getOper_type()==null) || 
             (this.oper_type!=null &&
              this.oper_type.equals(other.getOper_type())));
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
        if (getReguide_type() != null) {
            _hashCode += getReguide_type().hashCode();
        }
        if (getBusi_service_id() != null) {
            _hashCode += getBusi_service_id().hashCode();
        }
        if (getTime_segment() != null) {
            _hashCode += getTime_segment().hashCode();
        }
        if (getSPayReguideInfoList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSPayReguideInfoList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSPayReguideInfoList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOper_type() != null) {
            _hashCode += getOper_type().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SUserPayReguideRel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUserPayReguideRel"));
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
        elemField.setFieldName("reguide_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reguide_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("busi_service_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "busi_service_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time_segment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "time_segment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPayReguideInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sPayReguideInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPayReguideInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "reguideInfoList_item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oper_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oper_type"));
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
