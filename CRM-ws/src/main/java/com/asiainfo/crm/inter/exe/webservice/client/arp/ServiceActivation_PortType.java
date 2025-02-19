/**
 * ServiceActivation_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.arp;

public interface ServiceActivation_PortType extends java.rmi.Remote {
    public com.asiainfo.crm.inter.exe.webservice.client.arp.Ack acknowledgePreProvision(com.asiainfo.crm.inter.exe.webservice.client.arp.PreProvisioningAcknowledgement body) throws java.rmi.RemoteException, com.asiainfo.crm.inter.exe.webservice.client.arp.PolicyException, com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceException;
    public com.asiainfo.crm.inter.exe.webservice.client.arp.Ack completePreProvision(com.asiainfo.crm.inter.exe.webservice.client.arp.PreProvisioningCompletion body) throws java.rmi.RemoteException, com.asiainfo.crm.inter.exe.webservice.client.arp.PolicyException, com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceException;
    public com.asiainfo.crm.inter.exe.webservice.client.arp.Ack completeProvision(com.asiainfo.crm.inter.exe.webservice.client.arp.ProvisioningCompletion body) throws java.rmi.RemoteException, com.asiainfo.crm.inter.exe.webservice.client.arp.PolicyException, com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceException;
}
