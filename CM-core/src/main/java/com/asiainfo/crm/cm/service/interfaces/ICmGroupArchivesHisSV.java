package com.asiainfo.crm.cm.service.interfaces;

import com.ai.appframe2.bo.DataContainer;
/**
 * 
* Copyright: Copyright (c) 2012 Asiainfo-Linkage
* 
* @ClassName: ICmGroupArchivesHisSV.java
* @Description: 集团建档操作日志查询
*
* @version: v1.0.0
* @author: suntao6
* @date: Jul 26, 2012 2:27:41 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Jul 26, 2012      suntao6          v1.0.0             修改原因
 */
public interface ICmGroupArchivesHisSV {
/**
 * 
* @Function: ICmGroupArchivesHisSV.java
* @Description: 查询集团建档日志
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Jul 26, 2012 2:28:02 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Jul 26, 2012     suntao6           v1.0.0              修改原因
 */
	public DataContainer[] queryGroupArchivesHis(String criteria, int startNum, int endNum) throws Exception;
    
/**
 * 
* @Function: ICmGroupArchivesHisSV.java
* @Description: 集团建档操作日志数量
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Jul 26, 2012 2:28:39 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Jul 26, 2012     suntao6           v1.0.0              修改原因
 */
	public int queryGroupArchivesHisCount(String criteria) throws Exception;
/**
 * 
* @Function: ICmGroupArchivesHisSV.java
* @Description: 保存一条操作日志信息
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 7, 2012 11:20:46 AM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 7, 2012     suntao6           v1.0.0              修改原因
 */
	public void saveGroupArchivesHis(DataContainer[] values) throws Exception;
}
