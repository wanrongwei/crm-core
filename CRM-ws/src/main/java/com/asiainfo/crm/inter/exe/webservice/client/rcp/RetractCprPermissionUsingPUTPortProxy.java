package com.asiainfo.crm.inter.exe.webservice.client.rcp;

public class RetractCprPermissionUsingPUTPortProxy implements com.asiainfo.crm.inter.exe.webservice.client.rcp.RetractCprPermissionUsingPUTPort {
  private String _endpoint = null;
  private com.asiainfo.crm.inter.exe.webservice.client.rcp.RetractCprPermissionUsingPUTPort retractCprPermissionUsingPUTPort = null;
  
  public RetractCprPermissionUsingPUTPortProxy() {
    _initRetractCprPermissionUsingPUTPortProxy();
  }
  
  public RetractCprPermissionUsingPUTPortProxy(String endpoint) {
    _endpoint = endpoint;
    _initRetractCprPermissionUsingPUTPortProxy();
  }
  
  private void _initRetractCprPermissionUsingPUTPortProxy() {
    try {
      retractCprPermissionUsingPUTPort = (new com.asiainfo.crm.inter.exe.webservice.client.rcp.RetractCprPermissionUsingPUTServiceLocator()).getretractCprPermissionUsingPUTPort();
      if (retractCprPermissionUsingPUTPort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)retractCprPermissionUsingPUTPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)retractCprPermissionUsingPUTPort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (retractCprPermissionUsingPUTPort != null)
      ((javax.xml.rpc.Stub)retractCprPermissionUsingPUTPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.asiainfo.crm.inter.exe.webservice.client.rcp.RetractCprPermissionUsingPUTPort getRetractCprPermissionUsingPUTPort() {
    if (retractCprPermissionUsingPUTPort == null)
      _initRetractCprPermissionUsingPUTPortProxy();
    return retractCprPermissionUsingPUTPort;
  }
  
  public com.asiainfo.crm.inter.exe.webservice.client.rcp.RetractCprPermissionUsingPUTResponse retractCprPermissionUsingPUT(com.asiainfo.crm.inter.exe.webservice.client.rcp.RetractCprPermissionUsingPUTRequest parameters) throws java.rmi.RemoteException{
    if (retractCprPermissionUsingPUTPort == null)
      _initRetractCprPermissionUsingPUTPortProxy();
    return retractCprPermissionUsingPUTPort.retractCprPermissionUsingPUT(parameters);
  }
  
  
}