/**
 * 
 */
package com.asiainfo.crm.cm.customer.group.dao.interfaces;

import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupInformInfoValue;

/**   
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: ICmGroupInformInfoDAO.java
 * @Description: 该类实现对集团客户信息化信息的管理功能。
 *
 * @version: v1.0.0
 * @author: huzq2
 * @date: Jan 12, 2011 2:08:01 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * Jan 12, 2011		huzq2           v1.0.0               修改原因
 */

public interface ICmGroupInformInfoDAO {

	/**   
	 * @Function: ICmGrouCustomerSV.java
	 * @Description: 根据主键（groupCustId, informTypeId）查询集团信息化信息。
	 *
	 * @param groupCustId
	 * @param informTypeId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Dec 22, 2010 12:59:00 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Dec 22, 2010     huzq2           v1.0.0               修改原因
	 */
	public IBOCmGroupInformInfoValue queryGroupInformInfo(long groupCustId, int informTypeId) throws Exception;

	/**   
	 * @Function: ICmGroupInformInfoDAO.java
	 * @Description: 查询集团信息化信息列表。如果参数groupCustId不大于0时默认查询所有集团的信息化信息。
	 *
	 * @param groupCustId
	 * @param startIndex
	 * @param endIndex
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Dec 22, 2010 11:21:46 AM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Dec 22, 2010     huzq2           v1.0.0               修改原因
	 */
	public IBOCmGroupInformInfoValue[] queryGroupInformInfo(long groupCustId, int startIndex, int endIndex) throws Exception;

	/**   
	 * @Function: ICmGroupInformInfoDAO.java
	 * @Description: 查询集团信息化信息记录数。如果参数groupCustId不大于0时默认查询所有集团的信息化信息记录数。
	 *
	 * @param groupCustId
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Dec 22, 2010 11:22:03 AM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Dec 22, 2010     huzq2           v1.0.0               修改原因
	 */
	public int queryGroupInformInfoCount(long groupCustId) throws Exception;

	/**   
	 * @Function: ICmGroupInformInfoDAO.java
	 * @Description: 保存集团客户信息化信息
	 *
	 * @param groupInformInfoValue
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jan 10, 2011 11:34:22 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 10, 2011     huzq2           v1.0.0               修改原因
	 */
	public void saveGroupInformInfo (IBOCmGroupInformInfoValue groupInformInfoValue) throws Exception;

	/**   
	 * @Function: ICmGroupInformInfoDAO.java
	 * @Description: 批量保存集团信息化信息
	 *
	 * @param groupInformInfoValues
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jan 10, 2011 11:35:00 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 10, 2011     huzq2           v1.0.0               修改原因
	 */
	public void saveGroupInformInfo (IBOCmGroupInformInfoValue[] groupInformInfoValues) throws Exception;

	/**   
	 * @Function: ICmGroupInformInfoDAO.java
	 * @Description: 根据groupId 查出集团信息化信息
	 *
	 * @param groupCustId
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: fengjian
	 * @date: Jan 10, 2011 11:35:00 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Fan 21, 2011     fengjian           v1.0.0               修改原因
	 */
	public IBOCmGroupInformInfoValue[] queryGroupInformInfosById(long groupCustId) throws Exception;
	/**   
	 * @Function: ICmGroupInformInfoDAO.java
	 * @Description: 根据groupId 查出集团信息化信息每种类型标示的使用状态以,的形式串联（U 使用,E 未使用）
	 * <ol>
	 * 	<li>PBX情况</li>
	 * 	<li>Centrex</li>
	 * 	<li>直线电话</li>
	 * 	<li>专网/分支机构互联</li>
	 * 	<li>网站</li>
	 * 	<li>企业局域网情况</li>
	 * 	<li>邮件系统</li>
	 * 	<li>互联网接入</li>
	 * 	<li>OA系统</li>
	 * 	<li>ERP 的ERM 属性</li>
	 * 	<li>ERP 的CRM 属性</li>
	 * 	<li>ERP 的SCM 属性</li>
	 * </ol>
	 * @param groupCustId 集团客户编号
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: lixiangling
	 * @date: Apr 15, 2011 7:23:14 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Apr 15, 2011     lixiangling           v1.0.0               修改原因
	 */
	public String queryIsUsedByGroupCustId(long groupCustId)throws Exception;
}
