/**
 * SMailGroupManageReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public class SMailGroupManageReq  implements java.io.Serializable {
    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.MailGroup mailGroup;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.MailGroupMember[] mailGroupMemberList;

    private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.MailGroupPost mailGroupPost;

    public SMailGroupManageReq() {
    }

    public SMailGroupManageReq(
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.MailGroup mailGroup,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.MailGroupMember[] mailGroupMemberList,
           com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.MailGroupPost mailGroupPost) {
           this.mailGroup = mailGroup;
           this.mailGroupMemberList = mailGroupMemberList;
           this.mailGroupPost = mailGroupPost;
    }


    /**
     * Gets the mailGroup value for this SMailGroupManageReq.
     * 
     * @return mailGroup
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.MailGroup getMailGroup() {
        return mailGroup;
    }


    /**
     * Sets the mailGroup value for this SMailGroupManageReq.
     * 
     * @param mailGroup
     */
    public void setMailGroup(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.MailGroup mailGroup) {
        this.mailGroup = mailGroup;
    }


    /**
     * Gets the mailGroupMemberList value for this SMailGroupManageReq.
     * 
     * @return mailGroupMemberList
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.MailGroupMember[] getMailGroupMemberList() {
        return mailGroupMemberList;
    }


    /**
     * Sets the mailGroupMemberList value for this SMailGroupManageReq.
     * 
     * @param mailGroupMemberList
     */
    public void setMailGroupMemberList(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.MailGroupMember[] mailGroupMemberList) {
        this.mailGroupMemberList = mailGroupMemberList;
    }


    /**
     * Gets the mailGroupPost value for this SMailGroupManageReq.
     * 
     * @return mailGroupPost
     */
    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.MailGroupPost getMailGroupPost() {
        return mailGroupPost;
    }


    /**
     * Sets the mailGroupPost value for this SMailGroupManageReq.
     * 
     * @param mailGroupPost
     */
    public void setMailGroupPost(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.MailGroupPost mailGroupPost) {
        this.mailGroupPost = mailGroupPost;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SMailGroupManageReq)) return false;
        SMailGroupManageReq other = (SMailGroupManageReq) obj;
        
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mailGroup==null && other.getMailGroup()==null) || 
             (this.mailGroup!=null &&
              this.mailGroup.equals(other.getMailGroup()))) &&
            ((this.mailGroupMemberList==null && other.getMailGroupMemberList()==null) || 
             (this.mailGroupMemberList!=null &&
              java.util.Arrays.equals(this.mailGroupMemberList, other.getMailGroupMemberList()))) &&
            ((this.mailGroupPost==null && other.getMailGroupPost()==null) || 
             (this.mailGroupPost!=null &&
              this.mailGroupPost.equals(other.getMailGroupPost())));
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
        if (getMailGroup() != null) {
            _hashCode += getMailGroup().hashCode();
        }
        if (getMailGroupMemberList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMailGroupMemberList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMailGroupMemberList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMailGroupPost() != null) {
            _hashCode += getMailGroupPost().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SMailGroupManageReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sMailGroupManageReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mailGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "mailGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailGroupMemberList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mailGroupMemberList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "mailGroupMember"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "mailGroupMember_Item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailGroupPost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mailGroupPost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "mailGroupPost"));
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
