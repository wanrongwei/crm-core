package com.asiainfo.crm.cm.service.interfaces;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.common.ivalues.IQBOCmGroupPartyValue;
import com.asiainfo.crm.cm.inner.contact.ivalues.IQBOCmGroupCustContactValue;
import com.asiainfo.crm.cm.inner.contact.ivalues.IQBOCmIndivCustContactValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupContactValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivContactValue;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmPartyContactValue;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmPartyValue;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.IVOAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;

/**   
 * @Copyright Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName ICmContactSV
 * @Description 该类定义了创建联系人、修改联系人、
 * 删除联系人和查询联系人等业务的服务，用于提供给JSP页面、Action、外部接口等调用。
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2011-12-16 下午2:32:14
 *
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2011-12-16     huzq2           v1.0.0               修改原因
 */
public interface ICmContactSV {

	/**   
	 * 根据条件查询账户联系人数量
	 * @Function queryAcctContactCount
	 * @Description 
	 *
	 * @param conditionDC
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-19 上午11:56:34
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-19     huzq2           v1.0.0               修改原因<br>
	 */
	public int queryAcctContactCount(DataContainer conditionDC) throws Exception;
	
	public IContactValue queryIndivContactByCustId(long custId) throws Exception;

	/**   
	 * 根据格式化的字符串查询条件查询账户联系人数量
	 * @Function queryAcctContactCount
	 * @Description 
	 *
	 * @param criteria
	 * @return 符合条件的账户联系人数量
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-19 下午12:21:54
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-19     huzq2           v1.0.0               修改原因<br>
	 */
	public int queryAcctContactCount(String criteria) throws Exception;

	/**
	 * 查询账户联系人数量
	 * @Copyright Copyright (c) 2011 Asiainfo-Linkage   
	 * @Function: queryAcctContactCountByAcctId
	 * @Description: 查询账户联系人数量
	 *
	 * @param acctId
	 * @return int
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaofei3
	 * @date: Dec 22, 2011 9:45:15 AM 
	 *
	 * Modification History:
	 * Date                  Author        Version        Description
	 * --------------------------------------------------------------
	 * Dec 22, 2011         zhaofei3       v1.0.0           修改原因
	 */
	public int queryAcctContactCountByAcctId(long acctId) throws Exception;

	/**   
	 * 根据查询条件查询账户联系人信息
	 * @Function queryAcctContacts
	 * @Description 
	 *
	 * @param conditionDC
	 * @param startNum
	 * @param endNum
	 * @return 符合条件的账户联系人信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-19 上午11:54:39
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-19     huzq2           v1.0.0               修改原因<br>
	 */
	public IContactValue[] queryAcctContacts(DataContainer conditionDC, int startNum, int endNum) throws Exception;

	/**   
	 * 根据格式化的字符串查询条件查询账户联系人信息
	 * @Function queryAcctContacts
	 * @Description 
	 *
	 * @param criteria 格式化的查询条件字符串。默认支持XML格式。
	 * @param startNum
	 * @param endNum
	 * @return 符合条件的账户联系人信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-19 下午12:22:41
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-19     huzq2           v1.0.0               修改原因<br>
	 */
	public IContactValue[] queryAcctContacts(String criteria, int startNum, int endNum) throws Exception;

	/**
	 * 账户联系人查询<br>
	 * <em>该方法实现了按照联系人的优先级进行排序.</em>
	 * @Copyright Copyright (c) 2011 Asiainfo-Linkage   
	 * @Function: queryAcctContactsByAcctId
	 * @Description: 账户联系人查询
	 *
	 * @param acctId
	 * @param startNum
	 * @param endNum
	 * @return IContactValue[]
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaofei3
	 * @date: Dec 22, 2011 9:45:35 AM 
	 *
	 * Modification History:
	 * Date                  Author        Version        Description
	 * --------------------------------------------------------------
	 * Dec 22, 2011         zhaofei3       v1.0.0           修改原因
	 * 2012-3-19			huzq		   v1.0.0 	 规范命名queryAcctContactByAcctId -> queryAcctContactsByAcctId
	 */
	public IContactValue[] queryAcctContactsByAcctId(long acctId, int startNum, int endNum) throws Exception;

	/**   
	 * 根据查询条件查询客户联系人信息
	 * @Function queryCustContactCount
	 * @Description 
	 *
	 * @param conditionDC
	 * @return 符合条件的客户联系人信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-19 上午11:24:59
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-19     huzq2           v1.0.0               修改原因<br>
	 */
	public int queryCustContactCount(DataContainer conditionDC) throws Exception;

	/**   
	 * 根据格式化的查询条件字符串查询客户联系人数量
	 * @Function queryCustContactCount
	 * @Description 
	 *
	 * @param criteria 格式化的查询条件。默认支持XML格式。
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-19 下午12:23:43
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-19     huzq2           v1.0.0               修改原因<br>
	 */
	public int queryCustContactCount(String criteria) throws Exception;

	/**   
	 * @Function queryContactCountByCustId
	 * @Description 根据客户编号查询客户联系人数量。
	 *
	 * @param custId 客户编号
	 * @return  符合条件的客户联系人数量
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-28 下午4:24:33
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-28     huzq2           v1.0.0               修改原因
	 */
	public int queryCustContactCountByCustId(long custId) throws Exception;
	
	/**   
	 * 根据客户编号查询联系人信息【提供通过state过滤】
	 * @Function queryCustContactCountByCustId
	 * @Description 
	 *
	 * @param custId
	 * @param state
	 * @return 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-28 上午11:09:02
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-28     huzq2           v1.0.0               修改原因<br>
	 */
	public int queryCustContactCountByCustId(long custId, String state) throws Exception;

	/**   
	 * 根据查询条件查询客户联系人
	 * @Function queryContacts
	 * @Description 
	 *
	 * @param conditionDC
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-19 上午11:24:13
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-19     huzq2           v1.0.0               修改原因<br>
	 */
	public IContactValue[] queryCustContacts(DataContainer conditionDC, int startNum, int endNum) throws Exception;

	/**   
	 * 根据格式化的字符串查询条件查询客户联系人信息
	 * @Function queryCustContacts
	 * @Description 
	 *
	 * @param criteria 格式化的字符串查询条件。默认支持XML格式。
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-19 下午12:24:29
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-19     huzq2           v1.0.0               修改原因<br>
	 */
	public IContactValue[] queryCustContacts(String criteria, int startNum, int endNum) throws Exception;
	/**   
	 * 根据联系人编号查询集团联系人信息
	 * @Function queryCustContacts
	 * @Description 
	 *
	 * @param custContId  联系人编号
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-9-15 下午12:24:29
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-9-15     kangzk           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupContactValue queryCustConBycustContId(long custContId)throws Exception;
	
	/**
	 * 根据PartyId，查询所有关联的b2b客户
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2020-5-8
	* ICmContactSV
	*/
	public int queryCustConCountByPartyId(long partyId)throws Exception;
	
	public IBOCmGroupContactValue[] queryCustConByPartyIdForPage(long partyId, int start, int end) throws Exception ;

	/**   根据客户编号查询客户联系人信息列表。<br>
	 * <em>该方法实现了按照联系人的优先级进行排序.</em>
	 * @Function queryContactsByCustId
	 * @Description 根据客户编号查询客户联系人信息列表。
	 *
	 * @param custId 客户编号
	 * @param startNum
	 * @param endNum
	 * @return 符合条件的客户联系人信息列表
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-28 下午3:54:40
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-28     huzq2           v1.0.0               修改原因
	 */
	public IContactValue[] queryCustContactsByCustId(long custId, int startNum, int endNum) throws Exception;
	
	/**   
	 * 根据客户编号查询客户联系人信息列表。【提供通过state过滤】<br>
	 * <em>该方法实现了按照联系人的优先级进行排序.</em>
	 * @Function queryCustContactsByCustId
	 * @Description 
	 *
	 * @param custId
	 * @param state
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-5-28 上午11:12:50
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-28     huzq2           v1.0.0               修改原因<br>
	 */
	public IContactValue[] queryCustContactsByCustId(long custId, String state, int startNum, int endNum) throws Exception;

	/**   
	 *  保存账户联系人信息
	 * @Function saveAcctContact
	 * @Description 
	 *
	 * @param contactValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-19 上午11:22:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-19     huzq2           v1.0.0               修改原因<br>
	 */
	public void saveAcctContact(IContactValue contactValue) throws Exception;

	/**   
	 * 保存账户联系人信息<br>
	 * 
	 * @Function saveAcctContact
	 * @Description 
	 *
	 * @param accountValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-19 上午11:21:45
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-19     huzq2           v1.0.0               修改原因<br>
	 */
	public void saveAcctContact(IVOAccountValue accountValue) throws Exception;

	/**   
	 * 保存客户联系人信息<br>
	 * 该服务可以保存包含个人客户联系人、家庭客户联系人、集团客户联系人等客户的联系人信息。
	 * @Function saveCustContact
	 * @Description 
	 *
	 * @param contactValue 联系人信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-19 上午11:20:34
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-19     huzq2           v1.0.0               修改原因<br>
	 */
	public void saveCustContact(IContactValue contactValue) throws Exception;

	/**   
	 * 保存客户联系人信息<br>
	 * 该服务可以保存包含个人客户联系人、家庭客户联系人、集团客户联系人等客户的联系人信息。
	 * @Function saveCustContact
	 * @Description 
	 *
	 * @param custValue 客户大对象
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-19 上午11:19:41
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-19     huzq2           v1.0.0               修改原因<br>
	 */
	public void saveCustContact(IVOCustValue custValue) throws Exception;

	/**   
	 * 根据客户联系人编号和客户编号查询客户联系人信息
	 * @Function queryCustContactById
	 * @Description 
	 *
	 * @param custContId 客户联系人编号【必要】
	 * @param custId 客户编号【用于区分客户类型，必要】
	 * @return 符合条件的客户联系人信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-19 下午12:28:56
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-19     huzq2           v1.0.0               修改原因<br>
	 */
	public IContactValue queryCustContactById(long custContId, long custId) throws Exception;

	/**   
	 * 根据账户联系人编号和账户编号查询账户联系人明细信息
	 * @Function queryAcctContactById
	 * @Description 
	 *
	 * @param acctContId 账户联系人编号【必要】
	 * @param acctId 账户编号【必要，用于区分账户分表相关信息】
	 * @return 符合条件的账户联系人信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-19 下午12:30:31
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-19     huzq2           v1.0.0               修改原因<br>
	 */
	public IContactValue queryAcctContactById(long acctContId, long acctId) throws Exception;
	
	/**   
	 * @Function queryContactByContId
	 * @Description 根据联系人编号查询联系人信息
	 *
	 * @param contId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 11, 2012 2:24:28 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 11, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IContactValue queryContactByContId(long contId)throws Exception;
	
	
	/**   
	 * @Function queryContactCountByCustId
	 * @Description 根据客户编号查询客户联系人数量 和 关键人信息。
	 *
	 * @param custId 客户编号
	 * @param state  联系人状态 
	 * @param type   联系人联系  
	 * @return  符合条件的客户联系人数量
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-28 下午4:24:33
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-28     huzq2           v1.0.0               修改原因
	 */
	public int queryCustContactCountByCustId(long custId, String state,String type) throws Exception;
	
	/**   
	 * @Function queryContactCountByCustId
	 * @Description 根据客户编号查询客户联系人数量 和 关键人信息。
	 *
	 * @param custId 客户编号
	 * @param state  联系人状态 
	 * @param type   联系人联系  
	 * @return  符合条件的客户联系人数量
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-28 下午4:24:33
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-28     huzq2           v1.0.0               修改原因
	 */
	public IQBOCmGroupCustContactValue[] queryCustContactReport(String criteria, int startNum, int endNum) throws Exception;
	
	/**   
	 * @Function queryContactCountByCustId
	 * @Description 根据客户编号查询客户联系人数量 和 关键人信息。
	 *
	 * @param custId 客户编号
	 * @param state  联系人状态 
	 * @param type   联系人联系  
	 * @return  符合条件的客户联系人数量
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-28 下午4:24:33
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-28     huzq2           v1.0.0               修改原因
	 */
	public int queryCustContactReportCount(String criteria) throws Exception;
	
	/**   
	 * @Function queryAcctContactById
	 * @Description 
	 *
	 * @param partyId
	 * @param acctContId
	 * @param acctId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-6 下午3:53:54
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-6     shitian           v1.0.0               修改原因<br>
	 */
	public IContactValue queryAcctContactById(long partyId,long acctContId, long acctId) throws Exception;
	/**   
	 * @Function queryGroupPartyInfo
	 * @Description 
	 *
	 * @param partyId
	 * @param acctContId
	 * @param acctId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-6 下午3:53:54
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-6-9     huangqun           v1.0.0               修改原因<br>
	 */
	public IQBOCmGroupPartyValue[] queryGroupPartyInfo(String criteria, int startNum, int endNum)throws Exception;
	/**   
	 * @Function queryGroupPartyInfoCount
	 * @Description 
	 *
	 * @param partyId
	 * @param acctContId
	 * @param acctId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-6 下午3:53:54
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-6-9     huangqun           v1.0.0               修改原因<br>
	 */
	public int queryGroupPartyInfoCount(String criteria)throws Exception;
	/**   
	 * @Function queryGroupPartyInfoCount
	 * @Description 
	 *
	 * @param partyId
	 * @param acctContId
	 * @param acctId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-6-9 下午3:53:54
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-6-9     huangqun           v1.0.0               修改原因<br>
	 */
	public IBOCmIndivContactValue queryIndivContactByCustContId(long custContId)throws Exception;
	/**   
	 * @Function queryGroupContact
	 * @Description 
	 *
	 * @param custId
	 * @param contType
	 * @param billId
	 * @param partyName
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-7-29 下午3:53:54
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-7-29     huangqun           v1.0.0               修改原因<br>
	 */
	public IQBOCmGroupPartyValue[] queryGroupContact(long custId,int contType,String billId,String partyName)throws Exception;
	
	/**
	 * 
	 * @Function queryIndivContactsByCustId
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-10-15 上午10:33:44
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-15     mael           v1.0.0               修改原因<br>
	 */
	public IBOCmIndivContactValue[] queryIndivContactsByCustId(long custId) throws Exception;
	
	/**
	 * 
	 * @Function queryPartyContactByContId
	 * @Description 
	 *
	 * @param contId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-10-15 上午11:01:10
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-15     mael           v1.0.0               修改原因<br>
	 */
	public IBOCmPartyContactValue queryPartyContactByContId(long contId) throws Exception;
	
	/**
	 * 
	 * @Function queryCmPartyByPartyId
	 * @Description 
	 *
	 * @param partyId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-10-15 上午11:01:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-15     mael           v1.0.0               修改原因<br>
	 */
	public IBOCmPartyValue queryCmPartyByPartyId(long partyId) throws Exception;
	
	/**   
	 * @Function queryGroupContact
	 * @Description 
	 *
	 * @param custId
	 * @param contType
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
	public IQBOCmGroupPartyValue[] queryGroupContact(long custId,int contType, int startNum, int endNum) throws Exception;
	
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
	public int queryGroupContactCount(long custId,int contType) throws Exception;
	
	/**   
	 * @Function queryIndivContactByIdAndType
	 * @Description 
	 *
	 * @param contId
	 * @param contType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-12-28 下午3:43:56
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-12-28     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmIndivContactValue[] queryIndivContactByIdAndType(long contId, int contType) throws Exception;
	
	/**
	 * 失效客户监护人关系
	 * @param custId
	 * @throws Exception
	 */
	public void expireCustomerAndContactRela(long custId) throws Exception;
	
	public IBOCmGroupContactValue[] queryCmGroupContactByPartyId(long partyId) throws Exception;
	
	public IBOCmIndivContactValue[] queryCmIndivContactByPartyId(long partyId) throws Exception;
}
