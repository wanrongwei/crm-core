/**
 * DoQueryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

public class DoQueryResponse  extends com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CrmBaseResponse  implements java.io.Serializable {
    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SUser user;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SUserAuth userAuth;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SAccount account;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SCustomer customer;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SBalance[] balance;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.BudgetControl[] budget;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CreditLimit[] credit;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.FreeResourceGroup[] freeResourceGroupList;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.Accumulate[] accumulation;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.Billinfo[] billInfo;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SBusiService[] hybridRule;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.OneTimeFee[] oneTimeCharge;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.Spoints point;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SProductOrder[] prodOrderList;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SBusiService[] busiServiceList;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RealTimeCallCharge[] realtimeCharge;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.HybridBusiService[] hybridBusiServiceList;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SNegativeBalance[] sNegativeBalanceList;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CapMaxControl[] capMaxControlList;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryFreeTimes queryFreeTimes;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.BillUsage billUsage;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ActualUsage[] actualUsageList;

    private com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SContact[] sContactList;

    public DoQueryResponse() {
    }

    public DoQueryResponse(
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ResponseHead responseHead,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SUser user,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SUserAuth userAuth,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SAccount account,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SCustomer customer,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SBalance[] balance,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.BudgetControl[] budget,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CreditLimit[] credit,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.FreeResourceGroup[] freeResourceGroupList,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.Accumulate[] accumulation,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.Billinfo[] billInfo,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SBusiService[] hybridRule,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.OneTimeFee[] oneTimeCharge,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.Spoints point,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SProductOrder[] prodOrderList,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SBusiService[] busiServiceList,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RealTimeCallCharge[] realtimeCharge,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.HybridBusiService[] hybridBusiServiceList,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SNegativeBalance[] sNegativeBalanceList,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CapMaxControl[] capMaxControlList,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryFreeTimes queryFreeTimes,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.BillUsage billUsage,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ActualUsage[] actualUsageList,
           com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SContact[] sContactList) {
        super(
            responseHead);
        this.user = user;
        this.userAuth = userAuth;
        this.account = account;
        this.customer = customer;
        this.balance = balance;
        this.budget = budget;
        this.credit = credit;
        this.freeResourceGroupList = freeResourceGroupList;
        this.accumulation = accumulation;
        this.billInfo = billInfo;
        this.hybridRule = hybridRule;
        this.oneTimeCharge = oneTimeCharge;
        this.point = point;
        this.prodOrderList = prodOrderList;
        this.busiServiceList = busiServiceList;
        this.realtimeCharge = realtimeCharge;
        this.hybridBusiServiceList = hybridBusiServiceList;
        this.sNegativeBalanceList = sNegativeBalanceList;
        this.capMaxControlList = capMaxControlList;
        this.queryFreeTimes = queryFreeTimes;
        this.billUsage = billUsage;
        this.actualUsageList = actualUsageList;
        this.sContactList = sContactList;
    }


    /**
     * Gets the user value for this DoQueryResponse.
     * 
     * @return user
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SUser getUser() {
        return user;
    }


    /**
     * Sets the user value for this DoQueryResponse.
     * 
     * @param user
     */
    public void setUser(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SUser user) {
        this.user = user;
    }


    /**
     * Gets the userAuth value for this DoQueryResponse.
     * 
     * @return userAuth
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SUserAuth getUserAuth() {
        return userAuth;
    }


    /**
     * Sets the userAuth value for this DoQueryResponse.
     * 
     * @param userAuth
     */
    public void setUserAuth(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SUserAuth userAuth) {
        this.userAuth = userAuth;
    }


    /**
     * Gets the account value for this DoQueryResponse.
     * 
     * @return account
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SAccount getAccount() {
        return account;
    }


    /**
     * Sets the account value for this DoQueryResponse.
     * 
     * @param account
     */
    public void setAccount(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SAccount account) {
        this.account = account;
    }


    /**
     * Gets the customer value for this DoQueryResponse.
     * 
     * @return customer
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SCustomer getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this DoQueryResponse.
     * 
     * @param customer
     */
    public void setCustomer(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SCustomer customer) {
        this.customer = customer;
    }


    /**
     * Gets the balance value for this DoQueryResponse.
     * 
     * @return balance
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SBalance[] getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this DoQueryResponse.
     * 
     * @param balance
     */
    public void setBalance(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SBalance[] balance) {
        this.balance = balance;
    }


    /**
     * Gets the budget value for this DoQueryResponse.
     * 
     * @return budget
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.BudgetControl[] getBudget() {
        return budget;
    }


    /**
     * Sets the budget value for this DoQueryResponse.
     * 
     * @param budget
     */
    public void setBudget(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.BudgetControl[] budget) {
        this.budget = budget;
    }


    /**
     * Gets the credit value for this DoQueryResponse.
     * 
     * @return credit
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CreditLimit[] getCredit() {
        return credit;
    }


    /**
     * Sets the credit value for this DoQueryResponse.
     * 
     * @param credit
     */
    public void setCredit(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CreditLimit[] credit) {
        this.credit = credit;
    }


    /**
     * Gets the freeResourceGroupList value for this DoQueryResponse.
     * 
     * @return freeResourceGroupList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.FreeResourceGroup[] getFreeResourceGroupList() {
        return freeResourceGroupList;
    }


    /**
     * Sets the freeResourceGroupList value for this DoQueryResponse.
     * 
     * @param freeResourceGroupList
     */
    public void setFreeResourceGroupList(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.FreeResourceGroup[] freeResourceGroupList) {
        this.freeResourceGroupList = freeResourceGroupList;
    }


    /**
     * Gets the accumulation value for this DoQueryResponse.
     * 
     * @return accumulation
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.Accumulate[] getAccumulation() {
        return accumulation;
    }


    /**
     * Sets the accumulation value for this DoQueryResponse.
     * 
     * @param accumulation
     */
    public void setAccumulation(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.Accumulate[] accumulation) {
        this.accumulation = accumulation;
    }


    /**
     * Gets the billInfo value for this DoQueryResponse.
     * 
     * @return billInfo
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.Billinfo[] getBillInfo() {
        return billInfo;
    }


    /**
     * Sets the billInfo value for this DoQueryResponse.
     * 
     * @param billInfo
     */
    public void setBillInfo(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.Billinfo[] billInfo) {
        this.billInfo = billInfo;
    }


    /**
     * Gets the hybridRule value for this DoQueryResponse.
     * 
     * @return hybridRule
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SBusiService[] getHybridRule() {
        return hybridRule;
    }


    /**
     * Sets the hybridRule value for this DoQueryResponse.
     * 
     * @param hybridRule
     */
    public void setHybridRule(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SBusiService[] hybridRule) {
        this.hybridRule = hybridRule;
    }


    /**
     * Gets the oneTimeCharge value for this DoQueryResponse.
     * 
     * @return oneTimeCharge
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.OneTimeFee[] getOneTimeCharge() {
        return oneTimeCharge;
    }


    /**
     * Sets the oneTimeCharge value for this DoQueryResponse.
     * 
     * @param oneTimeCharge
     */
    public void setOneTimeCharge(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.OneTimeFee[] oneTimeCharge) {
        this.oneTimeCharge = oneTimeCharge;
    }


    /**
     * Gets the point value for this DoQueryResponse.
     * 
     * @return point
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.Spoints getPoint() {
        return point;
    }


    /**
     * Sets the point value for this DoQueryResponse.
     * 
     * @param point
     */
    public void setPoint(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.Spoints point) {
        this.point = point;
    }


    /**
     * Gets the prodOrderList value for this DoQueryResponse.
     * 
     * @return prodOrderList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SProductOrder[] getProdOrderList() {
        return prodOrderList;
    }


    /**
     * Sets the prodOrderList value for this DoQueryResponse.
     * 
     * @param prodOrderList
     */
    public void setProdOrderList(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SProductOrder[] prodOrderList) {
        this.prodOrderList = prodOrderList;
    }


    /**
     * Gets the busiServiceList value for this DoQueryResponse.
     * 
     * @return busiServiceList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SBusiService[] getBusiServiceList() {
        return busiServiceList;
    }


    /**
     * Sets the busiServiceList value for this DoQueryResponse.
     * 
     * @param busiServiceList
     */
    public void setBusiServiceList(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SBusiService[] busiServiceList) {
        this.busiServiceList = busiServiceList;
    }


    /**
     * Gets the realtimeCharge value for this DoQueryResponse.
     * 
     * @return realtimeCharge
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RealTimeCallCharge[] getRealtimeCharge() {
        return realtimeCharge;
    }


    /**
     * Sets the realtimeCharge value for this DoQueryResponse.
     * 
     * @param realtimeCharge
     */
    public void setRealtimeCharge(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RealTimeCallCharge[] realtimeCharge) {
        this.realtimeCharge = realtimeCharge;
    }


    /**
     * Gets the hybridBusiServiceList value for this DoQueryResponse.
     * 
     * @return hybridBusiServiceList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.HybridBusiService[] getHybridBusiServiceList() {
        return hybridBusiServiceList;
    }


    /**
     * Sets the hybridBusiServiceList value for this DoQueryResponse.
     * 
     * @param hybridBusiServiceList
     */
    public void setHybridBusiServiceList(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.HybridBusiService[] hybridBusiServiceList) {
        this.hybridBusiServiceList = hybridBusiServiceList;
    }


    /**
     * Gets the sNegativeBalanceList value for this DoQueryResponse.
     * 
     * @return sNegativeBalanceList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SNegativeBalance[] getSNegativeBalanceList() {
        return sNegativeBalanceList;
    }


    /**
     * Sets the sNegativeBalanceList value for this DoQueryResponse.
     * 
     * @param sNegativeBalanceList
     */
    public void setSNegativeBalanceList(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SNegativeBalance[] sNegativeBalanceList) {
        this.sNegativeBalanceList = sNegativeBalanceList;
    }


    /**
     * Gets the capMaxControlList value for this DoQueryResponse.
     * 
     * @return capMaxControlList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CapMaxControl[] getCapMaxControlList() {
        return capMaxControlList;
    }


    /**
     * Sets the capMaxControlList value for this DoQueryResponse.
     * 
     * @param capMaxControlList
     */
    public void setCapMaxControlList(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CapMaxControl[] capMaxControlList) {
        this.capMaxControlList = capMaxControlList;
    }


    /**
     * Gets the queryFreeTimes value for this DoQueryResponse.
     * 
     * @return queryFreeTimes
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryFreeTimes getQueryFreeTimes() {
        return queryFreeTimes;
    }


    /**
     * Sets the queryFreeTimes value for this DoQueryResponse.
     * 
     * @param queryFreeTimes
     */
    public void setQueryFreeTimes(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryFreeTimes queryFreeTimes) {
        this.queryFreeTimes = queryFreeTimes;
    }


    /**
     * Gets the billUsage value for this DoQueryResponse.
     * 
     * @return billUsage
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.BillUsage getBillUsage() {
        return billUsage;
    }


    /**
     * Sets the billUsage value for this DoQueryResponse.
     * 
     * @param billUsage
     */
    public void setBillUsage(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.BillUsage billUsage) {
        this.billUsage = billUsage;
    }


    /**
     * Gets the actualUsageList value for this DoQueryResponse.
     * 
     * @return actualUsageList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ActualUsage[] getActualUsageList() {
        return actualUsageList;
    }


    /**
     * Sets the actualUsageList value for this DoQueryResponse.
     * 
     * @param actualUsageList
     */
    public void setActualUsageList(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ActualUsage[] actualUsageList) {
        this.actualUsageList = actualUsageList;
    }


    /**
     * Gets the sContactList value for this DoQueryResponse.
     * 
     * @return sContactList
     */
    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SContact[] getSContactList() {
        return sContactList;
    }


    /**
     * Sets the sContactList value for this DoQueryResponse.
     * 
     * @param sContactList
     */
    public void setSContactList(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SContact[] sContactList) {
        this.sContactList = sContactList;
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SContact getSContactList(int i) {
        return this.sContactList[i];
    }

    public void setSContactList(int i, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SContact _value) {
        this.sContactList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoQueryResponse)) return false;
        DoQueryResponse other = (DoQueryResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.userAuth==null && other.getUserAuth()==null) || 
             (this.userAuth!=null &&
              this.userAuth.equals(other.getUserAuth()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              java.util.Arrays.equals(this.balance, other.getBalance()))) &&
            ((this.budget==null && other.getBudget()==null) || 
             (this.budget!=null &&
              java.util.Arrays.equals(this.budget, other.getBudget()))) &&
            ((this.credit==null && other.getCredit()==null) || 
             (this.credit!=null &&
              java.util.Arrays.equals(this.credit, other.getCredit()))) &&
            ((this.freeResourceGroupList==null && other.getFreeResourceGroupList()==null) || 
             (this.freeResourceGroupList!=null &&
              java.util.Arrays.equals(this.freeResourceGroupList, other.getFreeResourceGroupList()))) &&
            ((this.accumulation==null && other.getAccumulation()==null) || 
             (this.accumulation!=null &&
              java.util.Arrays.equals(this.accumulation, other.getAccumulation()))) &&
            ((this.billInfo==null && other.getBillInfo()==null) || 
             (this.billInfo!=null &&
              java.util.Arrays.equals(this.billInfo, other.getBillInfo()))) &&
            ((this.hybridRule==null && other.getHybridRule()==null) || 
             (this.hybridRule!=null &&
              java.util.Arrays.equals(this.hybridRule, other.getHybridRule()))) &&
            ((this.oneTimeCharge==null && other.getOneTimeCharge()==null) || 
             (this.oneTimeCharge!=null &&
              java.util.Arrays.equals(this.oneTimeCharge, other.getOneTimeCharge()))) &&
            ((this.point==null && other.getPoint()==null) || 
             (this.point!=null &&
              this.point.equals(other.getPoint()))) &&
            ((this.prodOrderList==null && other.getProdOrderList()==null) || 
             (this.prodOrderList!=null &&
              java.util.Arrays.equals(this.prodOrderList, other.getProdOrderList()))) &&
            ((this.busiServiceList==null && other.getBusiServiceList()==null) || 
             (this.busiServiceList!=null &&
              java.util.Arrays.equals(this.busiServiceList, other.getBusiServiceList()))) &&
            ((this.realtimeCharge==null && other.getRealtimeCharge()==null) || 
             (this.realtimeCharge!=null &&
              java.util.Arrays.equals(this.realtimeCharge, other.getRealtimeCharge()))) &&
            ((this.hybridBusiServiceList==null && other.getHybridBusiServiceList()==null) || 
             (this.hybridBusiServiceList!=null &&
              java.util.Arrays.equals(this.hybridBusiServiceList, other.getHybridBusiServiceList()))) &&
            ((this.sNegativeBalanceList==null && other.getSNegativeBalanceList()==null) || 
             (this.sNegativeBalanceList!=null &&
              java.util.Arrays.equals(this.sNegativeBalanceList, other.getSNegativeBalanceList()))) &&
            ((this.capMaxControlList==null && other.getCapMaxControlList()==null) || 
             (this.capMaxControlList!=null &&
              java.util.Arrays.equals(this.capMaxControlList, other.getCapMaxControlList()))) &&
            ((this.queryFreeTimes==null && other.getQueryFreeTimes()==null) || 
             (this.queryFreeTimes!=null &&
              this.queryFreeTimes.equals(other.getQueryFreeTimes()))) &&
            ((this.billUsage==null && other.getBillUsage()==null) || 
             (this.billUsage!=null &&
              this.billUsage.equals(other.getBillUsage()))) &&
            ((this.actualUsageList==null && other.getActualUsageList()==null) || 
             (this.actualUsageList!=null &&
              java.util.Arrays.equals(this.actualUsageList, other.getActualUsageList()))) &&
            ((this.sContactList==null && other.getSContactList()==null) || 
             (this.sContactList!=null &&
              java.util.Arrays.equals(this.sContactList, other.getSContactList())));
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
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getUserAuth() != null) {
            _hashCode += getUserAuth().hashCode();
        }
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getBalance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBalance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBalance(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBudget() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBudget());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBudget(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCredit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCredit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCredit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFreeResourceGroupList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFreeResourceGroupList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFreeResourceGroupList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccumulation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccumulation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccumulation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHybridRule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHybridRule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHybridRule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOneTimeCharge() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOneTimeCharge());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOneTimeCharge(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPoint() != null) {
            _hashCode += getPoint().hashCode();
        }
        if (getProdOrderList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProdOrderList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProdOrderList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBusiServiceList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBusiServiceList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBusiServiceList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRealtimeCharge() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRealtimeCharge());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRealtimeCharge(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHybridBusiServiceList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHybridBusiServiceList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHybridBusiServiceList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSNegativeBalanceList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSNegativeBalanceList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSNegativeBalanceList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCapMaxControlList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCapMaxControlList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCapMaxControlList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQueryFreeTimes() != null) {
            _hashCode += getQueryFreeTimes().hashCode();
        }
        if (getBillUsage() != null) {
            _hashCode += getBillUsage().hashCode();
        }
        if (getActualUsageList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActualUsageList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActualUsageList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSContactList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSContactList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSContactList(), i);
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
        new org.apache.axis.description.TypeDesc(DoQueryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUser"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userAuth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userAuth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUserAuth"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAccount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCustomer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBalance"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "sBalanceListItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budget");
        elemField.setXmlName(new javax.xml.namespace.QName("", "budget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "budgetControl"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "budgetListItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "credit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "creditLimit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "creditLimitListItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeResourceGroupList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freeResourceGroupList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResourceGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "freeResourceGroupItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accumulation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accumulation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "accumulate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "accumulateListItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billinfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "billinfoListItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hybridRule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hybridRule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBusiService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "busiServiceList"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oneTimeCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oneTimeCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFee"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "oneTimeFeeListItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("point");
        elemField.setXmlName(new javax.xml.namespace.QName("", "point"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "spoints"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prodOrderList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prodOrderList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("busiServiceList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "busiServiceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBusiService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "busiServiceList"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realtimeCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("", "realtimeCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "realTimeCallCharge"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "realTimeCallChargeListItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hybridBusiServiceList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hybridBusiServiceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "hybridBusiService"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "hybridBusiServiceItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SNegativeBalanceList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sNegativeBalanceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sNegativeBalance"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "sNegativeBalanceItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capMaxControlList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "capMaxControlList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "capMaxControl"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "capMaxControlListItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryFreeTimes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "queryFreeTimes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryFreeTimes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billUsage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billUsage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billUsage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualUsageList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actualUsageList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "actualUsage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "actualUsageListItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SContactList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sContactList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sContact"));
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
