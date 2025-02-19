package com.asiainfo.crm.cm.customer.group.dao.interfaces;

import java.rmi.RemoteException;

import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustAttrValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupRelIndustryValue;

public interface ICmGroupCustAttrDAO
{
	/**   
	 * @Function: ICmGroupCustAttrDAO.java
	 * @Description: 根据集团编号查询集团扩展属性
	 *
	 * @param groupCustId
	 * @return IBOCmGroupCustAttrValue[]
	 * @throws Exception
	 * @throws RemoteException
	 * @version: v1.0.0
	 * @author: fengjian
	 * @date: Jan 10, 2011 11:55:53 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 10, 2011     fengjian           v1.0.0               修改原因
	 */
	public IBOCmGroupCustAttrValue[] queryGroupCustAttrsByGroupId(long groupCustId)  throws Exception;

	/**   
	 * @Function: ICmGroupCustAttrDAO.java
	 * @Description: 批量保存集团扩展属性
	 *
	 * @param cmGroupCustAttrs
	 * @throws Exception
	 * @throws RemoteException
	 * @version: v1.0.0
	 * @author: fengjian
	 * @date: Jan 10, 2011 11:55:53 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 10, 2011     fengjian           v1.0.0               修改原因
	 */
	public void saveGroupCustAttr(IBOCmGroupCustAttrValue[] cmGroupCustAttrs) throws Exception;

	/**   
	 * @Function: ICmGroupCustAttrDAO.java
	 * @Description: 批量保存集团扩展属性
	 *
	 * @param cmGroupCustAttr
	 * @throws Exception
	 * @throws RemoteException
	 * @version: v1.0.0
	 * @author: fengjian
	 * @date: Jan 10, 2011 11:55:53 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * Jan 10, 2011     fengjian           v1.0.0               修改原因
	 */
	public void saveGroupCustAttr(IBOCmGroupCustAttrValue cmGroupCustAttr) throws Exception;
	
	/**   
	 * @Function queryGroupCustAttr
	 * @Description 
	 *
	 * @param groupCustId
	 * @param attrCode
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Feb 14, 2014 11:25:06 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 14, 2014     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupCustAttrValue queryGroupCustAttr(long groupCustId,String attrCode)  throws Exception;
	
	/**   
	* @Function: saveGroupRelIndustry
	* @Description: 保存集团客户的行业
	*
	* @return
	* @throws Exception
	* @throws RemoteException
	*
	* @version: v1.0.0
	* @author: zhuyy
	* @date:Sept 1, 2014 17:10:44 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Sept 1, 2014    zhuyy           v1.0.0               修改原因
	*/
	public void saveGroupRelIndustry(IBOCmGroupRelIndustryValue[] cmGroupRelIndustry) throws Exception;
}
