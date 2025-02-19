/**
 * SQueryNtCdrReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SQueryNtCdrReq  implements java.io.Serializable {
    private java.lang.String start_date;

    private java.lang.String end_date;

    private java.lang.String opp_number;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ServiceType[] serviceIdList;

    private java.lang.Long acct_id;

    private java.lang.Short is_reguide;

    private java.lang.Integer call_type;

    private java.lang.Integer roam_type;

    private java.lang.Short pay_type;

    private java.lang.Integer duration;

    private java.lang.Short usage_flag;

    private java.lang.String user_number;

    public SQueryNtCdrReq() {
    }

    public SQueryNtCdrReq(
           java.lang.String start_date,
           java.lang.String end_date,
           java.lang.String opp_number,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ServiceType[] serviceIdList,
           java.lang.Long acct_id,
           java.lang.Short is_reguide,
           java.lang.Integer call_type,
           java.lang.Integer roam_type,
           java.lang.Short pay_type,
           java.lang.Integer duration,
           java.lang.Short usage_flag,
           java.lang.String user_number) {
           this.start_date = start_date;
           this.end_date = end_date;
           this.opp_number = opp_number;
           this.serviceIdList = serviceIdList;
           this.acct_id = acct_id;
           this.is_reguide = is_reguide;
           this.call_type = call_type;
           this.roam_type = roam_type;
           this.pay_type = pay_type;
           this.duration = duration;
           this.usage_flag = usage_flag;
           this.user_number = user_number;
    }


    /**
     * Gets the start_date value for this SQueryNtCdrReq.
     * 
     * @return start_date
     */
    public java.lang.String getStart_date() {
        return start_date;
    }


    /**
     * Sets the start_date value for this SQueryNtCdrReq.
     * 
     * @param start_date
     */
    public void setStart_date(java.lang.String start_date) {
        this.start_date = start_date;
    }


    /**
     * Gets the end_date value for this SQueryNtCdrReq.
     * 
     * @return end_date
     */
    public java.lang.String getEnd_date() {
        return end_date;
    }


    /**
     * Sets the end_date value for this SQueryNtCdrReq.
     * 
     * @param end_date
     */
    public void setEnd_date(java.lang.String end_date) {
        this.end_date = end_date;
    }


    /**
     * Gets the opp_number value for this SQueryNtCdrReq.
     * 
     * @return opp_number
     */
    public java.lang.String getOpp_number() {
        return opp_number;
    }


    /**
     * Sets the opp_number value for this SQueryNtCdrReq.
     * 
     * @param opp_number
     */
    public void setOpp_number(java.lang.String opp_number) {
        this.opp_number = opp_number;
    }


    /**
     * Gets the serviceIdList value for this SQueryNtCdrReq.
     * 
     * @return serviceIdList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ServiceType[] getServiceIdList() {
        return serviceIdList;
    }


    /**
     * Sets the serviceIdList value for this SQueryNtCdrReq.
     * 
     * @param serviceIdList
     */
    public void setServiceIdList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ServiceType[] serviceIdList) {
        this.serviceIdList = serviceIdList;
    }


    /**
     * Gets the acct_id value for this SQueryNtCdrReq.
     * 
     * @return acct_id
     */
    public java.lang.Long getAcct_id() {
        return acct_id;
    }


    /**
     * Sets the acct_id value for this SQueryNtCdrReq.
     * 
     * @param acct_id
     */
    public void setAcct_id(java.lang.Long acct_id) {
        this.acct_id = acct_id;
    }


    /**
     * Gets the is_reguide value for this SQueryNtCdrReq.
     * 
     * @return is_reguide
     */
    public java.lang.Short getIs_reguide() {
        return is_reguide;
    }


    /**
     * Sets the is_reguide value for this SQueryNtCdrReq.
     * 
     * @param is_reguide
     */
    public void setIs_reguide(java.lang.Short is_reguide) {
        this.is_reguide = is_reguide;
    }


    /**
     * Gets the call_type value for this SQueryNtCdrReq.
     * 
     * @return call_type
     */
    public java.lang.Integer getCall_type() {
        return call_type;
    }


    /**
     * Sets the call_type value for this SQueryNtCdrReq.
     * 
     * @param call_type
     */
    public void setCall_type(java.lang.Integer call_type) {
        this.call_type = call_type;
    }


    /**
     * Gets the roam_type value for this SQueryNtCdrReq.
     * 
     * @return roam_type
     */
    public java.lang.Integer getRoam_type() {
        return roam_type;
    }


    /**
     * Sets the roam_type value for this SQueryNtCdrReq.
     * 
     * @param roam_type
     */
    public void setRoam_type(java.lang.Integer roam_type) {
        this.roam_type = roam_type;
    }


    /**
     * Gets the pay_type value for this SQueryNtCdrReq.
     * 
     * @return pay_type
     */
    public java.lang.Short getPay_type() {
        return pay_type;
    }


    /**
     * Sets the pay_type value for this SQueryNtCdrReq.
     * 
     * @param pay_type
     */
    public void setPay_type(java.lang.Short pay_type) {
        this.pay_type = pay_type;
    }


    /**
     * Gets the duration value for this SQueryNtCdrReq.
     * 
     * @return duration
     */
    public java.lang.Integer getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this SQueryNtCdrReq.
     * 
     * @param duration
     */
    public void setDuration(java.lang.Integer duration) {
        this.duration = duration;
    }


    /**
     * Gets the usage_flag value for this SQueryNtCdrReq.
     * 
     * @return usage_flag
     */
    public java.lang.Short getUsage_flag() {
        return usage_flag;
    }


    /**
     * Sets the usage_flag value for this SQueryNtCdrReq.
     * 
     * @param usage_flag
     */
    public void setUsage_flag(java.lang.Short usage_flag) {
        this.usage_flag = usage_flag;
    }


    /**
     * Gets the user_number value for this SQueryNtCdrReq.
     * 
     * @return user_number
     */
    public java.lang.String getUser_number() {
        return user_number;
    }


    /**
     * Sets the user_number value for this SQueryNtCdrReq.
     * 
     * @param user_number
     */
    public void setUser_number(java.lang.String user_number) {
        this.user_number = user_number;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SQueryNtCdrReq)) return false;
        SQueryNtCdrReq other = (SQueryNtCdrReq) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.start_date==null && other.getStart_date()==null) || 
             (this.start_date!=null &&
              this.start_date.equals(other.getStart_date()))) &&
            ((this.end_date==null && other.getEnd_date()==null) || 
             (this.end_date!=null &&
              this.end_date.equals(other.getEnd_date()))) &&
            ((this.opp_number==null && other.getOpp_number()==null) || 
             (this.opp_number!=null &&
              this.opp_number.equals(other.getOpp_number()))) &&
            ((this.serviceIdList==null && other.getServiceIdList()==null) || 
             (this.serviceIdList!=null &&
              java.util.Arrays.equals(this.serviceIdList, other.getServiceIdList()))) &&
            ((this.acct_id==null && other.getAcct_id()==null) || 
             (this.acct_id!=null &&
              this.acct_id.equals(other.getAcct_id()))) &&
            ((this.is_reguide==null && other.getIs_reguide()==null) || 
             (this.is_reguide!=null &&
              this.is_reguide.equals(other.getIs_reguide()))) &&
            ((this.call_type==null && other.getCall_type()==null) || 
             (this.call_type!=null &&
              this.call_type.equals(other.getCall_type()))) &&
            ((this.roam_type==null && other.getRoam_type()==null) || 
             (this.roam_type!=null &&
              this.roam_type.equals(other.getRoam_type()))) &&
            ((this.pay_type==null && other.getPay_type()==null) || 
             (this.pay_type!=null &&
              this.pay_type.equals(other.getPay_type()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.usage_flag==null && other.getUsage_flag()==null) || 
             (this.usage_flag!=null &&
              this.usage_flag.equals(other.getUsage_flag()))) &&
            ((this.user_number==null && other.getUser_number()==null) || 
             (this.user_number!=null &&
              this.user_number.equals(other.getUser_number())));
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
        if (getStart_date() != null) {
            _hashCode += getStart_date().hashCode();
        }
        if (getEnd_date() != null) {
            _hashCode += getEnd_date().hashCode();
        }
        if (getOpp_number() != null) {
            _hashCode += getOpp_number().hashCode();
        }
        if (getServiceIdList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceIdList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceIdList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAcct_id() != null) {
            _hashCode += getAcct_id().hashCode();
        }
        if (getIs_reguide() != null) {
            _hashCode += getIs_reguide().hashCode();
        }
        if (getCall_type() != null) {
            _hashCode += getCall_type().hashCode();
        }
        if (getRoam_type() != null) {
            _hashCode += getRoam_type().hashCode();
        }
        if (getPay_type() != null) {
            _hashCode += getPay_type().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getUsage_flag() != null) {
            _hashCode += getUsage_flag().hashCode();
        }
        if (getUser_number() != null) {
            _hashCode += getUser_number().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SQueryNtCdrReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryNtCdrReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "start_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("end_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "end_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opp_number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "opp_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceIdList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceIdList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "serviceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "serviceType_Item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acct_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acct_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("is_reguide");
        elemField.setXmlName(new javax.xml.namespace.QName("", "is_reguide"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("call_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "call_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roam_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "roam_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pay_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usage_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usage_flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_number"));
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
