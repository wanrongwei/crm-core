package com.asiainfo.crm.cm.custview.dao.interfaces;

import java.util.Map;

import com.asiainfo.crm.cm.custview.ivalues.IQBOCmIndivContactValue;
import com.asiainfo.crm.cm.custview.ivalues.IQBOCmIndivCustomerHValue;
import com.asiainfo.crm.cm.custview.ivalues.IQBOIndivCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivManagerValue;
/**
 * 
* Copyright: Copyright (c) 2011 Asiainfo-Linkage
* 
* @ClassName: IIndivCustomerDAO.java
* @Description: 北京个人客户数据接口
*
* @version: v1.0.0
* @author: jiangxy
* @date: 2011-12-22 上午09:41:10 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2011-12-22     jiangxy           v1.0.0               修改原因
 */
public interface IIndivCustomerDAO {
	/**
	 * 
	* @Function: queryBjIndivCustomer
	* @Description: 查询北京客户
	*
	* @param cols
	* @param condition
	* @param parameter
	* @param startNum
	* @param endNum
	* @return
	* @throws Exception
	* @return： IQBOIndivCustomerValue[]
	*
	*
	* @version: v1.0.0
	* @author: jiangxy
	* @date: 2011-12-22 上午09:42:32 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2011-12-22     jiangxy           v1.0.0               修改原因
	 */
	public IQBOIndivCustomerValue[] queryIndivCustomer(String[] cols, String condition, Map parameter, int startNum, int endNum) throws Exception;
	/**
	 * 
	* @Function: queryBjIndivCustomerCount
	* @Description: 查询北京客户(总数)
	*
	* @param condition
	* @param parameter
	* @return
	* @throws Exception
	* @return： int
	*
	*
	* @version: v1.0.0
	* @author: jiangxy
	* @date: 2011-12-22 上午09:42:56 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2011-12-22     jiangxy           v1.0.0               修改原因
	 */
	public int queryIndivCustomerCount( String condition, Map parameter)throws Exception;
	
	/**
	 * 
	 * @Function queryIndivCustomerHByConditions
	 * @Description 查询个人客户历史记录数据
	 *
	 * @param startNum
	 * @param endNum
	 * @return
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Feb 8, 2012 2:50:50 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 8, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public IQBOCmIndivCustomerHValue[] queryIndivCustomerHByConditions(String[] cols, String condition, Map parameter, int startNum, int endNum) throws Exception;
	
	/**
	 * 
	 * @Function queryIndivCustomerHFormSql
	 * @Description 直接写SQL语句查询数据，平台不支持的原因
	 *
	 * @param sql
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Feb 15, 2012 11:19:04 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 15, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public IQBOCmIndivCustomerHValue[] queryIndivCustomerHFormSql(String sql, Map parameter) throws Exception;
	
	/**
	 * 
	 * @Function queryIndivCustomerHCountByConditions
	 * @Description 查询个人客户历史记录数量
	 * 
	 * @return
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Feb 8, 2012 2:51:33 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 8, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public int queryIndivCustomerHCountByConditions(String condition, Map parameter) throws Exception;

	/**   
	 * @Function queryIndivManagers
	 * @Description 根据客户编号查询客户经理
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Feb 10, 2012 11:07:06 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 10, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmIndivManagerValue[] queryIndivManagers(long custId) throws Exception;
	
	/**   
	 * @Function queryIndivContact
	 * @Description 根据条件查询个人客户联系人，支持分页
	 *
	 * @param cols
	 * @param condition
	 * @param parameter
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Feb 10, 2012 5:07:22 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 10, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IQBOCmIndivContactValue[] queryIndivContact(String[] cols, String condition, Map parameter, int startNum, int endNum) throws Exception;

	/**   
	 * @Function queryIndivContactCount
	 * @Description 根据条件查询个人联系人数量
	 *
	 * @param condition
	 * @param parameter
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Feb 10, 2012 5:08:00 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 10, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public int queryIndivContactCount(String condition, Map parameter) throws Exception;
	/**
	 * 
	* @Function: queryBjIndivCustomerByConditions
	* @Description: 通过客户服务编号查询北京个人客户
	*
	* @param custServiceId 客户服务编号

	* @return
	* @throws Exception
	* @return： IQBOIndivCustomerValue[]
	*
	*
	* @version: v1.0.0
	* @author: jiangxy
	* @date: 2011-12-22 上午09:31:25 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2011-12-22     jiangxy           v1.0.0               修改原因
	 */
	public IQBOIndivCustomerValue[] queryIndivCustomerByCustServiceId(String condition, Map parameter) throws Exception;
}
