/**
 * 
 */
package com.asiainfo.crm.cm.model.ivalues;


/**   
 * @Copyright Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName IVOAccountValue
 * @Description 该类定义了账户相关的数据结构。
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2011-12-30 下午3:03:49
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2011-12-30     Xiaohu           v1.0.0               修改原因<br>
 */
public interface IVOAccountValue extends IValueObject {

	/**   
	 * @Function getAcctId
	 * @Description 获取账户编号
	 *
	 * @return 账户编号
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-30 下午4:59:17
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-30     Xiaohu           v1.0.0               修改原因<br>
	 */
	long getAcctId();

	/**   
	 * @Function getCustId
	 * @Description 获取账户的客户编号
	 *
	 * @return 账户的归属客户编号
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-7 下午3:31:02
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-7     huzq2           v1.0.0               修改原因<br>
	 */
	long getCustId();

	/**   
	 * @Function getAccount
	 * @Description 获取账户基本信息
	 *
	 * @return 账户基本信息
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-30 下午3:05:38
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-30     Xiaohu           v1.0.0               修改原因<br>
	 */
	IAccountValue getAccount();

	/**   
	 * @Function getContacts
	 * @Description 获取该账户下所有的账户联系人
	 *
	 * @return 该账户下所有的账户联系人
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-30 下午3:30:38
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-30     Xiaohu           v1.0.0               修改原因<br>
	 */
	IContactValue[] getContacts() throws Exception;

	/**   
	 * @Function getAcctPayments
	 * @Description 获取当前账户下所有的支付方案
	 *
	 * @return 当前账户下所有的支付方案
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-30 下午3:24:54
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-30     Xiaohu           v1.0.0               修改原因<br>
	 */
	IAcctPaymentValue[] getPayments() throws Exception;

	/**   
	 * @Function setAccount
	 * @Description 设置账户基本信息
	 *
	 * @param accountValue 账户基本信息对象
	 * @return 新添加的账户编号
	 * @version v1.0.0
	 * @author huzq2
	 * @throws Exception 
	 * @date 2011-12-30 下午3:06:05
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-30     Xiaohu           v1.0.0               修改原因<br>
	 */
	long setAccount(IAccountValue accountValue) throws Exception;

	/**   
	 * @Function setContact
	 * @Description 为当前账户添加一个账户联系人
	 *
	 * @param contactValue 账户联系人信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-30 下午3:29:25
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-30     Xiaohu           v1.0.0               修改原因<br>
	 */
	long addContact(IContactValue contactValue) throws Exception;

	/**   
	 * @Function setPayment
	 * @Description 添加一种支付方案
	 *
	 * @param paymentValue 支付方案对象
	 * @return 新添加的账户支付方案编号
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-30 下午3:23:49
	 * @deprecated 请使用{@link #addPayment(IAcctPaymentValue)}
	 * @exception Exception
	 * 
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-30     Xiaohu           v1.0.0               修改原因<br>
	 */
	long setPayment(IAcctPaymentValue paymentValue) throws Exception;
	
	/**   
	 * @Function addPayment
	 * @Description 添加一种支付方案
	 *
	 * @param paymentValue 支付方案对象
	 * @return 新添加的账户支付方案编号
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-30 下午3:23:49
	 * @exception Exception
	 * 
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-30     Xiaohu           v1.0.0               修改原因<br>
	 */
	long addPayment(IAcctPaymentValue paymentValue) throws Exception;
	
	/**   
	 * @Function getPeriods
	 * @Description 获取账户的出账账期信息
	 *
	 * @return 账户的出账账期信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-8 下午4:57:05
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-8     huzq2           v1.0.0               修改原因<br>
	 */
	IAcctBillCycleValue[] getBillCycles() throws Exception;
	
	/**   
	 * 是否含有账户账期信息
	 * @Function hasBillCycle
	 * @Description 
	 *
	 * @return 是否含有。true：有；false：无。
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 下午3:04:03
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	boolean hasBillCycle() throws Exception;
	
	/**   
	 * 判断是否有联系人信息
	 * @Function hasContacts
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-19 下午4:38:46
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-19     huzq2           v1.0.0               修改原因<br>
	 */
	boolean hasContacts() throws Exception;
	
	/**   
	 * 是否含有账户支付方案信息
	 * @Function hasPayments
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-21 下午1:44:12
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-21     huzq2           v1.0.0               修改原因<br>
	 */
	boolean hasPayments() throws Exception;

	/**   
	 * @Function setPeriod
	 * @Description 为当前账户设置一个出账账期
	 *
	 * @param acctPeriodValue
	 * @return 记录编号
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-8 下午4:58:24
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-8     huzq2           v1.0.0               修改原因<br>
	 */
	long setBillCycle(IAcctBillCycleValue acctPeriodValue) throws Exception;

	/**   
	 * 个性化账单
	 * @Function getBillCustomizes
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-21 下午1:20:07
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-21     huzq2           v1.0.0               修改原因<br>
	 */
	IAcctBillCustomizeValue[] getBillCustomizes() throws Exception;
	
	/**   
	 * 添加一个个性化账单定制信息
	 * @Function setBillCustomize
	 * @Description 
	 *
	 * @param billCustomizeValue
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-21 下午1:20:48
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-21     huzq2           v1.0.0               修改原因<br>
	 */
	long addBillCustomize(IAcctBillCustomizeValue billCustomizeValue) throws Exception;
	
	/**   
	 * 
	 * 是否有个性化账单定制信息
	 * @Function hasBillCustomizes
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-21 下午1:21:30
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-21     huzq2           v1.0.0               修改原因<br>
	 */
	boolean hasBillCustomizes() throws Exception;

	/**   
	 * 批量增加支付方案信息
	 * 
	 * @Function addPayments
	 * @Description 
	 *
	 * @param acctPaymentValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-7-23 下午7:17:21
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-23     huzq2           v1.0.0               修改原因<br>
	 */
	public void addPayments(IAcctPaymentValue[] acctPaymentValues) throws Exception;

	/**   
	 * @Function setBillCustomize
	 * @Description 
	 *
	 * @param billCustomizeValue
	 * @deprecated 请使用{@link #addBillCustomize(IAcctBillCustomizeValue)}
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-7-24 上午9:39:12
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-24     huzq2           v1.0.0               修改原因<br>
	 */
	public long setBillCustomize(IAcctBillCustomizeValue billCustomizeValue) throws Exception;
	
	/**
	 * 获取代付人的partyId
	 * @return
	 * @throws Exception
	 */
	public long getPayerId()throws Exception;
	/**
	 * 获取旧的代付人的partyId
	 * @return
	 * @throws Exception
	 */
	public long getOldPayerId()throws Exception;
	/**
	 * 设置代付人的partyId
	 * @param payerId
	 * @throws Exception
	 */
	public void setPayerId(long payerId)throws Exception;
	/**
	 * 设置旧的代付人的partyId
	 * @param payerId
	 * @throws Exception
	 */
	public void setOldPayerId(long payerId)throws Exception;
	/**
	 * 获取支付方式
	 * @return
	 * @throws Exception
	 */
	public int getPayMethod()throws Exception;
	/**
	 * 设置支付方式
	 * @return
	 * @throws Exception
	 */
	public void setPayMethod(int payMethod)throws Exception;
	
	/**
	 * 获取生效类型{0：当前账期生效(默认),1：下账期生效}
	 * @Function getEffectiveType
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2015-9-21 上午9:37:07
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-21     yangjh           v1.0.0               修改原因<br>
	 */
	public int getEffectiveType()throws Exception;
	/**
	 * 设置生效类型
	 * @Function setEffectiveType
	 * @Description 
	 *
	 * @param effectiveType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2015-9-21 上午9:38:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-21     yangjh           v1.0.0               修改原因<br>
	 */
	public int setEffectiveType(int effectiveType)throws Exception;
	/**
	 * 设置合同与账户关系
	 * @Function setAcctAgrRelValue
	 * @Description 
	 *
	 * @param effectiveType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2015-9-21 上午9:38:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-21     yangjh           v1.0.0               修改原因<br>
	 */
	public void addAcctAgrRelValue(IAcctAgreemnetRelValue acctAgrRelValue) throws Exception;
	/**
	 * 合同与账户关系
	 * @Function getAcctAgrRelValue
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2015-9-21 上午9:38:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-21     yangjh           v1.0.0               修改原因<br>
	 */
	public IAcctAgreemnetRelValue[] getAcctAgrRelValue() throws Exception;

	
}
