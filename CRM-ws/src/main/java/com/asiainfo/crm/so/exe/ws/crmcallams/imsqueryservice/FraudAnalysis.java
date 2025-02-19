/**
 * FraudAnalysis.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsqueryservice;

public class FraudAnalysis  implements java.io.Serializable {
    private java.lang.String reasons;

    private java.lang.String score;

    private java.lang.String status;

    private java.lang.Boolean approved;

    public FraudAnalysis() {
    }

    public FraudAnalysis(
           java.lang.String reasons,
           java.lang.String score,
           java.lang.String status,
           java.lang.Boolean approved) {
           this.reasons = reasons;
           this.score = score;
           this.status = status;
           this.approved = approved;
    }


    /**
     * Gets the reasons value for this FraudAnalysis.
     * 
     * @return reasons
     */
    public java.lang.String getReasons() {
        return reasons;
    }


    /**
     * Sets the reasons value for this FraudAnalysis.
     * 
     * @param reasons
     */
    public void setReasons(java.lang.String reasons) {
        this.reasons = reasons;
    }


    /**
     * Gets the score value for this FraudAnalysis.
     * 
     * @return score
     */
    public java.lang.String getScore() {
        return score;
    }


    /**
     * Sets the score value for this FraudAnalysis.
     * 
     * @param score
     */
    public void setScore(java.lang.String score) {
        this.score = score;
    }


    /**
     * Gets the status value for this FraudAnalysis.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this FraudAnalysis.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the approved value for this FraudAnalysis.
     * 
     * @return approved
     */
    public java.lang.Boolean getApproved() {
        return approved;
    }


    /**
     * Sets the approved value for this FraudAnalysis.
     * 
     * @param approved
     */
    public void setApproved(java.lang.Boolean approved) {
        this.approved = approved;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof FraudAnalysis)) return false;
        FraudAnalysis other = (FraudAnalysis) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reasons==null && other.getReasons()==null) || 
             (this.reasons!=null &&
              this.reasons.equals(other.getReasons()))) &&
            ((this.score==null && other.getScore()==null) || 
             (this.score!=null &&
              this.score.equals(other.getScore()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.approved==null && other.getApproved()==null) || 
             (this.approved!=null &&
              this.approved.equals(other.getApproved())));
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
        if (getReasons() != null) {
            _hashCode += getReasons().hashCode();
        }
        if (getScore() != null) {
            _hashCode += getScore().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getApproved() != null) {
            _hashCode += getApproved().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FraudAnalysis.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "fraudAnalysis"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasons");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Reasons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Score"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approved");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Approved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
