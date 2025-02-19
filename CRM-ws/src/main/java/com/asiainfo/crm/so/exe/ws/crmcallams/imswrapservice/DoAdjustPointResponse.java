/**
 * DoAdjustPointResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class DoAdjustPointResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CrmBaseResponse  implements java.io.Serializable {
    private java.lang.Long acctId;

    private java.lang.String outerAcctId;

    private java.lang.Integer usagePoints;

    private java.lang.Integer curPoints;

    private java.lang.Long billSoNbr;

    private java.lang.String billSoDate;

    private java.lang.Integer pointItem;

    public DoAdjustPointResponse() {
    }

    public DoAdjustPointResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ResponseHead responseHead,
           java.lang.Long acctId,
           java.lang.String outerAcctId,
           java.lang.Integer usagePoints,
           java.lang.Integer curPoints,
           java.lang.Long billSoNbr,
           java.lang.String billSoDate,
           java.lang.Integer pointItem) {
        super(
            responseHead);
        this.acctId = acctId;
        this.outerAcctId = outerAcctId;
        this.usagePoints = usagePoints;
        this.curPoints = curPoints;
        this.billSoNbr = billSoNbr;
        this.billSoDate = billSoDate;
        this.pointItem = pointItem;
    }


    /**
     * Gets the acctId value for this DoAdjustPointResponse.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this DoAdjustPointResponse.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the outerAcctId value for this DoAdjustPointResponse.
     * 
     * @return outerAcctId
     */
    public java.lang.String getOuterAcctId() {
        return outerAcctId;
    }


    /**
     * Sets the outerAcctId value for this DoAdjustPointResponse.
     * 
     * @param outerAcctId
     */
    public void setOuterAcctId(java.lang.String outerAcctId) {
        this.outerAcctId = outerAcctId;
    }


    /**
     * Gets the usagePoints value for this DoAdjustPointResponse.
     * 
     * @return usagePoints
     */
    public java.lang.Integer getUsagePoints() {
        return usagePoints;
    }


    /**
     * Sets the usagePoints value for this DoAdjustPointResponse.
     * 
     * @param usagePoints
     */
    public void setUsagePoints(java.lang.Integer usagePoints) {
        this.usagePoints = usagePoints;
    }


    /**
     * Gets the curPoints value for this DoAdjustPointResponse.
     * 
     * @return curPoints
     */
    public java.lang.Integer getCurPoints() {
        return curPoints;
    }


    /**
     * Sets the curPoints value for this DoAdjustPointResponse.
     * 
     * @param curPoints
     */
    public void setCurPoints(java.lang.Integer curPoints) {
        this.curPoints = curPoints;
    }


    /**
     * Gets the billSoNbr value for this DoAdjustPointResponse.
     * 
     * @return billSoNbr
     */
    public java.lang.Long getBillSoNbr() {
        return billSoNbr;
    }


    /**
     * Sets the billSoNbr value for this DoAdjustPointResponse.
     * 
     * @param billSoNbr
     */
    public void setBillSoNbr(java.lang.Long billSoNbr) {
        this.billSoNbr = billSoNbr;
    }


    /**
     * Gets the billSoDate value for this DoAdjustPointResponse.
     * 
     * @return billSoDate
     */
    public java.lang.String getBillSoDate() {
        return billSoDate;
    }


    /**
     * Sets the billSoDate value for this DoAdjustPointResponse.
     * 
     * @param billSoDate
     */
    public void setBillSoDate(java.lang.String billSoDate) {
        this.billSoDate = billSoDate;
    }


    /**
     * Gets the pointItem value for this DoAdjustPointResponse.
     * 
     * @return pointItem
     */
    public java.lang.Integer getPointItem() {
        return pointItem;
    }


    /**
     * Sets the pointItem value for this DoAdjustPointResponse.
     * 
     * @param pointItem
     */
    public void setPointItem(java.lang.Integer pointItem) {
        this.pointItem = pointItem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoAdjustPointResponse)) return false;
        DoAdjustPointResponse other = (DoAdjustPointResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.outerAcctId==null && other.getOuterAcctId()==null) || 
             (this.outerAcctId!=null &&
              this.outerAcctId.equals(other.getOuterAcctId()))) &&
            ((this.usagePoints==null && other.getUsagePoints()==null) || 
             (this.usagePoints!=null &&
              this.usagePoints.equals(other.getUsagePoints()))) &&
            ((this.curPoints==null && other.getCurPoints()==null) || 
             (this.curPoints!=null &&
              this.curPoints.equals(other.getCurPoints()))) &&
            ((this.billSoNbr==null && other.getBillSoNbr()==null) || 
             (this.billSoNbr!=null &&
              this.billSoNbr.equals(other.getBillSoNbr()))) &&
            ((this.billSoDate==null && other.getBillSoDate()==null) || 
             (this.billSoDate!=null &&
              this.billSoDate.equals(other.getBillSoDate()))) &&
            ((this.pointItem==null && other.getPointItem()==null) || 
             (this.pointItem!=null &&
              this.pointItem.equals(other.getPointItem())));
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
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getOuterAcctId() != null) {
            _hashCode += getOuterAcctId().hashCode();
        }
        if (getUsagePoints() != null) {
            _hashCode += getUsagePoints().hashCode();
        }
        if (getCurPoints() != null) {
            _hashCode += getCurPoints().hashCode();
        }
        if (getBillSoNbr() != null) {
            _hashCode += getBillSoNbr().hashCode();
        }
        if (getBillSoDate() != null) {
            _hashCode += getBillSoDate().hashCode();
        }
        if (getPointItem() != null) {
            _hashCode += getPointItem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoAdjustPointResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAdjustPointResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outerAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usagePoints");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usagePoints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curPoints");
        elemField.setXmlName(new javax.xml.namespace.QName("", "curPoints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billSoNbr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billSoNbr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billSoDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billSoDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pointItem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pointItem"));
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
