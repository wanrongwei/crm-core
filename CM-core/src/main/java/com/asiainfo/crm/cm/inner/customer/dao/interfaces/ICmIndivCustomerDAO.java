package com.asiainfo.crm.cm.inner.customer.dao.interfaces;

import java.rmi.RemoteException;
import java.util.Map;

import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivCustomerValue;

/**   
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: ICmIndivCustomerDAO.java
 * @Description: 个人客户DAO接口
 *
 * @version: v1.0.0
 * @author: niwei
 * @date: Feb 22, 2011 4:53:51 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * Feb 22, 2011		niwei           v1.0.0               修改原因
 */
public interface ICmIndivCustomerDAO
{

	/**   
	 * @Function: ICmIndivCustomerDAO.java
	 * @Description: 查询个人客户信息
	 *
	 * @param condition
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: niwei
	 * @date: Feb 22, 2011 4:54:00 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Feb 22, 2011     niwei           v1.0.0               修改原因
	 */
	public IBOCmIndivCustomerValue[] queryIndivCustomers(String condition, Map parameter) throws Exception;

	/**   
	 * @Function: ICmIndivCustomerDAO.java
	 * @Description: 查询个人客户信息（用于分页）
	 *
	 * @param condition
	 * @param parameter
	 * @param startIndex
	 * @param endIndex
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: niwei
	 * @date: Feb 22, 2011 4:54:12 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Feb 22, 2011     niwei           v1.0.0               修改原因
	 */
	public IBOCmIndivCustomerValue[] queryIndivCustomers(String condition, Map parameter, int startIndex, int endIndex)
			throws Exception;

	/**   
	 * @Function: ICmIndivCustomerDAO.java
	 * @Description: 查询个人客户数目
	 *
	 * @param condition
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: niwei
	 * @date: Feb 22, 2011 4:54:20 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Feb 22, 2011     niwei           v1.0.0               修改原因
	 */
	public int queryIndivCustomersCount(String condition, Map parameter) throws Exception;

	/**   
	 * @Function: ICmIndivCustomerDAO.java
	 * @Description: 根据个人客户id返回个人客户
	 *
	 * @param indivCustId 个人客户id
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: niwei
	 * @date: Feb 22, 2011 4:54:29 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Feb 22, 2011     niwei           v1.0.0               修改原因
	 */
	public IBOCmIndivCustomerValue queryIndivCustomerById(long indivCustId) throws Exception;

	/**   
	 * @Function: ICmIndivCustomerDAO.java
	 * @Description: 保存个人客户
	 *
	 * @param indivCustValue
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: niwei
	 * @date: Mar 1, 2011 4:13:48 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 1, 2011     niwei           v1.0.0               修改原因
	 */
	public void saveIndivCustomer(IBOCmIndivCustomerValue indivCustValue) throws Exception;

	/**   
	 * @Function: ICmIndivCustomerDAO.java
	 * @Description: 生成个人客户编号
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: niwei
	 * @date: Mar 1, 2011 4:11:33 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 1, 2011     niwei           v1.0.0               修改原因
	 */
	public long getNewId() throws Exception;
	/**   
	* @Function: queryBaseCustmerByCertInfo 
	* @Description: 根据个人客户编号获取个人客户信息(忽略State状态条件)
	*
	* @param indivCustId
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: lixiangling
	* @date: Jul 22, 2011 10:37:55 PM 
	*
	* Modification History:
	* Date               Author            Version            Description
	* -------------------------------------------------------------------
	* Jul 22, 2011        lixiangling            v1.0.0                 修改原因
	*/
	public IBOCmIndivCustomerValue  queryOnlyIndivCustById(long indivCustId) throws Exception;
}
