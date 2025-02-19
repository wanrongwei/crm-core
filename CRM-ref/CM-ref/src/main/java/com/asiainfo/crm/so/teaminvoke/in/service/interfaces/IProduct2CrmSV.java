package com.asiainfo.crm.so.teaminvoke.in.service.interfaces;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.pce.bean.ProdCoInfo;
import com.ai.pce.exception.PceException;
import com.ai.pce.ivalues.IAllNetConfValue;
import com.ai.pce.ivalues.IAttributeValue;
import com.ai.pce.ivalues.IBusiOperValue;
import com.ai.pce.ivalues.IBusiPriceValue;
import com.ai.pce.ivalues.ICommunityInfoValue;
import com.ai.pce.ivalues.IDeductAttrValue;
import com.ai.pce.ivalues.IItemRelatValue;
import com.ai.pce.ivalues.IItemValue;
import com.ai.pce.ivalues.IOfferIncludeOfferValue;
import com.ai.pce.ivalues.IOfferPlanBroadbandValue;
import com.ai.pce.ivalues.IOfferRelatPriceValue;
import com.ai.pce.ivalues.IOfferRelatProductValue;
import com.ai.pce.ivalues.IOfferValue;
import com.ai.pce.ivalues.IPriceValue;
import com.ai.pce.ivalues.IProductSpecValue;
import com.ai.pce.ivalues.IProductValue;
import com.ai.pce.ivalues.IRoleValue;
import com.ai.pce.ivalues.IServiceRelatAttrValue;
import com.ai.pce.ivalues.ISmsTemplateValue;
import com.ai.pce.ivalues.ISpBusiTypeValue;
import com.ai.pce.ivalues.ISpInfoValue;
import com.ai.pce.ivalues.ISpServiceByBusiTypeValue;
import com.ai.pce.ivalues.ISpServiceValue;
import com.ai.pce.ivalues.ISubjectAggregateValue;
import com.ai.pce.ivalues.IUpAllNetConfByCodeAndTypeValue;
import com.ai.pce.ivalues.IUpGroupPromConfValue;
import com.ai.pce.ivalues.IUpItemFeatureValue;


/**
* Copyright: Copyright (c) 2011 Asiainfo-Linkage
*
* @ClassName: IProduct2CrmSV.java
* @Description: 产品组提供给CRM的接口汇集类
*
* @version: v1.0.0
* @author: yaojx
* @date: Dec 19, 2011 3:30:05 PM
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Dec 19, 2011     yaojx           v1.0.0               修改原因
*/
public interface IProduct2CrmSV {

	/**
	* @Function: IProduct2CrmSV.java
	* @Description: 根据科目类型查询科目信息
	*
	* @param aggrType  科目类型
	* @return
	* @throws PceException
	* @throws Exception
	* @throws RemoteException
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: yaojx
	* @date: Dec 19, 2011 3:31:14 PM
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Dec 19, 2011     yaojx           v1.0.0               修改原因
	*/
	public ISubjectAggregateValue[] getSubjectAggrByAggrType(long aggrType)throws PceException,Exception, RemoteException;

	 /**
	 * 根据产品单元ID和扩展属性ID获取相关Feature信息
	 *
	 * @return  UpItemFeature（没有该属性则返回null）
	 * @throws  Exception, RemoteException
	 *
	 * @version v1.0.0
	 * @author  zhangkf
	 * @date: Jue 21, 2011
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jue 21, 2011     zhangkf           v1.0.0               修改原因
	 */
	public IUpItemFeatureValue getItemFeatureByProdAndFeatureId(long productItemId, long featureId)
			throws Exception, RemoteException;

	public IUpItemFeatureValue getItemFeatureByProdAndFeatureIdAndValue(long productItemId,
            long featureId, String featureValue ) throws Exception, RemoteException ;
	/**
	 * @Function: IProduct2CrmSV::getCBossPlatformData
	 * @Description: 查询CBOSS所有平台数据的接口
	 *
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: caiwm <caiwm@asiainfo-linkage.com>
	 * @date: 2011-12-31下午12:51:46
	 *
	 * Modification History:
	 * Date							Author				Version				Description
	 *------------------------------------------------------------------------------------*
	 * 2011-12-31下午12:51:46			    caiwm				v1.0.0					new
	 */
	public ISpBusiTypeValue[] getCBossPlatformData() throws Exception,RemoteException;

	/**
	 * @Function: IProduct2CrmSV::getSpInfoBySpCode
	 * @Description: 根据提供商编码spCode查询提供商信息spInfo
	 *
	 * @param spCode
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: caiwm <caiwm@asiainfo-linkage.com>
	 * @date: 2011-12-31下午01:32:21
	 *
	 * Modification History:
	 * Date							Author				Version				Description
	 *------------------------------------------------------------------------------------*
	 * 2011-12-31下午01:32:21			    caiwm				v1.0.0					new
	 */
	public ISpInfoValue getSpInfoBySpCode(String spCode) throws Exception,RemoteException;

	/**
	 * @Function: IProduct2CrmSV::findSpServiceByBusiType
	 * @Description: 根据CRM侧操作类型，查询SpService信息
	 *
	 * @param busiType
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: caiwm <caiwm@asiainfo-linkage.com>
	 * @date: 2011-12-31下午01:45:39
	 *
	 * Modification History:
	 * Date							Author				Version				Description
	 *------------------------------------------------------------------------------------*
	 * 2011-12-31下午01:45:39			    caiwm				v1.0.0					new
	 */
	public ISpServiceByBusiTypeValue[] findSpServiceByBusiType(long busiType) throws Exception,RemoteException;

	/**
	 * @Function: IProduct2CrmSV::getSpServiceByProdId
	 * @Description: 根据产品Id查询SpService信息
	 *
	 * @param prodId
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: caiwm <caiwm@asiainfo-linkage.com>
	 * @date: Jan 4, 201210:47:08 AM
	 *
	 * Modification History:
	 * Date							Author				Version				Description
	 *------------------------------------------------------------------------------------*
	 * Jan 4, 201210:47:08 AM			    caiwm				v1.0.0					new
	 */
	public ISpServiceValue getSpServiceByProdId(long prodId) throws RemoteException,Exception;

	public ISpServiceValue getSpServiceBySpIdSpOperationCode(String spId,String OperationCode)throws RemoteException,Exception;

	public IServiceRelatAttrValue[] getAttributeBySpServiceId(long serviceId) throws RemoteException,Exception;

	/**
     * 根据条件查询宽带基本策划信息
     * @param accessTypes
     * @param cooperationTypes
     * @param marketTypes
     * @param broadband
     * @param regionCode
     * @return
     * @throws RemoteException
     * @throws Exception
     */
    public IOfferPlanBroadbandValue[] getBroadbandBaseOffer(String[] accessTypes, String[] cooperationTypes, String[] marketTypes, long broadband, String regionCode) throws RemoteException,Exception;
    /**
     * 根据基本策划ID获取对应的增值策划
     *
     * @param offerId
     * @param regionCode
     * @return
     * @throws PceException
     * @throws Exception
     * @throws RemoteException
     */
    public IOfferPlanBroadbandValue[] getBroadbandVasOffer(long offerId, String regionCode) throws PceException, Exception, RemoteException;
    /**
     * 根据指定参数获取宽带促销（过滤权限和地区）
     * @param offerId
     * @param operId
     * @param regionId
     * @return
     * @throws PceException
     * @throws Exception
     * @throws RemoteException
     */
    public IOfferValue[] getBroadbandRelatPromotion(long offerId, long operId, String regionId) throws PceException, Exception, RemoteException;



	/**
	 * 根据策划ID获取策划信息
	* @Function: Product2CrmSVImpl.java
	* @Description: 根据策划ID获取策划信息
	*
	* @param: offerId 策划ID
	* @return：IOfferValue 策划信息
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: linyh
	* @date: 2012-2-10 上午11:44:42
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-2-10     linyh           v1.0.0               修改原因
	 */
	public IOfferValue getOfferValueById(long offerId) throws RemoteException, Exception;

	/**
	 * 获取产品的价格
	* @Function: IProduct2CrmSV.java
	* @Description: 根据策划ID和操作ID获取产品的价格
	*
	* @param:long offerId 策划ID
	* @param： long busiOperId 操作ID
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: linyh
	* @date: 2012-2-10 下午02:56:51
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-2-10     linyh           v1.0.0               修改原因
	 */
	public IOfferRelatPriceValue[] getOfferRelatPriceValueById(long offerId,long busiOperId) throws RemoteException, Exception;

	/**
	 *
	 * @Function: ProductFSVImpl.java
	 * @Description:根据属性编号查询属性信息
	 * @param:参数描述
	 * @return：IAttributeValue
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: xianan
	 * @date: May 5
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * May 5, 2011     xianan           v1.0.0               修改原因
	 */
	public IAttributeValue getAttrbuteById(long attributeId) throws PceException,Exception,RemoteException;
	/**
	* @Function: IProduct2CrmSV.java
	* @Description: 查询vpmn的产品(不包括虚拟网产品)
	*
	* @param offereId 策划编号
	* @param roleId 角色编号
	* @return
	* @throws PceException
	* @throws Exception
	* @throws RemoteException
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: yaojx
	* @date: Mar 7, 2011 9:53:58 PM
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 7, 2011     yaojx           v1.0.0               修改原因
	*/
	public IOfferRelatProductValue[] getVpmnMemProd(long offereId, long roleId)throws PceException,Exception, RemoteException;

	/**
	 * @Function: IProduct2CrmSV.java
	 * @Description: 根据角色编号取角色信息
	 *
	 * @param roldId  角色编号
	 * @return
	 * @throws PceException
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: 刘峰榕<liufr@asiainfo.com>
	 * @date: 2011-3-10 下午10:32:24
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2011-3-10     刘峰榕           v1.0.0               修改原因
	 */
	public IRoleValue getRoleById(long roldId) throws PceException,Exception, RemoteException;

	/**
	 * @Function: IProduct2CrmSV.java
	 * @Description: 根据角色编号取角色信息
	 *
	 * @param roldId  角色编号
	 * @return
	 * @throws PceException
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author:xianan
	 * @date: 2011-3-10 下午10:32:24
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2011-4-7    xianan          v1.0.0               修改原因
	 */
	public IItemValue getProductItemById(long productItemId) throws PceException,Exception,RemoteException;

	/**
	 * @Function: getProductById
	 * @Description: 根据产品ID获取产品信息
	 *
	 * @param productId  产品ID
	 * @return
	 * @throws PceException
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: MAYUMIN <maym2@asiainfo-linkage.com>
	 * @date: 2011-4-27下午11:25:09
	 *
	 * Modification History:
	 * Date							Author				Version				Description
	 *------------------------------------------------------------------------------------*
	 * 2011-4-27下午11:25:09			    MAYUMIN				v1.0.0					new
	 */
	public IProductValue getProductById(long productId) throws PceException,Exception,RemoteException;

	/**
	 * 根据策划编号查询关联的服务价格信息
	 * @param 参数描述
	 * @return Map<long,IOfferRelatProductValue[]>
	 * @throws：异常描述
	 *
	 * @version v1.0.0
	 * @author  zhuzw
	 * @date: Jan 5, 2011 4:05:01 PM
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 5, 2011     zhuzw           v1.0.0               修改原因
	 */
	public IOfferRelatProductValue[] getProductByOfferId(long offerId) throws PceException,Exception,RemoteException;

	/**
	 * 根据产品编号查询SP_SERVICE信息
	 * @param 参数描述
	 * @return ISpServiceValue<SP_SERVICE信息>
	 * @throws：异常描述
	 *
	 * @version v1.0.0
	 * @author  zhuzw
	 * @date: Jan 5, 2011 4:05:01 PM
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 5, 2011     zhuzw           v1.0.0               修改原因
	 */
	public ISpServiceValue findSpServiceByProdId(long prodId) throws RemoteException, Exception;
	/**
	 * 根据SP编号查询SP信息
	 * @param 参数描述
	 * @return ISpInfoValue<SP信息>
	 * @throws：异常描述
	 *
	 * @version v1.0.0
	 * @author  zhuzw
	 * @date: Jan 5, 2011 4:05:01 PM
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 5, 2011     zhuzw           v1.0.0               修改原因
	 */
	public ISpInfoValue findSpInfoBySpCode(String spCode) throws RemoteException, Exception;

	/**
	 * 获取SIM卡卡费
	 *
	 * @author anwx@asiainfo-linkage.com @ 2012-8-22
	 *
	 * @param businessId
	 * @param brandId
	 * @param cardSpecId
	 * @param regionId
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 *
	 */
	public DataContainer getSimCardFee(String billId, long businessId,long brandId,long offerId, long cardSpecId,String regionId, String channelType)throws RemoteException, Exception;

	/**
	* @Description: 获取SIM卡卡费
	* @return
	* @throws RemoteException
	* @throws Exception
	*
	* @version: v1.0.0
	* @author:  MAJUN
	* @date: 2013-1-15 下午03:05:55
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2013-1-15      MAJUN           v1.0.0               修改原因
	 */
	public DataContainer getSimCardFee(String billId, long businessId,long brandId,long offerId, long cardSpecId,String regionId, String channelType, String countryId)throws RemoteException, Exception;


	/**
	* @Function: getBusiPriceValueByPriceId
	* @Description: 根据价格计划ID，查询产品侧价格计划详细信息
	*
	* @param:
	* @return：
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: liuke
	* @date: 2012-9-14 下午02:27:10
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-9-14      liuke           v1.0.0               修改原因
	 */
	public IBusiPriceValue[] getBusiPriceValueByPriceId(long priceId)throws Exception,RemoteException;

	/**
	 * 获取预存款
	 *
	 * @author anwx@asiainfo-linkage.com @ 2012-8-22
	 *
	 * @param businessId
	 * @param brandId
	 * @param cardSpecId
	 * @param regionId
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 *
	 */
	public DataContainer[] getAdvanceFee(String billId, long businessId,long brandId,long offerId,String regionId, String channelType)throws RemoteException, Exception;

	/**
	* @Description: 获取预存款
	*
	* @return
	* @throws RemoteException
	* @throws Exception
	*
	* @version: v1.0.0
	* @author:  MAJUN
	* @date: 2013-1-15 下午03:17:09
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2013-1-15      MAJUN           v1.0.0               修改原因
	 */
	public DataContainer[] getAdvanceFee(String billId, long businessId,long brandId,long offerId,String regionId, String channelType, String countryId)throws RemoteException, Exception;

    public IItemRelatValue[] getItemRelatByRelatItemIdAndRelatKind(long relatItemId,String relatKind)throws Exception,RemoteException;
    /**
     * * 根据code和type获取全网信息
     *
     * @param allNetCode
     * @param allNetType
     * @return
     * @throws PceException
     * @throws Exception
     * @throws RemoteException
     */
    public IUpAllNetConfByCodeAndTypeValue[] getAllNetConfByCodeAndType(String allNetCode, String allNetType) throws PceException, Exception, RemoteException;

    public IAllNetConfValue getAllNetConfByProductItemId(long productItemId) throws Exception, RemoteException;

	public Map getAllNetConfByOfferId(long offerId) throws Exception, RemoteException;

	public Map getAllNetConfAttributesByProductId(long productId) throws Exception, RemoteException;

	public Map getAllNetConfByProductItemIds(long[] productItemIds) throws Exception, RemoteException;
	/**
     * @param busiOperId 操作ID
     * @return IBusiOperValue 操作信息
     * @throws :异常描述
     * @Function : getBusiOperById
     * @Description : 根据操作ID获取操作信息
     * @version : v1.0.0
     * @author : xuecy
     * @Date : Des 26, 2011 9:04:28 PM
     * <p/>
     * Modification History:
     * Date                     Author          Version         Description
     * ---------------------------------------------------------
     * Dec 26, 2011         xuecy           v1.0.0           Create
     */
    public IBusiOperValue getBusiOperById(long busiOperId) throws Exception, RemoteException;
    /**
     * @param serviceId 服务ID
     * @return IServiceRelatAttrValue 服务关联属性信息
     * @throws :异常描述
     * @Function : getAttributeByServiceId
     * @Description : 根据服务ID获取服务下属性的信息
     * @version : v1.0.0
     * @author : xuecy
     * @Date : Des 26, 2011 9:04:28 PM
     * <p/>
     * Modification History:
     * Date                     Author          Version         Description
     * ---------------------------------------------------------
     * Dec 26, 2011         xuecy           v1.0.0           Create
     */
    public IServiceRelatAttrValue[] getAttributeByServiceId(long serviceId) throws Exception, RemoteException;
    /**
     * 根据PLANID和PRICE_TYPE获取全网信息
     *
     * @param planId
     * @param priceType
     * @return
     * @throws Exception
     * @throws RemoteException
     * @throws PceException
     */
    public IAllNetConfValue[] getAllNetConfValueByPlanPrice(long planId, String priceType) throws Exception, RemoteException;
    public IOfferRelatProductValue[] getProductByOfferRoleId(long offereId, long roleId, long[] productIds) throws Exception, RemoteException;
    /**
     * @Function: ProductFSVImpl.java
     * @Description:根据策划编号查询策划信息
     * @param:参数描述
     * @return：IOfferValue
     * @throws：异常描述
     * @version: v1.0.0
     * @author: zhuzw
     * @date: Jan 5, 2011 4:05:01 PM
     * <p/>
     * Modification History: Date Author Version Description
     * ---------------------------------------------------------* Jan 5, 2011
     * xuecy v1.0.0 修改原因
     */
    public IOfferValue getOfferById(long offerId) throws Exception, RemoteException;
    
    public IOfferValue[] getOfferByIds(long offerId[]) throws Exception, RemoteException;
    /**
     * @param prodSpecId 规格ID
     * @return IProductSpecValue 规格信息
     * @throws :异常描述
     * @Function : getProdSpecById
     * @Description : 根据规格ID获取规格信息
     * @version : v1.0.0
     * @author : xuecy
     * @Date : Des 26, 2011 9:04:28 PM
     * <p/>
     * Modification History:
     * Date                     Author          Version         Description
     * ---------------------------------------------------------
     * Dec 26, 2011         xuecy           v1.0.0           Create
     */
    public IProductSpecValue getProdSpecById(long prodSpecId) throws Exception, RemoteException;

    /**
     * 根据策划ID获取扣费提醒信息
     *
     * @param offerId offerId
     * @return IDeductAttrValue 扣费提醒对象
     * @throws PceException
     * @throws Exception
     * @throws RemoteException
     */
    public IDeductAttrValue getDeductAttrByOfferId(long offerId, String busiType) throws Exception, RemoteException;

    /**
     * 根据策划ID和产品ID获取扣费提醒信息
     * @param offerId
     * @param prodId
     * @param busiType
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IDeductAttrValue getDeductAttr(long offerId, long prodId, String busiType) throws Exception, RemoteException;

    /**
     * 获取短信模版
     *
     * @param aOfferId   原策划ID  如果没有请传0
     * @param bOfferId   目的策划Id  如果没有请传0
     * @param aBrandId   原品牌ID   如果没有请传0
     * @param bBrandId   目的品牌ID  如果没有请传0
     * @param businessId 操作ID  如果没有请传0
     * @param productId  产品ID  如果没有请传0
     * @param spCode     sp代码  如果没有请传null
     * @param operCode   sp业务代码  如果没有请传null
     * @param busiType   业务类型  如果没有请传null
     * @param groupId    组ID   如果没有请传0
     * @param regionCode 地区
     * @param channelId  渠道
     * @param paraMap    扩展参数
     * @return
     * @throws PceException
     * @throws RemoteException
     * @throws Exception
     */
    public ISmsTemplateValue[] getSmsTemplate(long aOfferId, long bOfferId, long aBrandId, long bBrandId, long businessId, long productId,
                                              String spCode, String operCode, String busiType, long groupId, String regionCode, String channelId, HashMap paraMap) throws RemoteException, Exception ;

    /**
     * @param itemId ITEM_ID
     * @param relatKind 关系类型
     * @return IItemRelatValue 关系信息
     * @throws :异常描述
     * @Function : getItemRelatByItemIdAndRelatKind
     * @Description : 根据itemId和关系类型获取关系信息
     * @version : v1.0.0
     * @author : anwx
     * @Date : Des 26, 2011 9:04:28 PM
     * <p/>
     * Modification History:
     * Date                     Author          Version         Description
     * ---------------------------------------------------------
     * Dec 26, 2011         anwx           v1.0.0           Create
     */
    public IItemRelatValue[] getItemRelatByItemIdAndRelatKind(long itemId,String relatKind)throws Exception,RemoteException;

    /**
     * 获取用户可换的主策划列表
     * @param oldPlanId
     * @param regionCode
     * @param channelIds
     * @param operId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    IOfferValue[] getOfferPlanChangeOfferPlan(long oldPlanId,String regionCode,String[] channelIds,long operId)throws Exception,RemoteException;
    /**
     * @param offerId          (策划编号)
     * @param busiOperId(操作编号)
     * @param hashMap          (预留参数)
     * @Function: ProductFSVImpl.java
     * @Description:根据策划、操作获取一次性资费
     * @return：IOfferRelatPriceValue[]
     * @throws：异常描述
     * @version: v1.0.0
     * @author: yangxd3
     * <p/>
     */
    public IOfferRelatPriceValue[] getBusiPriceByOfferBusiOperId(long offerId, long busiOperId, Map hashMap) throws Exception, RemoteException;

    /**
    * @Function: queryOfferFollowOffer
    * @Description: 查询活动是否可以顺延
    *
    * @param:offerIdB 先订购的 策划、offerIdA 后订购的策--在订购A的时候判断A是否可以顺延在B后面
    * @return：
    * @throws：异常描述
    *
    * @version: v1.0.0
    * @author: liuke
    * @date: 2012-11-8 下午02:51:27
    *
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * 2012-11-8      liuke           v1.0.0               修改原因
     */
    public boolean queryOfferFollowOffer(long offerIdA ,long offerIdB)throws Exception,RemoteException;
    /**
     * 判断策划A与策划B是否有指定的关系
     *
     * @param offerA
     * @param offerB
     * @param kind
     * @return
     * @throws RemoteException
     * @throws PceException
     * @throws Exception
     */
    public boolean hasRelation(long offerA, long offerB, String kind, String regiondid, long operId) throws RemoteException, Exception;


    /**
	  * 根据地市信息获取关系数据
	  * autor liub
	  * 2011-6-30
	  * @param itemId
	  * @param relateItemId
	  * @param kind
	  * @return
	  * @throws Exception
	  */
	 public IItemRelatValue getItemRelatByItemIdKindRegionId(long itemId,long relateItemId,String kind,String regionId)throws Exception;

	 /**
	 * @Function: 获取全网营销活动
	 * @Description: 该方法的描述
	 *
	 * @param:
	 * @return：
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: liuke
	 * @date: 2012-12-5 下午08:22:58
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2012-12-5      liuke           v1.0.0               修改原因
	  */
    public IUpGroupPromConfValue[] getUpGroupPromConf(String pkgCode, long offerId) throws Exception, RemoteException;

    /**
     * @param offerId
     * @param kindId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public boolean isSpecKind(long offerId,long kindId) throws Exception, RemoteException;
    /**
	 * 获取基本策划
	 * @param prodSpecId 规格id
	 * @param catalogId  目录id 规格id、目录id 至少传其一(Long.MIN_VALUE 表示不传)
	 * @param condition  市场细分
	 *    KEY:(ACCESSTYPE:接入方式,BROADTYPE:宽带类型,DOMAIN:行政区域,COMMUNITY:小区,BROADSPEED:速率,ISTEST:是否测试,CHANNEL:渠道)
	 * @return IOfferValue 策划信息
	 */
	public IOfferValue[] getBaseOffers(long prodSpecId, long catalogId,Map<String, String> condition) throws Exception,RemoteException;
	/**
	 * 获取相容（增值、活动、组合）策划（个人,宽带，集团）
	 * @param offerId   基本套餐Id 必传参数
	 * @param nextOfferId    下周期
	 * @param catalogId      目录id
	 * @param condition      市场细分
	 *    KEY:(ACCESSTYPE:接入方式,BROADTYPE:宽带类型,DOMAIN:行政区域,COMMUNITY:小区,BROADSPEED:速率,ISTEST:是否测试,CHANNEL:渠道)
	 * @return IOfferValue 策划信息
	 */
	public IOfferValue[] getFriendOffers(long offerId, long nextOfferId,long catalongId, Map<String, String> condition)	throws Exception, RemoteException;
    /**
	 * 根据策划，权限，员工，扩展条件 校验权限.
	 * @param offerId 策划标识
	 * @param privId 权限标识
	 * @param staffId 员工标识
	 * @param param Map参数
	 * @return boolean 是否有权限
	 */
    public boolean checkAuthority(long offerId,long privId,long staffId,Map param)throws PceException ,Exception, RemoteException;
    /**
     * 根据策划ID,行政区ID和小区ID 查询宽带套餐日租费
     * @param offerId
     * @param domainId
     * @param communityName
     * @return
     * @throws PceException
     * @throws Exception
     * @throws RemoteException
     * @version: v1.0.0
     * @author: zhangyong12
     * @date:  2012-10-18
     */
    public ICommunityInfoValue getCommunityInfo(long offerId,long domainId,String communityName) throws PceException ,Exception, RemoteException;
    public IOfferIncludeOfferValue[] getOfferRelatOffer(long offerId, long roleId) throws PceException, Exception, RemoteException;

    /**
     * xuecy
     * 根据终端code获取销售品信息
     * @param materialCode
     * @param regionId
     * @return
     * @throws PceException
     * @throws Exception
     * @throws RemoteException
     */
    public IOfferValue[] getOfferByMaterialCode(String materialCode,String regionId) throws PceException ,Exception, RemoteException;
    /**
	 * 获取基本策划(NEW)
	 * @param prodSpecId 规格id
	 * @param catalogId  目录id 规格id、目录id 至少传其一(Long.MIN_VALUE 表示不传)
	 * @param condition  市场细分
	 *    KEY:(ACCESSTYPE:接入方式,BROADTYPE:宽带类型,DOMAIN:行政区域,COMMUNITY:小区,BROADSPEED:速率,ISTEST:是否测试,CHANNEL:渠道)
	 * @param ProdCoInfo  技术产品列表
	 * @return IOfferValue 策划信息
	 */
	public IOfferValue[] getBaseOffersNew(long prodSpecId, long catalogId,Map<String, String> condition,ProdCoInfo colInfo[]) throws Exception,RemoteException;
	public IPriceValue[] getPriceValue(long pricePlanId) throws Exception,RemoteException;
    /**
     * @param productItemId 单元ID
     * @param featureId     特征ID
     * @return UpItemFeature[] 单元特征信息
     * @throws :异常描述
     * @Function : getItemFeaturesByProdAndFeatureId
     * @Description : 根据单元ID，特征属性ID获取单元属性信息
     * @version : v1.0.0
     * @author : lufm
     */
	public IUpItemFeatureValue[] getItemFeaturesByProdAndFeatureId(long productItemId,
            long featureId) throws Exception, RemoteException;
 
	/** 
	* @Function: getOfferByService 
	* @Description: 根据服务属性查询offer
	* @param
	* @return IUpItemFeatureValue[]
	* @throws 异常描述
	* @author lufm3
	* @date Dec 9, 2014 4:02:46 PM 
	*/ 
	public IOfferValue[] getOfferByServiceAttrId(long servAttrId) throws Exception, RemoteException;
}
