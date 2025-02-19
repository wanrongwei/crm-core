/**
 * FreeResInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

import java.util.List;

public class FreeResInfo  implements java.io.Serializable {
    private Long offeringId;

    private String offeringName;

    private String offeringType;

    private Integer productOfferingId;

    private String pricePlanName;

    private Integer priceId;

    private String priceName;

    private Integer fuItemId;

    private int[] listFuGroupId;

    private String fuItemName;

    private Integer roamingType;

    private String description;

    private Integer serviceSpecId;

    private String serviceSpecName;

    private long amount;

    private String displayAmount;

    private String measure;

    private java.util.Calendar validDate;

    private java.util.Calendar expireDate;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QosRuleInfo[] listQosRuleInfo;

    public FreeResInfo() {
    }

    public FreeResInfo(
           Long offeringId,
           String offeringName,
           String offeringType,
           Integer productOfferingId,
           String pricePlanName,
           Integer priceId,
           String priceName,
           Integer fuItemId,
           int[] listFuGroupId,
           String fuItemName,
           Integer roamingType,
           String description,
           Integer serviceSpecId,
           String serviceSpecName,
           long amount,
           String displayAmount,
           String measure,
           java.util.Calendar validDate,
           java.util.Calendar expireDate,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QosRuleInfo[] listQosRuleInfo) {
           this.offeringId = offeringId;
           this.offeringName = offeringName;
           this.offeringType = offeringType;
           this.productOfferingId = productOfferingId;
           this.pricePlanName = pricePlanName;
           this.priceId = priceId;
           this.priceName = priceName;
           this.fuItemId = fuItemId;
           this.listFuGroupId = listFuGroupId;
           this.fuItemName = fuItemName;
           this.roamingType = roamingType;
           this.description = description;
           this.serviceSpecId = serviceSpecId;
           this.serviceSpecName = serviceSpecName;
           this.amount = amount;
           this.displayAmount = displayAmount;
           this.measure = measure;
           this.validDate = validDate;
           this.expireDate = expireDate;
           this.listQosRuleInfo = listQosRuleInfo;
    }


    /**
     * Gets the offeringId value for this FreeResInfo.
     * 
     * @return offeringId
     */
    public Long getOfferingId() {
        return offeringId;
    }


    /**
     * Sets the offeringId value for this FreeResInfo.
     * 
     * @param offeringId
     */
    public void setOfferingId(Long offeringId) {
        this.offeringId = offeringId;
    }


    /**
     * Gets the offeringName value for this FreeResInfo.
     * 
     * @return offeringName
     */
    public String getOfferingName() {
        return offeringName;
    }


    /**
     * Sets the offeringName value for this FreeResInfo.
     * 
     * @param offeringName
     */
    public void setOfferingName(String offeringName) {
        this.offeringName = offeringName;
    }


    /**
     * Gets the offeringType value for this FreeResInfo.
     * 
     * @return offeringType
     */
    public String getOfferingType() {
        return offeringType;
    }


    /**
     * Sets the offeringType value for this FreeResInfo.
     * 
     * @param offeringType
     */
    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }


    /**
     * Gets the productOfferingId value for this FreeResInfo.
     * 
     * @return productOfferingId
     */
    public Integer getProductOfferingId() {
        return productOfferingId;
    }


    /**
     * Sets the productOfferingId value for this FreeResInfo.
     * 
     * @param productOfferingId
     */
    public void setProductOfferingId(Integer productOfferingId) {
        this.productOfferingId = productOfferingId;
    }


    /**
     * Gets the pricePlanName value for this FreeResInfo.
     * 
     * @return pricePlanName
     */
    public String getPricePlanName() {
        return pricePlanName;
    }


    /**
     * Sets the pricePlanName value for this FreeResInfo.
     * 
     * @param pricePlanName
     */
    public void setPricePlanName(String pricePlanName) {
        this.pricePlanName = pricePlanName;
    }


    /**
     * Gets the priceId value for this FreeResInfo.
     * 
     * @return priceId
     */
    public Integer getPriceId() {
        return priceId;
    }


    /**
     * Sets the priceId value for this FreeResInfo.
     * 
     * @param priceId
     */
    public void setPriceId(Integer priceId) {
        this.priceId = priceId;
    }


    /**
     * Gets the priceName value for this FreeResInfo.
     * 
     * @return priceName
     */
    public String getPriceName() {
        return priceName;
    }


    /**
     * Sets the priceName value for this FreeResInfo.
     * 
     * @param priceName
     */
    public void setPriceName(String priceName) {
        this.priceName = priceName;
    }


    /**
     * Gets the fuItemId value for this FreeResInfo.
     * 
     * @return fuItemId
     */
    public Integer getFuItemId() {
        return fuItemId;
    }


    /**
     * Sets the fuItemId value for this FreeResInfo.
     * 
     * @param fuItemId
     */
    public void setFuItemId(Integer fuItemId) {
        this.fuItemId = fuItemId;
    }


    /**
     * Gets the listFuGroupId value for this FreeResInfo.
     * 
     * @return listFuGroupId
     */
    public int[] getListFuGroupId() {
        return listFuGroupId;
    }


    /**
     * Sets the listFuGroupId value for this FreeResInfo.
     * 
     * @param listFuGroupId
     */
    public void setListFuGroupId(int[] listFuGroupId) {
        this.listFuGroupId = listFuGroupId;
    }

    public int getListFuGroupId(int i) {
        return this.listFuGroupId[i];
    }

    public void setListFuGroupId(int i, int _value) {
        this.listFuGroupId[i] = _value;
    }


    /**
     * Gets the fuItemName value for this FreeResInfo.
     * 
     * @return fuItemName
     */
    public String getFuItemName() {
        return fuItemName;
    }


    /**
     * Sets the fuItemName value for this FreeResInfo.
     * 
     * @param fuItemName
     */
    public void setFuItemName(String fuItemName) {
        this.fuItemName = fuItemName;
    }


    /**
     * Gets the roamingType value for this FreeResInfo.
     * 
     * @return roamingType
     */
    public Integer getRoamingType() {
        return roamingType;
    }


    /**
     * Sets the roamingType value for this FreeResInfo.
     * 
     * @param roamingType
     */
    public void setRoamingType(Integer roamingType) {
        this.roamingType = roamingType;
    }


    /**
     * Gets the description value for this FreeResInfo.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this FreeResInfo.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets the serviceSpecId value for this FreeResInfo.
     * 
     * @return serviceSpecId
     */
    public Integer getServiceSpecId() {
        return serviceSpecId;
    }


    /**
     * Sets the serviceSpecId value for this FreeResInfo.
     * 
     * @param serviceSpecId
     */
    public void setServiceSpecId(Integer serviceSpecId) {
        this.serviceSpecId = serviceSpecId;
    }


    /**
     * Gets the serviceSpecName value for this FreeResInfo.
     * 
     * @return serviceSpecName
     */
    public String getServiceSpecName() {
        return serviceSpecName;
    }


    /**
     * Sets the serviceSpecName value for this FreeResInfo.
     * 
     * @param serviceSpecName
     */
    public void setServiceSpecName(String serviceSpecName) {
        this.serviceSpecName = serviceSpecName;
    }


    /**
     * Gets the amount value for this FreeResInfo.
     * 
     * @return amount
     */
    public long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this FreeResInfo.
     * 
     * @param amount
     */
    public void setAmount(long amount) {
        this.amount = amount;
    }


    /**
     * Gets the displayAmount value for this FreeResInfo.
     * 
     * @return displayAmount
     */
    public String getDisplayAmount() {
        return displayAmount;
    }


    /**
     * Sets the displayAmount value for this FreeResInfo.
     * 
     * @param displayAmount
     */
    public void setDisplayAmount(String displayAmount) {
        this.displayAmount = displayAmount;
    }


    /**
     * Gets the measure value for this FreeResInfo.
     * 
     * @return measure
     */
    public String getMeasure() {
        return measure;
    }


    /**
     * Sets the measure value for this FreeResInfo.
     * 
     * @param measure
     */
    public void setMeasure(String measure) {
        this.measure = measure;
    }


    /**
     * Gets the validDate value for this FreeResInfo.
     * 
     * @return validDate
     */
    public java.util.Calendar getValidDate() {
        return validDate;
    }


    /**
     * Sets the validDate value for this FreeResInfo.
     * 
     * @param validDate
     */
    public void setValidDate(java.util.Calendar validDate) {
        this.validDate = validDate;
    }


    /**
     * Gets the expireDate value for this FreeResInfo.
     * 
     * @return expireDate
     */
    public java.util.Calendar getExpireDate() {
        return expireDate;
    }


    /**
     * Sets the expireDate value for this FreeResInfo.
     * 
     * @param expireDate
     */
    public void setExpireDate(java.util.Calendar expireDate) {
        this.expireDate = expireDate;
    }




    /**
     * Gets the listQosRuleInfo value for this FreeResInfo.
     *
     * @return listQosRuleInfo
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QosRuleInfo[] getListQosRuleInfo() {
        return listQosRuleInfo;
    }


    /**
     * Sets the listQosRuleInfo value for this FreeResInfo.
     *
     * @param listQosRuleInfo
     */
    public void setListQosRuleInfo(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QosRuleInfo[] listQosRuleInfo) {
        this.listQosRuleInfo = listQosRuleInfo;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QosRuleInfo getListQosRuleInfo(int i) {
        return this.listQosRuleInfo[i];
    }

    public void setListQosRuleInfo(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QosRuleInfo _value) {
        this.listQosRuleInfo[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FreeResInfo)) return false;
        FreeResInfo other = (FreeResInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.offeringId==null && other.getOfferingId()==null) || 
             (this.offeringId!=null &&
              this.offeringId.equals(other.getOfferingId()))) &&
            ((this.offeringName==null && other.getOfferingName()==null) || 
             (this.offeringName!=null &&
              this.offeringName.equals(other.getOfferingName()))) &&
            ((this.offeringType==null && other.getOfferingType()==null) || 
             (this.offeringType!=null &&
              this.offeringType.equals(other.getOfferingType()))) &&
            ((this.productOfferingId==null && other.getProductOfferingId()==null) || 
             (this.productOfferingId!=null &&
              this.productOfferingId.equals(other.getProductOfferingId()))) &&
            ((this.pricePlanName==null && other.getPricePlanName()==null) || 
             (this.pricePlanName!=null &&
              this.pricePlanName.equals(other.getPricePlanName()))) &&
            ((this.priceId==null && other.getPriceId()==null) || 
             (this.priceId!=null &&
              this.priceId.equals(other.getPriceId()))) &&
            ((this.priceName==null && other.getPriceName()==null) || 
             (this.priceName!=null &&
              this.priceName.equals(other.getPriceName()))) &&
            ((this.fuItemId==null && other.getFuItemId()==null) || 
             (this.fuItemId!=null &&
              this.fuItemId.equals(other.getFuItemId()))) &&
            ((this.listFuGroupId==null && other.getListFuGroupId()==null) || 
             (this.listFuGroupId!=null &&
              java.util.Arrays.equals(this.listFuGroupId, other.getListFuGroupId()))) &&
            ((this.fuItemName==null && other.getFuItemName()==null) || 
             (this.fuItemName!=null &&
              this.fuItemName.equals(other.getFuItemName()))) &&
            ((this.roamingType==null && other.getRoamingType()==null) || 
             (this.roamingType!=null &&
              this.roamingType.equals(other.getRoamingType()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.serviceSpecId==null && other.getServiceSpecId()==null) || 
             (this.serviceSpecId!=null &&
              this.serviceSpecId.equals(other.getServiceSpecId()))) &&
            ((this.serviceSpecName==null && other.getServiceSpecName()==null) || 
             (this.serviceSpecName!=null &&
              this.serviceSpecName.equals(other.getServiceSpecName()))) &&
            this.amount == other.getAmount() &&
            ((this.displayAmount==null && other.getDisplayAmount()==null) || 
             (this.displayAmount!=null &&
              this.displayAmount.equals(other.getDisplayAmount()))) &&
            ((this.measure==null && other.getMeasure()==null) || 
             (this.measure!=null &&
              this.measure.equals(other.getMeasure()))) &&
            ((this.validDate==null && other.getValidDate()==null) || 
             (this.validDate!=null &&
              this.validDate.equals(other.getValidDate()))) &&
            ((this.expireDate==null && other.getExpireDate()==null) || 
             (this.expireDate!=null &&
              this.expireDate.equals(other.getExpireDate()))) &&
            ((this.listQosRuleInfo==null && other.getListQosRuleInfo()==null) ||
                    (this.listQosRuleInfo!=null &&
                            java.util.Arrays.equals(this.listQosRuleInfo, other.getListQosRuleInfo())));
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
        if (getOfferingId() != null) {
            _hashCode += getOfferingId().hashCode();
        }
        if (getOfferingName() != null) {
            _hashCode += getOfferingName().hashCode();
        }
        if (getOfferingType() != null) {
            _hashCode += getOfferingType().hashCode();
        }
        if (getProductOfferingId() != null) {
            _hashCode += getProductOfferingId().hashCode();
        }
        if (getPricePlanName() != null) {
            _hashCode += getPricePlanName().hashCode();
        }
        if (getPriceId() != null) {
            _hashCode += getPriceId().hashCode();
        }
        if (getPriceName() != null) {
            _hashCode += getPriceName().hashCode();
        }
        if (getFuItemId() != null) {
            _hashCode += getFuItemId().hashCode();
        }
        if (getListFuGroupId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListFuGroupId());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getListFuGroupId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFuItemName() != null) {
            _hashCode += getFuItemName().hashCode();
        }
        if (getRoamingType() != null) {
            _hashCode += getRoamingType().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getServiceSpecId() != null) {
            _hashCode += getServiceSpecId().hashCode();
        }
        if (getServiceSpecName() != null) {
            _hashCode += getServiceSpecName().hashCode();
        }
        _hashCode += new Long(getAmount()).hashCode();
        if (getDisplayAmount() != null) {
            _hashCode += getDisplayAmount().hashCode();
        }
        if (getMeasure() != null) {
            _hashCode += getMeasure().hashCode();
        }
        if (getValidDate() != null) {
            _hashCode += getValidDate().hashCode();
        }
        if (getExpireDate() != null) {
            _hashCode += getExpireDate().hashCode();
        }
        if (getListQosRuleInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListQosRuleInfo());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getListQosRuleInfo(), i);
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
        new org.apache.axis.description.TypeDesc(FreeResInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offeringId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offeringName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeringType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offeringType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productOfferingId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productOfferingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricePlanName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pricePlanName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fuItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fuItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listFuGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listFuGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fuItemName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fuItemName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roamingType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "roamingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceSpecId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceSpecId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceSpecName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceSpecName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "displayAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listQosRuleInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listQosRuleInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "qosRuleInfo"));
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
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
