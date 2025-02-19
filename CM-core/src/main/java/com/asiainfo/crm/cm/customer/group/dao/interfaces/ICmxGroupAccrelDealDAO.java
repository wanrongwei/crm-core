/**
 * 
 */
package com.asiainfo.crm.cm.customer.group.dao.interfaces;

import java.util.Map;

import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmxGroupAccrelDealValue;

/**   
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: ICmxGroupAccrelDealDAO.java
 * @Description: 该类的功能描述
 *
 * @version: v1.0.0
 * @author: huzq2
 * @date: May 17, 2011 1:03:23 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * May 17, 2011		huzq2           v1.0.0               修改原因
 */

public interface ICmxGroupAccrelDealDAO
{
	/**   
	 * @Function: saveGroupAccrelDeal
	 * @Description: 保存集团解除分账关系工单信息
	 *
	 * @param accrelDealValues 需要保存的数据
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 17, 2011 1:27:05 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * May 17, 2011     huzq2           v1.0.0               修改原因
	 */
	public void saveGroupAccrelDeal(IBOCmxGroupAccrelDealValue[] accrelDealValues) throws Exception;

	/**   
	 * @Function: queryGroupAccrelDeals
	 * @Description: 根据查询条件查询集团解除分账关系工单信息
	 *
	 * @param condition 查询条件
	 * @param parameter 查询条件值
	 * @param startNum 分页参数
	 * @param endNum 分页参数
	 * @return 符合条件的集团解除分账关系工单信息列表
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 17, 2011 1:29:01 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * May 17, 2011     huzq2           v1.0.0               修改原因
	 */
	public IBOCmxGroupAccrelDealValue[] queryGroupAccrelDeals(String condition, Map parameter, int startNum, int endNum)
			throws Exception;
	
	/**   
	 * @Function: getNewDealId
	 * @Description: 获取新工单编号
	 *
	 * @return 生成的工单编号
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 17, 2011 1:31:20 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * May 17, 2011     huzq2           v1.0.0               修改原因
	 */
	public long getNewDealId() throws Exception;

	/**   
	 * @Function: queryGroupAccrelDealsCount
	 * @Description: 查询指定条件的解除分账关系工单数量
	 *
	 * @param condition 查询条件
	 * @param parameter 查询参数
	 * @return 符合条件的工单数量
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 18, 2011 7:01:53 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * May 18, 2011     huzq2           v1.0.0               修改原因
	 */
	public int queryGroupAccrelDealsCount(String condition, Map parameter) throws Exception;
}
