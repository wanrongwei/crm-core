/**
 * IImsQueryServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
public class IImsQueryServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.IImsQueryServiceWs {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    private static transient Log log = LogFactory.getLog(IImsQueryServiceSoapBindingStub.class);

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[25];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryDDFee");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SQueryDDFeeReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryDDFeeReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryDDFeeReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryDDFeeResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryDDFeeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_querySharingPromotion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "querySharePromReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQuerySharePromReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQuerySharePromReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQuerySharingPromotionResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQuerySharingPromotionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_queryGroupInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sQueryGroupReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryGroupReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryGroupReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryGroupInfoResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryGroupInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryMaxFreeResource");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "queryMaxFreeResourceReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryMaxFreeResourceReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryMaxFreeResourceReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryMaxFreeResourceResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryMaxFreeResourceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryAcctStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "acctStatusParamReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.AcctStatusParamReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "acctStatusResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.AcctStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryPCRFInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "doQueryPCRFInfoReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryPCRFInfoReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryPCRFInfoReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryPCRFInfoResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryPCRFInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryPayChannel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "acctId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryPayChannelResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryPayChannelResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_queryVpnNumber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sQueryVpnNumberReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryVpnNumberReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryVpnNumberReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryVpnNumberResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryVpnNumberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_queryBusiSuccess");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "qryBusiSuccess"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryBusiSuccessReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QueryBusiSuccessReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryBusiSuccessResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryBusiSuccessResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_queryUsersByBssbroker");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sQueryUsersByBssReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryUsersByBssReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryUsersByBssReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryUsersByBssResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryUsersByBssResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryNotificationFlag");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryNotifyFlagReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryNotifyFlagReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryNotifyFlagResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryNotifyFlagResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_queryProdState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryProdState"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryProdState.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryProdStateResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryProdStateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_queryGroupMembers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "queryGroupMembersReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryGroupMembersReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QueryGroupMembersReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryGroupMembersResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryGroupMembersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryBillDetail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryBillDetailReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryBillDetailReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryBillDetailResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QueryBillDetailResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoNetaxeptQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "doNetaxeptQueryReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doNetaxeptQueryReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoNetaxeptQueryReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doNetaxeptQueryResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoNetaxeptQueryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryProdCycleInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "doQueryProdCycleInfoReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryProdCycleInfoReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryProdCycleInfoReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryProdCycleInfoResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryProdCycleInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_queryMemberInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sQueryGroupMemberReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryGroupMemberReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryGroupMemberReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryMemberInfoResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryMemberInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_queryServiceState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQuerySrvStateReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQuerySrvStateReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryServiceStateResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryServiceStateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_queryFN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "queryFnReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryFnReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QueryFnReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "oneTimeFee"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFee"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.OneTimeFee.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryFNResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryFNResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_querySuppressNotification");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "querySuppressNotificationReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQuerySuppressNotificationReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQuerySuppressNotificationReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQuerySuppressNotificationResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQuerySuppressNotificationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_queryScpProfile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "scpProfileReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "scpProfileReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ScpProfileReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryScpProfileResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryScpProfileResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_queryCallScreen");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "queryCallScreenReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryCallScreenReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QueryCallScreenReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryCallScreenResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryCallScreenResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryPayChannelHis");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "queryPayChannelReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryPaychannelHisReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryPaychannelHisReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryPayChannelHisResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryPayChannelHisResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_qryExemption");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "qryExemptionReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QryExemptionReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQryExemptionResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQryExemptionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryProductBillAttr");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryProductBillAttrReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryProductBillAttrReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryProductBillAttrResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryProductBillAttrResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

    }

    public IImsQueryServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public IImsQueryServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public IImsQueryServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
//            java.lang.Class cls;
//            javax.xml.namespace.QName qName;
//            javax.xml.namespace.QName qName2;
//            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
//            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
//            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
//            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
//            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
//            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
//            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
//            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
//            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
//            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
//            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
//            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
//            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
//            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
//            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
//            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
//            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
//            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "acctNotify");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.AcctNotify.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "acctStatus");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.AcctStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "acctStatusParamReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.AcctStatusParamReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "acctStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.AcctStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "arrayOfPaymentError");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.PaymentError[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "paymentError");
            qName2 = new javax.xml.namespace.QName("", "PaymentError");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "arrayOfTransactionLogLine");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.TransactionLogLine[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "transactionLogLine");
            qName2 = new javax.xml.namespace.QName("", "TransactionLogLine");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "authenticationInformation");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.AuthenticationInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "avtaleGiroInformation");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.AvtaleGiroInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "bankDebitInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.BankDebitInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "baseResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.BaseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "bsBillFormatBean");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.BsBillFormatBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "cardInformation");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CardInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "cbsErrorMsg");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CbsErrorMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "codeValue");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CodeValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "crmBaseResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CrmBaseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "customerInformation");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.CustomerInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "dnBNorDirectPaymentInformation");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DnBNorDirectPaymentInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doNetaxeptQueryReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoNetaxeptQueryReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doNetaxeptQueryResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoNetaxeptQueryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQryExemptionResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQryExemptionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryBillDetailReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryBillDetailReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryBusiSuccessResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryBusiSuccessResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryCallScreenResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryCallScreenResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryDDFeeResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryDDFeeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryFNResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryFNResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryGroupInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryGroupInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryGroupMembersResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryGroupMembersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryMaxFreeResourceResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryMaxFreeResourceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryMemberInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryMemberInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryNotifyFlagResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryNotifyFlagResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryPaychannelHisReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryPaychannelHisReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryPayChannelHisResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryPayChannelHisResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryPayChannelResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryPayChannelResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryPCRFInfoReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryPCRFInfoReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryPCRFInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryPCRFInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryProdCycleInfoReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryProdCycleInfoReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryProdCycleInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryProdCycleInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryProdStateResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryProdStateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryProductBillAttrResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryProductBillAttrResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryScpProfileResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryScpProfileResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryServiceStateResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryServiceStateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQuerySharingPromotionResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQuerySharingPromotionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQuerySuppressNotificationResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQuerySuppressNotificationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryUsersByBssResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryUsersByBssResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryVpnNumberResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryVpnNumberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "exemptionInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ExemptionInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "extendParam");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ExtendParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "extendParamList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ExtendParam[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "extendParam");
            qName2 = new javax.xml.namespace.QName("", "extendParamListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "feeItem");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.FeeItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "feeItemList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.FeeItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "feeItem");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "financialSummary");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.FinancialSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "fn");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.Fn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "fnList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.Fn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "fn");
            qName2 = new javax.xml.namespace.QName("", "fNList_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "fraudAnalysis");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.FraudAnalysis.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResource");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.FreeResource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResourceList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.FreeResource[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResource");
            qName2 = new javax.xml.namespace.QName("", "freeResourceListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "groupandMemberList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.GroupandMemberList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "innerBaseResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.InnerBaseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "invoiceInformation");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.InvoiceInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "maxFreeResource");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.MaxFreeResource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "maxFreeResourceList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.MaxFreeResource[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "maxFreeResource");
            qName2 = new javax.xml.namespace.QName("", "maxFreeResourceList_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "mobileInformation");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.MobileInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "netaxeptPaymentInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.NetaxeptPaymentInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "netaxeptQueryRequest");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.NetaxeptQueryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "notify");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.Notify.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFee");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.OneTimeFee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "orderInformation");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.OrderInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "payChannelHisInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.PayChannelHisInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "paymentError");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.PaymentError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "pccRule");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.PccRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "pcrfInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.PcrfInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "phoneNotify");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.PhoneNotify.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "prodStateResult");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ProdStateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "prodStateResultList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ProdStateResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "prodStateResult");
            qName2 = new javax.xml.namespace.QName("", "productState");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "productFN");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ProductFN.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "productFNList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ProductFN[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "productFN");
            qName2 = new javax.xml.namespace.QName("", "productFN");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "qryExemptionReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QryExemptionReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryBillDetailResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QueryBillDetailResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryBusiSuccessReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QueryBusiSuccessReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryCallScreenReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QueryCallScreenReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryFnReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QueryFnReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryGroupMembersReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QueryGroupMembersReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QueryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "recurring");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.Recurring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "responseHead");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ResponseHead.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBillCycle");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SBillCycle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCallScreenNo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SCallScreenNo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCallScreenNoList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SCallScreenNo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCallScreenNo");
            qName2 = new javax.xml.namespace.QName("", "sCallScreenNoList_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "scpProfileReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ScpProfileReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "securityInformation");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SecurityInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "serviceStateResult");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ServiceStateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "serviceStateResultList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ServiceStateResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "serviceStateResult");
            qName2 = new javax.xml.namespace.QName("", "serviceState");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sGroup");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sGroupList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SGroup[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sGroup");
            qName2 = new javax.xml.namespace.QName("", "group_items");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sMember");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SMember.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sMemberList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SMember[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sMember");
            qName2 = new javax.xml.namespace.QName("", "sMemberList_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sOrderField");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SOrderField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPage");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SPage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "specialNumber");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SpecialNumber.class;
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
//            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
//            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
//            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
//            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
//            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
//            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
//            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
//            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "specialNumberList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SpecialNumber[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "specialNumber");
            qName2 = new javax.xml.namespace.QName("", "specialNumberList_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrder");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SProductOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrderList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SProductOrder[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrder");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrderOper");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SProductOrderOper.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrderOperList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SProductOrderOper[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrderOper");
            qName2 = new javax.xml.namespace.QName("", "sProductOrderOperList_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductParam");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SProductParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductParamList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SProductParam[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductParam");
            qName2 = new javax.xml.namespace.QName("", "sProductParamListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductRecurringFee");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SProductRecurringFee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryDDFeeReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryDDFeeReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryGroupMemberReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryGroupMemberReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryGroupReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryGroupReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryMaxFreeResourceReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryMaxFreeResourceReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryNotifyFlagReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryNotifyFlagReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryProdState");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryProdState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryProductBillAttrReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryProductBillAttrReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQuerySharePromReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQuerySharePromReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQuerySrvStateReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQuerySrvStateReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQuerySuppressNotificationReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQuerySuppressNotificationReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryUsersByBssReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryUsersByBssReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryVpnNumberReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryVpnNumberReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "subGroup");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SubGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "subGroupList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SubGroup[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "subGroup");
            qName2 = new javax.xml.namespace.QName("", "subGroup_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUser");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SUser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUserAuth");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SUserAuth.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUserLifecycle");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SUserLifecycle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "terminalInformation");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.TerminalInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "transactionLogLine");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.TransactionLogLine.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "userList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SUser[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUser");
            qName2 = new javax.xml.namespace.QName("", "user");
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
        catch (Exception _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryDDFeeResponse doQueryDDFee(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryDDFeeReq SQueryDDFeeReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryDDFee"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, SQueryDDFeeReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryDDFeeResponse) _resp;
            } catch (java.lang.Exception _exception) {
            	log.error("ERROR",_exception);
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryDDFeeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryDDFeeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQuerySharingPromotionResponse do_querySharingPromotion(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQuerySharePromReq querySharePromReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_querySharingPromotion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, querySharePromReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQuerySharingPromotionResponse) _resp;
            } catch (java.lang.Exception _exception) {
            	log.error("ERROR",_exception);
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQuerySharingPromotionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQuerySharingPromotionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryGroupInfoResponse do_queryGroupInfo(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryGroupReq sQueryGroupReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_queryGroupInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sQueryGroupReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryGroupInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
            	log.error("ERROR",_exception);
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryGroupInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryGroupInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryMaxFreeResourceResponse doQueryMaxFreeResource(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryMaxFreeResourceReq queryMaxFreeResourceReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryMaxFreeResource"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, queryMaxFreeResourceReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryMaxFreeResourceResponse) _resp;
            } catch (java.lang.Exception _exception) {
            	log.error("ERROR",_exception);
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryMaxFreeResourceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryMaxFreeResourceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.AcctStatusResponse doQueryAcctStatus(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.AcctStatusParamReq req) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryAcctStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.AcctStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
            	log.error("ERROR",_exception);
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.AcctStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.AcctStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryPCRFInfoResponse doQueryPCRFInfo(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryPCRFInfoReq doQueryPCRFInfoReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryPCRFInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, doQueryPCRFInfoReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryPCRFInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
            	log.error("ERROR",_exception);
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryPCRFInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryPCRFInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryPayChannelResponse doQueryPayChannel(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, java.lang.Long acctId) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryPayChannel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, acctId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryPayChannelResponse) _resp;
            } catch (java.lang.Exception _exception) {
            	log.error("ERROR",_exception);
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryPayChannelResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryPayChannelResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryVpnNumberResponse do_queryVpnNumber(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryVpnNumberReq sQueryVpnNumberReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_queryVpnNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sQueryVpnNumberReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryVpnNumberResponse) _resp;
            } catch (java.lang.Exception _exception) {
            	log.error("ERROR",_exception);
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryVpnNumberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryVpnNumberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryBusiSuccessResponse do_queryBusiSuccess(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QueryBusiSuccessReq qryBusiSuccess) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_queryBusiSuccess"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, qryBusiSuccess});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryBusiSuccessResponse) _resp;
            } catch (java.lang.Exception _exception) {
            	log.error("ERROR",_exception);
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryBusiSuccessResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryBusiSuccessResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryUsersByBssResponse do_queryUsersByBssbroker(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryUsersByBssReq sQueryUsersByBssReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_queryUsersByBssbroker"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sQueryUsersByBssReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryUsersByBssResponse) _resp;
            } catch (java.lang.Exception _exception) {
            	log.error("ERROR",_exception);
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryUsersByBssResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryUsersByBssResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryNotifyFlagResponse doQueryNotificationFlag(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryNotifyFlagReq req) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryNotificationFlag"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryNotifyFlagResponse) _resp;
            } catch (java.lang.Exception _exception) {
            	log.error("ERROR",_exception);
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryNotifyFlagResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryNotifyFlagResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryProdStateResponse do_queryProdState(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryProdState req) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_queryProdState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryProdStateResponse) _resp;
            } catch (java.lang.Exception _exception) {
            	log.error("ERROR",_exception);
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryProdStateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryProdStateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryGroupMembersResponse do_queryGroupMembers(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QueryGroupMembersReq queryGroupMembersReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_queryGroupMembers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, queryGroupMembersReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryGroupMembersResponse) _resp;
            } catch (java.lang.Exception _exception) {
            	log.error("ERROR",_exception);
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryGroupMembersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryGroupMembersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QueryBillDetailResponse doQueryBillDetail(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryBillDetailReq req) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryBillDetail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QueryBillDetailResponse) _resp;
            } catch (java.lang.Exception _exception) {
            	log.error("ERROR",_exception);
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QueryBillDetailResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QueryBillDetailResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoNetaxeptQueryResponse doNetaxeptQuery(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoNetaxeptQueryReq doNetaxeptQueryReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoNetaxeptQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, doNetaxeptQueryReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoNetaxeptQueryResponse) _resp;
            } catch (java.lang.Exception _exception) {
            	log.error("ERROR",_exception);
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoNetaxeptQueryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoNetaxeptQueryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryProdCycleInfoResponse doQueryProdCycleInfo(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryProdCycleInfoReq doQueryProdCycleInfoReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryProdCycleInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, doQueryProdCycleInfoReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryProdCycleInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
            	log.error("ERROR",_exception);
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryProdCycleInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryProdCycleInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryMemberInfoResponse do_queryMemberInfo(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryGroupMemberReq sQueryGroupMemberReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_queryMemberInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sQueryGroupMemberReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryMemberInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
            	log.error("ERROR",_exception);
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryMemberInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryMemberInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryServiceStateResponse do_queryServiceState(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQuerySrvStateReq req) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_queryServiceState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryServiceStateResponse) _resp;
            } catch (java.lang.Exception _exception) {
            	log.error("ERROR",_exception);
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryServiceStateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryServiceStateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryFNResponse do_queryFN(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QueryFnReq queryFnReq, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.OneTimeFee oneTimeFee) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_queryFN"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, queryFnReq, oneTimeFee});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryFNResponse) _resp;
            } catch (java.lang.Exception _exception) {
            	log.error("ERROR",_exception);
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryFNResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryFNResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQuerySuppressNotificationResponse do_querySuppressNotification(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQuerySuppressNotificationReq querySuppressNotificationReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_querySuppressNotification"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, querySuppressNotificationReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQuerySuppressNotificationResponse) _resp;
            } catch (java.lang.Exception _exception) {
            	log.error("ERROR",_exception);
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQuerySuppressNotificationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQuerySuppressNotificationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryScpProfileResponse do_queryScpProfile(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.ScpProfileReq scpProfileReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_queryScpProfile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, scpProfileReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryScpProfileResponse) _resp;
            } catch (java.lang.Exception _exception) {
            	log.error("ERROR",_exception);
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryScpProfileResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryScpProfileResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryCallScreenResponse do_queryCallScreen(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QueryCallScreenReq queryCallScreenReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_queryCallScreen"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, queryCallScreenReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryCallScreenResponse) _resp;
            } catch (java.lang.Exception _exception) {
            	log.error("ERROR",_exception);
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryCallScreenResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryCallScreenResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryPayChannelHisResponse doQueryPayChannelHis(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryPaychannelHisReq queryPayChannelReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryPayChannelHis"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, queryPayChannelReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryPayChannelHisResponse) _resp;
            } catch (java.lang.Exception _exception) {
            	log.error("ERROR",_exception);
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryPayChannelHisResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryPayChannelHisResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQryExemptionResponse do_qryExemption(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.QryExemptionReq req) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_qryExemption"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQryExemptionResponse) _resp;
            } catch (java.lang.Exception _exception) {
            	log.error("ERROR",_exception);
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQryExemptionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQryExemptionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryProductBillAttrResponse doQueryProductBillAttr(com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.SQueryProductBillAttrReq req) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryProductBillAttr"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryProductBillAttrResponse) _resp;
            } catch (java.lang.Exception _exception) {
            	log.error("ERROR",_exception);
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryProductBillAttrResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imswrapqueryservice.DoQueryProductBillAttrResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
