package com.asiainfo.crm.so.teaminvoke.in.service.interfaces;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataStructInterface;
import com.ai.omframe.order.ivalues.IOVOrderCustomer;
import com.asiainfo.crm.res.goods.ivalues.IBOResInstanceValue;
import com.asiainfo.crm.res.paycard.ivalues.IBOResPayCardValue;
import com.asiainfo.crm.res.phone.ivalues.IBOResPhoneNumAgentPrepayValue;
import com.asiainfo.crm.res.phone.ivalues.IBOResPhoneNumOriginValue;
import com.asiainfo.crm.res.phone.ivalues.IBOResPhoneNumUsedValue;
import com.asiainfo.crm.res.phone.ivalues.IQBOCorporateNumberMgrValue;
import com.asiainfo.crm.res.rescfg.ivalues.IBOGsmHlrInfoValue;
import com.asiainfo.crm.res.rescfg.ivalues.IBOResImsiNumSegmentValue;
import com.asiainfo.crm.res.rescfg.ivalues.IBOResPartnerValue;
import com.asiainfo.crm.res.rescfg.ivalues.IBOResPatternAllRuleValue;
import com.asiainfo.crm.res.rescfg.ivalues.IBOResSpecValue;
import com.asiainfo.crm.res.simcard.ivalues.IBOResSimCardOriginValue;
import com.asiainfo.crm.res.simcard.ivalues.IBOResSimCardUsedValue;
import com.asiainfo.crm.res.terminal.ivalues.IBOResOperOrderTerminalValue;
import com.asiainfo.crm.res.terminal.ivalues.IBOResTerminalOriginValue;

public interface IRes2CrmSV {
	
    /**
    * @Function: phoneNumOccupyFromFreeze
    * @Description: 号码冷冻占用
    *
    * @param:
    * @return：
    * @throws：异常描述
    *
    * @version: v1.0.0
    * @author: liuke
    * @date: 2012-9-1 下午02:19:25  
    *
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * 2012-9-1      liuke           v1.0.0               修改原因
     */
    public boolean phoneNumOccupyFromFreeze(String billId, String simCardNo, String orderCode,
    						String regionId,long orgId,long opId) throws Exception,RemoteException;
	
   
    /**
	 * @Function: 
	 * @Description: 资源的实占接口，完成某类资源（号码、SIM卡、有价卡、终端）的实占操作，实占完成以后在空闲的资源中无法查看到也不能进行释放。
	 *
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: liuke
	 * @date: 2012-01-04  
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *-------------------------------------------------------------*
	 * 2012-01-04     liuke          v1.0.0             修改原因
	 */
    public boolean resOccupy(String billId, String iccId, String regionId,String orderCode, long orgId, long opId)throws Exception,RemoteException;
	
	 /**
	 * @Function: 
	 * @Description: sim卡信息的查询接口，根据SIM卡号获取可用的SIM卡信息
	 *
     *@param:resParam 资源入参
	 * 参数说明：参数类型Map
	 * 		   key="resId" value类型：String 资源ID
	 *         key="resCode" value类型：String 资源编码
	 *         key="orderCode" value类型：String 订单编码
	 *         key="regionId" value类型：String 地区编号
	 *         key="orgId" value类型：String 组织编号
	 *         key="opId" value类型：String 操作员编号
	 * @return：返回结果描述
	 * 结果说明：返回结果为 Map
	 * 		   key="result" value类型：boolean 操作是否成功
	 * 		   key="message" value类型：String 操作结果信息
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: liuke
	 * @date: 2012-01-04  
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *-------------------------------------------------------------*
	 * 2012-01-04     liuke          v1.0.0             修改原因
	 */
	public DataStructInterface getResSimCardInfo(String iccId, String regionId, long orgId, long opId) throws Exception, RemoteException;
	
	
	/**
	 * 已完成
	 * @Description: 已用号码的信息的查询接口，根据号码查询号码的等级相关的信息。应用于入网以后号码资源信息的查看。
	 * @param:resParam 资源入参
	 * 参数说明：参数类型Map
	 * 		   key="resId" value类型：String 资源ID
	 *         key="billId" value类型：String 号码
	 *         key="orderCode" value类型：String 订单编码
	 *         key="regionId" value类型：String 地区编号
	 *         key="orgId" value类型：long 组织编号
	 *         key="opId" value类型：long 操作员编号
	 * @return：返回结果描述
	 * @throws：异常描述
	 * 
	 */
	//public IBOResPhoneNumUsedValue[] getResPhoneNumInfo(Map resParam) throws Exception, RemoteException;
	
	/**
	 * 已完成
	 * @Description: 资源的预占接口，完成某类资源（号码、SIM卡、有价卡、终端）的预占操作，预占完成以后在空闲的资源中无法查看到，但可以通过资源释放接口进行释放。
	 * @param:resParam 资源入参
	 * 参数说明：参数类型Map
	 * 		   key="resId" value类型：String 资源ID
	 *         key="resCode" value类型：String 资源编码
	 *         key="resSpecId" value类型：String 资源规格
	 *         key="tradeType" value类型：String 资源预占类型
	 *         key="certType" value类型：long  证件类型
	 *         key="certNo" value类型：String  证件编号
	 *         key="regionId" value类型：String 地区编号
	 *         key="orgId" value类型：long 组织编号
	 *         key="opId" value类型：long 操作员编号
	 * @return：返回结果描述
	 * 结果说明：返回结果为 Map
	 * 		   key="result" value类型：boolean 操作是否成功
	 * 		   key="message" value类型：String 操作结果信息
	 * @throws：异常描述
	 * 
	 */
	public IBOResSimCardOriginValue resPreOccupy(String billId, String iccId, String specId, String regionId, long orgId, long opId, String xMode) throws Exception, RemoteException;
	
	/**
	 * 已完成
	 * @Description: 资源的预占接口，完成某类资源（号码、SIM卡、有价卡、终端）的预占操作，预占完成以后在空闲的资源中无法查看到，但可以通过资源释放接口进行释放。
	 * @param:resParam 资源入参
	 * 参数说明：参数类型Map
	 * 		   key="resId" value类型：String 资源ID
	 *         key="resCode" value类型：String 资源编码
	 *         key="resSpecId" value类型：String 资源规格
	 *         key="tradeType" value类型：String 资源预占类型
	 *         key="certType" value类型：long  证件类型
	 *         key="certNo" value类型：String  证件编号
	 *         key="regionId" value类型：String 地区编号
	 *         key="orgId" value类型：long 组织编号
	 *         key="opId" value类型：long 操作员编号
	 * @return：返回结果描述
	 * 结果说明：返回结果为 Map
	 * 		   key="result" value类型：boolean 操作是否成功
	 * 		   key="message" value类型：String 操作结果信息
	 * @throws：异常描述
	 * 
	 */
	public Map resPreOccupys(Map resParam) throws Exception, RemoteException;
	
	/**
	 * 未实现
	 * @Description: 资源的批量预占接口，完成某类资源（号码、SIM卡、有价卡、终端）的预占操作，预占完成以后在空闲的资源中无法查看到，但可以通过资源释放接口进行释放。
	 * @param:resParam 资源入参
	 * 参数说明：参数类型Map
	 * 		   key="resInstance" value类型：Map[]
	 * 		   resInstance参数说明：包含（resId，resCode，resSpecId）
	 * 		   resInstance：		key="resId" value类型：String 资源ID
	 *         resInstance		key="resCode" value类型：String 资源编码
	 *         resInstance		key="resSpecId" value类型：String 资源规格
	 *         resParam		key="tradeType" value类型：String 资源预占类型
	 *         resParam		key="certType" value类型：long  证件类型
	 *         resParam		key="certNo" value类型：String  证件编号
	 *         resParam		key="regionId" value类型：String 地区编号
	 *         resParam		key="orgId" value类型：long 组织编号
	 *         resParam		key="opId" value类型：long 操作员编号
	 * @return：返回结果描述
	 * 结果说明：返回结果为 Map
	 * 		   key="result" value类型：boolean 操作是否成功
	 * 		   key="message" value类型：String 操作结果信息
	 * @throws：异常描述
	 * 
	 */
	public Map resBatchPreOccupy(Map resParam) throws Exception, RemoteException;
	
	/**
	 * 需修改
	 * @Description: 资源的批量实占接口，完成某类资源（号码、SIM卡、有价卡、终端）的实占操作，实占完成以后在空闲的资源中无法查看到也不能进行释放。
	 * @param:resParam 资源入参
	 * 参数说明：参数类型Map
	 * 		   key="resInstance" value类型：Map[] 
	 * 		   resInstance参数说明：包含（resId，resCode，resSpecId，relatResId，relatResCode，relatResSpecId）
	 * 		   resInstance：		key="resId" value类型：String 资源ID
	 *         resInstance		key="resCode" value类型：String 资源编码
	 *         resInstance		key="resSpecId" value类型：String 资源规格
	 *         resInstance		key="relatResId" value类型：String 关系资源ID
	 *         resInstance		key="relatResCode" value类型：String 关系资源编码
	 *         resInstance		key="relatResSpecId" value类型：String 关系资源规格
	 *         resParam		key="orderCode" value类型：String 操作流水号
	 *         resParam		key="regionId" value类型：String 地区编号
	 *         resParam		key="orgId" value类型：long 组织编号
	 *         resParam		key="opId" value类型：long 操作员编号
	 * @return：返回结果描述 
	 * 结果说明：返回结果为 Map
	 * 		   key="result" value类型：boolean 操作是否成功
	 * 		   key="message" value类型：String 操作结果信息
	 * @throws：异常描述
	 * 
	 */
	public Map resBatchOccupy(Map resParam) throws Exception, RemoteException;
	
	/**
	 * 未实现
	 * @Description: 资源的释放接口，完成某类（号码、SIM卡、有价卡、终端）已经预占资源的释放操作
	 * @param:resParam 资源入参
	 * 参数说明：参数类型Map
	 * 		   key="resId" value类型：String 资源ID
	 *         key="resCode" value类型：String 资源编码
	 *         key="resSpecId" value类型：String 资源规格
	 *         key="orderCode" value类型：String 操作流水号
	 *         key="regionId" value类型：String 地区编号
	 *         key="orgId" value类型：long 组织编号
	 *         key="opId" value类型：long 操作员编号
	 * @return：返回结果描述
	 * 结果说明：返回结果为 Map
	 * 		   key="result" value类型：boolean 操作是否成功
	 * 		   key="message" value类型：String 操作结果信息
	 * @throws：异常描述
	 * 
	 */
	public Map resCancelPreOccupy(Map resParam) throws Exception, RemoteException;
	
	/**
	 * 需修改
	 * @Description: 资源的变更接口，完成从某个旧的资源变更到新的资源，旧的资源完成作废，新资源完成实占。应用于：补换卡等资源使用场景。
	 * @param:resParam 资源入参
	 * 参数说明：参数类型Map
	 * 		   key="resNewId" value类型：String 新资源ID
	 *         key="resNewCode" value类型：String 新资源编码
	 *         key="resSpecNewId" value类型：String 新资源规格
	 *         key="resOldId" value类型：String 旧资源ID
	 *         key="resOldCode" value类型：String 旧资源编码
	 *         key="resSpecOldId" value类型：String 旧资源规格
	 *         key="resRelId" value类型：String 关系资源ID
	 *         key="resRelCode" value类型：String 关系资源编码
	 *         key="resSpecRelId" value类型：String 关系资源规格
	 *         key="regionId" value类型：String 地区编号
	 *         key="orgId" value类型：long 组织编号
	 *         key="opId" value类型：long 操作员编号
	 * @return：返回结果描述
	 * 结果说明：返回结果为 Map
	 * 		   key="result" value类型：boolean 操作是否成功
	 * 		   key="message" value类型：String 操作结果信息
	 * @throws：异常描述
	 * 
	 */
	public Map resChange(Map resParam) throws Exception, RemoteException;
	
	/**
	 * 未实现
	 * @Description: 资源的状态变更接口，变更某类资源（号码、有价卡、终端、SIM卡）的状态。
	 * @param:resParam 资源入参
	 * 参数说明：参数类型Map
	 * 		   key="resId" value类型：String 资源ID
	 *         key="resCode" value类型：String 资源编码
	 *         key="resSpecId" value类型：String 资源规格
	 *         key="regionId" value类型：String 地区编号
	 *         key="orgId" value类型：long 组织编号
	 *         key="opId" value类型：long 操作员编号
	 * @return：返回结果描述
	 * 结果说明：返回结果为 Map
	 * 		   key="result" value类型：boolean 操作是否成功
	 * 		   key="message" value类型：String 操作结果信息
	 * @throws：异常描述
	 * 
	 */
	public Map resStateChange(Map resParam) throws Exception, RemoteException;
	
	
	/**
	 * 需修改
	 * @Description: 资源的出库接口，完成某类资源（有价卡、终端、号码、SIM卡）的出库处理。
	 * @param:resParam 资源入参
	 * 参数说明：参数类型Map
	 * 		   key="storeId" value类型：String 仓库编号
	 * 		   key="resId" value类型：String 新资源ID
	 *         key="resCode" value类型：String 新资源编码
	 *         key="resSpecId" value类型：String 新资源规格
	 *         key="regionId" value类型：String 地区编号
	 *         key="orgId" value类型：long 组织编号
	 *         key="opId" value类型：long 操作员编号
	 * @return：返回结果描述
	 * 结果说明：返回结果为 Map
	 * 		   key="result" value类型：boolean 操作是否成功
	 * 		   key="message" value类型：String 操作结果信息
	 * @throws：异常描述
	 * 
	 */
	public Map outInstStore(Map resParam) throws Exception, RemoteException;
	
	/**
	 * 需修改
	 * @Description: 资源库存数量查询，根据实物编号和归属仓库编号，查询实物库存信息【如果资源类型为积分实物，则必须在已经激活状态下才有库存】
	 * @param:resParam 资源入参
	 * 参数说明：参数类型Map
	 * 		   key="storeId" value类型：String 仓库编号
	 *         key="resSpecId" value类型：String 新资源规格
	 *         key="regionId" value类型：String 地区编号
	 *         key="orgId" value类型：long 组织编号
	 *         key="opId" value类型：long 操作员编号
	 * @return：返回结果描述
	 * 结果说明：返回结果为int
	 * @throws：异常描述
	 * 
	 */
	public int getStockCount(Map resParam) throws Exception, RemoteException;
	
	
	
	/**
	 * 根据资源型号获取资源明细信息
	 * 
	 * @param resSpecId
	 * @throws Exception
	 * @throws RemoteException
	 * @return Map 返回值存放如下
	 * ******************************************************************************
	 *   键值                     存放类型                           存放值的描述                     
	 *   RES_SPEC                IBOResSpecValue                   资源型号
	 *   RES_SPEC_SCORE          IBOResSpecScoreValue              积分实物型号对应的属性，如果取得的值为空，则不是积分类型
	 *******************************************************************************
	 * 积分实物特殊位
	 * 
	 * 可用兑换点：SYS_EXCHANGE_ADDR字段含义 1该位生效 0 失效
	 *  第一位  营业厅
     *  第二位  1860客服  
     *  第三位  代理商
     *  第四位  网上营业厅
     *  第五位  10086客服人工
     *  
     *  
     * 适用品牌：VALID_TRADEMARK字段含义 1该位生效 0 失效
     *  第一位  全球通
     *  第二位  神州行(金卡)
     *  第三位  神州行(智能网)
     *  第四位  动感地带
     *  第五位  神州行
	 * ******************************************************************************
	 */
	public Map getResSpecValue(String resSpecId) throws Exception, RemoteException;
	
	
	/**
	 * 根据实物编号和归属组织查询实物库存信息【如果资源类型为积分实物，则必须在已经激活状态下才有库存】
	 * 
	 * @param resId 实物编号
	 * @param orgId 归属组织
	 * @param opId  操作员 注：如果为空，不论实物是否支持发放到个人，查询结果返回组织库存数量
	 * @throws Exception
	 * @throws RemoteException
	 */
	public int getStockCount(String resId, String orgId, String opId) throws Exception, RemoteException;
	
	
	/**
     * 出库接口
     * @param orgId      组织编号
     * @param receiver   个人编号
     * @param resSpecId  实物编号
     * @param amount     出入库数量
     * @param operType     操作类型
     * @param targetTypeId  证件类型：1手机号 2身份证号 3客户编号
     * @param targetId      证件号码
     * @throws Exception
     * @throws RemoteException
     *
     */
    public IBOResInstanceValue outInstStore( String resSpecId, String orgId, String receiver, int amount, String operType, String targetTypeId, String targetId) throws Exception, RemoteException;
    
    /**
     * 根据手机号码获取已用的手机号码相关信息
     * @param billId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IBOResPhoneNumUsedValue getUsedPhoneNumInfo(String billId,String regionId) throws Exception,RemoteException;
    
    /**
     * 根据SIM卡号获取已用的Sim卡信息
     * 
     * @param iccId
     * @param regionId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IBOResSimCardUsedValue getUsedSimCardInfoByIccId(String iccId,String billId, String regionId) throws Exception, RemoteException;
    /**
	 * 根据IMIS获取已用的Sim卡信息
	 * 
	 * @param imis
	 * @param regionId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IBOResSimCardUsedValue getUsedSimCardInfoByImsi(String imsi, String regionId) throws Exception, RemoteException;
	
	/**
	 * 根据IMIS获取已用的Sim卡信息
	 * 
	 * @param imis
	 * @param regionId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IBOResSimCardUsedValue getAllUsedSimCardInfoByImsi(String imsi, String regionId) throws Exception, RemoteException;
	
	/**
     * SIM和号码校验
     * @param billId
     * @param simCardNo
     * @param regionId
     * @param orgId
     * @param opId
     * @return
     * @throws Exception
     * @throws RemoteException
     * @author huanghui
     */
    public boolean phoneSimCheck(String billId, String simCardNo,String regionId, long orgId,long opId) throws Exception, RemoteException;
    
    /**
	 * 备卡补换卡:作废旧的卡，预占新的卡
	 * 
	 * @param newSimCardNo
	 * @param oldSimCardNo
	 * @param orgId
	 * @param opId
	 * @param regionId
	 * @throws Exception
	 * @throws RemoteException
	 * @author huanghui
	 */
	public void backCardChange(String newSimCardNo, String oldSimCardNo, String regionId, long orgId, long opId) throws Exception, RemoteException;
	
	/**
     * 根据SIM卡号获取可用的SIM卡信息
     * @param simCardNo
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IBOResSimCardOriginValue getUnUsedSimCardInfo(String simCardNo, String regionCode) throws Exception,RemoteException;
    
    /**
   	 * 换号换卡
   	 * @author huanghui
   	 * @param billId
   	 * @param simcardNo
   	 * @param oldBillId
   	 * @param oldSimCardNo
   	 * @param orgId
   	 * @param opId
   	 * @param regionId
   	 * @throws Exception
   	 * @throws RemoteException
   	 */
   	public void changePhoneAndSim(String newBillId, String newSimCardNo,String oldBillId, String oldSimCardNo,String orderCode, String regionId, long orgId, long opId) throws Exception, RemoteException;
   	
   	/**
     * 取消预占固话号码
     *
     * @param billId  要取消预占的固话号码
     * @param regionId 操作人所在地市
     * @param orgId    操作人所在ORGID
     * @param opId     操作人ID
     * @return
     * @throws RemoteException
     * @throws Exception
     */
    public boolean cancelFixPhonePreOccupy(String billId, String regionId, long orgId, long opId) throws RemoteException, Exception;
    
    
	/**
	* @Description: SIM卡预占汇总,包含号码预占;备卡申请时，对传入的SIM卡做预占
	*
	* @param billId
	* @param simCardNo
	* @param specId
	* @param regionId
	* @param orgId
	* @param opId
	* @param flag 0根据手机号随机选一条SIM卡号并预占  1根据传入参数SIM卡号预占
	*                    2补换卡预占用,3备卡申请时，对传入的SIM卡做预占
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author:  MAJUN
	* @date: 2012-8-27 下午01:49:46 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-8-27      MAJUN           v1.0.0               修改原因
	 */
    public IBOResSimCardOriginValue simCardPreOccupy(String billId, String simCardNo, String specId, String regionId, long orgId, long opId, String flag) throws Exception,RemoteException;
 
    /**
	* @Description: 号码预占
	*
	* @param billId
	* @param certType
	* @param certNo
	* @param regionId
	* @param orgId
	* @param opId
	* @param tradeType 资源预占类型, 可参考ResConst.RES_LOCK_TYPE_.... 系列
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author:  MAJUN
	* @date: 2012-8-27 下午01:49:46 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-8-27      MAJUN           v1.0.0               修改原因
	 */
    public IBOResPhoneNumOriginValue phonePreOccupy(String billId,long certType,String certNo,String regionId,long orgId,long opId,String tradeType) throws Exception,RemoteException;
 
    /**
    * @Description: 根据REGION_ID、billId, 查找号码资源详细信息
    *
    * @param regionId
    * @param billId
    * @return
    * @throws Exception
    *
    * @version: v1.0.0
    * @author:  MAJUN
    * @date: 2012-8-28 下午03:38:27 
    *
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * 2012-8-28      MAJUN           v1.0.0               修改原因
     */
    public IBOResPhoneNumOriginValue queryOriginNum(String regionId, String billId)throws Exception, RemoteException;
    
    /**
     * 根据regionId（021）,证件类型和证件号码查询客户预占号码
     * @param regionId
     * @param certNo
     * @param certType
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IBOResPhoneNumOriginValue[] queryPreOccupyNums(String regionId, String certNo, String certType) throws Exception, RemoteException;
    /**
     * @Description: 根据BILL_ID查找号码HLR信息
     * @param billId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IBOResImsiNumSegmentValue getResNumberHlrByBillId(String billId)throws Exception,RemoteException;
    
    /**
     * 号码实占唯一接口  --- for Telenor 
     * @param billId
     * @param iccId
     * @param orderCode
     * @param regionId
     * @param opId
     * @param orgId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public boolean phoneNumOccupy(String billId, String iccId, String orderCode, String regionId, long opId, long orgId) throws Exception,RemoteException;
    
    /**   
   	 * @Function: com.asiainfo.crm.so.teaminvoke.in.service.interfaces.IRes2CrmSV.afterDefineCardsReSall
   	 * @Description: 后定卡换卡销售
   	 *
   	 * @param: cardNo,cardFee,cardType,orgId,opId
   	 * @return：void
   	 * @throws：Exception
   	 *
   	 * @version: v1.0.0
   	 * @author: zhouwu
   	 * @date: Aug 20, 2012 1:48:36 PM  
   	 *
   	 * Modification History:
   	 * Date         Author          Version            Description
   	 *-------------------------------------------------------------*
   	 * Aug 20, 2012      zhouwu           v1.0.0               修改原因
   	 */
   	public void afterDefineCardsReSall(String newCardNo, String oldCardNo, long cardFee,String resSpecId, String regionId, long orgId ,long opId) throws Exception;

    /**   
     * @Function: com.asiainfo.crm.so.teaminvoke.in.service.interfaces.IRes2CrmSV.afterDefineCardsSall
     * @Description: 后定义卡销售
     *
     * @param: cardNo,cardFee,cardType,orgId,opId
     * @return：void
     * @throws：Exception
     *
     * @version: v1.0.0
     * @author: zhouwu
     * @date: Aug 20, 2012 1:47:17 PM  
     *
     * Modification History:
     * Date         Author          Version            Description
     *-------------------------------------------------------------*
     */
    public void afterDefineCardsSall(String cardNo, long cardFee,String resSpecId,String regionId,long orgId ,long opId) throws Exception;
	
   	/**
   	 * 号码回收
   	 * @author huanghui
   	 * @param billId
   	 * @param regionId
   	 * @param orgId
   	 * @param opId
   	 * @throws Exception
   	 * @throws RemoteException
   	 */
   	public void occupiedPhoneNumRollBack(String billId, String regionId, long orgId, long opId) throws Exception;
    
   	/**
   	* @Function: isAvailableForSale
   	* @Description: 查询终端是否可以销售
   	*
   	* @param:imei  终端号、regionId 地市、 orgId 营业员组织ID 、 opId 、营业员操作ID
   	* @return：
   	* @throws：异常描述
   	*
   	* @version: v1.0.0
   	* @author: liuke
   	* @date: 2012-9-13 上午10:39:42  
   	*
   	* Modification History:
   	* Date         Author          Version            Description
   	*---------------------------------------------------------*
   	* 2012-9-13      liuke           v1.0.0               修改原因
   	 */
	public IBOResTerminalOriginValue isAvailableForSale(String imei,String regionId,long orgId, long opId) throws Exception, RemoteException;
	
	/**
   	* @Function: terminalPreOccupy
   	* @Description: 终端预占
   	*
   	* @param:imei  终端号、regionId 地市、 orgId 营业员组织ID 、 opId 、营业员操作ID
   	* @return：
   	* @throws：异常描述
   	*
   	* @version: v1.0.0
   	* @author: liuke
   	* @date: 2012-9-13 上午10:40:42  
   	*
   	* Modification History:
   	* Date         Author          Version            Description
   	*---------------------------------------------------------*
   	* 2012-9-13      liuke           v1.0.0               修改原因
   	 */
	public IBOResTerminalOriginValue terminalPreOccupy(String imei,String regionId,long orgId, long opId) throws Exception, RemoteException;
	
	/**
   	* @Function: terminalOutStore
   	* @Description: 终端出库
   	*
   	* @param:imei  终端号、regionId 地市、 orgId 营业员组织ID 、 opId 、营业员操作ID
   	* @return：
   	* @throws：异常描述
   	*
   	* @version: v1.0.0
   	* @author: liuke
   	* @date: 2012-9-13 上午10:40:42  
   	*
   	* Modification History:
   	* Date         Author          Version            Description
   	*---------------------------------------------------------*
   	* 2012-9-13      liuke           v1.0.0               修改原因
   	 */
	public IBOResTerminalOriginValue terminalOutStore(String imei,String regionId,long orgId, long opId) throws Exception, RemoteException;
	
	/**
   	* @Function: terminalOutStore
   	* @Description: 终端出库返销接口
   	*
   	* @param:imei  终端号、regionId 地市、 orgId 营业员组织ID 、 opId 、营业员操作ID
   	* @return：
   	* @throws：异常描述
   	*
   	* @version: v1.0.0
   	* @author: liuke
   	* @date: 2012-9-13 上午10:40:42  
   	*
   	* Modification History:
   	* Date         Author          Version            Description
   	*---------------------------------------------------------*
   	* 2012-9-13      liuke           v1.0.0               修改原因
   	 */
	public IBOResTerminalOriginValue terminalSellBack(String imei,String regionId,long orgId, long opId) throws Exception, RemoteException;
	/**
	* @Description: 号码重入网预占接口
	*
	* @param billId
	* @param certType
	* @param certNo
	* @param regionId
	* @param orgId
	* @param opId
	* @param tradeType 资源预占类型, 可参考ResConst.RES_LOCK_TYPE_.... 系列
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author:  lizhaoqing
	* @date: 2012-9-25 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-9-25      lizhaoqing           v1.0.0               修改原因
	 */
	public IBOResPhoneNumUsedValue[] phoneNumAgain(String billId, String certType, String certNo, String regionId, long orgId, long opId) throws Exception,RemoteException;
	
	/**
	* @Description: 号码重入网  接口
	*
	* @param billId
	* @param certType
	* @param certNo 
	* @param regionId
	* @param orgId
	* @param opId
	* @param tradeType 资源预占类型, 可参考ResConst.RES_LOCK_TYPE_.... 系列
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author:  lizhaoqing
	* @date: 2012-9-25 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-9-25      lizhaoqing           v1.0.0               修改原因
	 */
	public boolean usePhoneNumAgain(String billId, String iccId, String regionId, long orgId, long opId, Map inputMap) throws Exception,RemoteException;
	
	/**   
	* @Function: phoneNumDisuse
	* @Description: 销户后,调用资源接口,对号码进行冷冻
	*
	* @param:
	* @return：
	* @throws：
	*
	* @version: v1.0.0
	* @author: xiaozhibi
	* @date: 2012-9-25下午08:52:41 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-9-25      xiaozhibi           v1.0.0               修改原因
	*/
	public void phoneNumDisuse(String billId, String regionId, long orgId, long opId) throws Exception, RemoteException;

	/**   
	 * @Function: getGsmHlrInfoCounts
	 * @Description: 号码归属信息查询记录数接口
	 *
	 * @param:
	 * @return：
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: zhouwu
	 * @date: Sep 27, 2012 3:23:30 PM  
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Sep 27, 2012      zhouwu           v1.0.0               修改原因
	 */
	public int getGsmHlrInfoCounts( String hlrCode, String regionCode, String areaCode, String provCode,String bureauCode,String hlrType) throws Exception, RemoteException;
	
	/**   
	 * @Function: getGsmHlrInfoValue
	 * @Description: 号码归属信息查询接口
	 *
	 * @param:
	 * @return：
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: zhouwu
	 * @date: Sep 27, 2012 3:26:09 PM  
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Sep 27, 2012      zhouwu           v1.0.0               修改原因
	 */
	public IBOGsmHlrInfoValue[] getGsmHlrInfoValue(String hlrCode, String regionCode, String areaCode, String provCode,String bureauCode,String hlrType, int start, int end) throws Exception, RemoteException;
	
	/**   
	* @Function: setSimCardFrozen
	* @Description: 销户之后，冷冻sim卡
	*
	* @param:
	* @return：
	* @throws：
	*
	* @version: v1.0.0
	* @author: xiaozhibi
	* @date: 2012-10-4下午07:11:05 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-10-4      xiaozhibi           v1.0.0               修改原因
	*/
	public boolean setSimCardFrozen(String iccId,String billId, String regionId, long orgId, long opId) throws Exception;
	
	/**
	 * @description 预销户重入网：修改SIM卡状态从6 改成 5 --- for Telenor
	 * 
	 * @param
	 * @param
	 * @throws Exception
	 * 2015-08-10 16:01
	 */
	public boolean setSimCardFrozenUseAble(String iccId, String oldBillId, String newBillId, String regionId, long orgId, long opId) throws Exception;
	
	 /**
	  * * author zhujiang2 
	 	 * @description  开户撤单将卡入未使用表
	 	 * 
	 	 * @param 
	 	 * @param  
	 	 * @throws Exception
	  */
	public boolean cancelUsedCard(String iccId,String billId,String regionId,long orgId,long opId) throws Exception;
	
	/**
	 * 号码查询
	 * @param resId  服务号码
	 * @param regionId  地区编码
	 * @param secOrgId  组织ID
	 * @return IBOResPhoneNumOriginValue
	 * @author huanghui
	*/
	public IBOResPhoneNumOriginValue queryPhoneNums(String regionId,String resId,long secOrgId) throws Exception;
	


	
	
	/**   
	 * @Function: writeEmptySimCard
	 * @Description: CRM模块调用资源入库接口，且预占
	 *
	 * @param:
	 * @return：
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author:  huanghui
	 * @date: Sep 27, 2012 3:26:09 PM  
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Sep 27, 2012      huanghui           v1.0.0               修改原因
	 */
	//public boolean writeEmptySimCard(String billId,String regionId,String snNumber,String iccID,String imsi,String pin1,String puk1,String ki,String encKi, String main_flag, String m_icc_id )
	 public boolean writeEmptySimCard(long orgId,long opId,String billId,String regionId,String snNumber,String iccID,String imsi,String pin1,String puk1,String ki,String encKi,String main_flag,String m_icc_id)throws Exception;
	 
	 /**
	 * @Function: queryPayCardInfo
	 * @Description: 查询有价卡信息
	 *
	 * @param:payCardId 有价卡卡号
	 * @return：
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: liuke
	 * @date: 2012-10-9 下午04:47:16  
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2012-10-9      liuke           v1.0.0               修改原因
	  */
	 public IBOResPayCardValue queryPayCardInfo(String payCardId,long opId,long orgId,String regionId)throws Exception,RemoteException;
		 
	 /**
	 * @Function: checkPayCardCanSale
	 * @Description: 校验有价卡是否可以销售
	 *
	 * @param:payCardId 有价卡卡号
	 * @return：
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: liuke
	 * @date: 2012-10-9 下午04:47:16  
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2012-10-9      liuke           v1.0.0               修改原因
	  */
	 public boolean checkPayCardCanSale(String payCardId,long opId,long orgId,String regionId)throws Exception,RemoteException;
	 
	 /**
	 * @Function: payCardOccupy
	 * @Description: 有卡卡实占
	 *
	 * @param:payCardId 有价卡卡号 
	 * @return：
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: liuke
	 * @date: 2012-10-9 下午04:47:16  
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2012-10-9      liuke           v1.0.0               修改原因
	  */
	 public void payCardOccupy(String payCardId,long opId,long orgId,String regionId)throws Exception,RemoteException;
	 
	 /**
	 * @Function: payCardUsedRollBack
	 * @Description: 有价卡实占返销
	 *
	 * @param:payCardId 有价卡实占返销
	 * @return：
	 * @throws：异常描述
	 * @version: v1.0.0
	 * @date: 2012-10-9 下午04:47:16  
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 */
	 public void payCardUsedRollBack(String payCardId,String xMode ,long opId,long orgId,String regionId)throws Exception,RemoteException;
	 
	 /**
	  * 
	 * @Function: phoneNumInTransit 
	 * @Description: 号码在途
	 *
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: fangyl
	 * @date: Oct 11, 2012 2:05:55 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Oct 11, 2012     fangyl           v1.0.0               修改原因
	  */
	 public void phoneNumInTransit(String billId, String regionId, long opId,
			long orgId, String tradeType) throws Exception, RemoteException;

    /**
     * 预占一张Wlan电子卡   <br/>
     *
     *   20001：WLAN包单位时间资费包小时  <br/>
     *   20002：WLAN包单位时间资费包天  <br/>
     *   20003：WLAN包单位时间资费包周   <br/>
     *   20004：WLAN包单位时间资费包月   <br/>
     *   30001：WLAN包时长资费30元/15小时 <br/>
     *   30002：WLAN包时长资费50元/40小时  <br/>
     *   30003：WLAN包时长资费100元/200小时 <br/>
     *
     *  added by caiwm    <br/>
     *
     * @param resSpecId Wlan电子卡规格编码
     * @param time 预占时间
     * @return Wlan电子卡资源
     * @throws Exception
     * @throws RemoteException
     */
    public IBOResPayCardValue getWLANCardInfoByResSpecId(String resSpecId, long time) throws Exception, RemoteException;
    
    /**
     * @Function: 根据资源编码查询资源相关信息 ：如 机型、厂商等信息
     * @Description: queryResCodeInfo
     *
     * @param:
     * @return：返回值为hashMap
				"RES_SPEC_ID"：资源编码
				"RES_SPEC_NAME":资源型号名称
				"PARTNER_ID"：厂商编码
				"PARTNER_NAME"：厂商名称
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: liuke
     * @date: 2012-10-17 下午04:44:27  
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2012-10-17      liuke           v1.0.0               修改原因
      */
     public HashMap queryResCodeInfo(String resCode)throws Exception,RemoteException;
     
     /**
     * @Function: queryResPartner
     * @Description: 查询资源的平台商
     *
     * @param:
     * @return：
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: liuke
     * @date: 2012-10-19 下午07:16:38  
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2012-10-19      liuke           v1.0.0               修改原因
      */
     public IBOResPartnerValue[] queryResPartner()throws Exception,RemoteException;
     
     /**
     * @Function: queryTemPartnerRelValues
     * @Description: 根据平台商查询机型信息
     *
     * @param:
     * @return：
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: liuke
     * @date: 2012-10-19 下午07:18:01  
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2012-10-19      liuke           v1.0.0               修改原因
      */
     public DataContainer[] queryTemPartnerRelValues(String partnerId,String regionId)throws Exception,RemoteException;

     /**
      * @Function: checkPhoneNumRule
      * @Description: 判断手机号码是否是吉祥号码
      *
      * @param:
      * @return：
      * @throws：异常描述
      *
      * @version: v1.0.0
      * @author: lipj
      * @date: 2012-10-25 下午08:18:01  
      *
      * Modification History:
      * Date         Author          Version            Description
      *---------------------------------------------------------*
      * 2012-10-25      lipj           v1.0.0               修改原因
       */
     public IBOResPatternAllRuleValue checkPhoneNumRule(String billId, String regionId)throws Exception,RemoteException;
     
     /**
      * 
      * 获取开户或SIM卡的开户费用
      *
      * @author anwx@asiainfo-linkage.com @ 2012-11-10
      * 
      * @param resId
      * @param resTypeId
      * @param regionId
      * @return
      * @throws Exception
      * @throws RemoteException
      *
      */
     public IBOResPhoneNumAgentPrepayValue[] getResPrepayByResId(String resId, long resTypeId, String regionId) throws Exception, RemoteException;
     
     /**
      * 开户时，代理商订购明细状态改变
      *
      * @author anwx@asiainfo-linkage.com @ 2012-11-19
      * 
      * @param resId
      * @param resTypeId
      * @param regionId
      * @return
      * @throws Exception
      * @throws RemoteException
      *
      */
     public void openPhoneNumToUpdate(IOVOrderCustomer aOVOrderCustomer) throws Exception, RemoteException;
     
     /**
      * @Function: operRegionEmptyCardToUserRegion
      * @Description: 异地补换卡、携号补换卡   空卡移库接口
      *
      * @param: String sn           空卡序列号
      * @param: String opRegionId	操作员归属REGION_ID
      * @param: String numRegionId  用户实例归属REGION_ID
      * @param: String opId			操作员操作ID
      * @param: String orgId		操作员登录组织ID
      * @return:
      * @throws:异常描述
      *
      * @version: 	v1.0.0
      * @author: 	huanghui@asiainfo-linkage.com
      * @date: 		2012-11-19 下午09:18:01  
      *
      * Modification History:
      * Date         Author          Version            Description
      *---------------------------------------------------------*
      * 2012-11-19   huanghui           v1.0.0               修改原因
       */
     public void operRegionEmptyCardToUserRegion(String sn, String opRegionId, String numRegionId, long opId, long orgId)throws Exception,RemoteException;
     
     
     /**
      * @Description: 号码激活时，渠道商订购明细状态改变
      *
      * @param resId
      * @param orgId
      * @param regionId
      * @param openFee
      * @param offerId
      * @throws Exception
      * @throws RemoteException
      *
      * @version: v1.0.0
      * @author:  MAJUN
      * @date: 2012-11-21 上午10:06:07 
      *
      * Modification History:
      * Date         Author          Version            Description
      *---------------------------------------------------------*
      * 2012-11-21      MAJUN           v1.0.0               修改原因
       */
       public void activePhoneNumToUpdate(String resId, String orgId, String regionId, long openFee, long offerId) throws Exception, RemoteException;
      
       /**
        * 
        * 根据卡规格编码查询卡规格信息
        *
        * @author anwx@asiainfo-linkage.com @ 2012-11-25
        * 
        * @param resSpecId
        * @throws Exception
        * @throws RemoteException
        * @throws Exception
        *
        */
       public IBOResSpecValue getResSpecByResSpecId(String resSpecId) throws Exception, RemoteException, Exception;
       
       /**
        * 
        * SIM卡预占接口，会返回SIM卡信息及卡规格信息
        *
        * @author anwx@asiainfo-linkage.com @ 2012-11-25
        * 
        * @param billId
        * @param iccId
        * @param specId
        * @param regionId
        * @param orgId
        * @param opId
        * @param xMode
        * @return
        * @throws Exception
        * @throws RemoteException
        *
        */
       public HashMap simCardPreOccupyNew(String billId, String iccId, String specId, String regionId, long orgId, long opId, String xMode) throws Exception, RemoteException;
       
       /**
       * @Function: terminalOutStoreNew
       * @Description: 活动受理新终端出库方法，传递详细终端信息，资源上发终端信息到集团
       *
       * @param:
       * map中需要传入的参数以及对应的key 
       * OrderFlag 是否将终端信息上发到集团 不等“0”代表上发
       * Imei--终端imei，DepositFee--客户预存话费，CompensateFee--客户实际购机款
       * ContractType-客户捆绑合约类型，01：全网统一预存购机 02：全网统一购机送费 03：本地购机优惠 目前无法区分可以先传入01
       * ConsumeLimit--客户承诺月最低消费 可空    ContractDuration--合约捆绑时长 可空
       * PromotionType--客户绑定营销案类型  1：全网统一营销方案  2：省公司自定  目前由于产品无法区分，可以传入2
       * PromotionCode--客户绑定营销案编码     MobileNo--捆绑号码
       * @return：
       * @throws：异常描述
       *
       * @version: v1.0.0
       * @author: liuke
       * @date: 2012-11-27 下午07:38:20  
       *
       * Modification History:
       * Date         Author          Version            Description
       *---------------------------------------------------------*
       * 2012-11-27      liuke           v1.0.0               修改原因
        */
       public void terminalOutStoreNew(HashMap paraMap)throws Exception,RemoteException;
       
       /**
       * @Function: terminalExchange
       * @Description: 新终端换机接口
       *
       * @param:oldimei  原IMEI；newImei 新终端IMEI，orderFlag 是否将终端信息上发到集团 不等“0”代表上发
       * @return：
       * @throws：异常描述
       *
       * @version: v1.0.0
       * @author: liuke
       * @date: 2012-11-27 下午07:43:18  
       *
       * Modification History:
       * Date         Author          Version            Description
       *---------------------------------------------------------*
       * 2012-11-27      liuke           v1.0.0               修改原因
        */
       public void terminalExchange(String oldimei,String newImei,
    		   String regionId, long orgId, long opId,String orderFlag)throws Exception,RemoteException;
       
       /**
       * @Function: terminalBackMachine
       * @Description: 新终端退机接口
       *
       * @param:imei 终端IMEI信息 orderFlag是否将终端信息上发到集团 不等“0”代表上发
       * @return：
       * @throws：异常描述
       *
       * @version: v1.0.0
       * @author: liuke
       * @date: 2012-11-27 下午07:44:53  
       *
       * Modification History:
       * Date         Author          Version            Description
       *---------------------------------------------------------*
       * 2012-11-27      liuke           v1.0.0               修改原因
        */
       public void terminalBackMachine(String imei,String orderFlag)throws Exception,RemoteException;
       
       /**
       * @Function: getSimCardInfoBySN
       * @Description: 成品SIM卡查询(根据空卡序列号和REGION_ID,查询出已经写卡入库、且并未使用且的SIM卡资源)
       *
       * @param:snNumber 空卡序列号
       * @param:regionId BILL_ID对应的REGION_ID
       * @return：DataStructInterface
       * @throws：异常描述
       *
       * @version: v1.0.0
       * @author: huanghui@asiainfo-linkage.com
       * @date: 2012-11-30 下午07:44:53  
       *
       * Modification History:
       * Date         Author          Version            Description
       *---------------------------------------------------------*
       * 2012-11-30     huanghui           v1.0.0               修改原因
        */
       public IBOResSimCardOriginValue getSimCardInfoBySN (String snNumber,String regionId,String xGetMode) throws Exception,RemoteException;
     
       /**
       * @Function: getSimCardInfoByIccId
       * @Description: 成品SIM卡查询
       *
       * @param:
       * @param:
       * @return：
       * @throws：异常描述
       *
       * @version: v1.0.0
       * @author: huanghui@asiainfo-linkage.com
       * @date: 2012-11-30 下午07:44:53  
       *
       * Modification History:
       * Date         Author          Version            Description
       *---------------------------------------------------------*
       * 2012-11-30     huanghui           v1.0.0               修改原因
        */
       public DataStructInterface getSimCardInfoByIccId (String iccId, String regioinId, long orgId, long opId) throws Exception,RemoteException;
       
       /**
        * @Function: qryResSpecValue
        * @Description: 根据资源型号查询资源型号明细信息
        *
        * @param:
        * @param:
        * @return：
        * @throws：异常描述
        *
        * @version: v1.0.0
        * @author: huanghui@asiainfo-linkage.com
        * @date: 2012-11-30 下午07:44:53  
        *
        * Modification History:
        * Date         Author          Version            Description
        *---------------------------------------------------------*
        * 2012-11-30     huanghui           v1.0.0               修改原因
         */
       public IBOResSpecValue qryResSpecValue(String resSpecId) throws Exception,RemoteException;
       
       /**
        * @Function: getPartnerAndFeeType
        * @Description: 根据终端资源编码 获取是否存在代销商合作伙伴及扣款方式
        *
        * @param:
        * @return：
        * @throws：异常描述
        *
        * @version: v1.0.0
        * @author: liuke
        * @date: 2012-12-1 下午11:42:36  
        *
        * Modification History:
        * Date         Author          Version            Description
        *---------------------------------------------------------*
        * 2012-12-1      liuke           v1.0.0               修改原因
         */
        public  HashMap getPartnerAndFeeType(String resCode,String regionId)throws Exception,RemoteException;
        
        /**
         * 
         * simCode即有可能是SIM卡号也可能是空卡序列号
         * 查询SIM卡信息并判断是否可以做携卡入网
         *
         * @author anwx@asiainfo-linkage.com @ 2012-12-19
         * 
         * @param simCode
         * @return
         * @throws Exception
         * @throws RemoteException
         *
         */
        public HashMap checkSimCardCanXKWR(String simCode, String regionId) throws Exception, RemoteException;
        
        /**
         * 根据sn查sim卡已用表信息
         *
         * @author anwx@asiainfo-linkage.com @ 2012-12-19
         * 
         * @return
         * @throws Exception
         * @throws RemoteException
         *
         */
        public IBOResSimCardUsedValue getUsedSimCardInfoBySn(String sn) throws Exception, RemoteException;
        
        public IBOResSimCardUsedValue getUsedSimCardInfoByIccIdNew(String iccId,String billId, String regionId) throws Exception, RemoteException;
        
        /**
        * @Description: 更新已用号码SIM卡信息
        *
        * @param billId
        * @param newSimCardNo
        * @param regionId
        * @param orgId
        * @param opId
        * @param flag
        * @throws Exception
        * @throws RemoteException
        *
        * @version: v1.0.0
        * @author:  MAJUN
        * @date: 2012-12-20 下午11:59:49 
        *
        * Modification History:
        * Date         Author          Version            Description
        *---------------------------------------------------------*
        * 2012-12-20      MAJUN           v1.0.0               修改原因
         */
    	public void updateUsedPhoneInfo(String billId, String newSimCardNo, String regionId, long orgId, long opId, String flag) throws Exception, RemoteException;
    	
    	/**
         * @Description: 终端返销借口【调用此接口后，终端还能销售，终端状态manage_status为3，res_status为1完好】
         *
         * @param imei
         * @param regionId
         * @param orgId
         * @param opId
         * @throws Exception
         * @throws RemoteException
         *
         * @version: v1.0.0
         * @author:  MAJUN
         * @date: 2012-12-26 上午10:05:17 
         *
         * Modification History:
         * Date         Author          Version            Description
         *---------------------------------------------------------*
         * 2012-12-26      MAJUN           v1.0.0               修改原因
          */
         public IBOResTerminalOriginValue terminalSalesBack(String imei,String regionId, long orgId, long opId) throws Exception,RemoteException;
         
         public IBOResPhoneNumOriginValue phonePreOccupyWithIccID(String billId,long certType, String certNo, String regionId,String iccid, long orgId,long opId, String tradeType) throws Exception, RemoteException;
         
         /**   
          * @Function: getResOrderInfoByOrderId
          * @Description: 根据资源订单号获取订单信息
          *
          * @param:
          * @return：
          * @throws：异常描述
          *
          * @version: v1.0.0
          * @author: zhouwu
          * @date: Dec 26, 2012 7:32:51 PM  
          *
          * Modification History:
          * Date         Author          Version            Description
          *---------------------------------------------------------*
          * Dec 26, 2012      zhouwu           v1.0.0               修改原因
          */
         public IBOResOperOrderTerminalValue getResOrderInfoByOrderId(String orderId)throws Exception,RemoteException;
         
         /**
          * 
         * @Function: 	reSetEmptySimCard
         * @Description: SIM卡空白卡重置接口
         *
         * @param:	snNumber 空卡序列号
         * @param:	regionId 地市ID
         * @param:	orgId 组织ID
         * @param:	opId 操作员ID
         * @return：
         * @throws：异常描述
         *
         * @version: v1.0.0
         * @author: huanghui@asiainfo-linkage.com
         * @date: 2013-1-10 下午4:21:34  
         *
         * Modification History:
         * Date         Author          Version            Description
         *---------------------------------------------------------*
         * 2013-1-10      huanghui        v1.0.0               修改原因
          */
         public boolean reSetEmptySimCard (String snNumber, String regionId, long orgId, long opId) throws Exception,RemoteException;
         
         
         public DataContainerInterface getUsedTemiInfoByImei(String imei,String manageStatus) throws Exception, RemoteException ;
         
         public Map getTemiInfoByImei(Map map )throws Exception,RemoteException;
         
     /**
      * 判断是否NP号码
      * @Function checkIsNPNum
      * @Description 
      *
      * @param billId
      * @return
      * @throws Exception
      *
      * @version v1.0.0
      * @author wangxw3
      * @date 2014-11-24 下午08:18:38
      */
     public boolean checkIsNPNum(String billId) throws Exception;
     
     /**
      * 判断是否反悔销户的NP号码
      * @Function checkIsReImportNPNum
      * @Description 
      *
      * @param billId
      * @return
      * @throws Exception
      *
      * @version v1.0.0
      * @author wangxw3
      * @date 2014-11-24 下午08:18:38
      */
     public boolean checkIsReImportNPNum(String billId) throws Exception ;
     
     /**
      * 标记反悔NP号码状态为reimport
      * @Function setPortStatus
      * @Description 
      *
      * @param billId
      * @return
      * @throws Exception
      *
      * @version v1.0.0
      * @author wangxw3
      * @date 2014-11-27 下午08:18:38
      */
     public void setPortStatus(String billId) throws Exception;
     
     /**
      * 查询NP流程是否结束
      * @Function isNPFinish
      * @Description 
      *
      * @param billId
      * @param imeiNo
      * @return
      * @throws Exception
      *
      * @version v1.0.0
      * @author wangxw3
      * @date 2014-11-30 上午10:56:32
      * 
      * Modification History:
      * Date         Author          Version            Description
      * ---------------------------------------------------------*
      * 2014-11-30     wangxw3           v1.0.0               修改原因
      */
     public boolean isNPFinish(String billId, String imeiNo) throws Exception;
     /**
      * 根据leading number 查询其下面的number range信息
      * @param leadingNum
      * @return
      * @throws Exception
      * @throws RemoteException
      * @author zhangzy3
      */
     public IQBOCorporateNumberMgrValue[] getNumRangeByLeadingNum(String leadingNum)throws Exception,RemoteException;


	public List<String> getPhoneNumberByLeadingNum(String leadingNumber) throws Exception;
	public String getLeadingNumberByPhoneNum(String contents) throws Exception;
	/**
     * 根据leading number 查询其下面的未使用号码
     * @param  leadingNum,  custId,  portStatus,  manageStatus
     * @return
     * @throws Exception
     * @throws RemoteException
     * @author zhangzy3
     */
	public List<String> getOriginPhoneNumberByLeadingNum(String leadingNum, String custId, String portStatus, String manageStatus) throws Exception;
	
	/**
	 * 新的根据leadingnum查询号段方法，区分号段内和号段外两种情况的放回
		* @Function:  
		* @Description: 
		* @param:
		* @return：IQBOCorporateNumberMgrValue[]
		* @throws：
		* @version: v1.0.0
		* @author: xxz
		* @date: 2016-6-8
	 */
	public IQBOCorporateNumberMgrValue[] getNumRangeByLeadingNumNew(String leadingNum)throws Exception,RemoteException;
	
	/**
	 * 	号码段中有号码携出，修改其他号码的digital_tag字段
	 * @param digitalTag	
	 * @param billId		携出的号码
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void modifyDigitalTag(String digitalTag,String billId) throws Exception,RemoteException;
}
