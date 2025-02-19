package com.asiainfo.crm.so.instance.rboss.service.interfaces;

import java.rmi.RemoteException;
import java.sql.Date;

import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.so.instance.rboss.ivalues.IBOInsDesAccrelValue;
import com.asiainfo.crm.so.instance.rboss.ivalues.IBOInsDesOfferValue;
import com.asiainfo.crm.so.instance.rboss.ivalues.IBOInsDesUserValue;
import com.asiainfo.crm.so.query.ivalues.IBOBoundaryRoamValue;
import com.asiainfo.crm.so.query.ivalues.IQAcctRelInfoValue;
import com.asiainfo.crm.so.query.ivalues.IQUserBaseInfoValue;
/**
 * 销号后用户信息
 * @author songyh
 *
 */
public interface IInsDestroyUserInfoSV {

	public IBOInsDesUserValue[] getInsDesUserByBillId(String billId) throws Exception,RemoteException;
	
	public IBOInsDesUserValue getInsDesUserByUserId(long userId) throws Exception, RemoteException;
	
	public IBOInsDesAccrelValue[] getInsDesAccrel(long acctId) throws Exception,RemoteException;
	
	public IBOInsDesAccrelValue[] getInsDesAccrel(long userId, long payType) throws Exception,RemoteException;
	
	/**
	 * 根据用户ID数据查询已销户用户账务关系
	 * @param userIds
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IBOInsDesAccrelValue[] getInsDesAccrel(long[] userIds) throws Exception,RemoteException;
	
	public IBOInsDesAccrelValue[] getInsDesAccrelByUserId(long userId) throws Exception,RemoteException;
		
	/**   
	* @Function: removeInsDesUserByUserId
	* @Description: 销户重入网后，删除销户表数据
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: xiaozhibi
	* @date: Jun 12, 2012 11:41:28 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Jun 12, 2012     xiaozhibi           v1.0.0               修改原因
	*/
	public void removeInsDesUserByUserId(long userId) throws Exception,RemoteException;
	public void removeInsDesAccrelByUserId(long userId) throws Exception,RemoteException;
	public void removeInsDesCmrelByUserId(long userId) throws Exception,RemoteException;
	
	/**   
	* @Function: getInsDesOffers
	* @Description: 获取用户销户前的策划订购信息
	*
	* @param:userId: 销户用户编号
	*        offerType：策划类型
	*        validType：用户销户前的策划生效类型(目前只支持查询销户前当前生效和下周期生效的策划，
	*        	如果有其他需求，需要增加查询条件)
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: xiaozhibi
	* @date: Jul 6, 2012 9:55:20 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Jul 6, 2012     xiaozhibi           v1.0.0               修改原因
	*/
	public IBOInsDesOfferValue[] getInsDesOffers(long userId,String offerType,int validType) throws Exception,RemoteException;

	/**   
	* @Function: getDestroyUserInfo
	* @Description: 获取已号码回收的销户手机号码的用户信息
	*
	* @param:   billId：已号码回收的销户手机号码用户编号
	* @param:   userId：已号码回收的销户
	* @return：
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: xiaozhibi
	* @date: Sep 4, 2012 8:37:03 PM  
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Sep 4, 2012      xiaozhibi           v1.0.0               修改原因
	*/
	public IQUserBaseInfoValue[] getDestroyUserInfo(String billId,long userId)throws RemoteException,Exception;

    /**
     * @Function: getDestroyUserAccrelInfo
     * @Description: 根据历史用户编号（已回收）查询帐务关系
     * @param: userId：销户用户编号
     * 		   payType：1 基本付费, 2 分帐,-1 全部
     * @return：
     * @throws：异常描述
     * @version: v1.0.0
     * @author: xiaozhibi
     * @date: Aug 31, 2012 10:58:37 AM
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * Aug 31, 2012      xiaozhibi           v1.0.0               修改原因
     */
    public IQAcctRelInfoValue[] getDestroyUserAccrelInfo(long userId, int payType) throws Exception, RemoteException;
    
    /**
	 * 
	 *
	 * @Function: getBeansFromQueryBO
	 * @Description: 该函数的功能描述
	 *
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 *
	 * @version: V1.0.0
	 * @author: wuyb <wuyb@asiainfo-linkage.com>
	 * @date: 2012-9-5 下午04:01:05 
	 *
	 * Modification History:
	 * Date                     Author          Version            Description
	 *---------------------------------------------------------------------*
	 * 2012-9-5  下午04:01:05        wuyb          V1.0.0             Add
	 *
	 */
	public  DataContainerInterface[] getInsDesUserAccCustInfo(String billId,int $STARTROWINDEX,int $ENDROWINDEX) throws Exception ;
	public  int getInsDesUserAccCustInfoCount(String billId) throws Exception ;
}
