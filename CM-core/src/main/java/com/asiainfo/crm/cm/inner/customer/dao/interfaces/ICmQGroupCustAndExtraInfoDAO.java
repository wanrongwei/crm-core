package com.asiainfo.crm.cm.inner.customer.dao.interfaces;

import java.util.Map;

import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmGroupCustAndExtraInfoValue;

/**   
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: ICmQGroupCustAndExtraInfoDAO.java
 * @Description: 该类的功能描述
 *
 * @version: v1.0.0
 * @author: huzq2
 * @date: Jan 12, 2011 2:01:07 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * Jan 12, 2011		huzq2           v1.0.0               修改原因
 */
public interface ICmQGroupCustAndExtraInfoDAO
{

	/**   
	 * @Function: ICmGrouCustomerDAO.java
	 * @Description: 查询集团客户基本信息和附属信息
	 *
	 * @param dataContainer
	 * @param startIndex
	 * @param endIndex
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: Jan 10, 2011 11:46:25 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 10, 2011     huzq2           v1.0.0               修改原因
	 */
	public IQBOCmGroupCustAndExtraInfoValue[] queryGroupCustAndExtraInfo(DataContainerInterface dataContainer,
			int startIndex, int endIndex) throws Exception;

	public int queryGroupCustAndExtraInfoCount(String string, Map parameters) throws Exception;

	public IQBOCmGroupCustAndExtraInfoValue[] queryGroupCustAndExtraInfos(String string, Map parameters,
			int startIndex, int endIndex) throws Exception;

}
