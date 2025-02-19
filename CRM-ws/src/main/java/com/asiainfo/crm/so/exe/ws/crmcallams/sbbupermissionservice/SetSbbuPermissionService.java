/**
 * SBBUpermissionService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.sbbupermissionservice;

public interface SetSbbuPermissionService extends javax.xml.rpc.Service {

/**
 * OSB Service
 */
    public java.lang.String getSBBUpermissionPortAddress();

    public com.asiainfo.crm.so.exe.ws.crmcallams.sbbupermissionservice.SetSbbuPermissionPort_PortType getSBBUpermissionPort() throws javax.xml.rpc.ServiceException;

    public com.asiainfo.crm.so.exe.ws.crmcallams.sbbupermissionservice.SetSbbuPermissionPort_PortType getSBBUpermissionPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
