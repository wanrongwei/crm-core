package com.asiainfo.crm.cm.ln.exe.batch.service.interfaces;

import java.util.Map;



public interface ICmSchoolInfoBatchManagerSV {

	/**
	 * 
	* @Function: ICmSchoolInfoManagerSV.java
	* @Description: 教职工信息批量导入
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: suntao6
	* @date: Sep 27, 2012 10:00:47 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Sep 27, 2012     suntao6           v1.0.0              修改原因
	 */
	public void importGsTchrInfo(String[] colNames, String[] colValues, Map commonInfo) throws Exception;
/**
 * 
* @Function: ICmSchoolInfoBatchManagerSV.java
* @Description: 校园直销员信息管理
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Oct 9, 2012 10:45:29 AM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Oct 9, 2012     suntao6           v1.0.0              修改原因
 */
	public void importGsChanTeam(String[] colNames, String[] colValues, Map commonInfo) throws Exception;
/**
 * 
* @Function: ICmSchoolInfoBatchManagerSV.java
* @Description: 学生放号类营销批量导入
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Oct 10, 2012 10:04:53 AM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Oct 10, 2012     suntao6           v1.0.0              修改原因
 */
	public void importGsScheduleInfo(String[] colNames, String[] colValues, Map commonInfo) throws Exception;
/**
 * 
* @Function: ICmSchoolInfoBatchManagerSV.java
* @Description: 校园基本信息批量导入
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Oct 10, 2012 10:48:05 AM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Oct 10, 2012     suntao6           v1.0.0              修改原因
 */
	public void importCmGroupSchoolInfo(String[] colNames, String[] colValues, Map commonInfo) throws Exception;
/**
 * 
* @Function: ICmSchoolInfoBatchManagerSV.java
* @Description: 校园学生信息批量导入
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Oct 10, 2012 3:58:35 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Oct 10, 2012     suntao6           v1.0.0              修改原因
 */
	public void importGsStudInfo(String[] colNames, String[] colValues, Map commonInfo) throws Exception;
/**
 * 
* @Function: ICmSchoolInfoBatchManagerSV.java
* @Description: 建档职员信息批量导入
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Oct 11, 2012 2:16:34 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Oct 11, 2012     suntao6           v1.0.0              修改原因
 */
	public void importGroupMember(String[] colNames, String[] colValues, Map commonInfo) throws Exception;
/**
 * 
* @Function: ICmSchoolInfoBatchManagerSV.java
* @Description: 建档客户批量
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Nov 23, 2012 9:58:30 AM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Nov 23, 2012     suntao6           v1.0.0              修改原因
 */

	public void importGroupArchive(String[] colNames, String[] colValues, Map commonInfo) throws Exception;

}
