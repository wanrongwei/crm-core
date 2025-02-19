package com.asiainfo.crm.cm.customer.group.dao.interfaces;

import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupOrgStructValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmGroupStructTreeValue;

public interface ICmGroupOrgStructDAO {
	
	/**   
	 * @Function: ICmGroupOrgStructDAO.java
	 * @Description: 根据集团编号和上级组织编号查询集团组织结构信息
	 *
	 * @param groupCustId
	 * @param parentDeptId
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jan 10, 2011 11:55:53 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 10, 2011     huzq2           v1.0.0               修改原因
	 */
	public IBOCmGroupOrgStructValue[] queryGroupOrgStruct(long groupCustId,long parentDeptId) throws Exception;
	
	/**   
	 * @Function: ICmGroupOrgStructDAO.java
	 * @Description: 保存集团组织结构信息
	 *
	 * @param groupOrgStructValue
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jan 10, 2011 11:58:35 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 10, 2011     huzq2           v1.0.0               修改原因
	 */
	public long createGroupOrgStruct(IBOCmGroupOrgStructValue groupOrgStructValue) throws Exception;
	
	/**   
	 * @Function: queryOrgStructInfo.java
	 * @Description: 
	 *
	 * @param deptId
	 * @throws Exception,RemoteException
	 * @return long
	 * 
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jan 10, 2011 11:58:58 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 10, 2011     fengjian           v1.0.0               修改原因
	 */
	public IBOCmGroupOrgStructValue queryOrgStructInfo(long deptId) throws Exception;
	
	/**   
	 * @Function: ICmGroupOrgStructDAO.java
	 * @Description: 
	 *
	 * @param groupOrgStructValue
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: fengjian
	 * @date: Jan 26, 2011 11:58:58 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 26, 2011     fengjian           v1.0.0               修改原因
	 */
	public void updateGroupOrgStruct(IBOCmGroupOrgStructValue groupOrgStructValue) throws Exception;
	
	/**   
	 * @Function: ICmGroupOrgStructDAO.java
	 * @Description: 
	 *
	 * @param groupOrgStructValue
	 * @throws Exception, RemoteException
	 *
	 * @version: v1.0.0
	 * @author: fengjian
	 * @date: Jan 26, 2011 11:58:58 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 26, 2011     fengjian           v1.0.0               修改原因
	 */
	public void deleteGroupOrgStruct(IBOCmGroupOrgStructValue groupOrgStructValue) throws Exception;
	
	/**   
	 * @Function: ICmGroupOrgStructDAO.java
	 * @Description: 
	 *
	 * @param groupOrgStructValues
	 * @throws Exception, RemoteException
	 *
	 * @version: v1.0.0
	 * @author: fengjian
	 * @date: Jan 26, 2011 11:58:58 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 26, 2011     fengjian           v1.0.0               修改原因
	 */
	public void deleteGroupOrgStruct(IBOCmGroupOrgStructValue[] groupOrgStructValues) throws Exception;
	
	/**   
	 * @Function: ICmGroupOrgStructDAO.java
	 * @Description: 
	 *
	 * @param parentId
	 * @throws Exception, RemoteException
	 *
	 * @version: v1.0.0
	 * @author: fengjian
	 * @date: Jan 26, 2011 11:58:58 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 26, 2011     fengjian           v1.0.0               修改原因
	 */
	public int queryGroupOrgStructCountByParentId(long parentId) throws Exception;
	
	/**   
	 * @Function: ICmGroupOrgStructDAO.java
	 * @Description: 
	 * @param relObjectId
	 * @param deptType
	 * @param selfDeptId
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
	public int queryRelObjectIdCount(long relObjectId, long deptType, long selfDeptId) throws Exception;
	
	/**   
	 * @Function: ICmGroupOrgStructDAO.java
	 * @Description: 
	 *
	 * @param parentId
	 * @throws Exception, RemoteException
	 *
	 * @version: v1.0.0
	 * @author: fengjian
	 * @date: Fan 14, 2011 11:38:58 AM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * 
	 */
	public IBOCmGroupOrgStructValue[] queryGroupOrgStructsByGroupId(long parentId) throws Exception;
	
	/**   
	 * @Function: ICmGroupOrgStructDAO.java
	 * @Description: 
	 *
	 * @param beans
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
	public void saveGroupOrgStructs(IBOCmGroupOrgStructValue[] beans) throws Exception;
	
	/**   
	 * @Function: ICmGroupOrgStructDAO.java
	 * @Description: 
	 * @param relObjectId
	 * @param selfDeptId
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
	public int queryKeyManCount(long relObjectId, long selfDeptId) throws Exception;
	
	/**   
	 * @Function: ICmGroupOrgStructDAO.java
	 * @Description: 
	 *
	 * @param parentId
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
	public IQBOCmGroupStructTreeValue[] queryGroupOrgStructTreeByGroupId(long relObjectId,int deptType) throws Exception;
	
	/**   
	 * @Function: ICmGroupOrgStructDAO.java
	 * @Description: 
	 *
	 * @param relObjectId
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
	public IBOCmGroupOrgStructValue queryGroupOrgStructByGroupId(long relObjectId) throws Exception;
	
	/**   
	 * @Function: ICmGroupOrgStructDAO.java
	 * @Description: 
	 *
	 * @param relObjectId
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
	public int querySubGroupCountByGroupId(long relObjectId) throws Exception;
	
	/**   
	 * @Function: ICmGroupOrgStructDAO.java
	 * @Description: 
	 *
	 * @param groupId
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
	public int queryParentsOrgStructCount(long groupId) throws Exception;
	
	
	/**   
	* @Function: ICmGroupOrgStructDAO.java
	* @Description: 根据关键人物ID检索组织结构
	*
	* @param kernelId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Apr 7, 2011 9:33:15 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Apr 7, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmGroupOrgStructValue queryKeyManStruct(long kernelId) throws Exception;
	
	/**   
	 * @Function queryGroupOrgStructs
	 * @Description 
	 *
	 * @param groupCustId
	 * @param parentDeptId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-15 下午8:22:05
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-15     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupOrgStructValue[] queryGroupOrgStructs(long groupCustId,long parentDeptId,int start,int end)throws Exception;
	
	/**   
	 * @Function queryGroupOrgStructsCount
	 * @Description 
	 *
	 * @param groupCustId
	 * @param parentDeptId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-15 下午8:22:08
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-15     shitian           v1.0.0               修改原因<br>
	 */
	public int queryGroupOrgStructsCount(long groupCustId,long parentDeptId)throws Exception;
	
	/**   
	 * @Function queryGroupTopOrganize
	 * @Description 查询集团一级部门
	 *
	 * @param groupCustId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Sep 6, 2013 10:00:50 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Sep 6, 2013     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupOrgStructValue queryGroupTopOrganize(long groupCustId)throws Exception;
}
