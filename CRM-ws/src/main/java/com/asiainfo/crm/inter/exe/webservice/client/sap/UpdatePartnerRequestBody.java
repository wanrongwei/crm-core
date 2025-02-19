/**
 * UpdatePartnerRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.sap;

public class UpdatePartnerRequestBody  implements java.io.Serializable {
    private com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSdPsCommonPartnerChng commonPartnerData;

    private com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSdPsDealerChange dealerSpecificData;

    private com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSdPsOutletChange outletSpecificData;

    public UpdatePartnerRequestBody() {
    }

    public UpdatePartnerRequestBody(
           com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSdPsCommonPartnerChng commonPartnerData,
           com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSdPsDealerChange dealerSpecificData,
           com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSdPsOutletChange outletSpecificData) {
           this.commonPartnerData = commonPartnerData;
           this.dealerSpecificData = dealerSpecificData;
           this.outletSpecificData = outletSpecificData;
    }


    /**
     * Gets the commonPartnerData value for this UpdatePartnerRequestBody.
     * 
     * @return commonPartnerData
     */
    public com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSdPsCommonPartnerChng getCommonPartnerData() {
        return commonPartnerData;
    }


    /**
     * Sets the commonPartnerData value for this UpdatePartnerRequestBody.
     * 
     * @param commonPartnerData
     */
    public void setCommonPartnerData(com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSdPsCommonPartnerChng commonPartnerData) {
        this.commonPartnerData = commonPartnerData;
    }


    /**
     * Gets the dealerSpecificData value for this UpdatePartnerRequestBody.
     * 
     * @return dealerSpecificData
     */
    public com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSdPsDealerChange getDealerSpecificData() {
        return dealerSpecificData;
    }


    /**
     * Sets the dealerSpecificData value for this UpdatePartnerRequestBody.
     * 
     * @param dealerSpecificData
     */
    public void setDealerSpecificData(com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSdPsDealerChange dealerSpecificData) {
        this.dealerSpecificData = dealerSpecificData;
    }


    /**
     * Gets the outletSpecificData value for this UpdatePartnerRequestBody.
     * 
     * @return outletSpecificData
     */
    public com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSdPsOutletChange getOutletSpecificData() {
        return outletSpecificData;
    }


    /**
     * Sets the outletSpecificData value for this UpdatePartnerRequestBody.
     * 
     * @param outletSpecificData
     */
    public void setOutletSpecificData(com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSdPsOutletChange outletSpecificData) {
        this.outletSpecificData = outletSpecificData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdatePartnerRequestBody)) return false;
        UpdatePartnerRequestBody other = (UpdatePartnerRequestBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.commonPartnerData==null && other.getCommonPartnerData()==null) || 
             (this.commonPartnerData!=null &&
              this.commonPartnerData.equals(other.getCommonPartnerData()))) &&
            ((this.dealerSpecificData==null && other.getDealerSpecificData()==null) || 
             (this.dealerSpecificData!=null &&
              this.dealerSpecificData.equals(other.getDealerSpecificData()))) &&
            ((this.outletSpecificData==null && other.getOutletSpecificData()==null) || 
             (this.outletSpecificData!=null &&
              this.outletSpecificData.equals(other.getOutletSpecificData())));
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
        if (getCommonPartnerData() != null) {
            _hashCode += getCommonPartnerData().hashCode();
        }
        if (getDealerSpecificData() != null) {
            _hashCode += getDealerSpecificData().hashCode();
        }
        if (getOutletSpecificData() != null) {
            _hashCode += getOutletSpecificData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdatePartnerRequestBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "UpdatePartnerRequestBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commonPartnerData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CommonPartnerData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSdPsCommonPartnerChng"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealerSpecificData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DealerSpecificData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSdPsDealerChange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outletSpecificData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OutletSpecificData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSdPsOutletChange"));
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
