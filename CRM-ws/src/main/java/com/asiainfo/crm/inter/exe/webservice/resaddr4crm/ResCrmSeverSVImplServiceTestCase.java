///**
// * ResCrmSeverSVImplServiceTestCase.java
// *
// * This file was auto-generated from WSDL
// * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
// */
//
//package com.asiainfo.crm.inter.exe.webservice.resaddr4crm;
//
//public class ResCrmSeverSVImplServiceTestCase extends junit.framework.TestCase {
//    public ResCrmSeverSVImplServiceTestCase(java.lang.String name) {
//        super(name);
//    }
//
//    public void testRESaddr4CRMWSDL() throws Exception {
//        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
//        java.net.URL url = new java.net.URL(new ResCrmSeverSVImplServiceLocator().getRESaddr4CRMAddress() + "?WSDL");
//        javax.xml.rpc.Service service = serviceFactory.createService(url, new ResCrmSeverSVImplServiceLocator().getServiceName());
//        assertTrue(service != null);
//    }
//
//    public void test1RESaddr4CRMGetAddress() throws Exception {
//        RESaddr4CRMSoapBindingStub binding;
//        try {
//            binding = (RESaddr4CRMSoapBindingStub)
//                          new ResCrmSeverSVImplServiceLocator().getRESaddr4CRM();
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
//        java.lang.String value = null;
//        value = binding.getAddress(new java.lang.String(), new java.lang.String());
//        // TBD - validate results
//    }
//
//    public void test2RESaddr4CRMSaveAddress() throws Exception {
//        RESaddr4CRMSoapBindingStub binding;
//        try {
//            binding = (RESaddr4CRMSoapBindingStub)
//                          new ResCrmSeverSVImplServiceLocator().getRESaddr4CRM();
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
//        java.lang.String value = null;
//        value = binding.saveAddress(new java.lang.String(), new java.lang.String());
//        // TBD - validate results
//    }
//
//}
