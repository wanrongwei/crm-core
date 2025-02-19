package com.asiainfo.crm.so.order.rboss.service.interfaces;

import java.rmi.RemoteException;
import java.util.List;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.omframe.instance.ivalues.IInsOfferValue;
import com.ai.omframe.order.data.ivalues.ISoOrderData;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustSegmentRelaValue;
import com.asiainfo.crm.so.order.rboss.valuebean.FmcGroupInfo;

import net.sf.json.JSONObject;

public interface IFmcBusiSV {

	/**
	 * 根据offerId获取10040073特征值，即月租表达式
	 * @param offerId
	 * @return
	 * @throws Exception
	 */
	public String getRCFormulaByOfferId(long offerId) throws Exception;
	
	public boolean isInScope(String scope,int num);
	
	public void updateInsSrvAttrForFMC(long customerOrderId) throws Exception,RemoteException;
	
	/**
	 * 回填event表数据
	 * @param customerOrderId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void fillBackEventPara(long customerOrderId) throws Exception,RemoteException;
    
	/**
	 * 获取orderOffer中所有group的信息
	 * @Title: getOrdFMCGroupInfo 
	 * @param offerList
	 * @return
	 * @throws Exception
	 * @throws RemoteException 
	 * @author huanglun
	 * @date 2018年4月11日 下午2:41:46
	 */
	public Map<String,Map<String,String>> getOrdFMCGroupInfo(List<DataContainerInterface> offerList,String fmcGroupTypeValue)throws Exception,RemoteException;
    
	/**
	 * 获得客户下已订购offer的group优惠信息
	 * @param custId
	 * @param ordGroupInfoMap
	 * @param fmcGroupType
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map<String,Map<String,String>> getUserGroupInfo(long custId,Map<String,Map<String,String>> ordGroupInfoMap,String fmcGroupType)throws Exception,RemoteException;
	
	/**
	 * 获得创建新订单后客户group的最新优惠信息
	 * @param orderGroupInfoMap=getOrdGroupInfo接口的返回值
	 * @param userGroupInfoMap=getUserGroupInfo接口返回值
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map getNewGroupInfo(Map orderGroupInfoMap,Map userGroupInfoMap,long custId)throws Exception,RemoteException;
	
	/**
	 * fmcGroupTypeValue：必传，FMC只返回FMC的offer；CUST_GROUP只返回FMCS的offer
	 * @author huanglun
	 * @date 2018年9月4日 上午11:08:18
	 */
	public Map<String,Map<String,String>> getOrdFMCGroupInfoForBusi(List<DataContainerInterface> offerList,String fmcGroupTypeValue)throws Exception,RemoteException;
	
	public Map calculationOfPreferential(long offerId,int num) throws RemoteException, Exception;
	public Map calculationOfPreferential(String ruleStr,int num)throws RemoteException, Exception;
	
	/**
	 * 获取offer的fmc信息
	 * @param offerId
	 * @return
	 * @throws Exception
	 */
	public FmcGroupInfo getOfferGroupInfo(long offerId)throws Exception;
	
	/**
	 * 获取offerOrderList包含的fmcGroupList
	 * @param offerOrderList
	 * @return key 为fmcGroupId(String)
	 * 		   value 为 changeCount(Integer)
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map<String,Integer> getFMCGroupListByOfferOrderList(List<DataContainer> offerOrderList)throws Exception,RemoteException;
	
	public Map<String,String> actualDiscount(Map<String,String> paraMap)throws Exception,RemoteException;
	
	/**
	 * 根据offerId获取Pushc需要的FMC相关参数（每个offerId调用一次）
	 * @param offerId
	 * @param userId
	 * @param custId
	 * @param customerOrderId
	 * @return
	 * @throws Exception
	 */
	public JSONObject getPushCFMCParam(long offerId, long userId, long custId, long customerOrderId) throws Exception;
	
	/**
	 * 根据UserId 获取InsOffer main offer记录
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2018-4-20
	* IFmcBusiSV
	 */
	public IInsOfferValue getInsMainOfferByUserid(long userId) throws Exception;
	
	/**
	 * 根据InsOfferId 查询InsOffer记录
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2019-4-23
	* IFmcBusiSV
	 */
	public IInsOfferValue getInsOfferByOfferInstId(long aInstOfferId,String regionId) throws Exception;
	
	/**
	 * 送billing前更新下ordSrvAttr表中fmc offer的优惠
	 * @author huanglun
	 * @date 2018年5月3日 下午5:00:56
	 */
	public void updateOfferPreferential(long customerOrderId) throws Exception;



	/**
	 * 获取有效订购数(提供给正向受理、OSE接口调用等)
	 * @param custId
	 * @param fmcGroupId
	 * @param fmcGroupType
	 * @return
	 * @throws Exception
	 */
	public int getInvaidCountByCustIdAndGroupIdAndFMCType(long custId,long fmcGroupId,String fmcGroupType) throws Exception;
	
	/**
	 * 去除本身以外的
	 * @param custId
	 * @param fmcGroupId
	 * @param fmcGroupType
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public int getInvaidCountByCustIdAndGroupIdAndUserId(long custId,long fmcGroupId,String fmcGroupType,long userId) throws Exception;
	/**
	 * OSE接口需要
	 * @param custId
	 * @param fmcType
	 * @return
	 * @throws Exception
	 */
	public List<DataContainerInterface> getOfferlistByCustId(long custId,String fmcType) throws Exception;  

	/**
	 * 获取有效订购数(永远从数据库获取，提供给后台Job使用)
	 * @param custId
	 * @param fmcGroupId
	 * @param fmcGroupType
	 * @return
	 * @throws Exception
	 */
	public int getInvaidCountByCustIdAndGroupIdAndFMCTypeForBackendJob(long custId,long fmcGroupId,String fmcGroupType) throws Exception;
	/**
	 * 获取有效记录
	 * @param custId
	 * @param fmcGroupId
	 * @param fmcGroupType
	 * @return
	 * @throws Exception
	 */
	public List<DataContainerInterface> getOfferListByCustIdAndGroupIdAndFMCType(long custId,long fmcGroupId,String fmcGroupType) throws Exception;
	/**
	 * GroupLog 入 raw_event表
	 * @param inDataContainer
	 * @throws Exception
	 */
	public void addRawEventForGroupLog(DataContainerInterface inDataContainer) throws Exception;
	
	/**
	 * 群日志参数
	 * @param customerOrderId
	 * @return
	 */
	public String handleChangeNegotiationGroupLog(long custId,long customerOrderId,ISoOrderData soOrderData);
	
	/**
     * 根据custid，查询客户细分
    * <p>Title: </p>
    * <p>Description: </p>
    * <p>Company: AsiaInfo</p> 
    * @author YuJing
    * @date 2019-8-8
    * FmcBusiSVImpl
     */
    public IBOCmCustSegmentRelaValue querySegmentByCustId(long custId)  throws Exception;
	
}
