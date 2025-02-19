package com.asiainfo.crm.cm.teaminvoke.out.service.interfaces;

import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.customer.group.ivalues.IBoCmCustSegmentValue;
import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmCustAcctRelValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmCustContMediumAndTypeValue;
import com.asiainfo.crm.cm.model.ivalues.IAccountProfileValue;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCycleValue;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;

/**
 * 客户管理提供给合同的接口
 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author yangjh
 * @date Jul 9, 2014 9:34:52 AM
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * Jul 9, 2014     yangjh           v1.0.0               修改原因<br>
 */
public interface ICm2ContractSV {

	/**
	 * 查询丹麦客户细分
	 * @Function getCustSegment4DK
	 * @Description 
	 *
	 * @param CustType（-1全部，1：个人，3：集团）
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date Jul 9, 2014 10:04:22 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 9, 2014     yangjh           v1.0.0               修改原因<br>
	 */
	public IBoCmCustSegmentValue[] getCustSegment4DK(int CustType) throws Exception;

	/**
	 * 
	 * @Function getCustByCertCode4DK
	 * @Description 
	 *
	 * @param cprNumber
	 * @param kobNumber
	 * @param custType(如果按cprNumber查询则传入1，如果按kobNumber查询则传入3)
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date Jul 15, 2014 3:37:29 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 15, 2014     yangjh           v1.0.0               修改原因<br>
	 */
	public ICustomerValue getCustByCertCode4DK(String cprNumber, String kobNumber, int custType) throws Exception;

	/**   
	 * @Function queryCustContactMediums
	 * @Description 查询客户到联系媒介
	 * 媒介枚举值为：CmConstants.AddressId
	 * 21：EMAIL
	 * 31：联系电话
	 * 32：FAX
	 * 33：短信
	 * 35：紧急联系
	 * 36：平信
	 * 37：彩信
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-28 下午2:37:12
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-28     shitian             v1.0.0               修改原因<br>
	 */
	public IQBOCmCustContMediumAndTypeValue[] queryCustContactMediums(long custId) throws Exception;

	/**   
	 * @Function queryAcctsById
	 * @Description 查询客户名下账户列表
	 *	acctType用来区分账户是自有/代付
	 *	CmConstants.AccountConstants.SELF_ACCT 1 	自有
	 *	CmConstants.AccountConstants.REAL_ACCT 2 	代付
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-28 下午2:54:37
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-28     shitian             v1.0.0               修改原因<br>
	 */
	public IAccountValue[] queryAcctsById(long custId) throws Exception;

	/**   
	 * @Function queryCurrAcctBillCyclesByAcctId
	 * @Description 查询账期信息
	 *
	 * @param acctId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-28 下午2:57:26
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-28     shitian             v1.0.0               修改原因<br>
	 */
	public IAcctBillCycleValue queryCurrAcctBillCyclesByAcctId(long acctId) throws Exception;

	/**   
	 * @Function queryCustomerContacts
	 * @Description 查询集团客户联系人的联系信息
	 * 目前联系人的联系方式只有以下5种
	 *contactValue.getMainEmail
	 *contactValue.getSecondEmail
	 *contactValue.getMainContNumber
	 *contactValue.getSecondContNumber
	 *contactValue.getSmsNumber
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-28 下午4:44:09
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-28     shitian             v1.0.0               修改原因<br>
	 */
	public IContactValue[] queryCustomerContacts(long custId) throws Exception;

	/**   
	 * @Function queryGroupCompanyStatus
	 * @Description 查询集团客户状态
	 * 公司状态：
	 * customerValue.getCompanyStatus()
	 * 枚举值：
	 * 1.AKT (Active)在网
	 * 2.INA(Inactive)离网
	 * 3.OPH (bankruptcy)破产
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-30 下午3:17:09
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-30     shitian             v1.0.0               修改原因<br>
	 */
	public ICustomerValue queryGroupCompanyStatus(long custId) throws Exception;

	/**
	 * 根据账户id查询账户信息
	 * @param acctId
	 * @return
	 * @throws Exception
	 */
	public IAccountProfileValue getAccountById(long acctId, String regionId) throws Exception;

	/**
	 * 查询所有competitor类型的集团客户信息
	 * @param acctId
	 * @return
	 * @throws Exception
	 */
	public ICustomerValue[] queryCompetitorCustomer() throws Exception;

	/**
	 * 
	 * @param agreementId
	 * @param billCycle当合同签字的时候，如果合同新老账期不一致，则调用客管提供的接口changeBillCycleFromAgr
		客管需修改该合同下所有账户的账期与合同保持一致。如果修改失败，客管需要抛异常,合同侧收到异常后让合同签字失败
	 */
	public void changeBillCycleFromAgr(long agreementId, String billCycle) throws Exception;

	/**
	 *  billCycle当合同签字的时候，如果合同新老账期不一致，则调用客管提供的接口changeBillCycleFromAgr
		客管需修改该合同下指定帐户的账期与合同保持一致。如果修改失败，客管需要抛异常,合同侧收到异常后让合同签字失败
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2019-1-22
	* ICm2ContractSV
	 */
	public void changeBillCycleFromAgrAndAcctId(long agreementId,long acctId, String billCycle) throws Exception;
	
	/**
	 * 查询合同绑定的账户列表
	 * @param agreementId
	 * @return
	 */
	public IBOCmCustAcctRelValue[] queryAccountByAgreementId(long agreementId) throws Exception;

	/**
	 * 查询合同和acctId绑定的账户列表
	 * @param agreementId
	 * @return
	 */
	public IBOCmCustAcctRelValue[] queryAccountByAgreementIdAndAcctId(long agreementId,long acctId) throws Exception;
	
	/**
	 * 删除合同
	 * @param agreementId
	 * @throws Exception
	 */
	public void deleteAccountRelaByAgreementId(long agreementId) throws Exception;

	/**
	 * 合同状态变化触发生命周期
	 * @Function changeB2BLifeCycle
	 * @Description 
	 *
	 * @param custId
	 * @param agreementId
	 * @param agreementStatus(1:合同签字，2：过期或终止)
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2015-9-18 上午9:30:54
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-18     yangjh           v1.0.0               修改原因<br>
	 */
	public void changeB2BLifeCycle(long custId, long agreementId, long agreementStatus) throws Exception;

	/**
	 * 查询合同绑定的账户列表
	 * @Function queryAccountByAgreementId
	 * @Description 
	 *
	 * @param agreementId
	 * @param acctType(0：普通账户,1：分期付款账户,2：津贴账户)
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2015-10-14 上午9:44:54
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-10-14     yangjh           v1.0.0               修改原因<br>
	 */
	public IBOCmCustAcctRelValue[] queryAccountByAgreementId(long agreementId, int acctType) throws Exception;

	/**
	 * 删除合同
	 * @param agreementId
	 * @throws Exception
	 */
	public void deleteAccountRelaByAgreementId(long agreementId, long custId) throws Exception;

	/**
	 * 合同变更paymentTerms
	 * @Function changePaymentTermsFromAgr
	 * @Description 
	 *
	 * @param agreementId
	 * @param paymentTerms
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2015-12-28 下午12:52:19
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-12-28     yangjh           v1.0.0               修改原因<br>
	 */
	public void changePaymentTermsFromAgr(long agreementId, long paymentTerms) throws Exception;
	
	/**
	 * 合同变更paymentTerms
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2019-1-23
	* ICm2ContractSV
	 */
	public void changePaymentTermsFromAgrAndAcctId(long agreementId,long acctId, long paymentTerms) throws Exception;

	/**
	 * 模糊化个人客户信息
	 * @Function maskCustomerInfo
	 * @Description 
	 *
	 * @param dc
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2016-4-13 下午1:54:09
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2016-4-13     yangjh           v1.0.0               修改原因<br>
	 */
	public DataContainerInterface maskCustomerInfo(DataContainerInterface dc) throws Exception;
	/**
	 * 查找合同下的账户
	 * @param agreementId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 */
	public IBOCmCustAcctRelValue[] queryAccountByAgreementId(long agreementId, int start, int end) throws Exception;
	
	public int queryAccountByAgreementIdCount(long agreementId) throws Exception;

}
