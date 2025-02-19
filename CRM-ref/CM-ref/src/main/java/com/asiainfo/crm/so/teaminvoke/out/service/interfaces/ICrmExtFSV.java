package com.asiainfo.crm.so.teaminvoke.out.service.interfaces;

import com.ai.appframe2.common.BusinessException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.bce.ivalues.IBceData;
import com.ai.bce.ivalues.IBceDealReturnData;
import com.ai.bce.ivalues.IBceRuleReturnData;
import com.ai.omframe.instance.ivalues.IInsUserValue;
import com.ai.omframe.order.data.ivalues.ISoOrderData;
import com.ai.omframe.order.ivalues.IOrdCustExtValue;
import com.ai.omframe.order.ivalues.IOrdCustValue;
import com.ai.omframe.order.ui.ivalues.ISoRuleReturnData;
import com.ai.pce.exception.PceException;
import com.ai.pce.ivalues.IOfferValue;
import com.asiainfo.crm.inter.exe.webservice.client.arp.Ack;
import com.asiainfo.crm.so.order.rboss.ivalues.IBOOrdOTTCustValue;
import com.asiainfo.crm.so.order.rboss.ivalues.IBOOrdProcessStatusValue;
import com.asiainfo.crm.so.shop.bo.OfferMutexDependInfo;

import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ICrmExtFSV {
	
	public Map getUserStopOpenStatus(long custId) throws  Exception,RemoteException;
	
 	public int getUserCountByCondition(long custId,long offerId)  throws  Exception,RemoteException;
 	public Timestamp queryAgreementExpireDate(String custId,long offerId)throws  Exception,RemoteException;
 	public DataContainerInterface[] getVpnInfo(String custId)throws  Exception,RemoteException;
 	public Map checkVpnShortNum(String custId,String VpnId,String shortNum) throws  Exception,RemoteException;
 	public IBceDealReturnData ordQuidProd(String billId,String taskId,String isPortOut,String selectFlag) throws Exception, RemoteException;
	 /**
     * 鐭俊淇敼涓存椂棰勭畻闃堝�<Br>
     * zhangyy3<br>
     * 20141222<br>
     *
     * @param billId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map<String,String> updateBudgetThreshold(String billId) throws Exception,RemoteException;

    /**
     * zhangyy3 20121224
     * 鏍￠獙password鏄惁姝ｇ‘
     * @param userPassword
     * @param billId
     * @param channelType
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public boolean checkpassword(String userPassword,String billId,int channelType) throws Exception,RemoteException;

    /**
     * 澶勭悊鍦ㄩ�宸ュ崟
     * zhangyy3
     * 20141228
     * @param customerOrderId 瀹㈡埛璁㈠崟id
     * @param userId 鐢ㄦ埛id
     * @param changeType 鏀瑰彉绫诲瀷,鍙互鍙傜湅(绫讳技RBossConst.SO_CHANGE_TYPE_PSTN_NUMBER)
     * @param changeReason 鏀瑰彉鍘熷洜
     * @param oldValue 鑰佸�(鐢变簬涓嶅悓鐨刢hangeType浼犲叆鐨勫�涓嶅悓,鍙互鏍规嵁changeType,鍙傝�鐩稿叧浠ｇ爜)
     * @param newValue 鏂板�(鍚屼笂)
     * @throws RemoteException
     * @throws Exception
     */
    public void dealChangeOngoingOrder(long customerOrderId, long userId,String changeType,String changeReason, Map oldValue, Map newValue) throws RemoteException, Exception;
    public IBceDealReturnData dealGroupCustDiscount(HashMap param)throws Exception, RemoteException;
    
	/**
	 * 妫�煡offer鍜孋PE鏄惁閫傞厤
	 * @author sunht
	 * @date 2015-1-9
	 */
	public boolean checkCPE4VOIP(long CPEOfferId) throws RemoteException, Exception;
	
	
	/**
	 * 鏌ヨ鍦ㄩ�璁㈠崟鐨勮缁嗕俊鎭�
	 * 20150111
	 * @param customerOrderId 瀹㈡埛璁㈠崟id
	 * @param extMap 瀹㈡埛璁㈠崟id
	 * @return 璁㈠崟淇℃伅锛宱ffer淇℃伅锛岃处鎴蜂俊鎭紝鐗╂祦鍦板潃锛屽畨瑁呭湴鍧�紝涓�鎬ц垂鐢ㄤ俊鎭�
	 * @throws Exception
	*/
	public Map getOrderInfoByOrderId(long customerOrderId) throws Exception, RemoteException;

	List<Map> getSimInfosByOrderId(String customerOrderId,String orderMonth) throws Exception, RemoteException;

	List<Map> getSimInfosByUser(List<String> uIds) throws Exception;

	List<Map> getSimInfoByTaskId(long taskId) throws Exception;

	Map getSimTaskHis(long taskId,String year) throws Exception;
	/**
	   * 鍒ゆ柇鏄惁鍙互鍋氬弽鎮旀祦绋嬶紝濡傛灉涓嶈锛屼細鎶涘嚭寮傚父
	   * @param seriNo
	   * @throws Exception
	   * @throws RemoteException
	   */
	  public void IsCanRegretOrder(String IMEI, Map extMap) throws Exception,RemoteException;
	  
	  /**
	   * 鎻愪氦鍙嶆倲娴佺▼
	   * @param IMEI
	   * @param regretBusiOper
	   * @param OpId
	   * @param extMap
	   * @throws Exception
	   * @throws RemoteException
	   */
	  public long commitRegretOrder(String IMEI, String regretBusiOper, long OpId, Map extMap) throws Exception,RemoteException;

    /**
     * 鏍规嵁custId鏌ヨ绔ｅ伐璁㈠崟锛屾煡璇㈠湪閫旂殑璁㈠崟淇℃伅
     * zhouzf
     * 20150109
     * @param custId 瀹㈡埛id
     * @throws RemoteException
     * @throws Exception
     */
    public List getOngoingCustOrderInfoByCustId(long custId,String businessId) throws Exception,RemoteException;
    
    /**
     * 鏍规嵁custId鏌ヨ绔ｅ伐璁㈠崟锛岃繑鍥炲悇涓鍗曠殑淇℃伅
     * zhouzf
     * 20150109
     * @param custId 瀹㈡埛id
     * @throws RemoteException
     * @throws Exception
     */
    public List getCompleteCustOrderInfoByCustId(long custId,Date startdDate,Date endDate,String businessId) throws Exception,RemoteException;
    
    
    /**
     * 鍒ゆ柇鏄惁鑳藉DSL鍦ㄩ�璁㈠崟鍋氭挙鍗�
     * zhouzf
     * 20150109
     * @param customerOrderId 瀹㈡埛id
     * @param userId 鐢ㄦ埛ID
     * @param extMap 鎵╁睍鍏ュ弬锛屽鐢�
     * @param cancelType 鎾ら攢绫诲瀷
     * @param cancelReason 鎾ら攢鍘熷洜
     * @throws RemoteException
     * @throws Exception
     */
    public Map isCancelOngoingOrder(long customerOrderId, long userId, Map extMap,String cancelType, String cancelReason) throws Exception,RemoteException;

    /**
     * 鍒ゆ柇鏄惁鑳藉DSL鍦ㄩ�璁㈠崟鍋氭挙鍗�
     * zhouzf
     * 20150109
     * @param customerOrderId 瀹㈡埛id
     * @param userId 鐢ㄦ埛ID
     * @param mandatory 鎵╁睍鍏ュ弬锛屽鐢�
     * @param cancelType 鎾ら攢绫诲瀷
     * @param cancelReason 鎾ら攢鍘熷洜
     * @throws RemoteException
     * @throws Exception
     */
    public void dealCancelOngoingOrder(long customerOrderId, long userId, Map extMap,String cancelType, String cancelReason)throws RemoteException, Exception;
   
    /**
     * 鏌ヨ鍦ㄩ�璁㈠崟娴佺▼澶勭悊鐘舵�
     * qiancheng
     * 20150128
     * @param customerOrderId 璁㈠崟id
     * @throws Exception
     */
    public IBOOrdProcessStatusValue[] queryOrdProcessStatusByCustOrderId(long customerOrderId,String createDate) throws Exception;
    
    /**
     * 鏀规挙鍗�鎺у埗鍣�
     * zhouzf
     * 20150202
     * @param customerOrderId 璁㈠崟id
     * @throws Exception
     */
    public Map modifyAndCancelOnGoingOrderController(long customerOrderId)throws RemoteException, Exception;
    
    /**
     * ose璐墿杞﹀洖濉敮浠樻柟寮忥紝鍦⊿AP鍥炲～璧勬簮鏃讹紝鏍规嵁杩欎釜鏀粯鏂瑰紡锛岄�鐭illing瀹炴墸
     * @param shopCartId OSE璐墿杞D 
     * @param payType OSE璐墿杞D鏀粯鏂瑰紡 
     * @throws Exception
     */
    public void modifyCartPayType(long shopCartId, String payType)throws RemoteException, Exception;
    
    /**
     * DSL鏄惁鍙互鍋氭敼鍗�
     */   
    public String isChangeOngoingOrder(long customerOrderId, long userId,String changeType,String changeReason) throws RemoteException, Exception;

    /**
     * 鏌ヨ鍘嗗彶鐢ㄦ埛淇℃伅  
     *@param qryCond 鏌ヨ鏉′欢  "userId",addressId,"dslNumber","imeiNumber","banNumber","voiId","voipNo"

     * @param qryValue 鍊�
     */ 
    public List queryUserHisInfo(String qryCond, String qryValue) throws RemoteException, Exception;
    /**
     * 鎻愪緵缁欏悎鍚岄�璁㈡帴鍙�
     * @param custId
     * @param offerId
     * @param ismainoffer
     * @throws RemoteException
     * @throws Exception
     */
	public void destroyUser(long userId,long offerInstId, String ismainoffer)throws RemoteException, Exception ;
    
    /**
     * ARP棰勫紑閫氳姹傛帴鍙�
     * @author shjh
     * @param sender
     * @param receiver
     * @param arp                   TADIG Code of the ARP requesting the PreProvisioning operation
     * @param userIdentifier
     * @param signalStus
     * @param transactionId
     * @param authorizationInfo
     * @return ACK
     * @throws RemoteException
     * @throws Exception
     */
    public Ack preProvisioningRequest(String sender, String receiver, String arp, String userIdentifier, Number signalStus,
  		  String transactionId, String authorizationInfo, String bilateralInfo)throws RemoteException, Exception;
    
    /**
     * ARP閲嶈璐紑閫氳姹傛帴鍙�
     * @author shjh
     * @param sender
     * @param receiver
     * @param arp                   TADIG Code of the ARP requesting the PreProvisioning operation
     * @param userIdentifier
     * @param signalStus
     * @param transactionId
     * @param authorizationInfo
     * @return ACK
     * @throws RemoteException
     * @throws Exception
     */
    public Ack reProvisioningRequest(String sender, String receiver, Number oldStatus, Number newStatus,
  		  String subscriptionId, String transactionId, String bilateralInfo) throws RemoteException, Exception;
    
    /**
     * ARP寮��璇锋眰鎺ュ彛
     * @author shjh
     * @param sender
     * @param receiver
     * @param subscriptionId
     * @param transactionId
     * @param bilateralInfo
     * @return ACK
     * @throws RemoteException
     * @throws Exception
     */
    public Ack provisioningRequest(String sender, String receiver, String subscriptionId, String transactionId,
    		String bilateralInfo)throws RemoteException, Exception;

    /**
     * ARP閫�璇锋眰
     */
    public Ack deProvisioningRequest(String sender, String receiver,String subscriptionId, int deactivationRes, String bilateralInfo,String transactionId) throws RemoteException, Exception;

    /**
     * ARP鏆傚仠
     */   
    public Ack suspendRoaming(String sender, String receiver,String subscriptionId, String bilateralInfo, String transactionId) throws RemoteException, Exception;

    /**
     * ARP鎭㈠
     */   
    public Ack unSuspendRoaming(String sender, String receiver, String subscriptionId, String bilateralInfo, String transactionId) throws RemoteException, Exception;
    
    /**
     * ARP鍓嶅彴閲嶈璐�
     */   
    public Ack ReProvisioningAcknowledgement(String sender, String receiver, String subscriptionId, String arrivalTimestamp, String bilateralInfo, String transactionId) throws RemoteException, Exception;

    /**
     * 鏍规嵁IP鍦板潃鏌ヨ鐢ㄦ埛璐︽埛ID
     */   
    public 	Map getAccountIdByIP(String ip) throws RemoteException, Exception;
    
    /**
     * 鏂扮瓥鍒掔骇浜掓枼渚濊禆鎺ュ彛
     * @return
     * @throws RemoteException
     * @throws Exception
     */
    public Map checkMutexDepend(long userId, List<OfferMutexDependInfo> oldOffers, List<OfferMutexDependInfo> newOffers, long channelType, long businessId)
			throws RemoteException, Exception;
    
    /**
	 * 鎻愪緵缁橭SE鏌ヨ鐢ㄦ埛淇℃伅锛屽弽鎮旀祦绋婲EW
	 * @param seriNo
	 * @param resellFlag
	 * @param hasHanset
	 * @throws Exception
	 *@author wulq
	 */
	public String queryUserInfoBySeriNo(String seriNo,String resellFlag,String hasHanset)throws RemoteException, Exception;
	/**
	 * 鏌ヨ澶氬崱澶氬彿
	 */
	public Map getDoublesimAttr(long customerOrderId,long userId, long offerInstId) throws RemoteException, Exception;
	
	/**
     * 鏍规嵁UserID鏌ヨ鐢ㄦ埛褰撳墠鐨凷TP淇℃伅锛岃繑鍥炲舰寮�{key1=offerId,value1=STP鍊紏
     */   
    public 	Map getSTPByUserID(String userID) throws RemoteException, Exception;
    
    /**
     * 鏍规嵁鐢ㄦ埛ID鍜屾湇鍔D锛屾煡璇㈢敤鎴峰疄渚嬩腑鏄惁鏈夌敓鏁堢殑鎸囧畾鏈嶅姟
     */   
    public 	boolean isEffctiveByUserIDSrvID(String userID, long srvID) throws RemoteException, Exception;

    /**
     * 鏍规嵁cpr 鎴栬�cvr銆乲ob鏌ヨ瀹㈡埛淇℃伅
     * @param map
     * @return
     * @throws RemoteException
     * @throws Exception
     */
    public Map getNameAddressByCprCvrKob(Map map) throws RemoteException, Exception;
    
    /**
     * 鏍规嵁鐢ㄦ埛ID鍜宨nvoiceName锛屼慨鏀硅处鍗曞悕
     */ 
    public void modifyInvoiceName(String billId, String invoiceName) throws RemoteException, Exception;
    
    /**
     * 鏍规嵁鐢ㄦ埛ID鍜宻hortNumber绛夛紝璋冪敤淇敼鐭彿鐨勬柟娉�
     */
    public void modifyShortNumber(String billId, String shortNumber, String channelType) throws RemoteException, Exception;
    
	/*鎻愪緵缁檕se鏌ヨ绔ｅ伐璁㈠崟璇︽儏
	 * customerOrderId   璁㈠崟缂栧彿
	 * regionId     
	 * createDate  璁㈠崟鐨勫垱寤烘椂闂� * 
	 * */
    public Map getFinishOrderInfoByOrderId(long customerOrderId, String regionId, Date createDate) throws Exception, RemoteException;
/**
 * 鏍规嵁鎵嬫満鍙风爜鏌ヨ鍦ㄩ�璁㈠崟
 * @param billid
 * @return
 * @throws Exception
 * @throws RemoteException
 */
    public IOrdCustValue getOrderCustByBillId(String billid) throws Exception,RemoteException;
    
    /**
     * 閫氳繃鍙风爜锛堝寘鎷富鍙凤紝鍓彿锛夋煡璇㈢敤鎴蜂俊鎭�
     * @param billid
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IInsUserValue getInsUserByMultNumber(String billid) throws Exception,RemoteException;
    
	/**
	 * 鏌ヨ杩囨埛淇℃伅
	 * @param attrValue
	 * @return
	 * @throws Exception
	 */
	public Map<String,Object> getTransferOwnershipDetails(String attrValue) throws Exception;
	
	public IBceDealReturnData ordQuidProdNew(String billId,String taskId,Map extMap) throws Exception, RemoteException;
	
	
	/**
  	 * 鏍规嵁璁㈠崟ID锛屾煡璇㈡璁㈠崟鐨勭姸鎬佺粰鍑虹浉搴旂殑缁撴灉锛�
  	 * 1.璁㈠崟宸茬粨鏉� 2.璁㈠崟澶勭悊涓�3.鍙互澶勭悊
  	 * @param customerOrderId
  	 * @return
  	 * @throws Exception
  	 */
  	public String getCustStateByCustOrderId(long customerOrderId)throws Exception;
  	
	public IBOOrdOTTCustValue getOTTOffer(long ottCustRelaId) throws Exception;
	
	public Map<String,Object> activateOTTOffer(long ottCustRelaId) throws Exception;

  	
  	/**
	 * 鏍规嵁璁惧淇℃伅鏌ヨ鍙璐殑淇濋櫓
	 * @author liaopeng
	 * @date 2015-12-14
	 */
	public IOfferValue[] getInsuranOfferByofferIdAndfeeAmt(long offerId,long feeAmount,String marketSegmentId)throws Exception,RemoteException;
	
	public IOfferValue[] getInsuranOfferByofferIdAndfeeAmtNew(long offerId,long feeAmount,String marketSegmentId,String imei,String userId,String insuranceType,long custId)throws Exception,RemoteException;
	
	/**
	 * 
	 * <p>Title: getInsuranOfferByofferIdAndfeeAmtNew</p>  
	 * <p>Description: </p>  
	 * @param mainOfferId
	 * @param handsetOfferId
	 * @param feeAmount
	 * @param marketSegmentId
	 * @param imei
	 * @param userId
	 * @param insuranceType
	 * @param custId
	 * @return
	 * @throws Exception
	 * @throws RemoteException  
	 * @author YangJie  
	 * @date 2019年12月10日  
	 * @version SR 0.83
	 */
	public IOfferValue[] getInsuranOfferByofferIdAndfeeAmtNew(long mainOfferId,long handsetOfferId,long feeAmount,String marketSegmentId,String imei,String userId,String insuranceType,long custId)throws Exception,RemoteException;
	
	/**
	 * 
	 * <p>Title: getQuarantineInfo</p>  
	 * <p>Description: </p>  
	 * @param insuranceOfferId
	 * @return
	 * @throws Exception  
	 * @author YangJie  
	 * @date 2019年12月10日  
	 * @version SR 0.83
	 */
	public String getQuarantineInfo(long insuranceOfferId) throws Exception;
	/**
	 * 
	 * <p>Title: initInsuParam</p>  
	 * <p>Description: </p>  
	 * @param handsetOfferId
	 * @param insuranceType
	 * @param hasQuarantine
	 * @param mainOfferId
	 * @param currentOfferId
	 * @param paramMap
	 * @throws Exception  
	 * @author YangJie  
	 * @date 2019年12月10日  
	 * @version SR 0.83
	 */
	public Map initInsuParam(long handsetOfferId,String insuranceType, String hasQuarantine, long mainOfferId,String mainUserState,long currentOfferId, Map paramMap)throws Exception;
	
	/**
	 * 鏍规嵁OSE鐨勮喘鐗╄溅ID锛屽垹闄rd_cust,ord_cust_waiting鏁版嵁锛屾妸璐墿杞﹁〃鐨勭邯褰曟爣璁颁负鍒犻櫎
	 * @param cartId 
	 * @return flag   鏄惁鍒犻櫎鎴愬姛锛屾湁寮傚父杩斿洖false
	 * @date 2015-12-18
	 */
    public boolean rollbackCartAndOrder(long cartId) throws Exception,RemoteException;
    
    /**
	 * 鏍规嵁鍓彿鏌ヨ涓诲彿绫诲瀷
	 * @param userId
	 * @return
	 * @throws Exception
	 */
    public String getVpnMemAccessType(long userId)throws Exception;
    
    /**
	 * 鏍规嵁UserId鏌ヨ鐢ㄦ埛鏄惁鏄疨bx鐢ㄦ埛
	 * @param userId
	 * @return
	 * @throws Exception
	 */
    public boolean isPbxUser(long userId) throws Exception;
	/**
	 * 
	 * @param custId        瀹㈡埛ID
	 * @param custSegment   瀹㈡埛缁嗗垎
	 * @param custName      瀹㈡埛鍚嶅瓧锛堝搴旇〃瀛楁  subscribe_company锛�
	 * @throws Exception 
	 */
    public boolean updateCustInfo4CPA(long custId, String custSegment, String custName) throws Exception;
    
    /**
     * 
     * @param acctId      璐︽埛ID
     * @param cycleType   璐︽埛绫诲瀷
     * @param cycleUnit   cycleUnit
     * @param billDate    鍑鸿处鏃�
     * @return
     * @throws Exception 
     */
    public boolean updateAcctInfo4CPA(long acctId, String cycleType, String cycleUnit, String billDate) throws Exception;
    /**
     * 
     * @param billId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public Map queryVpnInfoByMemUserId(String billId)throws Exception,RemoteException;

    /**
     * @param billId
     * @return
     * @throws Exception
     */
	public Map queryFilterAddonOfferIds(long userId)throws Exception;
	
	
	/**
	* @Description: (缁欏悎鍚屼晶浣跨敤)鍒ゆ柇褰撳墠瀹㈡埛涓嬪瓨鍦ㄦ煇涓猳ffer鐨勫湪閫斿伐鍗曠殑鎺ュ彛
	* @author: zhouyongchao
	* @param  customerId 
	* @param  offerId 
	* @return 甯冨皵鍊�
	* @throws Exception    
	*/
	public boolean judgeOngoingOrder(long customerId, long offerId) throws Exception;
	
	/** 
	* @Function: getOrderInfoByOrderId 
	* @Description: TODO
	* @param
	* @return List
	* @throws 异常描述
	* @author L1ekkAs
	* @date 2016-7-25 上午10:11:16 
	*/ 
	public List getTransferOwnershipDetails4Batch(String customerOrderId) throws Exception, RemoteException;

	public boolean getOngoingOrderByAcctId(long acctId) throws Exception, RemoteException;
	
	public void checkValidAcct(long customerOrderId)throws Exception, RemoteException;
	
	public IOrdCustExtValue[] getOrdCustExt(String attrCode,String attrValue) throws Exception,RemoteException;
	
	/**
	 * 根据号码判断是否有在途单
	 * @param billId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public boolean hasUnCompleteOrder(String billId)throws Exception, RemoteException;
	
	/**
	 * 
	 * <p>Title: getInsuranceLatestImei</p>  
	 * <p>Description: </p>  
	 * @param customerOrderId
	 * @param offerOrderId
	 * @param attrId
	 * @param regionId
	 * @return
	 * @throws Exception  
	 * @author YangJie  
	 * @date 2019年12月27日  
	 * @version SR 0.83
	 */
	public String getInsuranceLatestImei(long customerOrderId,long offerOrderId,long attrId,String regionId) throws Exception;
	/**
	 * 
	 * <p>Title: isFreeInsuranceExist</p>  
	 * <p>Description: </p>  
	 * @param mainBillId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @throws PceException  
	 * @author YangJie  
	 * @date 2020年1月17日  
	 * @version SR 0.83
	 */
	public Map queryFreeInsurance(String mainBillId)throws Exception, RemoteException, PceException;
	
	/**
	 * 
	 * <p>Title: queryInstanceInsurance</p>  
	 * <p>Description: </p>  
	 * @param mainBillId
	 * @return
	 * @throws Exception  
	 * @author YangJie  
	 * @date 2020年2月18日  
	 * @version SR 0.83
	 */
	public Map queryInstanceInsurance(String mainBillId) throws Exception;
	
	/**
	 * 
	 * <p>Title: getFixedLineOrderByBillId</p>  
	 * <p>Description: </p>  
	 * @param billId
	 * @return
	 * @throws Exception  
	 * @author YangJie  
	 * @date 2020年4月8日  
	 * @version SR 0.83
	 */
	public String getFixedLineOrderByBillId(String billId) throws Exception;
	
	/**
	 * 
	 * <p>Title: getFixedLinePreTechType</p>  
	 * <p>Description: </p>  
	 * @param billId
	 * @return
	 * @throws Exception  
	 * @author YangJie  
	 * @date 2020年4月8日  
	 * @version SR 0.83
	 */
	public String getFixedLinePreTechType(String billId) throws Exception;
	
	/**
	 * cr241 new add
	 * 	cancel unpaid order for ose
	 * @return
	 * @throws Exception
	 */
	public void cancelUnPaidOrder(long customerOrderId) throws Exception;
	
	/**
	 * 
	 * <p>Title: isWimpAddon</p>  
	 * <p>Description: </p>  
	 * @param offerId
	 * @return
	 * @throws RemoteException
	 * @throws Exception  
	 * @author YangJie  
	 * @date 2020年4月9日  
	 * @version SR 0.83
	 */
	public boolean isWimpAddon(long offerId) throws RemoteException, Exception;
	
	/**
	 * 
	 * <p>Title: getLegalAddressId</p>  
	 * <p>Description: </p>  
	 * @param custId
	 * @return
	 * @throws RemoteException
	 * @throws Exception  
	 * @author yangxie  
	 * @date 2020年5月11日  
	 * @version V1.0
	 */
	public long getLegalAddressId(long custId) throws RemoteException, Exception;
	
	/**
	 * 
	 * <p>Title: getLegalAddress</p>  
	 * <p>Description: </p>  
	 * @param custId
	 * @return
	 * @throws RemoteException
	 * @throws Exception  
	 * @author yangxie  
	 * @date 2020年5月14日  
	 * @version V1.0
	 */
	public Map getLegalAddress(long custId) throws RemoteException, Exception;
	
	/**
	 * 
	 * @param customerOrderId
	 * @param userId
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 */
	public boolean isChangeCoaxCpeOrder(String billId) throws RemoteException, Exception;
	
	/**
	 * CR327 
	 * 保险和手机一起订购时,手机的服务属性新增attrId=151400000212 attrValue=保险offerId
	 * 覆盖如下场景(ose or crm)：
		1. 订购合约机+订购保险（newConn4Indiv）  
		2. 订购裸机+订购保险（newConn4Indiv）
		3. 订购Elgigaten手机+订购保险（newConn4Indiv）
	 *      
	 * @param saveData
	 * @param mainBusiId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void dealHandsetInsuranceAttr(ISoOrderData saveData, long mainBusiId) throws Exception, RemoteException;
	
	/**
	 * 过户场景 处理wimp 服务属性为空的情况，mobile产品线wimp attr默认应该是registerType=2 userName Attr 默认是billid
	 * @param saveData
	 * @param mainBusiId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void dealWimpAttrForTrans(ISoOrderData saveData, long mainBusiId) throws Exception, RemoteException;
	
	public boolean isFreeScreenInsurance(IOfferValue offerValue)throws Exception, RemoteException;
	
	/**
	 * 
	 * @param saveData
	 * @param mainBusiId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void dealKIMissingForMultiSim(ISoOrderData saveData, long mainBusiId) throws Exception, RemoteException;
	
	/**
	 * 
	 * @param batchFlag
	 * @param businessId
	 * @return
	 * @throws Exception
	 */
	public String getMyOrderPageDefaultValue(String batchFlag, String businessId) throws Exception ;
	
	/**
	 * 
	 * @param userId
	 * @param businessId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public  ISoRuleReturnData isUserhasOngoingOrder(long userId,long businessId)throws Exception, RemoteException;
	
	/**
	 * 
	 * <p>Title: isCustomerExcludeMediaFee</p>  
	 * <p>Description: </p>  
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @throws RemoteException  
	 * @author Yang Jieee  
	 * @date 2022年5月10日  
	 * @version V1.0
	 */
	public Map isCustomerExcludeMediaFee(long custId) throws Exception,RemoteException;
	
	/**
	 * 
	 * <p>Title: existActiveUsers</p>  
	 * <p>Description: </p>  
	 * @param custId
	 * @return
	 * @throws Exception  
	 * @author Yang Jieee  
	 * @date 2022年5月20日  
	 * @version V1.0
	 */
	public boolean isAllActiveConfigedUsers(long custId) throws Exception;
	/**
	 * 
	 * <p>Title: checkInsuranceProductAttr</p>  
	 * <p>Description: </p>  
	 * @param offerId
	 * @return
	 * @throws RemoteException
	 * @throws Exception  
	 * @author Yang Jieee  
	 * @date 2022年5月20日  
	 * @version V1.0
	 */
	public boolean checkInsuranceProductAttr(long offerId) throws RemoteException, Exception;
	
	/**
	 * 
	 * <p>Title: queryFreeInsuranceTerminateOrderByReason</p>  
	 * <p>Description: </p>  
	 * @param custId
	 * @param reason
	 * @return
	 * @throws Exception  
	 * @author Yang Jieee  
	 * @date 2022年6月14日  
	 * @version V1.0
	 */
	public long queryFreeInsuranceTerminateOrderByReason(long custId,String reason,String custRegionId) throws Exception;
	
	/**
	 * 
	 * <p>Title: isBusiCanDoForNewOM</p>  
	 * <p>Description: </p>  
	 * @param paramMap
	 * @return
	 * @throws Exception  
	 * @author Yang Jieee  
	 * @date 2022年8月16日  
	 * @version V1.0
	 */
	public  IBceRuleReturnData isBusiCanDoForNewOM(Map<String,String> paramMap)throws Exception;
	
	/**
	 * 
	 * <p>Title: isGreenMindHandset</p>  
	 * <p>Description: </p>  
	 * @param offerId
	 * @return
	 * @throws Exception  
	 * @author Yang Jieee  
	 * @date 2022年12月21日  
	 * @version V1.0
	 */
	public boolean isGreenMindHandset(long offerId) throws Exception;
	List<Map> getSimInfosByPreOrderId(String preCustomerOrderId) throws Exception;
	
	/**
	 * 
	 * <p>Title: validateOttxOffer</p>  
	 * <p>Description: </p>  
	 * @param custId
	 * @param offerData
	 * @throws Exception
	 * @throws RemoteException
	 * @throws BusinessException  
	 * @author Yang Jieee  
	 * @date 2023年2月21日  
	 * @version V1.0
	 */
	public void validateOttxOffer(long custId, IBceData[] offerData) throws Exception, RemoteException, BusinessException;

	/**
	 * 判断是否是试用期offer
	 * @param offerId
	 * @return
	 * @throws RemoteException
	 * @throws Exception
	 */
	public boolean isProtationOffer(long offerId) throws RemoteException, Exception;

}
