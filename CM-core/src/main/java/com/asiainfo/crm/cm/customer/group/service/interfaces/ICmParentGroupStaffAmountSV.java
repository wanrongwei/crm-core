package com.asiainfo.crm.cm.customer.group.service.interfaces;

import com.ai.appframe2.bo.DataContainer;

/**
 * 
 * 
 * Copyright: Copyright (c) 2014 Asiainfo-Linkage
 * 
 * @ClassName: ICmParentGroupStaffAmountSV 
 * @Description: 查询根集团总人数
 *
 * @version: v1.0.0
 * @author: chenxq
 * @date:  2014-4-22 下午02:27:13
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2014-4-22     chenxq          v1.0.0             修改原因
 */
public interface ICmParentGroupStaffAmountSV {
	
	/**
	 * 
	 * @Function: queryParentGroupAmount
	 * @Description: 查询根集团总人数
	 * 
	 * @param custId
	 * @param tenantId
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: chenxq
	 * @date: 2014-4-22 下午02:27:36
	 *
	 * Modification History:
	 * Date          Author          Version            Description
	 *---------------------------------------------------------*
	 * 2014-4-22     chenxq         v1.0.0                                   修改原因
	 */
	public int queryParentGroupAmount(long custId,String tenantId)throws Exception;
	
	
	/**
	 * 
	 * @Function: queryParentGroupCust
	 * @Description: 查询根集团客户
	 * 
	 * @param tenantId
	 * @param regionId
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: chenxq
	 * @date: 2014-4-22 下午03:46:35
	 *
	 * Modification History:
	 * Date          Author          Version            Description
	 *---------------------------------------------------------*
	 * 2014-4-22     chenxq         v1.0.0                                   修改原因
	 */
	public long[] queryParentGroupCust(String tenantId,String regionId)throws Exception;
}
