package com.asiainfo.crm.cm.ln.account.service.interfaces;

import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmPartyValue;
import com.asiainfo.crm.cm.ln.account.bo.BOCmAccBusiCreditBean;
import com.asiainfo.crm.cm.ln.account.bo.BOCmRaccOperBean;
import com.asiainfo.crm.cm.ln.account.ivalues.IBOCmInsAccrelValue;
import com.asiainfo.crm.cm.ln.account.ivalues.IBOCmxAcctBankRelValue;
import com.asiainfo.crm.cm.model.ivalues.IAccountProfileValue;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;

public interface ICmLnAccountSV {

	public IAccountProfileValue[] queryAccountProfiles(DataContainer criteria, int startNum, int endNum) throws Exception;

	public int queryAccountProfilesCount(DataContainer criteria) throws Exception;

	public IAccountProfileValue[] queryAccountProfilesByCustId(long custId, int payMethod, int queryType, int startNum, int endNum) throws Exception;

	public IAccountProfileValue queryAccountProfileByAcctId(long acctId) throws Exception;

	public int queryAccountProfileCountByCustId(long custId, int payMethod, int queryType) throws Exception;

	/**   
	 * @Function saveAcctBankRels
	 * @Description 保存账户银行关系表
	 *
	 * @param acctBankRelValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 5, 2012 2:56:44 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 5, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void saveAcctBankRels(IBOCmxAcctBankRelValue[] acctBankRelValues) throws Exception;

	/**   
	 * @Function queryAcctBankRel
	 * @Description 根据手机号码和账户编号查询签约关系
	 *
	 * @param billId
	 * @param acctId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 5, 2012 4:34:04 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 5, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmxAcctBankRelValue[] queryAcctBankRel(String billId, long acctId) throws Exception;

	/**   
	 * @Function signBank
	 * @Description 银行签约(和默认付费账户)
	 *
	 * @param tradeSeq	签约流水
	 * @param billId	手机号码
	 * @param bankCode	银行编码
	 * @param actionDate	操作请求日期（日期格式：YYYYMMDD）
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 5, 2012 3:50:03 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 5, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public String signBank(String tradeSeq, String billId, String bankCode, String actionDate) throws Exception;

	/**   
	 * @Function fireBank
	 * @Description 解约
	 *
	 * @param billId
	 * @param acctId 默认付费账户
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 5, 2012 4:32:37 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 5, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public String fireBank(String billId, long acctId) throws Exception;

	/**   
	 * @Function queryAcctAndPayments
	 * @Description 查询账户和支付方案信息
	 *
	 * @param bankAccount
	 * @param regionId
	 * @param payMethod
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 9, 2012 4:06:24 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 9, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IAccountProfileValue[] queryAcctAndPayments(String bankAccount, String regionId, long payMethod) throws Exception;

	/**   
	 * @Function singOrFireBank
	 * @Description 浦发签约解约
	 *
	 * @param paraMap
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 12, 2012 10:42:39 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 12, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public Map singOrFireBank(Map paraMap) throws Exception;

	/**   
	 * @Function singOrFireMobile
	 * @Description 手机支付签约解约
	 *
	 * @param paraMap
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author xiezl
	 * @date Oct 12, 2012 10:42:39 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 12, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public Map singOrFireMobile(Map parameter) throws Exception;

	/**   
	 * @Function queryAcctAndPayments
	 * @Description 查询账户和支付方案信息
	 *
	 * @param bankAccount
	 * @param regionId
	 * @param payMethod
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 9, 2012 4:06:24 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 9, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IAccountProfileValue[] queryAcctAndPayments(String bankAccount, String regionId, long payMethod, int start, int end) throws Exception;

	/**   
	 * @Function queryAcctAndPaymentsCount
	 * @Description 查询账户和支付方案信息数量
	 *
	 * @param bankAccount
	 * @param regionId
	 * @param payMethod
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 24, 2012 8:36:43 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 24, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public int queryAcctAndPaymentsCount(String bankAccount, String regionId, long payMethod) throws Exception;

	/**   
	 * @Function queryAcctAndPayments
	 * @Description 查询账户和支付方案信息
	 *
	 * @param bankAccount
	 * @param regionId
	 * @param payMethod
	 * @param bankCode
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 9, 2012 4:06:24 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 9, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IAccountProfileValue[] queryAcctAndPayments(String bankAccount, String regionId, long payMethod, String bankCode, int start, int end) throws Exception;

	/**   
	 * @Function queryAcctAndPaymentsCount
	 * @Description 查询账户和支付方案信息数量
	 *
	 * @param bankAccount
	 * @param regionId
	 * @param payMethod
	 * @param bankCode
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 24, 2012 8:36:43 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 24, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public int queryAcctAndPaymentsCount(String bankAccount, String regionId, long payMethod, String bankCode) throws Exception;

	/**   
	 * @Function saveCmRaccOper
	 * @Description 
	 *
	 * @param raccOperBean
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Nov 16, 2012 8:02:18 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Nov 16, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void saveCmRaccOper(BOCmRaccOperBean raccOperBean) throws Exception;

	/**   
	 * @Function saveCmAccBusiCredit
	 * @Description 
	 *
	 * @param accBusiCreditBean
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Nov 16, 2012 8:02:23 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Nov 16, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void saveCmAccBusiCredit(BOCmAccBusiCreditBean accBusiCreditBean) throws Exception;
	
	/**   
	 * @Function saveAcctCredit
	 * @Description 保存账户信用度上发工单表
	 *
	 * @param accountValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Nov 16, 2012 8:18:47 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Nov 16, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void saveAcctCredit(IAccountValue accountValue) throws Exception;
	
	/**
	 * 根据账户ID查询帐务关系
	 * 
	 * @param acctId
	 * @return
	 * @throws Exception
	 */
	public IBOCmInsAccrelValue[] getInsAccrelsByAcct(long acctId,long payType,int startIdx,int endIdx)throws Exception;
	
	/**
	 * 根据账户ID查询帐务关系数量
	 * 
	 * @param acctId
	 * @return
	 * @throws Exception
	 */
	public int getInsAccrelsCountByAcct(long acctId,long payType)throws Exception;

	/**
	 * 保存账务关系
	 * @param val
	 * @param operation(1:新增,2：修改;3：删除)
	 * @throws Exception
	 */
	public void saveInsAccrel(IBOCmInsAccrelValue val,long operation) throws Exception;
	
	/**
	 * 根据账户ID查询帐务关系
	 * 
	 * @param acctId
	 * @return
	 * @throws Exception
	 */
	public IBOCmInsAccrelValue[] getInsAccrelsByAcctFor360(long acctId,long payType,int startIdx,int endIdx)throws Exception;
	
	/**
	 * 根据账户ID查询帐务关系数量
	 * 
	 * @param acctId
	 * @return
	 * @throws Exception
	 */
	public int getInsAccrelsCountByAcctFor360(long acctId,long payType)throws Exception;
	public IBOCmPartyValue[] getPayerByAcctId(long accID)throws Exception;
	/**
	 * 根据账户ID查询账户（模糊化查询）
	 * @param acctId
	 * @return
	 * @throws Exception
	 * 
	 */
	public IAccountProfileValue queryMaskAccountProfileByAcctId(long acctId) throws Exception; 
	
	/**
	 * 根据账户ID和状态查询帐务关系
	 * 
	 * @param acctId
	 * @param payType(-1:全部,1：默认,2：代付)
	 * @param state
	 * @return
	 * @throws Exception
	 */
	public IBOCmInsAccrelValue[] getInsAccrelsByAcct(long acctId, long payType, int state, int startIdx, int endIdx) throws Exception;
}
