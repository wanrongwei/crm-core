package com.asiainfo.crm.so.order.rboss.service.interfaces;

import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
//import com.ai.comframe.vm.workflow.ivalues.IBOVmTaskValue;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.omframe.instance.ivalues.IInsProdValue;
import com.ai.omframe.instance.ivalues.IInsSrvAttrValue;
import com.ai.omframe.instance.ivalues.IInsUserValue;
import com.ai.omframe.order.bo.OrdBusiPriceBean;
import com.ai.omframe.order.bo.OrdCustExtBean;
import com.ai.omframe.order.data.ivalues.ISoOrderData;
import com.ai.omframe.order.ivalues.IOVOrderCustomer;
import com.ai.omframe.order.ivalues.IOVOrderServicePkg;
import com.ai.omframe.order.ivalues.IOrdBusiPriceValue;
import com.ai.omframe.order.ivalues.IOrdCustExtValue;
import com.ai.omframe.order.ivalues.IOrdCustValue;
import com.ai.omframe.order.ivalues.IOrdOffOrdUserValue;
import com.ai.omframe.order.ivalues.IOrdOfferValue;
import com.ai.omframe.order.ivalues.IOrdProdOrdSrvValue;
import com.ai.omframe.order.ivalues.IOrdSrvAttrValue;
import com.ai.omframe.order.ivalues.IOrdUserValue;
import com.ai.omframe.order.ui.ivalues.ISoRuleReturnData;
import com.ai.omframe.order.valuebean.OrderValueChain;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCustomizeValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.so.common.party.ivalues.IBOOrdxIntfControlValue;
import com.asiainfo.crm.so.exe.ws.oss.CoInfo;
import com.asiainfo.crm.so.exe.ws.oss.ResultInfo;
import com.asiainfo.crm.so.order.fixedline.dto.ActVo;
import com.asiainfo.crm.so.order.fixedline.dto.BaseOrderVo;
import com.asiainfo.crm.so.order.fixedline.dto.ModifyOnlineDateInfoVo;
import com.asiainfo.crm.so.order.fixedline.dto.OrdSubmmitResultVo;
import com.asiainfo.crm.so.order.fixedline.dto.OrderOperationInitVo;
import com.asiainfo.crm.so.order.pushc.vo.Address;
import com.asiainfo.crm.so.order.rboss.valuebean.VmTaskValueBean;

/**
 * Copyright: Copyright (c) 2010 Asiainfo-Linkage
 *
 * @ClassName: com.asiainfo.crm.so.order.rboss.service.impl.IFixNetBusiSV
 * @Description:
 * @version: v1.0.0
 * @author: zhangyong12
 * @date: 2012-02-01
 * <p/>
 * Modification History:
 * Date          Author          Version            Description
 * ---------------------------------------------------------*
 * 2012-02-01      zhangyong12      v1.0.0
 */
@SuppressWarnings("rawtypes")
public interface IFixedLineSV {
	
	/**
	 * 生成宽带上网账号
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date:  2012-4-10
	 */
	public String generateBroadBandAccount() throws RemoteException, Exception;
	/**
	 * 生成宽带上网密码
	 * @param busiSpecId
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date:  2012-4-10
	 */
	public String generateBroadBandPassword() throws RemoteException, Exception;
	/**
	 * 生成宽带Reference ID
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date:  2012-4-10
	 */
	public String generateBroadBandReferenceID(String dslId) throws RemoteException, Exception;
	/**
	 * 生成VOIPId
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: gexy
	 * @date:  2014-6-3
	 */
	public String generateBroadBandVOIP() throws RemoteException, Exception;
	/**
	 * 生成OrderId
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: gexy
	 * @date:  2014-6-3
	 */
	public String generateBroadBandOrder() throws RemoteException, Exception;
	/**
	 * 
	 * @param customerOrderId
	 * @param userId
	 * @param attrId
	 * @param byAttrId
	 * @param attrValue
	 * @param attrText
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date: 2014-9-16
	 */
	public void saveOrderSrvAttr(long customerOrderId,long userId,long attrId,long byAttrId,String attrValue,String attrText,IOrdCustValue ordCustValue)throws RemoteException, Exception;
	/**
	 * 
	 * @param customerOrderId
	 * @param map
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date: 2014-9-16
	 */
	public void deliveryResponse(long customerOrderId,Map map)throws RemoteException, Exception;
	/**
	 * 
	 * @param customerOrderId
	 * @param map
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date: 2014-9-16
	 */
	public void returnResponse(long customerOrderId,Map map)throws RemoteException, Exception;
	
	/**
	 * 
	 * @param customerOrderId
	 * @param userId
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date: 2014-9-18
	 */
	public void updateDeliverySchedule(long customerOrderId,long userId, String deliveryDate)throws RemoteException, Exception;
	/**
	 * @deprecated (Telenor版本业务逻辑发生变更，该方法已不适用)
	 * @param customerOrderId
	 * @param userId
	 * @param taskId
	 * @param completeDate
	 * @param map
	 * @param regionId
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date: 2014-9-17
	 */
	@Deprecated
	public void completeResponse(long customerOrderId,long userId, String taskId,String completeDate,Map map,String regionId)throws RemoteException, Exception;
    /**
     * 根据用户编号获取该用户对应的用户扩展信息容器对象
     * @param userId
     * @return
     * @throws RemoteException
     * @throws Exception
     * @version: v1.0.0
     * @author: zhangyong12
     * @date:  2012-3-14
     */
    public DataContainerInterface getUserExtDataContainerInfoByUserId(long userId) throws RemoteException, Exception;
    /**
     * 获取用户的综合信息，包含：客户、用户、账户等信息。
     * @param userId
     * @return
     * @throws Exception
     * @throws RemoteException
     * @version: v1.0.0
     * @author: zhangyong12
     * @date:  2012-3-14
     */
    public DataContainerInterface getUserGeneralInfo(long userId)throws Exception,RemoteException;
    
    /**
     * 查询用户付费类型
     * @param userId
     * @param validType
     * @return
     * @throws RemoteException
     * @throws Exception
     * @version: v1.0.0
     * @author: zhangyong12
     * @date:  2012-2-28
     */
     public String qryUserPayTypeByUserId(long userId,int validType) throws RemoteException, Exception;
     /**
      * 查询付费类型
      * @param offerId
      * @return
      * @throws RemoteException
      * @throws Exception
      * @version: v1.0.0
      * @author: zhangyong12
      * @date:  2012-2-28
      */
     public String qryUserPayTypeByOfferId(long offerId) throws RemoteException, Exception;
     /**
      * 校验手机付费类型与宽带付费类型
      * @param mainOfferId
      * @param mobileUserId
      * @return
      * @throws RemoteException
      * @throws Exception
      * @version: v1.0.0
      * @author: zhangyong12
      * @date:  2012-5-3
      */
     public String judgeUserPayType(long mainOfferId,long mobileUserId) throws RemoteException, Exception;
     /**
      * 获取入网时长
      * @param userId用户ID
      * @return
      * @throws RemoteException
      * @throws Exception
      * @version: v1.0.0
      * @author: zhangyong12
      * @date:  2012-3-8
      */
     public long getCreateUserForMonths(long userId) throws RemoteException, Exception;
     /**
      * 获取入网时长
      * @param userValue用户信息
      * @return
      * @throws RemoteException
      * @throws Exception
      * @version: v1.0.0
      * @author: zhangyong12
      * @date:  2012-3-8
      */
     public long getCreateUserForMonths(IInsUserValue userValue) throws RemoteException, Exception;
     /**
      * 保存用户订单操作表
      * @param customerOrderId
      * @param userId
      * @param billId
      * @param operateType
      * @param operateCode
      * @param operateDesc
      * @param param
      * @throws Exception
      * @throws RemoteException
      * @version: v1.0.0
      * @author: zhangyong12
      * @date:  2012-3-26
      */
     public void saveUserOperate(long customerOrderId,long userId,String billId,int operateType,String operateCode,String operateDesc,Map param) throws Exception, RemoteException;
     /**
      * 保存用户订单操作表
      * @param aOVOrderCustomer
      * @param userId
      * @param billId
      * @param operateType
      * @param operateCode
      * @param operateDesc
      * @param param
      * @throws Exception
      * @throws RemoteException
      * @version: v1.0.0
      * @author: zhangyong12
      * @date:  2012-3-26
      */
     public void saveUserOperate(IOVOrderCustomer aOVOrderCustomer,long userId,String billId,int operateType,String operateCode,String operateDesc,Map param) throws Exception, RemoteException;
     /**
      * oss订单竣工通知
      * @param customerOrderId
      * @param taskId
      * @param orderKind
      * @param operType
      * @param completeDate
      * @param remarks
      * @param ossReturn
      * @throws RemoteException
      * @throws Exception
      * @version: v1.0.0
      * @author: zhangyong12
      * @date: 2013-12-6
      */
     public void completeNotice(long customerOrderId,String taskId,String orderKind,long operType,String completeDate,String remarks, String ossReturn)throws RemoteException,Exception;
     /**
      * 订单反馈
      * @param intfCode
      * @param param
      * @throws RemoteException
      * @throws Exception
      * @version: v1.0.0
      * @author: zhangyong12
      * @date: 2014-7-17
      */
     public void orderResponse(String intfCode,Map param)throws RemoteException,Exception;
     /**
 	 * NP回单
 	 * @param customerOrderId
 	 * @param paraMap
 	 * @throws Exception
 	 * @throws RemoteException
 	 */
 	public void npResultResponse(long customerOrderId, Map paraMap) throws Exception, RemoteException;
     /**
 	 * 当到期日期在到期前一个月和到期后三个月内返回true，否则返回false
 	 * @param userId 
 	 * @param regionId 
 	 * @return
 	 * @throws RemoteException
 	 * @throws Exception
 	 */
 	public Map checkInsOfferExprieDate(long userId,String regionId,String billId,String isFamilyFlag) throws RemoteException, Exception;
 	
     /**
      * 根据手机号码修改订购宽带的到期处理方式
     * @param billId
     * @param exireDealType
     * @throws RemoteException
     * @throws Exception
     */
    public void upExireDealTypeInstSrv(String billId,String exireDealType)throws RemoteException,Exception;
    
    /**
     * 根据手机号码查询到期处理方式
    * @param billId
    * @param exireDealType
    * @throws RemoteException
    * @throws Exception
    */
   public IInsSrvAttrValue queryExireDealTypeInstSrv(String billId)throws RemoteException,Exception;
   /**
    * 根据手机号码和新的策划id获取宽带换套餐的数据
   * @param billId
   * @param newOfferId
   * @throws RemoteException
   * @throws Exception
   */
   public ISoOrderData createSoOrderDatabyBillId(String billId, long newOfferId) throws RemoteException, Exception ;
   /**
    * 获取手机号码绑定的宽带用户的老地址
    * @param fixnetType
    * @param MobileBillId
    * @return
    * @throws RemoteException
    * @throws Exception
    * @version: v1.0.0
    * @author: zhangyong12
    * @date:  2012-8-8
    */
   public Map getOldAddr(String fixnetType, String MobileBillId,String addrInfo) throws RemoteException, Exception ;
   /**
    * 获取分账账户
    * @param mobileUserId
    * @param mobileBillId
    * @return
    * @throws Exception
    * @throws RemoteException
    * @version: v1.0.0
    * @author: zhangyong12
    * @date:  2012-8-14
    */
   public DataContainerInterface getSplitAccrel(long mobileUserId,String mobileBillId)throws Exception,RemoteException;
   /**
    * 判断套餐是否是一次性收取
    * @param offerId
    * @return
    * @throws Exception
    * @throws RemoteException
    * @version: v1.0.0
    * @author: zhangyong12
    * @date:  2012-9-14
    */
   public boolean getOnceFeeFlagByOfferId(long offerId)throws RemoteException, Exception;
   /**
    * 判断套餐是否能自动续费
    * @param offerId
    * @return
    * @throws RemoteException
    * @throws Exception
    */
   public boolean getAutoExtendFlagByOfferId(long offerId)throws RemoteException, Exception;
   /**
    * 判断套餐是否是一次性收取
    * @param userId
    * @param offerInstId
    * @return
    * @throws Exception
    * @throws RemoteException
    * @version: v1.0.0
    * @author: zhangyong12
    * @date:  2012-12-17
    */
   public Map getFeeInfoByofferInstId(long userId,long offerInstId)throws Exception,RemoteException;
	/**
	 * 不模糊化客户信息
	 * @param custId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date:  2012-10-9
	 */
	public ICustomerValue queryCustomerNotMaskById(long custId)throws Exception, RemoteException;
	/**
	 * 不模糊化账户信息
	 * @param custId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date:  2012-10-9
	 */
	public IAccountValue queryAccountNotMaskById(long acctId)throws Exception, RemoteException;
	/**
	 * 不模糊化账户地址信息
	 * @param custId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date:  2012-10-9
	 */
	public IAcctBillCustomizeValue queryCurrAcctBillCustomizesNotMaskByAcctId(long acctId)throws Exception, RemoteException;
	/**
	 * 根据策划实例获取送boss产品
	 * @param offerInstId
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date:  2012-11-2
	 */
	public IInsProdValue getSendBossProdByofferInstId(long userId,long offerInstId) throws RemoteException, Exception;
	/**
	 * 保存订单扩展属性
	 * @param ordCustValue
	 * @param attrCode
	 * @param attrValue
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date:  2012-11-13
	 */
	public void saveCustOrderExt(IOrdCustValue ordCustValue,String attrCode,String attrValue) throws RemoteException, Exception;
	/**
	 * 保存日志
	 * @param ordCustValue
	 * @param attrCode
	 * @param attrValue
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date:  2012-11-13
	 */
	public void saveLog(long customerOrderId,String so_nbr,String resultCode,String resultMsg,String description,String xml) throws RemoteException, Exception;
	/**
	 * 格式化送boss时间
	 * @param dateTime
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date:  2012-11-4
	 */
	public String formatSendBossDate(Timestamp dateTime) throws RemoteException, Exception;
	/**
	 * 格式化送pboss时间
	 * @param dateTime
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date:  2012-11-27
	 */
	public String formatSendPossDate(Timestamp dateTime) throws RemoteException, Exception;
	/**
	 * 获取移机新小区费用
	 * @param userId
	 * @param offerInstId
	 * @param totalFee
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date:  2012-11-8
	 */
	public long getMoveNewAddrFee(long userId,long offerInstId,long totalFee) throws RemoteException, Exception;
	/**
	 * 获取回退费用
	 * @param userId
	 * @param offerInstId
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date:  2012-10-24
	 */
	public String getRefundFee(long userId, long offerInstId,long priceId) throws RemoteException, Exception;
	/**
	 * 退费处理
	 * @param ordCustValue
	 * @param userId
	 * @param offerId
	 * @param acctId
	 * @param instProdId
	 * @param priceId
	 * @param effectiveDate
	 * @param totalPeriod
	 * @param refundFee
	 * @param payType
	 * @param mobileBillId
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date:  2012-11-2
	 */
	public String dealRefundFee(IOrdCustValue ordCustValue,long userId,long offerInstId,long offerId,long acctId,long instProdId,long priceId,Timestamp effectiveDate,long totalPeriod,long refundFee,int payType,String mobileBillId) throws RemoteException, Exception;
	/**
	 * 订单撤销费用处理
	 * @param customerOrderId
	 * @param userId
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date:  2012-11-8
	 */
	public String dealOrderFee4Cancel(long customerOrderId, long userId) throws RemoteException, Exception;
	/**
	 * 获取送计费参数
	 * @param userId
	 * @param offerInstId
	 * @return EFFECTIVE_DATE生效时间 TOTAL_PERIOD协议期 TOTAL_FEE总金额
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date:  2012-10-31
	 */
	public Map getSendBossParam(long userId, long offerInstId) throws RemoteException, Exception;
	/**
	 * 获取voipnum计费参数
	 * @param customerOrderId
	 * @param userId
	 * @param offerInstId
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date: 2014-11-10
	 */
	public String getSendBossVoIPNumParam(long customerOrderId,long userId, long offerInstId) throws RemoteException, Exception;
	/**
	 * 送预存
	 * @param ordCustValue
	 * @param userId
	 * @param ordBusiPrice
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date:  2012-11-13
	 */
	public void savePrePayFee2Billing(IOrdCustValue ordCustValue, long userId, IOrdBusiPriceValue ordBusiPrice) throws RemoteException, Exception;
	/**
	 * 
	 * @param ordCustValue
	 * @param userId
	 * @param ordBusiPrice
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date: 2014-9-24
	 */
	public void sendOtc2Billing(IOrdCustValue ordCustValue, long userId,long acctId, IOrdBusiPriceValue ordBusiPrice) throws RemoteException, Exception;
	/**
	 * 
	 * @param ordCustValue
	 * @param userId
	 * @param ordBusiPrice
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date: 2014-9-24
	 */
	public void refundOtc2Billing(IOrdCustValue ordCustValue, long userId,long acctId, IOrdBusiPriceValue ordBusiPrice) throws RemoteException, Exception;
	
	/**
	 * 宽带移机获取新老地址活动策划信息
	 * @param offerId
	 * @param nextOfferId
	 * @param channel
	 * @param newCommunityName
	 * @param oldCommunityName
	 * @param newDistrictId
	 * @param oldDistrictId
	 * @param selectOfferType
	 * @return
	 * @throws Exception
	 */
	public String getChangeAddrInfo(long offerId,long nextOfferId,String channel,String newCommunityName,String oldCommunityName,String newDistrictId,String oldDistrictId,String selectOfferType,long userId) throws Exception;
	
	/**
	 * 获取用户是否参加活动
	 * @param userId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public DataContainerInterface[] getIsUserGroupInfo(long userId)throws Exception,RemoteException;
	/**
	 * 固网撤单（转入撤单流程并回退费用）
	 * @param taskId 流程任务ID
	 * @param result 值为cancel，进入撤单流程
	 * @param wfMap 流程信息
	 * @param feeMap 费用信息
	 * @throws RemoteException
	 * @throws Exception
	 */
	public void fixnetCancelBusi(String taskId, String result, Map wfMap, Map feeMap) throws RemoteException, Exception;
	
	/**
	 * 查询自动续费的协议期与费用
	 * @function IFixNetBusiSV.getFixnetExtendInfo
	 * @param userId 宽带USER_ID
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 * @author dongql
	 * @date 2012-11-21
	 */
	public Map getFixnetExtendInfo(long userId) throws RemoteException, Exception;
	/**
	 * 
	 * @param customerOrderId
	 * @param userId
	 * @param changeType
	 * @param changeReason
	 * @param mandatory
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date: 2014-11-24
	 */
	public ResultInfo isChangeOngoingOrder(long customerOrderId, long userId,String changeType,String changeReason,boolean mandatory) throws RemoteException, Exception;
	/**
	 * 
	 * @param customerOrderId
	 * @param userId
	 * @param changeType
	 * @param changeReason
	 * @param mandatory
	 * @param oldValue
	 * @param newValue
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date: 2014-11-24
	 */
	public void dealChangeOngoingOrder(long customerOrderId, long userId,String changeType,String changeReason, boolean mandatory,Map oldValue, Map newValue) throws RemoteException, Exception;
	/**
	 * 
	 * @param customerOrderId
	 * @param userId
	 * @param cancelType
	 * @param cancelReason
	 * @param mandatory
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date: 2014-11-24
	 */
	public ResultInfo isCancelOngoingOrder(long customerOrderId, long userId,String cancelType,String cancelReason, boolean mandatory) throws RemoteException, Exception;
	/**
	 * 
	 * @param customerOrderId
	 * @param userId
	 * @param cancelType
	 * @param cancelReason
	 * @param mandatory
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date: 2014-11-24
	 */
	public void dealCancelOngoingOrder(long customerOrderId, long userId,String cancelType,String cancelReason, boolean mandatory) throws RemoteException, Exception;
	/**
	 * 查询客户信息
	 * @function FamilyOrderQrySVImpl.getFamilyGeneralCustInfo
	 * @param billId 可以是手机号、宽带计费号或固话号码，其CUST_ID都相同
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author dongql
	 * @date 2012-12-19
	 */
	public DataContainerInterface getFamilyGeneralCustInfo(String billId) throws RemoteException, Exception;
    /**
     * 获取VOIP用户的VOIP号码
     * @param userId
     * @return
     * @throws Exception
     * @throws RemoteException
     * @version: v1.0.0
     * @author: gexy
     * @date:  2014-09-02
     */
    public DataContainerInterface getVOIPNum(long userId)throws Exception,RemoteException;
    
	public DataContainerInterface[] getInstSrvAttrBatchByUserId(long userId, long attrId, long offerInstId) throws RemoteException, Exception;
	
	/**
	 * 权责转让费用处理
	 * @function IFixNetBusiSV.chgCustOwnerTransferFee
	 * @param customerOrderId
	 * @param aOVOrderCustomer
	 * @throws RemoteException
	 * @throws Exception
	 * @author dongql
	 * @date 2013-1-25
	 */
	public void chgCustOwnerTransferFee(long customerOrderId, IOVOrderCustomer aOVOrderCustomer) throws RemoteException, Exception;
	/**
     * 固网获取用户策划列表
     * @function IBroadbandSV.getUserOfferList
     * @param userKind
     * @param bceFrameId
     * @param subBusinessId
     * @param userId
     * @return
     * @throws RemoteException
     * @throws Exception
     * @author zhangyong12
     * @date 2013-8-13
     */
	public DataContainerInterface[] getUserOfferList(String userKind,long bceFrameId,long subBusinessId,long userId) throws RemoteException, Exception;
	
	/**
	 * 校验宽带安装日期
	 * @param onlineDate
	 * @param businessId
	 * @param actCode
	 * @return
	 * @throws Exception
	 */
	public ISoRuleReturnData validateOnlineDate(java.util.Date onlineDate,String startDate ,long businessId,String actCode) throws Exception;
	
	/**
	 * 获取未竣工订单信息总数
	 * @param ordCode
	 * @param startDate
	 * @param endDate
	 * @param opId
	 * @param orgId
	 * @param businessId
	 * @param regionId
	 * @param districtId
	 * @param ordState
	 * @param customerId
	 * @param channelType
	 * @param busiChanceId
	 * @param preorderId
	 * @param billId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	int getUnCompletedOrdCustCount(String ordCode, String startDate, String endDate, String opId, String orgId, String businessId,
								   String regionId, String districtId, String ordState, String customerId, String channelType, String busiChanceId, String preorderId, String billId, String circuitNumber, String CPENumber,
								   String redOrder, String opennetCustId, String fibiaCustId, String spEmailId) throws Exception;

	int getUnCompletedOrdCustCount(String ordCode, String startDate, String endDate, String opId, String orgId, String businessId,
								   String regionId, String districtId, String ordState, String customerId, String channelType, String busiChanceId, String preorderId, String billId, String circuitNumber, String CPENumber,
								   String redOrder, String opennetCustId, String fibiaCustId) throws Exception;

	int getUnCompletedOrdCustCount(String ordCode, String startDate, String endDate, String opId, String orgId, String businessId,
								   String regionId, String districtId, String ordState, String customerId, String channelType, String busiChanceId, String preorderId, String billId, String circuitNumber, String CPENumber,
								   String redOrder, String opennetCustId) throws Exception;

	/**
	 * 获取未竣工订单信息
	 * @param ordCode
	 * @param startDate
	 * @param endDate
	 * @param opId
	 * @param orgId
	 * @param businessId
	 * @param regionId
	 * @param districtId
	 * @param ordState
	 * @param customerId
	 * @param channelType
	 * @param busiChanceId
	 * @param preorderId
	 * @param billId
	 * @param sRowIndex
	 * @param eRowIndex
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	DataContainerInterface[] queryUnCompletedOrdCust(String ordCode, String startDate, String endDate, String opId, String orgId, String businessId, String regionId, String districtId, String ordState,
													 String customerId, String channelType, String busiChanceId, String preorderId, String billId, String circuitNumber, String CPENumber, String redOrder,
													 String opennetCustId, String fibiaCustId, String spEmailId, int sRowIndex, int eRowIndex) throws Exception, RemoteException;

	DataContainerInterface[] queryUnCompletedOrdCust(String ordCode, String startDate, String endDate, String opId, String orgId, String businessId, String regionId, String districtId, String ordState,
													 String customerId, String channelType, String busiChanceId, String preorderId, String billId, String circuitNumber, String CPENumber, String redOrder,
													 String opennetCustId, String fibiaCustId, int sRowIndex, int eRowIndex) throws Exception;
	
	DataContainerInterface[] queryUnCompletedOrdCust(String ordCode, String startDate, String endDate, String opId, String orgId, String businessId, String regionId, String districtId, String ordState,
													 String customerId, String channelType, String busiChanceId, String preorderId, String billId, String circuitNumber, String CPENumber, String redOrder,
													 String opennetCustId, int sRowIndex, int eRowIndex) throws Exception;
	
	
	/**
	 * 查询task
	 * @param workflowId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
//	public abstract IBOVmTaskValue[] queryVmTask(String workflowId) throws Exception, RemoteException;
	
	/**
	 * 创建task树
	 * @param workflowId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public VmTaskValueBean[] createVmTaskTree(String workflowId) throws Exception, RemoteException;
	
	/**
	 * 处理SFF回复给CRM的反馈信息
	 * @date 2014-9-12
	 * @param custOrderId
	 * @param taskId
	 * @param intfId
	 * @param operType
	 * @param regionId
	 * @param ossRtnXml
	 * @throws Exception
	 * @author PangYong
	 */
	public void processOrderResponse(long custOrderId, String taskId,
			String intfId, long operType, String regionId, String ossRtnXml) throws Exception;
	
	/**
	* @deprecated (需要改造的CRM接收SFF消息处理方法，暂时未实现，不可使用)
	*/
	@Deprecated
	public void processRecvFromSffResponse(long custOrderId, String taskId,
			String orderKind, long operType, String regionId, String ossRtnXml) throws Exception;
	
	public String queryServInfo(String sCrmOderId, String sBillId, String sRegionCode) throws Exception;
	
	public String checkOrderValidate(String xmlStr, String sRegionCode) throws Exception;
	
	/**
	 * 根据zipCode获取municipalCode
	 * @param zipCode
	 * @param throwWhenNoDataFound
	 * @return
	 * @throws Exception
	 */
	public String getMunicipalCodeByZipCode(String zipCode, boolean throwWhenNoDataFound) throws Exception;
	
	/**
	 * 更新扩展表中安装日期
	 * @param customerOrderId
	 * @param chgVisitTimeMap
	 * @param regionId
	 * @throws RemoteException
	 * @throws Exception
	 */
	public boolean updateCustExs4OnlineDate(long customerOrderId, Map chgVisitTimeMap,ModifyOnlineDateInfoVo vo) throws RemoteException, Exception;
	/**
	 * 根据dc增加资费订单，若是已存在则覆盖存在的费用 否则新增
	 * @param customerOrderId
	 * @param regionId
	 * @throws RemoteException
	 * @throws Exception
	 */
	public void saveOrdBusiPrice(DataContainerInterface[] dc , long custOrderId) throws RemoteException, Exception;
	/**
	 * 获取安装日期
	 * @param businessId
	 * @param actCode
	 * @return
	 * @throws Exception
	 */
	public String getOnlineDate(long businessId,String actCode) throws Exception;
	
	public IOrdCustValue getOrdCustByCustOrderId(long custOrderId) throws Exception;
	
	public IBOBsStaticDataValue[] getBsStaticData(String codeType, String codeValue) throws Exception;
	public Map getCompletenessCodes(long customerOrderId,long userId,String completenessType) throws RemoteException, Exception;
	public void setCustomerExt(ISoOrderData saveData,String attrCode,String attrValue)throws Exception, RemoteException;
	public String checkPreVHandleType(ISoOrderData saveData,String exceptionCode,String exceptionMsg,long rejectNumber)throws Exception, RemoteException;
	public String getPlaceHandleType(String exceptionCode,long customerOrderId,long userId,IOVOrderCustomer oVOrderCustomer)throws Exception, RemoteException;
	
	/**
	 * 对当前CO的Technologies进行过滤和排序
	 * @author fangjie
	 * @param co
	 * @param offerId
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 */
	public CoInfo filterSortTechnologies(CoInfo co, long offerId,String actCode,String lockedSpeed) throws RemoteException, Exception;
	
	public long getAgreementId(long customerOrderId) throws Exception,RemoteException;
	public String getVisitService(long customerOrderId) throws Exception,RemoteException;
	public String getOnlineDate(long customerOrderId) throws Exception,RemoteException;
	public String getDeliveryDate(long customerOrderId,boolean isRemove)  throws Exception,RemoteException;
	public String getNewCustType(long customerOrderId)  throws Exception,RemoteException;
	public long getNewCustId(long customerOrderId)  throws Exception,RemoteException;
	/**
	 * 检查CPE库存
	 * @author gexy
	 * @param offerId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public boolean checkSotck(long offerId,boolean isInShop, long orgId)  throws Exception,RemoteException;
	/**
	 * 固网业务数据沉淀处理[ORD_SPECIAL_DEAL]
	 * @date 2014-9-21
	 * @param oVOrderCustomer
	 * @throws Exception
	 * @throws RemoteException
	 * @author PangYong
	 */
	public void depositeSpecial(IOVOrderCustomer oVOrderCustomer) throws Exception, RemoteException;
	/**
	 * 数据沉淀
	 * @date 2014-9-25
	 * @param ordCust
	 * @param ordOffer
	 * @param configId
	 * @throws Exception
	 * @author PangYong
	 */
	public void saveOrdSpecialDealValue(IOrdCustValue ordCust, IOrdOfferValue ordOffer, int configId) throws Exception;
	
	
	/**
	 * 查询开户订单
	 * @param map
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Long qryNewConnectionOrder(Map map) throws Exception, RemoteException;
	
	/**
	 * 查询历史订单
	 * @param map
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Long qryCompletedOrder(Map map) throws Exception, RemoteException;
	
	/**
	 * 查询当前订单
	 * @param map
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Long qryCurrentOrder(Map map) throws Exception, RemoteException;
	
	/**
	 * 更新订单扩展表Ord_Cust_Ext表属性, 当不存在时新增
	 * @param customerOrderId
	 * @param regionId
	 * @param dataMap
	 * @throws Exception
	 * @author GeXY
	 */
	public void saveOrdCustExt(long customerOrderId,String regionId , Map<String,String> dataMap) throws Exception;
	
	/**
	 * 查询SoBusiPrice
	 * @param map
	 * @throws RemoteException
	 * @throws Exception
	 */
	public OrdBusiPriceBean[] qrySoBusiPrcie(Map map) throws RemoteException, Exception;
	
	/**
	 * 查询SoBusiPrice
	 * @param map
	 * @throws RemoteException
	 * @throws Exception
	 */
	public OrdBusiPriceBean[] qrySoBusiPrcieCurrentMonth(Map map) throws RemoteException, Exception;
	
	/**
	 * 
	 * @param userId
	 * @param offerInstId
	 * @param returnInfo
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date: 2014-10-10
	 */
	public boolean isNeedReturnCpe(long userId,long offerInstId,long offerId,String returnInfo)throws RemoteException, Exception;
	/**
	 * 
	 * @param userId
	 * @param offerInstId
	 * @param returnInfo
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date: 2014-10-10
	 */
	public String cpeReturnAccept(long userId,long offerInstId,String returnInfo)throws RemoteException, Exception;
	/**
	 * 
	 * @param businessId
	 * @param userId
	 * @param billId
	 * @param opBillId
	 * @param preCustomerOrderId
	 * @param returnInfo
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date: 2014-10-10
	 */
	public long createOrderCust(long businessId,long userId,String billId,String opBillId,long preCustomerOrderId,String returnInfo)throws RemoteException, Exception;
	/**
	 * 
	 * @param userId
	 * @param billId
	 * @param cpeOfferInstId
	 * @param cpeSn
	 * @param newState
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date: 2014-10-10
	 */
	public void cpeManage(long userId,String billId,long cpeOfferInstId,String cpeSn,String newState,String penaltyFlag)throws RemoteException, Exception;
	/**
	 * cpe返回
	 * @param userId
	 * @param billId
	 * @param cpeOfferInstId
	 * @param cpeSn
	 * @param returnInfo
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date: 2014-10-10
	 */
	public void cpeReturn(long userId,String billId,long cpeOfferInstId,String cpeSn,String returnInfo)throws RemoteException, Exception;
	/**
	 * 保存产品、服务、服务属性订单
	 * @author fangjie
	 * @param ordOffOrdUserValue
	 * @param productId
	 * @param attrMap
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IOrdProdOrdSrvValue[] createProdOrder(IOVOrderServicePkg ovOrdProd, IOrdOffOrdUserValue ordOffOrdUserValue, OrderValueChain ovc, long productId, Map attrMap, boolean saveAttrOnly, Map map) throws Exception, RemoteException;
	
	/**
	 * 根据userId查询路由器列表
	 * @param userId
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 */
	public DataContainer[] qryCPEListByUserId(long userId,String cpeSn) throws RemoteException, Exception;
	public DataContainer[] qryCPEListByUserId(long userId) throws RemoteException, Exception;
	/**
	 * TDC端拆机发起入口
	 * @author fangjie
	 * @param paramMap
	 * @return customerOrderId
	 * @throws RemoteException
	 * @throws Exception
	 */
	public long terminationByTdc(Map paramMap) throws RemoteException, Exception;
	
	
	/**
	 * NP端发起入口，做退订VOIP
	 * @param voipNum
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 */
	public long terminationByPortout(String voipNum, long customerOrderId) throws RemoteException, Exception;
	
	/**
	 * 接口过来的拆机，做退订VOIP或者DSL
	 * @param paramMap
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 */
	public long terminationByInterface(Map paramMap, String terminationReason) throws RemoteException, Exception;
	public boolean isVoipPortOutOrder(long customerOrderId) throws RemoteException, Exception;
	/**
	 * VOIP 语音提示功能到期销户
	 * 
	 * @date 2014-10-14
	 * @param userId
	 * @throws Exception
	 * @author PangYong
	 */
	public void terminationEstablishReferral(long userId) throws Exception;
	/**
	 * 创建TT
	 * @param TicketType
	 * @param srcCode
	 * @param content
	 * @param opId
	 * @param orderId
	 * @param workId
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date: 2014-10-16
	 */
	public void createTroubleTicket(String ttCode,String content,String eocMsgId,String opId,String custId,String billId,String orderId,String workId) throws RemoteException, Exception;

	public void createSuspendTroubleTicket(String ttCode,String content,String eocMsgId,String opId,String custId,String billId,String orderId,String workId,Timestamp resumeTime,long state) throws RemoteException, Exception;
	/**
	 * 查询TT
	 * @param customerOrderId
	 * @param taskId
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date: 2014-10-16
	 */
	public DataContainerInterface[] qryTroubleTicket(long customerOrderId,String taskId,String custId,String billId) throws RemoteException, Exception;
	/**
	 * 查询TT
	 * @param customerOrderId
	 * @param taskId
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date: 2014-10-16
	 */
	public DataContainerInterface[] qryTroubleTicket(long customerOrderId,String taskId) throws RemoteException, Exception;
	/**
	 * 查询TT
	 * @param custId
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date: 2014-10-16
	 */
	public DataContainerInterface[] qryTroubleTicket(long custId) throws RemoteException, Exception;
	/**
	 * 查询TT
	 * @param billId
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhangyong12
	 * @date: 2014-10-16
	 */
	public DataContainerInterface[] qryTroubleTicket(String billId) throws RemoteException, Exception;
	/**
	 * 更新服务属性实例
	 * 
	 * @date 2014-10-16
	 * @param billId
	 * @param dataMap
	 * @throws Exception
	 * @author PangYong
	 */
	public void updateInsSrvAttr(String billId, Map<Long, String> dataMap) throws Exception;

	/**
	 * 更新服务属性实例
	 * 
	 * @date 2014-10-16
	 * @param userId
	 * @param dataMap
	 * @throws Exception
	 * @author PangYong
	 */
	public void updateInsSrvAttr(long userId, Map<Long, String> dataMap) throws Exception;
	
	/**
	 * 处理Global IP+业务属性
	 * @date 2014-10-16
	 * @param oVOrderCustomer
	 * @throws Exception
	 * @author PangYong
	 */
	public void updateGlobalIpPlus(IOVOrderCustomer oVOrderCustomer) throws Exception;
	
	/**
	 * 从ORD_CUST_EXT表中获取TASK_ID_NEW的value值
	 * @date 2014-10-22
	 * @param customerOrderId
	 * @throws Exception
	 * @author liaocx
	 */
	public String getTaskIdNew(long customerOrderId) throws Exception,RemoteException;
	
	/**
	 * 对PlaceOrder收到的SFF回复进行处理
	 * 
	 * @date 2014-10-22
	 * @param customerOrderId
	 * @param operType
	 * @param intfCtrlId
	 * @param regionId
	 * @param rtn
	 * @throws Exception
	 * @author PangYong
	 */
	public void placeOrderProcess(long customerOrderId, long operType, long intfCtrlId, String regionId, Map rtn) throws Exception;
	
	/**
	 * TDC发起的DSL销户[DSL Port out]
	 * @date 2014-9-28
	 * @param customerOrderId=0
	 * @param billId
	 * @param rtn
	 * @return customerOrderId
	 * @throws Exception
	 * @author PangYong
	 */
	public long xDSLProcess(long operType, IInsUserValue insUser, Map rtn) throws Exception;
	
	public void updateInsUserExt(String billId, Map<Long,String> dataMap) throws Exception;
	
	public void updateInsUserExt(long userId, Map<Long,String> dataMap) throws Exception;
	
	public void updateOrderEffectDate(long customerOrderId, String completeDate) throws Exception;
	
	/** 
	* @Function: qryCPEListByConditon 
	* @Description: 退订CPE查询
	* @param
	* @return DataContainer[]
	* @throws 异常描述
	* @author lufm3
	* @date Oct 27, 2014 7:34:46 PM 
	*/ 
	public DataContainer[] qryCPEListByConditon(String billId,String prodInstId, String regionId) throws RemoteException, Exception;
	
	/**
	 * 预销户号码查询
	 * @date 2014-10-22
	 * @param 
	 * @throws Exception
	 * @author liaocx
	 */
	public DataContainer[] qryPreTerminationNumListByCustId(String custId) throws RemoteException, Exception;
	
	/**
	 * 从ord_dtl_info表中查询接口报文 
	 * @date 2014-11-07
	 * @param 
	 * @throws Exception
	 * @author liaocx
	 */
	public DataContainerInterface getDataXMlFromOrdDtlInfo(long customerOrderId)throws Exception,RemoteException;
	
	/**
	 * 从ord_dtl_info_f表中查询接口报文 
	 * @date 2014-11-07
	 * @param 
	 * @throws Exception
	 * @author liaocx
	 */
	public DataContainerInterface getDataXMlFromOrdDtlInfoFinished(long customerOrderId,String createDate)throws Exception,RemoteException;
	
	/**
	 * 查询ordx_intf_control表数据
	 * @date 2014-11-07
	 * @param 
	 * @throws Exception
	 * @author liaocx
	 */
	public IBOOrdxIntfControlValue[] getOrdxIntfCtrl(String customerOrderId, String custId, String billId,String intfType, String state) throws RemoteException, Exception;
	
	/**
	 * 从ordx_intf_content表中查询接口报文 
	 * @date 2014-11-07
	 * @param 
	 * @throws Exception
	 * @author liaocx
	 */
	public DataContainerInterface getDataXMlFromOrdxIntfContent(String ctrlId,String contentType, String contentId) throws Exception,RemoteException;
	
	/**
	 * 查询pstn号码
	 * @param customerOrderId 订单ID
	 * @param userId   
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public String getIntrinsicPSTN(long customerOrderId, long userId)throws Exception,RemoteException;
	
	public void changeTeckParams(String billId, String paramCode, String paramValue) throws RemoteException, Exception;
	
	public void sendSffForOpenStop(IOrdUserValue ordUser, boolean isStop, String operReason) throws Exception ;
	
	public void sendSffForOpenStop(long custmerOrdId,String taskId,IOrdUserValue ordUser, boolean isStop, String operReason) throws Exception ;
	/**
	 * 校验日期是否合法
	 * @param onlinedate 
	 * @param limitDate   
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public ISoRuleReturnData valiDate(String onlinedate,String limitDate) throws Exception;
	/**
	 * 获取订单日期
	 * @param customerOrderId 
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Date getDate(long customerOrderId) throws Exception;
	/**
	 * 获取失效时期
	 * @param customerOrderId
	 * @return
	 */
	public String getOfflineDate(long customerOrderId) throws Exception;
	/**
	 * 获取Manual信息
	 * @param customerOrderId
	 * @param userId
	 * @return
	 */
	public String getIntrinsicManualOrder(long customerOrderId, long userId)throws Exception,RemoteException;
	/**
	 * 根据用户ID获取协议期
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public DataContainer[] getInsCommitmentByUserId(long userId) throws Exception;
	
	/**
	 * 根据客户订单获取费用信息
	 * @param customerOrderId
	 * @return
	 * @throws Exception
	 */
	public DataContainer[] getOrdBusiPrice(long customerOrderId) throws Exception;
	
	/**
	 * 改voip_num 以及 号码类型
	 * @param customerOrderId
	 * @param billId
	 * @param selectNumberType
	 * @throws Exception
	 */
	public void changeVoIPNum(long customerOrderId, String billId, String selectNumberType) throws Exception;
	
	/**
	 * 获取VOIP号码
	 * @param customerOrderId
	 * @param userId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public String getVOIPNumberByCustomerOrderId(long customerOrderId,long userId)throws Exception,RemoteException;
	 
	/**
	 * 查询人工回单任务
	 * @param customerOrderId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public DataContainer[] queryCurrenManualtTaskByCustomerOrderId(long customerOrderId) throws Exception,RemoteException;
	
	/**
	 * 根据节点查询人工任务节点可回单的结果
	 * @param customerOrderId
	 * @param taskTag
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IBOBsStaticDataValue[] queryUserReplyResults(long customerOrderId,String taskTag) throws Exception,RemoteException;
	
	/**
	 * 人工任务回单
	 * @param taskId
	 * @param result
	 * @param reason
	 * @param workflowId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void finishUserTask(String taskId,String result,String reason,String workflowId) throws Exception,RemoteException;
	
	/**
	 * 获取actCode
	 * @param customerOrderId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public String getActCode(long customerOrderId) throws Exception,RemoteException;
	/**
	 * @param customerOrderId
	 * @return
	 */
	public IOrdCustExtValue[] getOrderCustExts(long customerOrderId) throws Exception ;
	
	public IOrdSrvAttrValue[] getOrderSrvAttrs(long customerOrderId,long userId,long attrId)throws RemoteException, Exception;
	/**
	 * @param customerOrderId
	 * @param userId
	 * @param changeType
	 * @return
	 */
	public String getOrdCustExtValue(long customerOrderId, long userId,String changeType) throws Exception;
	/**
	 * @param customerOrderId
	 * @param userId
	 * @param soSrvAttrPhonebookStatus
	 * @return
	 */
	public String getPhoneBookStatus(long customerOrderId, long userId,
			long soSrvAttrPhonebookStatus) throws Exception;
	
	
	public void addOrdProcessStatusBatch(long customerOrderId, long userId) throws Exception;
	
	public void updateOrdProcessStatus(long customerOrderId, String processType, String processCode, String status) throws Exception;
	
	public boolean isDisplayOrderProgress(long customerOrderId,boolean isFinished,String regionId,String createDate)throws RemoteException, Exception;

	
	/**
	 * Des: 批量发送地址校验
	 * @param List<Map> addressList  批量地址信息
	 * @return
	 */
	public List<Map> preQCheckAddress(List<Map> addressList,String regionId) throws Exception;
	
	/**
	 * Des:获取结果信息
	 * @param List<Map> addressList  批量地址信息
	 * @return
	 */
	public List<Map> getPreQResult(List<Map> addressList,String regionId)throws Exception;
	
	/**
	 * 判断是否是发货流程
	 * @date 2015-1-22
	 * @param customerOrderId
	 * @param userId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author PangYong
	 */
	public boolean isDelivery(long customerOrderId, String documentType) throws Exception, RemoteException;
	
	public void updateInsSrvAttr4ResetIP(long customerOrderId,Map<Long, String> dataMap)throws RemoteException, Exception;
	
	/**
	 * 判断是否换速率
	 * @param iOrdCustValue
	 * @param customerOrderId
	 * @param isFinished
	 * @param regionId
	 * @param createDate
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public long isChgLineSpeed4OrderProcess(IOrdCustValue iOrdCustValue,long customerOrderId,boolean isFinished, String regionId, String createDate) throws Exception, RemoteException;

	/**
	 * 获取Municipality Value
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public DataContainer[] getMunicipalityValue(String code,String name,int startIndex,int endIndex) throws Exception, RemoteException; 
	
	public int getMunicipalityCount(String code,String name) throws Exception, RemoteException; 
	
	  /** 
	* @Function: getUserExtValue 
	* @Description: 
	* @param
	* @return String
	* @throws 异常描述
	* @author lufm3
	* @date Mar 23, 2015 6:13:25 PM 
	*/ 
	public  String getUserExtValue(long customerOrderId,long userId,long attrId) throws Exception,RemoteException;
	
    /** 
    * @Function: getCustExtValue 
    * @Description: TODO
    * @param
    * @return String
    * @throws 异常描述
    * @author lufm3
    * @date Mar 26, 2015 2:49:17 PM 
    */ 
    public  String getCustExtValue(long customerOrderId,long userId,String attrId) throws Exception,RemoteException;

	public void receiveConfrim(long customerOrderId, long userId, Map confirmMap) throws Exception,RemoteException;
	
	/**
	 * GlobalIp+业务，更新IP实例属性
	 * @param oVOrderCustomer
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void updateInsSrvAttr4GlobalIpPlus(IOVOrderCustomer oVOrderCustomer) throws Exception, RemoteException;
	
	/**
	 * 获取Delivery 权限
	 * @param oVOrderCustomer
	 * @throws Exception
	 * @throws RemoteException
	 */
	public boolean deliverySec() throws Exception, RemoteException;
	
	/**
	 * 获取Delivery 权限
	 * @param oVOrderCustomer
	 * @throws Exception
	 * @throws RemoteException
	 */
	public boolean circuitNoSec() throws Exception, RemoteException;
	
	/**
	 * 获取选择CO信息
	 * @param customerOrderId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public String getSurveyCOInfo(long customerOrderId) throws Exception, RemoteException;
	
	/**
	 * 获取预销户默认失效日期（不收罚金那天）
	 * @param map
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Timestamp getDefalutOfflineDate(Map map) throws Exception, RemoteException;
	
	/**
	 * 创建circuit number
	 * @param map
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void createOrdSrvValue(long attrKey, IOrdSrvAttrValue iOrdSrvAttrValue,Map<Long,String> dataMap,long customerOrderId) throws Exception , RemoteException;
	
	public String getEkslMoms(long customerOrderId,long userId,IOVOrderCustomer oVOrderCustomer,Map map) throws RemoteException, Exception;
	
	public String getKr(long customerOrderId,long userId,IOVOrderCustomer oVOrderCustomer,Map map) throws RemoteException, Exception;
	
	public String getPushCFeeStr(String fee,long customerOrderId,long userId,IOVOrderCustomer oVOrderCustomer,Map map) throws RemoteException, Exception;
	
	public Map getPushCParams(long customerOrderId,long userId,String eventCode,Map map) throws RemoteException, Exception;
	
	public IOrdSrvAttrValue[] getOrderSrvAttrsNew(long customerOrderId,long userId,long attrId)throws RemoteException, Exception ;
	
	/**
	 * 获取TimeSlot
	 * @param customerOrderId
	 * @param userId
	 * @param changeType
	 * @param changeReason
	 * @param mandatory
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 */
	public ResultInfo getTimeslotTime(long customerOrderId, long userId,String changeType,String changeReason,boolean mandatory) throws RemoteException, Exception;
	
	/**
	 * 
	 * @Function: IFixedLineSV::getShowToTocSec
	 * @Description: 获取固网销户页面，toToc是否显示的权限
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @version: v1.0.0
	 * @author: huanglun
	 * @date: 2015年7月10日 上午9:56:24 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *-------------------------------------------------------------
	 */
	public boolean getShowToTocSec() throws Exception, RemoteException;

	/**
	 * 
	 * @Function: IFixedLineSV::getPhoneBookFlag
	 * @Description: 获取固网销户页面，toToc是否显示的权限
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @version: v1.0.0
	 * @author: Joker Zhao
	 * @date: 2015年8月10日 上午9:56:24 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *-------------------------------------------------------------
	 */
	public Map getPhoneBookFlag(long offerId) throws RemoteException, Exception;

	
	/**
	 * 查询xdsl信息
	 * @param customerOrderId
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 */
	public Map getXDSLInfo(String customerOrderId) throws RemoteException, Exception;

	/**
	 * 查询sbbu xdsl信息，抽取公共方法
	 * @param customerOrderId
	 * @return
	 * @throws Exception
	 */
	Map getSbbuXdslInfo(long customerOrderId, Map<String, String> resultMap) throws Exception;
	
	/**
	 * 
	 * @param userId
	 * @return
	 * @throws Exception
	 * @author: chenzg
	 */
	public IOrdCustValue getOrdCustByUserId(long userId) throws Exception;

	public IOrdCustValue[] getOrdCustByCondition(String condition,HashMap map) throws Exception;

	public void dealZombieOrder(Long customerOrderId) throws Exception;
	
	/**
	 * 获取cpeManage的客户订单
	 * @param userId
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 */
	public IOrdCustValue[] getOrdCustValuesByUserId(long userId) throws RemoteException, Exception;
	
	/** 
	* @Function: deliveryResponse4Batch 
	* @Description: TODO
	* @param
	* @return void
	* @throws 异常描述
	* @author lufm3
	* @date Mar 9, 2016 1:50:32 PM 
	*/ 
	public void deliveryResponse4Batch(long customerOrderId,String regionId,Map map)throws RemoteException, Exception;
	
	/** 
	* @Function: saveOrderSrvAttr4Batch 
	* @Description: TODO
	* @param
	* @return void
	* @throws 异常描述
	* @author lufm3
	* @date Mar 13, 2016 2:14:28 PM 
	*/ 
	public void saveOrderSrvAttr4Batch(long customerOrderId,long userId,long attrId,long byAttrId,String attrValue,String attrText,IOrdCustValue ordCustValue)throws RemoteException, Exception;

	public void dealNewNumberAndOldNumber(long customerOrderId,long userId,String randomBillId) throws RemoteException, Exception;
	public void updateReturnSchedule(long customerOrderId) throws RemoteException, Exception;
	
	public CoInfo filterSortTechnologiesForDM002(CoInfo co, long offerId,String lockedSpeed,String techType,String maxDownloadSpeed,String maxUpSpeed) throws RemoteException, Exception;
	
	public ResultInfo isChangeOngoingOrder4SFF(long customerOrderId, long userId,String changeType,String changeReason) throws RemoteException, Exception;
	public ResultInfo isDeliveryRequest(long customerOrderId, long userId) throws RemoteException, Exception;
	public void updateOrdSrvAttr(long customerOrderId, Map<Long,String> dataMap) throws Exception;
	public IOrdCustExtValue[] getOrderCustExtValues(String sql,Map map)throws RemoteException, Exception;
	
	public void saveOrdCustExtValues(IOrdCustExtValue aCustOrdExt)throws RemoteException, Exception;
	
	public DataContainer[] qryHardwareListByConditon(String billId,String prodInstId,String offerType, String regionId) throws RemoteException, Exception;
	
	public String getSrvAttrByOfferIdandAttrId(long offerId,long attrId)throws RemoteException, Exception;
	public void updateOrdUserExt(long customerOrderId, Map<Long,String> dataMap) throws Exception;
	
	public Map getUserInfo(String circuitNo) throws RemoteException, Exception;
	
	public long dealCancelOngoingOrder4Regret(long customerOrderId, long userId,String cancelType,String cancelReason, boolean mandatory) throws RemoteException, Exception;
	
	public void saveOrdProcessStatus(long customerOrderId, String processType, String processCode, String processStatus,long businessId) throws Exception;
	public void updateTimerRuntime(String workflowId, String paraName, String timerCode, String strRuntime) throws Exception ;
	public void updateVmTaskDeliveryDate(String workFlowId,String completeDate)throws Exception, RemoteException;
	public long createOrderCust(long businessId,long userId,String billId,String opBillId,long preCustomerOrderId,ArrayList alist)throws RemoteException, Exception;
	
	//public boolean canModifyOfflineDate(long customerOrderId) throws Exception ;
	public OrdSubmmitResultVo submitOrder(BaseOrderVo orderVo) throws Exception;
	public OrderOperationInitVo initOrderOperation(long orderId) throws Exception ;
	public String getModifyItem(long customerOrderId)throws Exception;
	public IBOOrdxIntfControlValue[] getOrdxIntfCtrl(String orderId, String customerOrderId, String custId, String billId,String intfId,String intfType, String state) throws RemoteException, Exception;
	public String createTroubleTicket(String ttCode,String opId,String orderId,String billId,String custId,Map<String, Object> map ) throws RemoteException, Exception;
	/**
	 * 改单时，是否可以选OpenNet的ADDON offer
	 * @param mainOfferId
	 * @param customerOrderId
	 * @return
	 * @throws Exception
	 */
	public String canChooseADDON(long mainOfferId,long customerOrderId) throws Exception ;
	
	/**
	 * 改单时，如果新mainOffer与在途单同IO，那么要加载出在途单的ADDON
	 * @param mainOfferId
	 * @param customerOrderId
	 * @return
	 * @throws Exception
	 */
	public List<Map<String,String>> getOngoingADDON(long mainOfferId,long customerOrderId) throws Exception ;
	/**
	 * 实例、在途单、新单的IO相同的情况下，判断一下改单的场景<br>
	 * 1.新单内容与实例内容完全一样。只需要cancel在途的basket<br>
	 * 2.新单内容与实例内容完全不一样。只需要新单与在途单做change option<br>
	 * 3.新单速率与实例速率一样，但是SLA不一样，且新单速率与在途单速率也一样。只需要新单与在途单做change option<br>
	 * 4.新单速率与实例速率一样，但是SLA不一样，且新单速率与在途单速率不一样。先cancel在途的basket，再新单与实例change option<br>
	 * 5.新单速率与实例速率不一样，但是SLA一样，且新单SLA与在途单SLA一样。只需要新单与在途单做change option<br>
	 * 6.新单速率与实例速率不一样，但是SLA一样，且新单SLA与在途单SLA不一样。先cancel在途的basket，再新单与实例change option<br>
	 * 
	 * @param userId
	 * @param newOfferId
	 * @param newAddons
	 * @return
	 * @throws Exception
	 */
	public int judgeModifyScenorio(long userId, long ongoingOrderId, long newOfferId,List<Long> newAddons,List<Long> removeAddons,boolean addonOnly) throws Exception;
	public IOrdCustValue[] getOrdCustValuesByUserId(long userId,long businessId) throws RemoteException, Exception;
	public IOrdCustExtValue getOrderCustExtValue(long customerOrderId,String attrCode,String attrVal)throws RemoteException, Exception;
	public void saveOrdProcessStatus(long customerOrderId, String processType, String processCode, String processStatus,long businessId,Timestamp createDate) throws Exception ;
	
	/**
	 * 
	 * @param cpeSerialNumber
	 * @return
	 * @throws Exception
	 */
	public Map getHardwareInfo(String cpeSerialNumber)throws Exception ;
	/**
	 * 
	 * @param cpeSerialNumber
	 * @return
	 * @throws Exception
	 */
	public Map confirmHardwareReturn(String cpeSerialNumber)throws Exception ;
	
	public  void delOldOrdExtDate(long customerOrderId, Set<String> set) throws RemoteException, Exception;
	
	public String getTaskDeliveryDate(long customerOrderId)throws Exception, RemoteException;
	
	public  void saveOrdCustExt(long customerOrderId,Map<String,Object> dataMap) throws Exception;

	public void clearTechRemark(long customerOrderId, long userId) throws RemoteException, Exception;
	public void createPoaInfo(ActVo vo,IOrdCustValue iOrdCustValue) throws Exception;
	public  String formatAddress(String addressId, Address addresVo) throws Exception ;
	public OrdSubmmitResultVo createOrderBySBBU(long customerId) throws RemoteException, Exception;
	public String getIO(BaseOrderVo orderVo) throws RemoteException, Exception;
	public  IOrdSrvAttrValue[] getOrderSrvAttrs(long customerOrderId,long userId) throws Exception,RemoteException;
	public  IOrdSrvAttrValue[] getFinishOrderSrvAttrs(long customerOrderId,String yearMonth) throws Exception,RemoteException;
	}
