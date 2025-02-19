/**
 * SCancelOneTimeFeeReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SCancelOneTimeFeeReq  implements java.io.Serializable {
    private java.lang.String originalSoNbr;

    private java.lang.String originalSoDate;

    private java.lang.Long onetimeSeq;

    private java.lang.String remark;

    public SCancelOneTimeFeeReq() {
    }

    public SCancelOneTimeFeeReq(
           java.lang.String originalSoNbr,
           java.lang.String originalSoDate,
           java.lang.Long onetimeSeq,
           java.lang.String remark) {
           this.originalSoNbr = originalSoNbr;
           this.originalSoDate = originalSoDate;
           this.onetimeSeq = onetimeSeq;
           this.remark = remark;
    }


    /**
     * Gets the originalSoNbr value for this SCancelOneTimeFeeReq.
     * 
     * @return originalSoNbr
     */
    public java.lang.String getOriginalSoNbr() {
        return originalSoNbr;
    }


    /**
     * Sets the originalSoNbr value for this SCancelOneTimeFeeReq.
     * 
     * @param originalSoNbr
     */
    public void setOriginalSoNbr(java.lang.String originalSoNbr) {
        this.originalSoNbr = originalSoNbr;
    }


    /**
     * Gets the originalSoDate value for this SCancelOneTimeFeeReq.
     * 
     * @return originalSoDate
     */
    public java.lang.String getOriginalSoDate() {
        return originalSoDate;
    }


    /**
     * Sets the originalSoDate value for this SCancelOneTimeFeeReq.
     * 
     * @param originalSoDate
     */
    public void setOriginalSoDate(java.lang.String originalSoDate) {
        this.originalSoDate = originalSoDate;
    }


    /**
     * Gets the onetimeSeq value for this SCancelOneTimeFeeReq.
     * 
     * @return onetimeSeq
     */
    public java.lang.Long getOnetimeSeq() {
        return onetimeSeq;
    }


    /**
     * Sets the onetimeSeq value for this SCancelOneTimeFeeReq.
     * 
     * @param onetimeSeq
     */
    public void setOnetimeSeq(java.lang.Long onetimeSeq) {
        this.onetimeSeq = onetimeSeq;
    }


    /**
     * Gets the remark value for this SCancelOneTimeFeeReq.
     * 
     * @return remark
     */
    public java.lang.String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this SCancelOneTimeFeeReq.
     * 
     * @param remark
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SCancelOneTimeFeeReq)) return false;
        SCancelOneTimeFeeReq other = (SCancelOneTimeFeeReq) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.originalSoNbr==null && other.getOriginalSoNbr()==null) || 
             (this.originalSoNbr!=null &&
              this.originalSoNbr.equals(other.getOriginalSoNbr()))) &&
            ((this.originalSoDate==null && other.getOriginalSoDate()==null) || 
             (this.originalSoDate!=null &&
              this.originalSoDate.equals(other.getOriginalSoDate()))) &&
            ((this.onetimeSeq==null && other.getOnetimeSeq()==null) || 
             (this.onetimeSeq!=null &&
              this.onetimeSeq.equals(other.getOnetimeSeq()))) &&
            ((this.remark==null && other.getRemark()==null) || 
             (this.remark!=null &&
              this.remark.equals(other.getRemark())));
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
        if (getOriginalSoNbr() != null) {
            _hashCode += getOriginalSoNbr().hashCode();
        }
        if (getOriginalSoDate() != null) {
            _hashCode += getOriginalSoDate().hashCode();
        }
        if (getOnetimeSeq() != null) {
            _hashCode += getOnetimeSeq().hashCode();
        }
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SCancelOneTimeFeeReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCancelOneTimeFeeReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalSoNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originalSoNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalSoDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originalSoDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onetimeSeq");
        elemField.setXmlName(new javax.xml.namespace.QName("", "onetimeSeq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remark");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remark"));
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
