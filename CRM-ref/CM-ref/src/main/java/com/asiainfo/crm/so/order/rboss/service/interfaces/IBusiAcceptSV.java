package com.asiainfo.crm.so.order.rboss.service.interfaces;

import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.bce.ivalues.IBceDealReturnData;
import com.ai.omframe.instance.ivalues.IInsUserValue;
import com.ai.omframe.order.data.ivalues.ISoAttrData;
import com.ai.omframe.order.data.ivalues.ISoBusiPriceData;
import com.ai.omframe.order.data.ivalues.ISoOfferData;
import com.ai.omframe.order.data.ivalues.ISoOrderData;
import com.ai.omframe.order.data.ivalues.ISoServicePkgData;
import com.ai.omframe.order.data.valuebean.SoBusiPriceData;
import com.ai.omframe.order.ivalues.IOrdBusiPriceValue;
import com.ai.pce.exception.PceException;
import com.ai.pce.ivalues.IUpItemFeatureValue;
import com.asiainfo.crm.so.common.ivalues.IBOTmBillCycleQueryValue;
import com.asiainfo.crm.so.common.party.ivalues.IBOINSBillCustomerValue;
import com.asiainfo.crm.so.instance.rboss.bo.BOInsxUserBakSimBean;
import com.asiainfo.crm.so.order.rboss.bo.SoOfferExe;
import com.asiainfo.crm.so.order.rboss.ivalues.IOpenOrderExe;
//import com.asiainfo.crm.so.teaminvoke.out.order.SoOrderDataExe;

/**
 * Copyright: Copyright (c) 2012 Asiainfo-Linkage
 *
 * @Description:业务受理处理接口
 * @version: v1.0.0
 * @author: ganliang
 * @date: 2012-9-1
 * <p/>
 * Modification History:
 * Date          Author          Version            Description
 * ---------------------------------------------------------*
 * 2012-9-1      ganliang      v1.0.0
 */
public interface IBusiAcceptSV {
    /**
     * 根据策划获取角色ID
     * @param offerId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public long[] getOfferRoleIds(long offerId) throws Exception,RemoteException;
    /**
     * 业务变更-订购策划接口
     *
     * @param billId
     * @param offerId
     * @param soPordData
     * @param soAttrMap
     * @param payType
     * @param priceList
     * @param validDate
     * @param expireDate
     * @param extendMap
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IBceDealReturnData buyOfferVAS(String billId, long offerId, ISoServicePkgData soPordData[], Map<String,ISoAttrData[]> soAttrMap, long payType,
                                          List priceList, Timestamp validDate, Timestamp expireDate, Map extendMap) throws Exception, RemoteException;

    /**
     * 业务变更-退订策划接口,支持对退订时对属性的修改
     *
     * @param billId
     * @param offerInstId
     * @param priceList
     * @param validDate
     * @param expireDate
     * @param extendMap
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IBceDealReturnData cancelOfferVAS(String billId, long offerInstId, Map<String, ISoAttrData[]> soAttrMap,List priceList,
                                             Timestamp validDate, Timestamp expireDate, Map extendMap) throws Exception, RemoteException;

    /**
     * 业务变更-产品变更接口
     *
     * @param billId
     * @param offerId
     * @param prodData
     * @param offerVASList
     * @param soAttrMap
     * @param validDate
     * @param expireDate
     * @param extendMap
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IBceDealReturnData chgUserFunc(String billId, long offerId,
                                          ISoServicePkgData[] prodData, List offerVASList, Map<String, ISoAttrData[]> soAttrMap,
                                          Timestamp validDate, Timestamp expireDate, Map extendMap) throws Exception, RemoteException;

    /**
     * 业务变更-策划暂停
     * @param billid
     * @param offerInsId  策划实例Id,大于0时,以实例Id为准来恢复策划
     * @param offerId  当offerInsId<0时,以offerId为准来恢复策划
     * @param extendMap
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IBceDealReturnData offerPause(String billid,long offerInsId,long offerId,Map extendMap)throws Exception,RemoteException;

    /**
     * 业务变更-策划恢复
     * @param billid
     * @param offerInsId  策划实例Id,大于0时,以实例Id为准来恢复策划
     * @param offerId  当offerInsId<0时,以offerId为准来恢复策划
     * @param extendMap
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IBceDealReturnData offerResume(String billid,long offerInsId,long offerId,Map extendMap)throws Exception,RemoteException;
    /**
     * 业务变更-换套餐接口
     *
     * @param billId
     * @param newOfferId
     * @param businessId
     * @param servpkgData
     * @param offerVASList
     * @param soAttrMap
     * @param validDate
     * @param expireDate
     * @param extendMap
     * @param mustDelFlag
     * @param inheritProdFlag @return
     * @throws Exception
     * @throws RemoteException
     */
    public IBceDealReturnData chgOfferPlan(String billId, long newOfferId, long businessId, ISoServicePkgData[] servpkgData,
                                           List offerVASList, Map<String, ISoAttrData[]> soAttrMap, Timestamp validDate,
                                           Timestamp expireDate, Map extendMap, boolean mustDelFlag, boolean inheritProdFlag) throws Exception, RemoteException;

    /**
     * 订购退订变更暂停恢复一起受理
     * @param billId
     * @param offerVASList ISoOfferExe对象数组   CREATE/LOGOUT/UPDATE/PAUSE/RESUME
     * @param priceList
     * @param validDate
     * @param expireDate
     * @param extendMap
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IBceDealReturnData offerVASListStore(String billId,List offerVASList, List priceList, Timestamp validDate,
                                                Timestamp expireDate, Map extendMap) throws Exception,RemoteException;
    /**
     * 多个增值策划的开通
     * @param billId
     * @param offerIds
     * @param attrMap 属性 以offerId(String) 为key ISoAttrData[]  为value  没有传null
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map orderOffers(String billId,long[] offerIds,Map attrMap)throws Exception,RemoteException;
    /**
     * 规则校验接口
     * @param billId
     * @param soBusiList
     * @param extendMap
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public ISoOrderData checkSoBusiRule(String billId ,List soBusiList,Map extendMap)throws Exception ,RemoteException;

    /**用户是否可办理,判断用户是否可以受理套餐或产品
     * 返回MAP,Key=ERROR_CODE,true表示成功,false表示失败 key=ERROR_DESC,失败时候的描述
     * @param billId 计费号码
     * @param operType CREATE 增加 UPDATE 修改 LOGOUT 删除
     * @param offerId 套餐编号
     * @throws Exception
     * @throws RemoteException
     */
    public Map chkUserPlanProd(String billId, String operType, long offerId)throws Exception, RemoteException;
    /**
     * 开户
     * @param openParaMap
     * openParaMap:
       openParaMap.put(RBossConst.CUST_INFO_FORM_NAME, custDcs); "CUST_NAME","CUST_TYPE","CUST_CERT_TYPE","CUST_CERT_CODE"  若新建客户则不传CUST_ID
       openParaMap.put(RBossConst.ACCT_INFO_FORM_NAME, dcAcct);
       openParaMap.put("cmAcctFrmBillCycle", dcAcctZhangqi);
       openParaMap.put("cmAcctFrmCustomize", cmAcctFrm);
	   openParaMap.put("IS_NEED_PREOCCUPY_SIMCARD", "0");需要预占sim卡号 0不需要 1需要
	   openParaMap.put("IS_NEED_PREOCCUPY_BILL", "0");
	   openParaMap.put("BILL_ID", "13940223686");
	   openParaMap.put("PROD_CATALOG_ID", 171000000001L); GSM
	   openParaMap.put("SIM_CARD_ID", "898602A0061190008612");
	   openParaMap.put("REGION_ID", "240");
	   openParaMap.put("EXPIRE_DATE", "2099-12-31 23:59:59");
	   openParaMap.put("EXT_CHANNEL_TYPE", "1");
	   openParaMap.put("STATE", "1");
	   openParaMap.put("PLAN_ID", "111024010181");
	   openParaMap.put("IS_BATCH_ORDER", "0");
	   openParaMap.put("PASSWORD", ""); //密码
	   openParaMap.put("ACCT_INFO", acctInfoMap);
	   openParaMap.put("CUST_INFO", custInfoMap);
	   openParaMap.put("CUST_NAME", "zxzxName");
	   openParaMap.put("CUST_CERT_TYPE", "7");//证件类型
	   openParaMap.put("CUST_CERT_CODE","7777");//证件号码
	   openParaMap.put("OFFER_VAS", offerList);
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IBceDealReturnData openNewUser(Map openParaMap) throws Exception, RemoteException;

    /**
     * 校验家庭网业务  支持成员的属性变更,产品变更
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
    public IBceDealReturnData dealOfferJTWChck(String billId, long offerId, String operType, ISoServicePkgData[] mProdDatas, Map mAttrMap, List memberList, Map extendMap) throws Exception, RemoteException;
    /**
     * 家庭网业务  支持成员的属性变更,产品变更
     *
     * @param billId
     * @param offerId
     * @param operType  CREATE:组网  LOGOUT:拆网  UPDATE:更新成员
     * @param mProdDatas 户主产品 可null
     * @param mAttrMap 户主属性 可null
     * @param memberList<Map>  BILL_ID:成员手机号
     *                         STATE:成员状态  1:新增 2:修改 3删除
     *                         SO_ATTR:成员的属性变更 Map
     *                         SO_PROD  成员变更的产品 ISoServicePkgData[] servpkgData
     * @param extendMap
     * @throws Exception
     * @throws RemoteException
     */
    public IBceDealReturnData dealOfferJTW(String billId, long offerId, String operType, ISoServicePkgData[] mProdDatas, Map mAttrMap, List memberList, Map extendMap)throws Exception,RemoteException;

    /**
     * 校验用户关系业务
     * @param billId
     * @param offerId
     * @param operType
     * @param memberList
     * @param extendMap
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IBceDealReturnData dealOfferYHGXChck(String billId,long offerId,String operType, ISoServicePkgData[] mProdDatas,Map mAttrMap,List memberList,Map extendMap)throws Exception,RemoteException;
    /**
     * 用户关系业务
     *
     * @param billId  户主手机号
     * @param offerId 策划ID
     * @param operType  CREATE:用户关系受理 LOGOUT:用户关系取消  UPDATE:用户关系成员变更
     * @param extendMap  扩展参数
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IBceDealReturnData dealOfferYHGX(String billId,long offerId,String operType, ISoServicePkgData[] mProdDatas, Map<String, ISoAttrData> mAttrMap,List memberList,Map extendMap)throws Exception,RemoteException;

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
    /**密码修改
     * @param billId 计费号码
     * @param isVerifyOldPw 是否需要验证密码
     * @param oldPw 旧密码
     * @param newPw 新密码
     * @throws Exception
     * @throws RemoteException
     */
    public IBceDealReturnData chgPassword(String billId, int isVerifyOldPw, String oldPw,String newPw)throws Exception, RemoteException;
    
    /**
     * 
     *
     * @Function: resetPassword
     * @Description: 密码重置
     *
     * @param:	billId 服务手机号
     * @param:	password 新密码
     * @return：IBceDealReturnData
     * @throws： Exception, RemoteException 
     *
     * @version: V1.0.0
     * @author: Joes.Xin <xinjl@asiainfo-linkage.com>
     * @date: 2012-9-17 上午10:06:19 
     *
     * Modification History:
     * Date                     Author          Version            Description
     *---------------------------------------------------------------------*
     * 2012-9-17  上午10:06:19        Joes.Xin          V1.0.0             Add
     *
     */
    public IBceDealReturnData resetPassword(String billId, String password)throws Exception, RemoteException ;
    
    /**激活手机邮箱
     * @param serviceNum 计费号码
     * @param userId 用户编号
     * @throws Exception
     * @throws RemoteException
     */
    public List activeMobileMail(String serviceNum , String userId)throws Exception, RemoteException;

    /**   
     * @Function: dealUserGuaranteeService
     * @Description: 受理用户担保业务
     *
     * @param: billId,业务受理号码，不可为空
     * 		  quaranteeNum，担保号码，不可为空
     * 		  serviceId，担保业务类型：1—国际长途,2—国际漫游,3—他人开机，不可为空
     * 		  beginDate，开始日期
     * 		  endDate，结束日期
     * @return：
     * @throws：
     *
     * @version: v1.0.0
     * @author: xiaozhibi
     * @date: 2012-9-18下午07:39:38 
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2012-9-18      xiaozhibi           v1.0.0               修改原因
     */
     public void dealUserGuaranteeService(String billId,String quaranteeNum,
     		int serviceId,Timestamp beginDate,Timestamp endDate) throws Exception,RemoteException;
     
     
     /**
     * @Description: 套卡激活
     *
     * @param billId
     * @return
     * @throws Exception
     * @throws RemoteException
     *
     * @version: v1.0.0
     * @author:  MAJUN
     * @date: 2012-9-25 下午07:49:58 
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2012-9-25      MAJUN           v1.0.0               修改原因
      */
     public IBceDealReturnData activeCard(String billId, Timestamp activeTime)throws Exception, RemoteException;
     
     /**
      * 
     * @Function: getBaseStationAndProdList 
     * @Description: 查询基站及策划信息
     *
     * @param:offerId-用户主策划编号，必传
     * @param:regionId-地市编号，必传
     * @param:operId-操作员ID，可为空
     * @param:kindId-组ID，必传
     * @return：Map<基站属性,分时分区策划>
     *			   <IUpItemFeatureValue,IOfferValue>
     * @version: v1.0.0
     * @author: fangyl
     * @date: Sep 29, 2012 3:25:57 PM 
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * Sep 29, 2012     fangyl           v1.0.0               修改原因
      */
     public Map getBaseStationAndProdList(long offerId, String regionId,
			long operId, long kindId) throws PceException, RemoteException,
			Exception;

     /**   
      * @Function: delInsUserForPhoneCallBack
      * @Description: 资源号码回收时，删除营业侧用户资料，
      * 			如ins_user用户表资料，ins_accrel账务关系资料，客户用户关系资料移到销户历史表
      *
      * @param:
      * @return：
      * @throws：
      *
      * @version: v1.0.0
      * @author: xiaozhibi
      * @date: 2012-10-2下午05:00:05 
      *
      * Modification History:
      * Date         Author          Version            Description
      *---------------------------------------------------------*
      * 2012-10-2      xiaozhibi           v1.0.0               修改原因
      */
      public void delInsUserForPhoneCallBack(String billId) throws Exception, RemoteException;

      /**   
    * @Function: updateInsDataForUserZQChg
    * @Description: 用户由于办理业务，导致付费关系变更，导致用户账期变更，需要修改实例数据
    *
    * @param: userId，用户编号，必传
    * 		  oldZhangqi，用户老账期，必传
    * 		  extendMap，扩展新增，如父订单
    * @return：
    * @throws：
    *
    * @version: v1.0.0
    * @author: xiaozhibi
    * @date: 2012-10-4下午05:00:32 
    *
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * 2012-10-4      xiaozhibi           v1.0.0               修改原因
    */
    public void updateInsDataForUserZQChg(long userId,int oldZhangqi,Map extendMap) throws Exception, RemoteException;

    /**   
     * @Function: updateInsDataForAcctZQChg
     * @Description: 用户主动办理用户账期变更，引起营业实例数据变更
     *
     * @param: acctId，用户编号，必传
     * 		   oldZhangqi，用户老账期，必传
     * 		   newZhangqi，新账期
     * 		   validType，生效类型，1-立即生效，2-下月生效
     * @return：
     * @throws：
     *
     * @version: v1.0.0
     * @author: xiaozhibi
     * @date: 2012-10-4下午05:00:32 
     * wo
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2012-10-4      xiaozhibi           v1.0.0               修改原因
     */
     public void updateInsDataForAcctZQChg(long acctId,int oldZhangqi,int newZhangqi,int validType) throws Exception, RemoteException;
     
     /**   
    * @Function: checkUserCanOrderOffer
    * @Description: 校验用户是否可以订购指定策划列表
    *
    * @param: billId，用户手机号
    *         offerIdList，指定策划列表
    * @return：List,可订购策划列表
    * @throws：
    *
    * @version: v1.0.0
    * @author: xiaozhibi
    * @date: 2012-10-12下午08:02:13 
    *
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * 2012-10-12      xiaozhibi           v1.0.0               修改原因
    */
    public List checkUserCanOrderOffer(String billId,List offerIdList) throws Exception, RemoteException;
     
     /**
      * 
     * @Function: openNewUserNetPre 
     * @Description: 网上开户
     *
     * @param:orderId-网上开户订单编号
     * @return：返回结果描述
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: yal.fang
     * @date: Oct 12, 2012 7:22:16 PM 
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * Oct 12, 2012     fangyl           v1.0.0               修改原因
      */
     public Map openNewUserNetPre(long orderId)throws Exception,RemoteException;

    /**
     * 业务费用计算接口
     * @param billId
     * @param busiId
     * @param simCardId
     * @param mainOfferId
     * @param offerPloyId
     * @param regionId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map calBusinessFee(String billId ,long busiId,String simCardId,long mainOfferId,String offerPloyId,String regionId )throws Exception, RemoteException;
    
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
    public IBceDealReturnData openPayCard(String servNum, long offerId,
			int offEffect, long monOfferId, int monOffEffect,
			long halfOfferId, int halfOffEffect, long prodId,
			String spCode, String servCode) throws Exception, RemoteException;

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
    * @Function: dealTieTongBing
    * @Description: 受理铁通捆绑业务，目前只支持解绑定
    *
    * @param:billId,业务号码,必传
    * 		 offerId,铁通捆绑增值策划id，解绑定是可以不传
    *        operType,目前只支持解绑定LOGOUT
    *        memList,成员列表
    *        extendMap,扩展信息
    * @return：
    * @throws：
    *
    * @version: v1.0.0
    * @author: xiaozhibi
    * @date: 2012-10-22下午07:34:43 
    *
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * 2012-10-22      xiaozhibi           v1.0.0               修改原因
    */
    public IBceDealReturnData dealTieTongBing(String billId,long offerId,String operType,List memList,Map extendMap)throws Exception,RemoteException;

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
     * 处理用户停开机，批量停开机用
     * @param billId	手机号码
     * @param AppointOrderDc	预约信息
     * @return
     * @throws Exception
     * @throws RemoteException
     * 	lilong
     */
    public IBceDealReturnData dealUserStopOpenNew(String billId,DataContainerInterface[] AppointOrderDc)throws Exception, RemoteException;
    
    /**   
     * @Function: dealUserStopOpen
     * @Description: 处理用户停开机
     *
     * @param: billId，业务受理号码，必传
     *         osType,停开机类型，必传：0：管理停机,1：管理复机，2：营业停机，3：营业复机,4：帐务停机，5：帐务复机,6:呼叫限制，7，呼叫限制取消
     *         appointType 是否预约 0不预约1预约
     *         appointTime 预约时间
     *         isLost,是否存在有效被盗/遗失关系停机信息,营业停机时可以注明被盗或遗失停机，默认不存在,0：不存在,1：存在。
     * @return：
     * @throws：
     *
     * @version: v1.0.0
     * @author:yinxy
     * @date: 2014-04-22上午09:31 
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2014-04-22      yinxy           v1.0.0               修改原因  增加预约时间
     */
     public IBceDealReturnData dealUserStopOpenForAppoint(String billId,String osType,String appointType ,String appointTime,int isLost)throws Exception, RemoteException;
    
     /**
      * OTT 停复机
      * @param billId
      * @param osType
      * @param appointType
      * @param appointTime
      * @param isLost
      * @return
      * @throws Exception
      * @throws RemoteException
      */
     public long dealUserStopOpenForOTT(String billId,String osType,String appointType , String appointTime ,int isLost)throws Exception, RemoteException;
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
     * 
    * @Function: activeCreateUserOrder 
    * @Description: 网上开户订单激活
    *
    * @param:orderId-订单编号
    * @return：返回结果描述
    * @throws：异常描述
    *
    * @version: v1.0.0
    * @author: fangyl
    * @date: Nov 6, 2012 1:56:00 PM 
    *
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * Nov 6, 2012     fangyl           v1.0.0               修改原因
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
    public Map checkUserPwAndInternetPw(String billId, String pwdType, String passWord) throws Exception, RemoteException;

    /**
     * 订购或修改一个策划,并捆绑到一个策划实例上
     * @param billId
     * @param subOfferId
     * @param operType
     * @param busiId
     * @param priceList
     * @param subValidDate
     * @param subExpireDate
     * @param relatedOfferInsId
     * @param extendMap
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map ordSubOffer2Relat(String billId,long subOfferId,String operType,long busiId,List priceList,Timestamp subValidDate,Timestamp subExpireDate ,
                                 long relatedOfferInsId,Map extendMap)throws Exception,RemoteException;
    
    /**
     * 
    * @Function: createUserNet 
    * @Description: 网上开户（高校迎新开户）
    *
    * @param:paraMap-参数信息map
    *   ServiceNum  号码 必传
		ICCID  sim卡号  必传
		MainOfferId 主策划 必传
		CustName 客户名称 必传
		IDType 证件类型 必传
		IDCardNum 证件号码 必传
		
		Gender 性别，选传 1男 2女
		Address 证件地址 选传
		Password 密码 选传
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
    * @Function: dealBusiOrderRollBack
    * @Description: 业务订单回滚
    *
    * @param:@param billId
    * @param:@param userId
    * @param:@param customerOrderId
    * @param:@throws Exception
    * @param:@throws RemoteException
    * @return：void
    * @throws：
    *
    * @version: v1.0.0
    * @author: xiaozhibi
    * @date: 2012-11-13下午08:17:08 
    *
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * 2012-11-13      xiaozhibi           v1.0.0               修改原因
    */
    public IBceDealReturnData dealBusiOrderRollBack(String billId,long userId,long customerOrderId,Map exentdMap) throws Exception, RemoteException;

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
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * 2012-11-19      xiaozhibi           v1.0.0               修改原因
    */
    public IBceDealReturnData dealLogOutOfferVasByKindId(String billId,long userId,long kindId) throws Exception, RemoteException;

	/**   
	* @Function: dealDestoryUser
	* @Description: 处理预销户和销户
	*
	* @param:@param billId
	* @param:@param userId
	* @param:@param extendMap，扩展参数
	* @param:@return
	* @param:@throws Exception
	* @param:@throws RemoteException
	* @return：IBceDealReturnData
	* @throws：
	*
	* @version: v1.0.0
	* @author: xiaozhibi
	* @date: 2012-12-13下午07:58:52 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-12-13      xiaozhibi           v1.0.0               修改原因
	*/
	public IBceDealReturnData dealDestoryUser(String billId,long userId,Map extendMap) throws Exception, RemoteException;

	/**
	 * 删除保险用户，上面接口中会生成soofferdata,跟销户流程中创建的soofferdata重复，引起双工作流问题
	 * @param billId
	 * @param userId
	 * @param extendMap
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IBceDealReturnData dealDestoryInsuranceUser(String billId,long userId,Map extendMap) throws Exception, RemoteException;
	
	/**
	 * OTT虚用户销户
	 * @param billId
	 * @param userId
	 * @param extendMap
	 * @return customerOrderId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public long dealDestoryOTTUser(String billId,long userId,Map extendMap) throws Exception, RemoteException;
			
	/**   
	* @Function: dealOfferIPzhiTongChe
	* @Description: 
	* @param: @param billId
	* @param: @param userId
	* @param: @param extendMap
	* @param: @return
	* @param: @throws Exception
	* @param: @throws RemoteException
	* @return：Map
	* @throws：
	*
	* @version: v1.0.0
	* @author: xiaozb
	* @date: 9:00:15 PM Jan 17, 2013 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Jan 17, 2013       xiaozb           v1.0.0               修改原因
	*/
	public void dealIPzhiTongCheBusi(String billId, Map mainUserAttrMap, List memberList, Map extendMap) throws Exception, RemoteException;

    /**
     * 提供给销户用的策划直接退订接口,不会处理连带退订的业务
     * @param billId
     * @param offerVASList
     * @param priceList
     * @param validDate
     * @param expireDate
     * @param extendMap
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IBceDealReturnData logOutOfferDirect(String billId,long userId, List offerVASList,
                                                List priceList,Timestamp validDate, Timestamp expireDate, Map extendMap)throws Exception,RemoteException;
	/**   
	* @Function: getIPzhiTongCheBusiInfo
	* @Description: 根据号码查询IP直通车信息
	* @param: @param billId
	* @param: @throws Exception
	* @param: @throws RemoteException
	* @return：void
	* @throws：
	*
	* @version: v1.0.0
	* @author: xiaozb
	* @date: 10:57:19 AM Jan 21, 2013 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Jan 21, 2013       xiaozb           v1.0.0               修改原因
	*/
	public Map getIPzhiTongCheBusiInfo(String billId) throws Exception, RemoteException;
	
	/**
     * 网上开户退费撤单
     * @param orderId
     * @return
     * @throws Exception
     * @author fangyl
     * @date 2013-01-21
     */
    public Map orderRollBackForWeb(long orderId)throws Exception;
    
    
    /**   
    * @Function: dealUserStopOpenForChangeCard
    * @Description: 换卡处理用户停开机
    *
    * @param: billId，业务受理号码，必传
    *         osType,停开机类型，必传：0：管理停机,1：管理复机，2：营业停机，3：营业复机,4：帐务停机，5：帐务复机,6:呼叫限制，7，呼叫限制取消
    *         isLost,是否存在有效被盗/遗失关系停机信息,营业停机时可以注明被盗或遗失停机，默认不存在,0：不存在,1：存在。
    *         preCustomerOrderId
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
    public IBceDealReturnData dealUserStopOpenForChangeCard(String billId,int osType,int isLost,long preCustomerOrderId)throws Exception, RemoteException;
    
    
    
    /**   
     * @Function: dealUserStopOpen
     * @Description: 处理用户停开机
     *
     * @param: billId，业务受理号码，必传
     *         osType,停开机类型，必传：停开机编码参照bs_static_data表  code_type = 'SO_USER_OS_STOP_MOBILE','SO_USER_OS_OPEN_MOBILE' 对应codeValue
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
     public IBceDealReturnData dealUserStopOpen(String billId,String osType)throws Exception, RemoteException;
   
     /**
      * 查询是否是客户级停机
      * @param accId
      * @return
      */
     public boolean isAccountStop(long acctId) throws RemoteException, Exception;
     
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
  	 * 群组拆网 传入虚拟用户userId billId 群组选择时策划
  	 * USER_ID：用户编号,billId 必传
  	 * offerId必传
  	 *extendMap 为扩展用
  	 * }
  	 * @return
  	 * @throws Exception
  	 * @throws RemoteException
  	 */
 	public IBceDealReturnData dealGrpDestroy(String billId, long userId, long offerId, Map extendMap) throws Exception, RemoteException;
     
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
     * @param:   userId  simcardNo activeType 均必填
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
	
	public IBceDealReturnData destorySpecialPrepayUser(String billId, long userId,Map extendMap) throws Exception, RemoteException;
	
    /**
     * @Function: 	 dealPreTermination
     * @Description: 预销户接口(通用版)
     * @param:  quitReason ,bookingDate 必传
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
	IBceDealReturnData dealPreTermination(String billId,long userId , Map extendMap ,String quitReason ,Timestamp bookingDate ,String remarks) throws Exception, RemoteException;
	
    /**
     * @Function: 	 preDeteminationFee
     * @Description: 预销户计算罚金(已经过滤了原因，会产生罚金的原因才会调用)
     * @param:   billId, userId , BookingDate 
     * @return:	 返回罚金
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
    public float preDeteminationFee(String billId, long userId , Timestamp bookingDate) throws Exception, RemoteException;
    
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
	public IBceDealReturnData openNewDSLUser(String billId,long custId,long acctId,long baseOfferId,List<SoOfferExe> offerList,List<SoBusiPriceData> priceList,Map addressMap,Map dslParaMap) throws Exception , RemoteException;
	/**
	 * 
	 * @Function updateUserBaseAccrel
	 * @Description 基本帐务关系变更
	 *
	 * @param userId 合约机编号
	 * @param newAcctId 新账户ID
	 * @param extMap
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version v1.0.0
	 * @author zhangyy3
	 * @date 2014年10月17日 上午10:37:11
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014年10月17日     zhangyy3           v1.0.0               修改原因<br>
	 */
    public IBceDealReturnData updateUserBaseAccrel(long userId, long newAcctId, Map extMap)throws Exception, RemoteException;
    
    
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
     * @ extMap:扩展属性Map（预留）
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
	 * 修改增值策划的生效时间
	 * @param offerInstId 策划实例
	 * @param userId 用户编号
	 * @param validDate 生效时间 
	 * @return 
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IBceDealReturnData updateOfferVasEffTimeByInstId(long offerInstId,long userId, Timestamp validDate) throws Exception , RemoteException;

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
        
    public Map openNewConn4DSL(String billId, int dealType, List<IOpenOrderExe> offerList, List<SoBusiPriceData> priceList, Map extendMap) throws Exception, RemoteException;

    
    public IBceDealReturnData chgOfferPlanForDSL(List<IOpenOrderExe> offerList, List<SoBusiPriceData> priceList, String billId, Map extendMap) throws Exception, RemoteException;

    /**
     * Ots开户
     * 目前不确定资源调接口用的号卡状态,所以开户过程中不处理,号卡的预占和实占.
     * 其余操作和 openNewUser 方法相同
     * @param openParaMap
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IBceDealReturnData openNewUserForOTS(Map openParaMap) throws Exception, RemoteException;
    
    public IBceDealReturnData dealUserStopOpenNew4WS(String billId,DataContainerInterface[] AppointOrderDc)throws Exception, RemoteException;
    
    public Map dealVasRepeaterForDSL(long cartId,String billId, List<IOpenOrderExe> offerList,
			List<SoBusiPriceData> priceList, Timestamp validDate,
			long offerId,String offerName,Timestamp expireDate, Map extendMap) throws Exception, RemoteException;
    
    /**
     * switch归还老手机
     * @param cartId
     * @param billId
     * @param offerList
     * @param priceList
     * @param validDate
     * @param offerId
     * @param offerName
     * @param extendMap
     * @param expireDate
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map orderVasOffer4Switch(long cartId,String billId, List<IOpenOrderExe> offerList,
			List<SoBusiPriceData> priceList, Timestamp validDate,
			long offerId,String offerName,Timestamp expireDate, Map extendMap) throws Exception, RemoteException;
    
    public void checkReceiverInfo(String firstName,String lastName,String companyName,String attentionPeople)throws Exception, RemoteException;

    public Map getVasOfferByCondition(String oldImei) throws Exception, RemoteException;

    public IBceDealReturnData broadbandTermination(Map paramMap) throws Exception, RemoteException;
    public IBceDealReturnData mobilePreTermination(Map paramMap) throws Exception, RemoteException;
    public Map getTerminationReason(long offerId)throws Exception, RemoteException;
    public List calcTerminationFee(Map paramMap) throws Exception;        
    public String getAttrID_840001(String priceCategoryCode,IOpenOrderExe openOrderExe)  throws Exception;
    public String getAttrID_820633(Map extMap,String platform,String infrastructureOwner,String priceCategoryCode,String installationId,IOpenOrderExe openOrderExe)  throws Exception;
    public IUpItemFeatureValue getproductFeature(long offerId,long featureId) throws Exception;
    
    public String getInstallAddrIdByPreqResult(String reqOrderId, long custId, String billId) throws RemoteException, Exception;
    
    public ISoAttrData getSoAttrDataByAttrId(ISoOfferData soOfferData, long attrId) throws Exception;

//    public SoOrderDataExe dealOfferNegotiateGroupIdInBulkFile(SoOrderDataExe orderDataExe, String offerNegotiateGroupId)throws Exception ;
    
    public String getGlobalRuleId(String platform, String infrastructureOwner, String priceCategoryCode,
			String installationId, String techType, long offerId, String zipCode, long custId, long agreementId)
			throws Exception, RemoteException;
    
    public String getAfterTaxFee(String priceCategoryCode, long offerId, long custId, long userId)
			throws Exception, RemoteException;
    
    public ISoBusiPriceData[] dealUserStopOpenPrice(String billId, long custId, DataContainerInterface dc) throws Exception;
    
    public ISoBusiPriceData[] dealStopOpenBusiPrice(String billId, long custId, String osType)throws Exception, RemoteException;
    
    /**
     * 
     * @param billId
     * @param terminationReason
     * @param effectiveType
     * @param insUserValue
     * @param businessId
     * @param bookingDate
     * @return
     * @throws RemoteException
     * @throws Exception
     */
    public List caculateTerminateFee(String billId, String terminationReason, String effectiveType,
			IInsUserValue insUserValue, long businessId, Timestamp bookingDate,Map map) throws RemoteException, Exception;
    
    /**
     * 
     * @param cpeObjs
     * @return
     */
    public String getCpeInfoJsonFormat(DataContainer[] cpeObjs);
    
    /**
     * fixedline caculate termination fee
     * @param allOfferIds
     * @param allBusiIds
     * @param allOfferInstIds
     * @param voipOfferIds
     * @param voipOfferInstIds
     * @param voipBusiIds
     * @param terminationKind
     * @param priceMap
     * @param billId
     * @return
     * @throws Exception
     */
    public List buildPricePlan(String allOfferIds,String allBusiIds,String allOfferInstIds,
    		String voipOfferIds,String voipOfferInstIds,
    		String voipBusiIds,String terminationKind,HashMap priceMap,String billId)throws Exception;

    /**
     * 计算io price catagory rc
     * @param offerId
     * @param ioPriceCatagory
     * @return
     * @throws Exception
     */
    public String calcuateIOPriceCatagoryFee(long offerId, String ioPriceCatagory) throws Exception;
}