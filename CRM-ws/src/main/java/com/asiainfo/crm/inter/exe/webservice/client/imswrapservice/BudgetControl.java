/**
 * BudgetControl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.imswrapservice;

public class BudgetControl  implements java.io.Serializable {
    private java.lang.Long busiServiceId;

    private java.lang.Short paymentMode;

    private java.lang.Short budgetType;

    private java.lang.Short priority;

    private java.lang.Boolean isTemp;

    private java.lang.Short isSystem;

    private java.lang.Double budget;

    private java.lang.Double remainBudget;

    private java.lang.Double tempBudget;

    private java.lang.Short action;

    private java.lang.Integer measureId;

    private com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.Threshold[] thresholdList;

    private java.util.Calendar startTime;

    private java.util.Calendar endTime;

    private java.lang.Short budgetRuleType;

    private java.lang.Double usedBudgetAmount;

    private java.lang.Integer budgetConsumptionType;

    public BudgetControl() {
    }

    public BudgetControl(
           java.lang.Long busiServiceId,
           java.lang.Short paymentMode,
           java.lang.Short budgetType,
           java.lang.Short priority,
           java.lang.Boolean isTemp,
           java.lang.Short isSystem,
           java.lang.Double budget,
           java.lang.Double remainBudget,
           java.lang.Double tempBudget,
           java.lang.Short action,
           java.lang.Integer measureId,
           com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.Threshold[] thresholdList,
           java.util.Calendar startTime,
           java.util.Calendar endTime,
           java.lang.Short budgetRuleType,
           java.lang.Double usedBudgetAmount,
           java.lang.Integer budgetConsumptionType) {
           this.busiServiceId = busiServiceId;
           this.paymentMode = paymentMode;
           this.budgetType = budgetType;
           this.priority = priority;
           this.isTemp = isTemp;
           this.isSystem = isSystem;
           this.budget = budget;
           this.remainBudget = remainBudget;
           this.tempBudget = tempBudget;
           this.action = action;
           this.measureId = measureId;
           this.thresholdList = thresholdList;
           this.startTime = startTime;
           this.endTime = endTime;
           this.budgetRuleType = budgetRuleType;
           this.usedBudgetAmount = usedBudgetAmount;
           this.budgetConsumptionType = budgetConsumptionType;
    }


    /**
     * Gets the busiServiceId value for this BudgetControl.
     * 
     * @return busiServiceId
     */
    public java.lang.Long getBusiServiceId() {
        return busiServiceId;
    }


    /**
     * Sets the busiServiceId value for this BudgetControl.
     * 
     * @param busiServiceId
     */
    public void setBusiServiceId(java.lang.Long busiServiceId) {
        this.busiServiceId = busiServiceId;
    }


    /**
     * Gets the paymentMode value for this BudgetControl.
     * 
     * @return paymentMode
     */
    public java.lang.Short getPaymentMode() {
        return paymentMode;
    }


    /**
     * Sets the paymentMode value for this BudgetControl.
     * 
     * @param paymentMode
     */
    public void setPaymentMode(java.lang.Short paymentMode) {
        this.paymentMode = paymentMode;
    }


    /**
     * Gets the budgetType value for this BudgetControl.
     * 
     * @return budgetType
     */
    public java.lang.Short getBudgetType() {
        return budgetType;
    }


    /**
     * Sets the budgetType value for this BudgetControl.
     * 
     * @param budgetType
     */
    public void setBudgetType(java.lang.Short budgetType) {
        this.budgetType = budgetType;
    }


    /**
     * Gets the priority value for this BudgetControl.
     * 
     * @return priority
     */
    public java.lang.Short getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this BudgetControl.
     * 
     * @param priority
     */
    public void setPriority(java.lang.Short priority) {
        this.priority = priority;
    }


    /**
     * Gets the isTemp value for this BudgetControl.
     * 
     * @return isTemp
     */
    public java.lang.Boolean getIsTemp() {
        return isTemp;
    }


    /**
     * Sets the isTemp value for this BudgetControl.
     * 
     * @param isTemp
     */
    public void setIsTemp(java.lang.Boolean isTemp) {
        this.isTemp = isTemp;
    }


    /**
     * Gets the isSystem value for this BudgetControl.
     * 
     * @return isSystem
     */
    public java.lang.Short getIsSystem() {
        return isSystem;
    }


    /**
     * Sets the isSystem value for this BudgetControl.
     * 
     * @param isSystem
     */
    public void setIsSystem(java.lang.Short isSystem) {
        this.isSystem = isSystem;
    }


    /**
     * Gets the budget value for this BudgetControl.
     * 
     * @return budget
     */
    public java.lang.Double getBudget() {
        return budget;
    }


    /**
     * Sets the budget value for this BudgetControl.
     * 
     * @param budget
     */
    public void setBudget(java.lang.Double budget) {
        this.budget = budget;
    }


    /**
     * Gets the remainBudget value for this BudgetControl.
     * 
     * @return remainBudget
     */
    public java.lang.Double getRemainBudget() {
        return remainBudget;
    }


    /**
     * Sets the remainBudget value for this BudgetControl.
     * 
     * @param remainBudget
     */
    public void setRemainBudget(java.lang.Double remainBudget) {
        this.remainBudget = remainBudget;
    }


    /**
     * Gets the tempBudget value for this BudgetControl.
     * 
     * @return tempBudget
     */
    public java.lang.Double getTempBudget() {
        return tempBudget;
    }


    /**
     * Sets the tempBudget value for this BudgetControl.
     * 
     * @param tempBudget
     */
    public void setTempBudget(java.lang.Double tempBudget) {
        this.tempBudget = tempBudget;
    }


    /**
     * Gets the action value for this BudgetControl.
     * 
     * @return action
     */
    public java.lang.Short getAction() {
        return action;
    }


    /**
     * Sets the action value for this BudgetControl.
     * 
     * @param action
     */
    public void setAction(java.lang.Short action) {
        this.action = action;
    }


    /**
     * Gets the measureId value for this BudgetControl.
     * 
     * @return measureId
     */
    public java.lang.Integer getMeasureId() {
        return measureId;
    }


    /**
     * Sets the measureId value for this BudgetControl.
     * 
     * @param measureId
     */
    public void setMeasureId(java.lang.Integer measureId) {
        this.measureId = measureId;
    }


    /**
     * Gets the thresholdList value for this BudgetControl.
     * 
     * @return thresholdList
     */
    public com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.Threshold[] getThresholdList() {
        return thresholdList;
    }


    /**
     * Sets the thresholdList value for this BudgetControl.
     * 
     * @param thresholdList
     */
    public void setThresholdList(com.asiainfo.crm.inter.exe.webservice.client.imswrapservice.Threshold[] thresholdList) {
        this.thresholdList = thresholdList;
    }


    /**
     * Gets the startTime value for this BudgetControl.
     * 
     * @return startTime
     */
    public java.util.Calendar getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this BudgetControl.
     * 
     * @param startTime
     */
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this BudgetControl.
     * 
     * @return endTime
     */
    public java.util.Calendar getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this BudgetControl.
     * 
     * @param endTime
     */
    public void setEndTime(java.util.Calendar endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the budgetRuleType value for this BudgetControl.
     * 
     * @return budgetRuleType
     */
    public java.lang.Short getBudgetRuleType() {
        return budgetRuleType;
    }


    /**
     * Sets the budgetRuleType value for this BudgetControl.
     * 
     * @param budgetRuleType
     */
    public void setBudgetRuleType(java.lang.Short budgetRuleType) {
        this.budgetRuleType = budgetRuleType;
    }


    /**
     * Gets the usedBudgetAmount value for this BudgetControl.
     * 
     * @return usedBudgetAmount
     */
    public java.lang.Double getUsedBudgetAmount() {
        return usedBudgetAmount;
    }


    /**
     * Sets the usedBudgetAmount value for this BudgetControl.
     * 
     * @param usedBudgetAmount
     */
    public void setUsedBudgetAmount(java.lang.Double usedBudgetAmount) {
        this.usedBudgetAmount = usedBudgetAmount;
    }


    /**
     * Gets the budgetConsumptionType value for this BudgetControl.
     * 
     * @return budgetConsumptionType
     */
    public java.lang.Integer getBudgetConsumptionType() {
        return budgetConsumptionType;
    }


    /**
     * Sets the budgetConsumptionType value for this BudgetControl.
     * 
     * @param budgetConsumptionType
     */
    public void setBudgetConsumptionType(java.lang.Integer budgetConsumptionType) {
        this.budgetConsumptionType = budgetConsumptionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BudgetControl)) return false;
        BudgetControl other = (BudgetControl) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.busiServiceId==null && other.getBusiServiceId()==null) || 
             (this.busiServiceId!=null &&
              this.busiServiceId.equals(other.getBusiServiceId()))) &&
            ((this.paymentMode==null && other.getPaymentMode()==null) || 
             (this.paymentMode!=null &&
              this.paymentMode.equals(other.getPaymentMode()))) &&
            ((this.budgetType==null && other.getBudgetType()==null) || 
             (this.budgetType!=null &&
              this.budgetType.equals(other.getBudgetType()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.isTemp==null && other.getIsTemp()==null) || 
             (this.isTemp!=null &&
              this.isTemp.equals(other.getIsTemp()))) &&
            ((this.isSystem==null && other.getIsSystem()==null) || 
             (this.isSystem!=null &&
              this.isSystem.equals(other.getIsSystem()))) &&
            ((this.budget==null && other.getBudget()==null) || 
             (this.budget!=null &&
              this.budget.equals(other.getBudget()))) &&
            ((this.remainBudget==null && other.getRemainBudget()==null) || 
             (this.remainBudget!=null &&
              this.remainBudget.equals(other.getRemainBudget()))) &&
            ((this.tempBudget==null && other.getTempBudget()==null) || 
             (this.tempBudget!=null &&
              this.tempBudget.equals(other.getTempBudget()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.measureId==null && other.getMeasureId()==null) || 
             (this.measureId!=null &&
              this.measureId.equals(other.getMeasureId()))) &&
            ((this.thresholdList==null && other.getThresholdList()==null) || 
             (this.thresholdList!=null &&
              java.util.Arrays.equals(this.thresholdList, other.getThresholdList()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.budgetRuleType==null && other.getBudgetRuleType()==null) || 
             (this.budgetRuleType!=null &&
              this.budgetRuleType.equals(other.getBudgetRuleType()))) &&
            ((this.usedBudgetAmount==null && other.getUsedBudgetAmount()==null) || 
             (this.usedBudgetAmount!=null &&
              this.usedBudgetAmount.equals(other.getUsedBudgetAmount()))) &&
            ((this.budgetConsumptionType==null && other.getBudgetConsumptionType()==null) || 
             (this.budgetConsumptionType!=null &&
              this.budgetConsumptionType.equals(other.getBudgetConsumptionType())));
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
        if (getBusiServiceId() != null) {
            _hashCode += getBusiServiceId().hashCode();
        }
        if (getPaymentMode() != null) {
            _hashCode += getPaymentMode().hashCode();
        }
        if (getBudgetType() != null) {
            _hashCode += getBudgetType().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getIsTemp() != null) {
            _hashCode += getIsTemp().hashCode();
        }
        if (getIsSystem() != null) {
            _hashCode += getIsSystem().hashCode();
        }
        if (getBudget() != null) {
            _hashCode += getBudget().hashCode();
        }
        if (getRemainBudget() != null) {
            _hashCode += getRemainBudget().hashCode();
        }
        if (getTempBudget() != null) {
            _hashCode += getTempBudget().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getMeasureId() != null) {
            _hashCode += getMeasureId().hashCode();
        }
        if (getThresholdList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThresholdList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getThresholdList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getBudgetRuleType() != null) {
            _hashCode += getBudgetRuleType().hashCode();
        }
        if (getUsedBudgetAmount() != null) {
            _hashCode += getUsedBudgetAmount().hashCode();
        }
        if (getBudgetConsumptionType() != null) {
            _hashCode += getBudgetConsumptionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BudgetControl.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "budgetControl"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("busiServiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "busiServiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "budgetType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTemp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isTemp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budget");
        elemField.setXmlName(new javax.xml.namespace.QName("", "budget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remainBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tempBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tempBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measureId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "measureId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thresholdList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "thresholdList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "threshold"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "thresholdListItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetRuleType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "budgetRuleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usedBudgetAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usedBudgetAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetConsumptionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "budgetConsumptionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
