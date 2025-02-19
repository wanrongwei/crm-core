package com.asiainfo.crm.cm.customer.group.dao.interfaces;

import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustMgrRelValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmGroupCustManagerValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmGroupCustMgrRelValue;


public interface ICmGroupCustManagerDAO
{
	/**   
	 * @Function: ICmGroupOrgStructDAO.java
	 * @Description: 根据集团编号查询客户经理与政企客户信息
	 *
	 * @param groupCustId
	 * @return IBOCmGroupCustMgrRelValue[]
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: fengjian
	 * @date: Jan 10, 2011 11:55:53 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 10, 2011     fengjian           v1.0.0               修改原因
	 */
	public IBOCmGroupCustMgrRelValue[] queryGroupCustMgrRelsByGroupCustId(long groupCustId) throws Exception;
	
	/**   
	* @Function: ICmGroupCustManagerDAO.java
	* @Description: 查询客户经理编号,客户经理ID查询个数
	*
	* @param mgrIds
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Jun 14, 2011 8:39:37 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Jun 14, 2011     fengjian           v1.0.0               修改原因
	*/
	public int queryGroupCustMgrRelsByMgrIds(long[] mgrIds,long groupCustId) throws Exception;
	/**   
	 * @Function: ICmGroupOrgStructDAO.java
	 * @Description: 批量保存客户经理与政企客户信息
	 *
	 * @param IBOCmGroupCustMgrRelValue[]
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: fengjian
	 * @date: Jan 10, 2011 11:55:53 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 10, 2011     fengjian           v1.0.0               修改原因
	 */
	public void saveGroupCustMgrRels(IBOCmGroupCustMgrRelValue[] groupCustMgrRel) throws Exception;
	
	/**   
	 * @Function: ICmGroupOrgStructDAO.java
	 * @Description: 根据区域编号查询客户经理与政企客户信息
	 *
	 * @param regionCustId
	 * @return IBOCmGroupCustMgrRelValue[]
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: fengjian
	 * @date: Jan 10, 2011 11:55:53 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 10, 2011     fengjian           v1.0.0               修改原因
	 */
	public IBOCmGroupCustMgrRelValue[] queryGroupCustMgrRelsByRegiontId(long regionCode) throws Exception;

	/**   
	* @Function: ICmGroupCustMgrRelDAO.java
	* @Description: 保存客户经理与政企客户信息
	*
	* @param groupCustMgrRel
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 9, 2011 5:10:10 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 9, 2011     fengjian           v1.0.0               修改原因
	*/
	public void saveGroupCustMgrRel(IBOCmGroupCustMgrRelValue groupCustMgrRel) throws Exception;

	/**   
	* @Function: ICmGroupCustManagerDAO.java
	* @Description: 检索客户经理信息，根据集团ID
	*
	* @param groupId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 15, 2011 4:07:23 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 15, 2011     fengjian           v1.0.0               修改原因
	*/
	public IQBOCmGroupCustMgrRelValue[] queryGroupCustMgrRelAndMgrInfoByGroupId(long groupId,int start,int end) throws Exception;
	
	/**   
	* @Function: ICmGroupCustManagerDAO.java
	* @Description: 根据集团ID数组检索所有的客户经理信息
	*
	* @param groupIds
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Apr 26, 2011 5:33:36 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Apr 26, 2011     fengjian           v1.0.0               修改原因
	*/
	public IQBOCmGroupCustMgrRelValue[] queryGroupCustMgrRelAndMgrInfoByGroupIds(long[] groupIds) throws Exception;

	/**   
	* @Function: ICmGroupCustManagerDAO.java
	* @Description: 检索客户经理信息，根据集团ID数量
	*
	* @param groupId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 15, 2011 4:19:48 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 15, 2011     fengjian           v1.0.0               修改原因
	*/
	public int queryGroupCustMgrRelAndMgrInfoCountByGroupId(long groupId) throws Exception;

	/**   
	* @Function: ICmGroupCustManagerDAO.java
	* @Description: 根据集团客户ID和客户经理ID检索数据
	*
	* @param groupCustId
	* @param mgrId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 16, 2011 4:42:46 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 16, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmGroupCustMgrRelValue queryGroupCustMgrRelsByGroupCustIdAndMgrId(long groupCustId, long mgrId) throws Exception;
	
	/**   
	* @Function: ICmGroupCustManagerDAO.java
	* @Description: 根据条件查询集团客户经理关联
	*
	* @param groupCustId
	* @param mgrId
	* @param relType
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Jun 21, 2011 8:01:31 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Jun 21, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmGroupCustMgrRelValue queryGroupCustMgrRelsByCdn(long groupCustId,long mgrId, int relType) throws Exception;
	
	/**   
	* @Function: ICmGroupCustManagerDAO.java
	* @Description: 根据集团客户ID和客户经理ID检索数量
	*
	* @param groupCustId
	* @param mgrId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 17, 2011 7:14:28 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 17, 2011     fengjian           v1.0.0               修改原因
	*/
	public int queryGroupCustMgrRelsCountByGroupCustIdAndMgrId(long groupCustId, long mgrId) throws Exception;
	
	/**   
	* @Function: ICmGroupCustManagerDAO.java
	* @Description: 根据客户经理查询集团
	*
	* @param mgrId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Apr 26, 2011 5:05:13 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Apr 26, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmGroupCustMgrRelValue[] getGroupCustMgrRelsByMgeId(long mgrId) throws Exception;

	/**   
	* @Function: ICmGroupCustManagerDAO.java
	* @Description: 查出所有客户经理信息（分页）
	*
	* @param start
	* @param end
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 14, 2011 7:46:09 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 14, 2011     fengjian           v1.0.0               修改原因
	*/
	public IQBOCmGroupCustManagerValue[] queryGroupMgrInfo(int start,int end) throws Exception;
	
	
	/**   
	* @Function: ICmGroupCustManagerDAO.java
	* @Description: 查出所有客户经理数量
	*
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 14, 2011 7:48:25 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 14, 2011     fengjian           v1.0.0               修改原因
	*/
	public int queryGroupMgrInfoCount() throws Exception;
	/**   
	* @Function: ICmGroupCustManagerDAO.java
	* @Description: 查出所有客户经理信息（分页）
	*
	* @param start
	* @param end
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: lixiangling
	* @date: Aug 26, 2011 7:46:09 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Aug 26, 2011     lixiangling           v1.0.0               修改原因
	*/
	public IQBOCmGroupCustManagerValue[] queryGroupMgrInfoToSql(int start,int end) throws Exception;
	
	/**   
	* @Function: ICmGroupCustManagerDAO.java
	* @Description: 查出所有在网集团的当天变更过的客户经理关系
	*
	* @param start
	* @param end
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Feb 8, 2012 4:08:01 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Feb 8, 2012     fengjian           v1.0.0               修改原因
	*/
	public DataContainer[] queryOnlineGroupMgrInfo(String startDate,String endDate,int start, int end) throws Exception;
	
}
