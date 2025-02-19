package com.asiainfo.crm.so.instance.bboss.service.interfaces;

import java.rmi.RemoteException;
import java.sql.Timestamp;

import com.ai.appframe2.common.DataContainerInterface;
import com.ai.omframe.instance.ivalues.IInsOffInsUserValue;
import com.ai.omframe.instance.ivalues.IInsOfferValue;
import com.ai.omframe.instance.ivalues.IInsSrvAttrValue;
import com.ai.omframe.instance.ivalues.IInsUserValue;
import com.ai.omframe.instance.ivalues.IQOfferUserValue;
import com.ai.omframe.instance.ivalues.IQryUserInfoByCustIdValue;
import com.asiainfo.crm.so.common.ivalues.IBOInsAccrelValue;


/**   
 * @Function: IBbossInstanceQrySV.java
 * @Description: 实例查询
 *
 * @param:参数描述
 * @return：返回结果描述
 * @throws：异常描述
 *
 * @version: v1.0.0
 * @author: zhangyu
 * @date: Jul 9, 2011 3:37:15 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * Jul 9, 2011     zhangyu           v1.0.0               修改原因
 */
public interface IBbossInstanceQrySV {
	
	
	/**
	 * 
	* @Function: IBbossInstanceQrySV.java
	* @Description: 根据计费编号查询用户实例
	*
	* @param:billId 服务号码
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: zhangyu
	* @date: Jul 9, 2011 3:42:20 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Jul 9, 2011     zhangyu           v1.0.0               修改原因
	 */
	public IInsUserValue getInstUserByBillId(String billId) throws RemoteException,Exception;
	
	/**
	 * 
	* @Function: IBbossInstanceQrySV.java
	* @Description: 根据策划实例编号查询策划实例的详细信息
	*
	* @param:instOfferId 策划实例编号
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: zhangyu
	* @date: Jul 9, 2011 4:40:28 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Jul 9, 2011     zhangyu           v1.0.0               修改原因
	 */
	public IInsOfferValue getInstOfferByInstOfferId(long instOfferId)throws RemoteException,Exception;
	
	
	/**查询该策划实例下所有成员关系
	 * @param mainOfferInstanceId
	 * @param regionId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IQOfferUserValue[] getAllGroupMembersByBillId(long mainOfferInstanceId,long roleId,String regionId)throws Exception ,RemoteException;
	
	/**根据策划实例编号和角色编号、角色的计费号码列表查询该套餐下、该角色、该计费号的成员信息
	 * @param offerInstanceId
	 * @param roleId
	 * @param billIds
	 * @param validType
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IQOfferUserValue[] getOfferUsersByInsOfferIdRoleId(long offerInstanceId, long roleId, String[] billIds, int validType, String regionId)throws Exception, RemoteException;
	/**
	 * 
	* @Function: IBbossInstanceQrySV.java
	* @Description: 根据客户ID查询策划实例表
	*
	* @param:参数描述
	* @return：返回客户订购的策划实例数组
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: wenhl
	* @date: Oct 29, 2012 8:30:46 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Oct 29, 2012     wenhl           v1.0.0               修改原因
	 */
	public IInsOfferValue[] getInstOfferByCustId(long custId) throws RemoteException,Exception;
	
	/**
	 * 根据账户ID查询账户下的全额代付用户和默认付费用户，如果默认付费用户被别的账户全额代付了，则需要过滤掉。
	* Copyright: Copyright (c) 2012 Asiainfo-Linkage
	* 
	* @ClassName: IBbossInstanceQryDAO.java
	* @Description: 该类的功能描述
	*
	* @version: v1.0.0
	* @author: wangbin
	* @date: 2012-10-31 上午10:27:19 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-10-31     wangbin           v1.0.0               修改原因
	 */
	public IBOInsAccrelValue[] queryInsAccrelByAcctId(long acctId) throws RemoteException,Exception;
	/**
	 * 
	* Copyright: Copyright (c) 2012 Asiainfo-Linkage
	* 
	* @ClassName: IBbossInstanceQryDAO.java
	* @Description: 根据策划ID查询用户实例信息
	*
	* @version: v1.0.0
	* @author: wangbin
	* @date: 2012-11-2 下午07:44:46 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-11-2     wangbin           v1.0.0               修改原因
	 */
	public IInsOfferValue[] getInstOfferByOfferId(long offerId,Timestamp effDate,Timestamp expDate,int startIndex,int endIndex)throws RemoteException,Exception;
	/**
	 * 
	* Copyright: Copyright (c) 2012 Asiainfo-Linkage
	* 
	* @ClassName: IBbossOrderQrySV.java
	* @Description: 根据策划实例ID和操作时间查询用户与策划实例关系信息
	*
	* @version: v1.0.0
	* @author: sungq3
	* @date: 2012-11-9 下午07:44:46 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-11-9     sungq3           v1.0.0               修改原因
	 */
	public IInsOffInsUserValue[] getInstOfferInstUserByOfferInsIdAndCreateDate(long offerInsId, String startDate, String endDate, int aIsMainOffer, int aValidType) throws Exception;

	/**
	 * 
	* Copyright: Copyright (c) 2012 Asiainfo-Linkage
	* 
	* @ClassName: IBbossOrderQrySV.java
	* @Description: 根据策划ID和客户Id获取策划实例信息
	*
	* @version: v1.0.0
	* @author: sungq3
	* @date: 2012-11-10 下午07:44:46 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-11-10     sungq3           v1.0.0               修改原因
	 */
	public IInsOfferValue[] getInstOfferByOfferId(long offerId, long custId, int validType) throws Exception;
	/**
	* 
	* Copyright: Copyright (c) 2012 Asiainfo-Linkage
	* 
	* @ClassName: IBbossOrderQrySV.java
	* @Description: 根据策划实例ID和属性Id获取属性实例信息
	*
	* @version: v1.0.0
	* @author: sungq3
	* @date: 2012-11-10 下午07:44:46 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-11-14     sungq3           v1.0.0               修改原因
	*/
	public IInsSrvAttrValue[] getInstSrvAttrBatchByOfferInstId(long offerInstId,long attrId) throws Exception;
	/**
	 *  根据客户编码获取客户下的套餐信息和用户信息
	 * autor sungq3
	 * 2011-6-7
	 * @param custId
	 * @param userId
	 * @param offerIds
	 * @param prodSpecIds 
	 * @param custRegionId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IQryUserInfoByCustIdValue[] getInstanceProdValueByCustId(long custId,long userId, long[] offerIds,long[] prodSpecIds, String custRegionId) throws Exception, RemoteException;
	/**
	 * 
	* Copyright: Copyright (c) 2012 Asiainfo-Linkage
	* 
	* @ClassName: IBbossInstanceQryDAO.java
	* @Description: 根据策划ID和客户Id获取策划实例信息
	*
	* @version: v1.0.0
	* @author: sungq3
	* @date: 2012-11-28 下午07:44:46 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-11-28     sungq3           v1.0.0               修改原因
	 */
	public IInsOfferValue[] getInstOfferByOfferIdCustId(long offerId, long custId, int validType, int state) throws Exception;

	 /**
     * 根据产品实例编号、是否为主产品查询所对应的策划和产品实例关系(多记录返回)
     * 用于用户信息查询的用户产品查询
     * @param userId
     * @param aIsMainOffer
     * @param aValidType
     * @return
     * @throws Exception
     * @author sungq3
     * @date 2012-12-04
     */
	public IInsOffInsUserValue[] getInstOfferInstUserByUserId(long userId, int aIsMainOffer, int aValidType) throws Exception ;
	
	 /**
	   * 根据策划实例编号、是否为主产品查询所对应的策划和产品实例关系(多记录返回)
	   * 用于成员添加、删除时，查询成员数
	   * @param userId
	   * @param aIsMainOffer
	   * @param aValidType
	   * @return
	   * @throws Exception
	   * @author sungq3
       * @date 2012-12-04
	   */
	  public IInsOffInsUserValue[] getInstOfferInstUserByOfferInsId(long offerInsId, int aIsMainOffer, int aValidType) throws Exception ;
	  
	  public DataContainerInterface getUserGeneralInfo(String billId) throws Exception;

}
