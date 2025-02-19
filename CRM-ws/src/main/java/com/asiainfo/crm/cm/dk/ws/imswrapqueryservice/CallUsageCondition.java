/**
 * CallUsageCondition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class CallUsageCondition  implements java.io.Serializable {
    private java.lang.String destinationNumber;

    private java.lang.String durationUp;

    private java.lang.String durationLow;

    private short[] networkOperatorDestinationNumber;

    private java.lang.Short usageFlag;

    private java.lang.Short iddFlag;

    public CallUsageCondition() {
    }

    public CallUsageCondition(
           java.lang.String destinationNumber,
           java.lang.String durationUp,
           java.lang.String durationLow,
           short[] networkOperatorDestinationNumber,
           java.lang.Short usageFlag,
           java.lang.Short iddFlag) {
           this.destinationNumber = destinationNumber;
           this.durationUp = durationUp;
           this.durationLow = durationLow;
           this.networkOperatorDestinationNumber = networkOperatorDestinationNumber;
           this.usageFlag = usageFlag;
           this.iddFlag = iddFlag;
    }


    /**
     * Gets the destinationNumber value for this CallUsageCondition.
     * 
     * @return destinationNumber
     */
    public java.lang.String getDestinationNumber() {
        return destinationNumber;
    }


    /**
     * Sets the destinationNumber value for this CallUsageCondition.
     * 
     * @param destinationNumber
     */
    public void setDestinationNumber(java.lang.String destinationNumber) {
        this.destinationNumber = destinationNumber;
    }


    /**
     * Gets the durationUp value for this CallUsageCondition.
     * 
     * @return durationUp
     */
    public java.lang.String getDurationUp() {
        return durationUp;
    }


    /**
     * Sets the durationUp value for this CallUsageCondition.
     * 
     * @param durationUp
     */
    public void setDurationUp(java.lang.String durationUp) {
        this.durationUp = durationUp;
    }


    /**
     * Gets the durationLow value for this CallUsageCondition.
     * 
     * @return durationLow
     */
    public java.lang.String getDurationLow() {
        return durationLow;
    }


    /**
     * Sets the durationLow value for this CallUsageCondition.
     * 
     * @param durationLow
     */
    public void setDurationLow(java.lang.String durationLow) {
        this.durationLow = durationLow;
    }


    /**
     * Gets the networkOperatorDestinationNumber value for this CallUsageCondition.
     * 
     * @return networkOperatorDestinationNumber
     */
    public short[] getNetworkOperatorDestinationNumber() {
        return networkOperatorDestinationNumber;
    }


    /**
     * Sets the networkOperatorDestinationNumber value for this CallUsageCondition.
     * 
     * @param networkOperatorDestinationNumber
     */
    public void setNetworkOperatorDestinationNumber(short[] networkOperatorDestinationNumber) {
        this.networkOperatorDestinationNumber = networkOperatorDestinationNumber;
    }

    public short getNetworkOperatorDestinationNumber(int i) {
        return this.networkOperatorDestinationNumber[i];
    }

    public void setNetworkOperatorDestinationNumber(int i, short _value) {
        this.networkOperatorDestinationNumber[i] = _value;
    }


    /**
     * Gets the usageFlag value for this CallUsageCondition.
     * 
     * @return usageFlag
     */
    public java.lang.Short getUsageFlag() {
        return usageFlag;
    }


    /**
     * Sets the usageFlag value for this CallUsageCondition.
     * 
     * @param usageFlag
     */
    public void setUsageFlag(java.lang.Short usageFlag) {
        this.usageFlag = usageFlag;
    }


    /**
     * Gets the iddFlag value for this CallUsageCondition.
     * 
     * @return iddFlag
     */
    public java.lang.Short getIddFlag() {
        return iddFlag;
    }


    /**
     * Sets the iddFlag value for this CallUsageCondition.
     * 
     * @param iddFlag
     */
    public void setIddFlag(java.lang.Short iddFlag) {
        this.iddFlag = iddFlag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CallUsageCondition)) return false;
        CallUsageCondition other = (CallUsageCondition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.destinationNumber==null && other.getDestinationNumber()==null) || 
             (this.destinationNumber!=null &&
              this.destinationNumber.equals(other.getDestinationNumber()))) &&
            ((this.durationUp==null && other.getDurationUp()==null) || 
             (this.durationUp!=null &&
              this.durationUp.equals(other.getDurationUp()))) &&
            ((this.durationLow==null && other.getDurationLow()==null) || 
             (this.durationLow!=null &&
              this.durationLow.equals(other.getDurationLow()))) &&
            ((this.networkOperatorDestinationNumber==null && other.getNetworkOperatorDestinationNumber()==null) || 
             (this.networkOperatorDestinationNumber!=null &&
              java.util.Arrays.equals(this.networkOperatorDestinationNumber, other.getNetworkOperatorDestinationNumber()))) &&
            ((this.usageFlag==null && other.getUsageFlag()==null) || 
             (this.usageFlag!=null &&
              this.usageFlag.equals(other.getUsageFlag()))) &&
            ((this.iddFlag==null && other.getIddFlag()==null) || 
             (this.iddFlag!=null &&
              this.iddFlag.equals(other.getIddFlag())));
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
        if (getDestinationNumber() != null) {
            _hashCode += getDestinationNumber().hashCode();
        }
        if (getDurationUp() != null) {
            _hashCode += getDurationUp().hashCode();
        }
        if (getDurationLow() != null) {
            _hashCode += getDurationLow().hashCode();
        }
        if (getNetworkOperatorDestinationNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNetworkOperatorDestinationNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNetworkOperatorDestinationNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUsageFlag() != null) {
            _hashCode += getUsageFlag().hashCode();
        }
        if (getIddFlag() != null) {
            _hashCode += getIddFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CallUsageCondition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "callUsageCondition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("durationUp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "durationUp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("durationLow");
        elemField.setXmlName(new javax.xml.namespace.QName("", "durationLow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkOperatorDestinationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "networkOperatorDestinationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usageFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iddFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iddFlag"));
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
