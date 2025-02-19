/**
 * 
 */
package com.asiainfo.crm.cm.busimodel.rule.ivalues;

import java.io.Serializable;

import com.ai.appframe2.common.DataContainerInterface;

/**   
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: ICmEntityPermissionData.java
 * @Description: 该类的功能描述
 *
 * @version: v1.0.0
 * @author: huzq2
 * @date: Jun 8, 2011 11:25:22 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * Jun 8, 2011		huzq2           v1.0.0               修改原因
 */

public interface ICmEntityPermissionData extends Serializable
{
	String S_ENT_ID = "ENT_ID";

	String S_PRIV_ID = "PRIV_ID";

	String S_PRIV_NAME = "PRIV_NAME";

	String S_ENT_NAME = "ENT_NAME";

	String S_MANAGER_ID = "MANAGER_ID";

	String S_MANAGER_NAME = "MANAGER_NAME";
	
	String S_MANAGER_TYPE = "MANAGER_TYPE";

	String S_CITY_ID = "CITY_ID";

	String S_COUNTY_ID = "COUNTY_ID";

	String S_AREA_ID = "AREA_ID";
	
	String S_AREAS_LIST = "S_AREA_LIST";

	/**   
	 * 根据实体编号查询权限实体信息.
	 * @Function: getEntityByEntId
	 *
	 * @param entId 实体编号
	 * @return 包含对应实体编号和实体名称的Map。<br>
	 * 如果找到了数据，则返回包含以上信息的Map，否则返回null。
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jun 8, 2011 7:28:43 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jun 8, 2011     huzq2           v1.0.0               修改原因
	 */
	DataContainerInterface getEntityByEntId(long entId);

	/**   
	 * 根据实体编号获权限取实体名称
	 * @Function: getEntityNameByEntId
	 *
	 * @param entId 实体编号
	 * @return 对应的实体名称。<br>
	 * 如果找到对应的实体信息，返回其名称；否则返回null。
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jun 8, 2011 11:48:03 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jun 8, 2011     huzq2           v1.0.0               修改原因
	 */
	String getEntityNameByEntId(long entId);

	/**
	 * 根据操作权限编号查询操作权限信息。<br>
	 *    
	 * @Function: getPrivByPrivId
	 *
	 * @param privId 操作权限编号
	 * @return 操作权限编号对应的操作权限名称。<br>
	 * 如果找到对应的操作权限信息则返回包含操作权限编号、操作权限名称的Map信息；否则返回null。
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jun 8, 2011 7:19:06 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jun 8, 2011     huzq2           v1.0.0               修改原因
	 */
	DataContainerInterface getPrivByPrivId(long privId);

	/**   
	 * 根据操作权限编号获取对应的操作权限名称
	 * @Function: getPrivNameByPrivId
	 *
	 * @param privId 操作权限编号
	 * @return 对应的操作权限名称.<br>
	 * 如果找到对应的实体，则返回其名称；否则返回null。
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jun 8, 2011 11:48:57 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jun 8, 2011     huzq2           v1.0.0               修改原因
	 */
	String getPrivNameByPrivId(long privId);

	/**   
	 * 根据实体编号和操作权限编号获取授权信息。
	 * @Function: getRoleGrantByEntPrivId
	 *
	 * @param entId 实体编号
	 * @param privId 操作权限编号
	 * @return 实体编号和操作权限编号对应的授权信息。
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jun 8, 2011 11:29:02 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jun 8, 2011     huzq2           v1.0.0               修改原因
	 */
	DataContainerInterface getRoleGrantByEntPrivId(long entId, long privId);
	
	/**   
	 * 判断是否具有实体编号和操作权限编号对应的权限。
	 * @Function: hasEntityPermission
	 *
	 * @param entId
	 * @param privId
	 * @return 是否具有实体编号和操作权限编号对应的权限。
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jun 9, 2011 12:00:03 AM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jun 9, 2011     huzq2           v1.0.0               修改原因
	 */
	boolean hasEntityPermission(long entId, long privId);

	/**   
	 * 取客户经理信息
	 * @Function: getManagerInfo
	 *
	 * @return 返回客户经理相关信息
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jun 8, 2011 11:40:20 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jun 8, 2011     huzq2           v1.0.0               修改原因
	 */
	DataContainerInterface getManagerInfo();

}
