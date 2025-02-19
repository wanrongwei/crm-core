/**
 * BillItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imshisqueryservice;

public class BillItem  implements java.io.Serializable {
    private java.lang.Integer billItem;

    private long unpayFee;

    private java.lang.Long discountFee;

    private java.lang.Long adjustFee;

    private java.lang.Long primFee;

    private java.lang.String billItemName;

    private com.asiainfo.crm.cm.dk.ws.imshisqueryservice.BillDetail[] billDetaillist;

    private com.asiainfo.crm.cm.dk.ws.imshisqueryservice.CaBillProd[] caBillProdList;

    private com.asiainfo.crm.cm.dk.ws.imshisqueryservice.CaBillTax[] caBillTaxList;

    public BillItem() {
    }

    public BillItem(
           java.lang.Integer billItem,
           long unpayFee,
           java.lang.Long discountFee,
           java.lang.Long adjustFee,
           java.lang.Long primFee,
           java.lang.String billItemName,
           com.asiainfo.crm.cm.dk.ws.imshisqueryservice.BillDetail[] billDetaillist,
           com.asiainfo.crm.cm.dk.ws.imshisqueryservice.CaBillProd[] caBillProdList,
           com.asiainfo.crm.cm.dk.ws.imshisqueryservice.CaBillTax[] caBillTaxList) {
           this.billItem = billItem;
           this.unpayFee = unpayFee;
           this.discountFee = discountFee;
           this.adjustFee = adjustFee;
           this.primFee = primFee;
           this.billItemName = billItemName;
           this.billDetaillist = billDetaillist;
           this.caBillProdList = caBillProdList;
           this.caBillTaxList = caBillTaxList;
    }


    /**
     * Gets the billItem value for this BillItem.
     * 
     * @return billItem
     */
    public java.lang.Integer getBillItem() {
        return billItem;
    }


    /**
     * Sets the billItem value for this BillItem.
     * 
     * @param billItem
     */
    public void setBillItem(java.lang.Integer billItem) {
        this.billItem = billItem;
    }


    /**
     * Gets the unpayFee value for this BillItem.
     * 
     * @return unpayFee
     */
    public long getUnpayFee() {
        return unpayFee;
    }


    /**
     * Sets the unpayFee value for this BillItem.
     * 
     * @param unpayFee
     */
    public void setUnpayFee(long unpayFee) {
        this.unpayFee = unpayFee;
    }


    /**
     * Gets the discountFee value for this BillItem.
     * 
     * @return discountFee
     */
    public java.lang.Long getDiscountFee() {
        return discountFee;
    }


    /**
     * Sets the discountFee value for this BillItem.
     * 
     * @param discountFee
     */
    public void setDiscountFee(java.lang.Long discountFee) {
        this.discountFee = discountFee;
    }


    /**
     * Gets the adjustFee value for this BillItem.
     * 
     * @return adjustFee
     */
    public java.lang.Long getAdjustFee() {
        return adjustFee;
    }


    /**
     * Sets the adjustFee value for this BillItem.
     * 
     * @param adjustFee
     */
    public void setAdjustFee(java.lang.Long adjustFee) {
        this.adjustFee = adjustFee;
    }


    /**
     * Gets the primFee value for this BillItem.
     * 
     * @return primFee
     */
    public java.lang.Long getPrimFee() {
        return primFee;
    }


    /**
     * Sets the primFee value for this BillItem.
     * 
     * @param primFee
     */
    public void setPrimFee(java.lang.Long primFee) {
        this.primFee = primFee;
    }


    /**
     * Gets the billItemName value for this BillItem.
     * 
     * @return billItemName
     */
    public java.lang.String getBillItemName() {
        return billItemName;
    }


    /**
     * Sets the billItemName value for this BillItem.
     * 
     * @param billItemName
     */
    public void setBillItemName(java.lang.String billItemName) {
        this.billItemName = billItemName;
    }


    /**
     * Gets the billDetaillist value for this BillItem.
     * 
     * @return billDetaillist
     */
    public com.asiainfo.crm.cm.dk.ws.imshisqueryservice.BillDetail[] getBillDetaillist() {
        return billDetaillist;
    }


    /**
     * Sets the billDetaillist value for this BillItem.
     * 
     * @param billDetaillist
     */
    public void setBillDetaillist(com.asiainfo.crm.cm.dk.ws.imshisqueryservice.BillDetail[] billDetaillist) {
        this.billDetaillist = billDetaillist;
    }


    /**
     * Gets the caBillProdList value for this BillItem.
     * 
     * @return caBillProdList
     */
    public com.asiainfo.crm.cm.dk.ws.imshisqueryservice.CaBillProd[] getCaBillProdList() {
        return caBillProdList;
    }


    /**
     * Sets the caBillProdList value for this BillItem.
     * 
     * @param caBillProdList
     */
    public void setCaBillProdList(com.asiainfo.crm.cm.dk.ws.imshisqueryservice.CaBillProd[] caBillProdList) {
        this.caBillProdList = caBillProdList;
    }


    /**
     * Gets the caBillTaxList value for this BillItem.
     * 
     * @return caBillTaxList
     */
    public com.asiainfo.crm.cm.dk.ws.imshisqueryservice.CaBillTax[] getCaBillTaxList() {
        return caBillTaxList;
    }


    /**
     * Sets the caBillTaxList value for this BillItem.
     * 
     * @param caBillTaxList
     */
    public void setCaBillTaxList(com.asiainfo.crm.cm.dk.ws.imshisqueryservice.CaBillTax[] caBillTaxList) {
        this.caBillTaxList = caBillTaxList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillItem)) return false;
        BillItem other = (BillItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billItem==null && other.getBillItem()==null) || 
             (this.billItem!=null &&
              this.billItem.equals(other.getBillItem()))) &&
            this.unpayFee == other.getUnpayFee() &&
            ((this.discountFee==null && other.getDiscountFee()==null) || 
             (this.discountFee!=null &&
              this.discountFee.equals(other.getDiscountFee()))) &&
            ((this.adjustFee==null && other.getAdjustFee()==null) || 
             (this.adjustFee!=null &&
              this.adjustFee.equals(other.getAdjustFee()))) &&
            ((this.primFee==null && other.getPrimFee()==null) || 
             (this.primFee!=null &&
              this.primFee.equals(other.getPrimFee()))) &&
            ((this.billItemName==null && other.getBillItemName()==null) || 
             (this.billItemName!=null &&
              this.billItemName.equals(other.getBillItemName()))) &&
            ((this.billDetaillist==null && other.getBillDetaillist()==null) || 
             (this.billDetaillist!=null &&
              java.util.Arrays.equals(this.billDetaillist, other.getBillDetaillist()))) &&
            ((this.caBillProdList==null && other.getCaBillProdList()==null) || 
             (this.caBillProdList!=null &&
              java.util.Arrays.equals(this.caBillProdList, other.getCaBillProdList()))) &&
            ((this.caBillTaxList==null && other.getCaBillTaxList()==null) || 
             (this.caBillTaxList!=null &&
              java.util.Arrays.equals(this.caBillTaxList, other.getCaBillTaxList())));
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
        if (getBillItem() != null) {
            _hashCode += getBillItem().hashCode();
        }
        _hashCode += new Long(getUnpayFee()).hashCode();
        if (getDiscountFee() != null) {
            _hashCode += getDiscountFee().hashCode();
        }
        if (getAdjustFee() != null) {
            _hashCode += getAdjustFee().hashCode();
        }
        if (getPrimFee() != null) {
            _hashCode += getPrimFee().hashCode();
        }
        if (getBillItemName() != null) {
            _hashCode += getBillItemName().hashCode();
        }
        if (getBillDetaillist() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillDetaillist());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillDetaillist(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCaBillProdList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCaBillProdList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCaBillProdList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCaBillTaxList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCaBillTaxList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCaBillTaxList(), i);
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
        new org.apache.axis.description.TypeDesc(BillItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billItem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unpayFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unpayFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "discountFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adjustFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billItemName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billItemName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billDetaillist");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billDetaillist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "billDetailListItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caBillProdList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "caBillProdList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caBillProd"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "caBillProdListItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caBillTaxList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "caBillTaxList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caBillTax"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "caBillTaxListItem"));
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
