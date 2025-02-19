package com.asiainfo.crm.so.common.bboss.service.interfaces;

import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.util.Map;

import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.omframe.instance.ivalues.IInsCommitmentValue;
import com.ai.omframe.instance.ivalues.IInsUserValue;
import com.ai.omframe.order.data.ivalues.ISoOfferData;
import com.ai.omframe.order.ivalues.IQOrdCustAndOrdOfferValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupCustomerValue;
import com.asiainfo.crm.res.phone.ivalues.IQBOCorporateNumberMgrValue;
import com.asiainfo.crm.so.common.bboss.ivalues.IBOBbossStopReplyDealValue;
import com.asiainfo.crm.so.common.bboss.ivalues.IBOInsxVpnGroupRelValue;
import com.asiainfo.crm.so.common.bboss.ivalues.IBOOrdNpOngoingValue;
import com.asiainfo.crm.so.common.bboss.ivalues.IBOSoBlackWhiteUserInfoHValue;
import com.asiainfo.crm.so.common.bboss.ivalues.IBOSoBlackWhiteUserInfoValue;
import com.asiainfo.crm.so.common.bboss.ivalues.IBOSoBlackWhiteUserScanValue;
import com.asiainfo.crm.so.common.party.ivalues.IBOSoAuditInfoValue;
import com.asiainfo.crm.so.instance.bboss.ivalues.IBOGroupOrderInfoValue;
import com.asiainfo.crm.so.instance.bboss.ivalues.IBOHisGroupOrderInfoValue;

public interface IBbossBusiNoCenterSV {

	public IBOBbossStopReplyDealValue[] getBbossStopReplyDealByCustomerOrderId(long customerOrderId) throws Exception;
	public void saveBOBbossStopReplyDealValue(IBOBbossStopReplyDealValue IBOBbossOweProcValue) throws Exception;
	public IBOBbossStopReplyDealValue[] getBbossStopReplyDealByCondition(String condition , Map paramMap) throws Exception, RemoteException;
	/**
	  *	获取集团计费号，SEQUENCE名称：seq_billid_cailing，数据库：party库
	  * @Function: IBbossBusiNoCenterSV.java
	  * 
	  * @param regionId	客户所在地市
	  * @return	新的集团计费号
	  * @throws RemoteException
	  * @throws Exception
	  *
	  * @version: 1.0.0
	  * @author: chenrf
	  * @date: Mar 24, 2011 4:37:51 PM
	  *
	  * Modification History:
	  * Date           Author          Version            Description
	  *--------------------------------------------------------------*
	  * Mar 24, 2011   chenrf			 v1.0.0                                     
	  */
	public long createGroupBillId(String regionId) throws RemoteException, Exception;
	/**
	 * 
	* @Function: IBbossBusiNoCenterSV.java
	* @Description: 查询代理商的操作员信息
	*
	* @param:saId 代理商编号
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: zhangyu
	* @date: May 12, 2011 7:18:03 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 12, 2011     zhangyu           v1.0.0               修改原因
	 */
	public String[][] getSaOpers(String saId) throws RemoteException, Exception;
	/**
	 * 
	* @Function: BbossBusiNoCenterSVImpl.java
	* @Description: 用于得到代理商列表
	*
	* @param:  groupId   集团编号
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: longxiong
	* @date: Feb 24, 2011 7:33:46 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Feb 24, 2011     longxiong           v1.0.0               修改原因
	 */
	public String[][] getSaleAgentValueList(String groupId) throws Exception, RemoteException ;
	/**
	  *	根据业务操作编号和策划订单编号，判断业务操作是否有二次确认的需求
	  * @Function: BbossBusiNoCenterSVImpl.java
	  * @Description: 
	  *
	  * @param businessId
	  * @param offerId
	  * @return
	  * @throws RemoteException
	  * @throws Exception
	  *
	  * @version: 1.0.0
	  * @author: dingyd
	  * @date: May 11, 2011 7:44:16 PM
	  *
	  * Modification History:
	  * Date           Author          Version            Description
	  *--------------------------------------------------------------*
	  * May 11, 2011   dingyd			 v1.0.0                                     
	  */
	public boolean isNeedSecondConfirmation(long businessId, long offerId) throws RemoteException, Exception;
	/**
	 * 
	* @Function: IBbossCommonSV.java
	* @Description: 根据员工号取员工信息
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: Flavian
	* @date: 2011-2-5 下午12:46:32 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2011-2-5     Flavian           v1.0.0               修改原因
	 */
	public Map getManagerInfoByManagerId(String strStaffId) throws Exception, RemoteException;
	/**
	  *	根据操作ID，获取对应的订单类型
	  * @Function: BbossBusiNoCenterSVImpl.java
	  * @Description: 
	  *
	  * @param businessId	操作ID
	  * @return				订单类型
	  * @throws RemoteException
	  * @throws Exception
	  *
	  * @version: 1.0.0
	  * @author: dingyd
	  * @date: May 6, 2011 2:36:01 PM
	  *
	  * Modification History:
	  * Date           Author          Version            Description
	  *--------------------------------------------------------------*
	  * May 6, 2011   dingyd			 v1.0.0                                     
	  */
	public String getOrderTypeByBusinessId(long businessId) throws Exception, RemoteException;
	/**
	  * 根据操作ID获取营销平台对应的流程名称
	  * @Function: BbossBusiNoCenterSVImpl.java
	  * @Description: 
	  *
	  * @param businessId	操作ID
	  * @return				营销平台流程名称
	  * @throws RemoteException
	  * @throws Exception
	  *
	  * @version: 1.0.0
	  * @author: dingyd
	  * @date: May 6, 2011 2:51:30 PM
	  *
	  * Modification History:
	  * Date           Author          Version            Description
	  *--------------------------------------------------------------*
	  * May 6, 2011   dingyd			 v1.0.0                                     
	  */
	public String getRemoteWorkflowNameByBusinessId(long businessId) throws RemoteException, Exception;
	
	/**
	 * @author xunyl
	 * @description 查询客户与策划订单
	 * @param customerId
	 * @throws Exception
	 * @throws RemoteException
	 * @date 2012-04-20
	 */
	public IQOrdCustAndOrdOfferValue[] getOrdCustAndOrdOfferByCustId(long custId,String custName) throws Exception, RemoteException;
	/**
	 * 沉淀订单信息
	 * @param customerId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void saveOrdxInfoDeposite(long customerOrderId) throws Exception, RemoteException ;
	public void saveOrdxCust(long customerOrderId) throws Exception, RemoteException;
	/**
	 * 删除沉淀订单信息
	 * @param customerId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void deleteOrdxInfoDeposite(long customerOrderId) throws Exception, RemoteException;
	/**
	 * 通过集团id得到集团信息
	* @Function: IBbossCommonSV.java
	* @Description: 通过集团id得到集团信息
	*
	* @param llGroupId 集团编号
	* @return IBOCmGroupCustomerValue 集团客户基本信息
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: Flavian
	* @date: 2011-2-5 下午12:17:28 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2011-2-5     Flavian           v1.0.0               修改原因
	 */
	public IBOCmGroupCustomerValue getGroupInfoByGroupId(long llGroupId) throws Exception, RemoteException;
	/**
	 * 更改预受理订单状态为结束
	 * @param customerId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public String finishPreOrder(long customerOrderId) throws Exception, RemoteException ;
	/**
	 * 
	* Copyright: Copyright (c) 2012 Asiainfo-Linkage
	* 
	* @ClassName: IBbossBusiNoCenterSV.java
	* @Description: 根据策划ID去产品库查询该策划下的分账科目
	*
	* @version: v1.0.0
	* @author: wangbin
	* @date: 2012-9-15 下午05:01:10 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-9-15     wangbin           v1.0.0               修改原因
	 */
	public String[][] getItemType(String offerId) throws RemoteException, Exception;
	/**
	 * 
	* Copyright: Copyright (c) 2012 Asiainfo-Linkage
	* 
	* @ClassName: IBbossBusiNoCenterSV.java
	* @Description: 根据属性沉淀配置沉淀集团属性信息
	*
	* @version: v1.0.0
	* @author: wangbin
	* @date: 2012-9-19 下午03:00:36 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-9-19     wangbin           v1.0.0               修改原因
	 */
	public void saveDepositAttr(long customerOrderId)throws Exception, RemoteException ;
	/**
	 * 
	* Copyright: Copyright (c) 2012 Asiainfo-Linkage
	* 
	* @ClassName: IBbossBusiNoCenterSV.java
	* @Description: 集团用户注销的时候需要把沉淀的属性信息删除掉
	*
	* @version: v1.0.0
	* @author: wangbin
	* @date: 2012-9-19 下午03:16:56 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-9-19     wangbin           v1.0.0               修改原因
	 */
	public void delDepositAttr(long customerOrderId)throws Exception, RemoteException;
	
	/**   
	* @Function: IBbossBusiNoCenterDAO.java
	* @Description: 保存黑白名单
	*
	* @param bwu
	* @throws Exception
	* @throws RemoteException
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: yaojx
	* @date: Oct 13, 2012 2:09:24 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Oct 13, 2012     yaojx           v1.0.0               修改原因
	*/
	public void saveBlackWhitUser(IBOSoBlackWhiteUserInfoValue[] bwu)throws Exception, RemoteException;
	
	/**   
	* @Function: IBbossBusiNoCenterDAO.java
	* @Description: 根据客户编号，策划实例编号，手机号查询黑白名单信息
	*
	* @param custId
	* @param offInstId
	* @param billId
	* @return
	* @throws Exception
	* @throws RemoteException
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: yaojx
	* @date: Oct 13, 2012 2:18:20 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Oct 13, 2012     yaojx           v1.0.0               修改原因
	*/
	public IBOSoBlackWhiteUserInfoValue[] getBlackWhitUserByCustIdOffInstIdBillId(long custId,long offInstId,String billId,String status)throws Exception, RemoteException;
	
	/**   
	* @Function: IBbossBusiNoCenterDAO.java
	* @Description: 保存黑白名单历史表
	*
	* @param bwhu
	* @throws Exception
	* @throws RemoteException
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: yaojx
	* @date: Oct 13, 2012 2:09:29 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Oct 13, 2012     yaojx           v1.0.0               修改原因
	*/
	public void saveBlackWhitUserH(IBOSoBlackWhiteUserInfoHValue[] bwhu)throws Exception, RemoteException;
	/**   
	* @Function: IBbossBusiNoCenterDAO.java
	* @Description: 保存黑白名单扫描表
	*
	* @param bws
	* @throws Exception
	* @throws RemoteException
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: yaojx
	* @date: Oct 15, 2012 11:32:01 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Oct 15, 2012     yaojx           v1.0.0               修改原因
	*/
	public void saveBlackWhitUserScan(IBOSoBlackWhiteUserScanValue bws)throws Exception, RemoteException;
	
	public long getBlackWhitUserScanId()throws Exception, RemoteException;
	
	public IBOSoBlackWhiteUserScanValue[] getBlackWhitUserScanById(long blackWhiteId,long custId,long offInstId)throws Exception, RemoteException;
	
	public IBOSoBlackWhiteUserScanValue[] getBlackWhitUserScanBySerCodeBusiCode(
			String serCode, String busiCode,String upgwFile) throws Exception, RemoteException ;
	/**
	 * 根据属性ID获取对应属性枚举值
	 * @param attrId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public String[][] getAttrbuteValue(String attrId) throws Exception, RemoteException ;
	/**
	 * 保存审核信息
	 * @param soAuditInfoValues
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void saveGroupAuditInfo(IBOSoAuditInfoValue soAuditInfoValues) throws Exception, RemoteException;
	public DataContainerInterface[] getWorkList(String staffId, String custId, String chanceId, String custOrderId, String taskManageWorkflowType, 
			String queueId, int startIndex, int endIndex) throws Exception, RemoteException;
	public int getWorkListCount(String staffId, String custId, String chanceId, String custOrderId, String queueId, String taskManageWorkflowType) throws Exception, RemoteException;
	public String isLockTask(String taskId, String staffId) throws Exception,RemoteException;
	/**
	 * 根据用户ID查询集团订购信息
	 * @param groupId
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 */
	public IBOGroupOrderInfoValue getGroupOrderInfoByUserId(long userId)throws RemoteException,Exception;
	/**   
	* @Function: getGroupOrderInfoByContractId
	* @Description: TODO该函数的功能描述
	*
	* @param
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: zjl
	* @date: Dec 1, 2012 3:21:58 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Dec 1, 2012     zjl         v1.0.0               修改原因
	*/
	public IBOGroupOrderInfoValue[] getGroupOrderInfoByContractId(String contractId)throws RemoteException, Exception;
	/**
	 * 
	* @Function: IGroupOrderInfoDAO.java
	* @Description: 保存历史集团订购信息
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: zhangyu
	* @date: Jul 6, 2011 10:19:40 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Jul 6, 2011     zhangyu           v1.0.0               修改原因
	 */
	public boolean saveHisGroupOrderInfo(IBOHisGroupOrderInfoValue[] hisOrder)throws RemoteException, Exception;
	/**
	 * 保存集团订购信息
	 * @param order
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 */
	public boolean saveGroupOrderInfo(IBOGroupOrderInfoValue[] orders)throws RemoteException,Exception;
	/*
	 * 保存vpn群关系数据
	 */
	public void saveInsxVpnGroupRelInfo(IBOInsxVpnGroupRelValue[] values) throws RemoteException,Exception;
	/*
	 * 查询vpn群关系数据
	 */
	public IBOInsxVpnGroupRelValue[] queryInsxVpnGroupRelInfo(long custId, long userId, long mainUserId, long offerInstId, long isMainGroup) 
			throws RemoteException,Exception;
	/**
	 * 只查询自己VPN的信息，不查询关系客户的VPN信息
	 * @param custId
	 * @param userId
	 * @param mainUserId
	 * @param offerInstId
	 * @param isMainGroup
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 */
	public IBOInsxVpnGroupRelValue[] queryOnlyInsxVpnGroupRelInfo(long custId, long userId, long mainUserId, long offerInstId, long isMainGroup) 
			throws RemoteException,Exception;
	/*
	 * 删除vpn群关系数据
	 */
	public void deleteInsxVpnGroupRelInfo(IBOInsxVpnGroupRelValue value) throws RemoteException,Exception;
	/**
	 * 保存VPN群直接的关系,flag,1:新建,2:删除
	 * @param customerOrderId
	 * @param flag
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void saveVpnGroupRel(long customerOrderId,int flag)throws Exception, RemoteException;
	/**
	 * 集团号码实占
	 * @param customerOrderId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void occupyBillId(long customerOrderId) throws Exception, RemoteException;
	/**
	 * 号码如果被客户预占了，需要回归给客户
	 * @param customerOrderId
	  * @throws Exception
	 * @throws RemoteException
	 */
	public void dealServerNumber(long customerOrderId)throws Exception, RemoteException;
	
	/**
	 * portin号段查询
	 * @param customerOrderId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void queryNumberRange( String mainbillId) throws Exception, RemoteException;
	
	public IQBOCorporateNumberMgrValue[] getNumberRange(String mainbillId,String opertype) throws Exception, RemoteException;
	
	public int getNumberRangeCount(String mainbillId,String opertype) throws Exception, RemoteException;
	/**
	 * 更新VPN名字
	 * @param customerOrderId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void updateVpnGroupRel(long customerOrderId) throws Exception, RemoteException;
	/**
	 * 
	 * @param offerOrderIds
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public boolean judgeIsMainOrder(String offerOrderIds)throws Exception, RemoteException;
	/**
	 * VPN 分页查询接口
	 * @param custId
	 * @param userId
	 * @param mainUserId
	 * @param offerInstId
	 * @param isMainGroup
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 */
	public IBOInsxVpnGroupRelValue[] queryInsxVpnGroupRelInfoSplitPage(long custId, long userId, long mainUserId, long offerInstId, long isMainGroup,int startNum,int endNum)throws RemoteException,Exception;
	
	/**
	 * 更新CI操作
	 */
	public void updateCI(IInsCommitmentValue commitmentValue, IInsUserValue insUser, UserInfoInterface user,
			Timestamp startDate, Timestamp endDate,Timestamp oldEndDate) throws Exception;
	
	/**
	 * 
	 * @param stateId
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 */
	public int getOrdNpOnGoingCounts(long stateId)throws RemoteException,Exception;
	/**
	 * 
	 * @param values
	 * @throws RemoteException
	 * @throws Exception
	 */
	public void saveOrdNpOngoingInfo(IBOOrdNpOngoingValue[] values)throws RemoteException,Exception;
	/**
	 * 
	 * @param stateId
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 */
	public IBOOrdNpOngoingValue[] getOrdNpOnGoingCountsBystateId(long stateId,int start,int end)throws RemoteException,Exception;
	/**
	 * 
	 * @param stateId
	 * @throws RemoteException
	 * @throws Exception
	 */
	public void updateOOrdNpOngoingValue()throws RemoteException,Exception;
	public boolean judgeIsMainOrder(ISoOfferData aSoOfferData)throws Exception, RemoteException;

	public IBOInsxVpnGroupRelValue[] queryInsxVpnGroupRelInfo4Migrate(long custId,String migrateStatus,int start,int end) throws RemoteException, Exception;
}
