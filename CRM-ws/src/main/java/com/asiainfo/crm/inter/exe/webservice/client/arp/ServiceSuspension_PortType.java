/**
 * ServiceSuspension_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.arp;

public interface ServiceSuspension_PortType extends java.rmi.Remote {
    public com.asiainfo.crm.inter.exe.webservice.client.arp.Ack roamingSuspended(com.asiainfo.crm.inter.exe.webservice.client.arp.RoamingSuspended body) throws java.rmi.RemoteException, com.asiainfo.crm.inter.exe.webservice.client.arp.PolicyException, com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceException;
    public com.asiainfo.crm.inter.exe.webservice.client.arp.Ack roamingUnSuspended(com.asiainfo.crm.inter.exe.webservice.client.arp.RoamingUnSuspended body) throws java.rmi.RemoteException, com.asiainfo.crm.inter.exe.webservice.client.arp.PolicyException, com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceException;
}
