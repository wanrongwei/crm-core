///**
// * SBBUpermissionServiceTestCase.java
// *
// * This file was auto-generated from WSDL
// * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
// */
//
//package com.asiainfo.crm.so.exe.ws.crmcallams.sbbupermissionservice;
//
//import com.itrus.server.tools.log;
//
//public class SetSbbuPermissionServiceTestCase extends junit.framework.TestCase {
//    public SetSbbuPermissionServiceTestCase(java.lang.String name) {
//        super(name);
//    }
//
//    public void testSBBUpermissionPortWSDL() throws Exception {
//        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
//        java.net.URL url = new java.net.URL(new com.asiainfo.crm.so.exe.ws.crmcallams.sbbupermissionservice.SetSbbuPermissionServiceLocator().getSBBUpermissionPortAddress() + "?WSDL");
//        javax.xml.rpc.Service service = serviceFactory.createService(url, new com.asiainfo.crm.so.exe.ws.crmcallams.sbbupermissionservice.SetSbbuPermissionServiceLocator().getServiceName());
//        assertTrue(service != null);
//    }
//
//    public void test1SBBUpermissionPortSBBUpermission() throws Exception {
//        com.asiainfo.crm.so.exe.ws.crmcallams.sbbupermissionservice.SetSbbuPermissionPortBindingStub binding;
//        try {
//            binding = (com.asiainfo.crm.so.exe.ws.crmcallams.sbbupermissionservice.SetSbbuPermissionPortBindingStub)
//                          new com.asiainfo.crm.so.exe.ws.crmcallams.sbbupermissionservice.SetSbbuPermissionServiceLocator().getSBBUpermissionPort();
//        }
//        catch (javax.xml.rpc.ServiceException jre) {
//            if(jre.getLinkedCause()!=null)
//                jre.getLinkedCause().printStackTrace();
//            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
//        }
//        assertNotNull("binding is null", binding);
//
//        // Time out after a minute
//        binding.setTimeout(60000);
//
//        // Test operation
//        com.asiainfo.crm.so.exe.ws.crmcallams.sbbupermissionservice.SetSbbuPermissionResponse value = null;
//        SetSbbuPermissionRequestBody reqestBody = new SetSbbuPermissionRequestBody();
//		reqestBody.setCustomerID("1111");
//		SetSbbuPermissionRequest  request=new SetSbbuPermissionRequest();
//		request.setRequestBody(reqestBody);
//        value = binding.SBBUpermission(request);
//       String qqString="1";
//        // TBD - validate results
//    }
//
//}
