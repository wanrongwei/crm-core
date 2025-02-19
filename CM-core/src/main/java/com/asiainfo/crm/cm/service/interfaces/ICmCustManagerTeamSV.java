package com.asiainfo.crm.cm.service.interfaces;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.common.ivalues.IBOCustManagerTeamRelValue;
import com.asiainfo.crm.cm.inner.manager.ivalues.IBOCmCustManagerTeamValue;

/**
 * 
* Copyright: Copyright (c) 2012 Asiainfo-Linkage
* 
* @ClassName: ICmCustManagerTeamSV.java
* @Description: 电话经理组管理
*
* @version: v1.0.0
* @author: suntao6
* @date: Sep 24, 2012 5:01:43 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Sep 24, 2012      suntao6          v1.0.0             修改原因
 */
public interface ICmCustManagerTeamSV {
/**
 * 
* @Function: ICmCustManagerTeamSV.java
* @Description: 查询方法
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Sep 24, 2012 5:02:26 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Sep 24, 2012     suntao6           v1.0.0              修改原因
 */
	public DataContainer[] queryCmCustManagerTeam(String criteria, int startNum, int endNum) throws Exception;
	public IBOCmCustManagerTeamValue queryCmCustManagerTeam(long managerId, int startNum, int endNum) throws Exception;
/**
 * 
* @Function: ICmCustManagerTeamSV.java
* @Description: 查找记录数
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Sep 24, 2012 5:02:43 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Sep 24, 2012     suntao6           v1.0.0              修改原因
 */
    
	public int queryCmCustManagerTeamCount(String criteria) throws Exception;
/**
 * 
* @Function: ICmCustManagerTeamSV.java
* @Description: 保存
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Sep 24, 2012 5:03:06 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Sep 24, 2012     suntao6           v1.0.0              修改原因
 */
	public void saveCmCustManagerTeam(DataContainer[] values) throws Exception; 
/**
 * 
* @Function: ICmCustManagerTeamSV.java
* @Description: 保存电话经理和电话经理联系人信息
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Sep 26, 2012 4:19:22 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Sep 26, 2012     suntao6           v1.0.0              修改原因
 */
	public void saveCmCustManagerTeamRel(DataContainer[] values) throws Exception;
/**
 * 
* @Function: ICmCustManagerTeamSV.java
* @Description: 查找电话经理与电话经理组关系
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Sep 26, 2012 2:08:16 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Sep 26, 2012     suntao6           v1.0.0              修改原因
 */
	public DataContainer[] queryCustManagerTeamRel(String criteria, int startNum, int endNum) throws Exception;
/**
 * 
* @Function: ICmCustManagerTeamSV.java
* @Description: 查找电话经理与电话经理组关系数量
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Sep 26, 2012 2:10:13 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Sep 26, 2012     suntao6           v1.0.0              修改原因
 */
	public int queryCustManagerTeamRelCount(String criteria) throws Exception;
/**
 * 
* @Function: ICmCustManagerTeamSV.java
* @Description: 根据电话经理组ID查找对应的电话经理人信息
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Oct 9, 2012 3:40:18 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Oct 9, 2012     suntao6           v1.0.0              修改原因
 */
	public IBOCustManagerTeamRelValue[] queryCmCustManagerTeamRelByTeamId(long teamId) throws Exception;
/**
 * 
* @Function: ICmCustManagerTeamSV.java
* @Description: 查找是否
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Oct 9, 2012 8:02:46 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Oct 9, 2012     suntao6           v1.0.0              修改原因
 */
	public IBOCmCustManagerTeamValue[]  queryCmCustManagerTeamByParentId(long teamId) throws Exception;

	
	/**
	 * 
	* @Function: queryCmCustManagerTeamRelByManagerId
	* @Description: 根据电话经理人编码查询对应的电话经理编码信息
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author:
	* @date: Oct 11, 2012 3:40:18 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 
	 */
	public IBOCustManagerTeamRelValue[] queryCmCustManagerTeamRelByManagerId(long managerId) throws Exception;
	
	public IBOCmCustManagerTeamValue[] queryCmCustManagerTeamByTeamId(long teamId) throws Exception;
	public IBOCustManagerTeamRelValue[] queryCmCustManagerTeamRelByCdn(long teamId,long managerId) throws Exception;
}
