/**
 * 
 */
package com.asiainfo.crm.cm.teaminvoke.in.service.interfaces;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.omframe.instance.ivalues.IInsUserOsStateValue;
import com.ai.omframe.instance.ivalues.IInsUserValue;
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
import com.asiainfo.crm.so.query.ivalues.IQUserBaseInfoValue;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-4-11 下午2:35:16
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-4-11     huzq2           v1.0.0               修改原因<br>
 */
public interface ICmTeamInvokeSV {

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

	public IBOUserInfoValue queryUserInfoByBillId(String billId) throws Exception;

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
	 * @param regionId(可不用)
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
	 * @date 2014-8-15
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
	 * 根据帐户编号查询计费号码
	* @Function getBillIdByAcctId
	* @Description 
	* @param acctId 账户编号
	* @param payType 付费类型 1 基本付费 2 分帐 -1 全部
	* @return 符合条件的计费号码
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
	 * 获取权限中组织信息
	 * @Function getSecOrganizeByOrgId
	 * @Description 
	 *
	 * @param organizeId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-27 上午10:40:28
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
	 * @date 2012-4-29 下午2:43:44
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-29     huzq2           v1.0.0               修改原因<br>
	 */
	public IBOSecOperatorValue getSecOperatorById(long opId) throws Exception;

	/**   
	 * 根据操作员编号查询操作员信息和对应的员工信息
	 * @Function getOperQBOByOperId
	 * @Description 
	 *
	 * @param operId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-29 下午2:49:39
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-29     huzq2           v1.0.0               修改原因<br>
	 */
	public IQBOSecOrgStaffOperValue getOperQBOByOperId(long operId) throws Exception;

	/**   
	 * 
	 * @Function getSecEntityByEntId
	 * @Description 
	 *
	 * @param entId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-22 下午9:18:17
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-22     huzq2           v1.0.0               修改原因<br>
	 */
	public IBOSecEntityValue getSecEntityByEntId(long entId) throws Exception;

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
	 * @date 2012-5-22 下午9:19:07
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-22     huzq2           v1.0.0               修改原因<br>
	 */
	public IBOSecPrivValue getSecPrivByPrivId(long privId) throws Exception;

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
	 * @date 2012-5-22 下午9:22:58
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-22     huzq2           v1.0.0               修改原因<br>
	 */
	public IBOSecPrivValue[] getSecPrivByEntClassId(int classId) throws Exception;

	/**   
	 * @Function getSecEntitysByEntClassId
	 * @Description 
	 *
	 * @param dataObject
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-22 下午9:33:25
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-22     huzq2           v1.0.0               修改原因<br>
	 */
	public IBOSecEntityValue[] getSecEntitysByEntClassId(int dataObject) throws Exception;

	/**   
	 * 根据操作员编号查询操作员的实体信息
	 * @Function getEntitysByOperatorId
	 * @Description 
	 *
	 * @param operId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-31 下午10:11:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-31     huzq2           v1.0.0               修改原因<br>
	 */
	public IBOSecRoleGrantValue[] getEntitysByOperatorId(long operId) throws Exception;

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
	 * 扣减积分
	 * @param param
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author liaosc
	 * @date Jun 5, 2012 3:23:49 PM 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 5, 2012     liaosc        v1.0.0               修改原因<br>
	 */
	public void reduceScore(long userId, long totalScore, String reason,int codeType) throws Exception;

	/**
	 * 查询个人可用积分
	 * @param userId
	 * @param scoreType
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author liaosc
	 * @date Jun 5, 2012 3:29:49 PM 
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

	/**   
	 * @Function getInsUser
	 * @Description 根据用户编号或者手机号码查询用户信息
	 *
	 * @param userId
	 * @param billId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 6, 2012 9:26:39 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 6, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IInsUserValue getInsUser(long userId, String billId) throws Exception;

	/**
	 * @Function: updateInsDataForAcctZQChg
	 * @Description: 用户主动办理用户账期变更，引起营业实例数据变更
	 * 
	 * @param: acctId，用户编号，必传 oldZhangqi，用户老账期，必传 newZhangqi，新账期
	 *         validType，生效类型，1-立即生效，2-下月生效
	 * @return：
	 * @throws：
	 * 
	 * @version: v1.0.0
	 * @author: kangzk
	 * @date: 2012-10-4下午05:00:32
	 * 
	 * Modification History: Date Author Version Description
	 * ---------------------------------------------------------* 2012-10-4
	 * kangzk v1.0.0 修改原因
	 */
	public void updateInsDataForAcctZQChg(long acctId, int oldZhangqi, int newZhangqi, int validType) throws Exception;

	/**   
	 * @Function getUserBaseInfoByBillId
	 * @Description 根据手机号码查询用户基本信息（包含品牌）
	 *
	 * @param billId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 17, 2012 10:53:57 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 17, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IQUserBaseInfoValue getUserBaseInfoByBillId(String billId) throws Exception;
	
	/**   
	 * @Function getUserBaseInfoByUserId
	 * @Description 根据userId查询用户基本信息（包含品牌）
	 *
	 * @param billId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 17, 2012 10:53:57 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 17, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IQUserBaseInfoValue getUserBaseInfoByUserId(long userId) throws Exception;

	/**   
	 * 个人客户转托收(客户管理侧同步账管侧)
	 * @Function changeEnturstUser
	 * @Description 
	 *
	 * @param acctId 账户编号
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-10-16 下午3:52:29
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-10-16     kangzk          v1.0.0               修改原因<br>
	 */
	public void changeEnturstUser(long acctId) throws Exception;

	/**
	 * 
	 * @Function decideAccoutCost
	 * @Description 根据账户编号判断用户账户是否欠费
	 *
	 * @param acctId 账户编号
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-9-22 上午10:24:47
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-9-22     kangzk           v1.0.0               修改原因<br>
	 */
	public boolean decideAccoutCost(long acctId) throws Exception;

	/**
	 * 
	 * @Function getAcctFeeByBillId
	 * @Description 依据手机号码查询账户余额，如果欠费，显示为欠费金额（负值）
	 *
	 * @param billId 手机编号
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-10-18 下午04:24:39
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-10-18     kangzk           v1.0.0               修改原因<br>
	 */
	public long getAcctFeeByBillId(String billId) throws Exception;

	/**
	 * 
	 * @Function unifiedGroupQuery
	 * @Description 根据服务号码billId和集团客户编号custId查询，该号码订购的集团业务,
	 *      MAP 返回值
	 *      map.put("FLAG", "");  //当 FLAG 为TRUE 时 代表有订购智能V网业务  为FALSE 时 代表订购了多个业务
         *	map.put("OFFER_NAME", ""); //FLAG为false的时候再取offer_name 
	 * @param billId 手机编号
	 * @param custId 客户编号
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-10-18 下午04:24:39
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-10-18     kangzk           v1.0.0               修改原因<br>
	 */
	public Map unifiedGroupQuery(String billId, String custId) throws Exception;

	/**
	 * 
	 * @Function groupQueryByBillIdCustId
	 * @Description 根据服务号码billId和集团客户编号custId查询，该号码是否作为该集团办理集团业务的属性（主要联系人）被保存
	 *
	 * @param billId 手机编号
	 * @param custId 客户编号
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-10-18 下午04:24:39
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-10-18     kangzk           v1.0.0               修改原因<br>
	 */
	public List groupQueryByBillIdCustId(String billId, String custId) throws Exception;
	/**
	 * 
	 * @Function unifiedGroupQuery
	 * @Description 根据服务号码billId和集团客户编号custId查询，该号码订购的集团业务,
	 *   			 True 订购了集团业务   FALSE没有订购集团业务
	 * @param billId 手机编号
	 * @param custId 客户编号
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-10-18 下午04:24:39
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-10-18     kangzk           v1.0.0               修改原因<br>
	 */
	 public boolean unifiedGroupCustQuery(String billId, long custId)throws Exception;
	/**
	 * 
	 * @Function queryVpmnIdByCustId
	 * @Description 查询vpn编号
	 *
	 * @param custId 客户编号
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-10-18 下午04:24:39
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-10-18     kangzk           v1.0.0               修改原因<br>
	 */
	public long queryVpmnIdByCustId(long custId) throws Exception;

	/**
	 * 
	 * @Function getAcctFeeInfoByAcctId
	 * @Description 依据账户编号查询账户费用信息
	 *
	 * @param acctId 账户编号
	 * @return map 账户资金信息  （需判NULL） 包括（返回的数据都是long，单位'分'）
	 * commonBalance 普通结余
	 * curOweFeeAmount 未结欠费
	 * realLateFee 实收滞纳金 latefee 滞纳金 latefeeDerate 滞纳金减免
	 * derate 减免费用
	 * totalDueAmount 应收金额
	 * balance 本次余额
	 * totalOwe 账户欠费
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author guowx
	 * @date 2012-9-22 上午10:24:47
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-9-22     guowx           v1.0.0               修改原因<br>
	 */
	public Map getAcctFeeInfoByAcctId(long acctId) throws Exception;

	/**   
	 * 查看当前用户预缴是否存在（提供给客户管理使用）
	 * @Function hasUserAppBalRec
	 * @Description 
	 *
	 * @param userId 用户编号
	 * @param acctId 账户编号
	 * @return true 存在；false 不存在
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-10-11 下午6:51:32
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-10-11     zhangyin          v1.0.0               修改原因<br>
	 */
	public boolean hasUserAppBalRec(long userId, long acctId) throws Exception;

	/**
	 * 
	 * @Function updateUserPassword
	 * @Description 更改关键人密码
	 *
	 * @param serviceNum       服务号码
	 * @param isVerifyOldPwd   是否验证旧密码   0：不验证   1：验证   缺省为验证
	 * @param oldPwd           旧密码（明文） 验证旧密码时需要提供
	 * @param newPwd           新密码（明文）
	 * @param isVerifyCertCard 是否验证证件号码   0：不验证   1：验证  缺省为不验证
	 * @param certCardType     证件类型  验证证件号码时需要提供
	 * @param certCardCode     证件号码   验证证件号码时需要提供
	 * @param isSMSNotify      是否短信通知  0：无短信通知   1：短信通知   缺省为不短信通知
	 * @throws Exception
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author kangzk
	 * @date Jun 20, 2012 2:59:36 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 20, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public Map updateUserPassword(String serviceNum, int isVerifyOldPwd, String oldPwd, String newPwd, int isVerifyCertCard, String certCardType, String certCardCode,
			int isSMSNotify) throws Exception, RemoteException;

	/**   
	 * @Function changeCreditPlan
	 * @Description 账户变更或者新增--关联信控监控计划
	 *
	 * @param acctId
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 31, 2012 3:48:40 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 31, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void changeCreditPlan(long acctId) throws Exception;
	/**   
	 * @Function saveSmsPendings
	 * @Description 客户管理批量下发短信
	 *
	 * @throws smsMaps
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Oct 31, 2012 3:48:40 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 31, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public void saveSmsPendings(HashMap[] smsMaps)throws Exception;

	/**
	 * 
	 * @Function upCbossForVipCard
	 * @Description 电子VIP卡下发
	 *
	 * @param Map
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author kangzk
	 * @date Jun 20, 2012 2:59:36 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 20, 2012     kangzk           v1.0.0               修改原因<br>
	 */
    public Map upCbossForVipCard(Map vipcard) throws Exception;
    /**
	 * 
	 * @Function getAcctOweInfoByAcctId
	 * @Description 查询用户上月是否欠费
	 *
	 * @param acctId  账户编号
	 * @param isQueryOwe true查实时，false不查实时
	 * @throws Exception
	 *
	 *	return true 没欠费  false 欠费
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-9-22 上午10:26:02
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-9-22     kangzk           v1.0.0               修改原因<br>
	 */
	public boolean isAcctOweInfoFree(long acctId) throws Exception;
	/**
	 * 
	 * @Function isUserOsState
	 * @Description 判断用户是否停机
	 *
	 * @param billId  手机号码
	 * @param 
	 * @throws Exception
	 *
	 *	return true 正常用户   false 停机
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-9-22 上午10:26:02
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-9-22     kangzk           v1.0.0               修改原因<br>
	 */
	public boolean isUserOsState(String billId) throws Exception;
	/**
	 * 
	 * @Function isUserOsState
	 * @Description 判断用户是否停机
	 *
	 * @param userId  用户编号
	 * @param 
	 * @throws Exception
	 *
	 *	return true 正常用户   false 停机
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-9-22 上午10:26:02
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-9-22     kangzk           v1.0.0               修改原因<br>
	 */
	public boolean isUserOsStateByUserId(long userId) throws Exception;
	/**
	 * 
	* @Function: ICmTeamInvokeSV.java
	* @Description: 根据手机号码查找停机用户
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: suntao6
	* @date: Nov 10, 2012 4:40:29 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Nov 10, 2012     suntao6           v1.0.0              修改原因
	 */
	public IInsUserOsStateValue getUserOutState(String billId,int memberType)throws Exception;
	/**
	 * 
	* @Function: ICmTeamInvokeSV.java
	* @Description: 该函数的功能描述
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: suntao6
	* @date: Nov 12, 2012 7:23:56 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Nov 12, 2012     suntao6           v1.0.0              修改原因
	 */
	public String getOsStatusAndTime(String sOsFlag,IInsUserOsStateValue insUserOsState)throws Exception,RemoteException;
	
	/**   
	  * @Function: getUserNetAge
	  * @Description: 根据手机号获取在网网龄，以月为单位
	  *
	  * @param: billId
	  * @return：int -1:根据该服务号码{0}不能查询到用户信息
	  * @throws：异常描述
	  *
	  * @version: v1.0.0
	  * @author: zhouwu
	  * @date: 2012-11-12 09:55:50  
	  *
	  * Modification History:
	  * Date         Author          Version            Description
	  *-------------------------------------------------------------*
	  * 11 30, 2012      zhouwu           v1.0.0               修改原因
	  */
	 public int getUserNetAge(String billId) throws Exception,RemoteException;
	 
	 /**
	 * 
	 * @Function isUserByCustIdState
	 * @Description 判断集团是否存在相应业务
	 *
	 * @param userId  用户编号
	 * @param 
	 * @throws Exception
	 *
	 *	return true 不存在   false 存在
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-9-22 上午10:26:02
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-9-22     kangzk           v1.0.0               修改原因<br>
	 */
	public boolean isUserByCustIdState(long grpCustId) throws Exception;
	
	/**   
	 * @Function getCustIdByVpmnId
	 * @Description 
	 *
	 * @param vpmnId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Nov 20, 2012 3:21:05 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Nov 20, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public  long getCustIdByVpmnId(String vpmnId) throws Exception;
	
	/**   
	* @Function: getGroupVpmnRelationByVpmnId
	* @Description: 根据VpmnId查询集团客户与V网关系
	*
	* @param
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: zhouwei9
	* @date: Nov 27, 2012 9:32:46 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Nov 27, 2012     zhouwei9         v1.0.0               修改原因
	*/
	public  DataContainerInterface[] getGroupVpmnRelationByVpmnId(String vpmnId) throws Exception;
	
	/**   
	 * @Function getVpmnIdByCustId
	 * @Description 
	 *
	 * @param custId
	 * @param regionId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Nov 20, 2012 4:50:16 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Nov 20, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public  String getVpmnIdByCustId(long custId,String regionId) throws Exception ;

	/**
	 * 
	* Copyright: Copyright (c) 2012 Asiainfo-Linkage
	* 
	* @ClassName: ICrmFSV.java
	* @Description: 根据成员手机号码查询集团客户信息
	*
	* @version: v1.0.0
	* @author: kangzk
	* @date: 2012-11-23 下午08:27:10 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2012-11-23     kangzk           v1.0.0               修改原因
	 */
	public  List queryGroupCustIdByBillId(String billId)throws Exception, RemoteException;
}
