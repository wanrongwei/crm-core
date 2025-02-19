package com.asiainfo.crm.cm.teaminvoke.out.service.interfaces;

import java.util.Map;

import com.asiainfo.crm.cm.common.ivalues.IBOCmInsCmrelValue;
import com.asiainfo.crm.cm.common.ivalues.IQBOCmGroupPartyValue;
import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmAccountValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxIndivCustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.ICustManagerValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;

public interface ICmCustomerSV {
	
	public ICustomerValue queryCustomerByCustId(long custId) throws Exception;
	
	public void changeStateToOnline(long custId)throws Exception;
	
	public void changeStateToOffline(long custId)throws Exception;
	
	public void saveAccount(IBOCmAccountValue value)throws Exception;
	/**
	 *
	 * @param userId  针对action是2和8的userId不需要
	 * @param custId
	 * @param oldCustId 针对过户前的客户
	 * @param action(1.个人开户
                     2.集团签合同
                     3.过户
					 4.欠费停机
					 5.其他停机
					 6.开机
					 7.销户
					 8.集团合同到期)
	 * @throws Exception
	 */
	public void saveCmLifeCycle(long userId,long custId,long oldCustId,int action)throws Exception;
	
	public IBOCmCustContactMediumValue[] queryCustContactMediumByCustId(long custId)throws Exception;
	/**
	 * 
	 * @param custId  
	 * @param flag(当flag=true，删除CPR,当flag=false,删除客户信息)
	 * @throws Exception
	 */
	public void dealCreateCustomer(long custId,boolean flag)throws Exception;
	/**
	 * 
	 * @param custId  
	 * @throws Exception
	 */
	public IBOCmxIndivCustomerValue queryCmxIndivCustomerByCustId(long custId) throws Exception;
	/**
	 * 
	 * @param acct(IAccountValue)
	 * @throws Exception
	 */
	public void modifyAccountValue(IAccountValue acct)throws Exception;
	/**
	 * 
	 * @param custId,contType,billId,partyName  
	 * @throws Exception
	 */
	public IQBOCmGroupPartyValue[] queryGroupContact(long custId, int contType,
			String billId, String partyName) throws Exception ;
	/**
	 * 
	 * @Function saveCustCreditValue
	 * @Description 保存订单传过来的信用度信息
	 *
	 * @param 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-7-15 下午7:51:37
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-7-15     huangqun           v1.0.0               修改原因<br>
	 */
	public void saveCustCreditValue(long custId,int creditLevel,int creditValue)throws Exception;
	/**
	 * 
	 * @Function queryAnonymousCustInfo()
	 * @Description 得到一个全局的匿名客户
	 *
	 * @param 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-9-5 下午7:51:37
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-5     huangqun           v1.0.0               修改原因<br>
	 */
	public long queryAnonymousCustInfo()throws Exception;
	/**
	 * 
	 * @Function queryAnonymousCustInfo()
	 * @Description 得到一个全局的匿名客户
	 *
	 * @param 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-9-5 下午7:51:37
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-5     huangqun           v1.0.0               修改原因<br>
	 */
	public ICustomerValue queryTerminateCustomerInfo(long custId)throws Exception;
	
	/**   
	 * @Function queryCmInsCmrel
	 * @Description 
	 *
	 * @param custId
	 * @param startIndex	传-1查询全部
	 * @param endIndex		传-1查询全部
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-10-20 下午3:17:50
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-20     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmInsCmrelValue[] queryCmInsCmrel(long custId,int startIndex,int endIndex)throws Exception;
	/**
	 * 
	 * @Function getIndivCustomer()
	 * @Description 得到一个全局的匿名客户
	 *
	 * @param 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-11-20 下午7:51:37
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-20     huangqun           v1.0.0               修改原因<br>
	 */
	public long getIndivCustomer(String firstName,String lastName) throws Exception;
	
	/**   
	 * @Function queryCustManagersByCustId
	 * @Description 根据客户编号查询客户的客户经理信息
	 *
	 * @param custId
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-14 上午10:03:17
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-14     huzq2           v1.0.0               修改原因<br>
	 */
	public ICustManagerValue[] queryCustManagersByCustId(long custId, int startNum, int endNum) throws Exception;
	
	/**   
	 * @Function queryGroupCustomerContacts
	 * @Description 查询集团联系人
	 *
	 * @param custId
	 * @param contType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-8-27 下午2:19:02
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-8-27     shitian             v1.0.0               修改原因<br>
	 */
	public IContactValue[] queryGroupCustomerContacts(long custId, int contType) throws Exception;
	
	/**   
	 * @Function modifyAccountValueForOSE
	 * @Description 
	 * @date 2018-3-8
	 */
	public void modifyAccountValueForOSE(IAccountValue acct,String paymentAccountName,Map extMap) throws Exception;
}