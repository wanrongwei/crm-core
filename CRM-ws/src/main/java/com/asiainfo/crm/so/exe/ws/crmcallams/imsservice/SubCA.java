/**
 * SubCA.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsservice;

public class SubCA  implements java.io.Serializable {
    private java.lang.Short oper_type;

    private java.lang.String outer_parent_cust_id;

    private java.lang.Long parent_cust_id;

    private java.lang.String outer_parent_acct_id;

    private java.lang.Long parent_acct_id;

    private java.lang.String outer_cust_id;

    private java.lang.Long cust_id;

    private java.lang.String outer_acct_id;

    private java.lang.Long acct_id;

    private java.lang.Integer title_role_id;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SAddSubscriber[] user_list;

    public SubCA() {
    }

    public SubCA(
           java.lang.Short oper_type,
           java.lang.String outer_parent_cust_id,
           java.lang.Long parent_cust_id,
           java.lang.String outer_parent_acct_id,
           java.lang.Long parent_acct_id,
           java.lang.String outer_cust_id,
           java.lang.Long cust_id,
           java.lang.String outer_acct_id,
           java.lang.Long acct_id,
           java.lang.Integer title_role_id,
           com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SAddSubscriber[] user_list) {
           this.oper_type = oper_type;
           this.outer_parent_cust_id = outer_parent_cust_id;
           this.parent_cust_id = parent_cust_id;
           this.outer_parent_acct_id = outer_parent_acct_id;
           this.parent_acct_id = parent_acct_id;
           this.outer_cust_id = outer_cust_id;
           this.cust_id = cust_id;
           this.outer_acct_id = outer_acct_id;
           this.acct_id = acct_id;
           this.title_role_id = title_role_id;
           this.user_list = user_list;
    }


    /**
     * Gets the oper_type value for this SubCA.
     * 
     * @return oper_type
     */
    public java.lang.Short getOper_type() {
        return oper_type;
    }


    /**
     * Sets the oper_type value for this SubCA.
     * 
     * @param oper_type
     */
    public void setOper_type(java.lang.Short oper_type) {
        this.oper_type = oper_type;
    }


    /**
     * Gets the outer_parent_cust_id value for this SubCA.
     * 
     * @return outer_parent_cust_id
     */
    public java.lang.String getOuter_parent_cust_id() {
        return outer_parent_cust_id;
    }


    /**
     * Sets the outer_parent_cust_id value for this SubCA.
     * 
     * @param outer_parent_cust_id
     */
    public void setOuter_parent_cust_id(java.lang.String outer_parent_cust_id) {
        this.outer_parent_cust_id = outer_parent_cust_id;
    }


    /**
     * Gets the parent_cust_id value for this SubCA.
     * 
     * @return parent_cust_id
     */
    public java.lang.Long getParent_cust_id() {
        return parent_cust_id;
    }


    /**
     * Sets the parent_cust_id value for this SubCA.
     * 
     * @param parent_cust_id
     */
    public void setParent_cust_id(java.lang.Long parent_cust_id) {
        this.parent_cust_id = parent_cust_id;
    }


    /**
     * Gets the outer_parent_acct_id value for this SubCA.
     * 
     * @return outer_parent_acct_id
     */
    public java.lang.String getOuter_parent_acct_id() {
        return outer_parent_acct_id;
    }


    /**
     * Sets the outer_parent_acct_id value for this SubCA.
     * 
     * @param outer_parent_acct_id
     */
    public void setOuter_parent_acct_id(java.lang.String outer_parent_acct_id) {
        this.outer_parent_acct_id = outer_parent_acct_id;
    }


    /**
     * Gets the parent_acct_id value for this SubCA.
     * 
     * @return parent_acct_id
     */
    public java.lang.Long getParent_acct_id() {
        return parent_acct_id;
    }


    /**
     * Sets the parent_acct_id value for this SubCA.
     * 
     * @param parent_acct_id
     */
    public void setParent_acct_id(java.lang.Long parent_acct_id) {
        this.parent_acct_id = parent_acct_id;
    }


    /**
     * Gets the outer_cust_id value for this SubCA.
     * 
     * @return outer_cust_id
     */
    public java.lang.String getOuter_cust_id() {
        return outer_cust_id;
    }


    /**
     * Sets the outer_cust_id value for this SubCA.
     * 
     * @param outer_cust_id
     */
    public void setOuter_cust_id(java.lang.String outer_cust_id) {
        this.outer_cust_id = outer_cust_id;
    }


    /**
     * Gets the cust_id value for this SubCA.
     * 
     * @return cust_id
     */
    public java.lang.Long getCust_id() {
        return cust_id;
    }


    /**
     * Sets the cust_id value for this SubCA.
     * 
     * @param cust_id
     */
    public void setCust_id(java.lang.Long cust_id) {
        this.cust_id = cust_id;
    }


    /**
     * Gets the outer_acct_id value for this SubCA.
     * 
     * @return outer_acct_id
     */
    public java.lang.String getOuter_acct_id() {
        return outer_acct_id;
    }


    /**
     * Sets the outer_acct_id value for this SubCA.
     * 
     * @param outer_acct_id
     */
    public void setOuter_acct_id(java.lang.String outer_acct_id) {
        this.outer_acct_id = outer_acct_id;
    }


    /**
     * Gets the acct_id value for this SubCA.
     * 
     * @return acct_id
     */
    public java.lang.Long getAcct_id() {
        return acct_id;
    }


    /**
     * Sets the acct_id value for this SubCA.
     * 
     * @param acct_id
     */
    public void setAcct_id(java.lang.Long acct_id) {
        this.acct_id = acct_id;
    }


    /**
     * Gets the title_role_id value for this SubCA.
     * 
     * @return title_role_id
     */
    public java.lang.Integer getTitle_role_id() {
        return title_role_id;
    }


    /**
     * Sets the title_role_id value for this SubCA.
     * 
     * @param title_role_id
     */
    public void setTitle_role_id(java.lang.Integer title_role_id) {
        this.title_role_id = title_role_id;
    }


    /**
     * Gets the user_list value for this SubCA.
     * 
     * @return user_list
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SAddSubscriber[] getUser_list() {
        return user_list;
    }


    /**
     * Sets the user_list value for this SubCA.
     * 
     * @param user_list
     */
    public void setUser_list(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SAddSubscriber[] user_list) {
        this.user_list = user_list;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubCA)) return false;
        SubCA other = (SubCA) obj;
       
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
            ((this.outer_parent_cust_id==null && other.getOuter_parent_cust_id()==null) || 
             (this.outer_parent_cust_id!=null &&
              this.outer_parent_cust_id.equals(other.getOuter_parent_cust_id()))) &&
            ((this.parent_cust_id==null && other.getParent_cust_id()==null) || 
             (this.parent_cust_id!=null &&
              this.parent_cust_id.equals(other.getParent_cust_id()))) &&
            ((this.outer_parent_acct_id==null && other.getOuter_parent_acct_id()==null) || 
             (this.outer_parent_acct_id!=null &&
              this.outer_parent_acct_id.equals(other.getOuter_parent_acct_id()))) &&
            ((this.parent_acct_id==null && other.getParent_acct_id()==null) || 
             (this.parent_acct_id!=null &&
              this.parent_acct_id.equals(other.getParent_acct_id()))) &&
            ((this.outer_cust_id==null && other.getOuter_cust_id()==null) || 
             (this.outer_cust_id!=null &&
              this.outer_cust_id.equals(other.getOuter_cust_id()))) &&
            ((this.cust_id==null && other.getCust_id()==null) || 
             (this.cust_id!=null &&
              this.cust_id.equals(other.getCust_id()))) &&
            ((this.outer_acct_id==null && other.getOuter_acct_id()==null) || 
             (this.outer_acct_id!=null &&
              this.outer_acct_id.equals(other.getOuter_acct_id()))) &&
            ((this.acct_id==null && other.getAcct_id()==null) || 
             (this.acct_id!=null &&
              this.acct_id.equals(other.getAcct_id()))) &&
            ((this.title_role_id==null && other.getTitle_role_id()==null) || 
             (this.title_role_id!=null &&
              this.title_role_id.equals(other.getTitle_role_id()))) &&
            ((this.user_list==null && other.getUser_list()==null) || 
             (this.user_list!=null &&
              java.util.Arrays.equals(this.user_list, other.getUser_list())));
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
        if (getOuter_parent_cust_id() != null) {
            _hashCode += getOuter_parent_cust_id().hashCode();
        }
        if (getParent_cust_id() != null) {
            _hashCode += getParent_cust_id().hashCode();
        }
        if (getOuter_parent_acct_id() != null) {
            _hashCode += getOuter_parent_acct_id().hashCode();
        }
        if (getParent_acct_id() != null) {
            _hashCode += getParent_acct_id().hashCode();
        }
        if (getOuter_cust_id() != null) {
            _hashCode += getOuter_cust_id().hashCode();
        }
        if (getCust_id() != null) {
            _hashCode += getCust_id().hashCode();
        }
        if (getOuter_acct_id() != null) {
            _hashCode += getOuter_acct_id().hashCode();
        }
        if (getAcct_id() != null) {
            _hashCode += getAcct_id().hashCode();
        }
        if (getTitle_role_id() != null) {
            _hashCode += getTitle_role_id().hashCode();
        }
        if (getUser_list() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUser_list());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUser_list(), i);
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
        new org.apache.axis.description.TypeDesc(SubCA.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "subCA"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oper_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oper_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outer_parent_cust_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outer_parent_cust_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent_cust_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parent_cust_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outer_parent_acct_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outer_parent_acct_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent_acct_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parent_acct_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outer_cust_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outer_cust_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cust_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cust_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outer_acct_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outer_acct_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acct_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acct_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title_role_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title_role_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAddSubscriber"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "sAddSubscriber"));
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
