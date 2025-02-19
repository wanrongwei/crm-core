package com.asiainfo.crm.so.order.bboss.service.interfaces;

import com.ai.appframe2.common.DataContainerInterface;
import com.ai.omframe.instance.ivalues.IInsAccrelValue;
import com.ai.omframe.instance.ivalues.IInsOffInsUserValue;
import com.ai.omframe.instance.ivalues.IInsSrvAttrValue;
import com.ai.omframe.instance.ivalues.IInsUserValue;
import com.ai.omframe.order.data.ivalues.ISoOfferData;
import com.ai.omframe.order.data.ivalues.ISoOrderData;
import com.ai.omframe.order.data.ivalues.ISoUserData;
import com.ai.omframe.order.ivalues.*;
import com.ai.omframe.order.service.interfaces.ISoVMInvokeSV;
import com.ai.pce.exception.PceException;
import com.asiainfo.crm.so.common.ivalues.IBOOrdxSecSmsReplyValue;
import com.asiainfo.crm.so.common.party.ivalues.IBOInsxUserInsuranceValue;

import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 *
 * @ClassName: IBbossSoVMInvokeSV.java
 * @Description: 统一放置工作流节点配置的任务
 *
 * @version: v1.0.0
 * @author: yaojx
 * @date: Dec 15, 2011 5:26:43 PM
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * Dec 15, 2011     yaojx           v1.0.0               修改原因
 */
public interface IBbossSoVMInvokeSV extends ISoVMInvokeSV {

	/**
     * @Function: IBbossSoVMInvokeSV.java
     * @Description: 成员分帐创建订单前置任务
     *
     * @param customerOrderId
     * @return
     * @throws Exception
     * @throws RemoteException
     * @return：返回结果描述
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: yaojx
     * @date: Dec 16, 2011 4:36:13 PM
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * Dec 16, 2011     yaojx           v1.0.0               修改原因
     */
    public List getSoUserDatasForAccrel(long customerOrderId) throws Exception, RemoteException;
    
   /**   
    * Copyright: Copyright (c) 2013 Asiainfo-Linkage
    * 
    * @ClassName: IBbossSoVMInvokeSV.java
    * @Description: 发送短信接口，用于设置路由
    *
    * @version: v1.0.0
    * @author: xuyang
    * @date: Jan 21, 2013 4:09:41 PM 
    *
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * Jan 21, 2013     xuyang           v1.0.0               修改原因
    */
    public void sendSmsSetCenter( String billId, String msgContent ) throws Exception,RemoteException;
   /**   
    * Copyright: Copyright (c) 2012 Asiainfo-Linkage
    * 
    * @ClassName: IBbossSoVMInvokeSV.java
    * @Description: 发送成功短信
    *
    * @version: v1.0.0
    * @author: xuyang
    * @date: Dec 2, 2012 3:53:34 PM 
    *
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * Dec 2, 2012     xuyang           v1.0.0               修改原因
    */
    public void sendSMSForOrder( long customerOrderId) throws RemoteException, Exception;
    /**
     * @Function: IBbossSoVMInvokeSV.java
     * @Description: 成员分帐创建帐务关系订单
     *
     * @param iOVOrdOffOrdUser
     * @param itemGrp
     * @param accRel
     * @param regionId
     * @return
     * @throws Exception
     * @throws RemoteException
     * @return：返回结果描述
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: yaojx
     * @date: Dec 16, 2011 4:59:21 PM
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * Dec 16, 2011     yaojx           v1.0.0               修改原因
     */
    public IOrdAccrelValue[] createOrdAccrelValue(IOVOrdOffOrdUser iOVOrdOffOrdUser,List itemGrp,DataContainerInterface accRel,String regionId) throws Exception, RemoteException;
    /**
     * 修改默认账户
     */
    public IOrdAccrelValue[] modDefaultAcct(IOVOrdOffOrdUser iOVOrdOffOrdUser,List itemGrp,DataContainerInterface accRel,String regionId) throws Exception, RemoteException;

    /**
     * 修改账户状态
     * modifyAcctActive
     */
    public void modifyAcctActive(long customerOrderId) throws Exception, RemoteException;
    
    
    /**
     * 修改账户状态
     * modifyAcctActive
     */
    public void modifyAcctActive(IOVOrderCustomer ovOrdCust) throws Exception, RemoteException;
    
    
    /**
     * 预受理策划订单竣工
     * @author: liuhang
     * @date: 2011-12-17 15:20
     * @param customerOrderId  正式受理的客户订单ID
     * @throws Exception
     * @throws RemoteException
     */
    public void finishPreOrderOffer(long customerOrderId) throws Exception,RemoteException;
   /**
     * 设置员工信息，返回HashMap直接设置到流程的上下文变量中
     * @author: liuhang
     * @date: 2011-12-17 15:25
     * @param customerOrderId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map setStaffAndOrgInfo(long customerOrderId) throws Exception,RemoteException;

    /**
     *	端到端受理回单时，需要根据操作来启动不同的子流程，根据客户订单ID，查找当前操作的操作类型对应的子流程模板编码，用于覆盖盖子流程
     * 配置的模板编码，该方法一般配置在子流程节点的前置任务里，可以动态调用不同的子流程，为comframe新增特性
     * @Function: BbossSoVMInvokeSVImpl.java
     * @Description:
     *
     * @param customerOrderId	客户订单ID
     * @return	根据appstudio开发文档指导，该前置任务将返回一个List，供该子流程节点动态调用不同的流程
     * 		list中每一个元素为一个<code>DataContainer</code>，其结构为：
     * 		<ul>
     * 			<li><code>CUSTOMER_ORDER_ID</code>	客户订单ID
     * 			<li><code>REGION_ID</code>			地区编码
     * 			<li><code>BUSIOPER_ID</code>		操作ID
     * 			<li><code>PROD_SPEC_IDS</code>		规格ID(目前均为空)
     * 			<li><code>TASK_STAFF_ID</code>		员工号
     * 			<li><code>TASK_ORG_ID</code>		所属组织
     * 			<li><code>WORKFLOW_CODE</code>		该操作所对应的工作流模板
     * 		</ul>
     * 		其中，<code>WORKFLOW_CODE</code>为该子流程节点即将启动的流程模板，其他值为其参数
     * 		根据操作ID，查找到该操作的产品配置记录中OPER_TYPE字段，并根据该字段设置工作流模板<code>WORKFLOW_CODE</code>
     * @throws Exception
     * @throws RemoteException
     *
     * @version: 1.0.0
     * @author: dingyd
     * @date: Feb 12, 2011 11:55:10 AM
     *
     * Modification History:
     * Date           Author          Version            Description
     *--------------------------------------------------------------*
     * Feb 12, 2011   dingyd		   v1.0.0
     * Feb 23, 2011   dingyd		   v1.0.1			按照国际化标准将异常信息重新编码
     */
    public List getBBossWorkflowCode(long customerOrderId) throws Exception, RemoteException;
    
    /**
     * 集团用户订购vpn相关联的addon需要拆单，分开送开通
     * @param customerOrderId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public List getBBossWorkflowCodeForVPN(long customerOrderId) throws Exception,RemoteException ;
    /**
     *	完成商机预受理工单分派节点
     * @Function: IBbossSoVMInvokeSV.java
     * @Description:
     *
     * @param customerOrderId	客户订单ID
     * @throws RemoteException
     * @throws Exception
     *
     * @version: 1.0.0
     * @author: dingyd
     * @date: Mar 30, 2011 5:04:37 PM
     *
     * Modification History:
     * Date           Author          Version            Description
     *--------------------------------------------------------------*
     * Mar 30, 2011   dingyd			 v1.0.0
     */
    public void finishBusiOppOrderTask(long customerOrderId) throws RemoteException, Exception;
    /**
     * Copyright: Copyright (c) 2012 Asiainfo-Linkage
     *
     * @ClassName: IBbossSoVMInvokeSV.java
     * @Description: 注销时保存注销原因到ORD_CUST的REMARKS字段
     *
     * @version: v1.0.0
     * @author: xuyang
     * @date: Sep 14, 2012 2:16:20 PM
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * Sep 14, 2012     xuyang           v1.0.0               修改原因
     */
    public void setOrderCustForDel(long customerOrderId) throws RemoteException, Exception;
    /**
     * 是否含有预受理订单
     * @author: liuhang
     * @date:2011-12-17
     * @param customerOrderId  正式受理的客户订单ID
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public boolean hasPreOrder(long customerOrderId) throws Exception,RemoteException;
    /**
     * 是否分批次受理
     * 用于预受理转受理时的处理，如果预受理中的策划订单均有对应的受理的策划订单，则表示预受理的所有任务单均处理完了，不需要分批次受理
     * @author: liuhang
     * @date: 2011-12-17
     * @param customerOrderId
     * @param workflowId   工作流ID  用于设置员工信息供下一个人工节点使用
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public boolean isPartialAccept(long customerOrderId,String workflowId) throws Exception,RemoteException;
   
    public DataContainerInterface[] getOrdOfferId(String ordOfferIds) throws RemoteException, Exception;
    /**
     * 根据客户订单编号，查询策划订单编号
     * @Function: BbossSoVMInvokeSVImpl.java
     *
     * @param customerOrderId 客户订单编号
     * @return 策划订单数组
     * @throws Exception 未知异常
     * @throws RemoteException 远程调用异常
     *
     * @version: v1.0.0
     * @author: Flavian
     * @date: 2011-4-11 下午08:50:36
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2011-4-11     Flavian           v1.0.0               修改原因
     */
    public IOrdOfferValue[] getOrdOffersByCustOrderId(long customerOrderId) throws Exception, RemoteException;
    /**
     * 检验客户订单有没有撤单
     * @Function: IZJBbossSoVMInvokeSV.java
     * @Description:
     *
     * @param customerOrderId	客户订单ID
     * @return	<dl>
     * 			<dt>true</dt>
     * 				<dd>已撤单</dd>
     * 			<dt>false</dt>
     * 				<dd>未撤单</dd>
     * 		</dl>
     * @throws RemoteException
     * @throws Exception
     *
     * @version: 1.0.0
     * @author: dingyd
     * @date: Feb 12, 2011 4:26:28 PM
     *
     * Modification History:
     * Date           Author          Version            Description
     *--------------------------------------------------------------*
     * Feb 12, 2011   dingyd			 v1.0.0
     */
    public boolean detectOrderCancel(long customerOrderId) throws RemoteException, Exception;

    /**
     *
     * @Function: IBbossSoVMInvokeSV.java
     * @Description: 根据业务操作和产品规格，获取对应的流程编码
     *
     * @param busiOperId	业务操作ID
     * @param productSpecId	产品规格ID
     * @return	String	流程编码
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: longxiong
     * @date: Apr 8, 2011 10:44:10 AM
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * Apr 8, 2011     longxiong           v1.0.0               修改原因:注释
     */
    public String getWorkflowCode(long busiOperId,long productSpecId,long customerOrderId)throws RemoteException,Exception;
    /**
     *
     * @Function: IZJBbossSoVMInvokeSV.java
     * @Description: 根据流程编码和客户订单、产品规格、地区ID，启动预受理流程,在流程结束后，finish parentTaskId
     *
     * @param workflowCode	流程编码
     * @param customerOrderId	客户订单
     * @param productSpecId	产品规格
     * @param busiOperId	业务操作ID
     * @param regionId	地区编码
     * @param taskStaffId	人工单处理员工
     * @param taskOrgId		人工单处理员工组织
     * @return	boolean	接口调用是否成功
     * @return：返回结果描述
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: longxiong
     * @date: Apr 8, 2011 10:45:31 AM
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * Apr 8, 2011     longxiong           v1.0.0               修改原因
     */
    public boolean startChildWorkflow(String parentTaskId,String workflowCode,String staffId, long customerOrderId,long ordOfferId,
                                      long productSpecId,long busiOperId, String regionId,String taskStaffId,String taskOrgId)throws RemoteException,Exception;
    
    public boolean startChildWorkflow(String parentTaskId, String workflowCode,String staffId, long customerOrderId, String ordOfferId,
			long productSpecId, long busiOperId, String regionId,String taskStaffId, String taskOrgId) throws RemoteException,Exception;
    /**
     *
     * @Function: IBbossSoVMInvokeSV.java
     * @Description: 处理集团订购信息(订购和注销)
     *
     * @param: customerOrderId   客户订单编号
     * @return：返回结果描述
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: longxiong
     * @date: Feb 25, 2011 5:21:19 PM
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * Feb 25, 2011     longxiong           v1.0.0               修改原因
     */
    public boolean dealGroupOrderInfo(long customerOrderId,long busiOperId,long offerOrderId)throws Exception,RemoteException;
    /**
     *
     * @Function: IZJBbossSoVMInvokeSV.java
     * @Description: 根据策划订单ID序列，返回对应的订单对象
     *
     * @param: offerOrderIds   策划订单数组，';'分割
     * @param: regionId  地区编号
     * @return	IOrdOfferValue[] 策划订单数组
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: longxiong
     * @date: Apr 8, 2011 10:31:52 AM
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * Apr 8, 2011     longxiong           v1.0.0               修改原因：注释
     */
    public IOrdOfferValue[] parseOrdOffer(String offerOrderIds,String regionId)throws RemoteException,Exception;

    /**
     *	以字符串形式返回本次订购的所有策划订单ID
     * @Function: IZJBbossSoVMInvokeSV.java
     * @Description:
     *
     *
     *
     * @param CustomerOrderId	客户订单ID
     * @return					本次订购的策划订单ID字符串，格式为："策划订单ID1,策划订单ID2,策划订单ID3..."
     * @throws Exception
     *
     * @version: 1.0.0
     * @author: dingyd
     * @date: Feb 17, 2011 3:35:37 PM
     *
     * Modification History:
     * Date           Author          Version            Description
     *--------------------------------------------------------------*
     * Feb 17, 2011   dingyd			 v1.0.0
     */
    public String getOfferOrderIdsbyCustOrderId(long CustomerOrderId) throws RemoteException, Exception;
    /**
     *	判断本次操作是否需要二次确认
     * @Function: IZJBbossSoVMInvokeSV.java
     * @Description:
     *
     * @param customerOrderId	客户订单编号
     * @return	是否需要二次确认
     * 	<ul>
     * 		<li>true	需要二次确认
     * 		<li>false	不需要二次确认
     * 	</ul>
     * @throws RemoteException
     * @throws Exception
     *
     * @version: 1.0.0
     * @author: dingyd
     * @date: Mar 7, 2011 3:24:19 PM
     *
     * Modification History:
     * Date           Author          Version            Description
     *--------------------------------------------------------------*
     * Mar 7, 2011   dingyd			 v1.0.0
     */
    public boolean isNeedSecondConfirmation(long customerOrderId) throws RemoteException, Exception;

    /**
     *	发送二次确认后成功订购短信通知
     * @Function: ZJBbossSoVMInvokeSVImpl.java
     * @Description:
     *
     * @param offerId
     * @param offerOrderId
     * @param customerOrderId
     * @throws RemoteException
     * @throws Exception
     *
     * @version: 1.0.0
     * @author: dingyd
     * @date: May 17, 2011 4:06:54 PM
     *
     * Modification History:
     * Date           Author          Version            Description
     *--------------------------------------------------------------*
     * May 17, 2011   dingyd			 v1.0.0
     */
    public void sendSuccessSMS(long offerId, long offerOrderId, long customerOrderId) throws RemoteException, Exception;


    /**
     * 根据客户订单ID和策划订单ID发送扣费提醒短信
     * @author:wangzf
     * @date:SEP 24, 2012 7:17:31 PM
     * @param customerOrderId
     * @param offerOrderId
     * @throws Exception
     * @throws RemoteException
     */
    public void sendDeductRemindSms(long customerOrderId,long offerOrderId) throws Exception, RemoteException ;

    /**   
    * Copyright: Copyright (c) 2012 Asiainfo-Linkage
    * 
    * @ClassName: IBbossSoVMInvokeSV.java
    * @Description: 发送二次确认短信
    *
    * @version: v1.0.0
    * @author: xuyang
    * @date: Oct 26, 2012 1:39:30 AM 
    *
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * Oct 26, 2012     xuyang           v1.0.0               修改原因
    */
    public void sendConfirmationSMS(String taskId, long businessId, long offerId, long offerOrderId, long customerOrderId)
            throws RemoteException, Exception;

    /**
     *
     * @Function: IZJBbossSoVMInvokeSV.java
     * @Description: 根据策划订单ID序列，返回对应的订单对象
     *
     * @param: offerOrderIds   策划订单数组，';'分割
     * @param: regionId  地区编号
     * @return	getOrdOffers[] 策划订单数组
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: longxiong
     * @date: Apr 8, 2011 10:31:52 AM
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * Apr 8, 2011     longxiong           v1.0.0               修改原因：注释
     */
    public IOrdOfferValue[] getOrdOffers(long CustomerOrderId,String regionId) throws RemoteException, Exception;
    /**
     * 设置策划实例的状态，根据传入的客户订单ID，查找本次订购所涉及的所有的策划订单，并将这些策划订单关联的
     * 策划实例的状态设置为给定的状态，该给定的状态通过本方法的第二个参数<code>state</code>传入
     * @Function: ZJBbossSoVMInvokeSVImpl.java
     * @Description:
     *
     * @param CustomerOrderId	客户订单ID
     * @param state			给定的状态值，该值可以是如下的数字：<p>
     * 	<ul>
     * 		<li>0 - 历史
     * 		<li>1 - 在用
     * 		<li>2 - 预销
     * 		<li>3 - 销户
     * 	</ul>
     * @throws Exception
     *
     * @version: 1.0.0
     * @author: dingyd
     * @date: Mar 1, 2011 3:25:41 PM
     *
     * Modification History:
     * Date           Author          Version            Description
     *--------------------------------------------------------------*
     * Mar 1, 2011   dingyd			 v1.0.0
     */
    public void setInstOfferStateByCustomerOrderId(long CustomerOrderId, int state) throws RemoteException, Exception;
    /**
     * 人工回单
     * @Function: BbossSoVMInvokeSVImpl.java
     * @Description:
     *
     * @param taskId	父流程节点task_id
     * @param staffId	回单工号
     * @return
     * @throws RemoteException
     * @throws Exception
     *
     * @version: 1.0.0
     * @author: dingyd
     * @date: Feb 17, 2011 5:34:50 PM
     *
     * Modification History:
     * Date           Author          Version            Description
     *--------------------------------------------------------------*
     * Feb 17, 2011   dingyd			 v1.0.0
     */
    public boolean finishUserTask(String taskId, String staffId) throws RemoteException, Exception;

    /**
     * @Function: IBbossSoVMInvokeSV.java
     * @Description: 根据策划订单启动流程
     *
     * @param customerOrderId
     * @return
     * @throws RemoteException
     * @throws Exception
     * @return：返回结果描述
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: yaojx
     * @date: Feb 10, 2012 3:30:09 PM
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * Feb 10, 2012     yaojx           v1.0.0               修改原因
     */
    public DataContainerInterface[] getOfferBusiOrderByCustOrdId(long customerOrderId)
            throws RemoteException, Exception ;
   /**
     * @Function: IZJBbossSoVMInvokeSV.java
     * @Description 客户订单竣工
     *
     * @param ovOrderCustomer
     * @throws Exception
     * @throws RemoteException
     * @return：返回结果描述
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: yaojx
     * @date: Jun 29, 2011 7:34:23 PM
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * Jun 29, 2011     yaojx           v1.0.0               修改原因
     */
    public void saveOVOrdCustToFinish(IOVOrderCustomer ovOrderCustomer)throws Exception, RemoteException ;
    /**
     * @Function: IZJBbossSoVMInvokeSV.java
     * @Description: 根据客户订单编号，查询策划订单编号
     *
     * @param customerOrderId
     * @return
     * @throws RemoteException
     * @throws Exception
     * @return：返回结果描述
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: yaojx
     * @date: Apr 3, 2011 4:40:50 PM
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * Apr 3, 2011     yaojx           v1.0.0               修改原因
     */
    public DataContainerInterface[] getOfferOrderIdsByCustOrdId(long customerOrderId) throws RemoteException, Exception;
   /**
     * @Function: IZJBbossSoVMInvokeSV.java
     * @Description: 将成员号码对应的短号，保存到短号资源表
     *
     * @param map
     * @throws RemoteException
     * @throws Exception
     * @return：返回结果描述
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: yaojx
     * @date: Feb 22, 2011 4:12:46 PM
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * Feb 22, 2011     yaojx           v1.0.0               修改原因
     */
    public void updateVpmnShortNumRes(long customerOrderId,long offerOrderId)throws RemoteException, Exception;
	/**   
	* @Function: delShortNum
	* @Description: 删除短号
	*
	* @param
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: zjl
	* @date: Nov 17, 2012 5:01:24 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Nov 17, 2012     zjl         v1.0.0               修改原因
	*/
	public void delShortNum(long customerOrderId,long offerOrderId) throws Exception, RemoteException;
  
    public boolean iscancelPreCustOrder(long customerOrderId,String dealReuslt)throws Exception,
            RemoteException;

    /**
     * 动力100成员优惠处理<br>
     * <ol>
     * 	<li>促销需要打入动力100的成员，动力100本身不需要加促销
     * 	<li>如果成员是无线座机管理套餐，促销需要打入无线座机管理套餐的成员上
     * 	<li>需要修改新装、变更、销户流程
     * 	<li>如果销户，需要拉掉成员的促销，特别注意无线座机管理套餐的成员促销也要拉掉
     * </ol>
     * @Function: IZJBbossSoVMInvokeSV.java
     *
     * @param customerOrderId 客户订单编号
     * @return
     * @throws Exception
     * @throws RemoteException
     *
     * @version: v1.0.0
     * @author: Flavian
     * @date: 2011-5-18 下午10:42:40
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2011-5-18     Flavian           v1.0.0               修改原因
     */
    public DataContainerInterface[] dealPromotionForMultiRole( long customerOrderId, long offerOrderId ) throws Exception, RemoteException;
    /**
     *
     * @Function: IZJBbossSoVMInvokeSV.java
     * @Description: 动力100变更设置策划实例状态
     *
     * @param:参数描述
     * @return：返回结果描述
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: jiangwei5
     * @date: 2011-3-23 下午05:44:45
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2011-3-23     jiangwei5        v1.0.0               修改原因
     */
    public void setInstOfferState(long customerOrderId, int aState) throws RemoteException,Exception;

    /**
     * @Function: IZJBbossSoVMInvokeSV.java
     * @Description: 根据客户编号，删除短号资源
     *
     * @param custId 客户订单编号
     * @throws RemoteException
     * @throws Exception
     * @return：返回结果描述
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: yaojx
     * @date: Mar 8, 2011 3:35:05 PM
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * Mar 8, 2011     yaojx           v1.0.0               修改原因
     */
    public void deleteShortNumByGroupId(long customerOrderId) throws RemoteException, Exception;

    /**
     * @Function: IZJBbossSoVMInvokeSV.java
     * @Description: 送开通计费
     *
     * @param customerOrderId
     * @param offerOrderId
     * @throws Exception
     * @throws RemoteException
     * @return：返回结果描述
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: yaojx
     * @date: Jun 26, 2011 8:50:33 PM
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * Jun 26, 2011     yaojx           v1.0.0               修改原因
     */
    public void sendOrderOfferInfoToOpenBilling(long customerOrderId, long offerOrderId) throws Exception, RemoteException;
   
    /**
     * @Function: IZJBbossSoVMInvokeSV.java
     * @Description: 将订单大对象状态设为竣工
     *
     * @param ovOrderCustomer
     * @throws Exception
     * @throws RemoteException
     * @return：返回结果描述
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: yaojx
     * @date: Jun 25, 2011 3:53:56 PM
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * Jun 25, 2011     yaojx           v1.0.0               修改原因
     */
    public void setOvOrderCustomerToFinish(IOVOrderCustomer ovOrderCustomer)throws Exception,
            RemoteException ;
  /**
     * 注销父策划时加入子策划
     * @author LiangYue
     * @date Jun 5, 2012
     * @return void
     */
    public void addChildOfferDataForLogout (long customerOrderId) throws Exception, RemoteException;

    /**   
    * Copyright: Copyright (c) 2012 Asiainfo-Linkage
    * 
    * @ClassName: IBbossSoVMInvokeSV.java
    * @Description: 该类的功能描述
    *
    * @version: v1.0.0
    * @author: xuyang
    * @date: Oct 27, 2012 9:55:27 AM 
    *
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * Oct 27, 2012     xuyang           v1.0.0               修改原因
    */
    public void saveSmsPending(String billId,String[] billIds, int smsType, long aOfferId,
			long bOfferId, long aBrandId, long bBrandId, long businessId,
			long productId, String spCode, String operCode, String busiType,
			long groupId, String regionId, String channelId,
			HashMap paraMap) throws Exception, RemoteException;
    /**   
    * Copyright: Copyright (c) 2012 Asiainfo-Linkage
    * 
    * @ClassName: IBbossSoVMInvokeSV.java
    * @Description: 短信回执，根据计费号码跨中心
    *
    * @version: v1.0.0
    * @author: xuyang
    * @date: Oct 26, 2012 1:34:20 AM 
    *
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * Oct 26, 2012     xuyang           v1.0.0               修改原因
    */
    public void save2ndConfirmSms(IBOOrdxSecSmsReplyValue value,String billId) throws Exception,RemoteException;
    /**
     * @Function: IBJBbossSoVMInvokeSV.java
     * @Description: 该函数的功能描述
     *
     * @throws Exception
     * @throws RemoteException
     * @return：返回结果描述
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: yaojx
     * @date: Nov 26, 2011 10:18:45 AM
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * Nov 26, 2011     yaojx           v1.0.0               修改原因
     */
    public void sendBillingAndOpen(long customerOrderId ,long offerOrderId )throws Exception, RemoteException;
    
    /**   
    * @Function: sendBillingAndOpen4NoCancle
    * @Description: 送计费和开通，不抛ComframeBusiException异常 适用于含有审批节点不自动撤单的流程
    * @param
    * @return：返回结果描述
    * @throws：异常描述
    * @version: v1.0.0
    * @author: zhouwei9
    * @date: Jan 6, 2013 10:35:58 AM 
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * Jan 6, 2013     zhouwei9         v1.0.0               修改原因
    */
    public void sendBillingAndOpen4NoCancle(long customerOrderId, long offerOrderId)
    throws Exception, RemoteException;

    /**
     * 成员处理的时候启动成员处理子流程根据策划订单ID启动多个
     * @param customerOrderId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public DataContainerInterface[] getMemOrderInfoByCustOrdId(long customerOrderId) throws Exception, RemoteException;
    
    /**
     * 删除成员启动删除成员的ordoffer
     * @param customerOrderId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public DataContainerInterface[] getDelMemOrderInfoByCustOrdId(long customerOrderId,String ordOfferIds) throws Exception, RemoteException; 
    /**
     * 增加成员启动增加成员的ordoffer
     * @param customerOrderId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public DataContainerInterface[] getAddMemOrderInfoByCustOrdId(long customerOrderId,String ordOfferIds) throws Exception, RemoteException;
    
    /**
     * 以成员号码为维度创建订单，送开通转实例
     * @param customerOrderId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public DataContainerInterface[] getMemBillIdByCustOrdId(long customerOrderId) throws Exception, RemoteException ;
    /**
     * 根据策划实例ID获取策划信息
     * @param offOrderId
     * @return
     * @throws RemoteException
     * @throws Exception
     */
    public IOrdOfferValue[] getOrdOfferByoffOrderId(long offOrderId)throws RemoteException, Exception;
    /**
     * 根据策划订单获取策划信息，启动流程
     * @param offerOrderId
     * @return
     * @throws RemoteException
     * @throws Exception
     */
    public DataContainerInterface[] getOfferBusiOrderByoffOrdId(long offerOrderId)throws RemoteException, Exception;
   
    public DataContainerInterface[] getOfferBusiOrderByoffOrdId(String offerOrderIds) throws RemoteException, Exception;
    /**
     * @Function: IBbossSoVMInvokeSV.java
     * @Description: 策划订单竣工
     *
     * @param offerOrderId
     * @throws RemoteException
     * @throws Exception
     * @return：返回结果描述
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: yaojx
     * @date: Sep 7, 2012 2:28:01 PM
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * Sep 7, 2012     yaojx           v1.0.0               修改原因
     */
    public void finishOrderOffer(long customerOrderId) throws RemoteException,Exception;

    /**
     *
     * Copyright: Copyright (c) 2012 Asiainfo-Linkage
     *
     * @ClassName: IBbossSoVMInvokeSV.java
     * @Description: 根据策划订单ID判断是否已经撤单
     *
     * @version: v1.0.0
     * @author: wangbin
     * @date: 2012-9-17 下午02:53:03
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2012-9-17     wangbin           v1.0.0               修改原因
     */
    public boolean judeOrdOffer(long offerOrderId) throws RemoteException, Exception;
    /**
     *
     * Copyright: Copyright (c) 2012 Asiainfo-Linkage
     *
     * @ClassName: IBbossSoVMInvokeSV.java
     * @Description: 根据客户订单ID设置策划实例的状态
     *
     * @version: v1.0.0
     * @author: wangbin
     * @date: 2012-9-17 下午03:40:41
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2012-9-17     wangbin           v1.0.0               修改原因
     */
    public void setInstOfferStateByCustId(long CustomerOrderId, int state) throws RemoteException, Exception;

    /**
     * @Function: IBbossSoVMInvokeSV.java
     * @Description: 根据客户订单编号转移销号实例数据,排除已经竣工的订单
     *
     * @param customerOrderId
     * @throws Exception
     * @throws RemoteException
     * @return：返回结果描述
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: yaojx
     * @date: Sep 19, 2012 5:19:18 PM
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * Sep 19, 2012     yaojx           v1.0.0               修改原因
     */
    public void transInsDataToDesByCustOrderId(long customerOrderId)throws Exception,RemoteException;
    
   /**
   *
   * Copyright: Copyright (c) 2012 Asiainfo-Linkage
   *
   * @ClassName: IBbossSoVMInvokeSV.java
   * @Description: 根据客户订单ID更新短号资源表
   *
   * @version: v1.0.0
   * @author: wangbin
   * @date: 2012-9-20 下午03:28:04
   *
   * Modification History:
   * Date         Author          Version            Description
   *---------------------------------------------------------*
   * 2012-11-15     xiangyc           v1.0.0               修改原因
   */
  public void updateMemShortNum(long customerOrdId) throws RemoteException, Exception;

    /**
     * 送计费
     * @param customerOrderId
     * @param offerOrderId
     * @throws Exception
     * @throws RemoteException
     */
    public void sendBilling(long customerOrderId, long offerOrderId) throws Exception, RemoteException;
    /**
     * 送开通
     * @param customerOrderId
     * @param offerOrderId
     * @throws Exception
     * @throws RemoteException
     */
    public void sendOpen(long customerOrderId, long offerOrderId) throws Exception, RemoteException;
    /**
     * 判断策划是否为400，如是则预注销，否则注销
     * @author:曹福康
     * @date:Jul 14, 2011 11:15:04 PM
     * @param customerOrderId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public String judgeOfferType(ISoOfferData aSoOfferData) throws RemoteException, Exception;
    
    /**
     * 跟客户订购的产品，更新客户在网/潜在的状态
     * @param customerOrdId
     * @throws RemoteException
     * @throws Exception
     */
    public void updateGrpCustStatus(long customerOrdId,int action) throws RemoteException, Exception;
	
	/**
	* @Function: IBbossSoVMInvokeSV.java
	* @Description: 获取客户订单流程任务编号
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: wenxj
	* @date: 2012-10-22 下午08:55:36 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-10-22     wenxj           v1.0.0               修改原因
	 */
	public Map getCustOrdWorkflowTaskId(long customerOrderId) throws RemoteException, Exception;
	
	/**
	* @Function: IBbossSoVMInvokeSV.java
	* @Description: 设置客户订单流程任务编号
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: wenxj
	* @date: 2012-10-22 下午08:56:09 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-10-22     wenxj           v1.0.0               修改原因
	 */
	public void setCustOrdWorkflowTaskId(long customerOrderId, String taskId) throws RemoteException, Exception;
	
   /**   
	    * @Function: updateOrderDataEffDate2Sysdate
	    * @Description: 更新订单生效时间为当前时间
	    *
	    * @param
	    * @return：返回结果描述
	    * @throws：异常描述
	    *
	    * @version: v1.0.0
	    * @author: zhouwei9
	    * @date: Dec 27, 2012 7:17:20 PM 
	    *
	    * Modification History:
	    * Date         Author          Version            Description
	    *---------------------------------------------------------*
	    * Dec 27, 2012     zhouwei9         v1.0.0               修改原因
	    */
	public void updateOrderDataEffDate2Sysdate(long customerOrderId, long offerOrderId) throws Exception, RemoteException;

	public String resetTaskStaffIdForProjectManager(long custOrderId) throws RemoteException, Exception;

	public Map getWorkflowParamVars(String workflowId, String custOrderId, String offOrderId) throws Exception, RemoteException;

	public void updateOrderExpireDate(long customerOrdId, long orderOfferId) throws RemoteException, Exception;

	/**
	 * 端到端改单回单
	 * 
	 * @param customerOrderId
	 * @throws RemoteException
	 * @throws Exception
	 */
	public void finishUserTaskForDtd(long customerOrderId) throws RemoteException, Exception;

	public ISoOrderData createSoOrderDataforGroupMempkgChg(long customerOrderId) throws Exception, RemoteException;

	public List getCreateSoOrderDataForModiMemWorkflowCode(long customerOrderId) throws Exception, RemoteException;

	public boolean judgeIsShortNumMod(long customerOrdId) throws RemoteException, Exception;

	public boolean judgeOfferType(ISoUserData soUserData) throws RemoteException, Exception;

	public List getSoUserDatasOfMainOfferNewProd(long customerOrderId) throws Exception, RemoteException;
	
	public ISoOrderData createSoOrderDataForVpn(long customerOrderId) throws Exception, RemoteException;
	
	public void ModifySoOrderDataForVpn(long customerOrderId) throws Exception, RemoteException;
	/**
	 * pstn业务，收到TDC开通文件后，回调开户流程
	 * @param billId
	 * @param effDate
	 * @throws RemoteException
	 * @throws Exception
	 */
	public void notifyOpenWorkflow(String billId,Date effDate) throws RemoteException, Exception;
	public List getSoUserDatasOfMemOfferNewProdAndSetUserId(long customerOrderId) throws Exception,RemoteException ;

	public void createOrderDate(long customerOrderId)throws RemoteException, Exception;
	
	public Map judgeIsNeedFile(long customerOrdId, String workflowid) throws RemoteException, Exception;
	public void invokeOfferOperDispatch(long aCustomerOrderId) throws Exception, RemoteException ;
	public List dealOpenUserAddMem(long aCustomerOrderId) throws Exception, RemoteException ;
	public void dealDelVpnMem(HashMap m) throws Exception, RemoteException ;
	public void dealAddVpnMem(HashMap m) throws Exception, RemoteException ;
	public ISoOrderData createVpnMemDelSoOrderDate(HashMap m) throws Exception, RemoteException;
	public IOVOrderOffer createOvofferVpnMemDel(HashMap m) throws Exception, RemoteException;
	public void changeOweVpnMem(HashMap m) throws Exception, RemoteException;

	/*
	 * ******************************************Transfer ownership Start**************************************************
	 */
	public boolean isAppoint(long customerOrderId) throws Exception, RemoteException;
	
	public long createCustAndContact(long customerOrderId, long userId) throws Exception, RemoteException;
	
	public boolean isChangeOffer(long customerOrderId) throws Exception;
	
	public void createAndInitOrdOffer(ISoOrderData aSoOrderData) throws Exception;
	public void dealDelMemLogoutGrp(long customerOrderId) throws Exception, RemoteException;

	public List dealVpnRelationship(long customerOrderId) throws Exception, RemoteException;
	/*
	 * *******************************************Transfer ownership End *************************************************
	 */
	public void setInstOfferStateByCustOrd(long customerOrderId, int aState) throws Exception, RemoteException;
	/**
	 * pstn修改生效时间
	 * @param customerOrderId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void modifyEffDate(long customerOrderId,String effDate) throws Exception, RemoteException;

	/**
	 * @description 创建订单附加信息
	 * @param aCustomerOrderId
	 * @param iOVOrderCustomer
	 * @throws Exception
	 */
	public void createOrdAdditionalInformation(long aCustomerOrderId, IOVOrderCustomer iOVOrderCustomer) throws Exception;
	
	/**
	 * @description 创建代付订单
	 * @param aCustomerOrderId
	 * @param iOVOrderCustomer
	 * @throws Exception
	 */
	public void createOrdPayForOther(long aCustomerOrderId, IOVOrderCustomer iOVOrderCustomer) throws Exception;
	
	public void createOrdPayForOther4Fixed(long aCustomerOrderId, IOVOrderCustomer iOVOrderCustomer) throws Exception;
	
	/**
	 * @description 创建组织关联关系
	 * @param aCustomerOrderId
	 * @param iOVOrderCustomer
	 * @throws Exception
	 */
	public void createDepartmentRelation(long aCustomerOrderId, IOVOrderCustomer iOVOrderCustomer) throws Exception;
	
	/*
	 * 换号 workflow方法 add by zhanglei
	 */
	public void changeNumber(long customerOrderId) throws RemoteException, Exception;
	
	/*
	 * 换号
	 */
	public void changeNumber(long customerOrderId, IOVOrderOffer aOVOrderOffer) throws Exception, RemoteException;
	
	/**
     * TDC PSTN预销户接口
     * @throws Exception
     * @throws RemoteException
     */
    public void ordPreQuidProd(String billId,long userId ,String quitReason ,Timestamp bookingDate ,String remarks ,Map extendMap)
            throws Exception, RemoteException;
	/*
	 * PSTN&ISDN 后台销户接口
	 */
	public void ordQuidProd(String billId, Timestamp effectiveDate) throws Exception, RemoteException;
	/**
	 * 成员操作送计费开通接口
	 * @param customerOrderId
	 * @param offerOrderId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void sendBillingAndOpenForMem(long customerOrderId, long offerOrderId) throws Exception, RemoteException;
	/**
	 * 保存使用者信息
	 * @param customerOrderId
	 * @param iOVOrderCustomer
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void saveCmInsCmrelValue(long aCustomerOrderId, IOVOrderCustomer iOVOrderCustomer) throws Exception, RemoteException;
	/**
	 * 协议期订单过期时间处理
	 * @param customerOrderId
	 * @param iOVOrderCustomer
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void dealAgreementExpire(long aCustomerOrderId, IOVOrderCustomer iOVOrderCustomer) throws Exception, RemoteException;
	/*
	 * 等待开通调用，回填属性并人工回单
	 */
	public void waitForOpen(long customerOrderId,long offerOrderId, String taskId, HashMap paraMap) throws Exception, RemoteException;	public void sendOpenForOTT(long customerOrderId, long offerOrderId,String taskId)throws Exception, RemoteException;
	public List getBBossWorkflowCodeVASOffer(long customerOrderId) throws Exception,RemoteException;
    public boolean judgeHasOTT(long customerOrderId) throws RemoteException, Exception ;
    public boolean cancelOrderCustByMsg( long custOrderId, String msg ) throws Exception;
    public void saveAddress4Pstn(long customerOrderId)throws Exception;
    public void saveAddress4PstnUpdate(long customerOrderId,long offerOrderId)throws Exception;
    /**
     * 处理分账、部门、使用者关系
     * @param customerOrderId
     * @throws Exception
     * @throws RemoteException
     */
	public void dealOrderAdditionalInfo(long customerOrderId) throws Exception,RemoteException;

	public void dealAgreementOfferRel(long customerOrderId) throws RemoteException, Exception;
	
	/**
	 * 删除保险记录
	 * @param customerOrderId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void deleteInsuranceRecord(long custerOrderId) throws Exception,RemoteException;
    /*
	 * 开户自动创建vpn
	 */
	public boolean ordNewProd(long customerOrderId) throws Exception, RemoteException;
	/**
	 * pstn预销重入网处理vpmn实例
	 * @param customerOrderId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void dealVpmnIns(long customerOrderId) throws Exception, RemoteException;
	/*
	 * 客户管理修改客户信息处理phonebook调用接口
	 */
	public void dealPhoneBook(long custId) throws Exception, RemoteException;
	
	public void depositeSoOrder(IOVOrderCustomer aOVOrderCustomer) throws Exception, RemoteException;
	
	public void depositeSoOrder(long customerOrderId) throws Exception, RemoteException;
	
	public void updateOrderUserInfo(long offerOrderId,String pniNum,String taskId,String errorMsg) throws Exception, RemoteException;
	public boolean judgeUserExist(long customerOrderId) throws Exception, RemoteException;
	
	public void depositWimp(long customerOrderId,long offerOrderId) throws Exception, RemoteException;
	public void updateCprNum(long customerOrderId) throws Exception, RemoteException;
	/**
	 * 发送pushc
	 * @param customerOrderId
	 * @param code
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void send2Pushc(long customerOrderId,String code) throws Exception, RemoteException;
	
	/**
	 * 发送pushcPstn
	 * @param customerOrderId
	 * @param code
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void send2PushcPstn(long customerOrderId,String code,String eff_date) throws Exception, RemoteException;

	 /**
	  * xuecy 根据也不同的业务规则起不同的业务流程
	  *
	  * @param parentTaskId
	  * @param npFlag
	  * @param spFlag
	  * @param offerOrderIds
	  * @param soOfferDataKeys
	  * @param regionId
	  * @throws java.rmi.RemoteException
	  * @throws Exception
	  */
 public void startChildWorkflow(String parentTaskId, String npFlag, String spFlag, String offerOrderIds,
                                String soOfferDataKeys, String regionId, String bssFlag, long customerOrderId,
                                long poaCustomerOrderId) throws RemoteException,Exception;
	 /**
	  * xuxz 回单流程
	  * @param customerOrderId
	  * @throws RemoteException
	  * @throws Exception
	  */
	 public void finishUserTask(long customerOrderId) throws RemoteException, Exception;
	 
	 public void changeStatusToOnline(IOVOrderCustomer aOVOrderCustomer)throws Exception;
	 
	 public void send4PstnOpen(long customerOrderId, String offerOrderIds,String taskId) throws Exception, RemoteException;
	 
	 public void send4PstnBilling(long customerOrderId, long offerOrderId,String taskId) throws Exception, RemoteException;
	 
	 public void send4PstnBilling(long customerOrderId, String offerOrderId,String taskId) throws Exception, RemoteException;
	 
	 public void changeStatusToOnline(long customerOrderId)throws Exception, RemoteException;
	
	 public void cancelOrder(long CUSTOMER_ORDER_ID, long ORDER_OFFER_ID) throws Exception;
	 
	 public void cancelOrder(long customerOrderId,String ordOfferIds) throws Exception;
	 
	 public void changePhoneBook4ChangeNumber(long customerOrderId) throws RemoteException, Exception;
	 
	 public void changePhoneBook4NewConnection(long customerOrderId) throws RemoteException, Exception;
	 
	 public void changePhoneBook4TransferOwnship(long customerOrderId) throws RemoteException, Exception;
	 
	 public void changePhoneBook4ChangeOffer(IOVOrderCustomer aOVOrderCustomer) throws Exception;
 
	 public void changePhoneBook4QuitUser(long customerOrderId) throws RemoteException, Exception;
	
	 public void changePhoneBook4ChangeProd(IOVOrderCustomer aOVOrderCustomer) throws Exception;
	
	 /**
	  * hanyue3 change offer 后台流程支持自动创建vpn和添加成员
	  * @param  customerOrderId
	  * @throws RemoteException
	  * @throws Exception
	  */
	 public List dealChgOfferAddMem(long customerOrderId) throws Exception,RemoteException;
	 
	 public boolean judgeCustType(long customerOrderId) throws RemoteException,Exception;
	 
	 public void dealAddMemberOfGroupProd(long customerOrderId) throws RemoteException,Exception;
	 
	 public void modAcctActive(long customerOrderId) throws RemoteException,Exception;
	 
	 public boolean notifyOpenWorkflowForBatch(String billId, Date stringToDate) throws RemoteException, Exception;
	
	 public void send4Open(long customerOrderId, String offerOrderIds,String taskId) throws Exception, RemoteException;
	
	 public void send4ChgVPNOpen(long customerOrderId, String offerOrderIds,String taskId) throws Exception, RemoteException;
	 
	 public void send4Billing(long customerOrderId, String offerOrderIds,String taskId) throws Exception, RemoteException;

	 
	 /**
	  * 预销重入网不换套餐 在ovo对象中添加addOn信息
	  */
	 public void createAddOnOfferOVO(long aCustomerOrderId , IOVOrderCustomer aOVOrderCustomer) throws Exception, RemoteException;


	 
	 /**
	  * hanyue3   过户后台流程处理VPMN
	  * @param  customerOrderId regionId
	  * @throws RemoteException
	  * @throws Exception
	  */
	 public void dealVPMN4TransfOwnerShip(long customerOrderId, String regionId) throws Exception;
	 
	 /**
	  * 更改分账关系后不可反悔
	  * @param customerOrderId
	  * @throws Exception
	  */
	 public void setRegretFlagForSplitAccrel(long customerOrderId) throws Exception;
	 
	 /**
	  * @author huangsr
	  * @param aCustomerOrderId
	  * @param aOVOrderCustomer
	  * @throws Exception
	  */
	 public void dealOfferInstOsState(long aCustomerOrderId , IOVOrderCustomer aOVOrderCustomer)throws Exception;
	 
	 /**VPN添加成員添加參數類型
		 * key:VPN_MEM_ACCESS_TYPE   
		 * value:1.GSM（GSM B2B+Huntingplan）\2．  CDA（PSTN +PNP）3．  DL\7．  SIPT
		 * @param offerId
		 * @return
		 * @throws Exception
     */
	 public String getVpnMemAccessType(long userId) throws Exception;
	 
	 public boolean checkIsNeedSendOpen(long customerOrderId) throws Exception;
	 
	 public void createFreeInsuranceOrder(IOrdCustValue orderCust, IBOInsxUserInsuranceValue[] insuranceValues)
				throws Exception, RemoteException, PceException;
	 /**
	  * 
	  * <p>Title: recoverOffUserValue</p>  
	  * <p>Description: </p>  
	  * @param aOrdOffOrdUserValue
	  * @param insOffInsUserValue
	  * @param userOrderId
	  * @param offerOrderId
	  * @return
	  * @throws Exception  
	  * @author Yang Jieee  
	  * @date 2022年6月6日  
	  * @version V1.0
	  */
	 public IOrdOffOrdUserValue recoverOffUserValue(IOrdOffOrdUserValue aOrdOffOrdUserValue,IInsOffInsUserValue insOffInsUserValue,long userOrderId , long offerOrderId) throws Exception;
	 
	 public IOrdUserValue recoverUserValue(IOrdUserValue aOrdUserValue,IInsUserValue insUserValue) throws Exception;
	 
	 public IOrdAccrelValue recoverAccrel(IOrdAccrelValue accrelValue,IInsAccrelValue iInsAccrelValue,long customerOrderId) throws Exception;

	 public void setOfferInsSrvAttrList(HashMap offins, String state, IInsSrvAttrValue insattr) throws Exception;

     public String getAccessTypeByOfferId(long offerId) throws Exception;

     public void initAccessType(IOVOrderCustomer customerOrder, HashMap paramMap) throws Exception;

     public void initForceDeleteMemberFlag(HashMap map, long userId) throws Exception;

 /**
  *
  * @param userId
  * @param offerId
  * @return
  * @throws Exception
  */
 public boolean isMainNumberUser(long userId,long offerId)throws Exception;
 
 	/**
 	 * 订单中有入群或换群业务时，创建入群在途记录
 	 * 创建记录
 	 * @author: huanglun     
 	 * @date:   2023年12月25日 上午11:35:09   
 	 * @Description:
 	 */
 	public void createOngoingMemShortnum(long customerOrderId,ISoOrderData orderData,HashMap<String, Object> parmMap,boolean isSpecial) throws Exception;
 	
 	/**
 	 * 入群的订单竣工或者取消后，更新ongoing_mem_shortnum表的状态,并且移历史表
 	 * @author: huanglun     
 	 * @date:   2023年12月25日 下午7:21:08   
 	 * @Description:
 	 */
 	public void updateOngoingMemShortnumStatus(long customerOrderId,long status) throws Exception;
}
