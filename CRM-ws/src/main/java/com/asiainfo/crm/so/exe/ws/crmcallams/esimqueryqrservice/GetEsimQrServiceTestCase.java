///**
// * SBBUpermissionServiceTestCase.java
// *
// * This file was auto-generated from WSDL
// * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
// */
//
//package com.asiainfo.crm.so.exe.ws.crmcallams.esimqueryqrservice;
//
//import com.asiainfo.appframe.ext.exeframe.msg.jetty.util.ajax.JSON;
//import com.asiainfo.crm.so.exe.ws.crmcallams.EsimQueryQrServiceClient;
//
//import java.util.Map;
//
//public class GetEsimQrServiceTestCase extends junit.framework.TestCase {
//    public GetEsimQrServiceTestCase(String name) {
//        super(name);
//    }
//
//
//    public void test1SBBUpermissionPortSBBUpermission() throws Exception {
//        GetEsimQRbyIccIDPortBindingStub binding;
//        try {
//            binding = (GetEsimQRbyIccIDPortBindingStub)
//                          new GetEsimQRbyIccIDServiceLocator().getGetEsimQRbyIccIDPort();
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
//        GetEsimQRbyIccIDResponse value = null;
//        GetEsimQRbyIccIDRequestBody reqestBody = new GetEsimQRbyIccIDRequestBody();
//		reqestBody.setIccId("1111");
//		reqestBody.setFormat("png1");
//        GetEsimQRbyIccIDRequest request=new GetEsimQRbyIccIDRequest();
//		request.setRequestBody(reqestBody);
//        value = binding.getEsimQRbyIccID(request);
//        System.out.println(value.getResponseBody().getResults());
//        // TBD - validate results
//    }
//
//    public void test1JsonToMap() throws Exception {
//        String json = "{\n" +
//                "    \"statusHeader\": {\n" +
//                "        \"status\": \"Executed-Failed\",\n" +
//                "        \"statusCodeData\": {\n" +
//                "          \"subjectCode\": \"8.2.1\",\n" +
//                "          \"reasonCode\": \"3.9\",\n" +
//                "          \"subjectIdentifier\": \"Profile ICCID\",\n" +
//                "          \"message\": \"Unknown\"\n" +
//                "        }\n" +
//                "     },\n" +
//                "     \"data\": \"1111\"\n" +
//                "}";
//        Map parse = (Map) JSON.parse(json);
//        String data = parse.get("data").toString();
//        System.out.println(data);
//
//        Map statusHeaderMap = (Map) parse.get("statusHeader");
//
//        String status = statusHeaderMap.get("status").toString();
//        System.out.println(status);
//
//        Map statusCodeData = (Map) statusHeaderMap.get("statusCodeData");
//        System.out.println(statusCodeData.get("subjectCode"));
//        System.out.println(statusCodeData.get("message"));
//
//    }
//
//    public void testEsimProfileStatus() throws Exception{
//
//        EsimQueryQrServiceClient client = EsimQueryQrServiceClient.getInstance();
//        String requestJson = "{\"requesterIdentifier\":\"1.3.6.1.4.1.13353\",\"callIdentifier\":\"TX-567\",\"iccids\":[\"8945020236801858451\",\"8945020236801858452\"]}";
//        EsimProfilesStatusResponseBean responseBean = client.getEsimProfilesStatus(111L,requestJson);
//        System.out.println(responseBean.getProfileStatuses()[0].getState());
//    }
//
//    public void testReleaseProfile() throws Exception{
//
//        EsimQueryQrServiceClient client = EsimQueryQrServiceClient.getInstance();
//        String requestJson = "{\"acToken\":null,\"callIdentifier\":\"TX-567\",\"iccid\":\"8945020201602022053\",\"requesterIdentifier\":\"1.3.6.1.4.1.13353\"}";
//        ReleaseProfileResponseBean responseBean = client.releaseProfile(111L,requestJson);
//        System.out.println(responseBean.getProfileStatus());
//    }
//}
