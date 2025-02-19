package com.asiainfo.crm.res.teaminvoke.out.service.interfaces;

import java.rmi.RemoteException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataStructInterface;
import com.asiainfo.crm.res.phone.ivalues.IBOResLeadingNumberValue;
import com.asiainfo.crm.res.phone.ivalues.IBOResPhoneNumAgentPrepayValue;
import com.asiainfo.crm.res.phone.ivalues.IBOResPhoneNumOriginValue;
import com.asiainfo.crm.res.phone.ivalues.IBOResPhoneNumUsedValue;
import com.asiainfo.crm.res.phone.ivalues.IBOResSelNumCustLogValue;
import com.asiainfo.crm.res.rescfg.ivalues.IBOGsmHlrInfoValue;
import com.asiainfo.crm.res.rescfg.ivalues.IBOResAccessNumOriginValue;
import com.asiainfo.crm.res.rescfg.ivalues.IBOResImsiNumSegmentValue;
import com.asiainfo.crm.res.rescfg.ivalues.IBOResNumberHlrValue;
import com.asiainfo.crm.res.rescfg.ivalues.IBOResPatternAllRuleValue;
import com.asiainfo.crm.res.rescfg.ivalues.IBOResPhonePartnerValue;
import com.asiainfo.crm.res.rescfg.ivalues.IBOResViaplayVoucherValue;
import com.asiainfo.crm.res.simcard.ivalues.IBOResSimCardOriginValue;
import com.asiainfo.crm.res.simcard.ivalues.IBOResSimCardUsedValue;

/**   
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: IRes2InterFSV.java
 * @Description: 提供对外服务接口
 *
 * @version: v1.0.0
 * @author: xurui
 * @date: 2011-3-21 下午07:09:55 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2011-3-21     xurui           v1.0.0               修改原因
 */

public interface IRes2InterFSV {
	
	/*---------------------------------------------------号码对外接口汇总 BEG------------------------------------------------------*/

	/**
	 * 获取资源类型
	 * @param resSpecId	资源型号
	 * @return String
	*/
	public String getResTypeByResSpecId(long resSpecId) throws Exception, RemoteException;

	/**
	 * 给OSE的网上选号接口  --- for Telenor OSE
	 * @param inputMap
	 * 参数说明：参数类型Map
	 * 		key="resType" value类型：String 号码大类（Type）  ResConst.RES_TYPE_GSM_NUM(1000移网)、					（*必填）***********
	 * 													    ResConst.RES_TYPE_FIX_NUM(1001固网)						
	 *      key="useRange" value类型：String 号段类型：	ResConst.PHNOE_USE_RANGE_B2C（1.B2C号码）、
	 *      											ResConst.PHONE_USE_RANGE_B2B（2.B2B号码）					（*必填）***********
	 *      key="resSpecId" value类型：String 号码规格
	 * 		key="orgId" value类型：String 操作员组织
	 * 		key="opId" value类型：String 操作员
	 * 		key="chooseType" value类型：String 选号方式：1.随机, 2.按查询条件来
	 * 		key="numType" value类型：String 号码：可以模糊查询、如果是包含“_”就是通配符选号，但是号码长度要满足
	 * 											通配符'*': 任意长度的字符窜，比如22* = '22'开头的字符窜，*22 = '22'结尾的字符窜；
	 * 											通配符'?': 长度为1的字符，比如 22?22 = 22x22, ??222 = xx222；
	 * 
	 * 		key="begMSISDN" value类型：String 开始号码 查询号码段使用 
	 * 		key="endMSISDN" value类型：String 结束号码 查询号码段使用 
	 * 		key="chooseLevel" value类型：String 是否优选号码：0普通号码、1优选号码
	 * 		key="resLevel" value类型：String 号码档次：目前0、1、2、3 档
	 * 		key="selectMode" value类型：String 选号费模式：对应AABB、AAAA、ABAB的编号
	 * 		key="numCount" value类型：String 需要号码数量	，如果是客户购买号段 ，则必填
	 * 		key="certType" value类型：String 证件类型：如果有证件类型，则是标准的。OSE目前只有30和1000 两种				（*必填）***********
	 * 												     如果只有custId则证件类型为 ResConst.CM_CERT_TYPE_1000;
	 * 		key="certNo" value类型：String 证件编号、客户编号、等客户唯一标识											（*必填）***********
	 * 		key="reserveType" value类型：String 预占类型  ResConst.RES_LOCK_TYPE_5 : 5——号码查询预占 					（*必填）***********
	 * 		key="startIndex" value类型：String 分页用开始编号
	 * 		key="endIndex" value类型：String 分页用结束编号
	 *      key="numberList" value类型：List 过滤不需要的号码
	 * 
	 * 接口说明： 重要，请仔细阅读
	 *		如果resType=1000，useRange=1，后台固定查询RES_SPEC_Id=100001的B2C移网号码
	 *		如果resType=1001，useRange=1，后台固定查询RES_SPEC_Id=100101的B2C固网号码
	 * 		如果resType=1000，useRange=2，后台 查询符合条件 的B2C移网号码
	 * 		如果resType=1001，useRange=2，后台 查询符合条件 的B2C固网号码
	 * 		如果useRange=2展示号码段，查询条件只需要numCount，其他resId、chooseLevel、resLevel、selectMode都不做为查询条件了。
	 * 
	 * 出参包含：
	 * resType = values[i].getExtAttr("resType")  号码大类：(1000移网)、(1001固网)
	 * 
	 * @return
	 * @throws Exception
	 * @author res_team
	 * @createDate 2014-9-17下午7:13:47
	 */
	public IBOResPhoneNumOriginValue[] queryNumForNetWork(Map inputMap) throws Exception;
	
	
	/**
	 * 获取可选号码，并且“直接”预占。  --- for Telenor FIXED
	 * 1.前台营业页面的 NP 业务。2.多卡多号选号业务
	 * @param inputMap
	 * 参数说明：参数类型Map
	 * 		key="resType" value类型：String 号码大类   ResConst.RES_TYPE_GSM_NUM(1000移网)、 ResConst.RES_TYPE_FIX_NUM(1001固网) （*必填）***********
	 * 		key="resSpecId" value类型：String 具体的号码规格 （*选填）***********
	 * 		key="orgId" value类型：String 操作员组织
	 * 		key="opId" value类型：String 操作员
	 * 		key="chooseType" value类型：String 选号方式：1.随机, 2.按查询条件来
	 * 		key="resId" value类型：String 号码：可以模糊查询、如果是包含“_”就是通配符选号，但是号码长度要满足
	 * 		key="begMSISDN" value类型：String 开始号码 查询号码段使用。
	 * 		key="endMSISDN" value类型：String 结束号码
	 * 		key="chooseLevel" value类型：String 是否优选号码：0普通号码、1优选号码
	 * 		key="resLevel" value类型：String 号码档次：目前0、1、2、3 档
	 * 		key="selectMode" value类型：String 选号费模式：对应AABB的编号
	 * 		key="numCount" value类型：String 需要号码数量 
	 * 		key="certType" value类型：String 证件类型：如果有证件类型，则是标准的。如果只有custId则，证件类型为 ResConst.CM_CERT_TYPE_1000 = 1000;
	 * 		key="certNo" value类型：String 证件编号
	 * 		key="reserveType" value类型：String 预占类型  ResConst L资源预占类型
	 * @return
	 * @throws Exception
	 * @author res_team
	 * @createDate 2014-9-19下午5:12:32
	 */
	public IBOResPhoneNumOriginValue[] searchAndReserveNums(Map inputMap) throws Exception;
	
	/**
	 * 获取可选号码，并且“直接”预占。  --- for Telenor Mobile
	 * 1.前台营业页面的 NP 业务。2.多卡多号选号业务
	 * @param inputMap
	 * 参数说明：参数类型Map
	 * 		key="resType" value类型：String 号码大类   ResConst.RES_TYPE_GSM_NUM(1000移网)、 ResConst.RES_TYPE_FIX_NUM(1001固网) （*必填）***********
	 * 		key="resSpecId" value类型：String 具体的号码规格 （*选填）***********
	 * 		key="orgId" value类型：String 操作员组织
	 * 		key="opId" value类型：String 操作员
	 * 		key="chooseType" value类型：String 选号方式：1.随机, 2.按查询条件来
	 * 		key="resId" value类型：String 号码：可以模糊查询、如果是包含“_”就是通配符选号，但是号码长度要满足
	 * 		key="begMSISDN" value类型：String 开始号码 查询号码段使用。
	 * 		key="endMSISDN" value类型：String 结束号码
	 * 		key="chooseLevel" value类型：String 是否优选号码：0普通号码、1优选号码
	 * 		key="resLevel" value类型：String 号码档次：目前0、1、2、3 档
	 * 		key="selectMode" value类型：String 选号费模式：对应AABB的编号
	 * 		key="numCount" value类型：String 需要号码数量 
	 * 		key="certType" value类型：String 证件类型：如果有证件类型，则是标准的。如果只有custId则，证件类型为 ResConst.CM_CERT_TYPE_1000 = 1000;
	 * 		key="certNo" value类型：String 证件编号
	 * 		key="reserveType" value类型：String 预占类型  ResConst L资源预占类型
	 * @return
	 * @throws Exception
	 * @author res_team
	 * @createDate 2014-9-19下午5:12:32
	 */
	public IBOResPhoneNumOriginValue[] searchAndReserveNumsForMobile(Map inputMap) throws Exception;
	
	/**
	 * 号码预占  --- for Telenor 
	 * @param billId  手机号码
	 * @param certType  String 证件类型，和客管处保持一致，如果只有客户编号，该值为1000（*必填）***********
	 * @param certNo  String 证件号码、或者客户编号									（*必填）***********
	 * @param regionId  地区编码
	 * @param orgId  操作员组织ID
	 * @param opId  操作员ID
	 * @param reserveType  value类型： String 预占类型  ResConst L资源预占类型			（*必填）***********
	 * @param inputMap map类型 ： 存储调用者传递过来的时间       2015-8-18  
	 * 		参数说明：参数类型Map
	 * 		key="PRE_OCCUPY_DATE" value类型：Timestamp 预占到期时间（*非必填）***********
	 * @return IBOResPhoneNumOriginValue
	 * 2014-10-26 10:20
	*/
	public IBOResPhoneNumOriginValue phonePreOccupy(String billId, long certType, String certNo, String regionId, long orgId, long opId, String reserveType, Map inputMap) throws Exception, RemoteException;
	
	/**
	 * 查询 预占号码  --- for Telenor
	 * @param regionId 地市
	 * @param certNo value类型：String 证件号码、或者客户编号										（*必填）***********
	 * @param certType value类型：String 证件类型，和客管处保持一致，如果只有客户编号，该值为1000,如果是OSE购物车ID就穿30  	（*必填）***********
	 * @return IBOResPhoneNumOriginValue[]
	 * 出参包含：
	 * resType = values[i].getExtAttr("resType")  号码大类：(1000移网)、(1001固网)
	 * useRange = values[i].getExtAttr("useRange") 号段类型：（1.B2C号码）、 （2.B2B号码）
	 * 2014-10-26 10:20
	*/
	public IBOResPhoneNumOriginValue[] queryPreOccupyNums(String regionId, String certNo, String certType) throws Exception, RemoteException;
	
	/**
	 * 查询 预占号码  --- for Telenor, 给OSE的网上选择预占号码接口
	 * @param resId 号码，支持模糊查询
	 * @param certNo value类型：String 证件号码、或者客户编号										（*必填）***********
	 * @param certType value类型：String 证件类型，和客管处保持一致，如果只有客户编号，该值为1000,如果是OSE购物车ID就穿30	           （*必填）***********
	 * @param numberList value类型：List 过滤不需要的号码
	 * @return IBOResPhoneNumOriginValue[]
	 * 出参包含：
	 * resType = values[i].getExtAttr("resType")  号码大类：(1000移网)、(1001固网)
	 * useRange = values[i].getExtAttr("useRange") 号段类型：（1.B2C号码）、 （2.B2B号码）
	 * 2014-10-26 10:20
	*/
	public IBOResPhoneNumOriginValue[] queryPreOccupyNumbers(String certNo, String certType, String resId, List numberList) throws Exception, RemoteException;
	
	/**
	 * 查询 B2B预留号码  --- for Telenor, 给OSE的网上选择 B2B预留号码接口,只查MS是4的号码
	 * @param resId 号码，支持模糊查询
	 * @param certNo value类型：String 证件号码、或者客户编号										（*必填）***********
	 * @param certType value类型：String 证件类型，和客管处保持一致，如果只有客户编号，该值为1000  
	 * @param numberList value类型：List 过滤不需要的号码
	 * @param numberCount value类型：String 要查询的号码数量 （add by zhouwei9:AI-8236）
	 * @param numberType value类型：String 要查询的号码type （add by zhouwei9:AI-8236）
	 * @return IBOResPhoneNumOriginValue[]
	 * 出参包含：
	 * resType = values[i].getExtAttr("resType")  号码大类：(1000移网)、(1001固网)
	 * useRange = values[i].getExtAttr("useRange") 号段类型：（1.B2C号码）、 （2.B2B号码）
	 * 2018-9-19 10:20
	*/
	public IBOResPhoneNumOriginValue[] queryReservedNumbers(String certNo, String certType, String resId, List numberList, String numberCount, String numberType) throws Exception, RemoteException;
	
	/**
	 * 查询号码使用表
	 * 传入参数分为两种，一种是传入号码段，一种是传入离散号码。
	 * @param begId
	 * @param endId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IBOResPhoneNumOriginValue[] queryPortinNum(String begId, String endId,int start,int end) throws Exception, RemoteException;
	public int queryPortinNumCount(String begId, String endId) throws Exception, RemoteException;
	public IBOResPhoneNumOriginValue[] queryPortinNumList(List list,int start,int end) throws Exception, RemoteException;
	public int queryPortinNumListCount(List list) throws Exception, RemoteException;
	public void updateNumOrigin (String begId,String endId)  throws Exception,RemoteException;
	public void updateNumListOrigin (List list) throws Exception, RemoteException;
	/**
	 * 判断 客户是否有预占，预留的号码  --- for Telenor
	 * @param inputMap
	 * 参数说明：参数类型Map
	 * 		key="certType" value类型：String 证件类型，和客管处保持一致，如果只有客户编号，该值为1000	（*必填）***********
	 * 		key="certNo" value类型：String 证件号码、或者客户编号										（*必填）***********
	 * 
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author res_team
	 * @createDate 2014-9-24下午3:13:47
	 */
	public boolean checkReservedNumExists(Map inputMap) throws Exception, RemoteException;
	
	/**
	 * 查询 集团客户 预占号码 信息  --- for Telenor
	 * 能展示号段信息、号码明细信息、号段别名、可用号码段数量
	 * @param inputMap
	 * 参数说明：参数类型Map
	 * 		key="chooseType" value类型：String 查号方式：1.查号段信息, 2.查具体号码信息				（*必填）***********
	 * 		key="certType" value类型：String 证件类型，和客管处保持一致，如果只有客户编号，该值为1000	（*必填）***********
	 * 		key="certNo" value类型：String 证件号码、或者客户编号										（*选填）***********
	 * 		key="CVR" value类型：String CVR 编号														（*选填）***********
	 * 		key="resId" value类型：String 号码：模糊查询、如果是包含“_”就是通配符选号，但号码长度要满足
	 * 		key="begMSISDN" value类型：String 开始号码 查询号码段使用 
	 * 		key="endMSISDN" value类型：String 结束号码 查询号码段使用 
	 * 
	 * @return
	 * 参数说明：参数类型Map
	 * 		key="chooseType" value类型：String 查号方式：1.查号段信息, 2.查具体号码信息
	 * 		key="RANGE_VALUE" value类型：IQBOCorporateNumberMgrValue[] 号码段对象
	 * 		key="DTL_VALUE" value类型：IBOResPhoneNumOriginValue[] 号码明细对象
	 * @throws Exception
	 * @throws RemoteException
	 * @author res_team
	 * @createDate 2014-12-01下午3:13:47
	 */
	public Map getPreOccupyNums(Map inputMap) throws Exception, RemoteException;
	
	/**
	 * 单个预占取消 
	 * 对单个号码预占取消  --- for Telenor
	 * @param regionId			（*选填）***********
	 * @param billId value类型：String 需要释放的号码	 （*必填）***********
	 * @param custLogId			（*选填）***********
	 * @param certType value类型：String 证件类型，和客管处保持一致，如果只有客户编号，该值为1000 （*选填）***********
	 * @param certNo value类型：String 证件号码、或者客户编号									     （*选填）***********			
	 * @param channelId			（*选填）***********
	 * @param orgId 			（*选填）***********
	 * @param opId 				（*选填）***********
	 * @param tradeType 		（*选填）***********
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * 2014-10-22 09:43
	 */
	public boolean cancelPreOccupyNum(String regionId, String billId, long custLogId, long certType, String certNo, String channelId, long orgId, long opId, String tradeType) throws Exception, RemoteException;

	/**
	 * 多个预占取消 
	 * 对多个号码预占取消  --- for Telenor
	 * @param regionId
	 * @param billIds
	 * @param dataId
	 * @param certType
	 * @param certNo
	 * @param orgId
	 * @param opId
	 * @param tradeType
	 * @throws Exception
	 * @throws RemoteException
	 * 2014-10-22 09:43
	 */
	public void cancelPreOccupyNum(String regionId, String[] billIds, long dataId, long certType, String certNo, long orgId, long opId, String tradeType) throws Exception, RemoteException;

	/**
	 * 查询 预占号码 并 对号码预占取消--- for Telenor
	 * @param resId  服务号码
	 * @param certNo  证件编号
	 * @param certType 证件类型
	 * @return 
	 * 2014-10-26 10:20
	*/
	public void cancelPreOccupyNumByCertNo(String regionId, String certNo, String certType) throws Exception, RemoteException;
	
	/**
	 * 号码实占  --- for Telenor 
	 * @param billId  服务号码
	 * @param simCardNo  sim卡iccId
	 * @param reserveType  实占类型 0：营业厅开户实占
	 * @param regionId  地区编码
	 * @param orgId  操作员组织ID
	 * @param opId  操作员ID
	 * @return boolean
	 * 2014-10-26 10:20
	*/
	public boolean phoneNumOccupy(String billId, String simCardNo, String reserveType, String regionId, long orgId, long opId) throws Exception;
	
	/**
	 * 订单侧开户流程失败，号码回滚接口  --- for Telenor 
	 * 备注:暂时没有91的逻辑，91操作员调用这个接口直接报错
	 * 1.SO（号码当前服务运营商）即为当下系统运营商（21:Telenor 01015）（非携转订单）
                                ① B2B客户预留号码，号码状态不变（4），只恢复可选状态；
                                ② 普通预占号码，号码状态不变（3），设置预留时间。
       2.SO不是当下系统运营商（即携入订单）
                                ① 号码为resold，preselected规格： PSTN号码，原号码不做处理，删除未用表NP号码记录，即回退至可重新下单的状态。
                                ② 号码非resold，preselected 规格：
              a. RH是当下系统运营商 （即号码是归属于该运营商下已经携出的号码）Cancel订单之后，则需要把号码在Veris恢复为“ported out”的状态。（MS=6，PS=12）
              b. RH不是当下系统运营商 （即号码是外网号码，且未携入） Cancel订单之后，直接删除号码。
	 * 2018-8-31 10:20
	*/
	public void phoneNumForceCancel(String billId) throws Exception;
	
	/**
	 * 号码实占取消  --- for Telenor 
	 * 说明：根据手机号码、资源规格、组织编号、操作员编号进行手机号码 “实占取消”。 给固网用
	 * 
	 * @param billId
	 * @param resCode
	 * @param resSpecId
	 * @param regionId
	 * @param orgId
	 * @param opId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * 2014-10-14
	 */
	public void cancelPhoneNumOccupy(String billId, String resCode, String resSpecId, String regionId, long orgId, long opId, Map inputMap) throws Exception, RemoteException;	

	/**
	 * 根据条件：查询预销户号码 --- for Telenor
	 * @param billId  服务号码 	（*必填）***********
	 * @param custId  客户编号 	（*必填）***********
	 * @param resSpecId 
	 * @param regionId 			（*可空）***********
	 * @param orgId 			（*可空）***********
	 * @param opId 				（*可空）***********
	 * @param inputMap 
	 *            : key------operType：1.本网号码，2.携转号码，3.所有号码
	 * @throws Exception
	 * @throws RemoteException
	 * 2014-10-14
	 */
	public IBOResPhoneNumUsedValue[] qryPreTerminationPhones(String billId, String custId, String resSpecId, String regionId, long orgId, long opId, Map inputMap) throws Exception, RemoteException;

	/**
	 * 
	 * 预销户：号码冷冻  -- for Telenor
	 * description：将号码状态从“5”改成“6”
	 * @param billId  服务号码
	 * @param regionId  地区编码
	 * @param orgId  操作员组织ID
	 * @param opId  操作员ID
	 * @param parmMap
	 *            : key------DisType：1.继续使用，2.购买订单放弃（将选号记录表预占时间修改为当前时间）
	 *            	key------ORDER_CODE：重要字段:订单编号
	 *              key------BUSINESS_ID：重要字段: 900419、 900428、900431 走资源的冷号回收流程 正常的预销户走实销接口 
	 * @return
	 * 2014-10-14 19:34
	*/
	public void phoneNumPreDisuse(String billId, String regionId, long orgId, long opId, Map inputMap) throws Exception, RemoteException;

	/**
	 * 
	 * 预销户取消：预销户重入网：号码回到“实占”状态  -- for Telenor
	 * @param billId  服务号码
	 * @param regionId  地区编码
	 * @param orgId  操作员组织ID
	 * @param opId  操作员ID
	 * @param parmMap
	 * @return
	 * 2014-10-14 19:34
	*/
	public boolean phoneNumCancelPreDisuse(String billId, String iccId, String regionId, long orgId, long opId, Map inputMap) throws Exception, RemoteException;
	
	/**
	 * 预销户取消：预销户重入网：号码回到“实占”状态,只做号码的实占操作
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2017-9-14
	* IRes2InterFSV
	 */
	public boolean phoneNumCancelPreDisuse_pretermination(String billId, String iccId, String regionId, long orgId, long opId, Map inputMap) throws Exception, RemoteException;

	/**
	 * 实销：实际销户：号码冷号回收  -- for Telenor
	 * @param billId  服务号码
	 * @param regionId  地区编码
	 * @param orgId  操作员组织ID
	 * @param opId  操作员ID
	 * @param parmMap
	 *            : key------disType：1.继续使用，2.购买订单放弃（将选号记录表预占时间修改为当前时间）
	 *            	key------ORDER_CODE：重要字段:订单编号
	 * @return
	 * 2014-10-14 19:34
	*/
	public void phoneNumDisuse(String billId, String regionId, long orgId, long opId, Map inputMap) throws Exception, RemoteException;
	
	/**
	 * 未用号码查询 ：查询全量的号码数据， 通过组织校验  -- for Telenor
	 * @param resId  服务号码 	（*必填）***********
	 * @param secOrgId  组织编号 	（*必填）***********
	 * @return IBOResPhoneNumOriginValue
	 * 2016-04-18 15:40
	*/
	public IBOResPhoneNumOriginValue queryOriginNumByOrgId(String resId, String secOrgId) throws Exception;
	
	/**
	 * 已用号码查询 ：查询全量的号码数据， 通过组织校验 -- for Telenor 
	 * @param resId  服务号码 	（*必填）***********
	 * @param secOrgId  地区编码 	（*必填）***********
	 * @return IBOResPhoneNumOriginValue
	 * 2016-04-18 15:40
	*/
	public IBOResPhoneNumUsedValue queryUsedNumByOrgId(String resId, String secOrgId) throws Exception;
	
	/**
	 * 未用号码查询 ：查询全量的号码数据，不通过组织校验  -- for Telenor ！！！！！！wholesale调用请慎用！！！！！！
	 * @param resId  服务号码
	 * @param regionId  地区编码
	 * @return IBOResPhoneNumOriginValue
	*/
	public IBOResPhoneNumOriginValue queryOriginNum(String regionId, String resId)throws Exception;
	
	/**
	 * 已用号码查询 ：查询全量的号码数据，不通过组织校验 -- for Telenor  ！！！！！！wholesale调用请慎用！！！！！！
	 * @param resId  服务号码
	 * @param regionId  地区编码
	 * @return IBOResPhoneNumOriginValue
	 * 2015-09-18 12:11
	*/
	public IBOResPhoneNumUsedValue queryUsedNum(String regionId, String resId)throws Exception;
	
	/**
	 * 号码查询:已用表、未用表都查询，不通过组织校验 -- for Telenor
	 * @param resId  服务号码
	 * @param regionId  地区编码
	 * @param secOrgId  默认：ResUserInfo.getTopOrganizeId()  请注意, 如果不需要,就传 “-1”
	 * @return IBOResPhoneNumOriginValue
	 * 
	 * 出参包含：DataContainerInterface
	 * resType = values.getExtAttr("resType")  号码大类：(1000移网)、(1001固网)
	*/
	public IBOResPhoneNumOriginValue queryPhoneNums(String regionId, String resId, long secOrgId) throws Exception;
	
	/**
	 * 号码选号记录表查询，不通过组织校验 -- for Telenor
	 * @param resId  服务号码
	 * @param secOrgId  默认：ResUserInfo.getTopOrganizeId()  请注意, 如果不需要,就传 “-1”
	 * @return IBOResSelNumCustLogValue
	 * 
	 * 出参包含：DataContainerInterface
	 * resType = values.getExtAttr("resType")  号码大类：(1000移网)、(1001固网)
	*/
	public IBOResSelNumCustLogValue queryPhoneSelNums(String resId, long secOrgId) throws Exception;

	/**
	 * 号码更新sim卡信息接口
	 * @param billId  服务号码
	 * @param newSimCardNo  新sim卡iccId
	 * @param regionId  地区编码
	 * @param orgId  操作员组织ID
	 * @param opId  操作员ID
	 * @return
	*/
	public void updateUsedPhoneInfo(String billId, String newSimCardNo, String regionId, long orgId, long opId) throws Exception, RemoteException;

	/**
	 * 号码冷冻占用
	 * @param billId  服务号码
	 * @param simCardNo  sim卡iccId
	 * @param orderCode  占用类型 0：营业厅实占
	 * @param regionId  地区编码
	 * @param orgId  操作员组织ID
	 * @param opId  操作员ID
	 * @return boolean
	*/
	public boolean phoneNumOccupyFromFreeze(String billId, String simCardNo, String orderCode, String regionId, long orgId, long opId) throws Exception;
	
	/**
	 * 获取可选号码接口
	 * @param resSpecId  号码型号
	 * @param regionId  地区编码
	 * @param orgId  可选号码归属组织ID
	 * @param startNum  分页起始 不需要分页填-1
	 * @param endNum  分页结束 不需要分页填-1
	 * @return Map 字段NUMS为类型为IBOResPhoneNumOriginValue[]的分页后的可选号码实例，字段COUNTS为类型为int的可选号码全部数量
	*/
	public Map querySelPhoneNums(String regionId, String resSpecId, String orgId, int startNum, int endNum) throws Exception, RemoteException;

	/**
	 * 号码预约预占接口
	 * @param billId  服务号码
	 * @param certType  证件类型
	 * @param certNo  证件编号
	 * @param regionId  地区编码
	 * @param orgId  操作员组织ID
	 * @param opId  操作员ID
	 * @param inputMap 预占时间      map类型
	 * @return boolean
	*/
	public IBOResPhoneNumOriginValue phonePreOccupyWithChannelId(String billId, long certType, String certNo, String channelId, String regionId, long orgId, long opId, String tradeType, Map inputMap) throws Exception, RemoteException;

	/**
	 * 查询 错误携出 的号码
	 * 2016-03-07 11:30
	 */
	public IBOResPhoneNumUsedValue qryErrorPortOutNum(String resId, String portStatus, Map inputMap) throws Exception, RemoteException;
	
	
	/**
	 * 根据起始、结束号码，判断是否都是 错误携出的号码 (号码已用表、未用表全查)    是：true   否：false
	 * 2016-03-31 11:30
	 */
	public boolean checkErrorPortOutNum(String begId, String endId, Map inputMap) throws Exception, RemoteException;
	
	/**
	 * 设定PORT_IN 号码的状态   --- for Telenor
	 * @param billId ：需要修改的手机号码
	 * @param portStatus ：26他网号码：携转入反悔、30号码：错误携出
	 * @param inputMap
	 * @throws Exception
	 * @throws RemoteException
	 * @author res_team
	 * @createDate 2014-11-26
	 */
	public void setPortStatus(String billId, String portStatus, Map inputMap) throws Exception, RemoteException;

	/**
	 * 
	 * @desc 号码携入 相关接口: 需要确认携入的号码是否要有RI、CI  --- for Telenor
	 * 1.号码携入申请：(本网情况)校验前：号码未用表数据为空，已用表有数据并且PortStatus状态为：12本网号码：已经携出 Ported Out [POU]
	 * 		                                         改正后：已用表数据转移到未用表，ManageStatus改为：3 or 4，PortStatus状态改为：13本网号码：待携入 Under Port In [UPI]；号码已用表数据删除
	 *           (他网情况)校验前：未用没数据、已用表可以存在ManageStatus=6，PortStatus=24
	 *		                                       改正后：根据参数在未用表生产号码，ManageStatus改为：3 or 4，PortStatus状态改为：23他网号码：待携入 Under Port In [UPI]
	 * 2.号码携入取消:(本网情况)校验前：号码未用表有数据并且PortStatus状态为：13本网号码：待携入 Under Port In [UPI]
	 * 		                                         改正后：未用表数据转移到已用表，PortStatus状态改为：12本网号码：已经携出 Ported Out [POU]；号码未用表数据删除
	 *           (他网情况)校验前：号码未用表有数据并且PortStatus状态为：23他网号码：待携入 Under Port In [UPI]
	 *		                                       改正后：号码未用表数据删除,保存到号码已用表 ManageStatus=6，PortStatus=24
	 * 3.号码携入确认:携入申请的号码，开户后，才能做携入确认操作（号码携入确认时，该号码在已用表里）
	 *           (本网情况)校验前：号码已用表有数据并且PortStatus状态为：13本网号码：待携入 Under Port In [UPI]
	 * 		                                         改正后：已用表数据PortStatus状态改为： 10本网号码：INIT初始
	 *           (他网情况)校验前：号码已用表有数据并且PortStatus状态为：23他网号码：待携入 Under Port In [UPI]
	 *		                                       改正后：已用表数据PortStatus状态改为：20他网号码：已经携入 Ported In [PIN]
	 * 4.回收携入号码，（只有他网情况）校验前：先 预销户 --> 实销--> 回收携入号码 ： 此时号码状态：“6 冷冻” + “20他网号码：已经携入”
	 *                     改正后：号码修改,将记录保存到号码回收表，选号记录 RES_SEL_NUM_CUST_LOG，保存到 RES_SEL_NUM_CUST_LOG_HIS 中
	 * @param inputMap
	 * 参数说明：参数类型Map
	 * 		key="portInFlag" value类型：String 携入标识: ResConst.NUM_BUSI_ID_APPLY_PORT_IN 号码携入申请，
	 *											        ResConst.NUM_BUSI_ID_CANCEL_PORT_IN 号码携入取消 ，
	 *													ResConst.NUM_BUSI_ID_CONFIRM_PORT_IN 号码携入确认 ，
	 *													ResConst.NUM_BUSI_ID_RETURN_PORT_IN 回收携入号码  （*必填）***********
	 * 		key="resType" value类型：String 号码大类   ResConst.RES_TYPE_GSM_NUM(1000移网)、 ResConst.RES_TYPE_FIX_NUM(1001固网) （*必填）***********
	 * 		key="billId" value类型：String 手机号码 （*选填）
	 * 		key="begId" value类型：String 开始号码 （*选填）
	 * 		key="endId" value类型：String 终止号码 （*选填）
	 * 		key="certType" value类型：String 证件类型，和客管处保持一致，如果只有客户编号，该值为1000（*必填）***********
	 * 		key="certNo" value类型：String 证件号码、或者客户编号（*必填）***********
	 *      key="custType" value类型：String 客户类型：1.CmConstants.CustomerType.INDIVIDUAL(客户类型：1个人客户)、
	 *      									      3.CmConstants.CustomerType.GROUP(客户类型：3集团客户) （*必填）***********
	 * 		key="regionId" value类型：String 地市编号
	 * 		key="orgId" value类型：String 操作组织
	 * 		key="opId" value类型：String 操作员
	 * 		key="reserveType" value类型：String 资源预占类型:ResConst.RES_LOCK_TYPE_22 :22——携号转入号码预占时长 （for Telenor）（*必填）***********
	 * 		key="doneCode" value类型：long 操作编号
	 * 		key="leadingNum" value类型：String 主号码
	 * 		key="rangeHolder" value类型：String 号码归属运营商
	 * 		key="serviceOperator" value类型：String 服务提供商
	 * 		key="networkOperator" value类型：String 网络运营商
	 * 		key="numberSeriesList" value类型：List 号码段信息（只有回收携入号码业务才使用）
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author res_team
	 * @createDate 2014-3-28下午3:13:47
	 */
	public Map saveResPortInNums(Map inputMap) throws Exception, RemoteException;
	
	/**
	 * 
	 * @desc 号码携出 相关接口  --- for Telenor
	 * 1.号码携出申请，     （他网情况）号码未用表，MANAGE_STATUS=“3 or 4”、PORT_STATUS=“20”。改成PORT_STATUS=“21” 。选号记录表、号码操作记录表
	 *					（他网情况）号码已用表，MANAGE_STATUS=“5”、PORT_STATUS=“20”。改成PORT_STATUS=“21”。选号记录表、号码操作记录表
	 *					（本网情况）号码未用表，MANAGE_STATUS=“3 or 4”、PORT_STATUS=“10”。改成PORT_STATUS=“11” 。选号记录表、号码操作记录表
	 *					（本网情况）号码已用表，MANAGE_STATUS=“5”、PORT_STATUS=“10”。改成PORT_STATUS=“11”。选号记录表、号码操作记录表
	 * 
	 * 2.号码携出取消，     （他网情况）号码未用表，MANAGE_STATUS不变、PORT_STATUS=“21”。改成PORT_STATUS=“20” 。选号记录表、号码操作记录表
	 *					（他网情况）号码已用表，MANAGE_STATUS不变、PORT_STATUS=“21”。改成PORT_STATUS=“20” 。选号记录表、号码操作记录表
	 *					（本网情况）号码未用表，MANAGE_STATUS不变、PORT_STATUS=“10”。改成PORT_STATUS=“11” 。选号记录表、号码操作记录表
	 *					（本网情况）号码已用表，MANAGE_STATUS不变、PORT_STATUS=“10”。改成PORT_STATUS=“11”。选号记录表、号码操作记录表
	 * 
	 * 3.号码携出确认，     （他网情况）号码未用表，PORT_STATUS=“21”。改成PORT_STATUS=“22” 。修改已用表记录、删除选号记录表、号码操作记录表
	 *					（他网情况）号码已用表，PORT_STATUS=“21”。改成PORT_STATUS=“22” 。修改已用表记录、删除选号记录表、号码操作记录表
	 *					（本网情况）号码未用表，PORT_STATUS=“10”。改成MANAGE_STATUS=“6”、PORT_STATUS=“12” 。未用表数据删除转移到号码已用表
	 *					（本网情况）号码已用表，PORT_STATUS=“10”。改成MANAGE_STATUS=“6”、PORT_STATUS=“12” 。号码保存在已用表中
	 * 
	 * 4.返回携出号码，外运营商的将号码返回给本网。该号码在已用表，MANAGE_STATUS=5, PORT_STATUS=2。删除已用表记录、转移到号码未用表、记录号码历史表、记录号码操作记录
	 * @param inputMap
	 * 参数说明：参数类型Map
	 * 		key="portInFlag" value类型：String 携入标识: ResConst.NUM_BUSI_ID_APPLY_PORT_OUT 号码携出申请，
														ResConst.NUM_BUSI_ID_CANCEL_PORT_OUT 号码携出取消 ，
														ResConst.NUM_BUSI_ID_CONFIRM_PORT_OUT 号码携出确认 ，
														ResConst.NUM_BUSI_ID_RETURN_PORT_OUT 返回携出号码（*必填）***********
	 * 		key="billId" value类型：String 手机号码 （*必填）***********
	 *      key="leading number"类型：String  主号
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author res_team
	 * @createDate 2014-3-28下午3:13:47
	 */
	public Map saveResPortOutNums(Map inputMap) throws Exception, RemoteException;
	
	/**
	 * 携入号码返回给原运营商number return
	 * @param inputMap
	 * 参数说明：参数类型Map
	 * 		key="returnFlag"  value类型：String 操作标识                                                                                                                                                       （*必填）***********
	 *               参数：ResConst.NUM_BUSI_ID_RETURN_UNDER    携入号码Return初始，将号码PortStatus状态改为31(携入号码Return初始)
	 *				     ResConst.NUM_BUSI_ID_RETURN_ERROR    携入号码Return失败，将号码PortStatus状态改为32(携入号码Return失败)
	 * 		key="billId"    value类型：String 手机号码                                                                                                                                                              （*必填）***********
	 * 		key="errorNote" value类型：String 错误日志          （*选填）
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author 高旭东
	 * @createDate 2018-7-13下午3:13:47
	 */
	public Map saveResPortInReturn(Map inputMap) throws Exception, RemoteException;

	/**
	 * @desc 预携入的号码生成 --- for Telenor
	 * 号码生成到号码未用表中，号码状态是"4 预留  B2B预占 B2B Reserved" 
	 * 号码携转状态"13本网号码：待携入 or 20他网号码：预携入"。 
	 * @param inputMap
	 * 参数说明：参数类型Map
	 * 		key="rangeList" value类型：String 号码段 				（*必填）***********
	 * 		key="certType" value类型：String 证件类型：默认 1000 	（*必填）***********
	 * 		key="certNo" value类型：String 客户编号 				（*必填）***********
	 * 		key="custType" value类型：String 客户类型：1、3 		（*必填）***********
	 * 		key="orgId" value类型：String 操作组织编号 			（*必填）***********
	 * 		key="opId" value类型：String 操作员编号 				（*必填）***********
	 * 		key="reserveType" value类型：String 预占类型 			（*必填）***********
	 * 		key="leadingNum" value类型：String 主号 				（*必填）***********
	 * 		key="preFixPBX" value类型：String preFixPBX 			（*必填）***********
	 * 		key="resType" value类型：1000移网、1001固网	 		（*必填）***********
	 *      key="portFlag" value类型：String 是否是携出错误的号码 		
	 * 
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author gaoxd
	 * @createDate 2014-10-28下午3:13:47
	 */
	public Map savePrePortInNumRange(Map inputMap) throws Exception, RemoteException;
	
	/**
	 * @desc 修改：预携入的号码段 --- for Telenor
	 * 根据leading number删除原始的数据，新增rangelist内的号码 
	 * 号码生成到号码未用表中，号码状态是"4 预留  B2B预占 B2B Reserved" 
	 * 号码携转状态"13本网号码：待携入 or 23他网号码：待携入"。 
	 * @param inputMap
	 * 参数说明：参数类型Map
	 * 		key="leadingNum" value类型：String 主号 				（*必填）***********
	 * 		key="rangeList" value类型：String 号码段 				（*必填）***********
	 * 		key="certType" value类型：String 证件类型：默认 1000 	（*必填）***********
	 * 		key="certNo" value类型：String 客户编号 				（*必填）***********
	 * 		key="custType" value类型：String 客户类型：1、3 		（*必填）***********
	 * 		key="orgId" value类型：String 操作组织编号 			（*必填）***********
	 * 		key="opId" value类型：String 操作员编号 				（*必填）***********
	 * 		key="reserveType" value类型：String 预占类型 			（*必填）***********
	 * 		key="preFixPBX" value类型：String preFixPBX 			（*必填）***********
	 * 
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author gaoxd
	 * @createDate 2014-10-28下午3:13:47
	 */
	public Map modifyPrePortInNumRange(Map inputMap) throws Exception, RemoteException;
	
	/**
	 * 删除待携入的号码资源
	 * @param inputMap
	 * 参数说明：参数类型Map
	 * 		key="begId" value类型：String 开始号码 （*必填）***********
	 * 		key="endId" value类型：String 终止号码 （*必填）***********
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author gaoxd
	 * @createDate 2014-10-28下午3:13:47
	 */
	public Map deletePortInNums(Map inputMap) throws Exception, RemoteException;
	
	/**
	 * 判断号码是否携入号码
	 * @param billId
	 * @return  true携入号码、false非携入号码
	 * @throws Exception
	 * @throws RemoteException
	 * @author res_team
	 * @createDate 2014-12-17 下午3:13:47
	 */
	public boolean checkIsPortInNumber(String billId)throws Exception, RemoteException;
	
	/**
	 * 匈牙利判断号码是否携入号码   用于订单过户:号码必须是已用表的
	 * @param billId
	 * @return  true携入号码、false非携入号码
	 * @throws Exception
	 * @throws RemoteException
	 * @author gaoxd
	 * @createDate 2016-1-21 下午3:13:47
	 */
	public boolean checkIsPortInNumberToHu(String billId)throws Exception, RemoteException;
	
	/**
	 * 匈牙利号段中单一号码过户更改号段：号码必须是已用表的   --- for HU
	 * @param billId ：手机号码
	 * @param custId ：过户后的客户ID
	 * @throws Exception
	 * @throws RemoteException
	 * @author gaoxd
	 * @createDate 2016-1-21 下午3:13:47
	 */
	public void changeRangeByTranslate(String billId, String custId) throws Exception, RemoteException;
	
	/**
	 * 判断号码是否可以被携入  --- for Telenor
	 * @param billId
	 * @param operType  1.GSM业务、2.FIXED业务、3.wholesale中固网携入号码 (允许为空，因为wholesale不需要去NP查询)
	 * @param isVoip  是否为VOIP业务，true：允许携入PSTN的号码作为VOIP开户使用，false不允许
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author res_team
	 * @createDate 2014-9-24下午3:13:47
	 */
	public boolean checkPortInFlag(String billId, String operType, boolean isVoip)throws Exception, RemoteException;
	
	/**
	 * 判断号码是否可以被携出  --- for Telenor
	 * @param billId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author res_team
	 * @createDate 2014-9-24下午3:13:47
	 */
	public boolean checkPortFlag(String billId)throws Exception, RemoteException;
	
	/**
	 * 根据号码查询主号--- for Telenor
	 * 参数说明：参数类型Map
	 * 		key="operType" value类型：String 操作类型：1查询该号码的主号     2查询该号码对应custId下所有的主号     （*必填）***********
	 * 		key="billId" value类型：String 手机号码：leadingNumber 	（*必填）***********
	 * @return
	 * 参数说明：参数类型Map
	 * 		key="leadingNumList" value类型：List 主号 
	 * 		
	 * 
	 * @throws Exception
	 * @throws RemoteException
	 * @author gaoxd
	 * @createDate 2014-10-23下午3:13:47
	 */
	public Map searchLeadingNum(Map inputMap)throws Exception, RemoteException;
	
	/**
	 * 根据号码返回其所在的号段信息。没有号段信息返回null
	 * @param billId   号码
	 * @throws Exception
	 * @throws RemoteException
	 * @author gaoxd
	 * @createDate 2017-10-27下午3:13:47
	 */
	public String searchNumberRange(String billId)throws Exception, RemoteException;
	
	/**
	 * 根据号码查询号段，  查已用、未用下该号段的所有号码--- for Telenor
	 * 参数说明：参数类型Map
	 * 		key="operType" value类型：String 操作类型：1查询leadingNumber下的所有号段信息 ，没有值查询明细 	（*必填）***********
	 * 		key="billId" value类型：String 手机号码：leadingNumber 										（*必填）***********
	 * @return
	 * 参数说明：参数类型Map
	 * 		key="resIdList" value类型：List 手机号码 
	 * 		key="resValueList" value类型：List 号码对象，IBOResPhoneNumOriginValue可以强转为：DataContainerInterface
	 * 		key="rangeValues" value类型：IQBOCorporateNumberMgrValue 号码段对象, 可以强转为：DataContainerInterface
	 * 
	 * @throws Exception
	 * @throws RemoteException
	 * @author gaoxd
	 * @createDate 2014-10-23下午3:13:47
	 */
	public Map searchNumsBuyLeadingNum(Map inputMap)throws Exception, RemoteException;
	
	/**
	 * 根据号码查询号段，  查已用、未用下该号段的所有号码--- for Telenor
	 * 参数说明：参数类型Map
	 * 		key="operType" value类型：String 操作类型：1查询leadingNumber下的所有号段信息 ，没有值查询明细 	（*必填）***********
	 * 		key="billId" value类型：String 手机号码：leadingNumber 										（*必填）***********
	 * @return
	 * 参数说明：参数类型Map
	 * 		key="resIdList" value类型：List 手机号码 
	 * 		key="resValueList" value类型：List 号码对象，IBOResPhoneNumOriginValue可以强转为：DataContainerInterface
	 * 		key="rangeValues" value类型：IQBOCorporateNumberMgrValue 号码段对象, 可以强转为：DataContainerInterface
	 * 
	 * @throws Exception
	 * @throws RemoteException
	 * @author gaoxd
	 * @createDate 2014-10-23下午3:13:47
	 */
	public Map searchNumsBuyLeadingNumForPortIn(Map inputMap)throws Exception, RemoteException;
	
	/**
	 * 根据号码查询号段，  查已用、未用下该号段的所有号码--- for Telenor (携出场景使用，查询号段时：只需要号段名称（EXT_STR）、号段拥有着（DEPT_ID）进行分组)
	 * 参数说明：参数类型Map
	 * 		key="operType" value类型：String 操作类型：1查询leadingNumber下的所有号段信息 ，没有值查询明细 	（*必填）***********
	 * 		key="billId" value类型：String 手机号码：leadingNumber 										（*必填）***********
	 * @return
	 * 参数说明：参数类型Map
	 * 		key="resIdList" value类型：List 手机号码 
	 * 		key="resValueList" value类型：List 号码对象，IBOResPhoneNumOriginValue可以强转为：DataContainerInterface
	 * 		key="rangeValues" value类型：IQBOCorporateNumberMgrValue 号码段对象, 可以强转为：DataContainerInterface
	 * 
	 * @throws Exception
	 * @throws RemoteException
	 * @author gaoxd
	 * @createDate 2018-1-18下午3:13:47
	 */
	public Map searchNumsBuyLeadingNumForPortOut(Map inputMap)throws Exception, RemoteException;
	
	/**
	 * 根据主号判断 主号下的号段是否有开户的号码:存在已经开户的号码 true，否则返回 false
	 * @param leadingNum
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * 2016-02-23 19:12
	 */
	public boolean checkExistUsedNum(String leadingNum) throws Exception, RemoteException;
	
	/**
	 * 根据主号查询该主号下的未用号码信息（PS=20,15）未提交受理的号码（主号下有一个不是20,15，返回null，都是20,15才返回查询结果）--- for Telenor
	 * @param  leadingNum value类型：String 主号 （*必填）***********
	 * @param  custId     value类型：String 主号 （*必填）***********
	 * @throws Exception
	 * @throws RemoteException
	 * @author gaoxd
	 * @createDate 2015-8-10下午3:13:47
	 */
	public IBOResPhoneNumOriginValue[] phoneValuesByLeadingNum(String leadingNum, String custId) throws Exception, RemoteException;
	
	/**
	 * 获取主号的相关信息。 NOTES：用备注字段:存储PBX number
	 * @param leadingNumber
	 * @param inputMap 参数说明：参数类型Map
	 * 		key="operType" value类型：String 操作类型：1查询该号码的主号
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * 2015-12-21 12:22
	 */
	public IBOResLeadingNumberValue[] getLeadingNumInfo(String leadingNumber, Map inputMap) throws Exception, RemoteException;

	/**
	 * 根据开始、结束编号，查询待携入（PS=20,15）未提交受理的号码 的未用号码信息。
	 * @param  begId value类型：String 开始号码 （*必填）***********
	 * @param  endId value类型：String 结束号码 （*必填）***********
	 * @throws Exception
	 * @throws RemoteException
	 * @author gaoxd
	 * @createDate 2015-8-10下午3:13:47
	 */
	public IBOResPhoneNumOriginValue[] phoneValuesByNumRange(String begId, String endId)throws Exception, RemoteException;
	
	/**
	 * 根据开始、结束编号、号码规格，查询待携入（PS=20）的未用号码信息。(判断起始号码是否是一个完整的号段信息，不是的话，返回NULL;是整号段的话,查询结果数量跟传入数量不一致的话返回NULL，一致的话才返回结果)
	 * @param  begId value类型：String 开始号码 （*必填）***********
	 * @param  endId value类型：String 结束号码 （*必填）***********
	 * @param  resSpecId value类型：String 号码规格 （*必填）***********
	 * @throws Exception
	 * @throws RemoteException
	 * @author gaoxd
	 * @createDate 2015-8-10下午3:13:47
	 */
	public IBOResPhoneNumOriginValue[] phoneOriginValuesByNumRange(String begId, String endId, String resSpecId)throws Exception, RemoteException;
	
	/**
	 * 根据主号查询该主号下所有的号码数量包括已用、未用--- for Telenor
	 * @param  leadingNum value类型：String 主号 （*必填）***********
	 * @param  custId     value类型：String 主号 （*必填）***********
	 * @throws Exception
	 * @throws RemoteException
	 * @author gaoxd
	 * @createDate 2015-8-10下午3:13:47
	 */
	public int phoneCountByLeadingNum(String leadingNum, String custId)throws Exception, RemoteException;
	
	/**
	 * 根据主号查询该主号下所有正在使用中的号码数量for Telenor
	 * @param  leadingNum value类型：String 主号 （*必填）***********
	 * @param  custId     value类型：String 主号 （*必填）***********
	 * @throws Exception
	 * @throws RemoteException
	 * @author gaoxd
	 * @createDate 2015-8-10下午3:13:47
	 */
	public int phoneUesdCountByLeadingNum(String leadingNum, String custId)throws Exception, RemoteException;
	
	/**
	 * 根据主号，查询主号下如果有子号码是非激活状态的，返回true。 如果有激活状态的号码，返回false
	 * @param  leadingNum value类型：String 主号 （*必填）***********
	 * @param  custId     value类型：String 主号 （*必填）***********
	 * @throws Exception
	 * @throws RemoteException
	 * @author gaoxd
	 * @createDate 2015-8-17下午3:13:47
	 */
	public boolean phoneUsedValueByLeadingNum(String leadingNum, String custId)throws Exception, RemoteException;
	
	/**
	 * 根据 客户ID 查询无主号的号段信息
	 * 
	 * 参数说明：参数类型Map
	 * 		key="operType" value类型：String 	ResConst.PHONE_RELA_TYPE_USER   使用者
	 *                                      ResConst.PHONE_RELA_TYPE_OWNER  拥有者               （*必填）***********
	 * 		key="custId" value类型：String 客户ID 										（*必填）***********
	 * @return
	 * 参数说明：参数类型Map
	 * 		key="numberRangeList"  value类型：List    号段信息
	 * 
	 * @throws RemoteException
	 * @throws Exception
	 * @author gaoxd
	 * @createDate 2015-1-6下午3:13:47
	 */
	public Map getNumberRangeByCustId(Map inputMap) throws RemoteException, Exception;
	
	/**
	 * 查询号段号码使用情况
	 * 
	 * 参数说明：参数类型Map
	 * 		key="begId" value类型：String 起始号码                                                                                                                                     （*必填）***********
	 *      key="endId" value类型：String 终止号码                                                                                                                                     （*必填）***********
	 * @return
	 * 参数说明：参数类型Map
	 * 		key="originNumList"  value类型：List    未用手机号码 
	 * 		key="usedNumList"    value类型：List    已用手机号码 
	 * @throws RemoteException
	 * @throws Exception
	 * @author gaoxd
	 * @createDate 2015-1-6下午3:13:47
	 */
	public Map getResIdValuesList(Map inputMap) throws RemoteException, Exception;
	
	/**
	 * 判断是否是一个号段，custId是否为传入的custId
	 * 参数说明：参数类型Map
	 *      key="operType" value类型：String 	ResConst.PHONE_RELA_TYPE_USER   使用者
	 *                                      ResConst.PHONE_RELA_TYPE_OWNER  拥有者       
	 *                                      ResConst.PHONE_RELA_TYPE_ALL    即时使用者也是拥有者          （*必填）***********
	 * 		key="custId" value类型：String 客户ID 										                           （*必填）***********
	 * 		key="begId" value类型：String 起始号码                                                                                                                                               （*必填）***********
	 *      key="endId" value类型：String 终止号码                                                                                                                                               （*必填）***********
	 * @return boolean
	 * @throws Exception
	 * @throws RemoteException
	 * @author gaoxd
	 * @createDate 2015-1-6下午3:13:47
	*/
	public boolean checkSameRangeByCustId(Map inputMap) throws Exception, RemoteException;
	
	/**
	 * 判断主号下所有号码的custId是否为传入的custId
	 * 参数说明：参数类型Map
	 *      key="operType" value类型：String 	ResConst.PHONE_RELA_TYPE_USER   使用者
	 *                                      ResConst.PHONE_RELA_TYPE_OWNER  拥有者       
	 *                                      ResConst.PHONE_RELA_TYPE_ALL    即时使用者也是拥有者          （*必填）***********
	 * 		key="custId" value类型：String 客户ID 										                           （*必填）***********
	 * 		key="leadingNum" value类型：String 主号                                                                                                                                            （*必填）***********
	 * @return boolean
	 * @throws Exception
	 * @throws RemoteException
	 * @author gaoxd
	 * @createDate 2019-5-14下午3:13:47
	*/
	public boolean checkleadingRangeByCustId(Map inputMap) throws Exception, RemoteException;
	
	/**
	 * 判断号段是否有主号
	 * @param  begId value类型：String 起始号码 （*必填）***********
	 * @param  endId value类型：String 终止号码 （*必填）***********
	 * @return boolean  有主号：true  无 ：false
	 * @throws Exception
	 * @throws RemoteException
	 * @author gaoxd
	 * @createDate 2015-1-6下午3:13:47
	*/
	public boolean checkLeadingNumByRange(String begId, String endId) throws Exception, RemoteException;
	
	/**
	 * 号码过户时修改号码的使用者和拥有者
	 * 参数说明：参数类型Map
	 *      key="operType" value类型：String 	ResConst.PHONE_RELA_TYPE_USER   使用者
	 *                                      ResConst.PHONE_RELA_TYPE_OWNER  拥有者               （*必填）***********
	 * 		key="billId"       value类型：String 手机号码									（*必填）***********
	 * 		key="secCustId"    value类型：String 原客户ID                                （*必填）***********      
	 *      key="destCustId"   value类型：String 目的客户ID                               （*必填）*********** 
	 * @return 
	 * @throws Exception
	 * @throws RemoteException
	 * @author gaoxd
	 * @createDate 2015-1-7下午3:13:47
	*/
	public Map changeNumCustId(Map inputMap) throws Exception, RemoteException;
	
	/**
	 * 	过户，修改sim卡的客户ID
	 * @param inputMap
	 * @throws Exception
	 */
	public void changeSimCustId(Map inputMap) throws Exception;
	
	/**
	 * 判断是否是一个号段，同一号段号码是否有遗漏
	 * 参数说明：参数类型Map
	 * 		key="begId" value类型：String 起始号码 （*必填）***********
	 *      key="endId" value类型：String 终止号码 （*必填）***********
	 * @return boolean
	 * @throws Exception
	 * @throws RemoteException
	 * @author gaoxd
	 * @createDate 2014-11-13下午3:13:47
	*/
	public boolean checkSameRange(Map inputMap) throws Exception, RemoteException;
	
	/**
	 * 判断主号所在的号码段是主号段（号码号码所在号段只有主号一个号码，且主号的号码信息在RES_SEL_NUM_CUST_LOG表中EXT_ID字段为0）
	 * @param billId
	 * @return boolean  
	 * @throws Exception
	 * @throws RemoteException
	 * @author gaoxd
	 * @createDate 2018-05-25下午3:13:47
	*/
	public boolean checkLeadNumRange(String billId) throws Exception, RemoteException;
	
	/**
	 * 根据号码判断 1.号码是否一个Range内的号码（必须有Leading Number）。2.或者是不是Leading Number
	 * @param billId
	 * 
	 * @return boolean ： true 是号段内的号码，
	 * @throws Exception
	 * @throws RemoteException
	 * @author res_team
	 * @createDate 2014-12-21 17:39
	*/
	public boolean checkIsRangeNumber(String billId) throws Exception, RemoteException;
	
	
	/**
	 * 根据传入的old leanging， 把主号为old leanging的号码给删了   生成新的号码，leading为传的new leanging   号段信息为传入的号段信息
	 * @param custId   客户编号
	 * @param oldLeadingNum   原有主号
	 * @param newLeadingNum   需要生成的主号
	 * @param numRangelist   生成的号段信息
	 * 参数类型Map  暂无字段
	 * 
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author gaoxd
	 * @createDate 2014-12-18下午4:31:10
	 */
	public IBOResPhoneNumOriginValue[] phoneLeadingNumGenerate(String custId, String oldLeadingNum, String newLeadingNum, List numRangelist, Map inputMap) throws Exception, RemoteException;
	
	/**
	 * 判断是否是 号段内的号码：	1.选号记录表，查询选号类型是90的号码
	 * 						  	2.或者号码实例表中digital_tag非空非0
	 * 参数说明：
	 * @param billId value类型：String 手机号码 （*必填）***********
	 * @param inputMap 参数说明：参数类型Map  暂时未用
	 * @return boolean
	 * @throws Exception
	 * @throws RemoteException
	 * @author gaoxd
	 * @createDate 2014-11-13下午3:13:47
	*/
	public boolean checkRangeNumber(String billId, Map inputMap) throws Exception, RemoteException;
	
	/**
	 * 判断携入号码是否是预留号码：号码表password为： 20（他网号码预携入）和15（本网号码预携入）
	 * 参数说明：
	 * @param billId value类型：String 手机号码 （*必填）***********
	 * @return boolean
	 * @throws Exception
	 * @throws RemoteException
	 * @author gaoxd
	 * @createDate 2016-11-7下午3:13:47
	*/
	public boolean checkIsReservedNumber(String billId) throws Exception, RemoteException;
	
	/**
	 * 判断是否是 B2B客户购买的号码：	1.选号记录表，查询选号类型是90的号码
	 * 					    2.选号记录表，查询选号类型是22的号码
	 *                          ① 号段标示ExtStr字段不为空，不为0，不为1
	 *                          ② 码表password为： 20（他网号码预携入）和15（本网号码预携入）
	 * 参数说明：
	 * @param billId value类型：String 手机号码 （*必填）***********
	 * @param inputMap 参数说明：参数类型Map  暂时未用
	 * @return boolean
	 * @throws Exception
	 * @throws RemoteException
	 * @author gaoxd
	 * @createDate 2014-11-13下午3:13:47
	*/
	public boolean checkCorporateNumber(String billId, Map inputMap) throws Exception, RemoteException;
	
	
	/**
	 * 判断：号码过户  --- for Telenor
	 * 1.号码必须是A客户下的。
	 * 2.如果是B2B Number Range的号码，过户时要判断：A、B客户必须是同一客户层级
	 * @param inputMap 参数说明：参数类型Map
	 * 		key="srcCustId" 	value类型：String 原始客户 （*必填）***********
	 * 		key="destCustId" 	value类型：String 目的客户 （*必填）***********
	 * 		key="billId" 		value类型：String 手机号码 （*必填）***********
	 * 		key="leadingNum" 	value类型：String 主号 	    （*选填）***********
	 * 
	 * @return boolean
	 * @throws Exception
	 * @author res_team
	 * @createDate 2014-11-18 17:06
	 */
	public boolean checkSameHierarchyTransferOwner(Map inputMap) throws Exception, RemoteException;
	
	/**
	 * 判断号码是否是 实占状态号码  --- for Telenor
	 * @param billId
	 * @return  true 实占状态、 false 非实占或没有
	 * @throws Exception
	 * @throws RemoteException
	 * @author res_team
	 * @createDate 2014-9-24下午23:13:47
	 */
	public boolean checkInUseNum(String billId)throws Exception, RemoteException;
	
	/**
	 * 查询手机号码在未用、已用表是否存在 --- for Telenor
	 * @param billId
	 * @param regionId
	 * @param resSpecId
	 * @return true 号码实例存在、 false 号码实例不存在
	 * @throws Exception
	 * @throws RemoteException
	 * @author res_team
	 * @createDate 2014-1--23下午14:02:31
	 */
	public boolean checkNumberExists(String billId, String regionId, String resSpecId) throws Exception, RemoteException;
	
	/**
	 * 订单受理提交，修改号码状态
	 * 客户(customer)受理(Handling)提交(Submission)  --- for Telenor
	 * 入参：
	 * @param resId  手机号码
	 * @param certType 证件类型：统一传 ResConst.CM_CERT_TYPE_1000 = "1000"; // 客户编号 ----- only for Telenor
	 * @param custId 客户编号：客管侧的CUST_ID
	 * @param operType  操作类型    ：  
	 * 				1.已受理未实占 ：点击受理提交，延长该号码的预占过期时间到2099年，并且不在预占号码查询页面展示
	 *  			2.受理回退：号码仍是预占状态，预占过期时间回退到原始时间，号码如尚未过期，仍可以在预占号码查询页面展示
	 * 功能：    
	 * 		将RES_SEL_NUM_CUST_LOG(选号记录表)表中，手机号码=resId，客户编号=custId，状态=3(B2C预占)或4(B2B预占)，
	 * 		的数据的STATE字段由1改为2(operType=1已受理未实占时)，或者由2改回1(operType=2受理回退时)。
	 * 
	 * 业务描述：
	 * 		开户点击受理提交后，并未马上进入实占状态(5)，再次点击选号页面时，该次受理提交的预占状态的号码还会再次展现，
	 * 		为避免重复进行受理提交，借助STATE字段对查询结果进行筛选。
	 * 
	 * 		STATE =  0已取消，1初始，2受理待提交，4预占已开通
	 * 		STATE作“状态”理解，起初翻译不标准，特此注明。
	 */
	public void customerHandlingSubmission(String resId, String certType, String custId, String operType) throws Exception, RemoteException;

	/**
	 * 修改号码预占时长：给客户管理侧使用  --- for Telenor
	 * customerStatus 1.如果客户状态变成在网，统一修改预占时长为2099年，
	 * customerStatus 2.如果客户状态变成离网，需要将名下的所有号码都 立即 释放掉。
	 * 根据B2B客户状态，将集团客户 “购买” 的号码：选号记录表中 选号记录表中 BUSI_TYPE IN ('22', '90')
	 * @param custId 客户编号
	 * @param customerStatus 客户状态
	 * @throws Exception
	 * @throws RemoteException
	 * 2014-10-09
	 */
	public void changePhoneNumPreDate(String custId, String customerStatus, Map inputMap) throws Exception, RemoteException;
	
	/**
	 * PSTN号码生成接口： --- for Telenor PSTN 业务
	 * 接口说明：提供给集团业务，页面直接输入 手机号码，查询已用、未用表不存在，预占or预留该号码 
	 * 如果是isNumberRange=1 表示是号段号码，号码状态是 4 预留
	 * 如果是isNumberRange=0 表示非号段号码，号码状态是 3 预占
	 * Port_status = ResConst.PORT_STATUS_EXTERNAL_RESOLD  (转售业务)
	 * @param inputMap
	 * 参数说明：参数类型Map
	 *      key="begId" 类型：String 开始号码 						  （*必填）***********
	 *      key="endId" 类型：String 结束号码 						  （*必填）***********
	 *      key="resTypeId" 类型：String 号码类型：枚举值 ResConst.RES_TYPE_FIX_NUM			  	（*必填）***********
	 *      key="resSpecId" 类型：String 号码规格：枚举值 ResCommonUtil.getPSTNPhoneSpec()		（*必填）***********
	 *      key="certType" 类型：String 类型	:默认ResConst。CM_CERT_TYPE_1000						（*必填）***********
	 *      key="custId" 类型：String 客户编号									   （*必填）***********
	 * 		key="reserveType" value类型：String 预占类型  ResConst.RES_LOCK_TYPE_22或 ResConst.RES_LOCK_TYPE_91 （*必填）***********
	 *		key="leadingNumber" value类型：String 对应主号 						   （*选填）***********
	 *	    key="isNumberRange" value类型：String 1.是号段，0非号段				   （*必填）***********
	 *  
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author res_team
	 * @createDate 2015-01-08 10:40
	 */
	public Map numberGenerationForPSTN(Map inputMap)throws Exception, RemoteException;
	
	
	/**
	 * 号码生成接口： --- for Telenor wholesale 业务
	 * @param inputMap
	 * 参数说明：参数类型Map
	 * 		key="CountryCode" value类型：String 国家编码: DK|HU		  （*必填）***********
	 * 		key="RangeUpdateType" value类型：String 修改类型：I、U、D （*必填）***********
	 *      key="BegId" 类型：String 开始号码 						  （*必填）***********
	 *      key="EndId" 类型：String 结束号码 						  （*必填）***********
	 *      key="OtherOperator" 类型：String 转售前的运营商 
	 *      key="CurrentRangeHolder" 类型：String 转售后的运营商 
	 *      key="CurrentServiceOperator" 类型：String 转售后的运营商如果是转售给网络运营商，CurrentServiceOperator=CurrentNetworkOperator
	 *      key="CurrentNetworkOperator" 类型：String 转售后的运营商
	 *      key="PortingCase" 类型：String 
	 *      key="SPC" 类型：String 
	 *      key="Municipality" 类型：String  
	 *      key="RoutingInfo" 类型：String 表示RoutingInfo
	 *      key="ChargingInfo" 类型：String 表示ChargingInfo
	 *      key="NewNumberType" 类型：String 表示NewNumberType：枚举值 ResConst. RES_TYPE_GSM_NUM、ResConst.RES_TYPE_FIX_NUM
	 *  
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author res_team
	 * @createDate 2015-01-05 23:01
	 */
	public Map numberGeneration(Map inputMap)throws Exception, RemoteException;
	
	/**
	 * @desc 4.25 同步号码段信息:NPGW业务使用  --- for Telenor
	 * @param inputMap
	 * 参数说明：参数类型Map
	 * 		key="CountryCode" value类型：String 国家编码: DK|HU		                                                                     （*必填）***********
	 * 		key="RangeUpdateType" value类型：String 修改类型：I(新增)、U(修改)、D(删除)           （*必填）***********
	 *      key="BegId" 类型：String 开始号码 						  （*必填）***********
	 *      key="EndId" 类型：String 结束号码 						  （*必填）***********
	 *      key="OtherOperator" 类型：String 转售前的运营商 
	 *      key="CurrentRangeHolder" 类型：String 转售后的运营商 
	 *      key="CurrentServiceOperator" 类型：String 转售后的运营商如果是转售给网络运营商，CurrentServiceOperator=CurrentNetworkOperator
	 *      key="CurrentNetworkOperator" 类型：String 转售后的运营商
	 *      key="PortingCase" 类型：String 
	 *      key="SPC" 类型：String 
	 *      key="Municipality" 类型：String  
	 *      key="RoutingInfo" 类型：String 表示RoutingInfo
	 *      key="ChargingInfo" 类型：String 表示ChargingInfo
	 *      key="NewNumberType" 类型：String 表示NewNumberType：枚举值 ResConst. RES_TYPE_GSM_NUM、ResConst.RES_TYPE_FIX_NUM
	 *      
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author res_team
	 * @createDate 2014-11-25
	 */
	public Map syncNumberRangeUpdateInfo(Map inputMap)throws Exception, RemoteException;
	
	/**
	 * @desc 4.13 NPGW返回RICI录入结果:NPGW业务使用  --- for Telenor
	 * @param inputMap
	 * 参数说明：参数类型Map
	 * 		key="OrderId" value类型：String 资源订单编号RES开头，对应RES_OPER_ORDER_PHONE 表主键		  （*必填）***********
	 * 		key="BusinessType" value类型：String  业务类型 					（*必填）***********
	 * 		key="ResponseType" value类型：String 结果: 1: success、2: fail 	（*必填）***********
	 * 		key="Reason" value类型：String 备注 								（*必填）***********
	 * 
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author res_team
	 * @createDate 2015-01-23
	 */
	public Map npResultResponse(Map inputMap)throws Exception, RemoteException;
	
	/**
	 * 作用：根据billId判断是否 是主号,是主号的话, 判断号码是否在号段里
	 * @param billId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public boolean checkleadingNum(String billId) throws Exception, RemoteException;
	
	/**
	 * 作用：根据主号删除已用  未用表所有数据
	 * @param billId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map cancelNumRangeWithLeadingNum(String leadingNum) throws Exception, RemoteException;
	
	/**
	 * 作用：根据billId判断改号码是否有manual export flag信息
	 * @param billId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public boolean checkManualExport(String billId) throws Exception, RemoteException;

	/**
	 * 号码预约
	 * @param billId  服务号码
	 * @param certType  证件类型
	 * @param certNo  证件编号
	 * @param regionId  地区编码
	 * @param orgId  操作员组织ID
	 * @param opId  操作员ID
	 * @param reserveType  预占类型 0：营业厅开户预占
	 * @return IBOResPhoneNumOriginValue
	*/
	public IBOResPhoneNumOriginValue phoneNumReserve(String billId, String certType, String certNo, String regionId, long opId, long orgId, String reserveType) throws Exception, RemoteException;
	
	/**
	 * 号码在途
	 * @param billId  服务号码
	 * @param iccId  sim卡iccId
	 * @param tradeType  实占类型 0：营业厅开户实占
	 * @param regionId  地区编码
	 * @param orgId  操作员组织ID
	 * @param opId  操作员ID
	 * @return boolean
	*/
	public void phoneNumInTransit(String billId, String regionId, long opId, long orgId, String tradeType) throws Exception, RemoteException;
	
	/**
	 * 省内号码判断
	 * @param resId  服务号码
	 * @param regionId  地区编码
	 * @param orgId  操作员组织ID
	 * @param opId  操作员ID
	 * @return Map
	*/
	public Map isPhoneNumActive(String resId) throws Exception;
	
	//获取号码对应的特征规则
	public IBOResPatternAllRuleValue getRuleByPhoneNum(String billId, String regionId) throws Exception, RemoteException;
	
	/**
	 * 号码占用返销接口
	 * @param billId  服务号码
	 * @param regionId  地区编码
	 * @param orgId  操作员组织ID
	 * @param opId  操作员ID
	 * @return
	*/
	public void occupiedPhoneNumRollBack(String billId, String regionId, long orgId, long opId) throws Exception;

	public DataContainerInterface[] getRegionPatternForPhoneSelQry(String regionId) throws Exception;
	
	/**
	 * 根据入参查询资源类型                --- for OSE
	 * @param typeId  资源type ID      
	 * @param specId  资源spec ID      
	 * @param state  资源类型状态      ResConst.RES_STATE_U （有效）、  ResConst.RES_STATE_E （无效）
	 * @return
	 * 参数说明：参数类型Map
	 *      key="resourceList" value类型：List对象，DataContainerInterface  
	 *      出参包含：  
	 *       resourceId = (DataContainerInterface) resourceList.get(i).getExtAttr("resourceId")
	 *		 resourceName = (DataContainerInterface) resourceList.get(i).getExtAttr("resourceName")
	 *		 resourceDescription = (DataContainerInterface) resourceList.get(i).getExtAttr("resourceDescription")
	 *		 lifecycleStatus = (DataContainerInterface) resourceList.get(i).getExtAttr("lifecycleStatus")
	 *		 parentId = (DataContainerInterface) resourceList.get(i).getExtAttr("parentId")
	 *		 parentName = (DataContainerInterface) resourceList.get(i).getExtAttr("parentName")
	 *		 tableName = (DataContainerInterface) resourceList.get(i).getExtAttr("tableName")
	 *		 isRoot = (DataContainerInterface) resourceList.get(i).getExtAttr("isRoot")
	 *      
	 *      key="typeLevelList" value类型：List对象，DataContainerInterface
	 *      出参包含：
	 *       typeId = (DataContainerInterface) typeLevelList.get(i).getExtAttr("typeId")
	 *		 typeName = (DataContainerInterface) typeLevelList.get(i).getExtAttr("typeName")
	 *		 typeDescription = (DataContainerInterface) typeLevelList.get(i).getExtAttr("typeDescription")
	 *		 lifecycleStatus = (DataContainerInterface) typeLevelList.get(i).getExtAttr("lifecycleStatus")
	 *		 parentId = (DataContainerInterface) typeLevelList.get(i).getExtAttr("parentId")
	 *		 parentName = (DataContainerInterface) typeLevelList.get(i).getExtAttr("parentName")
	 *		 tableName = (DataContainerInterface) typeLevelList.get(i).getExtAttr("tableName")
	 *		 isRoot = (DataContainerInterface) typeLevelList.get(i).getExtAttr("isRoot")
	 *      
	 *      key="specLevelList" value类型：List对象，DataContainerInterface
	 *      出参包含：
	 *       specId = (DataContainerInterface) specLevelList.get(i).getExtAttr("specId")
	 *		 specName = (DataContainerInterface) specLevelList.get(i).getExtAttr("specName")
	 *		 recipientOperator = (DataContainerInterface) specLevelList.get(i).getExtAttr("recipientOperator")
	 *		 effectiveTime = (DataContainerInterface) specLevelList.get(i).getExtAttr("effectiveTime")
	 *		 expiryTime = (DataContainerInterface) specLevelList.get(i).getExtAttr("expiryTime")
	 *		 materialCode = (DataContainerInterface) specLevelList.get(i).getExtAttr("materialCode")
	 *		 specDescription = (DataContainerInterface) specLevelList.get(i).getExtAttr("specDescription")
	 *		 lifecycleStatus = (DataContainerInterface) specLevelList.get(i).getExtAttr("lifecycleStatus")
	 *		 applicableRange = (DataContainerInterface) specLevelList.get(i).getExtAttr("applicableRange")
	 *		 typeId = (DataContainerInterface) specLevelList.get(i).getExtAttr("typeId")
	 *		 typeName = (DataContainerInterface) specLevelList.get(i).getExtAttr("typeName")
	 *		 tableName = (DataContainerInterface) specLevelList.get(i).getExtAttr("tableName")
	 *      
	 * @throws Exception
	 * @throws RemoteException
	 * @author gaoxd
	 * @createDate 2020-07-29
	 */
	public Map searchResource(String typeId, String specId, String state)throws Exception, RemoteException;
	
	/*---------------------------------------------------号码对外接口汇总 END------------------------------------------------------*/
	
	
	
	/*---------------------------------------------------SIM卡对外接口汇总 END------------------------------------------------------*/
	
	/**
	 * 作用：根据IMSI从SIM卡已用表中获取信息 -- 注意！！！不根据SEC_ORG_ID 来查询 
	 * @param imsi
	 * @param regionId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * 2015-09-17 16:25
	 */
	public IBOResSimCardUsedValue getAllUsedSimCardInfoByImsi(String imsi, String secOrgId, String regionId) throws Exception, RemoteException;
	
	/**
	 * 作用：根据ICCID从SIM卡已用表中获取信息 -- 注意！！！不根据SEC_ORG_ID 来查询 
	 * @param imsi
	 * @param regionId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * 2016-02-23 14:28
	 */
	public IBOResSimCardUsedValue getAllUsedSimCardInfoByIccId(String iccId, String secOrgId, String regionId) throws Exception, RemoteException;
	
	/**
	 * 根据ICCID查询SIM卡信息 （未用表、已用表都查）  -- 注意！！！不根据SEC_ORG_ID 来查询 
	 * 
	 * @param
	 * @param
	 * @throws Exception
	 * @author zhangjun6
	 * 2015-08-10 16:03
	 */
	public DataStructInterface getAllSimCardInfoByIccId(String iccId, String secOrgId, String regionId) throws Exception;
	
	/**
	 * 根据SIM卡号获取未用的SIM卡信息
	 * 
	 * @param iccId
	 * @param regionId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	// 增加查询条件，SEC_ORG_ID 涉及wholesale业务  -- for Telenor 项目 
	public IBOResSimCardOriginValue getUnUsedSimCardInfo(String iccId, String regionId) throws Exception, RemoteException;
	
	/**
	 * 根据SIM卡号、号码获取已用的Sim卡信息
	 * 
	 * @param iccId
	 * @param regionId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	// 增加查询条件，SEC_ORG_ID 涉及wholesale业务  -- for Telenor 项目 
	public IBOResSimCardUsedValue getUsedSimCardInfoByIccId(String iccId, String billId, String regionId) throws Exception, RemoteException;
	
	/**
	 * 根据SIM卡号、号码获取已用表正在使用的的Sim卡信息
	 * 
	 * @param iccId
	 * @param billId
	 * @param regionId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	// 增加查询条件，SEC_ORG_ID 涉及wholesale业务  -- for Telenor 项目 
	public IBOResSimCardUsedValue getUsedSimCardInfo(String iccId, String billId, String regionId) throws Exception, RemoteException;
	
	
	/**
	 * 根据ICCID查询SIM卡信息 （未用表、已用表都查） --- for Telenor
	 * 
	 * @param
	 * @param
	 * @throws Exception
	 * @author zhangjun6
	 * 2015-08-10 16:03
	 */
	// 增加查询条件，SEC_ORG_ID 涉及wholesale业务  -- for Telenor 项目 
	public DataStructInterface getSimCardInfoByIccId(String iccId, String regionId, long orgId, long opId) throws Exception;

	/**
	 * 根据IMSI查询SIM卡信息 （未用表、已用表都查） --- for Telenor
	 * 
	 * @param
	 * @param
	 * @throws Exception
	 * @author zhangss
	 * 2015-08-06
	 */
	// 增加查询条件，SEC_ORG_ID 涉及wholesale业务  -- for Telenor 项目 
	public DataStructInterface getSimCardInfoByIMSI(String imsi, String regionId, long orgId, long opId) throws Exception;

	/**
	 * 作用：根据IMSI从SIM卡"已用表"中获取信息  --- for Telenor
	 * 
	 * @param imsi
	 * @param regionId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	// 增加查询条件，SEC_ORG_ID 涉及wholesale业务 -- for Telenor 项目
	public IBOResSimCardUsedValue getUsedSimCardInfoByImsi(String imsi, String regionId) throws Exception, RemoteException;
	
	/**
	 * 根据手机号码获取相对应的已用的Sim卡信息（正在使用 和 使用过的）
	 * 
	 * @param billId
	 * @param regionId
	 * @return
	 * @throws Exception
	 */
	// 增加查询条件，SEC_ORG_ID 涉及wholesale业务 -- for Telenor 项目
	public IBOResSimCardUsedValue[] getUsedSimCardInfoByMSISDN(String billId, String regionId) throws Exception;
	
	/**
	 * SIM卡预占 包含号码预占;备卡申请时，对传入的SIM卡做预占 --- for Telenor
	 * 
	 * @param billId
	 * @param iccId
	 * @param custId
	 * @param specId
	 * @param regionId
	 * @param orgId
	 * @param opId
	 * @param String
	 *            flag:
	 *            0根据条件随机选一条SIM卡号并预占 ；
	 *            1根据传入参数SIM卡号预占 ；
	 *            2补换卡预占用；
	 *            3备卡申请时，对传入的SIM卡做预占；
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * 2016-01-08 11:31
	 */
	public IBOResSimCardOriginValue simCardPreOccupyNew(String billId, String iccId, String specId, String regionId, long orgId, long opId, String flag) throws Exception, RemoteException;
	
	/**
	 * SIM卡预占 包含号码预占;备卡申请时，对传入的SIM卡做预占 --- for Telenor   只对有eSim的预占场景
	 * 
	 * @param billId
	 * @param iccId
	 * @param custId
	 * @param specId
	 * @param eSim
	 * @param String
	 *            flag:
	 *            0根据条件随机选一条SIM卡号并预占 ；
	 *            1根据传入参数SIM卡号预占 ；
	 *            2补换卡预占用；
	 *            3备卡申请时，对传入的SIM卡做预占；
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * 2016-01-08 11:31
	 */
	public IBOResSimCardOriginValue simCardPreOccupyForESim(String billId, String iccId, String specId, String eSim, String flag) throws Exception, RemoteException;
	
	
	/**
	 * SIM卡实占：将SIM卡状态从 3 变成 5。 转移到SIM卡已用表中 --- for Telenor
	 * 
	 * @param billId
	 * @param iccId
	 * @param regionId
	 * @param orderCode
	 * @param orgId
	 * @param opId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * 2015-08-10 16:20
	 */
	public boolean simCardOccupy(String billId, String iccId, String regionId, String orderCode, long orgId, long opId) throws Exception, RemoteException;
	
	/**
	 * SIM卡预占取消：将SIM卡状态从 3 改成 2 ，可以被继续使用 --- for Telenor
	 * 
	 * @param iccId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * 2015-08-10 16:10
	 */
	public IBOResSimCardOriginValue cancelPreOccupySimCard(String iccId) throws Exception, RemoteException;
	
	/**
	 * 将预占的SIM卡作废 （force cancel order - regret order）--- for Telenor
	 * 2016-08-09 
	 */
	public void wastedSimCardforForceCancel(String iccId) throws Exception;
	
	/**
	 * 将SIM卡作废 --- for Telenor
	 * 
	 * @param iccId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * 2016-04-28 16:10
	 */
	public IBOResSimCardOriginValue wastedSimCard(String iccId) throws Exception, RemoteException;
	
	/**
	 * SIM卡实占取消：将实占状态的SIM卡，转移到未用表，状态改成 2 .--- for Telenor
	 * 实占的SIM卡，可以被重用
	 * @return
	 * @throws Exception
	 * 2015-08-10 16:13
	 */
	public boolean cancelUsedCard(String iccId, String billId, String regionId, long orgId, long opId) throws Exception;
	
	/**
	 * B2B客户状态从在网转成非在网后，在SIM卡未用表，将客户ID下预占的SIM状态改为7:报废 Wasted。  --- for Telenor
	 * @param custId 客户编号
	 * @param customerStatus 客户状态
	 * @throws Exception
	 * @throws RemoteException
	 * 2014-10-09
	 */
	public void changeSimStatus(String custId, String customerStatus, Map inputMap) throws Exception, RemoteException;
	
	/**
	 * @description 预销户冷冻SIM接口：修改SIM卡状态从5 改成 6 --- for Telenor
	 * 目前客户要求：预销户就冷冻SIM卡。 -- 不根据SEC_ORG_ID 来查询
	 * @param
	 * @param
	 * @throws Exception
	 * 2015-08-10 11:52
	 */
	public boolean setSimCardFrozen(String iccId, String billId, String regionId, long orgId, long opId) throws Exception;
	
	/**
	 * @description 预销户重入网：修改SIM卡状态从6 改成 5 --- for Telenor
	 * 
	 * @param
	 * @param
	 * @throws Exception
	 * 2015-08-10 16:01
	 */
	public boolean setSimCardFrozenUseAble(String iccId, String oldBillId, String newBillId, String regionId, long orgId, long opId) throws Exception;
	
	
	public IBOResPhoneNumOriginValue phonePreOccupyWithIccID(String billId, long certType, String certNo, String regionId, String iccid, long orgId, long opId, String tradeType) throws Exception, RemoteException;
	
	
	 /**
	 * @param billId
	 * @param certType  证件类型
	 * @param certNo  证件编号
	 * @param tradeType  预占类型 0：营业厅开户预占 1-重入网预占
	 * @param regionId  地区编码
	 * @param orgId  操作员组织ID
	 * @param opId  操作员ID
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IBOResPhoneNumUsedValue[] isPhoneNumAgainJoinNet(String billId, String certType, String certNo, String regionId, long orgId, long opId) throws Exception, RemoteException;


	public Map resStateChange(Map inputMap) throws Exception, RemoteException;
	
	/**
	 * FIX业务换号 --- for Telenor
	 * 参考 GSM换号、号卡业务，因为Fixed没有SIM卡，所以新增接口 针对Fixed 换号业务。
	 * @throws Exception
	 * @throws RemoteException
	 * 2015-03-22 19:36
	*/
	public void changePhoneForFixed(String newBillId, String oldBillId, String orderCode, String regionId, long orgId, long opId, Map inputMap) throws Exception, RemoteException;

	/**
	 * GSM业务换号换卡
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
	public void changePhoneAndSim(String newBillId, String newSimCardNo, String oldBillId, String oldSimCardNo, String orderCode, String regionId, long orgId, long opId) throws Exception, RemoteException;

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
	 */
	public void backCardChange(String newSimCardNo, String oldSimCardNo, String regionId, long orgId, long opId) throws Exception, RemoteException;


	/**
	 * 营业日报报表数据修复接口
	 * 
	 * @param recovDate
	 *            ：YYYYMMDD
	 * @param listOpId
	 * @param orgId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void recoveryData(Date recovDate, String regionId, List<Long> listOpId, long business_id) throws Exception;

	/**
	 * 根据资源规格ID查询资源规格信息
	 * 
	 * @param resSpecId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map getResSpecValue(long resSpecId) throws Exception, RemoteException;

	/**
	 * 根据资源类型查询所有资源规格
	 * 
	 * @param resType
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map getResSpecMapByResType(long resType, String regionId) throws Exception, RemoteException;

	/**
	 * 根据资源编号查询资源付费信息：号码-10，SIM卡-11
	 * 
	 * @param resId
	 *            资源ID：号码/SIM卡
	 * @param resTypeId
	 *            资源类型：10-号码，11-SIM卡
	 * @param regionId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IBOResPhoneNumAgentPrepayValue[] getResPrepayByResId(String resId, long resTypeId, String regionId) throws Exception, RemoteException;

	/**
	 * * author zhangjun6
	 * 
	 * @description 异地补办卡
	 * 
	 * @param SN
	 *            空白卡序列号 opRegionId 操作员地市 numRegionId 原来号码地市
	 * @param
	 * @throws Exception
	 */

	public void longDistanceWriteEmptyCard(String sn, String opRegionId, String numRegionId, long orgId, long opId) throws Exception, RemoteException;

	/**
	 * 
	 * @param resId
	 * @param orgId
	 * @param regionId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void preopenPhoneNumToUpdate(String resId, String orgId, String regionId) throws Exception, RemoteException;

	/**
	 * 激活时调用资源的接口
	 * 
	 * @param resId
	 * @param orgId
	 * @param regionId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void activePhoneNumToUpdate(String resId, String orgId, String regionId, long openFee, long offerId) throws Exception, RemoteException;

	/**
	 * * author zhangjun6
	 * 
	 * @description 空白卡写卡MAP 参数接口
	 * 
	 * @param
	 * @param
	 * @throws Exception
	 */
	public boolean writeEmptySimCardForMapParam(HashMap inputMap) throws Exception;

	/**
	 * 根据空卡序列号获取未用空白卡信息
	 * 
	 * @param snNumber
	 * @param regionId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IBOResSimCardOriginValue getSimCardInfoBySN(String snNumber, String regionId, String mode) throws Exception, RemoteException;

	/**
	 * 
	 * @param regionId
	 * @param resId
	 * @param imsi
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void recChannelOrderDtlToUnSale(String regionId, String resId, String imsi) throws Exception, RemoteException;

	/**
	 * @description SIM已用表根据SN查询记录
	 * 
	 * @param
	 * @param
	 * @throws Exception
	 */
	public IBOResSimCardUsedValue getResSimCardUsedBySn(String sn) throws Exception, RemoteException;
	
	/**
	 * 
	 * @desc 根据 1:服务号码、2:ICCID、3:IMSI号 查询SIM卡相关信息
	 * @param inputMap
	 * 参数说明：参数类型Map
	 * 		key="resId" value类型：String 资源ID
	 * 		key="resType" value类型：String 1:服务号码、2:ICCID、3:IMSI号 查询SIM卡相关信息
	 * 		key="regionId" value类型：String 地区编号
	 * 		key="orgId" value类型：String 组织编号
	 * 		key="opId" value类型：String 操作员编号
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author Res_Team
	 * @createDate 2014-3-24下午3:13:57
	 */
	public Map getResInfo(Map inputMap) throws Exception, RemoteException;
	
	/**
	 * @desc 查询某一张SIM卡 开户时间和废弃时间
	 * @param inputMap 
	 * 				key:iccid
	 * 				key:regionId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author res_team
	 * @createDate 2014-5-12下午2:14:33
	 */
	public Map getSIMCardLifeCycle(Map inputMap) throws Exception, RemoteException;
	
	
	/**
	 * @desc 获取SIM卡激活返回情况：activationType = 3，pre-active的后付费卡
	 * @param inputMap
	 * 入参说明：参数类型Map
	 * 		key="imsi" value类型：String： IMSI 编号
	 * 		key="status" value类型：String： S激活成功、F激活失败
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author res_team
	 * @createDate 2014-3-28下午3:13:47
	 */
	public Map getSimActiveInfo(Map inputMap) throws Exception, RemoteException;
	
	/**
	 * 根据SAP 返回的ICCD、IMSI信息，将这批SIM卡预占住，并且记录操作记录明细表
	 * @param inputMap
	 * 入参说明：参数类型Map
	 * 		key="imsi" value类型：String： IMSI 编号
	 * 		key="status" value类型：String： S激活成功、F激活失败
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author res_team
	 * @createDate 2014-10-21 上午10:28:22
	 */
	public Map reserveSimCardFromSAP(Map inputMap) throws Exception, RemoteException;
	
	/**
	 * 判断是否 为SAP的SIM卡预占订单
	 * @param resEventId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author res_team
	 * @createDate 2014-10-21 上午15:31:23
	 */
	public boolean isReserveSimCardFromSAP(String resEventId) throws Exception, RemoteException;
	
	/**
	 * 
	 * @desc 根据客户ID查询预占SIM信息(for ose接口)
	 * @param custId            
	 * @param resSpecId
	 * @param start             
	 * @param end
	 * 参数类型Map
	 * 		key="CVR" value类型：String： CVR 编号       
	 * @return 
	 * @author gaoxd
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IBOResSimCardOriginValue[] getResSimCardOseInfos(String custId, String resSpecId, int start, int end, Map inputMap) throws Exception, RemoteException;
	
	/**
	 * 
	 * @desc 根据客户ID查询不同规格下可用SIM数量(for ose接口)
	 * @param custId   
	 * 参数类型Map
	 * 		key="CVR" value类型：String： CVR 编号                
	 * @return 
	 * @author gaoxd
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IBOResSimCardOriginValue[] getResSimCardOriginOseInfos(String custId, Map inputMap) throws Exception, RemoteException;

	/**
	 * 
	 * @desc 根据客户ID查询所有的可用SIM数量(for ose接口)
	 * @param custId   
	 * 参数类型Map
	 * 		key="CVR" value类型：String： CVR 编号 
	 * @return 
	 * @author gaoxd
	 * @throws Exception
	 * @throws RemoteException
	 */
	public int getResSimCardOriginOseCount(String custId, Map inputMap) throws Exception, RemoteException;

	
	/**
	 * 根据CustID 和 ICCID 从已用、未用表查询SIM卡
	 * 入参：
		inputMap.put("customerId",      要查的客户ID     );
		inputMap.put("simcard",      要查的SIM卡号     );
		
		返回值：
		类型Map，可取出一组SIM卡Value对象，参考代码如下：
		Map returnMap = res2InterFSV.checkSimcardStatus(inputMap);
		IBOResSimCardOriginValue[] values = (IBOResSimCardOriginValue[]) returnMap.get("simcardInfo");
		
		status = values[0].getManageStatus();
		customerId = values[0].getReceiver();
		serviceNum = values[0].getBillId();
	*/
	public Map checkSimcardStatus(Map inputMap) throws Exception, RemoteException;

	
	/*******************************以下是国内项目的，Telenor项目不使用*********************************************/
	/**
	 * 获取号段和IMSI段配置信息 -- 国内项目
	 * @param billId 服务号码
	 * @return IBOResImsiNumSegmentValue
	 */
	public IBOResImsiNumSegmentValue getResNumberHlrByBillId(String billId) throws Exception, RemoteException;

	/**
	 * 获取号段HLR配置信息 -- 国内项目
	 * @param billId  服务号码
	 * @return IBOResImsiNumSegmentValue
	*/
	public IBOResNumberHlrValue getHlrByBillId(String billId)throws Exception, RemoteException;
	
	/**
	 * @description 根据号码获得可用的SIM接口 -- 国内项目
	 * 
	 * @param
	 * @param
	 * @throws Exception
	 */
	public IBOResSimCardOriginValue[] getResSimCardOriginByBillId(String billId, String specId, String regionId, long orgId, long opId) throws Exception;

	/**
	 * * author zhangjun6
	 * 
	 * @description SIM卡入库 远程写卡大唐返回的白卡信息-- 国内项目
	 * 
	 * @param
	 * @param
	 * @throws Exception
	 */

	public boolean writeEmptySimCard(long orgId, long opId, String billId, String regionId, String snNumber, String iccID, String imsi, String pin1, String puk1, String ki, String encKi, String main_flag, String m_icc_id) throws Exception;

	
	/**
	 * * author zhangjun6
	 * @description 写卡重置
	 * @param String snNumber String regioinId
	 * @param
	 * @throws Exception
	 */
	public boolean reSetEmptySimCard(String snNumber, String regioinId, long orgId, long opId) throws Exception;
	
	
	
	/**
	 * 需求的场景是转售号码先pstn开户 然后port in到他产品线
	 * 
	 * @param begId 开始号码 
	 * @param endId 结束号码
	 * @param manageStatus 管理状态
	 * @param resSpecId 号码规格
	 * @return IBOResPhoneNumOriginValue 
	 * @throws Exception
	 */
	public IBOResPhoneNumOriginValue[] getPhoneBySqlForResale(String begId, String endId, String leadingNum, String custId, String manageStatus) throws Exception;
	
	// 国际一卡多号漫游号码分页选号 -- 国内项目
	public int getPartnerPhoneForSelCount(String countryId, long opId) throws Exception;

	// 国际一卡多号漫游号码分页选号 -- 国内项目
	public IBOResPhonePartnerValue[] getPartnerPhoneForSel(String countryId, long opId, int start, int end) throws Exception;

	// 国际一卡多号漫游号码预占 -- 国内项目
	public IBOResPhonePartnerValue partnerNumPreOccupy(String billId, long opId, long orgId) throws Exception;

	// 国际一卡多号漫游号码实占 -- 国内项目
	public void partnerNumOccupy(String billId, long opId, long orgId) throws Exception;

	// 国际一卡多号漫游号码实占释放 -- 国内项目
	public void partnerNumDisuse(String billId, long opId, long orgId) throws Exception;

	// GSMHLR查询计数 -- 国内项目
	public int getGsmHlrInfoCounts(String hlrCode, String regionCode, String areaCode, String provCode, String bureauCode, String hlrType) throws Exception, RemoteException;

	// GSMHLR分页查询计数 -- 国内项目
	public IBOGsmHlrInfoValue[] getGsmHlrInfoValue(String hlrCode, String regionCode, String areaCode, String provCode, String bureauCode, String hlrType, int start, int end) throws Exception, RemoteException;

	//  -- 国内项目
	public void accessNumFreeFromPreOccupy(String regionId, String billId, long opId, long orgId) throws Exception;

	//  -- 国内项目
	public IBOResAccessNumOriginValue accessNumPreOccupyWithNoTimeOut(String regionId, String billId, long opId, long orgId) throws Exception;

	// 集团号码预占 -- 国内项目
	public IBOResAccessNumOriginValue accessNumPreOccupy(String regionId, String billId, long opId, long orgId) throws Exception;

	// 集团号码实占 -- 国内项目
	public void accessNumOccupy(String regionId, String billId, long opId, long orgId) throws Exception;

	// 集团号码释放 -- 国内项目
	public void accessNumDisuse(String regionId, String billId, long opId, long orgId) throws Exception;

	// 集团号码查询 -- 国内项目
	public int qryAccessNumCount(long resSpecId, String billId, String regionId, long opId) throws Exception;

	// -- 国内项目
	public IBOResAccessNumOriginValue[] qryAccessNum(long resSpecId, String billId, String regionId, long opId, int start, int end) throws Exception;

	/*---------------------------------------------------SIM卡对外接口汇总 END------------------------------------------------------*/

	/*---------------------------------------------------ViaPlay对外接口汇总 END------------------------------------------------------*/
	/**
	 * 给订单的选ViaPlay接口  --- for Telenor DK
	 * @param inputMap
	 * 参数说明：参数类型Map
	 *      key="resSpecId" value类型：String ViaPlay类型：	ResConst.VIAPLAY_VOUCHER_SPEC_ID_3M（1.3M）、
	 *      											ResConst.VIAPLAY_VOUCHER_SPEC_ID_12M（2.12M）					（*必填）***********
	 * 		key="numbers" value类型：String 需要ViaPlay数量	（*必填）***********
	 * 		key="custId" value类型：String 证件编号、客户编号、等客户唯一标识											（*必填）***********
	 *      key="orgId" value类型：String 操作员组织
	 * 		key="opId" value类型：String 操作员
	 *   出参：  预占后的ViaPlay对象
                value.getSeqId()获取ViaPlay Id，
		        value.getVoucherCode()获取ViaPlay的内容。
		        value.getResSpecId()获取ViaPlay规格
		        value.getManageStatus()获取ViaPlay状态。
		        value.getReceiver()获取占用此ViaPlay的客户ID。
	 * @return
	 * @throws Exception
	 * @author gaoxd
	 * @createDate 2016-6-16下午7:13:47
	 */
	public IBOResViaplayVoucherValue[] searchViaPlayValues(Map inputMap) throws Exception;
	
	/**
	 * 给订单的ViaPlay更改状态接口  --- for Telenor DK
	 * @param voucherCode 开始号码                                                                                                   （*必填）***********
	 * @param custId 客户ID                                   （*必填）***********        
	 * @param operType  1.将voucher状态更新为Activated状态                              （*必填）***********
                        2.将voucher状态更新为Deactivated状态
	 * @return
	 * @throws Exception
	 * @author gaoxd
	 * @createDate 2016-6-16下午7:13:47
	 */
	public void changeViaPlayVoucher(String voucherCode, String custId, String operType) throws RemoteException, Exception;
	
	/**
	 * 给订单的ViaPlay更改状态接口  --- for Telenor DK
	 * @param voucherId voucher主键                                                                                                   （*必填）***********
	 * @param custId 客户ID                                   （*必填）***********        
	 * @return
	 * @throws Exception
	 * @author gaoxd
	 * @createDate 2016-6-16下午7:13:47
	 */
	public void changeViaPlayState(String voucherId, String custId) throws RemoteException, Exception;
	/**
	 * 根据条件：查询销户号码 --- for Telenor
	 * @param billId  服务号码 	（*必填）***********
	 * @param custId  客户编号 	（*必填）***********
	 * @param resSpecId 
	 * @param regionId 			（*可空）***********
	 * @param orgId 			（*可空）***********
	 * @param opId 				（*可空）***********
	 * @param inputMap 
	 *            : key------operType：1.本网号码，2.携转号码，3.所有号码
	 * @throws Exception
	 * @throws RemoteException
	 * 2014-10-14
	 */
	public IBOResPhoneNumUsedValue[] qryTerminationPhones(String billId, String custId, String resSpecId, String regionId, long orgId, long opId, Map inputMap) throws Exception, RemoteException;
	
	/**
	 * 内部需求
	 * 更改res_pone_num_used表的USE_DATE字段到冷冻天前，使号码能够立即冷号回收，
	 * 同时添加标记30050：冷号回收，页面提交数据时候标识
	 * 同时receiver字段往birthday_tag保存一下
	 * @param phoneNumberUsedValue
	 * @param pageFlag
	 * @param newCustId
	 * @throws RemoteException
	 * @throws Exception
	 */
	public void updateUseDateInUsedTable(IBOResPhoneNumUsedValue phoneNumberUsedValue,String pageFlag,String newCustId) throws RemoteException, Exception;
	
	/**
	 * 内部需求
	 * 将号码预占/预留到指定custId下：预占时间为3个月
	 * 		如果number在used表，则删除已用表数据，copy到未用表，预占/预留到指定客户下；如果number在未用表，直接预占/预留到指定客户下
	 * 		
	 * 		如果custType是B2C，则manage_status改成3；如果custType是B2B，则manage_status改成4
	 * @param number
	 * @param custId
	 * @param custType
	 * @throws RemoteException
	 * @throws Exception
	 */
	public void updateReceiverInRes(String number,String custId,String custType) throws RemoteException, Exception;
	
	public IBOResSimCardUsedValue getUsingSimCardInfoByBillId(String billId) throws RemoteException, Exception;
	
	/**
	   *  BMRT-3792  查询CRM系统资源侧可以携转的号码
	   * @param customerId
	   * @param combination		号码模式，可以根据匹配符模糊匹配号码，“*”标识匹配多个占位符，“？”标识匹配一个占位符
	   * @param portOut		携转标志
	   * @param numberType	号码类型，1000或者1001
	   * @param offset		跳过第offset个号码
	   * @param limit		返回的号码个数
	   * @return
	   * @throws Exception
	   * @throws RemoteException
	   */
	  public List<Map<String,String>> getPortingNumberInfo(String customerId,String combination,String portOut,String numberType,int offset,int limit) throws Exception, RemoteException;
	  
	  /**
	   * BMRT-3792  更新CRM系统资源侧号码的携转标志	
	   * @param paraList	
	   * 		结构：	paraList<Map<String,String>>
	   * @throws Exception
	   * @throws RemoteException
	   */
	  public void updatePortingNumberInfo(List paraList) throws Exception, RemoteException;
}