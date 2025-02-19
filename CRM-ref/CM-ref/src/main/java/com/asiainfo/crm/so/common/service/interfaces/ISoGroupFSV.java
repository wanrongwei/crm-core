/**
 * 
 */
package com.asiainfo.crm.so.common.service.interfaces;

import java.rmi.RemoteException;
import java.util.List;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.omframe.instance.ivalues.IInsOfferInsUserValue;
import com.ai.omframe.instance.ivalues.IInsOfferValue;
import com.ai.omframe.instance.ivalues.IInsProdInsSrvValue;
import com.ai.omframe.instance.ivalues.IInsSrvAttrValue;
import com.asiainfo.crm.cm.model.ivalues.IAccountProfileValue;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;

/**
 * 集团对外提供服务类
 * @author liujianya
 *
 */
public interface ISoGroupFSV {
	
	/**
	 * 
	 * @Title: getInsOfferByOfferIdAndRegionId 
	 * @Description: 根据策划ID，订购起始日期，订购结束日期，订购地市查询策划实例
	 * @param @param offerId
	 * @param @param startDate
	 * @param @param endDate
	 * @param @param regionId
	 * @param @return
	 * @param @throws Exception 
	 * @return IInsOfferValue[]    返回类型 
	 * @throws 
	 * @version: v1.0.0
	 * @author: liujianya
	 * @date 2012-8-25 下午03:45:19 
	 *
	 * Modification History:
	 * Date           Author          Version     Description
	 *---------------------------------------------------------*
	 * 2012-8-25      liujianya       v1.0.0                  修改原因
	 */
	public IInsOfferValue[] getInsOfferByOfferIdAndRegionId(String offerId,String startDate,String endDate,String regionId) throws Exception;

	/**
	 * @Title: queryCustomerInfo 
	 * @Description: 
	 * @param @param queryType    查询类型    [0]集团编号  
										  [1]集团名称
									      [2]VPMN合同号
									      [3]用户编号
									      [4]用户手机号码
									      [5]用户短号码
	 * @param @param queryValue
	 * @param @param method       查询方式    [0]先查询在用信息再查历史信息
	 * 								      [1]查询在用信息
	 * 									  [2]查询历史信息
	 * @param @return
	 * @param @throws Exception 
	 * @return ICustomerValue[]    返回类型 
	 * @throws 
	 * @version: v1.0.0
	 * @author: liujianya
	 * @date 2012-8-30 下午04:26:06 
	 *
	 * Modification History:
	 * Date           Author          Version     Description
	 *---------------------------------------------------------*
	 * 2012-8-30      liujianya       v1.0.0                  修改原因
	 */
	public ICustomerValue[] queryCustomerInfo(String queryType,String queryValue,String method) throws Exception;
	
	/**   
	* @Function: queryVpmnUserExt
	* @Description: TODO该函数的功能描述
	*
	* @param
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: zjl
	* @date: Dec 13, 2012 2:52:45 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Dec 13, 2012     zjl         v1.0.0               修改原因
	*/
	public DataContainer[] queryVpmnUserExt(String userId,String custId,String custName,String billId) throws Exception;
	/**
	 * 查询客户账户信息
	 * @Title: queryCustAccountInfo 
	 * @Description: 
	 * @param @param custId				   客户编号
	 * @param @return
	 * @param @throws Exception 
	 * @return IAccountProfileValue[]    返回类型 
	 * @throws 
	 * @version: v1.0.0
	 * @author: liujianya
	 * @date 2012-9-3 下午07:17:43 
	 *
	 * Modification History:
	 * Date           Author          Version     Description
	 *---------------------------------------------------------*
	 * 2012-9-3      liujianya       v1.0.0                  修改原因
	 */
	public IAccountProfileValue[] queryCustAccountInfo(String custId) throws Exception;
	
	public DataContainer[] queryInsUserByCustValueAndOfferId(String custId,String offerId,int startRowIndex,int endRowIndex) throws Exception;
	
	public IInsOfferInsUserValue[] queryUserInfoByOfferId(String offerId) throws Exception;
	
	public IInsProdInsSrvValue[] queryPordSrvByUserId(long userId) throws Exception;
	
	public IInsSrvAttrValue[] querySrvAttrByUserIdAndProdSrvRelatId(long userId,long prodSrvRelatId) throws Exception;
	
	public List querySrvAttrByUserId(long userId) throws Exception;
	
	public ICustomerValue queryCustInfoByCustId(String custId) throws Exception ;
	
	public DataContainer[] queryAllGroupContactByCustId(String custId) throws Exception;
	
	public ICustomerValue queryCustotmerByContract(String contractId) throws Exception;
	
	public DataContainerInterface queryCustomerAnd(String custId) throws Exception;
	
	public int queryInsUserByCustValueAndOfferIdCount(String custId,String offerId) throws Exception;
	
	public DataContainer[] queryPordSrvsByUserId(long userId) throws Exception;
	/**
	 * 客户资料新增或变更同步bboss
	 * @author:liuzz
	 * @date:2012-10-25 5:10:59 PM
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void groupCustInfoSync(long custId) throws RemoteException, Exception;
	/**
	 * 根据计费号获取该用户加入的集团
	 * @author:sungq3
	 * @date:2012-10-25 5:10:59 PM
	 * @throws Exception
	 * @throws RemoteException
	 */
	public List getCustIdByBillId(String billId) throws RemoteException, Exception;
	
	/**
	 * 根据商机编号和客户编号查询订单编号
	 * @Title: getCustOrdIdByChanceId 
	 * @Description: 
	 * @param @param custId
	 * @param @param chanceId
	 * @param @return
	 * @param @throws Exception 
	 * @return String    返回类型 
	 * @throws 
	 * @version: v1.0.0
	 * @author: liujianya
	 * @date 2012-11-26 上午10:14:39 
	 *
	 * Modification History:
	 * Date           Author          Version     Description
	 *---------------------------------------------------------*
	 * 2012-11-26      liujianya       v1.0.0                  修改原因
	 */
	public String getCustOrdIdByChanceId(String custId,String chanceId) throws Exception;
	
	/**
	 * 根据客户编号查询该客户是否订购互联网专线产品
	 * @Title: getNetDataByCustId 
	 * @Description: 
	 * @param @param custId
	 * @param @return
	 * @param @throws Exception 
	 * @return String    返回类型 
	 * @throws 
	 * @version: v1.0.0
	 * @author: liujianya
	 * @date 2012-12-26 上午09:29:57 
	 *
	 * Modification History:
	 * Date           Author          Version     Description
	 *---------------------------------------------------------*
	 * 2012-12-26      liujianya       v1.0.0                  修改原因
	 */
	public boolean getNetDataByCustId(String custId) throws Exception;
}
