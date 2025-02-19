package com.asiainfo.crm.cm.service.interfaces;

import com.ai.appframe2.bo.DataContainer;
/**
 * 
* Copyright: Copyright (c) 2012 Asiainfo-Linkage
* 
* @ClassName: ICmGroupMultipleSV.java
* @Description: 三跨集团客户信息维护
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 10, 2012 10:27:42 AM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 10, 2012      suntao6          v1.0.0             修改原因
 */
public interface ICmGroupMultipleSV {
/**
 * 
* @Function: ICmGroupMultipleSV.java
* @Description: 三跨集团信息查询
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 10, 2012 10:28:18 AM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 10, 2012     suntao6           v1.0.0              修改原因
 */
	public DataContainer[] queryGroupMultiple(String criteria, int startNum, int endNum) throws Exception;
/**
 * 
* @Function: ICmGroupMultipleSV.java
* @Description: 三跨集团信息数
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 10, 2012 10:31:48 AM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 10, 2012     suntao6           v1.0.0              修改原因
 */
	public int queryGroupMultipleCount(String criteria) throws Exception;
/**
 * 
* @Function: ICmGroupMultipleSV.java
* @Description: 保存三跨集团信息
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 10, 2012 10:32:17 AM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 10, 2012     suntao6           v1.0.0              修改原因
 */
	public void saveGroupMultiple(DataContainer[] values) throws Exception; 
	
/**
* @Function: ICmGroupMultipleSV.java
* @Description: 查找三跨集团与建档集团关联数据
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 17, 2012 2:29:43 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 17, 2012     suntao6           v1.0.0              修改原因
 */	
	public DataContainer[] queryGroupMulArchives(String criteria, int startNum, int endNum) throws Exception;
/**
* @Function: ICmGroupMultipleSV.java
* @Description: 查找三跨集团与建档集团关联数据条数
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 17, 2012 2:30:59 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 17, 2012     suntao6           v1.0.0              修改原因
 */
	public int queryGroupMulArchivesCount(String criteria) throws Exception;
/**
 * 
* @Function: ICmGroupMultipleSV.java
* @Description: 该方法用于对三跨集团客户与建档集团客户进行维护。
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 20, 2012 9:46:04 AM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 20, 2012     suntao6           v1.0.0              修改原因
 */
	public void saveGroupMtparchRela(DataContainer[] values) throws Exception; 
   /**
    * 
   * @Function: ICmGroupMultipleSV.java
   * @Description:查找三跨集团地市信息
   *
   * @param:参数描述
   * @return：返回结果描述
   * @throws：异常描述
   *
   * @version: v1.0.0
   * @author: suntao6
   * @date: Aug 22, 2012 3:56:14 PM 
   *
   * Modification History:
   * Date         Author          Version            Description
   *---------------------------------------------------------*
   * Aug 22, 2012     suntao6           v1.0.0              修改原因
    */
	public DataContainer[] queryGroupMultipleDtl(String criteria) throws Exception;
	/**
	 * 
	* @Function: ICmGroupMultipleSV.java
	* @Description:根据三跨集团集团编码和建档集团编码查找出二者的关系数量
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: suntao6
	* @date: Dec 4, 2012 9:13:44 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Dec 4, 2012     suntao6           v1.0.0              修改原因
	 */
	public int checkGroupMtparchRela(String groupMtpId,String groupSeq) throws Exception;
	
}
