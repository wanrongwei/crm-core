package com.asiainfo.crm.so.order.rboss.service.interfaces;

import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ai.bce.ivalues.IBceDealReturnData;
import com.ai.omframe.order.data.ivalues.ISoOfferData;
import com.ai.omframe.order.data.ivalues.ISoOrderData;
import com.ai.omframe.order.ivalues.IOVOrderCustomer;
import com.ai.omframe.order.ivalues.IOVOrderOffer;
import com.ai.omframe.order.valuebean.OrderValueChain;
import com.ai.pce.exception.PceException;
import com.asiainfo.crm.so.order.ordRes.bo.ChgSimCardPhoneNoInfo;

/**
 * Copyright: Copyright (c) 2012 Asiainfo-Linkage
 *
 * @Description:业务受理处理接口
 * @version: v1.0.0
 * @author: barnett
 * <p/>
 * <p/>
 * Modification History:
 * Date          Author          Version            Description
 * ---------------------------------------------------------*
 * 2012-9-1      barnett      v1.0.0
 */
public interface IOrderDataSV {


    /**
     * 销号
     * @param serviceNum
     * @return
     * @throws Exception
     */
    public IBceDealReturnData preDestroy(String serviceNum) throws Exception;

    /**
     * 支付关系处理
     *
     * @param acctId 账户ID
     * @param billId 计费号---》主用户的计费号
     * @param users  成员列表
     *               KEY{BILL_ID
     *               ITEM_ID
     *               OP_TYPE
     *               PAY_TYPE
     *               PAY_VALUE
     *               }
     * @return
     * @throws Exception
     */
    public IBceDealReturnData uniAcctRelations(long acctId, String billId, List<Map> users) throws Exception;



    /**
     * 备卡激活接口
     *
     * @param serviceNum
     * @return
     * @throws Exception
     */
    public IBceDealReturnData backActive(String serviceNum,String iccId) throws Exception;


    /**
     *
     * 过户接口
     *
     * @param serviceNum
     * @param map
     * @return
     */
    public IBceDealReturnData transferOwnership(String serviceNum,HashMap map) throws Exception;


    /**
     * 不换卡
     */
    public IBceDealReturnData changeSimCard(Map param) throws Exception;
    
    /**
     * 不换卡
     */
    public IBceDealReturnData changePhone(Map param) throws Exception;
    
    public IBceDealReturnData changePhone4PSTN(Map param) throws Exception;

    public IBceDealReturnData changePhone4NC(Map param) throws Exception;
    /**
     * 
     * @Function transferOwnership
     * @Description 不支持新建客户、账户，只支持选择客户、账户
     *
     * @param map (BILL_ID手机号码，必传；NEW_CUST_ID下家客户编号，必传；NEW_ACCT_ID下家账户编号，必传；BOOKING_DATE预约时间，可空，空表示立即)
     * @return
     * @throws Exception
     *
     * @version v1.0.0
     * @author lilong
     * @date 2014-9-15 下午8:04:16
     * 
     * <strong>Modification History:</strong><br>
     * Date         Author          Version            Description<br>
     * ---------------------------------------------------------<br>
     * 2014-9-15     lilong           v1.0.0               修改原因<br>
     */
    public IBceDealReturnData transferOwnership(Map map) throws Exception;
    
    /**
    * 过户前校验
    * @param newCustId
    * @param billId
    * @return
    */
    public void transferOwnershipCheck(String newCustId,String billId) throws Exception;
    
    /**
    *
    * 预约过户接口
    *
    * @param serviceNum
    * @param map
    * @return
    */
    public IBceDealReturnData appiontTransferOwnership(String serviceNum,HashMap map) throws Exception;
    
    /**
     * 预销户重入网
     * @param openParaMap
     * @return
     * @throws Exception
     */
    public IBceDealReturnData preTerminReAccess(Map openParaMap) throws Exception;
    
    
    /**
     * 
     * @Function preTermination
     * @Description 预销户
     *
     * @param map ()
     * @return
     * @throws Exception
     *
     * @version v1.0.0
     * @author zhanglei
     * 
     */
    public IBceDealReturnData preTermination(Map map) throws Exception;
    
    
    
    /**
     * 
     * @Function preTermination4WS
     * @Description WholeSale预销户
     *
     * @param map ()
     * @return
     * @throws Exception
     *
     * @version v3.1.0
     * @author zhanglei
     * 
     */
    public IBceDealReturnData preTermination4WS(Map param) throws Exception;
    
    /**
     * 
     * @Function reAccess4WS
     * @Description WholeSale预销重入网
     *
     * @param map ()
     * @return
     * @throws Exception
     *
     * @version v3.1.0
     * @author zhanglei
     * 
     */
    public IBceDealReturnData reAccess4WS(String billId, Map extMap) throws Exception, RemoteException;
    
    /**
     * 
     * @Function destroyUser4WS
     * @Description WholeSale销户
     *
     * @param map ()
     * @return
     * @throws Exception
     *
     * @version v0.3.1
     * @author zhanglei
     * 
     */
    public IBceDealReturnData destroyUser4WS(long userId, HashMap map) throws Exception, RemoteException;
    
    /**
     * lilong
     * 保存客户订单
     * @param aOVOrderCustomer
     * @throws Exception
     */
    public void saveOrdCust(IOVOrderCustomer aOVOrderCustomer)throws Exception;
    
    /**
     * lilong
     * 新用户个人新装时订购增值产品
     * @param customerOrderId
     * @param aOVOrderCustomer
     * @return
     * @throws Exception
     */
    public List getSoUserDatasOfMemOfferNewProdAndSetUserId(long customerOrderId) throws Exception;

    /***
     * 短流程改造为长流程之后，在创建策划订单之后，将策划订单号更新到orderdetail中，以备后面使用
     * 因为创建订单是process所以orderdata在内存中，直接从内存中获取soorderdata保存数据
     * @param customerOrderId
     * @throws Exception
     */
    public void updateOrderDetail(long customerOrderId) throws Exception;

    public void saveOVOrderOffer(IOVOrderCustomer aOVOrderCustomer) throws Exception;
   
    /**
     * @Function updateOrderDetail
     * @Description 
     *
     * @param soOfferData
     * @throws Exception
     *
     * @version v1.0.0
     * @author wangxw3
     * @date 2015-3-22 下午9:30:10
     */
    public void updateOrderDetail(ISoOfferData soOfferData) throws Exception;
    
    /**
     * OSE发起反悔，CRM进行流程处理(dsl)
     * @param userId
     * @param regretFlag
     * @param baseInfoMap
     * @return
     * @throws Exception
     */
    public IBceDealReturnData regretDslOrder(long userId,String regretFlag,Map baseInfoMap,String billId, String mainOfferId) throws Exception;
    
    /**
     * OSE发起反悔，CRM进行流程处理(mobile)
     * @param userId
     * @param regretFlag
     * @param baseInfoMap
     * @return
     * @throws Exception
     */
    public IBceDealReturnData regretOrder(long userId,String regretFlag,Map baseInfoMap) throws Exception;
        
    /**
     * changeMainOfferForM2M M2M换正式套餐
     * @param userId
     * @param offerId
     * @param doneDate
     * @return IBceDealReturnData
     * @throws Exception
     * @author zhangxiang3
     */
    public IBceDealReturnData changeMainOfferForM2M(long userId,long offerId,Timestamp doneDate,HashMap map) throws Exception;
    
    /**
     * changeAddOnEffectDateForM2M M2M修改Add-on生效时间
     * @param userId
     * @param offerInstId
     * @param doneDate
     * @param offerId
     * @return IBceDealReturnData
     * @throws Exception
     * @author zhangxiang3
     */
    public IBceDealReturnData changeAddOnEffectDateForM2M(long userId,long offerInstId,long offerId, Timestamp doneDate,HashMap map) throws Exception;
    
    /**
     * buyAddOnForM2M M2M订购Add-on
     * @param userId
     * @param doneDate
     * @param offerId
     * @return IBceDealReturnData
     * @throws Exception
     * @author zhangxiang3
     */
    public IBceDealReturnData buyAddOnForM2M(long userId,long offerId, Timestamp doneDate,HashMap map) throws Exception;

    /**
     * 
     * @param customerOrderId
     * @return
     * @throws Exception
     */
    public void createInsuranceOrderOfVirtualUser(long customerOrderId)  throws Exception;
    
    public void setUserTypeOfInsurance(ISoOfferData aSoOfferData,OrderValueChain aOrderValueChain)throws Exception;

    public void saveClaimInsuTime(long userId) throws Exception;
    
    public boolean updateInsuranceRecord(ISoOfferData aSoOfferData,String virBillId ) throws Exception;
    /**
     * 老保险12月之内索赔两次自动销户
     * @param customerOrderId
     * @throws Exception
     */
    public void destroyUserOfInsuance(long customerOrderId)throws Exception;
    
    /**
     * 老保险12月之内索赔两次自动销户
     * @param userId
     * @param offerId
     * @return
     * @throws Exception
     */
    public boolean isDeleteInsurance(long userId, long offerId) throws Exception;
    
    /**
     * 判断是否业务变更订购保险
     * @param customerOrderId
     * @return
     * @throws Exception
     */
    public String isInsurance(long customerOrderId) throws Exception;
    
    /**
     * 保险开户保存保险记录
     * @param customerOrderId
     * @throws Exception
     */
    public void saveInsuranceRecord(long customerOrderId) throws Exception;
    
    /**
     * 提供给保险公司接口开户所需要的参数
     * @param customerOrderId
     * @return
     * @throws Exception
     */
    public HashMap createNewInsurParam(long customerOrderId) throws Exception;
    
    /**
     * 提供给保险公司接口销户所需要的参数
     * @param customerOrderId
     * @return
     * @throws Exception
     */
    public HashMap createDeleteInsurParam(long customerOrderId) throws Exception;
    
    /**
     * 提供给保险公司接口更新客户信息所需要的参数
     * @param customerOrderId
     * @return
     * @throws Exception
     */
    public HashMap createUpdatePersonInsurParam(long customerOrderId) throws Exception;
    
    /**
     * 提供给保险公司接口保险索赔所需要的参数
     * @param customerOrderId
     * @return
     * @throws Exception
     */
    public HashMap createClaimInsurParam(long customerOrderId) throws Exception;
    
    public void setHandsetInfoToMap(long handsetOfferId,HashMap map)throws Exception;
    
    /**
     * 是否保险索赔
     * @param aSoOfferData
     * @return
     * @throws Exception
     */
    public boolean isClaimInsurance(long customerOrderId,IOVOrderCustomer aOVOrderCustomer) throws Exception;
    
    /**
     * 是否更新客户信息
     * @param customerOrderId
     * @return
     * @throws Exception
     */
    public boolean isUpdatePerson(long customerOrderId,IOVOrderCustomer aOVOrderCustomer) throws Exception;
    
    /**
     * 提供批量过户、批量开户的信用度校验
     * @param transactId不为空，调用queryCall，为空，调用init
     * @param custId
     * @param custCertCode
     * @param accountId
     * @param extMap
     * @return Map ，key为RESULT值为A的时候，不需要抛异常   其他值的时候抛异常，值为RETMSG
     */
    public Map checkCreditForBatchProcess(String transactId,long custId,String custCertCode,long accountId, Map extMap) throws Exception;
    
    /**
     * @author huangsr
     * 判断是否处理停开机
     * @param customerOrderId
     * @return
     * @throws Exception
     */
    public boolean isDealOSState(long customerOrderId) throws Exception;
    
    //在途单处理了的数据才进临时表
    public void transOrderUserDataToHisDm002(String curYM,Map paramMap,String opRegionId,String tableName,String boName) throws Exception;
    
    /**
     * 
     * <p>Title: saveOrdDtlInfo</p>  
     * <p>Description: 保存报文信息</p>  
     * @param customerOrderId
     * @param dataXML
     * @param regionId
     * @throws Exception  
     * @author YangJie  
     * @date 2018年9月13日  
     * @version SR 0.83
     */
    public void saveOrdDtlInfo(long customerOrderId,String dataXML,String regionId)throws Exception;
    
    /**
     * 
     * <p>Title: changeSimCardAndPhoneNew</p>  
     * <p>Description: 换卡换号</p>  
     * @param param
     * @param chgSimCardInfos
     * @return
     * @throws Exception  
     * @author YJ  
     * @date 2019年2月18日  
     * @version SR 0.83
     */
    public IBceDealReturnData changeSimCardAndPhoneNew(Map param,ChgSimCardPhoneNoInfo[] chgSimCardInfos) throws Exception;
    
    public void saveOVOrdOffer(IOVOrderCustomer aOVOrderCustomer,IOVOrderOffer oldOVOrderOffer,IOVOrderOffer newOVOrderOffer) throws Exception;
    
    public void createInsuranceChOfferOrder(long customerOrderId)throws Exception;
    
    /**
     * 
     * <p>Title: initHandsetInfo</p>  
     * <p>Description: </p>  
     * @param insuranceUserId
     * @param policyNum
     * @param paramMap
     * @throws Exception  
     * @author Yang Jieee  
     * @date 2023年4月18日  
     * @version V1.0
     */
    public void initHandsetInfo(long insuranceUserId, String policyNum, HashMap paramMap) throws Exception;
    
    /**
     * 
     * <p>Title: setAddressInfoToMap</p>  
     * <p>Description: </p>  
     * @param custId
     * @param map
     * @throws Exception  
     * @author Yang Jieee  
     * @date 2023年4月18日  
     * @version V1.0
     */
    public void setAddressInfoToMap(long custId,HashMap map)throws Exception;
    
    /**
     * 
     * <p>Title: getInsuranceReleaseProductId</p>  
     * <p>Description: </p>  
     * @param insurOfferId
     * @param handsetOfferId
     * @return
     * @throws RemoteException
     * @throws PceException
     * @throws Exception  
     * @author Yang Jieee  
     * @date 2023年4月18日  
     * @version V1.0
     */
    public String getInsuranceReleaseProductId(long insurOfferId,long handsetOfferId) throws RemoteException, PceException,Exception;
    
    /**
     * 
     * <p>Title: getElgigatenHandsetInfo</p>  
     * <p>Description: </p>  
     * @param handsetOfferId
     * @param orgImei
     * @param mainCustomerOrderId
     * @param userId
     * @param paramMap
     * @throws Exception  
     * @author Yang Jieee  
     * @date 2023年4月18日  
     * @version V1.0
     */
    public void getElgigatenHandsetInfo(long handsetOfferId, String orgImei, long mainCustomerOrderId, long userId, HashMap paramMap) throws Exception;
    
    /**
     * 
     * <p>Title: putHandsetPrice</p>  
     * <p>Description: </p>  
     * @param handsetOfferId
     * @param orgImei
     * @param mainBillId
     * @param mainCustomerOrderId
     * @param userId
     * @param paramMap
     * @throws Exception
     * @throws RemoteException  
     * @author Yang Jieee  
     * @date 2023年4月18日  
     * @version V1.0
     */
    public void putHandsetPrice(long handsetOfferId, String orgImei,String mainBillId,long mainCustomerOrderId, Long userId, HashMap paramMap)throws Exception, RemoteException;
    long getIccIdDefaultRespId(long offerId,long newIccIdRespId,Object materialIdObj) throws Exception;
}
