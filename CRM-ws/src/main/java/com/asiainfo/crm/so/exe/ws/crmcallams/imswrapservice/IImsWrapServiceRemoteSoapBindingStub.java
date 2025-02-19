/**
 * IImsWrapServiceRemoteSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

import java.rmi.RemoteException;

public class IImsWrapServiceRemoteSoapBindingStub extends org.apache.axis.client.Stub implements com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.IImsWrapServiceWs {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[55];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoRegretRefund");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sRegretRefundReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sRegretRefundReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRegretRefundReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doRegretRefundResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoRegretRefundResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_etopup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "etopupReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "etopupReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.EtopupReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doEtopupResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoEtopupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoAdjustBill");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "adjustType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), java.lang.Short.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "billInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billinfo"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.Billinfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "notificationFlag"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), java.lang.Short.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAdjustBillResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdjustBillResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoAdjustFines");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sAdjustFinesReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAdjustFinesReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SAdjustFinesReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAdjustFinesResp"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SAdjustFinesResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoAutoTopUp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "autoTopUpReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAutoTopUpReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SAutoTopUpReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "oneTimeFee"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFee"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.OneTimeFee.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAutoTopUpResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAutoTopUpResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_mailGroupManage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mailGroupManageReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sMailGroupManageReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SMailGroupManageReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doMailGroupManageResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoMailGroupManageResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoCancelOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "doCancelOrderReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doCancelOrderReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelOrderReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doCancelOrderResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelOrderResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoRefundRemainBalance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "refundParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "refundParam"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RefundParam.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "oneTimeFee"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFee"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.OneTimeFee.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doRefundRemainBalanceResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoRefundRemainBalanceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_deductPoints");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sDeductPointsReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sDeductPointsReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SDeductPointsReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doDeductPointsResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoDeductPointsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoAgentDeposit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "do_agentDepositReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAgentDepositReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAgentDepositReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAgentDepositResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAgentDepositResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoInsertPrtRec");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PrintRecReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "printRecReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SPrintIn[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "sPrintIn"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doInsertPrtRecResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInsertPrtRecResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoUionChargeReply");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "uionChargeReplyReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.UionChargeReplyReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doUionChargeReplyResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoUionChargeReplyResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoAdjustBetweenAcct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "doAdjBetweenAcctInReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAdjBetweenAcctInReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdjBetweenAcctInReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAdjustBetweenAcctResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdjustBetweenAcctResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoInstallmentPrePay");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sInstallmentPrePayReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.InstallmentPrePay[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "installmentPrePayList"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doInstallmentPrePayResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInstallmentPrePayResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_oneTimeFeeDelayCharge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "oneTimeFeeList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFeeList"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.OneTimeFee[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "oneTimeFeeListItem"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doOneTimeFeeResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoOneTimeFeeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoHotBill");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sHotBillReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sHotBillReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SHotBillReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "oneTimeFee"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFee"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.OneTimeFee.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doHotBillResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoHotBillResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryPayData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PrintInReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "printInReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.PrintInReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryPayDataResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoQueryPayDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoCancelInstalPrePay");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "doCancelInstalPrePayReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doCancelInstalPrePayReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelInstalPrePayReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doCancelInstalPrePayResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelInstalPrePayResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryUnOrderFee");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryUnOrderFeeReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.QueryUnOrderFeeReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryUnOrderFeeResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoQueryUnOrderFeeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoUpdateOrderUserId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "orderUserInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "orderUserInfo"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.OrderUserInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "updateOrderUserIdResp"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.UpdateOrderUserIdResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoAcceptInstal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "doAcceptInstalReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAcceptInstalReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAcceptInstalReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAcceptInstalResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAcceptInstalResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoTransfer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sTransferReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sTransferReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.STransferReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "notificationFlag"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), java.lang.Short.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "oneTimeFee"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFee"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.OneTimeFee.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doTransferResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoTransferResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_advancePayment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "advancePaymentReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "advancePaymentReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AdvancePaymentReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "notification_flag"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), java.lang.Short.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAdvancePaymentResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdvancePaymentResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoInstanceAllowance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doInstanceAllowanceReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SAllowanceUsage[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "allowanceUsageList"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doInstanceAllowanceResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInstanceAllowanceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_gsmTopUp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gsmTopUp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sGsmTopUpReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SGsmTopUpReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doGsmTopUpResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoGsmTopUpResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoAdjustMultiBill");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "adjustMultiBillInReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "adjustMultiBillInReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AdjustMultiBillInReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "adjustMultiBillResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AdjustMultiBillResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoManageDeposit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sMngDepositReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SMngDepositReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doSMngDepositResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoSMngDepositResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoOneTimeFee");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "oneTimeFeeList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFeeList"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.OneTimeFee[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "oneTimeFeeListItem"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doOneTimeFeeResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoOneTimeFeeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_autoTopUpOnDemond");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "autoTopUpOnDemondReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "autoTopUpOnDemondReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AutoTopUpOnDemondReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "oneTimeFee"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFee"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.OneTimeFee.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAutoTopUpOnDemondResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAutoTopUpOnDemondResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoRePaymentFtp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "seqId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoSetCreditLimit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SSetCreditLimit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sSetCreditLimitReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SSetCreditLimitReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doSetCreditLimitResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoSetCreditLimitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoSetNegativeBalance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ssetNegativeBalanceReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sSetNegativeBalanceReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SSetNegativeBalanceReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doSetNegativeBalanceResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoSetNegativeBalanceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoAdTransferAsset");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "transferParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "adTransferParam"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AdTransferParam.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "oneTimeFee"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFee"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.OneTimeFee.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAdTransferAssetResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdTransferAssetResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoCancelPayment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CancelPaymentInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "cancelPaymentInfo"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CancelPaymentInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doCancelPaymentResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelPaymentResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoTopUpByCash");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sTopUpInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sTopUpInfo"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.STopUpInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doTopUpByCashResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoTopUpByCashResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoInsertOrderInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sOrderInfo"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SOrderInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doInsertOrderInfoResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInsertOrderInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoCheckDepositAmount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "checkDepositAmountReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CheckDepositAmountReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doCheckDepositAmountResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCheckDepositAmountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoAdjustPoint");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "AdjustPointReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "adjustPointReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AdjustPointReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAdjustPointResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdjustPointResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoInstalMove");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "doInstalMoveReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doInstalMoveReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInstalMoveReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doInstalMoveResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInstalMoveResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoDealApproveResponse");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "doDealApproveResponseReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doDealApproveResponseReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoDealApproveResponseReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doDealApproveResponseResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoDealApproveResponseResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoCancelOneTimeFee");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sCancelOneTimeFeeReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCancelOneTimeFeeReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SCancelOneTimeFeeReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doCancelOneTimeFeeResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelOneTimeFeeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoCancelInstalment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCancelInstalmentReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SCancelInstalmentReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doCancelInstalmentResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelInstalmentResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoPaymentAndBillAdjust");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "spaymentReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPaymentReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SPaymentReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doPaymentAndBillAdjustResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoPaymentAndBillAdjustResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoLetterData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "doLetterDataReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doLetterDataReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoLetterDataReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doLetterDataResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoLetterDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoAdjustBalance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "adjustReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "adjustBalanceReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AdjustBalanceReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAdjustBalanceResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdjustBalanceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoUnifiedPay");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "doUnifiedPayReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doUnifiedPayReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoUnifiedPayReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doUnifiedPayResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoUnifiedPayResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_autoTopUp4GUI");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "autoTopUpReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "autoTopUpReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AutoTopUpReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "oneTimeFee"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFee"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.OneTimeFee.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAutoTopUpResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAutoTopUpResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoCancelTopUp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "scancelTopUp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCancelTopUpReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SCancelTopUpReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doCancelTopUpResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelTopUpResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoRejectDirectDebit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sRejectDDReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sRejectDDReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRejectDDReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doRejectDirectDebitResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoRejectDirectDebitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoContractInstal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "doInstalContract"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sDoInstalContractReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SDoInstalContractReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doInstalContractResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInstalContractResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_cancelGsmTopUp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gsmTopUp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCancelGsmTopUpReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SCancelGsmTopUpReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doCancelGsmTopUpResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelGsmTopUpResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoUionCharge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "uionChargeReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.UionChargeReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doUionChargeRespone"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoUionChargeRespone.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoAgentSelfDeposit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "do_agentSelfDepositReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAgentSelfDepositReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAgentSelfDepositReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAgentSelfDepositRespone"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAgentSelfDepositRespone.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoRollbackPayment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sReceiptInfoReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SReceiptInfoReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doRollbackPaymentResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoRollbackPaymentResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoInstalChange");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sInstalChangeReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SInstalChangeReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doInstalChangeResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInstalChangeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[54] = oper;

    }

    public IImsWrapServiceRemoteSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public IImsWrapServiceRemoteSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public IImsWrapServiceRemoteSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "accountMail");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AccountMail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "adjustBalanceReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AdjustBalanceReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "adjustMultiBillDtl");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AdjustMultiBillDtl.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "adjustMultiBillInReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AdjustMultiBillInReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "adjustMultiBillResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AdjustMultiBillResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "adjustPointReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AdjustPointReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "adTransferParam");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AdTransferParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "advancePaymentReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AdvancePaymentReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "assetChgIn");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AssetChgIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "autoTopUpOnDemondReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AutoTopUpOnDemondReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "autoTopUpRel");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AutoTopUpRel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "autoTopUpRelation");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AutoTopUpRelation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "autoTopUpRelationList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AutoTopUpRelation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "autoTopUpRelation");
            qName2 = new javax.xml.namespace.QName("", "autoTopUpRelationListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "autoTopUpRelList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AutoTopUpRel[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "autoTopUpRel");
            qName2 = new javax.xml.namespace.QName("", "autoTopUpRelList_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "autoTopUpReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AutoTopUpReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "baseResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.BaseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billDetail");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.BillDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billDetailList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.BillDetail[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billDetail");
            qName2 = new javax.xml.namespace.QName("", "billDetailListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billinfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.Billinfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billItem");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.BillItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billItemList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.BillItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billItem");
            qName2 = new javax.xml.namespace.QName("", "billItemListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caBillProd");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CaBillProd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caBillProdList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CaBillProd[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caBillProd");
            qName2 = new javax.xml.namespace.QName("", "caBillProdListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caBillTax");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CaBillTax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caBillTaxList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CaBillTax[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caBillTax");
            qName2 = new javax.xml.namespace.QName("", "caBillTaxListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "cancelPaymentInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CancelPaymentInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "cbsErrorMsg");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CbsErrorMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "checkDepositAmountReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CheckDepositAmountReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "commParaOut");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CommParaOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "creditLimit");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CreditLimit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "creditLimitList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CreditLimit[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "creditLimit");
            qName2 = new javax.xml.namespace.QName("", "creditLimitListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "crmBaseResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CrmBaseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAcceptInstalReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAcceptInstalReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAcceptInstalResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAcceptInstalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAdjBetweenAcctInReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdjBetweenAcctInReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAdjustBalanceResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdjustBalanceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAdjustBetweenAcctResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdjustBetweenAcctResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAdjustBillResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdjustBillResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAdjustPointResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdjustPointResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAdTransferAssetResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdTransferAssetResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAdvancePaymentResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdvancePaymentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAgentDepositReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAgentDepositReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAgentDepositResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAgentDepositResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAgentSelfDepositReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAgentSelfDepositReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAgentSelfDepositRespone");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAgentSelfDepositRespone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAutoTopUpOnDemondResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAutoTopUpOnDemondResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAutoTopUpResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAutoTopUpResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doCancelGsmTopUpResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelGsmTopUpResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doCancelInstalmentResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelInstalmentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doCancelInstalPrePayReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelInstalPrePayReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doCancelInstalPrePayResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelInstalPrePayResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doCancelOneTimeFeeResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelOneTimeFeeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doCancelOrderReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelOrderReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doCancelOrderResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelOrderResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doCancelPaymentResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelPaymentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doCancelTopUpResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelTopUpResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doCheckDepositAmountResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCheckDepositAmountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doDealApproveResponseReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoDealApproveResponseReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doDealApproveResponseResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoDealApproveResponseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doDeductPointsResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoDeductPointsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doEtopupResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoEtopupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doGsmTopUpResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoGsmTopUpResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doHotBillResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoHotBillResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doInsertOrderInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInsertOrderInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doInsertPrtRecResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInsertPrtRecResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doInstalChangeResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInstalChangeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doInstalContractResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInstalContractResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doInstallmentPrePayResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInstallmentPrePayResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doInstalMoveReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInstalMoveReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doInstalMoveResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInstalMoveResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doInstanceAllowanceReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SAllowanceUsage[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAllowanceUsage");
            qName2 = new javax.xml.namespace.QName("", "allowanceUsageList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doInstanceAllowanceResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInstanceAllowanceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doLetterDataReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoLetterDataReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doLetterDataResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoLetterDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doMailGroupManageResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoMailGroupManageResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doOneTimeFeeResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoOneTimeFeeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doPaymentAndBillAdjustResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoPaymentAndBillAdjustResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryPayDataResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoQueryPayDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryUnOrderFeeResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoQueryUnOrderFeeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doRefundRemainBalanceResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoRefundRemainBalanceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doRegretRefundResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoRegretRefundResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doRejectDirectDebitResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoRejectDirectDebitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doRollbackPaymentResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoRollbackPaymentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doSetCreditLimitResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoSetCreditLimitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doSetNegativeBalanceResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoSetNegativeBalanceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doSMngDepositResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoSMngDepositResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doTopUpByCashResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoTopUpByCashResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doTransferResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoTransferResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doUionChargeReplyResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoUionChargeReplyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doUionChargeRespone");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoUionChargeRespone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doUnifiedPayReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoUnifiedPayReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doUnifiedPayResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoUnifiedPayResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "etopupReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.EtopupReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "extendParam");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ExtendParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "extendParamList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ExtendParam[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "extendParam");
            qName2 = new javax.xml.namespace.QName("", "extendParamListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "feeItem");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.FeeItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "feeItemList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.FeeItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "feeItem");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResource");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.FreeResource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResourceGroup");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.FreeResourceGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResourceGroupList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.FreeResourceGroup[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResourceGroup");
            qName2 = new javax.xml.namespace.QName("", "freeResourceGroupItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResourceList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.FreeResource[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResource");
            qName2 = new javax.xml.namespace.QName("", "freeResourceListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "imsCaRewardInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ImsCaRewardInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "imsDeductFeeOut");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ImsDeductFeeOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "imsDepositResult");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ImsDepositResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "imsQCreditLimit");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ImsQCreditLimit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "imsSAssetInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ImsSAssetInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "imsTaxFeeDetail");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ImsTaxFeeDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "innerBaseResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.InnerBaseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "installmentPrePay");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.InstallmentPrePay.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "letterDataOut");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.LetterDataOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "mailGroup");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.MailGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "mailGroupMember");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.MailGroupMember.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "mailGroupMemberList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.MailGroupMember[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "mailGroupMember");
            qName2 = new javax.xml.namespace.QName("", "mailGroupMember_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "mailGroupPost");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.MailGroupPost.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFee");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.OneTimeFee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFeeList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.OneTimeFee[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFee");
            qName2 = new javax.xml.namespace.QName("", "oneTimeFeeListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "orderUserInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.OrderUserInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "payInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.PayInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "paymentInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.PaymentInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "paymentItem");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.PaymentItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "paymentItemList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.PaymentItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "paymentItem");
            qName2 = new javax.xml.namespace.QName("", "paymentItems");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "paymentServiceItem");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.PaymentServiceItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "paymentServiceItemList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.PaymentServiceItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "paymentServiceItem");
            qName2 = new javax.xml.namespace.QName("", "paymentServiceItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "printInReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.PrintInReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "printRecReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SPrintIn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPrintIn");
            qName2 = new javax.xml.namespace.QName("", "sPrintIn");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryUnOrderFeeReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.QueryUnOrderFeeReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "receiptInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ReceiptInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "refundParam");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RefundParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "responseHead");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.ResponseHead.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAdjustFinesReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SAdjustFinesReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAdjustFinesResp");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SAdjustFinesResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAllowanceOfferUsage");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SAllowanceOfferUsage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAllowanceRec");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SAllowanceRec.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAllowanceRecDetail");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SAllowanceRecDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAllowanceUsage");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SAllowanceUsage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAmountDetailInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SAmountDetailInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sApproveResult");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SApproveResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAutoTopUpReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SAutoTopUpReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBalance");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SBalance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBalanceAdjustResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SBalanceAdjustResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBalanceList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SBalance[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBalance");
            qName2 = new javax.xml.namespace.QName("", "sBalanceListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBankPayInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SBankPayInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCancelGsmTopUpReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SCancelGsmTopUpReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCancelInstal");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SCancelInstal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCancelInstalmentReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SCancelInstalmentReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCancelOneTimeFeeReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SCancelOneTimeFeeReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCancelTopUpReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SCancelTopUpReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sDeductPointsReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SDeductPointsReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sDeposit");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SDeposit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sDepositOper");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SDepositOper.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sDepositResp");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SDepositResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sDiscountInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SDiscountInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sDoInstalContractReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SDoInstalContractReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sFeeItem");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SFeeItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sFeeItemList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SFeeItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sFeeItem");
            qName2 = new javax.xml.namespace.QName("", "feeItemList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sFreeResource");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SFreeResource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sGsmTopUpReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SGsmTopUpReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sHotBillReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SHotBillReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sInsertOrderRet");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SInsertOrderRet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sInstalChangeReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SInstalChangeReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sInstalChangeWeb");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SInstalChangeWeb.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sInstalInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SInstalInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sInstalInfoAccept");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SInstalInfoAccept.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sInstallmentPrePayReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.InstallmentPrePay[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "installmentPrePay");
            qName2 = new javax.xml.namespace.QName("", "installmentPrePayList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sInstalOffer");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SInstalOffer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sMailGroupManageReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SMailGroupManageReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sMngDepositReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SMngDepositReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sMonthlyFee");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SMonthlyFee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sOfferFee");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SOfferFee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sOfferInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SOfferInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sOrderField");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SOrderField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sOrderInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SOrderInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPage");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SPage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPayDetail");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SPayDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPayInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SPayInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPaymentReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SPaymentReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPrintIn");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SPrintIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPrintOut");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SPrintOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPrintOutResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SPrintOutResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductFee");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SProductFee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrderResult");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SProductOrderResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrderResultList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SProductOrderResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrderResult");
            qName2 = new javax.xml.namespace.QName("", "sProductOrderResultListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductParam");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SProductParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductParamList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SProductParam[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductParam");
            qName2 = new javax.xml.namespace.QName("", "sProductParamListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sReceiptInfoReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SReceiptInfoReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sRegretOrderInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRegretOrderInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sRegretRefundReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRegretRefundReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sRejectDDReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRejectDDReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sRewardAsset");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRewardAsset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sSetCreditLimitReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SSetCreditLimitReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sSetNegativeBalanceReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SSetNegativeBalanceReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sTopUpInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.STopUpInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sTopUpResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.STopUpResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sTransferReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.STransferReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "subscriberExempt");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SubscriberExempt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUnifiedPayInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SUnifiedPayInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "transferDetail");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.TransferDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "uionChargeReplyReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.UionChargeReplyReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "uionChargeReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.UionChargeReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "updateOrderUserIdResp");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.UpdateOrderUserIdResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (Exception _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoRegretRefundResponse doRegretRefund(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRegretRefundReq sRegretRefundReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoRegretRefund"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sRegretRefundReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoRegretRefundResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoRegretRefundResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoRegretRefundResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoEtopupResponse do_etopup(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.EtopupReq etopupReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_etopup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, etopupReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoEtopupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoEtopupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoEtopupResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdjustBillResponse doAdjustBill(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, java.lang.Short adjustType, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.Billinfo billInfo, java.lang.Short notificationFlag) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoAdjustBill"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, adjustType, billInfo, notificationFlag});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdjustBillResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdjustBillResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdjustBillResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SAdjustFinesResp doAdjustFines(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SAdjustFinesReq sAdjustFinesReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoAdjustFines"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sAdjustFinesReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SAdjustFinesResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SAdjustFinesResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SAdjustFinesResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAutoTopUpResponse doAutoTopUp(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SAutoTopUpReq autoTopUpReq, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.OneTimeFee oneTimeFee) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoAutoTopUp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, autoTopUpReq, oneTimeFee});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAutoTopUpResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAutoTopUpResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAutoTopUpResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoMailGroupManageResponse do_mailGroupManage(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SMailGroupManageReq mailGroupManageReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_mailGroupManage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, mailGroupManageReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoMailGroupManageResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoMailGroupManageResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoMailGroupManageResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelOrderResponse doCancelOrder(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelOrderReq doCancelOrderReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoCancelOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, doCancelOrderReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelOrderResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelOrderResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelOrderResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoRefundRemainBalanceResponse doRefundRemainBalance(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RefundParam refundParam, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.OneTimeFee oneTimeFee) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoRefundRemainBalance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, refundParam, oneTimeFee});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoRefundRemainBalanceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoRefundRemainBalanceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoRefundRemainBalanceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoDeductPointsResponse do_deductPoints(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SDeductPointsReq sDeductPointsReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_deductPoints"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sDeductPointsReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoDeductPointsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoDeductPointsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoDeductPointsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAgentDepositResponse doAgentDeposit(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAgentDepositReq do_agentDepositReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoAgentDeposit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, do_agentDepositReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAgentDepositResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAgentDepositResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAgentDepositResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInsertPrtRecResponse doInsertPrtRec(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SPrintIn[] printRecReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoInsertPrtRec"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, printRecReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInsertPrtRecResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInsertPrtRecResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInsertPrtRecResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoUionChargeReplyResponse doUionChargeReply(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.UionChargeReplyReq req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoUionChargeReply"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoUionChargeReplyResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoUionChargeReplyResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoUionChargeReplyResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdjustBetweenAcctResponse doAdjustBetweenAcct(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdjBetweenAcctInReq doAdjBetweenAcctInReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoAdjustBetweenAcct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, doAdjBetweenAcctInReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdjustBetweenAcctResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdjustBetweenAcctResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdjustBetweenAcctResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInstallmentPrePayResponse doInstallmentPrePay(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.InstallmentPrePay[] req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoInstallmentPrePay"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInstallmentPrePayResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInstallmentPrePayResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInstallmentPrePayResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoOneTimeFeeResponse do_oneTimeFeeDelayCharge(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.OneTimeFee[] oneTimeFeeList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_oneTimeFeeDelayCharge"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, oneTimeFeeList});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoOneTimeFeeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoOneTimeFeeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoOneTimeFeeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoHotBillResponse doHotBill(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SHotBillReq sHotBillReq, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.OneTimeFee oneTimeFee) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoHotBill"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sHotBillReq, oneTimeFee});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoHotBillResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoHotBillResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoHotBillResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoQueryPayDataResponse doQueryPayData(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.PrintInReq printInReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryPayData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, printInReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoQueryPayDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoQueryPayDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoQueryPayDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelInstalPrePayResponse doCancelInstalPrePay(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelInstalPrePayReq doCancelInstalPrePayReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoCancelInstalPrePay"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, doCancelInstalPrePayReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelInstalPrePayResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelInstalPrePayResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelInstalPrePayResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoQueryUnOrderFeeResponse doQueryUnOrderFee(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.QueryUnOrderFeeReq req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryUnOrderFee"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoQueryUnOrderFeeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoQueryUnOrderFeeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoQueryUnOrderFeeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.UpdateOrderUserIdResp doUpdateOrderUserId(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.OrderUserInfo orderUserInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoUpdateOrderUserId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, orderUserInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.UpdateOrderUserIdResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.UpdateOrderUserIdResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.UpdateOrderUserIdResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAcceptInstalResponse doAcceptInstal(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAcceptInstalReq doAcceptInstalReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoAcceptInstal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, doAcceptInstalReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAcceptInstalResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAcceptInstalResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAcceptInstalResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoTransferResponse doTransfer(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.STransferReq sTransferReq, java.lang.Short notificationFlag, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.OneTimeFee oneTimeFee) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoTransfer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sTransferReq, notificationFlag, oneTimeFee});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoTransferResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoTransferResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoTransferResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdvancePaymentResponse do_advancePayment(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AdvancePaymentReq advancePaymentReq, java.lang.Short notification_flag) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_advancePayment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, advancePaymentReq, notification_flag});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdvancePaymentResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdvancePaymentResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdvancePaymentResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInstanceAllowanceResponse doInstanceAllowance(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SAllowanceUsage[] req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoInstanceAllowance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInstanceAllowanceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInstanceAllowanceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInstanceAllowanceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoGsmTopUpResponse do_gsmTopUp(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SGsmTopUpReq gsmTopUp) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_gsmTopUp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, gsmTopUp});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoGsmTopUpResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoGsmTopUpResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoGsmTopUpResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AdjustMultiBillResponse doAdjustMultiBill(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AdjustMultiBillInReq adjustMultiBillInReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoAdjustMultiBill"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, adjustMultiBillInReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AdjustMultiBillResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AdjustMultiBillResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AdjustMultiBillResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoSMngDepositResponse doManageDeposit(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SMngDepositReq req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoManageDeposit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoSMngDepositResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoSMngDepositResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoSMngDepositResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoOneTimeFeeResponse doOneTimeFee(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.OneTimeFee[] oneTimeFeeList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoOneTimeFee"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, oneTimeFeeList});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoOneTimeFeeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoOneTimeFeeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoOneTimeFeeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAutoTopUpOnDemondResponse do_autoTopUpOnDemond(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AutoTopUpOnDemondReq autoTopUpOnDemondReq, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.OneTimeFee oneTimeFee) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_autoTopUpOnDemond"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, autoTopUpOnDemondReq, oneTimeFee});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAutoTopUpOnDemondResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAutoTopUpOnDemondResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAutoTopUpOnDemondResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    @Override
	public void doRePaymentFtp(RequestHead requestHead, Long seqId)
			throws java.rmi.RemoteException {
		// TODO Auto-generated method stub
//		return null;
	}

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoSetCreditLimitResponse doSetCreditLimit(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SSetCreditLimitReq SSetCreditLimit) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoSetCreditLimit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, SSetCreditLimit});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoSetCreditLimitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoSetCreditLimitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoSetCreditLimitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoSetNegativeBalanceResponse doSetNegativeBalance(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SSetNegativeBalanceReq ssetNegativeBalanceReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoSetNegativeBalance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, ssetNegativeBalanceReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoSetNegativeBalanceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoSetNegativeBalanceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoSetNegativeBalanceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdTransferAssetResponse doAdTransferAsset(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AdTransferParam transferParam, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.OneTimeFee oneTimeFee) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoAdTransferAsset"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, transferParam, oneTimeFee});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdTransferAssetResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdTransferAssetResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdTransferAssetResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelPaymentResponse doCancelPayment(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CancelPaymentInfo cancelPaymentInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoCancelPayment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, cancelPaymentInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelPaymentResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelPaymentResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelPaymentResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoTopUpByCashResponse doTopUpByCash(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.STopUpInfo sTopUpInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoTopUpByCash"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sTopUpInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoTopUpByCashResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoTopUpByCashResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoTopUpByCashResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInsertOrderInfoResponse doInsertOrderInfo(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SOrderInfo req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoInsertOrderInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInsertOrderInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInsertOrderInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInsertOrderInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCheckDepositAmountResponse doCheckDepositAmount(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.CheckDepositAmountReq req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoCheckDepositAmount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCheckDepositAmountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCheckDepositAmountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCheckDepositAmountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdjustPointResponse doAdjustPoint(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AdjustPointReq adjustPointReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoAdjustPoint"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, adjustPointReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdjustPointResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdjustPointResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdjustPointResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInstalMoveResponse doInstalMove(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInstalMoveReq doInstalMoveReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoInstalMove"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, doInstalMoveReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInstalMoveResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInstalMoveResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInstalMoveResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoDealApproveResponseResponse doDealApproveResponse(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoDealApproveResponseReq doDealApproveResponseReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoDealApproveResponse"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, doDealApproveResponseReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoDealApproveResponseResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoDealApproveResponseResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoDealApproveResponseResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelOneTimeFeeResponse doCancelOneTimeFee(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SCancelOneTimeFeeReq sCancelOneTimeFeeReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoCancelOneTimeFee"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sCancelOneTimeFeeReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelOneTimeFeeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelOneTimeFeeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelOneTimeFeeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelInstalmentResponse doCancelInstalment(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SCancelInstalmentReq req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoCancelInstalment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelInstalmentResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelInstalmentResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelInstalmentResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoPaymentAndBillAdjustResponse doPaymentAndBillAdjust(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SPaymentReq spaymentReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoPaymentAndBillAdjust"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, spaymentReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoPaymentAndBillAdjustResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoPaymentAndBillAdjustResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoPaymentAndBillAdjustResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoLetterDataResponse doLetterData(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoLetterDataReq doLetterDataReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoLetterData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, doLetterDataReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoLetterDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoLetterDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoLetterDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdjustBalanceResponse doAdjustBalance(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AdjustBalanceReq adjustReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoAdjustBalance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, adjustReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdjustBalanceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdjustBalanceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAdjustBalanceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoUnifiedPayResponse doUnifiedPay(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoUnifiedPayReq doUnifiedPayReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoUnifiedPay"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, doUnifiedPayReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoUnifiedPayResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoUnifiedPayResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoUnifiedPayResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAutoTopUpResponse do_autoTopUp4GUI(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.AutoTopUpReq autoTopUpReq, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.OneTimeFee oneTimeFee) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_autoTopUp4GUI"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, autoTopUpReq, oneTimeFee});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAutoTopUpResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAutoTopUpResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAutoTopUpResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelTopUpResponse doCancelTopUp(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SCancelTopUpReq scancelTopUp) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoCancelTopUp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, scancelTopUp});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelTopUpResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelTopUpResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelTopUpResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoRejectDirectDebitResponse doRejectDirectDebit(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SRejectDDReq sRejectDDReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoRejectDirectDebit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sRejectDDReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoRejectDirectDebitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoRejectDirectDebitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoRejectDirectDebitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInstalContractResponse doContractInstal(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SDoInstalContractReq doInstalContract) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoContractInstal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, doInstalContract});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInstalContractResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInstalContractResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInstalContractResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelGsmTopUpResponse do_cancelGsmTopUp(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SCancelGsmTopUpReq gsmTopUp) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_cancelGsmTopUp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, gsmTopUp});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelGsmTopUpResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelGsmTopUpResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoCancelGsmTopUpResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoUionChargeRespone doUionCharge(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.UionChargeReq req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoUionCharge"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoUionChargeRespone) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoUionChargeRespone) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoUionChargeRespone.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAgentSelfDepositRespone doAgentSelfDeposit(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAgentSelfDepositReq do_agentSelfDepositReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoAgentSelfDeposit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, do_agentSelfDepositReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAgentSelfDepositRespone) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAgentSelfDepositRespone) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoAgentSelfDepositRespone.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoRollbackPaymentResponse doRollbackPayment(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SReceiptInfoReq req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoRollbackPayment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoRollbackPaymentResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoRollbackPaymentResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoRollbackPaymentResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInstalChangeResponse doInstalChange(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SInstalChangeReq req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoInstalChange"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInstalChangeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInstalChangeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.DoInstalChangeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

	@Override
	public DoRepairUnifiedPayResponse doRepairUnifiedPay(
			RequestHead requestHead, SOrderRepairInfo orderRepairInfo)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void doCreditLimit(RequestHead requestHead,
			SCreditLimitInReq sCreditLimitIn) throws RemoteException {
		// TODO Auto-generated method stub
//		return null;
	}

	@Override
	public DoRegretFeeResponse doRegretFee(RequestHead requestHead,
			SRegretInfo queryRegretInfo) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DoChangeOrderInfoResponse doChangeOrderInfo(RequestHead requestHead,
			SChangeOrderParam changeParam) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FreeResourceResponse doTopUpFreeResourse(RequestHead requestHead,
	        FreeResourceReq freeResourceReq) throws RemoteException {
	    // TODO Auto-generated method stub
	    return null;
	}
	
	public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SchangeOrderInfoResp doChangeFutrueOrder(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SchangeOrderInfo req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoChangeFutrueOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SchangeOrderInfoResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SchangeOrderInfoResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SchangeOrderInfoResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }
	
	 public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SconfirmOrderResp doConfirmFutrueOrder(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SconfirmFutrueInfo req) throws java.rmi.RemoteException {
	        if (super.cachedEndpoint == null) {
	            throw new org.apache.axis.NoEndPointException();
	        }
	        org.apache.axis.client.Call _call = createCall();
	        _call.setOperation(_operations[51]);
	        _call.setUseSOAPAction(true);
	        _call.setSOAPActionURI("");
	        _call.setEncodingStyle(null);
	        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
	        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
	        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
	        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoConfirmFutrueOrder"));

	        setRequestHeaders(_call);
	        setAttachments(_call);
	 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

	        if (_resp instanceof java.rmi.RemoteException) {
	            throw (java.rmi.RemoteException)_resp;
	        }
	        else {
	            extractAttachments(_call);
	            try {
	                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SconfirmOrderResp) _resp;
	            } catch (java.lang.Exception _exception) {
	                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SconfirmOrderResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.SconfirmOrderResp.class);
	            }
	        }
	  } catch (org.apache.axis.AxisFault axisFaultException) {
	  throw axisFaultException;
	}
	    }

}
