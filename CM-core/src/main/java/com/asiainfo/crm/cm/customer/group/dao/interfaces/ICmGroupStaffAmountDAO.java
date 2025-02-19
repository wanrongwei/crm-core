package com.asiainfo.crm.cm.customer.group.dao.interfaces;

import com.ai.appframe2.bo.DataContainer;

/**
 * 
 * 
 * Copyright: Copyright (c) 2014 Asiainfo-Linkage
 * 
 * @ClassName: ICmGroupStaffAmountDAO 
 * @Description: 查询根集团总人数
 *
 * @version: v1.0.0
 * @author: chenxq
 * @date:  2014-4-22 上午10:53:14
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2014-4-22     chenxq          v1.0.0             修改原因
 */
public interface ICmGroupStaffAmountDAO {
	
	public DataContainer[] queryGroupStaffAmount(long custId,String tenantId)throws Exception;
	
	public DataContainer[] queryParentGroup(String tenantId,String regionId)throws Exception;
}
