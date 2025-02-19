/**
 * BillNodeTree.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class BillNodeTree  extends com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CrmBaseResponse  implements java.io.Serializable {
    private java.lang.Long itemCode;

    private java.lang.String itemNodeName;

    private java.lang.Integer itemNodeLevel;

    private java.lang.Integer parentNodeId;

    private java.lang.Double unit;

    private java.lang.String measure;

    private java.lang.Boolean leaf;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.BillNodeTree[] children;

    private java.lang.String strSubject;

    private java.lang.String strCharge;

    private java.lang.String preDiscountCharge;

    private java.lang.Long acctId;

    private java.lang.String strUnit;

    public BillNodeTree() {
    }

    public BillNodeTree(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ResponseHead responseHead,
           java.lang.Long itemCode,
           java.lang.String itemNodeName,
           java.lang.Integer itemNodeLevel,
           java.lang.Integer parentNodeId,
           java.lang.Double unit,
           java.lang.String measure,
           java.lang.Boolean leaf,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.BillNodeTree[] children,
           java.lang.String strSubject,
           java.lang.String strCharge,
           java.lang.String preDiscountCharge,
           java.lang.Long acctId,
           java.lang.String strUnit) {
        super(
            responseHead);
        this.itemCode = itemCode;
        this.itemNodeName = itemNodeName;
        this.itemNodeLevel = itemNodeLevel;
        this.parentNodeId = parentNodeId;
        this.unit = unit;
        this.measure = measure;
        this.leaf = leaf;
        this.children = children;
        this.strSubject = strSubject;
        this.strCharge = strCharge;
        this.preDiscountCharge = preDiscountCharge;
        this.acctId = acctId;
        this.strUnit = strUnit;
    }


    /**
     * Gets the itemCode value for this BillNodeTree.
     * 
     * @return itemCode
     */
    public java.lang.Long getItemCode() {
        return itemCode;
    }


    /**
     * Sets the itemCode value for this BillNodeTree.
     * 
     * @param itemCode
     */
    public void setItemCode(java.lang.Long itemCode) {
        this.itemCode = itemCode;
    }


    /**
     * Gets the itemNodeName value for this BillNodeTree.
     * 
     * @return itemNodeName
     */
    public java.lang.String getItemNodeName() {
        return itemNodeName;
    }


    /**
     * Sets the itemNodeName value for this BillNodeTree.
     * 
     * @param itemNodeName
     */
    public void setItemNodeName(java.lang.String itemNodeName) {
        this.itemNodeName = itemNodeName;
    }


    /**
     * Gets the itemNodeLevel value for this BillNodeTree.
     * 
     * @return itemNodeLevel
     */
    public java.lang.Integer getItemNodeLevel() {
        return itemNodeLevel;
    }


    /**
     * Sets the itemNodeLevel value for this BillNodeTree.
     * 
     * @param itemNodeLevel
     */
    public void setItemNodeLevel(java.lang.Integer itemNodeLevel) {
        this.itemNodeLevel = itemNodeLevel;
    }


    /**
     * Gets the parentNodeId value for this BillNodeTree.
     * 
     * @return parentNodeId
     */
    public java.lang.Integer getParentNodeId() {
        return parentNodeId;
    }


    /**
     * Sets the parentNodeId value for this BillNodeTree.
     * 
     * @param parentNodeId
     */
    public void setParentNodeId(java.lang.Integer parentNodeId) {
        this.parentNodeId = parentNodeId;
    }


    /**
     * Gets the unit value for this BillNodeTree.
     * 
     * @return unit
     */
    public java.lang.Double getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this BillNodeTree.
     * 
     * @param unit
     */
    public void setUnit(java.lang.Double unit) {
        this.unit = unit;
    }


    /**
     * Gets the measure value for this BillNodeTree.
     * 
     * @return measure
     */
    public java.lang.String getMeasure() {
        return measure;
    }


    /**
     * Sets the measure value for this BillNodeTree.
     * 
     * @param measure
     */
    public void setMeasure(java.lang.String measure) {
        this.measure = measure;
    }


    /**
     * Gets the leaf value for this BillNodeTree.
     * 
     * @return leaf
     */
    public java.lang.Boolean getLeaf() {
        return leaf;
    }


    /**
     * Sets the leaf value for this BillNodeTree.
     * 
     * @param leaf
     */
    public void setLeaf(java.lang.Boolean leaf) {
        this.leaf = leaf;
    }


    /**
     * Gets the children value for this BillNodeTree.
     * 
     * @return children
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.BillNodeTree[] getChildren() {
        return children;
    }


    /**
     * Sets the children value for this BillNodeTree.
     * 
     * @param children
     */
    public void setChildren(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.BillNodeTree[] children) {
        this.children = children;
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.BillNodeTree getChildren(int i) {
        return this.children[i];
    }

    public void setChildren(int i, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.BillNodeTree _value) {
        this.children[i] = _value;
    }


    /**
     * Gets the strSubject value for this BillNodeTree.
     * 
     * @return strSubject
     */
    public java.lang.String getStrSubject() {
        return strSubject;
    }


    /**
     * Sets the strSubject value for this BillNodeTree.
     * 
     * @param strSubject
     */
    public void setStrSubject(java.lang.String strSubject) {
        this.strSubject = strSubject;
    }


    /**
     * Gets the strCharge value for this BillNodeTree.
     * 
     * @return strCharge
     */
    public java.lang.String getStrCharge() {
        return strCharge;
    }


    /**
     * Sets the strCharge value for this BillNodeTree.
     * 
     * @param strCharge
     */
    public void setStrCharge(java.lang.String strCharge) {
        this.strCharge = strCharge;
    }


    /**
     * Gets the preDiscountCharge value for this BillNodeTree.
     * 
     * @return preDiscountCharge
     */
    public java.lang.String getPreDiscountCharge() {
        return preDiscountCharge;
    }


    /**
     * Sets the preDiscountCharge value for this BillNodeTree.
     * 
     * @param preDiscountCharge
     */
    public void setPreDiscountCharge(java.lang.String preDiscountCharge) {
        this.preDiscountCharge = preDiscountCharge;
    }


    /**
     * Gets the acctId value for this BillNodeTree.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this BillNodeTree.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the strUnit value for this BillNodeTree.
     * 
     * @return strUnit
     */
    public java.lang.String getStrUnit() {
        return strUnit;
    }


    /**
     * Sets the strUnit value for this BillNodeTree.
     * 
     * @param strUnit
     */
    public void setStrUnit(java.lang.String strUnit) {
        this.strUnit = strUnit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillNodeTree)) return false;
        BillNodeTree other = (BillNodeTree) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.itemCode==null && other.getItemCode()==null) || 
             (this.itemCode!=null &&
              this.itemCode.equals(other.getItemCode()))) &&
            ((this.itemNodeName==null && other.getItemNodeName()==null) || 
             (this.itemNodeName!=null &&
              this.itemNodeName.equals(other.getItemNodeName()))) &&
            ((this.itemNodeLevel==null && other.getItemNodeLevel()==null) || 
             (this.itemNodeLevel!=null &&
              this.itemNodeLevel.equals(other.getItemNodeLevel()))) &&
            ((this.parentNodeId==null && other.getParentNodeId()==null) || 
             (this.parentNodeId!=null &&
              this.parentNodeId.equals(other.getParentNodeId()))) &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit()))) &&
            ((this.measure==null && other.getMeasure()==null) || 
             (this.measure!=null &&
              this.measure.equals(other.getMeasure()))) &&
            ((this.leaf==null && other.getLeaf()==null) || 
             (this.leaf!=null &&
              this.leaf.equals(other.getLeaf()))) &&
            ((this.children==null && other.getChildren()==null) || 
             (this.children!=null &&
              java.util.Arrays.equals(this.children, other.getChildren()))) &&
            ((this.strSubject==null && other.getStrSubject()==null) || 
             (this.strSubject!=null &&
              this.strSubject.equals(other.getStrSubject()))) &&
            ((this.strCharge==null && other.getStrCharge()==null) || 
             (this.strCharge!=null &&
              this.strCharge.equals(other.getStrCharge()))) &&
            ((this.preDiscountCharge==null && other.getPreDiscountCharge()==null) || 
             (this.preDiscountCharge!=null &&
              this.preDiscountCharge.equals(other.getPreDiscountCharge()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.strUnit==null && other.getStrUnit()==null) || 
             (this.strUnit!=null &&
              this.strUnit.equals(other.getStrUnit())));
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
        if (getItemCode() != null) {
            _hashCode += getItemCode().hashCode();
        }
        if (getItemNodeName() != null) {
            _hashCode += getItemNodeName().hashCode();
        }
        if (getItemNodeLevel() != null) {
            _hashCode += getItemNodeLevel().hashCode();
        }
        if (getParentNodeId() != null) {
            _hashCode += getParentNodeId().hashCode();
        }
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        if (getMeasure() != null) {
            _hashCode += getMeasure().hashCode();
        }
        if (getLeaf() != null) {
            _hashCode += getLeaf().hashCode();
        }
        if (getChildren() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildren());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildren(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStrSubject() != null) {
            _hashCode += getStrSubject().hashCode();
        }
        if (getStrCharge() != null) {
            _hashCode += getStrCharge().hashCode();
        }
        if (getPreDiscountCharge() != null) {
            _hashCode += getPreDiscountCharge().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getStrUnit() != null) {
            _hashCode += getStrUnit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillNodeTree.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billNodeTree"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemNodeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemNodeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemNodeLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemNodeLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentNodeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentNodeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leaf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "leaf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("children");
        elemField.setXmlName(new javax.xml.namespace.QName("", "children"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billNodeTree"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strSubject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "strSubject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "strCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preDiscountCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preDiscountCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "strUnit"));
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
