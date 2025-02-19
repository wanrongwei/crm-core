/**
 * 
 */
package com.asiainfo.crm.cm.busimodel.rule.bean;

import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.busimodel.rule.ivalues.ICmEntityPermissionData;

/**   
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: CmEntityPermissionDataBean.java
 * @Description: 该类的功能描述
 *
 * @version: v1.0.0
 * @author: huzq2
 * @date: Jun 9, 2011 12:02:07 AM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * Jun 9, 2011		huzq2           v1.0.0               修改原因
 */

public class CmEntityPermissionDataBean implements ICmEntityPermissionData
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5059754441903803998L;

	private Map m_entityMap = null;

	private Map m_privMap = null;

	private Map m_roleGrantMap = null;

	private DataContainerInterface m_managerInfo = null;

	public CmEntityPermissionDataBean(DataContainerInterface[] entitys, DataContainerInterface[] privs,
			DataContainerInterface[] roleGrants, DataContainerInterface managerInfo)
	{
		// 如果权限实体不为空，则将权限实体放入Map中
		if (null != entitys && entitys.length > 0)
		{
			this.m_entityMap = new HashMap();
			for (int i = 0; i < entitys.length; i++)
			{
				this.m_entityMap.put(entitys[i].getAsString(S_ENT_ID), entitys[i]);
			}
		}
		// 操作权限
		if (null != privs && privs.length > 0)
		{
			this.m_privMap = new HashMap();
			for (int i = 0; i < privs.length; i++)
			{
				this.m_privMap.put(privs[i].getAsString(S_PRIV_ID), privs[i]);
			}
		}
		// 角色受权信息
		if (null != roleGrants && roleGrants.length > 0)
		{
			this.m_roleGrantMap = new HashMap();
			StringBuilder key = new StringBuilder();
			for (int i = 0; i < roleGrants.length; i++)
			{
				key.delete(0, key.length());
				this.m_roleGrantMap.put(key.append(roleGrants[i].getAsString(S_ENT_ID)).append("^").append(
						roleGrants[i].getAsString(S_PRIV_ID)).toString(), roleGrants[i]);
			}
		}
		// 客户经理信息
		if (null != managerInfo)
		{
			this.m_managerInfo = managerInfo;
		}
	}

	public DataContainerInterface getEntityByEntId(long entId)
	{
		if (this.m_entityMap == null)
			return null;
		if (this.m_entityMap.get(String.valueOf(entId)) == null)
			return null;
		return (DataContainerInterface) this.m_entityMap.get(String.valueOf(entId));
	}

	public String getEntityNameByEntId(long entId)
	{
		if (this.m_entityMap == null)
			return null;
		if (this.m_entityMap.get(String.valueOf(entId)) == null)
			return null;
		return ((DataContainerInterface) this.m_entityMap.get(String.valueOf(entId))).getAsString(S_ENT_NAME);
	}

	public DataContainerInterface getManagerInfo()
	{
		return this.m_managerInfo;
	}

	public DataContainerInterface getPrivByPrivId(long privId)
	{
		if (this.m_privMap == null)
			return null;
		if (this.m_privMap.get(String.valueOf(privId)) == null)
			return null;
		return (DataContainerInterface) this.m_privMap.get(String.valueOf(privId));
	}

	public String getPrivNameByPrivId(long privId)
	{
		if (this.m_privMap == null)
			return null;
		if (this.m_privMap.get(String.valueOf(privId)) == null)
			return null;
		return ((DataContainerInterface) this.m_privMap.get(String.valueOf(privId))).getAsString(S_PRIV_NAME);
	}

	public DataContainerInterface getRoleGrantByEntPrivId(long entId, long privId)
	{
		if (this.m_roleGrantMap == null)
			return null;
		if (this.m_roleGrantMap.get(new StringBuilder().append(entId).append("^").append(privId).toString()) == null)
			return null;
		return (DataContainerInterface) this.m_roleGrantMap.get(new StringBuilder().append(entId).append("^").append(
				privId).toString());
	}

	public boolean hasEntityPermission(long entId, long privId)
	{
		if (this.m_roleGrantMap == null)
			return false;
		if (this.m_roleGrantMap.get(new StringBuilder().append(entId).append("^").append(privId).toString()) == null)
			return false;
		return true;
	}

}
