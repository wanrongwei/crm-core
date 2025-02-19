package com.asiainfo.crm.inter.exe.webservice.client.sap;

import java.rmi.RemoteException;

public class ShipmentBusinessServiceFactory {
	
	private static Boolean SLOCK = Boolean.FALSE;
	
	private static ShipmentBusinessService_ServiceLocator service = null;
	
	public static synchronized ShipmentBusinessService_ServiceLocator getService() throws Exception,RemoteException {
		if (SLOCK.equals(Boolean.FALSE)) {
            	 service = new ShipmentBusinessService_ServiceLocator ();
                    SLOCK = Boolean.TRUE;
		}
		return service;
	}

	
	public static void main(String[] args) throws Exception{
//		CancelDocRequest req = new CancelDocRequest();
//		
//		CancelDocRequestBody body = new CancelDocRequestBody();
//		body.setDocNumber("1111111111");
//		req.setRequestBody(body);
//		CancelDocResponse  resp = ShipmentBusinessServiceFactory.getService().getShipmentBusinessService().cancelDoc(req);
//		System.out.println(resp.getResponseBody().get_return());
		
//		UpdateDocRequest parameters = new UpdateDocRequest();
//		UpdateDocRequestBody body = new UpdateDocRequestBody();
//		UpdateDocSoHeaderDataUpd headerData = new UpdateDocSoHeaderDataUpd();
//		headerData.setAttentionPeople("AttentionPeople");
//		headerData.setAttentionPeople2("AttentionPeople2");
//		headerData.setAttribute1("Attribute1");
//		headerData.setAttribute2("Attribute2");
//		headerData.setAttribute3("Attribute3");
//		headerData.setAttribute4("Attribute4");
//		headerData.setStreet("Street");
//		headerData.setHouseNo("33");
//		headerData.setCity("city");
//		headerData.setCountry("country");
//		headerData.setReqDateH("err");
//		headerData.setDocNumber("22");
//		headerData.setDeliveryStart("headerData");
//		headerData.setName1("1");
//		headerData.setName2("2");
//		headerData.setPostlCode("222");
//		headerData.setPoNumber("22");
//		headerData.setPublicDomain("33HHH");
//		headerData.setFloor("222");
//		headerData.setDocNumber("333");
//		headerData.setRoomNo("12");
//		headerData.setCustType("2");
//		body.setHeaderData(headerData);
//		parameters.setRequestBody(body);
//		UpdateDocResponse resp= ShipmentBusinessServiceFactory.getService().getShipmentBusinessService().updateDoc(parameters);
//		System.out.println(resp.getResponseBody().get_return());
		
//		for(int i =1 ; i < 4 ; i++){
//			Runnable r = new Runnable(){
//				public void run() {
//					// TODO Auto-generated method stub
//					CreateDocResponse resp;
//					try {
//						resp = ShipmentBusinessServiceFactory.getService().getShipmentBusinessService().createDoc(getSomething());
//						System.out.println(resp.getResponseBody().getDocNumber());
//					} catch (Exception e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			};
//			Thread thread = new Thread(r);  
//            thread.start(); 
//		}
		
	}
	
//	public static CreateDocRequest getSomething(){
//		CreateDocRequest req = new CreateDocRequest();
//		CreateDocRequestBody body = new CreateDocRequestBody();
//		YwsSdSoControlData  cdata = new YwsSdSoControlData ();
//		cdata.setCreatedBy("dddddd");
//		cdata.setSimulate(" ");
//		cdata.setWithoutSernumCheck(" ");
//		body.setControlData(cdata);
//		YwsSoHeaderData sdata = new YwsSoHeaderData();
//		sdata.setDocType("Z200");
//		sdata.setReqDateH("");
//		sdata.setCity("DK");
//		sdata.setDistrChan("01");
//		sdata.setCustType("01");
//		sdata.setDealerId("D0000");
//		sdata.setOutletId("O1111");
//		sdata.setSourceSystem("CBB");
//		sdata.setExtDocnum("410001111111");
//		sdata.setCurrency("DKK");
////		sdata.setRate(rate);
//		sdata.setDeliveryStart("20140812");
//		sdata.setDeliveryRel(" ");
//		sdata.setCustomer("01");
//		sdata.setName1("John");
//		sdata.setName2("");
//		sdata.setPostlCode("0000");
//		sdata.setCity("DK");
//		sdata.setStreet("First");
//		sdata.setPublicDomain("ddd");
//		sdata.setHouseNo("Bo");
//		sdata.setFloor("No.3");
//		sdata.setRoomNo("Room 3");
//		body.setHeaderData(sdata);
//		YwsSoItemData[] idata = new YwsSoItemData[1];
//		idata[0] = new YwsSoItemData();
//		idata[0].setItmNumber("000010");
//		idata[0].setMaterial("100000000");
//		idata[0].setQuantity(new BigDecimal(1));
//		idata[0].setSalesUnit("PC");
//		idata[0].setNetPrice(new BigDecimal(2.3));
//		idata[0].setVatAmount(new BigDecimal(0.25));
//		idata[0].setItemCateg("");
//		idata[0].setStoreLoc("D0000");
//		idata[0].setRefDoc("00000");
//		idata[0].setRefItm("000020");
//		idata[0].setRefServiceDoc("33333");
//		idata[0].setTrxId("3333");
//		idata[0].setTrxLineId("33344444");
//		idata[0].setSerialNo("5555555");
//		body.setItemData(idata);
//		
//		req.setRequestBody(body);
//		
//		return req ;
//	}
	
}
