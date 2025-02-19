package com.asiainfo.crm.inter.exe.webservice.client.imswrapservice;

import java.rmi.RemoteException;

public class IImsWrapQueryServiceFactory {
	
	private static Boolean SLOCK = Boolean.FALSE;
	
	private static IImsWrapQueryServiceRemoteLocator service = null;
	
	public static IImsWrapQueryServiceRemoteLocator getService() throws Exception,RemoteException {
		if (SLOCK.equals(Boolean.FALSE)) {
            synchronized(SLOCK) {
             if(SLOCK.equals(Boolean.FALSE)){
            	 service = new IImsWrapQueryServiceRemoteLocator ();
                    SLOCK = Boolean.TRUE;
             }
            }
		}
		return service;
	}

	public static void main(String[] args) throws Exception{
		RequestHead requestHead = new RequestHead();
		requestHead.setAppKey("RS101");// 资源人参：RS101
		requestHead.setTransactionID("8000000001" + "20150305" + "11111"); // 【10位发起方系统ID】＋【8位日期编码YYYYMMDD】＋【10位流水号】
		requestHead.setReqTime("20150305105600"); // 时间格式：YYYYMMDDHH24MISS
		requestHead.setAcceptChannelCode("01");// 默认传01
		requestHead.setTenantId("01");// 租户id 与OperatorCode相对应
		requestHead.setChargeFlag("0");// 该业务是否收取一次性费用 1收取，0不收取(默认)
		requestHead.setNotifyFlag("0"); // 该业务受理后是否发送通知 1发送，0不发送（默认）
		requestHead.setBusiCode("1087");
		
		DoQueryTaxReq  req = new DoQueryTaxReq ();
		
		SQueryTaxFee[] sfee = new SQueryTaxFee[1];
		sfee[0] = new SQueryTaxFee();
		sfee[0].setAcctId(32100888888888L);
		sfee[0].setAmount(1);
		sfee[0].setBusiType(1);
		sfee[0].setMeasureId(1);
		sfee[0].setItemId(1);
		req.setSQueryTaxFeeList(sfee);
		
		
		
		DoQueryTaxResponse resp = IImsWrapQueryServiceFactory.getService().getIImsWrapQueryService().doQueryTax(requestHead, req);
		System.out.println(resp.getSTaxFeeList()[0].getAcctId());
		
	}
}
