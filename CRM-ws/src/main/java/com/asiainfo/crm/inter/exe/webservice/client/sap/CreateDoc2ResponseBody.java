/**
 * CreateDoc2ResponseBody.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.sap;

public class CreateDoc2ResponseBody  implements java.io.Serializable {
    private java.lang.String docNumber;

    private java.lang.String expDelDate;

    private java.lang.String extDocNum;

    private com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemDataOut[] itemDataOut;

    private com.asiainfo.crm.inter.exe.webservice.client.sap.YwsReturn _return;

    public CreateDoc2ResponseBody() {
    }

    public CreateDoc2ResponseBody(
           java.lang.String docNumber,
           java.lang.String expDelDate,
           java.lang.String extDocNum,
           com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemDataOut[] itemDataOut,
           com.asiainfo.crm.inter.exe.webservice.client.sap.YwsReturn _return) {
           this.docNumber = docNumber;
           this.expDelDate = expDelDate;
           this.extDocNum = extDocNum;
           this.itemDataOut = itemDataOut;
           this._return = _return;
    }


    /**
     * Gets the docNumber value for this CreateDoc2ResponseBody.
     * 
     * @return docNumber
     */
    public java.lang.String getDocNumber() {
        return docNumber;
    }


    /**
     * Sets the docNumber value for this CreateDoc2ResponseBody.
     * 
     * @param docNumber
     */
    public void setDocNumber(java.lang.String docNumber) {
        this.docNumber = docNumber;
    }


    /**
     * Gets the expDelDate value for this CreateDoc2ResponseBody.
     * 
     * @return expDelDate
     */
    public java.lang.String getExpDelDate() {
        return expDelDate;
    }


    /**
     * Sets the expDelDate value for this CreateDoc2ResponseBody.
     * 
     * @param expDelDate
     */
    public void setExpDelDate(java.lang.String expDelDate) {
        this.expDelDate = expDelDate;
    }


    /**
     * Gets the extDocNum value for this CreateDoc2ResponseBody.
     * 
     * @return extDocNum
     */
    public java.lang.String getExtDocNum() {
        return extDocNum;
    }


    /**
     * Sets the extDocNum value for this CreateDoc2ResponseBody.
     * 
     * @param extDocNum
     */
    public void setExtDocNum(java.lang.String extDocNum) {
        this.extDocNum = extDocNum;
    }


    /**
     * Gets the itemDataOut value for this CreateDoc2ResponseBody.
     * 
     * @return itemDataOut
     */
    public com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemDataOut[] getItemDataOut() {
        return itemDataOut;
    }


    /**
     * Sets the itemDataOut value for this CreateDoc2ResponseBody.
     * 
     * @param itemDataOut
     */
    public void setItemDataOut(com.asiainfo.crm.inter.exe.webservice.client.sap.YwsSoItemDataOut[] itemDataOut) {
        this.itemDataOut = itemDataOut;
    }


    /**
     * Gets the _return value for this CreateDoc2ResponseBody.
     * 
     * @return _return
     */
    public com.asiainfo.crm.inter.exe.webservice.client.sap.YwsReturn get_return() {
        return _return;
    }


    /**
     * Sets the _return value for this CreateDoc2ResponseBody.
     * 
     * @param _return
     */
    public void set_return(com.asiainfo.crm.inter.exe.webservice.client.sap.YwsReturn _return) {
        this._return = _return;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateDoc2ResponseBody)) return false;
        CreateDoc2ResponseBody other = (CreateDoc2ResponseBody) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.docNumber==null && other.getDocNumber()==null) || 
             (this.docNumber!=null &&
              this.docNumber.equals(other.getDocNumber()))) &&
            ((this.expDelDate==null && other.getExpDelDate()==null) || 
             (this.expDelDate!=null &&
              this.expDelDate.equals(other.getExpDelDate()))) &&
            ((this.extDocNum==null && other.getExtDocNum()==null) || 
             (this.extDocNum!=null &&
              this.extDocNum.equals(other.getExtDocNum()))) &&
            ((this.itemDataOut==null && other.getItemDataOut()==null) || 
             (this.itemDataOut!=null &&
              java.util.Arrays.equals(this.itemDataOut, other.getItemDataOut()))) &&
            ((this._return==null && other.get_return()==null) || 
             (this._return!=null &&
              this._return.equals(other.get_return())));
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
        if (getDocNumber() != null) {
            _hashCode += getDocNumber().hashCode();
        }
        if (getExpDelDate() != null) {
            _hashCode += getExpDelDate().hashCode();
        }
        if (getExtDocNum() != null) {
            _hashCode += getExtDocNum().hashCode();
        }
        if (getItemDataOut() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemDataOut());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemDataOut(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (get_return() != null) {
            _hashCode += get_return().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateDoc2ResponseBody.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "CreateDoc2ResponseBody"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DocNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expDelDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExpDelDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extDocNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ExtDocNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemDataOut");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ItemDataOut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/soa/busi", "YwsSoItemDataOut"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_return");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Return"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soa.ailk.telenor.com/schema/sap/common", "YwsReturn"));
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
