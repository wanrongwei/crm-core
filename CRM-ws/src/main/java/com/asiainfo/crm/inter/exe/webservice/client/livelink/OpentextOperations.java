/**
 * OpentextOperations.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis #axisVersion# #today# WSDL2Java emitter.
 */

package com.asiainfo.crm.inter.exe.webservice.client.livelink;

public interface OpentextOperations extends java.rmi.Remote {
    public void createDocument(java.lang.String sessionId, java.lang.String countryCode, java.lang.String name, java.lang.String size, java.lang.String barcode, java.lang.String documentType, com.asiainfo.crm.inter.exe.webservice.client.livelink.MetadataStructureType metadata, java.util.Calendar createDate, java.util.Calendar lastModifyDate, java.lang.String mimeType, byte[] content, javax.xml.rpc.holders.StringHolder status, javax.xml.rpc.holders.StringHolder documentId) throws java.rmi.RemoteException;
    public void getDocument(java.lang.String sessionId, java.lang.String countryCode, java.lang.String documentType, java.lang.String documentId, javax.xml.rpc.holders.StringHolder status, javax.xml.rpc.holders.StringHolder mimeType, javax.xml.rpc.holders.ByteArrayHolder content) throws java.rmi.RemoteException;
    public void getDocumentByBarcode(java.lang.String sessionId, java.lang.String countryCode, java.lang.String documentType, java.lang.String barcode, javax.xml.rpc.holders.StringHolder status, javax.xml.rpc.holders.StringHolder mimeType, javax.xml.rpc.holders.ByteArrayHolder content) throws java.rmi.RemoteException;
    public void deleteDocument(java.lang.String sessionId, java.lang.String countryCode, java.lang.String documentType, java.lang.String[] documentIds, javax.xml.rpc.holders.StringHolder status, com.asiainfo.crm.inter.exe.webservice.client.livelink.holders.DeleteResponseTypeArrayHolder deteleDocumentResponse) throws java.rmi.RemoteException;
    public java.lang.String assignMetadata(java.lang.String sessionId, java.lang.String countryCode, java.lang.String documentType, java.lang.String documentId, com.asiainfo.crm.inter.exe.webservice.client.livelink.MetadataStructureType metadata) throws java.rmi.RemoteException;
    public void authentication(java.lang.String userName, byte[] password, javax.xml.rpc.holders.StringHolder status, javax.xml.rpc.holders.StringHolder sessionId) throws java.rmi.RemoteException;
}
