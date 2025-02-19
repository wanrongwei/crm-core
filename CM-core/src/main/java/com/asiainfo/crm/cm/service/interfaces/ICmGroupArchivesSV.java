package com.asiainfo.crm.cm.service.interfaces;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.common.ivalues.IBOGroupArchivesValue;

/**
 * 
* Copyright: Copyright (c) 2012 Asiainfo-Linkage
* 
* @ClassName: ICmGroupArchivesSV.java
* @Description:集团建档管理
*
* @version: v1.0.0
* @author: suntao6
* @date: Jul 19, 2012 8:38:38 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Jul 19, 2012      suntao6          v1.0.0             修改原因
 */
public interface ICmGroupArchivesSV {
    /**
     * 
    * @Function: ICmGroupArchivesSV.java
    * @Description: 查询
    *
    * @param:参数描述
    * @return：返回结果描述
    * @throws：异常描述
    *
    * @version: v1.0.0
    * @author: suntao6
    * @date: Jul 19, 2012 8:40:31 PM 
    *
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * Jul 19, 2012     suntao6           v1.0.0              修改原因
     */
	public DataContainer[] queryGroupArchives(String criteria, int startNum, int endNum) throws Exception;
    /**
     * 
    * @Function: ICmGroupArchivesSV.java
    * @Description: 记录数
    *
    * @param:参数描述
    * @return：返回结果描述
    * @throws：异常描述
    *
    * @version: v1.0.0
    * @author: suntao6
    * @date: Jul 19, 2012 8:40:58 PM 
    *
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * Jul 19, 2012     suntao6           v1.0.0              修改原因
     */
    
	public int queryGroupArchivesCount(String criteria) throws Exception;
    /**
     * 
    * @Function: ICmGroupArchivesSV.java
    * @Description: 保存
    *
    * @param:参数描述
    * @return：返回结果描述
    * @throws：异常描述
    *
    * @version: v1.0.0
    * @author: suntao6
    * @date: Jul 19, 2012 8:42:29 PM 
    *
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * Jul 19, 2012     suntao6           v1.0.0              修改原因
     */
	public void saveGroupArchives(DataContainer[] values) throws Exception; 
	/**
	 * 
	* @Function: ICmGroupArchivesSV.java
	* @Description: 根据建档集团编码查询建档集团信息
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: suntao6
	* @date: Dec 5, 2012 3:38:56 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Dec 5, 2012     suntao6           v1.0.0              修改原因
	 */
	public IBOGroupArchivesValue[] getGroupArchivesByGroupSeq(String groupSeq)throws Exception;
	
	/**
	 * 
	* @Function: ICmGroupArchivesSV.java
	* @Description: 查询是否存在建档信息
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: guansj
	* @date: 2013-1-4 下午05:43:44 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2013-1-4      guansj           v1.0.0              修改原因
	 */
	public boolean queryGroupArchivesById(String groupSeq)throws Exception;
}
