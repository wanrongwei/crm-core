/**
 * SManagerIRPartyReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class SManagerIRPartyReq  implements java.io.Serializable {
    private java.lang.Short oper_type;

    private java.lang.String operator_code;

    private java.lang.Short operator_type;

    private java.lang.Integer operator_id;

    private java.lang.String mcc_code;

    private java.lang.String mnc_code;

    private java.lang.String english_name;

    private java.lang.String invoicingCoID;

    private java.lang.Short country_code;

    private java.lang.String country_name;

    private java.lang.Short tap_version;

    private java.lang.String tap_release;

    private java.lang.Integer currency_code;

    private java.lang.String network_statement;

    private java.lang.Integer roam_type;

    private com.asiainfo.crm.cm.dk.ws.imsservice.ServiceRequestOper serviceRequestOper;

    public SManagerIRPartyReq() {
    }

    public SManagerIRPartyReq(
           java.lang.Short oper_type,
           java.lang.String operator_code,
           java.lang.Short operator_type,
           java.lang.Integer operator_id,
           java.lang.String mcc_code,
           java.lang.String mnc_code,
           java.lang.String english_name,
           java.lang.String invoicingCoID,
           java.lang.Short country_code,
           java.lang.String country_name,
           java.lang.Short tap_version,
           java.lang.String tap_release,
           java.lang.Integer currency_code,
           java.lang.String network_statement,
           java.lang.Integer roam_type,
           com.asiainfo.crm.cm.dk.ws.imsservice.ServiceRequestOper serviceRequestOper) {
           this.oper_type = oper_type;
           this.operator_code = operator_code;
           this.operator_type = operator_type;
           this.operator_id = operator_id;
           this.mcc_code = mcc_code;
           this.mnc_code = mnc_code;
           this.english_name = english_name;
           this.invoicingCoID = invoicingCoID;
           this.country_code = country_code;
           this.country_name = country_name;
           this.tap_version = tap_version;
           this.tap_release = tap_release;
           this.currency_code = currency_code;
           this.network_statement = network_statement;
           this.roam_type = roam_type;
           this.serviceRequestOper = serviceRequestOper;
    }


    /**
     * Gets the oper_type value for this SManagerIRPartyReq.
     * 
     * @return oper_type
     */
    public java.lang.Short getOper_type() {
        return oper_type;
    }


    /**
     * Sets the oper_type value for this SManagerIRPartyReq.
     * 
     * @param oper_type
     */
    public void setOper_type(java.lang.Short oper_type) {
        this.oper_type = oper_type;
    }


    /**
     * Gets the operator_code value for this SManagerIRPartyReq.
     * 
     * @return operator_code
     */
    public java.lang.String getOperator_code() {
        return operator_code;
    }


    /**
     * Sets the operator_code value for this SManagerIRPartyReq.
     * 
     * @param operator_code
     */
    public void setOperator_code(java.lang.String operator_code) {
        this.operator_code = operator_code;
    }


    /**
     * Gets the operator_type value for this SManagerIRPartyReq.
     * 
     * @return operator_type
     */
    public java.lang.Short getOperator_type() {
        return operator_type;
    }


    /**
     * Sets the operator_type value for this SManagerIRPartyReq.
     * 
     * @param operator_type
     */
    public void setOperator_type(java.lang.Short operator_type) {
        this.operator_type = operator_type;
    }


    /**
     * Gets the operator_id value for this SManagerIRPartyReq.
     * 
     * @return operator_id
     */
    public java.lang.Integer getOperator_id() {
        return operator_id;
    }


    /**
     * Sets the operator_id value for this SManagerIRPartyReq.
     * 
     * @param operator_id
     */
    public void setOperator_id(java.lang.Integer operator_id) {
        this.operator_id = operator_id;
    }


    /**
     * Gets the mcc_code value for this SManagerIRPartyReq.
     * 
     * @return mcc_code
     */
    public java.lang.String getMcc_code() {
        return mcc_code;
    }


    /**
     * Sets the mcc_code value for this SManagerIRPartyReq.
     * 
     * @param mcc_code
     */
    public void setMcc_code(java.lang.String mcc_code) {
        this.mcc_code = mcc_code;
    }


    /**
     * Gets the mnc_code value for this SManagerIRPartyReq.
     * 
     * @return mnc_code
     */
    public java.lang.String getMnc_code() {
        return mnc_code;
    }


    /**
     * Sets the mnc_code value for this SManagerIRPartyReq.
     * 
     * @param mnc_code
     */
    public void setMnc_code(java.lang.String mnc_code) {
        this.mnc_code = mnc_code;
    }


    /**
     * Gets the english_name value for this SManagerIRPartyReq.
     * 
     * @return english_name
     */
    public java.lang.String getEnglish_name() {
        return english_name;
    }


    /**
     * Sets the english_name value for this SManagerIRPartyReq.
     * 
     * @param english_name
     */
    public void setEnglish_name(java.lang.String english_name) {
        this.english_name = english_name;
    }


    /**
     * Gets the invoicingCoID value for this SManagerIRPartyReq.
     * 
     * @return invoicingCoID
     */
    public java.lang.String getInvoicingCoID() {
        return invoicingCoID;
    }


    /**
     * Sets the invoicingCoID value for this SManagerIRPartyReq.
     * 
     * @param invoicingCoID
     */
    public void setInvoicingCoID(java.lang.String invoicingCoID) {
        this.invoicingCoID = invoicingCoID;
    }


    /**
     * Gets the country_code value for this SManagerIRPartyReq.
     * 
     * @return country_code
     */
    public java.lang.Short getCountry_code() {
        return country_code;
    }


    /**
     * Sets the country_code value for this SManagerIRPartyReq.
     * 
     * @param country_code
     */
    public void setCountry_code(java.lang.Short country_code) {
        this.country_code = country_code;
    }


    /**
     * Gets the country_name value for this SManagerIRPartyReq.
     * 
     * @return country_name
     */
    public java.lang.String getCountry_name() {
        return country_name;
    }


    /**
     * Sets the country_name value for this SManagerIRPartyReq.
     * 
     * @param country_name
     */
    public void setCountry_name(java.lang.String country_name) {
        this.country_name = country_name;
    }


    /**
     * Gets the tap_version value for this SManagerIRPartyReq.
     * 
     * @return tap_version
     */
    public java.lang.Short getTap_version() {
        return tap_version;
    }


    /**
     * Sets the tap_version value for this SManagerIRPartyReq.
     * 
     * @param tap_version
     */
    public void setTap_version(java.lang.Short tap_version) {
        this.tap_version = tap_version;
    }


    /**
     * Gets the tap_release value for this SManagerIRPartyReq.
     * 
     * @return tap_release
     */
    public java.lang.String getTap_release() {
        return tap_release;
    }


    /**
     * Sets the tap_release value for this SManagerIRPartyReq.
     * 
     * @param tap_release
     */
    public void setTap_release(java.lang.String tap_release) {
        this.tap_release = tap_release;
    }


    /**
     * Gets the currency_code value for this SManagerIRPartyReq.
     * 
     * @return currency_code
     */
    public java.lang.Integer getCurrency_code() {
        return currency_code;
    }


    /**
     * Sets the currency_code value for this SManagerIRPartyReq.
     * 
     * @param currency_code
     */
    public void setCurrency_code(java.lang.Integer currency_code) {
        this.currency_code = currency_code;
    }


    /**
     * Gets the network_statement value for this SManagerIRPartyReq.
     * 
     * @return network_statement
     */
    public java.lang.String getNetwork_statement() {
        return network_statement;
    }


    /**
     * Sets the network_statement value for this SManagerIRPartyReq.
     * 
     * @param network_statement
     */
    public void setNetwork_statement(java.lang.String network_statement) {
        this.network_statement = network_statement;
    }


    /**
     * Gets the roam_type value for this SManagerIRPartyReq.
     * 
     * @return roam_type
     */
    public java.lang.Integer getRoam_type() {
        return roam_type;
    }


    /**
     * Sets the roam_type value for this SManagerIRPartyReq.
     * 
     * @param roam_type
     */
    public void setRoam_type(java.lang.Integer roam_type) {
        this.roam_type = roam_type;
    }


    /**
     * Gets the serviceRequestOper value for this SManagerIRPartyReq.
     * 
     * @return serviceRequestOper
     */
    public com.asiainfo.crm.cm.dk.ws.imsservice.ServiceRequestOper getServiceRequestOper() {
        return serviceRequestOper;
    }


    /**
     * Sets the serviceRequestOper value for this SManagerIRPartyReq.
     * 
     * @param serviceRequestOper
     */
    public void setServiceRequestOper(com.asiainfo.crm.cm.dk.ws.imsservice.ServiceRequestOper serviceRequestOper) {
        this.serviceRequestOper = serviceRequestOper;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SManagerIRPartyReq)) return false;
        SManagerIRPartyReq other = (SManagerIRPartyReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.oper_type==null && other.getOper_type()==null) || 
             (this.oper_type!=null &&
              this.oper_type.equals(other.getOper_type()))) &&
            ((this.operator_code==null && other.getOperator_code()==null) || 
             (this.operator_code!=null &&
              this.operator_code.equals(other.getOperator_code()))) &&
            ((this.operator_type==null && other.getOperator_type()==null) || 
             (this.operator_type!=null &&
              this.operator_type.equals(other.getOperator_type()))) &&
            ((this.operator_id==null && other.getOperator_id()==null) || 
             (this.operator_id!=null &&
              this.operator_id.equals(other.getOperator_id()))) &&
            ((this.mcc_code==null && other.getMcc_code()==null) || 
             (this.mcc_code!=null &&
              this.mcc_code.equals(other.getMcc_code()))) &&
            ((this.mnc_code==null && other.getMnc_code()==null) || 
             (this.mnc_code!=null &&
              this.mnc_code.equals(other.getMnc_code()))) &&
            ((this.english_name==null && other.getEnglish_name()==null) || 
             (this.english_name!=null &&
              this.english_name.equals(other.getEnglish_name()))) &&
            ((this.invoicingCoID==null && other.getInvoicingCoID()==null) || 
             (this.invoicingCoID!=null &&
              this.invoicingCoID.equals(other.getInvoicingCoID()))) &&
            ((this.country_code==null && other.getCountry_code()==null) || 
             (this.country_code!=null &&
              this.country_code.equals(other.getCountry_code()))) &&
            ((this.country_name==null && other.getCountry_name()==null) || 
             (this.country_name!=null &&
              this.country_name.equals(other.getCountry_name()))) &&
            ((this.tap_version==null && other.getTap_version()==null) || 
             (this.tap_version!=null &&
              this.tap_version.equals(other.getTap_version()))) &&
            ((this.tap_release==null && other.getTap_release()==null) || 
             (this.tap_release!=null &&
              this.tap_release.equals(other.getTap_release()))) &&
            ((this.currency_code==null && other.getCurrency_code()==null) || 
             (this.currency_code!=null &&
              this.currency_code.equals(other.getCurrency_code()))) &&
            ((this.network_statement==null && other.getNetwork_statement()==null) || 
             (this.network_statement!=null &&
              this.network_statement.equals(other.getNetwork_statement()))) &&
            ((this.roam_type==null && other.getRoam_type()==null) || 
             (this.roam_type!=null &&
              this.roam_type.equals(other.getRoam_type()))) &&
            ((this.serviceRequestOper==null && other.getServiceRequestOper()==null) || 
             (this.serviceRequestOper!=null &&
              this.serviceRequestOper.equals(other.getServiceRequestOper())));
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
        if (getOper_type() != null) {
            _hashCode += getOper_type().hashCode();
        }
        if (getOperator_code() != null) {
            _hashCode += getOperator_code().hashCode();
        }
        if (getOperator_type() != null) {
            _hashCode += getOperator_type().hashCode();
        }
        if (getOperator_id() != null) {
            _hashCode += getOperator_id().hashCode();
        }
        if (getMcc_code() != null) {
            _hashCode += getMcc_code().hashCode();
        }
        if (getMnc_code() != null) {
            _hashCode += getMnc_code().hashCode();
        }
        if (getEnglish_name() != null) {
            _hashCode += getEnglish_name().hashCode();
        }
        if (getInvoicingCoID() != null) {
            _hashCode += getInvoicingCoID().hashCode();
        }
        if (getCountry_code() != null) {
            _hashCode += getCountry_code().hashCode();
        }
        if (getCountry_name() != null) {
            _hashCode += getCountry_name().hashCode();
        }
        if (getTap_version() != null) {
            _hashCode += getTap_version().hashCode();
        }
        if (getTap_release() != null) {
            _hashCode += getTap_release().hashCode();
        }
        if (getCurrency_code() != null) {
            _hashCode += getCurrency_code().hashCode();
        }
        if (getNetwork_statement() != null) {
            _hashCode += getNetwork_statement().hashCode();
        }
        if (getRoam_type() != null) {
            _hashCode += getRoam_type().hashCode();
        }
        if (getServiceRequestOper() != null) {
            _hashCode += getServiceRequestOper().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SManagerIRPartyReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sManagerIRPartyReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oper_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oper_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operator_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operator_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operator_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mcc_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mcc_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mnc_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mnc_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("english_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "english_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoicingCoID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoicingCoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tap_version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tap_version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tap_release");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tap_release"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("network_statement");
        elemField.setXmlName(new javax.xml.namespace.QName("", "network_statement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roam_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "roam_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceRequestOper");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceRequestOper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "serviceRequestOper"));
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
