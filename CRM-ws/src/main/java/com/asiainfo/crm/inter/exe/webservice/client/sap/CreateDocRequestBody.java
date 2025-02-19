/**
 * CreateDocRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.sap;

public class CreateDocRequestBody  implements java.io.Serializable {
    private com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSdSoControlData controlData;

    private com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoHeaderData headerData;

    private com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemAttDocu[] itemAttachmentData;

    private com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemData[] itemData;

    private com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemDeliMeth[] itemDeliveryMethod;

    private com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemLongText[] itemLongTextData;

    private com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemPartnerData[] itemPartnerData;

    public CreateDocRequestBody() {
    }

    public CreateDocRequestBody(
           com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSdSoControlData controlData,
           com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoHeaderData headerData,
           com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemAttDocu[] itemAttachmentData,
           com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemData[] itemData,
           com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemDeliMeth[] itemDeliveryMethod,
           com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemLongText[] itemLongTextData,
           com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemPartnerData[] itemPartnerData) {
           this.controlData = controlData;
           this.headerData = headerData;
           this.itemAttachmentData = itemAttachmentData;
           this.itemData = itemData;
           this.itemDeliveryMethod = itemDeliveryMethod;
           this.itemLongTextData = itemLongTextData;
           this.itemPartnerData = itemPartnerData;
    }


    /**
     * Gets the controlData value for this CreateDocRequestBody.
     * 
     * @return controlData
     */
    public com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSdSoControlData getControlData() {
        return controlData;
    }


    /**
     * Sets the controlData value for this CreateDocRequestBody.
     * 
     * @param controlData
     */
    public void setControlData(com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSdSoControlData controlData) {
        this.controlData = controlData;
    }


    /**
     * Gets the headerData value for this CreateDocRequestBody.
     * 
     * @return headerData
     */
    public com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoHeaderData getHeaderData() {
        return headerData;
    }


    /**
     * Sets the headerData value for this CreateDocRequestBody.
     * 
     * @param headerData
     */
    public void setHeaderData(com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoHeaderData headerData) {
        this.headerData = headerData;
    }


    /**
     * Gets the itemAttachmentData value for this CreateDocRequestBody.
     * 
     * @return itemAttachmentData
     */
    public com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemAttDocu[] getItemAttachmentData() {
        return itemAttachmentData;
    }


    /**
     * Sets the itemAttachmentData value for this CreateDocRequestBody.
     * 
     * @param itemAttachmentData
     */
    public void setItemAttachmentData(com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemAttDocu[] itemAttachmentData) {
        this.itemAttachmentData = itemAttachmentData;
    }


    /**
     * Gets the itemData value for this CreateDocRequestBody.
     * 
     * @return itemData
     */
    public com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemData[] getItemData() {
        return itemData;
    }


    /**
     * Sets the itemData value for this CreateDocRequestBody.
     * 
     * @param itemData
     */
    public void setItemData(com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemData[] itemData) {
        this.itemData = itemData;
    }


    /**
     * Gets the itemDeliveryMethod value for this CreateDocRequestBody.
     * 
     * @return itemDeliveryMethod
     */
    public com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemDeliMeth[] getItemDeliveryMethod() {
        return itemDeliveryMethod;
    }


    /**
     * Sets the itemDeliveryMethod value for this CreateDocRequestBody.
     * 
     * @param itemDeliveryMethod
     */
    public void setItemDeliveryMethod(com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemDeliMeth[] itemDeliveryMethod) {
        this.itemDeliveryMethod = itemDeliveryMethod;
    }


    /**
     * Gets the itemLongTextData value for this CreateDocRequestBody.
     * 
     * @return itemLongTextData
     */
    public com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemLongText[] getItemLongTextData() {
        return itemLongTextData;
    }


    /**
     * Sets the itemLongTextData value for this CreateDocRequestBody.
     * 
     * @param itemLongTextData
     */
    public void setItemLongTextData(com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemLongText[] itemLongTextData) {
        this.itemLongTextData = itemLongTextData;
    }


    /**
     * Gets the itemPartnerData value for this CreateDocRequestBody.
     * 
     * @return itemPartnerData
     */
    public com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemPartnerData[] getItemPartnerData() {
        return itemPartnerData;
    }


    /**
     * Sets the itemPartnerData value for this CreateDocRequestBody.
     * 
     * @param itemPartnerData
     */
    public void setItemPartnerData(com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemPartnerData[] itemPartnerData) {
        this.itemPartnerData = itemPartnerData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateDocRequestBody)) return false;
        CreateDocRequestBody other = (CreateDocRequestBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.controlData==null && other.getControlData()==null) || 
             (this.controlData!=null &&
              this.controlData.equals(other.getControlData()))) &&
            ((this.headerData==null && other.getHeaderData()==null) || 
             (this.headerData!=null &&
              this.headerData.equals(other.getHeaderData()))) &&
            ((this.itemAttachmentData==null && other.getItemAttachmentData()==null) || 
             (this.itemAttachmentData!=null &&
              java.util.Arrays.equals(this.itemAttachmentData, other.getItemAttachmentData()))) &&
            ((this.itemData==null && other.getItemData()==null) || 
             (this.itemData!=null &&
              java.util.Arrays.equals(this.itemData, other.getItemData()))) &&
            ((this.itemDeliveryMethod==null && other.getItemDeliveryMethod()==null) || 
             (this.itemDeliveryMethod!=null &&
              java.util.Arrays.equals(this.itemDeliveryMethod, other.getItemDeliveryMethod()))) &&
            ((this.itemLongTextData==null && other.getItemLongTextData()==null) || 
             (this.itemLongTextData!=null &&
              java.util.Arrays.equals(this.itemLongTextData, other.getItemLongTextData()))) &&
            ((this.itemPartnerData==null && other.getItemPartnerData()==null) || 
             (this.itemPartnerData!=null &&
              java.util.Arrays.equals(this.itemPartnerData, other.getItemPartnerData())));
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
        if (getControlData() != null) {
            _hashCode += getControlData().hashCode();
        }
        if (getHeaderData() != null) {
            _hashCode += getHeaderData().hashCode();
        }
        if (getItemAttachmentData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemAttachmentData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemAttachmentData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemDeliveryMethod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemDeliveryMethod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemDeliveryMethod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemLongTextData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemLongTextData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemLongTextData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemPartnerData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemPartnerData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemPartnerData(), i);
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
        new org.apache.axis.description.TypeDesc(CreateDocRequestBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "CreateDocRequestBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controlData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ControlData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSdSoControlData"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headerData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HeaderData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoHeaderData"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemAttachmentData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ItemAttachmentData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemAttDocu"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ItemData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemDeliveryMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ItemDeliveryMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemDeliMeth"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemLongTextData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ItemLongTextData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemLongText"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPartnerData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ItemPartnerData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemPartnerData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
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
