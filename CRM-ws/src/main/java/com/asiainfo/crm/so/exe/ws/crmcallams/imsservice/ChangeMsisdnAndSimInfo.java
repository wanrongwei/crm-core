/**
 * ChangeMsisdnAndSimInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsservice;

public class ChangeMsisdnAndSimInfo  implements java.io.Serializable {
    private java.lang.String outer_cust_id;

    private java.lang.Long cust_id;

    private java.lang.String outer_acct_id;

    private java.lang.Long acct_id;

    private java.lang.Long user_id;

    private java.lang.String phone_id;

    private java.lang.Short change_type;

    private java.lang.String new_phone_id;

    private java.lang.String old_imsi;

    private java.lang.String new_imsi;

    private java.lang.Short notification_flag;

    private java.lang.String new_serial_no;

    private java.lang.String old_serial_no;

    public ChangeMsisdnAndSimInfo() {
    }

    public ChangeMsisdnAndSimInfo(
           java.lang.String outer_cust_id,
           java.lang.Long cust_id,
           java.lang.String outer_acct_id,
           java.lang.Long acct_id,
           java.lang.Long user_id,
           java.lang.String phone_id,
           java.lang.Short change_type,
           java.lang.String new_phone_id,
           java.lang.String old_imsi,
           java.lang.String new_imsi,
           java.lang.Short notification_flag,
           java.lang.String new_serial_no,
           java.lang.String old_serial_no) {
           this.outer_cust_id = outer_cust_id;
           this.cust_id = cust_id;
           this.outer_acct_id = outer_acct_id;
           this.acct_id = acct_id;
           this.user_id = user_id;
           this.phone_id = phone_id;
           this.change_type = change_type;
           this.new_phone_id = new_phone_id;
           this.old_imsi = old_imsi;
           this.new_imsi = new_imsi;
           this.notification_flag = notification_flag;
           this.new_serial_no = new_serial_no;
           this.old_serial_no = old_serial_no;
    }


    /**
     * Gets the outer_cust_id value for this ChangeMsisdnAndSimInfo.
     * 
     * @return outer_cust_id
     */
    public java.lang.String getOuter_cust_id() {
        return outer_cust_id;
    }


    /**
     * Sets the outer_cust_id value for this ChangeMsisdnAndSimInfo.
     * 
     * @param outer_cust_id
     */
    public void setOuter_cust_id(java.lang.String outer_cust_id) {
        this.outer_cust_id = outer_cust_id;
    }


    /**
     * Gets the cust_id value for this ChangeMsisdnAndSimInfo.
     * 
     * @return cust_id
     */
    public java.lang.Long getCust_id() {
        return cust_id;
    }


    /**
     * Sets the cust_id value for this ChangeMsisdnAndSimInfo.
     * 
     * @param cust_id
     */
    public void setCust_id(java.lang.Long cust_id) {
        this.cust_id = cust_id;
    }


    /**
     * Gets the outer_acct_id value for this ChangeMsisdnAndSimInfo.
     * 
     * @return outer_acct_id
     */
    public java.lang.String getOuter_acct_id() {
        return outer_acct_id;
    }


    /**
     * Sets the outer_acct_id value for this ChangeMsisdnAndSimInfo.
     * 
     * @param outer_acct_id
     */
    public void setOuter_acct_id(java.lang.String outer_acct_id) {
        this.outer_acct_id = outer_acct_id;
    }


    /**
     * Gets the acct_id value for this ChangeMsisdnAndSimInfo.
     * 
     * @return acct_id
     */
    public java.lang.Long getAcct_id() {
        return acct_id;
    }


    /**
     * Sets the acct_id value for this ChangeMsisdnAndSimInfo.
     * 
     * @param acct_id
     */
    public void setAcct_id(java.lang.Long acct_id) {
        this.acct_id = acct_id;
    }


    /**
     * Gets the user_id value for this ChangeMsisdnAndSimInfo.
     * 
     * @return user_id
     */
    public java.lang.Long getUser_id() {
        return user_id;
    }


    /**
     * Sets the user_id value for this ChangeMsisdnAndSimInfo.
     * 
     * @param user_id
     */
    public void setUser_id(java.lang.Long user_id) {
        this.user_id = user_id;
    }


    /**
     * Gets the phone_id value for this ChangeMsisdnAndSimInfo.
     * 
     * @return phone_id
     */
    public java.lang.String getPhone_id() {
        return phone_id;
    }


    /**
     * Sets the phone_id value for this ChangeMsisdnAndSimInfo.
     * 
     * @param phone_id
     */
    public void setPhone_id(java.lang.String phone_id) {
        this.phone_id = phone_id;
    }


    /**
     * Gets the change_type value for this ChangeMsisdnAndSimInfo.
     * 
     * @return change_type
     */
    public java.lang.Short getChange_type() {
        return change_type;
    }


    /**
     * Sets the change_type value for this ChangeMsisdnAndSimInfo.
     * 
     * @param change_type
     */
    public void setChange_type(java.lang.Short change_type) {
        this.change_type = change_type;
    }


    /**
     * Gets the new_phone_id value for this ChangeMsisdnAndSimInfo.
     * 
     * @return new_phone_id
     */
    public java.lang.String getNew_phone_id() {
        return new_phone_id;
    }


    /**
     * Sets the new_phone_id value for this ChangeMsisdnAndSimInfo.
     * 
     * @param new_phone_id
     */
    public void setNew_phone_id(java.lang.String new_phone_id) {
        this.new_phone_id = new_phone_id;
    }


    /**
     * Gets the old_imsi value for this ChangeMsisdnAndSimInfo.
     * 
     * @return old_imsi
     */
    public java.lang.String getOld_imsi() {
        return old_imsi;
    }


    /**
     * Sets the old_imsi value for this ChangeMsisdnAndSimInfo.
     * 
     * @param old_imsi
     */
    public void setOld_imsi(java.lang.String old_imsi) {
        this.old_imsi = old_imsi;
    }


    /**
     * Gets the new_imsi value for this ChangeMsisdnAndSimInfo.
     * 
     * @return new_imsi
     */
    public java.lang.String getNew_imsi() {
        return new_imsi;
    }


    /**
     * Sets the new_imsi value for this ChangeMsisdnAndSimInfo.
     * 
     * @param new_imsi
     */
    public void setNew_imsi(java.lang.String new_imsi) {
        this.new_imsi = new_imsi;
    }


    /**
     * Gets the notification_flag value for this ChangeMsisdnAndSimInfo.
     * 
     * @return notification_flag
     */
    public java.lang.Short getNotification_flag() {
        return notification_flag;
    }


    /**
     * Sets the notification_flag value for this ChangeMsisdnAndSimInfo.
     * 
     * @param notification_flag
     */
    public void setNotification_flag(java.lang.Short notification_flag) {
        this.notification_flag = notification_flag;
    }


    /**
     * Gets the new_serial_no value for this ChangeMsisdnAndSimInfo.
     * 
     * @return new_serial_no
     */
    public java.lang.String getNew_serial_no() {
        return new_serial_no;
    }


    /**
     * Sets the new_serial_no value for this ChangeMsisdnAndSimInfo.
     * 
     * @param new_serial_no
     */
    public void setNew_serial_no(java.lang.String new_serial_no) {
        this.new_serial_no = new_serial_no;
    }


    /**
     * Gets the old_serial_no value for this ChangeMsisdnAndSimInfo.
     * 
     * @return old_serial_no
     */
    public java.lang.String getOld_serial_no() {
        return old_serial_no;
    }


    /**
     * Sets the old_serial_no value for this ChangeMsisdnAndSimInfo.
     * 
     * @param old_serial_no
     */
    public void setOld_serial_no(java.lang.String old_serial_no) {
        this.old_serial_no = old_serial_no;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
    	if (obj == null) return false;
        if (!(obj instanceof ChangeMsisdnAndSimInfo)) return false;
        ChangeMsisdnAndSimInfo other = (ChangeMsisdnAndSimInfo) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
            ((this.user_id==null && other.getUser_id()==null) || 
             (this.user_id!=null &&
              this.user_id.equals(other.getUser_id()))) &&
            ((this.phone_id==null && other.getPhone_id()==null) || 
             (this.phone_id!=null &&
              this.phone_id.equals(other.getPhone_id()))) &&
            ((this.change_type==null && other.getChange_type()==null) || 
             (this.change_type!=null &&
              this.change_type.equals(other.getChange_type()))) &&
            ((this.new_phone_id==null && other.getNew_phone_id()==null) || 
             (this.new_phone_id!=null &&
              this.new_phone_id.equals(other.getNew_phone_id()))) &&
            ((this.old_imsi==null && other.getOld_imsi()==null) || 
             (this.old_imsi!=null &&
              this.old_imsi.equals(other.getOld_imsi()))) &&
            ((this.new_imsi==null && other.getNew_imsi()==null) || 
             (this.new_imsi!=null &&
              this.new_imsi.equals(other.getNew_imsi()))) &&
            ((this.notification_flag==null && other.getNotification_flag()==null) || 
             (this.notification_flag!=null &&
              this.notification_flag.equals(other.getNotification_flag()))) &&
            ((this.new_serial_no==null && other.getNew_serial_no()==null) || 
             (this.new_serial_no!=null &&
              this.new_serial_no.equals(other.getNew_serial_no()))) &&
            ((this.old_serial_no==null && other.getOld_serial_no()==null) || 
             (this.old_serial_no!=null &&
              this.old_serial_no.equals(other.getOld_serial_no())));
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
        if (getUser_id() != null) {
            _hashCode += getUser_id().hashCode();
        }
        if (getPhone_id() != null) {
            _hashCode += getPhone_id().hashCode();
        }
        if (getChange_type() != null) {
            _hashCode += getChange_type().hashCode();
        }
        if (getNew_phone_id() != null) {
            _hashCode += getNew_phone_id().hashCode();
        }
        if (getOld_imsi() != null) {
            _hashCode += getOld_imsi().hashCode();
        }
        if (getNew_imsi() != null) {
            _hashCode += getNew_imsi().hashCode();
        }
        if (getNotification_flag() != null) {
            _hashCode += getNotification_flag().hashCode();
        }
        if (getNew_serial_no() != null) {
            _hashCode += getNew_serial_no().hashCode();
        }
        if (getOld_serial_no() != null) {
            _hashCode += getOld_serial_no().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeMsisdnAndSimInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "changeMsisdnAndSimInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("new_phone_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "new_phone_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("old_imsi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "old_imsi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("new_imsi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "new_imsi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notification_flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notification_flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("new_serial_no");
        elemField.setXmlName(new javax.xml.namespace.QName("", "new_serial_no"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("old_serial_no");
        elemField.setXmlName(new javax.xml.namespace.QName("", "old_serial_no"));
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
