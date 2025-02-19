/**
 * AdjustMultiBillInReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class AdjustMultiBillInReq  implements java.io.Serializable {
    private java.lang.Long acctId;

    private java.lang.Integer measureId;

    private java.lang.String adjustReason;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AdjustMultiBillDtl[] listAdjustDtl;

    private java.lang.Long resourceId;

    public AdjustMultiBillInReq() {
    }

    public AdjustMultiBillInReq(
           java.lang.Long acctId,
           java.lang.Integer measureId,
           java.lang.String adjustReason,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AdjustMultiBillDtl[] listAdjustDtl,
           java.lang.Long resourceId) {
           this.acctId = acctId;
           this.measureId = measureId;
           this.adjustReason = adjustReason;
           this.listAdjustDtl = listAdjustDtl;
           this.resourceId = resourceId;
    }


    /**
     * Gets the acctId value for this AdjustMultiBillInReq.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this AdjustMultiBillInReq.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the measureId value for this AdjustMultiBillInReq.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this AdjustMultiBillInReq.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the adjustReason value for this AdjustMultiBillInReq.
     * 
     * @return adjustReason
     */
    public java.lang.String getAdjustReason() {
        return adjustReason;
    }


    /**
     * Sets the adjustReason value for this AdjustMultiBillInReq.
     * 
     * @param adjustReason
     */
    public void setAdjustReason(java.lang.String adjustReason) {
        this.adjustReason = adjustReason;
    }


    /**
     * Gets the listAdjustDtl value for this AdjustMultiBillInReq.
     * 
     * @return listAdjustDtl
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AdjustMultiBillDtl[] getListAdjustDtl() {
        return listAdjustDtl;
    }


    /**
     * Sets the listAdjustDtl value for this AdjustMultiBillInReq.
     * 
     * @param listAdjustDtl
     */
    public void setListAdjustDtl(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AdjustMultiBillDtl[] listAdjustDtl) {
        this.listAdjustDtl = listAdjustDtl;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AdjustMultiBillDtl getListAdjustDtl(int i) {
        return this.listAdjustDtl[i];
    }

    public void setListAdjustDtl(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AdjustMultiBillDtl _value) {
        this.listAdjustDtl[i] = _value;
    }


    /**
     * Gets the resourceId value for this AdjustMultiBillInReq.
     * 
     * @return resourceId
     */
    public java.lang.Long getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this AdjustMultiBillInReq.
     * 
     * @param resourceId
     */
    public void setResourceId(java.lang.Long resourceId) {
        this.resourceId = resourceId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdjustMultiBillInReq)) return false;
        AdjustMultiBillInReq other = (AdjustMultiBillInReq) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.adjustReason==null && other.getAdjustReason()==null) || 
             (this.adjustReason!=null &&
              this.adjustReason.equals(other.getAdjustReason()))) &&
            ((this.listAdjustDtl==null && other.getListAdjustDtl()==null) || 
             (this.listAdjustDtl!=null &&
              java.util.Arrays.equals(this.listAdjustDtl, other.getListAdjustDtl()))) &&
            ((this.resourceId==null && other.getResourceId()==null) || 
             (this.resourceId!=null &&
              this.resourceId.equals(other.getResourceId())));
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
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getAdjustReason() != null) {
            _hashCode += getAdjustReason().hashCode();
        }
        if (getListAdjustDtl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListAdjustDtl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListAdjustDtl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResourceId() != null) {
            _hashCode += getResourceId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdjustMultiBillInReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "adjustMultiBillInReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measureId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measureId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustReason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adjustReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listAdjustDtl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listAdjustDtl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "adjustMultiBillDtl"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
