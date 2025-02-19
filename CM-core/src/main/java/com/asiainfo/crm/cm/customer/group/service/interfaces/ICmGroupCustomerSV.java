package com.asiainfo.crm.cm.customer.group.service.interfaces;

import java.rmi.RemoteException;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupContactBindingValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustMgrRelValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustomerValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupExtraInfoValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupInformInfoValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmGroupCustAndExtraInfoValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmGroupCustManagerValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmSubGroupCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupManagerValue;

/**
 * Copyright: Copyright (c) 2010 Asiainfo-Linkage
 * 
 * @ClassName: ICmGrouCustomerSV.java
 * @Description: 该类主要实现对集团客户基本信息、集团客户扩展属性、集团客户附属信息、集团客户客户经理和集团客户信息化信息等的增删改查等操作。
 * 
 * @version: v1.0.0
 * @author: huzq2
 * @date: Dec 16, 2010 5:25:55 PM
 * 
 * Modification History: 
 * Date 		Author 		Version 	Description
 * ---------------------------------------------------------
 * Dec 16, 2010 huzq2 		v1.0.0 		创建
 */
public interface ICmGroupCustomerSV
{

	/**   
	 * @Function: ICmGroupCustomerSV.java
	 * @Description: 根据指定条件查询集团基本信息。
	 *
	 * @param dataContainer 
	 * @param startIndex
	 * @param endIndex
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Dec 24, 2010 2:12:01 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Dec 24, 2010     huzq2           v1.0.0               修改原因
	 */
	public IBOCmGroupCustomerValue[] queryGroupCustomers(DataContainerInterface dataContainer, int startIndex,
			int endIndex) throws Exception, RemoteException;

	/**   
	 * @Function: ICmGroupCustomerSV.java
	 * @Description: 根据客户名称或客户证件查询集团客户。
	 *
	 * @param custName
	 * @param custCertType
	 * @param custCertCode
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Dec 28, 2010 11:37:36 AM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Dec 28, 2010     huzq2           v1.0.0               修改原因
	 */
	public IBOCmGroupCustomerValue queryGroupCustomer(String custName, int custCertType, String custCertCode)
			throws Exception, RemoteException;

	/**   
	 * @Function: ICmGroupCustomerSV.java
	 * @Description: 根据集团编号查询集团信息。
	 *
	 * @param groupCustId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Dec 24, 2010 2:16:56 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Dec 24, 2010     huzq2           v1.0.0               修改原因
	 */
	public IBOCmGroupCustomerValue queryGroupCustomerById(long groupCustId) throws Exception, RemoteException;

	/**   
	 * @Function: ICmGroupCustomerSV.java
	 * @Description: 根据groupCustId查询集团信息
	 *
	 * @param groupCustId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Dec 28, 2010 3:44:56 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Dec 28, 2010     huzq2           v1.0.0               修改原因
	 */
	public IQBOCmGroupCustAndExtraInfoValue queryGroupCustAndExtraInfoById(long groupCustId) throws Exception,
			RemoteException;
	
	/**   
	* @Function: ICmGroupCustomerSV.java
	* @Description: 根据groupId查询集团信息
	*
	* @param groupId
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Jun 17, 2011 3:39:34 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Jun 17, 2011     fengjian           v1.0.0               修改原因
	*/
	public IQBOCmGroupCustAndExtraInfoValue queryGroupCustAndExtraInfoByGroupId(long groupId) throws Exception, RemoteException;
	
	/**   
	* @Function: ICmGroupCustomerSV.java
	* @Description: 根据ID检索集团基本扩展信息（提供给集团基础信息修改界面专用）
	*
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 13, 2011 11:33:45 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 13, 2011     fengjian           v1.0.0               修改原因
	*/
	public DataContainer queryGroupCustAndExtraInfoAndRelGroupInfoById(long groupCustId) throws Exception,RemoteException;
	
	/**   
	 * @Function: ICmGroupCustomerSV.java
	 * @Description: 根据证件类型和证件号码查询集团基本信息和附属信息。
	 *
	 * @param dataContainer 包含了查询条件的数据容器。
	 * @param startIndex 
	 * @param endIndex
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Dec 24, 2010 2:12:50 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Dec 24, 2010     huzq2           v1.0.0               修改原因
	 */
	public IQBOCmGroupCustAndExtraInfoValue[] queryGroupCustAndExtraInfo(DataContainerInterface dataContainer,
			int startIndex, int endIndex) throws Exception, RemoteException;

	/**   
	 * @Function: ICmGroupCustomerSV.java
	 * @Description: 根据证件号码和证件类型查询集团数
	 *
	 * @param custCertType
	 * @param custCertCode
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Dec 24, 2010 2:13:51 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Dec 24, 2010     huzq2           v1.0.0               修改原因
	 */
	public int queryGroupCustomerCount(DataContainerInterface dataContainer) throws Exception, RemoteException;

	/**   
	 * @Function: ICmGrouCustomerSV.java
	 * @Description: 保存集团客户基本信息。
	 *
	 * @param groupCustomerValue
	 * @param groupExtraInfoValue
	 * @param groupCustMgrRelValue
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Dec 16, 2010 5:54:59 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Dec 16, 2010     huzq2           v1.0.0               修改原因
	 */
	public long saveGroupCustomer(IBOCmGroupCustomerValue groupCustomerValue) throws Exception, RemoteException;

	/**   
	 * @Function: ICmGrouCustomerSV.java
	 * @Description: 保存集团基本信息和集团附属信息。
	 *
	 * @param groupCustAndExtraInfoValue
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Dec 23, 2010 11:00:15 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Dec 23, 2010     huzq2           v1.0.0               修改原因
	 */
	public long saveGroupCustAndExtraInfo(IQBOCmGroupCustAndExtraInfoValue groupCustAndExtraInfoValue)
			throws Exception, RemoteException;
	
	/**   
	 * @Function: ICmGrouCustomerSV.java
	 * @Description: 保存集团客户附属信息
	 *
	 * @param groupExtraInfoValue
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Dec 21, 2010 9:08:40 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Dec 21, 2010     huzq2           v1.0.0               修改原因
	 */
	public long saveGroupExtraInfo(IBOCmGroupExtraInfoValue groupExtraInfoValue) throws Exception, RemoteException;

	/**   
	 * @Function: ICmGrouCustomerSV.java
	 * @Description: 保存集团客户与客户经理关系
	 *
	 * @param groupCustMgrRelValue
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Dec 21, 2010 9:09:11 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Dec 21, 2010     huzq2           v1.0.0               修改原因
	 */
	public IBOCmGroupCustMgrRelValue saveGroupCustMgrRel(IBOCmGroupCustMgrRelValue groupCustMgrRelValue)
			throws Exception, RemoteException;

	/**   
	 * @Function: ICmGrouCustomerSV.java
	 * @Description: 查询集团信息化信息列表
	 *
	 * @param groupCustId 必填的条件
	 * @param informTypeId 如果为-1则表示查询该集团下的所有信息化信息
	 * @param startIndex 
	 * @param endIndex
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Dec 22, 2010 10:39:26 AM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Dec 22, 2010     huzq2           v1.0.0               修改原因
	 */
	public IBOCmGroupInformInfoValue[] queryGroupInformInfo(long groupCustId, int startIndex, int endIndex)
			throws Exception, RemoteException;

	/**   
	 * @Function: ICmGroupCustomerSV.java
	 * @Description: 查询集团信息化信息
	 *
	 * @param groupCustId
	 * @param informTypeId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Dec 25, 2010 10:05:58 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Dec 25, 2010     huzq2           v1.0.0               修改原因
	 */
	public IBOCmGroupInformInfoValue queryGroupInformInfo(long groupCustId, int informTypeId) throws Exception,
			RemoteException;

	/**   
	 * @Function: ICmGrouCustomerSV.java
	 * @Description: 查询集团信息化信息记录数。如果参数groupCustId不大于0时默认查询所有集团的信息化信息记录数。
	 *
	 * @param groupCustId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Dec 22, 2010 10:42:08 AM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Dec 22, 2010     huzq2           v1.0.0               修改原因
	 */
	public int queryGroupInformInfoCount(long groupCustId) throws Exception, RemoteException;

	/**   
	 * @Function: ICmGroupCustomerSV.java
	 * @Description: 创建集团客户和附属信息(需要同时创建基础客户)
	 *
	 * @param groupCustAndExtraInfoValue
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Dec 28, 2010 11:52:29 AM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Dec 28, 2010     huzq2           v1.0.0               修改原因
	 */
	public long createGroupCustAndExtraInfo(IQBOCmGroupCustAndExtraInfoValue groupCustAndExtraInfoValue)
			throws Exception, RemoteException;

	/**   
	 * @Function: ICmGroupCustomerSV.java
	 * @Description: 根据指定条件查询（封装成JSON对象的String）集团客户。
	 *
	 * @param jsonObject JSON对象
	 * @param startIndex
	 * @param endIndex
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jan 25, 2011 7:14:44 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 25, 2011     huzq2           v1.0.0               修改原因
	 */
	public IQBOCmGroupCustAndExtraInfoValue[] queryGroupCustAndExtraInfos(String jsonObject, int startIndex,int endIndex) throws Exception, RemoteException;
	
	/**   
	* @Function: ICmGroupCustomerSV.java
	* @Description:  根据指定条件查询（封装成JSON对象的String）集团客户和客户经理
	*
	* @param jsonObject
	* @param startIndex
	* @param endIndex
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Apr 26, 2011 6:05:05 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Apr 26, 2011     fengjian           v1.0.0               修改原因
	*/
	public DataContainer[] queryGroupCustAndExtraInfosAndManagerInfo(String jsonObject, int startIndex,int endIndex) throws Exception, RemoteException;

	/**   
	 * @Function: ICmGroupCustomerSV.java
	 * @Description: 根据指定条件查询（封装成JSON对象的String）集团客户数量。
	 *
	 * @param jsonObject
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jan 25, 2011 7:17:14 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 25, 2011     huzq2           v1.0.0               修改原因
	 */
	public int queryGroupCustAndExtraInfoCount(String jsonObject) throws Exception, RemoteException;
	
	
	/**   
	* @Function: ICmGroupCustomerSV.java
	* @Description: 根据vip卡号取得VIP卡信息
	*
	* @param vipCard
	* @param regionId
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Jul 6, 2011 9:36:46 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Jul 6, 2011     fengjian           v1.0.0               修改原因
	*/
	public IQBOCmGroupCustAndExtraInfoValue queryGroupCustAndExtraInfoByCardCode(String vipCard,String regionId) throws Exception, RemoteException;
	
	/**   
	 * @Function: ICmGroupCustomerSV.java
	 * @Description: 根据集团名查询集团个数
	 *
	 * @param jsonObject
	 * @return 集团个数
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: fengjian
	 * @date: Jan 25, 2011 7:17:14 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 25, 2011     fengjian           v1.0.0               修改原因
	 */
	public long queryGroupCustomerCount(String custName,long custId) throws Exception,RemoteException;
	
	/**   
	 * @Function: ICmGroupCustomerSV.java
	 * @Description: 根据集团名查询集团个数
	 *
	 * @param groupCustomerValue
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: fengjian
	 * @date: Jan 25, 2011 7:17:14 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 25, 2011     fengjian           v1.0.0               修改原因
	 */
	public void deleteGroupCustomer(IBOCmGroupCustomerValue groupCustomerValue) throws Exception,RemoteException;
	
	/**   
	 * @Function: ICmGroupCustomerSV.java
	 * @Description: 集团客户销户
	 *
	 * @param groupId
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: fengjian
	 * @date: Jan 25, 2011 7:17:14 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 25, 2011     fengjian           v1.0.0               修改原因
	 */
	public void logonGroupCustomer(long groupCustId) throws Exception,RemoteException;

	/**   
	* @Function: ICmGroupCustomerSV.java
	* @Description: 分别保存baseId是基础客户信息下的集团客户与集团扩展信息
	*
	* @param groupCustomerValue
	* @param groupExtraInfoValue
	* @param baseId
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Feb 23, 2011 12:08:13 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Feb 23, 2011     fengjian           v1.0.0               修改原因
	*/
	public long saveGroupCustAndExtraInfo(IBOCmGroupCustomerValue  groupCustomerValue, IBOCmGroupExtraInfoValue groupExtraInfoValue, long baseId) throws Exception, RemoteException;
	
	
	/**   
	* @Function: ICmGroupCustomerSV.java
	* @Description: 新增集团客户
	*
	* @param groupCustomer
	* @param groupExtraInfo
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Feb 23, 2011 3:56:16 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Feb 23, 2011     fengjian           v1.0.0               修改原因
	*/
	public long createGroupCustomerAndExtraInfo(IQBOCmGroupCustAndExtraInfoValue bean) throws Exception, RemoteException;

	/**   
	* @Function: ICmGroupCustomerSV.java
	* @Description: 批量保存集团客户和集团客户扩展信息
	*
	* @param groupCustAndExtraInfos
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 2, 2011 4:57:59 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 2, 2011     fengjian           v1.0.0               修改原因
	*/
	public void saveGroupCustAndExtraInfos(IQBOCmGroupCustAndExtraInfoValue[] groupCustAndExtraInfos) throws Exception, RemoteException;
	
	/**   
	* @Function: ICmGroupCustomerSV.java
	* @Description: 传入地市ID生成GROUP_ID
	*
	* @param cityId
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Jun 17, 2011 3:32:37 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Jun 17, 2011     fengjian           v1.0.0               修改原因
	*/
	public long getGroupId(String cityId) throws Exception, RemoteException;
	
	/**   
	* @Function: ICmGroupCustomerSV.java
	* @Description: 根据ECCODE查询出集团客户和集团客户扩展信息
	*
	* @param ecCode
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 3, 2011 8:53:08 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 3, 2011     fengjian           v1.0.0               修改原因
	*/
	public IQBOCmGroupCustAndExtraInfoValue queryGroupCustAndExtraInfoByEcCode(String ecCode) throws Exception, RemoteException;

	/**   
	* @Function: ICmGroupCustomerSV.java
	* @Description: 分页查询
	*
	* @param condition
	* @param map
	* @param startIndex
	* @param endIndex
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 4, 2011 4:42:31 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 4, 2011     fengjian           v1.0.0               修改原因
	*/
	public IQBOCmGroupCustAndExtraInfoValue[] queryGroupCustomerAndExtraInfo(String condition, Map map, int startIndex, int endIndex) throws Exception, RemoteException;

	/**   
	* @Function: ICmGroupCustomerSV.java
	* @Description: 分页查询数量
	*
	* @param condition
	* @param map
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: admin
	* @date: Mar 4, 2011 5:12:17 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 4, 2011     admin           v1.0.0               修改原因
	*/
	public int queryGroupCustomerAndExtraInfoCount(String condition, Map map) throws Exception, RemoteException;

	/**   
	* @Function: ICmGroupCustomerSV.java
	* @Description: 批量保存用户扩展信息
	*
	* @param groupExtraInfoValues
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 9, 2011 11:20:04 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 9, 2011     fengjian           v1.0.0               修改原因
	*/
	public void saveGroupExtraInfos(IBOCmGroupExtraInfoValue[] groupExtraInfoValues) throws Exception, RemoteException;

	/**   
	* @Function: ICmGroupCustomerSV.java
	* @Description: 保存集团客户信息和集团扩展信息和客户经理信息
	*
	* @param groupCustomer
	* @param groupCustMgrRel
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 9, 2011 5:00:20 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 9, 2011     fengjian           v1.0.0               修改原因
	*/
	public long createGroupCustomerAndExtraInfoAndMgr(IQBOCmGroupCustAndExtraInfoValue groupCustomer, IBOCmGroupCustMgrRelValue groupCustMgrRel) throws Exception, RemoteException;
	
	/**   
	* @Function: ICmGroupCustomerDAO.java
	* @Description: 根据集团ID检索集团下所有客户经理信息
	*
	* @param groupCustId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: admin
	* @date: Mar 9, 2011 8:50:34 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 9, 2011     admin           v1.0.0               修改原因
	*/
	public IQBOCmGroupCustManagerValue[] queryGroupCustManagersByGroupId(long groupCustId) throws Exception, RemoteException;

	/**   
	* @Function: ICmGroupCustomerDAO.java
	* @Description: 根据集团ID查询所有下层集团信息
	*
	* @param groupId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 9, 2011 8:51:53 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 9, 2011     fengjian           v1.0.0               修改原因
	*/
	public IQBOCmSubGroupCustomerValue[] querySubGroupCustomersByGroupId(long groupId) throws Exception,RemoteException;

	/**   
	* @Function: ICmGroupCustomerSV.java
	* @Description: 修改集团客户信息以及扩展信息，加验证
	*
	* @param groupCustAndExtraInfoValue
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 14, 2011 8:01:19 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 14, 2011     fengjian           v1.0.0               修改原因
	*/
	public void modifyGroupCustAndExtraInfo(IQBOCmGroupCustAndExtraInfoValue groupCustAndExtraInfoValue) throws Exception, RemoteException;
	/**
	 * @Function: queryGroupCustomerAndMgrList
	 * @Description:根据集团名称验证获取集团信息列表（其中包括客户经理）
	 * 
	 * @param custName 集团名称
	 * @throws Exception
	 * @throws RemoteException
	 * 
	 * @return IBOCmGroupCustomerValue[]
	 * 
	 * @version: v1.0.0
	 * @author lixiangling
	 * @date: Apr 20, 2011 03:08:12 PM
	 * 
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Apr 20, 2011     lixiangling           v1.0.0               修改原因 
	 */
	public IBOCmGroupCustomerValue[] queryGroupCustomerAndMgrList(String custName) throws Exception,RemoteException;
	
	/**   
	* @Function: ICmGroupCustomerSV.java
	* @Description: 根据集团ID（GROUP_ID）检索集团信息
	*
	* @param groupId
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 11, 2011 2:06:44 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 11, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmGroupCustomerValue  queryGroupCustomerByGroupId(long groupId )throws Exception,RemoteException;
	
	/**   
	* @Function: ICmGroupCustomerSV.java
	* @Description: 查询所有状态集团客户
	*
	* @param groupCustId
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Jul 22, 2011 10:49:06 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Jul 22, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmGroupCustomerValue queryAllStateGroupCustomerByGroupCustId(long groupCustId) throws Exception, RemoteException;
	
	/**   
	* @Function: ICmGroupCustomerSV.java
	* @Description: 查询所有状态集团客户扩展信息
	*
	* @param groupCustId
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Jul 22, 2011 10:49:03 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Jul 22, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmGroupExtraInfoValue queryAllStateGroupExtraInfoByGroupCustId(long groupCustId) throws Exception, RemoteException;
	
	/**   
	* @Function: ICmGroupCustomerSV.java
	* @Description: 根据条件查询集团客户（提供给统一视图使用）
	*
	* @param custId
	* @param custName
	* @param custType
	* @param custLevel
	* @param custStatus
	* @param custCertType
	* @param custCertCode
	* @param isLike
	* @param startNum
	* @param endNum
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 28, 2011 3:01:45 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 28, 2011     fengjian           v1.0.0               修改原因
	*/
	public DataContainer[] queryGroupCustomersByCondition(long custId, String custName, int custType, int custLevel,int custStatus, int custCertType, String custCertCode, int isLike, int startNum, int endNum)  throws Exception, RemoteException;
	
	
	/**   
	* @Function: ICmGroupCustomerSV.java
	* @Description: 根据条件查询集团客户数量（提供给统一视图使用）
	*
	* @param custId
	* @param custName
	* @param custType
	* @param custLevel
	* @param custStatus
	* @param custCertType
	* @param custCertCode
	* @param isLike
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 28, 2011 3:01:28 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 28, 2011     fengjian           v1.0.0               修改原因
	*/
	public int queryGroupCustomersCountByCondition(long custId, String custName, int custType, int custLevel,int custStatus, int custCertType, String custCertCode, int isLike)  throws Exception, RemoteException;
	
	/**   
	* @Function: ICmGroupCustomerSV.java
	* @Description: 删除集团区域关联
	*
	* @param groupCustId
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Jun 20, 2011 8:32:20 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Jun 20, 2011     fengjian           v1.0.0               修改原因
	*/
	public void deleteRegionGroupRel(long groupCustId) throws Exception,RemoteException;
	
	
	/**   
	* @Function: ICmGroupCustomerSV.java
	* @Description: 批量更新集团区域类型
	*
	* @param fetchSize
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Jun 28, 2011 2:09:05 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Jun 28, 2011     fengjian           v1.0.0               修改原因
	*/
	public String changeRegionSpecia(int fetchSize)  throws Exception,RemoteException;
	
	/**   
	* @Function: ICmGroupCustomerSV.java
	* @Description: 根据集团ID和集团成员号码查询集团下所有套餐
	*
	* @param custId
	* @param billId
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Jul 12, 2011 10:13:44 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Jul 12, 2011     fengjian           v1.0.0               修改原因
	*/
	public DataContainer[] queryGroupOrderByCdn(long custId,long billId) throws Exception, RemoteException;
	/**   
	* @Function: ICmGroupCustomerSV.java
	* @Description: 根据集团ID数组查询集团信息
	*
	* @param groupCustIds
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: lixiangling
	* @date:Aug 17, 2011 1:40:44 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Aug 17, 2011    lixiangling           v1.0.0               修改原因
	*/
	public IBOCmGroupCustomerValue[] queryGroupCustomerByCustIds(long[] groupCustIds) throws  Exception, RemoteException;
	/**   
	* @Function: ICmGroupCustomerSV.java
	* @Description: 获取集团所在库的数据源名称
	*
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: lixiangling
	* @date:Aug 30, 2011 11:34:44 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Aug 30, 2011    lixiangling           v1.0.0               修改原因
	*/
	public  String getGroupConnectionName() throws  Exception, RemoteException;
	/**   
	* @Function: ICmGroupCustomerSV.java
	* @Description: 获取客户经理集合
	*
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: lixiangling
	* @date:Aug 30, 2011 11:34:44 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Aug 30, 2011    lixiangling           v1.0.0               修改原因
	*/
	//public IBOCmxManagerValue[] queryCmxMangers(long[] mgrIds) throws  Exception, RemoteException;
	/**   
	* @Function: ICmGroupCustomerSV.java
	* @Description: 获取所有处理的集团关键人物客户经理状态是删除且不存在大客户的长度
	*
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: lixiangling
	* @date:Sept 1, 2011 15:34:44 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Sept 1, 2011    lixiangling           v1.0.0               修改原因
	*/
	public int getGroupDelNotExistVipCount(String regionId)throws Exception, RemoteException;
	/**   
	* @Function: ICmGroupCustomerSV.java
	* @Description: 获取所有处理的大客户经理关系状态是删除且不存在集团关键人物的长度
	*
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: lixiangling
	* @date:Sept 1, 2011 18:34:44 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Sept 1, 2011    lixiangling           v1.0.0               修改原因
	*/
	public int getVipNotExistGroupCount(String regionId)throws Exception, RemoteException;
	/**   
	* @Function: ICmGroupCustomerSV.java
	* @Description: 根据sql获取集团客户经理关系信息
	*
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: lixiangling
	* @date:Sept 1, 2011 17:10:44 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Sept 1, 2011    lixiangling           v1.0.0               修改原因
	*/
	//public IBOCmxAllCustMgrRelValue[] queryUserBillIdBySql(String sql)throws Exception;
	
	
	/**   
	* @Function: ICmGroupCustomerSV.java
	* @Description: 获取跨网集团客户
	*
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: lixiangling
	* @date:Sept 1, 2011 18:34:44 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Sept 1, 2011    lixiangling           v1.0.0               修改原因
	*/
	public IBOCmGroupCustomerValue[] queryOutGrpCustomers(String criteria, int startNum, int endNum) throws Exception;
	
	
	/**   
	* @Function: ICmGroupCustomerSV.java
	* @Description: 获取跨网集团客户
	*
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: lixiangling
	* @date:Sept 1, 2011 18:34:44 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Sept 1, 2011    lixiangling           v1.0.0               修改原因
	*/
	public int queryOutGrpCustomersCount(String criteria) throws Exception;
	
	/**   
	* @Function: ICmGroupCustomerSV.java
	* @Description: 查询支持集团和事件的绑定、以及是否接受通知
	*
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: lism
	* @date:Nove 1, 2014 15:15:44 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Nove 1, 2014    lism           v1.0.0               修改原因
	*/
	public IBOCmGroupContactBindingValue[] queryGroupContactBindingInfo(long custId, long contId) throws Exception;
	
	/**   
	* @Function: ICmGroupCustomerSV.java
	* @Description: 保存支持集团和事件的绑定、以及是否接受通知
	*
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: lism
	* @date:Nove 1, 2014 15:15:44 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Nove 1, 2014    lism           v1.0.0               修改原因
	*/
	public void saveGroupContactBindingInfo(IBOCmGroupContactBindingValue groupContactBindingValue) throws Exception;

	/**
	 * 根据partyId查询B2B客户
	 * @param partyId
	 * @return
	 * @throws Exception
	 */
	public IBOCmGroupCustomerValue[] queryCmGroupCustByPartyId(String partyId) throws Exception;
}
