package com.asiainfo.crm.res.phone.service.interfaces;

import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.ai.appframe2.common.DataStructInterface;
import com.asiainfo.crm.res.common.valuebean.PhoneBean;
import com.asiainfo.crm.res.phone.ivalues.IBOResPhoneNumOriginValue;
import com.asiainfo.crm.res.phone.ivalues.IBOResPhoneNumUsedCallBakValue;
import com.asiainfo.crm.res.phone.ivalues.IBOResPhoneNumUsedValue;
import com.asiainfo.crm.res.phone.ivalues.IBOResSelNumCustLogValue;
import com.asiainfo.crm.res.rescfg.ivalues.IBOResPhoneLevelDefineValue;
import com.asiainfo.crm.res.rescfg.ivalues.IBOResStoreValue;

/**
 * 
 * Copyright: Copyright (c) 2010 Asiainfo-Linkage
 * 
 * @ClassName: IResPhoneNumFSV.java
 * @Description: 号码资源对外接口
 * 
 * @version: v1.0.0
 * @author: lvyh
 * @date: Dec 30, 2010 10:08:02 AM
 * 
 * Modification History: Date Author Version Description
 * ---------------------------------------------------------* 
 * Feb 20, 2011 lvyh
 * v1.0.0 修改原因
 */
public interface IResPhoneNumFSV
{
	/**
	 * 
	 * @param phoneNum 手机号码 2012-6-1
	 * @param imsi imsi号
	 * @param orgId 组织Id
	 * @param busiId 操作Id
	 * @param offerId 套餐Id
	 * @param operType 操作类型（1.预付费 0.后付费）
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void phoneBandWithSimCard(String phoneNum, String imsi, long orgId, String busiId, String offerId, String operType) throws Exception, RemoteException;

	public String getResTypeByResSpecId(long resSpecId) throws Exception;

	public void occupiedPhoneNumRollBack(String billId, String regionId, long orgId, long opId) throws Exception;

	/**
	 * 根据号码查询号码所属仓库信息
	 * 
	 * @param resId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IBOResStoreValue getResStoreValueByResId(String resId) throws Exception, RemoteException;

	/**
	 * 号码销户（将占用号码变成回收状态） 2012-5-22
	 * 
	 * @param resId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map cancelOccupyResPhoneNum(String resId) throws Exception, RemoteException;

	/**
	 * 查询可选号码
	 * 
	 * @param busiCode业务代码,必填
	 * @param selType选号类型.1：特征选号，2：随机选号 必填
	 * @param regionId号码归属地区--必填
	 * @param countyId号码归属县市
	 * @param specialCode特征码--必填
	 * @param reservFee如果为空表示，不做限制； 如果为单个数字则为大于等于该数字； 如果为一个范围，中间用分隔符－分割，如0-100，100-200，200-500，表示取这之间的号码(包括上下限阀值)
	 * @param resLevel号码档次
	 * @param resSum号码数量--必填
	 * @param tradeMark品牌条件
	 * @param orgId必填
	 * @param opId必填
	 * @return Map
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map selectPhoneNum(String busiCode, String selType, String regionId, String countyId, String specialCode, String reservFee, String resLevel, int resSum, String tradeMark, String orgId, String opId) throws Exception, RemoteException;

	/**
	 * 唯一：号码预占
	 * @param billIds 需要预占的号码
	 * @param reserveType 资源预占类型(0-普通营业厅开户15-有线固话号码新装普通预占时长 99-集团号码预占)
	 * @param tempStr 可空
	 * @param custCardType 证件类型
	 * @param custCardNo 证件编号
	 * @param resType 可空
	 * @param resSpecId 资源规格
	 * @param regionId 地区编号
	 * @param opId 操作员编号
	 * @param orgId 组织编号
	 * @param leadingNum 总机号码
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map phoneNumPreOccupy(String[] billIds, String reserveType, String tempStr, String custCardType, String custCardNo, String resType, 
			String resSpecId, String regionId, long opId, long orgId, String leadingNum) throws Exception, RemoteException;

	/**
	 * B2B预占号码
	 * @param billId 需要预占的号码
	 * @param custCardType 证件类型
	 * @param certNo 证件编号
	 * @param digitalTag 号段名称
	 * @param reserveType 资源预占类型:90-集团号码预占
	 * @param leadingNum 主号码
	 * @param opId 操作员编号
	 * @param orgId 组织编号
	 * @param doneCode 操作编号
	 * @param doneDate 操作日期
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IBOResPhoneNumOriginValue phoneNumPreOccupyForB2B(String billId, String custCardType, String certNo, String digitalTag, String reserveType, String leadingNum, long opId, long orgId, long doneCode, Timestamp doneDate) throws Exception, RemoteException;
	
	
	/**
	 * 大量:号码预占 
	 * @param values 号码对象
	 * @param reserveType 资源预占类型(0-普通营业厅开户15-有线固话号码新装普通预占时长 99-集团号码预占)
	 * @param preOccupyType 可空
	 * @param custCardType 证件类型
	 * @param custCardNo 证件编号
	 * @param resType 可空
	 * @param resSpec 资源规格
	 * @param regionId 地区编号
	 * @param opId 操作员编号
	 * @param orgId 组织编号
	 * @param leadingNum 总机号码
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map bulkPhoneNumPreOccupy(IBOResPhoneNumOriginValue[] values, String reserveType, String preOccupyType, String custCardType, 
			String custCardNo, String resType, String resSpec, String regionId, long opId, long orgId, String leadingNum) throws Exception, RemoteException;
	
	
	/**
	 * 网上选号
	 * 
	 * @param interType
	 *            接口类型 1 网上选号；
	 *            2自助选号； 
	 *            3 电子商务选号；
	 *            4:188号段新增预约； 
	 *            5:修改预约,只修改预约老号码； 
	 *            6:检查188号段预约身份证是否有效； 
	 *            7:检查188号段预约老号码是否有效
	 * @param regionId
	 *            归属地市
	 * @param countyId
	 *            号码归属县市（可选）
	 * @param certType
	 *            身份证类型(固定为1 接口类型为7时,可选, 其它:必填)
	 * @param certNo
	 *            身份证号码(接口类型7时,可选, 其它:必填)
	 * @param billId
	 *            选定的号码（接口类型为6、7时可选，其他必填）
	 * @param orgId
	 *            可受理营业厅组织编号（接口类型为5、6、7时可选）
	 * @param orderId
	 *            预约订单编号（只适用接口类型为4,可选）
	 * @param oldBillId
	 *            预约老号码（接口类型为5时，必填,填新的预约老号码。接口类型为7，必填其他可选）
	 * @param doneCode
	 *            号码临时预约流水号（可选）
	 * @param pubInfo
	 *            Map 公共信息
	 * @return Map
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map networkSelectPhoneNum(String interType, String regionId, String countyId, String certType, String certNo, String billId, 
			String orgId, String orderId, String oldBillId, String doneCode, Map pubInfo) throws Exception, RemoteException;

	/**
	 * 号码临时预约
	 * 
	 * @param interType
	 *            接口类型 3、电子商务 2、自助选号 4、188抢号
	 * @param regionId
	 *            归属地市
	 * @param countyId
	 *            号码归属县市
	 * @param billId
	 *            选定的手机号码
	 * @param pubInfo
	 *            Map 公共信息
	 * @return Map
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map tempReservePhoneNum(String interType, String regionId, String countyId, String billId, Map pubInfo) throws Exception, RemoteException;

	/**
	 * 选号或释放锁定号码
	 * 
	 * @param busiCode
	 *            必填,业务代码 118007
	 * @param interType
	 *            INTF_TYPE必填， 1：只选号2：只释放锁定号码 3：选号和释放号码同时进行
	 * @param regionId
	 *            归属地市
	 * @param countyId
	 *            必填， 选号县市
	 * @param tradeMark
	 *            选号时，品牌，选号时使用，1：全球通；0：其他
	 * @param reserveFee
	 *            选号时，预存话费，选号使用，是一个范围， 如果为空表示，不做限制； 
	 *            如果为单个数字则为大于等于该数字； 
	 *            如果为一个范围，中间用分隔符－分割，如0-100，100-200，200-500，表示取这之间的号码(包括上下限阀值)。
	 * @param selectMode
	 *            选号时，选号模式，1：特征码；2：随机选号
	 * @param markCode
	 *            选号时，特征码，特征码选号时，匹配模式：％特征码,其位长最大可11位
	 * @param lockNum
	 *            选号时，返回的号码数量 ，如果为0，则只做释放，不做选号，且释放列表不能空；
	 *            不为0且释放号码列表为空，则只做选号；
	 *            不为0且释放号码列表不为空，则选号＋释放号码
	 * @param unlockPhone
	 *            要释放号码的，号码列表，以”|”分割
	 * @param acceptOrgId
	 *            必填，可受理营业厅组织编号
	 * @param pubInfo
	 *            Map 公共信息
	 * @return Map
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map selOrCancelPhoneNum(String busiCode, String interType, String regionId, String countyId, String tradeMark, String reserveFee, String selectMode, String markCode, String lockNum, String unlockPhone, String acceptOrgId, Map pubInfo) throws Exception, RemoteException;

	/**
	 * 可选号码检查并临占接口
	 * 
	 * @param interType String 接口类型(必填1)
	 * @param billId String 手机号码
	 * @param pubInfo
	 *            Map 公共信息
	 * @return Map
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map preOccupyPhoneNum(String interType, String billId, Map pubInfo) throws Exception, RemoteException;

	/**
	 * 根据手机号码、证件类型、证件编号、地区编码、组织编号、操作员编号进行手机号码预占
	 * 
	 * @param billId
	 * @param certType
	 * @param certNo
	 * @param regionId
	 * @param orgId
	 * @param opId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public boolean gsmNumPreOccupy(String billId, long certType, String certNo, String regionId, long orgId, long opId, String reserveType, String leadingNum) throws Exception, RemoteException;

	public IBOResPhoneNumOriginValue phonePreOccupyWithChannelId(String billId, long certType, String certNo, String channelId, String regionId, long orgId, long opId, String reserveType, Map inputMap) throws Exception, RemoteException;

	public IBOResPhoneNumOriginValue phonePreOccupy(String billId, String resSpecId, long certType, String certNo, String regionId, long orgId, long opId, String reserveType,Map inputMap) throws Exception, RemoteException;

	public IBOResPhoneNumOriginValue phonePreOccupyWithIccId(String billId, String resSpecId, long certType, String certNo, String regionId, String iccId, long orgId, long opId, String reserveType) throws Exception, RemoteException;

	/**
	 * 根据手机号码、证件类型、证件编号、地区编码、组织编号、操作员编号进行手机号码预占取消
	 * 
	 * @param billId
	 * @param certType
	 * @param certNo
	 * @param regionId
	 * @param orgId
	 * @param opId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public boolean cancelPreOccupyGsmNum(String billId, long certType, String certNo, String regionId, long orgId, long opId) throws Exception, RemoteException;

	// ×××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××
	// 唯一 预占取消 接口: 根据手机号码、订单编码、组织编号、操作员、资源规格、地区编码、SIM卡号进行手机 释放 --- for Telenor
	// ×××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××
	// 增加查询条件 SEC_ORG_ID 涉及wholesale业务 -- for Telenor 项目
	public boolean cancelPreOccupyOrReserveNum(String regionId, String billId, long dataId, String channelId, long orgId, long opId, String reserveType) throws Exception, RemoteException;

	/**
	 * 根据手机号码、规格、流水号、组织编号、操作员编号进行手机号码预占取消 2012-5-12
	 * 
	 * @param billId
	 * @param certType
	 * @param certNo
	 * @param regionId
	 * @param orgId
	 * @param opId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map cancelPreOccupyNum(String billId, String resCode, String resSpecId, long certType, String certNo, String orderCode, String regionId, long orgId, long opId) throws Exception, RemoteException;

	public IBOResPhoneNumOriginValue phoneNumReserve(String billId, String certType, String certNo, String regionId, long opId, long orgId, String reserveType) throws Exception, RemoteException;

	public void phoneNumInTransit(String billId, String regionId, long opId, long orgId, String reserveType) throws Exception, RemoteException;

	/**
	 * 新增 or 更新 选号记录表 -- for Telenor
	 * @涉及业务：号码页面修改、选号、预占等等操作
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IBOResSelNumCustLogValue updateLastestCustLogOrSaveByResId(IBOResPhoneNumOriginValue value, String secOrgId, long orgId, long opId, long doneCode, Timestamp doneDate, Timestamp preDate, String certType, String certNo, String reserveType, String leadingNum) throws Exception, RemoteException;
	
	/**
	 * 对客户查询锁定的号码进行释放 -- for Telenor
	 * 2015-10-13 15:21
	 */
	public void cancelLockedNums(String billId, String certType, String certNo, Map inputMap) throws Exception, RemoteException;
	
	
	/**
	 * 根据手机号码、资源规格、组织编号、操作员编号进行手机号码实占取消。2012-5-25
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
	 */
	public void cancelOccupyPhoneNum(String billId, String resCode, String resSpecId, String regionId, long orgId, long opId) throws Exception, RemoteException;

	/**
	 * 
	 * 验证有线铁通固话号码是否属于当前操作员
	 * 
	 * @param billId
	 * @param regionId
	 * @param countyId
	 * @param orgId
	 * @param opId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public boolean fixNumIsOperator(String billId, String regionId, String countyId, long orgId, long opId) throws Exception, RemoteException;

	/**
	 * 根据手机号码、证件类型、证件编号、地区编码、组织编号、操作员编号进行手机号码预占取消
	 * 
	 * @param billId
	 * @param regionId
	 * @param orgId
	 * @param opId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public boolean cancelPreOccupyNumPkgs(String billId, String regionId, long orgId, long opId) throws Exception, RemoteException;

	/**
	 * 根据手机号码、订单编码、组织编号、操作员及地区编码进行手机号码实占
	 * 
	 * @param billId
	 * @param simCardNo
	 * @param orderCode
	 * @param regionId
	 * @param orgId
	 * @param opId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public boolean gsmNumOccupy(String billId, String simCardNo, String orderCode, String regionId, long orgId, long opId, String reserveType) throws Exception, RemoteException;

	/**
	 * 根据手机号码、订单编码、组织编号、操作员、资源规格、地区编码、SIM卡号进行手机号码实占
	 * 
	 * @param billId
	 * @param simCardNo
	 * @param orderCode
	 * @param resSpec
	 * @param regionId
	 * @param orgId
	 * @param opId
	 * @param reserveType
	 * @return
	 * @throws Exception
	 */
	public boolean phoneNumOccupy(String billId, String simCardNo, String reserveType, String regionId, long orgId, long opId) throws Exception;

	public boolean phoneNumOccupyFromFreeze(String billId, String simCardNo, String orderCode, String regionId, long orgId, long opId) throws Exception;

	/**
	 * 根据手机号码、订单编码、组织编号、操作员及地区编码进行手机号码实占(换号不换卡) --
	 * 
	 * @param billId
	 * @param simCardNo
	 * @param orderCode
	 * @param regionId
	 * @param orgId
	 * @param opId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public boolean gsmNumOccupyForChangePhone(String billId, String simCardNo, String orderCode, String regionId, long orgId, long opId) throws Exception, RemoteException;

	/**
	 * 根据手机号码、订单编码、组织编号、操作员及地区编码进行手机号码批量实占
	 * 
	 * @param billId
	 * @param simCardNo
	 * @param orderCode
	 * @param regionId
	 * @param orgId
	 * @param opId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public boolean gsmNumBatchOccupy(String billId, String simCardNo, String orderCode, String regionId, long orgId, long opId) throws Exception, RemoteException;

	/**
	 * 根据手机号码、证件号码、组织编号、操作员及地区编码进行号码包批量预占
	 * 
	 * @param billId
	 * @param simCardNo
	 * @param orderCode
	 * @param regionId
	 * @param orgId
	 * @param opId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map numPkgBatchPreOccupy(String[] billIds, long certType, String certNo, String regionId, long destOrgId, long orgId, long opId) throws Exception, RemoteException;

	/**
	 * 集团号码预占 2012-3-8
	 * 
	 * @param values
	 * @param regionId
	 * @param countyId
	 * @param reserveType
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map groupNumPreOccupy(String[] billIds, String regionId, String resSpecId, String opId, String orgId, String reserveType, long certType, String certNo) throws Exception, RemoteException;

	public Timestamp getPreDate(String reserveType, String regionId, Timestamp currDate) throws Exception, RemoteException;

	/**
	 * 根据手机号码、地区编码、组织编号、操作员编号进行固话号码预占
	 * 
	 * @param billId
	 * @param regionId
	 * @param orgId
	 * @param opId
	 * @param reserveType
	 * @throws Exception
	 * @throws RemoteException
	 */
	public boolean fixNumPreOccupy(String billId, String regionId, long orgId, long opId, String reserveType) throws Exception, RemoteException;

	/**
	 * 根据手机号码、地区编码、组织编号、操作员编号释放固话号码预占
	 * 
	 * @param billId
	 * @param regionId
	 * @param orgId
	 * @param opId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public boolean cancleFixNumPreOccupy(String billId, String regionId, long orgId, long opId) throws Exception, RemoteException;

	/**
	 * 根据手机号码、地区编码、组织编号、操作员编号释放固话号码预占--固话比较特殊，实占后亦能释放
	 * 
	 * @param billId
	 * @param regionId
	 * @param orgId
	 * @param opId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public boolean cancleFixNumOccupy(String billId, String regionId, long orgId, long opId) throws Exception, RemoteException;

	/**
	 * 根据手机号码、订单编码、组织编号、操作员及地区编码进行固话号码实占
	 * 
	 * @param billId
	 * @param certTyp
	 * @param certType
	 * @param regionId
	 * @param orgId
	 * @param opId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public boolean fixNumOccupy(String billId, long certType, String certNo, String regionId, long orgId, long opId) throws Exception, RemoteException;

	/**
	 * 根据手机号码、地区编码、组织编号、操作员编号进行行业应用号码预占
	 * 
	 * @param billId
	 * @param regionId
	 * @param orgId
	 * @param opId
	 * @param reserveType
	 * @throws Exception
	 * @throws RemoteException
	 */
	public boolean industryNumPreOccupy(String billId, String regionId, long orgId, long opId, String reserveType, String leadingNum) throws Exception, RemoteException;

	/**
	 * 根据手机号码、地区编码、组织编号、操作员编号释放行业应用号码预占
	 * 
	 * @param billId
	 * @param regionId
	 * @param orgId
	 * @param opId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public boolean cancleIndustryNumPreOccupy(String billId, String regionId, long orgId, long opId) throws Exception, RemoteException;

	/**
	 * 根据手机号码、组织编号、操作员及地区编码进行行业应用号码实占
	 * 
	 * @param billId
	 * @param regionId
	 * @param orgId
	 * @param opId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public boolean industryNumOccupy(String billId, String regionId, long orgId, long opId) throws Exception, RemoteException;

	/**
	 * 查询手机号码在未用、已用表是否存在
	 * 
	 * @throws Exception
	 * @throws RemoteException
	 * 2014-08-08
	 */
	public boolean checkNumberExists(String billId, String regionId, String resSpecId) throws Exception, RemoteException;

	/**
	 * 根据手机号码、地区编码、组织编号、操作员编号释放行业应用号码预占
	 * 
	 * @param billId
	 * @param regionId
	 * @param orgId
	 * @param opId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public boolean cancleIndustryNumOccupy(String billId, String regionId, long orgId, long opId) throws Exception, RemoteException;

	/**
	 * 根据手机号码获取已用的手机号码相关信息
	 * 
	 * @param billId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	// 增加查询条件，SEC_ORG_ID 涉及wholesale业务  -- for Telenor 项目 
	public IBOResPhoneNumUsedValue getUsedPhoneNumInfo(String billId, String regionId) throws Exception, RemoteException;

	/**
	 * 根据手机号码、地区编码获取手机号码信息
	 * 
	 * @param billId
	 * @param regionId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IBOResPhoneNumOriginValue getResPhoneNumValueByBillId(String billId, String regionId) throws Exception, RemoteException;

	/**
	 * 预销户：将号码状态设置为冷冻:集团号码销户，for Telenor
	 * @param billId
	 * @param regionId
	 * @param orgId
	 * @param opId
	 * @param parmMap
	 *            : key------disType：1.继续使用，2.购买订单放弃（将选号记录表预占时间修改为当前时间）
	 * @throws Exception
	 * @throws RemoteException
	 * 2014-05-29
	 */
	public void phoneNumPreDisuse(String billId, String regionId, long orgId, long opId, Map parmMap) throws Exception, RemoteException;
	
	/**
	 * 实销：实际销户，号码冷号回收  -- for Telenor
	 * @param billId
	 * @param regionId
	 * @param orgId
	 * @param opId
	 * @param parmMap
	 *            : key------disType：1.继续使用，2.购买订单放弃（将选号记录表预占时间修改为当前时间）
	 * @throws Exception
	 * @throws RemoteException
	 * 2014-05-29
	 */
	public void phoneNumDisuse(String billId, String regionId, long orgId, long opId, Map parmMap) throws Exception, RemoteException;
	

	public boolean checkIfPhoneNumMatchSimCard(String billId, String imsi, String regionId) throws Exception, RemoteException;

	/**
	 * 根据手机号码、地区编号查询号码管理状态
	 * 
	 * @param regionId
	 * @param billId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public String getNumManageStatus(String billId, String regionId) throws Exception, RemoteException;

	/**
	 * 更新已用号码SIM卡信息
	 * 
	 * @param billId
	 * @param newSimCardNo
	 * @param regionId
	 * @param orgId
	 * @param opId
	 * @param flag
	 *            1 换卡换号用 2备卡激活用
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void updateUsedPhoneInfo(String billId, String newSimCardNo, String regionId, long orgId, long opId, String flag) throws Exception, RemoteException;

	/**
	 * 
	 * 
	 * @param:billId
	 * @param:regionId
	 * @return：可以重入网true,不可以重入网false
	 * @throws：Exception,RemoteException
	 * 
	 */
	public boolean phoneNumIsReUse(String billId, String regionId) throws Exception, RemoteException;

	/**
	 * 手机号码销号
	 * 
	 * @param billId
	 * @param regionId
	 * @param orgId
	 * @param opId
	 * @param isVip
	 *            0不是大客户 1是大客户
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void phoneNumDestory(String billId, String regionId, long orgId, long opId, int isVip) throws Exception, RemoteException;

	/**
	 * 固网IMS号码销号，需要特殊处理
	 * 
	 * @param billId
	 * @param regionId
	 * @param orgId
	 * @param opId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void imsFixNumDestory(String billId, String regionId, long orgId, long opId) throws Exception, RemoteException;

	/**
	 * 手机号码重入网
	 * 
	 * @param billId
	 * @param newSimCardNo
	 * @param regionId
	 * @param orgId
	 * @param opId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void phoneNumReUse(String billId, String newSimCardNo, String regionId, long orgId, long opId) throws Exception, RemoteException;

	/**
	 * 手机号码重入网
	 * 
	 * @param billId
	 * @param newSimCardNo
	 * @param regionId
	 * @param orgId
	 * @param opId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void phoneNumReUseByOldSim(String billId, String newSimCardNo, String regionId, long orgId, long opId) throws Exception, RemoteException;

	/**
	 * 手机号码回收
	 * 
	 * @param billId
	 * @param orgId
	 * @param opId
	 * @param regionId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map phoneNumCallBack(String billId, long orgId, long opId, String regionId) throws Exception, RemoteException;

	/**
	 * 批量手机号码回收
	 * 
	 * @param billIds
	 * @param orgId
	 * @param opId
	 * @param regionId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void batchPhoneNumBack(String[] billIds, long orgId, long opId, String regionId) throws Exception, RemoteException;

	/**
	 * 电子商务预开户号码回收
	 * 
	 * @param billId
	 * @param orgId
	 * @param opId
	 * @param regionId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public void phoneECNumCallBack(String billId, long orgId, long opId, String regionId) throws Exception, RemoteException;

	/**
	 * 号码是否审批校验
	 * 
	 * @param billId
	 * @param regionId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public boolean isPhoneApprove(String billId, String regionId) throws Exception, RemoteException;

	/**
	 * 选号时返回号码所属品牌、套餐、预缴、号码档次信息
	 * 
	 * @param billId
	 * @param regionId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public PhoneBean getPhoneBeanForSelNum(String billId, String regionId) throws Exception, RemoteException;

	/**
	 * 根据地市编号、证件类型、证件号码返回当前预占且未过期的号码信息
	 * 
	 * @param regionId
	 * @param certType
	 * @param certNo
	 * @throws Exception
	 * @throws RemoteException
	 */
	public PhoneBean getSelNumValueByCertNo(String regionId, String orgId, String certType, String certNo) throws Exception, RemoteException;

	/**
	 * 根据地市编号、操作员编号返回当前预占且未过期的号码信息
	 * 
	 * @param regionId
	 * @param opId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public PhoneBean getSelNumValueByOpId(String regionId, String orgId, String opId) throws Exception, RemoteException;

	/**
	 * 根据地市编号、操作员编号或者证件类型、证件号码返回当前预占且未过期的号码信息
	 * 
	 * @param regionId
	 * @param opId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public PhoneBean getPreHoldNumValueByCertNo(String regionId, String orgId, String certType, String certNo, String opId) throws Exception, RemoteException;

	/**
	 * 根据手机号码和地市检索已用号码
	 * 
	 * @param billId
	 * @param regionId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IBOResPhoneNumUsedValue[] qryResPhoneNumUsedValue(String billId, String regionId) throws Exception, RemoteException;

	/**
	 * 根据手机号码、地区编码、组织编号、操作员编号进行手机号码预占-批量操作有线固话
	 * 
	 * @param billIds
	 * @param regionId
	 * @param orgId
	 * @param opId
	 * @param reserveType
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map batchFixNumPreOccupy(String[] billIds, String regionId, long orgId, long opId, String reserveType) throws Exception, RemoteException;

	/**
	 * 根据手机号码、证件类型、证件编号、地区编码、组织编号、操作员编号进行手机号码实占-批量操作有线固话
	 * 
	 * @param billIds
	 * @param certType
	 * @param certNo
	 * @param regionId
	 * @param orgId
	 * @param opId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map batchFixNumOccupy(String[] billIds, long certType, String certNo, String regionId, long orgId, long opId) throws Exception, RemoteException;

	/**
	 * 根据手机号码、地区编码、组织编号、操作员编号进行手机号码预占取消-批量操作有线固话
	 * 
	 * @param billIds
	 * @param regionId
	 * @param orgId
	 * @param opId
	 * @throws Exception
	 * @throws RemoteException
	 */
	public boolean cancelBatchFixNumPreOccupy(String[] billIds, String regionId, long orgId, long opId) throws Exception, RemoteException;

	/**
	 * 根据手机号码、地区编码获取批量号码档次---实时匹配号码获取档次，不能查询号码表
	 * 
	 * @param billIds
	 * @param regionId
	 * @return IBOResPhoneNumOriginValue[]
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IBOResPhoneNumOriginValue[] getBatchNumLevels(List numList, String regionId) throws Exception, RemoteException;

	/**
	 * 校验手机号码和SIM卡号HLR是否一致
	 * 
	 * @param billId
	 * @param iccId
	 * @param regionId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public boolean checkHlrValid(String billId, String iccId, String regionId) throws Exception, RemoteException;

	/**
	 * 根据身份证号查询选号信息
	 * 
	 * @param:String custCardNo
	 * @param:String regionId
	 * @throws Exception
	 * @throws RemoteException
	 * 
	 */
	public IBOResSelNumCustLogValue[] getCurrDayPhoneByCustCardNo(String custCardNo, String regionId) throws Exception, RemoteException;

	/**
	 * 根据身份证号查询连续N天选号信息
	 * 
	 * @param:String cardNo
	 * @param:String regionId
	 * @throws Exception
	 * @throws RemoteException
	 * 
	 */
	public IBOResSelNumCustLogValue[] getDistanceDayPhoneByCustCardNo(String custCardNo, String regionId, int days) throws Exception, RemoteException;

	/**
	 * 根据地市获取号码档次列表
	 * 
	 * @param regionId
	 * @return：IBOResPhoneLevelDefineValue[]
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IBOResPhoneLevelDefineValue[] getPhoneNumLevelValues(String regionId) throws Exception, RemoteException;

	/**
	 * 获取号码包组包资源
	 * 
	 * @param regionId
	 * @return：List
	 * @throws Exception
	 * @throws RemoteException
	 */
	public List getPhoneNumPkgValues(String orgId, String opId, String regionId, String[] billIds, Map levelNumMap) throws Exception, RemoteException;

	/**
	 * 获取号码包组包资源
	 * 
	 * @param regionId
	 * @return：List
	 * @throws Exception
	 * @throws RemoteException
	 */
	// public List getPhoneNumPkgValues(String orgId, String opId, String regionId,BOBillIdsBean [] beans, Map levelNumMap) throws Exception, RemoteException;

	/**
	 * 获取固话类型未用号码信息
	 * 
	 * @param String
	 *            regionId
	 * @param String
	 *            res_id
	 * @return：List
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IBOResPhoneNumOriginValue getFixOriginPhoneMsg(String res_id, String regionId) throws Exception, RemoteException;

	/**
	 * 电商划拨接口
	 * 
	 * @Function: transferResPhone
	 * @param resId
	 * @param originalOrgId
	 * @param purposeOrgId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @Version: v1.0.0
	 * @Author: YangJian
	 * @Date: 2011-10-26 下午03:50:32
	 */
	public boolean transferResPhone(String resId, long originalOrgId, long purposeOrgId) throws Exception, RemoteException;

	public IBOResPhoneNumOriginValue[] queryOriginNums(String regionId, String resId, long secOrgId, long resStoreId, String manageStatus, long doneCode, long tradeId, long offerId, long selPriceMode, long isConfirm, String beautifualTag) throws Exception;
	public IBOResPhoneNumOriginValue[] qryResNumOriginInfos(String begId,String endId,int start,int end) throws Exception,RemoteException;
	public int qryResNumOriginInfosCount(String begId,String endId) throws Exception,RemoteException;
	public IBOResPhoneNumOriginValue[] qryResNumOriginListInfos(List list,int start,int end) throws Exception,RemoteException;
	public int qryResNumOriginListInfosCount(List list) throws Exception,RemoteException;
	public IBOResPhoneNumUsedValue[] queryUsedNums(String regionId, String resId, long secOrgId, long resStoreId, String manageStatus, long doneCode, long tradeId, long offerId, long selPriceMode, long isConfirm, String beautifualTag) throws Exception;
    public void  updateNumOriginValue(String begId,String endId) throws Exception,RemoteException;
    public void  updateNumOriginListValue(List list) throws Exception,RemoteException;
	/**
	 * 集团号码查询 2012-4-18
	 * 
	 * @param parMap
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IBOResPhoneNumOriginValue[] getGroupPhoneInfos(HashMap parMap) throws Exception, RemoteException;

	/**
	 * 号码购买 2012-5-21
	 * 
	 * @param opId
	 * @param orgId
	 * @param custCardNo
	 * @param custCardType
	 * @param billId
	 * @throws Exception
	 * @throws RemoteException
	 * @Date: 2012-05-04
	 */
	public Map isPhoneNumActive(String resId) throws Exception;

	
	public void extSave(DataStructInterface[] values) throws Exception, RemoteException;

	/**
	 * 号码回收：重要接口 -- for Telenor
	 * @param origin
	 * @param bak
	 * @param used
	 * @throws Exception
	 * @throws RemoteException
	 * 2014-11-06 20:28
	 */
	public void phoneRecycle(IBOResPhoneNumOriginValue origin, IBOResPhoneNumUsedCallBakValue bak, IBOResPhoneNumUsedValue used) throws Exception, RemoteException;

	/**
	 * 营业选号页面，选号查询count
	 * @return
	 * @throws Exception
	 */
	public int queryNumForSelCount(int useType, String regionId, long resSpecId, long secOrgId, long resStoreId, long chooseLevel, long resLevel, 
			long patterId, String resId, String begMSISDN, String endMSISDN, boolean isShare, long amount, String imsi, long tradeId, String custCardNo, boolean isRandom, int hasSimCard) throws Exception;
	
	/**
	 * 营业选号页面，选号查询infos
	 * 开户选号使用、重要！！
	 * @return
	 * @throws Exception
	 */
	public IBOResPhoneNumOriginValue[] queryNumForSel(int useType, String regionId, long resSpecId, long secOrgId, long resStoreId, long chooseLevel, long resLevel, 
			long patterId, String resId, String begMSISDN, String endMSISDN, boolean isShare, long amount, String imsi, long tradeId, String custCardNo, boolean isRandom, int hasSimCard, int start, int end) throws Exception;

	/**
	 * @desc 号码携入 相关接口  --- for Telenor
	 * 1.号码携入申请：(本网情况)校验前：号码未用表数据为空，已用表有数据并且PortStatus状态为：12本网号码：已经携出 Ported Out [POU]
	 * 		                                         改正后：已用表数据转移到未用表，ManageStatus改为：3 or 4，PortStatus状态改为：13本网号码：待携入 Under Port In [UPI]；号码已用表数据删除
	 *           (他网情况)校验前：未用、已用表 都没数据
	 *		                                       改正后：根据参数在未用表生产号码，ManageStatus改为：3 or 4，PortStatus状态改为：23他网号码：待携入 Under Port In [UPI]
	 * 2.号码携入取消:(本网情况)校验前：号码未用表有数据并且PortStatus状态为：13本网号码：待携入 Under Port In [UPI]
	 * 		                                         改正后：未用表数据转移到已用表，PortStatus状态改为：12本网号码：已经携出 Ported Out [POU]；号码未用表数据删除
	 *           (他网情况)校验前：号码未用表有数据并且PortStatus状态为：23他网号码：待携入 Under Port In [UPI]
	 *		                                       改正后：号码未用表数据删除,保存到号码历史表
	 * 3.号码携入确认:携入申请的号码，开户后，才能做携入确认操作（号码携入确认时，该号码在已用表里）
	 *           (本网情况)校验前：号码已用表有数据并且PortStatus状态为：13本网号码：待携入 Under Port In [UPI]
	 * 		                                         改正后：已用表数据PortStatus状态改为： 10本网号码：INIT初始
	 *           (他网情况)校验前：号码已用表有数据并且PortStatus状态为：23他网号码：待携入 Under Port In [UPI]
	 *		                                       改正后：已用表数据PortStatus状态改为：20他网号码：已经携入 Ported In [PIN]
	 * 4.回收携入号码，（只有他网情况）校验前：先 预销户 --> 实销--> 回收携入号码 ： 此时号码状态：“6 冷冻” + “20他网号码：已经携入”
	 *                     改正后：号码从已用表删除,将记录保存到号码回收表，选号记录 RES_SEL_NUM_CUST_LOG，保存到 RES_SEL_NUM_CUST_LOG_HIS 中
	 * 涉及表：RES_PHONE_NUM_ORIGIN、RES_PHONE_NUM_USED、
	 * @param billId
	 * @param certType
	 * @param certNo
	 * @param custType
	 * @param regionId
	 * @param orgId
	 * @param opId
	 * @param reserveType
	 * @param isNumRange : true 是号段、false不是号段
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author res_team
	 * @createDate 2014-3-28下午4:31:10
	 */
	public Map saveResPortInNums(String portInFlag, String resType, String billId, long certType, String certNo, int custType, String regionId, 
			long orgId, long opId, String reserveType, String leadingNum, String rangeHolder, String serviceOperator, String networkOperator, 
			boolean isNumRange, long doneCode, Timestamp doneDate,String begId,String endId) throws Exception, RemoteException;

	
	/**
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
	 * 3.号码携出确认，     （他网情况）号码未用表，PORT_STATUS=“21”。改成PORT_STATUS=“22” 。选号记录表、号码操作记录表
	 *					（他网情况）号码已用表，PORT_STATUS=“21”。改成PORT_STATUS=“22” 。选号记录表、号码操作记录表
	 *					（本网情况）号码未用表，PORT_STATUS=“10”。改成MANAGE_STATUS=“6”、PORT_STATUS=“12” 。未用表数据删除转移到号码已用表
	 *					（本网情况）号码已用表，PORT_STATUS=“10”。改成MANAGE_STATUS=“6”、PORT_STATUS=“12” 。号码保存在已用表中
	 * 
	 * 4.返回携出号码，外运营商的将号码返回给本网。该号码在已用表，MANAGE_STATUS=5, PORT_STATUS=2。删除已用表记录、转移到号码未用表、记录号码历史表、记录号码操作记录
	 * @param billId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author res_team
	 * @createDate 2014-3-28下午4:31:10
	 */
	public Map saveResPortOutNums(String portInFlag, String billId, String leadingNumber) throws Exception, RemoteException;
	
	/**
	 * 删除待携入的号码资源。（他网号码）直接删除未用表、选号记录表。
	 * 					          （本网号码）直接删除未用表、选号记录表、转移到号码已用表：号码状态“冷冻”、携转状态“本网号码：已经携出”
	 * 
	 * @param begId String 开始号码 （*必填）***********
	 * @param endId String 终止号码 （*必填）***********
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author res_team
	 * @createDate 2014-12-27 00:52
	 */
	public Map deletePortInNums(String begId, String endId) throws Exception, RemoteException;
	
	/**
	 * 判断号码是否可以被携入  --- for Telenor
	 * @param billId
	 * @param operType  1.GSM业务、2.FIXED业务 、3.wholesale中固网携入号码 (允许为空，因为wholesale不需要去NP查询)
	 * @param isVoip  是否为VOIP业务，true：允许携入PSTN的号码作为VOIP开户使用，false不允许
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author res_team
	 * @createDate 2014-9-24下午23:13:47
	 */
	public boolean checkPortInFlag(String billId, String operType, boolean isVoip)throws Exception, RemoteException;
	
	/**
	 * 判断号码是否可以被携出
	 * @param billId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author res_team
	 * @createDate 2014-9-24下午23:13:47
	 */
	public boolean checkPortOutFlag(IBOResPhoneNumOriginValue valueO, IBOResPhoneNumUsedValue valueU)throws Exception, RemoteException;
	
	/**
	 * 根据B2B客户状态，将集团客户 “购买” 的号码：选号记录表中 BUSI_TYPE = ResConst.RES_LOCK_TYPE_90
	 * 修改号码预占时长：1.如果客户状态是在网，统一修改预占时长为2099年，2.如果改成非在网，修改预占时间为当前时间后的三个月（时间可配置）。
	 * @param custId 客户编号
	 * @param customerStatus 客户状态
	 * @throws Exception
	 * @throws RemoteException
	 * 2014-10-09
	 */
	public void changePreOccupyDate(String custId, String customerStatus)throws Exception, RemoteException;
	
	
	/**
	 * 客户(customer)受理(Handling)提交(Submission)  --- for Telenor
	 * 入参：
	 * @param resId  手机号码
	 * @param certType 证件类型：统一传 ResConst.CM_CERT_TYPE_1000 = "1000"; // 客户编号 ----- only for Telenor
	 * @param custId 客户编号：客管侧的CUST_ID
	 * @param operType  操作类型    ：  1.已受理未实占，   2.受理回退（号码仍是预占状态，修改state字段）
	 * 
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
	 * 根据号码查询主号--- for Telenor
	 * @param operType 1查询该号码的主号     2查询该号码对应custId下所有的主号     
	 * @param billId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author gaoxd
	 * @createDate 2014-3-28下午4:31:10
	 */
	public Map searchLeadingNum(String operType, String billId) throws Exception, RemoteException;
	
	/**
	 * 根据主号查询号段，很据号段查已用、未用下该号段的所有号码 --- for Telenor
	 * @param operType :1查询leadingNumber下的所有号段信息 ，没有值查询明细
	 * @param billId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author gaoxd
	 * @createDate 2014-3-28下午4:31:10
	 */
	public Map searchNumsBuyLeadingNum(String operType, String billId) throws Exception, RemoteException;
	
	/**
	 * 根据主号查询号段，很据号段查已用、未用下该号段的所有号码 --- for Telenor
	 * @param operType :1查询leadingNumber下的所有号段信息 ，没有值查询明细
	 * @param billId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author gaoxd
	 * @createDate 2014-3-28下午4:31:10
	 */
	public Map searchNumsBuyLeadingNumForPortIn(String operType, String billId) throws Exception, RemoteException;
	
	/**
	 * 根据号码查询号段，  查已用、未用下该号段的所有号码--- for Telenor (携出场景使用，查询号段时：只需要号段名称（EXT_STR）、号段拥有着（DEPT_ID）进行分组)
	 * @param operType :1查询leadingNumber下的所有号段信息 ，没有值查询明细
	 * @param billId
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
	public Map searchNumsBuyLeadingNumForPortOut(String operType, String billId)throws Exception, RemoteException;
	
	
	/**
	 * 判断是否是一个号段，同一号段号码是否有遗漏 --- for Telenor
	 * @param begId
	 * @param endId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author gaoxd
	 * @createDate 2014-3-28下午4:31:10
	 */
	public boolean checkSameRange(String begId, String endId) throws Exception, RemoteException;
	
	/**
	 * 根据号码判断 号码是否一个Range内的号码（必须有Leading Number）。或者是不是Leading Number
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
	 * 判断：号码过户  --- for Telenor
	 * 1.号码必须是A客户下的。
	 * 2.如果是B2B Number Range的号码，过户时要判断：A、B客户必须是同一客户层级
	 * @param srcCustId
	 * @param destCustId
	 * @param billId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author res_team
	 * @createDate 2014-11-18 17:06
	 */
	public boolean checkSameHierarchyTransferOwner(String srcCustId, String destCustId, String billId, String leadingNumber) throws Exception, RemoteException;
	

	/**
	 * 根据主号查询号段，很据号段查未用该号段的所有号码 --- for Telenor
	 * @param leadingNum
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author gaoxd
	 * @createDate 2014-11-28下午4:31:10
	 */
	public IBOResPhoneNumOriginValue[] searchLeadingNumOrigin(String leadingNum) throws Exception, RemoteException;
	
	/**
	 * 根据传入的old leanging， 把主号为old leanging的号码给删了   生成新的号码，leading为传的new leanging   号段信息为传入的号段信息
	 * @param custId   客户编号
	 * @param oldLeadingNum   原有主号
	 * @param newLeadingNum   需要生成的主号
	 * @param numRangelist   生成的号段信息
	 * 
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author gaoxd
	 * @createDate 2014-12-18下午4:31:10
	 */
	public IBOResPhoneNumOriginValue[] phoneLeadingNumGenerate(String custId, String oldLeadingNum, String newLeadingNum, List numRangelist) throws Exception, RemoteException;
	
	/**
	 * NP接口4.25：同步号码段信息:暂时不清楚什么业务使用  --- for Telenor  TODO
	 * @param CountryCode
	 * @param RangeUpdateType
	 * @param BegId
	 * @param EndId
	 * @param OtherOperator
	 * @param CurrentRangeHolder
	 * @param CurrentServiceOperator
	 * @param CurrentNetworkOperator
	 * @param PortingCase
	 * @param SPC
	 * @param Municipality
	 * @param RoutingInfo
	 * @param ChargingInfo
	 * @param NewNumberType
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author res_team
	 * @createDate 2014-12-27 15:30
	 */
	public Map syncNumberRangeUpdateInfo(String CountryCode, String RangeUpdateType, String BegId, String EndId, String OtherOperator, String CurrentRangeHolder, String CurrentServiceOperator, String CurrentNetworkOperator, String PortingCase, String SPC, String Municipality, String RoutingInfo, String ChargingInfo, String NewNumberType) throws Exception, RemoteException;

	/**
	 * 号码过户时修改号码的使用者和拥有者
	 * @param operType      操作类型：ResConst.PHONE_RELA_TYPE_USER   使用者    
	 *                            ResConst.PHONE_RELA_TYPE_OWNER  拥有者
	 * @param billId        手机号码
	 * @param secCustId     原客户ID
	 * @param destCustId    目的客户ID （*必填）***********
	 * @return 
	 * @throws Exception
	 * @throws RemoteException
	 * @author gaoxd
	 * @createDate 2015-1-7下午3:13:47
	*/
	public Map changeNumCustId(String operType, String billId, String secCustId, String destCustId) throws Exception, RemoteException;
	
	/**
	 * 从NP获取号码的属性信息，录入RES_PORT_HLR表，并返回归属组织
	 * 
	 * @param billId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * 2016-01-20 14:58
	 */
	public String getNumOrgIdFromNP(String billId) throws Exception, RemoteException;
	
	/**
	 * 提供给OSE的选号，将号码先预占，再查询出来
	 * @param numberList  类型：List 过滤不需要的号码
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * 2016-04-07 14:29
	 */
	public IBOResPhoneNumOriginValue[] qryNumForOse(String resSpecId, String regionId, String secOrgId, String chooseType, String chooseLevel, String resLevel,
			String certType, String certNo, String reserveType, String selectMode, String resId, String begMSISDN, String endMSISDN, 
			String numCount, String doneCode, long opId, String interName, List numberList, String startIndex, String endIndex) throws Exception, RemoteException;

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
	public void phoneNumForceCancel(String billId, long orgId, long opId, long doneCode, Timestamp doneDate) throws Exception;
	
	/**
	 * 号段携出申请
	 * 1.号段携出申请，     （他网情况）号码未用表，MANAGE_STATUS=“3 or 4”、PORT_STATUS=“20”。改成PORT_STATUS=“21” 。选号记录表、号码操作记录表
	 *					（他网情况）号码已用表，MANAGE_STATUS=“5”、PORT_STATUS=“20”。改成PORT_STATUS=“21”。选号记录表、号码操作记录表
	 *					（本网情况）号码未用表，MANAGE_STATUS=“3 or 4”、PORT_STATUS=“10”。改成PORT_STATUS=“11” 。选号记录表、号码操作记录表
	 *					（本网情况）号码已用表，MANAGE_STATUS=“5”、PORT_STATUS=“10”。改成PORT_STATUS=“11”。选号记录表、号码操作记录表
	 * 
	 * 2.号段携出取消，     （他网情况）号码未用表，MANAGE_STATUS不变、PORT_STATUS=“21”。改成PORT_STATUS=“20” 。选号记录表、号码操作记录表
	 *					（他网情况）号码已用表，MANAGE_STATUS不变、PORT_STATUS=“21”。改成PORT_STATUS=“20” 。选号记录表、号码操作记录表
	 *					（本网情况）号码未用表，MANAGE_STATUS不变、PORT_STATUS=“10”。改成PORT_STATUS=“11” 。选号记录表、号码操作记录表
	 *					（本网情况）号码已用表，MANAGE_STATUS不变、PORT_STATUS=“10”。改成PORT_STATUS=“11”。选号记录表、号码操作记录表
	 * 
	 * 3.号段携出确认，     （他网情况）号码未用表，PORT_STATUS=“21”。改成PORT_STATUS=“22” 。选号记录表、号码操作记录表
	 *					（他网情况）号码已用表，PORT_STATUS=“21”。改成PORT_STATUS=“22” 。选号记录表、号码操作记录表
	 *					（本网情况）号码未用表，PORT_STATUS=“10”。改成MANAGE_STATUS=“6”、PORT_STATUS=“12” 。未用表数据删除转移到号码已用表
	 *					（本网情况）号码已用表，PORT_STATUS=“10”。改成MANAGE_STATUS=“6”、PORT_STATUS=“12” 。号码保存在已用表中
	 *             备注：号段在携出确认时，修改未用号码的NP状态和MS状态，删除选号记录表。已用只更改NP状态，MS状态和选号记录表信息等订单走预销实销流程变更数据，单号：TELENOR_DEFECT_20180919_0003
	 * 4.返回携出号段，外运营商的将号码返回给本网。该号码在已用表，MANAGE_STATUS=5, PORT_STATUS=2。删除已用表记录、转移到号码未用表、记录号码历史表、记录号码操作记录
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author gaoxd
	 * @createDate 2018-2-26
	 */
	public void saveResPortOutNumsForNumberRange(String portOutFlag, String begId, String endId, String leadingNumber) throws Exception, RemoteException;
	
	/**
	 * searchAndReserveNumsForMobile
	 * @param numberList  类型：List 过滤不需要的号码
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * 2018-06-07 14:29
	 */
	public IBOResPhoneNumOriginValue[] searchAndReserveNumsForMobile(String resSpecId, String regionId, String secOrgId, String chooseType, String chooseLevel, String resLevel,
			String certType, String certNo, String reserveType, String selectMode, String resId, String begMSISDN, String endMSISDN, 
			String numCount, String doneCode, long opId, String interName, List numberList, String startIndex, String endIndex) throws Exception, RemoteException;
	
	/**
	 * 根据号码查询号码未用表记录
	 * add by tanyan 20180824
	 * @param billId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public IBOResPhoneNumOriginValue[] selectOriginPhoneNumberForB2BEshop(String billId) throws Exception, RemoteException;
}
