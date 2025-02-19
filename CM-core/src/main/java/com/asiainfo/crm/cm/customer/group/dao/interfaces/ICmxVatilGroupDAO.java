package com.asiainfo.crm.cm.customer.group.dao.interfaces;

import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmxGroupVitalGroupRelValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmxVitalGroupCustomerValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmVitalGroupValue;

/**
 * 
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: ICmxVatilGroupDAO.java
 * @Description: 清单集团管理
 *
 * @version: v1.0.0
 * @author: zhaiwg
 * @date: Apr 1, 2011 11:46:06 AM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * Apr 1, 2011		zhaiwg          v1.0.0               修改原因
 */
public interface ICmxVatilGroupDAO
{
	/**
	 * 
	 * @Function: ICmxVatilGroupDAO.java
	 * @Description: 查询清单信息
	 *
	 * @param groupId
	 * @param $startrowindex
	 * @param $endrowindex
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Apr 1, 2011 4:31:42 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Apr 1, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public IQBOCmVitalGroupValue[] queryVatilGroup(String groupId, int $startrowindex, int $endrowindex)
			throws Exception;
	
	/**
	 * 
	 * @Function: ICmxVatilGroupDAO.java
	 * @Description: 查询清单数量
	 *
	 * @param groupId
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Apr 1, 2011 4:31:57 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Apr 1, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public int queryVatilGroupCount(String groupId) throws Exception;
	
	/**
	 * 
	 * @Function: ICmxVatilGroupDAO.java
	 * @Description: 根据集团标号  清单编号 得到清单集团具体信息
	 *
	 * @param groupId
	 * @param vgroupId
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Apr 1, 2011 4:32:10 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Apr 1, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public IQBOCmVitalGroupValue queryVatilGroupById(String groupId, String vgroupId) throws Exception;
	
	/**
	 * 
	 * @Function: ICmxVatilGroupDAO.java
	 * @Description: 删除清单 集团
	 *
	 * @param groupId
	 * @param vgroupId
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Apr 1, 2011 4:32:56 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Apr 1, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public void deleteVatilGroupById(String groupId, String vgroupId) throws Exception;
	
	/**
	 * 
	 * @Function: ICmxVatilGroupDAO.java
	 * @Description: 保存清单信息
	 *
	 * @param value
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Apr 1, 2011 4:33:15 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Apr 1, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public void saveVitalGroup(IQBOCmVitalGroupValue value) throws Exception;
	
	/**
	 * 
	 * @Function: ICmxVatilGroupDAO.java
	 * @Description: 根据 vgroupId 查询清单具体信息
	 *
	 * @param vgroupId
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Apr 1, 2011 4:33:46 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Apr 1, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public IBOCmxVitalGroupCustomerValue queryVatailGroupByVGroupId(String vgroupId) throws Exception;
	
	/**
	 * 
	 * @Function: ICmxVatilGroupDAO.java
	 * @Description: 保存 清单集团关系信息
	 *
	 * @param value
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Apr 1, 2011 5:52:34 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Apr 1, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public void saveVitalGroupRel(IBOCmxGroupVitalGroupRelValue value) throws Exception;
	
	/**
	 * 
	 * @Function: ICmxVatilGroupDAO.java
	 * @Description: 保存 清单集团具体信息
	 *
	 * @param value
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: zhaiwg
	 * @date: Apr 1, 2011 5:52:56 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Apr 1, 2011     zhaiwg           v1.0.0               修改原因
	 */
	public void saveVitalCustomer(IBOCmxVitalGroupCustomerValue value) throws Exception;

}
