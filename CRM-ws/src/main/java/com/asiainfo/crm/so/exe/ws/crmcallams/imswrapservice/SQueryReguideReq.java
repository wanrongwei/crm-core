/**
 * SQueryReguideReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SQueryReguideReq  implements java.io.Serializable {
    private java.lang.String outer_acct_id;

    private java.lang.Long acct_id;

    private java.lang.String phone_id;

    private java.lang.String invoicing_no;

    private java.lang.String begin_date;

    private java.lang.String end_date;

    private java.lang.Integer reguideFlag;

    public SQueryReguideReq() {
    }

    public SQueryReguideReq(
           java.lang.String outer_acct_id,
           java.lang.Long acct_id,
           java.lang.String phone_id,
           java.lang.String invoicing_no,
           java.lang.String begin_date,
           java.lang.String end_date,
           java.lang.Integer reguideFlag) {
           this.outer_acct_id = outer_acct_id;
           this.acct_id = acct_id;
           this.phone_id = phone_id;
           this.invoicing_no = invoicing_no;
           this.begin_date = begin_date;
           this.end_date = end_date;
           this.reguideFlag = reguideFlag;
    }


    /**
     * Gets the outer_acct_id value for this SQueryReguideReq.
     * 
     * @return outer_acct_id
     */
    public java.lang.String getOuter_acct_id() {
        return outer_acct_id;
    }


    /**
     * Sets the outer_acct_id value for this SQueryReguideReq.
     * 
     * @param outer_acct_id
     */
    public void setOuter_acct_id(java.lang.String outer_acct_id) {
        this.outer_acct_id = outer_acct_id;
    }


    /**
     * Gets the acct_id value for this SQueryReguideReq.
     * 
     * @return acct_id
     */
    public java.lang.Long getAcct_id() {
        return acct_id;
    }


    /**
     * Sets the acct_id value for this SQueryReguideReq.
     * 
     * @param acct_id
     */
    public void setAcct_id(java.lang.Long acct_id) {
        this.acct_id = acct_id;
    }


    /**
     * Gets the phone_id value for this SQueryReguideReq.
     * 
     * @return phone_id
     */
    public java.lang.String getPhone_id() {
        return phone_id;
    }


    /**
     * Sets the phone_id value for this SQueryReguideReq.
     * 
     * @param phone_id
     */
    public void setPhone_id(java.lang.String phone_id) {
        this.phone_id = phone_id;
    }


    /**
     * Gets the invoicing_no value for this SQueryReguideReq.
     * 
     * @return invoicing_no
     */
    public java.lang.String getInvoicing_no() {
        return invoicing_no;
    }


    /**
     * Sets the invoicing_no value for this SQueryReguideReq.
     * 
     * @param invoicing_no
     */
    public void setInvoicing_no(java.lang.String invoicing_no) {
        this.invoicing_no = invoicing_no;
    }


    /**
     * Gets the begin_date value for this SQueryReguideReq.
     * 
     * @return begin_date
     */
    public java.lang.String getBegin_date() {
        return begin_date;
    }


    /**
     * Sets the begin_date value for this SQueryReguideReq.
     * 
     * @param begin_date
     */
    public void setBegin_date(java.lang.String begin_date) {
        this.begin_date = begin_date;
    }


    /**
     * Gets the end_date value for this SQueryReguideReq.
     * 
     * @return end_date
     */
    public java.lang.String getEnd_date() {
        return end_date;
    }


    /**
     * Sets the end_date value for this SQueryReguideReq.
     * 
     * @param end_date
     */
    public void setEnd_date(java.lang.String end_date) {
        this.end_date = end_date;
    }


    /**
     * Gets the reguideFlag value for this SQueryReguideReq.
     * 
     * @return reguideFlag
     */
    public java.lang.Integer getReguideFlag() {
        return reguideFlag;
    }


    /**
     * Sets the reguideFlag value for this SQueryReguideReq.
     * 
     * @param reguideFlag
     */
    public void setReguideFlag(java.lang.Integer reguideFlag) {
        this.reguideFlag = reguideFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SQueryReguideReq)) return false;
        SQueryReguideReq other = (SQueryReguideReq) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.outer_acct_id==null && other.getOuter_acct_id()==null) || 
             (this.outer_acct_id!=null &&
              this.outer_acct_id.equals(other.getOuter_acct_id()))) &&
            ((this.acct_id==null && other.getAcct_id()==null) || 
             (this.acct_id!=null &&
              this.acct_id.equals(other.getAcct_id()))) &&
            ((this.phone_id==null && other.getPhone_id()==null) || 
             (this.phone_id!=null &&
              this.phone_id.equals(other.getPhone_id()))) &&
            ((this.invoicing_no==null && other.getInvoicing_no()==null) || 
             (this.invoicing_no!=null &&
              this.invoicing_no.equals(other.getInvoicing_no()))) &&
            ((this.begin_date==null && other.getBegin_date()==null) || 
             (this.begin_date!=null &&
              this.begin_date.equals(other.getBegin_date()))) &&
            ((this.end_date==null && other.getEnd_date()==null) || 
             (this.end_date!=null &&
              this.end_date.equals(other.getEnd_date()))) &&
            ((this.reguideFlag==null && other.getReguideFlag()==null) || 
             (this.reguideFlag!=null &&
              this.reguideFlag.equals(other.getReguideFlag())));
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
        if (getOuter_acct_id() != null) {
            _hashCode += getOuter_acct_id().hashCode();
        }
        if (getAcct_id() != null) {
            _hashCode += getAcct_id().hashCode();
        }
        if (getPhone_id() != null) {
            _hashCode += getPhone_id().hashCode();
        }
        if (getInvoicing_no() != null) {
            _hashCode += getInvoicing_no().hashCode();
        }
        if (getBegin_date() != null) {
            _hashCode += getBegin_date().hashCode();
        }
        if (getEnd_date() != null) {
            _hashCode += getEnd_date().hashCode();
        }
        if (getReguideFlag() != null) {
            _hashCode += getReguideFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SQueryReguideReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryReguideReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("phone_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phone_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoicing_no");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoicing_no"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("begin_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "begin_date"));
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
        elemField.setFieldName("reguideFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reguideFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
