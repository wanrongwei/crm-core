package com.asiainfo.crm.cm.service.interfaces;

import java.sql.Timestamp;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.ivalues.IBOCMPartyAcctRelValue;
import com.asiainfo.crm.cm.common.ivalues.IQBOCmPartyValue;
import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmAccountHisValue;
import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmAcctBillCycleValue;
import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmBillCustomizeValue;
import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmCustAcctRelValue;
import com.asiainfo.crm.cm.inner.account.ivalues.IQBOCmAcctPayMentValue;
import com.asiainfo.crm.cm.ln.account.ivalues.IBOCmCmxAcctPaymentAttrValue;
import com.asiainfo.crm.cm.model.ivalues.IAccountProfileValue;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCustomizeValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCycleValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctPaymentValue;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.IVOAccountValue;

/**   
 * @Copyright Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName ICmAccountSV
 * @Description 该类定义了创建账户、修改账户和注销账户等业务的服务，用于提供给外部接口、JSP页面、Action等调用。
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2011-12-16 下午2:30:30
 *
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2011-12-16     huzq2           v1.0.0               修改原因
 */
public interface ICmAccountSV {

	public IBOCmBillCustomizeValue queryCmBillCustomizeByUserId(long acctId, long userId, int startNum, int endNum) throws Exception;

	/**   
	 * 保存账户信息（以及账户附属信息）<br>
	 * 通过该服务可以保存以下实体：
	 * <ol>
	 * 	<li>{@link IAccountValue 账户基本信息}</li>
	 * 	<li>{@link IAcctPaymentValue 账户支付方案信息}</li>
	 * 	<li>{@link IAcctBillCycleValue 账户出账账期信息}</li>
	 * 	<li>{@link IAcctBillCustomizeValue 个性化账单定制信息}</li>
	 * 	<li>{@link IContactValue 账户联系人信息}</li>
	 * </ol>
	* @Function: saveAccount 
	* @Description: 创建账户
	*
	* @param acctValue
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: zhangyin
	* @date: 2011-12-16 下午05:28:07 
	*
	* Modification History:
	* Date               Author            Version            Description
	* -------------------------------------------------------------------
	* 2011-12-16        zhangyin            v1.0.0                 修改原因
	*/
	public long saveAccount(IVOAccountValue acctValue) throws Exception;

	/**   
	* @Function: queryAccountById 
	* @Description: 根据账户编号查询账户信息
	*
	* @param acctId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: zhangyin
	* @date: 2011-12-21 上午11:21:11 
	*
	* Modification History:
	* Date               Author            Version            Description
	* -------------------------------------------------------------------
	* 2011-12-21        zhangyin            v1.0.0                 修改原因
	*/
	public IAccountValue queryAccountById(long acctId) throws Exception;

	/**   
	* @Function: queryAccountByCondition 
	* @Description: 根据账户编号，客户编号查询账户信息
	*
	* @param custId
	* @param startNum
	* @param endNum
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: zhangyin
	* @date: 2011-12-27 下午02:05:11 
	*
	* Modification History:
	* Date               Author            Version            Description
	* -------------------------------------------------------------------
	* 2011-12-27        zhangyin            v1.0.0                 修改原因
	*/
	public IAccountValue[] queryAccountByCondition(long custId, int startNum, int endNum) throws Exception;

	/**   
	* @Function: queryAccountCountByCondition 
	* @Description: 查询账户信息的数量
	*
	* @param custId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: zhangyin
	* @date: 2011-12-27 下午02:10:42 
	*
	* Modification History:
	* Date               Author            Version            Description
	* -------------------------------------------------------------------
	* 2011-12-27        zhangyin            v1.0.0                 修改原因
	*/
	public int queryAccountCountByCondition(long custId) throws Exception;

	/**   
	* @Function: queryAccountByCondition 
	* @Description: 根据账户支付方案标识查询账户支付方案信息
	*
	* @param acctPaymentById
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: zhangyin
	* @date: 2011-12-21 下午04:44:23 
	*
	* Modification History:
	* Date               Author            Version            Description
	* -------------------------------------------------------------------
	* 2011-12-21        zhangyin            v1.0.0                 修改原因
	*/
	public IAcctPaymentValue queryAcctPaymentById(long acctPaymentId) throws Exception;

	public IAcctPaymentValue[] queryAcctPayments(DataContainer dc, int startNum, int endNum) throws Exception;

	/**   
	* @Function: queryAcctPaymentByCondition 
	* @Description: 根据账户编号查询账户支付方案信息
	*
	* @param acctId
	* @param startNum
	* @param endNum
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: zhangyin
	* @date: 2011-12-21 下午02:32:37 
	*
	* Modification History:
	* Date               Author            Version            Description
	* -------------------------------------------------------------------
	* 2011-12-21        zhangyin            v1.0.0                 修改原因
	*/
	public IAcctPaymentValue[] queryAcctPaymentByCondition(long acctId, int startNum, int endNum) throws Exception;

	/**   
	 * 根据账户编号和状态查询账户的支付方案
	 * 
	 * @Function queryAcctPaymentsByAcctId
	 * @Description 
	 *
	 * @param acctId
	 * @param state
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-7-23 下午4:42:27
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-23     huzq2           v1.0.0               修改原因<br>
	 */
	public IAcctPaymentValue[] queryAcctPaymentsByAcctId(long acctId, String state, int startNum, int endNum) throws Exception;

	/** 
	 *  根据账户编号和状态查询账户的支付方案数量
	 *    
	 * @Function queryAcctPaymentCountByAcctId
	 * @Description 
	 *
	 * @param acctId
	 * @param state
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-7-23 下午4:45:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-23     huzq2           v1.0.0               修改原因<br>
	 */
	public int queryAcctPaymentCountByAcctId(long acctId, String state) throws Exception;

	/**   
	* @Function: queryAcctPaymentCountByCondition 
	* @Description: 查询账户支付方案信息数量
	*
	* @param acctId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: zhangyin
	* @date: 2011-12-21 上午11:35:51 
	*
	* Modification History:
	* Date               Author            Version            Description
	* -------------------------------------------------------------------
	* 2011-12-21        zhangyin            v1.0.0                 修改原因
	*/
	public int queryAcctPaymentCountByCondition(long acctId) throws Exception;

	/**   
	* @Function: queryBillCustomizeById 
	* @Description: 根据定制标识查询客户化帐单定制信息
	*
	* @param customizeId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: zhangyin
	* @date: 2011-12-22 下午12:27:55 
	*
	* Modification History:
	* Date               Author            Version            Description
	* -------------------------------------------------------------------
	* 2011-12-22        zhangyin            v1.0.0                 修改原因
	*/
	public IAcctBillCustomizeValue queryBillCustomizeById(long customizeId) throws Exception;

	/**   
	* @Function: queryBillCustomizeByCondition 
	* @Description: 根据账户编号查询客户化帐单定制信息
	*
	* @param acctId
	* @param startNum
	* @param endNum
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: zhangyin
	* @date: 2011-12-22 下午12:31:29 
	*
	* Modification History:
	* Date               Author            Version            Description
	* -------------------------------------------------------------------
	* 2011-12-22        zhangyin            v1.0.0                 修改原因
	*/
	public IAcctBillCustomizeValue[] queryBillCustomizeByCondition(long acctId, int startNum, int endNum) throws Exception;

	/**   
	* @Function: queryBillCustomizeCountByCondition 
	* @Description: 查询客户化帐单定制信息的数量
	*
	* @param acctId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: zhangyin
	* @date: 2011-12-22 下午12:32:00 
	*
	* Modification History:
	* Date               Author            Version            Description
	* -------------------------------------------------------------------
	* 2011-12-22        zhangyin            v1.0.0                 修改原因
	*/
	public int queryBillCustomizeCountByCondition(long acctId) throws Exception;

	/**   
	* @Function: queryAccounts 
	* @Description: 根据前台构造的查询条件XML报文查询账户信息。包括所有类型账户的查询。
	*
	* @param xmlComdition
	* @param startNum
	* @param endNum
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: zhangyin
	* @date: 2011-12-28 上午09:42:31 
	*
	* Modification History:
	* Date               Author            Version            Description
	* -------------------------------------------------------------------
	* 2011-12-28        zhangyin            v1.0.0                 修改原因
	*/
	DataContainer[] queryAccounts(String xmlComdition, int startNum, int endNum) throws Exception;

	/**   
	* @Function: queryAccountsCount 
	* @Description: 根据前台构造的查询条件XML报文查询账户数量。包括所有类型账户数量的查询。
	*
	* @param xmlComdition
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: zhangyin
	* @date: 2011-12-28 上午09:43:48 
	*
	* Modification History:
	* Date               Author            Version            Description
	* -------------------------------------------------------------------
	* 2011-12-28        zhangyin            v1.0.0                 修改原因
	*/
	public int queryAccountsCount(String xmlComdition) throws Exception;

	/**   
	 * 根据前台构造的查询条件DC报文查询账户数量。包括所有类型账户数量的查询。
	 * @Function queryAccountsCount
	 * @Description 
	 *
	 * @param conditionDC
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-6-4 下午9:49:02
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-4     zhangyin          v1.0.0               修改原因<br>
	 */
	public int queryAccountsCount(DataContainer conditionDC) throws Exception;

	/**   
	 * 查询账户，账户支付方式，客户化帐单定制，以及账户扩展的相关信息。
	 * @Function queryAcct
	 * @Description 
	 *
	 * @param acctId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-4-8 下午5:30:51
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-8     zhangyin          v1.0.0               修改原因<br>
	 */
	public DataContainer queryAcct(long acctId) throws Exception;

	/**
	 * 根据账户编号以及支付方式查询出该账户中未生效的账户支付记录
	 * @param acctId 账户编号
	 * @param payMethod 支付方式
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: yandong2
	 * @date: Apr 10, 2012 5:16:30 PM
	 */
	public DataContainer[] qryUnUsedCmAcctPaymentInfo(long acctId, int payMethod) throws Exception;

	/**
	 * 查询客户账户关系表信息
	 * @param acctId 账户编号
	 * @param custId 客户编号
	 * @param beanClass 查询的BO
	 * @param startIndex
	 * @param endIndex
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: yandong2
	 * @date: Apr 16, 2012 2:19:34 PM
	 */
	public DataContainer[] queryCustAcctRels(long acctId, long custId, Class beanClass, int startIndex, int endIndex) throws Exception;
	
	public int queryCustAcctRelsCount(long acctId, long custId, Class beanClass) throws Exception;

	/**
	 * 查询客户账户关系表信息条数
	 * @param acctId 账户编号
	 * @param custId 客户编号
	  * @param beanClass 查询的BO
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: yandong2
	 * @date: Apr 16, 2012 2:20:35 PM
	 */
	public int queryCustAcctRels(long acctId, long custId, Class beanClass) throws Exception;

	/**
	 * 保存集团账户关系信息表
	 * @param acctRelValue
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: yandong2
	 * @date: Apr 17, 2012 11:30:30 AM
	 */
	public void saveCustAcctRels(IBOCmCustAcctRelValue acctRelValue) throws Exception;

	/**   
	 * 根据客户编号（及账户支付方式）查询账户综合信息【包含账户基本信息、账户当前生效的支付方案、账户当前生效的账单定制信息】
	 * @Function queryAccountProfilesByCustId
	 * @Description 
	 *
	 * @param custId 客户编号【必须】
	 * @param payMethod 支付方式【非必须】
	 * @param queryType 查询类型【1：当前，2：下周期,-1:All】
	 * @param startNum 
	 * @param endNum
	 * @return 符合条件的账户综合信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-26 下午9:40:45
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-26     huzq2           v1.0.0               修改原因<br>
	 */
	public IAccountProfileValue[] queryAccountProfilesByCustId(long custId, int payMethod, int queryType, int startNum, int endNum) throws Exception;

	/**   
	 * 根据客户编号（及账户支付方式）查询账户综合信息数量
	 * @Function queryAccountProfileCountByCustId
	 * @Description 
	 *
	 * @param custId  客户编号【必须】
	 * @param payMethod 支付方式【非必须】
	 * @param queryType 查询类型【1：当前，2：下周期,-1:All】
	 * @return 符合条件的账户综合信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-26 下午9:42:15
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-26     huzq2           v1.0.0               修改原因<br>
	 */
	public int queryAccountProfileCountByCustId(long custId, int payMethod, int queryType) throws Exception;

	/**   
	 * 根据账户编号查询当前账户的综合信息【包含账户基本信息、账户当前生效的支付方案、账户当前生效的账单定制信息】
	 * @Function queryAccountProfileByAcctId
	 * @Description 
	 *
	 * @param acctId 账户编号
	 * @return 符合条件的账户综合信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-26 下午9:40:04
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-26     huzq2           v1.0.0               修改原因<br>
	 */
	public IAccountProfileValue queryAccountProfileByAcctId(long acctId) throws Exception;

	/**   
	 * 根据关联的客户编号查询关联的账户信息【包含账户基本信息、账户当前生效的支付方案、账户当前生效的账单定制信息】
	 * @Function queryAccountProfilesByRelCustId
	 * @Description 
	 *
	 * @param relCustId 关联的客户编号【必须】
	 * @param payMethod 支付方式【非必须】，见定义{@link CmConstants.AccountPayMethod}
	 * @param queryType 查询类型【1：当前，2：下周期,-1:All】
	 * @param startNum
	 * @param endNum
	 * @return 符合条件的账户综合信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-26 下午9:35:01
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-26     huzq2           v1.0.0               修改原因<br>
	 */
	public IAccountProfileValue[] queryAccountProfilesByRelCustId(long relCustId, int payMethod, int queryType, int startNum, int endNum) throws Exception;

	public IAccountValue[] queryAccountByRelCustId(long relCustId, int payMethod, int queryType, int startNum, int endNum) throws Exception;

	public int queryAccountCountByRelCustId(long relCustId, int payMethod, int queryType) throws Exception;

	/**   
	 * 根据关联的客户编号查询关联的账户数量
	 * @Function queryAccountProfileCountByRelCustId
	 * @Description 
	 *
	 * @param relCustId 关联的客户编号【必须】
	 * @param payMethod 支付方式【非必须】，见定义{@link CmConstants.AccountPayMethod}
	 * @param queryType 查询类型【1：当前，2：下周期,-1:All】
	 * @return 符合条件的账户综合信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-26 下午9:43:03
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-26     huzq2           v1.0.0               修改原因<br>
	 */
	public int queryAccountProfileCountByRelCustId(long relCustId, int payMethod, int queryType) throws Exception;

	/**   
	 * 查询账户当前账期和未生效账期信息，按生效日期倒序排列
	 * @Function queryCurrAcctBillCyclesByAcctId
	 * @Description 
	 *
	 * @param acctId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author caiyu
	 * @date 2012-10-4
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-10-4     caiyu           v1.0.0               修改原因<br>
	 */
	public IAcctBillCycleValue[] queryNextAcctBillCyclesByAcctId(long acctId) throws Exception;

	/**   
	 * 查询账户当前账期信息
	 * @Function queryCurrAcctBillCyclesByAcctId
	 * @Description 
	 *
	 * @param acctId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-23 下午2:47:00
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-23     huzq2           v1.0.0               修改原因<br>
	 */
	public IAcctBillCycleValue queryCurrAcctBillCyclesByAcctId(long acctId) throws Exception;

	/**   
	 * 查询账户的所有账期信息,包含失效的账期信息
	 * @Function queryAcctBillCyclesByAcctId
	 * @Description 
	 *
	 * @param acctId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-23 下午9:31:51
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-23     huzq2           v1.0.0               修改原因<br>
	 */
	public IAcctBillCycleValue[] queryAcctBillCyclesByAcctId(long acctId) throws Exception;

	/**   
	 * @Function queryAccountHis
	 * @Description 根据前台构造的查询条件XML报文查询账户数量。包括所有类型账户历史信息的查询。
	 *
	 * @param xmlComdition
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-1-6 上午09:44:40
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-1-6     zhangyin           v1.0.0               修改原因<br>
	 */
	DataContainer[] queryAccountHis(String xmlComdition, int startNum, int endNum) throws Exception;

	/**   
	 * @Function queryAccountHisCount
	 * @Description 根据前台构造的查询条件XML报文查询账户数量。包括所有类型账户历史信息数量的查询。
	 *
	 * @param xmlComdition
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-1-6 上午09:44:42
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-1-6     zhangyin           v1.0.0               修改原因<br>
	 */
	public int queryAccountHisCount(String xmlComdition) throws Exception;

	/**   
	 * @Function queryAcctAndPayments
	 * @Description 根据前台构造的查询条件XML报文查询账户和账户支付方式。包括所有类型账户信息的查询。
	 *
	 * @param xmlComdition
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-1-13 下午05:44:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-1-13     zhangyin           v1.0.0               修改原因<br>
	 */
	DataContainer[] queryAcctAndPayments(String xmlComdition, int startNum, int endNum) throws Exception;

	/**   
	 * @Function queryAcctAndPaymentsCount
	 * @Description 根据前台构造的查询条件XML报文查询账户和账户支付方式数量。包括所有类型账户信息数量的查询。
	 *
	 * @param xmlComdition
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-1-13 下午05:40:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-1-13     zhangyin           v1.0.0               修改原因<br>
	 */

	public int queryAcctAndPaymentsCount(String xmlComdition) throws Exception;

	/**   
	 * @Function queryAcctAndPaymentById
	 * @Description 根据账户编号和支付编号查询账户和支付方式信息
	 *
	 * @param acctId
	 * @param acctPaymentId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-1-14 上午10:11:28
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-1-14     zhangyin           v1.0.0               修改原因<br>
	 */
	public IQBOCmAcctPayMentValue queryAcctAndPaymentById(long acctId, long acctPaymentId) throws Exception;

	/**   
	 * 查询账户当前有效的账单定制信息
	 * @Function queryCurrAcctBillCustomizesByAcctId
	 * @Description 
	 *
	 * @param acctId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-14 下午2:27:26
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-14     huzq           v1.0.0               修改原因<br>
	 */
	public IAcctBillCustomizeValue queryCurrAcctBillCustomizesByAcctId(long acctId) throws Exception;

	/**   
	 * 根据地市编码和支付方式查询账户信息
	 * @Function queryAccountProfilesByRegionId
	 * @Description 
	 *
	 * @param regionId
	 * @param payMethod
	 * @param queryType
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-15 下午12:52:30
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-15     huzq           v1.0.0               修改原因<br>
	 */
	public IAccountProfileValue[] queryAccountProfilesByRegionId(String regionId, int payMethod, int queryType, int startNum, int endNum) throws Exception;

	public IAccountProfileValue[] queryAccountProfiles(DataContainer criteria, int startNum, int endNum) throws Exception;

	/**   
	 * 根据地市编码和支付方式查询账户信息
	 * @Function queryAccountProfileCountByRegionId
	 * @Description 
	 *
	 * @param regionId
	 * @param payMethod
	 * @param queryType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-15 下午12:59:59
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-15     huzq           v1.0.0               修改原因<br>
	 */
	public int queryAccountProfileCountByRegionId(String regionId, int payMethod, int queryType) throws Exception;

	/**   
	 * 查询账户当前有效的支付方案信息
	 * @Function queryCurrAcctPaymentsByAcctId
	 * @Description 
	 *
	 * @param acctId
	 * @return
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-19 下午2:39:38
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-19     huzq           v1.0.0               修改原因<br>
	 */
	public IAcctPaymentValue queryCurrAcctPaymentsByAcctId(long acctId) throws Exception;

	/**   
	 * 根据受理日期查询指定日期发生账期变更的账期信息
	 * @Function queryAcctBillCyclesByDoneDate
	 * @Description 
	 * 
	 * @param doneDate 指定的受理日期
	 * @return 符合条件的账户账期信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-28 上午10:16:43
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-28     huzq           v1.0.0               修改原因<br>
	 */
	public IAcctBillCycleValue[] queryAcctBillCyclesByDoneDate(Timestamp doneDate, int startNum, int endNum) throws Exception;

	/**
	 * 通过客户编号查询账单信息
	 * @Function queryBillCustomizesByCustId
	 * @Description 
	 *
	 * @param custId
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jul 5, 2012 6:51:52 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 5, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public IAcctBillCustomizeValue[] queryBillCustomizesByCustId(long custId, int startNum, int endNum) throws Exception;

	/**
	 * 通过客户编号查询账单信息数量
	 * @Function queryBillCustomizeCountByCustId
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jul 5, 2012 6:51:57 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 5, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public int queryBillCustomizeCountByCustId(long custId) throws Exception;

	/**
	 * 根据userId查询用户个性化帐单信息
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public IBOCmBillCustomizeValue queryCmBillCustomizeByUserId(long userId, int startNum, int endNum) throws Exception;

	public IBOCmBillCustomizeValue queryCmBillCustomizeByUserId(long userId) throws Exception;

	public IBOCmAccountHisValue[] queryAccountHis(long custId, String custName, String doneDate, String startDate, String endDate, int startNum, int endNum) throws Exception;

	public IBOCmAccountHisValue[] queryAccountHis(String condition, Map paraMap, String[] billingCycles, int startNum, int endNum) throws Exception;

	public int queryAccountHisCount(long custId, String custName, String doneDate, String startDate, String endDate) throws Exception;

	/**
	 * 根据payment_id查询账户银行代扣额度信息
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public IBOCmCmxAcctPaymentAttrValue queryCmxAcctPaymentAttrById(long payment_id, String attr_code) throws Exception;

	/**
	 * 保存账户的账期信息
	 * @Function saveAccountValue
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jul 5, 2012 6:51:57 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 9, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public void saveAccountValue(IBOCmAcctBillCycleValue[] acctValue) throws Exception;

	/**   
	 * 根据账户编号查询当前账期   注：此查询查询账期的失效日期大约当前日期
	 * @Function qryCurrAcctBillCyclesByAcctId
	 * @Description 
	 *
	 * @param acctId
	 * @param regionId 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-9-23 下午2:47:00
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-9-23     kangzk           v1.0.0               修改原因<br>
	 */
	public IBOCmAcctBillCycleValue[] qryCurrAcctBillCyclesByAcctId(long acctId, String regionId) throws Exception;

	/**   
	 * @Function queryAcctsByIds
	 * @Description 根据账户编号数组查询账户信息
	 *
	 * @param acctIds
	 * @param regionId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 16, 2012 10:34:14 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 16, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IAccountValue[] queryAcctsByIds(long[] acctIds, String regionId) throws Exception;
	
	/**
	 * 针对OSE getAccountSimpleListByCustId 接口，去掉first name second name的或者，减少查询
	 */
	public IAccountValue[] queryAcctsByIdsForOSE(long[] acctIds, String regionId) throws Exception;

	/**   
	 * @Function queryAcctsByCustId
	 * @Description 根据账户，客户编号查询账户信息（使用客户账户关系表）
	 *
	 * @param custId
	 * @param acctId
	 * @param startIndex
	 * @param endIndex
	 * @return
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 16, 2012 11:23:38 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 16, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IAccountValue[] queryAcctsById(long acctId, long custId, int startIndex, int endIndex) throws Exception;

	/**
	 * 为OSE接口专提供
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2019-9-9
	* CmAccountSVImpl
	 */
	public IAccountValue[] queryAcctsByIdForOSE(long acctId, long custId, int startIndex, int endIndex) throws Exception ;
	
	/**   
	 * @Function queryAcctsCountByCustId
	 * @Description 根据客户编号查询账户信息数量（使用客户账户关系表）
	 *
	 * @param custId
	 * @param acctId
	 * @return
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 16, 2012 11:24:07 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 16, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public int queryAcctsCountById(long acctId, long custId) throws Exception;

	/**   
	 * @Function queryAcctDtsByIds
	 * @Description 查询账户详细信息（账户，支付方案，账期）
	 *
	 * @param acctIds
	 * @param regionId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 16, 2012 8:53:43 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 16, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IAccountProfileValue[] queryAcctDtsByIds(long[] acctIds, String regionId) throws Exception;

	public IAccountProfileValue[] queryAllAcctDtsByIds(long[] acctIds, String regionId) throws Exception;

	/**   
	 * @Function queryAcctDtsById
	 * @Description 根据账户，客户编号查询账户详细信息
	 *
	 * @param acctId
	 * @param custId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 16, 2012 8:59:46 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 16, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IAccountProfileValue[] queryAcctDtsById(long acctId, long custId, int start, int end) throws Exception;

	public IAccountProfileValue[] queryAcctDtsByIdAndInstallmentFlag(long acctId, long custId, long installmentFlag, int start, int end) throws Exception;
	/**   
	 * @Function queryAcctDtsCountById
	 * @Description 根据账户，客户编号查询账户详细信息数量
	 *
	 * @param acctId
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 16, 2012 9:00:24 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 16, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public int queryAcctDtsCountById(long acctId, long custId) throws Exception;

	/**   
	 * @Function queryAcctDtsByCustId
	 * @Description 根据客户编号地市查询账户信息
	 *
	 * @param custId
	 * @param regionId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 23, 2012 2:47:48 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 23, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IAccountProfileValue[] queryAcctDtsByCustId(long custId, String regionId, int start, int end) throws Exception;

	/**   
	 * @Function queryAcctDtsCountByCustId
	 * @Description 根据客户编号地市查询账户信息数量
	 *
	 * @param custId
	 * @param regionId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 23, 2012 2:48:03 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 23, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public int queryAcctDtsCountByCustId(long custId, String regionId) throws Exception;

	/**   
	 * @Function queryBillCustomizeByAcctId
	 * @Description 根据账户编号查询账户个性化账单
	 *
	 * @param acctId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 22, 2012 3:03:46 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 22, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IAcctBillCustomizeValue queryBillCustomizeByAcctId(long acctId) throws Exception;

	/**   
	 * @Function queryBillCustomizesByAcctIds
	 * @Description 根据账户编号列表和地市，查询该地市下面的所有个性化账单
	 *
	 * @param acctIds
	 * @param regionId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 22, 2012 3:07:03 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 22, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IAcctBillCustomizeValue[] queryBillCustomizesByAcctIds(long[] acctIds, String regionId) throws Exception;

	/**   
	 * @Function queryBillCustomizesByCustId
	 * @Description 根据客户编号查询所有的个性化账单
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 22, 2012 3:07:26 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 22, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IAcctBillCustomizeValue[] queryBillCustomizesByCustId(long custId) throws Exception;

	/**   
	 * @Function acctTransTrack
	 * @Description 携号转修改账户接口
	 *
	 * @param acctId
	 * @param outRegionId 转出地市
	 * @param inRegionId 转入地市
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 22, 2012 4:00:43 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 22, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void acctTransTrack(long acctId, String outRegionId, String inRegionId) throws Exception;

	/**   
	 * @Function queryAcctDtsByCdn
	 * @Description 根据客户编号和手机号码查询账户详细信息
	 *
	 * @param custId
	 * @param billId 查询该用户的默认付费账户
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 22, 2012 9:37:25 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 22, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IAccountProfileValue[] queryAcctDtsByCdn(long custId, String billId, int start, int end) throws Exception;

	/**   
	 * @Function queryAcctDtsCountByCdn
	 * @Description 根据客户编号和手机号码查询账户详细信息数量
	 *
	 * @param custId
	 * @param billId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 22, 2012 9:38:23 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 22, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public int queryAcctDtsCountByCdn(long custId, String billId) throws Exception;

	/**   
	 * @Function updateAcctBehalfPhone
	 * @Description 修改账户代表号码
	 *
	 * @param acctId
	 * @param acctBehalfPhone 传空则为清空，传具体的值则修改
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 23, 2012 4:19:27 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 23, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void updateAcctBehalfPhone(long acctId, String acctBehalfPhone) throws Exception;

	/**   
	 * @Function queryBankAcctsByCustId
	 * @Description 集团对公托收查询（即查询集团下面的托收账户信息）
	 *
	 * @param paraMap
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Nov 2, 2012 4:05:14 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Nov 2, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public Map queryBankAcctsByCustId(Map paraMap) throws Exception;

	/**   
	 * @Function delCustAndAcct
	 * @Description 删除对应的客户和账户信息
	 *
	 * @param custId
	 * @param acctId
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Nov 12, 2012 8:50:47 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Nov 12, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void delCustAndAcct(long custId, long acctId) throws Exception;

	/**   
	 * @Function delCustAndAcct
	 * @Description 删除对应的客户和账户信息
	 *
	 * @param custId
	 * @param acctId
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Nov 12, 2012 8:50:47 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Nov 12, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void delAcctInfo(long acctId) throws Exception;

	public int queryAcctDtsCountByCustIdAndBillId(long custId, String regionId, String billId, String payMethod, int insFlag) throws Exception;

	/**
	 * 选择账户查询方法
	 * @param custId 
	 * @param regionId
	 * @param billId
	 * @param payMethod
	 * @param insFlag 分期表示
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 */
	public IAccountProfileValue[] queryAcctDtsByCustIdAndBillId(long custId, String regionId, String billId, String payMethod, int insFlag, int start, int end) throws Exception;

	public IAccountProfileValue[] queryAcctDtsByCustIdAndBillId(long custId, String regionId, String billId, String payMethod, int insFlag, long agrId, String acctName,
			long acctId, int start, int end) throws Exception;

	public IAccountProfileValue[] queryAcctDtsByCustIdAndBillId(long custId, String regionId, String billId, String payMethod, int insFlag, String agrId, String acctName,
			long acctId, int start, int end) throws Exception ;
	/**
	 * 
	 * @Function queryAcctDtsCountByCustIdAndBillId
	 * @Description 
	 *
	 * @param custId
	 * @param regionId
	 * @param billId
	 * @param payMethod
	 * @param insFlag
	 * @param agrId
	 * @param acctName
	 * @param acctId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2015-10-13 下午12:48:40
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-10-13     yangjh           v1.0.0               修改原因<br>
	 */
	public int queryAcctDtsCountByCustIdAndBillId(long custId, String regionId, String billId, String payMethod, int insFlag, long agrId, String acctName, long acctId)
			throws Exception;

	public int queryAcctDtsCountByCustIdAndBillId(long custId, String regionId, String billId, String payMethod, int insFlag, String agrId, String acctName, long acctId)
			throws Exception ;

	public IAccountProfileValue[] queryAcctDtsByCustIdAndBillId(long custId, String regionId, String billId, String payMethod, int start, int end) throws Exception;

	/**
	 * 根据acctId和PartyId插入关系表
	 * @param acctId
	 * @param partyId
	 * @throws Exception
	 */
	public void addPartyAcctRel(long acctId, long partyId,Timestamp date) throws Exception;

	/**   
	 * @Function querPayerByAcctId
	 * @Description 根据acctId查询payer信息
	 *
	 * @param custId
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Nov 12, 2012 8:50:47 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Nov 12, 2014     sunqi          v1.0.0               修改原因<br>
	 */
	public IQBOCmPartyValue querPayerByAcctId(long acctId) throws Exception;

	/**   
	 * @Function queryPartyAccRel
	 * @Description 根据传入的参数查询partyAcctrel信息
	 * 传-1不加入查询条件
	 * @param acctId
	 * @param partyId
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author sunqi
	 * @date Nov 12, 2012 8:50:47 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Nov 12, 2014     sunqi          v1.0.0               修改原因<br>
	 */
	public IBOCMPartyAcctRelValue[] queryPartyAccRel(long acctId, long partyId) throws Exception;

	/**
	 * 查询层级下所有账户
	 * @param custId 客户的id
	 * @return
	 * @throws Exception
	 */
	public DataContainer[] queryAllAccountInHierarchy(long custId, long acctId, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus, int start,
			int end) throws Exception;

	public int queryAllAccountInHierarchyCount(long custId, long acctId, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus) throws Exception;

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
	public IBOCmCustAcctRelValue[] queryCustAcctRel(long relCustd, long acctId, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus, int start,
			int end) throws Exception;

	public IBOCmCustAcctRelValue[] queryCustAcctRel(long relCustd, long acctId, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus, int start,
			int end, String state) throws Exception;

	public IBOCmCustAcctRelValue[] queryCustAcctRel(long relCustd, long acctId, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus, int start,
			int end, String state, String agrId) throws Exception;
	public int queryCustAcctRelCount(long relCustd, long acctId, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus, String state, String agrId) throws Exception;

	public int queryCustAcctRelCount(long relCustd, long acctId, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus) throws Exception;

	/**
	 * 360页面账户查询方法
	 * @param relCustd
	 * @param acctId
	 * @param acctName
	 * @param installmentFalg
	 * @param paymethod
	 * @param cycleType
	 * @param custStatus
	 * @param acctServiceId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 */
	public IBOCmCustAcctRelValue[] queryCustAcctRelFor360(long relCustd, long acctId, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus,
			String acctServiceId, int start, int end) throws Exception;

	/**
	 * 360账户视图count方法
	 * @param relCustd
	 * @param acctId
	 * @param acctName
	 * @param installmentFalg
	 * @param paymethod
	 * @param cycleType
	 * @param custStatus
	 * @return
	 * @throws Exception
	 */
	public int queryCustAcctRelCountFor360(long relCustd, long acctId, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus, String acctServiceId)
			throws Exception;

	/**
	 * 360页面账户查询方法
	 * @param relCustd
	 * @param acctId
	 * @param acctName
	 * @param installmentFalg
	 * @param paymethod
	 * @param cycleType
	 * @param custStatus
	 * @param acctServiceId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 */
	public IBOCmCustAcctRelValue[] queryCustAcctRelFor360(long relCustd, long acctId, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus,
			String acctServiceId, String serviceNumber, String pbs, String ean, int start, int end) throws Exception;

	/**
	 * 360账户视图count方法
	 * @param relCustd
	 * @param acctId
	 * @param acctName
	 * @param installmentFalg
	 * @param paymethod
	 * @param cycleType
	 * @param custStatus
	 * @return
	 * @throws Exception
	 */
	public int queryCustAcctRelCountFor360(long relCustd, long acctId, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus, String acctServiceId,
			String serviceNumber, String pbs, String ean) throws Exception;

	/**
	 * 同步客户信息到账户
	 * @param custId 客户id
	
	 * @param param 需要同步的字段  key" BILL_DUE_DATE" 缴费日 "ACCT_BEHALF_PHONE" 是否免收托运费
	 * @return
	 * @throws Exception
	 */
	public void synchronizeAcctInfo(long custId, Map param) throws Exception;

	/**
	 * 同步保证Payment Terms和Reason
	 * @param relCustd
	 * @param acctId
	 * @param acctName
	 * @param installmentFalg
	 * @param paymethod
	 * @param cycleType
	 * @param custStatus
	 * @return
	 * @author sunyan
	 * @throws Exception
	 */
	public void savePaymentAndReason(long acctId, long custId, String paymentTeams, String reason) throws Exception;

	/**
	 * 查询party_acct_rel带状态
	 * @param acctId
	 * @param partyId
	 * @param State
	 * @return
	 * @throws Exception
	 */
	public IBOCMPartyAcctRelValue[] queryPartyAccRel(long acctId, long partyId, String State) throws Exception;

	/**   
	 * @Function getBillDayAndBillCycle
	 * @Description 
	 *
	 * @param custId
	 * @param param
	 * AGREEMENT_ID
	 * AGREEMENT_CODE
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-2 下午4:01:30
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-2     shitian             v1.0.0               修改原因<br>
	 */
	public Map getBillDayAndBillCycle(long custId, Map param) throws Exception;

	/**   
	 * @Function queryPayerAccts
	 * @Description 
	 *
	 * @param partyId
	 * @param startIndex
	 * @param endIndex
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-17 下午3:41:57
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-17     shitian             v1.0.0               修改原因<br>
	 */
	public DataContainerInterface[] queryPayerAccts(long partyId, int startIndex, int endIndex) throws Exception;

	/**   
	 * @Function queryPayerAcctsCount
	 * @Description 
	 *
	 * @param partyId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-17 下午3:42:15
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-17     shitian             v1.0.0               修改原因<br>
	 */
	public int queryPayerAcctsCount(long partyId) throws Exception;

	/**
	 * 只有客管内部修改账户才上发
	 * @throws Exception
	 */
	public void updateAccountSend(IVOAccountValue accountValue) throws Exception;
	
	/**
	 * 360页面账户查询方法
	 * @param relCustd
	 * @param acctId
	 * @param acctName
	 * @param installmentFalg
	 * @param paymethod
	 * @param cycleType
	 * @param custStatus
	 * @param acctServiceId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 */
	public IBOCmCustAcctRelValue[] queryCustAcctRel4MoreAcctIds(long relCustd, long[] acctId, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus,
			String acctServiceId, int start, int end) throws Exception;

	/**
	 * 360账户视图count方法
	 * @param relCustd
	 * @param acctId
	 * @param acctName
	 * @param installmentFalg
	 * @param paymethod
	 * @param cycleType
	 * @param custStatus
	 * @return
	 * @throws Exception
	 */
	public int queryCustAcctRelCount4MoreAcctIds(long relCustd, long[] acctId, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus, String acctServiceId)
			throws Exception;
	
	public DataContainer[] queryCustAcctRelsAll(long acctId, long custId, Class beanClass, int startIndex, int endIndex) throws Exception;
	
	public int queryCustAcctRelsAllCount(long acctId, long custId, Class beanClass) throws Exception;
	
	public IBOCmCustAcctRelValue[] queryCustAcctRel4CR128(long relCustd, long acctId, String acctName, int installmentFalg, int paymethod, int cycleType, String custStatus, int start,
			int end) throws Exception;

	IBOCmCustAcctRelValue queryCustAcctRelForCVS833(long custId, long acctId) throws Exception;
}
