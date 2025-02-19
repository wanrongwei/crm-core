package com.asiainfo.crm.cm.service.interfaces;

import com.ai.appframe2.bo.DataContainer;
/**
 * 
* Copyright: Copyright (c) 2012 Asiainfo-Linkage
* 
* @ClassName: ICmGroupArchivesMemberHisSV.java
* @Description: 集团建档客户日志查询
*
* @version: v1.0.0
* @author: suntao6
* @date: Jul 27, 2012 3:47:17 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Jul 27, 2012      suntao6          v1.0.0             修改原因
 */
public interface ICmGroupArchivesMemberHisSV {
/**
 * 
* @Function: ICmGroupArchivesMemberHisSV.java
* @Description: 查找所有建档客户操作日志
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Jul 27, 2012 3:47:55 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Jul 27, 2012     suntao6           v1.0.0              修改原因
 */
	public DataContainer[] queryGroupArchivesMemberHis(String criteria, int startNum, int endNum) throws Exception;
/**
 * 
* @Function: ICmGroupArchivesMemberHisSV.java
* @Description: 查找建档集团与在网集团关系日志
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Oct 11, 2012 8:06:55 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Oct 11, 2012     suntao6           v1.0.0              修改原因
 */
	public DataContainer[] queryGroupInfoRelationH(String criteria, int startNum, int endNum) throws Exception;
/**
 * 
* @Function: ICmGroupArchivesMemberHisSV.java
* @Description: 建档客户日志记录数
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Jul 27, 2012 3:48:40 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Jul 27, 2012     suntao6           v1.0.0              修改原因
 */ 
	public int queryGroupArchivesMemberHisCount(String criteria) throws Exception;
/**
 * 
* @Function: ICmGroupArchivesMemberHisSV.java
* @Description:  查找建档集团与在网集团关系日志数
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Oct 11, 2012 8:07:58 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Oct 11, 2012     suntao6           v1.0.0              修改原因
 */
	public int queryGroupInfoRelationHCount(String criteria) throws Exception;
	
	

}
