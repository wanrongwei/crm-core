package com.asiainfo.crm.inter.exe.webservice.client.admin;

public class GetFilteredAdminsByCustomerIdUsingGETPortProxy implements com.asiainfo.crm.inter.exe.webservice.client.admin.GetFilteredAdminsByCustomerIdUsingGETPort {
  private String _endpoint = null;
  private com.asiainfo.crm.inter.exe.webservice.client.admin.GetFilteredAdminsByCustomerIdUsingGETPort getFilteredAdminsByCustomerIdUsingGETPort = null;
  
  public GetFilteredAdminsByCustomerIdUsingGETPortProxy() {
    _initGetFilteredAdminsByCustomerIdUsingGETPortProxy();
  }
  
  public GetFilteredAdminsByCustomerIdUsingGETPortProxy(String endpoint) {
    _endpoint = endpoint;
    _initGetFilteredAdminsByCustomerIdUsingGETPortProxy();
  }
  
  private void _initGetFilteredAdminsByCustomerIdUsingGETPortProxy() {
    try {
      getFilteredAdminsByCustomerIdUsingGETPort = (new com.asiainfo.crm.inter.exe.webservice.client.admin.GetFilteredAdminsByCustomerIdUsingGETServiceLocator()).getgetFilteredAdminsByCustomerIdUsingGETPort();
      if (getFilteredAdminsByCustomerIdUsingGETPort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)getFilteredAdminsByCustomerIdUsingGETPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)getFilteredAdminsByCustomerIdUsingGETPort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (getFilteredAdminsByCustomerIdUsingGETPort != null)
      ((javax.xml.rpc.Stub)getFilteredAdminsByCustomerIdUsingGETPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.asiainfo.crm.inter.exe.webservice.client.admin.GetFilteredAdminsByCustomerIdUsingGETPort getGetFilteredAdminsByCustomerIdUsingGETPort() {
    if (getFilteredAdminsByCustomerIdUsingGETPort == null)
      _initGetFilteredAdminsByCustomerIdUsingGETPortProxy();
    return getFilteredAdminsByCustomerIdUsingGETPort;
  }
  
  public GetFilteredAdminsByCustomerIdUsingGETResponse getFilteredAdminsByCustomerIdUsingGET(GetFilteredAdminsByCustomerIdUsingGETRequest parameters) throws java.rmi.RemoteException{
    if (getFilteredAdminsByCustomerIdUsingGETPort == null)
      _initGetFilteredAdminsByCustomerIdUsingGETPortProxy();
    return getFilteredAdminsByCustomerIdUsingGETPort.getFilteredAdminsByCustomerIdUsingGET(parameters);
  }
  
  
}