/**
 * DHCP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.so.exe.ws.crmcallams.secure;

public interface DHCP extends java.rmi.Remote {
    public AddStaticIPToCoasSubscriberResponse addStaticIPToCoasSubscriber(AddStaticIPToCoasSubscriberRequest parameters) throws java.rmi.RemoteException;
    public DeleteStaticIPToCoasSubscriberResponse deleteStaticIPToCoasSubscriber(DeleteStaticIPToCoasSubscriberRequest parameters) throws java.rmi.RemoteException;
    public GetAllStaticIPsAssignedListResponse getAllStaticIPsAssignedList(GetAllStaticIPsAssignedListRequest parameters) throws java.rmi.RemoteException;
    public GetStatusDSLFiberResponse getStatusDSLFiber(GetStatusDSLFiberRequest parameters) throws java.rmi.RemoteException;
    public ProvisioDSLFiberResponse provisioDSLFiber(ProvisioDSLFiberRequest parameters) throws java.rmi.RemoteException;
    public RemoveDSLFiberResponse removeDSLFiber(RemoveDSLFiberRequest parameters) throws java.rmi.RemoteException;
    public GetStatusCoaxResponse getStatusCoax(GetStatusCoaxRequest parameters) throws java.rmi.RemoteException;
    public ProvisionCoaxResponse provisionCoax(ProvisionCoaxRequest parameters) throws java.rmi.RemoteException;
    public RemoveCoaxResponse removeCoax(RemoveCoaxRequest parameters) throws java.rmi.RemoteException;
    public RemoveCoaxOneResponse removeCoaxOne(RemoveCoaxOneRequest parameters) throws java.rmi.RemoteException;
}
