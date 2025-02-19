/**
 * BillAmountResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class BillAmountResponse  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CrmBaseResponse  implements java.io.Serializable {
    private java.lang.Long pastDueAmount;

    private java.lang.Long currentAmount;

    private java.lang.Long arBalance;

    private java.lang.Long pendingAmount;

    private java.lang.Long totalAmount;

    private java.lang.Integer measureId;

    public BillAmountResponse() {
    }

    public BillAmountResponse(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ResponseHead responseHead,
           java.lang.Long pastDueAmount,
           java.lang.Long currentAmount,
           java.lang.Long arBalance,
           java.lang.Long pendingAmount,
           java.lang.Long totalAmount,
           java.lang.Integer measureId) {
        super(
            responseHead);
        this.pastDueAmount = pastDueAmount;
        this.currentAmount = currentAmount;
        this.arBalance = arBalance;
        this.pendingAmount = pendingAmount;
        this.totalAmount = totalAmount;
        this.measureId = measureId;
    }


    /**
     * Gets the pastDueAmount value for this BillAmountResponse.
     * 
     * @return pastDueAmount
     */
    public java.lang.Long getPastDueAmount() {
        return pastDueAmount;
    }


    /**
     * Sets the pastDueAmount value for this BillAmountResponse.
     * 
     * @param pastDueAmount
     */
    public void setPastDueAmount(java.lang.Long pastDueAmount) {
        this.pastDueAmount = pastDueAmount;
    }


    /**
     * Gets the currentAmount value for this BillAmountResponse.
     * 
     * @return currentAmount
     */
    public java.lang.Long getCurrentAmount() {
        return currentAmount;
    }


    /**
     * Sets the currentAmount value for this BillAmountResponse.
     * 
     * @param currentAmount
     */
    public void setCurrentAmount(java.lang.Long currentAmount) {
        this.currentAmount = currentAmount;
    }


    /**
     * Gets the arBalance value for this BillAmountResponse.
     * 
     * @return arBalance
     */
    public java.lang.Long getArBalance() {
        return arBalance;
    }


    /**
     * Sets the arBalance value for this BillAmountResponse.
     * 
     * @param arBalance
     */
    public void setArBalance(java.lang.Long arBalance) {
        this.arBalance = arBalance;
    }


    /**
     * Gets the pendingAmount value for this BillAmountResponse.
     * 
     * @return pendingAmount
     */
    public java.lang.Long getPendingAmount() {
        return pendingAmount;
    }


    /**
     * Sets the pendingAmount value for this BillAmountResponse.
     * 
     * @param pendingAmount
     */
    public void setPendingAmount(java.lang.Long pendingAmount) {
        this.pendingAmount = pendingAmount;
    }


    /**
     * Gets the totalAmount value for this BillAmountResponse.
     * 
     * @return totalAmount
     */
    public java.lang.Long getTotalAmount() {
        return totalAmount;
    }


    /**
     * Sets the totalAmount value for this BillAmountResponse.
     * 
     * @param totalAmount
     */
    public void setTotalAmount(java.lang.Long totalAmount) {
        this.totalAmount = totalAmount;
    }


    /**
     * Gets the measureId value for this BillAmountResponse.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this BillAmountResponse.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillAmountResponse)) return false;
        BillAmountResponse other = (BillAmountResponse) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pastDueAmount==null && other.getPastDueAmount()==null) || 
             (this.pastDueAmount!=null &&
              this.pastDueAmount.equals(other.getPastDueAmount()))) &&
            ((this.currentAmount==null && other.getCurrentAmount()==null) || 
             (this.currentAmount!=null &&
              this.currentAmount.equals(other.getCurrentAmount()))) &&
            ((this.arBalance==null && other.getArBalance()==null) || 
             (this.arBalance!=null &&
              this.arBalance.equals(other.getArBalance()))) &&
            ((this.pendingAmount==null && other.getPendingAmount()==null) || 
             (this.pendingAmount!=null &&
              this.pendingAmount.equals(other.getPendingAmount()))) &&
            ((this.totalAmount==null && other.getTotalAmount()==null) || 
             (this.totalAmount!=null &&
              this.totalAmount.equals(other.getTotalAmount()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId())));
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
        if (getPastDueAmount() != null) {
            _hashCode += getPastDueAmount().hashCode();
        }
        if (getCurrentAmount() != null) {
            _hashCode += getCurrentAmount().hashCode();
        }
        if (getArBalance() != null) {
            _hashCode += getArBalance().hashCode();
        }
        if (getPendingAmount() != null) {
            _hashCode += getPendingAmount().hashCode();
        }
        if (getTotalAmount() != null) {
            _hashCode += getTotalAmount().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillAmountResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billAmountResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pastDueAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pastDueAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currentAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pendingAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pendingAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalAmount"));
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
