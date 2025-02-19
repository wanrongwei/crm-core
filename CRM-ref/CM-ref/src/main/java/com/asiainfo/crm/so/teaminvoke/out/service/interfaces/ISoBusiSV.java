package com.asiainfo.crm.so.teaminvoke.out.service.interfaces;

import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import com.ai.appframe2.common.DataContainerInterface;
import com.ai.bce.ivalues.IBceDealReturnData;
import com.ai.omframe.order.data.ivalues.ISoServicePkgData;
import com.asiainfo.crm.so.order.rboss.ivalues.IBOAppointOrderValue;
import com.asiainfo.crm.so.query.ivalues.IQUserRelInfoValue;

public interface ISoBusiSV {
	/**
	 * 订购增值策划
	 *
	 * @param billId
	 *            计费号码
	 * @param offerId
	 *            策划ID
	 * @param soPordData
	 *            产品列表
	 * @param soAttrMap
	 *            服务属性 没有传null
	 * @param payType
	 *            支付方式 没有传-1
	 * @param priceList
	 *            List<SoBusiPriceData> 营业费用 没有传 null
	 * @param validDate
	 *            生效时间 没有传null
	 * @param expireDate
	 *            失效时间 没有传null
	 * @param extendMap
	 *            扩展参数 如:businessId 暂时指定: 500000020327 体内循环销售 500000020328
	 *            体外改进销售
	 * @return IBceDealReturnData
	 * @throws Exception
	 * @throws RemoteException
     * @deprecated 请使用 IBusiAcceptSV
	 */
    @Deprecated
	public IBceDealReturnData buyOfferVAS(String billId, long offerId,
			ISoServicePkgData soPordData[], Map soAttrMap, long payType,
			List priceList, Timestamp validDate, Timestamp expireDate, Map extendMap) throws Exception, RemoteException;

	/**
	 * 退订增值策划
	 * 
	 * @param billId
	 *            计费号码
	 * @param offerInstId
	 *            策划实例ID
	 * @param validDate
	 *            生效时间 没有传null
	 * @param expireDate
	 *            失效时间 没有传null
	 * @return IBceDealReturnData
	 * @throws Exception
	 * @throws RemoteException
     * @deprecated 请使用 IBusiAcceptSV
	 */
    @Deprecated
	public IBceDealReturnData cancelOfferVAS(String billId, long offerInstId, Timestamp validDate, Timestamp expireDate, Map extendMap) throws Exception, RemoteException;
	
	/**   
	* @Function: getOfferRoleIds
	* @Description: 获取offerId的角色,对于有多个子角色的情形不适用long [3]{主角色,户主(主号)角色,成员(副号)角色;
	*
	* @param: offerId 必填 策划ID
	* @return：
	* @throws：
	* @version: v1.0.0
	* @author: chenjh
	* @date:2011-6-1 10:48
	*/
	public long [] getOfferRoleIds(long offerId) throws Exception,RemoteException;
	
	/**增值策划订购\退订\产品变更 
	 * @param billId 计费号码
	 * @param offerId 策划ID
	 * @param soPordData 产品列表
	 * @param soAttrMap 服务属性 没有传null
	 * @param operType  CREATE 订购 UPDATE 产品变更 LOGOUT 退订
	 * @param payType 支付方式  没有传-1
	 * @param priceList List<SoBusiPriceData> 营业费用 没有传 null
	 * @param validDate 生效时间 没有传null
	 * @param expireDate 失效时间 没有传null
	 * @return IBceDealReturnData
	 * @throws Exception
	 * @throws RemoteException
     * @deprecated 请使用 IBusiAcceptSV
	 */
    @Deprecated
	public IBceDealReturnData offerVASStore(String billId, long offerId, ISoServicePkgData soProdData[], Map soAttrMap,
			String operType, long payType, List priceList, Timestamp vaildDate, Timestamp expireDate,Map extendMap) throws Exception,
			RemoteException;

	/**
	 * 增值策划订购、退订、产品变更一起受理
	 * @param billId
	 * @param offerVASList
	 * @param priceList
	 * @param validDate
	 * @param expireDate
	 * @param extendMap
	 * @return
	 * @throws Exception
	 * @throws RemoteException
     * @deprecated 请使用 IBusiAcceptSV
	 */
    @Deprecated
	public IBceDealReturnData offerVASListStore(String billId,List offerVASList, List priceList, Timestamp validDate, Timestamp expireDate,Map extendMap) throws Exception, RemoteException;

    /**
     * 
     * @param billId
     * @param offerId
     * @param channelType
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map delGroupMem(String billId,String offerId,Map map) throws Exception, RemoteException;
    /**
	 * @Function: chgOfferPlan
	 * @Description: 用户套餐变更
	 * @param billId	计费号码
	 * @param newOfferId	新的套餐ID
	 * @param businessId   外部传入的操作ID,如白卡改套餐,-1为换基本套餐操作
	 * @param servpkgData[]	订购的产品
	 * @param soAttrMap	服务属性 
	 * @param validDate 生效时间 传null为立即生效
	 * @param expireDate 失效时间 传null为2099
	 * @throws Exception
	 * @version: 1.0.0
	 * @author: wujie
	 * @date: 2011-12-30 13:30:00
     * @deprecated 请使用 IBusiAcceptSV
	 */
    @Deprecated
	public IBceDealReturnData chgOfferPlan(String billId, long newOfferId,long businessId,ISoServicePkgData[] servpkgData,List offerVASList, Map soAttrMap,Timestamp validDate, Timestamp expireDate,Map extendMap) throws Exception,RemoteException;


    /**
	 * @description 后台转户 生成新客户和账户资料
	 *
	 * @param businessId  转户操作ID 
	 * @param billId 待转户手机号码
	 * @param customerInfoDc 客户信息
	 * @param acctInfoDc 账户信息
	 * @param extendParam 所有文本字段 key-位置 
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version 1.0
	 * @author lizd3
	 * @update Jan 10, 2012 9:11:07 AM
	 */
	public IBceDealReturnData changeCustOwner(long businessId , String billId  , DataContainerInterface customerInfoDc ,DataContainerInterface acctInfoDc , Map extendParam) throws Exception,RemoteException ;
	/**用户程控功能修改
	 * @param billId 计费号码
	 * @param offerId 套餐编号 -1默认为基本套餐,其它值为指定策划
	 * @param prodData[]  产品列表
	 * @param offerVASList[]  增值策划列表
	 * @param soAttrMap  服务属性列表
	 * @throws Exception
	 * @throws RemoteException
     * @deprecated 请使用 IBusiAcceptSV
	 */
    @Deprecated
	public IBceDealReturnData chgUserFunc(String billId, long offerId, ISoServicePkgData prodData[],List offerVASList,
			Map soAttrMap,Timestamp validDate, Timestamp expireDate,Map extendMap) throws Exception, RemoteException;

    /**
     * 
     * @param billId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map dealGroupMemInfo(String billId) throws Exception, RemoteException;

    /**
     * 回滚订单
     *
     * @param billId
     * @param customOrderId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IBceDealReturnData rollbackOrder(String billId, long customOrderId, String rollReason,long channelType) throws Exception, RemoteException;

    /**
     * 查询账户关联的产品
     * 
     * @param 
     * @return
     * @throws Exception
     * @throws RemoteException
     * @version 1.0
     * @author sungq3
     * @date 2012-9-13
     */
    public IQUserRelInfoValue[] getAcctrelProdByAcctId(long acctId) throws Exception, RemoteException;
    
    /**
     * 保存预约订单
     * @param inMap
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map saveNetPubAppointOrder(Map inMap) throws Exception,RemoteException;
    
    /**
     * 查询网厅预约订单
     * @param iValues
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IBOAppointOrderValue[] getNetPubAppointOrder(IBOAppointOrderValue iValue)throws Exception,RemoteException;
}
