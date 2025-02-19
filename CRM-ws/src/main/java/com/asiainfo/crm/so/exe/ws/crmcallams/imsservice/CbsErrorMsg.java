/**
 * CbsErrorMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsservice;

public class CbsErrorMsg  implements java.io.Serializable {
    private java.lang.String orig_so_nbr;

    private java.lang.Long so_nbr;

    private java.lang.String finish_date;

    private java.lang.Long result_code;

    private java.lang.String error_msg;

    private java.lang.String hint;

    public CbsErrorMsg() {
    }

    public CbsErrorMsg(
           java.lang.String orig_so_nbr,
           java.lang.Long so_nbr,
           java.lang.String finish_date,
           java.lang.Long result_code,
           java.lang.String error_msg,
           java.lang.String hint) {
           this.orig_so_nbr = orig_so_nbr;
           this.so_nbr = so_nbr;
           this.finish_date = finish_date;
           this.result_code = result_code;
           this.error_msg = error_msg;
           this.hint = hint;
    }


    /**
     * Gets the orig_so_nbr value for this CbsErrorMsg.
     * 
     * @return orig_so_nbr
     */
    public java.lang.String getOrig_so_nbr() {
        return orig_so_nbr;
    }


    /**
     * Sets the orig_so_nbr value for this CbsErrorMsg.
     * 
     * @param orig_so_nbr
     */
    public void setOrig_so_nbr(java.lang.String orig_so_nbr) {
        this.orig_so_nbr = orig_so_nbr;
    }


    /**
     * Gets the so_nbr value for this CbsErrorMsg.
     * 
     * @return so_nbr
     */
    public java.lang.Long getSo_nbr() {
        return so_nbr;
    }


    /**
     * Sets the so_nbr value for this CbsErrorMsg.
     * 
     * @param so_nbr
     */
    public void setSo_nbr(java.lang.Long so_nbr) {
        this.so_nbr = so_nbr;
    }


    /**
     * Gets the finish_date value for this CbsErrorMsg.
     * 
     * @return finish_date
     */
    public java.lang.String getFinish_date() {
        return finish_date;
    }


    /**
     * Sets the finish_date value for this CbsErrorMsg.
     * 
     * @param finish_date
     */
    public void setFinish_date(java.lang.String finish_date) {
        this.finish_date = finish_date;
    }


    /**
     * Gets the result_code value for this CbsErrorMsg.
     * 
     * @return result_code
     */
    public java.lang.Long getResult_code() {
        return result_code;
    }


    /**
     * Sets the result_code value for this CbsErrorMsg.
     * 
     * @param result_code
     */
    public void setResult_code(java.lang.Long result_code) {
        this.result_code = result_code;
    }


    /**
     * Gets the error_msg value for this CbsErrorMsg.
     * 
     * @return error_msg
     */
    public java.lang.String getError_msg() {
        return error_msg;
    }


    /**
     * Sets the error_msg value for this CbsErrorMsg.
     * 
     * @param error_msg
     */
    public void setError_msg(java.lang.String error_msg) {
        this.error_msg = error_msg;
    }


    /**
     * Gets the hint value for this CbsErrorMsg.
     * 
     * @return hint
     */
    public java.lang.String getHint() {
        return hint;
    }


    /**
     * Sets the hint value for this CbsErrorMsg.
     * 
     * @param hint
     */
    public void setHint(java.lang.String hint) {
        this.hint = hint;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
    	if (obj == null) return false;
        if (!(obj instanceof CbsErrorMsg)) return false;
        CbsErrorMsg other = (CbsErrorMsg) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orig_so_nbr==null && other.getOrig_so_nbr()==null) || 
             (this.orig_so_nbr!=null &&
              this.orig_so_nbr.equals(other.getOrig_so_nbr()))) &&
            ((this.so_nbr==null && other.getSo_nbr()==null) || 
             (this.so_nbr!=null &&
              this.so_nbr.equals(other.getSo_nbr()))) &&
            ((this.finish_date==null && other.getFinish_date()==null) || 
             (this.finish_date!=null &&
              this.finish_date.equals(other.getFinish_date()))) &&
            ((this.result_code==null && other.getResult_code()==null) || 
             (this.result_code!=null &&
              this.result_code.equals(other.getResult_code()))) &&
            ((this.error_msg==null && other.getError_msg()==null) || 
             (this.error_msg!=null &&
              this.error_msg.equals(other.getError_msg()))) &&
            ((this.hint==null && other.getHint()==null) || 
             (this.hint!=null &&
              this.hint.equals(other.getHint())));
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
        if (getOrig_so_nbr() != null) {
            _hashCode += getOrig_so_nbr().hashCode();
        }
        if (getSo_nbr() != null) {
            _hashCode += getSo_nbr().hashCode();
        }
        if (getFinish_date() != null) {
            _hashCode += getFinish_date().hashCode();
        }
        if (getResult_code() != null) {
            _hashCode += getResult_code().hashCode();
        }
        if (getError_msg() != null) {
            _hashCode += getError_msg().hashCode();
        }
        if (getHint() != null) {
            _hashCode += getHint().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CbsErrorMsg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "cbsErrorMsg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orig_so_nbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orig_so_nbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("so_nbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "so_nbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finish_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "finish_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "result_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error_msg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "error_msg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hint"));
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
