package com.asiainfo.crm.inter.exe.webservice.client.poa;

public class AgreementGetPortProxy implements com.asiainfo.crm.inter.exe.webservice.client.poa.AgreementGetPort {
  private String _endpoint = null;
  private com.asiainfo.crm.inter.exe.webservice.client.poa.AgreementGetPort agreementGetPort = null;
  
  public AgreementGetPortProxy() {
    _initAgreementGetPortProxy();
  }
  
  public AgreementGetPortProxy(String endpoint) {
    _endpoint = endpoint;
    _initAgreementGetPortProxy();
  }
  
  private void _initAgreementGetPortProxy() {
    try {
      agreementGetPort = (new com.asiainfo.crm.inter.exe.webservice.client.poa.AgreementGetServiceLocator()).getAgreementGetPort();
      if (agreementGetPort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)agreementGetPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)agreementGetPort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (agreementGetPort != null)
      ((javax.xml.rpc.Stub)agreementGetPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.asiainfo.crm.inter.exe.webservice.client.poa.AgreementGetPort getAgreementGetPort() {
    if (agreementGetPort == null)
      _initAgreementGetPortProxy();
    return agreementGetPort;
  }
  
  public com.asiainfo.crm.inter.exe.webservice.client.poa.AgreementGetResponse agreementGet(com.asiainfo.crm.inter.exe.webservice.client.poa.AgreementGetRequest parameters) throws java.rmi.RemoteException{
    if (agreementGetPort == null)
      _initAgreementGetPortProxy();
    return agreementGetPort.agreementGet(parameters);
  }
  
  
}