/**
 * RemoveProfileRequestBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.smdp;

public class RemoveProfileRequestBody  implements java.io.Serializable {
    private java.lang.String[] iccidList;

    private java.lang.String eid;

    private java.lang.String profileType;

    private java.lang.String profileVersion;

    private java.lang.String profileClass;

    private java.lang.Long number;

    public RemoveProfileRequestBody() {
    }

    public RemoveProfileRequestBody(
           java.lang.String[] iccidList,
           java.lang.String eid,
           java.lang.String profileType,
           java.lang.String profileVersion,
           java.lang.String profileClass,
           java.lang.Long number) {
           this.iccidList = iccidList;
           this.eid = eid;
           this.profileType = profileType;
           this.profileVersion = profileVersion;
           this.profileClass = profileClass;
           this.number = number;
    }


    /**
     * Gets the iccidList value for this RemoveProfileRequestBody.
     * 
     * @return iccidList
     */
    public java.lang.String[] getIccidList() {
        return iccidList;
    }


    /**
     * Sets the iccidList value for this RemoveProfileRequestBody.
     * 
     * @param iccidList
     */
    public void setIccidList(java.lang.String[] iccidList) {
        this.iccidList = iccidList;
    }


    /**
     * Gets the eid value for this RemoveProfileRequestBody.
     * 
     * @return eid
     */
    public java.lang.String getEid() {
        return eid;
    }


    /**
     * Sets the eid value for this RemoveProfileRequestBody.
     * 
     * @param eid
     */
    public void setEid(java.lang.String eid) {
        this.eid = eid;
    }


    /**
     * Gets the profileType value for this RemoveProfileRequestBody.
     * 
     * @return profileType
     */
    public java.lang.String getProfileType() {
        return profileType;
    }


    /**
     * Sets the profileType value for this RemoveProfileRequestBody.
     * 
     * @param profileType
     */
    public void setProfileType(java.lang.String profileType) {
        this.profileType = profileType;
    }


    /**
     * Gets the profileVersion value for this RemoveProfileRequestBody.
     * 
     * @return profileVersion
     */
    public java.lang.String getProfileVersion() {
        return profileVersion;
    }


    /**
     * Sets the profileVersion value for this RemoveProfileRequestBody.
     * 
     * @param profileVersion
     */
    public void setProfileVersion(java.lang.String profileVersion) {
        this.profileVersion = profileVersion;
    }


    /**
     * Gets the profileClass value for this RemoveProfileRequestBody.
     * 
     * @return profileClass
     */
    public java.lang.String getProfileClass() {
        return profileClass;
    }


    /**
     * Sets the profileClass value for this RemoveProfileRequestBody.
     * 
     * @param profileClass
     */
    public void setProfileClass(java.lang.String profileClass) {
        this.profileClass = profileClass;
    }


    /**
     * Gets the number value for this RemoveProfileRequestBody.
     * 
     * @return number
     */
    public java.lang.Long getNumber() {
        return number;
    }


    /**
     * Sets the number value for this RemoveProfileRequestBody.
     * 
     * @param number
     */
    public void setNumber(java.lang.Long number) {
        this.number = number;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoveProfileRequestBody)) return false;
        RemoveProfileRequestBody other = (RemoveProfileRequestBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.iccidList==null && other.getIccidList()==null) || 
             (this.iccidList!=null &&
              java.util.Arrays.equals(this.iccidList, other.getIccidList()))) &&
            ((this.eid==null && other.getEid()==null) || 
             (this.eid!=null &&
              this.eid.equals(other.getEid()))) &&
            ((this.profileType==null && other.getProfileType()==null) || 
             (this.profileType!=null &&
              this.profileType.equals(other.getProfileType()))) &&
            ((this.profileVersion==null && other.getProfileVersion()==null) || 
             (this.profileVersion!=null &&
              this.profileVersion.equals(other.getProfileVersion()))) &&
            ((this.profileClass==null && other.getProfileClass()==null) || 
             (this.profileClass!=null &&
              this.profileClass.equals(other.getProfileClass()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber())));
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
        if (getIccidList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIccidList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIccidList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEid() != null) {
            _hashCode += getEid().hashCode();
        }
        if (getProfileType() != null) {
            _hashCode += getProfileType().hashCode();
        }
        if (getProfileVersion() != null) {
            _hashCode += getProfileVersion().hashCode();
        }
        if (getProfileClass() != null) {
            _hashCode += getProfileClass().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoveProfileRequestBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/wsdl/busi", "removeProfileRequestBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iccidList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iccidList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "iccid"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "profileType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "profileVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileClass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "profileClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
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
