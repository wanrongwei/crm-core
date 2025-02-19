/**
 * CaBillItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

public class CaBillItem  implements java.io.Serializable {
    private java.lang.Long billNo;

    private java.lang.Integer itemCode;

    private java.lang.Long billFee;

    private java.lang.Long ppyFee;

    private java.lang.Integer billMonth;

    private java.lang.Long discountFee;

    private java.lang.String itemName;

    private java.lang.Long acctId;

    private java.lang.String outerAcctId;

    private java.lang.Long resourceId;

    private java.lang.String identifierName;

    private java.lang.Integer measureId;

    private java.lang.Long defaultAcctId;

    private java.lang.String outerDefaultAcctId;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CaBillProd[] caBillProdList;

    public CaBillItem() {
    }

    public CaBillItem(
           java.lang.Long billNo,
           java.lang.Integer itemCode,
           java.lang.Long billFee,
           java.lang.Long ppyFee,
           java.lang.Integer billMonth,
           java.lang.Long discountFee,
           java.lang.String itemName,
           java.lang.Long acctId,
           java.lang.String outerAcctId,
           java.lang.Long resourceId,
           java.lang.String identifierName,
           java.lang.Integer measureId,
           java.lang.Long defaultAcctId,
           java.lang.String outerDefaultAcctId,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CaBillProd[] caBillProdList) {
           this.billNo = billNo;
           this.itemCode = itemCode;
           this.billFee = billFee;
           this.ppyFee = ppyFee;
           this.billMonth = billMonth;
           this.discountFee = discountFee;
           this.itemName = itemName;
           this.acctId = acctId;
           this.outerAcctId = outerAcctId;
           this.resourceId = resourceId;
           this.identifierName = identifierName;
           this.measureId = measureId;
           this.defaultAcctId = defaultAcctId;
           this.outerDefaultAcctId = outerDefaultAcctId;
           this.caBillProdList = caBillProdList;
    }


    /**
     * Gets the billNo value for this CaBillItem.
     * 
     * @return billNo
     */
    public java.lang.Long getBillNo() {
        return billNo;
    }


    /**
     * Sets the billNo value for this CaBillItem.
     * 
     * @param billNo
     */
    public void setBillNo(java.lang.Long billNo) {
        this.billNo = billNo;
    }


    /**
     * Gets the itemCode value for this CaBillItem.
     * 
     * @return itemCode
     */
    public java.lang.Integer getItemCode() {
        return itemCode;
    }


    /**
     * Sets the itemCode value for this CaBillItem.
     * 
     * @param itemCode
     */
    public void setItemCode(java.lang.Integer itemCode) {
        this.itemCode = itemCode;
    }


    /**
     * Gets the billFee value for this CaBillItem.
     * 
     * @return billFee
     */
    public java.lang.Long getBillFee() {
        return billFee;
    }


    /**
     * Sets the billFee value for this CaBillItem.
     * 
     * @param billFee
     */
    public void setBillFee(java.lang.Long billFee) {
        this.billFee = billFee;
    }


    /**
     * Gets the ppyFee value for this CaBillItem.
     * 
     * @return ppyFee
     */
    public java.lang.Long getPpyFee() {
        return ppyFee;
    }


    /**
     * Sets the ppyFee value for this CaBillItem.
     * 
     * @param ppyFee
     */
    public void setPpyFee(java.lang.Long ppyFee) {
        this.ppyFee = ppyFee;
    }


    /**
     * Gets the billMonth value for this CaBillItem.
     * 
     * @return billMonth
     */
    public java.lang.Integer getBillMonth() {
        return billMonth;
    }


    /**
     * Sets the billMonth value for this CaBillItem.
     * 
     * @param billMonth
     */
    public void setBillMonth(java.lang.Integer billMonth) {
        this.billMonth = billMonth;
    }


    /**
     * Gets the discountFee value for this CaBillItem.
     * 
     * @return discountFee
     */
    public java.lang.Long getDiscountFee() {
        return discountFee;
    }


    /**
     * Sets the discountFee value for this CaBillItem.
     * 
     * @param discountFee
     */
    public void setDiscountFee(java.lang.Long discountFee) {
        this.discountFee = discountFee;
    }


    /**
     * Gets the itemName value for this CaBillItem.
     * 
     * @return itemName
     */
    public java.lang.String getItemName() {
        return itemName;
    }


    /**
     * Sets the itemName value for this CaBillItem.
     * 
     * @param itemName
     */
    public void setItemName(java.lang.String itemName) {
        this.itemName = itemName;
    }


    /**
     * Gets the acctId value for this CaBillItem.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this CaBillItem.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the outerAcctId value for this CaBillItem.
     * 
     * @return outerAcctId
     */
    public java.lang.String getOuterAcctId() {
        return outerAcctId;
    }


    /**
     * Sets the outerAcctId value for this CaBillItem.
     * 
     * @param outerAcctId
     */
    public void setOuterAcctId(java.lang.String outerAcctId) {
        this.outerAcctId = outerAcctId;
    }


    /**
     * Gets the resourceId value for this CaBillItem.
     * 
     * @return resourceId
     */
    public java.lang.Long getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this CaBillItem.
     * 
     * @param resourceId
     */
    public void setResourceId(java.lang.Long resourceId) {
        this.resourceId = resourceId;
    }


    /**
     * Gets the identifierName value for this CaBillItem.
     * 
     * @return identifierName
     */
    public java.lang.String getIdentifierName() {
        return identifierName;
    }


    /**
     * Sets the identifierName value for this CaBillItem.
     * 
     * @param identifierName
     */
    public void setIdentifierName(java.lang.String identifierName) {
        this.identifierName = identifierName;
    }


    /**
     * Gets the measureId value for this CaBillItem.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this CaBillItem.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the defaultAcctId value for this CaBillItem.
     * 
     * @return defaultAcctId
     */
    public java.lang.Long getDefaultAcctId() {
        return defaultAcctId;
    }


    /**
     * Sets the defaultAcctId value for this CaBillItem.
     * 
     * @param defaultAcctId
     */
    public void setDefaultAcctId(java.lang.Long defaultAcctId) {
        this.defaultAcctId = defaultAcctId;
    }


    /**
     * Gets the outerDefaultAcctId value for this CaBillItem.
     * 
     * @return outerDefaultAcctId
     */
    public java.lang.String getOuterDefaultAcctId() {
        return outerDefaultAcctId;
    }


    /**
     * Sets the outerDefaultAcctId value for this CaBillItem.
     * 
     * @param outerDefaultAcctId
     */
    public void setOuterDefaultAcctId(java.lang.String outerDefaultAcctId) {
        this.outerDefaultAcctId = outerDefaultAcctId;
    }


    /**
     * Gets the caBillProdList value for this CaBillItem.
     * 
     * @return caBillProdList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CaBillProd[] getCaBillProdList() {
        return caBillProdList;
    }


    /**
     * Sets the caBillProdList value for this CaBillItem.
     * 
     * @param caBillProdList
     */
    public void setCaBillProdList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CaBillProd[] caBillProdList) {
        this.caBillProdList = caBillProdList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CaBillItem)) return false;
        CaBillItem other = (CaBillItem) obj;
       
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billNo==null && other.getBillNo()==null) || 
             (this.billNo!=null &&
              this.billNo.equals(other.getBillNo()))) &&
            ((this.itemCode==null && other.getItemCode()==null) || 
             (this.itemCode!=null &&
              this.itemCode.equals(other.getItemCode()))) &&
            ((this.billFee==null && other.getBillFee()==null) || 
             (this.billFee!=null &&
              this.billFee.equals(other.getBillFee()))) &&
            ((this.ppyFee==null && other.getPpyFee()==null) || 
             (this.ppyFee!=null &&
              this.ppyFee.equals(other.getPpyFee()))) &&
            ((this.billMonth==null && other.getBillMonth()==null) || 
             (this.billMonth!=null &&
              this.billMonth.equals(other.getBillMonth()))) &&
            ((this.discountFee==null && other.getDiscountFee()==null) || 
             (this.discountFee!=null &&
              this.discountFee.equals(other.getDiscountFee()))) &&
            ((this.itemName==null && other.getItemName()==null) || 
             (this.itemName!=null &&
              this.itemName.equals(other.getItemName()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.outerAcctId==null && other.getOuterAcctId()==null) || 
             (this.outerAcctId!=null &&
              this.outerAcctId.equals(other.getOuterAcctId()))) &&
            ((this.resourceId==null && other.getResourceId()==null) || 
             (this.resourceId!=null &&
              this.resourceId.equals(other.getResourceId()))) &&
            ((this.identifierName==null && other.getIdentifierName()==null) || 
             (this.identifierName!=null &&
              this.identifierName.equals(other.getIdentifierName()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.defaultAcctId==null && other.getDefaultAcctId()==null) || 
             (this.defaultAcctId!=null &&
              this.defaultAcctId.equals(other.getDefaultAcctId()))) &&
            ((this.outerDefaultAcctId==null && other.getOuterDefaultAcctId()==null) || 
             (this.outerDefaultAcctId!=null &&
              this.outerDefaultAcctId.equals(other.getOuterDefaultAcctId()))) &&
            ((this.caBillProdList==null && other.getCaBillProdList()==null) || 
             (this.caBillProdList!=null &&
              java.util.Arrays.equals(this.caBillProdList, other.getCaBillProdList())));
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
        if (getBillNo() != null) {
            _hashCode += getBillNo().hashCode();
        }
        if (getItemCode() != null) {
            _hashCode += getItemCode().hashCode();
        }
        if (getBillFee() != null) {
            _hashCode += getBillFee().hashCode();
        }
        if (getPpyFee() != null) {
            _hashCode += getPpyFee().hashCode();
        }
        if (getBillMonth() != null) {
            _hashCode += getBillMonth().hashCode();
        }
        if (getDiscountFee() != null) {
            _hashCode += getDiscountFee().hashCode();
        }
        if (getItemName() != null) {
            _hashCode += getItemName().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getOuterAcctId() != null) {
            _hashCode += getOuterAcctId().hashCode();
        }
        if (getResourceId() != null) {
            _hashCode += getResourceId().hashCode();
        }
        if (getIdentifierName() != null) {
            _hashCode += getIdentifierName().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getDefaultAcctId() != null) {
            _hashCode += getDefaultAcctId().hashCode();
        }
        if (getOuterDefaultAcctId() != null) {
            _hashCode += getOuterDefaultAcctId().hashCode();
        }
        if (getCaBillProdList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCaBillProdList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCaBillProdList(), i);
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
        new org.apache.axis.description.TypeDesc(CaBillItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caBillItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ppyFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ppyFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "discountFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("outerAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resourceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifierName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identifierName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("defaultAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outerDefaultAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerDefaultAcctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caBillProdList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "caBillProdList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caBillProd"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "caBillProdListItem"));
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
