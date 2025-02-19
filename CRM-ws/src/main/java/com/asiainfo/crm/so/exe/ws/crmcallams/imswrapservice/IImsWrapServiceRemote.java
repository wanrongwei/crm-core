/**
 * IImsWrapServiceRemote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice;

public interface IImsWrapServiceRemote extends javax.xml.rpc.Service {
    public java.lang.String getIImsWrapServiceAddress();

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.IImsWrapServiceWs getIImsWrapService() throws javax.xml.rpc.ServiceException;

    public com.asiainfo.crm.so.exe.ws.crmcallams.imswrapservice.IImsWrapServiceWs getIImsWrapService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
