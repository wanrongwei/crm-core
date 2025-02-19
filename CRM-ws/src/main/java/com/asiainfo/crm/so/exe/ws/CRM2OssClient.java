package com.asiainfo.crm.so.exe.ws;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.util.StringUtils;
import com.asiainfo.appframe.ext.exeframe.ws.client.WsClient;
import com.asiainfo.crm.so.exe.ws.oss.ResultInfo;

/**
 * 调用OSS客户端
 * Copyright: Copyright (c) 2010 Asiainfo-Linkage
 * @ClassName: com.asiainfo.crm.so.exe.ws.CRM2OssClient
 * @Description:
 * @version: v1.0.0
 * @author: zhangyong12
 * @date: 2013-12-6
 * Modification History:
 * Date          Author          Version            Description
 * ---------------------------------------------------------*
 * 2013-12-6      zhangyong12      v1.0.0
 */
public class CRM2OssClient extends WsClient {
	private transient Log log = LogFactory.getLog(CRM2OssClient.class);
	private static CRM2OssClient client;
	/**
	 * 
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date: 2013-12-4
	 */
	public static CRM2OssClient getCRM2OssClient() throws Exception {
		if (null == client) {
			client = new CRM2OssClient("CRM2OSSService");
		}
		return client;
	}
	/**
	 * 
	 * @param cfgWsClientCode
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date: 2013-12-4
	 */
	public static CRM2OssClient getCRM2OssClient(String cfgWsClientCode) throws Exception {
		if (null == client) {
			client = new CRM2OssClient(cfgWsClientCode);
		}
		return client;
	}
	/**
	 * @param cfgWsClientCode
	 * @throws Exception
	 */
	public CRM2OssClient(String cfgWsClientCode) throws Exception {
		super(cfgWsClientCode);
		// TODO Auto-generated constructor stub
	}
	/**
	 * 根据标准地址ID获取接入方式
	 * 
	 * @param standardAddrId
	 * @param prodSpecCode
	 * @param regionId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date: 2013-12-4
	 */
	public Map getAccessModeByStandardAddrId(long standardAddrId,String prodSpecCode, String regionId) throws Exception,RemoteException {
		String funcName = "qrySwitchsByStdAddrId";
		String AccessMode = this.invodeInterFunc(funcName, new Object[] {regionId, prodSpecCode, standardAddrId });
		Map mapAccess = Xml2Map.XmlToMap(AccessMode);
		return mapAccess;
	}
	/**
	 * 送单
	 * @param receiveMsg
	 * @param regionId
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date: 2013-12-6
	 */
	public ResultInfo orderReceive(String receiveMsg, String regionId)throws RemoteException, Exception {
		String funcName = "orderReceive";
		String tmpResStr = this.invodeInterFunc(funcName, new Object[] {receiveMsg,regionId});
		ResultInfo res = parserResultXml(tmpResStr);
		return res;
	}
	/**
	 * 调用接口，返回字符串
	 * 
	 * @param funcName
	 * @param params
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date: 2013-12-4
	 */
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
				if (tmp instanceof String) {
					tmpResStr = (String) tmp;
				} else if (tmp instanceof Long) {
					if ((Long) tmp == 0) {
						tmpResStr = null;
					} else {
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
				logInfo(funcName,"End:total time[" + String.valueOf(endTime - beginTime)+ "],return[" + tmpResStr + "]");
			} catch (Exception E) {
				long endTime = System.currentTimeMillis();
				logInfo(funcName,"Error:total time[" + String.valueOf(endTime - beginTime)	+ "],error[" + E.getMessage() + "]");
				throw E;
			}
		}
		return tmpResStr;
	}

	/**
	 * 调用接口，解析返回值
	 * 
	 * @param funcName
	 * @param xmlStr
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date: 2013-12-4
	 */
	protected ResultInfo invodeInterFunc(String funcName, String xmlStr)throws Exception {
		String tmpResStr = null;
		ResultInfo res = null;
		if (funcName != null && !StringUtils.isEmptyString(funcName)
				&& xmlStr != null && !StringUtils.isEmptyString(xmlStr)) {
			try {
				tmpResStr = this.invodeInterFunc(funcName,new Object[] { xmlStr });
				if (tmpResStr != null && !StringUtils.isEmptyString(tmpResStr))
					res = parserResultXml(tmpResStr);
			} catch (Exception E) {
				logInfo(funcName, "Error:" + E.getMessage());
				throw E;
			}
		}
		return res;
	}

	/**
	 * 解析结果
	 * 
	 * @param resultXml
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date: 2013-12-4
	 */
	protected ResultInfo parserResultXml(String resultXml) throws Exception {
		ResultInfo rtn = new ResultInfo();
		Map ocnRtn = Xml2Map.XmlToMap(resultXml);
		// 只存在两种返回码：000000代表成功，000001代表失败
		rtn.setResult_code(String.valueOf(ocnRtn.get("result_code")));
		rtn.setResult_msg(StringUtils.nullToEmptyString(String.valueOf(ocnRtn.get("result_msg"))));
		return rtn;
	}

	/**
	 * 记录日志
	 * 
	 * @param funcName
	 * @param logStr
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date: 2013-12-4
	 */
	protected void logInfo(String funcName, String logStr) {
		//if (log.isDebugEnabled()) {
			log.info("CRM2OssClient invoke funcName:" + funcName + "	" + logStr);
		//}
	}

//	public static void main(String[] args) throws Exception {
//		CenterFactory.setCenterInfoByTypeAndValue("RegionId", "573");
//		IBOSelectAddrValue[] qSelectAddrValues = null;
//		// CRM2OssClient.getCRM2OssClient().getStandardAddr("Broadband", "21",
//		// "0", "东森花园", "", "", 1, 10);
//		// CRM2OssClient.getCRM2OssClient().judgeAddrResByStandardId("1021311",
//		// "105000080160");
//		// CRM2OssClient.getCRM2OssClient("CRMPBossServiceOcn").judgeSarftNewPermission("123",
//		// "", "", "", "");
//	}
}
