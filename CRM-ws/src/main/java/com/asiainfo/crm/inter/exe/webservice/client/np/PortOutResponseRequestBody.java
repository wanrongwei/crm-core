/**
 * PortOutResponseRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.np;

import java.io.Serializable;

import javax.xml.namespace.QName;

import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class PortOutResponseRequestBody  implements Serializable {
    private String orderId;

    private String responseType;

    private String confirmedExecutionDate;

    private String confirmationStatus;

    private String rejectCode;

    private String rejectReason;

    private String rejectDesc;

    private String debitAmount;

    public PortOutResponseRequestBody() {
    }

    /**
     * Gets the orderId value for this PortOutResponseRequestBody.
     * 
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this PortOutResponseRequestBody.
     * 
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the responseType value for this PortOutResponseRequestBody.
     * 
     * @return responseType
     */
    public String getResponseType() {
        return responseType;
    }


    /**
     * Sets the responseType value for this PortOutResponseRequestBody.
     * 
     * @param responseType
     */
    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }


    /**
     * Gets the confirmedExecutionDate value for this PortOutResponseRequestBody.
     * 
     * @return confirmedExecutionDate
     */
    public String getConfirmedExecutionDate() {
        return confirmedExecutionDate;
    }


    /**
     * Sets the confirmedExecutionDate value for this PortOutResponseRequestBody.
     * 
     * @param confirmedExecutionDate
     */
    public void setConfirmedExecutionDate(String confirmedExecutionDate) {
        this.confirmedExecutionDate = confirmedExecutionDate;
    }


    /**
     * Gets the confirmationStatus value for this PortOutResponseRequestBody.
     * 
     * @return confirmationStatus
     */
    public String getConfirmationStatus() {
        return confirmationStatus;
    }


    /**
     * Sets the confirmationStatus value for this PortOutResponseRequestBody.
     * 
     * @param confirmationStatus
     */
    public void setConfirmationStatus(String confirmationStatus) {
        this.confirmationStatus = confirmationStatus;
    }


    /**
     * Gets the rejectCode value for this PortOutResponseRequestBody.
     * 
     * @return rejectCode
     */
    public String getRejectCode() {
        return rejectCode;
    }


    /**
     * Sets the rejectCode value for this PortOutResponseRequestBody.
     * 
     * @param rejectCode
     */
    public void setRejectCode(String rejectCode) {
        this.rejectCode = rejectCode;
    }


    /**
     * Gets the rejectReason value for this PortOutResponseRequestBody.
     * 
     * @return rejectReason
     */
    public String getRejectReason() {
        return rejectReason;
    }


    /**
     * Sets the rejectReason value for this PortOutResponseRequestBody.
     * 
     * @param rejectReason
     */
    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }


    /**
     * Gets the rejectDesc value for this PortOutResponseRequestBody.
     * 
     * @return rejectDesc
     */
    public String getRejectDesc() {
        return rejectDesc;
    }


    /**
     * Sets the rejectDesc value for this PortOutResponseRequestBody.
     * 
     * @param rejectDesc
     */
    public void setRejectDesc(String rejectDesc) {
        this.rejectDesc = rejectDesc;
    }


    /**
     * Gets the debitAmount value for this PortOutResponseRequestBody.
     * 
     * @return debitAmount
     */
    public String getDebitAmount() {
        return debitAmount;
    }


    /**
     * Sets the debitAmount value for this PortOutResponseRequestBody.
     * 
     * @param debitAmount
     */
    public void setDebitAmount(String debitAmount) {
        this.debitAmount = debitAmount;
    }

    // Type metadata
    private static TypeDesc typeDesc =
        new TypeDesc(PortOutResponseRequestBody.class, true);

    static {
        typeDesc.setXmlType(new QName("http://soa.ailk.telenor.com/wsdl/soa", "portOutResponseRequestBody"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new QName("", "OrderId"));
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
        elemField = new ElementDesc();
        elemField.setFieldName("confirmedExecutionDate");
        elemField.setXmlName(new QName("", "ConfirmedExecutionDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("confirmationStatus");
        elemField.setXmlName(new QName("", "ConfirmationStatus"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rejectCode");
        elemField.setXmlName(new QName("", "RejectCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
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
