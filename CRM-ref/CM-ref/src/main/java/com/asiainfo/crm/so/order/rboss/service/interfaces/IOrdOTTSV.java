package com.asiainfo.crm.so.order.rboss.service.interfaces;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

import com.ai.omframe.order.ivalues.IOVOrderCustomer;
import com.ai.omframe.order.ivalues.IOrdOfferValue;
import com.asiainfo.crm.so.common.party.ivalues.IBOInsOttCustValue;
import com.asiainfo.crm.so.order.rboss.ivalues.IBOOrdOTTCustValue;
import com.asiainfo.crm.so.order.rboss.ivalues.IBOOrdOttWimpValue;

/**
 * 
 * @Copyright Copyright (c) 2015 Asiainfo-Linkage
 * 
 * @ClassName ott需求
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author wangxw3
 * @date 2015-1-10 下午10:32:08
 * 
 * Modification History:
 * Date         Author          Version            Description
 * ----------------------------------------------------------*
 * 2015-1-10     wangxw3           v1.0.0               修改原因
 */
public interface IOrdOTTSV {
	
	public long getNewId() throws Exception;
	
	/**
	 * @Function saveOrdOTTCustValue
	 * @Description 
	 *
	 * @param ordOTTCustValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author wangxw3
	 * @date 2015-1-10 下午10:33:05
	 */
	public void saveOrdOTTCustValue(IBOOrdOTTCustValue ordOTTCustValue) throws Exception;
	public void insertOrdOTTCustValue(IBOOrdOTTCustValue ordOTTCustValue) throws Exception;
	
	/**
	 * @Function saveBatchOrdOTTCust
	 * @Description 
	 *
	 * @param ordOTTCustValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author wangxw3
	 */
	public void saveBatchOrdOTTCust(IBOOrdOTTCustValue[] ordOTTCustValues) throws Exception;
	
	/**
	 * 查询
	 * @Function queryOrdOTTCust
	 * @Description 
	 *
	 * @param custType
	 * @param custId
	 * @param ottBusiType
	 * @param billId
	 * @param state
	 * @param dealState
	 * @param startDate
	 * @param endDate
	 * @param activeStartDate
	 * @param activeEndDate
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author wangxw3
	 * @date 2015-1-10 下午10:46:39
	 */
	public IBOOrdOTTCustValue[] queryOrdOTTCust(String custType, long custId, String ottBusiType, String billId, 
			String state, String dealState, String startDate, String endDate, String activeStartDate,
			String activeEndDate) throws Exception;
	
	/**
	 * 根据类型校验是否OTT客户
	 * @Function checkIsOTTCust
	 * @Description 
	 *
	 * @param custId
	 * @param ottBusiType
	 * @param state
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 */
	public boolean checkIsOTTCustB2C(long custId, String ottBusiType, String state) throws Exception;
	
	/**
	 * OTT需求处理
	 * @Function checkIsOTTCust
	 * @Description 
	 *
	 * @param custId
	 * @param ottBusiType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 */
	public void dealOTTCustB2C(IOVOrderCustomer aOVOrderCustomer) throws Exception;

	public boolean checkIsFriFamilieOffer (long offerId) throws Exception;
	
	public boolean checkIsMobileOffer (long offerId) throws Exception;
	
	public long queryAcctIdByCustId (long custId) throws Exception;
		
	public IBOOrdOTTCustValue[] queryOrdOTTCust(String condition,Map paraMap) throws Exception;
	
	/**
	 * 创建虚拟用户
	 * @Function createVirtualUser
	 * @Description 
	 *
	 * @param custId
	 * @param ottBusiType
	 * @param isOccupyVoucher
	 * @param extendMap
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author wangxw3
	 */
	public Map createVirtualUser(IBOOrdOTTCustValue ottCustValue) throws Exception;
	
	/**
	 * 
	 * @Function dealOTTCustByOrdOffer
	 * @Description 
	 *
	 * @param ordOfferValue
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author wangxw3
	 * @date 2015-1-16 上午11:40:02
	 * 
	 * Modification History:
	 * Date         Author          Version            Description
	 * ---------------------------------------------------------*
	 * 2015-1-16     wangxw3           v1.0.0               修改原因
	 */
	public IBOOrdOTTCustValue dealOTTCustByOrdOffer(IOrdOfferValue ordOfferValue, long ordBusinessId, String billId) throws Exception;
	
	public void dealOTTCustB2CByCustId(long custId, long customerOrderId, String billId) throws Exception; 
	
	public void sendNotic2Cust(String event_code,long custorderId,HashMap ext) throws RemoteException, Exception;
    public String isOpenTapStormAcct(long custId)throws Exception,RuntimeException;
    public boolean isOpenOneDriver(long custId,long offerId)throws Exception,RuntimeException;
	public void saveOrdOttWimp(IBOOrdOttWimpValue[] ordOTTWimpValues) throws Exception,RuntimeException;
	public IBOOrdOttWimpValue[] queryOrdOttWimp( long custId, long userId, String billId) throws Exception,RuntimeException;
	public IBOOrdOttWimpValue[] queryActiveOrdOttWimp( ) throws Exception,RuntimeException;
	public long getOrdOttWimpId() throws Exception,RuntimeException;

	/** 
	* @Function: registerCust4Mop 
	* @Description: 单点功能，注册mop用户处理方法
	* @param
	* @return void
	* @throws 异常描述
	* @author lufm3
	* @date Aug 26, 2015 3:31:48 PM 
	*/ 
	public Map registerCust4Mop(long custId) throws Exception,RuntimeException;
 
	/** 
	* @Function: getOttCustByCustId 
	* @Description: TODO
	* @param
	* @return IBOInsOttCustValue
	* @throws 异常描述
	* @author lufm3
	* @date Aug 26, 2015 3:35:15 PM 
	*/ 
	public IBOInsOttCustValue getOttCustByCustId(long custId) throws Exception,RuntimeException;
	
	/** 
	* @Function: isCustOpen 
	* @Description: 工作流用户是否开通成功判断
	* @param
	* @return String
	* @throws 异常描述
	* @author lufm3
	* @date Aug 31, 2015 10:20:21 AM 
	*/ 
	public String isCustOpen(long customerOrderId) throws Exception,RuntimeException;
	
 
	/** 
	* @Function: updateCustOpenState 
	* @Description: 
	* @param
	* @return String
	* @throws 异常描述
	* @author lufm3
	* @date Aug 31, 2015 4:00:08 PM 
	*/ 
	public void updateCustOpenState(long custId,HashMap paraMap) throws Exception,RuntimeException;
	
	/** 
	* @Function: cancelOTTUser 
	* @Description: OTT销户或退订
	* @param
	* @return Map
	* @throws 异常描述
	* @author lufm3
	* @date Sep 4, 2015 11:18:55 AM 
	*/ 
	public Map cancelOTTUser(String billId,IBOOrdOTTCustValue ottCustValue, Map map)throws Exception,RuntimeException;
	
	/**
	 * ott订购增值策划
	 * @param ottCustValue
	 * @return
	 * @throws Exception
	 */
	public Map doSubscribe(IBOOrdOTTCustValue ottCustValue) throws Exception;
	
	/**
	 * ott取消订购
	 * @param ottCustValue
	 * @return
	 * @throws Exception
	 */
	public Map doUnsubscribe(IBOOrdOTTCustValue ottCustValue) throws Exception;
/**
 * 判断客户类型2
 * @param customerOrderId
 * @return
 * @throws Exception
 * @throws RuntimeException
 */
	public String isNoNeedWaitAcct(long customerOrderId,String offerOrderIds) throws Exception,RuntimeException;

	public IBOOrdOTTCustValue getOrdOttCustValueById(long id) throws Exception;
	
	public void dealMobileChangeNumber(long customerOrderId) throws Exception;
	public boolean checkWimpEmailDupli(String email)throws Exception,RuntimeException;
	public void saveInsOttCustValue(IBOInsOttCustValue value) throws Exception;
	
	public void dealViaplayB2C(IOVOrderCustomer aOVOrderCustomer) throws Exception;
	public Map<String,String> dealViaplayFormPageGiving(long custId,Map<String,String> viaplayMap) throws Exception;
	public Map<String,String> resendViaplayEmail(long custId,String voucherId) throws Exception;
	/**
	 * 根据客户ID给满足业务条件的客户赠送viaplay add by tanyan 20160620
	 * 1、提供给客管调用 ：当客户邮箱第一次设置的时候，调用该接口，判断是否满足业务,满足则赠送      
	 * 2、处理现网老客户：满足业务赠送viaplay的老客户，进行viaplay赠送处理
	 * @param custId
	 * @throws Exception
	 */
	public void promoteViaplayToCust(long custId) throws Exception;
}
