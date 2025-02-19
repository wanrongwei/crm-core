/**
 * EdocumentStoragePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.livelink;

public interface EdocumentStoragePortType extends java.rmi.Remote {
    public com.asiainfo.crm.inter.exe.webservice.client.livelink.CreateDocumentResponseBody createDocument(com.asiainfo.crm.inter.exe.webservice.client.livelink.CreateDocumentRequestBody requestBody) throws java.rmi.RemoteException;
    public com.asiainfo.crm.inter.exe.webservice.client.livelink.GetDocumentResponseBody getDocument(com.asiainfo.crm.inter.exe.webservice.client.livelink.GetDocumentRequestBody requestBody) throws java.rmi.RemoteException;
    public com.asiainfo.crm.inter.exe.webservice.client.livelink.GetDocumentByBarcodeResponseBody getDocumentByBarcode(com.asiainfo.crm.inter.exe.webservice.client.livelink.GetDocumentByBarcodeRequestBody requestBody) throws java.rmi.RemoteException;
    public com.asiainfo.crm.inter.exe.webservice.client.livelink.DeleteDocumentResponseBody deleteDocument(com.asiainfo.crm.inter.exe.webservice.client.livelink.DeleteDocumentRequestBody requestBody) throws java.rmi.RemoteException;
    public com.asiainfo.crm.inter.exe.webservice.client.livelink.AssignMetadataResponseBody assignMetadata(com.asiainfo.crm.inter.exe.webservice.client.livelink.AssignMetadataRequestBody requestBody) throws java.rmi.RemoteException;
    public com.asiainfo.crm.inter.exe.webservice.client.livelink.AuthenticationResponseBody authentication(com.asiainfo.crm.inter.exe.webservice.client.livelink.AuthenticationRequestBody requestBody) throws java.rmi.RemoteException;
    public com.asiainfo.crm.inter.exe.webservice.client.livelink.SignDocumentLTVResponseBody signDocumentLTV(com.asiainfo.crm.inter.exe.webservice.client.livelink.SignDocumentLTVRequestBody requestBody) throws java.rmi.RemoteException;
    public com.asiainfo.crm.inter.exe.webservice.client.livelink.SignDocumentWithSigTimestampResponseBody signDocumentWithSigTimestamp(com.asiainfo.crm.inter.exe.webservice.client.livelink.SignDocumentWithSigTimestampRequestBody requestBody) throws java.rmi.RemoteException;
}
