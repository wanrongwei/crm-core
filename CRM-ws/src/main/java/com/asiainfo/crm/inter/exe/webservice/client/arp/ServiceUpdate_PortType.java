/**
 * ServiceUpdate_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.arp;

public interface ServiceUpdate_PortType extends java.rmi.Remote {
    public com.asiainfo.crm.inter.exe.webservice.client.arp.Ack notifyReProvision(com.asiainfo.crm.inter.exe.webservice.client.arp.ReProvisioningNotification body) throws java.rmi.RemoteException, com.asiainfo.crm.inter.exe.webservice.client.arp.PolicyException, com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceException;
    public com.asiainfo.crm.inter.exe.webservice.client.arp.Ack acknowledgeReProvision(com.asiainfo.crm.inter.exe.webservice.client.arp.ReProvisioningRequestAcknowledgement body) throws java.rmi.RemoteException, com.asiainfo.crm.inter.exe.webservice.client.arp.PolicyException, com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceException;
    public com.asiainfo.crm.inter.exe.webservice.client.arp.Ack completeReProvision(com.asiainfo.crm.inter.exe.webservice.client.arp.ReProvisioningCompletion body) throws java.rmi.RemoteException, com.asiainfo.crm.inter.exe.webservice.client.arp.PolicyException, com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceException;
}
