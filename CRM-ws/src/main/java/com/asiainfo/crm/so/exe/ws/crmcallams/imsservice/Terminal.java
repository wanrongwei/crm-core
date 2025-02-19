/**
 * Terminal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsservice;

public class Terminal  implements java.io.Serializable {
    private java.lang.String autoAuth;

    private java.lang.String autoSale;

    private java.lang.String design;

    private java.lang.String feeList;

    private java.lang.String language;

    private java.lang.String layout;

    private java.lang.String orderDescription;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.PaymentMethodAction[] paymentMethodActionList;

    private java.lang.String paymentMethodList;

    private java.lang.String redirectUrl;

    private java.lang.String singlePage;

    private java.lang.String templateData;

    private java.lang.String vat;

    public Terminal() {
    }

    public Terminal(
           java.lang.String autoAuth,
           java.lang.String autoSale,
           java.lang.String design,
           java.lang.String feeList,
           java.lang.String language,
           java.lang.String layout,
           java.lang.String orderDescription,
           com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.PaymentMethodAction[] paymentMethodActionList,
           java.lang.String paymentMethodList,
           java.lang.String redirectUrl,
           java.lang.String singlePage,
           java.lang.String templateData,
           java.lang.String vat) {
           this.autoAuth = autoAuth;
           this.autoSale = autoSale;
           this.design = design;
           this.feeList = feeList;
           this.language = language;
           this.layout = layout;
           this.orderDescription = orderDescription;
           this.paymentMethodActionList = paymentMethodActionList;
           this.paymentMethodList = paymentMethodList;
           this.redirectUrl = redirectUrl;
           this.singlePage = singlePage;
           this.templateData = templateData;
           this.vat = vat;
    }


    /**
     * Gets the autoAuth value for this Terminal.
     * 
     * @return autoAuth
     */
    public java.lang.String getAutoAuth() {
        return autoAuth;
    }


    /**
     * Sets the autoAuth value for this Terminal.
     * 
     * @param autoAuth
     */
    public void setAutoAuth(java.lang.String autoAuth) {
        this.autoAuth = autoAuth;
    }


    /**
     * Gets the autoSale value for this Terminal.
     * 
     * @return autoSale
     */
    public java.lang.String getAutoSale() {
        return autoSale;
    }


    /**
     * Sets the autoSale value for this Terminal.
     * 
     * @param autoSale
     */
    public void setAutoSale(java.lang.String autoSale) {
        this.autoSale = autoSale;
    }


    /**
     * Gets the design value for this Terminal.
     * 
     * @return design
     */
    public java.lang.String getDesign() {
        return design;
    }


    /**
     * Sets the design value for this Terminal.
     * 
     * @param design
     */
    public void setDesign(java.lang.String design) {
        this.design = design;
    }


    /**
     * Gets the feeList value for this Terminal.
     * 
     * @return feeList
     */
    public java.lang.String getFeeList() {
        return feeList;
    }


    /**
     * Sets the feeList value for this Terminal.
     * 
     * @param feeList
     */
    public void setFeeList(java.lang.String feeList) {
        this.feeList = feeList;
    }


    /**
     * Gets the language value for this Terminal.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this Terminal.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the layout value for this Terminal.
     * 
     * @return layout
     */
    public java.lang.String getLayout() {
        return layout;
    }


    /**
     * Sets the layout value for this Terminal.
     * 
     * @param layout
     */
    public void setLayout(java.lang.String layout) {
        this.layout = layout;
    }


    /**
     * Gets the orderDescription value for this Terminal.
     * 
     * @return orderDescription
     */
    public java.lang.String getOrderDescription() {
        return orderDescription;
    }


    /**
     * Sets the orderDescription value for this Terminal.
     * 
     * @param orderDescription
     */
    public void setOrderDescription(java.lang.String orderDescription) {
        this.orderDescription = orderDescription;
    }


    /**
     * Gets the paymentMethodActionList value for this Terminal.
     * 
     * @return paymentMethodActionList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.PaymentMethodAction[] getPaymentMethodActionList() {
        return paymentMethodActionList;
    }


    /**
     * Sets the paymentMethodActionList value for this Terminal.
     * 
     * @param paymentMethodActionList
     */
    public void setPaymentMethodActionList(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.PaymentMethodAction[] paymentMethodActionList) {
        this.paymentMethodActionList = paymentMethodActionList;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.PaymentMethodAction getPaymentMethodActionList(int i) {
        return this.paymentMethodActionList[i];
    }

    public void setPaymentMethodActionList(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.PaymentMethodAction _value) {
        this.paymentMethodActionList[i] = _value;
    }


    /**
     * Gets the paymentMethodList value for this Terminal.
     * 
     * @return paymentMethodList
     */
    public java.lang.String getPaymentMethodList() {
        return paymentMethodList;
    }


    /**
     * Sets the paymentMethodList value for this Terminal.
     * 
     * @param paymentMethodList
     */
    public void setPaymentMethodList(java.lang.String paymentMethodList) {
        this.paymentMethodList = paymentMethodList;
    }


    /**
     * Gets the redirectUrl value for this Terminal.
     * 
     * @return redirectUrl
     */
    public java.lang.String getRedirectUrl() {
        return redirectUrl;
    }


    /**
     * Sets the redirectUrl value for this Terminal.
     * 
     * @param redirectUrl
     */
    public void setRedirectUrl(java.lang.String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }


    /**
     * Gets the singlePage value for this Terminal.
     * 
     * @return singlePage
     */
    public java.lang.String getSinglePage() {
        return singlePage;
    }


    /**
     * Sets the singlePage value for this Terminal.
     * 
     * @param singlePage
     */
    public void setSinglePage(java.lang.String singlePage) {
        this.singlePage = singlePage;
    }


    /**
     * Gets the templateData value for this Terminal.
     * 
     * @return templateData
     */
    public java.lang.String getTemplateData() {
        return templateData;
    }


    /**
     * Sets the templateData value for this Terminal.
     * 
     * @param templateData
     */
    public void setTemplateData(java.lang.String templateData) {
        this.templateData = templateData;
    }


    /**
     * Gets the vat value for this Terminal.
     * 
     * @return vat
     */
    public java.lang.String getVat() {
        return vat;
    }


    /**
     * Sets the vat value for this Terminal.
     * 
     * @param vat
     */
    public void setVat(java.lang.String vat) {
        this.vat = vat;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Terminal)) return false;
        Terminal other = (Terminal) obj;
       
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.autoAuth==null && other.getAutoAuth()==null) || 
             (this.autoAuth!=null &&
              this.autoAuth.equals(other.getAutoAuth()))) &&
            ((this.autoSale==null && other.getAutoSale()==null) || 
             (this.autoSale!=null &&
              this.autoSale.equals(other.getAutoSale()))) &&
            ((this.design==null && other.getDesign()==null) || 
             (this.design!=null &&
              this.design.equals(other.getDesign()))) &&
            ((this.feeList==null && other.getFeeList()==null) || 
             (this.feeList!=null &&
              this.feeList.equals(other.getFeeList()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.layout==null && other.getLayout()==null) || 
             (this.layout!=null &&
              this.layout.equals(other.getLayout()))) &&
            ((this.orderDescription==null && other.getOrderDescription()==null) || 
             (this.orderDescription!=null &&
              this.orderDescription.equals(other.getOrderDescription()))) &&
            ((this.paymentMethodActionList==null && other.getPaymentMethodActionList()==null) || 
             (this.paymentMethodActionList!=null &&
              java.util.Arrays.equals(this.paymentMethodActionList, other.getPaymentMethodActionList()))) &&
            ((this.paymentMethodList==null && other.getPaymentMethodList()==null) || 
             (this.paymentMethodList!=null &&
              this.paymentMethodList.equals(other.getPaymentMethodList()))) &&
            ((this.redirectUrl==null && other.getRedirectUrl()==null) || 
             (this.redirectUrl!=null &&
              this.redirectUrl.equals(other.getRedirectUrl()))) &&
            ((this.singlePage==null && other.getSinglePage()==null) || 
             (this.singlePage!=null &&
              this.singlePage.equals(other.getSinglePage()))) &&
            ((this.templateData==null && other.getTemplateData()==null) || 
             (this.templateData!=null &&
              this.templateData.equals(other.getTemplateData()))) &&
            ((this.vat==null && other.getVat()==null) || 
             (this.vat!=null &&
              this.vat.equals(other.getVat())));
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
        if (getAutoAuth() != null) {
            _hashCode += getAutoAuth().hashCode();
        }
        if (getAutoSale() != null) {
            _hashCode += getAutoSale().hashCode();
        }
        if (getDesign() != null) {
            _hashCode += getDesign().hashCode();
        }
        if (getFeeList() != null) {
            _hashCode += getFeeList().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getLayout() != null) {
            _hashCode += getLayout().hashCode();
        }
        if (getOrderDescription() != null) {
            _hashCode += getOrderDescription().hashCode();
        }
        if (getPaymentMethodActionList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentMethodActionList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentMethodActionList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentMethodList() != null) {
            _hashCode += getPaymentMethodList().hashCode();
        }
        if (getRedirectUrl() != null) {
            _hashCode += getRedirectUrl().hashCode();
        }
        if (getSinglePage() != null) {
            _hashCode += getSinglePage().hashCode();
        }
        if (getTemplateData() != null) {
            _hashCode += getTemplateData().hashCode();
        }
        if (getVat() != null) {
            _hashCode += getVat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Terminal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "terminal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoAuth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AutoAuth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoSale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AutoSale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("design");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Design"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FeeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Layout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OrderDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethodActionList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PaymentMethodActionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "paymentMethodAction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethodList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PaymentMethodList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redirectUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RedirectUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("singlePage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SinglePage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TemplateData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Vat"));
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
