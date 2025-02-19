/**
 * YwsSoItemDataUpd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.sap;

public class YwsSoItemDataUpd  implements java.io.Serializable {
    private java.lang.String itmNumber;

    private java.math.BigDecimal netPrice;

    private java.math.BigDecimal vatAmount;

    private java.lang.String msisdn;

    private java.lang.String subscriberName;

    public YwsSoItemDataUpd() {
    }

    public YwsSoItemDataUpd(
           java.lang.String itmNumber,
           java.math.BigDecimal netPrice,
           java.math.BigDecimal vatAmount,
           java.lang.String msisdn,
           java.lang.String subscriberName) {
           this.itmNumber = itmNumber;
           this.netPrice = netPrice;
           this.vatAmount = vatAmount;
           this.msisdn = msisdn;
           this.subscriberName = subscriberName;
    }


    /**
     * Gets the itmNumber value for this YwsSoItemDataUpd.
     * 
     * @return itmNumber
     */
    public java.lang.String getItmNumber() {
        return itmNumber;
    }


    /**
     * Sets the itmNumber value for this YwsSoItemDataUpd.
     * 
     * @param itmNumber
     */
    public void setItmNumber(java.lang.String itmNumber) {
        this.itmNumber = itmNumber;
    }


    /**
     * Gets the netPrice value for this YwsSoItemDataUpd.
     * 
     * @return netPrice
     */
    public java.math.BigDecimal getNetPrice() {
        return netPrice;
    }


    /**
     * Sets the netPrice value for this YwsSoItemDataUpd.
     * 
     * @param netPrice
     */
    public void setNetPrice(java.math.BigDecimal netPrice) {
        this.netPrice = netPrice;
    }


    /**
     * Gets the vatAmount value for this YwsSoItemDataUpd.
     * 
     * @return vatAmount
     */
    public java.math.BigDecimal getVatAmount() {
        return vatAmount;
    }


    /**
     * Sets the vatAmount value for this YwsSoItemDataUpd.
     * 
     * @param vatAmount
     */
    public void setVatAmount(java.math.BigDecimal vatAmount) {
        this.vatAmount = vatAmount;
    }


    /**
     * Gets the msisdn value for this YwsSoItemDataUpd.
     * 
     * @return msisdn
     */
    public java.lang.String getMsisdn() {
        return msisdn;
    }


    /**
     * Sets the msisdn value for this YwsSoItemDataUpd.
     * 
     * @param msisdn
     */
    public void setMsisdn(java.lang.String msisdn) {
        this.msisdn = msisdn;
    }


    /**
     * Gets the subscriberName value for this YwsSoItemDataUpd.
     * 
     * @return subscriberName
     */
    public java.lang.String getSubscriberName() {
        return subscriberName;
    }


    /**
     * Sets the subscriberName value for this YwsSoItemDataUpd.
     * 
     * @param subscriberName
     */
    public void setSubscriberName(java.lang.String subscriberName) {
        this.subscriberName = subscriberName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof YwsSoItemDataUpd)) return false;
        YwsSoItemDataUpd other = (YwsSoItemDataUpd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itmNumber==null && other.getItmNumber()==null) || 
             (this.itmNumber!=null &&
              this.itmNumber.equals(other.getItmNumber()))) &&
            ((this.netPrice==null && other.getNetPrice()==null) || 
             (this.netPrice!=null &&
              this.netPrice.equals(other.getNetPrice()))) &&
            ((this.vatAmount==null && other.getVatAmount()==null) || 
             (this.vatAmount!=null &&
              this.vatAmount.equals(other.getVatAmount()))) &&
            ((this.msisdn==null && other.getMsisdn()==null) || 
             (this.msisdn!=null &&
              this.msisdn.equals(other.getMsisdn()))) &&
            ((this.subscriberName==null && other.getSubscriberName()==null) || 
             (this.subscriberName!=null &&
              this.subscriberName.equals(other.getSubscriberName())));
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
        if (getItmNumber() != null) {
            _hashCode += getItmNumber().hashCode();
        }
        if (getNetPrice() != null) {
            _hashCode += getNetPrice().hashCode();
        }
        if (getVatAmount() != null) {
            _hashCode += getVatAmount().hashCode();
        }
        if (getMsisdn() != null) {
            _hashCode += getMsisdn().hashCode();
        }
        if (getSubscriberName() != null) {
            _hashCode += getSubscriberName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(YwsSoItemDataUpd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemDataUpd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itmNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ItmNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NetPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vatAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VatAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Msisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubscriberName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
