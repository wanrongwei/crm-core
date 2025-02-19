package com.asiainfo.crm.cm.exe.batch.service.interfaces;

import java.util.Map;


public interface ICmGroupManagerBatchSV {

	/**
	 * 
	 * @Function addGroupManager
	 * @Description 批量导入集团客户经理
	 *
	 * @param colNames
	 * @param colValues
	 * @param commonInfo
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jul 24, 2012 4:59:41 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 24, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public void addGroupManager(String[] colNames, String[] colValues, Map commonInfo) throws Exception;
	
	/**
	 * 
	 * @Function delGroupManager
	 * @Description 批量删除集团客户经理 
	 *
	 * @param colNames
	 * @param colValues
	 * @param commonInfo
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jul 24, 2012 4:59:51 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 24, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public void delGroupManager(String[] colNames, String[] colValues, Map commonInfo) throws Exception;
}
