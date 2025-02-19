/**
 * SInstalChangeWeb.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SInstalChangeWeb  implements java.io.Serializable {
    private java.lang.Long instalId;

    private java.util.Calendar createDate;

    private java.lang.Long acctId;

    private java.lang.Boolean imeisOrDownChange;

    private java.lang.Double orgDownPayment;

    private java.lang.Double downpayment;

    private java.lang.Double instalAmount;

    private java.lang.Double eachPayment;

    private java.lang.Integer periods;

    private java.lang.Integer orgBilledCount;

    private java.lang.Double orgPreAmount;

    private java.lang.Integer orgRemainCount;

    private java.lang.Integer measureId;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SInstalOffer[] instalOfferList;

    public SInstalChangeWeb() {
    }

    public SInstalChangeWeb(
           java.lang.Long instalId,
           java.util.Calendar createDate,
           java.lang.Long acctId,
           java.lang.Boolean imeisOrDownChange,
           java.lang.Double orgDownPayment,
           java.lang.Double downpayment,
           java.lang.Double instalAmount,
           java.lang.Double eachPayment,
           java.lang.Integer periods,
           java.lang.Integer orgBilledCount,
           java.lang.Double orgPreAmount,
           java.lang.Integer orgRemainCount,
           java.lang.Integer measureId,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SInstalOffer[] instalOfferList) {
           this.instalId = instalId;
           this.createDate = createDate;
           this.acctId = acctId;
           this.imeisOrDownChange = imeisOrDownChange;
           this.orgDownPayment = orgDownPayment;
           this.downpayment = downpayment;
           this.instalAmount = instalAmount;
           this.eachPayment = eachPayment;
           this.periods = periods;
           this.orgBilledCount = orgBilledCount;
           this.orgPreAmount = orgPreAmount;
           this.orgRemainCount = orgRemainCount;
           this.measureId = measureId;
           this.instalOfferList = instalOfferList;
    }


    /**
     * Gets the instalId value for this SInstalChangeWeb.
     * 
     * @return instalId
     */
    public java.lang.Long getInstalId() {
        return instalId;
    }


    /**
     * Sets the instalId value for this SInstalChangeWeb.
     * 
     * @param instalId
     */
    public void setInstalId(java.lang.Long instalId) {
        this.instalId = instalId;
    }


    /**
     * Gets the createDate value for this SInstalChangeWeb.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this SInstalChangeWeb.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the acctId value for this SInstalChangeWeb.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SInstalChangeWeb.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the imeisOrDownChange value for this SInstalChangeWeb.
     * 
     * @return imeisOrDownChange
     */
    public java.lang.Boolean getImeisOrDownChange() {
        return imeisOrDownChange;
    }


    /**
     * Sets the imeisOrDownChange value for this SInstalChangeWeb.
     * 
     * @param imeisOrDownChange
     */
    public void setImeisOrDownChange(java.lang.Boolean imeisOrDownChange) {
        this.imeisOrDownChange = imeisOrDownChange;
    }


    /**
     * Gets the orgDownPayment value for this SInstalChangeWeb.
     * 
     * @return orgDownPayment
     */
    public java.lang.Double getOrgDownPayment() {
        return orgDownPayment;
    }


    /**
     * Sets the orgDownPayment value for this SInstalChangeWeb.
     * 
     * @param orgDownPayment
     */
    public void setOrgDownPayment(java.lang.Double orgDownPayment) {
        this.orgDownPayment = orgDownPayment;
    }


    /**
     * Gets the downpayment value for this SInstalChangeWeb.
     * 
     * @return downpayment
     */
    public java.lang.Double getDownpayment() {
        return downpayment;
    }


    /**
     * Sets the downpayment value for this SInstalChangeWeb.
     * 
     * @param downpayment
     */
    public void setDownpayment(java.lang.Double downpayment) {
        this.downpayment = downpayment;
    }


    /**
     * Gets the instalAmount value for this SInstalChangeWeb.
     * 
     * @return instalAmount
     */
    public java.lang.Double getInstalAmount() {
        return instalAmount;
    }


    /**
     * Sets the instalAmount value for this SInstalChangeWeb.
     * 
     * @param instalAmount
     */
    public void setInstalAmount(java.lang.Double instalAmount) {
        this.instalAmount = instalAmount;
    }


    /**
     * Gets the eachPayment value for this SInstalChangeWeb.
     * 
     * @return eachPayment
     */
    public java.lang.Double getEachPayment() {
        return eachPayment;
    }


    /**
     * Sets the eachPayment value for this SInstalChangeWeb.
     * 
     * @param eachPayment
     */
    public void setEachPayment(java.lang.Double eachPayment) {
        this.eachPayment = eachPayment;
    }


    /**
     * Gets the periods value for this SInstalChangeWeb.
     * 
     * @return periods
     */
    public java.lang.Integer getPeriods() {
        return periods;
    }


    /**
     * Sets the periods value for this SInstalChangeWeb.
     * 
     * @param periods
     */
    public void setPeriods(java.lang.Integer periods) {
        this.periods = periods;
    }


    /**
     * Gets the orgBilledCount value for this SInstalChangeWeb.
     * 
     * @return orgBilledCount
     */
    public java.lang.Integer getOrgBilledCount() {
        return orgBilledCount;
    }


    /**
     * Sets the orgBilledCount value for this SInstalChangeWeb.
     * 
     * @param orgBilledCount
     */
    public void setOrgBilledCount(java.lang.Integer orgBilledCount) {
        this.orgBilledCount = orgBilledCount;
    }


    /**
     * Gets the orgPreAmount value for this SInstalChangeWeb.
     * 
     * @return orgPreAmount
     */
    public java.lang.Double getOrgPreAmount() {
        return orgPreAmount;
    }


    /**
     * Sets the orgPreAmount value for this SInstalChangeWeb.
     * 
     * @param orgPreAmount
     */
    public void setOrgPreAmount(java.lang.Double orgPreAmount) {
        this.orgPreAmount = orgPreAmount;
    }


    /**
     * Gets the orgRemainCount value for this SInstalChangeWeb.
     * 
     * @return orgRemainCount
     */
    public java.lang.Integer getOrgRemainCount() {
        return orgRemainCount;
    }


    /**
     * Sets the orgRemainCount value for this SInstalChangeWeb.
     * 
     * @param orgRemainCount
     */
    public void setOrgRemainCount(java.lang.Integer orgRemainCount) {
        this.orgRemainCount = orgRemainCount;
    }


    /**
     * Gets the measureId value for this SInstalChangeWeb.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this SInstalChangeWeb.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the instalOfferList value for this SInstalChangeWeb.
     * 
     * @return instalOfferList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SInstalOffer[] getInstalOfferList() {
        return instalOfferList;
    }


    /**
     * Sets the instalOfferList value for this SInstalChangeWeb.
     * 
     * @param instalOfferList
     */
    public void setInstalOfferList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SInstalOffer[] instalOfferList) {
        this.instalOfferList = instalOfferList;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SInstalOffer getInstalOfferList(int i) {
        return this.instalOfferList[i];
    }

    public void setInstalOfferList(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SInstalOffer _value) {
        this.instalOfferList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SInstalChangeWeb)) return false;
        SInstalChangeWeb other = (SInstalChangeWeb) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.instalId==null && other.getInstalId()==null) || 
             (this.instalId!=null &&
              this.instalId.equals(other.getInstalId()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.imeisOrDownChange==null && other.getImeisOrDownChange()==null) || 
             (this.imeisOrDownChange!=null &&
              this.imeisOrDownChange.equals(other.getImeisOrDownChange()))) &&
            ((this.orgDownPayment==null && other.getOrgDownPayment()==null) || 
             (this.orgDownPayment!=null &&
              this.orgDownPayment.equals(other.getOrgDownPayment()))) &&
            ((this.downpayment==null && other.getDownpayment()==null) || 
             (this.downpayment!=null &&
              this.downpayment.equals(other.getDownpayment()))) &&
            ((this.instalAmount==null && other.getInstalAmount()==null) || 
             (this.instalAmount!=null &&
              this.instalAmount.equals(other.getInstalAmount()))) &&
            ((this.eachPayment==null && other.getEachPayment()==null) || 
             (this.eachPayment!=null &&
              this.eachPayment.equals(other.getEachPayment()))) &&
            ((this.periods==null && other.getPeriods()==null) || 
             (this.periods!=null &&
              this.periods.equals(other.getPeriods()))) &&
            ((this.orgBilledCount==null && other.getOrgBilledCount()==null) || 
             (this.orgBilledCount!=null &&
              this.orgBilledCount.equals(other.getOrgBilledCount()))) &&
            ((this.orgPreAmount==null && other.getOrgPreAmount()==null) || 
             (this.orgPreAmount!=null &&
              this.orgPreAmount.equals(other.getOrgPreAmount()))) &&
            ((this.orgRemainCount==null && other.getOrgRemainCount()==null) || 
             (this.orgRemainCount!=null &&
              this.orgRemainCount.equals(other.getOrgRemainCount()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.instalOfferList==null && other.getInstalOfferList()==null) || 
             (this.instalOfferList!=null &&
              java.util.Arrays.equals(this.instalOfferList, other.getInstalOfferList())));
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
        if (getInstalId() != null) {
            _hashCode += getInstalId().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getImeisOrDownChange() != null) {
            _hashCode += getImeisOrDownChange().hashCode();
        }
        if (getOrgDownPayment() != null) {
            _hashCode += getOrgDownPayment().hashCode();
        }
        if (getDownpayment() != null) {
            _hashCode += getDownpayment().hashCode();
        }
        if (getInstalAmount() != null) {
            _hashCode += getInstalAmount().hashCode();
        }
        if (getEachPayment() != null) {
            _hashCode += getEachPayment().hashCode();
        }
        if (getPeriods() != null) {
            _hashCode += getPeriods().hashCode();
        }
        if (getOrgBilledCount() != null) {
            _hashCode += getOrgBilledCount().hashCode();
        }
        if (getOrgPreAmount() != null) {
            _hashCode += getOrgPreAmount().hashCode();
        }
        if (getOrgRemainCount() != null) {
            _hashCode += getOrgRemainCount().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getInstalOfferList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInstalOfferList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInstalOfferList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SInstalChangeWeb.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sInstalChangeWeb"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imeisOrDownChange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imeisOrDownChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgDownPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgDownPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downpayment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "downpayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eachPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eachPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periods");
        elemField.setXmlName(new javax.xml.namespace.QName("", "periods"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgBilledCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgBilledCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgPreAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgPreAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgRemainCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgRemainCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("instalOfferList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instalOfferList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sInstalOffer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
