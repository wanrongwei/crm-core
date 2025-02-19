/**
 * IImsServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imsservice;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class IImsServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.IImsServiceWs {
	private static transient final Log log = LogFactory.getLog(IImsServiceSoapBindingStub.class);
	private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();
    private static final String ret="return";

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[56];
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
        oper.setName("DoSetConsumption");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sSetBudget"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sSetConsumptionReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SSetConsumptionReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doSetConsumptionResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoSetConsumptionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_removeUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sRemove"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sRemoveReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SRemoveReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "oneTimeFee"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFee"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.OneTimeFee.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doRemoveUserResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoRemoveUserResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoManagePayChannel");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "managePayChannelReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "managePayChannelReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ManagePayChannelReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doManagePayChannelResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoManagePayChannelResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoSetNotificationFlag");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ssetNotificationReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sSetNotificationFlagReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SSetNotificationFlagReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doSetNotificationFlagResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoSetNotificationFlagResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_changeMainPromotion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sChgProduct"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sChangeProduct"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SChangeProduct.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "oneTimeFee"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFee"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.OneTimeFee.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doChangeProductResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeProductResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoCancelProductAuth");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doCancelProductAuthReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoCancelProductAuthReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doCancelProductAuthResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoCancelProductAuthResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_changeGroupProducts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sChangeInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "chgGroupProduct"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ChgGroupProduct.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "oneTimeFee"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFee"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.OneTimeFee.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "chgGroupProductResp"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ChgGroupProductResp.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoNetaxeptRegister");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "doNetaxeptRegisterReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doNetaxeptRegisterReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNetaxeptRegisterReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doNetaxeptRegisterResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNetaxeptRegisterResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoModifyAccountBasicInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sAccount"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAccount"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SAccount.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sContactOperList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sContactOperList"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SContactOper[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doModifyAccountBasicInfoResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoModifyAccountBasicInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoNewRegistration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "newRegistration"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "newRegistration"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.NewRegistration.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "flag"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), java.lang.Short.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "oneTimeFee"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFee"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.OneTimeFee.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doNewRegistrationResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNewRegistrationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_deleteGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sDeleteGroupReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sDeleteGroupReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SDeleteGroupReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doDeleteGroupResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoDeleteGroupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_modifyCustBasicInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sCustomer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCustomer"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SCustomer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sContactOperList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sContactOperList"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SContactOper[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "item"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doModifyCustBasicInfoResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoModifyCustBasicInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoProductAuth");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doProductAuthReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoProductAuthReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doProductAuthResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoProductAuthResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_caRelation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sCARelationReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "scaRelateReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ScaRelateReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doCaRelationResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoCaRelationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoNPRangeSync");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "doNPRangeSyncReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doNPRangeSyncReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.NpRangeInfo[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "npRangeInfo"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doNPRangeSyncResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNPRangeSyncResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_caRelationUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sCARelationUserReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "scaRelateUserReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ScaRelateUserReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doCaRelationUserResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoCaRelationUserResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_renewRegistration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sRenew"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "renewRegistration"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RenewRegistration.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doRenewRegistrationResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoRenewRegistrationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_changePaymentMode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sChangePaymentMode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sChangePaymentModeReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SChangePaymentModeReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "oneTimeFee"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFee"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.OneTimeFee.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doChangePaymentModeResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangePaymentModeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_deactivateGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sDeactivateGroupReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sDeactivateGroupReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SDeactivateGroupReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doDeactivateGroupResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoDeactivateGroupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_UpdateBillingAddressInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "billingAddressInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBillingAddressInfo"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SBillingAddressInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_mgntCallScreen");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sCallScreenReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sMgntCallScreenReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SMgntCallScreenReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "oneTimeFee"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFee"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.OneTimeFee.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doMgntCallScreenResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoMgntCallScreenResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_changeMsisdnAndSim");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "changeInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "changeMsisdnAndSimInfo"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ChangeMsisdnAndSimInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "oneTimeFee"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFee"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.OneTimeFee.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doChangeMsisdnAndSimResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeMsisdnAndSimResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_changeOwnerReq");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sChangeOwner"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sChangeOwnerReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SChangeOwnerReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "oneTimeFee"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFee"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.OneTimeFee.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doChangeOwnerReqResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeOwnerReqResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoNetaxeptProcess");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "doNetaxeptProcessReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doNetaxeptProcessReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNetaxeptProcessReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doNetaxeptProcessResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNetaxeptProcessResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoSetExemptCreditLimit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "setExemptLimitReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sSetEmptLimitReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SSetEmptLimitReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doSetExemptCreditLimitResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoSetExemptCreditLimitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoSetBudget");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sSetBudget"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sSetBudgetReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SSetBudgetReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doSetBudgetResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoSetBudgetResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_bankConfiguration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bankInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "bankInfo"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.BankInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "oper_type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"), java.lang.Short.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doBankConfigurationResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoBankConfigurationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_deletePrematch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sDeletePrematchReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sDeletePrematchReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SDeletePrematchReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doDeletePrematchResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoDeletePrematchResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoLifeCycleMgnt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sLifeCycle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUserStatus"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SUserStatus.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "oneTimeFee"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFee"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.OneTimeFee.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doLifeCycleMgntResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoLifeCycleMgntResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoManageNotifyFlag");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sCreditNotifyMgntReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCreditNotifyMgntReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SCreditNotifyMgntReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doCreditNotifyMgntResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoCreditNotifyMgntResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoRequestBod");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sRequestBodReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sRequestBodReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SRequestBodReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doRequestBodResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoRequestBodResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_changeProduct");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sChgProduct"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sChangeProduct"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SChangeProduct.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "oneTimeFee"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFee"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.OneTimeFee.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doChangeProductResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeProductResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_mgntCRMBlackList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "smgntCRMBlackListReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sMgntCRMBlackListReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SMgntCRMBlackListReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doMgntCRMBlackListResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoMgntCRMBlackListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_reguide");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sRelationReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUserPayReguideRelList"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SUserPayReguideRel[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "payRelList_Item"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doReguideMgntResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoReguideMgntResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_changeUserLanguage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "changeUserLanguageReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "changeUserLanguageReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ChangeUserLanguageReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doChangeUserLanguageResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeUserLanguageResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoSetMaxFreeResource");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "maxFreeResourceReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "maxFreeResourceReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.MaxFreeResourceReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doSetMaxFreeResourceResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoSetMaxFreeResourceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_split");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "relationReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUserPaySplitRelList"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SUserPaySplitRel[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "splitRelList_Item"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doSplitResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoSplitResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_modifyProductState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sChangeInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "modifyProductState"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ModifyProductState.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sOneTimeFee"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFee"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.OneTimeFee.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doModifyProductStateResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoModifyProductStateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_vpnGroupRelation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SVPNRelationReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "svpnRelationReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SvpnRelationReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doVPNGroupRelationResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoVPNGroupRelationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_mgntGroupMember");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sMngGroupMemberReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sMgnGroupMemberReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SMgnGroupMemberReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "oneTimeFee"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFee"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.OneTimeFee.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doMgntGroupMemberResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoMgntGroupMemberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_firstActivation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sFristActiveReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sFristActiveReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SFristActiveReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "oneTimeFee"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFee"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.OneTimeFee.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doFirstActivationResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoFirstActivationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_manageMultiSim");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sOperateMultiSimReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sOperateMultiSimReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SOperateMultiSimReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doOperateMultiSimResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoOperateMultiSimResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoOrderProductAuth");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "req"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doOrderProductAuthResponse"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoOrderProductAuthResponse.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doOrderProductAuthReq"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoOrderProductAuthReq.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_dismissReq");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sDismissReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sDismissReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SDismissReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doDismissReqResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoDismissReqResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_changeBillCycle");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sChgBillCycleReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sChgBillCycleReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SChgBillCycleReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "old_bill_cycle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBillCycle"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SBillCycle.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "new_bill_cycle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBillCycle"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SBillCycle.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "oneTimeFee"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFee"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.OneTimeFee.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doChangeBillCycleResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeBillCycleResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_manageUserFriendsNums");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sMangeUserFNs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "manageUserFriendsNum"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ManageUserFriendsNum.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "oneTimeFee"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFee"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.OneTimeFee.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doManageUserFriendsNumsResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoManageUserFriendsNumsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_changeGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sGroup"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sGroup"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SGroup.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doChangeGroupResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeGroupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_manageIRParty");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sManageIRParty"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sManagerIRPartyReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SManagerIRPartyReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doManageIRPartyResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoManageIRPartyResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_authParent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sAuthReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAuthParentReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SAuthParentReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAuthParentResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoAuthParentResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_modifyUserBasicInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sUser"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUser"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SUser.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doModifyUserBasicInfoResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoModifyUserBasicInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_deactivateGroupMem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sDeactivateGroupMemReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sDeactivateGroupMemReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SDeactivateGroupMemReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doDeactivateGroupMemResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoDeactivateGroupMemResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_resetNegativeValue");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "resetNegativeValueReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sResetNegativeValueReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SResetNegativeValueReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doResetNegativeValueResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoResetNegativeValueResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoNumberPortability");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mnpList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "mnpReqList"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.MnpReq[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "mnpReq"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doNumberPortabilityResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNumberPortabilityResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_mgntScpProfile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "scpProfileInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "scpProfileInfo"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ScpProfileInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sUserAuth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUserAuth"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SUserAuth.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "oneTimeFee"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFee"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.OneTimeFee.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doMgntScpProfileResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoMgntScpProfileResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_changeGroupInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "changeGroupInfoReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sChangeGroupInfoReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SChangeGroupInfoReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doChangeGroupInfoResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeGroupInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("do_newGroupReq");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "RequestHead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sNewGroupReq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sNewGroupReq"), com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SNewGroupReq.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doNewGroupReqResponse"));
        oper.setReturnClass(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNewGroupReqResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", ret));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[55] = oper;

    }

    public IImsServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public IImsServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public IImsServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            
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
            
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "avtaleGiro");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.AvtaleGiro.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "bankDebitInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.BankDebitInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "bankInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.BankInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "baseResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.BaseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "budgetControl");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.BudgetControl.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "budgetList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.BudgetControl[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "budgetControl");
            qName2 = new javax.xml.namespace.QName("", "budgetListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "cardInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.CardInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "cbsErrorMsg");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.CbsErrorMsg.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "changeMsisdnAndSimInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ChangeMsisdnAndSimInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "changeUserLanguageReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ChangeUserLanguageReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "chgGroupProduct");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ChgGroupProduct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "chgGroupProductResp");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ChgGroupProductResp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "crmBaseResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.CrmBaseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "customer");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.Customer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "dnBNorDirectPayment");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DnBNorDirectPayment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doAuthParentResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoAuthParentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doBankConfigurationResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoBankConfigurationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doCancelProductAuthReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoCancelProductAuthReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doCancelProductAuthResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoCancelProductAuthResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doCaRelationResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoCaRelationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doCaRelationUserResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoCaRelationUserResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doChangeBillCycleResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeBillCycleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doChangeGroupInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeGroupInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doChangeGroupResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeGroupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doChangeMsisdnAndSimResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeMsisdnAndSimResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doChangeOwnerReqResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeOwnerReqResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doChangePaymentModeResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangePaymentModeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doChangeProductResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeProductResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doChangeUserLanguageResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeUserLanguageResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doCreditNotifyMgntResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoCreditNotifyMgntResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doDeactivateGroupMemResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoDeactivateGroupMemResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doDeactivateGroupResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoDeactivateGroupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doDeleteGroupResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoDeleteGroupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doDeletePrematchResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoDeletePrematchResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doDismissReqResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoDismissReqResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doFirstActivationResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoFirstActivationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doLifeCycleMgntResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoLifeCycleMgntResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doManageIRPartyResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoManageIRPartyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doManagePayChannelResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoManagePayChannelResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doManageUserFriendsNumsResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoManageUserFriendsNumsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doMgntCallScreenResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoMgntCallScreenResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doMgntCRMBlackListResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoMgntCRMBlackListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doMgntGroupMemberResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoMgntGroupMemberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doMgntScpProfileResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoMgntScpProfileResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doModifyAccountBasicInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoModifyAccountBasicInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doModifyCustBasicInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoModifyCustBasicInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doModifyProductStateResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoModifyProductStateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doModifyUserBasicInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoModifyUserBasicInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doNetaxeptProcessReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNetaxeptProcessReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doNetaxeptProcessResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNetaxeptProcessResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doNetaxeptRegisterReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNetaxeptRegisterReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doNetaxeptRegisterResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNetaxeptRegisterResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doNewGroupReqResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNewGroupReqResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doNewRegistrationResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNewRegistrationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doNPRangeSyncReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.NpRangeInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "npRangeInfo");
            qName2 = new javax.xml.namespace.QName("", "npRangeInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doNPRangeSyncResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNPRangeSyncResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doNumberPortabilityResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNumberPortabilityResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doOperateMultiSimResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoOperateMultiSimResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doOrderProductAuthReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoOrderProductAuthReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doOrderProductAuthResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoOrderProductAuthResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doProductAuthReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoProductAuthReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doProductAuthResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoProductAuthResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doQueryPayChannelResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoQueryPayChannelResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doReguideMgntResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoReguideMgntResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doRemoveUserResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoRemoveUserResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doRenewRegistrationResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoRenewRegistrationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doRequestBodResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoRequestBodResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doResetNegativeValueResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoResetNegativeValueResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doSetBudgetResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoSetBudgetResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doSetConsumptionResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoSetConsumptionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doSetExemptCreditLimitResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoSetExemptCreditLimitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doSetMaxFreeResourceResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoSetMaxFreeResourceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doSetNotificationFlagResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoSetNotificationFlagResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doSplitResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoSplitResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "doVPNGroupRelationResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoVPNGroupRelationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "environment");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.Environment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "extendParam");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ExtendParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "extendParamList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ExtendParam[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "extendParam");
            qName2 = new javax.xml.namespace.QName("", "extendParamListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "feeItem");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.FeeItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "feeItemList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.FeeItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "feeItem");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "fn");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.Fn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "fnList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.Fn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "fn");
            qName2 = new javax.xml.namespace.QName("", "fNList_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "fnOper");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.FnOper.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "fnOperList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.FnOper[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "fnOper");
            qName2 = new javax.xml.namespace.QName("", "fNOperList_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "innerBaseResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.InnerBaseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "irResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.IrResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "irResponseList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.IrResponse[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "irResponse");
            qName2 = new javax.xml.namespace.QName("", "iRResponse_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "longList");
            cachedSerQNames.add(qName);
            cls = long[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
            qName2 = new javax.xml.namespace.QName("", "longList_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "managePayChannelReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ManagePayChannelReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "manageUserFriendsNum");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ManageUserFriendsNum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "maxFreeResourceReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.MaxFreeResourceReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "maxFreeResourceResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.MaxFreeResourceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "mnpReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.MnpReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "mnpReqList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.MnpReq[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "mnpReq");
            qName2 = new javax.xml.namespace.QName("", "mnpReq");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "modCA");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ModCA.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "modCAList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ModCA[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "modCA");
            qName2 = new javax.xml.namespace.QName("", "modCAList_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "modifyProductState");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ModifyProductState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "netaxeptProcessRequest");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.NetaxeptProcessRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "newRegistration");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.NewRegistration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "notify");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.Notify.class;
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
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "notifyList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.Notify[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "notify");
            qName2 = new javax.xml.namespace.QName("", "notifyList_item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "notifyOper");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.NotifyOper.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "notifyOperList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.NotifyOper[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "notifyOper");
            qName2 = new javax.xml.namespace.QName("", "notifyOperList_item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "npRangeInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.NpRangeInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "oneTimeFee");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.OneTimeFee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "order");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.Order.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "paymentMethodAction");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.PaymentMethodAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "phoneItem");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.PhoneItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "phoneItemList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.PhoneItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "phoneItem");
            qName2 = new javax.xml.namespace.QName("", "phoneItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "preOrderOffer");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.PreOrderOffer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "processResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ProcessResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "productSeqItem");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ProductSeqItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "productSeqItemList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ProductSeqItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "productSeqItem");
            qName2 = new javax.xml.namespace.QName("", "productSeqItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "recurring");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.Recurring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "registerRequest");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RegisterRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "registerResponse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RegisterResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "renewRegistration");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RenewRegistration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "requestHead");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "responseHead");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ResponseHead.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAccount");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SAccount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAccountList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SAccount[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAccount");
            qName2 = new javax.xml.namespace.QName("", "sAccountList_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAddSubscriber");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SAddSubscriber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAddSubscriberList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SAddSubscriber[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAddSubscriber");
            qName2 = new javax.xml.namespace.QName("", "sAddSubscriber");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sAuthParentReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SAuthParentReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBalance");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SBalance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBalanceList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SBalance[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBalance");
            qName2 = new javax.xml.namespace.QName("", "sBalanceListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBillCycle");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SBillCycle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBillingAddressInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SBillingAddressInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBusiService");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SBusiService.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBusiServiceOper");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SBusiServiceOper.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBusiServiceOperList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SBusiServiceOper[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sBusiServiceOper");
            qName2 = new javax.xml.namespace.QName("", "busiServiceOperArr");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCallScreenNo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SCallScreenNo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCallScreenNoList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SCallScreenNo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCallScreenNo");
            qName2 = new javax.xml.namespace.QName("", "sCallScreenNoList_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "scaRelateReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ScaRelateReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "scaRelateUserReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ScaRelateUserReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sChangeGroupInfoReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SChangeGroupInfoReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sChangeOwnerReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SChangeOwnerReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sChangePaymentModeReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SChangePaymentModeReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sChangeProduct");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SChangeProduct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sChgBillCycleReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SChgBillCycleReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sContact");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SContact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sContactList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SContact[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sContact");
            qName2 = new javax.xml.namespace.QName("", "sContactListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sContactOper");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SContactOper.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sContactOperList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SContactOper[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sContactOper");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "scpProfileInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ScpProfileInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCreditNotify");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SCreditNotify.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCreditNotifyList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SCreditNotify[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCreditNotify");
            qName2 = new javax.xml.namespace.QName("", "notifyList_item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCreditNotifyMgntReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SCreditNotifyMgntReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sCustomer");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SCustomer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sDeactivateGroupMemReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SDeactivateGroupMemReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sDeactivateGroupReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SDeactivateGroupReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sDeleteGroupReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SDeleteGroupReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sDeletePrematchReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SDeletePrematchReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sDismissReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SDismissReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "serviceRequest");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ServiceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "serviceRequestList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ServiceRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "serviceRequest");
            qName2 = new javax.xml.namespace.QName("", "serviceRequest_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "serviceRequestOper");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ServiceRequestOper.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sFristActiveReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SFristActiveReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sGroup");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "simItem");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SimItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "simItemList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SimItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "simItem");
            qName2 = new javax.xml.namespace.QName("", "list");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sManagerIRPartyReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SManagerIRPartyReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sMember");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SMember.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sMemberOperList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SMemberOperList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sMemSts");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SMemSts.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sMemStsList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SMemSts[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sMemSts");
            qName2 = new javax.xml.namespace.QName("", "sMemStsItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sMgnGroupMemberReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SMgnGroupMemberReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sMgntCallScreenReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SMgntCallScreenReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sMgntCRMBlackListReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SMgntCRMBlackListReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sModSubscriber");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SModSubscriber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sModSubscriberList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SModSubscriber[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sModSubscriber");
            qName2 = new javax.xml.namespace.QName("", "sModSubscriber");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sNewGroupReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SNewGroupReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sOioublInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SOioublInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sOperateMultiSimReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SOperateMultiSimReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sOrderField");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SOrderField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPage");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SPage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPayChannel");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SPayChannel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPayChannelList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SPayChannel[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPayChannel");
            qName2 = new javax.xml.namespace.QName("", "sPayChannelListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPayReguideInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SPayReguideInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPayReguideInfoList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SPayReguideInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPayReguideInfo");
            qName2 = new javax.xml.namespace.QName("", "reguideInfoList_item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPaySplitInfo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SPaySplitInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPaySplitInfoList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SPaySplitInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sPaySplitInfo");
            qName2 = new javax.xml.namespace.QName("", "splitInfoList_item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "specialNumber");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SpecialNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "specialNumberList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SpecialNumber[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "specialNumber");
            qName2 = new javax.xml.namespace.QName("", "specialNumberList_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "specialNumberOper");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SpecialNumberOper.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "specialNumberOperList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SpecialNumberOper[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "specialNumberOper");
            qName2 = new javax.xml.namespace.QName("", "specialNumberOperList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrder");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SProductOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrderList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SProductOrder[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrder");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrderOper");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SProductOrderOper.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrderOperList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SProductOrderOper[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrderOper");
            qName2 = new javax.xml.namespace.QName("", "sProductOrderOperList_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrderResult");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SProductOrderResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrderResultList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SProductOrderResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductOrderResult");
            qName2 = new javax.xml.namespace.QName("", "sProductOrderResultListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductParam");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SProductParam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductParamList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SProductParam[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sProductParam");
            qName2 = new javax.xml.namespace.QName("", "sProductParamListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sRemoveReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SRemoveReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sRequestBodReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SRequestBodReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sResetNegativeValueReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SResetNegativeValueReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sSetBudgetReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SSetBudgetReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sSetConsumptionReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SSetConsumptionReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sSetEmptLimitReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SSetEmptLimitReq.class;
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
//            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
//            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
//            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
//            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
//            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
//            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
//            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
//            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sSetNotificationFlagReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SSetNotificationFlagReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "subCA");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SubCA.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "subCAList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SubCA[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "subCA");
            qName2 = new javax.xml.namespace.QName("", "subCAList_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "subGroup");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SubGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "subGroupList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SubGroup[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "subGroup");
            qName2 = new javax.xml.namespace.QName("", "subGroup_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUser");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SUser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUserAuth");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SUserAuth.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUserAuthList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SUserAuth[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUserAuth");
            qName2 = new javax.xml.namespace.QName("", "sUserAuthListItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUserLifecycle");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SUserLifecycle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUserList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SUser[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUser");
            qName2 = new javax.xml.namespace.QName("", "sUserList_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUserPayReguideRel");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SUserPayReguideRel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUserPayReguideRelList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SUserPayReguideRel[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUserPayReguideRel");
            qName2 = new javax.xml.namespace.QName("", "payRelList_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUserPaySplitRel");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SUserPaySplitRel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUserPaySplitRelList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SUserPaySplitRel[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUserPaySplitRel");
            qName2 = new javax.xml.namespace.QName("", "splitRelList_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUserResult");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SUserResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUserResultList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SUserResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUserResult");
            qName2 = new javax.xml.namespace.QName("", "sUserResultList_Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "sUserStatus");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SUserStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "svpnRelationReq");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SvpnRelationReq.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "terminal");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.Terminal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "threshold");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.Threshold.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "thresholdList");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.Threshold[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "threshold");
            qName2 = new javax.xml.namespace.QName("", "thresholdListItem");
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

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoSetConsumptionResponse doSetConsumption(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SSetConsumptionReq sSetBudget) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoSetConsumption"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sSetBudget});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoSetConsumptionResponse) _resp;
            } catch (java.lang.Exception _exception) {
            	log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoSetConsumptionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoSetConsumptionResponse.class);
                
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoRemoveUserResponse do_removeUser(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SRemoveReq sRemove, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.OneTimeFee oneTimeFee) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_removeUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sRemove, oneTimeFee});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoRemoveUserResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoRemoveUserResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoRemoveUserResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoManagePayChannelResponse doManagePayChannel(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ManagePayChannelReq managePayChannelReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoManagePayChannel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, managePayChannelReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoManagePayChannelResponse) _resp;
            } catch (java.lang.Exception _exception) {
            	log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoManagePayChannelResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoManagePayChannelResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoSetNotificationFlagResponse doSetNotificationFlag(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SSetNotificationFlagReq ssetNotificationReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoSetNotificationFlag"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, ssetNotificationReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoSetNotificationFlagResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoSetNotificationFlagResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoSetNotificationFlagResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeProductResponse do_changeMainPromotion(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SChangeProduct sChgProduct, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.OneTimeFee oneTimeFee) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_changeMainPromotion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sChgProduct, oneTimeFee});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeProductResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeProductResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeProductResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoCancelProductAuthResponse doCancelProductAuth(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoCancelProductAuthReq req) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoCancelProductAuth"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoCancelProductAuthResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoCancelProductAuthResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoCancelProductAuthResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ChgGroupProductResp do_changeGroupProducts(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ChgGroupProduct sChangeInfo, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.OneTimeFee oneTimeFee) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_changeGroupProducts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sChangeInfo, oneTimeFee});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ChgGroupProductResp) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ChgGroupProductResp) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ChgGroupProductResp.class);
            	}
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNetaxeptRegisterResponse doNetaxeptRegister(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNetaxeptRegisterReq doNetaxeptRegisterReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoNetaxeptRegister"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, doNetaxeptRegisterReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNetaxeptRegisterResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNetaxeptRegisterResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNetaxeptRegisterResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoModifyAccountBasicInfoResponse doModifyAccountBasicInfo(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SAccount sAccount, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SContactOper[] sContactOperList) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoModifyAccountBasicInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sAccount, sContactOperList});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoModifyAccountBasicInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoModifyAccountBasicInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoModifyAccountBasicInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNewRegistrationResponse doNewRegistration(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.NewRegistration newRegistration, java.lang.Short flag, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.OneTimeFee oneTimeFee) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoNewRegistration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, newRegistration, flag, oneTimeFee});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNewRegistrationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNewRegistrationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNewRegistrationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoDeleteGroupResponse do_deleteGroup(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SDeleteGroupReq sDeleteGroupReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_deleteGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sDeleteGroupReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoDeleteGroupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoDeleteGroupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoDeleteGroupResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoModifyCustBasicInfoResponse do_modifyCustBasicInfo(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SCustomer sCustomer, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SContactOper[] sContactOperList) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_modifyCustBasicInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sCustomer, sContactOperList});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoModifyCustBasicInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoModifyCustBasicInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoModifyCustBasicInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoProductAuthResponse doProductAuth(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoProductAuthReq req) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoProductAuth"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoProductAuthResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoProductAuthResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoProductAuthResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoCaRelationResponse do_caRelation(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ScaRelateReq sCARelationReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_caRelation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sCARelationReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoCaRelationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoCaRelationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoCaRelationResponse.class);
            	}
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNPRangeSyncResponse doNPRangeSync(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.NpRangeInfo[] doNPRangeSyncReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoNPRangeSync"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, doNPRangeSyncReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNPRangeSyncResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNPRangeSyncResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNPRangeSyncResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoCaRelationUserResponse do_caRelationUser(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ScaRelateUserReq sCARelationUserReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_caRelationUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sCARelationUserReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoCaRelationUserResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoCaRelationUserResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoCaRelationUserResponse.class);
            	}
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoRenewRegistrationResponse do_renewRegistration(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RenewRegistration sRenew) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_renewRegistration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sRenew});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoRenewRegistrationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoRenewRegistrationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoRenewRegistrationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangePaymentModeResponse do_changePaymentMode(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SChangePaymentModeReq sChangePaymentMode, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.OneTimeFee oneTimeFee) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_changePaymentMode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sChangePaymentMode, oneTimeFee});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangePaymentModeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangePaymentModeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangePaymentModeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoDeactivateGroupResponse do_deactivateGroup(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SDeactivateGroupReq sDeactivateGroupReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_deactivateGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sDeactivateGroupReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoDeactivateGroupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoDeactivateGroupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoDeactivateGroupResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void do_UpdateBillingAddressInfo(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SBillingAddressInfo billingAddressInfo) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_UpdateBillingAddressInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, billingAddressInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoMgntCallScreenResponse do_mgntCallScreen(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SMgntCallScreenReq sCallScreenReq, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.OneTimeFee oneTimeFee) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_mgntCallScreen"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sCallScreenReq, oneTimeFee});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoMgntCallScreenResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoMgntCallScreenResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoMgntCallScreenResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeMsisdnAndSimResponse do_changeMsisdnAndSim(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ChangeMsisdnAndSimInfo changeInfo, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.OneTimeFee oneTimeFee) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_changeMsisdnAndSim"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, changeInfo, oneTimeFee});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeMsisdnAndSimResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeMsisdnAndSimResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeMsisdnAndSimResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeOwnerReqResponse do_changeOwnerReq(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SChangeOwnerReq sChangeOwner, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.OneTimeFee oneTimeFee) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_changeOwnerReq"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sChangeOwner, oneTimeFee});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeOwnerReqResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeOwnerReqResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeOwnerReqResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNetaxeptProcessResponse doNetaxeptProcess(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNetaxeptProcessReq doNetaxeptProcessReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoNetaxeptProcess"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, doNetaxeptProcessReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNetaxeptProcessResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNetaxeptProcessResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNetaxeptProcessResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoSetExemptCreditLimitResponse doSetExemptCreditLimit(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SSetEmptLimitReq setExemptLimitReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoSetExemptCreditLimit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, setExemptLimitReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoSetExemptCreditLimitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoSetExemptCreditLimitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoSetExemptCreditLimitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoSetBudgetResponse doSetBudget(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SSetBudgetReq sSetBudget) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoSetBudget"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sSetBudget});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoSetBudgetResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoSetBudgetResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoSetBudgetResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoBankConfigurationResponse do_bankConfiguration(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.BankInfo bankInfo, java.lang.Short oper_type) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_bankConfiguration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, bankInfo, oper_type});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoBankConfigurationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoBankConfigurationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoBankConfigurationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoDeletePrematchResponse do_deletePrematch(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SDeletePrematchReq sDeletePrematchReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_deletePrematch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sDeletePrematchReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoDeletePrematchResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoDeletePrematchResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoDeletePrematchResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoLifeCycleMgntResponse doLifeCycleMgnt(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SUserStatus sLifeCycle, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.OneTimeFee oneTimeFee) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoLifeCycleMgnt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sLifeCycle, oneTimeFee});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoLifeCycleMgntResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoLifeCycleMgntResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoLifeCycleMgntResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoCreditNotifyMgntResponse doManageNotifyFlag(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SCreditNotifyMgntReq sCreditNotifyMgntReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoManageNotifyFlag"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sCreditNotifyMgntReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoCreditNotifyMgntResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoCreditNotifyMgntResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoCreditNotifyMgntResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoRequestBodResponse doRequestBod(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SRequestBodReq sRequestBodReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoRequestBod"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sRequestBodReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoRequestBodResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoRequestBodResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoRequestBodResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeProductResponse do_changeProduct(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SChangeProduct sChgProduct, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.OneTimeFee oneTimeFee) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_changeProduct"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sChgProduct, oneTimeFee});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeProductResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeProductResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeProductResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoMgntCRMBlackListResponse do_mgntCRMBlackList(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SMgntCRMBlackListReq smgntCRMBlackListReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_mgntCRMBlackList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, smgntCRMBlackListReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoMgntCRMBlackListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoMgntCRMBlackListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoMgntCRMBlackListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoReguideMgntResponse do_reguide(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SUserPayReguideRel[] sRelationReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_reguide"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sRelationReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoReguideMgntResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoReguideMgntResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoReguideMgntResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeUserLanguageResponse do_changeUserLanguage(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ChangeUserLanguageReq changeUserLanguageReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_changeUserLanguage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, changeUserLanguageReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeUserLanguageResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeUserLanguageResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeUserLanguageResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoSetMaxFreeResourceResponse doSetMaxFreeResource(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.MaxFreeResourceReq maxFreeResourceReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoSetMaxFreeResource"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, maxFreeResourceReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoSetMaxFreeResourceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoSetMaxFreeResourceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoSetMaxFreeResourceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoSplitResponse do_split(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SUserPaySplitRel[] relationReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_split"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, relationReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoSplitResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoSplitResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoSplitResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoModifyProductStateResponse do_modifyProductState(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ModifyProductState sChangeInfo, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.OneTimeFee sOneTimeFee) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_modifyProductState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sChangeInfo, sOneTimeFee});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoModifyProductStateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoModifyProductStateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoModifyProductStateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoVPNGroupRelationResponse do_vpnGroupRelation(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SvpnRelationReq SVPNRelationReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_vpnGroupRelation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, SVPNRelationReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoVPNGroupRelationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoVPNGroupRelationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoVPNGroupRelationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoMgntGroupMemberResponse do_mgntGroupMember(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SMgnGroupMemberReq sMngGroupMemberReq, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.OneTimeFee oneTimeFee) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_mgntGroupMember"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sMngGroupMemberReq, oneTimeFee});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoMgntGroupMemberResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoMgntGroupMemberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoMgntGroupMemberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoFirstActivationResponse do_firstActivation(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SFristActiveReq sFristActiveReq, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.OneTimeFee oneTimeFee) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_firstActivation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sFristActiveReq, oneTimeFee});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoFirstActivationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoFirstActivationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoFirstActivationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoOperateMultiSimResponse do_manageMultiSim(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SOperateMultiSimReq sOperateMultiSimReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_manageMultiSim"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sOperateMultiSimReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoOperateMultiSimResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoOperateMultiSimResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoOperateMultiSimResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoOrderProductAuthReq doOrderProductAuth(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoOrderProductAuthResponse req) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoOrderProductAuth"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, req});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoOrderProductAuthReq) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoOrderProductAuthReq) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoOrderProductAuthReq.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoDismissReqResponse do_dismissReq(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SDismissReq sDismissReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_dismissReq"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sDismissReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoDismissReqResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoDismissReqResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoDismissReqResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeBillCycleResponse do_changeBillCycle(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SChgBillCycleReq sChgBillCycleReq, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SBillCycle old_bill_cycle, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SBillCycle new_bill_cycle, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.OneTimeFee oneTimeFee) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_changeBillCycle"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sChgBillCycleReq, old_bill_cycle, new_bill_cycle, oneTimeFee});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeBillCycleResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeBillCycleResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeBillCycleResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoManageUserFriendsNumsResponse do_manageUserFriendsNums(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ManageUserFriendsNum sMangeUserFNs, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.OneTimeFee oneTimeFee) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_manageUserFriendsNums"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sMangeUserFNs, oneTimeFee});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoManageUserFriendsNumsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoManageUserFriendsNumsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoManageUserFriendsNumsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeGroupResponse do_changeGroup(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SGroup sGroup) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_changeGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sGroup});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeGroupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeGroupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeGroupResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoManageIRPartyResponse do_manageIRParty(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SManagerIRPartyReq sManageIRParty) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_manageIRParty"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sManageIRParty});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoManageIRPartyResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoManageIRPartyResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoManageIRPartyResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoAuthParentResponse do_authParent(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SAuthParentReq sAuthReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_authParent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sAuthReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoAuthParentResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoAuthParentResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoAuthParentResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoModifyUserBasicInfoResponse do_modifyUserBasicInfo(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SUser sUser) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_modifyUserBasicInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sUser});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoModifyUserBasicInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoModifyUserBasicInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoModifyUserBasicInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoDeactivateGroupMemResponse do_deactivateGroupMem(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SDeactivateGroupMemReq sDeactivateGroupMemReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_deactivateGroupMem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sDeactivateGroupMemReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoDeactivateGroupMemResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoDeactivateGroupMemResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoDeactivateGroupMemResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoResetNegativeValueResponse do_resetNegativeValue(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SResetNegativeValueReq resetNegativeValueReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_resetNegativeValue"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, resetNegativeValueReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoResetNegativeValueResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoResetNegativeValueResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoResetNegativeValueResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNumberPortabilityResponse doNumberPortability(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.MnpReq[] mnpList) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "DoNumberPortability"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, mnpList});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNumberPortabilityResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNumberPortabilityResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNumberPortabilityResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoMgntScpProfileResponse do_mgntScpProfile(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.ScpProfileInfo scpProfileInfo, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SUserAuth sUserAuth, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.OneTimeFee oneTimeFee) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_mgntScpProfile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, scpProfileInfo, sUserAuth, oneTimeFee});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoMgntScpProfileResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoMgntScpProfileResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoMgntScpProfileResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeGroupInfoResponse do_changeGroupInfo(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SChangeGroupInfoReq changeGroupInfoReq) throws java.rmi.RemoteException {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_changeGroupInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, changeGroupInfoReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeGroupInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeGroupInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoChangeGroupInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNewGroupReqResponse do_newGroupReq(com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.RequestHead requestHead, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.SNewGroupReq sNewGroupReq) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://imsintf.service.openbilling.ailk.com/", "do_newGroupReq"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requestHead, sNewGroupReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNewGroupReqResponse) _resp;
            } catch (java.lang.Exception _exception) {
                log.error("ERROR",_exception);
            	return (com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNewGroupReqResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.so.exe.ws.crmcallams.imsservice.DoNewGroupReqResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
