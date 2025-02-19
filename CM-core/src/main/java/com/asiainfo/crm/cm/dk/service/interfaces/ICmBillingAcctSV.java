/**
 * 
 */
package com.asiainfo.crm.cm.dk.service.interfaces;

import java.util.Map;

import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmAcctBillFormatValue;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmAcctContactValue;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmBillFormatDtlValue;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmPayChannelValue;

/**   
 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author Administrator
 * @date 2014-11-26 上午10:11:25
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2014-11-26     shitian           v1.0.0               修改原因<br>
 */
public interface ICmBillingAcctSV {

	/**   
	 * @Function queryAcctBillFormat
	 * @Description 
	 *
	 * @param acctId
	 * @param type 0:pre 1:post 2:hybird
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-11-26 上午10:13:09
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-26     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmAcctBillFormatValue queryAcctBillFormat(long acctId, int type) throws Exception;

	/**   
	 * @Function queryAcctBillFormats
	 * @Description 
	 *
	 * @param acctId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-12-16 下午3:21:40
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-16     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmAcctBillFormatValue[] queryAcctBillFormats(long acctId) throws Exception;

	/**   
	 * @Function queryAcctContacts
	 * @Description 
	 *
	 * @param acctId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-11-26 上午10:15:55
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-26     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmAcctContactValue[] queryAcctContacts(long acctId, int start, int end) throws Exception;

	/**   
	 * @Function queryAcctContactsCount
	 * @Description 
	 *
	 * @param acctId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-11-26 上午10:15:58
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-26     shitian             v1.0.0               修改原因<br>
	 */
	public int queryAcctContactsCount(long acctId) throws Exception;

	/**   
	 * @Function queryAcctPayChannel
	 * @Description 
	 *
	 * @param acctId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-11-26 上午10:17:01
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-26     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmPayChannelValue queryAcctPayChannel(long acctId) throws Exception;

	/**   
	 * @Function queryAcctContacts
	 * @Description 
	 *
	 * @param acctId
	 * @param contactId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-11-28 下午3:09:29
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-28     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmAcctContactValue queryAcctContacts(long acctId, long contactId) throws Exception;

	/**   
	 * @Function getAcctFee
	 * @Description 
	 *
	 * @param payChannelValue
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-12-1 上午9:54:42
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-1     shitian             v1.0.0               修改原因<br>
	 */
	public String getAcctFee(IBOCmPayChannelValue payChannelValue) throws Exception;

	/**   
	 * @Function getAcctFee
	 * @Description 
	 *
	 * @param billFormat
	 * @param deliveryMethod
	 * @param copyBillCount
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-12-24 下午3:24:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-24     shitian             v1.0.0               修改原因<br>
	 */
	public String getBillFormatFee(long billFormat, long deliveryMethod, int copyBillCount) throws Exception;

	/**   
	 * @Function saveAcctPayment
	 * @Description 
	 *
	 * @param payChannelValue
	 * @param bllAcctBillFormatValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-12-10 下午3:28:21
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-10     shitian             v1.0.0               修改原因<br>
	 */
	public void saveAcctPayment(long acctId, long custId, IBOCmPayChannelValue payChannelValue, IBOCmAcctBillFormatValue[] bllAcctBillFormatValues,
			IBOCmAcctContactValue acctContactValue) throws Exception;

	/**   
	 * @Function saveAcctContact
	 * @Description 
	 *
	 * @param acctId
	 * @param custId
	 * @param acctContactValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-12-10 下午4:49:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-10     shitian             v1.0.0               修改原因<br>
	 */
	public void saveAcctContact(long acctId, long custId, IBOCmAcctContactValue[] acctContactValues) throws Exception;

	/**   
	 * @Function queryAcctFormatType
	 * @Description 
	 *
	 * @param acctId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-12-12 上午10:07:02
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-12     shitian             v1.0.0               修改原因<br>
	 */
	public String queryAcctFormatType(long acctId) throws Exception;

	/**   
	 * @Function queryBillFormatEnum
	 * @Description 
	 *
	 * @param custType
	 * @param billingType
	 * @param paymentMethod
	 * @param mailCode
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-12-12 下午5:28:00
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-12     shitian             v1.0.0               修改原因<br>
	 */
	public IBOBsStaticDataValue[] queryBillFormatEnum(int custType, int billingType, int paymentMethod, int mailCode, int isPrimary, long acctId) throws Exception;

	/**   
	 * @Function queryBankCard
	 * @Description 
	 *
	 * @param acctId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-12-18 下午7:57:08
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-18     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmPayChannelValue[] queryBankCard(long acctId, int start, int end) throws Exception;

	/**   
	 * @Function queryBankCardCount
	 * @Description 
	 *
	 * @param acctId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-12-18 下午8:17:55
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-18     shitian             v1.0.0               修改原因<br>
	 */
	public int queryBankCardCount(long acctId) throws Exception;

	/**   
	 * @Function getTransactionId
	 * @Description 
	 *
	 * @param url
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-12-28 下午1:58:26
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-28     shitian             v1.0.0               修改原因<br>
	 */
	public String getTransactionId(String url) throws Exception;

	/**   
	 * @Function queryNetsCard
	 * @Description 
	 *
	 * @param transactionId
	 * @return	{MaskedPAN=, Issuer=, ExpiryDate=, IssuerId=, PaymentMethod=, PanHash=, IssuerCountry=}
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-12-30 下午1:11:30
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-30     shitian             v1.0.0               修改原因<br>
	 */
	public Map queryNetsCard(String transactionId) throws Exception;

	/**   
	 * @Function queryBillFormatDtl
	 * @Description 
	 *
	 * @param acctId
	 * @param dtlNo
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-1-9 下午3:45:37
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-1-9     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmBillFormatDtlValue queryBillFormatDtl(long acctId, long dtlNo) throws Exception;

	/**   
	 * @Function queryBillformats
	 * @Description 
	 *
	 * @param acctId
	 * @param billingType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-1-9 下午3:54:51
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-1-9     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmBillFormatDtlValue[] queryBillformats(long acctId, int billingType, int start, int end) throws Exception;

	/**   
	 * @Function queryBillformatsCount
	 * @Description 
	 *
	 * @param acctId
	 * @param billingType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-1-9 下午3:57:05
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-1-9     shitian             v1.0.0               修改原因<br>
	 */
	public int queryBillformatsCount(long acctId, int billingType) throws Exception;

	/**   
	 * @Function saveBillFormatDtl
	 * @Description 保存账单模板详细信息
	 *
	 * @param billFormatDtlValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-1-13 下午2:51:40
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-1-13     shitian             v1.0.0               修改原因<br>
	 */
	public void saveBillFormatDtl(IBOCmBillFormatDtlValue billFormatDtlValue) throws Exception;

	/**   
	 * @Function queryBillAddress
	 * @Description 查询账单地址
	 *
	 * @param acctId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-1-13 下午4:38:27
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-1-13     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmAcctContactValue queryBillAddress(long acctId) throws Exception;

}
