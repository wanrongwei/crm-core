/**
 * 
 */
package com.asiainfo.crm.cm.teaminvoke.out.dao.interfaces;

import com.asiainfo.crm.cm.inner.contact.ivalues.IBOCmContactValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmIndivCustAndContactValue;

/**   
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: ICmIndivCustAndContactDAO.java
 * @Description: 个人客户和联系人DAO接口
 *
 * @version: v1.0.0
 * @author: niwei
 * @date: Feb 22, 2011 4:56:03 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * Feb 22, 2011		niwei           v1.0.0               修改原因
 */
public interface ICmIndivCustAndContactDAO
{
	/**   
	 * @Function: ICmIndivCustAndContactDAO.java
	 * @Description: 根据个人客户id查询个人客户和主要联系人信息
	 *
	 * @param indivCustId 个人客户id
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: niwei
	 * @date: Feb 22, 2011 4:56:13 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Feb 22, 2011     niwei           v1.0.0               修改原因
	 */
	public IQBOCmIndivCustAndContactValue queryIndivCustAndContactById(long indivCustId) throws Exception;

	/**   
	 * @Function: ICmIndivCustAndContactDAO.java
	 * @Description: 保存个人
	 *
	 * @param indivCustId 个人客户id
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: niwei
	 * @date: Feb 22, 2011 4:56:13 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Feb 22, 2011     niwei           v1.0.0               修改原因
	 */
	public void saveContactValue(IBOCmContactValue contactValue) throws Exception;
	/**   
	 * @Function: ICmIndivCustAndContactDAO.java
	 * @Description: 去新的主键
	 *
	 * @param indivCustId 个人客户id
	 * @return
	 * @throws Exception
	 *
	 * @version: v1.0.0
	 * @author: niwei
	 * @date: Feb 22, 2011 4:56:13 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Feb 22, 2011     niwei           v1.0.0               修改原因
	 */
	public long getNewId() throws Exception;
}
