package com.asiainfo.crm.so.teaminvoke.out.service.interfaces;

import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.web.DataContainerList;
import com.ai.bce.ivalues.IBceDealReturnData;
import com.ai.bce.ivalues.IBceRuleReturnData;
//import com.ai.comframe.client.WorkflowInfo;
import com.ai.omframe.instance.bo.InsOffInsUserBean;
import com.ai.omframe.instance.ivalues.IInsAccrelValue;
import com.ai.omframe.instance.ivalues.IInsCommitmentValue;
import com.ai.omframe.instance.ivalues.IInsOffInsUserValue;
import com.ai.omframe.instance.ivalues.IInsOfferValue;
import com.ai.omframe.instance.ivalues.IInsProdInsSrvValue;
import com.ai.omframe.instance.ivalues.IInsProdValue;
import com.ai.omframe.instance.ivalues.IInsSrvAttrValue;
import com.ai.omframe.instance.ivalues.IInsUserOsStateValue;
import com.ai.omframe.instance.ivalues.IInsUserValue;
import com.ai.omframe.instance.ivalues.IQryUserInfoByCustIdValue;
import com.ai.omframe.order.data.ivalues.ISoAttrData;
import com.ai.omframe.order.data.ivalues.ISoOrderData;
import com.ai.omframe.order.data.ivalues.ISoServicePkgData;
import com.ai.omframe.order.data.valuebean.SoBusiPriceData;
import com.ai.omframe.order.ivalues.IBOSoBusiLogQueryValue;
import com.ai.omframe.order.ivalues.IOrdBusiPriceValue;
import com.ai.omframe.order.ivalues.IOrdCustValue;
import com.ai.omframe.order.ui.ivalues.ISoRuleData;
import com.ai.omframe.web.obj.submitobj.ivalues.ISoOfferObj;
import com.ai.omframe.web.obj.submitobj.ivalues.ISoSubmitObj;
import com.ai.pce.exception.PceException;
import com.ai.pce.ivalues.ICatalogValue;
import com.ai.pce.ivalues.IEffExpInfoBean;
import com.ai.pce.ivalues.IOfferIncludeOfferValue;
import com.ai.pce.ivalues.IOfferValue;
import com.ai.pce.ivalues.ISpServiceValue;
import com.ai.pce.ivalues.IUpItemFeatureValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.so.batchOrd.ivalues.IBOOrdBatSingleOrderValue;
import com.asiainfo.crm.so.common.bo.BOInsUserCustInfoBean;
import com.asiainfo.crm.so.common.bo.BOOrdxUserPayInfoBean;
import com.asiainfo.crm.so.common.ivalues.IBOInsAccrelValue;
import com.asiainfo.crm.so.common.ivalues.IBOInsxUserMonitorDtlValue;
import com.asiainfo.crm.so.common.ivalues.IBOTmBillCycleQueryValue;
import com.asiainfo.crm.so.common.ivalues.IBOUserInfoValue;
import com.asiainfo.crm.so.common.party.bo.BOInsxPreBusiBean;
import com.asiainfo.crm.so.common.party.bo.BOInsxPreBusiParamBean;
import com.asiainfo.crm.so.common.party.bo.BORcmdServiceBean;
import com.asiainfo.crm.so.common.party.ivalues.IBOINSBillCustomerValue;
import com.asiainfo.crm.so.common.party.ivalues.IBOInsSrvAttrIdxValue;
import com.asiainfo.crm.so.common.party.ivalues.IBOInsxFamlyPackActiveValue;
import com.asiainfo.crm.so.common.party.ivalues.IBOInsxPreBusiParamValue;
import com.asiainfo.crm.so.common.party.ivalues.IBOInsxUserAddressValue;
import com.asiainfo.crm.so.common.party.ivalues.IBOInsxUserInsuranceValue;
import com.asiainfo.crm.so.common.party.ivalues.IBOSoUserAssureValue;
import com.asiainfo.crm.so.exe.ws.oss.WorkTimeslot;
import com.asiainfo.crm.so.instance.rboss.bo.BOInsxUserBakSimBean;
import com.asiainfo.crm.so.instance.rboss.ivalues.IBOInsxTemporaryOpenValue;
import com.asiainfo.crm.so.order.common.dto.PagerDataVo;
import com.asiainfo.crm.so.order.fixedline.dto.PreQResultVo;
import com.asiainfo.crm.so.order.fixedline.dto.PreSubmitOrderVo;
import com.asiainfo.crm.so.order.fixedline.dto.ValidateAddressVo;
import com.asiainfo.crm.so.order.fixedline.dto.VisitServiceQryVo;
import com.asiainfo.crm.so.order.productOffering.dto.ProductOfferingFeeVo;
import com.asiainfo.crm.so.order.productOffering.dto.ProductOfferingVo;
import com.asiainfo.crm.so.order.productOffering.dto.condition.OfferOrderConditionVo;
import com.asiainfo.crm.so.order.productOffering.dto.condition.OrderOfferFeeVo;
import com.asiainfo.crm.so.order.productOffering.dto.condition.QueryBroadbandOfferConditionVo;
import com.asiainfo.crm.so.order.productOffering.dto.condition.QueryOTCVo;
import com.asiainfo.crm.so.order.rboss.bo.SoOfferExe;
import com.asiainfo.crm.so.order.rboss.ivalues.IBOOrdPortinPoaValue;
import com.asiainfo.crm.so.order.rboss.ivalues.IBOQOrdCustValue;
import com.asiainfo.crm.so.order.rboss.ivalues.IOpenOrderExe;
import com.asiainfo.crm.so.osebatch.bo.BOSoShopCartBean;
import com.asiainfo.crm.so.query.ivalues.IQAcctRelInfoValue;
import com.asiainfo.crm.so.query.ivalues.IQUserBaseInfoValue;
import com.asiainfo.crm.so.query.ivalues.IQUserOfferInfoValue;
import com.asiainfo.crm.so.query.ivalues.IQUserRelInfoValue;
import com.asiainfo.crm.so.query.ivalues.ISoOrderAttrTableValue;
import com.asiainfo.crm.so.teaminvoke.in.service.oss.dto.DayWorkScheduleDTO;
import com.asiainfo.crm.so.teaminvoke.in.service.oss.dto.PreSubmitResultDTO;
import com.asiainfo.crm.so.teaminvoke.out.service.bean.BackOrderInfo;
import com.asiainfo.crm.so.teaminvoke.out.service.bean.CrmOrderInfo;
import com.asiainfo.crm.so.teaminvoke.out.service.bean.DepositRtnReq;

/**   
* Copyright: Copyright (c) 2014 Asiainfo-Linkage
* 
* @ClassName: ICrmFSV.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: yaojx
* @date: Aug 20, 2014 4:19:24 PM 
* 
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 20, 2014     yaojx           v1.0.0               修改原因
*/
public interface ICrmFSV {
    /**
     * 根据用户编号,属性编号查询服务实例的详细信息
     *
     * @param userId
     * @param attrId              attrId -1 全部 >0 指定属性
     * @param regionId            跨中心用
     * @return IInsSrvAttrValue[]
     * @throws Exception
     */
    public IInsSrvAttrValue[] getInstSrvAttrBatchByUserId(long userId, long attrId, String regionId) throws Exception;
    
    public void modifyAccrelByContract(long userId,long acctId, long splitAcctId, String splitRule,HashMap map) throws Exception, RemoteException;

    /**
     * @Description: 根据策划实例查询策划信息
     * @param: long instOfferId
     * @param:regionId 只为跨中心查询用, 代码不实现
     * @throws：异常描述
     * @version: v1.0.0
     * @author: ganliang
     */
    public IInsOfferValue getInstOfferByInstOfferId(long instOfferId, String regionId) throws Exception, RemoteException;

    /**
     * @param userId 用户标识
     * @return List 用户信息 客户信息
     * @throws Exception
     * @throws RemoteException
     * @Function: getUserByUserId
     * @Description: 根据用户标识获取用户信息
     * @version: v1.0.0
     * @author: ganliang
     */
    public IInsUserValue getUserByUserId(long userId) throws Exception, RemoteException;
    
    public BOSoShopCartBean getShopCartById(long id) throws Exception, RemoteException;

    /**
     * @param insOfferId
     * @param userId     只用做跨中心路由
     * @throws Exception
     * @throws RemoteException
     * @Function: getOfferGrpUserInfoByInsOfferId
     * @Description: 根据策划实例ID查询户主信息
     * @version: v1.0.0
     * @author: ganliang
     */
    public IInsUserValue getOfferGrpUserInfoByInsOfferId(long insOfferId, long userId) throws Exception, RemoteException;

    /**
     * @Description: 根据用户编号和付费关系类型查询帐务关系实例信息，此处为简单封装OmFrame内部方法，统一提供给外部使用
     * @param: long userId	用户编号
     * @param: long payType	账户类型 1：默认帐户 2：代付关系 -1: 全部
     * @return：IInsAccrelValue[] 帐务关系实例信息
     * @throws：Exception,RemoteException
     * @version: v1.0.0
     * @author: ganliang
     */
    public IInsAccrelValue[] getInstAccrelByUserId(long userId, long payType) throws Exception, RemoteException;

    /**
     * @Description: 根据用户编号查询用户订购的所有产品信息
     * @param: userId 用户编号
     * @param: prodType 产品类型
     * @param: validType 生效类型，-1：所有，1：当前有效2：下周期生效 4。过期数据。
     * @return: 返回结果描述
     * @throws: 异常描述
     * @version: v1.0.0
     * @author: ganliang
     */
    public IInsProdValue[] getInsProdByUserId(long userId, String prodType, int validType) throws Exception, RemoteException;

    /**
     * 根据用户编号查询策划信息
     *
     * @param userId    用户编号必须传入。
     * @param offerType 策划类型，如增值策划
     * @param validType 生效类型，-1当前有效数据及下周期生效数据。1，当前有效数据；2、下周期生效数据。
     * @return
     * @throws Exception
     * @throws RemoteException
     * @author: ganliang
     */
    public IInsOfferValue[] getInsOfferByUserId(long userId, String offerType, int validType) throws Exception, RemoteException;

    /**
     * @Function: queryMrgUserByFamilyVirUser
     * @Description: 根据家庭套餐虚拟用户userId查询家长用户实例对象
     * @param:userId 家庭套餐虚拟用户userId
     * @return：返回结果 家长用户实例对象 查询不到返回null
     * @throws：异常描述
     * @version: v1.0.0
     * @author: ganliang
     */
    public IInsUserValue queryMrgInsUserByFamilyVirUser(long userId) throws Exception, RemoteException;

    /**
     * 获取客户订单下的一次性费用(仅仅是客户订单下的，不包括策划用户订单下的)
     * autor liub
     * 2011-9-7
     *
     * @param customerOrderId
     * @param regionid
     * @return
     * @throws Exception
     */
    public IOrdBusiPriceValue[] getCustOrdBusiPriceByCustOrderId(long customerOrderId, String regionid) throws Exception;

    /**
     * @param serviceId
     * @return
     * @throws RemoteException
     * @throws Exception
     * @Function: isZoneSrv
     * @Description: 判断是否小区服务
     * @version: v1.0.0
     * @author: ganliang
     */
    public boolean isZoneSrv(long serviceId) throws RemoteException, Exception;

    /**
     * @param userId
     * @return
     * @throws RemoteException
     * @throws Exception
     * @Function: getZoneProdsByUserId
     * @Description: 查询用户下小区产品
     * @version: v1.0.0
     * @author: ganliang
     */
    public IInsProdValue[] getZoneProdsByUserId(long userId) throws RemoteException, Exception;

    /**
     * @param userId
     * @return
     * @throws RemoteException
     * @throws Exception
     * @Function: getZoneProdSrvsByUserId
     * @Description: 查询用户下小区服务
     * @version: v1.0.0
     * @author: ganliang
     */
    public IInsProdInsSrvValue[] getZoneProdSrvsByUserId(long userId) throws RemoteException, Exception;

    /**
     * 身份证验证服务
     *
     * @param cardCode
     * @param custName
     * @return
     * @throws RemoteException
     * @throws Exception
     * @author: ganliang
     */
    public Map getSoIdcardVerifyInfo(String cardCode, String custName) throws RemoteException, Exception;

    /**
     * @Function: verifyPassword
     * @Description: 验证密码
     * @param:String billId ,String password ,String regionId
     * @return：Map包涵： _nRetFlag  验证结果  0 成功  1 无此手机号  2 密码不存在 3密码不正确
     * 4 数据库错误  5其他错误
     * _strFailReason  失败原因
     * @throws：Exception,RemoteException
     * @version: v1.0.0
     * @author: wujn
     * @date: 2012-2-6 下午07:39:58
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * 2012-2-6     wujn           v1.0.0               修改原因
     */
    public Map verifyPassword(String billId, String pw, String regionId) throws Exception, RemoteException;


    /**
     * @param billId 手机号码
     * @return
     * @throws Exception
     * @throws RemoteException
     * @Function: getUserInfoByBillId
     * @Description: 根据用户手机号 宽带号 查询用户基本信息 不含套餐信息
     * @version: v1.0.0
     * @author: MAYUMIN <maym2@asiainfo-linkage.com>
     * @date: 2011-4-19下午12:50:59
     * <p/>
     * Modification History:
     * Date							Author				Version				Description
     * ------------------------------------------------------------------------------------*
     * 2011-4-19下午12:50:59			    MAYUMIN				v1.0.0					new
     */
    public IInsUserValue getUserInfoByBillId(String billId) throws Exception, RemoteException;

    /**
     * 根据用户号码,策划ID查询策划用户关系
     *
     * @param billId
     * @param offerId
     * @param validType 生效类型，-1：所有，1：当前有效2：下周期生效 4。过期数据。
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public InsOffInsUserBean[] getInsOffInsUserByBillId(String billId, long offerId, int validType) throws Exception, RemoteException;

    /**
     * @param billId
     * @param offerId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map delGroupMem(String billId, String offerId) throws Exception, RemoteException;

    /**
     * @param offerId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Long[] queryGroupMemUserIds(long custId, long offerId) throws Exception, RemoteException;

    /**
     * 根据用户id,策划实例Id查询用户策划关系
     *
     * @param userId
     * @param offerInsId
     * @param validType  生效类型，-1：所有，1：当前有效2：下周期生效 4。过期数据。
     * @return
     * @throws Exception
     * @throws RemoteException
     * @author: ganliang
     */
    public IInsOffInsUserValue getInsOffInsUser(long userId, long offerInsId, int validType) throws Exception, RemoteException;

    /**
     * 1.1.3
     * ICrmFSV.java
     * 按用户标识（包含集团用户）查帐户列表（默认帐户，分帐帐户，下周期生效帐户）
     *
     * @param userId     用户标识
     * @param payType    付费类型 1 基本付费 2 分帐 -1 全部				AmsConst.SO.ACCT_BASE_PAY_TYPE  || ACCT_SPLIT_PAY_TYPE || ACCT_PAY_TYPE_ALL
     * @param aValidType 生效类型 1为当前有效 2 下周期生效 -1为 当前有效及下周期生效	AmsConst.SO.VALID_TYPE_NOW  || VALID_TYPE_NEXT  || VALID_TYPE_ALL
     * @return IQAcctRelInfoValue
     * @throws Exception
     * @throws RemoteException
     */
    public IQAcctRelInfoValue[] getAccountsByUserId(long userId, int payType, int aValidType) throws Exception, RemoteException;

    /**
     * 1.1.4
     * ICrmFSV.java
     * 按帐户查用户列表（默认用户，代付用户）
     *
     * @param acctId  用户标识
     * @param payType 付费类型 1 基本付费 2 分帐 -1 全部			AmsConst.SO.ACCT_BASE_PAY_TYPE  || ACCT_SPLIT_PAY_TYPE || ACCT_PAY_TYPE_ALL
     * @return IQUserRelInfoValue
     * @throws Exception
     * @throws RemoteException
     */
    public IQUserRelInfoValue[] getUsersByAcctId(long acctId, int payType, int startIndex, int endIndex) throws Exception, RemoteException;
    
    /**   
     * @Function getUsersCountByAcctId
     * @Description 
     *
     * @param acctId
     * @param payType
     * @return
     * @throws Exception
     *
     * @version v1.0.0
     * @author shitian
     * @date 2013-8-15 上午9:47:36
     * 
     * <strong>Modification History:</strong><br>
     * Date         Author          Version            Description<br>
     * ---------------------------------------------------------<br>
     * 2013-8-15     shitian           v1.0.0               修改原因<br>
     */
    public int getUsersCountByAcctId(long acctId, int payType) throws Exception;

    /**
     * 1.1.7
     * ICrmFSV.java
     * 根据客户标识查询归属它的用户列表
     *
     * @param custId 计费号码
     * @return IQUserBaseInfoValue
     * @throws Exception
     * @throws RemoteException
     */
    public IInsUserValue[] getInstUserByCustId(long custId) throws Exception, RemoteException;

    /**
     * 根据服务号码查用户信息(包括用户的基本套餐信息)
     *
     * @param billId 计费号码
     * @return IQUserBaseInfoValue
     * @throws Exception
     * @throws RemoteException
     */
    public IQUserBaseInfoValue getUserBaseInfoByBillId(String billId) throws Exception, RemoteException;

    /**
     * 根据服务号码查询号码未被回收的销户用户，包含预销户和实销状态的用户信息、基本套餐信息
     *
     * @param billId 计费号码
     * @return IQUserBaseInfoValue
     * @throws Exception
     * @throws RemoteException
     */
    public IQUserBaseInfoValue getDestroyUserBaseInfoByBillId(String billId) throws Exception, RemoteException;

    /**
     * 根据用户ID查询账务关系
     *
     * @param userId
     * @param payType
     * @param validType
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IInsAccrelValue[] getInstAccrelByUserId(long userId, long payType, int validType) throws Exception, RemoteException;

    /**
     * 根据服务号码或user_id（服务号码和user_id至少有1个值）查询用户的帐户信息 （付费关系表数据）
     *
     * @param userId
     * @param billId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IInsAccrelValue[] getInstAccrel(long userId, String billId) throws Exception, RemoteException;

    /**
     * 根据userId或billId查询用户信息
     *
     * @param userId
     * @param billId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IInsUserValue getInsUser(long userId, String billId) throws Exception, RemoteException;

    /**
     * 根据账户标识，付费类型，生效类型查询账务关系
     *
     * @param acctId
     * @param payType
     * @param validType
     * @return
     * @throws Exception
     * @throws RemoteException
     * @author anwx@asiainfo-linkage.com @ 2012-6-18
     */
    public IInsAccrelValue[] getInsAccrelByAcctId(long acctId, long payType, int validType) throws Exception, RemoteException;

    /**
     * 根据用户标识查用户信息(包括用户的基本套餐信息)
     *
     * @param userId 计费号码
     * @return IQUserBaseInfoValue
     * @throws Exception
     * @throws RemoteException
     */
    public IQUserBaseInfoValue getUserBaseInfoByUserId(long userId) throws Exception, RemoteException;

    /**
     * @param userId
     * @return
     * @throws Exception
     * @throws RemoteException
     * @Description: 提供给帐管接口, 查询用户信息，用户的策划以及用户停开机状态
     */
    public IQUserOfferInfoValue queryUserOfferInfo(long userId) throws Exception, RemoteException;

    /**
     * 根据销户用户编号查询默认账务关系
     *
     * @param logOutUserId
     * @return
     * @throws Exception
     * @throws RemoteException
     * @author anwx@asiainfo-linkage.com @ 2012-6-18
     */
    public IInsAccrelValue getDefaultInstAccrelByLogOutUserId(long logOutUserId) throws Exception, RemoteException;

    /**
     * 根据用户编码查询用户信息
     *
     * @param userId
     * @return
     * @throws Exception
     * @throws RemoteException
     * @author anwx@asiainfo-linkage.com @ 2012-6-18
     */
    public IInsUserValue getInstUserByUserId(long userId) throws Exception, RemoteException;

    /**
     * 按销户的用户标识（包含集团用户）查基本帐户
     *
     * @param userId 用户标识
     * @return IQAcctRelInfoValue
     * @throws Exception
     * @throws RemoteException
     */
    public IQAcctRelInfoValue getBaseAccountByLogoutUserId(long userId) throws Exception, RemoteException;

    /**
     * 按帐户标识、付费类型、有效类型查账务关系
     *
     * @return IQAcctRelInfoValue[]
     * @throws Exception
     * @throws RemoteException
     */
    public IQAcctRelInfoValue[] getAccrelInfoByAcctId(long acctId, int payType, int aValidType) throws Exception, RemoteException;

    /**   
    * @Function: getAccrelInfoByAcctId
    * @Description: 按帐户标识、付费类型、有效类型查账务关系，并分页
    *
    * @param:@param acctId
    * @param:@param payType
    * @param:@param aValidType
    * @param:@param startIndex
    * @param:@param endIndex
    * @param:@return
    * @param:@throws Exception
    * @param:@throws RemoteException
    * @return：IQAcctRelInfoValue[]
    * @throws：
    *
    * @version: v1.0.0
    * @author: xiaozhibi
    * @date: 2012-11-21上午10:08:25 
    *
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * 2012-11-21      xiaozhibi           v1.0.0               修改原因
    */
    public IQAcctRelInfoValue[] getAccrelInfoByAcctId(long acctId, int payType, int aValidType,int startIndex,int endIndex) throws Exception, RemoteException;

    /**   
     * @Function: getAccrelInfoCountByAcctId
     * @Description: 按帐户标识、付费类型、有效类型查账务关系，并分页
     *
     * @param:@param acctId
     * @param:@param payType
     * @param:@param aValidType
     * @param:@param startIndex
     * @param:@param endIndex
     * @param:@return
     * @param:@throws Exception
     * @param:@throws RemoteException
     * @return：IQAcctRelInfoValue[]
     * @throws：
     *
     * @version: v1.0.0
     * @author: xiaozhibi
     * @date: 2012-11-21上午10:08:25 
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2012-11-21      xiaozhibi           v1.0.0               修改原因
     */
     public int getAccrelInfoCountByAcctId(long acctId, int payType, int aValidType) throws Exception, RemoteException;

     /**
     * 根据客户编号和客户类型查询用户列表
     *
     * @param custId
     * @param custType 填 null 则查全部客户类型
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IInsUserValue[] getInsUserValue(long custId, String custType) throws Exception, RemoteException;

    /**
     * 1.0.	用户资料查询 (框架使用)
     *
     * @param billId
     * @return IBOUserInfoValue
     * @throws Exception
     * @throws RuntimeException
     */
    public IBOUserInfoValue queryUserInfo4CM(String billId) throws Exception, RemoteException;

    /**
     * 1.0.	判断用户是否是新装
     *
     * @param billId
     * @return boolean 新装则返回true 否则返回false
     * @throws Exception
     * @throws RuntimeException
     */
    public boolean isUserNew(String billId) throws Exception, RemoteException;

    /**
     * 用户状态查询,0:开机,1:停机
     *
     * @param billId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public int queryUserOsState2CM(String billId) throws Exception, RemoteException;

    /**
     * @Function: getUserOsStatus
     * @Description: 查询用户停开机状态名称
     * @param:手机号码
     * @return：String 停机状态名称   正常/停机
     * @throws：Exception,RemoteException
     * @version: v1.0.0
     * @author: wujn
     * @date: 2012-2-13 下午03:11:14
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * 2012-2-13     wujn           v1.0.0               修改原因
     */
    public String getUserOsStatusName(String billId) throws Exception, RemoteException;

    /**
     * @Function: insertIntoUserOsStatePs
     * @Description: 帐管信控停开机写接口表方法
     * @param:OLD_OS_STATUS：用户当前停开机状态位
     * @param:PSTYPE:操作类型--单停:1,双停:2,单开:3,双开:4
     * @param:BUSINESS_ID：帐管侧业务ID
     * @param:BOSS_DONE_CODE：BOSS侧业务受理编码，可为空
     * @return：0-成功，1-失败。
     * @throws：异常描述
     * @version: v1.0.0
     * @author: lipj
     * @date: Aug 30, 2012 10:06:42 AM
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * Aug 30, 2012     lipj           v1.0.0               修改原因
     */
    public int insertIntoUserOsStatePs(long userId, String OLD_OS_STATUS, String BOSS_DONE_CODE, long BUSINESS_ID, String REGION_ID, int PSTYPE) throws Exception, RemoteException;

    /**
     * @Function: checkIsUserTempOpen
     * @Description: 判断用户当前是否是临时开机状态
     * @param:参数描述
     * @return：返回结果描述
     * @throws：异常描述
     * @version: v1.0.0
     * @author: lipj
     * @date: Sep 6, 2012 7:15:56 PM
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * Sep 6, 2012     lipj           v1.0.0               修改原因
     */
    public boolean checkIsUserTempOpen(long userId) throws Exception, RemoteException;

    /**
     * @Function: getDestroyUserInfo
     * @Description: 根据已回收销户用户的手机号码，获取该号码对应的所有用户的用户信息，
     * 如果一个手机号码对应多个用户id，根据用户的销户时间降序排序
     * @param: bill_id:销户用户手机号码
     * @return：
     * @throws：异常描述
     * @version: v1.0.0
     * @author: xiaozhibi
     * @date: Aug 31, 2012 10:51:09 AM
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * Aug 31, 2012      xiaozhibi           v1.0.0               修改原因
     */
    public IQUserBaseInfoValue[] getDestroyUserInfo(String billId, long userId) throws Exception, RemoteException;

    /**
     * @Function: getDestroyUserAccrelInfo
     * @Description: 根据历史用户编号（已回收）查询帐务关系
     * @param: userId：销户用户编号
     * payType：1 基本付费, 2 分帐,-1 全部
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
     * @Function: getUserBasicInfo
     * @Description: 用户信息查询:根据服务号码或者用户标识、或者客户标识查询用户基本信息【Map】【三选一进行查询，默认顺序为serviceNum
     * 、userId、custId】
     * @param: serviceNum 服务号码
     * @param: userId 用户编号
     * @param: custId 客户编号
     * @return：Map [CRM_SO_ERR_CODE|错误代码&CRM_SO_ERR_MSG|错误信息&INS_USER_VALUE|用户信息]
     * @throws：Exception
     * @throws: RemoteException
     * @version: V1.0.0
     * @author: wuyb <wuyb@asiainfo-linkage.com>
     * @date: 2012-8-31 上午11:02:20
     * <p/>
     * Modification History: Date Author Version Description
     * -------------------------------------------------------* 2012-8-31
     * 上午11:02:20 wuyb V1.0.0 Add
     */
    public Map getUserBasicInfo(String serviceNum, String userId, String custId)
            throws Exception, RemoteException;
    
    /**
     * 为OSE方专门提供，同Region 的user一起查询 基本信息
     * 用同一Region的多个UserId，查询用户的基本信息
    * <p>Title: </p>
    * <p>Description: </p>
    * <p>Company: AsiaInfo</p> 
    * @author YuJing
    * @date 2019-9-9
    * ICrmFSV
     */
    public Map getUserBasicInfoByUserIdsForOSE(long[] userIds)	throws Exception, RemoteException;
     
    /**
     * 为OSE提供，解决多次调用有性能问题的优化方法，多个RegionId 和UserId 一起查询
     * regionIdUserIdMap  key为regionId Value为UserId列表
    * <p>Title: </p>
    * <p>Description: </p>
    * <p>Company: AsiaInfo</p> 
    * @author YuJing
    * @date 2020-1-3
    * ICrmFSV
     */
    public Map getUserBasicInfoByUserIdsForOSE(Map<String,List<Long>> regionIdUserIdMap) throws Exception, RemoteException ;
    
    /**
     * @param @param  offerId　　　  策划ID
     * @param @param  startDate　　 开始日期
     * @param @param  endDate	　结束日期
     * @param @param  regionId	     地市
     * @param @return
     * @param @throws Exception
     * @return String[]    返回客户ID
     * @throws
     * @Title: getCustIdByOfferIdAndRegionId
     * @Description: 根据策划ID，订购起始日期，订购结束日期，订购地市查询订购该策划的客户
     * @version: v1.0.0
     * @author: liujianya
     * @date 2012-8-25 下午03:59:55
     * <p/>
     * Modification History:
     * Date           Author          Version     Description
     * ---------------------------------------------------------*
     * 2012-8-25      liujianya       v1.0.0      修改原因
     */
    public String[] getCustIdByOfferIdAndRegionId(String offerId, String startDate, String endDate, String regionId) throws Exception;

    /**
     * @param serviceNum       服务号码
     * @param isVerifyOldPwd   是否验证旧密码   0：不验证   1：验证   缺省为验证
     * @param oldPwd           旧密码（明文） 验证旧密码时需要提供
     * @param newPwd           新密码（明文）
     * @param isVerifyCertCard 是否验证证件号码   0：不验证   1：验证  缺省为不验证
     * @param certCardType     证件类型  验证证件号码时需要提供
     * @param certCardCode     证件号码   验证证件号码时需要提供
     * @param isSMSNotify      是否短信通知  0：无短信通知   1：短信通知   缺省为不短信通知
     * @throws Exception
     * @throws RemoteException
     * @Function: updateUserPassword
     * @Description: 修改用户密码，并可短信通知用户新的密码。提供两种认证方式：旧密码认证；证件号码认证。
     * @return：Map [CRM_SO_ERR_CODE&错误代码|CRM_SO_ERR_MSG&错误信息]
     * @version: v1.0.0
     * @author: shaying <shaying@asiainfo-linkage.com>
     * @date: 2012-8-20 下午17:24:13
     * <p/>
     * Modification History:getDestroyUserInfo
     */
    public Map updateUserPassword(String serviceNum, int isVerifyOldPwd, String oldPwd, String newPwd, int isVerifyCertCard, String certCardType, String certCardCode, int isSMSNotify
    ) throws Exception, RemoteException;

    /**
     * @param serviceNum   服务号码
     * @param newPwd       新密码（明文）
     * @param certCardType 证件类型  验证证件号码时需要提供
     * @param certCardCode 证件号码   验证证件号码时需要提供
     * @param isSMSNotify  是否短信通知  0：无短信通知   1：短信通知   缺省为不短信通知
     * @throws Exception
     * @throws RemoteException
     * @Function: resetUserPassword
     * @Description: 重置用户密码 ,并可短信通知用户新的密码。如果提供用户密码则按提供的用户密码重置，否则系统自动随机生成密码进行重置。
     * @return：Map [CRM_SO_ERR_CODE&错误代码|CRM_SO_ERR_MSG&错误信息]
     * @version: v1.0.0
     * @author: shaying <shaying@asiainfo-linkage.com>
     * @date: 2012-8-20 下午17:24:13
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * 2012-8-20     shaying           v1.0.0               修改原因
     */
    public Map resetUserPassword(String serviceNum, String newPwd, String certCardType, String certCardCode, int isSMSNotify) throws Exception, RemoteException;

    /**
     * @param serviceNum 服务号码
     * @param password   用户输入密码
     * @throws Exception
     * @throws RemoteException
     * @Function: verifyUserPassword
     * @Description:验证用户服务密码 ，验证失败时返回能够重试的验证次数，密码验证成功时返回密码强弱状态。
     * @return：Map [CRM_SO_ERR_CODE&错误代码:成功，返回。。。；失败，返回。。。
     * CRM_SO_ERR_MSG&错误信息：国际化资源编号
     * RetryTimes	重试次数 密码验证失败时返回该字段：int，
     * IsWeakPwd	是否弱密码 密码验证成功时返回密码强弱状态
     * @version: v1.0.0
     * @author: shaying <shaying@asiainfo-linkage.com>
     * @date: 2012-8-20 下午17:24:13
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * 2012-8-20     shaying           v1.0.0               修改原因
     */
    public Map verifyUserPassword(String serviceNum, String password) throws Exception, RemoteException;

    /**
     * @Function: getInternationalNum
     * @Description: 查询香港一卡多号--->>>查询用户关系-国际一卡双号信息，根据业务类型筛选出香港一卡双号的记录，返回是否已经开通的国际号码
     * @param: serviceNum 服务号码
     * @param: userId 用户编码
     * @return：MAP[CRM_SO_ERR_CODE&错误代码:成功，返回。。。；失败，返回。。。 CRM_SO_ERR_MSG&错误信息：国际化资源编号
     * AnotherNum	一卡多号号码]
     * @throws：Exception , RemoteException
     * @version: V1.0.0
     * @author: Joes.Xin <xinjl@asiainfo-linkage.com>
     * @date: 2012-9-1 上午10:24:41
     * <p/>
     * Modification History:
     * Date                     Author          Version            Description
     * ---------------------------------------------------------------------*
     * 2012-9-1  上午10:24:41        Joes.Xin          V1.0.0             Add
     */
    public Map getInternationalNum(String serviceNum, String userId) throws Exception, RemoteException;

    /**
     * @Function: isMultiNumUser
     * @Description: 检查用户是否是一卡多号业务用户
     * @param: userId 用户编码
     * @param: billId 电话号码
     * @return：是一卡多号用户，返回true；不是一卡多号用户，返回false
     * @throws：Exception , RemoteException
     * @version: V1.0.0
     * @author: zhanglei <zhanglei@asiainfo.com>
     * @date: 2014-7-21
     * <p/>
     */
    public boolean isMultiNumUser(String userId, String billId) throws Exception, RemoteException;
    
    /**
     * @Function: Query
     * @Description: 统一查询
     * @param: serviceNum 服务号码
     * @return：MAP[CRM_SO_ERR_CODE#错误代码 CRM_SO_ERR_MSG#错误信息
     * AddValueInfo#增值业务信息]
     * @throws： Exception , RemoteException
     * @version: V1.0.0
     * @author: Joes.Xin <xinjl@asiainfo-linkage.com>
     * @date: 2012-8-31 上午10:15:28
     * <p/>
     * Modification History:
     * Date                     Author          Version            Description
     * ---------------------------------------------------------------------*
     * 2012-8-31  上午10:15:28        Joes.Xin          V1.0.0             Add
     */
    public Map unifiedQuery(String serviceNum) throws Exception, RemoteException;

    /**
     * @Function: unifiedCancel
     * @Description: 该函数的功能描述
     * @param: serivceNum 服务号码
     * @param: userId 用户编码
     * @param: sPRequestInfo 增值业务退订请求信息
     * @return：MAP[CRM_SO_ERR_CODE#错误代码 CRM_SO_ERR_MSG#错误信息
     * AddValueResultInfo#增值业务退订应答信息]
     * @throws： Exception , RemoteException
     * @version: V1.0.0
     * @author: Joes.Xin <xinjl@asiainfo-linkage.com>
     * @date: 2012-8-31 上午10:29:28
     * <p/>
     * Modification History:
     * Date                     Author          Version            Description
     * ---------------------------------------------------------------------*
     * 2012-8-31  上午10:29:28        Joes.Xin          V1.0.0             Add
     */
    public Map unifiedCancel(String serviceNum, String userId, Map sPRequestInfo) throws Exception, RemoteException;

    /**
     * @Function: activateBakSIMCard
     * @Description: 激活SIM卡备卡。查询待激活的备卡，进行受理检查，提交受理操作。
     * @param:serviceNum 服务号码
     * @param:userId 用户编码
     * @param:iccId iccId号
     * @return：无
     * @throws：1001：服务号码{0}不存在；1002：待激活的SIM卡备卡不存在
     * @version: V1.0.0
     * @author: wuyb <wuyb@asiainfo-linkage.com>
     * @date: 2012-9-1 下午2:46:49
     * <p/>
     * Modification History:
     * Date                     Author          Version            Description
     * ---------------------------------------------------------------------*
     * 2012-9-1  下午2:46:49        wuyb          V1.0.0             Add
     */
    public Map activateBakSIMCard(String serviceNum, String userId, String iccId) throws Exception, RemoteException;

    /**
     * @Function: getUserOfferProduct
     * @Description: 查询指定策划下用户订购的产品
     * @param: serviceNum    服务号码
     * @param: offerId    策划编号
     * @return：Map [CRM_SO_ERR_CODE&错误代码|CRM_SO_ERR_MSG&错误信息|OfferInstInfo&产品实例信息]
     * @throws：Exception
     * @throws: RemoteException
     * @version: V1.0.0
     * @author: Joes.Xin <xinjl@asiainfo-linkage.com>
     * @date: 2012-8-14 上午02:33:21
     * <p/>
     * Modification History:
     * Date                     Author          Version            Description
     * ---------------------------------------------------------------------*
     * 2012-9-3  上午02:33:21        shaying          V1.0.0             Add
     */
    public Map getUserOfferProduct(String serviceNum, long offerId) throws Exception, RemoteException;

    /**
     * @Function: getUserAllOffer
     * @Description: 获取用户策划信息，包括当前策划和下周期策划
     * @param:serviceNum-服务号码
     * @param:userId-用户编号
     * @param:validType-生效类型 0：本周期 1：下周期
     * @param:offerId-策划编号
     * @param:offerType-策划类型
     * @param:offerCatalog-策划目录
     * @return：返回结果描述
     * @throws：异常描述
     * @version: v1.0.0
     * @author: yal.fang
     * @date: Aug 21, 2012 9:25:03 AM
     * <p/>
     * Modification History: Date Author Version Description
     * ---------------------------------------------------------* Aug 21,
     * 2012 shaying v1.0.0 修改原因
     */
    public Map getUserAllOffer(String serviceNum, long userId, int validType,
                               long offerId, String offerType, long offerCatalog) throws Exception,
            RemoteException;

    /**
     * @Function: getUserAllInfo
     * @Description: 查询用户信息(全)    根据服务号码查询用户信息、客户信息、帐户 信息、策划信息、业务限制列表
     * @param: ServiceNum    服务号码
     * @return：Map [CRM_SO_ERR_CODE|错误代码&CRM_SO_ERR_MSG|错误信息&UserInfo|用户信息&CustInfo|客户信息&AcctInfo|帐户 信息&OfferInfo|策划信息&LimitInfo|业务限制列表]
     * @throws：Exception
     * @throws：RemoteException
     * @version: V1.0.0
     * @author: Joes.Xin <xinjl@asiainfo-linkage.com>
     * @date: 2012-8-7 上午07:50:10
     * <p/>
     * Modification History:
     * Date                     Author          Version            Description
     * -------------------{
     * return (ICust2CrmSV) ServiceFactory.getService(ICust2CrmSV.class);
     * }0    Joes.Xin          V1.0.0             Add
     */

    public Map getUserAllInfo(String ServiceNum) throws Exception, RemoteException;

    /**
     * @Function: getUserSPOrder
     * @Description: 查询用户已经订购的SP信息，SP企业编号和SP服务编号全为空时查询用户全部已订购信息。
     * @param: serviceNum 服务号码
     * @param: SPCode           SP企业编号
     * @param: SPServiceCode    SP企业服务编号
     * @param: OfferId          策划编号                  [提供SPCode、SPServiceCode或提供OfferId]
     * @param: ServiceType      SP企业服务类型   [1：短信业务|2：WAP业务|3：彩信业务|4：手机动画|5：通用下载|6：其他SP业务]
     * @param: Billflag         收费标志                  [0：免费|1：收费|2：全部]
     * @param: ValidType        生效类型                  [0：全部生效|1：本周期生效|2：下周期生效|4：历史]
     * @return：Map [SPOrderInfo&SP订购信息]
     * @throws：异常描述
     * @version: V1.0.0
     * @author: Joes.Xin <xinjl@asiainfo-linkage.com>
     * @date: 2012-8-9 上午02:10:57
     * <p/>
     * Modification History:
     * Date                     Author          Version            Description
     * ---------------------------------------------------------------------*
     * 2012-9-9  上午02:10:57       shaying         V1.0.0             Add
     * return new HashMap();
     */
    public Map getUserSPOrder(String serviceNum, String spCode, String spServiceCode, long offerId, int serviceType, int billflag, int validType) throws Exception, RemoteException;

    /**
     * @Function: getUserPromotionInfo
     * @Description: 查询用户已经办理的促销信息
     * @param: serviceNum 服务号码
     * @param: promotId    促销编码--->>不提供表示查询所有促销信息
     * @return：Map [CRM_SO_ERR_CODE&错误代码|CRM_SO_ERR_MSG&错误信息|PromotInfo&促销信息]
     * @throws：Exception
     * @throws: RemoteException
     * @version: V1.0.0
     * @author: Joes.Xin <xinjl@asiainfo-linkage.com>
     * @date: 2012-8-14 上午06:58:06
     * <p/>
     * Modification History:
     * Date                     Author          Version            Description
     * ---------------------------------------------------------------------*
     * 2012-8-14  上午06:58:06        Joes.Xin          V1.0.0             Add
     */
    public Map getUserPromotionInfo(String serviceNum, String promotId) throws Exception, RemoteException;

    /**
     * 换主策划
     *
     *
     * @param userId          billId、UserId二者必需其一
     * @param billId          billId、UserId二者必需其一
     * @param newOfferId      新策划ID
     * @param servpkgData     新策划下产品ID
     * @param offerVASList    增值策划列表
     * @param soAttrMap       属性列表
     * @param validDate       生效时间
     * @param expireDate      失效时间
     * @param extendMap       扩展参数Map
     * @param mustDelFlag     是否必选选默认的产品和策划
     * @param inheritProdFlag 是否继承在老套餐下是必选新套餐下是可选的产品
     * @throws Exception
     * @throws RemoteException
     * @author ganliang
     */
    public Map updateUserMainOffer(long userId, String billId, long newOfferId, ISoServicePkgData servpkgData[], List offerVASList,
                                   Map<String,ISoAttrData[]> soAttrMap, Timestamp validDate, Timestamp expireDate, Map extendMap, boolean mustDelFlag, boolean inheritProdFlag) throws Exception, RemoteException;

    /**
     * 订购退订变更暂停恢复一起受理
     *
     * @param userId
     * @param billId
     * @param offerVASList ISoOfferExe对象数组  CREATE/LOGOUT/UPDATE/PAUSE/RESUME
     * @param priceList
     * @param validDate
     * @param expireDate
     * @param extendMap
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map offerVASListStore(long userId, String billId, List offerVASList, List priceList, Timestamp validDate,
                                 Timestamp expireDate, Map extendMap) throws Exception, RemoteException;

    /**
     * @Function: orderUserInfoServiceSwitch
     * @Description: 受理用户信息服务开关。用户服务信息开关用于实现用户自主对移动所提供的服务的开通及关闭功能，
     * 当用户关闭该开关后，则移动服务用户不能使用移动运营商所提供的该服务。其中总开关用于对所有开关的限制。
     * @param:参数描述
     * @return：返回结果描述
     * @throws：异常描述
     * @version: V1.0.0
     * @author: wuyb <wuyb@asiainfo-linkage.com>
     * @date: 2012-9-7 下午02:52:28
     * <p/>
     * Modification History:
     * Date                     Author          Version            Description
     * ---------------------------------------------------------------------*
     * 2012-9-7  下午02:52:28        wuyb          V1.0.0             Add
     */
    public void orderUserInfoServiceSwitch(String serviceNum, String userId, Map userSwitchInfo) throws Exception, RemoteException;

    /**
     * 多个增值策划的开通
     *
     * @param billId
     * @param offerIds
     * @param attrMap  属性 以offerId(String) 为key ISoAttrData[]  为value  没有传null
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map orderOffers(String billId, long[] offerIds, Map attrMap) throws Exception, RemoteException;

    /**
     * 用户是否可办理,判断用户是否可以受理套餐或产品
     * 返回MAP,Key=ERROR_CODE,true表示成功,false表示失败 key=ERROR_DESC,失败时候的描述
     *
     * @param billId   计费号码
     * @param operType 操做: CREATE:订购   UPDATE:变更   LOGOUT:退订
     * @param offerId  套餐编号
     * @throws Exception
     * @throws RemoteException
     */
    public Map chkUserPlanProd(String billId, String operType, long offerId) throws Exception, RemoteException;

    /**
     * @Function: getAllMainOffer
     * @Description: 查询所有主策划列表
     * @param:brandId-品牌编号
     * @param:regionCode--地市编码
     * @return：返回套餐信息 -OfferInfoList
     * @throws：异常描述
     * @version: v1.0.0
     * @author: fangyl
     * @date: Sep 8, 2012 10:45:06 AM
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * Sep 8, 2012     fangyl           v1.0.0               修改原因
     */
    public Map getAllMainOffer(String brandId, String regionCode)
            throws Exception, RemoteException;


    /**
     * 根据电话号码查询用户订的所有策划的ID
     *
     * @param billId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IInsOfferValue[] queryUserOrderOffers(String billId) throws Exception, RemoteException;

    /**
     * 根据策划和用户号码查询活动绑定的IMEI号
     *
     * @param offerId 策划ID
     * @param billId  手机号
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public String getPloyIMEI(long offerId, String billId) throws Exception, RemoteException;

    /**
     * @Function: getUserBakSIMCard
     * @Description: 查询用户当前的SIM卡备卡信息
     * @param:ServiceNum 服务号码
     * @param:UserId 用户编号
     * @return：SIM卡备卡信息
     * @throws：异常描述
     * @version: v1.0.0
     * @author: wuyb
     * @date: 2012-9-10 下午05:13:50
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * 2012-9-10     wuyb           v1.0.0               修改原因
     */
    public BOInsxUserBakSimBean[] getUserBakSIMCard(String servNum, long userId) throws Exception, RemoteException;

    /**
     * @Function: getUserBusinessRecord
     * @Description: 用户业务受理记录查询
     * @param:serviceNum-服务号码
     * @param:startTime-开始时间
     * @param:endTime-结束时间
     * @return：返回结果描述
     * @throws：异常描述
     * @version: v1.0.0
     * @author: yal.fang
     * @date: Aug 21, 2012 10:27:44 AM
     * <p/>
     * Modification History: Date Author Version Description
     * ---------------------------------------------------------* Aug 21,
     * 2012 fangyl v1.0.0 修改原因
     */
    public Map getUserBusinessRecord(String serviceNum, String startTime,
                                     String endTime) throws Exception, RemoteException;

    /**
     * 校验家庭网业务  支持成员的属性变更,产品变更
     *
     *
     *
     * @param billId
     * @param offerId
     * @param operType
     * @param mProdDatas
     * @param mAttrMap
     * @param memberList
     * @param extendMap
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map dealOfferJTWChck(String billId, long offerId, String operType, ISoServicePkgData[] mProdDatas, Map<String, ISoAttrData> mAttrMap, List memberList, Map extendMap) throws Exception, RemoteException;

    /**
     * 家庭网业务  支持成员的属性变更,产品变更
     *
     *
     * @param billId
     * @param offerId         组网的时候必传
     * @param operType        CREATE:组网  LOGOUT:拆网  UPDATE:更新成员
     * @param mProdDatas      户主产品 可null
     * @param mAttrMap        户主属性 可null
     * @param memberList<Map> BILL_ID:成员手机号
     *                        STATE:成员状态  1:新增 2:修改 3删除
     *                        SO_ATTR:成员的属性变更 Map
     *                        SO_PROD  成员变更的产品 ISoServicePkgData[] servpkgData
     * @param extendMap
     * @throws Exception
     * @throws RemoteException
     */
    public IBceDealReturnData dealOfferJTW(String billId, long offerId, String operType, ISoServicePkgData[] mProdDatas, Map<String, ISoAttrData> mAttrMap, List memberList, Map extendMap) throws Exception, RemoteException;

    /**
     * 校验用户关系业务
     *
     *
     * @param billId
     * @param offerId
     * @param operType
     * @param memberList
     * @param extendMap
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map dealOfferYHGXChck(String billId, long offerId, String operType,ISoServicePkgData[] mProdDatas, Map<String, ISoAttrData> mAttrMap, List memberList, Map extendMap) throws Exception, RemoteException;


    /**
     * 用户关系业务
     *
     *
     * @param billId    户主手机号
     * @param offerId   策划ID
     * @param operType  CREATE:用户关系受理 LOGOUT:用户关系取消  UPDATE:用户关系成员变更
     * @param memList   成员列表
     * @param extendMap 扩展参数
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map dealOfferYHGX(String billId, long offerId, String operType,ISoServicePkgData[] mProdDatas, Map<String, ISoAttrData> mAttrMap,List memList, Map extendMap) throws Exception, RemoteException;

    /**
     * @Function: getProductItemByExtendId
     * @Description: 根据目录ID，操作员ID，目录类型，地区ID获取子目录信息
     * @param:catalogId 父目录ID 必填 请知识库的同事写死两个最顶层的目录：集团业务是-1；个人业务是1
     * @param:regionId 地区ID 非必填
     * @param:operId 操作员ID 非必填
     * @param:catalogType 目录类型 非必填 如果想获取全部目录可以不填
     * @return：ICatalogValue 目录信息
     * @throws：异常描述
     * @version: v1.0.0
     * @author: shaying
     * @date: 2012-9-12 上午10:21:26
     * <p/>
     * Modification History: Date Author Version Description
     * ---------------------------------------------------------*
     * 2012-9-12 shaying v1.0.0 修改原因
     */
    public ICatalogValue[] getSubCatalogsByCondition(long catalogId,
                                                     String regionId, long operId, String[] catalogType)
            throws PceException, Exception, RemoteException;

    /**
     * @Function: getOfferByCatalogIdRegionIdOperatorId
     * @Description: 根据操作员operId，目录ID，地区获取策划信息
     * 如果oldOffer不传则不过滤
     * 20110607:如果目录ID，策划Id,名称同时不传则产品接口直接扔出异常
     * @param:catalogId 目录ID 在根据目录获取策划信息时必填
     * @param:regionId 地区ID 非必填
     * @param:operId 操作员 非必填
     * @param:offerType 策划类型 非必填 如果想获取全部目录可以不填
     * @param:oldOfferId 旧策划ID 非必填 知识库同事不用填
     * @param:busiType 业务类型 非必填 知识库同事不填
     * @param:OfferId 策划ID 模糊查询时的条件之一
     * @param:name 策划名称 模糊查询时的条件之一
     * @param:prepayType 预缴类型 非必填 知识库同事不填
     * @param:busiId 操作Id 非必填 知识库同事不填
     * @return：IOfferValue 策划信息
     * @throws：异常描述
     * @version: v1.0.0
     * @author: shaying
     * @date: 2012-9-12 上午10:21:26
     * <p/>
     * Modification History: Date Author Version Description
     * ---------------------------------------------------------*
     * 2012-9-12 shaying v1.0.0 修改原因
     */
    public IOfferValue[] getOfferByCatalogIdRegionIdOperatorId(long catalogId,
                                                               long operId, String regionId, String[] offerType,
                                                               long[] oldOfferId, String[] busiType, long offerId, String name,
                                                               String prepayType, long busiId) throws Exception, RemoteException;

    /**
     * @Function: activeMobileMail
     * @Description: 激活手机邮箱-失败抛出异常信息，正常不返回。
     * @param:serviceNum-手机号
     * @param:userId-用户编号
     * @return：返回结果描述
     * @throws：异常描述
     * @version: v1.0.0
     * @author: fangyl
     * @date: Sep 13, 2012 10:05:50 AM
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * Sep 13, 2012     fangyl           v1.0.0               修改原因
     */
    public List activeMobileMail(String serviceNum, String userId)
            throws Exception, RemoteException;

    /**
     * @Function: 查询用户信息
     * @Description:
     * @param:
     * @return：
     * @throws：
     * @version: v1.0.0
     * @author: xiaozhibi
     * @date: 2012-9-13下午09:26:08
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * 2012-9-13      xiaozhibi           v1.0.0               修改原因
     */
    public DataContainerInterface GetUserSimpleInfo(String billId) throws Exception, RemoteException;

    /**
     * @Function: getJTWGroupInfoByBillId
     * @Description: 根据用户手机号码和角色id，查询用户所在家庭网信息
     * @param:billId:手机号码 roleFlag：成员角色编号，0--主号，1--成员，2--不限
     * @return：
     * @throws：
     * @version: v1.0.0
     * @author: xiaozhibi
     * @date: 2012-9-14上午11:09:56
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * 2012-9-14      xiaozhibi           v1.0.0               修改原因
     */
    public Map getJTWGroupInfoByBillId(String billId, int roleFlag) throws Exception, RemoteException;

    /**
     * 规则校验接口
     *
     * @param billId
     * @param extendMap
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map checkSoBusiRule(String billId, List offerVASList, Map extendMap) throws Exception, RemoteException;
    public Map getUserInfoByBillId(String billId, boolean safeFlag)
            throws Exception, RemoteException;

    /**
     * 根据spcode operatorCode查sp信息
     *
     * @param spCode
     * @param operatorCode
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public ISpServiceValue getSpInfoBySpCode(String spCode, String operatorCode) throws Exception, RemoteException;

    /**
     * @Function: dealUserGuaranteeService
     * @Description: 受理用户担保业务
     * @param: billId, 业务受理号码，不可为空
     * quaranteeNum，担保号码，不可为空
     * serviceId，担保业务类型：1—国际长途,2—国际漫游
     * beginDate，担保业务开始日期
     * endDate，担保业务结束日期
     * @return：
     * @throws：
     * @version: v1.0.0
     * @author: xiaozhibi
     * @date: 2012-9-18下午07:39:38
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * 2012-9-18      xiaozhibi           v1.0.0               修改原因
     */
    public void dealUserGuaranteeService(String billId, String quaranteeNum,
                                         int serviceId, Timestamp beginDate, Timestamp endDate) throws Exception, RemoteException;

    /**
     * @Function: getUserRelatInfoByBillId
     * @Description: 根据用户手机号码、用户关系策划id，角色id，查询用户所有用户关系信息
     * @param:	billId:手机号码
     *  		offer_id：如果传入了值，则查询指定用户关系策划的信息；否则，查询所有用户关系信息
     *  		kindId:用户关系策划组id，如果传入了值，则查询指定策划组下的用户关系策划的信息；否则，查询所有用户关系信息
     * 			roleFlag：成员角色编号，0--主号，1--成员，2--不限
     * @return：
     * @throws：
     * @version: v1.0.0
     * @author: xiaozhibi
     * @date: 2012-9-14上午11:09:56
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * 2012-9-14      xiaozhibi           v1.0.0               修改原因
     */
    public Map getUserRelatInfoByBillId(String billId, long offerId,long kindId, int roleFlag) throws Exception, RemoteException;


    /**
     * 查询用户主策划下的可订购的增值策划信息，即获取用户可办理的产品（产品包） 、中心业务和活动
     *
     * @param billId
     * @param userId
     * @param kindId   策划组ID 必传
     * @param regionId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public List getUserAvailVasOffer(String billId, long userId, long kindId, String regionId) throws Exception, RemoteException;

    /**
     * 查询用户指定策划,根据billId,offerId,offerType,validType 查询用户订购的策划实例,
     * 如果kindid>0,则查询结果根据kindId内配置过滤.返回在组内的策划实例
     *
     * @param billId
     * @param offerId   传-1,忽略此条件
     * @param offerType 传null,忽略此条件
     * @param validType -1:本周期及下周期生效,1:本周期生效,2:下周期生效
     * @param kindId    穿-1,忽略此条件
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IInsOfferValue[] getInsOffByBillIdAndOfferId(String billId, long offerId, String offerType, int validType, long kindId) throws Exception, RemoteException;

    /**
     * @Function: getUserMainOfferDetail
     * @Description: 查询用户基本策划、基本策划下产品、服务、属性信息
     * @param:billId，手机号码;userId,用户编号。这两个参数不能都为空 validType，生效类型，0：本周期，1：下周期, 2：全部，默认查询全部
     * isQryProd,是否查询策划下产品信息，默认为false不查询，传入true，则查询策划下产品、服务、属性信息
     * @return：返回的Map的结构如下： <"OfferInstInfo",OfferMap> ，        本周期基本策划信息
     * <"OfferId"等key,策划相关信息>
     * <"ProdInstInfo",ProdValue[]> ，              策划下所有产品信息-List
     * <"ProdId"等key,产品相关信息>
     * <"ServiceInfo",insProdInsSrvValue[]> ，策划下所有服务信息
     * <"ServiceId"等key,服务相关信息>
     * <"AttrInfo",	IInsSrvAttrValue[]> ，		  策划下所有属性信息
     * <"AttrId"等key,属性相关信息>
     * 如果有下周起数据，在上面的Map的key前加个"Next"，如"NextOfferInstInfo"，key对应的数据一致
     * @throws：
     * @version: v1.0.0
     * @author: xiaozhibi
     * @date: 2012-9-21下午05:22:50
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * 2012-9-21      xiaozhibi           v1.0.0               修改原因
     */
    public Map getUserMainOfferDetail(String billId, long userId, int validType, boolean isQryProd) throws Exception, RemoteException;


    /**
     * 查用户已订购的指定策划
     *
     * @param userId    用户ID
     * @param offerId   策划ID
     * @param validType 生效类型，-1当前有效数据及下周期生效数据。1，当前有效数据；2、下周期生效数据。
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IInsOfferValue[] getInsOfferByUserId(long userId, long offerId, int validType) throws Exception, RemoteException;

    /**
     * 根据策划实例ID查询实例属性
     *
     * @param offerInsId 必填
     * @param attrId     attrId<0 则查所有属性
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IInsSrvAttrValue[] getInsAttrByOffInsId(long offerInsId, long attrId) throws Exception, RemoteException;


    /**
     * 风险控制用户查询
     *
     * @param billId
     * @return 返回结果不为空且>0即是风险控制用户
     * @throws Exception
     * @throws RemoteException
     * @author ganliang
     */
    public IBOInsxUserMonitorDtlValue[] queryStateFlg(String billId) throws Exception, RemoteException;

    /**
     * 风险控制用户迁入迁出
     *
     * @param stateFlgs         此数组长度为6.每位取值为0或者1,0:不需要监控,1:需要监控  数组每位监控服务:  [0]监控GMS业务 [1]监控梦网 [2]需要SMS [3]需要GPRS [4]梦网短信 [5]梦网彩信
     * @param userMonitor_types 监控原因，长度为3 分别对应：[0]新装受控计划[参数MONITOR_PLAN] [1]国际长权受理 [2]内部管理[前台迁入迁出]  对应值为1为是该原因，0为不是该原因
     * @param flg               "add"（迁入）,"delete"（迁出）
     * @param userId
     * @param map               可选填
     *                          map.put("opId", opId);
     *                          map.put("orgId", orgId);
     *                          map.put("orderId", orderId);
     *                          map.put("remarks", remarks);
     * @return
     * @throws Exception
     * @throws RemoteException
     * @author ganliang
     */
    public String updateInfo(String[] stateFlgs, String[] userMonitor_types, String flg, Long userId, Map map) throws Exception, RemoteException;

    /*******************************异网WLAN业务接口结束******************************************************************/

/**************************************************CBOSS业务落地接口开始******************************************************************/

    /**
     * 生成订单号 给统一接口组使用
     * 地市编码和手机号码任意选一种填写。
     * 如果不填默认采用240
     *
     * @param regionId 地市编码
     * @param billId   手机号码
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public String generateOrderCode(String regionId, String billId) throws Exception, RemoteException;
    /**************************************************CBOSS业务落地接口结束******************************************************************/
    /**
     * 查询集团订单信息
     *
     * @param custId
     * @param operId
     * @param orderName
     * @param queryMode
     * @param startDate
     * @param endDate
     * @param StartIndex
     * @param endIndex
     * @param regionId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map queryOrderGroupInfo(String custId, long operId, String orderName, String queryMode, String startDate, String endDate, int StartIndex, int endIndex, String regionId) throws Exception, RemoteException;

    /**
     * @Function: getGroupMembAvailableTimes
     * @Description: 获取家庭V网一年变更次数
     * @param:参数描述
     * @return：Map的key对于的数据如下： OfferId，家庭V网基本策划id
     * OfferInstId，家庭V网基本实例策划id
     * OrderName，家庭V网基本策划名称
     * CreateDate，家庭V网生效时间
     * ChangedNum，家庭V网一年内已变更次数
     * TotalNum，家庭V网一年内最大可变更次数
     * @throws：异常描述
     * @version: v1.0.0
     * @author: xiaozhibi
     * @date: 2012/9/27 11:23:56 PM
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * 2012/9/27    xiaozhibi           v1.0.0               修改原因
     */
    public Map getGroupMembAvailableTimes(String billId) throws Exception, RemoteException;
    /**
     * @Function: getBaseStationAndProdList
     * @Description: 查询基站及策划信息
     * @param:offerId-用户主策划编号，必传
     * @param:regionId-地市编号，必传
     * @param:operId-操作员ID，可为空
     * @param:kindId-组ID，必传
     * @return：List -Map<基站,策划>
     * <IUpItemFeatureValue,IOfferValue>
     * @throws：异常描述
     * @version: v1.0.0
     * @author: fangyl
     * @date: Sep 29, 2012 3:17:33 PM
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * Sep 29, 2012     fangyl           v1.0.0               修改原因
     */
    public Map getBaseStationAndProdList(long offerId, String regionId,
                                         long operId, long kindId) throws PceException, RemoteException,
            Exception;

    /**
     * @throws RemoteException
     * @Function: getGuaranteeOpen
     * @Description: 该函数的功能描述
     * @param:ServiceNum 服务号码
     * @param:Month 查询月份        YYYYMM
     * @return：CreditLevel    信用度等级
     * @return：GuaranteeTotalTimes    本月总担保次数
     * @return：uaranteedTimes    本月已用担保次数
     * @return：GuaranteeRemailTimes    本月剩余担保次数
     * @return：GuaranteeRec    担保停开机明细
     * @throws：Exception
     * @version: v1.0.0
     * @author: shaying
     * @date: 2012-9-29 上午11:29:13
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * 2012-9-29     shaying           v1.0.0               修改原因
     */

    public DataContainer getGuaranteeOpen(String ServiceNum, String Month) throws Exception, RemoteException;

    /**
     * @Function: getUserAvailPloyOffer
     * @Description: 查询用户可订购的活动
     * @param:billId-手机号码
     * @param:kindId-组ID
     * @param:regionId-地市编号
     * @return：返回结果描述
     * @throws：异常描述
     * @version: v1.0.0
     * @author: fangyl
     * @date: Oct 1, 2012 3:01:28 PM
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * Oct 1, 2012     fangyl           v1.0.0               修改原因
     */
    public List getUserAvailPloyOffer(String billId, long kindId,
			String regionId) throws Exception, RemoteException;

    /**
     * @Function: createInternetPayOrder
     * @Description: 3.1.2.24 创建网上缴费订单
     * @param:参数描述
     * @return：返回结果描述
     * @throws：异常描述
     * @version: v1.0.0
     * @author: lvgm
     * @date: 2012-10-2 下午5:26:02
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * 2012-10-2     lvgm           v1.0.0               new
     */
    public Map createInternetPayOrder(Map param) throws Exception, RemoteException;

    /**
     * @Function: updateInternetPayOrder
     * @Description: 3.1.2.25 更新网上缴费订单
     * @param:参数描述
     * @return：返回结果描述
     * @throws：异常描述
     * @version: v1.0.0
     * @author: lvgm
     * @date: 2012-10-2 下午5:18:39
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * 2012-10-2     lvgm           v1.0.0               new
     */
    public Map updateInternetPayOrder(Map param) throws Exception, RemoteException;

    /**
     * @Function: getInternetPayOrder
     * @Description: 3.1.2.26 查询网上缴费订单
     * @param:参数描述
     * @return：返回结果描述
     * @throws：异常描述
     * @version: v1.0.0
     * @author: lvgm
     * @date: 2012-10-2 下午5:17:48
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * 2012-10-2     lvgm           v1.0.0               new
     */
    public Map getInternetPayOrder(Map param) throws Exception, RemoteException;

    /**
     * @Function: delInsUserForPhoneCallBack
     * @Description: 资源号码回收时，删除营业侧用户资料，
     * 如ins_user用户表资料，ins_accrel账务关系资料，客户用户关系资料移到销户历史表
     * @param:
     * @return：
     * @throws：
     * @version: v1.0.0
     * @author: xiaozhibi
     * @date: 2012-10-2下午05:00:05
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * 2012-10-2      xiaozhibi           v1.0.0               修改原因
     */
    public void delInsUserForPhoneCallBack(String billId) throws Exception, RemoteException;

    /**
     * @Function: addCreateUserOrder
     * @Description: 3.8.2.6 创建网上开户订单
     * @param:参数描述
     * @return：返回结果描述
     * @throws：异常描述
     * @version: v1.0.0
     * @author: lvgm
     * @date: 2012-10-3 下午12:12:55
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * 2012-10-3     lvgm           v1.0.0               new
     */
    public Map addCreateUserOrder(Map param) throws Exception, RemoteException;

    /**
     * @Function: updateCreateUserOrder
     * @Description: 3.8.2.7 更新网上开户订单
     * @param:参数描述
     * @return：返回结果描述
     * @throws：异常描述
     * @version: v1.0.0
     * @author: lvgm
     * @date: 2012-10-3 下午5:18:27
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * 2012-10-3     lvgm           v1.0.0               new
     */
    public void updateCreateUserOrder(Map param) throws Exception, RemoteException;

    /**
     * @Function: getCreateUserOrder
     * @Description: 3.8.2.8 查询网上开户订单
     * @param:参数描述
     * @return：返回结果描述
     * @throws：异常描述
     * @version: v1.0.0
     * @author: lvgm
     * @date: 2012-10-3 下午5:17:24
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * 2012-10-3     lvgm           v1.0.0               new
     */
    public Map getCreateUserOrder(Map param) throws Exception, RemoteException;

    /**
     * @throws RemoteException
     * @Function: checkBillIdisBindCmcPhoneId
     * @Description: 校验号码是否合法且是否存在绑定关系
     * @param:billId 手机号码
     * @param:cmcPhoneId 宽带号码
     * @return：isBind    是否绑定
     * @return：billId 手机号码
     * @return：cmcPhoneId    宽带号码
     * @throws：Exception
     * @version: v1.0.0
     * @author: shaying
     * @date: 2012-10-2 上午11:29:13
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * 2012-10-2     shaying           v1.0.0               修改原因
     */

    public List checkBillIdIsBindCmcPhoneId(String billId, String cmcPhoneId) throws Exception, RemoteException;

    /**
     * 查询集团客户的付费计划信息
     *
     * @param custId
     * @param regionId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map queryGroupAccrelInfo(String custId, String regionId) throws Exception, RemoteException;

    /**
     * 查询集团订购产品列表
     *
     * @param custId
     * @param offerId
     * @param prodSpecId
     * @param regionId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map queryGroupProdInfo(String custId, long offerId, long prodSpecId,String billId, String regionId) throws Exception, RemoteException;

    /**
     * 查询集团工单信息
     *
     * @param opId
     * @param OrderType
     * @param Status
     * @param startDate
     * @param endDate
     * @param StartIndex
     * @param endIndex
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map queryGroupWorkTaskInfo(long custId,String opId, String OrderType, String Status, String startDate, String endDate, int StartIndex, int endIndex) throws Exception, RemoteException;

    /**
     * 统计工单信息
     *
     * @param opId
     * @param orderType
     * @param startDate
     * @param endDate
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map queryGroupWorkTaskInfoCount(String opId, String orderType, String startDate, String endDate) throws Exception, RemoteException;

    /**
     * 集团工单配置信息
     *
     * @param opId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map queryGroupWorkTaskInfo(String opId) throws Exception, RemoteException;

    /**
     * @Function: getBookBusinessRec
     * @Description: 查询用户当前所有有效的预约信息
     * @param:
     * @return：Map <"BookOrderInfo",IBOInsxPreBusiValue[]>	预约工单基本信息
     * <"BookBusinessInfo",IBOInsxPreBusiParamValue[]> 预约工单业务属性
     * @throws：
     * @version: v1.0.0
     * @author: xiaozhibi
     * @date: 2012-10-8上午10:11:00
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * 2012-10-8      xiaozhibi           v1.0.0               修改原因
     */
    public Map getPreBusiRecord(String billId,String createDate,String expireDate,String bussId) throws Exception, RemoteException;

    /**
     * 查询用户信息(普通)
     *
     * @param userId
     * @param billId
     * @param custId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public List getUserNormalInfo(long userId, String billId,
                                  long custId) throws Exception, RemoteException;

    /**
     * @Function: updateInsDataForAcctZQChg
     * @Description: 用户主动办理用户账期变更，引起营业实例数据变更
     * @param: acctId，用户编号，必传
     * oldZhangqi，用户老账期，必传
     * newZhangqi，新账期
     * validType，生效类型，1-立即生效，2-下月生效
     * @return：
     * @throws：
     * @version: v1.0.0
     * @author: xiaozhibi
     * @date: 2012-10-4下午05:00:32
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * 2012-10-4      xiaozhibi           v1.0.0               修改原因
     */
    public void updateInsDataForAcctZQChg(long acctId, int oldZhangqi, int newZhangqi, int validType) throws Exception, RemoteException;

    /**
     * @Function: getOfferDiff
     * @Description: 通过billId查询之前主策划中必选产品 ，若在新策划中该产品 可选，返回产品列表
     * @param:billId
     * @param:baseOfferId
     * @return：List
     * @throws：Exception RemoteException
     * @version: v1.0.0
     * @author: shaying
     * @date: 2012-10-6 下午4:39:49
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * 2012-10-6     shaying           v1.0.0               修改原因
     */
    public Map getOfferDiff(String billId, long baseOfferId) throws Exception,
            RemoteException;

    /**
     * @Function: getUserProdPack
     * @Description: 查询用户已订购的产品包信息
     * @param:billId-用户手机号
     * @param:userId-用户编号
     * @return：用户已订购的产品包列表
     * @throws：异常描述
     * @version: v1.0.0
     * @author: fangyl
     * @date: Oct 9, 2012 3:02:41 PM
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * Oct 9, 2012     fangyl           v1.0.0               修改原因
     */
    public List getUserProdPack(String billId, long userId) throws Exception,
            RemoteException;

    /**
     * @Function: getUserAvailProdPack
     * @Description: 查询用户可订购的产品包
     * @param:参数描述
     * @return：返回结果描述
     * @throws：异常描述
     * @version: v1.0.0
     * @author: fangyl
     * @date: Oct 9, 2012 5:25:11 PM
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * Oct 9, 2012     fangyl           v1.0.0               修改原因
     */
    public List getUserAvailProdPack(String billId, long userId, long kindId,
                                     String regionId) throws Exception, RemoteException;

    /**
     * @Function: 新增网上预约
     * @Description:
     * @param:
     * @return：
     * @throws：
     * @version: v1.0.0
     * @author: xiaozhibi
     * @date: 2012-10-10上午10:37:54
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * 2012-10-10      xiaozhibi           v1.0.0               修改原因
     */
    public long insertReserveBusinessAndParm(String billId,
                                             BOInsxPreBusiBean insxPreBusiValues,
                                             BOInsxPreBusiParamBean[] insxPreBusiParamValues) throws Exception, RemoteException;

    /**
     * @Function: updateReserveBusiness
     * @Description: 修改或删除预约
     * @param:
     * @return：
     * @throws：
     * @version: v1.0.0
     * @author: xiaozhibi
     * @date: 2012-10-10上午10:42:12
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * 2012-10-10      xiaozhibi           v1.0.0               修改原因
     */
    public void updateReserveBusiness(long reserveId, int opType, List<IBOInsxPreBusiParamValue> iValues) throws Exception, RemoteException;

    /**
     * @Function: getPreBusiCouts
     * @Description: 查询预约业务量
     * @param:
     * @return：
     * @throws：
     * @version: v1.0.0
     * @author: xiaozhibi
     * @date: 2012-10-10上午10:54:31
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * 2012-10-10      xiaozhibi           v1.0.0               修改原因
     */
    public int getPreBusiCouts(String BusiCode, String orgId, String beginTime,
                               String endTime) throws Exception, RemoteException;

    /**
     * @Function: saveDestoryUserForAcct
     * @Description: 保存需要账务销户的用户数据到销户用户准备表
     * @param:
     * @return：
     * @throws：异常描述
     * @version: v1.0.0
     * @author: xiaozhibi
     * @date: Sep 7, 2012 11:25:26 AM
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * Sep 7, 2012      xiaozhibi           v1.0.0               修改原因
     */
    public void saveDestoryUserForAcct(long userId) throws Exception, RemoteException;

    /**
     * @Function: ICrmFSV.java
     * @Description: 根据服务号码billId和集团客户编号custId查询，该号码订购的集团业务
     * @param:参数描述
     * @return：返回订购的集团业务[];
     * @throws：异常描述
     * @version: v1.0.0
     * @author: wenxj
     * @date: 2012-10-11 下午04:21:57
     * <p/>
     * Modification History: Date Author Version Description
     * ---------------------------------------------------------*
     * 2012-10-11 wenxj v1.0.0 修改原因
     */
    public Map unifiedGroupQuery(String billId, String custId) throws Exception, RemoteException;

    /**
     * @Function: ICrmFSV.java
     * @Description: 根据服务号码billId和集团客户编号custId查询，该号码订购的集团业务
     *	
     * @param:参数描述
     * @return：返回订购的集团业务[]; false: 订购了本集团客户的产品
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: zhangyu11
     * @date: 2012-10-11 下午04:21:57
     *
     *        Modification History: Date Author Version Description
     *        ---------------------------------------------------------*
     *        2012-10-11 zhangyu11 v1.0.0 修改原因
     */
    public boolean unifiedGroupCustQuery(String billId, long custId) throws Exception, RemoteException;
    
    /**
     * @Function: ICrmFSV.java
     * @Description: 根据服务号码billId和集团客户编号custId查询，该号码是否作为该集团办理集团业务的属性（主要联系人）被保存
     * @param:参数描述
     * @return：返回订购的集团业务[]
     * @throws：异常描述
     * @version: v1.0.0
     * @author: wenxj
     * @date: 2012-10-11 下午07:24:09
     * <p/>
     * Modification History: Date Author Version Description
     * ---------------------------------------------------------*
     * 2012-10-11 wenxj v1.0.0 修改原因
     */
    public List groupQueryByBillIdCustId(String billId, String custId) throws Exception, RemoteException;

    /**
     * *
     *
     * @Function: getUsersOfAcctId
     * @Description:
     * @param:
     * @return：List
     * @throws：Exception
     * @version: v1.0.0
     * @author: shaying
     * @date: Oct 12, 2012 8:53:09 PM
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * Oct 12, 2012     shaying           v1.0.0               修改原因
     */
    public List getUsersOfAcctId(long acctId) throws Exception, RemoteException;

    /**
     * 查询用户当年担保次数及剩余担保次数
     *
     * @param billId 担保人手机号
     * @return map
     *         CreditClass 当前信用度等级
     *         TotalTimes 当前国际业务总担保次数
     *         UsedTimes 当前前国际业务已用担保次数
     *         RemainTimes 当前前国际业务剩余担保次数
     * @throws Exception
     */
    public Map getUserAssureInfo(String billId) throws Exception, RemoteException;


    /**
     * 查询用户作为担保用户的记录
     *
     * @param billId 担保人手机号
     * @return IBOSoUserAssureValue[] 担保信息
     * @throws Exception
     */
    public IBOSoUserAssureValue[] getUserAssureInfos(String billId, Date startDate, Date endDate) throws Exception, RemoteException;

    /**
     * @Function: checkUserCanOrderOffer
     * @Description: 校验用户是否可以订购指定策划列表
     * @param: billId，用户手机号
     * offerIdList，指定策划列表
     * @return：List,可订购策划列表
     * @throws：
     * @version: v1.0.0
     * @author: xiaozhibi
     * @date: 2012-10-12下午08:02:13
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * 2012-10-12      xiaozhibi           v1.0.0               修改原因
     */
    public List checkUserCanOrderOffer(String billId, List offerIdList) throws Exception, RemoteException;

    /**
     * @Function: calBusinessFee
     * @Description: 计算业务费用接口
     * @param:参数描述
     * @return：返回结果描述
     * @throws：异常描述
     * @version: v1.0.0
     * @author: fangyl
     * @date: Oct 15, 2012 1:51:21 PM
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * Oct 15, 2012     fangyl           v1.0.0               修改原因
     */
    public Map calBusinessFee(String billId, long busiId, String simCardId,
                              long mainOfferId, String offerPloyId, String regionId)
            throws Exception, RemoteException;

    /**
     * @Function: openNewUserNetPre
     * @Description: 网上开户
     * @param:orderId-网上开户订单编号
     * @return：返回结果描述
     * @throws：异常描述
     * @version: v1.0.0
     * @author: yal.fang
     * @date: Oct 15, 2012 6:48:45 PM
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * Oct 15, 2012     fangyl           v1.0.0               修改原因
     */
    public Map openNewUserNetPre(long orderId) throws Exception, RemoteException;

    /**
     * 获取用户终端信息
     *
     * @param billId 服务号码
     * @return Map
     *         key="IMEI"              IMEI信息
     *         key="TerminalType"      终端类型
     *         key="TerminalFactory"   生产厂商
     * @throws Exception
     * @throws RemoteException
     */
    public Map getUserTerminal(String billId) throws Exception, RemoteException;

    /**
     * @Function: checkUserChangeTerminal
     * @Description: 校验是否存在换机操作
     * @param:startTime 起始时间【包含】，endTime 结束时间【不包含】
     * @return：
     * @throws：异常描述
     * @version: v1.0.0
     * @author: liuke
     * @date: 2012-10-16 上午09:25:47
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * 2012-10-16      liuke           v1.0.0               修改原因
     */
    public boolean checkUserChangeTerminal(long userId, long offerInstId,
                                           Timestamp startTime, Timestamp endTime) throws Exception, RemoteException;
    /**
     * 
    * Copyright: Copyright (c) 2012 Asiainfo-Linkage
    * 
    * @ClassName: ICrmFSV.java
    * @Description: 集团用户停开机
    *
    * @version: v1.0.0
    * @author: wangbin
    * @date: 2012-10-16 上午11:11:58 
    *
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * 2012-10-16     wangbin           v1.0.0               修改原因
     */
    public Map groupUserStopAndOpen(String billId,long action ) throws Exception,RemoteException;


    /**
     * 查询三选一产品
     * @param brandId
     * @param mainOfferId
     * @param regionId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map getSelThreeOne(long brandId,long mainOfferId,String regionId)throws Exception,RemoteException;
    
    /**
     * 
    * @Function: updateUserWlanPassword 
    * @Description:修改或重置用户WLAN密码
    *
    * @param:servNum-用户手机号码
    * @param:operType-操作类型 0：密码修改 1：密码重置
    * @param:oldPwd-旧密码 密码重置为空
    * @param:newPwd-新密码 密码重置为空
    * @param:type-类型 1：校园普通版 2：校园专业版 3：全网WLAN 4：农村WLAN
    * @return：返回结果描述
    * @throws：异常描述
    *
    * @version: v1.0.0
    * @author: yal.fang
    * @date: Oct 16, 2012 10:29:55 AM 
    *
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * Oct 16, 2012     fangyl           v1.0.0               修改原因
     */
    public Map updateUserWlanPassword(String servNum, String operType,
			String oldPwd, String newPwd , int type) throws Exception, RemoteException;
    
    
    /**
     * 
    * @Function: authCenterAccept 
    * @Description: 鉴权中心改造(无价卡受理)接口
    *
    * @param:参数描述
    * @return：返回结果描述
    * @throws：异常描述
    *
    * @version: v1.0.0
    * @author: yal.fang
    * @date: Oct 16, 2012 7:54:33 PM 
    *
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * Oct 16, 2012     fangyl           v1.0.0               修改原因
     */
    public IBceDealReturnData authCenterAccept(String servNum, long offerId,
			int offEffect, long monOfferId, int monOffEffect,
			long halfOfferId, int halfOffEffect, long prodId,
			String spCode, String servCode) throws Exception, RemoteException;

    /**
     * 查询可换主策划
     * @param billId
     * @return
     * @throws Exception     * @throws RemoteException
     */
    public Map getCanOrderMoffer(String billId, String agreementId)throws Exception,RemoteException;
    
    /**
	 * 
	* @Function: updateUserWlanPassword 
	* @Description:神州行实名注册
	*
	* @param:billId-用户手机号码
	* @param:cardType-证件类型
	* @param:cardCode-证件号码
	* @param:custName-客户姓名
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: yal.fang
	* @date: Oct 17, 2012 16:29:55 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Oct 16, 2012     fangyl           v1.0.0               修改原因
	 */
	public void updateEsayForRealName(String billId, int cardType,
			String cardCode, String custName) throws Exception, RemoteException;
	
	/**
	 * 
	* @Function: getUserMainOffer 
	* @Description: 根据服务号码查询用户的当前主策划信息和下周期主策划信息
	*
	* @param:servNum-用户手机号码
	* @return：当前主策划信息curOffMap , 下周期主策划信息nxtOffMap
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: fangyl
	* @date: Oct 18, 2012 7:05:50 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Oct 18, 2012     fangyl           v1.0.0               修改原因
	 */
	public Map getUserMainOffer(String servNum)throws Exception, RemoteException;
	

	/**
	 * 
	* Copyright: Copyright (c) 2012 Asiainfo-Linkage
	* 
	* @ClassName: ICrmFSV.java
	* @Description: 查询集团产品成员信息
	*
	* @version: v1.0.0
	* @author: wangbin
	* @date: 2012-10-19 下午05:16:20 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-10-19     wangbin           v1.0.0               修改原因
	 */
	public Map queryGroupMemInfo(long custId,long offerId,String billId,String custRegionId,int statIndex,int endIndex)throws Exception,RemoteException;

    /**   
     * @Function: exeRuleForBusiAccepte
     * @Description: 校验用户是否可以受理指定业务，通过静态配置
     *
     * @param: billId,受理号码
     *        extendMap，传入参数map，必须包含此key："INTERFACE_CODE"
     *        目前支持的接口如下：
     *        1，INTERFACE_CODE="1000"。校验主策划变更（电子渠道），接口编码：OI_CheckUserMainOffer
     * @return：
     * @throws：
     *
     * @version: v1.0.0
     * @author: xiaozhibi
     * @date: 2012-10-18上午10:31:05 
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2012-10-18      xiaozhibi           v1.0.0               修改原因
     */
     public boolean exeRuleForBusiAccept(String billId,Map extendMap) throws Exception, RemoteException;


     /**
      * 
     * Copyright: Copyright (c) 2012 Asiainfo-Linkage
     * 
     * @ClassName: ICrmFSV.java
     * @Description: 查询集团用户信息
     *
     * @version: v1.0.0
     * @author: wangbin
     * @date: 2012-10-22 下午04:54:43 
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2012-10-22     wangbin           v1.0.0               修改原因
      */
     public IQryUserInfoByCustIdValue[] queryGroupUserInfo(String custId,long offerId,String regionId)throws Exception,RemoteException;

    /**
     * 3.7.3.2 查询SP信息
     * 根据SP业务编码、SP企业编码、业务类型查询SP服务描述
     * @param spCode
     * @param serviceCode
     * @param offerId
     * @param serviceType
     * @param kindId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map getSPInfo(String spCode,String serviceCode,long offerId,String serviceType,long kindId)throws Exception,RemoteException;

    /**
     * 
    * Copyright: Copyright (c) 2012 Asiainfo-Linkage
    * 
    * @ClassName: ICrmFSV.java
    * @Description: 根据账户ID查询免催停信息表
    *
    * @version: v1.0.0
    * @author: lipj
    * @date: 2012-10-22 下午04:54:43 
    *
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * 2012-10-22     lipj           v1.0.0               修改原因
     */
    public IBOInsxTemporaryOpenValue[] getInsxTemporaryOpenByAcctId(long acctId)throws Exception,RemoteException;
    
    /**
     * 
    * Copyright: Copyright (c) 2012 Asiainfo-Linkage
    * 
    * @ClassName: ICrmFSV.java
    * @Description: 根据账户ID查询免催停信息表
    *
    * @version: v1.0.0
    * @author: lipj
    * @date: 2012-10-22 下午04:54:43 
    *
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * 2012-10-22     lipj           v1.0.0               修改原因
     */
    public IBOInsxTemporaryOpenValue[] getInsxTemporaryOpenByAcctId(long acctId,int operType, int validType)throws Exception,RemoteException;
    
    /**
     * 用户是否在指定时间内订购过该策划
     * @param userId
     * @param startDate
     * @param endDate
     * @param offerId
     * @return true:用户在指定时间范围内订购过该策划 false:用户在指定时间范围内没有订购过该策划
     * @throws Exception
     * @throws RemoteException
     */
    public boolean isUserOrderTheOffer(long userId, Date startDate, Date endDate, long offerId)throws Exception,RemoteException;
    

    /**
     * 订购预缴和兑换接口
     * @param billId
     * @param offerId
     * @param projectId
     * @param prodArray
     * @param payType
     * @param totalBusiFee
     * @param totalScore
     * @param valiDate
     * @param expireDate
     * @param exchMatInfo
     * @param extendMap
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map buyPrePayAndExchange(String billId,long offerId,long projectId,ISoServicePkgData[] prodArray,long payType,
                                    String totalBusiFee,String totalScore,Timestamp valiDate,Timestamp expireDate,
                                    Map exchMatInfo,Map extendMap)throws Exception,RemoteException;

    /**   
     * @Function: dealUserStopOpen
     * @Description: 处理用户停开机
     *
     * @param: billId，业务受理号码，必传
     *         osType,停开机类型，必传：0：管理停机,1：管理复机，2：营业停机，3：营业复机,4：帐务停机，5：帐务复机,6:呼叫限制，7，呼叫限制取消
     *         isLost,是否存在有效被盗/遗失关系停机信息,营业停机时可以注明被盗或遗失停机，默认不存在,0：不存在,1：存在。
     * @return：
     * @throws：
     *
     * @version: v1.0.0
     * @author: xiaozhibi
     * @date: 2012-10-23下午07:14:04 
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2012-10-23      xiaozhibi           v1.0.0               修改原因
     */
     public IBceDealReturnData dealUserStopOpen(String billId,int osType,int isLost)throws Exception, RemoteException;

    /**
     * 查询用户订购历史信息
     * @param billId
     * @param offerKindId
     * @param beginTime
     * @param endTime
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map getUserOfferHistory(String billId,long[] offerKindId,Timestamp beginTime,Timestamp endTime)throws Exception,RemoteException;
    /**   
     * @Function: updatePassWordAndNickName
     * @Description: 修改用户密码和昵称
     *
     * @param: billId     	手机号码（必传）
     *         oldPassWord	老密码	（必传）
     *         newPassWord	新密码（必传）
     *         nickName		用户昵称 (有则修改，无则不修改)
     * @return：
     * @throws：
     *
     * @version: v1.0.0
     * @author:  huanghui@asiainfo-linkage.com
     * @date: 	 2012-10-23下午06:14:04 
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2012-10-24      huanghui        v1.0.0            修改原因
     */
    public void updatePassWordAndNickName(String billId, String oldPassWord, String newPassWord, String nickName) throws Exception,RemoteException;

    /**
     * @Function: vfyPass4SR
     * @Description: 验证用户密码
     *
     * @param:参数描述
     * @return：返回结果描述
     * @throws：异常描述
     *
     * @version: V1.0.0
     * @author: tangxy <tangxy@asiainfo-linkage.com>
     * @date: Oct 25, 2012 9:59:27 AM 
     *
     * Modification History:
     * Date                     Author          Version            Description
     *---------------------------------------------------------------------*
     * Oct 25, 2012  9:59:27 AM        tangxy          V1.0.0             Add
     *
     */
    public Map vfyPass4SR(String serviceNum, String password) throws Exception, RemoteException;
    
    
    /**
     * @Function: updateChInfoInstalment
     * @Description: 更新分期扣费代销商信息
     *
     * @param:参数描述
     * @return：返回结果描述
     * @throws：异常描述
     *
     * @version: V1.0.0
     * @author: tangxy <tangxy@asiainfo-linkage.com>
     * @date: Oct 25, 2012 8:44:17 PM 
     *
     * Modification History:
     * Date                     Author          Version            Description
     *---------------------------------------------------------------------*
     * Oct 25, 2012  8:44:17 PM        tangxy          V1.0.0             Add
     *
     */
    public void updateChInfoInstalment(String regionId, String channelId, String busiType, String isbudget, String validate, String invalidate, String remark, String operationtype, String orgId, String opId) throws RemoteException,Exception;
	/***
	 * 
	* @Function: GetUserCommonInfo
	* @Description: 查询用户常用信息（IVR用）
	*
	* @param: billId
	* @return：ServiceNum	服务号码
	* @return：ServiceLevel	服务级别 目前分四个级别：
	* 1.	动感地带
	* 2.	神州行
	* 3.	全球通
	* 4.	全球通VIP
	* 前三个为用户品牌。如果用户的服务级别为银、金、钻则为全球通VIP. 
	* @return：Birthday	生日
	* @return：OsStatus	用户停复机状态
	* @return：IsAutoPWD	是否自动密码（是否初始密码）
	* @return：RegionCode	用户归属地区

	* @throws：Exception RemoteException
	*
	* @version: v1.0.0
	* @author: shaying
	* @date: 2012-10-6 下午4:39:49 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-10-26     shaying           v1.0.0               修改原因
	 */
    public Map getUserCommonInfo(String billId) throws Exception,RemoteException;

    /**
     * 判断是否实体卡业务
     * @param extDoneCode 策划订单上的ext_done_code
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public boolean isEntityBusi(String extDoneCode) throws Exception, RemoteException;

    /**
     * 判断SP业务是否首次订购
     * add by caiwm
     * @param userId          用户编号
     * @param spCode          SP企业代码
     * @param operatorCode    SP业务代码
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Timestamp getSpFirstOrder(long userId, String spCode, String operatorCode) throws Exception, RemoteException;

    /**
     * 3.1.2.36 查询策划生效方式
     * @param billId
     * @param offerId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map getOfferEffectiveMode(String billId,long[] offerId)throws Exception,RemoteException;
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
	/***
	 * 
	* @Function: getRandomPWDFlag
	* @Description: 查询用户随机密码鉴权开关（是否设置了随机密码鉴权）。
	*
	* @param: billId
	* @return：是否设置了随机密码鉴权
	* 0：未设置
	* 1：已设置
	* @throws：Exception RemoteException
	*
	* @version: v1.0.0
	* @author: shaying
	* @date: 2012-10-6 下午4:39:49 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-10-31     shaying           v1.0.0               修改原因
	 */
    public int getRandomPWDFlag(String billId) throws Exception,
	RemoteException;
	/***
	 * 
	* @Function: getUserAllMscInfo
	* @Description: 查询用户程控信息 产品类型 PROD_MSC
	*
	* @param: billId
	* @return：ProdId	
	* @return：ProdName	


	* @throws：Exception RemoteException
	*
	* @version: v1.0.0
	* @author: shaying
	* @date: 2012-10-6 下午4:39:49 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-10-30     shaying           v1.0.0               修改原因
	 */
    public  List getUserAllMscInfo(String billId) throws  Exception,RemoteException;

    /**
     * 查询用户亲情通礼包是否激活
     * @param billId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IBOInsxFamlyPackActiveValue queryPresentPackageStatus(String billId)throws Exception,RemoteException;

    /**
     * 亲情通礼包激活
     * @param billId
     * @param subBillId
     * @param extendMap
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IBceDealReturnData activePresentPackage(String billId,String[] subBillId,Map extendMap)throws Exception,RemoteException;
    
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
     * 
    * Copyright: Copyright (c) 2012 Asiainfo-Linkage
    * 
    * @ClassName: ICrmFSV.java
    * @Description: 免催停查询信息表
    *
    * @version: v1.0.0
    * @author: lipj
    * @date: 2012-10-22 下午04:54:43 
    *
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * 2012-10-22     lipj           v1.0.0               修改原因
     */
    public IBOInsxTemporaryOpenValue[] getInsxTemporaryOpen(long userId,Timestamp validDate,Timestamp expireDate,String regionId,int operType)throws Exception,RemoteException;
	
    /**
     * 
    * Copyright: Copyright (c) 2012 Asiainfo-Linkage
    * 
    * @ClassName: ICrmFSV.java
    * @Description: 免催停查询信息表
    *
    * @version: v1.0.0
    * @author: lipj
    * @date: 2012-11-05 下午04:54:43 
    *
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * 2012-11-05     lipj           v1.0.0               修改原因
     */
	public IBOInsxTemporaryOpenValue[] getInsxTemporaryOpenByUserId(long userId,int operType, int validType)throws Exception;
    
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
	/***
	 * 
	* @Function: getUserComplexInfo
	* @Description: 查询用户综合信息
	*
	* @param: billId
	* @return： Map 


	* @throws：Exception RemoteException
	*
	* @version: v1.0.0
	* @author: shaying
	* @date: 2012-10-6 下午4:39:49 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-11-2    shaying           v1.0.0               修改原因
	 */
    public Map getUserComplexInfo(String billId) throws Exception,RemoteException ;
    
    /**   
     * @Function: resetInternetPassWord
     * @Description: 重置用户互联网密码
     *
     * @param: billId     	手机号码（必传）
     *         newPassWord	新密码（必传）
     * @return：
     * @throws：
     *
     * @version: v1.0.0
     * @author:  huanghui@asiainfo-linkage.com
     * @date: 	 2012-10-23下午06:14:04 
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2012-10-24      huanghui        v1.0.0            修改原因
     */
    public void resetInternetPassWord(String billId, String newPassWord) throws Exception,RemoteException;

	/**   
	* @Function: getRcmdServiceQuery
	* @Description: 提供给短厅的接口，提供一个免费/非免费标识，查询当前所有免费/非免费1111增值增值业务便捷订购服务
	*
	* @param:@param fee
	* @return：BORcmdServiceBean[]
	* @throws：
	*
	* @version: v1.0.0
	* @author: xiaozhibi
	* @date: 2012-11-5上午09:33:37 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-11-5      xiaozhibi           v1.0.0               修改原因
	*/
	public BORcmdServiceBean[] getRcmdServiceQuery(int fee)throws Exception,RemoteException;
	
	/**
	 * 
	* @Function: activeCreateUserOrder 
	* @Description: 网上开户激活
	*
	* @param:orderId--网上开户订单编号
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: fangyl
	* @date: Nov 5, 2012 10:46:57 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Nov 5, 2012     fangyl           v1.0.0               修改原因
	 */
	public void activeCreateUserOrder(long orderId) throws Exception, RemoteException;
	
	/**
     * 
    * @Function: verifyUserWlanPassword 
    * @Description: 验证用户WLAN密码
    *
    * @param: servNum-用户手机号
    * @param: password-用户WLAN密码
    * @param: type-WLAN类型 1：校园普通版 2：校园专业版 3：全网WLAN 4：农村WLAN
    * @return：返回结果描述
    * @throws：异常描述
    *
    * @version: v1.0.0
    * @author: yal.fang
    * @date: Nov 6, 2012 7:10:53 PM 
    *
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * Nov 6, 2012     fangyl           v1.0.0               修改原因
     */
    public Map verifyUserWlanPassword(String servNum, String password, int type)
			throws Exception, RemoteException;
    
    /**   
     * @Function: checkUserPwAndInternetPw
     * @Description: 验证用户密码（服务密码或鉴权密码）
     *
     * @param: ServiceNum   服务号码
     * @param: PWDType		密码类型
     * @param: Password		密码      
     * @return：map
     * @throws：
     *
     * @version: v1.0.0
     * @author:  huanghui@asiainfo-linkage.com
     * @date: 	 2012-11-5下午06:14:04 
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2012-11-5      huanghui        v1.0.0            修改原因
     */
    public Map checkUserPwAndInternetPw(String billId, String pwdType, String passWord) throws Exception,RemoteException;

    /**
     * 校验用户是否是手机支付用户
     * @param billId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public boolean isMpayUser(String billId) throws Exception, RemoteException;
    /**
     * @Function: getChInfoInstalment
     * @Description: 通过地州编码、渠道编码、业务大类获取是否分期扣费信息
     *
     * @param:参数描述
     * @return：返回结果描述
     * @throws：异常描述
     *
     * @version: V1.0.0
     * @author: tangxy <tangxy@asiainfo-linkage.com>
     * @date: Oct 25, 2012 8:41:59 PM 
     *
     * Modification History:
     * Date                     Author          Version            Description
     *---------------------------------------------------------------------*
     * Oct 25, 2012  8:41:59 PM        tangxy          V1.0.0             Add
     *
     */
//    public IBOChInfoInstalmentValue[] getChInfoInstalment(String regionId, String channelId, 
//    						String busiType)throws RemoteException,Exception;
    /**
    * @Function: 根据regionId,业务大类、扣款模式     查询业务大类与扣款账本配置表
    * @Description: 该方法的描述
    *
    * @param:regionId 地市、busiType 业务大类、feeMode扣款模式
    * @return：
    * @throws：异常描述
    *
    * @version: v1.0.0
    * @author: liuke
    * @date: 2012-11-6 下午08:07:45  
    *
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * 2012-11-6      liuke           v1.0.0               修改原因
     */
//    public IBOChInfoBusiBookItemValue[] getChInfoBusiBookItem(String regionId, String busiType,
//    							String feeMode)throws Exception,RemoteException;
    
    /**
     * 
    * @Function: createUserNet 
    * @Description: 网上开户（高校迎新开户）
    *
    * @param:paraMap-参数信息map
    * @return：返回结果描述
    * @throws：异常描述
    *
    * @version: v1.0.0
    * @author: fangyl
    * @date: Nov 7, 2012 5:18:58 PM 
    *
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * Nov 7, 2012     fangyl           v1.0.0               修改原因
     */
    public Map createUserNet(Map paraMap)throws Exception,RemoteException;
    
    /**   
     * @Function: saveUserInternetLog
     * @Description: 记录用户鉴权日志）
     *
     * @param: OpId	登录工号  || OrgId 登录营业厅  || ChannelId 登录渠道  || VerifyType 0(密码) 1(短信) 2(令牌) || URL 登录渠道Url
     * @param: logTime 日志时间  || ClientIp	 客户端登录IP || ServerIp	服务端登录IP || SessionId Sessionid || LogType	登录方式
     * @param: ServiceNum 登录手机号码   || RegionCode 手机号码归属地 || BrandId	 登录号码品牌  || isSuccess 枚举值：0(成功) 1(失败) || FailReason 枚举值：0(成功) 1(失败)
     * @param: LoginTime 登录时间 || LogoutTime	登出时间  || RequestTime 接口请求时间 || ResponseTime	 接口响应时间  || Reserver1 保留字段
     * @param: Reserver2 保留字段     
     * @return：
     * @throws：Exception, RemoteException
     *
     * @version: v1.0.0
     * @author:  huanghui@asiainfo-linkage.com
     * @date: 	 2012-11-6下午06:14:04 
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2012-11-6      huanghui        v1.0.0            修改原因
     */
    public void saveUserInternetLog(String opId, String orgId, String channelId, String verifyType, String URL, 
    		String logTime, String clientIp, String serverIp, String sessionId, String logType, 
    		String serviceNum, String regionCode, String brandId, String isSuccess, String failReason, 
    		String loginTime, String logoutTime, String requestTime, String responseTime, String reserver1, 
    		String reserver2) throws Exception,RemoteException;

    /**   
     * @Function: queryUserComprehensiveInfo
     * @Description: 查询用户综合信息
     *
     * @param: billId 服务号码
     * @return：map
     * @throws：Exception, RemoteException
     *
     * @version: v1.0.0
     * @author:  huanghui@asiainfo-linkage.com
     * @date: 	 2012-11-8下午06:14:04 
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2012-11-8     huanghui        v1.0.0            修改原因
     */
    public Map queryUserComprehensiveInfo(String billId) throws Exception,RemoteException;
    
    /**   
     * @Function: createPassPort
     * @Description: 创建用户互联网通行证。将昵称和用户手机号码绑定，不需要做鉴权。
     *
     * @param: billId   服务号码
     * @param: password 互联网密码
     * @param: NickName 用户昵称
     * @return：
     * @throws：Exception, RemoteException
     *
     * @version: v1.0.0
     * @author:  huanghui@asiainfo-linkage.com
     * @date: 	 2012-11-8下午06:14:04 
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2012-11-8     huanghui        v1.0.0            修改原因
     */
    public void createPassPort(String billId, String passWord, String nickName) throws Exception,RemoteException;
    
    /**   
     * @Function: getInstUserOsStateValueByBillId
     * @Description: 根据手机号码获取用户停开机实例对象
     *
     * @param: billId   服务号码
     * @return：
     * @throws：Exception, RemoteException
     *
     * @version: v1.0.0
     * @author:  lipj@asiainfo-linkage.com
     * @date: 	 2012-11-10下午06:14:04 
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2012-11-10     lipj        v1.0.0            修改原因
     */
    public IInsUserOsStateValue getInstUserOsStateValueByBillId(String billId)throws Exception,RemoteException;
    
    /**   
     * @Function: getOsStatusAndTime
     * @Description: 翻译停开机状态位
     *
     * @param:
     * @return：
     * @throws：Exception, RemoteException
     *
     * @version: v1.0.0
     * @author:  lipj@asiainfo-linkage.com
     * @date: 	 2012-11-12下午06:14:04 
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2012-11-12     lipj        v1.0.0            修改原因
     */
    public String getOsStatusAndTime(String sOsFlag,IInsUserOsStateValue insUserOsState)throws Exception,RemoteException;
        
    /**   
	  * @Function: getUserNetAge
	  * @Description: 根据手机号获取在网网龄，以月为单位
	  *
	  * @param: billId
	  * @return：int -1:根据该服务号码{0}不能查询到用户信息
	  * @throws：异常描述
	  *
	  * @version: v1.0.0
	  * @author: zhouwu
	  * @date: 2012-11-12 09:55:50  
	  *
	  * Modification History:
	  * Date         Author          Version            Description
	  *-------------------------------------------------------------*
	  * 11 30, 2012      zhouwu           v1.0.0               修改原因
	  */
	 public int getUserNetAge(String billId) throws Exception,RemoteException;
    

    /**
     *
     * @Function:
     * @Description: 店员积分推荐业务登记 ，提供给外围接口
     *
     * @param: billId 服务号码
     * @param: points 积分
     * @param: busiId 业务编码
     * @return：返回结果描述
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: zhangyb6
     * @date: 2012-11-14 下午2:01:02
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2012-11-14     zhangyb6           v1.0.0               new
     */
    public Map recordSalerPoints(String billId,String points,long busiID) throws RemoteException, Exception;
		
	/**   
	* @Function: insertDestroyUserTaskIm
	* @Description: 帐管出账完后，插入一条立即跑销户进程的task任务
	*
	* @param:@param regionId
	* @param:@throws RemoteException
	* @param:@throws Exception
	* @return：void
	* @throws：
	*
	* @version: v1.0.0
	* @author: xiaozhibi
	* @date: 2012-11-15下午04:25:17 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-11-15      xiaozhibi           v1.0.0               修改原因
	*/
	public void insertDestroyUserTaskIm(String regionId) throws RemoteException, Exception;

	/**
	 * @Function: dealLogOutOfferVasByKindId
	 * @Description: 根据策划组id，退订用户下的增值策划
	 * 
	 * @param:@param billId
	 * @param:@param userId
	 * @param:@param kindId，必传
	 * @param:@return
	 * @param:@throws Exception
	 * @param:@throws RemoteException
	 * @return：IBceDealReturnData
	 * @throws：
	 * 
	 * @version: v1.0.0
	 * @author: xiaozhibi
	 * @date: 2012-11-19下午04:51:11
	 * 
	 *        Modification History: Date Author Version Description
	 *        ---------------------------------------------------------*
	 *        2012-11-19 xiaozhibi v1.0.0 修改原因
	 */
	public IBceDealReturnData dealLogOutOfferVasByKindId(String billId,
			long userId, long kindId) throws Exception, RemoteException;
	/**
	 * 
	* Copyright: Copyright (c) 2012 Asiainfo-Linkage
	* 
	* @ClassName: ICrmFSV.java
	* @Description: 根据VpmnId查询客户Id
	*
	* @version: v1.0.0
	* @author: wangbin
	* @date: 2012-11-19 下午09:40:23 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-11-19     wangbin           v1.0.0               修改原因
	 */
	
	/**   
	* @Function: getGroupVpmnRelationByVpmnId
	* @Description: 根据VpmnId查询集团客户与V网关系
	*
	* @param
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: zhouwei9
	* @date: Nov 27, 2012 9:18:29 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Nov 27, 2012     zhouwei9         v1.0.0               修改原因
	*/
	public  DataContainerInterface[] getGroupVpmnRelationByVpmnId(String vpmnId) throws RemoteException, Exception;
	/**
	 * 
	* Copyright: Copyright (c) 2012 Asiainfo-Linkage
	* 
	* @ClassName: ICrmFSV.java
	* @Description: 根据客户ID查询VPMNID
	*
	* @version: v1.0.0
	* @author: wangbin
	* @date: 2012-11-19 下午09:48:36 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-11-19     wangbin           v1.0.0               修改原因
	 */

	/**   
	* @Function: getSpProdFirstOrder
	* @Description: 用户有无历史(首次)订购
	*
	* @param:@param userId
	* @param:@param prodId
	* @param:@param doneDate
	* @param:@return  1 有历史(首次)订购记录   0  无历史(首次)订购记录
	* @param:@throws RemoteException
	* @param:@throws Exception
	* @return：int
	* @throws：
	*
	* @version: v1.0.0
	* @author: xiaozhibi
	* @date: 2012-11-21下午05:06:01 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-11-21      xiaozhibi           v1.0.0               修改原因
	*/
	public int getSpProdFirstOrder(long userId,long prodId,Timestamp doneDate) throws RemoteException, Exception ;
	/**
	 * 
	* Copyright: Copyright (c) 2012 Asiainfo-Linkage
	* 
	* @ClassName: ICrmFSV.java
	* @Description: 根据成员手机号码查询集团客户信息
	*
	* @version: v1.0.0
	* @author: wangbin
	* @date: 2012-11-23 下午08:27:10 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-11-23     wangbin           v1.0.0               修改原因
	 */
	
	/**
     * @Function: getAccrelInfoByAcctIdOfSet
     * @Description: 通过账户获取账务关系数据
     *
     * @param:参数描述
     * @return：返回结果描述
     * @throws：异常描述
     *
     * @version: V1.0.0
     * @author: tangxy <tangxy@asiainfo-linkage.com>
     * @date: Nov 24, 2012 1:34:35 PM 
     *
     * Modification History:
     * Date                     Author          Version            Description
     *---------------------------------------------------------------------*
     * Nov 24, 2012  1:34:35 PM        tangxy          V1.0.0             Add
     *
     */
    public DataContainerInterface[] getAccrelInfoByAcctIdOfSet(long acctId, int payType, int aValidType,int startIndex,int endIndex) throws Exception, RemoteException;
	/***
	 * 
	* @Function: recoveryData
	* @Description: 数据修复接口
	*
	* @param: Date recovDate, List<Long> listOpId,
			long business_id, String RegionId
	*


	* @throws：Exception RemoteException
	*
	* @version: v1.0.0
	* @author: shaying
	* @date: 2012-11-28 下午2:39:49 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-11-2    shaying           v1.0.0               修改原因
	 */
    public void recoveryData(Date recovDate, List<Long> listOpId,
			long business_id, String RegionId) throws Exception,RemoteException ;
    
    
    /**
     * 如果该用户有被某个帐户全额代付（item_id=1220），则返回该帐户，否则返回该用户的默认付费帐户。
     * 
     * @param 

     * @return
     * @throws Exception
     * @throws RemoteException
     * @version 1.0
     * @author yaojx
     * @date 2012-9-13
     */
    public long getBaseAccrlByUserId(long userId) throws Exception, RemoteException;

    /**
     * 判断这个账户下的用户是否全是风险控制用户
     * @param acctId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public boolean isMonitorAcct(long acctId)throws Exception,RemoteException;

    
    /**   
    * @Function: saveOrdCustExtForSpecial
    * @Description: 0000统一查询退订为专用接口，在营业工单扩展表(Ord_Cust_Ext)记录，后续经分相关数据的抽取从此表关联
    *
    * @param:@param customerOrderId
    * @param:@throws Exception
    * @param:@throws RemoteException
    * @return：void
    * @throws：
    *
    * @version: v1.0.0
    * @author: xiaozhibi
    * @date: 2012-12-6下午06:31:26 
    *
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * 2012-12-6      xiaozhibi           v1.0.0               修改原因
    */
    public void saveOrdCustExtForSpecial(long customerOrderId) throws Exception,RemoteException;

    /**
     * 
    * @Function: getUpItemFeature
    * @Description:提供给客管调用,查询策划属性
    * @throws RemoteException
    * @return：返回结果描述
    * @throws：异常描述
    *
    * @version: v1.0.0
    * @author: zhuyu
    * @date: 2012/12/05
    */
	public IUpItemFeatureValue getUpItemFeature(long OfferId, long featureId) throws Exception,RemoteException;

	   /**   
	    * @Function: dealReopenUser
	    * @Description: 账务预销户后,用户缴费受理预销户重入网接口
	    *
	    * @param:@param billId
	    * @param:@param userId
	    * @param:@return
	    * @param:@throws Exception
	    * @param:@throws RemoteException
	    * @return：IBceDealReturnData
	    * @throws：
	    *
	    * @version: v1.0.0
	    * @author: xiaozhibi
	    * @date: 2012-11-16下午08:26:49 
	    *
	    * Modification History:
	    * Date         Author          Version            Description
	    *---------------------------------------------------------*
	    * 2012-11-16      xiaozhibi           v1.0.0               修改原因
	    */
	 public IBceDealReturnData dealReopenUser(String billId,long userId) throws Exception, RemoteException;
	 
	 /**
	  * 
	 * @Function: 
	 * @Description: 根据USER_ID  和OFFER_TYPE 查询家庭V网策划信息
	 *
	 * @param:
	 * @return：
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: xuwenbin
	 * @date: 2012-12-11 下午07:55:04  
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2012-12-11      xuwenbin        v1.0.0               修改原因
	  */
	 public DataContainerInterface[] getUserGroup(long userId,String offerType) throws Exception, RemoteException;

	    /**
	     * @Function: dealPreDestoryUserForManagerOsStop
	     * @Description: 为管理停机3次的用户做营业预销户
	     * @param:
	     * @return：
	     * @throws：异常描述
	     * @version: v1.0.0
	     * @author: xiaozhibi
	     * @date: Sep 7, 2012 11:25:26 AM
	     * <p/>
	     * Modification History:
	     * Date         Author          Version            Description
	     * ---------------------------------------------------------*
	     * Sep 7, 2012      xiaozhibi           v1.0.0               修改原因
	     */
	 public IBceDealReturnData dealPreDestoryUserForManagerOsStop(String billId,long userId) throws Exception, RemoteException;
	 
	 
	 /**
	 * @Description: 订购退订变更暂停恢复一起受理, 并记录策划的调帐信息
	 * 	<p> 	
	 * 		针对增值策划受理本月1号生效的情况， 在接口offerVASListStore的基础上增加了调帐功能
	 *  </p>
	 *
	 * @param userId
	 * @param billId
	 * @param offerVASList
	 * @param priceList
	 * @param validDate
	 * @param expireDate
	 * @param extendMap
	 *
	 * @version: v1.0.0
	 * @author:  MAJUN
	 * @date: 2012-12-15 下午05:24:30 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2012-12-15      MAJUN           v1.0.0               修改原因
	  */
	 public void offerVASListStoreForCurMonth(long userId, String billId, List offerVASList, List priceList, Timestamp validDate,
             Timestamp expireDate, Map extendMap) throws Exception, RemoteException;
	 
	    /**
	     * @Function: dealPreDestoryUserForManagerOsStop
	     * @Description: 首次密码重置
	     * @param:
	     * @return：
	     * @throws：异常描述
	     * @version: v3.0.0
	     * @author: yuezy
	     * @date:  12,18, 2012 11:25:26 AM
	     * <p/>
	     * Modification History:
	     * Date         Author          Version            Description
	     * ---------------------------------------------------------*
	     * 12,18, 2012      xiaozhibi           v1.0.0               修改原因
	     */
	 public Map firstResetPassword(String billId) throws Exception, RemoteException;
	 
	 /**
	  * 
	 * Copyright: Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName: ICrmFSV.java
	 * @Description: 根据账户ID查询该账户下的策划信息，给帐管提供接口
	 *
	 * @version: v1.0.0
	 * @author: wangbin
	 * @date: 2012-12-24 下午05:52:44 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2012-12-24     wangbin           v1.0.0               修改原因
	  */
	 public Map getUserOfferInfoByAcctId(long acctId)throws Exception, RemoteException;
	 
	  /**
	     * 
	    * @Function: isDialTestPhone 
	    * @Description: 校验是否为拨测手机号
	    *
	    * @param:参数描述
	    * @return：返回结果描述
	    * @throws：异常描述
	    *
	    * @version: v1.0.0
	    * @author: yal.fang
	    * @date: Dec 27, 2012 7:38:54 PM 
	    *
	    * Modification History:
	    * Date         Author          Version            Description
	    *---------------------------------------------------------*
	    * Dec 27, 2012     fangyl           v1.0.0               修改原因
	     */
	    public Map isDialTestPhone(String billId)throws Exception;
	    
		  /**
	     * 
	    * @Function: isDialTestPhone 
	    * @Description: 校验是否为拨测手机号
	    *
	    * @param:参数描述
	    * @return：返回结果描述
	    * @throws：异常描述
	    *
	    * @version: v1.0.0
	    * @author: yuezy
	    * @date: Dec 27, 2012 7:38:54 PM 
	    *
	    * Modification History:
	    * Date         Author          Version            Description
	    *---------------------------------------------------------*
	    * Dec 27, 2012     yuezy           v1.0.0               修改原因
	     */
	    public void delayResetPassword(String billId,String password)throws Exception,RemoteException;
	    
	    /**   
	    * @Function: checkIsCrossCenter
	    * @Description: 判断调用个人业务接口前是否需要跨中心，如果返回true，表示需要跨中心
	    * @param: @param billId
	    * @param: @param userId
	    * @param: @return
	    * @param: @throws Exception
	    * @param: @throws RemoteException
	    * @return：boolean
	    * @throws：
	    *
	    * @version: v1.0.0
	    * @author: xiaozb
	    * @date: 1:59:43 PM Jan 8, 2013 
	    *
	    * Modification History:
	    * Date         Author          Version            Description
	    *---------------------------------------------------------*
	    * Jan 8, 2013       xiaozb           v1.0.0               修改原因
	    */
	    public boolean checkIsCrossCenter(String billId,long userId) throws Exception,RemoteException;
	    
	    /**
	    * @Function: checkImeiBindOffer
	    * @Description: 校验该IMEI是否与活动有关系
	    *
	    * @param:IMEI 终端IMEI
	    * @return：
	    * @throws：异常描述
	    *
	    * @version: v1.0.0
	    * @author: liuke
	    * @date: 2013-1-9 下午04:48:30  
	    *
	    * Modification History:
	    * Date         Author          Version            Description
	    *---------------------------------------------------------*
	    * 2013-1-9      liuke           v1.0.0               修改原因
	     */
	    public Map checkImeiBindOffer(String Imei)throws Exception,RemoteException;

		/**
		* @Function: getUserBaseInfoByCustIdCount
		* @Description: 根据客户ID获取用户信息条数
		* 如果只提供custId则通过CM_INS_CMREL查询出该custid下所有用户信息，如果输入了billId或userId则只查询输入信息的用户
		* 优先级：UserId>BillId>CustId
		* @param: custId,客户id
        *         billId,计费号码
        *         userId,用户编号
        *         param,扩展map
		* @throws RemoteException
		* @return：count
		* @throws：Exception, RemoteException
		*
		* @version: v1.0.0
		* @author: zhangxiang3
		* @date: 10:57:19 AM August 5, 2013 
		*
		* Modification History:
		* Date         Author          Version            Description
		*---------------------------------------------------------*
		* August 5, 2013       zhangxiang3           v1.0.0               修改原因
		*/
		public int getUserBaseInfoByCustIdCount(long custId,String billId,long userId,Map param)throws Exception, RemoteException;
		
		
		/**   
		* @Function: getOrdCustCountByCustId
		* @Description: 根据客户ID获取用户未竣工的客户订单数
		* 如果只提供custId则通过CM_INS_CMREL查询出该custid下所有用户信息，如果输入了UserId则只查询输入信息的用户
		* 优先级：UserId>CustId
		* @param: custId,客户id
        *         userId,用户编号
        *         param,扩展map
		* @throws RemoteException
		* @return：count
		* @throws：Exception, RemoteException
		*
		* @version: v1.0.0
		* @author: zhangxiang3
		* @date: 10:57:19 AM August 5, 2013 
		*
		* Modification History:
		* Date         Author          Version            Description
		*---------------------------------------------------------*
		* August 5, 2013       zhangxiang3           v1.0.0               修改原因
		*/
		public int getOrdCustCountByCustId(long custId,long userId,Map param) throws Exception, RemoteException;
		
		
		/**   
		* @Function: getOrdCustCountByBillId
		* @Description: 根据计费号码获取用户未竣工的客户订单数
		* @param: billId,计费号码
		* @throws RemoteException
		* @return：count
		* @throws：Exception, RemoteException
		*
		* @version: v1.0.0
		* @author: zhangxiang3
		* @date: 10:57:19 AM August 5, 2013 
		*
		* Modification History:
		* Date         Author          Version            Description
		*---------------------------------------------------------*
		* August 5, 2013       zhangxiang3           v1.0.0               修改原因
		*/
		public int getOrdCustCountByBillId(String billId,Map param) throws Exception, RemoteException;
		
		
		/**   
		* @Function: getUserBaseInfoByCustIdAndCustType
		* @Description: 根据客户ID和客户类型获取用户信息
		* @param: custId,客户id,不传传0
		*         custType,不传传空
        *         param,扩展
		* @throws RemoteException
		* @return：BOInsUserCustInfoBean[]
		* custId;客户id
        * billId;计费号码
        * prodSpecId;产品规格id
        * prodSpecName;产品规格名称
        * simCard;卡号信息
        * userStatus;用户状态
        * offerType;策划类型
		* offerName;基本策划名称
		* offerId;基本策划id
		* offerCharge;基本策划的费用
		* offerDesc;基本策划描述
		* brandName;品牌
		* payType;付费类型
		* firstTime;入网时间
		* @throws：Exception, RemoteException
		*
		* @version: v1.0.0
		* @author: zhangxiang3
		* @date: 10:57:19 AM August 5, 2013 
		*
		* Modification History:
		* Date         Author          Version            Description
		*---------------------------------------------------------*
		* August 5, 2013       zhangxiang3           v1.0.0               修改原因
		*/
		public BOInsUserCustInfoBean[] getUserBaseInfoByCustIdAndCustType(long custId,String custType,Map param,int start,int end) throws Exception, RemoteException;
		
		
		/**   
		* @Function: getUserBaseInfoByCustIdAndCustTypeCount
		* @Description: 根据客户ID客户类型获取条数
		* @param: custId,客户id
        *         userId,用户编号
        *         param,扩展map
		* @throws RemoteException
		* @return：count
		* @throws：Exception, RemoteException
		*
		* @version: v1.0.0
		* @author: zhangxiang3
		* @date: 10:57:19 AM August 5, 2013 
		*
		* Modification History:
		* Date         Author          Version            Description
		*---------------------------------------------------------*
		* August 5, 2013       zhangxiang3           v1.0.0               修改原因
		*/
		public int getUserBaseInfoByCustIdAndCustTypeCount(long custId,String custType,Map param) throws Exception, RemoteException;

        /**
		* @Function: getUserAccInfo
		* @Description: 根据用户id拿到账户基本信息
		*         userId,用户编号
        *         param,扩展map
		* @throws RemoteException
		* @return：List Maps
		* INS_ACC IInsAccrelValue
		* ACCT_ID  账户id
		* ACCT_NAME  账户名称
		* CUST_NAME  客户名称
		* PAY_TYPE 付费关系类型  1:默认帐户 2:代付关系
		* ITEM_ID 付费项目编号
		* PAY_MODE 代付方式  1:全额 2:限额 3:比例
		* PAY_VALUE 代付值  PAY_MODE为1时全额，PAY_VALUE为全额，PAY_MODE为2时，PAY_VALUE即为MAX_PAY,PAY_VALUE为3时，MAX_PAY取比例
		* MAX_PAY  最高限额 见PAY_VALUE
		* @throws：Exception, RemoteException
		*
		* @version: v1.0.0
		* @author: zhangxiang3
		* @date: 10:57:19 AM August 14, 2013 
		*
		* Modification History:
		* Date         Author          Version            Description
		*---------------------------------------------------------*
		* August 14, 2013       zhangxiang3           v1.0.0               修改原因
		*/
		public List getUserAccInfo(long userId,Map param)throws Exception, RemoteException;

        /**
		* @Function: getUserProdsInfoTree
		* @Description: 客户360产品树
		* @throws RemoteException
		* @throws：Exception, RemoteException
		*
		* @version: v1.0.0
		* @author: gejun
		* @date: 10:57:19 AM August 14, 2013
		*
		* Modification History:
		* Date         Author          Version            Description
		*---------------------------------------------------------*
		* August 14, 2013       gejun           v1.0.0               修改原因
		*/
        public DataContainer[] getUserProdsInfoTree(long userId) throws Exception, RemoteException;

        public DataContainer[] query360UserAccrel(long userId) throws Exception, RemoteException;

        public DataContainerInterface[] query360VirtualUserList(long custId, String billId) throws Exception, RemoteException;
        
        
        
        /**
         * @Function: getSoBusiLogRecord
         * @Description: 用户业务受理记录查询，支持2个月内受理记录的查询
         * @param:serviceNum-服务号码
         * @param:startDate-开始时间  yyyy-MM-dd
         * @param:start 分页开始
         * @param:end 分页结束
         * @param:endDate-结束时间  yyyy-MM-dd
         * @return：返回结果描述  IBOSoBusiLogQueryValue
         * @throws：异常描述
         * @version: v1.0.0
         * @author: zhangxiang3
         * @date: Aug 21, 2013 10:27:44 AM
         * 
         * Modification History:
		 * Date         Author          Version            Description
		 *---------------------------------------------------------*
		 * August 14, 2013       zhangxiang3           v1.0.0               修改原因
         */
        public IBOSoBusiLogQueryValue[] getSoBusiLogRecord(String serviceNum, String startDate,
                                         String endDate,int start,int end) throws Exception, RemoteException;
        
        /**
         * @Function: getSoBusiLogRecordCount
         * @Description: 用户业务受理记录查询数，支持2个月内受理记录的查询
         * @param:serviceNum-服务号码
         * @param:startDate-开始时间  yyyy-MM-dd
         * @param:endDate-结束时间  yyyy-MM-dd
         * @return：返回结果描述  count
         * @throws：异常描述
         * @version: v1.0.0
         * @author: zhangxiang3
         * @date: Aug 21, 2013 10:27:44 AM
         * 
         * Modification History:
		 * Date         Author          Version            Description
		 *---------------------------------------------------------*
		 * August 14, 2013       zhangxiang3           v1.0.0               修改原因
         */
        public int getSoBusiLogRecordCount(String serviceNum, String startDate,
                                         String endDate) throws Exception, RemoteException;
        
        
        /**
         * @Function: getUserOrdInfo
         * @Description: 用户已竣工订单信息不支持跨月
         * @param:serviceNum-服务号码
         * @param:startDate-开始时间  yyyy-MM-dd
         * @param:endDate-结束时间  yyyy-MM-dd
         * @return：返回结果描述  BOOrdxUserPayInfo
         * @throws：异常描述
         * @version: v1.0.0
         * @author: zhangxiang3
         * @date: Aug 21, 2013 10:27:44 AM
         * 
         * Modification History:
		 * Date         Author          Version            Description
		 *---------------------------------------------------------*
		 * August 14, 2013       zhangxiang3           v1.0.0               修改原因
         */
        public BOOrdxUserPayInfoBean[] getUserOrdInfo(String billId,String startDate,String endDate,int start,int end) throws Exception, RemoteException;
        
        
        
        /**
         * @Function: getUserOrdInfoCount
         * @Description: 用户已竣工订单信息不支持跨月条数
         * @param:serviceNum-服务号码
         * @param:startDate-开始时间  yyyy-MM-dd
         * @param:endDate-结束时间  yyyy-MM-dd
         * @return：返回结果描述  count
         * @throws：异常描述
         * @version: v1.0.0
         * @author: zhangxiang3
         * @date: Aug 21, 2013 10:27:44 AM
         * 
         * Modification History:
		 * Date         Author          Version            Description
		 *---------------------------------------------------------*
		 * August 14, 2013       zhangxiang3           v1.0.0               修改原因
         */
        public int getUserOrdInfoCount(String serviceNum, String startDate,
                                         String endDate) throws Exception, RemoteException;
        
        /**
    	 * 
    	 * @Function: getOrdCustByBillIdAndStartEndDate
    	 * @Description: 根据用户id查询户客户订单，包括未竣工和竣工,支持3个月以内的历史订单查询
    	 *
    	 * @param billId
    	 * @param startDate yyyy-MM-dd
    	 * @param endDate yyyy-MM-dd  如果有一个未传则为查询当月
    	 * @param regionId
    	 * @param type 1:未竣工 ord_cust_地市 2:已竣工 ord_cust_f_地市_yyyyMM 3:all 
    	 * @return
    	 * @throws Exception
    	 * @throws RemoteException
    	 *
    	 * @version: v1.0.0
    	 * @author: zhangxiang3
    	 * @date: 2013-8-27
    	 *
    	 * Modification History:
    	 * Date							Author				Version				Description
    	 *------------------------------------------------------------------------------------*
    	 * 2013-8-27		       zhangxiang3		        v1.0.0					new
    	 */
        public IOrdCustValue[] getOrdCustByBillIdAndStartEndDate(String billId,String startDate,String endDate,String regionId,int type) throws Exception,RemoteException;
        
        /**
    	 * 
    	 * @Function: getOrdCustByUserIdAndStartEndDate
    	 * @Description: 根据用户id查询户客户订单，包括未竣工和竣工,支持3个月以内的历史订单查询
    	 *
    	 * @param userId
    	 * @param startDate yyyy-MM-dd
    	 * @param endDate yyyy-MM-dd  如果有一个未传则为查询当月
    	 * @param regionId
    	 * @param type 1:未竣工 ord_cust_地市 2:已竣工 ord_cust_f_地市_yyyyMM 3:all 
    	 * @return
    	 * @throws Exception
    	 * @throws RemoteException
    	 *
    	 * @version: v1.0.0
    	 * @author: zhangxiang3
    	 * @date: 2013-8-27
    	 *
    	 * Modification History:
    	 * Date							Author				Version				Description
    	 *------------------------------------------------------------------------------------*
    	 * 2013-8-27		       zhangxiang3		        v1.0.0					new
    	 */
        public IOrdCustValue[] getOrdCustByUserIdAndStartEndDate(long userId,String startDate,String endDate,String regionId,int type) throws Exception,RemoteException;

        /**
         * 根据客户ID，手机号、查询类型、开始结束日期及地域查询客户下的订单
         * @param custId
         * @param startDate
         * @param endDate
         * @param regionId
         * @param type 1：未竣工 2：已竣工 3：全部
         * @param billId
         * @return
         * @throws Exception
         * @throws RemoteException
         */
        public DataContainer[] query360OrdCustByCustIdAndStartEndDate(long custId, String startDate,String endDate,String regionId,int type,String billId,String circuitNumber,String CPENumber,String PONumber,int startIndex, int endIndex) throws Exception,RemoteException;

        /**
         * 根据客户ID，手机号、查询类型、开始结束日期及地域查询客户下的订单数
         * @param custId
         * @param startDate
         * @param endDate
         * @param regionId
         * @param type
         * @param billId
         * @return
         * @throws Exception
         * @throws RemoteException
         */
        public int query360OrdCustByCustIdAndStartEndDateCount(long custId, String startDate,String endDate,String regionId,int type,String billId,String circuitNumber,String CPENumber,String PONumber) throws Exception,RemoteException;
        
        public ISoOrderAttrTableValue[] queryMethod(String custOrderId,String regionId,String createDate,String OperateType) throws Exception, RemoteException;
        public ISoOrderAttrTableValue[] queryMethod(String custOrderId,String regionId,String createDate,String doneDate,String OperateType,int start, int end) throws Exception, RemoteException ;
        public int queryMethodCount(String custOrderId,String regionId,String createDate,String doneDate,String OperateType) throws Exception, RemoteException ;

        public DataContainer[] query360Contact(String customerId, String createDate,String endDate) throws Exception,RemoteException;

		public DataContainer[] qry360ContactItem(String customerCode,long regionID, String contactStartDate, long customerInteractionID,long itemBizID,long opID, long orgID, long requestReason) throws Exception;
        
        public DataContainer[] qry360BusiAttt(String customerCode, long regionID,String contactStartDate, long customerInteractionItemID, long opID,long orgID, long requestReason) throws Exception;
        

        /**
         * 根据集团客户ID查询集团客户订购的集团产品
         * @param custId
         * @return
         * @throws RemoteException
         * @throws Exception
         */
    	public DataContainerInterface[] queryGroupOffers(String custId)throws RemoteException,Exception ;
    	/**
    	 * 集团业务成员变更
    	 * @param custId
    	 * @param offerInstId
    	 * @param billId
    	 * @param opType 1：新增 2：删除
    	 * @return
    	 * @throws RemoteException
    	 * @throws Exception
    	 */
    	public Map dealGroupMem(String custId,String offerInstId,String billId,String opType)throws RemoteException,Exception ;
    	/**
    	 * 集团业务成员查询
    	 * @param custId
    	 * @param offerInstId
    	 * @param billId
    	 * @param custRegionId
    	 * @return
    	 * @throws Exception
    	 * @throws RemoteException
    	 */
        public DataContainerInterface[] queryGroupMemInfo(long custId,long offerInstId,String billId,String custRegionId)throws Exception,RemoteException;
        
        /**
    	 * 
    	 * @Function: getOrdCustByUserIdAndStartEndDate
    	 * @Description: 根据用户id查询户客户订单，包括未竣工和竣工,支持3个月以内的历史订单查询
    	 *
    	 * @param userId
    	 * @param startDate yyyy-MM-dd
    	 * @param endDate yyyy-MM-dd  如果有一个未传则为查询当月
    	 * @param regionId
    	 * @param type 1:未竣工 ord_cust_地市 2:已竣工 ord_cust_f_地市_yyyyMM 3:all 
    	 * @param start
    	 * @param end
    	 * @return
    	 * @throws Exception
    	 * @throws RemoteException
    	 *
    	 * @version: v1.0.0
    	 * @author: zhangxiang3
    	 * @date: 2013-8-27
    	 *
    	 * Modification History:
    	 * Date							Author				Version				Description
    	 *------------------------------------------------------------------------------------*
    	 * 2013-8-27		       zhangxiang3		        v1.0.0					new
    	 */
        public IOrdCustValue[] getOrdCustByUserIdAndStartEndDate(long userId,String startDate,String endDate,String regionId,int type,int start,int end) throws Exception,RemoteException;
        /**
     	 * 
     	 * @Function: getOrdCustByUserIdAndStartEndDateCount
     	 * @Description: 根据用户id查询户客户订单，包括未竣工和竣工,支持3个月以内的历史订单查询
     	 *
     	 * @param userId
     	 * @param startDate yyyy-MM-dd
     	 * @param endDate yyyy-MM-dd  如果有一个未传则为查询当月
     	 * @param regionId
     	 * @param type 1:未竣工 ord_cust_地市 2:已竣工 ord_cust_f_地市_yyyyMM 3:all 
     	 * @return count
     	 * @throws Exception
     	 * @throws RemoteException
     	 *
     	 * @version: v1.0.0
     	 * @author: zhangxiang3
     	 * @date: 2013-8-27
     	 *
     	 * Modification History:
     	 * Date							Author				Version				Description
     	 *------------------------------------------------------------------------------------*
     	 * 2013-8-27		       zhangxiang3		        v1.0.0					new
     	 */
         public int getOrdCustByUserIdAndStartEndDateCount(long userId,String startDate,String endDate,String regionId,int type) throws Exception,RemoteException;


    /**
     * 支付关系处理
     *
     * @param acctId 账户ID
     * @param billId 计费号---》主用户的计费号
     * @param users 成员列表
                 KEY{BILL_ID 手机号码
     *                  ITEM_ID 科目ID
     *                  OP_TYPE 操作类型（1增加，2修改，3删除）
     *                  PAY_TYPE 付费方式(2，按金额，3比例)
     *                  PAY_VALUE 设置值（代付值）
     *              }
     * @return
     * @throws Exception
     */
    public IBceDealReturnData uniAcctRelations(long acctId, String billId, List<Map> users) throws Exception;
    
    
     /**sim卡激活业务受理
    * @param billId 用户手机号码
    * @throws Exception
    * @throws RemoteException
    * add by  yinxy 2014/4/28
    */
    public IBceDealReturnData activatePreuser(String billId) throws Exception, RemoteException;
    
    /**   
     * @Function: ICrmFSV.java
     * @Description: 修改客户订单等待状态
     *
     * @param ordId 订单号
     * @throws Exception
     * @throws RemoteException
     * @return：返回结果描述
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: yaojx
     * @date: Apr 15, 2014 9:42:40 AM 
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * Apr 15, 2014     yaojx           v1.0.0               修改原因
     */
     public void finishOrdCustWaiting(long ordId,boolean isSuc,String errMsg)
 	throws Exception , RemoteException;
     public void batchFinishOrdCustWaiting(DataContainer[] dc)
  	throws Exception , RemoteException; 
     public void finishOrdCustWaitingByState(long ordId,String state)
  	throws Exception , RemoteException;
     /**   
    * @Function: ICrmFSV.java
    * @Description: 终端确认退还后判断押金是否可退
    *
    * @param insOfferId
    * @param regionId
    * @return
    * @throws Exception
    * @throws RemoteException
    * @return：返回结果描述
    * @throws：异常描述
    *
    * @version: v1.0.0
    * @author: yaojx
    * @date: May 21, 2014 11:14:04 AM 
    *
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * May 21, 2014     yaojx           v1.0.0               修改原因
    */
    public boolean isDepositRtn(DepositRtnReq dc) throws Exception , RemoteException;
    
    

	/**   
	* @Function: ICrmFSV.java
	* @Description: 该函数的功能描述
	*
	* @param orderNumber
	* @param itemInfo
	* @return
	* @throws Exception
	* @throws RemoteException
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: yaojx
	* @date: Aug 20, 2014 4:19:27 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Aug 20, 2014     yaojx           v1.0.0               修改原因
	*/
	public String stockReady(String orderNumber, List itemInfo) throws Exception, RemoteException;
	
	

	/**   
	* @Function: ICrmFSV.java
	* @Description: 该函数的功能描述
	*
	* @param orderNumber
	* @param goodsInfo
	* @return
	* @throws Exception
	* @throws RemoteException
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: yaojx
	* @date: Aug 20, 2014 4:19:30 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Aug 20, 2014     yaojx           v1.0.0               修改原因
	*/
	public String setGoodsInformation(String orderNumber, Timestamp shipmentDate,  List goodsInfo , String documentType) throws Exception, RemoteException;
    
    public IBceDealReturnData openNewUser(Map openParaMap) throws Exception, RemoteException;
    
    /**
     * 群组组网接口
     * @param paraMap {BILL_ID：主手机号 1,OFFER_ID:策划编号 1,
     * V_PROD_DATAS:ISoServicePkgData[]虚拟服务信息 ？,
     * V_ATTR_MAP:Map虚拟服务属性 ？,
     * MEMBER_LIST:成员信息MAP{
     * HashMap:{BILL_ID:成员手机号 1,SO_ATTR：Map服务属性 ？,SO_PROD:ISoServicePkgData[]服务信息 ？}
     * ...
     * } ？,
     * 
     * ACCT_INFO:Map 1{
     * cmAcctFrmAccount:DataContainerInterface 1
     * dc结构{
     * 	BANK_CONTRACT,
     * 	PAYMENT_ACCOUNT_TYPE,
     * 	CREDIT_VALUE,
     * 	ACCT_TYPE,
     * 	ACCT_BEHALF_PHONE,
     * 	REGION_ID,
     * 	ACCT_NAME,
     * 	PAYMENT_BANK_CODE,
     * 	PAYMENT_BANK_NAME,
     * 	INSTALLMENT_FLAG,
     * 	ACCT_EFFECTIVE_DATE,
     * 	PAYMENT_ACCOUNT,
     * 	PAYMENT_ACCOUNT_NAME,
     * 	CUST_ID,
     * 	ACCT_ID,
     * 	PAYMENT_ID,
     * 	ACCT_CREATE_DATE,
     * 	BANK_BEHALF_PHONE,
     * 	ACCT_EXPIRE_DATE,
     * 	PAY_METHOD,
     * 	ACCT_STATUS,
     * 	CREDIT_LEVEL
     * }
     * cmAcctFrmBillCycle:DataContainerInterface 1
     * dc结构{
     * 	REGION_ID,
     * 	EXPIRE_DATE,
     * 	CYCLE_TYPE,
     * 	EFFECTIVE_DATE,
     * 	BILL_DUE_DATE,
     * 	CYCLE_UNIT,
     * 	ACCT_ID,
     * 	CYCLE_ID,
     * 	BILL_DAY
     * }
     * },
     * 
     * CUST_INFO:Map 1{
     * cmCustFrmCustInfo:DataContainerInterface 1
     * dc结构{
     * 	CUST_ID,
     * 	CUST_NAME
     * }
     * },
     * 
     * ENTEND_MAP:Map,
     * REMARKS:备注信息 ?,BUSI_EXT1:通知方式 ?,BUSI_EXT2:通知对象 ?,
     * BUSI_EXT3:联系方式 ?, 
     * VALIDATE_TYPE:验证方式 ?,
     * CHANNEL_TYPE:渠道方式 ?
     * }
     * @return
     * @throws RemoteException
     * @throws Exception
     */
    public IBceDealReturnData createGroupNet(Map paraMap) throws RemoteException, Exception;
    
    /**
     * 群组组网接口
     * @param paraMap {BILL_ID：主手机号 1,OFFER_ID:策划编号 1,
     * }
     * @return
     * @throws RemoteException
     * @throws Exception
     */
	public IBceDealReturnData dealGrpDestroy(String billId, long userId, long offerId, Map extendMap) throws Exception, RemoteException;
    
    /**
     * 信用校验接口
     * @param Application_type 类型（枚举值：I:individual  B:bussiness）
     * @param custId   客户编码
     * @param accountId   账户Id 
     * @param Payment_method 支付方式(Y : PBS/Credit N: Cash)
     * @param ProductOtherInfo
     *           Number_of_SIM_cards  (备注：新开户数量为1     )
     *           Limit （ it can be empty）
     *           Transfer_of_mobile_number（备注：是否携转号码  Y/N   ）
     *           Agent_id (操作员Id)
     *           Conversion_of_prepaid (是否从预付费转后付费 Y/N, 新开户填值为N  )
     *           Applicant_ID  (传空值)
     *           Activation_type (A/M  默认填A (activation) First install  )
     *           Application_source_sys_id(默认值 400)
     *           Simcard_issued (Y/N    SIM card is handed out to customer )
     *           NumberOfInstallmentPlans (分期传1，不分期传0)
     *           
     * @return  TransactXmlData    Map 
     *              TransactData    Map 
     *                    RESULTS   
     *                           Transact_app_no (对端序列号)
     *                           Transact_SM_decision（结果枚举值：）
     *                         
     * 
     * 
     * @throws RemoteException
     * @throws Exception
     */
    public Map initTransactDecision(String Application_type,long custId, long accountId ,Map ProductOtherInfo)throws RemoteException, Exception;
    /**
     * 信用校验接口(重载，增加参数cprNum)
        * @param Application_type 类型（枚举值：I:individual  B:bussiness）
     * @param custId   客户编码
     * @param accountId   账户Id 
     * @param Payment_method 支付方式(Y : PBS/Credit N: Cash)
     * @param ProductOtherInfo
     *           Number_of_SIM_cards  (备注：新开户数量为1     )
     *           Limit （ it can be empty）
     *           Transfer_of_mobile_number（备注：是否携转号码  Y/N   ）
     *           Agent_id (操作员Id)
     *           Conversion_of_prepaid (是否从预付费转后付费 Y/N, 新开户填值为N  )
     *           Applicant_ID  (传空值)
     *           Activation_type (A/M  默认填A (activation) First install  )
     *           Application_source_sys_id(默认值 400)
     *           Simcard_issued (Y/N    SIM card is handed out to customer )
     *           NumberOfInstallmentPlans (分期传1，不分期传0)
     *           
     * @return  TransactXmlData    Map 
     *              TransactData    Map 
     *                    RESULTS   
     *                           Transact_app_no (对端序列号)
     *                           Transact_SM_decision（结果枚举值：）
     *                         
     * 
     * 
     * @throws RemoteException
     * @throws Exception
     */
    public Map initTransactDecision(String Application_type,long custId, long accountId, String cprNum, Map ProductOtherInfo)throws RemoteException, Exception;
    
    
    /**
     * 信用度查询接口
     * @param Transact_app_no   (信用度校验接口返回序列号)
     * @return
     *          TransactXmlData    Map 
     *              TransactData    Map 
     *                    RESULTS   
     *                           Transact_app_no (对端序列号)
     *                           Transact_SM_decision（结果枚举值：）
     *                         
     * @throws RemoteException
     * @throws Exception
     */
    public Map queryTransactCall(String Transact_app_no)throws RemoteException, Exception;
    
    /**
     * 信用度查询接口
     * @param Transact_app_no   (信用度校验接口返回序列号)
     * @return
     *          TransactXmlData    Map 
     *              TransactData    Map 
     *                    RESULTS   
     *                           Transact_app_no (对端序列号)
     *                           Transact_SM_decision（结果枚举值：）
     *                         
     * @throws RemoteException
     * @throws Exception
     */
    public Map queryTransactCall(String Transact_app_no,long custId)throws RemoteException, Exception;
    
    
    /**
     * 信用度修改接口
     * @param Application_type 类型（枚举值：I:individual  B:bussiness）
     * @param Transact_app_no  (信用度校验接口返回序列号)
     * @param custId  客户编码
     * @param accountId 账户编码
     * @param Payment_method 支付方式(Y : PBS/Credit N: Cash)
     * @param ProductOtherInfo
     *           Number_of_SIM_cards  (备注：新开户数量为1)
     *           Limit 
     *           Transfer_of_mobile_number（备注：是否携转号码  Y/N）
     *           Agent_id (操作员Id)
     *           Conversion_of_prepaid (是否从预付费转后付费 Y/N,只有业务便跟需要关注，其余填N)
     *           Applicant_ID  
     *           Activation_type (A/M  默认填A (activation) First install)
     *           Application_source_sys_id(默认值)
     *           Simcard_issued （Y/N 默认填N）
     *           numberOfInstallmentPlans (分期传1，不分期传0)
     *           
     * 
     * @return   Map   TransactXmlData
     *                @param  Map  TransactData
     *                      @param   Map  RESULTS
     *                          @param  Transact_app_no 序列号
     *                          @param  Transact_SM_decision  (A accepted,R Refered,D Declined)
     *                          @param  General_error_code
     * @throws RemoteException
     * @throws Exception
     */
    public Map updateTransactCall(String Application_type,String Transact_app_no,long custId,long accountId,Map ProductOtherInfo)throws RemoteException, Exception;
    /**
     * 信用度修改接口(重载，增加参数cprNum)
     * @param Application_type 类型（枚举值：I:individual  B:bussiness）
     * @param Transact_app_no  (信用度校验接口返回序列号)
     * @param custId  客户编码
     * @param accountId 账户编码
     * @param Payment_method 支付方式(Y : PBS/Credit N: Cash)
     * @param ProductOtherInfo
     *           Number_of_SIM_cards  (备注：新开户数量为1)
     *           Limit 
     *           Transfer_of_mobile_number（备注：是否携转号码  Y/N）
     *           Agent_id (操作员Id)
     *           Conversion_of_prepaid (是否从预付费转后付费 Y/N,只有业务便跟需要关注，其余填N)
     *           Applicant_ID  
     *           Activation_type (A/M  默认填A (activation) First install)
     *           Application_source_sys_id(默认值)
     *           Simcard_issued （Y/N 默认填N）
     *           numberOfInstallmentPlans (分期传1，不分期传0)
     *           
     * 
     * @return   Map   TransactXmlData
     *                @param  Map  TransactData
     *                      @param   Map  RESULTS
     *                          @param  Transact_app_no 序列号
     *                          @param  Transact_SM_decision  (A accepted,R Refered,D Declined)
     *                          @param  General_error_code
     * @throws RemoteException
     * @throws Exception
     */
    public Map updateTransactCall(String Application_type,String Transact_app_no,long custId,long accountId, String cprNum, Map ProductOtherInfo)throws RemoteException, Exception;
    
    //NP CRM 对外围提供的接口
    /**
     * 
     * @param paraMap{	OrderId:VerisCRM’s NP order ID 必传  String,
     * 					BusinessType:枚举值以及含义见RBossConst。NP_RESULT_RESPONSE_BUSINESS_TYPE_(1/2/3)  必传  String,
     * 				    ResponseType:枚举值以及含义见RBossConst。NP_RESULT_RESPONSE_RESPONSE_TYPE_(SUC/FAIL)  必传  String,
     * 					Reason:原因    必传  String
     * 					}
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map npResultResponse(Map paraMap)throws Exception,RemoteException;
    
    /**
     * 
     * @param paraMap{	CustomerId:CustomerId(客户编号) 可传  String,
     * 					OrderId:VerisCRM’s NP order ID  必传  String,
     * 					ConfirmedDate:确认时间，格式yyyymmddhhmmss  可传   String,
     * 					IsUpdate:是否修改， 这个是携出方再次修改confirmed date用的 true是修改   必传   boolean,
     * 					ResponseType:RBossConst。PORT_IN_RESPONSE_RESPONSE_TYPE_(CONFIRM/REJECT) 必传  String,
     * 					RejectCode:RBossConst。PORT_IN_RESPONSE_REJECT_CODE_(100/110/130/160/200) 可传  String,
     * 					RejectReason:拒绝原因 RBossConst。PORT_IN_RESPONSE_REJECT_REASON_(330/338/339/349/350/351/352/353/355/356/376/378/379/380/382/383) 可传多个  String数组
     * 					}
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map portInResponse(Map paraMap)throws Exception,RemoteException;
    /**
     * crmService
     * @param paraMap{	CustomerId:CustomerId(客户编号) 可填 String,
     * 					OrderId:Recipient’s order ID 必填 String,
     * 					Message:message 可填 String
     * 					}
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map cancel(Map paraMap)throws Exception,RemoteException;
    /**
     * 
     * @param paraMap{	CustomerId:CustomerId(客户编号) 可填 String,
     * 					OrderId:Recipient’s order ID 必填 String,
     * 					}
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map orderFinished(Map paraMap)throws Exception,RemoteException;
    /**
     * 
     * @param paraMap{	OrderId: Recipient’s order ID 必传 String,
     * 					CurrentCustomerId:当前客户编号  可传 String,
     * 					CurrentIcc:This field is used to hold the ICC number as written on the SIM Card 可传 Stirng,
     * 					CurrentNumberType:当前号码类型  RBossConst.NUMBER_TYPE_(GSM/FIXED) 必传  String,
     * 					CurrentServiceOperator:当前服务运营商  必传 String,
     * 					MainNumber:主号码  必传 String,
     * 					NumberSeries:副号码   是个List List里面可放多个map{		SeriesStart:开始序列号码  必传 String,
     * 																SeriesEnd:结束序列号码  必传  String
     * 																}
     * 					PointOfConnection:谁负责联系客户   PORT_OUT_REQUEST_POINT_OF_CONNECTION_(DONOR/RECIPIENT)  可传 String,
     * 					RecipientServiceOperator:接收的服务运营商  必传 String,
     * 					RecipientNetworkOperator:接收的网络运营山  必传 String,
     * 					RequestedExecutionDate:请求执行的时间  可传  格式:yyyymmddhhmmss String
     * 					}
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map portOutRequest(Map paraMap)throws Exception,RemoteException;
    /**
     * 
     * @param paraMap{	OrderId:Recipient’s order ID 必填 String,
     * 					TerminateDate:Date of termination 可填 String,
     * 					CustomerId:CustomerId(客户编号) 可填 String,
     * 					FromOperator:FromOperator(来自运营商) 可填 String,
     * 					MainNumber:MainNumber(主号码) 必填 String,
     * 					NumberSeries:副号码   是个List List里面可放多个map{	SeriesStart:开始序列号码  必传 String,
     * 																SeriesEnd:结束序列号码  必传  String
     * 																}
     * 					}
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map returnNumber(Map paraMap)throws Exception,RemoteException;
    /**
     * 
     * @param paraMap{	CountryCode:国家编码    RBossConst.COUNTRY_CODE_(DK/HU) 必传 String ,
     * 					TelephoneNumber:手机号码   必传   String,
     * 					NumberType:号码类型   RBossConst.NUMBER_TYPE_(GSM/FIXED) 必传  String,
     * 					RequestedExecutionDate:请求执行的时间  可传  格式:yyyymmddhhmmss String,
     * 					NumberSeries:副号码   是个List List里面可放多个map{	SeriesStart:开始序列号码  必传 String,
     * 																SeriesEnd:结束序列号码  必传  String
     * 																}
     * 					}
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map checkPortOutRuleForEachNumber(Map paraMap)throws Exception,RemoteException;
    	/**
     * 
     * @param paraMap{	CountryCode:国家编码   RBossConst.COUNTRY_CODE_(DK/HU)  必传 String ,
     * 					TelephoneNumber:手机号码   必传   String,
     * 					NumberType:号码类型   RBossConst.NUMBER_TYPE_(GSM/FIXED) 必传  String,
     * 					ErrorCode:错误码   必传    枚举值具体含义，是在ErrorName体现的    RBossConst.SYNC_NP_ERROR_ERROR_CODE_   String,
     * 					ErrorName:错误名称 必传    String,
     * 					OrderId:VerisCRM’s NP order ID 必传  String,
     * 					ErrorMsg:错误信息  必传   String
     * 					}
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map syncNpError(Map paraMap)throws Exception,RemoteException;
    /**
     * 
     * @param paraMap{	CountryCode:国家编码   RBossConst.COUNTRY_CODE_(DK/HU)  必传 String ,
     * 					TelephoneNumber:手机号码   必传   String,
     * 					NumberType:号码类型   RBossConst.NUMBER_TYPE_(GSM/FIXED) 必传  String
     * 					}
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map getPortOutRuleInfo(Map paraMap)throws Exception,RemoteException;

    /**
	 * 换卡处理（SIM）
	 * @param param map{
	 * USER_ID：用户编号,
	 * ICC_ID:SIM卡号（可无 -- 无的话走SAP要）
	 * IS_ACTIVTED:0 激活
	 * CARD_TYPE：卡类型
	 * ADDRESS：Map 地址
	 * REASON：换卡原因
	 * 
	 * Material:规格,
	 * Quantity:数量,
	 * SalesUnit:单位,
	 * NetPrice:价格,
	 * VatAmount:,
	 * SerialNo：,
	 * outletId:营业厅编号
	 * }
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
 	public IBceDealReturnData changeSimCard(Map param) throws Exception , RemoteException;
     /**
 	 * 用户Id查询用户的补换卡的且未激活的订单信息
 	 * @param userId 用户ID
 	 * @return BOInsxUserBakSimBean 备卡记录 （未查到返回NULL）
 	 * @throws Exception
 	 * @throws RemoteException
 	 */
 	public BOInsxUserBakSimBean qryNoActivedSimCard(long userId) throws Exception , RemoteException;
 	
 	/**
	 * 查询换卡费用
	 * @param billId 手机号
	 * @param reason 换卡原因
	 * @return map{
	 * FACT_MONEY:实收（单位：分）
	 * SHOULD_MONEY:应收（单位：分）
	 * PRICE_NAME:资费名称
	 * }
	 * 没查到返回NULL
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map qryChangeSimCardFee(String billId,String reason) throws Exception , RemoteException;
	
    /**
     * @Function: 	 bakSimcardDel
     * @Description: 备卡删除
     *
     * @param:   userId  simcardNo 均必填
     * @return:	 map  返回"DoneCode"为订单
     * @throws:  Exception, RemoteException
     *
     * @version: v1.0.0
     * @author:  liuxl9@asiainfo-linkage.com
     * @date: 	 2014-09-14
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2014-09-11     liuxl9        v1.0.0            修改原因
     */
	public Map bakSimcardDel(long userId,String simcardNo) throws Exception, RemoteException;
	
    /**
     * @Function: 	 bakSimcardActive
     * @Description: 备卡激活
     *
     * @param:   userId  simcardNo activeType 均必填  activeType  传0或者1  1为同时复机
     * @return:	 map  返回"DoneCode"为订单  激活后insx_user_bak_sim 表状态为 2
     * @throws:  Exception, RemoteException
     *
     * @version: v1.0.0
     * @author:  liuxl9@asiainfo-linkage.com
     * @date: 	 2014-09-14
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2014-09-11     liuxl9        v1.0.0            修改原因
     */
	public Map bakSimcardActive(long userId,String simcardNo , int activeType) throws Exception, RemoteException;
	 public DataContainer[] query360UserList(long custId, String custType, long userId) throws Exception, RemoteException ;
	 
	 /**
	  * 开通信息
	  * @return
	  * 
	  */
	public DataContainerInterface openInformation(long custOrderId,String createDate) throws Exception, RemoteException ;
    /**
     * 查询用户主策划下的可订购的增值策划信息，按目录分类
     *
     * @param billId
     * @param userId
     * @param List catalogList
     * @return List<map>
     * @throws Exception
     * @throws RemoteException
     */
	 public List getUserAvailVasOfferList(String billId,long userId , List<Long> catalogList)throws Exception,RemoteException;
    /**
     * @Function: 	 qryPoaValues
     * @Description: 提供OSE 查询Poa信息
     *
     * @param:   long customerOrderId
     * @return:	 IBOOrdPortinPoaValue  Poa信息
     * @throws:  Exception, RemoteException
     *
     * @version: v1.0.0
     * @author:  liuxl9@asiainfo-linkage.com
     * @date: 	 2014-09-22
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2014-09-22     liuxl9        v1.0.0            修改原因
     */
	public IBOOrdPortinPoaValue qryPoaValues(long customerOrderId) throws Exception, RemoteException;
	
    /**
     * @Function: 	 saveOrdPortinPoaValue
     * @Description: 提供OSE 查询Poa信息
     *
     * @param:   IBOOrdPortinPoaValue 中customerOrderId  必传
     * @return:	 IBOOrdPortinPoaValue  Poa信息
     * @throws:  Exception, RemoteException
     *
     * @version: v1.0.0
     * @author:  liuxl9@asiainfo-linkage.com
     * @date: 	 2014-09-22
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2014-09-22     liuxl9        v1.0.0            修改原因
     */
	public void saveOrdPortinPoaValue(IBOOrdPortinPoaValue  poaValue) throws Exception, RemoteException;
	
    /**
     * @Function: 	 destorySpecialPrepayUser
     * @Description: 提供网厅  对部分预付费用户做销户 不涉及罚金和其他信息  仅销户
     *
     * @param:   
     * @return:	 
     * @throws:  Exception, RemoteException
     *
     * @version: v1.0.0
     * @author:  liuxl9@asiainfo-linkage.com
     * @date: 	 2014-09-23
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2014-09-23     liuxl9        v1.0.0            修改原因
     */
	public IBceDealReturnData destorySpecialPrepayUser(String billId,long userId) throws Exception, RemoteException;
	
    /**
     * @Function: 	 dealPreTermination
     * @Description: 预销户接口(通用版)
     * @param:  quitReason ,bookingDate 必传  extendMap内为特殊处理 其中PORTOUT_STATE为port_out时状态  0正确 1错误
     * @return:	 
     * @throws:  Exception, RemoteException
     *
     * @version: v1.0.0
     * @author:  liuxl9@asiainfo-linkage.com
     * @date: 	 2014-09-24
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2014-09-24     liuxl9        v1.0.0            修改原因
     */
	public IBceDealReturnData dealPreTermination(String billId,long userId ,String quitReason ,Timestamp bookingDate ,String remarks ,Map extendMap) throws Exception, RemoteException;
	/**
	 * Port Out 流程 调用销户接口
	 * @param billId
	 * @param userId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void dealPreTermination(String billId) throws Exception, RemoteException ;
	
	/**
     * 订购与退订同时受理且支持多条记录同时操作
     *
     * @param ServiceNum
     * @param vasAddOfferInfo 订购集合
     * @param vasCancelOfferInfo 退订集合
     * @return Map
     * @throws Exception
     * @throws RemoteException
     * */
	public Map AddRemoveService(String ServiceNum, List vasAddOfferInfo , List  vasCancelOfferInfo)
	throws Exception, RemoteException;
	
	
	/**
     * @Function: createBatch
     * @Description: 保存购物车cart Obj
     *
     * @param custId
     * @return cartId
     * @throws Exception
     *
     * @version: v1.0.0
     * @author: zhangxiang3
     * @date: Dec 16, 2011 4:36:13 PM
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2014-9-24  zhangxiang3       v1.0.0               修改原因
     */
	public long createBatch(long custId) throws Exception; 
	
	
	/**
     * @Function: addBatchItem
     * @Description: 保存购物项
     *
     * @param long cartId,long custId,String billId,long offerId,String offerName,String opType,int relatId,Map detailInfo(报文)
     * @return cartId
     * @throws Exception
     *
     * @version: v1.0.0
     * @author: zhangxiang3
     * @date: Dec 16, 2011 4:36:13 PM
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2014-9-24  zhangxiang3       v1.0.0               修改原因
     */
	public long addBatchItem(long cartId,long custId,String billId,long offerId,String offerName,String opType,long relatId,String relatType,Map detailInfo) throws Exception;

	
	/**
     * @Function: deleteBatchItem
     * @Description: 删除购物项
     *
     * @param long cartId,long custId,String billId,long offerId,String offerName,String opType,int relatId,Map detailInfo(报文)
     * @return boolean
     * @throws Exception
     *
     * @version: v1.0.0
     * @author: zhangxiang3
     * @date: Dec 16, 2011 4:36:13 PM
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2014-9-24  zhangxiang3       v1.0.0               修改原因
     */
	public boolean deleteBatchItem(long cartId,long itemId) throws Exception;
	
	
	/**
     * @Function: clearBatch
     * @Description: 清空批量
     *
     * @param long cartId
     * @return boolean
     * @throws Exception
     *
     * @version: v1.0.0
     * @author: zhangxiang3
     * @date: Dec 16, 2011 4:36:13 PM
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2014-9-24  zhangxiang3       v1.0.0               修改原因
     */
	public boolean clearBatch(long cartId) throws Exception;
	
	/**
     * @Function: dropBatch
     * @Description: 删除批量
     *
     * @param long cartId
     * @return boolean
     * @throws Exception
     *
     * @version: v1.0.0
     * @author: zhangxiang3
     * @date: Dec 16, 2011 4:36:13 PM
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2014-9-24  zhangxiang3       v1.0.0               修改原因
     */
	public boolean dropBatch(long cartId) throws Exception;
	
	/**
     * @Function: 提交批量订单
     * @Description: commitBatch
     *
     * @param long cartId
     * @return Map
     * @throws Exception
     *
     * @version: v1.0.0
     * @author: zhangxiang3
     * @date: Dec 16, 2011 4:36:13 PM
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2014-9-24  zhangxiang3       v1.0.0               修改原因
     */
	public Map commitBatch(long cartId) throws Exception;
	/**
	 * 
	 * <p>Title: commitBatch</p>  
	 * <p>Description: </p>  
	 * @param cartId
	 * @param cartStockType
	 * @return
	 * @throws Exception  
	 * @author zouling  
	 * @date 2018年11月28日  
	 * @version SR 0.83
	 */
	public Map commitBatch(long cartId,String cartStockType,Map extMap) throws Exception;
	
	/**
     * @Function: 批量订单查询
     * @Description: selectOrder
     *
     * @param long cartId
     * @return Map
     * @throws Exception
     *
     * @version: v1.0.0
     * @author: zhangxiang3
     * @date: Dec 16, 2011 4:36:13 PM
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2014-9-24  zhangxiang3       v1.0.0               修改原因
     */
	public Map selectOrder(long customerOrderId) throws Exception;
	
	/**
     * @Function: getPricePlanDetailForCart
     * @Description: 获得价格
     * @param long cartId
     * @param long custId
     * @return boolean
     * @throws Exception
     *
     * @version: v1.0.0
     * @author: zhangxiang3
     * @date: Dec 16, 2011 4:36:13 PM
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2014-9-24  zhangxiang3       v1.0.0               修改原因
     */
	public DataContainerInterface[] getPricePlanDetailForCart(long cartId, long custId) throws Exception;
	
	/**
     * @Function: getPricePlanDetailSingle
     * @Description: 获得单个价格
     * @param long cartId
     * @param long itemId
     * @return boolean
     * @throws Exception
     *
     * @version: v1.0.0
     * @author: zhangxiang3
     * @date: Dec 16, 2011 4:36:13 PM
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2014-9-24  zhangxiang3       v1.0.0               修改原因
     */
	public DataContainerInterface[] getPricePlanDetailSingle(long cartId, long itemId) throws Exception;
	
	/**
     * 查询用户的合约记录
     *
     * @param userId 用户编号
     * @param commitType 订购集合 （0、所有 1、 不允许再次办理优惠购机业务 2、基本套餐协议期  3、增值策划的协议期）
     * @param offerId 策划编号
     * @param offerInstId 策划实例编号
     * @param validType 生效类型（-1：所有（含本周期、下周期生效）、1 当前生效（本周期）、2 未生效（下周期））
     * @param extendMap 扩展使用
     * @return IInsCommitmentValue[] 合约对象数组
     * @throws Exception
     * @throws RemoteException
     * */
	public IInsCommitmentValue[] getInsCommitValue(long userId, int commType, long offerId, long offerInstId, int validType, Map extendMap) throws Exception, RemoteException;


    /**
	 * 修改增值策划的生效时间
	 * @param prodInstId 产品实例
	 * @param userId 用户编号
	 * @param validDate 生效时间 
	 * @return 
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IBceDealReturnData updateOfferVarEffTime(long prodInstId,long userId, Timestamp validDate) throws Exception , RemoteException;
	
	/**
	 * 查询huntingplan下的voicemail业务的mail邮箱号码，是个属性。
	 * @param serverNum
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
    public String getVoiceMailNumber(String serverNum)throws Exception,RemoteException ;
    
    /**
	 * 根据手机号MSISDN查询当前及历史账户信息
	 * @param ServerNum
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 */

	public Map search(String ServerNum) throws RemoteException, Exception;
	
	/**
	 *  GetSubscriberServiceSetup 获取可订购的服务。只针对multiplan业务
	 * @param serviceNum 手机号码
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 */
	
	public Map getSubscriberServices(String serviceNum)throws RemoteException, Exception;
	
	/**
	 *  vpn短号修改
	 * @param offerInstId   策划实例编号
	 * @param billId        成员号码
	 * @param ShortNumber   成员短号
	 * @param channelType   受理渠道
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 */
	public void changeMemShortNumber(long offerInstId, String billId, String shortNumber, String channelType) throws Exception, RemoteException;
	/**
	 * 
	 * @Function qryAddressByDetailAddr
	 * @Description <br>OSE进行固网开户地址查询接口
	 * 				<br>参看'营业受理.pdm'
	 * 				<br>'SELECT * FROM party.`insx_user_address` t;'
	 *				<br><b>不赞成使用<b>
	 * @param addressMap 该map不能为null，里面的（key，value）可以为空,即addressMap.size()可以为0
	 *   <br>按需put<br>
	 *   (key,value)--(String,String)<br>
	 *   houseNo<br>
	 *   mainDoor<br>
	 *   floor<br>
	 *   doorNo<br>
	 *   zipCode<br>
	 *   city<br>
	 *   street<br>
	 *   county<br>
	 * 
	 * 
	 * @param state 不可为"",null;应为0,1
	 * @return 如果为查询为空,或者异常,返回空的数组[0],不是null
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version v1.0.0
	 * @author zhangyy3
	 * @date 2014年10月9日 上午10:07:00
	 * @deprecated
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014年10月9日     zhangyy3           v1.0.0               修改原因<br>
	 */
    @Deprecated
	public IBOInsxUserAddressValue[] qryAddressByDetailAddr(Map<String,String> addressMap, String state)throws Exception, RemoteException;
	/**
	 * 
	 * @Function getBaseOfferNew
	 * @Description OSE进行固网开户,根据地址查询到可选产品（基础套餐）接口
	 *
	 * @param userKind 用户分类编码,必填,RBossConst.USER_KIND_Broadband||RBossConst.USER_KIND_FixedPhone
	 * @param SEL_CO 选填,后期调用如下<br>
	 * 		JSONObject json = JSONObject.fromObject(SEL_CO);<br>       
	       	Map map=new HashMap();<br>
	       	map.put("technologies", Equipment.class);<br>
	       	CoInfo colinfo =(CoInfo) JSONObject.toBean(json,CoInfo.class,map);<br>
	 * <br>CoInfo:<br>
	 * 	private String coName;<br>
		private String coKind;<br>
		private String coType;<br>
		private String coDesc;<br>
		private String visitService;//GDS,GIG<br>
		private String hasPstn; // Y/N<br>
		private String pstnNumber;<br>
		private float db150; // 39.22<br>
		private String isDefault; // Y/N<br>
		private List<Equipment> technologies;<br>
	 * <br>
	 * <br>
	 * @param keyWord 策划名称(offerName)中包含的字符,选填
	 * @param code 策划id(offerId),选填.用于条件过滤,如果存在code,将过滤掉对应的Offer
	 * @param tariffRangeId 资费区间,无参数时传入-1
	 * @param catalogId 宽带套餐选择目录,选填,无参数时出入-1,参考RBossConst.SO_BROADBAND_CATALOGID_BASE,SO_BROADBAND_CATALOGID_GROUP
	 * @param custType 选填
	 * @param extMap 扩展参数<br>
	 * 		  key-------------------value
	 * 		  districtId------------县市(String)
	 * 		  custId----------------客户id(String)
	 *        channelType-----------渠道类型(String)
	 *        contractOffers--------合约策划(String[])
	 * 			
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version v1.0.0
	 * @author zhangyy3
	 * @date 2014年10月9日 上午10:39:27
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014年10月9日     zhangyy3           v1.0.0               修改原因<br>
	 */
	public DataContainerInterface[] getBaseOfferNew(String userKind,
			 String SEL_CO, String keyWord, String code,
			long tariffRangeId, long catalogId, String custType,Map<String,Object> extMap)
			throws Exception, RemoteException;
	/**
	 * 
	 * @Function getVasOfferNew
	 * @Description OSE进行固网开户,根据基础套餐地址等信息查询可订购的Voip、Cpe类增值策划
	 *
	 * @param offerId 基本套餐Id 必传参数
	 * @param code 策划id(offerId),用于条件过滤,如果存在code,将过滤掉对应的Offer,选填
	 * @param keyWord 策划名称(offerName)中包含的字符,选填
	 * @param catalogId  宽带套餐选择目录,选填,无参数时出入-1
	 * @param extMap	扩展参数,已加入:<br>
	 * 				key------------------------value<br>
	 * 				districtId-----------------县市(String)<br>
	 * 				selectOfferType------------选择套餐类型(String)<br>
	 * 				custId---------------------客户id(String)<br>
	 * 				channelType----------------渠道类型(String)<br>
	 * 				contractOffers-------------合约策划(String[])<br>
	 * 
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version v1.0.0
	 * @author zhangyy3
	 * @date 2014年10月9日 下午1:51:13
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014年10月9日     zhangyy3           v1.0.0               修改原因<br>
	 */
	public DataContainerInterface[] getVasOfferNew(long offerId,
			 String code, String keyWord, long catalogId,Map<String,Object> extMap)
			throws Exception, RemoteException;
	/**
	 * 
	 * @Function validateAddress
	 * @Description OSE进行固网开户,校验地址
	 *
	 * @param validAddress 校验地址,map类型的JSON String, <br>json串 {houseNo（楼号）=,mainDoor（正门）=,floor（楼层）=,county（县）=,street（街道）=,doorNo（门牌号）=,zipCode（邮编）=,city（城市）=}
	 * @param regionId 客户regionId
	 * @param custId 客户编号
	 * @param billId 服务号码
	 * @param reqOrderId 请求订单编号,第一次请求校验可传""
	 * @param custOrderId 客户订单Id
	 * @return
	 * 			Map<String,String><br>
	 * 			key-----------value<br>
	 * 			retCode-----N=not useable,Y=useable,E=exception,error occured<br>
	 * 			retMsg------Y=success,N=reason,E=e.getMessage();<br>
	 * 			orderId-----reqOrderId,请求订单编号<br>
	 * 
	 * 			
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version v1.0.0
	 * @author zhangyy3
	 * @date 2014年10月9日 下午5:33:31
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014年10月9日     zhangyy3           v1.0.0               修改原因<br>
	 */
	public Map<String, String> validateAddress(String validAddress,
			String regionId, long custId, String billId, String reqOrderId,
			long custOrderId) throws Exception, RemoteException;
	
	/**
	 * 
	 * @Function onLinePreQ
	 * @Description OSE进行固网开户,Online pre-q
	 *
	 * @param validAddress 校验地址,map类型的JSON String, <br>json串 {houseNo（楼号）=,mainDoor（正门）=,floor（楼层）=,county（县）=,street（街道）=,doorNo（门牌号）=,zipCode（邮编）=,city（城市）=}
	 * @param regionId 客户regionId
	 * @param custId 客户编号
	 * @param billId 服务号码
	 * @param reqOrderId 请求订单编号,第一次请求校验可传""
	 * @param custOrderId 客户订单Id
	 * @return
	 * 			Map<String,String><br>
	 * 			key-----------value<br>
	 * 			retCode-----N=not useable,Y=useable,E=exception,error occured<br>
	 * 			retMsg------Y=success,N=reason,E=e.getMessage();<br>
	 * 			orderId-----reqOrderId,请求订单编号<br>
	 * 
	 * 			
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version v1.0.0
	 * @author huangsr
	 * @date 2017年04月18日 下午5:33:31
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 */
	public Map<String, String> onLinePreQ(String validAddress,
			String regionId, long custId, String billId, String reqOrderId,
			long custOrderId) throws Exception, RemoteException;
	
	/**
	 * 
	 * @Function getValidateAddress
	 * @Description OSE进行固网开户,获取地址
	 *
	 * @param reqOrderId 请求订单编号(must be)
	 * @param custId(must be)
	 * @param billId(must be)
	 * @param validateAddress 校验地址信息(must be) <br>json串 {houseNo（楼号）=,mainDoor（正门）=,floor（楼层）=,county（县）=,street（街道）=,doorNo（门牌号）=,zipCode（邮编）=,city（城市）=}
	 * @return	Map<String,String><br>
	 * 不同的情况,返回值不相同<br>retVal每种情况均有返回<br>
	 * <br>1--------------------------<br>
	 * 当retVal=Y时,返回正常的信息:<br>
	 * retVal=Y<br>
	 * coInfo=list<\CoInfo>类型的json String<br>
	 * maxSpeedUp=上行速率<br>
	 * maxSpeedDown=下行速率<br>
	 * lineProductInfo=list<\LineProductInfo>类型的Json String,<b>只有LineProductInfo信息不为空时才会有此键值对.</b></br>
	 * validAddress=validAddress Map类型的jsonString<br>
	 * retMsg=返回的信息<br>
	 * municipalCode=地市编码<br>
	 * route_number=路由数<br>
	 * <br>2--------------------------<br>
	 * 当retVal=R时,List<\CoInfo>=null,返回信息:<br>
	 * retVal=R<br>
	 * lineProductInfo=list<\LineProductInfo>类型的Json String,<b>只有LineProductInfo信息不为空时才会有此键值对.</b></br>
	 * validAddress=validAddress Map类型的jsonString<br>
	 * retMsg=返回的信息<br>
	 * municipalCode=地市编码<br>
	 * route_number=路由数<br>
	 * <br>3--------------------------<br>
	 * 当retVal=L时,地址校验未通过，但给出了可选地址,返回信息:<br>
	 * retVal=L<br>
	 * retMsg=返回的信息<br>
	 * addressInfo=list<\AddressInfo>类型的Json String<b>*只有retVal=L的时候才会返回此信息</b><br>
	 * <br>4--------------------------<br>
	 * 当retVal=N时,地址校验未通过，且没有可选地址,返回信息:<br>
	 * retVal=N<br>
	 * retMsg=返回的信息<br>
	 * <br>5--------------------------<br>
	 * 当retVal=E时,Exception,返回信息:<br>
	 * retVal=E<br>
	 * retMsg=e.getMessage()<br>
	 * 还可能包含以上4中情况的一些值,不可预知..<br>
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version v1.0.0
	 * @author zhangyy3
	 * @date 2014年10月9日 下午7:40:10
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014年10月9日     zhangyy3           v1.0.0               修改原因<br>
	 */
	public Map<String,String> getValidateAddress(String reqOrderId,long custId ,String billId ,String validateAddress)throws Exception, RemoteException ;
	
	/**
	 * 
	 * @Function getOnLinePreqResult
	 * @Description OSE进行固网开户,获取OnLine pre-q返回结果
	 * @param reqOrderId
	 * @param custId
	 * @param billId
	 * @param validateAddress
	 * @return
	 *1、当retVal=Y时,返回正常的信息（fiber pre-q正常 || DSL pre-q正常 都返回Y）:
	 * retVal=Y（DSL）
	 * coInfo_dsl=list<\CoInfo>类型的json String——DSL的CoInfo
	 * maxSpeedUp=上行速率——DSL
	 * maxSpeedDown=下行速率——DSL
	 * lineProductInfo_dsl=list<\LineProductInfo>类型的Json String,<b>只有LineProductInfo信息不为空时才会有此键值对.——DSL
     * hasPstn=是否有PSTN.——DSL
     * onlineResult_dsl=S  onLine pre-q DSL  success ， =F  fail
     * route_number_dsl=线路数量——DSL
     * lockedSpeed=锁定速率——DSL

     * retVal=Y（FIBER）
     * onlineResult_fiber=S  onLine pre-q  FIBER success  ， =F  fail
     * coInfo_fiber=list<\CoInfo>类型的json String——FIBER 的CoInfo（SFF只会返回Visitservice数据）
     * route_number_fiber=线路数量——FIBER
     * free_route_number_fiber=可用线路数量——FIBER

	 * validAddress=validAddress Map类型的jsonString
     * install_address_id=地址ID
	 * retMsg=返回的信息<br>
	 * municipalCode=地市编码<br>
	 

	 2、当retVal=R时,              
     *onlineResult_dsl=F  —— DSL onLine pre-q failed. DSL No NodeList information.          
     * onlineResult_fiberl=F  ——FIBER onLine pre-q failed. Fiber No NodeList information.
     * retMsg=返回的信息

	 3、当retVal=N时,返回失败
	 * retVal=N
	 * retMsg=返回的信息

	 4、当retVal=W时, OnLine pre-q还没有收到SFF返回的结果，需要继续等待回复
	 * retVal=W

	 5、当retVal=F时,Exception,返回信息:
	 * retVal=F
	 * retMsg=e.getMessage()
	 * @version v1.0.0
	 * @author huangsr
	 * @date 2017年04月20日 
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map<String,String> getOnLinePreqResult(String reqOrderId,long custId ,String billId ,String validateAddress)throws Exception, RemoteException;
	/**
     * 
     billId DSL账号
     custId 客户ID
     acctId 账户ID
     baseOfferId DSL基础套餐编号
     offerList   订购的策划列表，包含基本套餐  List<SoOfferExe>
     priceList   费用列表  List<SoBusiPriceData>
     addressMap 说明：
     	{houseNo（楼号）=, 
     	mainDoor（正门）=, 
     	floor（楼层）=, 
     	county（县）=, 
     	street（街道）=, 
     	doorNo（门牌号）=, 
     	zipCode（邮编）=, 
     	city（城市）=}
     dslParaMap 说明：
     {
     	LINE_PRODUCT_INFO=[{lp_info}],//lp_info 格式   productNo=,productType=,BB=,productOperator=
     	VISIT_SERVICE=,
     	REFERENCE_ID=,
     	CONTACT_BEFORE_ARRIVAL=,
     	CO_INFO=[{co_info},..],//co_info 格式 
     	PSTN_NO=,
     	ONLINE_DATE=,
     	PASSWORD=,
     	CAPTURE_INFO=[{capture_info}],//capture_info 格式 preqResult=,checkPSTN={hasPSTN=,pstnCheck,},act={actCode=},
     	HAS_PSTN=,
     	CONTACT_NUMBER=,
     	SEL_CO=[{sel_co}]//sel_co 格式 
     }
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014年10月10日     zhuyd           v1.0.0               修改原因<br>
     * */
    public IBceDealReturnData openNewDSLUser(String billId,long custId,long acctId,long baseOfferId,List<SoOfferExe> offerList,List<SoBusiPriceData> priceList,Map addressMap,Map dslParaMap) throws Exception, RemoteException;
    
    /**
     * @Function: calBusinessFeeNew
     * @Description: 计算业务费用接口（新接口当前使用）
     * 
     * @ billId:手机号码,帐务复机,换卡，换号，过户的时候通过$$$分割原因
     * @ billCycle:账期（用户的账期日,开户必传，其他情况不是必传）
     * @ queryBeans ：由IBOTmBillCycleQueryValue对象组成的数组 
     * 				 IBOTmBillCycleQueryValue包含offerId 、 offerInstId、businessId、installMentFlag、effInfo
     * 				 offerId :策划编号 
 					 offerInstId:策划实例ID
     * 					  （实例ID需要与offerIds对应，举例：如offerId有键值，这时候offerInstId也应该有值（对应offerId的地方如果有值则填值，没有值则填空或0））
     *               businessId:业务编号  （业务编号也需要与offerId元素对应（没有则填空））
     *               installMentFlag:分期标志（标志某个费用是否进行分期，与其他元素一一对应（没有则填空））
     *               effInfo:生效方式字符串
     * 				  （生效方式字符串需要与offerId元素对应，订购时必填（没有则填空））
     * 				  （策划对应的生效方式字符串： 格式：“生效类型=参数（可为空）” 比如1立即生效：“1（没有参数）”、2次月生效：“2=2014-11-01 00:00:00（次月时间参数）”）
     * @ regionId:地市
     * @ extMap:扩展属性Map（预留）如果是宽带上门，则key="isFixedLine"，value="Y" or  "N"
     * 
     * @return：返回结果描述
     * IOrdBusiPriceValue[] 费用信息
     * 
     * @throws：异常描述
     * @version: v1.0.0
     * @author: zhuyd
     * @date: Oct 15, 2012 1:51:21 PM
     * <p/>
     * Modification History:
     * Date         Author          Version            Description
     * ---------------------------------------------------------*
     * 2014年10月10日     zhuyd           v1.0.0               修改原因
     */
    public IOrdBusiPriceValue[] calBusinessFeeNew(String billId, String billCycle, ArrayList<IBOTmBillCycleQueryValue>  queryBeans,
    		String regionId, HashMap extMap) throws Exception, RemoteException;
    /**   
	  * 
	  * 普通集团产品订购
	  * 参数：CUST_ID             客户编号
	  *      ACCT_ID             账户编号  
	  *      OFFER_ID            策划编号  
	  *      产品包信息传送方式：订购的产品包编号通过map传送过来，<KEY,VALUE>其中KEY为需要订购的产品编号(String型)，VALUE为属性信息包（没有则传null）
	  *                          属性信息包也为map形式,<KEY,VALUE>:<属性编号(与CRM产品配置属性编号一致)、属性真实值>
	  *      
	  * Modification History:
	  * Date           Author          Version            Description
	  *---------------------------------------------------------*
	  * 2014-10-13	   houhj                               
	  */
	public IBceDealReturnData dealNewForGroupNormalProd(HashMap param)throws Exception,RemoteException;
	
	

     
     
     /**   
      * @Function: dealUserStopOpenNew
      * @Description: 处理用户停开机
      *
      * @param: billId，业务受理号码，必传
      *         osType,停开机类型，必传：停开机编码参照bs_static_data表  code_type = 'SO_USER_OS_STOP_MOBILE','SO_USER_OS_OPEN_MOBILE' 对应codeValue
      *         appointType  预约类型0不预约1预约
      *         appointTime 预约时间 时间格式（yyyy-mm-dd）
      * @return：
      * @throws：
      *
      * @version: v1.0.0
      * @author: yinxy
      * @date: 2014-06-18
      *
      * Modification History:
      * Date         Author          Version            Description
      *---------------------------------------------------------*
      * 2012-10-23      xiaozhibi           v1.0.0               修改原因
      */
      public IBceDealReturnData dealUserStopOpenForAppoint(Map paramMap)throws Exception, RemoteException;
      
      /**
       * OTT 停复机业务
       * @param paramMap
       * @return
       * @throws Exception
       * @throws RemoteException
       */
      public long dealUserStopOpenForOTT(Map paramMap)throws Exception, RemoteException;
       
      /**
       * OTT实销
       * @param billId
       * @param userId
       * @param extendMap
       * @return
       * @throws Exception
       * @throws RemoteException
       */
      public long dealDestoryOTTUser(String billId, long userId, Map extendMap) throws Exception, RemoteException;
      
	/**
	 * 
	 * @Function isHaveUser
	 * @Description OSE进行固网开户,根据地址查询是否有在用用户或者在途工单
	 *
	 * @param validAddress
	 *            String 校验地址,map类型的JSON String
	 * @param regionId
	 *            String 客户regionId 
	 * @param extMap 扩展
	 * @return null(exception)||retMap	Map	包含返回信息<br>
	 * 			<br>hasOnLineUser	boolean	是否有在用用户
	 *			<br>onLineUsers	IBOInsxUserAddressValue[]	当hasOnLineUser为true时必填
	 *			<br>hasOnWayUser	boolean	是否有在途工单
	 *			<br>onWayUsers	IBOInsxUserAddressValue[]	当onWayUsers为true时必填
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version v1.0.0
	 * @author zhangyy3
	 * @date 2014年10月14日 下午4:28:53
	 * 
	 *       <strong>Modification History:</strong><br>
	 *       Date Author Version Description<br>
	 *       ---------------------------------------------------------<br>
	 *       2014年10月14日 zhangyy3 v1.0.0 修改原因<br>
	 */
	public Map<String, Object> isHaveUser(String validAddress, String regionId,
			Map<String, Object> extMap) throws Exception, RemoteException;
      
      /**   
       * @Function: querySeriRel
       * @Description: 根据合约机编号查询客户信息
       *
       * @param: SERI_NO，合约机编号
       * @return：
       * @throws：
       *
       * @version: v1.0.0
       * @author: zhongxf3
       * @date: 2014-10-14
       *
       * Modification History:
       * Date         Author          Version            Description
       *---------------------------------------------------------*
       * 2014-10-14      zhongxf3          v1.0.0           create
       */
       public ICustomerValue querySeriRel(String SERI_NO)throws Exception, RemoteException;
       
       /**   
        * @Function: dealGroupMemeber
        * @Description: 群组成员变更统一接口
        *
        * @param: String billId, long userId 至少传一个
        * @param: long custId, int operType 均必传    
        * @param: operType中   DealMemUtils.OP_ADD_MEMBER 为新增成员  DealMemUtils.OP_DEL_MEMBER 为删除成员
        * @return：BceReturnData
        * @throws：
        *
        * @version: v1.0.0
        * @author: liuxl9
        * @date: 2014-10-16
        *
        * Modification History:
        * Date         Author          Version            Description
        *---------------------------------------------------------*
        * 2014-10-16      liuxl9          v1.0.0           create
        */
       public IBceDealReturnData dealJTWMemeber(String billId, long userId , long custId, int operType, Map extendMap) throws Exception, RemoteException;
 
    
       
       /**   
        * @Function: updateUserBaseAccrel
        * @Description: 基本帐务关系变更
        *
        * @param: userId，合约机编号
        * @param: newAcctId，新账户ID
        * @param: extMap，扩展属性（以免后面出等一些下周期生效情况）
        * @return：
        * @throws：
        *
        * @version: v1.0.0
        * @author: zhongxf3
        * @date: 2014-10-14
        *
        * Modification History:
        * Date         Author          Version            Description
        *---------------------------------------------------------*
        * 2014-10-16      zhuyd          v1.0.0           create
        */
        public IBceDealReturnData updateUserBaseAccrel(long userId, long newAcctId, Map extMap)throws Exception, RemoteException;

        /**   
         * @Function: getCompanySummaryInfo
         * @Description: 查询集团统计信息
         *
         * @param: custId，客户ID
         * @return：Map
         * @throws：
         *
         * @version: v1.0.0
         * @author: youys
         * @date: 2014-10-21
         *
         * Modification History:
         * Date         Author          Version            Description
         *---------------------------------------------------------*
         * 2014-10-21   youys           v1.0.0               修改原因
         */
        
        public Map getCompanySummaryInfo(String custId)  throws NumberFormatException, Exception;
        
        /**   
         * @Function: getShortNumListByBillId
         * @Description: 查询短号列表
         *
         * @param: custId，客户ID,billId
         * @return：Map
         * @throws：
         *
         * @version: v1.0.0
         * @author: youys
         * @date: 2014-10-21
         *
         * Modification History:
         * Date         Author          Version            Description
         *---------------------------------------------------------*
         * 2014-11-13   youys           v1.0.0               修改原因
         */
        
        public List getShortNumListByBillId(long custId,String billId)  throws  Exception;

        /**   
         * @Function: getUserInfoByConditions
         * @Description: 查集团全量的用户信息
         * @param: custId，客户ID,billId
         * @return：Map
         * @throws：
         *
         * @version: v1.0.0
         * @author: youys
         * @date: 2014-10-21
         *
         * Modification History:
         * Date         Author          Version            Description
         *---------------------------------------------------------*
         * 2014-11-13   youys           v1.0.0               修改原因
         */
        
        public List getUserInfoByCustId(long custId,String billId,int startIndex, int endIndex)  throws  Exception;
        public int getUserInfoByCustIdCount(long custId,String billId)  throws  Exception;

        /**   
         * @Function: getUserInfoByConditions
         * @Description: 查集团下某员工的用户信息
         * @param: custId，客户ID,employeeCustId
         * @return：list
         * @throws：
         *
         * @version: v1.0.0
         * @author: youys
         * @date: 2014-10-21
         *
         * Modification History:
         * Date         Author          Version            Description
         *---------------------------------------------------------*
         * 2014-11-13   youys           v1.0.0               修改原因
         */
        public List getUserInfoByEmployeeCustId(long custId,long employeeCustId)  throws  Exception;
        
        /**   
         * @Function: isCheckForGroupHasProd
         * @Description: 个人订购产品需要判断个人所在的集团中是否订购该产品
         *
         * @param: ruleData，系统初始化的时候返回的规则数据
         *         insProd,产品ID
         * @return：
         * @throws：
         *
         * @version: v1.0.0
         * @author: wengyf
         * @date: 2014-10-15
         *
         * Modification History:
         * Date         Author          Version            Description
         *---------------------------------------------------------*
         * 2014-10-15      wengyf           v1.0.0               修改原因
         */
        
        public boolean isCheckForGroupHasProd(ISoRuleData ruleData,String insProd);

        
        /**   
         * @Function: queryRelatOffer
         * @Description: 退订增值策划连带退订处理
         *
         * @param: Map<String, String>qryOfferInfo ：  必传，不可为null 
         *     cancelOfferInfo，由key:OFF_RELAT_INFO
         *     value:JSONArray.toString(),  组成JSONArray的JSONObject包含两个key： OfferId和OfferInstId ，格式如： {OFFER_ID:mOfferId,OFFER_INST_ID:mOfferInsId};
         *         billCycle : 账期    可选
         *         userId ： 用户ID   必传
         * @return：Map 需要退订的关联Offer,由3个key组成Get_Offers  一起退订的offer，由IInsOfferValue链表组成
         * Modify_Offers   需要修改失效日期的offer，由IInsOfferValue链表组成。新的失效日期放在IInsOfferValue的ExtAttr("NEW_EXPIRE_DATE")
         * Offers_Relation_Offers   需要删除子--父和父--子offer之间的关联关系，由IInsOfferRelatValue链表组成
         * @throws：
         *
         * @version: v1.0.0
         * @author: sunht
         * @date: 2014-10-21
         *
         * Modification History:
         * Date         Author          Version            Description
         *---------------------------------------------------------*
         * 2014-10-21      sunht           v1.0.0               修改原因
         */
        
        public Map queryRelatOffer(Map<String, String> qryOfferInfo, String billCycle, String userId) throws Exception, RemoteException;
        
        /**
         * 查询用户dsl开户或者移机的客户订单
         * @param billId 手机号码
         * @param userId 用户编号
         * @param custId 客户编号
         * @return  Map	<key			value>
         * 		   		hasReBook 		boolean(true/false)
         * 				orderInfos		DataContainer[]
         * 					DataContainer[i] 结构如下：
         * 						bookInfo		DataContainer（
         * 											ONLINE_DATE（预约时间）、
         * 											VISIT_SERVICE（GDS（无需上门）、 GIG（上门施工））、
         * 											AddressStr（地址）、
         * 											CONTACT_BEFORE_ARRIVAL（到达前联系）、
         * 											CONTACT_NUMBER（联系电话）、
         * 											CONTACT_NAME（联系姓名）、
         * 											BOOK_ID（客户订单编号））
         * 						oneTimecharge	IOrdBusiPriceValue[]（费用订单）
         * 						order			IOrdCustValue
         * 
         * @throws Exception
         * @throws RemoteException
         */
        public Map queryDSLReBookInfo(String billId, long userId, long custId) throws Exception, RemoteException;
       
        /**
         * @Function: getInsUserByBillIdOrUserId
         * @Description: 根据手机号(GSM/DSL)或者用户编号查询用户实例
         * @param billId 
         * @param userId 
         * @param billId、userId 至少传一个
         * @param validType 生效类型（-1：所有（含本周期、下周期生效）、1 当前生效（本周期）、2 未生效（下周期）） 必传 
         * @return
         * @throws Exception
         * @throws RemoteException
         */
        public IInsUserValue[] getInsUserByBillIdOrUserId(String billId, long userId, int validType) throws Exception, RemoteException;

        /**
         * @Function: getDSLUserByVoIPNum
         * @Description: 根据VoIP号码查询DSL用户实例 
         * @param attrValue  VoiP号 必传
         * @param validType  生效类型（-1：所有（含本周期、下周期生效）、1 当前生效（本周期）、2 未生效（下周期）） 必传
         * @return
         * @throws Exception
         * @throws RemoteException
         */
        public IInsUserValue getDSLUserByVoIPNum(String voipNum, int validType) throws Exception, RemoteException;
        
        /**
         * @Function: getInsUserBySeriNo
         * @Description: 根据终端编号和生效时间查询用户实例
         * @param seriNo 终端编号 必传
         * @param validType  生效类型（-1：所有（含本周期、下周期生效）、1 当前生效（本周期）、2 未生效（下周期）） 必传 
         * @return
         * @throws Exception
         * @throws RemoteException
         */
        public IInsUserValue[] getInsUserBySeriNo(String seriNo , int validType) throws Exception, RemoteException;

        /**
         * @Function: getDSLUserByCircuitNum
         * @Description: 根据电子线路号查询用户实例 
         * @param circuitNum 电子线路号
         * @param validType 生效类型（-1：所有（含本周期、下周期生效）、1 当前生效（本周期）、2 未生效（下周期）） 必传 
         * @return
         * @throws Exception
         * @throws RemoteException
         */
        public IInsUserValue getDSLUserByCircuitNum(String circuitNum , int validType) throws Exception, RemoteException;
        
        /**
         * @Function: getInsUserByImsi
         * @Description: 根据imsi和生效类型查询用户实例 
         * @param imsi
         * @param validType 生效类型（-1：所有（含本周期、下周期生效）、1 当前生效（本周期）、2 未生效（下周期）） 必传
         * @return
         * @throws Exception
         * @throws RemoteException
         */
        public IInsUserValue getInsUserByImsi(String imsi, int validType) throws Exception, RemoteException;

        /**
         * @Function: getInsUserByUserAddress
         * @Description: 根据用户标准地址查询用户实例  
         * @param standardAddrId  用户标准地址
         * @param validType 生效类型（-1：所有（含本周期、下周期生效）、1 当前生效（本周期）、2 未生效（下周期）） 必传
         * @return
         * @throws Exception
         * @throws RemoteException
         */
        public IInsUserValue[] getInsUserByUserAddress(long standardAddrId , int validType) throws Exception, RemoteException;

        /**
         * @Function: query360AllUserList
         * @Description: 根据产品规则、用户号码查询用户信息  
         * @param standardAddrId  
         * @param validType 参数可传可不传
         * @return
         * @throws Exception
         * @throws RemoteException
         */
        public DataContainerInterface[] query360AllUserList(long custId,String prodCatalogId ,String billId,long offerId,int startIndex, int endIndex) throws Exception, RemoteException;

        public int query360AllUserListCount(long custId,String prodCatalogId ,String billId,long offerId) throws Exception, RemoteException;
        
        /**
         * @Function: queryMemberUserList
         * @Description: 根据条查询集团下成员信息
         * @param standardAddrId  
         * @param 
         * @return
         * @throws Exception
         * @throws RemoteException
         */
        public DataContainerInterface[] queryMemberUserList(long offerInstanceId, String billId, long roleId, String provisionedPlatform,
                                                            int validType, String regionIdsStr, String isMainRole, int startIndex, int endIndex) throws Exception;
        
        /**
         * @description 静态方法查询合同类型
         * 根据userid,offerinstid查询合同名称和类型
         * @author zhouyongchao
         * @param custId 客户id
         * @param offerId 
         * @param userid
         * @return 合同类型
         * @throws Exception
         * @throws RemoteException
         */
        public String getAgreementType(long custId, long userId, long offerId)throws Exception, RemoteException;
        
        public int queryMemberUserListCount(long offerInstanceId,String billId, long roleId, String provisionedPlatform, int validType,
                                            String regionIdsStr,String isMainRole) throws Exception;

        /**
         * 查询宽带上门可选的上门时间接口（修改上门时间使用）
         * @param customerOrderId 客户订单编号
         * @param regionId 地市编号
         * @param requestedDateFrom 要求上门开始时间：格式：2014-11-04
         * @param requestedDateTo 要求上门结束时间：格式：2014-11-05
         * @param timeSlotType 上门时间类型//SELECT * FROM base.bs_static_data WHERE code_type LIKE 'CHANGE_SLOT_TYPE';
         * @param billId 手机号码
         * @param extMap 扩展使用
         * @return List<WorkTimeslot>
         * @throws Exception
         * @throws RemoteException
         */
        public List<WorkTimeslot> qryOnlinedateTimeslot(long customerOrderId, String regionId, String requestedDateFrom, 
        			String requestedDateTo , String timeSlotType, String billId, Map extMap) throws Exception, RemoteException;
        
        
        /**
    	 * 获取产品的生失效信息
    	 * autor liuxl9
    	 * date 10 14, 2014
    	 * @param oldOfferId 老策划ID
    	 * @param newOfferId 新策划ID
    	 * @return
    	 */
        public IEffExpInfoBean getOfferEffInfo(long oldOfferId, long newOfferId) throws Exception, RemoteException;

        /**
    	 * 生成宽带的账号和密码
    	 * autor sunht
    	 * date 3 11, 2014
    	 * @param 无
    	 * @return String  返回账号、密码
    	 */
        public Map<String, String> generateBroadBandAccount() throws Exception, RemoteException;
        
        /**
    	 * 查询号码使用历史
    	 * autor sunht
    	 * date 3 11, 2014
    	 * @param billid
    	 * @return IBOINSBillCustomerValue[]
    	 */
        public IBOINSBillCustomerValue[] getBillidUsedHistory(String billId) throws Exception, RemoteException;
    	/**
    	 * 查询用户的策划实例信息
    	 * @param userId
    	 * @return
    	 * @throws Exception
    	 * @throws RemoteException
    	 */
        public DataContainerInterface[] getUserProdByInsProdId(long userId)throws Exception,RemoteException;		
        /**
    	 * NP预销
    	 * @param billId  IS_WRONG_NP  BOOLEAN  true;flase true时不收罚金
    	 * @return
    	 * @throws Exception
    	 * @throws RemoteException
    	 */
        public IBceDealReturnData dealPreTermination4NP(String billId,Map extendMap) throws Exception, RemoteException;

        /**
     	 * 根据用户编号查询终端、宽带信息
     	 * @param userId
     	 * validType 生效类型（-1：所有（含本周期、下周期生效）、1 当前生效（本周期）、2 未生效（下周期）） 必传
     	 * offerType 策划类型（终端 OFFER_VAS_HANDSET、OFFER_VAS_RESOURCE 宽带 OFFER_VAS_CPE ）
     	 * @return  List<DataContainer>             
         *               DataContainer结构如下
    	 *			        ORDER_NAME  终端名称
    	 *                  OFFER_TYPE  策划类型
         *			        IMEI_SN     终端返回IMEI 路由器返回SN
         * 			        START_DATE  协议开始时间（合约机时返回）
    	 *			        END_DATE    协议结束时间（合约机时返回）
         *
     	 * @throws Exception
     	 * @throws RemoteException
     	 */
        public List<DataContainer> getTerminalOrWBByUserId(long userId, int validType ,String offerType[])throws Exception,RemoteException;
        
        
        
        /**
    	 * 合约机费用计算
    	 * @param ployId   合约ID，必填
    	 * offerId  主策划，必填
    	 * period   合约期，必填
    	 * installMentFlag   是否分期标识，必填。分期="1"，非分期="0"
    	 * extMap   扩展，可选
    	 * @return  IOrdBusiPriceValue 
    	 * @throws Exception
    	 * @throws RemoteException
    	 */
        public IOrdBusiPriceValue[] calContractTerminalFee(long ployId, long offerId, String period, String installMentFlag, Map extMap)throws Exception,RemoteException;	

        /**
         * OTT开户接口
         * @param billId
         * @param orderInfo
         * @param priceList
         * @param extMap
         * @return
         * @throws Exception
         * @throws RemoteException
         */
        public long newConn4OTT(String billId, List<IOpenOrderExe> orderInfo, List<SoBusiPriceData> priceList, Map extMap)throws Exception,RemoteException;
        
        /**
         * OTT业务变更接口
         * @param billId
         * @param orderInfo
         * @param priceList
         * @param extMap
         * @return
         * @throws Exception
         * @throws RemoteException
         */
        public long changeProd4OTT(String billId, List<IOpenOrderExe> orderInfo, List<SoBusiPriceData> priceList, Map extMap)throws Exception,RemoteException;
        
        /**
    	 * 开户的购物车接口
    	 * @param billId   号码，必填,  cartId   购物车ID，必填
    	 * orderInfo  购物车信息，必填，包含用户信息、客户信息、账户信息、订购的策划、可选的服务包、费用
    	 *  dealType  必填,0为异步处理,保存进so_shop_cart,1为实时处理,启流程.OSE购物车适用0,后台批开适用1,kapala适用1
    	 *  priceList  费用信息
    	 * extMap   扩展，可选
    	 * @return   map
    	 * @throws Exception
    	 * @throws RemoteException
    	 */
        public Map newConn4Indiv(int dealType, String billId, List<IOpenOrderExe> orderInfo, List<SoBusiPriceData> priceList, Map extMap)throws Exception,RemoteException;

    /**
     * 为OSE保存offer信息
     * @param cardId 购物车id
     * @param billId 服务号码
     * @param offerVASList offer列表,里面是ISoOfferExe(列表可空,但空的没有意义)
     * @param priceList 价格列表SoBusiPriceData对象
     * @param validDate 生效时间
     * @param expireDate 失效时间
     * @param extendMap 额外参数列表,可null,可size=0
     * @param offerId 策划id
     * @param offerName 策划名称
     * @throws Exception
     * @throws RemoteException
     */
        public Map changeVASOffer(long cardId, String billId,
                                  List offerVASList, List priceList, Timestamp validDate,
                                  Timestamp expireDate, Map extendMap, long offerId,String offerName)
            throws Exception, RemoteException;
    /**
     * 根据userId获取IP地址和路由器名称提供给OSE
     * zhangyy3 20141127
     * @param dslId
     * @param userId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map<String,String> qryIPandRouterName(String dslId,long userId)throws Exception,RemoteException;

    /**
     * 根据offerInstId查询账户关系提供给OSE
     * zhangyy3 20141127
     * @param offerInstId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IInsAccrelValue[] queryInsAccrelByOfferInstId(long offerInstId)throws Exception,RemoteException;

    /**
 	 * 描述：查询user，payer，owner信息，要求输入（包括但不限于）：入参：用户id 出参：user name, userAddress，owner name，account number, account name,account id，payerAddress
 	 * @param userId   用户ID，必填,
 	 * extMap   扩展，可选
 	 * @return   map  user name, userAddress，owner name，account number, account name,account id，payerAddress
 	 * @throws Exception
 	 * @throws RemoteException
 	 */
    public Map getUserOwnerRelation(long userId, Map extMap)throws Exception,RemoteException;
    
    /**
     * DSL开户
     * @param billId
     * @param dealType 处理方式 0异步 1实时
     * @param offerList
     * @param priceList
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map openNewConn4DSL(String billId, int dealType, List<IOpenOrderExe> offerList, List<SoBusiPriceData> priceList, Map extMap) throws Exception, RemoteException;

    /**
     * zhangyy3 20141203
     * @param billId 服务号码
     * @param extMap 额外参数列表
     *               reason ->2,用户误取消;3,技术原因
     *               isAcctived->0,立即激活,1非立即激活
     * @return
     * @throws Exception
     */
    public Map preTerminReAccess(String billId,Map extMap ) throws Exception, RemoteException;

    
    /**
     *  fwj 20151019
     * @param billId 服务号码
     * @param extMap 额外参数列表
     *               reason ->2,用户误取消;3,技术原因
     *               isAcctived->0,立即激活,1非立即激活
     * @return
     * @throws Exception
     */
    public Map preTerminReAccess4PSTN(String billId,Map extMap ) throws Exception, RemoteException;

    /**
     * @Function: getDSLUserByVoINum
     * @Description: 根据VoI号码查询DSL用户实例 
     * @param attrValue  VoiP号 必传
     * @param validType  生效类型（-1：所有（含本周期、下周期生效）、1 当前生效（本周期）、2 未生效（下周期）） 必传
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IInsUserValue getDSLUserByVoINum(String voiNum, int validType) throws Exception, RemoteException;

    /**
     * @Function: getInsUserByStandardAddressArray
     * @Description: 根据标准地址数组查询DSL用户实例 
     * @param standardAddrId  地址列表 必传
     * @param validType  生效类型（-1：所有（含本周期、下周期生效）、1 当前生效（本周期）、2 未生效（下周期）） 必传
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IInsUserValue[] getInsUserByStandardAddressArray(long[] standardAddrId, int validType) throws Exception, RemoteException;
    
    public IBceDealReturnData chgOfferPlanForDSL(List<IOpenOrderExe> offerList, List<SoBusiPriceData> priceList, String billId, Map extendMap) throws Exception, RemoteException;

    /**
     * zhangyy3 20141208
     * 校验当前offer是否和当前的CPE适配
     * @param baseOfferId
     * @param CPEOfferId
     * @return true,适配:flase 不适配
     * @throws Exception
     * @throws RemoteException
     */
    public boolean isCPEAdapted2Offer(long baseOfferId,long CPEOfferId) throws Exception,RemoteException;
    
    /**
     * wengyf 20141208
     * 获取工作流集合
     * @throws Exception
     * @throws RemoteException
     */
//    public  WorkflowInfo[] getWorkflows() throws RemoteException, Exception;

    
    /**
     *  
     * DSL移机，
      * @param billId   号码，必填,  cartId   购物车ID，必填
    	 * orderInfo  购物车信息，必填，包含用户信息、客户信息、账户信息、订购的策划、可选的服务包、费用
    	 *  dealType  必填,0为异步处理,保存进so_shop_cart,1为实时处理,启流程.OSE购物车适用0,后台批开适用1,kapala适用1
    	 *  priceList  费用信息
    	 * extMap   扩展，可选
    	 * @return   map
    	 * @throws Exception
    	 * @throws RemoteException
    	 */
    public Map  dealDSLRelocation (String billId, List<IOpenOrderExe> offerList, List<SoBusiPriceData> priceList,Map extMap) throws Exception, RemoteException;

    /**
     * 订购OTT策划接口，含有处理ott策划的特殊逻辑
     * @author youys
     * @param
     */
    public Map dealOTTB2BOfferNew(long custId,String billId,long offerId)throws Exception;
        
    /**
     *  
     * VOIP订购，同时会订购CPE，因为需要涉及自定义物流信息，所以使用IOpenOrderExe对象做为入参,
     *
      * @param billId   号码，必填,  cartId   购物车ID，必填
    	 * orderInfo  购物车信息，必填，包含用户信息、客户信息、账户信息、订购的策划、可选的服务包、费用
    	 *  dealType  必填,0为异步处理,保存进so_shop_cart,1为实时处理,启流程.OSE购物车适用0,后台批开适用1,kapala适用1
    	 *  priceList  费用信息
    	 * extMap   扩展，可选
    	 * @return   IBceDealReturnData
    	 * @throws Exception
    	 * @throws RemoteException
    	 */
    public IBceDealReturnData  dealVoipVAS (String billId, List<IOpenOrderExe> offerList, List<SoBusiPriceData> priceList, Timestamp validDate,
            Timestamp expireDate, Map extendMap) throws Exception, RemoteException;

    /**
     * zhangyy3
     * 20141210
     * 查询购物车子订单的状态
     * @param customerOrderId
     * @return
     *          key--------------------------------------------  val
     *          RETURN_PARENT_ORDER----------------------customerOrderId(入参)
     *          PARENT_STATE-----------------------------购物车状态
     *          RETURN_CODE------------------------------返回码,如果购物车提交失败返回false,否则返回true
     *          MapOrderList-------------------------------detailList<MAP>详单列表
     *          --------------------------------------------------------------
     *          detailList<MAP>
     *          key-------------------------------------------val
     *          ITEM_ID-----------------------------------so_shop_cart_detail的主键,购物车详单id
     *          STATE-------------------------------------购物车详单状态
     *          ORDER_ID----------------------------------子订单id
     *          ORDER_STATE-------------------------------子订单状态
     *
     * @throws Exception
     * @throws RuntimeException
     */
    public Map qryShopingCardSubOrderState(long customerOrderId)throws Exception,RuntimeException;
    
    public String isOpenTapStormAcct(long custId)throws Exception,RuntimeException;
    /*
	 * 客户管理修改客户信息处理phonebook调用接口
	 */
    public void dealPhoneBook(long custId) throws Exception, RemoteException;
    
    /**
	 * 根据客户ID查询当前客户下竣工订单和未竣工订单
	 * @param startDate
	 * @param endDate
	 * @param regionId (可选)
	 * @param customerId
	 * @param startIndex
	 * @param endIndex
	 * @param operId (可选)
	 * @param orderName (可选)
	 * @param queryMode(可选)
	 * @return
	 */
	public IBOQOrdCustValue[] getAlldOrdCustInfo(String orderStatus, String customerOrderId ,long operId,String orderName,String queryMode,String startDate, String endDate, String regionId, String customerId, int startIndex, int endIndex) throws Exception,RemoteException;

	/**   
	* @Function: ICrmFSV.java
	* @Description: 更新wimp状态
	*
	* @return
	* @throws Exception
	* @throws RemoteException
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: yaojx
	* @date: Jan 29, 2015 10:32:57 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Jan 29, 2015     yaojx           v1.0.0               修改原因
	*/
	public String updateWimpActiveState(String partenUserId)throws Exception,RemoteException;
	
	/*无用的代码，因为客管引用，留着*/
	 public long queryVpmnIdByCustId(long custId)throws Exception,RemoteException;
	 
	 /*无用的代码，因为客管引用，留着*/
	 public Map dealSpPresentation(String billId, String presentBillId, String spCode, String operatorCode) throws Exception, RemoteException;
	 
     public DataContainerInterface[] query360AllUserListNoAccrel(long custId,String prodCatalogId ,String billId,long offerId,int startIndex, int endIndex) throws Exception, RemoteException;

     //query360AllUserListNoAccrelCount
     public int query360AllUserListNoAccrelCount(long custId,String prodCatalogId ,String billId,long offerId) throws Exception, RemoteException;

     public DataContainer getOrdBasicInfo(long custOrderId, String createDate,String regionId,String OperateType,String doneDate) throws Exception, RemoteException ;

     public DataContainer[] getOrdOfferInfo(long custOrderId,String createDate,String regionId,String OperateType,String doneDate) throws Exception;
     
     public DataContainer[] getOfferPriceInfo(long custOrderId,String createDate,String regionId,String OperateType,String doneDate) throws Exception;
     /**
      * 根据加密后的码，来获取poa信息和可以修改的字段信息
      * @param encryptCode
      * @return
      * @throws Exception
      * @throws RemoteException
      */
 	public Map getPoaInfoByEncryptCode(String encryptCode)throws Exception,RemoteException;
 	
 	public void saveCRMCallBillingWebServiceLog(String rspInfo, long userId, String methodName) throws Exception;
 	
 	/**
 	 * 获取分账规则
 	 * @param custId
 	 * @return
 	 * @throws Exception
 	 */
 	public DataContainerInterface[] querySplitBillRule(String custId,String agreementId) throws Exception;
 	
	
 	/**
 	 * 获取分账规则
 	 * @param custId
 	 * @return
 	 * @throws Exception
 	 */
 	public DataContainerInterface[] querySplitBillRule(String custId) throws Exception;
 	
 	/**
 	 * 查询一个个人客户或是一个集团客户下的账户
 	 * 
 	 */
 	
    public DataContainerInterface[] queryPayerAccountByDts(int custType, long custId, String firstName, String LastName, String cpr, 
            String birthDay, long addressId, String companyName, String kob, String cvr,String accountId,String isIotOffer, int start, 
            int end)
        throws Exception;
    
    /**
 	 * 根据合同查询合同下的账户
 	 * 
 	 */
    public DataContainerInterface[] queryPayerAccountByAgr(String agreementId,
			int custType, long custId,String firstName, String LastName, String cpr,
			String birthDay,long addressId, String companyName, String kob, String cvr, String accountId,String isIotOffer,
			int start, int end) throws Exception;
    
    public int queryPayerAccountByAgrCount(String agreementId,int custType, long custId, String firstName, String LastName, String cpr, 
            String birthDay, long addressId, String companyName, String kob, String cvr , String accountId,String isIotOffer)
        throws Exception;
    public int queryPayerAccountByDtsCount(int custType, long custId, String firstName, String LastName, String cpr, 
            String birthDay, long addressId, String companyName, String kob, String cvr,String accountId,String isIotOffer)
        throws Exception;
	public DataContainerInterface[] queryUserSplitAccount(long custId, String serviceNumber, long defaultAcctId, long splitAcctId, long splitRuleId ,  String itemIdName ) throws Exception;
	
	//新需求需要分页
	public DataContainerInterface[] queryUserSplitAccount(long custId, String serviceNumber, long defaultAcctId, long splitAcctId, long splitRuleId ,  String itemIdName , int $STARTROWINDEX , int $ENDROWINDEX) throws Exception;
	public int queryUserSplitAccountLength(long custId, String serviceNumber, long defaultAcctId, long splitAcctId, long splitRuleId ,  String itemIdName ) throws Exception;
	  /**
     * @Function: query360AllUserList
     * @Description: 根据产品规则、用户号码查询用户信息  
     * @param standardAddrId  
     * @param validType 参数可传可不传
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public DataContainerInterface[] query360AllUserListView(long custId,String prodCatalogId ,String billId,long offerId,String circuitNumber,String CPENumber,String userName,String states,String offerName,int startIndex, int endIndex) throws Exception, RemoteException;

    public int query360AllUserListViewCount(long custId,String prodCatalogId ,String billId,long offerId,String circuitNumber,String CPENumber,String userName,String states,String offerName) throws Exception, RemoteException;
	
	public String updateAttributeValue(long userId ,HashMap param)throws Exception,RemoteException;
	
	public void cancelOrderCustWaiting(long customerOrderId)throws Exception,RemoteException;
	
	/**
	 * 通过userId进行集团销户
	 * @param userId
	 * @return
	 * @throws Exception
	 * @author zhangxy13|20150928
	 */
	public IBceDealReturnData dealDeleteProdOfGroupByUserId(long userId) throws Exception;

    /**
     * 查询用户是否有在途单和未来生效的订单以及未来生效的订购
     * @param userId
     * @return boolean true:存在在途单、未来生效订购或订单  false：不存在
     * @author zhangxy13|20151012
     */
    public boolean checkOnGoingAndFutureEffectByUserId(long userId) throws Exception;

    /**
     * 查询合同下是否存在在途单以及未来生效的订单
     * @param agreementId 合同号
     * @param custId 客户号
     * @return boolean true:存在途单或者是未来生效的订单   false:不存在
     * @throws Exception
     * @author zhangxy13|20151117
     */
    public boolean checkOnGoingAndFutureEffectByAgreementId(long agreementId,long custId) throws Exception;
    
    /**
     * 查询合同下是否存在在途单以及未来生效的订单
     * @param agreementId 合同号
     * @param custId 客户号
     * @return boolean true:存在途单或者是未来生效的订单   false:不存在
     * @throws Exception
     * @author zhangxy13|20151117
     */
    public boolean checkOnGoingAndFutureEffectByAgrIdAndCustId(long agreementId,long custId) throws Exception;

    /**
     * 查询用户是否存在在途单--合同用，排除入群出群订单
     * @param userId
     * @return true:存在;false:不存在
     * @throws Exception
     * @author zhangxy13
     * @date 20151229
     */
    public boolean checkOngoingByUserId(long userId) throws Exception;

    /**
     * 查询当前客户下不在合同里面并且满足当前合同offer的用户列表
     * @param custIds
     * @param offerId
     * @throws Exception
     * @author zhangxy13
     */
    public DataContainerInterface[] getUserIdUnAssociatedAgreement(long[] custIds, long offerId) throws Exception;
	
	public IInsProdInsSrvValue[] getInsProdInsSrvValues(String billId) throws RemoteException, Exception;
	
	/**
	 * 合同失效，退订群成员接口 
	 * @param userId
	 * @param offerInstId
	 * @throws Exception
	 */
	public IBceDealReturnData unsubscribeGroupMem(long userId,long offerInstId,String regionId)throws Exception;
	/**
	 * @Description 加群成员接口 
	 * @param userId
	 * @param offerInstId
	 * @throws Exception
	 * @author huangsr
	 */
	public IBceDealReturnData addGroupMem(long userId,long offerInstId,String regionId)throws Exception;
	
	/**
	 * 终端维修信息同步for ose
	 * @param paramMap
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void dealUpdateImeiForOSE(Map paramMap)throws Exception,RemoteException;
	
    /**
	 * 根据手机号MSISDN查询用户Id
	 * @param ServerNum
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 */

	public long getUserByBillId (String ServerNum) throws RemoteException, Exception;
	
	 /**
		 * 根据订单号进行电子确认单的确认，修改ord_cust_waiting状态为22或23
		 * @param DataContainer
		 * @return
		 * @throws RemoteException
		 * @throws Exception
		 */
	public void electronicConfirm(DataContainer dc) throws Exception , RemoteException;
			 
	/**
     * 检验是否是PSTN过户:B2C到B2C,或者B2C到B2B
     * @param orderId
     * @return int -1:不是;  0：B2C到B2B;  1:B2B到B2C
     * @throws Exception
     * @author zhangxy13|20151119
     */
    public int checkPstnTransFromB2BToB2C(long customerOrderId) throws Exception;

    /**
     * 更新此leadingNum唯一标示的AttributeId的值
     * @param leadingNum
     * @param numCount 此号段的号码数量
     * @throws Exception
     * @author zhangxy13|20151125
     */
    public void updateAttributeValueByLeadingNum(long leadingNum, int numCount) throws Exception;

	 /**
	 * 
	 * 根据手机串号查询设备保险信息
	 * @param policyNum
	 * @param imei
	 * @author zoudj
	 * @date 2015-12-1
	 * @throws Exception
	 */
	public IBOInsxUserInsuranceValue[] queryInsurance(String policyNum,String imei) throws Exception ;
	/** 
	* @Function: createSoOrderData 
	* @Description: TODO
	* @param
	* @return ISoOrderData
	* @throws 异常描述
	* @author lufm3
	* @date Dec 16, 2015 9:24:07 AM 
	*/ 
	public ISoOrderData createSoOrderData(String billId, long newOfferId, long businessId, ISoServicePkgData[] servpkgData,
            List offerVASList, Map<String, ISoAttrData[]> soAttrMap, Timestamp validDate,
            Timestamp expireDate, Map extendMap, boolean mustDelFlag, boolean inheritProdFlag)throws RemoteException, Exception;
	
	/**
     * 查询用户是否存在在途单--资源释放号码使用
     * @param billId
     * @return true:存在;false:不存在
     * @throws Exception
     * @author pengwz
     * @date 20160412
     */
	public boolean checkOngoingByBillId(long billId) throws Exception;
	
	public void saveBatchOrdPortinPoaValue(IBOOrdPortinPoaValue[] poaValues) throws Exception, RemoteException;
	public Map[] getBatchPoaInfoByEncryptCode(String encryptCode)throws Exception,RemoteException;
	public boolean isBatchOrder(long customerOrderId)throws Exception,RemoteException;
	public String queryAttrValue4Vpmn(long customerOrderId, String billId)throws Exception,RemoteException;
	public void unlockNumberStatus(Map map) throws RemoteException, Exception;
	public void contract2CrmScanningPart(long customerOrderId) throws RemoteException, Exception;
	public int qryMemberUserListCount(long offerInstanceId,String billId) throws Exception, RemoteException;
	
	/**
	 * PSTN 预销户转实销
	 * @param billId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void dealPSTNPreTerToTermination(long customerOrderId,long poaCustomerOrderId, String taskId) throws Exception, RemoteException;
	
	/**
	 * NP流程中判断是否PSTNportout HomePhone portin
	 * @param customerOrderId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public boolean checkIsPSTNToHomePhone(long customerOrderId,String billId) throws Exception, RemoteException;
	
	/**
	 * OSE调用，根据号码查询判断是否有在途的portin订单
	 * @param billId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public boolean checkIsPortin(long billId)throws Exception, RemoteException;
	
	/** 
	* @Function: electronicConfirm4Batch 
	* @Description: TODO
	* @param
	* @return void
	* @throws 异常描述
	* @author L1ekkAs
	* @date 2016-7-25 上午10:15:27 
	*/ 
	public void electronicConfirm4Batch(DataContainer dc)throws Exception, RemoteException;
	
	
	public boolean checkIsPSTNResold(long billId) throws Exception;
	
	/**
	 * 提供给成员换群页面的查询vpn成员，和360展示的逻辑不兼容
	 * @param offerInstanceId
	 * @param billId
	 * @param vpnGroupId
	 * @param regionId
	 * @param beneficiary
	 * @param startRowIndex
	 * @param endRowIndex
	 * @return
	 * @throws Exception
	 */
	public DataContainerInterface [] queryVPNMember(long offerInstanceId,String billId,String vpnGroupId,String regionId,String beneficiary,int startRowIndex,int endRowIndex) throws Exception;
	
	/**
	 * 提供给资源使用
	 * 在物流方式选择的Pick Up In ResourceManament的时候，选择客户的预占卡，处于选中状态的卡需要资源的task释放
	 * 这个方法就是提供给资源task去释放卡用的
	 * @param iccid
	 * @return
	 */
	public boolean checkOngoingByIccId(String iccid) throws Exception;
	
	
	/**
	 * query taf base offer for ose
	 * @param userKind
	 * @param support_tech
	 * @param supportMaxDownSPD
	 * @param surpportMaxUPSPD
	 * @param keyWord
	 * @param code
	 * @param tariffRangeId
	 * @param catalogId
	 * @param custType
	 * @param extMap
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public DataContainerInterface[] getBaseOfferForDM002(String userKind,
			String support_tech, String supportMaxDownSPD, String surpportMaxUPSPD,String keyWord, String code,
			long tariffRangeId, long catalogId, String custType,Map<String,Object> extMap)
					throws Exception, RemoteException;
	
	
	/**
	 * query taf vas offer for ose
	 * @param offerId
	 * @param code
	 * @param main_offer_tech
	 * @param keyWord
	 * @param catalogId
	 * @param extMap
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public DataContainerInterface[] getVasOfferForDM002(long offerId,
			String code,String main_offer_tech, String keyWord, long catalogId,Map<String,Object> extMap)
					throws Exception, RemoteException;
	
	/**
	 * 查询custId客户下是否已订购(生效或未来生效的)offerIds
	 * @param custId
	 * @param offerIds
	 * @param regionId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public boolean isExistInstOfferByCustIdAndOfferId(Long custId,Long[] offerIds,String regionId)throws Exception,RemoteException;
	
	/**
   	*  
   	* DM002 wifi Repeater订购，需要涉及自定义物流信息，所以使用IOpenOrderExe对象做为入参,
   	*
    * @param billId   号码，必填,  cartId   购物车ID，必填
  	* offerList  需要订购和退订的offer数据
  	* priceList  费用信息
  	* mainOfferId
  	* offerName
  	* extendMap   扩展，可选
  	* @return   map
  	* @throws Exception
  	* @throws RemoteException
  	*/
	public Map dealVasRepeaterForDSL(long cartId,String billId, List<IOpenOrderExe> offerList,
				List<SoBusiPriceData> priceList, Timestamp validDate, long offerId, String offerName,
				Timestamp expireDate, Map extendMap) throws Exception,
				RemoteException;
	
	/**
	 * switch业务归还旧手机
	 * @param cartId
	 * @param billId
	 * @param offerList
	 * @param priceList
	 * @param validDate
	 * @param offerId
	 * @param offerName
	 * @param expireDate
	 * @param extendMap
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	 public Map orderVasOffer4Switch(long cartId,String billId, List<IOpenOrderExe> offerList,
				List<SoBusiPriceData> priceList, Timestamp validDate, long offerId, String offerName,
				Timestamp expireDate, Map extendMap) throws Exception,
				RemoteException;

    public Map getVasOfferByCondition(String oldImei) throws Exception,
            RemoteException;

	 /**
     * 查询用户是否存在在途单--合同用
     * @param userId
     * @param type 1群 2成员
     * @return true:存在;false:不存在
     * @throws Exception
     * @author zhangxy13
     * @date 20151229
     */
    public boolean checkOngoingByUserId(long userId,int type) throws Exception;
    
    /**
	 * bulk订购add on
	 * @param fileName 文件名（必填）
	 * @param base64Code 文件（必填）
	 * @param bookingDate 批量单执行时间（必填）
	 * @param modId 10050表示移网订购退订add on
	 *              20032表示移网订购退订add on
	 * @param vasOfferInfos 界面选offer等操作信息 
     * 订购传 List vasOfferInfos = (List) busiParams.get("VasOfferInfo");
     * @param custId 客户id
     * @param opId 操作员工
     * @param orgId 操作员工组织
     * @param offlineContractInfo 格式例子：OC_SERVICE_DATE=2017-08-27&OC_AGENT_CODE=222&OC_CUSTOMER_IDENTIFICATION_TYPE=3333&OC_DEALER_CODE=DealerCode&OC_ID_NUMBER=111&OC_OFFLINE_CONTRACT_NUMBER=333&OC_SHOP_ID=222
	 * @param onlineDate 固网用到(必填)
	 * @return batchCustomerOrderId
	 * @throws Exception
	 */
	public String bulkSubsAddon(Map param) throws Exception;
	
	/**
	 * multi订购add on
	 * @param userList 批量的用户信息（必填）
	 * @param bookingDate 批量单执行时间（必填）
	 * @param modId 10050表示移网订购退订add on
	 *              20032表示移网订购退订add on
	 * @param vasOfferInfos 界面选offer等操作信息 
     * 订购传 List vasOfferInfos = (List) busiParams.get("VasOfferInfo");
     * @param custId 客户id
     * @param opId 操作员工
     * @param orgId 操作员工组织
     * @param offlineContractInfo 格式例子：OC_SERVICE_DATE=2017-08-27&OC_AGENT_CODE=222&OC_CUSTOMER_IDENTIFICATION_TYPE=3333&OC_DEALER_CODE=DealerCode&OC_ID_NUMBER=111&OC_OFFLINE_CONTRACT_NUMBER=333&OC_SHOP_ID=222
	 * @param onlineDate 固网用到(必填)
	 * @param appleDepSwitch (Apple DEP Enrollment) 1:Yes,0:No
	 * @return batchCustomerOrderId
	 * @throws Exception
	 */
	public String multiSubsAddon(Map param) throws Exception;
	/**
	 * bulk退订add on
	 * @param fileName 文件名
	 * @param base64Code 文件
	 * @param bookingDate 批量单执行时间
	 * @param modId 10050表示移网订购退订add on
	 *              20032表示固网订购退订add on
	 * @param xmlString 格式：2006344|LOGOUT 目前只支持退订一个addon
     * @param custId 客户id
     * @param opId 操作员工
     * @param orgId 操作员工组织
	 * @return
	 * @throws Exception
	 */
	public String bulkUnsubsAddon(Map param) throws Exception;
	
	/**
	 * multi退订add on
	 * @param userList 批量的用户信息（必填）
	 * @param bookingDate 批量单执行时间
	 * @param modId 10050表示移网订购退订add on
	 *              20032表示固网订购退订add on
	 * @param xmlString 格式：2006344|LOGOUT 目前只支持退订一个addon
     * @param custId 客户id
     * @param opId 操作员工
     * @param orgId 操作员工组织
	 * @return
	 * @throws Exception
	 */
	public String multiUnsubsAddon(Map param) throws Exception;
	/**
	 * 批量停复机
	 * 入参：Map
	 * @param userList 号码字符串（必传），格式”97900288^71125076^71125070^89083370”
	 * @param bookingDate 批量单执行时间
	 * @param modId 110021 表示停复机
	 * @param xmlString：前台选的停复机原因，停机格式：APPOINT_STOP:0|OS_STATUS_TYPE_STOP:101|OS_LEVEL:os|OS_TYPE:1
											复机格式：APPOINT_OPEN:0|OS_STATUS_TYPE_OPEN:001|OS_LEVEL:os|OS_TYPE:5
							注：OS_STATUS_TYPE_STOP和OS_STATUS_TYPE_OPEN传停复机的编码，参考单个订单的编码；OS_TYPE（Mobile传1，FIXEDPHONE传4，Nordic传5）

     * @param custId 客户id （必传）
     * @param opId 操作员工 （必传）
     * @param orgId 操作员工组织 （必传）
	 * @return String 批量订单号
	 * @throws Exception
	 */
	public String bulkStopOpen(Map param) throws Exception;
	/**
	 * 根据用户和操作类型校验用户能否做相应的操作
	 * @param param
	 * Map{
	 * PRODUCT_INSTANCE_ID : 用户UserId (必填)
	 * BILL_ID: 电话号码  （必填）
	 * BUSIOPER_ID： businessID （必填）
	 * }
	 * @return IBceRuleReturnData
	 * @throws Exception
	 */
	public IBceRuleReturnData isBusiCanDo(Map param) throws Exception;
	
	/**
     * 查询用户是否存在在途单--合同用，不排除入群出群订单
     * @param userId
     * @return true:存在;false:不存在
     * @throws Exception
     * @author zhangxy13
     * @date 20151229
     */
    public boolean checkOngoingByUserIdNew(long userId) throws Exception;
    
    /**
	 *查询停复机编码接口
	 * @param param
	 * Map{
	 * offerId : main offer ID (必填)
	 * isAppoint : （是否预约，0-不预约，1-预约 必填）
	 * }
	 * 
	 * @return 
	 * Map{
	 * stopReason  (停机reason列表)
	 * openReason  (复机reason列表)
	 * }
	 * 
	 * @throws Exception
	 */
	public Map queryStopOpenReasonCode(Map param) throws Exception;
	/**
  	 * 
  	 * @Description: 获取停机的resStoreCode
  	 *
  	 * @param:String channelType 
  	 * @return：返回结果描述
  	 * @throws：异常描述
  	 *
  	 */
  	public String getResStoreCode(String userId) throws Exception;
	
	/**
     * 提供给OSE，B2B固网销户接口
     * @param param
     * @return
     * @throws Exception
     */
    public IBceDealReturnData broadbandTermination(Map param) throws Exception;
    /**
     * 提供给OSE，B2B移网预销户接口
     * @param param
     * @return
     * @throws Exception
     */
    public IBceDealReturnData mobilePreTermination(Map param) throws Exception;
    /**
     * 提供给OSE,查询用户销户原因分类
     * @param offerId 用户主offerId
     * @return 原因描述|对应描述的code
     * @throws Exception
     */
    public Map getTerminationReason(long offerId) throws Exception;
    
    /**
     * 提供给OSE，计算销户的算费(移网、固网都调用)
     * @param Map 
     * param{
     * USER_ID (必填)
     * TERMINATION_REASON  销户原因 (必填)
     * TERMINATION_DATE 销户日期 （必填）
     * TERMINATION_KIND  (DSL必填，可选值DSL,VOIP, DSL_AND_VOIP，默认填DSL)；
     * }
     * 
     * @return List，List中的类型为SoBusiPriceData类型
     * @throws Exception
     */
    public List calcTerminationFee(Map paramMap) throws Exception;
    
    /**
     * 提供给OSE，计算批量销户的费用
     * @param List<Map> 
     * param{
     * USER_ID (必填)
     * TERMINATION_REASON  销户原因 (必填)
     * TERMINATION_DATE 销户日期 （必填）
     * TERMINATION_KIND  (DSL必填，可选值DSL,VOIP, DSL_AND_VOIP，默认填DSL)；
     * }
     * 
     * @return Map 
     * Map中的Key为具体的每个用户的userId
     * Map中key对应的Value值为List（List中的类型为SoBusiPriceData类型）
     * @throws Exception
     */
    public Map calcBatchTerminationFee(List<Map> users) throws Exception;
    
    /**
     * 提供给OSE，批量预销户
     * @param param
     * @return
     * @throws Exception
     */
    public String multiPreTermination(Map param) throws Exception;
    
    /**
     * 查询userid下insoffinsuser总数
     * @param userId
     * @return
     * @throws Exception
     */
    public int getUserProdsInfoTreeCount(long userId) throws Exception;
    
    /**
     * 分页查询360视图下的subscriber information
     * @param userId
     * @param $STARTROWINDEX
     * @param $ENDROWINDEX
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public DataContainer[] getUserProdsInfoTreeByPage(long userId,int $STARTROWINDEX,int $ENDROWINDEX) throws Exception, RemoteException;
    
    public DataContainerInterface[] queryPayerAccountByAgr(String agreementId,
			int custType, long custId,String firstName, String LastName, String cpr,
			String birthDay,long addressId, String companyName, String kob, String cvr, String accountId) throws Exception;
    
    /**
     * CRM封装给OSE校验Email使用
     * @param mailAddress
     * @return	boolean  true 校验通过/false 校验失败
     * @throws Exception
     * @throws RemoteException
     */
    public boolean queryMail(String mailAddress) throws Exception, RemoteException;
    
    /**
     * 
     * <p>Title: isAddOnTechCompatible</p>  
     * <p>Description: 判断add on offer是否和当前选择的技术是否兼容 </p>  
     * @param selectdTechType
     * @param addOnOfferId
     * @return
     * @throws Exception  
     * @author YangJie  
     * @date 2018年9月4日  
     * @version SR 0.83
     */
    public boolean isAddOnTechCompatible(String selectdTechType,long addOnOfferId)throws Exception;
    
    /**
     * 
     * <p>Title: queryUnCompatibleInstOffer</p>  
     * <p>Description: </p>  
     * @param selectdTechType
     * @param userId
     * @return
     * @throws Exception  
     * @author YangJie  
     * @date 2018年9月5日  
     * @version SR 0.83
     */
    public IInsOfferValue[] queryUnCompatibleInstOffer(String selectdTechType,long userId) throws Exception;
    
	/**
	 * 根据属性id + 属性值  查询属性数据
	 * 
	 * @param arrtId
	 * @param attrValue
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IBOInsSrvAttrIdxValue[] getInsSrvAttrIdxByAttrIdAndAttrValue(String arrtId,String attrValue)throws Exception,RemoteException;
	/**
	 * This API is used by ES to get the esim add on offer status under the main subscription of the primary device
	 * 
	 * @param IMSI
	 * @param iccid
	 * @param IMEI
	 * @param MSISDN
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map getPairedDeviceList(String IMSI,String iccid,String IMEI,String MSISDN)throws Exception,RemoteException;
	/**
	 * 根据userId查询可用的E-SIM Plans(Offers) 
	 * 
	 * @param userId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public DataContainerInterface[] getApplicablePlans(String userId)throws Exception,RemoteException;
	/**
	 * 根据 主号userId获取可供配对用的E-SIM Plans(Offers) 实例
	 * 
	 * @param userId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map getFreePlans(String userId)throws Exception,RemoteException;
	
	/**
	 * <p>Title: updatePairState</p>  
	 * interface for uip to update pair state
	 * @param iccid
	 * @param eid
	 * @param completionTimeStamp
	 * @param notificationEvent
	 * @param resultCode
	 * @param operationStatus
	 * @throws Exception  
	 * @see com.asiainfo.crm.so.teaminvoke.out.service.interfaces.ICrmFSV#notification(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)  
	 * @author Huhb3  
	 * @date 2018年11月5日  
	 * @version SR 0.83  
	 */
	public void notification(String iccid,String eid,Timestamp completionTimeStamp,String notificationEvent,String resultCode,String operationStatus) throws Exception;
	
	/**
	 * 
	 * <p>Title: pairEsimAndDevice</p>  
	 * <p>Description: 配对iwatch设备和ESIM卡</p>  
	 * @param eid
	 * @param iccId
	 * @return
	 * @throws Exception
	 * @throws RemoteException  
	 * @author pengshu  
	 * @date 2018年11月6日  
	 * @version SR 0.83
	 */
	public String pairEsimAndDevice(long userId,String eid,long offerInstId) throws Exception,RemoteException;

	/**
	 * 
	 * <p>Title: queryOrderInfoForCR17</p>  
	 * <p>Description: </p>  
	 * @param eid
	 * @param iccId
	 * @return
	 * @throws Exception
	 * @throws RemoteException  
	 * @author zouling  
	 * @date 2018年11月12日  
	 * @version SR 0.83
	 */
	public CrmOrderInfo[] queryOrderInfoForCR17(long oseOrderId,long cartId,long customerOrderId ) throws Exception;

	/**
	 * 
	 * <p>Title: handsetOrderModify</p>  
	 * <p>Description: </p>  
	 * @param crmOrderInfos
	 * @return
	 * @throws Exception  
	 * @author zouling  
	 * @date 2018年11月12日  
	 * @version SR 0.83
	 */
	public Map handsetOrderModify(CrmOrderInfo[] crmOrderInfos ) throws Exception;
	
	/**
	 * 
	 * <p>Title: handsetOrderCancel</p>  
	 * <p>Description: </p>  
	 * @param customerOrderId
	 * @return
	 * @throws Exception  
	 * @author zouling  
	 * @date 2018年11月12日  
	 * @version SR 0.83
	 */
	public Map handsetOrderCancel(long customerOrderId) throws Exception;

	/**
	 * 
	 * <p>Title: createBackOrder</p>  
	 * <p>Description: </p>  
	 * @param backOrderInfo
	 * @return
	 * @throws Exception  
	 * @author zouling  
	 * @date 2018年11月21日  
	 * @version SR 0.83
	 */
	public Map createBackOrder(BackOrderInfo backOrderInfo) throws Exception;
	
	/**
	 * 创建换账户订单
	 * @param serviceNumber
	 * @param acctId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public String createChangeAccountRelOrder(String serviceNumber, long acctId, Timestamp effectiveDate)throws Exception,RemoteException;

	/**
	 * 批量创建换账户订单
	 * @param serviceNumber
	 * @param acctId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map<String, String> changeSubscriptionsAccount(List<String> serviceNumbers, long acctId, Timestamp effectiveDate)throws Exception,RemoteException;
	
	/**
	 * 根据条件查询user列表。CR128
	 * @param custId
	 * @param agreementId
	 * @param acctId
	 * @param serviceNumber
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public DataContainerInterface[] queryUserList(long custId, long agreementId, long acctId, String serviceNumber, int start, int end) throws Exception, RemoteException;
	public int queryUserListCount(long custId, long agreementId, long acctId, String serviceNumber) throws Exception, RemoteException;
	/**
	 * 根据条件查询账户列表。CR128
	 * @param custId
	 * @param agreementId
	 * @param acctId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public DataContainerInterface[] queryAccountList(long custId, long agreementId, long acctId, int start, int end) throws Exception, RemoteException;
	public int queryAccountListCount(long custId, long agreementId, long acctId) throws Exception, RemoteException;

	/**
	 * 通过CustId 和 OfferId 查询offerID对应kids Offer群组的下所有offerId的有效订购数
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2019-7-3
	* ICrmFSV
	 */
	public Map<String, String> QueryKidsOfferAmountByCIdAndOId(long custId,long offerId) throws Exception, RemoteException;
	
	/**
	 * 提供给OSE创建Multiplan订单的接口
	 * @param billId
	 * @param orderInfo
	 * @param priceList
	 * @param extMap
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map newConn4Multiplan(String billId, List<IOpenOrderExe> orderInfo, List<SoBusiPriceData> priceList, Map extMap) throws Exception, RemoteException;
	
	/**
	 * 提供给ose,Multiplan开户
	 * 根据入参custId,billId,查询该客户下存在在途单用户信息，并且将其中的service number，main offer id 和invoice name以集合List返回。
	 * 入参custId要做客户细分过滤，只查询MA和SA的，其他的细分类型，返回空。
	 * @param custId
	 * @param billId				支持模糊查询，‘*’ 代表多个字符，‘?’代表一个字符。
	 * @return		List
	 * 				list包括Service number，main offerId，invoice name,userId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public List getOngoingOrderUserInfoByCustIdAndBillId(long custId,String billId) throws Exception,RemoteException;
	
	/**
	 * 提供给ose,Multiplan开户
	 * 根据入参custId,billId,查询该客户下在用用户信息，并且将其中的service number，main offer id 和invoice name以集合List返回。
	 * 入参custId要做客户细分过滤，只查询MA和SA的，其他的细分类型，返回空。
	 * @param custId
	 * @param billId 				支持模糊查询，‘*’ 代表多个字符，‘?’代表一个字符。
	 * @return		List
	 * 				list包括Service number，main offerId，invoice name,userId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public List getActiveUserInfoByCustIdAndBillId(long custId,String billId) throws Exception,RemoteException;
	
	  /**
	   * 
	   * <p>Title: getCompleteCustOrderInfoByCustId</p>  
	   * <p>Description: </p>  
	   * @param custId
	   * @param startDate
	   * @param endDate
	   * @param businessId
	   * @param offerType
	   * @param orderType
	   * @param busiType
	   * @param cartId
	   * @return
	   * @throws Exception  
	   * @author YangJie  
	   * @date 2019年10月17日  
	   * @version SR 0.83
	   */
	  public List getCompleteCustOrderInfoByCustId(long custId,Date startDate,Date endDate,String businessId,String offerType,String orderType,String busiType,long cartId)throws Exception;

	  /**
	   * 
	   * <p>Title: getOngoingCustOrderInfoByCustId</p>  
	   * <p>Description: </p>  
	   * @param custId
	   * @param businessId
	   * @param offerType
	   * @param orderType
	   * @param busiType
	   * @param cartId
	   * @return
	   * @throws Exception  
	   * @author YangJie  
	   * @date 2019年10月17日  
	   * @version SR 0.83
	   */
	  public List getOngoingCustOrderInfoByCustId(long custId, String businessId,String offerType,String orderType,String busiType,long cartId) throws Exception;
	  public PreQResultVo getOpenNetPreqResult(ValidateAddressVo vo)throws Exception, RemoteException;
	  public Map cancelOpenNet(String reqOrderId,String basketId ,String serviceSubscriptionID ,String reason)throws Exception, RemoteException ;
	  
	  /**
	   * 	计算保险免赔期
	   * @param offerId
	   * @param createDate
	   * @return
	   * @throws Exception
	   */
	  public String calClaimQuarantineEndDate(long offerId, Date createDate) throws Exception;
	  
	  public long insuranceTerminate(String billId, long userId) throws Exception;
	  
	  /**
		 * 
		 * @param billId
		 * @param userId
		 * @param effType null/空，取账期生效   immediately 立即生效
		 * @return
		 * @throws Exception
		 */
	  public long insuranceTerminate(String billId, long userId,String effType) throws Exception;
	  
	  /**
	   * 取消OpenNet的basket预订单
	   * @param paraMap
	   * @return
	   * @throws Exception
	   */
	  public Map cancelOpenNetBasket(Map paraMap) throws Exception;
	  
	  /**
	   * 设置OpenNet订单的onlineDate
	   * @param paraMap
	   * @return
	   * @throws Exception
	   */
	  public Map confirmOpenNetOnlineDate(Map paraMap) throws Exception;
	  
	  /**
	   * 计算安装方式
	   * @param paraMap
	   * @return
	   * @throws Exception
	   */
	  public Map getVisitService(VisitServiceQryVo vo) throws Exception;
	  

	  /**
	   * 界面点online date按钮触发此方法。
	   * 新下单和改单走的不同的逻辑。
	   * 不同businessId逻辑也不同。
	   * @param orderInfo
	   * @return
	   * @throws Exception
	   */
	  public PreSubmitResultDTO preSubmit(PreSubmitOrderVo orderInfo) throws Exception;
	  
	  /**
	   * 查询 固网的 main offer
	   * @param param
	   * @return
	   * @throws Exception
	   */
	  public PagerDataVo<ProductOfferingVo> queryFixMainOffer(QueryBroadbandOfferConditionVo param) throws Exception;

	  /**
	   * 查询固网的addon offer
	   * @param param
	   * @return
	   * @throws Exception
	   */
	  public PagerDataVo<ProductOfferingVo> queryFixAddonOffer(QueryBroadbandOfferConditionVo param) throws Exception;

	  /**
	   * 查询 一次性 费用
	   * 注意：不支持非合约机订购费用查询
	   * @param orderOfferFee
	   * @return
	   * @throws Exception
	   */
	  public DataContainerInterface[] caculateOtherFee(OrderOfferFeeVo orderOfferFee)throws Exception;

	  /**
	   * 查询 一次性 费用
	   * 注意：不支持非合约机订购费用查询
	   * @param orderOfferFee
	   * @return
	   * @throws Exception
	   */
	  public DataContainerInterface[] caculateOtherFee(QueryOTCVo orderOfferFee) throws Exception ;

	  /**
	   * 查询周期性费用
	   * @param condition
	   * @return
	   * @throws Exception
	   */
	  public ProductOfferingFeeVo[] calculatePrice(OfferOrderConditionVo condition) throws Exception;
	  
	  public void setOpenNetEventInfo(String eventId, Date eventTime, String eventType, Map eventObject) throws Exception, RemoteException;

	  public Map updateInsuranceImei(String virtualBillId,String imei,String updatedImei) throws Exception, RemoteException;
	  
	  /**
	   * 查询订单状态，根据crm订单号
	   * 	这里只查询 ord_cust 表
	   * @param customerOrderId
	   * @return
	   * @throws Exception
	   * @throws RuntimeException
	   */
	  public Map qryOrderState(long customerOrderId)throws Exception,RuntimeException;
	  
	  /**
	   * 
	   * <p>Title: getOrdDeliveryInfo</p>  
	   * <p>Description: </p>  
	   * @param custOrderId
	   * @param createDate
	   * @param regionId
	   * @param OperateType
	   * @param doneDate
	   * @return
	   * @throws Exception
	   * @throws RemoteException  
	   * @author yangxie  
	   * @date 2020年5月12日  
	   * @version V1.0
	   */
	  public DataContainer getOrdDeliveryInfo(long custOrderId, String createDate,String regionId,String OperateType,String doneDate) throws Exception, RemoteException;
	  
	  /**
	   * 判断是否可以在前台触发预提交
	   * @param customerOrderId
	   * @param newOfferId
	   * @return
	   * @throws Exception
	   */
	  public boolean judgeCanPresubmit(long customerOrderId, long newOfferId) throws Exception;
	  
	  /**
	   * 
	   * <p>Title: getCompleteCustOrderInfoByCustId</p>  
	   * <p>Description: </p>  
	   * @param custId
	   * @param startDate
	   * @param endDate
	   * @param businessId
	   * @param offerType
	   * @param orderType
	   * @param busiType
	   * @param cartId
	   * @param InstallAddressId
	   * @param CircuitNumber
	   * @return
	   * @throws Exception  
	   * @author YangJie  
	   * @date 2019年10月17日  
	   * @version SR 0.83
	   */
	  public List getCompleteCustOrderInfoByCustId(long custId,Date startDate,Date endDate,String businessId,
			  String offerType,String orderType,String busiType,long cartId,long InstallAddressId,String circuitNumber, String subscriberId)throws Exception;
	  /**
	   * getOngoingCustOrderInfoByCustId
	   * @param custId
	   * @param businessId
	   * @param offerType
	   * @param orderType
	   * @param busiType
	   * @param cartId
	   * @param InstallAddressId
	   * @param CircuitNumber
	   * @param accountId
	   * @param serviceNumber
	   * @return
	   * @throws Exception
	   */
	  public List getOngoingCustOrderInfoByCustId(long custId, String businessId,String offerType,String orderType,String busiType,long cartId
			  , long InstallAddressId,String CircuitNumber, long accountId, String serviceNumber, String subscriberId) throws Exception;
	  
	  /**
	   * 判断是否可以修改在途单。
	   * @param customerOrderId
	   * @param
	   * @return  Map<String,Boolean> 可以改单的类型,key为操作类型，value为是否可操作，true表示可以，false表示不可以。
	   * 所有的key：
	   * <br>CHANGE_OFFER：换main offer或addon 
	   * <br>CHANGE_INSTALL_ADDRESS：换安装地址
	   * <br>MODIFY_XDSL：改xDSL信息 
	   * <br>CHANGE_DELIVERY_ADDRESS：改寄送地址 
	   * <br>CHANGE_VISIT_SERVICE：改上门服务方式 （仅限TDC）
	   * <br>CHANGE_ONLINE_DATE：改OnlineDate 
	   * <br>CHANGE_ONLINE_DATE_TIME：reschedule 
	   * <br>MODIFY_CONTACT_INFO：改上门服务的联系方式
	   * @throws Exception
	   * @throws RuntimeException
	   */
	  public Map<String,Boolean> judgeCanModifyOrder(long customerOrderId) throws Exception;
	  
	  public List<WorkTimeslot> qryOnlinedateTimeslot(long customerOrderId, String requestedDateFrom,String requestedDateTo, String timeSlotType) throws Exception, RemoteException;
	  
	  public Map deleteNumber(Map paraMap) throws Exception, RemoteException;
	  
	  public Map notifyDeleteResult(Map paraMap) throws Exception, RemoteException;
	  
	  public Map createProductOrder(String cartInfo) throws Exception, RemoteException;
	  
	  
	  /**
	   * 
	   * @param custId
	   * @param offerId
	   * @return
	   * @throws Exception
	   * @throws RemoteException
	   */
	  public Map checkMaxNumOfCustomer(long custId,long offerId) throws Exception,RemoteException;
	  
	  /**
	   * 
	   * @param billId
	   * @param orderInfo
	   * @param priceList
	   * @param extMap
	   * @return
	   * @throws Exception
	   * @throws RemoteException
	   */
	  public long newConn4OTTX(int dealType,String billId, List<IOpenOrderExe> orderInfo, List<SoBusiPriceData> priceList, Map extMap)throws Exception,RemoteException;

	  public long getOrderIdByExternalCode(String externalCode)  throws Exception,RemoteException;
	  
	  public long queryAccountIdByServiceNum(String serviceNum) throws Exception,RemoteException;
	  
	  /**
	   * 
	   * <p>Title: validateVpnShortNumber</p>  
	   * <p>Description: </p>  
	   * @param retMap
	   * @param vpnId
	   * @param custId
	   * @param billId
	   * @param businessId
	   * @param shortNum
	   * @throws RemoteException
	   * @throws Exception  
	   * @author Yang Jieee  
	   * @date 2021年8月16日  
	   * @version V1.0
	   */
	  public Map<String, String> validateVpnShortNumber(Map<String, String> retMap, String vpnId, long custId, String billId,
				long businessId, String shortNum) throws RemoteException, Exception;
	  /**
	   * 
	   * <p>Title: query360AllUserListViewCount</p>  
	   * <p>Description: fibia requirement 新增fibiacustId</p>  
	   * @param custId
	   * @param prodCatalogId
	   * @param billId
	   * @param offerId
	   * @param circuitNumber
	   * @param CPENumber
	   * @param userName
	   * @param fibiaCustId
	   * @param states
	   * @param offerName
	   * @return
	   * @throws Exception
	   * @throws RemoteException  
	   * @author Yang Jieee  
	   * @date 2021年8月10日  
	   * @version V1.0
	   */
	  public int query360AllUserListViewCount(long custId, String prodCatalogId,
				String billId, long offerId,String circuitNumber,String CPENumber,String userName,String fibiaCustId,String states,String offerName) throws Exception, RemoteException;
	  
	  /**
	   * 
	   * <p>Title: query360AllUserListView</p>  
	   * <p>Description: fibia requirement 新增fibiacustId</p>  
	   * @param custId
	   * @param prodCatalogId
	   * @param billId
	   * @param offerId
	   * @param circuitNumber
	   * @param CPENumber
	   * @param userName
	   * @param fibiaCustId
	   * @param states
	   * @param offerName
	   * @param startIndex
	   * @param endIndex
	   * @return
	   * @throws Exception
	   * @throws RemoteException  
	   * @author Yang Jieee  
	   * @date 2021年8月10日  
	   * @version V1.0
	   */
	  public DataContainerInterface[] query360AllUserListView(long custId,
				String prodCatalogId, String billId, long offerId,String circuitNumber,String CPENumber, String userName, String fibiaCustId,String states,String offerName,int startIndex,
				int endIndex) throws Exception, RemoteException;
	  
	  /**
	   * 
	   * <p>Title: query360OrdCustByCustIdAndStartEndDateCount</p>  
	   * <p>Description: </p>  
	   * @param custId
	   * @param startDate
	   * @param endDate
	   * @param regionId
	   * @param type
	   * @param billId
	   * @param circuitNumber
	   * @param CPENumber
	   * @param PONumber
	   * @param fibiaCustId
	   * @return
	   * @throws Exception
	   * @throws RemoteException  
	   * @author Yang Jieee  
	   * @date 2021年8月11日  
	   * @version V1.0
	   */
	  public int query360OrdCustByCustIdAndStartEndDateCount(long custId, String startDate,String endDate,String regionId,int type,String billId,String circuitNumber,String CPENumber,String PONumber,String fibiaCustId) throws Exception,RemoteException;
	  
	  
	  /**
	   * 
	   * <p>Title: query360OrdCustByCustIdAndStartEndDate</p>  
	   * <p>Description: </p>  
	   * @param custId
	   * @param startDate
	   * @param endDate
	   * @param regionId
	   * @param type
	   * @param billId
	   * @param circuitNumber
	   * @param CPENumber
	   * @param PONumber
	   * @param fibaCustId
	   * @param startIndex
	   * @param endIndex
	   * @return
	   * @throws Exception
	   * @throws RemoteException  
	   * @author Yang Jieee  
	   * @date 2021年8月11日  
	   * @version V1.0
	   */
	  public DataContainer[] query360OrdCustByCustIdAndStartEndDate(long custId, String startDate,String endDate,String regionId,int type,String billId,String circuitNumber,String CPENumber,String PONumber,String fibiaCustId,int startIndex,int endIndex) throws Exception,RemoteException;
	  /**
	   * 
	   * @param startDate
	   * @param endDate
	   * @param regionId
	   * @param billId
	   * @param attrId
	   * @param circuitNumber
	   * @return
	   */
	  public String getBillIdByAttrIdAndAttrValue(String startDate, String endDate, String regionId, String billId,long attrId,
				String circuitNumber)throws Exception, RemoteException;
	  
	 public List<DayWorkScheduleDTO> getAvailableDays(PreSubmitOrderVo orderInfo,String basketId,String actCode,PreSubmitResultDTO dto,boolean isChangeOption) throws RemoteException, Exception;

	  public String queryProdConfigForBatchChangeOffer(long proSpecId) throws Exception, RemoteException;
	  public String queryProdAttrIds(long proSpecId,String billId) throws Exception, RemoteException;

	  public String getB2BAdminInfos(long custId) throws Exception, RemoteException;
	  /**
	   * 
	   * <p>Title: existInsuranceTerminationOrder</p>  
	   * <p>Description: </p>  
	   * @param billId
	   * @return boolean true:has ongoing order   false:no ongoing order
	   * @throws Exception
	   * @throws RemoteException  
	   * @author Yang Jieee  
	   * @date 2022年5月18日  
	   * @version V1.0
	   */
	  public boolean existInsuranceTerminationOrder(String billId) throws Exception, RemoteException;
	  
	  /**
		 * 	 过户业务不能带出double sim card offer，即使 double sim card offer 和 main offer 有连带关系
		 * @param includeOfferValues
		 * @return
		 * @throws Exception
		 */
	  public IOfferIncludeOfferValue[] removeDoubleForTran(IOfferIncludeOfferValue[] includeOfferValues) throws Exception;
	
	  
	  public long getFreeInsuranceTerimnateOrder(String billId) throws Exception, RemoteException;
	  
	  /**
	   * 	VPN群虚用户：main offer是70130 offer;
			CR81用户客户计费的虚用户:main offer特征是2700331 且特征值为 "Pricing_Offer";
			合同虚用户:main offer 是 80000915 offer;
			合同津贴虚用户：:main offer 是  25041495 offer;
	   * @param mainOfferId
	   * @return
	   * @throws Exception
	   * @throws RemoteException
	   */
	  public boolean isSpecialVirtualSubscriber(long mainOfferId) throws Exception, RemoteException;
	  
	  //AI-13104
	  public List<Map<String,String>> queryNoPenaltyDate(List<Map<String,String>> userData) throws Exception, RemoteException;

    public String getLeadTime(PreSubmitOrderVo orderInfo);
    
    public void checkOfferStatusForTrans(long userId,long custId)  throws Exception;

    /**
     * Cloud PBX查询VPN MEMBER实例数据
     *
     * @param
     * @throws Exception
     */
    public DataContainerInterface[] queryMemberInstanceData(long custId, long offerInstanceId, String groupNumber, String billId, long roleId, String provisionedPlatform, int startIndex, int endIndex) throws Exception;

    public int queryMemberInstanceDataCount(long custId, long offerInstanceId, String groupNumber, String billId, long roleId, String provisionedPlatform) throws Exception;

    public DataContainerInterface[] queryMigrateMemberData(long custId, long offerInstanceId, String groupNumber, String billId, String migratePlatformStatus, int startIndex, int endIndex) throws Exception;

    public int queryMigrateMemberDataCount(long custId, long offerInstanceId, String groupNumber, String billId, String migratePlatformStatus) throws Exception;

    public DataContainerInterface[] queryMigrateResultData(long custId, long offerInstanceId, String groupNumber, String billId, String createDate, int startIndex, int endIndex) throws Exception;

    public int queryMigrateResultDataCount(long custId, long offerInstanceId, String groupNumber, String billId, String createDate) throws Exception;

    public void migrateAllPlatform2PBX(long custId) throws Exception;

    public int migratePartPlatform2PBX(long custId, List<DataContainer> dcLists) throws Exception;

    public int resetMemberMigStatus(long custId, List<DataContainer> dcLists) throws Exception;
    /**
     * Cloud PBX查询VPN MEMBER在途数据
     *
     * @return
     * @throws Exception
     */
    DataContainerInterface[] queryVpnOngoingOrder(long custId,String vpnId,String platform,String billId,int $STARTROWINDEX, int $ENDROWINDEX) throws Exception;
    
    /**
     * 获取addon offer数据
     * @author: huanglun     
     * @date:   2023年10月10日 上午10:09:14   
     * @Description:
     */
    public List<ISoOfferObj> getAddOnSoOfferData(ISoSubmitObj soSubmitObj) throws RemoteException, Exception;
    
	/**
	 * 验证addon的平台与实际平台是否一致
	 * @author: huanglun     
	 * @date:   2023年10月12日 上午9:10:40   
	 * @Description:
	 */
    public void validateVasOfferPlatform(ISoSubmitObj soSubmitObj,List<IOpenOrderExe> orderInfo,long customerId) throws Exception;
    
    /**
     * 验证批量退订addon时是否可以换平台，如果可以换，返回换平台相关的参数
     * @author: huanglun     
     * @date:   2023年10月16日 下午5:47:13   
     * @Description:
     */
    public Map<String, String> verifyBatchUnsubAddonAndChangePlatform(long custId,long userId,IInsOfferValue[] allAddonInsOffValues,long delAddonOfferId,String newPlatform,IBOOrdBatSingleOrderValue batSingleOrdValue) throws Exception;
    
    /**
     * 验证批量订购addon时是否可以换平台，如果可以换，返回换平台相关的参数
     * @author: huanglun
     * @date:   2023年10月27日 下午4:14:56
     * @Description:
     */
    public Map<String, String> verifyBatchSubAddonAndChangePlatform(long subAddonOfferId,IInsUserValue insUserValue,IBOOrdBatSingleOrderValue batSingleOrdValue) throws Exception;
    
    public Map<String, String> isBeforeOldOfferEffDate(long userId, String newEffDate) throws Exception ;

    public int queryVpnOngoingCount(long custId,String vpnId, String platform,String billId) throws Exception;
}


