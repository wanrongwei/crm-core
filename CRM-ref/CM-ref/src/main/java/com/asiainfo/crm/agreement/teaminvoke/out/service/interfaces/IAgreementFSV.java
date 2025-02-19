package com.asiainfo.crm.agreement.teaminvoke.out.service.interfaces;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.omframe.order.data.ivalues.ISoOrderData;
import com.asiainfo.crm.agreement.agreement.ivalues.IBOAgrAgreementHValue;
import com.asiainfo.crm.agreement.agreement.ivalues.IBOAgrAgreementValue;
import com.asiainfo.crm.agreement.agreement.ivalues.IBOAgrCatalogNegotiateHValue;
import com.asiainfo.crm.agreement.agreement.ivalues.IBOAgrOfferRlaHValue;
import com.asiainfo.crm.agreement.monitor.calculate.ivalues.IBOAgrUsrProductRelaValue;
import com.asiainfo.crm.agreement.teaminvoke.out.service.bean.SerisPOABean;
import com.asiainfo.crm.agreement.teaminvoke.out.service.bean.TCBOBean;
import com.asiainfo.crm.agreement.template.agrtemplate.ivalues.IQBOAgrTempVerHisValue;
import com.asiainfo.crm.agreement.template.termtemplate.ivalues.IBOAgrTermTemplateValue;
import com.asiainfo.crm.so.teaminvoke.in.ivalue.Crm2ContractDC;

public interface IAgreementFSV {
	
	
	/**
	 * 为Order提供的创建合同接口，该接口解析订单数据并转换为合同需要的格式，最终生成合同的接本信息和表单信息
	 * @param contractDCICrm2ContractDC	Crm传Contract的结构体，此结构体包含CustInfo,,AcctInfo,soOrderData, ISoOrderData,isPOA, POAMap, extendMap
	 * @deprecated
	 * @return
	 * @throws Exception
	 */
	//public IBOAgrAgreementValue generateB2cAgreement(ICrm2ContractDC contractDC)throws Exception;
	
	/**
	 * 根据businessId查询最新版本的模板
	 * 
	 *@Function:queryLatesterVersionTemplate
	 *@Description:
	 *
	 *@param businessId
	 *@return
	 *@throws Exception 
	 *
	 *@version: v1.0.0
	 *@author: duysheng
	 *@date: 2015-8-27 下午10:13:43
	 *
	 */
	public IQBOAgrTempVerHisValue[] queryLatesterVersionTemplate(String businessId) throws Exception;
	
	/**
	 * 解析agreementParam的基本信息，生成合同基本信息, 为Billing提供分期合同创建接口，为OSE提供购物车等合同接口
	 * 据businessid找到对应的协议模板，将agreementParams与模板生成合同文本信息，文件信息
	 * 最终将合同的基本信息返回
	 * @param businessId
	 * @param custId
	 * @param custOrderId
	 * @param agrSource  to tell request is from billing or ose
	 * @param agreementParam
	 * @return
	 * @throws Exception
	 */
	public IBOAgrAgreementValue generateB2cAgreement(String businessId, long custId, String custOrderId, String agrSource, DataContainer agreementParam)throws Exception;
	
	/**
	 * OLD interface, pls use generateB2cAgreement(String businessId, long custId, String custOrderId, String agrSource, DataContainer agreementParam) instead
	 * @param businessId
	 * @param custId
	 * @param custOrderId
	 * @param agreementParam
	 * @return
	 * @throws Exception
	 */
	public IBOAgrAgreementValue generateB2cAgreement(String businessId, long custId, String custOrderId, DataContainer agreementParam)throws Exception;
	
	/**
	 * 为Order提供的创建合同新接口，该接口解析订单数据并转换为合同需要的格式，最终生成合同的接本信息和表单信息
	 * @param contractDCICrm2ContractDC	Crm传Contract的结构体，此结构体包含CustInfo,,AcctInfo,soOrderData, ISoOrderData,isPOA, POAMap, extendMap
	 * @return
	 * @throws Exception
	 */
	public IBOAgrAgreementValue generateB2CAgreement(Crm2ContractDC contractDC)throws Exception;
	
	/**
	 * 给订单提供创建POA的接口;
	 * @param businessId business id 
	 * @param custId cust id
	 * @param custOrderId order id
	 * @param param key-value map 生成poax合同用到的参数
	 * @param upLive	是否上传livelink
	 * @return
	 * @throws Exception
	 */
	public IBOAgrAgreementValue generatePoaAgreement(String businessId, long custId, String custOrderId, Map<String, String> param, boolean upLive)throws Exception;
	
	/**
	 * 给订单提供创建Switch合同的接口 add by tanyan 2018/5/10
	 * @param businessId
	 * @param custId
	 * @param custOrderId
	 * @param param
	 * @param upLive
	 * @return
	 * @throws Exception
	 */
	public IBOAgrAgreementValue generateSwitchAgreement(String businessId, long custId, String custOrderId, Map<String, String> param, boolean upLive) throws Exception;
	
	/**
	 * 给订单提供创建Insurance的接口;
	 * @param businessId business id 
	 * @param custId cust id
	 * @param custOrderId order id
	 * @param param key-value map insurance合同用到的参数
	 * @param upLive	是否上传livelink
	 * @return
	 * @throws Exception
	 */
	public IBOAgrAgreementValue generateInsuranceAgreement(String businessId, long custId, String custOrderId, List<Map<String, String>> insuranceParams, boolean upLive) throws Exception;
	
	/**
	 * 
	 * 批量传入订购产品信息和合同业务信息，在合同侧生成一组合同，Map中的每一组数据代表一个产品信息
	 * @Function: batchGenerateB2cAgreement
	 * @Description: 
	 *
	 * @param b2cAgreementMapList
	 * 	  	businessId			业务行为编号 如订购，退订
	 * 		productLineId		产品线Id
	 * 		agrSource			合同创建来源，枚举值如下
	 * 							AGR_SOURCE_ORDER = "20";
	 * 							AGR_SOURCE_PARTNER = "50";
	 * 							AGR_SOURCE_ESHOP = "60";
	 * 		sourceObjId			来源对象ID，传入对应的orderId
	 * 		basicParamMap		用来创建合同记录的元数据，目前传入一个合同名称
	 * 							AGREEMENT_NAME
	 * 							CUST_ID
	 * 		agreementParam		Map，合同中需要填写的参数，会根据传入的参数Key值对应到合同模板上 
	 * 
	 * @return 					创建的合同对象数组
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: shaowei
	 * @date: 2014-11-5  下午09:17:57
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2014-11-5      shaowei           v1.0.0               修改原因
	 */
	public IBOAgrAgreementValue[] batchGenerateB2cAgreement(List<Map> b2cAgreementMapList) throws Exception;
	
	/**
	 *
	 * 根据业务行为编号，业务来源流水查询合同并按照合并模式合并返回合同字节流
	 * @Function: getCombinedAgreement
	 * @Description: 
	 *
	 * @param businessId	业务行为编号 如订购，退订
	 * @param agrSource		合同创建来源，枚举值如下
	 * 							AGR_SOURCE_ORDER = "20";
	 * 							AGR_SOURCE_PARTNER = "50";
	 * 							AGR_SOURCE_ESHOP = "60";
	 * @param sourceObjId		来源对象ID，传入对应的orderId
	 * @param customerId		客户id
	 * @param combineMobde
	 * 			1	按照业务行为合并
	 * 			2	按照产品合并
	 * 			3	按照业务行为以及产品合并
	 * 			9	全部合并
	 * @return Map<String, byte[]> 多个合同pdf的字节流,key为业务行为和产品线的拼接，用,分割。如(退订编码,productLineId)
	 * @throws Exception
	 * 
	 * @version: v1.0.0
	 * @author: shaowei
	 * @date: 2014-11-5  下午09:27:07
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2014-11-5      shaowei           v1.0.0               修改原因
	 * 
	 * @deprecated
	 */
	@Deprecated
	public Map<String, byte[]> getCombinedAgreement(String agrSource,String sourceObjId,String customerId,int combineMobde)throws Exception;
	
	
	/**
	 * 为OSE提供查询合同的接口
	 * @param customerId
	 * @param agrSource
	 * @param sourceObjIdList ose提供子订单号列表
	 * @return
	 * @throws Exception
	 */
	public byte[][] getAgreementPdfByte4OSE(String customerId, String agrSource,List<String> sourceObjIdList) throws Exception ;
	
	/**
	 * 根据businessid找到对应的协议模板，编辑agreementParams，根据模板生成对应的合同，并将所有的合同最终合并一个大合同。将合同信息以字节流的形式返回
	 * 整个过程不保存生成的合同信息
	 * @deprecated
	 * @param businessId
	 * @param agreementParams
	 * @return
	 * @throws Exception
	 */
	@Deprecated
	public byte[] previewEshopAgreement(String businessId,DataContainer[] agreementParams)throws Exception;
	
	/**
	 * 获取集团客户的最顶层协议信息，返回结果DataContainer，key-value形式
	 * @param custId
	 * @param startDate	开始时间
	 * @param endDate	结束时间
	 * @return
	 * @throws Exception
	 */
	public DataContainer getB2BAgreementInfoForOSByCond(long custId, Timestamp startDate, Timestamp endDate)throws Exception;
	
	/**
	 * 查询客户下的所有符合条件的合同信息
	 * @param custId
	 * @param agrName
	 * @param agrCode
	 * @param agrStatus
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public DataContainer[] getB2BAgreementListForOSByCond(long custId, String agrName, String agrCode, long agrStatus, Timestamp startDate, Timestamp endDate) throws Exception;
	
	/**
	 * 
	 * @param agrid：合同编号
	 * @param agrDate:合同创建时间，格式yyyy-mm-dd
	 * @param itemType：文本信息类型：1 Contract Basic Information ;11 Beneficial Item ;13 CTN ;15 Agent 代办人 ;3 Offer Item ;5 Commitment Item ;7 Allowance Item ;9 Owner Item 
	 * @return 返回合同中的表单信息,同类表单数据返回到同一个DataContainer实例中,如果有多个同类的表单数据,则返回多条DataContainer实例
	 * @throws Exception
	 */
	public DataContainer[] qryAgreementItemByItemType(long agrid, String agrDate, String itemType,String ownerId) throws Exception;
	
	
	/**
	 * 支付成功后更新订购合同状态，如果支付成功则合同状态不变，支付失败合同状态变更为终止
	 * @param custId
	 * @param custOrderId 订单编号
	 * @param paymentStatus {@link CmxInterConstants.PAYMENT_STATUS}
	 * @throws Exception
	 */
	public void updateAgreementPaymentStatus(long custId,long custOrderId,String agrSource,String paymentStatus) throws Exception;
	
	/**
	 * 
	 * @param custId	客户编号
	 * @param custOrderId	系统流水号
	 * @param agrSourceType	源类型
	 * @return	pdf文档的Base64编码
	 * @throws Exception
	 * 根据客户编号和流水号在合同基本信息中查询出barcode，然后调用livelink接口通过barcode获取其对应的合同pdf，将pdf文档以Base64编码返回
	 */
	public String getBase64OfLivelinkDoc(long custId,long custOrderId,String agrSourceType) throws Exception;
	
	/**
	 * 根据合同code查询合同信息
	 * @param agrCode
	 * @return
	 * @throws Exception
	 */
	public IBOAgrAgreementValue getAgreementValueByAgrCode(String agrCode) throws Exception;
	
	/**
	 * 增加合同用户关系，合同编号，客户编号，用户编号，产品编号必填
	 * @param val
	 * @throws Exception
	 */
	public void createAgrUsrProdRela(IBOAgrUsrProductRelaValue val) throws Exception;
	
	
	/**
	 * 删除合同、用户、产品关系。必填合同，用户，产品
	 * @param val
	 * @throws Exception
	 */
	public void delAgrUsrProdRela(IBOAgrUsrProductRelaValue val) throws Exception;
	
	/**
	 * 企业折扣查询接口
	 * @author luanpeng
	 * @param agreementId
	 * @param agrDate
	 * @return
	 * @deprecated
	 * @throws Exception
	 */
	public DataContainer[] getOfferDiscountByAgrId(long agreementId, String agrDate,String ownerId) throws Exception;
	
	
	/**
	 * 企业折扣查询接口
	 * @param agrCode
	 * @deprecated
	 * @return
	 * @throws Exception
	 */
	public DataContainer[] getAgreementOfferDiscount(String agrCode) throws Exception;
	
	
	/**
	 * 根据客户，角色查询产品信息
	 * @param custId
	 * @param roleId
	 * @return: key:product_id;key:product_name
	 * @throws Exception
	 */
	public DataContainerInterface getVPNProdListByCustId(long custId,long roleId) throws Exception;
	
	/**
	 * 根据客户查询代付规则列表
	 * @param custId
	 * @return: key:pattern_id;key:pattern_name
	 * @throws Exception
	 */
	public DataContainerInterface[] getPayMentRuleListByCustId(long custId) throws Exception;
	
	/**
	 * 
	 *@Function:callSubscriptionInstStatus
	 *@Description: 根据合同推送的订购实例，回调合同通知修改订购实例状态
	 *
	 *@param custId
	 *@param agrSource
	 *@param agrId
	 *@param subscriptionId
	 *@return
	 *@throws Exception 
	 *
	 *@version: v1.0.0
	 *@author: duysheng
	 *@date: 2014-12-9 下午12:48:55
	 *
	 */
	public boolean callSubscriptionInstStatus(long subscriptionId) throws Exception;
	
	/**
	 * 根据客户编号与offer查询合同信息
	 * @param custId
	 * @param offerId
	 * @return
	 * @throws Exception
	 */
	public IBOAgrAgreementValue getAgreementByOffer(long custId,long offerId) throws Exception;
	
	/**
	 * 查询合同中offer对应的议价参数,如果agreementCode不为空则直接根据agreementCode查询合同，否则根据custid与offer查询合同信息，根据合同查询业务标签项信息并解析议价参数
	 * 返回key:offerid_prodid_attrId,value:attrvalue
	 * @param custId
	 * @param agreementCode
	 * @param offerId
	 * @return
	 * @throws Exception
	 */
	//public Map<String, String> getOfferBargainParams(long custId,String agreementCode,long offerId) throws Exception;
	
	/**
	 * 查询合同中offer对应的议价参数,如果agreementCode不为空则直接根据agreementCode查询合同，否则根据custid与offer查询合同信息，根据合同查询业务标签项信息并解析议价参数
	 * @param custId
	 * @param agreementCode
	 * @param offerId
	 * @return
	 * @throws Exception
	 */
	//public Map<String, String> getOTCOfferBargainParams(long custId,String agreementCode,long offerId) throws Exception;
	
	/**
	 * 更新合同签名图片，该合同对应的模板中必须有签名业务标签，否则可能会导致更新失败
	 * 给OSE提供
	 * @param custId
	 * @param agrSource
	 * @param custOrderId	父custorderid，一个custorderid下会有多个合同，且会有一个订购合同
	 * @param signBase64	签名图片的base64编码串
	 * @throws Exception
	 */
	public void updateAgreementSignPicture(long custId,String agrSource,long custOrderId,String signBase64,String signFlag) throws Exception;

	/**
	 * OSE签字接口
	 * @param custId
	 * @param agrSource
	 * @param custOrderId	子订单号列表
	 * @param signBase64	签名图片列表
	 * @param signFlag	SIGN = "SIGN";CANCEL_SIGN = "CANCEL_SIGN"
	 * @throws Exception
	 */
	public void signAgreement4OSE(long custId,String agrSource,List<Long> custOrderId,List<String> signBase64,String signFlag) throws Exception;

	/**
	 * 获取合同pdf的字节流
	 * @param agreementId
	 * @param custId
	 * @param agrSource
	 * @return
	 * @throws Exception
	 */
	public byte[] getAgreementPdfByteArray(long agreementId,long custId,String agrSource) throws Exception;
	
	/**
	 * 查询客户签署框架协议中的信用度评分
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	public int getAgrCreditCore(long custId) throws Exception;
	
	/**
	 * 根据客户编号查询合同
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	public DataContainer[] getAgreementValueByCust(long custId) throws Exception;
	
	public int getAgreementValueByCustCount(long custId) throws Exception;
	
	/**
	 * 根据custId, agreementId获取对应的合同对象(根据合同号查询当前合同信息，返回合同level为100164表示taxfree)
	 * 需要把custId对应的cvr no相同的所有客户的合同都查出来
	 *@Function:getAgreement
	 *@Description:
	 *
	 *@param custId
	 *@param agreementId
	 *@return
	 *@throws Exception 
	 *
	 *@version: v1.0.0
	 *@author: duysheng
	 *@date: 2015-8-26 下午9:18:41
	 *
	 */
	public IBOAgrAgreementHValue getAgreementValueByCust(long custId,long agreementId) throws Exception;
	
	public IBOAgrAgreementHValue getAgreementValueByCustForSubAgreement(long custId, long agreementId) throws Exception;
	/**
	 * 根据策划编号，合同编号查询议价参数。只查询合同级的当前生效的议价参数，如果没有合同级的议价参数，就返回空。
	 * @param custId
	 * @param agreementId
	 * @param offerId
	 * @return
	 * @throws Exception
	 */
	public IBOAgrOfferRlaHValue[] getOfferBargainParams(long custId,long agreementId,long offerId) throws Exception;
	
	/**
	 * 只查询合同级的当前生效的RC议价参数，如果没有合同级的议价参数，就返回空。
	 * @param custId
	 * @param agreementId
	 * @param offerId
	 * @return
	 * @throws Exception
	 */
	public IBOAgrOfferRlaHValue[] getRCOfferBargainParams(long custId,long agreementId,long offerId) throws Exception;
	
	/**
	 * 只查询合同级的最新的一条RC议价参数（有可能是未来生效的那条），如果没有合同级的议价参数，就返回空。
	 * @param custId
	 * @param agreementId
	 * @param offerId
	 * @return
	 * @throws Exception
	 */
	public IBOAgrOfferRlaHValue[] getRCOfferBargainParamsLast(long custId,long agreementId,long offerId) throws Exception;
	
	/**
	 *  只查询合同级的当前生效的OTC议价参数，如果没有合同级的议价参数，就返回空。
	 * @param custId
	 * @param agreementId
	 * @param offerId
	 * @return
	 * @throws Exception
	 */
	public IBOAgrOfferRlaHValue[] getOTCOfferBargainParams(long custId,long agreementId,long offerId) throws Exception;
	
	public IBOAgrOfferRlaHValue[] getUCOfferBargainParams(long custId,long agreementId,long offerId) throws Exception;
	
	/**
	 * 根据议价类型，只查询合同级的当前生效的议价参数，如果没有合同级的议价参数，就返回空。
	 * @param custId
	 * @param agreementId
	 * @param type
	 * @return
	 * @throws Exception
	 * @throws AIException
	 */
	public IBOAgrOfferRlaHValue[] getOfferBargainParamsByType(long custId, long agreementId,String type) throws Exception, AIException;
	
	/**
	 * 不知道ownerId的情况下，只查询合同级的当前生效的RC议价参数，如果没有合同级的议价参数，就返回空。
	 * @param agreementId
	 * @param offerId
	 * @return
	 * @throws Exception
	 */
	public IBOAgrOfferRlaHValue[] getRCOfferBargainParamsNew(long agreementId,long offerId) throws Exception;
	
	/**
	 * 不知道ownerId的情况下，只查询合同级的当前生效的OTC议价参数，如果没有合同级的议价参数，就返回空。
	 * @param agreementId
	 * @param offerId
	 * @return
	 * @throws Exception
	 */
	public IBOAgrOfferRlaHValue[] getOTCOfferBargainParamsNew(long agreementId,long offerId) throws Exception;

	/**
	 * 不知道ownerId的情况下，只查询合同级的当前生效的议价参数，如果没有合同级的议价参数，就返回空。
	 * @param agreementId
	 * @param offerId
	 * @param type
	 * @return
	 * @throws Exception
	 */
	public IBOAgrOfferRlaHValue[] getOfferBargainParamsNew(long agreementId, long offerId, String type) throws Exception ;

	/**
	 * 根据合同查询offer列表,排除不可订购offer列表,返回key:AGREEMENT_ID,AGREEMENT_CODE,OFFER_ID,OFFER_NAME,TERM_ID,TERM_TITLE
	 * 查询到当前合同的offer列表，如果其父合同Id不空，还要获取其父合同的offer列表，一同返回
	 * 
	 * @param custId custId可能是层级结构中的一员，可能并非直接的owner或受益人
	 * @param agreementId
	 * @return
	 * @throws Exception
	 */
	public DataContainer[] getAgreementOfferList(long custId,long agreementId) throws Exception;
	
	public HashMap<Long,DataContainer> getAgreementOfferListToMap(long custId, long agreementId) throws Exception;
	
	/**
	 * 根据合同查询offer列表,返回key:AGREEMENT_ID,AGREEMENT_CODE,OFFER_ID,OFFER_NAME,TERM_ID,TERM_TITLE
	 * 查询到当前合同的offer列表，如果其父合同Id不空，还要获取其父合同的offer列表，一同返回
	 * 
	 *@Function:getAgreementSubscribableOfferList
	 *@Description:
	 *
	 *@param custId
	 *@param agreementId
	 *@return
	 *@throws Exception 
	 *
	 *@version: v1.0.0
	 *@author: duysheng
	 *@date: 2015-8-26 下午9:46:58
	 *
	 */
	public DataContainer[] getAgreementSubscribableOfferList(long custId,long agreementId) throws Exception;
	
	/**
	 * 根据合同查询不可订购offer列表,返回key:AGREEMENT_ID,AGREEMENT_CODE,OFFER_ID,OFFER_NAME,TERM_ID,TERM_TITLE
	 * 查询到当前合同的不可订购offer列表，如果其父合同Id不空，还要获取其父合同的不可订购offer列表，一同返回
	 * 
	 *@Function:getAgreementUnsubscribeOfferList
	 *@Description:
	 *
	 *@param custId custId可能是层级结构中的一员，可能并非直接的owner或受益人
	 *@param agreementId
	 *@return
	 *@throws Exception 
	 *
	 *@version: v1.0.0
	 *@author: duysheng
	 *@date: 2015-8-26 下午9:38:18
	 *
	 */
	public IBOAgrOfferRlaHValue[] getAgreementUnsubscribeOfferList(long custId,long agreementId) throws Exception;
	
	/**
	 * 根据集团客户ID获取可用的Agreement Level
	 * 同一个客户同一Level只允许存在一个Agreement
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	public DataContainer[] getCoporatorAvailLevelByCust(String custId)throws Exception;
	
	/**
	 * 根据客户查询offer列表,返回key:AGREEMENT_ID,AGREEMENT_CODE,OFFER_ID,OFFER_NAME,TERM_ID,TERM_TITLE
	 * @param custId
	 * @param offerId
	 * @return
	 * @throws Exception
	 */
	public DataContainer[] getAgreementOfferListByCustIdAndOfferId(long custId,long offerId) throws Exception;
	
	public DataContainer[] getAgreementOfferList(long custId) throws Exception;
	
	public DataContainer getB2BAgreementForOSE(long custId, String agrName, String agrCode, long agrStatus, Timestamp startDate, Timestamp endDate) throws Exception;

	/**
	 * 构造合同基本信息的标签数据
	 * 根据客户类型，封装相关的公共业务标签默认值。一部分业务标签默认值配置在para_detail表中，一部分是合同信息
	 * 
	 *@generateBasicInfo
	 *@Description:
	 *
	 *@param custId
	 *@param agrValue
	 *@param relAgreementNo 分期合同号码
	 *@param telecomCustType 当前运营商信息
	 *@return DataContainer
	 *@throws Exception 
	 *
	 *@version: v1.0.0
	 *@author: zhangfh
	 *@date: 2015-8-28 下午10:32:59
	 *
	 */
	public DataContainer populateAgreementBasicInfo(long custId, IBOAgrAgreementValue agrValue, String relAgreementNo, String telecomCustType) throws Exception;
	
	/**
	 * 根据合同编号查询账期
	 * 输入参数：合同ID，合同编号，客户ID，输出：合同类型level、账期类型。（合同ID，合同编号两个入参必须有一个传值）
	 * KEY:
	 * AGR_LEVEL_ID
	 * BILL_CYCLE (1: Monthly, 2: Quarterly, 3: PA quarterly)
	 * @param agreementId
	 * @param agreementCode
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	public DataContainer queryAgreementBillCycle(long agreementId,String agreementCode,long custId) throws Exception;
	
	/**
	 * 提供给客管在创建合同账户的时候调用，获取当前合同的账期
	 * @param agreementId
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	public DataContainer queryCurrentAgreementBillCycle(long agreementId,String agreementCode,long custId) throws Exception;
	
	/** 
	* @Title: queryHandsetDiscountList 
	* @Description: 获取Handset DiscountOffer（企业之口）接口
	* @param agreementId
	* @param agrDate
	* @param ownerId
	* @return
	* @throws Exception
	*
	* @version V1.0 
	* @author duys3   
	* @date 2015-9-13 下午2:50:58 
	*/
	public DataContainer[] queryHandsetDiscountList(long custId ,long agreementId) throws Exception;
	
	
	/** 
	* @Title: queryCustAllowanceReducible 
	* @Description: 提供给order 当前客户下的可用的津贴余额
	* @param custId
	* @return
	* @throws Exception
	*
	* @version V1.0 
	* @author duys3   
	* @date 2015-9-14 下午7:34:50 
	*/
	public DataContainer queryCustAllowanceReducible(long custId) throws Exception;
	
	/**
	 * For order side to invoke to get special T&C
	 * @param customerType
	 * @param offerId
	 * @return
	 * @throws Exception
	 */
	public IBOAgrTermTemplateValue[] querySpecialTermsAndConditionsList(int customerType, long offerId) throws Exception;
	
	/**
	 * For order side to invoke to get General T&C
	 * @param customerType
	 * @return
	 * @throws Exception
	 */
	public IBOAgrTermTemplateValue[] queryGeneralTermsAndConditionsList(int customerType) throws Exception;
	
	/**
	 * Return special TC for order's usage
	 * @param customerType 0:全部 1：个人, 2:集团
	 * @param offerId
	 * @return
	 * @throws Exception
	 */
	public TCBOBean getSpecialTCForOrder(int customerType, long offerId) throws Exception;
	
	/**
	 * 为OSE提供查询合同的接口
	 * @param customerId
	 * @param agrSource
	 * @param sourceObjIdList ose提供子订单号列表
	 * @return
	 * @throws Exception
	 */
	public IBOAgrAgreementValue[] getAgreements4OSE(String customerId, String agrSource,List<String> sourceObjIdList) throws Exception;

	/**
	 * For order usage: 根据客户id和手机号码作为入参,合同侧返回号码信息给订单
	 * @param custId
	 * @param phoneNum phone number
	 * @param isLeadingNum
	 * @return
	 * @throws Exception
	 */
	public SerisPOABean[] getSerisPOAInfo(long custId, String phoneNum, boolean isLeadingNum) throws Exception; 
	
	/**
	 * 根据phone number判断这个号码是否在Seris POA合同中 add by tanyan 20170221
	 * @param custId
	 * @param phoneNum
	 * @return
	 * @throws Exception
	 */
	public boolean hasSerisPOAByPhoneNum(long custId, String phoneNum) throws Exception;
	
	/**
	 * For order usage: 根据客户id和手机号码作为入参,合同侧返回整个seris poa pdf给订单
	 * @param custId
	 * @param phoneNum
	 * @return
	 * @throws Exception
	 */
	public byte[] getSerisPOAAgreementPDF(long custId, String phoneNum) throws Exception;

	/**
	 * For order's usage: 查询目录优惠信息，会遍历当前目录以及父目录，知道找到优惠信息为止
	 * @param custId
	 * @param agreementId
	 * @param catalogId
	 * @return
	 * @throws Exception
	 */
	public IBOAgrCatalogNegotiateHValue getCatalogNegotiateInfo(long custId, long agreementId, long catalogId) throws Exception;

	/**
	 * Return TCs for OSE's usage[including GTC/Price and Terms/STC]
	 * @param agreementId 合同id
	 * @param custId 客户id
	 * @param customerType 0:全部 1：个人, 2:集团
	 * @param offerIdList offerid list
	 * @return
	 * @throws Exception
	 */
	public List<TCBOBean> getTCsForOSE(long agreementId, long custId, int customerType, List<Long> offerIdList) throws Exception;
	
	/**
	 * Return TCs for OSE's usage[including GTC/Price and Terms/STC]
	 * For CR30 add by tanyan 20171211
	 * @param agreementId
	 * @param custId
	 * @param customerType
	 * @param offerIdList
	 * @return
	 * @throws Exception
	 */
	public List<TCBOBean> getTCsExcludeContentForOSE(long agreementId, long custId, int customerType, List<Long> offerIdList) throws Exception;
	
	/**
	 * get TermContent by ftpPath
	 * For CR30 add by tanyan 20171211
	 * @param ftpPath:AGR_ATTACH:AGR_ATTACH/ftpFileName|aFileName
	 * @return
	 * @throws Exception
	 */
	public byte[] getTermContentByFtpPathForOSE(String ftpPath) throws Exception;
	
	/**
	 * Return Term list and Term PDF 2016.6.2 tanyan
	 * @param agreementId 合同id
	 * @param custId 客户id
	 * @return
	 * @throws Exception
	 */
	public List<TCBOBean> getProdTermByAgreementIdForOSE(long agreementId, long custId) throws Exception;

	
	/**定单获取T&C接口 frame\paframe 只返回gtc 否则返回stc+gtc
	 * @param agreementId
	 * @param custId
	 * @param customerType
	 * @param offerIdList
	 * @return
	 * @throws Exception
	 */
	public List<TCBOBean> getTCsForOrder(long agreementId, long custId, int customerType, List<Long> offerIdList) throws Exception;
	
	/**
	 * For OSE's usage: 根据客户id和合同id返回客户和津贴账户
	 * @param custId
	 * @param agreement
	 * @return
	 * @throws Exception
	 */
	public DataContainer queryCustAllowanceForOSE(long custId, long agreement) throws Exception;
	
	/**
	 * check if userid in agr_offer_inst
	 * @param custId
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public boolean isExistsAgreement(long custId, long userId) throws Exception;
	/**
	 * 根据客户id和订单号，查询订购合同，从livelink读取并返回字节流
	 * Mention: only for 订购合同
	 * @param custId
	 * @param custOrderId
	 * @return
	 * @throws Exception
	 */
	public byte[] getContractPDFBytes(long custId, long custOrderId) throws Exception;
	/**
	 * 根据客户号和订单号查询POA合同，最多返回一条
	 * Mention: only for POA合同
	 * @param custId
	 * @param custOrderId
	 * @return
	 * @throws Exception
	 */
	public IBOAgrAgreementValue getAgreementForPOAContract(long custId, long custOrderId) throws Exception;
	/**
	 * 根据客户号和订单号查询订购合同，最多返回一条
	 * Mention: only for 订购合同
	 * @param custId
	 * @param custOrderId
	 * @return
	 * @throws Exception
	 */
	public IBOAgrAgreementValue getAgreementForSubscriptionContract(long custId, long custOrderId) throws Exception;
	
	/**
	 * 根据合同id 获取父合同ownerId
	 * 
	 * @param agreementId
	 * @param agrLevelId
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	public long getAgreementOwnerForSpecialOffer(long agreementId) throws Exception;

	/**
	 * 根据定单ID删除所有合同、合同关联数据以及livelink
	 * 
	 * @author pengran
	 * @param custOrderId
	 * @throws Exception
	 */
	public void deleteAgreementForCancelOrder(String custOrderId,String custId) throws Exception;
	
	
	/**
	 * 根据custId,获得客户下的所有Seris POA合同  add by tanyan 20160701
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	public DataContainer[] getSerisPOAAgreementByCustId(long custId) throws Exception;
	
	/**
	 * 根据Seris POA合同号，返回Seris POA上的号码信息 add by tanyan 20160701
	 * 如果是号段，则返回号段信息
	 * 如果是离散号码，则返回号码列表
	 * @param custId
	 * @param agreementId
	 * @return
	 * @throws Exception
	 */
	public SerisPOABean[] getSerisPOANumberInfo(long custId, long agreementId) throws Exception;
	
	/**
	 * 更新订单合同文本中的字段值
	 * @param custId
	 * @param customerOrderId
	 * @param values 要更新的标签。同一个字段在不同的合同里面会有不同的标签名称，所以这个字段和标签
	 * 的对应关系要配置在表里
	 * @return
	 * @throws Exception
	 */
	public void updateB2CAgreementXdata(long custId, long customerOrderId, Map<String,String> values)throws Exception;
	/**
	 *@author wangsl
	 *@param custId
	 *@parama agreementId
	 *@返回客户合同对应的账户信息，去掉原来的接口queryCustAllowanceReducible(long custId);
	 *@return
	 *@exception 
	 */
	public DataContainer queryAgreementAllowanceConsumable(long custId,
			long agreementId) throws Exception;
	/**
	 * 根据客户编号与offer查询合同信息(反查custid订购offerId是否要进合同)
	 * @param custId
	 * @param offerId
	 * @return
	 * @throws Exception
	 */
	public IBOAgrAgreementValue getAgreementByOfferNew(long custId,long offerId) throws Exception;

	public SerisPOABean[] getSerialPOA(long custid,long number ,long agrId,String agrNum) throws Exception;
	
	public void deleteAgrInfoByBillId(String billId) throws Exception;
	/**
	 * 获取notice period CR128
	 * @param offerId
	 * @param custId
	 * @param agreementId
	 * @return Map<String, String>,days:天数；type:in或者out
	 * @throws Exception
	 */
	public Map<String, String> getSubscriptionNoticePeriod(long offerId,long custId,long agreementId) throws Exception;
	/**
	 * 根据agrBarcode到livelink获取合同pdf内容
	 * @param agrBarcode
	 * @return
	 * @throws Exception
	 */
	public byte[] getAgreementPdfByteFromLivelink(String agrBarcode) throws Exception;
	/**
	 * 根据orderId查询该订单所有的合同
	 * @param orderId
	 * @return
	 * @throws Exception
	 */
	public IBOAgrAgreementValue[] getAgreementsFromOrderId(String custOrderId) throws Exception;
	
	/**
	 * 改单之后重新生成或更新合同
	 * @param soOrderData
	 * @param policyNo 仍然保留的保险列表
	 * @param customerOrderId
	 * @throws Exception
	 */
	public void reCreateAgreement(ISoOrderData soOrderData,List<String> policyNo,long customerOrderId) throws Exception;
	
	/**
	 * 通过订单号和custid查询所有的合同
	 * @param orderId
	 * @param ownerId
	 * @return
	 * @throws Exception
	 */
	public IBOAgrAgreementValue[] getAgreementByOrderId(String orderId, String ownerId) throws Exception;
	
	
	/**
	 * 查询合同RC和OTC议价，包括用户级议价和合同级议价。（供订单下单界面选择）
	 * @param custId
	 * @param agreementId
	 * @param offerId
	 * @param groupId
	 * @return
	 * @throws Exception
	 */
	public IBOAgrOfferRlaHValue[] getNegotiatedParams(long custId,long agreementId,long offerId) throws Exception;
	
	/**
	 * 根据传入的offer的顺序，查询offer在合同侧的议价组。（刷订单的一次性费用要用到）
	 * 如果有用户级议价，返回默认组的groupId；
	 * 如果没有用户级议价但是有合同级议价，返回0；
	 *如果什么议价都没有，返回-1。
	 *例如传入offerIds{30014,30015,30016}，返回 {G0001,0,-1}
	 * @param custId
	 * @param agreementId
	 * @param offerIds
	 * @return
	 * @throws Exception
	 */
	public String[] getNegotiatedGroups(long custId, long agreementId, String offerIds) throws Exception;
	
	/**
	 * 查询默认的当前生效的合同议价，包括rc和otc。如果有议价组则取默认议价组的议价值；如果没有默认议价组则看看有没有合同级议价；如果都没有返回空数组
	 * @param custId
	 * @param agreementId
	 * @param offerId
	 * @return
	 * @throws Exception
	 */
	public IBOAgrOfferRlaHValue[] getOfferBargainParamsDefault(long custId,long agreementId,long offerId) throws Exception;
	
	/**
	 *  不知道custid时，查询默认的当前生效的合同议价，包括rc和otc。如果有议价组则取默认议价组的议价值；如果没有默认议价组则看看有没有合同级议价；如果都没有返回空数组
	 * @param agreementId
	 * @param offerId
	 * @return
	 * @throws Exception
	 */
	public IBOAgrOfferRlaHValue[] getOfferBargainParamsNewDefault(long agreementId, long offerId) throws Exception;
	/**
	 * 根据指定的groupId查询当前生效的合同议价。如果groupId传空或者null，那么就查合同级议价，如果查不到则返回空数组。
	 * @param custId
	 * @param agreementId
	 * @param offerId
	 * @param groupId
	 * @return
	 * @throws Exception
	 */
	public IBOAgrOfferRlaHValue[] getOfferBargainParamsByGroupId(long custId,long agreementId,long offerId,String groupId) throws Exception;
	
	
	/**
	 * 查询默认的当前生效的合同RC议价。如果有议价组则取默认议价组的议价值；如果没有议价组则看看有没有合同级议价；如果都没有返回空数组
	 * @param custId
	 * @param agreementId
	 * @param offerId
	 * @return
	 * @throws Exception
	 */
	public IBOAgrOfferRlaHValue[] getRCOfferBargainParamsDefault(long custId,long agreementId,long offerId) throws Exception;
	
	/**
	 * 根据指定的groupId查询当前生效的合同RC议价。如果groupId传空或者null，那么就查合同级议价，如果查不到则返回空数组。
	 * @param custId
	 * @param agreementId
	 * @param offerId
	 * @return
	 * @throws Exception
	 */
	public IBOAgrOfferRlaHValue[] getRCOfferBargainParamsByGroupId(long custId,long agreementId,long offerId,String groupId) throws Exception;
	
	/**
	 * 查询默认的当前生效的合同OTC议价。如果有议价组则取默认议价组的议价值；如果没有议价组则看看有没有合同级议价；如果都没有返回空数组
	 * @param custId
	 * @param agreementId
	 * @param offerId
	 * @return
	 * @throws Exception
	 */
	public IBOAgrOfferRlaHValue[] getOTCOfferBargainParamsDefault(long custId,long agreementId,long offerId) throws Exception;
	
	/**
	 * 根据指定的groupId查询当前生效的合同OTC议价。如果groupId传空或者null，那么就查合同级议价，如果查不到则返回空数组。
	 * @param custId
	 * @param agreementId
	 * @param offerId
	 * @param groupId
	 * @return
	 * @throws Exception
	 */
	public IBOAgrOfferRlaHValue[] getOTCOfferBargainParamsByGroupId(long custId,long agreementId,long offerId,String groupId) throws Exception;
	
	/**
	 * 不知道ownerId的情况下，查询默认的当前生效的合同RC议价。如果有议价组则取默认议价组的议价值；如果没有议价组则看看有没有合同级议价；如果都没有返回空数组
	 * @param agreementId
	 * @param offerId
	 * @return
	 * @throws Exception
	 */
	public IBOAgrOfferRlaHValue[] getRCOfferBargainParamsNewDefault(long agreementId,long offerId) throws Exception;
	
	/**
	 * 不知道ownerId的情况下，根据指定的groupId查询当前生效的合同RC议价。如果groupId传空或者null，那么就查合同级议价，如果查不到则返回空数组。
	 * @param agreementId
	 * @param offerId
	 * @return
	 * @throws Exception
	 */
	public IBOAgrOfferRlaHValue[] getRCOfferBargainParamsNewByGroupId(long agreementId,long offerId,String groupId) throws Exception;
	
	/**
	 * 不知道ownerId的情况下，查询默认的当前生效的合同OTC议价。如果有议价组则取默认议价组的议价值；如果没有议价组则看看有没有合同级议价；如果都没有返回空数组
	 * @param agreementId
	 * @param offerId
	 * @return
	 * @throws Exception
	 */
	public IBOAgrOfferRlaHValue[] getOTCOfferBargainParamsNewDefault(long agreementId,long offerId) throws Exception;
	
	/**
	 * 不知道ownerId的情况下，根据指定的groupId查询当前生效的合同OTC议价。如果groupId传空或者null，那么就查合同级议价，如果查不到则返回空数组。
	 * @param agreementId
	 * @param offerId
	 * @return
	 * @throws Exception
	 */
	public IBOAgrOfferRlaHValue[] getOTCOfferBargainParamsNewByGroupId(long agreementId,long offerId,String groupId) throws Exception;
	
	/**
	 * 订单选groupId，并展示相关信息 
	 * @Title: queryGroupIdForUesrPrice   
	 * @Description: TODO(描述这个方法的作用)   
	 * @param: @param custId
	 * @param: @param agreementId
	 * @param: @param offerId
	 * @param: @throws Exception   
	 * @author: YuJing    
	 * @date:   2020-12-8 18:27:29   
	 * @return: void      
	 * @throws
	 */
	public  List<List<Map<String,Object>>> queryGroupIdForUesrPrice(long custId,long agreementId,long offerId) throws Exception;
	
	/**
	 * 更新agr_offer_inst表里的groupId
	 * @param custId
	 * @param agreementId
	 * @param offerInstId
	 * @param groupId
	 * @throws Exception
	 */
	public void updateAgrOfferInstGroupId(long custId,long offerInstId,String groupId) throws Exception;
	
	/**
	 * 查询合同所有的议价参数
	 * @param custId
	 * @param agreementId
	 * @return
	 * @throws Exception
	 */
	public IBOAgrOfferRlaHValue[] getOfferBargainParams(long custId, long agreementId) throws Exception; 
	
	public List<DataContainerInterface> getNegotiatedSubscriber(String ownerId, String agrId, String serviceNumber, String groupId,
			String offerId) throws Exception;
	
	/**
	 * 查询Licence议价开关
	 * @param agreementId
	 * @param offerId
	 * @return 1：开          2：关
	 * @throws Exception
	 */
	public int getLicenseStaircaseFlag(long agreementId,long offerId) throws Exception; 
	
	public int getCurrentLicenseStaircaseFlag(long agreementId,long offerId)  throws Exception;
	
	/**
	 * 	CR345新增接口
	 * 	根据ose传过来的CRM订单号，查询 需要签字的合同数量
	 * @param customerOrderIds		CrmOrderIds，以逗号分隔，eg: 32xxxx01,32xxxx02,32xxxx03
	 * @return			需要签字的合同（仅指subscription,insurance,switch这三种）数量
	 * @throws Exception
	 */
	public List<Map<String,String>> judgmentOrderContract(String customerOrderIds) throws Exception;
}

