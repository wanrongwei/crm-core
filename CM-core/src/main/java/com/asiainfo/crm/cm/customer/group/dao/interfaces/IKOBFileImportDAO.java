package com.asiainfo.crm.cm.customer.group.dao.interfaces;

import com.ai.appframe2.bo.DataContainer;

/**
 * 
 * 
 * Copyright: Copyright (c) 2014 Asiainfo-Linkage
 * 
 * @ClassName: IKOBFileImportDAO 
 * @Description: KOB文件数据处理
 *
 * @version: v1.0.0
 * @author: zhuyy
 * @date:  2014-6-10 上午10:53:14
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2014-5-20     zhuyy          v1.0.0             修改原因
 */
public interface IKOBFileImportDAO {
	
	public DataContainer[] queryDataForFile(String tenantId,String regionId, int fileNo)throws Exception;
	
	public DataContainer[] queryIndustrys(String tenantId, long custId) throws Exception;
}
