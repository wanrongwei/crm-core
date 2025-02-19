package com.asiainfo.crm.so.order.rboss.service.interfaces;

import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.util.List;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.omframe.instance.ivalues.IInsUserOsStateValue;
import com.ai.omframe.order.data.ivalues.ISoOrderData;
import com.ai.omframe.order.ivalues.IOVOrderCustomer;
import com.ai.omframe.order.ivalues.IOVOrderOffer;
import com.ai.omframe.order.ivalues.IOrdUserOsStateValue;
import com.ai.omframe.order.ivalues.IOrdUserValue;
import com.ai.omframe.order.valuebean.OrderValueChain;
import com.asiainfo.crm.so.common.ivalues.IBOInsAccrelValue;
import com.asiainfo.crm.so.instance.rboss.ivalues.IBOInsxTemporaryOpenHisValue;
import com.asiainfo.crm.so.instance.rboss.ivalues.IBOInsxTemporaryOpenValue;

/**
 * 
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @Description: 停复机业务服务接口
 *
 * @version: v1.0.0 
 * @author: lipj@asiainfo-linkage.com
 * @date: Jul 6, 2012 11:40:14 AM 
 *
 * Modification History:
 * Date            Author          Version            Description
 *---------------------------------------------------------*
 * Jul 6, 2012   lipj        v1.0.0            停复机业务处理类
 */
public interface IStopOpenOsStatusSV {

	/**
	 * 
	 * @Description: 根据用户订单生成用户停开机订单
	 *
	 * @param:IOrdUserValue  aOrdUserValue 用户订单
	 * @return：IOrdUserOsStateValue 用户停开机订单
	 * @throws：Exception,RemoteException
	 *
	 * @version: v1.0.0
	 * @author: lipj@asiainfo-linkage.com
	 * @date: Jul 2, 2012 11:55:05 AM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jul 2, 2012     lipj       v1.0.0               修改原因
	 */
	public IOrdUserOsStateValue createOrdUserOsState (IOrdUserValue aOrdUserValue) throws Exception,RemoteException;
	
	/**
	 * 
	 * @Description: 根据用户订单生成用户停开机订单,用于帐务停复机有相互连带的情况
	 *
	 * @param:IOVOrderCustomer ovOrderCustomer 客户订单OV对象
	 * @param:IOrdUserValue  aOrdUserValue 用户订单
	 * @return：IOrdUserOsStateValue 用户停开机订单
	 * @throws：Exception,RemoteException
	 * @version: v1.0.0
	 * @author: lipj@asiainfo-linkage.com
	 * @date: Jul 26, 2012 10:15:05 AM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jul 26, 2012     lipj       v1.0.0               修改原因
	 */
	public IOrdUserOsStateValue createOrdUserOsStateForAcc(IOVOrderCustomer ovOrderCustomer,IOrdUserValue aOrdUserValue) throws Exception,RemoteException;

	/**
	 *  根据用户订单生成用户停开机订单,用于帐务停复机有相互连带的情况,用于workflow
	 * @param customerOrderId
	 * @throws Exception
	 * @throws RemoteException
	 *@author wulq
	 */
	public void createOrdUserOsStateForAcc(long customerOrderId) throws Exception,RemoteException;
    /**
     * 
     * @Description: 从SoOrderData中取出勾选的连带号
     *
     * @param:ISoOrderData aSoOrderData
     * @return：List
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: lipj@asiainfo-linkage.com
     * @date: Jul 27, 2012 10:26:39 AM 
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * Jul 27, 2012     lipj       v1.0.0               修改原因
     */
    public List getAccChildBills(ISoOrderData aSoOrderData,IOVOrderCustomer ovOrderCustomer) throws Exception, RemoteException;

    /**
     * 从SoOrderData中取出勾选的连带号
     * @param customerOrderId
     * @return
     * @throws Exception
     * @throws RemoteException
     *@author wulq
     */
    public long getAccChildBills(long customerOrderId) throws Exception, RemoteException;
    
    /**
     * 根据索引获得连带号
     * @param billIdIndex
     * @return
     * @throws Exception
     * @throws RemoteException
     *@author wulq
     */
    public String getChildBillId(long customerOrderId,int billIdIndex) throws Exception,RemoteException;
    
	/**
	 * 
	 * @Description: 获取停复机状态位值
	 *
	 * @param: String userId 用户ID
	 * @return：String osStatus
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: lipj@asiainfo-linkage.com
	 * @date: Jul 5, 2012 11:11:41 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jul 5, 2012     lipj       v1.0.0               修改原因
	 */
    public String getOsStatusValue(String userId) throws Exception,RemoteException;
	
    
	/**
	 * 
	 * @Description: 获取停复机状态位值
	 *
	 * @param: long userId 用户ID
	 * @return：String osStatus
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: lipj@asiainfo-linkage.com
	 * @date: Jul 5, 2012 11:11:41 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jul 5, 2012     lipj       v1.0.0               修改原因
	 */
    public String getOsStatusValue(long userId) throws Exception,RemoteException;

    /**
     * 
    * @Function: getOsStatusValue
    * @Description: 获取停复机状态位值,不足64的位的将被补齐64位
    *
    * @param:参数描述
    * @return：返回结果描述
    * @throws：异常描述
    *
    * @version: v1.0.0
    * @author: lipj
    * @date: Jul 2, 2012 10:40:54 AM 
    *
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * Jul 2, 2012     lipj           v1.0.0               修改原因
     */
    public String getOsStatusValue(long userId, int validType) throws Exception, RemoteException;
    
	/**
     * 
     * @Description: 翻译停开状态标志,带时间标注
     *例如： 营业停(2012-7-6)
     * @param: sOsFlag 停开状态标志
     * @param: insUserOsState 停开状态实例
     * @return：strOsStatus 翻译后的停开状态标志
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: lipj@asiainfo-linkage.com
     * @date: Jul 6, 2012 11:44:06 AM 
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * Jul 6, 2012     lipj       v1.0.0               修改原因
     */
    public String getOsStatusAndTime(String sOsFlag,IInsUserOsStateValue insUserOsState) throws Exception,RemoteException;
    
	/**
     * 
     * @Description: 翻译停开状态标志
     *
     * @param: sOsFlag 停开状态标志
     * @return：strOsStatus 翻译后的停开状态标志
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: lipj@asiainfo-linkage.com
     * @date: Jul 6, 2012 11:44:06 AM 
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * Jul 6, 2012     lipj       v1.0.0               修改原因
     */
    public String getOsStatus(String sOsFlag) throws Exception,RemoteException;
    
    /**
	 * 
	 * @Description: 根据条件具体设置停开机某一位的停开状态值
	 *
	 * @param: String osStatus 待修改的停开值
	 * @param: int index  需要修改的位数，从左到右数，从0开始计数。0管理停开,1营业停开,2帐务停开,3营业的连带停开,4呼出限制停开,
	 * 5帐务的连带停开,6管理的连带停开,7呼出限制的连带停开,8营业预销停开,9帐务预销停开,10管理预销停开,11资金有效期停开
	 * @param: String flag 取值0表示开，1表示停
	 * @return：修改后的停开值
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: lipj@asiainfo-linkage.com
	 * @date: Jul 15, 2012 11:16:35 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jul 15, 2012     lipj       v1.0.0               修改原因
	 */
	public String setOsStatus (String osStatus,int index,String flag) throws Exception, RemoteException;
 	
	/**
	 * 
	 * @Description: 修改用户停开机状态
	 *
	 * @param: ISoOrderData aSoOrderData 受理订单对象
	 * @param:IOrdUserOsStateValue aOrdUserOsStateValue  用户停开机订单
	 * @return：IOrdUserOsStateValue
	 * @throws：Exception, RemoteException
	 *
	 * @version: v1.0.0
	 * @author: lipj@asiainfo-linkage.com
	 * @date: Jul 14, 2012 8:43:47 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jul 14, 2012     lipj       v1.0.0               修改原因
	 */
	 public IOrdUserOsStateValue chgUserOsStatus(ISoOrderData aSoOrderData,IOrdUserOsStateValue aOrdUserOsStateValue,IOVOrderOffer aOVOrderOffer,IOVOrderCustomer aOVOrderCustomer) throws Exception,RemoteException;

	 /**
	  * 修改用户停开机状态,修改给workflow
	  * @param customerOrderId
	  * @throws Exception
	  * @throws RemoteException
	  *@author wulq
	  */
	 public void chgUserOsStatus(long customerOrderId) throws Exception,RemoteException;

	// 停开机修改客户状态
	public void saveCmLifeCycle4OSStatus(long customerOrderId) throws Exception,RemoteException;

	/**
	  * 
	 * @Function: 停开机修改客户状态(for wholesale)
	 * @Description: 该方法的描述
	 *
	 * @param:
	 * @return：
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: Joker Zhao
	 * @date: Dec 19, 2015 10:46:51 AM  
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Dec 23, 2015      Joker Zhao           v1.0.0               修改原因
	  */
	public void saveCmLifeCycle4OSStatus4WS(long customerOrderId) throws Exception,RemoteException;
	 /**
	  * 
	 * @Function: 对于预销用户缴费开机 调用销户重入网接口
	 * @Description: 该方法的描述
	 *
	 * @param:
	 * @return：
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: lipj
	 * @date: Dec 19, 2012 2:46:51 PM  
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Dec 19, 2012      lipj           v1.0.0               修改原因
	  */
	 public void dealPreDestroyUser(ISoOrderData aSoOrderData,IOVOrderCustomer iOVOrderCustomer)throws Exception,RemoteException;
	 
	 /**
	  * 对于预销用户缴费开机 调用销户重入网接口 workflow
	  * @param customerOrderId
	  * @throws Exception
	  * @throws RemoteException
	  *@author wulq
	  */
	 public void dealPreDestroyUser(long customerOrderId)throws Exception,RemoteException;
	 /**
	  * 
	 * @Function: 
	 * @Description: 保存代办人信息
	 *
	 * @param:
	 * @return：
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: lipj
	 * @date: Oct 17, 2012 2:56:19 PM  
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Oct 17, 2012      lipj           v1.0.0               修改原因
	  */
	 public void saveAgency(ISoOrderData aSoOrderData,IOVOrderCustomer iOVOrderCustomer) throws Exception,RemoteException;
	 
	 /**
	  * 保存代办人信息
	  * @param customerOrderId
	  * @throws Exception
	  * @throws RemoteException
	  *@author wulq
	  */
	 public void saveAgency(long customerOrderId) throws Exception,RemoteException;
	 /**
	     * 
	     * @Description: 判断是否单停、双停、正常。小于12位返回错误。0-11位有1为停机，无1为正常
	     *
	     * @param:String sOsFlag 20位停开机状态值
	     * @return：单停、双停、正常
	     * @throws：异常描述
	     *
	     * @version: v1.0.0
	     * @author: lipj@asiainfo-linkage.com
	     * @date: Jul 12, 2012 8:58:42 PM 
	     *
	     * Modification History:
	     * Date         Author          Version            Description
	     *---------------------------------------------------------*
	     * Jul 12, 2012     lipj       v1.0.0               修改原因
	*/
	public String checkIsOneStopDoubleStop(String sOsFlag)throws Exception,RemoteException;
		
		
	/**
	    * 
	    * @Description: 判断该用户是否有连带用户，有则返回相应的连带服务号码列表
	    *
	    * @param:String billId 主号 
	    * @param:IOVOrderCustomer ovOrderCustomer 
	    * @return：List
	    * @throws：异常描述
	    *
	    * @version: v1.0.0
	    * @author: lipj
	    * @date: Jul 25, 2012 4:51:32 PM 
	    *
	    * Modification History:
	    * Date         Author          Version            Description
	    *---------------------------------------------------------*
	    * Jul 25, 2012     lipj           v1.0.0               修改原因
	 */
	public List decisionHasChild(String billId,long businessId) throws Exception, RemoteException;
				    
	/**
	     * 
	     * @Description: 用于停复机连带用户OVOrderOffer的生成，创建连带用户的策划、用户及策划用户关系订单
	     *
	     * @param: IOVOrderCustomer iOVOrderCustomer 订单OV对象
	     * @param: OrderValueChain  ovc
	     * @param: String 		    regionId
	     * @param: String           childBillId 	 连带用户服务号码
	     * @param: String           osType      	 操作类型
	     * @param: boolean	       needChgBusinessId 是否需要改变BusinessId
	     * @return：IOVOrderOffer 连带用户的
	     * @throws：异常描述
	     *
	     * @version: v1.0.0
	     * @author: lipj@asiainfo-linkage.com
	     * @date: Jul 26, 2012 9:25:36 AM 
	     *
	     * Modification History:
	     * Date         Author          Version            Description
	     *---------------------------------------------------------*
	     * Jul 26, 2012     lipj           v1.0.0               修改原因
	 */
	public IOVOrderOffer createOVOrderOfferChild(IOVOrderCustomer iOVOrderCustomer,OrderValueChain ovc,String regionId,String childBillId,String osType,boolean needChgBusinessId)throws Exception, RemoteException;
	
	/**
	 * 用于停复机连带用户OVOrderOffer的生成，创建连带用户的策划、用户及策划用户关系订单,新接口提供给workflow
	 * @param regionId
	 * @param childBillId
	 * @param osType
	 * @param needChgBusinessId
	 * @throws Exception
	 * @throws RemoteException
	 *@author wulq
	 */
	public void createOVOrderOfferChild(long customerOrderId,String regionId,String childBillId,String osType,boolean needChgBusinessId)throws Exception, RemoteException;
	/**
	 * 
	* @Function: getOsStatusType
	* @Description: 返回停开机状态位，不足64位的将补足64位
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: lipj
	* @date: Aug 17, 2012 4:25:30 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Aug 17, 2012     lipj           v1.0.0               修改原因
	 */
	public String getOsStatusType(long userId, int validType) throws Exception, RemoteException;
	    
	/**
	 * @Description: 判断停开机规则是否可以执行
	 * @param billId 当前号码
	 * @param busiOperId 操作ID
	 * @param strBillId 连带号码
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @version: v1.0.0
     * @author: lipj@asiainfo-linkage.com
     * @date: Jul 27, 2012 9:25:36 AM 
     * 
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * Jul 27, 2012     lipj           v1.0.0               修改原因
    */
	public String checkRelBillIdIsCanDoOs(String billId,String strOsType,String[] strBillId)throws Exception, RemoteException;
	
	/**
		 * @Description: 判断帐停、帐复、有效期延长的连带号能否执行
		 * @param billId 当前号码
		 * @param busiOperId 操作ID
		 * @param strBillId 连带号码
		 * @return
		 * @throws Exception
		 * @throws RemoteException
		 * @version: v1.0.0
	     * @author: lipj@asiainfo-linkage.com
	     * @date: Jul 27, 2012 9:25:36 AM 
	     * 
	     * Modification History:
	     * Date         Author          Version            Description
	     *---------------------------------------------------------*
	     * Jul 27, 2012     lipj           v1.0.0               修改原因
	    */
	public String checkRelBillIdIsCanDoOsForACC(String billId,long busiOperId,String[] strBillId)throws Exception, RemoteException;
		
	/**
	     * 
	     * @Description: 查找与用户同账户的连带用户数量，帐务停复机使用
	     *
	     * @param:主号 billId
	     * @return：DataContainerInterface[]
	     * @throws：异常描述
	     *
	     * @version: v1.0.0
	     * @author: lipj@asiainfo-linkage.com
	     * @date: Jul 28, 2012 11:53:36 AM 
	     *
	     * Modification History:
	     * Date         Author          Version            Description
	     *---------------------------------------------------------*
	     * Jul 28, 2012     lipj       v1.0.0               修改原因
	 */
	 public int decisionHasChildForAccCount(String billId) throws Exception, RemoteException;
	    
	 /**
	     * 
	     * @Description: 查找与用户同账户的连带用户，帐务停复机使用
	     * 用户页面调用，用来展示账户下的所有用户
	     * @param:主号 billId
	     * @return：DataContainerInterface[]
	     * @throws：异常描述
	     *
	     * @version: v1.0.0
	     * @author: lipj@asiainfo-linkage.com
	     * @date: Jul 28, 2012 11:53:36 AM 
	     *
	     * Modification History:
	     * Date         Author          Version            Description
	     *---------------------------------------------------------*
	     * Jul 28, 2012     lipj       v1.0.0               修改原因
	  */
	 public DataContainerInterface[] decisionHasChildForAcc(String billId) throws Exception, RemoteException;
	 
	 /**
	  * 根据用户编号获取当前用户停复机实例信息
	 * @Function: queryInstUserOsStateValueByUserId
	 * @Description: 该函数的功能描述
	 *
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: lipj
	 * @date: Aug 27, 2012 2:37:10 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Aug 27, 2012     lipj           v1.0.0               修改原因
	  */
	 public IInsUserOsStateValue queryInstUserOsStateValueByUserId(long userId) throws Exception, RemoteException;
	 
	 /**
	  * 临时开机处理，往临时开机表里面插入一条记录
	 * @Function: dealTempOpen
	 * @Description: 该函数的功能描述
	 *
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: lipj
	 * @date: Aug 31, 2012 3:31:22 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Aug 31, 2012     lipj           v1.0.0               修改原因
	  */
	 public String dealTempOpen(ISoOrderData aSoOrderData,IOVOrderCustomer aOVOrderCustomer,long businessId) throws Exception, RemoteException;
	 
	 /**
	  * 供信控（帐务侧）停复机进程调用
	 * @Function: communicationControlStopOpen
	 * @Description: 信控停开机
	 *
	 * @param: String oldOsStatus 信控（帐务侧）停开状态值，要与当前停开机实例里停开状态值比较，相同才能操作
     * @param: String busiCode 信控（帐务侧）操作编码：目前支持账务停开、账务连带停开、呼限、呼限取消、有效期停开
     * @param: long userId 用户编号
     * @param: long processOpId 后台进程OP_ID
     * @param: long processOrgId 后台进程ORG_ID
	 * @return：返回结果描述
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: lipj
	 * @date: Aug 27, 2012 2:25:15 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Aug 27, 2012     lipj           v1.0.0               修改原因
	  */
	 public void communicationControlStopOpen(String oldOsStatus,int psType,int nsts,long userId,String regionId,long processOpId,long processOrgId,String note) throws Exception, RemoteException;
	 
	 
	 
	 /**
	  * 停复机页面产品暂停恢复
	  * @param billId
	  * @param userId
	  * @param businessId
	  * @param prodId
	  * @param prodInstId
	  * @param regionId
	  * @param processOpId
	  * @param processOrgId
	  * @param note
	  * @throws Exception
	  * @throws RemoteException
	  */
	 public void prodStopOpen(String billId,long userId,long businessId,long prodId,long prodInstId,String regionId,long processOpId,long processOrgId,String note) throws Exception, RemoteException;
	 
	 /**
	  * 
	 * @Function: stopOrStartUser
	 * @Description: 提供给其他接口调用停开机操作
	 *
	 * @param:osType
     * 0：管理停机
	 * 1：管理复机
	 * 2：营业停机
	 * 3：营业复机
	 * @return：返回结果描述
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: lipj
	 * @date: Sep 4, 2012 4:13:29 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Sep 4, 2012     lipj           v1.0.0               修改原因
	  */
	 public long stopOrStartUser(String billId,int osType,int ztTyoe,int isLost)throws Exception, RemoteException;
	 
	 /**
	  * 根据userId路由保存停开机实例
	 * @Function: saveInsUserOsValue
	 * @Description: 该函数的功能描述
	 *
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: lipj
	 * @date: Aug 27, 2012 3:15:22 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Aug 27, 2012     lipj           v1.0.0               修改原因
	  */
	 public void saveInsUserOsValue(long userId,IInsUserOsStateValue insUserOsStateValue)throws Exception, RemoteException;
	 
	/**
		 * 
		 * @Description: 停复机送开通
		 *
		 * @param:参数描述
		 * @return：返回结果描述
		 * @throws：异常描述
		 *
		 * @version: v1.0.0
		 * @author: lipj@asiainfo-linkage.com
		 * @date: Jul 24, 2012 4:15:46 PM 
		 *
		 * Modification History:
		 * Date         Author          Version            Description
		 *---------------------------------------------------------*
		 * Jul 24, 2012     lipj       v1.0.0               修改原因
	*/
	public void osStatusSendToOpen(IOVOrderCustomer ovOrderCustomer,ISoOrderData aSoOrderData)throws Exception,RemoteException;
	
	/**
	 * 停复机送开通
	 * @param customerOrderId
	 * @param taskId
	 * @throws Exception
	 * @throws RemoteException
	 *@author wulq
	 */
	public void osStatusSendToOpen(long customerOrderId,String taskId)throws Exception,RemoteException;
	
	/**
	 * 
	 * @Description: 停复机送计费
	 *
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: lipj@asiainfo-linkage.com
	 * @date: Jul 24, 2012 4:15:46 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jul 24, 2012     lipj       v1.0.0               修改原因
*/
	public void osStatusSendToBilling(IOVOrderCustomer ovOrderCustomer,ISoOrderData aSoOrderData) throws Exception, RemoteException ;

	/**
	 * 停复机送计费
	 * @param customerOrderId
	 * @throws Exception
	 * @throws RemoteException
	 *@author wulq
	 */
	public void osStatusSendToBilling(long customerOrderId) throws Exception, RemoteException ;
	   
	/**
	 * 
	 * @Description: 停复机送开通
	 *
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: lipj@asiainfo-linkage.com
	 * @date: Jul 24, 2012 4:15:46 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jul 24, 2012     lipj       v1.0.0               修改原因
	 */
	public void osStatusSendToOpen(IOVOrderCustomer ovOrderCustomer)throws Exception,RemoteException;

	
	/**
		 * 
		 * @Description: 停复机送计费
		 *
		 * @param:参数描述
		 * @return：返回结果描述
		 * @throws：异常描述
		 *
		 * @version: v1.0.0
		 * @author: lipj@asiainfo-linkage.com
		 * @date: Jul 5, 2012 4:15:46 PM 
		 *
		 * Modification History:
		 * Date         Author          Version            Description
		 *---------------------------------------------------------*
		 * Jul 5, 2011     lipj       v1.0.0               修改原因
	*/
	public void osStatusSendToBilling(IOVOrderCustomer aICustomerL)throws Exception,RemoteException;
	
	/**
	 * 
	 * @Description: 停复机停机位校验
	 *
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: zhangbo9@asiainfo-linkage.com
	 * @date: Mar 5, 2012 4:15:46 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 5, 2011     zhangbo9       v1.0.0               修改原因
	**/
	public boolean checkIsFlagStopOrOpen(String billId,int flag,String operat) throws Exception, RemoteException;
	
	/**
	 * 
	* @Function: saveUserOsStatePs
	* @Description: 提供给帐管信控停开机写接口表方法
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: lipj
	* @date: Sep 14, 2012 7:56:40 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Sep 14, 2012     lipj           v1.0.0               修改原因
	 */
	public void saveUserOsStatePs(long USER_ID, String OLD_OS_STATUS, String BOSS_DONE_CODE, long BUSINESS_ID, String REGION_ID, int PS_TYPE)throws Exception,RemoteException;
		
	/**
	 * 
	* @Function: queryUserTempOpen
	* @Description: 查询用户有效的停开机记录
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: lipj
	* @date: Sep 14, 2012 8:01:24 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Sep 14, 2012     lipj           v1.0.0               修改原因
	 */
	public IBOInsxTemporaryOpenValue queryUserTempOpen(long userId)throws Exception, RemoteException;
	
	/**
	 * 
	 *
	 * @Function: returnNormal
	 * @Description: 标准神州行状态维护修改
	 *
	 * @param: IOVOrderCustomer 客户实例
	 * @param: IOVOrderOffer 订单实例
	 * @return：返回结果描述
	 * @throws：Exception ,RemoteException
	 *
	 * @version: V1.0.0
	 * @author: Joes.Xin <xinjl@asiainfo-linkage.com>
	 * @date: 2012-9-20 下午02:56:37 
	 *
	 * Modification History:
	 * Date                     Author          Version            Description
	 *---------------------------------------------------------------------*
	 * 2012-9-20  下午02:56:37        Joes.Xin          V1.0.0             Add
	 *
	 */
	public IOVOrderCustomer returnNormal(IOVOrderCustomer aOVOrderCustomer, IOVOrderOffer aOVOrderOffer) throws Exception ,RemoteException;
	
	/**
	 * 
	* @Function: 按月根担保据用户ID查询担保信息
	* @Description: 该方法的描述
	*
	* @param:
	* @return：
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: lipj
	* @date: Sep 28, 2012 8:37:40 PM  
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Sep 28, 2012      lipj           v1.0.0               修改原因
	 */
	public DataContainer getAssureValueByAssureUserId(long assureUserId,Timestamp yearMonth)throws Exception ,RemoteException;
	
	/**
	 * 根据账户ID查询临时开机表的所有有效记录
	* @Function: 
	* @Description: 该方法的描述
	*
	* @param:
	* @return：
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: lipj
	* @date: Oct 9, 2012 4:23:05 PM  
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Oct 9, 2012      lipj           v1.0.0               修改原因
	 */
	public IBOInsxTemporaryOpenValue[] queryInsxTemporaryOpenByAcctId(long acctId,int operType, int validType)throws Exception ,RemoteException;
	
	/**
	 * 根据账户ID查询临时开机表的所有有效记录
	* @Function: 
	* @Description: 该方法的描述
	*
	* @param:
	* @return：
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: lipj
	* @date: Oct 9, 2012 4:23:05 PM  
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Oct 9, 2012      lipj           v1.0.0               修改原因
	 */
	public IBOInsxTemporaryOpenValue[] queryInsxTemporaryOpenByAcctId(long acctId)throws Exception ,RemoteException;

	/**
	 * 查询临时开机记录表
	* @Function: 
	* @Description: 该方法的描述
	*
	* @param:
	* @return：
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: lipj
	* @date: Oct 24, 2012 3:23:05 PM  
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Oct 24, 2012      lipj           v1.0.0               修改原因
	 */
	public IBOInsxTemporaryOpenValue[] getInsxTemporaryOpenByUserId(long userId,int operType, int validType)throws Exception ,RemoteException;
	
	
	/**
	 * 查询临时开机历史记录表
	* @Function: 
	* @Description: 该方法的描述
	*
	* @param:
	* @return：
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: lipj
	* @date: Oct 24, 2012 3:23:05 PM  
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Oct 24, 2012      lipj           v1.0.0               修改原因
	 */
	public IBOInsxTemporaryOpenHisValue[] getInsxTemporaryOpenHisByUserId(long userId,int operType)throws Exception ,RemoteException;
	
	
	/**
	 * 根据担保人用户ID查询临时开机记录表
	* @Function: 
	* @Description: 该方法的描述
	*
	* @param:
	* @return：
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: lipj
	* @date: Oct 24, 2012 3:23:05 PM  
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Oct 24, 2012      lipj           v1.0.0               修改原因
	 */
	public IBOInsxTemporaryOpenValue[] getInsxTemporaryOpenByAssureUserId(long assureUserId)throws Exception, RemoteException;
	
	
	/**
	 * 根据担保人用户ID查询临时开机历史记录表
	* @Function: 
	* @Description: 该方法的描述
	*
	* @param:
	* @return：
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: lipj
	* @date: Oct 24, 2012 3:23:05 PM  
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Oct 24, 2012      lipj           v1.0.0               修改原因
	 */
	public IBOInsxTemporaryOpenHisValue[] getInsxTemporaryOpenHisByAssureUserId(long assureUserId)throws Exception, RemoteException;
	
	/**
	 * 根据用户ID查询临时开机表
	* @Function: 
	* @Description: 该方法的描述
	*
	* @param:
	* @return：
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: lipj
	* @date: Nov 1, 2012 3:23:05 PM  
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Nov 1, 2012      lipj           v1.0.0               修改原因
	 */
	public IBOInsxTemporaryOpenValue[] getInsxTemporaryOpenByUserId(long userId,int operType)throws Exception, RemoteException;
		
	/**
	 * 根据联合主键查询临时开机表
	* @Function: 
	* @Description: 该方法的描述
	*
	* @param:
	* @return：
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: lipj
	* @date: Nov 1, 2012 3:23:05 PM  
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Nov 1, 2012      lipj           v1.0.0               修改原因
	 */
	public IBOInsxTemporaryOpenValue[] getInsxTemporaryOpen(long userId,Timestamp validDate,Timestamp expireDate,String regionId,int operType)throws Exception, RemoteException;
	
	/**
	 * 保存到临时开机表
	* @Function: 
	* @Description: 该方法的描述
	*
	* @param:
	* @return：
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: lipj
	* @date: Nov 1, 2012 3:23:05 PM  
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Nov 1, 2012      lipj           v1.0.0               修改原因
	 */
	public void saveInsxTemporaryOpen(IBOInsxTemporaryOpenValue[] value)throws Exception, RemoteException;
	
	/**
	 * 从临时开机表删除
	* @Function: 
	* @Description: 该方法的描述
	*
	* @param:
	* @return：
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: lipj
	* @date: Nov 1, 2012 3:23:05 PM  
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Nov 1, 2012      lipj           v1.0.0               修改原因
	 */
	public void deleteInsxTemporaryOpen(IBOInsxTemporaryOpenValue[] value)throws Exception, RemoteException;
	
	/**
	 * 判断是否需要连带
	* @Function: 
	* @Description: 
	*
	* @param:
	* @return：
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: ycy
	* @date: July 31, 2013 3:23:05 PM  
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* July 31, 2013      ycy           v1.0.0               修改原因
	 */
	public boolean isNeedRelateOs(long  customerOrderId) throws Exception, RemoteException;
	/**
	 * 判断是否预约
	* @Function: 
	* @Description: 
	*
	* @param:
	* @return：
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: ycy
	* @date: July 31, 2013 3:23:05 PM  
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* July 31, 2013      ycy           v1.0.0               修改原因
	 */
	public boolean isAppoint(long  customerOrderId) throws Exception, RemoteException;
	
	/**
	 * 保存预约记录
	* @Function: 
	* @Description: 
	*
	* @param:
	* @return：
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: ycy
	* @date: July 31, 2013 3:23:05 PM  
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* July 31, 2013      ycy           v1.0.0               修改原因
	 */
	public void saveAppoint(long  customerOrderId) throws Exception, RemoteException;
	
	/**
	 * 获取订单操作级别
	* @Function: 
	* @Description: 
	*
	* @param:
	* @return：
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: ycy
	* @date: July 31, 2013 3:23:05 PM  
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* July 31, 2013      ycy           v1.0.0               修改原因
	 */
	public String getOsLevel(long customerOrderId)throws Exception,RemoteException;
	
	/**
	 * 执行产品暂停/恢复
	* @Function: 
	* @Description: 
	*
	* @param:
	* @return：
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: ycy
	* @date: July 31, 2013 3:23:05 PM  
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* July 31, 2013      ycy           v1.0.0               修改原因
	 */
	public void doOsProduct(long customerOrderId)throws Exception,RemoteException;
	
	/**
	 * 获取静态数据
	 * 
	 * @param codeType
	 * @param multi
	 * @param countryCode
	 * @param channelId
	 * @param payType
	 * @return
	 * @throws Exception
	 */
	public IBOBsStaticDataValue[]  getBsStaticData(String codeType, boolean multi,String countryCode,String channelId,String payType) throws Exception;
	
	/**
	 * 根据userId获取account对象
	 * 
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public IBOInsAccrelValue  getAccrelDateByCustId(long userId) throws Exception;
	
    /**
	  * @Function: intoUserSendSms
	  * @Description: 停开机发送短信
	  *
	  * @param:aOvOrderCustomer 客户大订单
	  * @return：
	  * @throws：异常描述
	  *
	  * @version: v1.0.0
	  * @author: sjh3
	  * @date: 2014-10-31 上午11:21:57  
	  *
	  * Modification History:
	  * Date         Author          Version            Description
	  *---------------------------------------------------------*
	  * 2013-1-15      liuke           v1.0.0               修改原因
	   */
	public void intoUserSendSms(IOVOrderCustomer aOVOrderCustomer)throws Exception,RemoteException;

	/**
	 * 停开机发送短信 workflow
	 * @param customerOrderId
	 * @throws Exception
	 * @throws RemoteException
	 *@author wulq
	 */
	public void intoUserSendSms(long customerOrderId)throws Exception,RemoteException;
	
	/**
	 * 根据停开机编码获得子businessId
	 * @param type
	 * @return
	 * @throws Exception
	 *@author wulq
	 */
	public long getBusinessIdByOsStatusCode(String type) throws Exception;
	
	/**
	 * 判断是否duning复机
	 * @param customerOrderId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *@author wulq
	 */
	public boolean judgeIsDuning(long customerOrderId) throws Exception,RemoteException;
	
	/**
	 * 调用dunning免催停
	 * @param customerOrderId
	 * @throws Exception
	 * @throws RemoteException
	 *@author wulq
	 */
	public void doSetExemptCreditLimit(long customerOrderId,String billId) throws Exception,RemoteException;
	
	/**
	 * @author zhaofx3
	 * @param ordCustId
	 * 保存修改预约工单信息
	 * 
	 */
	public void modifyBookingDateForStopOpen(long customerOrderId,Timestamp bookingDate)throws Exception;
	
	/**
	 * 判断是否重复停开机
	 * @param billId
	 * @param reason 例如 "101" "001"
	 * @return
	 */
	public boolean isAlreadyStopOrOpen(String billId, String reason);
	
	/**
	 * 保存日志
	 * @param businessId
	 * @param ovOrderCustomer
	 * @throws Exception
	 */
	public void saveLog(long businessId,IOVOrderCustomer ovOrderCustomer)throws Exception ;
	
	/**
	 * 重新获取实例中的手机号和imsi号
	 * @param customerOrderId
	 * @throws RemoteException
	 * @throws Exception
	 */
	public void reSetBillIdAndImsiFromInst(long customerOrderId) throws RemoteException, Exception;
	
	/**
	 * 
	 * <p>Title: getOrdUserOsStatusForFl</p>  
	 * <p>Description: </p>  
	 * @param ovOrderCustomer
	 * @return
	 * @throws Exception  
	 * @author yangxie  
	 * @date 2020年5月5日  
	 * @version V1.0
	 */
	public IOrdUserOsStateValue getOrdUserOsStatusForFl(IOVOrderCustomer ovOrderCustomer) throws Exception;
	
	/**
	 * 
	 * <p>Title: getStopReason</p>  
	 * <p>Description: </p>  
	 * @param osStatus
	 * @return
	 * @throws Exception  
	 * @author yangxie  
	 * @date 2020年5月5日  
	 * @version V1.0
	 */
	public String getStopReason(IOrdUserOsStateValue osStatus) throws Exception;
	
	/**
	 * 
	 * @param customerOrderId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public boolean tdcOttxExist(long customerOrderId)throws Exception,RemoteException;
	
	/**
	 * 
	 * @param customerOrderId
	 * @param taskId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void ottxSendOpenForTDC(long customerOrderId,String taskId)throws Exception,RemoteException;
	
	public void resetErrorStopOpenOrders(long customerOrderId) throws RemoteException, Exception;
}
