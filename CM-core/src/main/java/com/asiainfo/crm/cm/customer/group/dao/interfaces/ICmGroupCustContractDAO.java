/**
 * 
 */
package com.asiainfo.crm.cm.customer.group.dao.interfaces;

import java.util.Map;

import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustContractValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IQBOCmQueryContractValue;

/**   
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: ICmGroupCustContractDAO.java
 * @Description: 该类的功能描述
 *
 * @version: v1.0.0
 * @author: huzq2
 * @date: Mar 9, 2011 8:14:50 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * Mar 9, 2011		huzq2           v1.0.0               修改原因
 */

public interface ICmGroupCustContractDAO
{

	public long getNewId() throws Exception;

	/**   
	 * @Function: ICmGroupCustContractDAO.java
	 * @Description: 根据集团编号查询集团合同信息
	 *
	 * @param groupCustId 集团客户编号
	 * @return IBOCmGroupCustContractValue[] 集团合同信息列表
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Mar 9, 2011 8:15:58 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 9, 2011     huzq2           v1.0.0               修改原因
	 */
	public IBOCmGroupCustContractValue[] queryGroupCustContractsByGroupId(long groupCustId, int startNum, int endNum)
			throws Exception;

	/**   
	 * @Function: ICmGroupCustContractDAO.java
	 * @Description: 保存集团合同信息
	 *
	 * @param groupCustContractValues
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Mar 9, 2011 8:16:20 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Mar 9, 2011     huzq2           v1.0.0               修改原因
	 */
	public void saveGroupCustContracts(IBOCmGroupCustContractValue[] groupCustContractValues) throws Exception;

	/**   
	* @Function: ICmGroupCustContractDAO.java
	* @Description: 根据合同SEQ查询合同
	*
	* @param contractSequenceNo
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: admin
	* @date: Apr 6, 2011 4:29:04 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Apr 6, 2011     admin           v1.0.0               修改原因
	*/
	public IBOCmGroupCustContractValue queryGroupCustContractByContractSequenceNo(String contractSequenceNo) throws Exception;
	
	/**   
	* @Function: ICmGroupCustContractDAO.java
	* @Description: 传入日期字符串example：2011-03-12，返回数据库中当天最大合同SEQ
	*
	* @param dateStr
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: admin
	* @date: Mar 19, 2011 10:51:17 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 19, 2011     fengjian           v1.0.0               修改原因
	*/
	public String getMaxSEQ(String dateStr,int custLevel) throws Exception;

	/**   
	* @Function: ICmGroupCustContractDAO.java
	* @Description: 根据集团编号查询集团合同信息
	*
	* @param groupCustContractValue
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 19, 2011 11:19:28 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 19, 2011     fengjian           v1.0.0               修改原因
	*/
	public void saveGroupCustContract(IBOCmGroupCustContractValue groupCustContractValue) throws Exception;

	/**   
	* @Function: ICmGroupCustContractDAO.java
	* @Description: 根据集团编号查询集团合同信息数量
	*
	* @param groupCustId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 20, 2011 11:29:20 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 20, 2011     fengjian           v1.0.0               修改原因
	*/
	public int queryGroupCustContractsCountByGroupId(long groupCustId) throws Exception;
	
	/**   
	* @Function: ICmGroupCustContractDAO.java
	* @Description: 根据集团合同编号查询集团合同
	*
	* @param contractId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 21, 2011 9:30:56 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 21, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmGroupCustContractValue queryGroupCustContractByContractId(long contractId) throws Exception;
	
	/**   
	* @Function: ICmGroupCustContractDAO.java
	* @Description: 取得集团合同（分页）
	*
	* @param condition
	* @param parameter
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 31, 2011 1:08:18 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 31, 2011     fengjian           v1.0.0               修改原因
	*/
	public IQBOCmQueryContractValue[] queryGroupCustContract(String condition,Map parameter,int start,int end)  throws Exception;
	
	/**   
	* @Function: ICmGroupCustContractDAO.java
	* @Description: 取得集团合同数量
	*
	* @param condition
	* @param parameter
	* @param start
	* @param end
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Mar 31, 2011 1:08:21 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Mar 31, 2011     fengjian           v1.0.0               修改原因
	*/
	public int queryGroupCustContractCount(String condition,Map parameter)  throws Exception;
}
