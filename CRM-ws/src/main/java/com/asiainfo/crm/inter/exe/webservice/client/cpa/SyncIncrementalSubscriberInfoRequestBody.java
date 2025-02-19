/**
 * SyncIncrementalSubscriberInfoRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.cpa;

public class SyncIncrementalSubscriberInfoRequestBody  implements java.io.Serializable {
    private java.lang.String subcriberNo;

    private long customerId;

    private long subscriberId;

    private java.lang.String subStatus;

    private java.lang.String IMSI;

    private long BAN;

    private java.lang.String customerSegment;

    private java.lang.Long tenantId;

    private java.lang.String subscriberCompany;

    private java.lang.String testSimFlag;

    private java.lang.String MVNOBrand;

    private java.lang.String equipmentNo;

    private java.lang.Long cycleType;

    private java.lang.Long cycleUnit;

    private java.lang.Long firstBilldate;

    private java.util.Calendar originalInitDate;

    private java.lang.String products;

    private java.lang.String suspensionReasonCode;

    private java.lang.String dmlAction;

    public SyncIncrementalSubscriberInfoRequestBody() {
    }

    public SyncIncrementalSubscriberInfoRequestBody(
           java.lang.String subcriberNo,
           long customerId,
           long subscriberId,
           java.lang.String subStatus,
           java.lang.String IMSI,
           long BAN,
           java.lang.String customerSegment,
           java.lang.Long tenantId,
           java.lang.String subscriberCompany,
           java.lang.String testSimFlag,
           java.lang.String MVNOBrand,
           java.lang.String equipmentNo,
           java.lang.Long cycleType,
           java.lang.Long cycleUnit,
           java.lang.Long firstBilldate,
           java.util.Calendar originalInitDate,
           java.lang.String products,
           java.lang.String suspensionReasonCode,
           java.lang.String dmlAction) {
           this.subcriberNo = subcriberNo;
           this.customerId = customerId;
           this.subscriberId = subscriberId;
           this.subStatus = subStatus;
           this.IMSI = IMSI;
           this.BAN = BAN;
           this.customerSegment = customerSegment;
           this.tenantId = tenantId;
           this.subscriberCompany = subscriberCompany;
           this.testSimFlag = testSimFlag;
           this.MVNOBrand = MVNOBrand;
           this.equipmentNo = equipmentNo;
           this.cycleType = cycleType;
           this.cycleUnit = cycleUnit;
           this.firstBilldate = firstBilldate;
           this.originalInitDate = originalInitDate;
           this.products = products;
           this.suspensionReasonCode = suspensionReasonCode;
           this.dmlAction = dmlAction;
    }


    /**
     * Gets the subcriberNo value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @return subcriberNo
     */
    public java.lang.String getSubcriberNo() {
        return subcriberNo;
    }


    /**
     * Sets the subcriberNo value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @param subcriberNo
     */
    public void setSubcriberNo(java.lang.String subcriberNo) {
        this.subcriberNo = subcriberNo;
    }


    /**
     * Gets the customerId value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @return customerId
     */
    public long getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @param customerId
     */
    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the subscriberId value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @return subscriberId
     */
    public long getSubscriberId() {
        return subscriberId;
    }


    /**
     * Sets the subscriberId value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @param subscriberId
     */
    public void setSubscriberId(long subscriberId) {
        this.subscriberId = subscriberId;
    }


    /**
     * Gets the subStatus value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @return subStatus
     */
    public java.lang.String getSubStatus() {
        return subStatus;
    }


    /**
     * Sets the subStatus value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @param subStatus
     */
    public void setSubStatus(java.lang.String subStatus) {
        this.subStatus = subStatus;
    }


    /**
     * Gets the IMSI value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @return IMSI
     */
    public java.lang.String getIMSI() {
        return IMSI;
    }


    /**
     * Sets the IMSI value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @param IMSI
     */
    public void setIMSI(java.lang.String IMSI) {
        this.IMSI = IMSI;
    }


    /**
     * Gets the BAN value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @return BAN
     */
    public long getBAN() {
        return BAN;
    }


    /**
     * Sets the BAN value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @param BAN
     */
    public void setBAN(long BAN) {
        this.BAN = BAN;
    }


    /**
     * Gets the customerSegment value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @return customerSegment
     */
    public java.lang.String getCustomerSegment() {
        return customerSegment;
    }


    /**
     * Sets the customerSegment value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @param customerSegment
     */
    public void setCustomerSegment(java.lang.String customerSegment) {
        this.customerSegment = customerSegment;
    }


    /**
     * Gets the tenantId value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @return tenantId
     */
    public java.lang.Long getTenantId() {
        return tenantId;
    }


    /**
     * Sets the tenantId value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @param tenantId
     */
    public void setTenantId(java.lang.Long tenantId) {
        this.tenantId = tenantId;
    }


    /**
     * Gets the subscriberCompany value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @return subscriberCompany
     */
    public java.lang.String getSubscriberCompany() {
        return subscriberCompany;
    }


    /**
     * Sets the subscriberCompany value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @param subscriberCompany
     */
    public void setSubscriberCompany(java.lang.String subscriberCompany) {
        this.subscriberCompany = subscriberCompany;
    }


    /**
     * Gets the testSimFlag value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @return testSimFlag
     */
    public java.lang.String getTestSimFlag() {
        return testSimFlag;
    }


    /**
     * Sets the testSimFlag value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @param testSimFlag
     */
    public void setTestSimFlag(java.lang.String testSimFlag) {
        this.testSimFlag = testSimFlag;
    }


    /**
     * Gets the MVNOBrand value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @return MVNOBrand
     */
    public java.lang.String getMVNOBrand() {
        return MVNOBrand;
    }


    /**
     * Sets the MVNOBrand value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @param MVNOBrand
     */
    public void setMVNOBrand(java.lang.String MVNOBrand) {
        this.MVNOBrand = MVNOBrand;
    }


    /**
     * Gets the equipmentNo value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @return equipmentNo
     */
    public java.lang.String getEquipmentNo() {
        return equipmentNo;
    }


    /**
     * Sets the equipmentNo value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @param equipmentNo
     */
    public void setEquipmentNo(java.lang.String equipmentNo) {
        this.equipmentNo = equipmentNo;
    }


    /**
     * Gets the cycleType value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @return cycleType
     */
    public java.lang.Long getCycleType() {
        return cycleType;
    }


    /**
     * Sets the cycleType value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @param cycleType
     */
    public void setCycleType(java.lang.Long cycleType) {
        this.cycleType = cycleType;
    }


    /**
     * Gets the cycleUnit value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @return cycleUnit
     */
    public java.lang.Long getCycleUnit() {
        return cycleUnit;
    }


    /**
     * Sets the cycleUnit value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @param cycleUnit
     */
    public void setCycleUnit(java.lang.Long cycleUnit) {
        this.cycleUnit = cycleUnit;
    }


    /**
     * Gets the firstBilldate value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @return firstBilldate
     */
    public java.lang.Long getFirstBilldate() {
        return firstBilldate;
    }


    /**
     * Sets the firstBilldate value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @param firstBilldate
     */
    public void setFirstBilldate(java.lang.Long firstBilldate) {
        this.firstBilldate = firstBilldate;
    }


    /**
     * Gets the originalInitDate value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @return originalInitDate
     */
    public java.util.Calendar getOriginalInitDate() {
        return originalInitDate;
    }


    /**
     * Sets the originalInitDate value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @param originalInitDate
     */
    public void setOriginalInitDate(java.util.Calendar originalInitDate) {
        this.originalInitDate = originalInitDate;
    }


    /**
     * Gets the products value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @return products
     */
    public java.lang.String getProducts() {
        return products;
    }


    /**
     * Sets the products value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @param products
     */
    public void setProducts(java.lang.String products) {
        this.products = products;
    }


    /**
     * Gets the suspensionReasonCode value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @return suspensionReasonCode
     */
    public java.lang.String getSuspensionReasonCode() {
        return suspensionReasonCode;
    }


    /**
     * Sets the suspensionReasonCode value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @param suspensionReasonCode
     */
    public void setSuspensionReasonCode(java.lang.String suspensionReasonCode) {
        this.suspensionReasonCode = suspensionReasonCode;
    }


    /**
     * Gets the dmlAction value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @return dmlAction
     */
    public java.lang.String getDmlAction() {
        return dmlAction;
    }


    /**
     * Sets the dmlAction value for this SyncIncrementalSubscriberInfoRequestBody.
     * 
     * @param dmlAction
     */
    public void setDmlAction(java.lang.String dmlAction) {
        this.dmlAction = dmlAction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SyncIncrementalSubscriberInfoRequestBody)) return false;
        SyncIncrementalSubscriberInfoRequestBody other = (SyncIncrementalSubscriberInfoRequestBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subcriberNo==null && other.getSubcriberNo()==null) || 
             (this.subcriberNo!=null &&
              this.subcriberNo.equals(other.getSubcriberNo()))) &&
            this.customerId == other.getCustomerId() &&
            this.subscriberId == other.getSubscriberId() &&
            ((this.subStatus==null && other.getSubStatus()==null) || 
             (this.subStatus!=null &&
              this.subStatus.equals(other.getSubStatus()))) &&
            ((this.IMSI==null && other.getIMSI()==null) || 
             (this.IMSI!=null &&
              this.IMSI.equals(other.getIMSI()))) &&
            this.BAN == other.getBAN() &&
            ((this.customerSegment==null && other.getCustomerSegment()==null) || 
             (this.customerSegment!=null &&
              this.customerSegment.equals(other.getCustomerSegment()))) &&
            ((this.tenantId==null && other.getTenantId()==null) || 
             (this.tenantId!=null &&
              this.tenantId.equals(other.getTenantId()))) &&
            ((this.subscriberCompany==null && other.getSubscriberCompany()==null) || 
             (this.subscriberCompany!=null &&
              this.subscriberCompany.equals(other.getSubscriberCompany()))) &&
            ((this.testSimFlag==null && other.getTestSimFlag()==null) || 
             (this.testSimFlag!=null &&
              this.testSimFlag.equals(other.getTestSimFlag()))) &&
            ((this.MVNOBrand==null && other.getMVNOBrand()==null) || 
             (this.MVNOBrand!=null &&
              this.MVNOBrand.equals(other.getMVNOBrand()))) &&
            ((this.equipmentNo==null && other.getEquipmentNo()==null) || 
             (this.equipmentNo!=null &&
              this.equipmentNo.equals(other.getEquipmentNo()))) &&
            ((this.cycleType==null && other.getCycleType()==null) || 
             (this.cycleType!=null &&
              this.cycleType.equals(other.getCycleType()))) &&
            ((this.cycleUnit==null && other.getCycleUnit()==null) || 
             (this.cycleUnit!=null &&
              this.cycleUnit.equals(other.getCycleUnit()))) &&
            ((this.firstBilldate==null && other.getFirstBilldate()==null) || 
             (this.firstBilldate!=null &&
              this.firstBilldate.equals(other.getFirstBilldate()))) &&
            ((this.originalInitDate==null && other.getOriginalInitDate()==null) || 
             (this.originalInitDate!=null &&
              this.originalInitDate.equals(other.getOriginalInitDate()))) &&
            ((this.products==null && other.getProducts()==null) || 
             (this.products!=null &&
              this.products.equals(other.getProducts()))) &&
            ((this.suspensionReasonCode==null && other.getSuspensionReasonCode()==null) || 
             (this.suspensionReasonCode!=null &&
              this.suspensionReasonCode.equals(other.getSuspensionReasonCode()))) &&
            ((this.dmlAction==null && other.getDmlAction()==null) || 
             (this.dmlAction!=null &&
              this.dmlAction.equals(other.getDmlAction())));
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
        if (getSubcriberNo() != null) {
            _hashCode += getSubcriberNo().hashCode();
        }
        _hashCode += new Long(getCustomerId()).hashCode();
        _hashCode += new Long(getSubscriberId()).hashCode();
        if (getSubStatus() != null) {
            _hashCode += getSubStatus().hashCode();
        }
        if (getIMSI() != null) {
            _hashCode += getIMSI().hashCode();
        }
        _hashCode += new Long(getBAN()).hashCode();
        if (getCustomerSegment() != null) {
            _hashCode += getCustomerSegment().hashCode();
        }
        if (getTenantId() != null) {
            _hashCode += getTenantId().hashCode();
        }
        if (getSubscriberCompany() != null) {
            _hashCode += getSubscriberCompany().hashCode();
        }
        if (getTestSimFlag() != null) {
            _hashCode += getTestSimFlag().hashCode();
        }
        if (getMVNOBrand() != null) {
            _hashCode += getMVNOBrand().hashCode();
        }
        if (getEquipmentNo() != null) {
            _hashCode += getEquipmentNo().hashCode();
        }
        if (getCycleType() != null) {
            _hashCode += getCycleType().hashCode();
        }
        if (getCycleUnit() != null) {
            _hashCode += getCycleUnit().hashCode();
        }
        if (getFirstBilldate() != null) {
            _hashCode += getFirstBilldate().hashCode();
        }
        if (getOriginalInitDate() != null) {
            _hashCode += getOriginalInitDate().hashCode();
        }
        if (getProducts() != null) {
            _hashCode += getProducts().hashCode();
        }
        if (getSuspensionReasonCode() != null) {
            _hashCode += getSuspensionReasonCode().hashCode();
        }
        if (getDmlAction() != null) {
            _hashCode += getDmlAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SyncIncrementalSubscriberInfoRequestBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "syncIncrementalSubscriberInfoRequestBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subcriberNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subcriberNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriberId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BAN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BAN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerSegment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerSegment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenantId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TenantId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberCompany");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriberCompany"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testSimFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "testSimFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MVNOBrand");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MVNOBrand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("equipmentNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "equipmentNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cycleType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cycleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cycleUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cycleUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstBilldate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstBilldate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalInitDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originalInitDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("products");
        elemField.setXmlName(new javax.xml.namespace.QName("", "products"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspensionReasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "suspensionReasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmlAction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dmlAction"));
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
