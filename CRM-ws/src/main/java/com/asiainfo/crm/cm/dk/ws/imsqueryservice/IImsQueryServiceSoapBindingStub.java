/**
 * IImsQueryServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsqueryservice;

import java.rmi.RemoteException;

public class IImsQueryServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.asiainfo.crm.cm.dk.ws.imsqueryservice.IImsQueryServiceWs {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[27];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryPayChannel2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "acctId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryPayChannelResponse2"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryPayChannelResponse2.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryDDFee");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SQueryDDFeeReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryDDFeeReq"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQueryDDFeeReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryDDFeeResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryDDFeeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_querySharingPromotion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "querySharePromReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQuerySharePromReq"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQuerySharePromReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQuerySharingPromotionResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQuerySharingPromotionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_queryGroupInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sQueryGroupReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryGroupReq"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQueryGroupReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryGroupInfoResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryGroupInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryMaxFreeResource");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "queryMaxFreeResourceReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryMaxFreeResourceReq"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQueryMaxFreeResourceReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryMaxFreeResourceResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryMaxFreeResourceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryAcctStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "acctStatusParamReq"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.AcctStatusParamReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "acctStatusResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imsqueryservice.AcctStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryPCRFInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "doQueryPCRFInfoReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryPCRFInfoReq"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryPCRFInfoReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryPCRFInfoResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryPCRFInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryPayChannel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "acctId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), java.lang.Long.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryPayChannelResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryPayChannelResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_queryVpnNumber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sQueryVpnNumberReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryVpnNumberReq"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQueryVpnNumberReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryVpnNumberResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryVpnNumberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_queryBusiSuccess");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "qryBusiSuccess"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryBusiSuccessReq"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.QueryBusiSuccessReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryBusiSuccessResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryBusiSuccessResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_queryUsersByBssbroker");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sQueryUsersByBssReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryUsersByBssReq"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQueryUsersByBssReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryUsersByBssResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryUsersByBssResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryNotificationFlag");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryNotifyFlagReq"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQueryNotifyFlagReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryNotifyFlagResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryNotifyFlagResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_queryProdState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryProdState"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQueryProdState.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryProdStateResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryProdStateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_queryGroupMembers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "queryGroupMembersReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryGroupMembersReq"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.QueryGroupMembersReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryGroupMembersResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryGroupMembersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryBillDetail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryBillDetailReq"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryBillDetailReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryBillDetailResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imsqueryservice.QueryBillDetailResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoNetaxeptQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "doNetaxeptQueryReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doNetaxeptQueryReq"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoNetaxeptQueryReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doNetaxeptQueryResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoNetaxeptQueryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryProdCycleInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "doQueryProdCycleInfoReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryProdCycleInfoReq"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryProdCycleInfoReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryProdCycleInfoResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryProdCycleInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdatePayChannel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "payChannelReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "updatePayChannelReq"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.UpdatePayChannelReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "updatePayChannelResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imsqueryservice.UpdatePayChannelResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_queryServiceState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQuerySrvStateReq"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQuerySrvStateReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryServiceStateResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryServiceStateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_queryMemberInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sQueryGroupMemberReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryGroupMemberReq"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQueryGroupMemberReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryMemberInfoResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryMemberInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_queryFN");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "queryFnReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryFnReq"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.QueryFnReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "oneTimeFee"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFee"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.OneTimeFee.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryFNResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryFNResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_querySuppressNotification");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "querySuppressNotificationReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQuerySuppressNotificationReq"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQuerySuppressNotificationReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQuerySuppressNotificationResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQuerySuppressNotificationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_queryScpProfile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "scpProfileReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "scpProfileReq"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.ScpProfileReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryScpProfileResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryScpProfileResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_queryCallScreen");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "queryCallScreenReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryCallScreenReq"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.QueryCallScreenReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryCallScreenResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryCallScreenResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryPayChannelHis");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "queryPayChannelReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryPaychannelHisReq"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryPaychannelHisReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryPayChannelHisResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryPayChannelHisResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_qryExemption");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "qryExemptionReq"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.QryExemptionReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQryExemptionResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQryExemptionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoQueryProductBillAttr");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryProductBillAttrReq"), com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQueryProductBillAttrReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryProductBillAttrResponse"));
        oper.setReturnClass(com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryProductBillAttrResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

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
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "acctNotify");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.AcctNotify.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "acctStatus");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.AcctStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "acctStatusParamReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.AcctStatusParamReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "acctStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.AcctStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "arrayOfPaymentError");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.PaymentError[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "paymentError");
            qName2 = new javax.xml.namespace.QName("", "PaymentError");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "arrayOfTransactionLogLine");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.TransactionLogLine[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "transactionLogLine");
            qName2 = new javax.xml.namespace.QName("", "TransactionLogLine");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "authenticationInformation");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.AuthenticationInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "avtaleGiroInformation");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.AvtaleGiroInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "bankDebitInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.BankDebitInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "baseResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.BaseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "caPayChannel");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.CaPayChannel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "cardInformation");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.CardInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "cbsErrorMsg");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.CbsErrorMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "codeValue");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.CodeValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "crmBaseResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.CrmBaseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "customerInformation");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.CustomerInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "dataObject");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.DataObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "dnBNorDirectPaymentInformation");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.DnBNorDirectPaymentInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doNetaxeptQueryReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoNetaxeptQueryReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doNetaxeptQueryResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoNetaxeptQueryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQryExemptionResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQryExemptionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryBillDetailReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryBillDetailReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryBusiSuccessResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryBusiSuccessResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryCallScreenResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryCallScreenResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryDDFeeResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryDDFeeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryFNResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryFNResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryGroupInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryGroupInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryGroupMembersResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryGroupMembersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryMaxFreeResourceResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryMaxFreeResourceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryMemberInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryMemberInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryNotifyFlagResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryNotifyFlagResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryPaychannelHisReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryPaychannelHisReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryPayChannelHisResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryPayChannelHisResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryPayChannelResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryPayChannelResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryPayChannelResponse2");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryPayChannelResponse2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryPCRFInfoReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryPCRFInfoReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryPCRFInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryPCRFInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryProdCycleInfoReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryProdCycleInfoReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryProdCycleInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryProdCycleInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryProdStateResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryProdStateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryProductBillAttrResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryProductBillAttrResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryScpProfileResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryScpProfileResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryServiceStateResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryServiceStateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQuerySharingPromotionResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQuerySharingPromotionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQuerySuppressNotificationResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQuerySuppressNotificationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryUsersByBssResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryUsersByBssResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryVpnNumberResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryVpnNumberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "exemptionInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.ExemptionInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "extendParam");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.ExtendParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "extendParamList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.ExtendParam[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "extendParam");
            qName2 = new javax.xml.namespace.QName("", "extendParamListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "feeItem");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.FeeItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "feeItemList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.FeeItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "feeItem");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "financialSummary");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.FinancialSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "fn");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.Fn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "fnList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.Fn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "fn");
            qName2 = new javax.xml.namespace.QName("", "fNList_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "fraudAnalysis");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.FraudAnalysis.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResource");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.FreeResource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResourceList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.FreeResource[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "freeResource");
            qName2 = new javax.xml.namespace.QName("", "freeResourceListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "groupandMemberList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.GroupandMemberList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "innerBaseResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.InnerBaseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "invoiceInformation");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.InvoiceInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "maxFreeResource");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.MaxFreeResource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "maxFreeResourceList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.MaxFreeResource[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "maxFreeResource");
            qName2 = new javax.xml.namespace.QName("", "maxFreeResourceList_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "mobileInformation");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.MobileInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "netaxeptPaymentInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.NetaxeptPaymentInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "netaxeptQueryRequest");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.NetaxeptQueryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "notify");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.Notify.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFee");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.OneTimeFee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "orderInformation");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.OrderInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "payChannelHisInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.PayChannelHisInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "paymentError");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.PaymentError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "pccRule");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.PccRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "pcrfInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.PcrfInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "phoneNotify");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.PhoneNotify.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "prodStateResult");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.ProdStateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "prodStateResultList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.ProdStateResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "prodStateResult");
            qName2 = new javax.xml.namespace.QName("", "productState");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "productFN");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.ProductFN.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "productFNList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.ProductFN[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "productFN");
            qName2 = new javax.xml.namespace.QName("", "productFN");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "qryExemptionReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.QryExemptionReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryBillDetailResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.QueryBillDetailResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryBusiSuccessReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.QueryBusiSuccessReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryCallScreenReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.QueryCallScreenReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryFnReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.QueryFnReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryGroupMembersReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.QueryGroupMembersReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "queryResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.QueryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "recurring");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.Recurring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "responseHead");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.ResponseHead.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBillCycle");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SBillCycle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCallScreenNo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SCallScreenNo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCallScreenNoList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SCallScreenNo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCallScreenNo");
            qName2 = new javax.xml.namespace.QName("", "sCallScreenNoList_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "scpProfileReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.ScpProfileReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sddFee");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SddFee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sddFeeList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SddFee[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sddFee");
            qName2 = new javax.xml.namespace.QName("", "sDDFee");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "securityInformation");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SecurityInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "serviceStateResult");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.ServiceStateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "serviceStateResultList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.ServiceStateResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "serviceStateResult");
            qName2 = new javax.xml.namespace.QName("", "serviceState");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sGroup");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sGroupList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SGroup[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sGroup");
            qName2 = new javax.xml.namespace.QName("", "group_items");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sMember");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SMember.class;
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
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sMemberList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SMember[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sMember");
            qName2 = new javax.xml.namespace.QName("", "sMemberList_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sOrderField");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SOrderField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPage");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SPage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "specialNumber");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SpecialNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "specialNumberList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SpecialNumber[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "specialNumber");
            qName2 = new javax.xml.namespace.QName("", "specialNumberList_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrder");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SProductOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrderList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SProductOrder[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrder");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrderOper");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SProductOrderOper.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrderOperList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SProductOrderOper[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrderOper");
            qName2 = new javax.xml.namespace.QName("", "sProductOrderOperList_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductParam");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SProductParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductParamList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SProductParam[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductParam");
            qName2 = new javax.xml.namespace.QName("", "sProductParamListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductRecurringFee");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SProductRecurringFee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryDDFeeReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQueryDDFeeReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryGroupMemberReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQueryGroupMemberReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryGroupReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQueryGroupReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryMaxFreeResourceReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQueryMaxFreeResourceReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryNotifyFlagReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQueryNotifyFlagReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryProdState");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQueryProdState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryProductBillAttrReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQueryProductBillAttrReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQuerySharePromReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQuerySharePromReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQuerySrvStateReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQuerySrvStateReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQuerySuppressNotificationReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQuerySuppressNotificationReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryUsersByBssReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQueryUsersByBssReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sQueryVpnNumberReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQueryVpnNumberReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "subGroup");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SubGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "subGroupList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SubGroup[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "subGroup");
            qName2 = new javax.xml.namespace.QName("", "subGroup_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUser");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SUser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUserAuth");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SUserAuth.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUserLifecycle");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SUserLifecycle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "terminalInformation");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.TerminalInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "transactionLogLine");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.TransactionLogLine.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "updatePayChannelReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.UpdatePayChannelReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "updatePayChannelResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.UpdatePayChannelResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "userList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.cm.dk.ws.imsqueryservice.SUser[].class;
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
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryPayChannelResponse2 doQueryPayChannel2(com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead requestHead, java.lang.Long acctId) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoQueryPayChannel2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, acctId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryPayChannelResponse2) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryPayChannelResponse2) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryPayChannelResponse2.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryDDFeeResponse doQueryDDFee(com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQueryDDFeeReq SQueryDDFeeReq) throws java.rmi.RemoteException {
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
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryDDFeeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryDDFeeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryDDFeeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQuerySharingPromotionResponse do_querySharingPromotion(com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQuerySharePromReq querySharePromReq) throws java.rmi.RemoteException {
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
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQuerySharingPromotionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQuerySharingPromotionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQuerySharingPromotionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryGroupInfoResponse do_queryGroupInfo(com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQueryGroupReq sQueryGroupReq) throws java.rmi.RemoteException {
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
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryGroupInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryGroupInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryGroupInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryMaxFreeResourceResponse doQueryMaxFreeResource(com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQueryMaxFreeResourceReq queryMaxFreeResourceReq) throws java.rmi.RemoteException {
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
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryMaxFreeResourceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryMaxFreeResourceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryMaxFreeResourceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.AcctStatusResponse doQueryAcctStatus(com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imsqueryservice.AcctStatusParamReq req) throws java.rmi.RemoteException {
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
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.AcctStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.AcctStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imsqueryservice.AcctStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryPCRFInfoResponse doQueryPCRFInfo(com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryPCRFInfoReq doQueryPCRFInfoReq) throws java.rmi.RemoteException {
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
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryPCRFInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryPCRFInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryPCRFInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryPayChannelResponse doQueryPayChannel(com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead requestHead, java.lang.Long acctId) throws java.rmi.RemoteException {
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
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryPayChannelResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryPayChannelResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryPayChannelResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryVpnNumberResponse do_queryVpnNumber(com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQueryVpnNumberReq sQueryVpnNumberReq) throws java.rmi.RemoteException {
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
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryVpnNumberResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryVpnNumberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryVpnNumberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryBusiSuccessResponse do_queryBusiSuccess(com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imsqueryservice.QueryBusiSuccessReq qryBusiSuccess) throws java.rmi.RemoteException {
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
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryBusiSuccessResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryBusiSuccessResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryBusiSuccessResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryUsersByBssResponse do_queryUsersByBssbroker(com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQueryUsersByBssReq sQueryUsersByBssReq) throws java.rmi.RemoteException {
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
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryUsersByBssResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryUsersByBssResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryUsersByBssResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryNotifyFlagResponse doQueryNotificationFlag(com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQueryNotifyFlagReq req) throws java.rmi.RemoteException {
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
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryNotifyFlagResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryNotifyFlagResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryNotifyFlagResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryProdStateResponse do_queryProdState(com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQueryProdState req) throws java.rmi.RemoteException {
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
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryProdStateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryProdStateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryProdStateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryGroupMembersResponse do_queryGroupMembers(com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imsqueryservice.QueryGroupMembersReq queryGroupMembersReq) throws java.rmi.RemoteException {
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
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryGroupMembersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryGroupMembersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryGroupMembersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.QueryBillDetailResponse doQueryBillDetail(com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryBillDetailReq req) throws java.rmi.RemoteException {
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
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.QueryBillDetailResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.QueryBillDetailResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imsqueryservice.QueryBillDetailResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoNetaxeptQueryResponse doNetaxeptQuery(com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoNetaxeptQueryReq doNetaxeptQueryReq) throws java.rmi.RemoteException {
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
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoNetaxeptQueryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoNetaxeptQueryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoNetaxeptQueryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryProdCycleInfoResponse doQueryProdCycleInfo(com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryProdCycleInfoReq doQueryProdCycleInfoReq) throws java.rmi.RemoteException {
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
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryProdCycleInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryProdCycleInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryProdCycleInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.UpdatePayChannelResponse updatePayChannel(com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imsqueryservice.UpdatePayChannelReq payChannelReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "UpdatePayChannel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, payChannelReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.UpdatePayChannelResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.UpdatePayChannelResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imsqueryservice.UpdatePayChannelResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryServiceStateResponse do_queryServiceState(com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQuerySrvStateReq req) throws java.rmi.RemoteException {
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
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryServiceStateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryServiceStateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryServiceStateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryMemberInfoResponse do_queryMemberInfo(com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQueryGroupMemberReq sQueryGroupMemberReq) throws java.rmi.RemoteException {
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
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryMemberInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryMemberInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryMemberInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryFNResponse do_queryFN(com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imsqueryservice.QueryFnReq queryFnReq, com.asiainfo.crm.cm.dk.ws.imsqueryservice.OneTimeFee oneTimeFee) throws java.rmi.RemoteException {
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
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryFNResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryFNResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryFNResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQuerySuppressNotificationResponse do_querySuppressNotification(com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQuerySuppressNotificationReq querySuppressNotificationReq) throws java.rmi.RemoteException {
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
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQuerySuppressNotificationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQuerySuppressNotificationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQuerySuppressNotificationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryScpProfileResponse do_queryScpProfile(com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imsqueryservice.ScpProfileReq scpProfileReq) throws java.rmi.RemoteException {
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
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryScpProfileResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryScpProfileResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryScpProfileResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryCallScreenResponse do_queryCallScreen(com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imsqueryservice.QueryCallScreenReq queryCallScreenReq) throws java.rmi.RemoteException {
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
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryCallScreenResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryCallScreenResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryCallScreenResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryPayChannelHisResponse doQueryPayChannelHis(com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryPaychannelHisReq queryPayChannelReq) throws java.rmi.RemoteException {
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
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryPayChannelHisResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryPayChannelHisResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryPayChannelHisResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQryExemptionResponse do_qryExemption(com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imsqueryservice.QryExemptionReq req) throws java.rmi.RemoteException {
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
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQryExemptionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQryExemptionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQryExemptionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryProductBillAttrResponse doQueryProductBillAttr(com.asiainfo.crm.cm.dk.ws.imsqueryservice.RequestHead requestHead, com.asiainfo.crm.cm.dk.ws.imsqueryservice.SQueryProductBillAttrReq req) throws java.rmi.RemoteException {
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
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryProductBillAttrResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryProductBillAttrResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.cm.dk.ws.imsqueryservice.DoQueryProductBillAttrResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

	public SUnOrderProductFeeResponse doQueryUnOrderProductFee(RequestHead requestHead, SOrderProductFeeRequest requestBody) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public SOrderProductFeeResponse doQueryOrderProductFee(RequestHead requestHead, SOrderProductFeeRequest requestBody) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public QueryPbsManualResponse doQueryPbsManualData(RequestHead requestHead, SearchPbsManualForm searchPbsManualReq) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
