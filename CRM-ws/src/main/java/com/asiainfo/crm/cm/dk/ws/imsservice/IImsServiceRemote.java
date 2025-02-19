/**
 * IImsServiceRemote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.cm.dk.ws.imsservice;

public interface IImsServiceRemote extends javax.xml.rpc.Service {
    public java.lang.String getIImsServiceAddress();

    public com.asiainfo.crm.cm.dk.ws.imsservice.IImsServiceWs getIImsService() throws javax.xml.rpc.ServiceException;

    public com.asiainfo.crm.cm.dk.ws.imsservice.IImsServiceWs getIImsService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
