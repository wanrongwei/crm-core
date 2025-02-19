package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

import java.rmi.RemoteException;

public class IImsWrapQueryServiceWsProxy implements com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.IImsWrapQueryServiceWs {
  private String _endpoint = null;
  private com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.IImsWrapQueryServiceWs iImsWrapQueryServiceWs = null;
  
  public IImsWrapQueryServiceWsProxy() {
    _initIImsWrapQueryServiceWsProxy();
  }
  
  public IImsWrapQueryServiceWsProxy(String endpoint) {
    _endpoint = endpoint;
    _initIImsWrapQueryServiceWsProxy();
  }
  
  private void _initIImsWrapQueryServiceWsProxy() {
    try {
       iImsWrapQueryServiceWs = (new com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.IImsWrapQueryService_ServiceLocator()).getIImsWrapQueryService();
      if (iImsWrapQueryServiceWs != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iImsWrapQueryServiceWs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iImsWrapQueryServiceWs)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iImsWrapQueryServiceWs != null)
      ((javax.xml.rpc.Stub)iImsWrapQueryServiceWs)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.IImsWrapQueryServiceWs getIImsWrapQueryServiceWs() {
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs;
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QueryAllowanceResponse doQueryAllowance(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryAllowanceReq req) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryAllowance(requestHead, req);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QueryTemplateResponse doQueryTemplate(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QueryTemplateReq req) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryTemplate(requestHead, req);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QueryInvoiceAttributeResponse doQueryInvoiceAttribute(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QueryInvoiceAttributeReq req) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryInvoiceAttribute(requestHead, req);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryReguideInfoResp do_queryReguideInfo(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryReguideReq queryReguideReq) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.do_queryReguideInfo(requestHead, queryReguideReq);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryAllowanceDtlResp doQueryAllowanceDtls(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryAllowanceDtlReq req) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryAllowanceDtls(requestHead, req);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryCDRSumResponse doQueryCDRSum(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryCDRSumReq sQueryCDRSumReq) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryCDRSum(requestHead, sQueryCDRSumReq);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryThrottledResp doQueryThrottled(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryThrottledReq sQueryThrottledReq) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryThrottled(requestHead, sQueryThrottledReq);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryInvoiceInfoResponse do_queryInvoiceInfo(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryInvoiceInfoReq sQueryInvoiceInfoReq) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.do_queryInvoiceInfo(requestHead, sQueryInvoiceInfoReq);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryInstallmenInfoResponse doQueryInstallmentInfo(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryInstallmentInfoReq SQueryInstallmentInfoReq) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryInstallmentInfo(requestHead, SQueryInstallmentInfoReq);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryTransactionfeeResp doQueryTransactionFee(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryTransactionFeeReq queryTransactionFeeReq) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryTransactionFee(requestHead, queryTransactionFeeReq);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QueryAcctInfoForPayResponse doQueryAcctInfoForPay(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QueryAcctInfoForPayReq req) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryAcctInfoForPay(requestHead, req);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryOrderInfoResponse doQueryOrderInfo(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryOrderInfoReq doqueryOrderInfoReq) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryOrderInfo(requestHead, doqueryOrderInfoReq);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.Billinfo[] do_queryBillExt(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryBillExt sQueryBillExtReq) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.do_queryBillExt(requestHead, sQueryBillExtReq);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryBillingStatusResponse do_queryBillingStatus(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQryBillStsReq qryBillStsReq) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.do_queryBillingStatus(requestHead, qryBillStsReq);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QueryMainPhoneByAcctIdResponse do_queryMainPhoneByAcctId(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QueryMainPhoneByAcctIdReq queryMainPhoneByAcctIdReq) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.do_queryMainPhoneByAcctId(requestHead, queryMainPhoneByAcctIdReq);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryMdbDataResponse do_queryAbmData(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryAbmDataReq req) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.do_queryAbmData(requestHead, req);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryAcctDetailByCustResponse doQueryAcctDetailByCust(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryAcctDetailByCustReq req) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryAcctDetailByCust(requestHead, req);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryWorkLogResponse doQueryWorkLog(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QueryWorkLogReq queryWorkLogReq) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryWorkLog(requestHead, queryWorkLogReq);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryGraphResponse do_queryGraph(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryGraphReq req) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.do_queryGraph(requestHead, req);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryBillExResponse doQueryBillEx(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QryBillForOSEInReq qryBillForOSEInReq) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryBillEx(requestHead, qryBillForOSEInReq);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.OrderInfoResp doQueryUnifiedPay(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.OrderInfoReq req) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryUnifiedPay(requestHead, req);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QueryProductChargeResponse doQueryProductCharge(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQryProdChargeIn[] req) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryProductCharge(requestHead, req);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryAgentBalanceResponse doQueryAgentBalance(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryAgentBalanceReq doQueryAgentBalanceReq) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryAgentBalance(requestHead, doQueryAgentBalanceReq);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.GetDebitDataResponse doQueryDebitData(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.GetDebitDataRequest req) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryDebitData(requestHead, req);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.BillAmountResponse doQueryBillAmount(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QueryBillAmountParam queryBillAmountParam) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryBillAmount(requestHead, queryBillAmountParam);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryTermBalanceResponse doQueryTermBalance(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.TermQueryParam termQueryParam, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.OneTimeFee oneTimeFee) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryTermBalance(requestHead, termQueryParam, oneTimeFee);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoGetCaInvIndexResponse doGetCaInvIndex(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SgetCaInvIndexReq req) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doGetCaInvIndex(requestHead, req);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoSMngQueryDepositResponse doQueryDeposit(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SMngQueryDepositReq req) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryDeposit(requestHead, req);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryCapMaxResponse do_queryCapMax(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryCapMaxReq sQueryCapMaxReq) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.do_queryCapMax(requestHead, sQueryCapMaxReq);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryLostBalanceResponce do_queryLostBalance(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryLostBalanceReq queryLostBalanceReq) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.do_queryLostBalance(requestHead, queryLostBalanceReq);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.BillAmountResponse doQueryBillAmountByType(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QueryBillAmountReq queryBillAmountReq) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryBillAmountByType(requestHead, queryBillAmountReq);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryPayInfoResponse doQueryPayInfo(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryPayInfoReq req) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryPayInfo(requestHead, req);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryAgentDepositResponse doQueryAgentDeposit(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryAgentDepositReq doQueryAgentDepositReq) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryAgentDeposit(requestHead, doQueryAgentDepositReq);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryRegretDeductInfoResponse doQueryRegretDeductInfo(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryRegretInfo queryRegretInfo) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryRegretDeductInfo(requestHead, queryRegretInfo);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryNotifyHisResponse doQueryNotifyHis(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryNotificationHisReq req) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryNotifyHis(requestHead, req);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryNtCdrResponse do_queryNtCdr(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryNtCdrReq sQueryNtCdrReq) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.do_queryNtCdr(requestHead, sQueryNtCdrReq);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryRecurringfeeOnetimefeeResp doQueryRecurringAndOnetimeFee(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryRecurringAndOnetimeFeeReq queryRecurringFeeReq) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryRecurringAndOnetimeFee(requestHead, queryRecurringFeeReq);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryRegretStsResponse doQueryRegretSts(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryRegretInfo queryRegretInfo) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryRegretSts(requestHead, queryRegretInfo);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryCDRBusiResp doNewQueryCDRBusi(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryCDRBusiReq sQueryCDRBusiReq) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doNewQueryCDRBusi(requestHead, sQueryCDRBusiReq);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryAcctStatusmentResp doQueryAccountStatement(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryAcctStatusmentReq req) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryAccountStatement(requestHead, req);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryResponse doQuery(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QueryType[] queryTypeList, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryParam queryParam) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQuery(requestHead, queryTypeList, queryParam);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryAutoTopUpResponse do_queryAutoTopUp(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QueryAutoTopUpReq queryAutoTopUpReq, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.OneTimeFee oneTimeFee) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.do_queryAutoTopUp(requestHead, queryAutoTopUpReq, oneTimeFee);
  }
  
  public void do_clearDbAndMdbData(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ClearDataReq req) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    iImsWrapQueryServiceWs.do_clearDbAndMdbData(requestHead, req);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryCDRResponse doQueryCDR(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryCDRReq sQueryCDRReq) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryCDR(requestHead, sQueryCDRReq);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryLedgerResponse doQueryLedger(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryledgerInReq req) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryLedger(requestHead, req);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryAmountResp doQueryAmount(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryAmountReq req) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryAmount(requestHead, req);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryDeductCondResponse doQueryDeductCond(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryDeductCondRequest req) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryDeductCond(requestHead, req);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryTaxResponse doQueryTax(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryTaxReq req) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryTax(requestHead, req);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QueryBillXmlResponse doQueryBillXml(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QueryBillXmlReq req) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryBillXml(requestHead, req);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.STransferTransformRuleResponse doQueryTransferTransformRule(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.STransferTransformRuleReq requestBody) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryTransferTransformRule(requestHead, requestBody);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryCDRFileResponse doQueryCDRFile(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryCDRReq sQueryCDRReq) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryCDRFile(requestHead, sQueryCDRReq);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryAccountInfoResponse do_QueryAccountInfo(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QueryType[] queryTypeList, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryAccountInfoParam queryParam) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.do_QueryAccountInfo(requestHead, queryTypeList, queryParam);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryMdbDataResponse do_queryMdbData(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryMdbDataReq req) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.do_queryMdbData(requestHead, req);
  }
  
  public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryPointInfoResponse doQueryPoint(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQryPointInfoReq SQryPointInfoReq) throws java.rmi.RemoteException{
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryPoint(requestHead, SQryPointInfoReq);
  }

	@Override
	public FreeResInfoResp doQueryFreeResInfo(RequestHead requestHead, long[] req) throws RemoteException {
		// TODO Auto-generated method stub
		if (iImsWrapQueryServiceWs == null)
		      _initIImsWrapQueryServiceWsProxy();
		    return iImsWrapQueryServiceWs.doQueryFreeResInfo(requestHead, req);
	}

  @Override
  public TariffResInfoResp doQueryTariffInfo(RequestHead requestHead, TariffResInfoReq req) throws RemoteException {
    if (iImsWrapQueryServiceWs == null)
      _initIImsWrapQueryServiceWsProxy();
    return iImsWrapQueryServiceWs.doQueryTariffInfo(requestHead, req);
  }


}