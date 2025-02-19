/**
 * 
 */
package com.asiainfo.crm.cm.customer.group.dao.interfaces;

import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.util.Map;

import com.ai.appframe2.common.DataContainerInterface;
//import com.asiainfo.crm.cm.customer.custmgr.ivalues.IBOCmxAllCustMgrRelValue;
//import com.asiainfo.crm.cm.customer.custmgr.ivalues.IBOCmxManagerValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustAttrValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustomerValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupRelIndustryValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmGroupCustManagerValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmSubGroupCustomerValue;

/**   
 * Copyright: Copyright (c) 2010 Asiainfo-Linkage
 * 
 * @ClassName: ICmGrouCustomerDAO.java
 * @Description: 该类实现对集团客户基础信息和扩展属性的操作功能。
 *
 * @version: v1.0.0
 * @author: huzq2
 * @date: Dec 21, 2010 9:13:30 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * Dec 21, 2010		huzq2           v1.0.0               修改原因
 */

public interface ICmGroupCustomerDAO {

	/**   
	 * @Function: ICmGrouCustomerDAO.java
	 * @Description: 根据属性编号查询集团客户扩展属性。
	 *
	 * @param attrId
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jan 12, 2011 2:34:33 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 12, 2011     huzq2           v1.0.0               修改原因
	 */
	public IBOCmGroupCustAttrValue queryGroupCustAttr(long attrId) throws Exception;

	/**   
	 * @Function: ICmGrouCustomerDAO.java
	 * @Description: 根据集团客户编号和扩展属性定义编号查询集团客户扩展属性信息
	 *
	 * @param groupCustId
	 * @param attrDefineId
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jan 12, 2011 2:33:30 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 12, 2011     huzq2           v1.0.0               修改原因
	 */
	public IBOCmGroupCustAttrValue[] queryGroupCustAttrs(long groupCustId, long attrDefineId) throws Exception;

	/**   
	 * @Function: ICmGrouCustomerDAO.java
	 * @Description: 该函数的功能描述
	 *
	 * @param groupCustId
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jan 10, 2011 11:26:11 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 10, 2011     huzq2           v1.0.0               修改原因
	 */
	public IBOCmGroupCustomerValue queryGroupCustomerById(long groupCustId) throws Exception;

	/**   
	 * @Function: ICmGrouCustomerDAO.java
	 * @Description: 根据指定条件查询集团客户数量
	 *
	 * @param dataContainer
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jan 10, 2011 11:24:31 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 10, 2011     huzq2           v1.0.0               修改原因
	 */
	public int queryGroupCustomerCount(DataContainerInterface dataContainer) throws Exception;

	/**   
	 * @Function: ICmGrouCustomerDAO.java
	 * @Description: 根据指定条件查询集团客户
	 *
	 * @param dataContainer
	 * @param startIndex
	 * @param endIndex
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jan 10, 2011 11:25:47 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 10, 2011     huzq2           v1.0.0               修改原因
	 */
	public IBOCmGroupCustomerValue[] queryGroupCustomers(DataContainerInterface dataContainer, int startIndex, int endIndex) throws Exception;

	/**   
	 * @Function: ICmGrouCustomerDAO.java
	 * @Description: 该函数的功能描述
	 *
	 * @param groupCustAttrValue
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jan 12, 2011 2:30:56 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 12, 2011     huzq2           v1.0.0               修改原因
	 */
	public void saveGrouCustAttr(IBOCmGroupCustAttrValue groupCustAttrValue) throws Exception;

	/**   
	 * @Function: ICmGrouCustomerDAO.java
	 * @Description: 该函数的功能描述
	 *
	 * @param groupCustAttrValues
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jan 12, 2011 2:31:00 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 12, 2011     huzq2           v1.0.0               修改原因
	 */
	public void saveGrouCustAttr(IBOCmGroupCustAttrValue[] groupCustAttrValues) throws Exception;

	/**   
	 * @Function: ICmGrouCustomerDAO.java
	 * @Description: 保存集团客户信息
	 *
	 * @param groupCustomerValue
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jan 10, 2011 11:29:54 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 10, 2011     huzq2           v1.0.0               修改原因
	 */
	public void saveGroupCustomer(IBOCmGroupCustomerValue groupCustomerValue) throws Exception;

	/**   
	 * @Function: ICmGrouCustomerDAO.java
	 * @Description: 批量保存集团客户信息
	 *
	 * @param groupCustomerValues
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jan 10, 2011 11:30:17 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 10, 2011     huzq2           v1.0.0               修改原因
	 */
	public void saveGroupCustomer(IBOCmGroupCustomerValue[] groupCustomerValues) throws Exception;
	
	/**   
	 * @Function: ICmGrouCustomerDAO.java
	 * @Description: 检索集团为custName的集团个数
	 *
	 * @param custName
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: fengjian
	 * @date: Fan 25, 2011 11:30:17 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Fan 25, 2011     fengjian           v1.0.0               修改原因
	 */
	public long queryGroupCustomerCount(String custName,long custId) throws Exception;
	
	/**   
	 * @Function: ICmGroupOrgStructDAO.java
	 * @Description: 
	 *
	 * @param groupCustomerValue
	 * @throws Exception, RemoteException
	 * @version: v1.0.0
	 * @author: fengjian
	 * @date: Fan 14, 2011 11:38:58 AM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 
	 */
	public void deleteGroupCustomer(IBOCmGroupCustomerValue groupCustomerValue) throws Exception;

	/**   
	* @Function: ICmGroupCustomerDAO.java
	* @Description: 取得集团客户和扩展信息的数量
	*
	* @param condition
	* @param map
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 4, 2011 5:09:40 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 4, 2011     fengjian           v1.0.0               修改原因
	*/
	public long queryGroupCustomerAndExtraInfoCount(String condition, Map map) throws Exception, RemoteException;

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
	public IQBOCmGroupCustManagerValue[] queryGroupCustManagersByGroupId(long groupCustId) throws Exception;

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
	public IQBOCmSubGroupCustomerValue[] querySubGroupCustomersByGroupId(long groupId) throws Exception;
	/**
	 * @Function: queryGroupCustomerByCustName
	 * @Description:根据集团名称模糊查询获取集团信息
	 * 
	 * @param custName 集团名称
	 * @throws Exception
	 * @throws RemoteException
	 * 
	 * @return IBOCmGroupCustomerValue[]
	 * 
	 * @version: v1.0.0
	 * @author lixiangling
	 * @date: Apr 20, 2011 03:12:12 PM
	 * 
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Apr 20, 2011     lixiangling           v1.0.0               修改原因 
	 */
	public IBOCmGroupCustomerValue[] queryGroupCustomerByCustName(String custName,int startNum,int endNum) throws Exception;
	
	/**   
	* @Function: ICmGroupCustomerDAO.java
	* @Description: 根据集团ID（GROUP_ID）检索集团信息
	*
	* @param groupId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 11, 2011 2:03:56 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 11, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmGroupCustomerValue  queryGroupCustomerByGroupId(long groupId )throws Exception;
	
	/**   
	* @Function: ICmGroupCustomerDAO.java
	* @Description: 取得（GROUP_ID）
	*
	* @param chnlCityId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Jun 9, 2011 9:42:50 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Jun 9, 2011     fengjian           v1.0.0               修改原因
	*/
	public long getGroupId(String chnlCityId) throws Exception;
	
	/**   
	* @Function: ICmGroupCustomerDAO.java
	* @Description: 取得系统当前的时间
	*
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Jun 27, 2011 9:19:47 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Jun 27, 2011     fengjian           v1.0.0               修改原因
	*/
	public Timestamp getSysDate() throws Exception;
	
	/**   
	* @Function: ICmGroupCustomerDAO.java
	* @Description: 查询所有状态的集团客户
	*
	* @param groupCustId
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Jul 22, 2011 10:45:48 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Jul 22, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmGroupCustomerValue queryAllStateGroupCustomerByGroupCustId(long groupCustId) throws Exception, RemoteException;
	/**   
	* @Function: ICmGroupCustomerSV.java
	* @Description: 查询集团信息
	*
	* @param condition
	* @param parmer
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
	* Aug 17, 2011     lixiangling           v1.0.0               修改原因
	*/
	public IBOCmGroupCustomerValue[] queryGroupCustomers(String condition, Map parmer) throws  Exception;
	/**   
	* @Function: ICmGroupCustomerSV.java
	* @Description: 获取集团所在库的数据源的用户名
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
	public String getGroupConnectionName() throws  Exception;
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
	//public IBOCmxManagerValue[] queryCmxMangers(long[] mgrIds) throws  Exception;
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
	//public int getGroupDelNotExistVipCount(String regionId)throws Exception;
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
	//public int getVipNotExistGroupCount(String regionId)throws Exception;
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

}
