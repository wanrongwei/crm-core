/**
 * ScdrBusiInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class ScdrBusiInfo  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.PhoneId[] phoneIdList;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ServiceId[] serviceIdList;

    private java.lang.Integer channelType;

    private java.lang.Integer cdrType;

    private java.lang.Integer languageId;

    private java.lang.Integer billFormatId;

    private java.lang.Long acctId;

    private java.lang.String filterField;

    private java.lang.String filterValue;

    private java.lang.Integer sortType;

    private java.lang.String sortField;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.BillItemInfo[] billItemList;

    private java.lang.Integer isFreeRes;

    private java.lang.Boolean isUsageType;

    private java.lang.Long tenantId;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.Service[] service;

    private java.lang.Integer busiType;

    public ScdrBusiInfo() {
    }

    public ScdrBusiInfo(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.PhoneId[] phoneIdList,
           java.lang.String startDate,
           java.lang.String endDate,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ServiceId[] serviceIdList,
           java.lang.Integer channelType,
           java.lang.Integer cdrType,
           java.lang.Integer languageId,
           java.lang.Integer billFormatId,
           java.lang.Long acctId,
           java.lang.String filterField,
           java.lang.String filterValue,
           java.lang.Integer sortType,
           java.lang.String sortField,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.BillItemInfo[] billItemList,
           java.lang.Integer isFreeRes,
           java.lang.Boolean isUsageType,
           java.lang.Long tenantId,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.Service[] service,
           java.lang.Integer busiType) {
           this.phoneIdList = phoneIdList;
           this.startDate = startDate;
           this.endDate = endDate;
           this.serviceIdList = serviceIdList;
           this.channelType = channelType;
           this.cdrType = cdrType;
           this.languageId = languageId;
           this.billFormatId = billFormatId;
           this.acctId = acctId;
           this.filterField = filterField;
           this.filterValue = filterValue;
           this.sortType = sortType;
           this.sortField = sortField;
           this.billItemList = billItemList;
           this.isFreeRes = isFreeRes;
           this.isUsageType = isUsageType;
           this.tenantId = tenantId;
           this.service = service;
           this.busiType = busiType;
    }


    /**
     * Gets the phoneIdList value for this ScdrBusiInfo.
     * 
     * @return phoneIdList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.PhoneId[] getPhoneIdList() {
        return phoneIdList;
    }


    /**
     * Sets the phoneIdList value for this ScdrBusiInfo.
     * 
     * @param phoneIdList
     */
    public void setPhoneIdList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.PhoneId[] phoneIdList) {
        this.phoneIdList = phoneIdList;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.PhoneId getPhoneIdList(int i) {
        return this.phoneIdList[i];
    }

    public void setPhoneIdList(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.PhoneId _value) {
        this.phoneIdList[i] = _value;
    }


    /**
     * Gets the startDate value for this ScdrBusiInfo.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this ScdrBusiInfo.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this ScdrBusiInfo.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ScdrBusiInfo.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the serviceIdList value for this ScdrBusiInfo.
     * 
     * @return serviceIdList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ServiceId[] getServiceIdList() {
        return serviceIdList;
    }


    /**
     * Sets the serviceIdList value for this ScdrBusiInfo.
     * 
     * @param serviceIdList
     */
    public void setServiceIdList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ServiceId[] serviceIdList) {
        this.serviceIdList = serviceIdList;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ServiceId getServiceIdList(int i) {
        return this.serviceIdList[i];
    }

    public void setServiceIdList(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ServiceId _value) {
        this.serviceIdList[i] = _value;
    }


    /**
     * Gets the channelType value for this ScdrBusiInfo.
     * 
     * @return channelType
     */
    public java.lang.Integer getChannelType() {
        return channelType;
    }


    /**
     * Sets the channelType value for this ScdrBusiInfo.
     * 
     * @param channelType
     */
    public void setChannelType(java.lang.Integer channelType) {
        this.channelType = channelType;
    }


    /**
     * Gets the cdrType value for this ScdrBusiInfo.
     * 
     * @return cdrType
     */
    public java.lang.Integer getCdrType() {
        return cdrType;
    }


    /**
     * Sets the cdrType value for this ScdrBusiInfo.
     * 
     * @param cdrType
     */
    public void setCdrType(java.lang.Integer cdrType) {
        this.cdrType = cdrType;
    }


    /**
     * Gets the languageId value for this ScdrBusiInfo.
     * 
     * @return languageId
     */
    public java.lang.Integer getLanguageId() {
        return languageId;
    }


    /**
     * Sets the languageId value for this ScdrBusiInfo.
     * 
     * @param languageId
     */
    public void setLanguageId(java.lang.Integer languageId) {
        this.languageId = languageId;
    }


    /**
     * Gets the billFormatId value for this ScdrBusiInfo.
     * 
     * @return billFormatId
     */
    public java.lang.Integer getBillFormatId() {
        return billFormatId;
    }


    /**
     * Sets the billFormatId value for this ScdrBusiInfo.
     * 
     * @param billFormatId
     */
    public void setBillFormatId(java.lang.Integer billFormatId) {
        this.billFormatId = billFormatId;
    }


    /**
     * Gets the acctId value for this ScdrBusiInfo.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this ScdrBusiInfo.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the filterField value for this ScdrBusiInfo.
     * 
     * @return filterField
     */
    public java.lang.String getFilterField() {
        return filterField;
    }


    /**
     * Sets the filterField value for this ScdrBusiInfo.
     * 
     * @param filterField
     */
    public void setFilterField(java.lang.String filterField) {
        this.filterField = filterField;
    }


    /**
     * Gets the filterValue value for this ScdrBusiInfo.
     * 
     * @return filterValue
     */
    public java.lang.String getFilterValue() {
        return filterValue;
    }


    /**
     * Sets the filterValue value for this ScdrBusiInfo.
     * 
     * @param filterValue
     */
    public void setFilterValue(java.lang.String filterValue) {
        this.filterValue = filterValue;
    }


    /**
     * Gets the sortType value for this ScdrBusiInfo.
     * 
     * @return sortType
     */
    public java.lang.Integer getSortType() {
        return sortType;
    }


    /**
     * Sets the sortType value for this ScdrBusiInfo.
     * 
     * @param sortType
     */
    public void setSortType(java.lang.Integer sortType) {
        this.sortType = sortType;
    }


    /**
     * Gets the sortField value for this ScdrBusiInfo.
     * 
     * @return sortField
     */
    public java.lang.String getSortField() {
        return sortField;
    }


    /**
     * Sets the sortField value for this ScdrBusiInfo.
     * 
     * @param sortField
     */
    public void setSortField(java.lang.String sortField) {
        this.sortField = sortField;
    }


    /**
     * Gets the billItemList value for this ScdrBusiInfo.
     * 
     * @return billItemList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.BillItemInfo[] getBillItemList() {
        return billItemList;
    }


    /**
     * Sets the billItemList value for this ScdrBusiInfo.
     * 
     * @param billItemList
     */
    public void setBillItemList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.BillItemInfo[] billItemList) {
        this.billItemList = billItemList;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.BillItemInfo getBillItemList(int i) {
        return this.billItemList[i];
    }

    public void setBillItemList(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.BillItemInfo _value) {
        this.billItemList[i] = _value;
    }


    /**
     * Gets the isFreeRes value for this ScdrBusiInfo.
     * 
     * @return isFreeRes
     */
    public java.lang.Integer getIsFreeRes() {
        return isFreeRes;
    }


    /**
     * Sets the isFreeRes value for this ScdrBusiInfo.
     * 
     * @param isFreeRes
     */
    public void setIsFreeRes(java.lang.Integer isFreeRes) {
        this.isFreeRes = isFreeRes;
    }


    /**
     * Gets the isUsageType value for this ScdrBusiInfo.
     * 
     * @return isUsageType
     */
    public java.lang.Boolean getIsUsageType() {
        return isUsageType;
    }


    /**
     * Sets the isUsageType value for this ScdrBusiInfo.
     * 
     * @param isUsageType
     */
    public void setIsUsageType(java.lang.Boolean isUsageType) {
        this.isUsageType = isUsageType;
    }


    /**
     * Gets the tenantId value for this ScdrBusiInfo.
     * 
     * @return tenantId
     */
    public java.lang.Long getTenantId() {
        return tenantId;
    }


    /**
     * Sets the tenantId value for this ScdrBusiInfo.
     * 
     * @param tenantId
     */
    public void setTenantId(java.lang.Long tenantId) {
        this.tenantId = tenantId;
    }


    /**
     * Gets the service value for this ScdrBusiInfo.
     * 
     * @return service
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.Service[] getService() {
        return service;
    }


    /**
     * Sets the service value for this ScdrBusiInfo.
     * 
     * @param service
     */
    public void setService(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.Service[] service) {
        this.service = service;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.Service getService(int i) {
        return this.service[i];
    }

    public void setService(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.Service _value) {
        this.service[i] = _value;
    }


    /**
     * Gets the busiType value for this ScdrBusiInfo.
     * 
     * @return busiType
     */
    public java.lang.Integer getBusiType() {
        return busiType;
    }


    /**
     * Sets the busiType value for this ScdrBusiInfo.
     * 
     * @param busiType
     */
    public void setBusiType(java.lang.Integer busiType) {
        this.busiType = busiType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScdrBusiInfo)) return false;
        ScdrBusiInfo other = (ScdrBusiInfo) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.phoneIdList==null && other.getPhoneIdList()==null) || 
             (this.phoneIdList!=null &&
              java.util.Arrays.equals(this.phoneIdList, other.getPhoneIdList()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.serviceIdList==null && other.getServiceIdList()==null) || 
             (this.serviceIdList!=null &&
              java.util.Arrays.equals(this.serviceIdList, other.getServiceIdList()))) &&
            ((this.channelType==null && other.getChannelType()==null) || 
             (this.channelType!=null &&
              this.channelType.equals(other.getChannelType()))) &&
            ((this.cdrType==null && other.getCdrType()==null) || 
             (this.cdrType!=null &&
              this.cdrType.equals(other.getCdrType()))) &&
            ((this.languageId==null && other.getLanguageId()==null) || 
             (this.languageId!=null &&
              this.languageId.equals(other.getLanguageId()))) &&
            ((this.billFormatId==null && other.getBillFormatId()==null) || 
             (this.billFormatId!=null &&
              this.billFormatId.equals(other.getBillFormatId()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.filterField==null && other.getFilterField()==null) || 
             (this.filterField!=null &&
              this.filterField.equals(other.getFilterField()))) &&
            ((this.filterValue==null && other.getFilterValue()==null) || 
             (this.filterValue!=null &&
              this.filterValue.equals(other.getFilterValue()))) &&
            ((this.sortType==null && other.getSortType()==null) || 
             (this.sortType!=null &&
              this.sortType.equals(other.getSortType()))) &&
            ((this.sortField==null && other.getSortField()==null) || 
             (this.sortField!=null &&
              this.sortField.equals(other.getSortField()))) &&
            ((this.billItemList==null && other.getBillItemList()==null) || 
             (this.billItemList!=null &&
              java.util.Arrays.equals(this.billItemList, other.getBillItemList()))) &&
            ((this.isFreeRes==null && other.getIsFreeRes()==null) || 
             (this.isFreeRes!=null &&
              this.isFreeRes.equals(other.getIsFreeRes()))) &&
            ((this.isUsageType==null && other.getIsUsageType()==null) || 
             (this.isUsageType!=null &&
              this.isUsageType.equals(other.getIsUsageType()))) &&
            ((this.tenantId==null && other.getTenantId()==null) || 
             (this.tenantId!=null &&
              this.tenantId.equals(other.getTenantId()))) &&
            ((this.service==null && other.getService()==null) || 
             (this.service!=null &&
              java.util.Arrays.equals(this.service, other.getService()))) &&
            ((this.busiType==null && other.getBusiType()==null) || 
             (this.busiType!=null &&
              this.busiType.equals(other.getBusiType())));
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
        if (getPhoneIdList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPhoneIdList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPhoneIdList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getServiceIdList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceIdList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceIdList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChannelType() != null) {
            _hashCode += getChannelType().hashCode();
        }
        if (getCdrType() != null) {
            _hashCode += getCdrType().hashCode();
        }
        if (getLanguageId() != null) {
            _hashCode += getLanguageId().hashCode();
        }
        if (getBillFormatId() != null) {
            _hashCode += getBillFormatId().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getFilterField() != null) {
            _hashCode += getFilterField().hashCode();
        }
        if (getFilterValue() != null) {
            _hashCode += getFilterValue().hashCode();
        }
        if (getSortType() != null) {
            _hashCode += getSortType().hashCode();
        }
        if (getSortField() != null) {
            _hashCode += getSortField().hashCode();
        }
        if (getBillItemList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillItemList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillItemList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsFreeRes() != null) {
            _hashCode += getIsFreeRes().hashCode();
        }
        if (getIsUsageType() != null) {
            _hashCode += getIsUsageType().hashCode();
        }
        if (getTenantId() != null) {
            _hashCode += getTenantId().hashCode();
        }
        if (getService() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getService());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getService(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBusiType() != null) {
            _hashCode += getBusiType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScdrBusiInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "scdrBusiInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneIdList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneIdList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "phoneId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceIdList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceIdList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "serviceId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "channelType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdrType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdrType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "languageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billFormatId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billFormatId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("filterField");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filterField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filterValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sortType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortField");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sortField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billItemList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billItemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billItemInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFreeRes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isFreeRes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isUsageType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isUsageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tenantId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tenantId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("", "service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "service"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("busiType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "busiType"));
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
