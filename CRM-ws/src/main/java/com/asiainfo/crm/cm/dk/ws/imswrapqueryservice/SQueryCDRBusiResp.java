/**
 * SQueryCDRBusiResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class SQueryCDRBusiResp  extends com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private int count;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.NameValue[] nameList;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CdrInfo[][] cdrList;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SpecialCdrBusi[] usageTypeTop;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.UsageTypeFree[] usageTypeFree;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SpecialCdrBusiInfo[] sizeCount;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SpecialCdrBusi[] priceCount;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SpecialCdrBusiInfo[] freeCdrCount;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SpecialCdrBusiInfo[] unFreeCdrCount;

    public SQueryCDRBusiResp() {
    }

    public SQueryCDRBusiResp(
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ResponseHead responseHead,
           int count,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.NameValue[] nameList,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CdrInfo[][] cdrList,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SpecialCdrBusi[] usageTypeTop,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.UsageTypeFree[] usageTypeFree,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SpecialCdrBusiInfo[] sizeCount,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SpecialCdrBusi[] priceCount,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SpecialCdrBusiInfo[] freeCdrCount,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SpecialCdrBusiInfo[] unFreeCdrCount) {
        super(
            responseHead);
        this.count = count;
        this.nameList = nameList;
        this.cdrList = cdrList;
        this.usageTypeTop = usageTypeTop;
        this.usageTypeFree = usageTypeFree;
        this.sizeCount = sizeCount;
        this.priceCount = priceCount;
        this.freeCdrCount = freeCdrCount;
        this.unFreeCdrCount = unFreeCdrCount;
    }


    /**
     * Gets the count value for this SQueryCDRBusiResp.
     * 
     * @return count
     */
    public int getCount() {
        return count;
    }


    /**
     * Sets the count value for this SQueryCDRBusiResp.
     * 
     * @param count
     */
    public void setCount(int count) {
        this.count = count;
    }


    /**
     * Gets the nameList value for this SQueryCDRBusiResp.
     * 
     * @return nameList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.NameValue[] getNameList() {
        return nameList;
    }


    /**
     * Sets the nameList value for this SQueryCDRBusiResp.
     * 
     * @param nameList
     */
    public void setNameList(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.NameValue[] nameList) {
        this.nameList = nameList;
    }


    /**
     * Gets the cdrList value for this SQueryCDRBusiResp.
     * 
     * @return cdrList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CdrInfo[][] getCdrList() {
        return cdrList;
    }


    /**
     * Sets the cdrList value for this SQueryCDRBusiResp.
     * 
     * @param cdrList
     */
    public void setCdrList(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CdrInfo[][] cdrList) {
        this.cdrList = cdrList;
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CdrInfo[] getCdrList(int i) {
        return this.cdrList[i];
    }

    public void setCdrList(int i, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CdrInfo[] _value) {
        this.cdrList[i] = _value;
    }


    /**
     * Gets the usageTypeTop value for this SQueryCDRBusiResp.
     * 
     * @return usageTypeTop
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SpecialCdrBusi[] getUsageTypeTop() {
        return usageTypeTop;
    }


    /**
     * Sets the usageTypeTop value for this SQueryCDRBusiResp.
     * 
     * @param usageTypeTop
     */
    public void setUsageTypeTop(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SpecialCdrBusi[] usageTypeTop) {
        this.usageTypeTop = usageTypeTop;
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SpecialCdrBusi getUsageTypeTop(int i) {
        return this.usageTypeTop[i];
    }

    public void setUsageTypeTop(int i, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SpecialCdrBusi _value) {
        this.usageTypeTop[i] = _value;
    }


    /**
     * Gets the usageTypeFree value for this SQueryCDRBusiResp.
     * 
     * @return usageTypeFree
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.UsageTypeFree[] getUsageTypeFree() {
        return usageTypeFree;
    }


    /**
     * Sets the usageTypeFree value for this SQueryCDRBusiResp.
     * 
     * @param usageTypeFree
     */
    public void setUsageTypeFree(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.UsageTypeFree[] usageTypeFree) {
        this.usageTypeFree = usageTypeFree;
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.UsageTypeFree getUsageTypeFree(int i) {
        return this.usageTypeFree[i];
    }

    public void setUsageTypeFree(int i, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.UsageTypeFree _value) {
        this.usageTypeFree[i] = _value;
    }


    /**
     * Gets the sizeCount value for this SQueryCDRBusiResp.
     * 
     * @return sizeCount
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SpecialCdrBusiInfo[] getSizeCount() {
        return sizeCount;
    }


    /**
     * Sets the sizeCount value for this SQueryCDRBusiResp.
     * 
     * @param sizeCount
     */
    public void setSizeCount(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SpecialCdrBusiInfo[] sizeCount) {
        this.sizeCount = sizeCount;
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SpecialCdrBusiInfo getSizeCount(int i) {
        return this.sizeCount[i];
    }

    public void setSizeCount(int i, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SpecialCdrBusiInfo _value) {
        this.sizeCount[i] = _value;
    }


    /**
     * Gets the priceCount value for this SQueryCDRBusiResp.
     * 
     * @return priceCount
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SpecialCdrBusi[] getPriceCount() {
        return priceCount;
    }


    /**
     * Sets the priceCount value for this SQueryCDRBusiResp.
     * 
     * @param priceCount
     */
    public void setPriceCount(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SpecialCdrBusi[] priceCount) {
        this.priceCount = priceCount;
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SpecialCdrBusi getPriceCount(int i) {
        return this.priceCount[i];
    }

    public void setPriceCount(int i, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SpecialCdrBusi _value) {
        this.priceCount[i] = _value;
    }


    /**
     * Gets the freeCdrCount value for this SQueryCDRBusiResp.
     * 
     * @return freeCdrCount
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SpecialCdrBusiInfo[] getFreeCdrCount() {
        return freeCdrCount;
    }


    /**
     * Sets the freeCdrCount value for this SQueryCDRBusiResp.
     * 
     * @param freeCdrCount
     */
    public void setFreeCdrCount(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SpecialCdrBusiInfo[] freeCdrCount) {
        this.freeCdrCount = freeCdrCount;
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SpecialCdrBusiInfo getFreeCdrCount(int i) {
        return this.freeCdrCount[i];
    }

    public void setFreeCdrCount(int i, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SpecialCdrBusiInfo _value) {
        this.freeCdrCount[i] = _value;
    }


    /**
     * Gets the unFreeCdrCount value for this SQueryCDRBusiResp.
     * 
     * @return unFreeCdrCount
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SpecialCdrBusiInfo[] getUnFreeCdrCount() {
        return unFreeCdrCount;
    }


    /**
     * Sets the unFreeCdrCount value for this SQueryCDRBusiResp.
     * 
     * @param unFreeCdrCount
     */
    public void setUnFreeCdrCount(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SpecialCdrBusiInfo[] unFreeCdrCount) {
        this.unFreeCdrCount = unFreeCdrCount;
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SpecialCdrBusiInfo getUnFreeCdrCount(int i) {
        return this.unFreeCdrCount[i];
    }

    public void setUnFreeCdrCount(int i, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SpecialCdrBusiInfo _value) {
        this.unFreeCdrCount[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SQueryCDRBusiResp)) return false;
        SQueryCDRBusiResp other = (SQueryCDRBusiResp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.count == other.getCount() &&
            ((this.nameList==null && other.getNameList()==null) || 
             (this.nameList!=null &&
              java.util.Arrays.equals(this.nameList, other.getNameList()))) &&
            ((this.cdrList==null && other.getCdrList()==null) || 
             (this.cdrList!=null &&
              java.util.Arrays.equals(this.cdrList, other.getCdrList()))) &&
            ((this.usageTypeTop==null && other.getUsageTypeTop()==null) || 
             (this.usageTypeTop!=null &&
              java.util.Arrays.equals(this.usageTypeTop, other.getUsageTypeTop()))) &&
            ((this.usageTypeFree==null && other.getUsageTypeFree()==null) || 
             (this.usageTypeFree!=null &&
              java.util.Arrays.equals(this.usageTypeFree, other.getUsageTypeFree()))) &&
            ((this.sizeCount==null && other.getSizeCount()==null) || 
             (this.sizeCount!=null &&
              java.util.Arrays.equals(this.sizeCount, other.getSizeCount()))) &&
            ((this.priceCount==null && other.getPriceCount()==null) || 
             (this.priceCount!=null &&
              java.util.Arrays.equals(this.priceCount, other.getPriceCount()))) &&
            ((this.freeCdrCount==null && other.getFreeCdrCount()==null) || 
             (this.freeCdrCount!=null &&
              java.util.Arrays.equals(this.freeCdrCount, other.getFreeCdrCount()))) &&
            ((this.unFreeCdrCount==null && other.getUnFreeCdrCount()==null) || 
             (this.unFreeCdrCount!=null &&
              java.util.Arrays.equals(this.unFreeCdrCount, other.getUnFreeCdrCount())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        _hashCode += getCount();
        if (getNameList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNameList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNameList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCdrList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCdrList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCdrList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUsageTypeTop() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUsageTypeTop());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUsageTypeTop(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUsageTypeFree() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUsageTypeFree());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUsageTypeFree(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSizeCount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSizeCount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSizeCount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPriceCount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPriceCount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPriceCount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFreeCdrCount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFreeCdrCount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFreeCdrCount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnFreeCdrCount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnFreeCdrCount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnFreeCdrCount(), i);
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
        new org.apache.axis.description.TypeDesc(SQueryCDRBusiResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryCDRBusiResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("", "count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nameList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "nameValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "nameValueList"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdrList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cdrList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "cdrValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageTypeTop");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usageTypeTop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "specialCdrBusi"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageTypeFree");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usageTypeFree"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "usageTypeFree"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sizeCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sizeCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "specialCdrBusiInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "specialCdrBusi"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeCdrCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freeCdrCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "specialCdrBusiInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unFreeCdrCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unFreeCdrCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "specialCdrBusiInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
