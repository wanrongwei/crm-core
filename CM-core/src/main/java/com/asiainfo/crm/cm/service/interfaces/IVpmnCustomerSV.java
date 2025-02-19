/**
 * 
 */
package com.asiainfo.crm.cm.service.interfaces;

import java.rmi.RemoteException;

import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmVpmnCustomerValue;

/**   
 * Copyright: Copyright (c) 2010 Asiainfo-Linkage
 * 
 * @ClassName: IVpmnCustomerSV.java
 * @Description: 该类的功能描述
 *
 * @version: v1.0.0
 * @author: huzq2
 * @date: Dec 23, 2010 8:49:30 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * Dec 23, 2010		huzq2           v1.0.0               修改原因
 */

public interface IVpmnCustomerSV
{

	/**   
	 * @Function: IVpmnCustomerSV.java
	 * @Description: 获取VPMN客户编号
	 *
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Dec 30, 2010 12:36:23 AM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Dec 30, 2010     huzq2           v1.0.0               修改原因
	 */
	public long getNewId() throws Exception, RemoteException;

	/**   
	 * @Function: IVpmnCustomerSV.java
	 * @Description: 根据主键查询虚拟网客户信息。
	 *
	 * @param vpmnCustId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Dec 23, 2010 8:57:47 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Dec 23, 2010     huzq2           v1.0.0               修改原因
	 */
	public IBOCmVpmnCustomerValue queryVpmnCustomer(long vpmnCustId) throws Exception, RemoteException;

	/**   
	 * @Function: IVpmnCustomerSV.java
	 * @Description: 根据指定条件查询虚拟网客户信息。
	 *
	 * @param parameters
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Dec 23, 2010 8:58:10 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Dec 23, 2010     huzq2           v1.0.0               修改原因
	 */
	public IBOCmVpmnCustomerValue[] queryVpmnCustomers(DataContainerInterface dataContainer, int startIndex,
			int endIndex) throws Exception, RemoteException;

	/**   
	 * @Function: IVpmnCustomerSV.java
	 * @Description: 根据指定条件查询虚拟网客户信息。
	 *
	 * @param custId
	 * @param name
	 * @param regionId
	 * @param groupType
	 * @param countyCode
	 * @param groupAttr
	 * @param createBegin
	 * @param createEnd
	 * @param startIndex
	 * @param endIndex
	 * @return
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @throws Exception, RemoteException 
	 * @date: Jan 14, 2011 2:45:47 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 14, 2011     huzq2           v1.0.0               修改原因
	 */
	public IBOCmVpmnCustomerValue[] queryVpmnCustomers(String custId, String name, String regionId, String groupType,
			String countyCode, String groupAttr, String createBegin, String createEnd, int startIndex, int endIndex)
			throws Exception, RemoteException;

	/**   
	 * @Function: IVpmnCustomerSV.java
	 * @Description: 创建虚拟网客户
	 *
	 * @param vpmnCustomerValue
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Dec 23, 2010 8:57:01 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Dec 23, 2010     huzq2           v1.0.0               修改原因
	 */
	public void saveVpmnCustomer(IBOCmVpmnCustomerValue vpmnCustomerValue) throws Exception, RemoteException;

	/**   
	 * @Function: IVpmnCustomerSV.java
	 * @Description: 根据指定条件查询虚拟网客户数量。
	 *
	 * @param custId
	 * @param name
	 * @param regionId
	 * @param groupType
	 * @param countyCode
	 * @param groupAttr
	 * @param createBegin
	 * @param createEnd
	 * @return
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @throws Exception 
	 * @date: Jan 14, 2011 3:38:18 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 14, 2011     huzq2           v1.0.0               修改原因
	 */
	public int queryVpmnCustomerCount(String custId, String name, String regionId, String groupType, String countyCode,
			String groupAttr, String createBegin, String createEnd) throws Exception, RemoteException;

	/**   
	 * @Function: IVpmnCustomerSV.java
	 * @Description: 根据指定条件查询虚拟网客户数量。
	 *
	 * @param dataContainer
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jan 14, 2011 3:45:30 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 14, 2011     huzq2           v1.0.0               修改原因
	 */
	public int queryVpmnCustomer(DataContainerInterface dataContainer) throws Exception, RemoteException;

	/**   
	* @Function: ICmGroupCustomerDAO.java
	* @Description: 根据集团ID检索VPMN集团信息（分页）
	*
	* @param groupId
	* @param start
	* @param end
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 17, 2011 2:04:32 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 17, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmVpmnCustomerValue[] queryVpmnGroupInfosByGroupId(long groupId, int start, int end) throws Exception,
			RemoteException;

	/**   
	* @Function: ICmGroupCustomerDAO.java
	* @Description: 根据集团ID检索VPMN集团信息数量
	*
	* @param groupId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 17, 2011 2:07:46 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 17, 2011     fengjian           v1.0.0               修改原因
	*/
	public int queryVpmnGroupInfosCountByGroupId(long groupId) throws Exception, RemoteException;

	/**
	 * @Function: IVpmnCustomerSV.java
	 * @Description: 根据虚拟网集团编号查询虚拟网集团客户
	 * 
	 * @param groupId 虚拟网集团编号
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: lixiangling
	 * @date: May 11, 2011 3:13:30 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * May 11, 2011    lixiangling           v1.0.0               修改原因
	 */
	public IBOCmVpmnCustomerValue queryVpmnCustomerByGroupId(long groupId) throws Exception, RemoteException;

	/**  
	 *  根据 虚拟网名称查询 虚拟网客户
	 * @Function: queryVpmnCustomersByCustName
	 *
	 * @param custName
	 * @return 符合条件的虚拟网信息
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: 2011-7-28 下午3:52:39 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2011-7-28     huzq2           v1.0.0               修改原因
	 */
	public IBOCmVpmnCustomerValue[] queryVpmnCustomersByCustName(String custName) throws Exception, RemoteException;
}
