/**
 * 
 */
package com.asiainfo.crm.cm.teaminvoke.in.service.interfaces;

import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.secframe.orgmodel.ivalues.IBOSecOperatorValue;
import com.ai.secframe.orgmodel.ivalues.IBOSecOrganizeValue;
import com.ai.secframe.orgmodel.ivalues.IBOSecStaffValue;
import com.ai.secframe.orgmodel.ivalues.IQBOSecOrgStaffOperValue;
import com.ai.secframe.sysmgr.ivalues.IBOSecEntityValue;
import com.ai.secframe.sysmgr.ivalues.IBOSecPrivValue;
import com.ai.secframe.sysmgr.ivalues.IBOSecRoleGrantValue;
import com.asiainfo.crm.cm.model.ivalues.ICmBusiLogValue;
import com.asiainfo.crm.cm.model.ivalues.ISoAccrelValue;
import com.asiainfo.crm.cm.model.ivalues.ISoUserValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.so.common.ivalues.IBOUserInfoValue;
import com.asiainfo.crm.so.exe.remote.third.ConfirmResultDataBean;
import com.asiainfo.crm.so.exe.remote.third.CustInfoMoveRspDataBean;
import com.asiainfo.crm.so.exe.remote.third.CustScoreAndGradeInfoDataBean;
import com.asiainfo.crm.so.exe.remote.third.TransferResultDataBean;

/**   
 * 客户管理需要外围提供的接口定义。<br>
 * 在该接口定义文件中定义了客户管理核心版本中需要使用到的外部接口信息，包括出参入参等，核心版本提供默认实现，具体的项目可根据实际需求进行重写实现。
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-3-23 上午12:09:25
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-3-23     huzq2           v1.0.0               修改原因<br>
 */
public interface ICmTeamInvokeInService {

	/**
	* @Title: queryBceFieldDefine 
	* @Description: 查询某个区域下定义的字段（调用bce接口）
	* @param busiId
	* @param userParam
	* @return
	* @throws Exception
	* @throws java.rmi.RemoteException
	 */
	public DataContainer[] queryBceFieldDefine(long busiId, String userParam) throws Exception;

	/**   
	 * 根据用户编号获取用户信息，至少需要获取用户的计费号码(BILL_ID)、套餐名称(OFFER_ID、OFFER_NAME)、品牌（BRAND_NAME、BRAND_ID）、地市等
	 * @Function getUserByUserId
	 * @Description 
	 *
	 * @param userId 用户编号
	 * @return 符合条件的用户信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-23 上午12:12:55
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-23     huzq2           v1.0.0               修改原因<br>
	 */
	public ISoUserValue getSoUserByUserId(long userId) throws Exception;

	/**   
	 * 根据计费号码获取用户信息，至少需要获取用户的用户编号(USER_ID)、套餐名称(OFFER_ID、OFFER_NAME)、品牌（BRAND_NAME、BRAND_ID）、地市等
	 * @Function getUserByBillId
	 * @Description 
	 *
	 * @param billId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-23 上午12:26:19
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-23     huzq2           v1.0.0               修改原因<br>
	 */
	public ISoUserValue getSoUserByBillId(String billId) throws Exception;

	
	public IBOUserInfoValue queryUserInfoByBillId(String billId)throws Exception;
	
	/**   
	 * 根据客户编号获取客户下所有用户信息
	 * @Function getUsersByCustId
	 * @Description 
	 *
	 * @param custId 客户编号
	 * @param startNum 分页参数
	 * @param endNum 分页参数
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-23 上午12:16:13
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-23     huzq2           v1.0.0               修改原因<br>
	 */
	public ISoUserValue[] getSoUsersByCustId(long custId, int startNum, int endNum) throws Exception;

	/**   
	 * 根据客户编号查询该客户下的用户数量
	 * @Function getUserCountByCustId
	 * @Description 
	 *
	 * @param custId 客户编号
	 * @return 符合条件的用户数量
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-23 上午12:21:40
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-23     huzq2           v1.0.0               修改原因<br>
	 */
	public int getSoUserCountByCustId(long custId) throws Exception;

	/**   
	 * 根据账户编号和付费类型（默认付费、分账等）查询该账户付费的用户列表
	 * @Function getUsersByAcctId
	 * @Description 
	 *
	 * @param acctId 账户编号
	 * @param payType 支付类型（需要营业系统提供对应的枚举值定义）
	 * @param startNum 分页参数
	 * @param endNum 分页参数
	 * @return 符合条件的用户信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-23 上午12:19:09
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-23     huzq2           v1.0.0               修改原因<br>
	 */
	public ISoUserValue[] getSoUsersByAcctId(long acctId, int payType, int startNum, int endNum) throws Exception;

	/**   
	 * 根据账户编号和付费类型（默认付费、分账等）查询该账户付费的用户列表
	 * @Function getUserCountByAcctId
	 * @Description 
	 *
	 * @param acctId 账户编号
	 * @param payType 支付类型（需要营业系统提供对应的枚举值定义）
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-23 上午12:22:47
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-23     huzq2           v1.0.0               修改原因<br>
	 */
	public int getSoUserCountByAcctId(long acctId, int payType) throws Exception;

	/**   
	 * 根据账务支付关系编号查询账户支付关系信息
	 * @Function getAccrelById
	 * @Description 
	 *
	 * @param acctRelateId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-23 上午12:46:02
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-23     huzq2           v1.0.0               修改原因<br>
	 */
	public ISoAccrelValue getSoAccrelById(long acctRelateId) throws Exception;

	/**   
	 * 根据账户编号查询账户支付关系
	 * @Function getAccrelsByAcctId
	 * @Description 
	 *
	 * @param acctId 客户编号
	 * @param startNum TODO
	 * @param endNum TODO
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-23 上午12:47:22
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-23     huzq2           v1.0.0               修改原因<br>
	 */
	public ISoAccrelValue[] getSoAccrelsByAcctId(long acctId, int payType, int startNum, int endNum) throws Exception;

	/**   
	 * 根据账户编号查询账户支付关系数量
	 * @Function getAccrelCountByAcctId
	 * @Description 
	 *
	 * @param acctId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-23 上午12:51:11
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-23     huzq2           v1.0.0               修改原因<br>
	 */
	public int getSoAccrelCountByAcctId(long acctId, int payType) throws Exception;

	/**   
	 * 根据用户编号查询账户支付关系
	 * @Function getAccrelsByUserId
	 * @Description 
	 *
	 * @param userId
	 * @param startNum TODO
	 * @param endNum TODO
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-23 上午12:48:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-23     huzq2           v1.0.0               修改原因<br>
	 */
	public ISoAccrelValue[] getSoAccrelsByUserId(long userId, int payType, int startNum, int endNum) throws Exception;

	/**   
	 * 根据用户编号查询账户支付关系数量
	 * @Function getAccrelCountByUserId
	 * @Description 
	 *
	 * @param userId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-23 上午12:51:49
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-23     huzq2           v1.0.0               修改原因<br>
	 */
	public int getSoAccrelCountByUserId(long userId, int payType) throws Exception;

	/**   
	 *  根据用户计费号查询账户支付关系
	 * @Function getAccrelsByBillId
	 * @Description 
	 *
	 * @param billId
	 * @param startNum TODO
	 * @param endNum TODO
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-23 上午12:49:03
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-23     huzq2           v1.0.0               修改原因<br>
	 */
	public ISoAccrelValue[] getSoAccrelsByBillId(String billId, int payType, int startNum, int endNum) throws Exception;
	
	public ISoAccrelValue[] getSoAccrelsByBillId2(String billId, int payType, int startNum, int endNum) throws Exception;

	/**   
	 * 根据用户计费号查询账户支付关系数量
	 * @Function getAccrelCountByBillId
	 * @Description 
	 *
	 * @param billId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-23 上午12:52:59
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-23     huzq2           v1.0.0               修改原因<br>
	 */
	public int getSoAccrelCountByBillId(String billId, int payType) throws Exception;

	/**
	 * 验证操作员是否有对指定实体的操作权限
	 * @Function: checkEntityPermission
	 * @Description: 验证操作员是否有对指定实体的操作权限
	 *
	 * @param operId 操作员编号
	 * @param entId 实体编号
	 * @param privId 操作权限编号
	 * @return 如果操作员具有该实体的操作权限则返回true，否则返回false。
	 * @throws Exception
	 * @throws java.rmi.RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 21, 2011 12:55:20 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * May 21, 2011     huzq2           v1.0.0               修改原因
	 */
	public boolean checkSecEntityPermission(long operId, long entId, long privId) throws Exception;

	/**   
	 * @Function getStaffById
	 * @Description 根据员工ID查询员工（客户经理通用）
	 *
	 * @param staffId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-2-29 下午02:42:54
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-29     zhangyin           v1.0.0               修改原因<br>
	 */
	public IBOSecStaffValue getSecStaffById(long staffId) throws Exception;

	/**   
	 * @Function getStaffByStaffIds
	 * @Description 根据多个员工ID查询多个员工（客户经理通用）
	 *
	 * @param staffIds
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-3-7 下午03:55:25
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-7     zhangyin           v1.0.0               修改原因<br>
	 */
	public IBOSecStaffValue[] getSecStaffByStaffIds(long staffIds[]) throws Exception;

	public IBOSecStaffValue[] getSecStaffByOrgId(long orgId) throws Exception;

	/**   
	 * 同步客户信息到
	 * @Function sendCustInfo2Boss
	 * @Description 
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-11 上午9:59:05
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-11     huzq2           v1.0.0               修改原因<br>
	 */
	public void sendCustInfo2Boss(IVOCustValue custValue) throws Exception;
	
	/**
	 * 同步客户信息计费
	 * @Title: sendCustInfo2Billing 
	 * @Description: 
	 * @param custValue
	 * @param regionId (可不用)
	 * @throws Exception    
	 * @return void    
	 * @throws 
	 *
	 * @author huangxl
	 * @date 2013-11-5
	 *
	 */
	public void sendCustInfo2Billing(IVOCustValue custValue,String regionId) throws Exception;
	
	/**
	 * 同步客户信息计费
	 * @Title: sendMapOrderInfoToBilling 
	 * @Description: 
	 * @param map
	 * @throws Exception    
	 * @return void    
	 * @throws 
	 *
	 * @author zhuyy
	 * @date 2014-08-15
	 *
	 */
	public void sendMapOrderInfoToBilling(Map map) throws Exception;

	/**   
	 * 根据客户编号查询集团积分信息
	 * @Function getGroupScoreByCustId
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-11 下午2:55:56
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-11     huzq2           v1.0.0               修改原因<br>
	 */
	public Map getGroupScoreByCustId(long custId) throws Exception;

	/**   
	 * 根据账号查询手机号 
	* @Function getBillIdByAcctId
	* @Description 根据账号查询手机号 
	* @param acctId
	* @param payType 付费类型 1 基本付费 2 分帐 -1 全部
	* @return
	* @throws Exception
	*
	* @version v1.0.0
	* @author huzq2
	* @date 2012-4-14 下午2:42:41
	* 
	* <strong>Modification History:</strong><br>
	* Date         Author          Version            Description<br>
	* ---------------------------------------------------------<br>
	* 2012-4-14     huzq2           v1.0.0               修改原因<br>
	*/
	public String[] getBillIdByAcctId(long acctId, int payType) throws Exception;

	/**   
	 * 根据手机号码查询主服务信息 产品名称
	 * @Function getProdSpecByBillId
	 * @Description 
	 *
	 * @param billId 计费号码
	 * @param validType  生效类型，-1：未失效数据，1：当前有效2：下周期生效。传其他表示全部
	 * @return map  规格名称（服务名称） key:svName 产品单元编号 key:prodCatalogId 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-14 下午2:56:40
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-14     huzq2           v1.0.0               修改原因<br>
	 */
	public Map getProdSpecByBillId(String billId, int validType) throws Exception;

	/**   
	 * @Function getOsStatusType
	 * @Description  根据手机号判断用户是否停机。
	 * @param billId
	 * @return String key: openStatu 用于停复机状态结果返回 0表示开机，1表示停机。
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-16 上午10:49:05
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-16     huzq2           v1.0.0               修改原因<br>
	 */
	public Map getOsStatusType(String billId) throws Exception;

	/**   根据组织ID获取客户经理信息
	 * @Function getManagerByOrgId
	 * @Description 
	 *
	 * @param orgId
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-4-21 上午11:00:16
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-21     zhangyin          v1.0.0               修改原因<br>
	 */
	public IBOSecStaffValue[] getManagerByOrgId(long orgId, int startNum, int endNum) throws Exception;

	/**   根据组织ID获取客户经理信息数量
	 * @Function getManagerCountByOrgId
	 * @Description 
	 *
	 * @param orgId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-4-21 上午11:00:26
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-21     zhangyin          v1.0.0               修改原因<br>
	 */
	public int getManagerCountByOrgId(long orgId) throws Exception;

	/**   
	 * 查询组织信息
	 * @Function getSecOrganizeByOrgId
	 * @Description 
	 *
	 * @param organizeId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-27 上午10:41:30
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-27     huzq2           v1.0.0               修改原因<br>
	 */
	public IBOSecOrganizeValue getSecOrganizeByOrgId(long organizeId) throws Exception;

	/**   
	 * 根据操作员编号查询操作员信息
	 * @Function getSecOperatorById
	 * @Description 
	 *
	 * @param opId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-29 下午2:44:53
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-29     huzq2           v1.0.0               修改原因<br>
	 */
	public IBOSecOperatorValue getSecOperatorById(long opId) throws Exception;

	/**   
	 * 
	 * @Function getOperQBOByOperId
	 * @Description 
	 *
	 * @param operId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-29 下午2:48:59
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-29     huzq2           v1.0.0               修改原因<br>
	 */
	public IQBOSecOrgStaffOperValue getOperQBOByOperId(long operId) throws Exception;

	/**
	 * 扣减积分
	 * @param param key BillId 手机号 ； UserId 用户编号 (手机号和用户编号至少传一个) ；ReduceNum ：扣减积分 codeType 操作类型
	 *                  BusinessId 业务编码（必填）
	 * @return Map key :DoneCode :积分扣减流水
	 * @throws Exception
	 * @version:v1.0.0
	 * @author:liaosc
	 * @date:2012-5-10
	 */
	public void reduceScore(long userId, long totalScore,String reason,int codeType) throws Exception;

	/**   
	 * 根据用户编号获取用户的停机状态 (如：用户停)
	 * @Function getUserStatusTypeByUserId
	 * @Description	 * @param userId
	 * @param validType  生效类型 ：1当前有效，2未生效，4失效，-1全部（包括当前有效、未生效）
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-5-18 下午01:13:15
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-18     zhangyin           v1.0.0               修改原因<br>
	 */
	public String getUserStatusTypeByUserId(long userId, int validType) throws Exception;

	/**   
	 * @Function getEntitysByOperatorId
	 * @Description 
	 *
	 * @param operId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-22 下午9:52:20
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-22     huzq2           v1.0.0               修改原因<br>
	 */
	public IBOSecRoleGrantValue[] getEntitysByOperatorId(long operId) throws Exception;

	/**   
	 * @Function getSecEntitysByEntClassId
	 * @Description 
	 *
	 * @param classId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-22 下午9:52:36
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-22     huzq2           v1.0.0               修改原因<br>
	 */
	public IBOSecEntityValue[] getSecEntitysByEntClassId(int classId) throws Exception;

	/**   
	 * @Function getSecPrivByEntClassId
	 * @Description 
	 *
	 * @param classId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-22 下午9:52:54
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-22     huzq2           v1.0.0               修改原因<br>
	 */
	public IBOSecPrivValue[] getSecPrivByEntClassId(int classId) throws Exception;

	/**   
	 * @Function getSecPrivByPrivId
	 * @Description 
	 *
	 * @param privId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-22 下午9:53:12
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-22     huzq2           v1.0.0               修改原因<br>
	 */
	public IBOSecPrivValue getSecPrivByPrivId(long privId) throws Exception;

	/**   
	 * @Function getSecEntityByEntId
	 * @Description 
	 *
	 * @param entId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-22 下午9:53:26
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-22     huzq2           v1.0.0               修改原因<br>
	 */
	public IBOSecEntityValue getSecEntityByEntId(long entId) throws Exception;

	/**   
	 * 调用通用模板的发短信接口
	 * @Function sendSms
	 * @Description 
	 *
	 * @param billId
	 * @param smsContent
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-31 下午10:12:47
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-31     huzq2           v1.0.0               修改原因<br>
	 */
	public void sendSms(String billId, String smsContent) throws Exception;

	/**
	 * 
	 * @Function createGroupScAcct
	 * @Description 创建集团客户时创建集团积分帐户
	 * @param custId 集团客户编号
	 * @param remarks 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yandong2
	 * @date Jun 1, 2012 2:14:29 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 1, 2012     yandong2           v1.0.0               修改原因<br>
	 */
	public long createGroupScAcct(long custId, String remarks) throws Exception;

	/**
	 * @Function invalidGroupScAcct
	 * @Description 集团注销清理集团积分帐户
	 *
	 * @param custId 集团客户编号
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yandong2
	 * @date Jun 1, 2012 2:15:50 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 1, 2012     yandong2           v1.0.0               修改原因<br>
	 */
	public void invalidGroupScAcct(long custId) throws Exception;

	/**
	 * 查询个人可用积分
	 * @param userId
	 * @param scoreType
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author liaosc
	 * @date Jun 5, 2012 3:30:32 PM 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 5, 2012     liaosc        v1.0.0               修改原因<br>
	 */
	public long getIndivScoreByUserId(long userId) throws Exception;

	/**
	 * 根据用户编码获取停机类型
	 * @param userId
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author liaosc
	 * @date Jun 5, 2012 3:54:40 PM 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 5, 2012     liaosc        v1.0.0               修改原因<br>
	 */
	public String getUserStatusTypeByUserId(long userId) throws Exception;

	/**
	 * 积分清理（跨区入网时）
	 * @param inBean
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author liaosc
	 * @date Jun 5, 2012 4:02:56 PM 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 5, 2012     liaosc        v1.0.0               修改原因<br>
	 */
	public ConfirmResultDataBean innetClearScore(CustInfoMoveRspDataBean inBean) throws Exception;

	/**
	 * 积分注入和冲正（跨区入网时调用）
	 * @param custData
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author liaosc
	 * @date Jun 5, 2012 4:08:55 PM 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 5, 2012     liaosc        v1.0.0               修改原因<br>
	 */
	public TransferResultDataBean transferScore(CustScoreAndGradeInfoDataBean custData) throws Exception;

	/**
	 * 
	 * @Function getBalanceByAccountId
	 * @Description 获得账户余额信息，如果欠费或者有余额返回false，不可销户
	 *
	 * @param accountId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jul 16, 2012 3:06:58 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 16, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public boolean getIsCloseByAccountId(long accountId) throws Exception;

	/**   
	 * 保存营业日志
	 * 
	 * @Function saveSoBusiLog
	 * @Description 
	 *
	 * @param mainBusiLogValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-17 下午9:52:32
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-17     huzq           v1.0.0               修改原因<br>
	 */
	public void saveSoBusiLog(ICmBusiLogValue mainBusiLogValue) throws Exception;
	
	
	
}
