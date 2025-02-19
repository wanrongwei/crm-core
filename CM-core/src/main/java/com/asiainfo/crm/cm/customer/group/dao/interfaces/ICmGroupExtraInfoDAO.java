package com.asiainfo.crm.cm.customer.group.dao.interfaces;

import java.rmi.RemoteException;

import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupExtraInfoValue;

/**   
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: ICmGroupExtraInfoDAO.java
 * @Description: 该类的功能描述
 *
 * @version: v1.0.0
 * @author: huzq2
 * @date: Jan 12, 2011 2:00:35 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * Jan 12, 2011		huzq2           v1.0.0               修改原因
 */
public interface ICmGroupExtraInfoDAO {

	/**   
	 * @Function: ICmGrouExtraInfoDAO.java
	 * @Description: 该函数的功能描述
	 *
	 * @param groupExtraInfoValue
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Dec 29, 2010 5:38:35 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Dec 29, 2010     huzq2           v1.0.0               修改原因
	 */
	public void saveGroupExtraInfo(IBOCmGroupExtraInfoValue groupExtraInfoValue) throws Exception;

	/**   
	 * @Function: ICmGrouExtraInfoDAO.java
	 * @Description: 批量保存集团客户信息
	 *
	 * @param groupExtraInfoValues
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jan 10, 2011 11:32:19 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 10, 2011     huzq2           v1.0.0               修改原因
	 */
	public void saveGroupExtraInfo(IBOCmGroupExtraInfoValue[] groupExtraInfoValues) throws Exception;
	
	/**   
	 * @Function: ICmGrouExtraInfoDAO.java
	 * @Description: 根据groupCustId检索出扩展信息返回
	 *
	 * @param groupId
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: fengjian
	 * @date: Jan 10, 2011 11:32:19 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 10, 2011     fengjian           v1.0.0               错误修改
	 */
	public IBOCmGroupExtraInfoValue  getGroupExtraInfoById(long groupId) throws Exception;
	
	/**   
	* @Function: ICmGroupExtraInfoDAO.java
	* @Description: 检索所有状态的集团客户扩展信息
	*
	* @param groupCustId
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Jul 22, 2011 10:45:01 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Jul 22, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmGroupExtraInfoValue queryAllStateGroupExtraInfoByGroupCustId(long groupCustId) throws Exception, RemoteException;
}
