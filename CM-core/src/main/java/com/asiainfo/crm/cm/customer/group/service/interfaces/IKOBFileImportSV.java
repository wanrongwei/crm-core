package com.asiainfo.crm.cm.customer.group.service.interfaces;

import com.ai.appframe2.bo.DataContainer;

/**
 * 
 * 
 * Copyright: Copyright (c) 2014 Asiainfo-Linkage
 * 
 * @ClassName: IKOBFileImportSV 
 * @Description: 
 *
 * @version: v1.0.0
 * @author: zhuyy
 * @date:  2014-6-10 下午02:27:13
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * 2014-5-20     zhuyy          v1.0.0             修改原因
 */
public interface IKOBFileImportSV {
	
	/**
	 * 
	 * @Function: queryDataForFile
	 * @Description: 查询KOB文件数据
	 * 
	 * @param regionId
	 * @param tenantId
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhuyy
	 * @date: 2014-6-10 下午02:27:36
	 *
	 * Modification History:
	 * Date          Author          Version            Description
	 *---------------------------------------------------------*
	 * 2014-5-20     zhuyy         v1.0.0                                   修改原因
	 */
	public DataContainer[] queryDataForFile(String tenantId,String regionId, int fileNo)throws Exception;
	
	/**
	 * 
	 * @Function: queryIndustrys
	 * @Description: 查询集团客户的行业信息
	 * 
	 * @param regionId
	 * @param tenantId
	 * @return
	 * @throws Exception
	 * @version: v1.0.0
	 * @author: zhuyy
	 * @date: 2014-10-19 下午02:27:36
	 *
	 * Modification History:
	 * Date          Author          Version            Description
	 *---------------------------------------------------------*
	 * 2014-10-19     zhuyy         v1.0.0                                   修改原因
	 */
	public DataContainer[] queryIndustrys(String tenantId,long custId) throws Exception;
}
