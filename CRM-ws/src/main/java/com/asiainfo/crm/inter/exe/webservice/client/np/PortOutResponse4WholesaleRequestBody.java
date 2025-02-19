/**
 * PortOutResponse4WholesaleRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.np;

import org.apache.axis.description.ElementDesc;

import javax.xml.namespace.QName;

import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class PortOutResponse4WholesaleRequestBody  implements java.io.Serializable {
    private java.lang.String orderId;

    private java.lang.String crmOrderId;

    private java.lang.String responseType;

    private java.lang.String confirmedExecutionDate;

    private java.lang.String confirmationStatus;

    private java.lang.String rejectCode;

    private java.lang.String rejectReason;

    private java.lang.String rejectDesc;

    private java.lang.String debitAmount;

    public PortOutResponse4WholesaleRequestBody() {
    }

    public PortOutResponse4WholesaleRequestBody(
           java.lang.String orderId,
           java.lang.String crmOrderId,
           java.lang.String responseType,
           java.lang.String confirmedExecutionDate,
           java.lang.String confirmationStatus,
           java.lang.String rejectCode,
           java.lang.String rejectReason,
           java.lang.String rejectDesc,
           java.lang.String debitAmount) {
           this.orderId = orderId;
           this.crmOrderId = crmOrderId;
           this.responseType = responseType;
           this.confirmedExecutionDate = confirmedExecutionDate;
           this.confirmationStatus = confirmationStatus;
           this.rejectCode = rejectCode;
           this.rejectReason = rejectReason;
           this.rejectDesc = rejectDesc;
           this.debitAmount = debitAmount;
    }


    /**
     * Gets the orderId value for this PortOutResponse4WholesaleRequestBody.
     * 
     * @return orderId
     */
    public java.lang.String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this PortOutResponse4WholesaleRequestBody.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the crmOrderId value for this PortOutResponse4WholesaleRequestBody.
     * 
     * @return crmOrderId
     */
    public java.lang.String getCrmOrderId() {
        return crmOrderId;
    }


    /**
     * Sets the crmOrderId value for this PortOutResponse4WholesaleRequestBody.
     * 
     * @param crmOrderId
     */
    public void setCrmOrderId(java.lang.String crmOrderId) {
        this.crmOrderId = crmOrderId;
    }


    /**
     * Gets the responseType value for this PortOutResponse4WholesaleRequestBody.
     * 
     * @return responseType
     */
    public java.lang.String getResponseType() {
        return responseType;
    }


    /**
     * Sets the responseType value for this PortOutResponse4WholesaleRequestBody.
     * 
     * @param responseType
     */
    public void setResponseType(java.lang.String responseType) {
        this.responseType = responseType;
    }


    /**
     * Gets the confirmedExecutionDate value for this PortOutResponse4WholesaleRequestBody.
     * 
     * @return confirmedExecutionDate
     */
    public java.lang.String getConfirmedExecutionDate() {
        return confirmedExecutionDate;
    }


    /**
     * Sets the confirmedExecutionDate value for this PortOutResponse4WholesaleRequestBody.
     * 
     * @param confirmedExecutionDate
     */
    public void setConfirmedExecutionDate(java.lang.String confirmedExecutionDate) {
        this.confirmedExecutionDate = confirmedExecutionDate;
    }


    /**
     * Gets the confirmationStatus value for this PortOutResponse4WholesaleRequestBody.
     * 
     * @return confirmationStatus
     */
    public java.lang.String getConfirmationStatus() {
        return confirmationStatus;
    }


    /**
     * Sets the confirmationStatus value for this PortOutResponse4WholesaleRequestBody.
     * 
     * @param confirmationStatus
     */
    public void setConfirmationStatus(java.lang.String confirmationStatus) {
        this.confirmationStatus = confirmationStatus;
    }


    /**
     * Gets the rejectCode value for this PortOutResponse4WholesaleRequestBody.
     * 
     * @return rejectCode
     */
    public java.lang.String getRejectCode() {
        return rejectCode;
    }


    /**
     * Sets the rejectCode value for this PortOutResponse4WholesaleRequestBody.
     * 
     * @param rejectCode
     */
    public void setRejectCode(java.lang.String rejectCode) {
        this.rejectCode = rejectCode;
    }


    /**
     * Gets the rejectReason value for this PortOutResponse4WholesaleRequestBody.
     * 
     * @return rejectReason
     */
    public String getRejectReason() {
        return rejectReason;
    }


    /**
     * Sets the rejectReason value for this PortOutResponse4WholesaleRequestBody.
     * 
     * @param rejectReason
     */
    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }


    /**
     * Gets the rejectDesc value for this PortOutResponse4WholesaleRequestBody.
     * 
     * @return rejectDesc
     */
    public java.lang.String getRejectDesc() {
        return rejectDesc;
    }


    /**
     * Sets the rejectDesc value for this PortOutResponse4WholesaleRequestBody.
     * 
     * @param rejectDesc
     */
    public void setRejectDesc(String rejectDesc) {
        this.rejectDesc = rejectDesc;
    }


    /**
     * Gets the debitAmount value for this PortOutResponse4WholesaleRequestBody.
     * 
     * @return debitAmount
     */
    public String getDebitAmount() {
        return debitAmount;
    }


    /**
     * Sets the debitAmount value for this PortOutResponse4WholesaleRequestBody.
     * 
     * @param debitAmount
     */
    public void setDebitAmount(String debitAmount) {
        this.debitAmount = debitAmount;
    }

    // Type metadata
    private static TypeDesc typeDesc =
        new TypeDesc(PortOutResponse4WholesaleRequestBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/soa", "portOutResponse4WholesaleRequestBody"));
        ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new QName("", "OrderId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crmOrderId");
        elemField.setXmlName(new QName("", "CrmOrderId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("responseType");
        elemField.setXmlName(new QName("", "ResponseType"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirmedExecutionDate");
        elemField.setXmlName(new QName("", "ConfirmedExecutionDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirmationStatus");
        elemField.setXmlName(new QName("", "ConfirmationStatus"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rejectCode");
        elemField.setXmlName(new QName("", "RejectCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rejectReason");
        elemField.setXmlName(new QName("", "RejectReason"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rejectDesc");
        elemField.setXmlName(new QName("", "RejectDesc"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("debitAmount");
        elemField.setXmlName(new QName("", "DebitAmount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static Serializer getSerializer(
           String mechType, 
           Class javaType,  
           QName xmlType) {
        return 
          new  BeanSerializer(
            javaType, xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static Deserializer getDeserializer(
           String mechType, 
           Class javaType,  
           QName xmlType) {
        return 
          new  BeanDeserializer(
            javaType, xmlType, typeDesc);
    }

}
