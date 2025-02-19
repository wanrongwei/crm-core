package com.asiainfo.crm.inter.exe.webservice.client.cpa;

import java.rmi.RemoteException;
import java.util.Calendar;

import javax.xml.rpc.ServiceException;

import net.sf.json.JSONObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.asiainfo.crm.inter.exe.webservice.client.cpa.task.CpaNoticeTask;

public class CpaMain {
	
	private static Log log = LogFactory.getLog(CpaMain.class);

	public static void main(String[] args) throws RemoteException, ServiceException, Exception {
		System.setProperty("tenant.id", "21");
		doSplit();
		// doTransfer();
		// doInsert();
		// doUpdate();
		// doDelete();
	}

	public static void doSplit() {
		SyncIncrementalSubscriberInfoRequest req = new SyncIncrementalSubscriberInfoRequest();
		req.setRequestBody(getDeleteBody());
		String request = JSONObject.fromBean(req, new String[] { "originalInitDate" }).toString();
//		System.out.println(request);
		int length = request.length();
		int end = CpaNoticeTask.SPLIT_SIZE;
		for (int start = 0; start < length;) {
			if(end > length){
				end = length;
			}
//			String s = request.substring(start, end);
//			start = end;
			end = end + CpaNoticeTask.SPLIT_SIZE;
//			System.out.println(s);
		}
	}

	public static void doTransfer() {
		SyncIncrementalSubscriberInfoRequest req = new SyncIncrementalSubscriberInfoRequest();
		req.setRequestBody(getDeleteBody());
		JSONObject jsonObject = JSONObject.fromBean(req, new String[] { "originalInitDate" });
		String info = jsonObject.toString();
//		System.out.println(info);
		JSONObject fromString = JSONObject.fromString(info, new String[] { "originalInitDate" });
		SyncIncrementalSubscriberInfoRequest req2 = (SyncIncrementalSubscriberInfoRequest) JSONObject.toBean(fromString,
				SyncIncrementalSubscriberInfoRequest.class);
		req2.getRequestBody().setOriginalInitDate(req.getRequestBody().getOriginalInitDate());
//		System.out.println(req2.equals(req));
	}

	private static void doDelete() throws RemoteException, ServiceException, Exception {
		SyncIncrementalSubscriberInfoRequest req = new SyncIncrementalSubscriberInfoRequest();
		req.setRequestBody(getDeleteBody());
		SyncIncrementalSubscriberInfoResponse resp = CPABusinessServiceFactory.getService().getCPAFileInterfacePort().syncIncrementalSubscriberInfo(req);
		SyncIncrementalSubscriberInfoResponseBody responseBody = resp.getResponseBody();
		log.debug(responseBody);
	}

	private static void doUpdate() throws RemoteException, ServiceException, Exception {
		SyncIncrementalSubscriberInfoRequest req = new SyncIncrementalSubscriberInfoRequest();
		req.setRequestBody(getUpdateBody());
		SyncIncrementalSubscriberInfoResponse resp = CPABusinessServiceFactory.getService().getCPAFileInterfacePort().syncIncrementalSubscriberInfo(req);
		SyncIncrementalSubscriberInfoResponseBody responseBody = resp.getResponseBody();
		log.debug(responseBody);
	}

	private static void doInsert() throws RemoteException, ServiceException, Exception {
		SyncIncrementalSubscriberInfoRequest req = new SyncIncrementalSubscriberInfoRequest();
		req.setRequestBody(getInsertBody());
		SyncIncrementalSubscriberInfoResponse resp = CPABusinessServiceFactory.getService().getCPAFileInterfacePort().syncIncrementalSubscriberInfo(req);
		SyncIncrementalSubscriberInfoResponseBody responseBody = resp.getResponseBody();
		log.debug(responseBody);
	}

	public static SyncIncrementalSubscriberInfoRequestBody getInsertBody() {
		SyncIncrementalSubscriberInfoRequestBody requestBody = new SyncIncrementalSubscriberInfoRequestBody();
		requestBody.setSubcriberNo("35000056");
		requestBody.setCustomerId(21210610000052L);
		requestBody.setSubscriberId(42100100000003L);
		requestBody.setSubStatus("1");
		requestBody.setIMSI("238028814101308");
		requestBody.setBAN(32100100000191L);
		requestBody.setCustomerSegment("1");
		requestBody.setTenantId(21L);
		requestBody.setSubscriberCompany("Asiainfo");
		requestBody.setTestSimFlag("1");
		requestBody.setMVNOBrand("10000261");
		requestBody.setEquipmentNo("21210510");
		requestBody.setCycleType(5L);
		requestBody.setCycleUnit(1L);
		requestBody.setFirstBilldate(16L);
		requestBody.setOriginalInitDate(Calendar.getInstance());
		requestBody.setProducts("Product1Product2Product3");
		requestBody.setSuspensionReasonCode("0100000000000000000000000000000000000000000000000000000000000000");
		requestBody.setDmlAction("INSERT");
		return requestBody;
	}

	public static SyncIncrementalSubscriberInfoRequestBody getUpdateBody() {
		SyncIncrementalSubscriberInfoRequestBody requestBody = new SyncIncrementalSubscriberInfoRequestBody();
		requestBody.setSubcriberNo("35000056");
		requestBody.setCustomerId(21210610000052L);
		requestBody.setSubscriberId(42100100000003L);
		requestBody.setSubStatus("1");
		requestBody.setIMSI("238028814101308");
		requestBody.setBAN(32100100000191L);
		requestBody.setCustomerSegment("1");
		requestBody.setTenantId(21L);
		requestBody.setSubscriberCompany("Asiainfo");
		requestBody.setTestSimFlag("1");
		requestBody.setMVNOBrand("10000261");
		requestBody.setEquipmentNo("21210510");
		requestBody.setCycleType(5L);
		requestBody.setCycleUnit(1L);
		requestBody.setFirstBilldate(16L);
		requestBody.setOriginalInitDate(Calendar.getInstance());
		requestBody.setProducts("Product1Product2Product3123Product1Product2Product3");
		requestBody.setSuspensionReasonCode("0100000000000000000000000000000000000000000000000000000000000000");
		requestBody.setDmlAction("UPDATE");
		return requestBody;
	}

	public static SyncIncrementalSubscriberInfoRequestBody getDeleteBody() {
		SyncIncrementalSubscriberInfoRequestBody requestBody = new SyncIncrementalSubscriberInfoRequestBody();
		requestBody.setSubcriberNo("35000056");
		requestBody.setCustomerId(21210610000052L);
		requestBody.setSubscriberId(42100100000003L);
		requestBody.setSubStatus("1");
		requestBody.setIMSI("238028814101308");
		requestBody.setBAN(32100100000191L);
		requestBody.setCustomerSegment("1");
		requestBody.setTenantId(21L);
		requestBody.setSubscriberCompany("Asiainfo");
		requestBody.setTestSimFlag("1");
		requestBody.setMVNOBrand("10000261");
		requestBody.setEquipmentNo("21210510");
		requestBody.setCycleType(5L);
		requestBody.setCycleUnit(1L);
		requestBody.setFirstBilldate(16L);
		requestBody.setOriginalInitDate(Calendar.getInstance());
		requestBody.setProducts("Product1Product2Product3Product10Product20Product30");
		requestBody.setSuspensionReasonCode("0100000000000000000000000000000000000000000000000000000000000000");
		requestBody.setDmlAction("DELETE");
		return requestBody;
	}

}
