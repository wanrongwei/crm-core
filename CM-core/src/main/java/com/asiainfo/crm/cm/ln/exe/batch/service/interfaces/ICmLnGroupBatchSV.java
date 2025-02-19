package com.asiainfo.crm.cm.ln.exe.batch.service.interfaces;

import java.util.Map;


public interface ICmLnGroupBatchSV {
	
	/**   
	 * @Function importGroupKeyContact
	 * @Description 批量导入集团家属
	 *
	 * @param colNames
	 * @param colValues
	 * @param commonInfo
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Aug 31, 2012 10:19:40 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Aug 31, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void importGroupFamily(String[] colNames, String[] colValues, Map commonInfo) throws Exception; 

	/**   
	 * @Function importGroupKeyContact
	 * @Description 批量导入集团关键人物
	 *
	 * @param colNames
	 * @param colValues
	 * @param commonInfo
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Aug 31, 2012 10:19:40 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Aug 31, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void importGroupKeyContact(String[] colNames, String[] colValues, Map commonInfo) throws Exception; 
	
	/**   
	 * @Function importGroupMember
	 * @Description 批量导入集团成员
	 *
	 * @param colNames
	 * @param colValues
	 * @param commonInfo
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Aug 31, 2012 10:22:08 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Aug 31, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public void importGroupMember(String[] colNames, String[] colValues, Map commonInfo) throws Exception; 
	
	
	/**   
	 * @Function importGroupContact
	 * @Description 批量导入集团联系人
	 *
	 * @param colNames
	 * @param colValues
	 * @param commonInfo
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Aug 31, 2012 10:22:19 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Aug 31, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void importGroupContact(String[] colNames, String[] colValues, Map commonInfo) throws Exception; 
	/**
	 * 
	* @Function: ICmLnGroupBatchSV.java
	* @Description: 集团家属批量删除
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: suntao6
	* @date: Dec 5, 2012 2:46:04 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Dec 5, 2012     suntao6           v1.0.0              修改原因
	 */
	public void deleteGroupFamily(String[] colNames, String[] colValues, Map commonInfo) throws Exception; 
	

	/**   
	 * @Function importGroupContact
	 * @Description 批量删除集团联系人
	 *
	 * @param colNames
	 * @param colValues
	 * @param commonInfo
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Aug 31, 2012 10:22:19 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Aug 31, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void deleteGroupContact(String[] colNames, String[] colValues, Map commonInfo) throws Exception; 
	
	/**   
	 * @Function importGroupContact
	 * @Description 批量删除网内成员
	 *
	 * @param colNames
	 * @param colValues
	 * @param commonInfo
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Aug 31, 2012 10:22:19 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Aug 31, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public void deleteGroupMember(String[] colNames, String[] colValues, Map commonInfo) throws Exception; 

}
