/**
 * YwsSdPsDealerChange.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.sap;

public class YwsSdPsDealerChange  implements java.io.Serializable {
    private java.lang.String dealerGroup;

    private java.lang.String domTaxNo;

    private java.lang.String forTaxNo;

    private java.lang.String currency;

    private java.lang.String pmntTerms;

    private java.lang.String taxClass;

    private java.lang.String EInvRel;

    private java.lang.String EInvMail;

    private java.lang.String mainCustId;

    public YwsSdPsDealerChange() {
    }

    public YwsSdPsDealerChange(
           java.lang.String dealerGroup,
           java.lang.String domTaxNo,
           java.lang.String forTaxNo,
           java.lang.String currency,
           java.lang.String pmntTerms,
           java.lang.String taxClass,
           java.lang.String EInvRel,
           java.lang.String EInvMail,
           java.lang.String mainCustId) {
           this.dealerGroup = dealerGroup;
           this.domTaxNo = domTaxNo;
           this.forTaxNo = forTaxNo;
           this.currency = currency;
           this.pmntTerms = pmntTerms;
           this.taxClass = taxClass;
           this.EInvRel = EInvRel;
           this.EInvMail = EInvMail;
           this.mainCustId = mainCustId;
    }


    /**
     * Gets the dealerGroup value for this YwsSdPsDealerChange.
     * 
     * @return dealerGroup
     */
    public java.lang.String getDealerGroup() {
        return dealerGroup;
    }


    /**
     * Sets the dealerGroup value for this YwsSdPsDealerChange.
     * 
     * @param dealerGroup
     */
    public void setDealerGroup(java.lang.String dealerGroup) {
        this.dealerGroup = dealerGroup;
    }


    /**
     * Gets the domTaxNo value for this YwsSdPsDealerChange.
     * 
     * @return domTaxNo
     */
    public java.lang.String getDomTaxNo() {
        return domTaxNo;
    }


    /**
     * Sets the domTaxNo value for this YwsSdPsDealerChange.
     * 
     * @param domTaxNo
     */
    public void setDomTaxNo(java.lang.String domTaxNo) {
        this.domTaxNo = domTaxNo;
    }


    /**
     * Gets the forTaxNo value for this YwsSdPsDealerChange.
     * 
     * @return forTaxNo
     */
    public java.lang.String getForTaxNo() {
        return forTaxNo;
    }


    /**
     * Sets the forTaxNo value for this YwsSdPsDealerChange.
     * 
     * @param forTaxNo
     */
    public void setForTaxNo(java.lang.String forTaxNo) {
        this.forTaxNo = forTaxNo;
    }


    /**
     * Gets the currency value for this YwsSdPsDealerChange.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this YwsSdPsDealerChange.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the pmntTerms value for this YwsSdPsDealerChange.
     * 
     * @return pmntTerms
     */
    public java.lang.String getPmntTerms() {
        return pmntTerms;
    }


    /**
     * Sets the pmntTerms value for this YwsSdPsDealerChange.
     * 
     * @param pmntTerms
     */
    public void setPmntTerms(java.lang.String pmntTerms) {
        this.pmntTerms = pmntTerms;
    }


    /**
     * Gets the taxClass value for this YwsSdPsDealerChange.
     * 
     * @return taxClass
     */
    public java.lang.String getTaxClass() {
        return taxClass;
    }


    /**
     * Sets the taxClass value for this YwsSdPsDealerChange.
     * 
     * @param taxClass
     */
    public void setTaxClass(java.lang.String taxClass) {
        this.taxClass = taxClass;
    }


    /**
     * Gets the EInvRel value for this YwsSdPsDealerChange.
     * 
     * @return EInvRel
     */
    public java.lang.String getEInvRel() {
        return EInvRel;
    }


    /**
     * Sets the EInvRel value for this YwsSdPsDealerChange.
     * 
     * @param EInvRel
     */
    public void setEInvRel(java.lang.String EInvRel) {
        this.EInvRel = EInvRel;
    }


    /**
     * Gets the EInvMail value for this YwsSdPsDealerChange.
     * 
     * @return EInvMail
     */
    public java.lang.String getEInvMail() {
        return EInvMail;
    }


    /**
     * Sets the EInvMail value for this YwsSdPsDealerChange.
     * 
     * @param EInvMail
     */
    public void setEInvMail(java.lang.String EInvMail) {
        this.EInvMail = EInvMail;
    }


    /**
     * Gets the mainCustId value for this YwsSdPsDealerChange.
     * 
     * @return mainCustId
     */
    public java.lang.String getMainCustId() {
        return mainCustId;
    }


    /**
     * Sets the mainCustId value for this YwsSdPsDealerChange.
     * 
     * @param mainCustId
     */
    public void setMainCustId(java.lang.String mainCustId) {
        this.mainCustId = mainCustId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof YwsSdPsDealerChange)) return false;
        YwsSdPsDealerChange other = (YwsSdPsDealerChange) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dealerGroup==null && other.getDealerGroup()==null) || 
             (this.dealerGroup!=null &&
              this.dealerGroup.equals(other.getDealerGroup()))) &&
            ((this.domTaxNo==null && other.getDomTaxNo()==null) || 
             (this.domTaxNo!=null &&
              this.domTaxNo.equals(other.getDomTaxNo()))) &&
            ((this.forTaxNo==null && other.getForTaxNo()==null) || 
             (this.forTaxNo!=null &&
              this.forTaxNo.equals(other.getForTaxNo()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.pmntTerms==null && other.getPmntTerms()==null) || 
             (this.pmntTerms!=null &&
              this.pmntTerms.equals(other.getPmntTerms()))) &&
            ((this.taxClass==null && other.getTaxClass()==null) || 
             (this.taxClass!=null &&
              this.taxClass.equals(other.getTaxClass()))) &&
            ((this.EInvRel==null && other.getEInvRel()==null) || 
             (this.EInvRel!=null &&
              this.EInvRel.equals(other.getEInvRel()))) &&
            ((this.EInvMail==null && other.getEInvMail()==null) || 
             (this.EInvMail!=null &&
              this.EInvMail.equals(other.getEInvMail()))) &&
            ((this.mainCustId==null && other.getMainCustId()==null) || 
             (this.mainCustId!=null &&
              this.mainCustId.equals(other.getMainCustId())));
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
        if (getDealerGroup() != null) {
            _hashCode += getDealerGroup().hashCode();
        }
        if (getDomTaxNo() != null) {
            _hashCode += getDomTaxNo().hashCode();
        }
        if (getForTaxNo() != null) {
            _hashCode += getForTaxNo().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getPmntTerms() != null) {
            _hashCode += getPmntTerms().hashCode();
        }
        if (getTaxClass() != null) {
            _hashCode += getTaxClass().hashCode();
        }
        if (getEInvRel() != null) {
            _hashCode += getEInvRel().hashCode();
        }
        if (getEInvMail() != null) {
            _hashCode += getEInvMail().hashCode();
        }
        if (getMainCustId() != null) {
            _hashCode += getMainCustId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(YwsSdPsDealerChange.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSdPsDealerChange"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealerGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DealerGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domTaxNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DomTaxNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forTaxNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ForTaxNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pmntTerms");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PmntTerms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxClass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TaxClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EInvRel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EInvRel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EInvMail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EInvMail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainCustId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MainCustId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
