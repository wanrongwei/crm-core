/**
 * Plan.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class Plan  implements java.io.Serializable {
    private java.lang.Integer instalmentSeq;

    private java.lang.Boolean isBilled;

    private java.util.Calendar dueDate;

    private java.lang.Boolean isPaid;

    private java.lang.Long ppyFee;

    private java.lang.Long amount;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    public Plan() {
    }

    public Plan(
           java.lang.Integer instalmentSeq,
           java.lang.Boolean isBilled,
           java.util.Calendar dueDate,
           java.lang.Boolean isPaid,
           java.lang.Long ppyFee,
           java.lang.Long amount,
           java.util.Calendar startDate,
           java.util.Calendar endDate) {
           this.instalmentSeq = instalmentSeq;
           this.isBilled = isBilled;
           this.dueDate = dueDate;
           this.isPaid = isPaid;
           this.ppyFee = ppyFee;
           this.amount = amount;
           this.startDate = startDate;
           this.endDate = endDate;
    }


    /**
     * Gets the instalmentSeq value for this Plan.
     * 
     * @return instalmentSeq
     */
    public java.lang.Integer getInstalmentSeq() {
        return instalmentSeq;
    }


    /**
     * Sets the instalmentSeq value for this Plan.
     * 
     * @param instalmentSeq
     */
    public void setInstalmentSeq(java.lang.Integer instalmentSeq) {
        this.instalmentSeq = instalmentSeq;
    }


    /**
     * Gets the isBilled value for this Plan.
     * 
     * @return isBilled
     */
    public java.lang.Boolean getIsBilled() {
        return isBilled;
    }


    /**
     * Sets the isBilled value for this Plan.
     * 
     * @param isBilled
     */
    public void setIsBilled(java.lang.Boolean isBilled) {
        this.isBilled = isBilled;
    }


    /**
     * Gets the dueDate value for this Plan.
     * 
     * @return dueDate
     */
    public java.util.Calendar getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this Plan.
     * 
     * @param dueDate
     */
    public void setDueDate(java.util.Calendar dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Gets the isPaid value for this Plan.
     * 
     * @return isPaid
     */
    public java.lang.Boolean getIsPaid() {
        return isPaid;
    }


    /**
     * Sets the isPaid value for this Plan.
     * 
     * @param isPaid
     */
    public void setIsPaid(java.lang.Boolean isPaid) {
        this.isPaid = isPaid;
    }


    /**
     * Gets the ppyFee value for this Plan.
     * 
     * @return ppyFee
     */
    public java.lang.Long getPpyFee() {
        return ppyFee;
    }


    /**
     * Sets the ppyFee value for this Plan.
     * 
     * @param ppyFee
     */
    public void setPpyFee(java.lang.Long ppyFee) {
        this.ppyFee = ppyFee;
    }


    /**
     * Gets the amount value for this Plan.
     * 
     * @return amount
     */
    public java.lang.Long getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this Plan.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Long amount) {
        this.amount = amount;
    }


    /**
     * Gets the startDate value for this Plan.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this Plan.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this Plan.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this Plan.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Plan)) return false;
        Plan other = (Plan) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.instalmentSeq==null && other.getInstalmentSeq()==null) || 
             (this.instalmentSeq!=null &&
              this.instalmentSeq.equals(other.getInstalmentSeq()))) &&
            ((this.isBilled==null && other.getIsBilled()==null) || 
             (this.isBilled!=null &&
              this.isBilled.equals(other.getIsBilled()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate()))) &&
            ((this.isPaid==null && other.getIsPaid()==null) || 
             (this.isPaid!=null &&
              this.isPaid.equals(other.getIsPaid()))) &&
            ((this.ppyFee==null && other.getPpyFee()==null) || 
             (this.ppyFee!=null &&
              this.ppyFee.equals(other.getPpyFee()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate())));
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
        if (getInstalmentSeq() != null) {
            _hashCode += getInstalmentSeq().hashCode();
        }
        if (getIsBilled() != null) {
            _hashCode += getIsBilled().hashCode();
        }
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        if (getIsPaid() != null) {
            _hashCode += getIsPaid().hashCode();
        }
        if (getPpyFee() != null) {
            _hashCode += getPpyFee().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Plan.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "plan"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instalmentSeq");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instalmentSeq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isBilled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isBilled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPaid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isPaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ppyFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ppyFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endDate"));
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
