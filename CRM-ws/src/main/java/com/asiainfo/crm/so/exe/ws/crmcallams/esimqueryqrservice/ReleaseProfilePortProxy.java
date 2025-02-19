package com.asiainfo.crm.so.exe.ws.crmcallams.esimqueryqrservice;

public class ReleaseProfilePortProxy implements ReleaseProfilePort {
  private String _endpoint = null;
  private ReleaseProfilePort releaseProfilePort = null;
  
  public ReleaseProfilePortProxy() {
    _initReleaseProfilePortProxy();
  }
  
  public ReleaseProfilePortProxy(String endpoint) {
    _endpoint = endpoint;
    _initReleaseProfilePortProxy();
  }
  
  private void _initReleaseProfilePortProxy() {
    try {
      releaseProfilePort = (new ReleaseProfilePortBindingQSServiceLocator()).getReleaseProfilePortBindingQSPort();
      if (releaseProfilePort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)releaseProfilePort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)releaseProfilePort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (releaseProfilePort != null)
      ((javax.xml.rpc.Stub)releaseProfilePort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ReleaseProfilePort getReleaseProfilePort() {
    if (releaseProfilePort == null)
      _initReleaseProfilePortProxy();
    return releaseProfilePort;
  }
  
  public ReleaseProfileResponse releaseProfile(ReleaseProfileRequest parameters) throws java.rmi.RemoteException{
    if (releaseProfilePort == null)
      _initReleaseProfilePortProxy();
    return releaseProfilePort.releaseProfile(parameters);
  }
  
  
}