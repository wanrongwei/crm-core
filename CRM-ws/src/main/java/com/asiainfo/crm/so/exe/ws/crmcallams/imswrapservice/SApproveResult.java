/**
 * SApproveResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SApproveResult  implements java.io.Serializable {
    private java.lang.String adjustId;

    private java.lang.Short approveResult;

    private java.lang.Long operatorId;

    private java.lang.String approveResultDesc;

    private java.lang.String ticketId;

    public SApproveResult() {
    }

    public SApproveResult(
           java.lang.String adjustId,
           java.lang.Short approveResult,
           java.lang.Long operatorId,
           java.lang.String approveResultDesc,
           java.lang.String ticketId) {
           this.adjustId = adjustId;
           this.approveResult = approveResult;
           this.operatorId = operatorId;
           this.approveResultDesc = approveResultDesc;
           this.ticketId = ticketId;
    }


    /**
     * Gets the adjustId value for this SApproveResult.
     * 
     * @return adjustId
     */
    public java.lang.String getAdjustId() {
        return adjustId;
    }


    /**
     * Sets the adjustId value for this SApproveResult.
     * 
     * @param adjustId
     */
    public void setAdjustId(java.lang.String adjustId) {
        this.adjustId = adjustId;
    }


    /**
     * Gets the approveResult value for this SApproveResult.
     * 
     * @return approveResult
     */
    public java.lang.Short getApproveResult() {
        return approveResult;
    }


    /**
     * Sets the approveResult value for this SApproveResult.
     * 
     * @param approveResult
     */
    public void setApproveResult(java.lang.Short approveResult) {
        this.approveResult = approveResult;
    }


    /**
     * Gets the operatorId value for this SApproveResult.
     * 
     * @return operatorId
     */
    public java.lang.Long getOperatorId() {
        return operatorId;
    }


    /**
     * Sets the operatorId value for this SApproveResult.
     * 
     * @param operatorId
     */
    public void setOperatorId(java.lang.Long operatorId) {
        this.operatorId = operatorId;
    }


    /**
     * Gets the approveResultDesc value for this SApproveResult.
     * 
     * @return approveResultDesc
     */
    public java.lang.String getApproveResultDesc() {
        return approveResultDesc;
    }


    /**
     * Sets the approveResultDesc value for this SApproveResult.
     * 
     * @param approveResultDesc
     */
    public void setApproveResultDesc(java.lang.String approveResultDesc) {
        this.approveResultDesc = approveResultDesc;
    }


    /**
     * Gets the ticketId value for this SApproveResult.
     * 
     * @return ticketId
     */
    public java.lang.String getTicketId() {
        return ticketId;
    }


    /**
     * Sets the ticketId value for this SApproveResult.
     * 
     * @param ticketId
     */
    public void setTicketId(java.lang.String ticketId) {
        this.ticketId = ticketId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SApproveResult)) return false;
        SApproveResult other = (SApproveResult) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adjustId==null && other.getAdjustId()==null) || 
             (this.adjustId!=null &&
              this.adjustId.equals(other.getAdjustId()))) &&
            ((this.approveResult==null && other.getApproveResult()==null) || 
             (this.approveResult!=null &&
              this.approveResult.equals(other.getApproveResult()))) &&
            ((this.operatorId==null && other.getOperatorId()==null) || 
             (this.operatorId!=null &&
              this.operatorId.equals(other.getOperatorId()))) &&
            ((this.approveResultDesc==null && other.getApproveResultDesc()==null) || 
             (this.approveResultDesc!=null &&
              this.approveResultDesc.equals(other.getApproveResultDesc()))) &&
            ((this.ticketId==null && other.getTicketId()==null) || 
             (this.ticketId!=null &&
              this.ticketId.equals(other.getTicketId())));
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
        if (getAdjustId() != null) {
            _hashCode += getAdjustId().hashCode();
        }
        if (getApproveResult() != null) {
            _hashCode += getApproveResult().hashCode();
        }
        if (getOperatorId() != null) {
            _hashCode += getOperatorId().hashCode();
        }
        if (getApproveResultDesc() != null) {
            _hashCode += getApproveResultDesc().hashCode();
        }
        if (getTicketId() != null) {
            _hashCode += getTicketId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SApproveResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sApproveResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adjustId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approveResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approveResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operatorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approveResultDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approveResultDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ticketId"));
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
