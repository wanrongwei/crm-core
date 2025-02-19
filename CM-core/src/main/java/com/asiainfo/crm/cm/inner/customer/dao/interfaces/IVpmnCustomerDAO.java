/**
 * 
 */
package com.asiainfo.crm.cm.inner.customer.dao.interfaces;

import java.util.Map;

import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmVpmnCustomerValue;

/**   
 * Copyright: Copyright (c) 2010 Asiainfo-Linkage
 * 
 * @ClassName: IVpmnCustomerDAO.java
 * @Description: 该类的功能描述
 *
 * @version: v1.0.0
 * @author: huzq2
 * @date: Dec 23, 2010 9:00:22 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * Dec 23, 2010		huzq2           v1.0.0               修改原因
 */

public interface IVpmnCustomerDAO
{

	/**   
	 * @Function: IVpmnCustomerDAO.java
	 * @Description: 保存VPMN客户
	 *
	 * @param vpmnCustomerValue
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Dec 29, 2010 11:39:34 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Dec 29, 2010     huzq2           v1.0.0               修改原因
	 */
	public void saveVpmnCustomer(IBOCmVpmnCustomerValue vpmnCustomerValue) throws Exception;

	/**   
	 * @Function: IVpmnCustomerDAO.java
	 * @Description: 根据指定查询参数查询VPMN客户数量
	 *
	 * @param dataContainer
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Dec 29, 2010 11:41:18 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Dec 29, 2010     huzq2           v1.0.0               修改原因
	 */
	public int queryVpmnCustomerCount(DataContainerInterface dataContainer) throws Exception;

	/**   
	 * @Function: IVpmnCustomerDAO.java
	 * @Description: 根据主键查询VPMN客户
	 *
	 * @param vpmnCustId
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Dec 29, 2010 11:41:48 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Dec 29, 2010     huzq2           v1.0.0               修改原因
	 */
	public IBOCmVpmnCustomerValue queryVpmnCustomer(long vpmnCustId) throws Exception;

	/**   
	 * @Function: IVpmnCustomerDAO.java
	 * @Description: 根据指定的查询参数查询VPMN客户
	 *
	 * @param dataContainer
	 * @param startIndex
	 * @param endIndex
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Dec 29, 2010 11:42:09 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Dec 29, 2010     huzq2           v1.0.0               修改原因
	 */
	public IBOCmVpmnCustomerValue[] queryVpmnCustomer(DataContainerInterface dataContainer, int startIndex, int endIndex)
			throws Exception;

	/**   
	 * @Function: IVpmnCustomerDAO.java
	 * @Description: 根据指定的查询参数查询VPMN客户
	 *
	 * @param dataContainer
	 * @param extCondition 除了直接等于操作的条件
	 * @param startIndex
	 * @param endIndex
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jan 14, 2011 2:27:39 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 14, 2011     huzq2           v1.0.0               修改原因
	 */
	public IBOCmVpmnCustomerValue[] queryVpmnCustomer(DataContainerInterface dataContainer, String extCondition,
			Map extParameter, int startIndex, int endIndex) throws Exception;

	/**   
	 * @Function: IVpmnCustomerDAO.java
	 * @Description: 根据指定的查询参数查询VPMN客户数量
	 *
	 * @param dataContainer
	 * @param string
	 * @param paraMap
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jan 14, 2011 3:40:41 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 14, 2011     huzq2           v1.0.0               修改原因
	 */
	public int queryVpmnCustomerCount(DataContainerInterface dataContainer, String string, Map paraMap)
			throws Exception;

	/**   
	* @Function: ICmGroupCustomerDAO.java
	* @Description: 根据集团ID检索VPMN集团信息（分页）
	*
	* @param vpmnGroupId
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
	public IBOCmVpmnCustomerValue[] queryVpmnGroupInfosByGroupId(long vpmnGroupId, int start, int end) throws Exception;

	/**   
	* @Function: ICmGroupCustomerDAO.java
	* @Description: 根据集团ID检索VPMN集团信息数量
	*
	* @param vpmnGroupId
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
	public int queryVpmnGroupInfosCountByGroupId(long vpmnGroupId) throws Exception;

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
	public IBOCmVpmnCustomerValue queryVpmnCustomerByGroupId(long groupId) throws Exception;

	/**  
	 *  根据查询条件查询VPMN客户信息
	 * @Function: queryVpmnCustomers
	 *
	 * @param condition
	 * @param parameter
	 * @param startNum
	 * @param endNum
	 * @return 符合条件的VPMN客户信息
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: 2011-7-28 下午3:43:42 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2011-7-28     huzq2           v1.0.0               修改原因
	 */
	public IBOCmVpmnCustomerValue[] queryVpmnCustomers(String condition, Map parameter, int startNum, int endNum)
			throws Exception;

	/**  
	 *  根据查询条件查询VPMN客户信息数量
	 * @Function: queryVpmnCustomerCount
	 *
	 * @param condition
	 * @param parameter
	 * @return 符合条件的VPMN客户信息数量
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: 2011-7-28 下午3:44:50 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 2011-7-28     huzq2           v1.0.0               修改原因
	 */
	public int queryVpmnCustomerCount(String condition, Map parameter) throws Exception;
}
