package com.asiainfo.crm.cm.common.util.ws;

import com.asiainfo.appframe.ext.exeframe.ws.client.WsClient;

public final class WebServiceClient {

	/**
	 * 
	 * @Function WebServiceCall
	 * @Description 
	 *
	 * @param cfgWsClientCode
	 * @param methodName
	 * @param obj
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-5-8 下午12:37:55
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-5-8     yangjh           v1.0.0               修改原因<br>
	 */
	public Object WebServiceCall(String cfgWsClientCode, String methodName, Object[] obj) throws Exception {
		WsClient client = new WsClient(cfgWsClientCode);
		@SuppressWarnings("deprecation")
		Object ret = client.invoke(methodName, obj);
		return ret;
	}

}
