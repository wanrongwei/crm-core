package com.asiainfo.crm.cm.ln.exe.batch.service.interfaces;

import java.util.Map;

public interface ICmClubMemberToUserManagerSV {

	/**
	 * 
	* @Function: ICmClubMemberToUserManagerSV.java
	* @Description: 大客户对应的电话经理批量导入
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: qiangkz
	* @date: Oct 30, 2012 11:19:50 AM 
	*
	* Modification History:
	* Oct 30, 2012         qiangkz          Version            Description
	 */
	public void importUserManager(String[] colNames, String[] colValues, Map commonInfo) throws Exception;


	/**
	 * 
	* @Function: ICmClubMemberToUserManagerSV.java
	* @Description:  大客户对应的电话经理批量删除
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: qiangkz
	* @date: Oct 30, 2012 11:21:19 AM 
	*
	* Modification History:
	* Oct 30, 2012         qiangkz          Version            Description
	 */
	public void DeleteUserManager(String[] colNames, String[] colValues, Map commonInfo) throws Exception;
    /**
     * 
    * @Function: ICmClubMemberToUserManagerSV.java
    * @Description: 大客户地市级别调整批量导入
    *
    * @param:参数描述
    * @return：返回结果描述
    * @throws：异常描述
    *
    * @version: v1.0.0
    * @author: suntao6
    * @date: Oct 30, 2012 8:21:00 PM 
    *
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * Oct 30, 2012     suntao6           v1.0.0              修改原因
     */
	public void importClubZoneMember(String[] colNames, String[] colValues, Map commonInfo) throws Exception;
	
	/**
	 * 
	* @Function: ICmClubMemberToUserManagerSV.java
	* @Description: 大客户批量新增
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: qiangkz
	* @date: Nov 5, 2012 9:56:07 PM 
	*
	* Modification History:
	* Nov 5, 2012         qiangkz          Version            Description
	 */
	public void importClubMember(String[] colNames, String[] colValues,
			Map commonInfo) throws Exception ;
}
