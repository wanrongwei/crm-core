/**
 * SRequestBodReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsservice;

public class SRequestBodReq  implements java.io.Serializable {
    private java.lang.Long acctId;

    private java.lang.Integer action;

    private java.lang.Integer billFormatId;

    private java.lang.Long mailCode;

    private java.lang.Integer printBill;

    private java.lang.Integer languageId;

    private java.lang.Integer dueDay;

    private java.lang.Integer printSide;

    private java.lang.Integer prepaidValidType;

    private java.util.Calendar billDate;

    public SRequestBodReq() {
    }

    public SRequestBodReq(
           java.lang.Long acctId,
           java.lang.Integer action,
           java.lang.Integer billFormatId,
           java.lang.Long mailCode,
           java.lang.Integer printBill,
           java.lang.Integer languageId,
           java.lang.Integer dueDay,
           java.lang.Integer printSide,
           java.lang.Integer prepaidValidType,
           java.util.Calendar billDate) {
           this.acctId = acctId;
           this.action = action;
           this.billFormatId = billFormatId;
           this.mailCode = mailCode;
           this.printBill = printBill;
           this.languageId = languageId;
           this.dueDay = dueDay;
           this.printSide = printSide;
           this.prepaidValidType = prepaidValidType;
           this.billDate = billDate;
    }


    /**
     * Gets the acctId value for this SRequestBodReq.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this SRequestBodReq.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the action value for this SRequestBodReq.
     * 
     * @return action
     */
    public java.lang.Integer getAction() {
        return action;
    }


    /**
     * Sets the action value for this SRequestBodReq.
     * 
     * @param action
     */
    public void setAction(java.lang.Integer action) {
        this.action = action;
    }


    /**
     * Gets the billFormatId value for this SRequestBodReq.
     * 
     * @return billFormatId
     */
    public java.lang.Integer getBillFormatId() {
        return billFormatId;
    }


    /**
     * Sets the billFormatId value for this SRequestBodReq.
     * 
     * @param billFormatId
     */
    public void setBillFormatId(java.lang.Integer billFormatId) {
        this.billFormatId = billFormatId;
    }


    /**
     * Gets the mailCode value for this SRequestBodReq.
     * 
     * @return mailCode
     */
    public java.lang.Long getMailCode() {
        return mailCode;
    }


    /**
     * Sets the mailCode value for this SRequestBodReq.
     * 
     * @param mailCode
     */
    public void setMailCode(java.lang.Long mailCode) {
        this.mailCode = mailCode;
    }


    /**
     * Gets the printBill value for this SRequestBodReq.
     * 
     * @return printBill
     */
    public java.lang.Integer getPrintBill() {
        return printBill;
    }


    /**
     * Sets the printBill value for this SRequestBodReq.
     * 
     * @param printBill
     */
    public void setPrintBill(java.lang.Integer printBill) {
        this.printBill = printBill;
    }


    /**
     * Gets the languageId value for this SRequestBodReq.
     * 
     * @return languageId
     */
    public java.lang.Integer getLanguageId() {
        return languageId;
    }


    /**
     * Sets the languageId value for this SRequestBodReq.
     * 
     * @param languageId
     */
    public void setLanguageId(java.lang.Integer languageId) {
        this.languageId = languageId;
    }


    /**
     * Gets the dueDay value for this SRequestBodReq.
     * 
     * @return dueDay
     */
    public java.lang.Integer getDueDay() {
        return dueDay;
    }


    /**
     * Sets the dueDay value for this SRequestBodReq.
     * 
     * @param dueDay
     */
    public void setDueDay(java.lang.Integer dueDay) {
        this.dueDay = dueDay;
    }


    /**
     * Gets the printSide value for this SRequestBodReq.
     * 
     * @return printSide
     */
    public java.lang.Integer getPrintSide() {
        return printSide;
    }


    /**
     * Sets the printSide value for this SRequestBodReq.
     * 
     * @param printSide
     */
    public void setPrintSide(java.lang.Integer printSide) {
        this.printSide = printSide;
    }


    /**
     * Gets the prepaidValidType value for this SRequestBodReq.
     * 
     * @return prepaidValidType
     */
    public java.lang.Integer getPrepaidValidType() {
        return prepaidValidType;
    }


    /**
     * Sets the prepaidValidType value for this SRequestBodReq.
     * 
     * @param prepaidValidType
     */
    public void setPrepaidValidType(java.lang.Integer prepaidValidType) {
        this.prepaidValidType = prepaidValidType;
    }


    /**
     * Gets the billDate value for this SRequestBodReq.
     * 
     * @return billDate
     */
    public java.util.Calendar getBillDate() {
        return billDate;
    }


    /**
     * Sets the billDate value for this SRequestBodReq.
     * 
     * @param billDate
     */
    public void setBillDate(java.util.Calendar billDate) {
        this.billDate = billDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SRequestBodReq)) return false;
        SRequestBodReq other = (SRequestBodReq) obj;
       
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.billFormatId==null && other.getBillFormatId()==null) || 
             (this.billFormatId!=null &&
              this.billFormatId.equals(other.getBillFormatId()))) &&
            ((this.mailCode==null && other.getMailCode()==null) || 
             (this.mailCode!=null &&
              this.mailCode.equals(other.getMailCode()))) &&
            ((this.printBill==null && other.getPrintBill()==null) || 
             (this.printBill!=null &&
              this.printBill.equals(other.getPrintBill()))) &&
            ((this.languageId==null && other.getLanguageId()==null) || 
             (this.languageId!=null &&
              this.languageId.equals(other.getLanguageId()))) &&
            ((this.dueDay==null && other.getDueDay()==null) || 
             (this.dueDay!=null &&
              this.dueDay.equals(other.getDueDay()))) &&
            ((this.printSide==null && other.getPrintSide()==null) || 
             (this.printSide!=null &&
              this.printSide.equals(other.getPrintSide()))) &&
            ((this.prepaidValidType==null && other.getPrepaidValidType()==null) || 
             (this.prepaidValidType!=null &&
              this.prepaidValidType.equals(other.getPrepaidValidType()))) &&
            ((this.billDate==null && other.getBillDate()==null) || 
             (this.billDate!=null &&
              this.billDate.equals(other.getBillDate())));
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
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getBillFormatId() != null) {
            _hashCode += getBillFormatId().hashCode();
        }
        if (getMailCode() != null) {
            _hashCode += getMailCode().hashCode();
        }
        if (getPrintBill() != null) {
            _hashCode += getPrintBill().hashCode();
        }
        if (getLanguageId() != null) {
            _hashCode += getLanguageId().hashCode();
        }
        if (getDueDay() != null) {
            _hashCode += getDueDay().hashCode();
        }
        if (getPrintSide() != null) {
            _hashCode += getPrintSide().hashCode();
        }
        if (getPrepaidValidType() != null) {
            _hashCode += getPrepaidValidType().hashCode();
        }
        if (getBillDate() != null) {
            _hashCode += getBillDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SRequestBodReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sRequestBodReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("", "action"));
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
        elemField.setFieldName("mailCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mailCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printBill");
        elemField.setXmlName(new javax.xml.namespace.QName("", "printBill"));
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
        elemField.setFieldName("dueDay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dueDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printSide");
        elemField.setXmlName(new javax.xml.namespace.QName("", "printSide"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prepaidValidType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prepaidValidType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billDate"));
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
