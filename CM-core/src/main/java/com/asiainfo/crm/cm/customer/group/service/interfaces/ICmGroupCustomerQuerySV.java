package com.asiainfo.crm.cm.customer.group.service.interfaces;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;

public interface ICmGroupCustomerQuerySV {

	/**
	 * 
	 * @Function: ICmGroupCustomerQuerySV.java
	 * @Description: 该函数的功能描述
	 * 
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 * 
	 * @version: v1.0.0
	 * @author: qiangkz
	 * @date: Nov 1, 2012 2:22:10 PM
	 * 
	 * Modification History: Nov 1, 2012 qiangkz Version Description
	 */
	public DataContainer[] queryPartnerArchives(String criteria, int startNum,
			int endNum) throws Exception;

	/**
	 * 
	 * @Function: ICmGroupCustomerQuerySV.java
	 * @Description: 该函数的功能描述
	 * 
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 * 
	 * @version: v1.0.0
	 * @author: qiangkz
	 * @date: Nov 1, 2012 2:22:14 PM
	 * 
	 * Modification History: Nov 1, 2012 qiangkz Version Description
	 */
	public int queryPartnerArchivesCount(String criteria)throws Exception;
/**
 * 
* @Function: ICmGroupCustomerQuerySV.java
* @Description: 查询集团成员信息
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Nov 9, 2012 2:42:26 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Nov 9, 2012     suntao6           v1.0.0              修改原因
 */
	public DataContainer[] queryGroupMemberInfo(String criteria, int startNum,
			int endNum) throws Exception;
	/**
	 * 
	* @Function: ICmGroupCustomerQuerySV.java
	* @Description: 查询集团成员信息数量
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: suntao6
	* @date: Nov 9, 2012 2:42:26 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Nov 9, 2012     suntao6           v1.0.0              修改原因
	 */
	public int queryGroupMemberInfoCount(String criteria)throws Exception;
	/**
	 * 
	* @Function: ICmGroupCustomerQuerySV.java
	* @Description:查找停机用户信息
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: suntao6
	* @date: Nov 10, 2012 4:32:40 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Nov 10, 2012     suntao6           v1.0.0              修改原因
	 */
	public DataContainer[] queryStopGroupMemberInfo(String criteria, int startNum,
			int endNum) throws Exception;
	/**
	 * 
	* @Function: ICmGroupCustomerQuerySV.java
	* @Description: 该函数的功能描述
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: suntao6
	* @date: Nov 10, 2012 4:33:19 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Nov 10, 2012     suntao6           v1.0.0              修改原因
	 */
	public int queryStopGroupMemberInfoCount(String criteria)throws Exception;

	public int qryGroupCustomerCountByCdn(String criteria) throws Exception;
	public DataContainer[] qryGroupCustomerByCdn(String criteria, int start, int end) throws Exception;
	
	public int queryGMBCountbyCdn(String criteria) throws Exception;
	public DataContainer[] queryGMBbyCdn(String criteria,int startNum,int endNum) throws Exception;
}
