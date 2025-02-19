package com.asiainfo.crm.cm.teaminvoke.out.service.interfaces;

import java.util.List;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.common.ivalues.IBOCmInsCmrelValue;
import com.asiainfo.crm.cm.common.ivalues.IQBOCmGroupPartyValue;
import com.asiainfo.crm.cm.common.util.ws.address;
import com.asiainfo.crm.cm.customer.custmgr.ivalues.IBOCmCustAdditionalInfoHValue;
import com.asiainfo.crm.cm.customer.custmgr.ivalues.IBOCmCustAdditionalInfoValue;
import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmCustAcctRelValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustSegmentRelaValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupMemberValue;
import com.asiainfo.crm.cm.ln.account.ivalues.IBOCmInsAccrelValue;
import com.asiainfo.crm.cm.model.ivalues.IAccountProfileValue;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.model.ivalues.ICustOrganizeValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;

/**
 * 
 * 
 * Copyright: Copyright (c) 2014 Asiainfo-Linkage
 * 
 * @ClassName: ICm2SoSV 
 * @Description: 一句话描述该类的功能
 *
 * @version: v1.0.0
 * @author: chenxq
 * @date:  2014-4-16 下午04:53:42
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2014-4-16     chenxq          v1.0.0             修改原因
 */
public interface ICm2SoSV {

	public Map queryGroupOrgUpSegmentByRelCustId(Map inMap) throws Exception;

	/**
	 * 查询客户地址信息
	 * @Function queryCustContactMediaByCond
	 * @Description 
	 *
	 * @param custId
	 * @param conMedTypeIds(11:法律地址,12:邮寄地址，14：送货地址)
	 * @param districtId 目前默认传入012002002
	 * @return Map{key:conMedTypeId,value:address对象}
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date Jul 1, 2014 9:19:34 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 1, 2014     yangjh           v1.0.0               修改原因<br>
	 */
	public Map queryCustContactMediaByCond(long custId, List conMedTypeIds, String districtId) throws Exception;

	/**
	 * 查询客户联系媒介
	 * @Function queryCustElectronicContactMediaByCond
	 * @Description 
	 *
	 * @param custId
	 * @param conMedTypeIds 21	EMAIL
	                        22	Facebook
							31	固话
							32	移动
							33	短信
							34	彩信
							35	紧急联系
							36	信件
	 * @return Map{key:conMedTypeId,Value:IBOCmCustContactMediumValue对象}
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date Jul 8, 2014 3:35:32 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 8, 2014     yangjh           v1.0.0               修改原因<br>
	 */
	public Map queryCustElectronicContactMediaByCond(long custId, List conMedTypeIds) throws Exception;

	/**
	 * 根据账户ID查询帐务关系
	 * 
	 * @param acctId
	 * @param payType(-1:全部,1：默认,2：代付)
	 * @return
	 * @throws Exception
	 */
	public IBOCmInsAccrelValue[] getInsAccrelsByAcct(long acctId, long payType, int startIdx, int endIdx) throws Exception;

	/**
	 * 根据账户ID查询帐务关系数量
	 * 
	 * @param acctId
	 * @param payType(-1:全部,1：默认,2：代付)
	 * @return
	 * @throws Exception
	 */
	public int getInsAccrelsCountByAcct(long acctIdx, long payType) throws Exception;

	/**
	 * 保存账务关系
	 * @param val
	 * @param operation(1:新增,2：修改;3：删除)
	 * @throws Exception
	 */
	public void saveInsAccrel(IBOCmInsAccrelValue val, long operation) throws Exception;

	/**
	 * 根据账户id查询账户信息
	 * @param acctId
	 * @return
	 * @throws Exception
	 */
	public IAccountProfileValue getAccountById(long acctId, String regionId) throws Exception;

	/**
	 * 根据账户id查询所有的账户信息,不加任何条件
	 * @param acctId
	 * @return
	 * @throws Exception
	 */
	public IAccountProfileValue getAllAccountById(long acctId, String regionId) throws Exception;

	/**   
	 * @Function queryIndivCustByNumber
	 * @Description 根据电话号码查询使用者/归属者客户信息
	 *
	 * @param serviceNumber
	 * @param relaType
	 * CmConstants.RelaType
	 * 1	使用者
	 * 2	归属者
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-23 下午2:26:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-23     shitian             v1.0.0               修改原因<br>
	 */
	public IVOCustValue queryIndivCustByNumber(String serviceNumber, int relaType) throws Exception;

	/**
	 * 更新客户信用度
	 * @Function updateCustCreditInfo
	 * @Description 
	 *
	 * @param map
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-10-6 上午10:20:25
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-6     yangjh           v1.0.0               修改原因<br>
	 */
	public void updateCustCreditInfo(Map map) throws Exception;

	/**
	 * 查询客户细分
	 * @Function queryCmCustSegmentRelaInfo
	 * @Description 
	 *
	 * @param map
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-10-11 上午10:20:25
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-11     huangqun          v1.0.0               修改原因<br>
	 */
	public IBOCmCustSegmentRelaValue queryCmCustSegmentRelaInfo(long custId) throws Exception;

	/**
	 * 保存客户用户关系
	 * @Function ChangeCmInsStateToDelete(long userId, long[] custIds) 
	 * @Description 
	 *
	 * @param map
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-10-19 上午10:20:25
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-19     huangqun          v1.0.0               修改原因<br>
	 */
	public void ChangeCmInsStateToDelete(long userId, long[] custIds) throws Exception;
	
	public void ChangeCmInsStateToDelete4Reaccess(long userId, long[] custIds) throws Exception;


	/**
	 * @Function queryAcctProfile
	 * @param custId 客户Id
	 * @param payMethod 不填查所有，1.查自有2.代付
	 * @return 账户信息账期信息
	 * @throws Exception
	 * @date 2014-10-16 下午20:20:25
	 */
	public IAccountProfileValue[] queryAcctProfile(long custId, String payMethod) throws Exception;

	/**
	 * 判断当前操作员是否有操作该集团的权限
	 * @Function queryGroupAcccess
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-10-21 下午3:19:21
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-21     yangjh           v1.0.0               修改原因<br>
	 */
	public boolean queryGroupAcccess(long custId) throws Exception;

	/**
	 * 修改客户用户使用者关系
	 * @Function modifyCmInsCmrelValue
	 * @Description 
	 *
	 * @param cmInsCmrelValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-10-17 下午4:34:38
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-17     mael           v1.0.0               修改原因<br>
	 */
	public void modifyCmInsCmrelValue(IBOCmInsCmrelValue[] cmInsCmrelValues) throws Exception;

	/**
	 * 
	 * @Function queryCmInsCmrel
	 * @Description 
	 *
	 * @param custId
	 * @param userId
	 * @param relType
	 * @param userType
	 * @param prodCatalogId
	 * @param offerId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-10-21 上午11:21:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-21     mael           v1.0.0               修改原因<br>
	 */
	public IBOCmInsCmrelValue[] queryCmInsCmrel(long custId, long userId, int relType, int userType, long prodCatalogId, long offerId, int start, int end) throws Exception;

	/**
	 * 
	 * @Function queryCmInsCmrelCount
	 * @Description 
	 *
	 * @param custId
	 * @param userId
	 * @param relType
	 * @param userType
	 * @param prodCatalogId
	 * @param offerId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-10-21 上午11:21:11
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-21     mael           v1.0.0               修改原因<br>
	 */
	public int queryCmInsCmrelCount(long custId, long userId, int relType, int userType, long prodCatalogId, long offerId) throws Exception;

	public int queryCmInsCmrelCountWithoutSelf(long custId, long userId, int relType) throws Exception ;
	
	/**
	 * 创建客户用户关系
	 * @Function createCmInsCmrelValue
	 * @Description 
	 *
	 * @param cmInsCmrelValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-10-21 下午2:48:12
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-21     yangjh           v1.0.0               修改原因<br>
	 */
	public void createCmInsCmrelValue(IBOCmInsCmrelValue cmInsCmrelValues) throws Exception;

	/**   
	 * @Function saveGroupMembers
	 * @Description 保存用户与部门关系
	 *
	 * @param groupMemberValues
	 * 需要设置参数
	 * groupMemberValues[i].setCustId(custId);
		groupMemberValues[i].setDeptId(deptId);
		groupMemberValues[i].setUserId(userId);
		groupMemberValues[i].setBillId(billId);
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-11-3 下午2:18:34
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-3     shitian             v1.0.0               修改原因<br>
	 */
	public void saveGroupMembers(IBOCmGroupMemberValue[] groupMemberValues) throws Exception;

	/**   
	 * @Function delGroupNumMember
	 * @Description 删除集团部门用户关系
	 *
	 * @param groupCustId
	 * @param billId
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-11-3 下午5:07:16
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-3     shitian             v1.0.0               修改原因<br>
	 */
	public void delGroupNumMember(long groupCustId, String billId) throws Exception;

	public void delGroupNumMemberForOSE(long userId,long deptId) throws Exception;

	/**   
	 * @Function modifyGroupNumMember
	 * @Description 
	 *
	 * @param srcDeptId	源部门ID
	 * @param destDeptId	目标部门ID
	 * @param billId	手机号码
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-11-19 上午9:53:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-19     shitian             v1.0.0               修改原因<br>
	 */
	public void modifyGroupNumMember(long srcDeptId, long destDeptId, String billId) throws Exception;

	/**   
	 * @Function saveAccount
	 * @Description 
	 *	设置账户状态
	 * @param acctValue	账户对象
	 * @
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-11-19 上午9:53:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-19    sunqi             v1.0.0               修改原因<br>
	 */
	public void saveAccount(List<IAccountValue> list) throws Exception;

	/**   
	 * @Function queryCustomerDtl
	 * @Description 
	 *	查询客户信息和地址媒介信息
	 * @param custId 
	 * @
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-11-19 上午9:53:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-19    sunqi             v1.0.0               修改原因<br>
	 */
	public IVOCustValue queryCustomerDtl(long custId) throws Exception;
	
	/**
	 * 为PushC重新，只返回一个有效的法律地址
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2019-8-13
	* ICm2SoSV
	 */
	public IVOCustValue queryCustomerDtlForPushC(long cId) throws Exception;
	
	/**
	 * 单独为TT重写的一个查询客户信息和地址媒介信息
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2018-7-17
	* ICm2SoSV
	 */
	public IVOCustValue queryCustomerDtlForTT(long custId) throws Exception;

	/**
	 * 根据条件查询用户信息
	 * @Function query360AllUserList
	 * @Description 
	 *
	 * @param custId
	 * @param prodCatalogId
	 * @param billId
	 * @param offerId
	 * @param strIdx
	 * @param endIdx
	 * @return
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-12-8 下午3:55:13
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-8     yangjh           v1.0.0               修改原因<br>
	 */
	public DataContainerInterface[] query360AllUserList(long custId, String prodCatalogId, String billId, long offerId, int strIdx, int endIdx) throws Exception;

	/**
	 * 根据条件查询用户信息数量
	 * @Function query360AllUserListCount
	 * @Description 
	 *
	 * @param custId
	 * @param prodCatalogId
	 * @param billId
	 * @param offerId
	 * @return
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-12-8 下午3:55:38
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-8     yangjh           v1.0.0               修改原因<br>
	 */
	public int query360AllUserListCount(long custId, String prodCatalogId, String billId, long offerId) throws Exception;

	/**   
	* @Function queryUserDept
	* @Description 根据用户查询归属部门
	*
	* @param userId
	* @return
	* @throws Exception
	*
	* @version v1.0.0
	* @author Administrator
	* @date 2014-12-10 下午5:11:33
	* 
	* <strong>Modification History:</strong><br>
	* Date         Author          Version            Description<br>
	* ---------------------------------------------------------<br>
	* 2014-12-10     shitian             v1.0.0               修改原因<br>
	*/
	public long queryUserDept(long userId) throws Exception;

	/**   
	* @Function queryAddressInfo
	* @Description 根据addressId查询address
	*
	* @param addressId
	* @return
	* @throws Exception
	*
	* @version v1.0.0
	* @author Administrator
	* @date 2014-12-11 下午5:11:33
	* 
	* <strong>Modification History:</strong><br>
	* Date         Author          Version            Description<br>
	* ---------------------------------------------------------<br>
	* 2014-12-11     huangqun             v1.0.0               修改原因<br>
	*/
	public address queryAddressInfo(long addressId) throws Exception;

	/**   
	 * @Function queryCsutAcctRel
	 * @Description 查询账户信息
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-12-11 下午5:11:33
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-11     huangqun             v1.0.0               修改原因<br>
	 */
	public IBOCmCustAcctRelValue[] queryCsutAcctRel(long relCustd, long acctId, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus, int start,
			int end) throws Exception;

	public int queryCsutAcctRelCount(long relCustd, long acctId, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus) throws Exception;

	/**   
	 * @Function queryAcctPaymentType
	 * @Description 
	 *
	 * @param acctId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-1-15 下午8:00:46
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-1-15     shitian             v1.0.0               修改原因<br>
	 */
	public int queryAcctPaymentType(long acctId) throws Exception;

	/**   
	 * @Function dealChangeUser
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-1-21 下午8:00:46
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-1-21     shitian             v1.0.0               修改原因<br>
	 */
	public void dealChangeUser(long userId, long newCustId, long oldCustId, long newUserCustId, long oldUserCustId, long orderId) throws Exception;

	/**   
	 * @Function saveCustCertCode
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-2-04 下午8:00:46
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-2-04     huangqun             v1.0.0               修改原因<br>
	 */
	public void saveCustCertCode(long custId, String custCertCode) throws Exception;

	/**   
	 * @Function dealCommercialProtection
	 * @Description 
	 *
	 * @param custId(必填),userId(必填)
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-3-17 下午8:00:46
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-3-17     huangqun             v1.0.0               修改原因<br>
	 */
	public void dealCommercialProtection(long custId, long userId) throws Exception;

	/**   
	 * @Function queryPayerByAcctId
	 * @Description 
	 *
	 * @param acctId
	 * @return
	 * key:
	 * PAYER_NAME
	 * PAYER_EMAIL
	 * PAYER_PHONE
	 * PAYER_ADDRESS
	 * ACCT_ID
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-3-18 上午11:21:29
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-3-18     shitian             v1.0.0               修改原因<br>
	 */
	public DataContainer queryPayerByAcctId(long acctId) throws Exception;

	/**   
	 * @Function queryCustomerById
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * key:
	 * CODE
	 * NAME
	 * POST_CODE
	 * CERT_TYPE
	 * CERT_CODE
	 * ADDRESS_ID
	 * ADDRESS_DETAIL
	 * EMAIL
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-3-18 下午2:35:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-3-18     shitian             v1.0.0               修改原因<br>
	 */
	public DataContainer queryCustomerById(long custId) throws Exception;

	/**   
	 * @Function changeStatusToOnline
	 * @Description 
	 *
	 * @param custId(必填)
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-4-16 下午8:00:46
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-4-16     huangqun             v1.0.0               修改原因<br>
	 */
	public void changeStatusToOnline(long custId) throws Exception;

	/**
	 * 多条件查询账户
	 * @param relCustd
	 * @param acctIds
	 * @param acctName
	 * @param installmentFalg
	 * @param paymethod
	 * @param cycleType
	 * @param custStatus
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 */
	public IBOCmCustAcctRelValue[] queryCustAcctRelByCnd(long relCustd, long[] acctIds, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus,
			int start, int end) throws Exception;

	/**
	 * 多条件查询账户数量
	 * @param relCustd
	 * @param acctIds
	 * @param acctName
	 * @param installmentFalg
	 * @param paymethod
	 * @param cycleType
	 * @param custStatus
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 */
	public int queryCustAcctRelCountByCnd(long relCustd, long[] acctIds, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus) throws Exception;

	/**   
	 * @Function queryPayerByAcctId
	 * @Description 
	 *
	 * @param acctId
	 * @return
	 * key:
	 * PAYER_NAME
	 * PAYER_EMAIL
	 * PAYER_PHONE
	 * PAYER_ADDRESS
	 * ACCT_ID
	 * PAYER_ADDRESS_ID
	 * PAYER_POSTCODE
	 * PAYER_CITY
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-3-18 上午11:21:29
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-3-18     shitian             v1.0.0               修改原因<br>
	 */
	public DataContainer queryPayerByAcctId4Contract(long acctId) throws Exception;

	/**
	 * 根据payer信息查询账户信息
	 * @param custType 客户类型
	 * @param custId 客户id
	 * @param firstName 
	 * @param LastName
	 * @param cpr 个人客户证件号码
	 * @param birthDay 生日
	 * @param addressId 地址Id
	 * @param companyName 集团客户名
	 * @param kob 集团客户证件号码
	 * @param cvr 税号
	 * @param start
	 * @param end
	 * @return
	 * @throws AIException
	 * @throws Exception
	 */
	public DataContainer[] queryPayerByDts(int custType, long custId, String firstName, String LastName, String cpr, String birthDay, long addressId, String companyName,
			String kob, String cvr, int start, int end) throws AIException, Exception;

	/**
	 * 根据payer信息查询账户信息count
	 * @param custType 客户类型
	 * @param custId 客户id
	 * @param firstName 
	 * @param LastName
	 * @param cpr 个人客户证件号码
	 * @param birthDay 生日
	 * @param addressId 地址Id
	 * @param companyName 集团客户名
	 * @param kob 集团客户证件号码
	 * @param cvr 税号
	 * @return
	 * @throws AIException
	 * @throws Exception
	 */
	public int queryPayerByDtsCount(int custType, long custId, String firstName, String LastName, String cpr, String birthDay, long addressId, String companyName, String kob,
			String cvr) throws AIException, Exception;

	/**   
	 * @Function ifCustProtected
	 * @Description 
	 *
	 * @param custId(必填)
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-7-21 下午8:00:46
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-7-21     huangqun             v1.0.0               修改原因<br>
	 */
	public boolean ifCustProtected(long custId) throws Exception;

	/**   
	 * @Function getIndivCustomerByCPR
	 * @Description 
	 *
	 * @param custId(必填)
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-8-5 下午8:00:46
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-8-5     huangqun             v1.0.0               修改原因<br>
	 */
	public long getIndivCustomerByCPR(String cpr) throws Exception;

	/**   
	 * @Function createDefaultAccount
	 * @Description 
	 *
	 * @param custId	必填
	 * @param accountName	选填
	 * @param isUBL	必填
	 * @param UBLInfo	如果isUBL为true，需要传入以下key
	 * EAN_QUALIFICATOR
	 * OIO_CONTACT_NAME
	 * OIO_ACCOUNT_CODE
	 * OIO_UBL_PROFILE	必填
	 * OIO_UTS_PROFILE	必填
	 * OIO_ORDER_CODE
	 * POSTOAL_ADDRESS	地址对象查看com.asiainfo.crm.cm.common.util.ws.address 必填
	 * OUT_ACCOUNT 是否出账标识，0：是，1：否；不传默认是0
	 * 
	 * 以下两个参数必须填一个，不能同时为空
	 * AGREEMENT_ID 合同编号
	 * AGREEMENT_CODE 合同编码
	 * 
	 * INSTALLMENT_FLAG 1是分期账户；2是津贴账户
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-2 下午5:41:22
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-2     shitian             v1.0.0               修改原因<br>
	 */
	public long createDefaultAccount(long custId, String accountName, boolean isUBL, Map UBLInfo) throws Exception;

	/**   
	* @Function queryCustInfoByConditions
	* @Description 
	*
	* @param custId(必填)
	* @return
	* @throws Exception
	*
	* @version v1.0.0
	* @author Administrator
	* @date 2015-9-14 下午8:00:46
	* 
	* <strong>Modification History:</strong><br>
	* Date         Author          Version            Description<br>
	* ---------------------------------------------------------<br>
	* 2015-9-14     huangqun             v1.0.0               修改原因<br>
	*/
	public DataContainer queryCustInfoByConditions(long custId, boolean isTop) throws Exception;

	/**   
	 * @Function queryGroupContact
	 * @Description 
	 *
	 * @param custId
	 * @param contType	com/asiainfo/crm/cm/common/CmConstants.CmGroupContactType
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-17 上午10:37:58
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-17     shitian             v1.0.0               修改原因<br>
	 */
	public IQBOCmGroupPartyValue[] queryGroupContact(long custId, int contType, int startNum, int endNum) throws Exception;

	/**   
	 * @Function queryGroupContactCount
	 * @Description 
	 *
	 * @param custId
	 * @param contType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-17 上午10:38:15
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-17     shitian             v1.0.0               修改原因<br>
	 */
	public int queryGroupContactCount(long custId, int contType) throws Exception;

	/**   
	 * @Function queryPayerAddress
	 * @Description 
	 *	 查询Payer信息
		 入参：acctID
		 出参：zip开始都是地址信息，直接返回地址对象就行
		lastBusinessName
		firstName
		cprId
		cvrNo
		kob
		zip
		city
		country
		direction
		district
		doorNo
		houseLetter
		houseNo
		story
		streetName
		coAddress
		buildingNumber。
	 * @param acctId	必填
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-2 下午5:41:22
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-2     shitian             v1.0.0               修改原因<br>
	 */
	public Map queryPayerAddress(long acctId) throws Exception;

	/**   
	 * @Function queryGroupContactsInfo
	 * @Description 
	 *
	 * @param custId
	 * @param contType
	 * @param isTop
	 * @return CONTACT_ROLE FULL_NAME PHONE_NUMBER EMAIL CONTACT_ROLE_NAME
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-18 下午5:45:53
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-18     shitian             v1.0.0               修改原因<br>
	 */
	public DataContainerInterface[] queryGroupContactsInfo(long custId, int contType, boolean isTop) throws Exception;

	/**   
	 * @Function queryCustContactMediaByCond
	 * @Description 
	 *
	 * @param custId
	 * @param conMedTypeIds 21	EMAIL
	                        22	Facebook
							31	固话
							32	移动
							33	短信
							34	彩信
							35	紧急联系
							36	信件
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-25 上午10:21:31
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-25     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmCustContactMediumValue[] queryCustContactMediaByCond(long custId, List conMedTypeIds) throws Exception;

	/**   
	 * @Function queryCustAcctRelByCnd
	 * @Description 
	 *
	 * 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-18 下午5:45:53
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-18     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmCustAcctRelValue[] queryCustAcctRelByCnd(long relCustd, long[] acctIds, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus,
			long agrId, int start, int end) throws Exception;

	public int queryCustAcctRelCountByCnd(long relCustd, long[] acctIds, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus, long agrId)
			throws Exception;

	@Deprecated
	public IBOCmCustAcctRelValue[] queryCustAcctRelByCnd(long relCustd, long[] acctIds, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus,
			String agrId, int start, int end) throws Exception ;

	public int queryCustAcctRelCountByCnd(long relCustd, long[] acctIds, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus, String agrId)
			throws Exception ;

	/**
	 * WholeSale客户是否可以开户
	 * @Function isWholesaleCustomerCanNewConnction
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2015-10-28 上午10:20:39
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-10-28     yangjh           v1.0.0               修改原因<br>
	 */
	public boolean isWholesaleCustomerCanNewConnction(long custId) throws Exception;

	/**   
	 * @Function validateCustomerName
	 * @Description 
	 *
	 * @param custId
	 * @param custName
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-10-30 下午2:51:11
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-10-30     shitian             v1.0.0               修改原因<br>
	 */
	public boolean validateCustomerName(long custId, String custName) throws Exception;

	/**   
	 * @Function saveDefaultCustomer
	 * @Description 
	 *
	 * @param firstName
	 * @param lastName
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-11-5 下午4:16:48
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-11-5     shitian             v1.0.0               修改原因<br>
	 */
	public long saveDefaultCustomer(String firstName, String lastName) throws Exception;
	
	/**   
	 * @Function queryAcctByCustId
	 * @Description 
	 *
	 * @param custId
	 * @param pageSize
	 * @param startIndex
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-11-5 下午4:16:48
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-11-5     shitian             v1.0.0               修改原因<br>
	 */
	public  DataContainer[] queryAcctByCustId(long custId, long accountId,String accountName,String ean,String payerName, int substatesFilter, int pageSize,int startIndex) throws Exception;
	
	/**
	 * 
	 * @param custId
	 * @param accountId
	 * @param accountName
	 * @param ean
	 * @param payerName
	 * @param containAddress
	 * @param substatesFilter
	 * @param pageSize
	 * @param startIndex
	 * @return
	 * @throws Exception
	 * 
	 * Modification History:
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2019-01-07     zhaiwg             v1.0.0         add parameter 'containAddress'
	 */
	public DataContainer[] queryAcctByCustId(long custId, long accountId,String accountName,String ean,String payerName, int substatesFilter, boolean containAddress,  int pageSize,int startIndex) throws Exception;
	/**   
	 * @Function queryAcctByAcctIds
	 * @Description 
	 *
	 * @param acctIds
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-11-5 下午4:16:48
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-11-5     shitian             v1.0.0               修改原因<br>
	 */
	public DataContainer[] queryAcctByAcctIds(Long acctIds[])throws Exception;
	
	/**   
	 * @Function queryAcctCountByCustId
	 * @Description 
	 *
	 * @param custId
	 * @param accountId
	 * @param accountName
	 * @param ean
	 * @param payerName
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2016-3-7 下午12:53:27
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2016-3-7     shitian             v1.0.0               修改原因<br>
	 */
	public int queryAcctCountByCustId(long custId, long accountId,String accountName,String ean,String payerName, int substatesFilter) throws Exception;
	
	/**   
	 * @Function saveDefaultCustomerForHU
	 * @Description 
	 *
	 * @param firstName
	 * @param lastName
	 * @param paraMap
	 * 支持设置客户所有字段，KEY全部要求为客户PDM中的字段
	 * CREDIT_VALUE
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2016-3-7 上午11:53:44
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2016-3-7     shitian             v1.0.0               修改原因<br>
	 */
	public long saveDefaultCustomerNew(String firstName, String lastName, Map paraMap) throws Exception;
	
	/**   
	 * @Copyright Copyright (c) 2016 Asiainfo-Linkage
	 * 
	 * @ClassName ICm2SoSV
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2016-5-30 下午5:52:04
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2016-5-30     shitian           v1.0.0               修改原因<br>
	 */
	public ICustOrganizeValue[] queryCustOrganizesByCdns(long rootCustId, long childCustId, String childCustName, int startNum, int endNum) throws Exception;

	/**   
	 * @Copyright Copyright (c) 2016 Asiainfo-Linkage
	 * 
	 * @ClassName ICm2SoSV
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2016-5-30 下午5:52:07
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2016-5-30     shitian           v1.0.0               修改原因<br>
	 */
	public int queryCustOrganizeCountByCdns(long rootCustId, long childCustId, String childCustName) throws Exception;
	
	/**   
	 * @Copyright Copyright (c) 2016 Asiainfo-Linkage
	 * 
	 * @ClassName ICm2SoSV
	 * @Description 根据子公司查询整个层级
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2016-6-8 上午10:13:38
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2016-6-8     shitian           v1.0.0               修改原因<br>
	 */
	public ICustOrganizeValue[] queryCustOrganizesSubOrgCustId(long childCustId) throws Exception;
	
	/**   
	 * @Function queryCmInsCmrelNew
	 * @Description 
	 *
	 * @param custId
	 * @param userId
	 * @param relType
	 * @param userType
	 * @param prodCatalogId
	 * @param offerId
	 * @return
	 * @throws Exception
	 */
	public IBOCmInsCmrelValue[] queryCmInsCmrelNew(long custId, long userId, int relType, int userType, long prodCatalogId, long offerId, int start, int end) throws Exception;
	
	/**   
	 * @Function queryCmInsCmrelNew
	 * @Description 
	 *
	 * @param custId
	 * @param userId
	 * @param relType
	 * @param userType
	 * @param prodCatalogId
	 * @param offerId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2016-9-1 下午4:55:02
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2016-9-1      shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmInsCmrelValue[] queryCmInsCmrelNew(long custId, long userId, int relType, int userType, long prodCatalogId, List offerIdList, int Ext1, boolean vpnFlag, int start, int end) throws Exception;
	
	
	/**   
	 * @Copyright Copyright (c) 2016 Asiainfo-Linkage
	 * 
	 * @ClassName ICm2SoSV
	 * @Description 修改账户合同号
	 */
	public void updateAcctAgreement(long acctId, long agreementId , Map otherMap) throws Exception;
	
	
	/**   
	 * @Function queryCmInsCmrelCountNew
	 * @Description 
	 *
	 * @param custId
	 * @param userId
	 * @param relType
	 * @param userType
	 * @param prodCatalogId
	 * @param offerIdList
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2016-9-1 下午4:55:02
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2016-9-1      shitian           v1.0.0               修改原因<br>
	 */
	public int queryCmInsCmrelCountNew(long custId, long userId, int relType, int userType, long prodCatalogId, List offerIdList, int Ext1, boolean vpnFlag) throws Exception;
	
	/**   
	 * @Function compareHierarchy
	 * @Description 
	 *
	 * @param custId1
	 * @param custId2
	 * @return
	 * @throws Exception
	 */
	public boolean compareHierarchy(long custId1, long custId2) throws Exception;
	/**
	 * 根据custid查询同一个B2B层级里的其他custId，包括同层级custId的子集，并且只需要返回在网和暂停状态的客户。
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	public List<Long> getSameHierarchyCustId(long custId) throws Exception;
	
	
	/**
	 * 查询当前账户的Payer
	 * add by tanyan 2017-11-20
	 * @param Map{AcctId}
	 * @return DataContainer{
	 * CustId
	 * CustName 公司名称
	 * CVR
	 * KOB
	 * EAN
	 * PayerId
	 * PayerName
	 * Address：地址id
	 * PayerType：1表示个人 3表示公司
	 * Remarks：地址
	 * }
	 * @throws Exception
	 */
	public DataContainer queryPayerByAcctIdCR6(Map map) throws Exception;
	
	/**
	 * 查询当前客户下的所有公司类型的Payer(包括客户所在的company)
	 * add by tanyan 2017-11-20
	 * @param Map{CustId}
	 * @return DataContainer{
	 * CustId
	 * CustName 公司名称
	 * CVR
	 * KOB
	 * EAN
	 * PayerId
	 * PayerName
	 * Address：地址id
	 * PayerType：1表示个人 3表示公司
	 * Remarks：地址
	 * }
	 * @throws Exception
	 */
	public DataContainer[] queryPayerByCustIdCR6(Map map) throws Exception;
	
	/**
	 * 换Payer
	 * add by tanyan 2017-11-20
	 * @param Map{
	 * AcctId：账户ID（必传）
	 * OldPayerId：老payerId（必传）
	 * PayerType：1 换成个人 3 换成公司（必传）
	 * NewPartyId：新payerId（只有换成公司类型的payer时必传）
	 * CertCode：传CPR，换成个人时可传值
	 * FirstName：换成个人时可传值
	 * LastName：换成个人时可传值
	 * BirthDay：换成个人时可传值
	 * AddressId：地址ID，换成个人时可传值
	 * Remarks：地址字符串，换成个人时可传值
	 * 
	 * 换成公司支付时，NewPartyId 和 CertCode（KOB）两者，需要有其一有传值。否则报错。
	 * 当NewPartyId有传值时，直接换Payer。
	 * 当NewPartyId没有传值时，检查CertCode是否有值，如果有值，
	 * 则根据KOB查Payer，如果查到已有Payer则换Payer。如果根据KOB查不到Payer，则报错。
	 * 
	 * 换成个人支付时，CPR可不填。如果CPR不填，那么FIRST_NAME，LAST_NAME，BIRTHDAY，AddressId，REMARKS都必须传值。
	 * 1、当CPR必须传值时，CRM会根据CPR去查已有的Payer
	 * 1.1 查到已有的Payer，则换Payer直至完成。
	 * 1.2 查不到已有的Payer,则检查FIRST_NAME，LAST_NAME，BIRTHDAY，AddressId，REMARKS是否有传值：
	 * 1.2.1 未传值，报错，无法换Payer
	 * 1.2.2 有传值，则根据FIRST_NAME，LAST_NAME，BIRTHDAY，AddressId，REMARKS去查已有的Payer，
	 * 1.2.2.1 查到已有的Payer，则换Payer直至完成。
	 * 1.2.2.2查不到已有的Payer，则创建Payer，然后换Payer。
	 * }
	 * @return 
	 * @throws Exception
	 */
	public Map modifyAccountPayerCR6(Map map) throws Exception; 
	
	/**   
	 * @Function queryCustAcctRelByCond
	 * @Description 
	 * @date 2018-3-8
	 */
	public DataContainer[]  queryCustAcctRelByCond(long custId,long acctId,String ean, Map extMap) throws Exception;
	
	/**
	 * 根据入参accountId查询 party. cm_acct_sub_status_2100 ~ 2109, 9100~9109 表的记录。
	 * 查询到记录则返回记录上的sub account status值。
	 * 如果查询不到记录，则返回默认值0。
	 * 
	 * @param accountId
	 * @return 1: Nordic billing account ;  2:Telenor clean up; 0:NO

	 * @throws Exception
	 */
	public String querySubAccountStatus(long accountId) throws Exception;
	
	/**
	 * cr128根据客户查询用户列表。
	 * @param custId
	 * @param userId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 */
	public IBOCmInsCmrelValue[] queryUserList(long custId, long userId, int start, int end) throws Exception;
	public int queryUserListCount(long custId, long userId) throws Exception;
	
	/**
	 * CR81特殊逻辑使用
	 * userId为虚用户，查询虚用户使用的账户
	 * @author huanglun
	 * @date 2018年12月27日 上午9:49:14
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public IBOCmInsAccrelValue[] queryCmInsAccrels(long userId) throws Exception;
	
	/**
	 * ose查询账户信息，新创建的临时账户也要返回
	 * @param custId
	 * @param accountId
	 * @param accountName
	 * @param ean
	 * @param payerName
	 * @param substatesFilter
	 * @param aStartNum
	 * @param aEndNum
	 * @return
	 * @throws Exception
	 */
	public DataContainer[] queryAcctByCustIdForOse(long custId, long accountId,String accountName,String ean,String payerName,int substatesFilter, boolean containAddress, int aStartNum,int aEndNum) throws Exception;
	public int queryAcctCountByCustIdForOse(long custId, long accountId,String accountName,String ean,String payerName, int substatesFilter) throws Exception;
	
	/**
	 * 
	 * <p>Title: queryAcctIdsByCustId</p>  
	 * <p>Description: </p>  
	 * @param custId
	 * @param substatesFilter
	 * @param containAddress
	 * @param aStartNum
	 * @param aEndNum
	 * @return
	 * @throws Exception  
	 * @author Yang Jieee  
	 * @date 2021年7月3日  
	 * @version V1.0
	 */
	public DataContainer[] queryAcctIdsByCustId(long custId,int substatesFilter, int aStartNum,int aEndNum) throws Exception;
	
	/**
	 * 
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	public IBOCmCustAdditionalInfoValue[] queryCustAdditionalInfo(long custId) throws Exception;
	
	/**
	 * 
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	public void  saveCustAdditionalInfo(IBOCmCustAdditionalInfoValue[] boCustAdditionalInfo) throws Exception;
	
	public String getNoteString(IBOCmCustAdditionalInfoValue[] addionalInfo) throws Exception;
	/**
	 * 
	 * <p>Title: saveCustAdditionalHisInfo</p>  
	 * <p>Description: </p>  
	 * @param boCustAdditionalInfo
	 * @throws Exception  
	 * @author Yang Jieee  
	 * @date 2022年12月1日  
	 * @version V1.0
	 */
	public void saveCustAdditionalHisInfo(IBOCmCustAdditionalInfoHValue[] boCustAdditionalInfo) throws Exception;

	DataContainer queryPayerNameByAcctId(long acctId) throws Exception;
	
}
