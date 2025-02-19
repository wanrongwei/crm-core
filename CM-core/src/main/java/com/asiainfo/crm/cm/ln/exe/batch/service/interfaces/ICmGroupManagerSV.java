package com.asiainfo.crm.cm.ln.exe.batch.service.interfaces;

import java.util.Map;



public interface ICmGroupManagerSV {

	/**   
	 * @Function importGroupKeyContact
	 * @Description 批量导入集团客户与客户经理关系表  新增集团客户与客户经理关系
	 *
	 * @param colNames
	 * @param colValues
	 * @param commonInfo
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Aug 31, 2012 10:19:40 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Aug 31, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public void importGroupManager(String[] colNames, String[] colValues, Map commonInfo) throws Exception;

	/**   
	 * @Function importGroupKeyContact
	 * @Description 批量导入集团客户与客户经理关系表  删除集团客户与客户经理关系
	 * @param colNames
	 * @param colValues
	 * @param commonInfo
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Aug 31, 2012 10:19:40 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Aug 31, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public void deleteGroupManager(String[] colNames, String[] colValues, Map commonInfo) throws Exception;
	
	/**
	 * 
	* @Function: importGroupManagerForBP
	* @Description: 批量新增客户经理
	*
	* @param colNames
	* @param colValues
	* @param commonInfo
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: guansj
	* @date: 2013-1-14 下午10:33:59 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2013-1-14      guansj           v1.0.0              修改原因
	 */
	public void importGroupManagerForBP(String[] colNames, String[] colValues, Map commonInfo) throws Exception;
}
