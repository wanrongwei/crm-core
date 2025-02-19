/**
 * UpdateDoc2RequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.sap;

public class UpdateDoc2RequestBody  implements java.io.Serializable {
    private com.asiainfo.crm.inter.exe.webservice.client.sap.UpdateDocSoHeaderDataUpd headerData;

    private com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemAttDocuUpd[] itemAttachmentData;

    private com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemDataUpd[] itemData;

    private com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemDeliMethUpd[] itemDeliveryMethod;

    private com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemLongTextUpd[] itemLongTextData;

    private com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemPartnerDataUpd[] itemPartnerData;

    public UpdateDoc2RequestBody() {
    }

    public UpdateDoc2RequestBody(
           com.asiainfo.crm.inter.exe.webservice.client.sap.UpdateDocSoHeaderDataUpd headerData,
           com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemAttDocuUpd[] itemAttachmentData,
           com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemDataUpd[] itemData,
           com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemDeliMethUpd[] itemDeliveryMethod,
           com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemLongTextUpd[] itemLongTextData,
           com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemPartnerDataUpd[] itemPartnerData) {
           this.headerData = headerData;
           this.itemAttachmentData = itemAttachmentData;
           this.itemData = itemData;
           this.itemDeliveryMethod = itemDeliveryMethod;
           this.itemLongTextData = itemLongTextData;
           this.itemPartnerData = itemPartnerData;
    }


    /**
     * Gets the headerData value for this UpdateDoc2RequestBody.
     * 
     * @return headerData
     */
    public com.asiainfo.crm.inter.exe.webservice.client.sap.UpdateDocSoHeaderDataUpd getHeaderData() {
        return headerData;
    }


    /**
     * Sets the headerData value for this UpdateDoc2RequestBody.
     * 
     * @param headerData
     */
    public void setHeaderData(com.asiainfo.crm.inter.exe.webservice.client.sap.UpdateDocSoHeaderDataUpd headerData) {
        this.headerData = headerData;
    }


    /**
     * Gets the itemAttachmentData value for this UpdateDoc2RequestBody.
     * 
     * @return itemAttachmentData
     */
    public com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemAttDocuUpd[] getItemAttachmentData() {
        return itemAttachmentData;
    }


    /**
     * Sets the itemAttachmentData value for this UpdateDoc2RequestBody.
     * 
     * @param itemAttachmentData
     */
    public void setItemAttachmentData(com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemAttDocuUpd[] itemAttachmentData) {
        this.itemAttachmentData = itemAttachmentData;
    }


    /**
     * Gets the itemData value for this UpdateDoc2RequestBody.
     * 
     * @return itemData
     */
    public com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemDataUpd[] getItemData() {
        return itemData;
    }


    /**
     * Sets the itemData value for this UpdateDoc2RequestBody.
     * 
     * @param itemData
     */
    public void setItemData(com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemDataUpd[] itemData) {
        this.itemData = itemData;
    }


    /**
     * Gets the itemDeliveryMethod value for this UpdateDoc2RequestBody.
     * 
     * @return itemDeliveryMethod
     */
    public com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemDeliMethUpd[] getItemDeliveryMethod() {
        return itemDeliveryMethod;
    }


    /**
     * Sets the itemDeliveryMethod value for this UpdateDoc2RequestBody.
     * 
     * @param itemDeliveryMethod
     */
    public void setItemDeliveryMethod(com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemDeliMethUpd[] itemDeliveryMethod) {
        this.itemDeliveryMethod = itemDeliveryMethod;
    }


    /**
     * Gets the itemLongTextData value for this UpdateDoc2RequestBody.
     * 
     * @return itemLongTextData
     */
    public com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemLongTextUpd[] getItemLongTextData() {
        return itemLongTextData;
    }


    /**
     * Sets the itemLongTextData value for this UpdateDoc2RequestBody.
     * 
     * @param itemLongTextData
     */
    public void setItemLongTextData(com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemLongTextUpd[] itemLongTextData) {
        this.itemLongTextData = itemLongTextData;
    }


    /**
     * Gets the itemPartnerData value for this UpdateDoc2RequestBody.
     * 
     * @return itemPartnerData
     */
    public com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemPartnerDataUpd[] getItemPartnerData() {
        return itemPartnerData;
    }


    /**
     * Sets the itemPartnerData value for this UpdateDoc2RequestBody.
     * 
     * @param itemPartnerData
     */
    public void setItemPartnerData(com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemPartnerDataUpd[] itemPartnerData) {
        this.itemPartnerData = itemPartnerData;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateDoc2RequestBody)) return false;
        UpdateDoc2RequestBody other = (UpdateDoc2RequestBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
        if (getHeaderData() != null) {
            _hashCode += getHeaderData().hashCode();
        }
        if (getItemAttachmentData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemAttachmentData());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getItemAttachmentData(), i);
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
                Object obj = java.lang.reflect.Array.get(getItemData(), i);
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
                Object obj = java.lang.reflect.Array.get(getItemDeliveryMethod(), i);
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
                Object obj = java.lang.reflect.Array.get(getItemLongTextData(), i);
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
                Object obj = java.lang.reflect.Array.get(getItemPartnerData(), i);
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
        new org.apache.axis.description.TypeDesc(UpdateDoc2RequestBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "UpdateDoc2RequestBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headerData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HeaderData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "updateDocSoHeaderDataUpd"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemAttachmentData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ItemAttachmentData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemAttDocuUpd"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ItemData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemDataUpd"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemDeliveryMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ItemDeliveryMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemDeliMethUpd"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemLongTextData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ItemLongTextData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemLongTextUpd"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPartnerData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ItemPartnerData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemPartnerDataUpd"));
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
