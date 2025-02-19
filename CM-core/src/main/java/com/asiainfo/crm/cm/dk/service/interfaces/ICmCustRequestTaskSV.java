package com.asiainfo.crm.cm.dk.service.interfaces;

import com.ai.appframe2.common.AIException;
import com.asiainfo.crm.cm.common.ivalues.IBOCmPsPublicDealValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustRequestTaskValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;

public interface ICmCustRequestTaskSV {

	/**
	 * 新增客户时插入客户请求任务
	 * @Function dealCmCustRequestTask4IndivCustomer
	 * @Description 
	 *
	 * @param customerVal
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-4-30 下午1:05:08
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-4-30     yangjh           v1.0.0               修改原因<br>
	 */
	public void dealCmCustRequestTask4IndivCustomer(ICustomerValue customerVal) throws Exception;

	/**
	 * 根据客户ID查询请求任务信息
	 * @Function queryByCustId
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-4-30 下午12:14:27
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-4-30     yangjh           v1.0.0               修改原因<br>
	 */
	public IBOCmCustRequestTaskValue[] queryByCustId(long custId) throws Exception;
	/**
	 * 根据客户ID和状态查询请求任务信息
	 * @Function queryByCustIdAndReqStatus
	 * @Description 
	 *
	 * @param custId
	 * @param reqStatus
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-11-25 下午12:14:27
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-4-30     sunqi           v1.0.0               修改原因<br>
	 */
	public IBOCmCustRequestTaskValue[] queryByCustIdAndReqStatus(long custId,String reqStatus) throws Exception;
	
	/**
	 * 根据客户ID查询请求任务信息(只取第一条)
	 * @Function queryByCustIdForShow
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-6-23 上午10:46:03
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-6-23     mael           v1.0.0               修改原因<br>
	 */
	public IBOCmCustRequestTaskValue queryByCustIdForShow(long custId) throws Exception;

	/**
	 * 抽取公共代码用于CPR配置矩阵
	 *
	 * @param requestTaskArray
	 * @return
	 * @throws Exception
	 */
	IBOCmCustRequestTaskValue queryRequestStatusForShow(IBOCmCustRequestTaskValue[] requestTaskArray) throws Exception;

	/**
	 * 保存AKS信息
	 * @Function saveCustAKSInfo
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-9-01 上午10:46:03
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-01     huangqun           v1.0.0               修改原因<br>
	 */
	public void saveCustAKSInfo(ICustomerValue value,int action)throws Exception;
	/**
	 * 
	 * @Function dealCmGroupCustAKSInfo
	 * @Description 
	 *
	 * @param iCustomerValue value
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-9-01 上午10:46:03
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-01     huangqun           v1.0.0               修改原因<br>
	 */
	public void dealCmGroupCustAKSInfo(ICustomerValue customerVal)throws Exception;
	
	/**   
	 * @Function savePublicWordOrder
	 * @Description 公共工单处理表保存
	 *
	 * @param psPublicDealValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-10-8 上午10:23:16
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-8     shitian             v1.0.0               修改原因<br>
	 */
	public void savePublicWordOrder(IBOCmPsPublicDealValue psPublicDealValue)throws Exception;
	
	/**   
	 * @Function queryPublicWorkOrder
	 * @Description 查询公共工单表
	 *
	 * @param recordId
	 * @param action
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-10-8 上午10:24:33
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-8     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmPsPublicDealValue[] queryPublicWorkOrder(long recordId,int action)throws Exception;
	/**
	 * 保存客户扩展信息
	 * @Function saveSubscribeAKSInfo
	 * @Description 
	 *
	 * @param custId
	 * @param flag
	 * @throws Exception
	 * @throws AIException
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-10-19 下午1:10:20
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-19     huangqun          v1.0.0               修改原因<br>
	 */
	public void saveSubscribeAKSInfo(long custId,int flag)throws Exception;
	/**
	 * 公用的保存客户请求任务信息方法
	 * @Function saveCustRequestTaskInfo
	 * @Description 
	 *
	 * @param custId
	 * @param action (1:退订CPR,4:订购CPR)
	 * @param reqStatus(T:待处理前的临时状态、C:待处理)
	 * @throws Exception
	 * @throws AIException
	 *
	 * @version v1.0.0
	 * @author sunqi
	 * @date 2014-11-21下午1:10:20
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-21   sunqi          v1.0.0               修改原因<br>
	 */
	public void saveCustRequestTaskInfo(long custId, int action, String reqStatus) throws Exception;
	
	/**
	 * 保存CM_CUST_REQUEST_TASK_VALUE
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2018-8-13
	* ICmCustRequestTaskSV
	 */
	public void saveCmCustRequestTask(IBOCmCustRequestTaskValue cmCustRequestTaskValue) throws Exception;
}
