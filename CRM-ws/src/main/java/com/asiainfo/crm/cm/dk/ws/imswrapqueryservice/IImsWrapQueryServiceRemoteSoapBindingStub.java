/**
 * IImsWrapQueryServiceRemoteSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imswrapqueryservice;

import java.rmi.RemoteException;

public class IImsWrapQueryServiceRemoteSoapBindingStub extends org.apache.axis.client.Stub implements com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.IImsWrapQueryServiceWs {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[42];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryTransactionFee");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "queryTransactionFeeReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryTransactionFeeReq"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryTransactionFeeReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryTransactionfeeResp"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryTransactionfeeResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_queryReguideInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "queryReguideReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryReguideReq"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryReguideReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryReguideInfoResp"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryReguideInfoResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryNotifyHis");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryNotificationHisReq"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryNotificationHisReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryNotifyHisResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryNotifyHisResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_queryCapMax");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sQueryCapMaxReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryCapMaxReq"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryCapMaxReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryCapMaxResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryCapMaxResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_queryBillExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sQueryBillExtReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryBillExt"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryBillExt.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billinfoList"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.Billinfo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "billinfoListItem"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryAllowance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryAllowanceReq"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryAllowanceReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryAllowanceResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryAllowanceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_clearDbAndMdbData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "clearDataReq"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ClearDataReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryAgentBalance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "doQueryAgentBalanceReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryAgentBalanceReq"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryAgentBalanceReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryAgentBalanceResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryAgentBalanceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryBillXml");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryBillXmlReq"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryBillXmlReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryBillXmlResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryBillXmlResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_queryAutoTopUp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "queryAutoTopUpReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryAutoTopUpReq"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryAutoTopUpReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "oneTimeFee"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFee"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.OneTimeFee.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryAutoTopUpResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryAutoTopUpResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_queryMainPhoneByAcctId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "queryMainPhoneByAcctIdReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryMainPhoneByAcctIdReq"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryMainPhoneByAcctIdReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryMainPhoneByAcctIdResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryMainPhoneByAcctIdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryBillEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "qryBillForOSEInReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "qryBillForOSEInReq"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QryBillForOSEInReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryBillExResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryBillExResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryWorkLog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "queryWorkLogReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryWorkLogReq"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryWorkLogReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryWorkLogResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryWorkLogResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryDeposit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sMngQueryDepositReq"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SMngQueryDepositReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doSMngQueryDepositResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoSMngQueryDepositResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryInvoiceAttribute");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryInvoiceAttributeReq"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryInvoiceAttributeReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryInvoiceAttributeResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryInvoiceAttributeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryCDR");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sQueryCDRReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryCDRReq"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryCDRReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryCDRResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryCDRResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "queryTypeList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryTypeList"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryType[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "queryTypeItem"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "queryParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryParam"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryParam.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryTermBalance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "termQueryParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "termQueryParam"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.TermQueryParam.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "oneTimeFee"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFee"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.OneTimeFee.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryTermBalanceResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryTermBalanceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_QueryAccountInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "queryTypeList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryTypeList"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryType[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "queryTypeItem"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "queryParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryAccountInfoParam"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryAccountInfoParam.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryAccountInfoResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryAccountInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryCDRFile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sQueryCDRReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryCDRReq"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryCDRReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryCDRFileResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryCDRFileResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryDebitData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "getDebitDataRequest"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.GetDebitDataRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "getDebitDataResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.GetDebitDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_queryNtCdr");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sQueryNtCdrReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryNtCdrReq"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryNtCdrReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryNtCdrResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryNtCdrResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_queryAbmData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryAbmDataReq"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryAbmDataReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryMdbDataResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryMdbDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryOrderInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "doqueryOrderInfoReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryOrderInfoReq"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryOrderInfoReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryOrderInfoResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryOrderInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryAcctDetailByCust");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryAcctDetailByCustReq"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryAcctDetailByCustReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryAcctDetailByCustResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryAcctDetailByCustResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoGetCaInvIndex");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sgetCaInvIndexReq"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SgetCaInvIndexReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doGetCaInvIndexResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoGetCaInvIndexResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_queryBillingStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "qryBillStsReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQryBillStsReq"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQryBillStsReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryBillingStatusResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryBillingStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryCDRSum");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sQueryCDRSumReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryCDRSumReq"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryCDRSumReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryCDRSumResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryCDRSumResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryLedger");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryledgerInReq"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryledgerInReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryLedgerResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryLedgerResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryProductCharge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQryProdChargeInListReq"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQryProdChargeIn[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "sQryProdChargeInListItem"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryProductChargeResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryProductChargeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryInstallmentInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SQueryInstallmentInfoReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryInstallmentInfoReq"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryInstallmentInfoReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryInstallmenInfoResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryInstallmenInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_queryMdbData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryMdbDataReq"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryMdbDataReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryMdbDataResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryMdbDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryBillAmount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "queryBillAmountParam"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryBillAmountParam"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryBillAmountParam.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billAmountResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.BillAmountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryAgentDeposit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "doQueryAgentDepositReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryAgentDepositReq"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryAgentDepositReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryAgentDepositResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryAgentDepositResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_queryGraph");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryGraphReq"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryGraphReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryGraphResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryGraphResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryPoint");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SQryPointInfoReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQryPointInfoReq"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQryPointInfoReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryPointInfoResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryPointInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryTax");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryTaxReq"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryTaxReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryTaxResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryTaxResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryAcctInfoForPay");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryAcctInfoForPayReq"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryAcctInfoForPayReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryAcctInfoForPayResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryAcctInfoForPayResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryRecurringAndOnetimeFee");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "queryRecurringFeeReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryRecurringAndOnetimeFeeReq"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryRecurringAndOnetimeFeeReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryRecurringfeeOnetimefeeResp"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryRecurringfeeOnetimefeeResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_queryLostBalance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "queryLostBalanceReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryLostBalanceReq"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryLostBalanceReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryLostBalanceResponce"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryLostBalanceResponce.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryPayInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryPayInfoReq"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryPayInfoReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryPayInfoResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryPayInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_queryInvoiceInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sQueryInvoiceInfoReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryInvoiceInfoReq"), com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryInvoiceInfoReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryInvoiceInfoResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryInvoiceInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

    }

    public IImsWrapQueryServiceRemoteSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public IImsWrapQueryServiceRemoteSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public IImsWrapQueryServiceRemoteSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "accumulate");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.Accumulate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "accumulateList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.Accumulate[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "accumulate");
            qName2 = new javax.xml.namespace.QName("", "accumulateListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "actualUsage");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ActualUsage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "actualUsageList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ActualUsage[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "actualUsage");
            qName2 = new javax.xml.namespace.QName("", "actualUsageListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "adjustLog");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.AdjustLog.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "adjustLogList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.AdjustLog[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "adjustLog");
            qName2 = new javax.xml.namespace.QName("", "adjustLogListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "assetChgIn");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.AssetChgIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "autoTopUpQryResult");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.AutoTopUpQryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "autoTopUpQryResultList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.AutoTopUpQryResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "autoTopUpQryResult");
            qName2 = new javax.xml.namespace.QName("", "autoTopUpQryResultList_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "bankDebitInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.BankDebitInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "baseQueryReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.BaseQueryReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "baseResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.BaseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billAmountResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.BillAmountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billDetail");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.BillDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billDetailList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.BillDetail[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billDetail");
            qName2 = new javax.xml.namespace.QName("", "billDetailListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billinfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.Billinfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billinfoList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.Billinfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billinfo");
            qName2 = new javax.xml.namespace.QName("", "billinfoListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billItem");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.BillItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billItemList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.BillItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billItem");
            qName2 = new javax.xml.namespace.QName("", "billItemListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billNodeTree");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.BillNodeTree.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billUsage");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.BillUsage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billUsageItem");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.BillUsageItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billUsageItemList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.BillUsageItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "billUsageItem");
            qName2 = new javax.xml.namespace.QName("", "billUsageItemListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "budgetControl");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.BudgetControl.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "budgetList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.BudgetControl[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "budgetControl");
            qName2 = new javax.xml.namespace.QName("", "budgetListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "busiSpecId");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.BusiSpecId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "busiSpecIdList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.BusiSpecId[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "busiSpecId");
            qName2 = new javax.xml.namespace.QName("", "busiSpecIdItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "byUsageCondition");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ByUsageCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caBillProd");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CaBillProd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caBillProdList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CaBillProd[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caBillProd");
            qName2 = new javax.xml.namespace.QName("", "caBillProdListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caBillTax");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CaBillTax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caBillTaxList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CaBillTax[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caBillTax");
            qName2 = new javax.xml.namespace.QName("", "caBillTaxListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caFileStorage");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CaFileStorage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "callDetail");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CallDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "callDetailList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CallDetail[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "callDetail");
            qName2 = new javax.xml.namespace.QName("", "callDetailItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "callDetailRecord");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CallDetailRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "callDetailRecordList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CallDetailRecordList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "callDetailSumRecord");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CallDetailSumRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "callUsageCondition");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CallUsageCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "capMaxAccumulate");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CapMaxAccumulate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "capMaxAccumulateList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CapMaxAccumulate[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "capMaxAccumulate");
            qName2 = new javax.xml.namespace.QName("", "capMaxAccumulateList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "capMaxControl");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CapMaxControl.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "capMaxControlList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CapMaxControl[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "capMaxControl");
            qName2 = new javax.xml.namespace.QName("", "capMaxControlListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "cbsErrorMsg");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CbsErrorMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "cdrDisplay");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "stringList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "clearDataReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ClearDataReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "creditLimit");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CreditLimit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "creditLimitList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CreditLimit[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "creditLimit");
            qName2 = new javax.xml.namespace.QName("", "creditLimitListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "crmBaseResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.CrmBaseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doGetCaInvIndexResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoGetCaInvIndexResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryAcctDetailByCustReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryAcctDetailByCustReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryAcctDetailByCustResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryAcctDetailByCustResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryAgentBalanceReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryAgentBalanceReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryAgentBalanceResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryAgentBalanceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryAgentDepositReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryAgentDepositReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryAgentDepositResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryAgentDepositResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryAllowanceReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryAllowanceReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryAutoTopUpResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryAutoTopUpResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryBillExResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryBillExResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryBillingStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryBillingStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryCapMaxResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryCapMaxResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryCDRFileResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryCDRFileResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryCDRResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryCDRResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryCDRSumResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryCDRSumResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryGraphResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryGraphResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryInstallmenInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryInstallmenInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryInvoiceInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryInvoiceInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryLedgerResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryLedgerResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryLostBalanceReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryLostBalanceReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryLostBalanceResponce");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryLostBalanceResponce.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryMdbDataResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryMdbDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryNotifyHisResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryNotifyHisResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryNtCdrResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryNtCdrResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryOrderInfoReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryOrderInfoReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryOrderInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryOrderInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryPayChannelResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryPayChannelResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryPayInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryPayInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryPointInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryPointInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryRecurringfeeOnetimefeeResp");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryRecurringfeeOnetimefeeResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryReguideInfoResp");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryReguideInfoResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryTaxReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryTaxReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryTaxResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryTaxResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryTermBalanceResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryTermBalanceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryTransactionfeeResp");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryTransactionfeeResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryWorkLogResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryWorkLogResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doSMngQueryDepositResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoSMngQueryDepositResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "extendParam");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ExtendParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "extendParamList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ExtendParam[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "extendParam");
            qName2 = new javax.xml.namespace.QName("", "extendParamListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "feeItem");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.FeeItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "feeItemList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.FeeItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "feeItem");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResource");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.FreeResource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResourceGroup");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.FreeResourceGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResourceGroupList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.FreeResourceGroup[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResourceGroup");
            qName2 = new javax.xml.namespace.QName("", "freeResourceGroupItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResourceList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.FreeResource[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResource");
            qName2 = new javax.xml.namespace.QName("", "freeResourceListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResourceLog");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.FreeResourceLog.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "getDebitDataRequest");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.GetDebitDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "getDebitDataResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.GetDebitDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "highestTransactionGroup");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.HighestTransactionGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "hybridBusiService");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.HybridBusiService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

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
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "hybridBusiServiceList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.HybridBusiService[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "hybridBusiService");
            qName2 = new javax.xml.namespace.QName("", "hybridBusiServiceItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "imsAgentDepositQueryResult");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ImsAgentDepositQueryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "imsPocketOut");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ImsPocketOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "innerBaseResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.InnerBaseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "installmentInfoDtl");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.InstallmentInfoDtl.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "invoiceInfoResult");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.InvoiceInfoResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "longestCallingSecondsGroup");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.LongestCallingSecondsGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "maxFreeResourceLog");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.MaxFreeResourceLog.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "maxFreeResourceLogList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.MaxFreeResourceLog[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "maxFreeResourceLog");
            qName2 = new javax.xml.namespace.QName("", "maxFreeResourceLogItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "mdbEntity");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.MdbEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "negativeBalanceLog");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.NegativeBalanceLog.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "negativeBalLogList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.NegativeBalanceLog[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "negativeBalanceLog");
            qName2 = new javax.xml.namespace.QName("", "negativeBalLogItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "notificationHistory");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.NotificationHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "notificationHistoryList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.NotificationHistory[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "notificationHistory");
            qName2 = new javax.xml.namespace.QName("", "notificationHistory");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFee");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.OneTimeFee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFeeList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.OneTimeFee[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFee");
            qName2 = new javax.xml.namespace.QName("", "oneTimeFeeListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "paymentLog");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.PaymentLog.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "paymentLogList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.PaymentLog[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "paymentLog");
            qName2 = new javax.xml.namespace.QName("", "paymentLogListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "paymentServiceItem");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.PaymentServiceItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "paymentServiceItemList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.PaymentServiceItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "paymentServiceItem");
            qName2 = new javax.xml.namespace.QName("", "paymentServiceItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "plan");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.Plan.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "qryBillForOSEInReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QryBillForOSEInReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "qryPointOut");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QryPointOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryAcctInfoForPayReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryAcctInfoForPayReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryAcctInfoForPayResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryAcctInfoForPayResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryAllowanceResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryAllowanceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryAutoTopUpReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryAutoTopUpReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryBillAmountParam");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryBillAmountParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryBillXmlReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryBillXmlReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryBillXmlResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryBillXmlResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryCDRType");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryCDRType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryCDRTypeList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryCDRType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryCDRType");
            qName2 = new javax.xml.namespace.QName("", "queryCDRTypeItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryInvoiceAttributeReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryInvoiceAttributeReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryInvoiceAttributeResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryInvoiceAttributeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryMainPhoneByAcctIdReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryMainPhoneByAcctIdReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryMainPhoneByAcctIdResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryMainPhoneByAcctIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryProductChargeResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryProductChargeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryType");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryTypeList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryType");
            qName2 = new javax.xml.namespace.QName("", "queryTypeItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryWorkLogReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryWorkLogReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "realTimeCallCharge");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RealTimeCallCharge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "realTimeCallChargeList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RealTimeCallCharge[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "realTimeCallCharge");
            qName2 = new javax.xml.namespace.QName("", "realTimeCallChargeListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "rechargeLog");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RechargeLog.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "rechargeLogList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RechargeLog[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "rechargeLog");
            qName2 = new javax.xml.namespace.QName("", "rechargeLogListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "recurringOnetimeFee");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RecurringOnetimeFee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "recurringOnetimeFeeList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RecurringOnetimeFee[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "recurringOnetimeFee");
            qName2 = new javax.xml.namespace.QName("", "recurringOnetimeFeeItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "reguideAcctInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ReguideAcctInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "reguideAcctInfoList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ReguideAcctInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "reguideAcctInfo");
            qName2 = new javax.xml.namespace.QName("", "reguideAcctInfoList_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "reguideDtlInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ReguideDtlInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "reguideDtlInfoList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ReguideDtlInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "reguideDtlInfo");
            qName2 = new javax.xml.namespace.QName("", "reguideDtlInfoList_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "reguideInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ReguideInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "reguideInfoList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ReguideInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "reguideInfo");
            qName2 = new javax.xml.namespace.QName("", "reguideInfoList_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "reguideItemInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ReguideItemInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "reguideItemInfoList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ReguideItemInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "reguideItemInfo");
            qName2 = new javax.xml.namespace.QName("", "reguideItemInfoList_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "responseHead");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ResponseHead.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAccount");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SAccount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sacctDetailByCustBean");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SacctDetailByCustBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAllowanceOfferUsage");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SAllowanceOfferUsage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAllowanceRec");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SAllowanceRec.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAllowanceRecDetail");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SAllowanceRecDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAllowanceUsage");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SAllowanceUsage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBalance");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SBalance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBalanceList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SBalance[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBalance");
            qName2 = new javax.xml.namespace.QName("", "sBalanceListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBillCycle");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SBillCycle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBillingAddressInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SBillingAddressInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBusiService");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SBusiService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBusiServiceList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SBusiService[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBusiService");
            qName2 = new javax.xml.namespace.QName("", "busiServiceList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCaInvIndex");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SCaInvIndex.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sChangeCustomInvReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SChangeCustomInvReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sContact");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SContact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCustomer");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SCustomer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCustomInv");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SCustomInv.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCustomInvDtl");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SCustomInvDtl.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sDiscountInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SDiscountInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "serviceType");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "serviceTypeList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ServiceType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "serviceType");
            qName2 = new javax.xml.namespace.QName("", "serviceType_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sFreeResource");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SFreeResource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sgetCaInvIndexReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SgetCaInvIndexReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sInstalOffer");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SInstalOffer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sMngQueryDepositReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SMngQueryDepositReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sNegativeBalance");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SNegativeBalance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sNegativeBalanceList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SNegativeBalance[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sNegativeBalance");
            qName2 = new javax.xml.namespace.QName("", "sNegativeBalanceItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sOfferFee");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SOfferFee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sOfferInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SOfferInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sOrderField");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SOrderField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sOrderInfoOut");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SOrderInfoOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPage");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SPage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPayChannel");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SPayChannel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPayChannelList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SPayChannel[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPayChannel");
            qName2 = new javax.xml.namespace.QName("", "sPayChannelListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPocket");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SPocket.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPocketList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SPocket[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPocket");
            qName2 = new javax.xml.namespace.QName("", "sPocketList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "spoints");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.Spoints.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProdCharge");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SProdCharge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrder");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SProductOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrderList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SProductOrder[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrder");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductParam");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SProductParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductParamList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SProductParam[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductParam");
            qName2 = new javax.xml.namespace.QName("", "sProductParamListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductRecurringFee");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SProductRecurringFee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQryBillStsReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQryBillStsReq.class;
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
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQryOrderIn");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQryOrderIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQryOrderOut");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQryOrderOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQryPointInfoReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQryPointInfoReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQryProdChargeIn");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQryProdChargeIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQryProdChargeInListReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQryProdChargeIn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQryProdChargeIn");
            qName2 = new javax.xml.namespace.QName("", "sQryProdChargeInListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryAbmDataReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryAbmDataReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryAccountInfoParam");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryAccountInfoParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryAccountInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryAccountInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryBillExt");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryBillExt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryBudgetReq");
            cachedSerQNames.add(qName);
            cls = long[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
            qName2 = new javax.xml.namespace.QName("", "productList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryCapMaxReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryCapMaxReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryCDRReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryCDRReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryCDRSumReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryCDRSumReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryFreeTimes");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryFreeTimes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryGraphQueryTypeList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryGraphQueryTypeList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryGraphReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryGraphReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryHisBillInfoReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryHisBillInfoReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryInstallmentInfoReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryInstallmentInfoReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryInvoiceInfoReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryInvoiceInfoReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryledgerInReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryledgerInReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryLedgerOut");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryLedgerOut.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryMdbDataReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryMdbDataReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryNotificationHisReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryNotificationHisReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryNtCdrReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryNtCdrReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryParam");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryPayInfoReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryPayInfoReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryRecurringAndOnetimeFeeReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryRecurringAndOnetimeFeeReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryReguideReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryReguideReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryTaxFee");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryTaxFee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryTaxFeeList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryTaxFee[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryTaxFee");
            qName2 = new javax.xml.namespace.QName("", "sQueryTaxFee");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryTransactionFeeReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryTransactionFeeReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sReplyInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SReplyInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sTaxFee");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.STaxFee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sTaxFeeList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.STaxFee[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sTaxFee");
            qName2 = new javax.xml.namespace.QName("", "sTaxFee");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "subActualUsage");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SubActualUsage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "subscriberExempt");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SubscriberExempt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUser");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SUser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUserAuth");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SUserAuth.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUserLifecycle");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SUserLifecycle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUserStatus");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SUserStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "termQueryParam");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.TermQueryParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "threshold");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.Threshold.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "thresholdList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.Threshold[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "threshold");
            qName2 = new javax.xml.namespace.QName("", "thresholdListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "transferLog");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.TransferLog.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "transferLogList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.TransferLog[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "transferLog");
            qName2 = new javax.xml.namespace.QName("", "transferLogListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

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
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryTransactionfeeResp doQueryTransactionFee(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryTransactionFeeReq queryTransactionFeeReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryTransactionFee"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, queryTransactionFeeReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryTransactionfeeResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryTransactionfeeResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryTransactionfeeResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryReguideInfoResp do_queryReguideInfo(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryReguideReq queryReguideReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_queryReguideInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, queryReguideReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryReguideInfoResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryReguideInfoResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryReguideInfoResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryNotifyHisResponse doQueryNotifyHis(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryNotificationHisReq req) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryNotifyHis"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryNotifyHisResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryNotifyHisResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryNotifyHisResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryCapMaxResponse do_queryCapMax(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryCapMaxReq sQueryCapMaxReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_queryCapMax"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sQueryCapMaxReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryCapMaxResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryCapMaxResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryCapMaxResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.Billinfo[] do_queryBillExt(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryBillExt sQueryBillExtReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_queryBillExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sQueryBillExtReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.Billinfo[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.Billinfo[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.Billinfo[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryAllowanceResponse doQueryAllowance(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryAllowanceReq req) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryAllowance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryAllowanceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryAllowanceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryAllowanceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void do_clearDbAndMdbData(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.ClearDataReq req) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_clearDbAndMdbData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryAgentBalanceResponse doQueryAgentBalance(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryAgentBalanceReq doQueryAgentBalanceReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryAgentBalance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, doQueryAgentBalanceReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryAgentBalanceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryAgentBalanceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryAgentBalanceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryBillXmlResponse doQueryBillXml(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryBillXmlReq req) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryBillXml"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryBillXmlResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryBillXmlResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryBillXmlResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryAutoTopUpResponse do_queryAutoTopUp(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryAutoTopUpReq queryAutoTopUpReq, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.OneTimeFee oneTimeFee) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_queryAutoTopUp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, queryAutoTopUpReq, oneTimeFee});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryAutoTopUpResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryAutoTopUpResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryAutoTopUpResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryMainPhoneByAcctIdResponse do_queryMainPhoneByAcctId(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryMainPhoneByAcctIdReq queryMainPhoneByAcctIdReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_queryMainPhoneByAcctId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, queryMainPhoneByAcctIdReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryMainPhoneByAcctIdResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryMainPhoneByAcctIdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryMainPhoneByAcctIdResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryBillExResponse doQueryBillEx(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QryBillForOSEInReq qryBillForOSEInReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryBillEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, qryBillForOSEInReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryBillExResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryBillExResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryBillExResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryWorkLogResponse doQueryWorkLog(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryWorkLogReq queryWorkLogReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryWorkLog"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, queryWorkLogReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryWorkLogResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryWorkLogResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryWorkLogResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoSMngQueryDepositResponse doQueryDeposit(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SMngQueryDepositReq req) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryDeposit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoSMngQueryDepositResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoSMngQueryDepositResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoSMngQueryDepositResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryInvoiceAttributeResponse doQueryInvoiceAttribute(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryInvoiceAttributeReq req) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryInvoiceAttribute"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryInvoiceAttributeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryInvoiceAttributeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryInvoiceAttributeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryCDRResponse doQueryCDR(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryCDRReq sQueryCDRReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryCDR"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sQueryCDRReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryCDRResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryCDRResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryCDRResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryResponse doQuery(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryType[] queryTypeList, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryParam queryParam) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, queryTypeList, queryParam});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryTermBalanceResponse doQueryTermBalance(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.TermQueryParam termQueryParam, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.OneTimeFee oneTimeFee) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryTermBalance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, termQueryParam, oneTimeFee});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryTermBalanceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryTermBalanceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryTermBalanceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryAccountInfoResponse do_QueryAccountInfo(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryType[] queryTypeList, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryAccountInfoParam queryParam) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_QueryAccountInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, queryTypeList, queryParam});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryAccountInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryAccountInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryAccountInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryCDRFileResponse doQueryCDRFile(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryCDRReq sQueryCDRReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryCDRFile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sQueryCDRReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryCDRFileResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryCDRFileResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryCDRFileResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.GetDebitDataResponse doQueryDebitData(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.GetDebitDataRequest req) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryDebitData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.GetDebitDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.GetDebitDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.GetDebitDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryNtCdrResponse do_queryNtCdr(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryNtCdrReq sQueryNtCdrReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_queryNtCdr"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sQueryNtCdrReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryNtCdrResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryNtCdrResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryNtCdrResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryMdbDataResponse do_queryAbmData(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryAbmDataReq req) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_queryAbmData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryMdbDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryMdbDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryMdbDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryOrderInfoResponse doQueryOrderInfo(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryOrderInfoReq doqueryOrderInfoReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryOrderInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, doqueryOrderInfoReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryOrderInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryOrderInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryOrderInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryAcctDetailByCustResponse doQueryAcctDetailByCust(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryAcctDetailByCustReq req) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryAcctDetailByCust"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryAcctDetailByCustResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryAcctDetailByCustResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryAcctDetailByCustResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoGetCaInvIndexResponse doGetCaInvIndex(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SgetCaInvIndexReq req) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoGetCaInvIndex"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoGetCaInvIndexResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoGetCaInvIndexResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoGetCaInvIndexResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryBillingStatusResponse do_queryBillingStatus(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQryBillStsReq qryBillStsReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_queryBillingStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, qryBillStsReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryBillingStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryBillingStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryBillingStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryCDRSumResponse doQueryCDRSum(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryCDRSumReq sQueryCDRSumReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryCDRSum"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sQueryCDRSumReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryCDRSumResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryCDRSumResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryCDRSumResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryLedgerResponse doQueryLedger(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryledgerInReq req) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryLedger"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryLedgerResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryLedgerResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryLedgerResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryProductChargeResponse doQueryProductCharge(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQryProdChargeIn[] req) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryProductCharge"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryProductChargeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryProductChargeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryProductChargeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryInstallmenInfoResponse doQueryInstallmentInfo(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryInstallmentInfoReq SQueryInstallmentInfoReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryInstallmentInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, SQueryInstallmentInfoReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryInstallmenInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryInstallmenInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryInstallmenInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryMdbDataResponse do_queryMdbData(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryMdbDataReq req) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_queryMdbData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryMdbDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryMdbDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryMdbDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.BillAmountResponse doQueryBillAmount(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryBillAmountParam queryBillAmountParam) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryBillAmount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, queryBillAmountParam});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.BillAmountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.BillAmountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.BillAmountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryAgentDepositResponse doQueryAgentDeposit(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryAgentDepositReq doQueryAgentDepositReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryAgentDeposit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, doQueryAgentDepositReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryAgentDepositResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryAgentDepositResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryAgentDepositResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryGraphResponse do_queryGraph(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryGraphReq req) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_queryGraph"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryGraphResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryGraphResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryGraphResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryPointInfoResponse doQueryPoint(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQryPointInfoReq SQryPointInfoReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryPoint"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, SQryPointInfoReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryPointInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryPointInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryPointInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryTaxResponse doQueryTax(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryTaxReq req) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryTax"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryTaxResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryTaxResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryTaxResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryAcctInfoForPayResponse doQueryAcctInfoForPay(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryAcctInfoForPayReq req) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryAcctInfoForPay"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryAcctInfoForPayResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryAcctInfoForPayResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.QueryAcctInfoForPayResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryRecurringfeeOnetimefeeResp doQueryRecurringAndOnetimeFee(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryRecurringAndOnetimeFeeReq queryRecurringFeeReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryRecurringAndOnetimeFee"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, queryRecurringFeeReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryRecurringfeeOnetimefeeResp) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryRecurringfeeOnetimefeeResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryRecurringfeeOnetimefeeResp.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryLostBalanceResponce do_queryLostBalance(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryLostBalanceReq queryLostBalanceReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_queryLostBalance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, queryLostBalanceReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryLostBalanceResponce) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryLostBalanceResponce) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryLostBalanceResponce.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryPayInfoResponse doQueryPayInfo(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryPayInfoReq req) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryPayInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryPayInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryPayInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryPayInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryInvoiceInfoResponse do_queryInvoiceInfo(com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.SQueryInvoiceInfoReq sQueryInvoiceInfoReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_queryInvoiceInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sQueryInvoiceInfoReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryInvoiceInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryInvoiceInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imswrapqueryservice.DoQueryInvoiceInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

	@Override
	public SQueryDeductCondResponse doQueryDeductCond(RequestHead requestHead, SQueryDeductCondRequest req) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QueryTemplateResponse doQueryTemplate(RequestHead requestHead, QueryTemplateReq req) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public STransferTransformRuleResponse doQueryTransferTransformRule(RequestHead requestHead, STransferTransformRuleReq requestBody) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SQueryThrottledResp doQueryThrottled(RequestHead requestHead, SQueryThrottledReq sQueryThrottledReq)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DoQueryRegretDeductInfoResponse doQueryRegretDeductInfo(RequestHead requestHead,
			SQueryRegretInfo queryRegretInfo) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DoQueryRegretStsResponse doQueryRegretSts(RequestHead requestHead, SQueryRegretInfo queryRegretInfo)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SQueryCDRBusiResp doNewQueryCDRBusi(RequestHead requestHead, SQueryCDRBusiReq sQueryCDRBusiReq)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public DoQueryAllowanceDtlResp doQueryAllowanceDtls(RequestHead requestHead, DoQueryAllowanceDtlReq req)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DoQueryAcctStatusmentResp doQueryAccountStatement(RequestHead requestHead, DoQueryAcctStatusmentReq req)
			throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DoQueryAmountResp doQueryAmount(RequestHead requestHead, DoQueryAmountReq req) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
