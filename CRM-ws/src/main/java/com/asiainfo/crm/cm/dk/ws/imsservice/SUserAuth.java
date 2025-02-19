/**
 * SUserAuth.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public class SUserAuth  implements java.io.Serializable {
    private java.lang.Long userId;

    private java.lang.String phoneId;

    private java.lang.Short hPLMN;

    private java.lang.Short nationalRoaming;

    private java.lang.Short internationalRoaming;

    private java.lang.Short roamingAuthority;

    private java.lang.Short iRSMSAuthority;

    private java.lang.Short interIntraAuthority;

    private java.lang.Short interIntraflag;

    private java.lang.Short iRPromptflag;

    private java.lang.Short fraudState;

    private java.lang.Short fraudTimes;

    public SUserAuth() {
    }

    public SUserAuth(
           java.lang.Long userId,
           java.lang.String phoneId,
           java.lang.Short hPLMN,
           java.lang.Short nationalRoaming,
           java.lang.Short internationalRoaming,
           java.lang.Short roamingAuthority,
           java.lang.Short iRSMSAuthority,
           java.lang.Short interIntraAuthority,
           java.lang.Short interIntraflag,
           java.lang.Short iRPromptflag,
           java.lang.Short fraudState,
           java.lang.Short fraudTimes) {
           this.userId = userId;
           this.phoneId = phoneId;
           this.hPLMN = hPLMN;
           this.nationalRoaming = nationalRoaming;
           this.internationalRoaming = internationalRoaming;
           this.roamingAuthority = roamingAuthority;
           this.iRSMSAuthority = iRSMSAuthority;
           this.interIntraAuthority = interIntraAuthority;
           this.interIntraflag = interIntraflag;
           this.iRPromptflag = iRPromptflag;
           this.fraudState = fraudState;
           this.fraudTimes = fraudTimes;
    }


    /**
     * Gets the userId value for this SUserAuth.
     * 
     * @return userId
     */
    public java.lang.Long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this SUserAuth.
     * 
     * @param userId
     */
    public void setUserId(java.lang.Long userId) {
        this.userId = userId;
    }


    /**
     * Gets the phoneId value for this SUserAuth.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this SUserAuth.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the hPLMN value for this SUserAuth.
     * 
     * @return hPLMN
     */
    public java.lang.Short getHPLMN() {
        return hPLMN;
    }


    /**
     * Sets the hPLMN value for this SUserAuth.
     * 
     * @param hPLMN
     */
    public void setHPLMN(java.lang.Short hPLMN) {
        this.hPLMN = hPLMN;
    }


    /**
     * Gets the nationalRoaming value for this SUserAuth.
     * 
     * @return nationalRoaming
     */
    public java.lang.Short getNationalRoaming() {
        return nationalRoaming;
    }


    /**
     * Sets the nationalRoaming value for this SUserAuth.
     * 
     * @param nationalRoaming
     */
    public void setNationalRoaming(java.lang.Short nationalRoaming) {
        this.nationalRoaming = nationalRoaming;
    }


    /**
     * Gets the internationalRoaming value for this SUserAuth.
     * 
     * @return internationalRoaming
     */
    public java.lang.Short getInternationalRoaming() {
        return internationalRoaming;
    }


    /**
     * Sets the internationalRoaming value for this SUserAuth.
     * 
     * @param internationalRoaming
     */
    public void setInternationalRoaming(java.lang.Short internationalRoaming) {
        this.internationalRoaming = internationalRoaming;
    }


    /**
     * Gets the roamingAuthority value for this SUserAuth.
     * 
     * @return roamingAuthority
     */
    public java.lang.Short getRoamingAuthority() {
        return roamingAuthority;
    }


    /**
     * Sets the roamingAuthority value for this SUserAuth.
     * 
     * @param roamingAuthority
     */
    public void setRoamingAuthority(java.lang.Short roamingAuthority) {
        this.roamingAuthority = roamingAuthority;
    }


    /**
     * Gets the iRSMSAuthority value for this SUserAuth.
     * 
     * @return iRSMSAuthority
     */
    public java.lang.Short getIRSMSAuthority() {
        return iRSMSAuthority;
    }


    /**
     * Sets the iRSMSAuthority value for this SUserAuth.
     * 
     * @param iRSMSAuthority
     */
    public void setIRSMSAuthority(java.lang.Short iRSMSAuthority) {
        this.iRSMSAuthority = iRSMSAuthority;
    }


    /**
     * Gets the interIntraAuthority value for this SUserAuth.
     * 
     * @return interIntraAuthority
     */
    public java.lang.Short getInterIntraAuthority() {
        return interIntraAuthority;
    }


    /**
     * Sets the interIntraAuthority value for this SUserAuth.
     * 
     * @param interIntraAuthority
     */
    public void setInterIntraAuthority(java.lang.Short interIntraAuthority) {
        this.interIntraAuthority = interIntraAuthority;
    }


    /**
     * Gets the interIntraflag value for this SUserAuth.
     * 
     * @return interIntraflag
     */
    public java.lang.Short getInterIntraflag() {
        return interIntraflag;
    }


    /**
     * Sets the interIntraflag value for this SUserAuth.
     * 
     * @param interIntraflag
     */
    public void setInterIntraflag(java.lang.Short interIntraflag) {
        this.interIntraflag = interIntraflag;
    }


    /**
     * Gets the iRPromptflag value for this SUserAuth.
     * 
     * @return iRPromptflag
     */
    public java.lang.Short getIRPromptflag() {
        return iRPromptflag;
    }


    /**
     * Sets the iRPromptflag value for this SUserAuth.
     * 
     * @param iRPromptflag
     */
    public void setIRPromptflag(java.lang.Short iRPromptflag) {
        this.iRPromptflag = iRPromptflag;
    }


    /**
     * Gets the fraudState value for this SUserAuth.
     * 
     * @return fraudState
     */
    public java.lang.Short getFraudState() {
        return fraudState;
    }


    /**
     * Sets the fraudState value for this SUserAuth.
     * 
     * @param fraudState
     */
    public void setFraudState(java.lang.Short fraudState) {
        this.fraudState = fraudState;
    }


    /**
     * Gets the fraudTimes value for this SUserAuth.
     * 
     * @return fraudTimes
     */
    public java.lang.Short getFraudTimes() {
        return fraudTimes;
    }


    /**
     * Sets the fraudTimes value for this SUserAuth.
     * 
     * @param fraudTimes
     */
    public void setFraudTimes(java.lang.Short fraudTimes) {
        this.fraudTimes = fraudTimes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SUserAuth)) return false;
        SUserAuth other = (SUserAuth) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.phoneId==null && other.getPhoneId()==null) || 
             (this.phoneId!=null &&
              this.phoneId.equals(other.getPhoneId()))) &&
            ((this.hPLMN==null && other.getHPLMN()==null) || 
             (this.hPLMN!=null &&
              this.hPLMN.equals(other.getHPLMN()))) &&
            ((this.nationalRoaming==null && other.getNationalRoaming()==null) || 
             (this.nationalRoaming!=null &&
              this.nationalRoaming.equals(other.getNationalRoaming()))) &&
            ((this.internationalRoaming==null && other.getInternationalRoaming()==null) || 
             (this.internationalRoaming!=null &&
              this.internationalRoaming.equals(other.getInternationalRoaming()))) &&
            ((this.roamingAuthority==null && other.getRoamingAuthority()==null) || 
             (this.roamingAuthority!=null &&
              this.roamingAuthority.equals(other.getRoamingAuthority()))) &&
            ((this.iRSMSAuthority==null && other.getIRSMSAuthority()==null) || 
             (this.iRSMSAuthority!=null &&
              this.iRSMSAuthority.equals(other.getIRSMSAuthority()))) &&
            ((this.interIntraAuthority==null && other.getInterIntraAuthority()==null) || 
             (this.interIntraAuthority!=null &&
              this.interIntraAuthority.equals(other.getInterIntraAuthority()))) &&
            ((this.interIntraflag==null && other.getInterIntraflag()==null) || 
             (this.interIntraflag!=null &&
              this.interIntraflag.equals(other.getInterIntraflag()))) &&
            ((this.iRPromptflag==null && other.getIRPromptflag()==null) || 
             (this.iRPromptflag!=null &&
              this.iRPromptflag.equals(other.getIRPromptflag()))) &&
            ((this.fraudState==null && other.getFraudState()==null) || 
             (this.fraudState!=null &&
              this.fraudState.equals(other.getFraudState()))) &&
            ((this.fraudTimes==null && other.getFraudTimes()==null) || 
             (this.fraudTimes!=null &&
              this.fraudTimes.equals(other.getFraudTimes())));
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
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getPhoneId() != null) {
            _hashCode += getPhoneId().hashCode();
        }
        if (getHPLMN() != null) {
            _hashCode += getHPLMN().hashCode();
        }
        if (getNationalRoaming() != null) {
            _hashCode += getNationalRoaming().hashCode();
        }
        if (getInternationalRoaming() != null) {
            _hashCode += getInternationalRoaming().hashCode();
        }
        if (getRoamingAuthority() != null) {
            _hashCode += getRoamingAuthority().hashCode();
        }
        if (getIRSMSAuthority() != null) {
            _hashCode += getIRSMSAuthority().hashCode();
        }
        if (getInterIntraAuthority() != null) {
            _hashCode += getInterIntraAuthority().hashCode();
        }
        if (getInterIntraflag() != null) {
            _hashCode += getInterIntraflag().hashCode();
        }
        if (getIRPromptflag() != null) {
            _hashCode += getIRPromptflag().hashCode();
        }
        if (getFraudState() != null) {
            _hashCode += getFraudState().hashCode();
        }
        if (getFraudTimes() != null) {
            _hashCode += getFraudTimes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SUserAuth.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUserAuth"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HPLMN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hPLMN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationalRoaming");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nationalRoaming"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internationalRoaming");
        elemField.setXmlName(new javax.xml.namespace.QName("", "internationalRoaming"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roamingAuthority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "roamingAuthority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IRSMSAuthority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iRSMSAuthority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interIntraAuthority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interIntraAuthority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interIntraflag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interIntraflag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IRPromptflag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iRPromptflag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fraudState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fraudState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fraudTimes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fraudTimes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
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
