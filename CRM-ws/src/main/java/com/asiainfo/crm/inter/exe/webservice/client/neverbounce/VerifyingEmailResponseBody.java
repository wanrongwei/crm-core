/**
 * VerifyingEmailResponseBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.neverbounce;

public class VerifyingEmailResponseBody  implements java.io.Serializable {
    private java.lang.String status;

    private java.lang.String result;

    private java.lang.String[] flags;

    private java.lang.String suggested_correction;

    private java.lang.String message;

    private java.lang.String execution_time;

    private java.lang.String isrun;

    public VerifyingEmailResponseBody() {
    }

    public VerifyingEmailResponseBody(
           java.lang.String status,
           java.lang.String result,
           java.lang.String[] flags,
           java.lang.String suggested_correction,
           java.lang.String message,
           java.lang.String execution_time,
           java.lang.String isrun) {
           this.status = status;
           this.result = result;
           this.flags = flags;
           this.suggested_correction = suggested_correction;
           this.message = message;
           this.execution_time = execution_time;
           this.isrun = isrun;
    }


    /**
     * Gets the status value for this VerifyingEmailResponseBody.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this VerifyingEmailResponseBody.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the result value for this VerifyingEmailResponseBody.
     * 
     * @return result
     */
    public java.lang.String getResult() {
        return result;
    }


    /**
     * Sets the result value for this VerifyingEmailResponseBody.
     * 
     * @param result
     */
    public void setResult(java.lang.String result) {
        this.result = result;
    }


    /**
     * Gets the flags value for this VerifyingEmailResponseBody.
     * 
     * @return flags
     */
    public java.lang.String[] getFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this VerifyingEmailResponseBody.
     * 
     * @param flags
     */
    public void setFlags(java.lang.String[] flags) {
        this.flags = flags;
    }

    public java.lang.String getFlags(int i) {
        return this.flags[i];
    }

    public void setFlags(int i, java.lang.String _value) {
        this.flags[i] = _value;
    }


    /**
     * Gets the suggested_correction value for this VerifyingEmailResponseBody.
     * 
     * @return suggested_correction
     */
    public java.lang.String getSuggested_correction() {
        return suggested_correction;
    }


    /**
     * Sets the suggested_correction value for this VerifyingEmailResponseBody.
     * 
     * @param suggested_correction
     */
    public void setSuggested_correction(java.lang.String suggested_correction) {
        this.suggested_correction = suggested_correction;
    }


    /**
     * Gets the message value for this VerifyingEmailResponseBody.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this VerifyingEmailResponseBody.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the execution_time value for this VerifyingEmailResponseBody.
     * 
     * @return execution_time
     */
    public java.lang.String getExecution_time() {
        return execution_time;
    }


    /**
     * Sets the execution_time value for this VerifyingEmailResponseBody.
     * 
     * @param execution_time
     */
    public void setExecution_time(java.lang.String execution_time) {
        this.execution_time = execution_time;
    }


    /**
     * Gets the isrun value for this VerifyingEmailResponseBody.
     * 
     * @return isrun
     */
    public java.lang.String getIsrun() {
        return isrun;
    }


    /**
     * Sets the isrun value for this VerifyingEmailResponseBody.
     * 
     * @param isrun
     */
    public void setIsrun(java.lang.String isrun) {
        this.isrun = isrun;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VerifyingEmailResponseBody)) return false;
        VerifyingEmailResponseBody other = (VerifyingEmailResponseBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            ((this.flags==null && other.getFlags()==null) || 
             (this.flags!=null &&
              java.util.Arrays.equals(this.flags, other.getFlags()))) &&
            ((this.suggested_correction==null && other.getSuggested_correction()==null) || 
             (this.suggested_correction!=null &&
              this.suggested_correction.equals(other.getSuggested_correction()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.execution_time==null && other.getExecution_time()==null) || 
             (this.execution_time!=null &&
              this.execution_time.equals(other.getExecution_time()))) &&
            ((this.isrun==null && other.getIsrun()==null) || 
             (this.isrun!=null &&
              this.isrun.equals(other.getIsrun())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        if (getFlags() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFlags());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFlags(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSuggested_correction() != null) {
            _hashCode += getSuggested_correction().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getExecution_time() != null) {
            _hashCode += getExecution_time().hashCode();
        }
        if (getIsrun() != null) {
            _hashCode += getIsrun().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VerifyingEmailResponseBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "verifyingEmailResponseBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suggested_correction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "suggested_correction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("execution_time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "execution_time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isrun");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isrun"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
