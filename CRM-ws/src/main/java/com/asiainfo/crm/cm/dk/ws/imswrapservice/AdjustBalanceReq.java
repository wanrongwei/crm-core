/**
 * AdjustBalanceReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapservice;

public class AdjustBalanceReq  implements java.io.Serializable {
    private java.lang.Short adjustType;

    private java.lang.String outerAcctId;

    private java.lang.Long acctId;

    private java.lang.String phoneId;

    private java.lang.Short flag;

    private java.lang.Short rtner;

    private java.lang.String remark;

    private java.lang.Short notifyFlag;

    private com.asiainfo.crm.cm.dk.ws.imswrapservice.SBalance sBalance;

    private com.asiainfo.crm.cm.dk.ws.imswrapservice.FreeResource[] freeResourceList;

    private java.lang.Long userId;

    private java.lang.Short maximumFlag;

    private java.lang.Short ownerType;

    private java.lang.String transparentData1;

    private java.lang.String transparentData2;

    private java.lang.String transparentData3;

    public AdjustBalanceReq() {
    }

    public AdjustBalanceReq(
           java.lang.Short adjustType,
           java.lang.String outerAcctId,
           java.lang.Long acctId,
           java.lang.String phoneId,
           java.lang.Short flag,
           java.lang.Short rtner,
           java.lang.String remark,
           java.lang.Short notifyFlag,
           com.asiainfo.crm.cm.dk.ws.imswrapservice.SBalance sBalance,
           com.asiainfo.crm.cm.dk.ws.imswrapservice.FreeResource[] freeResourceList,
           java.lang.Long userId,
           java.lang.Short maximumFlag,
           java.lang.Short ownerType,
           java.lang.String transparentData1,
           java.lang.String transparentData2,
           java.lang.String transparentData3) {
           this.adjustType = adjustType;
           this.outerAcctId = outerAcctId;
           this.acctId = acctId;
           this.phoneId = phoneId;
           this.flag = flag;
           this.rtner = rtner;
           this.remark = remark;
           this.notifyFlag = notifyFlag;
           this.sBalance = sBalance;
           this.freeResourceList = freeResourceList;
           this.userId = userId;
           this.maximumFlag = maximumFlag;
           this.ownerType = ownerType;
           this.transparentData1 = transparentData1;
           this.transparentData2 = transparentData2;
           this.transparentData3 = transparentData3;
    }


    /**
     * Gets the adjustType value for this AdjustBalanceReq.
     * 
     * @return adjustType
     */
    public java.lang.Short getAdjustType() {
        return adjustType;
    }


    /**
     * Sets the adjustType value for this AdjustBalanceReq.
     * 
     * @param adjustType
     */
    public void setAdjustType(java.lang.Short adjustType) {
        this.adjustType = adjustType;
    }


    /**
     * Gets the outerAcctId value for this AdjustBalanceReq.
     * 
     * @return outerAcctId
     */
    public java.lang.String getOuterAcctId() {
        return outerAcctId;
    }


    /**
     * Sets the outerAcctId value for this AdjustBalanceReq.
     * 
     * @param outerAcctId
     */
    public void setOuterAcctId(java.lang.String outerAcctId) {
        this.outerAcctId = outerAcctId;
    }


    /**
     * Gets the acctId value for this AdjustBalanceReq.
     * 
     * @return acctId
     */
    public java.lang.Long getAcctId() {
        return acctId;
    }


    /**
     * Sets the acctId value for this AdjustBalanceReq.
     * 
     * @param acctId
     */
    public void setAcctId(java.lang.Long acctId) {
        this.acctId = acctId;
    }


    /**
     * Gets the phoneId value for this AdjustBalanceReq.
     * 
     * @return phoneId
     */
    public java.lang.String getPhoneId() {
        return phoneId;
    }


    /**
     * Sets the phoneId value for this AdjustBalanceReq.
     * 
     * @param phoneId
     */
    public void setPhoneId(java.lang.String phoneId) {
        this.phoneId = phoneId;
    }


    /**
     * Gets the flag value for this AdjustBalanceReq.
     * 
     * @return flag
     */
    public java.lang.Short getFlag() {
        return flag;
    }


    /**
     * Sets the flag value for this AdjustBalanceReq.
     * 
     * @param flag
     */
    public void setFlag(java.lang.Short flag) {
        this.flag = flag;
    }


    /**
     * Gets the rtner value for this AdjustBalanceReq.
     * 
     * @return rtner
     */
    public java.lang.Short getRtner() {
        return rtner;
    }


    /**
     * Sets the rtner value for this AdjustBalanceReq.
     * 
     * @param rtner
     */
    public void setRtner(java.lang.Short rtner) {
        this.rtner = rtner;
    }


    /**
     * Gets the remark value for this AdjustBalanceReq.
     * 
     * @return remark
     */
    public java.lang.String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this AdjustBalanceReq.
     * 
     * @param remark
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }


    /**
     * Gets the notifyFlag value for this AdjustBalanceReq.
     * 
     * @return notifyFlag
     */
    public java.lang.Short getNotifyFlag() {
        return notifyFlag;
    }


    /**
     * Sets the notifyFlag value for this AdjustBalanceReq.
     * 
     * @param notifyFlag
     */
    public void setNotifyFlag(java.lang.Short notifyFlag) {
        this.notifyFlag = notifyFlag;
    }


    /**
     * Gets the sBalance value for this AdjustBalanceReq.
     * 
     * @return sBalance
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapservice.SBalance getSBalance() {
        return sBalance;
    }


    /**
     * Sets the sBalance value for this AdjustBalanceReq.
     * 
     * @param sBalance
     */
    public void setSBalance(com.asiainfo.crm.cm.dk.ws.imswrapservice.SBalance sBalance) {
        this.sBalance = sBalance;
    }


    /**
     * Gets the freeResourceList value for this AdjustBalanceReq.
     * 
     * @return freeResourceList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapservice.FreeResource[] getFreeResourceList() {
        return freeResourceList;
    }


    /**
     * Sets the freeResourceList value for this AdjustBalanceReq.
     * 
     * @param freeResourceList
     */
    public void setFreeResourceList(com.asiainfo.crm.cm.dk.ws.imswrapservice.FreeResource[] freeResourceList) {
        this.freeResourceList = freeResourceList;
    }


    /**
     * Gets the userId value for this AdjustBalanceReq.
     * 
     * @return userId
     */
    public java.lang.Long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this AdjustBalanceReq.
     * 
     * @param userId
     */
    public void setUserId(java.lang.Long userId) {
        this.userId = userId;
    }


    /**
     * Gets the maximumFlag value for this AdjustBalanceReq.
     * 
     * @return maximumFlag
     */
    public java.lang.Short getMaximumFlag() {
        return maximumFlag;
    }


    /**
     * Sets the maximumFlag value for this AdjustBalanceReq.
     * 
     * @param maximumFlag
     */
    public void setMaximumFlag(java.lang.Short maximumFlag) {
        this.maximumFlag = maximumFlag;
    }


    /**
     * Gets the ownerType value for this AdjustBalanceReq.
     * 
     * @return ownerType
     */
    public java.lang.Short getOwnerType() {
        return ownerType;
    }


    /**
     * Sets the ownerType value for this AdjustBalanceReq.
     * 
     * @param ownerType
     */
    public void setOwnerType(java.lang.Short ownerType) {
        this.ownerType = ownerType;
    }


    /**
     * Gets the transparentData1 value for this AdjustBalanceReq.
     * 
     * @return transparentData1
     */
    public java.lang.String getTransparentData1() {
        return transparentData1;
    }


    /**
     * Sets the transparentData1 value for this AdjustBalanceReq.
     * 
     * @param transparentData1
     */
    public void setTransparentData1(java.lang.String transparentData1) {
        this.transparentData1 = transparentData1;
    }


    /**
     * Gets the transparentData2 value for this AdjustBalanceReq.
     * 
     * @return transparentData2
     */
    public java.lang.String getTransparentData2() {
        return transparentData2;
    }


    /**
     * Sets the transparentData2 value for this AdjustBalanceReq.
     * 
     * @param transparentData2
     */
    public void setTransparentData2(java.lang.String transparentData2) {
        this.transparentData2 = transparentData2;
    }


    /**
     * Gets the transparentData3 value for this AdjustBalanceReq.
     * 
     * @return transparentData3
     */
    public java.lang.String getTransparentData3() {
        return transparentData3;
    }


    /**
     * Sets the transparentData3 value for this AdjustBalanceReq.
     * 
     * @param transparentData3
     */
    public void setTransparentData3(java.lang.String transparentData3) {
        this.transparentData3 = transparentData3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdjustBalanceReq)) return false;
        AdjustBalanceReq other = (AdjustBalanceReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adjustType==null && other.getAdjustType()==null) || 
             (this.adjustType!=null &&
              this.adjustType.equals(other.getAdjustType()))) &&
            ((this.outerAcctId==null && other.getOuterAcctId()==null) || 
             (this.outerAcctId!=null &&
              this.outerAcctId.equals(other.getOuterAcctId()))) &&
            ((this.acctId==null && other.getAcctId()==null) || 
             (this.acctId!=null &&
              this.acctId.equals(other.getAcctId()))) &&
            ((this.phoneId==null && other.getPhoneId()==null) || 
             (this.phoneId!=null &&
              this.phoneId.equals(other.getPhoneId()))) &&
            ((this.flag==null && other.getFlag()==null) || 
             (this.flag!=null &&
              this.flag.equals(other.getFlag()))) &&
            ((this.rtner==null && other.getRtner()==null) || 
             (this.rtner!=null &&
              this.rtner.equals(other.getRtner()))) &&
            ((this.remark==null && other.getRemark()==null) || 
             (this.remark!=null &&
              this.remark.equals(other.getRemark()))) &&
            ((this.notifyFlag==null && other.getNotifyFlag()==null) || 
             (this.notifyFlag!=null &&
              this.notifyFlag.equals(other.getNotifyFlag()))) &&
            ((this.sBalance==null && other.getSBalance()==null) || 
             (this.sBalance!=null &&
              this.sBalance.equals(other.getSBalance()))) &&
            ((this.freeResourceList==null && other.getFreeResourceList()==null) || 
             (this.freeResourceList!=null &&
              java.util.Arrays.equals(this.freeResourceList, other.getFreeResourceList()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.maximumFlag==null && other.getMaximumFlag()==null) || 
             (this.maximumFlag!=null &&
              this.maximumFlag.equals(other.getMaximumFlag()))) &&
            ((this.ownerType==null && other.getOwnerType()==null) || 
             (this.ownerType!=null &&
              this.ownerType.equals(other.getOwnerType()))) &&
            ((this.transparentData1==null && other.getTransparentData1()==null) || 
             (this.transparentData1!=null &&
              this.transparentData1.equals(other.getTransparentData1()))) &&
            ((this.transparentData2==null && other.getTransparentData2()==null) || 
             (this.transparentData2!=null &&
              this.transparentData2.equals(other.getTransparentData2()))) &&
            ((this.transparentData3==null && other.getTransparentData3()==null) || 
             (this.transparentData3!=null &&
              this.transparentData3.equals(other.getTransparentData3())));
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
        if (getAdjustType() != null) {
            _hashCode += getAdjustType().hashCode();
        }
        if (getOuterAcctId() != null) {
            _hashCode += getOuterAcctId().hashCode();
        }
        if (getAcctId() != null) {
            _hashCode += getAcctId().hashCode();
        }
        if (getPhoneId() != null) {
            _hashCode += getPhoneId().hashCode();
        }
        if (getFlag() != null) {
            _hashCode += getFlag().hashCode();
        }
        if (getRtner() != null) {
            _hashCode += getRtner().hashCode();
        }
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        if (getNotifyFlag() != null) {
            _hashCode += getNotifyFlag().hashCode();
        }
        if (getSBalance() != null) {
            _hashCode += getSBalance().hashCode();
        }
        if (getFreeResourceList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFreeResourceList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFreeResourceList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getMaximumFlag() != null) {
            _hashCode += getMaximumFlag().hashCode();
        }
        if (getOwnerType() != null) {
            _hashCode += getOwnerType().hashCode();
        }
        if (getTransparentData1() != null) {
            _hashCode += getTransparentData1().hashCode();
        }
        if (getTransparentData2() != null) {
            _hashCode += getTransparentData2().hashCode();
        }
        if (getTransparentData3() != null) {
            _hashCode += getTransparentData3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdjustBalanceReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "adjustBalanceReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adjustType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outerAcctId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outerAcctId"));
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
        elemField.setFieldName("phoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rtner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rtner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remark");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifyFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notifyFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBalance"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeResourceList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freeResourceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "freeResourceListItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maximumFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transparentData1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transparentData1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transparentData2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transparentData2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transparentData3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transparentData3"));
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
