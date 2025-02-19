/**
 * OpenTextDMSInterfaceSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.livelink;

public class OpenTextDMSInterfaceSOAPImpl implements com.asiainfo.crm.inter.exe.webservice.client.livelink.OpentextOperations{
    public void createDocument(java.lang.String sessionId, java.lang.String countryCode, java.lang.String name, java.lang.String size, java.lang.String barcode, java.lang.String documentType, com.asiainfo.crm.inter.exe.webservice.client.livelink.MetadataStructureType metadata, java.util.Calendar createDate, java.util.Calendar lastModifyDate, java.lang.String mimeType, byte[] content, javax.xml.rpc.holders.StringHolder status, javax.xml.rpc.holders.StringHolder documentId) throws java.rmi.RemoteException {
        status.value = new java.lang.String();
        documentId.value = new java.lang.String();
    }

    public void getDocument(java.lang.String sessionId, java.lang.String countryCode, java.lang.String documentType, java.lang.String documentId, javax.xml.rpc.holders.StringHolder status, javax.xml.rpc.holders.StringHolder mimeType, javax.xml.rpc.holders.ByteArrayHolder content) throws java.rmi.RemoteException {
        status.value = new java.lang.String();
        mimeType.value = new java.lang.String();
        content.value = new byte[0];
    }

    public void getDocumentByBarcode(java.lang.String sessionId, java.lang.String countryCode, java.lang.String documentType, java.lang.String barcode, javax.xml.rpc.holders.StringHolder status, javax.xml.rpc.holders.StringHolder mimeType, javax.xml.rpc.holders.ByteArrayHolder content) throws java.rmi.RemoteException {
        status.value = new java.lang.String();
        mimeType.value = new java.lang.String();
        content.value = new byte[0];
    }

    public void deleteDocument(java.lang.String sessionId, java.lang.String countryCode, java.lang.String documentType, java.lang.String[] documentIds, javax.xml.rpc.holders.StringHolder status, com.asiainfo.crm.inter.exe.webservice.client.livelink.holders.DeleteResponseTypeArrayHolder deteleDocumentResponse) throws java.rmi.RemoteException {
        status.value = new java.lang.String();
        deteleDocumentResponse.value = new com.asiainfo.crm.inter.exe.webservice.client.livelink.DeleteResponseType[0];
    }

    public java.lang.String assignMetadata(java.lang.String sessionId, java.lang.String countryCode, java.lang.String documentType, java.lang.String documentId, com.asiainfo.crm.inter.exe.webservice.client.livelink.MetadataStructureType metadata) throws java.rmi.RemoteException {
        return null;
    }

    public void authentication(java.lang.String userName, byte[] password, javax.xml.rpc.holders.StringHolder status, javax.xml.rpc.holders.StringHolder sessionId) throws java.rmi.RemoteException {
        status.value = new java.lang.String();
        sessionId.value = new java.lang.String();
    }

}
