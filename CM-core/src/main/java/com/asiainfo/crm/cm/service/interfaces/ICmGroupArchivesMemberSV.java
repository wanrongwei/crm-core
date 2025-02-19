package com.asiainfo.crm.cm.service.interfaces;

import com.ai.appframe2.bo.DataContainer;

/**
 * 
* Copyright: Copyright (c) 2012 Asiainfo-Linkage
* 
* @ClassName: ICmGroupArchivesMemberSV.java
* @Description:集团建档职员管理
*
* @version: v1.0.0
* @author: suntao6
* @date: Jul 24, 2012 2:43:58 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Jul 24, 2012      suntao6          v1.0.0             修改原因
 */
public interface ICmGroupArchivesMemberSV {
/**
 * 
* @Function: ICmGroupArchivesMemberSV.java
* @Description: 集团建档职员查找
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Jul 24, 2012 2:49:57 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Jul 24, 2012     suntao6           v1.0.0              修改原因
 */
	public DataContainer[] queryGroupArchivesMember(String criteria, int startNum, int endNum) throws Exception;
/**
 * 
* @Function: ICmGroupArchivesMemberSV.java
* @Description: 集团建档职员总数
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Jul 24, 2012 2:52:32 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Jul 24, 2012     suntao6           v1.0.0              修改原因
 */      
	public int queryGroupArchivesMemberCount(String criteria) throws Exception;
/**
 * 
* @Function: ICmGroupArchivesMemberSV.java
* @Description: 保存集团建档职员
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Jul 24, 2012 2:53:52 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Jul 24, 2012     suntao6           v1.0.0              修改原因
 */
	public void saveGroupArchivesMember(DataContainer[] values) throws Exception; 
}
