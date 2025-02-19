package com.asiainfo.crm.so.teaminvoke.out.service.interfaces;

import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import com.ai.bce.ivalues.IBceDealReturnData;
import com.ai.omframe.order.data.ivalues.ISoAttrData;
import com.ai.omframe.order.data.ivalues.ISoServicePkgData;

/**
 * 
 * @author 
 * @ 给非统一接口使用的特殊接口（主要提供给内部模块调用，客管/资源等）
 * 与下面的接口类相似：
 * ICrmFSV.java（主要封装对外接口，提供给统一平台使用!）
 */
public interface ICrm2InternalSV {
	
    /**
     * 业务变更-订购Phonebook 等接口使用，提供给账管
     * 自动判断手机号码为DSL用户或者GSM用户，如果为GSM用户，则订购传入的offerId，如果为DSL用户，则做产品变更
     * @param userId
     * @param billId（可为空null）
     * @param offerId
     * @param priceList（可为空null）
     * @param soAttrMap（可为空null）
     * @param validDate（可为空null）
     * @param expireDate（可为空null）
     * @param extendMap
     * @return Map
     * Map的key值及value说明：
     * 		key						value（说明）
     * 		DoneCode 				long（客户订单编号）
     * 		EXT_OUT_SO_ORDER_DATA 	com.ai.omframe.order.data.ivalues.ISoOrderData（业务受理对象）
     * @throws Exception
     * @throws RemoteException
     */
    public Map buyOfferVAS4CM(long userId, String billId, long offerId, List priceList, Map<String,ISoAttrData[]> soAttrMap, Timestamp validDate, Timestamp expireDate, Map extendMap) throws Exception, RemoteException;
	
}
