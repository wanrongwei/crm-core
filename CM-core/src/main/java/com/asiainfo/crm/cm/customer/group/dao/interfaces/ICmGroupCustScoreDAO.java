/**
 * 
 */
package com.asiainfo.crm.cm.customer.group.dao.interfaces;

import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustScoreValue;

/**   
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: ICmGroupCustScoreDAO.java
 * @Description: 该类的功能描述
 *
 * @version: v1.0.0
 * @author: admin
 * @date: Feb 22, 2011 10:13:42 AM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * Feb 22, 2011     admin           v1.0.0               修改原因
 */
public interface ICmGroupCustScoreDAO {

	/**   
	* @Function: ICmGroupCustScoreDAO.java
	* @Description: 根据groupId检索企业评分信息
	*
	* @param groupId
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: Feb 22, 2011 10:18:02 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Feb 22, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmGroupCustScoreValue[] queryGroupCustScoresByGroupId(long groupId) throws Exception;

	/**   
	* @Function: ICmGroupCustScoreDAO.java
	* @Description: 根据集团ID，年，季度作为查询条件（如果不做条件传入-1）
	*
	* @param groupId
	* @param year
	* @param quarter
	* @return
	* @throws Exception
	*
	* @version: v1.0.0
	* @author: fengjian
	* @date: May 13, 2011 4:04:43 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* May 13, 2011     fengjian           v1.0.0               修改原因
	*/
	public IBOCmGroupCustScoreValue[] queryGroupCustScoresByCondition(long groupId,long year,long quarter) throws Exception;

	/**   
	* @Function: ICmGroupCustScoreDAO.java
	* @Description: 批量保存企业评分信息
	*
	* @param groupCustScores
	* @throws Exception
	* @version: v1.0.0
	* @author: fengjian
	* @date: Feb 22, 2011 10:19:33 AM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Feb 22, 2011     fengjian           v1.0.0               修改原因
	*/
	public void saveGroupCustScores(IBOCmGroupCustScoreValue[] groupCustScores) throws Exception;

}
