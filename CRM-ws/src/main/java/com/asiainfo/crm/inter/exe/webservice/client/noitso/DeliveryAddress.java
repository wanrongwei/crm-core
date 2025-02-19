/**
 * DeliveryAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.noitso;

public class DeliveryAddress  implements java.io.Serializable {
    private java.lang.String storeName;

    private java.lang.Integer districtId;

    private java.lang.String zip;

    private java.lang.String city;

    private java.lang.String county;

    private java.lang.String country;

    private java.lang.String streetName;

    private java.lang.Integer houseNumber;

    private java.lang.String houseLetter;

    private java.lang.String floor;

    private java.lang.String sideDoor;

    private java.lang.String municipality;

    public DeliveryAddress() {
    }

    public DeliveryAddress(
           java.lang.String storeName,
           java.lang.Integer districtId,
           java.lang.String zip,
           java.lang.String city,
           java.lang.String county,
           java.lang.String country,
           java.lang.String streetName,
           java.lang.Integer houseNumber,
           java.lang.String houseLetter,
           java.lang.String floor,
           java.lang.String sideDoor,
           java.lang.String municipality) {
           this.storeName = storeName;
           this.districtId = districtId;
           this.zip = zip;
           this.city = city;
           this.county = county;
           this.country = country;
           this.streetName = streetName;
           this.houseNumber = houseNumber;
           this.houseLetter = houseLetter;
           this.floor = floor;
           this.sideDoor = sideDoor;
           this.municipality = municipality;
    }


    /**
     * Gets the storeName value for this DeliveryAddress.
     * 
     * @return storeName
     */
    public java.lang.String getStoreName() {
        return storeName;
    }


    /**
     * Sets the storeName value for this DeliveryAddress.
     * 
     * @param storeName
     */
    public void setStoreName(java.lang.String storeName) {
        this.storeName = storeName;
    }


    /**
     * Gets the districtId value for this DeliveryAddress.
     * 
     * @return districtId
     */
    public java.lang.Integer getDistrictId() {
        return districtId;
    }


    /**
     * Sets the districtId value for this DeliveryAddress.
     * 
     * @param districtId
     */
    public void setDistrictId(java.lang.Integer districtId) {
        this.districtId = districtId;
    }


    /**
     * Gets the zip value for this DeliveryAddress.
     * 
     * @return zip
     */
    public java.lang.String getZip() {
        return zip;
    }


    /**
     * Sets the zip value for this DeliveryAddress.
     * 
     * @param zip
     */
    public void setZip(java.lang.String zip) {
        this.zip = zip;
    }


    /**
     * Gets the city value for this DeliveryAddress.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this DeliveryAddress.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the county value for this DeliveryAddress.
     * 
     * @return county
     */
    public java.lang.String getCounty() {
        return county;
    }


    /**
     * Sets the county value for this DeliveryAddress.
     * 
     * @param county
     */
    public void setCounty(java.lang.String county) {
        this.county = county;
    }


    /**
     * Gets the country value for this DeliveryAddress.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this DeliveryAddress.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the streetName value for this DeliveryAddress.
     * 
     * @return streetName
     */
    public java.lang.String getStreetName() {
        return streetName;
    }


    /**
     * Sets the streetName value for this DeliveryAddress.
     * 
     * @param streetName
     */
    public void setStreetName(java.lang.String streetName) {
        this.streetName = streetName;
    }


    /**
     * Gets the houseNumber value for this DeliveryAddress.
     * 
     * @return houseNumber
     */
    public java.lang.Integer getHouseNumber() {
        return houseNumber;
    }


    /**
     * Sets the houseNumber value for this DeliveryAddress.
     * 
     * @param houseNumber
     */
    public void setHouseNumber(java.lang.Integer houseNumber) {
        this.houseNumber = houseNumber;
    }


    /**
     * Gets the houseLetter value for this DeliveryAddress.
     * 
     * @return houseLetter
     */
    public java.lang.String getHouseLetter() {
        return houseLetter;
    }


    /**
     * Sets the houseLetter value for this DeliveryAddress.
     * 
     * @param houseLetter
     */
    public void setHouseLetter(java.lang.String houseLetter) {
        this.houseLetter = houseLetter;
    }


    /**
     * Gets the floor value for this DeliveryAddress.
     * 
     * @return floor
     */
    public java.lang.String getFloor() {
        return floor;
    }


    /**
     * Sets the floor value for this DeliveryAddress.
     * 
     * @param floor
     */
    public void setFloor(java.lang.String floor) {
        this.floor = floor;
    }


    /**
     * Gets the sideDoor value for this DeliveryAddress.
     * 
     * @return sideDoor
     */
    public java.lang.String getSideDoor() {
        return sideDoor;
    }


    /**
     * Sets the sideDoor value for this DeliveryAddress.
     * 
     * @param sideDoor
     */
    public void setSideDoor(java.lang.String sideDoor) {
        this.sideDoor = sideDoor;
    }


    /**
     * Gets the municipality value for this DeliveryAddress.
     * 
     * @return municipality
     */
    public java.lang.String getMunicipality() {
        return municipality;
    }


    /**
     * Sets the municipality value for this DeliveryAddress.
     * 
     * @param municipality
     */
    public void setMunicipality(java.lang.String municipality) {
        this.municipality = municipality;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeliveryAddress)) return false;
        DeliveryAddress other = (DeliveryAddress) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.storeName==null && other.getStoreName()==null) || 
             (this.storeName!=null &&
              this.storeName.equals(other.getStoreName()))) &&
            ((this.districtId==null && other.getDistrictId()==null) || 
             (this.districtId!=null &&
              this.districtId.equals(other.getDistrictId()))) &&
            ((this.zip==null && other.getZip()==null) || 
             (this.zip!=null &&
              this.zip.equals(other.getZip()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.county==null && other.getCounty()==null) || 
             (this.county!=null &&
              this.county.equals(other.getCounty()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.streetName==null && other.getStreetName()==null) || 
             (this.streetName!=null &&
              this.streetName.equals(other.getStreetName()))) &&
            ((this.houseNumber==null && other.getHouseNumber()==null) || 
             (this.houseNumber!=null &&
              this.houseNumber.equals(other.getHouseNumber()))) &&
            ((this.houseLetter==null && other.getHouseLetter()==null) || 
             (this.houseLetter!=null &&
              this.houseLetter.equals(other.getHouseLetter()))) &&
            ((this.floor==null && other.getFloor()==null) || 
             (this.floor!=null &&
              this.floor.equals(other.getFloor()))) &&
            ((this.sideDoor==null && other.getSideDoor()==null) || 
             (this.sideDoor!=null &&
              this.sideDoor.equals(other.getSideDoor()))) &&
            ((this.municipality==null && other.getMunicipality()==null) || 
             (this.municipality!=null &&
              this.municipality.equals(other.getMunicipality())));
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
        if (getStoreName() != null) {
            _hashCode += getStoreName().hashCode();
        }
        if (getDistrictId() != null) {
            _hashCode += getDistrictId().hashCode();
        }
        if (getZip() != null) {
            _hashCode += getZip().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getCounty() != null) {
            _hashCode += getCounty().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getStreetName() != null) {
            _hashCode += getStreetName().hashCode();
        }
        if (getHouseNumber() != null) {
            _hashCode += getHouseNumber().hashCode();
        }
        if (getHouseLetter() != null) {
            _hashCode += getHouseLetter().hashCode();
        }
        if (getFloor() != null) {
            _hashCode += getFloor().hashCode();
        }
        if (getSideDoor() != null) {
            _hashCode += getSideDoor().hashCode();
        }
        if (getMunicipality() != null) {
            _hashCode += getMunicipality().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeliveryAddress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "DeliveryAddress"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "storeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("districtId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "districtId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("county");
        elemField.setXmlName(new javax.xml.namespace.QName("", "county"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "streetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("houseNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "houseNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("houseLetter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "houseLetter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("floor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "floor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sideDoor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sideDoor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("municipality");
        elemField.setXmlName(new javax.xml.namespace.QName("", "municipality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
