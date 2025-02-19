package com.asiainfo.crm.so.query.service.interfaces;

import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.bce.ivalues.IBceDealReturnData;
import com.ai.omframe.instance.ivalues.IInsOfferValue;
import com.ai.omframe.instance.ivalues.IInsProdInsSrvValue;
import com.ai.omframe.instance.ivalues.IInsProdValue;
import com.ai.omframe.instance.ivalues.IInsUserValue;
import com.asiainfo.crm.so.common.ivalues.IBOUserInfoValue;
import com.asiainfo.crm.so.common.party.ivalues.IBOInsxFamlyPackActiveValue;
import com.asiainfo.crm.so.exe.remote.third.Crm2InterPubInfo;

/**
 * Created by IntelliJ IDEA.
 * User: gl
 * Date: 12-9-1
 * Time: 下午5:01
 * To change this template use File | Settings | File Templates.
 */
public interface IBusiQrySV {
    /**
     * 根据userId或billId查询用户信息
     * @param userId
     * @param billId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IInsUserValue getInsUser(long userId,String billId)throws Exception,RemoteException;
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
     * 1.0.	销户用户资料查询 (框架使用)
     *
     * @param billId
     * @return IBOUserInfoValue
     * @throws Exception
     * @throws RuntimeException
     */
    public IBOUserInfoValue queryDestUserInfo4CM(String billId) throws Exception, RemoteException;
    /**
     * 根据电话号码查询用户订的所有策划
     * @param billId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IInsOfferValue[] queryUserOrderOffers(String billId) throws Exception,RemoteException;

    /**
     * 根据条件获取和主策划相容的策划列表
     * @param baseOfferId
     * @param regionId
     * @param kindId  策划列表组ID  必传
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public List getOffInfo(long baseOfferId,String regionId,long kindId)throws Exception,RemoteException;

    /**
     * 查询用户指定策划,根据billId,offerId,offerType,validType 查询用户订购的策划实例,
     * 如果kindid>0,则查询结果根据kindId内配置过滤.返回在组内的策划实例
     * @param billId
     * @param offerId   传-1,忽略此条件
     * @param offerType 传null,忽略此条件
     * @param validType -1:本周期及下周期生效,1:本周期生效,2:下周期生效
     * @param kindId    穿-1,忽略此条件
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IInsOfferValue[] getInsOffByBillIdAndOfferId(String billId, long offerId, String offerType,int validType, long kindId)throws Exception,RemoteException;
    /**   
     * @Function: getUserMainOfferDetail
     * @Description: 查询用户基本策划、基本策划下产品、服务、属性信息
     *
     * @param:billId，手机号码;userId,用户编号。这两个参数不能都为空
     * 		 validType，生效类型，0：本周期，1：下周期, 2：全部，默认查询全部
     * 		 isQryProd,是否查询策划下产品信息，默认为false不查询，传入true，则查询策划下产品、服务、属性信息
     * @return：返回的Map的结构如下：
     *       <"OfferInstInfo",OfferMap> ，        本周期基本策划信息
     *       	 <"OfferId"等key,策划相关信息>
	     *       <"ProdInstInfo",ProdValue[]> ，              策划下所有产品信息-List
	     *       	<"ProdId"等key,产品相关信息>
	     *       	<"ServiceInfo",insProdInsSrvValue[]> ，策划下所有服务信息
	     *       		<"ServiceId"等key,服务相关信息>
	     *       		<"AttrInfo",	IInsSrvAttrValue[]> ，		  策划下所有属性信息
	     *       			<"AttrId"等key,属性相关信息>
     *       如果有下周起数据，在上面的Map的key前加个"Next"，如"NextOfferInstInfo"，key对应的数据一致
     * @throws：
     *
     * @version: v1.0.0
     * @author: xiaozhibi
     * @date: 2012-9-21下午05:22:50 
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2012-9-21      xiaozhibi           v1.0.0               修改原因
     */
     public Map getUserMainOfferDetail(String billId,long userId,int validType,boolean isQryProd) throws Exception,RemoteException;
     
     /**
 	 * 
 	 * 业务统一查询条件
 	 * 返回对象接口参数为：
 	 * List<List<Map>> 
 	 * 最外层List 数据查询业务对象集合
 	 * 次层List[0] 表示用户订购关系
 	 * 次层List[1] .. SP企业信息
 	 * 次层List[2] .. SP业务信息
 	 * 
 	 * Map 为 各业务信息具体参数信息
 	 * 
 	 * @Function : querySericeForAllByBillId
 	 * @param pubInfo
 	 * @param busiCode
 	 * @param initType
 	 * @param billId
 	 * @return
 	 * @throws Exception
 	 * @throws RemoteException
 	 * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2012-9-27      xinjl           v1.0.0               修改原因
 	 */

 	public List querySericeForAllByBillId(Crm2InterPubInfo pubInfo,String busiCode,String initType,String billId) throws Exception,RemoteException;

 	/**
	 * 业务统一退订
	 * 
	 * 统一退订业务结果数据
	 * @param pubInfo
	 * @param descMap
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2012-9-27      xinjl           v1.0.0               修改原因
	 */
	public IBceDealReturnData exitServiceForAllByDesc(Crm2InterPubInfo pubInfo,List descMaps) throws Exception,RemoteException;
	/***
	 * 
	* @Function: getOfferDiff
	* @Description: 通过billId查询之前主策划中必选产品 ，若在新策划中该产品 可选，返回产品列表
	*
	* @param:billId
	* @param:baseOfferId
	* @return：List
	* @throws：Exception RemoteException
	*
	* @version: v1.0.0
	* @author: shaying
	* @date: 2012-10-6 下午4:39:49 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-10-6     shaying           v1.0.0               修改原因
	 */
	public Map getOfferDiff(String billId, long baseOfferId) throws Exception,
	RemoteException;
	
	/**
	 * 
	* @Function: getInsUserValueByCond 
	* @Description: 根据客户ID，用户ID或者用户手机号查询用户实例信息
	*
	* @param:客户ID，用户ID，用户手机号三者必传一
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: yal.fang
	* @date: Oct 8, 2012 2:15:07 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Oct 8, 2012     fangyl           v1.0.0               修改原因
	 */
	public IInsUserValue[] getInsUserValueByCond(long userId, String billId,
			long custId) throws Exception, RemoteException;
	
	/**
     * 
    * @Function: getUserProdPack 
    * @Description: 查询用户已订购的产品包信息
    *
    * @param:billId-用户手机号
    * @param:userId-用户编号
    * @return：用户已订购的产品包列表
    * @throws：异常描述
    *
    * @version: v1.0.0
    * @author: fangyl
    * @date: Oct 9, 2012 3:02:41 PM 
    *
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * Oct 9, 2012     fangyl           v1.0.0               修改原因
     */
    public List getUserProdPack(String billId, long userId) throws Exception,
			RemoteException;
    
    /**
     * 
    * @Function: getUserAvailProdPack 
    * @Description: 查询用户可订购的产品包
    *
    * @param:参数描述
    * @return：返回结果描述
    * @throws：异常描述
    *
    * @version: v1.0.0
    * @author: fangyl
    * @date: Oct 9, 2012 5:25:11 PM 
    *
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * Oct 9, 2012     fangyl           v1.0.0               修改原因
     */
    public List getUserAvailProdPack(List availList) throws Exception, RemoteException;

    /**
     *
     * @Function: queryMrgUserByFamilyVirUser
     * @Description: 根据家庭套餐虚拟用户userId查询家长用户实例对象
     *
     * @param:userId 家庭套餐虚拟用户userId
     * @return：返回结果  家长用户实例对象
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: ganliang
     * */
    public IInsUserValue queryMrgInsUserByFamilyVirUser(long userId)throws Exception,RemoteException;

    /**
     * @Function: isZoneSrv
     * @Description: 判断是否小区服务
     *
     * @param serviceId
     * @return
     * @throws RemoteException
     * @throws Exception
     *
     * @version: v1.0.0
     * @author: ganliang
     */
    public boolean isZoneSrv(long serviceId)throws RemoteException,Exception ;

    /**
     * @Function: getZoneProdsByUserId
     * @Description: 查询用户下小区产品
     *
     * @param userId
     * @return
     * @throws RemoteException
     * @throws Exception
     *
     * @version: v1.0.0
     * @author: ganliang
     */
    public IInsProdValue[]  getZoneProdsByUserId(long userId)throws RemoteException,Exception ;

    /**
     * @Function: getZoneProdSrvsByUserId
     * @Description: 查询用户下小区服务
     *
     * @param userId
     * @return
     * @throws RemoteException
     * @throws Exception
     *
     * @version: v1.0.0
     * @author: ganliang
     */
    public IInsProdInsSrvValue[] getZoneProdSrvsByUserId(long userId)throws RemoteException,Exception ;
    /***
     * *
    	 * 
    	* @Function: getUsersOfAcctId
    	* @Description: 
    	*
    	* @param:
    	* @return：List
    	* @throws：Exception 
    	*
    	* @version: v1.0.0
    	* @author: shaying
    	* @date: Oct 12, 2012 8:53:09 PM
    	*
    	* Modification History:
    	* Date         Author          Version            Description
    	*---------------------------------------------------------*
    	* Oct 12, 2012     shaying           v1.0.0               修改原因
     */
    public List getUsersOfAcctId(long acctId) throws Exception, RemoteException;

    /**
     * 查询基本套餐下三选一产品
     * @param brandId
     * @param mainOfferId
     * @param regionId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map getSelThreeOne(long brandId,long mainOfferId,String regionId)throws Exception,RemoteException;

    /**
     * 查询可换主策划
     * @param billId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map getCanOrderMoffer(String billId, String agreementId)throws Exception,RemoteException;
    
    /**
	 * 
	* @Function: getUserMainOffer 
	* @Description: 根据服务号码查询用户的当前主策划信息和下周期主策划信息
	*
	* @param:servNum-用户手机号码
	* @return：返回结果描述
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

	/***
	 * 
	 * @Function: queryUserPrePayOfferInfoByUserId
	 * @Description:根据userId、IMEI查询用户预缴活动信息
	 *
	 * @param:userId 用户编号imei 终端编号
	 * @return：DataContainerInterface[]对象包括：
	 * 			CORPUS_AMOUNT  本金分摊总金额       CORPUS_AMOUNT_TOTAL  本金已分摊总金额
	 * 			PRESENT_AMOUNT_TOTAL 馈赠金已分摊总金额      PRESENT_AMOUNT 馈赠金分摊总金额
	 * 			CORPUS_AMOUNT-CORPUS_AMOUNT_TOTAL   本金分摊剩余金额
	 * 			PRESENT_AMOUNT-PRESENT_AMOUNT_TOTAL 馈赠金分摊剩余金额
	 * @throws：Exception RemoteException
	 *
	 * @version: v1.0.0
	 * @author: shaying
	 * @date: 2012-10-19 下午4:39:49 
	 *
   	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2012-10-19     shaying           v1.0.0               修改原因
	 */
	public DataContainerInterface[] queryUserPrePayOfferInfoByUserId(long userId,String IMEI)throws Exception, RemoteException ;

	/***
	 * 
	 * @Function: queryTermialInfoByBillId
	 * @Description: 根据billId、终端编号查询用户终端信息
	 *
	 * @param:billId 手机号码、imei 终端编号、，billId和imei 不能同时为空
	 * @return：IBOInsxUserTerminalValue[] 
	 * @throws：Exception RemoteException
   	 *
	 * @version: v1.0.0
	 * @author: shaying
	 * @date: 2012-10-19 下午4:39:49 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2012-10-19     shaying           v1.0.0               修改原因
	 */
	public DataContainerInterface[] queryTermialInfoByBillId(String billId,String imei)throws Exception,RemoteException;
    /**
     * 查询用户校园wlan信息
     * 查普通校园WLAN
     * @param billId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map getUserCampusWLAN(String billId)throws Exception,RemoteException;

    /**
     * 查询校园wlan热点信息
     * 查普通校园WLAN
     * @param regionCode
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map getCampusHotPot(String regionCode)throws Exception,RemoteException;
	/***
	 * 
	* @Function: queryTermialInfoByBillIdCount
	* @Description: 返回queryTermialInfoByBillId的个数
	*
	* @param:billId 手机号码、imei 终端编号、，billId和imei 不能同时为空
	* @return：int 
	* @throws：Exception RemoteException
	*
	* @version: v1.0.0
	* @author: shaying
	* @date: 2012-10-6 下午4:39:49 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-10-6     shaying           v1.0.0               修改原因
	 */  
	public int queryTermialInfoByBillIdCount(String billId,String imei)throws Exception,RemoteException;	  
	/***
	 * 
	* @Function: queryUserPrePayOfferInfoByUserIdCount
	* @Description: 返回queryUserPrePayOfferInfoByUserId的个数
	*
	* @param:userId 用户编号imei 终端编号
	* @return：int
	* @throws：Exception RemoteException
	*
	* @version: v1.0.0
	* @author: shaying
	* @date: 2012-10-6 下午4:39:49 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-10-6     shaying           v1.0.0               修改原因
	 */
	public int queryUserPrePayOfferInfoByUserIdCount(long userId, String IMEI) throws Exception, RemoteException;

	/***
	 * 
	 * @Function: getResOperOrderTerminalValues
	 * @Description: 根据IMEI业务名称 归属组织 终端状态 操作时间 
	 *
	 * @param:IMEI
	 * @return：IBOResOperOrderTerminalValue[] 
	 * @throws：Exception RemoteException
	 *
	 * @version: v1.0.0
	 * @author: shaying
	 * @date: 2012-10-19 下午4:39:49 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2012-10-19     shaying           v1.0.0               修改原因
	 */
	public  DataContainerInterface[]  getResOperOrderTerminalValues(String IMEI)throws Exception,RemoteException;
	/***
	 * 
	* @Function: getResOperOrderTerminalValuesCount
	* @Description: 返回getResOperOrderTerminalValues的个数
	*
	* @param:IMEI
	* @return：int
	* @throws：Exception RemoteException
	*
	* @version: v1.0.0
	* @author: shaying
	* @date: 2012-10-6 下午4:39:49 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-10-6     shaying           v1.0.0               修改原因
	 */
	public int getResOperOrderTerminalValuesCount(String IMEI)throws Exception,RemoteException;

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
    public Map getSPInfo(String spCode, String serviceCode, long offerId, String serviceType, long kindId) throws Exception, RemoteException ;

    /**
     * 查询用户历史订购信息
     * 查INS_OFF_INS_USER表
     * @param billId
     * @param offerKindId
     * @param beginTime
     * @param endTime
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map getUserOfferHistory(String billId, long[] offerKindId, Timestamp beginTime, Timestamp endTime) throws Exception, RemoteException ;
	/***
	 * 
	* @Function: getUserCommonInfo
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
     * @Function: getUserAvailPloyOffer
     * @Description: 查询用户可订购的活动
     * @param:availPloyOffers-用户可订购的活动
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
    public List getUserAvailPloyOffer(List availPloyOffers) throws Exception, RemoteException;
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
	*------------------------------------------------------ ---*
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
    public  List getUserAllMscInfo(String billId) throws Exception,
	RemoteException;

    /**
     * 查询用户亲情通礼包是否激活
     * @param billId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IBOInsxFamlyPackActiveValue queryPresentPackageStatus(String billId)throws Exception,RemoteException;
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
     * 判断这个账户下的用户是否全是风险控制用户
     * @param acctId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public boolean isMonitorAcct(long acctId)throws Exception,RemoteException;
    
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
     * add by tuhc 
     * @param custId
     * @param extendMap
     * @return
     * @throws RemoteException
     * @throws Exception
     */
    public DataContainer[] getAllInfos(long custId, Map extendMap,int start, int end) throws RemoteException, Exception;

    public int getAllInfoCount(long custId, Map extendMap) throws RemoteException, Exception;

    
}