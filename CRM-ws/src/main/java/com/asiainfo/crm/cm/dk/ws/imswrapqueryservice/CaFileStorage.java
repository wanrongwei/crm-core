/**
 * CaFileStorage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class CaFileStorage  implements java.io.Serializable {
    private java.lang.Long docId;

    private java.lang.Long acctId;

    private java.lang.String invoiceNo;

    private java.lang.Integer formatId;

    private java.lang.Integer billMonth;

    private java.lang.Integer docType;

    private java.lang.String docName;

    private java.lang.Short storageType;

    private java.lang.String docUrl;

    private java.lang.String storageKey;

    private java.util.Calendar createDate;

    private java.util.Calendar modDate;

    public CaFileStorage() {
    }

    public CaFileStorage(
           java.lang.Long docId,
           java.lang.Long acctId,
           java.lang.String invoiceNo,
           java.lang.Integer formatId,
           java.lang.Integer billMonth,
           java.lang.Integer docType,
           java.lang.String docName,
           java.lang.Short storageType,
           java.lang.String docUrl,
           java.lang.String storageKey,
           java.util.Calendar createDate,
           java.util.Calendar modDate) {
           this.docId = docId;
           this.acctId = acctId;
           this.invoiceNo = invoiceNo;
           this.formatId = formatId;
           this.billMonth = billMonth;
           this.docType = docType;
           this.docName = docName;
           this.storageType = storageType;
           this.docUrl = docUrl;
           this.storageKey = storageKey;
           this.createDate = createDate;
           this.modDate = modDate;
    }


    /**
     * Gets the docId value for this CaFileStorage.
     * 
     * @return docId
     */
    public java.lang.Long getDocId() {
        return docId;
    }


    /**
     * Sets the docId value for this CaFileStorage.
     * 
     * @param docId
     */
    public void setDocId(java.lang.Long docId) {
        this.docId = docId;
    }


    /**
     * Gets the acctId value for this CaFileStorage.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this CaFileStorage.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the invoiceNo value for this CaFileStorage.
     * 
     * @return invoiceNo
     */
    public java.lang.String getInvoiceNo() {
        return invoiceNo;
    }


    /**
     * Sets the invoiceNo value for this CaFileStorage.
     * 
     * @param invoiceNo
     */
    public void setInvoiceNo(java.lang.String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }


    /**
     * Gets the formatId value for this CaFileStorage.
     * 
     * @return formatId
     */
    public java.lang.Integer getFormatId() {
        return formatId;
    }


    /**
     * Sets the formatId value for this CaFileStorage.
     * 
     * @param formatId
     */
    public void setFormatId(java.lang.Integer formatId) {
        this.formatId = formatId;
    }


    /**
     * Gets the billMonth value for this CaFileStorage.
     * 
     * @return billMonth
     */
    public java.lang.Integer getBillMonth() {
        return billMonth;
    }


    /**
     * Sets the billMonth value for this CaFileStorage.
     * 
     * @param billMonth
     */
    public void setBillMonth(java.lang.Integer billMonth) {
        this.billMonth = billMonth;
    }


    /**
     * Gets the docType value for this CaFileStorage.
     * 
     * @return docType
     */
    public java.lang.Integer getDocType() {
        return docType;
    }


    /**
     * Sets the docType value for this CaFileStorage.
     * 
     * @param docType
     */
    public void setDocType(java.lang.Integer docType) {
        this.docType = docType;
    }


    /**
     * Gets the docName value for this CaFileStorage.
     * 
     * @return docName
     */
    public java.lang.String getDocName() {
        return docName;
    }


    /**
     * Sets the docName value for this CaFileStorage.
     * 
     * @param docName
     */
    public void setDocName(java.lang.String docName) {
        this.docName = docName;
    }


    /**
     * Gets the storageType value for this CaFileStorage.
     * 
     * @return storageType
     */
    public java.lang.Short getStorageType() {
        return storageType;
    }


    /**
     * Sets the storageType value for this CaFileStorage.
     * 
     * @param storageType
     */
    public void setStorageType(java.lang.Short storageType) {
        this.storageType = storageType;
    }


    /**
     * Gets the docUrl value for this CaFileStorage.
     * 
     * @return docUrl
     */
    public java.lang.String getDocUrl() {
        return docUrl;
    }


    /**
     * Sets the docUrl value for this CaFileStorage.
     * 
     * @param docUrl
     */
    public void setDocUrl(java.lang.String docUrl) {
        this.docUrl = docUrl;
    }


    /**
     * Gets the storageKey value for this CaFileStorage.
     * 
     * @return storageKey
     */
    public java.lang.String getStorageKey() {
        return storageKey;
    }


    /**
     * Sets the storageKey value for this CaFileStorage.
     * 
     * @param storageKey
     */
    public void setStorageKey(java.lang.String storageKey) {
        this.storageKey = storageKey;
    }


    /**
     * Gets the createDate value for this CaFileStorage.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this CaFileStorage.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the modDate value for this CaFileStorage.
     * 
     * @return modDate
     */
    public java.util.Calendar getModDate() {
        return modDate;
    }


    /**
     * Sets the modDate value for this CaFileStorage.
     * 
     * @param modDate
     */
    public void setModDate(java.util.Calendar modDate) {
        this.modDate = modDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CaFileStorage)) return false;
        CaFileStorage other = (CaFileStorage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.docId==null && other.getDocId()==null) || 
             (this.docId!=null &&
              this.docId.equals(other.getDocId()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.invoiceNo==null && other.getInvoiceNo()==null) || 
             (this.invoiceNo!=null &&
              this.invoiceNo.equals(other.getInvoiceNo()))) &&
            ((this.formatId==null && other.getFormatId()==null) || 
             (this.formatId!=null &&
              this.formatId.equals(other.getFormatId()))) &&
            ((this.billMonth==null && other.getBillMonth()==null) || 
             (this.billMonth!=null &&
              this.billMonth.equals(other.getBillMonth()))) &&
            ((this.docType==null && other.getDocType()==null) || 
             (this.docType!=null &&
              this.docType.equals(other.getDocType()))) &&
            ((this.docName==null && other.getDocName()==null) || 
             (this.docName!=null &&
              this.docName.equals(other.getDocName()))) &&
            ((this.storageType==null && other.getStorageType()==null) || 
             (this.storageType!=null &&
              this.storageType.equals(other.getStorageType()))) &&
            ((this.docUrl==null && other.getDocUrl()==null) || 
             (this.docUrl!=null &&
              this.docUrl.equals(other.getDocUrl()))) &&
            ((this.storageKey==null && other.getStorageKey()==null) || 
             (this.storageKey!=null &&
              this.storageKey.equals(other.getStorageKey()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.modDate==null && other.getModDate()==null) || 
             (this.modDate!=null &&
              this.modDate.equals(other.getModDate())));
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
        if (getDocId() != null) {
            _hashCode += getDocId().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getInvoiceNo() != null) {
            _hashCode += getInvoiceNo().hashCode();
        }
        if (getFormatId() != null) {
            _hashCode += getFormatId().hashCode();
        }
        if (getBillMonth() != null) {
            _hashCode += getBillMonth().hashCode();
        }
        if (getDocType() != null) {
            _hashCode += getDocType().hashCode();
        }
        if (getDocName() != null) {
            _hashCode += getDocName().hashCode();
        }
        if (getStorageType() != null) {
            _hashCode += getStorageType().hashCode();
        }
        if (getDocUrl() != null) {
            _hashCode += getDocUrl().hashCode();
        }
        if (getStorageKey() != null) {
            _hashCode += getStorageKey().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getModDate() != null) {
            _hashCode += getModDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CaFileStorage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caFileStorage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("invoiceNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formatId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "formatId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("docType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "storageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storageKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "storageKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("modDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
