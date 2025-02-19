/**
 * AKSopenSoap_BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.rki;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;

import org.apache.axis.message.MessageElement;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.common.SessionManager;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.asiainfo.crm.util.CommonUtil;

public class AKSopenSoap_BindingStub extends org.apache.axis.client.Stub implements com.asiainfo.crm.inter.exe.webservice.client.rki.AKSopenSoap_PortType {
	
	private  static Log log = LogFactory.getLog(AKSopenSoap_BindingStub.class);
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[11];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TilmeldPerson");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Aksnoegle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Akskode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Brugernavn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "ReferenceNummer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Navn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Adresse"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Postnummer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Koen"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Foedselsdato"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "CPRnummer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://ws.rki.dk", "TilmeldData"));
        oper.setReturnClass(com.asiainfo.crm.inter.exe.webservice.client.rki.TilmeldData.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://ws.rki.dk/", "TilmeldPersonResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TilmeldPersonId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Aksnoegle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Akskode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Brugernavn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Referencenummer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Stamkortnummer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://ws.rki.dk", "TilmeldData"));
        oper.setReturnClass(com.asiainfo.crm.inter.exe.webservice.client.rki.TilmeldData.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://ws.rki.dk/", "TilmeldPersonIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TilmeldFirma");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Aksnoegle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Akskode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Brugernavn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "ReferenceNummer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Navn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Adresse"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Postnummer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "CVRnummer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://ws.rki.dk", "TilmeldData"));
        oper.setReturnClass(com.asiainfo.crm.inter.exe.webservice.client.rki.TilmeldData.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://ws.rki.dk/", "TilmeldFirmaResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TilmeldFirmaKob");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Aksnoegle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Akskode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Brugernavn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "ReferenceNummer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "KOBnummer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://ws.rki.dk", "TilmeldData"));
        oper.setReturnClass(com.asiainfo.crm.inter.exe.webservice.client.rki.TilmeldData.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://ws.rki.dk/", "TilmeldFirmaKobResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TilmeldFirmaCVR");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Aksnoegle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Akskode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Brugernavn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "ReferenceNummer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "CVRnummer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://ws.rki.dk", "TilmeldData"));
        oper.setReturnClass(com.asiainfo.crm.inter.exe.webservice.client.rki.TilmeldData.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://ws.rki.dk/", "TilmeldFirmaCVRResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TilmeldUbestemt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Aksnoegle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Akskode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Brugernavn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "ReferenceNummer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Navn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Adresse"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Postnummer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://ws.rki.dk", "TilmeldData"));
        oper.setReturnClass(com.asiainfo.crm.inter.exe.webservice.client.rki.TilmeldData.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://ws.rki.dk/", "TilmeldUbestemtResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Tjek");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Aksnoegle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Akskode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Brugernavn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://ws.rki.dk", "TjekListe"));
        oper.setReturnClass(com.asiainfo.crm.inter.exe.webservice.client.rki.TjekListe.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://ws.rki.dk/", "TjekResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Hent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Aksnoegle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Akskode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Brugernavn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Referencenummer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://ws.rki.dk", "HentData"));
        oper.setReturnClass(com.asiainfo.crm.inter.exe.webservice.client.rki.HentData.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://ws.rki.dk/", "HentResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Statistik");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Aksnoegle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Akskode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Brugernavn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://ws.rki.dk", "StatistikData"));
        oper.setReturnClass(com.asiainfo.crm.inter.exe.webservice.client.rki.StatistikData.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://ws.rki.dk/", "StatistikResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Afmeld");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Akskode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Brugernavn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Referencenummer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://ws.rki.dk", "AfmeldData"));
        oper.setReturnClass(com.asiainfo.crm.inter.exe.webservice.client.rki.AfmeldData.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://ws.rki.dk/", "AfmeldResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Effektueret");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Aksnoegle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Akskode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Brugernavn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "Referencenummer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://ws.rki.dk/", "BeskedId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://ws.rki.dk", "EffektueretData"));
        oper.setReturnClass(com.asiainfo.crm.inter.exe.webservice.client.rki.EffektueretData.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://ws.rki.dk/", "EffektueretResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

    }

    public AKSopenSoap_BindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public AKSopenSoap_BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public AKSopenSoap_BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "AdressatData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.AdressatData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "AdresseData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.AdresseData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "AdresseListe");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.AdresseListe.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "AdvarselsAnmaerkningData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.AdvarselsAnmaerkningData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "AdvarselsListe");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.AdvarselsListe.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "AfmeldData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.AfmeldData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "AnmaerkningData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.AnmaerkningData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "ArrayOfAdresseData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.AdresseData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "AdresseData");
            qName2 = new javax.xml.namespace.QName("https://ws.rki.dk", "Adresse");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "ArrayOfAdvarselsAnmaerkningData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.AdvarselsAnmaerkningData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "AdvarselsAnmaerkningData");
            qName2 = new javax.xml.namespace.QName("https://ws.rki.dk", "Advarsel");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "ArrayOfBetalingsAnmaerkningData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.BetalingsAnmaerkningData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "BetalingsAnmaerkningData");
            qName2 = new javax.xml.namespace.QName("https://ws.rki.dk", "Registrering");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "ArrayOfFirmaData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "FirmaData");
            qName2 = new javax.xml.namespace.QName("https://ws.rki.dk", "Firma");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "ArrayOfObservationDataField");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.ObservationDataField[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "ObservationDataField");
            qName2 = new javax.xml.namespace.QName("https://ws.rki.dk", "dataLinie");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "ArrayOfObservationItemData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.ObservationItemData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "ObservationItemData");
            qName2 = new javax.xml.namespace.QName("https://ws.rki.dk", "Anmærkning");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "ArrayOfOwnershipItemData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.OwnershipItemData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "OwnershipItemData");
            qName2 = new javax.xml.namespace.QName("https://ws.rki.dk", "ejerskab");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "ArrayOfPersonData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.PersonData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "PersonData");
            qName2 = new javax.xml.namespace.QName("https://ws.rki.dk", "Person");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("https://ws.rki.dk", "AdresseLinie");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "ArrayOfTjekData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.TjekData[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "TjekData");
            qName2 = new javax.xml.namespace.QName("https://ws.rki.dk", "TjekData");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "BetalingsAnmaerkningData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.BetalingsAnmaerkningData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "BrancheGruppeNACE");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.BrancheGruppeNACE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "BusinessTypeData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.BusinessTypeData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "CompanyCapitalData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.CompanyCapitalData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "CvrNumberData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.CvrNumberData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "DebitorData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.DebitorData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "EffektueretData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.EffektueretData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "FirmaData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "FirmaListe");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaListe.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "FirmaNavnData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaNavnData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "FirmaRegistreringAdvarselData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaRegistreringAdvarselData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "FirmaRegistreringData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.FirmaRegistreringData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "HentData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.HentData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "HusNrData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.HusNrData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "KommuneData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.KommuneData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "Kreditadvarsel");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.Kreditadvarsel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "LandData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.LandData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "NavnData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.NavnData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "ObservationDataField");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.ObservationDataField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "ObservationItemData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.ObservationItemData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "ObservationsData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.ObservationsData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "OlietanksAnmaerkningData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.OlietanksAnmaerkningData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "OwnershipData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.OwnershipData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "OwnershipItemData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.OwnershipItemData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "PersonAdresseData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.PersonAdresseData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "PersonData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.PersonData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "PersonListe");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.PersonListe.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "PersonNavnData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.PersonNavnData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "PersonRegistreringAdvarselData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.PersonRegistreringAdvarselData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "PersonRegistreringData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.PersonRegistreringData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "PostDistriktData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.PostDistriktData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "RegistreringListe");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.RegistreringListe.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "RiskGroupData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.RiskGroupData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "ScoreData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.ScoreData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "SletteAarsagData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.SletteAarsagData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "StatistikData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.StatistikData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "TilmeldData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.TilmeldData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "TjekData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.TjekData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "TjekListe");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.TjekListe.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "VaergeData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.VaergeData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlData");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlError");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorAlreadyUsedFakturaNo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorAlreadyUsedFakturaNo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorAlreadyUsedParameter");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorAlreadyUsedParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorAlreadyUsedRefNo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorAlreadyUsedRefNo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorCreateCase");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorCreateCase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorCreateDebitor");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorCreateDebitor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorCreateFaktura");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorCreateFaktura.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorCreateParameter");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorCreateParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorFakturaBeloeb");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorFakturaBeloeb.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorFutureInvoiceDate");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorFutureInvoiceDate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorInternalKOBDBError");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorInternalKOBDBError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorInvalid");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorInvalid.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorInvoiceExpired");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorInvoiceExpired.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorMultiplePersons");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorMultiplePersons.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorMultipleResponses");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorMultipleResponses.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNoResponses");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNoResponses.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotActiveIdNumber");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotActiveIdNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotFound");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotFound.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotFoundCases");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotFoundCases.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotFoundCompany");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotFoundCompany.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotFoundCreditors");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotFoundCreditors.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotFoundDebitor");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotFoundDebitor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotFoundDelphiScore");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotFoundDelphiScore.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotFoundFaktura");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotFoundFaktura.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotFoundIdNumber");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotFoundIdNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotFoundIncassoType");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotFoundIncassoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotFoundKobNumber");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotFoundKobNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotFoundMessageId");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotFoundMessageId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotFoundParameter");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotFoundParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotFoundPartner");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotFoundPartner.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotFoundPerson");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotFoundPerson.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotFoundPersonOrCompany");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotFoundPersonOrCompany.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotFoundRefNo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotFoundRefNo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotGivenAddress");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotGivenAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotGivenCobrandedEmail");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotGivenCobrandedEmail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotGivenDebitor");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotGivenDebitor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotGivenDebitorSkyldnertype");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotGivenDebitorSkyldnertype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotGivenFaktura");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotGivenFaktura.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotGivenFirstAndSurName");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotGivenFirstAndSurName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotGivenHouseNo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotGivenHouseNo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotGivenInkassoForloeb");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotGivenInkassoForloeb.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotGivenKreditorNo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotGivenKreditorNo.class;
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
            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotGivenName");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotGivenName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotGivenPostalNo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotGivenPostalNo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotGivenRefNo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotGivenRefNo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidAddress");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidAddressValidPerson");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidAddressValidPerson.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidAdministratorIndberet");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidAdministratorIndberet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidAdministratorOpret");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidAdministratorOpret.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidAksOpenLogin");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidAksOpenLogin.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidBirthDate");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidBirthDate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidCase");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidCase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidCaseNo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidCaseNo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidCaseType");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidCaseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidCobrandedIndsigelse");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidCobrandedIndsigelse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidCobrandedLogin");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidCobrandedLogin.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidCPRNumber");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidCPRNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidCreditorNo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidCreditorNo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidCVRNumber");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidCVRNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidDebitorer");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidDebitorer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidDebitorFirma");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidDebitorFirma.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidDebitorPerson");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidDebitorPerson.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidDebitorSkyldnertype");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidDebitorSkyldnertype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidDueDate");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidDueDate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidEmail");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidEmail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidFaktura");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidFaktura.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidFakturaDato");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidFakturaDato.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidFakturaForfaldsDato");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidFakturaForfaldsDato.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidFakturaGebyr");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidFakturaGebyr.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidFakturaHovedstol");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidFakturaHovedstol.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidFakturaNo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidFakturaNo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidFakturaRente");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidFakturaRente.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidFakturaTekst");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidFakturaTekst.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidIdentifyCode");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidIdentifyCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidIdNumber");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidIdNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidInfoLevel");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidInfoLevel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidInvoiceDate");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidInvoiceDate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidLogin");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidLogin.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidMessageId");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidMessageId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidParameter");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidPartner");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidPartner.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidPartnerCheck");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidPartnerCheck.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidPhoneNo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidPhoneNo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidPostalNo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidPostalNo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidReferenceNo");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidReferenceNo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorNotValidSchema");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorNotValidSchema.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorOk");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorOk.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorPrintCase");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorPrintCase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorPrintCaseUpdate");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorPrintCaseUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorRkiRemarkAdvarsel");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorRkiRemarkAdvarsel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorRkiRemarkRegistrering");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorRkiRemarkRegistrering.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorTooManyNameElements");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorTooManyNameElements.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorTooManyResponses");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorTooManyResponses.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorUnknown");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorUnknown.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorUpdateDebitor");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorUpdateDebitor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorUpdateDebitorVerified");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorUpdateDebitorVerified.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorUpdateFaktura");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorUpdateFaktura.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://ws.rki.dk", "XmlErrorValidButDead");
            cachedSerQNames.add(qName);
            cls = com.asiainfo.crm.inter.exe.webservice.client.rki.XmlErrorValidButDead.class;
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
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.asiainfo.crm.inter.exe.webservice.client.rki.TilmeldData tilmeldPerson(java.lang.String aksnoegle, java.lang.String akskode, java.lang.String brugernavn, java.lang.String password, java.lang.String referenceNummer, java.lang.String navn, java.lang.String adresse, java.lang.String postnummer, java.lang.String koen, java.lang.String foedselsdato, java.lang.String CPRnummer) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://ws.rki.dk/TilmeldPerson");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://ws.rki.dk/", "TilmeldPerson"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {aksnoegle, akskode, brugernavn, password, referenceNummer, navn, adresse, postnummer, koen, foedselsdato, CPRnummer});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.inter.exe.webservice.client.rki.TilmeldData) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.inter.exe.webservice.client.rki.TilmeldData) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.inter.exe.webservice.client.rki.TilmeldData.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.inter.exe.webservice.client.rki.TilmeldData tilmeldPersonId(java.lang.String aksnoegle, java.lang.String akskode, java.lang.String brugernavn, java.lang.String password, java.lang.String referencenummer, java.lang.String stamkortnummer) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://ws.rki.dk/TilmeldPersonId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://ws.rki.dk/", "TilmeldPersonId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {aksnoegle, akskode, brugernavn, password, referencenummer, stamkortnummer});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.inter.exe.webservice.client.rki.TilmeldData) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.inter.exe.webservice.client.rki.TilmeldData) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.inter.exe.webservice.client.rki.TilmeldData.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.inter.exe.webservice.client.rki.TilmeldData tilmeldFirma(java.lang.String aksnoegle, java.lang.String akskode, java.lang.String brugernavn, java.lang.String password, java.lang.String referenceNummer, java.lang.String navn, java.lang.String adresse, java.lang.String postnummer, java.lang.String CVRnummer) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://ws.rki.dk/TilmeldFirma");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://ws.rki.dk/", "TilmeldFirma"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {aksnoegle, akskode, brugernavn, password, referenceNummer, navn, adresse, postnummer, CVRnummer});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.inter.exe.webservice.client.rki.TilmeldData) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.inter.exe.webservice.client.rki.TilmeldData) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.inter.exe.webservice.client.rki.TilmeldData.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.inter.exe.webservice.client.rki.TilmeldData tilmeldFirmaKob(java.lang.String aksnoegle, java.lang.String akskode, java.lang.String brugernavn, java.lang.String password, java.lang.String referenceNummer, java.lang.String KOBnummer) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://ws.rki.dk/TilmeldFirmaKob");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://ws.rki.dk/", "TilmeldFirmaKob"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {aksnoegle, akskode, brugernavn, password, referenceNummer, KOBnummer});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.inter.exe.webservice.client.rki.TilmeldData) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.inter.exe.webservice.client.rki.TilmeldData) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.inter.exe.webservice.client.rki.TilmeldData.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.inter.exe.webservice.client.rki.TilmeldData tilmeldFirmaCVR(java.lang.String aksnoegle, java.lang.String akskode, java.lang.String brugernavn, java.lang.String password, java.lang.String referenceNummer, java.lang.String CVRnummer) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://ws.rki.dk/TilmeldFirmaCVR");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://ws.rki.dk/", "TilmeldFirmaCVR"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {aksnoegle, akskode, brugernavn, password, referenceNummer, CVRnummer});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.inter.exe.webservice.client.rki.TilmeldData) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.inter.exe.webservice.client.rki.TilmeldData) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.inter.exe.webservice.client.rki.TilmeldData.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.inter.exe.webservice.client.rki.TilmeldData tilmeldUbestemt(java.lang.String aksnoegle, java.lang.String akskode, java.lang.String brugernavn, java.lang.String password, java.lang.String referenceNummer, java.lang.String navn, java.lang.String adresse, java.lang.String postnummer) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://ws.rki.dk/TilmeldUbestemt");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://ws.rki.dk/", "TilmeldUbestemt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {aksnoegle, akskode, brugernavn, password, referenceNummer, navn, adresse, postnummer});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.inter.exe.webservice.client.rki.TilmeldData) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.inter.exe.webservice.client.rki.TilmeldData) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.inter.exe.webservice.client.rki.TilmeldData.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.inter.exe.webservice.client.rki.TjekListe tjek(java.lang.String aksnoegle, java.lang.String akskode, java.lang.String brugernavn, java.lang.String password) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://ws.rki.dk/Tjek");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://ws.rki.dk/", "Tjek"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {aksnoegle, akskode, brugernavn, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.inter.exe.webservice.client.rki.TjekListe) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.inter.exe.webservice.client.rki.TjekListe) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.inter.exe.webservice.client.rki.TjekListe.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.inter.exe.webservice.client.rki.HentData hent(java.lang.String aksnoegle, java.lang.String akskode, java.lang.String brugernavn, java.lang.String password, java.lang.String referencenummer) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://ws.rki.dk/Hent");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://ws.rki.dk/", "Hent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {aksnoegle, akskode, brugernavn, password, referencenummer});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.inter.exe.webservice.client.rki.HentData) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.inter.exe.webservice.client.rki.HentData) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.inter.exe.webservice.client.rki.HentData.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.inter.exe.webservice.client.rki.StatistikData statistik(java.lang.String aksnoegle, java.lang.String akskode, java.lang.String brugernavn, java.lang.String password) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://ws.rki.dk/Statistik");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://ws.rki.dk/", "Statistik"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {aksnoegle, akskode, brugernavn, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.inter.exe.webservice.client.rki.StatistikData) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.inter.exe.webservice.client.rki.StatistikData) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.inter.exe.webservice.client.rki.StatistikData.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.inter.exe.webservice.client.rki.AfmeldData afmeld(java.lang.String akskode, java.lang.String brugernavn, java.lang.String password, java.lang.String referencenummer) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://ws.rki.dk/Afmeld");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://ws.rki.dk/", "Afmeld"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {akskode, brugernavn, password, referencenummer});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.inter.exe.webservice.client.rki.AfmeldData) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.inter.exe.webservice.client.rki.AfmeldData) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.inter.exe.webservice.client.rki.AfmeldData.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.asiainfo.crm.inter.exe.webservice.client.rki.EffektueretData effektueret(java.lang.String aksnoegle, java.lang.String akskode, java.lang.String brugernavn, java.lang.String password, java.lang.String referencenummer, java.lang.String beskedId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("https://ws.rki.dk/Effektueret");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://ws.rki.dk/", "Effektueret"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {aksnoegle, akskode, brugernavn, password, referencenummer, beskedId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.asiainfo.crm.inter.exe.webservice.client.rki.EffektueretData) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.asiainfo.crm.inter.exe.webservice.client.rki.EffektueretData) org.apache.axis.utils.JavaUtils.convert(_resp, com.asiainfo.crm.inter.exe.webservice.client.rki.EffektueretData.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    protected SOAPHeaderElement getRequestHeaders() throws org.apache.axis.AxisFault{        
    	SOAPHeaderElement soapHeaderElement = new SOAPHeaderElement(new QName("soa",
    		        "RequestHeader"));
    	String appKey = "8000000001";
 		String date8 = new SimpleDateFormat("yyyyMMdd").format(new Date());
		String date10=CommonUtil.getTransactionNum(1999999999, 10);
 		String transactionID = appKey+date8+date10;
 		String ReqTime=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
 		String staffId=null;
 		String tenantId=null;
 		UserInfoInterface user = SessionManager.getUser();
		if(null!=user){
			tenantId=user.getTenantId();
			staffId=user.get("STAFF_ID").toString();
		}
    	 try {
    		soapHeaderElement.setPrefix("soa");
            soapHeaderElement.setNamespaceURI("http://soa.ailk.telenor.com/wsdl/soa");
			soapHeaderElement.addChild(new MessageElement(new QName("AppKey"), "8000000001"));
			soapHeaderElement.addChild(new MessageElement(new QName("TransactionID"), transactionID));
			soapHeaderElement.addChild(new MessageElement(new QName("ReqTime"), ReqTime));
			soapHeaderElement.addChild(new MessageElement(new QName("Version"),"0.1"));
			soapHeaderElement.addChild(new MessageElement(new QName("AcceptChannelType"), "23"));
			soapHeaderElement.addChild(new MessageElement(new QName("TenantId"), tenantId));
			soapHeaderElement.addChild(new MessageElement(new QName("AcceptStaffId"), staffId));
			soapHeaderElement.addChild(new MessageElement(new QName("AcceptOpId"), 1));
		} catch (SOAPException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			log.error(e);
		}
    	 return soapHeaderElement;
    }
}
