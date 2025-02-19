package com.asiainfo.crm.inter.exe.webservice.client.sf;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.util.StringUtils;
import com.asiainfo.appframe.ext.exeframe.ws.client.WsClient;
import com.asiainfo.crm.so.exe.ws.Map2Xml;

public class SfWsClient extends WsClient {

	private static final String ORDER_RECEIVE = "orderReceive";
	private static final String QRY_ONLINEDATE = "qryOnlinedate";
	private static final String CHECK_ORDER = "checkOrder";
	private static final String QUERY_CO_LIST_COUNT = "queryCoListCount";
	private static final String QUERY_CO_LIST = "queryCoList";
	private static final String QUERY_CO_INFO_DETAIL = "queryCoInfoDetail";
	private static final String DEPROV_ESTABLISH = "deprovEstablish";
	private static final String SUSPEND = "suspend";
	private static final String RESUME = "resume";
	private static final String ORDER_CANCEL_REQUEST = "orderCancelRequest";
	private static final String ORDER_CANCEL = "orderCancel";
	private static final String ORDER_CHANGE_REQUEST = "orderChangeRequest";
	private static final String ORDER_CHANGE = "orderChange";
	private static final String DEPROV_CPE = "deprovCpe";
	private static final String GET_CUSTOMER_DSL_INFO = "getCustomerDslInfo";
	private static final String REPROVE = "reprove";
	private static final String SUSPENDRESUME = "suspendResume";
	private static final String PROVNPVOIP = "provNPVoip";
	private static final String PROVCPE = "provCpe";
	private static final String VALIDATE_ADDRESS = "validateAddress";
	private static final String ORDER_RECEIVE_NEW = "orderReceiveNew";
	private static final String ORDER_CHANGE_NEW = "orderChangeNew";
	private static final String CHECK_PROFILE_CHANGE = "checkProfileChange";
	private static final String GET_PROFILE_SPEED = "getProfileSpeed";
	private static final String QUERY_AVAILABLE_PROFILES_COUNT = "queryAvailableProfilesCount";
	private static final String QUERY_AVAILABLE_PROFILES = "queryAvailableProfiles";
	private static final String QRY_ONLINEDATEINFO_FOR_CHANGELINESPEED = "qryOnlineDateInfoForChangeLineSpeed";

	private transient Log log = LogFactory.getLog(SfWsClient.class);

	private static SfWsClient client;

	private static final String SF_WS_CLIENT_CODE = "SF4CRMService";

	private SfWsClient(String cfgWsClientCode) throws Exception {
		super(cfgWsClientCode);
	}

	public static synchronized SfWsClient getSfWsClient() throws Exception {
		if (null == client) {
			client = new SfWsClient(SF_WS_CLIENT_CODE);
		}
		return client;
	}

	public String orderReceive(String receiveMsg, String regionId) throws RemoteException, Exception {
		return this.invodeInterFunc(ORDER_RECEIVE, new Object[] { receiveMsg, regionId });
	}

	public String qryOnlinedate(String receiveMsg, String regionId) throws RemoteException, Exception {
		return this.invodeInterFunc(QRY_ONLINEDATE, new Object[] { receiveMsg, regionId });
	}

	public long checkOrder(long customerOrderId, String crmTaskId, String regionId) throws RemoteException, Exception {
		String retMsg = this.invodeInterFunc(CHECK_ORDER, new Object[] { customerOrderId, crmTaskId, regionId });
		return retMsg == null ? 0L : Long.parseLong(retMsg);
	}

	public int queryCoListCount(String districtID, String coName) throws RemoteException, Exception {
		String retMsg = this.invodeInterFunc(QUERY_CO_LIST_COUNT, new Object[] { districtID, coName });
		return retMsg == null ? 0 : Integer.parseInt(retMsg);
	}

	public String queryCoList(String districtID, String coName, int startIndex, int endIndex) throws RemoteException, Exception {
		return this.invodeInterFunc(QUERY_CO_LIST, new Object[] { districtID, coName, startIndex, endIndex });
	}

	public String queryCoInfoDetail(String coName, String coType) throws RemoteException, Exception {
		return this.invodeInterFunc(QUERY_CO_INFO_DETAIL, new Object[] { coName, coType });
	}

	public String deprovEstablish(String receiveMsg, String regionId) throws RemoteException, Exception {
		return this.invodeInterFunc(DEPROV_ESTABLISH, new Object[] { receiveMsg, regionId });
	}

	public String resume(String dslId, String prodInsId, String sRegionId) throws RemoteException, Exception {
		return this.invodeInterFunc(RESUME, new Object[] { dslId, prodInsId, sRegionId });
	}

	public String suspend(String dslId, String prodInsId, String operReason, String sRegionId) throws RemoteException, Exception {
		return this.invodeInterFunc(SUSPEND, new Object[] { dslId, prodInsId, operReason, sRegionId });
	}

	public String orderCancelRequest(String receiveMsg, String regionId) throws RemoteException, Exception {
		return this.invodeInterFunc(ORDER_CANCEL_REQUEST, new Object[] { receiveMsg, regionId });
	}

	public String orderCancel(String receiveMsg, String regionId) throws RemoteException, Exception {
		return this.invodeInterFunc(ORDER_CANCEL, new Object[] { receiveMsg, regionId });
	}

	public String orderChangeRequest(String receiveMsg, String regionId) throws RemoteException, Exception {
		return this.invodeInterFunc(ORDER_CHANGE_REQUEST, new Object[] { receiveMsg, regionId });
	}

	public String orderChange(String receiveMsg, String regionId) throws RemoteException, Exception {
		return this.invodeInterFunc(ORDER_CHANGE, new Object[] { receiveMsg, regionId });
	}

	public String deprovCpe(String dslId, String prodInsId, String cpeSerial, String cpeType, String sRegionId) throws RemoteException, Exception {
		return this.invodeInterFunc(DEPROV_CPE, new Object[] { dslId, prodInsId, cpeSerial, cpeType, sRegionId });
	}

	public String getCustomerDslInfo(String dslId) throws RemoteException, Exception {
		return this.invodeInterFunc(GET_CUSTOMER_DSL_INFO, new Object[] { dslId });
	}

	public String reprove(String dslId, String prodInsId, String sRegionId) throws RemoteException, Exception {
		return this.invodeInterFunc(REPROVE, new Object[] { dslId, prodInsId, sRegionId });
	}

	public String suspendResume(String soCoSerial, String soOrderId, String dslId,String prodInsId,String operReason,String sRegionId,boolean isStop) throws RemoteException, Exception {
		return this.invodeInterFunc(SUSPENDRESUME, new Object[] { soCoSerial, soOrderId, dslId, prodInsId,operReason,sRegionId,isStop });
	}
	public String provNPVoip(String soCoSerial, String soOrderId, String voipNumber, String sRegionId) throws RemoteException, Exception {
		return this.invodeInterFunc(PROVNPVOIP, new Object[] { soCoSerial, soOrderId, voipNumber,sRegionId });
	}
	
	public String provCpe(String dslId, String prodInsId, String cpeSerial,String cpeType, String sRegionId) throws RemoteException, Exception {
		return this.invodeInterFunc(PROVCPE, new Object[] { dslId, prodInsId, cpeSerial,cpeType,sRegionId });
	}
	
	// DM002
	public String validateAddress(String addrXml, String sRegionId) throws Exception{
		return this.invodeInterFunc(VALIDATE_ADDRESS, new Object[]{addrXml, sRegionId});
	}
	
	public String orderChangeNew(String receiveMsg, String regionId) throws RemoteException, Exception {
		return this.invodeInterFunc(ORDER_CHANGE_NEW, new Object[] { receiveMsg, regionId });
	}
	
	public String orderReceiveNew(String receiveMsg, String regionId) throws RemoteException, Exception {
		return this.invodeInterFunc(ORDER_RECEIVE_NEW, new Object[] { receiveMsg, regionId });
	}
	
	public String checkProfileChange(String userInfo, String sRegionId) throws Exception{
		return this.invodeInterFunc(CHECK_PROFILE_CHANGE, new Object[] {userInfo, sRegionId});
	}
	
	public String getProfileSpeed(String dslId, String sRegionId) throws Exception{
		return this.invodeInterFunc(GET_PROFILE_SPEED, new Object[] {dslId, sRegionId});
	}
	
	public int queryAvailableProfilesCount(int dowload, int upload, String coType, String technology) throws Exception{
		String retMsg = this.invodeInterFunc(QUERY_AVAILABLE_PROFILES_COUNT, new Object[] {dowload, upload, coType, technology});
		return retMsg == null ? 0 : Integer.parseInt(retMsg);
	}
	
	public String queryAvailableProfiles(int dowload, int upload, String coType, String technology, int startIndex, int endIndex) throws Exception{
		return this.invodeInterFunc(QUERY_AVAILABLE_PROFILES, new Object[] {dowload, upload, coType, technology, startIndex, endIndex});
	}
	
	public String qryOnlineDateInfoForChangeLineSpeed(String soCoSerial, String soOrderId) throws Exception{
		return this.invodeInterFunc(QRY_ONLINEDATEINFO_FOR_CHANGELINESPEED, new Object[] {soCoSerial, soOrderId});
	}
	
	@SuppressWarnings("deprecation")
	protected String invodeInterFunc(String funcName, Object params[]) throws Exception {
		String tmpResStr = null;
		if (funcName != null && !StringUtils.isEmptyString(funcName)) {
			long beginTime = System.currentTimeMillis();
			try {
				String startParams = "";
				for (int i = 0; i < params.length; i++) {
					if (i > 0) {
						startParams += ",";
					}
					if (params[i] != null) {
						startParams += params[i].toString();
					}
				}
				logInfo(funcName, "Start:params[" + startParams + "]");
				Object tmp = this.invoke(funcName, params);
				if (tmp == null) {
					return "";
				}
				if (tmp instanceof String) {
					tmpResStr = (String) tmp;
				} else if (tmp instanceof Long) {
					if ((Long) tmp == 0) {
						tmpResStr = null;
					} else {
						tmpResStr = String.valueOf(tmp);
					}
				} else if (tmp instanceof Integer) {
					if(null == tmp){
						tmpResStr = "0";
					}else{
						tmpResStr = String.valueOf(tmp);
					}
				} else if (tmp.getClass().isArray()) {
					String[] obj = (String[]) tmp;
					Map map = new HashMap();
					map.put("returnCode", String.valueOf(obj[0]));
					map.put("returnMsg", String.valueOf(obj[1]));
					tmpResStr = Map2Xml.MapToXml(map, "outParam");
				}
				long endTime = System.currentTimeMillis();
				logInfo(funcName, "End:total time[" + String.valueOf(endTime - beginTime) + "],return[" + tmpResStr + "]");
			} catch (Exception E) {
				long endTime = System.currentTimeMillis();
				logInfo(funcName, "Error:total time[" + String.valueOf(endTime - beginTime) + "],error[" + E.getMessage() + "]");
				throw E;
			}
		}
		return tmpResStr;
	}

	protected void logInfo(String funcName, String logStr) {
		log.info("SfWsClient invoke funcName:" + funcName + "	" + logStr);
	}

}
