/**
 * DoQueryAcctDetailByCustReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class DoQueryAcctDetailByCustReq  extends com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.BaseQueryReq  implements java.io.Serializable {
    private java.lang.Long custId;

    private java.lang.Integer startRows;

    private java.lang.Integer endRows;

    public DoQueryAcctDetailByCustReq() {
    }

    public DoQueryAcctDetailByCustReq(
           java.lang.Long custId,
           java.lang.Integer startRows,
           java.lang.Integer endRows) {
        this.custId = custId;
        this.startRows = startRows;
        this.endRows = endRows;
    }


    /**
     * Gets the custId value for this DoQueryAcctDetailByCustReq.
     * 
     * @return custId
     */
    public java.lang.Long getCustId() {
        return custId;
    }


    /**
     * Sets the custId value for this DoQueryAcctDetailByCustReq.
     * 
     * @param custId
     */
    public void setCustId(java.lang.Long custId) {
        this.custId = custId;
    }


    /**
     * Gets the startRows value for this DoQueryAcctDetailByCustReq.
     * 
     * @return startRows
     */
    public java.lang.Integer getStartRows() {
        return startRows;
    }


    /**
     * Sets the startRows value for this DoQueryAcctDetailByCustReq.
     * 
     * @param startRows
     */
    public void setStartRows(java.lang.Integer startRows) {
        this.startRows = startRows;
    }


    /**
     * Gets the endRows value for this DoQueryAcctDetailByCustReq.
     * 
     * @return endRows
     */
    public java.lang.Integer getEndRows() {
        return endRows;
    }


    /**
     * Sets the endRows value for this DoQueryAcctDetailByCustReq.
     * 
     * @param endRows
     */
    public void setEndRows(java.lang.Integer endRows) {
        this.endRows = endRows;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryAcctDetailByCustReq)) return false;
        DoQueryAcctDetailByCustReq other = (DoQueryAcctDetailByCustReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.custId==null && other.getCustId()==null) || 
             (this.custId!=null &&
              this.custId.equals(other.getCustId()))) &&
            ((this.startRows==null && other.getStartRows()==null) || 
             (this.startRows!=null &&
              this.startRows.equals(other.getStartRows()))) &&
            ((this.endRows==null && other.getEndRows()==null) || 
             (this.endRows!=null &&
              this.endRows.equals(other.getEndRows())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCustId() != null) {
            _hashCode += getCustId().hashCode();
        }
        if (getStartRows() != null) {
            _hashCode += getStartRows().hashCode();
        }
        if (getEndRows() != null) {
            _hashCode += getEndRows().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoQueryAcctDetailByCustReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryAcctDetailByCustReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "custId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startRows");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startRows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endRows");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endRows"));
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
