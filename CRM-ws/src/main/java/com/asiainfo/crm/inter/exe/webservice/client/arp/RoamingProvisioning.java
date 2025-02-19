/**
 * RoamingProvisioning.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.arp;

public interface RoamingProvisioning extends javax.xml.rpc.Service {

/**
 * ***add URI to OMA documentation here***
 */
    public java.lang.String getServiceUpdateAddress();

    public com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceUpdate_PortType getServiceUpdate() throws javax.xml.rpc.ServiceException;

    public com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceUpdate_PortType getServiceUpdate(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getServiceDeactivationAddress();

    public com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceDeactivation_PortType getServiceDeactivation() throws javax.xml.rpc.ServiceException;

    public com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceDeactivation_PortType getServiceDeactivation(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getServiceSuspensionAddress();

    public com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceSuspension_PortType getServiceSuspension() throws javax.xml.rpc.ServiceException;

    public com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceSuspension_PortType getServiceSuspension(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getServiceActivationAddress();

    public com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceActivation_PortType getServiceActivation() throws javax.xml.rpc.ServiceException;

    public com.asiainfo.crm.inter.exe.webservice.client.arp.ServiceActivation_PortType getServiceActivation(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
