package com.asiainfo.crm.so.exe.ws.crmcallams.esimqueryqrservice;

public class UnreleaseProfilePortProxy implements UnreleaseProfilePort {
  private String _endpoint = null;
  private UnreleaseProfilePort unreleaseProfilePort = null;
  
  public UnreleaseProfilePortProxy() {
    _initUnreleaseProfilePortProxy();
  }
  
  public UnreleaseProfilePortProxy(String endpoint) {
    _endpoint = endpoint;
    _initUnreleaseProfilePortProxy();
  }
  
  private void _initUnreleaseProfilePortProxy() {
    try {
      unreleaseProfilePort = (new UnreleaseProfileServiceLocator()).getUnreleaseProfilePort();
      if (unreleaseProfilePort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)unreleaseProfilePort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)unreleaseProfilePort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (unreleaseProfilePort != null)
      ((javax.xml.rpc.Stub)unreleaseProfilePort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public UnreleaseProfilePort getUnreleaseProfilePort() {
    if (unreleaseProfilePort == null)
      _initUnreleaseProfilePortProxy();
    return unreleaseProfilePort;
  }
  
  public UnreleaseProfileResponse unreleaseProfile(UnreleaseProfileRequest parameters) throws java.rmi.RemoteException{
    if (unreleaseProfilePort == null)
      _initUnreleaseProfilePortProxy();
    return unreleaseProfilePort.unreleaseProfile(parameters);
  }
  
  public CancelOrderResponse cancelOrder(CancelOrderRequest parameters) throws java.rmi.RemoteException{
    if (unreleaseProfilePort == null)
      _initUnreleaseProfilePortProxy();
    return unreleaseProfilePort.cancelOrder(parameters);
  }
  
  public DownloadOrderResponse downloadOrder(DownloadOrderRequest parameters) throws java.rmi.RemoteException{
    if (unreleaseProfilePort == null)
      _initUnreleaseProfilePortProxy();
    return unreleaseProfilePort.downloadOrder(parameters);
  }
  
  
}