package com.asiainfo.crm.cm.model.ivalues;

import com.asiainfo.crm.cm.common.ivalues.IBOIdentificationValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBoCmGroupAccountingValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;


/**
 * Created by IntelliJ IDEA.
 * User: huzhengquan
 * Date: 11-9-6
 * Time: 下午5:09
 */
public interface IVOCustValue extends IValueObject {

	/**   
	 * @Function addAccount
	 * @Description 添加账户信息大对象
	 *
	 * @param accountValue 账户信息大对象
	 * @return 账户编号
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-30 下午5:49:37
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-30     Xiaohu           v1.0.0               修改原因<br>
	 */
	long addAccount(IVOAccountValue accountValue) throws Exception;

	/**   
	 * @Function addContact
	 * @Description 添加一个联系人
	 *
	 * @param contactValue 联系人
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-30 下午5:43:23
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-30     Xiaohu           v1.0.0               修改原因<br>
	 */
	public void addContact(IContactValue contactValue);

	/**   
	 * @Function getAccounts
	 * @Description 获取账户下所有的账户
	 *
	 * @return 账户下所有的账户
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-30 下午5:50:17
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-30     Xiaohu           v1.0.0               修改原因<br>
	 */
	IVOAccountValue[] getAccounts() throws Exception;

	/**   
	 * @Function getContacts
	 * @Description 获取当前客户的所有联系人信息
	 *
	 * @return 当前客户的所有联系人信息
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-30 下午5:42:58
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-30     Xiaohu           v1.0.0               修改原因<br>
	 */
	public IContactValue[] getContacts() throws Exception;

	/**   
	 * @Function getCustId
	 * @Description 获取当前客户对象的客户编号
	 *
	 * @return 客户编号
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-31 下午3:03:18
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-31     Xiaohu           v1.0.0               修改原因<br>
	 */
	long getCustId();

	/**   
	 * @Function getCustomer
	 * @Description 获取客户的基本信息。
	 *
	 * @return 客户基本信息
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-30 下午5:29:19
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-30     Xiaohu           v1.0.0               修改原因<br>
	 */
	public ICustomerValue getCustomer();

	/**   
	 * @Function getCustType
	 * @Description 获取当前客户的客户类型
	 *
	 * @return 当前客户的客户类型
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-31 下午3:04:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-31     Xiaohu           v1.0.0               修改原因<br>
	 */
	int getCustType();

	/**   
	 * @Function getParty
	 * @Description 获取参与人对象。一个客户是某个参与人在业务活动中扮演的一个客户的角色，一个客户只是某个参与人的一个角色。
	 * 因此对于一个客户来说，他的参与人肯定只有一个，要么是个人类的，要么是组织类的。
	 *
	 * @return 参与人对象
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-30 下午5:26:33
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-30     Xiaohu           v1.0.0               修改原因<br>
	 */
	public IVOPartyValue getParty();

	/**   
	 * 是否含有账户信息
	 * @Function hasAccounts
	 * @Description 
	 *
	 * @return 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 下午3:33:24
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	public boolean hasAccounts() throws Exception;

	/**   
	 * 是否含有联系人信息
	 * @Function hasContact
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 下午3:29:17
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	public boolean hasContacts() throws Exception;

	/**   
	 * @Function removeAccount
	 * @Description 从客户对象中移除一个账户
	 *
	 * @param accountValue
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-9 下午9:45:46
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-9     huzq2           v1.0.0               修改原因<br>
	 */
	IVOAccountValue removeAccount(IVOAccountValue accountValue) throws Exception;

	/**   
	 * @Function removeContact
	 * @Description 从客户对象中移除一个联系人
	 *
	 * @param contactValue
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-9 下午9:43:41
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-9     huzq2           v1.0.0               修改原因<br>
	 */
	IContactValue removeContact(IContactValue contactValue) throws Exception;

	/**   
	 * @Function setCustomer
	 * @Description 设置当前客户的客户基本信息。
	 *
	 * @param customer 客户基本信息
	 * @return 当前的客户编号
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-30 下午5:29:50
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-30     Xiaohu           v1.0.0               修改原因<br>
	 */
	public long setCustomer(ICustomerValue customer);

	/**   
	 * @Function setParty
	 * @Description 设置当前客户的参与人信息
	 *
	 * @param party 参与人信息
	 * @return 参与人编号
	 * @version v1.0.0
	 * @author huzq2
	 * @throws Exception 
	 * @date 2011-12-30 下午5:28:28
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-30     Xiaohu           v1.0.0               修改原因<br>
	 */
	public long setParty(IVOPartyValue party) throws Exception;

	/**   
	 * 获取客户经理信息
	 * @Function getCustManagers
	 * @Description 
	 *
	 * @return 客户经理信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 下午3:36:40
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	public ICustManagerValue[] getCustManagers() throws Exception;

	/**   
	 * 添加一个客户经理信息
	 * @Function addCustManager
	 * @Description 
	 *
	 * @param custManagerValue
	 * @return 添加后的客户经理信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 下午3:37:04
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	public long addCustManager(ICustManagerValue custManagerValue) throws Exception;

	/**   
	 * 添加一个客户组织实体
	 * @Function addCustOrganize
	 * @Description 
	 *
	 * @param custOrganizeValue
	 * @return 新添加的组织实体编号
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-21 下午3:28:19
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-21     huzq2           v1.0.0               修改原因<br>
	 */
	public long addCustOrganize(ICustOrganizeValue custOrganizeValue) throws Exception;

	/**   
	 * 移除一个客户经理
	 * @Function removeCustManager
	 * @Description 
	 *
	 * @param managerValue
	 * @return 被移除的客户经理信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 下午3:37:50
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	public ICustManagerValue removeCustManager(ICustManagerValue managerValue) throws Exception;

	/**   
	 * 从
	 * @Function removeCustOrganize
	 * @Description 
	 *
	 * @param custOrganizeValue
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-21 下午3:29:04
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-21     huzq2           v1.0.0               修改原因<br>
	 */
	public ICustOrganizeValue removeCustOrganize(ICustOrganizeValue custOrganizeValue) throws Exception;

	/**   
	 * 获取大对象中的客户组织信息
	 * @Function getCustOrganizes
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-21 下午3:30:20
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-21     huzq2           v1.0.0               修改原因<br>
	 */
	ICustOrganizeValue[] getCustOrganizes() throws Exception;

	/**   
	 * 是否有客户
	 * @Function hasCustManagers
	 * @Description 
	 *
	 * @return true：有；false：无。
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 下午3:38:31
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	boolean hasCustManagers() throws Exception;

	/**   
	 * 
	 * 判断是否含有客户组织结构信息
	 * @Function hasCustOrganize
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-21 下午3:31:07
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-21     huzq2           v1.0.0               修改原因<br>
	 */
	boolean hasCustOrganize() throws Exception;

	/**
	 * 添加客户关系
	 * @return
	 * @throws Exception
	 * @return: long 新添加的客户关系编号
	 * @version: v1.0.0
	 * @author: LSC
	 * @date: 2012-4-1 上午10:37:45
	 */
	public long addCustRel(ICustRelationshipValue custRelValue) throws Exception;

	/**   
	 * 批量添加客户关系
	 * @Function addCustRels
	 * @Description 
	 *
	 * @param custRelValues
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-8 下午3:53:44
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-8     huzq2           v1.0.0               修改原因<br>
	 */
	public void addCustRels(ICustRelationshipValue[] custRelValues) throws Exception;

	/**
	 * 获取客户关系
	 * @return
	 * @throws Exception
	 * @return: ICustRelationshipValue[]
	 * @version: v1.0.0
	 * @author: LSC
	 * @date: 2012-4-1 上午10:42:14
	 */
	public ICustRelationshipValue[] getCustRels() throws Exception;

	/**
	 * 移除一个客户关系信息
	 * @return
	 * @throws Exception
	 * @return: ICustRelationshipValue
	 * @version: v1.0.0
	 * @author: LSC
	 * @date: 2012-4-1 上午10:43:47
	 */
	public ICustRelationshipValue removeCustRel(ICustRelationshipValue custRelvalue) throws Exception;

	/**
	 * 是否有客户关系
	 * @return
	 * @throws Exception
	 * @return: boolean
	 * @version: v1.0.0
	 * @author: LSC
	 * @date: 2012-4-1 上午10:47:25
	 */
	public boolean hasCustRel() throws Exception;
	
	
	/**   
	 * @Function addCustAddress
	 * @Description 增加客户地址
	 *
	 * @param addresses
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-8-21 上午11:21:07
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-8-21     Administrator           v1.0.0               修改原因<br>
	 */
	public void addCustAddress(IVOCustAddressValue[] addresses)throws Exception;

	
	/**   
	 * @Function hasCustAddress
	 * @Description 是否有地址
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-8-21 上午11:22:42
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-8-21     Administrator           v1.0.0               修改原因<br>
	 */
	public boolean hasCustAddress()throws Exception;
	
	/**   
	 * @Function getCustAddress
	 * @Description 获取客户地址
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-8-21 下午2:38:55
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-8-21     Administrator           v1.0.0               修改原因<br>
	 */
	public IVOCustAddressValue[] getCustAddress()throws Exception;
	
	/**   
	 * @Function hasCustAddress
	 * @Description 是否有联系媒介
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-8-21 上午11:22:42
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-8-21     Administrator           v1.0.0               修改原因<br>
	 */
	public boolean hasCustContMedium()throws Exception;
	
	/**   
	 * @Function getCustAddress
	 * @Description 获取客户联系媒介
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-8-21 下午2:38:55
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-8-21     Administrator           v1.0.0               修改原因<br>
	 */
	public IBOCmCustContactMediumValue[] getCustContMedium()throws Exception;
	
	/**   
	 * @Function getCustAddress
	 * @Description 设置客户联系媒介
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-8-21 下午2:38:55
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-8-21     Administrator           v1.0.0               修改原因<br>
	 */
	public void addCustContMedium(IBOCmCustContactMediumValue[] custContMediums)throws Exception;
	
	/**   
	 * @Function hasCustAccounting
	 * @Description 是否有会计信息
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-8-21 上午11:22:42
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-8-21     Administrator           v1.0.0               修改原因<br>
	 */
	public boolean hasCustAccounting()throws Exception;
	
	/**   
	 * @Function getCustAccounting
	 * @Description 获取会计信息
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-8-21 下午2:38:55
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-8-21     Administrator           v1.0.0               修改原因<br>
	 */
	public IBoCmGroupAccountingValue[] getCustAccounting()throws Exception;
	
	/**   
	 * @Function addCustAccounting
	 * @Description 设置会计信息
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-8-21 下午2:38:55
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-8-21     Administrator           v1.0.0               修改原因<br>
	 */
	public void addCustAccounting(IBoCmGroupAccountingValue custAcctValue)throws Exception;
	
	/**   
	 * @Function addCustIdentification
	 * @Description 
	 *
	 * @param identificationValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-17 下午4:14:46
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-17     shitian             v1.0.0               修改原因<br>
	 */
	public void addCustIdentification(IBOIdentificationValue[] identificationValues)throws Exception;
	
	/**   
	 * @Function getCustIdentification
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-17 下午4:14:53
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-17     shitian             v1.0.0               修改原因<br>
	 */
	public IBOIdentificationValue[] getCustIdentification()throws Exception;
	
	/**   
	 * @Function hasCustIdentification
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-17 下午4:14:56
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-17     shitian             v1.0.0               修改原因<br>
	 */
	public boolean hasCustIdentification()throws Exception;
}
